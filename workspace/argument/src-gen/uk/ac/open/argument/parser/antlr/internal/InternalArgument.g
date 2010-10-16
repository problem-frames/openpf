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
((	'argument:' 
    {
        createLeafNode(grammarAccess.getArgumentDiagramAccess().getArgumentKeyword_0_0(), null); 
    }
(
(
		lv_name_1_0=RULE_ID
		{
			createLeafNode(grammarAccess.getArgumentDiagramAccess().getNameIDTerminalRuleCall_0_1_0(), "name"); 
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
))?(	'for' 
    {
        createLeafNode(grammarAccess.getArgumentDiagramAccess().getForKeyword_1_0(), null); 
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
		createLeafNode(grammarAccess.getArgumentDiagramAccess().getHighlightNodeCrossReference_1_1_0(), "highlight"); 
	}

)
))?((
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getArgumentDiagramAccess().getNodesNodeParserRuleCall_2_0_0(), currentNode); 
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
	        currentNode=createCompositeNode(grammarAccess.getArgumentDiagramAccess().getLinksLinkParserRuleCall_2_1_0(), currentNode); 
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
(
    { 
        currentNode=createCompositeNode(grammarAccess.getNodeAccess().getArgumentParserRuleCall_0(), currentNode); 
    }
    this_Argument_0=ruleArgument
    { 
        $current = $this_Argument_0.current; 
        currentNode = currentNode.getParent();
    }

    |
    { 
        currentNode=createCompositeNode(grammarAccess.getNodeAccess().getClaimParserRuleCall_1(), currentNode); 
    }
    this_Claim_1=ruleClaim
    { 
        $current = $this_Claim_1.current; 
        currentNode = currentNode.getParent();
    }

    |
    { 
        currentNode=createCompositeNode(grammarAccess.getNodeAccess().getFactParserRuleCall_2(), currentNode); 
    }
    this_Fact_2=ruleFact
    { 
        $current = $this_Fact_2.current; 
        currentNode = currentNode.getParent();
    }
)
;





// Entry rule entryRuleArgument
entryRuleArgument returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getArgumentRule(), currentNode); }
	 iv_ruleArgument=ruleArgument 
	 { $current=$iv_ruleArgument.current; } 
	 EOF 
;

// Rule Argument
ruleArgument returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
((
(
		lv_name_0_0=RULE_ID
		{
			createLeafNode(grammarAccess.getArgumentAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getArgumentRule().getType().getClassifier());
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
)	'A' 
    {
        createLeafNode(grammarAccess.getArgumentAccess().getAKeyword_1(), null); 
    }
(	'{' 
    {
        createLeafNode(grammarAccess.getArgumentAccess().getLeftCurlyBracketKeyword_2_0(), null); 
    }
	'claim' 
    {
        createLeafNode(grammarAccess.getArgumentAccess().getClaimKeyword_2_1(), null); 
    }
(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getArgumentAccess().getClaimClaimParserRuleCall_2_2_0(), currentNode); 
	    }
		lv_claim_4_0=ruleClaim		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getArgumentRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"claim",
	        		lv_claim_4_0, 
	        		"Claim", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
)(	'supported by' 
    {
        createLeafNode(grammarAccess.getArgumentAccess().getSupportedByKeyword_2_3_0(), null); 
    }
((	',' 
    {
        createLeafNode(grammarAccess.getArgumentAccess().getCommaKeyword_2_3_1_0(), null); 
    }
)?(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getArgumentAccess().getGroundsFactParserRuleCall_2_3_1_1_0(), currentNode); 
	    }
		lv_grounds_7_0=ruleFact		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getArgumentRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"grounds",
	        		lv_grounds_7_0, 
	        		"Fact", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
))*)?(	'warranted by' 
    {
        createLeafNode(grammarAccess.getArgumentAccess().getWarrantedByKeyword_2_4_0(), null); 
    }
((	',' 
    {
        createLeafNode(grammarAccess.getArgumentAccess().getCommaKeyword_2_4_1_0(), null); 
    }
)?(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getArgumentAccess().getWarrantsNodeParserRuleCall_2_4_1_1_0(), currentNode); 
	    }
		lv_warrants_10_0=ruleNode		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getArgumentRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"warrants",
	        		lv_warrants_10_0, 
	        		"Node", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
))*)?	'}' 
    {
        createLeafNode(grammarAccess.getArgumentAccess().getRightCurlyBracketKeyword_2_5(), null); 
    }
)?(	':' 
    {
        createLeafNode(grammarAccess.getArgumentAccess().getColonKeyword_3(), null); 
    }
)?(
(
		lv_description_13_0=RULE_STRING
		{
			createLeafNode(grammarAccess.getArgumentAccess().getDescriptionSTRINGTerminalRuleCall_4_0(), "description"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getArgumentRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"description",
	        		lv_description_13_0, 
	        		"STRING", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
)?)
;





// Entry rule entryRuleFact
entryRuleFact returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getFactRule(), currentNode); }
	 iv_ruleFact=ruleFact 
	 { $current=$iv_ruleFact.current; } 
	 EOF 
;

// Rule Fact
ruleFact returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
((
(
		lv_name_0_0=RULE_ID
		{
			createLeafNode(grammarAccess.getFactAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getFactRule().getType().getClassifier());
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
)	'G' 
    {
        createLeafNode(grammarAccess.getFactAccess().getGKeyword_1(), null); 
    }
((	':' 
    {
        createLeafNode(grammarAccess.getFactAccess().getColonKeyword_2_0(), null); 
    }
)?(
(
		lv_description_3_0=RULE_STRING
		{
			createLeafNode(grammarAccess.getFactAccess().getDescriptionSTRINGTerminalRuleCall_2_1_0(), "description"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getFactRule().getType().getClassifier());
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





// Entry rule entryRuleClaim
entryRuleClaim returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getClaimRule(), currentNode); }
	 iv_ruleClaim=ruleClaim 
	 { $current=$iv_ruleClaim.current; } 
	 EOF 
;

// Rule Claim
ruleClaim returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
((
(
		lv_name_0_0=RULE_ID
		{
			createLeafNode(grammarAccess.getClaimAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getClaimRule().getType().getClassifier());
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
)	'C' 
    {
        createLeafNode(grammarAccess.getClaimAccess().getCKeyword_1(), null); 
    }
((	':' 
    {
        createLeafNode(grammarAccess.getClaimAccess().getColonKeyword_2_0(), null); 
    }
)?(
(
		lv_description_3_0=RULE_STRING
		{
			createLeafNode(grammarAccess.getClaimAccess().getDescriptionSTRINGTerminalRuleCall_2_1_0(), "description"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getClaimRule().getType().getClassifier());
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
(
    { 
        currentNode=createCompositeNode(grammarAccess.getLinkAccess().getRebutsParserRuleCall_0(), currentNode); 
    }
    this_Rebuts_0=ruleRebuts
    { 
        $current = $this_Rebuts_0.current; 
        currentNode = currentNode.getParent();
    }

    |
    { 
        currentNode=createCompositeNode(grammarAccess.getLinkAccess().getMitigatesParserRuleCall_1(), currentNode); 
    }
    this_Mitigates_1=ruleMitigates
    { 
        $current = $this_Mitigates_1.current; 
        currentNode = currentNode.getParent();
    }
)
;





// Entry rule entryRuleRebuts
entryRuleRebuts returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getRebutsRule(), currentNode); }
	 iv_ruleRebuts=ruleRebuts 
	 { $current=$iv_ruleRebuts.current; } 
	 EOF 
;

// Rule Rebuts
ruleRebuts returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
((
(
		{
			if ($current==null) {
	            $current = factory.create(grammarAccess.getRebutsRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
        }
	RULE_ID
	{
		createLeafNode(grammarAccess.getRebutsAccess().getFromArgumentCrossReference_0_0(), "from"); 
	}

)
)	'rebuts' 
    {
        createLeafNode(grammarAccess.getRebutsAccess().getRebutsKeyword_1(), null); 
    }
(
(
		{
			if ($current==null) {
	            $current = factory.create(grammarAccess.getRebutsRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
        }
	RULE_ID
	{
		createLeafNode(grammarAccess.getRebutsAccess().getToArgumentCrossReference_2_0(), "to"); 
	}

)
))
;





// Entry rule entryRuleMitigates
entryRuleMitigates returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getMitigatesRule(), currentNode); }
	 iv_ruleMitigates=ruleMitigates 
	 { $current=$iv_ruleMitigates.current; } 
	 EOF 
;

// Rule Mitigates
ruleMitigates returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
((
(
		{
			if ($current==null) {
	            $current = factory.create(grammarAccess.getMitigatesRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
        }
	RULE_ID
	{
		createLeafNode(grammarAccess.getMitigatesAccess().getFromArgumentCrossReference_0_0(), "from"); 
	}

)
)	'mitigates' 
    {
        createLeafNode(grammarAccess.getMitigatesAccess().getMitigatesKeyword_1(), null); 
    }
(
(
		{
			if ($current==null) {
	            $current = factory.create(grammarAccess.getMitigatesRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
        }
	RULE_ID
	{
		createLeafNode(grammarAccess.getMitigatesAccess().getToArgumentCrossReference_2_0(), "to"); 
	}

)
))
;





RULE_ID : ('#' ~('#')+ '#'|'^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*);

RULE_QUALIFIED_NAME : RULE_ID ('.' RULE_ID)*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


