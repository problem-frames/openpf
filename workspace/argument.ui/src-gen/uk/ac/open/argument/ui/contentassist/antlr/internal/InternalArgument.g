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




rule__ArgumentDiagram__Alternatives_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentDiagramAccess().getNodesAssignment_1_0()); }
(rule__ArgumentDiagram__NodesAssignment_1_0)
{ after(grammarAccess.getArgumentDiagramAccess().getNodesAssignment_1_0()); }
)

    |(
{ before(grammarAccess.getArgumentDiagramAccess().getLinksAssignment_1_1()); }
(rule__ArgumentDiagram__LinksAssignment_1_1)
{ after(grammarAccess.getArgumentDiagramAccess().getLinksAssignment_1_1()); }
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
{ before(grammarAccess.getArgumentDiagramAccess().getAlternatives_1()); }
(rule__ArgumentDiagram__Alternatives_1)*
{ after(grammarAccess.getArgumentDiagramAccess().getAlternatives_1()); }
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
{ before(grammarAccess.getArgumentAccess().getColonKeyword_1()); }
(
	':' 
)?
{ after(grammarAccess.getArgumentAccess().getColonKeyword_1()); }
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
{ before(grammarAccess.getArgumentAccess().getDescriptionAssignment_2()); }
(rule__Argument__DescriptionAssignment_2)
{ after(grammarAccess.getArgumentAccess().getDescriptionAssignment_2()); }
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
{ before(grammarAccess.getArgumentAccess().getGroup_3()); }
(rule__Argument__Group_3__0)?
{ after(grammarAccess.getArgumentAccess().getGroup_3()); }
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
{ before(grammarAccess.getArgumentAccess().getExprAssignment_4()); }
(rule__Argument__ExprAssignment_4)?
{ after(grammarAccess.getArgumentAccess().getExprAssignment_4()); }
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
{ before(grammarAccess.getArgumentAccess().getGroup_7()); }
(rule__Argument__Group_7__0)?
{ after(grammarAccess.getArgumentAccess().getGroup_7()); }
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
{ before(grammarAccess.getArgumentAccess().getGroup_8()); }
(rule__Argument__Group_8__0)?
{ after(grammarAccess.getArgumentAccess().getGroup_8()); }
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
{ before(grammarAccess.getArgumentAccess().getGroup_9()); }
(rule__Argument__Group_9__0)?
{ after(grammarAccess.getArgumentAccess().getGroup_9()); }
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
{ before(grammarAccess.getArgumentAccess().getGroup_10()); }
(rule__Argument__Group_10__0)?
{ after(grammarAccess.getArgumentAccess().getGroup_10()); }
)

;
finally {
	restoreStackSize(stackSize);
}
























rule__Argument__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Argument__Group_3__0__Impl
	rule__Argument__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentAccess().getRoundKeyword_3_0()); }

	'round' 

{ after(grammarAccess.getArgumentAccess().getRoundKeyword_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Argument__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Argument__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentAccess().getRoundAssignment_3_1()); }
(rule__Argument__RoundAssignment_3_1)
{ after(grammarAccess.getArgumentAccess().getRoundAssignment_3_1()); }
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
{ before(grammarAccess.getArgumentAccess().getReplacingKeyword_5_0()); }

	'replacing' 

{ after(grammarAccess.getArgumentAccess().getReplacingKeyword_5_0()); }
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
{ before(grammarAccess.getArgumentAccess().getOriginAssignment_5_1()); }
(rule__Argument__OriginAssignment_5_1)
{ after(grammarAccess.getArgumentAccess().getOriginAssignment_5_1()); }
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
{ before(grammarAccess.getArgumentAccess().getForegroundKeyword_6_0()); }

	'foreground' 

{ after(grammarAccess.getArgumentAccess().getForegroundKeyword_6_0()); }
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
{ before(grammarAccess.getArgumentAccess().getForegroundAssignment_6_1()); }
(rule__Argument__ForegroundAssignment_6_1)
{ after(grammarAccess.getArgumentAccess().getForegroundAssignment_6_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Argument__Group_7__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Argument__Group_7__0__Impl
	rule__Argument__Group_7__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__Group_7__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentAccess().getBackgroundKeyword_7_0()); }

	'background' 

{ after(grammarAccess.getArgumentAccess().getBackgroundKeyword_7_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Argument__Group_7__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Argument__Group_7__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__Group_7__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentAccess().getBackgroundAssignment_7_1()); }
(rule__Argument__BackgroundAssignment_7_1)
{ after(grammarAccess.getArgumentAccess().getBackgroundAssignment_7_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Argument__Group_8__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Argument__Group_8__0__Impl
	rule__Argument__Group_8__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__Group_8__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentAccess().getShapeKeyword_8_0()); }

	'shape' 

{ after(grammarAccess.getArgumentAccess().getShapeKeyword_8_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Argument__Group_8__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Argument__Group_8__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__Group_8__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentAccess().getShapeAssignment_8_1()); }
(rule__Argument__ShapeAssignment_8_1)
{ after(grammarAccess.getArgumentAccess().getShapeAssignment_8_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Argument__Group_9__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Argument__Group_9__0__Impl
	rule__Argument__Group_9__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__Group_9__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentAccess().getImageKeyword_9_0()); }

	'image' 

{ after(grammarAccess.getArgumentAccess().getImageKeyword_9_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Argument__Group_9__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Argument__Group_9__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__Group_9__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentAccess().getImageAssignment_9_1()); }
(rule__Argument__ImageAssignment_9_1)
{ after(grammarAccess.getArgumentAccess().getImageAssignment_9_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Argument__Group_10__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Argument__Group_10__0__Impl
	rule__Argument__Group_10__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__Group_10__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentAccess().getLeftCurlyBracketKeyword_10_0()); }

	'{' 

{ after(grammarAccess.getArgumentAccess().getLeftCurlyBracketKeyword_10_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Argument__Group_10__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Argument__Group_10__1__Impl
	rule__Argument__Group_10__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__Group_10__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentAccess().getGroup_10_1()); }
(rule__Argument__Group_10_1__0)?
{ after(grammarAccess.getArgumentAccess().getGroup_10_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Argument__Group_10__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Argument__Group_10__2__Impl
	rule__Argument__Group_10__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__Group_10__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentAccess().getGroup_10_2()); }
(rule__Argument__Group_10_2__0)?
{ after(grammarAccess.getArgumentAccess().getGroup_10_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Argument__Group_10__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Argument__Group_10__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__Group_10__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentAccess().getRightCurlyBracketKeyword_10_3()); }

	'}' 

{ after(grammarAccess.getArgumentAccess().getRightCurlyBracketKeyword_10_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__Argument__Group_10_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Argument__Group_10_1__0__Impl
	rule__Argument__Group_10_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__Group_10_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentAccess().getSupportedByKeyword_10_1_0()); }

	'supported by' 

{ after(grammarAccess.getArgumentAccess().getSupportedByKeyword_10_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Argument__Group_10_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Argument__Group_10_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__Group_10_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentAccess().getGroup_10_1_1()); }
(rule__Argument__Group_10_1_1__0)*
{ after(grammarAccess.getArgumentAccess().getGroup_10_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Argument__Group_10_1_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Argument__Group_10_1_1__0__Impl
	rule__Argument__Group_10_1_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__Group_10_1_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentAccess().getCommaKeyword_10_1_1_0()); }
(
	',' 
)?
{ after(grammarAccess.getArgumentAccess().getCommaKeyword_10_1_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Argument__Group_10_1_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Argument__Group_10_1_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__Group_10_1_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentAccess().getGroundsAssignment_10_1_1_1()); }
(rule__Argument__GroundsAssignment_10_1_1_1)
{ after(grammarAccess.getArgumentAccess().getGroundsAssignment_10_1_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Argument__Group_10_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Argument__Group_10_2__0__Impl
	rule__Argument__Group_10_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__Group_10_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentAccess().getWarrantedByKeyword_10_2_0()); }

	'warranted by' 

{ after(grammarAccess.getArgumentAccess().getWarrantedByKeyword_10_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Argument__Group_10_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Argument__Group_10_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__Group_10_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentAccess().getGroup_10_2_1()); }
(rule__Argument__Group_10_2_1__0)*
{ after(grammarAccess.getArgumentAccess().getGroup_10_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Argument__Group_10_2_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Argument__Group_10_2_1__0__Impl
	rule__Argument__Group_10_2_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__Group_10_2_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentAccess().getCommaKeyword_10_2_1_0()); }
(
	',' 
)?
{ after(grammarAccess.getArgumentAccess().getCommaKeyword_10_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Argument__Group_10_2_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Argument__Group_10_2_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__Group_10_2_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentAccess().getWarrantsAssignment_10_2_1_1()); }
(rule__Argument__WarrantsAssignment_10_2_1_1)
{ after(grammarAccess.getArgumentAccess().getWarrantsAssignment_10_2_1_1()); }
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
{ before(grammarAccess.getRebutsAccess().getRebuttedByKeyword_1()); }

	'rebutted by' 

{ after(grammarAccess.getRebutsAccess().getRebuttedByKeyword_1()); }
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
{ before(grammarAccess.getMitigatesAccess().getMitigatedByKeyword_1()); }

	'mitigated by' 

{ after(grammarAccess.getMitigatesAccess().getMitigatedByKeyword_1()); }
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
	rule__Mitigates__Group__3
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


rule__Mitigates__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Mitigates__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Mitigates__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMitigatesAccess().getGroup_3()); }
(rule__Mitigates__Group_3__0)?
{ after(grammarAccess.getMitigatesAccess().getGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__Mitigates__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Mitigates__Group_3__0__Impl
	rule__Mitigates__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Mitigates__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMitigatesAccess().getForKeyword_3_0()); }

	'for' 

{ after(grammarAccess.getMitigatesAccess().getForKeyword_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Mitigates__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Mitigates__Group_3__1__Impl
	rule__Mitigates__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Mitigates__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMitigatesAccess().getNameAssignment_3_1()); }
(rule__Mitigates__NameAssignment_3_1)?
{ after(grammarAccess.getMitigatesAccess().getNameAssignment_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Mitigates__Group_3__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Mitigates__Group_3__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Mitigates__Group_3__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMitigatesAccess().getRebuttalAssignment_3_2()); }
(rule__Mitigates__RebuttalAssignment_3_2)?
{ after(grammarAccess.getMitigatesAccess().getRebuttalAssignment_3_2()); }
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

rule__ArgumentDiagram__NodesAssignment_1_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentDiagramAccess().getNodesArgumentParserRuleCall_1_0_0()); }
	ruleArgument{ after(grammarAccess.getArgumentDiagramAccess().getNodesArgumentParserRuleCall_1_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ArgumentDiagram__LinksAssignment_1_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentDiagramAccess().getLinksLinkParserRuleCall_1_1_0()); }
	ruleLink{ after(grammarAccess.getArgumentDiagramAccess().getLinksLinkParserRuleCall_1_1_0()); }
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

rule__Argument__DescriptionAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); }
	RULE_STRING{ after(grammarAccess.getArgumentAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__RoundAssignment_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentAccess().getRoundINTTerminalRuleCall_3_1_0()); }
	RULE_INT{ after(grammarAccess.getArgumentAccess().getRoundINTTerminalRuleCall_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__ExprAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentAccess().getExprSTRINGTerminalRuleCall_4_0()); }
	RULE_STRING{ after(grammarAccess.getArgumentAccess().getExprSTRINGTerminalRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__OriginAssignment_5_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentAccess().getOriginArgumentCrossReference_5_1_0()); }
(
{ before(grammarAccess.getArgumentAccess().getOriginArgumentIDTerminalRuleCall_5_1_0_1()); }
	RULE_ID{ after(grammarAccess.getArgumentAccess().getOriginArgumentIDTerminalRuleCall_5_1_0_1()); }
)
{ after(grammarAccess.getArgumentAccess().getOriginArgumentCrossReference_5_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__ForegroundAssignment_6_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentAccess().getForegroundSTRINGTerminalRuleCall_6_1_0()); }
	RULE_STRING{ after(grammarAccess.getArgumentAccess().getForegroundSTRINGTerminalRuleCall_6_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__BackgroundAssignment_7_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentAccess().getBackgroundSTRINGTerminalRuleCall_7_1_0()); }
	RULE_STRING{ after(grammarAccess.getArgumentAccess().getBackgroundSTRINGTerminalRuleCall_7_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__ShapeAssignment_8_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentAccess().getShapeSTRINGTerminalRuleCall_8_1_0()); }
	RULE_STRING{ after(grammarAccess.getArgumentAccess().getShapeSTRINGTerminalRuleCall_8_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__ImageAssignment_9_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentAccess().getImageSTRINGTerminalRuleCall_9_1_0()); }
	RULE_STRING{ after(grammarAccess.getArgumentAccess().getImageSTRINGTerminalRuleCall_9_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__GroundsAssignment_10_1_1_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentAccess().getGroundsArgumentParserRuleCall_10_1_1_1_0()); }
	ruleArgument{ after(grammarAccess.getArgumentAccess().getGroundsArgumentParserRuleCall_10_1_1_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__WarrantsAssignment_10_2_1_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArgumentAccess().getWarrantsArgumentParserRuleCall_10_2_1_1_0()); }
	ruleArgument{ after(grammarAccess.getArgumentAccess().getWarrantsArgumentParserRuleCall_10_2_1_1_0()); }
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

rule__Mitigates__NameAssignment_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMitigatesAccess().getNameSTRINGTerminalRuleCall_3_1_0()); }
	RULE_STRING{ after(grammarAccess.getMitigatesAccess().getNameSTRINGTerminalRuleCall_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Mitigates__RebuttalAssignment_3_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMitigatesAccess().getRebuttalArgumentCrossReference_3_2_0()); }
(
{ before(grammarAccess.getMitigatesAccess().getRebuttalArgumentIDTerminalRuleCall_3_2_0_1()); }
	RULE_ID{ after(grammarAccess.getMitigatesAccess().getRebuttalArgumentIDTerminalRuleCall_3_2_0_1()); }
)
{ after(grammarAccess.getMitigatesAccess().getRebuttalArgumentCrossReference_3_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_INT : ('0'|'1'..'9' ('0'..'9')*);

RULE_BOOLEAN : ('true'|'false');

RULE_ID : ('#' ~('#')+ '#'|'^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*);

RULE_QUALIFIED_NAME : RULE_ID ('.' RULE_ID)*;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


