// Generated with VGen 2.0.0

/**
* Este interfaz es el resultado de la aplicación del patrón Visitor a los nodos del AST.
*/

package visitor;

import ast.*;
import ast.declaration.*;
import ast.statement.*;
import ast.expression.*;
import ast.type.*;




public interface Visitor {
	public Object visit(Program program, Object param);

	public Object visit(StructDeclaration structDeclaration, Object param);

	public Object visit(Variable variable, Object param);

	public Object visit(VariableDeclaration variableDeclaration, Object param);

	public Object visit(FunctionDeclaration functionDeclaration, Object param);

	public Object visit(Parameter parameter, Object param);

	public Object visit(Print print, Object param);

	public Object visit(Printsp printsp, Object param);

	public Object visit(Println println, Object param);

	public Object visit(Read read, Object param);

	public Object visit(If ifValue, Object param);

	public Object visit(While whileValue, Object param);

	public Object visit(Return returnValue, Object param);

	public Object visit(Asignacion asignacion, Object param);

	public Object visit(FuncionLlamada funcionLlamada, Object param);

	public Object visit(Cast cast, Object param);

	public Object visit(Struct struct, Object param);

	public Object visit(Array array, Object param);

	public Object visit(ExpresionLlamada expresionLlamada, Object param);

	public Object visit(Not not, Object param);

	public Object visit(ExpresionAritmetica expresionAritmetica, Object param);

	public Object visit(ExpresionLogica expresionLogica, Object param);

	public Object visit(Id id, Object param);

	public Object visit(LitEnt litEnt, Object param);

	public Object visit(LitReal litReal, Object param);

	public Object visit(LitChar litChar, Object param);

	public Object visit(IntType intType, Object param);

	public Object visit(RealType realType, Object param);

	public Object visit(CharType charType, Object param);

	public Object visit(ArrayType arrayType, Object param);

	public Object visit(StructType structType, Object param);


}
