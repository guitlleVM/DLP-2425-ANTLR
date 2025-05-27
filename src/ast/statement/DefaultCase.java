// Generated with VGen 2.0.0

package ast.statement;

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
	defaultCase: statement -> statements:statement* brk:boolean
	statement -> 
	
	PHASE TypeChecking
	statement -> funcion:functionDeclaration
	defaultCase -> switchNode:switch
*/
public class DefaultCase extends AbstractStatement  {

    // ----------------------------------
    // Instance Variables

	// defaultCase: statement -> statement* brk:boolean
	private List<Statement> statements;
	private boolean brk;

    // PHASE TypeChecking
	private Switch switchNode;

    // ----------------------------------
    // Constructors

	public DefaultCase(List<Statement> statements, boolean brk) {
		super();

		if (statements == null)
			statements = new ArrayList<>();
		this.statements = statements;

		this.brk = brk;

		updatePositions(statements, brk);
	}

	public DefaultCase(Object statements, Object brk) {
		super();

        this.statements = castList(statements, unwrapIfContext.andThen(Statement.class::cast));
        if (brk == null)
            throw new IllegalArgumentException("Parameter 'brk' can't be null. Pass a non-null value or use 'boolean?' in the abstract grammar");
        var brk_temp = brk;
        if (brk_temp instanceof Token)
            brk_temp = ((Token) brk_temp).getText();
        if (brk_temp instanceof String)
            brk_temp = Boolean.valueOf((String) brk_temp);
        this.brk = (boolean) brk_temp;

		updatePositions(statements, brk);
	}


    // ----------------------------------
    // defaultCase: statement -> statement* brk:boolean

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


	// Child 'brk:boolean' 

	public void setBrk(boolean brk) {
		this.brk = brk;

	}

    public boolean isBrk() {
        return brk;
    }



    // --------------------------------
    // PHASE TypeChecking

	// Attribute 'switch' 

	public void setSwitchNode(Switch switchNode) {
		if (switchNode == null)
			throw new IllegalArgumentException("Parameter 'switchNode' can't be null. Pass a non-null value or use 'switch?' in the abstract grammar");
		this.switchNode = switchNode;

	}

    public Switch getSwitchNode() {
        return switchNode;
    }


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "DefaultCase{" + " statements=" + this.getStatements() + " brk=" + this.isBrk() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
