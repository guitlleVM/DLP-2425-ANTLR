// Generated with VGen 2.0.0

package ast.statement;

import ast.expression.*;
import ast.declaration.*;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	asignacion: statement -> e1:expression a:expression*
	statement -> 
	
	PHASE TypeChecking
	statement -> funcion:functionDeclaration
*/
public class Asignacion extends AbstractStatement  {

    // ----------------------------------
    // Instance Variables

	// asignacion: statement -> e1:expression a:expression*
	private Expression e1;
	private List<Expression> a;

    // ----------------------------------
    // Constructors

	public Asignacion(Expression e1, List<Expression> a) {
		super();

		if (e1 == null)
			throw new IllegalArgumentException("Parameter 'e1' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.e1 = e1;

		if (a == null)
			a = new ArrayList<>();
		this.a = a;

		updatePositions(e1, a);
	}

	public Asignacion(Object e1, Object a) {
		super();

        if (e1 == null)
            throw new IllegalArgumentException("Parameter 'e1' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.e1 = (Expression) e1;

        this.a = castList(a, unwrapIfContext.andThen(Expression.class::cast));
		updatePositions(e1, a);
	}


    // ----------------------------------
    // asignacion: statement -> e1:expression a:expression*

	// Child 'e1:expression' 

	public void setE1(Expression e1) {
		if (e1 == null)
			throw new IllegalArgumentException("Parameter 'e1' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.e1 = e1;

	}

    public Expression getE1() {
        return e1;
    }


	// Child 'a:expression*' 

	public void setA(List<Expression> a) {
		if (a == null)
			a = new ArrayList<>();
		this.a = a;

	}

    public List<Expression> getA() {
        return a;
    }

    public Stream<Expression> a() {
        return a.stream();
    }


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "Asignacion{" + " e1=" + this.getE1() + " a=" + this.getA() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
