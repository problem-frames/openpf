/*
* generated by Xtext
*/
grammar InternalArgument;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package uk.ac.open.argument.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package uk.ac.open.argument.parser.antlr.internal; 

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
import uk.ac.open.argument.services.ArgumentGrammarAccess;

}

@parser::members {

 	private ArgumentGrammarAccess grammarAccess;
 	
    public InternalArgumentParser(TokenStream input, IAstFactory factory, ArgumentGrammarAccess grammarAccess) {
        this(input);
        this.factory = factory;
        registerRules(grammarAccess.getGrammar());
        this.grammarAccess = grammarAccess;
    }
    
    @Override
    protected InputStream getTokenFile() {
    	ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("uk/ac/open/argument/parser/antlr/internal/InternalArgument.tokens");
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "ArgumentDiagram";	
   	}
   	
   	@Override
   	protected ArgumentGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleArgumentDiagram
entryRuleArgumentDiagram returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getArgumentDiagramRule(), currentNode); }
	 iv_ruleArgumentDiagram=ruleArgumentDiagram 
	 { $current=$iv_ruleArgumentDiagram.current; } 
	 EOF 
;

// Rule ArgumentDiagram
ruleArgumentDiagram returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(	'argument:' 
    {
        createLeafNode(grammarAccess.getArgumentDiagramAccess().getArgumentKeyword_0(), null); 
    }
(
(
		lv_name_1_0=RULE_ID
		{
			createLeafNode(grammarAccess.getArgumentDiagramAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getArgumentDiagramRule().getType().getClassifier());
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
        createLeafNode(grammarAccess.getArgumentDiagramAccess().getForKeyword_2_0(), null); 
    }
(
(
		{
			if ($current==null) {
	            $current = factory.create(grammarAccess.getArgumentDiagramRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
        }
	RULE_ID
	{
		createLeafNode(grammarAccess.getArgumentDiagramAccess().getHighlightNodeCrossReference_2_1_0(), "highlight"); 
	}

)
))?((
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getArgumentDiagramAccess().getNodesNodeParserRuleCall_3_0_0(), currentNode); 
	    }
		lv_nodes_4_0=ruleNode		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getArgumentDiagramRule().getType().getClassifier());
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
	        currentNode=createCompositeNode(grammarAccess.getArgumentDiagramAccess().getLinksLinkParserRuleCall_3_1_0(), currentNode); 
	    }
		lv_links_5_0=ruleLink		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getArgumentDiagramRule().getType().getClassifier());
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
		createLeafNode(grammarAccess.getLinkAccess().getAfromNodeCrossReference_0_0(), "afrom"); 
	}

)
)(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getLinkAccess().getLinkLinkTypeEnumRuleCall_1_0(), currentNode); 
	    }
		lv_link_1_0=ruleLinkType		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getLinkRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"link",
	        		lv_link_1_0, 
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
	        currentNode=createCompositeNode(grammarAccess.getLinkAccess().getToNode1SplitCommasParserRuleCall_2_0(), currentNode); 
	    }
		lv_toNode1_2_0=ruleSplitCommas		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getLinkRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"toNode1",
	        		lv_toNode1_2_0, 
	        		"SplitCommas", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
))
;





// Entry rule entryRuleSplitCommas
entryRuleSplitCommas returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getSplitCommasRule(), currentNode); }
	 iv_ruleSplitCommas=ruleSplitCommas 
	 { $current=$iv_ruleSplitCommas.current; } 
	 EOF 
;

// Rule SplitCommas
ruleSplitCommas returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(
    { 
        currentNode=createCompositeNode(grammarAccess.getSplitCommasAccess().getSplitConnectiveParserRuleCall_0(), currentNode); 
    }
    this_SplitConnective_0=ruleSplitConnective
    { 
        $current = $this_SplitConnective_0.current; 
        currentNode = currentNode.getParent();
    }
((
    { 
        temp=factory.create(grammarAccess.getSplitCommasAccess().getSplitCommasLeftAction_1_0().getType().getClassifier());
        try {
        	factory.set(temp, "left", $current, null /*ParserRule*/, currentNode);
        } catch(ValueConverterException vce) {
        	handleValueConverterException(vce);
        }
        $current = temp; 
        temp = null;
        CompositeNode newNode = createCompositeNode(grammarAccess.getSplitCommasAccess().getSplitCommasLeftAction_1_0(), currentNode.getParent());
    newNode.getChildren().add(currentNode);
    moveLookaheadInfo(currentNode, newNode);
    currentNode = newNode; 
        associateNodeWithAstElement(currentNode, $current); 
    }
)	',' 
    {
        createLeafNode(grammarAccess.getSplitCommasAccess().getCommaKeyword_1_1(), null); 
    }
(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getSplitCommasAccess().getRightSplitConnectiveParserRuleCall_1_2_0(), currentNode); 
	    }
		lv_right_3_0=ruleSplitConnective		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getSplitCommasRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"right",
	        		lv_right_3_0, 
	        		"SplitConnective", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
))*)
;





// Entry rule entryRuleSplitConnective
entryRuleSplitConnective returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getSplitConnectiveRule(), currentNode); }
	 iv_ruleSplitConnective=ruleSplitConnective 
	 { $current=$iv_ruleSplitConnective.current; } 
	 EOF 
;

// Rule SplitConnective
ruleSplitConnective returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(
    { 
        currentNode=createCompositeNode(grammarAccess.getSplitConnectiveAccess().getSplitParenthesesParserRuleCall_0(), currentNode); 
    }
    this_SplitParentheses_0=ruleSplitParentheses
    { 
        $current = $this_SplitParentheses_0.current; 
        currentNode = currentNode.getParent();
    }
((
    { 
        temp=factory.create(grammarAccess.getSplitConnectiveAccess().getSplitConnectiveLeftAction_1_0().getType().getClassifier());
        try {
        	factory.set(temp, "left", $current, null /*ParserRule*/, currentNode);
        } catch(ValueConverterException vce) {
        	handleValueConverterException(vce);
        }
        $current = temp; 
        temp = null;
        CompositeNode newNode = createCompositeNode(grammarAccess.getSplitConnectiveAccess().getSplitConnectiveLeftAction_1_0(), currentNode.getParent());
    newNode.getChildren().add(currentNode);
    moveLookaheadInfo(currentNode, newNode);
    currentNode = newNode; 
        associateNodeWithAstElement(currentNode, $current); 
    }
)(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getSplitConnectiveAccess().getConnectiveConnectiveTypeEnumRuleCall_1_1_0(), currentNode); 
	    }
		lv_connective_2_0=ruleConnectiveType		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getSplitConnectiveRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"connective",
	        		lv_connective_2_0, 
	        		"ConnectiveType", 
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
	        currentNode=createCompositeNode(grammarAccess.getSplitConnectiveAccess().getRightSplitParenthesesParserRuleCall_1_2_0(), currentNode); 
	    }
		lv_right_3_0=ruleSplitParentheses		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getSplitConnectiveRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"right",
	        		lv_right_3_0, 
	        		"SplitParentheses", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
))*)
;





// Entry rule entryRuleSplitParentheses
entryRuleSplitParentheses returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getSplitParenthesesRule(), currentNode); }
	 iv_ruleSplitParentheses=ruleSplitParentheses 
	 { $current=$iv_ruleSplitParentheses.current; } 
	 EOF 
;

// Rule SplitParentheses
ruleSplitParentheses returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(
    { 
        currentNode=createCompositeNode(grammarAccess.getSplitParenthesesAccess().getNodeLiteralParserRuleCall_0(), currentNode); 
    }
    this_NodeLiteral_0=ruleNodeLiteral
    { 
        $current = $this_NodeLiteral_0.current; 
        currentNode = currentNode.getParent();
    }

    |(	'(' 
    {
        createLeafNode(grammarAccess.getSplitParenthesesAccess().getLeftParenthesisKeyword_1_0(), null); 
    }

    { 
        currentNode=createCompositeNode(grammarAccess.getSplitParenthesesAccess().getSplitCommasParserRuleCall_1_1(), currentNode); 
    }
    this_SplitCommas_2=ruleSplitCommas
    { 
        $current = $this_SplitCommas_2.current; 
        currentNode = currentNode.getParent();
    }
	')' 
    {
        createLeafNode(grammarAccess.getSplitParenthesesAccess().getRightParenthesisKeyword_1_2(), null); 
    }
))
;





// Entry rule entryRuleNodeLiteral
entryRuleNodeLiteral returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getNodeLiteralRule(), currentNode); }
	 iv_ruleNodeLiteral=ruleNodeLiteral 
	 { $current=$iv_ruleNodeLiteral.current; } 
	 EOF 
;

// Rule NodeLiteral
ruleNodeLiteral returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(
(
		{
			if ($current==null) {
	            $current = factory.create(grammarAccess.getNodeLiteralRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
        }
	RULE_ID
	{
		createLeafNode(grammarAccess.getNodeLiteralAccess().getValueNodeCrossReference_0(), "value"); 
	}

)
)
;





// Rule NodeType
ruleNodeType returns [Enumerator current=null] 
    @init { setCurrentLookahead(); resetLookahead(); }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
((	'C' 
	{
        $current = grammarAccess.getNodeTypeAccess().getCLAIMEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        createLeafNode(grammarAccess.getNodeTypeAccess().getCLAIMEnumLiteralDeclaration_0(), null); 
    }
)
    |(	'W' 
	{
        $current = grammarAccess.getNodeTypeAccess().getWARRANTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        createLeafNode(grammarAccess.getNodeTypeAccess().getWARRANTEnumLiteralDeclaration_1(), null); 
    }
)
    |(	'G' 
	{
        $current = grammarAccess.getNodeTypeAccess().getGROUNDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
        createLeafNode(grammarAccess.getNodeTypeAccess().getGROUNDEnumLiteralDeclaration_2(), null); 
    }
)
    |(	'R' 
	{
        $current = grammarAccess.getNodeTypeAccess().getREBUTTALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
        createLeafNode(grammarAccess.getNodeTypeAccess().getREBUTTALEnumLiteralDeclaration_3(), null); 
    }
)
    |(	'M' 
	{
        $current = grammarAccess.getNodeTypeAccess().getMITIGATIONEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
        createLeafNode(grammarAccess.getNodeTypeAccess().getMITIGATIONEnumLiteralDeclaration_4(), null); 
    }
)
    |(	'A' 
	{
        $current = grammarAccess.getNodeTypeAccess().getARGUMENTEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
        createLeafNode(grammarAccess.getNodeTypeAccess().getARGUMENTEnumLiteralDeclaration_5(), null); 
    }
));



// Rule ConnectiveType
ruleConnectiveType returns [Enumerator current=null] 
    @init { setCurrentLookahead(); resetLookahead(); }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
((	'and' 
	{
        $current = grammarAccess.getConnectiveTypeAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        createLeafNode(grammarAccess.getConnectiveTypeAccess().getANDEnumLiteralDeclaration_0(), null); 
    }
)
    |(	'or' 
	{
        $current = grammarAccess.getConnectiveTypeAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        createLeafNode(grammarAccess.getConnectiveTypeAccess().getOREnumLiteralDeclaration_1(), null); 
    }
));



// Rule LinkType
ruleLinkType returns [Enumerator current=null] 
    @init { setCurrentLookahead(); resetLookahead(); }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
((	'argues' 
	{
        $current = grammarAccess.getLinkTypeAccess().getARGUESEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        createLeafNode(grammarAccess.getLinkTypeAccess().getARGUESEnumLiteralDeclaration_0(), null); 
    }
)
    |(	'rebutted by' 
	{
        $current = grammarAccess.getLinkTypeAccess().getREBUTSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        createLeafNode(grammarAccess.getLinkTypeAccess().getREBUTSEnumLiteralDeclaration_1(), null); 
    }
)
    |(	'mitigated by' 
	{
        $current = grammarAccess.getLinkTypeAccess().getMITIGATESEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
        createLeafNode(grammarAccess.getLinkTypeAccess().getMITIGATESEnumLiteralDeclaration_2(), null); 
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


