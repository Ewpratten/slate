// Generated from D:/Users/barts/eclipse-workspace/slate-dev/src/main/resources/commands\Slate.g4 by ANTLR 4.7.2
package slate.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SlateParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SlateVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SlateParser#saycomm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSaycomm(SlateParser.SaycommContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlateParser#shoutcomm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShoutcomm(SlateParser.ShoutcommContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlateParser#pickupcomm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPickupcomm(SlateParser.PickupcommContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlateParser#checkdoorscomm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckdoorscomm(SlateParser.CheckdoorscommContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlateParser#peekcomm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPeekcomm(SlateParser.PeekcommContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlateParser#searchcomm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearchcomm(SlateParser.SearchcommContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlateParser#movecomm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMovecomm(SlateParser.MovecommContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlateParser#helpcomm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHelpcomm(SlateParser.HelpcommContext ctx);
	/**
	 * Visit a parse tree produced by {@link SlateParser#exitcomm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExitcomm(SlateParser.ExitcommContext ctx);
}