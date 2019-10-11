package slate.parser;

import org.antlr.v4.runtime.*;

import java.util.HashMap;
import java.util.Scanner;

public class Commands {

    //Scanner for player input
    static Scanner sc = new Scanner(System.in);

    //Get player's input (Static, call with Commands.getInput();)
    public static Command getInput(){

        //Read next line as input stream for parsing
        CharStream inputStream = CharStreams.fromString(
                '~'+sc.nextLine());

         return parseCommand(inputStream);
    }

    public static Command parseCommand(CharStream inputStream) {
        //Lex
        SlateLexer lexer = new SlateLexer(inputStream);
        lexer.removeErrorListeners();
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);

        //Parse
        SlateParser parser = new SlateParser(tokenStream);
        parser.removeErrorListeners();

        //Determine Command type
        int type = parser.getCurrentToken().getType();

        //Map contexts
        HashMap<Integer, Context.ContextInterface> contextMap = new HashMap<Integer, Context.ContextInterface>();
        contextMap.put(SlateParser.SAY, new Context.SayContext());
        contextMap.put(SlateParser.SHOUT, new Context.ShoutContext());
        contextMap.put(SlateParser.PICKUP, new Context.PickupContext());
        contextMap.put(SlateParser.HELP, new Context.HelpContext());
        contextMap.put(SlateParser.EXIT, new Context.ExitContext());
        contextMap.put(SlateParser.CHECKDOORS, new Context.CheckDoorsContext());
        contextMap.put(SlateParser.SEARCH, new Context.SearchContext());
        contextMap.put(SlateParser.MOVE, new Context.MoveContext());
        contextMap.put(SlateParser.PEEK, new Context.PeekContext());

        //Get context
        ParserRuleContext context = contextMap.get(type)!=null?contextMap.get(type).open(parser):null;

        return new Command(type, context, parser);
    }
}
