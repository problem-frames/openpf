lexer grammar InternalProblem;
@header {
package uk.ac.open.problem.contentassist.antlr.internal;

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
T21 : '->' ;
T22 : '~~' ;
T23 : '~>' ;
T24 : 'problem' ;
T25 : ':' ;
T26 : '{' ;
T27 : '}' ;
T28 : 'see' ;
T29 : 'domain' ;
T30 : 'intention' ;
T31 : ',' ;
T32 : 'istar' ;
T33 : 'actor' ;
T34 : 'agent' ;
T35 : 'role' ;
T36 : 'position' ;
T37 : 'goal' ;
T38 : 'soft' ;
T39 : 'task' ;
T40 : 'resource' ;
T41 : 'belief' ;
T42 : '~~>' ;
T43 : '<-(and)-' ;
T44 : '<-(or)-' ;
T45 : '-(and)->' ;
T46 : '-(or)->' ;
T47 : '-(+)->' ;
T48 : '-(++)->' ;
T49 : '-(-)->' ;
T50 : '-(--)->' ;

// $ANTLR src "../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g" 4692
RULE_ID : ('#' ~('#')+ '#'|'^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*);

// $ANTLR src "../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g" 4694
RULE_INT : ('0'..'9')+;

// $ANTLR src "../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g" 4696
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g" 4698
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g" 4700
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g" 4702
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g" 4704
RULE_ANY_OTHER : .;


