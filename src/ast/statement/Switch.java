// Generated with VGen 2.0.0

package ast.statement;

import ast.expression.*;
import ast.declaration.*;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;
import java.util.Optional;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	switch: statement -> e1:expression switchCases:switchCase* defaultCase:defaultCase?
	statement -> 
	
	PHASE TypeChecking
	statement -> funcion:functionDeclaration
*/
public class Switch extends AbstractStatement  {

    // ----------------------------------
    // Instance Variables

	// switch: statement -> e1:expression switchCase* defaultCase?
	private Expression e1;
	private List<SwitchCase> switchCases;
	private Optional<DefaultCase> defaultCase;

    // ----------------------------------
    // Constructors

	public Switch(Expression e1, List<SwitchCase> switchCases, Optional<DefaultCase> defaultCase) {
		super();

		if (e1 == null)
			throw new IllegalArgumentException("Parameter 'e1' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.e1 = e1;

		if (switchCases == null)
			switchCases = new ArrayList<>();
		this.switchCases = switchCases;

		if (defaultCase == null)
			defaultCase = Optional.empty();
		this.defaultCase = defaultCase;

		updatePositions(e1, switchCases, defaultCase);
	}

	public Switch(Object e1, Object switchCases, Object defaultCase) {
		super();

        if (e1 == null)
            throw new IllegalArgumentException("Parameter 'e1' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.e1 = (Expression) e1;

        this.switchCases = castList(switchCases, unwrapIfContext.andThen(SwitchCase.class::cast));
        this.defaultCase = castOptional(defaultCase, DefaultCase.class);
		updatePositions(e1, switchCases, defaultCase);
	}


    // ----------------------------------
    // switch: statement -> e1:expression switchCase* defaultCase?

	// Child 'e1:expression' 

	public void setE1(Expression e1) {
		if (e1 == null)
			throw new IllegalArgumentException("Parameter 'e1' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.e1 = e1;

	}

    public Expression getE1() {
        return e1;
    }


	// Child 'switchCase*' 

	public void setSwitchCases(List<SwitchCase> switchCases) {
		if (switchCases == null)
			switchCases = new ArrayList<>();
		this.switchCases = switchCases;

	}

    public List<SwitchCase> getSwitchCases() {
        return switchCases;
    }

    public Stream<SwitchCase> switchCases() {
        return switchCases.stream();
    }


	// Child 'defaultCase?' 

	public void setDefaultCase(Optional<DefaultCase> defaultCase) {
		if (defaultCase == null)
			defaultCase = Optional.empty();
		this.defaultCase = defaultCase;

	}

    public Optional<DefaultCase> getDefaultCase() {
        return defaultCase;
    }


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "Switch{" + " e1=" + this.getE1() + " switchCases=" + this.getSwitchCases() + " defaultCase=" + this.getDefaultCase() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
