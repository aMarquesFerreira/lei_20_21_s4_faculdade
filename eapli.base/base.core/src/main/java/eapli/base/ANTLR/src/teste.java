
import java.io.*;
import java.util.Scanner;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class teste {
        public static void main(String[] args) throws IOException {
            /*Scanner scanner = new Scanner(System.in);
            String teste = scanner.nextLine();
            //FileInputStream fis = new FileInputStream(new File("eapli.base/base.core/src/main/java/eapli/base/ANTLR/teste.txt"));
            RulesLexer lexer = new RulesLexer(new ANTLRInputStream(teste));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            RulesParser parser = new RulesParser(tokens);
            ParseTree tree = parser.prog(); // parse
            EvalVisitor eval = new EvalVisitor();
            System.out.println("Valor Total :" + eval.visit(tree) + "€");*/


            FileInputStream fis = new FileInputStream("eapli.base/base.core/src/main/java/eapli/base/ANTLR/testeVerifications.txt");
            VerificationsLexer lexer = new VerificationsLexer(new ANTLRInputStream(fis));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            VerificationsParser parser = new VerificationsParser(tokens);
            ParseTree tree = parser.program(); // parse
            Visitor eval = new Visitor();
            eval.visit(tree);
        }
    }


