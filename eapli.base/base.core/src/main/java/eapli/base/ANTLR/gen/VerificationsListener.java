// Generated from C:/Users/torre/OneDrive/Documentos/lei20_21_s4_2db_03/eapli.base/base.core/src/main/java/eapli/base/ANTLR\Verifications.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link VerificationsParser}.
 */
public interface VerificationsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link VerificationsParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(VerificationsParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerificationsParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(VerificationsParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerificationsParser#state}.
	 * @param ctx the parse tree
	 */
	void enterState(VerificationsParser.StateContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerificationsParser#state}.
	 * @param ctx the parse tree
	 */
	void exitState(VerificationsParser.StateContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerificationsParser#formID}.
	 * @param ctx the parse tree
	 */
	void enterFormID(VerificationsParser.FormIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerificationsParser#formID}.
	 * @param ctx the parse tree
	 */
	void exitFormID(VerificationsParser.FormIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerificationsParser#names}.
	 * @param ctx the parse tree
	 */
	void enterNames(VerificationsParser.NamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerificationsParser#names}.
	 * @param ctx the parse tree
	 */
	void exitNames(VerificationsParser.NamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerificationsParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(VerificationsParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerificationsParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(VerificationsParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerificationsParser#typeOfData}.
	 * @param ctx the parse tree
	 */
	void enterTypeOfData(VerificationsParser.TypeOfDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerificationsParser#typeOfData}.
	 * @param ctx the parse tree
	 */
	void exitTypeOfData(VerificationsParser.TypeOfDataContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerificationsParser#description}.
	 * @param ctx the parse tree
	 */
	void enterDescription(VerificationsParser.DescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerificationsParser#description}.
	 * @param ctx the parse tree
	 */
	void exitDescription(VerificationsParser.DescriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerificationsParser#letters}.
	 * @param ctx the parse tree
	 */
	void enterLetters(VerificationsParser.LettersContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerificationsParser#letters}.
	 * @param ctx the parse tree
	 */
	void exitLetters(VerificationsParser.LettersContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerificationsParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(VerificationsParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerificationsParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(VerificationsParser.NumberContext ctx);
}