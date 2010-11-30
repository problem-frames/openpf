lexer grammar InternalRBAC;
@header {
package uk.ac.open.rbac.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : 'role' ;
T12 : '{' ;
T13 : '}' ;
T14 : 'user' ;
T15 : 'object' ;
T16 : 'session' ;
T17 : ':' ;
T18 : '=' ;

// $ANTLR src "../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g" 676
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g" 678
RULE_INT : ('0'..'9')+;

// $ANTLR src "../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g" 680
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g" 682
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g" 684
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g" 686
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g" 688
RULE_ANY_OTHER : .;


