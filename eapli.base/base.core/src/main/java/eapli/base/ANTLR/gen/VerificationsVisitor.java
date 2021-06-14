// Generated from C:/Users/torre/OneDrive/Ambiente de Trabalho/lei20_21_s4_2db_03/eapli.base/base.core/src/main/java/eapli/base/ANTLR\Verifications.g4 by ANTLR 4.9.1
package eapli.base.ANTLR.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link VerificationsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface VerificationsVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link VerificationsParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(VerificationsParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerificationsParser#state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitState(VerificationsParser.StateContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerificationsParser#formID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormID(VerificationsParser.FormIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerificationsParser#names}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNames(VerificationsParser.NamesContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerificationsParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(VerificationsParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerificationsParser#typeOfData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeOfData(VerificationsParser.TypeOfDataContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerificationsParser#description}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescription(VerificationsParser.DescriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerificationsParser#letters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetters(VerificationsParser.LettersContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerificationsParser#ignore}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgnore(VerificationsParser.IgnoreContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerificationsParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(VerificationsParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerificationsParser#ok}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOk(VerificationsParser.OkContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerificationsParser#notok}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotok(VerificationsParser.NotokContext ctx);
}