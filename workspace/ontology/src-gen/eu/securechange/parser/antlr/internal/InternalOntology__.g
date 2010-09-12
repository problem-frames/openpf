lexer grammar InternalOntology;
@header {
package eu.securechange.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : 'model' ;
T12 : ':' ;
T13 : 'event' ;
T14 : ',' ;
T15 : 'actor' ;
T16 : 'attacker' ;
T17 : 'process' ;
T18 : '{' ;
T19 : '}' ;
T20 : 'activity' ;
T21 : 'action' ;
T22 : 'resource' ;
T23 : 'asset' ;
T24 : 'wants' ;
T25 : '(' ;
T26 : ')' ;
T27 : 'does' ;
T28 : 'trusts' ;
T29 : 'delegates' ;
T30 : 'provides' ;
T31 : 'consumes' ;
T32 : 'exploits' ;
T33 : 'damages' ;
T34 : 'attacks' ;
T35 : 'argues' ;
T36 : 'S' ;
T37 : 'R' ;
T38 : 'W' ;
T39 : 'DA' ;
T40 : 'FR' ;
T41 : 'SR' ;
T42 : 'AR' ;
T43 : 'Q' ;
T44 : 'A' ;
T45 : 'and' ;
T46 : 'or' ;
T47 : '-' ;
T48 : '+' ;
T49 : '--' ;
T50 : '++' ;
T51 : 'fulfils' ;

// $ANTLR src "../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g" 2632
RULE_ID : ('#' ~('#')+ '#'|'^'? ('a'..'z'|'A'..'Z'|'_'|'.') ('a'..'z'|'A'..'Z'|'_'|'0'..'9'|'.')*);

// $ANTLR src "../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g" 2634
RULE_INT : ('0'..'9')+;

// $ANTLR src "../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g" 2636
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g" 2638
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g" 2640
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g" 2642
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g" 2644
RULE_ANY_OTHER : .;


