// Generated from c:/Users/guill/Desktop/DLP-2425-ANTLR/specifications/Grammar.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(GrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(GrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaration(GrammarParser.StructDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaration(GrammarParser.StructDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(GrammarParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(GrammarParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(GrammarParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(GrammarParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(GrammarParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(GrammarParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(GrammarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(GrammarParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(GrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(GrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(GrammarParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(GrammarParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(GrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(GrammarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(GrammarParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(GrammarParser.TypeContext ctx);
}