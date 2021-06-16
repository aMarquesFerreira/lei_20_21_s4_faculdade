package eapli.base.ANTLR.src;

import eapli.base.ANTLR.gen.DateBaseVisitor;
import eapli.base.ANTLR.gen.DateParser;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateVisitor extends DateBaseVisitor <String>{

    String verificacao = "";

    public String getResult(){
        return verificacao;
    }

    public Date getDate(String string) throws ParseException {
        Date firstDate = new SimpleDateFormat("dd.MM.yyyy").parse(string);

        return firstDate;
    }

    @Override
    public String visitState(DateParser.StateContext ctx) {
        String first = visit(ctx.getChild(0)); // get value of left date
        String second = visit(ctx.getChild(1)); // get value of right date
        Date firstDate = new Date(first);
        Date secondDate = new Date(second);
        if (firstDate.before(secondDate)) {
            return verificacao = "Ok";
        }
        else return verificacao = "NotOk";}

    @Override
    public String visitComparison(DateParser.ComparisonContext ctx) {
        String first = visit(ctx.date(0)); // get value of left date
        String second = visit(ctx.date(1)); // get value of right date
        Date firstDate = null;
        try {
            firstDate = getDate(first);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Date secondDate = null;
        try {
            secondDate = getDate(second);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        if (firstDate.before(secondDate)) {
            return verificacao = "Ok";
        }
        else return verificacao = "NotOk";
    }

    @Override
    public String visitDate(DateParser.DateContext ctx) {
        return super.visitDate(ctx);
    }

    @Override
    public String visitYear(DateParser.YearContext ctx) {
        return ctx.getChild(3).getText();
    }

    @Override
    public String visitMonth(DateParser.MonthContext ctx) {
        return ctx.getChild(2).getText();
    }

    @Override
    public String visitDay(DateParser.DayContext ctx) {
        return ctx.getChild(1).getText();
    }
}
