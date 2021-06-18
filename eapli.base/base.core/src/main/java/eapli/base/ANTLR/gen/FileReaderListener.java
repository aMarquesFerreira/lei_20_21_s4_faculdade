// Generated from C:/Users/torre/OneDrive/Ambiente de Trabalho/lei20_21_s4_2db_03/eapli.base/base.core/src/main/java/eapli/base/ANTLR\FileReader.g4 by ANTLR 4.9.1
package eapli.base.ANTLR.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FileReaderParser}.
 */
public interface FileReaderListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FileReaderParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(FileReaderParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link FileReaderParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(FileReaderParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code read}
	 * labeled alternative in {@link FileReaderParser#state}.
	 * @param ctx the parse tree
	 */
	void enterRead(FileReaderParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code read}
	 * labeled alternative in {@link FileReaderParser#state}.
	 * @param ctx the parse tree
	 */
	void exitRead(FileReaderParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link FileReaderParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(FileReaderParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link FileReaderParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(FileReaderParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link FileReaderParser#typeOfFile}.
	 * @param ctx the parse tree
	 */
	void enterTypeOfFile(FileReaderParser.TypeOfFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link FileReaderParser#typeOfFile}.
	 * @param ctx the parse tree
	 */
	void exitTypeOfFile(FileReaderParser.TypeOfFileContext ctx);
}