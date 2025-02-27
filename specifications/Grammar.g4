grammar Grammar;

import Tokenizer;

program
    : (structDeclaration | statement | variableDeclaration | functionDeclaration)* EOF
    ;

structDeclaration
    : 'struct' ID '{' (ID ':' type) '}'
    ;

variableDeclaration
    : 'var' ID ':' type ';'
    ;

functionDeclaration
    : ID '(' parameterList ')' (':' type)? block
    ;

parameterList
    : (ID ':' type (',' ID ':' type)*)?
    ;

block
    : '{' (variableDeclaration | statement)* '}'
    ;

statement
    : 'print' expressionList ';'
    | 'printsp' expressionList ';'
    | 'println' expressionList ';'
    | 'read' expression ';'
    | 'while' '(' expression ')' block
    | 'if' '(' expression ')' block ('else' block)?
    | 'return' expression? ';'
    | expression '=' expression ';'
    | expression ';'
    ;

expressionList
    : (expression (',' expression)*)?
    ;

expression
    : '<' type '>' '(' expression ')' //cast
    | expression '.' ID   //struct access
    | expression '[' expression ']' 
    | ID '(' (expression (',' expression)*)? ')'    //function call
    | '(' expression ')' //prioridad operadores
    | '!' expression
    | expression ('*' | '/' | '%') expression
    | expression ('+' | '-') expression
    | expression ('<' | '>' | '<=' | '>=') expression
    | expression ('==' | '!=') expression
    | expression '&&' expression
    | expression '||' expression
    | ID
    | LITENT
    | LITREAL
    | CHAR_LITERAL
    ;

type
    : 'int'
    | 'float'
    | 'char'
    | '[' LITENT ']' type //arrays
    | ID
    ;