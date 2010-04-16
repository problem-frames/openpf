lexer grammar InternalProblem;
@header {
package uk.ac.open.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : 'problem' ;
T12 : ':' ;
T13 : '{' ;
T14 : ',' ;
T15 : 'see' ;
T16 : 'domain' ;
T17 : '}' ;
T18 : '!' ;
T19 : 'R' ;
T20 : 'M' ;
T21 : 'B' ;
T22 : 'X' ;
T23 : 'C' ;
T24 : 'D' ;
T25 : 'P' ;
T26 : 'phenomenon' ;
T27 : 'event' ;
T28 : 'state' ;
T29 : '--' ;
T30 : '~~' ;
T31 : '~>' ;

// $ANTLR src "../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g" 826
RULE_ID : ('#' ~('#')+ '#'|'^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*);

// $ANTLR src "../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g" 828
RULE_INT : ('0'..'9')+;

// $ANTLR src "../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g" 830
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g" 832
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g" 834
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g" 836
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g" 838
RULE_ANY_OTHER : .;


