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

                if ( (LA1_0==RULE_STRING||LA1_0==11||(LA1_0>=14 && LA1_0<=16)) ) {
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


    // $ANTLR start entryRulePermission
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:145:1: entryRulePermission : rulePermission EOF ;
    public final void entryRulePermission() throws RecognitionException {
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:146:1: ( rulePermission EOF )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:147:1: rulePermission EOF
            {
             before(grammarAccess.getPermissionRule()); 
            pushFollow(FOLLOW_rulePermission_in_entryRulePermission242);
            rulePermission();
            _fsp--;

             after(grammarAccess.getPermissionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePermission249); 

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
    // $ANTLR end entryRulePermission


    // $ANTLR start rulePermission
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:154:1: rulePermission : ( ( rule__Permission__Group__0 ) ) ;
    public final void rulePermission() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:158:2: ( ( ( rule__Permission__Group__0 ) ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:159:1: ( ( rule__Permission__Group__0 ) )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:159:1: ( ( rule__Permission__Group__0 ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:160:1: ( rule__Permission__Group__0 )
            {
             before(grammarAccess.getPermissionAccess().getGroup()); 
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:161:1: ( rule__Permission__Group__0 )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:161:2: rule__Permission__Group__0
            {
            pushFollow(FOLLOW_rule__Permission__Group__0_in_rulePermission275);
            rule__Permission__Group__0();
            _fsp--;


            }

             after(grammarAccess.getPermissionAccess().getGroup()); 

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
    // $ANTLR end rulePermission


    // $ANTLR start entryRuleObject
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:173:1: entryRuleObject : ruleObject EOF ;
    public final void entryRuleObject() throws RecognitionException {
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:174:1: ( ruleObject EOF )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:175:1: ruleObject EOF
            {
             before(grammarAccess.getObjectRule()); 
            pushFollow(FOLLOW_ruleObject_in_entryRuleObject302);
            ruleObject();
            _fsp--;

             after(grammarAccess.getObjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObject309); 

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
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:182:1: ruleObject : ( ( rule__Object__Group__0 ) ) ;
    public final void ruleObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:186:2: ( ( ( rule__Object__Group__0 ) ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:187:1: ( ( rule__Object__Group__0 ) )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:187:1: ( ( rule__Object__Group__0 ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:188:1: ( rule__Object__Group__0 )
            {
             before(grammarAccess.getObjectAccess().getGroup()); 
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:189:1: ( rule__Object__Group__0 )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:189:2: rule__Object__Group__0
            {
            pushFollow(FOLLOW_rule__Object__Group__0_in_ruleObject335);
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
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:201:1: entryRuleSession : ruleSession EOF ;
    public final void entryRuleSession() throws RecognitionException {
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:202:1: ( ruleSession EOF )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:203:1: ruleSession EOF
            {
             before(grammarAccess.getSessionRule()); 
            pushFollow(FOLLOW_ruleSession_in_entryRuleSession362);
            ruleSession();
            _fsp--;

             after(grammarAccess.getSessionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSession369); 

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
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:210:1: ruleSession : ( ( rule__Session__Group__0 ) ) ;
    public final void ruleSession() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:214:2: ( ( ( rule__Session__Group__0 ) ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:215:1: ( ( rule__Session__Group__0 ) )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:215:1: ( ( rule__Session__Group__0 ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:216:1: ( rule__Session__Group__0 )
            {
             before(grammarAccess.getSessionAccess().getGroup()); 
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:217:1: ( rule__Session__Group__0 )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:217:2: rule__Session__Group__0
            {
            pushFollow(FOLLOW_rule__Session__Group__0_in_ruleSession395);
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
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:229:1: entryRuleUserRoleAssignment : ruleUserRoleAssignment EOF ;
    public final void entryRuleUserRoleAssignment() throws RecognitionException {
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:230:1: ( ruleUserRoleAssignment EOF )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:231:1: ruleUserRoleAssignment EOF
            {
             before(grammarAccess.getUserRoleAssignmentRule()); 
            pushFollow(FOLLOW_ruleUserRoleAssignment_in_entryRuleUserRoleAssignment422);
            ruleUserRoleAssignment();
            _fsp--;

             after(grammarAccess.getUserRoleAssignmentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUserRoleAssignment429); 

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
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:238:1: ruleUserRoleAssignment : ( ( rule__UserRoleAssignment__Group__0 ) ) ;
    public final void ruleUserRoleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:242:2: ( ( ( rule__UserRoleAssignment__Group__0 ) ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:243:1: ( ( rule__UserRoleAssignment__Group__0 ) )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:243:1: ( ( rule__UserRoleAssignment__Group__0 ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:244:1: ( rule__UserRoleAssignment__Group__0 )
            {
             before(grammarAccess.getUserRoleAssignmentAccess().getGroup()); 
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:245:1: ( rule__UserRoleAssignment__Group__0 )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:245:2: rule__UserRoleAssignment__Group__0
            {
            pushFollow(FOLLOW_rule__UserRoleAssignment__Group__0_in_ruleUserRoleAssignment455);
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
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:257:1: entryRuleRolePermissionAssignment : ruleRolePermissionAssignment EOF ;
    public final void entryRuleRolePermissionAssignment() throws RecognitionException {
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:258:1: ( ruleRolePermissionAssignment EOF )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:259:1: ruleRolePermissionAssignment EOF
            {
             before(grammarAccess.getRolePermissionAssignmentRule()); 
            pushFollow(FOLLOW_ruleRolePermissionAssignment_in_entryRuleRolePermissionAssignment482);
            ruleRolePermissionAssignment();
            _fsp--;

             after(grammarAccess.getRolePermissionAssignmentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRolePermissionAssignment489); 

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
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:266:1: ruleRolePermissionAssignment : ( ( rule__RolePermissionAssignment__Group__0 ) ) ;
    public final void ruleRolePermissionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:270:2: ( ( ( rule__RolePermissionAssignment__Group__0 ) ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:271:1: ( ( rule__RolePermissionAssignment__Group__0 ) )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:271:1: ( ( rule__RolePermissionAssignment__Group__0 ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:272:1: ( rule__RolePermissionAssignment__Group__0 )
            {
             before(grammarAccess.getRolePermissionAssignmentAccess().getGroup()); 
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:273:1: ( rule__RolePermissionAssignment__Group__0 )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:273:2: rule__RolePermissionAssignment__Group__0
            {
            pushFollow(FOLLOW_rule__RolePermissionAssignment__Group__0_in_ruleRolePermissionAssignment515);
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
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:285:1: rule__Model__Alternatives : ( ( ( rule__Model__RolesAssignment_0 ) ) | ( ( rule__Model__UsersAssignment_1 ) ) | ( ( rule__Model__SessionsAssignment_2 ) ) | ( ( rule__Model__ObjectsAssignment_3 ) ) | ( ( rule__Model__PermissionsAssignment_4 ) ) );
    public final void rule__Model__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:289:1: ( ( ( rule__Model__RolesAssignment_0 ) ) | ( ( rule__Model__UsersAssignment_1 ) ) | ( ( rule__Model__SessionsAssignment_2 ) ) | ( ( rule__Model__ObjectsAssignment_3 ) ) | ( ( rule__Model__PermissionsAssignment_4 ) ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 14:
                {
                alt2=2;
                }
                break;
            case 16:
                {
                alt2=3;
                }
                break;
            case 15:
                {
                alt2=4;
                }
                break;
            case RULE_STRING:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("285:1: rule__Model__Alternatives : ( ( ( rule__Model__RolesAssignment_0 ) ) | ( ( rule__Model__UsersAssignment_1 ) ) | ( ( rule__Model__SessionsAssignment_2 ) ) | ( ( rule__Model__ObjectsAssignment_3 ) ) | ( ( rule__Model__PermissionsAssignment_4 ) ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:290:1: ( ( rule__Model__RolesAssignment_0 ) )
                    {
                    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:290:1: ( ( rule__Model__RolesAssignment_0 ) )
                    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:291:1: ( rule__Model__RolesAssignment_0 )
                    {
                     before(grammarAccess.getModelAccess().getRolesAssignment_0()); 
                    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:292:1: ( rule__Model__RolesAssignment_0 )
                    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:292:2: rule__Model__RolesAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Model__RolesAssignment_0_in_rule__Model__Alternatives551);
                    rule__Model__RolesAssignment_0();
                    _fsp--;


                    }

                     after(grammarAccess.getModelAccess().getRolesAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:296:6: ( ( rule__Model__UsersAssignment_1 ) )
                    {
                    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:296:6: ( ( rule__Model__UsersAssignment_1 ) )
                    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:297:1: ( rule__Model__UsersAssignment_1 )
                    {
                     before(grammarAccess.getModelAccess().getUsersAssignment_1()); 
                    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:298:1: ( rule__Model__UsersAssignment_1 )
                    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:298:2: rule__Model__UsersAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Model__UsersAssignment_1_in_rule__Model__Alternatives569);
                    rule__Model__UsersAssignment_1();
                    _fsp--;


                    }

                     after(grammarAccess.getModelAccess().getUsersAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:302:6: ( ( rule__Model__SessionsAssignment_2 ) )
                    {
                    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:302:6: ( ( rule__Model__SessionsAssignment_2 ) )
                    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:303:1: ( rule__Model__SessionsAssignment_2 )
                    {
                     before(grammarAccess.getModelAccess().getSessionsAssignment_2()); 
                    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:304:1: ( rule__Model__SessionsAssignment_2 )
                    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:304:2: rule__Model__SessionsAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Model__SessionsAssignment_2_in_rule__Model__Alternatives587);
                    rule__Model__SessionsAssignment_2();
                    _fsp--;


                    }

                     after(grammarAccess.getModelAccess().getSessionsAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:308:6: ( ( rule__Model__ObjectsAssignment_3 ) )
                    {
                    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:308:6: ( ( rule__Model__ObjectsAssignment_3 ) )
                    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:309:1: ( rule__Model__ObjectsAssignment_3 )
                    {
                     before(grammarAccess.getModelAccess().getObjectsAssignment_3()); 
                    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:310:1: ( rule__Model__ObjectsAssignment_3 )
                    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:310:2: rule__Model__ObjectsAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Model__ObjectsAssignment_3_in_rule__Model__Alternatives605);
                    rule__Model__ObjectsAssignment_3();
                    _fsp--;


                    }

                     after(grammarAccess.getModelAccess().getObjectsAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:314:6: ( ( rule__Model__PermissionsAssignment_4 ) )
                    {
                    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:314:6: ( ( rule__Model__PermissionsAssignment_4 ) )
                    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:315:1: ( rule__Model__PermissionsAssignment_4 )
                    {
                     before(grammarAccess.getModelAccess().getPermissionsAssignment_4()); 
                    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:316:1: ( rule__Model__PermissionsAssignment_4 )
                    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:316:2: rule__Model__PermissionsAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Model__PermissionsAssignment_4_in_rule__Model__Alternatives623);
                    rule__Model__PermissionsAssignment_4();
                    _fsp--;


                    }

                     after(grammarAccess.getModelAccess().getPermissionsAssignment_4()); 

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
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:327:1: rule__Role__Group__0 : rule__Role__Group__0__Impl rule__Role__Group__1 ;
    public final void rule__Role__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:331:1: ( rule__Role__Group__0__Impl rule__Role__Group__1 )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:332:2: rule__Role__Group__0__Impl rule__Role__Group__1
            {
            pushFollow(FOLLOW_rule__Role__Group__0__Impl_in_rule__Role__Group__0654);
            rule__Role__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Role__Group__1_in_rule__Role__Group__0657);
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
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:339:1: rule__Role__Group__0__Impl : ( 'role' ) ;
    public final void rule__Role__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:343:1: ( ( 'role' ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:344:1: ( 'role' )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:344:1: ( 'role' )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:345:1: 'role'
            {
             before(grammarAccess.getRoleAccess().getRoleKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Role__Group__0__Impl685); 
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
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:358:1: rule__Role__Group__1 : rule__Role__Group__1__Impl rule__Role__Group__2 ;
    public final void rule__Role__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:362:1: ( rule__Role__Group__1__Impl rule__Role__Group__2 )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:363:2: rule__Role__Group__1__Impl rule__Role__Group__2
            {
            pushFollow(FOLLOW_rule__Role__Group__1__Impl_in_rule__Role__Group__1716);
            rule__Role__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Role__Group__2_in_rule__Role__Group__1719);
            rule__Role__Group__2();
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
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:370:1: rule__Role__Group__1__Impl : ( ( rule__Role__NameAssignment_1 ) ) ;
    public final void rule__Role__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:374:1: ( ( ( rule__Role__NameAssignment_1 ) ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:375:1: ( ( rule__Role__NameAssignment_1 ) )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:375:1: ( ( rule__Role__NameAssignment_1 ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:376:1: ( rule__Role__NameAssignment_1 )
            {
             before(grammarAccess.getRoleAccess().getNameAssignment_1()); 
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:377:1: ( rule__Role__NameAssignment_1 )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:377:2: rule__Role__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Role__NameAssignment_1_in_rule__Role__Group__1__Impl746);
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


    // $ANTLR start rule__Role__Group__2
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:387:1: rule__Role__Group__2 : rule__Role__Group__2__Impl rule__Role__Group__3 ;
    public final void rule__Role__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:391:1: ( rule__Role__Group__2__Impl rule__Role__Group__3 )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:392:2: rule__Role__Group__2__Impl rule__Role__Group__3
            {
            pushFollow(FOLLOW_rule__Role__Group__2__Impl_in_rule__Role__Group__2776);
            rule__Role__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Role__Group__3_in_rule__Role__Group__2779);
            rule__Role__Group__3();
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
    // $ANTLR end rule__Role__Group__2


    // $ANTLR start rule__Role__Group__2__Impl
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:399:1: rule__Role__Group__2__Impl : ( '{' ) ;
    public final void rule__Role__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:403:1: ( ( '{' ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:404:1: ( '{' )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:404:1: ( '{' )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:405:1: '{'
            {
             before(grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Role__Group__2__Impl807); 
             after(grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end rule__Role__Group__2__Impl


    // $ANTLR start rule__Role__Group__3
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:418:1: rule__Role__Group__3 : rule__Role__Group__3__Impl rule__Role__Group__4 ;
    public final void rule__Role__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:422:1: ( rule__Role__Group__3__Impl rule__Role__Group__4 )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:423:2: rule__Role__Group__3__Impl rule__Role__Group__4
            {
            pushFollow(FOLLOW_rule__Role__Group__3__Impl_in_rule__Role__Group__3838);
            rule__Role__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Role__Group__4_in_rule__Role__Group__3841);
            rule__Role__Group__4();
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
    // $ANTLR end rule__Role__Group__3


    // $ANTLR start rule__Role__Group__3__Impl
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:430:1: rule__Role__Group__3__Impl : ( ( rule__Role__PermissionsAssignment_3 )* ) ;
    public final void rule__Role__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:434:1: ( ( ( rule__Role__PermissionsAssignment_3 )* ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:435:1: ( ( rule__Role__PermissionsAssignment_3 )* )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:435:1: ( ( rule__Role__PermissionsAssignment_3 )* )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:436:1: ( rule__Role__PermissionsAssignment_3 )*
            {
             before(grammarAccess.getRoleAccess().getPermissionsAssignment_3()); 
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:437:1: ( rule__Role__PermissionsAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:437:2: rule__Role__PermissionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Role__PermissionsAssignment_3_in_rule__Role__Group__3__Impl868);
            	    rule__Role__PermissionsAssignment_3();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getRoleAccess().getPermissionsAssignment_3()); 

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
    // $ANTLR end rule__Role__Group__3__Impl


    // $ANTLR start rule__Role__Group__4
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:447:1: rule__Role__Group__4 : rule__Role__Group__4__Impl ;
    public final void rule__Role__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:451:1: ( rule__Role__Group__4__Impl )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:452:2: rule__Role__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Role__Group__4__Impl_in_rule__Role__Group__4899);
            rule__Role__Group__4__Impl();
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
    // $ANTLR end rule__Role__Group__4


    // $ANTLR start rule__Role__Group__4__Impl
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:458:1: rule__Role__Group__4__Impl : ( '}' ) ;
    public final void rule__Role__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:462:1: ( ( '}' ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:463:1: ( '}' )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:463:1: ( '}' )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:464:1: '}'
            {
             before(grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__Role__Group__4__Impl927); 
             after(grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end rule__Role__Group__4__Impl


    // $ANTLR start rule__User__Group__0
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:487:1: rule__User__Group__0 : rule__User__Group__0__Impl rule__User__Group__1 ;
    public final void rule__User__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:491:1: ( rule__User__Group__0__Impl rule__User__Group__1 )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:492:2: rule__User__Group__0__Impl rule__User__Group__1
            {
            pushFollow(FOLLOW_rule__User__Group__0__Impl_in_rule__User__Group__0968);
            rule__User__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__User__Group__1_in_rule__User__Group__0971);
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
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:499:1: rule__User__Group__0__Impl : ( 'user' ) ;
    public final void rule__User__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:503:1: ( ( 'user' ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:504:1: ( 'user' )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:504:1: ( 'user' )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:505:1: 'user'
            {
             before(grammarAccess.getUserAccess().getUserKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__User__Group__0__Impl999); 
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
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:518:1: rule__User__Group__1 : rule__User__Group__1__Impl ;
    public final void rule__User__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:522:1: ( rule__User__Group__1__Impl )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:523:2: rule__User__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__User__Group__1__Impl_in_rule__User__Group__11030);
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
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:529:1: rule__User__Group__1__Impl : ( ( rule__User__NameAssignment_1 ) ) ;
    public final void rule__User__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:533:1: ( ( ( rule__User__NameAssignment_1 ) ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:534:1: ( ( rule__User__NameAssignment_1 ) )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:534:1: ( ( rule__User__NameAssignment_1 ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:535:1: ( rule__User__NameAssignment_1 )
            {
             before(grammarAccess.getUserAccess().getNameAssignment_1()); 
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:536:1: ( rule__User__NameAssignment_1 )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:536:2: rule__User__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__User__NameAssignment_1_in_rule__User__Group__1__Impl1057);
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


    // $ANTLR start rule__Permission__Group__0
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:550:1: rule__Permission__Group__0 : rule__Permission__Group__0__Impl rule__Permission__Group__1 ;
    public final void rule__Permission__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:554:1: ( rule__Permission__Group__0__Impl rule__Permission__Group__1 )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:555:2: rule__Permission__Group__0__Impl rule__Permission__Group__1
            {
            pushFollow(FOLLOW_rule__Permission__Group__0__Impl_in_rule__Permission__Group__01091);
            rule__Permission__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Permission__Group__1_in_rule__Permission__Group__01094);
            rule__Permission__Group__1();
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
    // $ANTLR end rule__Permission__Group__0


    // $ANTLR start rule__Permission__Group__0__Impl
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:562:1: rule__Permission__Group__0__Impl : ( ( rule__Permission__TypeAssignment_0 ) ) ;
    public final void rule__Permission__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:566:1: ( ( ( rule__Permission__TypeAssignment_0 ) ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:567:1: ( ( rule__Permission__TypeAssignment_0 ) )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:567:1: ( ( rule__Permission__TypeAssignment_0 ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:568:1: ( rule__Permission__TypeAssignment_0 )
            {
             before(grammarAccess.getPermissionAccess().getTypeAssignment_0()); 
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:569:1: ( rule__Permission__TypeAssignment_0 )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:569:2: rule__Permission__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Permission__TypeAssignment_0_in_rule__Permission__Group__0__Impl1121);
            rule__Permission__TypeAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getPermissionAccess().getTypeAssignment_0()); 

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
    // $ANTLR end rule__Permission__Group__0__Impl


    // $ANTLR start rule__Permission__Group__1
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:579:1: rule__Permission__Group__1 : rule__Permission__Group__1__Impl rule__Permission__Group__2 ;
    public final void rule__Permission__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:583:1: ( rule__Permission__Group__1__Impl rule__Permission__Group__2 )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:584:2: rule__Permission__Group__1__Impl rule__Permission__Group__2
            {
            pushFollow(FOLLOW_rule__Permission__Group__1__Impl_in_rule__Permission__Group__11151);
            rule__Permission__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Permission__Group__2_in_rule__Permission__Group__11154);
            rule__Permission__Group__2();
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
    // $ANTLR end rule__Permission__Group__1


    // $ANTLR start rule__Permission__Group__1__Impl
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:591:1: rule__Permission__Group__1__Impl : ( ( rule__Permission__RoleAssignment_1 ) ) ;
    public final void rule__Permission__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:595:1: ( ( ( rule__Permission__RoleAssignment_1 ) ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:596:1: ( ( rule__Permission__RoleAssignment_1 ) )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:596:1: ( ( rule__Permission__RoleAssignment_1 ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:597:1: ( rule__Permission__RoleAssignment_1 )
            {
             before(grammarAccess.getPermissionAccess().getRoleAssignment_1()); 
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:598:1: ( rule__Permission__RoleAssignment_1 )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:598:2: rule__Permission__RoleAssignment_1
            {
            pushFollow(FOLLOW_rule__Permission__RoleAssignment_1_in_rule__Permission__Group__1__Impl1181);
            rule__Permission__RoleAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getPermissionAccess().getRoleAssignment_1()); 

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
    // $ANTLR end rule__Permission__Group__1__Impl


    // $ANTLR start rule__Permission__Group__2
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:608:1: rule__Permission__Group__2 : rule__Permission__Group__2__Impl ;
    public final void rule__Permission__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:612:1: ( rule__Permission__Group__2__Impl )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:613:2: rule__Permission__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Permission__Group__2__Impl_in_rule__Permission__Group__21211);
            rule__Permission__Group__2__Impl();
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
    // $ANTLR end rule__Permission__Group__2


    // $ANTLR start rule__Permission__Group__2__Impl
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:619:1: rule__Permission__Group__2__Impl : ( ( rule__Permission__ObjectAssignment_2 ) ) ;
    public final void rule__Permission__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:623:1: ( ( ( rule__Permission__ObjectAssignment_2 ) ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:624:1: ( ( rule__Permission__ObjectAssignment_2 ) )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:624:1: ( ( rule__Permission__ObjectAssignment_2 ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:625:1: ( rule__Permission__ObjectAssignment_2 )
            {
             before(grammarAccess.getPermissionAccess().getObjectAssignment_2()); 
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:626:1: ( rule__Permission__ObjectAssignment_2 )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:626:2: rule__Permission__ObjectAssignment_2
            {
            pushFollow(FOLLOW_rule__Permission__ObjectAssignment_2_in_rule__Permission__Group__2__Impl1238);
            rule__Permission__ObjectAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getPermissionAccess().getObjectAssignment_2()); 

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
    // $ANTLR end rule__Permission__Group__2__Impl


    // $ANTLR start rule__Object__Group__0
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:642:1: rule__Object__Group__0 : rule__Object__Group__0__Impl rule__Object__Group__1 ;
    public final void rule__Object__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:646:1: ( rule__Object__Group__0__Impl rule__Object__Group__1 )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:647:2: rule__Object__Group__0__Impl rule__Object__Group__1
            {
            pushFollow(FOLLOW_rule__Object__Group__0__Impl_in_rule__Object__Group__01274);
            rule__Object__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Object__Group__1_in_rule__Object__Group__01277);
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
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:654:1: rule__Object__Group__0__Impl : ( 'object' ) ;
    public final void rule__Object__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:658:1: ( ( 'object' ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:659:1: ( 'object' )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:659:1: ( 'object' )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:660:1: 'object'
            {
             before(grammarAccess.getObjectAccess().getObjectKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__Object__Group__0__Impl1305); 
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
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:673:1: rule__Object__Group__1 : rule__Object__Group__1__Impl ;
    public final void rule__Object__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:677:1: ( rule__Object__Group__1__Impl )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:678:2: rule__Object__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Object__Group__1__Impl_in_rule__Object__Group__11336);
            rule__Object__Group__1__Impl();
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
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:684:1: rule__Object__Group__1__Impl : ( ( rule__Object__NameAssignment_1 ) ) ;
    public final void rule__Object__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:688:1: ( ( ( rule__Object__NameAssignment_1 ) ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:689:1: ( ( rule__Object__NameAssignment_1 ) )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:689:1: ( ( rule__Object__NameAssignment_1 ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:690:1: ( rule__Object__NameAssignment_1 )
            {
             before(grammarAccess.getObjectAccess().getNameAssignment_1()); 
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:691:1: ( rule__Object__NameAssignment_1 )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:691:2: rule__Object__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Object__NameAssignment_1_in_rule__Object__Group__1__Impl1363);
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


    // $ANTLR start rule__Session__Group__0
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:705:1: rule__Session__Group__0 : rule__Session__Group__0__Impl rule__Session__Group__1 ;
    public final void rule__Session__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:709:1: ( rule__Session__Group__0__Impl rule__Session__Group__1 )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:710:2: rule__Session__Group__0__Impl rule__Session__Group__1
            {
            pushFollow(FOLLOW_rule__Session__Group__0__Impl_in_rule__Session__Group__01397);
            rule__Session__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Session__Group__1_in_rule__Session__Group__01400);
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
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:717:1: rule__Session__Group__0__Impl : ( 'session' ) ;
    public final void rule__Session__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:721:1: ( ( 'session' ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:722:1: ( 'session' )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:722:1: ( 'session' )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:723:1: 'session'
            {
             before(grammarAccess.getSessionAccess().getSessionKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__Session__Group__0__Impl1428); 
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
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:736:1: rule__Session__Group__1 : rule__Session__Group__1__Impl rule__Session__Group__2 ;
    public final void rule__Session__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:740:1: ( rule__Session__Group__1__Impl rule__Session__Group__2 )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:741:2: rule__Session__Group__1__Impl rule__Session__Group__2
            {
            pushFollow(FOLLOW_rule__Session__Group__1__Impl_in_rule__Session__Group__11459);
            rule__Session__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Session__Group__2_in_rule__Session__Group__11462);
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
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:748:1: rule__Session__Group__1__Impl : ( ( rule__Session__NameAssignment_1 ) ) ;
    public final void rule__Session__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:752:1: ( ( ( rule__Session__NameAssignment_1 ) ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:753:1: ( ( rule__Session__NameAssignment_1 ) )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:753:1: ( ( rule__Session__NameAssignment_1 ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:754:1: ( rule__Session__NameAssignment_1 )
            {
             before(grammarAccess.getSessionAccess().getNameAssignment_1()); 
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:755:1: ( rule__Session__NameAssignment_1 )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:755:2: rule__Session__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Session__NameAssignment_1_in_rule__Session__Group__1__Impl1489);
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
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:765:1: rule__Session__Group__2 : rule__Session__Group__2__Impl rule__Session__Group__3 ;
    public final void rule__Session__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:769:1: ( rule__Session__Group__2__Impl rule__Session__Group__3 )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:770:2: rule__Session__Group__2__Impl rule__Session__Group__3
            {
            pushFollow(FOLLOW_rule__Session__Group__2__Impl_in_rule__Session__Group__21519);
            rule__Session__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Session__Group__3_in_rule__Session__Group__21522);
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
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:777:1: rule__Session__Group__2__Impl : ( '{' ) ;
    public final void rule__Session__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:781:1: ( ( '{' ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:782:1: ( '{' )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:782:1: ( '{' )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:783:1: '{'
            {
             before(grammarAccess.getSessionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Session__Group__2__Impl1550); 
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
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:796:1: rule__Session__Group__3 : rule__Session__Group__3__Impl rule__Session__Group__4 ;
    public final void rule__Session__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:800:1: ( rule__Session__Group__3__Impl rule__Session__Group__4 )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:801:2: rule__Session__Group__3__Impl rule__Session__Group__4
            {
            pushFollow(FOLLOW_rule__Session__Group__3__Impl_in_rule__Session__Group__31581);
            rule__Session__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Session__Group__4_in_rule__Session__Group__31584);
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
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:808:1: rule__Session__Group__3__Impl : ( ( rule__Session__AssignmentsAssignment_3 )* ) ;
    public final void rule__Session__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:812:1: ( ( ( rule__Session__AssignmentsAssignment_3 )* ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:813:1: ( ( rule__Session__AssignmentsAssignment_3 )* )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:813:1: ( ( rule__Session__AssignmentsAssignment_3 )* )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:814:1: ( rule__Session__AssignmentsAssignment_3 )*
            {
             before(grammarAccess.getSessionAccess().getAssignmentsAssignment_3()); 
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:815:1: ( rule__Session__AssignmentsAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:815:2: rule__Session__AssignmentsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Session__AssignmentsAssignment_3_in_rule__Session__Group__3__Impl1611);
            	    rule__Session__AssignmentsAssignment_3();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:825:1: rule__Session__Group__4 : rule__Session__Group__4__Impl ;
    public final void rule__Session__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:829:1: ( rule__Session__Group__4__Impl )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:830:2: rule__Session__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Session__Group__4__Impl_in_rule__Session__Group__41642);
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
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:836:1: rule__Session__Group__4__Impl : ( '}' ) ;
    public final void rule__Session__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:840:1: ( ( '}' ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:841:1: ( '}' )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:841:1: ( '}' )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:842:1: '}'
            {
             before(grammarAccess.getSessionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__Session__Group__4__Impl1670); 
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
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:865:1: rule__UserRoleAssignment__Group__0 : rule__UserRoleAssignment__Group__0__Impl rule__UserRoleAssignment__Group__1 ;
    public final void rule__UserRoleAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:869:1: ( rule__UserRoleAssignment__Group__0__Impl rule__UserRoleAssignment__Group__1 )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:870:2: rule__UserRoleAssignment__Group__0__Impl rule__UserRoleAssignment__Group__1
            {
            pushFollow(FOLLOW_rule__UserRoleAssignment__Group__0__Impl_in_rule__UserRoleAssignment__Group__01711);
            rule__UserRoleAssignment__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UserRoleAssignment__Group__1_in_rule__UserRoleAssignment__Group__01714);
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
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:877:1: rule__UserRoleAssignment__Group__0__Impl : ( ( rule__UserRoleAssignment__UserAssignment_0 ) ) ;
    public final void rule__UserRoleAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:881:1: ( ( ( rule__UserRoleAssignment__UserAssignment_0 ) ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:882:1: ( ( rule__UserRoleAssignment__UserAssignment_0 ) )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:882:1: ( ( rule__UserRoleAssignment__UserAssignment_0 ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:883:1: ( rule__UserRoleAssignment__UserAssignment_0 )
            {
             before(grammarAccess.getUserRoleAssignmentAccess().getUserAssignment_0()); 
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:884:1: ( rule__UserRoleAssignment__UserAssignment_0 )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:884:2: rule__UserRoleAssignment__UserAssignment_0
            {
            pushFollow(FOLLOW_rule__UserRoleAssignment__UserAssignment_0_in_rule__UserRoleAssignment__Group__0__Impl1741);
            rule__UserRoleAssignment__UserAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getUserRoleAssignmentAccess().getUserAssignment_0()); 

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
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:894:1: rule__UserRoleAssignment__Group__1 : rule__UserRoleAssignment__Group__1__Impl rule__UserRoleAssignment__Group__2 ;
    public final void rule__UserRoleAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:898:1: ( rule__UserRoleAssignment__Group__1__Impl rule__UserRoleAssignment__Group__2 )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:899:2: rule__UserRoleAssignment__Group__1__Impl rule__UserRoleAssignment__Group__2
            {
            pushFollow(FOLLOW_rule__UserRoleAssignment__Group__1__Impl_in_rule__UserRoleAssignment__Group__11771);
            rule__UserRoleAssignment__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UserRoleAssignment__Group__2_in_rule__UserRoleAssignment__Group__11774);
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
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:906:1: rule__UserRoleAssignment__Group__1__Impl : ( ':' ) ;
    public final void rule__UserRoleAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:910:1: ( ( ':' ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:911:1: ( ':' )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:911:1: ( ':' )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:912:1: ':'
            {
             before(grammarAccess.getUserRoleAssignmentAccess().getColonKeyword_1()); 
            match(input,17,FOLLOW_17_in_rule__UserRoleAssignment__Group__1__Impl1802); 
             after(grammarAccess.getUserRoleAssignmentAccess().getColonKeyword_1()); 

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
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:925:1: rule__UserRoleAssignment__Group__2 : rule__UserRoleAssignment__Group__2__Impl ;
    public final void rule__UserRoleAssignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:929:1: ( rule__UserRoleAssignment__Group__2__Impl )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:930:2: rule__UserRoleAssignment__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__UserRoleAssignment__Group__2__Impl_in_rule__UserRoleAssignment__Group__21833);
            rule__UserRoleAssignment__Group__2__Impl();
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
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:936:1: rule__UserRoleAssignment__Group__2__Impl : ( ( rule__UserRoleAssignment__RoleAssignment_2 ) ) ;
    public final void rule__UserRoleAssignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:940:1: ( ( ( rule__UserRoleAssignment__RoleAssignment_2 ) ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:941:1: ( ( rule__UserRoleAssignment__RoleAssignment_2 ) )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:941:1: ( ( rule__UserRoleAssignment__RoleAssignment_2 ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:942:1: ( rule__UserRoleAssignment__RoleAssignment_2 )
            {
             before(grammarAccess.getUserRoleAssignmentAccess().getRoleAssignment_2()); 
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:943:1: ( rule__UserRoleAssignment__RoleAssignment_2 )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:943:2: rule__UserRoleAssignment__RoleAssignment_2
            {
            pushFollow(FOLLOW_rule__UserRoleAssignment__RoleAssignment_2_in_rule__UserRoleAssignment__Group__2__Impl1860);
            rule__UserRoleAssignment__RoleAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getUserRoleAssignmentAccess().getRoleAssignment_2()); 

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


    // $ANTLR start rule__RolePermissionAssignment__Group__0
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:959:1: rule__RolePermissionAssignment__Group__0 : rule__RolePermissionAssignment__Group__0__Impl rule__RolePermissionAssignment__Group__1 ;
    public final void rule__RolePermissionAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:963:1: ( rule__RolePermissionAssignment__Group__0__Impl rule__RolePermissionAssignment__Group__1 )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:964:2: rule__RolePermissionAssignment__Group__0__Impl rule__RolePermissionAssignment__Group__1
            {
            pushFollow(FOLLOW_rule__RolePermissionAssignment__Group__0__Impl_in_rule__RolePermissionAssignment__Group__01896);
            rule__RolePermissionAssignment__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RolePermissionAssignment__Group__1_in_rule__RolePermissionAssignment__Group__01899);
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
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:971:1: rule__RolePermissionAssignment__Group__0__Impl : ( ( rule__RolePermissionAssignment__RoleAssignment_0 ) ) ;
    public final void rule__RolePermissionAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:975:1: ( ( ( rule__RolePermissionAssignment__RoleAssignment_0 ) ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:976:1: ( ( rule__RolePermissionAssignment__RoleAssignment_0 ) )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:976:1: ( ( rule__RolePermissionAssignment__RoleAssignment_0 ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:977:1: ( rule__RolePermissionAssignment__RoleAssignment_0 )
            {
             before(grammarAccess.getRolePermissionAssignmentAccess().getRoleAssignment_0()); 
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:978:1: ( rule__RolePermissionAssignment__RoleAssignment_0 )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:978:2: rule__RolePermissionAssignment__RoleAssignment_0
            {
            pushFollow(FOLLOW_rule__RolePermissionAssignment__RoleAssignment_0_in_rule__RolePermissionAssignment__Group__0__Impl1926);
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
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:988:1: rule__RolePermissionAssignment__Group__1 : rule__RolePermissionAssignment__Group__1__Impl rule__RolePermissionAssignment__Group__2 ;
    public final void rule__RolePermissionAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:992:1: ( rule__RolePermissionAssignment__Group__1__Impl rule__RolePermissionAssignment__Group__2 )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:993:2: rule__RolePermissionAssignment__Group__1__Impl rule__RolePermissionAssignment__Group__2
            {
            pushFollow(FOLLOW_rule__RolePermissionAssignment__Group__1__Impl_in_rule__RolePermissionAssignment__Group__11956);
            rule__RolePermissionAssignment__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RolePermissionAssignment__Group__2_in_rule__RolePermissionAssignment__Group__11959);
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
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1000:1: rule__RolePermissionAssignment__Group__1__Impl : ( '=' ) ;
    public final void rule__RolePermissionAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1004:1: ( ( '=' ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1005:1: ( '=' )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1005:1: ( '=' )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1006:1: '='
            {
             before(grammarAccess.getRolePermissionAssignmentAccess().getEqualsSignKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__RolePermissionAssignment__Group__1__Impl1987); 
             after(grammarAccess.getRolePermissionAssignmentAccess().getEqualsSignKeyword_1()); 

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
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1019:1: rule__RolePermissionAssignment__Group__2 : rule__RolePermissionAssignment__Group__2__Impl ;
    public final void rule__RolePermissionAssignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1023:1: ( rule__RolePermissionAssignment__Group__2__Impl )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1024:2: rule__RolePermissionAssignment__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__RolePermissionAssignment__Group__2__Impl_in_rule__RolePermissionAssignment__Group__22018);
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
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1030:1: rule__RolePermissionAssignment__Group__2__Impl : ( ( rule__RolePermissionAssignment__PermissionAssignment_2 ) ) ;
    public final void rule__RolePermissionAssignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1034:1: ( ( ( rule__RolePermissionAssignment__PermissionAssignment_2 ) ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1035:1: ( ( rule__RolePermissionAssignment__PermissionAssignment_2 ) )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1035:1: ( ( rule__RolePermissionAssignment__PermissionAssignment_2 ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1036:1: ( rule__RolePermissionAssignment__PermissionAssignment_2 )
            {
             before(grammarAccess.getRolePermissionAssignmentAccess().getPermissionAssignment_2()); 
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1037:1: ( rule__RolePermissionAssignment__PermissionAssignment_2 )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1037:2: rule__RolePermissionAssignment__PermissionAssignment_2
            {
            pushFollow(FOLLOW_rule__RolePermissionAssignment__PermissionAssignment_2_in_rule__RolePermissionAssignment__Group__2__Impl2045);
            rule__RolePermissionAssignment__PermissionAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getRolePermissionAssignmentAccess().getPermissionAssignment_2()); 

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
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1054:1: rule__Model__RolesAssignment_0 : ( ruleRole ) ;
    public final void rule__Model__RolesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1058:1: ( ( ruleRole ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1059:1: ( ruleRole )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1059:1: ( ruleRole )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1060:1: ruleRole
            {
             before(grammarAccess.getModelAccess().getRolesRoleParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleRole_in_rule__Model__RolesAssignment_02086);
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
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1069:1: rule__Model__UsersAssignment_1 : ( ruleUser ) ;
    public final void rule__Model__UsersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1073:1: ( ( ruleUser ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1074:1: ( ruleUser )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1074:1: ( ruleUser )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1075:1: ruleUser
            {
             before(grammarAccess.getModelAccess().getUsersUserParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleUser_in_rule__Model__UsersAssignment_12117);
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
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1084:1: rule__Model__SessionsAssignment_2 : ( ruleSession ) ;
    public final void rule__Model__SessionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1088:1: ( ( ruleSession ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1089:1: ( ruleSession )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1089:1: ( ruleSession )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1090:1: ruleSession
            {
             before(grammarAccess.getModelAccess().getSessionsSessionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleSession_in_rule__Model__SessionsAssignment_22148);
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
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1099:1: rule__Model__ObjectsAssignment_3 : ( ruleObject ) ;
    public final void rule__Model__ObjectsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1103:1: ( ( ruleObject ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1104:1: ( ruleObject )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1104:1: ( ruleObject )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1105:1: ruleObject
            {
             before(grammarAccess.getModelAccess().getObjectsObjectParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleObject_in_rule__Model__ObjectsAssignment_32179);
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
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1114:1: rule__Model__PermissionsAssignment_4 : ( rulePermission ) ;
    public final void rule__Model__PermissionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1118:1: ( ( rulePermission ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1119:1: ( rulePermission )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1119:1: ( rulePermission )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1120:1: rulePermission
            {
             before(grammarAccess.getModelAccess().getPermissionsPermissionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_rulePermission_in_rule__Model__PermissionsAssignment_42210);
            rulePermission();
            _fsp--;

             after(grammarAccess.getModelAccess().getPermissionsPermissionParserRuleCall_4_0()); 

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


    // $ANTLR start rule__Role__NameAssignment_1
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1129:1: rule__Role__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Role__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1133:1: ( ( RULE_ID ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1134:1: ( RULE_ID )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1134:1: ( RULE_ID )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1135:1: RULE_ID
            {
             before(grammarAccess.getRoleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Role__NameAssignment_12241); 
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


    // $ANTLR start rule__Role__PermissionsAssignment_3
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1144:1: rule__Role__PermissionsAssignment_3 : ( ruleRolePermissionAssignment ) ;
    public final void rule__Role__PermissionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1148:1: ( ( ruleRolePermissionAssignment ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1149:1: ( ruleRolePermissionAssignment )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1149:1: ( ruleRolePermissionAssignment )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1150:1: ruleRolePermissionAssignment
            {
             before(grammarAccess.getRoleAccess().getPermissionsRolePermissionAssignmentParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleRolePermissionAssignment_in_rule__Role__PermissionsAssignment_32272);
            ruleRolePermissionAssignment();
            _fsp--;

             after(grammarAccess.getRoleAccess().getPermissionsRolePermissionAssignmentParserRuleCall_3_0()); 

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
    // $ANTLR end rule__Role__PermissionsAssignment_3


    // $ANTLR start rule__User__NameAssignment_1
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1159:1: rule__User__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__User__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1163:1: ( ( RULE_ID ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1164:1: ( RULE_ID )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1164:1: ( RULE_ID )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1165:1: RULE_ID
            {
             before(grammarAccess.getUserAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__User__NameAssignment_12303); 
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


    // $ANTLR start rule__Permission__TypeAssignment_0
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1174:1: rule__Permission__TypeAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Permission__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1178:1: ( ( RULE_STRING ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1179:1: ( RULE_STRING )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1179:1: ( RULE_STRING )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1180:1: RULE_STRING
            {
             before(grammarAccess.getPermissionAccess().getTypeSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Permission__TypeAssignment_02334); 
             after(grammarAccess.getPermissionAccess().getTypeSTRINGTerminalRuleCall_0_0()); 

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
    // $ANTLR end rule__Permission__TypeAssignment_0


    // $ANTLR start rule__Permission__RoleAssignment_1
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1189:1: rule__Permission__RoleAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Permission__RoleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1193:1: ( ( ( RULE_ID ) ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1194:1: ( ( RULE_ID ) )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1194:1: ( ( RULE_ID ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1195:1: ( RULE_ID )
            {
             before(grammarAccess.getPermissionAccess().getRoleRoleCrossReference_1_0()); 
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1196:1: ( RULE_ID )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1197:1: RULE_ID
            {
             before(grammarAccess.getPermissionAccess().getRoleRoleIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Permission__RoleAssignment_12369); 
             after(grammarAccess.getPermissionAccess().getRoleRoleIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getPermissionAccess().getRoleRoleCrossReference_1_0()); 

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
    // $ANTLR end rule__Permission__RoleAssignment_1


    // $ANTLR start rule__Permission__ObjectAssignment_2
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1208:1: rule__Permission__ObjectAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Permission__ObjectAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1212:1: ( ( ( RULE_ID ) ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1213:1: ( ( RULE_ID ) )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1213:1: ( ( RULE_ID ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1214:1: ( RULE_ID )
            {
             before(grammarAccess.getPermissionAccess().getObjectObjectCrossReference_2_0()); 
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1215:1: ( RULE_ID )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1216:1: RULE_ID
            {
             before(grammarAccess.getPermissionAccess().getObjectObjectIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Permission__ObjectAssignment_22408); 
             after(grammarAccess.getPermissionAccess().getObjectObjectIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getPermissionAccess().getObjectObjectCrossReference_2_0()); 

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
    // $ANTLR end rule__Permission__ObjectAssignment_2


    // $ANTLR start rule__Object__NameAssignment_1
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1227:1: rule__Object__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Object__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1231:1: ( ( RULE_ID ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1232:1: ( RULE_ID )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1232:1: ( RULE_ID )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1233:1: RULE_ID
            {
             before(grammarAccess.getObjectAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Object__NameAssignment_12443); 
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


    // $ANTLR start rule__Session__NameAssignment_1
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1242:1: rule__Session__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Session__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1246:1: ( ( RULE_ID ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1247:1: ( RULE_ID )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1247:1: ( RULE_ID )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1248:1: RULE_ID
            {
             before(grammarAccess.getSessionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Session__NameAssignment_12474); 
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
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1257:1: rule__Session__AssignmentsAssignment_3 : ( ruleUserRoleAssignment ) ;
    public final void rule__Session__AssignmentsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1261:1: ( ( ruleUserRoleAssignment ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1262:1: ( ruleUserRoleAssignment )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1262:1: ( ruleUserRoleAssignment )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1263:1: ruleUserRoleAssignment
            {
             before(grammarAccess.getSessionAccess().getAssignmentsUserRoleAssignmentParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleUserRoleAssignment_in_rule__Session__AssignmentsAssignment_32505);
            ruleUserRoleAssignment();
            _fsp--;

             after(grammarAccess.getSessionAccess().getAssignmentsUserRoleAssignmentParserRuleCall_3_0()); 

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


    // $ANTLR start rule__UserRoleAssignment__UserAssignment_0
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1272:1: rule__UserRoleAssignment__UserAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__UserRoleAssignment__UserAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1276:1: ( ( ( RULE_ID ) ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1277:1: ( ( RULE_ID ) )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1277:1: ( ( RULE_ID ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1278:1: ( RULE_ID )
            {
             before(grammarAccess.getUserRoleAssignmentAccess().getUserUserCrossReference_0_0()); 
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1279:1: ( RULE_ID )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1280:1: RULE_ID
            {
             before(grammarAccess.getUserRoleAssignmentAccess().getUserUserIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__UserRoleAssignment__UserAssignment_02540); 
             after(grammarAccess.getUserRoleAssignmentAccess().getUserUserIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getUserRoleAssignmentAccess().getUserUserCrossReference_0_0()); 

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
    // $ANTLR end rule__UserRoleAssignment__UserAssignment_0


    // $ANTLR start rule__UserRoleAssignment__RoleAssignment_2
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1291:1: rule__UserRoleAssignment__RoleAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__UserRoleAssignment__RoleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1295:1: ( ( ( RULE_ID ) ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1296:1: ( ( RULE_ID ) )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1296:1: ( ( RULE_ID ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1297:1: ( RULE_ID )
            {
             before(grammarAccess.getUserRoleAssignmentAccess().getRoleRoleCrossReference_2_0()); 
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1298:1: ( RULE_ID )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1299:1: RULE_ID
            {
             before(grammarAccess.getUserRoleAssignmentAccess().getRoleRoleIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__UserRoleAssignment__RoleAssignment_22579); 
             after(grammarAccess.getUserRoleAssignmentAccess().getRoleRoleIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getUserRoleAssignmentAccess().getRoleRoleCrossReference_2_0()); 

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
    // $ANTLR end rule__UserRoleAssignment__RoleAssignment_2


    // $ANTLR start rule__RolePermissionAssignment__RoleAssignment_0
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1310:1: rule__RolePermissionAssignment__RoleAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__RolePermissionAssignment__RoleAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1314:1: ( ( ( RULE_ID ) ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1315:1: ( ( RULE_ID ) )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1315:1: ( ( RULE_ID ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1316:1: ( RULE_ID )
            {
             before(grammarAccess.getRolePermissionAssignmentAccess().getRoleRoleCrossReference_0_0()); 
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1317:1: ( RULE_ID )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1318:1: RULE_ID
            {
             before(grammarAccess.getRolePermissionAssignmentAccess().getRoleRoleIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RolePermissionAssignment__RoleAssignment_02618); 
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


    // $ANTLR start rule__RolePermissionAssignment__PermissionAssignment_2
    // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1329:1: rule__RolePermissionAssignment__PermissionAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__RolePermissionAssignment__PermissionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1333:1: ( ( ( RULE_ID ) ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1334:1: ( ( RULE_ID ) )
            {
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1334:1: ( ( RULE_ID ) )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1335:1: ( RULE_ID )
            {
             before(grammarAccess.getRolePermissionAssignmentAccess().getPermissionPermissionCrossReference_2_0()); 
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1336:1: ( RULE_ID )
            // ../rbac.ui/src-gen/uk/ac/open/rbac/ui/contentassist/antlr/internal/InternalRBAC.g:1337:1: RULE_ID
            {
             before(grammarAccess.getRolePermissionAssignmentAccess().getPermissionPermissionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RolePermissionAssignment__PermissionAssignment_22657); 
             after(grammarAccess.getRolePermissionAssignmentAccess().getPermissionPermissionIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getRolePermissionAssignmentAccess().getPermissionPermissionCrossReference_2_0()); 

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
    // $ANTLR end rule__RolePermissionAssignment__PermissionAssignment_2


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Alternatives_in_ruleModel94 = new BitSet(new long[]{0x000000000001C822L});
    public static final BitSet FOLLOW_ruleRole_in_entryRuleRole122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRole129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group__0_in_ruleRole155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUser_in_entryRuleUser182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUser189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__User__Group__0_in_ruleUser215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePermission_in_entryRulePermission242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePermission249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Permission__Group__0_in_rulePermission275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObject_in_entryRuleObject302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObject309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Object__Group__0_in_ruleObject335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSession_in_entryRuleSession362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSession369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Session__Group__0_in_ruleSession395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserRoleAssignment_in_entryRuleUserRoleAssignment422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUserRoleAssignment429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserRoleAssignment__Group__0_in_ruleUserRoleAssignment455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRolePermissionAssignment_in_entryRuleRolePermissionAssignment482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRolePermissionAssignment489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RolePermissionAssignment__Group__0_in_ruleRolePermissionAssignment515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__RolesAssignment_0_in_rule__Model__Alternatives551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__UsersAssignment_1_in_rule__Model__Alternatives569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__SessionsAssignment_2_in_rule__Model__Alternatives587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ObjectsAssignment_3_in_rule__Model__Alternatives605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__PermissionsAssignment_4_in_rule__Model__Alternatives623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group__0__Impl_in_rule__Role__Group__0654 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Role__Group__1_in_rule__Role__Group__0657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Role__Group__0__Impl685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group__1__Impl_in_rule__Role__Group__1716 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Role__Group__2_in_rule__Role__Group__1719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__NameAssignment_1_in_rule__Role__Group__1__Impl746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group__2__Impl_in_rule__Role__Group__2776 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_rule__Role__Group__3_in_rule__Role__Group__2779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Role__Group__2__Impl807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group__3__Impl_in_rule__Role__Group__3838 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Role__Group__4_in_rule__Role__Group__3841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__PermissionsAssignment_3_in_rule__Role__Group__3__Impl868 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Role__Group__4__Impl_in_rule__Role__Group__4899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Role__Group__4__Impl927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__User__Group__0__Impl_in_rule__User__Group__0968 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__User__Group__1_in_rule__User__Group__0971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__User__Group__0__Impl999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__User__Group__1__Impl_in_rule__User__Group__11030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__User__NameAssignment_1_in_rule__User__Group__1__Impl1057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Permission__Group__0__Impl_in_rule__Permission__Group__01091 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Permission__Group__1_in_rule__Permission__Group__01094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Permission__TypeAssignment_0_in_rule__Permission__Group__0__Impl1121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Permission__Group__1__Impl_in_rule__Permission__Group__11151 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Permission__Group__2_in_rule__Permission__Group__11154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Permission__RoleAssignment_1_in_rule__Permission__Group__1__Impl1181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Permission__Group__2__Impl_in_rule__Permission__Group__21211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Permission__ObjectAssignment_2_in_rule__Permission__Group__2__Impl1238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Object__Group__0__Impl_in_rule__Object__Group__01274 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Object__Group__1_in_rule__Object__Group__01277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Object__Group__0__Impl1305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Object__Group__1__Impl_in_rule__Object__Group__11336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Object__NameAssignment_1_in_rule__Object__Group__1__Impl1363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Session__Group__0__Impl_in_rule__Session__Group__01397 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Session__Group__1_in_rule__Session__Group__01400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Session__Group__0__Impl1428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Session__Group__1__Impl_in_rule__Session__Group__11459 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Session__Group__2_in_rule__Session__Group__11462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Session__NameAssignment_1_in_rule__Session__Group__1__Impl1489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Session__Group__2__Impl_in_rule__Session__Group__21519 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_rule__Session__Group__3_in_rule__Session__Group__21522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Session__Group__2__Impl1550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Session__Group__3__Impl_in_rule__Session__Group__31581 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Session__Group__4_in_rule__Session__Group__31584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Session__AssignmentsAssignment_3_in_rule__Session__Group__3__Impl1611 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Session__Group__4__Impl_in_rule__Session__Group__41642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Session__Group__4__Impl1670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserRoleAssignment__Group__0__Impl_in_rule__UserRoleAssignment__Group__01711 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__UserRoleAssignment__Group__1_in_rule__UserRoleAssignment__Group__01714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserRoleAssignment__UserAssignment_0_in_rule__UserRoleAssignment__Group__0__Impl1741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserRoleAssignment__Group__1__Impl_in_rule__UserRoleAssignment__Group__11771 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__UserRoleAssignment__Group__2_in_rule__UserRoleAssignment__Group__11774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__UserRoleAssignment__Group__1__Impl1802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserRoleAssignment__Group__2__Impl_in_rule__UserRoleAssignment__Group__21833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserRoleAssignment__RoleAssignment_2_in_rule__UserRoleAssignment__Group__2__Impl1860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RolePermissionAssignment__Group__0__Impl_in_rule__RolePermissionAssignment__Group__01896 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__RolePermissionAssignment__Group__1_in_rule__RolePermissionAssignment__Group__01899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RolePermissionAssignment__RoleAssignment_0_in_rule__RolePermissionAssignment__Group__0__Impl1926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RolePermissionAssignment__Group__1__Impl_in_rule__RolePermissionAssignment__Group__11956 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RolePermissionAssignment__Group__2_in_rule__RolePermissionAssignment__Group__11959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__RolePermissionAssignment__Group__1__Impl1987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RolePermissionAssignment__Group__2__Impl_in_rule__RolePermissionAssignment__Group__22018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RolePermissionAssignment__PermissionAssignment_2_in_rule__RolePermissionAssignment__Group__2__Impl2045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRole_in_rule__Model__RolesAssignment_02086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUser_in_rule__Model__UsersAssignment_12117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSession_in_rule__Model__SessionsAssignment_22148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObject_in_rule__Model__ObjectsAssignment_32179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePermission_in_rule__Model__PermissionsAssignment_42210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Role__NameAssignment_12241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRolePermissionAssignment_in_rule__Role__PermissionsAssignment_32272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__User__NameAssignment_12303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Permission__TypeAssignment_02334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Permission__RoleAssignment_12369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Permission__ObjectAssignment_22408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Object__NameAssignment_12443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Session__NameAssignment_12474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserRoleAssignment_in_rule__Session__AssignmentsAssignment_32505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__UserRoleAssignment__UserAssignment_02540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__UserRoleAssignment__RoleAssignment_22579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RolePermissionAssignment__RoleAssignment_02618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RolePermissionAssignment__PermissionAssignment_22657 = new BitSet(new long[]{0x0000000000000002L});

}