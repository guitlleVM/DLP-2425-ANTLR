package semantic;

import java.util.HashMap;
import java.util.Map;

import ast.*;
import ast.declaration.*;
import main.ErrorManager;
import visitor.DefaultVisitor;

// This class will be implemented in identification phase

public class Identification extends DefaultVisitor {

    private ErrorManager errorManager;

    private ContextMap<VariableDeclaration> variables = new ContextMap<VariableDeclaration>();
    private HashMap<String, FunctionDeclaration> functions = new HashMap<>();
    private Map<String, StructDeclaration> structs = new HashMap<>();


    public Identification(ErrorManager errorManager) {
        this.errorManager = errorManager;
    }

    public void process(AST ast) {
        ast.accept(this, null);
    }

    // # ----------------------------------------------------------
    /*
     * Write "visits" here...
     */

    // public Object visit(Program prog, Object param) {
    //      ...
    // }
    

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
