import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.Stack;

public class EvalListener implements RulesListener {

    private final Stack<Integer> stack = new Stack<>();

    public int getResult() {
        return stack.peek();
    }

    @Override
    public void enterProg(RulesParser.ProgContext ctx) {
        stack.push(Integer.valueOf(ctx.getChild(0).getText()));
    }

    @Override
    public void exitProg(RulesParser.ProgContext ctx) {

    }

    @Override
    public void enterPrintExpr(RulesParser.PrintExprContext ctx) {

    }

    @Override
    public void exitPrintExpr(RulesParser.PrintExprContext ctx) {

    }

    @Override
    public void enterAssign(RulesParser.AssignContext ctx) {

    }

    @Override
    public void exitAssign(RulesParser.AssignContext ctx) {

    }

    @Override
    public void enterBlank(RulesParser.BlankContext ctx) {

    }

    @Override
    public void exitBlank(RulesParser.BlankContext ctx) {

    }

    @Override
    public void enterParens(RulesParser.ParensContext ctx) {

    }

    @Override
    public void exitParens(RulesParser.ParensContext ctx) {

    }

    @Override
    public void enterMulDiv(RulesParser.MulDivContext ctx) {

    }

    @Override
    public void exitMulDiv(RulesParser.MulDivContext ctx) {

    }

    @Override
    public void enterAddSub(RulesParser.AddSubContext ctx) {

    }

    @Override
    public void exitAddSub(RulesParser.AddSubContext ctx) {

    }

    @Override
    public void enterId(RulesParser.IdContext ctx) {

    }

    @Override
    public void exitId(RulesParser.IdContext ctx) {

    }

    @Override
    public void enterInt(RulesParser.IntContext ctx) {

    }

    @Override
    public void exitInt(RulesParser.IntContext ctx) {

    }

    @Override
    public void visitTerminal(TerminalNode terminalNode) {

    }

    @Override
    public void visitErrorNode(ErrorNode errorNode) {

    }

    @Override
    public void enterEveryRule(ParserRuleContext parserRuleContext) {

    }

    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext) {

    }
}
