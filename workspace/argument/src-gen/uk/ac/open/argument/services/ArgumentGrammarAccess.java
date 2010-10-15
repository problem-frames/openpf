/*
* generated by Xtext
*/

package uk.ac.open.argument.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class ArgumentGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class ArgumentDiagramElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ArgumentDiagram");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cGroup.eContents().get(0);
		private final Keyword cArgumentKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Assignment cNameAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0_1_0 = (RuleCall)cNameAssignment_0_1.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cForKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cHighlightAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final CrossReference cHighlightNodeCrossReference_1_1_0 = (CrossReference)cHighlightAssignment_1_1.eContents().get(0);
		private final RuleCall cHighlightNodeIDTerminalRuleCall_1_1_0_1 = (RuleCall)cHighlightNodeCrossReference_1_1_0.eContents().get(1);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final Assignment cNodesAssignment_2_0 = (Assignment)cAlternatives_2.eContents().get(0);
		private final RuleCall cNodesNodeParserRuleCall_2_0_0 = (RuleCall)cNodesAssignment_2_0.eContents().get(0);
		private final Assignment cLinksAssignment_2_1 = (Assignment)cAlternatives_2.eContents().get(1);
		private final RuleCall cLinksLinkParserRuleCall_2_1_0 = (RuleCall)cLinksAssignment_2_1.eContents().get(0);
		
		//ArgumentDiagram:
		//	("argument:" name=ID)? ("for" highlight=[Node])? (nodes+=Node | links+=Link)*;
		public ParserRule getRule() { return rule; }

		//("argument:" name=ID)? ("for" highlight=[Node])? (nodes+=Node | links+=Link)*
		public Group getGroup() { return cGroup; }

		//("argument:" name=ID)?
		public Group getGroup_0() { return cGroup_0; }

		//"argument:"
		public Keyword getArgumentKeyword_0_0() { return cArgumentKeyword_0_0; }

		//name=ID
		public Assignment getNameAssignment_0_1() { return cNameAssignment_0_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_0_1_0() { return cNameIDTerminalRuleCall_0_1_0; }

		//("for" highlight=[Node])?
		public Group getGroup_1() { return cGroup_1; }

		//"for"
		public Keyword getForKeyword_1_0() { return cForKeyword_1_0; }

		//highlight=[Node]
		public Assignment getHighlightAssignment_1_1() { return cHighlightAssignment_1_1; }

		//[Node]
		public CrossReference getHighlightNodeCrossReference_1_1_0() { return cHighlightNodeCrossReference_1_1_0; }

		//ID
		public RuleCall getHighlightNodeIDTerminalRuleCall_1_1_0_1() { return cHighlightNodeIDTerminalRuleCall_1_1_0_1; }

		//(nodes+=Node | links+=Link)*
		public Alternatives getAlternatives_2() { return cAlternatives_2; }

		//nodes+=Node
		public Assignment getNodesAssignment_2_0() { return cNodesAssignment_2_0; }

		//Node
		public RuleCall getNodesNodeParserRuleCall_2_0_0() { return cNodesNodeParserRuleCall_2_0_0; }

		//links+=Link
		public Assignment getLinksAssignment_2_1() { return cLinksAssignment_2_1; }

		//Link
		public RuleCall getLinksLinkParserRuleCall_2_1_0() { return cLinksLinkParserRuleCall_2_1_0; }
	}

	public class NodeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Node");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cArgumentParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cClaimParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cFactParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//Node:
		//	Argument | Claim | Fact;
		public ParserRule getRule() { return rule; }

		//Argument | Claim | Fact
		public Alternatives getAlternatives() { return cAlternatives; }

		//Argument
		public RuleCall getArgumentParserRuleCall_0() { return cArgumentParserRuleCall_0; }

		//Claim
		public RuleCall getClaimParserRuleCall_1() { return cClaimParserRuleCall_1; }

		//Fact
		public RuleCall getFactParserRuleCall_2() { return cFactParserRuleCall_2; }
	}

	public class ArgumentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Argument");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cAKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cClaimKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cClaimAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cClaimClaimParserRuleCall_4_0 = (RuleCall)cClaimAssignment_4.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cSupportedByKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Group cGroup_5_1 = (Group)cGroup_5.eContents().get(1);
		private final Keyword cCommaKeyword_5_1_0 = (Keyword)cGroup_5_1.eContents().get(0);
		private final Assignment cGroundsAssignment_5_1_1 = (Assignment)cGroup_5_1.eContents().get(1);
		private final RuleCall cGroundsFactParserRuleCall_5_1_1_0 = (RuleCall)cGroundsAssignment_5_1_1.eContents().get(0);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cWarrantedByKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Group cGroup_6_1 = (Group)cGroup_6.eContents().get(1);
		private final Keyword cCommaKeyword_6_1_0 = (Keyword)cGroup_6_1.eContents().get(0);
		private final Assignment cWarrantsAssignment_6_1_1 = (Assignment)cGroup_6_1.eContents().get(1);
		private final RuleCall cWarrantsArgumentParserRuleCall_6_1_1_0 = (RuleCall)cWarrantsAssignment_6_1_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Keyword cColonKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Assignment cDescriptionAssignment_9 = (Assignment)cGroup.eContents().get(9);
		private final RuleCall cDescriptionSTRINGTerminalRuleCall_9_0 = (RuleCall)cDescriptionAssignment_9.eContents().get(0);
		
		//Argument:
		//	name=ID "A" "{" "claim" claim=Claim ("supported by" (","? grounds+=Fact)*)? ("warranted by" (","?
		//	warrants+=Argument)*)? "}" ":"? description=STRING?;
		public ParserRule getRule() { return rule; }

		//name=ID "A" "{" "claim" claim=Claim ("supported by" (","? grounds+=Fact)*)? ("warranted by" (","? warrants+=Argument)*)?
		//"}" ":"? description=STRING?
		public Group getGroup() { return cGroup; }

		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }

		//"A"
		public Keyword getAKeyword_1() { return cAKeyword_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//"claim"
		public Keyword getClaimKeyword_3() { return cClaimKeyword_3; }

		//claim=Claim
		public Assignment getClaimAssignment_4() { return cClaimAssignment_4; }

		//Claim
		public RuleCall getClaimClaimParserRuleCall_4_0() { return cClaimClaimParserRuleCall_4_0; }

		//("supported by" (","? grounds+=Fact)*)?
		public Group getGroup_5() { return cGroup_5; }

		//"supported by"
		public Keyword getSupportedByKeyword_5_0() { return cSupportedByKeyword_5_0; }

		//(","? grounds+=Fact)*
		public Group getGroup_5_1() { return cGroup_5_1; }

		//","?
		public Keyword getCommaKeyword_5_1_0() { return cCommaKeyword_5_1_0; }

		//grounds+=Fact
		public Assignment getGroundsAssignment_5_1_1() { return cGroundsAssignment_5_1_1; }

		//Fact
		public RuleCall getGroundsFactParserRuleCall_5_1_1_0() { return cGroundsFactParserRuleCall_5_1_1_0; }

		//("warranted by" (","? warrants+=Argument)*)?
		public Group getGroup_6() { return cGroup_6; }

		//"warranted by"
		public Keyword getWarrantedByKeyword_6_0() { return cWarrantedByKeyword_6_0; }

		//(","? warrants+=Argument)*
		public Group getGroup_6_1() { return cGroup_6_1; }

		//","?
		public Keyword getCommaKeyword_6_1_0() { return cCommaKeyword_6_1_0; }

		//warrants+=Argument
		public Assignment getWarrantsAssignment_6_1_1() { return cWarrantsAssignment_6_1_1; }

		//Argument
		public RuleCall getWarrantsArgumentParserRuleCall_6_1_1_0() { return cWarrantsArgumentParserRuleCall_6_1_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }

		//":"?
		public Keyword getColonKeyword_8() { return cColonKeyword_8; }

		//description=STRING?
		public Assignment getDescriptionAssignment_9() { return cDescriptionAssignment_9; }

		//STRING
		public RuleCall getDescriptionSTRINGTerminalRuleCall_9_0() { return cDescriptionSTRINGTerminalRuleCall_9_0; }
	}

	public class FactElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Fact");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cGKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cColonKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cDescriptionAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cDescriptionSTRINGTerminalRuleCall_2_1_0 = (RuleCall)cDescriptionAssignment_2_1.eContents().get(0);
		
		//Fact:
		//	name=ID "G" (":"? description=STRING)?;
		public ParserRule getRule() { return rule; }

		//name=ID "G" (":"? description=STRING)?
		public Group getGroup() { return cGroup; }

		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }

		//"G"
		public Keyword getGKeyword_1() { return cGKeyword_1; }

		//(":"? description=STRING)?
		public Group getGroup_2() { return cGroup_2; }

		//":"?
		public Keyword getColonKeyword_2_0() { return cColonKeyword_2_0; }

		//description=STRING
		public Assignment getDescriptionAssignment_2_1() { return cDescriptionAssignment_2_1; }

		//STRING
		public RuleCall getDescriptionSTRINGTerminalRuleCall_2_1_0() { return cDescriptionSTRINGTerminalRuleCall_2_1_0; }
	}

	public class ClaimElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Claim");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cCKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cColonKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cDescriptionAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cDescriptionSTRINGTerminalRuleCall_2_1_0 = (RuleCall)cDescriptionAssignment_2_1.eContents().get(0);
		
		//Claim:
		//	name=ID "C" (":"? description=STRING)?;
		public ParserRule getRule() { return rule; }

		//name=ID "C" (":"? description=STRING)?
		public Group getGroup() { return cGroup; }

		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }

		//"C"
		public Keyword getCKeyword_1() { return cCKeyword_1; }

		//(":"? description=STRING)?
		public Group getGroup_2() { return cGroup_2; }

		//":"?
		public Keyword getColonKeyword_2_0() { return cColonKeyword_2_0; }

		//description=STRING
		public Assignment getDescriptionAssignment_2_1() { return cDescriptionAssignment_2_1; }

		//STRING
		public RuleCall getDescriptionSTRINGTerminalRuleCall_2_1_0() { return cDescriptionSTRINGTerminalRuleCall_2_1_0; }
	}

	public class LinkElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Link");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cRebutsParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cMitigatesParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Link:
		//	Rebuts | Mitigates;
		public ParserRule getRule() { return rule; }

		//Rebuts | Mitigates
		public Alternatives getAlternatives() { return cAlternatives; }

		//Rebuts
		public RuleCall getRebutsParserRuleCall_0() { return cRebutsParserRuleCall_0; }

		//Mitigates
		public RuleCall getMitigatesParserRuleCall_1() { return cMitigatesParserRuleCall_1; }
	}

	public class RebutsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Rebuts");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cFromAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cFromArgumentCrossReference_0_0 = (CrossReference)cFromAssignment_0.eContents().get(0);
		private final RuleCall cFromArgumentIDTerminalRuleCall_0_0_1 = (RuleCall)cFromArgumentCrossReference_0_0.eContents().get(1);
		private final Keyword cRebutsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cToAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cToArgumentCrossReference_2_0 = (CrossReference)cToAssignment_2.eContents().get(0);
		private final RuleCall cToArgumentIDTerminalRuleCall_2_0_1 = (RuleCall)cToArgumentCrossReference_2_0.eContents().get(1);
		
		//Rebuts:
		//	from=[Argument] "rebuts" to=[Argument];
		public ParserRule getRule() { return rule; }

		//from=[Argument] "rebuts" to=[Argument]
		public Group getGroup() { return cGroup; }

		//from=[Argument]
		public Assignment getFromAssignment_0() { return cFromAssignment_0; }

		//[Argument]
		public CrossReference getFromArgumentCrossReference_0_0() { return cFromArgumentCrossReference_0_0; }

		//ID
		public RuleCall getFromArgumentIDTerminalRuleCall_0_0_1() { return cFromArgumentIDTerminalRuleCall_0_0_1; }

		//"rebuts"
		public Keyword getRebutsKeyword_1() { return cRebutsKeyword_1; }

		//to=[Argument]
		public Assignment getToAssignment_2() { return cToAssignment_2; }

		//[Argument]
		public CrossReference getToArgumentCrossReference_2_0() { return cToArgumentCrossReference_2_0; }

		//ID
		public RuleCall getToArgumentIDTerminalRuleCall_2_0_1() { return cToArgumentIDTerminalRuleCall_2_0_1; }
	}

	public class MitigatesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Mitigates");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cFromAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cFromArgumentCrossReference_0_0 = (CrossReference)cFromAssignment_0.eContents().get(0);
		private final RuleCall cFromArgumentIDTerminalRuleCall_0_0_1 = (RuleCall)cFromArgumentCrossReference_0_0.eContents().get(1);
		private final Keyword cMitigatesKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cToAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cToArgumentCrossReference_2_0 = (CrossReference)cToAssignment_2.eContents().get(0);
		private final RuleCall cToArgumentIDTerminalRuleCall_2_0_1 = (RuleCall)cToArgumentCrossReference_2_0.eContents().get(1);
		
		//Mitigates:
		//	from=[Argument] "mitigates" to=[Argument];
		public ParserRule getRule() { return rule; }

		//from=[Argument] "mitigates" to=[Argument]
		public Group getGroup() { return cGroup; }

		//from=[Argument]
		public Assignment getFromAssignment_0() { return cFromAssignment_0; }

		//[Argument]
		public CrossReference getFromArgumentCrossReference_0_0() { return cFromArgumentCrossReference_0_0; }

		//ID
		public RuleCall getFromArgumentIDTerminalRuleCall_0_0_1() { return cFromArgumentIDTerminalRuleCall_0_0_1; }

		//"mitigates"
		public Keyword getMitigatesKeyword_1() { return cMitigatesKeyword_1; }

		//to=[Argument]
		public Assignment getToAssignment_2() { return cToAssignment_2; }

		//[Argument]
		public CrossReference getToArgumentCrossReference_2_0() { return cToArgumentCrossReference_2_0; }

		//ID
		public RuleCall getToArgumentIDTerminalRuleCall_2_0_1() { return cToArgumentIDTerminalRuleCall_2_0_1; }
	}
	
	
	private ArgumentDiagramElements pArgumentDiagram;
	private NodeElements pNode;
	private ArgumentElements pArgument;
	private FactElements pFact;
	private ClaimElements pClaim;
	private LinkElements pLink;
	private RebutsElements pRebuts;
	private MitigatesElements pMitigates;
	private TerminalRule tID;
	private TerminalRule tQUALIFIED_NAME;
	
	private final GrammarProvider grammarProvider;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public ArgumentGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammarProvider = grammarProvider;
		this.gaTerminals = gaTerminals;
	}
	
	public Grammar getGrammar() {	
		return grammarProvider.getGrammar(this);
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//ArgumentDiagram:
	//	("argument:" name=ID)? ("for" highlight=[Node])? (nodes+=Node | links+=Link)*;
	public ArgumentDiagramElements getArgumentDiagramAccess() {
		return (pArgumentDiagram != null) ? pArgumentDiagram : (pArgumentDiagram = new ArgumentDiagramElements());
	}
	
	public ParserRule getArgumentDiagramRule() {
		return getArgumentDiagramAccess().getRule();
	}

	//Node:
	//	Argument | Claim | Fact;
	public NodeElements getNodeAccess() {
		return (pNode != null) ? pNode : (pNode = new NodeElements());
	}
	
	public ParserRule getNodeRule() {
		return getNodeAccess().getRule();
	}

	//Argument:
	//	name=ID "A" "{" "claim" claim=Claim ("supported by" (","? grounds+=Fact)*)? ("warranted by" (","?
	//	warrants+=Argument)*)? "}" ":"? description=STRING?;
	public ArgumentElements getArgumentAccess() {
		return (pArgument != null) ? pArgument : (pArgument = new ArgumentElements());
	}
	
	public ParserRule getArgumentRule() {
		return getArgumentAccess().getRule();
	}

	//Fact:
	//	name=ID "G" (":"? description=STRING)?;
	public FactElements getFactAccess() {
		return (pFact != null) ? pFact : (pFact = new FactElements());
	}
	
	public ParserRule getFactRule() {
		return getFactAccess().getRule();
	}

	//Claim:
	//	name=ID "C" (":"? description=STRING)?;
	public ClaimElements getClaimAccess() {
		return (pClaim != null) ? pClaim : (pClaim = new ClaimElements());
	}
	
	public ParserRule getClaimRule() {
		return getClaimAccess().getRule();
	}

	//Link:
	//	Rebuts | Mitigates;
	public LinkElements getLinkAccess() {
		return (pLink != null) ? pLink : (pLink = new LinkElements());
	}
	
	public ParserRule getLinkRule() {
		return getLinkAccess().getRule();
	}

	//Rebuts:
	//	from=[Argument] "rebuts" to=[Argument];
	public RebutsElements getRebutsAccess() {
		return (pRebuts != null) ? pRebuts : (pRebuts = new RebutsElements());
	}
	
	public ParserRule getRebutsRule() {
		return getRebutsAccess().getRule();
	}

	//Mitigates:
	//	from=[Argument] "mitigates" to=[Argument];
	public MitigatesElements getMitigatesAccess() {
		return (pMitigates != null) ? pMitigates : (pMitigates = new MitigatesElements());
	}
	
	public ParserRule getMitigatesRule() {
		return getMitigatesAccess().getRule();
	}

	//terminal ID:
	//	"#" !"#"+ "#" | "^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return (tID != null) ? tID : (tID = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "ID"));
	} 

	//terminal QUALIFIED_NAME:
	//	ID ("." ID)*;
	public TerminalRule getQUALIFIED_NAMERule() {
		return (tQUALIFIED_NAME != null) ? tQUALIFIED_NAME : (tQUALIFIED_NAME = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "QUALIFIED_NAME"));
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" | "n" |
	//	"f" | "r" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}