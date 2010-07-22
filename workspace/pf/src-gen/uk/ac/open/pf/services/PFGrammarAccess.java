/*
* generated by Xtext
*/

package uk.ac.open.pf.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class PFGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class RootDiagramElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "RootDiagram");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cRootDiagramAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameValueTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cCommercialAtKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cCycleKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cLeftParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cLeftParenthesisKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cObjectsAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cObjectsNodeParserRuleCall_6_0 = (RuleCall)cObjectsAssignment_6.eContents().get(0);
		private final Group cGroup_7 = (Group)cGroup.eContents().get(7);
		private final Keyword cCommaKeyword_7_0 = (Keyword)cGroup_7.eContents().get(0);
		private final Assignment cObjectsAssignment_7_1 = (Assignment)cGroup_7.eContents().get(1);
		private final RuleCall cObjectsNodeParserRuleCall_7_1_0 = (RuleCall)cObjectsAssignment_7_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Keyword cRightParenthesisKeyword_9 = (Keyword)cGroup.eContents().get(9);
		
		//RootDiagram:
		//	{RootDiagram} name=Value "@" "cycle" "(" "(" objects+=Node ("," objects+=Node)* ")" ")";
		public ParserRule getRule() { return rule; }

		//{RootDiagram} name=Value "@" "cycle" "(" "(" objects+=Node ("," objects+=Node)* ")" ")"
		public Group getGroup() { return cGroup; }

		//{RootDiagram}
		public Action getRootDiagramAction_0() { return cRootDiagramAction_0; }

		//name=Value
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//Value
		public RuleCall getNameValueTerminalRuleCall_1_0() { return cNameValueTerminalRuleCall_1_0; }

		//"@"
		public Keyword getCommercialAtKeyword_2() { return cCommercialAtKeyword_2; }

		//"cycle"
		public Keyword getCycleKeyword_3() { return cCycleKeyword_3; }

		//"("
		public Keyword getLeftParenthesisKeyword_4() { return cLeftParenthesisKeyword_4; }

		//"("
		public Keyword getLeftParenthesisKeyword_5() { return cLeftParenthesisKeyword_5; }

		//objects+=Node
		public Assignment getObjectsAssignment_6() { return cObjectsAssignment_6; }

		//Node
		public RuleCall getObjectsNodeParserRuleCall_6_0() { return cObjectsNodeParserRuleCall_6_0; }

		//("," objects+=Node)*
		public Group getGroup_7() { return cGroup_7; }

		//","
		public Keyword getCommaKeyword_7_0() { return cCommaKeyword_7_0; }

		//objects+=Node
		public Assignment getObjectsAssignment_7_1() { return cObjectsAssignment_7_1; }

		//Node
		public RuleCall getObjectsNodeParserRuleCall_7_1_0() { return cObjectsNodeParserRuleCall_7_1_0; }

		//")"
		public Keyword getRightParenthesisKeyword_8() { return cRightParenthesisKeyword_8; }

		//")"
		public Keyword getRightParenthesisKeyword_9() { return cRightParenthesisKeyword_9; }
	}

	public class NodeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Node");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameValueTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cCompositeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cCompositeCompositeObjectParserRuleCall_2_0 = (RuleCall)cCompositeAssignment_2.eContents().get(0);
		
		//Node:
		//	name=Value ":=" composite=CompositeObject;
		public ParserRule getRule() { return rule; }

		//name=Value ":=" composite=CompositeObject
		public Group getGroup() { return cGroup; }

		//name=Value
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }

		//Value
		public RuleCall getNameValueTerminalRuleCall_0_0() { return cNameValueTerminalRuleCall_0_0; }

		//":="
		public Keyword getColonEqualsSignKeyword_1() { return cColonEqualsSignKeyword_1; }

		//composite=CompositeObject
		public Assignment getCompositeAssignment_2() { return cCompositeAssignment_2; }

		//CompositeObject
		public RuleCall getCompositeCompositeObjectParserRuleCall_2_0() { return cCompositeCompositeObjectParserRuleCall_2_0; }
	}

	public class CompositeObjectElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "CompositeObject");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cCompositeObjectAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cFieldsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cFieldsFieldParserRuleCall_2_0 = (RuleCall)cFieldsAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cCommaKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cFieldsAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cFieldsFieldParserRuleCall_3_1_0 = (RuleCall)cFieldsAssignment_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//CompositeObject:
		//	{CompositeObject} "{" fields+=Field? ("," fields+=Field)* "}";
		public ParserRule getRule() { return rule; }

		//{CompositeObject} "{" fields+=Field? ("," fields+=Field)* "}"
		public Group getGroup() { return cGroup; }

		//{CompositeObject}
		public Action getCompositeObjectAction_0() { return cCompositeObjectAction_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }

		//fields+=Field?
		public Assignment getFieldsAssignment_2() { return cFieldsAssignment_2; }

		//Field
		public RuleCall getFieldsFieldParserRuleCall_2_0() { return cFieldsFieldParserRuleCall_2_0; }

		//("," fields+=Field)*
		public Group getGroup_3() { return cGroup_3; }

		//","
		public Keyword getCommaKeyword_3_0() { return cCommaKeyword_3_0; }

		//fields+=Field
		public Assignment getFieldsAssignment_3_1() { return cFieldsAssignment_3_1; }

		//Field
		public RuleCall getFieldsFieldParserRuleCall_3_1_0() { return cFieldsFieldParserRuleCall_3_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}

	public class FieldElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Field");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSimpleFieldParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cCompositeFieldParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Field:
		//	SimpleField | CompositeField;
		public ParserRule getRule() { return rule; }

		//SimpleField | CompositeField
		public Alternatives getAlternatives() { return cAlternatives; }

		//SimpleField
		public RuleCall getSimpleFieldParserRuleCall_0() { return cSimpleFieldParserRuleCall_0; }

		//CompositeField
		public RuleCall getCompositeFieldParserRuleCall_1() { return cCompositeFieldParserRuleCall_1; }
	}

	public class SimpleFieldElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "SimpleField");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final Assignment cValueAssignment_2_0 = (Assignment)cAlternatives_2.eContents().get(0);
		private final RuleCall cValueValueTerminalRuleCall_2_0_0 = (RuleCall)cValueAssignment_2_0.eContents().get(0);
		private final Assignment cValueAssignment_2_1 = (Assignment)cAlternatives_2.eContents().get(1);
		private final RuleCall cValueSTRINGTerminalRuleCall_2_1_0 = (RuleCall)cValueAssignment_2_1.eContents().get(0);
		
		//SimpleField:
		//	name=ID ":" (value=Value | value=STRING);
		public ParserRule getRule() { return rule; }

		//name=ID ":" (value=Value | value=STRING)
		public Group getGroup() { return cGroup; }

		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }

		//":"
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }

		//value=Value | value=STRING
		public Alternatives getAlternatives_2() { return cAlternatives_2; }

		//value=Value
		public Assignment getValueAssignment_2_0() { return cValueAssignment_2_0; }

		//Value
		public RuleCall getValueValueTerminalRuleCall_2_0_0() { return cValueValueTerminalRuleCall_2_0_0; }

		//value=STRING
		public Assignment getValueAssignment_2_1() { return cValueAssignment_2_1; }

		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_2_1_0() { return cValueSTRINGTerminalRuleCall_2_1_0; }
	}

	public class CompositeFieldElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "CompositeField");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cValueCompositeObjectParserRuleCall_2_0 = (RuleCall)cValueAssignment_2.eContents().get(0);
		
		//CompositeField:
		//	name=ID ":" value=CompositeObject;
		public ParserRule getRule() { return rule; }

		//name=ID ":" value=CompositeObject
		public Group getGroup() { return cGroup; }

		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }

		//":"
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }

		//value=CompositeObject
		public Assignment getValueAssignment_2() { return cValueAssignment_2; }

		//CompositeObject
		public RuleCall getValueCompositeObjectParserRuleCall_2_0() { return cValueCompositeObjectParserRuleCall_2_0; }
	}
	
	
	private RootDiagramElements pRootDiagram;
	private NodeElements pNode;
	private CompositeObjectElements pCompositeObject;
	private FieldElements pField;
	private SimpleFieldElements pSimpleField;
	private CompositeFieldElements pCompositeField;
	private TerminalRule tValue;
	
	private final GrammarProvider grammarProvider;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public PFGrammarAccess(GrammarProvider grammarProvider,
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

	
	//RootDiagram:
	//	{RootDiagram} name=Value "@" "cycle" "(" "(" objects+=Node ("," objects+=Node)* ")" ")";
	public RootDiagramElements getRootDiagramAccess() {
		return (pRootDiagram != null) ? pRootDiagram : (pRootDiagram = new RootDiagramElements());
	}
	
	public ParserRule getRootDiagramRule() {
		return getRootDiagramAccess().getRule();
	}

	//Node:
	//	name=Value ":=" composite=CompositeObject;
	public NodeElements getNodeAccess() {
		return (pNode != null) ? pNode : (pNode = new NodeElements());
	}
	
	public ParserRule getNodeRule() {
		return getNodeAccess().getRule();
	}

	//CompositeObject:
	//	{CompositeObject} "{" fields+=Field? ("," fields+=Field)* "}";
	public CompositeObjectElements getCompositeObjectAccess() {
		return (pCompositeObject != null) ? pCompositeObject : (pCompositeObject = new CompositeObjectElements());
	}
	
	public ParserRule getCompositeObjectRule() {
		return getCompositeObjectAccess().getRule();
	}

	//Field:
	//	SimpleField | CompositeField;
	public FieldElements getFieldAccess() {
		return (pField != null) ? pField : (pField = new FieldElements());
	}
	
	public ParserRule getFieldRule() {
		return getFieldAccess().getRule();
	}

	//SimpleField:
	//	name=ID ":" (value=Value | value=STRING);
	public SimpleFieldElements getSimpleFieldAccess() {
		return (pSimpleField != null) ? pSimpleField : (pSimpleField = new SimpleFieldElements());
	}
	
	public ParserRule getSimpleFieldRule() {
		return getSimpleFieldAccess().getRule();
	}

	//CompositeField:
	//	name=ID ":" value=CompositeObject;
	public CompositeFieldElements getCompositeFieldAccess() {
		return (pCompositeField != null) ? pCompositeField : (pCompositeField = new CompositeFieldElements());
	}
	
	public ParserRule getCompositeFieldRule() {
		return getCompositeFieldAccess().getRule();
	}

	//terminal Value:
	//	"&" ID;
	public TerminalRule getValueRule() {
		return (tValue != null) ? tValue : (tValue = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "Value"));
	} 

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
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
