lexer grammar InternalSituation;
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
T28 : 'fulfils' ;
T29 : 'provides' ;
T30 : 'consumes' ;
T31 : 'exploits' ;
T32 : 'damages' ;
T33 : 'attack' ;
T34 : 'argues' ;
T35 : 'DA' ;
T36 : 'FR' ;
T37 : 'SR' ;
T38 : 'AR' ;
T39 : 'Q' ;
T40 : 'A' ;
T41 : 'M' ;
T42 : 'R' ;
T43 : 'S' ;
T44 : 'and' ;
T45 : 'or' ;
T46 : '-' ;
T47 : '+' ;
T48 : '--' ;
T49 : '++' ;
T50 : 'trusts' ;
T51 : 'delegates' ;

// $ANTLR src "../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g" 2538
RULE_ID : ('#' ~('#')+ '#'|'^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*);

// $ANTLR src "../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g" 2540
RULE_INT : ('0'..'9')+;

// $ANTLR src "../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g" 2542
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g" 2544
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g" 2546
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g" 2548
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g" 2550
RULE_ANY_OTHER : .;


