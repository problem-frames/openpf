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
T19 : 'phenomenon' ;
T20 : 'event' ;
T21 : 'state' ;
T22 : '--' ;
T23 : '~~' ;
T24 : '~>' ;
T25 : 'problem:' ;
T26 : 'for' ;
T27 : ':' ;
T28 : '{' ;
T29 : '}' ;
T30 : ',' ;
T31 : 'see' ;
T32 : 'domain' ;
T33 : 'problem' ;
T34 : '!' ;

// $ANTLR src "../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g" 2257
RULE_ID : ('#' ~('#')+ '#'|'^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*);

// $ANTLR src "../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g" 2259
RULE_QUALIFIED_NAME : RULE_ID ('.' RULE_ID)*;

// $ANTLR src "../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g" 2261
RULE_INT : ('0'..'9')+;

// $ANTLR src "../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g" 2263
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g" 2265
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g" 2267
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g" 2269
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g" 2271
RULE_ANY_OTHER : .;


