/*
* generated by Xtext
*/
grammar InternalRBAC;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package uk.ac.open.rbac.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package uk.ac.open.rbac.parser.antlr.internal; 

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
import uk.ac.open.rbac.services.RBACGrammarAccess;

}

@parser::members {

 	private RBACGrammarAccess grammarAccess;
 	
    public InternalRBACParser(TokenStream input, IAstFactory factory, RBACGrammarAccess grammarAccess) {
        this(input);
        this.factory = factory;
        registerRules(grammarAccess.getGrammar());
        this.grammarAccess = grammarAccess;
    }
    
    @Override
    protected InputStream getTokenFile() {
    	ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.tokens");
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Model";	
   	}
   	
   	@Override
   	protected RBACGrammarAccess getGrammarAccess() {
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
	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getRolesRoleParserRuleCall_0_0(), currentNode); 
	    }
		lv_roles_0_0=ruleRole		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"roles",
	        		lv_roles_0_0, 
	        		"Role", 
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
	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getUsersUserParserRuleCall_1_0(), currentNode); 
	    }
		lv_users_1_0=ruleUser		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"users",
	        		lv_users_1_0, 
	        		"User", 
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
	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getSessionsSessionParserRuleCall_2_0(), currentNode); 
	    }
		lv_sessions_2_0=ruleSession		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"sessions",
	        		lv_sessions_2_0, 
	        		"Session", 
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
	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getObjectsObjectParserRuleCall_3_0(), currentNode); 
	    }
		lv_objects_3_0=ruleObject		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"objects",
	        		lv_objects_3_0, 
	        		"Object", 
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
	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getPermissionsRolePermissionAssignmentParserRuleCall_4_0(), currentNode); 
	    }
		lv_permissions_4_0=ruleRolePermissionAssignment		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"permissions",
	        		lv_permissions_4_0, 
	        		"RolePermissionAssignment", 
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
	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getAssignmentsUserRoleAssignmentParserRuleCall_5_0(), currentNode); 
	    }
		lv_assignments_5_0=ruleUserRoleAssignment		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"assignments",
	        		lv_assignments_5_0, 
	        		"UserRoleAssignment", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
))*
;





// Entry rule entryRuleRole
entryRuleRole returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getRoleRule(), currentNode); }
	 iv_ruleRole=ruleRole 
	 { $current=$iv_ruleRole.current; } 
	 EOF 
;

// Rule Role
ruleRole returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(	'role' 
    {
        createLeafNode(grammarAccess.getRoleAccess().getRoleKeyword_0(), null); 
    }
(
(
		lv_name_1_0=RULE_ID
		{
			createLeafNode(grammarAccess.getRoleAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getRoleRule().getType().getClassifier());
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
))
;





// Entry rule entryRuleUser
entryRuleUser returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getUserRule(), currentNode); }
	 iv_ruleUser=ruleUser 
	 { $current=$iv_ruleUser.current; } 
	 EOF 
;

// Rule User
ruleUser returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(	'user' 
    {
        createLeafNode(grammarAccess.getUserAccess().getUserKeyword_0(), null); 
    }
(
(
		lv_name_1_0=RULE_ID
		{
			createLeafNode(grammarAccess.getUserAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getUserRule().getType().getClassifier());
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
))
;





// Entry rule entryRuleObject
entryRuleObject returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getObjectRule(), currentNode); }
	 iv_ruleObject=ruleObject 
	 { $current=$iv_ruleObject.current; } 
	 EOF 
;

// Rule Object
ruleObject returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(	'object' 
    {
        createLeafNode(grammarAccess.getObjectAccess().getObjectKeyword_0(), null); 
    }
(
(
		lv_name_1_0=RULE_ID
		{
			createLeafNode(grammarAccess.getObjectAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getObjectRule().getType().getClassifier());
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
)	':' 
    {
        createLeafNode(grammarAccess.getObjectAccess().getColonKeyword_2(), null); 
    }
(
(
		lv_type_3_0=RULE_STRING
		{
			createLeafNode(grammarAccess.getObjectAccess().getTypeSTRINGTerminalRuleCall_3_0(), "type"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getObjectRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"type",
	        		lv_type_3_0, 
	        		"STRING", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
))
;





// Entry rule entryRuleSession
entryRuleSession returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getSessionRule(), currentNode); }
	 iv_ruleSession=ruleSession 
	 { $current=$iv_ruleSession.current; } 
	 EOF 
;

// Rule Session
ruleSession returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(	'session' 
    {
        createLeafNode(grammarAccess.getSessionAccess().getSessionKeyword_0(), null); 
    }
(
(
		lv_name_1_0=RULE_ID
		{
			createLeafNode(grammarAccess.getSessionAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getSessionRule().getType().getClassifier());
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
)	'{' 
    {
        createLeafNode(grammarAccess.getSessionAccess().getLeftCurlyBracketKeyword_2(), null); 
    }
(
(
		{
			if ($current==null) {
	            $current = factory.create(grammarAccess.getSessionRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
        }
	RULE_ID
	{
		createLeafNode(grammarAccess.getSessionAccess().getAssignmentsUserRoleAssignmentCrossReference_3_0(), "assignments"); 
	}

)
)*	'}' 
    {
        createLeafNode(grammarAccess.getSessionAccess().getRightCurlyBracketKeyword_4(), null); 
    }
)
;





// Entry rule entryRuleUserRoleAssignment
entryRuleUserRoleAssignment returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getUserRoleAssignmentRule(), currentNode); }
	 iv_ruleUserRoleAssignment=ruleUserRoleAssignment 
	 { $current=$iv_ruleUserRoleAssignment.current; } 
	 EOF 
;

// Rule UserRoleAssignment
ruleUserRoleAssignment returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
((
(
		lv_name_0_0=RULE_ID
		{
			createLeafNode(grammarAccess.getUserRoleAssignmentAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getUserRoleAssignmentRule().getType().getClassifier());
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
			if ($current==null) {
	            $current = factory.create(grammarAccess.getUserRoleAssignmentRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
        }
	RULE_ID
	{
		createLeafNode(grammarAccess.getUserRoleAssignmentAccess().getUserUserCrossReference_1_0(), "user"); 
	}

)
)	':' 
    {
        createLeafNode(grammarAccess.getUserRoleAssignmentAccess().getColonKeyword_2(), null); 
    }
(
(
		{
			if ($current==null) {
	            $current = factory.create(grammarAccess.getUserRoleAssignmentRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
        }
	RULE_ID
	{
		createLeafNode(grammarAccess.getUserRoleAssignmentAccess().getRoleRoleCrossReference_3_0(), "role"); 
	}

)
))
;





// Entry rule entryRuleRolePermissionAssignment
entryRuleRolePermissionAssignment returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getRolePermissionAssignmentRule(), currentNode); }
	 iv_ruleRolePermissionAssignment=ruleRolePermissionAssignment 
	 { $current=$iv_ruleRolePermissionAssignment.current; } 
	 EOF 
;

// Rule RolePermissionAssignment
ruleRolePermissionAssignment returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
((
(
		{
			if ($current==null) {
	            $current = factory.create(grammarAccess.getRolePermissionAssignmentRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
        }
	RULE_ID
	{
		createLeafNode(grammarAccess.getRolePermissionAssignmentAccess().getRoleRoleCrossReference_0_0(), "role"); 
	}

)
)(
(
		lv_type_1_0=RULE_STRING
		{
			createLeafNode(grammarAccess.getRolePermissionAssignmentAccess().getTypeSTRINGTerminalRuleCall_1_0(), "type"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getRolePermissionAssignmentRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"type",
	        		lv_type_1_0, 
	        		"STRING", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
)(
(
		{
			if ($current==null) {
	            $current = factory.create(grammarAccess.getRolePermissionAssignmentRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
        }
	RULE_ID
	{
		createLeafNode(grammarAccess.getRolePermissionAssignmentAccess().getObjectObjectCrossReference_2_0(), "object"); 
	}

)
))
;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


