lexer grammar InternalProblem;
@header {
package uk.ac.open.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : 'problem' ;
T12 : ':' ;
T13 : 'for' ;
T14 : '{' ;
T15 : ',' ;
T16 : 'see' ;
T17 : 'domain' ;
T18 : '}' ;
T19 : '!' ;
T20 : 'R' ;
T21 : 'M' ;
T22 : 'B' ;
T23 : 'X' ;
T24 : 'C' ;
T25 : 'D' ;
T26 : 'P' ;
T27 : 'phenomenon' ;
T28 : 'event' ;
T29 : 'state' ;
T30 : '--' ;
T31 : '~~' ;
T32 : '~>' ;

// $ANTLR src "../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g" 784
RULE_ID : ('#' ~('#')+ '#'|'^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*);

// $ANTLR src "../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g" 786
RULE_INT : ('0'..'9')+;

// $ANTLR src "../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g" 788
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g" 790
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g" 792
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g" 794
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g" 796
RULE_ANY_OTHER : .;


