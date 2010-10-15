lexer grammar InternalEventCalculus;
@header {
package uk.ac.open.event.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T12 : 'load' ;
T13 : ';' ;
T14 : '#' ;
T15 : 'not' ;
T16 : 'reified' ;
T17 : 'sort' ;
T18 : ':' ;
T19 : 'range' ;
T20 : 'option' ;
T21 : 'completion' ;
T22 : 'noninertial' ;
T23 : ',' ;
T24 : 'xor' ;
T25 : 'mutex' ;
T26 : '.' ;
T27 : '(' ;
T28 : ')' ;
T29 : '{' ;
T30 : '}' ;
T31 : '[' ;
T32 : ']' ;
T33 : '->' ;
T34 : '<->' ;
T35 : '|' ;
T36 : '&' ;
T37 : '!=' ;
T38 : '==' ;
T39 : '>=' ;
T40 : '<=' ;
T41 : '=' ;
T42 : '<' ;
T43 : '>' ;
T44 : '+' ;
T45 : '-' ;
T46 : '*' ;
T47 : '/' ;
T48 : '^' ;
T49 : 'generated' ;
T50 : 'author' ;
T51 : 'Theta' ;
T52 : 'Delta' ;
T53 : '!' ;

// $ANTLR src "../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g" 3115
RULE_INT : ('0'|'1'..'9' ('0'..'9')*);

// $ANTLR src "../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g" 3117
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g" 3119
RULE_ID : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g" 3121
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g" 3123
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g" 3125
RULE_SL_COMMENT : ';' ~(('\n'|'\r'|'#'))* ('\r'? '\n')?;

// $ANTLR src "../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g" 3127
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g" 3129
RULE_ANY_OTHER : .;


