package eapli.base.ANTLR.src;

import eapli.base.ANTLR.gen.*;
import eapli.base.EmailService;
import eapli.base.activitymanagement.domain.ActivityExecution;
import eapli.base.ticketmanagement.domain.Ticket;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Scanner;

public class teste {
       /* public static void main(String[] args) throws IOException {
            Scanner scanner = new Scanner(System.in);
            String teste = scanner.nextLine();
            FileInputStream fis = new FileInputStream(new File("eapli.base/base.core/src/main/java/eapli/base/ANTLR/testeRules.txt"));
            RulesLexer lexer = new RulesLexer(new ANTLRInputStream(teste));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            RulesParser parser = new RulesParser(tokens);
            ParseTree tree = parser.prog(); // parse
            EvalVisitor eval = new EvalVisitor();
            eval.visit(tree);
            System.out.println("Valor Total :" + eval.result() + "€");


            Scanner scanner = new Scanner(System.in);
            String teste = scanner.nextLine();
            FileInputStream fis = new FileInputStream("eapli.base/base.core/src/main/java/eapli/base/ANTLR/testeVerifications.txt");
            VerificationsLexer lexer = new VerificationsLexer(new ANTLRInputStream(teste));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            VerificationsParser parser = new VerificationsParser(tokens);

            // syntax error handling
            parser.removeErrorListeners();
            parser.addErrorListener(new ThrowingErrorListener());

            ParseTree tree = parser.program(); // parse
            ParseTreeWalker walker = new ParseTreeWalker();
            Visitor eval = new Visitor();
            Listener listener = new Listener();
            walker.walk(listener,tree);
            //eval.visit(tree);
            System.out.println(listener.getResult());


        }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String teste = scanner.nextLine();
        FileInputStream fis = new FileInputStream(new File("eapli.base/base.core/src/main/java/eapli/base/ANTLR/testeRules.txt"));
        DateLexer lexer = new DateLexer(new ANTLRInputStream(teste));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DateParser parser = new DateParser(tokens);
        ParseTree tree = parser.state(); // parse
        DateVisitor eval = new DateVisitor();
        eval.visit(tree);
        String value = eval.getResult();
        System.out.println("Estado :" + value );

    }
*/ 

   public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String teste = scanner.nextLine();
        //FileInputStream fis = new FileInputStream(new File("eapli.base/base.core/src/main/java/eapli/base/ANTLR/testeRules.txt"));
        DiscountApprovalLexer lexer = new DiscountApprovalLexer(new ANTLRInputStream(teste));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DiscountApprovalParser parser = new DiscountApprovalParser(tokens);
        ParseTree tree = parser.state(); // parse
        ParseTreeWalker walker = new ParseTreeWalker();
        ApprovalListener approvalListener = new ApprovalListener();
        walker.walk(approvalListener, tree);

        System.out.println(approvalListener.getResult());

    }
   
   /*public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        ActivityExecution actExec;
        String teste = actExec.getFormAnswer().
        //FileInputStream fis = new FileInputStream(new File("eapli.base/base.core/src/main/java/eapli/base/ANTLR/testeRules.txt"));
        DiscountApprovalLexer lexer = new DiscountApprovalLexer(new ANTLRInputStream(teste));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DiscountApprovalParser parser = new DiscountApprovalParser(tokens);
        ParseTree tree = parser.state(); // parse
        ParseTreeWalker walker = new ParseTreeWalker();
        ApprovalListener approvalListener = new ApprovalListener();
        walker.walk(approvalListener, tree);

        System.out.println(approvalListener.getResult());

    }*/
   
   

    /*public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String teste = scanner.nextLine();
        FileInputStream fis = new FileInputStream(new File("eapli.base/base.core/src/main/java/eapli/base/ANTLR/testeRules.txt"));
        FileReaderLexer lexer = new FileReaderLexer(new ANTLRInputStream(teste));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        FileReaderParser parser = new FileReaderParser(tokens);
        ParseTree tree = parser.state(); // parse
        ParseTreeWalker walker = new ParseTreeWalker();
        FileReadVisitor fileReadVisitor = new FileReadVisitor();
        fileReadVisitor.visit(tree);

        System.out.println(fileReadVisitor.getResult());

    }*/



    //ESTE MÉTODO ESTÁ A SER USADO
    private static void sendEmail(String from, String to, String subject, String body) {
        EmailService eService = new EmailService(to, from);
        eService.send(subject, body);

    }
}




