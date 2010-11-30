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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'role'", "'user'", "'object'", "':'", "'session'", "'{'", "'}'"
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
    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:86:1: ruleModel returns [EObject current=null] : ( ( (lv_roles_0_0= ruleRole ) ) | ( (lv_users_1_0= ruleUser ) ) | ( (lv_sessions_2_0= ruleSession ) ) | ( (lv_objects_3_0= ruleObject ) ) | ( (lv_permissions_4_0= ruleRolePermissionAssignment ) ) | ( (lv_assignments_5_0= ruleUserRoleAssignment ) ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_roles_0_0 = null;

        EObject lv_users_1_0 = null;

        EObject lv_sessions_2_0 = null;

        EObject lv_objects_3_0 = null;

        EObject lv_permissions_4_0 = null;

        EObject lv_assignments_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:91:6: ( ( ( (lv_roles_0_0= ruleRole ) ) | ( (lv_users_1_0= ruleUser ) ) | ( (lv_sessions_2_0= ruleSession ) ) | ( (lv_objects_3_0= ruleObject ) ) | ( (lv_permissions_4_0= ruleRolePermissionAssignment ) ) | ( (lv_assignments_5_0= ruleUserRoleAssignment ) ) )* )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:92:1: ( ( (lv_roles_0_0= ruleRole ) ) | ( (lv_users_1_0= ruleUser ) ) | ( (lv_sessions_2_0= ruleSession ) ) | ( (lv_objects_3_0= ruleObject ) ) | ( (lv_permissions_4_0= ruleRolePermissionAssignment ) ) | ( (lv_assignments_5_0= ruleUserRoleAssignment ) ) )*
            {
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:92:1: ( ( (lv_roles_0_0= ruleRole ) ) | ( (lv_users_1_0= ruleUser ) ) | ( (lv_sessions_2_0= ruleSession ) ) | ( (lv_objects_3_0= ruleObject ) ) | ( (lv_permissions_4_0= ruleRolePermissionAssignment ) ) | ( (lv_assignments_5_0= ruleUserRoleAssignment ) ) )*
            loop1:
            do {
                int alt1=7;
                switch ( input.LA(1) ) {
                case 11:
                    {
                    alt1=1;
                    }
                    break;
                case 12:
                    {
                    alt1=2;
                    }
                    break;
                case 15:
                    {
                    alt1=3;
                    }
                    break;
                case 13:
                    {
                    alt1=4;
                    }
                    break;
                case RULE_ID:
                    {
                    int LA1_6 = input.LA(2);

                    if ( (LA1_6==RULE_ID) ) {
                        alt1=6;
                    }
                    else if ( (LA1_6==RULE_STRING) ) {
                        alt1=5;
                    }


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
            	    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:192:6: ( (lv_permissions_4_0= ruleRolePermissionAssignment ) )
            	    {
            	    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:192:6: ( (lv_permissions_4_0= ruleRolePermissionAssignment ) )
            	    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:193:1: (lv_permissions_4_0= ruleRolePermissionAssignment )
            	    {
            	    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:193:1: (lv_permissions_4_0= ruleRolePermissionAssignment )
            	    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:194:3: lv_permissions_4_0= ruleRolePermissionAssignment
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getPermissionsRolePermissionAssignmentParserRuleCall_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleRolePermissionAssignment_in_ruleModel239);
            	    lv_permissions_4_0=ruleRolePermissionAssignment();
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
            	    	        		"RolePermissionAssignment", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:217:6: ( (lv_assignments_5_0= ruleUserRoleAssignment ) )
            	    {
            	    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:217:6: ( (lv_assignments_5_0= ruleUserRoleAssignment ) )
            	    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:218:1: (lv_assignments_5_0= ruleUserRoleAssignment )
            	    {
            	    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:218:1: (lv_assignments_5_0= ruleUserRoleAssignment )
            	    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:219:3: lv_assignments_5_0= ruleUserRoleAssignment
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getAssignmentsUserRoleAssignmentParserRuleCall_5_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleUserRoleAssignment_in_ruleModel266);
            	    lv_assignments_5_0=ruleUserRoleAssignment();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"assignments",
            	    	        		lv_assignments_5_0, 
            	    	        		"UserRoleAssignment", 
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
    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:249:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:250:2: (iv_ruleRole= ruleRole EOF )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:251:2: iv_ruleRole= ruleRole EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRoleRule(), currentNode); 
            pushFollow(FOLLOW_ruleRole_in_entryRuleRole303);
            iv_ruleRole=ruleRole();
            _fsp--;

             current =iv_ruleRole; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRole313); 

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
    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:258:1: ruleRole returns [EObject current=null] : ( 'role' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:263:6: ( ( 'role' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:264:1: ( 'role' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:264:1: ( 'role' ( (lv_name_1_0= RULE_ID ) ) )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:264:3: 'role' ( (lv_name_1_0= RULE_ID ) )
            {
            match(input,11,FOLLOW_11_in_ruleRole348); 

                    createLeafNode(grammarAccess.getRoleAccess().getRoleKeyword_0(), null); 
                
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:268:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:269:1: (lv_name_1_0= RULE_ID )
            {
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:269:1: (lv_name_1_0= RULE_ID )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:270:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRole365); 

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
    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:300:1: entryRuleUser returns [EObject current=null] : iv_ruleUser= ruleUser EOF ;
    public final EObject entryRuleUser() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUser = null;


        try {
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:301:2: (iv_ruleUser= ruleUser EOF )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:302:2: iv_ruleUser= ruleUser EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUserRule(), currentNode); 
            pushFollow(FOLLOW_ruleUser_in_entryRuleUser406);
            iv_ruleUser=ruleUser();
            _fsp--;

             current =iv_ruleUser; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUser416); 

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
    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:309:1: ruleUser returns [EObject current=null] : ( 'user' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleUser() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:314:6: ( ( 'user' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:315:1: ( 'user' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:315:1: ( 'user' ( (lv_name_1_0= RULE_ID ) ) )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:315:3: 'user' ( (lv_name_1_0= RULE_ID ) )
            {
            match(input,12,FOLLOW_12_in_ruleUser451); 

                    createLeafNode(grammarAccess.getUserAccess().getUserKeyword_0(), null); 
                
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:319:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:320:1: (lv_name_1_0= RULE_ID )
            {
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:320:1: (lv_name_1_0= RULE_ID )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:321:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUser468); 

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


    // $ANTLR start entryRuleObject
    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:351:1: entryRuleObject returns [EObject current=null] : iv_ruleObject= ruleObject EOF ;
    public final EObject entryRuleObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObject = null;


        try {
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:352:2: (iv_ruleObject= ruleObject EOF )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:353:2: iv_ruleObject= ruleObject EOF
            {
             currentNode = createCompositeNode(grammarAccess.getObjectRule(), currentNode); 
            pushFollow(FOLLOW_ruleObject_in_entryRuleObject509);
            iv_ruleObject=ruleObject();
            _fsp--;

             current =iv_ruleObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObject519); 

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
    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:360:1: ruleObject returns [EObject current=null] : ( 'object' ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleObject() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_type_3_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:365:6: ( ( 'object' ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= RULE_STRING ) ) ) )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:366:1: ( 'object' ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= RULE_STRING ) ) )
            {
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:366:1: ( 'object' ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= RULE_STRING ) ) )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:366:3: 'object' ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= RULE_STRING ) )
            {
            match(input,13,FOLLOW_13_in_ruleObject554); 

                    createLeafNode(grammarAccess.getObjectAccess().getObjectKeyword_0(), null); 
                
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:370:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:371:1: (lv_name_1_0= RULE_ID )
            {
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:371:1: (lv_name_1_0= RULE_ID )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:372:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleObject571); 

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

            match(input,14,FOLLOW_14_in_ruleObject586); 

                    createLeafNode(grammarAccess.getObjectAccess().getColonKeyword_2(), null); 
                
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:398:1: ( (lv_type_3_0= RULE_STRING ) )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:399:1: (lv_type_3_0= RULE_STRING )
            {
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:399:1: (lv_type_3_0= RULE_STRING )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:400:3: lv_type_3_0= RULE_STRING
            {
            lv_type_3_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleObject603); 

            			createLeafNode(grammarAccess.getObjectAccess().getTypeSTRINGTerminalRuleCall_3_0(), "type"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getObjectRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"type",
            	        		lv_type_3_0, 
            	        		"STRING", 
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
    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:430:1: entryRuleSession returns [EObject current=null] : iv_ruleSession= ruleSession EOF ;
    public final EObject entryRuleSession() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSession = null;


        try {
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:431:2: (iv_ruleSession= ruleSession EOF )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:432:2: iv_ruleSession= ruleSession EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSessionRule(), currentNode); 
            pushFollow(FOLLOW_ruleSession_in_entryRuleSession644);
            iv_ruleSession=ruleSession();
            _fsp--;

             current =iv_ruleSession; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSession654); 

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
    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:439:1: ruleSession returns [EObject current=null] : ( 'session' ( (lv_name_1_0= RULE_ID ) ) '{' ( ( RULE_ID ) )* '}' ) ;
    public final EObject ruleSession() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:444:6: ( ( 'session' ( (lv_name_1_0= RULE_ID ) ) '{' ( ( RULE_ID ) )* '}' ) )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:445:1: ( 'session' ( (lv_name_1_0= RULE_ID ) ) '{' ( ( RULE_ID ) )* '}' )
            {
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:445:1: ( 'session' ( (lv_name_1_0= RULE_ID ) ) '{' ( ( RULE_ID ) )* '}' )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:445:3: 'session' ( (lv_name_1_0= RULE_ID ) ) '{' ( ( RULE_ID ) )* '}'
            {
            match(input,15,FOLLOW_15_in_ruleSession689); 

                    createLeafNode(grammarAccess.getSessionAccess().getSessionKeyword_0(), null); 
                
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:449:1: ( (lv_name_1_0= RULE_ID ) )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:450:1: (lv_name_1_0= RULE_ID )
            {
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:450:1: (lv_name_1_0= RULE_ID )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:451:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSession706); 

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

            match(input,16,FOLLOW_16_in_ruleSession721); 

                    createLeafNode(grammarAccess.getSessionAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:477:1: ( ( RULE_ID ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:478:1: ( RULE_ID )
            	    {
            	    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:478:1: ( RULE_ID )
            	    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:479:3: RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = factory.create(grammarAccess.getSessionRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	            
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSession739); 

            	    		createLeafNode(grammarAccess.getSessionAccess().getAssignmentsUserRoleAssignmentCrossReference_3_0(), "assignments"); 
            	    	

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match(input,17,FOLLOW_17_in_ruleSession750); 

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
    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:503:1: entryRuleUserRoleAssignment returns [EObject current=null] : iv_ruleUserRoleAssignment= ruleUserRoleAssignment EOF ;
    public final EObject entryRuleUserRoleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUserRoleAssignment = null;


        try {
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:504:2: (iv_ruleUserRoleAssignment= ruleUserRoleAssignment EOF )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:505:2: iv_ruleUserRoleAssignment= ruleUserRoleAssignment EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUserRoleAssignmentRule(), currentNode); 
            pushFollow(FOLLOW_ruleUserRoleAssignment_in_entryRuleUserRoleAssignment786);
            iv_ruleUserRoleAssignment=ruleUserRoleAssignment();
            _fsp--;

             current =iv_ruleUserRoleAssignment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUserRoleAssignment796); 

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
    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:512:1: ruleUserRoleAssignment returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( ( RULE_ID ) ) ':' ( ( RULE_ID ) ) ) ;
    public final EObject ruleUserRoleAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:517:6: ( ( ( (lv_name_0_0= RULE_ID ) ) ( ( RULE_ID ) ) ':' ( ( RULE_ID ) ) ) )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:518:1: ( ( (lv_name_0_0= RULE_ID ) ) ( ( RULE_ID ) ) ':' ( ( RULE_ID ) ) )
            {
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:518:1: ( ( (lv_name_0_0= RULE_ID ) ) ( ( RULE_ID ) ) ':' ( ( RULE_ID ) ) )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:518:2: ( (lv_name_0_0= RULE_ID ) ) ( ( RULE_ID ) ) ':' ( ( RULE_ID ) )
            {
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:518:2: ( (lv_name_0_0= RULE_ID ) )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:519:1: (lv_name_0_0= RULE_ID )
            {
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:519:1: (lv_name_0_0= RULE_ID )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:520:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUserRoleAssignment838); 

            			createLeafNode(grammarAccess.getUserRoleAssignmentAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getUserRoleAssignmentRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_0_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:542:2: ( ( RULE_ID ) )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:543:1: ( RULE_ID )
            {
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:543:1: ( RULE_ID )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:544:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getUserRoleAssignmentRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUserRoleAssignment861); 

            		createLeafNode(grammarAccess.getUserRoleAssignmentAccess().getUserUserCrossReference_1_0(), "user"); 
            	

            }


            }

            match(input,14,FOLLOW_14_in_ruleUserRoleAssignment871); 

                    createLeafNode(grammarAccess.getUserRoleAssignmentAccess().getColonKeyword_2(), null); 
                
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:560:1: ( ( RULE_ID ) )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:561:1: ( RULE_ID )
            {
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:561:1: ( RULE_ID )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:562:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getUserRoleAssignmentRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUserRoleAssignment889); 

            		createLeafNode(grammarAccess.getUserRoleAssignmentAccess().getRoleRoleCrossReference_3_0(), "role"); 
            	

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
    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:582:1: entryRuleRolePermissionAssignment returns [EObject current=null] : iv_ruleRolePermissionAssignment= ruleRolePermissionAssignment EOF ;
    public final EObject entryRuleRolePermissionAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRolePermissionAssignment = null;


        try {
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:583:2: (iv_ruleRolePermissionAssignment= ruleRolePermissionAssignment EOF )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:584:2: iv_ruleRolePermissionAssignment= ruleRolePermissionAssignment EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRolePermissionAssignmentRule(), currentNode); 
            pushFollow(FOLLOW_ruleRolePermissionAssignment_in_entryRuleRolePermissionAssignment925);
            iv_ruleRolePermissionAssignment=ruleRolePermissionAssignment();
            _fsp--;

             current =iv_ruleRolePermissionAssignment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRolePermissionAssignment935); 

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
    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:591:1: ruleRolePermissionAssignment returns [EObject current=null] : ( ( ( RULE_ID ) ) ( (lv_type_1_0= RULE_STRING ) ) ( ( RULE_ID ) ) ) ;
    public final EObject ruleRolePermissionAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_type_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:596:6: ( ( ( ( RULE_ID ) ) ( (lv_type_1_0= RULE_STRING ) ) ( ( RULE_ID ) ) ) )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:597:1: ( ( ( RULE_ID ) ) ( (lv_type_1_0= RULE_STRING ) ) ( ( RULE_ID ) ) )
            {
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:597:1: ( ( ( RULE_ID ) ) ( (lv_type_1_0= RULE_STRING ) ) ( ( RULE_ID ) ) )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:597:2: ( ( RULE_ID ) ) ( (lv_type_1_0= RULE_STRING ) ) ( ( RULE_ID ) )
            {
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:597:2: ( ( RULE_ID ) )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:598:1: ( RULE_ID )
            {
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:598:1: ( RULE_ID )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:599:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getRolePermissionAssignmentRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRolePermissionAssignment978); 

            		createLeafNode(grammarAccess.getRolePermissionAssignmentAccess().getRoleRoleCrossReference_0_0(), "role"); 
            	

            }


            }

            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:611:2: ( (lv_type_1_0= RULE_STRING ) )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:612:1: (lv_type_1_0= RULE_STRING )
            {
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:612:1: (lv_type_1_0= RULE_STRING )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:613:3: lv_type_1_0= RULE_STRING
            {
            lv_type_1_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRolePermissionAssignment995); 

            			createLeafNode(grammarAccess.getRolePermissionAssignmentAccess().getTypeSTRINGTerminalRuleCall_1_0(), "type"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getRolePermissionAssignmentRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"type",
            	        		lv_type_1_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:635:2: ( ( RULE_ID ) )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:636:1: ( RULE_ID )
            {
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:636:1: ( RULE_ID )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:637:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getRolePermissionAssignmentRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRolePermissionAssignment1018); 

            		createLeafNode(grammarAccess.getRolePermissionAssignmentAccess().getObjectObjectCrossReference_2_0(), "object"); 
            	

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
    public static final BitSet FOLLOW_ruleRole_in_ruleModel131 = new BitSet(new long[]{0x000000000000B812L});
    public static final BitSet FOLLOW_ruleUser_in_ruleModel158 = new BitSet(new long[]{0x000000000000B812L});
    public static final BitSet FOLLOW_ruleSession_in_ruleModel185 = new BitSet(new long[]{0x000000000000B812L});
    public static final BitSet FOLLOW_ruleObject_in_ruleModel212 = new BitSet(new long[]{0x000000000000B812L});
    public static final BitSet FOLLOW_ruleRolePermissionAssignment_in_ruleModel239 = new BitSet(new long[]{0x000000000000B812L});
    public static final BitSet FOLLOW_ruleUserRoleAssignment_in_ruleModel266 = new BitSet(new long[]{0x000000000000B812L});
    public static final BitSet FOLLOW_ruleRole_in_entryRuleRole303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRole313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleRole348 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRole365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUser_in_entryRuleUser406 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUser416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleUser451 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUser468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObject_in_entryRuleObject509 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObject519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleObject554 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleObject571 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleObject586 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleObject603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSession_in_entryRuleSession644 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSession654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSession689 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSession706 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleSession721 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSession739 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_17_in_ruleSession750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserRoleAssignment_in_entryRuleUserRoleAssignment786 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUserRoleAssignment796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUserRoleAssignment838 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUserRoleAssignment861 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleUserRoleAssignment871 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUserRoleAssignment889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRolePermissionAssignment_in_entryRuleRolePermissionAssignment925 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRolePermissionAssignment935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRolePermissionAssignment978 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRolePermissionAssignment995 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRolePermissionAssignment1018 = new BitSet(new long[]{0x0000000000000002L});

}