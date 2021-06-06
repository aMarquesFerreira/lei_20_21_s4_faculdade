

public class Visitor extends VerificationsBaseVisitor<String> {

    @Override
    public String visitProgram(VerificationsParser.ProgramContext ctx) {
        return ctx.getChild(0).getText();
    }

    @Override
    public String visitState(VerificationsParser.StateContext ctx) {
        return ctx.getParent().getText();
    }

    @Override
    public String visitFormID(VerificationsParser.FormIDContext ctx) {
        return ctx.getChild(0).getText();
    }

    @Override
    public String visitName(VerificationsParser.NameContext ctx) {
        return ctx.getChild(1).getText();
    }

    @Override
    public String visitTypeOfData(VerificationsParser.TypeOfDataContext ctx) {
        return ctx.getChild(2).getText();
    }

    @Override
    public String visitNames(VerificationsParser.NamesContext ctx){
        return ctx.getChild(3).getText();

    }

    @Override
    public String visitDescription(VerificationsParser.DescriptionContext ctx) {
        return ctx.getChild(4).getText();

    }

    @Override
    public String visitLetters(VerificationsParser.LettersContext ctx) {
        return ctx.getChild(0).getText();

    }

    @Override
    public String visitNumber(VerificationsParser.NumberContext ctx) {
        return ctx.getChild(0).getText();

    }
}