package slate.parser;

import org.antlr.v4.runtime.*;

import java.util.Scanner;

public class ParserTest {

    //Scanner
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new ParserTest();
    }

    public ParserTest(){

        //Read next line as input stream for parsing
        CharStream inputStream = CharStreams.fromString(
                sc.nextLine());

        //Lex
        SlateLexer slateLexer = new SlateLexer(inputStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(slateLexer);

        //Parse
        SlateParser slateParser = new SlateParser(commonTokenStream);
        SlateParser.PrintcommContext printcommContext = slateParser.printcomm();

        //Check syntax
        SlateBaseVisitor visitor = new SlateBaseVisitor();
        visitor.visit(printcommContext);

        //Print Message
        try{
            System.out.println(printcommContext.TEXT().getText().substring(printcommContext.TEXT().getText().indexOf("\"")+1,printcommContext.TEXT().getText().lastIndexOf("\"")));
        }catch(NullPointerException e){
            System.out.println("Invalid say command. Format: SAY \"TEXT\"");
        }
    }
}