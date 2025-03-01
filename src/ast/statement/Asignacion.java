// Generated with VGen 2.0.0

package ast.statement;

import ast.expression.*;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------


/*
	asignacion: statement -> e1:expression e2:expression
	statement -> 
*/
public class Asignacion extends AbstractStatement  {

    // ----------------------------------
    // Instance Variables

	// asignacion: statement -> e1:expression e2:expression
	private Expression e1;
	private Expression e2;

    // ----------------------------------
    // Constructors

	public Asignacion(Expression e1, Expression e2) {
		super();

		if (e1 == null)
			throw new IllegalArgumentException("Parameter 'e1' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.e1 = e1;

		if (e2 == null)
			throw new IllegalArgumentException("Parameter 'e2' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.e2 = e2;

		updatePositions(e1, e2);
	}

	public Asignacion(Object e1, Object e2) {
		super();

        if (e1 == null)
            throw new IllegalArgumentException("Parameter 'e1' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.e1 = (Expression) e1;

        if (e2 == null)
            throw new IllegalArgumentException("Parameter 'e2' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.e2 = (Expression) e2;

		updatePositions(e1, e2);
	}


    // ----------------------------------
    // asignacion: statement -> e1:expression e2:expression

	// Child 'e1:expression' 

	public void setE1(Expression e1) {
		if (e1 == null)
			throw new IllegalArgumentException("Parameter 'e1' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.e1 = e1;

	}

    public Expression getE1() {
        return e1;
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
        return "Asignacion{" + " e1=" + this.getE1() + " e2=" + this.getE2() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------

}
