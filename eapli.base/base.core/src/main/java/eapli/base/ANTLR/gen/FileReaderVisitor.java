// Generated from C:/Users/torre/OneDrive/Ambiente de Trabalho/lei20_21_s4_2db_03/eapli.base/base.core/src/main/java/eapli/base/ANTLR\FileReader.g4 by ANTLR 4.9.1
package eapli.base.ANTLR.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

import java.io.FileNotFoundException;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FileReaderParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FileReaderVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FileReaderParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(FileReaderParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code read}
	 * labeled alternative in {@link FileReaderParser#state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead(FileReaderParser.ReadContext ctx) throws FileNotFoundException;
	/**
	 * Visit a parse tree produced by {@link FileReaderParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(FileReaderParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link FileReaderParser#typeOfFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeOfFile(FileReaderParser.TypeOfFileContext ctx);
}