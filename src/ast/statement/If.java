// Generated with VGen 2.0.0

package ast.statement;

import ast.expression.*;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	if: statement -> expression:expression s1:statement* s2:statement*
	statement -> 
*/
public class If extends AbstractStatement  {

    // ----------------------------------
    // Instance Variables

	// if: statement -> expression s1:statement* s2:statement*
	private Expression expression;
	private List<Statement> s1;
	private List<Statement> s2;

    // ----------------------------------
    // Constructors

	public If(Expression expression, List<Statement> s1, List<Statement> s2) {
		super();

		if (expression == null)
			throw new IllegalArgumentException("Parameter 'expression' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.expression = expression;

		if (s1 == null)
			s1 = new ArrayList<>();
		this.s1 = s1;

		if (s2 == null)
			s2 = new ArrayList<>();
		this.s2 = s2;

		updatePositions(expression, s1, s2);
	}

	public If(Object expression, Object s1, Object s2) {
		super();

        if (expression == null)
            throw new IllegalArgumentException("Parameter 'expression' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.expression = (Expression) expression;

        this.s1 = castList(s1, unwrapIfContext.andThen(Statement.class::cast));
        this.s2 = castList(s2, unwrapIfContext.andThen(Statement.class::cast));
		updatePositions(expression, s1, s2);
	}


    // ----------------------------------
    // if: statement -> expression s1:statement* s2:statement*

	// Child 'expression' 

	public void setExpression(Expression expression) {
		if (expression == null)
			throw new IllegalArgumentException("Parameter 'expression' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.expression = expression;

	}

    public Expression getExpression() {
        return expression;
    }


	// Child 's1:statement*' 

	public void setS1(List<Statement> s1) {
		if (s1 == null)
			s1 = new ArrayList<>();
		this.s1 = s1;

	}

    public List<Statement> getS1() {
        return s1;
    }

    public Stream<Statement> s1() {
        return s1.stream();
    }


	// Child 's2:statement*' 

	public void setS2(List<Statement> s2) {
		if (s2 == null)
			s2 = new ArrayList<>();
		this.s2 = s2;

	}

    public List<Statement> getS2() {
        return s2;
    }

    public Stream<Statement> s2() {
        return s2.stream();
    }


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "If{" + " expression=" + this.getExpression() + " s1=" + this.getS1() + " s2=" + this.getS2() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
