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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRBACParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'role'", "'{'", "'}'", "'user'", "'object'", "'session'", "':'", "'='"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

        public InternalRBACParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g"; }



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



    // $ANTLR start entryRuleModel
    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:77:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:78:2: (iv_ruleModel= ruleModel EOF )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:79:2: iv_ruleModel= ruleModel EOF
            {
             currentNode = createCompositeNode(grammarAccess.getModelRule(), currentNode); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();
            _fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleModel


    // $ANTLR start ruleModel
    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:86:1: ruleModel returns [EObject current=null] : ( ( (lv_roles_0_0= ruleRole ) ) | ( (lv_users_1_0= ruleUser ) ) | ( (lv_sessions_2_0= ruleSession ) ) | ( (lv_objects_3_0= ruleObject ) ) | ( (lv_permissions_4_0= rulePermission ) ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_roles_0_0 = null;

        EObject lv_users_1_0 = null;

        EObject lv_sessions_2_0 = null;

        EObject lv_objects_3_0 = null;

        EObject lv_permissions_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:91:6: ( ( ( (lv_roles_0_0= ruleRole ) ) | ( (lv_users_1_0= ruleUser ) ) | ( (lv_sessions_2_0= ruleSession ) ) | ( (lv_objects_3_0= ruleObject ) ) | ( (lv_permissions_4_0= rulePermission ) ) )* )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:92:1: ( ( (lv_roles_0_0= ruleRole ) ) | ( (lv_users_1_0= ruleUser ) ) | ( (lv_sessions_2_0= ruleSession ) ) | ( (lv_objects_3_0= ruleObject ) ) | ( (lv_permissions_4_0= rulePermission ) ) )*
            {
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:92:1: ( ( (lv_roles_0_0= ruleRole ) ) | ( (lv_users_1_0= ruleUser ) ) | ( (lv_sessions_2_0= ruleSession ) ) | ( (lv_objects_3_0= ruleObject ) ) | ( (lv_permissions_4_0= rulePermission ) ) )*
            loop1:
            do {
                int alt1=6;
                switch ( input.LA(1) ) {
                case 11:
                    {
                    alt1=1;
                    }
                    break;
                case 14:
                    {
                    alt1=2;
                    }
                    break;
                case 16:
                    {
                    alt1=3;
                    }
                    break;
                case 15:
                    {
                    alt1=4;
                    }
                    break;
                case RULE_STRING:
                    {
                    alt1=5;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:92:2: ( (lv_roles_0_0= ruleRole ) )
            	    {
            	    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:92:2: ( (lv_roles_0_0= ruleRole ) )
            	    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:93:1: (lv_roles_0_0= ruleRole )
            	    {
            	    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:93:1: (lv_roles_0_0= ruleRole )
            	    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:94:3: lv_roles_0_0= ruleRole
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getRolesRoleParserRuleCall_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleRole_in_ruleModel131);
            	    lv_roles_0_0=ruleRole();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"roles",
            	    	        		lv_roles_0_0, 
            	    	        		"Role", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:117:6: ( (lv_users_1_0= ruleUser ) )
            	    {
            	    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:117:6: ( (lv_users_1_0= ruleUser ) )
            	    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:118:1: (lv_users_1_0= ruleUser )
            	    {
            	    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:118:1: (lv_users_1_0= ruleUser )
            	    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:119:3: lv_users_1_0= ruleUser
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getUsersUserParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleUser_in_ruleModel158);
            	    lv_users_1_0=ruleUser();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"users",
            	    	        		lv_users_1_0, 
            	    	        		"User", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:142:6: ( (lv_sessions_2_0= ruleSession ) )
            	    {
            	    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:142:6: ( (lv_sessions_2_0= ruleSession ) )
            	    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:143:1: (lv_sessions_2_0= ruleSession )
            	    {
            	    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:143:1: (lv_sessions_2_0= ruleSession )
            	    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:144:3: lv_sessions_2_0= ruleSession
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getSessionsSessionParserRuleCall_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleSession_in_ruleModel185);
            	    lv_sessions_2_0=ruleSession();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"sessions",
            	    	        		lv_sessions_2_0, 
            	    	        		"Session", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:167:6: ( (lv_objects_3_0= ruleObject ) )
            	    {
            	    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:167:6: ( (lv_objects_3_0= ruleObject ) )
            	    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:168:1: (lv_objects_3_0= ruleObject )
            	    {
            	    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:168:1: (lv_objects_3_0= ruleObject )
            	    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:169:3: lv_objects_3_0= ruleObject
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getObjectsObjectParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleObject_in_ruleModel212);
            	    lv_objects_3_0=ruleObject();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"objects",
            	    	        		lv_objects_3_0, 
            	    	        		"Object", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:192:6: ( (lv_permissions_4_0= rulePermission ) )
            	    {
            	    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:192:6: ( (lv_permissions_4_0= rulePermission ) )
            	    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:193:1: (lv_permissions_4_0= rulePermission )
            	    {
            	    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:193:1: (lv_permissions_4_0= rulePermission )
            	    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:194:3: lv_permissions_4_0= rulePermission
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getPermissionsPermissionParserRuleCall_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_rulePermission_in_ruleModel239);
            	    lv_permissions_4_0=rulePermission();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"permissions",
            	    	        		lv_permissions_4_0, 
            	    	        		"Permission", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleModel


    // $ANTLR start entryRuleRole
    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:224:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:225:2: (iv_ruleRole= ruleRole EOF )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:226:2: iv_ruleRole= ruleRole EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRoleRule(), currentNode); 
            pushFollow(FOLLOW_ruleRole_in_entryRuleRole276);
            iv_ruleRole=ruleRole();
            _fsp--;

             current =iv_ruleRole; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRole286); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleRole


    // $ANTLR start ruleRole
    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:233:1: ruleRole returns [EObject current=null] : ( 'role' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_permissions_3_0= ruleRolePermissionAssignment ) )* '}' ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_permissions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:238:6: ( ( 'role' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_permissions_3_0= ruleRolePermissionAssignment ) )* '}' ) )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:239:1: ( 'role' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_permissions_3_0= ruleRolePermissionAssignment ) )* '}' )
            {
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:239:1: ( 'role' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_permissions_3_0= ruleRolePermissionAssignment ) )* '}' )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:239:3: 'role' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_permissions_3_0= ruleRolePermissionAssignment ) )* '}'
            {
            match(input,11,FOLLOW_11_in_ruleRole321); 

                    createLeafNode(grammarAccess.getRoleAccess().getRoleKeyword_0(), null); 
                
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:243:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:244:1: (lv_name_1_0= RULE_ID )
            {
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:244:1: (lv_name_1_0= RULE_ID )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:245:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRole338); 

            			createLeafNode(grammarAccess.getRoleAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getRoleRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,12,FOLLOW_12_in_ruleRole353); 

                    createLeafNode(grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:271:1: ( (lv_permissions_3_0= ruleRolePermissionAssignment ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:272:1: (lv_permissions_3_0= ruleRolePermissionAssignment )
            	    {
            	    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:272:1: (lv_permissions_3_0= ruleRolePermissionAssignment )
            	    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:273:3: lv_permissions_3_0= ruleRolePermissionAssignment
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getRoleAccess().getPermissionsRolePermissionAssignmentParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleRolePermissionAssignment_in_ruleRole374);
            	    lv_permissions_3_0=ruleRolePermissionAssignment();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getRoleRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"permissions",
            	    	        		lv_permissions_3_0, 
            	    	        		"RolePermissionAssignment", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match(input,13,FOLLOW_13_in_ruleRole385); 

                    createLeafNode(grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleRole


    // $ANTLR start entryRuleUser
    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:307:1: entryRuleUser returns [EObject current=null] : iv_ruleUser= ruleUser EOF ;
    public final EObject entryRuleUser() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUser = null;


        try {
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:308:2: (iv_ruleUser= ruleUser EOF )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:309:2: iv_ruleUser= ruleUser EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUserRule(), currentNode); 
            pushFollow(FOLLOW_ruleUser_in_entryRuleUser421);
            iv_ruleUser=ruleUser();
            _fsp--;

             current =iv_ruleUser; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUser431); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleUser


    // $ANTLR start ruleUser
    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:316:1: ruleUser returns [EObject current=null] : ( 'user' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleUser() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:321:6: ( ( 'user' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:322:1: ( 'user' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:322:1: ( 'user' ( (lv_name_1_0= RULE_ID ) ) )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:322:3: 'user' ( (lv_name_1_0= RULE_ID ) )
            {
            match(input,14,FOLLOW_14_in_ruleUser466); 

                    createLeafNode(grammarAccess.getUserAccess().getUserKeyword_0(), null); 
                
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:326:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:327:1: (lv_name_1_0= RULE_ID )
            {
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:327:1: (lv_name_1_0= RULE_ID )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:328:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUser483); 

            			createLeafNode(grammarAccess.getUserAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getUserRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleUser


    // $ANTLR start entryRulePermission
    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:358:1: entryRulePermission returns [EObject current=null] : iv_rulePermission= rulePermission EOF ;
    public final EObject entryRulePermission() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePermission = null;


        try {
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:359:2: (iv_rulePermission= rulePermission EOF )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:360:2: iv_rulePermission= rulePermission EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPermissionRule(), currentNode); 
            pushFollow(FOLLOW_rulePermission_in_entryRulePermission524);
            iv_rulePermission=rulePermission();
            _fsp--;

             current =iv_rulePermission; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePermission534); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePermission


    // $ANTLR start rulePermission
    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:367:1: rulePermission returns [EObject current=null] : ( ( (lv_type_0_0= RULE_STRING ) ) ( ( RULE_ID ) ) ( ( RULE_ID ) ) ) ;
    public final EObject rulePermission() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:372:6: ( ( ( (lv_type_0_0= RULE_STRING ) ) ( ( RULE_ID ) ) ( ( RULE_ID ) ) ) )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:373:1: ( ( (lv_type_0_0= RULE_STRING ) ) ( ( RULE_ID ) ) ( ( RULE_ID ) ) )
            {
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:373:1: ( ( (lv_type_0_0= RULE_STRING ) ) ( ( RULE_ID ) ) ( ( RULE_ID ) ) )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:373:2: ( (lv_type_0_0= RULE_STRING ) ) ( ( RULE_ID ) ) ( ( RULE_ID ) )
            {
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:373:2: ( (lv_type_0_0= RULE_STRING ) )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:374:1: (lv_type_0_0= RULE_STRING )
            {
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:374:1: (lv_type_0_0= RULE_STRING )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:375:3: lv_type_0_0= RULE_STRING
            {
            lv_type_0_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePermission576); 

            			createLeafNode(grammarAccess.getPermissionAccess().getTypeSTRINGTerminalRuleCall_0_0(), "type"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPermissionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"type",
            	        		lv_type_0_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:397:2: ( ( RULE_ID ) )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:398:1: ( RULE_ID )
            {
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:398:1: ( RULE_ID )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:399:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getPermissionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePermission599); 

            		createLeafNode(grammarAccess.getPermissionAccess().getRoleRoleCrossReference_1_0(), "role"); 
            	

            }


            }

            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:411:2: ( ( RULE_ID ) )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:412:1: ( RULE_ID )
            {
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:412:1: ( RULE_ID )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:413:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getPermissionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePermission617); 

            		createLeafNode(grammarAccess.getPermissionAccess().getObjectObjectCrossReference_2_0(), "object"); 
            	

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePermission


    // $ANTLR start entryRuleObject
    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:433:1: entryRuleObject returns [EObject current=null] : iv_ruleObject= ruleObject EOF ;
    public final EObject entryRuleObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObject = null;


        try {
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:434:2: (iv_ruleObject= ruleObject EOF )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:435:2: iv_ruleObject= ruleObject EOF
            {
             currentNode = createCompositeNode(grammarAccess.getObjectRule(), currentNode); 
            pushFollow(FOLLOW_ruleObject_in_entryRuleObject653);
            iv_ruleObject=ruleObject();
            _fsp--;

             current =iv_ruleObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObject663); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleObject


    // $ANTLR start ruleObject
    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:442:1: ruleObject returns [EObject current=null] : ( 'object' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleObject() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:447:6: ( ( 'object' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:448:1: ( 'object' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:448:1: ( 'object' ( (lv_name_1_0= RULE_ID ) ) )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:448:3: 'object' ( (lv_name_1_0= RULE_ID ) )
            {
            match(input,15,FOLLOW_15_in_ruleObject698); 

                    createLeafNode(grammarAccess.getObjectAccess().getObjectKeyword_0(), null); 
                
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:452:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:453:1: (lv_name_1_0= RULE_ID )
            {
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:453:1: (lv_name_1_0= RULE_ID )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:454:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleObject715); 

            			createLeafNode(grammarAccess.getObjectAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getObjectRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleObject


    // $ANTLR start entryRuleSession
    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:484:1: entryRuleSession returns [EObject current=null] : iv_ruleSession= ruleSession EOF ;
    public final EObject entryRuleSession() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSession = null;


        try {
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:485:2: (iv_ruleSession= ruleSession EOF )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:486:2: iv_ruleSession= ruleSession EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSessionRule(), currentNode); 
            pushFollow(FOLLOW_ruleSession_in_entryRuleSession756);
            iv_ruleSession=ruleSession();
            _fsp--;

             current =iv_ruleSession; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSession766); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSession


    // $ANTLR start ruleSession
    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:493:1: ruleSession returns [EObject current=null] : ( 'session' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_assignments_3_0= ruleUserRoleAssignment ) )* '}' ) ;
    public final EObject ruleSession() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_assignments_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:498:6: ( ( 'session' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_assignments_3_0= ruleUserRoleAssignment ) )* '}' ) )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:499:1: ( 'session' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_assignments_3_0= ruleUserRoleAssignment ) )* '}' )
            {
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:499:1: ( 'session' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_assignments_3_0= ruleUserRoleAssignment ) )* '}' )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:499:3: 'session' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_assignments_3_0= ruleUserRoleAssignment ) )* '}'
            {
            match(input,16,FOLLOW_16_in_ruleSession801); 

                    createLeafNode(grammarAccess.getSessionAccess().getSessionKeyword_0(), null); 
                
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:503:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:504:1: (lv_name_1_0= RULE_ID )
            {
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:504:1: (lv_name_1_0= RULE_ID )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:505:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSession818); 

            			createLeafNode(grammarAccess.getSessionAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSessionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,12,FOLLOW_12_in_ruleSession833); 

                    createLeafNode(grammarAccess.getSessionAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:531:1: ( (lv_assignments_3_0= ruleUserRoleAssignment ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:532:1: (lv_assignments_3_0= ruleUserRoleAssignment )
            	    {
            	    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:532:1: (lv_assignments_3_0= ruleUserRoleAssignment )
            	    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:533:3: lv_assignments_3_0= ruleUserRoleAssignment
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getSessionAccess().getAssignmentsUserRoleAssignmentParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleUserRoleAssignment_in_ruleSession854);
            	    lv_assignments_3_0=ruleUserRoleAssignment();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getSessionRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"assignments",
            	    	        		lv_assignments_3_0, 
            	    	        		"UserRoleAssignment", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match(input,13,FOLLOW_13_in_ruleSession865); 

                    createLeafNode(grammarAccess.getSessionAccess().getRightCurlyBracketKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSession


    // $ANTLR start entryRuleUserRoleAssignment
    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:567:1: entryRuleUserRoleAssignment returns [EObject current=null] : iv_ruleUserRoleAssignment= ruleUserRoleAssignment EOF ;
    public final EObject entryRuleUserRoleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUserRoleAssignment = null;


        try {
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:568:2: (iv_ruleUserRoleAssignment= ruleUserRoleAssignment EOF )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:569:2: iv_ruleUserRoleAssignment= ruleUserRoleAssignment EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUserRoleAssignmentRule(), currentNode); 
            pushFollow(FOLLOW_ruleUserRoleAssignment_in_entryRuleUserRoleAssignment901);
            iv_ruleUserRoleAssignment=ruleUserRoleAssignment();
            _fsp--;

             current =iv_ruleUserRoleAssignment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUserRoleAssignment911); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleUserRoleAssignment


    // $ANTLR start ruleUserRoleAssignment
    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:576:1: ruleUserRoleAssignment returns [EObject current=null] : ( ( ( RULE_ID ) ) ':' ( ( RULE_ID ) ) ) ;
    public final EObject ruleUserRoleAssignment() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:581:6: ( ( ( ( RULE_ID ) ) ':' ( ( RULE_ID ) ) ) )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:582:1: ( ( ( RULE_ID ) ) ':' ( ( RULE_ID ) ) )
            {
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:582:1: ( ( ( RULE_ID ) ) ':' ( ( RULE_ID ) ) )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:582:2: ( ( RULE_ID ) ) ':' ( ( RULE_ID ) )
            {
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:582:2: ( ( RULE_ID ) )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:583:1: ( RULE_ID )
            {
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:583:1: ( RULE_ID )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:584:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getUserRoleAssignmentRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUserRoleAssignment954); 

            		createLeafNode(grammarAccess.getUserRoleAssignmentAccess().getUserUserCrossReference_0_0(), "user"); 
            	

            }


            }

            match(input,17,FOLLOW_17_in_ruleUserRoleAssignment964); 

                    createLeafNode(grammarAccess.getUserRoleAssignmentAccess().getColonKeyword_1(), null); 
                
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:600:1: ( ( RULE_ID ) )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:601:1: ( RULE_ID )
            {
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:601:1: ( RULE_ID )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:602:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getUserRoleAssignmentRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUserRoleAssignment982); 

            		createLeafNode(grammarAccess.getUserRoleAssignmentAccess().getRoleRoleCrossReference_2_0(), "role"); 
            	

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleUserRoleAssignment


    // $ANTLR start entryRuleRolePermissionAssignment
    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:622:1: entryRuleRolePermissionAssignment returns [EObject current=null] : iv_ruleRolePermissionAssignment= ruleRolePermissionAssignment EOF ;
    public final EObject entryRuleRolePermissionAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRolePermissionAssignment = null;


        try {
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:623:2: (iv_ruleRolePermissionAssignment= ruleRolePermissionAssignment EOF )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:624:2: iv_ruleRolePermissionAssignment= ruleRolePermissionAssignment EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRolePermissionAssignmentRule(), currentNode); 
            pushFollow(FOLLOW_ruleRolePermissionAssignment_in_entryRuleRolePermissionAssignment1018);
            iv_ruleRolePermissionAssignment=ruleRolePermissionAssignment();
            _fsp--;

             current =iv_ruleRolePermissionAssignment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRolePermissionAssignment1028); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleRolePermissionAssignment


    // $ANTLR start ruleRolePermissionAssignment
    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:631:1: ruleRolePermissionAssignment returns [EObject current=null] : ( ( ( RULE_ID ) ) '=' ( ( RULE_ID ) ) ) ;
    public final EObject ruleRolePermissionAssignment() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:636:6: ( ( ( ( RULE_ID ) ) '=' ( ( RULE_ID ) ) ) )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:637:1: ( ( ( RULE_ID ) ) '=' ( ( RULE_ID ) ) )
            {
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:637:1: ( ( ( RULE_ID ) ) '=' ( ( RULE_ID ) ) )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:637:2: ( ( RULE_ID ) ) '=' ( ( RULE_ID ) )
            {
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:637:2: ( ( RULE_ID ) )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:638:1: ( RULE_ID )
            {
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:638:1: ( RULE_ID )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:639:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getRolePermissionAssignmentRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRolePermissionAssignment1071); 

            		createLeafNode(grammarAccess.getRolePermissionAssignmentAccess().getRoleRoleCrossReference_0_0(), "role"); 
            	

            }


            }

            match(input,18,FOLLOW_18_in_ruleRolePermissionAssignment1081); 

                    createLeafNode(grammarAccess.getRolePermissionAssignmentAccess().getEqualsSignKeyword_1(), null); 
                
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:655:1: ( ( RULE_ID ) )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:656:1: ( RULE_ID )
            {
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:656:1: ( RULE_ID )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:657:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getRolePermissionAssignmentRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRolePermissionAssignment1099); 

            		createLeafNode(grammarAccess.getRolePermissionAssignmentAccess().getPermissionPermissionCrossReference_2_0(), "permission"); 
            	

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleRolePermissionAssignment


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRole_in_ruleModel131 = new BitSet(new long[]{0x000000000001C822L});
    public static final BitSet FOLLOW_ruleUser_in_ruleModel158 = new BitSet(new long[]{0x000000000001C822L});
    public static final BitSet FOLLOW_ruleSession_in_ruleModel185 = new BitSet(new long[]{0x000000000001C822L});
    public static final BitSet FOLLOW_ruleObject_in_ruleModel212 = new BitSet(new long[]{0x000000000001C822L});
    public static final BitSet FOLLOW_rulePermission_in_ruleModel239 = new BitSet(new long[]{0x000000000001C822L});
    public static final BitSet FOLLOW_ruleRole_in_entryRuleRole276 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRole286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleRole321 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRole338 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRole353 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_ruleRolePermissionAssignment_in_ruleRole374 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_13_in_ruleRole385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUser_in_entryRuleUser421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUser431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleUser466 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUser483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePermission_in_entryRulePermission524 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePermission534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePermission576 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePermission599 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePermission617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObject_in_entryRuleObject653 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObject663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleObject698 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleObject715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSession_in_entryRuleSession756 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSession766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleSession801 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSession818 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSession833 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_ruleUserRoleAssignment_in_ruleSession854 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_13_in_ruleSession865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserRoleAssignment_in_entryRuleUserRoleAssignment901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUserRoleAssignment911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUserRoleAssignment954 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleUserRoleAssignment964 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUserRoleAssignment982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRolePermissionAssignment_in_entryRuleRolePermissionAssignment1018 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRolePermissionAssignment1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRolePermissionAssignment1071 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleRolePermissionAssignment1081 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRolePermissionAssignment1099 = new BitSet(new long[]{0x0000000000000002L});

}