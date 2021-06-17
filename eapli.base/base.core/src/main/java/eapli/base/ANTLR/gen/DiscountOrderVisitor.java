// Generated from C:/Users/torre/OneDrive/Ambiente de Trabalho/lei20_21_s4_2db_03/eapli.base/base.core/src/main/java/eapli/base/ANTLR\DiscountOrder.g4 by ANTLR 4.9.1
package eapli.base.ANTLR.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DiscountOrderParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DiscountOrderVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DiscountOrderParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(DiscountOrderParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiscountOrderParser#state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitState(DiscountOrderParser.StateContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiscountOrderParser#clientCode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClientCode(DiscountOrderParser.ClientCodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiscountOrderParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(DiscountOrderParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiscountOrderParser#discountType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiscountType(DiscountOrderParser.DiscountTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiscountOrderParser#recurrence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecurrence(DiscountOrderParser.RecurrenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiscountOrderParser#discountPercentage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiscountPercentage(DiscountOrderParser.DiscountPercentageContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiscountOrderParser#discountValor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiscountValor(DiscountOrderParser.DiscountValorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiscountOrderParser#invoiceID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvoiceID(DiscountOrderParser.InvoiceIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiscountOrderParser#deadline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeadline(DiscountOrderParser.DeadlineContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiscountOrderParser#year}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYear(DiscountOrderParser.YearContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiscountOrderParser#month}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMonth(DiscountOrderParser.MonthContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiscountOrderParser#day}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDay(DiscountOrderParser.DayContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiscountOrderParser#base}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBase(DiscountOrderParser.BaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiscountOrderParser#digits}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigits(DiscountOrderParser.DigitsContext ctx);
}