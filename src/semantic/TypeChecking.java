/**
 * MLang. Programming Language Design Tutorial
 * @author Raúl Izquierdo (raul@uniovi.es)
 */

package semantic;

import visitor.DefaultVisitor;
import ast.*;
import ast.declaration.*;
import ast.statement.*;
import ast.expression.*;
import ast.type.*;
import main.ErrorManager;

// This class will be implemented in type checking phase

public class TypeChecking extends DefaultVisitor {

    private ErrorManager errorManager;

    public TypeChecking(ErrorManager errorManager) {
        this.errorManager = errorManager;
    }

    public void process(AST ast) {
        ast.accept(this, null);
    }

    // # Visitor methods

	// class FunctionDeclaration(String ID, List<VariableDeclaration> parameters, Optional<Type> type, List<VariableDeclaration> variableDeclarations, List<Statement> statements)
	@Override
	public Object visit(FunctionDeclaration functionDeclaration, Object param) {
        // Predicados
        functionDeclaration.getParameters().forEach( p -> predicate(isSimple(p.getType()), "Parameter type must be simple", p));
        predicate(isSimpleOrVoid(functionDeclaration.getType()), "Function type must be simple or null", functionDeclaration.getType());

        // Semantic
        functionDeclaration.getStatements().forEach( s -> s.setFuncion(functionDeclaration));
		
		super.visit(functionDeclaration, param);

		return null;
	}

	// class Print(List<Expression> expressions)
	@Override
	public Object visit(Print print, Object param) {
        // Predicados
        print.getExpressions().forEach(e -> predicate(isSimple(e.getType()), "Print expression must be simple", e));
        
		// print.getExpressions().forEach(expression -> expression.accept(this, param));
		super.visit(print, param);

		return null;
	}

	// class Printsp(List<Expression> expressions)
	@Override
	public Object visit(Printsp printsp, Object param) {
        // Predicados
        printsp.getExpressions().forEach(e -> predicate(isSimple(e.getType()), "Printsp expression must be simple", e));
		// printsp.getExpressions().forEach(expression -> expression.accept(this, param));
		super.visit(printsp, param);

		return null;
	}

	// class Println(List<Expression> expressions)
	@Override
	public Object visit(Println println, Object param) {
        // Predicados
        println.getExpressions().forEach(e -> predicate(isSimple(e.getType()), "Println expression must be simple", e));
		// println.getExpressions().forEach(expression -> expression.accept(this, param));
		super.visit(println, param);

		return null;
	}

	// class Read(Expression expression)
	@Override
	public Object visit(Read read, Object param) {
        // Predicados
        predicate(isSimple(read.getExpression().getType()), "Read expression must be simple", read.getExpression());
        predicate(read.getExpression().isLvalue(), "Read expression must be lvalue", read.getExpression());

		// read.getExpression().accept(this, param);
		super.visit(read, param);

		return null;
	}

	// class If(Expression expression, List<Statement> s1, List<Statement> s2)
	@Override
	public Object visit(If ifValue, Object param) {
        // Predicados
        predicate(ifValue.getExpression().getType() instanceof IntType, "If expression must be intType", ifValue.getExpression());

        // Semantic
        ifValue.getS1().forEach( s -> s.setFuncion(ifValue.getFuncion()));
        ifValue.getS2().forEach( s -> s.setFuncion(ifValue.getFuncion()));

		// ifValue.getExpression().accept(this, param);
		// ifValue.getS1().forEach(statement -> statement.accept(this, param));
		// ifValue.getS2().forEach(statement -> statement.accept(this, param));
		super.visit(ifValue, param);

		return null;
	}

	// class While(Expression expression, List<Statement> statements)
	@Override
	public Object visit(While whileValue, Object param) {
        // Predicados
        predicate(whileValue.getExpression().getType() instanceof IntType, "While expression must be intType", whileValue.getExpression());

        //Semantic
        whileValue.getStatements().forEach( s -> s.setFuncion(whileValue.getFuncion()));

		// whileValue.getExpression().accept(this, param);
		// whileValue.getStatements().forEach(statement -> statement.accept(this, param));
		super.visit(whileValue, param);

		return null;
	}

	// class Return(Optional<Expression> expression)
	@Override
	public Object visit(Return returnValue, Object param) {
        // Predicados
        if(returnValue.getFuncion().getType() instanceof VoidType){
            predicate(returnValue.getExpression().getType() instanceof VoidType, "Return expression must be void", returnValue);
        }else{
            predicate(returnValue.getExpression().getType().getClass().equals(returnValue.getFuncion().getType().getClass()),
                                                "Return expression must be the same as function return type", returnValue);
        }     

		// returnValue.getExpression().ifPresent(expression -> expression.accept(this, param));
		super.visit(returnValue, param);

		return null;
	}

	// class Asignacion(Expression e1, Expression e2)
	@Override
	public Object visit(Asignacion asignacion, Object param) {
        // Predicados
        predicate(isSimple(asignacion.getE1().getType()), "Asignacion expression must be simpletype", asignacion.getE1());
        predicate(sameType(asignacion.getE1().getType(), asignacion.getE2().getType()), "Asignacion expressions must be the same type", asignacion);
        predicate(asignacion.getE1().isLvalue(), "Asignacion expression must be lvalue", asignacion.getE1());

		// asignacion.getE1().accept(this, param);
		// asignacion.getE2().accept(this, param);
		super.visit(asignacion, param);

		return null;
	}

	// class FuncionLlamada(String ID, List<Expression> expressions)
	// phase Identification { FunctionDeclaration functionDeclaration }
	@Override
	public Object visit(FuncionLlamada funcionLlamada, Object param) {
        // Predicados	
        predicate(funcionLlamada.getFuncion().getParameters().size() == funcionLlamada.getExpressions().size(), "Function call parameters must be the same as function declaration", funcionLlamada);
        for(int i = 0; i < funcionLlamada.getExpressions().size(); i++){
            predicate(sameType(funcionLlamada.getFuncion().getParameters().get(i).getType(), funcionLlamada.getExpressions().get(i).getType()), "Function call parameters must be the same as function declaration", funcionLlamada);
        }

		// funcionLlamada.getExpressions().forEach(expression -> expression.accept(this, param));
		super.visit(funcionLlamada, param);

		return null;
	}

	// class Cast(Type targetType, Expression expression)
	// phase TypeChecking { Type type, boolean lvalue }
	@Override
	public Object visit(Cast cast, Object param) {
        // Predicados	
        predicate(!cast.getTargetType().getClass().equals(cast.getExpression().getType().getClass()), "Cast expression must be different type", cast);

		// cast.getTargetType().accept(this, param);
		// cast.getExpression().accept(this, param);
		super.visit(cast, param);

		// TODO: Remember to initialize SYNTHESIZED attributes <-----
		cast.setType(cast.getTargetType());
		cast.setLvalue(false);
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

    //# ----------------------------------------------------------
    //# Auxiliary methods (optional)

    private boolean isSimple(Type type) {
        return type instanceof IntType || type instanceof RealType || type instanceof CharType;
    }

    private boolean isSimpleOrVoid(Type type) {
        return type instanceof VoidType || isSimple(type);
    }

    private boolean sameType(Type type1, Type type2) {
        return type1.getClass().equals(type2.getClass());
    }

    private void notifyError(String errorMessage, Position position) {
        errorManager.notify("Type Checking", errorMessage, position);
    }

    private void notifyError(String msg) {
        errorManager.notify("Type Checking", msg);
    }

    /**
     * predicate. Auxiliary method to implement predicates. Delete if not needed.
     *
     * Usage examples:
     *
     *    predicate(expr.type != null), "Type cannot be null", expr.start());
     *
     *    predicate(expr.type != null), "Type cannot be null", expr);       // expr.start() is assumed
     *
     * The start() method (example 1) indicates the position in the file where the node was. If VGen is used, this method
     * will have been generated in all AST nodes.
     *
     * @param condition     Must be met to avoid an error
     * @param errorMessage  Printed if the condition is not met
     * @param errorPosition Row and column in the file where the error occurred.
     * @return true if the condition is met
     */

    private boolean predicate(boolean condition, String errorMessage, Position position) {
        if (!condition) {
            notifyError(errorMessage, position);
            return false;
        }

        return true;
    }

    private boolean predicate(boolean condition, String errorMessage, AST node) {
        return predicate(condition, errorMessage, node.start());
    }

}
