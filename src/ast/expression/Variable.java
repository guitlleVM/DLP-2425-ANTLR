// Generated with VGen 2.0.0

package ast.expression;

import ast.type.*;
import ast.declaration.*;
import org.antlr.v4.runtime.Token;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	variable: expression -> ID:string
	expression -> 
	
	PHASE Identification
	variable -> variableDeclaration:variableDeclaration
	
	PHASE TypeChecking
	expression -> type:type
	expression -> lvalue:boolean
*/
public class Variable extends AbstractExpression  {

    // ----------------------------------
    // Instance Variables

	// variable: expression -> ID:string
	private String ID;

    // PHASE Identification
	private VariableDeclaration variableDeclaration;

    // ----------------------------------
    // Constructors

	public Variable(String ID) {
		super();

		if (ID == null)
			throw new IllegalArgumentException("Parameter 'ID' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.ID = ID;

		updatePositions(ID);
	}

	public Variable(Object ID) {
		super();

        if (ID == null)
            throw new IllegalArgumentException("Parameter 'ID' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.ID = (ID instanceof Token) ? ((Token) ID).getText() : (String) ID;

		updatePositions(ID);
	}


    // ----------------------------------
    // variable: expression -> ID:string

	// Child 'ID:string' 

	public void setID(String ID) {
		if (ID == null)
			throw new IllegalArgumentException("Parameter 'ID' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.ID = ID;

	}

    public String getID() {
        return ID;
    }



    // --------------------------------
    // PHASE Identification

	// Attribute 'variableDeclaration' 

	public void setVariableDeclaration(VariableDeclaration variableDeclaration) {
		if (variableDeclaration == null)
			throw new IllegalArgumentException("Parameter 'variableDeclaration' can't be null. Pass a non-null value or use 'variableDeclaration?' in the abstract grammar");
		this.variableDeclaration = variableDeclaration;

	}

    public VariableDeclaration getVariableDeclaration() {
        return variableDeclaration;
    }


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "Variable{" + " ID=" + this.getID() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
