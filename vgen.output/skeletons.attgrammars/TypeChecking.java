// Generated with VGen 2.0.0

/*

Este fichero es un esqueleto para facilitar la implementación de una gramática atribuida
('ATTRIBUTE GRAMMAR' de VGen). Para usarlo hay que realizar dos pasos:
1. Ubicar este código.
2. Completar cada método visit.

## Paso 1. Ubicación de este Código

Este esqueleto será SOBREESCRITO la próxima vez que se ejecuta VGen. Por ello, se debe
copiar su contenido antes de hacer cualquier cambio.

Hay dos opciones:

1) Si ya se tiene hecha una clase para el visitor, basta con copiar a dicha clase los
   métodos visit de este esqueleto (y los import) ignorando el resto.

2) Si no se tiene hecha aún la clase, este esqueleto vale como tal si se mueve a la
   carpeta deseada del proyecto y se le pone el package correspondiente a dicha
   ubicación.

Una vez hecho esto, ya se tendría un visitor que compilaría sin errores y que, al
ejecutarlo, recorrería todo el árbol (aunque sin hacer nada en cada nodo).


## Paso 2 Completar cada Método Visit

El visit generado para cada nodo se limita a recorrer sus hijos. El código de recorrido
se encuentra en la llamada a 'super.visit'. Los 'accept' comentados encima de cada
'super.visit' son sólo un recordatorio de lo que hace dicho método (son una copia de su
implementación, que se hereda de DefaultVisitor).

Por tanto, hay tres opciones a la hora de implementar cada visit:

1. Si en el visit de un nodo SÓLO SE NECESITA RECORRER sus hijos, se puede borrar
   completamente dicho visit de esta clase. Al no estar el método, se heredará de
   DefaultVisitor la misma implementación que se acaba de borrar. Es decir, en esta
   clase sólo será necesario dejar los visit que tengan alguna acción que realizar.

2. Si se necesita hacer alguna tarea adicional ANTES o DESPUÉS de recorrer todos los
   hijos, se debe añadir su código antes o después de la llamada a 'super.visit' (y se
   pueden borrar los 'accept' comentados).

3. Y, finalmente, si se necesita hacer alguna tarea INTERCALADA en el recorrido de los
   hijos (por ejemplo, comprobar su tipo), se debe borrar el 'super.visit' y descomentar
   los 'accept'. Así se tendría ya implementado el recorrido de los hijos, que es la
   estructura donde se intecalará el código de las acciones adicionales.

NOTA 1. En los visit en los que haya que inicializar atributos heredados de los hijos
antes de recorrerlos, se han añadido recordatorios en los puntos en los que es
aconsejable hacerlo.

NOTA 2. En los visit de los nodos que tengan atributos sintetizados, se han añadido
recordatorios de que se deben inicializar dichos atributos.

*/

// TODO: write package name
// package ...;

import visitor.DefaultVisitor;
import ast.*;
import ast.declaration.*;
import ast.statement.*;
import ast.expression.*;
import ast.type.*;


public class TypeChecking extends DefaultVisitor {

    public void process(AST ast) {
        ast.accept(this, null);
    }

    // Visit Methods --------------------------------------------------------------

	// class Program(List<Declaration> declarations)
	@Override
	public Object visit(Program program, Object param) {

		// program.getDeclarations().forEach(declaration -> declaration.accept(this, param));
		super.visit(program, param);

		return null;
	}

	// class StructDeclaration(String ID, List<VariableDeclaration> variableDeclarations)
	@Override
	public Object visit(StructDeclaration structDeclaration, Object param) {

		// structDeclaration.getVariableDeclarations().forEach(variableDeclaration -> variableDeclaration.accept(this, param));
		super.visit(structDeclaration, param);

		return null;
	}

	// class VariableDeclaration(String ID, Type type)
	@Override
	public Object visit(VariableDeclaration variableDeclaration, Object param) {

		// variableDeclaration.getType().accept(this, param);
		super.visit(variableDeclaration, param);

		return null;
	}

	// class FunctionDeclaration(String ID, List<VariableDeclaration> parameters, Type type, List<VariableDeclaration> variableDeclarations, List<Statement> statements)
	@Override
	public Object visit(FunctionDeclaration functionDeclaration, Object param) {

		for (var statement : functionDeclaration.getStatements()) {
			// TODO: Remember to initialize INHERITED attributes <----
			// statement.setFuncion(?);
		}

		// functionDeclaration.getParameters().forEach(variableDeclaration -> variableDeclaration.accept(this, param));
		// functionDeclaration.getType().accept(this, param);
		// functionDeclaration.getVariableDeclarations().forEach(variableDeclaration -> variableDeclaration.accept(this, param));
		// functionDeclaration.getStatements().forEach(statement -> statement.accept(this, param));
		super.visit(functionDeclaration, param);

		return null;
	}

	// class Print(List<Expression> expressions)
	// phase TypeChecking { FunctionDeclaration funcion }
	@Override
	public Object visit(Print print, Object param) {

		// print.getExpressions().forEach(expression -> expression.accept(this, param));
		super.visit(print, param);

		return null;
	}

	// class Printsp(List<Expression> expressions)
	// phase TypeChecking { FunctionDeclaration funcion }
	@Override
	public Object visit(Printsp printsp, Object param) {

		// printsp.getExpressions().forEach(expression -> expression.accept(this, param));
		super.visit(printsp, param);

		return null;
	}

	// class Println(List<Expression> expressions)
	// phase TypeChecking { FunctionDeclaration funcion }
	@Override
	public Object visit(Println println, Object param) {

		// println.getExpressions().forEach(expression -> expression.accept(this, param));
		super.visit(println, param);

		return null;
	}

	// class Read(Expression expression)
	// phase TypeChecking { FunctionDeclaration funcion }
	@Override
	public Object visit(Read read, Object param) {

		// read.getExpression().accept(this, param);
		super.visit(read, param);

		return null;
	}

	// class If(Expression expression, List<Statement> s1, List<Statement> s2)
	// phase TypeChecking { FunctionDeclaration funcion }
	@Override
	public Object visit(If ifValue, Object param) {

		for (var statement : ifValue.getS1()) {
			// TODO: Remember to initialize INHERITED attributes <----
			// statement.setFuncion(ifValue.getFuncion());
		}

		for (var statement : ifValue.getS2()) {
			// TODO: Remember to initialize INHERITED attributes <----
			// statement.setFuncion(ifValue.getFuncion());
		}

		// ifValue.getExpression().accept(this, param);
		// ifValue.getS1().forEach(statement -> statement.accept(this, param));
		// ifValue.getS2().forEach(statement -> statement.accept(this, param));
		super.visit(ifValue, param);

		return null;
	}

	// class While(Expression expression, List<Statement> statements)
	// phase TypeChecking { FunctionDeclaration funcion }
	@Override
	public Object visit(While whileValue, Object param) {

		for (var statement : whileValue.getStatements()) {
			// TODO: Remember to initialize INHERITED attributes <----
			// statement.setFuncion(whileValue.getFuncion());
		}

		// whileValue.getExpression().accept(this, param);
		// whileValue.getStatements().forEach(statement -> statement.accept(this, param));
		super.visit(whileValue, param);

		return null;
	}

	// class Return(Optional<Expression> expression)
	// phase TypeChecking { FunctionDeclaration funcion }
	@Override
	public Object visit(Return returnValue, Object param) {

		// returnValue.getExpression().ifPresent(expression -> expression.accept(this, param));
		super.visit(returnValue, param);

		return null;
	}

	// class Asignacion(Expression e1, List<Expression> a)
	// phase TypeChecking { FunctionDeclaration funcion }
	@Override
	public Object visit(Asignacion asignacion, Object param) {

		// asignacion.getE1().accept(this, param);
		// asignacion.getA().forEach(expression -> expression.accept(this, param));
		super.visit(asignacion, param);

		return null;
	}

	// class FuncionLlamada(String ID, List<Expression> expressions)
	// phase Identification { FunctionDeclaration functionDeclaration }
	// phase TypeChecking { FunctionDeclaration funcion }
	@Override
	public Object visit(FuncionLlamada funcionLlamada, Object param) {

		// funcionLlamada.getExpressions().forEach(expression -> expression.accept(this, param));
		super.visit(funcionLlamada, param);

		return null;
	}

	// class Cast(Type targetType, Expression expression)
	// phase TypeChecking { Type type, boolean lvalue }
	@Override
	public Object visit(Cast cast, Object param) {

		// cast.getTargetType().accept(this, param);
		// cast.getExpression().accept(this, param);
		super.visit(cast, param);

		// TODO: Remember to initialize SYNTHESIZED attributes <-----
		// cast.setType(?);
		// cast.setLvalue(?);
		return null;
	}

	// class StructAccess(Expression expression, String ID)
	// phase TypeChecking { Type type, boolean lvalue }
	@Override
	public Object visit(StructAccess structAccess, Object param) {

		// structAccess.getExpression().accept(this, param);
		super.visit(structAccess, param);

		// TODO: Remember to initialize SYNTHESIZED attributes <-----
		// structAccess.setType(?);
		// structAccess.setLvalue(?);
		return null;
	}

	// class ArrayAccess(Expression e1, Expression e2)
	// phase TypeChecking { Type type, boolean lvalue }
	@Override
	public Object visit(ArrayAccess arrayAccess, Object param) {

		// arrayAccess.getE1().accept(this, param);
		// arrayAccess.getE2().accept(this, param);
		super.visit(arrayAccess, param);

		// TODO: Remember to initialize SYNTHESIZED attributes <-----
		// arrayAccess.setType(?);
		// arrayAccess.setLvalue(?);
		return null;
	}

	// class ExpresionLlamada(String ID, List<Expression> expressions)
	// phase Identification { FunctionDeclaration functionDeclaration }
	// phase TypeChecking { Type type, boolean lvalue }
	@Override
	public Object visit(ExpresionLlamada expresionLlamada, Object param) {

		// expresionLlamada.getExpressions().forEach(expression -> expression.accept(this, param));
		super.visit(expresionLlamada, param);

		// TODO: Remember to initialize SYNTHESIZED attributes <-----
		// expresionLlamada.setType(?);
		// expresionLlamada.setLvalue(?);
		return null;
	}

	// class Not(Expression expression)
	// phase TypeChecking { Type type, boolean lvalue }
	@Override
	public Object visit(Not not, Object param) {

		// not.getExpression().accept(this, param);
		super.visit(not, param);

		// TODO: Remember to initialize SYNTHESIZED attributes <-----
		// not.setType(?);
		// not.setLvalue(?);
		return null;
	}

	// class ExpresionAritmetica(Expression e1, String op, Expression e2)
	// phase TypeChecking { Type type, boolean lvalue }
	@Override
	public Object visit(ExpresionAritmetica expresionAritmetica, Object param) {

		// expresionAritmetica.getE1().accept(this, param);
		// expresionAritmetica.getE2().accept(this, param);
		super.visit(expresionAritmetica, param);

		// TODO: Remember to initialize SYNTHESIZED attributes <-----
		// expresionAritmetica.setType(?);
		// expresionAritmetica.setLvalue(?);
		return null;
	}

	// class ExpresionLogica(Expression e1, String op, Expression e2)
	// phase TypeChecking { Type type, boolean lvalue }
	@Override
	public Object visit(ExpresionLogica expresionLogica, Object param) {

		// expresionLogica.getE1().accept(this, param);
		// expresionLogica.getE2().accept(this, param);
		super.visit(expresionLogica, param);

		// TODO: Remember to initialize SYNTHESIZED attributes <-----
		// expresionLogica.setType(?);
		// expresionLogica.setLvalue(?);
		return null;
	}

	// class Variable(String ID)
	// phase Identification { VariableDeclaration variableDeclaration }
	// phase TypeChecking { Type type, boolean lvalue }
	@Override
	public Object visit(Variable variable, Object param) {

		// TODO: Remember to initialize SYNTHESIZED attributes <-----
		// variable.setType(?);
		// variable.setLvalue(?);
		return null;
	}

	// class LitEnt(String LITENT)
	// phase TypeChecking { Type type, boolean lvalue }
	@Override
	public Object visit(LitEnt litEnt, Object param) {

		// TODO: Remember to initialize SYNTHESIZED attributes <-----
		// litEnt.setType(?);
		// litEnt.setLvalue(?);
		return null;
	}

	// class LitReal(String LITREAL)
	// phase TypeChecking { Type type, boolean lvalue }
	@Override
	public Object visit(LitReal litReal, Object param) {

		// TODO: Remember to initialize SYNTHESIZED attributes <-----
		// litReal.setType(?);
		// litReal.setLvalue(?);
		return null;
	}

	// class LitChar(String CHAR_LITERAL)
	// phase TypeChecking { Type type, boolean lvalue }
	@Override
	public Object visit(LitChar litChar, Object param) {

		// TODO: Remember to initialize SYNTHESIZED attributes <-----
		// litChar.setType(?);
		// litChar.setLvalue(?);
		return null;
	}

	// class IntType()
	@Override
	public Object visit(IntType intType, Object param) {

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

	// class VoidType()
	@Override
	public Object visit(VoidType voidType, Object param) {

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
	// phase Identification { StructDeclaration structDeclaration }
	@Override
	public Object visit(StructType structType, Object param) {

		return null;
	}

}
