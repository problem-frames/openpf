lexer grammar InternalArgument;
@header {
package argument.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T13 : 'argument:' ;
T14 : 'rebutted by' ;
T15 : 'on' ;
T16 : '@generated' ;
T17 : 'mitigated by' ;
T18 : ':' ;
T19 : 'round' ;
T20 : 'replacing' ;
T21 : 'with' ;
T22 : 'foreground' ;
T23 : 'background' ;
T24 : 'shape' ;
T25 : 'image' ;
T26 : '{' ;
T27 : 'supported by' ;
T28 : ',' ;
T29 : 'warranted by' ;
T30 : '}' ;
T31 : '->' ;
T32 : '<->' ;
T33 : '|' ;
T34 : '&' ;
T35 : '!=' ;
T36 : '==' ;
T37 : '>=' ;
T38 : '<=' ;
T39 : '=' ;
T40 : '<' ;
T41 : '>' ;
T42 : '+' ;
T43 : '-' ;
T44 : '*' ;
T45 : '/' ;
T46 : '^' ;
T47 : '(' ;
T48 : ')' ;
T49 : '?' ;
T50 : '!' ;

// $ANTLR src "../argument/src-gen/argument/parser/antlr/internal/InternalArgument.g" 2071
RULE_INT : ('0'|'1'..'9' ('0'..'9')*);

// $ANTLR src "../argument/src-gen/argument/parser/antlr/internal/InternalArgument.g" 2073
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../argument/src-gen/argument/parser/antlr/internal/InternalArgument.g" 2075
RULE_ID : ('#' ~('#')+ '#'|'^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*);

// $ANTLR src "../argument/src-gen/argument/parser/antlr/internal/InternalArgument.g" 2077
RULE_QUALIFIED_NAME : RULE_ID ('.' RULE_ID)*;

// $ANTLR src "../argument/src-gen/argument/parser/antlr/internal/InternalArgument.g" 2079
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../argument/src-gen/argument/parser/antlr/internal/InternalArgument.g" 2081
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../argument/src-gen/argument/parser/antlr/internal/InternalArgument.g" 2083
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../argument/src-gen/argument/parser/antlr/internal/InternalArgument.g" 2085
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../argument/src-gen/argument/parser/antlr/internal/InternalArgument.g" 2087
RULE_ANY_OTHER : .;


