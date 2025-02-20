grammar Grammar;

import Tokenizer;

program
	: (struct | variable | function)* EOF
	;

struct
	:'struct' ID '{' declaration* '}'
	;

variable
	: 'var' declaration
	;

function
	: ID '(' parameters ')' (':' primitive_type)? '{' variable* '}'
	;

parameters
	: (ID ':' type (',' ID ':' type)*)?
	;

declaration
	: ID ':' type ';'
	| ID ':' ('[' LITENT ']')+ type ';'
	;

type
	: primitive_type
	| ID
	;

primitive_type
	: 'int'
	| 'float'
	| 'char'
	;

