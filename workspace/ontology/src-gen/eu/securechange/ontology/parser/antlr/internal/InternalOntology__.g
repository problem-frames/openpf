lexer grammar InternalOntology;
@header {
package eu.securechange.ontology.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : 'model' ;
T12 : ':' ;
T13 : 'SG' ;
T14 : ',' ;
T15 : 'R' ;
T16 : 'AR' ;
T17 : 'Ar' ;
T18 : 'An' ;
T19 : 'As' ;
T20 : 'Re' ;
T21 : 'Ak' ;
T22 : '(' ;
T23 : ')' ;
T24 : 'carries out' ;
T25 : 'delegates' ;
T26 : 'fulfils' ;
T27 : 'provides' ;
T28 : 'trusts' ;
T29 : 'wants' ;
T30 : 'damages' ;
T31 : 'attacks' ;
T32 : 'argues' ;
T33 : 'interfaces' ;

// $ANTLR src "../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g" 1359
RULE_ID : ('#' ~('#')+ '#'|'^'? ('a'..'z'|'A'..'Z'|'_'|'.') ('a'..'z'|'A'..'Z'|'_'|'0'..'9'|'.')*);

// $ANTLR src "../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g" 1361
RULE_INT : ('0'..'9')+;

// $ANTLR src "../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g" 1363
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g" 1365
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g" 1367
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g" 1369
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g" 1371
RULE_ANY_OTHER : .;


