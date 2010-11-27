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
))?((
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getArgumentDiagramAccess().getNodesArgumentParserRuleCall_1_0_0(), currentNode); 
	    }
		lv_nodes_2_0=ruleArgument		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getArgumentDiagramRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"nodes",
	        		lv_nodes_2_0, 
	        		"Argument", 
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
	        currentNode=createCompositeNode(grammarAccess.getArgumentDiagramAccess().getLinksLinkParserRuleCall_1_1_0(), currentNode); 
	    }
		lv_links_3_0=ruleLink		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getArgumentDiagramRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"links",
	        		lv_links_3_0, 
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
)(	':' 
    {
        createLeafNode(grammarAccess.getArgumentAccess().getColonKeyword_1(), null); 
    }
)?(
(
		lv_description_2_0=RULE_STRING
		{
			createLeafNode(grammarAccess.getArgumentAccess().getDescriptionSTRINGTerminalRuleCall_2_0(), "description"); 
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
	        		lv_description_2_0, 
	        		"STRING", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
)(	'round' 
    {
        createLeafNode(grammarAccess.getArgumentAccess().getRoundKeyword_3_0(), null); 
    }
(
(
		lv_round_4_0=RULE_INT
		{
			createLeafNode(grammarAccess.getArgumentAccess().getRoundINTTerminalRuleCall_3_1_0(), "round"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getArgumentRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"round",
	        		lv_round_4_0, 
	        		"INT", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
))?(
(
		lv_expr_5_0=RULE_STRING
		{
			createLeafNode(grammarAccess.getArgumentAccess().getExprSTRINGTerminalRuleCall_4_0(), "expr"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getArgumentRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"expr",
	        		lv_expr_5_0, 
	        		"STRING", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
)?(	'replacing' 
    {
        createLeafNode(grammarAccess.getArgumentAccess().getReplacingKeyword_5_0(), null); 
    }
(
(
		{
			if ($current==null) {
	            $current = factory.create(grammarAccess.getArgumentRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
        }
	RULE_ID
	{
		createLeafNode(grammarAccess.getArgumentAccess().getOriginArgumentCrossReference_5_1_0(), "origin"); 
	}

)
))?(	'foreground' 
    {
        createLeafNode(grammarAccess.getArgumentAccess().getForegroundKeyword_6_0(), null); 
    }
(
(
		lv_foreground_9_0=RULE_STRING
		{
			createLeafNode(grammarAccess.getArgumentAccess().getForegroundSTRINGTerminalRuleCall_6_1_0(), "foreground"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getArgumentRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"foreground",
	        		lv_foreground_9_0, 
	        		"STRING", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
))?(	'background' 
    {
        createLeafNode(grammarAccess.getArgumentAccess().getBackgroundKeyword_7_0(), null); 
    }
(
(
		lv_background_11_0=RULE_STRING
		{
			createLeafNode(grammarAccess.getArgumentAccess().getBackgroundSTRINGTerminalRuleCall_7_1_0(), "background"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getArgumentRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"background",
	        		lv_background_11_0, 
	        		"STRING", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
))?(	'shape' 
    {
        createLeafNode(grammarAccess.getArgumentAccess().getShapeKeyword_8_0(), null); 
    }
(
(
		lv_shape_13_0=RULE_STRING
		{
			createLeafNode(grammarAccess.getArgumentAccess().getShapeSTRINGTerminalRuleCall_8_1_0(), "shape"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getArgumentRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"shape",
	        		lv_shape_13_0, 
	        		"STRING", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
))?(	'image' 
    {
        createLeafNode(grammarAccess.getArgumentAccess().getImageKeyword_9_0(), null); 
    }
(
(
		lv_image_15_0=RULE_STRING
		{
			createLeafNode(grammarAccess.getArgumentAccess().getImageSTRINGTerminalRuleCall_9_1_0(), "image"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getArgumentRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"image",
	        		lv_image_15_0, 
	        		"STRING", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
))?(	'{' 
    {
        createLeafNode(grammarAccess.getArgumentAccess().getLeftCurlyBracketKeyword_10_0(), null); 
    }
(	'supported by' 
    {
        createLeafNode(grammarAccess.getArgumentAccess().getSupportedByKeyword_10_1_0(), null); 
    }
((	',' 
    {
        createLeafNode(grammarAccess.getArgumentAccess().getCommaKeyword_10_1_1_0(), null); 
    }
)?(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getArgumentAccess().getGroundsArgumentParserRuleCall_10_1_1_1_0(), currentNode); 
	    }
		lv_grounds_19_0=ruleArgument		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getArgumentRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"grounds",
	        		lv_grounds_19_0, 
	        		"Argument", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
))*)?(	'warranted by' 
    {
        createLeafNode(grammarAccess.getArgumentAccess().getWarrantedByKeyword_10_2_0(), null); 
    }
((	',' 
    {
        createLeafNode(grammarAccess.getArgumentAccess().getCommaKeyword_10_2_1_0(), null); 
    }
)?(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getArgumentAccess().getWarrantsArgumentParserRuleCall_10_2_1_1_0(), currentNode); 
	    }
		lv_warrants_22_0=ruleArgument		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getArgumentRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"warrants",
	        		lv_warrants_22_0, 
	        		"Argument", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
))*)?	'}' 
    {
        createLeafNode(grammarAccess.getArgumentAccess().getRightCurlyBracketKeyword_10_3(), null); 
    }
)?)
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
)	'rebutted by' 
    {
        createLeafNode(grammarAccess.getRebutsAccess().getRebuttedByKeyword_1(), null); 
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
)	'mitigated by' 
    {
        createLeafNode(grammarAccess.getMitigatesAccess().getMitigatedByKeyword_1(), null); 
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
)	'on' 
    {
        createLeafNode(grammarAccess.getMitigatesAccess().getOnKeyword_3(), null); 
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
		createLeafNode(grammarAccess.getMitigatesAccess().getRebuttalArgumentCrossReference_4_0(), "rebuttal"); 
	}

)
))
;





RULE_INT : ('0'|'1'..'9' ('0'..'9')*);

RULE_BOOLEAN : ('true'|'false');

RULE_ID : ('#' ~('#')+ '#'|'^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*);

RULE_QUALIFIED_NAME : RULE_ID ('.' RULE_ID)*;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


