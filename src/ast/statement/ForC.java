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
	forC: statement -> inicializacion:statement expression:expression incremento:statement statements:statement*
	statement -> 
	
	PHASE TypeChecking
	statement -> funcion:functionDeclaration
*/
public class ForC extends AbstractStatement  {

    // ----------------------------------
    // Instance Variables

	// forC: statement -> inicializacion:statement expression incremento:statement statement*
	private Statement inicializacion;
	private Expression expression;
	private Statement incremento;
	private List<Statement> statements;

    // ----------------------------------
    // Constructors

	public ForC(Statement inicializacion, Expression expression, Statement incremento, List<Statement> statements) {
		super();

		if (inicializacion == null)
			throw new IllegalArgumentException("Parameter 'inicializacion' can't be null. Pass a non-null value or use 'statement?' in the abstract grammar");
		this.inicializacion = inicializacion;

		if (expression == null)
			throw new IllegalArgumentException("Parameter 'expression' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.expression = expression;

		if (incremento == null)
			throw new IllegalArgumentException("Parameter 'incremento' can't be null. Pass a non-null value or use 'statement?' in the abstract grammar");
		this.incremento = incremento;

		if (statements == null)
			statements = new ArrayList<>();
		this.statements = statements;

		updatePositions(inicializacion, expression, incremento, statements);
	}

	public ForC(Object inicializacion, Object expression, Object incremento, Object statements) {
		super();

        if (inicializacion == null)
            throw new IllegalArgumentException("Parameter 'inicializacion' can't be null. Pass a non-null value or use 'statement?' in the abstract grammar");
		this.inicializacion = (Statement) inicializacion;

        if (expression == null)
            throw new IllegalArgumentException("Parameter 'expression' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.expression = (Expression) expression;

        if (incremento == null)
            throw new IllegalArgumentException("Parameter 'incremento' can't be null. Pass a non-null value or use 'statement?' in the abstract grammar");
		this.incremento = (Statement) incremento;

        this.statements = castList(statements, unwrapIfContext.andThen(Statement.class::cast));
		updatePositions(inicializacion, expression, incremento, statements);
	}


    // ----------------------------------
    // forC: statement -> inicializacion:statement expression incremento:statement statement*

	// Child 'inicializacion:statement' 

	public void setInicializacion(Statement inicializacion) {
		if (inicializacion == null)
			throw new IllegalArgumentException("Parameter 'inicializacion' can't be null. Pass a non-null value or use 'statement?' in the abstract grammar");
		this.inicializacion = inicializacion;

	}

    public Statement getInicializacion() {
        return inicializacion;
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


	// Child 'incremento:statement' 

	public void setIncremento(Statement incremento) {
		if (incremento == null)
			throw new IllegalArgumentException("Parameter 'incremento' can't be null. Pass a non-null value or use 'statement?' in the abstract grammar");
		this.incremento = incremento;

	}

    public Statement getIncremento() {
        return incremento;
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
        return "ForC{" + " inicializacion=" + this.getInicializacion() + " expression=" + this.getExpression() + " incremento=" + this.getIncremento() + " statements=" + this.getStatements() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------

}
