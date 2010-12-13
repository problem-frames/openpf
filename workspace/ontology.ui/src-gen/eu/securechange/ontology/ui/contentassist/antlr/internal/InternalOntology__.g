lexer grammar InternalOntology;
@header {
package eu.securechange.ontology.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T11 : 'carries out' ;
T12 : 'depends' ;
T13 : 'decomposes' ;
T14 : 'contributes' ;
T15 : 'delegates' ;
T16 : 'fulfils' ;
T17 : 'provides' ;
T18 : 'trusts' ;
T19 : 'wants' ;
T20 : 'damages' ;
T21 : 'attacks' ;
T22 : 'argues' ;
T23 : 'interfaces' ;
T24 : 'model' ;
T25 : ':' ;
T26 : ',' ;
T27 : '$' ;
T28 : '(' ;
T29 : ')' ;
T30 : 'goal' ;
T31 : 'sec' ;
T32 : 'req' ;
T33 : 'dom' ;
T34 : 'actor' ;
T35 : 'action' ;
T36 : 'resource' ;

// $ANTLR src "../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g" 3096
RULE_ID : ('#' ~('#')+ '#'|'^'? ('a'..'z'|'A'..'Z'|'_'|'.') ('a'..'z'|'A'..'Z'|'_'|'0'..'9'|'.')*);

// $ANTLR src "../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g" 3098
RULE_INT : ('0'..'9')+;

// $ANTLR src "../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g" 3100
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g" 3102
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g" 3104
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g" 3106
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g" 3108
RULE_ANY_OTHER : .;


