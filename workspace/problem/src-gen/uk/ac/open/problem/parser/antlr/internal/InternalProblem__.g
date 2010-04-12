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
T14 : '}' ;
T15 : ',' ;
T16 : 'istar' ;
T17 : 'actor' ;
T18 : 'agent' ;
T19 : 'role' ;
T20 : 'position' ;
T21 : 'goal' ;
T22 : 'soft' ;
T23 : 'task' ;
T24 : 'resource' ;
T25 : 'belief' ;
T26 : '~~>' ;
T27 : '~>' ;
T28 : '<-(and)-' ;
T29 : '<-(or)-' ;
T30 : '-(and)->' ;
T31 : '-(or)->' ;
T32 : '-(+)->' ;
T33 : '-(++)->' ;
T34 : '-(-)->' ;
T35 : '-(--)->' ;
T36 : 'R' ;
T37 : 'M' ;
T38 : 'B' ;
T39 : 'X' ;
T40 : 'C' ;
T41 : 'D' ;
T42 : 'P' ;
T43 : 'phenomenon' ;
T44 : 'event' ;
T45 : 'state' ;
T46 : '->' ;
T47 : '~~' ;

// $ANTLR src "../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g" 2224
RULE_ID : ('#' ~('#')+ '#'|'^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*);

// $ANTLR src "../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g" 2226
RULE_INT : ('0'..'9')+;

// $ANTLR src "../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g" 2228
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g" 2230
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g" 2232
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g" 2234
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g" 2236
RULE_ANY_OTHER : .;


