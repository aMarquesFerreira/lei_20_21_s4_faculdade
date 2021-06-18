package eapli.base.ANTLR.src;

import eapli.base.ANTLR.gen.DiscountOrderBaseVisitor;
import eapli.base.ANTLR.gen.DiscountOrderParser;
import eapli.base.ANTLR.gen.DiscountOrderVisitor;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class OrderVisitor extends DiscountOrderBaseVisitor<String> {

    @Override
    public String visitProgram(DiscountOrderParser.ProgramContext ctx) {
        return ctx.getChild(0).getText();
    }

    @Override
    public String visitState(DiscountOrderParser.StateContext ctx) {
        return visit(ctx);
    }

    @Override
    public String visitClientCode(DiscountOrderParser.ClientCodeContext ctx) {
        return visit(ctx);
    }

    @Override
    public String visitName(DiscountOrderParser.NameContext ctx) {
        return visit(ctx);
    }

    @Override
    public String visitDiscountType(DiscountOrderParser.DiscountTypeContext ctx) {
        return visit(ctx);
    }
}
