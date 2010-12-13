lexer grammar InternalOntology;
@header {
package eu.securechange.ontology.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : 'model' ;
T12 : ':' ;
T13 : 'goal' ;
T14 : ',' ;
T15 : 'sec' ;
T16 : 'req' ;
T17 : 'dom' ;
T18 : '$' ;
T19 : 'actor' ;
T20 : 'action' ;
T21 : 'resource' ;
T22 : '(' ;
T23 : ')' ;
T24 : 'carries out' ;
T25 : 'depends' ;
T26 : 'decomposes' ;
T27 : 'contributes' ;
T28 : 'delegates' ;
T29 : 'fulfils' ;
T30 : 'provides' ;
T31 : 'trusts' ;
T32 : 'wants' ;
T33 : 'damages' ;
T34 : 'attacks' ;
T35 : 'argues' ;
T36 : 'interfaces' ;

// $ANTLR src "../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g" 1467
RULE_ID : ('#' ~('#')+ '#'|'^'? ('a'..'z'|'A'..'Z'|'_'|'.') ('a'..'z'|'A'..'Z'|'_'|'0'..'9'|'.')*);

// $ANTLR src "../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g" 1469
RULE_INT : ('0'..'9')+;

// $ANTLR src "../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g" 1471
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g" 1473
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g" 1475
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g" 1477
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g" 1479
RULE_ANY_OTHER : .;


