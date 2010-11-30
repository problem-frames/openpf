package uk.ac.open.rbac.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import uk.ac.open.rbac.services.RBACGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRBACParser extends AbstractInternalContentAssistParser {
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
    public String getGrammarFileName() { return "../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g"; }


     
     	private RBACGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(RBACGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start entryRuleModel
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:61:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:62:1: ( ruleModel EOF )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:63:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();
            _fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleModel


    // $ANTLR start ruleModel
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:70:1: ruleModel : ( ( rule__Model__Alternatives )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:74:2: ( ( ( rule__Model__Alternatives )* ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:75:1: ( ( rule__Model__Alternatives )* )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:75:1: ( ( rule__Model__Alternatives )* )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:76:1: ( rule__Model__Alternatives )*
            {
             before(grammarAccess.getModelAccess().getAlternatives()); 
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:77:1: ( rule__Model__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||(LA1_0>=11 && LA1_0<=13)||LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:77:2: rule__Model__Alternatives
            	    {
            	    pushFollow(FOLLOW_rule__Model__Alternatives_in_ruleModel94);
            	    rule__Model__Alternatives();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleModel


    // $ANTLR start entryRuleRole
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:89:1: entryRuleRole : ruleRole EOF ;
    public final void entryRuleRole() throws RecognitionException {
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:90:1: ( ruleRole EOF )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:91:1: ruleRole EOF
            {
             before(grammarAccess.getRoleRule()); 
            pushFollow(FOLLOW_ruleRole_in_entryRuleRole122);
            ruleRole();
            _fsp--;

             after(grammarAccess.getRoleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRole129); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleRole


    // $ANTLR start ruleRole
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:98:1: ruleRole : ( ( rule__Role__Group__0 ) ) ;
    public final void ruleRole() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:102:2: ( ( ( rule__Role__Group__0 ) ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:103:1: ( ( rule__Role__Group__0 ) )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:103:1: ( ( rule__Role__Group__0 ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:104:1: ( rule__Role__Group__0 )
            {
             before(grammarAccess.getRoleAccess().getGroup()); 
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:105:1: ( rule__Role__Group__0 )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:105:2: rule__Role__Group__0
            {
            pushFollow(FOLLOW_rule__Role__Group__0_in_ruleRole155);
            rule__Role__Group__0();
            _fsp--;


            }

             after(grammarAccess.getRoleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleRole


    // $ANTLR start entryRuleUser
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:117:1: entryRuleUser : ruleUser EOF ;
    public final void entryRuleUser() throws RecognitionException {
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:118:1: ( ruleUser EOF )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:119:1: ruleUser EOF
            {
             before(grammarAccess.getUserRule()); 
            pushFollow(FOLLOW_ruleUser_in_entryRuleUser182);
            ruleUser();
            _fsp--;

             after(grammarAccess.getUserRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUser189); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleUser


    // $ANTLR start ruleUser
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:126:1: ruleUser : ( ( rule__User__Group__0 ) ) ;
    public final void ruleUser() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:130:2: ( ( ( rule__User__Group__0 ) ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:131:1: ( ( rule__User__Group__0 ) )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:131:1: ( ( rule__User__Group__0 ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:132:1: ( rule__User__Group__0 )
            {
             before(grammarAccess.getUserAccess().getGroup()); 
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:133:1: ( rule__User__Group__0 )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:133:2: rule__User__Group__0
            {
            pushFollow(FOLLOW_rule__User__Group__0_in_ruleUser215);
            rule__User__Group__0();
            _fsp--;


            }

             after(grammarAccess.getUserAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleUser


    // $ANTLR start entryRuleObject
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:145:1: entryRuleObject : ruleObject EOF ;
    public final void entryRuleObject() throws RecognitionException {
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:146:1: ( ruleObject EOF )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:147:1: ruleObject EOF
            {
             before(grammarAccess.getObjectRule()); 
            pushFollow(FOLLOW_ruleObject_in_entryRuleObject242);
            ruleObject();
            _fsp--;

             after(grammarAccess.getObjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObject249); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleObject


    // $ANTLR start ruleObject
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:154:1: ruleObject : ( ( rule__Object__Group__0 ) ) ;
    public final void ruleObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:158:2: ( ( ( rule__Object__Group__0 ) ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:159:1: ( ( rule__Object__Group__0 ) )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:159:1: ( ( rule__Object__Group__0 ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:160:1: ( rule__Object__Group__0 )
            {
             before(grammarAccess.getObjectAccess().getGroup()); 
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:161:1: ( rule__Object__Group__0 )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:161:2: rule__Object__Group__0
            {
            pushFollow(FOLLOW_rule__Object__Group__0_in_ruleObject275);
            rule__Object__Group__0();
            _fsp--;


            }

             after(grammarAccess.getObjectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleObject


    // $ANTLR start entryRuleSession
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:173:1: entryRuleSession : ruleSession EOF ;
    public final void entryRuleSession() throws RecognitionException {
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:174:1: ( ruleSession EOF )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:175:1: ruleSession EOF
            {
             before(grammarAccess.getSessionRule()); 
            pushFollow(FOLLOW_ruleSession_in_entryRuleSession302);
            ruleSession();
            _fsp--;

             after(grammarAccess.getSessionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSession309); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleSession


    // $ANTLR start ruleSession
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:182:1: ruleSession : ( ( rule__Session__Group__0 ) ) ;
    public final void ruleSession() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:186:2: ( ( ( rule__Session__Group__0 ) ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:187:1: ( ( rule__Session__Group__0 ) )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:187:1: ( ( rule__Session__Group__0 ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:188:1: ( rule__Session__Group__0 )
            {
             before(grammarAccess.getSessionAccess().getGroup()); 
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:189:1: ( rule__Session__Group__0 )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:189:2: rule__Session__Group__0
            {
            pushFollow(FOLLOW_rule__Session__Group__0_in_ruleSession335);
            rule__Session__Group__0();
            _fsp--;


            }

             after(grammarAccess.getSessionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleSession


    // $ANTLR start entryRuleUserRoleAssignment
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:201:1: entryRuleUserRoleAssignment : ruleUserRoleAssignment EOF ;
    public final void entryRuleUserRoleAssignment() throws RecognitionException {
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:202:1: ( ruleUserRoleAssignment EOF )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:203:1: ruleUserRoleAssignment EOF
            {
             before(grammarAccess.getUserRoleAssignmentRule()); 
            pushFollow(FOLLOW_ruleUserRoleAssignment_in_entryRuleUserRoleAssignment362);
            ruleUserRoleAssignment();
            _fsp--;

             after(grammarAccess.getUserRoleAssignmentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUserRoleAssignment369); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleUserRoleAssignment


    // $ANTLR start ruleUserRoleAssignment
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:210:1: ruleUserRoleAssignment : ( ( rule__UserRoleAssignment__Group__0 ) ) ;
    public final void ruleUserRoleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:214:2: ( ( ( rule__UserRoleAssignment__Group__0 ) ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:215:1: ( ( rule__UserRoleAssignment__Group__0 ) )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:215:1: ( ( rule__UserRoleAssignment__Group__0 ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:216:1: ( rule__UserRoleAssignment__Group__0 )
            {
             before(grammarAccess.getUserRoleAssignmentAccess().getGroup()); 
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:217:1: ( rule__UserRoleAssignment__Group__0 )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:217:2: rule__UserRoleAssignment__Group__0
            {
            pushFollow(FOLLOW_rule__UserRoleAssignment__Group__0_in_ruleUserRoleAssignment395);
            rule__UserRoleAssignment__Group__0();
            _fsp--;


            }

             after(grammarAccess.getUserRoleAssignmentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleUserRoleAssignment


    // $ANTLR start entryRuleRolePermissionAssignment
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:229:1: entryRuleRolePermissionAssignment : ruleRolePermissionAssignment EOF ;
    public final void entryRuleRolePermissionAssignment() throws RecognitionException {
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:230:1: ( ruleRolePermissionAssignment EOF )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:231:1: ruleRolePermissionAssignment EOF
            {
             before(grammarAccess.getRolePermissionAssignmentRule()); 
            pushFollow(FOLLOW_ruleRolePermissionAssignment_in_entryRuleRolePermissionAssignment422);
            ruleRolePermissionAssignment();
            _fsp--;

             after(grammarAccess.getRolePermissionAssignmentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRolePermissionAssignment429); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleRolePermissionAssignment


    // $ANTLR start ruleRolePermissionAssignment
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:238:1: ruleRolePermissionAssignment : ( ( rule__RolePermissionAssignment__Group__0 ) ) ;
    public final void ruleRolePermissionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:242:2: ( ( ( rule__RolePermissionAssignment__Group__0 ) ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:243:1: ( ( rule__RolePermissionAssignment__Group__0 ) )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:243:1: ( ( rule__RolePermissionAssignment__Group__0 ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:244:1: ( rule__RolePermissionAssignment__Group__0 )
            {
             before(grammarAccess.getRolePermissionAssignmentAccess().getGroup()); 
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:245:1: ( rule__RolePermissionAssignment__Group__0 )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:245:2: rule__RolePermissionAssignment__Group__0
            {
            pushFollow(FOLLOW_rule__RolePermissionAssignment__Group__0_in_ruleRolePermissionAssignment455);
            rule__RolePermissionAssignment__Group__0();
            _fsp--;


            }

             after(grammarAccess.getRolePermissionAssignmentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleRolePermissionAssignment


    // $ANTLR start rule__Model__Alternatives
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:257:1: rule__Model__Alternatives : ( ( ( rule__Model__RolesAssignment_0 ) ) | ( ( rule__Model__UsersAssignment_1 ) ) | ( ( rule__Model__SessionsAssignment_2 ) ) | ( ( rule__Model__ObjectsAssignment_3 ) ) | ( ( rule__Model__PermissionsAssignment_4 ) ) | ( ( rule__Model__AssignmentsAssignment_5 ) ) );
    public final void rule__Model__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:261:1: ( ( ( rule__Model__RolesAssignment_0 ) ) | ( ( rule__Model__UsersAssignment_1 ) ) | ( ( rule__Model__SessionsAssignment_2 ) ) | ( ( rule__Model__ObjectsAssignment_3 ) ) | ( ( rule__Model__PermissionsAssignment_4 ) ) | ( ( rule__Model__AssignmentsAssignment_5 ) ) )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 15:
                {
                alt2=3;
                }
                break;
            case 13:
                {
                alt2=4;
                }
                break;
            case RULE_ID:
                {
                int LA2_5 = input.LA(2);

                if ( (LA2_5==RULE_ID) ) {
                    alt2=6;
                }
                else if ( (LA2_5==RULE_STRING) ) {
                    alt2=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("257:1: rule__Model__Alternatives : ( ( ( rule__Model__RolesAssignment_0 ) ) | ( ( rule__Model__UsersAssignment_1 ) ) | ( ( rule__Model__SessionsAssignment_2 ) ) | ( ( rule__Model__ObjectsAssignment_3 ) ) | ( ( rule__Model__PermissionsAssignment_4 ) ) | ( ( rule__Model__AssignmentsAssignment_5 ) ) );", 2, 5, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("257:1: rule__Model__Alternatives : ( ( ( rule__Model__RolesAssignment_0 ) ) | ( ( rule__Model__UsersAssignment_1 ) ) | ( ( rule__Model__SessionsAssignment_2 ) ) | ( ( rule__Model__ObjectsAssignment_3 ) ) | ( ( rule__Model__PermissionsAssignment_4 ) ) | ( ( rule__Model__AssignmentsAssignment_5 ) ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:262:1: ( ( rule__Model__RolesAssignment_0 ) )
                    {
                    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:262:1: ( ( rule__Model__RolesAssignment_0 ) )
                    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:263:1: ( rule__Model__RolesAssignment_0 )
                    {
                     before(grammarAccess.getModelAccess().getRolesAssignment_0()); 
                    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:264:1: ( rule__Model__RolesAssignment_0 )
                    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:264:2: rule__Model__RolesAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Model__RolesAssignment_0_in_rule__Model__Alternatives491);
                    rule__Model__RolesAssignment_0();
                    _fsp--;


                    }

                     after(grammarAccess.getModelAccess().getRolesAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:268:6: ( ( rule__Model__UsersAssignment_1 ) )
                    {
                    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:268:6: ( ( rule__Model__UsersAssignment_1 ) )
                    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:269:1: ( rule__Model__UsersAssignment_1 )
                    {
                     before(grammarAccess.getModelAccess().getUsersAssignment_1()); 
                    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:270:1: ( rule__Model__UsersAssignment_1 )
                    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:270:2: rule__Model__UsersAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Model__UsersAssignment_1_in_rule__Model__Alternatives509);
                    rule__Model__UsersAssignment_1();
                    _fsp--;


                    }

                     after(grammarAccess.getModelAccess().getUsersAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:274:6: ( ( rule__Model__SessionsAssignment_2 ) )
                    {
                    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:274:6: ( ( rule__Model__SessionsAssignment_2 ) )
                    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:275:1: ( rule__Model__SessionsAssignment_2 )
                    {
                     before(grammarAccess.getModelAccess().getSessionsAssignment_2()); 
                    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:276:1: ( rule__Model__SessionsAssignment_2 )
                    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:276:2: rule__Model__SessionsAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Model__SessionsAssignment_2_in_rule__Model__Alternatives527);
                    rule__Model__SessionsAssignment_2();
                    _fsp--;


                    }

                     after(grammarAccess.getModelAccess().getSessionsAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:280:6: ( ( rule__Model__ObjectsAssignment_3 ) )
                    {
                    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:280:6: ( ( rule__Model__ObjectsAssignment_3 ) )
                    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:281:1: ( rule__Model__ObjectsAssignment_3 )
                    {
                     before(grammarAccess.getModelAccess().getObjectsAssignment_3()); 
                    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:282:1: ( rule__Model__ObjectsAssignment_3 )
                    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:282:2: rule__Model__ObjectsAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Model__ObjectsAssignment_3_in_rule__Model__Alternatives545);
                    rule__Model__ObjectsAssignment_3();
                    _fsp--;


                    }

                     after(grammarAccess.getModelAccess().getObjectsAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:286:6: ( ( rule__Model__PermissionsAssignment_4 ) )
                    {
                    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:286:6: ( ( rule__Model__PermissionsAssignment_4 ) )
                    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:287:1: ( rule__Model__PermissionsAssignment_4 )
                    {
                     before(grammarAccess.getModelAccess().getPermissionsAssignment_4()); 
                    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:288:1: ( rule__Model__PermissionsAssignment_4 )
                    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:288:2: rule__Model__PermissionsAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Model__PermissionsAssignment_4_in_rule__Model__Alternatives563);
                    rule__Model__PermissionsAssignment_4();
                    _fsp--;


                    }

                     after(grammarAccess.getModelAccess().getPermissionsAssignment_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:292:6: ( ( rule__Model__AssignmentsAssignment_5 ) )
                    {
                    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:292:6: ( ( rule__Model__AssignmentsAssignment_5 ) )
                    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:293:1: ( rule__Model__AssignmentsAssignment_5 )
                    {
                     before(grammarAccess.getModelAccess().getAssignmentsAssignment_5()); 
                    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:294:1: ( rule__Model__AssignmentsAssignment_5 )
                    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:294:2: rule__Model__AssignmentsAssignment_5
                    {
                    pushFollow(FOLLOW_rule__Model__AssignmentsAssignment_5_in_rule__Model__Alternatives581);
                    rule__Model__AssignmentsAssignment_5();
                    _fsp--;


                    }

                     after(grammarAccess.getModelAccess().getAssignmentsAssignment_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__Alternatives


    // $ANTLR start rule__Role__Group__0
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:305:1: rule__Role__Group__0 : rule__Role__Group__0__Impl rule__Role__Group__1 ;
    public final void rule__Role__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:309:1: ( rule__Role__Group__0__Impl rule__Role__Group__1 )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:310:2: rule__Role__Group__0__Impl rule__Role__Group__1
            {
            pushFollow(FOLLOW_rule__Role__Group__0__Impl_in_rule__Role__Group__0612);
            rule__Role__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Role__Group__1_in_rule__Role__Group__0615);
            rule__Role__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Role__Group__0


    // $ANTLR start rule__Role__Group__0__Impl
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:317:1: rule__Role__Group__0__Impl : ( 'role' ) ;
    public final void rule__Role__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:321:1: ( ( 'role' ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:322:1: ( 'role' )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:322:1: ( 'role' )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:323:1: 'role'
            {
             before(grammarAccess.getRoleAccess().getRoleKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Role__Group__0__Impl643); 
             after(grammarAccess.getRoleAccess().getRoleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Role__Group__0__Impl


    // $ANTLR start rule__Role__Group__1
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:336:1: rule__Role__Group__1 : rule__Role__Group__1__Impl ;
    public final void rule__Role__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:340:1: ( rule__Role__Group__1__Impl )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:341:2: rule__Role__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Role__Group__1__Impl_in_rule__Role__Group__1674);
            rule__Role__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Role__Group__1


    // $ANTLR start rule__Role__Group__1__Impl
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:347:1: rule__Role__Group__1__Impl : ( ( rule__Role__NameAssignment_1 ) ) ;
    public final void rule__Role__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:351:1: ( ( ( rule__Role__NameAssignment_1 ) ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:352:1: ( ( rule__Role__NameAssignment_1 ) )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:352:1: ( ( rule__Role__NameAssignment_1 ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:353:1: ( rule__Role__NameAssignment_1 )
            {
             before(grammarAccess.getRoleAccess().getNameAssignment_1()); 
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:354:1: ( rule__Role__NameAssignment_1 )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:354:2: rule__Role__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Role__NameAssignment_1_in_rule__Role__Group__1__Impl701);
            rule__Role__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getRoleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Role__Group__1__Impl


    // $ANTLR start rule__User__Group__0
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:368:1: rule__User__Group__0 : rule__User__Group__0__Impl rule__User__Group__1 ;
    public final void rule__User__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:372:1: ( rule__User__Group__0__Impl rule__User__Group__1 )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:373:2: rule__User__Group__0__Impl rule__User__Group__1
            {
            pushFollow(FOLLOW_rule__User__Group__0__Impl_in_rule__User__Group__0735);
            rule__User__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__User__Group__1_in_rule__User__Group__0738);
            rule__User__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__User__Group__0


    // $ANTLR start rule__User__Group__0__Impl
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:380:1: rule__User__Group__0__Impl : ( 'user' ) ;
    public final void rule__User__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:384:1: ( ( 'user' ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:385:1: ( 'user' )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:385:1: ( 'user' )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:386:1: 'user'
            {
             before(grammarAccess.getUserAccess().getUserKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__User__Group__0__Impl766); 
             after(grammarAccess.getUserAccess().getUserKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__User__Group__0__Impl


    // $ANTLR start rule__User__Group__1
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:399:1: rule__User__Group__1 : rule__User__Group__1__Impl ;
    public final void rule__User__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:403:1: ( rule__User__Group__1__Impl )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:404:2: rule__User__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__User__Group__1__Impl_in_rule__User__Group__1797);
            rule__User__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__User__Group__1


    // $ANTLR start rule__User__Group__1__Impl
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:410:1: rule__User__Group__1__Impl : ( ( rule__User__NameAssignment_1 ) ) ;
    public final void rule__User__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:414:1: ( ( ( rule__User__NameAssignment_1 ) ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:415:1: ( ( rule__User__NameAssignment_1 ) )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:415:1: ( ( rule__User__NameAssignment_1 ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:416:1: ( rule__User__NameAssignment_1 )
            {
             before(grammarAccess.getUserAccess().getNameAssignment_1()); 
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:417:1: ( rule__User__NameAssignment_1 )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:417:2: rule__User__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__User__NameAssignment_1_in_rule__User__Group__1__Impl824);
            rule__User__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getUserAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__User__Group__1__Impl


    // $ANTLR start rule__Object__Group__0
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:431:1: rule__Object__Group__0 : rule__Object__Group__0__Impl rule__Object__Group__1 ;
    public final void rule__Object__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:435:1: ( rule__Object__Group__0__Impl rule__Object__Group__1 )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:436:2: rule__Object__Group__0__Impl rule__Object__Group__1
            {
            pushFollow(FOLLOW_rule__Object__Group__0__Impl_in_rule__Object__Group__0858);
            rule__Object__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Object__Group__1_in_rule__Object__Group__0861);
            rule__Object__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Object__Group__0


    // $ANTLR start rule__Object__Group__0__Impl
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:443:1: rule__Object__Group__0__Impl : ( 'object' ) ;
    public final void rule__Object__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:447:1: ( ( 'object' ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:448:1: ( 'object' )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:448:1: ( 'object' )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:449:1: 'object'
            {
             before(grammarAccess.getObjectAccess().getObjectKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__Object__Group__0__Impl889); 
             after(grammarAccess.getObjectAccess().getObjectKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Object__Group__0__Impl


    // $ANTLR start rule__Object__Group__1
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:462:1: rule__Object__Group__1 : rule__Object__Group__1__Impl rule__Object__Group__2 ;
    public final void rule__Object__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:466:1: ( rule__Object__Group__1__Impl rule__Object__Group__2 )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:467:2: rule__Object__Group__1__Impl rule__Object__Group__2
            {
            pushFollow(FOLLOW_rule__Object__Group__1__Impl_in_rule__Object__Group__1920);
            rule__Object__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Object__Group__2_in_rule__Object__Group__1923);
            rule__Object__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Object__Group__1


    // $ANTLR start rule__Object__Group__1__Impl
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:474:1: rule__Object__Group__1__Impl : ( ( rule__Object__NameAssignment_1 ) ) ;
    public final void rule__Object__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:478:1: ( ( ( rule__Object__NameAssignment_1 ) ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:479:1: ( ( rule__Object__NameAssignment_1 ) )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:479:1: ( ( rule__Object__NameAssignment_1 ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:480:1: ( rule__Object__NameAssignment_1 )
            {
             before(grammarAccess.getObjectAccess().getNameAssignment_1()); 
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:481:1: ( rule__Object__NameAssignment_1 )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:481:2: rule__Object__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Object__NameAssignment_1_in_rule__Object__Group__1__Impl950);
            rule__Object__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getObjectAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Object__Group__1__Impl


    // $ANTLR start rule__Object__Group__2
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:491:1: rule__Object__Group__2 : rule__Object__Group__2__Impl rule__Object__Group__3 ;
    public final void rule__Object__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:495:1: ( rule__Object__Group__2__Impl rule__Object__Group__3 )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:496:2: rule__Object__Group__2__Impl rule__Object__Group__3
            {
            pushFollow(FOLLOW_rule__Object__Group__2__Impl_in_rule__Object__Group__2980);
            rule__Object__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Object__Group__3_in_rule__Object__Group__2983);
            rule__Object__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Object__Group__2


    // $ANTLR start rule__Object__Group__2__Impl
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:503:1: rule__Object__Group__2__Impl : ( ':' ) ;
    public final void rule__Object__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:507:1: ( ( ':' ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:508:1: ( ':' )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:508:1: ( ':' )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:509:1: ':'
            {
             before(grammarAccess.getObjectAccess().getColonKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__Object__Group__2__Impl1011); 
             after(grammarAccess.getObjectAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Object__Group__2__Impl


    // $ANTLR start rule__Object__Group__3
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:522:1: rule__Object__Group__3 : rule__Object__Group__3__Impl ;
    public final void rule__Object__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:526:1: ( rule__Object__Group__3__Impl )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:527:2: rule__Object__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Object__Group__3__Impl_in_rule__Object__Group__31042);
            rule__Object__Group__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Object__Group__3


    // $ANTLR start rule__Object__Group__3__Impl
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:533:1: rule__Object__Group__3__Impl : ( ( rule__Object__TypeAssignment_3 ) ) ;
    public final void rule__Object__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:537:1: ( ( ( rule__Object__TypeAssignment_3 ) ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:538:1: ( ( rule__Object__TypeAssignment_3 ) )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:538:1: ( ( rule__Object__TypeAssignment_3 ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:539:1: ( rule__Object__TypeAssignment_3 )
            {
             before(grammarAccess.getObjectAccess().getTypeAssignment_3()); 
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:540:1: ( rule__Object__TypeAssignment_3 )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:540:2: rule__Object__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Object__TypeAssignment_3_in_rule__Object__Group__3__Impl1069);
            rule__Object__TypeAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getObjectAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Object__Group__3__Impl


    // $ANTLR start rule__Session__Group__0
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:558:1: rule__Session__Group__0 : rule__Session__Group__0__Impl rule__Session__Group__1 ;
    public final void rule__Session__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:562:1: ( rule__Session__Group__0__Impl rule__Session__Group__1 )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:563:2: rule__Session__Group__0__Impl rule__Session__Group__1
            {
            pushFollow(FOLLOW_rule__Session__Group__0__Impl_in_rule__Session__Group__01107);
            rule__Session__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Session__Group__1_in_rule__Session__Group__01110);
            rule__Session__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Session__Group__0


    // $ANTLR start rule__Session__Group__0__Impl
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:570:1: rule__Session__Group__0__Impl : ( 'session' ) ;
    public final void rule__Session__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:574:1: ( ( 'session' ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:575:1: ( 'session' )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:575:1: ( 'session' )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:576:1: 'session'
            {
             before(grammarAccess.getSessionAccess().getSessionKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__Session__Group__0__Impl1138); 
             after(grammarAccess.getSessionAccess().getSessionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Session__Group__0__Impl


    // $ANTLR start rule__Session__Group__1
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:589:1: rule__Session__Group__1 : rule__Session__Group__1__Impl rule__Session__Group__2 ;
    public final void rule__Session__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:593:1: ( rule__Session__Group__1__Impl rule__Session__Group__2 )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:594:2: rule__Session__Group__1__Impl rule__Session__Group__2
            {
            pushFollow(FOLLOW_rule__Session__Group__1__Impl_in_rule__Session__Group__11169);
            rule__Session__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Session__Group__2_in_rule__Session__Group__11172);
            rule__Session__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Session__Group__1


    // $ANTLR start rule__Session__Group__1__Impl
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:601:1: rule__Session__Group__1__Impl : ( ( rule__Session__NameAssignment_1 ) ) ;
    public final void rule__Session__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:605:1: ( ( ( rule__Session__NameAssignment_1 ) ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:606:1: ( ( rule__Session__NameAssignment_1 ) )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:606:1: ( ( rule__Session__NameAssignment_1 ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:607:1: ( rule__Session__NameAssignment_1 )
            {
             before(grammarAccess.getSessionAccess().getNameAssignment_1()); 
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:608:1: ( rule__Session__NameAssignment_1 )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:608:2: rule__Session__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Session__NameAssignment_1_in_rule__Session__Group__1__Impl1199);
            rule__Session__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getSessionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Session__Group__1__Impl


    // $ANTLR start rule__Session__Group__2
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:618:1: rule__Session__Group__2 : rule__Session__Group__2__Impl rule__Session__Group__3 ;
    public final void rule__Session__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:622:1: ( rule__Session__Group__2__Impl rule__Session__Group__3 )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:623:2: rule__Session__Group__2__Impl rule__Session__Group__3
            {
            pushFollow(FOLLOW_rule__Session__Group__2__Impl_in_rule__Session__Group__21229);
            rule__Session__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Session__Group__3_in_rule__Session__Group__21232);
            rule__Session__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Session__Group__2


    // $ANTLR start rule__Session__Group__2__Impl
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:630:1: rule__Session__Group__2__Impl : ( '{' ) ;
    public final void rule__Session__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:634:1: ( ( '{' ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:635:1: ( '{' )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:635:1: ( '{' )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:636:1: '{'
            {
             before(grammarAccess.getSessionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__Session__Group__2__Impl1260); 
             after(grammarAccess.getSessionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Session__Group__2__Impl


    // $ANTLR start rule__Session__Group__3
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:649:1: rule__Session__Group__3 : rule__Session__Group__3__Impl rule__Session__Group__4 ;
    public final void rule__Session__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:653:1: ( rule__Session__Group__3__Impl rule__Session__Group__4 )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:654:2: rule__Session__Group__3__Impl rule__Session__Group__4
            {
            pushFollow(FOLLOW_rule__Session__Group__3__Impl_in_rule__Session__Group__31291);
            rule__Session__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Session__Group__4_in_rule__Session__Group__31294);
            rule__Session__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Session__Group__3


    // $ANTLR start rule__Session__Group__3__Impl
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:661:1: rule__Session__Group__3__Impl : ( ( rule__Session__AssignmentsAssignment_3 )* ) ;
    public final void rule__Session__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:665:1: ( ( ( rule__Session__AssignmentsAssignment_3 )* ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:666:1: ( ( rule__Session__AssignmentsAssignment_3 )* )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:666:1: ( ( rule__Session__AssignmentsAssignment_3 )* )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:667:1: ( rule__Session__AssignmentsAssignment_3 )*
            {
             before(grammarAccess.getSessionAccess().getAssignmentsAssignment_3()); 
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:668:1: ( rule__Session__AssignmentsAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:668:2: rule__Session__AssignmentsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Session__AssignmentsAssignment_3_in_rule__Session__Group__3__Impl1321);
            	    rule__Session__AssignmentsAssignment_3();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getSessionAccess().getAssignmentsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Session__Group__3__Impl


    // $ANTLR start rule__Session__Group__4
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:678:1: rule__Session__Group__4 : rule__Session__Group__4__Impl ;
    public final void rule__Session__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:682:1: ( rule__Session__Group__4__Impl )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:683:2: rule__Session__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Session__Group__4__Impl_in_rule__Session__Group__41352);
            rule__Session__Group__4__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Session__Group__4


    // $ANTLR start rule__Session__Group__4__Impl
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:689:1: rule__Session__Group__4__Impl : ( '}' ) ;
    public final void rule__Session__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:693:1: ( ( '}' ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:694:1: ( '}' )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:694:1: ( '}' )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:695:1: '}'
            {
             before(grammarAccess.getSessionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_17_in_rule__Session__Group__4__Impl1380); 
             after(grammarAccess.getSessionAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Session__Group__4__Impl


    // $ANTLR start rule__UserRoleAssignment__Group__0
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:718:1: rule__UserRoleAssignment__Group__0 : rule__UserRoleAssignment__Group__0__Impl rule__UserRoleAssignment__Group__1 ;
    public final void rule__UserRoleAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:722:1: ( rule__UserRoleAssignment__Group__0__Impl rule__UserRoleAssignment__Group__1 )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:723:2: rule__UserRoleAssignment__Group__0__Impl rule__UserRoleAssignment__Group__1
            {
            pushFollow(FOLLOW_rule__UserRoleAssignment__Group__0__Impl_in_rule__UserRoleAssignment__Group__01421);
            rule__UserRoleAssignment__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UserRoleAssignment__Group__1_in_rule__UserRoleAssignment__Group__01424);
            rule__UserRoleAssignment__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UserRoleAssignment__Group__0


    // $ANTLR start rule__UserRoleAssignment__Group__0__Impl
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:730:1: rule__UserRoleAssignment__Group__0__Impl : ( ( rule__UserRoleAssignment__NameAssignment_0 ) ) ;
    public final void rule__UserRoleAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:734:1: ( ( ( rule__UserRoleAssignment__NameAssignment_0 ) ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:735:1: ( ( rule__UserRoleAssignment__NameAssignment_0 ) )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:735:1: ( ( rule__UserRoleAssignment__NameAssignment_0 ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:736:1: ( rule__UserRoleAssignment__NameAssignment_0 )
            {
             before(grammarAccess.getUserRoleAssignmentAccess().getNameAssignment_0()); 
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:737:1: ( rule__UserRoleAssignment__NameAssignment_0 )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:737:2: rule__UserRoleAssignment__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__UserRoleAssignment__NameAssignment_0_in_rule__UserRoleAssignment__Group__0__Impl1451);
            rule__UserRoleAssignment__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getUserRoleAssignmentAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UserRoleAssignment__Group__0__Impl


    // $ANTLR start rule__UserRoleAssignment__Group__1
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:747:1: rule__UserRoleAssignment__Group__1 : rule__UserRoleAssignment__Group__1__Impl rule__UserRoleAssignment__Group__2 ;
    public final void rule__UserRoleAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:751:1: ( rule__UserRoleAssignment__Group__1__Impl rule__UserRoleAssignment__Group__2 )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:752:2: rule__UserRoleAssignment__Group__1__Impl rule__UserRoleAssignment__Group__2
            {
            pushFollow(FOLLOW_rule__UserRoleAssignment__Group__1__Impl_in_rule__UserRoleAssignment__Group__11481);
            rule__UserRoleAssignment__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UserRoleAssignment__Group__2_in_rule__UserRoleAssignment__Group__11484);
            rule__UserRoleAssignment__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UserRoleAssignment__Group__1


    // $ANTLR start rule__UserRoleAssignment__Group__1__Impl
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:759:1: rule__UserRoleAssignment__Group__1__Impl : ( ( rule__UserRoleAssignment__UserAssignment_1 ) ) ;
    public final void rule__UserRoleAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:763:1: ( ( ( rule__UserRoleAssignment__UserAssignment_1 ) ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:764:1: ( ( rule__UserRoleAssignment__UserAssignment_1 ) )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:764:1: ( ( rule__UserRoleAssignment__UserAssignment_1 ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:765:1: ( rule__UserRoleAssignment__UserAssignment_1 )
            {
             before(grammarAccess.getUserRoleAssignmentAccess().getUserAssignment_1()); 
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:766:1: ( rule__UserRoleAssignment__UserAssignment_1 )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:766:2: rule__UserRoleAssignment__UserAssignment_1
            {
            pushFollow(FOLLOW_rule__UserRoleAssignment__UserAssignment_1_in_rule__UserRoleAssignment__Group__1__Impl1511);
            rule__UserRoleAssignment__UserAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getUserRoleAssignmentAccess().getUserAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UserRoleAssignment__Group__1__Impl


    // $ANTLR start rule__UserRoleAssignment__Group__2
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:776:1: rule__UserRoleAssignment__Group__2 : rule__UserRoleAssignment__Group__2__Impl rule__UserRoleAssignment__Group__3 ;
    public final void rule__UserRoleAssignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:780:1: ( rule__UserRoleAssignment__Group__2__Impl rule__UserRoleAssignment__Group__3 )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:781:2: rule__UserRoleAssignment__Group__2__Impl rule__UserRoleAssignment__Group__3
            {
            pushFollow(FOLLOW_rule__UserRoleAssignment__Group__2__Impl_in_rule__UserRoleAssignment__Group__21541);
            rule__UserRoleAssignment__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UserRoleAssignment__Group__3_in_rule__UserRoleAssignment__Group__21544);
            rule__UserRoleAssignment__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UserRoleAssignment__Group__2


    // $ANTLR start rule__UserRoleAssignment__Group__2__Impl
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:788:1: rule__UserRoleAssignment__Group__2__Impl : ( ':' ) ;
    public final void rule__UserRoleAssignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:792:1: ( ( ':' ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:793:1: ( ':' )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:793:1: ( ':' )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:794:1: ':'
            {
             before(grammarAccess.getUserRoleAssignmentAccess().getColonKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__UserRoleAssignment__Group__2__Impl1572); 
             after(grammarAccess.getUserRoleAssignmentAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UserRoleAssignment__Group__2__Impl


    // $ANTLR start rule__UserRoleAssignment__Group__3
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:807:1: rule__UserRoleAssignment__Group__3 : rule__UserRoleAssignment__Group__3__Impl ;
    public final void rule__UserRoleAssignment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:811:1: ( rule__UserRoleAssignment__Group__3__Impl )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:812:2: rule__UserRoleAssignment__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__UserRoleAssignment__Group__3__Impl_in_rule__UserRoleAssignment__Group__31603);
            rule__UserRoleAssignment__Group__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UserRoleAssignment__Group__3


    // $ANTLR start rule__UserRoleAssignment__Group__3__Impl
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:818:1: rule__UserRoleAssignment__Group__3__Impl : ( ( rule__UserRoleAssignment__RoleAssignment_3 ) ) ;
    public final void rule__UserRoleAssignment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:822:1: ( ( ( rule__UserRoleAssignment__RoleAssignment_3 ) ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:823:1: ( ( rule__UserRoleAssignment__RoleAssignment_3 ) )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:823:1: ( ( rule__UserRoleAssignment__RoleAssignment_3 ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:824:1: ( rule__UserRoleAssignment__RoleAssignment_3 )
            {
             before(grammarAccess.getUserRoleAssignmentAccess().getRoleAssignment_3()); 
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:825:1: ( rule__UserRoleAssignment__RoleAssignment_3 )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:825:2: rule__UserRoleAssignment__RoleAssignment_3
            {
            pushFollow(FOLLOW_rule__UserRoleAssignment__RoleAssignment_3_in_rule__UserRoleAssignment__Group__3__Impl1630);
            rule__UserRoleAssignment__RoleAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getUserRoleAssignmentAccess().getRoleAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UserRoleAssignment__Group__3__Impl


    // $ANTLR start rule__RolePermissionAssignment__Group__0
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:843:1: rule__RolePermissionAssignment__Group__0 : rule__RolePermissionAssignment__Group__0__Impl rule__RolePermissionAssignment__Group__1 ;
    public final void rule__RolePermissionAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:847:1: ( rule__RolePermissionAssignment__Group__0__Impl rule__RolePermissionAssignment__Group__1 )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:848:2: rule__RolePermissionAssignment__Group__0__Impl rule__RolePermissionAssignment__Group__1
            {
            pushFollow(FOLLOW_rule__RolePermissionAssignment__Group__0__Impl_in_rule__RolePermissionAssignment__Group__01668);
            rule__RolePermissionAssignment__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RolePermissionAssignment__Group__1_in_rule__RolePermissionAssignment__Group__01671);
            rule__RolePermissionAssignment__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RolePermissionAssignment__Group__0


    // $ANTLR start rule__RolePermissionAssignment__Group__0__Impl
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:855:1: rule__RolePermissionAssignment__Group__0__Impl : ( ( rule__RolePermissionAssignment__RoleAssignment_0 ) ) ;
    public final void rule__RolePermissionAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:859:1: ( ( ( rule__RolePermissionAssignment__RoleAssignment_0 ) ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:860:1: ( ( rule__RolePermissionAssignment__RoleAssignment_0 ) )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:860:1: ( ( rule__RolePermissionAssignment__RoleAssignment_0 ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:861:1: ( rule__RolePermissionAssignment__RoleAssignment_0 )
            {
             before(grammarAccess.getRolePermissionAssignmentAccess().getRoleAssignment_0()); 
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:862:1: ( rule__RolePermissionAssignment__RoleAssignment_0 )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:862:2: rule__RolePermissionAssignment__RoleAssignment_0
            {
            pushFollow(FOLLOW_rule__RolePermissionAssignment__RoleAssignment_0_in_rule__RolePermissionAssignment__Group__0__Impl1698);
            rule__RolePermissionAssignment__RoleAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getRolePermissionAssignmentAccess().getRoleAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RolePermissionAssignment__Group__0__Impl


    // $ANTLR start rule__RolePermissionAssignment__Group__1
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:872:1: rule__RolePermissionAssignment__Group__1 : rule__RolePermissionAssignment__Group__1__Impl rule__RolePermissionAssignment__Group__2 ;
    public final void rule__RolePermissionAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:876:1: ( rule__RolePermissionAssignment__Group__1__Impl rule__RolePermissionAssignment__Group__2 )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:877:2: rule__RolePermissionAssignment__Group__1__Impl rule__RolePermissionAssignment__Group__2
            {
            pushFollow(FOLLOW_rule__RolePermissionAssignment__Group__1__Impl_in_rule__RolePermissionAssignment__Group__11728);
            rule__RolePermissionAssignment__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RolePermissionAssignment__Group__2_in_rule__RolePermissionAssignment__Group__11731);
            rule__RolePermissionAssignment__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RolePermissionAssignment__Group__1


    // $ANTLR start rule__RolePermissionAssignment__Group__1__Impl
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:884:1: rule__RolePermissionAssignment__Group__1__Impl : ( ( rule__RolePermissionAssignment__TypeAssignment_1 ) ) ;
    public final void rule__RolePermissionAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:888:1: ( ( ( rule__RolePermissionAssignment__TypeAssignment_1 ) ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:889:1: ( ( rule__RolePermissionAssignment__TypeAssignment_1 ) )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:889:1: ( ( rule__RolePermissionAssignment__TypeAssignment_1 ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:890:1: ( rule__RolePermissionAssignment__TypeAssignment_1 )
            {
             before(grammarAccess.getRolePermissionAssignmentAccess().getTypeAssignment_1()); 
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:891:1: ( rule__RolePermissionAssignment__TypeAssignment_1 )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:891:2: rule__RolePermissionAssignment__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__RolePermissionAssignment__TypeAssignment_1_in_rule__RolePermissionAssignment__Group__1__Impl1758);
            rule__RolePermissionAssignment__TypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getRolePermissionAssignmentAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RolePermissionAssignment__Group__1__Impl


    // $ANTLR start rule__RolePermissionAssignment__Group__2
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:901:1: rule__RolePermissionAssignment__Group__2 : rule__RolePermissionAssignment__Group__2__Impl ;
    public final void rule__RolePermissionAssignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:905:1: ( rule__RolePermissionAssignment__Group__2__Impl )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:906:2: rule__RolePermissionAssignment__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__RolePermissionAssignment__Group__2__Impl_in_rule__RolePermissionAssignment__Group__21788);
            rule__RolePermissionAssignment__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RolePermissionAssignment__Group__2


    // $ANTLR start rule__RolePermissionAssignment__Group__2__Impl
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:912:1: rule__RolePermissionAssignment__Group__2__Impl : ( ( rule__RolePermissionAssignment__ObjectAssignment_2 ) ) ;
    public final void rule__RolePermissionAssignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:916:1: ( ( ( rule__RolePermissionAssignment__ObjectAssignment_2 ) ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:917:1: ( ( rule__RolePermissionAssignment__ObjectAssignment_2 ) )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:917:1: ( ( rule__RolePermissionAssignment__ObjectAssignment_2 ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:918:1: ( rule__RolePermissionAssignment__ObjectAssignment_2 )
            {
             before(grammarAccess.getRolePermissionAssignmentAccess().getObjectAssignment_2()); 
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:919:1: ( rule__RolePermissionAssignment__ObjectAssignment_2 )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:919:2: rule__RolePermissionAssignment__ObjectAssignment_2
            {
            pushFollow(FOLLOW_rule__RolePermissionAssignment__ObjectAssignment_2_in_rule__RolePermissionAssignment__Group__2__Impl1815);
            rule__RolePermissionAssignment__ObjectAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getRolePermissionAssignmentAccess().getObjectAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RolePermissionAssignment__Group__2__Impl


    // $ANTLR start rule__Model__RolesAssignment_0
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:936:1: rule__Model__RolesAssignment_0 : ( ruleRole ) ;
    public final void rule__Model__RolesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:940:1: ( ( ruleRole ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:941:1: ( ruleRole )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:941:1: ( ruleRole )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:942:1: ruleRole
            {
             before(grammarAccess.getModelAccess().getRolesRoleParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleRole_in_rule__Model__RolesAssignment_01856);
            ruleRole();
            _fsp--;

             after(grammarAccess.getModelAccess().getRolesRoleParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__RolesAssignment_0


    // $ANTLR start rule__Model__UsersAssignment_1
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:951:1: rule__Model__UsersAssignment_1 : ( ruleUser ) ;
    public final void rule__Model__UsersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:955:1: ( ( ruleUser ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:956:1: ( ruleUser )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:956:1: ( ruleUser )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:957:1: ruleUser
            {
             before(grammarAccess.getModelAccess().getUsersUserParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleUser_in_rule__Model__UsersAssignment_11887);
            ruleUser();
            _fsp--;

             after(grammarAccess.getModelAccess().getUsersUserParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__UsersAssignment_1


    // $ANTLR start rule__Model__SessionsAssignment_2
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:966:1: rule__Model__SessionsAssignment_2 : ( ruleSession ) ;
    public final void rule__Model__SessionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:970:1: ( ( ruleSession ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:971:1: ( ruleSession )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:971:1: ( ruleSession )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:972:1: ruleSession
            {
             before(grammarAccess.getModelAccess().getSessionsSessionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleSession_in_rule__Model__SessionsAssignment_21918);
            ruleSession();
            _fsp--;

             after(grammarAccess.getModelAccess().getSessionsSessionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__SessionsAssignment_2


    // $ANTLR start rule__Model__ObjectsAssignment_3
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:981:1: rule__Model__ObjectsAssignment_3 : ( ruleObject ) ;
    public final void rule__Model__ObjectsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:985:1: ( ( ruleObject ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:986:1: ( ruleObject )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:986:1: ( ruleObject )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:987:1: ruleObject
            {
             before(grammarAccess.getModelAccess().getObjectsObjectParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleObject_in_rule__Model__ObjectsAssignment_31949);
            ruleObject();
            _fsp--;

             after(grammarAccess.getModelAccess().getObjectsObjectParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__ObjectsAssignment_3


    // $ANTLR start rule__Model__PermissionsAssignment_4
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:996:1: rule__Model__PermissionsAssignment_4 : ( ruleRolePermissionAssignment ) ;
    public final void rule__Model__PermissionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1000:1: ( ( ruleRolePermissionAssignment ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1001:1: ( ruleRolePermissionAssignment )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1001:1: ( ruleRolePermissionAssignment )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1002:1: ruleRolePermissionAssignment
            {
             before(grammarAccess.getModelAccess().getPermissionsRolePermissionAssignmentParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleRolePermissionAssignment_in_rule__Model__PermissionsAssignment_41980);
            ruleRolePermissionAssignment();
            _fsp--;

             after(grammarAccess.getModelAccess().getPermissionsRolePermissionAssignmentParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__PermissionsAssignment_4


    // $ANTLR start rule__Model__AssignmentsAssignment_5
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1011:1: rule__Model__AssignmentsAssignment_5 : ( ruleUserRoleAssignment ) ;
    public final void rule__Model__AssignmentsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1015:1: ( ( ruleUserRoleAssignment ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1016:1: ( ruleUserRoleAssignment )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1016:1: ( ruleUserRoleAssignment )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1017:1: ruleUserRoleAssignment
            {
             before(grammarAccess.getModelAccess().getAssignmentsUserRoleAssignmentParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleUserRoleAssignment_in_rule__Model__AssignmentsAssignment_52011);
            ruleUserRoleAssignment();
            _fsp--;

             after(grammarAccess.getModelAccess().getAssignmentsUserRoleAssignmentParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__AssignmentsAssignment_5


    // $ANTLR start rule__Role__NameAssignment_1
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1026:1: rule__Role__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Role__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1030:1: ( ( RULE_ID ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1031:1: ( RULE_ID )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1031:1: ( RULE_ID )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1032:1: RULE_ID
            {
             before(grammarAccess.getRoleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Role__NameAssignment_12042); 
             after(grammarAccess.getRoleAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Role__NameAssignment_1


    // $ANTLR start rule__User__NameAssignment_1
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1041:1: rule__User__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__User__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1045:1: ( ( RULE_ID ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1046:1: ( RULE_ID )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1046:1: ( RULE_ID )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1047:1: RULE_ID
            {
             before(grammarAccess.getUserAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__User__NameAssignment_12073); 
             after(grammarAccess.getUserAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__User__NameAssignment_1


    // $ANTLR start rule__Object__NameAssignment_1
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1056:1: rule__Object__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Object__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1060:1: ( ( RULE_ID ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1061:1: ( RULE_ID )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1061:1: ( RULE_ID )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1062:1: RULE_ID
            {
             before(grammarAccess.getObjectAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Object__NameAssignment_12104); 
             after(grammarAccess.getObjectAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Object__NameAssignment_1


    // $ANTLR start rule__Object__TypeAssignment_3
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1071:1: rule__Object__TypeAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Object__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1075:1: ( ( RULE_STRING ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1076:1: ( RULE_STRING )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1076:1: ( RULE_STRING )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1077:1: RULE_STRING
            {
             before(grammarAccess.getObjectAccess().getTypeSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Object__TypeAssignment_32135); 
             after(grammarAccess.getObjectAccess().getTypeSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Object__TypeAssignment_3


    // $ANTLR start rule__Session__NameAssignment_1
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1086:1: rule__Session__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Session__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1090:1: ( ( RULE_ID ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1091:1: ( RULE_ID )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1091:1: ( RULE_ID )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1092:1: RULE_ID
            {
             before(grammarAccess.getSessionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Session__NameAssignment_12166); 
             after(grammarAccess.getSessionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Session__NameAssignment_1


    // $ANTLR start rule__Session__AssignmentsAssignment_3
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1101:1: rule__Session__AssignmentsAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Session__AssignmentsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1105:1: ( ( ( RULE_ID ) ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1106:1: ( ( RULE_ID ) )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1106:1: ( ( RULE_ID ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1107:1: ( RULE_ID )
            {
             before(grammarAccess.getSessionAccess().getAssignmentsUserRoleAssignmentCrossReference_3_0()); 
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1108:1: ( RULE_ID )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1109:1: RULE_ID
            {
             before(grammarAccess.getSessionAccess().getAssignmentsUserRoleAssignmentIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Session__AssignmentsAssignment_32201); 
             after(grammarAccess.getSessionAccess().getAssignmentsUserRoleAssignmentIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getSessionAccess().getAssignmentsUserRoleAssignmentCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Session__AssignmentsAssignment_3


    // $ANTLR start rule__UserRoleAssignment__NameAssignment_0
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1120:1: rule__UserRoleAssignment__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__UserRoleAssignment__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1124:1: ( ( RULE_ID ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1125:1: ( RULE_ID )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1125:1: ( RULE_ID )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1126:1: RULE_ID
            {
             before(grammarAccess.getUserRoleAssignmentAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__UserRoleAssignment__NameAssignment_02236); 
             after(grammarAccess.getUserRoleAssignmentAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UserRoleAssignment__NameAssignment_0


    // $ANTLR start rule__UserRoleAssignment__UserAssignment_1
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1135:1: rule__UserRoleAssignment__UserAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__UserRoleAssignment__UserAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1139:1: ( ( ( RULE_ID ) ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1140:1: ( ( RULE_ID ) )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1140:1: ( ( RULE_ID ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1141:1: ( RULE_ID )
            {
             before(grammarAccess.getUserRoleAssignmentAccess().getUserUserCrossReference_1_0()); 
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1142:1: ( RULE_ID )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1143:1: RULE_ID
            {
             before(grammarAccess.getUserRoleAssignmentAccess().getUserUserIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__UserRoleAssignment__UserAssignment_12271); 
             after(grammarAccess.getUserRoleAssignmentAccess().getUserUserIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getUserRoleAssignmentAccess().getUserUserCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UserRoleAssignment__UserAssignment_1


    // $ANTLR start rule__UserRoleAssignment__RoleAssignment_3
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1154:1: rule__UserRoleAssignment__RoleAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__UserRoleAssignment__RoleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1158:1: ( ( ( RULE_ID ) ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1159:1: ( ( RULE_ID ) )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1159:1: ( ( RULE_ID ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1160:1: ( RULE_ID )
            {
             before(grammarAccess.getUserRoleAssignmentAccess().getRoleRoleCrossReference_3_0()); 
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1161:1: ( RULE_ID )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1162:1: RULE_ID
            {
             before(grammarAccess.getUserRoleAssignmentAccess().getRoleRoleIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__UserRoleAssignment__RoleAssignment_32310); 
             after(grammarAccess.getUserRoleAssignmentAccess().getRoleRoleIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getUserRoleAssignmentAccess().getRoleRoleCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UserRoleAssignment__RoleAssignment_3


    // $ANTLR start rule__RolePermissionAssignment__RoleAssignment_0
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1173:1: rule__RolePermissionAssignment__RoleAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__RolePermissionAssignment__RoleAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1177:1: ( ( ( RULE_ID ) ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1178:1: ( ( RULE_ID ) )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1178:1: ( ( RULE_ID ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1179:1: ( RULE_ID )
            {
             before(grammarAccess.getRolePermissionAssignmentAccess().getRoleRoleCrossReference_0_0()); 
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1180:1: ( RULE_ID )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1181:1: RULE_ID
            {
             before(grammarAccess.getRolePermissionAssignmentAccess().getRoleRoleIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RolePermissionAssignment__RoleAssignment_02349); 
             after(grammarAccess.getRolePermissionAssignmentAccess().getRoleRoleIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getRolePermissionAssignmentAccess().getRoleRoleCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RolePermissionAssignment__RoleAssignment_0


    // $ANTLR start rule__RolePermissionAssignment__TypeAssignment_1
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1192:1: rule__RolePermissionAssignment__TypeAssignment_1 : ( RULE_STRING ) ;
    public final void rule__RolePermissionAssignment__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1196:1: ( ( RULE_STRING ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1197:1: ( RULE_STRING )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1197:1: ( RULE_STRING )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1198:1: RULE_STRING
            {
             before(grammarAccess.getRolePermissionAssignmentAccess().getTypeSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__RolePermissionAssignment__TypeAssignment_12384); 
             after(grammarAccess.getRolePermissionAssignmentAccess().getTypeSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RolePermissionAssignment__TypeAssignment_1


    // $ANTLR start rule__RolePermissionAssignment__ObjectAssignment_2
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1207:1: rule__RolePermissionAssignment__ObjectAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__RolePermissionAssignment__ObjectAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1211:1: ( ( ( RULE_ID ) ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1212:1: ( ( RULE_ID ) )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1212:1: ( ( RULE_ID ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1213:1: ( RULE_ID )
            {
             before(grammarAccess.getRolePermissionAssignmentAccess().getObjectObjectCrossReference_2_0()); 
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1214:1: ( RULE_ID )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1215:1: RULE_ID
            {
             before(grammarAccess.getRolePermissionAssignmentAccess().getObjectObjectIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RolePermissionAssignment__ObjectAssignment_22419); 
             after(grammarAccess.getRolePermissionAssignmentAccess().getObjectObjectIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getRolePermissionAssignmentAccess().getObjectObjectCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RolePermissionAssignment__ObjectAssignment_2


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Alternatives_in_ruleModel94 = new BitSet(new long[]{0x000000000000B812L});
    public static final BitSet FOLLOW_ruleRole_in_entryRuleRole122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRole129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group__0_in_ruleRole155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUser_in_entryRuleUser182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUser189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__User__Group__0_in_ruleUser215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObject_in_entryRuleObject242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObject249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Object__Group__0_in_ruleObject275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSession_in_entryRuleSession302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSession309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Session__Group__0_in_ruleSession335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserRoleAssignment_in_entryRuleUserRoleAssignment362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUserRoleAssignment369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserRoleAssignment__Group__0_in_ruleUserRoleAssignment395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRolePermissionAssignment_in_entryRuleRolePermissionAssignment422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRolePermissionAssignment429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RolePermissionAssignment__Group__0_in_ruleRolePermissionAssignment455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__RolesAssignment_0_in_rule__Model__Alternatives491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__UsersAssignment_1_in_rule__Model__Alternatives509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__SessionsAssignment_2_in_rule__Model__Alternatives527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ObjectsAssignment_3_in_rule__Model__Alternatives545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__PermissionsAssignment_4_in_rule__Model__Alternatives563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__AssignmentsAssignment_5_in_rule__Model__Alternatives581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group__0__Impl_in_rule__Role__Group__0612 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Role__Group__1_in_rule__Role__Group__0615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Role__Group__0__Impl643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group__1__Impl_in_rule__Role__Group__1674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__NameAssignment_1_in_rule__Role__Group__1__Impl701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__User__Group__0__Impl_in_rule__User__Group__0735 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__User__Group__1_in_rule__User__Group__0738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__User__Group__0__Impl766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__User__Group__1__Impl_in_rule__User__Group__1797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__User__NameAssignment_1_in_rule__User__Group__1__Impl824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Object__Group__0__Impl_in_rule__Object__Group__0858 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Object__Group__1_in_rule__Object__Group__0861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Object__Group__0__Impl889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Object__Group__1__Impl_in_rule__Object__Group__1920 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Object__Group__2_in_rule__Object__Group__1923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Object__NameAssignment_1_in_rule__Object__Group__1__Impl950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Object__Group__2__Impl_in_rule__Object__Group__2980 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Object__Group__3_in_rule__Object__Group__2983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Object__Group__2__Impl1011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Object__Group__3__Impl_in_rule__Object__Group__31042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Object__TypeAssignment_3_in_rule__Object__Group__3__Impl1069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Session__Group__0__Impl_in_rule__Session__Group__01107 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Session__Group__1_in_rule__Session__Group__01110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Session__Group__0__Impl1138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Session__Group__1__Impl_in_rule__Session__Group__11169 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Session__Group__2_in_rule__Session__Group__11172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Session__NameAssignment_1_in_rule__Session__Group__1__Impl1199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Session__Group__2__Impl_in_rule__Session__Group__21229 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_rule__Session__Group__3_in_rule__Session__Group__21232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Session__Group__2__Impl1260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Session__Group__3__Impl_in_rule__Session__Group__31291 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Session__Group__4_in_rule__Session__Group__31294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Session__AssignmentsAssignment_3_in_rule__Session__Group__3__Impl1321 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Session__Group__4__Impl_in_rule__Session__Group__41352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Session__Group__4__Impl1380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserRoleAssignment__Group__0__Impl_in_rule__UserRoleAssignment__Group__01421 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__UserRoleAssignment__Group__1_in_rule__UserRoleAssignment__Group__01424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserRoleAssignment__NameAssignment_0_in_rule__UserRoleAssignment__Group__0__Impl1451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserRoleAssignment__Group__1__Impl_in_rule__UserRoleAssignment__Group__11481 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__UserRoleAssignment__Group__2_in_rule__UserRoleAssignment__Group__11484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserRoleAssignment__UserAssignment_1_in_rule__UserRoleAssignment__Group__1__Impl1511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserRoleAssignment__Group__2__Impl_in_rule__UserRoleAssignment__Group__21541 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__UserRoleAssignment__Group__3_in_rule__UserRoleAssignment__Group__21544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__UserRoleAssignment__Group__2__Impl1572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserRoleAssignment__Group__3__Impl_in_rule__UserRoleAssignment__Group__31603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserRoleAssignment__RoleAssignment_3_in_rule__UserRoleAssignment__Group__3__Impl1630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RolePermissionAssignment__Group__0__Impl_in_rule__RolePermissionAssignment__Group__01668 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__RolePermissionAssignment__Group__1_in_rule__RolePermissionAssignment__Group__01671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RolePermissionAssignment__RoleAssignment_0_in_rule__RolePermissionAssignment__Group__0__Impl1698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RolePermissionAssignment__Group__1__Impl_in_rule__RolePermissionAssignment__Group__11728 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RolePermissionAssignment__Group__2_in_rule__RolePermissionAssignment__Group__11731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RolePermissionAssignment__TypeAssignment_1_in_rule__RolePermissionAssignment__Group__1__Impl1758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RolePermissionAssignment__Group__2__Impl_in_rule__RolePermissionAssignment__Group__21788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RolePermissionAssignment__ObjectAssignment_2_in_rule__RolePermissionAssignment__Group__2__Impl1815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRole_in_rule__Model__RolesAssignment_01856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUser_in_rule__Model__UsersAssignment_11887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSession_in_rule__Model__SessionsAssignment_21918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObject_in_rule__Model__ObjectsAssignment_31949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRolePermissionAssignment_in_rule__Model__PermissionsAssignment_41980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserRoleAssignment_in_rule__Model__AssignmentsAssignment_52011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Role__NameAssignment_12042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__User__NameAssignment_12073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Object__NameAssignment_12104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Object__TypeAssignment_32135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Session__NameAssignment_12166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Session__AssignmentsAssignment_32201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__UserRoleAssignment__NameAssignment_02236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__UserRoleAssignment__UserAssignment_12271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__UserRoleAssignment__RoleAssignment_32310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RolePermissionAssignment__RoleAssignment_02349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__RolePermissionAssignment__TypeAssignment_12384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RolePermissionAssignment__ObjectAssignment_22419 = new BitSet(new long[]{0x0000000000000002L});

}