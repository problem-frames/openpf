/*
* generated by Xtext
*/
grammar InternalPF;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package uk.ac.open.pf.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package uk.ac.open.pf.parser.antlr.internal; 

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
import uk.ac.open.pf.services.PFGrammarAccess;

}

@parser::members {

 	private PFGrammarAccess grammarAccess;
 	
    public InternalPFParser(TokenStream input, IAstFactory factory, PFGrammarAccess grammarAccess) {
        this(input);
        this.factory = factory;
        registerRules(grammarAccess.getGrammar());
        this.grammarAccess = grammarAccess;
    }
    
    @Override
    protected InputStream getTokenFile() {
    	ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("uk/ac/open/pf/parser/antlr/internal/InternalPF.tokens");
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "RootDiagram";	
   	}
   	
   	@Override
   	protected PFGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleRootDiagram
entryRuleRootDiagram returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getRootDiagramRule(), currentNode); }
	 iv_ruleRootDiagram=ruleRootDiagram 
	 { $current=$iv_ruleRootDiagram.current; } 
	 EOF 
;

// Rule RootDiagram
ruleRootDiagram returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
((
    { 
        temp=factory.create(grammarAccess.getRootDiagramAccess().getRootDiagramAction_0().getType().getClassifier());
        $current = temp; 
        temp = null;
        CompositeNode newNode = createCompositeNode(grammarAccess.getRootDiagramAccess().getRootDiagramAction_0(), currentNode.getParent());
    newNode.getChildren().add(currentNode);
    moveLookaheadInfo(currentNode, newNode);
    currentNode = newNode; 
        associateNodeWithAstElement(currentNode, $current); 
    }
)RULE_VALUE
    { 
    createLeafNode(grammarAccess.getRootDiagramAccess().getValueTerminalRuleCall_1(), null); 
    }
	'@' 
    {
        createLeafNode(grammarAccess.getRootDiagramAccess().getCommercialAtKeyword_2(), null); 
    }
	'cycle' 
    {
        createLeafNode(grammarAccess.getRootDiagramAccess().getCycleKeyword_3(), null); 
    }
	'(' 
    {
        createLeafNode(grammarAccess.getRootDiagramAccess().getLeftParenthesisKeyword_4(), null); 
    }
	'(' 
    {
        createLeafNode(grammarAccess.getRootDiagramAccess().getLeftParenthesisKeyword_5(), null); 
    }
(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getRootDiagramAccess().getObjectsNodeParserRuleCall_6_0(), currentNode); 
	    }
		lv_objects_6_0=ruleNode		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getRootDiagramRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"objects",
	        		lv_objects_6_0, 
	        		"Node", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
)(	',' 
    {
        createLeafNode(grammarAccess.getRootDiagramAccess().getCommaKeyword_7_0(), null); 
    }
(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getRootDiagramAccess().getObjectsNodeParserRuleCall_7_1_0(), currentNode); 
	    }
		lv_objects_8_0=ruleNode		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getRootDiagramRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"objects",
	        		lv_objects_8_0, 
	        		"Node", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
))*	')' 
    {
        createLeafNode(grammarAccess.getRootDiagramAccess().getRightParenthesisKeyword_8(), null); 
    }
	')' 
    {
        createLeafNode(grammarAccess.getRootDiagramAccess().getRightParenthesisKeyword_9(), null); 
    }
)
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
		lv_name_0_0=RULE_VALUE
		{
			createLeafNode(grammarAccess.getNodeAccess().getNameValueTerminalRuleCall_0_0(), "name"); 
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
	        		"Value", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
)	':=' 
    {
        createLeafNode(grammarAccess.getNodeAccess().getColonEqualsSignKeyword_1(), null); 
    }
(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getNodeAccess().getCompositeCompositeObjectParserRuleCall_2_0(), currentNode); 
	    }
		lv_composite_2_0=ruleCompositeObject		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getNodeRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"composite",
	        		lv_composite_2_0, 
	        		"CompositeObject", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
))
;





// Entry rule entryRuleCompositeObject
entryRuleCompositeObject returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getCompositeObjectRule(), currentNode); }
	 iv_ruleCompositeObject=ruleCompositeObject 
	 { $current=$iv_ruleCompositeObject.current; } 
	 EOF 
;

// Rule CompositeObject
ruleCompositeObject returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
((
    { 
        temp=factory.create(grammarAccess.getCompositeObjectAccess().getCompositeObjectAction_0().getType().getClassifier());
        $current = temp; 
        temp = null;
        CompositeNode newNode = createCompositeNode(grammarAccess.getCompositeObjectAccess().getCompositeObjectAction_0(), currentNode.getParent());
    newNode.getChildren().add(currentNode);
    moveLookaheadInfo(currentNode, newNode);
    currentNode = newNode; 
        associateNodeWithAstElement(currentNode, $current); 
    }
)	'{' 
    {
        createLeafNode(grammarAccess.getCompositeObjectAccess().getLeftCurlyBracketKeyword_1(), null); 
    }
(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getCompositeObjectAccess().getFieldsFieldParserRuleCall_2_0(), currentNode); 
	    }
		lv_fields_2_0=ruleField		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getCompositeObjectRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"fields",
	        		lv_fields_2_0, 
	        		"Field", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
)?(	',' 
    {
        createLeafNode(grammarAccess.getCompositeObjectAccess().getCommaKeyword_3_0(), null); 
    }
(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getCompositeObjectAccess().getFieldsFieldParserRuleCall_3_1_0(), currentNode); 
	    }
		lv_fields_4_0=ruleField		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getCompositeObjectRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"fields",
	        		lv_fields_4_0, 
	        		"Field", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
))*	'}' 
    {
        createLeafNode(grammarAccess.getCompositeObjectAccess().getRightCurlyBracketKeyword_4(), null); 
    }
)
;





// Entry rule entryRuleField
entryRuleField returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getFieldRule(), currentNode); }
	 iv_ruleField=ruleField 
	 { $current=$iv_ruleField.current; } 
	 EOF 
;

// Rule Field
ruleField returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(
    { 
        currentNode=createCompositeNode(grammarAccess.getFieldAccess().getSimpleFieldParserRuleCall_0(), currentNode); 
    }
    this_SimpleField_0=ruleSimpleField
    { 
        $current = $this_SimpleField_0.current; 
        currentNode = currentNode.getParent();
    }

    |
    { 
        currentNode=createCompositeNode(grammarAccess.getFieldAccess().getCompositeFieldParserRuleCall_1(), currentNode); 
    }
    this_CompositeField_1=ruleCompositeField
    { 
        $current = $this_CompositeField_1.current; 
        currentNode = currentNode.getParent();
    }
)
;





// Entry rule entryRuleSimpleField
entryRuleSimpleField returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getSimpleFieldRule(), currentNode); }
	 iv_ruleSimpleField=ruleSimpleField 
	 { $current=$iv_ruleSimpleField.current; } 
	 EOF 
;

// Rule SimpleField
ruleSimpleField returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
((
(
		lv_name_0_0=RULE_ID
		{
			createLeafNode(grammarAccess.getSimpleFieldAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getSimpleFieldRule().getType().getClassifier());
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
)	':' 
    {
        createLeafNode(grammarAccess.getSimpleFieldAccess().getColonKeyword_1(), null); 
    }
((
(
		lv_value_2_0=RULE_VALUE
		{
			createLeafNode(grammarAccess.getSimpleFieldAccess().getValueValueTerminalRuleCall_2_0_0(), "value"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getSimpleFieldRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"value",
	        		lv_value_2_0, 
	        		"Value", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
)
    |(
(
		lv_value_3_0=RULE_STRING
		{
			createLeafNode(grammarAccess.getSimpleFieldAccess().getValueSTRINGTerminalRuleCall_2_1_0(), "value"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getSimpleFieldRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"value",
	        		lv_value_3_0, 
	        		"STRING", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
)))
;





// Entry rule entryRuleCompositeField
entryRuleCompositeField returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getCompositeFieldRule(), currentNode); }
	 iv_ruleCompositeField=ruleCompositeField 
	 { $current=$iv_ruleCompositeField.current; } 
	 EOF 
;

// Rule CompositeField
ruleCompositeField returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
((
(
		lv_name_0_0=RULE_ID
		{
			createLeafNode(grammarAccess.getCompositeFieldAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getCompositeFieldRule().getType().getClassifier());
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
)	':' 
    {
        createLeafNode(grammarAccess.getCompositeFieldAccess().getColonKeyword_1(), null); 
    }
(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getCompositeFieldAccess().getValueCompositeObjectParserRuleCall_2_0(), currentNode); 
	    }
		lv_value_2_0=ruleCompositeObject		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getCompositeFieldRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"value",
	        		lv_value_2_0, 
	        		"CompositeObject", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
))
;





RULE_VALUE : '&' RULE_ID;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;

