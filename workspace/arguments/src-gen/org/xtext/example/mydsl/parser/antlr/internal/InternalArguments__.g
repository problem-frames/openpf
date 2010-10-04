lexer grammar InternalArguments;
@header {
package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : 'claim' ;
T12 : 'grounds' ;
T13 : '(' ;
T14 : ')' ;
T15 : 'warrants' ;
T16 : 'statement' ;

// $ANTLR src "../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g" 498
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g" 500
RULE_INT : ('0'..'9')+;

// $ANTLR src "../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g" 502
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g" 504
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g" 506
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g" 508
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g" 510
RULE_ANY_OTHER : .;


