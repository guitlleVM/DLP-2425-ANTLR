// Generated with VGen 2.0.0

/**
* El objetivo de esta clase DefaultVisitor es ser la implementación base de la que
* deriven todos los demás visitor.
*
* Sus métodos visit recorren los hijos del nodo que se está visitando. Por tanto,
* todo visitor que derive de este ya tendrá implementado todo el código de
* recorrido del AST.
*
* Para crear nuevos visitor, en vez de modificar esta clase, se recomienda copiar
* 'SkeletonForNewVisitors.java' o, mejor aún, definir una nueva PHASE en la gramática
* y usar el visitor generado para la misma.
*/

package visitor;

import ast.*;
import ast.declaration.*;
import ast.statement.*;
import ast.expression.*;
import ast.type.*;




public class DefaultVisitor implements Visitor {
	@Override
	public Object visit(Program program, Object param) {

		program.getDeclarations().forEach(declaration -> declaration.accept(this, param));
		return null;
	}

	@Override
	public Object visit(StructDeclaration structDeclaration, Object param) {

		structDeclaration.getVariableDeclarations().forEach(variableDeclaration -> variableDeclaration.accept(this, param));
		return null;
	}

	@Override
	public Object visit(VariableDeclaration variableDeclaration, Object param) {

		variableDeclaration.getType().accept(this, param);
		return null;
	}

	@Override
	public Object visit(FunctionDeclaration functionDeclaration, Object param) {

		functionDeclaration.getParameters().forEach(variableDeclaration -> variableDeclaration.accept(this, param));
		functionDeclaration.getType().accept(this, param);
		functionDeclaration.getVariableDeclarations().forEach(variableDeclaration -> variableDeclaration.accept(this, param));
		functionDeclaration.getStatements().forEach(statement -> statement.accept(this, param));
		return null;
	}

	@Override
	public Object visit(Print print, Object param) {

		print.getExpressions().forEach(expression -> expression.accept(this, param));
		return null;
	}

	@Override
	public Object visit(Printsp printsp, Object param) {

		printsp.getExpressions().forEach(expression -> expression.accept(this, param));
		return null;
	}

	@Override
	public Object visit(Println println, Object param) {

		println.getExpressions().forEach(expression -> expression.accept(this, param));
		return null;
	}

	@Override
	public Object visit(Read read, Object param) {

		read.getExpression().accept(this, param);
		return null;
	}

	@Override
	public Object visit(If ifValue, Object param) {

		ifValue.getExpression().accept(this, param);
		ifValue.getS1().forEach(statement -> statement.accept(this, param));
		ifValue.getS2().forEach(statement -> statement.accept(this, param));
		return null;
	}

	@Override
	public Object visit(While whileValue, Object param) {

		whileValue.getExpression().accept(this, param);
		whileValue.getStatements().forEach(statement -> statement.accept(this, param));
		return null;
	}

	@Override
	public Object visit(Return returnValue, Object param) {

		returnValue.getExpression().ifPresent(expression -> expression.accept(this, param));
		return null;
	}

	@Override
	public Object visit(Asignacion asignacion, Object param) {

		asignacion.getE1().accept(this, param);
		asignacion.getE2().accept(this, param);
		return null;
	}

	@Override
	public Object visit(FuncionLlamada funcionLlamada, Object param) {

		funcionLlamada.getExpressions().forEach(expression -> expression.accept(this, param));
		return null;
	}

	@Override
	public Object visit(Incremento incremento, Object param) {

		incremento.getVar().accept(this, param);
		return null;
	}

	@Override
	public Object visit(ForC forC, Object param) {

		forC.getInicializacion().accept(this, param);
		forC.getExpression().accept(this, param);
		forC.getIncremento().accept(this, param);
		forC.getStatements().forEach(statement -> statement.accept(this, param));
		return null;
	}

	@Override
	public Object visit(Inicializacion inicializacion, Object param) {

		inicializacion.getVariableDeclaration().accept(this, param);
		inicializacion.getExpression().accept(this, param);
		return null;
	}

	@Override
	public Object visit(Cast cast, Object param) {

		cast.getTargetType().accept(this, param);
		cast.getExpression().accept(this, param);
		return null;
	}

	@Override
	public Object visit(StructAccess structAccess, Object param) {

		structAccess.getExpression().accept(this, param);
		return null;
	}

	@Override
	public Object visit(ArrayAccess arrayAccess, Object param) {

		arrayAccess.getE1().accept(this, param);
		arrayAccess.getE2().accept(this, param);
		return null;
	}

	@Override
	public Object visit(ExpresionLlamada expresionLlamada, Object param) {

		expresionLlamada.getExpressions().forEach(expression -> expression.accept(this, param));
		return null;
	}

	@Override
	public Object visit(Not not, Object param) {

		not.getExpression().accept(this, param);
		return null;
	}

	@Override
	public Object visit(ExpresionAritmetica expresionAritmetica, Object param) {

		expresionAritmetica.getE1().accept(this, param);
		expresionAritmetica.getE2().accept(this, param);
		return null;
	}

	@Override
	public Object visit(ExpresionLogica expresionLogica, Object param) {

		expresionLogica.getE1().accept(this, param);
		expresionLogica.getE2().accept(this, param);
		return null;
	}

	@Override
	public Object visit(Variable variable, Object param) {

		return null;
	}

	@Override
	public Object visit(LitEnt litEnt, Object param) {

		return null;
	}

	@Override
	public Object visit(LitReal litReal, Object param) {

		return null;
	}

	@Override
	public Object visit(LitChar litChar, Object param) {

		return null;
	}

	@Override
	public Object visit(IntType intType, Object param) {

		return null;
	}

	@Override
	public Object visit(RealType realType, Object param) {

		return null;
	}

	@Override
	public Object visit(CharType charType, Object param) {

		return null;
	}

	@Override
	public Object visit(VoidType voidType, Object param) {

		return null;
	}

	@Override
	public Object visit(ArrayType arrayType, Object param) {

		arrayType.getType().accept(this, param);
		return null;
	}

	@Override
	public Object visit(StructType structType, Object param) {

		return null;
	}


}
