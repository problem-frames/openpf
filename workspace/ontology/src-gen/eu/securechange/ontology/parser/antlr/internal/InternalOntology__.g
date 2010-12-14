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
T26 : 'and decomposes' ;
T27 : 'or decomposes' ;
T28 : '+' ;
T29 : '-' ;
T30 : '--' ;
T31 : '++' ;
T32 : 'delegates' ;
T33 : 'fulfils' ;
T34 : 'provides' ;
T35 : 'trusts' ;
T36 : 'wants' ;
T37 : 'damages' ;
T38 : 'attacks' ;
T39 : 'argues' ;
T40 : 'interfaces' ;
T41 : 'consumes' ;
T42 : 'protects' ;

// $ANTLR src "../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g" 1517
RULE_ID : ('#' ~('#')+ '#'|'^'? ('a'..'z'|'A'..'Z'|'_'|'.') ('a'..'z'|'A'..'Z'|'_'|'0'..'9'|'.')*);

// $ANTLR src "../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g" 1519
RULE_INT : ('0'..'9')+;

// $ANTLR src "../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g" 1521
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g" 1523
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g" 1525
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g" 1527
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g" 1529
RULE_ANY_OTHER : .;


