lexer grammar InternalArgument;
@header {
package uk.ac.open.argument.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T13 : '?' ;
T14 : '!' ;
T15 : 'argument:' ;
T16 : 'rebutted by' ;
T17 : 'mitigated by' ;
T18 : 'on' ;
T19 : ':' ;
T20 : 'round' ;
T21 : 'replacing' ;
T22 : 'with' ;
T23 : 'foreground' ;
T24 : 'background' ;
T25 : 'shape' ;
T26 : 'image' ;
T27 : '{' ;
T28 : '}' ;
T29 : 'supported by' ;
T30 : ',' ;
T31 : 'warranted by' ;
T32 : '(' ;
T33 : ')' ;
T34 : '-' ;
T35 : '->' ;
T36 : '<->' ;
T37 : '|' ;
T38 : '&' ;
T39 : '!=' ;
T40 : '==' ;
T41 : '>=' ;
T42 : '<=' ;
T43 : '=' ;
T44 : '<' ;
T45 : '>' ;
T46 : '+' ;
T47 : '*' ;
T48 : '/' ;
T49 : '^' ;

// $ANTLR src "../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g" 5414
RULE_INT : ('0'|'1'..'9' ('0'..'9')*);

// $ANTLR src "../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g" 5416
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g" 5418
RULE_ID : ('#' ~('#')+ '#'|'^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*);

// $ANTLR src "../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g" 5420
RULE_QUALIFIED_NAME : RULE_ID ('.' RULE_ID)*;

// $ANTLR src "../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g" 5422
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g" 5424
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g" 5426
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g" 5428
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g" 5430
RULE_ANY_OTHER : .;


