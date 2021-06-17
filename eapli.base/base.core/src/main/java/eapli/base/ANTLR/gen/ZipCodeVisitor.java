// Generated from C:/Users/torre/OneDrive/Ambiente de Trabalho/lei20_21_s4_2db_03/eapli.base/base.core/src/main/java/eapli/base/ANTLR\ZipCode.g4 by ANTLR 4.9.1
package eapli.base.ANTLR.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ZipCodeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ZipCodeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ZipCodeParser#state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitState(ZipCodeParser.StateContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZipCodeParser#zip}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZip(ZipCodeParser.ZipContext ctx);
}