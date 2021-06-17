// Generated from C:/Users/torre/OneDrive/Ambiente de Trabalho/lei20_21_s4_2db_03/eapli.base/base.core/src/main/java/eapli/base/ANTLR\Calculations.g4 by ANTLR 4.9.1
package eapli.base.ANTLR.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalculationsParser}.
 */
public interface CalculationsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalculationsParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(CalculationsParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculationsParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(CalculationsParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link CalculationsParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpr(CalculationsParser.PrintExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link CalculationsParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpr(CalculationsParser.PrintExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link CalculationsParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssign(CalculationsParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link CalculationsParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssign(CalculationsParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blank}
	 * labeled alternative in {@link CalculationsParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterBlank(CalculationsParser.BlankContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link CalculationsParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitBlank(CalculationsParser.BlankContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parens}
	 * labeled alternative in {@link CalculationsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParens(CalculationsParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link CalculationsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParens(CalculationsParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link CalculationsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(CalculationsParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link CalculationsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(CalculationsParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link CalculationsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(CalculationsParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link CalculationsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(CalculationsParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link CalculationsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterId(CalculationsParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link CalculationsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitId(CalculationsParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link CalculationsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInt(CalculationsParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link CalculationsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInt(CalculationsParser.IntContext ctx);
}