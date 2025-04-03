// Generated with VGen 2.0.0

package ast.type;

import org.antlr.v4.runtime.Token;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	arrayType: type -> posicion:string type:type
	type -> 
*/
public class ArrayType extends AbstractType  {

    // ----------------------------------
    // Instance Variables

	// arrayType: type -> posicion:string type
	private String posicion;
	private Type type;

    // ----------------------------------
    // Constructors

	public ArrayType(String posicion, Type type) {
		super();

		if (posicion == null)
			throw new IllegalArgumentException("Parameter 'posicion' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.posicion = posicion;

		if (type == null)
			throw new IllegalArgumentException("Parameter 'type' can't be null. Pass a non-null value or use 'type?' in the abstract grammar");
		this.type = type;

		updatePositions(posicion, type);
	}

	public ArrayType(Object posicion, Object type) {
		super();

        if (posicion == null)
            throw new IllegalArgumentException("Parameter 'posicion' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.posicion = (posicion instanceof Token) ? ((Token) posicion).getText() : (String) posicion;

        if (type == null)
            throw new IllegalArgumentException("Parameter 'type' can't be null. Pass a non-null value or use 'type?' in the abstract grammar");
		this.type = (Type) type;

		updatePositions(posicion, type);
	}


    // ----------------------------------
    // arrayType: type -> posicion:string type

	// Child 'posicion:string' 

	public void setPosicion(String posicion) {
		if (posicion == null)
			throw new IllegalArgumentException("Parameter 'posicion' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.posicion = posicion;

	}

    public String getPosicion() {
        return posicion;
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


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "ArrayType{" + " posicion=" + this.getPosicion() + " type=" + this.getType() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed
		@Override
		public int getSize() {
			return type.getSize() * Integer.parseInt(posicion);
		}

    // %% --------------------------------------
}
