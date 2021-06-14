// Generated from C:/Users/torre/OneDrive/Ambiente de Trabalho/lei20_21_s4_2db_03/eapli.base/base.core/src/main/java/eapli/base/ANTLR\EmailInfoCheck.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link EmailInfoCheckParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface EmailInfoCheckVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link EmailInfoCheckParser#state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitState(EmailInfoCheckParser.StateContext ctx);
	/**
	 * Visit a parse tree produced by {@link EmailInfoCheckParser#email}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmail(EmailInfoCheckParser.EmailContext ctx);
	/**
	 * Visit a parse tree produced by {@link EmailInfoCheckParser#typeOfEmail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeOfEmail(EmailInfoCheckParser.TypeOfEmailContext ctx);
	/**
	 * Visit a parse tree produced by {@link EmailInfoCheckParser#domain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDomain(EmailInfoCheckParser.DomainContext ctx);
	/**
	 * Visit a parse tree produced by {@link EmailInfoCheckParser#username}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsername(EmailInfoCheckParser.UsernameContext ctx);
	/**
	 * Visit a parse tree produced by {@link EmailInfoCheckParser#atSign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtSign(EmailInfoCheckParser.AtSignContext ctx);
}