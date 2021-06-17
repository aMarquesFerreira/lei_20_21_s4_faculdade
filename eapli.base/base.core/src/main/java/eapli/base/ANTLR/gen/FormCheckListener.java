// Generated from C:/Users/torre/OneDrive/Ambiente de Trabalho/lei20_21_s4_2db_03/eapli.base/base.core/src/main/java/eapli/base/ANTLR\FormCheck.g4 by ANTLR 4.9.1
package eapli.base.ANTLR.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FormCheckParser}.
 */
public interface FormCheckListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FormCheckParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(FormCheckParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormCheckParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(FormCheckParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormCheckParser#state}.
	 * @param ctx the parse tree
	 */
	void enterState(FormCheckParser.StateContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormCheckParser#state}.
	 * @param ctx the parse tree
	 */
	void exitState(FormCheckParser.StateContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormCheckParser#formID}.
	 * @param ctx the parse tree
	 */
	void enterFormID(FormCheckParser.FormIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormCheckParser#formID}.
	 * @param ctx the parse tree
	 */
	void exitFormID(FormCheckParser.FormIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormCheckParser#names}.
	 * @param ctx the parse tree
	 */
	void enterNames(FormCheckParser.NamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormCheckParser#names}.
	 * @param ctx the parse tree
	 */
	void exitNames(FormCheckParser.NamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormCheckParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(FormCheckParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormCheckParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(FormCheckParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormCheckParser#typeOfData}.
	 * @param ctx the parse tree
	 */
	void enterTypeOfData(FormCheckParser.TypeOfDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormCheckParser#typeOfData}.
	 * @param ctx the parse tree
	 */
	void exitTypeOfData(FormCheckParser.TypeOfDataContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormCheckParser#description}.
	 * @param ctx the parse tree
	 */
	void enterDescription(FormCheckParser.DescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormCheckParser#description}.
	 * @param ctx the parse tree
	 */
	void exitDescription(FormCheckParser.DescriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormCheckParser#letters}.
	 * @param ctx the parse tree
	 */
	void enterLetters(FormCheckParser.LettersContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormCheckParser#letters}.
	 * @param ctx the parse tree
	 */
	void exitLetters(FormCheckParser.LettersContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormCheckParser#ignore}.
	 * @param ctx the parse tree
	 */
	void enterIgnore(FormCheckParser.IgnoreContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormCheckParser#ignore}.
	 * @param ctx the parse tree
	 */
	void exitIgnore(FormCheckParser.IgnoreContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormCheckParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(FormCheckParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormCheckParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(FormCheckParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormCheckParser#ok}.
	 * @param ctx the parse tree
	 */
	void enterOk(FormCheckParser.OkContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormCheckParser#ok}.
	 * @param ctx the parse tree
	 */
	void exitOk(FormCheckParser.OkContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormCheckParser#notok}.
	 * @param ctx the parse tree
	 */
	void enterNotok(FormCheckParser.NotokContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormCheckParser#notok}.
	 * @param ctx the parse tree
	 */
	void exitNotok(FormCheckParser.NotokContext ctx);
}