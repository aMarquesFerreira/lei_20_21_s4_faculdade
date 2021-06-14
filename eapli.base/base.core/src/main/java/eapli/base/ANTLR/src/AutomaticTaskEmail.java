package eapli.base.ANTLR.src;

import eapli.base.ANTLR.gen.*;
import eapli.base.EmailService;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.Scanner;

public class AutomaticTaskEmail {

    public static void main(String[] args) throws FileNotFoundException {

        Session session = criarSessionMail();


            Scanner scanner = new Scanner(System.in);

            String teste = scanner.nextLine();
            //FileInputStream fis = new FileInputStream(new File("eapli.base/base.core/src/main/java/eapli/base/ANTLR/teste.txt"));
            RulesLexer lexer = new RulesLexer(new ANTLRInputStream(teste));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            RulesParser parser = new RulesParser(tokens);
            ParseTree tree = parser.prog(); // parse
            EvalVisitor eval = new EvalVisitor();
            String content =  ("Pagamento:" + eval.visit(tree) + "€");


        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Insira o destinatário :");
        String email = scanner.nextLine();
        System.out.println("Insira o titulo :");
        String title = scanner.nextLine();
        //System.out.println("Insira o conteudo :");
        //String content = scanner.nextLine();

        EmailInfoCheckLexer lexerEmail = new EmailInfoCheckLexer(new ANTLRInputStream(email));
        CommonTokenStream tokensEmail = new CommonTokenStream(lexerEmail);
        EmailInfoCheckParser parserEmail = new EmailInfoCheckParser(tokensEmail);

        TitleInfoCheckLexer lexerTitle = new TitleInfoCheckLexer(new ANTLRInputStream(title));
        CommonTokenStream tokensTitle = new CommonTokenStream(lexerTitle);
        TitleInfoCheckParser parserTitle = new TitleInfoCheckParser(tokensTitle);

        ContentInfoCheckLexer lexerContent = new ContentInfoCheckLexer(new ANTLRInputStream(content));
        CommonTokenStream tokensContent = new CommonTokenStream(lexerContent);
        ContentInfoCheckParser parserContent = new ContentInfoCheckParser(tokensContent);

        // syntax error handling
        parserEmail.removeErrorListeners();
        parserEmail.addErrorListener(new ThrowingErrorListener());

        parserTitle.removeErrorListeners();
        parserTitle.addErrorListener(new ThrowingErrorListener());

        parserContent.removeErrorListeners();
        parserContent.addErrorListener(new ThrowingErrorListener());

        ParseTree treeEmail = parserEmail.state(); // parse
        ParseTree treeTitle = parserTitle.state(); // parse
        ParseTree treeContent = parserContent.state(); // parse

        EmailVisitor emVisitor = new EmailVisitor();
        TitleVisitor  tiVisitor = new TitleVisitor();
        ContentVisitor contVisitor = new ContentVisitor();

        String to = emVisitor.visit(treeEmail).toString();
        String subject = tiVisitor.visit(treeTitle).toString();
        String body = contVisitor.visit(treeContent).toString();

        sendEmail("36861@ufp.edu.pt", to, subject, body, session);

    }


    private static void sendEmail(String from, String to, String subject, String body, Session session) {

        EmailService eService = new EmailService(to, from, session);
        eService.send(subject, body);

    }

    private static Session criarSessionMail() {
        Properties props = new Properties();

        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", 465);
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", true);
        props.put("mail.smtp.port", 465);

        Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {

            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("antmen132@gmail.com", "laprevida");
            }
        });

        session.setDebug(true);

        return session;
    }
}
