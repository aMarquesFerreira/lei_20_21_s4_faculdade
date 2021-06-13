// Generated from C:/Users/torre/OneDrive/Ambiente de Trabalho/lei20_21_s4_2db_03/eapli.base/base.core/src/main/java/eapli/base/ANTLR\ContentInfoCheck.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ContentInfoCheckParser}.
 */
public interface ContentInfoCheckListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ContentInfoCheckParser#state}.
	 * @param ctx the parse tree
	 */
	void enterState(ContentInfoCheckParser.StateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ContentInfoCheckParser#state}.
	 * @param ctx the parse tree
	 */
	void exitState(ContentInfoCheckParser.StateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ContentInfoCheckParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent(ContentInfoCheckParser.ContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ContentInfoCheckParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent(ContentInfoCheckParser.ContentContext ctx);
}