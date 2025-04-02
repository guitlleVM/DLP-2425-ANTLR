/**
 * MLang. Programming Language Design Tutorial
 * @author Raúl Izquierdo (raul@uniovi.es)
 */

package semantic;

import visitor.DefaultVisitor;

import java.lang.annotation.Target;
import java.lang.reflect.Parameter;

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
		for(Statement st : functionDeclaration.getStatements()){
			st.setFuncion(functionDeclaration);
		}

        if(functionDeclaration.getParameters() != null){
			for(VariableDeclaration c : functionDeclaration.getParameters()){
				c.accept(this, param);
				predicate(isSimple(c.getType()), "Error: Los parametros deber ser de tipo simple", functionDeclaration);
			}
		}
       
		if(functionDeclaration.getType() != null){
			functionDeclaration.getType().accept(this, param);
			predicate(isSimpleOrVoid(functionDeclaration.getType()), "Function type must be simple or void", functionDeclaration);
		}

		functionDeclaration.getVariableDeclarations().forEach(variableDeclaration -> variableDeclaration.accept(this, param));
		functionDeclaration.getStatements().forEach(statement -> statement.accept(this, param));

		return null;
	}

	// class Print(List<Expression> expressions)
	@Override
	public Object visit(Print print, Object param) {
		if(print.getExpressions() != null){
			print.getExpressions().forEach( e -> e.accept(this, param));
		}
       
        print.getExpressions().forEach(e -> predicate(isSimple(e.getType()), "Print expression must be simple", e));
        
		return null;
	}

	// class Printsp(List<Expression> expressions)
	@Override
	public Object visit(Printsp printsp, Object param) {
		if(printsp.getExpressions() != null){
			printsp.getExpressions().forEach( e -> e.accept(this, param));
		}
        
        printsp.getExpressions().forEach(e -> predicate(isSimple(e.getType()), "Printsp expression must be simple", e));
	

		return null;
	}

	// class Println(List<Expression> expressions)
	@Override
	public Object visit(Println println, Object param) {
		if(println.getExpressions() != null){
			println.getExpressions().forEach( e -> e.accept(this, param));
		}
        println.getExpressions().forEach(e -> predicate(isSimple(e.getType()), "Println expression must be simple", e));
		
		return null;
	}

	// class Read(Expression expression)
	@Override
	public Object visit(Read read, Object param) {
		if(read.getExpression() != null){
			read.getExpression().accept(this, param);
		}

        predicate(isSimple(read.getExpression().getType()), "Read expression must be simple", read.getExpression());
        predicate(read.getExpression().isLvalue(), "Read expression must be lvalue", read.getExpression());		

		return null;
	}

	// class If(Expression expression, List<Statement> s1, List<Statement> s2)
	@Override
	public Object visit(If ifValue, Object param) {
		if(ifValue.getExpression() != null){
			ifValue.getExpression().accept(this, param);
		}

        predicate(ifValue.getExpression().getType() instanceof IntType, "If expression must be intType", ifValue.getExpression());

		if(ifValue.getS1() != null){
       		ifValue.getS1().forEach( s ->{
				s.setFuncion(ifValue.getFuncion());
				s.accept(this, param);
			});
		}

		if(ifValue.getS2() != null){
	   		ifValue.getS2().forEach( s ->{
				s.setFuncion(ifValue.getFuncion());
				s.accept(this, param);
			});
        }

		return null;
	}

	// class While(Expression expression, List<Statement> statements)
	@Override
	public Object visit(While whileValue, Object param) {
		if(whileValue.getExpression() != null){
			whileValue.getExpression().accept(this, param);
		}
        
        predicate(whileValue.getExpression().getType() instanceof IntType, "While expression must be intType", whileValue.getExpression());

        if(whileValue.getStatements() != null){		
        	whileValue.getStatements().forEach( s ->{ 
				s.setFuncion(whileValue.getFuncion());
				s.accept(this, param);
			});
		}

		return null;
	}

	// class Return(Optional<Expression> expression)
	@Override
	public Object visit(Return returnValue, Object param) {
		super.visit(returnValue, param);
        
        if(returnValue.getFuncion().getType() instanceof VoidType){
            predicate(returnValue.getExpression().isEmpty(), "Return expression must be void", returnValue);
        }else{		
			if(returnValue.getExpression().isEmpty()){
				predicate(false, "Error: el valor de retorno de la funcion no puede ser vacio", returnValue.getFuncion());
			}else{
				predicate(sameType(returnValue.getFuncion().getType(),returnValue.getExpression().get().getType()), "Return expression must be the same as function return type", returnValue);
			}	
		}     

		return null;
	}

	// class Asignacion(Expression e1, Expression e2)
	@Override
	public Object visit(Asignacion asignacion, Object param) {
		if(asignacion.getE1() != null){
			asignacion.getE1().accept(this, param);
		}
		if(asignacion.getE2() != null){
			asignacion.getE2().accept(this, param);
		}
        predicate(sameType(asignacion.getE1().getType(), asignacion.getE2().getType()), "Asignacion expressions must be the same type", asignacion);
		predicate(asignacion.getE1().isLvalue(), "Asignacion expression must be lvalue", asignacion.getE1());
        predicate(isSimple(asignacion.getE1().getType()), "Asignacion expression must be simpletype", asignacion.getE1());
       
		return null;
	}

	// class FuncionLlamada(String ID, List<Expression> expressions)
	// phase Identification { FunctionDeclaration functionDeclaration }
	@Override
	public Object visit(FuncionLlamada funcionLlamada, Object param) {
		funcionLlamada.getExpressions().forEach(expression -> expression.accept(this, param));
		
        // Predicados
		predicate(funcionLlamada.getFunctionDeclaration().getParameters().size() == funcionLlamada.getExpressions().size(), "Function call parameters must be the same as function declaration", funcionLlamada);
		
		if(funcionLlamada.getFunctionDeclaration().getParameters().size() == funcionLlamada.getExpressions().size()){
			for(int i = 0; i < funcionLlamada.getExpressions().size(); i++){
				predicate(sameType(funcionLlamada.getFunctionDeclaration().getParameters().get(i).getType(), funcionLlamada.getExpressions().get(i).getType()), "Function call parameters must be the same as function declaration", funcionLlamada);
			}
		}
		
		return null;
	}

	// class Cast(Type targetType, Expression expression)
	// phase TypeChecking { Type type, boolean lvalue }
	@Override
	public Object visit(Cast cast, Object param) {
		super.visit(cast, param);

        cast.setType(cast.getTargetType());
		cast.setLvalue(false);

        predicate(!sameType(cast.getTargetType(), cast.getExpression().getType()), "Cast expression must be different type", cast);
		predicate(isSimple(cast.getType()), "No se puede hacer cast a tipos complejos (Expresion)", cast.start());
		predicate(isSimple(cast.getExpression().getType()), "No se puede hacer cast de tipos complejos (Target)", cast.start());
		
		return null;
	}

	// class StructAccess(Expression expression, String ID)
	// phase TypeChecking { Type type, boolean lvalue }
	@Override
	public Object visit(StructAccess structAccess, Object param) {

		if(structAccess.getExpression() != null){
			structAccess.getExpression().accept(this, param);
		}

		predicate(structAccess.getExpression().getType() instanceof StructType, "Error: el structAcces no es de tipo struct", structAccess);

		structAccess.setLvalue(true);

		if(structAccess.getExpression().getType() instanceof StructType){
			StructType structType = (StructType) structAccess.getExpression().getType();
			StructDeclaration structDeclaration = structType.getStructDeclaration();
			for(VariableDeclaration v : structDeclaration.getVariableDeclarations()){
				if(v.getID().equals(structAccess.getID())){
					structAccess.setType(v.getType());
				}
			}

			predicate(structAccess.getType() != null, "Error: el structAccess no ha sido defindio", structAccess.start());
		}
		
		return null;
	}

	// class ArrayAccess(Expression e1, Expression e2)
	// phase TypeChecking { Type type, boolean lvalue }
	@Override
	public Object visit(ArrayAccess arrayAccess, Object param) {

		if(arrayAccess.getE1() != null){
			arrayAccess.getE1().accept(this, param);
		}

		if(arrayAccess.getE2() != null){
			arrayAccess.getE2().accept(this, param);
		}

		predicate(arrayAccess.getE1().getType() instanceof ArrayType, "Error : el arrayAccess no es de tipo Array", arrayAccess);

		if(arrayAccess.getE1().getType() instanceof ArrayType){
			predicate(arrayAccess.getE2().getType() instanceof IntType, "Error : el arrayAccess no es de tipo Int", arrayAccess);
			arrayAccess.setType(((ArrayType) arrayAccess.getE1().getType()).getType());
		}
		
		arrayAccess.setLvalue(true);
		return null;
	}

	// class ExpresionLlamada(String ID, List<Expression> expressions)
	// phase Identification { FunctionDeclaration functionDeclaration }
	// phase TypeChecking { Type type, boolean lvalue }
	@Override
	public Object visit(ExpresionLlamada expresionLlamada, Object param) {
		expresionLlamada.getExpressions().forEach(expression -> expression.accept(this, param));

		predicate(!(expresionLlamada.getFunctionDeclaration().getType() instanceof VoidType), "Error: la funcion no devuelve nada", expresionLlamada);
		predicate(expresionLlamada.getExpressions().size() == expresionLlamada.getFunctionDeclaration().getParameters().size(), "Error: Se esperaban " + expresionLlamada.getFunctionDeclaration().getParameters().size() + " argumentos", expresionLlamada);
		
		if(expresionLlamada.getExpressions().size() == expresionLlamada.getFunctionDeclaration().getParameters().size()){
			for(int i = 0; i < expresionLlamada.getExpressions().size(); i++){
				predicate(sameType(expresionLlamada.getFunctionDeclaration().getParameters().get(i).getType(), expresionLlamada.getExpressions().get(i).getType()), "Error: los tipos de los paremetros no coinciden", expresionLlamada);
			}
		}	
		expresionLlamada.setType(expresionLlamada.getFunctionDeclaration().getType());
		expresionLlamada.setLvalue(false);
		return null;
	}

	// class Not(Expression expression)
	// phase TypeChecking { Type type, boolean lvalue }
	@Override
	public Object visit(Not not, Object param) {
		if(not.getExpression() != null){
			not.getExpression().accept(this, param);
		}
		predicate(not.getExpression().getType() instanceof IntType, "Error: el not no es de tipo Int", not);
		
		not.setType(new IntType());
		not.setLvalue(false);

		return null;
	}

	// class ExpresionAritmetica(Expression e1, String op, Expression e2)
	// phase TypeChecking { Type type, boolean lvalue }
	@Override
	public Object visit(ExpresionAritmetica expresionAritmetica, Object param) {
		if(expresionAritmetica.getE1() != null){
			expresionAritmetica.getE1().accept(this, param);
		}
		if(expresionAritmetica.getE2() != null){
			expresionAritmetica.getE2().accept(this, param);
		}
		
		predicate(sameType(expresionAritmetica.getE1().getType(), expresionAritmetica.getE2().getType()), "Los tipos de ambos operadores tienen que ser el mismo", expresionAritmetica);
		
		switch (expresionAritmetica.getOp()) {
			case "%":
				predicate(expresionAritmetica.getE1().getType() instanceof IntType, "Para la expresion 1 solo se admite Int", expresionAritmetica);
				predicate(expresionAritmetica.getE2().getType() instanceof IntType, "Para la expresion 2 solo se admite Int", expresionAritmetica);
				break;
			default:
				predicate(expresionAritmetica.getE1().getType() instanceof IntType || expresionAritmetica.getE1().getType() instanceof RealType, 
				"Para la expresion 1 solo se admite Int o Real", expresionAritmetica);
				predicate(expresionAritmetica.getE2().getType() instanceof IntType || expresionAritmetica.getE2().getType() instanceof RealType, 
				"Para la expresion2 solo se admite Int o Real", expresionAritmetica);
				break;
		}

		expresionAritmetica.setType(expresionAritmetica.getE1().getType());
		expresionAritmetica.setLvalue(false);
		
		return null;
	}

	// class ExpresionLogica(Expression e1, String op, Expression e2)
	// phase TypeChecking { Type type, boolean lvalue }
	@Override
	public Object visit(ExpresionLogica expresionLogica, Object param) {
		if(expresionLogica.getE1() != null){
			expresionLogica.getE1().accept(this, param);
		}
		if(expresionLogica.getE2() != null){
			expresionLogica.getE2().accept(this, param);
		}

		predicate(sameType(expresionLogica.getE1().getType(), expresionLogica.getE2().getType()), "Los tipos de ambos operadores tienen que ser el mismo", expresionLogica);

		// Check the operator
		switch (expresionLogica.getOp()) {
			case ">":
			case ">=":
			case "<":
			case "<=":
			case "==":
			case "!=":
				// Comparisons: applicable to IntType and RealType
				predicate(expresionLogica.getE1().getType() instanceof IntType || 
						  expresionLogica.getE1().getType() instanceof RealType,
						  "La expresion 1 es incorrecta, solo se admite tipos Int o Real", expresionLogica);
				predicate(expresionLogica.getE2().getType() instanceof IntType || 
						  expresionLogica.getE2().getType() instanceof RealType,
						  "La expresion 2 es incorrecta, solo se admite tipos Int o Real", expresionLogica);		  
				break;
	
			case "&&":
			case "||":
				// Logical operators: applicable only to IntType
				predicate(expresionLogica.getE1().getType() instanceof IntType, 
						  "La expresion 1 es incorrecta, solo se admite Int ", expresionLogica);
				predicate(expresionLogica.getE2().getType() instanceof IntType, 
						  "La expresion 2 es incorrecta, solo se admite Int ", expresionLogica);
				break;
	
			default:
				notifyError("Operador lógico desconocido: " + expresionLogica.getOp(), expresionLogica.start());
		}

		expresionLogica.setType(new IntType());
		expresionLogica.setLvalue(false);
		return null;
	}

	// class Variable(String ID)
	// phase Identification { VariableDeclaration variableDeclaration }
	// phase TypeChecking { Type type, boolean lvalue }
	@Override
	public Object visit(Variable variable, Object param) {
		variable.setLvalue(true);
		variable.setType(variable.getVariableDeclaration().getType());
		return null;
	}

	// class LitEnt(String LITENT)
	// phase TypeChecking { Type type, boolean lvalue }
	@Override
	public Object visit(LitEnt litEnt, Object param) {
		litEnt.setType(new IntType());
		litEnt.setLvalue(false);
		return null;
	}

	// class LitReal(String LITREAL)
	// phase TypeChecking { Type type, boolean lvalue }
	@Override
	public Object visit(LitReal litReal, Object param) {
		litReal.setType(new RealType());
		litReal.setLvalue(false);
		return null;
	}

	// class LitChar(String CHAR_LITERAL)
	// phase TypeChecking { Type type, boolean lvalue }
	@Override
	public Object visit(LitChar litChar, Object param) {
		litChar.setType(new CharType());
		litChar.setLvalue(false);
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
		if(type1 instanceof ArrayType && type2 instanceof ArrayType){			
			do {
				type1 = ((ArrayType) type1).getType();
				type2 = ((ArrayType) type2).getType();
			} while (type1 instanceof ArrayType && type2 instanceof ArrayType);
		}	

		if(type1 instanceof StructType && type2 instanceof StructType){
			return ((StructType) type1).getNombre().equals(((StructType) type2).getNombre());
		}

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
