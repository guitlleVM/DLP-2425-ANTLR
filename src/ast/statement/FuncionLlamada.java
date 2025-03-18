// Generated with VGen 2.0.0

package ast.statement;

import ast.expression.*;
import ast.declaration.*;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;
import org.antlr.v4.runtime.Token;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	funcionLlamada: statement -> ID:string expressions:expression*
	statement -> 
	
	PHASE Identification
	funcionLlamada -> functionDeclaration:functionDeclaration
*/
public class FuncionLlamada extends AbstractStatement  {

    // ----------------------------------
    // Instance Variables

	// funcionLlamada: statement -> ID:string expression*
	private String ID;
	private List<Expression> expressions;

    // PHASE Identification
	private FunctionDeclaration functionDeclaration;

    // ----------------------------------
    // Constructors

	public FuncionLlamada(String ID, List<Expression> expressions) {
		super();

		if (ID == null)
			throw new IllegalArgumentException("Parameter 'ID' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.ID = ID;

		if (expressions == null)
			expressions = new ArrayList<>();
		this.expressions = expressions;

		updatePositions(ID, expressions);
	}

	public FuncionLlamada(Object ID, Object expressions) {
		super();

        if (ID == null)
            throw new IllegalArgumentException("Parameter 'ID' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.ID = (ID instanceof Token) ? ((Token) ID).getText() : (String) ID;

        this.expressions = castList(expressions, unwrapIfContext.andThen(Expression.class::cast));
		updatePositions(ID, expressions);
	}


    // ----------------------------------
    // funcionLlamada: statement -> ID:string expression*

	// Child 'ID:string' 

	public void setID(String ID) {
		if (ID == null)
			throw new IllegalArgumentException("Parameter 'ID' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.ID = ID;

	}

    public String getID() {
        return ID;
    }


	// Child 'expression*' 

	public void setExpressions(List<Expression> expressions) {
		if (expressions == null)
			expressions = new ArrayList<>();
		this.expressions = expressions;

	}

    public List<Expression> getExpressions() {
        return expressions;
    }

    public Stream<Expression> expressions() {
        return expressions.stream();
    }



    // --------------------------------
    // PHASE Identification

	// Attribute 'functionDeclaration' 

	public void setFunctionDeclaration(FunctionDeclaration functionDeclaration) {
		if (functionDeclaration == null)
			throw new IllegalArgumentException("Parameter 'functionDeclaration' can't be null. Pass a non-null value or use 'functionDeclaration?' in the abstract grammar");
		this.functionDeclaration = functionDeclaration;

	}

    public FunctionDeclaration getFunctionDeclaration() {
        return functionDeclaration;
    }


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "FuncionLlamada{" + " ID=" + this.getID() + " expressions=" + this.getExpressions() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
