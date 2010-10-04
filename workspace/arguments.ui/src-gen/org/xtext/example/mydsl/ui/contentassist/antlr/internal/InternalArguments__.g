lexer grammar InternalArguments;
@header {
package org.xtext.example.mydsl.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T11 : 'claim' ;
T12 : 'grounds' ;
T13 : '(' ;
T14 : ')' ;
T15 : 'warrants' ;
T16 : 'statement' ;

// $ANTLR src "../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g" 1061
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g" 1063
RULE_INT : ('0'..'9')+;

// $ANTLR src "../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g" 1065
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g" 1067
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g" 1069
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g" 1071
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g" 1073
RULE_ANY_OTHER : .;

