// Generated from C:/Users/torre/OneDrive/Ambiente de Trabalho/lei20_21_s4_2db_03/eapli.base/base.core/src/main/java/eapli/base/ANTLR\DiscountApproval.g4 by ANTLR 4.9.1
package eapli.base.ANTLR.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DiscountApprovalParser}.
 */
public interface DiscountApprovalListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DiscountApprovalParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(DiscountApprovalParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiscountApprovalParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(DiscountApprovalParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sendEmail}
	 * labeled alternative in {@link DiscountApprovalParser#state}.
	 * @param ctx the parse tree
	 */
	void enterSendEmail(DiscountApprovalParser.SendEmailContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sendEmail}
	 * labeled alternative in {@link DiscountApprovalParser#state}.
	 * @param ctx the parse tree
	 */
	void exitSendEmail(DiscountApprovalParser.SendEmailContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiscountApprovalParser#decision}.
	 * @param ctx the parse tree
	 */
	void enterDecision(DiscountApprovalParser.DecisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiscountApprovalParser#decision}.
	 * @param ctx the parse tree
	 */
	void exitDecision(DiscountApprovalParser.DecisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiscountApprovalParser#confirmPercentage}.
	 * @param ctx the parse tree
	 */
	void enterConfirmPercentage(DiscountApprovalParser.ConfirmPercentageContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiscountApprovalParser#confirmPercentage}.
	 * @param ctx the parse tree
	 */
	void exitConfirmPercentage(DiscountApprovalParser.ConfirmPercentageContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiscountApprovalParser#confirmValue}.
	 * @param ctx the parse tree
	 */
	void enterConfirmValue(DiscountApprovalParser.ConfirmValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiscountApprovalParser#confirmValue}.
	 * @param ctx the parse tree
	 */
	void exitConfirmValue(DiscountApprovalParser.ConfirmValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiscountApprovalParser#deadline}.
	 * @param ctx the parse tree
	 */
	void enterDeadline(DiscountApprovalParser.DeadlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiscountApprovalParser#deadline}.
	 * @param ctx the parse tree
	 */
	void exitDeadline(DiscountApprovalParser.DeadlineContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiscountApprovalParser#year}.
	 * @param ctx the parse tree
	 */
	void enterYear(DiscountApprovalParser.YearContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiscountApprovalParser#year}.
	 * @param ctx the parse tree
	 */
	void exitYear(DiscountApprovalParser.YearContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiscountApprovalParser#month}.
	 * @param ctx the parse tree
	 */
	void enterMonth(DiscountApprovalParser.MonthContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiscountApprovalParser#month}.
	 * @param ctx the parse tree
	 */
	void exitMonth(DiscountApprovalParser.MonthContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiscountApprovalParser#day}.
	 * @param ctx the parse tree
	 */
	void enterDay(DiscountApprovalParser.DayContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiscountApprovalParser#day}.
	 * @param ctx the parse tree
	 */
	void exitDay(DiscountApprovalParser.DayContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiscountApprovalParser#base}.
	 * @param ctx the parse tree
	 */
	void enterBase(DiscountApprovalParser.BaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiscountApprovalParser#base}.
	 * @param ctx the parse tree
	 */
	void exitBase(DiscountApprovalParser.BaseContext ctx);
}