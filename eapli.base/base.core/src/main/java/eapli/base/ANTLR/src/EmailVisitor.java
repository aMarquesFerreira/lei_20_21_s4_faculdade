import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class EmailVisitor implements EmailInfoCheckVisitor<String>{
    @Override
    public String visitState(EmailInfoCheckParser.StateContext ctx) {
        return ctx.getChild(0).getText();
    }

    @Override
    public String visitEmail(EmailInfoCheckParser.EmailContext ctx) {
        return ctx.getParent().getText();
    }

    @Override
    public String visitTypeOfEmail(EmailInfoCheckParser.TypeOfEmailContext ctx) {
        return ctx.getChild(2).getText();
    }

    @Override
    public String visitDomain(EmailInfoCheckParser.DomainContext ctx) {
        return ctx.getChild(3).getText();
    }

    @Override
    public String visitUsername(EmailInfoCheckParser.UsernameContext ctx) {
        return ctx.getChild(0).getText();
    }

    @Override
    public String visitAtSign(EmailInfoCheckParser.AtSignContext ctx) {
        return ctx.getChild(1).getText();
    }

    @Override
    public String visit(ParseTree parseTree) {
        return parseTree.getText();
    }

    @Override
    public String visitChildren(RuleNode ruleNode) {
        return ruleNode.getText();
    }

    @Override
    public String visitTerminal(TerminalNode terminalNode) {
        return terminalNode.getText();
    }

    @Override
    public String visitErrorNode(ErrorNode errorNode) {
        return errorNode.getText();
    }
}
