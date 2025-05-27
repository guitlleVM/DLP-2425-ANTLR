package semantic;

import java.util.HashMap;
import java.util.Map;

import ast.*;
import ast.declaration.*;
import ast.expression.ExpresionLlamada;
import ast.expression.Variable;
import ast.statement.ForC;
import ast.statement.FuncionLlamada;
import ast.statement.Inicializacion;
import ast.type.StructType;
import main.ErrorManager;
import visitor.DefaultVisitor;

// This class will be implemented in identification phase

public class Identification extends DefaultVisitor {

    private ErrorManager errorManager;

    private ContextMap<VariableDeclaration> variables = new ContextMap<VariableDeclaration>();
    private Map<String, FunctionDeclaration> functions = new HashMap<>();
    private Map<String, StructDeclaration> structs = new HashMap<>();


    public Identification(ErrorManager errorManager) {
        this.errorManager = errorManager;
    }

    public void process(AST ast) {
        ast.accept(this, null);
    }

    // # ----------------------------------------------------------
    
    // STRUCTURAS
	@Override
	public Object visit(StructDeclaration structDeclaration, Object param) {

        StructDeclaration definicion = structs.get(structDeclaration.getID());

        if(definicion != null)
            notifyError("Struct ya definida: " + structDeclaration.getID(), structDeclaration);
        else
            structs.put(structDeclaration.getID(), structDeclaration);

        variables.set();

        structDeclaration.getVariableDeclarations().forEach(variableDeclaration -> variableDeclaration.accept(this, param));

        variables.reset();
		return null;
	}

	@Override
	public Object visit(StructType structType, Object param) {

        StructDeclaration definicion = structs.get(structType.getNombre());

        if(definicion == null)
            notifyError("Struct no definida: " + structType.getNombre(), structType);
        else
            structType.setStructDeclaration(definicion);
		return null;
	}
    
    // Varaibles
	@Override
	public Object visit(VariableDeclaration variableDeclaration, Object param) {
        VariableDeclaration definicion = variables.getFromTop(variableDeclaration.getID());

        if(definicion != null)
            notifyError("Variable ya definida: " + variableDeclaration.getID(), variableDeclaration);
        else
		    variables.put(variableDeclaration.getID(), variableDeclaration);

        variableDeclaration.getType().accept(this, param);

		return null;
	}

	@Override
	public Object visit(Variable variable, Object param) {

        VariableDeclaration definicion = variables.getFromAny(variable.getID());

        if(definicion == null)
            notifyError("Variable no definida: " + variable.getID(), variable);
		else
            variable.setVariableDeclaration(definicion);

		return null;
	}

    // FUNCIONES
	@Override
	public Object visit(FunctionDeclaration functionDeclaration, Object param) {       

        FunctionDeclaration definicion = functions.get(functionDeclaration.getID());        
        if(definicion != null)
            notifyError("Funcion ya definida: " + functionDeclaration.getID(), functionDeclaration);
        else
            functions.put(functionDeclaration.getID(), functionDeclaration);

        variables.set();
        
        functionDeclaration.getParameters().forEach(parameter ->{
            parameter.setAmbitoParametro();
            parameter.accept(this, param);
        });
		functionDeclaration.getVariableDeclarations().forEach(variableDeclaration -> {
            variableDeclaration.setAmbitoLocal();
            variableDeclaration.accept(this, param);
        });
       
		functionDeclaration.getStatements().forEach(statement -> {
            if(statement instanceof ForC) {
                Inicializacion inicializacion = (Inicializacion) ((ForC) statement).getInicializacion();
                VariableDeclaration variableDeclaration = inicializacion.getVariableDeclaration();
                if(variableDeclaration != null) {
                    variableDeclaration.setAmbitoLocal();                    
                }
            }
            statement.accept(this, param);
        });
		
        variables.reset();
		return null;
	}

	@Override
	public Object visit(FuncionLlamada funcionLlamada, Object param) {

		FunctionDeclaration definicion = functions.get(funcionLlamada.getID());

        if(definicion == null)
            notifyError("Funcion no definida: " + funcionLlamada.getID(), funcionLlamada);
        else
            funcionLlamada.setFunctionDeclaration(definicion);

        funcionLlamada.getExpressions().forEach(expression -> expression.accept(this, param));
		
		return null;
	}

	@Override
	public Object visit(ExpresionLlamada expresionLlamada, Object param) {

		FunctionDeclaration definicion = functions.get(expresionLlamada.getID());

        if(definicion == null)
            notifyError("Funcion no definida: " + expresionLlamada.getID(), expresionLlamada);    
        else
            expresionLlamada.setFunctionDeclaration(definicion);        

        expresionLlamada.getExpressions().forEach(expression -> expression.accept(this, param));

		return null;
	}

    // # --------------------------------------------------------
    // Métodos auxiliares recomendados (opcionales) -------------

    private void notifyError(String msg) {
        errorManager.notify("Identification", msg);
    }

    private void notifyError(String msg, Position position) {
        errorManager.notify("Identification", msg, position);
    }

    private void notifyError(String msg, AST node) {
        notifyError(msg, node.start());
    }

}