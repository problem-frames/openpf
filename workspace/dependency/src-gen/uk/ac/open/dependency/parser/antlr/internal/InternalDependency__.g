lexer grammar InternalDependency;
@header {
package uk.ac.open.dependency.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : '{' ;
T12 : 'see' ;
T13 : '}' ;
T14 : '--' ;
T15 : '->' ;

// $ANTLR src "../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g" 383
RULE_ID : ('#' ~('#')+ '#'|'^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*);

// $ANTLR src "../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g" 385
RULE_INT : ('0'..'9')+;

// $ANTLR src "../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g" 387
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g" 389
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g" 391
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g" 393
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g" 395
RULE_ANY_OTHER : .;

