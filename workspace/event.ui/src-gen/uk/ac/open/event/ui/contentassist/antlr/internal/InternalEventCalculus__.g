lexer grammar InternalEventCalculus;
@header {
package uk.ac.open.event.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T12 : '!' ;
T13 : 'generated' ;
T14 : 'author' ;
T15 : 'Theta' ;
T16 : 'Delta' ;
T17 : 'load' ;
T18 : ';' ;
T19 : '#' ;
T20 : 'sort' ;
T21 : ':' ;
T22 : 'range' ;
T23 : 'option' ;
T24 : 'completion' ;
T25 : 'noninertial' ;
T26 : ',' ;
T27 : 'xor' ;
T28 : 'mutex' ;
T29 : '.' ;
T30 : '(' ;
T31 : ')' ;
T32 : '{' ;
T33 : '}' ;
T34 : '[' ;
T35 : ']' ;
T36 : '->' ;
T37 : '<->' ;
T38 : '|' ;
T39 : '&' ;
T40 : '!=' ;
T41 : '==' ;
T42 : '>=' ;
T43 : '<=' ;
T44 : '=' ;
T45 : '<' ;
T46 : '>' ;
T47 : '+' ;
T48 : '-' ;
T49 : '*' ;
T50 : '/' ;
T51 : '^' ;
T52 : 'not' ;
T53 : 'reified' ;

// $ANTLR src "../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g" 7923
RULE_INT : ('0'|'1'..'9' ('0'..'9')*);

// $ANTLR src "../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g" 7925
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g" 7927
RULE_ID : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g" 7929
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g" 7931
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g" 7933
RULE_SL_COMMENT : ';' ~(('\n'|'\r'|'#'))* ('\r'? '\n')?;

// $ANTLR src "../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g" 7935
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g" 7937
RULE_ANY_OTHER : .;


