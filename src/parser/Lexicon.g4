lexer grammar Lexicon
	;
	
INT_CONSTANT
	: [0-9]+;

REAL_CONSTANT
	: [0-9]+'.'[0-9]+;

IDENT
	: [a-zA-Z]+[a-zA-Z0-9_]*;
	
CHAR
	:'[a-zA-ZñÑ0-9() +\\-=*/]'|'\\n';

LINE_COMMENT
	:'//' .*? '\n'	-> skip;

COMENTARIO_MULTILINEA
	:'/*'.*?'*/' -> skip;

WHITESPACE: [ \t\r\n]+ -> skip;
