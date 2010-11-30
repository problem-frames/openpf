lexer grammar InternalRBAC;
@header {
package uk.ac.open.rbac.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : 'role' ;
T12 : 'user' ;
T13 : 'object' ;
T14 : ':' ;
T15 : 'session' ;
T16 : '{' ;
T17 : '}' ;

// $ANTLR src "../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g" 656
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g" 658
RULE_INT : ('0'..'9')+;

// $ANTLR src "../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g" 660
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g" 662
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g" 664
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g" 666
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g" 668
RULE_ANY_OTHER : .;


