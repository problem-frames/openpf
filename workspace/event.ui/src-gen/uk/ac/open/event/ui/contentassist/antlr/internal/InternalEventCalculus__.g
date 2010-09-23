lexer grammar InternalEventCalculus;
@header {
package uk.ac.open.event.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T12 : '!' ;
T13 : 'load' ;
T14 : 'sort' ;
T15 : ':' ;
T16 : 'range' ;
T17 : 'option' ;
T18 : 'completion' ;
T19 : 'noninertial' ;
T20 : '.' ;
T21 : ',' ;
T22 : '(' ;
T23 : ')' ;
T24 : '{' ;
T25 : '}' ;
T26 : '[' ;
T27 : ']' ;
T28 : '->' ;
T29 : '<->' ;
T30 : '|' ;
T31 : '&' ;
T32 : '!=' ;
T33 : '==' ;
T34 : '>=' ;
T35 : '<=' ;
T36 : '=' ;
T37 : '<' ;
T38 : '>' ;
T39 : '+' ;
T40 : '-' ;
T41 : '*' ;
T42 : '/' ;
T43 : '^' ;
T44 : 'reified' ;

// $ANTLR src "../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g" 6163
RULE_INT : ('0'|'1'..'9' ('0'..'9')*);

// $ANTLR src "../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g" 6165
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g" 6167
RULE_ID : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g" 6169
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g" 6171
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g" 6173
RULE_SL_COMMENT : ';' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g" 6175
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g" 6177
RULE_ANY_OTHER : .;


