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
T27 : 'concern' ;
T28 : ':' ;
T29 : '{' ;
T30 : '}' ;
T31 : ',' ;
T32 : 'see' ;
T33 : 'domain' ;
T34 : 'problem' ;
T35 : '!' ;

// $ANTLR src "../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g" 2526
RULE_ID : ('#' ~('#')+ '#'|'^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*);

// $ANTLR src "../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g" 2528
RULE_QUALIFIED_NAME : RULE_ID ('.' RULE_ID)*;

// $ANTLR src "../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g" 2530
RULE_INT : ('0'..'9')+;

// $ANTLR src "../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g" 2532
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g" 2534
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g" 2536
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g" 2538
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g" 2540
RULE_ANY_OTHER : .;


