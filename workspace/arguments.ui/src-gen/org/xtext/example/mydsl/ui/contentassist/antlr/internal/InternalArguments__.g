lexer grammar InternalArguments;
@header {
package org.xtext.example.mydsl.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T11 : 'given' ;
T12 : 'grounds' ;
T13 : 'warranted' ;
T14 : 'by' ;
T15 : 'thus' ;
T16 : 'claim' ;
T17 : '.' ;
T18 : '(' ;
T19 : ')' ;
T20 : 'rebutted' ;
T21 : ':' ;

// $ANTLR src "../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g" 1300
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g" 1302
RULE_INT : ('0'..'9')+;

// $ANTLR src "../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g" 1304
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g" 1306
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g" 1308
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g" 1310
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g" 1312
RULE_ANY_OTHER : .;


