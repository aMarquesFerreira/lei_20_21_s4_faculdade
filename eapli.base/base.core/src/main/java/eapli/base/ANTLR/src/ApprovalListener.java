package eapli.base.ANTLR.src;

import eapli.base.ANTLR.gen.DiscountApprovalBaseListener;
import eapli.base.ANTLR.gen.DiscountApprovalListener;
import eapli.base.ANTLR.gen.DiscountApprovalParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import javax.mail.Session;
import java.util.Stack;

import static eapli.base.ANTLR.src.AutomaticTaskEmail.criarSessionMail;
import static eapli.base.ANTLR.src.AutomaticTaskEmail.sendEmail;

public class ApprovalListener extends DiscountApprovalBaseListener {

    private final Stack<String> stack = new Stack<>();

    public String getResult() {
        return stack.peek();
    }

    @Override
    public void enterProgram(DiscountApprovalParser.ProgramContext ctx) {
       stack.push(ctx.getChild(0).getText());
    }

    @Override
    public void exitProgram(DiscountApprovalParser.ProgramContext ctx) {
        String child = stack.pop();
        String content="";
        if(child!=null){
            content = child;
        }
        stack.push(content);
    }

    @Override
    public void enterSendEmail(DiscountApprovalParser.SendEmailContext ctx) {
        stack.push(ctx.getChild(0).getText());
    }

    @Override
    public void exitSendEmail(DiscountApprovalParser.SendEmailContext ctx) {
        Session session = criarSessionMail();

        String description = ctx.getChild(0).getText();
        String percentage = ctx.getChild(4).getText();

        String subject = "Resultado do pedido de aplicação de desconto";
        String body = "O seu pedido de " + percentage + " desconto " + "foi " + description;

        String to = "1191526@isep.ipp.pt";

        if(sendEmail("1191526@isep.ipp.pt", to, subject, body, session))     stack.push("Ok");
            else stack.push("NotOk");
    }
}
