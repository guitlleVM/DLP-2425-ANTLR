grammar Grammar;

import Tokenizer;

program
    : (structDeclaration | variableDeclaration | functionDeclaration)* EOF
    ;

structDeclaration
    : 'struct' ID '{' fieldDeclaration* '}'
    ;

variableDeclaration
    : 'var' fieldDeclaration
    ;

functionDeclaration
    : ID '(' parameterList ')' (':' type)? block
    ;

parameterList
    : (parameter (',' parameter)*)?
    ;

parameter
    : ID ':' type
    ;

block
    : '{' (variableDeclaration | statement)* '}'
    ;

statement
    : 'print' expression ';'
	| 'read' expression ';'
    | expression '=' expression ';'
    | expression ';'
    ;

expression
    : castExpression
    | primary (expressionSuffix)*
	| '(' expression ')'
	| '!' expression
    | expression ('*' | '/' | '%') expression
    | expression ('+' | '-') expression
	| expression ('<' | '>' | '<=' | '>=') expression
    | expression ('==' | '!=') expression
	| expression '&&' expression
	| expression '||' expression
    ;

expressionSuffix
    : '.' ID
    | '[' expression ']'
    | functionCall
    ;

functionCall
    : '(' argumentList? ')'
    ;

castExpression
    : '<' type '>' '(' expression ')'
    ;

argumentList
    : expression (',' expression)*
    ;

primary
    : ID
    | LITENT
    | LITREAL
    | CHAR_LITERAL
    ;

fieldDeclaration
    : ID ':' type ';'
    | ID ':' ('[' LITENT ']')+ type ';'
    ;

type
    : primitiveType
    | ID
    ;

primitiveType
    : 'int'
    | 'float'
    | 'char'
    ;