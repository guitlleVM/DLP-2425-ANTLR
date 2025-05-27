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
	switchCase: statement -> e1:expression statements:statement* brk:boolean
	statement -> 
	
	PHASE TypeChecking
	statement -> funcion:functionDeclaration
	switchCase -> switchNode:switch
*/
public class SwitchCase extends AbstractStatement  {

    // ----------------------------------
    // Instance Variables

	// switchCase: statement -> e1:expression statement* brk:boolean
	private Expression e1;
	private List<Statement> statements;
	private boolean brk;

    // PHASE TypeChecking
	private Switch switchNode;

    // ----------------------------------
    // Constructors

	public SwitchCase(Expression e1, List<Statement> statements, boolean brk) {
		super();

		if (e1 == null)
			throw new IllegalArgumentException("Parameter 'e1' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.e1 = e1;

		if (statements == null)
			statements = new ArrayList<>();
		this.statements = statements;

		this.brk = brk;

		updatePositions(e1, statements, brk);
	}

	public SwitchCase(Object e1, Object statements, Object brk) {
		super();

        if (e1 == null)
            throw new IllegalArgumentException("Parameter 'e1' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.e1 = (Expression) e1;

        this.statements = castList(statements, unwrapIfContext.andThen(Statement.class::cast));
        if (brk == null)
            throw new IllegalArgumentException("Parameter 'brk' can't be null. Pass a non-null value or use 'boolean?' in the abstract grammar");
        var brk_temp = brk;
        if (brk_temp instanceof Token)
            brk_temp = ((Token) brk_temp).getText();
        if (brk_temp instanceof String)
            brk_temp = Boolean.valueOf((String) brk_temp);
        this.brk = (boolean) brk_temp;

		updatePositions(e1, statements, brk);
	}


    // ----------------------------------
    // switchCase: statement -> e1:expression statement* brk:boolean

	// Child 'e1:expression' 

	public void setE1(Expression e1) {
		if (e1 == null)
			throw new IllegalArgumentException("Parameter 'e1' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.e1 = e1;

	}

    public Expression getE1() {
        return e1;
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
        return "SwitchCase{" + " e1=" + this.getE1() + " statements=" + this.getStatements() + " brk=" + this.isBrk() + "}";
    }


    // %% User Members -------------------------

        String labelExitSwitch;

        public String getLabelExitSwitch() {           
            return labelExitSwitch;
        }

        public void setLabelExitSwitch(String label) {
            if (label == null || label.isEmpty()) {
                throw new IllegalArgumentException("Label for exit switch cannot be null or empty.");
            }
            this.labelExitSwitch = label;
        }

        String labelEvitarComprobacion;
        public String getLabelEvitarComprobacion() {           
            return labelEvitarComprobacion;
        }
        public void setLabelEvitarComprobacion(String label) {
            if (label == null || label.isEmpty()) {
                throw new IllegalArgumentException("Label to avoid checking cannot be null or empty.");
            }
            this.labelEvitarComprobacion = label;
        }

        String labelEvitarComprobacionSiguiente;
        public String getLabelEvitarComprobacionSiguiente() {            
            return labelEvitarComprobacionSiguiente;
        }
        public void setLabelEvitarComprobacionSiguiente(String label) {
            if (label == null || label.isEmpty()) {
                throw new IllegalArgumentException("Label to avoid next checking cannot be null or empty.");
            }
            this.labelEvitarComprobacionSiguiente = label;
        }
    // %% --------------------------------------
}
