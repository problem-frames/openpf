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

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import uk.ac.open.services.ProblemGrammarAccess;

}

@parser::members {

 	private ProblemGrammarAccess grammarAccess;
 	
    public InternalProblemParser(TokenStream input, IAstFactory factory, ProblemGrammarAccess grammarAccess) {
        this(input);
        this.factory = factory;
        registerRules(grammarAccess.getGrammar());
        this.grammarAccess = grammarAccess;
    }
    
    @Override
    protected InputStream getTokenFile() {
    	ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("uk/ac/open/parser/antlr/internal/InternalProblem.tokens");
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
	{ currentNode = createCompositeNode(grammarAccess.getProblemDiagramRule(), currentNode); }
	 iv_ruleProblemDiagram=ruleProblemDiagram 
	 { $current=$iv_ruleProblemDiagram.current; } 
	 EOF 
;

// Rule ProblemDiagram
ruleProblemDiagram returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(	'problem:' 
    {
        createLeafNode(grammarAccess.getProblemDiagramAccess().getProblemKeyword_0(), null); 
    }
(
(
		lv_name_1_0=RULE_ID
		{
			createLeafNode(grammarAccess.getProblemDiagramAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getProblemDiagramRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"name",
	        		lv_name_1_0, 
	        		"ID", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
)(	'for' 
    {
        createLeafNode(grammarAccess.getProblemDiagramAccess().getForKeyword_2_0(), null); 
    }
(
(
		{
			if ($current==null) {
	            $current = factory.create(grammarAccess.getProblemDiagramRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
        }
	RULE_ID
	{
		createLeafNode(grammarAccess.getProblemDiagramAccess().getHighlightNodeCrossReference_2_1_0(), "highlight"); 
	}

)
))?((
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getProblemDiagramAccess().getNodesNodeParserRuleCall_3_0_0(), currentNode); 
	    }
		lv_nodes_4_0=ruleNode		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getProblemDiagramRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"nodes",
	        		lv_nodes_4_0, 
	        		"Node", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
)
    |(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getProblemDiagramAccess().getLinksLinkParserRuleCall_3_1_0(), currentNode); 
	    }
		lv_links_5_0=ruleLink		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getProblemDiagramRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"links",
	        		lv_links_5_0, 
	        		"Link", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
))*)
;





// Entry rule entryRuleNode
entryRuleNode returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getNodeRule(), currentNode); }
	 iv_ruleNode=ruleNode 
	 { $current=$iv_ruleNode.current; } 
	 EOF 
;

// Rule Node
ruleNode returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
((
(
		lv_name_0_0=RULE_ID
		{
			createLeafNode(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getNodeRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"name",
	        		lv_name_0_0, 
	        		"ID", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
)(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getNodeAccess().getTypeNodeTypeEnumRuleCall_1_0(), currentNode); 
	    }
		lv_type_1_0=ruleNodeType		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getNodeRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"type",
	        		lv_type_1_0, 
	        		"NodeType", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
)?((	':' 
    {
        createLeafNode(grammarAccess.getNodeAccess().getColonKeyword_2_0(), null); 
    }
)?(
(
		lv_description_3_0=RULE_STRING
		{
			createLeafNode(grammarAccess.getNodeAccess().getDescriptionSTRINGTerminalRuleCall_2_1_0(), "description"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getNodeRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"description",
	        		lv_description_3_0, 
	        		"STRING", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
))?(	'{' 
    {
        createLeafNode(grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_3_0(), null); 
    }
((
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getNodeAccess().getHiddenPhenomenaPhenomenonParserRuleCall_3_1_0_0(), currentNode); 
	    }
		lv_hiddenPhenomena_5_0=rulePhenomenon		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getNodeRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"hiddenPhenomena",
	        		lv_hiddenPhenomena_5_0, 
	        		"Phenomenon", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
)(	',' 
    {
        createLeafNode(grammarAccess.getNodeAccess().getCommaKeyword_3_1_1_0(), null); 
    }
(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getNodeAccess().getHiddenPhenomenaPhenomenonParserRuleCall_3_1_1_1_0(), currentNode); 
	    }
		lv_hiddenPhenomena_7_0=rulePhenomenon		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getNodeRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"hiddenPhenomena",
	        		lv_hiddenPhenomena_7_0, 
	        		"Phenomenon", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
))*)?((
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getNodeAccess().getSubproblemProblemDiagramParserRuleCall_3_2_0_0(), currentNode); 
	    }
		lv_subproblem_8_0=ruleProblemDiagram		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getNodeRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"subproblem",
	        		lv_subproblem_8_0, 
	        		"ProblemDiagram", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
)
    |(	'see' 
    {
        createLeafNode(grammarAccess.getNodeAccess().getSeeKeyword_3_2_1_0(), null); 
    }
	'domain' 
    {
        createLeafNode(grammarAccess.getNodeAccess().getDomainKeyword_3_2_1_1(), null); 
    }
(
(
		{
			if ($current==null) {
	            $current = factory.create(grammarAccess.getNodeRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
        }
	RULE_ID
	{
		createLeafNode(grammarAccess.getNodeAccess().getProblemNodeRefNodeCrossReference_3_2_1_2_0(), "problemNodeRef"); 
	}

)
))
    |(	'see' 
    {
        createLeafNode(grammarAccess.getNodeAccess().getSeeKeyword_3_2_2_0(), null); 
    }
	'problem' 
    {
        createLeafNode(grammarAccess.getNodeAccess().getProblemKeyword_3_2_2_1(), null); 
    }
(
(
		{
			if ($current==null) {
	            $current = factory.create(grammarAccess.getNodeRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
        }
	RULE_ID
	{
		createLeafNode(grammarAccess.getNodeAccess().getProblemRefProblemDiagramCrossReference_3_2_2_2_0(), "problemRef"); 
	}

)
))
    |(	'see' 
    {
        createLeafNode(grammarAccess.getNodeAccess().getSeeKeyword_3_2_3_0(), null); 
    }
(
(
		lv_href_16_0=RULE_STRING
		{
			createLeafNode(grammarAccess.getNodeAccess().getHrefSTRINGTerminalRuleCall_3_2_3_1_0(), "href"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getNodeRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"href",
	        		lv_href_16_0, 
	        		"STRING", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
)))*	'}' 
    {
        createLeafNode(grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_3_3(), null); 
    }
)?)
;





// Entry rule entryRulePhenomenon
entryRulePhenomenon returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getPhenomenonRule(), currentNode); }
	 iv_rulePhenomenon=rulePhenomenon 
	 { $current=$iv_rulePhenomenon.current; } 
	 EOF 
;

// Rule Phenomenon
rulePhenomenon returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
((
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getPhenomenonAccess().getTypePhenomenonTypeEnumRuleCall_0_0(), currentNode); 
	    }
		lv_type_0_0=rulePhenomenonType		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getPhenomenonRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"type",
	        		lv_type_0_0, 
	        		"PhenomenonType", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
)?(
(
		lv_isControlled_1_0=	'!' 
    {
        createLeafNode(grammarAccess.getPhenomenonAccess().getIsControlledExclamationMarkKeyword_1_0(), "isControlled"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getPhenomenonRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	       		set($current, "isControlled", true, "!", lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
)?(
(
		lv_name_2_0=RULE_ID
		{
			createLeafNode(grammarAccess.getPhenomenonAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getPhenomenonRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"name",
	        		lv_name_2_0, 
	        		"ID", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
)((	':' 
    {
        createLeafNode(grammarAccess.getPhenomenonAccess().getColonKeyword_3_0(), null); 
    }
)?(
(
		lv_description_4_0=RULE_STRING
		{
			createLeafNode(grammarAccess.getPhenomenonAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0(), "description"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getPhenomenonRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"description",
	        		lv_description_4_0, 
	        		"STRING", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
))?)
;





// Entry rule entryRuleLink
entryRuleLink returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getLinkRule(), currentNode); }
	 iv_ruleLink=ruleLink 
	 { $current=$iv_ruleLink.current; } 
	 EOF 
;

// Rule Link
ruleLink returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
((
(
		{
			if ($current==null) {
	            $current = factory.create(grammarAccess.getLinkRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
        }
	RULE_ID
	{
		createLeafNode(grammarAccess.getLinkAccess().getFromNodeCrossReference_0_0(), "from"); 
	}

)
)(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getLinkAccess().getTypeLinkTypeEnumRuleCall_1_0(), currentNode); 
	    }
		lv_type_1_0=ruleLinkType		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getLinkRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"type",
	        		lv_type_1_0, 
	        		"LinkType", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
)(
(
		{
			if ($current==null) {
	            $current = factory.create(grammarAccess.getLinkRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
        }
	RULE_ID
	{
		createLeafNode(grammarAccess.getLinkAccess().getToNodeCrossReference_2_0(), "to"); 
	}

)
)(	'{' 
    {
        createLeafNode(grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_3_0(), null); 
    }
(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getLinkAccess().getPhenomenaPhenomenonParserRuleCall_3_1_0(), currentNode); 
	    }
		lv_phenomena_4_0=rulePhenomenon		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getLinkRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"phenomena",
	        		lv_phenomena_4_0, 
	        		"Phenomenon", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
)(	',' 
    {
        createLeafNode(grammarAccess.getLinkAccess().getCommaKeyword_3_2_0(), null); 
    }
(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getLinkAccess().getPhenomenaPhenomenonParserRuleCall_3_2_1_0(), currentNode); 
	    }
		lv_phenomena_6_0=rulePhenomenon		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getLinkRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"phenomena",
	        		lv_phenomena_6_0, 
	        		"Phenomenon", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
))*	'}' 
    {
        createLeafNode(grammarAccess.getLinkAccess().getRightCurlyBracketKeyword_3_3(), null); 
    }
)?((	':' 
    {
        createLeafNode(grammarAccess.getLinkAccess().getColonKeyword_4_0(), null); 
    }
)?(
(
		lv_description_9_0=RULE_STRING
		{
			createLeafNode(grammarAccess.getLinkAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0(), "description"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getLinkRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"description",
	        		lv_description_9_0, 
	        		"STRING", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
))?)
;





// Rule NodeType
ruleNodeType returns [Enumerator current=null] 
    @init { setCurrentLookahead(); resetLookahead(); }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
((	'R' 
	{
        $current = grammarAccess.getNodeTypeAccess().getREQUIREMENTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        createLeafNode(grammarAccess.getNodeTypeAccess().getREQUIREMENTEnumLiteralDeclaration_0(), null); 
    }
)
    |(	'M' 
	{
        $current = grammarAccess.getNodeTypeAccess().getMACHINEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        createLeafNode(grammarAccess.getNodeTypeAccess().getMACHINEEnumLiteralDeclaration_1(), null); 
    }
)
    |(	'B' 
	{
        $current = grammarAccess.getNodeTypeAccess().getBIDDABLEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
        createLeafNode(grammarAccess.getNodeTypeAccess().getBIDDABLEEnumLiteralDeclaration_2(), null); 
    }
)
    |(	'X' 
	{
        $current = grammarAccess.getNodeTypeAccess().getLEXICALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
        createLeafNode(grammarAccess.getNodeTypeAccess().getLEXICALEnumLiteralDeclaration_3(), null); 
    }
)
    |(	'C' 
	{
        $current = grammarAccess.getNodeTypeAccess().getCAUSALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
        createLeafNode(grammarAccess.getNodeTypeAccess().getCAUSALEnumLiteralDeclaration_4(), null); 
    }
)
    |(	'D' 
	{
        $current = grammarAccess.getNodeTypeAccess().getDESIGNEDEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
        createLeafNode(grammarAccess.getNodeTypeAccess().getDESIGNEDEnumLiteralDeclaration_5(), null); 
    }
)
    |(	'P' 
	{
        $current = grammarAccess.getNodeTypeAccess().getPHYSICALEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
        createLeafNode(grammarAccess.getNodeTypeAccess().getPHYSICALEnumLiteralDeclaration_6(), null); 
    }
));



// Rule PhenomenonType
rulePhenomenonType returns [Enumerator current=null] 
    @init { setCurrentLookahead(); resetLookahead(); }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
((	'phenomenon' 
	{
        $current = grammarAccess.getPhenomenonTypeAccess().getUNSPECIFIEDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        createLeafNode(grammarAccess.getPhenomenonTypeAccess().getUNSPECIFIEDEnumLiteralDeclaration_0(), null); 
    }
)
    |(	'event' 
	{
        $current = grammarAccess.getPhenomenonTypeAccess().getEVENTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        createLeafNode(grammarAccess.getPhenomenonTypeAccess().getEVENTEnumLiteralDeclaration_1(), null); 
    }
)
    |(	'state' 
	{
        $current = grammarAccess.getPhenomenonTypeAccess().getSTATEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
        createLeafNode(grammarAccess.getPhenomenonTypeAccess().getSTATEEnumLiteralDeclaration_2(), null); 
    }
));



// Rule LinkType
ruleLinkType returns [Enumerator current=null] 
    @init { setCurrentLookahead(); resetLookahead(); }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
((	'--' 
	{
        $current = grammarAccess.getLinkTypeAccess().getINTERFACEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        createLeafNode(grammarAccess.getLinkTypeAccess().getINTERFACEEnumLiteralDeclaration_0(), null); 
    }
)
    |(	'~~' 
	{
        $current = grammarAccess.getLinkTypeAccess().getREFERENCEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        createLeafNode(grammarAccess.getLinkTypeAccess().getREFERENCEEnumLiteralDeclaration_1(), null); 
    }
)
    |(	'~>' 
	{
        $current = grammarAccess.getLinkTypeAccess().getCONSTRAINTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
        createLeafNode(grammarAccess.getLinkTypeAccess().getCONSTRAINTEnumLiteralDeclaration_2(), null); 
    }
));



RULE_ID : ('#' ~('#')+ '#'|'^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*);

RULE_QUALIFIED_NAME : RULE_ID ('.' RULE_ID)*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


