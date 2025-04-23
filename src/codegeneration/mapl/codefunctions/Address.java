// Generated with VGen 2.0.0

package codegeneration.mapl.codefunctions;

import java.util.List;

import ast.declaration.VariableDeclaration;
import ast.expression.*;
import ast.type.StructType;
import codegeneration.mapl.*;


public class Address extends AbstractCodeFunction {

    public Address(MaplCodeSpecification specification) {
        super(specification);
    }

	// class StructAccess(Expression expression, String ID)
	// phase TypeChecking { Type type, boolean lvalue }
	@Override
	public Object visit(StructAccess structAccess, Object param) {

		address(structAccess.getExpression());	
		StructType structType = (StructType)structAccess.getExpression().getType();
        List<VariableDeclaration> lista = structType.getStructDeclaration().getVariableDeclarations();
        for(VariableDeclaration variableDeclaration : lista) {
            if(variableDeclaration.getID().equals(structAccess.getID())) {
                out("pushi " + variableDeclaration.getAddress());
                break;
            }
        }
        out("addi"); // address + offset

		return null;
	}

	// class ArrayAccess(Expression e1, Expression e2)
	// phase TypeChecking { Type type, boolean lvalue } v[20] 
	@Override
	public Object visit(ArrayAccess arrayAccess, Object param) {

		address(arrayAccess.getE1());
		out("pushi " + arrayAccess.getType().getSize());		
		value(arrayAccess.getE2());
		out("muli"); 
		out("addi");
		
		return null;
	}

	// class Variable(String ID)
	// phase Identification { VariableDeclaration variableDeclaration }
	// phase TypeChecking { Type type, boolean lvalue }
	@Override
	public Object visit(Variable variable, Object param) {

		switch (variable.getVariableDeclaration().getAmbito()) {			
			case "parametro":
				out("pusha BP");
				out("pushi " + variable.getVariableDeclaration().getAddress());
				out("add");
				break;
			case "local":
				out("pusha BP");
				out("pushi " + variable.getVariableDeclaration().getAddress());
				out("add");
				break;
			default:
				out("pusha " + variable.getVariableDeclaration().getAddress());
				break;
		}
		
		return null;
	}

}
