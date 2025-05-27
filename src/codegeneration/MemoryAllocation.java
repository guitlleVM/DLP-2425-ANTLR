package codegeneration;

import ast.*;
import ast.declaration.Declaration;
import ast.declaration.FunctionDeclaration;
import ast.declaration.StructDeclaration;
import ast.declaration.VariableDeclaration;
import ast.statement.ForC;
import ast.statement.Inicializacion;
import visitor.DefaultVisitor;

// This class will be implemented in memory allocation phase

public class MemoryAllocation extends DefaultVisitor {

    public void process(AST ast) {
        ast.accept(this, null);
    }

    // class Program(List<Declaration> declarations)
	@Override
	public Object visit(Program program, Object param) {

        int currentAddress = 0;

		for (Declaration declaration : program.getDeclarations()) {
			if (declaration instanceof VariableDeclaration) {
				((VariableDeclaration) declaration).setAddress(currentAddress);
				currentAddress += ((VariableDeclaration) declaration).getType().getSize();
			}
			declaration.accept(this, param);
		}

		return null;
	}

	// class StructDeclaration(String ID, List<VariableDeclaration> variableDeclarations)
	@Override
	public Object visit(StructDeclaration structDeclaration, Object param) {

		if(structDeclaration.getVariableDeclarations() != null) {
			int address = 0;

			for (var variableDeclaration : structDeclaration.getVariableDeclarations()) {
				variableDeclaration.setAddress(address);
				address += variableDeclaration.getType().getSize();
				variableDeclaration.accept(this, param);
			}
		}

		return null;
	}

	// class FunctionDeclaration(String ID, List<VariableDeclaration> parameters, Type type, List<VariableDeclaration> variableDeclarations, List<Statement> statements)
	@Override
	public Object visit(FunctionDeclaration functionDeclaration, Object param) {

		// Parametros
		if(functionDeclaration.getParameters() != null) {
			int address = 4;

			for (int i = (functionDeclaration.getParameters().size() - 1); i >= 0; i--) {
				functionDeclaration.getParameters().get(i).setAddress(address);
				address += functionDeclaration.getParameters().get(i).getType().getSize();
				functionDeclaration.getParameters().get(i).accept(this, param);
			}
		}
		if (functionDeclaration.getType() != null)
			functionDeclaration.getType().accept(this, param);

		int addressFinalVariablesLocales = 0;

		if(functionDeclaration.getVariableDeclarations() != null) {
			int address = 0;

			for (var variableDeclaration : functionDeclaration.getVariableDeclarations()) {
				address -= variableDeclaration.getType().getSize();
				variableDeclaration.setAddress(address);
				variableDeclaration.accept(this, param);
			}

			addressFinalVariablesLocales = address;
		}

		if(functionDeclaration.getStatements() != null) {
			for (var statement : functionDeclaration.getStatements()) {
				if(statement instanceof ForC){
					Inicializacion inicializacion = (Inicializacion) ((ForC) statement).getInicializacion();
					VariableDeclaration variableDeclaration = inicializacion.getVariableDeclaration();
					if(variableDeclaration != null) {
						addressFinalVariablesLocales -= variableDeclaration.getType().getSize();
						variableDeclaration.setAddress(addressFinalVariablesLocales);						
					}
				}
				statement.accept(this, param);
			}
		}

		return null;
	}

}
