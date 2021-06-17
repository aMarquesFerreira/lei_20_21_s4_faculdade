package eapli.base.ANTLR.src;

import eapli.base.ANTLR.gen.DiscountOrderParser;
import eapli.base.ANTLR.gen.DiscountOrderVisitor;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class OrderVisitor implements DiscountOrderVisitor<String> {

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

    @Override
    public String visitRecurrence(DiscountOrderParser.RecurrenceContext ctx) {
        return visit(ctx);
    }

    @Override
    public String visitDiscountPercentage(DiscountOrderParser.DiscountPercentageContext ctx) {
        return visit(ctx);
    }

    @Override
    public String visitDiscountValor(DiscountOrderParser.DiscountValorContext ctx) {
        return visit(ctx);
    }

    @Override
    public String visitInvoiceID(DiscountOrderParser.InvoiceIDContext ctx) {
        return visit(ctx);
    }

    @Override
    public String visitDeadline(DiscountOrderParser.DeadlineContext ctx) {
        return visit(ctx);
    }

    @Override
    public String visitYear(DiscountOrderParser.YearContext ctx) {
        return visit(ctx);
    }

    @Override
    public String visitMonth(DiscountOrderParser.MonthContext ctx) {
        return visit(ctx);
    }

    @Override
    public String visitDay(DiscountOrderParser.DayContext ctx) {
        return visit(ctx);
    }

    @Override
    public String visitBase(DiscountOrderParser.BaseContext ctx) {
        return visit(ctx);
    }

    @Override
    public String visitDigits(DiscountOrderParser.DigitsContext ctx) {
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
