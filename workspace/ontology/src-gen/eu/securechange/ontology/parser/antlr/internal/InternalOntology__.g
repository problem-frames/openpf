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
T19 : '(' ;
T20 : ')' ;
T21 : 'actor' ;
T22 : 'action' ;
T23 : 'resource' ;
T24 : 'carries out' ;
T25 : 'fulfils' ;
T26 : 'and decomposes' ;
T27 : 'or decomposes' ;
T28 : '+' ;
T29 : '-' ;
T30 : '--' ;
T31 : '++' ;
T32 : 'wants' ;
T33 : 'depends' ;
T34 : 'delegates' ;
T35 : 'trusts' ;
T36 : 'provides' ;
T37 : 'consumes' ;
T38 : 'interfaces' ;
T39 : 'damages' ;
T40 : 'attacks' ;
T41 : 'protects' ;
T42 : 'argues' ;

// $ANTLR src "../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g" 1557
RULE_ID : ('#' ~('#')+ '#'|'^'? ('a'..'z'|'A'..'Z'|'_'|'.') ('a'..'z'|'A'..'Z'|'_'|'0'..'9'|'.')*);

// $ANTLR src "../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g" 1559
RULE_INT : ('0'..'9')+;

// $ANTLR src "../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g" 1561
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g" 1563
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g" 1565
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g" 1567
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g" 1569
RULE_ANY_OTHER : .;


