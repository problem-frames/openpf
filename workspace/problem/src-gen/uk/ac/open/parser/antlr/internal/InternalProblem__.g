lexer grammar InternalProblem;
@header {
package uk.ac.open.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T12 : 'problem:' ;
T13 : 'for' ;
T14 : ':' ;
T15 : '{' ;
T16 : ',' ;
T17 : 'see' ;
T18 : 'domain' ;
T19 : 'problem' ;
T20 : '}' ;
T21 : '!' ;
T22 : 'R' ;
T23 : 'M' ;
T24 : 'B' ;
T25 : 'X' ;
T26 : 'C' ;
T27 : 'D' ;
T28 : 'P' ;
T29 : '?' ;
T30 : 'phenomenon' ;
T31 : 'event' ;
T32 : 'state' ;
T33 : '--' ;
T34 : '~~' ;
T35 : '<~' ;
T36 : '->' ;
T37 : '~>' ;

// $ANTLR src "../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g" 859
RULE_ID : ('#' ~('#')+ '#'|'^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*);

// $ANTLR src "../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g" 861
RULE_QUALIFIED_NAME : RULE_ID ('.' RULE_ID)*;

// $ANTLR src "../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g" 863
RULE_INT : ('0'..'9')+;

// $ANTLR src "../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g" 865
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g" 867
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g" 869
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g" 871
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g" 873
RULE_ANY_OTHER : .;


