lexer grammar InternalOntology;
@header {
package eu.securechange.ontology.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T11 : 'fulfils' ;
T12 : 'S' ;
T13 : 'R' ;
T14 : 'W' ;
T15 : 'and' ;
T16 : 'or' ;
T17 : '-' ;
T18 : '+' ;
T19 : '--' ;
T20 : '++' ;
T21 : 'model' ;
T22 : ':' ;
T23 : 'event' ;
T24 : ',' ;
T25 : 'DA' ;
T26 : 'FR' ;
T27 : 'SR' ;
T28 : 'AR' ;
T29 : 'Q' ;
T30 : 'A' ;
T31 : 'actor' ;
T32 : 'attacker' ;
T33 : 'process' ;
T34 : '{' ;
T35 : '}' ;
T36 : 'activity' ;
T37 : 'action' ;
T38 : 'resource' ;
T39 : 'asset' ;
T40 : '(' ;
T41 : ')' ;
T42 : 'wants' ;
T43 : 'does' ;
T44 : 'trusts' ;
T45 : 'delegates' ;
T46 : 'provides' ;
T47 : 'consumes' ;
T48 : 'exploits' ;
T49 : 'damages' ;
T50 : 'attacks' ;
T51 : 'argues' ;

// $ANTLR src "../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g" 7147
RULE_ID : ('#' ~('#')+ '#'|'^'? ('a'..'z'|'A'..'Z'|'_'|'.') ('a'..'z'|'A'..'Z'|'_'|'0'..'9'|'.')*);

// $ANTLR src "../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g" 7149
RULE_INT : ('0'..'9')+;

// $ANTLR src "../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g" 7151
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g" 7153
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g" 7155
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g" 7157
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g" 7159
RULE_ANY_OTHER : .;


