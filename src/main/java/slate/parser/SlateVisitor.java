// Generated from D:/Users/barts/eclipse-workspace/slate-dev/src/main/resources\Slate.g4 by ANTLR 4.7.2
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
	 * Visit a parse tree produced by {@link SlateParser#printcomm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintcomm(SlateParser.PrintcommContext ctx);
}