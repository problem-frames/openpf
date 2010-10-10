lexer grammar InternalEventCalculus;
@header {
package uk.ac.open.event.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T12 : 'load' ;
T13 : 'reified' ;
T14 : 'sort' ;
T15 : ':' ;
T16 : 'range' ;
T17 : 'option' ;
T18 : 'completion' ;
T19 : 'Theta' ;
T20 : 'noninertial' ;
T21 : ',' ;
T22 : 'xor' ;
T23 : 'mutex' ;
T24 : '.' ;
T25 : '(' ;
T26 : ')' ;
T27 : '{' ;
T28 : '}' ;
T29 : '[' ;
T30 : ']' ;
T31 : '->' ;
T32 : '<->' ;
T33 : '|' ;
T34 : '&' ;
T35 : '!=' ;
T36 : '==' ;
T37 : '>=' ;
T38 : '<=' ;
T39 : '=' ;
T40 : '<' ;
T41 : '>' ;
T42 : '+' ;
T43 : '-' ;
T44 : '*' ;
T45 : '/' ;
T46 : '^' ;
T47 : '!' ;

// $ANTLR src "../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g" 2687
RULE_INT : ('0'|'1'..'9' ('0'..'9')*);

// $ANTLR src "../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g" 2689
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g" 2691
RULE_ID : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g" 2693
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g" 2695
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g" 2697
RULE_SL_COMMENT : ';' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g" 2699
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g" 2701
RULE_ANY_OTHER : .;


