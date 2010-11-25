lexer grammar InternalArgument;
@header {
package uk.ac.open.argument.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T13 : 'argument:' ;
T14 : ':' ;
T15 : 'round' ;
T16 : 'replacing' ;
T17 : 'foreground' ;
T18 : 'background' ;
T19 : 'shape' ;
T20 : 'image' ;
T21 : '{' ;
T22 : 'supported by' ;
T23 : ',' ;
T24 : 'warranted by' ;
T25 : '}' ;
T26 : 'rebutted by' ;
T27 : 'mitigated by' ;
T28 : 'for' ;

// $ANTLR src "../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g" 699
RULE_INT : ('0'|'1'..'9' ('0'..'9')*);

// $ANTLR src "../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g" 701
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g" 703
RULE_ID : ('#' ~('#')+ '#'|'^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*);

// $ANTLR src "../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g" 705
RULE_QUALIFIED_NAME : RULE_ID ('.' RULE_ID)*;

// $ANTLR src "../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g" 707
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g" 709
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g" 711
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g" 713
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g" 715
RULE_ANY_OTHER : .;


