// Generated with VGen 2.0.0

package codegeneration.mapl.codefunctions;

import ast.statement.*;
import ast.declaration.*;
import ast.type.VoidType;
import codegeneration.mapl.*;


public class Define extends AbstractCodeFunction {

    public Define(MaplCodeSpecification specification) {
        super(specification);
    }


	// class StructDeclaration(String ID, List<VariableDeclaration> variableDeclarations)
	@Override
	public Object visit(StructDeclaration structDeclaration, Object param) {

		out("#TYPE " + structDeclaration.getID() + ":{");

		for (VariableDeclaration variableDeclaration : structDeclaration.getVariableDeclarations()) {
			out(variableDeclaration.getID() + ":" + variableDeclaration.getType().nameForMAPL());
		}

		out("}");

		return null;
	}

	// class VariableDeclaration(String ID, Type type)
	// phase MemoryAllocation { int address }
	@Override
	public Object visit(VariableDeclaration variableDeclaration, Object param) {

		out("#GLOBAL " + variableDeclaration.getID() + ":" + variableDeclaration.getType().nameForMAPL());

		return null;
	}

	// class FunctionDeclaration(String ID, List<VariableDeclaration> parameters, Type type, List<VariableDeclaration> variableDeclarations, List<Statement> statements)
	@Override
	public Object visit(FunctionDeclaration functionDeclaration, Object param) {

		out("#line " + functionDeclaration.start().getLine());
		int sizeLocales = 0;
		int sizeParameters = 0;
		out(functionDeclaration.getID()+ ":");

		if(functionDeclaration.getParameters() != null) {
			for (VariableDeclaration parameter : functionDeclaration.getParameters()) {
				sizeParameters += parameter.getType().getSize();
			}
		}

		if(functionDeclaration.getVariableDeclarations() != null) {
			for (VariableDeclaration variableDeclaration : functionDeclaration.getVariableDeclarations()) {
				sizeLocales += variableDeclaration.getType().getSize();
			}
		}

		out("enter " +  sizeLocales);

		execute(functionDeclaration.statements());

		if(functionDeclaration.getStatements().size() > 0) {
			Statement lastStatement = functionDeclaration.getStatements().get(functionDeclaration.getStatements().size() - 1);

			if(functionDeclaration.getType().getClass().equals(VoidType.class) && !(lastStatement instanceof Return)) {
				out("ret 0, " + sizeLocales + ", " + sizeParameters);
			}
		}else{
			out("ret 0, " + sizeLocales + ", " + sizeParameters);
		}
		
		return null;
	}

}
