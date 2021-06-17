package eapli.base.ANTLR.src;

import eapli.base.ANTLR.gen.DiscountApprovalListener;
import eapli.base.ANTLR.gen.DiscountApprovalParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.Stack;

public class ApprovalListener implements DiscountApprovalListener {

    private final Stack<String> stack = new Stack<>();

    public String getResult() {
        return stack.peek();
    }

    @Override
    public void enterProgram(DiscountApprovalParser.ProgramContext ctx) {
       stack.push(ctx.getChild(0).getText());
    }

    @Override
    public void exitProgram(DiscountApprovalParser.ProgramContext ctx) {
        String child = stack.pop();
        String content="";
        if(child!=null){
            content = child;
        }
        stack.push(content);
    }

    @Override
    public void enterState(DiscountApprovalParser.StateContext ctx) {
        stack.push(ctx.getChild(0).getText());
    }

    @Override
    public void exitState(DiscountApprovalParser.StateContext ctx) {
        String child = stack.pop();
        String content="";
        if(child!=null){
            content = child;
        }
        stack.push(content);
    }

    @Override
    public void enterDecision(DiscountApprovalParser.DecisionContext ctx) {
        stack.push(ctx.getChild(0).getText());
    }

    @Override
    public void exitDecision(DiscountApprovalParser.DecisionContext ctx) {
        String child = stack.pop();
        String content="";
        if(child!=null){
            content = child;
        }
        stack.push(content);
    }

    @Override
    public void enterDiscountType(DiscountApprovalParser.DiscountTypeContext ctx) {
        stack.push(ctx.getChild(0).getText());
    }

    @Override
    public void exitDiscountType(DiscountApprovalParser.DiscountTypeContext ctx) {
        String child = stack.pop();
        String content="";
        if(child!=null){
            content = child;
        }
        stack.push(content);
    }

    @Override
    public void enterRecurrence(DiscountApprovalParser.RecurrenceContext ctx) {
        stack.push(ctx.getChild(0).getText());
    }

    @Override
    public void exitRecurrence(DiscountApprovalParser.RecurrenceContext ctx) {
        String child = stack.pop();
        String content="";
        if(child!=null){
            content = child;
        }
        stack.push(content);
    }

    @Override
    public void enterConfirmPercentage(DiscountApprovalParser.ConfirmPercentageContext ctx) {
        stack.push(ctx.getChild(0).getText());
    }

    @Override
    public void exitConfirmPercentage(DiscountApprovalParser.ConfirmPercentageContext ctx) {
        String child = stack.pop();
        String content="";
        if(child!=null){
            content = child;
        }
        stack.push(content);
    }

    @Override
    public void enterConfirmValue(DiscountApprovalParser.ConfirmValueContext ctx) {
        stack.push(ctx.getChild(0).getText());
    }

    @Override
    public void exitConfirmValue(DiscountApprovalParser.ConfirmValueContext ctx) {
        String child = stack.pop();
        String content="";
        if(child!=null){
            content = child;
        }
        stack.push(content);
    }

    @Override
    public void enterInvoiceID(DiscountApprovalParser.InvoiceIDContext ctx) {
        stack.push(ctx.getChild(0).getText());
    }

    @Override
    public void exitInvoiceID(DiscountApprovalParser.InvoiceIDContext ctx) {
        String child = stack.pop();
        String content="";
        if(child!=null){
            content = child;
        }
        stack.push(content);
    }

    @Override
    public void enterDeadline(DiscountApprovalParser.DeadlineContext ctx) {
        stack.push(ctx.getChild(0).getText());
    }

    @Override
    public void exitDeadline(DiscountApprovalParser.DeadlineContext ctx) {
        String child = stack.pop();
        String content="";
        if(child!=null){
            content = child;
        }
        stack.push(content);
    }

    @Override
    public void enterYear(DiscountApprovalParser.YearContext ctx) {
        stack.push(ctx.getChild(0).getText());
    }

    @Override
    public void exitYear(DiscountApprovalParser.YearContext ctx) {
        String child = stack.pop();
        String content="";
        if(child!=null){
            content = child;
        }
        stack.push(content);
    }

    @Override
    public void enterMonth(DiscountApprovalParser.MonthContext ctx) {
        stack.push(ctx.getChild(0).getText());
    }

    @Override
    public void exitMonth(DiscountApprovalParser.MonthContext ctx) {
        String child = stack.pop();
        String content="";
        if(child!=null){
            content = child;
        }
        stack.push(content);
    }

    @Override
    public void enterDay(DiscountApprovalParser.DayContext ctx) {
        stack.push(ctx.getChild(0).getText());
    }

    @Override
    public void exitDay(DiscountApprovalParser.DayContext ctx) {
        String child = stack.pop();
        String content="";
        if(child!=null){
            content = child;
        }
        stack.push(content);
    }

    @Override
    public void enterBase(DiscountApprovalParser.BaseContext ctx) {
        stack.push(ctx.getChild(0).getText());

    }

    @Override
    public void exitBase(DiscountApprovalParser.BaseContext ctx) {
        String child = stack.pop();
        String content="";
        if(child!=null){
            content = child;
        }
        stack.push(content);
    }

    @Override
    public void visitTerminal(TerminalNode terminalNode) {
        stack.push(terminalNode.getChild(0).getText());    }

    @Override
    public void visitErrorNode(ErrorNode errorNode) {
        stack.push(errorNode.getChild(0).getText());    }

    @Override
    public void enterEveryRule(ParserRuleContext parserRuleContext) {
        parserRuleContext.getChild(0).getText();
    }

    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext) {
        String child = stack.pop();
        String content="";
        if(child!=null){
            content = child;
        }
        stack.push(content);
    }
}
