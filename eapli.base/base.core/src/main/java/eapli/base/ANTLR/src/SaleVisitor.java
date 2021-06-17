package eapli.base.ANTLR.src;

import eapli.base.ANTLR.gen.SalesParser;
import eapli.base.ANTLR.gen.SalesVisitor;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class SaleVisitor implements SalesVisitor<String> {

    @Override
    public String visitProgram(SalesParser.ProgramContext ctx) {
        return visit(ctx);
    }

    @Override
    public String visitState(SalesParser.StateContext ctx) {
        return visit(ctx);
    }

    @Override
    public String visitProductCode(SalesParser.ProductCodeContext ctx) {
        return visit(ctx);
    }

    @Override
    public String visitQuantity(SalesParser.QuantityContext ctx) {
        return visit(ctx);
    }

    @Override
    public String visitClientType(SalesParser.ClientTypeContext ctx) {
        return visit(ctx);
    }

    @Override
    public String visitLetter(SalesParser.LetterContext ctx) {
        return visit(ctx);
    }

    @Override
    public String visit(ParseTree parseTree) {
        return visit(parseTree);
    }

    @Override
    public String visitChildren(RuleNode ruleNode) {
        return visit(ruleNode);
    }

    @Override
    public String visitTerminal(TerminalNode terminalNode) {
        return visit(terminalNode);
    }

    @Override
    public String visitErrorNode(ErrorNode errorNode) {
        return visit(errorNode);
    }
}
