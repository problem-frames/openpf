lexer grammar InternalProblem;
@header {
package uk.ac.open.problem.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : 'problem' ;
T12 : ':' ;
T13 : '{' ;
T14 : 'see' ;
T15 : 'domain' ;
T16 : 'intention' ;
T17 : ',' ;
T18 : '}' ;
T19 : 'istar' ;
T20 : 'actor' ;
T21 : 'agent' ;
T22 : 'role' ;
T23 : 'position' ;
T24 : 'goal' ;
T25 : 'soft' ;
T26 : 'task' ;
T27 : 'resource' ;
T28 : 'belief' ;
T29 : '~~>' ;
T30 : '~>' ;
T31 : '<-(and)-' ;
T32 : '<-(or)-' ;
T33 : '-(and)->' ;
T34 : '-(or)->' ;
T35 : '-(+)->' ;
T36 : '-(++)->' ;
T37 : '-(-)->' ;
T38 : '-(--)->' ;
T39 : 'R' ;
T40 : 'M' ;
T41 : 'B' ;
T42 : 'X' ;
T43 : 'C' ;
T44 : 'D' ;
T45 : 'P' ;
T46 : 'phenomenon' ;
T47 : 'event' ;
T48 : 'state' ;
T49 : '->' ;
T50 : '~~' ;

// $ANTLR src "../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g" 2321
RULE_ID : ('#' ~('#')+ '#'|'^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*);

// $ANTLR src "../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g" 2323
RULE_INT : ('0'..'9')+;

// $ANTLR src "../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g" 2325
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g" 2327
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g" 2329
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g" 2331
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g" 2333
RULE_ANY_OTHER : .;


