// Generated with VGen 2.0.0

package codegeneration.mapl.codefunctions;

import ast.declaration.*;
import codegeneration.mapl.*;


public class Define extends AbstractCodeFunction {

    public Define(MaplCodeSpecification specification) {
        super(specification);
    }


	// class StructDeclaration(String ID, List<VariableDeclaration> variableDeclarations)
	@Override
	public Object visit(StructDeclaration structDeclaration, Object param) {

		// define(structDeclaration.variableDeclarations());

		out("<instruction>");

		return null;
	}

	// class VariableDeclaration(String ID, Type type)
	// phase MemoryAllocation { int address }
	@Override
	public Object visit(VariableDeclaration variableDeclaration, Object param) {

		out("<instruction>");

		return null;
	}

	// class FunctionDeclaration(String ID, List<VariableDeclaration> parameters, Type type, List<VariableDeclaration> variableDeclarations, List<Statement> statements)
	@Override
	public Object visit(FunctionDeclaration functionDeclaration, Object param) {

		// define(functionDeclaration.parameters());

		// define(functionDeclaration.variableDeclarations());

		// execute(functionDeclaration.statements());

		out("<instruction>");

		return null;
	}

}
