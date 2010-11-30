lexer grammar InternalRBAC;
@header {
package uk.ac.open.rbac.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T11 : 'role' ;
T12 : 'user' ;
T13 : 'object' ;
T14 : ':' ;
T15 : 'session' ;
T16 : '{' ;
T17 : '}' ;

// $ANTLR src "../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g" 1227
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g" 1229
RULE_INT : ('0'..'9')+;

// $ANTLR src "../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g" 1231
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g" 1233
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g" 1235
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g" 1237
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g" 1239
RULE_ANY_OTHER : .;


