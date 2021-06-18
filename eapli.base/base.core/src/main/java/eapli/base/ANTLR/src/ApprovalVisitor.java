package eapli.base.ANTLR.src;

import eapli.base.ANTLR.gen.DiscountApprovalBaseVisitor;
import eapli.base.ANTLR.gen.DiscountApprovalParser;

import javax.mail.Session;

import static eapli.base.ANTLR.src.AutomaticTaskEmail.criarSessionMail;
import static eapli.base.ANTLR.src.AutomaticTaskEmail.sendEmail;

public class ApprovalVisitor extends DiscountApprovalBaseVisitor {
    @Override
    public Object visitProgram(DiscountApprovalParser.ProgramContext ctx) {
        return visit(ctx);
    }

    @Override
    public Object visitSendEmail(DiscountApprovalParser.SendEmailContext ctx) {
        Session session = criarSessionMail();

        String description = ctx.getChild(0).getText();
        String percentage = ctx.getChild(4).getText();

        String subject = "Resultado do pedido de aplicação de desconto";
        String body = "O seu pedido de " + percentage + " desconto " + "foi " + description;

        String to = "1191526@isep.ipp.pt";

        if(sendEmail("1191526@isep.ipp.pt", to, subject, body, session)) return "Ok";
            else return "NotOk";
    }
}

