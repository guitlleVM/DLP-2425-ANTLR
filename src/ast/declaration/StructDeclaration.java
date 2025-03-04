// Generated with VGen 2.0.0

package ast.declaration;

import ast.*;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;
import org.antlr.v4.runtime.Token;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------


/*
	structDeclaration: declaration -> ID:string variables:variable*
	declaration -> 
*/
public class StructDeclaration extends AbstractDeclaration  {

    // ----------------------------------
    // Instance Variables

	// structDeclaration: declaration -> ID:string variable*
	private String ID;
	private List<Variable> variables;

    // ----------------------------------
    // Constructors

	public StructDeclaration(String ID, List<Variable> variables) {
		super();

		if (ID == null)
			throw new IllegalArgumentException("Parameter 'ID' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.ID = ID;

		if (variables == null)
			variables = new ArrayList<>();
		this.variables = variables;

		updatePositions(ID, variables);
	}

	public StructDeclaration(Object ID, Object variables) {
		super();

        if (ID == null)
            throw new IllegalArgumentException("Parameter 'ID' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.ID = (ID instanceof Token) ? ((Token) ID).getText() : (String) ID;

        this.variables = castList(variables, unwrapIfContext.andThen(Variable.class::cast));
		updatePositions(ID, variables);
	}


    // ----------------------------------
    // structDeclaration: declaration -> ID:string variable*

	// Child 'ID:string' 

	public void setID(String ID) {
		if (ID == null)
			throw new IllegalArgumentException("Parameter 'ID' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.ID = ID;

	}

    public String getID() {
        return ID;
    }


	// Child 'variable*' 

	public void setVariables(List<Variable> variables) {
		if (variables == null)
			variables = new ArrayList<>();
		this.variables = variables;

	}

    public List<Variable> getVariables() {
        return variables;
    }

    public Stream<Variable> variables() {
        return variables.stream();
    }


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "StructDeclaration{" + " ID=" + this.getID() + " variables=" + this.getVariables() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------

}
