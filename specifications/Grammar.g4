grammar Grammar;

import Tokenizer;

@header {
    import ast.*;
    import ast.type.*;
    import ast.declaration.*;
    import ast.statement.*;
    import ast.expression.*;
    }

program returns [Program ast] locals [List<Declaration> declarations = new ArrayList<>()]
    : ( structDeclaration { $declarations.add($structDeclaration.ast); }
    | variableDeclaration { $declarations.add($variableDeclaration.ast); }
    | functionDeclaration { $declarations.add($functionDeclaration.ast); })* 
    EOF { $ast = new Program($declarations); }
    ;

structDeclaration returns [StructDeclaration ast] locals [List<Variable> lista = new ArrayList<>()]
    : 'struct' ID '{' (ID ':' type ';' { $lista.add(new Variable($ID.text, $type.ast)); })* '}' 
      { $ast = new StructDeclaration($ID.text, $lista); }
    ;

variableDeclaration returns [VariableDeclaration ast]
    : 'var' ID ':' type ';'
      { $ast = new VariableDeclaration($ID.text, $type.ast); }
    ;

variables returns[List<VariableDeclaration> ast = new ArrayList<VariableDeclaration>()]
	: (variableDeclaration { $ast.add($variableDeclaration.ast); })*
	;

functionDeclaration returns [FunctionDeclaration ast]
    : ID '(' parameterList ')' '{' variables statements '}' { $ast = new FunctionDeclaration($ID, $parameterList.ast, null, $variables.ast, $statements.ast); }
	| ID '(' parameterList ')' ':' type '{' variables statements '}' { $ast = new FunctionDeclaration($ID, $parameterList.ast, $type.ast, $variables.ast, $statements.ast); }
	;

parameterList returns [List<Parameter> ast = new ArrayList<>()]
    : (ID ':' type { $ast.add(new Parameter($ID.text, $type.ast)); }
       (',' ID ':' type { $ast.add(new Parameter($ID.text, $type.ast)); })*)?
    ;

statement returns [Statement ast]
    : 'print' expressionList ';' { $ast = new Print($expressionList.ast); }
    | 'printsp' expressionList ';' { $ast = new Printsp($expressionList.ast); }
    | 'println' expressionList ';' { $ast = new Println($expressionList.ast); }
    | 'read' expression ';' { $ast = new Read($expression.ast); }
    | 'if' '(' expression ')' '{' statements '}' { $ast = new If($expression.ast, $statements.ast, null); }
	| 'if' '(' expression ')' '{' s1 = statements '}' 'else' '{' s2= statements '}' { $ast = new If($expression.ast, $s1.ast, $s2.ast); }
	| 'while' '(' expression ')' '{' statements '}' { $ast = new While($expression.ast, $statements.ast); }
    | 'return' expression ';' { $ast = new Return($expression.ast); }
    | 'return' ';' { $ast = new Return(null); }
    | e1=expression '=' e2=expression ';' { $ast = new Asignacion($e1.ast, $e2.ast); }
    | ID '(' expressionList ')' ';' { $ast = new FuncionLlamada($ID, $expressionList.ast); }
    ;

statements returns[List<Statement> ast = new ArrayList<Statement>()]
	: (statement { $ast.add($statement.ast); })*
	;

expression returns[Expression ast]
    : CHAR_LITERAL { $ast = new LitChar($CHAR_LITERAL); }
    | ID {$ast = new Id($ID); }
    | LITENT { $ast = new LitEnt($LITENT); }
    | LITREAL { $ast = new LitReal($LITREAL); }
    |'<' type '>' '(' expression ')' { $ast = new Cast($type.ast, $expression.ast); }
    | e=expression '.' ID   { $ast = new Struct($e.ast, $ID); }
    | e1=expression '[' e2=expression ']' { $ast = new Array($e1.ast, $e2.ast); }
    | ID '(' expressionList ')'  { $ast = new ExpresionLlamada($ID, $expressionList.ast); }  
    | '(' expression ')' { $ast = $expression.ast; }
    | '!' expression { $ast = new Not($expression.ast); }
    | e1=expression op=('*' | '/' | '%') e2=expression { $ast = new ExpresionAritmetica($e1.ast, $op, $e2.ast); }
    | e1=expression op=('+' | '-') e2=expression { $ast = new ExpresionAritmetica($e1.ast, $op, $e2.ast); }
    | e1=expression op=('<' | '>' | '<=' | '>=') e2=expression { $ast = new ExpresionLogica($e1.ast, $op, $e2.ast); }
    | e1=expression op=('==' | '!=') e2=expression { $ast = new ExpresionLogica($e1.ast, $op, $e2.ast); }
    | e1=expression op='&&' e2=expression { $ast = new ExpresionLogica($e1.ast, $op, $e2.ast); }
    | e1=expression op='||' e2=expression { $ast = new ExpresionLogica($e1.ast, $op, $e2.ast); }
    ;

expressionList returns[List<Expression> ast = new ArrayList<Expression>()]
	: (expression { $ast.add($expression.ast); } (',' expression { $ast.add($expression.ast); })*)?
	;

type returns [Type ast]
    : 'int'    { $ast = new IntType(); }
    | 'float'  { $ast = new RealType(); }
    | 'char'   { $ast = new CharType(); }
    | '[' LITENT ']' type { $ast = new ArrayType($LITENT.text, $type.ast); }
    | ID       { $ast = new StructType($ID.text); }
    ;
