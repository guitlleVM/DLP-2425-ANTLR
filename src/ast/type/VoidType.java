// Generated with VGen 2.0.0

package ast.type;

import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	voidType: type -> 
	type -> 
*/
public class VoidType extends AbstractType  {



    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "VoidType{" + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed
        @Override
        public int getSize() {
            throw new IllegalStateException("Void type can't be used in expressions");
        }

        @Override
        public String nameForMAPL() {
            throw new IllegalStateException("Void no name for MAPL");
        }

    // %% --------------------------------------
}
