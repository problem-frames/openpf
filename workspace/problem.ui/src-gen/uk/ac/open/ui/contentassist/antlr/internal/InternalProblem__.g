lexer grammar InternalProblem;
@header {
package uk.ac.open.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T12 : 'R' ;
T13 : 'M' ;
T14 : 'B' ;
T15 : 'X' ;
T16 : 'C' ;
T17 : 'D' ;
T18 : 'P' ;
T19 : '?' ;
T20 : 'phenomenon' ;
T21 : 'event' ;
T22 : 'state' ;
T23 : '--' ;
T24 : '~~' ;
T25 : '~>' ;
T26 : '->' ;
T27 : 'problem:' ;
T28 : 'for' ;
T29 : ':' ;
T30 : '{' ;
T31 : '}' ;
T32 : ',' ;
T33 : 'see' ;
T34 : 'domain' ;
T35 : 'problem' ;
T36 : '!' ;

// $ANTLR src "../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g" 2301
RULE_ID : ('#' ~('#')+ '#'|'^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*);

// $ANTLR src "../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g" 2303
RULE_QUALIFIED_NAME : RULE_ID ('.' RULE_ID)*;

// $ANTLR src "../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g" 2305
RULE_INT : ('0'..'9')+;

// $ANTLR src "../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g" 2307
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g" 2309
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g" 2311
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g" 2313
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g" 2315
RULE_ANY_OTHER : .;


