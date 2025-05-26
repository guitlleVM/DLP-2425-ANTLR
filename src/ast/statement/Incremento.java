// Generated with VGen 2.0.0

package ast.statement;

import ast.expression.*;
import ast.declaration.*;
import org.antlr.v4.runtime.Token;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	incremento: statement -> var:expression op:string
	statement -> 
	
	PHASE TypeChecking
	statement -> funcion:functionDeclaration
*/
public class Incremento extends AbstractStatement  {

    // ----------------------------------
    // Instance Variables

	// incremento: statement -> var:expression op:string
	private Expression var;
	private String op;

    // ----------------------------------
    // Constructors

	public Incremento(Expression var, String op) {
		super();

		if (var == null)
			throw new IllegalArgumentException("Parameter 'var' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.var = var;

		if (op == null)
			throw new IllegalArgumentException("Parameter 'op' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.op = op;

		updatePositions(var, op);
	}

	public Incremento(Object var, Object op) {
		super();

        if (var == null)
            throw new IllegalArgumentException("Parameter 'var' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.var = (Expression) var;

        if (op == null)
            throw new IllegalArgumentException("Parameter 'op' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.op = (op instanceof Token) ? ((Token) op).getText() : (String) op;

		updatePositions(var, op);
	}


    // ----------------------------------
    // incremento: statement -> var:expression op:string

	// Child 'var:expression' 

	public void setVar(Expression var) {
		if (var == null)
			throw new IllegalArgumentException("Parameter 'var' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.var = var;

	}

    public Expression getVar() {
        return var;
    }


	// Child 'op:string' 

	public void setOp(String op) {
		if (op == null)
			throw new IllegalArgumentException("Parameter 'op' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.op = op;

	}

    public String getOp() {
        return op;
    }


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "Incremento{" + " var=" + this.getVar() + " op=" + this.getOp() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
