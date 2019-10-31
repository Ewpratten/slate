package slate.parser;

import org.antlr.v4.runtime.ParserRuleContext;
import slate.App;
import slate.Inventory;
import slate.Room;
import slate.bases.ItemBase;
import slate.exceptions.ItemNotFoundException;
import slate.exceptions.ItemSizeException;
import slate.maps.TestMap;
import slate.parser.antlrgen.SlateBaseVisitor;
import slate.parser.antlrgen.SlateParser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

//Command Object
public class Command{

    //Reading in Command Usage Data
    static byte[] data;
    static String[] usageContent;
    static HashMap<Integer, String> usagesMap = new HashMap<Integer, String>();
    public App game;

    static {
        try {

            //Place all bytes into array
            data = App.class.getResourceAsStream("/commands/CommandUsage.slateinfo").readAllBytes();

            //Create an array of lines from byte array
            usageContent = new String(data, "UTF-8").split("\\r?\\n");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        //Usage information for each command
        usagesMap.put(SlateParser.HELP, usageContent[3]);
        usagesMap.put(SlateParser.SAY, usageContent[6]);
        usagesMap.put(SlateParser.SHOUT, usageContent[9]);
        usagesMap.put(SlateParser.PICKUP, usageContent[12]);
        usagesMap.put(SlateParser.LEAVE, usageContent[17]);
        usagesMap.put(SlateParser.USE, usageContent[20]);
        usagesMap.put(SlateParser.CHECKDOORS, usageContent[22]);
        usagesMap.put(SlateParser.PEEK, usageContent[25]);
        usagesMap.put(SlateParser.MOVE, usageContent[29]);
        usagesMap.put(SlateParser.WAIT, usageContent[32]);
        usagesMap.put(SlateParser.SEARCH, usageContent[35]);
        usagesMap.put(SlateParser.OPEN, usageContent[38]);
        usagesMap.put(SlateParser.CLOSE, usageContent[41]);
        usagesMap.put(SlateParser.EXIT,  usageContent[44]);
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
            printUsage();
            return false;
        }

        //Display Error Message
        System.out.println("Hmm... I don't know how to do that. For a list of commands and their usages, I should type help.");
        return false;
    }

    public void execute(){

        //Link types to commands
        HashMap<Integer, CommInterface> commandMap = new HashMap<Integer, CommInterface>();

        commandMap.put(SlateParser.PICKUP, new PickupCommand((context.getToken(SlateParser.TEXT,0))!=null?(context.getToken(SlateParser.TEXT,0)).getText():null));
        commandMap.put(SlateParser.LEAVE, new LeaveCommand((context.getToken(SlateParser.TEXT,0))!=null?(context.getToken(SlateParser.TEXT,0)).getText():null));
        commandMap.put(SlateParser.USE, new UseCommand((context.getToken(SlateParser.TEXT,0))!=null?(context.getToken(SlateParser.TEXT,0)).getText():null));
        commandMap.put(SlateParser.SAY, new SayCommand((context.getToken(SlateParser.TEXT,0))!=null?(context.getToken(SlateParser.TEXT,0)).getText():null));
        commandMap.put(SlateParser.SHOUT, new ShoutCommand((context.getToken(SlateParser.TEXT,0))!=null?(context.getToken(SlateParser.TEXT,0)).getText():null));
        commandMap.put(SlateParser.MOVE, new MoveCommand((context.getToken(SlateParser.TEXT,0))!=null?(context.getToken(SlateParser.TEXT,0)).getText():null));
        commandMap.put(SlateParser.PEEK, new PeekCommand((context.getToken(SlateParser.TEXT,0))!=null?(context.getToken(SlateParser.TEXT,0)).getText():null));
        commandMap.put(SlateParser.OPEN, new OpenCommand((context.getToken(SlateParser.TEXT,0))!=null?(context.getToken(SlateParser.TEXT,0)).getText():null));
        commandMap.put(SlateParser.WAIT, new WaitCommand());
        commandMap.put(SlateParser.CHECKDOORS, new CheckDoorsCommand());
        commandMap.put(SlateParser.SEARCH, new SearchCommand());
        commandMap.put(SlateParser.CLOSE, new CloseCommand());
        commandMap.put(SlateParser.HELP, new HelpCommand());
        commandMap.put(SlateParser.EXIT, new ExitCommand());
        commandMap.put(SlateParser.SECRET, new SecretCommand());

        //Execute proper command
        CommInterface command = commandMap.get(type);
        command.execute();
    }

    //Prints usage data for current command
    void printUsage(){
        System.out.printf("Bad Syntax, %s\n", usagesMap.get(type));
    }

    //Get command context
    public ParserRuleContext getContext(){
        return context;
    }

    //Command Interface
    interface CommInterface{

        //All Commands Must have an Execute Method
        public void execute();
    }

    //SAY
    class SayCommand implements CommInterface{

        String data;

        SayCommand(String data){
            this.data = data;
        }

        @Override
        public void execute(){

            //Print message
            System.out.println(data);
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

            //Print message
            System.out.println((data).toUpperCase());
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

            //If current active inventory is not player's pockets
            if (game.player.getFocusedInventory()!=game.player.getInventory()) {

                //If player is not currently ethereal
                if (game.player.etherealTurns == 0) {

                    //Get item data in current active inventory
                    Inventory.Stack[] itemInfo = game.player.getFocusedInventory().getAllNames();
                    String itemName = data.substring(data.indexOf(" ") + 1);

                    //Get number of items to take from optional player input
                    int quantity;
                    try {
                        quantity = Integer.parseInt(data.substring(0, data.indexOf(" ")));
                    } catch (NumberFormatException | StringIndexOutOfBoundsException e) {
                        quantity = 1;
                        itemName = data;
                    }

                    //Find item match
                    for (Inventory.Stack item : itemInfo) {
                        if (item.name.equalsIgnoreCase(itemName)) {

                        /*Transfer items
                        Keep track of how many are taken*/
                            int numTaken = 0;
                            for (int i = 0; i < quantity; i++) {

                                ItemBase removed = null;
                                //If any of this item are remaining in the container
                                try {

                                    removed = game.player.getFocusedInventory().removeItem(item.name);
                                    //Add to player's pockets
                                    game.player.getInventory().putItem(item.name, removed);

                                    //If pockets become full
                                } catch (ItemSizeException e) {

                                    //If some were taken
                                    if (numTaken > 0) {
                                        System.out.println("There isn't enough room in my pockets, so I take " + numTaken + " instead.");
                                        return;
                                    }

                                    //If none were taken, because pockets were too full
                                    System.out.println("There's no space left in my pockets!");
                                    try {
                                        game.player.getFocusedInventory().putItem(item.name, removed);
                                        return;
                                    } catch (ItemSizeException e2) {
                                        e2.printStackTrace();
                                    }
                                } catch (ItemNotFoundException e) {
                                    System.out.println("There isn't enough of these, so I take " + numTaken + " instead.");
                                    return;
                                }

                                //Remove from current active inventory
                                numTaken++;
                            }

                            //Best case scenario, all desired items are taken
                            System.out.println("I take " + quantity + " " + itemName + ".");
                            return;
                        }
                    }

                    //Desired item type does not exist
                    System.out.println("I can't find any of those in here...");
                    return;
                }

                //Ethereal
                System.out.println("My hands simply pass through the item.");
                return;
            }

            //Tried to take an item from pockets
            System.out.println("I can't take things from myself!");
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

            //If player is not currently ethereal
            if (game.player.etherealTurns==0) {

                //Targeted inventory is the room's root inventory by default
                Inventory target = game.current_map.nav.getCurrentRoom().getRoot_inventory();

                //If current active inventory is not the player's pockets, set it as the target
                if (game.player.getFocusedInventory() != game.player.getInventory()) {
                    target = game.player.getFocusedInventory();
                }

                //Get item info in player's pockets
                Inventory.Stack[] itemInfo = game.player.getInventory().getAllNames();
                String itemName = data.substring(data.indexOf(" ") + 1);

                //Get number of items to take from optional player input
                int quantity;
                try {
                    quantity = Integer.parseInt(data.substring(0, data.indexOf(" ")));
                } catch (NumberFormatException e) {
                    quantity = 1;
                    itemName = data;
                }

                //Find item match
                for (Inventory.Stack item : itemInfo) {
                    if (item.name.equalsIgnoreCase(itemName)) {

                        //Keep track of number of items put in
                        int numPut = 0;
                        for (int i = 0; i < quantity; i++) {

                            //If player has any more of the item
                            if (item.count > 0) {

                                try {

                                    //Put item into targeted inventory
                                    target.putItem(item.name, game.player.getInventory().removeItem(item.name));

                                    //If container full
                                } catch (ItemSizeException e) {

                                    //If some items fit in
                                    if (numPut > 0) {
                                        System.out.println("There's not enough space inside the " + target.getName() + ", so I leave " + numPut + " instead.");
                                        return;
                                    }

                                    //If no items fit in
                                    System.out.println("There's no space inside the " + target.getName() + " to put this...");
                                    return;
                                } catch (ItemNotFoundException e) {
                                    e.printStackTrace();
                                }

                                numPut++;
                            } else {

                                //Player was only able to put some of the desired item into the container
                                System.out.println("I don't have enough of these, so I leave " + numPut + " instead.");
                                return;
                            }
                        }

                        //Best case scenario, player places the desired quantity into the target successfully
                        System.out.println("I leave " + quantity + " " + itemName + ".");
                        return;
                    }
                }

                //Player does not have any of this item
                System.out.println("I can't find any of those in my pockets...");
            }

            //Player is ethereal
            System.out.println("My hands simply pass trough the object...");
        }
    }

    //USE ITEM
    class UseCommand implements CommInterface{

        String data;

        UseCommand(String data){
            this.data = data;
        }

        @Override
        public void execute(){

            //Get item info in player's pockets
            Inventory.Stack[] itemInfo = game.player.getInventory().getAllNames();

            for (Inventory.Stack item : itemInfo){

                //Find Item
                if(data.equalsIgnoreCase(item.name)){

                    //Check if item is consumable
                    if(game.player.getInventory().getStorage().get(item.name).getItem().is_consumable){

                        //Consume Item
                        System.out.println(String.format("I %s the %s.", (game.player.getInventory().getStorage().get(item.name).getItem().verb), item.name));
                        try{
                            game.player.getInventory().removeItem(item.name).use(game.player);
                        }catch (ItemNotFoundException e){
                            e.printStackTrace();
                        }
                        return;
                    }

                    //Not Consumable
                    System.out.println("I can't use this.");
                    return;
                }
            }

            //Item not found
            System.out.println("I don't seem to have any of those...");
            return;
        }
    }

    //PRINT HELP
    class HelpCommand implements CommInterface{

        @Override
        public void execute(){

            //Print help, line by line
           for(int i = 0; i < usageContent.length; i++){
               System.out.println(usageContent[i]);
           }
        }
    }

    //SEARCH
    class SearchCommand implements CommInterface{

        @Override
        public void execute(){

            //Search Room
            if(game.player.getFocusedInventory() == game.current_map.nav.getCurrentRoom().getRoot_inventory()) {

                //Get Loose Items
                Inventory.Stack[] items = game.player.getFocusedInventory().getAllNames();
                if (items.length > 0) {
                    System.out.printf("After a quick search of the room, I find the following %d item%s:\n", items.length, items.length > 1 ? "s" : "");
                    for (Inventory.Stack item : items) {
                        System.out.println(String.format("- %s x%d", item.name, item.count));
                    }
                }else{
                    System.out.println("I can't find any loose items here.");
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

                //Get Loose Items
                Inventory.Stack[] items = game.player.getFocusedInventory().getAllNames();
                if (items.length > 0) {
                    System.out.printf("Rummaging through the %s, I find the following item%s:\n", game.player.getFocusedInventory().getName(), items.length > 1 ? "s" : "");
                    for (Inventory.Stack item : items) {
                        System.out.println(String.format("- %s x%d", item.name, item.count));
                    }
                    return;
                }

                //Nothing Found
                System.out.println(String.format("The %s %s empty...", game.player.getFocusedInventory().getName(), game.player.getFocusedInventory().getName().equalsIgnoreCase("pockets")?"are":"is"));
            }
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
            for(Room r: game.current_map.nav.getCurrentRoom().getAttached_rooms()){

                //Go to correct room
                if(r.getName().equalsIgnoreCase(data)) {
                    //Locked Door
                    if(r.getLocks()>0) {
                        System.out.println(String.format("The door has %d locks on it...", r.getLocks()));
                        while (r.getLocks() > 0) {
                            if (game.player.getInventory().getStorage().containsKey("Key")) {
                                System.out.println("Should I use a key to unlock one of them? [Y/N]");
                                String response = Commands.sc.nextLine();
                                if ((response.length()>0) && (response.toUpperCase().charAt(0) == 'Y')) {
                                    try {
                                        game.player.getInventory().removeItem("Key");
                                    } catch (ItemNotFoundException e) {
                                        e.printStackTrace();
                                    }
                                    System.out.println("I remove one lock...");
                                    r.unlock();

                                    if (r.getLocks() == 0) {
                                        System.out.println(String.format("I unlocked the door to %s.", r.getName()));
                                        break;
                                    }
                                } else {
                                    System.out.println("I decide to leave the door locked for now.");
                                    return;
                                }
                                System.out.println(String.format("The door still has %d locks on it...", r.getLocks()));
                                continue;
                            }
                            System.out.println("I don't have any keys, so I can't unlock it.");
                            return;
                        }
                    }

                    //Move
                    game.current_map.nav.moveTo(r);
                    App.clearScreen();

                    //Handle Player Buffs
                    game.player.drainBuff();
                    boolean shouldLn = false;
                    if(game.player.invisTurns>0){
                        System.out.printf("Invisibility: %d ", game.player.invisTurns);
                        shouldLn = true;
                    }
                    if(game.player.etherealTurns>0){
                        System.out.printf("Ethereal: %d ", game.player.etherealTurns);
                        shouldLn = true;
                    }
                    if(shouldLn){
                        System.out.println("\n-------------\n");
                    }
                    System.out.println("I move into " + r.getName());
                    System.out.println(r.getRoomInfo());

                    //Set current room as visited
                    game.current_map.nav.getCurrentRoom().visited = true;

                    //Set focused inventory to room root
                    game.player.setFocusedInventory(r.getRoot_inventory());

                    //Move Guards
                    game.moveGuards();
                    return;
                }
            }

            //Room not found
            System.out.println("There's no access to that room from here...");
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
            for(Room r: game.current_map.nav.getCurrentRoom().getAttached_rooms()) {

                //Peek correct room
                if (r.getName().equalsIgnoreCase(data)) {
                    System.out.println(r.getPeekInfo());

                    //Check for guards
                    if (r.getGuards().size() > 0) {
                        System.out.println(String.format("There %s %d guard%s in there!", (r.getGuards().size() > 1) ? "are" : "is", r.getGuards().size(), (r.getGuards().size() > 1) ? "s" : ""));
                    }else {
                        System.out.println("Looks all clear...");
                    }
                    for (Room ar : r.getAttached_rooms()) {
                        if (ar.getGuards().size() > 0) {
                            System.out.println("However, I hear distant footsteps...");
                            return;
                        }
                    }
                    return;
                }
            }

            //Room not found
            System.out.println("I can't see that room from here...");
        }
    }

    //WAIT
    class WaitCommand implements CommInterface{

        @Override
        public void execute(){

            //Move Guards
            System.out.println("I'll wait here for now...");
            game.moveGuards();
            game.player.drainBuff();
        }
    }

    //CHECK DOORS
    class CheckDoorsCommand implements CommInterface{

        @Override
        public void execute(){

            //Get possible paths
            ArrayList<Room> rooms = game.current_map.nav.getCurrentRoom().getAttached_rooms();

           //Check for rooms attached to current room
            System.out.printf("I look around the room and see %d door%s:\n", rooms.size(), rooms.size()>1?"s":"");
            for(Room r: rooms) {
                System.out.println("- " + r.getName() + (r.visited?" [Visited]":""));
            }
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

            //List of inventories in the room
            ArrayList<Inventory> inventories = game.current_map.nav.getCurrentRoom().getInventories();

            //Check if input matches
            for(Inventory inventory : inventories){
                if(inventory.getName().equalsIgnoreCase(data)){

                    //Locked Container
                    if(inventory.getLocks()>0) {
                        System.out.println(String.format("The %s has %d locks on it...", inventory.getName(), inventory.getLocks()));
                        while (inventory.getLocks() > 0) {
                            if (game.player.getInventory().getStorage().containsKey("Key")) {
                                System.out.println("Should I use a key to unlock one of them? [Y/N]");
                                if (Commands.sc.nextLine().toUpperCase().charAt(0) == 'Y') {
                                    try{
                                        game.player.getInventory().removeItem("Key");
                                    }catch(ItemNotFoundException e){
                                        e.printStackTrace();
                                    }
                                    System.out.println("I remove one lock...");
                                    inventory.unlock();

                                    if (inventory.getLocks() == 0) {
                                        System.out.println(String.format("I unlocked the %s.", inventory.getName()));
                                        break;
                                    }
                                }else{
                                    System.out.println("I decide to leave the container locked for now.");
                                    return;
                                }
                                System.out.println(String.format("The %s still has %d locks on it...", inventory.getName(), inventory.getLocks()));
                                continue;
                            }
                            System.out.println("I don't have any keys, so I can't unlock it.");
                            return;
                        }
                    }

                    //Set focus to targeted inventory
                    System.out.println("I open up the " + inventory.getName());
                    game.player.setFocusedInventory(inventory);
                    return;
                }
            }

            //Player's pockets
            if(data.equalsIgnoreCase("Pockets")){

                //Set focus to targeted inventory
                System.out.println("I open up my pockets.");
                game.player.setFocusedInventory(game.player.getInventory());
                return;
            }

            //Container not found
            System.out.println("I can't find that container, maybe I just imagined it...");
        }
    }

    //CLOSE INVENTORY
    class CloseCommand implements CommInterface{

        @Override
        public void execute(){

            //Only close if not in room root
            if(game.player.getFocusedInventory()!=game.current_map.nav.getCurrentRoom().getRoot_inventory()) {

                //Close Focused Inventory
                System.out.println("I close the " + game.player.getFocusedInventory().getName());

                //Reopen Room Root
                game.player.setFocusedInventory(game.current_map.nav.getCurrentRoom().getRoot_inventory());
                return;
            }

            //In room root
            System.out.println("I haven't left anything open...");
        }
    }

    //EXIT GAME
    class ExitCommand implements CommInterface{

        @Override
        public void execute(){

            //Exit
            System.out.println("You are a terrible person.");
            System.exit(0);
        }
    }

    //SECRET COMMAND
    class SecretCommand implements CommInterface{

        @Override
        public void execute(){

            System.out.println("I feel ill...");
            game.current_map = new TestMap(game);
            System.out.println("I CCCAN TASTE MY T#ETH< &&&&&&&&& FFF###L TH3 UNIVERS________\n :(");
        }
    }
}
