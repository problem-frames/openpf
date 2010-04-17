package uk.ac.open.istar.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import uk.ac.open.istar.services.IstarGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

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
    public String getGrammarFileName() { return "../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g"; }


     
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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:60:16: ( ruleModel EOF )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:61:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel60);
            ruleModel();
            _fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel67); 

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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:68:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:72:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:73:1: ( ( rule__Model__Group__0 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:73:1: ( ( rule__Model__Group__0 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:74:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:75:1: ( rule__Model__Group__0 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:75:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel94);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:87:1: entryRuleContainer : ruleContainer EOF ;
    public final void entryRuleContainer() throws RecognitionException {
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:87:20: ( ruleContainer EOF )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:88:1: ruleContainer EOF
            {
             before(grammarAccess.getContainerRule()); 
            pushFollow(FOLLOW_ruleContainer_in_entryRuleContainer120);
            ruleContainer();
            _fsp--;

             after(grammarAccess.getContainerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContainer127); 

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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:95:1: ruleContainer : ( ( rule__Container__Alternatives ) ) ;
    public final void ruleContainer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:99:2: ( ( ( rule__Container__Alternatives ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:100:1: ( ( rule__Container__Alternatives ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:100:1: ( ( rule__Container__Alternatives ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:101:1: ( rule__Container__Alternatives )
            {
             before(grammarAccess.getContainerAccess().getAlternatives()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:102:1: ( rule__Container__Alternatives )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:102:2: rule__Container__Alternatives
            {
            pushFollow(FOLLOW_rule__Container__Alternatives_in_ruleContainer154);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:114:1: entryRuleActor : ruleActor EOF ;
    public final void entryRuleActor() throws RecognitionException {
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:114:16: ( ruleActor EOF )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:115:1: ruleActor EOF
            {
             before(grammarAccess.getActorRule()); 
            pushFollow(FOLLOW_ruleActor_in_entryRuleActor180);
            ruleActor();
            _fsp--;

             after(grammarAccess.getActorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActor187); 

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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:122:1: ruleActor : ( ( rule__Actor__Group__0 ) ) ;
    public final void ruleActor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:126:2: ( ( ( rule__Actor__Group__0 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:127:1: ( ( rule__Actor__Group__0 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:127:1: ( ( rule__Actor__Group__0 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:128:1: ( rule__Actor__Group__0 )
            {
             before(grammarAccess.getActorAccess().getGroup()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:129:1: ( rule__Actor__Group__0 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:129:2: rule__Actor__Group__0
            {
            pushFollow(FOLLOW_rule__Actor__Group__0_in_ruleActor214);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:141:1: entryRuleAgent : ruleAgent EOF ;
    public final void entryRuleAgent() throws RecognitionException {
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:141:16: ( ruleAgent EOF )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:142:1: ruleAgent EOF
            {
             before(grammarAccess.getAgentRule()); 
            pushFollow(FOLLOW_ruleAgent_in_entryRuleAgent240);
            ruleAgent();
            _fsp--;

             after(grammarAccess.getAgentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAgent247); 

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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:149:1: ruleAgent : ( ( rule__Agent__Group__0 ) ) ;
    public final void ruleAgent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:153:2: ( ( ( rule__Agent__Group__0 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:154:1: ( ( rule__Agent__Group__0 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:154:1: ( ( rule__Agent__Group__0 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:155:1: ( rule__Agent__Group__0 )
            {
             before(grammarAccess.getAgentAccess().getGroup()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:156:1: ( rule__Agent__Group__0 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:156:2: rule__Agent__Group__0
            {
            pushFollow(FOLLOW_rule__Agent__Group__0_in_ruleAgent274);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:168:1: entryRuleRole : ruleRole EOF ;
    public final void entryRuleRole() throws RecognitionException {
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:168:15: ( ruleRole EOF )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:169:1: ruleRole EOF
            {
             before(grammarAccess.getRoleRule()); 
            pushFollow(FOLLOW_ruleRole_in_entryRuleRole300);
            ruleRole();
            _fsp--;

             after(grammarAccess.getRoleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRole307); 

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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:176:1: ruleRole : ( ( rule__Role__Group__0 ) ) ;
    public final void ruleRole() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:180:2: ( ( ( rule__Role__Group__0 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:181:1: ( ( rule__Role__Group__0 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:181:1: ( ( rule__Role__Group__0 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:182:1: ( rule__Role__Group__0 )
            {
             before(grammarAccess.getRoleAccess().getGroup()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:183:1: ( rule__Role__Group__0 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:183:2: rule__Role__Group__0
            {
            pushFollow(FOLLOW_rule__Role__Group__0_in_ruleRole334);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:195:1: entryRulePosition : rulePosition EOF ;
    public final void entryRulePosition() throws RecognitionException {
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:195:19: ( rulePosition EOF )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:196:1: rulePosition EOF
            {
             before(grammarAccess.getPositionRule()); 
            pushFollow(FOLLOW_rulePosition_in_entryRulePosition360);
            rulePosition();
            _fsp--;

             after(grammarAccess.getPositionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePosition367); 

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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:203:1: rulePosition : ( ( rule__Position__Group__0 ) ) ;
    public final void rulePosition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:207:2: ( ( ( rule__Position__Group__0 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:208:1: ( ( rule__Position__Group__0 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:208:1: ( ( rule__Position__Group__0 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:209:1: ( rule__Position__Group__0 )
            {
             before(grammarAccess.getPositionAccess().getGroup()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:210:1: ( rule__Position__Group__0 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:210:2: rule__Position__Group__0
            {
            pushFollow(FOLLOW_rule__Position__Group__0_in_rulePosition394);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:222:1: entryRuleIntention : ruleIntention EOF ;
    public final void entryRuleIntention() throws RecognitionException {
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:222:20: ( ruleIntention EOF )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:223:1: ruleIntention EOF
            {
             before(grammarAccess.getIntentionRule()); 
            pushFollow(FOLLOW_ruleIntention_in_entryRuleIntention420);
            ruleIntention();
            _fsp--;

             after(grammarAccess.getIntentionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntention427); 

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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:230:1: ruleIntention : ( ( rule__Intention__Alternatives ) ) ;
    public final void ruleIntention() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:234:2: ( ( ( rule__Intention__Alternatives ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:235:1: ( ( rule__Intention__Alternatives ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:235:1: ( ( rule__Intention__Alternatives ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:236:1: ( rule__Intention__Alternatives )
            {
             before(grammarAccess.getIntentionAccess().getAlternatives()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:237:1: ( rule__Intention__Alternatives )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:237:2: rule__Intention__Alternatives
            {
            pushFollow(FOLLOW_rule__Intention__Alternatives_in_ruleIntention454);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:249:1: entryRuleGoal : ruleGoal EOF ;
    public final void entryRuleGoal() throws RecognitionException {
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:249:15: ( ruleGoal EOF )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:250:1: ruleGoal EOF
            {
             before(grammarAccess.getGoalRule()); 
            pushFollow(FOLLOW_ruleGoal_in_entryRuleGoal480);
            ruleGoal();
            _fsp--;

             after(grammarAccess.getGoalRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoal487); 

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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:257:1: ruleGoal : ( ( rule__Goal__Group__0 ) ) ;
    public final void ruleGoal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:261:2: ( ( ( rule__Goal__Group__0 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:262:1: ( ( rule__Goal__Group__0 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:262:1: ( ( rule__Goal__Group__0 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:263:1: ( rule__Goal__Group__0 )
            {
             before(grammarAccess.getGoalAccess().getGroup()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:264:1: ( rule__Goal__Group__0 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:264:2: rule__Goal__Group__0
            {
            pushFollow(FOLLOW_rule__Goal__Group__0_in_ruleGoal514);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:276:1: entryRuleSoftgoal : ruleSoftgoal EOF ;
    public final void entryRuleSoftgoal() throws RecognitionException {
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:276:19: ( ruleSoftgoal EOF )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:277:1: ruleSoftgoal EOF
            {
             before(grammarAccess.getSoftgoalRule()); 
            pushFollow(FOLLOW_ruleSoftgoal_in_entryRuleSoftgoal540);
            ruleSoftgoal();
            _fsp--;

             after(grammarAccess.getSoftgoalRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSoftgoal547); 

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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:284:1: ruleSoftgoal : ( ( rule__Softgoal__Group__0 ) ) ;
    public final void ruleSoftgoal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:288:2: ( ( ( rule__Softgoal__Group__0 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:289:1: ( ( rule__Softgoal__Group__0 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:289:1: ( ( rule__Softgoal__Group__0 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:290:1: ( rule__Softgoal__Group__0 )
            {
             before(grammarAccess.getSoftgoalAccess().getGroup()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:291:1: ( rule__Softgoal__Group__0 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:291:2: rule__Softgoal__Group__0
            {
            pushFollow(FOLLOW_rule__Softgoal__Group__0_in_ruleSoftgoal574);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:303:1: entryRuleTask : ruleTask EOF ;
    public final void entryRuleTask() throws RecognitionException {
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:303:15: ( ruleTask EOF )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:304:1: ruleTask EOF
            {
             before(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_ruleTask_in_entryRuleTask600);
            ruleTask();
            _fsp--;

             after(grammarAccess.getTaskRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTask607); 

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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:311:1: ruleTask : ( ( rule__Task__Group__0 ) ) ;
    public final void ruleTask() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:315:2: ( ( ( rule__Task__Group__0 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:316:1: ( ( rule__Task__Group__0 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:316:1: ( ( rule__Task__Group__0 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:317:1: ( rule__Task__Group__0 )
            {
             before(grammarAccess.getTaskAccess().getGroup()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:318:1: ( rule__Task__Group__0 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:318:2: rule__Task__Group__0
            {
            pushFollow(FOLLOW_rule__Task__Group__0_in_ruleTask634);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:330:1: entryRuleResource : ruleResource EOF ;
    public final void entryRuleResource() throws RecognitionException {
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:330:19: ( ruleResource EOF )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:331:1: ruleResource EOF
            {
             before(grammarAccess.getResourceRule()); 
            pushFollow(FOLLOW_ruleResource_in_entryRuleResource660);
            ruleResource();
            _fsp--;

             after(grammarAccess.getResourceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResource667); 

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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:338:1: ruleResource : ( ( rule__Resource__Group__0 ) ) ;
    public final void ruleResource() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:342:2: ( ( ( rule__Resource__Group__0 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:343:1: ( ( rule__Resource__Group__0 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:343:1: ( ( rule__Resource__Group__0 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:344:1: ( rule__Resource__Group__0 )
            {
             before(grammarAccess.getResourceAccess().getGroup()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:345:1: ( rule__Resource__Group__0 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:345:2: rule__Resource__Group__0
            {
            pushFollow(FOLLOW_rule__Resource__Group__0_in_ruleResource694);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:357:1: entryRuleBelief : ruleBelief EOF ;
    public final void entryRuleBelief() throws RecognitionException {
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:357:17: ( ruleBelief EOF )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:358:1: ruleBelief EOF
            {
             before(grammarAccess.getBeliefRule()); 
            pushFollow(FOLLOW_ruleBelief_in_entryRuleBelief720);
            ruleBelief();
            _fsp--;

             after(grammarAccess.getBeliefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBelief727); 

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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:365:1: ruleBelief : ( ( rule__Belief__Group__0 ) ) ;
    public final void ruleBelief() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:369:2: ( ( ( rule__Belief__Group__0 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:370:1: ( ( rule__Belief__Group__0 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:370:1: ( ( rule__Belief__Group__0 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:371:1: ( rule__Belief__Group__0 )
            {
             before(grammarAccess.getBeliefAccess().getGroup()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:372:1: ( rule__Belief__Group__0 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:372:2: rule__Belief__Group__0
            {
            pushFollow(FOLLOW_rule__Belief__Group__0_in_ruleBelief754);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:388:1: entryRuleAssociation : ruleAssociation EOF ;
    public final void entryRuleAssociation() throws RecognitionException {
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:388:22: ( ruleAssociation EOF )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:389:1: ruleAssociation EOF
            {
             before(grammarAccess.getAssociationRule()); 
            pushFollow(FOLLOW_ruleAssociation_in_entryRuleAssociation784);
            ruleAssociation();
            _fsp--;

             after(grammarAccess.getAssociationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssociation791); 

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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:396:1: ruleAssociation : ( ( rule__Association__Group__0 ) ) ;
    public final void ruleAssociation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:400:2: ( ( ( rule__Association__Group__0 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:401:1: ( ( rule__Association__Group__0 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:401:1: ( ( rule__Association__Group__0 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:402:1: ( rule__Association__Group__0 )
            {
             before(grammarAccess.getAssociationAccess().getGroup()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:403:1: ( rule__Association__Group__0 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:403:2: rule__Association__Group__0
            {
            pushFollow(FOLLOW_rule__Association__Group__0_in_ruleAssociation818);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:415:1: entryRuleDependency : ruleDependency EOF ;
    public final void entryRuleDependency() throws RecognitionException {
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:415:21: ( ruleDependency EOF )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:416:1: ruleDependency EOF
            {
             before(grammarAccess.getDependencyRule()); 
            pushFollow(FOLLOW_ruleDependency_in_entryRuleDependency844);
            ruleDependency();
            _fsp--;

             after(grammarAccess.getDependencyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependency851); 

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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:423:1: ruleDependency : ( ( rule__Dependency__Group__0 ) ) ;
    public final void ruleDependency() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:427:2: ( ( ( rule__Dependency__Group__0 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:428:1: ( ( rule__Dependency__Group__0 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:428:1: ( ( rule__Dependency__Group__0 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:429:1: ( rule__Dependency__Group__0 )
            {
             before(grammarAccess.getDependencyAccess().getGroup()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:430:1: ( rule__Dependency__Group__0 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:430:2: rule__Dependency__Group__0
            {
            pushFollow(FOLLOW_rule__Dependency__Group__0_in_ruleDependency878);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:442:1: entryRuleDecomposition : ruleDecomposition EOF ;
    public final void entryRuleDecomposition() throws RecognitionException {
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:442:24: ( ruleDecomposition EOF )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:443:1: ruleDecomposition EOF
            {
             before(grammarAccess.getDecompositionRule()); 
            pushFollow(FOLLOW_ruleDecomposition_in_entryRuleDecomposition904);
            ruleDecomposition();
            _fsp--;

             after(grammarAccess.getDecompositionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecomposition911); 

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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:450:1: ruleDecomposition : ( ( rule__Decomposition__Alternatives ) ) ;
    public final void ruleDecomposition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:454:2: ( ( ( rule__Decomposition__Alternatives ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:455:1: ( ( rule__Decomposition__Alternatives ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:455:1: ( ( rule__Decomposition__Alternatives ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:456:1: ( rule__Decomposition__Alternatives )
            {
             before(grammarAccess.getDecompositionAccess().getAlternatives()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:457:1: ( rule__Decomposition__Alternatives )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:457:2: rule__Decomposition__Alternatives
            {
            pushFollow(FOLLOW_rule__Decomposition__Alternatives_in_ruleDecomposition938);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:469:1: entryRuleAndDecomposition : ruleAndDecomposition EOF ;
    public final void entryRuleAndDecomposition() throws RecognitionException {
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:469:27: ( ruleAndDecomposition EOF )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:470:1: ruleAndDecomposition EOF
            {
             before(grammarAccess.getAndDecompositionRule()); 
            pushFollow(FOLLOW_ruleAndDecomposition_in_entryRuleAndDecomposition964);
            ruleAndDecomposition();
            _fsp--;

             after(grammarAccess.getAndDecompositionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndDecomposition971); 

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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:477:1: ruleAndDecomposition : ( ( rule__AndDecomposition__Group__0 ) ) ;
    public final void ruleAndDecomposition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:481:2: ( ( ( rule__AndDecomposition__Group__0 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:482:1: ( ( rule__AndDecomposition__Group__0 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:482:1: ( ( rule__AndDecomposition__Group__0 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:483:1: ( rule__AndDecomposition__Group__0 )
            {
             before(grammarAccess.getAndDecompositionAccess().getGroup()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:484:1: ( rule__AndDecomposition__Group__0 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:484:2: rule__AndDecomposition__Group__0
            {
            pushFollow(FOLLOW_rule__AndDecomposition__Group__0_in_ruleAndDecomposition998);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:496:1: entryRuleOrDecomposition : ruleOrDecomposition EOF ;
    public final void entryRuleOrDecomposition() throws RecognitionException {
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:496:26: ( ruleOrDecomposition EOF )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:497:1: ruleOrDecomposition EOF
            {
             before(grammarAccess.getOrDecompositionRule()); 
            pushFollow(FOLLOW_ruleOrDecomposition_in_entryRuleOrDecomposition1024);
            ruleOrDecomposition();
            _fsp--;

             after(grammarAccess.getOrDecompositionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrDecomposition1031); 

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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:504:1: ruleOrDecomposition : ( ( rule__OrDecomposition__Group__0 ) ) ;
    public final void ruleOrDecomposition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:508:2: ( ( ( rule__OrDecomposition__Group__0 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:509:1: ( ( rule__OrDecomposition__Group__0 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:509:1: ( ( rule__OrDecomposition__Group__0 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:510:1: ( rule__OrDecomposition__Group__0 )
            {
             before(grammarAccess.getOrDecompositionAccess().getGroup()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:511:1: ( rule__OrDecomposition__Group__0 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:511:2: rule__OrDecomposition__Group__0
            {
            pushFollow(FOLLOW_rule__OrDecomposition__Group__0_in_ruleOrDecomposition1058);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:523:1: entryRuleContribution : ruleContribution EOF ;
    public final void entryRuleContribution() throws RecognitionException {
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:523:23: ( ruleContribution EOF )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:524:1: ruleContribution EOF
            {
             before(grammarAccess.getContributionRule()); 
            pushFollow(FOLLOW_ruleContribution_in_entryRuleContribution1084);
            ruleContribution();
            _fsp--;

             after(grammarAccess.getContributionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContribution1091); 

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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:531:1: ruleContribution : ( ( rule__Contribution__Alternatives ) ) ;
    public final void ruleContribution() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:535:2: ( ( ( rule__Contribution__Alternatives ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:536:1: ( ( rule__Contribution__Alternatives ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:536:1: ( ( rule__Contribution__Alternatives ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:537:1: ( rule__Contribution__Alternatives )
            {
             before(grammarAccess.getContributionAccess().getAlternatives()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:538:1: ( rule__Contribution__Alternatives )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:538:2: rule__Contribution__Alternatives
            {
            pushFollow(FOLLOW_rule__Contribution__Alternatives_in_ruleContribution1118);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:550:1: entryRuleAndContribution : ruleAndContribution EOF ;
    public final void entryRuleAndContribution() throws RecognitionException {
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:550:26: ( ruleAndContribution EOF )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:551:1: ruleAndContribution EOF
            {
             before(grammarAccess.getAndContributionRule()); 
            pushFollow(FOLLOW_ruleAndContribution_in_entryRuleAndContribution1144);
            ruleAndContribution();
            _fsp--;

             after(grammarAccess.getAndContributionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndContribution1151); 

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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:558:1: ruleAndContribution : ( ( rule__AndContribution__Group__0 ) ) ;
    public final void ruleAndContribution() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:562:2: ( ( ( rule__AndContribution__Group__0 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:563:1: ( ( rule__AndContribution__Group__0 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:563:1: ( ( rule__AndContribution__Group__0 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:564:1: ( rule__AndContribution__Group__0 )
            {
             before(grammarAccess.getAndContributionAccess().getGroup()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:565:1: ( rule__AndContribution__Group__0 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:565:2: rule__AndContribution__Group__0
            {
            pushFollow(FOLLOW_rule__AndContribution__Group__0_in_ruleAndContribution1178);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:577:1: entryRuleOrContribution : ruleOrContribution EOF ;
    public final void entryRuleOrContribution() throws RecognitionException {
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:577:25: ( ruleOrContribution EOF )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:578:1: ruleOrContribution EOF
            {
             before(grammarAccess.getOrContributionRule()); 
            pushFollow(FOLLOW_ruleOrContribution_in_entryRuleOrContribution1204);
            ruleOrContribution();
            _fsp--;

             after(grammarAccess.getOrContributionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrContribution1211); 

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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:585:1: ruleOrContribution : ( ( rule__OrContribution__Group__0 ) ) ;
    public final void ruleOrContribution() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:589:2: ( ( ( rule__OrContribution__Group__0 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:590:1: ( ( rule__OrContribution__Group__0 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:590:1: ( ( rule__OrContribution__Group__0 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:591:1: ( rule__OrContribution__Group__0 )
            {
             before(grammarAccess.getOrContributionAccess().getGroup()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:592:1: ( rule__OrContribution__Group__0 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:592:2: rule__OrContribution__Group__0
            {
            pushFollow(FOLLOW_rule__OrContribution__Group__0_in_ruleOrContribution1238);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:604:1: entryRuleHelpContribution : ruleHelpContribution EOF ;
    public final void entryRuleHelpContribution() throws RecognitionException {
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:604:27: ( ruleHelpContribution EOF )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:605:1: ruleHelpContribution EOF
            {
             before(grammarAccess.getHelpContributionRule()); 
            pushFollow(FOLLOW_ruleHelpContribution_in_entryRuleHelpContribution1264);
            ruleHelpContribution();
            _fsp--;

             after(grammarAccess.getHelpContributionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHelpContribution1271); 

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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:612:1: ruleHelpContribution : ( ( rule__HelpContribution__Group__0 ) ) ;
    public final void ruleHelpContribution() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:616:2: ( ( ( rule__HelpContribution__Group__0 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:617:1: ( ( rule__HelpContribution__Group__0 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:617:1: ( ( rule__HelpContribution__Group__0 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:618:1: ( rule__HelpContribution__Group__0 )
            {
             before(grammarAccess.getHelpContributionAccess().getGroup()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:619:1: ( rule__HelpContribution__Group__0 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:619:2: rule__HelpContribution__Group__0
            {
            pushFollow(FOLLOW_rule__HelpContribution__Group__0_in_ruleHelpContribution1298);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:631:1: entryRuleMakeContribution : ruleMakeContribution EOF ;
    public final void entryRuleMakeContribution() throws RecognitionException {
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:631:27: ( ruleMakeContribution EOF )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:632:1: ruleMakeContribution EOF
            {
             before(grammarAccess.getMakeContributionRule()); 
            pushFollow(FOLLOW_ruleMakeContribution_in_entryRuleMakeContribution1324);
            ruleMakeContribution();
            _fsp--;

             after(grammarAccess.getMakeContributionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMakeContribution1331); 

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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:639:1: ruleMakeContribution : ( ( rule__MakeContribution__Group__0 ) ) ;
    public final void ruleMakeContribution() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:643:2: ( ( ( rule__MakeContribution__Group__0 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:644:1: ( ( rule__MakeContribution__Group__0 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:644:1: ( ( rule__MakeContribution__Group__0 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:645:1: ( rule__MakeContribution__Group__0 )
            {
             before(grammarAccess.getMakeContributionAccess().getGroup()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:646:1: ( rule__MakeContribution__Group__0 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:646:2: rule__MakeContribution__Group__0
            {
            pushFollow(FOLLOW_rule__MakeContribution__Group__0_in_ruleMakeContribution1358);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:658:1: entryRuleHurtContribution : ruleHurtContribution EOF ;
    public final void entryRuleHurtContribution() throws RecognitionException {
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:658:27: ( ruleHurtContribution EOF )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:659:1: ruleHurtContribution EOF
            {
             before(grammarAccess.getHurtContributionRule()); 
            pushFollow(FOLLOW_ruleHurtContribution_in_entryRuleHurtContribution1384);
            ruleHurtContribution();
            _fsp--;

             after(grammarAccess.getHurtContributionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHurtContribution1391); 

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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:666:1: ruleHurtContribution : ( ( rule__HurtContribution__Group__0 ) ) ;
    public final void ruleHurtContribution() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:670:2: ( ( ( rule__HurtContribution__Group__0 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:671:1: ( ( rule__HurtContribution__Group__0 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:671:1: ( ( rule__HurtContribution__Group__0 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:672:1: ( rule__HurtContribution__Group__0 )
            {
             before(grammarAccess.getHurtContributionAccess().getGroup()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:673:1: ( rule__HurtContribution__Group__0 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:673:2: rule__HurtContribution__Group__0
            {
            pushFollow(FOLLOW_rule__HurtContribution__Group__0_in_ruleHurtContribution1418);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:685:1: entryRuleBreakContribution : ruleBreakContribution EOF ;
    public final void entryRuleBreakContribution() throws RecognitionException {
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:685:28: ( ruleBreakContribution EOF )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:686:1: ruleBreakContribution EOF
            {
             before(grammarAccess.getBreakContributionRule()); 
            pushFollow(FOLLOW_ruleBreakContribution_in_entryRuleBreakContribution1444);
            ruleBreakContribution();
            _fsp--;

             after(grammarAccess.getBreakContributionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBreakContribution1451); 

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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:693:1: ruleBreakContribution : ( ( rule__BreakContribution__Group__0 ) ) ;
    public final void ruleBreakContribution() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:697:2: ( ( ( rule__BreakContribution__Group__0 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:698:1: ( ( rule__BreakContribution__Group__0 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:698:1: ( ( rule__BreakContribution__Group__0 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:699:1: ( rule__BreakContribution__Group__0 )
            {
             before(grammarAccess.getBreakContributionAccess().getGroup()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:700:1: ( rule__BreakContribution__Group__0 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:700:2: rule__BreakContribution__Group__0
            {
            pushFollow(FOLLOW_rule__BreakContribution__Group__0_in_ruleBreakContribution1478);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:712:1: rule__Model__Alternatives_3 : ( ( ( rule__Model__ContainersAssignment_3_0 ) ) | ( ( rule__Model__IntentionsAssignment_3_1 ) ) | ( ( rule__Model__DecompositionsAssignment_3_2 ) ) | ( ( rule__Model__DependenciesAssignment_3_3 ) ) | ( ( rule__Model__ContributionsAssignment_3_4 ) ) | ( ( rule__Model__AssociationsAssignment_3_5 ) ) );
    public final void rule__Model__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:716:1: ( ( ( rule__Model__ContainersAssignment_3_0 ) ) | ( ( rule__Model__IntentionsAssignment_3_1 ) ) | ( ( rule__Model__DecompositionsAssignment_3_2 ) ) | ( ( rule__Model__DependenciesAssignment_3_3 ) ) | ( ( rule__Model__ContributionsAssignment_3_4 ) ) | ( ( rule__Model__AssociationsAssignment_3_5 ) ) )
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
                        new NoViableAltException("712:1: rule__Model__Alternatives_3 : ( ( ( rule__Model__ContainersAssignment_3_0 ) ) | ( ( rule__Model__IntentionsAssignment_3_1 ) ) | ( ( rule__Model__DecompositionsAssignment_3_2 ) ) | ( ( rule__Model__DependenciesAssignment_3_3 ) ) | ( ( rule__Model__ContributionsAssignment_3_4 ) ) | ( ( rule__Model__AssociationsAssignment_3_5 ) ) );", 1, 3, input);

                    throw nvae;
                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("712:1: rule__Model__Alternatives_3 : ( ( ( rule__Model__ContainersAssignment_3_0 ) ) | ( ( rule__Model__IntentionsAssignment_3_1 ) ) | ( ( rule__Model__DecompositionsAssignment_3_2 ) ) | ( ( rule__Model__DependenciesAssignment_3_3 ) ) | ( ( rule__Model__ContributionsAssignment_3_4 ) ) | ( ( rule__Model__AssociationsAssignment_3_5 ) ) );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:717:1: ( ( rule__Model__ContainersAssignment_3_0 ) )
                    {
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:717:1: ( ( rule__Model__ContainersAssignment_3_0 ) )
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:718:1: ( rule__Model__ContainersAssignment_3_0 )
                    {
                     before(grammarAccess.getModelAccess().getContainersAssignment_3_0()); 
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:719:1: ( rule__Model__ContainersAssignment_3_0 )
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:719:2: rule__Model__ContainersAssignment_3_0
                    {
                    pushFollow(FOLLOW_rule__Model__ContainersAssignment_3_0_in_rule__Model__Alternatives_31514);
                    rule__Model__ContainersAssignment_3_0();
                    _fsp--;


                    }

                     after(grammarAccess.getModelAccess().getContainersAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:723:6: ( ( rule__Model__IntentionsAssignment_3_1 ) )
                    {
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:723:6: ( ( rule__Model__IntentionsAssignment_3_1 ) )
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:724:1: ( rule__Model__IntentionsAssignment_3_1 )
                    {
                     before(grammarAccess.getModelAccess().getIntentionsAssignment_3_1()); 
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:725:1: ( rule__Model__IntentionsAssignment_3_1 )
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:725:2: rule__Model__IntentionsAssignment_3_1
                    {
                    pushFollow(FOLLOW_rule__Model__IntentionsAssignment_3_1_in_rule__Model__Alternatives_31532);
                    rule__Model__IntentionsAssignment_3_1();
                    _fsp--;


                    }

                     after(grammarAccess.getModelAccess().getIntentionsAssignment_3_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:729:6: ( ( rule__Model__DecompositionsAssignment_3_2 ) )
                    {
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:729:6: ( ( rule__Model__DecompositionsAssignment_3_2 ) )
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:730:1: ( rule__Model__DecompositionsAssignment_3_2 )
                    {
                     before(grammarAccess.getModelAccess().getDecompositionsAssignment_3_2()); 
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:731:1: ( rule__Model__DecompositionsAssignment_3_2 )
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:731:2: rule__Model__DecompositionsAssignment_3_2
                    {
                    pushFollow(FOLLOW_rule__Model__DecompositionsAssignment_3_2_in_rule__Model__Alternatives_31550);
                    rule__Model__DecompositionsAssignment_3_2();
                    _fsp--;


                    }

                     after(grammarAccess.getModelAccess().getDecompositionsAssignment_3_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:735:6: ( ( rule__Model__DependenciesAssignment_3_3 ) )
                    {
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:735:6: ( ( rule__Model__DependenciesAssignment_3_3 ) )
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:736:1: ( rule__Model__DependenciesAssignment_3_3 )
                    {
                     before(grammarAccess.getModelAccess().getDependenciesAssignment_3_3()); 
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:737:1: ( rule__Model__DependenciesAssignment_3_3 )
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:737:2: rule__Model__DependenciesAssignment_3_3
                    {
                    pushFollow(FOLLOW_rule__Model__DependenciesAssignment_3_3_in_rule__Model__Alternatives_31568);
                    rule__Model__DependenciesAssignment_3_3();
                    _fsp--;


                    }

                     after(grammarAccess.getModelAccess().getDependenciesAssignment_3_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:741:6: ( ( rule__Model__ContributionsAssignment_3_4 ) )
                    {
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:741:6: ( ( rule__Model__ContributionsAssignment_3_4 ) )
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:742:1: ( rule__Model__ContributionsAssignment_3_4 )
                    {
                     before(grammarAccess.getModelAccess().getContributionsAssignment_3_4()); 
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:743:1: ( rule__Model__ContributionsAssignment_3_4 )
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:743:2: rule__Model__ContributionsAssignment_3_4
                    {
                    pushFollow(FOLLOW_rule__Model__ContributionsAssignment_3_4_in_rule__Model__Alternatives_31586);
                    rule__Model__ContributionsAssignment_3_4();
                    _fsp--;


                    }

                     after(grammarAccess.getModelAccess().getContributionsAssignment_3_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:747:6: ( ( rule__Model__AssociationsAssignment_3_5 ) )
                    {
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:747:6: ( ( rule__Model__AssociationsAssignment_3_5 ) )
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:748:1: ( rule__Model__AssociationsAssignment_3_5 )
                    {
                     before(grammarAccess.getModelAccess().getAssociationsAssignment_3_5()); 
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:749:1: ( rule__Model__AssociationsAssignment_3_5 )
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:749:2: rule__Model__AssociationsAssignment_3_5
                    {
                    pushFollow(FOLLOW_rule__Model__AssociationsAssignment_3_5_in_rule__Model__Alternatives_31604);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:758:1: rule__Container__Alternatives : ( ( ruleActor ) | ( ruleAgent ) | ( ruleRole ) | ( rulePosition ) );
    public final void rule__Container__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:762:1: ( ( ruleActor ) | ( ruleAgent ) | ( ruleRole ) | ( rulePosition ) )
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
                    new NoViableAltException("758:1: rule__Container__Alternatives : ( ( ruleActor ) | ( ruleAgent ) | ( ruleRole ) | ( rulePosition ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:763:1: ( ruleActor )
                    {
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:763:1: ( ruleActor )
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:764:1: ruleActor
                    {
                     before(grammarAccess.getContainerAccess().getActorParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleActor_in_rule__Container__Alternatives1637);
                    ruleActor();
                    _fsp--;

                     after(grammarAccess.getContainerAccess().getActorParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:769:6: ( ruleAgent )
                    {
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:769:6: ( ruleAgent )
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:770:1: ruleAgent
                    {
                     before(grammarAccess.getContainerAccess().getAgentParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAgent_in_rule__Container__Alternatives1654);
                    ruleAgent();
                    _fsp--;

                     after(grammarAccess.getContainerAccess().getAgentParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:775:6: ( ruleRole )
                    {
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:775:6: ( ruleRole )
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:776:1: ruleRole
                    {
                     before(grammarAccess.getContainerAccess().getRoleParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleRole_in_rule__Container__Alternatives1671);
                    ruleRole();
                    _fsp--;

                     after(grammarAccess.getContainerAccess().getRoleParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:781:6: ( rulePosition )
                    {
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:781:6: ( rulePosition )
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:782:1: rulePosition
                    {
                     before(grammarAccess.getContainerAccess().getPositionParserRuleCall_3()); 
                    pushFollow(FOLLOW_rulePosition_in_rule__Container__Alternatives1688);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:792:1: rule__Actor__Alternatives_2 : ( ( ( rule__Actor__Is_aAssignment_2_0 ) ) | ( ( rule__Actor__Is_part_ofAssignment_2_1 ) ) );
    public final void rule__Actor__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:796:1: ( ( ( rule__Actor__Is_aAssignment_2_0 ) ) | ( ( rule__Actor__Is_part_ofAssignment_2_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("792:1: rule__Actor__Alternatives_2 : ( ( ( rule__Actor__Is_aAssignment_2_0 ) ) | ( ( rule__Actor__Is_part_ofAssignment_2_1 ) ) );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:797:1: ( ( rule__Actor__Is_aAssignment_2_0 ) )
                    {
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:797:1: ( ( rule__Actor__Is_aAssignment_2_0 ) )
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:798:1: ( rule__Actor__Is_aAssignment_2_0 )
                    {
                     before(grammarAccess.getActorAccess().getIs_aAssignment_2_0()); 
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:799:1: ( rule__Actor__Is_aAssignment_2_0 )
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:799:2: rule__Actor__Is_aAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__Actor__Is_aAssignment_2_0_in_rule__Actor__Alternatives_21720);
                    rule__Actor__Is_aAssignment_2_0();
                    _fsp--;


                    }

                     after(grammarAccess.getActorAccess().getIs_aAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:803:6: ( ( rule__Actor__Is_part_ofAssignment_2_1 ) )
                    {
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:803:6: ( ( rule__Actor__Is_part_ofAssignment_2_1 ) )
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:804:1: ( rule__Actor__Is_part_ofAssignment_2_1 )
                    {
                     before(grammarAccess.getActorAccess().getIs_part_ofAssignment_2_1()); 
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:805:1: ( rule__Actor__Is_part_ofAssignment_2_1 )
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:805:2: rule__Actor__Is_part_ofAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__Actor__Is_part_ofAssignment_2_1_in_rule__Actor__Alternatives_21738);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:814:1: rule__Intention__Alternatives : ( ( ruleGoal ) | ( ruleSoftgoal ) | ( ruleTask ) | ( ruleResource ) | ( ruleBelief ) );
    public final void rule__Intention__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:818:1: ( ( ruleGoal ) | ( ruleSoftgoal ) | ( ruleTask ) | ( ruleResource ) | ( ruleBelief ) )
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
                    new NoViableAltException("814:1: rule__Intention__Alternatives : ( ( ruleGoal ) | ( ruleSoftgoal ) | ( ruleTask ) | ( ruleResource ) | ( ruleBelief ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:819:1: ( ruleGoal )
                    {
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:819:1: ( ruleGoal )
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:820:1: ruleGoal
                    {
                     before(grammarAccess.getIntentionAccess().getGoalParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleGoal_in_rule__Intention__Alternatives1771);
                    ruleGoal();
                    _fsp--;

                     after(grammarAccess.getIntentionAccess().getGoalParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:825:6: ( ruleSoftgoal )
                    {
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:825:6: ( ruleSoftgoal )
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:826:1: ruleSoftgoal
                    {
                     before(grammarAccess.getIntentionAccess().getSoftgoalParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleSoftgoal_in_rule__Intention__Alternatives1788);
                    ruleSoftgoal();
                    _fsp--;

                     after(grammarAccess.getIntentionAccess().getSoftgoalParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:831:6: ( ruleTask )
                    {
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:831:6: ( ruleTask )
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:832:1: ruleTask
                    {
                     before(grammarAccess.getIntentionAccess().getTaskParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleTask_in_rule__Intention__Alternatives1805);
                    ruleTask();
                    _fsp--;

                     after(grammarAccess.getIntentionAccess().getTaskParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:837:6: ( ruleResource )
                    {
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:837:6: ( ruleResource )
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:838:1: ruleResource
                    {
                     before(grammarAccess.getIntentionAccess().getResourceParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleResource_in_rule__Intention__Alternatives1822);
                    ruleResource();
                    _fsp--;

                     after(grammarAccess.getIntentionAccess().getResourceParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:843:6: ( ruleBelief )
                    {
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:843:6: ( ruleBelief )
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:844:1: ruleBelief
                    {
                     before(grammarAccess.getIntentionAccess().getBeliefParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleBelief_in_rule__Intention__Alternatives1839);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:856:1: rule__Decomposition__Alternatives : ( ( ruleAndDecomposition ) | ( ruleOrDecomposition ) );
    public final void rule__Decomposition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:860:1: ( ( ruleAndDecomposition ) | ( ruleOrDecomposition ) )
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
                        new NoViableAltException("856:1: rule__Decomposition__Alternatives : ( ( ruleAndDecomposition ) | ( ruleOrDecomposition ) );", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("856:1: rule__Decomposition__Alternatives : ( ( ruleAndDecomposition ) | ( ruleOrDecomposition ) );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:861:1: ( ruleAndDecomposition )
                    {
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:861:1: ( ruleAndDecomposition )
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:862:1: ruleAndDecomposition
                    {
                     before(grammarAccess.getDecompositionAccess().getAndDecompositionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleAndDecomposition_in_rule__Decomposition__Alternatives1873);
                    ruleAndDecomposition();
                    _fsp--;

                     after(grammarAccess.getDecompositionAccess().getAndDecompositionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:867:6: ( ruleOrDecomposition )
                    {
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:867:6: ( ruleOrDecomposition )
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:868:1: ruleOrDecomposition
                    {
                     before(grammarAccess.getDecompositionAccess().getOrDecompositionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleOrDecomposition_in_rule__Decomposition__Alternatives1890);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:878:1: rule__Contribution__Alternatives : ( ( ruleAndContribution ) | ( ruleOrContribution ) | ( ruleHelpContribution ) | ( ruleHurtContribution ) | ( ruleMakeContribution ) | ( ruleBreakContribution ) );
    public final void rule__Contribution__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:882:1: ( ( ruleAndContribution ) | ( ruleOrContribution ) | ( ruleHelpContribution ) | ( ruleHurtContribution ) | ( ruleMakeContribution ) | ( ruleBreakContribution ) )
            int alt6=6;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 29:
                    {
                    alt6=2;
                    }
                    break;
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
                case 32:
                    {
                    alt6=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("878:1: rule__Contribution__Alternatives : ( ( ruleAndContribution ) | ( ruleOrContribution ) | ( ruleHelpContribution ) | ( ruleHurtContribution ) | ( ruleMakeContribution ) | ( ruleBreakContribution ) );", 6, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("878:1: rule__Contribution__Alternatives : ( ( ruleAndContribution ) | ( ruleOrContribution ) | ( ruleHelpContribution ) | ( ruleHurtContribution ) | ( ruleMakeContribution ) | ( ruleBreakContribution ) );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:883:1: ( ruleAndContribution )
                    {
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:883:1: ( ruleAndContribution )
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:884:1: ruleAndContribution
                    {
                     before(grammarAccess.getContributionAccess().getAndContributionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleAndContribution_in_rule__Contribution__Alternatives1922);
                    ruleAndContribution();
                    _fsp--;

                     after(grammarAccess.getContributionAccess().getAndContributionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:889:6: ( ruleOrContribution )
                    {
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:889:6: ( ruleOrContribution )
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:890:1: ruleOrContribution
                    {
                     before(grammarAccess.getContributionAccess().getOrContributionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleOrContribution_in_rule__Contribution__Alternatives1939);
                    ruleOrContribution();
                    _fsp--;

                     after(grammarAccess.getContributionAccess().getOrContributionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:895:6: ( ruleHelpContribution )
                    {
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:895:6: ( ruleHelpContribution )
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:896:1: ruleHelpContribution
                    {
                     before(grammarAccess.getContributionAccess().getHelpContributionParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleHelpContribution_in_rule__Contribution__Alternatives1956);
                    ruleHelpContribution();
                    _fsp--;

                     after(grammarAccess.getContributionAccess().getHelpContributionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:901:6: ( ruleHurtContribution )
                    {
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:901:6: ( ruleHurtContribution )
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:902:1: ruleHurtContribution
                    {
                     before(grammarAccess.getContributionAccess().getHurtContributionParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleHurtContribution_in_rule__Contribution__Alternatives1973);
                    ruleHurtContribution();
                    _fsp--;

                     after(grammarAccess.getContributionAccess().getHurtContributionParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:907:6: ( ruleMakeContribution )
                    {
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:907:6: ( ruleMakeContribution )
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:908:1: ruleMakeContribution
                    {
                     before(grammarAccess.getContributionAccess().getMakeContributionParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleMakeContribution_in_rule__Contribution__Alternatives1990);
                    ruleMakeContribution();
                    _fsp--;

                     after(grammarAccess.getContributionAccess().getMakeContributionParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:913:6: ( ruleBreakContribution )
                    {
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:913:6: ( ruleBreakContribution )
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:914:1: ruleBreakContribution
                    {
                     before(grammarAccess.getContributionAccess().getBreakContributionParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleBreakContribution_in_rule__Contribution__Alternatives2007);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:926:1: rule__Model__Group__0 : ( 'istar' ) rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:930:1: ( ( 'istar' ) rule__Model__Group__1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:931:1: ( 'istar' ) rule__Model__Group__1
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:931:1: ( 'istar' )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:932:1: 'istar'
            {
             before(grammarAccess.getModelAccess().getIstarKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Model__Group__02042); 
             after(grammarAccess.getModelAccess().getIstarKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02052);
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


    // $ANTLR start rule__Model__Group__1
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:946:1: rule__Model__Group__1 : ( ( rule__Model__NameAssignment_1 )? ) rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:950:1: ( ( ( rule__Model__NameAssignment_1 )? ) rule__Model__Group__2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:951:1: ( ( rule__Model__NameAssignment_1 )? ) rule__Model__Group__2
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:951:1: ( ( rule__Model__NameAssignment_1 )? )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:952:1: ( rule__Model__NameAssignment_1 )?
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:953:1: ( rule__Model__NameAssignment_1 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:953:2: rule__Model__NameAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Model__NameAssignment_1_in_rule__Model__Group__12080);
                    rule__Model__NameAssignment_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__12090);
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


    // $ANTLR start rule__Model__Group__2
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:964:1: rule__Model__Group__2 : ( ':' ) rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:968:1: ( ( ':' ) rule__Model__Group__3 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:969:1: ( ':' ) rule__Model__Group__3
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:969:1: ( ':' )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:970:1: ':'
            {
             before(grammarAccess.getModelAccess().getColonKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Model__Group__22119); 
             after(grammarAccess.getModelAccess().getColonKeyword_2()); 

            }

            pushFollow(FOLLOW_rule__Model__Group__3_in_rule__Model__Group__22129);
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


    // $ANTLR start rule__Model__Group__3
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:984:1: rule__Model__Group__3 : ( ( rule__Model__Alternatives_3 )* ) ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:988:1: ( ( ( rule__Model__Alternatives_3 )* ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:989:1: ( ( rule__Model__Alternatives_3 )* )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:989:1: ( ( rule__Model__Alternatives_3 )* )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:990:1: ( rule__Model__Alternatives_3 )*
            {
             before(grammarAccess.getModelAccess().getAlternatives_3()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:991:1: ( rule__Model__Alternatives_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||LA8_0==13||(LA8_0>=16 && LA8_0<=23)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:991:2: rule__Model__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_rule__Model__Alternatives_3_in_rule__Model__Group__32157);
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
    // $ANTLR end rule__Model__Group__3


    // $ANTLR start rule__Actor__Group__0
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1009:1: rule__Actor__Group__0 : ( 'actor' ) rule__Actor__Group__1 ;
    public final void rule__Actor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1013:1: ( ( 'actor' ) rule__Actor__Group__1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1014:1: ( 'actor' ) rule__Actor__Group__1
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1014:1: ( 'actor' )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1015:1: 'actor'
            {
             before(grammarAccess.getActorAccess().getActorKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__Actor__Group__02201); 
             after(grammarAccess.getActorAccess().getActorKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Actor__Group__1_in_rule__Actor__Group__02211);
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


    // $ANTLR start rule__Actor__Group__1
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1029:1: rule__Actor__Group__1 : ( ( rule__Actor__NameAssignment_1 ) ) rule__Actor__Group__2 ;
    public final void rule__Actor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1033:1: ( ( ( rule__Actor__NameAssignment_1 ) ) rule__Actor__Group__2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1034:1: ( ( rule__Actor__NameAssignment_1 ) ) rule__Actor__Group__2
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1034:1: ( ( rule__Actor__NameAssignment_1 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1035:1: ( rule__Actor__NameAssignment_1 )
            {
             before(grammarAccess.getActorAccess().getNameAssignment_1()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1036:1: ( rule__Actor__NameAssignment_1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1036:2: rule__Actor__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Actor__NameAssignment_1_in_rule__Actor__Group__12239);
            rule__Actor__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getActorAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Actor__Group__2_in_rule__Actor__Group__12248);
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


    // $ANTLR start rule__Actor__Group__2
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1047:1: rule__Actor__Group__2 : ( ( rule__Actor__Alternatives_2 )* ) rule__Actor__Group__3 ;
    public final void rule__Actor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1051:1: ( ( ( rule__Actor__Alternatives_2 )* ) rule__Actor__Group__3 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1052:1: ( ( rule__Actor__Alternatives_2 )* ) rule__Actor__Group__3
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1052:1: ( ( rule__Actor__Alternatives_2 )* )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1053:1: ( rule__Actor__Alternatives_2 )*
            {
             before(grammarAccess.getActorAccess().getAlternatives_2()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1054:1: ( rule__Actor__Alternatives_2 )*
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
            	    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1054:2: rule__Actor__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_rule__Actor__Alternatives_2_in_rule__Actor__Group__22276);
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

            pushFollow(FOLLOW_rule__Actor__Group__3_in_rule__Actor__Group__22286);
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


    // $ANTLR start rule__Actor__Group__3
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1065:1: rule__Actor__Group__3 : ( ( rule__Actor__Group_3__0 )? ) ;
    public final void rule__Actor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1069:1: ( ( ( rule__Actor__Group_3__0 )? ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1070:1: ( ( rule__Actor__Group_3__0 )? )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1070:1: ( ( rule__Actor__Group_3__0 )? )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1071:1: ( rule__Actor__Group_3__0 )?
            {
             before(grammarAccess.getActorAccess().getGroup_3()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1072:1: ( rule__Actor__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==14) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1072:2: rule__Actor__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Actor__Group_3__0_in_rule__Actor__Group__32314);
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
    // $ANTLR end rule__Actor__Group__3


    // $ANTLR start rule__Actor__Group_3__0
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1090:1: rule__Actor__Group_3__0 : ( '{' ) rule__Actor__Group_3__1 ;
    public final void rule__Actor__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1094:1: ( ( '{' ) rule__Actor__Group_3__1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1095:1: ( '{' ) rule__Actor__Group_3__1
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1095:1: ( '{' )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1096:1: '{'
            {
             before(grammarAccess.getActorAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,14,FOLLOW_14_in_rule__Actor__Group_3__02358); 
             after(grammarAccess.getActorAccess().getLeftCurlyBracketKeyword_3_0()); 

            }

            pushFollow(FOLLOW_rule__Actor__Group_3__1_in_rule__Actor__Group_3__02368);
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


    // $ANTLR start rule__Actor__Group_3__1
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1110:1: rule__Actor__Group_3__1 : ( ( rule__Actor__IntentionsAssignment_3_1 )* ) rule__Actor__Group_3__2 ;
    public final void rule__Actor__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1114:1: ( ( ( rule__Actor__IntentionsAssignment_3_1 )* ) rule__Actor__Group_3__2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1115:1: ( ( rule__Actor__IntentionsAssignment_3_1 )* ) rule__Actor__Group_3__2
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1115:1: ( ( rule__Actor__IntentionsAssignment_3_1 )* )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1116:1: ( rule__Actor__IntentionsAssignment_3_1 )*
            {
             before(grammarAccess.getActorAccess().getIntentionsAssignment_3_1()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1117:1: ( rule__Actor__IntentionsAssignment_3_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=19 && LA11_0<=23)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1117:2: rule__Actor__IntentionsAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_rule__Actor__IntentionsAssignment_3_1_in_rule__Actor__Group_3__12396);
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

            pushFollow(FOLLOW_rule__Actor__Group_3__2_in_rule__Actor__Group_3__12406);
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


    // $ANTLR start rule__Actor__Group_3__2
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1128:1: rule__Actor__Group_3__2 : ( '}' ) ;
    public final void rule__Actor__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1132:1: ( ( '}' ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1133:1: ( '}' )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1133:1: ( '}' )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1134:1: '}'
            {
             before(grammarAccess.getActorAccess().getRightCurlyBracketKeyword_3_2()); 
            match(input,15,FOLLOW_15_in_rule__Actor__Group_3__22435); 
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
    // $ANTLR end rule__Actor__Group_3__2


    // $ANTLR start rule__Agent__Group__0
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1153:1: rule__Agent__Group__0 : ( 'agent' ) rule__Agent__Group__1 ;
    public final void rule__Agent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1157:1: ( ( 'agent' ) rule__Agent__Group__1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1158:1: ( 'agent' ) rule__Agent__Group__1
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1158:1: ( 'agent' )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1159:1: 'agent'
            {
             before(grammarAccess.getAgentAccess().getAgentKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__Agent__Group__02477); 
             after(grammarAccess.getAgentAccess().getAgentKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Agent__Group__1_in_rule__Agent__Group__02487);
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


    // $ANTLR start rule__Agent__Group__1
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1173:1: rule__Agent__Group__1 : ( ( rule__Agent__NameAssignment_1 ) ) rule__Agent__Group__2 ;
    public final void rule__Agent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1177:1: ( ( ( rule__Agent__NameAssignment_1 ) ) rule__Agent__Group__2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1178:1: ( ( rule__Agent__NameAssignment_1 ) ) rule__Agent__Group__2
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1178:1: ( ( rule__Agent__NameAssignment_1 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1179:1: ( rule__Agent__NameAssignment_1 )
            {
             before(grammarAccess.getAgentAccess().getNameAssignment_1()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1180:1: ( rule__Agent__NameAssignment_1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1180:2: rule__Agent__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Agent__NameAssignment_1_in_rule__Agent__Group__12515);
            rule__Agent__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getAgentAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Agent__Group__2_in_rule__Agent__Group__12524);
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


    // $ANTLR start rule__Agent__Group__2
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1191:1: rule__Agent__Group__2 : ( ( rule__Agent__Group_2__0 )? ) ;
    public final void rule__Agent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1195:1: ( ( ( rule__Agent__Group_2__0 )? ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1196:1: ( ( rule__Agent__Group_2__0 )? )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1196:1: ( ( rule__Agent__Group_2__0 )? )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1197:1: ( rule__Agent__Group_2__0 )?
            {
             before(grammarAccess.getAgentAccess().getGroup_2()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1198:1: ( rule__Agent__Group_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==14) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1198:2: rule__Agent__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Agent__Group_2__0_in_rule__Agent__Group__22552);
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
    // $ANTLR end rule__Agent__Group__2


    // $ANTLR start rule__Agent__Group_2__0
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1214:1: rule__Agent__Group_2__0 : ( '{' ) rule__Agent__Group_2__1 ;
    public final void rule__Agent__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1218:1: ( ( '{' ) rule__Agent__Group_2__1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1219:1: ( '{' ) rule__Agent__Group_2__1
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1219:1: ( '{' )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1220:1: '{'
            {
             before(grammarAccess.getAgentAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,14,FOLLOW_14_in_rule__Agent__Group_2__02594); 
             after(grammarAccess.getAgentAccess().getLeftCurlyBracketKeyword_2_0()); 

            }

            pushFollow(FOLLOW_rule__Agent__Group_2__1_in_rule__Agent__Group_2__02604);
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


    // $ANTLR start rule__Agent__Group_2__1
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1234:1: rule__Agent__Group_2__1 : ( ( rule__Agent__IntentionsAssignment_2_1 )* ) rule__Agent__Group_2__2 ;
    public final void rule__Agent__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1238:1: ( ( ( rule__Agent__IntentionsAssignment_2_1 )* ) rule__Agent__Group_2__2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1239:1: ( ( rule__Agent__IntentionsAssignment_2_1 )* ) rule__Agent__Group_2__2
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1239:1: ( ( rule__Agent__IntentionsAssignment_2_1 )* )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1240:1: ( rule__Agent__IntentionsAssignment_2_1 )*
            {
             before(grammarAccess.getAgentAccess().getIntentionsAssignment_2_1()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1241:1: ( rule__Agent__IntentionsAssignment_2_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=19 && LA13_0<=23)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1241:2: rule__Agent__IntentionsAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_rule__Agent__IntentionsAssignment_2_1_in_rule__Agent__Group_2__12632);
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

            pushFollow(FOLLOW_rule__Agent__Group_2__2_in_rule__Agent__Group_2__12642);
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


    // $ANTLR start rule__Agent__Group_2__2
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1252:1: rule__Agent__Group_2__2 : ( '}' ) ;
    public final void rule__Agent__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1256:1: ( ( '}' ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1257:1: ( '}' )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1257:1: ( '}' )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1258:1: '}'
            {
             before(grammarAccess.getAgentAccess().getRightCurlyBracketKeyword_2_2()); 
            match(input,15,FOLLOW_15_in_rule__Agent__Group_2__22671); 
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
    // $ANTLR end rule__Agent__Group_2__2


    // $ANTLR start rule__Role__Group__0
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1277:1: rule__Role__Group__0 : ( 'role' ) rule__Role__Group__1 ;
    public final void rule__Role__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1281:1: ( ( 'role' ) rule__Role__Group__1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1282:1: ( 'role' ) rule__Role__Group__1
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1282:1: ( 'role' )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1283:1: 'role'
            {
             before(grammarAccess.getRoleAccess().getRoleKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Role__Group__02713); 
             after(grammarAccess.getRoleAccess().getRoleKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Role__Group__1_in_rule__Role__Group__02723);
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


    // $ANTLR start rule__Role__Group__1
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1297:1: rule__Role__Group__1 : ( ( rule__Role__NameAssignment_1 ) ) rule__Role__Group__2 ;
    public final void rule__Role__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1301:1: ( ( ( rule__Role__NameAssignment_1 ) ) rule__Role__Group__2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1302:1: ( ( rule__Role__NameAssignment_1 ) ) rule__Role__Group__2
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1302:1: ( ( rule__Role__NameAssignment_1 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1303:1: ( rule__Role__NameAssignment_1 )
            {
             before(grammarAccess.getRoleAccess().getNameAssignment_1()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1304:1: ( rule__Role__NameAssignment_1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1304:2: rule__Role__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Role__NameAssignment_1_in_rule__Role__Group__12751);
            rule__Role__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getRoleAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Role__Group__2_in_rule__Role__Group__12760);
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


    // $ANTLR start rule__Role__Group__2
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1315:1: rule__Role__Group__2 : ( ( rule__Role__Group_2__0 )? ) ;
    public final void rule__Role__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1319:1: ( ( ( rule__Role__Group_2__0 )? ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1320:1: ( ( rule__Role__Group_2__0 )? )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1320:1: ( ( rule__Role__Group_2__0 )? )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1321:1: ( rule__Role__Group_2__0 )?
            {
             before(grammarAccess.getRoleAccess().getGroup_2()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1322:1: ( rule__Role__Group_2__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==14) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1322:2: rule__Role__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Role__Group_2__0_in_rule__Role__Group__22788);
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
    // $ANTLR end rule__Role__Group__2


    // $ANTLR start rule__Role__Group_2__0
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1338:1: rule__Role__Group_2__0 : ( '{' ) rule__Role__Group_2__1 ;
    public final void rule__Role__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1342:1: ( ( '{' ) rule__Role__Group_2__1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1343:1: ( '{' ) rule__Role__Group_2__1
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1343:1: ( '{' )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1344:1: '{'
            {
             before(grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,14,FOLLOW_14_in_rule__Role__Group_2__02830); 
             after(grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_2_0()); 

            }

            pushFollow(FOLLOW_rule__Role__Group_2__1_in_rule__Role__Group_2__02840);
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


    // $ANTLR start rule__Role__Group_2__1
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1358:1: rule__Role__Group_2__1 : ( ( rule__Role__IntentionsAssignment_2_1 )* ) rule__Role__Group_2__2 ;
    public final void rule__Role__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1362:1: ( ( ( rule__Role__IntentionsAssignment_2_1 )* ) rule__Role__Group_2__2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1363:1: ( ( rule__Role__IntentionsAssignment_2_1 )* ) rule__Role__Group_2__2
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1363:1: ( ( rule__Role__IntentionsAssignment_2_1 )* )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1364:1: ( rule__Role__IntentionsAssignment_2_1 )*
            {
             before(grammarAccess.getRoleAccess().getIntentionsAssignment_2_1()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1365:1: ( rule__Role__IntentionsAssignment_2_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=19 && LA15_0<=23)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1365:2: rule__Role__IntentionsAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_rule__Role__IntentionsAssignment_2_1_in_rule__Role__Group_2__12868);
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

            pushFollow(FOLLOW_rule__Role__Group_2__2_in_rule__Role__Group_2__12878);
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


    // $ANTLR start rule__Role__Group_2__2
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1376:1: rule__Role__Group_2__2 : ( '}' ) ;
    public final void rule__Role__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1380:1: ( ( '}' ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1381:1: ( '}' )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1381:1: ( '}' )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1382:1: '}'
            {
             before(grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_2_2()); 
            match(input,15,FOLLOW_15_in_rule__Role__Group_2__22907); 
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
    // $ANTLR end rule__Role__Group_2__2


    // $ANTLR start rule__Position__Group__0
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1401:1: rule__Position__Group__0 : ( 'position' ) rule__Position__Group__1 ;
    public final void rule__Position__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1405:1: ( ( 'position' ) rule__Position__Group__1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1406:1: ( 'position' ) rule__Position__Group__1
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1406:1: ( 'position' )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1407:1: 'position'
            {
             before(grammarAccess.getPositionAccess().getPositionKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__Position__Group__02949); 
             after(grammarAccess.getPositionAccess().getPositionKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Position__Group__1_in_rule__Position__Group__02959);
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


    // $ANTLR start rule__Position__Group__1
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1421:1: rule__Position__Group__1 : ( ( rule__Position__NameAssignment_1 ) ) rule__Position__Group__2 ;
    public final void rule__Position__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1425:1: ( ( ( rule__Position__NameAssignment_1 ) ) rule__Position__Group__2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1426:1: ( ( rule__Position__NameAssignment_1 ) ) rule__Position__Group__2
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1426:1: ( ( rule__Position__NameAssignment_1 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1427:1: ( rule__Position__NameAssignment_1 )
            {
             before(grammarAccess.getPositionAccess().getNameAssignment_1()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1428:1: ( rule__Position__NameAssignment_1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1428:2: rule__Position__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Position__NameAssignment_1_in_rule__Position__Group__12987);
            rule__Position__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getPositionAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Position__Group__2_in_rule__Position__Group__12996);
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


    // $ANTLR start rule__Position__Group__2
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1439:1: rule__Position__Group__2 : ( ( rule__Position__Group_2__0 )? ) ;
    public final void rule__Position__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1443:1: ( ( ( rule__Position__Group_2__0 )? ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1444:1: ( ( rule__Position__Group_2__0 )? )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1444:1: ( ( rule__Position__Group_2__0 )? )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1445:1: ( rule__Position__Group_2__0 )?
            {
             before(grammarAccess.getPositionAccess().getGroup_2()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1446:1: ( rule__Position__Group_2__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==14) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1446:2: rule__Position__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Position__Group_2__0_in_rule__Position__Group__23024);
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
    // $ANTLR end rule__Position__Group__2


    // $ANTLR start rule__Position__Group_2__0
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1462:1: rule__Position__Group_2__0 : ( '{' ) rule__Position__Group_2__1 ;
    public final void rule__Position__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1466:1: ( ( '{' ) rule__Position__Group_2__1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1467:1: ( '{' ) rule__Position__Group_2__1
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1467:1: ( '{' )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1468:1: '{'
            {
             before(grammarAccess.getPositionAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,14,FOLLOW_14_in_rule__Position__Group_2__03066); 
             after(grammarAccess.getPositionAccess().getLeftCurlyBracketKeyword_2_0()); 

            }

            pushFollow(FOLLOW_rule__Position__Group_2__1_in_rule__Position__Group_2__03076);
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


    // $ANTLR start rule__Position__Group_2__1
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1482:1: rule__Position__Group_2__1 : ( ( rule__Position__IntentionsAssignment_2_1 )* ) rule__Position__Group_2__2 ;
    public final void rule__Position__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1486:1: ( ( ( rule__Position__IntentionsAssignment_2_1 )* ) rule__Position__Group_2__2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1487:1: ( ( rule__Position__IntentionsAssignment_2_1 )* ) rule__Position__Group_2__2
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1487:1: ( ( rule__Position__IntentionsAssignment_2_1 )* )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1488:1: ( rule__Position__IntentionsAssignment_2_1 )*
            {
             before(grammarAccess.getPositionAccess().getIntentionsAssignment_2_1()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1489:1: ( rule__Position__IntentionsAssignment_2_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=19 && LA17_0<=23)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1489:2: rule__Position__IntentionsAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_rule__Position__IntentionsAssignment_2_1_in_rule__Position__Group_2__13104);
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

            pushFollow(FOLLOW_rule__Position__Group_2__2_in_rule__Position__Group_2__13114);
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


    // $ANTLR start rule__Position__Group_2__2
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1500:1: rule__Position__Group_2__2 : ( '}' ) ;
    public final void rule__Position__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1504:1: ( ( '}' ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1505:1: ( '}' )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1505:1: ( '}' )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1506:1: '}'
            {
             before(grammarAccess.getPositionAccess().getRightCurlyBracketKeyword_2_2()); 
            match(input,15,FOLLOW_15_in_rule__Position__Group_2__23143); 
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
    // $ANTLR end rule__Position__Group_2__2


    // $ANTLR start rule__Goal__Group__0
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1525:1: rule__Goal__Group__0 : ( 'goal' ) rule__Goal__Group__1 ;
    public final void rule__Goal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1529:1: ( ( 'goal' ) rule__Goal__Group__1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1530:1: ( 'goal' ) rule__Goal__Group__1
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1530:1: ( 'goal' )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1531:1: 'goal'
            {
             before(grammarAccess.getGoalAccess().getGoalKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__Goal__Group__03185); 
             after(grammarAccess.getGoalAccess().getGoalKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Goal__Group__1_in_rule__Goal__Group__03195);
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


    // $ANTLR start rule__Goal__Group__1
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1545:1: rule__Goal__Group__1 : ( ( rule__Goal__NameAssignment_1 ) ) rule__Goal__Group__2 ;
    public final void rule__Goal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1549:1: ( ( ( rule__Goal__NameAssignment_1 ) ) rule__Goal__Group__2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1550:1: ( ( rule__Goal__NameAssignment_1 ) ) rule__Goal__Group__2
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1550:1: ( ( rule__Goal__NameAssignment_1 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1551:1: ( rule__Goal__NameAssignment_1 )
            {
             before(grammarAccess.getGoalAccess().getNameAssignment_1()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1552:1: ( rule__Goal__NameAssignment_1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1552:2: rule__Goal__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Goal__NameAssignment_1_in_rule__Goal__Group__13223);
            rule__Goal__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getGoalAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Goal__Group__2_in_rule__Goal__Group__13232);
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


    // $ANTLR start rule__Goal__Group__2
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1563:1: rule__Goal__Group__2 : ( ( rule__Goal__Group_2__0 )? ) ;
    public final void rule__Goal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1567:1: ( ( ( rule__Goal__Group_2__0 )? ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1568:1: ( ( rule__Goal__Group_2__0 )? )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1568:1: ( ( rule__Goal__Group_2__0 )? )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1569:1: ( rule__Goal__Group_2__0 )?
            {
             before(grammarAccess.getGoalAccess().getGroup_2()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1570:1: ( rule__Goal__Group_2__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==14) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1570:2: rule__Goal__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Goal__Group_2__0_in_rule__Goal__Group__23260);
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
    // $ANTLR end rule__Goal__Group__2


    // $ANTLR start rule__Goal__Group_2__0
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1586:1: rule__Goal__Group_2__0 : ( '{' ) rule__Goal__Group_2__1 ;
    public final void rule__Goal__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1590:1: ( ( '{' ) rule__Goal__Group_2__1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1591:1: ( '{' ) rule__Goal__Group_2__1
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1591:1: ( '{' )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1592:1: '{'
            {
             before(grammarAccess.getGoalAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,14,FOLLOW_14_in_rule__Goal__Group_2__03302); 
             after(grammarAccess.getGoalAccess().getLeftCurlyBracketKeyword_2_0()); 

            }

            pushFollow(FOLLOW_rule__Goal__Group_2__1_in_rule__Goal__Group_2__03312);
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


    // $ANTLR start rule__Goal__Group_2__1
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1606:1: rule__Goal__Group_2__1 : ( ( rule__Goal__DecompositionsAssignment_2_1 )* ) rule__Goal__Group_2__2 ;
    public final void rule__Goal__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1610:1: ( ( ( rule__Goal__DecompositionsAssignment_2_1 )* ) rule__Goal__Group_2__2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1611:1: ( ( rule__Goal__DecompositionsAssignment_2_1 )* ) rule__Goal__Group_2__2
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1611:1: ( ( rule__Goal__DecompositionsAssignment_2_1 )* )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1612:1: ( rule__Goal__DecompositionsAssignment_2_1 )*
            {
             before(grammarAccess.getGoalAccess().getDecompositionsAssignment_2_1()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1613:1: ( rule__Goal__DecompositionsAssignment_2_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1613:2: rule__Goal__DecompositionsAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_rule__Goal__DecompositionsAssignment_2_1_in_rule__Goal__Group_2__13340);
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

            pushFollow(FOLLOW_rule__Goal__Group_2__2_in_rule__Goal__Group_2__13350);
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


    // $ANTLR start rule__Goal__Group_2__2
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1624:1: rule__Goal__Group_2__2 : ( '}' ) ;
    public final void rule__Goal__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1628:1: ( ( '}' ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1629:1: ( '}' )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1629:1: ( '}' )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1630:1: '}'
            {
             before(grammarAccess.getGoalAccess().getRightCurlyBracketKeyword_2_2()); 
            match(input,15,FOLLOW_15_in_rule__Goal__Group_2__23379); 
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
    // $ANTLR end rule__Goal__Group_2__2


    // $ANTLR start rule__Softgoal__Group__0
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1649:1: rule__Softgoal__Group__0 : ( 'soft' ) rule__Softgoal__Group__1 ;
    public final void rule__Softgoal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1653:1: ( ( 'soft' ) rule__Softgoal__Group__1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1654:1: ( 'soft' ) rule__Softgoal__Group__1
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1654:1: ( 'soft' )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1655:1: 'soft'
            {
             before(grammarAccess.getSoftgoalAccess().getSoftKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__Softgoal__Group__03421); 
             after(grammarAccess.getSoftgoalAccess().getSoftKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Softgoal__Group__1_in_rule__Softgoal__Group__03431);
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


    // $ANTLR start rule__Softgoal__Group__1
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1669:1: rule__Softgoal__Group__1 : ( ( rule__Softgoal__NameAssignment_1 ) ) ;
    public final void rule__Softgoal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1673:1: ( ( ( rule__Softgoal__NameAssignment_1 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1674:1: ( ( rule__Softgoal__NameAssignment_1 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1674:1: ( ( rule__Softgoal__NameAssignment_1 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1675:1: ( rule__Softgoal__NameAssignment_1 )
            {
             before(grammarAccess.getSoftgoalAccess().getNameAssignment_1()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1676:1: ( rule__Softgoal__NameAssignment_1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1676:2: rule__Softgoal__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Softgoal__NameAssignment_1_in_rule__Softgoal__Group__13459);
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
    // $ANTLR end rule__Softgoal__Group__1


    // $ANTLR start rule__Task__Group__0
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1690:1: rule__Task__Group__0 : ( 'task' ) rule__Task__Group__1 ;
    public final void rule__Task__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1694:1: ( ( 'task' ) rule__Task__Group__1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1695:1: ( 'task' ) rule__Task__Group__1
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1695:1: ( 'task' )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1696:1: 'task'
            {
             before(grammarAccess.getTaskAccess().getTaskKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__Task__Group__03498); 
             after(grammarAccess.getTaskAccess().getTaskKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Task__Group__1_in_rule__Task__Group__03508);
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


    // $ANTLR start rule__Task__Group__1
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1710:1: rule__Task__Group__1 : ( ( rule__Task__NameAssignment_1 ) ) ;
    public final void rule__Task__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1714:1: ( ( ( rule__Task__NameAssignment_1 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1715:1: ( ( rule__Task__NameAssignment_1 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1715:1: ( ( rule__Task__NameAssignment_1 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1716:1: ( rule__Task__NameAssignment_1 )
            {
             before(grammarAccess.getTaskAccess().getNameAssignment_1()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1717:1: ( rule__Task__NameAssignment_1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1717:2: rule__Task__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Task__NameAssignment_1_in_rule__Task__Group__13536);
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
    // $ANTLR end rule__Task__Group__1


    // $ANTLR start rule__Resource__Group__0
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1731:1: rule__Resource__Group__0 : ( 'resource' ) rule__Resource__Group__1 ;
    public final void rule__Resource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1735:1: ( ( 'resource' ) rule__Resource__Group__1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1736:1: ( 'resource' ) rule__Resource__Group__1
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1736:1: ( 'resource' )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1737:1: 'resource'
            {
             before(grammarAccess.getResourceAccess().getResourceKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__Resource__Group__03575); 
             after(grammarAccess.getResourceAccess().getResourceKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Resource__Group__1_in_rule__Resource__Group__03585);
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


    // $ANTLR start rule__Resource__Group__1
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1751:1: rule__Resource__Group__1 : ( ( rule__Resource__NameAssignment_1 ) ) ;
    public final void rule__Resource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1755:1: ( ( ( rule__Resource__NameAssignment_1 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1756:1: ( ( rule__Resource__NameAssignment_1 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1756:1: ( ( rule__Resource__NameAssignment_1 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1757:1: ( rule__Resource__NameAssignment_1 )
            {
             before(grammarAccess.getResourceAccess().getNameAssignment_1()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1758:1: ( rule__Resource__NameAssignment_1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1758:2: rule__Resource__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Resource__NameAssignment_1_in_rule__Resource__Group__13613);
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
    // $ANTLR end rule__Resource__Group__1


    // $ANTLR start rule__Belief__Group__0
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1772:1: rule__Belief__Group__0 : ( 'belief' ) rule__Belief__Group__1 ;
    public final void rule__Belief__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1776:1: ( ( 'belief' ) rule__Belief__Group__1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1777:1: ( 'belief' ) rule__Belief__Group__1
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1777:1: ( 'belief' )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1778:1: 'belief'
            {
             before(grammarAccess.getBeliefAccess().getBeliefKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__Belief__Group__03652); 
             after(grammarAccess.getBeliefAccess().getBeliefKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Belief__Group__1_in_rule__Belief__Group__03662);
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


    // $ANTLR start rule__Belief__Group__1
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1792:1: rule__Belief__Group__1 : ( ( rule__Belief__NameAssignment_1 ) ) ;
    public final void rule__Belief__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1796:1: ( ( ( rule__Belief__NameAssignment_1 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1797:1: ( ( rule__Belief__NameAssignment_1 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1797:1: ( ( rule__Belief__NameAssignment_1 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1798:1: ( rule__Belief__NameAssignment_1 )
            {
             before(grammarAccess.getBeliefAccess().getNameAssignment_1()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1799:1: ( rule__Belief__NameAssignment_1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1799:2: rule__Belief__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Belief__NameAssignment_1_in_rule__Belief__Group__13690);
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
    // $ANTLR end rule__Belief__Group__1


    // $ANTLR start rule__Association__Group__0
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1813:1: rule__Association__Group__0 : ( ( rule__Association__SourceAssignment_0 ) ) rule__Association__Group__1 ;
    public final void rule__Association__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1817:1: ( ( ( rule__Association__SourceAssignment_0 ) ) rule__Association__Group__1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1818:1: ( ( rule__Association__SourceAssignment_0 ) ) rule__Association__Group__1
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1818:1: ( ( rule__Association__SourceAssignment_0 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1819:1: ( rule__Association__SourceAssignment_0 )
            {
             before(grammarAccess.getAssociationAccess().getSourceAssignment_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1820:1: ( rule__Association__SourceAssignment_0 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1820:2: rule__Association__SourceAssignment_0
            {
            pushFollow(FOLLOW_rule__Association__SourceAssignment_0_in_rule__Association__Group__03728);
            rule__Association__SourceAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getAssociationAccess().getSourceAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Association__Group__1_in_rule__Association__Group__03737);
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


    // $ANTLR start rule__Association__Group__1
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1831:1: rule__Association__Group__1 : ( '~~>' ) rule__Association__Group__2 ;
    public final void rule__Association__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1835:1: ( ( '~~>' ) rule__Association__Group__2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1836:1: ( '~~>' ) rule__Association__Group__2
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1836:1: ( '~~>' )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1837:1: '~~>'
            {
             before(grammarAccess.getAssociationAccess().getTildeTildeGreaterThanSignKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__Association__Group__13766); 
             after(grammarAccess.getAssociationAccess().getTildeTildeGreaterThanSignKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__Association__Group__2_in_rule__Association__Group__13776);
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


    // $ANTLR start rule__Association__Group__2
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1851:1: rule__Association__Group__2 : ( ( rule__Association__TargetAssignment_2 ) ) ;
    public final void rule__Association__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1855:1: ( ( ( rule__Association__TargetAssignment_2 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1856:1: ( ( rule__Association__TargetAssignment_2 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1856:1: ( ( rule__Association__TargetAssignment_2 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1857:1: ( rule__Association__TargetAssignment_2 )
            {
             before(grammarAccess.getAssociationAccess().getTargetAssignment_2()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1858:1: ( rule__Association__TargetAssignment_2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1858:2: rule__Association__TargetAssignment_2
            {
            pushFollow(FOLLOW_rule__Association__TargetAssignment_2_in_rule__Association__Group__23804);
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
    // $ANTLR end rule__Association__Group__2


    // $ANTLR start rule__Dependency__Group__0
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1874:1: rule__Dependency__Group__0 : ( ( rule__Dependency__DependencyFromAssignment_0 ) ) rule__Dependency__Group__1 ;
    public final void rule__Dependency__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1878:1: ( ( ( rule__Dependency__DependencyFromAssignment_0 ) ) rule__Dependency__Group__1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1879:1: ( ( rule__Dependency__DependencyFromAssignment_0 ) ) rule__Dependency__Group__1
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1879:1: ( ( rule__Dependency__DependencyFromAssignment_0 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1880:1: ( rule__Dependency__DependencyFromAssignment_0 )
            {
             before(grammarAccess.getDependencyAccess().getDependencyFromAssignment_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1881:1: ( rule__Dependency__DependencyFromAssignment_0 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1881:2: rule__Dependency__DependencyFromAssignment_0
            {
            pushFollow(FOLLOW_rule__Dependency__DependencyFromAssignment_0_in_rule__Dependency__Group__03844);
            rule__Dependency__DependencyFromAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getDependencyAccess().getDependencyFromAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Dependency__Group__1_in_rule__Dependency__Group__03853);
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


    // $ANTLR start rule__Dependency__Group__1
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1892:1: rule__Dependency__Group__1 : ( '~>' ) rule__Dependency__Group__2 ;
    public final void rule__Dependency__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1896:1: ( ( '~>' ) rule__Dependency__Group__2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1897:1: ( '~>' ) rule__Dependency__Group__2
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1897:1: ( '~>' )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1898:1: '~>'
            {
             before(grammarAccess.getDependencyAccess().getTildeGreaterThanSignKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__Dependency__Group__13882); 
             after(grammarAccess.getDependencyAccess().getTildeGreaterThanSignKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__Dependency__Group__2_in_rule__Dependency__Group__13892);
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


    // $ANTLR start rule__Dependency__Group__2
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1912:1: rule__Dependency__Group__2 : ( ( rule__Dependency__DependencyToAssignment_2 ) ) ;
    public final void rule__Dependency__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1916:1: ( ( ( rule__Dependency__DependencyToAssignment_2 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1917:1: ( ( rule__Dependency__DependencyToAssignment_2 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1917:1: ( ( rule__Dependency__DependencyToAssignment_2 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1918:1: ( rule__Dependency__DependencyToAssignment_2 )
            {
             before(grammarAccess.getDependencyAccess().getDependencyToAssignment_2()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1919:1: ( rule__Dependency__DependencyToAssignment_2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1919:2: rule__Dependency__DependencyToAssignment_2
            {
            pushFollow(FOLLOW_rule__Dependency__DependencyToAssignment_2_in_rule__Dependency__Group__23920);
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
    // $ANTLR end rule__Dependency__Group__2


    // $ANTLR start rule__AndDecomposition__Group__0
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1935:1: rule__AndDecomposition__Group__0 : ( ( rule__AndDecomposition__TargetAssignment_0 ) ) rule__AndDecomposition__Group__1 ;
    public final void rule__AndDecomposition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1939:1: ( ( ( rule__AndDecomposition__TargetAssignment_0 ) ) rule__AndDecomposition__Group__1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1940:1: ( ( rule__AndDecomposition__TargetAssignment_0 ) ) rule__AndDecomposition__Group__1
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1940:1: ( ( rule__AndDecomposition__TargetAssignment_0 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1941:1: ( rule__AndDecomposition__TargetAssignment_0 )
            {
             before(grammarAccess.getAndDecompositionAccess().getTargetAssignment_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1942:1: ( rule__AndDecomposition__TargetAssignment_0 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1942:2: rule__AndDecomposition__TargetAssignment_0
            {
            pushFollow(FOLLOW_rule__AndDecomposition__TargetAssignment_0_in_rule__AndDecomposition__Group__03960);
            rule__AndDecomposition__TargetAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getAndDecompositionAccess().getTargetAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__AndDecomposition__Group__1_in_rule__AndDecomposition__Group__03969);
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


    // $ANTLR start rule__AndDecomposition__Group__1
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1953:1: rule__AndDecomposition__Group__1 : ( '<-(and)-' ) rule__AndDecomposition__Group__2 ;
    public final void rule__AndDecomposition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1957:1: ( ( '<-(and)-' ) rule__AndDecomposition__Group__2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1958:1: ( '<-(and)-' ) rule__AndDecomposition__Group__2
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1958:1: ( '<-(and)-' )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1959:1: '<-(and)-'
            {
             before(grammarAccess.getAndDecompositionAccess().getAndKeyword_1()); 
            match(input,26,FOLLOW_26_in_rule__AndDecomposition__Group__13998); 
             after(grammarAccess.getAndDecompositionAccess().getAndKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__AndDecomposition__Group__2_in_rule__AndDecomposition__Group__14008);
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


    // $ANTLR start rule__AndDecomposition__Group__2
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1973:1: rule__AndDecomposition__Group__2 : ( ( rule__AndDecomposition__SourceAssignment_2 ) ) ;
    public final void rule__AndDecomposition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1977:1: ( ( ( rule__AndDecomposition__SourceAssignment_2 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1978:1: ( ( rule__AndDecomposition__SourceAssignment_2 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1978:1: ( ( rule__AndDecomposition__SourceAssignment_2 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1979:1: ( rule__AndDecomposition__SourceAssignment_2 )
            {
             before(grammarAccess.getAndDecompositionAccess().getSourceAssignment_2()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1980:1: ( rule__AndDecomposition__SourceAssignment_2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1980:2: rule__AndDecomposition__SourceAssignment_2
            {
            pushFollow(FOLLOW_rule__AndDecomposition__SourceAssignment_2_in_rule__AndDecomposition__Group__24036);
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
    // $ANTLR end rule__AndDecomposition__Group__2


    // $ANTLR start rule__OrDecomposition__Group__0
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:1996:1: rule__OrDecomposition__Group__0 : ( ( rule__OrDecomposition__TargetAssignment_0 ) ) rule__OrDecomposition__Group__1 ;
    public final void rule__OrDecomposition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2000:1: ( ( ( rule__OrDecomposition__TargetAssignment_0 ) ) rule__OrDecomposition__Group__1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2001:1: ( ( rule__OrDecomposition__TargetAssignment_0 ) ) rule__OrDecomposition__Group__1
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2001:1: ( ( rule__OrDecomposition__TargetAssignment_0 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2002:1: ( rule__OrDecomposition__TargetAssignment_0 )
            {
             before(grammarAccess.getOrDecompositionAccess().getTargetAssignment_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2003:1: ( rule__OrDecomposition__TargetAssignment_0 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2003:2: rule__OrDecomposition__TargetAssignment_0
            {
            pushFollow(FOLLOW_rule__OrDecomposition__TargetAssignment_0_in_rule__OrDecomposition__Group__04076);
            rule__OrDecomposition__TargetAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getOrDecompositionAccess().getTargetAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__OrDecomposition__Group__1_in_rule__OrDecomposition__Group__04085);
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


    // $ANTLR start rule__OrDecomposition__Group__1
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2014:1: rule__OrDecomposition__Group__1 : ( '<-(or)-' ) rule__OrDecomposition__Group__2 ;
    public final void rule__OrDecomposition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2018:1: ( ( '<-(or)-' ) rule__OrDecomposition__Group__2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2019:1: ( '<-(or)-' ) rule__OrDecomposition__Group__2
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2019:1: ( '<-(or)-' )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2020:1: '<-(or)-'
            {
             before(grammarAccess.getOrDecompositionAccess().getOrKeyword_1()); 
            match(input,27,FOLLOW_27_in_rule__OrDecomposition__Group__14114); 
             after(grammarAccess.getOrDecompositionAccess().getOrKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__OrDecomposition__Group__2_in_rule__OrDecomposition__Group__14124);
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


    // $ANTLR start rule__OrDecomposition__Group__2
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2034:1: rule__OrDecomposition__Group__2 : ( ( rule__OrDecomposition__SourceAssignment_2 ) ) ;
    public final void rule__OrDecomposition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2038:1: ( ( ( rule__OrDecomposition__SourceAssignment_2 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2039:1: ( ( rule__OrDecomposition__SourceAssignment_2 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2039:1: ( ( rule__OrDecomposition__SourceAssignment_2 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2040:1: ( rule__OrDecomposition__SourceAssignment_2 )
            {
             before(grammarAccess.getOrDecompositionAccess().getSourceAssignment_2()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2041:1: ( rule__OrDecomposition__SourceAssignment_2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2041:2: rule__OrDecomposition__SourceAssignment_2
            {
            pushFollow(FOLLOW_rule__OrDecomposition__SourceAssignment_2_in_rule__OrDecomposition__Group__24152);
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
    // $ANTLR end rule__OrDecomposition__Group__2


    // $ANTLR start rule__AndContribution__Group__0
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2057:1: rule__AndContribution__Group__0 : ( ( rule__AndContribution__SourceAssignment_0 ) ) rule__AndContribution__Group__1 ;
    public final void rule__AndContribution__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2061:1: ( ( ( rule__AndContribution__SourceAssignment_0 ) ) rule__AndContribution__Group__1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2062:1: ( ( rule__AndContribution__SourceAssignment_0 ) ) rule__AndContribution__Group__1
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2062:1: ( ( rule__AndContribution__SourceAssignment_0 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2063:1: ( rule__AndContribution__SourceAssignment_0 )
            {
             before(grammarAccess.getAndContributionAccess().getSourceAssignment_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2064:1: ( rule__AndContribution__SourceAssignment_0 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2064:2: rule__AndContribution__SourceAssignment_0
            {
            pushFollow(FOLLOW_rule__AndContribution__SourceAssignment_0_in_rule__AndContribution__Group__04192);
            rule__AndContribution__SourceAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getAndContributionAccess().getSourceAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__AndContribution__Group__1_in_rule__AndContribution__Group__04201);
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


    // $ANTLR start rule__AndContribution__Group__1
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2075:1: rule__AndContribution__Group__1 : ( '-(and)->' ) rule__AndContribution__Group__2 ;
    public final void rule__AndContribution__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2079:1: ( ( '-(and)->' ) rule__AndContribution__Group__2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2080:1: ( '-(and)->' ) rule__AndContribution__Group__2
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2080:1: ( '-(and)->' )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2081:1: '-(and)->'
            {
             before(grammarAccess.getAndContributionAccess().getAndKeyword_1()); 
            match(input,28,FOLLOW_28_in_rule__AndContribution__Group__14230); 
             after(grammarAccess.getAndContributionAccess().getAndKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__AndContribution__Group__2_in_rule__AndContribution__Group__14240);
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


    // $ANTLR start rule__AndContribution__Group__2
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2095:1: rule__AndContribution__Group__2 : ( ( rule__AndContribution__TargetAssignment_2 ) ) ;
    public final void rule__AndContribution__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2099:1: ( ( ( rule__AndContribution__TargetAssignment_2 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2100:1: ( ( rule__AndContribution__TargetAssignment_2 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2100:1: ( ( rule__AndContribution__TargetAssignment_2 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2101:1: ( rule__AndContribution__TargetAssignment_2 )
            {
             before(grammarAccess.getAndContributionAccess().getTargetAssignment_2()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2102:1: ( rule__AndContribution__TargetAssignment_2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2102:2: rule__AndContribution__TargetAssignment_2
            {
            pushFollow(FOLLOW_rule__AndContribution__TargetAssignment_2_in_rule__AndContribution__Group__24268);
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
    // $ANTLR end rule__AndContribution__Group__2


    // $ANTLR start rule__OrContribution__Group__0
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2118:1: rule__OrContribution__Group__0 : ( ( rule__OrContribution__SourceAssignment_0 ) ) rule__OrContribution__Group__1 ;
    public final void rule__OrContribution__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2122:1: ( ( ( rule__OrContribution__SourceAssignment_0 ) ) rule__OrContribution__Group__1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2123:1: ( ( rule__OrContribution__SourceAssignment_0 ) ) rule__OrContribution__Group__1
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2123:1: ( ( rule__OrContribution__SourceAssignment_0 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2124:1: ( rule__OrContribution__SourceAssignment_0 )
            {
             before(grammarAccess.getOrContributionAccess().getSourceAssignment_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2125:1: ( rule__OrContribution__SourceAssignment_0 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2125:2: rule__OrContribution__SourceAssignment_0
            {
            pushFollow(FOLLOW_rule__OrContribution__SourceAssignment_0_in_rule__OrContribution__Group__04308);
            rule__OrContribution__SourceAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getOrContributionAccess().getSourceAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__OrContribution__Group__1_in_rule__OrContribution__Group__04317);
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


    // $ANTLR start rule__OrContribution__Group__1
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2136:1: rule__OrContribution__Group__1 : ( '-(or)->' ) rule__OrContribution__Group__2 ;
    public final void rule__OrContribution__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2140:1: ( ( '-(or)->' ) rule__OrContribution__Group__2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2141:1: ( '-(or)->' ) rule__OrContribution__Group__2
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2141:1: ( '-(or)->' )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2142:1: '-(or)->'
            {
             before(grammarAccess.getOrContributionAccess().getOrKeyword_1()); 
            match(input,29,FOLLOW_29_in_rule__OrContribution__Group__14346); 
             after(grammarAccess.getOrContributionAccess().getOrKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__OrContribution__Group__2_in_rule__OrContribution__Group__14356);
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


    // $ANTLR start rule__OrContribution__Group__2
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2156:1: rule__OrContribution__Group__2 : ( ( rule__OrContribution__TargetAssignment_2 ) ) ;
    public final void rule__OrContribution__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2160:1: ( ( ( rule__OrContribution__TargetAssignment_2 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2161:1: ( ( rule__OrContribution__TargetAssignment_2 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2161:1: ( ( rule__OrContribution__TargetAssignment_2 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2162:1: ( rule__OrContribution__TargetAssignment_2 )
            {
             before(grammarAccess.getOrContributionAccess().getTargetAssignment_2()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2163:1: ( rule__OrContribution__TargetAssignment_2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2163:2: rule__OrContribution__TargetAssignment_2
            {
            pushFollow(FOLLOW_rule__OrContribution__TargetAssignment_2_in_rule__OrContribution__Group__24384);
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
    // $ANTLR end rule__OrContribution__Group__2


    // $ANTLR start rule__HelpContribution__Group__0
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2179:1: rule__HelpContribution__Group__0 : ( ( rule__HelpContribution__SourceAssignment_0 ) ) rule__HelpContribution__Group__1 ;
    public final void rule__HelpContribution__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2183:1: ( ( ( rule__HelpContribution__SourceAssignment_0 ) ) rule__HelpContribution__Group__1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2184:1: ( ( rule__HelpContribution__SourceAssignment_0 ) ) rule__HelpContribution__Group__1
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2184:1: ( ( rule__HelpContribution__SourceAssignment_0 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2185:1: ( rule__HelpContribution__SourceAssignment_0 )
            {
             before(grammarAccess.getHelpContributionAccess().getSourceAssignment_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2186:1: ( rule__HelpContribution__SourceAssignment_0 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2186:2: rule__HelpContribution__SourceAssignment_0
            {
            pushFollow(FOLLOW_rule__HelpContribution__SourceAssignment_0_in_rule__HelpContribution__Group__04424);
            rule__HelpContribution__SourceAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getHelpContributionAccess().getSourceAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__HelpContribution__Group__1_in_rule__HelpContribution__Group__04433);
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


    // $ANTLR start rule__HelpContribution__Group__1
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2197:1: rule__HelpContribution__Group__1 : ( '-(+)->' ) rule__HelpContribution__Group__2 ;
    public final void rule__HelpContribution__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2201:1: ( ( '-(+)->' ) rule__HelpContribution__Group__2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2202:1: ( '-(+)->' ) rule__HelpContribution__Group__2
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2202:1: ( '-(+)->' )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2203:1: '-(+)->'
            {
             before(grammarAccess.getHelpContributionAccess().getHyphenMinusLeftParenthesisPlusSignRightParenthesisHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,30,FOLLOW_30_in_rule__HelpContribution__Group__14462); 
             after(grammarAccess.getHelpContributionAccess().getHyphenMinusLeftParenthesisPlusSignRightParenthesisHyphenMinusGreaterThanSignKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__HelpContribution__Group__2_in_rule__HelpContribution__Group__14472);
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


    // $ANTLR start rule__HelpContribution__Group__2
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2217:1: rule__HelpContribution__Group__2 : ( ( rule__HelpContribution__TargetAssignment_2 ) ) ;
    public final void rule__HelpContribution__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2221:1: ( ( ( rule__HelpContribution__TargetAssignment_2 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2222:1: ( ( rule__HelpContribution__TargetAssignment_2 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2222:1: ( ( rule__HelpContribution__TargetAssignment_2 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2223:1: ( rule__HelpContribution__TargetAssignment_2 )
            {
             before(grammarAccess.getHelpContributionAccess().getTargetAssignment_2()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2224:1: ( rule__HelpContribution__TargetAssignment_2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2224:2: rule__HelpContribution__TargetAssignment_2
            {
            pushFollow(FOLLOW_rule__HelpContribution__TargetAssignment_2_in_rule__HelpContribution__Group__24500);
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
    // $ANTLR end rule__HelpContribution__Group__2


    // $ANTLR start rule__MakeContribution__Group__0
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2240:1: rule__MakeContribution__Group__0 : ( ( rule__MakeContribution__SourceAssignment_0 ) ) rule__MakeContribution__Group__1 ;
    public final void rule__MakeContribution__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2244:1: ( ( ( rule__MakeContribution__SourceAssignment_0 ) ) rule__MakeContribution__Group__1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2245:1: ( ( rule__MakeContribution__SourceAssignment_0 ) ) rule__MakeContribution__Group__1
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2245:1: ( ( rule__MakeContribution__SourceAssignment_0 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2246:1: ( rule__MakeContribution__SourceAssignment_0 )
            {
             before(grammarAccess.getMakeContributionAccess().getSourceAssignment_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2247:1: ( rule__MakeContribution__SourceAssignment_0 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2247:2: rule__MakeContribution__SourceAssignment_0
            {
            pushFollow(FOLLOW_rule__MakeContribution__SourceAssignment_0_in_rule__MakeContribution__Group__04540);
            rule__MakeContribution__SourceAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getMakeContributionAccess().getSourceAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__MakeContribution__Group__1_in_rule__MakeContribution__Group__04549);
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


    // $ANTLR start rule__MakeContribution__Group__1
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2258:1: rule__MakeContribution__Group__1 : ( '-(++)->' ) rule__MakeContribution__Group__2 ;
    public final void rule__MakeContribution__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2262:1: ( ( '-(++)->' ) rule__MakeContribution__Group__2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2263:1: ( '-(++)->' ) rule__MakeContribution__Group__2
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2263:1: ( '-(++)->' )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2264:1: '-(++)->'
            {
             before(grammarAccess.getMakeContributionAccess().getHyphenMinusLeftParenthesisPlusSignPlusSignRightParenthesisHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,31,FOLLOW_31_in_rule__MakeContribution__Group__14578); 
             after(grammarAccess.getMakeContributionAccess().getHyphenMinusLeftParenthesisPlusSignPlusSignRightParenthesisHyphenMinusGreaterThanSignKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__MakeContribution__Group__2_in_rule__MakeContribution__Group__14588);
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


    // $ANTLR start rule__MakeContribution__Group__2
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2278:1: rule__MakeContribution__Group__2 : ( ( rule__MakeContribution__TargetAssignment_2 ) ) ;
    public final void rule__MakeContribution__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2282:1: ( ( ( rule__MakeContribution__TargetAssignment_2 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2283:1: ( ( rule__MakeContribution__TargetAssignment_2 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2283:1: ( ( rule__MakeContribution__TargetAssignment_2 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2284:1: ( rule__MakeContribution__TargetAssignment_2 )
            {
             before(grammarAccess.getMakeContributionAccess().getTargetAssignment_2()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2285:1: ( rule__MakeContribution__TargetAssignment_2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2285:2: rule__MakeContribution__TargetAssignment_2
            {
            pushFollow(FOLLOW_rule__MakeContribution__TargetAssignment_2_in_rule__MakeContribution__Group__24616);
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
    // $ANTLR end rule__MakeContribution__Group__2


    // $ANTLR start rule__HurtContribution__Group__0
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2301:1: rule__HurtContribution__Group__0 : ( ( rule__HurtContribution__SourceAssignment_0 ) ) rule__HurtContribution__Group__1 ;
    public final void rule__HurtContribution__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2305:1: ( ( ( rule__HurtContribution__SourceAssignment_0 ) ) rule__HurtContribution__Group__1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2306:1: ( ( rule__HurtContribution__SourceAssignment_0 ) ) rule__HurtContribution__Group__1
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2306:1: ( ( rule__HurtContribution__SourceAssignment_0 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2307:1: ( rule__HurtContribution__SourceAssignment_0 )
            {
             before(grammarAccess.getHurtContributionAccess().getSourceAssignment_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2308:1: ( rule__HurtContribution__SourceAssignment_0 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2308:2: rule__HurtContribution__SourceAssignment_0
            {
            pushFollow(FOLLOW_rule__HurtContribution__SourceAssignment_0_in_rule__HurtContribution__Group__04656);
            rule__HurtContribution__SourceAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getHurtContributionAccess().getSourceAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__HurtContribution__Group__1_in_rule__HurtContribution__Group__04665);
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


    // $ANTLR start rule__HurtContribution__Group__1
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2319:1: rule__HurtContribution__Group__1 : ( '-(-)->' ) rule__HurtContribution__Group__2 ;
    public final void rule__HurtContribution__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2323:1: ( ( '-(-)->' ) rule__HurtContribution__Group__2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2324:1: ( '-(-)->' ) rule__HurtContribution__Group__2
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2324:1: ( '-(-)->' )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2325:1: '-(-)->'
            {
             before(grammarAccess.getHurtContributionAccess().getHyphenMinusLeftParenthesisHyphenMinusRightParenthesisHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,32,FOLLOW_32_in_rule__HurtContribution__Group__14694); 
             after(grammarAccess.getHurtContributionAccess().getHyphenMinusLeftParenthesisHyphenMinusRightParenthesisHyphenMinusGreaterThanSignKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__HurtContribution__Group__2_in_rule__HurtContribution__Group__14704);
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


    // $ANTLR start rule__HurtContribution__Group__2
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2339:1: rule__HurtContribution__Group__2 : ( ( rule__HurtContribution__TargetAssignment_2 ) ) ;
    public final void rule__HurtContribution__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2343:1: ( ( ( rule__HurtContribution__TargetAssignment_2 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2344:1: ( ( rule__HurtContribution__TargetAssignment_2 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2344:1: ( ( rule__HurtContribution__TargetAssignment_2 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2345:1: ( rule__HurtContribution__TargetAssignment_2 )
            {
             before(grammarAccess.getHurtContributionAccess().getTargetAssignment_2()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2346:1: ( rule__HurtContribution__TargetAssignment_2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2346:2: rule__HurtContribution__TargetAssignment_2
            {
            pushFollow(FOLLOW_rule__HurtContribution__TargetAssignment_2_in_rule__HurtContribution__Group__24732);
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
    // $ANTLR end rule__HurtContribution__Group__2


    // $ANTLR start rule__BreakContribution__Group__0
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2362:1: rule__BreakContribution__Group__0 : ( ( rule__BreakContribution__SourceAssignment_0 ) ) rule__BreakContribution__Group__1 ;
    public final void rule__BreakContribution__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2366:1: ( ( ( rule__BreakContribution__SourceAssignment_0 ) ) rule__BreakContribution__Group__1 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2367:1: ( ( rule__BreakContribution__SourceAssignment_0 ) ) rule__BreakContribution__Group__1
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2367:1: ( ( rule__BreakContribution__SourceAssignment_0 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2368:1: ( rule__BreakContribution__SourceAssignment_0 )
            {
             before(grammarAccess.getBreakContributionAccess().getSourceAssignment_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2369:1: ( rule__BreakContribution__SourceAssignment_0 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2369:2: rule__BreakContribution__SourceAssignment_0
            {
            pushFollow(FOLLOW_rule__BreakContribution__SourceAssignment_0_in_rule__BreakContribution__Group__04772);
            rule__BreakContribution__SourceAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getBreakContributionAccess().getSourceAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__BreakContribution__Group__1_in_rule__BreakContribution__Group__04781);
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


    // $ANTLR start rule__BreakContribution__Group__1
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2380:1: rule__BreakContribution__Group__1 : ( '-(--)->' ) rule__BreakContribution__Group__2 ;
    public final void rule__BreakContribution__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2384:1: ( ( '-(--)->' ) rule__BreakContribution__Group__2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2385:1: ( '-(--)->' ) rule__BreakContribution__Group__2
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2385:1: ( '-(--)->' )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2386:1: '-(--)->'
            {
             before(grammarAccess.getBreakContributionAccess().getHyphenMinusLeftParenthesisHyphenMinusHyphenMinusRightParenthesisHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,33,FOLLOW_33_in_rule__BreakContribution__Group__14810); 
             after(grammarAccess.getBreakContributionAccess().getHyphenMinusLeftParenthesisHyphenMinusHyphenMinusRightParenthesisHyphenMinusGreaterThanSignKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__BreakContribution__Group__2_in_rule__BreakContribution__Group__14820);
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


    // $ANTLR start rule__BreakContribution__Group__2
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2400:1: rule__BreakContribution__Group__2 : ( ( rule__BreakContribution__TargetAssignment_2 ) ) ;
    public final void rule__BreakContribution__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2404:1: ( ( ( rule__BreakContribution__TargetAssignment_2 ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2405:1: ( ( rule__BreakContribution__TargetAssignment_2 ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2405:1: ( ( rule__BreakContribution__TargetAssignment_2 ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2406:1: ( rule__BreakContribution__TargetAssignment_2 )
            {
             before(grammarAccess.getBreakContributionAccess().getTargetAssignment_2()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2407:1: ( rule__BreakContribution__TargetAssignment_2 )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2407:2: rule__BreakContribution__TargetAssignment_2
            {
            pushFollow(FOLLOW_rule__BreakContribution__TargetAssignment_2_in_rule__BreakContribution__Group__24848);
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
    // $ANTLR end rule__BreakContribution__Group__2


    // $ANTLR start rule__Model__NameAssignment_1
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2423:1: rule__Model__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2427:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2428:1: ( RULE_ID )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2428:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2429:1: RULE_ID
            {
             before(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Model__NameAssignment_14888); 
             after(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__NameAssignment_1


    // $ANTLR start rule__Model__ContainersAssignment_3_0
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2438:1: rule__Model__ContainersAssignment_3_0 : ( ruleContainer ) ;
    public final void rule__Model__ContainersAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2442:1: ( ( ruleContainer ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2443:1: ( ruleContainer )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2443:1: ( ruleContainer )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2444:1: ruleContainer
            {
             before(grammarAccess.getModelAccess().getContainersContainerParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_ruleContainer_in_rule__Model__ContainersAssignment_3_04919);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2453:1: rule__Model__IntentionsAssignment_3_1 : ( ruleIntention ) ;
    public final void rule__Model__IntentionsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2457:1: ( ( ruleIntention ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2458:1: ( ruleIntention )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2458:1: ( ruleIntention )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2459:1: ruleIntention
            {
             before(grammarAccess.getModelAccess().getIntentionsIntentionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleIntention_in_rule__Model__IntentionsAssignment_3_14950);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2468:1: rule__Model__DecompositionsAssignment_3_2 : ( ruleDecomposition ) ;
    public final void rule__Model__DecompositionsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2472:1: ( ( ruleDecomposition ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2473:1: ( ruleDecomposition )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2473:1: ( ruleDecomposition )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2474:1: ruleDecomposition
            {
             before(grammarAccess.getModelAccess().getDecompositionsDecompositionParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_ruleDecomposition_in_rule__Model__DecompositionsAssignment_3_24981);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2483:1: rule__Model__DependenciesAssignment_3_3 : ( ruleDependency ) ;
    public final void rule__Model__DependenciesAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2487:1: ( ( ruleDependency ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2488:1: ( ruleDependency )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2488:1: ( ruleDependency )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2489:1: ruleDependency
            {
             before(grammarAccess.getModelAccess().getDependenciesDependencyParserRuleCall_3_3_0()); 
            pushFollow(FOLLOW_ruleDependency_in_rule__Model__DependenciesAssignment_3_35012);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2498:1: rule__Model__ContributionsAssignment_3_4 : ( ruleContribution ) ;
    public final void rule__Model__ContributionsAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2502:1: ( ( ruleContribution ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2503:1: ( ruleContribution )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2503:1: ( ruleContribution )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2504:1: ruleContribution
            {
             before(grammarAccess.getModelAccess().getContributionsContributionParserRuleCall_3_4_0()); 
            pushFollow(FOLLOW_ruleContribution_in_rule__Model__ContributionsAssignment_3_45043);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2513:1: rule__Model__AssociationsAssignment_3_5 : ( ruleAssociation ) ;
    public final void rule__Model__AssociationsAssignment_3_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2517:1: ( ( ruleAssociation ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2518:1: ( ruleAssociation )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2518:1: ( ruleAssociation )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2519:1: ruleAssociation
            {
             before(grammarAccess.getModelAccess().getAssociationsAssociationParserRuleCall_3_5_0()); 
            pushFollow(FOLLOW_ruleAssociation_in_rule__Model__AssociationsAssignment_3_55074);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2528:1: rule__Actor__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Actor__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2532:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2533:1: ( RULE_ID )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2533:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2534:1: RULE_ID
            {
             before(grammarAccess.getActorAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Actor__NameAssignment_15105); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2543:1: rule__Actor__Is_aAssignment_2_0 : ( ( RULE_ID ) ) ;
    public final void rule__Actor__Is_aAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2547:1: ( ( ( RULE_ID ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2548:1: ( ( RULE_ID ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2548:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2549:1: ( RULE_ID )
            {
             before(grammarAccess.getActorAccess().getIs_aActorCrossReference_2_0_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2550:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2551:1: RULE_ID
            {
             before(grammarAccess.getActorAccess().getIs_aActorIDTerminalRuleCall_2_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Actor__Is_aAssignment_2_05140); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2562:1: rule__Actor__Is_part_ofAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Actor__Is_part_ofAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2566:1: ( ( ( RULE_ID ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2567:1: ( ( RULE_ID ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2567:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2568:1: ( RULE_ID )
            {
             before(grammarAccess.getActorAccess().getIs_part_ofActorCrossReference_2_1_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2569:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2570:1: RULE_ID
            {
             before(grammarAccess.getActorAccess().getIs_part_ofActorIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Actor__Is_part_ofAssignment_2_15179); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2581:1: rule__Actor__IntentionsAssignment_3_1 : ( ruleIntention ) ;
    public final void rule__Actor__IntentionsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2585:1: ( ( ruleIntention ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2586:1: ( ruleIntention )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2586:1: ( ruleIntention )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2587:1: ruleIntention
            {
             before(grammarAccess.getActorAccess().getIntentionsIntentionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleIntention_in_rule__Actor__IntentionsAssignment_3_15214);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2596:1: rule__Agent__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Agent__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2600:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2601:1: ( RULE_ID )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2601:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2602:1: RULE_ID
            {
             before(grammarAccess.getAgentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Agent__NameAssignment_15245); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2611:1: rule__Agent__IntentionsAssignment_2_1 : ( ruleIntention ) ;
    public final void rule__Agent__IntentionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2615:1: ( ( ruleIntention ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2616:1: ( ruleIntention )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2616:1: ( ruleIntention )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2617:1: ruleIntention
            {
             before(grammarAccess.getAgentAccess().getIntentionsIntentionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleIntention_in_rule__Agent__IntentionsAssignment_2_15276);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2626:1: rule__Role__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Role__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2630:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2631:1: ( RULE_ID )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2631:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2632:1: RULE_ID
            {
             before(grammarAccess.getRoleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Role__NameAssignment_15307); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2641:1: rule__Role__IntentionsAssignment_2_1 : ( ruleIntention ) ;
    public final void rule__Role__IntentionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2645:1: ( ( ruleIntention ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2646:1: ( ruleIntention )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2646:1: ( ruleIntention )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2647:1: ruleIntention
            {
             before(grammarAccess.getRoleAccess().getIntentionsIntentionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleIntention_in_rule__Role__IntentionsAssignment_2_15338);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2656:1: rule__Position__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Position__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2660:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2661:1: ( RULE_ID )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2661:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2662:1: RULE_ID
            {
             before(grammarAccess.getPositionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Position__NameAssignment_15369); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2671:1: rule__Position__IntentionsAssignment_2_1 : ( ruleIntention ) ;
    public final void rule__Position__IntentionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2675:1: ( ( ruleIntention ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2676:1: ( ruleIntention )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2676:1: ( ruleIntention )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2677:1: ruleIntention
            {
             before(grammarAccess.getPositionAccess().getIntentionsIntentionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleIntention_in_rule__Position__IntentionsAssignment_2_15400);
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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2686:1: rule__Goal__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Goal__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2690:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2691:1: ( RULE_ID )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2691:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2692:1: RULE_ID
            {
             before(grammarAccess.getGoalAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Goal__NameAssignment_15431); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2701:1: rule__Goal__DecompositionsAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Goal__DecompositionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2705:1: ( ( ( RULE_ID ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2706:1: ( ( RULE_ID ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2706:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2707:1: ( RULE_ID )
            {
             before(grammarAccess.getGoalAccess().getDecompositionsDecompositionCrossReference_2_1_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2708:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2709:1: RULE_ID
            {
             before(grammarAccess.getGoalAccess().getDecompositionsDecompositionIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Goal__DecompositionsAssignment_2_15466); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2720:1: rule__Softgoal__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Softgoal__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2724:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2725:1: ( RULE_ID )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2725:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2726:1: RULE_ID
            {
             before(grammarAccess.getSoftgoalAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Softgoal__NameAssignment_15501); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2735:1: rule__Task__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Task__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2739:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2740:1: ( RULE_ID )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2740:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2741:1: RULE_ID
            {
             before(grammarAccess.getTaskAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Task__NameAssignment_15532); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2750:1: rule__Resource__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Resource__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2754:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2755:1: ( RULE_ID )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2755:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2756:1: RULE_ID
            {
             before(grammarAccess.getResourceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Resource__NameAssignment_15563); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2765:1: rule__Belief__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Belief__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2769:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2770:1: ( RULE_ID )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2770:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2771:1: RULE_ID
            {
             before(grammarAccess.getBeliefAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Belief__NameAssignment_15594); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2780:1: rule__Association__SourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Association__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2784:1: ( ( ( RULE_ID ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2785:1: ( ( RULE_ID ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2785:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2786:1: ( RULE_ID )
            {
             before(grammarAccess.getAssociationAccess().getSourceContainerCrossReference_0_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2787:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2788:1: RULE_ID
            {
             before(grammarAccess.getAssociationAccess().getSourceContainerIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Association__SourceAssignment_05629); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2799:1: rule__Association__TargetAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Association__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2803:1: ( ( ( RULE_ID ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2804:1: ( ( RULE_ID ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2804:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2805:1: ( RULE_ID )
            {
             before(grammarAccess.getAssociationAccess().getTargetContainerCrossReference_2_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2806:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2807:1: RULE_ID
            {
             before(grammarAccess.getAssociationAccess().getTargetContainerIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Association__TargetAssignment_25668); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2818:1: rule__Dependency__DependencyFromAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Dependency__DependencyFromAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2822:1: ( ( ( RULE_ID ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2823:1: ( ( RULE_ID ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2823:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2824:1: ( RULE_ID )
            {
             before(grammarAccess.getDependencyAccess().getDependencyFromDependableCrossReference_0_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2825:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2826:1: RULE_ID
            {
             before(grammarAccess.getDependencyAccess().getDependencyFromDependableIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Dependency__DependencyFromAssignment_05707); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2837:1: rule__Dependency__DependencyToAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Dependency__DependencyToAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2841:1: ( ( ( RULE_ID ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2842:1: ( ( RULE_ID ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2842:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2843:1: ( RULE_ID )
            {
             before(grammarAccess.getDependencyAccess().getDependencyToDependableCrossReference_2_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2844:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2845:1: RULE_ID
            {
             before(grammarAccess.getDependencyAccess().getDependencyToDependableIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Dependency__DependencyToAssignment_25746); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2856:1: rule__AndDecomposition__TargetAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__AndDecomposition__TargetAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2860:1: ( ( ( RULE_ID ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2861:1: ( ( RULE_ID ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2861:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2862:1: ( RULE_ID )
            {
             before(grammarAccess.getAndDecompositionAccess().getTargetIntentionCrossReference_0_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2863:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2864:1: RULE_ID
            {
             before(grammarAccess.getAndDecompositionAccess().getTargetIntentionIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AndDecomposition__TargetAssignment_05785); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2875:1: rule__AndDecomposition__SourceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__AndDecomposition__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2879:1: ( ( ( RULE_ID ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2880:1: ( ( RULE_ID ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2880:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2881:1: ( RULE_ID )
            {
             before(grammarAccess.getAndDecompositionAccess().getSourceIntentionCrossReference_2_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2882:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2883:1: RULE_ID
            {
             before(grammarAccess.getAndDecompositionAccess().getSourceIntentionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AndDecomposition__SourceAssignment_25824); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2894:1: rule__OrDecomposition__TargetAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__OrDecomposition__TargetAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2898:1: ( ( ( RULE_ID ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2899:1: ( ( RULE_ID ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2899:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2900:1: ( RULE_ID )
            {
             before(grammarAccess.getOrDecompositionAccess().getTargetIntentionCrossReference_0_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2901:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2902:1: RULE_ID
            {
             before(grammarAccess.getOrDecompositionAccess().getTargetIntentionIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__OrDecomposition__TargetAssignment_05863); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2913:1: rule__OrDecomposition__SourceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__OrDecomposition__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2917:1: ( ( ( RULE_ID ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2918:1: ( ( RULE_ID ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2918:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2919:1: ( RULE_ID )
            {
             before(grammarAccess.getOrDecompositionAccess().getSourceIntentionCrossReference_2_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2920:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2921:1: RULE_ID
            {
             before(grammarAccess.getOrDecompositionAccess().getSourceIntentionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__OrDecomposition__SourceAssignment_25902); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2932:1: rule__AndContribution__SourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__AndContribution__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2936:1: ( ( ( RULE_ID ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2937:1: ( ( RULE_ID ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2937:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2938:1: ( RULE_ID )
            {
             before(grammarAccess.getAndContributionAccess().getSourceIntentionCrossReference_0_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2939:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2940:1: RULE_ID
            {
             before(grammarAccess.getAndContributionAccess().getSourceIntentionIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AndContribution__SourceAssignment_05941); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2951:1: rule__AndContribution__TargetAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__AndContribution__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2955:1: ( ( ( RULE_ID ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2956:1: ( ( RULE_ID ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2956:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2957:1: ( RULE_ID )
            {
             before(grammarAccess.getAndContributionAccess().getTargetIntentionCrossReference_2_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2958:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2959:1: RULE_ID
            {
             before(grammarAccess.getAndContributionAccess().getTargetIntentionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AndContribution__TargetAssignment_25980); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2970:1: rule__OrContribution__SourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__OrContribution__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2974:1: ( ( ( RULE_ID ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2975:1: ( ( RULE_ID ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2975:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2976:1: ( RULE_ID )
            {
             before(grammarAccess.getOrContributionAccess().getSourceIntentionCrossReference_0_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2977:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2978:1: RULE_ID
            {
             before(grammarAccess.getOrContributionAccess().getSourceIntentionIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__OrContribution__SourceAssignment_06019); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2989:1: rule__OrContribution__TargetAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__OrContribution__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2993:1: ( ( ( RULE_ID ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2994:1: ( ( RULE_ID ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2994:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2995:1: ( RULE_ID )
            {
             before(grammarAccess.getOrContributionAccess().getTargetIntentionCrossReference_2_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2996:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:2997:1: RULE_ID
            {
             before(grammarAccess.getOrContributionAccess().getTargetIntentionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__OrContribution__TargetAssignment_26058); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:3008:1: rule__HelpContribution__SourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__HelpContribution__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:3012:1: ( ( ( RULE_ID ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:3013:1: ( ( RULE_ID ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:3013:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:3014:1: ( RULE_ID )
            {
             before(grammarAccess.getHelpContributionAccess().getSourceIntentionCrossReference_0_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:3015:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:3016:1: RULE_ID
            {
             before(grammarAccess.getHelpContributionAccess().getSourceIntentionIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__HelpContribution__SourceAssignment_06097); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:3027:1: rule__HelpContribution__TargetAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__HelpContribution__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:3031:1: ( ( ( RULE_ID ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:3032:1: ( ( RULE_ID ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:3032:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:3033:1: ( RULE_ID )
            {
             before(grammarAccess.getHelpContributionAccess().getTargetIntentionCrossReference_2_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:3034:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:3035:1: RULE_ID
            {
             before(grammarAccess.getHelpContributionAccess().getTargetIntentionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__HelpContribution__TargetAssignment_26136); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:3046:1: rule__MakeContribution__SourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__MakeContribution__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:3050:1: ( ( ( RULE_ID ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:3051:1: ( ( RULE_ID ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:3051:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:3052:1: ( RULE_ID )
            {
             before(grammarAccess.getMakeContributionAccess().getSourceIntentionCrossReference_0_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:3053:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:3054:1: RULE_ID
            {
             before(grammarAccess.getMakeContributionAccess().getSourceIntentionIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MakeContribution__SourceAssignment_06175); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:3065:1: rule__MakeContribution__TargetAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__MakeContribution__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:3069:1: ( ( ( RULE_ID ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:3070:1: ( ( RULE_ID ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:3070:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:3071:1: ( RULE_ID )
            {
             before(grammarAccess.getMakeContributionAccess().getTargetIntentionCrossReference_2_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:3072:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:3073:1: RULE_ID
            {
             before(grammarAccess.getMakeContributionAccess().getTargetIntentionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MakeContribution__TargetAssignment_26214); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:3084:1: rule__HurtContribution__SourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__HurtContribution__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:3088:1: ( ( ( RULE_ID ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:3089:1: ( ( RULE_ID ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:3089:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:3090:1: ( RULE_ID )
            {
             before(grammarAccess.getHurtContributionAccess().getSourceIntentionCrossReference_0_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:3091:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:3092:1: RULE_ID
            {
             before(grammarAccess.getHurtContributionAccess().getSourceIntentionIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__HurtContribution__SourceAssignment_06253); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:3103:1: rule__HurtContribution__TargetAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__HurtContribution__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:3107:1: ( ( ( RULE_ID ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:3108:1: ( ( RULE_ID ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:3108:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:3109:1: ( RULE_ID )
            {
             before(grammarAccess.getHurtContributionAccess().getTargetIntentionCrossReference_2_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:3110:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:3111:1: RULE_ID
            {
             before(grammarAccess.getHurtContributionAccess().getTargetIntentionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__HurtContribution__TargetAssignment_26292); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:3122:1: rule__BreakContribution__SourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__BreakContribution__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:3126:1: ( ( ( RULE_ID ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:3127:1: ( ( RULE_ID ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:3127:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:3128:1: ( RULE_ID )
            {
             before(grammarAccess.getBreakContributionAccess().getSourceIntentionCrossReference_0_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:3129:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:3130:1: RULE_ID
            {
             before(grammarAccess.getBreakContributionAccess().getSourceIntentionIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BreakContribution__SourceAssignment_06331); 
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
    // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:3141:1: rule__BreakContribution__TargetAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__BreakContribution__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:3145:1: ( ( ( RULE_ID ) ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:3146:1: ( ( RULE_ID ) )
            {
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:3146:1: ( ( RULE_ID ) )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:3147:1: ( RULE_ID )
            {
             before(grammarAccess.getBreakContributionAccess().getTargetIntentionCrossReference_2_0()); 
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:3148:1: ( RULE_ID )
            // ../istar.ui/src-gen/uk/ac/open/istar/contentassist/antlr/internal/InternalIstar.g:3149:1: RULE_ID
            {
             before(grammarAccess.getBreakContributionAccess().getTargetIntentionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BreakContribution__TargetAssignment_26370); 
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


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel60 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel67 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainer_in_entryRuleContainer120 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContainer127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Container__Alternatives_in_ruleContainer154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActor_in_entryRuleActor180 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActor187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actor__Group__0_in_ruleActor214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAgent_in_entryRuleAgent240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAgent247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Agent__Group__0_in_ruleAgent274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRole_in_entryRuleRole300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRole307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group__0_in_ruleRole334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePosition_in_entryRulePosition360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePosition367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Position__Group__0_in_rulePosition394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntention_in_entryRuleIntention420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntention427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Intention__Alternatives_in_ruleIntention454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoal_in_entryRuleGoal480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoal487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goal__Group__0_in_ruleGoal514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSoftgoal_in_entryRuleSoftgoal540 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSoftgoal547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Softgoal__Group__0_in_ruleSoftgoal574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTask_in_entryRuleTask600 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTask607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group__0_in_ruleTask634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResource_in_entryRuleResource660 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResource667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__0_in_ruleResource694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBelief_in_entryRuleBelief720 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBelief727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Belief__Group__0_in_ruleBelief754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociation_in_entryRuleAssociation784 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssociation791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group__0_in_ruleAssociation818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependency_in_entryRuleDependency844 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependency851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dependency__Group__0_in_ruleDependency878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecomposition_in_entryRuleDecomposition904 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecomposition911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decomposition__Alternatives_in_ruleDecomposition938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndDecomposition_in_entryRuleAndDecomposition964 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndDecomposition971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndDecomposition__Group__0_in_ruleAndDecomposition998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrDecomposition_in_entryRuleOrDecomposition1024 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrDecomposition1031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrDecomposition__Group__0_in_ruleOrDecomposition1058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContribution_in_entryRuleContribution1084 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContribution1091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Contribution__Alternatives_in_ruleContribution1118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndContribution_in_entryRuleAndContribution1144 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndContribution1151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndContribution__Group__0_in_ruleAndContribution1178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrContribution_in_entryRuleOrContribution1204 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrContribution1211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrContribution__Group__0_in_ruleOrContribution1238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHelpContribution_in_entryRuleHelpContribution1264 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHelpContribution1271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HelpContribution__Group__0_in_ruleHelpContribution1298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMakeContribution_in_entryRuleMakeContribution1324 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMakeContribution1331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MakeContribution__Group__0_in_ruleMakeContribution1358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHurtContribution_in_entryRuleHurtContribution1384 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHurtContribution1391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HurtContribution__Group__0_in_ruleHurtContribution1418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBreakContribution_in_entryRuleBreakContribution1444 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBreakContribution1451 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_11_in_rule__Model__Group__02042 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__NameAssignment_1_in_rule__Model__Group__12080 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__12090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Model__Group__22119 = new BitSet(new long[]{0x0000000000FF2012L});
    public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__22129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Alternatives_3_in_rule__Model__Group__32157 = new BitSet(new long[]{0x0000000000FF2012L});
    public static final BitSet FOLLOW_13_in_rule__Actor__Group__02201 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Actor__Group__1_in_rule__Actor__Group__02211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actor__NameAssignment_1_in_rule__Actor__Group__12239 = new BitSet(new long[]{0x0000000000004012L});
    public static final BitSet FOLLOW_rule__Actor__Group__2_in_rule__Actor__Group__12248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actor__Alternatives_2_in_rule__Actor__Group__22276 = new BitSet(new long[]{0x0000000000004012L});
    public static final BitSet FOLLOW_rule__Actor__Group__3_in_rule__Actor__Group__22286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actor__Group_3__0_in_rule__Actor__Group__32314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Actor__Group_3__02358 = new BitSet(new long[]{0x0000000000F88000L});
    public static final BitSet FOLLOW_rule__Actor__Group_3__1_in_rule__Actor__Group_3__02368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actor__IntentionsAssignment_3_1_in_rule__Actor__Group_3__12396 = new BitSet(new long[]{0x0000000000F88000L});
    public static final BitSet FOLLOW_rule__Actor__Group_3__2_in_rule__Actor__Group_3__12406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Actor__Group_3__22435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Agent__Group__02477 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Agent__Group__1_in_rule__Agent__Group__02487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Agent__NameAssignment_1_in_rule__Agent__Group__12515 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__Agent__Group__2_in_rule__Agent__Group__12524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Agent__Group_2__0_in_rule__Agent__Group__22552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Agent__Group_2__02594 = new BitSet(new long[]{0x0000000000F88000L});
    public static final BitSet FOLLOW_rule__Agent__Group_2__1_in_rule__Agent__Group_2__02604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Agent__IntentionsAssignment_2_1_in_rule__Agent__Group_2__12632 = new BitSet(new long[]{0x0000000000F88000L});
    public static final BitSet FOLLOW_rule__Agent__Group_2__2_in_rule__Agent__Group_2__12642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Agent__Group_2__22671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Role__Group__02713 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Role__Group__1_in_rule__Role__Group__02723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__NameAssignment_1_in_rule__Role__Group__12751 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__Role__Group__2_in_rule__Role__Group__12760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group_2__0_in_rule__Role__Group__22788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Role__Group_2__02830 = new BitSet(new long[]{0x0000000000F88000L});
    public static final BitSet FOLLOW_rule__Role__Group_2__1_in_rule__Role__Group_2__02840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__IntentionsAssignment_2_1_in_rule__Role__Group_2__12868 = new BitSet(new long[]{0x0000000000F88000L});
    public static final BitSet FOLLOW_rule__Role__Group_2__2_in_rule__Role__Group_2__12878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Role__Group_2__22907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Position__Group__02949 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Position__Group__1_in_rule__Position__Group__02959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Position__NameAssignment_1_in_rule__Position__Group__12987 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__Position__Group__2_in_rule__Position__Group__12996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Position__Group_2__0_in_rule__Position__Group__23024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Position__Group_2__03066 = new BitSet(new long[]{0x0000000000F88000L});
    public static final BitSet FOLLOW_rule__Position__Group_2__1_in_rule__Position__Group_2__03076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Position__IntentionsAssignment_2_1_in_rule__Position__Group_2__13104 = new BitSet(new long[]{0x0000000000F88000L});
    public static final BitSet FOLLOW_rule__Position__Group_2__2_in_rule__Position__Group_2__13114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Position__Group_2__23143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Goal__Group__03185 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Goal__Group__1_in_rule__Goal__Group__03195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goal__NameAssignment_1_in_rule__Goal__Group__13223 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__Goal__Group__2_in_rule__Goal__Group__13232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goal__Group_2__0_in_rule__Goal__Group__23260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Goal__Group_2__03302 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_rule__Goal__Group_2__1_in_rule__Goal__Group_2__03312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goal__DecompositionsAssignment_2_1_in_rule__Goal__Group_2__13340 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_rule__Goal__Group_2__2_in_rule__Goal__Group_2__13350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Goal__Group_2__23379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Softgoal__Group__03421 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Softgoal__Group__1_in_rule__Softgoal__Group__03431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Softgoal__NameAssignment_1_in_rule__Softgoal__Group__13459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Task__Group__03498 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Task__Group__1_in_rule__Task__Group__03508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__NameAssignment_1_in_rule__Task__Group__13536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Resource__Group__03575 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Resource__Group__1_in_rule__Resource__Group__03585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__NameAssignment_1_in_rule__Resource__Group__13613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Belief__Group__03652 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Belief__Group__1_in_rule__Belief__Group__03662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Belief__NameAssignment_1_in_rule__Belief__Group__13690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__SourceAssignment_0_in_rule__Association__Group__03728 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Association__Group__1_in_rule__Association__Group__03737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Association__Group__13766 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Association__Group__2_in_rule__Association__Group__13776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__TargetAssignment_2_in_rule__Association__Group__23804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dependency__DependencyFromAssignment_0_in_rule__Dependency__Group__03844 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Dependency__Group__1_in_rule__Dependency__Group__03853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Dependency__Group__13882 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Dependency__Group__2_in_rule__Dependency__Group__13892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dependency__DependencyToAssignment_2_in_rule__Dependency__Group__23920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndDecomposition__TargetAssignment_0_in_rule__AndDecomposition__Group__03960 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__AndDecomposition__Group__1_in_rule__AndDecomposition__Group__03969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__AndDecomposition__Group__13998 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AndDecomposition__Group__2_in_rule__AndDecomposition__Group__14008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndDecomposition__SourceAssignment_2_in_rule__AndDecomposition__Group__24036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrDecomposition__TargetAssignment_0_in_rule__OrDecomposition__Group__04076 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__OrDecomposition__Group__1_in_rule__OrDecomposition__Group__04085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__OrDecomposition__Group__14114 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__OrDecomposition__Group__2_in_rule__OrDecomposition__Group__14124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrDecomposition__SourceAssignment_2_in_rule__OrDecomposition__Group__24152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndContribution__SourceAssignment_0_in_rule__AndContribution__Group__04192 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__AndContribution__Group__1_in_rule__AndContribution__Group__04201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__AndContribution__Group__14230 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AndContribution__Group__2_in_rule__AndContribution__Group__14240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndContribution__TargetAssignment_2_in_rule__AndContribution__Group__24268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrContribution__SourceAssignment_0_in_rule__OrContribution__Group__04308 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__OrContribution__Group__1_in_rule__OrContribution__Group__04317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__OrContribution__Group__14346 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__OrContribution__Group__2_in_rule__OrContribution__Group__14356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrContribution__TargetAssignment_2_in_rule__OrContribution__Group__24384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HelpContribution__SourceAssignment_0_in_rule__HelpContribution__Group__04424 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__HelpContribution__Group__1_in_rule__HelpContribution__Group__04433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__HelpContribution__Group__14462 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__HelpContribution__Group__2_in_rule__HelpContribution__Group__14472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HelpContribution__TargetAssignment_2_in_rule__HelpContribution__Group__24500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MakeContribution__SourceAssignment_0_in_rule__MakeContribution__Group__04540 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__MakeContribution__Group__1_in_rule__MakeContribution__Group__04549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__MakeContribution__Group__14578 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MakeContribution__Group__2_in_rule__MakeContribution__Group__14588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MakeContribution__TargetAssignment_2_in_rule__MakeContribution__Group__24616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HurtContribution__SourceAssignment_0_in_rule__HurtContribution__Group__04656 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__HurtContribution__Group__1_in_rule__HurtContribution__Group__04665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__HurtContribution__Group__14694 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__HurtContribution__Group__2_in_rule__HurtContribution__Group__14704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HurtContribution__TargetAssignment_2_in_rule__HurtContribution__Group__24732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BreakContribution__SourceAssignment_0_in_rule__BreakContribution__Group__04772 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__BreakContribution__Group__1_in_rule__BreakContribution__Group__04781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__BreakContribution__Group__14810 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BreakContribution__Group__2_in_rule__BreakContribution__Group__14820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BreakContribution__TargetAssignment_2_in_rule__BreakContribution__Group__24848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Model__NameAssignment_14888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainer_in_rule__Model__ContainersAssignment_3_04919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntention_in_rule__Model__IntentionsAssignment_3_14950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecomposition_in_rule__Model__DecompositionsAssignment_3_24981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependency_in_rule__Model__DependenciesAssignment_3_35012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContribution_in_rule__Model__ContributionsAssignment_3_45043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociation_in_rule__Model__AssociationsAssignment_3_55074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Actor__NameAssignment_15105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Actor__Is_aAssignment_2_05140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Actor__Is_part_ofAssignment_2_15179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntention_in_rule__Actor__IntentionsAssignment_3_15214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Agent__NameAssignment_15245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntention_in_rule__Agent__IntentionsAssignment_2_15276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Role__NameAssignment_15307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntention_in_rule__Role__IntentionsAssignment_2_15338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Position__NameAssignment_15369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntention_in_rule__Position__IntentionsAssignment_2_15400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Goal__NameAssignment_15431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Goal__DecompositionsAssignment_2_15466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Softgoal__NameAssignment_15501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Task__NameAssignment_15532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Resource__NameAssignment_15563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Belief__NameAssignment_15594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Association__SourceAssignment_05629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Association__TargetAssignment_25668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Dependency__DependencyFromAssignment_05707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Dependency__DependencyToAssignment_25746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AndDecomposition__TargetAssignment_05785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AndDecomposition__SourceAssignment_25824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__OrDecomposition__TargetAssignment_05863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__OrDecomposition__SourceAssignment_25902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AndContribution__SourceAssignment_05941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AndContribution__TargetAssignment_25980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__OrContribution__SourceAssignment_06019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__OrContribution__TargetAssignment_26058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__HelpContribution__SourceAssignment_06097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__HelpContribution__TargetAssignment_26136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MakeContribution__SourceAssignment_06175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MakeContribution__TargetAssignment_26214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__HurtContribution__SourceAssignment_06253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__HurtContribution__TargetAssignment_26292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BreakContribution__SourceAssignment_06331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BreakContribution__TargetAssignment_26370 = new BitSet(new long[]{0x0000000000000002L});

}