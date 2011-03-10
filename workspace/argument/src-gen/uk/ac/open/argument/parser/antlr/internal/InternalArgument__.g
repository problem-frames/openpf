lexer grammar InternalArgument;
@header {
package uk.ac.open.argument.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T13 : 'argument:' ;
T14 : 'rebutted by' ;
T15 : 'on' ;
T16 : 'mitigated by' ;
T17 : ':' ;
T18 : 'round' ;
T19 : 'replacing' ;
T20 : 'with' ;
T21 : 'foreground' ;
T22 : 'background' ;
T23 : 'shape' ;
T24 : 'image' ;
T25 : '{' ;
T26 : 'supported by' ;
T27 : ',' ;
T28 : 'warranted by' ;
T29 : '}' ;
T30 : '->' ;
T31 : '<->' ;
T32 : '|' ;
T33 : '&' ;
T34 : '!=' ;
T35 : '==' ;
T36 : '>=' ;
T37 : '<=' ;
T38 : '=' ;
T39 : '<' ;
T40 : '>' ;
T41 : '+' ;
T42 : '-' ;
T43 : '*' ;
T44 : '/' ;
T45 : '^' ;
T46 : '(' ;
T47 : ')' ;
T48 : '?' ;
T49 : '!' ;

// $ANTLR src "../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g" 2029
RULE_INT : ('0'|'1'..'9' ('0'..'9')*);

// $ANTLR src "../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g" 2031
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g" 2033
RULE_ID : ('#' ~('#')+ '#'|'^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*);

// $ANTLR src "../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g" 2035
RULE_QUALIFIED_NAME : RULE_ID ('.' RULE_ID)*;

// $ANTLR src "../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g" 2037
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g" 2039
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g" 2041
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g" 2043
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g" 2045
RULE_ANY_OTHER : .;


