package eapli.base.ANTLR.src;

import eapli.base.ANTLR.gen.FileReaderBaseVisitor;
import eapli.base.ANTLR.gen.FileReaderParser;
import eapli.base.ANTLR.gen.FileReaderVisitor;
import eapli.base.TXTFile;

import java.io.FileNotFoundException;

public class FileReadVisitor extends FileReaderBaseVisitor<String> {
    private String result = "";

    public String getResult(){
        return result;
    }

    @Override
    public String visitProgram(FileReaderParser.ProgramContext ctx) {
        return visit(ctx);
    }

    @Override
    public String visitRead(FileReaderParser.ReadContext ctx) throws FileNotFoundException {
        TXTFile txtFile = new TXTFile();
        String path = "eapli.base\\base.core\\src\\main\\java\\eapli\\base\\" + ctx.getChild(0).getText() + ctx.getChild(1).getText();
        if(!txtFile.readVerificationTypeOfDataAndContent(path).isEmpty()) {
            result = txtFile.readVerificationTypeOfDataAndContent(path);
            return result;
        }
        else return "Não existe a palavra!";
    }
}
