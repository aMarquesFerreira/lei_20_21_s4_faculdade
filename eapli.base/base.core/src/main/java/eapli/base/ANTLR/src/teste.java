import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class teste {
        public static void main(String[] args) throws FileNotFoundException {
            /*Scanner scanner = new Scanner(System.in);
            String teste = scanner.nextLine();
            //FileInputStream fis = new FileInputStream(new File("eapli.base/base.core/src/main/java/eapli/base/ANTLR/teste.txt"));
            RulesLexer lexer = new RulesLexer(new ANTLRInputStream(teste));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            RulesParser parser = new RulesParser(tokens);
            ParseTree tree = parser.prog(); // parse
            EvalVisitor eval = new EvalVisitor();
            System.out.println("Valor Total :" + eval.visit(tree) + "€");*/

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
    }


