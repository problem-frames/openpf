lexer grammar InternalIstar;
@header {
package uk.ac.open.istar.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T11 : ':' ;
T12 : 'istar' ;
T13 : 'actor' ;
T14 : '{' ;
T15 : '}' ;
T16 : 'agent' ;
T17 : 'role' ;
T18 : 'position' ;
T19 : 'goal' ;
T20 : 'soft' ;
T21 : 'task' ;
T22 : 'resource' ;
T23 : 'belief' ;
T24 : '~~>' ;
T25 : '~>' ;
T26 : '<-(and)-' ;
T27 : '<-(or)-' ;
T28 : '-(and)->' ;
T29 : '-(or)->' ;
T30 : '-(+)->' ;
T31 : '-(++)->' ;
T32 : '-(-)->' ;
T33 : '-(--)->' ;

// $ANTLR src "../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g" 4053
RULE_ID : ('#' ~('#')+ '#'|'^'? ('a'..'z'|'A'..'Z'|'_'|'.') ('a'..'z'|'A'..'Z'|'_'|'0'..'9'|'.')*);

// $ANTLR src "../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g" 4055
RULE_INT : ('0'..'9')+;

// $ANTLR src "../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g" 4057
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g" 4059
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g" 4061
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g" 4063
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g" 4065
RULE_ANY_OTHER : .;


