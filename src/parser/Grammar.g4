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
	| 'println' expr ';'														
	| 'read' expr ';'															
	| expr '=' expr ';'															
	| 'if' '(' expr ')' '{' sentencias '}'										
	| 'if' '(' expr ')' '{' sentencias '}' 'else' '{' sentencias '}' 			
	| 'while' '(' expr ')' '{' sentencias '}'									
	| IDENT '(' parametrosOpt ')' ';'										
	| 'return' expr ';'
	| 'return' ';';

parametrosOpt:
				|

	
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