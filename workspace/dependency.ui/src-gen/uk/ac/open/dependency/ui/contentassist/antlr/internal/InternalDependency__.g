lexer grammar InternalDependency;
@header {
package uk.ac.open.dependency.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T11 : '{' ;
T12 : '}' ;
T13 : 'see' ;
T14 : '--' ;
T15 : '->' ;

// $ANTLR src "../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g" 793
RULE_ID : ('#' ~('#')+ '#'|'^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*);

// $ANTLR src "../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g" 795
RULE_INT : ('0'..'9')+;

// $ANTLR src "../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g" 797
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g" 799
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g" 801
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g" 803
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g" 805
RULE_ANY_OTHER : .;


