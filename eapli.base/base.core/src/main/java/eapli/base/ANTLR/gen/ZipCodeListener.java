// Generated from C:/Users/torre/OneDrive/Ambiente de Trabalho/lei20_21_s4_2db_03/eapli.base/base.core/src/main/java/eapli/base/ANTLR\ZipCode.g4 by ANTLR 4.9.1
package eapli.base.ANTLR.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ZipCodeParser}.
 */
public interface ZipCodeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ZipCodeParser#state}.
	 * @param ctx the parse tree
	 */
	void enterState(ZipCodeParser.StateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZipCodeParser#state}.
	 * @param ctx the parse tree
	 */
	void exitState(ZipCodeParser.StateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZipCodeParser#zip}.
	 * @param ctx the parse tree
	 */
	void enterZip(ZipCodeParser.ZipContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZipCodeParser#zip}.
	 * @param ctx the parse tree
	 */
	void exitZip(ZipCodeParser.ZipContext ctx);
}