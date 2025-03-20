// Generated with VGen 2.0.0

package ast.expression;

import ast.type.*;
import org.antlr.v4.runtime.Token;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	cast: expression -> targetType:type expression:expression
	expression -> 
	
	PHASE TypeChecking
	expression -> type:type
	expression -> lvalue:boolean
*/
public class Cast extends AbstractExpression  {

    // ----------------------------------
    // Instance Variables

	// cast: expression -> targetType:type expression
	private Type targetType;
	private Expression expression;

    // ----------------------------------
    // Constructors

	public Cast(Type targetType, Expression expression) {
		super();

		if (targetType == null)
			throw new IllegalArgumentException("Parameter 'targetType' can't be null. Pass a non-null value or use 'type?' in the abstract grammar");
		this.targetType = targetType;

		if (expression == null)
			throw new IllegalArgumentException("Parameter 'expression' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.expression = expression;

		updatePositions(targetType, expression);
	}

	public Cast(Object targetType, Object expression) {
		super();

        if (targetType == null)
            throw new IllegalArgumentException("Parameter 'targetType' can't be null. Pass a non-null value or use 'type?' in the abstract grammar");
		this.targetType = (Type) targetType;

        if (expression == null)
            throw new IllegalArgumentException("Parameter 'expression' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.expression = (Expression) expression;

		updatePositions(targetType, expression);
	}


    // ----------------------------------
    // cast: expression -> targetType:type expression

	// Child 'targetType:type' 

	public void setTargetType(Type targetType) {
		if (targetType == null)
			throw new IllegalArgumentException("Parameter 'targetType' can't be null. Pass a non-null value or use 'type?' in the abstract grammar");
		this.targetType = targetType;

	}

    public Type getTargetType() {
        return targetType;
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
        return "Cast{" + " targetType=" + this.getTargetType() + " expression=" + this.getExpression() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
