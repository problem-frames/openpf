lexer grammar InternalProblem;
@header {
package uk.ac.open.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;
}

T11 : 'R' ;
T12 : 'M' ;
T13 : 'B' ;
T14 : 'X' ;
T15 : 'C' ;
T16 : 'D' ;
T17 : 'P' ;
T18 : 'phenomenon' ;
T19 : 'event' ;
T20 : 'state' ;
T21 : '--' ;
T22 : '~~' ;
T23 : '~>' ;
T24 : 'problem' ;
T25 : ':' ;
T26 : 'for' ;
T27 : '{' ;
T28 : '}' ;
T29 : ',' ;
T30 : 'see' ;
T31 : 'domain' ;
T32 : '!' ;

// $ANTLR src "../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g" 1756
RULE_ID : ('#' ~('#')+ '#'|'^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*);

// $ANTLR src "../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g" 1758
RULE_INT : ('0'..'9')+;

// $ANTLR src "../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g" 1760
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g" 1762
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g" 1764
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g" 1766
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g" 1768
RULE_ANY_OTHER : .;


