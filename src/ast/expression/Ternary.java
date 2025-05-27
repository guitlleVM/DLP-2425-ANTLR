// Generated with VGen 2.0.0

package ast.expression;

import ast.type.*;
import org.antlr.v4.runtime.Token;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------


/*
	ternary: expression -> eva:expression verd:expression menti:expression
	expression -> 
	
	PHASE TypeChecking
	expression -> type:type
	expression -> lvalue:boolean
*/
public class Ternary extends AbstractExpression  {

    // ----------------------------------
    // Instance Variables

	// ternary: expression -> eva:expression verd:expression menti:expression
	private Expression eva;
	private Expression verd;
	private Expression menti;

    // ----------------------------------
    // Constructors

	public Ternary(Expression eva, Expression verd, Expression menti) {
		super();

		if (eva == null)
			throw new IllegalArgumentException("Parameter 'eva' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.eva = eva;

		if (verd == null)
			throw new IllegalArgumentException("Parameter 'verd' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.verd = verd;

		if (menti == null)
			throw new IllegalArgumentException("Parameter 'menti' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.menti = menti;

		updatePositions(eva, verd, menti);
	}

	public Ternary(Object eva, Object verd, Object menti) {
		super();

        if (eva == null)
            throw new IllegalArgumentException("Parameter 'eva' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.eva = (Expression) eva;

        if (verd == null)
            throw new IllegalArgumentException("Parameter 'verd' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.verd = (Expression) verd;

        if (menti == null)
            throw new IllegalArgumentException("Parameter 'menti' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.menti = (Expression) menti;

		updatePositions(eva, verd, menti);
	}


    // ----------------------------------
    // ternary: expression -> eva:expression verd:expression menti:expression

	// Child 'eva:expression' 

	public void setEva(Expression eva) {
		if (eva == null)
			throw new IllegalArgumentException("Parameter 'eva' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.eva = eva;

	}

    public Expression getEva() {
        return eva;
    }


	// Child 'verd:expression' 

	public void setVerd(Expression verd) {
		if (verd == null)
			throw new IllegalArgumentException("Parameter 'verd' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.verd = verd;

	}

    public Expression getVerd() {
        return verd;
    }


	// Child 'menti:expression' 

	public void setMenti(Expression menti) {
		if (menti == null)
			throw new IllegalArgumentException("Parameter 'menti' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.menti = menti;

	}

    public Expression getMenti() {
        return menti;
    }


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "Ternary{" + " eva=" + this.getEva() + " verd=" + this.getVerd() + " menti=" + this.getMenti() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------

}
