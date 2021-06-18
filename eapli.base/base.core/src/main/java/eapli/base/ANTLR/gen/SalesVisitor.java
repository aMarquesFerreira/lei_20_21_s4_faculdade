// Generated from C:/Users/torre/OneDrive/Ambiente de Trabalho/lei20_21_s4_2db_03/eapli.base/base.core/src/main/java/eapli/base/ANTLR\Sales.g4 by ANTLR 4.9.1
package eapli.base.ANTLR.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SalesParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SalesVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SalesParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(SalesParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link SalesParser#state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitState(SalesParser.StateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SalesParser#productCode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProductCode(SalesParser.ProductCodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SalesParser#quantity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantity(SalesParser.QuantityContext ctx);
	/**
	 * Visit a parse tree produced by {@link SalesParser#clientType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClientType(SalesParser.ClientTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SalesParser#letter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetter(SalesParser.LetterContext ctx);
}