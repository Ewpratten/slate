package slate.parser;

import org.antlr.v4.runtime.ParserRuleContext;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.util.HashMap;

//Command Object
public class Command{

    //Reading in Command Usage Data
    static File file;
    static byte[] data;
    static String[] usageContent;
    static HashMap<Integer, String> usagesMap = new HashMap<Integer, String>();

    static {
        try {
            //Get file from res folder
            file = new File(Commands.class.getResource("../../commands/CommandUsage.slateinfo").toURI());

            //Place all bytes into array
            data = Files.readAllBytes(file.toPath());

            //Create an array of lines from byte array
            usageContent = new String(data, "UTF-8").split("\\n?\\r");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        usagesMap.put(SlateParser.SAY, usageContent[9]);
        usagesMap.put(SlateParser.SHOUT, usageContent[14]);
        usagesMap.put(SlateParser.PICKUP, usageContent[19]);
        usagesMap.put(SlateParser.HELP, usageContent[4]);
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
            System.out.println("Bad Syntax, " + usagesMap.get(type));
            return false;
        }
        //Display Error Message
        System.out.println("Unrecognized command. For a list of commands and their usages, type help.");
        return false;
    }

    public void execute(){

        //Link type to commands
        HashMap<Integer, CommInterface> commandMap = new HashMap<Integer, CommInterface>();
        commandMap.put(SlateParser.SAY, new SayCommand((context.getToken(SlateParser.TEXT,0))!=null?(context.getToken(SlateParser.TEXT,0)).getText():""));
        commandMap.put(SlateParser.SHOUT, new ShoutCommand((context.getToken(SlateParser.TEXT,0))!=null?(context.getToken(SlateParser.TEXT,0)).getText():""));
        commandMap.put(SlateParser.PICKUP, new PickupCommand((context.getToken(SlateParser.ITEMNAME,0))!=null?(context.getToken(SlateParser.ITEMNAME,0)).getText():""));
        commandMap.put(SlateParser.HELP, new HelpCommand());

        CommInterface command = commandMap.get(type);

        command.execute();
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
            String message = (data.substring(data.indexOf("\"")+1,data.lastIndexOf("\"")));

            //Print message
            System.out.println(message);
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
            String message = (data.substring(data.indexOf("\"")+1,data.lastIndexOf("\""))).toUpperCase();

            //Print message
            System.out.println(message);
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

    }

    //PRINT HELP
    class HelpCommand implements CommInterface{

        @Override
        public void execute(){

            //Print help
           for(int i = 0; i < usageContent.length; i++){
               System.out.print(usageContent[i]);
           }
        }

    }
}
