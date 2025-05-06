// Generated with VGen 2.0.0

package codegeneration.mapl.codefunctions;


import ast.*;
import ast.declaration.VariableDeclaration;
import ast.statement.*;
import ast.type.VoidType;
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

		line(printsp);

		if(printsp.getExpressions().size() == 0) {
			out("pushb 32");// espacio
			out("outb");
		}

		for(Expression expression : printsp.getExpressions()) {
			value(expression);
			out("out", expression.getType());
			out("pushb 32");// espacio
			out("outb");
		}		

		return null;
	}

	// class Println(List<Expression> expressions)
	// phase TypeChecking { FunctionDeclaration funcion }
	@Override
	public Object visit(Println println, Object param) {

		line(println);

		if(println.getExpressions().size() == 0) {
			out("pushb 10");//salto de línea
			out("outb");
		}

		for(Expression expression : println.getExpressions()) {
			value(expression);
			out("out", expression.getType());
			out("pushb 10");//salto de línea
			out("outb");		
		}
		
		return null;
	}

	// class Read(Expression expression)
	// phase TypeChecking { FunctionDeclaration funcion }
	@Override
	public Object visit(Read read, Object param) {

		line(read);
		
		address(read.getExpression());

		out("in" + suffixFor(read.getExpression().getType()));
		out("store" + suffixFor(read.getExpression().getType()));

		return null;
	}

	// class If(Expression expression, List<Statement> s1, List<Statement> s2)
	// phase TypeChecking { FunctionDeclaration funcion }
	@Override
	public Object visit(If ifValue, Object param) {

		line(ifValue);
		int ifID = labelCounter();

		value(ifValue.getExpression());

		if(ifValue.getS2().size() > 0) { // YA QUE EN EL CONSTRUCTUR SI LLEGA NULL CREA UNA LISTA VACIA
			out("jz else" + ifID);
		} else {
			out("jz finIf" + ifID);
		}

		for(int i = 0; i < ifValue.getS1().size(); i++) {			
			Statement statement = ifValue.getS1().get(i);
			execute(statement);
			if(i == ifValue.getS1().size() - 1 && !(statement instanceof Return)) {
				out("jmp finIf" + ifID);
			}
		}

		if(ifValue.getS2().size() > 0) {
			out("else" + ifID + ":");
			execute(ifValue.s2());
		}

		out("finIf" + ifID + ":");
		return null;
	}

	// class While(Expression expression, List<Statement> statements)
	// phase TypeChecking { FunctionDeclaration funcion }
	@Override
	public Object visit(While whileValue, Object param) {

		line(whileValue);
		int whileID = labelCounter();

		out("while" + whileID + ":");
		value(whileValue.getExpression());

		out("jz finWhile" + whileID);

		execute(whileValue.statements());
		out("jmp while" + whileID);

		out("finWhile" + whileID + ":");

		return null;
	}

	// class Return(Optional<Expression> expression)
	// phase TypeChecking { FunctionDeclaration funcion }
	@Override
	public Object visit(Return returnValue, Object param) {
		int sizeLocales = 0;
		int sizeParameters = 0;

		for (VariableDeclaration parameter : returnValue.getFuncion().getParameters()) {
			sizeParameters += parameter.getType().getSize();
		}

		for (VariableDeclaration variableDeclaration : returnValue.getFuncion().getVariableDeclarations()) {
			sizeLocales += variableDeclaration.getType().getSize();
		}

		if(!(returnValue.getExpression().isPresent())) {
			out("ret 0, " + sizeLocales + ", " + sizeParameters);
		} else {
			value(returnValue.getExpression());
			out("ret " + returnValue.getFuncion().getType().getSize() + ", " + sizeLocales + ", " + sizeParameters);
		}

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

		line(funcionLlamada);

		if(funcionLlamada.getExpressions() != null) {
			value(funcionLlamada.expressions());
		}

		out("call " + funcionLlamada.getID());
		
		if(!(funcionLlamada.getFunctionDeclaration().getType().getClass().equals(VoidType.class))){
			out("pop" + suffixFor(funcionLlamada.getFunctionDeclaration().getType()));
		}

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

	// Campo estático que mantiene el estado entre llamadas
    private static int contador = 0;

    /**
     * Devuelve 1 la primera vez, 2 la segunda, 3 la tercera, etc.
     * @return el siguiente valor del contador
     */
    public static int labelCounter() {
        return ++contador;
    }

}
