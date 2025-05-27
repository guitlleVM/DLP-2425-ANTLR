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

		String Suffexpresion = suffixFor(cast.getExpression().getType());
		String SuffTarget = suffixFor(cast.getTargetType());

		value(cast.getExpression());

		if(Suffexpresion == "f" && SuffTarget == "b" ){
			out("f2i");
			out("i2b");
			
		}else{
			if(Suffexpresion == "b" && SuffTarget == "f" ){
				out("b2i");
				out("i2f");
			}else{
				out(Suffexpresion+"2"+SuffTarget);
			}
		}
		
		

		return null;
	}

	// class StructAccess(Expression expression, String ID)
	// phase TypeChecking { Type type, boolean lvalue }
	@Override
	public Object visit(StructAccess structAccess, Object param) {

		address(structAccess);
		out("load" + suffixFor(structAccess.getType()));

		return null;
	}

	// class ArrayAccess(Expression e1, Expression e2)
	// phase TypeChecking { Type type, boolean lvalue }
	@Override
	public Object visit(ArrayAccess arrayAccess, Object param) {

		address(arrayAccess);

		out("load" + suffixFor(arrayAccess.getType()));

		return null;
	}

	// class ExpresionLlamada(String ID, List<Expression> expressions)
	// phase Identification { FunctionDeclaration functionDeclaration }
	// phase TypeChecking { Type type, boolean lvalue }
	@Override
	public Object visit(ExpresionLlamada expresionLlamada, Object param) {
		
		if(expresionLlamada.getExpressions() != null) {
			value(expresionLlamada.expressions());
		}
		
		out("call " + expresionLlamada.getID());

		return null;
	}

	// class Not(Expression expression)
	// phase TypeChecking { Type type, boolean lvalue }
	@Override
	public Object visit(Not not, Object param) {

		value(not.getExpression());
		out("not");

		return null;
	}

	// class ExpresionAritmetica(Expression e1, String op, Expression e2)
	// phase TypeChecking { Type type, boolean lvalue }
	@Override
	public Object visit(ExpresionAritmetica expresionAritmetica, Object param) {

		value(expresionAritmetica.getE1());
		value(expresionAritmetica.getE2());
		switch (expresionAritmetica.getOp()) {
			case "+":
				out("add" + suffixFor(expresionAritmetica.getE1().getType()));
				break;
			case "-":
				out("sub" + suffixFor(expresionAritmetica.getE1().getType()));
				break;
			case "*":
				out("mul" + suffixFor(expresionAritmetica.getE1().getType()));
				break;
			case "/":
				out("div" + suffixFor(expresionAritmetica.getE1().getType()));
				break;
			case "%":
				out("mod" + suffixFor(expresionAritmetica.getE1().getType()));
				break;
			default:
				break;
		}
		
		return null;
	}

	// class ExpresionLogica(Expression e1, String op, Expression e2)
	// phase TypeChecking { Type type, boolean lvalue }
	@Override
	public Object visit(ExpresionLogica expresionLogica, Object param) {

		value(expresionLogica.getE1());		
		value(expresionLogica.getE2());
		switch (expresionLogica.getOp()) {
			case "&&":
				out("and" );
				break;
			case "||":
				out("or" );
				break;
			case "<":
				out("lt" + suffixFor(expresionLogica.getE1().getType()));
				break;
			case "<=":
				out("le" + suffixFor(expresionLogica.getE1().getType()));
				break;
			case ">":
				out("gt" + suffixFor(expresionLogica.getE1().getType()));
				break;
			case ">=":
				out("ge" + suffixFor(expresionLogica.getE1().getType()));
				break;
			case "==":	
				out("eq" + suffixFor(expresionLogica.getE1().getType()));
				break;
			case "!=":
				out("ne" + suffixFor(expresionLogica.getE1().getType()));
				break;		
			default:
				break;
		}

		return null;
	}

	// class Variable(String ID)
	// phase Identification { VariableDeclaration variableDeclaration }
	// phase TypeChecking { Type type, boolean lvalue }
	@Override
	public Object visit(Variable variable, Object param) {

		address(variable);

		out("load", variable.getVariableDeclaration().getType());	

		return null;
	}

	// class LitEnt(String LITENT)
	// phase TypeChecking { Type type, boolean lvalue }
	@Override
	public Object visit(LitEnt litEnt, Object param) {

		out("pushi " + litEnt.getLITENT());

		return null;
	}

	// class LitReal(String LITREAL)
	// phase TypeChecking { Type type, boolean lvalue }
	@Override
	public Object visit(LitReal litReal, Object param) {

		out("pushf " + litReal.getLITREAL());

		return null;
	}

	// class LitChar(String CHAR_LITERAL)
	// phase TypeChecking { Type type, boolean lvalue }
	@Override
	public Object visit(LitChar litChar, Object param) {
		String raw = litChar.getCHAR_LITERAL();
		String content = raw.substring(1, raw.length() - 1);  // p.ej. "\\n" o "a"

		char c;
		if (content.length() == 1) {
			// caso simple: 'a', 'Z', etc.
			c = content.charAt(0);
		} else if (content.charAt(0) == '\\' && content.length() >= 2) {
			// escape estándar de Java
			switch (content.charAt(1)) {
				case 'n':  c = '\n'; break;
				case 't':  c = '\t'; break;
				case 'r':  c = '\r'; break;
				case 'b':  c = '\b'; break;
				case 'f':  c = '\f'; break;
				case '\'': c = '\''; break;
				case '\"': c = '\"'; break;
				case '\\': c = '\\'; break;
				default:
					throw new IllegalArgumentException("Escape no soportado: \\" + content.charAt(1));
			}
		} else {
			throw new IllegalArgumentException("Literal inválida: " + raw);
		}

		out("pushb " + (int)c);
		return null;
	}

	// class Ternary(Expression eva, Expression verd, Expression menti)
	// phase TypeChecking { Type type, boolean lvalue }
	@Override
	public Object visit(Ternary ternary, Object param) {

		value(ternary.getEva());
		out("jz falso" );
		
		value(ternary.getVerd());
		out("jmp fin");

		out("falso:");
		
		value(ternary.getMenti());

		out("fin:");
		
		return null;
	}

}
