lexer grammar InternalSituation;
@header {
package eu.securechange.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T11 : 'DA' ;
T12 : 'FR' ;
T13 : 'SR' ;
T14 : 'AR' ;
T15 : 'Q' ;
T16 : 'A' ;
T17 : 'M' ;
T18 : 'R' ;
T19 : 'S' ;
T20 : 'and' ;
T21 : 'or' ;
T22 : '-' ;
T23 : '+' ;
T24 : '--' ;
T25 : '++' ;
T26 : 'trusts' ;
T27 : 'delegates' ;
T28 : 'model' ;
T29 : ':' ;
T30 : 'event' ;
T31 : ',' ;
T32 : 'actor' ;
T33 : 'attacker' ;
T34 : 'process' ;
T35 : '{' ;
T36 : '}' ;
T37 : 'activity' ;
T38 : 'action' ;
T39 : 'resource' ;
T40 : 'asset' ;
T41 : 'wants' ;
T42 : '(' ;
T43 : ')' ;
T44 : 'does' ;
T45 : 'fulfils' ;
T46 : 'provides' ;
T47 : 'consumes' ;
T48 : 'exploits' ;
T49 : 'damages' ;
T50 : 'attack' ;
T51 : 'argues' ;

// $ANTLR src "../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g" 6554
RULE_ID : ('#' ~('#')+ '#'|'^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*);

// $ANTLR src "../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g" 6556
RULE_INT : ('0'..'9')+;

// $ANTLR src "../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g" 6558
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g" 6560
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g" 6562
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g" 6564
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g" 6566
RULE_ANY_OTHER : .;


