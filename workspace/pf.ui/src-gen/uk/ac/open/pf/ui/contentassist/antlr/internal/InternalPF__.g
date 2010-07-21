lexer grammar InternalPF;
@header {
package uk.ac.open.pf.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T12 : '@' ;
T13 : 'cycle' ;
T14 : '(' ;
T15 : ')' ;
T16 : ',' ;
T17 : ':=' ;
T18 : '{' ;
T19 : '}' ;
T20 : ':' ;

// $ANTLR src "../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g" 1333
RULE_VALUE : '&' RULE_ID;

// $ANTLR src "../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g" 1335
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g" 1337
RULE_INT : ('0'..'9')+;

// $ANTLR src "../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g" 1339
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g" 1341
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g" 1343
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g" 1345
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g" 1347
RULE_ANY_OTHER : .;


