lexer grammar InternalArgument;
@header {
package uk.ac.open.argument.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T13 : '!' ;
T14 : 'argument:' ;
T15 : 'for' ;
T16 : 'A' ;
T17 : ':' ;
T18 : '{' ;
T19 : '}' ;
T20 : 'round' ;
T21 : 'supported by' ;
T22 : ',' ;
T23 : 'warranted by' ;
T24 : 'G' ;
T25 : 'replacing' ;
T26 : '->' ;
T27 : '<->' ;
T28 : '|' ;
T29 : '&' ;
T30 : '!=' ;
T31 : '==' ;
T32 : '>=' ;
T33 : '<=' ;
T34 : '=' ;
T35 : '<' ;
T36 : '>' ;
T37 : '+' ;
T38 : '-' ;
T39 : '*' ;
T40 : '/' ;
T41 : '^' ;
T42 : '(' ;
T43 : ')' ;
T44 : 'rebutted by' ;
T45 : 'mitigated by' ;

// $ANTLR src "../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g" 4905
RULE_INT : ('0'|'1'..'9' ('0'..'9')*);

// $ANTLR src "../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g" 4907
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g" 4909
RULE_ID : ('#' ~('#')+ '#'|'^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*);

// $ANTLR src "../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g" 4911
RULE_QUALIFIED_NAME : RULE_ID ('.' RULE_ID)*;

// $ANTLR src "../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g" 4913
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g" 4915
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g" 4917
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g" 4919
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g" 4921
RULE_ANY_OTHER : .;


