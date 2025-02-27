// Generated from c:/Users/uo294193/Desktop/DLP-2425-ANTLR/specifications/Grammar.g4 by ANTLR 4.13.1
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
	 * Enter a parse tree produced by {@link GrammarParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(GrammarParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(GrammarParser.ParameterContext ctx);
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
	 * Enter a parse tree produced by {@link GrammarParser#expressionSuffix}.
	 * @param ctx the parse tree
	 */
	void enterExpressionSuffix(GrammarParser.ExpressionSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#expressionSuffix}.
	 * @param ctx the parse tree
	 */
	void exitExpressionSuffix(GrammarParser.ExpressionSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(GrammarParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(GrammarParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(GrammarParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(GrammarParser.CastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(GrammarParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(GrammarParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(GrammarParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(GrammarParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(GrammarParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(GrammarParser.FieldDeclarationContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link GrammarParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(GrammarParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(GrammarParser.PrimitiveTypeContext ctx);
}