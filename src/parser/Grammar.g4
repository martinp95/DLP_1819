grammar Grammar
	;
import Lexicon
	;

start: definiciones;

definiciones: definicion
			| definiciones definicion;
			
definicion: defVariable
			| defStruct
			| defFuncion;

defFuncion: IDENT '(' parametros ')' '{' variables sentencias '}'
			|IDENT '(' parametros ')' ':' tipo '{' variables sentencias '}';

parametros:
			|parametro
			|parametros ',' parametro;
			
parametro: IDENT ':' tipo;
				
variables:
			|variables defVariable;
			
sentencias: 
			| sentencias sentencia;
			
sentencia: 'print' expr ';'														
	| 'printsp' expr ';'															
	| 'println' parametrosOpt ';'														
	| 'read' expr ';'															
	| expr '=' expr ';'															
	| 'if' '(' expr ')' '{' sentencias '}'										
	| 'if' '(' expr ')' '{' sentencias '}' 'else' '{' sentencias '}' 			
	| 'while' '(' expr ')' '{' sentencias '}'									
	| IDENT '(' parametrosOpt ')' ';'										
	| 'return' expr ';'
	| 'return' ';';

parametrosOpt:
			|expr
			| parametrosOpt ',' expr;

expr: INT_CONSTANT
	| REAL_CONSTANT
	| IDENT
	| CHAR
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

campos: campo
		| campos campo;
		
campo: IDENT ':' tipo ';' ;

defVariable: 'var' IDENT ':' tipo ';' ;

tipo: 'int'
	| 'float'
	| 'char'
	| IDENT
	|'[' INT_CONSTANT ']' tipo;