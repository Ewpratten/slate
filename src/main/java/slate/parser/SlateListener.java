// Generated from D:/Users/barts/eclipse-workspace/slate-dev/src/main/resources/commands\Slate.g4 by ANTLR 4.7.2
package slate.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SlateParser}.
 */
public interface SlateListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SlateParser#saycomm}.
	 * @param ctx the parse tree
	 */
	void enterSaycomm(SlateParser.SaycommContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlateParser#saycomm}.
	 * @param ctx the parse tree
	 */
	void exitSaycomm(SlateParser.SaycommContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlateParser#shoutcomm}.
	 * @param ctx the parse tree
	 */
	void enterShoutcomm(SlateParser.ShoutcommContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlateParser#shoutcomm}.
	 * @param ctx the parse tree
	 */
	void exitShoutcomm(SlateParser.ShoutcommContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlateParser#pickupcomm}.
	 * @param ctx the parse tree
	 */
	void enterPickupcomm(SlateParser.PickupcommContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlateParser#pickupcomm}.
	 * @param ctx the parse tree
	 */
	void exitPickupcomm(SlateParser.PickupcommContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlateParser#helpcomm}.
	 * @param ctx the parse tree
	 */
	void enterHelpcomm(SlateParser.HelpcommContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlateParser#helpcomm}.
	 * @param ctx the parse tree
	 */
	void exitHelpcomm(SlateParser.HelpcommContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlateParser#exitcomm}.
	 * @param ctx the parse tree
	 */
	void enterExitcomm(SlateParser.ExitcommContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlateParser#exitcomm}.
	 * @param ctx the parse tree
	 */
	void exitExitcomm(SlateParser.ExitcommContext ctx);
}