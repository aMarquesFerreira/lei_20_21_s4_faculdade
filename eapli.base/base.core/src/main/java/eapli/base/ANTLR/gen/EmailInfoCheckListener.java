// Generated from C:/Users/torre/OneDrive/Ambiente de Trabalho/lei20_21_s4_2db_03/eapli.base/base.core/src/main/java/eapli/base/ANTLR\EmailInfoCheck.g4 by ANTLR 4.9.1
package eapli.base.ANTLR.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EmailInfoCheckParser}.
 */
public interface EmailInfoCheckListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EmailInfoCheckParser#state}.
	 * @param ctx the parse tree
	 */
	void enterState(EmailInfoCheckParser.StateContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmailInfoCheckParser#state}.
	 * @param ctx the parse tree
	 */
	void exitState(EmailInfoCheckParser.StateContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmailInfoCheckParser#email}.
	 * @param ctx the parse tree
	 */
	void enterEmail(EmailInfoCheckParser.EmailContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmailInfoCheckParser#email}.
	 * @param ctx the parse tree
	 */
	void exitEmail(EmailInfoCheckParser.EmailContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmailInfoCheckParser#typeOfEmail}.
	 * @param ctx the parse tree
	 */
	void enterTypeOfEmail(EmailInfoCheckParser.TypeOfEmailContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmailInfoCheckParser#typeOfEmail}.
	 * @param ctx the parse tree
	 */
	void exitTypeOfEmail(EmailInfoCheckParser.TypeOfEmailContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmailInfoCheckParser#domain}.
	 * @param ctx the parse tree
	 */
	void enterDomain(EmailInfoCheckParser.DomainContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmailInfoCheckParser#domain}.
	 * @param ctx the parse tree
	 */
	void exitDomain(EmailInfoCheckParser.DomainContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmailInfoCheckParser#username}.
	 * @param ctx the parse tree
	 */
	void enterUsername(EmailInfoCheckParser.UsernameContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmailInfoCheckParser#username}.
	 * @param ctx the parse tree
	 */
	void exitUsername(EmailInfoCheckParser.UsernameContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmailInfoCheckParser#atSign}.
	 * @param ctx the parse tree
	 */
	void enterAtSign(EmailInfoCheckParser.AtSignContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmailInfoCheckParser#atSign}.
	 * @param ctx the parse tree
	 */
	void exitAtSign(EmailInfoCheckParser.AtSignContext ctx);
}