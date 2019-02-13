grammar Grammar
	;
import Lexicon
	;

start: definiciones;

definiciones: definicion
			| definiciones definicion;
			
definicion: defVariable
			| defStruct;
			
defStruct: 'struct' IDENT '{' campos '}' ';';

campos: campo
		| campos campo;
		
campo: IDENT ':' tipo ';' ;

defVariable : 'var' IDENT ':' tipo ';' ;

tipo: 'int'
	| 'float'
	| 'char'
	| IDENT
	|'[' INT_CONSTANT ']' tipo;