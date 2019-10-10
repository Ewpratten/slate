package slate.parser;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.util.Scanner;

public class Commands {
    static Commands comm;

    static File file;
    static byte[] data;
    static String[] usageContent;

    static {
        try {
            //Get file from res folder
            file = new File(Commands.class.getResource("../../commands/CommandUsage.slateinfo").toURI());

            //Place all bytes into array
            data = Files.readAllBytes(file.toPath());

            //Create string from byte array
            usageContent = new String(data, "UTF-8").split("\\n?\\r");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {

            //End program if file is not found
            System.out.println("File not found!");
            e.printStackTrace();
            System.exit(0);
        }
    }

    static Scanner sc = new Scanner(System.in);

    public static void getInput(){
        //Read next line as input stream for parsing
        CharStream inputStream = CharStreams.fromString(
                sc.nextLine());

        Commands.parseCommand(inputStream);
    }

    protected static void parseCommand(CharStream inputStream) {
        //Lex
        SlateLexer lexer = new SlateLexer(inputStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);

        //Parse
        SlateParser parser = new SlateParser(tokenStream);
        switch (parser.getCurrentToken().getType()) {
            case SlateParser.SAY:
                sayCommand(parser);
                break;
            case SlateParser.SHOUT:
                shoutCommand(parser);
                break;
            case SlateParser.PICKUP:
            case SlateParser.TAKE:
                pickupCommand(parser);
                break;
            case SlateParser.HELP:
                helpCommand(parser);
                break;
            default:
                System.out.println("Unrecognized Command. For a list of commands, type !Help");
                break;
        }
    }

    //Simple Printing Command
    private static void sayCommand(SlateParser parser){
        SlateParser.SaycommContext saycommContext = parser.saycomm();

        SlateBaseVisitor visitor = new SlateBaseVisitor();
        visitor.visit(saycommContext);

        if(saycommContext.exception==null){
            String message = saycommContext.TEXT().getText();
            System.out.println(message.substring(message.indexOf("\"")+1, message.lastIndexOf("\"")));
        }else{
            System.out.println("Say Usage: SAY \"MESSAGE\"");
        }
    }

    //Shouting Command
    private static void shoutCommand(SlateParser parser){
        SlateParser.ShoutcommContext shoutcommContext = parser.shoutcomm();

        SlateBaseVisitor visitor = new SlateBaseVisitor();
        visitor.visit(shoutcommContext);

        if(shoutcommContext.exception==null){
            String message = shoutcommContext.TEXT().getText().toUpperCase();
            System.out.println(message.substring(message.indexOf("\"")+1, message.lastIndexOf("\"")));
        }else{
            System.out.println("Shout Usage: SHOUT \"MESSAGE\"");
        }
    }

    //Pickup Command
    private static void pickupCommand(SlateParser parser){
        SlateParser.PickupcommContext pickupcommContext = parser.pickupcomm();

        SlateBaseVisitor visitor = new SlateBaseVisitor();
        visitor.visit(pickupcommContext);

        if(pickupcommContext.exception==null){
            String message = pickupcommContext.ITEMNAME().getText().toLowerCase();
            System.out.println("Picked up " + message.substring(message.indexOf("[")+1, message.lastIndexOf("]")));
        }
    }

    //Help Command
    private static void helpCommand(SlateParser parser){
        SlateParser.HelpcommContext helpcommContext = parser.helpcomm();

        SlateBaseVisitor visitor = new SlateBaseVisitor();
        visitor.visit(helpcommContext);

        if(helpcommContext.exception==null){
            for(int i = 0; i<usageContent.length; i++){
                    System.out.print(usageContent[i]);
            }
        }
    }
}
