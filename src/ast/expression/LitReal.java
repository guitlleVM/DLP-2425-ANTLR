// Generated with VGen 2.0.0

package ast.expression;

import ast.type.*;
import org.antlr.v4.runtime.Token;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	litReal: expression -> LITREAL:string
	expression -> 
	
	PHASE TypeChecking
	expression -> type:type
	expression -> lvalue:boolean
*/
public class LitReal extends AbstractExpression  {

    // ----------------------------------
    // Instance Variables

	// litReal: expression -> LITREAL:string
	private String LITREAL;

    // ----------------------------------
    // Constructors

	public LitReal(String LITREAL) {
		super();

		if (LITREAL == null)
			throw new IllegalArgumentException("Parameter 'LITREAL' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.LITREAL = LITREAL;

		updatePositions(LITREAL);
	}

	public LitReal(Object LITREAL) {
		super();

        if (LITREAL == null)
            throw new IllegalArgumentException("Parameter 'LITREAL' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.LITREAL = (LITREAL instanceof Token) ? ((Token) LITREAL).getText() : (String) LITREAL;

		updatePositions(LITREAL);
	}


    // ----------------------------------
    // litReal: expression -> LITREAL:string

	// Child 'LITREAL:string' 

	public void setLITREAL(String LITREAL) {
		if (LITREAL == null)
			throw new IllegalArgumentException("Parameter 'LITREAL' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.LITREAL = LITREAL;

	}

    public String getLITREAL() {
        return LITREAL;
    }


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "LitReal{" + " LITREAL=" + this.getLITREAL() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
