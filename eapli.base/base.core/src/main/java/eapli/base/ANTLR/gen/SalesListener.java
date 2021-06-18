// Generated from C:/Users/torre/OneDrive/Ambiente de Trabalho/lei20_21_s4_2db_03/eapli.base/base.core/src/main/java/eapli/base/ANTLR\Sales.g4 by ANTLR 4.9.1
package eapli.base.ANTLR.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SalesParser}.
 */
public interface SalesListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SalesParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SalesParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SalesParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SalesParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SalesParser#state}.
	 * @param ctx the parse tree
	 */
	void enterState(SalesParser.StateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SalesParser#state}.
	 * @param ctx the parse tree
	 */
	void exitState(SalesParser.StateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SalesParser#productCode}.
	 * @param ctx the parse tree
	 */
	void enterProductCode(SalesParser.ProductCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SalesParser#productCode}.
	 * @param ctx the parse tree
	 */
	void exitProductCode(SalesParser.ProductCodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SalesParser#quantity}.
	 * @param ctx the parse tree
	 */
	void enterQuantity(SalesParser.QuantityContext ctx);
	/**
	 * Exit a parse tree produced by {@link SalesParser#quantity}.
	 * @param ctx the parse tree
	 */
	void exitQuantity(SalesParser.QuantityContext ctx);
	/**
	 * Enter a parse tree produced by {@link SalesParser#clientType}.
	 * @param ctx the parse tree
	 */
	void enterClientType(SalesParser.ClientTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SalesParser#clientType}.
	 * @param ctx the parse tree
	 */
	void exitClientType(SalesParser.ClientTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SalesParser#letter}.
	 * @param ctx the parse tree
	 */
	void enterLetter(SalesParser.LetterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SalesParser#letter}.
	 * @param ctx the parse tree
	 */
	void exitLetter(SalesParser.LetterContext ctx);
}