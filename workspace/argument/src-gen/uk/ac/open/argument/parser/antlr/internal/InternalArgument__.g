lexer grammar InternalArgument;
@header {
package uk.ac.open.argument.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T12 : 'argument:' ;
T13 : 'for' ;
T14 : ':' ;
T15 : ',' ;
T16 : '(' ;
T17 : ')' ;
T18 : 'C' ;
T19 : 'W' ;
T20 : 'G' ;
T21 : 'R' ;
T22 : 'M' ;
T23 : 'A' ;
T24 : 'and' ;
T25 : 'or' ;
T26 : 'argues' ;
T27 : 'rebuts' ;
T28 : 'mitigates' ;

// $ANTLR src "../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g" 731
RULE_ID : ('#' ~('#')+ '#'|'^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*);

// $ANTLR src "../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g" 733
RULE_QUALIFIED_NAME : RULE_ID ('.' RULE_ID)*;

// $ANTLR src "../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g" 735
RULE_INT : ('0'..'9')+;

// $ANTLR src "../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g" 737
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g" 739
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g" 741
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g" 743
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g" 745
RULE_ANY_OTHER : .;


