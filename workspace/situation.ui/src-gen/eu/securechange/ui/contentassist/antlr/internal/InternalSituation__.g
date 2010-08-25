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
T17 : 'actor' ;
T18 : 'action' ;
T19 : 'attacker' ;
T20 : 'process' ;
T21 : 'activity' ;
T22 : 'resource' ;
T23 : 'asset' ;
T24 : 'event' ;
T25 : 'S' ;
T26 : 'R' ;
T27 : 'W' ;
T28 : 'wants' ;
T29 : 'does' ;
T30 : 'and' ;
T31 : 'or' ;
T32 : 'trusts' ;
T33 : 'delegates' ;
T34 : '-' ;
T35 : '+' ;
T36 : '--' ;
T37 : '++' ;
T38 : 'fulfils' ;
T39 : 'provides' ;
T40 : 'consumes' ;
T41 : 'exploits' ;
T42 : 'damages' ;
T43 : 'attacks' ;
T44 : 'argues' ;
T45 : 'model' ;
T46 : ':' ;
T47 : '(' ;
T48 : ',' ;
T49 : ')' ;

// $ANTLR src "../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g" 1326
RULE_ID : ('#' ~('#')+ '#'|'^'? ('a'..'z'|'A'..'Z'|'_'|'.') ('a'..'z'|'A'..'Z'|'_'|'0'..'9'|'.')*);

// $ANTLR src "../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g" 1328
RULE_INT : ('0'..'9')+;

// $ANTLR src "../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g" 1330
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g" 1332
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g" 1334
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g" 1336
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g" 1338
RULE_ANY_OTHER : .;


