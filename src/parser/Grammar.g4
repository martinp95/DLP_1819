grammar Grammar
	;
import Lexicon
	;
@parser::header {
    import ast.*;
}	

start returns[Programa ast]
	: definiciones EOF { $ast = new Programa($definiciones.lista);};

definiciones returns[List<Definicion> lista = new ArrayList<Definicion>()]
			: (definicion {$lista.add($definicion.ast);})*;
			
definicion returns[Definicion ast]
			: defVariable { $defVariable.ast.setAmbito("global");$ast = $defVariable.ast;}
			| defStruct  { $ast = $defStruct.ast;}
			| defFuncion { $ast = $defFuncion.ast;};

defFuncion returns [DefFuncion ast]
			: IDENT '(' parametros ')' '{' variables sentencias '}' { $ast = new DefFuncion($IDENT, $parametros.lista, null, $variables.lista, $sentencias.lista);}
			|IDENT '(' parametros ')' ':' tipo '{' variables sentencias '}' { $ast = new DefFuncion($IDENT, $parametros.lista, $tipo.ast, $variables.lista, $sentencias.lista);};

parametros returns[List<Parametro> lista = new ArrayList<Parametro>()]
	:(parametro{$lista.add($parametro.ast);}(','parametro{$lista.add($parametro.ast);})*)?;
			
parametro returns[Parametro ast]
	: IDENT ':' tipo {$ast = new Parametro($IDENT, $tipo.ast);};
				
variables returns[List<DefVariable> lista = new ArrayList<DefVariable>()]
			:(defVariable { $defVariable.ast.setAmbito("local");$lista.add($defVariable.ast);})*;
			
sentencias returns[List<Sentencia> lista = new ArrayList<Sentencia>()]
			: (sentencia { $lista.add($sentencia.ast);})*;
			
sentencia returns[Sentencia ast]
	: 'print' expr ';' { $ast = new Print($expr.ast, "");}													
	| 'printsp' expr ';' { $ast = new Print($expr.ast, "sp");}											
	| 'println' expr? ';' { $ast = new Print($expr.ast, "ln");}								
	| 'read' expr ';' { $ast = new Read($expr.ast);}														
	| expr '=' expr ';' { $ast = new Asignacion($ctx.expr(0), $ctx.expr(1));}												
	| 'if' '(' expr ')' '{' sentencias '}'	{ $ast = new If($expr.ast, $sentencias.lista, null);}						
	| 'if' '(' expr ')' '{' sentencias '}' 'else' '{' sentencias '}' { $ast = new If($expr.ast, $ctx.sentencias(0).lista, $ctx.sentencias(1).lista);}	
	| 'while' '(' expr ')' '{' sentencias '}' {$ast = new While($expr.ast, $sentencias.lista);}									
	| IDENT '(' parametrosOpt ')' ';' { $ast = new LlamadaFuncion($IDENT, $parametrosOpt.lista);}										
	| 'return' expr ';' { $ast = new Return($expr.ast);}
	| 'return' ';' { $ast = new Return(null);};

parametrosOpt returns[List<Expr> lista = new ArrayList<Expr>()]
	:(parametroOpt{$lista.add($parametroOpt.ast);}(','parametroOpt{$lista.add($parametroOpt.ast);})*)?;

parametroOpt returns[Expr ast]
			 :expr {$ast = $expr.ast;};

expr returns[Expr ast]
	: INT_CONSTANT { $ast = new IntConstant($INT_CONSTANT);}
	| REAL_CONSTANT { $ast = new RealConstant($REAL_CONSTANT);}
	| IDENT { $ast = new IdentConstant($IDENT);}
	| CHAR_CONSTANT { $ast = new CharConstant($CHAR_CONSTANT);}
	| '(' expr ')' { $ast = $expr.ast;}
	| 'cast' '<' tipo '>' '(' expr ')' { $ast = new Cast($tipo.ast, $expr.ast);}
	|'!' expr { $ast = new Not($expr.ast);}
	| expr op=('*' | '/') expr { $ast = new ExprAritmetica($ctx.expr(0), $op, $ctx.expr(1));}
	| expr op=('+' | '-') expr { $ast = new ExprAritmetica($ctx.expr(0), $op, $ctx.expr(1));}
	| expr op=('<' | '>' | '<=' | '>=') expr { $ast = new ExprLogica($ctx.expr(0), $op, $ctx.expr(1));}
	| expr op=('!=' | '==') expr { $ast = new ExprLogica($ctx.expr(0), $op, $ctx.expr(1));}
	| expr '&&' expr { $ast = new ExprLogica($ctx.expr(0), "&&", $ctx.expr(1));}
	| expr '||' expr { $ast = new ExprLogica($ctx.expr(0), "||", $ctx.expr(1));}
	| expr '[' expr ']' { $ast = new Array($ctx.expr(0), $ctx.expr(1));}
	| expr '.' IDENT { $ast = new AccesoStruct($ctx.expr(0), $IDENT);}
	| IDENT '(' parametrosOpt ')' { $ast = new LlamFuncExp($IDENT, $parametrosOpt.lista);};

defStruct returns[DefStruct ast]
		: 'struct' IDENT '{' campos '}' ';'{ $ast = new DefStruct($IDENT,$campos.lista);};

campos returns[List<Campo> lista = new ArrayList<Campo>()]
		:
		| campos campo {$lista.add($campo.ast);};
		
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