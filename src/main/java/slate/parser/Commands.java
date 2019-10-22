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
    //Map contexts
    static HashMap<Integer, Context.ContextInterface> contextMap = new HashMap<Integer, Context.ContextInterface>();
    static {
        contextMap.put(SlateParser.SAY, new Context.SayContext());
        contextMap.put(SlateParser.SHOUT, new Context.ShoutContext());
        contextMap.put(SlateParser.PICKUP, new Context.PickupContext());
        contextMap.put(SlateParser.LEAVE, new Context.LeaveContext());
        contextMap.put(SlateParser.HELP, new Context.HelpContext());
        contextMap.put(SlateParser.EXIT, new Context.ExitContext());
        contextMap.put(SlateParser.CHECKDOORS, new Context.CheckDoorsContext());
        contextMap.put(SlateParser.SEARCH, new Context.SearchContext());
        contextMap.put(SlateParser.MOVE, new Context.MoveContext());
        contextMap.put(SlateParser.WAIT, new Context.WaitContext());
        contextMap.put(SlateParser.PEEK, new Context.PeekContext());
        contextMap.put(SlateParser.OPEN, new Context.OpenContext());
        contextMap.put(SlateParser.CLOSE, new Context.CloseContext());
        contextMap.put(SlateParser.SECRET, new Context.SecretContext());
    }

    //Get player's input (Static, call with Commands.getInput();)
    public static Command[] getInput(){

        //Read next line as input stream for parsing
        String[] commandQueue = (sc.nextLine()).split(" && ");
        Command[] commands = new Command[commandQueue.length];

        for(int i = 0; i < commands.length; i++) {
        CharStream inputStream = CharStreams.fromString("~"+commandQueue[i]);
            commands[i] = parseCommand(inputStream);
        }

        return commands;
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

        //Get context
        ParserRuleContext context = contextMap.get(type)!=null?contextMap.get(type).open(parser):null;

        return new Command(type, context, parser);
    }
}
