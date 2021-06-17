// Generated from C:/Users/torre/OneDrive/Ambiente de Trabalho/lei20_21_s4_2db_03/eapli.base/base.core/src/main/java/eapli/base/ANTLR\FormCheck.g4 by ANTLR 4.9.1
package eapli.base.ANTLR.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FormCheckParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FormCheckVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FormCheckParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(FormCheckParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link FormCheckParser#state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitState(FormCheckParser.StateContext ctx);
	/**
	 * Visit a parse tree produced by {@link FormCheckParser#formID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormID(FormCheckParser.FormIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link FormCheckParser#names}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNames(FormCheckParser.NamesContext ctx);
	/**
	 * Visit a parse tree produced by {@link FormCheckParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(FormCheckParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link FormCheckParser#typeOfData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeOfData(FormCheckParser.TypeOfDataContext ctx);
	/**
	 * Visit a parse tree produced by {@link FormCheckParser#description}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescription(FormCheckParser.DescriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FormCheckParser#letters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetters(FormCheckParser.LettersContext ctx);
	/**
	 * Visit a parse tree produced by {@link FormCheckParser#ignore}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgnore(FormCheckParser.IgnoreContext ctx);
	/**
	 * Visit a parse tree produced by {@link FormCheckParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(FormCheckParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link FormCheckParser#ok}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOk(FormCheckParser.OkContext ctx);
	/**
	 * Visit a parse tree produced by {@link FormCheckParser#notok}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotok(FormCheckParser.NotokContext ctx);
}