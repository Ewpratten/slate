package slate.parser;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.HashMap;
import java.util.Scanner;

public class Commands {

    //Scanner for player input
    static Scanner sc = new Scanner(System.in);

    //Get player's input (Static, call with Commands.getInput();)
    public static Command getInput(){

        //Read next line as input stream for parsing
        CharStream inputStream = CharStreams.fromString(
                sc.nextLine());

         return parseCommand(inputStream);
    }

    public static Command parseCommand(CharStream inputStream) {
        //Lex
        SlateLexer lexer = new SlateLexer(inputStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);

        //Parse
        SlateParser parser = new SlateParser(tokenStream);

        //Determine Command type
        int type = parser.getCurrentToken().getType();

        //Map contexts
        HashMap<Integer, Context.contextInterface> contextMap = new HashMap<Integer,  Context.contextInterface>();
        contextMap.put(SlateParser.SAY, new  Context.sayContext());
        contextMap.put(SlateParser.SHOUT, new  Context.shoutContext());
        contextMap.put(SlateParser.PICKUP, new  Context.pickupContext());
        contextMap.put(SlateParser.TAKE, new  Context.pickupContext());
        contextMap.put(SlateParser.HELP, new  Context.helpContext());

        //Get context
        ParserRuleContext context = contextMap.get(type)!=null?contextMap.get(type).open(parser):null;

        return new Command(type, context, parser);
    }
}
