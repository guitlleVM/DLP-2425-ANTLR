// Generated with VGen 2.0.0

package ast.type;

import ast.declaration.*;
import org.antlr.v4.runtime.Token;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	structType: type -> nombre:string
	type -> 
	
	PHASE Identification
	structType -> structDeclaration:structDeclaration
*/
public class StructType extends AbstractType  {

    // ----------------------------------
    // Instance Variables

	// structType: type -> nombre:string
	private String nombre;

    // PHASE Identification
	private StructDeclaration structDeclaration;

    // ----------------------------------
    // Constructors

	public StructType(String nombre) {
		super();

		if (nombre == null)
			throw new IllegalArgumentException("Parameter 'nombre' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.nombre = nombre;

		updatePositions(nombre);
	}

	public StructType(Object nombre) {
		super();

        if (nombre == null)
            throw new IllegalArgumentException("Parameter 'nombre' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.nombre = (nombre instanceof Token) ? ((Token) nombre).getText() : (String) nombre;

		updatePositions(nombre);
	}


    // ----------------------------------
    // structType: type -> nombre:string

	// Child 'nombre:string' 

	public void setNombre(String nombre) {
		if (nombre == null)
			throw new IllegalArgumentException("Parameter 'nombre' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.nombre = nombre;

	}

    public String getNombre() {
        return nombre;
    }



    // --------------------------------
    // PHASE Identification

	// Attribute 'structDeclaration' 

	public void setStructDeclaration(StructDeclaration structDeclaration) {
		if (structDeclaration == null)
			throw new IllegalArgumentException("Parameter 'structDeclaration' can't be null. Pass a non-null value or use 'structDeclaration?' in the abstract grammar");
		this.structDeclaration = structDeclaration;

	}

    public StructDeclaration getStructDeclaration() {
        return structDeclaration;
    }


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "StructType{" + " nombre=" + this.getNombre() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed
        @Override
        public int getSize() {
            if (structDeclaration == null) {
                throw new IllegalStateException("StructType size cannot be calculated before the struct declaration is set.");
            }
            
            var size = 0;

            for(VariableDeclaration vD : structDeclaration.getVariableDeclarations()) {
                size += vD.getType().getSize();
            }

            return size;
        }

    // %% --------------------------------------
}
