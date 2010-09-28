/*
* generated by Xtext
*/
grammar InternalDependency;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package uk.ac.open.dependency.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package uk.ac.open.dependency.parser.antlr.internal; 

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
import uk.ac.open.dependency.services.DependencyGrammarAccess;

}

@parser::members {

 	private DependencyGrammarAccess grammarAccess;
 	
    public InternalDependencyParser(TokenStream input, IAstFactory factory, DependencyGrammarAccess grammarAccess) {
        this(input);
        this.factory = factory;
        registerRules(grammarAccess.getGrammar());
        this.grammarAccess = grammarAccess;
    }
    
    @Override
    protected InputStream getTokenFile() {
    	ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("uk/ac/open/dependency/parser/antlr/internal/InternalDependency.tokens");
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Model";	
   	}
   	
   	@Override
   	protected DependencyGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getModelRule(), currentNode); }
	 iv_ruleModel=ruleModel 
	 { $current=$iv_ruleModel.current; } 
	 EOF 
;

// Rule Model
ruleModel returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
((
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getNodesNodeParserRuleCall_0_0(), currentNode); 
	    }
		lv_nodes_0_0=ruleNode		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"nodes",
	        		lv_nodes_0_0, 
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
	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getDependenciesDependencyParserRuleCall_1_0(), currentNode); 
	    }
		lv_dependencies_1_0=ruleDependency		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"dependencies",
	        		lv_dependencies_1_0, 
	        		"Dependency", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
))*
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
)(	'{' 
    {
        createLeafNode(grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_1_0(), null); 
    }
(	'see' 
    {
        createLeafNode(grammarAccess.getNodeAccess().getSeeKeyword_1_1_0(), null); 
    }
(
(
		lv_referrence_3_0=RULE_STRING
		{
			createLeafNode(grammarAccess.getNodeAccess().getReferrenceSTRINGTerminalRuleCall_1_1_1_0(), "referrence"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getNodeRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"referrence",
	        		lv_referrence_3_0, 
	        		"STRING", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
))*	'}' 
    {
        createLeafNode(grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_1_2(), null); 
    }
)?)
;





// Entry rule entryRuleDependency
entryRuleDependency returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getDependencyRule(), currentNode); }
	 iv_ruleDependency=ruleDependency 
	 { $current=$iv_ruleDependency.current; } 
	 EOF 
;

// Rule Dependency
ruleDependency returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(
    { 
        currentNode=createCompositeNode(grammarAccess.getDependencyAccess().getCouplingParserRuleCall_0(), currentNode); 
    }
    this_Coupling_0=ruleCoupling
    { 
        $current = $this_Coupling_0.current; 
        currentNode = currentNode.getParent();
    }

    |
    { 
        currentNode=createCompositeNode(grammarAccess.getDependencyAccess().getPrecedenceParserRuleCall_1(), currentNode); 
    }
    this_Precedence_1=rulePrecedence
    { 
        $current = $this_Precedence_1.current; 
        currentNode = currentNode.getParent();
    }
)
;





// Entry rule entryRuleCoupling
entryRuleCoupling returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getCouplingRule(), currentNode); }
	 iv_ruleCoupling=ruleCoupling 
	 { $current=$iv_ruleCoupling.current; } 
	 EOF 
;

// Rule Coupling
ruleCoupling returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
((
(
		{
			if ($current==null) {
	            $current = factory.create(grammarAccess.getCouplingRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
        }
	RULE_ID
	{
		createLeafNode(grammarAccess.getCouplingAccess().getFromNodeCrossReference_0_0(), "from"); 
	}

)
)	'--' 
    {
        createLeafNode(grammarAccess.getCouplingAccess().getHyphenMinusHyphenMinusKeyword_1(), null); 
    }
(
(
		{
			if ($current==null) {
	            $current = factory.create(grammarAccess.getCouplingRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
        }
	RULE_ID
	{
		createLeafNode(grammarAccess.getCouplingAccess().getToNodeCrossReference_2_0(), "to"); 
	}

)
))
;





// Entry rule entryRulePrecedence
entryRulePrecedence returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getPrecedenceRule(), currentNode); }
	 iv_rulePrecedence=rulePrecedence 
	 { $current=$iv_rulePrecedence.current; } 
	 EOF 
;

// Rule Precedence
rulePrecedence returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
((
(
		{
			if ($current==null) {
	            $current = factory.create(grammarAccess.getPrecedenceRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
        }
	RULE_ID
	{
		createLeafNode(grammarAccess.getPrecedenceAccess().getFromNodeCrossReference_0_0(), "from"); 
	}

)
)	'->' 
    {
        createLeafNode(grammarAccess.getPrecedenceAccess().getHyphenMinusGreaterThanSignKeyword_1(), null); 
    }
(
(
		{
			if ($current==null) {
	            $current = factory.create(grammarAccess.getPrecedenceRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
        }
	RULE_ID
	{
		createLeafNode(grammarAccess.getPrecedenceAccess().getToNodeCrossReference_2_0(), "to"); 
	}

)
))
;





RULE_ID : ('#' ~('#')+ '#'|'^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*);

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


