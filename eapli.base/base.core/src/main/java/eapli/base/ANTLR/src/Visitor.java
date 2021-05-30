
public class Visitor extends VerificationsBaseVisitor<Integer> {
    @Override
    public Integer visitProgram(VerificationsParser.ProgramContext ctx) {
        String program = ctx.getChild(0).getText();
        return Integer.parseInt(program);
    }

    @Override
    public Integer visitState(VerificationsParser.StateContext ctx) {
        String state = ctx.getChild(0).getText();
        return Integer.parseInt(state);
    }

    @Override
    public Integer visitFormID(VerificationsParser.FormIDContext ctx) {
        String formID = ctx.getChild(0).getText();
        return Integer.parseInt(formID);
    }

    @Override
    public Integer visitName(VerificationsParser.NameContext ctx) {
        String name = ctx.getChild(0).getText();
        return Integer.parseInt(name);
    }

    @Override
    public Integer visitTypeOfData(VerificationsParser.TypeOfDataContext ctx) {
        String typeOfData = ctx.getChild(0).getText();
        return Integer.parseInt(typeOfData);
    }

    @Override
    public Integer visitDescription(VerificationsParser.DescriptionContext ctx) {
        String description = ctx.getChild(0).getText();
        return Integer.parseInt(description);
    }

    @Override
    public Integer visitLetters(VerificationsParser.LettersContext ctx) {
        String letters = ctx.getChild(0).getText();
        return Integer.parseInt(letters);
    }

    @Override
    public Integer visitNumber(VerificationsParser.NumberContext ctx) {
        String numText = ctx.getChild(0).getText();
        int num = Integer.parseInt(numText);
        return num;
    }
}