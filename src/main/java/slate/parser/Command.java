package slate.parser;

import org.antlr.v4.runtime.ParserRuleContext;
import slate.App;
import slate.bases.RoomBase;

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

        usagesMap.put(SlateParser.SAY, usageContent[6]);
        usagesMap.put(SlateParser.SHOUT, usageContent[9]);
        usagesMap.put(SlateParser.PICKUP, usageContent[12]);
        usagesMap.put(SlateParser.HELP, usageContent[3]);
        usagesMap.put(SlateParser.MOVE, usageContent[21]);
        usagesMap.put(SlateParser.CHECKDOORS, usageContent[15]);
        usagesMap.put(SlateParser.PEEK, usageContent[18]);
        usagesMap.put(SlateParser.SEARCH, usageContent[24]);
        usagesMap.put(SlateParser.EXIT,  usageContent[28]);
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
        commandMap.put(SlateParser.SAY, new SayCommand((context.getToken(SlateParser.TEXT,0))!=null?(context.getToken(SlateParser.TEXT,0)).getText():null));
        commandMap.put(SlateParser.SHOUT, new ShoutCommand((context.getToken(SlateParser.TEXT,0))!=null?(context.getToken(SlateParser.TEXT,0)).getText():null));
        commandMap.put(SlateParser.PICKUP, new PickupCommand((context.getToken(SlateParser.TEXT,0))!=null?(context.getToken(SlateParser.TEXT,0)).getText():null));
        commandMap.put(SlateParser.MOVE, new MoveCommand((context.getToken(SlateParser.TEXT,0))!=null?(context.getToken(SlateParser.TEXT,0)).getText():null));
        commandMap.put(SlateParser.PEEK, new PeekCommand((context.getToken(SlateParser.TEXT,0))!=null?(context.getToken(SlateParser.TEXT,0)).getText():null));
        commandMap.put(SlateParser.CHECKDOORS, new CheckDoorsCommand(null));
        commandMap.put(SlateParser.SEARCH, new SearchCommand(null));
        commandMap.put(SlateParser.HELP, new HelpCommand(null));
        commandMap.put(SlateParser.EXIT, new ExitCommand(null));

        CommInterface command = commandMap.get(type);

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
        public void execute(){
            //Print message
            System.out.println("WIP");
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
            System.out.println("WIP");
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
                if(r.getName().equalsIgnoreCase(data))game.current_map.nav.moveTo(r);
                return;
            }
            System.out.println("Room not found.");
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
            System.out.println("Room not found.");
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
            System.out.printf("I Look around the room and see %d doors:\n", rooms.size());
            for(RoomBase r: rooms) {
                System.out.println("- " + r.getName());
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
