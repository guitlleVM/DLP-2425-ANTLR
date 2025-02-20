lexer grammar Tokenizer;

LITENT
	: [0-9]+
	;

LITREAL
	: [0-9]+ '.' [0-9]+
	;

CHAR_LITERAL
	: '\'' ~[\n\r] '\''
	| '\'\\n\''
	;

ID
	: [a-zA-Z_][a-zA-Z0-9_]*
	;

LINE_COMMENT: '//' .*? ('\n' | EOF) -> skip;

MULTILINE_COMMENT: '/*' .*? '*/' -> skip;

WS
	: [ \t\r\n]+ -> skip
	;
