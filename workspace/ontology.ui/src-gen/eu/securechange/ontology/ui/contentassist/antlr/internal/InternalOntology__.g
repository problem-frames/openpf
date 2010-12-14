lexer grammar InternalOntology;
@header {
package eu.securechange.ontology.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T11 : 'carries out' ;
T12 : 'depends' ;
T13 : 'and decomposes' ;
T14 : 'or decomposes' ;
T15 : '+' ;
T16 : '-' ;
T17 : '--' ;
T18 : '++' ;
T19 : 'delegates' ;
T20 : 'fulfils' ;
T21 : 'provides' ;
T22 : 'trusts' ;
T23 : 'wants' ;
T24 : 'damages' ;
T25 : 'attacks' ;
T26 : 'argues' ;
T27 : 'interfaces' ;
T28 : 'consumes' ;
T29 : 'protects' ;
T30 : 'model' ;
T31 : ':' ;
T32 : ',' ;
T33 : '$' ;
T34 : '(' ;
T35 : ')' ;
T36 : 'goal' ;
T37 : 'sec' ;
T38 : 'req' ;
T39 : 'dom' ;
T40 : 'actor' ;
T41 : 'action' ;
T42 : 'resource' ;

// $ANTLR src "../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g" 3227
RULE_ID : ('#' ~('#')+ '#'|'^'? ('a'..'z'|'A'..'Z'|'_'|'.') ('a'..'z'|'A'..'Z'|'_'|'0'..'9'|'.')*);

// $ANTLR src "../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g" 3229
RULE_INT : ('0'..'9')+;

// $ANTLR src "../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g" 3231
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g" 3233
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g" 3235
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g" 3237
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g" 3239
RULE_ANY_OTHER : .;


