package gen;// Generated from D:/Users/barts/eclipse-workspace/slate-dev/src/main/resources\SlateGrammar.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SlateGrammarParser}.
 */
public interface SlateGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SlateGrammarParser#printcomm}.
	 * @param ctx the parse tree
	 */
	void enterPrintcomm(SlateGrammarParser.PrintcommContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlateGrammarParser#printcomm}.
	 * @param ctx the parse tree
	 */
	void exitPrintcomm(SlateGrammarParser.PrintcommContext ctx);
}