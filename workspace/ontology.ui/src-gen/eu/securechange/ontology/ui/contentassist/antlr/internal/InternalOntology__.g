lexer grammar InternalOntology;
@header {
package eu.securechange.ontology.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T11 : 'carries out' ;
T12 : 'delegates' ;
T13 : 'fulfils' ;
T14 : 'provides' ;
T15 : 'trusts' ;
T16 : 'wants' ;
T17 : 'damages' ;
T18 : 'attacks' ;
T19 : 'argues' ;
T20 : 'interfaces' ;
T21 : 'model' ;
T22 : ':' ;
T23 : ',' ;
T24 : '(' ;
T25 : ')' ;
T26 : 'SG' ;
T27 : 'R' ;
T28 : 'AR' ;
T29 : 'Ar' ;
T30 : 'An' ;
T31 : 'As' ;
T32 : 'Re' ;
T33 : 'Ak' ;

// $ANTLR src "../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g" 2870
RULE_ID : ('#' ~('#')+ '#'|'^'? ('a'..'z'|'A'..'Z'|'_'|'.') ('a'..'z'|'A'..'Z'|'_'|'0'..'9'|'.')*);

// $ANTLR src "../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g" 2872
RULE_INT : ('0'..'9')+;

// $ANTLR src "../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g" 2874
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g" 2876
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g" 2878
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g" 2880
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g" 2882
RULE_ANY_OTHER : .;


