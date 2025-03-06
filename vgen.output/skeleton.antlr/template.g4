// Generated with VGen 2.0.0

grammar Grammar;

@header {
	    import ast.declaration.*;
	    import ast.type.*;
	    import ast.statement.*;
	    import ast.expression.*;
	    import ast.*;
}

program returns[Program ast]
    : declarations+=declaration*          { $ast = new Program($declarations); }                 
	;

declaration returns[Declaration ast]
    : ID=IDENT variables+=variable*       { $ast = new StructDeclaration($ID, $variables); }     
    | ID=IDENT type                       { $ast = new VariableDeclaration($ID, $type.ast); }    
    | ID=IDENT parameters+=parameter* type? variableDeclarations+=variableDeclaration* statements+=statement* { $ast = new FunctionDeclaration($ID, $parameters, ($type.ctx == null) ? null : $type.ast, $variableDeclarations, $statements); }
	;

variable returns[Variable ast]
    : ID=IDENT type                       { $ast = new Variable($ID, $type.ast); }               
	;

type returns[Type ast]
    :                                     { $ast = new IntType(); }                              
    |                                     { $ast = new RealType(); }                             
    |                                     { $ast = new CharType(); }                             
    | posicion=IDENT type                 { $ast = new ArrayType($posicion, $type.ast); }        
    | nombre=IDENT                        { $ast = new StructType($nombre); }                    
	;

parameter returns[Parameter ast]
    : ID=IDENT type                       { $ast = new Parameter($ID, $type.ast); }              
	;

variableDeclaration returns[VariableDeclaration ast]
    : ID=IDENT type                       { $ast = new VariableDeclaration($ID, $type.ast); }    
	;

statement returns[Statement ast]
    : expressions+=expression*            { $ast = new Print($expressions); }                    
    | expressions+=expression*            { $ast = new Printsp($expressions); }                  
    | expressions+=expression*            { $ast = new Println($expressions); }                  
    | expression                          { $ast = new Read($expression.ast); }                  
    | expression s1+=statement* s2+=statement* { $ast = new If($expression.ast, $s1, $s2); }          
    | expression statements+=statement*   { $ast = new While($expression.ast, $statements); }    
    | expression?                         { $ast = new Return(($expression.ctx == null) ? null : $expression.ast); }
    | e1=expression e2=expression         { $ast = new Asignacion($e1.ast, $e2.ast); }           
    | ID=IDENT expressions+=expression*   { $ast = new FuncionLlamada($ID, $expressions); }      
	;

expression returns[Expression ast]
    : type expression                     { $ast = new Cast($type.ast, $expression.ast); }       
    | expression ID=IDENT                 { $ast = new StructAccess($expression.ast, $ID); }     
    | e1=expression e2=expression         { $ast = new ArrayAccess($e1.ast, $e2.ast); }          
    | ID=IDENT expressions+=expression*   { $ast = new ExpresionLlamada($ID, $expressions); }    
    | expression                          { $ast = new Not($expression.ast); }                   
    | e1=expression op=IDENT e2=expression { $ast = new ExpresionAritmetica($e1.ast, $op, $e2.ast); }
    | e1=expression op=IDENT e2=expression { $ast = new ExpresionLogica($e1.ast, $op, $e2.ast); } 
    | ID=IDENT                            { $ast = new Id($ID); }                                
    | LITENT=IDENT                        { $ast = new LitEnt($LITENT); }                        
    | LITREAL=IDENT                       { $ast = new LitReal($LITREAL); }                      
    | CHAR_LITERAL=IDENT                  { $ast = new LitChar($CHAR_LITERAL); }                 
	;


// ---------------------------------------------------------------
// Tokens

IDENT: [a-zA-Z_][a-zA-Z0-9_]*;
