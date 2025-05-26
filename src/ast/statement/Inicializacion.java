// Generated with VGen 2.0.0

package ast.statement;

import ast.declaration.*;
import ast.expression.*;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	inicializacion: statement -> variableDeclaration:variableDeclaration expression:expression
	statement -> 
	
	PHASE TypeChecking
	statement -> funcion:functionDeclaration
*/
public class Inicializacion extends AbstractStatement  {

    // ----------------------------------
    // Instance Variables

	// inicializacion: statement -> variableDeclaration expression
	private VariableDeclaration variableDeclaration;
	private Expression expression;

    // ----------------------------------
    // Constructors

	public Inicializacion(VariableDeclaration variableDeclaration, Expression expression) {
		super();

		if (variableDeclaration == null)
			throw new IllegalArgumentException("Parameter 'variableDeclaration' can't be null. Pass a non-null value or use 'variableDeclaration?' in the abstract grammar");
		this.variableDeclaration = variableDeclaration;

		if (expression == null)
			throw new IllegalArgumentException("Parameter 'expression' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.expression = expression;

		updatePositions(variableDeclaration, expression);
	}

	public Inicializacion(Object variableDeclaration, Object expression) {
		super();

        if (variableDeclaration == null)
            throw new IllegalArgumentException("Parameter 'variableDeclaration' can't be null. Pass a non-null value or use 'variableDeclaration?' in the abstract grammar");
		this.variableDeclaration = (VariableDeclaration) variableDeclaration;

        if (expression == null)
            throw new IllegalArgumentException("Parameter 'expression' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.expression = (Expression) expression;

		updatePositions(variableDeclaration, expression);
	}


    // ----------------------------------
    // inicializacion: statement -> variableDeclaration expression

	// Child 'variableDeclaration' 

	public void setVariableDeclaration(VariableDeclaration variableDeclaration) {
		if (variableDeclaration == null)
			throw new IllegalArgumentException("Parameter 'variableDeclaration' can't be null. Pass a non-null value or use 'variableDeclaration?' in the abstract grammar");
		this.variableDeclaration = variableDeclaration;

	}

    public VariableDeclaration getVariableDeclaration() {
        return variableDeclaration;
    }


	// Child 'expression' 

	public void setExpression(Expression expression) {
		if (expression == null)
			throw new IllegalArgumentException("Parameter 'expression' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.expression = expression;

	}

    public Expression getExpression() {
        return expression;
    }


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "Inicializacion{" + " variableDeclaration=" + this.getVariableDeclaration() + " expression=" + this.getExpression() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
