/*
* generated by Xtext
*/
grammar InternalArgument;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package uk.ac.open.argument.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package uk.ac.open.argument.ui.contentassist.antlr.internal; 

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
import uk.ac.open.argument.services.ArgumentGrammarAccess;

}

@parser::members {
 
 	private ArgumentGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(ArgumentGrammarAccess grammarAccess) {
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




// Entry rule entryRuleArgumentDiagram
entryRuleArgumentDiagram 
:
{ before(grammarAccess.getArgumentDiagramRule()); }
	 ruleArgumentDiagram
{ after(grammarAccess.getArgumentDiagramRule()); } 
	 EOF 
;

// Rule ArgumentDiagram
ruleArgumentDiagram
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getArgumentDiagramAccess().getGroup()); }
(rule__ArgumentDiagram__Group__0)
{ after(grammarAccess.getArgumentDiagramAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleNode
entryRuleNode 
:
{ before(grammarAccess.getNodeRule()); }
	 ruleNode
{ after(grammarAccess.getNodeRule()); } 
	 EOF 
;

// Rule Node
ruleNode
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getNodeAccess().getAlternatives()); }
(rule__Node__Alternatives)
{ after(grammarAccess.getNodeAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
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



// Entry rule entryRuleFact
entryRuleFact 
:
{ before(grammarAccess.getFactRule()); }
	 ruleFact
{ after(grammarAccess.getFactRule()); } 
	 EOF 
;

// Rule Fact
ruleFact
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getFactAccess().getGroup()); }
(rule__Fact__Group__0)
{ after(grammarAccess.getFactAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleClaim
entryRuleClaim 
:
{ before(grammarAccess.getClaimRule()); }
	 ruleClaim
{ after(grammarAccess.getClaimRule()); } 
	 EOF 
;

// Rule Claim
ruleClaim
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getClaimAccess().getGroup()); }
(rule__Claim__Group__0)
{ after(grammarAccess.getClaimAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleLink
entryRuleLink 
:
{ before(grammarAccess.getLinkRule()); }
	 ruleLink
{ after(grammarAccess.getLinkRule()); } 
	 EOF 
;

// Rule Link
ruleLink
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getLinkAccess().getAlternatives()); }
(rule__Link__Alternatives)
{ after(grammarAccess.getLinkAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleRebuts
entryRuleRebuts 
:
{ before(grammarAccess.getRebutsRule()); }
	 ruleRebuts
{ after(grammarAccess.getRebutsRule()); } 
	 EOF 
;

// Rule Rebuts
ruleRebuts
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getRebutsAccess().getGroup()); }
(rule__Rebuts__Group__0)
{ after(grammarAccess.getRebutsAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMitigates
entryRuleMitigates 
:
{ before(grammarAccess.getMitigatesRule()); }
	 ruleMitigates
{ after(grammarAccess.getMitigatesRule()); } 
	 EOF 
;

// Rule Mitigates
ruleMitigates
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMitigatesAccess().getGroup()); }
(rule__Mitigates__Group__0)
{ after(grammarAccess.getMitigatesAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}




rule__ArgumentDiagram__Alternatives_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentDiagramAccess().getNodesAssignment_2_0()); }
(rule__ArgumentDiagram__NodesAssignment_2_0)
{ after(grammarAccess.getArgumentDiagramAccess().getNodesAssignment_2_0()); }
)

    |(
{ before(grammarAccess.getArgumentDiagramAccess().getLinksAssignment_2_1()); }
(rule__ArgumentDiagram__LinksAssignment_2_1)
{ after(grammarAccess.getArgumentDiagramAccess().getLinksAssignment_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeAccess().getArgumentParserRuleCall_0()); }
	ruleArgument
{ after(grammarAccess.getNodeAccess().getArgumentParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getNodeAccess().getClaimParserRuleCall_1()); }
	ruleClaim
{ after(grammarAccess.getNodeAccess().getClaimParserRuleCall_1()); }
)

    |(
{ before(grammarAccess.getNodeAccess().getFactParserRuleCall_2()); }
	ruleFact
{ after(grammarAccess.getNodeAccess().getFactParserRuleCall_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Link__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLinkAccess().getRebutsParserRuleCall_0()); }
	ruleRebuts
{ after(grammarAccess.getLinkAccess().getRebutsParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getLinkAccess().getMitigatesParserRuleCall_1()); }
	ruleMitigates
{ after(grammarAccess.getLinkAccess().getMitigatesParserRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__ArgumentDiagram__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ArgumentDiagram__Group__0__Impl
	rule__ArgumentDiagram__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ArgumentDiagram__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentDiagramAccess().getGroup_0()); }
(rule__ArgumentDiagram__Group_0__0)?
{ after(grammarAccess.getArgumentDiagramAccess().getGroup_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ArgumentDiagram__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ArgumentDiagram__Group__1__Impl
	rule__ArgumentDiagram__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ArgumentDiagram__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentDiagramAccess().getGroup_1()); }
(rule__ArgumentDiagram__Group_1__0)?
{ after(grammarAccess.getArgumentDiagramAccess().getGroup_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ArgumentDiagram__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ArgumentDiagram__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ArgumentDiagram__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentDiagramAccess().getAlternatives_2()); }
(rule__ArgumentDiagram__Alternatives_2)*
{ after(grammarAccess.getArgumentDiagramAccess().getAlternatives_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__ArgumentDiagram__Group_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ArgumentDiagram__Group_0__0__Impl
	rule__ArgumentDiagram__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ArgumentDiagram__Group_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentDiagramAccess().getArgumentKeyword_0_0()); }

	'argument:' 

{ after(grammarAccess.getArgumentDiagramAccess().getArgumentKeyword_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ArgumentDiagram__Group_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ArgumentDiagram__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ArgumentDiagram__Group_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentDiagramAccess().getNameAssignment_0_1()); }
(rule__ArgumentDiagram__NameAssignment_0_1)
{ after(grammarAccess.getArgumentDiagramAccess().getNameAssignment_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__ArgumentDiagram__Group_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ArgumentDiagram__Group_1__0__Impl
	rule__ArgumentDiagram__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ArgumentDiagram__Group_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentDiagramAccess().getForKeyword_1_0()); }

	'for' 

{ after(grammarAccess.getArgumentDiagramAccess().getForKeyword_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ArgumentDiagram__Group_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ArgumentDiagram__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ArgumentDiagram__Group_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentDiagramAccess().getHighlightAssignment_1_1()); }
(rule__ArgumentDiagram__HighlightAssignment_1_1)
{ after(grammarAccess.getArgumentDiagramAccess().getHighlightAssignment_1_1()); }
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
{ before(grammarAccess.getArgumentAccess().getNameAssignment_0()); }
(rule__Argument__NameAssignment_0)
{ after(grammarAccess.getArgumentAccess().getNameAssignment_0()); }
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
{ before(grammarAccess.getArgumentAccess().getAKeyword_1()); }

	'A' 

{ after(grammarAccess.getArgumentAccess().getAKeyword_1()); }
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
{ before(grammarAccess.getArgumentAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getArgumentAccess().getLeftCurlyBracketKeyword_2()); }
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
{ before(grammarAccess.getArgumentAccess().getClaimKeyword_3()); }

	'claim' 

{ after(grammarAccess.getArgumentAccess().getClaimKeyword_3()); }
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
{ before(grammarAccess.getArgumentAccess().getClaimAssignment_4()); }
(rule__Argument__ClaimAssignment_4)
{ after(grammarAccess.getArgumentAccess().getClaimAssignment_4()); }
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
{ before(grammarAccess.getArgumentAccess().getGroup_5()); }
(rule__Argument__Group_5__0)?
{ after(grammarAccess.getArgumentAccess().getGroup_5()); }
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
{ before(grammarAccess.getArgumentAccess().getGroup_6()); }
(rule__Argument__Group_6__0)?
{ after(grammarAccess.getArgumentAccess().getGroup_6()); }
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
{ before(grammarAccess.getArgumentAccess().getRightCurlyBracketKeyword_7()); }

	'}' 

{ after(grammarAccess.getArgumentAccess().getRightCurlyBracketKeyword_7()); }
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
{ before(grammarAccess.getArgumentAccess().getColonKeyword_8()); }
(
	':' 
)?
{ after(grammarAccess.getArgumentAccess().getColonKeyword_8()); }
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
{ before(grammarAccess.getArgumentAccess().getDescriptionAssignment_9()); }
(rule__Argument__DescriptionAssignment_9)?
{ after(grammarAccess.getArgumentAccess().getDescriptionAssignment_9()); }
)

;
finally {
	restoreStackSize(stackSize);
}






















rule__Argument__Group_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Argument__Group_5__0__Impl
	rule__Argument__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__Group_5__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentAccess().getSupportedByKeyword_5_0()); }

	'supported by' 

{ after(grammarAccess.getArgumentAccess().getSupportedByKeyword_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Argument__Group_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Argument__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__Group_5__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentAccess().getGroup_5_1()); }
(rule__Argument__Group_5_1__0)*
{ after(grammarAccess.getArgumentAccess().getGroup_5_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Argument__Group_5_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Argument__Group_5_1__0__Impl
	rule__Argument__Group_5_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__Group_5_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentAccess().getCommaKeyword_5_1_0()); }
(
	',' 
)?
{ after(grammarAccess.getArgumentAccess().getCommaKeyword_5_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Argument__Group_5_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Argument__Group_5_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__Group_5_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentAccess().getGroundsAssignment_5_1_1()); }
(rule__Argument__GroundsAssignment_5_1_1)
{ after(grammarAccess.getArgumentAccess().getGroundsAssignment_5_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Argument__Group_6__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Argument__Group_6__0__Impl
	rule__Argument__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__Group_6__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentAccess().getWarrantedByKeyword_6_0()); }

	'warranted by' 

{ after(grammarAccess.getArgumentAccess().getWarrantedByKeyword_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Argument__Group_6__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Argument__Group_6__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__Group_6__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentAccess().getGroup_6_1()); }
(rule__Argument__Group_6_1__0)*
{ after(grammarAccess.getArgumentAccess().getGroup_6_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Argument__Group_6_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Argument__Group_6_1__0__Impl
	rule__Argument__Group_6_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__Group_6_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentAccess().getCommaKeyword_6_1_0()); }
(
	',' 
)?
{ after(grammarAccess.getArgumentAccess().getCommaKeyword_6_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Argument__Group_6_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Argument__Group_6_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__Group_6_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentAccess().getWarrantsAssignment_6_1_1()); }
(rule__Argument__WarrantsAssignment_6_1_1)
{ after(grammarAccess.getArgumentAccess().getWarrantsAssignment_6_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Fact__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Fact__Group__0__Impl
	rule__Fact__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Fact__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFactAccess().getNameAssignment_0()); }
(rule__Fact__NameAssignment_0)
{ after(grammarAccess.getFactAccess().getNameAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Fact__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Fact__Group__1__Impl
	rule__Fact__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Fact__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFactAccess().getGKeyword_1()); }

	'G' 

{ after(grammarAccess.getFactAccess().getGKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Fact__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Fact__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Fact__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFactAccess().getGroup_2()); }
(rule__Fact__Group_2__0)?
{ after(grammarAccess.getFactAccess().getGroup_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Fact__Group_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Fact__Group_2__0__Impl
	rule__Fact__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Fact__Group_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFactAccess().getColonKeyword_2_0()); }
(
	':' 
)?
{ after(grammarAccess.getFactAccess().getColonKeyword_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Fact__Group_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Fact__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Fact__Group_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFactAccess().getDescriptionAssignment_2_1()); }
(rule__Fact__DescriptionAssignment_2_1)
{ after(grammarAccess.getFactAccess().getDescriptionAssignment_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Claim__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Claim__Group__0__Impl
	rule__Claim__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Claim__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClaimAccess().getNameAssignment_0()); }
(rule__Claim__NameAssignment_0)
{ after(grammarAccess.getClaimAccess().getNameAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Claim__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Claim__Group__1__Impl
	rule__Claim__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Claim__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClaimAccess().getCKeyword_1()); }

	'C' 

{ after(grammarAccess.getClaimAccess().getCKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Claim__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Claim__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Claim__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClaimAccess().getGroup_2()); }
(rule__Claim__Group_2__0)?
{ after(grammarAccess.getClaimAccess().getGroup_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Claim__Group_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Claim__Group_2__0__Impl
	rule__Claim__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Claim__Group_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClaimAccess().getColonKeyword_2_0()); }
(
	':' 
)?
{ after(grammarAccess.getClaimAccess().getColonKeyword_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Claim__Group_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Claim__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Claim__Group_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClaimAccess().getDescriptionAssignment_2_1()); }
(rule__Claim__DescriptionAssignment_2_1)
{ after(grammarAccess.getClaimAccess().getDescriptionAssignment_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Rebuts__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Rebuts__Group__0__Impl
	rule__Rebuts__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Rebuts__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRebutsAccess().getFromAssignment_0()); }
(rule__Rebuts__FromAssignment_0)
{ after(grammarAccess.getRebutsAccess().getFromAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Rebuts__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Rebuts__Group__1__Impl
	rule__Rebuts__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Rebuts__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRebutsAccess().getRebutsKeyword_1()); }

	'rebuts' 

{ after(grammarAccess.getRebutsAccess().getRebutsKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Rebuts__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Rebuts__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Rebuts__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRebutsAccess().getToAssignment_2()); }
(rule__Rebuts__ToAssignment_2)
{ after(grammarAccess.getRebutsAccess().getToAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Mitigates__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Mitigates__Group__0__Impl
	rule__Mitigates__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Mitigates__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMitigatesAccess().getFromAssignment_0()); }
(rule__Mitigates__FromAssignment_0)
{ after(grammarAccess.getMitigatesAccess().getFromAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Mitigates__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Mitigates__Group__1__Impl
	rule__Mitigates__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Mitigates__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMitigatesAccess().getMitigatesKeyword_1()); }

	'mitigates' 

{ after(grammarAccess.getMitigatesAccess().getMitigatesKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Mitigates__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Mitigates__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Mitigates__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMitigatesAccess().getToAssignment_2()); }
(rule__Mitigates__ToAssignment_2)
{ after(grammarAccess.getMitigatesAccess().getToAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}









rule__ArgumentDiagram__NameAssignment_0_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentDiagramAccess().getNameIDTerminalRuleCall_0_1_0()); }
	RULE_ID{ after(grammarAccess.getArgumentDiagramAccess().getNameIDTerminalRuleCall_0_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ArgumentDiagram__HighlightAssignment_1_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentDiagramAccess().getHighlightNodeCrossReference_1_1_0()); }
(
{ before(grammarAccess.getArgumentDiagramAccess().getHighlightNodeIDTerminalRuleCall_1_1_0_1()); }
	RULE_ID{ after(grammarAccess.getArgumentDiagramAccess().getHighlightNodeIDTerminalRuleCall_1_1_0_1()); }
)
{ after(grammarAccess.getArgumentDiagramAccess().getHighlightNodeCrossReference_1_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ArgumentDiagram__NodesAssignment_2_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentDiagramAccess().getNodesNodeParserRuleCall_2_0_0()); }
	ruleNode{ after(grammarAccess.getArgumentDiagramAccess().getNodesNodeParserRuleCall_2_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ArgumentDiagram__LinksAssignment_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentDiagramAccess().getLinksLinkParserRuleCall_2_1_0()); }
	ruleLink{ after(grammarAccess.getArgumentDiagramAccess().getLinksLinkParserRuleCall_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__NameAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentAccess().getNameIDTerminalRuleCall_0_0()); }
	RULE_ID{ after(grammarAccess.getArgumentAccess().getNameIDTerminalRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__ClaimAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentAccess().getClaimClaimParserRuleCall_4_0()); }
	ruleClaim{ after(grammarAccess.getArgumentAccess().getClaimClaimParserRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__GroundsAssignment_5_1_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentAccess().getGroundsFactParserRuleCall_5_1_1_0()); }
	ruleFact{ after(grammarAccess.getArgumentAccess().getGroundsFactParserRuleCall_5_1_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__WarrantsAssignment_6_1_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentAccess().getWarrantsArgumentParserRuleCall_6_1_1_0()); }
	ruleArgument{ after(grammarAccess.getArgumentAccess().getWarrantsArgumentParserRuleCall_6_1_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__DescriptionAssignment_9
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentAccess().getDescriptionSTRINGTerminalRuleCall_9_0()); }
	RULE_STRING{ after(grammarAccess.getArgumentAccess().getDescriptionSTRINGTerminalRuleCall_9_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Fact__NameAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFactAccess().getNameIDTerminalRuleCall_0_0()); }
	RULE_ID{ after(grammarAccess.getFactAccess().getNameIDTerminalRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Fact__DescriptionAssignment_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFactAccess().getDescriptionSTRINGTerminalRuleCall_2_1_0()); }
	RULE_STRING{ after(grammarAccess.getFactAccess().getDescriptionSTRINGTerminalRuleCall_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Claim__NameAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClaimAccess().getNameIDTerminalRuleCall_0_0()); }
	RULE_ID{ after(grammarAccess.getClaimAccess().getNameIDTerminalRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Claim__DescriptionAssignment_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClaimAccess().getDescriptionSTRINGTerminalRuleCall_2_1_0()); }
	RULE_STRING{ after(grammarAccess.getClaimAccess().getDescriptionSTRINGTerminalRuleCall_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Rebuts__FromAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRebutsAccess().getFromArgumentCrossReference_0_0()); }
(
{ before(grammarAccess.getRebutsAccess().getFromArgumentIDTerminalRuleCall_0_0_1()); }
	RULE_ID{ after(grammarAccess.getRebutsAccess().getFromArgumentIDTerminalRuleCall_0_0_1()); }
)
{ after(grammarAccess.getRebutsAccess().getFromArgumentCrossReference_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Rebuts__ToAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRebutsAccess().getToArgumentCrossReference_2_0()); }
(
{ before(grammarAccess.getRebutsAccess().getToArgumentIDTerminalRuleCall_2_0_1()); }
	RULE_ID{ after(grammarAccess.getRebutsAccess().getToArgumentIDTerminalRuleCall_2_0_1()); }
)
{ after(grammarAccess.getRebutsAccess().getToArgumentCrossReference_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Mitigates__FromAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMitigatesAccess().getFromArgumentCrossReference_0_0()); }
(
{ before(grammarAccess.getMitigatesAccess().getFromArgumentIDTerminalRuleCall_0_0_1()); }
	RULE_ID{ after(grammarAccess.getMitigatesAccess().getFromArgumentIDTerminalRuleCall_0_0_1()); }
)
{ after(grammarAccess.getMitigatesAccess().getFromArgumentCrossReference_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Mitigates__ToAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMitigatesAccess().getToArgumentCrossReference_2_0()); }
(
{ before(grammarAccess.getMitigatesAccess().getToArgumentIDTerminalRuleCall_2_0_1()); }
	RULE_ID{ after(grammarAccess.getMitigatesAccess().getToArgumentIDTerminalRuleCall_2_0_1()); }
)
{ after(grammarAccess.getMitigatesAccess().getToArgumentCrossReference_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_ID : ('#' ~('#')+ '#'|'^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*);

RULE_QUALIFIED_NAME : RULE_ID ('.' RULE_ID)*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


