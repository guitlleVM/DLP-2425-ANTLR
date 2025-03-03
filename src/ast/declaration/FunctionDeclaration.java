// Generated with VGen 2.0.0

package ast.declaration;

import ast.*;
import ast.type.*;
import ast.statement.*;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;
import java.util.Optional;
import org.antlr.v4.runtime.Token;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	functionDeclaration: declaration -> ID:string parameters:parameter* type:type? variableDeclarations:variableDeclaration* statements:statement*
	declaration -> 
*/
public class FunctionDeclaration extends AbstractDeclaration  {

    // ----------------------------------
    // Instance Variables

	// functionDeclaration: declaration -> ID:string parameter* type? variableDeclaration* statement*
	private String ID;
	private List<Parameter> parameters;
	private Optional<Type> type;
	private List<VariableDeclaration> variableDeclarations;
	private List<Statement> statements;

    // ----------------------------------
    // Constructors

	public FunctionDeclaration(String ID, List<Parameter> parameters, Optional<Type> type, List<VariableDeclaration> variableDeclarations, List<Statement> statements) {
		super();

		if (ID == null)
			throw new IllegalArgumentException("Parameter 'ID' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.ID = ID;

		if (parameters == null)
			parameters = new ArrayList<>();
		this.parameters = parameters;

		if (type == null)
			type = Optional.empty();
		this.type = type;

		if (variableDeclarations == null)
			variableDeclarations = new ArrayList<>();
		this.variableDeclarations = variableDeclarations;

		if (statements == null)
			statements = new ArrayList<>();
		this.statements = statements;

		updatePositions(ID, parameters, type, variableDeclarations, statements);
	}

	public FunctionDeclaration(Object ID, Object parameters, Object type, Object variableDeclarations, Object statements) {
		super();

        if (ID == null)
            throw new IllegalArgumentException("Parameter 'ID' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.ID = (ID instanceof Token) ? ((Token) ID).getText() : (String) ID;

        this.parameters = castList(parameters, unwrapIfContext.andThen(Parameter.class::cast));
        this.type = castOptional(type, Type.class);
        this.variableDeclarations = castList(variableDeclarations, unwrapIfContext.andThen(VariableDeclaration.class::cast));
        this.statements = castList(statements, unwrapIfContext.andThen(Statement.class::cast));
		updatePositions(ID, parameters, type, variableDeclarations, statements);
	}


    // ----------------------------------
    // functionDeclaration: declaration -> ID:string parameter* type? variableDeclaration* statement*

	// Child 'ID:string' 

	public void setID(String ID) {
		if (ID == null)
			throw new IllegalArgumentException("Parameter 'ID' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.ID = ID;

	}

    public String getID() {
        return ID;
    }


	// Child 'parameter*' 

	public void setParameters(List<Parameter> parameters) {
		if (parameters == null)
			parameters = new ArrayList<>();
		this.parameters = parameters;

	}

    public List<Parameter> getParameters() {
        return parameters;
    }

    public Stream<Parameter> parameters() {
        return parameters.stream();
    }


	// Child 'type?' 

	public void setType(Optional<Type> type) {
		if (type == null)
			type = Optional.empty();
		this.type = type;

	}

    public Optional<Type> getType() {
        return type;
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


	// Child 'statement*' 

	public void setStatements(List<Statement> statements) {
		if (statements == null)
			statements = new ArrayList<>();
		this.statements = statements;

	}

    public List<Statement> getStatements() {
        return statements;
    }

    public Stream<Statement> statements() {
        return statements.stream();
    }


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "FunctionDeclaration{" + " ID=" + this.getID() + " parameters=" + this.getParameters() + " type=" + this.getType() + " variableDeclarations=" + this.getVariableDeclarations() + " statements=" + this.getStatements() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
