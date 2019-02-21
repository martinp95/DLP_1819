grammar Grammar
	;
import Lexicon
	;
@parser::header {
    import ast.*;
}	

start returns[Programa ast]
	: definiciones EOF ;

definiciones: 
			| definiciones definicion;
			
definicion: defVariable
			| defStruct
			| defFuncion;

defFuncion: IDENT '(' parametros ')' '{' variables sentencias '}'
			|IDENT '(' parametros ')' ':' tipo '{' variables sentencias '}';

parametros:
			| parametro;
			
parametro: param
		 | parametro ',' param;
			
param: IDENT ':' tipo;
				
variables:
			|variables defVariable;
			
sentencias: 
			| sentencias sentencia;
			
sentencia: 'print' expr ';'														
	| 'printsp' expr ';'															
	| 'println' expr? ';'														
	| 'read' expr ';'															
	| expr '=' expr ';'															
	| 'if' '(' expr ')' '{' sentencias '}'										
	| 'if' '(' expr ')' '{' sentencias '}' 'else' '{' sentencias '}' 			
	| 'while' '(' expr ')' '{' sentencias '}'									
	| IDENT '(' parametrosOpt ')' ';'										
	| 'return' expr ';'
	| 'return' ';';

parametrosOpt:
			| parametroOpt;

parametroOpt:expr
			 | parametroOpt ',' expr;

expr: INT_CONSTANT
	| REAL_CONSTANT
	| IDENT
	| CHAR_CONSTANT
	| '(' expr ')'
	| 'cast' '<' tipo '>' '(' expr ')'
	| expr ('*' | '/') expr
	| expr ('+' | '-') expr
	| expr ('<' | '>' | '<=' | '>=' | '==' | '!=') expr
	| '!' expr
	| expr '&&' expr
	| expr '||' expr
	| expr '[' expr ']'
	| expr '.' IDENT
	| IDENT '(' parametrosOpt ')';

defStruct: 'struct' IDENT '{' campos '}' ';';

campos: 
		| campos campo;
		
campo returns[Campo ast]
: IDENT ':' tipo ';' { $ast = new Campo($IDENT, $tipo.ast);} ;

defVariable returns[DefVariable ast]
	: 'var' IDENT ':' tipo ';' {$ast = new DefVariable($IDENT, $tipo.ast, "");};

tipo returns[Tipo ast]
	: 'int' { $ast = new IntType();}
	| 'float' { $ast = new FloatType();}
	| 'char' { $ast = new CharType();}
	| IDENT { $ast = new IdentType();}
	|'[' INT_CONSTANT ']' tipo { $ast = new ArrayType($INT_CONSTANT,$tipo.ast);};