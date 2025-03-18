// Generated with VGen 2.0.0

package ast.declaration;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;
import org.antlr.v4.runtime.Token;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	structDeclaration: declaration -> ID:string variableDeclarations:variableDeclaration*
	declaration -> 
*/
public class StructDeclaration extends AbstractDeclaration  {

    // ----------------------------------
    // Instance Variables

	// structDeclaration: declaration -> ID:string variableDeclaration*
	private String ID;
	private List<VariableDeclaration> variableDeclarations;

    // ----------------------------------
    // Constructors

	public StructDeclaration(String ID, List<VariableDeclaration> variableDeclarations) {
		super();

		if (ID == null)
			throw new IllegalArgumentException("Parameter 'ID' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.ID = ID;

		if (variableDeclarations == null)
			variableDeclarations = new ArrayList<>();
		this.variableDeclarations = variableDeclarations;

		updatePositions(ID, variableDeclarations);
	}

	public StructDeclaration(Object ID, Object variableDeclarations) {
		super();

        if (ID == null)
            throw new IllegalArgumentException("Parameter 'ID' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.ID = (ID instanceof Token) ? ((Token) ID).getText() : (String) ID;

        this.variableDeclarations = castList(variableDeclarations, unwrapIfContext.andThen(VariableDeclaration.class::cast));
		updatePositions(ID, variableDeclarations);
	}


    // ----------------------------------
    // structDeclaration: declaration -> ID:string variableDeclaration*

	// Child 'ID:string' 

	public void setID(String ID) {
		if (ID == null)
			throw new IllegalArgumentException("Parameter 'ID' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.ID = ID;

	}

    public String getID() {
        return ID;
    }


	// Child 'variableDeclaration*' 

	public void setVariableDeclarations(List<VariableDeclaration> variableDeclarations) {
		if (variableDeclarations == null)
			variableDeclarations = new ArrayList<>();
		this.variableDeclarations = variableDeclarations;

	}

    public List<VariableDeclaration> getVariableDeclarations() {
        return variableDeclarations;
    }

    public Stream<VariableDeclaration> variableDeclarations() {
        return variableDeclarations.stream();
    }


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "StructDeclaration{" + " ID=" + this.getID() + " variableDeclarations=" + this.getVariableDeclarations() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
