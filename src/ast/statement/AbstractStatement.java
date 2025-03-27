// Generated with VGen 2.0.0

package ast.statement;

import ast.*;
import ast.declaration.*;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	statement -> 
	
	PHASE TypeChecking
	statement -> funcion:functionDeclaration
*/
public abstract class AbstractStatement extends AbstractAST implements Statement {

    // ----------------------------------
    // Instance Variables


    // PHASE TypeChecking
	private FunctionDeclaration funcion;



    // --------------------------------
    // PHASE TypeChecking

	// Attribute 'funcion:functionDeclaration' 

	public void setFuncion(FunctionDeclaration funcion) {
		if (funcion == null)
			throw new IllegalArgumentException("Parameter 'funcion' can't be null. Pass a non-null value or use 'functionDeclaration?' in the abstract grammar");
		this.funcion = funcion;

	}

    public FunctionDeclaration getFuncion() {
        return funcion;
    }



    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
