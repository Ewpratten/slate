package slate.parser;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class ParserTest {

    public static void main(String[] args) {
        CharStream inputStream = CharStreams.fromString(
                "Say \"Egg Salad\"");
        SlateLexer slateLexer = new SlateLexer(inputStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(slateLexer);
        SlateParser slateParser = new SlateParser(commonTokenStream);
        SlateParser.PrintcommContext printcommContext = slateParser.printcomm();
        SlateBaseVisitor visitor = new SlateBaseVisitor();
        visitor.visit(printcommContext);
    }
}