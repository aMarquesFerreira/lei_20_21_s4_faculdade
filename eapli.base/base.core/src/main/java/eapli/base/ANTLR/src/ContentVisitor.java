import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class ContentVisitor implements ContentInfoCheckVisitor<String>{

    @Override
    public String visitState(ContentInfoCheckParser.StateContext ctx) {
        return ctx.getChild(0).getText();
    }

    @Override
    public String visitContent(ContentInfoCheckParser.ContentContext ctx) {
        return ctx.getParent().getText();
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
