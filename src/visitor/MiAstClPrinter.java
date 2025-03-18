package visitor;

import ast.*;
import ast.declaration.*;
import ast.statement.*;
import ast.expression.*;
import ast.type.*;


public class MiAstClPrinter extends DefaultVisitor {

    public void process(AST ast) {
        ast.accept(this, null);
    }

    // Visit Methods --------------------------------------------------------------

	// class Program(List<Declaration> declarations)
	@Override
	public Object visit(Program program, Object param) {

        System.out.println("Visiting Program Node");
		program.getDeclarations().forEach(declaration -> declaration.accept(this, param));		

		return null;
	}

	// class StructDeclaration(String ID, List<Variable> variables)
	@Override
	public Object visit(StructDeclaration structDeclaration, Object param) {

        System.out.println("Visiting StructDeclaration Node: " + structDeclaration.getID());
		structDeclaration.getVariableDeclarations().forEach(variable -> variable.accept(this, param));		

		return null;
	}

	// class VariableDeclaration(String ID, Type type)
	@Override
	public Object visit(VariableDeclaration variableDeclaration, Object param) {
        System.out.println("Visiting VariableDeclaration Node: " + variableDeclaration.getID());
		variableDeclaration.getType().accept(this, param);		

		return null;
	}

	// class FunctionDeclaration(String ID, List<Parameter> parameters, Optional<Type> type, List<VariableDeclaration> variableDeclarations, List<Statement> statements)
	@Override
	public Object visit(FunctionDeclaration functionDeclaration, Object param) {            
        System.out.println("Visiting FunctionDeclaration Node: " + functionDeclaration.getID());

		functionDeclaration.getParameters().forEach(parameter -> parameter.accept(this, param));
		functionDeclaration.getType().ifPresent(type -> type.accept(this, param));
		functionDeclaration.getVariableDeclarations().forEach(variableDeclaration -> variableDeclaration.accept(this, param));
		functionDeclaration.getStatements().forEach(statement -> statement.accept(this, param));
		
		return null;
	}

	// class Print(List<Expression> expressions)
	@Override
	public Object visit(Print print, Object param) {

        System.out.println("Visiting Print Node");
		print.getExpressions().forEach(expression -> expression.accept(this, param));
		
		return null;
	}

	// class Printsp(List<Expression> expressions)
	@Override
	public Object visit(Printsp printsp, Object param) {

        System.out.println("Visiting Printsp Node");
		printsp.getExpressions().forEach(expression -> expression.accept(this, param));
		
		return null;
	}

	// class Println(List<Expression> expressions)
	@Override
	public Object visit(Println println, Object param) {

        System.out.println("Visiting Println Node");
		println.getExpressions().forEach(expression -> expression.accept(this, param));
		
		return null;
	}

	// class Read(Expression expression)
	@Override
	public Object visit(Read read, Object param) {

        System.out.println("Visiting Read Node");
		read.getExpression().accept(this, param);
		
		return null;
	}

	// class If(Expression expression, List<Statement> s1, List<Statement> s2)
	@Override
	public Object visit(If ifValue, Object param) {
        System.out.println("Visiting If Node");
		ifValue.getExpression().accept(this, param);
		ifValue.getS1().forEach(statement -> statement.accept(this, param));
		ifValue.getS2().forEach(statement -> statement.accept(this, param));
		
		return null;
	}

	// class While(Expression expression, List<Statement> statements)
	@Override
	public Object visit(While whileValue, Object param) {

        System.out.println("Visiting While Node");
		whileValue.getExpression().accept(this, param);
		whileValue.getStatements().forEach(statement -> statement.accept(this, param));
		
		return null;
	}

	// class Return(Optional<Expression> expression)
	@Override
	public Object visit(Return returnValue, Object param) {

        System.out.println("Visiting Return Node");
		returnValue.getExpression().ifPresent(expression -> expression.accept(this, param));
		
		return null;
	}

	// class Asignacion(Expression e1, Expression e2)
	@Override
	public Object visit(Asignacion asignacion, Object param) {

        System.out.println("Visiting Asignacion Node");
		asignacion.getE1().accept(this, param);
		asignacion.getE2().accept(this, param);

		return null;
	}

	// class FuncionLlamada(String ID, List<Expression> expressions)
	@Override
	public Object visit(FuncionLlamada funcionLlamada, Object param) {
            
        System.out.println("Visiting FuncionLlamada Node: " + funcionLlamada.getID());
		funcionLlamada.getExpressions().forEach(expression -> expression.accept(this, param));
		
		return null;
	}

	// class Cast(Type type, Expression expression)
	@Override
	public Object visit(Cast cast, Object param) {

        System.out.println("Visiting Cast Node");
		cast.getType().accept(this, param);
		cast.getExpression().accept(this, param);

		return null;
	}

	// class Struct(Expression expression, String ID)
	@Override
	public Object visit(StructAccess struct, Object param) {

        System.out.println("Visiting Struct Node");
		struct.getExpression().accept(this, param);

		return null;
	}

	// class Array(Expression e1, Expression e2)
	@Override
	public Object visit(ArrayAccess array, Object param) {

        System.out.println("Visiting Array Node");
		array.getE1().accept(this, param);
		array.getE2().accept(this, param);

		return null;
	}

	// class ExpresionLlamada(String ID, List<Expression> expressions)
	@Override
	public Object visit(ExpresionLlamada expresionLlamada, Object param) {

        System.out.println("Visiting ExpresionLlamada Node: " + expresionLlamada.getID());
		expresionLlamada.getExpressions().forEach(expression -> expression.accept(this, param));		

		return null;
	}

	// class Not(Expression expression)
	@Override
	public Object visit(Not not, Object param) {

        System.out.println("Visiting Not Node");
		not.getExpression().accept(this, param);		

		return null;
	}

	// class ExpresionAritmetica(Expression e1, String op, Expression e2)
	@Override
	public Object visit(ExpresionAritmetica expresionAritmetica, Object param) {

        System.out.println("Visiting ExpresionAritmetica ("+ expresionAritmetica.getOp() + ") Node");
		expresionAritmetica.getE1().accept(this, param);
		expresionAritmetica.getE2().accept(this, param);

		return null;
	}

	// class ExpresionLogica(Expression e1, String op, Expression e2)
	@Override
	public Object visit(ExpresionLogica expresionLogica, Object param) {

        System.out.println("Visiting ExpresionLogica ("+ expresionLogica.getOp() + ") Node");
		expresionLogica.getE1().accept(this, param);
		expresionLogica.getE2().accept(this, param);

		return null;
	}

	// class Id(String ID)
	@Override
	public Object visit(Id id, Object param) {

		return null;
	}

	// class LitEnt(String LITENT)
	@Override
	public Object visit(LitEnt litEnt, Object param) {

		return null;
	}

	// class LitReal(String LITREAL)
	@Override
	public Object visit(LitReal litReal, Object param) {

		return null;
	}

	// class LitChar(String CHAR_LITERAL)
	@Override
	public Object visit(LitChar litChar, Object param) {

		return null;
	}

	// class IntType()
	@Override
	public Object visit(IntType intType, Object param) {
        System.out.println("Type : IntType");
		return null;
	}

	// class RealType()
	@Override
	public Object visit(RealType realType, Object param) {

		return null;
	}

	// class CharType()
	@Override
	public Object visit(CharType charType, Object param) {

		return null;
	}

	// class ArrayType(String posicion, Type type)
	@Override
	public Object visit(ArrayType arrayType, Object param) {

		// arrayType.getType().accept(this, param);
		super.visit(arrayType, param);

		return null;
	}

	// class StructType(String nombre)
	@Override
	public Object visit(StructType structType, Object param) {

		return null;
	}

}
