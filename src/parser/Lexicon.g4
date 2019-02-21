lexer grammar Lexicon
	;

IDENT
	: [a-zA-Z]+[a-zA-Z0-9_]*;	
INT_CONSTANT
	: [0-9]+;
REAL_CONSTANT
	: [0-9]+'.'[0-9]+;
	
CHAR_CONSTANT
	: '\''.'\''|'\\n';

LINE_COMMENT
	:'//' .*? '\n'	-> skip;

COMENTARIO_MULTILINEA
	:'/*'.*?'*/' -> skip;

WHITESPACE: [ \t\r\n]+ -> skip;
