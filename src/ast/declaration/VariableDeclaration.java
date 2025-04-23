// Generated with VGen 2.0.0

package ast.declaration;

import ast.type.*;
import org.antlr.v4.runtime.Token;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	variableDeclaration: declaration -> ID:string type:type
	declaration -> 
	
	PHASE MemoryAllocation
	variableDeclaration -> address:int
*/
public class VariableDeclaration extends AbstractDeclaration  {

    // ----------------------------------
    // Instance Variables

	// variableDeclaration: declaration -> ID:string type
	private String ID;
	private Type type;

    // PHASE MemoryAllocation
	private int address;

    // ----------------------------------
    // Constructors

	public VariableDeclaration(String ID, Type type) {
		super();

		if (ID == null)
			throw new IllegalArgumentException("Parameter 'ID' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.ID = ID;

		if (type == null)
			throw new IllegalArgumentException("Parameter 'type' can't be null. Pass a non-null value or use 'type?' in the abstract grammar");
		this.type = type;

		updatePositions(ID, type);
	}

	public VariableDeclaration(Object ID, Object type) {
		super();

        if (ID == null)
            throw new IllegalArgumentException("Parameter 'ID' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.ID = (ID instanceof Token) ? ((Token) ID).getText() : (String) ID;

        if (type == null)
            throw new IllegalArgumentException("Parameter 'type' can't be null. Pass a non-null value or use 'type?' in the abstract grammar");
		this.type = (Type) type;

		updatePositions(ID, type);
	}


    // ----------------------------------
    // variableDeclaration: declaration -> ID:string type

	// Child 'ID:string' 

	public void setID(String ID) {
		if (ID == null)
			throw new IllegalArgumentException("Parameter 'ID' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.ID = ID;

	}

    public String getID() {
        return ID;
    }


	// Child 'type' 

	public void setType(Type type) {
		if (type == null)
			throw new IllegalArgumentException("Parameter 'type' can't be null. Pass a non-null value or use 'type?' in the abstract grammar");
		this.type = type;

	}

    public Type getType() {
        return type;
    }



    // --------------------------------
    // PHASE MemoryAllocation

	// Attribute 'address:int' 

	public void setAddress(int address) {
		this.address = address;

	}

    public int getAddress() {
        return address;
    }


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "VariableDeclaration{" + " ID=" + this.getID() + " type=" + this.getType() + "}";
    }


    // %% User Members -------------------------

		// Methods/attributes in this section will be preserved. Delete if not needed

		private String ambito = "global";

		public String getAmbito() {
			return ambito;
		}

		public void setAmbitoParametro() {
			this.ambito = "parametro";
		}

		public void setAmbitoLocal() {
			this.ambito = "local";
		}
        
		public void setAmbitoGlobal() {
			this.ambito = "global";
		}
    // %% --------------------------------------
}
