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
public interface Statement extends AST {




    // --------------------------------
    // PHASE TypeChecking

	// Attribute 'funcion:functionDeclaration' 

	public void setFuncion(FunctionDeclaration funcion);
	public FunctionDeclaration getFuncion();


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
