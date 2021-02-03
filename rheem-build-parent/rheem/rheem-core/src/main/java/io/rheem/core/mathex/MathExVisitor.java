package io.rheem.core.mathex;// Generated from D:/ideaprojects/rheem-offical/rheem-integer/rheem-build-parent/rheem/rheem-core/src/main/antlr4/io/rheem/core/mathex\MathEx.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MathExParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MathExVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code constant}
	 * labeled alternative in {@link MathExParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(MathExParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code function}
	 * labeled alternative in {@link MathExParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(MathExParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variable}
	 * labeled alternative in {@link MathExParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(MathExParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parensExpression}
	 * labeled alternative in {@link MathExParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParensExpression(MathExParser.ParensExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binaryOperation}
	 * labeled alternative in {@link MathExParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryOperation(MathExParser.BinaryOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryOperation}
	 * labeled alternative in {@link MathExParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOperation(MathExParser.UnaryOperationContext ctx);
}