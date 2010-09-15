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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'istar'", "':'", "'actor'", "'{'", "'}'", "'agent'", "'role'", "'position'", "'goal'", "'soft'", "'task'", "'resource'", "'belief'", "'~~>'", "'~>'", "'<-(and)-'", "'<-(or)-'", "'-(and)->'", "'-(or)->'", "'-(+)->'", "'-(++)->'", "'-(-)->'", "'-(--)->'"
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


    // $ANTLR start rule__Model__Alternatives_4
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:737:1: rule__Model__Alternatives_4 : ( ( ( rule__Model__ContainersAssignment_4_0 ) ) | ( ( rule__Model__IntentionsAssignment_4_1 ) ) | ( ( rule__Model__DecompositionsAssignment_4_2 ) ) | ( ( rule__Model__DependenciesAssignment_4_3 ) ) | ( ( rule__Model__ContributionsAssignment_4_4 ) ) | ( ( rule__Model__AssociationsAssignment_4_5 ) ) );
    public final void rule__Model__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:741:1: ( ( ( rule__Model__ContainersAssignment_4_0 ) ) | ( ( rule__Model__IntentionsAssignment_4_1 ) ) | ( ( rule__Model__DecompositionsAssignment_4_2 ) ) | ( ( rule__Model__DependenciesAssignment_4_3 ) ) | ( ( rule__Model__ContributionsAssignment_4_4 ) ) | ( ( rule__Model__AssociationsAssignment_4_5 ) ) )
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
                case 26:
                case 27:
                    {
                    alt1=3;
                    }
                    break;
                case 24:
                    {
                    alt1=6;
                    }
                    break;
                case 25:
                    {
                    alt1=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("737:1: rule__Model__Alternatives_4 : ( ( ( rule__Model__ContainersAssignment_4_0 ) ) | ( ( rule__Model__IntentionsAssignment_4_1 ) ) | ( ( rule__Model__DecompositionsAssignment_4_2 ) ) | ( ( rule__Model__DependenciesAssignment_4_3 ) ) | ( ( rule__Model__ContributionsAssignment_4_4 ) ) | ( ( rule__Model__AssociationsAssignment_4_5 ) ) );", 1, 3, input);

                    throw nvae;
                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("737:1: rule__Model__Alternatives_4 : ( ( ( rule__Model__ContainersAssignment_4_0 ) ) | ( ( rule__Model__IntentionsAssignment_4_1 ) ) | ( ( rule__Model__DecompositionsAssignment_4_2 ) ) | ( ( rule__Model__DependenciesAssignment_4_3 ) ) | ( ( rule__Model__ContributionsAssignment_4_4 ) ) | ( ( rule__Model__AssociationsAssignment_4_5 ) ) );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:742:1: ( ( rule__Model__ContainersAssignment_4_0 ) )
                    {
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:742:1: ( ( rule__Model__ContainersAssignment_4_0 ) )
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:743:1: ( rule__Model__ContainersAssignment_4_0 )
                    {
                     before(grammarAccess.getModelAccess().getContainersAssignment_4_0()); 
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:744:1: ( rule__Model__ContainersAssignment_4_0 )
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:744:2: rule__Model__ContainersAssignment_4_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Model__ContainersAssignment_4_0_in_rule__Model__Alternatives_41514);
                    rule__Model__ContainersAssignment_4_0();
                    _fsp--;


                    }

                     after(grammarAccess.getModelAccess().getContainersAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:748:6: ( ( rule__Model__IntentionsAssignment_4_1 ) )
                    {
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:748:6: ( ( rule__Model__IntentionsAssignment_4_1 ) )
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:749:1: ( rule__Model__IntentionsAssignment_4_1 )
                    {
                     before(grammarAccess.getModelAccess().getIntentionsAssignment_4_1()); 
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:750:1: ( rule__Model__IntentionsAssignment_4_1 )
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:750:2: rule__Model__IntentionsAssignment_4_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Model__IntentionsAssignment_4_1_in_rule__Model__Alternatives_41532);
                    rule__Model__IntentionsAssignment_4_1();
                    _fsp--;


                    }

                     after(grammarAccess.getModelAccess().getIntentionsAssignment_4_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:754:6: ( ( rule__Model__DecompositionsAssignment_4_2 ) )
                    {
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:754:6: ( ( rule__Model__DecompositionsAssignment_4_2 ) )
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:755:1: ( rule__Model__DecompositionsAssignment_4_2 )
                    {
                     before(grammarAccess.getModelAccess().getDecompositionsAssignment_4_2()); 
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:756:1: ( rule__Model__DecompositionsAssignment_4_2 )
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:756:2: rule__Model__DecompositionsAssignment_4_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Model__DecompositionsAssignment_4_2_in_rule__Model__Alternatives_41550);
                    rule__Model__DecompositionsAssignment_4_2();
                    _fsp--;


                    }

                     after(grammarAccess.getModelAccess().getDecompositionsAssignment_4_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:760:6: ( ( rule__Model__DependenciesAssignment_4_3 ) )
                    {
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:760:6: ( ( rule__Model__DependenciesAssignment_4_3 ) )
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:761:1: ( rule__Model__DependenciesAssignment_4_3 )
                    {
                     before(grammarAccess.getModelAccess().getDependenciesAssignment_4_3()); 
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:762:1: ( rule__Model__DependenciesAssignment_4_3 )
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:762:2: rule__Model__DependenciesAssignment_4_3
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Model__DependenciesAssignment_4_3_in_rule__Model__Alternatives_41568);
                    rule__Model__DependenciesAssignment_4_3();
                    _fsp--;


                    }

                     after(grammarAccess.getModelAccess().getDependenciesAssignment_4_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:766:6: ( ( rule__Model__ContributionsAssignment_4_4 ) )
                    {
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:766:6: ( ( rule__Model__ContributionsAssignment_4_4 ) )
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:767:1: ( rule__Model__ContributionsAssignment_4_4 )
                    {
                     before(grammarAccess.getModelAccess().getContributionsAssignment_4_4()); 
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:768:1: ( rule__Model__ContributionsAssignment_4_4 )
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:768:2: rule__Model__ContributionsAssignment_4_4
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Model__ContributionsAssignment_4_4_in_rule__Model__Alternatives_41586);
                    rule__Model__ContributionsAssignment_4_4();
                    _fsp--;


                    }

                     after(grammarAccess.getModelAccess().getContributionsAssignment_4_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:772:6: ( ( rule__Model__AssociationsAssignment_4_5 ) )
                    {
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:772:6: ( ( rule__Model__AssociationsAssignment_4_5 ) )
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:773:1: ( rule__Model__AssociationsAssignment_4_5 )
                    {
                     before(grammarAccess.getModelAccess().getAssociationsAssignment_4_5()); 
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:774:1: ( rule__Model__AssociationsAssignment_4_5 )
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:774:2: rule__Model__AssociationsAssignment_4_5
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Model__AssociationsAssignment_4_5_in_rule__Model__Alternatives_41604);
                    rule__Model__AssociationsAssignment_4_5();
                    _fsp--;


                    }

                     after(grammarAccess.getModelAccess().getAssociationsAssignment_4_5()); 

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
    // $ANTLR end rule__Model__Alternatives_4


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
                case 32:
                    {
                    alt6=4;
                    }
                    break;
                case 29:
                    {
                    alt6=2;
                    }
                    break;
                case 33:
                    {
                    alt6=6;
                    }
                    break;
                case 31:
                    {
                    alt6=5;
                    }
                    break;
                case 28:
                    {
                    alt6=1;
                    }
                    break;
                case 30:
                    {
                    alt6=3;
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:994:1: rule__Model__Group__1__Impl : ( 'istar' ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:998:1: ( ( 'istar' ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:999:1: ( 'istar' )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:999:1: ( 'istar' )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1000:1: 'istar'
            {
             before(grammarAccess.getModelAccess().getIstarKeyword_1()); 
            match(input,11,FollowSets000.FOLLOW_11_in_rule__Model__Group__1__Impl2129); 
             after(grammarAccess.getModelAccess().getIstarKeyword_1()); 

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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1013:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1017:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1018:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__22160);
            rule__Model__Group__2__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__3_in_rule__Model__Group__22163);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1025:1: rule__Model__Group__2__Impl : ( ( rule__Model__NameAssignment_2 )? ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1029:1: ( ( ( rule__Model__NameAssignment_2 )? ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1030:1: ( ( rule__Model__NameAssignment_2 )? )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1030:1: ( ( rule__Model__NameAssignment_2 )? )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1031:1: ( rule__Model__NameAssignment_2 )?
            {
             before(grammarAccess.getModelAccess().getNameAssignment_2()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1032:1: ( rule__Model__NameAssignment_2 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1032:2: rule__Model__NameAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Model__NameAssignment_2_in_rule__Model__Group__2__Impl2190);
                    rule__Model__NameAssignment_2();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getNameAssignment_2()); 

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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1042:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1046:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1047:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__32221);
            rule__Model__Group__3__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__4_in_rule__Model__Group__32224);
            rule__Model__Group__4();
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1054:1: rule__Model__Group__3__Impl : ( ':' ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1058:1: ( ( ':' ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1059:1: ( ':' )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1059:1: ( ':' )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1060:1: ':'
            {
             before(grammarAccess.getModelAccess().getColonKeyword_3()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Model__Group__3__Impl2252); 
             after(grammarAccess.getModelAccess().getColonKeyword_3()); 

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


    // $ANTLR start rule__Model__Group__4
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1073:1: rule__Model__Group__4 : rule__Model__Group__4__Impl ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1077:1: ( rule__Model__Group__4__Impl )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1078:2: rule__Model__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__42283);
            rule__Model__Group__4__Impl();
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
    // $ANTLR end rule__Model__Group__4


    // $ANTLR start rule__Model__Group__4__Impl
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1084:1: rule__Model__Group__4__Impl : ( ( rule__Model__Alternatives_4 )* ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1088:1: ( ( ( rule__Model__Alternatives_4 )* ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1089:1: ( ( rule__Model__Alternatives_4 )* )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1089:1: ( ( rule__Model__Alternatives_4 )* )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1090:1: ( rule__Model__Alternatives_4 )*
            {
             before(grammarAccess.getModelAccess().getAlternatives_4()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1091:1: ( rule__Model__Alternatives_4 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||LA8_0==13||(LA8_0>=16 && LA8_0<=23)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1091:2: rule__Model__Alternatives_4
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Model__Alternatives_4_in_rule__Model__Group__4__Impl2310);
            	    rule__Model__Alternatives_4();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getAlternatives_4()); 

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
    // $ANTLR end rule__Model__Group__4__Impl


    // $ANTLR start rule__Actor__Group__0
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1111:1: rule__Actor__Group__0 : rule__Actor__Group__0__Impl rule__Actor__Group__1 ;
    public final void rule__Actor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1115:1: ( rule__Actor__Group__0__Impl rule__Actor__Group__1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1116:2: rule__Actor__Group__0__Impl rule__Actor__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Actor__Group__0__Impl_in_rule__Actor__Group__02351);
            rule__Actor__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Actor__Group__1_in_rule__Actor__Group__02354);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1123:1: rule__Actor__Group__0__Impl : ( 'actor' ) ;
    public final void rule__Actor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1127:1: ( ( 'actor' ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1128:1: ( 'actor' )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1128:1: ( 'actor' )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1129:1: 'actor'
            {
             before(grammarAccess.getActorAccess().getActorKeyword_0()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Actor__Group__0__Impl2382); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1142:1: rule__Actor__Group__1 : rule__Actor__Group__1__Impl rule__Actor__Group__2 ;
    public final void rule__Actor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1146:1: ( rule__Actor__Group__1__Impl rule__Actor__Group__2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1147:2: rule__Actor__Group__1__Impl rule__Actor__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Actor__Group__1__Impl_in_rule__Actor__Group__12413);
            rule__Actor__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Actor__Group__2_in_rule__Actor__Group__12416);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1154:1: rule__Actor__Group__1__Impl : ( ( rule__Actor__NameAssignment_1 ) ) ;
    public final void rule__Actor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1158:1: ( ( ( rule__Actor__NameAssignment_1 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1159:1: ( ( rule__Actor__NameAssignment_1 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1159:1: ( ( rule__Actor__NameAssignment_1 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1160:1: ( rule__Actor__NameAssignment_1 )
            {
             before(grammarAccess.getActorAccess().getNameAssignment_1()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1161:1: ( rule__Actor__NameAssignment_1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1161:2: rule__Actor__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Actor__NameAssignment_1_in_rule__Actor__Group__1__Impl2443);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1171:1: rule__Actor__Group__2 : rule__Actor__Group__2__Impl rule__Actor__Group__3 ;
    public final void rule__Actor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1175:1: ( rule__Actor__Group__2__Impl rule__Actor__Group__3 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1176:2: rule__Actor__Group__2__Impl rule__Actor__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Actor__Group__2__Impl_in_rule__Actor__Group__22473);
            rule__Actor__Group__2__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Actor__Group__3_in_rule__Actor__Group__22476);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1183:1: rule__Actor__Group__2__Impl : ( ( rule__Actor__Alternatives_2 )* ) ;
    public final void rule__Actor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1187:1: ( ( ( rule__Actor__Alternatives_2 )* ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1188:1: ( ( rule__Actor__Alternatives_2 )* )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1188:1: ( ( rule__Actor__Alternatives_2 )* )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1189:1: ( rule__Actor__Alternatives_2 )*
            {
             before(grammarAccess.getActorAccess().getAlternatives_2()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1190:1: ( rule__Actor__Alternatives_2 )*
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
            	    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1190:2: rule__Actor__Alternatives_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Actor__Alternatives_2_in_rule__Actor__Group__2__Impl2503);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1200:1: rule__Actor__Group__3 : rule__Actor__Group__3__Impl ;
    public final void rule__Actor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1204:1: ( rule__Actor__Group__3__Impl )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1205:2: rule__Actor__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Actor__Group__3__Impl_in_rule__Actor__Group__32534);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1211:1: rule__Actor__Group__3__Impl : ( ( rule__Actor__Group_3__0 )? ) ;
    public final void rule__Actor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1215:1: ( ( ( rule__Actor__Group_3__0 )? ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1216:1: ( ( rule__Actor__Group_3__0 )? )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1216:1: ( ( rule__Actor__Group_3__0 )? )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1217:1: ( rule__Actor__Group_3__0 )?
            {
             before(grammarAccess.getActorAccess().getGroup_3()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1218:1: ( rule__Actor__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==14) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1218:2: rule__Actor__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Actor__Group_3__0_in_rule__Actor__Group__3__Impl2561);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1236:1: rule__Actor__Group_3__0 : rule__Actor__Group_3__0__Impl rule__Actor__Group_3__1 ;
    public final void rule__Actor__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1240:1: ( rule__Actor__Group_3__0__Impl rule__Actor__Group_3__1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1241:2: rule__Actor__Group_3__0__Impl rule__Actor__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Actor__Group_3__0__Impl_in_rule__Actor__Group_3__02600);
            rule__Actor__Group_3__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Actor__Group_3__1_in_rule__Actor__Group_3__02603);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1248:1: rule__Actor__Group_3__0__Impl : ( '{' ) ;
    public final void rule__Actor__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1252:1: ( ( '{' ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1253:1: ( '{' )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1253:1: ( '{' )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1254:1: '{'
            {
             before(grammarAccess.getActorAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Actor__Group_3__0__Impl2631); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1267:1: rule__Actor__Group_3__1 : rule__Actor__Group_3__1__Impl rule__Actor__Group_3__2 ;
    public final void rule__Actor__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1271:1: ( rule__Actor__Group_3__1__Impl rule__Actor__Group_3__2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1272:2: rule__Actor__Group_3__1__Impl rule__Actor__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Actor__Group_3__1__Impl_in_rule__Actor__Group_3__12662);
            rule__Actor__Group_3__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Actor__Group_3__2_in_rule__Actor__Group_3__12665);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1279:1: rule__Actor__Group_3__1__Impl : ( ( rule__Actor__IntentionsAssignment_3_1 )* ) ;
    public final void rule__Actor__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1283:1: ( ( ( rule__Actor__IntentionsAssignment_3_1 )* ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1284:1: ( ( rule__Actor__IntentionsAssignment_3_1 )* )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1284:1: ( ( rule__Actor__IntentionsAssignment_3_1 )* )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1285:1: ( rule__Actor__IntentionsAssignment_3_1 )*
            {
             before(grammarAccess.getActorAccess().getIntentionsAssignment_3_1()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1286:1: ( rule__Actor__IntentionsAssignment_3_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=19 && LA11_0<=23)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1286:2: rule__Actor__IntentionsAssignment_3_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Actor__IntentionsAssignment_3_1_in_rule__Actor__Group_3__1__Impl2692);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1296:1: rule__Actor__Group_3__2 : rule__Actor__Group_3__2__Impl ;
    public final void rule__Actor__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1300:1: ( rule__Actor__Group_3__2__Impl )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1301:2: rule__Actor__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Actor__Group_3__2__Impl_in_rule__Actor__Group_3__22723);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1307:1: rule__Actor__Group_3__2__Impl : ( '}' ) ;
    public final void rule__Actor__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1311:1: ( ( '}' ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1312:1: ( '}' )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1312:1: ( '}' )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1313:1: '}'
            {
             before(grammarAccess.getActorAccess().getRightCurlyBracketKeyword_3_2()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Actor__Group_3__2__Impl2751); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1332:1: rule__Agent__Group__0 : rule__Agent__Group__0__Impl rule__Agent__Group__1 ;
    public final void rule__Agent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1336:1: ( rule__Agent__Group__0__Impl rule__Agent__Group__1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1337:2: rule__Agent__Group__0__Impl rule__Agent__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Agent__Group__0__Impl_in_rule__Agent__Group__02788);
            rule__Agent__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Agent__Group__1_in_rule__Agent__Group__02791);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1344:1: rule__Agent__Group__0__Impl : ( 'agent' ) ;
    public final void rule__Agent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1348:1: ( ( 'agent' ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1349:1: ( 'agent' )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1349:1: ( 'agent' )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1350:1: 'agent'
            {
             before(grammarAccess.getAgentAccess().getAgentKeyword_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Agent__Group__0__Impl2819); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1363:1: rule__Agent__Group__1 : rule__Agent__Group__1__Impl rule__Agent__Group__2 ;
    public final void rule__Agent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1367:1: ( rule__Agent__Group__1__Impl rule__Agent__Group__2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1368:2: rule__Agent__Group__1__Impl rule__Agent__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Agent__Group__1__Impl_in_rule__Agent__Group__12850);
            rule__Agent__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Agent__Group__2_in_rule__Agent__Group__12853);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1375:1: rule__Agent__Group__1__Impl : ( ( rule__Agent__NameAssignment_1 ) ) ;
    public final void rule__Agent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1379:1: ( ( ( rule__Agent__NameAssignment_1 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1380:1: ( ( rule__Agent__NameAssignment_1 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1380:1: ( ( rule__Agent__NameAssignment_1 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1381:1: ( rule__Agent__NameAssignment_1 )
            {
             before(grammarAccess.getAgentAccess().getNameAssignment_1()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1382:1: ( rule__Agent__NameAssignment_1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1382:2: rule__Agent__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Agent__NameAssignment_1_in_rule__Agent__Group__1__Impl2880);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1392:1: rule__Agent__Group__2 : rule__Agent__Group__2__Impl ;
    public final void rule__Agent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1396:1: ( rule__Agent__Group__2__Impl )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1397:2: rule__Agent__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Agent__Group__2__Impl_in_rule__Agent__Group__22910);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1403:1: rule__Agent__Group__2__Impl : ( ( rule__Agent__Group_2__0 )? ) ;
    public final void rule__Agent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1407:1: ( ( ( rule__Agent__Group_2__0 )? ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1408:1: ( ( rule__Agent__Group_2__0 )? )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1408:1: ( ( rule__Agent__Group_2__0 )? )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1409:1: ( rule__Agent__Group_2__0 )?
            {
             before(grammarAccess.getAgentAccess().getGroup_2()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1410:1: ( rule__Agent__Group_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==14) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1410:2: rule__Agent__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Agent__Group_2__0_in_rule__Agent__Group__2__Impl2937);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1426:1: rule__Agent__Group_2__0 : rule__Agent__Group_2__0__Impl rule__Agent__Group_2__1 ;
    public final void rule__Agent__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1430:1: ( rule__Agent__Group_2__0__Impl rule__Agent__Group_2__1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1431:2: rule__Agent__Group_2__0__Impl rule__Agent__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Agent__Group_2__0__Impl_in_rule__Agent__Group_2__02974);
            rule__Agent__Group_2__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Agent__Group_2__1_in_rule__Agent__Group_2__02977);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1438:1: rule__Agent__Group_2__0__Impl : ( '{' ) ;
    public final void rule__Agent__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1442:1: ( ( '{' ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1443:1: ( '{' )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1443:1: ( '{' )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1444:1: '{'
            {
             before(grammarAccess.getAgentAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Agent__Group_2__0__Impl3005); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1457:1: rule__Agent__Group_2__1 : rule__Agent__Group_2__1__Impl rule__Agent__Group_2__2 ;
    public final void rule__Agent__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1461:1: ( rule__Agent__Group_2__1__Impl rule__Agent__Group_2__2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1462:2: rule__Agent__Group_2__1__Impl rule__Agent__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Agent__Group_2__1__Impl_in_rule__Agent__Group_2__13036);
            rule__Agent__Group_2__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Agent__Group_2__2_in_rule__Agent__Group_2__13039);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1469:1: rule__Agent__Group_2__1__Impl : ( ( rule__Agent__IntentionsAssignment_2_1 )* ) ;
    public final void rule__Agent__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1473:1: ( ( ( rule__Agent__IntentionsAssignment_2_1 )* ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1474:1: ( ( rule__Agent__IntentionsAssignment_2_1 )* )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1474:1: ( ( rule__Agent__IntentionsAssignment_2_1 )* )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1475:1: ( rule__Agent__IntentionsAssignment_2_1 )*
            {
             before(grammarAccess.getAgentAccess().getIntentionsAssignment_2_1()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1476:1: ( rule__Agent__IntentionsAssignment_2_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=19 && LA13_0<=23)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1476:2: rule__Agent__IntentionsAssignment_2_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Agent__IntentionsAssignment_2_1_in_rule__Agent__Group_2__1__Impl3066);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1486:1: rule__Agent__Group_2__2 : rule__Agent__Group_2__2__Impl ;
    public final void rule__Agent__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1490:1: ( rule__Agent__Group_2__2__Impl )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1491:2: rule__Agent__Group_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Agent__Group_2__2__Impl_in_rule__Agent__Group_2__23097);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1497:1: rule__Agent__Group_2__2__Impl : ( '}' ) ;
    public final void rule__Agent__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1501:1: ( ( '}' ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1502:1: ( '}' )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1502:1: ( '}' )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1503:1: '}'
            {
             before(grammarAccess.getAgentAccess().getRightCurlyBracketKeyword_2_2()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Agent__Group_2__2__Impl3125); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1522:1: rule__Role__Group__0 : rule__Role__Group__0__Impl rule__Role__Group__1 ;
    public final void rule__Role__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1526:1: ( rule__Role__Group__0__Impl rule__Role__Group__1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1527:2: rule__Role__Group__0__Impl rule__Role__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Role__Group__0__Impl_in_rule__Role__Group__03162);
            rule__Role__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Role__Group__1_in_rule__Role__Group__03165);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1534:1: rule__Role__Group__0__Impl : ( 'role' ) ;
    public final void rule__Role__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1538:1: ( ( 'role' ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1539:1: ( 'role' )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1539:1: ( 'role' )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1540:1: 'role'
            {
             before(grammarAccess.getRoleAccess().getRoleKeyword_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Role__Group__0__Impl3193); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1553:1: rule__Role__Group__1 : rule__Role__Group__1__Impl rule__Role__Group__2 ;
    public final void rule__Role__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1557:1: ( rule__Role__Group__1__Impl rule__Role__Group__2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1558:2: rule__Role__Group__1__Impl rule__Role__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Role__Group__1__Impl_in_rule__Role__Group__13224);
            rule__Role__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Role__Group__2_in_rule__Role__Group__13227);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1565:1: rule__Role__Group__1__Impl : ( ( rule__Role__NameAssignment_1 ) ) ;
    public final void rule__Role__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1569:1: ( ( ( rule__Role__NameAssignment_1 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1570:1: ( ( rule__Role__NameAssignment_1 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1570:1: ( ( rule__Role__NameAssignment_1 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1571:1: ( rule__Role__NameAssignment_1 )
            {
             before(grammarAccess.getRoleAccess().getNameAssignment_1()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1572:1: ( rule__Role__NameAssignment_1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1572:2: rule__Role__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Role__NameAssignment_1_in_rule__Role__Group__1__Impl3254);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1582:1: rule__Role__Group__2 : rule__Role__Group__2__Impl ;
    public final void rule__Role__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1586:1: ( rule__Role__Group__2__Impl )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1587:2: rule__Role__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Role__Group__2__Impl_in_rule__Role__Group__23284);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1593:1: rule__Role__Group__2__Impl : ( ( rule__Role__Group_2__0 )? ) ;
    public final void rule__Role__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1597:1: ( ( ( rule__Role__Group_2__0 )? ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1598:1: ( ( rule__Role__Group_2__0 )? )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1598:1: ( ( rule__Role__Group_2__0 )? )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1599:1: ( rule__Role__Group_2__0 )?
            {
             before(grammarAccess.getRoleAccess().getGroup_2()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1600:1: ( rule__Role__Group_2__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==14) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1600:2: rule__Role__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Role__Group_2__0_in_rule__Role__Group__2__Impl3311);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1616:1: rule__Role__Group_2__0 : rule__Role__Group_2__0__Impl rule__Role__Group_2__1 ;
    public final void rule__Role__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1620:1: ( rule__Role__Group_2__0__Impl rule__Role__Group_2__1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1621:2: rule__Role__Group_2__0__Impl rule__Role__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Role__Group_2__0__Impl_in_rule__Role__Group_2__03348);
            rule__Role__Group_2__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Role__Group_2__1_in_rule__Role__Group_2__03351);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1628:1: rule__Role__Group_2__0__Impl : ( '{' ) ;
    public final void rule__Role__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1632:1: ( ( '{' ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1633:1: ( '{' )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1633:1: ( '{' )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1634:1: '{'
            {
             before(grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Role__Group_2__0__Impl3379); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1647:1: rule__Role__Group_2__1 : rule__Role__Group_2__1__Impl rule__Role__Group_2__2 ;
    public final void rule__Role__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1651:1: ( rule__Role__Group_2__1__Impl rule__Role__Group_2__2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1652:2: rule__Role__Group_2__1__Impl rule__Role__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Role__Group_2__1__Impl_in_rule__Role__Group_2__13410);
            rule__Role__Group_2__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Role__Group_2__2_in_rule__Role__Group_2__13413);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1659:1: rule__Role__Group_2__1__Impl : ( ( rule__Role__IntentionsAssignment_2_1 )* ) ;
    public final void rule__Role__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1663:1: ( ( ( rule__Role__IntentionsAssignment_2_1 )* ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1664:1: ( ( rule__Role__IntentionsAssignment_2_1 )* )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1664:1: ( ( rule__Role__IntentionsAssignment_2_1 )* )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1665:1: ( rule__Role__IntentionsAssignment_2_1 )*
            {
             before(grammarAccess.getRoleAccess().getIntentionsAssignment_2_1()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1666:1: ( rule__Role__IntentionsAssignment_2_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=19 && LA15_0<=23)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1666:2: rule__Role__IntentionsAssignment_2_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Role__IntentionsAssignment_2_1_in_rule__Role__Group_2__1__Impl3440);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1676:1: rule__Role__Group_2__2 : rule__Role__Group_2__2__Impl ;
    public final void rule__Role__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1680:1: ( rule__Role__Group_2__2__Impl )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1681:2: rule__Role__Group_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Role__Group_2__2__Impl_in_rule__Role__Group_2__23471);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1687:1: rule__Role__Group_2__2__Impl : ( '}' ) ;
    public final void rule__Role__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1691:1: ( ( '}' ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1692:1: ( '}' )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1692:1: ( '}' )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1693:1: '}'
            {
             before(grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_2_2()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Role__Group_2__2__Impl3499); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1712:1: rule__Position__Group__0 : rule__Position__Group__0__Impl rule__Position__Group__1 ;
    public final void rule__Position__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1716:1: ( rule__Position__Group__0__Impl rule__Position__Group__1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1717:2: rule__Position__Group__0__Impl rule__Position__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Position__Group__0__Impl_in_rule__Position__Group__03536);
            rule__Position__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Position__Group__1_in_rule__Position__Group__03539);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1724:1: rule__Position__Group__0__Impl : ( 'position' ) ;
    public final void rule__Position__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1728:1: ( ( 'position' ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1729:1: ( 'position' )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1729:1: ( 'position' )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1730:1: 'position'
            {
             before(grammarAccess.getPositionAccess().getPositionKeyword_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Position__Group__0__Impl3567); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1743:1: rule__Position__Group__1 : rule__Position__Group__1__Impl rule__Position__Group__2 ;
    public final void rule__Position__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1747:1: ( rule__Position__Group__1__Impl rule__Position__Group__2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1748:2: rule__Position__Group__1__Impl rule__Position__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Position__Group__1__Impl_in_rule__Position__Group__13598);
            rule__Position__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Position__Group__2_in_rule__Position__Group__13601);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1755:1: rule__Position__Group__1__Impl : ( ( rule__Position__NameAssignment_1 ) ) ;
    public final void rule__Position__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1759:1: ( ( ( rule__Position__NameAssignment_1 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1760:1: ( ( rule__Position__NameAssignment_1 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1760:1: ( ( rule__Position__NameAssignment_1 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1761:1: ( rule__Position__NameAssignment_1 )
            {
             before(grammarAccess.getPositionAccess().getNameAssignment_1()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1762:1: ( rule__Position__NameAssignment_1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1762:2: rule__Position__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Position__NameAssignment_1_in_rule__Position__Group__1__Impl3628);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1772:1: rule__Position__Group__2 : rule__Position__Group__2__Impl ;
    public final void rule__Position__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1776:1: ( rule__Position__Group__2__Impl )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1777:2: rule__Position__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Position__Group__2__Impl_in_rule__Position__Group__23658);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1783:1: rule__Position__Group__2__Impl : ( ( rule__Position__Group_2__0 )? ) ;
    public final void rule__Position__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1787:1: ( ( ( rule__Position__Group_2__0 )? ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1788:1: ( ( rule__Position__Group_2__0 )? )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1788:1: ( ( rule__Position__Group_2__0 )? )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1789:1: ( rule__Position__Group_2__0 )?
            {
             before(grammarAccess.getPositionAccess().getGroup_2()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1790:1: ( rule__Position__Group_2__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==14) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1790:2: rule__Position__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Position__Group_2__0_in_rule__Position__Group__2__Impl3685);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1806:1: rule__Position__Group_2__0 : rule__Position__Group_2__0__Impl rule__Position__Group_2__1 ;
    public final void rule__Position__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1810:1: ( rule__Position__Group_2__0__Impl rule__Position__Group_2__1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1811:2: rule__Position__Group_2__0__Impl rule__Position__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Position__Group_2__0__Impl_in_rule__Position__Group_2__03722);
            rule__Position__Group_2__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Position__Group_2__1_in_rule__Position__Group_2__03725);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1818:1: rule__Position__Group_2__0__Impl : ( '{' ) ;
    public final void rule__Position__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1822:1: ( ( '{' ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1823:1: ( '{' )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1823:1: ( '{' )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1824:1: '{'
            {
             before(grammarAccess.getPositionAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Position__Group_2__0__Impl3753); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1837:1: rule__Position__Group_2__1 : rule__Position__Group_2__1__Impl rule__Position__Group_2__2 ;
    public final void rule__Position__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1841:1: ( rule__Position__Group_2__1__Impl rule__Position__Group_2__2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1842:2: rule__Position__Group_2__1__Impl rule__Position__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Position__Group_2__1__Impl_in_rule__Position__Group_2__13784);
            rule__Position__Group_2__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Position__Group_2__2_in_rule__Position__Group_2__13787);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1849:1: rule__Position__Group_2__1__Impl : ( ( rule__Position__IntentionsAssignment_2_1 )* ) ;
    public final void rule__Position__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1853:1: ( ( ( rule__Position__IntentionsAssignment_2_1 )* ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1854:1: ( ( rule__Position__IntentionsAssignment_2_1 )* )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1854:1: ( ( rule__Position__IntentionsAssignment_2_1 )* )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1855:1: ( rule__Position__IntentionsAssignment_2_1 )*
            {
             before(grammarAccess.getPositionAccess().getIntentionsAssignment_2_1()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1856:1: ( rule__Position__IntentionsAssignment_2_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=19 && LA17_0<=23)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1856:2: rule__Position__IntentionsAssignment_2_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Position__IntentionsAssignment_2_1_in_rule__Position__Group_2__1__Impl3814);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1866:1: rule__Position__Group_2__2 : rule__Position__Group_2__2__Impl ;
    public final void rule__Position__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1870:1: ( rule__Position__Group_2__2__Impl )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1871:2: rule__Position__Group_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Position__Group_2__2__Impl_in_rule__Position__Group_2__23845);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1877:1: rule__Position__Group_2__2__Impl : ( '}' ) ;
    public final void rule__Position__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1881:1: ( ( '}' ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1882:1: ( '}' )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1882:1: ( '}' )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1883:1: '}'
            {
             before(grammarAccess.getPositionAccess().getRightCurlyBracketKeyword_2_2()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Position__Group_2__2__Impl3873); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1902:1: rule__Goal__Group__0 : rule__Goal__Group__0__Impl rule__Goal__Group__1 ;
    public final void rule__Goal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1906:1: ( rule__Goal__Group__0__Impl rule__Goal__Group__1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1907:2: rule__Goal__Group__0__Impl rule__Goal__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Goal__Group__0__Impl_in_rule__Goal__Group__03910);
            rule__Goal__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Goal__Group__1_in_rule__Goal__Group__03913);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1914:1: rule__Goal__Group__0__Impl : ( 'goal' ) ;
    public final void rule__Goal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1918:1: ( ( 'goal' ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1919:1: ( 'goal' )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1919:1: ( 'goal' )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1920:1: 'goal'
            {
             before(grammarAccess.getGoalAccess().getGoalKeyword_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Goal__Group__0__Impl3941); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1933:1: rule__Goal__Group__1 : rule__Goal__Group__1__Impl rule__Goal__Group__2 ;
    public final void rule__Goal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1937:1: ( rule__Goal__Group__1__Impl rule__Goal__Group__2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1938:2: rule__Goal__Group__1__Impl rule__Goal__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Goal__Group__1__Impl_in_rule__Goal__Group__13972);
            rule__Goal__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Goal__Group__2_in_rule__Goal__Group__13975);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1945:1: rule__Goal__Group__1__Impl : ( ( rule__Goal__NameAssignment_1 ) ) ;
    public final void rule__Goal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1949:1: ( ( ( rule__Goal__NameAssignment_1 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1950:1: ( ( rule__Goal__NameAssignment_1 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1950:1: ( ( rule__Goal__NameAssignment_1 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1951:1: ( rule__Goal__NameAssignment_1 )
            {
             before(grammarAccess.getGoalAccess().getNameAssignment_1()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1952:1: ( rule__Goal__NameAssignment_1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1952:2: rule__Goal__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Goal__NameAssignment_1_in_rule__Goal__Group__1__Impl4002);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1962:1: rule__Goal__Group__2 : rule__Goal__Group__2__Impl ;
    public final void rule__Goal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1966:1: ( rule__Goal__Group__2__Impl )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1967:2: rule__Goal__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Goal__Group__2__Impl_in_rule__Goal__Group__24032);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1973:1: rule__Goal__Group__2__Impl : ( ( rule__Goal__Group_2__0 )? ) ;
    public final void rule__Goal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1977:1: ( ( ( rule__Goal__Group_2__0 )? ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1978:1: ( ( rule__Goal__Group_2__0 )? )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1978:1: ( ( rule__Goal__Group_2__0 )? )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1979:1: ( rule__Goal__Group_2__0 )?
            {
             before(grammarAccess.getGoalAccess().getGroup_2()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1980:1: ( rule__Goal__Group_2__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==14) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1980:2: rule__Goal__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Goal__Group_2__0_in_rule__Goal__Group__2__Impl4059);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:1996:1: rule__Goal__Group_2__0 : rule__Goal__Group_2__0__Impl rule__Goal__Group_2__1 ;
    public final void rule__Goal__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2000:1: ( rule__Goal__Group_2__0__Impl rule__Goal__Group_2__1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2001:2: rule__Goal__Group_2__0__Impl rule__Goal__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Goal__Group_2__0__Impl_in_rule__Goal__Group_2__04096);
            rule__Goal__Group_2__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Goal__Group_2__1_in_rule__Goal__Group_2__04099);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2008:1: rule__Goal__Group_2__0__Impl : ( '{' ) ;
    public final void rule__Goal__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2012:1: ( ( '{' ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2013:1: ( '{' )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2013:1: ( '{' )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2014:1: '{'
            {
             before(grammarAccess.getGoalAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Goal__Group_2__0__Impl4127); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2027:1: rule__Goal__Group_2__1 : rule__Goal__Group_2__1__Impl rule__Goal__Group_2__2 ;
    public final void rule__Goal__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2031:1: ( rule__Goal__Group_2__1__Impl rule__Goal__Group_2__2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2032:2: rule__Goal__Group_2__1__Impl rule__Goal__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Goal__Group_2__1__Impl_in_rule__Goal__Group_2__14158);
            rule__Goal__Group_2__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Goal__Group_2__2_in_rule__Goal__Group_2__14161);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2039:1: rule__Goal__Group_2__1__Impl : ( ( rule__Goal__DecompositionsAssignment_2_1 )* ) ;
    public final void rule__Goal__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2043:1: ( ( ( rule__Goal__DecompositionsAssignment_2_1 )* ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2044:1: ( ( rule__Goal__DecompositionsAssignment_2_1 )* )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2044:1: ( ( rule__Goal__DecompositionsAssignment_2_1 )* )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2045:1: ( rule__Goal__DecompositionsAssignment_2_1 )*
            {
             before(grammarAccess.getGoalAccess().getDecompositionsAssignment_2_1()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2046:1: ( rule__Goal__DecompositionsAssignment_2_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2046:2: rule__Goal__DecompositionsAssignment_2_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Goal__DecompositionsAssignment_2_1_in_rule__Goal__Group_2__1__Impl4188);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2056:1: rule__Goal__Group_2__2 : rule__Goal__Group_2__2__Impl ;
    public final void rule__Goal__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2060:1: ( rule__Goal__Group_2__2__Impl )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2061:2: rule__Goal__Group_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Goal__Group_2__2__Impl_in_rule__Goal__Group_2__24219);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2067:1: rule__Goal__Group_2__2__Impl : ( '}' ) ;
    public final void rule__Goal__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2071:1: ( ( '}' ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2072:1: ( '}' )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2072:1: ( '}' )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2073:1: '}'
            {
             before(grammarAccess.getGoalAccess().getRightCurlyBracketKeyword_2_2()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Goal__Group_2__2__Impl4247); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2092:1: rule__Softgoal__Group__0 : rule__Softgoal__Group__0__Impl rule__Softgoal__Group__1 ;
    public final void rule__Softgoal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2096:1: ( rule__Softgoal__Group__0__Impl rule__Softgoal__Group__1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2097:2: rule__Softgoal__Group__0__Impl rule__Softgoal__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Softgoal__Group__0__Impl_in_rule__Softgoal__Group__04284);
            rule__Softgoal__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Softgoal__Group__1_in_rule__Softgoal__Group__04287);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2104:1: rule__Softgoal__Group__0__Impl : ( 'soft' ) ;
    public final void rule__Softgoal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2108:1: ( ( 'soft' ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2109:1: ( 'soft' )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2109:1: ( 'soft' )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2110:1: 'soft'
            {
             before(grammarAccess.getSoftgoalAccess().getSoftKeyword_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Softgoal__Group__0__Impl4315); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2123:1: rule__Softgoal__Group__1 : rule__Softgoal__Group__1__Impl ;
    public final void rule__Softgoal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2127:1: ( rule__Softgoal__Group__1__Impl )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2128:2: rule__Softgoal__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Softgoal__Group__1__Impl_in_rule__Softgoal__Group__14346);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2134:1: rule__Softgoal__Group__1__Impl : ( ( rule__Softgoal__NameAssignment_1 ) ) ;
    public final void rule__Softgoal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2138:1: ( ( ( rule__Softgoal__NameAssignment_1 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2139:1: ( ( rule__Softgoal__NameAssignment_1 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2139:1: ( ( rule__Softgoal__NameAssignment_1 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2140:1: ( rule__Softgoal__NameAssignment_1 )
            {
             before(grammarAccess.getSoftgoalAccess().getNameAssignment_1()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2141:1: ( rule__Softgoal__NameAssignment_1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2141:2: rule__Softgoal__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Softgoal__NameAssignment_1_in_rule__Softgoal__Group__1__Impl4373);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2155:1: rule__Task__Group__0 : rule__Task__Group__0__Impl rule__Task__Group__1 ;
    public final void rule__Task__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2159:1: ( rule__Task__Group__0__Impl rule__Task__Group__1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2160:2: rule__Task__Group__0__Impl rule__Task__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Task__Group__0__Impl_in_rule__Task__Group__04407);
            rule__Task__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Task__Group__1_in_rule__Task__Group__04410);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2167:1: rule__Task__Group__0__Impl : ( 'task' ) ;
    public final void rule__Task__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2171:1: ( ( 'task' ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2172:1: ( 'task' )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2172:1: ( 'task' )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2173:1: 'task'
            {
             before(grammarAccess.getTaskAccess().getTaskKeyword_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Task__Group__0__Impl4438); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2186:1: rule__Task__Group__1 : rule__Task__Group__1__Impl ;
    public final void rule__Task__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2190:1: ( rule__Task__Group__1__Impl )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2191:2: rule__Task__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Task__Group__1__Impl_in_rule__Task__Group__14469);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2197:1: rule__Task__Group__1__Impl : ( ( rule__Task__NameAssignment_1 ) ) ;
    public final void rule__Task__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2201:1: ( ( ( rule__Task__NameAssignment_1 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2202:1: ( ( rule__Task__NameAssignment_1 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2202:1: ( ( rule__Task__NameAssignment_1 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2203:1: ( rule__Task__NameAssignment_1 )
            {
             before(grammarAccess.getTaskAccess().getNameAssignment_1()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2204:1: ( rule__Task__NameAssignment_1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2204:2: rule__Task__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Task__NameAssignment_1_in_rule__Task__Group__1__Impl4496);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2218:1: rule__Resource__Group__0 : rule__Resource__Group__0__Impl rule__Resource__Group__1 ;
    public final void rule__Resource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2222:1: ( rule__Resource__Group__0__Impl rule__Resource__Group__1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2223:2: rule__Resource__Group__0__Impl rule__Resource__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Resource__Group__0__Impl_in_rule__Resource__Group__04530);
            rule__Resource__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Resource__Group__1_in_rule__Resource__Group__04533);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2230:1: rule__Resource__Group__0__Impl : ( 'resource' ) ;
    public final void rule__Resource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2234:1: ( ( 'resource' ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2235:1: ( 'resource' )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2235:1: ( 'resource' )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2236:1: 'resource'
            {
             before(grammarAccess.getResourceAccess().getResourceKeyword_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Resource__Group__0__Impl4561); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2249:1: rule__Resource__Group__1 : rule__Resource__Group__1__Impl ;
    public final void rule__Resource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2253:1: ( rule__Resource__Group__1__Impl )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2254:2: rule__Resource__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Resource__Group__1__Impl_in_rule__Resource__Group__14592);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2260:1: rule__Resource__Group__1__Impl : ( ( rule__Resource__NameAssignment_1 ) ) ;
    public final void rule__Resource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2264:1: ( ( ( rule__Resource__NameAssignment_1 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2265:1: ( ( rule__Resource__NameAssignment_1 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2265:1: ( ( rule__Resource__NameAssignment_1 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2266:1: ( rule__Resource__NameAssignment_1 )
            {
             before(grammarAccess.getResourceAccess().getNameAssignment_1()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2267:1: ( rule__Resource__NameAssignment_1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2267:2: rule__Resource__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Resource__NameAssignment_1_in_rule__Resource__Group__1__Impl4619);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2281:1: rule__Belief__Group__0 : rule__Belief__Group__0__Impl rule__Belief__Group__1 ;
    public final void rule__Belief__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2285:1: ( rule__Belief__Group__0__Impl rule__Belief__Group__1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2286:2: rule__Belief__Group__0__Impl rule__Belief__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Belief__Group__0__Impl_in_rule__Belief__Group__04653);
            rule__Belief__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Belief__Group__1_in_rule__Belief__Group__04656);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2293:1: rule__Belief__Group__0__Impl : ( 'belief' ) ;
    public final void rule__Belief__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2297:1: ( ( 'belief' ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2298:1: ( 'belief' )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2298:1: ( 'belief' )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2299:1: 'belief'
            {
             before(grammarAccess.getBeliefAccess().getBeliefKeyword_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Belief__Group__0__Impl4684); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2312:1: rule__Belief__Group__1 : rule__Belief__Group__1__Impl ;
    public final void rule__Belief__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2316:1: ( rule__Belief__Group__1__Impl )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2317:2: rule__Belief__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Belief__Group__1__Impl_in_rule__Belief__Group__14715);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2323:1: rule__Belief__Group__1__Impl : ( ( rule__Belief__NameAssignment_1 ) ) ;
    public final void rule__Belief__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2327:1: ( ( ( rule__Belief__NameAssignment_1 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2328:1: ( ( rule__Belief__NameAssignment_1 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2328:1: ( ( rule__Belief__NameAssignment_1 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2329:1: ( rule__Belief__NameAssignment_1 )
            {
             before(grammarAccess.getBeliefAccess().getNameAssignment_1()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2330:1: ( rule__Belief__NameAssignment_1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2330:2: rule__Belief__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Belief__NameAssignment_1_in_rule__Belief__Group__1__Impl4742);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2344:1: rule__Association__Group__0 : rule__Association__Group__0__Impl rule__Association__Group__1 ;
    public final void rule__Association__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2348:1: ( rule__Association__Group__0__Impl rule__Association__Group__1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2349:2: rule__Association__Group__0__Impl rule__Association__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Association__Group__0__Impl_in_rule__Association__Group__04776);
            rule__Association__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Association__Group__1_in_rule__Association__Group__04779);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2356:1: rule__Association__Group__0__Impl : ( ( rule__Association__SourceAssignment_0 ) ) ;
    public final void rule__Association__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2360:1: ( ( ( rule__Association__SourceAssignment_0 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2361:1: ( ( rule__Association__SourceAssignment_0 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2361:1: ( ( rule__Association__SourceAssignment_0 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2362:1: ( rule__Association__SourceAssignment_0 )
            {
             before(grammarAccess.getAssociationAccess().getSourceAssignment_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2363:1: ( rule__Association__SourceAssignment_0 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2363:2: rule__Association__SourceAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Association__SourceAssignment_0_in_rule__Association__Group__0__Impl4806);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2373:1: rule__Association__Group__1 : rule__Association__Group__1__Impl rule__Association__Group__2 ;
    public final void rule__Association__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2377:1: ( rule__Association__Group__1__Impl rule__Association__Group__2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2378:2: rule__Association__Group__1__Impl rule__Association__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Association__Group__1__Impl_in_rule__Association__Group__14836);
            rule__Association__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Association__Group__2_in_rule__Association__Group__14839);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2385:1: rule__Association__Group__1__Impl : ( '~~>' ) ;
    public final void rule__Association__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2389:1: ( ( '~~>' ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2390:1: ( '~~>' )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2390:1: ( '~~>' )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2391:1: '~~>'
            {
             before(grammarAccess.getAssociationAccess().getTildeTildeGreaterThanSignKeyword_1()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Association__Group__1__Impl4867); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2404:1: rule__Association__Group__2 : rule__Association__Group__2__Impl ;
    public final void rule__Association__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2408:1: ( rule__Association__Group__2__Impl )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2409:2: rule__Association__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Association__Group__2__Impl_in_rule__Association__Group__24898);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2415:1: rule__Association__Group__2__Impl : ( ( rule__Association__TargetAssignment_2 ) ) ;
    public final void rule__Association__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2419:1: ( ( ( rule__Association__TargetAssignment_2 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2420:1: ( ( rule__Association__TargetAssignment_2 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2420:1: ( ( rule__Association__TargetAssignment_2 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2421:1: ( rule__Association__TargetAssignment_2 )
            {
             before(grammarAccess.getAssociationAccess().getTargetAssignment_2()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2422:1: ( rule__Association__TargetAssignment_2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2422:2: rule__Association__TargetAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Association__TargetAssignment_2_in_rule__Association__Group__2__Impl4925);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2438:1: rule__Dependency__Group__0 : rule__Dependency__Group__0__Impl rule__Dependency__Group__1 ;
    public final void rule__Dependency__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2442:1: ( rule__Dependency__Group__0__Impl rule__Dependency__Group__1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2443:2: rule__Dependency__Group__0__Impl rule__Dependency__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Dependency__Group__0__Impl_in_rule__Dependency__Group__04961);
            rule__Dependency__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Dependency__Group__1_in_rule__Dependency__Group__04964);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2450:1: rule__Dependency__Group__0__Impl : ( ( rule__Dependency__DependencyFromAssignment_0 ) ) ;
    public final void rule__Dependency__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2454:1: ( ( ( rule__Dependency__DependencyFromAssignment_0 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2455:1: ( ( rule__Dependency__DependencyFromAssignment_0 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2455:1: ( ( rule__Dependency__DependencyFromAssignment_0 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2456:1: ( rule__Dependency__DependencyFromAssignment_0 )
            {
             before(grammarAccess.getDependencyAccess().getDependencyFromAssignment_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2457:1: ( rule__Dependency__DependencyFromAssignment_0 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2457:2: rule__Dependency__DependencyFromAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Dependency__DependencyFromAssignment_0_in_rule__Dependency__Group__0__Impl4991);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2467:1: rule__Dependency__Group__1 : rule__Dependency__Group__1__Impl rule__Dependency__Group__2 ;
    public final void rule__Dependency__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2471:1: ( rule__Dependency__Group__1__Impl rule__Dependency__Group__2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2472:2: rule__Dependency__Group__1__Impl rule__Dependency__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Dependency__Group__1__Impl_in_rule__Dependency__Group__15021);
            rule__Dependency__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Dependency__Group__2_in_rule__Dependency__Group__15024);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2479:1: rule__Dependency__Group__1__Impl : ( '~>' ) ;
    public final void rule__Dependency__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2483:1: ( ( '~>' ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2484:1: ( '~>' )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2484:1: ( '~>' )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2485:1: '~>'
            {
             before(grammarAccess.getDependencyAccess().getTildeGreaterThanSignKeyword_1()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Dependency__Group__1__Impl5052); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2498:1: rule__Dependency__Group__2 : rule__Dependency__Group__2__Impl ;
    public final void rule__Dependency__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2502:1: ( rule__Dependency__Group__2__Impl )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2503:2: rule__Dependency__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Dependency__Group__2__Impl_in_rule__Dependency__Group__25083);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2509:1: rule__Dependency__Group__2__Impl : ( ( rule__Dependency__DependencyToAssignment_2 ) ) ;
    public final void rule__Dependency__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2513:1: ( ( ( rule__Dependency__DependencyToAssignment_2 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2514:1: ( ( rule__Dependency__DependencyToAssignment_2 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2514:1: ( ( rule__Dependency__DependencyToAssignment_2 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2515:1: ( rule__Dependency__DependencyToAssignment_2 )
            {
             before(grammarAccess.getDependencyAccess().getDependencyToAssignment_2()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2516:1: ( rule__Dependency__DependencyToAssignment_2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2516:2: rule__Dependency__DependencyToAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Dependency__DependencyToAssignment_2_in_rule__Dependency__Group__2__Impl5110);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2532:1: rule__AndDecomposition__Group__0 : rule__AndDecomposition__Group__0__Impl rule__AndDecomposition__Group__1 ;
    public final void rule__AndDecomposition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2536:1: ( rule__AndDecomposition__Group__0__Impl rule__AndDecomposition__Group__1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2537:2: rule__AndDecomposition__Group__0__Impl rule__AndDecomposition__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndDecomposition__Group__0__Impl_in_rule__AndDecomposition__Group__05146);
            rule__AndDecomposition__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AndDecomposition__Group__1_in_rule__AndDecomposition__Group__05149);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2544:1: rule__AndDecomposition__Group__0__Impl : ( ( rule__AndDecomposition__TargetAssignment_0 ) ) ;
    public final void rule__AndDecomposition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2548:1: ( ( ( rule__AndDecomposition__TargetAssignment_0 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2549:1: ( ( rule__AndDecomposition__TargetAssignment_0 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2549:1: ( ( rule__AndDecomposition__TargetAssignment_0 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2550:1: ( rule__AndDecomposition__TargetAssignment_0 )
            {
             before(grammarAccess.getAndDecompositionAccess().getTargetAssignment_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2551:1: ( rule__AndDecomposition__TargetAssignment_0 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2551:2: rule__AndDecomposition__TargetAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndDecomposition__TargetAssignment_0_in_rule__AndDecomposition__Group__0__Impl5176);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2561:1: rule__AndDecomposition__Group__1 : rule__AndDecomposition__Group__1__Impl rule__AndDecomposition__Group__2 ;
    public final void rule__AndDecomposition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2565:1: ( rule__AndDecomposition__Group__1__Impl rule__AndDecomposition__Group__2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2566:2: rule__AndDecomposition__Group__1__Impl rule__AndDecomposition__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndDecomposition__Group__1__Impl_in_rule__AndDecomposition__Group__15206);
            rule__AndDecomposition__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AndDecomposition__Group__2_in_rule__AndDecomposition__Group__15209);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2573:1: rule__AndDecomposition__Group__1__Impl : ( '<-(and)-' ) ;
    public final void rule__AndDecomposition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2577:1: ( ( '<-(and)-' ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2578:1: ( '<-(and)-' )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2578:1: ( '<-(and)-' )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2579:1: '<-(and)-'
            {
             before(grammarAccess.getAndDecompositionAccess().getAndKeyword_1()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__AndDecomposition__Group__1__Impl5237); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2592:1: rule__AndDecomposition__Group__2 : rule__AndDecomposition__Group__2__Impl ;
    public final void rule__AndDecomposition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2596:1: ( rule__AndDecomposition__Group__2__Impl )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2597:2: rule__AndDecomposition__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndDecomposition__Group__2__Impl_in_rule__AndDecomposition__Group__25268);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2603:1: rule__AndDecomposition__Group__2__Impl : ( ( rule__AndDecomposition__SourceAssignment_2 ) ) ;
    public final void rule__AndDecomposition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2607:1: ( ( ( rule__AndDecomposition__SourceAssignment_2 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2608:1: ( ( rule__AndDecomposition__SourceAssignment_2 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2608:1: ( ( rule__AndDecomposition__SourceAssignment_2 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2609:1: ( rule__AndDecomposition__SourceAssignment_2 )
            {
             before(grammarAccess.getAndDecompositionAccess().getSourceAssignment_2()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2610:1: ( rule__AndDecomposition__SourceAssignment_2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2610:2: rule__AndDecomposition__SourceAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndDecomposition__SourceAssignment_2_in_rule__AndDecomposition__Group__2__Impl5295);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2626:1: rule__OrDecomposition__Group__0 : rule__OrDecomposition__Group__0__Impl rule__OrDecomposition__Group__1 ;
    public final void rule__OrDecomposition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2630:1: ( rule__OrDecomposition__Group__0__Impl rule__OrDecomposition__Group__1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2631:2: rule__OrDecomposition__Group__0__Impl rule__OrDecomposition__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrDecomposition__Group__0__Impl_in_rule__OrDecomposition__Group__05331);
            rule__OrDecomposition__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrDecomposition__Group__1_in_rule__OrDecomposition__Group__05334);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2638:1: rule__OrDecomposition__Group__0__Impl : ( ( rule__OrDecomposition__TargetAssignment_0 ) ) ;
    public final void rule__OrDecomposition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2642:1: ( ( ( rule__OrDecomposition__TargetAssignment_0 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2643:1: ( ( rule__OrDecomposition__TargetAssignment_0 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2643:1: ( ( rule__OrDecomposition__TargetAssignment_0 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2644:1: ( rule__OrDecomposition__TargetAssignment_0 )
            {
             before(grammarAccess.getOrDecompositionAccess().getTargetAssignment_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2645:1: ( rule__OrDecomposition__TargetAssignment_0 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2645:2: rule__OrDecomposition__TargetAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrDecomposition__TargetAssignment_0_in_rule__OrDecomposition__Group__0__Impl5361);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2655:1: rule__OrDecomposition__Group__1 : rule__OrDecomposition__Group__1__Impl rule__OrDecomposition__Group__2 ;
    public final void rule__OrDecomposition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2659:1: ( rule__OrDecomposition__Group__1__Impl rule__OrDecomposition__Group__2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2660:2: rule__OrDecomposition__Group__1__Impl rule__OrDecomposition__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrDecomposition__Group__1__Impl_in_rule__OrDecomposition__Group__15391);
            rule__OrDecomposition__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrDecomposition__Group__2_in_rule__OrDecomposition__Group__15394);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2667:1: rule__OrDecomposition__Group__1__Impl : ( '<-(or)-' ) ;
    public final void rule__OrDecomposition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2671:1: ( ( '<-(or)-' ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2672:1: ( '<-(or)-' )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2672:1: ( '<-(or)-' )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2673:1: '<-(or)-'
            {
             before(grammarAccess.getOrDecompositionAccess().getOrKeyword_1()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__OrDecomposition__Group__1__Impl5422); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2686:1: rule__OrDecomposition__Group__2 : rule__OrDecomposition__Group__2__Impl ;
    public final void rule__OrDecomposition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2690:1: ( rule__OrDecomposition__Group__2__Impl )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2691:2: rule__OrDecomposition__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrDecomposition__Group__2__Impl_in_rule__OrDecomposition__Group__25453);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2697:1: rule__OrDecomposition__Group__2__Impl : ( ( rule__OrDecomposition__SourceAssignment_2 ) ) ;
    public final void rule__OrDecomposition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2701:1: ( ( ( rule__OrDecomposition__SourceAssignment_2 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2702:1: ( ( rule__OrDecomposition__SourceAssignment_2 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2702:1: ( ( rule__OrDecomposition__SourceAssignment_2 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2703:1: ( rule__OrDecomposition__SourceAssignment_2 )
            {
             before(grammarAccess.getOrDecompositionAccess().getSourceAssignment_2()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2704:1: ( rule__OrDecomposition__SourceAssignment_2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2704:2: rule__OrDecomposition__SourceAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrDecomposition__SourceAssignment_2_in_rule__OrDecomposition__Group__2__Impl5480);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2720:1: rule__AndContribution__Group__0 : rule__AndContribution__Group__0__Impl rule__AndContribution__Group__1 ;
    public final void rule__AndContribution__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2724:1: ( rule__AndContribution__Group__0__Impl rule__AndContribution__Group__1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2725:2: rule__AndContribution__Group__0__Impl rule__AndContribution__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndContribution__Group__0__Impl_in_rule__AndContribution__Group__05516);
            rule__AndContribution__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AndContribution__Group__1_in_rule__AndContribution__Group__05519);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2732:1: rule__AndContribution__Group__0__Impl : ( ( rule__AndContribution__SourceAssignment_0 ) ) ;
    public final void rule__AndContribution__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2736:1: ( ( ( rule__AndContribution__SourceAssignment_0 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2737:1: ( ( rule__AndContribution__SourceAssignment_0 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2737:1: ( ( rule__AndContribution__SourceAssignment_0 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2738:1: ( rule__AndContribution__SourceAssignment_0 )
            {
             before(grammarAccess.getAndContributionAccess().getSourceAssignment_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2739:1: ( rule__AndContribution__SourceAssignment_0 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2739:2: rule__AndContribution__SourceAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndContribution__SourceAssignment_0_in_rule__AndContribution__Group__0__Impl5546);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2749:1: rule__AndContribution__Group__1 : rule__AndContribution__Group__1__Impl rule__AndContribution__Group__2 ;
    public final void rule__AndContribution__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2753:1: ( rule__AndContribution__Group__1__Impl rule__AndContribution__Group__2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2754:2: rule__AndContribution__Group__1__Impl rule__AndContribution__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndContribution__Group__1__Impl_in_rule__AndContribution__Group__15576);
            rule__AndContribution__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AndContribution__Group__2_in_rule__AndContribution__Group__15579);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2761:1: rule__AndContribution__Group__1__Impl : ( '-(and)->' ) ;
    public final void rule__AndContribution__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2765:1: ( ( '-(and)->' ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2766:1: ( '-(and)->' )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2766:1: ( '-(and)->' )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2767:1: '-(and)->'
            {
             before(grammarAccess.getAndContributionAccess().getAndKeyword_1()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__AndContribution__Group__1__Impl5607); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2780:1: rule__AndContribution__Group__2 : rule__AndContribution__Group__2__Impl ;
    public final void rule__AndContribution__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2784:1: ( rule__AndContribution__Group__2__Impl )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2785:2: rule__AndContribution__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndContribution__Group__2__Impl_in_rule__AndContribution__Group__25638);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2791:1: rule__AndContribution__Group__2__Impl : ( ( rule__AndContribution__TargetAssignment_2 ) ) ;
    public final void rule__AndContribution__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2795:1: ( ( ( rule__AndContribution__TargetAssignment_2 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2796:1: ( ( rule__AndContribution__TargetAssignment_2 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2796:1: ( ( rule__AndContribution__TargetAssignment_2 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2797:1: ( rule__AndContribution__TargetAssignment_2 )
            {
             before(grammarAccess.getAndContributionAccess().getTargetAssignment_2()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2798:1: ( rule__AndContribution__TargetAssignment_2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2798:2: rule__AndContribution__TargetAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndContribution__TargetAssignment_2_in_rule__AndContribution__Group__2__Impl5665);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2814:1: rule__OrContribution__Group__0 : rule__OrContribution__Group__0__Impl rule__OrContribution__Group__1 ;
    public final void rule__OrContribution__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2818:1: ( rule__OrContribution__Group__0__Impl rule__OrContribution__Group__1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2819:2: rule__OrContribution__Group__0__Impl rule__OrContribution__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrContribution__Group__0__Impl_in_rule__OrContribution__Group__05701);
            rule__OrContribution__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrContribution__Group__1_in_rule__OrContribution__Group__05704);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2826:1: rule__OrContribution__Group__0__Impl : ( ( rule__OrContribution__SourceAssignment_0 ) ) ;
    public final void rule__OrContribution__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2830:1: ( ( ( rule__OrContribution__SourceAssignment_0 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2831:1: ( ( rule__OrContribution__SourceAssignment_0 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2831:1: ( ( rule__OrContribution__SourceAssignment_0 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2832:1: ( rule__OrContribution__SourceAssignment_0 )
            {
             before(grammarAccess.getOrContributionAccess().getSourceAssignment_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2833:1: ( rule__OrContribution__SourceAssignment_0 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2833:2: rule__OrContribution__SourceAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrContribution__SourceAssignment_0_in_rule__OrContribution__Group__0__Impl5731);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2843:1: rule__OrContribution__Group__1 : rule__OrContribution__Group__1__Impl rule__OrContribution__Group__2 ;
    public final void rule__OrContribution__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2847:1: ( rule__OrContribution__Group__1__Impl rule__OrContribution__Group__2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2848:2: rule__OrContribution__Group__1__Impl rule__OrContribution__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrContribution__Group__1__Impl_in_rule__OrContribution__Group__15761);
            rule__OrContribution__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrContribution__Group__2_in_rule__OrContribution__Group__15764);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2855:1: rule__OrContribution__Group__1__Impl : ( '-(or)->' ) ;
    public final void rule__OrContribution__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2859:1: ( ( '-(or)->' ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2860:1: ( '-(or)->' )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2860:1: ( '-(or)->' )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2861:1: '-(or)->'
            {
             before(grammarAccess.getOrContributionAccess().getOrKeyword_1()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__OrContribution__Group__1__Impl5792); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2874:1: rule__OrContribution__Group__2 : rule__OrContribution__Group__2__Impl ;
    public final void rule__OrContribution__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2878:1: ( rule__OrContribution__Group__2__Impl )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2879:2: rule__OrContribution__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrContribution__Group__2__Impl_in_rule__OrContribution__Group__25823);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2885:1: rule__OrContribution__Group__2__Impl : ( ( rule__OrContribution__TargetAssignment_2 ) ) ;
    public final void rule__OrContribution__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2889:1: ( ( ( rule__OrContribution__TargetAssignment_2 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2890:1: ( ( rule__OrContribution__TargetAssignment_2 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2890:1: ( ( rule__OrContribution__TargetAssignment_2 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2891:1: ( rule__OrContribution__TargetAssignment_2 )
            {
             before(grammarAccess.getOrContributionAccess().getTargetAssignment_2()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2892:1: ( rule__OrContribution__TargetAssignment_2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2892:2: rule__OrContribution__TargetAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrContribution__TargetAssignment_2_in_rule__OrContribution__Group__2__Impl5850);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2908:1: rule__HelpContribution__Group__0 : rule__HelpContribution__Group__0__Impl rule__HelpContribution__Group__1 ;
    public final void rule__HelpContribution__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2912:1: ( rule__HelpContribution__Group__0__Impl rule__HelpContribution__Group__1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2913:2: rule__HelpContribution__Group__0__Impl rule__HelpContribution__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__HelpContribution__Group__0__Impl_in_rule__HelpContribution__Group__05886);
            rule__HelpContribution__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__HelpContribution__Group__1_in_rule__HelpContribution__Group__05889);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2920:1: rule__HelpContribution__Group__0__Impl : ( ( rule__HelpContribution__SourceAssignment_0 ) ) ;
    public final void rule__HelpContribution__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2924:1: ( ( ( rule__HelpContribution__SourceAssignment_0 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2925:1: ( ( rule__HelpContribution__SourceAssignment_0 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2925:1: ( ( rule__HelpContribution__SourceAssignment_0 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2926:1: ( rule__HelpContribution__SourceAssignment_0 )
            {
             before(grammarAccess.getHelpContributionAccess().getSourceAssignment_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2927:1: ( rule__HelpContribution__SourceAssignment_0 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2927:2: rule__HelpContribution__SourceAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__HelpContribution__SourceAssignment_0_in_rule__HelpContribution__Group__0__Impl5916);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2937:1: rule__HelpContribution__Group__1 : rule__HelpContribution__Group__1__Impl rule__HelpContribution__Group__2 ;
    public final void rule__HelpContribution__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2941:1: ( rule__HelpContribution__Group__1__Impl rule__HelpContribution__Group__2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2942:2: rule__HelpContribution__Group__1__Impl rule__HelpContribution__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__HelpContribution__Group__1__Impl_in_rule__HelpContribution__Group__15946);
            rule__HelpContribution__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__HelpContribution__Group__2_in_rule__HelpContribution__Group__15949);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2949:1: rule__HelpContribution__Group__1__Impl : ( '-(+)->' ) ;
    public final void rule__HelpContribution__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2953:1: ( ( '-(+)->' ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2954:1: ( '-(+)->' )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2954:1: ( '-(+)->' )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2955:1: '-(+)->'
            {
             before(grammarAccess.getHelpContributionAccess().getHyphenMinusLeftParenthesisPlusSignRightParenthesisHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__HelpContribution__Group__1__Impl5977); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2968:1: rule__HelpContribution__Group__2 : rule__HelpContribution__Group__2__Impl ;
    public final void rule__HelpContribution__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2972:1: ( rule__HelpContribution__Group__2__Impl )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2973:2: rule__HelpContribution__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__HelpContribution__Group__2__Impl_in_rule__HelpContribution__Group__26008);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2979:1: rule__HelpContribution__Group__2__Impl : ( ( rule__HelpContribution__TargetAssignment_2 ) ) ;
    public final void rule__HelpContribution__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2983:1: ( ( ( rule__HelpContribution__TargetAssignment_2 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2984:1: ( ( rule__HelpContribution__TargetAssignment_2 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2984:1: ( ( rule__HelpContribution__TargetAssignment_2 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2985:1: ( rule__HelpContribution__TargetAssignment_2 )
            {
             before(grammarAccess.getHelpContributionAccess().getTargetAssignment_2()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2986:1: ( rule__HelpContribution__TargetAssignment_2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:2986:2: rule__HelpContribution__TargetAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__HelpContribution__TargetAssignment_2_in_rule__HelpContribution__Group__2__Impl6035);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3002:1: rule__MakeContribution__Group__0 : rule__MakeContribution__Group__0__Impl rule__MakeContribution__Group__1 ;
    public final void rule__MakeContribution__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3006:1: ( rule__MakeContribution__Group__0__Impl rule__MakeContribution__Group__1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3007:2: rule__MakeContribution__Group__0__Impl rule__MakeContribution__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MakeContribution__Group__0__Impl_in_rule__MakeContribution__Group__06071);
            rule__MakeContribution__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MakeContribution__Group__1_in_rule__MakeContribution__Group__06074);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3014:1: rule__MakeContribution__Group__0__Impl : ( ( rule__MakeContribution__SourceAssignment_0 ) ) ;
    public final void rule__MakeContribution__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3018:1: ( ( ( rule__MakeContribution__SourceAssignment_0 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3019:1: ( ( rule__MakeContribution__SourceAssignment_0 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3019:1: ( ( rule__MakeContribution__SourceAssignment_0 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3020:1: ( rule__MakeContribution__SourceAssignment_0 )
            {
             before(grammarAccess.getMakeContributionAccess().getSourceAssignment_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3021:1: ( rule__MakeContribution__SourceAssignment_0 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3021:2: rule__MakeContribution__SourceAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MakeContribution__SourceAssignment_0_in_rule__MakeContribution__Group__0__Impl6101);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3031:1: rule__MakeContribution__Group__1 : rule__MakeContribution__Group__1__Impl rule__MakeContribution__Group__2 ;
    public final void rule__MakeContribution__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3035:1: ( rule__MakeContribution__Group__1__Impl rule__MakeContribution__Group__2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3036:2: rule__MakeContribution__Group__1__Impl rule__MakeContribution__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MakeContribution__Group__1__Impl_in_rule__MakeContribution__Group__16131);
            rule__MakeContribution__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MakeContribution__Group__2_in_rule__MakeContribution__Group__16134);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3043:1: rule__MakeContribution__Group__1__Impl : ( '-(++)->' ) ;
    public final void rule__MakeContribution__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3047:1: ( ( '-(++)->' ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3048:1: ( '-(++)->' )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3048:1: ( '-(++)->' )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3049:1: '-(++)->'
            {
             before(grammarAccess.getMakeContributionAccess().getHyphenMinusLeftParenthesisPlusSignPlusSignRightParenthesisHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__MakeContribution__Group__1__Impl6162); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3062:1: rule__MakeContribution__Group__2 : rule__MakeContribution__Group__2__Impl ;
    public final void rule__MakeContribution__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3066:1: ( rule__MakeContribution__Group__2__Impl )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3067:2: rule__MakeContribution__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MakeContribution__Group__2__Impl_in_rule__MakeContribution__Group__26193);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3073:1: rule__MakeContribution__Group__2__Impl : ( ( rule__MakeContribution__TargetAssignment_2 ) ) ;
    public final void rule__MakeContribution__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3077:1: ( ( ( rule__MakeContribution__TargetAssignment_2 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3078:1: ( ( rule__MakeContribution__TargetAssignment_2 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3078:1: ( ( rule__MakeContribution__TargetAssignment_2 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3079:1: ( rule__MakeContribution__TargetAssignment_2 )
            {
             before(grammarAccess.getMakeContributionAccess().getTargetAssignment_2()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3080:1: ( rule__MakeContribution__TargetAssignment_2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3080:2: rule__MakeContribution__TargetAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MakeContribution__TargetAssignment_2_in_rule__MakeContribution__Group__2__Impl6220);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3096:1: rule__HurtContribution__Group__0 : rule__HurtContribution__Group__0__Impl rule__HurtContribution__Group__1 ;
    public final void rule__HurtContribution__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3100:1: ( rule__HurtContribution__Group__0__Impl rule__HurtContribution__Group__1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3101:2: rule__HurtContribution__Group__0__Impl rule__HurtContribution__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__HurtContribution__Group__0__Impl_in_rule__HurtContribution__Group__06256);
            rule__HurtContribution__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__HurtContribution__Group__1_in_rule__HurtContribution__Group__06259);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3108:1: rule__HurtContribution__Group__0__Impl : ( ( rule__HurtContribution__SourceAssignment_0 ) ) ;
    public final void rule__HurtContribution__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3112:1: ( ( ( rule__HurtContribution__SourceAssignment_0 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3113:1: ( ( rule__HurtContribution__SourceAssignment_0 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3113:1: ( ( rule__HurtContribution__SourceAssignment_0 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3114:1: ( rule__HurtContribution__SourceAssignment_0 )
            {
             before(grammarAccess.getHurtContributionAccess().getSourceAssignment_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3115:1: ( rule__HurtContribution__SourceAssignment_0 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3115:2: rule__HurtContribution__SourceAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__HurtContribution__SourceAssignment_0_in_rule__HurtContribution__Group__0__Impl6286);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3125:1: rule__HurtContribution__Group__1 : rule__HurtContribution__Group__1__Impl rule__HurtContribution__Group__2 ;
    public final void rule__HurtContribution__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3129:1: ( rule__HurtContribution__Group__1__Impl rule__HurtContribution__Group__2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3130:2: rule__HurtContribution__Group__1__Impl rule__HurtContribution__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__HurtContribution__Group__1__Impl_in_rule__HurtContribution__Group__16316);
            rule__HurtContribution__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__HurtContribution__Group__2_in_rule__HurtContribution__Group__16319);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3137:1: rule__HurtContribution__Group__1__Impl : ( '-(-)->' ) ;
    public final void rule__HurtContribution__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3141:1: ( ( '-(-)->' ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3142:1: ( '-(-)->' )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3142:1: ( '-(-)->' )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3143:1: '-(-)->'
            {
             before(grammarAccess.getHurtContributionAccess().getHyphenMinusLeftParenthesisHyphenMinusRightParenthesisHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__HurtContribution__Group__1__Impl6347); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3156:1: rule__HurtContribution__Group__2 : rule__HurtContribution__Group__2__Impl ;
    public final void rule__HurtContribution__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3160:1: ( rule__HurtContribution__Group__2__Impl )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3161:2: rule__HurtContribution__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__HurtContribution__Group__2__Impl_in_rule__HurtContribution__Group__26378);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3167:1: rule__HurtContribution__Group__2__Impl : ( ( rule__HurtContribution__TargetAssignment_2 ) ) ;
    public final void rule__HurtContribution__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3171:1: ( ( ( rule__HurtContribution__TargetAssignment_2 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3172:1: ( ( rule__HurtContribution__TargetAssignment_2 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3172:1: ( ( rule__HurtContribution__TargetAssignment_2 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3173:1: ( rule__HurtContribution__TargetAssignment_2 )
            {
             before(grammarAccess.getHurtContributionAccess().getTargetAssignment_2()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3174:1: ( rule__HurtContribution__TargetAssignment_2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3174:2: rule__HurtContribution__TargetAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__HurtContribution__TargetAssignment_2_in_rule__HurtContribution__Group__2__Impl6405);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3190:1: rule__BreakContribution__Group__0 : rule__BreakContribution__Group__0__Impl rule__BreakContribution__Group__1 ;
    public final void rule__BreakContribution__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3194:1: ( rule__BreakContribution__Group__0__Impl rule__BreakContribution__Group__1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3195:2: rule__BreakContribution__Group__0__Impl rule__BreakContribution__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BreakContribution__Group__0__Impl_in_rule__BreakContribution__Group__06441);
            rule__BreakContribution__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BreakContribution__Group__1_in_rule__BreakContribution__Group__06444);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3202:1: rule__BreakContribution__Group__0__Impl : ( ( rule__BreakContribution__SourceAssignment_0 ) ) ;
    public final void rule__BreakContribution__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3206:1: ( ( ( rule__BreakContribution__SourceAssignment_0 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3207:1: ( ( rule__BreakContribution__SourceAssignment_0 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3207:1: ( ( rule__BreakContribution__SourceAssignment_0 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3208:1: ( rule__BreakContribution__SourceAssignment_0 )
            {
             before(grammarAccess.getBreakContributionAccess().getSourceAssignment_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3209:1: ( rule__BreakContribution__SourceAssignment_0 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3209:2: rule__BreakContribution__SourceAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__BreakContribution__SourceAssignment_0_in_rule__BreakContribution__Group__0__Impl6471);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3219:1: rule__BreakContribution__Group__1 : rule__BreakContribution__Group__1__Impl rule__BreakContribution__Group__2 ;
    public final void rule__BreakContribution__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3223:1: ( rule__BreakContribution__Group__1__Impl rule__BreakContribution__Group__2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3224:2: rule__BreakContribution__Group__1__Impl rule__BreakContribution__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BreakContribution__Group__1__Impl_in_rule__BreakContribution__Group__16501);
            rule__BreakContribution__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BreakContribution__Group__2_in_rule__BreakContribution__Group__16504);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3231:1: rule__BreakContribution__Group__1__Impl : ( '-(--)->' ) ;
    public final void rule__BreakContribution__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3235:1: ( ( '-(--)->' ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3236:1: ( '-(--)->' )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3236:1: ( '-(--)->' )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3237:1: '-(--)->'
            {
             before(grammarAccess.getBreakContributionAccess().getHyphenMinusLeftParenthesisHyphenMinusHyphenMinusRightParenthesisHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__BreakContribution__Group__1__Impl6532); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3250:1: rule__BreakContribution__Group__2 : rule__BreakContribution__Group__2__Impl ;
    public final void rule__BreakContribution__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3254:1: ( rule__BreakContribution__Group__2__Impl )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3255:2: rule__BreakContribution__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BreakContribution__Group__2__Impl_in_rule__BreakContribution__Group__26563);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3261:1: rule__BreakContribution__Group__2__Impl : ( ( rule__BreakContribution__TargetAssignment_2 ) ) ;
    public final void rule__BreakContribution__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3265:1: ( ( ( rule__BreakContribution__TargetAssignment_2 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3266:1: ( ( rule__BreakContribution__TargetAssignment_2 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3266:1: ( ( rule__BreakContribution__TargetAssignment_2 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3267:1: ( rule__BreakContribution__TargetAssignment_2 )
            {
             before(grammarAccess.getBreakContributionAccess().getTargetAssignment_2()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3268:1: ( rule__BreakContribution__TargetAssignment_2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3268:2: rule__BreakContribution__TargetAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BreakContribution__TargetAssignment_2_in_rule__BreakContribution__Group__2__Impl6590);
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


    // $ANTLR start rule__Model__NameAssignment_2
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3285:1: rule__Model__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Model__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3289:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3290:1: ( RULE_ID )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3290:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3291:1: RULE_ID
            {
             before(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Model__NameAssignment_26631); 
             after(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end rule__Model__NameAssignment_2


    // $ANTLR start rule__Model__ContainersAssignment_4_0
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3300:1: rule__Model__ContainersAssignment_4_0 : ( ruleContainer ) ;
    public final void rule__Model__ContainersAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3304:1: ( ( ruleContainer ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3305:1: ( ruleContainer )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3305:1: ( ruleContainer )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3306:1: ruleContainer
            {
             before(grammarAccess.getModelAccess().getContainersContainerParserRuleCall_4_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleContainer_in_rule__Model__ContainersAssignment_4_06662);
            ruleContainer();
            _fsp--;

             after(grammarAccess.getModelAccess().getContainersContainerParserRuleCall_4_0_0()); 

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
    // $ANTLR end rule__Model__ContainersAssignment_4_0


    // $ANTLR start rule__Model__IntentionsAssignment_4_1
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3315:1: rule__Model__IntentionsAssignment_4_1 : ( ruleIntention ) ;
    public final void rule__Model__IntentionsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3319:1: ( ( ruleIntention ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3320:1: ( ruleIntention )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3320:1: ( ruleIntention )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3321:1: ruleIntention
            {
             before(grammarAccess.getModelAccess().getIntentionsIntentionParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleIntention_in_rule__Model__IntentionsAssignment_4_16693);
            ruleIntention();
            _fsp--;

             after(grammarAccess.getModelAccess().getIntentionsIntentionParserRuleCall_4_1_0()); 

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
    // $ANTLR end rule__Model__IntentionsAssignment_4_1


    // $ANTLR start rule__Model__DecompositionsAssignment_4_2
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3330:1: rule__Model__DecompositionsAssignment_4_2 : ( ruleDecomposition ) ;
    public final void rule__Model__DecompositionsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3334:1: ( ( ruleDecomposition ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3335:1: ( ruleDecomposition )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3335:1: ( ruleDecomposition )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3336:1: ruleDecomposition
            {
             before(grammarAccess.getModelAccess().getDecompositionsDecompositionParserRuleCall_4_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDecomposition_in_rule__Model__DecompositionsAssignment_4_26724);
            ruleDecomposition();
            _fsp--;

             after(grammarAccess.getModelAccess().getDecompositionsDecompositionParserRuleCall_4_2_0()); 

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
    // $ANTLR end rule__Model__DecompositionsAssignment_4_2


    // $ANTLR start rule__Model__DependenciesAssignment_4_3
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3345:1: rule__Model__DependenciesAssignment_4_3 : ( ruleDependency ) ;
    public final void rule__Model__DependenciesAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3349:1: ( ( ruleDependency ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3350:1: ( ruleDependency )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3350:1: ( ruleDependency )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3351:1: ruleDependency
            {
             before(grammarAccess.getModelAccess().getDependenciesDependencyParserRuleCall_4_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDependency_in_rule__Model__DependenciesAssignment_4_36755);
            ruleDependency();
            _fsp--;

             after(grammarAccess.getModelAccess().getDependenciesDependencyParserRuleCall_4_3_0()); 

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
    // $ANTLR end rule__Model__DependenciesAssignment_4_3


    // $ANTLR start rule__Model__ContributionsAssignment_4_4
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3360:1: rule__Model__ContributionsAssignment_4_4 : ( ruleContribution ) ;
    public final void rule__Model__ContributionsAssignment_4_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3364:1: ( ( ruleContribution ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3365:1: ( ruleContribution )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3365:1: ( ruleContribution )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3366:1: ruleContribution
            {
             before(grammarAccess.getModelAccess().getContributionsContributionParserRuleCall_4_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleContribution_in_rule__Model__ContributionsAssignment_4_46786);
            ruleContribution();
            _fsp--;

             after(grammarAccess.getModelAccess().getContributionsContributionParserRuleCall_4_4_0()); 

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
    // $ANTLR end rule__Model__ContributionsAssignment_4_4


    // $ANTLR start rule__Model__AssociationsAssignment_4_5
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3375:1: rule__Model__AssociationsAssignment_4_5 : ( ruleAssociation ) ;
    public final void rule__Model__AssociationsAssignment_4_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3379:1: ( ( ruleAssociation ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3380:1: ( ruleAssociation )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3380:1: ( ruleAssociation )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3381:1: ruleAssociation
            {
             before(grammarAccess.getModelAccess().getAssociationsAssociationParserRuleCall_4_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAssociation_in_rule__Model__AssociationsAssignment_4_56817);
            ruleAssociation();
            _fsp--;

             after(grammarAccess.getModelAccess().getAssociationsAssociationParserRuleCall_4_5_0()); 

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
    // $ANTLR end rule__Model__AssociationsAssignment_4_5


    // $ANTLR start rule__Actor__NameAssignment_1
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3390:1: rule__Actor__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Actor__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3394:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3395:1: ( RULE_ID )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3395:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3396:1: RULE_ID
            {
             before(grammarAccess.getActorAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Actor__NameAssignment_16848); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3405:1: rule__Actor__Is_aAssignment_2_0 : ( ( RULE_ID ) ) ;
    public final void rule__Actor__Is_aAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3409:1: ( ( ( RULE_ID ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3410:1: ( ( RULE_ID ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3410:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3411:1: ( RULE_ID )
            {
             before(grammarAccess.getActorAccess().getIs_aActorCrossReference_2_0_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3412:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3413:1: RULE_ID
            {
             before(grammarAccess.getActorAccess().getIs_aActorIDTerminalRuleCall_2_0_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Actor__Is_aAssignment_2_06883); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3424:1: rule__Actor__Is_part_ofAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Actor__Is_part_ofAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3428:1: ( ( ( RULE_ID ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3429:1: ( ( RULE_ID ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3429:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3430:1: ( RULE_ID )
            {
             before(grammarAccess.getActorAccess().getIs_part_ofActorCrossReference_2_1_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3431:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3432:1: RULE_ID
            {
             before(grammarAccess.getActorAccess().getIs_part_ofActorIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Actor__Is_part_ofAssignment_2_16922); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3443:1: rule__Actor__IntentionsAssignment_3_1 : ( ruleIntention ) ;
    public final void rule__Actor__IntentionsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3447:1: ( ( ruleIntention ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3448:1: ( ruleIntention )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3448:1: ( ruleIntention )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3449:1: ruleIntention
            {
             before(grammarAccess.getActorAccess().getIntentionsIntentionParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleIntention_in_rule__Actor__IntentionsAssignment_3_16957);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3458:1: rule__Agent__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Agent__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3462:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3463:1: ( RULE_ID )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3463:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3464:1: RULE_ID
            {
             before(grammarAccess.getAgentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Agent__NameAssignment_16988); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3473:1: rule__Agent__IntentionsAssignment_2_1 : ( ruleIntention ) ;
    public final void rule__Agent__IntentionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3477:1: ( ( ruleIntention ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3478:1: ( ruleIntention )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3478:1: ( ruleIntention )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3479:1: ruleIntention
            {
             before(grammarAccess.getAgentAccess().getIntentionsIntentionParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleIntention_in_rule__Agent__IntentionsAssignment_2_17019);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3488:1: rule__Role__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Role__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3492:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3493:1: ( RULE_ID )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3493:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3494:1: RULE_ID
            {
             before(grammarAccess.getRoleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Role__NameAssignment_17050); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3503:1: rule__Role__IntentionsAssignment_2_1 : ( ruleIntention ) ;
    public final void rule__Role__IntentionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3507:1: ( ( ruleIntention ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3508:1: ( ruleIntention )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3508:1: ( ruleIntention )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3509:1: ruleIntention
            {
             before(grammarAccess.getRoleAccess().getIntentionsIntentionParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleIntention_in_rule__Role__IntentionsAssignment_2_17081);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3518:1: rule__Position__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Position__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3522:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3523:1: ( RULE_ID )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3523:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3524:1: RULE_ID
            {
             before(grammarAccess.getPositionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Position__NameAssignment_17112); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3533:1: rule__Position__IntentionsAssignment_2_1 : ( ruleIntention ) ;
    public final void rule__Position__IntentionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3537:1: ( ( ruleIntention ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3538:1: ( ruleIntention )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3538:1: ( ruleIntention )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3539:1: ruleIntention
            {
             before(grammarAccess.getPositionAccess().getIntentionsIntentionParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleIntention_in_rule__Position__IntentionsAssignment_2_17143);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3548:1: rule__Goal__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Goal__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3552:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3553:1: ( RULE_ID )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3553:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3554:1: RULE_ID
            {
             before(grammarAccess.getGoalAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Goal__NameAssignment_17174); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3563:1: rule__Goal__DecompositionsAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Goal__DecompositionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3567:1: ( ( ( RULE_ID ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3568:1: ( ( RULE_ID ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3568:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3569:1: ( RULE_ID )
            {
             before(grammarAccess.getGoalAccess().getDecompositionsDecompositionCrossReference_2_1_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3570:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3571:1: RULE_ID
            {
             before(grammarAccess.getGoalAccess().getDecompositionsDecompositionIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Goal__DecompositionsAssignment_2_17209); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3582:1: rule__Softgoal__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Softgoal__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3586:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3587:1: ( RULE_ID )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3587:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3588:1: RULE_ID
            {
             before(grammarAccess.getSoftgoalAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Softgoal__NameAssignment_17244); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3597:1: rule__Task__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Task__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3601:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3602:1: ( RULE_ID )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3602:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3603:1: RULE_ID
            {
             before(grammarAccess.getTaskAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Task__NameAssignment_17275); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3612:1: rule__Resource__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Resource__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3616:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3617:1: ( RULE_ID )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3617:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3618:1: RULE_ID
            {
             before(grammarAccess.getResourceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Resource__NameAssignment_17306); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3627:1: rule__Belief__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Belief__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3631:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3632:1: ( RULE_ID )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3632:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3633:1: RULE_ID
            {
             before(grammarAccess.getBeliefAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Belief__NameAssignment_17337); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3642:1: rule__Association__SourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Association__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3646:1: ( ( ( RULE_ID ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3647:1: ( ( RULE_ID ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3647:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3648:1: ( RULE_ID )
            {
             before(grammarAccess.getAssociationAccess().getSourceContainerCrossReference_0_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3649:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3650:1: RULE_ID
            {
             before(grammarAccess.getAssociationAccess().getSourceContainerIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Association__SourceAssignment_07372); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3661:1: rule__Association__TargetAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Association__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3665:1: ( ( ( RULE_ID ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3666:1: ( ( RULE_ID ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3666:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3667:1: ( RULE_ID )
            {
             before(grammarAccess.getAssociationAccess().getTargetContainerCrossReference_2_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3668:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3669:1: RULE_ID
            {
             before(grammarAccess.getAssociationAccess().getTargetContainerIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Association__TargetAssignment_27411); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3680:1: rule__Dependency__DependencyFromAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Dependency__DependencyFromAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3684:1: ( ( ( RULE_ID ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3685:1: ( ( RULE_ID ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3685:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3686:1: ( RULE_ID )
            {
             before(grammarAccess.getDependencyAccess().getDependencyFromDependableCrossReference_0_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3687:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3688:1: RULE_ID
            {
             before(grammarAccess.getDependencyAccess().getDependencyFromDependableIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Dependency__DependencyFromAssignment_07450); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3699:1: rule__Dependency__DependencyToAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Dependency__DependencyToAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3703:1: ( ( ( RULE_ID ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3704:1: ( ( RULE_ID ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3704:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3705:1: ( RULE_ID )
            {
             before(grammarAccess.getDependencyAccess().getDependencyToDependableCrossReference_2_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3706:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3707:1: RULE_ID
            {
             before(grammarAccess.getDependencyAccess().getDependencyToDependableIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Dependency__DependencyToAssignment_27489); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3718:1: rule__AndDecomposition__TargetAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__AndDecomposition__TargetAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3722:1: ( ( ( RULE_ID ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3723:1: ( ( RULE_ID ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3723:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3724:1: ( RULE_ID )
            {
             before(grammarAccess.getAndDecompositionAccess().getTargetIntentionCrossReference_0_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3725:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3726:1: RULE_ID
            {
             before(grammarAccess.getAndDecompositionAccess().getTargetIntentionIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__AndDecomposition__TargetAssignment_07528); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3737:1: rule__AndDecomposition__SourceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__AndDecomposition__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3741:1: ( ( ( RULE_ID ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3742:1: ( ( RULE_ID ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3742:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3743:1: ( RULE_ID )
            {
             before(grammarAccess.getAndDecompositionAccess().getSourceIntentionCrossReference_2_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3744:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3745:1: RULE_ID
            {
             before(grammarAccess.getAndDecompositionAccess().getSourceIntentionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__AndDecomposition__SourceAssignment_27567); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3756:1: rule__OrDecomposition__TargetAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__OrDecomposition__TargetAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3760:1: ( ( ( RULE_ID ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3761:1: ( ( RULE_ID ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3761:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3762:1: ( RULE_ID )
            {
             before(grammarAccess.getOrDecompositionAccess().getTargetIntentionCrossReference_0_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3763:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3764:1: RULE_ID
            {
             before(grammarAccess.getOrDecompositionAccess().getTargetIntentionIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__OrDecomposition__TargetAssignment_07606); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3775:1: rule__OrDecomposition__SourceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__OrDecomposition__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3779:1: ( ( ( RULE_ID ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3780:1: ( ( RULE_ID ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3780:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3781:1: ( RULE_ID )
            {
             before(grammarAccess.getOrDecompositionAccess().getSourceIntentionCrossReference_2_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3782:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3783:1: RULE_ID
            {
             before(grammarAccess.getOrDecompositionAccess().getSourceIntentionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__OrDecomposition__SourceAssignment_27645); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3794:1: rule__AndContribution__SourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__AndContribution__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3798:1: ( ( ( RULE_ID ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3799:1: ( ( RULE_ID ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3799:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3800:1: ( RULE_ID )
            {
             before(grammarAccess.getAndContributionAccess().getSourceIntentionCrossReference_0_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3801:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3802:1: RULE_ID
            {
             before(grammarAccess.getAndContributionAccess().getSourceIntentionIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__AndContribution__SourceAssignment_07684); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3813:1: rule__AndContribution__TargetAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__AndContribution__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3817:1: ( ( ( RULE_ID ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3818:1: ( ( RULE_ID ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3818:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3819:1: ( RULE_ID )
            {
             before(grammarAccess.getAndContributionAccess().getTargetIntentionCrossReference_2_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3820:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3821:1: RULE_ID
            {
             before(grammarAccess.getAndContributionAccess().getTargetIntentionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__AndContribution__TargetAssignment_27723); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3832:1: rule__OrContribution__SourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__OrContribution__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3836:1: ( ( ( RULE_ID ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3837:1: ( ( RULE_ID ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3837:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3838:1: ( RULE_ID )
            {
             before(grammarAccess.getOrContributionAccess().getSourceIntentionCrossReference_0_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3839:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3840:1: RULE_ID
            {
             before(grammarAccess.getOrContributionAccess().getSourceIntentionIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__OrContribution__SourceAssignment_07762); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3851:1: rule__OrContribution__TargetAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__OrContribution__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3855:1: ( ( ( RULE_ID ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3856:1: ( ( RULE_ID ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3856:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3857:1: ( RULE_ID )
            {
             before(grammarAccess.getOrContributionAccess().getTargetIntentionCrossReference_2_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3858:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3859:1: RULE_ID
            {
             before(grammarAccess.getOrContributionAccess().getTargetIntentionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__OrContribution__TargetAssignment_27801); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3870:1: rule__HelpContribution__SourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__HelpContribution__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3874:1: ( ( ( RULE_ID ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3875:1: ( ( RULE_ID ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3875:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3876:1: ( RULE_ID )
            {
             before(grammarAccess.getHelpContributionAccess().getSourceIntentionCrossReference_0_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3877:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3878:1: RULE_ID
            {
             before(grammarAccess.getHelpContributionAccess().getSourceIntentionIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__HelpContribution__SourceAssignment_07840); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3889:1: rule__HelpContribution__TargetAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__HelpContribution__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3893:1: ( ( ( RULE_ID ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3894:1: ( ( RULE_ID ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3894:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3895:1: ( RULE_ID )
            {
             before(grammarAccess.getHelpContributionAccess().getTargetIntentionCrossReference_2_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3896:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3897:1: RULE_ID
            {
             before(grammarAccess.getHelpContributionAccess().getTargetIntentionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__HelpContribution__TargetAssignment_27879); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3908:1: rule__MakeContribution__SourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__MakeContribution__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3912:1: ( ( ( RULE_ID ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3913:1: ( ( RULE_ID ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3913:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3914:1: ( RULE_ID )
            {
             before(grammarAccess.getMakeContributionAccess().getSourceIntentionCrossReference_0_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3915:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3916:1: RULE_ID
            {
             before(grammarAccess.getMakeContributionAccess().getSourceIntentionIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__MakeContribution__SourceAssignment_07918); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3927:1: rule__MakeContribution__TargetAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__MakeContribution__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3931:1: ( ( ( RULE_ID ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3932:1: ( ( RULE_ID ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3932:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3933:1: ( RULE_ID )
            {
             before(grammarAccess.getMakeContributionAccess().getTargetIntentionCrossReference_2_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3934:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3935:1: RULE_ID
            {
             before(grammarAccess.getMakeContributionAccess().getTargetIntentionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__MakeContribution__TargetAssignment_27957); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3946:1: rule__HurtContribution__SourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__HurtContribution__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3950:1: ( ( ( RULE_ID ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3951:1: ( ( RULE_ID ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3951:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3952:1: ( RULE_ID )
            {
             before(grammarAccess.getHurtContributionAccess().getSourceIntentionCrossReference_0_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3953:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3954:1: RULE_ID
            {
             before(grammarAccess.getHurtContributionAccess().getSourceIntentionIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__HurtContribution__SourceAssignment_07996); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3965:1: rule__HurtContribution__TargetAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__HurtContribution__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3969:1: ( ( ( RULE_ID ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3970:1: ( ( RULE_ID ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3970:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3971:1: ( RULE_ID )
            {
             before(grammarAccess.getHurtContributionAccess().getTargetIntentionCrossReference_2_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3972:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3973:1: RULE_ID
            {
             before(grammarAccess.getHurtContributionAccess().getTargetIntentionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__HurtContribution__TargetAssignment_28035); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3984:1: rule__BreakContribution__SourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__BreakContribution__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3988:1: ( ( ( RULE_ID ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3989:1: ( ( RULE_ID ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3989:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3990:1: ( RULE_ID )
            {
             before(grammarAccess.getBreakContributionAccess().getSourceIntentionCrossReference_0_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3991:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:3992:1: RULE_ID
            {
             before(grammarAccess.getBreakContributionAccess().getSourceIntentionIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__BreakContribution__SourceAssignment_08074); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:4003:1: rule__BreakContribution__TargetAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__BreakContribution__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:4007:1: ( ( ( RULE_ID ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:4008:1: ( ( RULE_ID ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:4008:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:4009:1: ( RULE_ID )
            {
             before(grammarAccess.getBreakContributionAccess().getTargetIntentionCrossReference_2_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:4010:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/ui/contentassist/antlr/internal/InternalIstar.g:4011:1: RULE_ID
            {
             before(grammarAccess.getBreakContributionAccess().getTargetIntentionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__BreakContribution__TargetAssignment_28113); 
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
        public static final BitSet FOLLOW_rule__Model__ContainersAssignment_4_0_in_rule__Model__Alternatives_41514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__IntentionsAssignment_4_1_in_rule__Model__Alternatives_41532 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__DecompositionsAssignment_4_2_in_rule__Model__Alternatives_41550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__DependenciesAssignment_4_3_in_rule__Model__Alternatives_41568 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__ContributionsAssignment_4_4_in_rule__Model__Alternatives_41586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__AssociationsAssignment_4_5_in_rule__Model__Alternatives_41604 = new BitSet(new long[]{0x0000000000000002L});
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
        public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02037 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12098 = new BitSet(new long[]{0x0000000000001010L});
        public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__12101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__Model__Group__1__Impl2129 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__22160 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__22163 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__NameAssignment_2_in_rule__Model__Group__2__Impl2190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__32221 = new BitSet(new long[]{0x0000000000FF2012L});
        public static final BitSet FOLLOW_rule__Model__Group__4_in_rule__Model__Group__32224 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Model__Group__3__Impl2252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__42283 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Alternatives_4_in_rule__Model__Group__4__Impl2310 = new BitSet(new long[]{0x0000000000FF2012L});
        public static final BitSet FOLLOW_rule__Actor__Group__0__Impl_in_rule__Actor__Group__02351 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Actor__Group__1_in_rule__Actor__Group__02354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Actor__Group__0__Impl2382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Actor__Group__1__Impl_in_rule__Actor__Group__12413 = new BitSet(new long[]{0x0000000000004012L});
        public static final BitSet FOLLOW_rule__Actor__Group__2_in_rule__Actor__Group__12416 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Actor__NameAssignment_1_in_rule__Actor__Group__1__Impl2443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Actor__Group__2__Impl_in_rule__Actor__Group__22473 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_rule__Actor__Group__3_in_rule__Actor__Group__22476 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Actor__Alternatives_2_in_rule__Actor__Group__2__Impl2503 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_rule__Actor__Group__3__Impl_in_rule__Actor__Group__32534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Actor__Group_3__0_in_rule__Actor__Group__3__Impl2561 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Actor__Group_3__0__Impl_in_rule__Actor__Group_3__02600 = new BitSet(new long[]{0x0000000000F88000L});
        public static final BitSet FOLLOW_rule__Actor__Group_3__1_in_rule__Actor__Group_3__02603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Actor__Group_3__0__Impl2631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Actor__Group_3__1__Impl_in_rule__Actor__Group_3__12662 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Actor__Group_3__2_in_rule__Actor__Group_3__12665 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Actor__IntentionsAssignment_3_1_in_rule__Actor__Group_3__1__Impl2692 = new BitSet(new long[]{0x0000000000F80002L});
        public static final BitSet FOLLOW_rule__Actor__Group_3__2__Impl_in_rule__Actor__Group_3__22723 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Actor__Group_3__2__Impl2751 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Agent__Group__0__Impl_in_rule__Agent__Group__02788 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Agent__Group__1_in_rule__Agent__Group__02791 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Agent__Group__0__Impl2819 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Agent__Group__1__Impl_in_rule__Agent__Group__12850 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_rule__Agent__Group__2_in_rule__Agent__Group__12853 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Agent__NameAssignment_1_in_rule__Agent__Group__1__Impl2880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Agent__Group__2__Impl_in_rule__Agent__Group__22910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Agent__Group_2__0_in_rule__Agent__Group__2__Impl2937 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Agent__Group_2__0__Impl_in_rule__Agent__Group_2__02974 = new BitSet(new long[]{0x0000000000F88000L});
        public static final BitSet FOLLOW_rule__Agent__Group_2__1_in_rule__Agent__Group_2__02977 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Agent__Group_2__0__Impl3005 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Agent__Group_2__1__Impl_in_rule__Agent__Group_2__13036 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Agent__Group_2__2_in_rule__Agent__Group_2__13039 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Agent__IntentionsAssignment_2_1_in_rule__Agent__Group_2__1__Impl3066 = new BitSet(new long[]{0x0000000000F80002L});
        public static final BitSet FOLLOW_rule__Agent__Group_2__2__Impl_in_rule__Agent__Group_2__23097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Agent__Group_2__2__Impl3125 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__Group__0__Impl_in_rule__Role__Group__03162 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Role__Group__1_in_rule__Role__Group__03165 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Role__Group__0__Impl3193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__Group__1__Impl_in_rule__Role__Group__13224 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_rule__Role__Group__2_in_rule__Role__Group__13227 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__NameAssignment_1_in_rule__Role__Group__1__Impl3254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__Group__2__Impl_in_rule__Role__Group__23284 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__Group_2__0_in_rule__Role__Group__2__Impl3311 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__Group_2__0__Impl_in_rule__Role__Group_2__03348 = new BitSet(new long[]{0x0000000000F88000L});
        public static final BitSet FOLLOW_rule__Role__Group_2__1_in_rule__Role__Group_2__03351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Role__Group_2__0__Impl3379 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__Group_2__1__Impl_in_rule__Role__Group_2__13410 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Role__Group_2__2_in_rule__Role__Group_2__13413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__IntentionsAssignment_2_1_in_rule__Role__Group_2__1__Impl3440 = new BitSet(new long[]{0x0000000000F80002L});
        public static final BitSet FOLLOW_rule__Role__Group_2__2__Impl_in_rule__Role__Group_2__23471 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Role__Group_2__2__Impl3499 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Position__Group__0__Impl_in_rule__Position__Group__03536 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Position__Group__1_in_rule__Position__Group__03539 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Position__Group__0__Impl3567 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Position__Group__1__Impl_in_rule__Position__Group__13598 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_rule__Position__Group__2_in_rule__Position__Group__13601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Position__NameAssignment_1_in_rule__Position__Group__1__Impl3628 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Position__Group__2__Impl_in_rule__Position__Group__23658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Position__Group_2__0_in_rule__Position__Group__2__Impl3685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Position__Group_2__0__Impl_in_rule__Position__Group_2__03722 = new BitSet(new long[]{0x0000000000F88000L});
        public static final BitSet FOLLOW_rule__Position__Group_2__1_in_rule__Position__Group_2__03725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Position__Group_2__0__Impl3753 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Position__Group_2__1__Impl_in_rule__Position__Group_2__13784 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Position__Group_2__2_in_rule__Position__Group_2__13787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Position__IntentionsAssignment_2_1_in_rule__Position__Group_2__1__Impl3814 = new BitSet(new long[]{0x0000000000F80002L});
        public static final BitSet FOLLOW_rule__Position__Group_2__2__Impl_in_rule__Position__Group_2__23845 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Position__Group_2__2__Impl3873 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Goal__Group__0__Impl_in_rule__Goal__Group__03910 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Goal__Group__1_in_rule__Goal__Group__03913 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Goal__Group__0__Impl3941 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Goal__Group__1__Impl_in_rule__Goal__Group__13972 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_rule__Goal__Group__2_in_rule__Goal__Group__13975 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Goal__NameAssignment_1_in_rule__Goal__Group__1__Impl4002 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Goal__Group__2__Impl_in_rule__Goal__Group__24032 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Goal__Group_2__0_in_rule__Goal__Group__2__Impl4059 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Goal__Group_2__0__Impl_in_rule__Goal__Group_2__04096 = new BitSet(new long[]{0x0000000000008010L});
        public static final BitSet FOLLOW_rule__Goal__Group_2__1_in_rule__Goal__Group_2__04099 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Goal__Group_2__0__Impl4127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Goal__Group_2__1__Impl_in_rule__Goal__Group_2__14158 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Goal__Group_2__2_in_rule__Goal__Group_2__14161 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Goal__DecompositionsAssignment_2_1_in_rule__Goal__Group_2__1__Impl4188 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_rule__Goal__Group_2__2__Impl_in_rule__Goal__Group_2__24219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Goal__Group_2__2__Impl4247 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Softgoal__Group__0__Impl_in_rule__Softgoal__Group__04284 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Softgoal__Group__1_in_rule__Softgoal__Group__04287 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Softgoal__Group__0__Impl4315 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Softgoal__Group__1__Impl_in_rule__Softgoal__Group__14346 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Softgoal__NameAssignment_1_in_rule__Softgoal__Group__1__Impl4373 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Task__Group__0__Impl_in_rule__Task__Group__04407 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Task__Group__1_in_rule__Task__Group__04410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Task__Group__0__Impl4438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Task__Group__1__Impl_in_rule__Task__Group__14469 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Task__NameAssignment_1_in_rule__Task__Group__1__Impl4496 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Resource__Group__0__Impl_in_rule__Resource__Group__04530 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Resource__Group__1_in_rule__Resource__Group__04533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Resource__Group__0__Impl4561 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Resource__Group__1__Impl_in_rule__Resource__Group__14592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Resource__NameAssignment_1_in_rule__Resource__Group__1__Impl4619 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Belief__Group__0__Impl_in_rule__Belief__Group__04653 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Belief__Group__1_in_rule__Belief__Group__04656 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Belief__Group__0__Impl4684 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Belief__Group__1__Impl_in_rule__Belief__Group__14715 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Belief__NameAssignment_1_in_rule__Belief__Group__1__Impl4742 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Association__Group__0__Impl_in_rule__Association__Group__04776 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__Association__Group__1_in_rule__Association__Group__04779 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Association__SourceAssignment_0_in_rule__Association__Group__0__Impl4806 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Association__Group__1__Impl_in_rule__Association__Group__14836 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Association__Group__2_in_rule__Association__Group__14839 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Association__Group__1__Impl4867 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Association__Group__2__Impl_in_rule__Association__Group__24898 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Association__TargetAssignment_2_in_rule__Association__Group__2__Impl4925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Dependency__Group__0__Impl_in_rule__Dependency__Group__04961 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Dependency__Group__1_in_rule__Dependency__Group__04964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Dependency__DependencyFromAssignment_0_in_rule__Dependency__Group__0__Impl4991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Dependency__Group__1__Impl_in_rule__Dependency__Group__15021 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Dependency__Group__2_in_rule__Dependency__Group__15024 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Dependency__Group__1__Impl5052 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Dependency__Group__2__Impl_in_rule__Dependency__Group__25083 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Dependency__DependencyToAssignment_2_in_rule__Dependency__Group__2__Impl5110 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndDecomposition__Group__0__Impl_in_rule__AndDecomposition__Group__05146 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__AndDecomposition__Group__1_in_rule__AndDecomposition__Group__05149 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndDecomposition__TargetAssignment_0_in_rule__AndDecomposition__Group__0__Impl5176 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndDecomposition__Group__1__Impl_in_rule__AndDecomposition__Group__15206 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__AndDecomposition__Group__2_in_rule__AndDecomposition__Group__15209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__AndDecomposition__Group__1__Impl5237 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndDecomposition__Group__2__Impl_in_rule__AndDecomposition__Group__25268 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndDecomposition__SourceAssignment_2_in_rule__AndDecomposition__Group__2__Impl5295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrDecomposition__Group__0__Impl_in_rule__OrDecomposition__Group__05331 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__OrDecomposition__Group__1_in_rule__OrDecomposition__Group__05334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrDecomposition__TargetAssignment_0_in_rule__OrDecomposition__Group__0__Impl5361 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrDecomposition__Group__1__Impl_in_rule__OrDecomposition__Group__15391 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__OrDecomposition__Group__2_in_rule__OrDecomposition__Group__15394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__OrDecomposition__Group__1__Impl5422 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrDecomposition__Group__2__Impl_in_rule__OrDecomposition__Group__25453 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrDecomposition__SourceAssignment_2_in_rule__OrDecomposition__Group__2__Impl5480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndContribution__Group__0__Impl_in_rule__AndContribution__Group__05516 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__AndContribution__Group__1_in_rule__AndContribution__Group__05519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndContribution__SourceAssignment_0_in_rule__AndContribution__Group__0__Impl5546 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndContribution__Group__1__Impl_in_rule__AndContribution__Group__15576 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__AndContribution__Group__2_in_rule__AndContribution__Group__15579 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__AndContribution__Group__1__Impl5607 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndContribution__Group__2__Impl_in_rule__AndContribution__Group__25638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndContribution__TargetAssignment_2_in_rule__AndContribution__Group__2__Impl5665 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrContribution__Group__0__Impl_in_rule__OrContribution__Group__05701 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__OrContribution__Group__1_in_rule__OrContribution__Group__05704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrContribution__SourceAssignment_0_in_rule__OrContribution__Group__0__Impl5731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrContribution__Group__1__Impl_in_rule__OrContribution__Group__15761 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__OrContribution__Group__2_in_rule__OrContribution__Group__15764 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__OrContribution__Group__1__Impl5792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrContribution__Group__2__Impl_in_rule__OrContribution__Group__25823 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrContribution__TargetAssignment_2_in_rule__OrContribution__Group__2__Impl5850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__HelpContribution__Group__0__Impl_in_rule__HelpContribution__Group__05886 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__HelpContribution__Group__1_in_rule__HelpContribution__Group__05889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__HelpContribution__SourceAssignment_0_in_rule__HelpContribution__Group__0__Impl5916 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__HelpContribution__Group__1__Impl_in_rule__HelpContribution__Group__15946 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__HelpContribution__Group__2_in_rule__HelpContribution__Group__15949 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__HelpContribution__Group__1__Impl5977 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__HelpContribution__Group__2__Impl_in_rule__HelpContribution__Group__26008 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__HelpContribution__TargetAssignment_2_in_rule__HelpContribution__Group__2__Impl6035 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MakeContribution__Group__0__Impl_in_rule__MakeContribution__Group__06071 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__MakeContribution__Group__1_in_rule__MakeContribution__Group__06074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MakeContribution__SourceAssignment_0_in_rule__MakeContribution__Group__0__Impl6101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MakeContribution__Group__1__Impl_in_rule__MakeContribution__Group__16131 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__MakeContribution__Group__2_in_rule__MakeContribution__Group__16134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__MakeContribution__Group__1__Impl6162 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MakeContribution__Group__2__Impl_in_rule__MakeContribution__Group__26193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MakeContribution__TargetAssignment_2_in_rule__MakeContribution__Group__2__Impl6220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__HurtContribution__Group__0__Impl_in_rule__HurtContribution__Group__06256 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__HurtContribution__Group__1_in_rule__HurtContribution__Group__06259 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__HurtContribution__SourceAssignment_0_in_rule__HurtContribution__Group__0__Impl6286 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__HurtContribution__Group__1__Impl_in_rule__HurtContribution__Group__16316 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__HurtContribution__Group__2_in_rule__HurtContribution__Group__16319 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__HurtContribution__Group__1__Impl6347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__HurtContribution__Group__2__Impl_in_rule__HurtContribution__Group__26378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__HurtContribution__TargetAssignment_2_in_rule__HurtContribution__Group__2__Impl6405 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BreakContribution__Group__0__Impl_in_rule__BreakContribution__Group__06441 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__BreakContribution__Group__1_in_rule__BreakContribution__Group__06444 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BreakContribution__SourceAssignment_0_in_rule__BreakContribution__Group__0__Impl6471 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BreakContribution__Group__1__Impl_in_rule__BreakContribution__Group__16501 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__BreakContribution__Group__2_in_rule__BreakContribution__Group__16504 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__BreakContribution__Group__1__Impl6532 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BreakContribution__Group__2__Impl_in_rule__BreakContribution__Group__26563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BreakContribution__TargetAssignment_2_in_rule__BreakContribution__Group__2__Impl6590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Model__NameAssignment_26631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContainer_in_rule__Model__ContainersAssignment_4_06662 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntention_in_rule__Model__IntentionsAssignment_4_16693 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDecomposition_in_rule__Model__DecompositionsAssignment_4_26724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDependency_in_rule__Model__DependenciesAssignment_4_36755 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContribution_in_rule__Model__ContributionsAssignment_4_46786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssociation_in_rule__Model__AssociationsAssignment_4_56817 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Actor__NameAssignment_16848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Actor__Is_aAssignment_2_06883 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Actor__Is_part_ofAssignment_2_16922 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntention_in_rule__Actor__IntentionsAssignment_3_16957 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Agent__NameAssignment_16988 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntention_in_rule__Agent__IntentionsAssignment_2_17019 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Role__NameAssignment_17050 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntention_in_rule__Role__IntentionsAssignment_2_17081 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Position__NameAssignment_17112 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntention_in_rule__Position__IntentionsAssignment_2_17143 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Goal__NameAssignment_17174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Goal__DecompositionsAssignment_2_17209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Softgoal__NameAssignment_17244 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Task__NameAssignment_17275 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Resource__NameAssignment_17306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Belief__NameAssignment_17337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Association__SourceAssignment_07372 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Association__TargetAssignment_27411 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Dependency__DependencyFromAssignment_07450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Dependency__DependencyToAssignment_27489 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__AndDecomposition__TargetAssignment_07528 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__AndDecomposition__SourceAssignment_27567 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__OrDecomposition__TargetAssignment_07606 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__OrDecomposition__SourceAssignment_27645 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__AndContribution__SourceAssignment_07684 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__AndContribution__TargetAssignment_27723 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__OrContribution__SourceAssignment_07762 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__OrContribution__TargetAssignment_27801 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__HelpContribution__SourceAssignment_07840 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__HelpContribution__TargetAssignment_27879 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__MakeContribution__SourceAssignment_07918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__MakeContribution__TargetAssignment_27957 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__HurtContribution__SourceAssignment_07996 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__HurtContribution__TargetAssignment_28035 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__BreakContribution__SourceAssignment_08074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__BreakContribution__TargetAssignment_28113 = new BitSet(new long[]{0x0000000000000002L});
    }


}