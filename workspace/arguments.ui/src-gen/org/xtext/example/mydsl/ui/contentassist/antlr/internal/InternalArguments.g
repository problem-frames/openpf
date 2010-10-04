/*
* generated by Xtext
*/
grammar InternalArguments;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package org.xtext.example.mydsl.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.example.mydsl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.ArgumentsGrammarAccess;

}

@parser::members {
 
 	private ArgumentsGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(ArgumentsGrammarAccess grammarAccess) {
    	this.grammarAccess = grammarAccess;
    }
    
    @Override
    protected Grammar getGrammar() {
    	return grammarAccess.getGrammar();
    }
    
    @Override
    protected String getValueForTokenName(String tokenName) {
    	return tokenName;
    }

}




// Entry rule entryRuleArgument
entryRuleArgument 
:
{ before(grammarAccess.getArgumentRule()); }
	 ruleArgument
{ after(grammarAccess.getArgumentRule()); } 
	 EOF 
;

// Rule Argument
ruleArgument
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getArgumentAccess().getGroup()); }
(rule__Argument__Group__0)
{ after(grammarAccess.getArgumentAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}





// Entry rule entryRulegStatement
entryRulegStatement 
:
{ before(grammarAccess.getGStatementRule()); }
	 rulegStatement
{ after(grammarAccess.getGStatementRule()); } 
	 EOF 
;

// Rule gStatement
rulegStatement
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getGStatementAccess().getGroup()); }
(rule__GStatement__Group__0)
{ after(grammarAccess.getGStatementAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRulewStatement
entryRulewStatement 
:
{ before(grammarAccess.getWStatementRule()); }
	 rulewStatement
{ after(grammarAccess.getWStatementRule()); } 
	 EOF 
;

// Rule wStatement
rulewStatement
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getWStatementAccess().getGroup()); }
(rule__WStatement__Group__0)
{ after(grammarAccess.getWStatementAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRulerStatement
entryRulerStatement 
:
{ before(grammarAccess.getRStatementRule()); }
	 rulerStatement
{ after(grammarAccess.getRStatementRule()); } 
	 EOF 
;

// Rule rStatement
rulerStatement
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getRStatementAccess().getGroup()); }
(rule__RStatement__Group__0)
{ after(grammarAccess.getRStatementAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Argument__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Argument__Group__0__Impl
	rule__Argument__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentAccess().getClaimKeyword_0()); }

	'claim' 

{ after(grammarAccess.getArgumentAccess().getClaimKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Argument__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Argument__Group__1__Impl
	rule__Argument__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentAccess().getCnameAssignment_1()); }
(rule__Argument__CnameAssignment_1)
{ after(grammarAccess.getArgumentAccess().getCnameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Argument__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Argument__Group__2__Impl
	rule__Argument__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentAccess().getClaimstrAssignment_2()); }
(rule__Argument__ClaimstrAssignment_2)
{ after(grammarAccess.getArgumentAccess().getClaimstrAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Argument__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Argument__Group__3__Impl
	rule__Argument__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentAccess().getGroundsKeyword_3()); }

	'grounds' 

{ after(grammarAccess.getArgumentAccess().getGroundsKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Argument__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Argument__Group__4__Impl
	rule__Argument__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentAccess().getGnameAssignment_4()); }
(rule__Argument__GnameAssignment_4)
{ after(grammarAccess.getArgumentAccess().getGnameAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Argument__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Argument__Group__5__Impl
	rule__Argument__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentAccess().getLeftParenthesisKeyword_5()); }

	'(' 

{ after(grammarAccess.getArgumentAccess().getLeftParenthesisKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Argument__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Argument__Group__6__Impl
	rule__Argument__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentAccess().getGroundstatementsAssignment_6()); }
(rule__Argument__GroundstatementsAssignment_6)*
{ after(grammarAccess.getArgumentAccess().getGroundstatementsAssignment_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Argument__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Argument__Group__7__Impl
	rule__Argument__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentAccess().getRightParenthesisKeyword_7()); }

	')' 

{ after(grammarAccess.getArgumentAccess().getRightParenthesisKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Argument__Group__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Argument__Group__8__Impl
	rule__Argument__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__Group__8__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentAccess().getWarrantsKeyword_8()); }

	'warrants' 

{ after(grammarAccess.getArgumentAccess().getWarrantsKeyword_8()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Argument__Group__9
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Argument__Group__9__Impl
	rule__Argument__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__Group__9__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentAccess().getWnameAssignment_9()); }
(rule__Argument__WnameAssignment_9)
{ after(grammarAccess.getArgumentAccess().getWnameAssignment_9()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Argument__Group__10
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Argument__Group__10__Impl
	rule__Argument__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__Group__10__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentAccess().getLeftParenthesisKeyword_10()); }

	'(' 

{ after(grammarAccess.getArgumentAccess().getLeftParenthesisKeyword_10()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Argument__Group__11
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Argument__Group__11__Impl
	rule__Argument__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__Group__11__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentAccess().getWarrantstatementsAssignment_11()); }
(rule__Argument__WarrantstatementsAssignment_11)*
{ after(grammarAccess.getArgumentAccess().getWarrantstatementsAssignment_11()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Argument__Group__12
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Argument__Group__12__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__Group__12__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentAccess().getRightParenthesisKeyword_12()); }

	')' 

{ after(grammarAccess.getArgumentAccess().getRightParenthesisKeyword_12()); }
)

;
finally {
	restoreStackSize(stackSize);
}





























rule__GStatement__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__GStatement__Group__0__Impl
	rule__GStatement__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GStatement__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getGStatementAccess().getStatementKeyword_0()); }

	'statement' 

{ after(grammarAccess.getGStatementAccess().getStatementKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__GStatement__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__GStatement__Group__1__Impl
	rule__GStatement__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GStatement__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getGStatementAccess().getNameAssignment_1()); }
(rule__GStatement__NameAssignment_1)
{ after(grammarAccess.getGStatementAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__GStatement__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__GStatement__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GStatement__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getGStatementAccess().getGroundstrAssignment_2()); }
(rule__GStatement__GroundstrAssignment_2)
{ after(grammarAccess.getGStatementAccess().getGroundstrAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__WStatement__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__WStatement__Group__0__Impl
	rule__WStatement__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__WStatement__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getWStatementAccess().getStatementKeyword_0()); }

	'statement' 

{ after(grammarAccess.getWStatementAccess().getStatementKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__WStatement__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__WStatement__Group__1__Impl
	rule__WStatement__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__WStatement__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getWStatementAccess().getNameAssignment_1()); }
(rule__WStatement__NameAssignment_1)
{ after(grammarAccess.getWStatementAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__WStatement__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__WStatement__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__WStatement__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getWStatementAccess().getGroundstrAssignment_2()); }
(rule__WStatement__GroundstrAssignment_2)
{ after(grammarAccess.getWStatementAccess().getGroundstrAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__RStatement__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__RStatement__Group__0__Impl
	rule__RStatement__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RStatement__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRStatementAccess().getStatementKeyword_0()); }

	'statement' 

{ after(grammarAccess.getRStatementAccess().getStatementKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__RStatement__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__RStatement__Group__1__Impl
	rule__RStatement__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__RStatement__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRStatementAccess().getNameAssignment_1()); }
(rule__RStatement__NameAssignment_1)
{ after(grammarAccess.getRStatementAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__RStatement__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__RStatement__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RStatement__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRStatementAccess().getGroundstrAssignment_2()); }
(rule__RStatement__GroundstrAssignment_2)
{ after(grammarAccess.getRStatementAccess().getGroundstrAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}









rule__Argument__CnameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentAccess().getCnameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getArgumentAccess().getCnameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__ClaimstrAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentAccess().getClaimstrSTRINGTerminalRuleCall_2_0()); }
	RULE_STRING{ after(grammarAccess.getArgumentAccess().getClaimstrSTRINGTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__GnameAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentAccess().getGnameIDTerminalRuleCall_4_0()); }
	RULE_ID{ after(grammarAccess.getArgumentAccess().getGnameIDTerminalRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__GroundstatementsAssignment_6
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentAccess().getGroundstatementsGStatementParserRuleCall_6_0()); }
	rulegStatement{ after(grammarAccess.getArgumentAccess().getGroundstatementsGStatementParserRuleCall_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__WnameAssignment_9
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentAccess().getWnameIDTerminalRuleCall_9_0()); }
	RULE_ID{ after(grammarAccess.getArgumentAccess().getWnameIDTerminalRuleCall_9_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__WarrantstatementsAssignment_11
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentAccess().getWarrantstatementsWStatementParserRuleCall_11_0()); }
	rulewStatement{ after(grammarAccess.getArgumentAccess().getWarrantstatementsWStatementParserRuleCall_11_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}




rule__GStatement__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getGStatementAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getGStatementAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__GStatement__GroundstrAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getGStatementAccess().getGroundstrSTRINGTerminalRuleCall_2_0()); }
	RULE_STRING{ after(grammarAccess.getGStatementAccess().getGroundstrSTRINGTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__WStatement__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getWStatementAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getWStatementAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__WStatement__GroundstrAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getWStatementAccess().getGroundstrSTRINGTerminalRuleCall_2_0()); }
	RULE_STRING{ after(grammarAccess.getWStatementAccess().getGroundstrSTRINGTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__RStatement__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRStatementAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getRStatementAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__RStatement__GroundstrAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRStatementAccess().getGroundstrSTRINGTerminalRuleCall_2_0()); }
	RULE_STRING{ after(grammarAccess.getRStatementAccess().getGroundstrSTRINGTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;

