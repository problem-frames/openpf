lexer grammar InternalSituation;
@header {
package eu.securechange.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : 'model' ;
T12 : ':' ;
T13 : '(' ;
T14 : ',' ;
T15 : ')' ;
T16 : 'DA' ;
T17 : 'FR' ;
T18 : 'SR' ;
T19 : 'AR' ;
T20 : 'Q' ;
T21 : 'A' ;
T22 : 'actor' ;
T23 : 'action' ;
T24 : 'attacker' ;
T25 : 'process' ;
T26 : 'activity' ;
T27 : 'resource' ;
T28 : 'asset' ;
T29 : 'event' ;
T30 : 'M' ;
T31 : 'R' ;
T32 : 'S' ;
T33 : 'wants' ;
T34 : 'does' ;
T35 : 'and' ;
T36 : 'or' ;
T37 : 'trusts' ;
T38 : 'delegates' ;
T39 : '-' ;
T40 : '+' ;
T41 : '--' ;
T42 : '++' ;
T43 : 'fulfils' ;
T44 : 'provides' ;
T45 : 'consumes' ;
T46 : 'exploits' ;
T47 : 'damages' ;
T48 : 'attacks' ;
T49 : 'argues' ;

// $ANTLR src "../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g" 696
RULE_ID : ('#' ~('#')+ '#'|'^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*);

// $ANTLR src "../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g" 698
RULE_INT : ('0'..'9')+;

// $ANTLR src "../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g" 700
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g" 702
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g" 704
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g" 706
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g" 708
RULE_ANY_OTHER : .;


