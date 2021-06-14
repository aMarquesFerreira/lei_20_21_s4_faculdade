// Generated from C:/Users/torre/OneDrive/Ambiente de Trabalho/lei20_21_s4_2db_03/eapli.base/base.core/src/main/java/eapli/base/ANTLR\TitleInfoCheck.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TitleInfoCheckParser}.
 */
public interface TitleInfoCheckListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TitleInfoCheckParser#state}.
	 * @param ctx the parse tree
	 */
	void enterState(TitleInfoCheckParser.StateContext ctx);
	/**
	 * Exit a parse tree produced by {@link TitleInfoCheckParser#state}.
	 * @param ctx the parse tree
	 */
	void exitState(TitleInfoCheckParser.StateContext ctx);
	/**
	 * Enter a parse tree produced by {@link TitleInfoCheckParser#title}.
	 * @param ctx the parse tree
	 */
	void enterTitle(TitleInfoCheckParser.TitleContext ctx);
	/**
	 * Exit a parse tree produced by {@link TitleInfoCheckParser#title}.
	 * @param ctx the parse tree
	 */
	void exitTitle(TitleInfoCheckParser.TitleContext ctx);
}