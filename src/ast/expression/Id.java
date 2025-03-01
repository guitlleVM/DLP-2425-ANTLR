// Generated with VGen 2.0.0

package ast.expression;

import org.antlr.v4.runtime.Token;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------


/*
	id: expression -> ID:string
	expression -> 
*/
public class Id extends AbstractExpression  {

    // ----------------------------------
    // Instance Variables

	// id: expression -> ID:string
	private String ID;

    // ----------------------------------
    // Constructors

	public Id(String ID) {
		super();

		if (ID == null)
			throw new IllegalArgumentException("Parameter 'ID' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.ID = ID;

		updatePositions(ID);
	}

	public Id(Object ID) {
		super();

        if (ID == null)
            throw new IllegalArgumentException("Parameter 'ID' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.ID = (ID instanceof Token) ? ((Token) ID).getText() : (String) ID;

		updatePositions(ID);
	}


    // ----------------------------------
    // id: expression -> ID:string

	// Child 'ID:string' 

	public void setID(String ID) {
		if (ID == null)
			throw new IllegalArgumentException("Parameter 'ID' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.ID = ID;

	}

    public String getID() {
        return ID;
    }


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "Id{" + " ID=" + this.getID() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------

}
