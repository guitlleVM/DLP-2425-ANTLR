// Generated with VGen 2.0.0

package ast.expression;

import org.antlr.v4.runtime.Token;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------


/*
	LitChar: expression -> CHAR_LITERAL:string
	expression -> 
*/
public class LitChar extends AbstractExpression  {

    // ----------------------------------
    // Instance Variables

	// LitChar: expression -> CHAR_LITERAL:string
	private String CHAR_LITERAL;

    // ----------------------------------
    // Constructors

	public LitChar(String CHAR_LITERAL) {
		super();

		if (CHAR_LITERAL == null)
			throw new IllegalArgumentException("Parameter 'CHAR_LITERAL' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.CHAR_LITERAL = CHAR_LITERAL;

		updatePositions(CHAR_LITERAL);
	}

	public LitChar(Object CHAR_LITERAL) {
		super();

        if (CHAR_LITERAL == null)
            throw new IllegalArgumentException("Parameter 'CHAR_LITERAL' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.CHAR_LITERAL = (CHAR_LITERAL instanceof Token) ? ((Token) CHAR_LITERAL).getText() : (String) CHAR_LITERAL;

		updatePositions(CHAR_LITERAL);
	}


    // ----------------------------------
    // LitChar: expression -> CHAR_LITERAL:string

	// Child 'CHAR_LITERAL:string' 

	public void setCHAR_LITERAL(String CHAR_LITERAL) {
		if (CHAR_LITERAL == null)
			throw new IllegalArgumentException("Parameter 'CHAR_LITERAL' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.CHAR_LITERAL = CHAR_LITERAL;

	}

    public String getCHAR_LITERAL() {
        return CHAR_LITERAL;
    }


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "LitChar{" + " CHAR_LITERAL=" + this.getCHAR_LITERAL() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------

}
