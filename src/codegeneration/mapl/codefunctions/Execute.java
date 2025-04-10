// Generated with VGen 2.0.0

package codegeneration.mapl.codefunctions;


import ast.*;
import ast.statement.*;
import ast.expression.*;
import codegeneration.mapl.*;


public class Execute extends AbstractCodeFunction {

    public Execute(MaplCodeSpecification specification) {
        super(specification);
    }


	// class Print(List<Expression> expressions)
	// phase TypeChecking { FunctionDeclaration funcion }
	@Override
	public Object visit(Print print, Object param) {

		line(print);

		for(Expression expression : print.getExpressions()) {
			value(expression);
			out("out", expression.getType());
		}
		
		return null;
	}

	// class Printsp(List<Expression> expressions)
	// phase TypeChecking { FunctionDeclaration funcion }
	@Override
	public Object visit(Printsp printsp, Object param) {

		// value(printsp.expressions());

		out("<instruction>");

		return null;
	}

	// class Println(List<Expression> expressions)
	// phase TypeChecking { FunctionDeclaration funcion }
	@Override
	public Object visit(Println println, Object param) {

		// value(println.expressions());

		out("<instruction>");

		return null;
	}

	// class Read(Expression expression)
	// phase TypeChecking { FunctionDeclaration funcion }
	@Override
	public Object visit(Read read, Object param) {

		// value(read.getExpression());

		out("<instruction>");

		return null;
	}

	// class If(Expression expression, List<Statement> s1, List<Statement> s2)
	// phase TypeChecking { FunctionDeclaration funcion }
	@Override
	public Object visit(If ifValue, Object param) {

		// value(ifValue.getExpression());

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

		// execute(whileValue.statements());

		out("<instruction>");

		return null;
	}

	// class Return(Optional<Expression> expression)
	// phase TypeChecking { FunctionDeclaration funcion }
	@Override
	public Object visit(Return returnValue, Object param) {

		// value(returnValue.getExpression());

		out("<instruction>");

		return null;
	}

	// class Asignacion(Expression e1, Expression e2)
	// phase TypeChecking { FunctionDeclaration funcion }
	@Override
	public Object visit(Asignacion asignacion, Object param) {

		line(asignacion);

        address(asignacion.getE1());
        value(asignacion.getE2());
        out("store", asignacion.getE1().getType());
		
		return null;
	}

	// class FuncionLlamada(String ID, List<Expression> expressions)
	// phase Identification { FunctionDeclaration functionDeclaration }
	// phase TypeChecking { FunctionDeclaration funcion }
	@Override
	public Object visit(FuncionLlamada funcionLlamada, Object param) {

		// value(funcionLlamada.expressions());

		out("<instruction>");

		return null;
	}


	// Auxiliary methods for the generation of code

    private void line(AST node) {
        line(node.end());
    }

    private void line(Position pos) {
        if (pos != null)
            out("\n#line " + pos.getLine());
        else
            System.out.println("#line no generado. Se ha pasado una Position null. Falta información en el AST");
    }
}
