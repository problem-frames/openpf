/*
* generated by Xtext
*/

package uk.ac.open.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import org.eclipse.xtext.*;

import org.eclipse.xtext.service.GrammarProvider;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class ProblemGrammarAccess implements IGrammarAccess {
	
	
	public class ProblemDiagramElements implements IParserRuleAccess {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ProblemDiagram");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cProblemKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Alternatives cAlternatives_3 = (Alternatives)cGroup.eContents().get(3);
		private final Assignment cNodesAssignment_3_0 = (Assignment)cAlternatives_3.eContents().get(0);
		private final RuleCall cNodesNodeParserRuleCall_3_0_0 = (RuleCall)cNodesAssignment_3_0.eContents().get(0);
		private final Assignment cLinksAssignment_3_1 = (Assignment)cAlternatives_3.eContents().get(1);
		private final RuleCall cLinksLinkParserRuleCall_3_1_0 = (RuleCall)cLinksAssignment_3_1.eContents().get(0);
		
		//ProblemDiagram:
		//  "problem" ":" name=STRING (nodes+=Node|links+=Link)*;
		public ParserRule getRule() { return rule; }

		//"problem" ":" name=STRING (nodes+=Node|links+=Link)*
		public Group getGroup() { return cGroup; }

		//"problem"
		public Keyword getProblemKeyword_0() { return cProblemKeyword_0; }

		//":"
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }

		//name=STRING
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }

		//(nodes+=Node|links+=Link)*
		public Alternatives getAlternatives_3() { return cAlternatives_3; }

		//nodes+=Node
		public Assignment getNodesAssignment_3_0() { return cNodesAssignment_3_0; }

		//Node
		public RuleCall getNodesNodeParserRuleCall_3_0_0() { return cNodesNodeParserRuleCall_3_0_0; }

		//links+=Link
		public Assignment getLinksAssignment_3_1() { return cLinksAssignment_3_1; }

		//Link
		public RuleCall getLinksLinkParserRuleCall_3_1_0() { return cLinksLinkParserRuleCall_3_1_0; }
	}

	public class NodeElements implements IParserRuleAccess {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Node");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Assignment cTypeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTypeNodeTypeEnumRuleCall_1_0 = (RuleCall)cTypeAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cColonKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cDescriptionAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cDescriptionSTRINGTerminalRuleCall_2_1_0 = (RuleCall)cDescriptionAssignment_2_1.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cLeftCurlyBracketKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Group cGroup_3_1 = (Group)cGroup_3.eContents().get(1);
		private final Assignment cHiddenPhenomenaAssignment_3_1_0 = (Assignment)cGroup_3_1.eContents().get(0);
		private final RuleCall cHiddenPhenomenaPhenomenonParserRuleCall_3_1_0_0 = (RuleCall)cHiddenPhenomenaAssignment_3_1_0.eContents().get(0);
		private final Group cGroup_3_1_1 = (Group)cGroup_3_1.eContents().get(1);
		private final Keyword cCommaKeyword_3_1_1_0 = (Keyword)cGroup_3_1_1.eContents().get(0);
		private final Assignment cHiddenPhenomenaAssignment_3_1_1_1 = (Assignment)cGroup_3_1_1.eContents().get(1);
		private final RuleCall cHiddenPhenomenaPhenomenonParserRuleCall_3_1_1_1_0 = (RuleCall)cHiddenPhenomenaAssignment_3_1_1_1.eContents().get(0);
		private final Alternatives cAlternatives_3_2 = (Alternatives)cGroup_3.eContents().get(2);
		private final Assignment cSubproblemAssignment_3_2_0 = (Assignment)cAlternatives_3_2.eContents().get(0);
		private final RuleCall cSubproblemProblemDiagramParserRuleCall_3_2_0_0 = (RuleCall)cSubproblemAssignment_3_2_0.eContents().get(0);
		private final Group cGroup_3_2_1 = (Group)cAlternatives_3_2.eContents().get(1);
		private final Keyword cSeeKeyword_3_2_1_0 = (Keyword)cGroup_3_2_1.eContents().get(0);
		private final Keyword cDomainKeyword_3_2_1_1 = (Keyword)cGroup_3_2_1.eContents().get(1);
		private final Assignment cProblemNodeRefAssignment_3_2_1_2 = (Assignment)cGroup_3_2_1.eContents().get(2);
		private final CrossReference cProblemNodeRefNodeCrossReference_3_2_1_2_0 = (CrossReference)cProblemNodeRefAssignment_3_2_1_2.eContents().get(0);
		private final RuleCall cProblemNodeRefNodeIDTerminalRuleCall_3_2_1_2_0_1 = (RuleCall)cProblemNodeRefNodeCrossReference_3_2_1_2_0.eContents().get(1);
		private final Group cGroup_3_2_2 = (Group)cAlternatives_3_2.eContents().get(2);
		private final Keyword cSeeKeyword_3_2_2_0 = (Keyword)cGroup_3_2_2.eContents().get(0);
		private final Keyword cProblemKeyword_3_2_2_1 = (Keyword)cGroup_3_2_2.eContents().get(1);
		private final Assignment cProblemRefAssignment_3_2_2_2 = (Assignment)cGroup_3_2_2.eContents().get(2);
		private final CrossReference cProblemRefProblemDiagramCrossReference_3_2_2_2_0 = (CrossReference)cProblemRefAssignment_3_2_2_2.eContents().get(0);
		private final RuleCall cProblemRefProblemDiagramIDTerminalRuleCall_3_2_2_2_0_1 = (RuleCall)cProblemRefProblemDiagramCrossReference_3_2_2_2_0.eContents().get(1);
		private final Group cGroup_3_2_3 = (Group)cAlternatives_3_2.eContents().get(3);
		private final Keyword cSeeKeyword_3_2_3_0 = (Keyword)cGroup_3_2_3.eContents().get(0);
		private final Assignment cHrefAssignment_3_2_3_1 = (Assignment)cGroup_3_2_3.eContents().get(1);
		private final RuleCall cHrefSTRINGTerminalRuleCall_3_2_3_1_0 = (RuleCall)cHrefAssignment_3_2_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3_3 = (Keyword)cGroup_3.eContents().get(3);
		
		//Node:
		//  name=ID type=NodeType? (":" description=STRING)? ("{" (hiddenPhenomena+=Phenomenon (
		//  "," hiddenPhenomena+=Phenomenon)*)? (subproblem+=ProblemDiagram|"see" "domain"
		//  problemNodeRef+=[Node]|"see" "problem" problemRef+=[ProblemDiagram]|"see" href+=
		//  STRING)* "}")?;
		public ParserRule getRule() { return rule; }

		//name=ID type=NodeType? (":" description=STRING)? ("{" (hiddenPhenomena+=Phenomenon (
		//"," hiddenPhenomena+=Phenomenon)*)? (subproblem+=ProblemDiagram|"see" "domain"
		//problemNodeRef+=[Node]|"see" "problem" problemRef+=[ProblemDiagram]|"see" href+=
		//STRING)* "}")?
		public Group getGroup() { return cGroup; }

		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }

		//type=NodeType?
		public Assignment getTypeAssignment_1() { return cTypeAssignment_1; }

		//NodeType
		public RuleCall getTypeNodeTypeEnumRuleCall_1_0() { return cTypeNodeTypeEnumRuleCall_1_0; }

		//(":" description=STRING)?
		public Group getGroup_2() { return cGroup_2; }

		//":"
		public Keyword getColonKeyword_2_0() { return cColonKeyword_2_0; }

		//description=STRING
		public Assignment getDescriptionAssignment_2_1() { return cDescriptionAssignment_2_1; }

		//STRING
		public RuleCall getDescriptionSTRINGTerminalRuleCall_2_1_0() { return cDescriptionSTRINGTerminalRuleCall_2_1_0; }

		//("{" (hiddenPhenomena+=Phenomenon ("," hiddenPhenomena+=Phenomenon)*)? (subproblem+=
		//ProblemDiagram|"see" "domain" problemNodeRef+=[Node]|"see" "problem" problemRef+=[
		//ProblemDiagram]|"see" href+=STRING)* "}")?
		public Group getGroup_3() { return cGroup_3; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_3_0() { return cLeftCurlyBracketKeyword_3_0; }

		//(hiddenPhenomena+=Phenomenon ("," hiddenPhenomena+=Phenomenon)*)?
		public Group getGroup_3_1() { return cGroup_3_1; }

		//hiddenPhenomena+=Phenomenon
		public Assignment getHiddenPhenomenaAssignment_3_1_0() { return cHiddenPhenomenaAssignment_3_1_0; }

		//Phenomenon
		public RuleCall getHiddenPhenomenaPhenomenonParserRuleCall_3_1_0_0() { return cHiddenPhenomenaPhenomenonParserRuleCall_3_1_0_0; }

		//("," hiddenPhenomena+=Phenomenon)*
		public Group getGroup_3_1_1() { return cGroup_3_1_1; }

		//","
		public Keyword getCommaKeyword_3_1_1_0() { return cCommaKeyword_3_1_1_0; }

		//hiddenPhenomena+=Phenomenon
		public Assignment getHiddenPhenomenaAssignment_3_1_1_1() { return cHiddenPhenomenaAssignment_3_1_1_1; }

		//Phenomenon
		public RuleCall getHiddenPhenomenaPhenomenonParserRuleCall_3_1_1_1_0() { return cHiddenPhenomenaPhenomenonParserRuleCall_3_1_1_1_0; }

		//(subproblem+=ProblemDiagram|"see" "domain" problemNodeRef+=[Node]|"see" "problem"
		//problemRef+=[ProblemDiagram]|"see" href+=STRING)*
		public Alternatives getAlternatives_3_2() { return cAlternatives_3_2; }

		//subproblem+=ProblemDiagram
		public Assignment getSubproblemAssignment_3_2_0() { return cSubproblemAssignment_3_2_0; }

		//ProblemDiagram
		public RuleCall getSubproblemProblemDiagramParserRuleCall_3_2_0_0() { return cSubproblemProblemDiagramParserRuleCall_3_2_0_0; }

		//"see" "domain" problemNodeRef+=[Node]
		public Group getGroup_3_2_1() { return cGroup_3_2_1; }

		//"see"
		public Keyword getSeeKeyword_3_2_1_0() { return cSeeKeyword_3_2_1_0; }

		//"domain"
		public Keyword getDomainKeyword_3_2_1_1() { return cDomainKeyword_3_2_1_1; }

		//problemNodeRef+=[Node]
		public Assignment getProblemNodeRefAssignment_3_2_1_2() { return cProblemNodeRefAssignment_3_2_1_2; }

		//[Node]
		public CrossReference getProblemNodeRefNodeCrossReference_3_2_1_2_0() { return cProblemNodeRefNodeCrossReference_3_2_1_2_0; }

		//ID
		public RuleCall getProblemNodeRefNodeIDTerminalRuleCall_3_2_1_2_0_1() { return cProblemNodeRefNodeIDTerminalRuleCall_3_2_1_2_0_1; }

		//"see" "problem" problemRef+=[ProblemDiagram]
		public Group getGroup_3_2_2() { return cGroup_3_2_2; }

		//"see"
		public Keyword getSeeKeyword_3_2_2_0() { return cSeeKeyword_3_2_2_0; }

		//"problem"
		public Keyword getProblemKeyword_3_2_2_1() { return cProblemKeyword_3_2_2_1; }

		//problemRef+=[ProblemDiagram]
		public Assignment getProblemRefAssignment_3_2_2_2() { return cProblemRefAssignment_3_2_2_2; }

		//[ProblemDiagram]
		public CrossReference getProblemRefProblemDiagramCrossReference_3_2_2_2_0() { return cProblemRefProblemDiagramCrossReference_3_2_2_2_0; }

		//ID
		public RuleCall getProblemRefProblemDiagramIDTerminalRuleCall_3_2_2_2_0_1() { return cProblemRefProblemDiagramIDTerminalRuleCall_3_2_2_2_0_1; }

		//"see" href+=STRING
		public Group getGroup_3_2_3() { return cGroup_3_2_3; }

		//"see"
		public Keyword getSeeKeyword_3_2_3_0() { return cSeeKeyword_3_2_3_0; }

		//href+=STRING
		public Assignment getHrefAssignment_3_2_3_1() { return cHrefAssignment_3_2_3_1; }

		//STRING
		public RuleCall getHrefSTRINGTerminalRuleCall_3_2_3_1_0() { return cHrefSTRINGTerminalRuleCall_3_2_3_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_3_3() { return cRightCurlyBracketKeyword_3_3; }
	}

	public class PhenomenonElements implements IParserRuleAccess {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Phenomenon");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cTypeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cTypePhenomenonTypeEnumRuleCall_0_0 = (RuleCall)cTypeAssignment_0.eContents().get(0);
		private final Assignment cIsControlledAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Keyword cIsControlledExclamationMarkKeyword_1_0 = (Keyword)cIsControlledAssignment_1.eContents().get(0);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cColonKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cDescriptionAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cDescriptionSTRINGTerminalRuleCall_3_1_0 = (RuleCall)cDescriptionAssignment_3_1.eContents().get(0);
		
		//Phenomenon:
		//  type=PhenomenonType? isControlled?="!"? name=ID (":" description=STRING)?;
		public ParserRule getRule() { return rule; }

		//type=PhenomenonType? isControlled?="!"? name=ID (":" description=STRING)?
		public Group getGroup() { return cGroup; }

		//type=PhenomenonType?
		public Assignment getTypeAssignment_0() { return cTypeAssignment_0; }

		//PhenomenonType
		public RuleCall getTypePhenomenonTypeEnumRuleCall_0_0() { return cTypePhenomenonTypeEnumRuleCall_0_0; }

		//isControlled?="!"?
		public Assignment getIsControlledAssignment_1() { return cIsControlledAssignment_1; }

		//"!"
		public Keyword getIsControlledExclamationMarkKeyword_1_0() { return cIsControlledExclamationMarkKeyword_1_0; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//(":" description=STRING)?
		public Group getGroup_3() { return cGroup_3; }

		//":"
		public Keyword getColonKeyword_3_0() { return cColonKeyword_3_0; }

		//description=STRING
		public Assignment getDescriptionAssignment_3_1() { return cDescriptionAssignment_3_1; }

		//STRING
		public RuleCall getDescriptionSTRINGTerminalRuleCall_3_1_0() { return cDescriptionSTRINGTerminalRuleCall_3_1_0; }
	}

	public class LinkElements implements IParserRuleAccess {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Link");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cFromAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cFromNodeCrossReference_0_0 = (CrossReference)cFromAssignment_0.eContents().get(0);
		private final RuleCall cFromNodeIDTerminalRuleCall_0_0_1 = (RuleCall)cFromNodeCrossReference_0_0.eContents().get(1);
		private final Assignment cTypeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTypeLinkTypeEnumRuleCall_1_0 = (RuleCall)cTypeAssignment_1.eContents().get(0);
		private final Assignment cToAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cToNodeCrossReference_2_0 = (CrossReference)cToAssignment_2.eContents().get(0);
		private final RuleCall cToNodeIDTerminalRuleCall_2_0_1 = (RuleCall)cToNodeCrossReference_2_0.eContents().get(1);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cLeftCurlyBracketKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cPhenomenaAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cPhenomenaPhenomenonParserRuleCall_3_1_0 = (RuleCall)cPhenomenaAssignment_3_1.eContents().get(0);
		private final Group cGroup_3_2 = (Group)cGroup_3.eContents().get(2);
		private final Keyword cCommaKeyword_3_2_0 = (Keyword)cGroup_3_2.eContents().get(0);
		private final Assignment cPhenomenaAssignment_3_2_1 = (Assignment)cGroup_3_2.eContents().get(1);
		private final RuleCall cPhenomenaPhenomenonParserRuleCall_3_2_1_0 = (RuleCall)cPhenomenaAssignment_3_2_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3_3 = (Keyword)cGroup_3.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cColonKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cDescriptionAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cDescriptionSTRINGTerminalRuleCall_4_1_0 = (RuleCall)cDescriptionAssignment_4_1.eContents().get(0);
		
		//Link:
		//  from=[Node] type=LinkType to=[Node] ("{" phenomena+=Phenomenon ("," phenomena+=
		//  Phenomenon)* "}")? (":" description=STRING)?;
		public ParserRule getRule() { return rule; }

		//from=[Node] type=LinkType to=[Node] ("{" phenomena+=Phenomenon ("," phenomena+=
		//Phenomenon)* "}")? (":" description=STRING)?
		public Group getGroup() { return cGroup; }

		//from=[Node]
		public Assignment getFromAssignment_0() { return cFromAssignment_0; }

		//[Node]
		public CrossReference getFromNodeCrossReference_0_0() { return cFromNodeCrossReference_0_0; }

		//ID
		public RuleCall getFromNodeIDTerminalRuleCall_0_0_1() { return cFromNodeIDTerminalRuleCall_0_0_1; }

		//type=LinkType
		public Assignment getTypeAssignment_1() { return cTypeAssignment_1; }

		//LinkType
		public RuleCall getTypeLinkTypeEnumRuleCall_1_0() { return cTypeLinkTypeEnumRuleCall_1_0; }

		//to=[Node]
		public Assignment getToAssignment_2() { return cToAssignment_2; }

		//[Node]
		public CrossReference getToNodeCrossReference_2_0() { return cToNodeCrossReference_2_0; }

		//ID
		public RuleCall getToNodeIDTerminalRuleCall_2_0_1() { return cToNodeIDTerminalRuleCall_2_0_1; }

		//("{" phenomena+=Phenomenon ("," phenomena+=Phenomenon)* "}")?
		public Group getGroup_3() { return cGroup_3; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_3_0() { return cLeftCurlyBracketKeyword_3_0; }

		//phenomena+=Phenomenon
		public Assignment getPhenomenaAssignment_3_1() { return cPhenomenaAssignment_3_1; }

		//Phenomenon
		public RuleCall getPhenomenaPhenomenonParserRuleCall_3_1_0() { return cPhenomenaPhenomenonParserRuleCall_3_1_0; }

		//("," phenomena+=Phenomenon)*
		public Group getGroup_3_2() { return cGroup_3_2; }

		//","
		public Keyword getCommaKeyword_3_2_0() { return cCommaKeyword_3_2_0; }

		//phenomena+=Phenomenon
		public Assignment getPhenomenaAssignment_3_2_1() { return cPhenomenaAssignment_3_2_1; }

		//Phenomenon
		public RuleCall getPhenomenaPhenomenonParserRuleCall_3_2_1_0() { return cPhenomenaPhenomenonParserRuleCall_3_2_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_3_3() { return cRightCurlyBracketKeyword_3_3; }

		//(":" description=STRING)?
		public Group getGroup_4() { return cGroup_4; }

		//":"
		public Keyword getColonKeyword_4_0() { return cColonKeyword_4_0; }

		//description=STRING
		public Assignment getDescriptionAssignment_4_1() { return cDescriptionAssignment_4_1; }

		//STRING
		public RuleCall getDescriptionSTRINGTerminalRuleCall_4_1_0() { return cDescriptionSTRINGTerminalRuleCall_4_1_0; }
	}
	
	
	public class NodeTypeElements implements IEnumRuleAccess {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "NodeType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cREQUIREMENTEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cREQUIREMENTRKeyword_0_0 = (Keyword)cREQUIREMENTEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cMACHINEEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cMACHINEMKeyword_1_0 = (Keyword)cMACHINEEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cBIDDABLEEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cBIDDABLEBKeyword_2_0 = (Keyword)cBIDDABLEEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cLEXICALEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cLEXICALXKeyword_3_0 = (Keyword)cLEXICALEnumLiteralDeclaration_3.eContents().get(0);
		private final EnumLiteralDeclaration cCAUSALEnumLiteralDeclaration_4 = (EnumLiteralDeclaration)cAlternatives.eContents().get(4);
		private final Keyword cCAUSALCKeyword_4_0 = (Keyword)cCAUSALEnumLiteralDeclaration_4.eContents().get(0);
		private final EnumLiteralDeclaration cDESIGNEDEnumLiteralDeclaration_5 = (EnumLiteralDeclaration)cAlternatives.eContents().get(5);
		private final Keyword cDESIGNEDDKeyword_5_0 = (Keyword)cDESIGNEDEnumLiteralDeclaration_5.eContents().get(0);
		private final EnumLiteralDeclaration cPHYSICALEnumLiteralDeclaration_6 = (EnumLiteralDeclaration)cAlternatives.eContents().get(6);
		private final Keyword cPHYSICALPKeyword_6_0 = (Keyword)cPHYSICALEnumLiteralDeclaration_6.eContents().get(0);
		
		//enum NodeType:
		//  REQUIREMENT="R" | MACHINE="M" | BIDDABLE="B" | LEXICAL="X" | CAUSAL="C" | DESIGNED="D" |
		//  PHYSICAL="P";
		public EnumRule getRule() { return rule; }

		//REQUIREMENT="R" | MACHINE="M" | BIDDABLE="B" | LEXICAL="X" | CAUSAL="C" | DESIGNED="D" |
		//PHYSICAL="P"
		public Alternatives getAlternatives() { return cAlternatives; }

		//REQUIREMENT="R"
		public EnumLiteralDeclaration getREQUIREMENTEnumLiteralDeclaration_0() { return cREQUIREMENTEnumLiteralDeclaration_0; }

		//"R"
		public Keyword getREQUIREMENTRKeyword_0_0() { return cREQUIREMENTRKeyword_0_0; }

		//MACHINE="M"
		public EnumLiteralDeclaration getMACHINEEnumLiteralDeclaration_1() { return cMACHINEEnumLiteralDeclaration_1; }

		//"M"
		public Keyword getMACHINEMKeyword_1_0() { return cMACHINEMKeyword_1_0; }

		//BIDDABLE="B"
		public EnumLiteralDeclaration getBIDDABLEEnumLiteralDeclaration_2() { return cBIDDABLEEnumLiteralDeclaration_2; }

		//"B"
		public Keyword getBIDDABLEBKeyword_2_0() { return cBIDDABLEBKeyword_2_0; }

		//LEXICAL="X"
		public EnumLiteralDeclaration getLEXICALEnumLiteralDeclaration_3() { return cLEXICALEnumLiteralDeclaration_3; }

		//"X"
		public Keyword getLEXICALXKeyword_3_0() { return cLEXICALXKeyword_3_0; }

		//CAUSAL="C"
		public EnumLiteralDeclaration getCAUSALEnumLiteralDeclaration_4() { return cCAUSALEnumLiteralDeclaration_4; }

		//"C"
		public Keyword getCAUSALCKeyword_4_0() { return cCAUSALCKeyword_4_0; }

		//DESIGNED="D"
		public EnumLiteralDeclaration getDESIGNEDEnumLiteralDeclaration_5() { return cDESIGNEDEnumLiteralDeclaration_5; }

		//"D"
		public Keyword getDESIGNEDDKeyword_5_0() { return cDESIGNEDDKeyword_5_0; }

		//PHYSICAL="P"
		public EnumLiteralDeclaration getPHYSICALEnumLiteralDeclaration_6() { return cPHYSICALEnumLiteralDeclaration_6; }

		//"P"
		public Keyword getPHYSICALPKeyword_6_0() { return cPHYSICALPKeyword_6_0; }
	}

	public class PhenomenonTypeElements implements IEnumRuleAccess {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "PhenomenonType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cUNSPECIFIEDEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cUNSPECIFIEDPhenomenonKeyword_0_0 = (Keyword)cUNSPECIFIEDEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cEVENTEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cEVENTEventKeyword_1_0 = (Keyword)cEVENTEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cSTATEEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cSTATEStateKeyword_2_0 = (Keyword)cSTATEEnumLiteralDeclaration_2.eContents().get(0);
		
		//enum PhenomenonType:
		//  UNSPECIFIED="phenomenon" | EVENT="event" | STATE="state";
		public EnumRule getRule() { return rule; }

		//UNSPECIFIED="phenomenon" | EVENT="event" | STATE="state"
		public Alternatives getAlternatives() { return cAlternatives; }

		//UNSPECIFIED="phenomenon"
		public EnumLiteralDeclaration getUNSPECIFIEDEnumLiteralDeclaration_0() { return cUNSPECIFIEDEnumLiteralDeclaration_0; }

		//"phenomenon"
		public Keyword getUNSPECIFIEDPhenomenonKeyword_0_0() { return cUNSPECIFIEDPhenomenonKeyword_0_0; }

		//EVENT="event"
		public EnumLiteralDeclaration getEVENTEnumLiteralDeclaration_1() { return cEVENTEnumLiteralDeclaration_1; }

		//"event"
		public Keyword getEVENTEventKeyword_1_0() { return cEVENTEventKeyword_1_0; }

		//STATE="state"
		public EnumLiteralDeclaration getSTATEEnumLiteralDeclaration_2() { return cSTATEEnumLiteralDeclaration_2; }

		//"state"
		public Keyword getSTATEStateKeyword_2_0() { return cSTATEStateKeyword_2_0; }
	}

	public class LinkTypeElements implements IEnumRuleAccess {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "LinkType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cINTERFACEEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cINTERFACEHyphenMinusHyphenMinusKeyword_0_0 = (Keyword)cINTERFACEEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cREFERENCEEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cREFERENCETildeTildeKeyword_1_0 = (Keyword)cREFERENCEEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cCONSTRAINTEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cCONSTRAINTTildeGreaterThanSignKeyword_2_0 = (Keyword)cCONSTRAINTEnumLiteralDeclaration_2.eContents().get(0);
		
		//enum LinkType:
		//  INTERFACE="--" | REFERENCE="~~" | CONSTRAINT="~>";
		public EnumRule getRule() { return rule; }

		//INTERFACE="--" | REFERENCE="~~" | CONSTRAINT="~>"
		public Alternatives getAlternatives() { return cAlternatives; }

		//INTERFACE="--"
		public EnumLiteralDeclaration getINTERFACEEnumLiteralDeclaration_0() { return cINTERFACEEnumLiteralDeclaration_0; }

		//"--"
		public Keyword getINTERFACEHyphenMinusHyphenMinusKeyword_0_0() { return cINTERFACEHyphenMinusHyphenMinusKeyword_0_0; }

		//REFERENCE="~~"
		public EnumLiteralDeclaration getREFERENCEEnumLiteralDeclaration_1() { return cREFERENCEEnumLiteralDeclaration_1; }

		//"~~"
		public Keyword getREFERENCETildeTildeKeyword_1_0() { return cREFERENCETildeTildeKeyword_1_0; }

		//CONSTRAINT="~>"
		public EnumLiteralDeclaration getCONSTRAINTEnumLiteralDeclaration_2() { return cCONSTRAINTEnumLiteralDeclaration_2; }

		//"~>"
		public Keyword getCONSTRAINTTildeGreaterThanSignKeyword_2_0() { return cCONSTRAINTTildeGreaterThanSignKeyword_2_0; }
	}
	
	private ProblemDiagramElements pProblemDiagram;
	private NodeElements pNode;
	private NodeTypeElements unknownRuleNodeType;
	private PhenomenonElements pPhenomenon;
	private PhenomenonTypeElements unknownRulePhenomenonType;
	private LinkElements pLink;
	private LinkTypeElements unknownRuleLinkType;
	private TerminalRule tID;
	
	private final GrammarProvider grammarProvider;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public ProblemGrammarAccess(GrammarProvider grammarProvider,
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

	
	//ProblemDiagram:
	//  "problem" ":" name=STRING (nodes+=Node|links+=Link)*;
	public ProblemDiagramElements getProblemDiagramAccess() {
		return (pProblemDiagram != null) ? pProblemDiagram : (pProblemDiagram = new ProblemDiagramElements());
	}
	
	public ParserRule getProblemDiagramRule() {
		return getProblemDiagramAccess().getRule();
	}

	//Node:
	//  name=ID type=NodeType? (":" description=STRING)? ("{" (hiddenPhenomena+=Phenomenon (
	//  "," hiddenPhenomena+=Phenomenon)*)? (subproblem+=ProblemDiagram|"see" "domain"
	//  problemNodeRef+=[Node]|"see" "problem" problemRef+=[ProblemDiagram]|"see" href+=
	//  STRING)* "}")?;
	public NodeElements getNodeAccess() {
		return (pNode != null) ? pNode : (pNode = new NodeElements());
	}
	
	public ParserRule getNodeRule() {
		return getNodeAccess().getRule();
	}

	//enum NodeType:
	//  REQUIREMENT="R" | MACHINE="M" | BIDDABLE="B" | LEXICAL="X" | CAUSAL="C" | DESIGNED="D" |
	//  PHYSICAL="P";
	public NodeTypeElements getNodeTypeAccess() {
		return (unknownRuleNodeType != null) ? unknownRuleNodeType : (unknownRuleNodeType = new NodeTypeElements());
	}
	
	public EnumRule getNodeTypeRule() {
		return getNodeTypeAccess().getRule();
	}

	//Phenomenon:
	//  type=PhenomenonType? isControlled?="!"? name=ID (":" description=STRING)?;
	public PhenomenonElements getPhenomenonAccess() {
		return (pPhenomenon != null) ? pPhenomenon : (pPhenomenon = new PhenomenonElements());
	}
	
	public ParserRule getPhenomenonRule() {
		return getPhenomenonAccess().getRule();
	}

	//enum PhenomenonType:
	//  UNSPECIFIED="phenomenon" | EVENT="event" | STATE="state";
	public PhenomenonTypeElements getPhenomenonTypeAccess() {
		return (unknownRulePhenomenonType != null) ? unknownRulePhenomenonType : (unknownRulePhenomenonType = new PhenomenonTypeElements());
	}
	
	public EnumRule getPhenomenonTypeRule() {
		return getPhenomenonTypeAccess().getRule();
	}

	//Link:
	//  from=[Node] type=LinkType to=[Node] ("{" phenomena+=Phenomenon ("," phenomena+=
	//  Phenomenon)* "}")? (":" description=STRING)?;
	public LinkElements getLinkAccess() {
		return (pLink != null) ? pLink : (pLink = new LinkElements());
	}
	
	public ParserRule getLinkRule() {
		return getLinkAccess().getRule();
	}

	//enum LinkType:
	//  INTERFACE="--" | REFERENCE="~~" | CONSTRAINT="~>";
	public LinkTypeElements getLinkTypeAccess() {
		return (unknownRuleLinkType != null) ? unknownRuleLinkType : (unknownRuleLinkType = new LinkTypeElements());
	}
	
	public EnumRule getLinkTypeRule() {
		return getLinkTypeAccess().getRule();
	}

	//terminal ID:
	//  "#" !"#"+ "#" | "^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return (tID != null) ? tID : (tID = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "ID"));
	} 

	//terminal INT returns ecore::EInt:
	//  "0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//  "\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" |
	//  "t" | "n" | "f" | "r" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//  "/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//  "//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//  (" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//  .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}