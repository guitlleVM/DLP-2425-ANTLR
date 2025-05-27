// Generated with VGen 2.0.0

package codegeneration.mapl.codefunctions;

import ast.statement.*;
import codegeneration.mapl.*;


public class Execute extends AbstractCodeFunction {

    public Execute(MaplCodeSpecification specification) {
        super(specification);
    }


	// class Print(List<Expression> expressions)
	// phase TypeChecking { FunctionDeclaration funcion }
	@Override
	public Object visit(Print print, Object param) {

		// value(print.expressions());
		// address(print.expressions());

		out("<instruction>");

		return null;
	}

	// class Printsp(List<Expression> expressions)
	// phase TypeChecking { FunctionDeclaration funcion }
	@Override
	public Object visit(Printsp printsp, Object param) {

		// value(printsp.expressions());
		// address(printsp.expressions());

		out("<instruction>");

		return null;
	}

	// class Println(List<Expression> expressions)
	// phase TypeChecking { FunctionDeclaration funcion }
	@Override
	public Object visit(Println println, Object param) {

		// value(println.expressions());
		// address(println.expressions());

		out("<instruction>");

		return null;
	}

	// class Read(Expression expression)
	// phase TypeChecking { FunctionDeclaration funcion }
	@Override
	public Object visit(Read read, Object param) {

		// value(read.getExpression());
		// address(read.getExpression());

		out("<instruction>");

		return null;
	}

	// class If(Expression expression, List<Statement> s1, List<Statement> s2)
	// phase TypeChecking { FunctionDeclaration funcion }
	@Override
	public Object visit(If ifValue, Object param) {

		// value(ifValue.getExpression());
		// address(ifValue.getExpression());

		// execute(ifValue.s1());

		// execute(ifValue.s2());

		out("<instruction>");

		return null;
	}

	// class While(Expression expression, List<Statement> statements)
	// phase TypeChecking { FunctionDeclaration funcion }
	@Override
	public Object visit(While whileValue, Object param) {

		// value(whileValue.getExpression());
		// address(whileValue.getExpression());

		// execute(whileValue.statements());

		out("<instruction>");

		return null;
	}

	// class Return(Optional<Expression> expression)
	// phase TypeChecking { FunctionDeclaration funcion }
	@Override
	public Object visit(Return returnValue, Object param) {

		// value(returnValue.getExpression());
		// address(returnValue.getExpression());

		out("<instruction>");

		return null;
	}

	// class Asignacion(Expression e1, Expression e2)
	// phase TypeChecking { FunctionDeclaration funcion }
	@Override
	public Object visit(Asignacion asignacion, Object param) {

		// value(asignacion.getE1());
		// address(asignacion.getE1());

		// value(asignacion.getE2());
		// address(asignacion.getE2());

		out("<instruction>");

		return null;
	}

	// class FuncionLlamada(String ID, List<Expression> expressions)
	// phase Identification { FunctionDeclaration functionDeclaration }
	// phase TypeChecking { FunctionDeclaration funcion }
	@Override
	public Object visit(FuncionLlamada funcionLlamada, Object param) {

		// value(funcionLlamada.expressions());
		// address(funcionLlamada.expressions());

		out("<instruction>");

		return null;
	}

	// class Switch(Expression e1, List<SwitchCase> switchCases, Optional<DefaultCase> defaultCase)
	// phase TypeChecking { FunctionDeclaration funcion }
	@Override
	public Object visit(Switch switchValue, Object param) {

		// value(switchValue.getE1());
		// address(switchValue.getE1());

		// execute(switchValue.switchCases());

		// execute(switchValue.getDefaultCase());

		out("<instruction>");

		return null;
	}

	// class SwitchCase(Expression e1, List<Statement> statements, boolean brk)
	// phase TypeChecking { FunctionDeclaration funcion, Switch switchNode }
	@Override
	public Object visit(SwitchCase switchCase, Object param) {

		// value(switchCase.getE1());
		// address(switchCase.getE1());

		// execute(switchCase.statements());

		out("<instruction>");

		return null;
	}

	// class DefaultCase(List<Statement> statements, boolean brk)
	// phase TypeChecking { FunctionDeclaration funcion, Switch switchNode }
	@Override
	public Object visit(DefaultCase defaultCase, Object param) {

		// execute(defaultCase.statements());

		out("<instruction>");

		return null;
	}

}
