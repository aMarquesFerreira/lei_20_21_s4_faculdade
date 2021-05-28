// Generated from C:/Users/torre/OneDrive/Documentos/lei20_21_s4_2db_03/eapli.base/base.core/src/main/java/eapli/base/ANTLR\Rules.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RulesParser}.
 */
public interface RulesListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RulesParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(RulesParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link RulesParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(RulesParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link RulesParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpr(RulesParser.PrintExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link RulesParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpr(RulesParser.PrintExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link RulesParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssign(RulesParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link RulesParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssign(RulesParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blank}
	 * labeled alternative in {@link RulesParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterBlank(RulesParser.BlankContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link RulesParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitBlank(RulesParser.BlankContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parens}
	 * labeled alternative in {@link RulesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParens(RulesParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link RulesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParens(RulesParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link RulesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(RulesParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link RulesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(RulesParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link RulesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(RulesParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link RulesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(RulesParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link RulesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterId(RulesParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link RulesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitId(RulesParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link RulesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInt(RulesParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link RulesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInt(RulesParser.IntContext ctx);
}