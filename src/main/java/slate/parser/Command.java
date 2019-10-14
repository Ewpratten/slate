package slate.parser;

import org.antlr.v4.runtime.ParserRuleContext;
import slate.App;
import slate.Inventory;
import slate.bases.RoomBase;
import slate.exceptions.ItemNotFoundException;
import slate.exceptions.ItemSizeException;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;

//Command Object
public class Command{

    //Reading in Command Usage Data
    static File file;
    static byte[] data;
    static String[] usageContent;
    static HashMap<Integer, String> usagesMap = new HashMap<Integer, String>();
    public App game;

    static {
        try {
            //Get file from res folder
            file = new File(Commands.class.getResource("../../commands/CommandUsage.slateinfo").toURI());

            //Place all bytes into array
            data = Files.readAllBytes(file.toPath());

            //Create an array of lines from byte array
            usageContent = new String(data, "UTF-8").split("\\r?\\n");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        usagesMap.put(SlateParser.HELP, usageContent[3]);
        usagesMap.put(SlateParser.SAY, usageContent[6]);
        usagesMap.put(SlateParser.SHOUT, usageContent[9]);
        usagesMap.put(SlateParser.PICKUP, usageContent[12]);
        usagesMap.put(SlateParser.LEAVE, usageContent[17]);
        usagesMap.put(SlateParser.CHECKDOORS, usageContent[21]);
        usagesMap.put(SlateParser.PEEK, usageContent[23]);
        usagesMap.put(SlateParser.MOVE, usageContent[26]);
        usagesMap.put(SlateParser.SEARCH, usageContent[29]);
        usagesMap.put(SlateParser.OPEN, usageContent[32]);
        usagesMap.put(SlateParser.CLOSE, usageContent[35]);
        usagesMap.put(SlateParser.EXIT,  usageContent[38]);
    }

    int type;
    private ParserRuleContext context;
    SlateParser parser;
    SlateBaseVisitor visitor = new SlateBaseVisitor();

    //Constructor
    Command(int type,  ParserRuleContext context, SlateParser parser) {
        this.type = type;
        this.context = context;
        this.parser = parser;
    }

    //Validate User Input
    public boolean validate(){

        //If Valid Command, check syntax
        if(context!=null) {
            visitor.visit(context);

            //Returns true if no errors found
            if (context.exception == null){
                return true;
            }
            //Display Error Message
            System.out.printf("Bad Syntax, %s\n", usagesMap.get(type));
            return false;
        }
        //Display Error Message
        System.out.println("Hmm... I don't know how to do that. For a list of commands and their usages, I should type help.");
        return false;
    }

    public void execute(){

        //Link type to commands
        HashMap<Integer, CommInterface> commandMap = new HashMap<Integer, CommInterface>();

        commandMap.put(SlateParser.PICKUP, new PickupCommand((context.getToken(SlateParser.TEXT,0))!=null?(context.getToken(SlateParser.TEXT,0).getText()):null));
        commandMap.put(SlateParser.LEAVE, new LeaveCommand((context.getToken(SlateParser.TEXT,0))!=null?(context.getToken(SlateParser.TEXT,0).getText()):null));
        commandMap.put(SlateParser.SAY, new SayCommand((context.getToken(SlateParser.TEXT,0))!=null?(context.getToken(SlateParser.TEXT,0)).getText():null));
        commandMap.put(SlateParser.SHOUT, new ShoutCommand((context.getToken(SlateParser.TEXT,0))!=null?(context.getToken(SlateParser.TEXT,0)).getText():null));
        commandMap.put(SlateParser.MOVE, new MoveCommand((context.getToken(SlateParser.TEXT,0))!=null?(context.getToken(SlateParser.TEXT,0)).getText():null));
        commandMap.put(SlateParser.PEEK, new PeekCommand((context.getToken(SlateParser.TEXT,0))!=null?(context.getToken(SlateParser.TEXT,0)).getText():null));
        commandMap.put(SlateParser.OPEN, new OpenCommand((context.getToken(SlateParser.TEXT,0))!=null?(context.getToken(SlateParser.TEXT,0)).getText():null));
        commandMap.put(SlateParser.CHECKDOORS, new CheckDoorsCommand(null));
        commandMap.put(SlateParser.SEARCH, new SearchCommand(null));
        commandMap.put(SlateParser.CLOSE, new CloseCommand(null));
        commandMap.put(SlateParser.HELP, new HelpCommand(null));
        commandMap.put(SlateParser.EXIT, new ExitCommand(null));

        CommInterface command = commandMap.get(type);

        //Check returns data value if data required, otherwise returns "".
        if(command.getData()!=null)command.execute();
    }

    void printUsage(){

    }

    public ParserRuleContext getContext(){
        return context;
    }

    //Command Interface
    interface CommInterface{

        //All Commands Must have an Execute Method
        public void execute();
        public Object getData();
    }

    //SAY
    class SayCommand implements CommInterface{

        String data;

        SayCommand(String data){
            this.data = data;
        }

        @Override
        public void execute(){

            //Strip quotes from message
            String message = (data);

            //Print message
            System.out.println(message);
        }

        @Override
        public Object getData(){
            return data;
        }
    }

    //SHOUT
    class ShoutCommand implements CommInterface{

        String data;

        ShoutCommand(String data){
            this.data = data;
        }

        @Override
        public void execute(){

            //Strip quotes from message
            String message = (data).toUpperCase();

            //Print message
            System.out.println(message);
        }

        @Override
        public Object getData(){
            return data;
        }

    }

    //PICK UP ITEM
    class PickupCommand implements CommInterface{

        String data;

        PickupCommand(String data){
            this.data = data;
        }

        @Override
        public void execute() {
            if (game.player.getFocused_inventory()!=game.player.getInventory()) {
                Inventory.Stack[] itemInfo = game.player.getFocused_inventory().getAllNames();
                String itemName = data.substring(data.indexOf(" ") + 1);

                int quantity;
                try {
                    quantity = Integer.parseInt(data.substring(0, data.indexOf(" ")));
                } catch (NumberFormatException e) {
                    quantity = 1;
                    itemName = data;
                }

                for (Inventory.Stack item : itemInfo) {
                    if (item.name.equalsIgnoreCase(itemName)) {

                        //Transfer items

                        int numTaken = 0;
                        for (int i = 0; i < quantity; i++) {
                            if (item.count > 0) {
                                item.count -= 1;
                                try {
                                    game.player.getInventory().addItem(item.name, game.player.getFocused_inventory().getItem(item.name));
                                } catch (ItemSizeException e) {
                                    if(numTaken>0){
                                        System.out.println("There isn't enough room in my pockets, so I take " + numTaken + " instead.");
                                        return;
                                    }
                                    System.out.println("There's no space left in my pockets!");
                                } catch (ItemNotFoundException e) {
                                    e.printStackTrace();
                                }

                                numTaken++;
                            } else {
                                System.out.println("There isn't enough of these, so I take " + numTaken + " instead.");
                                return;
                            }
                        }
                        System.out.println("I take " + quantity + " " + itemName + ".");
                        return;
                    }
                }
                System.out.println("I can't find any of those in here...");
                return;
            }
            System.out.println("I can't take things from myself!");
        }

        @Override
        public Object getData(){
            return data;
        }

    }

    //LEAVE ITEM
    class LeaveCommand implements CommInterface{

        String data;

        LeaveCommand(String data){
            this.data = data;
        }

        @Override
        public void execute() {
            Inventory target = game.current_map.nav.getCurrentRoom().getRoot_inventory();

            if (game.player.getFocused_inventory()!=game.player.getInventory()) {
                target = game.player.getFocused_inventory();
            }

            //Put items into focused inventory
            Inventory.Stack[] itemInfo = game.player.getInventory().getAllNames();
            String itemName = data.substring(data.indexOf(" ") + 1);

            int quantity;
            try {
                quantity = Integer.parseInt(data.substring(0, data.indexOf(" ")));
            } catch (NumberFormatException e) {
                quantity = 1;
                itemName = data;
            }

            for (Inventory.Stack item : itemInfo) {
                if (item.name.equalsIgnoreCase(itemName)) {

                    //Transfer items

                    int numPut = 0;
                    for (int i = 0; i < quantity; i++) {
                        if (item.count > 0) {
                            item.count -= 1;
                            try {
                                target.addItem(item.name, game.player.getInventory().getItem(item.name));
                            } catch (ItemSizeException e) {
                                if(numPut>0){
                                    System.out.println("There's not enough space inside the " + target.getName() +", so I leave "+ numPut +" instead.");
                                    return;
                                }
                                System.out.println("There's no space inside the " + target.getName() +" to put this...");
                                return;
                            } catch (ItemNotFoundException e) {
                                e.printStackTrace();
                            }

                            numPut++;
                        } else {
                            System.out.println("I don't have enough of these, so I leave " + numPut + " instead.");
                            return;
                        }
                    }
                    System.out.println("I leave " + quantity + " " + itemName + ".");
                    return;
                }
            }

            System.out.println("I can't find any of those in my pockets...");
        }

        @Override
        public Object getData(){
            return data;
        }

    }

    //PRINT HELP
    class HelpCommand implements CommInterface{

        String data;

        HelpCommand(String data){
            this.data = data;
        }

        @Override
        public void execute(){

            //Print help
           for(int i = 0; i < usageContent.length; i++){
               System.out.println(usageContent[i]);
           }
        }

        @Override
        public Object getData(){
            return "";
        }
    }

    //SEARCH ROOM
    class SearchCommand implements CommInterface{

        String data;

        SearchCommand(String data){
            this.data = data;
        }

        @Override
        public void execute(){

            //Search Room
            if(game.player.getFocused_inventory() == game.current_map.nav.getCurrentRoom().getRoot_inventory()) {

                //Items
                Inventory.Stack[] items = game.player.getFocused_inventory().getAllNames();
                if (items.length > 0) {
                    System.out.printf("After a quick search of the room, I find the following %d item%s:\n", items.length, items.length > 1 ? "s" : "");
                    for (Inventory.Stack item : items) {
                        System.out.println(String.format("- %s x%d", item.name, item.count));
                    }
                }

                ArrayList<Inventory> inventories = game.current_map.nav.getCurrentRoom().getInventories();
                //Get Open Inventories
                if (inventories.size() > 0) {
                    System.out.printf("I find %d container%s:\n", inventories.size(), inventories.size() > 1 ? "s" : "");
                    for (Inventory inv : inventories) {
                        System.out.println("- " + inv.getName());
                    }
                }
            }else{
                //Search container

                //Items
                Inventory.Stack[] items = game.player.getFocused_inventory().getAllNames();
                if (items.length > 0) {
                    System.out.printf("Rummaging through the %s, I find the following %d item%s:\n", game.player.getFocused_inventory().getName(), items.length, items.length > 1 ? "s" : "");
                    for (Inventory.Stack item : items) {
                        System.out.println(String.format("- %s x%d", item.name, item.count));
                    }
                }
            }
        }

        @Override
        public Object getData(){
            return "";
        }
    }

    //MOVE
    class MoveCommand implements CommInterface{

        String data;

        MoveCommand(String data){
            this.data = data;
        }

        @Override
        public void execute(){

            //Check for room
            for(RoomBase r: game.current_map.nav.getCurrentRoom().getAttached_rooms()){

                //Go to correct room
                if(r.getName().equalsIgnoreCase(data)){
                    game.current_map.nav.moveTo(r);

                    //Set focused inventory to room default
                    game.player.setFocused_inventory(game.current_map.nav.getCurrentRoom().getRoot_inventory());
                }
                return;
            }
            System.out.println("There's no access to that room from here...");
        }

        @Override
        public Object getData(){
           return data;
        }
    }

    //PEEK
    class PeekCommand implements CommInterface{

        String data;

        PeekCommand(String data){
            this.data = data;
        }

        @Override
        public void execute(){

            //Check for room
            for(RoomBase r: game.current_map.nav.getCurrentRoom().getAttached_rooms()){

                //Peek correct room
                if(r.getName().equalsIgnoreCase(data))System.out.println(r.getPeekInfo());
                return;
            }
            System.out.println("There's no access to that room from here...");
        }

        @Override
        public Object getData(){
            return data;
        }
    }

    //CHECK DOORS
    class CheckDoorsCommand implements CommInterface{

        String data;

        CheckDoorsCommand(String data){
            this.data = data;
        }

        @Override
        public void execute(){

            ArrayList<RoomBase> rooms = game.current_map.nav.getCurrentRoom().getAttached_rooms();

           //Check for rooms attached to current room
            System.out.printf("I look around the room and see %d door%s:\n", rooms.size(), rooms.size()>1?"s":"");
            for(RoomBase r: rooms) {
                System.out.println("- " + r.getName());
            }
         }


        @Override
        public Object getData(){
            return "";
        }
    }

    //OPEN INVENTORY
    class OpenCommand implements CommInterface{
        String data;

        OpenCommand(String data){
            this.data = data;
        }

        @Override
        public void execute(){
            ArrayList<Inventory> inventories = game.current_map.nav.getCurrentRoom().getInventories();
            //Check if input matches
            for(Inventory inventory : inventories){
                if(inventory.getName().equalsIgnoreCase(data)){

                    //Set focus to targeted inventory
                    System.out.println("I open up the " + inventory.getName());
                    game.player.setFocused_inventory(inventory);
                    return;
                }
            }

            if(data.equalsIgnoreCase("Pockets")){

                //Set focus to targeted inventory
                System.out.println("I open up my pockets.");
                game.player.setFocused_inventory(game.player.getInventory());
                return;
            }

            System.out.println("I can't find that container, maybe I just imagined it...");

        }


        @Override
        public Object getData(){
            return data;
        }
    }

    //CLOSE INVENTORY
    class CloseCommand implements CommInterface{

        String data;

        CloseCommand(String data){
            this.data = data;
        }

        @Override
        public void execute(){

            if(game.player.getFocused_inventory()!=game.current_map.nav.getCurrentRoom().getRoot_inventory()) {

                //Close Focused Inventory
                System.out.println("I close the " + game.player.getFocused_inventory().getName());
                game.player.setFocused_inventory(game.current_map.nav.getCurrentRoom().getRoot_inventory());
            }else{
                System.out.println("I haven't left anything open...");
            }
        }

        @Override
        public Object getData(){
            return "";
        }
    }

    //EXIT GAME
    class ExitCommand implements CommInterface{

        String data;

        ExitCommand(String data){
            this.data = data;
        }

        @Override
        public void execute(){

            //Exit
            System.out.println("You are a terrible person.");
            System.exit(0);
        }

        @Override
        public Object getData(){
            return "";
        }
    }
}
