lexer grammar InternalArgument;
@header {
package uk.ac.open.argument.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T12 : 'argument:' ;
T13 : 'for' ;
T14 : 'A' ;
T15 : '{' ;
T16 : 'claim' ;
T17 : 'supported by' ;
T18 : ',' ;
T19 : 'warranted by' ;
T20 : '}' ;
T21 : ':' ;
T22 : 'G' ;
T23 : 'C' ;
T24 : 'rebuts' ;
T25 : 'mitigates' ;

// $ANTLR src "../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g" 735
RULE_ID : ('#' ~('#')+ '#'|'^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*);

// $ANTLR src "../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g" 737
RULE_QUALIFIED_NAME : RULE_ID ('.' RULE_ID)*;

// $ANTLR src "../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g" 739
RULE_INT : ('0'..'9')+;

// $ANTLR src "../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g" 741
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g" 743
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g" 745
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g" 747
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g" 749
RULE_ANY_OTHER : .;


