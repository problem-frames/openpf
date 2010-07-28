lexer grammar InternalEventCalculus;
@header {
package uk.ac.open.event.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T11 : '!' ;
T12 : '+' ;
T13 : '-' ;
T14 : '->' ;
T15 : '<->' ;
T16 : '&' ;
T17 : '|' ;
T18 : '.' ;
T19 : '[' ;
T20 : ']' ;
T21 : ',' ;
T22 : '(' ;
T23 : ')' ;
T24 : 'sort' ;
T25 : 'load' ;
T26 : 'range' ;
T27 : 'fluent' ;
T28 : 'event' ;
T29 : 'HoldsAt' ;
T30 : 'Happens' ;
T31 : 'Initiates' ;
T32 : 'Terminates' ;
T33 : '/' ;

// $ANTLR src "../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g" 5782
RULE_SL_COMMENT : ';' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g" 5784
RULE_ID : ('#' ~('#')+ '#'|'^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*);

// $ANTLR src "../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g" 5786
RULE_INT : ('0'..'9')+;

// $ANTLR src "../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g" 5788
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g" 5790
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g" 5792
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g" 5794
RULE_ANY_OTHER : .;


