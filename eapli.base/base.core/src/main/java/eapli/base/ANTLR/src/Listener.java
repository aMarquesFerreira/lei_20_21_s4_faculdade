import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.Stack;

public class Listener extends VerificationsBaseListener {

    private final Stack<String> stack = new Stack<>();

    public String getResult() {
        return stack.peek();
    }

    @Override
    public void enterProgram(VerificationsParser.ProgramContext ctx) {
        stack.push(ctx.getChild(0).getText());
    }

    @Override
    public void exitProgram(VerificationsParser.ProgramContext ctx) {
        String child = stack.pop();
        String content="";
        if(child!=null){
            content = child;
        }
        stack.push(content);
    }

    @Override
    public void enterState(VerificationsParser.StateContext ctx) {
        stack.push(ctx.getParent().getText());
    }

    @Override
    public void exitState(VerificationsParser.StateContext ctx) {
        String child = stack.pop();
        String content="";
        if(child!=null){
            content = child;
        }
        stack.push(content);
    }

    @Override
    public void enterFormID(VerificationsParser.FormIDContext ctx) {
        stack.push(ctx.getChild(0).getText());
    }

    @Override
    public void exitFormID(VerificationsParser.FormIDContext ctx) {
        String child = stack.pop();
        String content="";
        if(child!=null){
            content = child;
        }
        stack.push(content);
    }

    @Override
    public void enterNames(VerificationsParser.NamesContext ctx) {
        stack.push(ctx.getChild(0).getText());
    }

    @Override
    public void exitNames(VerificationsParser.NamesContext ctx) {
        String child = stack.pop();
        String content="";
        if(child!=null){
            content = child;
        }
        stack.push(content);

    }

    @Override
    public void enterName(VerificationsParser.NameContext ctx) {
        stack.push(ctx.getChild(0).getText());
    }

    @Override
    public void exitName(VerificationsParser.NameContext ctx) {
        String child = stack.pop();
        String content="";
        if(child!=null){
            content = child;
        }
        stack.push(content);
    }

    @Override
    public void enterTypeOfData(VerificationsParser.TypeOfDataContext ctx) {
        stack.push(ctx.getChild(0).getChild(2).getText());
    }

    @Override
    public void exitTypeOfData(VerificationsParser.TypeOfDataContext ctx) {
        String child = stack.pop();
        String content="";
        if(child!=null){
            content = child;
        }
        stack.push(content);
    }

    @Override
    public void enterDescription(VerificationsParser.DescriptionContext ctx) {
        stack.push(ctx.getChild(0).getText());
    }

    @Override
    public void exitDescription(VerificationsParser.DescriptionContext ctx) {
        String child = stack.pop();
        String content="";
        if(child!=null){
            content = child;
        }
        stack.push(content);
    }

    @Override
    public void enterLetters(VerificationsParser.LettersContext ctx) {
        super.enterLetters(ctx);
    }

    @Override
    public void exitLetters(VerificationsParser.LettersContext ctx) {
        String child = stack.pop();
        String content="";
        if(child!=null){
            content = child;
        }
        stack.push(content);
    }

    @Override
    public void enterIgnore(VerificationsParser.IgnoreContext ctx) {
        super.enterIgnore(ctx);
    }

    @Override
    public void exitIgnore(VerificationsParser.IgnoreContext ctx) {
        String child = stack.pop();
        String content="";
        if(child!=null){
            content = child;
        }
        stack.push(content);
    }

    @Override
    public void enterNumber(VerificationsParser.NumberContext ctx) {
        super.enterNumber(ctx);
    }

    @Override
    public void exitNumber(VerificationsParser.NumberContext ctx) {
        String child = stack.pop();
        String content="";
        if(child!=null){
            content = child;
        }
        stack.push(content);
    }

    @Override
    public void enterOk(VerificationsParser.OkContext ctx) {
        super.enterOk(ctx);
    }

    @Override
    public void exitOk(VerificationsParser.OkContext ctx) {
        String child = stack.pop();
        String content="";
        if(child!=null){
            content = child;
        }
        stack.push(content);
    }

    @Override
    public void enterNotok(VerificationsParser.NotokContext ctx) {
        super.enterNotok(ctx);
    }

    @Override
    public void exitNotok(VerificationsParser.NotokContext ctx) {
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
