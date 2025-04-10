// Generated with VGen 2.0.0

package codegeneration.mapl.codefunctions;

import ast.expression.*;
import codegeneration.mapl.*;


public class Value extends AbstractCodeFunction {

    public Value(MaplCodeSpecification specification) {
        super(specification);
    }


	// class Cast(Type targetType, Expression expression)
	// phase TypeChecking { Type type, boolean lvalue }
	@Override
	public Object visit(Cast cast, Object param) {

		// value(cast.getExpression());

		out("<instruction>");

		return null;
	}

	// class StructAccess(Expression expression, String ID)
	// phase TypeChecking { Type type, boolean lvalue }
	@Override
	public Object visit(StructAccess structAccess, Object param) {

		// value(structAccess.getExpression());

		out("<instruction>");

		return null;
	}

	// class ArrayAccess(Expression e1, Expression e2)
	// phase TypeChecking { Type type, boolean lvalue }
	@Override
	public Object visit(ArrayAccess arrayAccess, Object param) {

		// value(arrayAccess.getE1());

		// value(arrayAccess.getE2());

		out("<instruction>");

		return null;
	}

	// class ExpresionLlamada(String ID, List<Expression> expressions)
	// phase Identification { FunctionDeclaration functionDeclaration }
	// phase TypeChecking { Type type, boolean lvalue }
	@Override
	public Object visit(ExpresionLlamada expresionLlamada, Object param) {

		// value(expresionLlamada.expressions());

		out("<instruction>");

		return null;
	}

	// class Not(Expression expression)
	// phase TypeChecking { Type type, boolean lvalue }
	@Override
	public Object visit(Not not, Object param) {

		// value(not.getExpression());

		out("<instruction>");

		return null;
	}

	// class ExpresionAritmetica(Expression e1, String op, Expression e2)
	// phase TypeChecking { Type type, boolean lvalue }
	@Override
	public Object visit(ExpresionAritmetica expresionAritmetica, Object param) {

		// value(expresionAritmetica.getE1());

		// value(expresionAritmetica.getE2());

		out("<instruction>");

		return null;
	}

	// class ExpresionLogica(Expression e1, String op, Expression e2)
	// phase TypeChecking { Type type, boolean lvalue }
	@Override
	public Object visit(ExpresionLogica expresionLogica, Object param) {

		// value(expresionLogica.getE1());

		// value(expresionLogica.getE2());

		out("<instruction>");

		return null;
	}

	// class Variable(String ID)
	// phase Identification { VariableDeclaration variableDeclaration }
	// phase TypeChecking { Type type, boolean lvalue }
	@Override
	public Object visit(Variable variable, Object param) {

		out("<instruction>");

		return null;
	}

	// class LitEnt(String LITENT)
	// phase TypeChecking { Type type, boolean lvalue }
	@Override
	public Object visit(LitEnt litEnt, Object param) {

		out("<instruction>");

		return null;
	}

	// class LitReal(String LITREAL)
	// phase TypeChecking { Type type, boolean lvalue }
	@Override
	public Object visit(LitReal litReal, Object param) {

		out("<instruction>");

		return null;
	}

	// class LitChar(String CHAR_LITERAL)
	// phase TypeChecking { Type type, boolean lvalue }
	@Override
	public Object visit(LitChar litChar, Object param) {

		out("<instruction>");

		return null;
	}

}
