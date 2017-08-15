/*
 * generated by Xtext
 */
grammar InternalProblem;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package uk.ac.open.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package uk.ac.open.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import uk.ac.open.services.ProblemGrammarAccess;

}

@parser::members {

 	private ProblemGrammarAccess grammarAccess;
 	
    public InternalProblemParser(TokenStream input, ProblemGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "ProblemDiagram";	
   	}
   	
   	@Override
   	protected ProblemGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleProblemDiagram
entryRuleProblemDiagram returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getProblemDiagramRule()); }
	 iv_ruleProblemDiagram=ruleProblemDiagram 
	 { $current=$iv_ruleProblemDiagram.current; } 
	 EOF 
;

// Rule ProblemDiagram
ruleProblemDiagram returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='problem:' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getProblemDiagramAccess().getProblemKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getProblemDiagramAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getProblemDiagramRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"uk.ac.open.Problem.ID");
	    }

)
)(	otherlv_2='for' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getProblemDiagramAccess().getForKeyword_2_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getProblemDiagramRule());
	        }
        }
	otherlv_3=RULE_ID
	{
		newLeafNode(otherlv_3, grammarAccess.getProblemDiagramAccess().getHighlightNodeCrossReference_2_1_0()); 
	}

)
))?((
(
		{ 
	        newCompositeNode(grammarAccess.getProblemDiagramAccess().getNodesNodeParserRuleCall_3_0_0()); 
	    }
		lv_nodes_4_0=ruleNode		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getProblemDiagramRule());
	        }
       		add(
       			$current, 
       			"nodes",
        		lv_nodes_4_0, 
        		"uk.ac.open.Problem.Node");
	        afterParserOrEnumRuleCall();
	    }

)
)
    |(
(
		{ 
	        newCompositeNode(grammarAccess.getProblemDiagramAccess().getLinksLinkParserRuleCall_3_1_0()); 
	    }
		lv_links_5_0=ruleLink		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getProblemDiagramRule());
	        }
       		add(
       			$current, 
       			"links",
        		lv_links_5_0, 
        		"uk.ac.open.Problem.Link");
	        afterParserOrEnumRuleCall();
	    }

)
))*)
;







// Entry rule entryRuleNode
entryRuleNode returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getNodeRule()); }
	 iv_ruleNode=ruleNode 
	 { $current=$iv_ruleNode.current; } 
	 EOF 
;

// Rule Node
ruleNode returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_name_0_0=RULE_ID
		{
			newLeafNode(lv_name_0_0, grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getNodeRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"uk.ac.open.Problem.ID");
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getNodeAccess().getTypeNodeTypeEnumRuleCall_1_0()); 
	    }
		lv_type_1_0=ruleNodeType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getNodeRule());
	        }
       		set(
       			$current, 
       			"type",
        		lv_type_1_0, 
        		"uk.ac.open.Problem.NodeType");
	        afterParserOrEnumRuleCall();
	    }

)
)?((	otherlv_2=':' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getNodeAccess().getColonKeyword_2_0());
    }
)?(
(
		lv_description_3_0=RULE_STRING
		{
			newLeafNode(lv_description_3_0, grammarAccess.getNodeAccess().getDescriptionSTRINGTerminalRuleCall_2_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getNodeRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"description",
        		lv_description_3_0, 
        		"org.eclipse.xtext.common.Terminals.STRING");
	    }

)
))?(	otherlv_4='{' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_3_0());
    }
((
(
		{ 
	        newCompositeNode(grammarAccess.getNodeAccess().getHiddenPhenomenaPhenomenonParserRuleCall_3_1_0_0()); 
	    }
		lv_hiddenPhenomena_5_0=rulePhenomenon		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getNodeRule());
	        }
       		add(
       			$current, 
       			"hiddenPhenomena",
        		lv_hiddenPhenomena_5_0, 
        		"uk.ac.open.Problem.Phenomenon");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_6=',' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getNodeAccess().getCommaKeyword_3_1_1_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getNodeAccess().getHiddenPhenomenaPhenomenonParserRuleCall_3_1_1_1_0()); 
	    }
		lv_hiddenPhenomena_7_0=rulePhenomenon		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getNodeRule());
	        }
       		add(
       			$current, 
       			"hiddenPhenomena",
        		lv_hiddenPhenomena_7_0, 
        		"uk.ac.open.Problem.Phenomenon");
	        afterParserOrEnumRuleCall();
	    }

)
))*)?((
(
		{ 
	        newCompositeNode(grammarAccess.getNodeAccess().getTimingConstraintConstraintParserRuleCall_3_2_0_0()); 
	    }
		lv_timingConstraint_8_0=ruleConstraint		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getNodeRule());
	        }
       		add(
       			$current, 
       			"timingConstraint",
        		lv_timingConstraint_8_0, 
        		"uk.ac.open.Problem.Constraint");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_9=';' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getNodeAccess().getSemicolonKeyword_3_2_1_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getNodeAccess().getTimingConstraintConstraintParserRuleCall_3_2_1_1_0()); 
	    }
		lv_timingConstraint_10_0=ruleConstraint		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getNodeRule());
	        }
       		add(
       			$current, 
       			"timingConstraint",
        		lv_timingConstraint_10_0, 
        		"uk.ac.open.Problem.Constraint");
	        afterParserOrEnumRuleCall();
	    }

)
))*)?((
(
		{ 
	        newCompositeNode(grammarAccess.getNodeAccess().getSubproblemProblemDiagramParserRuleCall_3_3_0_0()); 
	    }
		lv_subproblem_11_0=ruleProblemDiagram		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getNodeRule());
	        }
       		add(
       			$current, 
       			"subproblem",
        		lv_subproblem_11_0, 
        		"uk.ac.open.Problem.ProblemDiagram");
	        afterParserOrEnumRuleCall();
	    }

)
)
    |(	otherlv_12='see' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getNodeAccess().getSeeKeyword_3_3_1_0());
    }
	otherlv_13='domain' 
    {
    	newLeafNode(otherlv_13, grammarAccess.getNodeAccess().getDomainKeyword_3_3_1_1());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getNodeRule());
	        }
        }
	otherlv_14=RULE_ID
	{
		newLeafNode(otherlv_14, grammarAccess.getNodeAccess().getProblemNodeRefNodeCrossReference_3_3_1_2_0()); 
	}

)
))
    |(	otherlv_15='see' 
    {
    	newLeafNode(otherlv_15, grammarAccess.getNodeAccess().getSeeKeyword_3_3_2_0());
    }
	otherlv_16='problem' 
    {
    	newLeafNode(otherlv_16, grammarAccess.getNodeAccess().getProblemKeyword_3_3_2_1());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getNodeRule());
	        }
        }
	otherlv_17=RULE_ID
	{
		newLeafNode(otherlv_17, grammarAccess.getNodeAccess().getProblemRefProblemDiagramCrossReference_3_3_2_2_0()); 
	}

)
))
    |(	otherlv_18='see' 
    {
    	newLeafNode(otherlv_18, grammarAccess.getNodeAccess().getSeeKeyword_3_3_3_0());
    }
(
(
		lv_href_19_0=RULE_STRING
		{
			newLeafNode(lv_href_19_0, grammarAccess.getNodeAccess().getHrefSTRINGTerminalRuleCall_3_3_3_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getNodeRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"href",
        		lv_href_19_0, 
        		"org.eclipse.xtext.common.Terminals.STRING");
	    }

)
)))*	otherlv_20='}' 
    {
    	newLeafNode(otherlv_20, grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_3_4());
    }
)?)
;





// Entry rule entryRulePhenomenon
entryRulePhenomenon returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getPhenomenonRule()); }
	 iv_rulePhenomenon=rulePhenomenon 
	 { $current=$iv_rulePhenomenon.current; } 
	 EOF 
;

// Rule Phenomenon
rulePhenomenon returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getPhenomenonAccess().getTypePhenomenonTypeEnumRuleCall_0_0()); 
	    }
		lv_type_0_0=rulePhenomenonType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPhenomenonRule());
	        }
       		set(
       			$current, 
       			"type",
        		lv_type_0_0, 
        		"uk.ac.open.Problem.PhenomenonType");
	        afterParserOrEnumRuleCall();
	    }

)
)?(
(
		lv_isControlled_1_0=	'!' 
    {
        newLeafNode(lv_isControlled_1_0, grammarAccess.getPhenomenonAccess().getIsControlledExclamationMarkKeyword_1_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getPhenomenonRule());
	        }
       		setWithLastConsumed($current, "isControlled", true, "!");
	    }

)
)?(
(
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getPhenomenonAccess().getNameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getPhenomenonRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"uk.ac.open.Problem.ID");
	    }

)
)((	otherlv_3=':' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getPhenomenonAccess().getColonKeyword_3_0());
    }
)?(
(
		lv_description_4_0=RULE_STRING
		{
			newLeafNode(lv_description_4_0, grammarAccess.getPhenomenonAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getPhenomenonRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"description",
        		lv_description_4_0, 
        		"org.eclipse.xtext.common.Terminals.STRING");
	    }

)
))?)
;





// Entry rule entryRuleConstraint
entryRuleConstraint returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getConstraintRule()); }
	 iv_ruleConstraint=ruleConstraint 
	 { $current=$iv_ruleConstraint.current; } 
	 EOF 
;

// Rule Constraint
ruleConstraint returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getConstraintAccess().getTypeConstraintTypeEnumRuleCall_0_0()); 
	    }
		lv_type_0_0=ruleConstraintType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getConstraintRule());
	        }
       		set(
       			$current, 
       			"type",
        		lv_type_0_0, 
        		"uk.ac.open.Problem.ConstraintType");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_1='(' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getConstraintAccess().getLeftParenthesisKeyword_1());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getConstraintRule());
	        }
        }
	otherlv_2=RULE_ID
	{
		newLeafNode(otherlv_2, grammarAccess.getConstraintAccess().getOperandClockCrossReference_2_0()); 
	}

)
)(	otherlv_3=',' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getConstraintAccess().getCommaKeyword_3_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getConstraintRule());
	        }
        }
	otherlv_4=RULE_ID
	{
		newLeafNode(otherlv_4, grammarAccess.getConstraintAccess().getOperandClockCrossReference_3_1_0()); 
	}

)
))*	otherlv_5=')' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getConstraintAccess().getRightParenthesisKeyword_4());
    }
)
;





// Entry rule entryRuleLink
entryRuleLink returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getLinkRule()); }
	 iv_ruleLink=ruleLink 
	 { $current=$iv_ruleLink.current; } 
	 EOF 
;

// Rule Link
ruleLink returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getLinkRule());
	        }
        }
	otherlv_0=RULE_ID
	{
		newLeafNode(otherlv_0, grammarAccess.getLinkAccess().getFromNodeCrossReference_0_0()); 
	}

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getLinkAccess().getTypeLinkTypeEnumRuleCall_1_0()); 
	    }
		lv_type_1_0=ruleLinkType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getLinkRule());
	        }
       		set(
       			$current, 
       			"type",
        		lv_type_1_0, 
        		"uk.ac.open.Problem.LinkType");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getLinkRule());
	        }
        }
	otherlv_2=RULE_ID
	{
		newLeafNode(otherlv_2, grammarAccess.getLinkAccess().getToNodeCrossReference_2_0()); 
	}

)
)(	otherlv_3='{' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getLinkAccess().getPhenomenaPhenomenonParserRuleCall_3_1_0()); 
	    }
		lv_phenomena_4_0=rulePhenomenon		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getLinkRule());
	        }
       		add(
       			$current, 
       			"phenomena",
        		lv_phenomena_4_0, 
        		"uk.ac.open.Problem.Phenomenon");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_5=',' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getLinkAccess().getCommaKeyword_3_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getLinkAccess().getPhenomenaPhenomenonParserRuleCall_3_2_1_0()); 
	    }
		lv_phenomena_6_0=rulePhenomenon		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getLinkRule());
	        }
       		add(
       			$current, 
       			"phenomena",
        		lv_phenomena_6_0, 
        		"uk.ac.open.Problem.Phenomenon");
	        afterParserOrEnumRuleCall();
	    }

)
))*((
(
		{ 
	        newCompositeNode(grammarAccess.getLinkAccess().getTimingConstraintParserRuleCall_3_3_0_0()); 
	    }
		lv_timing_7_0=ruleConstraint		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getLinkRule());
	        }
       		add(
       			$current, 
       			"timing",
        		lv_timing_7_0, 
        		"uk.ac.open.Problem.Constraint");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_8=';' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getLinkAccess().getSemicolonKeyword_3_3_1_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getLinkAccess().getTimingConstraintParserRuleCall_3_3_1_1_0()); 
	    }
		lv_timing_9_0=ruleConstraint		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getLinkRule());
	        }
       		add(
       			$current, 
       			"timing",
        		lv_timing_9_0, 
        		"uk.ac.open.Problem.Constraint");
	        afterParserOrEnumRuleCall();
	    }

)
))*)?	otherlv_10='}' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getLinkAccess().getRightCurlyBracketKeyword_3_4());
    }
)?((	otherlv_11=':' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getLinkAccess().getColonKeyword_4_0());
    }
)?(
(
		lv_description_12_0=RULE_STRING
		{
			newLeafNode(lv_description_12_0, grammarAccess.getLinkAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getLinkRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"description",
        		lv_description_12_0, 
        		"org.eclipse.xtext.common.Terminals.STRING");
	    }

)
))?)
;





// Rule NodeType
ruleNodeType returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='R' 
	{
        $current = grammarAccess.getNodeTypeAccess().getREQUIREMENTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getNodeTypeAccess().getREQUIREMENTEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='M' 
	{
        $current = grammarAccess.getNodeTypeAccess().getMACHINEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getNodeTypeAccess().getMACHINEEnumLiteralDeclaration_1()); 
    }
)
    |(	enumLiteral_2='B' 
	{
        $current = grammarAccess.getNodeTypeAccess().getBIDDABLEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_2, grammarAccess.getNodeTypeAccess().getBIDDABLEEnumLiteralDeclaration_2()); 
    }
)
    |(	enumLiteral_3='X' 
	{
        $current = grammarAccess.getNodeTypeAccess().getLEXICALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_3, grammarAccess.getNodeTypeAccess().getLEXICALEnumLiteralDeclaration_3()); 
    }
)
    |(	enumLiteral_4='C' 
	{
        $current = grammarAccess.getNodeTypeAccess().getCAUSALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_4, grammarAccess.getNodeTypeAccess().getCAUSALEnumLiteralDeclaration_4()); 
    }
)
    |(	enumLiteral_5='D' 
	{
        $current = grammarAccess.getNodeTypeAccess().getDESIGNEDEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_5, grammarAccess.getNodeTypeAccess().getDESIGNEDEnumLiteralDeclaration_5()); 
    }
)
    |(	enumLiteral_6='P' 
	{
        $current = grammarAccess.getNodeTypeAccess().getPHYSICALEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_6, grammarAccess.getNodeTypeAccess().getPHYSICALEnumLiteralDeclaration_6()); 
    }
)
    |(	enumLiteral_7='?' 
	{
        $current = grammarAccess.getNodeTypeAccess().getCONCERNEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_7, grammarAccess.getNodeTypeAccess().getCONCERNEnumLiteralDeclaration_7()); 
    }
));



// Rule PhenomenonType
rulePhenomenonType returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='phenomenon' 
	{
        $current = grammarAccess.getPhenomenonTypeAccess().getUNSPECIFIEDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getPhenomenonTypeAccess().getUNSPECIFIEDEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='event' 
	{
        $current = grammarAccess.getPhenomenonTypeAccess().getEVENTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getPhenomenonTypeAccess().getEVENTEnumLiteralDeclaration_1()); 
    }
)
    |(	enumLiteral_2='state' 
	{
        $current = grammarAccess.getPhenomenonTypeAccess().getSTATEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_2, grammarAccess.getPhenomenonTypeAccess().getSTATEEnumLiteralDeclaration_2()); 
    }
));



// Rule ConstraintType
ruleConstraintType returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='<' 
	{
        $current = grammarAccess.getConstraintTypeAccess().getStrictPreEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getConstraintTypeAccess().getStrictPreEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='<=' 
	{
        $current = grammarAccess.getConstraintTypeAccess().getCauseEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getConstraintTypeAccess().getCauseEnumLiteralDeclaration_1()); 
    }
)
    |(	enumLiteral_2='~' 
	{
        $current = grammarAccess.getConstraintTypeAccess().getAlternateEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_2, grammarAccess.getConstraintTypeAccess().getAlternateEnumLiteralDeclaration_2()); 
    }
));



// Rule LinkType
ruleLinkType returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='--' 
	{
        $current = grammarAccess.getLinkTypeAccess().getINTERFACEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getLinkTypeAccess().getINTERFACEEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='~~' 
	{
        $current = grammarAccess.getLinkTypeAccess().getREFERENCEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getLinkTypeAccess().getREFERENCEEnumLiteralDeclaration_1()); 
    }
)
    |(	enumLiteral_2='<~' 
	{
        $current = grammarAccess.getLinkTypeAccess().getCONSTRAINTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_2, grammarAccess.getLinkTypeAccess().getCONSTRAINTEnumLiteralDeclaration_2()); 
    }
)
    |(	enumLiteral_3='->' 
	{
        $current = grammarAccess.getLinkTypeAccess().getCONCERNEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_3, grammarAccess.getLinkTypeAccess().getCONCERNEnumLiteralDeclaration_3()); 
    }
)
    |(	enumLiteral_4='~>' 
	{
        $current = grammarAccess.getLinkTypeAccess().getINV_CONSTRAINTEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_4, grammarAccess.getLinkTypeAccess().getINV_CONSTRAINTEnumLiteralDeclaration_4()); 
    }
));



RULE_ID : ('#' ~('#')+ '#'|'^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*);

RULE_QUALIFIED_NAME : RULE_ID ('.' RULE_ID)*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


