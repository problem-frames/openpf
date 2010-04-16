lexer grammar InternalEventCalculus;
@header {
package uk.ac.open.event.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : '.' ;
T12 : '[' ;
T13 : ',' ;
T14 : ']' ;
T15 : '(' ;
T16 : ')' ;
T17 : 'sort' ;
T18 : 'load' ;
T19 : 'range' ;
T20 : 'fluent' ;
T21 : 'event' ;
T22 : 'HoldsAt' ;
T23 : 'Happens' ;
T24 : 'Initiates' ;
T25 : 'Terminates' ;
T26 : '/' ;
T27 : '+' ;
T28 : '-' ;
T29 : '!' ;
T30 : '->' ;
T31 : '<->' ;
T32 : '&' ;
T33 : '|' ;

// $ANTLR src "../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g" 1756
RULE_SL_COMMENT : ';' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g" 1758
RULE_ID : ('#' ~('#')+ '#'|'^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*);

// $ANTLR src "../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g" 1760
RULE_INT : ('0'..'9')+;

// $ANTLR src "../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g" 1762
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g" 1764
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g" 1766
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g" 1768
RULE_ANY_OTHER : .;


