package de.neusta;// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ArrayParser}.
 */
public interface ArrayListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ArrayParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ArrayParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArrayParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ArrayParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArrayParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(ArrayParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArrayParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(ArrayParser.ValueContext ctx);
}