package eapli.base.ANTLR.src;

import eapli.base.ANTLR.gen.FormCheckBaseVisitor;
import eapli.base.ANTLR.gen.FormCheckParser;

public class FormCheckVisitor extends FormCheckBaseVisitor<String> {

    @Override
    public String visitProgram(FormCheckParser.ProgramContext ctx) {
        return ctx.getChild(0).getText();
    }

    @Override
    public String visitState(FormCheckParser.StateContext ctx) {
        return ctx.getParent().getText();
    }

    @Override
    public String visitFormID(FormCheckParser.FormIDContext ctx) {
        return ctx.getChild(0).getText();
    }

    @Override
    public String visitName(FormCheckParser.NameContext ctx) { return ctx.getChild(1).getText(); }

    @Override
    public String visitTypeOfData(FormCheckParser.TypeOfDataContext ctx) {
        return ctx.getChild(2).getText();
    }

    @Override
    public String visitNames(FormCheckParser.NamesContext ctx){
        return ctx.getChild(3).getText();

    }
}