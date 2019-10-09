// Generated from D:/Users/barts/eclipse-workspace/slate-dev/src/main/resources\Slate.g4 by ANTLR 4.7.2
package slate.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SlateParser}.
 */
public interface SlateListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SlateParser#printcomm}.
	 * @param ctx the parse tree
	 */
	void enterPrintcomm(SlateParser.PrintcommContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlateParser#printcomm}.
	 * @param ctx the parse tree
	 */
	void exitPrintcomm(SlateParser.PrintcommContext ctx);
}