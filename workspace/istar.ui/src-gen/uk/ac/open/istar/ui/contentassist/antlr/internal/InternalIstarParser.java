package uk.ac.open.istar.ui.contentassist.antlr.internal; 

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
import uk.ac.open.istar.services.IstarGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalIstarParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "':'", "'istar'", "'actor'", "'{'", "'}'", "'agent'", "'role'", "'position'", "'goal'", "'soft'", "'task'", "'resource'", "'belief'", "'~~>'", "'~>'", "'<-(and)-'", "'<-(or)-'", "'-(and)->'", "'-(or)->'", "'-(+)->'", "'-(++)->'", "'-(-)->'", "'-(--)->'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

        public InternalIstarParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g"; }


     
     	private IstarGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(IstarGrammarAccess grammarAccess) {
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:61:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:62:1: ( ruleModel EOF )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:63:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();
            _fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModel68); 

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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:70:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:74:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:75:1: ( ( rule__Model__Group__0 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:75:1: ( ( rule__Model__Group__0 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:76:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:77:1: ( rule__Model__Group__0 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:77:2: rule__Model__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__0_in_ruleModel94);
            rule__Model__Group__0();
            _fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

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


    // $ANTLR start entryRuleContainer
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:89:1: entryRuleContainer : ruleContainer EOF ;
    public final void entryRuleContainer() throws RecognitionException {
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:90:1: ( ruleContainer EOF )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:91:1: ruleContainer EOF
            {
             before(grammarAccess.getContainerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleContainer_in_entryRuleContainer121);
            ruleContainer();
            _fsp--;

             after(grammarAccess.getContainerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleContainer128); 

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
    // $ANTLR end entryRuleContainer


    // $ANTLR start ruleContainer
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:98:1: ruleContainer : ( ( rule__Container__Alternatives ) ) ;
    public final void ruleContainer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:102:2: ( ( ( rule__Container__Alternatives ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:103:1: ( ( rule__Container__Alternatives ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:103:1: ( ( rule__Container__Alternatives ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:104:1: ( rule__Container__Alternatives )
            {
             before(grammarAccess.getContainerAccess().getAlternatives()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:105:1: ( rule__Container__Alternatives )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:105:2: rule__Container__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Container__Alternatives_in_ruleContainer154);
            rule__Container__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getContainerAccess().getAlternatives()); 

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
    // $ANTLR end ruleContainer


    // $ANTLR start entryRuleActor
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:117:1: entryRuleActor : ruleActor EOF ;
    public final void entryRuleActor() throws RecognitionException {
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:118:1: ( ruleActor EOF )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:119:1: ruleActor EOF
            {
             before(grammarAccess.getActorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleActor_in_entryRuleActor181);
            ruleActor();
            _fsp--;

             after(grammarAccess.getActorRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleActor188); 

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
    // $ANTLR end entryRuleActor


    // $ANTLR start ruleActor
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:126:1: ruleActor : ( ( rule__Actor__Group__0 ) ) ;
    public final void ruleActor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:130:2: ( ( ( rule__Actor__Group__0 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:131:1: ( ( rule__Actor__Group__0 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:131:1: ( ( rule__Actor__Group__0 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:132:1: ( rule__Actor__Group__0 )
            {
             before(grammarAccess.getActorAccess().getGroup()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:133:1: ( rule__Actor__Group__0 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:133:2: rule__Actor__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Actor__Group__0_in_ruleActor214);
            rule__Actor__Group__0();
            _fsp--;


            }

             after(grammarAccess.getActorAccess().getGroup()); 

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
    // $ANTLR end ruleActor


    // $ANTLR start entryRuleAgent
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:145:1: entryRuleAgent : ruleAgent EOF ;
    public final void entryRuleAgent() throws RecognitionException {
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:146:1: ( ruleAgent EOF )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:147:1: ruleAgent EOF
            {
             before(grammarAccess.getAgentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAgent_in_entryRuleAgent241);
            ruleAgent();
            _fsp--;

             after(grammarAccess.getAgentRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAgent248); 

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
    // $ANTLR end entryRuleAgent


    // $ANTLR start ruleAgent
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:154:1: ruleAgent : ( ( rule__Agent__Group__0 ) ) ;
    public final void ruleAgent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:158:2: ( ( ( rule__Agent__Group__0 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:159:1: ( ( rule__Agent__Group__0 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:159:1: ( ( rule__Agent__Group__0 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:160:1: ( rule__Agent__Group__0 )
            {
             before(grammarAccess.getAgentAccess().getGroup()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:161:1: ( rule__Agent__Group__0 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:161:2: rule__Agent__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Agent__Group__0_in_ruleAgent274);
            rule__Agent__Group__0();
            _fsp--;


            }

             after(grammarAccess.getAgentAccess().getGroup()); 

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
    // $ANTLR end ruleAgent


    // $ANTLR start entryRuleRole
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:173:1: entryRuleRole : ruleRole EOF ;
    public final void entryRuleRole() throws RecognitionException {
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:174:1: ( ruleRole EOF )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:175:1: ruleRole EOF
            {
             before(grammarAccess.getRoleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRole_in_entryRuleRole301);
            ruleRole();
            _fsp--;

             after(grammarAccess.getRoleRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRole308); 

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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:182:1: ruleRole : ( ( rule__Role__Group__0 ) ) ;
    public final void ruleRole() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:186:2: ( ( ( rule__Role__Group__0 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:187:1: ( ( rule__Role__Group__0 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:187:1: ( ( rule__Role__Group__0 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:188:1: ( rule__Role__Group__0 )
            {
             before(grammarAccess.getRoleAccess().getGroup()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:189:1: ( rule__Role__Group__0 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:189:2: rule__Role__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Role__Group__0_in_ruleRole334);
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


    // $ANTLR start entryRulePosition
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:201:1: entryRulePosition : rulePosition EOF ;
    public final void entryRulePosition() throws RecognitionException {
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:202:1: ( rulePosition EOF )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:203:1: rulePosition EOF
            {
             before(grammarAccess.getPositionRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePosition_in_entryRulePosition361);
            rulePosition();
            _fsp--;

             after(grammarAccess.getPositionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePosition368); 

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
    // $ANTLR end entryRulePosition


    // $ANTLR start rulePosition
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:210:1: rulePosition : ( ( rule__Position__Group__0 ) ) ;
    public final void rulePosition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:214:2: ( ( ( rule__Position__Group__0 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:215:1: ( ( rule__Position__Group__0 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:215:1: ( ( rule__Position__Group__0 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:216:1: ( rule__Position__Group__0 )
            {
             before(grammarAccess.getPositionAccess().getGroup()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:217:1: ( rule__Position__Group__0 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:217:2: rule__Position__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Position__Group__0_in_rulePosition394);
            rule__Position__Group__0();
            _fsp--;


            }

             after(grammarAccess.getPositionAccess().getGroup()); 

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
    // $ANTLR end rulePosition


    // $ANTLR start entryRuleIntention
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:229:1: entryRuleIntention : ruleIntention EOF ;
    public final void entryRuleIntention() throws RecognitionException {
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:230:1: ( ruleIntention EOF )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:231:1: ruleIntention EOF
            {
             before(grammarAccess.getIntentionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIntention_in_entryRuleIntention421);
            ruleIntention();
            _fsp--;

             after(grammarAccess.getIntentionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIntention428); 

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
    // $ANTLR end entryRuleIntention


    // $ANTLR start ruleIntention
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:238:1: ruleIntention : ( ( rule__Intention__Alternatives ) ) ;
    public final void ruleIntention() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:242:2: ( ( ( rule__Intention__Alternatives ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:243:1: ( ( rule__Intention__Alternatives ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:243:1: ( ( rule__Intention__Alternatives ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:244:1: ( rule__Intention__Alternatives )
            {
             before(grammarAccess.getIntentionAccess().getAlternatives()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:245:1: ( rule__Intention__Alternatives )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:245:2: rule__Intention__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intention__Alternatives_in_ruleIntention454);
            rule__Intention__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getIntentionAccess().getAlternatives()); 

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
    // $ANTLR end ruleIntention


    // $ANTLR start entryRuleGoal
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:257:1: entryRuleGoal : ruleGoal EOF ;
    public final void entryRuleGoal() throws RecognitionException {
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:258:1: ( ruleGoal EOF )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:259:1: ruleGoal EOF
            {
             before(grammarAccess.getGoalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGoal_in_entryRuleGoal481);
            ruleGoal();
            _fsp--;

             after(grammarAccess.getGoalRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGoal488); 

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
    // $ANTLR end entryRuleGoal


    // $ANTLR start ruleGoal
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:266:1: ruleGoal : ( ( rule__Goal__Group__0 ) ) ;
    public final void ruleGoal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:270:2: ( ( ( rule__Goal__Group__0 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:271:1: ( ( rule__Goal__Group__0 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:271:1: ( ( rule__Goal__Group__0 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:272:1: ( rule__Goal__Group__0 )
            {
             before(grammarAccess.getGoalAccess().getGroup()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:273:1: ( rule__Goal__Group__0 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:273:2: rule__Goal__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Goal__Group__0_in_ruleGoal514);
            rule__Goal__Group__0();
            _fsp--;


            }

             after(grammarAccess.getGoalAccess().getGroup()); 

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
    // $ANTLR end ruleGoal


    // $ANTLR start entryRuleSoftgoal
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:285:1: entryRuleSoftgoal : ruleSoftgoal EOF ;
    public final void entryRuleSoftgoal() throws RecognitionException {
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:286:1: ( ruleSoftgoal EOF )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:287:1: ruleSoftgoal EOF
            {
             before(grammarAccess.getSoftgoalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSoftgoal_in_entryRuleSoftgoal541);
            ruleSoftgoal();
            _fsp--;

             after(grammarAccess.getSoftgoalRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSoftgoal548); 

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
    // $ANTLR end entryRuleSoftgoal


    // $ANTLR start ruleSoftgoal
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:294:1: ruleSoftgoal : ( ( rule__Softgoal__Group__0 ) ) ;
    public final void ruleSoftgoal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:298:2: ( ( ( rule__Softgoal__Group__0 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:299:1: ( ( rule__Softgoal__Group__0 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:299:1: ( ( rule__Softgoal__Group__0 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:300:1: ( rule__Softgoal__Group__0 )
            {
             before(grammarAccess.getSoftgoalAccess().getGroup()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:301:1: ( rule__Softgoal__Group__0 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:301:2: rule__Softgoal__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Softgoal__Group__0_in_ruleSoftgoal574);
            rule__Softgoal__Group__0();
            _fsp--;


            }

             after(grammarAccess.getSoftgoalAccess().getGroup()); 

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
    // $ANTLR end ruleSoftgoal


    // $ANTLR start entryRuleTask
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:313:1: entryRuleTask : ruleTask EOF ;
    public final void entryRuleTask() throws RecognitionException {
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:314:1: ( ruleTask EOF )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:315:1: ruleTask EOF
            {
             before(grammarAccess.getTaskRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTask_in_entryRuleTask601);
            ruleTask();
            _fsp--;

             after(grammarAccess.getTaskRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTask608); 

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
    // $ANTLR end entryRuleTask


    // $ANTLR start ruleTask
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:322:1: ruleTask : ( ( rule__Task__Group__0 ) ) ;
    public final void ruleTask() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:326:2: ( ( ( rule__Task__Group__0 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:327:1: ( ( rule__Task__Group__0 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:327:1: ( ( rule__Task__Group__0 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:328:1: ( rule__Task__Group__0 )
            {
             before(grammarAccess.getTaskAccess().getGroup()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:329:1: ( rule__Task__Group__0 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:329:2: rule__Task__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Task__Group__0_in_ruleTask634);
            rule__Task__Group__0();
            _fsp--;


            }

             after(grammarAccess.getTaskAccess().getGroup()); 

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
    // $ANTLR end ruleTask


    // $ANTLR start entryRuleResource
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:341:1: entryRuleResource : ruleResource EOF ;
    public final void entryRuleResource() throws RecognitionException {
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:342:1: ( ruleResource EOF )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:343:1: ruleResource EOF
            {
             before(grammarAccess.getResourceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleResource_in_entryRuleResource661);
            ruleResource();
            _fsp--;

             after(grammarAccess.getResourceRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleResource668); 

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
    // $ANTLR end entryRuleResource


    // $ANTLR start ruleResource
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:350:1: ruleResource : ( ( rule__Resource__Group__0 ) ) ;
    public final void ruleResource() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:354:2: ( ( ( rule__Resource__Group__0 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:355:1: ( ( rule__Resource__Group__0 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:355:1: ( ( rule__Resource__Group__0 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:356:1: ( rule__Resource__Group__0 )
            {
             before(grammarAccess.getResourceAccess().getGroup()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:357:1: ( rule__Resource__Group__0 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:357:2: rule__Resource__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Resource__Group__0_in_ruleResource694);
            rule__Resource__Group__0();
            _fsp--;


            }

             after(grammarAccess.getResourceAccess().getGroup()); 

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
    // $ANTLR end ruleResource


    // $ANTLR start entryRuleBelief
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:369:1: entryRuleBelief : ruleBelief EOF ;
    public final void entryRuleBelief() throws RecognitionException {
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:370:1: ( ruleBelief EOF )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:371:1: ruleBelief EOF
            {
             before(grammarAccess.getBeliefRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBelief_in_entryRuleBelief721);
            ruleBelief();
            _fsp--;

             after(grammarAccess.getBeliefRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBelief728); 

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
    // $ANTLR end entryRuleBelief


    // $ANTLR start ruleBelief
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:378:1: ruleBelief : ( ( rule__Belief__Group__0 ) ) ;
    public final void ruleBelief() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:382:2: ( ( ( rule__Belief__Group__0 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:383:1: ( ( rule__Belief__Group__0 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:383:1: ( ( rule__Belief__Group__0 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:384:1: ( rule__Belief__Group__0 )
            {
             before(grammarAccess.getBeliefAccess().getGroup()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:385:1: ( rule__Belief__Group__0 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:385:2: rule__Belief__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Belief__Group__0_in_ruleBelief754);
            rule__Belief__Group__0();
            _fsp--;


            }

             after(grammarAccess.getBeliefAccess().getGroup()); 

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
    // $ANTLR end ruleBelief


    // $ANTLR start entryRuleAssociation
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:401:1: entryRuleAssociation : ruleAssociation EOF ;
    public final void entryRuleAssociation() throws RecognitionException {
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:402:1: ( ruleAssociation EOF )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:403:1: ruleAssociation EOF
            {
             before(grammarAccess.getAssociationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAssociation_in_entryRuleAssociation785);
            ruleAssociation();
            _fsp--;

             after(grammarAccess.getAssociationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAssociation792); 

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
    // $ANTLR end entryRuleAssociation


    // $ANTLR start ruleAssociation
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:410:1: ruleAssociation : ( ( rule__Association__Group__0 ) ) ;
    public final void ruleAssociation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:414:2: ( ( ( rule__Association__Group__0 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:415:1: ( ( rule__Association__Group__0 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:415:1: ( ( rule__Association__Group__0 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:416:1: ( rule__Association__Group__0 )
            {
             before(grammarAccess.getAssociationAccess().getGroup()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:417:1: ( rule__Association__Group__0 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:417:2: rule__Association__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Association__Group__0_in_ruleAssociation818);
            rule__Association__Group__0();
            _fsp--;


            }

             after(grammarAccess.getAssociationAccess().getGroup()); 

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
    // $ANTLR end ruleAssociation


    // $ANTLR start entryRuleDependency
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:429:1: entryRuleDependency : ruleDependency EOF ;
    public final void entryRuleDependency() throws RecognitionException {
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:430:1: ( ruleDependency EOF )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:431:1: ruleDependency EOF
            {
             before(grammarAccess.getDependencyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDependency_in_entryRuleDependency845);
            ruleDependency();
            _fsp--;

             after(grammarAccess.getDependencyRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDependency852); 

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
    // $ANTLR end entryRuleDependency


    // $ANTLR start ruleDependency
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:438:1: ruleDependency : ( ( rule__Dependency__Group__0 ) ) ;
    public final void ruleDependency() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:442:2: ( ( ( rule__Dependency__Group__0 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:443:1: ( ( rule__Dependency__Group__0 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:443:1: ( ( rule__Dependency__Group__0 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:444:1: ( rule__Dependency__Group__0 )
            {
             before(grammarAccess.getDependencyAccess().getGroup()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:445:1: ( rule__Dependency__Group__0 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:445:2: rule__Dependency__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Dependency__Group__0_in_ruleDependency878);
            rule__Dependency__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDependencyAccess().getGroup()); 

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
    // $ANTLR end ruleDependency


    // $ANTLR start entryRuleDecomposition
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:457:1: entryRuleDecomposition : ruleDecomposition EOF ;
    public final void entryRuleDecomposition() throws RecognitionException {
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:458:1: ( ruleDecomposition EOF )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:459:1: ruleDecomposition EOF
            {
             before(grammarAccess.getDecompositionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDecomposition_in_entryRuleDecomposition905);
            ruleDecomposition();
            _fsp--;

             after(grammarAccess.getDecompositionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDecomposition912); 

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
    // $ANTLR end entryRuleDecomposition


    // $ANTLR start ruleDecomposition
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:466:1: ruleDecomposition : ( ( rule__Decomposition__Alternatives ) ) ;
    public final void ruleDecomposition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:470:2: ( ( ( rule__Decomposition__Alternatives ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:471:1: ( ( rule__Decomposition__Alternatives ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:471:1: ( ( rule__Decomposition__Alternatives ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:472:1: ( rule__Decomposition__Alternatives )
            {
             before(grammarAccess.getDecompositionAccess().getAlternatives()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:473:1: ( rule__Decomposition__Alternatives )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:473:2: rule__Decomposition__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Decomposition__Alternatives_in_ruleDecomposition938);
            rule__Decomposition__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getDecompositionAccess().getAlternatives()); 

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
    // $ANTLR end ruleDecomposition


    // $ANTLR start entryRuleAndDecomposition
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:485:1: entryRuleAndDecomposition : ruleAndDecomposition EOF ;
    public final void entryRuleAndDecomposition() throws RecognitionException {
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:486:1: ( ruleAndDecomposition EOF )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:487:1: ruleAndDecomposition EOF
            {
             before(grammarAccess.getAndDecompositionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAndDecomposition_in_entryRuleAndDecomposition965);
            ruleAndDecomposition();
            _fsp--;

             after(grammarAccess.getAndDecompositionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAndDecomposition972); 

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
    // $ANTLR end entryRuleAndDecomposition


    // $ANTLR start ruleAndDecomposition
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:494:1: ruleAndDecomposition : ( ( rule__AndDecomposition__Group__0 ) ) ;
    public final void ruleAndDecomposition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:498:2: ( ( ( rule__AndDecomposition__Group__0 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:499:1: ( ( rule__AndDecomposition__Group__0 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:499:1: ( ( rule__AndDecomposition__Group__0 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:500:1: ( rule__AndDecomposition__Group__0 )
            {
             before(grammarAccess.getAndDecompositionAccess().getGroup()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:501:1: ( rule__AndDecomposition__Group__0 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:501:2: rule__AndDecomposition__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndDecomposition__Group__0_in_ruleAndDecomposition998);
            rule__AndDecomposition__Group__0();
            _fsp--;


            }

             after(grammarAccess.getAndDecompositionAccess().getGroup()); 

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
    // $ANTLR end ruleAndDecomposition


    // $ANTLR start entryRuleOrDecomposition
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:513:1: entryRuleOrDecomposition : ruleOrDecomposition EOF ;
    public final void entryRuleOrDecomposition() throws RecognitionException {
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:514:1: ( ruleOrDecomposition EOF )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:515:1: ruleOrDecomposition EOF
            {
             before(grammarAccess.getOrDecompositionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOrDecomposition_in_entryRuleOrDecomposition1025);
            ruleOrDecomposition();
            _fsp--;

             after(grammarAccess.getOrDecompositionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOrDecomposition1032); 

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
    // $ANTLR end entryRuleOrDecomposition


    // $ANTLR start ruleOrDecomposition
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:522:1: ruleOrDecomposition : ( ( rule__OrDecomposition__Group__0 ) ) ;
    public final void ruleOrDecomposition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:526:2: ( ( ( rule__OrDecomposition__Group__0 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:527:1: ( ( rule__OrDecomposition__Group__0 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:527:1: ( ( rule__OrDecomposition__Group__0 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:528:1: ( rule__OrDecomposition__Group__0 )
            {
             before(grammarAccess.getOrDecompositionAccess().getGroup()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:529:1: ( rule__OrDecomposition__Group__0 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:529:2: rule__OrDecomposition__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrDecomposition__Group__0_in_ruleOrDecomposition1058);
            rule__OrDecomposition__Group__0();
            _fsp--;


            }

             after(grammarAccess.getOrDecompositionAccess().getGroup()); 

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
    // $ANTLR end ruleOrDecomposition


    // $ANTLR start entryRuleContribution
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:541:1: entryRuleContribution : ruleContribution EOF ;
    public final void entryRuleContribution() throws RecognitionException {
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:542:1: ( ruleContribution EOF )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:543:1: ruleContribution EOF
            {
             before(grammarAccess.getContributionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleContribution_in_entryRuleContribution1085);
            ruleContribution();
            _fsp--;

             after(grammarAccess.getContributionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleContribution1092); 

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
    // $ANTLR end entryRuleContribution


    // $ANTLR start ruleContribution
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:550:1: ruleContribution : ( ( rule__Contribution__Alternatives ) ) ;
    public final void ruleContribution() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:554:2: ( ( ( rule__Contribution__Alternatives ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:555:1: ( ( rule__Contribution__Alternatives ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:555:1: ( ( rule__Contribution__Alternatives ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:556:1: ( rule__Contribution__Alternatives )
            {
             before(grammarAccess.getContributionAccess().getAlternatives()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:557:1: ( rule__Contribution__Alternatives )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:557:2: rule__Contribution__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Contribution__Alternatives_in_ruleContribution1118);
            rule__Contribution__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getContributionAccess().getAlternatives()); 

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
    // $ANTLR end ruleContribution


    // $ANTLR start entryRuleAndContribution
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:569:1: entryRuleAndContribution : ruleAndContribution EOF ;
    public final void entryRuleAndContribution() throws RecognitionException {
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:570:1: ( ruleAndContribution EOF )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:571:1: ruleAndContribution EOF
            {
             before(grammarAccess.getAndContributionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAndContribution_in_entryRuleAndContribution1145);
            ruleAndContribution();
            _fsp--;

             after(grammarAccess.getAndContributionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAndContribution1152); 

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
    // $ANTLR end entryRuleAndContribution


    // $ANTLR start ruleAndContribution
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:578:1: ruleAndContribution : ( ( rule__AndContribution__Group__0 ) ) ;
    public final void ruleAndContribution() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:582:2: ( ( ( rule__AndContribution__Group__0 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:583:1: ( ( rule__AndContribution__Group__0 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:583:1: ( ( rule__AndContribution__Group__0 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:584:1: ( rule__AndContribution__Group__0 )
            {
             before(grammarAccess.getAndContributionAccess().getGroup()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:585:1: ( rule__AndContribution__Group__0 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:585:2: rule__AndContribution__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndContribution__Group__0_in_ruleAndContribution1178);
            rule__AndContribution__Group__0();
            _fsp--;


            }

             after(grammarAccess.getAndContributionAccess().getGroup()); 

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
    // $ANTLR end ruleAndContribution


    // $ANTLR start entryRuleOrContribution
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:597:1: entryRuleOrContribution : ruleOrContribution EOF ;
    public final void entryRuleOrContribution() throws RecognitionException {
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:598:1: ( ruleOrContribution EOF )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:599:1: ruleOrContribution EOF
            {
             before(grammarAccess.getOrContributionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOrContribution_in_entryRuleOrContribution1205);
            ruleOrContribution();
            _fsp--;

             after(grammarAccess.getOrContributionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOrContribution1212); 

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
    // $ANTLR end entryRuleOrContribution


    // $ANTLR start ruleOrContribution
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:606:1: ruleOrContribution : ( ( rule__OrContribution__Group__0 ) ) ;
    public final void ruleOrContribution() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:610:2: ( ( ( rule__OrContribution__Group__0 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:611:1: ( ( rule__OrContribution__Group__0 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:611:1: ( ( rule__OrContribution__Group__0 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:612:1: ( rule__OrContribution__Group__0 )
            {
             before(grammarAccess.getOrContributionAccess().getGroup()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:613:1: ( rule__OrContribution__Group__0 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:613:2: rule__OrContribution__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrContribution__Group__0_in_ruleOrContribution1238);
            rule__OrContribution__Group__0();
            _fsp--;


            }

             after(grammarAccess.getOrContributionAccess().getGroup()); 

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
    // $ANTLR end ruleOrContribution


    // $ANTLR start entryRuleHelpContribution
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:625:1: entryRuleHelpContribution : ruleHelpContribution EOF ;
    public final void entryRuleHelpContribution() throws RecognitionException {
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:626:1: ( ruleHelpContribution EOF )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:627:1: ruleHelpContribution EOF
            {
             before(grammarAccess.getHelpContributionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleHelpContribution_in_entryRuleHelpContribution1265);
            ruleHelpContribution();
            _fsp--;

             after(grammarAccess.getHelpContributionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleHelpContribution1272); 

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
    // $ANTLR end entryRuleHelpContribution


    // $ANTLR start ruleHelpContribution
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:634:1: ruleHelpContribution : ( ( rule__HelpContribution__Group__0 ) ) ;
    public final void ruleHelpContribution() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:638:2: ( ( ( rule__HelpContribution__Group__0 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:639:1: ( ( rule__HelpContribution__Group__0 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:639:1: ( ( rule__HelpContribution__Group__0 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:640:1: ( rule__HelpContribution__Group__0 )
            {
             before(grammarAccess.getHelpContributionAccess().getGroup()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:641:1: ( rule__HelpContribution__Group__0 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:641:2: rule__HelpContribution__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__HelpContribution__Group__0_in_ruleHelpContribution1298);
            rule__HelpContribution__Group__0();
            _fsp--;


            }

             after(grammarAccess.getHelpContributionAccess().getGroup()); 

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
    // $ANTLR end ruleHelpContribution


    // $ANTLR start entryRuleMakeContribution
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:653:1: entryRuleMakeContribution : ruleMakeContribution EOF ;
    public final void entryRuleMakeContribution() throws RecognitionException {
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:654:1: ( ruleMakeContribution EOF )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:655:1: ruleMakeContribution EOF
            {
             before(grammarAccess.getMakeContributionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMakeContribution_in_entryRuleMakeContribution1325);
            ruleMakeContribution();
            _fsp--;

             after(grammarAccess.getMakeContributionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMakeContribution1332); 

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
    // $ANTLR end entryRuleMakeContribution


    // $ANTLR start ruleMakeContribution
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:662:1: ruleMakeContribution : ( ( rule__MakeContribution__Group__0 ) ) ;
    public final void ruleMakeContribution() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:666:2: ( ( ( rule__MakeContribution__Group__0 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:667:1: ( ( rule__MakeContribution__Group__0 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:667:1: ( ( rule__MakeContribution__Group__0 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:668:1: ( rule__MakeContribution__Group__0 )
            {
             before(grammarAccess.getMakeContributionAccess().getGroup()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:669:1: ( rule__MakeContribution__Group__0 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:669:2: rule__MakeContribution__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MakeContribution__Group__0_in_ruleMakeContribution1358);
            rule__MakeContribution__Group__0();
            _fsp--;


            }

             after(grammarAccess.getMakeContributionAccess().getGroup()); 

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
    // $ANTLR end ruleMakeContribution


    // $ANTLR start entryRuleHurtContribution
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:681:1: entryRuleHurtContribution : ruleHurtContribution EOF ;
    public final void entryRuleHurtContribution() throws RecognitionException {
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:682:1: ( ruleHurtContribution EOF )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:683:1: ruleHurtContribution EOF
            {
             before(grammarAccess.getHurtContributionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleHurtContribution_in_entryRuleHurtContribution1385);
            ruleHurtContribution();
            _fsp--;

             after(grammarAccess.getHurtContributionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleHurtContribution1392); 

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
    // $ANTLR end entryRuleHurtContribution


    // $ANTLR start ruleHurtContribution
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:690:1: ruleHurtContribution : ( ( rule__HurtContribution__Group__0 ) ) ;
    public final void ruleHurtContribution() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:694:2: ( ( ( rule__HurtContribution__Group__0 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:695:1: ( ( rule__HurtContribution__Group__0 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:695:1: ( ( rule__HurtContribution__Group__0 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:696:1: ( rule__HurtContribution__Group__0 )
            {
             before(grammarAccess.getHurtContributionAccess().getGroup()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:697:1: ( rule__HurtContribution__Group__0 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:697:2: rule__HurtContribution__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__HurtContribution__Group__0_in_ruleHurtContribution1418);
            rule__HurtContribution__Group__0();
            _fsp--;


            }

             after(grammarAccess.getHurtContributionAccess().getGroup()); 

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
    // $ANTLR end ruleHurtContribution


    // $ANTLR start entryRuleBreakContribution
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:709:1: entryRuleBreakContribution : ruleBreakContribution EOF ;
    public final void entryRuleBreakContribution() throws RecognitionException {
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:710:1: ( ruleBreakContribution EOF )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:711:1: ruleBreakContribution EOF
            {
             before(grammarAccess.getBreakContributionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBreakContribution_in_entryRuleBreakContribution1445);
            ruleBreakContribution();
            _fsp--;

             after(grammarAccess.getBreakContributionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBreakContribution1452); 

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
    // $ANTLR end entryRuleBreakContribution


    // $ANTLR start ruleBreakContribution
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:718:1: ruleBreakContribution : ( ( rule__BreakContribution__Group__0 ) ) ;
    public final void ruleBreakContribution() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:722:2: ( ( ( rule__BreakContribution__Group__0 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:723:1: ( ( rule__BreakContribution__Group__0 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:723:1: ( ( rule__BreakContribution__Group__0 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:724:1: ( rule__BreakContribution__Group__0 )
            {
             before(grammarAccess.getBreakContributionAccess().getGroup()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:725:1: ( rule__BreakContribution__Group__0 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:725:2: rule__BreakContribution__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__BreakContribution__Group__0_in_ruleBreakContribution1478);
            rule__BreakContribution__Group__0();
            _fsp--;


            }

             after(grammarAccess.getBreakContributionAccess().getGroup()); 

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
    // $ANTLR end ruleBreakContribution


    // $ANTLR start rule__Model__Alternatives_3
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:737:1: rule__Model__Alternatives_3 : ( ( ( rule__Model__ContainersAssignment_3_0 ) ) | ( ( rule__Model__IntentionsAssignment_3_1 ) ) | ( ( rule__Model__DecompositionsAssignment_3_2 ) ) | ( ( rule__Model__DependenciesAssignment_3_3 ) ) | ( ( rule__Model__ContributionsAssignment_3_4 ) ) | ( ( rule__Model__AssociationsAssignment_3_5 ) ) );
    public final void rule__Model__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:741:1: ( ( ( rule__Model__ContainersAssignment_3_0 ) ) | ( ( rule__Model__IntentionsAssignment_3_1 ) ) | ( ( rule__Model__DecompositionsAssignment_3_2 ) ) | ( ( rule__Model__DependenciesAssignment_3_3 ) ) | ( ( rule__Model__ContributionsAssignment_3_4 ) ) | ( ( rule__Model__AssociationsAssignment_3_5 ) ) )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 13:
            case 16:
            case 17:
            case 18:
                {
                alt1=1;
                }
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                {
                alt1=2;
                }
                break;
            case RULE_ID:
                {
                switch ( input.LA(2) ) {
                case 26:
                case 27:
                    {
                    alt1=3;
                    }
                    break;
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                    {
                    alt1=5;
                    }
                    break;
                case 25:
                    {
                    alt1=4;
                    }
                    break;
                case 24:
                    {
                    alt1=6;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("737:1: rule__Model__Alternatives_3 : ( ( ( rule__Model__ContainersAssignment_3_0 ) ) | ( ( rule__Model__IntentionsAssignment_3_1 ) ) | ( ( rule__Model__DecompositionsAssignment_3_2 ) ) | ( ( rule__Model__DependenciesAssignment_3_3 ) ) | ( ( rule__Model__ContributionsAssignment_3_4 ) ) | ( ( rule__Model__AssociationsAssignment_3_5 ) ) );", 1, 3, input);

                    throw nvae;
                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("737:1: rule__Model__Alternatives_3 : ( ( ( rule__Model__ContainersAssignment_3_0 ) ) | ( ( rule__Model__IntentionsAssignment_3_1 ) ) | ( ( rule__Model__DecompositionsAssignment_3_2 ) ) | ( ( rule__Model__DependenciesAssignment_3_3 ) ) | ( ( rule__Model__ContributionsAssignment_3_4 ) ) | ( ( rule__Model__AssociationsAssignment_3_5 ) ) );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:742:1: ( ( rule__Model__ContainersAssignment_3_0 ) )
                    {
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:742:1: ( ( rule__Model__ContainersAssignment_3_0 ) )
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:743:1: ( rule__Model__ContainersAssignment_3_0 )
                    {
                     before(grammarAccess.getModelAccess().getContainersAssignment_3_0()); 
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:744:1: ( rule__Model__ContainersAssignment_3_0 )
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:744:2: rule__Model__ContainersAssignment_3_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Model__ContainersAssignment_3_0_in_rule__Model__Alternatives_31514);
                    rule__Model__ContainersAssignment_3_0();
                    _fsp--;


                    }

                     after(grammarAccess.getModelAccess().getContainersAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:748:6: ( ( rule__Model__IntentionsAssignment_3_1 ) )
                    {
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:748:6: ( ( rule__Model__IntentionsAssignment_3_1 ) )
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:749:1: ( rule__Model__IntentionsAssignment_3_1 )
                    {
                     before(grammarAccess.getModelAccess().getIntentionsAssignment_3_1()); 
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:750:1: ( rule__Model__IntentionsAssignment_3_1 )
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:750:2: rule__Model__IntentionsAssignment_3_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Model__IntentionsAssignment_3_1_in_rule__Model__Alternatives_31532);
                    rule__Model__IntentionsAssignment_3_1();
                    _fsp--;


                    }

                     after(grammarAccess.getModelAccess().getIntentionsAssignment_3_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:754:6: ( ( rule__Model__DecompositionsAssignment_3_2 ) )
                    {
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:754:6: ( ( rule__Model__DecompositionsAssignment_3_2 ) )
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:755:1: ( rule__Model__DecompositionsAssignment_3_2 )
                    {
                     before(grammarAccess.getModelAccess().getDecompositionsAssignment_3_2()); 
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:756:1: ( rule__Model__DecompositionsAssignment_3_2 )
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:756:2: rule__Model__DecompositionsAssignment_3_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Model__DecompositionsAssignment_3_2_in_rule__Model__Alternatives_31550);
                    rule__Model__DecompositionsAssignment_3_2();
                    _fsp--;


                    }

                     after(grammarAccess.getModelAccess().getDecompositionsAssignment_3_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:760:6: ( ( rule__Model__DependenciesAssignment_3_3 ) )
                    {
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:760:6: ( ( rule__Model__DependenciesAssignment_3_3 ) )
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:761:1: ( rule__Model__DependenciesAssignment_3_3 )
                    {
                     before(grammarAccess.getModelAccess().getDependenciesAssignment_3_3()); 
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:762:1: ( rule__Model__DependenciesAssignment_3_3 )
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:762:2: rule__Model__DependenciesAssignment_3_3
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Model__DependenciesAssignment_3_3_in_rule__Model__Alternatives_31568);
                    rule__Model__DependenciesAssignment_3_3();
                    _fsp--;


                    }

                     after(grammarAccess.getModelAccess().getDependenciesAssignment_3_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:766:6: ( ( rule__Model__ContributionsAssignment_3_4 ) )
                    {
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:766:6: ( ( rule__Model__ContributionsAssignment_3_4 ) )
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:767:1: ( rule__Model__ContributionsAssignment_3_4 )
                    {
                     before(grammarAccess.getModelAccess().getContributionsAssignment_3_4()); 
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:768:1: ( rule__Model__ContributionsAssignment_3_4 )
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:768:2: rule__Model__ContributionsAssignment_3_4
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Model__ContributionsAssignment_3_4_in_rule__Model__Alternatives_31586);
                    rule__Model__ContributionsAssignment_3_4();
                    _fsp--;


                    }

                     after(grammarAccess.getModelAccess().getContributionsAssignment_3_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:772:6: ( ( rule__Model__AssociationsAssignment_3_5 ) )
                    {
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:772:6: ( ( rule__Model__AssociationsAssignment_3_5 ) )
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:773:1: ( rule__Model__AssociationsAssignment_3_5 )
                    {
                     before(grammarAccess.getModelAccess().getAssociationsAssignment_3_5()); 
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:774:1: ( rule__Model__AssociationsAssignment_3_5 )
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:774:2: rule__Model__AssociationsAssignment_3_5
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Model__AssociationsAssignment_3_5_in_rule__Model__Alternatives_31604);
                    rule__Model__AssociationsAssignment_3_5();
                    _fsp--;


                    }

                     after(grammarAccess.getModelAccess().getAssociationsAssignment_3_5()); 

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
    // $ANTLR end rule__Model__Alternatives_3


    // $ANTLR start rule__Container__Alternatives
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:783:1: rule__Container__Alternatives : ( ( ruleActor ) | ( ruleAgent ) | ( ruleRole ) | ( rulePosition ) );
    public final void rule__Container__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:787:1: ( ( ruleActor ) | ( ruleAgent ) | ( ruleRole ) | ( rulePosition ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt2=1;
                }
                break;
            case 16:
                {
                alt2=2;
                }
                break;
            case 17:
                {
                alt2=3;
                }
                break;
            case 18:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("783:1: rule__Container__Alternatives : ( ( ruleActor ) | ( ruleAgent ) | ( ruleRole ) | ( rulePosition ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:788:1: ( ruleActor )
                    {
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:788:1: ( ruleActor )
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:789:1: ruleActor
                    {
                     before(grammarAccess.getContainerAccess().getActorParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleActor_in_rule__Container__Alternatives1637);
                    ruleActor();
                    _fsp--;

                     after(grammarAccess.getContainerAccess().getActorParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:794:6: ( ruleAgent )
                    {
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:794:6: ( ruleAgent )
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:795:1: ruleAgent
                    {
                     before(grammarAccess.getContainerAccess().getAgentParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleAgent_in_rule__Container__Alternatives1654);
                    ruleAgent();
                    _fsp--;

                     after(grammarAccess.getContainerAccess().getAgentParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:800:6: ( ruleRole )
                    {
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:800:6: ( ruleRole )
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:801:1: ruleRole
                    {
                     before(grammarAccess.getContainerAccess().getRoleParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleRole_in_rule__Container__Alternatives1671);
                    ruleRole();
                    _fsp--;

                     after(grammarAccess.getContainerAccess().getRoleParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:806:6: ( rulePosition )
                    {
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:806:6: ( rulePosition )
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:807:1: rulePosition
                    {
                     before(grammarAccess.getContainerAccess().getPositionParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_rulePosition_in_rule__Container__Alternatives1688);
                    rulePosition();
                    _fsp--;

                     after(grammarAccess.getContainerAccess().getPositionParserRuleCall_3()); 

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
    // $ANTLR end rule__Container__Alternatives


    // $ANTLR start rule__Actor__Alternatives_2
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:817:1: rule__Actor__Alternatives_2 : ( ( ( rule__Actor__Is_aAssignment_2_0 ) ) | ( ( rule__Actor__Is_part_ofAssignment_2_1 ) ) );
    public final void rule__Actor__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:821:1: ( ( ( rule__Actor__Is_aAssignment_2_0 ) ) | ( ( rule__Actor__Is_part_ofAssignment_2_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("817:1: rule__Actor__Alternatives_2 : ( ( ( rule__Actor__Is_aAssignment_2_0 ) ) | ( ( rule__Actor__Is_part_ofAssignment_2_1 ) ) );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:822:1: ( ( rule__Actor__Is_aAssignment_2_0 ) )
                    {
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:822:1: ( ( rule__Actor__Is_aAssignment_2_0 ) )
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:823:1: ( rule__Actor__Is_aAssignment_2_0 )
                    {
                     before(grammarAccess.getActorAccess().getIs_aAssignment_2_0()); 
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:824:1: ( rule__Actor__Is_aAssignment_2_0 )
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:824:2: rule__Actor__Is_aAssignment_2_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Actor__Is_aAssignment_2_0_in_rule__Actor__Alternatives_21720);
                    rule__Actor__Is_aAssignment_2_0();
                    _fsp--;


                    }

                     after(grammarAccess.getActorAccess().getIs_aAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:828:6: ( ( rule__Actor__Is_part_ofAssignment_2_1 ) )
                    {
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:828:6: ( ( rule__Actor__Is_part_ofAssignment_2_1 ) )
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:829:1: ( rule__Actor__Is_part_ofAssignment_2_1 )
                    {
                     before(grammarAccess.getActorAccess().getIs_part_ofAssignment_2_1()); 
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:830:1: ( rule__Actor__Is_part_ofAssignment_2_1 )
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:830:2: rule__Actor__Is_part_ofAssignment_2_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Actor__Is_part_ofAssignment_2_1_in_rule__Actor__Alternatives_21738);
                    rule__Actor__Is_part_ofAssignment_2_1();
                    _fsp--;


                    }

                     after(grammarAccess.getActorAccess().getIs_part_ofAssignment_2_1()); 

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
    // $ANTLR end rule__Actor__Alternatives_2


    // $ANTLR start rule__Intention__Alternatives
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:839:1: rule__Intention__Alternatives : ( ( ruleGoal ) | ( ruleSoftgoal ) | ( ruleTask ) | ( ruleResource ) | ( ruleBelief ) );
    public final void rule__Intention__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:843:1: ( ( ruleGoal ) | ( ruleSoftgoal ) | ( ruleTask ) | ( ruleResource ) | ( ruleBelief ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt4=1;
                }
                break;
            case 20:
                {
                alt4=2;
                }
                break;
            case 21:
                {
                alt4=3;
                }
                break;
            case 22:
                {
                alt4=4;
                }
                break;
            case 23:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("839:1: rule__Intention__Alternatives : ( ( ruleGoal ) | ( ruleSoftgoal ) | ( ruleTask ) | ( ruleResource ) | ( ruleBelief ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:844:1: ( ruleGoal )
                    {
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:844:1: ( ruleGoal )
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:845:1: ruleGoal
                    {
                     before(grammarAccess.getIntentionAccess().getGoalParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleGoal_in_rule__Intention__Alternatives1771);
                    ruleGoal();
                    _fsp--;

                     after(grammarAccess.getIntentionAccess().getGoalParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:850:6: ( ruleSoftgoal )
                    {
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:850:6: ( ruleSoftgoal )
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:851:1: ruleSoftgoal
                    {
                     before(grammarAccess.getIntentionAccess().getSoftgoalParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleSoftgoal_in_rule__Intention__Alternatives1788);
                    ruleSoftgoal();
                    _fsp--;

                     after(grammarAccess.getIntentionAccess().getSoftgoalParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:856:6: ( ruleTask )
                    {
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:856:6: ( ruleTask )
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:857:1: ruleTask
                    {
                     before(grammarAccess.getIntentionAccess().getTaskParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleTask_in_rule__Intention__Alternatives1805);
                    ruleTask();
                    _fsp--;

                     after(grammarAccess.getIntentionAccess().getTaskParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:862:6: ( ruleResource )
                    {
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:862:6: ( ruleResource )
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:863:1: ruleResource
                    {
                     before(grammarAccess.getIntentionAccess().getResourceParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleResource_in_rule__Intention__Alternatives1822);
                    ruleResource();
                    _fsp--;

                     after(grammarAccess.getIntentionAccess().getResourceParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:868:6: ( ruleBelief )
                    {
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:868:6: ( ruleBelief )
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:869:1: ruleBelief
                    {
                     before(grammarAccess.getIntentionAccess().getBeliefParserRuleCall_4()); 
                    pushFollow(FollowSets000.FOLLOW_ruleBelief_in_rule__Intention__Alternatives1839);
                    ruleBelief();
                    _fsp--;

                     after(grammarAccess.getIntentionAccess().getBeliefParserRuleCall_4()); 

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
    // $ANTLR end rule__Intention__Alternatives


    // $ANTLR start rule__Decomposition__Alternatives
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:881:1: rule__Decomposition__Alternatives : ( ( ruleAndDecomposition ) | ( ruleOrDecomposition ) );
    public final void rule__Decomposition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:885:1: ( ( ruleAndDecomposition ) | ( ruleOrDecomposition ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==26) ) {
                    alt5=1;
                }
                else if ( (LA5_1==27) ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("881:1: rule__Decomposition__Alternatives : ( ( ruleAndDecomposition ) | ( ruleOrDecomposition ) );", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("881:1: rule__Decomposition__Alternatives : ( ( ruleAndDecomposition ) | ( ruleOrDecomposition ) );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:886:1: ( ruleAndDecomposition )
                    {
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:886:1: ( ruleAndDecomposition )
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:887:1: ruleAndDecomposition
                    {
                     before(grammarAccess.getDecompositionAccess().getAndDecompositionParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleAndDecomposition_in_rule__Decomposition__Alternatives1873);
                    ruleAndDecomposition();
                    _fsp--;

                     after(grammarAccess.getDecompositionAccess().getAndDecompositionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:892:6: ( ruleOrDecomposition )
                    {
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:892:6: ( ruleOrDecomposition )
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:893:1: ruleOrDecomposition
                    {
                     before(grammarAccess.getDecompositionAccess().getOrDecompositionParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleOrDecomposition_in_rule__Decomposition__Alternatives1890);
                    ruleOrDecomposition();
                    _fsp--;

                     after(grammarAccess.getDecompositionAccess().getOrDecompositionParserRuleCall_1()); 

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
    // $ANTLR end rule__Decomposition__Alternatives


    // $ANTLR start rule__Contribution__Alternatives
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:903:1: rule__Contribution__Alternatives : ( ( ruleAndContribution ) | ( ruleOrContribution ) | ( ruleHelpContribution ) | ( ruleHurtContribution ) | ( ruleMakeContribution ) | ( ruleBreakContribution ) );
    public final void rule__Contribution__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:907:1: ( ( ruleAndContribution ) | ( ruleOrContribution ) | ( ruleHelpContribution ) | ( ruleHurtContribution ) | ( ruleMakeContribution ) | ( ruleBreakContribution ) )
            int alt6=6;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 31:
                    {
                    alt6=5;
                    }
                    break;
                case 33:
                    {
                    alt6=6;
                    }
                    break;
                case 30:
                    {
                    alt6=3;
                    }
                    break;
                case 32:
                    {
                    alt6=4;
                    }
                    break;
                case 28:
                    {
                    alt6=1;
                    }
                    break;
                case 29:
                    {
                    alt6=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("903:1: rule__Contribution__Alternatives : ( ( ruleAndContribution ) | ( ruleOrContribution ) | ( ruleHelpContribution ) | ( ruleHurtContribution ) | ( ruleMakeContribution ) | ( ruleBreakContribution ) );", 6, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("903:1: rule__Contribution__Alternatives : ( ( ruleAndContribution ) | ( ruleOrContribution ) | ( ruleHelpContribution ) | ( ruleHurtContribution ) | ( ruleMakeContribution ) | ( ruleBreakContribution ) );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:908:1: ( ruleAndContribution )
                    {
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:908:1: ( ruleAndContribution )
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:909:1: ruleAndContribution
                    {
                     before(grammarAccess.getContributionAccess().getAndContributionParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleAndContribution_in_rule__Contribution__Alternatives1922);
                    ruleAndContribution();
                    _fsp--;

                     after(grammarAccess.getContributionAccess().getAndContributionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:914:6: ( ruleOrContribution )
                    {
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:914:6: ( ruleOrContribution )
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:915:1: ruleOrContribution
                    {
                     before(grammarAccess.getContributionAccess().getOrContributionParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleOrContribution_in_rule__Contribution__Alternatives1939);
                    ruleOrContribution();
                    _fsp--;

                     after(grammarAccess.getContributionAccess().getOrContributionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:920:6: ( ruleHelpContribution )
                    {
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:920:6: ( ruleHelpContribution )
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:921:1: ruleHelpContribution
                    {
                     before(grammarAccess.getContributionAccess().getHelpContributionParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleHelpContribution_in_rule__Contribution__Alternatives1956);
                    ruleHelpContribution();
                    _fsp--;

                     after(grammarAccess.getContributionAccess().getHelpContributionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:926:6: ( ruleHurtContribution )
                    {
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:926:6: ( ruleHurtContribution )
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:927:1: ruleHurtContribution
                    {
                     before(grammarAccess.getContributionAccess().getHurtContributionParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleHurtContribution_in_rule__Contribution__Alternatives1973);
                    ruleHurtContribution();
                    _fsp--;

                     after(grammarAccess.getContributionAccess().getHurtContributionParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:932:6: ( ruleMakeContribution )
                    {
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:932:6: ( ruleMakeContribution )
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:933:1: ruleMakeContribution
                    {
                     before(grammarAccess.getContributionAccess().getMakeContributionParserRuleCall_4()); 
                    pushFollow(FollowSets000.FOLLOW_ruleMakeContribution_in_rule__Contribution__Alternatives1990);
                    ruleMakeContribution();
                    _fsp--;

                     after(grammarAccess.getContributionAccess().getMakeContributionParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:938:6: ( ruleBreakContribution )
                    {
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:938:6: ( ruleBreakContribution )
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:939:1: ruleBreakContribution
                    {
                     before(grammarAccess.getContributionAccess().getBreakContributionParserRuleCall_5()); 
                    pushFollow(FollowSets000.FOLLOW_ruleBreakContribution_in_rule__Contribution__Alternatives2007);
                    ruleBreakContribution();
                    _fsp--;

                     after(grammarAccess.getContributionAccess().getBreakContributionParserRuleCall_5()); 

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
    // $ANTLR end rule__Contribution__Alternatives


    // $ANTLR start rule__Model__Group__0
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:951:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:955:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:956:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02037);
            rule__Model__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02040);
            rule__Model__Group__1();
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
    // $ANTLR end rule__Model__Group__0


    // $ANTLR start rule__Model__Group__0__Impl
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:963:1: rule__Model__Group__0__Impl : ( () ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:967:1: ( ( () ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:968:1: ( () )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:968:1: ( () )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:969:1: ()
            {
             before(grammarAccess.getModelAccess().getModelAction_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:970:1: ()
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:972:1: 
            {
            }

             after(grammarAccess.getModelAccess().getModelAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__Group__0__Impl


    // $ANTLR start rule__Model__Group__1
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:982:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:986:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:987:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12098);
            rule__Model__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__2_in_rule__Model__Group__12101);
            rule__Model__Group__2();
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
    // $ANTLR end rule__Model__Group__1


    // $ANTLR start rule__Model__Group__1__Impl
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:994:1: rule__Model__Group__1__Impl : ( ( rule__Model__Group_1__0 )? ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:998:1: ( ( ( rule__Model__Group_1__0 )? ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:999:1: ( ( rule__Model__Group_1__0 )? )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:999:1: ( ( rule__Model__Group_1__0 )? )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1000:1: ( rule__Model__Group_1__0 )?
            {
             before(grammarAccess.getModelAccess().getGroup_1()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1001:1: ( rule__Model__Group_1__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==12) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1001:2: rule__Model__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Model__Group_1__0_in_rule__Model__Group__1__Impl2128);
                    rule__Model__Group_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getGroup_1()); 

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
    // $ANTLR end rule__Model__Group__1__Impl


    // $ANTLR start rule__Model__Group__2
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1011:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1015:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1016:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__22159);
            rule__Model__Group__2__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__3_in_rule__Model__Group__22162);
            rule__Model__Group__3();
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
    // $ANTLR end rule__Model__Group__2


    // $ANTLR start rule__Model__Group__2__Impl
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1023:1: rule__Model__Group__2__Impl : ( ':' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1027:1: ( ( ':' ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1028:1: ( ':' )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1028:1: ( ':' )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1029:1: ':'
            {
             before(grammarAccess.getModelAccess().getColonKeyword_2()); 
            match(input,11,FollowSets000.FOLLOW_11_in_rule__Model__Group__2__Impl2190); 
             after(grammarAccess.getModelAccess().getColonKeyword_2()); 

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
    // $ANTLR end rule__Model__Group__2__Impl


    // $ANTLR start rule__Model__Group__3
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1042:1: rule__Model__Group__3 : rule__Model__Group__3__Impl ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1046:1: ( rule__Model__Group__3__Impl )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1047:2: rule__Model__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__32221);
            rule__Model__Group__3__Impl();
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
    // $ANTLR end rule__Model__Group__3


    // $ANTLR start rule__Model__Group__3__Impl
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1053:1: rule__Model__Group__3__Impl : ( ( rule__Model__Alternatives_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1057:1: ( ( ( rule__Model__Alternatives_3 )* ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1058:1: ( ( rule__Model__Alternatives_3 )* )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1058:1: ( ( rule__Model__Alternatives_3 )* )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1059:1: ( rule__Model__Alternatives_3 )*
            {
             before(grammarAccess.getModelAccess().getAlternatives_3()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1060:1: ( rule__Model__Alternatives_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||LA8_0==13||(LA8_0>=16 && LA8_0<=23)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1060:2: rule__Model__Alternatives_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Model__Alternatives_3_in_rule__Model__Group__3__Impl2248);
            	    rule__Model__Alternatives_3();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getAlternatives_3()); 

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
    // $ANTLR end rule__Model__Group__3__Impl


    // $ANTLR start rule__Model__Group_1__0
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1078:1: rule__Model__Group_1__0 : rule__Model__Group_1__0__Impl rule__Model__Group_1__1 ;
    public final void rule__Model__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1082:1: ( rule__Model__Group_1__0__Impl rule__Model__Group_1__1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1083:2: rule__Model__Group_1__0__Impl rule__Model__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_1__0__Impl_in_rule__Model__Group_1__02287);
            rule__Model__Group_1__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_1__1_in_rule__Model__Group_1__02290);
            rule__Model__Group_1__1();
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
    // $ANTLR end rule__Model__Group_1__0


    // $ANTLR start rule__Model__Group_1__0__Impl
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1090:1: rule__Model__Group_1__0__Impl : ( 'istar' ) ;
    public final void rule__Model__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1094:1: ( ( 'istar' ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1095:1: ( 'istar' )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1095:1: ( 'istar' )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1096:1: 'istar'
            {
             before(grammarAccess.getModelAccess().getIstarKeyword_1_0()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Model__Group_1__0__Impl2318); 
             after(grammarAccess.getModelAccess().getIstarKeyword_1_0()); 

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
    // $ANTLR end rule__Model__Group_1__0__Impl


    // $ANTLR start rule__Model__Group_1__1
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1109:1: rule__Model__Group_1__1 : rule__Model__Group_1__1__Impl ;
    public final void rule__Model__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1113:1: ( rule__Model__Group_1__1__Impl )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1114:2: rule__Model__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_1__1__Impl_in_rule__Model__Group_1__12349);
            rule__Model__Group_1__1__Impl();
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
    // $ANTLR end rule__Model__Group_1__1


    // $ANTLR start rule__Model__Group_1__1__Impl
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1120:1: rule__Model__Group_1__1__Impl : ( ( rule__Model__NameAssignment_1_1 ) ) ;
    public final void rule__Model__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1124:1: ( ( ( rule__Model__NameAssignment_1_1 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1125:1: ( ( rule__Model__NameAssignment_1_1 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1125:1: ( ( rule__Model__NameAssignment_1_1 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1126:1: ( rule__Model__NameAssignment_1_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1_1()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1127:1: ( rule__Model__NameAssignment_1_1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1127:2: rule__Model__NameAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__NameAssignment_1_1_in_rule__Model__Group_1__1__Impl2376);
            rule__Model__NameAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getModelAccess().getNameAssignment_1_1()); 

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
    // $ANTLR end rule__Model__Group_1__1__Impl


    // $ANTLR start rule__Actor__Group__0
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1141:1: rule__Actor__Group__0 : rule__Actor__Group__0__Impl rule__Actor__Group__1 ;
    public final void rule__Actor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1145:1: ( rule__Actor__Group__0__Impl rule__Actor__Group__1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1146:2: rule__Actor__Group__0__Impl rule__Actor__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Actor__Group__0__Impl_in_rule__Actor__Group__02410);
            rule__Actor__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Actor__Group__1_in_rule__Actor__Group__02413);
            rule__Actor__Group__1();
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
    // $ANTLR end rule__Actor__Group__0


    // $ANTLR start rule__Actor__Group__0__Impl
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1153:1: rule__Actor__Group__0__Impl : ( 'actor' ) ;
    public final void rule__Actor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1157:1: ( ( 'actor' ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1158:1: ( 'actor' )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1158:1: ( 'actor' )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1159:1: 'actor'
            {
             before(grammarAccess.getActorAccess().getActorKeyword_0()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Actor__Group__0__Impl2441); 
             after(grammarAccess.getActorAccess().getActorKeyword_0()); 

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
    // $ANTLR end rule__Actor__Group__0__Impl


    // $ANTLR start rule__Actor__Group__1
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1172:1: rule__Actor__Group__1 : rule__Actor__Group__1__Impl rule__Actor__Group__2 ;
    public final void rule__Actor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1176:1: ( rule__Actor__Group__1__Impl rule__Actor__Group__2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1177:2: rule__Actor__Group__1__Impl rule__Actor__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Actor__Group__1__Impl_in_rule__Actor__Group__12472);
            rule__Actor__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Actor__Group__2_in_rule__Actor__Group__12475);
            rule__Actor__Group__2();
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
    // $ANTLR end rule__Actor__Group__1


    // $ANTLR start rule__Actor__Group__1__Impl
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1184:1: rule__Actor__Group__1__Impl : ( ( rule__Actor__NameAssignment_1 ) ) ;
    public final void rule__Actor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1188:1: ( ( ( rule__Actor__NameAssignment_1 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1189:1: ( ( rule__Actor__NameAssignment_1 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1189:1: ( ( rule__Actor__NameAssignment_1 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1190:1: ( rule__Actor__NameAssignment_1 )
            {
             before(grammarAccess.getActorAccess().getNameAssignment_1()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1191:1: ( rule__Actor__NameAssignment_1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1191:2: rule__Actor__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Actor__NameAssignment_1_in_rule__Actor__Group__1__Impl2502);
            rule__Actor__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getActorAccess().getNameAssignment_1()); 

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
    // $ANTLR end rule__Actor__Group__1__Impl


    // $ANTLR start rule__Actor__Group__2
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1201:1: rule__Actor__Group__2 : rule__Actor__Group__2__Impl rule__Actor__Group__3 ;
    public final void rule__Actor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1205:1: ( rule__Actor__Group__2__Impl rule__Actor__Group__3 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1206:2: rule__Actor__Group__2__Impl rule__Actor__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Actor__Group__2__Impl_in_rule__Actor__Group__22532);
            rule__Actor__Group__2__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Actor__Group__3_in_rule__Actor__Group__22535);
            rule__Actor__Group__3();
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
    // $ANTLR end rule__Actor__Group__2


    // $ANTLR start rule__Actor__Group__2__Impl
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1213:1: rule__Actor__Group__2__Impl : ( ( rule__Actor__Alternatives_2 )* ) ;
    public final void rule__Actor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1217:1: ( ( ( rule__Actor__Alternatives_2 )* ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1218:1: ( ( rule__Actor__Alternatives_2 )* )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1218:1: ( ( rule__Actor__Alternatives_2 )* )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1219:1: ( rule__Actor__Alternatives_2 )*
            {
             before(grammarAccess.getActorAccess().getAlternatives_2()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1220:1: ( rule__Actor__Alternatives_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    int LA9_2 = input.LA(2);

                    if ( (LA9_2==EOF||LA9_2==RULE_ID||(LA9_2>=13 && LA9_2<=14)||(LA9_2>=16 && LA9_2<=23)) ) {
                        alt9=1;
                    }


                }


                switch (alt9) {
            	case 1 :
            	    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1220:2: rule__Actor__Alternatives_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Actor__Alternatives_2_in_rule__Actor__Group__2__Impl2562);
            	    rule__Actor__Alternatives_2();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getActorAccess().getAlternatives_2()); 

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
    // $ANTLR end rule__Actor__Group__2__Impl


    // $ANTLR start rule__Actor__Group__3
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1230:1: rule__Actor__Group__3 : rule__Actor__Group__3__Impl ;
    public final void rule__Actor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1234:1: ( rule__Actor__Group__3__Impl )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1235:2: rule__Actor__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Actor__Group__3__Impl_in_rule__Actor__Group__32593);
            rule__Actor__Group__3__Impl();
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
    // $ANTLR end rule__Actor__Group__3


    // $ANTLR start rule__Actor__Group__3__Impl
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1241:1: rule__Actor__Group__3__Impl : ( ( rule__Actor__Group_3__0 )? ) ;
    public final void rule__Actor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1245:1: ( ( ( rule__Actor__Group_3__0 )? ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1246:1: ( ( rule__Actor__Group_3__0 )? )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1246:1: ( ( rule__Actor__Group_3__0 )? )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1247:1: ( rule__Actor__Group_3__0 )?
            {
             before(grammarAccess.getActorAccess().getGroup_3()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1248:1: ( rule__Actor__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==14) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1248:2: rule__Actor__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Actor__Group_3__0_in_rule__Actor__Group__3__Impl2620);
                    rule__Actor__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActorAccess().getGroup_3()); 

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
    // $ANTLR end rule__Actor__Group__3__Impl


    // $ANTLR start rule__Actor__Group_3__0
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1266:1: rule__Actor__Group_3__0 : rule__Actor__Group_3__0__Impl rule__Actor__Group_3__1 ;
    public final void rule__Actor__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1270:1: ( rule__Actor__Group_3__0__Impl rule__Actor__Group_3__1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1271:2: rule__Actor__Group_3__0__Impl rule__Actor__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Actor__Group_3__0__Impl_in_rule__Actor__Group_3__02659);
            rule__Actor__Group_3__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Actor__Group_3__1_in_rule__Actor__Group_3__02662);
            rule__Actor__Group_3__1();
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
    // $ANTLR end rule__Actor__Group_3__0


    // $ANTLR start rule__Actor__Group_3__0__Impl
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1278:1: rule__Actor__Group_3__0__Impl : ( '{' ) ;
    public final void rule__Actor__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1282:1: ( ( '{' ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1283:1: ( '{' )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1283:1: ( '{' )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1284:1: '{'
            {
             before(grammarAccess.getActorAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Actor__Group_3__0__Impl2690); 
             after(grammarAccess.getActorAccess().getLeftCurlyBracketKeyword_3_0()); 

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
    // $ANTLR end rule__Actor__Group_3__0__Impl


    // $ANTLR start rule__Actor__Group_3__1
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1297:1: rule__Actor__Group_3__1 : rule__Actor__Group_3__1__Impl rule__Actor__Group_3__2 ;
    public final void rule__Actor__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1301:1: ( rule__Actor__Group_3__1__Impl rule__Actor__Group_3__2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1302:2: rule__Actor__Group_3__1__Impl rule__Actor__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Actor__Group_3__1__Impl_in_rule__Actor__Group_3__12721);
            rule__Actor__Group_3__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Actor__Group_3__2_in_rule__Actor__Group_3__12724);
            rule__Actor__Group_3__2();
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
    // $ANTLR end rule__Actor__Group_3__1


    // $ANTLR start rule__Actor__Group_3__1__Impl
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1309:1: rule__Actor__Group_3__1__Impl : ( ( rule__Actor__IntentionsAssignment_3_1 )* ) ;
    public final void rule__Actor__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1313:1: ( ( ( rule__Actor__IntentionsAssignment_3_1 )* ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1314:1: ( ( rule__Actor__IntentionsAssignment_3_1 )* )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1314:1: ( ( rule__Actor__IntentionsAssignment_3_1 )* )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1315:1: ( rule__Actor__IntentionsAssignment_3_1 )*
            {
             before(grammarAccess.getActorAccess().getIntentionsAssignment_3_1()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1316:1: ( rule__Actor__IntentionsAssignment_3_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=19 && LA11_0<=23)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1316:2: rule__Actor__IntentionsAssignment_3_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Actor__IntentionsAssignment_3_1_in_rule__Actor__Group_3__1__Impl2751);
            	    rule__Actor__IntentionsAssignment_3_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getActorAccess().getIntentionsAssignment_3_1()); 

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
    // $ANTLR end rule__Actor__Group_3__1__Impl


    // $ANTLR start rule__Actor__Group_3__2
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1326:1: rule__Actor__Group_3__2 : rule__Actor__Group_3__2__Impl ;
    public final void rule__Actor__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1330:1: ( rule__Actor__Group_3__2__Impl )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1331:2: rule__Actor__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Actor__Group_3__2__Impl_in_rule__Actor__Group_3__22782);
            rule__Actor__Group_3__2__Impl();
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
    // $ANTLR end rule__Actor__Group_3__2


    // $ANTLR start rule__Actor__Group_3__2__Impl
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1337:1: rule__Actor__Group_3__2__Impl : ( '}' ) ;
    public final void rule__Actor__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1341:1: ( ( '}' ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1342:1: ( '}' )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1342:1: ( '}' )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1343:1: '}'
            {
             before(grammarAccess.getActorAccess().getRightCurlyBracketKeyword_3_2()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Actor__Group_3__2__Impl2810); 
             after(grammarAccess.getActorAccess().getRightCurlyBracketKeyword_3_2()); 

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
    // $ANTLR end rule__Actor__Group_3__2__Impl


    // $ANTLR start rule__Agent__Group__0
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1362:1: rule__Agent__Group__0 : rule__Agent__Group__0__Impl rule__Agent__Group__1 ;
    public final void rule__Agent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1366:1: ( rule__Agent__Group__0__Impl rule__Agent__Group__1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1367:2: rule__Agent__Group__0__Impl rule__Agent__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Agent__Group__0__Impl_in_rule__Agent__Group__02847);
            rule__Agent__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Agent__Group__1_in_rule__Agent__Group__02850);
            rule__Agent__Group__1();
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
    // $ANTLR end rule__Agent__Group__0


    // $ANTLR start rule__Agent__Group__0__Impl
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1374:1: rule__Agent__Group__0__Impl : ( 'agent' ) ;
    public final void rule__Agent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1378:1: ( ( 'agent' ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1379:1: ( 'agent' )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1379:1: ( 'agent' )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1380:1: 'agent'
            {
             before(grammarAccess.getAgentAccess().getAgentKeyword_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Agent__Group__0__Impl2878); 
             after(grammarAccess.getAgentAccess().getAgentKeyword_0()); 

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
    // $ANTLR end rule__Agent__Group__0__Impl


    // $ANTLR start rule__Agent__Group__1
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1393:1: rule__Agent__Group__1 : rule__Agent__Group__1__Impl rule__Agent__Group__2 ;
    public final void rule__Agent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1397:1: ( rule__Agent__Group__1__Impl rule__Agent__Group__2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1398:2: rule__Agent__Group__1__Impl rule__Agent__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Agent__Group__1__Impl_in_rule__Agent__Group__12909);
            rule__Agent__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Agent__Group__2_in_rule__Agent__Group__12912);
            rule__Agent__Group__2();
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
    // $ANTLR end rule__Agent__Group__1


    // $ANTLR start rule__Agent__Group__1__Impl
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1405:1: rule__Agent__Group__1__Impl : ( ( rule__Agent__NameAssignment_1 ) ) ;
    public final void rule__Agent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1409:1: ( ( ( rule__Agent__NameAssignment_1 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1410:1: ( ( rule__Agent__NameAssignment_1 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1410:1: ( ( rule__Agent__NameAssignment_1 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1411:1: ( rule__Agent__NameAssignment_1 )
            {
             before(grammarAccess.getAgentAccess().getNameAssignment_1()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1412:1: ( rule__Agent__NameAssignment_1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1412:2: rule__Agent__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Agent__NameAssignment_1_in_rule__Agent__Group__1__Impl2939);
            rule__Agent__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getAgentAccess().getNameAssignment_1()); 

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
    // $ANTLR end rule__Agent__Group__1__Impl


    // $ANTLR start rule__Agent__Group__2
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1422:1: rule__Agent__Group__2 : rule__Agent__Group__2__Impl ;
    public final void rule__Agent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1426:1: ( rule__Agent__Group__2__Impl )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1427:2: rule__Agent__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Agent__Group__2__Impl_in_rule__Agent__Group__22969);
            rule__Agent__Group__2__Impl();
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
    // $ANTLR end rule__Agent__Group__2


    // $ANTLR start rule__Agent__Group__2__Impl
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1433:1: rule__Agent__Group__2__Impl : ( ( rule__Agent__Group_2__0 )? ) ;
    public final void rule__Agent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1437:1: ( ( ( rule__Agent__Group_2__0 )? ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1438:1: ( ( rule__Agent__Group_2__0 )? )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1438:1: ( ( rule__Agent__Group_2__0 )? )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1439:1: ( rule__Agent__Group_2__0 )?
            {
             before(grammarAccess.getAgentAccess().getGroup_2()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1440:1: ( rule__Agent__Group_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==14) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1440:2: rule__Agent__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Agent__Group_2__0_in_rule__Agent__Group__2__Impl2996);
                    rule__Agent__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAgentAccess().getGroup_2()); 

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
    // $ANTLR end rule__Agent__Group__2__Impl


    // $ANTLR start rule__Agent__Group_2__0
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1456:1: rule__Agent__Group_2__0 : rule__Agent__Group_2__0__Impl rule__Agent__Group_2__1 ;
    public final void rule__Agent__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1460:1: ( rule__Agent__Group_2__0__Impl rule__Agent__Group_2__1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1461:2: rule__Agent__Group_2__0__Impl rule__Agent__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Agent__Group_2__0__Impl_in_rule__Agent__Group_2__03033);
            rule__Agent__Group_2__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Agent__Group_2__1_in_rule__Agent__Group_2__03036);
            rule__Agent__Group_2__1();
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
    // $ANTLR end rule__Agent__Group_2__0


    // $ANTLR start rule__Agent__Group_2__0__Impl
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1468:1: rule__Agent__Group_2__0__Impl : ( '{' ) ;
    public final void rule__Agent__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1472:1: ( ( '{' ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1473:1: ( '{' )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1473:1: ( '{' )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1474:1: '{'
            {
             before(grammarAccess.getAgentAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Agent__Group_2__0__Impl3064); 
             after(grammarAccess.getAgentAccess().getLeftCurlyBracketKeyword_2_0()); 

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
    // $ANTLR end rule__Agent__Group_2__0__Impl


    // $ANTLR start rule__Agent__Group_2__1
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1487:1: rule__Agent__Group_2__1 : rule__Agent__Group_2__1__Impl rule__Agent__Group_2__2 ;
    public final void rule__Agent__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1491:1: ( rule__Agent__Group_2__1__Impl rule__Agent__Group_2__2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1492:2: rule__Agent__Group_2__1__Impl rule__Agent__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Agent__Group_2__1__Impl_in_rule__Agent__Group_2__13095);
            rule__Agent__Group_2__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Agent__Group_2__2_in_rule__Agent__Group_2__13098);
            rule__Agent__Group_2__2();
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
    // $ANTLR end rule__Agent__Group_2__1


    // $ANTLR start rule__Agent__Group_2__1__Impl
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1499:1: rule__Agent__Group_2__1__Impl : ( ( rule__Agent__IntentionsAssignment_2_1 )* ) ;
    public final void rule__Agent__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1503:1: ( ( ( rule__Agent__IntentionsAssignment_2_1 )* ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1504:1: ( ( rule__Agent__IntentionsAssignment_2_1 )* )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1504:1: ( ( rule__Agent__IntentionsAssignment_2_1 )* )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1505:1: ( rule__Agent__IntentionsAssignment_2_1 )*
            {
             before(grammarAccess.getAgentAccess().getIntentionsAssignment_2_1()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1506:1: ( rule__Agent__IntentionsAssignment_2_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=19 && LA13_0<=23)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1506:2: rule__Agent__IntentionsAssignment_2_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Agent__IntentionsAssignment_2_1_in_rule__Agent__Group_2__1__Impl3125);
            	    rule__Agent__IntentionsAssignment_2_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getAgentAccess().getIntentionsAssignment_2_1()); 

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
    // $ANTLR end rule__Agent__Group_2__1__Impl


    // $ANTLR start rule__Agent__Group_2__2
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1516:1: rule__Agent__Group_2__2 : rule__Agent__Group_2__2__Impl ;
    public final void rule__Agent__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1520:1: ( rule__Agent__Group_2__2__Impl )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1521:2: rule__Agent__Group_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Agent__Group_2__2__Impl_in_rule__Agent__Group_2__23156);
            rule__Agent__Group_2__2__Impl();
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
    // $ANTLR end rule__Agent__Group_2__2


    // $ANTLR start rule__Agent__Group_2__2__Impl
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1527:1: rule__Agent__Group_2__2__Impl : ( '}' ) ;
    public final void rule__Agent__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1531:1: ( ( '}' ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1532:1: ( '}' )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1532:1: ( '}' )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1533:1: '}'
            {
             before(grammarAccess.getAgentAccess().getRightCurlyBracketKeyword_2_2()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Agent__Group_2__2__Impl3184); 
             after(grammarAccess.getAgentAccess().getRightCurlyBracketKeyword_2_2()); 

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
    // $ANTLR end rule__Agent__Group_2__2__Impl


    // $ANTLR start rule__Role__Group__0
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1552:1: rule__Role__Group__0 : rule__Role__Group__0__Impl rule__Role__Group__1 ;
    public final void rule__Role__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1556:1: ( rule__Role__Group__0__Impl rule__Role__Group__1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1557:2: rule__Role__Group__0__Impl rule__Role__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Role__Group__0__Impl_in_rule__Role__Group__03221);
            rule__Role__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Role__Group__1_in_rule__Role__Group__03224);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1564:1: rule__Role__Group__0__Impl : ( 'role' ) ;
    public final void rule__Role__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1568:1: ( ( 'role' ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1569:1: ( 'role' )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1569:1: ( 'role' )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1570:1: 'role'
            {
             before(grammarAccess.getRoleAccess().getRoleKeyword_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Role__Group__0__Impl3252); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1583:1: rule__Role__Group__1 : rule__Role__Group__1__Impl rule__Role__Group__2 ;
    public final void rule__Role__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1587:1: ( rule__Role__Group__1__Impl rule__Role__Group__2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1588:2: rule__Role__Group__1__Impl rule__Role__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Role__Group__1__Impl_in_rule__Role__Group__13283);
            rule__Role__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Role__Group__2_in_rule__Role__Group__13286);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1595:1: rule__Role__Group__1__Impl : ( ( rule__Role__NameAssignment_1 ) ) ;
    public final void rule__Role__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1599:1: ( ( ( rule__Role__NameAssignment_1 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1600:1: ( ( rule__Role__NameAssignment_1 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1600:1: ( ( rule__Role__NameAssignment_1 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1601:1: ( rule__Role__NameAssignment_1 )
            {
             before(grammarAccess.getRoleAccess().getNameAssignment_1()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1602:1: ( rule__Role__NameAssignment_1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1602:2: rule__Role__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Role__NameAssignment_1_in_rule__Role__Group__1__Impl3313);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1612:1: rule__Role__Group__2 : rule__Role__Group__2__Impl ;
    public final void rule__Role__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1616:1: ( rule__Role__Group__2__Impl )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1617:2: rule__Role__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Role__Group__2__Impl_in_rule__Role__Group__23343);
            rule__Role__Group__2__Impl();
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1623:1: rule__Role__Group__2__Impl : ( ( rule__Role__Group_2__0 )? ) ;
    public final void rule__Role__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1627:1: ( ( ( rule__Role__Group_2__0 )? ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1628:1: ( ( rule__Role__Group_2__0 )? )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1628:1: ( ( rule__Role__Group_2__0 )? )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1629:1: ( rule__Role__Group_2__0 )?
            {
             before(grammarAccess.getRoleAccess().getGroup_2()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1630:1: ( rule__Role__Group_2__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==14) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1630:2: rule__Role__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Role__Group_2__0_in_rule__Role__Group__2__Impl3370);
                    rule__Role__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRoleAccess().getGroup_2()); 

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


    // $ANTLR start rule__Role__Group_2__0
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1646:1: rule__Role__Group_2__0 : rule__Role__Group_2__0__Impl rule__Role__Group_2__1 ;
    public final void rule__Role__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1650:1: ( rule__Role__Group_2__0__Impl rule__Role__Group_2__1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1651:2: rule__Role__Group_2__0__Impl rule__Role__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Role__Group_2__0__Impl_in_rule__Role__Group_2__03407);
            rule__Role__Group_2__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Role__Group_2__1_in_rule__Role__Group_2__03410);
            rule__Role__Group_2__1();
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
    // $ANTLR end rule__Role__Group_2__0


    // $ANTLR start rule__Role__Group_2__0__Impl
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1658:1: rule__Role__Group_2__0__Impl : ( '{' ) ;
    public final void rule__Role__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1662:1: ( ( '{' ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1663:1: ( '{' )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1663:1: ( '{' )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1664:1: '{'
            {
             before(grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Role__Group_2__0__Impl3438); 
             after(grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_2_0()); 

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
    // $ANTLR end rule__Role__Group_2__0__Impl


    // $ANTLR start rule__Role__Group_2__1
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1677:1: rule__Role__Group_2__1 : rule__Role__Group_2__1__Impl rule__Role__Group_2__2 ;
    public final void rule__Role__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1681:1: ( rule__Role__Group_2__1__Impl rule__Role__Group_2__2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1682:2: rule__Role__Group_2__1__Impl rule__Role__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Role__Group_2__1__Impl_in_rule__Role__Group_2__13469);
            rule__Role__Group_2__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Role__Group_2__2_in_rule__Role__Group_2__13472);
            rule__Role__Group_2__2();
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
    // $ANTLR end rule__Role__Group_2__1


    // $ANTLR start rule__Role__Group_2__1__Impl
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1689:1: rule__Role__Group_2__1__Impl : ( ( rule__Role__IntentionsAssignment_2_1 )* ) ;
    public final void rule__Role__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1693:1: ( ( ( rule__Role__IntentionsAssignment_2_1 )* ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1694:1: ( ( rule__Role__IntentionsAssignment_2_1 )* )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1694:1: ( ( rule__Role__IntentionsAssignment_2_1 )* )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1695:1: ( rule__Role__IntentionsAssignment_2_1 )*
            {
             before(grammarAccess.getRoleAccess().getIntentionsAssignment_2_1()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1696:1: ( rule__Role__IntentionsAssignment_2_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=19 && LA15_0<=23)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1696:2: rule__Role__IntentionsAssignment_2_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Role__IntentionsAssignment_2_1_in_rule__Role__Group_2__1__Impl3499);
            	    rule__Role__IntentionsAssignment_2_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getRoleAccess().getIntentionsAssignment_2_1()); 

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
    // $ANTLR end rule__Role__Group_2__1__Impl


    // $ANTLR start rule__Role__Group_2__2
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1706:1: rule__Role__Group_2__2 : rule__Role__Group_2__2__Impl ;
    public final void rule__Role__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1710:1: ( rule__Role__Group_2__2__Impl )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1711:2: rule__Role__Group_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Role__Group_2__2__Impl_in_rule__Role__Group_2__23530);
            rule__Role__Group_2__2__Impl();
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
    // $ANTLR end rule__Role__Group_2__2


    // $ANTLR start rule__Role__Group_2__2__Impl
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1717:1: rule__Role__Group_2__2__Impl : ( '}' ) ;
    public final void rule__Role__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1721:1: ( ( '}' ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1722:1: ( '}' )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1722:1: ( '}' )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1723:1: '}'
            {
             before(grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_2_2()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Role__Group_2__2__Impl3558); 
             after(grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_2_2()); 

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
    // $ANTLR end rule__Role__Group_2__2__Impl


    // $ANTLR start rule__Position__Group__0
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1742:1: rule__Position__Group__0 : rule__Position__Group__0__Impl rule__Position__Group__1 ;
    public final void rule__Position__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1746:1: ( rule__Position__Group__0__Impl rule__Position__Group__1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1747:2: rule__Position__Group__0__Impl rule__Position__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Position__Group__0__Impl_in_rule__Position__Group__03595);
            rule__Position__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Position__Group__1_in_rule__Position__Group__03598);
            rule__Position__Group__1();
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
    // $ANTLR end rule__Position__Group__0


    // $ANTLR start rule__Position__Group__0__Impl
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1754:1: rule__Position__Group__0__Impl : ( 'position' ) ;
    public final void rule__Position__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1758:1: ( ( 'position' ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1759:1: ( 'position' )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1759:1: ( 'position' )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1760:1: 'position'
            {
             before(grammarAccess.getPositionAccess().getPositionKeyword_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Position__Group__0__Impl3626); 
             after(grammarAccess.getPositionAccess().getPositionKeyword_0()); 

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
    // $ANTLR end rule__Position__Group__0__Impl


    // $ANTLR start rule__Position__Group__1
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1773:1: rule__Position__Group__1 : rule__Position__Group__1__Impl rule__Position__Group__2 ;
    public final void rule__Position__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1777:1: ( rule__Position__Group__1__Impl rule__Position__Group__2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1778:2: rule__Position__Group__1__Impl rule__Position__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Position__Group__1__Impl_in_rule__Position__Group__13657);
            rule__Position__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Position__Group__2_in_rule__Position__Group__13660);
            rule__Position__Group__2();
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
    // $ANTLR end rule__Position__Group__1


    // $ANTLR start rule__Position__Group__1__Impl
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1785:1: rule__Position__Group__1__Impl : ( ( rule__Position__NameAssignment_1 ) ) ;
    public final void rule__Position__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1789:1: ( ( ( rule__Position__NameAssignment_1 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1790:1: ( ( rule__Position__NameAssignment_1 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1790:1: ( ( rule__Position__NameAssignment_1 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1791:1: ( rule__Position__NameAssignment_1 )
            {
             before(grammarAccess.getPositionAccess().getNameAssignment_1()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1792:1: ( rule__Position__NameAssignment_1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1792:2: rule__Position__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Position__NameAssignment_1_in_rule__Position__Group__1__Impl3687);
            rule__Position__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getPositionAccess().getNameAssignment_1()); 

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
    // $ANTLR end rule__Position__Group__1__Impl


    // $ANTLR start rule__Position__Group__2
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1802:1: rule__Position__Group__2 : rule__Position__Group__2__Impl ;
    public final void rule__Position__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1806:1: ( rule__Position__Group__2__Impl )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1807:2: rule__Position__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Position__Group__2__Impl_in_rule__Position__Group__23717);
            rule__Position__Group__2__Impl();
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
    // $ANTLR end rule__Position__Group__2


    // $ANTLR start rule__Position__Group__2__Impl
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1813:1: rule__Position__Group__2__Impl : ( ( rule__Position__Group_2__0 )? ) ;
    public final void rule__Position__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1817:1: ( ( ( rule__Position__Group_2__0 )? ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1818:1: ( ( rule__Position__Group_2__0 )? )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1818:1: ( ( rule__Position__Group_2__0 )? )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1819:1: ( rule__Position__Group_2__0 )?
            {
             before(grammarAccess.getPositionAccess().getGroup_2()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1820:1: ( rule__Position__Group_2__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==14) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1820:2: rule__Position__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Position__Group_2__0_in_rule__Position__Group__2__Impl3744);
                    rule__Position__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPositionAccess().getGroup_2()); 

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
    // $ANTLR end rule__Position__Group__2__Impl


    // $ANTLR start rule__Position__Group_2__0
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1836:1: rule__Position__Group_2__0 : rule__Position__Group_2__0__Impl rule__Position__Group_2__1 ;
    public final void rule__Position__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1840:1: ( rule__Position__Group_2__0__Impl rule__Position__Group_2__1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1841:2: rule__Position__Group_2__0__Impl rule__Position__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Position__Group_2__0__Impl_in_rule__Position__Group_2__03781);
            rule__Position__Group_2__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Position__Group_2__1_in_rule__Position__Group_2__03784);
            rule__Position__Group_2__1();
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
    // $ANTLR end rule__Position__Group_2__0


    // $ANTLR start rule__Position__Group_2__0__Impl
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1848:1: rule__Position__Group_2__0__Impl : ( '{' ) ;
    public final void rule__Position__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1852:1: ( ( '{' ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1853:1: ( '{' )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1853:1: ( '{' )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1854:1: '{'
            {
             before(grammarAccess.getPositionAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Position__Group_2__0__Impl3812); 
             after(grammarAccess.getPositionAccess().getLeftCurlyBracketKeyword_2_0()); 

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
    // $ANTLR end rule__Position__Group_2__0__Impl


    // $ANTLR start rule__Position__Group_2__1
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1867:1: rule__Position__Group_2__1 : rule__Position__Group_2__1__Impl rule__Position__Group_2__2 ;
    public final void rule__Position__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1871:1: ( rule__Position__Group_2__1__Impl rule__Position__Group_2__2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1872:2: rule__Position__Group_2__1__Impl rule__Position__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Position__Group_2__1__Impl_in_rule__Position__Group_2__13843);
            rule__Position__Group_2__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Position__Group_2__2_in_rule__Position__Group_2__13846);
            rule__Position__Group_2__2();
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
    // $ANTLR end rule__Position__Group_2__1


    // $ANTLR start rule__Position__Group_2__1__Impl
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1879:1: rule__Position__Group_2__1__Impl : ( ( rule__Position__IntentionsAssignment_2_1 )* ) ;
    public final void rule__Position__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1883:1: ( ( ( rule__Position__IntentionsAssignment_2_1 )* ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1884:1: ( ( rule__Position__IntentionsAssignment_2_1 )* )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1884:1: ( ( rule__Position__IntentionsAssignment_2_1 )* )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1885:1: ( rule__Position__IntentionsAssignment_2_1 )*
            {
             before(grammarAccess.getPositionAccess().getIntentionsAssignment_2_1()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1886:1: ( rule__Position__IntentionsAssignment_2_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=19 && LA17_0<=23)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1886:2: rule__Position__IntentionsAssignment_2_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Position__IntentionsAssignment_2_1_in_rule__Position__Group_2__1__Impl3873);
            	    rule__Position__IntentionsAssignment_2_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getPositionAccess().getIntentionsAssignment_2_1()); 

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
    // $ANTLR end rule__Position__Group_2__1__Impl


    // $ANTLR start rule__Position__Group_2__2
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1896:1: rule__Position__Group_2__2 : rule__Position__Group_2__2__Impl ;
    public final void rule__Position__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1900:1: ( rule__Position__Group_2__2__Impl )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1901:2: rule__Position__Group_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Position__Group_2__2__Impl_in_rule__Position__Group_2__23904);
            rule__Position__Group_2__2__Impl();
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
    // $ANTLR end rule__Position__Group_2__2


    // $ANTLR start rule__Position__Group_2__2__Impl
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1907:1: rule__Position__Group_2__2__Impl : ( '}' ) ;
    public final void rule__Position__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1911:1: ( ( '}' ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1912:1: ( '}' )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1912:1: ( '}' )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1913:1: '}'
            {
             before(grammarAccess.getPositionAccess().getRightCurlyBracketKeyword_2_2()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Position__Group_2__2__Impl3932); 
             after(grammarAccess.getPositionAccess().getRightCurlyBracketKeyword_2_2()); 

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
    // $ANTLR end rule__Position__Group_2__2__Impl


    // $ANTLR start rule__Goal__Group__0
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1932:1: rule__Goal__Group__0 : rule__Goal__Group__0__Impl rule__Goal__Group__1 ;
    public final void rule__Goal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1936:1: ( rule__Goal__Group__0__Impl rule__Goal__Group__1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1937:2: rule__Goal__Group__0__Impl rule__Goal__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Goal__Group__0__Impl_in_rule__Goal__Group__03969);
            rule__Goal__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Goal__Group__1_in_rule__Goal__Group__03972);
            rule__Goal__Group__1();
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
    // $ANTLR end rule__Goal__Group__0


    // $ANTLR start rule__Goal__Group__0__Impl
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1944:1: rule__Goal__Group__0__Impl : ( 'goal' ) ;
    public final void rule__Goal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1948:1: ( ( 'goal' ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1949:1: ( 'goal' )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1949:1: ( 'goal' )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1950:1: 'goal'
            {
             before(grammarAccess.getGoalAccess().getGoalKeyword_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Goal__Group__0__Impl4000); 
             after(grammarAccess.getGoalAccess().getGoalKeyword_0()); 

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
    // $ANTLR end rule__Goal__Group__0__Impl


    // $ANTLR start rule__Goal__Group__1
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1963:1: rule__Goal__Group__1 : rule__Goal__Group__1__Impl rule__Goal__Group__2 ;
    public final void rule__Goal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1967:1: ( rule__Goal__Group__1__Impl rule__Goal__Group__2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1968:2: rule__Goal__Group__1__Impl rule__Goal__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Goal__Group__1__Impl_in_rule__Goal__Group__14031);
            rule__Goal__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Goal__Group__2_in_rule__Goal__Group__14034);
            rule__Goal__Group__2();
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
    // $ANTLR end rule__Goal__Group__1


    // $ANTLR start rule__Goal__Group__1__Impl
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1975:1: rule__Goal__Group__1__Impl : ( ( rule__Goal__NameAssignment_1 ) ) ;
    public final void rule__Goal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1979:1: ( ( ( rule__Goal__NameAssignment_1 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1980:1: ( ( rule__Goal__NameAssignment_1 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1980:1: ( ( rule__Goal__NameAssignment_1 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1981:1: ( rule__Goal__NameAssignment_1 )
            {
             before(grammarAccess.getGoalAccess().getNameAssignment_1()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1982:1: ( rule__Goal__NameAssignment_1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1982:2: rule__Goal__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Goal__NameAssignment_1_in_rule__Goal__Group__1__Impl4061);
            rule__Goal__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getGoalAccess().getNameAssignment_1()); 

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
    // $ANTLR end rule__Goal__Group__1__Impl


    // $ANTLR start rule__Goal__Group__2
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1992:1: rule__Goal__Group__2 : rule__Goal__Group__2__Impl ;
    public final void rule__Goal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1996:1: ( rule__Goal__Group__2__Impl )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1997:2: rule__Goal__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Goal__Group__2__Impl_in_rule__Goal__Group__24091);
            rule__Goal__Group__2__Impl();
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
    // $ANTLR end rule__Goal__Group__2


    // $ANTLR start rule__Goal__Group__2__Impl
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2003:1: rule__Goal__Group__2__Impl : ( ( rule__Goal__Group_2__0 )? ) ;
    public final void rule__Goal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2007:1: ( ( ( rule__Goal__Group_2__0 )? ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2008:1: ( ( rule__Goal__Group_2__0 )? )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2008:1: ( ( rule__Goal__Group_2__0 )? )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2009:1: ( rule__Goal__Group_2__0 )?
            {
             before(grammarAccess.getGoalAccess().getGroup_2()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2010:1: ( rule__Goal__Group_2__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==14) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2010:2: rule__Goal__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Goal__Group_2__0_in_rule__Goal__Group__2__Impl4118);
                    rule__Goal__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGoalAccess().getGroup_2()); 

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
    // $ANTLR end rule__Goal__Group__2__Impl


    // $ANTLR start rule__Goal__Group_2__0
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2026:1: rule__Goal__Group_2__0 : rule__Goal__Group_2__0__Impl rule__Goal__Group_2__1 ;
    public final void rule__Goal__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2030:1: ( rule__Goal__Group_2__0__Impl rule__Goal__Group_2__1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2031:2: rule__Goal__Group_2__0__Impl rule__Goal__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Goal__Group_2__0__Impl_in_rule__Goal__Group_2__04155);
            rule__Goal__Group_2__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Goal__Group_2__1_in_rule__Goal__Group_2__04158);
            rule__Goal__Group_2__1();
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
    // $ANTLR end rule__Goal__Group_2__0


    // $ANTLR start rule__Goal__Group_2__0__Impl
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2038:1: rule__Goal__Group_2__0__Impl : ( '{' ) ;
    public final void rule__Goal__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2042:1: ( ( '{' ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2043:1: ( '{' )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2043:1: ( '{' )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2044:1: '{'
            {
             before(grammarAccess.getGoalAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Goal__Group_2__0__Impl4186); 
             after(grammarAccess.getGoalAccess().getLeftCurlyBracketKeyword_2_0()); 

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
    // $ANTLR end rule__Goal__Group_2__0__Impl


    // $ANTLR start rule__Goal__Group_2__1
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2057:1: rule__Goal__Group_2__1 : rule__Goal__Group_2__1__Impl rule__Goal__Group_2__2 ;
    public final void rule__Goal__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2061:1: ( rule__Goal__Group_2__1__Impl rule__Goal__Group_2__2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2062:2: rule__Goal__Group_2__1__Impl rule__Goal__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Goal__Group_2__1__Impl_in_rule__Goal__Group_2__14217);
            rule__Goal__Group_2__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Goal__Group_2__2_in_rule__Goal__Group_2__14220);
            rule__Goal__Group_2__2();
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
    // $ANTLR end rule__Goal__Group_2__1


    // $ANTLR start rule__Goal__Group_2__1__Impl
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2069:1: rule__Goal__Group_2__1__Impl : ( ( rule__Goal__DecompositionsAssignment_2_1 )* ) ;
    public final void rule__Goal__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2073:1: ( ( ( rule__Goal__DecompositionsAssignment_2_1 )* ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2074:1: ( ( rule__Goal__DecompositionsAssignment_2_1 )* )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2074:1: ( ( rule__Goal__DecompositionsAssignment_2_1 )* )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2075:1: ( rule__Goal__DecompositionsAssignment_2_1 )*
            {
             before(grammarAccess.getGoalAccess().getDecompositionsAssignment_2_1()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2076:1: ( rule__Goal__DecompositionsAssignment_2_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2076:2: rule__Goal__DecompositionsAssignment_2_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Goal__DecompositionsAssignment_2_1_in_rule__Goal__Group_2__1__Impl4247);
            	    rule__Goal__DecompositionsAssignment_2_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getGoalAccess().getDecompositionsAssignment_2_1()); 

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
    // $ANTLR end rule__Goal__Group_2__1__Impl


    // $ANTLR start rule__Goal__Group_2__2
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2086:1: rule__Goal__Group_2__2 : rule__Goal__Group_2__2__Impl ;
    public final void rule__Goal__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2090:1: ( rule__Goal__Group_2__2__Impl )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2091:2: rule__Goal__Group_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Goal__Group_2__2__Impl_in_rule__Goal__Group_2__24278);
            rule__Goal__Group_2__2__Impl();
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
    // $ANTLR end rule__Goal__Group_2__2


    // $ANTLR start rule__Goal__Group_2__2__Impl
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2097:1: rule__Goal__Group_2__2__Impl : ( '}' ) ;
    public final void rule__Goal__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2101:1: ( ( '}' ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2102:1: ( '}' )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2102:1: ( '}' )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2103:1: '}'
            {
             before(grammarAccess.getGoalAccess().getRightCurlyBracketKeyword_2_2()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Goal__Group_2__2__Impl4306); 
             after(grammarAccess.getGoalAccess().getRightCurlyBracketKeyword_2_2()); 

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
    // $ANTLR end rule__Goal__Group_2__2__Impl


    // $ANTLR start rule__Softgoal__Group__0
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2122:1: rule__Softgoal__Group__0 : rule__Softgoal__Group__0__Impl rule__Softgoal__Group__1 ;
    public final void rule__Softgoal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2126:1: ( rule__Softgoal__Group__0__Impl rule__Softgoal__Group__1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2127:2: rule__Softgoal__Group__0__Impl rule__Softgoal__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Softgoal__Group__0__Impl_in_rule__Softgoal__Group__04343);
            rule__Softgoal__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Softgoal__Group__1_in_rule__Softgoal__Group__04346);
            rule__Softgoal__Group__1();
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
    // $ANTLR end rule__Softgoal__Group__0


    // $ANTLR start rule__Softgoal__Group__0__Impl
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2134:1: rule__Softgoal__Group__0__Impl : ( 'soft' ) ;
    public final void rule__Softgoal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2138:1: ( ( 'soft' ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2139:1: ( 'soft' )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2139:1: ( 'soft' )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2140:1: 'soft'
            {
             before(grammarAccess.getSoftgoalAccess().getSoftKeyword_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Softgoal__Group__0__Impl4374); 
             after(grammarAccess.getSoftgoalAccess().getSoftKeyword_0()); 

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
    // $ANTLR end rule__Softgoal__Group__0__Impl


    // $ANTLR start rule__Softgoal__Group__1
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2153:1: rule__Softgoal__Group__1 : rule__Softgoal__Group__1__Impl ;
    public final void rule__Softgoal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2157:1: ( rule__Softgoal__Group__1__Impl )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2158:2: rule__Softgoal__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Softgoal__Group__1__Impl_in_rule__Softgoal__Group__14405);
            rule__Softgoal__Group__1__Impl();
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
    // $ANTLR end rule__Softgoal__Group__1


    // $ANTLR start rule__Softgoal__Group__1__Impl
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2164:1: rule__Softgoal__Group__1__Impl : ( ( rule__Softgoal__NameAssignment_1 ) ) ;
    public final void rule__Softgoal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2168:1: ( ( ( rule__Softgoal__NameAssignment_1 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2169:1: ( ( rule__Softgoal__NameAssignment_1 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2169:1: ( ( rule__Softgoal__NameAssignment_1 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2170:1: ( rule__Softgoal__NameAssignment_1 )
            {
             before(grammarAccess.getSoftgoalAccess().getNameAssignment_1()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2171:1: ( rule__Softgoal__NameAssignment_1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2171:2: rule__Softgoal__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Softgoal__NameAssignment_1_in_rule__Softgoal__Group__1__Impl4432);
            rule__Softgoal__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getSoftgoalAccess().getNameAssignment_1()); 

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
    // $ANTLR end rule__Softgoal__Group__1__Impl


    // $ANTLR start rule__Task__Group__0
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2185:1: rule__Task__Group__0 : rule__Task__Group__0__Impl rule__Task__Group__1 ;
    public final void rule__Task__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2189:1: ( rule__Task__Group__0__Impl rule__Task__Group__1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2190:2: rule__Task__Group__0__Impl rule__Task__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Task__Group__0__Impl_in_rule__Task__Group__04466);
            rule__Task__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Task__Group__1_in_rule__Task__Group__04469);
            rule__Task__Group__1();
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
    // $ANTLR end rule__Task__Group__0


    // $ANTLR start rule__Task__Group__0__Impl
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2197:1: rule__Task__Group__0__Impl : ( 'task' ) ;
    public final void rule__Task__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2201:1: ( ( 'task' ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2202:1: ( 'task' )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2202:1: ( 'task' )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2203:1: 'task'
            {
             before(grammarAccess.getTaskAccess().getTaskKeyword_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Task__Group__0__Impl4497); 
             after(grammarAccess.getTaskAccess().getTaskKeyword_0()); 

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
    // $ANTLR end rule__Task__Group__0__Impl


    // $ANTLR start rule__Task__Group__1
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2216:1: rule__Task__Group__1 : rule__Task__Group__1__Impl ;
    public final void rule__Task__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2220:1: ( rule__Task__Group__1__Impl )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2221:2: rule__Task__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Task__Group__1__Impl_in_rule__Task__Group__14528);
            rule__Task__Group__1__Impl();
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
    // $ANTLR end rule__Task__Group__1


    // $ANTLR start rule__Task__Group__1__Impl
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2227:1: rule__Task__Group__1__Impl : ( ( rule__Task__NameAssignment_1 ) ) ;
    public final void rule__Task__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2231:1: ( ( ( rule__Task__NameAssignment_1 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2232:1: ( ( rule__Task__NameAssignment_1 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2232:1: ( ( rule__Task__NameAssignment_1 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2233:1: ( rule__Task__NameAssignment_1 )
            {
             before(grammarAccess.getTaskAccess().getNameAssignment_1()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2234:1: ( rule__Task__NameAssignment_1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2234:2: rule__Task__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Task__NameAssignment_1_in_rule__Task__Group__1__Impl4555);
            rule__Task__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getTaskAccess().getNameAssignment_1()); 

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
    // $ANTLR end rule__Task__Group__1__Impl


    // $ANTLR start rule__Resource__Group__0
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2248:1: rule__Resource__Group__0 : rule__Resource__Group__0__Impl rule__Resource__Group__1 ;
    public final void rule__Resource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2252:1: ( rule__Resource__Group__0__Impl rule__Resource__Group__1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2253:2: rule__Resource__Group__0__Impl rule__Resource__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Resource__Group__0__Impl_in_rule__Resource__Group__04589);
            rule__Resource__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Resource__Group__1_in_rule__Resource__Group__04592);
            rule__Resource__Group__1();
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
    // $ANTLR end rule__Resource__Group__0


    // $ANTLR start rule__Resource__Group__0__Impl
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2260:1: rule__Resource__Group__0__Impl : ( 'resource' ) ;
    public final void rule__Resource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2264:1: ( ( 'resource' ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2265:1: ( 'resource' )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2265:1: ( 'resource' )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2266:1: 'resource'
            {
             before(grammarAccess.getResourceAccess().getResourceKeyword_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Resource__Group__0__Impl4620); 
             after(grammarAccess.getResourceAccess().getResourceKeyword_0()); 

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
    // $ANTLR end rule__Resource__Group__0__Impl


    // $ANTLR start rule__Resource__Group__1
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2279:1: rule__Resource__Group__1 : rule__Resource__Group__1__Impl ;
    public final void rule__Resource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2283:1: ( rule__Resource__Group__1__Impl )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2284:2: rule__Resource__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Resource__Group__1__Impl_in_rule__Resource__Group__14651);
            rule__Resource__Group__1__Impl();
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
    // $ANTLR end rule__Resource__Group__1


    // $ANTLR start rule__Resource__Group__1__Impl
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2290:1: rule__Resource__Group__1__Impl : ( ( rule__Resource__NameAssignment_1 ) ) ;
    public final void rule__Resource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2294:1: ( ( ( rule__Resource__NameAssignment_1 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2295:1: ( ( rule__Resource__NameAssignment_1 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2295:1: ( ( rule__Resource__NameAssignment_1 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2296:1: ( rule__Resource__NameAssignment_1 )
            {
             before(grammarAccess.getResourceAccess().getNameAssignment_1()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2297:1: ( rule__Resource__NameAssignment_1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2297:2: rule__Resource__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Resource__NameAssignment_1_in_rule__Resource__Group__1__Impl4678);
            rule__Resource__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getResourceAccess().getNameAssignment_1()); 

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
    // $ANTLR end rule__Resource__Group__1__Impl


    // $ANTLR start rule__Belief__Group__0
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2311:1: rule__Belief__Group__0 : rule__Belief__Group__0__Impl rule__Belief__Group__1 ;
    public final void rule__Belief__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2315:1: ( rule__Belief__Group__0__Impl rule__Belief__Group__1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2316:2: rule__Belief__Group__0__Impl rule__Belief__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Belief__Group__0__Impl_in_rule__Belief__Group__04712);
            rule__Belief__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Belief__Group__1_in_rule__Belief__Group__04715);
            rule__Belief__Group__1();
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
    // $ANTLR end rule__Belief__Group__0


    // $ANTLR start rule__Belief__Group__0__Impl
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2323:1: rule__Belief__Group__0__Impl : ( 'belief' ) ;
    public final void rule__Belief__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2327:1: ( ( 'belief' ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2328:1: ( 'belief' )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2328:1: ( 'belief' )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2329:1: 'belief'
            {
             before(grammarAccess.getBeliefAccess().getBeliefKeyword_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Belief__Group__0__Impl4743); 
             after(grammarAccess.getBeliefAccess().getBeliefKeyword_0()); 

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
    // $ANTLR end rule__Belief__Group__0__Impl


    // $ANTLR start rule__Belief__Group__1
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2342:1: rule__Belief__Group__1 : rule__Belief__Group__1__Impl ;
    public final void rule__Belief__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2346:1: ( rule__Belief__Group__1__Impl )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2347:2: rule__Belief__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Belief__Group__1__Impl_in_rule__Belief__Group__14774);
            rule__Belief__Group__1__Impl();
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
    // $ANTLR end rule__Belief__Group__1


    // $ANTLR start rule__Belief__Group__1__Impl
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2353:1: rule__Belief__Group__1__Impl : ( ( rule__Belief__NameAssignment_1 ) ) ;
    public final void rule__Belief__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2357:1: ( ( ( rule__Belief__NameAssignment_1 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2358:1: ( ( rule__Belief__NameAssignment_1 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2358:1: ( ( rule__Belief__NameAssignment_1 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2359:1: ( rule__Belief__NameAssignment_1 )
            {
             before(grammarAccess.getBeliefAccess().getNameAssignment_1()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2360:1: ( rule__Belief__NameAssignment_1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2360:2: rule__Belief__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Belief__NameAssignment_1_in_rule__Belief__Group__1__Impl4801);
            rule__Belief__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getBeliefAccess().getNameAssignment_1()); 

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
    // $ANTLR end rule__Belief__Group__1__Impl


    // $ANTLR start rule__Association__Group__0
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2374:1: rule__Association__Group__0 : rule__Association__Group__0__Impl rule__Association__Group__1 ;
    public final void rule__Association__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2378:1: ( rule__Association__Group__0__Impl rule__Association__Group__1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2379:2: rule__Association__Group__0__Impl rule__Association__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Association__Group__0__Impl_in_rule__Association__Group__04835);
            rule__Association__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Association__Group__1_in_rule__Association__Group__04838);
            rule__Association__Group__1();
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
    // $ANTLR end rule__Association__Group__0


    // $ANTLR start rule__Association__Group__0__Impl
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2386:1: rule__Association__Group__0__Impl : ( ( rule__Association__SourceAssignment_0 ) ) ;
    public final void rule__Association__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2390:1: ( ( ( rule__Association__SourceAssignment_0 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2391:1: ( ( rule__Association__SourceAssignment_0 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2391:1: ( ( rule__Association__SourceAssignment_0 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2392:1: ( rule__Association__SourceAssignment_0 )
            {
             before(grammarAccess.getAssociationAccess().getSourceAssignment_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2393:1: ( rule__Association__SourceAssignment_0 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2393:2: rule__Association__SourceAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Association__SourceAssignment_0_in_rule__Association__Group__0__Impl4865);
            rule__Association__SourceAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getAssociationAccess().getSourceAssignment_0()); 

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
    // $ANTLR end rule__Association__Group__0__Impl


    // $ANTLR start rule__Association__Group__1
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2403:1: rule__Association__Group__1 : rule__Association__Group__1__Impl rule__Association__Group__2 ;
    public final void rule__Association__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2407:1: ( rule__Association__Group__1__Impl rule__Association__Group__2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2408:2: rule__Association__Group__1__Impl rule__Association__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Association__Group__1__Impl_in_rule__Association__Group__14895);
            rule__Association__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Association__Group__2_in_rule__Association__Group__14898);
            rule__Association__Group__2();
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
    // $ANTLR end rule__Association__Group__1


    // $ANTLR start rule__Association__Group__1__Impl
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2415:1: rule__Association__Group__1__Impl : ( '~~>' ) ;
    public final void rule__Association__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2419:1: ( ( '~~>' ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2420:1: ( '~~>' )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2420:1: ( '~~>' )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2421:1: '~~>'
            {
             before(grammarAccess.getAssociationAccess().getTildeTildeGreaterThanSignKeyword_1()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Association__Group__1__Impl4926); 
             after(grammarAccess.getAssociationAccess().getTildeTildeGreaterThanSignKeyword_1()); 

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
    // $ANTLR end rule__Association__Group__1__Impl


    // $ANTLR start rule__Association__Group__2
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2434:1: rule__Association__Group__2 : rule__Association__Group__2__Impl ;
    public final void rule__Association__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2438:1: ( rule__Association__Group__2__Impl )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2439:2: rule__Association__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Association__Group__2__Impl_in_rule__Association__Group__24957);
            rule__Association__Group__2__Impl();
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
    // $ANTLR end rule__Association__Group__2


    // $ANTLR start rule__Association__Group__2__Impl
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2445:1: rule__Association__Group__2__Impl : ( ( rule__Association__TargetAssignment_2 ) ) ;
    public final void rule__Association__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2449:1: ( ( ( rule__Association__TargetAssignment_2 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2450:1: ( ( rule__Association__TargetAssignment_2 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2450:1: ( ( rule__Association__TargetAssignment_2 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2451:1: ( rule__Association__TargetAssignment_2 )
            {
             before(grammarAccess.getAssociationAccess().getTargetAssignment_2()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2452:1: ( rule__Association__TargetAssignment_2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2452:2: rule__Association__TargetAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Association__TargetAssignment_2_in_rule__Association__Group__2__Impl4984);
            rule__Association__TargetAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getAssociationAccess().getTargetAssignment_2()); 

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
    // $ANTLR end rule__Association__Group__2__Impl


    // $ANTLR start rule__Dependency__Group__0
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2468:1: rule__Dependency__Group__0 : rule__Dependency__Group__0__Impl rule__Dependency__Group__1 ;
    public final void rule__Dependency__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2472:1: ( rule__Dependency__Group__0__Impl rule__Dependency__Group__1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2473:2: rule__Dependency__Group__0__Impl rule__Dependency__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Dependency__Group__0__Impl_in_rule__Dependency__Group__05020);
            rule__Dependency__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Dependency__Group__1_in_rule__Dependency__Group__05023);
            rule__Dependency__Group__1();
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
    // $ANTLR end rule__Dependency__Group__0


    // $ANTLR start rule__Dependency__Group__0__Impl
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2480:1: rule__Dependency__Group__0__Impl : ( ( rule__Dependency__DependencyFromAssignment_0 ) ) ;
    public final void rule__Dependency__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2484:1: ( ( ( rule__Dependency__DependencyFromAssignment_0 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2485:1: ( ( rule__Dependency__DependencyFromAssignment_0 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2485:1: ( ( rule__Dependency__DependencyFromAssignment_0 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2486:1: ( rule__Dependency__DependencyFromAssignment_0 )
            {
             before(grammarAccess.getDependencyAccess().getDependencyFromAssignment_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2487:1: ( rule__Dependency__DependencyFromAssignment_0 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2487:2: rule__Dependency__DependencyFromAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Dependency__DependencyFromAssignment_0_in_rule__Dependency__Group__0__Impl5050);
            rule__Dependency__DependencyFromAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getDependencyAccess().getDependencyFromAssignment_0()); 

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
    // $ANTLR end rule__Dependency__Group__0__Impl


    // $ANTLR start rule__Dependency__Group__1
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2497:1: rule__Dependency__Group__1 : rule__Dependency__Group__1__Impl rule__Dependency__Group__2 ;
    public final void rule__Dependency__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2501:1: ( rule__Dependency__Group__1__Impl rule__Dependency__Group__2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2502:2: rule__Dependency__Group__1__Impl rule__Dependency__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Dependency__Group__1__Impl_in_rule__Dependency__Group__15080);
            rule__Dependency__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Dependency__Group__2_in_rule__Dependency__Group__15083);
            rule__Dependency__Group__2();
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
    // $ANTLR end rule__Dependency__Group__1


    // $ANTLR start rule__Dependency__Group__1__Impl
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2509:1: rule__Dependency__Group__1__Impl : ( '~>' ) ;
    public final void rule__Dependency__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2513:1: ( ( '~>' ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2514:1: ( '~>' )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2514:1: ( '~>' )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2515:1: '~>'
            {
             before(grammarAccess.getDependencyAccess().getTildeGreaterThanSignKeyword_1()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Dependency__Group__1__Impl5111); 
             after(grammarAccess.getDependencyAccess().getTildeGreaterThanSignKeyword_1()); 

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
    // $ANTLR end rule__Dependency__Group__1__Impl


    // $ANTLR start rule__Dependency__Group__2
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2528:1: rule__Dependency__Group__2 : rule__Dependency__Group__2__Impl ;
    public final void rule__Dependency__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2532:1: ( rule__Dependency__Group__2__Impl )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2533:2: rule__Dependency__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Dependency__Group__2__Impl_in_rule__Dependency__Group__25142);
            rule__Dependency__Group__2__Impl();
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
    // $ANTLR end rule__Dependency__Group__2


    // $ANTLR start rule__Dependency__Group__2__Impl
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2539:1: rule__Dependency__Group__2__Impl : ( ( rule__Dependency__DependencyToAssignment_2 ) ) ;
    public final void rule__Dependency__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2543:1: ( ( ( rule__Dependency__DependencyToAssignment_2 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2544:1: ( ( rule__Dependency__DependencyToAssignment_2 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2544:1: ( ( rule__Dependency__DependencyToAssignment_2 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2545:1: ( rule__Dependency__DependencyToAssignment_2 )
            {
             before(grammarAccess.getDependencyAccess().getDependencyToAssignment_2()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2546:1: ( rule__Dependency__DependencyToAssignment_2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2546:2: rule__Dependency__DependencyToAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Dependency__DependencyToAssignment_2_in_rule__Dependency__Group__2__Impl5169);
            rule__Dependency__DependencyToAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getDependencyAccess().getDependencyToAssignment_2()); 

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
    // $ANTLR end rule__Dependency__Group__2__Impl


    // $ANTLR start rule__AndDecomposition__Group__0
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2562:1: rule__AndDecomposition__Group__0 : rule__AndDecomposition__Group__0__Impl rule__AndDecomposition__Group__1 ;
    public final void rule__AndDecomposition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2566:1: ( rule__AndDecomposition__Group__0__Impl rule__AndDecomposition__Group__1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2567:2: rule__AndDecomposition__Group__0__Impl rule__AndDecomposition__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndDecomposition__Group__0__Impl_in_rule__AndDecomposition__Group__05205);
            rule__AndDecomposition__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AndDecomposition__Group__1_in_rule__AndDecomposition__Group__05208);
            rule__AndDecomposition__Group__1();
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
    // $ANTLR end rule__AndDecomposition__Group__0


    // $ANTLR start rule__AndDecomposition__Group__0__Impl
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2574:1: rule__AndDecomposition__Group__0__Impl : ( ( rule__AndDecomposition__TargetAssignment_0 ) ) ;
    public final void rule__AndDecomposition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2578:1: ( ( ( rule__AndDecomposition__TargetAssignment_0 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2579:1: ( ( rule__AndDecomposition__TargetAssignment_0 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2579:1: ( ( rule__AndDecomposition__TargetAssignment_0 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2580:1: ( rule__AndDecomposition__TargetAssignment_0 )
            {
             before(grammarAccess.getAndDecompositionAccess().getTargetAssignment_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2581:1: ( rule__AndDecomposition__TargetAssignment_0 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2581:2: rule__AndDecomposition__TargetAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndDecomposition__TargetAssignment_0_in_rule__AndDecomposition__Group__0__Impl5235);
            rule__AndDecomposition__TargetAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getAndDecompositionAccess().getTargetAssignment_0()); 

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
    // $ANTLR end rule__AndDecomposition__Group__0__Impl


    // $ANTLR start rule__AndDecomposition__Group__1
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2591:1: rule__AndDecomposition__Group__1 : rule__AndDecomposition__Group__1__Impl rule__AndDecomposition__Group__2 ;
    public final void rule__AndDecomposition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2595:1: ( rule__AndDecomposition__Group__1__Impl rule__AndDecomposition__Group__2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2596:2: rule__AndDecomposition__Group__1__Impl rule__AndDecomposition__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndDecomposition__Group__1__Impl_in_rule__AndDecomposition__Group__15265);
            rule__AndDecomposition__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AndDecomposition__Group__2_in_rule__AndDecomposition__Group__15268);
            rule__AndDecomposition__Group__2();
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
    // $ANTLR end rule__AndDecomposition__Group__1


    // $ANTLR start rule__AndDecomposition__Group__1__Impl
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2603:1: rule__AndDecomposition__Group__1__Impl : ( '<-(and)-' ) ;
    public final void rule__AndDecomposition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2607:1: ( ( '<-(and)-' ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2608:1: ( '<-(and)-' )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2608:1: ( '<-(and)-' )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2609:1: '<-(and)-'
            {
             before(grammarAccess.getAndDecompositionAccess().getAndKeyword_1()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__AndDecomposition__Group__1__Impl5296); 
             after(grammarAccess.getAndDecompositionAccess().getAndKeyword_1()); 

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
    // $ANTLR end rule__AndDecomposition__Group__1__Impl


    // $ANTLR start rule__AndDecomposition__Group__2
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2622:1: rule__AndDecomposition__Group__2 : rule__AndDecomposition__Group__2__Impl ;
    public final void rule__AndDecomposition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2626:1: ( rule__AndDecomposition__Group__2__Impl )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2627:2: rule__AndDecomposition__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndDecomposition__Group__2__Impl_in_rule__AndDecomposition__Group__25327);
            rule__AndDecomposition__Group__2__Impl();
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
    // $ANTLR end rule__AndDecomposition__Group__2


    // $ANTLR start rule__AndDecomposition__Group__2__Impl
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2633:1: rule__AndDecomposition__Group__2__Impl : ( ( rule__AndDecomposition__SourceAssignment_2 ) ) ;
    public final void rule__AndDecomposition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2637:1: ( ( ( rule__AndDecomposition__SourceAssignment_2 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2638:1: ( ( rule__AndDecomposition__SourceAssignment_2 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2638:1: ( ( rule__AndDecomposition__SourceAssignment_2 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2639:1: ( rule__AndDecomposition__SourceAssignment_2 )
            {
             before(grammarAccess.getAndDecompositionAccess().getSourceAssignment_2()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2640:1: ( rule__AndDecomposition__SourceAssignment_2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2640:2: rule__AndDecomposition__SourceAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndDecomposition__SourceAssignment_2_in_rule__AndDecomposition__Group__2__Impl5354);
            rule__AndDecomposition__SourceAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getAndDecompositionAccess().getSourceAssignment_2()); 

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
    // $ANTLR end rule__AndDecomposition__Group__2__Impl


    // $ANTLR start rule__OrDecomposition__Group__0
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2656:1: rule__OrDecomposition__Group__0 : rule__OrDecomposition__Group__0__Impl rule__OrDecomposition__Group__1 ;
    public final void rule__OrDecomposition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2660:1: ( rule__OrDecomposition__Group__0__Impl rule__OrDecomposition__Group__1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2661:2: rule__OrDecomposition__Group__0__Impl rule__OrDecomposition__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrDecomposition__Group__0__Impl_in_rule__OrDecomposition__Group__05390);
            rule__OrDecomposition__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrDecomposition__Group__1_in_rule__OrDecomposition__Group__05393);
            rule__OrDecomposition__Group__1();
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
    // $ANTLR end rule__OrDecomposition__Group__0


    // $ANTLR start rule__OrDecomposition__Group__0__Impl
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2668:1: rule__OrDecomposition__Group__0__Impl : ( ( rule__OrDecomposition__TargetAssignment_0 ) ) ;
    public final void rule__OrDecomposition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2672:1: ( ( ( rule__OrDecomposition__TargetAssignment_0 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2673:1: ( ( rule__OrDecomposition__TargetAssignment_0 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2673:1: ( ( rule__OrDecomposition__TargetAssignment_0 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2674:1: ( rule__OrDecomposition__TargetAssignment_0 )
            {
             before(grammarAccess.getOrDecompositionAccess().getTargetAssignment_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2675:1: ( rule__OrDecomposition__TargetAssignment_0 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2675:2: rule__OrDecomposition__TargetAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrDecomposition__TargetAssignment_0_in_rule__OrDecomposition__Group__0__Impl5420);
            rule__OrDecomposition__TargetAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getOrDecompositionAccess().getTargetAssignment_0()); 

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
    // $ANTLR end rule__OrDecomposition__Group__0__Impl


    // $ANTLR start rule__OrDecomposition__Group__1
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2685:1: rule__OrDecomposition__Group__1 : rule__OrDecomposition__Group__1__Impl rule__OrDecomposition__Group__2 ;
    public final void rule__OrDecomposition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2689:1: ( rule__OrDecomposition__Group__1__Impl rule__OrDecomposition__Group__2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2690:2: rule__OrDecomposition__Group__1__Impl rule__OrDecomposition__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrDecomposition__Group__1__Impl_in_rule__OrDecomposition__Group__15450);
            rule__OrDecomposition__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrDecomposition__Group__2_in_rule__OrDecomposition__Group__15453);
            rule__OrDecomposition__Group__2();
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
    // $ANTLR end rule__OrDecomposition__Group__1


    // $ANTLR start rule__OrDecomposition__Group__1__Impl
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2697:1: rule__OrDecomposition__Group__1__Impl : ( '<-(or)-' ) ;
    public final void rule__OrDecomposition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2701:1: ( ( '<-(or)-' ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2702:1: ( '<-(or)-' )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2702:1: ( '<-(or)-' )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2703:1: '<-(or)-'
            {
             before(grammarAccess.getOrDecompositionAccess().getOrKeyword_1()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__OrDecomposition__Group__1__Impl5481); 
             after(grammarAccess.getOrDecompositionAccess().getOrKeyword_1()); 

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
    // $ANTLR end rule__OrDecomposition__Group__1__Impl


    // $ANTLR start rule__OrDecomposition__Group__2
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2716:1: rule__OrDecomposition__Group__2 : rule__OrDecomposition__Group__2__Impl ;
    public final void rule__OrDecomposition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2720:1: ( rule__OrDecomposition__Group__2__Impl )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2721:2: rule__OrDecomposition__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrDecomposition__Group__2__Impl_in_rule__OrDecomposition__Group__25512);
            rule__OrDecomposition__Group__2__Impl();
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
    // $ANTLR end rule__OrDecomposition__Group__2


    // $ANTLR start rule__OrDecomposition__Group__2__Impl
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2727:1: rule__OrDecomposition__Group__2__Impl : ( ( rule__OrDecomposition__SourceAssignment_2 ) ) ;
    public final void rule__OrDecomposition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2731:1: ( ( ( rule__OrDecomposition__SourceAssignment_2 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2732:1: ( ( rule__OrDecomposition__SourceAssignment_2 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2732:1: ( ( rule__OrDecomposition__SourceAssignment_2 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2733:1: ( rule__OrDecomposition__SourceAssignment_2 )
            {
             before(grammarAccess.getOrDecompositionAccess().getSourceAssignment_2()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2734:1: ( rule__OrDecomposition__SourceAssignment_2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2734:2: rule__OrDecomposition__SourceAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrDecomposition__SourceAssignment_2_in_rule__OrDecomposition__Group__2__Impl5539);
            rule__OrDecomposition__SourceAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getOrDecompositionAccess().getSourceAssignment_2()); 

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
    // $ANTLR end rule__OrDecomposition__Group__2__Impl


    // $ANTLR start rule__AndContribution__Group__0
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2750:1: rule__AndContribution__Group__0 : rule__AndContribution__Group__0__Impl rule__AndContribution__Group__1 ;
    public final void rule__AndContribution__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2754:1: ( rule__AndContribution__Group__0__Impl rule__AndContribution__Group__1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2755:2: rule__AndContribution__Group__0__Impl rule__AndContribution__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndContribution__Group__0__Impl_in_rule__AndContribution__Group__05575);
            rule__AndContribution__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AndContribution__Group__1_in_rule__AndContribution__Group__05578);
            rule__AndContribution__Group__1();
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
    // $ANTLR end rule__AndContribution__Group__0


    // $ANTLR start rule__AndContribution__Group__0__Impl
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2762:1: rule__AndContribution__Group__0__Impl : ( ( rule__AndContribution__SourceAssignment_0 ) ) ;
    public final void rule__AndContribution__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2766:1: ( ( ( rule__AndContribution__SourceAssignment_0 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2767:1: ( ( rule__AndContribution__SourceAssignment_0 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2767:1: ( ( rule__AndContribution__SourceAssignment_0 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2768:1: ( rule__AndContribution__SourceAssignment_0 )
            {
             before(grammarAccess.getAndContributionAccess().getSourceAssignment_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2769:1: ( rule__AndContribution__SourceAssignment_0 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2769:2: rule__AndContribution__SourceAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndContribution__SourceAssignment_0_in_rule__AndContribution__Group__0__Impl5605);
            rule__AndContribution__SourceAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getAndContributionAccess().getSourceAssignment_0()); 

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
    // $ANTLR end rule__AndContribution__Group__0__Impl


    // $ANTLR start rule__AndContribution__Group__1
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2779:1: rule__AndContribution__Group__1 : rule__AndContribution__Group__1__Impl rule__AndContribution__Group__2 ;
    public final void rule__AndContribution__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2783:1: ( rule__AndContribution__Group__1__Impl rule__AndContribution__Group__2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2784:2: rule__AndContribution__Group__1__Impl rule__AndContribution__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndContribution__Group__1__Impl_in_rule__AndContribution__Group__15635);
            rule__AndContribution__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AndContribution__Group__2_in_rule__AndContribution__Group__15638);
            rule__AndContribution__Group__2();
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
    // $ANTLR end rule__AndContribution__Group__1


    // $ANTLR start rule__AndContribution__Group__1__Impl
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2791:1: rule__AndContribution__Group__1__Impl : ( '-(and)->' ) ;
    public final void rule__AndContribution__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2795:1: ( ( '-(and)->' ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2796:1: ( '-(and)->' )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2796:1: ( '-(and)->' )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2797:1: '-(and)->'
            {
             before(grammarAccess.getAndContributionAccess().getAndKeyword_1()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__AndContribution__Group__1__Impl5666); 
             after(grammarAccess.getAndContributionAccess().getAndKeyword_1()); 

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
    // $ANTLR end rule__AndContribution__Group__1__Impl


    // $ANTLR start rule__AndContribution__Group__2
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2810:1: rule__AndContribution__Group__2 : rule__AndContribution__Group__2__Impl ;
    public final void rule__AndContribution__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2814:1: ( rule__AndContribution__Group__2__Impl )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2815:2: rule__AndContribution__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndContribution__Group__2__Impl_in_rule__AndContribution__Group__25697);
            rule__AndContribution__Group__2__Impl();
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
    // $ANTLR end rule__AndContribution__Group__2


    // $ANTLR start rule__AndContribution__Group__2__Impl
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2821:1: rule__AndContribution__Group__2__Impl : ( ( rule__AndContribution__TargetAssignment_2 ) ) ;
    public final void rule__AndContribution__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2825:1: ( ( ( rule__AndContribution__TargetAssignment_2 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2826:1: ( ( rule__AndContribution__TargetAssignment_2 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2826:1: ( ( rule__AndContribution__TargetAssignment_2 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2827:1: ( rule__AndContribution__TargetAssignment_2 )
            {
             before(grammarAccess.getAndContributionAccess().getTargetAssignment_2()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2828:1: ( rule__AndContribution__TargetAssignment_2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2828:2: rule__AndContribution__TargetAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndContribution__TargetAssignment_2_in_rule__AndContribution__Group__2__Impl5724);
            rule__AndContribution__TargetAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getAndContributionAccess().getTargetAssignment_2()); 

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
    // $ANTLR end rule__AndContribution__Group__2__Impl


    // $ANTLR start rule__OrContribution__Group__0
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2844:1: rule__OrContribution__Group__0 : rule__OrContribution__Group__0__Impl rule__OrContribution__Group__1 ;
    public final void rule__OrContribution__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2848:1: ( rule__OrContribution__Group__0__Impl rule__OrContribution__Group__1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2849:2: rule__OrContribution__Group__0__Impl rule__OrContribution__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrContribution__Group__0__Impl_in_rule__OrContribution__Group__05760);
            rule__OrContribution__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrContribution__Group__1_in_rule__OrContribution__Group__05763);
            rule__OrContribution__Group__1();
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
    // $ANTLR end rule__OrContribution__Group__0


    // $ANTLR start rule__OrContribution__Group__0__Impl
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2856:1: rule__OrContribution__Group__0__Impl : ( ( rule__OrContribution__SourceAssignment_0 ) ) ;
    public final void rule__OrContribution__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2860:1: ( ( ( rule__OrContribution__SourceAssignment_0 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2861:1: ( ( rule__OrContribution__SourceAssignment_0 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2861:1: ( ( rule__OrContribution__SourceAssignment_0 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2862:1: ( rule__OrContribution__SourceAssignment_0 )
            {
             before(grammarAccess.getOrContributionAccess().getSourceAssignment_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2863:1: ( rule__OrContribution__SourceAssignment_0 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2863:2: rule__OrContribution__SourceAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrContribution__SourceAssignment_0_in_rule__OrContribution__Group__0__Impl5790);
            rule__OrContribution__SourceAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getOrContributionAccess().getSourceAssignment_0()); 

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
    // $ANTLR end rule__OrContribution__Group__0__Impl


    // $ANTLR start rule__OrContribution__Group__1
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2873:1: rule__OrContribution__Group__1 : rule__OrContribution__Group__1__Impl rule__OrContribution__Group__2 ;
    public final void rule__OrContribution__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2877:1: ( rule__OrContribution__Group__1__Impl rule__OrContribution__Group__2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2878:2: rule__OrContribution__Group__1__Impl rule__OrContribution__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrContribution__Group__1__Impl_in_rule__OrContribution__Group__15820);
            rule__OrContribution__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrContribution__Group__2_in_rule__OrContribution__Group__15823);
            rule__OrContribution__Group__2();
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
    // $ANTLR end rule__OrContribution__Group__1


    // $ANTLR start rule__OrContribution__Group__1__Impl
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2885:1: rule__OrContribution__Group__1__Impl : ( '-(or)->' ) ;
    public final void rule__OrContribution__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2889:1: ( ( '-(or)->' ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2890:1: ( '-(or)->' )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2890:1: ( '-(or)->' )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2891:1: '-(or)->'
            {
             before(grammarAccess.getOrContributionAccess().getOrKeyword_1()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__OrContribution__Group__1__Impl5851); 
             after(grammarAccess.getOrContributionAccess().getOrKeyword_1()); 

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
    // $ANTLR end rule__OrContribution__Group__1__Impl


    // $ANTLR start rule__OrContribution__Group__2
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2904:1: rule__OrContribution__Group__2 : rule__OrContribution__Group__2__Impl ;
    public final void rule__OrContribution__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2908:1: ( rule__OrContribution__Group__2__Impl )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2909:2: rule__OrContribution__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrContribution__Group__2__Impl_in_rule__OrContribution__Group__25882);
            rule__OrContribution__Group__2__Impl();
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
    // $ANTLR end rule__OrContribution__Group__2


    // $ANTLR start rule__OrContribution__Group__2__Impl
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2915:1: rule__OrContribution__Group__2__Impl : ( ( rule__OrContribution__TargetAssignment_2 ) ) ;
    public final void rule__OrContribution__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2919:1: ( ( ( rule__OrContribution__TargetAssignment_2 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2920:1: ( ( rule__OrContribution__TargetAssignment_2 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2920:1: ( ( rule__OrContribution__TargetAssignment_2 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2921:1: ( rule__OrContribution__TargetAssignment_2 )
            {
             before(grammarAccess.getOrContributionAccess().getTargetAssignment_2()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2922:1: ( rule__OrContribution__TargetAssignment_2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2922:2: rule__OrContribution__TargetAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrContribution__TargetAssignment_2_in_rule__OrContribution__Group__2__Impl5909);
            rule__OrContribution__TargetAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getOrContributionAccess().getTargetAssignment_2()); 

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
    // $ANTLR end rule__OrContribution__Group__2__Impl


    // $ANTLR start rule__HelpContribution__Group__0
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2938:1: rule__HelpContribution__Group__0 : rule__HelpContribution__Group__0__Impl rule__HelpContribution__Group__1 ;
    public final void rule__HelpContribution__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2942:1: ( rule__HelpContribution__Group__0__Impl rule__HelpContribution__Group__1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2943:2: rule__HelpContribution__Group__0__Impl rule__HelpContribution__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__HelpContribution__Group__0__Impl_in_rule__HelpContribution__Group__05945);
            rule__HelpContribution__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__HelpContribution__Group__1_in_rule__HelpContribution__Group__05948);
            rule__HelpContribution__Group__1();
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
    // $ANTLR end rule__HelpContribution__Group__0


    // $ANTLR start rule__HelpContribution__Group__0__Impl
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2950:1: rule__HelpContribution__Group__0__Impl : ( ( rule__HelpContribution__SourceAssignment_0 ) ) ;
    public final void rule__HelpContribution__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2954:1: ( ( ( rule__HelpContribution__SourceAssignment_0 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2955:1: ( ( rule__HelpContribution__SourceAssignment_0 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2955:1: ( ( rule__HelpContribution__SourceAssignment_0 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2956:1: ( rule__HelpContribution__SourceAssignment_0 )
            {
             before(grammarAccess.getHelpContributionAccess().getSourceAssignment_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2957:1: ( rule__HelpContribution__SourceAssignment_0 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2957:2: rule__HelpContribution__SourceAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__HelpContribution__SourceAssignment_0_in_rule__HelpContribution__Group__0__Impl5975);
            rule__HelpContribution__SourceAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getHelpContributionAccess().getSourceAssignment_0()); 

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
    // $ANTLR end rule__HelpContribution__Group__0__Impl


    // $ANTLR start rule__HelpContribution__Group__1
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2967:1: rule__HelpContribution__Group__1 : rule__HelpContribution__Group__1__Impl rule__HelpContribution__Group__2 ;
    public final void rule__HelpContribution__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2971:1: ( rule__HelpContribution__Group__1__Impl rule__HelpContribution__Group__2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2972:2: rule__HelpContribution__Group__1__Impl rule__HelpContribution__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__HelpContribution__Group__1__Impl_in_rule__HelpContribution__Group__16005);
            rule__HelpContribution__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__HelpContribution__Group__2_in_rule__HelpContribution__Group__16008);
            rule__HelpContribution__Group__2();
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
    // $ANTLR end rule__HelpContribution__Group__1


    // $ANTLR start rule__HelpContribution__Group__1__Impl
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2979:1: rule__HelpContribution__Group__1__Impl : ( '-(+)->' ) ;
    public final void rule__HelpContribution__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2983:1: ( ( '-(+)->' ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2984:1: ( '-(+)->' )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2984:1: ( '-(+)->' )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2985:1: '-(+)->'
            {
             before(grammarAccess.getHelpContributionAccess().getHyphenMinusLeftParenthesisPlusSignRightParenthesisHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__HelpContribution__Group__1__Impl6036); 
             after(grammarAccess.getHelpContributionAccess().getHyphenMinusLeftParenthesisPlusSignRightParenthesisHyphenMinusGreaterThanSignKeyword_1()); 

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
    // $ANTLR end rule__HelpContribution__Group__1__Impl


    // $ANTLR start rule__HelpContribution__Group__2
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2998:1: rule__HelpContribution__Group__2 : rule__HelpContribution__Group__2__Impl ;
    public final void rule__HelpContribution__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3002:1: ( rule__HelpContribution__Group__2__Impl )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3003:2: rule__HelpContribution__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__HelpContribution__Group__2__Impl_in_rule__HelpContribution__Group__26067);
            rule__HelpContribution__Group__2__Impl();
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
    // $ANTLR end rule__HelpContribution__Group__2


    // $ANTLR start rule__HelpContribution__Group__2__Impl
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3009:1: rule__HelpContribution__Group__2__Impl : ( ( rule__HelpContribution__TargetAssignment_2 ) ) ;
    public final void rule__HelpContribution__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3013:1: ( ( ( rule__HelpContribution__TargetAssignment_2 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3014:1: ( ( rule__HelpContribution__TargetAssignment_2 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3014:1: ( ( rule__HelpContribution__TargetAssignment_2 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3015:1: ( rule__HelpContribution__TargetAssignment_2 )
            {
             before(grammarAccess.getHelpContributionAccess().getTargetAssignment_2()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3016:1: ( rule__HelpContribution__TargetAssignment_2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3016:2: rule__HelpContribution__TargetAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__HelpContribution__TargetAssignment_2_in_rule__HelpContribution__Group__2__Impl6094);
            rule__HelpContribution__TargetAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getHelpContributionAccess().getTargetAssignment_2()); 

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
    // $ANTLR end rule__HelpContribution__Group__2__Impl


    // $ANTLR start rule__MakeContribution__Group__0
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3032:1: rule__MakeContribution__Group__0 : rule__MakeContribution__Group__0__Impl rule__MakeContribution__Group__1 ;
    public final void rule__MakeContribution__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3036:1: ( rule__MakeContribution__Group__0__Impl rule__MakeContribution__Group__1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3037:2: rule__MakeContribution__Group__0__Impl rule__MakeContribution__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MakeContribution__Group__0__Impl_in_rule__MakeContribution__Group__06130);
            rule__MakeContribution__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MakeContribution__Group__1_in_rule__MakeContribution__Group__06133);
            rule__MakeContribution__Group__1();
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
    // $ANTLR end rule__MakeContribution__Group__0


    // $ANTLR start rule__MakeContribution__Group__0__Impl
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3044:1: rule__MakeContribution__Group__0__Impl : ( ( rule__MakeContribution__SourceAssignment_0 ) ) ;
    public final void rule__MakeContribution__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3048:1: ( ( ( rule__MakeContribution__SourceAssignment_0 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3049:1: ( ( rule__MakeContribution__SourceAssignment_0 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3049:1: ( ( rule__MakeContribution__SourceAssignment_0 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3050:1: ( rule__MakeContribution__SourceAssignment_0 )
            {
             before(grammarAccess.getMakeContributionAccess().getSourceAssignment_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3051:1: ( rule__MakeContribution__SourceAssignment_0 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3051:2: rule__MakeContribution__SourceAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MakeContribution__SourceAssignment_0_in_rule__MakeContribution__Group__0__Impl6160);
            rule__MakeContribution__SourceAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getMakeContributionAccess().getSourceAssignment_0()); 

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
    // $ANTLR end rule__MakeContribution__Group__0__Impl


    // $ANTLR start rule__MakeContribution__Group__1
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3061:1: rule__MakeContribution__Group__1 : rule__MakeContribution__Group__1__Impl rule__MakeContribution__Group__2 ;
    public final void rule__MakeContribution__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3065:1: ( rule__MakeContribution__Group__1__Impl rule__MakeContribution__Group__2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3066:2: rule__MakeContribution__Group__1__Impl rule__MakeContribution__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MakeContribution__Group__1__Impl_in_rule__MakeContribution__Group__16190);
            rule__MakeContribution__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MakeContribution__Group__2_in_rule__MakeContribution__Group__16193);
            rule__MakeContribution__Group__2();
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
    // $ANTLR end rule__MakeContribution__Group__1


    // $ANTLR start rule__MakeContribution__Group__1__Impl
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3073:1: rule__MakeContribution__Group__1__Impl : ( '-(++)->' ) ;
    public final void rule__MakeContribution__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3077:1: ( ( '-(++)->' ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3078:1: ( '-(++)->' )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3078:1: ( '-(++)->' )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3079:1: '-(++)->'
            {
             before(grammarAccess.getMakeContributionAccess().getHyphenMinusLeftParenthesisPlusSignPlusSignRightParenthesisHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__MakeContribution__Group__1__Impl6221); 
             after(grammarAccess.getMakeContributionAccess().getHyphenMinusLeftParenthesisPlusSignPlusSignRightParenthesisHyphenMinusGreaterThanSignKeyword_1()); 

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
    // $ANTLR end rule__MakeContribution__Group__1__Impl


    // $ANTLR start rule__MakeContribution__Group__2
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3092:1: rule__MakeContribution__Group__2 : rule__MakeContribution__Group__2__Impl ;
    public final void rule__MakeContribution__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3096:1: ( rule__MakeContribution__Group__2__Impl )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3097:2: rule__MakeContribution__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MakeContribution__Group__2__Impl_in_rule__MakeContribution__Group__26252);
            rule__MakeContribution__Group__2__Impl();
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
    // $ANTLR end rule__MakeContribution__Group__2


    // $ANTLR start rule__MakeContribution__Group__2__Impl
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3103:1: rule__MakeContribution__Group__2__Impl : ( ( rule__MakeContribution__TargetAssignment_2 ) ) ;
    public final void rule__MakeContribution__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3107:1: ( ( ( rule__MakeContribution__TargetAssignment_2 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3108:1: ( ( rule__MakeContribution__TargetAssignment_2 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3108:1: ( ( rule__MakeContribution__TargetAssignment_2 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3109:1: ( rule__MakeContribution__TargetAssignment_2 )
            {
             before(grammarAccess.getMakeContributionAccess().getTargetAssignment_2()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3110:1: ( rule__MakeContribution__TargetAssignment_2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3110:2: rule__MakeContribution__TargetAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MakeContribution__TargetAssignment_2_in_rule__MakeContribution__Group__2__Impl6279);
            rule__MakeContribution__TargetAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getMakeContributionAccess().getTargetAssignment_2()); 

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
    // $ANTLR end rule__MakeContribution__Group__2__Impl


    // $ANTLR start rule__HurtContribution__Group__0
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3126:1: rule__HurtContribution__Group__0 : rule__HurtContribution__Group__0__Impl rule__HurtContribution__Group__1 ;
    public final void rule__HurtContribution__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3130:1: ( rule__HurtContribution__Group__0__Impl rule__HurtContribution__Group__1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3131:2: rule__HurtContribution__Group__0__Impl rule__HurtContribution__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__HurtContribution__Group__0__Impl_in_rule__HurtContribution__Group__06315);
            rule__HurtContribution__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__HurtContribution__Group__1_in_rule__HurtContribution__Group__06318);
            rule__HurtContribution__Group__1();
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
    // $ANTLR end rule__HurtContribution__Group__0


    // $ANTLR start rule__HurtContribution__Group__0__Impl
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3138:1: rule__HurtContribution__Group__0__Impl : ( ( rule__HurtContribution__SourceAssignment_0 ) ) ;
    public final void rule__HurtContribution__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3142:1: ( ( ( rule__HurtContribution__SourceAssignment_0 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3143:1: ( ( rule__HurtContribution__SourceAssignment_0 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3143:1: ( ( rule__HurtContribution__SourceAssignment_0 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3144:1: ( rule__HurtContribution__SourceAssignment_0 )
            {
             before(grammarAccess.getHurtContributionAccess().getSourceAssignment_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3145:1: ( rule__HurtContribution__SourceAssignment_0 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3145:2: rule__HurtContribution__SourceAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__HurtContribution__SourceAssignment_0_in_rule__HurtContribution__Group__0__Impl6345);
            rule__HurtContribution__SourceAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getHurtContributionAccess().getSourceAssignment_0()); 

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
    // $ANTLR end rule__HurtContribution__Group__0__Impl


    // $ANTLR start rule__HurtContribution__Group__1
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3155:1: rule__HurtContribution__Group__1 : rule__HurtContribution__Group__1__Impl rule__HurtContribution__Group__2 ;
    public final void rule__HurtContribution__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3159:1: ( rule__HurtContribution__Group__1__Impl rule__HurtContribution__Group__2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3160:2: rule__HurtContribution__Group__1__Impl rule__HurtContribution__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__HurtContribution__Group__1__Impl_in_rule__HurtContribution__Group__16375);
            rule__HurtContribution__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__HurtContribution__Group__2_in_rule__HurtContribution__Group__16378);
            rule__HurtContribution__Group__2();
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
    // $ANTLR end rule__HurtContribution__Group__1


    // $ANTLR start rule__HurtContribution__Group__1__Impl
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3167:1: rule__HurtContribution__Group__1__Impl : ( '-(-)->' ) ;
    public final void rule__HurtContribution__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3171:1: ( ( '-(-)->' ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3172:1: ( '-(-)->' )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3172:1: ( '-(-)->' )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3173:1: '-(-)->'
            {
             before(grammarAccess.getHurtContributionAccess().getHyphenMinusLeftParenthesisHyphenMinusRightParenthesisHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__HurtContribution__Group__1__Impl6406); 
             after(grammarAccess.getHurtContributionAccess().getHyphenMinusLeftParenthesisHyphenMinusRightParenthesisHyphenMinusGreaterThanSignKeyword_1()); 

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
    // $ANTLR end rule__HurtContribution__Group__1__Impl


    // $ANTLR start rule__HurtContribution__Group__2
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3186:1: rule__HurtContribution__Group__2 : rule__HurtContribution__Group__2__Impl ;
    public final void rule__HurtContribution__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3190:1: ( rule__HurtContribution__Group__2__Impl )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3191:2: rule__HurtContribution__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__HurtContribution__Group__2__Impl_in_rule__HurtContribution__Group__26437);
            rule__HurtContribution__Group__2__Impl();
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
    // $ANTLR end rule__HurtContribution__Group__2


    // $ANTLR start rule__HurtContribution__Group__2__Impl
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3197:1: rule__HurtContribution__Group__2__Impl : ( ( rule__HurtContribution__TargetAssignment_2 ) ) ;
    public final void rule__HurtContribution__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3201:1: ( ( ( rule__HurtContribution__TargetAssignment_2 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3202:1: ( ( rule__HurtContribution__TargetAssignment_2 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3202:1: ( ( rule__HurtContribution__TargetAssignment_2 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3203:1: ( rule__HurtContribution__TargetAssignment_2 )
            {
             before(grammarAccess.getHurtContributionAccess().getTargetAssignment_2()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3204:1: ( rule__HurtContribution__TargetAssignment_2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3204:2: rule__HurtContribution__TargetAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__HurtContribution__TargetAssignment_2_in_rule__HurtContribution__Group__2__Impl6464);
            rule__HurtContribution__TargetAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getHurtContributionAccess().getTargetAssignment_2()); 

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
    // $ANTLR end rule__HurtContribution__Group__2__Impl


    // $ANTLR start rule__BreakContribution__Group__0
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3220:1: rule__BreakContribution__Group__0 : rule__BreakContribution__Group__0__Impl rule__BreakContribution__Group__1 ;
    public final void rule__BreakContribution__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3224:1: ( rule__BreakContribution__Group__0__Impl rule__BreakContribution__Group__1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3225:2: rule__BreakContribution__Group__0__Impl rule__BreakContribution__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BreakContribution__Group__0__Impl_in_rule__BreakContribution__Group__06500);
            rule__BreakContribution__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BreakContribution__Group__1_in_rule__BreakContribution__Group__06503);
            rule__BreakContribution__Group__1();
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
    // $ANTLR end rule__BreakContribution__Group__0


    // $ANTLR start rule__BreakContribution__Group__0__Impl
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3232:1: rule__BreakContribution__Group__0__Impl : ( ( rule__BreakContribution__SourceAssignment_0 ) ) ;
    public final void rule__BreakContribution__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3236:1: ( ( ( rule__BreakContribution__SourceAssignment_0 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3237:1: ( ( rule__BreakContribution__SourceAssignment_0 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3237:1: ( ( rule__BreakContribution__SourceAssignment_0 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3238:1: ( rule__BreakContribution__SourceAssignment_0 )
            {
             before(grammarAccess.getBreakContributionAccess().getSourceAssignment_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3239:1: ( rule__BreakContribution__SourceAssignment_0 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3239:2: rule__BreakContribution__SourceAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__BreakContribution__SourceAssignment_0_in_rule__BreakContribution__Group__0__Impl6530);
            rule__BreakContribution__SourceAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getBreakContributionAccess().getSourceAssignment_0()); 

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
    // $ANTLR end rule__BreakContribution__Group__0__Impl


    // $ANTLR start rule__BreakContribution__Group__1
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3249:1: rule__BreakContribution__Group__1 : rule__BreakContribution__Group__1__Impl rule__BreakContribution__Group__2 ;
    public final void rule__BreakContribution__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3253:1: ( rule__BreakContribution__Group__1__Impl rule__BreakContribution__Group__2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3254:2: rule__BreakContribution__Group__1__Impl rule__BreakContribution__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BreakContribution__Group__1__Impl_in_rule__BreakContribution__Group__16560);
            rule__BreakContribution__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BreakContribution__Group__2_in_rule__BreakContribution__Group__16563);
            rule__BreakContribution__Group__2();
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
    // $ANTLR end rule__BreakContribution__Group__1


    // $ANTLR start rule__BreakContribution__Group__1__Impl
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3261:1: rule__BreakContribution__Group__1__Impl : ( '-(--)->' ) ;
    public final void rule__BreakContribution__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3265:1: ( ( '-(--)->' ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3266:1: ( '-(--)->' )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3266:1: ( '-(--)->' )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3267:1: '-(--)->'
            {
             before(grammarAccess.getBreakContributionAccess().getHyphenMinusLeftParenthesisHyphenMinusHyphenMinusRightParenthesisHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__BreakContribution__Group__1__Impl6591); 
             after(grammarAccess.getBreakContributionAccess().getHyphenMinusLeftParenthesisHyphenMinusHyphenMinusRightParenthesisHyphenMinusGreaterThanSignKeyword_1()); 

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
    // $ANTLR end rule__BreakContribution__Group__1__Impl


    // $ANTLR start rule__BreakContribution__Group__2
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3280:1: rule__BreakContribution__Group__2 : rule__BreakContribution__Group__2__Impl ;
    public final void rule__BreakContribution__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3284:1: ( rule__BreakContribution__Group__2__Impl )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3285:2: rule__BreakContribution__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BreakContribution__Group__2__Impl_in_rule__BreakContribution__Group__26622);
            rule__BreakContribution__Group__2__Impl();
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
    // $ANTLR end rule__BreakContribution__Group__2


    // $ANTLR start rule__BreakContribution__Group__2__Impl
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3291:1: rule__BreakContribution__Group__2__Impl : ( ( rule__BreakContribution__TargetAssignment_2 ) ) ;
    public final void rule__BreakContribution__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3295:1: ( ( ( rule__BreakContribution__TargetAssignment_2 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3296:1: ( ( rule__BreakContribution__TargetAssignment_2 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3296:1: ( ( rule__BreakContribution__TargetAssignment_2 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3297:1: ( rule__BreakContribution__TargetAssignment_2 )
            {
             before(grammarAccess.getBreakContributionAccess().getTargetAssignment_2()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3298:1: ( rule__BreakContribution__TargetAssignment_2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3298:2: rule__BreakContribution__TargetAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BreakContribution__TargetAssignment_2_in_rule__BreakContribution__Group__2__Impl6649);
            rule__BreakContribution__TargetAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getBreakContributionAccess().getTargetAssignment_2()); 

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
    // $ANTLR end rule__BreakContribution__Group__2__Impl


    // $ANTLR start rule__Model__NameAssignment_1_1
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3315:1: rule__Model__NameAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__Model__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3319:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3320:1: ( RULE_ID )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3320:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3321:1: RULE_ID
            {
             before(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Model__NameAssignment_1_16690); 
             after(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end rule__Model__NameAssignment_1_1


    // $ANTLR start rule__Model__ContainersAssignment_3_0
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3330:1: rule__Model__ContainersAssignment_3_0 : ( ruleContainer ) ;
    public final void rule__Model__ContainersAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3334:1: ( ( ruleContainer ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3335:1: ( ruleContainer )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3335:1: ( ruleContainer )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3336:1: ruleContainer
            {
             before(grammarAccess.getModelAccess().getContainersContainerParserRuleCall_3_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleContainer_in_rule__Model__ContainersAssignment_3_06721);
            ruleContainer();
            _fsp--;

             after(grammarAccess.getModelAccess().getContainersContainerParserRuleCall_3_0_0()); 

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
    // $ANTLR end rule__Model__ContainersAssignment_3_0


    // $ANTLR start rule__Model__IntentionsAssignment_3_1
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3345:1: rule__Model__IntentionsAssignment_3_1 : ( ruleIntention ) ;
    public final void rule__Model__IntentionsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3349:1: ( ( ruleIntention ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3350:1: ( ruleIntention )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3350:1: ( ruleIntention )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3351:1: ruleIntention
            {
             before(grammarAccess.getModelAccess().getIntentionsIntentionParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleIntention_in_rule__Model__IntentionsAssignment_3_16752);
            ruleIntention();
            _fsp--;

             after(grammarAccess.getModelAccess().getIntentionsIntentionParserRuleCall_3_1_0()); 

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
    // $ANTLR end rule__Model__IntentionsAssignment_3_1


    // $ANTLR start rule__Model__DecompositionsAssignment_3_2
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3360:1: rule__Model__DecompositionsAssignment_3_2 : ( ruleDecomposition ) ;
    public final void rule__Model__DecompositionsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3364:1: ( ( ruleDecomposition ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3365:1: ( ruleDecomposition )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3365:1: ( ruleDecomposition )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3366:1: ruleDecomposition
            {
             before(grammarAccess.getModelAccess().getDecompositionsDecompositionParserRuleCall_3_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDecomposition_in_rule__Model__DecompositionsAssignment_3_26783);
            ruleDecomposition();
            _fsp--;

             after(grammarAccess.getModelAccess().getDecompositionsDecompositionParserRuleCall_3_2_0()); 

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
    // $ANTLR end rule__Model__DecompositionsAssignment_3_2


    // $ANTLR start rule__Model__DependenciesAssignment_3_3
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3375:1: rule__Model__DependenciesAssignment_3_3 : ( ruleDependency ) ;
    public final void rule__Model__DependenciesAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3379:1: ( ( ruleDependency ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3380:1: ( ruleDependency )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3380:1: ( ruleDependency )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3381:1: ruleDependency
            {
             before(grammarAccess.getModelAccess().getDependenciesDependencyParserRuleCall_3_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDependency_in_rule__Model__DependenciesAssignment_3_36814);
            ruleDependency();
            _fsp--;

             after(grammarAccess.getModelAccess().getDependenciesDependencyParserRuleCall_3_3_0()); 

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
    // $ANTLR end rule__Model__DependenciesAssignment_3_3


    // $ANTLR start rule__Model__ContributionsAssignment_3_4
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3390:1: rule__Model__ContributionsAssignment_3_4 : ( ruleContribution ) ;
    public final void rule__Model__ContributionsAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3394:1: ( ( ruleContribution ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3395:1: ( ruleContribution )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3395:1: ( ruleContribution )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3396:1: ruleContribution
            {
             before(grammarAccess.getModelAccess().getContributionsContributionParserRuleCall_3_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleContribution_in_rule__Model__ContributionsAssignment_3_46845);
            ruleContribution();
            _fsp--;

             after(grammarAccess.getModelAccess().getContributionsContributionParserRuleCall_3_4_0()); 

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
    // $ANTLR end rule__Model__ContributionsAssignment_3_4


    // $ANTLR start rule__Model__AssociationsAssignment_3_5
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3405:1: rule__Model__AssociationsAssignment_3_5 : ( ruleAssociation ) ;
    public final void rule__Model__AssociationsAssignment_3_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3409:1: ( ( ruleAssociation ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3410:1: ( ruleAssociation )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3410:1: ( ruleAssociation )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3411:1: ruleAssociation
            {
             before(grammarAccess.getModelAccess().getAssociationsAssociationParserRuleCall_3_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAssociation_in_rule__Model__AssociationsAssignment_3_56876);
            ruleAssociation();
            _fsp--;

             after(grammarAccess.getModelAccess().getAssociationsAssociationParserRuleCall_3_5_0()); 

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
    // $ANTLR end rule__Model__AssociationsAssignment_3_5


    // $ANTLR start rule__Actor__NameAssignment_1
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3420:1: rule__Actor__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Actor__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3424:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3425:1: ( RULE_ID )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3425:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3426:1: RULE_ID
            {
             before(grammarAccess.getActorAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Actor__NameAssignment_16907); 
             after(grammarAccess.getActorAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end rule__Actor__NameAssignment_1


    // $ANTLR start rule__Actor__Is_aAssignment_2_0
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3435:1: rule__Actor__Is_aAssignment_2_0 : ( ( RULE_ID ) ) ;
    public final void rule__Actor__Is_aAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3439:1: ( ( ( RULE_ID ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3440:1: ( ( RULE_ID ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3440:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3441:1: ( RULE_ID )
            {
             before(grammarAccess.getActorAccess().getIs_aActorCrossReference_2_0_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3442:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3443:1: RULE_ID
            {
             before(grammarAccess.getActorAccess().getIs_aActorIDTerminalRuleCall_2_0_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Actor__Is_aAssignment_2_06942); 
             after(grammarAccess.getActorAccess().getIs_aActorIDTerminalRuleCall_2_0_0_1()); 

            }

             after(grammarAccess.getActorAccess().getIs_aActorCrossReference_2_0_0()); 

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
    // $ANTLR end rule__Actor__Is_aAssignment_2_0


    // $ANTLR start rule__Actor__Is_part_ofAssignment_2_1
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3454:1: rule__Actor__Is_part_ofAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Actor__Is_part_ofAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3458:1: ( ( ( RULE_ID ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3459:1: ( ( RULE_ID ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3459:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3460:1: ( RULE_ID )
            {
             before(grammarAccess.getActorAccess().getIs_part_ofActorCrossReference_2_1_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3461:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3462:1: RULE_ID
            {
             before(grammarAccess.getActorAccess().getIs_part_ofActorIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Actor__Is_part_ofAssignment_2_16981); 
             after(grammarAccess.getActorAccess().getIs_part_ofActorIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getActorAccess().getIs_part_ofActorCrossReference_2_1_0()); 

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
    // $ANTLR end rule__Actor__Is_part_ofAssignment_2_1


    // $ANTLR start rule__Actor__IntentionsAssignment_3_1
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3473:1: rule__Actor__IntentionsAssignment_3_1 : ( ruleIntention ) ;
    public final void rule__Actor__IntentionsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3477:1: ( ( ruleIntention ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3478:1: ( ruleIntention )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3478:1: ( ruleIntention )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3479:1: ruleIntention
            {
             before(grammarAccess.getActorAccess().getIntentionsIntentionParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleIntention_in_rule__Actor__IntentionsAssignment_3_17016);
            ruleIntention();
            _fsp--;

             after(grammarAccess.getActorAccess().getIntentionsIntentionParserRuleCall_3_1_0()); 

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
    // $ANTLR end rule__Actor__IntentionsAssignment_3_1


    // $ANTLR start rule__Agent__NameAssignment_1
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3488:1: rule__Agent__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Agent__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3492:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3493:1: ( RULE_ID )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3493:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3494:1: RULE_ID
            {
             before(grammarAccess.getAgentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Agent__NameAssignment_17047); 
             after(grammarAccess.getAgentAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end rule__Agent__NameAssignment_1


    // $ANTLR start rule__Agent__IntentionsAssignment_2_1
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3503:1: rule__Agent__IntentionsAssignment_2_1 : ( ruleIntention ) ;
    public final void rule__Agent__IntentionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3507:1: ( ( ruleIntention ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3508:1: ( ruleIntention )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3508:1: ( ruleIntention )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3509:1: ruleIntention
            {
             before(grammarAccess.getAgentAccess().getIntentionsIntentionParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleIntention_in_rule__Agent__IntentionsAssignment_2_17078);
            ruleIntention();
            _fsp--;

             after(grammarAccess.getAgentAccess().getIntentionsIntentionParserRuleCall_2_1_0()); 

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
    // $ANTLR end rule__Agent__IntentionsAssignment_2_1


    // $ANTLR start rule__Role__NameAssignment_1
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3518:1: rule__Role__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Role__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3522:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3523:1: ( RULE_ID )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3523:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3524:1: RULE_ID
            {
             before(grammarAccess.getRoleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Role__NameAssignment_17109); 
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


    // $ANTLR start rule__Role__IntentionsAssignment_2_1
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3533:1: rule__Role__IntentionsAssignment_2_1 : ( ruleIntention ) ;
    public final void rule__Role__IntentionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3537:1: ( ( ruleIntention ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3538:1: ( ruleIntention )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3538:1: ( ruleIntention )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3539:1: ruleIntention
            {
             before(grammarAccess.getRoleAccess().getIntentionsIntentionParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleIntention_in_rule__Role__IntentionsAssignment_2_17140);
            ruleIntention();
            _fsp--;

             after(grammarAccess.getRoleAccess().getIntentionsIntentionParserRuleCall_2_1_0()); 

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
    // $ANTLR end rule__Role__IntentionsAssignment_2_1


    // $ANTLR start rule__Position__NameAssignment_1
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3548:1: rule__Position__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Position__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3552:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3553:1: ( RULE_ID )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3553:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3554:1: RULE_ID
            {
             before(grammarAccess.getPositionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Position__NameAssignment_17171); 
             after(grammarAccess.getPositionAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end rule__Position__NameAssignment_1


    // $ANTLR start rule__Position__IntentionsAssignment_2_1
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3563:1: rule__Position__IntentionsAssignment_2_1 : ( ruleIntention ) ;
    public final void rule__Position__IntentionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3567:1: ( ( ruleIntention ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3568:1: ( ruleIntention )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3568:1: ( ruleIntention )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3569:1: ruleIntention
            {
             before(grammarAccess.getPositionAccess().getIntentionsIntentionParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleIntention_in_rule__Position__IntentionsAssignment_2_17202);
            ruleIntention();
            _fsp--;

             after(grammarAccess.getPositionAccess().getIntentionsIntentionParserRuleCall_2_1_0()); 

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
    // $ANTLR end rule__Position__IntentionsAssignment_2_1


    // $ANTLR start rule__Goal__NameAssignment_1
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3578:1: rule__Goal__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Goal__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3582:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3583:1: ( RULE_ID )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3583:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3584:1: RULE_ID
            {
             before(grammarAccess.getGoalAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Goal__NameAssignment_17233); 
             after(grammarAccess.getGoalAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end rule__Goal__NameAssignment_1


    // $ANTLR start rule__Goal__DecompositionsAssignment_2_1
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3593:1: rule__Goal__DecompositionsAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Goal__DecompositionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3597:1: ( ( ( RULE_ID ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3598:1: ( ( RULE_ID ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3598:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3599:1: ( RULE_ID )
            {
             before(grammarAccess.getGoalAccess().getDecompositionsDecompositionCrossReference_2_1_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3600:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3601:1: RULE_ID
            {
             before(grammarAccess.getGoalAccess().getDecompositionsDecompositionIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Goal__DecompositionsAssignment_2_17268); 
             after(grammarAccess.getGoalAccess().getDecompositionsDecompositionIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getGoalAccess().getDecompositionsDecompositionCrossReference_2_1_0()); 

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
    // $ANTLR end rule__Goal__DecompositionsAssignment_2_1


    // $ANTLR start rule__Softgoal__NameAssignment_1
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3612:1: rule__Softgoal__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Softgoal__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3616:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3617:1: ( RULE_ID )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3617:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3618:1: RULE_ID
            {
             before(grammarAccess.getSoftgoalAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Softgoal__NameAssignment_17303); 
             after(grammarAccess.getSoftgoalAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end rule__Softgoal__NameAssignment_1


    // $ANTLR start rule__Task__NameAssignment_1
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3627:1: rule__Task__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Task__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3631:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3632:1: ( RULE_ID )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3632:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3633:1: RULE_ID
            {
             before(grammarAccess.getTaskAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Task__NameAssignment_17334); 
             after(grammarAccess.getTaskAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end rule__Task__NameAssignment_1


    // $ANTLR start rule__Resource__NameAssignment_1
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3642:1: rule__Resource__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Resource__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3646:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3647:1: ( RULE_ID )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3647:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3648:1: RULE_ID
            {
             before(grammarAccess.getResourceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Resource__NameAssignment_17365); 
             after(grammarAccess.getResourceAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end rule__Resource__NameAssignment_1


    // $ANTLR start rule__Belief__NameAssignment_1
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3657:1: rule__Belief__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Belief__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3661:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3662:1: ( RULE_ID )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3662:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3663:1: RULE_ID
            {
             before(grammarAccess.getBeliefAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Belief__NameAssignment_17396); 
             after(grammarAccess.getBeliefAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end rule__Belief__NameAssignment_1


    // $ANTLR start rule__Association__SourceAssignment_0
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3672:1: rule__Association__SourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Association__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3676:1: ( ( ( RULE_ID ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3677:1: ( ( RULE_ID ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3677:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3678:1: ( RULE_ID )
            {
             before(grammarAccess.getAssociationAccess().getSourceContainerCrossReference_0_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3679:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3680:1: RULE_ID
            {
             before(grammarAccess.getAssociationAccess().getSourceContainerIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Association__SourceAssignment_07431); 
             after(grammarAccess.getAssociationAccess().getSourceContainerIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getAssociationAccess().getSourceContainerCrossReference_0_0()); 

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
    // $ANTLR end rule__Association__SourceAssignment_0


    // $ANTLR start rule__Association__TargetAssignment_2
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3691:1: rule__Association__TargetAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Association__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3695:1: ( ( ( RULE_ID ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3696:1: ( ( RULE_ID ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3696:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3697:1: ( RULE_ID )
            {
             before(grammarAccess.getAssociationAccess().getTargetContainerCrossReference_2_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3698:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3699:1: RULE_ID
            {
             before(grammarAccess.getAssociationAccess().getTargetContainerIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Association__TargetAssignment_27470); 
             after(grammarAccess.getAssociationAccess().getTargetContainerIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getAssociationAccess().getTargetContainerCrossReference_2_0()); 

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
    // $ANTLR end rule__Association__TargetAssignment_2


    // $ANTLR start rule__Dependency__DependencyFromAssignment_0
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3710:1: rule__Dependency__DependencyFromAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Dependency__DependencyFromAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3714:1: ( ( ( RULE_ID ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3715:1: ( ( RULE_ID ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3715:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3716:1: ( RULE_ID )
            {
             before(grammarAccess.getDependencyAccess().getDependencyFromDependableCrossReference_0_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3717:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3718:1: RULE_ID
            {
             before(grammarAccess.getDependencyAccess().getDependencyFromDependableIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Dependency__DependencyFromAssignment_07509); 
             after(grammarAccess.getDependencyAccess().getDependencyFromDependableIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getDependencyAccess().getDependencyFromDependableCrossReference_0_0()); 

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
    // $ANTLR end rule__Dependency__DependencyFromAssignment_0


    // $ANTLR start rule__Dependency__DependencyToAssignment_2
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3729:1: rule__Dependency__DependencyToAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Dependency__DependencyToAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3733:1: ( ( ( RULE_ID ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3734:1: ( ( RULE_ID ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3734:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3735:1: ( RULE_ID )
            {
             before(grammarAccess.getDependencyAccess().getDependencyToDependableCrossReference_2_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3736:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3737:1: RULE_ID
            {
             before(grammarAccess.getDependencyAccess().getDependencyToDependableIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Dependency__DependencyToAssignment_27548); 
             after(grammarAccess.getDependencyAccess().getDependencyToDependableIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getDependencyAccess().getDependencyToDependableCrossReference_2_0()); 

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
    // $ANTLR end rule__Dependency__DependencyToAssignment_2


    // $ANTLR start rule__AndDecomposition__TargetAssignment_0
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3748:1: rule__AndDecomposition__TargetAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__AndDecomposition__TargetAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3752:1: ( ( ( RULE_ID ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3753:1: ( ( RULE_ID ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3753:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3754:1: ( RULE_ID )
            {
             before(grammarAccess.getAndDecompositionAccess().getTargetIntentionCrossReference_0_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3755:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3756:1: RULE_ID
            {
             before(grammarAccess.getAndDecompositionAccess().getTargetIntentionIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__AndDecomposition__TargetAssignment_07587); 
             after(grammarAccess.getAndDecompositionAccess().getTargetIntentionIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getAndDecompositionAccess().getTargetIntentionCrossReference_0_0()); 

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
    // $ANTLR end rule__AndDecomposition__TargetAssignment_0


    // $ANTLR start rule__AndDecomposition__SourceAssignment_2
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3767:1: rule__AndDecomposition__SourceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__AndDecomposition__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3771:1: ( ( ( RULE_ID ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3772:1: ( ( RULE_ID ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3772:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3773:1: ( RULE_ID )
            {
             before(grammarAccess.getAndDecompositionAccess().getSourceIntentionCrossReference_2_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3774:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3775:1: RULE_ID
            {
             before(grammarAccess.getAndDecompositionAccess().getSourceIntentionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__AndDecomposition__SourceAssignment_27626); 
             after(grammarAccess.getAndDecompositionAccess().getSourceIntentionIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getAndDecompositionAccess().getSourceIntentionCrossReference_2_0()); 

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
    // $ANTLR end rule__AndDecomposition__SourceAssignment_2


    // $ANTLR start rule__OrDecomposition__TargetAssignment_0
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3786:1: rule__OrDecomposition__TargetAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__OrDecomposition__TargetAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3790:1: ( ( ( RULE_ID ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3791:1: ( ( RULE_ID ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3791:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3792:1: ( RULE_ID )
            {
             before(grammarAccess.getOrDecompositionAccess().getTargetIntentionCrossReference_0_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3793:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3794:1: RULE_ID
            {
             before(grammarAccess.getOrDecompositionAccess().getTargetIntentionIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__OrDecomposition__TargetAssignment_07665); 
             after(grammarAccess.getOrDecompositionAccess().getTargetIntentionIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getOrDecompositionAccess().getTargetIntentionCrossReference_0_0()); 

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
    // $ANTLR end rule__OrDecomposition__TargetAssignment_0


    // $ANTLR start rule__OrDecomposition__SourceAssignment_2
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3805:1: rule__OrDecomposition__SourceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__OrDecomposition__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3809:1: ( ( ( RULE_ID ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3810:1: ( ( RULE_ID ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3810:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3811:1: ( RULE_ID )
            {
             before(grammarAccess.getOrDecompositionAccess().getSourceIntentionCrossReference_2_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3812:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3813:1: RULE_ID
            {
             before(grammarAccess.getOrDecompositionAccess().getSourceIntentionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__OrDecomposition__SourceAssignment_27704); 
             after(grammarAccess.getOrDecompositionAccess().getSourceIntentionIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getOrDecompositionAccess().getSourceIntentionCrossReference_2_0()); 

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
    // $ANTLR end rule__OrDecomposition__SourceAssignment_2


    // $ANTLR start rule__AndContribution__SourceAssignment_0
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3824:1: rule__AndContribution__SourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__AndContribution__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3828:1: ( ( ( RULE_ID ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3829:1: ( ( RULE_ID ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3829:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3830:1: ( RULE_ID )
            {
             before(grammarAccess.getAndContributionAccess().getSourceIntentionCrossReference_0_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3831:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3832:1: RULE_ID
            {
             before(grammarAccess.getAndContributionAccess().getSourceIntentionIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__AndContribution__SourceAssignment_07743); 
             after(grammarAccess.getAndContributionAccess().getSourceIntentionIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getAndContributionAccess().getSourceIntentionCrossReference_0_0()); 

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
    // $ANTLR end rule__AndContribution__SourceAssignment_0


    // $ANTLR start rule__AndContribution__TargetAssignment_2
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3843:1: rule__AndContribution__TargetAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__AndContribution__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3847:1: ( ( ( RULE_ID ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3848:1: ( ( RULE_ID ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3848:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3849:1: ( RULE_ID )
            {
             before(grammarAccess.getAndContributionAccess().getTargetIntentionCrossReference_2_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3850:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3851:1: RULE_ID
            {
             before(grammarAccess.getAndContributionAccess().getTargetIntentionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__AndContribution__TargetAssignment_27782); 
             after(grammarAccess.getAndContributionAccess().getTargetIntentionIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getAndContributionAccess().getTargetIntentionCrossReference_2_0()); 

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
    // $ANTLR end rule__AndContribution__TargetAssignment_2


    // $ANTLR start rule__OrContribution__SourceAssignment_0
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3862:1: rule__OrContribution__SourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__OrContribution__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3866:1: ( ( ( RULE_ID ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3867:1: ( ( RULE_ID ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3867:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3868:1: ( RULE_ID )
            {
             before(grammarAccess.getOrContributionAccess().getSourceIntentionCrossReference_0_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3869:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3870:1: RULE_ID
            {
             before(grammarAccess.getOrContributionAccess().getSourceIntentionIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__OrContribution__SourceAssignment_07821); 
             after(grammarAccess.getOrContributionAccess().getSourceIntentionIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getOrContributionAccess().getSourceIntentionCrossReference_0_0()); 

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
    // $ANTLR end rule__OrContribution__SourceAssignment_0


    // $ANTLR start rule__OrContribution__TargetAssignment_2
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3881:1: rule__OrContribution__TargetAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__OrContribution__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3885:1: ( ( ( RULE_ID ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3886:1: ( ( RULE_ID ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3886:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3887:1: ( RULE_ID )
            {
             before(grammarAccess.getOrContributionAccess().getTargetIntentionCrossReference_2_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3888:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3889:1: RULE_ID
            {
             before(grammarAccess.getOrContributionAccess().getTargetIntentionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__OrContribution__TargetAssignment_27860); 
             after(grammarAccess.getOrContributionAccess().getTargetIntentionIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getOrContributionAccess().getTargetIntentionCrossReference_2_0()); 

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
    // $ANTLR end rule__OrContribution__TargetAssignment_2


    // $ANTLR start rule__HelpContribution__SourceAssignment_0
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3900:1: rule__HelpContribution__SourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__HelpContribution__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3904:1: ( ( ( RULE_ID ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3905:1: ( ( RULE_ID ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3905:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3906:1: ( RULE_ID )
            {
             before(grammarAccess.getHelpContributionAccess().getSourceIntentionCrossReference_0_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3907:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3908:1: RULE_ID
            {
             before(grammarAccess.getHelpContributionAccess().getSourceIntentionIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__HelpContribution__SourceAssignment_07899); 
             after(grammarAccess.getHelpContributionAccess().getSourceIntentionIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getHelpContributionAccess().getSourceIntentionCrossReference_0_0()); 

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
    // $ANTLR end rule__HelpContribution__SourceAssignment_0


    // $ANTLR start rule__HelpContribution__TargetAssignment_2
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3919:1: rule__HelpContribution__TargetAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__HelpContribution__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3923:1: ( ( ( RULE_ID ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3924:1: ( ( RULE_ID ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3924:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3925:1: ( RULE_ID )
            {
             before(grammarAccess.getHelpContributionAccess().getTargetIntentionCrossReference_2_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3926:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3927:1: RULE_ID
            {
             before(grammarAccess.getHelpContributionAccess().getTargetIntentionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__HelpContribution__TargetAssignment_27938); 
             after(grammarAccess.getHelpContributionAccess().getTargetIntentionIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getHelpContributionAccess().getTargetIntentionCrossReference_2_0()); 

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
    // $ANTLR end rule__HelpContribution__TargetAssignment_2


    // $ANTLR start rule__MakeContribution__SourceAssignment_0
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3938:1: rule__MakeContribution__SourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__MakeContribution__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3942:1: ( ( ( RULE_ID ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3943:1: ( ( RULE_ID ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3943:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3944:1: ( RULE_ID )
            {
             before(grammarAccess.getMakeContributionAccess().getSourceIntentionCrossReference_0_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3945:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3946:1: RULE_ID
            {
             before(grammarAccess.getMakeContributionAccess().getSourceIntentionIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__MakeContribution__SourceAssignment_07977); 
             after(grammarAccess.getMakeContributionAccess().getSourceIntentionIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getMakeContributionAccess().getSourceIntentionCrossReference_0_0()); 

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
    // $ANTLR end rule__MakeContribution__SourceAssignment_0


    // $ANTLR start rule__MakeContribution__TargetAssignment_2
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3957:1: rule__MakeContribution__TargetAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__MakeContribution__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3961:1: ( ( ( RULE_ID ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3962:1: ( ( RULE_ID ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3962:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3963:1: ( RULE_ID )
            {
             before(grammarAccess.getMakeContributionAccess().getTargetIntentionCrossReference_2_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3964:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3965:1: RULE_ID
            {
             before(grammarAccess.getMakeContributionAccess().getTargetIntentionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__MakeContribution__TargetAssignment_28016); 
             after(grammarAccess.getMakeContributionAccess().getTargetIntentionIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getMakeContributionAccess().getTargetIntentionCrossReference_2_0()); 

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
    // $ANTLR end rule__MakeContribution__TargetAssignment_2


    // $ANTLR start rule__HurtContribution__SourceAssignment_0
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3976:1: rule__HurtContribution__SourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__HurtContribution__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3980:1: ( ( ( RULE_ID ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3981:1: ( ( RULE_ID ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3981:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3982:1: ( RULE_ID )
            {
             before(grammarAccess.getHurtContributionAccess().getSourceIntentionCrossReference_0_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3983:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3984:1: RULE_ID
            {
             before(grammarAccess.getHurtContributionAccess().getSourceIntentionIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__HurtContribution__SourceAssignment_08055); 
             after(grammarAccess.getHurtContributionAccess().getSourceIntentionIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getHurtContributionAccess().getSourceIntentionCrossReference_0_0()); 

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
    // $ANTLR end rule__HurtContribution__SourceAssignment_0


    // $ANTLR start rule__HurtContribution__TargetAssignment_2
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3995:1: rule__HurtContribution__TargetAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__HurtContribution__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3999:1: ( ( ( RULE_ID ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:4000:1: ( ( RULE_ID ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:4000:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:4001:1: ( RULE_ID )
            {
             before(grammarAccess.getHurtContributionAccess().getTargetIntentionCrossReference_2_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:4002:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:4003:1: RULE_ID
            {
             before(grammarAccess.getHurtContributionAccess().getTargetIntentionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__HurtContribution__TargetAssignment_28094); 
             after(grammarAccess.getHurtContributionAccess().getTargetIntentionIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getHurtContributionAccess().getTargetIntentionCrossReference_2_0()); 

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
    // $ANTLR end rule__HurtContribution__TargetAssignment_2


    // $ANTLR start rule__BreakContribution__SourceAssignment_0
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:4014:1: rule__BreakContribution__SourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__BreakContribution__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:4018:1: ( ( ( RULE_ID ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:4019:1: ( ( RULE_ID ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:4019:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:4020:1: ( RULE_ID )
            {
             before(grammarAccess.getBreakContributionAccess().getSourceIntentionCrossReference_0_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:4021:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:4022:1: RULE_ID
            {
             before(grammarAccess.getBreakContributionAccess().getSourceIntentionIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__BreakContribution__SourceAssignment_08133); 
             after(grammarAccess.getBreakContributionAccess().getSourceIntentionIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getBreakContributionAccess().getSourceIntentionCrossReference_0_0()); 

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
    // $ANTLR end rule__BreakContribution__SourceAssignment_0


    // $ANTLR start rule__BreakContribution__TargetAssignment_2
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:4033:1: rule__BreakContribution__TargetAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__BreakContribution__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:4037:1: ( ( ( RULE_ID ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:4038:1: ( ( RULE_ID ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:4038:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:4039:1: ( RULE_ID )
            {
             before(grammarAccess.getBreakContributionAccess().getTargetIntentionCrossReference_2_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:4040:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:4041:1: RULE_ID
            {
             before(grammarAccess.getBreakContributionAccess().getTargetIntentionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__BreakContribution__TargetAssignment_28172); 
             after(grammarAccess.getBreakContributionAccess().getTargetIntentionIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getBreakContributionAccess().getTargetIntentionCrossReference_2_0()); 

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
    // $ANTLR end rule__BreakContribution__TargetAssignment_2


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContainer_in_entryRuleContainer121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleContainer128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Container__Alternatives_in_ruleContainer154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleActor_in_entryRuleActor181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleActor188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Actor__Group__0_in_ruleActor214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAgent_in_entryRuleAgent241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAgent248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Agent__Group__0_in_ruleAgent274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRole_in_entryRuleRole301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRole308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__Group__0_in_ruleRole334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePosition_in_entryRulePosition361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePosition368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Position__Group__0_in_rulePosition394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntention_in_entryRuleIntention421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIntention428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intention__Alternatives_in_ruleIntention454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGoal_in_entryRuleGoal481 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGoal488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Goal__Group__0_in_ruleGoal514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSoftgoal_in_entryRuleSoftgoal541 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSoftgoal548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Softgoal__Group__0_in_ruleSoftgoal574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTask_in_entryRuleTask601 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTask608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Task__Group__0_in_ruleTask634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleResource_in_entryRuleResource661 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleResource668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Resource__Group__0_in_ruleResource694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBelief_in_entryRuleBelief721 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBelief728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Belief__Group__0_in_ruleBelief754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssociation_in_entryRuleAssociation785 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAssociation792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Association__Group__0_in_ruleAssociation818 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDependency_in_entryRuleDependency845 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDependency852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Dependency__Group__0_in_ruleDependency878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDecomposition_in_entryRuleDecomposition905 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDecomposition912 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Decomposition__Alternatives_in_ruleDecomposition938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAndDecomposition_in_entryRuleAndDecomposition965 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAndDecomposition972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndDecomposition__Group__0_in_ruleAndDecomposition998 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrDecomposition_in_entryRuleOrDecomposition1025 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOrDecomposition1032 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrDecomposition__Group__0_in_ruleOrDecomposition1058 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContribution_in_entryRuleContribution1085 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleContribution1092 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Contribution__Alternatives_in_ruleContribution1118 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAndContribution_in_entryRuleAndContribution1145 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAndContribution1152 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndContribution__Group__0_in_ruleAndContribution1178 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrContribution_in_entryRuleOrContribution1205 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOrContribution1212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrContribution__Group__0_in_ruleOrContribution1238 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHelpContribution_in_entryRuleHelpContribution1265 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleHelpContribution1272 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__HelpContribution__Group__0_in_ruleHelpContribution1298 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMakeContribution_in_entryRuleMakeContribution1325 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMakeContribution1332 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MakeContribution__Group__0_in_ruleMakeContribution1358 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHurtContribution_in_entryRuleHurtContribution1385 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleHurtContribution1392 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__HurtContribution__Group__0_in_ruleHurtContribution1418 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBreakContribution_in_entryRuleBreakContribution1445 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBreakContribution1452 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BreakContribution__Group__0_in_ruleBreakContribution1478 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__ContainersAssignment_3_0_in_rule__Model__Alternatives_31514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__IntentionsAssignment_3_1_in_rule__Model__Alternatives_31532 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__DecompositionsAssignment_3_2_in_rule__Model__Alternatives_31550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__DependenciesAssignment_3_3_in_rule__Model__Alternatives_31568 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__ContributionsAssignment_3_4_in_rule__Model__Alternatives_31586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__AssociationsAssignment_3_5_in_rule__Model__Alternatives_31604 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleActor_in_rule__Container__Alternatives1637 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAgent_in_rule__Container__Alternatives1654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRole_in_rule__Container__Alternatives1671 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePosition_in_rule__Container__Alternatives1688 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Actor__Is_aAssignment_2_0_in_rule__Actor__Alternatives_21720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Actor__Is_part_ofAssignment_2_1_in_rule__Actor__Alternatives_21738 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGoal_in_rule__Intention__Alternatives1771 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSoftgoal_in_rule__Intention__Alternatives1788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTask_in_rule__Intention__Alternatives1805 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleResource_in_rule__Intention__Alternatives1822 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBelief_in_rule__Intention__Alternatives1839 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAndDecomposition_in_rule__Decomposition__Alternatives1873 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrDecomposition_in_rule__Decomposition__Alternatives1890 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAndContribution_in_rule__Contribution__Alternatives1922 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrContribution_in_rule__Contribution__Alternatives1939 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHelpContribution_in_rule__Contribution__Alternatives1956 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHurtContribution_in_rule__Contribution__Alternatives1973 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMakeContribution_in_rule__Contribution__Alternatives1990 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBreakContribution_in_rule__Contribution__Alternatives2007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02037 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12098 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__12101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_1__0_in_rule__Model__Group__1__Impl2128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__22159 = new BitSet(new long[]{0x0000000000FF2012L});
        public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__22162 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__Model__Group__2__Impl2190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__32221 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Alternatives_3_in_rule__Model__Group__3__Impl2248 = new BitSet(new long[]{0x0000000000FF2012L});
        public static final BitSet FOLLOW_rule__Model__Group_1__0__Impl_in_rule__Model__Group_1__02287 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Model__Group_1__1_in_rule__Model__Group_1__02290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Model__Group_1__0__Impl2318 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_1__1__Impl_in_rule__Model__Group_1__12349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__NameAssignment_1_1_in_rule__Model__Group_1__1__Impl2376 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Actor__Group__0__Impl_in_rule__Actor__Group__02410 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Actor__Group__1_in_rule__Actor__Group__02413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Actor__Group__0__Impl2441 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Actor__Group__1__Impl_in_rule__Actor__Group__12472 = new BitSet(new long[]{0x0000000000004012L});
        public static final BitSet FOLLOW_rule__Actor__Group__2_in_rule__Actor__Group__12475 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Actor__NameAssignment_1_in_rule__Actor__Group__1__Impl2502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Actor__Group__2__Impl_in_rule__Actor__Group__22532 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_rule__Actor__Group__3_in_rule__Actor__Group__22535 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Actor__Alternatives_2_in_rule__Actor__Group__2__Impl2562 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_rule__Actor__Group__3__Impl_in_rule__Actor__Group__32593 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Actor__Group_3__0_in_rule__Actor__Group__3__Impl2620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Actor__Group_3__0__Impl_in_rule__Actor__Group_3__02659 = new BitSet(new long[]{0x0000000000F88000L});
        public static final BitSet FOLLOW_rule__Actor__Group_3__1_in_rule__Actor__Group_3__02662 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Actor__Group_3__0__Impl2690 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Actor__Group_3__1__Impl_in_rule__Actor__Group_3__12721 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Actor__Group_3__2_in_rule__Actor__Group_3__12724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Actor__IntentionsAssignment_3_1_in_rule__Actor__Group_3__1__Impl2751 = new BitSet(new long[]{0x0000000000F80002L});
        public static final BitSet FOLLOW_rule__Actor__Group_3__2__Impl_in_rule__Actor__Group_3__22782 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Actor__Group_3__2__Impl2810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Agent__Group__0__Impl_in_rule__Agent__Group__02847 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Agent__Group__1_in_rule__Agent__Group__02850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Agent__Group__0__Impl2878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Agent__Group__1__Impl_in_rule__Agent__Group__12909 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_rule__Agent__Group__2_in_rule__Agent__Group__12912 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Agent__NameAssignment_1_in_rule__Agent__Group__1__Impl2939 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Agent__Group__2__Impl_in_rule__Agent__Group__22969 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Agent__Group_2__0_in_rule__Agent__Group__2__Impl2996 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Agent__Group_2__0__Impl_in_rule__Agent__Group_2__03033 = new BitSet(new long[]{0x0000000000F88000L});
        public static final BitSet FOLLOW_rule__Agent__Group_2__1_in_rule__Agent__Group_2__03036 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Agent__Group_2__0__Impl3064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Agent__Group_2__1__Impl_in_rule__Agent__Group_2__13095 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Agent__Group_2__2_in_rule__Agent__Group_2__13098 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Agent__IntentionsAssignment_2_1_in_rule__Agent__Group_2__1__Impl3125 = new BitSet(new long[]{0x0000000000F80002L});
        public static final BitSet FOLLOW_rule__Agent__Group_2__2__Impl_in_rule__Agent__Group_2__23156 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Agent__Group_2__2__Impl3184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__Group__0__Impl_in_rule__Role__Group__03221 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Role__Group__1_in_rule__Role__Group__03224 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Role__Group__0__Impl3252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__Group__1__Impl_in_rule__Role__Group__13283 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_rule__Role__Group__2_in_rule__Role__Group__13286 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__NameAssignment_1_in_rule__Role__Group__1__Impl3313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__Group__2__Impl_in_rule__Role__Group__23343 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__Group_2__0_in_rule__Role__Group__2__Impl3370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__Group_2__0__Impl_in_rule__Role__Group_2__03407 = new BitSet(new long[]{0x0000000000F88000L});
        public static final BitSet FOLLOW_rule__Role__Group_2__1_in_rule__Role__Group_2__03410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Role__Group_2__0__Impl3438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__Group_2__1__Impl_in_rule__Role__Group_2__13469 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Role__Group_2__2_in_rule__Role__Group_2__13472 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__IntentionsAssignment_2_1_in_rule__Role__Group_2__1__Impl3499 = new BitSet(new long[]{0x0000000000F80002L});
        public static final BitSet FOLLOW_rule__Role__Group_2__2__Impl_in_rule__Role__Group_2__23530 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Role__Group_2__2__Impl3558 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Position__Group__0__Impl_in_rule__Position__Group__03595 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Position__Group__1_in_rule__Position__Group__03598 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Position__Group__0__Impl3626 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Position__Group__1__Impl_in_rule__Position__Group__13657 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_rule__Position__Group__2_in_rule__Position__Group__13660 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Position__NameAssignment_1_in_rule__Position__Group__1__Impl3687 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Position__Group__2__Impl_in_rule__Position__Group__23717 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Position__Group_2__0_in_rule__Position__Group__2__Impl3744 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Position__Group_2__0__Impl_in_rule__Position__Group_2__03781 = new BitSet(new long[]{0x0000000000F88000L});
        public static final BitSet FOLLOW_rule__Position__Group_2__1_in_rule__Position__Group_2__03784 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Position__Group_2__0__Impl3812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Position__Group_2__1__Impl_in_rule__Position__Group_2__13843 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Position__Group_2__2_in_rule__Position__Group_2__13846 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Position__IntentionsAssignment_2_1_in_rule__Position__Group_2__1__Impl3873 = new BitSet(new long[]{0x0000000000F80002L});
        public static final BitSet FOLLOW_rule__Position__Group_2__2__Impl_in_rule__Position__Group_2__23904 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Position__Group_2__2__Impl3932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Goal__Group__0__Impl_in_rule__Goal__Group__03969 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Goal__Group__1_in_rule__Goal__Group__03972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Goal__Group__0__Impl4000 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Goal__Group__1__Impl_in_rule__Goal__Group__14031 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_rule__Goal__Group__2_in_rule__Goal__Group__14034 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Goal__NameAssignment_1_in_rule__Goal__Group__1__Impl4061 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Goal__Group__2__Impl_in_rule__Goal__Group__24091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Goal__Group_2__0_in_rule__Goal__Group__2__Impl4118 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Goal__Group_2__0__Impl_in_rule__Goal__Group_2__04155 = new BitSet(new long[]{0x0000000000008010L});
        public static final BitSet FOLLOW_rule__Goal__Group_2__1_in_rule__Goal__Group_2__04158 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Goal__Group_2__0__Impl4186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Goal__Group_2__1__Impl_in_rule__Goal__Group_2__14217 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Goal__Group_2__2_in_rule__Goal__Group_2__14220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Goal__DecompositionsAssignment_2_1_in_rule__Goal__Group_2__1__Impl4247 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_rule__Goal__Group_2__2__Impl_in_rule__Goal__Group_2__24278 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Goal__Group_2__2__Impl4306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Softgoal__Group__0__Impl_in_rule__Softgoal__Group__04343 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Softgoal__Group__1_in_rule__Softgoal__Group__04346 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Softgoal__Group__0__Impl4374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Softgoal__Group__1__Impl_in_rule__Softgoal__Group__14405 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Softgoal__NameAssignment_1_in_rule__Softgoal__Group__1__Impl4432 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Task__Group__0__Impl_in_rule__Task__Group__04466 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Task__Group__1_in_rule__Task__Group__04469 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Task__Group__0__Impl4497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Task__Group__1__Impl_in_rule__Task__Group__14528 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Task__NameAssignment_1_in_rule__Task__Group__1__Impl4555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Resource__Group__0__Impl_in_rule__Resource__Group__04589 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Resource__Group__1_in_rule__Resource__Group__04592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Resource__Group__0__Impl4620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Resource__Group__1__Impl_in_rule__Resource__Group__14651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Resource__NameAssignment_1_in_rule__Resource__Group__1__Impl4678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Belief__Group__0__Impl_in_rule__Belief__Group__04712 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Belief__Group__1_in_rule__Belief__Group__04715 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Belief__Group__0__Impl4743 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Belief__Group__1__Impl_in_rule__Belief__Group__14774 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Belief__NameAssignment_1_in_rule__Belief__Group__1__Impl4801 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Association__Group__0__Impl_in_rule__Association__Group__04835 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__Association__Group__1_in_rule__Association__Group__04838 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Association__SourceAssignment_0_in_rule__Association__Group__0__Impl4865 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Association__Group__1__Impl_in_rule__Association__Group__14895 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Association__Group__2_in_rule__Association__Group__14898 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Association__Group__1__Impl4926 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Association__Group__2__Impl_in_rule__Association__Group__24957 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Association__TargetAssignment_2_in_rule__Association__Group__2__Impl4984 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Dependency__Group__0__Impl_in_rule__Dependency__Group__05020 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Dependency__Group__1_in_rule__Dependency__Group__05023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Dependency__DependencyFromAssignment_0_in_rule__Dependency__Group__0__Impl5050 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Dependency__Group__1__Impl_in_rule__Dependency__Group__15080 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Dependency__Group__2_in_rule__Dependency__Group__15083 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Dependency__Group__1__Impl5111 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Dependency__Group__2__Impl_in_rule__Dependency__Group__25142 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Dependency__DependencyToAssignment_2_in_rule__Dependency__Group__2__Impl5169 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndDecomposition__Group__0__Impl_in_rule__AndDecomposition__Group__05205 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__AndDecomposition__Group__1_in_rule__AndDecomposition__Group__05208 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndDecomposition__TargetAssignment_0_in_rule__AndDecomposition__Group__0__Impl5235 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndDecomposition__Group__1__Impl_in_rule__AndDecomposition__Group__15265 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__AndDecomposition__Group__2_in_rule__AndDecomposition__Group__15268 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__AndDecomposition__Group__1__Impl5296 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndDecomposition__Group__2__Impl_in_rule__AndDecomposition__Group__25327 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndDecomposition__SourceAssignment_2_in_rule__AndDecomposition__Group__2__Impl5354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrDecomposition__Group__0__Impl_in_rule__OrDecomposition__Group__05390 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__OrDecomposition__Group__1_in_rule__OrDecomposition__Group__05393 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrDecomposition__TargetAssignment_0_in_rule__OrDecomposition__Group__0__Impl5420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrDecomposition__Group__1__Impl_in_rule__OrDecomposition__Group__15450 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__OrDecomposition__Group__2_in_rule__OrDecomposition__Group__15453 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__OrDecomposition__Group__1__Impl5481 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrDecomposition__Group__2__Impl_in_rule__OrDecomposition__Group__25512 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrDecomposition__SourceAssignment_2_in_rule__OrDecomposition__Group__2__Impl5539 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndContribution__Group__0__Impl_in_rule__AndContribution__Group__05575 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__AndContribution__Group__1_in_rule__AndContribution__Group__05578 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndContribution__SourceAssignment_0_in_rule__AndContribution__Group__0__Impl5605 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndContribution__Group__1__Impl_in_rule__AndContribution__Group__15635 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__AndContribution__Group__2_in_rule__AndContribution__Group__15638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__AndContribution__Group__1__Impl5666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndContribution__Group__2__Impl_in_rule__AndContribution__Group__25697 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndContribution__TargetAssignment_2_in_rule__AndContribution__Group__2__Impl5724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrContribution__Group__0__Impl_in_rule__OrContribution__Group__05760 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__OrContribution__Group__1_in_rule__OrContribution__Group__05763 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrContribution__SourceAssignment_0_in_rule__OrContribution__Group__0__Impl5790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrContribution__Group__1__Impl_in_rule__OrContribution__Group__15820 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__OrContribution__Group__2_in_rule__OrContribution__Group__15823 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__OrContribution__Group__1__Impl5851 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrContribution__Group__2__Impl_in_rule__OrContribution__Group__25882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrContribution__TargetAssignment_2_in_rule__OrContribution__Group__2__Impl5909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__HelpContribution__Group__0__Impl_in_rule__HelpContribution__Group__05945 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__HelpContribution__Group__1_in_rule__HelpContribution__Group__05948 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__HelpContribution__SourceAssignment_0_in_rule__HelpContribution__Group__0__Impl5975 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__HelpContribution__Group__1__Impl_in_rule__HelpContribution__Group__16005 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__HelpContribution__Group__2_in_rule__HelpContribution__Group__16008 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__HelpContribution__Group__1__Impl6036 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__HelpContribution__Group__2__Impl_in_rule__HelpContribution__Group__26067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__HelpContribution__TargetAssignment_2_in_rule__HelpContribution__Group__2__Impl6094 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MakeContribution__Group__0__Impl_in_rule__MakeContribution__Group__06130 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__MakeContribution__Group__1_in_rule__MakeContribution__Group__06133 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MakeContribution__SourceAssignment_0_in_rule__MakeContribution__Group__0__Impl6160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MakeContribution__Group__1__Impl_in_rule__MakeContribution__Group__16190 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__MakeContribution__Group__2_in_rule__MakeContribution__Group__16193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__MakeContribution__Group__1__Impl6221 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MakeContribution__Group__2__Impl_in_rule__MakeContribution__Group__26252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MakeContribution__TargetAssignment_2_in_rule__MakeContribution__Group__2__Impl6279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__HurtContribution__Group__0__Impl_in_rule__HurtContribution__Group__06315 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__HurtContribution__Group__1_in_rule__HurtContribution__Group__06318 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__HurtContribution__SourceAssignment_0_in_rule__HurtContribution__Group__0__Impl6345 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__HurtContribution__Group__1__Impl_in_rule__HurtContribution__Group__16375 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__HurtContribution__Group__2_in_rule__HurtContribution__Group__16378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__HurtContribution__Group__1__Impl6406 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__HurtContribution__Group__2__Impl_in_rule__HurtContribution__Group__26437 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__HurtContribution__TargetAssignment_2_in_rule__HurtContribution__Group__2__Impl6464 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BreakContribution__Group__0__Impl_in_rule__BreakContribution__Group__06500 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__BreakContribution__Group__1_in_rule__BreakContribution__Group__06503 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BreakContribution__SourceAssignment_0_in_rule__BreakContribution__Group__0__Impl6530 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BreakContribution__Group__1__Impl_in_rule__BreakContribution__Group__16560 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__BreakContribution__Group__2_in_rule__BreakContribution__Group__16563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__BreakContribution__Group__1__Impl6591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BreakContribution__Group__2__Impl_in_rule__BreakContribution__Group__26622 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BreakContribution__TargetAssignment_2_in_rule__BreakContribution__Group__2__Impl6649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Model__NameAssignment_1_16690 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContainer_in_rule__Model__ContainersAssignment_3_06721 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntention_in_rule__Model__IntentionsAssignment_3_16752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDecomposition_in_rule__Model__DecompositionsAssignment_3_26783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDependency_in_rule__Model__DependenciesAssignment_3_36814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContribution_in_rule__Model__ContributionsAssignment_3_46845 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssociation_in_rule__Model__AssociationsAssignment_3_56876 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Actor__NameAssignment_16907 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Actor__Is_aAssignment_2_06942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Actor__Is_part_ofAssignment_2_16981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntention_in_rule__Actor__IntentionsAssignment_3_17016 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Agent__NameAssignment_17047 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntention_in_rule__Agent__IntentionsAssignment_2_17078 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Role__NameAssignment_17109 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntention_in_rule__Role__IntentionsAssignment_2_17140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Position__NameAssignment_17171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntention_in_rule__Position__IntentionsAssignment_2_17202 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Goal__NameAssignment_17233 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Goal__DecompositionsAssignment_2_17268 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Softgoal__NameAssignment_17303 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Task__NameAssignment_17334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Resource__NameAssignment_17365 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Belief__NameAssignment_17396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Association__SourceAssignment_07431 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Association__TargetAssignment_27470 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Dependency__DependencyFromAssignment_07509 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Dependency__DependencyToAssignment_27548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__AndDecomposition__TargetAssignment_07587 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__AndDecomposition__SourceAssignment_27626 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__OrDecomposition__TargetAssignment_07665 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__OrDecomposition__SourceAssignment_27704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__AndContribution__SourceAssignment_07743 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__AndContribution__TargetAssignment_27782 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__OrContribution__SourceAssignment_07821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__OrContribution__TargetAssignment_27860 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__HelpContribution__SourceAssignment_07899 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__HelpContribution__TargetAssignment_27938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__MakeContribution__SourceAssignment_07977 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__MakeContribution__TargetAssignment_28016 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__HurtContribution__SourceAssignment_08055 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__HurtContribution__TargetAssignment_28094 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__BreakContribution__SourceAssignment_08133 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__BreakContribution__TargetAssignment_28172 = new BitSet(new long[]{0x0000000000000002L});
    }


}