lexer grammar InternalProblem;
@header {
package uk.ac.open.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T12 : 'problem' ;
T13 : ':' ;
T14 : 'for' ;
T15 : '{' ;
T16 : ',' ;
T17 : 'see' ;
T18 : 'domain' ;
T19 : '}' ;
T20 : '!' ;
T21 : 'R' ;
T22 : 'M' ;
T23 : 'B' ;
T24 : 'X' ;
T25 : 'C' ;
T26 : 'D' ;
T27 : 'P' ;
T28 : 'phenomenon' ;
T29 : 'event' ;
T30 : 'state' ;
T31 : '--' ;
T32 : '~~' ;
T33 : '~>' ;

// $ANTLR src "../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g" 845
RULE_ID : ('#' ~('#')+ '#'|'^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*);

// $ANTLR src "../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g" 847
RULE_QUALIFIED_NAME : RULE_ID ('.' RULE_ID)*;

// $ANTLR src "../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g" 849
RULE_INT : ('0'..'9')+;

// $ANTLR src "../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g" 851
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g" 853
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g" 855
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g" 857
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g" 859
RULE_ANY_OTHER : .;


