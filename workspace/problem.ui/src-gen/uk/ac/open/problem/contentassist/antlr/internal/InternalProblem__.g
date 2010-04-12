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
T28 : ',' ;
T29 : 'istar' ;
T30 : 'actor' ;
T31 : 'agent' ;
T32 : 'role' ;
T33 : 'position' ;
T34 : 'goal' ;
T35 : 'soft' ;
T36 : 'task' ;
T37 : 'resource' ;
T38 : 'belief' ;
T39 : '~~>' ;
T40 : '<-(and)-' ;
T41 : '<-(or)-' ;
T42 : '-(and)->' ;
T43 : '-(or)->' ;
T44 : '-(+)->' ;
T45 : '-(++)->' ;
T46 : '-(-)->' ;
T47 : '-(--)->' ;

// $ANTLR src "../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g" 4400
RULE_ID : ('#' ~('#')+ '#'|'^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*);

// $ANTLR src "../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g" 4402
RULE_INT : ('0'..'9')+;

// $ANTLR src "../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g" 4404
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g" 4406
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g" 4408
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g" 4410
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g" 4412
RULE_ANY_OTHER : .;


