// Generated from C:/Users/torre/OneDrive/Ambiente de Trabalho/lei20_21_s4_2db_03/eapli.base/base.core/src/main/java/eapli/base/ANTLR\Date.g4 by ANTLR 4.9.1
package eapli.base.ANTLR.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

import java.text.ParseException;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DateParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DateVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DateParser#state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitState(DateParser.StateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Comparison}
	 * labeled alternative in {@link DateParser#compare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(DateParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link DateParser#date}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate(DateParser.DateContext ctx);
	/**
	 * Visit a parse tree produced by {@link DateParser#year}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYear(DateParser.YearContext ctx);
	/**
	 * Visit a parse tree produced by {@link DateParser#month}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMonth(DateParser.MonthContext ctx);
	/**
	 * Visit a parse tree produced by {@link DateParser#day}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDay(DateParser.DayContext ctx);
}