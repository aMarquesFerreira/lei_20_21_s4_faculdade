package eapli.base.ANTLR.src;

import eapli.base.ANTLR.gen.TitleInfoCheckParser;
import eapli.base.ANTLR.gen.TitleInfoCheckVisitor;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class TitleVisitor implements TitleInfoCheckVisitor<String> {
    @Override
    public String visitState(TitleInfoCheckParser.StateContext ctx) {
        return ctx.getChild(0).getText();
    }

    @Override
    public String visitTitle(TitleInfoCheckParser.TitleContext ctx) {
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
