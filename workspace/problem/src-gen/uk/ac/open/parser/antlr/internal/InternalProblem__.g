lexer grammar InternalProblem;
@header {
package uk.ac.open.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T12 : 'problem:' ;
T13 : 'for' ;
T14 : 'concern' ;
T15 : ':' ;
T16 : '{' ;
T17 : ',' ;
T18 : 'see' ;
T19 : 'domain' ;
T20 : 'problem' ;
T21 : '}' ;
T22 : '!' ;
T23 : 'R' ;
T24 : 'M' ;
T25 : 'B' ;
T26 : 'X' ;
T27 : 'C' ;
T28 : 'D' ;
T29 : 'P' ;
T30 : 'phenomenon' ;
T31 : 'event' ;
T32 : 'state' ;
T33 : '--' ;
T34 : '~~' ;
T35 : '~>' ;

// $ANTLR src "../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g" 949
RULE_ID : ('#' ~('#')+ '#'|'^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*);

// $ANTLR src "../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g" 951
RULE_QUALIFIED_NAME : RULE_ID ('.' RULE_ID)*;

// $ANTLR src "../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g" 953
RULE_INT : ('0'..'9')+;

// $ANTLR src "../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g" 955
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g" 957
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g" 959
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g" 961
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g" 963
RULE_ANY_OTHER : .;


