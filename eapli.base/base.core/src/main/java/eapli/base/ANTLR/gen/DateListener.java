// Generated from C:/Users/torre/OneDrive/Ambiente de Trabalho/lei20_21_s4_2db_03/eapli.base/base.core/src/main/java/eapli/base/ANTLR\Date.g4 by ANTLR 4.9.1
package eapli.base.ANTLR.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DateParser}.
 */
public interface DateListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DateParser#state}.
	 * @param ctx the parse tree
	 */
	void enterState(DateParser.StateContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateParser#state}.
	 * @param ctx the parse tree
	 */
	void exitState(DateParser.StateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Comparison}
	 * labeled alternative in {@link DateParser#compare}.
	 * @param ctx the parse tree
	 */
	void enterComparison(DateParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Comparison}
	 * labeled alternative in {@link DateParser#compare}.
	 * @param ctx the parse tree
	 */
	void exitComparison(DateParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link DateParser#date}.
	 * @param ctx the parse tree
	 */
	void enterDate(DateParser.DateContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateParser#date}.
	 * @param ctx the parse tree
	 */
	void exitDate(DateParser.DateContext ctx);
	/**
	 * Enter a parse tree produced by {@link DateParser#year}.
	 * @param ctx the parse tree
	 */
	void enterYear(DateParser.YearContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateParser#year}.
	 * @param ctx the parse tree
	 */
	void exitYear(DateParser.YearContext ctx);
	/**
	 * Enter a parse tree produced by {@link DateParser#month}.
	 * @param ctx the parse tree
	 */
	void enterMonth(DateParser.MonthContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateParser#month}.
	 * @param ctx the parse tree
	 */
	void exitMonth(DateParser.MonthContext ctx);
	/**
	 * Enter a parse tree produced by {@link DateParser#day}.
	 * @param ctx the parse tree
	 */
	void enterDay(DateParser.DayContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateParser#day}.
	 * @param ctx the parse tree
	 */
	void exitDay(DateParser.DayContext ctx);
}