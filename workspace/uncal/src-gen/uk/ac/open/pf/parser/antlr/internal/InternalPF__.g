lexer grammar InternalPF;
@header {
package uk.ac.open.pf.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T12 : '@' ;
T13 : 'cycle' ;
T14 : '(' ;
T15 : ':=' ;
T16 : '{' ;
T17 : 'ObjectType' ;
T18 : ':' ;
T19 : ',' ;
T20 : '}' ;
T21 : ')' ;

// $ANTLR src "../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g" 702
RULE_VALUE : '&' RULE_ID;

// $ANTLR src "../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g" 704
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g" 706
RULE_INT : ('0'..'9')+;

// $ANTLR src "../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g" 708
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g" 710
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g" 712
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g" 714
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g" 716
RULE_ANY_OTHER : .;


