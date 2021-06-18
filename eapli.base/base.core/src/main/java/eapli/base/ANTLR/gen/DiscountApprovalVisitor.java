// Generated from C:/Users/torre/OneDrive/Ambiente de Trabalho/lei20_21_s4_2db_03/eapli.base/base.core/src/main/java/eapli/base/ANTLR\DiscountApproval.g4 by ANTLR 4.9.1
package eapli.base.ANTLR.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DiscountApprovalParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DiscountApprovalVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DiscountApprovalParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(DiscountApprovalParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sendEmail}
	 * labeled alternative in {@link DiscountApprovalParser#state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSendEmail(DiscountApprovalParser.SendEmailContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiscountApprovalParser#decision}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecision(DiscountApprovalParser.DecisionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiscountApprovalParser#confirmPercentage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfirmPercentage(DiscountApprovalParser.ConfirmPercentageContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiscountApprovalParser#confirmValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfirmValue(DiscountApprovalParser.ConfirmValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiscountApprovalParser#deadline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeadline(DiscountApprovalParser.DeadlineContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiscountApprovalParser#year}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYear(DiscountApprovalParser.YearContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiscountApprovalParser#month}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMonth(DiscountApprovalParser.MonthContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiscountApprovalParser#day}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDay(DiscountApprovalParser.DayContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiscountApprovalParser#base}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBase(DiscountApprovalParser.BaseContext ctx);
}