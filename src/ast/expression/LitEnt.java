// Generated with VGen 2.0.0

package ast.expression;

import org.antlr.v4.runtime.Token;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------


/*
	litEnt: expression -> LITENT:string
	expression -> 
*/
public class LitEnt extends AbstractExpression  {

    // ----------------------------------
    // Instance Variables

	// litEnt: expression -> LITENT:string
	private String LITENT;

    // ----------------------------------
    // Constructors

	public LitEnt(String LITENT) {
		super();

		if (LITENT == null)
			throw new IllegalArgumentException("Parameter 'LITENT' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.LITENT = LITENT;

		updatePositions(LITENT);
	}

	public LitEnt(Object LITENT) {
		super();

        if (LITENT == null)
            throw new IllegalArgumentException("Parameter 'LITENT' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.LITENT = (LITENT instanceof Token) ? ((Token) LITENT).getText() : (String) LITENT;

		updatePositions(LITENT);
	}


    // ----------------------------------
    // litEnt: expression -> LITENT:string

	// Child 'LITENT:string' 

	public void setLITENT(String LITENT) {
		if (LITENT == null)
			throw new IllegalArgumentException("Parameter 'LITENT' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.LITENT = LITENT;

	}

    public String getLITENT() {
        return LITENT;
    }


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "LitEnt{" + " LITENT=" + this.getLITENT() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------

}
