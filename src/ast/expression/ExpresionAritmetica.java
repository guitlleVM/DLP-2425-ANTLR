// Generated with VGen 2.0.0

package ast.expression;

import ast.type.*;
import org.antlr.v4.runtime.Token;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	expresionAritmetica: expression -> e1:expression op:string e2:expression
	expression -> 
	
	PHASE TypeChecking
	expression -> type:type
	expression -> lvalue:boolean
*/
public class ExpresionAritmetica extends AbstractExpression  {

    // ----------------------------------
    // Instance Variables

	// expresionAritmetica: expression -> e1:expression op:string e2:expression
	private Expression e1;
	private String op;
	private Expression e2;

    // ----------------------------------
    // Constructors

	public ExpresionAritmetica(Expression e1, String op, Expression e2) {
		super();

		if (e1 == null)
			throw new IllegalArgumentException("Parameter 'e1' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.e1 = e1;

		if (op == null)
			throw new IllegalArgumentException("Parameter 'op' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.op = op;

		if (e2 == null)
			throw new IllegalArgumentException("Parameter 'e2' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.e2 = e2;

		updatePositions(e1, op, e2);
	}

	public ExpresionAritmetica(Object e1, Object op, Object e2) {
		super();

        if (e1 == null)
            throw new IllegalArgumentException("Parameter 'e1' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.e1 = (Expression) e1;

        if (op == null)
            throw new IllegalArgumentException("Parameter 'op' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.op = (op instanceof Token) ? ((Token) op).getText() : (String) op;

        if (e2 == null)
            throw new IllegalArgumentException("Parameter 'e2' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.e2 = (Expression) e2;

		updatePositions(e1, op, e2);
	}


    // ----------------------------------
    // expresionAritmetica: expression -> e1:expression op:string e2:expression

	// Child 'e1:expression' 

	public void setE1(Expression e1) {
		if (e1 == null)
			throw new IllegalArgumentException("Parameter 'e1' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.e1 = e1;

	}

    public Expression getE1() {
        return e1;
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


	// Child 'e2:expression' 

	public void setE2(Expression e2) {
		if (e2 == null)
			throw new IllegalArgumentException("Parameter 'e2' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.e2 = e2;

	}

    public Expression getE2() {
        return e2;
    }


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "ExpresionAritmetica{" + " e1=" + this.getE1() + " op=" + this.getOp() + " e2=" + this.getE2() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
