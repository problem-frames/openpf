lexer grammar InternalOntology;
@header {
package eu.securechange.ontology.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : 'model' ;
T12 : ':' ;
T13 : 'event' ;
T14 : ',' ;
T15 : 'DA' ;
T16 : 'FR' ;
T17 : 'SR' ;
T18 : 'AR' ;
T19 : 'Q' ;
T20 : 'A' ;
T21 : 'actor' ;
T22 : 'attacker' ;
T23 : 'process' ;
T24 : '{' ;
T25 : '}' ;
T26 : 'activity' ;
T27 : 'action' ;
T28 : 'resource' ;
T29 : 'asset' ;
T30 : 'wants' ;
T31 : '(' ;
T32 : ')' ;
T33 : 'does' ;
T34 : 'trusts' ;
T35 : 'delegates' ;
T36 : 'provides' ;
T37 : 'consumes' ;
T38 : 'exploits' ;
T39 : 'damages' ;
T40 : 'attacks' ;
T41 : 'argues' ;
T42 : 'S' ;
T43 : 'R' ;
T44 : 'W' ;
T45 : 'and' ;
T46 : 'or' ;
T47 : '-' ;
T48 : '+' ;
T49 : '--' ;
T50 : '++' ;
T51 : 'fulfils' ;

// $ANTLR src "../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g" 2972
RULE_ID : ('#' ~('#')+ '#'|'^'? ('a'..'z'|'A'..'Z'|'_'|'.') ('a'..'z'|'A'..'Z'|'_'|'0'..'9'|'.')*);

// $ANTLR src "../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g" 2974
RULE_INT : ('0'..'9')+;

// $ANTLR src "../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g" 2976
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g" 2978
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g" 2980
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g" 2982
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g" 2984
RULE_ANY_OTHER : .;


