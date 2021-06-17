package eapli.base.ANTLR.src;

import eapli.base.ANTLR.gen.FormCheckBaseListener;
import eapli.base.ANTLR.gen.FormCheckParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.Stack;

public class FormCheckListener extends FormCheckBaseListener {

    private final Stack<String> stack = new Stack<>();

    public String getResult() {
        return stack.peek();
    }

    @Override
    public void enterProgram(FormCheckParser.ProgramContext ctx) {
        stack.push(ctx.getChild(0).getText());
    }

    @Override
    public void exitProgram(FormCheckParser.ProgramContext ctx) {
        String child = stack.pop();
        String content="";
        if(child!=null){
            content = child;
        }
        stack.push(content);
    }

    @Override
    public void enterState(FormCheckParser.StateContext ctx) {
        stack.push(ctx.getParent().getText());
    }

    @Override
    public void exitState(FormCheckParser.StateContext ctx) {
        String child = stack.pop();
        String content="";
        if(child!=null){
            content = child;
        }
        stack.push(content);
    }

    @Override
    public void enterFormID(FormCheckParser.FormIDContext ctx) {
        stack.push(ctx.getChild(0).getText());
    }

    @Override
    public void exitFormID(FormCheckParser.FormIDContext ctx) {
        String child = stack.pop();
        String content="";
        if(child!=null){
            content = child;
        }
        stack.push(content);
    }

    @Override
    public void enterNames(FormCheckParser.NamesContext ctx) {
        stack.push(ctx.getChild(0).getText());
    }

    @Override
    public void exitNames(FormCheckParser.NamesContext ctx) {
        String child = stack.pop();
        String content="";
        if(child!=null){
            content = child;
        }
        stack.push(content);

    }

    @Override
    public void enterName(FormCheckParser.NameContext ctx) {
        stack.push(ctx.getChild(0).getText());
    }

    @Override
    public void exitName(FormCheckParser.NameContext ctx) {
        String child = stack.pop();
        String content="";
        if(child!=null){
            content = child;
        }
        stack.push(content);
    }

    @Override
    public void enterTypeOfData(FormCheckParser.TypeOfDataContext ctx) {
        stack.push(ctx.getChild(0).getChild(2).getText());
    }

    @Override
    public void exitTypeOfData(FormCheckParser.TypeOfDataContext ctx) {
        String child = stack.pop();
        String content="";
        if(child!=null){
            content = child;
        }
        stack.push(content);
    }

    @Override
    public void enterDescription(FormCheckParser.DescriptionContext ctx) {
        stack.push(ctx.getChild(0).getText());
    }

    @Override
    public void exitDescription(FormCheckParser.DescriptionContext ctx) {
        String child = stack.pop();
        String content="";
        if(child!=null){
            content = child;
        }
        stack.push(content);
    }

    @Override
    public void enterLetters(FormCheckParser.LettersContext ctx) {
        super.enterLetters(ctx);
    }

    @Override
    public void exitLetters(FormCheckParser.LettersContext ctx) {
        String child = stack.pop();
        String content="";
        if(child!=null){
            content = child;
        }
        stack.push(content);
    }

    @Override
    public void enterIgnore(FormCheckParser.IgnoreContext ctx) {
        super.enterIgnore(ctx);
    }

    @Override
    public void exitIgnore(FormCheckParser.IgnoreContext ctx) {
        String child = stack.pop();
        String content="";
        if(child!=null){
            content = child;
        }
        stack.push(content);
    }

    @Override
    public void enterNumber(FormCheckParser.NumberContext ctx) {
        super.enterNumber(ctx);
    }

    @Override
    public void exitNumber(FormCheckParser.NumberContext ctx) {
        String child = stack.pop();
        String content="";
        if(child!=null){
            content = child;
        }
        stack.push(content);
    }

    @Override
    public void enterOk(FormCheckParser.OkContext ctx) {
        super.enterOk(ctx);
    }

    @Override
    public void exitOk(FormCheckParser.OkContext ctx) {
        String child = stack.pop();
        String content="";
        if(child!=null){
            content = child;
        }
        stack.push(content);
    }

    @Override
    public void enterNotok(FormCheckParser.NotokContext ctx) {
        super.enterNotok(ctx);
    }

    @Override
    public void exitNotok(FormCheckParser.NotokContext ctx) {
        String child = stack.pop();
        String content="";
        if(child!=null){
            content = child;
        }
        stack.push(content);
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        super.enterEveryRule(ctx);
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        String child = stack.pop();
        String content="";
        if(child!=null){
            content = child;
        }
        stack.push(content);
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        super.visitTerminal(node);
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        super.visitErrorNode(node);
    }
}
