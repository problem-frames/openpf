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
T27 : 'actor' ;
T28 : '{' ;
T29 : '}' ;
T30 : 'agent' ;
T31 : 'role' ;
T32 : 'position' ;
T33 : 'goal' ;
T34 : 'soft' ;
T35 : 'task' ;
T36 : 'resource' ;
T37 : 'belief' ;
T38 : '~~>' ;
T39 : '~>' ;
T40 : '<-(and)-' ;
T41 : '<-(or)-' ;
T42 : '-(and)->' ;
T43 : '-(or)->' ;
T44 : '-(+)->' ;
T45 : '-(++)->' ;
T46 : '-(-)->' ;
T47 : '-(--)->' ;
T48 : '+' ;
T49 : '-' ;
T50 : '!' ;
T51 : '->' ;
T52 : '<->' ;
T53 : '&' ;
T54 : '|' ;

// $ANTLR src "../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g" 3160
RULE_SL_COMMENT : ';' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g" 3162
RULE_ID : ('#' ~('#')+ '#'|'^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*);

// $ANTLR src "../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g" 3164
RULE_INT : ('0'..'9')+;

// $ANTLR src "../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g" 3166
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g" 3168
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g" 3170
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g" 3172
RULE_ANY_OTHER : .;


