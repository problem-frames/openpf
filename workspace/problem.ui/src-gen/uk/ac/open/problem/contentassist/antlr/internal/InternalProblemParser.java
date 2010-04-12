package uk.ac.open.problem.contentassist.antlr.internal; 

import org.antlr.runtime.BitSet;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import uk.ac.open.problem.services.ProblemGrammarAccess;

public class InternalProblemParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'R'", "'M'", "'B'", "'X'", "'C'", "'D'", "'P'", "'phenomenon'", "'event'", "'state'", "'->'", "'~~'", "'~>'", "'problem'", "':'", "'{'", "'}'", "','", "'istar'", "'actor'", "'agent'", "'role'", "'position'", "'goal'", "'soft'", "'task'", "'resource'", "'belief'", "'~~>'", "'<-(and)-'", "'<-(or)-'", "'-(and)->'", "'-(or)->'", "'-(+)->'", "'-(++)->'", "'-(-)->'", "'-(--)->'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

        public InternalProblemParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g"; }


     
     	private ProblemGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ProblemGrammarAccess grammarAccess) {
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




    // $ANTLR start entryRuleProblemDiagram
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:60:1: entryRuleProblemDiagram : ruleProblemDiagram EOF ;
    public final void entryRuleProblemDiagram() throws RecognitionException {
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:60:25: ( ruleProblemDiagram EOF )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:61:1: ruleProblemDiagram EOF
            {
             before(grammarAccess.getProblemDiagramRule()); 
            pushFollow(FOLLOW_ruleProblemDiagram_in_entryRuleProblemDiagram60);
            ruleProblemDiagram();
            _fsp--;

             after(grammarAccess.getProblemDiagramRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProblemDiagram67); 

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
    // $ANTLR end entryRuleProblemDiagram


    // $ANTLR start ruleProblemDiagram
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:68:1: ruleProblemDiagram : ( ( rule__ProblemDiagram__Group__0 ) ) ;
    public final void ruleProblemDiagram() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:72:2: ( ( ( rule__ProblemDiagram__Group__0 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:73:1: ( ( rule__ProblemDiagram__Group__0 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:73:1: ( ( rule__ProblemDiagram__Group__0 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:74:1: ( rule__ProblemDiagram__Group__0 )
            {
             before(grammarAccess.getProblemDiagramAccess().getGroup()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:75:1: ( rule__ProblemDiagram__Group__0 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:75:2: rule__ProblemDiagram__Group__0
            {
            pushFollow(FOLLOW_rule__ProblemDiagram__Group__0_in_ruleProblemDiagram94);
            rule__ProblemDiagram__Group__0();
            _fsp--;


            }

             after(grammarAccess.getProblemDiagramAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleProblemDiagram


    // $ANTLR start entryRuleNode
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:87:1: entryRuleNode : ruleNode EOF ;
    public final void entryRuleNode() throws RecognitionException {
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:87:15: ( ruleNode EOF )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:88:1: ruleNode EOF
            {
             before(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_ruleNode_in_entryRuleNode120);
            ruleNode();
            _fsp--;

             after(grammarAccess.getNodeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNode127); 

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
    // $ANTLR end entryRuleNode


    // $ANTLR start ruleNode
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:95:1: ruleNode : ( ( rule__Node__Group__0 ) ) ;
    public final void ruleNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:99:2: ( ( ( rule__Node__Group__0 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:100:1: ( ( rule__Node__Group__0 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:100:1: ( ( rule__Node__Group__0 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:101:1: ( rule__Node__Group__0 )
            {
             before(grammarAccess.getNodeAccess().getGroup()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:102:1: ( rule__Node__Group__0 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:102:2: rule__Node__Group__0
            {
            pushFollow(FOLLOW_rule__Node__Group__0_in_ruleNode154);
            rule__Node__Group__0();
            _fsp--;


            }

             after(grammarAccess.getNodeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleNode


    // $ANTLR start entryRulePhenomenon
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:114:1: entryRulePhenomenon : rulePhenomenon EOF ;
    public final void entryRulePhenomenon() throws RecognitionException {
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:114:21: ( rulePhenomenon EOF )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:115:1: rulePhenomenon EOF
            {
             before(grammarAccess.getPhenomenonRule()); 
            pushFollow(FOLLOW_rulePhenomenon_in_entryRulePhenomenon180);
            rulePhenomenon();
            _fsp--;

             after(grammarAccess.getPhenomenonRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePhenomenon187); 

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
    // $ANTLR end entryRulePhenomenon


    // $ANTLR start rulePhenomenon
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:122:1: rulePhenomenon : ( ( rule__Phenomenon__Group__0 ) ) ;
    public final void rulePhenomenon() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:126:2: ( ( ( rule__Phenomenon__Group__0 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:127:1: ( ( rule__Phenomenon__Group__0 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:127:1: ( ( rule__Phenomenon__Group__0 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:128:1: ( rule__Phenomenon__Group__0 )
            {
             before(grammarAccess.getPhenomenonAccess().getGroup()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:129:1: ( rule__Phenomenon__Group__0 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:129:2: rule__Phenomenon__Group__0
            {
            pushFollow(FOLLOW_rule__Phenomenon__Group__0_in_rulePhenomenon214);
            rule__Phenomenon__Group__0();
            _fsp--;


            }

             after(grammarAccess.getPhenomenonAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rulePhenomenon


    // $ANTLR start entryRuleLink
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:141:1: entryRuleLink : ruleLink EOF ;
    public final void entryRuleLink() throws RecognitionException {
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:141:15: ( ruleLink EOF )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:142:1: ruleLink EOF
            {
             before(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_ruleLink_in_entryRuleLink240);
            ruleLink();
            _fsp--;

             after(grammarAccess.getLinkRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLink247); 

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
    // $ANTLR end entryRuleLink


    // $ANTLR start ruleLink
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:149:1: ruleLink : ( ( rule__Link__Group__0 ) ) ;
    public final void ruleLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:153:2: ( ( ( rule__Link__Group__0 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:154:1: ( ( rule__Link__Group__0 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:154:1: ( ( rule__Link__Group__0 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:155:1: ( rule__Link__Group__0 )
            {
             before(grammarAccess.getLinkAccess().getGroup()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:156:1: ( rule__Link__Group__0 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:156:2: rule__Link__Group__0
            {
            pushFollow(FOLLOW_rule__Link__Group__0_in_ruleLink274);
            rule__Link__Group__0();
            _fsp--;


            }

             after(grammarAccess.getLinkAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleLink


    // $ANTLR start entryRuleModel
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:168:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:168:16: ( ruleModel EOF )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:169:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel300);
            ruleModel();
            _fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel307); 

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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:176:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:180:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:181:1: ( ( rule__Model__Group__0 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:181:1: ( ( rule__Model__Group__0 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:182:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:183:1: ( rule__Model__Group__0 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:183:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel334);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:195:1: entryRuleContainer : ruleContainer EOF ;
    public final void entryRuleContainer() throws RecognitionException {
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:195:20: ( ruleContainer EOF )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:196:1: ruleContainer EOF
            {
             before(grammarAccess.getContainerRule()); 
            pushFollow(FOLLOW_ruleContainer_in_entryRuleContainer360);
            ruleContainer();
            _fsp--;

             after(grammarAccess.getContainerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContainer367); 

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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:203:1: ruleContainer : ( ( rule__Container__Alternatives ) ) ;
    public final void ruleContainer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:207:2: ( ( ( rule__Container__Alternatives ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:208:1: ( ( rule__Container__Alternatives ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:208:1: ( ( rule__Container__Alternatives ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:209:1: ( rule__Container__Alternatives )
            {
             before(grammarAccess.getContainerAccess().getAlternatives()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:210:1: ( rule__Container__Alternatives )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:210:2: rule__Container__Alternatives
            {
            pushFollow(FOLLOW_rule__Container__Alternatives_in_ruleContainer394);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:222:1: entryRuleActor : ruleActor EOF ;
    public final void entryRuleActor() throws RecognitionException {
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:222:16: ( ruleActor EOF )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:223:1: ruleActor EOF
            {
             before(grammarAccess.getActorRule()); 
            pushFollow(FOLLOW_ruleActor_in_entryRuleActor420);
            ruleActor();
            _fsp--;

             after(grammarAccess.getActorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActor427); 

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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:230:1: ruleActor : ( ( rule__Actor__Group__0 ) ) ;
    public final void ruleActor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:234:2: ( ( ( rule__Actor__Group__0 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:235:1: ( ( rule__Actor__Group__0 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:235:1: ( ( rule__Actor__Group__0 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:236:1: ( rule__Actor__Group__0 )
            {
             before(grammarAccess.getActorAccess().getGroup()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:237:1: ( rule__Actor__Group__0 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:237:2: rule__Actor__Group__0
            {
            pushFollow(FOLLOW_rule__Actor__Group__0_in_ruleActor454);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:249:1: entryRuleAgent : ruleAgent EOF ;
    public final void entryRuleAgent() throws RecognitionException {
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:249:16: ( ruleAgent EOF )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:250:1: ruleAgent EOF
            {
             before(grammarAccess.getAgentRule()); 
            pushFollow(FOLLOW_ruleAgent_in_entryRuleAgent480);
            ruleAgent();
            _fsp--;

             after(grammarAccess.getAgentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAgent487); 

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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:257:1: ruleAgent : ( ( rule__Agent__Group__0 ) ) ;
    public final void ruleAgent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:261:2: ( ( ( rule__Agent__Group__0 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:262:1: ( ( rule__Agent__Group__0 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:262:1: ( ( rule__Agent__Group__0 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:263:1: ( rule__Agent__Group__0 )
            {
             before(grammarAccess.getAgentAccess().getGroup()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:264:1: ( rule__Agent__Group__0 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:264:2: rule__Agent__Group__0
            {
            pushFollow(FOLLOW_rule__Agent__Group__0_in_ruleAgent514);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:276:1: entryRuleRole : ruleRole EOF ;
    public final void entryRuleRole() throws RecognitionException {
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:276:15: ( ruleRole EOF )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:277:1: ruleRole EOF
            {
             before(grammarAccess.getRoleRule()); 
            pushFollow(FOLLOW_ruleRole_in_entryRuleRole540);
            ruleRole();
            _fsp--;

             after(grammarAccess.getRoleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRole547); 

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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:284:1: ruleRole : ( ( rule__Role__Group__0 ) ) ;
    public final void ruleRole() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:288:2: ( ( ( rule__Role__Group__0 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:289:1: ( ( rule__Role__Group__0 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:289:1: ( ( rule__Role__Group__0 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:290:1: ( rule__Role__Group__0 )
            {
             before(grammarAccess.getRoleAccess().getGroup()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:291:1: ( rule__Role__Group__0 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:291:2: rule__Role__Group__0
            {
            pushFollow(FOLLOW_rule__Role__Group__0_in_ruleRole574);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:303:1: entryRulePosition : rulePosition EOF ;
    public final void entryRulePosition() throws RecognitionException {
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:303:19: ( rulePosition EOF )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:304:1: rulePosition EOF
            {
             before(grammarAccess.getPositionRule()); 
            pushFollow(FOLLOW_rulePosition_in_entryRulePosition600);
            rulePosition();
            _fsp--;

             after(grammarAccess.getPositionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePosition607); 

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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:311:1: rulePosition : ( ( rule__Position__Group__0 ) ) ;
    public final void rulePosition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:315:2: ( ( ( rule__Position__Group__0 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:316:1: ( ( rule__Position__Group__0 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:316:1: ( ( rule__Position__Group__0 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:317:1: ( rule__Position__Group__0 )
            {
             before(grammarAccess.getPositionAccess().getGroup()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:318:1: ( rule__Position__Group__0 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:318:2: rule__Position__Group__0
            {
            pushFollow(FOLLOW_rule__Position__Group__0_in_rulePosition634);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:330:1: entryRuleIntention : ruleIntention EOF ;
    public final void entryRuleIntention() throws RecognitionException {
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:330:20: ( ruleIntention EOF )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:331:1: ruleIntention EOF
            {
             before(grammarAccess.getIntentionRule()); 
            pushFollow(FOLLOW_ruleIntention_in_entryRuleIntention660);
            ruleIntention();
            _fsp--;

             after(grammarAccess.getIntentionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntention667); 

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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:338:1: ruleIntention : ( ( rule__Intention__Alternatives ) ) ;
    public final void ruleIntention() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:342:2: ( ( ( rule__Intention__Alternatives ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:343:1: ( ( rule__Intention__Alternatives ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:343:1: ( ( rule__Intention__Alternatives ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:344:1: ( rule__Intention__Alternatives )
            {
             before(grammarAccess.getIntentionAccess().getAlternatives()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:345:1: ( rule__Intention__Alternatives )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:345:2: rule__Intention__Alternatives
            {
            pushFollow(FOLLOW_rule__Intention__Alternatives_in_ruleIntention694);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:357:1: entryRuleGoal : ruleGoal EOF ;
    public final void entryRuleGoal() throws RecognitionException {
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:357:15: ( ruleGoal EOF )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:358:1: ruleGoal EOF
            {
             before(grammarAccess.getGoalRule()); 
            pushFollow(FOLLOW_ruleGoal_in_entryRuleGoal720);
            ruleGoal();
            _fsp--;

             after(grammarAccess.getGoalRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoal727); 

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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:365:1: ruleGoal : ( ( rule__Goal__Group__0 ) ) ;
    public final void ruleGoal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:369:2: ( ( ( rule__Goal__Group__0 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:370:1: ( ( rule__Goal__Group__0 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:370:1: ( ( rule__Goal__Group__0 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:371:1: ( rule__Goal__Group__0 )
            {
             before(grammarAccess.getGoalAccess().getGroup()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:372:1: ( rule__Goal__Group__0 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:372:2: rule__Goal__Group__0
            {
            pushFollow(FOLLOW_rule__Goal__Group__0_in_ruleGoal754);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:384:1: entryRuleSoftgoal : ruleSoftgoal EOF ;
    public final void entryRuleSoftgoal() throws RecognitionException {
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:384:19: ( ruleSoftgoal EOF )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:385:1: ruleSoftgoal EOF
            {
             before(grammarAccess.getSoftgoalRule()); 
            pushFollow(FOLLOW_ruleSoftgoal_in_entryRuleSoftgoal780);
            ruleSoftgoal();
            _fsp--;

             after(grammarAccess.getSoftgoalRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSoftgoal787); 

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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:392:1: ruleSoftgoal : ( ( rule__Softgoal__Group__0 ) ) ;
    public final void ruleSoftgoal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:396:2: ( ( ( rule__Softgoal__Group__0 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:397:1: ( ( rule__Softgoal__Group__0 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:397:1: ( ( rule__Softgoal__Group__0 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:398:1: ( rule__Softgoal__Group__0 )
            {
             before(grammarAccess.getSoftgoalAccess().getGroup()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:399:1: ( rule__Softgoal__Group__0 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:399:2: rule__Softgoal__Group__0
            {
            pushFollow(FOLLOW_rule__Softgoal__Group__0_in_ruleSoftgoal814);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:411:1: entryRuleTask : ruleTask EOF ;
    public final void entryRuleTask() throws RecognitionException {
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:411:15: ( ruleTask EOF )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:412:1: ruleTask EOF
            {
             before(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_ruleTask_in_entryRuleTask840);
            ruleTask();
            _fsp--;

             after(grammarAccess.getTaskRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTask847); 

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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:419:1: ruleTask : ( ( rule__Task__Group__0 ) ) ;
    public final void ruleTask() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:423:2: ( ( ( rule__Task__Group__0 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:424:1: ( ( rule__Task__Group__0 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:424:1: ( ( rule__Task__Group__0 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:425:1: ( rule__Task__Group__0 )
            {
             before(grammarAccess.getTaskAccess().getGroup()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:426:1: ( rule__Task__Group__0 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:426:2: rule__Task__Group__0
            {
            pushFollow(FOLLOW_rule__Task__Group__0_in_ruleTask874);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:438:1: entryRuleResource : ruleResource EOF ;
    public final void entryRuleResource() throws RecognitionException {
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:438:19: ( ruleResource EOF )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:439:1: ruleResource EOF
            {
             before(grammarAccess.getResourceRule()); 
            pushFollow(FOLLOW_ruleResource_in_entryRuleResource900);
            ruleResource();
            _fsp--;

             after(grammarAccess.getResourceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResource907); 

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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:446:1: ruleResource : ( ( rule__Resource__Group__0 ) ) ;
    public final void ruleResource() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:450:2: ( ( ( rule__Resource__Group__0 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:451:1: ( ( rule__Resource__Group__0 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:451:1: ( ( rule__Resource__Group__0 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:452:1: ( rule__Resource__Group__0 )
            {
             before(grammarAccess.getResourceAccess().getGroup()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:453:1: ( rule__Resource__Group__0 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:453:2: rule__Resource__Group__0
            {
            pushFollow(FOLLOW_rule__Resource__Group__0_in_ruleResource934);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:465:1: entryRuleBelief : ruleBelief EOF ;
    public final void entryRuleBelief() throws RecognitionException {
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:465:17: ( ruleBelief EOF )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:466:1: ruleBelief EOF
            {
             before(grammarAccess.getBeliefRule()); 
            pushFollow(FOLLOW_ruleBelief_in_entryRuleBelief960);
            ruleBelief();
            _fsp--;

             after(grammarAccess.getBeliefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBelief967); 

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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:473:1: ruleBelief : ( ( rule__Belief__Group__0 ) ) ;
    public final void ruleBelief() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:477:2: ( ( ( rule__Belief__Group__0 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:478:1: ( ( rule__Belief__Group__0 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:478:1: ( ( rule__Belief__Group__0 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:479:1: ( rule__Belief__Group__0 )
            {
             before(grammarAccess.getBeliefAccess().getGroup()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:480:1: ( rule__Belief__Group__0 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:480:2: rule__Belief__Group__0
            {
            pushFollow(FOLLOW_rule__Belief__Group__0_in_ruleBelief994);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:494:1: entryRuleAssociation : ruleAssociation EOF ;
    public final void entryRuleAssociation() throws RecognitionException {
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:494:22: ( ruleAssociation EOF )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:495:1: ruleAssociation EOF
            {
             before(grammarAccess.getAssociationRule()); 
            pushFollow(FOLLOW_ruleAssociation_in_entryRuleAssociation1022);
            ruleAssociation();
            _fsp--;

             after(grammarAccess.getAssociationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssociation1029); 

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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:502:1: ruleAssociation : ( ( rule__Association__Group__0 ) ) ;
    public final void ruleAssociation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:506:2: ( ( ( rule__Association__Group__0 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:507:1: ( ( rule__Association__Group__0 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:507:1: ( ( rule__Association__Group__0 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:508:1: ( rule__Association__Group__0 )
            {
             before(grammarAccess.getAssociationAccess().getGroup()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:509:1: ( rule__Association__Group__0 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:509:2: rule__Association__Group__0
            {
            pushFollow(FOLLOW_rule__Association__Group__0_in_ruleAssociation1056);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:521:1: entryRuleDependency : ruleDependency EOF ;
    public final void entryRuleDependency() throws RecognitionException {
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:521:21: ( ruleDependency EOF )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:522:1: ruleDependency EOF
            {
             before(grammarAccess.getDependencyRule()); 
            pushFollow(FOLLOW_ruleDependency_in_entryRuleDependency1082);
            ruleDependency();
            _fsp--;

             after(grammarAccess.getDependencyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependency1089); 

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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:529:1: ruleDependency : ( ( rule__Dependency__Group__0 ) ) ;
    public final void ruleDependency() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:533:2: ( ( ( rule__Dependency__Group__0 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:534:1: ( ( rule__Dependency__Group__0 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:534:1: ( ( rule__Dependency__Group__0 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:535:1: ( rule__Dependency__Group__0 )
            {
             before(grammarAccess.getDependencyAccess().getGroup()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:536:1: ( rule__Dependency__Group__0 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:536:2: rule__Dependency__Group__0
            {
            pushFollow(FOLLOW_rule__Dependency__Group__0_in_ruleDependency1116);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:548:1: entryRuleDecomposition : ruleDecomposition EOF ;
    public final void entryRuleDecomposition() throws RecognitionException {
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:548:24: ( ruleDecomposition EOF )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:549:1: ruleDecomposition EOF
            {
             before(grammarAccess.getDecompositionRule()); 
            pushFollow(FOLLOW_ruleDecomposition_in_entryRuleDecomposition1142);
            ruleDecomposition();
            _fsp--;

             after(grammarAccess.getDecompositionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecomposition1149); 

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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:556:1: ruleDecomposition : ( ( rule__Decomposition__Alternatives ) ) ;
    public final void ruleDecomposition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:560:2: ( ( ( rule__Decomposition__Alternatives ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:561:1: ( ( rule__Decomposition__Alternatives ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:561:1: ( ( rule__Decomposition__Alternatives ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:562:1: ( rule__Decomposition__Alternatives )
            {
             before(grammarAccess.getDecompositionAccess().getAlternatives()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:563:1: ( rule__Decomposition__Alternatives )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:563:2: rule__Decomposition__Alternatives
            {
            pushFollow(FOLLOW_rule__Decomposition__Alternatives_in_ruleDecomposition1176);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:575:1: entryRuleAndDecomposition : ruleAndDecomposition EOF ;
    public final void entryRuleAndDecomposition() throws RecognitionException {
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:575:27: ( ruleAndDecomposition EOF )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:576:1: ruleAndDecomposition EOF
            {
             before(grammarAccess.getAndDecompositionRule()); 
            pushFollow(FOLLOW_ruleAndDecomposition_in_entryRuleAndDecomposition1202);
            ruleAndDecomposition();
            _fsp--;

             after(grammarAccess.getAndDecompositionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndDecomposition1209); 

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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:583:1: ruleAndDecomposition : ( ( rule__AndDecomposition__Group__0 ) ) ;
    public final void ruleAndDecomposition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:587:2: ( ( ( rule__AndDecomposition__Group__0 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:588:1: ( ( rule__AndDecomposition__Group__0 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:588:1: ( ( rule__AndDecomposition__Group__0 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:589:1: ( rule__AndDecomposition__Group__0 )
            {
             before(grammarAccess.getAndDecompositionAccess().getGroup()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:590:1: ( rule__AndDecomposition__Group__0 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:590:2: rule__AndDecomposition__Group__0
            {
            pushFollow(FOLLOW_rule__AndDecomposition__Group__0_in_ruleAndDecomposition1236);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:602:1: entryRuleOrDecomposition : ruleOrDecomposition EOF ;
    public final void entryRuleOrDecomposition() throws RecognitionException {
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:602:26: ( ruleOrDecomposition EOF )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:603:1: ruleOrDecomposition EOF
            {
             before(grammarAccess.getOrDecompositionRule()); 
            pushFollow(FOLLOW_ruleOrDecomposition_in_entryRuleOrDecomposition1262);
            ruleOrDecomposition();
            _fsp--;

             after(grammarAccess.getOrDecompositionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrDecomposition1269); 

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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:610:1: ruleOrDecomposition : ( ( rule__OrDecomposition__Group__0 ) ) ;
    public final void ruleOrDecomposition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:614:2: ( ( ( rule__OrDecomposition__Group__0 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:615:1: ( ( rule__OrDecomposition__Group__0 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:615:1: ( ( rule__OrDecomposition__Group__0 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:616:1: ( rule__OrDecomposition__Group__0 )
            {
             before(grammarAccess.getOrDecompositionAccess().getGroup()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:617:1: ( rule__OrDecomposition__Group__0 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:617:2: rule__OrDecomposition__Group__0
            {
            pushFollow(FOLLOW_rule__OrDecomposition__Group__0_in_ruleOrDecomposition1296);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:629:1: entryRuleContribution : ruleContribution EOF ;
    public final void entryRuleContribution() throws RecognitionException {
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:629:23: ( ruleContribution EOF )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:630:1: ruleContribution EOF
            {
             before(grammarAccess.getContributionRule()); 
            pushFollow(FOLLOW_ruleContribution_in_entryRuleContribution1322);
            ruleContribution();
            _fsp--;

             after(grammarAccess.getContributionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContribution1329); 

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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:637:1: ruleContribution : ( ( rule__Contribution__Alternatives ) ) ;
    public final void ruleContribution() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:641:2: ( ( ( rule__Contribution__Alternatives ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:642:1: ( ( rule__Contribution__Alternatives ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:642:1: ( ( rule__Contribution__Alternatives ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:643:1: ( rule__Contribution__Alternatives )
            {
             before(grammarAccess.getContributionAccess().getAlternatives()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:644:1: ( rule__Contribution__Alternatives )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:644:2: rule__Contribution__Alternatives
            {
            pushFollow(FOLLOW_rule__Contribution__Alternatives_in_ruleContribution1356);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:656:1: entryRuleAndContribution : ruleAndContribution EOF ;
    public final void entryRuleAndContribution() throws RecognitionException {
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:656:26: ( ruleAndContribution EOF )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:657:1: ruleAndContribution EOF
            {
             before(grammarAccess.getAndContributionRule()); 
            pushFollow(FOLLOW_ruleAndContribution_in_entryRuleAndContribution1382);
            ruleAndContribution();
            _fsp--;

             after(grammarAccess.getAndContributionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndContribution1389); 

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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:664:1: ruleAndContribution : ( ( rule__AndContribution__Group__0 ) ) ;
    public final void ruleAndContribution() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:668:2: ( ( ( rule__AndContribution__Group__0 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:669:1: ( ( rule__AndContribution__Group__0 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:669:1: ( ( rule__AndContribution__Group__0 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:670:1: ( rule__AndContribution__Group__0 )
            {
             before(grammarAccess.getAndContributionAccess().getGroup()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:671:1: ( rule__AndContribution__Group__0 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:671:2: rule__AndContribution__Group__0
            {
            pushFollow(FOLLOW_rule__AndContribution__Group__0_in_ruleAndContribution1416);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:683:1: entryRuleOrContribution : ruleOrContribution EOF ;
    public final void entryRuleOrContribution() throws RecognitionException {
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:683:25: ( ruleOrContribution EOF )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:684:1: ruleOrContribution EOF
            {
             before(grammarAccess.getOrContributionRule()); 
            pushFollow(FOLLOW_ruleOrContribution_in_entryRuleOrContribution1442);
            ruleOrContribution();
            _fsp--;

             after(grammarAccess.getOrContributionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrContribution1449); 

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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:691:1: ruleOrContribution : ( ( rule__OrContribution__Group__0 ) ) ;
    public final void ruleOrContribution() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:695:2: ( ( ( rule__OrContribution__Group__0 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:696:1: ( ( rule__OrContribution__Group__0 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:696:1: ( ( rule__OrContribution__Group__0 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:697:1: ( rule__OrContribution__Group__0 )
            {
             before(grammarAccess.getOrContributionAccess().getGroup()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:698:1: ( rule__OrContribution__Group__0 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:698:2: rule__OrContribution__Group__0
            {
            pushFollow(FOLLOW_rule__OrContribution__Group__0_in_ruleOrContribution1476);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:710:1: entryRuleHelpContribution : ruleHelpContribution EOF ;
    public final void entryRuleHelpContribution() throws RecognitionException {
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:710:27: ( ruleHelpContribution EOF )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:711:1: ruleHelpContribution EOF
            {
             before(grammarAccess.getHelpContributionRule()); 
            pushFollow(FOLLOW_ruleHelpContribution_in_entryRuleHelpContribution1502);
            ruleHelpContribution();
            _fsp--;

             after(grammarAccess.getHelpContributionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHelpContribution1509); 

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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:718:1: ruleHelpContribution : ( ( rule__HelpContribution__Group__0 ) ) ;
    public final void ruleHelpContribution() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:722:2: ( ( ( rule__HelpContribution__Group__0 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:723:1: ( ( rule__HelpContribution__Group__0 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:723:1: ( ( rule__HelpContribution__Group__0 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:724:1: ( rule__HelpContribution__Group__0 )
            {
             before(grammarAccess.getHelpContributionAccess().getGroup()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:725:1: ( rule__HelpContribution__Group__0 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:725:2: rule__HelpContribution__Group__0
            {
            pushFollow(FOLLOW_rule__HelpContribution__Group__0_in_ruleHelpContribution1536);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:737:1: entryRuleMakeContribution : ruleMakeContribution EOF ;
    public final void entryRuleMakeContribution() throws RecognitionException {
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:737:27: ( ruleMakeContribution EOF )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:738:1: ruleMakeContribution EOF
            {
             before(grammarAccess.getMakeContributionRule()); 
            pushFollow(FOLLOW_ruleMakeContribution_in_entryRuleMakeContribution1562);
            ruleMakeContribution();
            _fsp--;

             after(grammarAccess.getMakeContributionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMakeContribution1569); 

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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:745:1: ruleMakeContribution : ( ( rule__MakeContribution__Group__0 ) ) ;
    public final void ruleMakeContribution() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:749:2: ( ( ( rule__MakeContribution__Group__0 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:750:1: ( ( rule__MakeContribution__Group__0 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:750:1: ( ( rule__MakeContribution__Group__0 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:751:1: ( rule__MakeContribution__Group__0 )
            {
             before(grammarAccess.getMakeContributionAccess().getGroup()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:752:1: ( rule__MakeContribution__Group__0 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:752:2: rule__MakeContribution__Group__0
            {
            pushFollow(FOLLOW_rule__MakeContribution__Group__0_in_ruleMakeContribution1596);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:764:1: entryRuleHurtContribution : ruleHurtContribution EOF ;
    public final void entryRuleHurtContribution() throws RecognitionException {
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:764:27: ( ruleHurtContribution EOF )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:765:1: ruleHurtContribution EOF
            {
             before(grammarAccess.getHurtContributionRule()); 
            pushFollow(FOLLOW_ruleHurtContribution_in_entryRuleHurtContribution1622);
            ruleHurtContribution();
            _fsp--;

             after(grammarAccess.getHurtContributionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHurtContribution1629); 

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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:772:1: ruleHurtContribution : ( ( rule__HurtContribution__Group__0 ) ) ;
    public final void ruleHurtContribution() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:776:2: ( ( ( rule__HurtContribution__Group__0 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:777:1: ( ( rule__HurtContribution__Group__0 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:777:1: ( ( rule__HurtContribution__Group__0 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:778:1: ( rule__HurtContribution__Group__0 )
            {
             before(grammarAccess.getHurtContributionAccess().getGroup()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:779:1: ( rule__HurtContribution__Group__0 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:779:2: rule__HurtContribution__Group__0
            {
            pushFollow(FOLLOW_rule__HurtContribution__Group__0_in_ruleHurtContribution1656);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:791:1: entryRuleBreakContribution : ruleBreakContribution EOF ;
    public final void entryRuleBreakContribution() throws RecognitionException {
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:791:28: ( ruleBreakContribution EOF )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:792:1: ruleBreakContribution EOF
            {
             before(grammarAccess.getBreakContributionRule()); 
            pushFollow(FOLLOW_ruleBreakContribution_in_entryRuleBreakContribution1682);
            ruleBreakContribution();
            _fsp--;

             after(grammarAccess.getBreakContributionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBreakContribution1689); 

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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:799:1: ruleBreakContribution : ( ( rule__BreakContribution__Group__0 ) ) ;
    public final void ruleBreakContribution() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:803:2: ( ( ( rule__BreakContribution__Group__0 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:804:1: ( ( rule__BreakContribution__Group__0 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:804:1: ( ( rule__BreakContribution__Group__0 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:805:1: ( rule__BreakContribution__Group__0 )
            {
             before(grammarAccess.getBreakContributionAccess().getGroup()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:806:1: ( rule__BreakContribution__Group__0 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:806:2: rule__BreakContribution__Group__0
            {
            pushFollow(FOLLOW_rule__BreakContribution__Group__0_in_ruleBreakContribution1716);
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


    // $ANTLR start ruleNodeType
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:819:1: ruleNodeType : ( ( rule__NodeType__Alternatives ) ) ;
    public final void ruleNodeType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:823:1: ( ( ( rule__NodeType__Alternatives ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:824:1: ( ( rule__NodeType__Alternatives ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:824:1: ( ( rule__NodeType__Alternatives ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:825:1: ( rule__NodeType__Alternatives )
            {
             before(grammarAccess.getNodeTypeAccess().getAlternatives()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:826:1: ( rule__NodeType__Alternatives )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:826:2: rule__NodeType__Alternatives
            {
            pushFollow(FOLLOW_rule__NodeType__Alternatives_in_ruleNodeType1753);
            rule__NodeType__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getNodeTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleNodeType


    // $ANTLR start rulePhenomenonType
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:838:1: rulePhenomenonType : ( ( rule__PhenomenonType__Alternatives ) ) ;
    public final void rulePhenomenonType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:842:1: ( ( ( rule__PhenomenonType__Alternatives ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:843:1: ( ( rule__PhenomenonType__Alternatives ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:843:1: ( ( rule__PhenomenonType__Alternatives ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:844:1: ( rule__PhenomenonType__Alternatives )
            {
             before(grammarAccess.getPhenomenonTypeAccess().getAlternatives()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:845:1: ( rule__PhenomenonType__Alternatives )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:845:2: rule__PhenomenonType__Alternatives
            {
            pushFollow(FOLLOW_rule__PhenomenonType__Alternatives_in_rulePhenomenonType1789);
            rule__PhenomenonType__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getPhenomenonTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rulePhenomenonType


    // $ANTLR start ruleLinkType
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:857:1: ruleLinkType : ( ( rule__LinkType__Alternatives ) ) ;
    public final void ruleLinkType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:861:1: ( ( ( rule__LinkType__Alternatives ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:862:1: ( ( rule__LinkType__Alternatives ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:862:1: ( ( rule__LinkType__Alternatives ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:863:1: ( rule__LinkType__Alternatives )
            {
             before(grammarAccess.getLinkTypeAccess().getAlternatives()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:864:1: ( rule__LinkType__Alternatives )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:864:2: rule__LinkType__Alternatives
            {
            pushFollow(FOLLOW_rule__LinkType__Alternatives_in_ruleLinkType1825);
            rule__LinkType__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getLinkTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleLinkType


    // $ANTLR start rule__ProblemDiagram__Alternatives_1
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:875:1: rule__ProblemDiagram__Alternatives_1 : ( ( ( rule__ProblemDiagram__NodesAssignment_1_0 ) ) | ( ( rule__ProblemDiagram__LinksAssignment_1_1 ) ) );
    public final void rule__ProblemDiagram__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:879:1: ( ( ( rule__ProblemDiagram__NodesAssignment_1_0 ) ) | ( ( rule__ProblemDiagram__LinksAssignment_1_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==EOF||LA1_1==RULE_ID||(LA1_1>=11 && LA1_1<=17)||(LA1_1>=25 && LA1_1<=27)) ) {
                    alt1=1;
                }
                else if ( ((LA1_1>=21 && LA1_1<=23)) ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("875:1: rule__ProblemDiagram__Alternatives_1 : ( ( ( rule__ProblemDiagram__NodesAssignment_1_0 ) ) | ( ( rule__ProblemDiagram__LinksAssignment_1_1 ) ) );", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("875:1: rule__ProblemDiagram__Alternatives_1 : ( ( ( rule__ProblemDiagram__NodesAssignment_1_0 ) ) | ( ( rule__ProblemDiagram__LinksAssignment_1_1 ) ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:880:1: ( ( rule__ProblemDiagram__NodesAssignment_1_0 ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:880:1: ( ( rule__ProblemDiagram__NodesAssignment_1_0 ) )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:881:1: ( rule__ProblemDiagram__NodesAssignment_1_0 )
                    {
                     before(grammarAccess.getProblemDiagramAccess().getNodesAssignment_1_0()); 
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:882:1: ( rule__ProblemDiagram__NodesAssignment_1_0 )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:882:2: rule__ProblemDiagram__NodesAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__ProblemDiagram__NodesAssignment_1_0_in_rule__ProblemDiagram__Alternatives_11860);
                    rule__ProblemDiagram__NodesAssignment_1_0();
                    _fsp--;


                    }

                     after(grammarAccess.getProblemDiagramAccess().getNodesAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:886:6: ( ( rule__ProblemDiagram__LinksAssignment_1_1 ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:886:6: ( ( rule__ProblemDiagram__LinksAssignment_1_1 ) )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:887:1: ( rule__ProblemDiagram__LinksAssignment_1_1 )
                    {
                     before(grammarAccess.getProblemDiagramAccess().getLinksAssignment_1_1()); 
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:888:1: ( rule__ProblemDiagram__LinksAssignment_1_1 )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:888:2: rule__ProblemDiagram__LinksAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__ProblemDiagram__LinksAssignment_1_1_in_rule__ProblemDiagram__Alternatives_11878);
                    rule__ProblemDiagram__LinksAssignment_1_1();
                    _fsp--;


                    }

                     after(grammarAccess.getProblemDiagramAccess().getLinksAssignment_1_1()); 

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
    // $ANTLR end rule__ProblemDiagram__Alternatives_1


    // $ANTLR start rule__Node__Alternatives_3_1
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:897:1: rule__Node__Alternatives_3_1 : ( ( ( rule__Node__SubproblemAssignment_3_1_0 ) ) | ( ( rule__Node__IstarAssignment_3_1_1 ) ) );
    public final void rule__Node__Alternatives_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:901:1: ( ( ( rule__Node__SubproblemAssignment_3_1_0 ) ) | ( ( rule__Node__IstarAssignment_3_1_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID||LA2_0==24||LA2_0==27) ) {
                alt2=1;
            }
            else if ( (LA2_0==29) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("897:1: rule__Node__Alternatives_3_1 : ( ( ( rule__Node__SubproblemAssignment_3_1_0 ) ) | ( ( rule__Node__IstarAssignment_3_1_1 ) ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:902:1: ( ( rule__Node__SubproblemAssignment_3_1_0 ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:902:1: ( ( rule__Node__SubproblemAssignment_3_1_0 ) )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:903:1: ( rule__Node__SubproblemAssignment_3_1_0 )
                    {
                     before(grammarAccess.getNodeAccess().getSubproblemAssignment_3_1_0()); 
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:904:1: ( rule__Node__SubproblemAssignment_3_1_0 )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:904:2: rule__Node__SubproblemAssignment_3_1_0
                    {
                    pushFollow(FOLLOW_rule__Node__SubproblemAssignment_3_1_0_in_rule__Node__Alternatives_3_11911);
                    rule__Node__SubproblemAssignment_3_1_0();
                    _fsp--;


                    }

                     after(grammarAccess.getNodeAccess().getSubproblemAssignment_3_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:908:6: ( ( rule__Node__IstarAssignment_3_1_1 ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:908:6: ( ( rule__Node__IstarAssignment_3_1_1 ) )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:909:1: ( rule__Node__IstarAssignment_3_1_1 )
                    {
                     before(grammarAccess.getNodeAccess().getIstarAssignment_3_1_1()); 
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:910:1: ( rule__Node__IstarAssignment_3_1_1 )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:910:2: rule__Node__IstarAssignment_3_1_1
                    {
                    pushFollow(FOLLOW_rule__Node__IstarAssignment_3_1_1_in_rule__Node__Alternatives_3_11929);
                    rule__Node__IstarAssignment_3_1_1();
                    _fsp--;


                    }

                     after(grammarAccess.getNodeAccess().getIstarAssignment_3_1_1()); 

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
    // $ANTLR end rule__Node__Alternatives_3_1


    // $ANTLR start rule__Model__Alternatives_3
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:919:1: rule__Model__Alternatives_3 : ( ( ( rule__Model__ContainersAssignment_3_0 ) ) | ( ( rule__Model__IntentionsAssignment_3_1 ) ) | ( ( rule__Model__DecompositionsAssignment_3_2 ) ) | ( ( rule__Model__DependenciesAssignment_3_3 ) ) | ( ( rule__Model__ContributionsAssignment_3_4 ) ) | ( ( rule__Model__AssociationsAssignment_3_5 ) ) );
    public final void rule__Model__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:923:1: ( ( ( rule__Model__ContainersAssignment_3_0 ) ) | ( ( rule__Model__IntentionsAssignment_3_1 ) ) | ( ( rule__Model__DecompositionsAssignment_3_2 ) ) | ( ( rule__Model__DependenciesAssignment_3_3 ) ) | ( ( rule__Model__ContributionsAssignment_3_4 ) ) | ( ( rule__Model__AssociationsAssignment_3_5 ) ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 30:
            case 31:
            case 32:
            case 33:
                {
                alt3=1;
                }
                break;
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
                {
                alt3=2;
                }
                break;
            case RULE_ID:
                {
                switch ( input.LA(2) ) {
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                    {
                    alt3=5;
                    }
                    break;
                case 40:
                case 41:
                    {
                    alt3=3;
                    }
                    break;
                case 23:
                    {
                    alt3=4;
                    }
                    break;
                case 39:
                    {
                    alt3=6;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("919:1: rule__Model__Alternatives_3 : ( ( ( rule__Model__ContainersAssignment_3_0 ) ) | ( ( rule__Model__IntentionsAssignment_3_1 ) ) | ( ( rule__Model__DecompositionsAssignment_3_2 ) ) | ( ( rule__Model__DependenciesAssignment_3_3 ) ) | ( ( rule__Model__ContributionsAssignment_3_4 ) ) | ( ( rule__Model__AssociationsAssignment_3_5 ) ) );", 3, 3, input);

                    throw nvae;
                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("919:1: rule__Model__Alternatives_3 : ( ( ( rule__Model__ContainersAssignment_3_0 ) ) | ( ( rule__Model__IntentionsAssignment_3_1 ) ) | ( ( rule__Model__DecompositionsAssignment_3_2 ) ) | ( ( rule__Model__DependenciesAssignment_3_3 ) ) | ( ( rule__Model__ContributionsAssignment_3_4 ) ) | ( ( rule__Model__AssociationsAssignment_3_5 ) ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:924:1: ( ( rule__Model__ContainersAssignment_3_0 ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:924:1: ( ( rule__Model__ContainersAssignment_3_0 ) )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:925:1: ( rule__Model__ContainersAssignment_3_0 )
                    {
                     before(grammarAccess.getModelAccess().getContainersAssignment_3_0()); 
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:926:1: ( rule__Model__ContainersAssignment_3_0 )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:926:2: rule__Model__ContainersAssignment_3_0
                    {
                    pushFollow(FOLLOW_rule__Model__ContainersAssignment_3_0_in_rule__Model__Alternatives_31962);
                    rule__Model__ContainersAssignment_3_0();
                    _fsp--;


                    }

                     after(grammarAccess.getModelAccess().getContainersAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:930:6: ( ( rule__Model__IntentionsAssignment_3_1 ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:930:6: ( ( rule__Model__IntentionsAssignment_3_1 ) )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:931:1: ( rule__Model__IntentionsAssignment_3_1 )
                    {
                     before(grammarAccess.getModelAccess().getIntentionsAssignment_3_1()); 
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:932:1: ( rule__Model__IntentionsAssignment_3_1 )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:932:2: rule__Model__IntentionsAssignment_3_1
                    {
                    pushFollow(FOLLOW_rule__Model__IntentionsAssignment_3_1_in_rule__Model__Alternatives_31980);
                    rule__Model__IntentionsAssignment_3_1();
                    _fsp--;


                    }

                     after(grammarAccess.getModelAccess().getIntentionsAssignment_3_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:936:6: ( ( rule__Model__DecompositionsAssignment_3_2 ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:936:6: ( ( rule__Model__DecompositionsAssignment_3_2 ) )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:937:1: ( rule__Model__DecompositionsAssignment_3_2 )
                    {
                     before(grammarAccess.getModelAccess().getDecompositionsAssignment_3_2()); 
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:938:1: ( rule__Model__DecompositionsAssignment_3_2 )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:938:2: rule__Model__DecompositionsAssignment_3_2
                    {
                    pushFollow(FOLLOW_rule__Model__DecompositionsAssignment_3_2_in_rule__Model__Alternatives_31998);
                    rule__Model__DecompositionsAssignment_3_2();
                    _fsp--;


                    }

                     after(grammarAccess.getModelAccess().getDecompositionsAssignment_3_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:942:6: ( ( rule__Model__DependenciesAssignment_3_3 ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:942:6: ( ( rule__Model__DependenciesAssignment_3_3 ) )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:943:1: ( rule__Model__DependenciesAssignment_3_3 )
                    {
                     before(grammarAccess.getModelAccess().getDependenciesAssignment_3_3()); 
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:944:1: ( rule__Model__DependenciesAssignment_3_3 )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:944:2: rule__Model__DependenciesAssignment_3_3
                    {
                    pushFollow(FOLLOW_rule__Model__DependenciesAssignment_3_3_in_rule__Model__Alternatives_32016);
                    rule__Model__DependenciesAssignment_3_3();
                    _fsp--;


                    }

                     after(grammarAccess.getModelAccess().getDependenciesAssignment_3_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:948:6: ( ( rule__Model__ContributionsAssignment_3_4 ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:948:6: ( ( rule__Model__ContributionsAssignment_3_4 ) )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:949:1: ( rule__Model__ContributionsAssignment_3_4 )
                    {
                     before(grammarAccess.getModelAccess().getContributionsAssignment_3_4()); 
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:950:1: ( rule__Model__ContributionsAssignment_3_4 )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:950:2: rule__Model__ContributionsAssignment_3_4
                    {
                    pushFollow(FOLLOW_rule__Model__ContributionsAssignment_3_4_in_rule__Model__Alternatives_32034);
                    rule__Model__ContributionsAssignment_3_4();
                    _fsp--;


                    }

                     after(grammarAccess.getModelAccess().getContributionsAssignment_3_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:954:6: ( ( rule__Model__AssociationsAssignment_3_5 ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:954:6: ( ( rule__Model__AssociationsAssignment_3_5 ) )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:955:1: ( rule__Model__AssociationsAssignment_3_5 )
                    {
                     before(grammarAccess.getModelAccess().getAssociationsAssignment_3_5()); 
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:956:1: ( rule__Model__AssociationsAssignment_3_5 )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:956:2: rule__Model__AssociationsAssignment_3_5
                    {
                    pushFollow(FOLLOW_rule__Model__AssociationsAssignment_3_5_in_rule__Model__Alternatives_32052);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:965:1: rule__Container__Alternatives : ( ( ruleActor ) | ( ruleAgent ) | ( ruleRole ) | ( rulePosition ) );
    public final void rule__Container__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:969:1: ( ( ruleActor ) | ( ruleAgent ) | ( ruleRole ) | ( rulePosition ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt4=1;
                }
                break;
            case 31:
                {
                alt4=2;
                }
                break;
            case 32:
                {
                alt4=3;
                }
                break;
            case 33:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("965:1: rule__Container__Alternatives : ( ( ruleActor ) | ( ruleAgent ) | ( ruleRole ) | ( rulePosition ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:970:1: ( ruleActor )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:970:1: ( ruleActor )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:971:1: ruleActor
                    {
                     before(grammarAccess.getContainerAccess().getActorParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleActor_in_rule__Container__Alternatives2085);
                    ruleActor();
                    _fsp--;

                     after(grammarAccess.getContainerAccess().getActorParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:976:6: ( ruleAgent )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:976:6: ( ruleAgent )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:977:1: ruleAgent
                    {
                     before(grammarAccess.getContainerAccess().getAgentParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAgent_in_rule__Container__Alternatives2102);
                    ruleAgent();
                    _fsp--;

                     after(grammarAccess.getContainerAccess().getAgentParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:982:6: ( ruleRole )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:982:6: ( ruleRole )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:983:1: ruleRole
                    {
                     before(grammarAccess.getContainerAccess().getRoleParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleRole_in_rule__Container__Alternatives2119);
                    ruleRole();
                    _fsp--;

                     after(grammarAccess.getContainerAccess().getRoleParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:988:6: ( rulePosition )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:988:6: ( rulePosition )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:989:1: rulePosition
                    {
                     before(grammarAccess.getContainerAccess().getPositionParserRuleCall_3()); 
                    pushFollow(FOLLOW_rulePosition_in_rule__Container__Alternatives2136);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:999:1: rule__Actor__Alternatives_2 : ( ( ( rule__Actor__Is_aAssignment_2_0 ) ) | ( ( rule__Actor__Is_part_ofAssignment_2_1 ) ) );
    public final void rule__Actor__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1003:1: ( ( ( rule__Actor__Is_aAssignment_2_0 ) ) | ( ( rule__Actor__Is_part_ofAssignment_2_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("999:1: rule__Actor__Alternatives_2 : ( ( ( rule__Actor__Is_aAssignment_2_0 ) ) | ( ( rule__Actor__Is_part_ofAssignment_2_1 ) ) );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1004:1: ( ( rule__Actor__Is_aAssignment_2_0 ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1004:1: ( ( rule__Actor__Is_aAssignment_2_0 ) )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1005:1: ( rule__Actor__Is_aAssignment_2_0 )
                    {
                     before(grammarAccess.getActorAccess().getIs_aAssignment_2_0()); 
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1006:1: ( rule__Actor__Is_aAssignment_2_0 )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1006:2: rule__Actor__Is_aAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__Actor__Is_aAssignment_2_0_in_rule__Actor__Alternatives_22168);
                    rule__Actor__Is_aAssignment_2_0();
                    _fsp--;


                    }

                     after(grammarAccess.getActorAccess().getIs_aAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1010:6: ( ( rule__Actor__Is_part_ofAssignment_2_1 ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1010:6: ( ( rule__Actor__Is_part_ofAssignment_2_1 ) )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1011:1: ( rule__Actor__Is_part_ofAssignment_2_1 )
                    {
                     before(grammarAccess.getActorAccess().getIs_part_ofAssignment_2_1()); 
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1012:1: ( rule__Actor__Is_part_ofAssignment_2_1 )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1012:2: rule__Actor__Is_part_ofAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__Actor__Is_part_ofAssignment_2_1_in_rule__Actor__Alternatives_22186);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1021:1: rule__Intention__Alternatives : ( ( ruleGoal ) | ( ruleSoftgoal ) | ( ruleTask ) | ( ruleResource ) | ( ruleBelief ) );
    public final void rule__Intention__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1025:1: ( ( ruleGoal ) | ( ruleSoftgoal ) | ( ruleTask ) | ( ruleResource ) | ( ruleBelief ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt6=1;
                }
                break;
            case 35:
                {
                alt6=2;
                }
                break;
            case 36:
                {
                alt6=3;
                }
                break;
            case 37:
                {
                alt6=4;
                }
                break;
            case 38:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1021:1: rule__Intention__Alternatives : ( ( ruleGoal ) | ( ruleSoftgoal ) | ( ruleTask ) | ( ruleResource ) | ( ruleBelief ) );", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1026:1: ( ruleGoal )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1026:1: ( ruleGoal )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1027:1: ruleGoal
                    {
                     before(grammarAccess.getIntentionAccess().getGoalParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleGoal_in_rule__Intention__Alternatives2219);
                    ruleGoal();
                    _fsp--;

                     after(grammarAccess.getIntentionAccess().getGoalParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1032:6: ( ruleSoftgoal )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1032:6: ( ruleSoftgoal )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1033:1: ruleSoftgoal
                    {
                     before(grammarAccess.getIntentionAccess().getSoftgoalParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleSoftgoal_in_rule__Intention__Alternatives2236);
                    ruleSoftgoal();
                    _fsp--;

                     after(grammarAccess.getIntentionAccess().getSoftgoalParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1038:6: ( ruleTask )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1038:6: ( ruleTask )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1039:1: ruleTask
                    {
                     before(grammarAccess.getIntentionAccess().getTaskParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleTask_in_rule__Intention__Alternatives2253);
                    ruleTask();
                    _fsp--;

                     after(grammarAccess.getIntentionAccess().getTaskParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1044:6: ( ruleResource )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1044:6: ( ruleResource )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1045:1: ruleResource
                    {
                     before(grammarAccess.getIntentionAccess().getResourceParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleResource_in_rule__Intention__Alternatives2270);
                    ruleResource();
                    _fsp--;

                     after(grammarAccess.getIntentionAccess().getResourceParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1050:6: ( ruleBelief )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1050:6: ( ruleBelief )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1051:1: ruleBelief
                    {
                     before(grammarAccess.getIntentionAccess().getBeliefParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleBelief_in_rule__Intention__Alternatives2287);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1062:1: rule__Decomposition__Alternatives : ( ( ruleAndDecomposition ) | ( ruleOrDecomposition ) );
    public final void rule__Decomposition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1066:1: ( ( ruleAndDecomposition ) | ( ruleOrDecomposition ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==41) ) {
                    alt7=2;
                }
                else if ( (LA7_1==40) ) {
                    alt7=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1062:1: rule__Decomposition__Alternatives : ( ( ruleAndDecomposition ) | ( ruleOrDecomposition ) );", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1062:1: rule__Decomposition__Alternatives : ( ( ruleAndDecomposition ) | ( ruleOrDecomposition ) );", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1067:1: ( ruleAndDecomposition )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1067:1: ( ruleAndDecomposition )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1068:1: ruleAndDecomposition
                    {
                     before(grammarAccess.getDecompositionAccess().getAndDecompositionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleAndDecomposition_in_rule__Decomposition__Alternatives2320);
                    ruleAndDecomposition();
                    _fsp--;

                     after(grammarAccess.getDecompositionAccess().getAndDecompositionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1073:6: ( ruleOrDecomposition )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1073:6: ( ruleOrDecomposition )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1074:1: ruleOrDecomposition
                    {
                     before(grammarAccess.getDecompositionAccess().getOrDecompositionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleOrDecomposition_in_rule__Decomposition__Alternatives2337);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1084:1: rule__Contribution__Alternatives : ( ( ruleAndContribution ) | ( ruleOrContribution ) | ( ruleHelpContribution ) | ( ruleHurtContribution ) | ( ruleMakeContribution ) | ( ruleBreakContribution ) );
    public final void rule__Contribution__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1088:1: ( ( ruleAndContribution ) | ( ruleOrContribution ) | ( ruleHelpContribution ) | ( ruleHurtContribution ) | ( ruleMakeContribution ) | ( ruleBreakContribution ) )
            int alt8=6;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 47:
                    {
                    alt8=6;
                    }
                    break;
                case 46:
                    {
                    alt8=4;
                    }
                    break;
                case 42:
                    {
                    alt8=1;
                    }
                    break;
                case 45:
                    {
                    alt8=5;
                    }
                    break;
                case 44:
                    {
                    alt8=3;
                    }
                    break;
                case 43:
                    {
                    alt8=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("1084:1: rule__Contribution__Alternatives : ( ( ruleAndContribution ) | ( ruleOrContribution ) | ( ruleHelpContribution ) | ( ruleHurtContribution ) | ( ruleMakeContribution ) | ( ruleBreakContribution ) );", 8, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1084:1: rule__Contribution__Alternatives : ( ( ruleAndContribution ) | ( ruleOrContribution ) | ( ruleHelpContribution ) | ( ruleHurtContribution ) | ( ruleMakeContribution ) | ( ruleBreakContribution ) );", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1089:1: ( ruleAndContribution )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1089:1: ( ruleAndContribution )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1090:1: ruleAndContribution
                    {
                     before(grammarAccess.getContributionAccess().getAndContributionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleAndContribution_in_rule__Contribution__Alternatives2369);
                    ruleAndContribution();
                    _fsp--;

                     after(grammarAccess.getContributionAccess().getAndContributionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1095:6: ( ruleOrContribution )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1095:6: ( ruleOrContribution )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1096:1: ruleOrContribution
                    {
                     before(grammarAccess.getContributionAccess().getOrContributionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleOrContribution_in_rule__Contribution__Alternatives2386);
                    ruleOrContribution();
                    _fsp--;

                     after(grammarAccess.getContributionAccess().getOrContributionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1101:6: ( ruleHelpContribution )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1101:6: ( ruleHelpContribution )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1102:1: ruleHelpContribution
                    {
                     before(grammarAccess.getContributionAccess().getHelpContributionParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleHelpContribution_in_rule__Contribution__Alternatives2403);
                    ruleHelpContribution();
                    _fsp--;

                     after(grammarAccess.getContributionAccess().getHelpContributionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1107:6: ( ruleHurtContribution )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1107:6: ( ruleHurtContribution )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1108:1: ruleHurtContribution
                    {
                     before(grammarAccess.getContributionAccess().getHurtContributionParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleHurtContribution_in_rule__Contribution__Alternatives2420);
                    ruleHurtContribution();
                    _fsp--;

                     after(grammarAccess.getContributionAccess().getHurtContributionParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1113:6: ( ruleMakeContribution )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1113:6: ( ruleMakeContribution )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1114:1: ruleMakeContribution
                    {
                     before(grammarAccess.getContributionAccess().getMakeContributionParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleMakeContribution_in_rule__Contribution__Alternatives2437);
                    ruleMakeContribution();
                    _fsp--;

                     after(grammarAccess.getContributionAccess().getMakeContributionParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1119:6: ( ruleBreakContribution )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1119:6: ( ruleBreakContribution )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1120:1: ruleBreakContribution
                    {
                     before(grammarAccess.getContributionAccess().getBreakContributionParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleBreakContribution_in_rule__Contribution__Alternatives2454);
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


    // $ANTLR start rule__NodeType__Alternatives
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1130:1: rule__NodeType__Alternatives : ( ( ( 'R' ) ) | ( ( 'M' ) ) | ( ( 'B' ) ) | ( ( 'X' ) ) | ( ( 'C' ) ) | ( ( 'D' ) ) | ( ( 'P' ) ) );
    public final void rule__NodeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1134:1: ( ( ( 'R' ) ) | ( ( 'M' ) ) | ( ( 'B' ) ) | ( ( 'X' ) ) | ( ( 'C' ) ) | ( ( 'D' ) ) | ( ( 'P' ) ) )
            int alt9=7;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt9=1;
                }
                break;
            case 12:
                {
                alt9=2;
                }
                break;
            case 13:
                {
                alt9=3;
                }
                break;
            case 14:
                {
                alt9=4;
                }
                break;
            case 15:
                {
                alt9=5;
                }
                break;
            case 16:
                {
                alt9=6;
                }
                break;
            case 17:
                {
                alt9=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1130:1: rule__NodeType__Alternatives : ( ( ( 'R' ) ) | ( ( 'M' ) ) | ( ( 'B' ) ) | ( ( 'X' ) ) | ( ( 'C' ) ) | ( ( 'D' ) ) | ( ( 'P' ) ) );", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1135:1: ( ( 'R' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1135:1: ( ( 'R' ) )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1136:1: ( 'R' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getREQUIREMENTEnumLiteralDeclaration_0()); 
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1137:1: ( 'R' )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1137:3: 'R'
                    {
                    match(input,11,FOLLOW_11_in_rule__NodeType__Alternatives2487); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getREQUIREMENTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1142:6: ( ( 'M' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1142:6: ( ( 'M' ) )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1143:1: ( 'M' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getMACHINEEnumLiteralDeclaration_1()); 
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1144:1: ( 'M' )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1144:3: 'M'
                    {
                    match(input,12,FOLLOW_12_in_rule__NodeType__Alternatives2508); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getMACHINEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1149:6: ( ( 'B' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1149:6: ( ( 'B' ) )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1150:1: ( 'B' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getBIDDABLEEnumLiteralDeclaration_2()); 
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1151:1: ( 'B' )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1151:3: 'B'
                    {
                    match(input,13,FOLLOW_13_in_rule__NodeType__Alternatives2529); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getBIDDABLEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1156:6: ( ( 'X' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1156:6: ( ( 'X' ) )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1157:1: ( 'X' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getLEXICALEnumLiteralDeclaration_3()); 
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1158:1: ( 'X' )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1158:3: 'X'
                    {
                    match(input,14,FOLLOW_14_in_rule__NodeType__Alternatives2550); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getLEXICALEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1163:6: ( ( 'C' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1163:6: ( ( 'C' ) )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1164:1: ( 'C' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getCAUSALEnumLiteralDeclaration_4()); 
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1165:1: ( 'C' )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1165:3: 'C'
                    {
                    match(input,15,FOLLOW_15_in_rule__NodeType__Alternatives2571); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getCAUSALEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1170:6: ( ( 'D' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1170:6: ( ( 'D' ) )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1171:1: ( 'D' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getDESIGNEDEnumLiteralDeclaration_5()); 
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1172:1: ( 'D' )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1172:3: 'D'
                    {
                    match(input,16,FOLLOW_16_in_rule__NodeType__Alternatives2592); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getDESIGNEDEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1177:6: ( ( 'P' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1177:6: ( ( 'P' ) )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1178:1: ( 'P' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getPHYSICALEnumLiteralDeclaration_6()); 
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1179:1: ( 'P' )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1179:3: 'P'
                    {
                    match(input,17,FOLLOW_17_in_rule__NodeType__Alternatives2613); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getPHYSICALEnumLiteralDeclaration_6()); 

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
    // $ANTLR end rule__NodeType__Alternatives


    // $ANTLR start rule__PhenomenonType__Alternatives
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1189:1: rule__PhenomenonType__Alternatives : ( ( ( 'phenomenon' ) ) | ( ( 'event' ) ) | ( ( 'state' ) ) );
    public final void rule__PhenomenonType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1193:1: ( ( ( 'phenomenon' ) ) | ( ( 'event' ) ) | ( ( 'state' ) ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt10=1;
                }
                break;
            case 19:
                {
                alt10=2;
                }
                break;
            case 20:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1189:1: rule__PhenomenonType__Alternatives : ( ( ( 'phenomenon' ) ) | ( ( 'event' ) ) | ( ( 'state' ) ) );", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1194:1: ( ( 'phenomenon' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1194:1: ( ( 'phenomenon' ) )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1195:1: ( 'phenomenon' )
                    {
                     before(grammarAccess.getPhenomenonTypeAccess().getUNSPECIFIEDEnumLiteralDeclaration_0()); 
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1196:1: ( 'phenomenon' )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1196:3: 'phenomenon'
                    {
                    match(input,18,FOLLOW_18_in_rule__PhenomenonType__Alternatives2649); 

                    }

                     after(grammarAccess.getPhenomenonTypeAccess().getUNSPECIFIEDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1201:6: ( ( 'event' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1201:6: ( ( 'event' ) )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1202:1: ( 'event' )
                    {
                     before(grammarAccess.getPhenomenonTypeAccess().getEVENTEnumLiteralDeclaration_1()); 
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1203:1: ( 'event' )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1203:3: 'event'
                    {
                    match(input,19,FOLLOW_19_in_rule__PhenomenonType__Alternatives2670); 

                    }

                     after(grammarAccess.getPhenomenonTypeAccess().getEVENTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1208:6: ( ( 'state' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1208:6: ( ( 'state' ) )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1209:1: ( 'state' )
                    {
                     before(grammarAccess.getPhenomenonTypeAccess().getSTATEEnumLiteralDeclaration_2()); 
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1210:1: ( 'state' )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1210:3: 'state'
                    {
                    match(input,20,FOLLOW_20_in_rule__PhenomenonType__Alternatives2691); 

                    }

                     after(grammarAccess.getPhenomenonTypeAccess().getSTATEEnumLiteralDeclaration_2()); 

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
    // $ANTLR end rule__PhenomenonType__Alternatives


    // $ANTLR start rule__LinkType__Alternatives
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1220:1: rule__LinkType__Alternatives : ( ( ( '->' ) ) | ( ( '~~' ) ) | ( ( '~>' ) ) );
    public final void rule__LinkType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1224:1: ( ( ( '->' ) ) | ( ( '~~' ) ) | ( ( '~>' ) ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt11=1;
                }
                break;
            case 22:
                {
                alt11=2;
                }
                break;
            case 23:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1220:1: rule__LinkType__Alternatives : ( ( ( '->' ) ) | ( ( '~~' ) ) | ( ( '~>' ) ) );", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1225:1: ( ( '->' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1225:1: ( ( '->' ) )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1226:1: ( '->' )
                    {
                     before(grammarAccess.getLinkTypeAccess().getINTERFACEEnumLiteralDeclaration_0()); 
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1227:1: ( '->' )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1227:3: '->'
                    {
                    match(input,21,FOLLOW_21_in_rule__LinkType__Alternatives2727); 

                    }

                     after(grammarAccess.getLinkTypeAccess().getINTERFACEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1232:6: ( ( '~~' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1232:6: ( ( '~~' ) )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1233:1: ( '~~' )
                    {
                     before(grammarAccess.getLinkTypeAccess().getREFERENCEEnumLiteralDeclaration_1()); 
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1234:1: ( '~~' )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1234:3: '~~'
                    {
                    match(input,22,FOLLOW_22_in_rule__LinkType__Alternatives2748); 

                    }

                     after(grammarAccess.getLinkTypeAccess().getREFERENCEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1239:6: ( ( '~>' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1239:6: ( ( '~>' ) )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1240:1: ( '~>' )
                    {
                     before(grammarAccess.getLinkTypeAccess().getCONSTRAINTEnumLiteralDeclaration_2()); 
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1241:1: ( '~>' )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1241:3: '~>'
                    {
                    match(input,23,FOLLOW_23_in_rule__LinkType__Alternatives2769); 

                    }

                     after(grammarAccess.getLinkTypeAccess().getCONSTRAINTEnumLiteralDeclaration_2()); 

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
    // $ANTLR end rule__LinkType__Alternatives


    // $ANTLR start rule__ProblemDiagram__Group__0
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1253:1: rule__ProblemDiagram__Group__0 : ( ( rule__ProblemDiagram__Group_0__0 )? ) rule__ProblemDiagram__Group__1 ;
    public final void rule__ProblemDiagram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1257:1: ( ( ( rule__ProblemDiagram__Group_0__0 )? ) rule__ProblemDiagram__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1258:1: ( ( rule__ProblemDiagram__Group_0__0 )? ) rule__ProblemDiagram__Group__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1258:1: ( ( rule__ProblemDiagram__Group_0__0 )? )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1259:1: ( rule__ProblemDiagram__Group_0__0 )?
            {
             before(grammarAccess.getProblemDiagramAccess().getGroup_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1260:1: ( rule__ProblemDiagram__Group_0__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1260:2: rule__ProblemDiagram__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__ProblemDiagram__Group_0__0_in_rule__ProblemDiagram__Group__02806);
                    rule__ProblemDiagram__Group_0__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProblemDiagramAccess().getGroup_0()); 

            }

            pushFollow(FOLLOW_rule__ProblemDiagram__Group__1_in_rule__ProblemDiagram__Group__02816);
            rule__ProblemDiagram__Group__1();
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
    // $ANTLR end rule__ProblemDiagram__Group__0


    // $ANTLR start rule__ProblemDiagram__Group__1
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1271:1: rule__ProblemDiagram__Group__1 : ( ( rule__ProblemDiagram__Alternatives_1 )* ) ;
    public final void rule__ProblemDiagram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1275:1: ( ( ( rule__ProblemDiagram__Alternatives_1 )* ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1276:1: ( ( rule__ProblemDiagram__Alternatives_1 )* )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1276:1: ( ( rule__ProblemDiagram__Alternatives_1 )* )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1277:1: ( rule__ProblemDiagram__Alternatives_1 )*
            {
             before(grammarAccess.getProblemDiagramAccess().getAlternatives_1()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1278:1: ( rule__ProblemDiagram__Alternatives_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1278:2: rule__ProblemDiagram__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_rule__ProblemDiagram__Alternatives_1_in_rule__ProblemDiagram__Group__12844);
            	    rule__ProblemDiagram__Alternatives_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getProblemDiagramAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProblemDiagram__Group__1


    // $ANTLR start rule__ProblemDiagram__Group_0__0
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1292:1: rule__ProblemDiagram__Group_0__0 : ( 'problem' ) rule__ProblemDiagram__Group_0__1 ;
    public final void rule__ProblemDiagram__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1296:1: ( ( 'problem' ) rule__ProblemDiagram__Group_0__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1297:1: ( 'problem' ) rule__ProblemDiagram__Group_0__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1297:1: ( 'problem' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1298:1: 'problem'
            {
             before(grammarAccess.getProblemDiagramAccess().getProblemKeyword_0_0()); 
            match(input,24,FOLLOW_24_in_rule__ProblemDiagram__Group_0__02884); 
             after(grammarAccess.getProblemDiagramAccess().getProblemKeyword_0_0()); 

            }

            pushFollow(FOLLOW_rule__ProblemDiagram__Group_0__1_in_rule__ProblemDiagram__Group_0__02894);
            rule__ProblemDiagram__Group_0__1();
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
    // $ANTLR end rule__ProblemDiagram__Group_0__0


    // $ANTLR start rule__ProblemDiagram__Group_0__1
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1312:1: rule__ProblemDiagram__Group_0__1 : ( ':' ) rule__ProblemDiagram__Group_0__2 ;
    public final void rule__ProblemDiagram__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1316:1: ( ( ':' ) rule__ProblemDiagram__Group_0__2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1317:1: ( ':' ) rule__ProblemDiagram__Group_0__2
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1317:1: ( ':' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1318:1: ':'
            {
             before(grammarAccess.getProblemDiagramAccess().getColonKeyword_0_1()); 
            match(input,25,FOLLOW_25_in_rule__ProblemDiagram__Group_0__12923); 
             after(grammarAccess.getProblemDiagramAccess().getColonKeyword_0_1()); 

            }

            pushFollow(FOLLOW_rule__ProblemDiagram__Group_0__2_in_rule__ProblemDiagram__Group_0__12933);
            rule__ProblemDiagram__Group_0__2();
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
    // $ANTLR end rule__ProblemDiagram__Group_0__1


    // $ANTLR start rule__ProblemDiagram__Group_0__2
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1332:1: rule__ProblemDiagram__Group_0__2 : ( ( rule__ProblemDiagram__DescriptionAssignment_0_2 ) ) ;
    public final void rule__ProblemDiagram__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1336:1: ( ( ( rule__ProblemDiagram__DescriptionAssignment_0_2 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1337:1: ( ( rule__ProblemDiagram__DescriptionAssignment_0_2 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1337:1: ( ( rule__ProblemDiagram__DescriptionAssignment_0_2 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1338:1: ( rule__ProblemDiagram__DescriptionAssignment_0_2 )
            {
             before(grammarAccess.getProblemDiagramAccess().getDescriptionAssignment_0_2()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1339:1: ( rule__ProblemDiagram__DescriptionAssignment_0_2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1339:2: rule__ProblemDiagram__DescriptionAssignment_0_2
            {
            pushFollow(FOLLOW_rule__ProblemDiagram__DescriptionAssignment_0_2_in_rule__ProblemDiagram__Group_0__22961);
            rule__ProblemDiagram__DescriptionAssignment_0_2();
            _fsp--;


            }

             after(grammarAccess.getProblemDiagramAccess().getDescriptionAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProblemDiagram__Group_0__2


    // $ANTLR start rule__Node__Group__0
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1355:1: rule__Node__Group__0 : ( ( rule__Node__NameAssignment_0 ) ) rule__Node__Group__1 ;
    public final void rule__Node__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1359:1: ( ( ( rule__Node__NameAssignment_0 ) ) rule__Node__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1360:1: ( ( rule__Node__NameAssignment_0 ) ) rule__Node__Group__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1360:1: ( ( rule__Node__NameAssignment_0 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1361:1: ( rule__Node__NameAssignment_0 )
            {
             before(grammarAccess.getNodeAccess().getNameAssignment_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1362:1: ( rule__Node__NameAssignment_0 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1362:2: rule__Node__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Node__NameAssignment_0_in_rule__Node__Group__03001);
            rule__Node__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getNodeAccess().getNameAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Node__Group__1_in_rule__Node__Group__03010);
            rule__Node__Group__1();
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
    // $ANTLR end rule__Node__Group__0


    // $ANTLR start rule__Node__Group__1
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1373:1: rule__Node__Group__1 : ( ( rule__Node__TypeAssignment_1 )? ) rule__Node__Group__2 ;
    public final void rule__Node__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1377:1: ( ( ( rule__Node__TypeAssignment_1 )? ) rule__Node__Group__2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1378:1: ( ( rule__Node__TypeAssignment_1 )? ) rule__Node__Group__2
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1378:1: ( ( rule__Node__TypeAssignment_1 )? )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1379:1: ( rule__Node__TypeAssignment_1 )?
            {
             before(grammarAccess.getNodeAccess().getTypeAssignment_1()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1380:1: ( rule__Node__TypeAssignment_1 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=11 && LA14_0<=17)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1380:2: rule__Node__TypeAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Node__TypeAssignment_1_in_rule__Node__Group__13038);
                    rule__Node__TypeAssignment_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNodeAccess().getTypeAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Node__Group__2_in_rule__Node__Group__13048);
            rule__Node__Group__2();
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
    // $ANTLR end rule__Node__Group__1


    // $ANTLR start rule__Node__Group__2
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1391:1: rule__Node__Group__2 : ( ( rule__Node__Group_2__0 )? ) rule__Node__Group__3 ;
    public final void rule__Node__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1395:1: ( ( ( rule__Node__Group_2__0 )? ) rule__Node__Group__3 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1396:1: ( ( rule__Node__Group_2__0 )? ) rule__Node__Group__3
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1396:1: ( ( rule__Node__Group_2__0 )? )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1397:1: ( rule__Node__Group_2__0 )?
            {
             before(grammarAccess.getNodeAccess().getGroup_2()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1398:1: ( rule__Node__Group_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1398:2: rule__Node__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Node__Group_2__0_in_rule__Node__Group__23076);
                    rule__Node__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNodeAccess().getGroup_2()); 

            }

            pushFollow(FOLLOW_rule__Node__Group__3_in_rule__Node__Group__23086);
            rule__Node__Group__3();
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
    // $ANTLR end rule__Node__Group__2


    // $ANTLR start rule__Node__Group__3
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1409:1: rule__Node__Group__3 : ( ( rule__Node__Group_3__0 )? ) ;
    public final void rule__Node__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1413:1: ( ( ( rule__Node__Group_3__0 )? ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1414:1: ( ( rule__Node__Group_3__0 )? )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1414:1: ( ( rule__Node__Group_3__0 )? )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1415:1: ( rule__Node__Group_3__0 )?
            {
             before(grammarAccess.getNodeAccess().getGroup_3()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1416:1: ( rule__Node__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1416:2: rule__Node__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Node__Group_3__0_in_rule__Node__Group__33114);
                    rule__Node__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNodeAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__Group__3


    // $ANTLR start rule__Node__Group_2__0
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1434:1: rule__Node__Group_2__0 : ( ':' ) rule__Node__Group_2__1 ;
    public final void rule__Node__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1438:1: ( ( ':' ) rule__Node__Group_2__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1439:1: ( ':' ) rule__Node__Group_2__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1439:1: ( ':' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1440:1: ':'
            {
             before(grammarAccess.getNodeAccess().getColonKeyword_2_0()); 
            match(input,25,FOLLOW_25_in_rule__Node__Group_2__03158); 
             after(grammarAccess.getNodeAccess().getColonKeyword_2_0()); 

            }

            pushFollow(FOLLOW_rule__Node__Group_2__1_in_rule__Node__Group_2__03168);
            rule__Node__Group_2__1();
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
    // $ANTLR end rule__Node__Group_2__0


    // $ANTLR start rule__Node__Group_2__1
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1454:1: rule__Node__Group_2__1 : ( ( rule__Node__DescriptionAssignment_2_1 ) ) ;
    public final void rule__Node__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1458:1: ( ( ( rule__Node__DescriptionAssignment_2_1 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1459:1: ( ( rule__Node__DescriptionAssignment_2_1 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1459:1: ( ( rule__Node__DescriptionAssignment_2_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1460:1: ( rule__Node__DescriptionAssignment_2_1 )
            {
             before(grammarAccess.getNodeAccess().getDescriptionAssignment_2_1()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1461:1: ( rule__Node__DescriptionAssignment_2_1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1461:2: rule__Node__DescriptionAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Node__DescriptionAssignment_2_1_in_rule__Node__Group_2__13196);
            rule__Node__DescriptionAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getNodeAccess().getDescriptionAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__Group_2__1


    // $ANTLR start rule__Node__Group_3__0
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1475:1: rule__Node__Group_3__0 : ( '{' ) rule__Node__Group_3__1 ;
    public final void rule__Node__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1479:1: ( ( '{' ) rule__Node__Group_3__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1480:1: ( '{' ) rule__Node__Group_3__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1480:1: ( '{' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1481:1: '{'
            {
             before(grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,26,FOLLOW_26_in_rule__Node__Group_3__03235); 
             after(grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_3_0()); 

            }

            pushFollow(FOLLOW_rule__Node__Group_3__1_in_rule__Node__Group_3__03245);
            rule__Node__Group_3__1();
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
    // $ANTLR end rule__Node__Group_3__0


    // $ANTLR start rule__Node__Group_3__1
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1495:1: rule__Node__Group_3__1 : ( ( rule__Node__Alternatives_3_1 ) ) rule__Node__Group_3__2 ;
    public final void rule__Node__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1499:1: ( ( ( rule__Node__Alternatives_3_1 ) ) rule__Node__Group_3__2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1500:1: ( ( rule__Node__Alternatives_3_1 ) ) rule__Node__Group_3__2
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1500:1: ( ( rule__Node__Alternatives_3_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1501:1: ( rule__Node__Alternatives_3_1 )
            {
             before(grammarAccess.getNodeAccess().getAlternatives_3_1()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1502:1: ( rule__Node__Alternatives_3_1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1502:2: rule__Node__Alternatives_3_1
            {
            pushFollow(FOLLOW_rule__Node__Alternatives_3_1_in_rule__Node__Group_3__13273);
            rule__Node__Alternatives_3_1();
            _fsp--;


            }

             after(grammarAccess.getNodeAccess().getAlternatives_3_1()); 

            }

            pushFollow(FOLLOW_rule__Node__Group_3__2_in_rule__Node__Group_3__13282);
            rule__Node__Group_3__2();
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
    // $ANTLR end rule__Node__Group_3__1


    // $ANTLR start rule__Node__Group_3__2
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1513:1: rule__Node__Group_3__2 : ( '}' ) ;
    public final void rule__Node__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1517:1: ( ( '}' ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1518:1: ( '}' )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1518:1: ( '}' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1519:1: '}'
            {
             before(grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_3_2()); 
            match(input,27,FOLLOW_27_in_rule__Node__Group_3__23311); 
             after(grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__Group_3__2


    // $ANTLR start rule__Phenomenon__Group__0
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1538:1: rule__Phenomenon__Group__0 : ( ( rule__Phenomenon__TypeAssignment_0 )? ) rule__Phenomenon__Group__1 ;
    public final void rule__Phenomenon__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1542:1: ( ( ( rule__Phenomenon__TypeAssignment_0 )? ) rule__Phenomenon__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1543:1: ( ( rule__Phenomenon__TypeAssignment_0 )? ) rule__Phenomenon__Group__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1543:1: ( ( rule__Phenomenon__TypeAssignment_0 )? )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1544:1: ( rule__Phenomenon__TypeAssignment_0 )?
            {
             before(grammarAccess.getPhenomenonAccess().getTypeAssignment_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1545:1: ( rule__Phenomenon__TypeAssignment_0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=18 && LA17_0<=20)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1545:2: rule__Phenomenon__TypeAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Phenomenon__TypeAssignment_0_in_rule__Phenomenon__Group__03352);
                    rule__Phenomenon__TypeAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPhenomenonAccess().getTypeAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Phenomenon__Group__1_in_rule__Phenomenon__Group__03362);
            rule__Phenomenon__Group__1();
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
    // $ANTLR end rule__Phenomenon__Group__0


    // $ANTLR start rule__Phenomenon__Group__1
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1556:1: rule__Phenomenon__Group__1 : ( ( rule__Phenomenon__NameAssignment_1 ) ) rule__Phenomenon__Group__2 ;
    public final void rule__Phenomenon__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1560:1: ( ( ( rule__Phenomenon__NameAssignment_1 ) ) rule__Phenomenon__Group__2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1561:1: ( ( rule__Phenomenon__NameAssignment_1 ) ) rule__Phenomenon__Group__2
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1561:1: ( ( rule__Phenomenon__NameAssignment_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1562:1: ( rule__Phenomenon__NameAssignment_1 )
            {
             before(grammarAccess.getPhenomenonAccess().getNameAssignment_1()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1563:1: ( rule__Phenomenon__NameAssignment_1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1563:2: rule__Phenomenon__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Phenomenon__NameAssignment_1_in_rule__Phenomenon__Group__13390);
            rule__Phenomenon__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getPhenomenonAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Phenomenon__Group__2_in_rule__Phenomenon__Group__13399);
            rule__Phenomenon__Group__2();
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
    // $ANTLR end rule__Phenomenon__Group__1


    // $ANTLR start rule__Phenomenon__Group__2
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1574:1: rule__Phenomenon__Group__2 : ( ( rule__Phenomenon__Group_2__0 )? ) ;
    public final void rule__Phenomenon__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1578:1: ( ( ( rule__Phenomenon__Group_2__0 )? ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1579:1: ( ( rule__Phenomenon__Group_2__0 )? )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1579:1: ( ( rule__Phenomenon__Group_2__0 )? )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1580:1: ( rule__Phenomenon__Group_2__0 )?
            {
             before(grammarAccess.getPhenomenonAccess().getGroup_2()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1581:1: ( rule__Phenomenon__Group_2__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==25) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1581:2: rule__Phenomenon__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Phenomenon__Group_2__0_in_rule__Phenomenon__Group__23427);
                    rule__Phenomenon__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPhenomenonAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Phenomenon__Group__2


    // $ANTLR start rule__Phenomenon__Group_2__0
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1597:1: rule__Phenomenon__Group_2__0 : ( ':' ) rule__Phenomenon__Group_2__1 ;
    public final void rule__Phenomenon__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1601:1: ( ( ':' ) rule__Phenomenon__Group_2__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1602:1: ( ':' ) rule__Phenomenon__Group_2__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1602:1: ( ':' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1603:1: ':'
            {
             before(grammarAccess.getPhenomenonAccess().getColonKeyword_2_0()); 
            match(input,25,FOLLOW_25_in_rule__Phenomenon__Group_2__03469); 
             after(grammarAccess.getPhenomenonAccess().getColonKeyword_2_0()); 

            }

            pushFollow(FOLLOW_rule__Phenomenon__Group_2__1_in_rule__Phenomenon__Group_2__03479);
            rule__Phenomenon__Group_2__1();
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
    // $ANTLR end rule__Phenomenon__Group_2__0


    // $ANTLR start rule__Phenomenon__Group_2__1
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1617:1: rule__Phenomenon__Group_2__1 : ( ( rule__Phenomenon__DescriptionAssignment_2_1 ) ) ;
    public final void rule__Phenomenon__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1621:1: ( ( ( rule__Phenomenon__DescriptionAssignment_2_1 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1622:1: ( ( rule__Phenomenon__DescriptionAssignment_2_1 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1622:1: ( ( rule__Phenomenon__DescriptionAssignment_2_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1623:1: ( rule__Phenomenon__DescriptionAssignment_2_1 )
            {
             before(grammarAccess.getPhenomenonAccess().getDescriptionAssignment_2_1()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1624:1: ( rule__Phenomenon__DescriptionAssignment_2_1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1624:2: rule__Phenomenon__DescriptionAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Phenomenon__DescriptionAssignment_2_1_in_rule__Phenomenon__Group_2__13507);
            rule__Phenomenon__DescriptionAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getPhenomenonAccess().getDescriptionAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Phenomenon__Group_2__1


    // $ANTLR start rule__Link__Group__0
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1638:1: rule__Link__Group__0 : ( ( rule__Link__FromAssignment_0 ) ) rule__Link__Group__1 ;
    public final void rule__Link__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1642:1: ( ( ( rule__Link__FromAssignment_0 ) ) rule__Link__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1643:1: ( ( rule__Link__FromAssignment_0 ) ) rule__Link__Group__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1643:1: ( ( rule__Link__FromAssignment_0 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1644:1: ( rule__Link__FromAssignment_0 )
            {
             before(grammarAccess.getLinkAccess().getFromAssignment_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1645:1: ( rule__Link__FromAssignment_0 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1645:2: rule__Link__FromAssignment_0
            {
            pushFollow(FOLLOW_rule__Link__FromAssignment_0_in_rule__Link__Group__03545);
            rule__Link__FromAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getLinkAccess().getFromAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Link__Group__1_in_rule__Link__Group__03554);
            rule__Link__Group__1();
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
    // $ANTLR end rule__Link__Group__0


    // $ANTLR start rule__Link__Group__1
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1656:1: rule__Link__Group__1 : ( ( rule__Link__TypeAssignment_1 ) ) rule__Link__Group__2 ;
    public final void rule__Link__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1660:1: ( ( ( rule__Link__TypeAssignment_1 ) ) rule__Link__Group__2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1661:1: ( ( rule__Link__TypeAssignment_1 ) ) rule__Link__Group__2
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1661:1: ( ( rule__Link__TypeAssignment_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1662:1: ( rule__Link__TypeAssignment_1 )
            {
             before(grammarAccess.getLinkAccess().getTypeAssignment_1()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1663:1: ( rule__Link__TypeAssignment_1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1663:2: rule__Link__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Link__TypeAssignment_1_in_rule__Link__Group__13582);
            rule__Link__TypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getLinkAccess().getTypeAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Link__Group__2_in_rule__Link__Group__13591);
            rule__Link__Group__2();
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
    // $ANTLR end rule__Link__Group__1


    // $ANTLR start rule__Link__Group__2
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1674:1: rule__Link__Group__2 : ( ( rule__Link__ToAssignment_2 ) ) rule__Link__Group__3 ;
    public final void rule__Link__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1678:1: ( ( ( rule__Link__ToAssignment_2 ) ) rule__Link__Group__3 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1679:1: ( ( rule__Link__ToAssignment_2 ) ) rule__Link__Group__3
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1679:1: ( ( rule__Link__ToAssignment_2 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1680:1: ( rule__Link__ToAssignment_2 )
            {
             before(grammarAccess.getLinkAccess().getToAssignment_2()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1681:1: ( rule__Link__ToAssignment_2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1681:2: rule__Link__ToAssignment_2
            {
            pushFollow(FOLLOW_rule__Link__ToAssignment_2_in_rule__Link__Group__23619);
            rule__Link__ToAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getLinkAccess().getToAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__Link__Group__3_in_rule__Link__Group__23628);
            rule__Link__Group__3();
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
    // $ANTLR end rule__Link__Group__2


    // $ANTLR start rule__Link__Group__3
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1692:1: rule__Link__Group__3 : ( ( rule__Link__Group_3__0 )? ) rule__Link__Group__4 ;
    public final void rule__Link__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1696:1: ( ( ( rule__Link__Group_3__0 )? ) rule__Link__Group__4 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1697:1: ( ( rule__Link__Group_3__0 )? ) rule__Link__Group__4
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1697:1: ( ( rule__Link__Group_3__0 )? )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1698:1: ( rule__Link__Group_3__0 )?
            {
             before(grammarAccess.getLinkAccess().getGroup_3()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1699:1: ( rule__Link__Group_3__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==26) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1699:2: rule__Link__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Link__Group_3__0_in_rule__Link__Group__33656);
                    rule__Link__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLinkAccess().getGroup_3()); 

            }

            pushFollow(FOLLOW_rule__Link__Group__4_in_rule__Link__Group__33666);
            rule__Link__Group__4();
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
    // $ANTLR end rule__Link__Group__3


    // $ANTLR start rule__Link__Group__4
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1710:1: rule__Link__Group__4 : ( ( rule__Link__Group_4__0 )? ) ;
    public final void rule__Link__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1714:1: ( ( ( rule__Link__Group_4__0 )? ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1715:1: ( ( rule__Link__Group_4__0 )? )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1715:1: ( ( rule__Link__Group_4__0 )? )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1716:1: ( rule__Link__Group_4__0 )?
            {
             before(grammarAccess.getLinkAccess().getGroup_4()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1717:1: ( rule__Link__Group_4__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==25) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1717:2: rule__Link__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Link__Group_4__0_in_rule__Link__Group__43694);
                    rule__Link__Group_4__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLinkAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__Group__4


    // $ANTLR start rule__Link__Group_3__0
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1737:1: rule__Link__Group_3__0 : ( '{' ) rule__Link__Group_3__1 ;
    public final void rule__Link__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1741:1: ( ( '{' ) rule__Link__Group_3__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1742:1: ( '{' ) rule__Link__Group_3__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1742:1: ( '{' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1743:1: '{'
            {
             before(grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,26,FOLLOW_26_in_rule__Link__Group_3__03740); 
             after(grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_3_0()); 

            }

            pushFollow(FOLLOW_rule__Link__Group_3__1_in_rule__Link__Group_3__03750);
            rule__Link__Group_3__1();
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
    // $ANTLR end rule__Link__Group_3__0


    // $ANTLR start rule__Link__Group_3__1
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1757:1: rule__Link__Group_3__1 : ( ( rule__Link__PhenomenaAssignment_3_1 ) ) rule__Link__Group_3__2 ;
    public final void rule__Link__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1761:1: ( ( ( rule__Link__PhenomenaAssignment_3_1 ) ) rule__Link__Group_3__2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1762:1: ( ( rule__Link__PhenomenaAssignment_3_1 ) ) rule__Link__Group_3__2
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1762:1: ( ( rule__Link__PhenomenaAssignment_3_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1763:1: ( rule__Link__PhenomenaAssignment_3_1 )
            {
             before(grammarAccess.getLinkAccess().getPhenomenaAssignment_3_1()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1764:1: ( rule__Link__PhenomenaAssignment_3_1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1764:2: rule__Link__PhenomenaAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Link__PhenomenaAssignment_3_1_in_rule__Link__Group_3__13778);
            rule__Link__PhenomenaAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getLinkAccess().getPhenomenaAssignment_3_1()); 

            }

            pushFollow(FOLLOW_rule__Link__Group_3__2_in_rule__Link__Group_3__13787);
            rule__Link__Group_3__2();
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
    // $ANTLR end rule__Link__Group_3__1


    // $ANTLR start rule__Link__Group_3__2
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1775:1: rule__Link__Group_3__2 : ( ( rule__Link__Group_3_2__0 )* ) rule__Link__Group_3__3 ;
    public final void rule__Link__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1779:1: ( ( ( rule__Link__Group_3_2__0 )* ) rule__Link__Group_3__3 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1780:1: ( ( rule__Link__Group_3_2__0 )* ) rule__Link__Group_3__3
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1780:1: ( ( rule__Link__Group_3_2__0 )* )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1781:1: ( rule__Link__Group_3_2__0 )*
            {
             before(grammarAccess.getLinkAccess().getGroup_3_2()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1782:1: ( rule__Link__Group_3_2__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==28) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1782:2: rule__Link__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Link__Group_3_2__0_in_rule__Link__Group_3__23815);
            	    rule__Link__Group_3_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getLinkAccess().getGroup_3_2()); 

            }

            pushFollow(FOLLOW_rule__Link__Group_3__3_in_rule__Link__Group_3__23825);
            rule__Link__Group_3__3();
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
    // $ANTLR end rule__Link__Group_3__2


    // $ANTLR start rule__Link__Group_3__3
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1793:1: rule__Link__Group_3__3 : ( '}' ) ;
    public final void rule__Link__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1797:1: ( ( '}' ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1798:1: ( '}' )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1798:1: ( '}' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1799:1: '}'
            {
             before(grammarAccess.getLinkAccess().getRightCurlyBracketKeyword_3_3()); 
            match(input,27,FOLLOW_27_in_rule__Link__Group_3__33854); 
             after(grammarAccess.getLinkAccess().getRightCurlyBracketKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__Group_3__3


    // $ANTLR start rule__Link__Group_3_2__0
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1820:1: rule__Link__Group_3_2__0 : ( ',' ) rule__Link__Group_3_2__1 ;
    public final void rule__Link__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1824:1: ( ( ',' ) rule__Link__Group_3_2__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1825:1: ( ',' ) rule__Link__Group_3_2__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1825:1: ( ',' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1826:1: ','
            {
             before(grammarAccess.getLinkAccess().getCommaKeyword_3_2_0()); 
            match(input,28,FOLLOW_28_in_rule__Link__Group_3_2__03898); 
             after(grammarAccess.getLinkAccess().getCommaKeyword_3_2_0()); 

            }

            pushFollow(FOLLOW_rule__Link__Group_3_2__1_in_rule__Link__Group_3_2__03908);
            rule__Link__Group_3_2__1();
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
    // $ANTLR end rule__Link__Group_3_2__0


    // $ANTLR start rule__Link__Group_3_2__1
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1840:1: rule__Link__Group_3_2__1 : ( ( rule__Link__PhenomenaAssignment_3_2_1 ) ) ;
    public final void rule__Link__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1844:1: ( ( ( rule__Link__PhenomenaAssignment_3_2_1 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1845:1: ( ( rule__Link__PhenomenaAssignment_3_2_1 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1845:1: ( ( rule__Link__PhenomenaAssignment_3_2_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1846:1: ( rule__Link__PhenomenaAssignment_3_2_1 )
            {
             before(grammarAccess.getLinkAccess().getPhenomenaAssignment_3_2_1()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1847:1: ( rule__Link__PhenomenaAssignment_3_2_1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1847:2: rule__Link__PhenomenaAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__Link__PhenomenaAssignment_3_2_1_in_rule__Link__Group_3_2__13936);
            rule__Link__PhenomenaAssignment_3_2_1();
            _fsp--;


            }

             after(grammarAccess.getLinkAccess().getPhenomenaAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__Group_3_2__1


    // $ANTLR start rule__Link__Group_4__0
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1861:1: rule__Link__Group_4__0 : ( ':' ) rule__Link__Group_4__1 ;
    public final void rule__Link__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1865:1: ( ( ':' ) rule__Link__Group_4__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1866:1: ( ':' ) rule__Link__Group_4__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1866:1: ( ':' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1867:1: ':'
            {
             before(grammarAccess.getLinkAccess().getColonKeyword_4_0()); 
            match(input,25,FOLLOW_25_in_rule__Link__Group_4__03975); 
             after(grammarAccess.getLinkAccess().getColonKeyword_4_0()); 

            }

            pushFollow(FOLLOW_rule__Link__Group_4__1_in_rule__Link__Group_4__03985);
            rule__Link__Group_4__1();
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
    // $ANTLR end rule__Link__Group_4__0


    // $ANTLR start rule__Link__Group_4__1
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1881:1: rule__Link__Group_4__1 : ( ( rule__Link__DescriptionAssignment_4_1 ) ) ;
    public final void rule__Link__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1885:1: ( ( ( rule__Link__DescriptionAssignment_4_1 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1886:1: ( ( rule__Link__DescriptionAssignment_4_1 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1886:1: ( ( rule__Link__DescriptionAssignment_4_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1887:1: ( rule__Link__DescriptionAssignment_4_1 )
            {
             before(grammarAccess.getLinkAccess().getDescriptionAssignment_4_1()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1888:1: ( rule__Link__DescriptionAssignment_4_1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1888:2: rule__Link__DescriptionAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Link__DescriptionAssignment_4_1_in_rule__Link__Group_4__14013);
            rule__Link__DescriptionAssignment_4_1();
            _fsp--;


            }

             after(grammarAccess.getLinkAccess().getDescriptionAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__Group_4__1


    // $ANTLR start rule__Model__Group__0
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1902:1: rule__Model__Group__0 : ( 'istar' ) rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1906:1: ( ( 'istar' ) rule__Model__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1907:1: ( 'istar' ) rule__Model__Group__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1907:1: ( 'istar' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1908:1: 'istar'
            {
             before(grammarAccess.getModelAccess().getIstarKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__Model__Group__04052); 
             after(grammarAccess.getModelAccess().getIstarKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__04062);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1922:1: rule__Model__Group__1 : ( ( rule__Model__NameAssignment_1 )? ) rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1926:1: ( ( ( rule__Model__NameAssignment_1 )? ) rule__Model__Group__2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1927:1: ( ( rule__Model__NameAssignment_1 )? ) rule__Model__Group__2
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1927:1: ( ( rule__Model__NameAssignment_1 )? )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1928:1: ( rule__Model__NameAssignment_1 )?
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1929:1: ( rule__Model__NameAssignment_1 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1929:2: rule__Model__NameAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Model__NameAssignment_1_in_rule__Model__Group__14090);
                    rule__Model__NameAssignment_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__14100);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1940:1: rule__Model__Group__2 : ( ':' ) rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1944:1: ( ( ':' ) rule__Model__Group__3 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1945:1: ( ':' ) rule__Model__Group__3
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1945:1: ( ':' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1946:1: ':'
            {
             before(grammarAccess.getModelAccess().getColonKeyword_2()); 
            match(input,25,FOLLOW_25_in_rule__Model__Group__24129); 
             after(grammarAccess.getModelAccess().getColonKeyword_2()); 

            }

            pushFollow(FOLLOW_rule__Model__Group__3_in_rule__Model__Group__24139);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1960:1: rule__Model__Group__3 : ( ( rule__Model__Alternatives_3 )* ) ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1964:1: ( ( ( rule__Model__Alternatives_3 )* ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1965:1: ( ( rule__Model__Alternatives_3 )* )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1965:1: ( ( rule__Model__Alternatives_3 )* )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1966:1: ( rule__Model__Alternatives_3 )*
            {
             before(grammarAccess.getModelAccess().getAlternatives_3()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1967:1: ( rule__Model__Alternatives_3 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID||(LA23_0>=30 && LA23_0<=38)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1967:2: rule__Model__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_rule__Model__Alternatives_3_in_rule__Model__Group__34167);
            	    rule__Model__Alternatives_3();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1985:1: rule__Actor__Group__0 : ( 'actor' ) rule__Actor__Group__1 ;
    public final void rule__Actor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1989:1: ( ( 'actor' ) rule__Actor__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1990:1: ( 'actor' ) rule__Actor__Group__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1990:1: ( 'actor' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1991:1: 'actor'
            {
             before(grammarAccess.getActorAccess().getActorKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__Actor__Group__04211); 
             after(grammarAccess.getActorAccess().getActorKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Actor__Group__1_in_rule__Actor__Group__04221);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2005:1: rule__Actor__Group__1 : ( ( rule__Actor__NameAssignment_1 ) ) rule__Actor__Group__2 ;
    public final void rule__Actor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2009:1: ( ( ( rule__Actor__NameAssignment_1 ) ) rule__Actor__Group__2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2010:1: ( ( rule__Actor__NameAssignment_1 ) ) rule__Actor__Group__2
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2010:1: ( ( rule__Actor__NameAssignment_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2011:1: ( rule__Actor__NameAssignment_1 )
            {
             before(grammarAccess.getActorAccess().getNameAssignment_1()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2012:1: ( rule__Actor__NameAssignment_1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2012:2: rule__Actor__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Actor__NameAssignment_1_in_rule__Actor__Group__14249);
            rule__Actor__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getActorAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Actor__Group__2_in_rule__Actor__Group__14258);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2023:1: rule__Actor__Group__2 : ( ( rule__Actor__Alternatives_2 )* ) rule__Actor__Group__3 ;
    public final void rule__Actor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2027:1: ( ( ( rule__Actor__Alternatives_2 )* ) rule__Actor__Group__3 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2028:1: ( ( rule__Actor__Alternatives_2 )* ) rule__Actor__Group__3
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2028:1: ( ( rule__Actor__Alternatives_2 )* )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2029:1: ( rule__Actor__Alternatives_2 )*
            {
             before(grammarAccess.getActorAccess().getAlternatives_2()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2030:1: ( rule__Actor__Alternatives_2 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ID) ) {
                    int LA24_2 = input.LA(2);

                    if ( (LA24_2==EOF||LA24_2==RULE_ID||(LA24_2>=26 && LA24_2<=27)||(LA24_2>=30 && LA24_2<=38)) ) {
                        alt24=1;
                    }


                }


                switch (alt24) {
            	case 1 :
            	    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2030:2: rule__Actor__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_rule__Actor__Alternatives_2_in_rule__Actor__Group__24286);
            	    rule__Actor__Alternatives_2();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getActorAccess().getAlternatives_2()); 

            }

            pushFollow(FOLLOW_rule__Actor__Group__3_in_rule__Actor__Group__24296);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2041:1: rule__Actor__Group__3 : ( ( rule__Actor__Group_3__0 )? ) ;
    public final void rule__Actor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2045:1: ( ( ( rule__Actor__Group_3__0 )? ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2046:1: ( ( rule__Actor__Group_3__0 )? )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2046:1: ( ( rule__Actor__Group_3__0 )? )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2047:1: ( rule__Actor__Group_3__0 )?
            {
             before(grammarAccess.getActorAccess().getGroup_3()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2048:1: ( rule__Actor__Group_3__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==26) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2048:2: rule__Actor__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Actor__Group_3__0_in_rule__Actor__Group__34324);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2066:1: rule__Actor__Group_3__0 : ( '{' ) rule__Actor__Group_3__1 ;
    public final void rule__Actor__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2070:1: ( ( '{' ) rule__Actor__Group_3__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2071:1: ( '{' ) rule__Actor__Group_3__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2071:1: ( '{' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2072:1: '{'
            {
             before(grammarAccess.getActorAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,26,FOLLOW_26_in_rule__Actor__Group_3__04368); 
             after(grammarAccess.getActorAccess().getLeftCurlyBracketKeyword_3_0()); 

            }

            pushFollow(FOLLOW_rule__Actor__Group_3__1_in_rule__Actor__Group_3__04378);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2086:1: rule__Actor__Group_3__1 : ( ( rule__Actor__IntentionsAssignment_3_1 )* ) rule__Actor__Group_3__2 ;
    public final void rule__Actor__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2090:1: ( ( ( rule__Actor__IntentionsAssignment_3_1 )* ) rule__Actor__Group_3__2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2091:1: ( ( rule__Actor__IntentionsAssignment_3_1 )* ) rule__Actor__Group_3__2
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2091:1: ( ( rule__Actor__IntentionsAssignment_3_1 )* )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2092:1: ( rule__Actor__IntentionsAssignment_3_1 )*
            {
             before(grammarAccess.getActorAccess().getIntentionsAssignment_3_1()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2093:1: ( rule__Actor__IntentionsAssignment_3_1 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=34 && LA26_0<=38)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2093:2: rule__Actor__IntentionsAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_rule__Actor__IntentionsAssignment_3_1_in_rule__Actor__Group_3__14406);
            	    rule__Actor__IntentionsAssignment_3_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getActorAccess().getIntentionsAssignment_3_1()); 

            }

            pushFollow(FOLLOW_rule__Actor__Group_3__2_in_rule__Actor__Group_3__14416);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2104:1: rule__Actor__Group_3__2 : ( '}' ) ;
    public final void rule__Actor__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2108:1: ( ( '}' ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2109:1: ( '}' )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2109:1: ( '}' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2110:1: '}'
            {
             before(grammarAccess.getActorAccess().getRightCurlyBracketKeyword_3_2()); 
            match(input,27,FOLLOW_27_in_rule__Actor__Group_3__24445); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2129:1: rule__Agent__Group__0 : ( 'agent' ) rule__Agent__Group__1 ;
    public final void rule__Agent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2133:1: ( ( 'agent' ) rule__Agent__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2134:1: ( 'agent' ) rule__Agent__Group__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2134:1: ( 'agent' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2135:1: 'agent'
            {
             before(grammarAccess.getAgentAccess().getAgentKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__Agent__Group__04487); 
             after(grammarAccess.getAgentAccess().getAgentKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Agent__Group__1_in_rule__Agent__Group__04497);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2149:1: rule__Agent__Group__1 : ( ( rule__Agent__NameAssignment_1 ) ) rule__Agent__Group__2 ;
    public final void rule__Agent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2153:1: ( ( ( rule__Agent__NameAssignment_1 ) ) rule__Agent__Group__2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2154:1: ( ( rule__Agent__NameAssignment_1 ) ) rule__Agent__Group__2
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2154:1: ( ( rule__Agent__NameAssignment_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2155:1: ( rule__Agent__NameAssignment_1 )
            {
             before(grammarAccess.getAgentAccess().getNameAssignment_1()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2156:1: ( rule__Agent__NameAssignment_1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2156:2: rule__Agent__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Agent__NameAssignment_1_in_rule__Agent__Group__14525);
            rule__Agent__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getAgentAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Agent__Group__2_in_rule__Agent__Group__14534);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2167:1: rule__Agent__Group__2 : ( ( rule__Agent__Group_2__0 )? ) ;
    public final void rule__Agent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2171:1: ( ( ( rule__Agent__Group_2__0 )? ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2172:1: ( ( rule__Agent__Group_2__0 )? )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2172:1: ( ( rule__Agent__Group_2__0 )? )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2173:1: ( rule__Agent__Group_2__0 )?
            {
             before(grammarAccess.getAgentAccess().getGroup_2()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2174:1: ( rule__Agent__Group_2__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==26) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2174:2: rule__Agent__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Agent__Group_2__0_in_rule__Agent__Group__24562);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2190:1: rule__Agent__Group_2__0 : ( '{' ) rule__Agent__Group_2__1 ;
    public final void rule__Agent__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2194:1: ( ( '{' ) rule__Agent__Group_2__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2195:1: ( '{' ) rule__Agent__Group_2__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2195:1: ( '{' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2196:1: '{'
            {
             before(grammarAccess.getAgentAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,26,FOLLOW_26_in_rule__Agent__Group_2__04604); 
             after(grammarAccess.getAgentAccess().getLeftCurlyBracketKeyword_2_0()); 

            }

            pushFollow(FOLLOW_rule__Agent__Group_2__1_in_rule__Agent__Group_2__04614);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2210:1: rule__Agent__Group_2__1 : ( ( rule__Agent__IntentionsAssignment_2_1 )* ) rule__Agent__Group_2__2 ;
    public final void rule__Agent__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2214:1: ( ( ( rule__Agent__IntentionsAssignment_2_1 )* ) rule__Agent__Group_2__2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2215:1: ( ( rule__Agent__IntentionsAssignment_2_1 )* ) rule__Agent__Group_2__2
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2215:1: ( ( rule__Agent__IntentionsAssignment_2_1 )* )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2216:1: ( rule__Agent__IntentionsAssignment_2_1 )*
            {
             before(grammarAccess.getAgentAccess().getIntentionsAssignment_2_1()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2217:1: ( rule__Agent__IntentionsAssignment_2_1 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=34 && LA28_0<=38)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2217:2: rule__Agent__IntentionsAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_rule__Agent__IntentionsAssignment_2_1_in_rule__Agent__Group_2__14642);
            	    rule__Agent__IntentionsAssignment_2_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getAgentAccess().getIntentionsAssignment_2_1()); 

            }

            pushFollow(FOLLOW_rule__Agent__Group_2__2_in_rule__Agent__Group_2__14652);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2228:1: rule__Agent__Group_2__2 : ( '}' ) ;
    public final void rule__Agent__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2232:1: ( ( '}' ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2233:1: ( '}' )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2233:1: ( '}' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2234:1: '}'
            {
             before(grammarAccess.getAgentAccess().getRightCurlyBracketKeyword_2_2()); 
            match(input,27,FOLLOW_27_in_rule__Agent__Group_2__24681); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2253:1: rule__Role__Group__0 : ( 'role' ) rule__Role__Group__1 ;
    public final void rule__Role__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2257:1: ( ( 'role' ) rule__Role__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2258:1: ( 'role' ) rule__Role__Group__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2258:1: ( 'role' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2259:1: 'role'
            {
             before(grammarAccess.getRoleAccess().getRoleKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__Role__Group__04723); 
             after(grammarAccess.getRoleAccess().getRoleKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Role__Group__1_in_rule__Role__Group__04733);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2273:1: rule__Role__Group__1 : ( ( rule__Role__NameAssignment_1 ) ) rule__Role__Group__2 ;
    public final void rule__Role__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2277:1: ( ( ( rule__Role__NameAssignment_1 ) ) rule__Role__Group__2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2278:1: ( ( rule__Role__NameAssignment_1 ) ) rule__Role__Group__2
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2278:1: ( ( rule__Role__NameAssignment_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2279:1: ( rule__Role__NameAssignment_1 )
            {
             before(grammarAccess.getRoleAccess().getNameAssignment_1()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2280:1: ( rule__Role__NameAssignment_1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2280:2: rule__Role__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Role__NameAssignment_1_in_rule__Role__Group__14761);
            rule__Role__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getRoleAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Role__Group__2_in_rule__Role__Group__14770);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2291:1: rule__Role__Group__2 : ( ( rule__Role__Group_2__0 )? ) ;
    public final void rule__Role__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2295:1: ( ( ( rule__Role__Group_2__0 )? ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2296:1: ( ( rule__Role__Group_2__0 )? )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2296:1: ( ( rule__Role__Group_2__0 )? )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2297:1: ( rule__Role__Group_2__0 )?
            {
             before(grammarAccess.getRoleAccess().getGroup_2()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2298:1: ( rule__Role__Group_2__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==26) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2298:2: rule__Role__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Role__Group_2__0_in_rule__Role__Group__24798);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2314:1: rule__Role__Group_2__0 : ( '{' ) rule__Role__Group_2__1 ;
    public final void rule__Role__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2318:1: ( ( '{' ) rule__Role__Group_2__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2319:1: ( '{' ) rule__Role__Group_2__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2319:1: ( '{' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2320:1: '{'
            {
             before(grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,26,FOLLOW_26_in_rule__Role__Group_2__04840); 
             after(grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_2_0()); 

            }

            pushFollow(FOLLOW_rule__Role__Group_2__1_in_rule__Role__Group_2__04850);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2334:1: rule__Role__Group_2__1 : ( ( rule__Role__IntentionsAssignment_2_1 )* ) rule__Role__Group_2__2 ;
    public final void rule__Role__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2338:1: ( ( ( rule__Role__IntentionsAssignment_2_1 )* ) rule__Role__Group_2__2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2339:1: ( ( rule__Role__IntentionsAssignment_2_1 )* ) rule__Role__Group_2__2
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2339:1: ( ( rule__Role__IntentionsAssignment_2_1 )* )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2340:1: ( rule__Role__IntentionsAssignment_2_1 )*
            {
             before(grammarAccess.getRoleAccess().getIntentionsAssignment_2_1()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2341:1: ( rule__Role__IntentionsAssignment_2_1 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=34 && LA30_0<=38)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2341:2: rule__Role__IntentionsAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_rule__Role__IntentionsAssignment_2_1_in_rule__Role__Group_2__14878);
            	    rule__Role__IntentionsAssignment_2_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getRoleAccess().getIntentionsAssignment_2_1()); 

            }

            pushFollow(FOLLOW_rule__Role__Group_2__2_in_rule__Role__Group_2__14888);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2352:1: rule__Role__Group_2__2 : ( '}' ) ;
    public final void rule__Role__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2356:1: ( ( '}' ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2357:1: ( '}' )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2357:1: ( '}' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2358:1: '}'
            {
             before(grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_2_2()); 
            match(input,27,FOLLOW_27_in_rule__Role__Group_2__24917); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2377:1: rule__Position__Group__0 : ( 'position' ) rule__Position__Group__1 ;
    public final void rule__Position__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2381:1: ( ( 'position' ) rule__Position__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2382:1: ( 'position' ) rule__Position__Group__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2382:1: ( 'position' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2383:1: 'position'
            {
             before(grammarAccess.getPositionAccess().getPositionKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__Position__Group__04959); 
             after(grammarAccess.getPositionAccess().getPositionKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Position__Group__1_in_rule__Position__Group__04969);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2397:1: rule__Position__Group__1 : ( ( rule__Position__NameAssignment_1 ) ) rule__Position__Group__2 ;
    public final void rule__Position__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2401:1: ( ( ( rule__Position__NameAssignment_1 ) ) rule__Position__Group__2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2402:1: ( ( rule__Position__NameAssignment_1 ) ) rule__Position__Group__2
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2402:1: ( ( rule__Position__NameAssignment_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2403:1: ( rule__Position__NameAssignment_1 )
            {
             before(grammarAccess.getPositionAccess().getNameAssignment_1()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2404:1: ( rule__Position__NameAssignment_1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2404:2: rule__Position__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Position__NameAssignment_1_in_rule__Position__Group__14997);
            rule__Position__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getPositionAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Position__Group__2_in_rule__Position__Group__15006);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2415:1: rule__Position__Group__2 : ( ( rule__Position__Group_2__0 )? ) ;
    public final void rule__Position__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2419:1: ( ( ( rule__Position__Group_2__0 )? ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2420:1: ( ( rule__Position__Group_2__0 )? )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2420:1: ( ( rule__Position__Group_2__0 )? )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2421:1: ( rule__Position__Group_2__0 )?
            {
             before(grammarAccess.getPositionAccess().getGroup_2()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2422:1: ( rule__Position__Group_2__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==26) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2422:2: rule__Position__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Position__Group_2__0_in_rule__Position__Group__25034);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2438:1: rule__Position__Group_2__0 : ( '{' ) rule__Position__Group_2__1 ;
    public final void rule__Position__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2442:1: ( ( '{' ) rule__Position__Group_2__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2443:1: ( '{' ) rule__Position__Group_2__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2443:1: ( '{' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2444:1: '{'
            {
             before(grammarAccess.getPositionAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,26,FOLLOW_26_in_rule__Position__Group_2__05076); 
             after(grammarAccess.getPositionAccess().getLeftCurlyBracketKeyword_2_0()); 

            }

            pushFollow(FOLLOW_rule__Position__Group_2__1_in_rule__Position__Group_2__05086);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2458:1: rule__Position__Group_2__1 : ( ( rule__Position__IntentionsAssignment_2_1 )* ) rule__Position__Group_2__2 ;
    public final void rule__Position__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2462:1: ( ( ( rule__Position__IntentionsAssignment_2_1 )* ) rule__Position__Group_2__2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2463:1: ( ( rule__Position__IntentionsAssignment_2_1 )* ) rule__Position__Group_2__2
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2463:1: ( ( rule__Position__IntentionsAssignment_2_1 )* )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2464:1: ( rule__Position__IntentionsAssignment_2_1 )*
            {
             before(grammarAccess.getPositionAccess().getIntentionsAssignment_2_1()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2465:1: ( rule__Position__IntentionsAssignment_2_1 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=34 && LA32_0<=38)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2465:2: rule__Position__IntentionsAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_rule__Position__IntentionsAssignment_2_1_in_rule__Position__Group_2__15114);
            	    rule__Position__IntentionsAssignment_2_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getPositionAccess().getIntentionsAssignment_2_1()); 

            }

            pushFollow(FOLLOW_rule__Position__Group_2__2_in_rule__Position__Group_2__15124);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2476:1: rule__Position__Group_2__2 : ( '}' ) ;
    public final void rule__Position__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2480:1: ( ( '}' ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2481:1: ( '}' )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2481:1: ( '}' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2482:1: '}'
            {
             before(grammarAccess.getPositionAccess().getRightCurlyBracketKeyword_2_2()); 
            match(input,27,FOLLOW_27_in_rule__Position__Group_2__25153); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2501:1: rule__Goal__Group__0 : ( 'goal' ) rule__Goal__Group__1 ;
    public final void rule__Goal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2505:1: ( ( 'goal' ) rule__Goal__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2506:1: ( 'goal' ) rule__Goal__Group__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2506:1: ( 'goal' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2507:1: 'goal'
            {
             before(grammarAccess.getGoalAccess().getGoalKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__Goal__Group__05195); 
             after(grammarAccess.getGoalAccess().getGoalKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Goal__Group__1_in_rule__Goal__Group__05205);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2521:1: rule__Goal__Group__1 : ( ( rule__Goal__NameAssignment_1 ) ) rule__Goal__Group__2 ;
    public final void rule__Goal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2525:1: ( ( ( rule__Goal__NameAssignment_1 ) ) rule__Goal__Group__2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2526:1: ( ( rule__Goal__NameAssignment_1 ) ) rule__Goal__Group__2
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2526:1: ( ( rule__Goal__NameAssignment_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2527:1: ( rule__Goal__NameAssignment_1 )
            {
             before(grammarAccess.getGoalAccess().getNameAssignment_1()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2528:1: ( rule__Goal__NameAssignment_1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2528:2: rule__Goal__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Goal__NameAssignment_1_in_rule__Goal__Group__15233);
            rule__Goal__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getGoalAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Goal__Group__2_in_rule__Goal__Group__15242);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2539:1: rule__Goal__Group__2 : ( ( rule__Goal__Group_2__0 )? ) ;
    public final void rule__Goal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2543:1: ( ( ( rule__Goal__Group_2__0 )? ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2544:1: ( ( rule__Goal__Group_2__0 )? )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2544:1: ( ( rule__Goal__Group_2__0 )? )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2545:1: ( rule__Goal__Group_2__0 )?
            {
             before(grammarAccess.getGoalAccess().getGroup_2()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2546:1: ( rule__Goal__Group_2__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==26) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2546:2: rule__Goal__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Goal__Group_2__0_in_rule__Goal__Group__25270);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2562:1: rule__Goal__Group_2__0 : ( '{' ) rule__Goal__Group_2__1 ;
    public final void rule__Goal__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2566:1: ( ( '{' ) rule__Goal__Group_2__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2567:1: ( '{' ) rule__Goal__Group_2__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2567:1: ( '{' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2568:1: '{'
            {
             before(grammarAccess.getGoalAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,26,FOLLOW_26_in_rule__Goal__Group_2__05312); 
             after(grammarAccess.getGoalAccess().getLeftCurlyBracketKeyword_2_0()); 

            }

            pushFollow(FOLLOW_rule__Goal__Group_2__1_in_rule__Goal__Group_2__05322);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2582:1: rule__Goal__Group_2__1 : ( ( rule__Goal__DecompositionsAssignment_2_1 )* ) rule__Goal__Group_2__2 ;
    public final void rule__Goal__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2586:1: ( ( ( rule__Goal__DecompositionsAssignment_2_1 )* ) rule__Goal__Group_2__2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2587:1: ( ( rule__Goal__DecompositionsAssignment_2_1 )* ) rule__Goal__Group_2__2
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2587:1: ( ( rule__Goal__DecompositionsAssignment_2_1 )* )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2588:1: ( rule__Goal__DecompositionsAssignment_2_1 )*
            {
             before(grammarAccess.getGoalAccess().getDecompositionsAssignment_2_1()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2589:1: ( rule__Goal__DecompositionsAssignment_2_1 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_ID) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2589:2: rule__Goal__DecompositionsAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_rule__Goal__DecompositionsAssignment_2_1_in_rule__Goal__Group_2__15350);
            	    rule__Goal__DecompositionsAssignment_2_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getGoalAccess().getDecompositionsAssignment_2_1()); 

            }

            pushFollow(FOLLOW_rule__Goal__Group_2__2_in_rule__Goal__Group_2__15360);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2600:1: rule__Goal__Group_2__2 : ( '}' ) ;
    public final void rule__Goal__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2604:1: ( ( '}' ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2605:1: ( '}' )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2605:1: ( '}' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2606:1: '}'
            {
             before(grammarAccess.getGoalAccess().getRightCurlyBracketKeyword_2_2()); 
            match(input,27,FOLLOW_27_in_rule__Goal__Group_2__25389); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2625:1: rule__Softgoal__Group__0 : ( 'soft' ) rule__Softgoal__Group__1 ;
    public final void rule__Softgoal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2629:1: ( ( 'soft' ) rule__Softgoal__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2630:1: ( 'soft' ) rule__Softgoal__Group__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2630:1: ( 'soft' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2631:1: 'soft'
            {
             before(grammarAccess.getSoftgoalAccess().getSoftKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__Softgoal__Group__05431); 
             after(grammarAccess.getSoftgoalAccess().getSoftKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Softgoal__Group__1_in_rule__Softgoal__Group__05441);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2645:1: rule__Softgoal__Group__1 : ( ( rule__Softgoal__NameAssignment_1 ) ) ;
    public final void rule__Softgoal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2649:1: ( ( ( rule__Softgoal__NameAssignment_1 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2650:1: ( ( rule__Softgoal__NameAssignment_1 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2650:1: ( ( rule__Softgoal__NameAssignment_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2651:1: ( rule__Softgoal__NameAssignment_1 )
            {
             before(grammarAccess.getSoftgoalAccess().getNameAssignment_1()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2652:1: ( rule__Softgoal__NameAssignment_1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2652:2: rule__Softgoal__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Softgoal__NameAssignment_1_in_rule__Softgoal__Group__15469);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2666:1: rule__Task__Group__0 : ( 'task' ) rule__Task__Group__1 ;
    public final void rule__Task__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2670:1: ( ( 'task' ) rule__Task__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2671:1: ( 'task' ) rule__Task__Group__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2671:1: ( 'task' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2672:1: 'task'
            {
             before(grammarAccess.getTaskAccess().getTaskKeyword_0()); 
            match(input,36,FOLLOW_36_in_rule__Task__Group__05508); 
             after(grammarAccess.getTaskAccess().getTaskKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Task__Group__1_in_rule__Task__Group__05518);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2686:1: rule__Task__Group__1 : ( ( rule__Task__NameAssignment_1 ) ) ;
    public final void rule__Task__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2690:1: ( ( ( rule__Task__NameAssignment_1 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2691:1: ( ( rule__Task__NameAssignment_1 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2691:1: ( ( rule__Task__NameAssignment_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2692:1: ( rule__Task__NameAssignment_1 )
            {
             before(grammarAccess.getTaskAccess().getNameAssignment_1()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2693:1: ( rule__Task__NameAssignment_1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2693:2: rule__Task__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Task__NameAssignment_1_in_rule__Task__Group__15546);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2707:1: rule__Resource__Group__0 : ( 'resource' ) rule__Resource__Group__1 ;
    public final void rule__Resource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2711:1: ( ( 'resource' ) rule__Resource__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2712:1: ( 'resource' ) rule__Resource__Group__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2712:1: ( 'resource' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2713:1: 'resource'
            {
             before(grammarAccess.getResourceAccess().getResourceKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__Resource__Group__05585); 
             after(grammarAccess.getResourceAccess().getResourceKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Resource__Group__1_in_rule__Resource__Group__05595);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2727:1: rule__Resource__Group__1 : ( ( rule__Resource__NameAssignment_1 ) ) ;
    public final void rule__Resource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2731:1: ( ( ( rule__Resource__NameAssignment_1 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2732:1: ( ( rule__Resource__NameAssignment_1 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2732:1: ( ( rule__Resource__NameAssignment_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2733:1: ( rule__Resource__NameAssignment_1 )
            {
             before(grammarAccess.getResourceAccess().getNameAssignment_1()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2734:1: ( rule__Resource__NameAssignment_1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2734:2: rule__Resource__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Resource__NameAssignment_1_in_rule__Resource__Group__15623);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2748:1: rule__Belief__Group__0 : ( 'belief' ) rule__Belief__Group__1 ;
    public final void rule__Belief__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2752:1: ( ( 'belief' ) rule__Belief__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2753:1: ( 'belief' ) rule__Belief__Group__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2753:1: ( 'belief' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2754:1: 'belief'
            {
             before(grammarAccess.getBeliefAccess().getBeliefKeyword_0()); 
            match(input,38,FOLLOW_38_in_rule__Belief__Group__05662); 
             after(grammarAccess.getBeliefAccess().getBeliefKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Belief__Group__1_in_rule__Belief__Group__05672);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2768:1: rule__Belief__Group__1 : ( ( rule__Belief__NameAssignment_1 ) ) ;
    public final void rule__Belief__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2772:1: ( ( ( rule__Belief__NameAssignment_1 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2773:1: ( ( rule__Belief__NameAssignment_1 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2773:1: ( ( rule__Belief__NameAssignment_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2774:1: ( rule__Belief__NameAssignment_1 )
            {
             before(grammarAccess.getBeliefAccess().getNameAssignment_1()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2775:1: ( rule__Belief__NameAssignment_1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2775:2: rule__Belief__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Belief__NameAssignment_1_in_rule__Belief__Group__15700);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2789:1: rule__Association__Group__0 : ( ( rule__Association__SourceAssignment_0 ) ) rule__Association__Group__1 ;
    public final void rule__Association__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2793:1: ( ( ( rule__Association__SourceAssignment_0 ) ) rule__Association__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2794:1: ( ( rule__Association__SourceAssignment_0 ) ) rule__Association__Group__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2794:1: ( ( rule__Association__SourceAssignment_0 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2795:1: ( rule__Association__SourceAssignment_0 )
            {
             before(grammarAccess.getAssociationAccess().getSourceAssignment_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2796:1: ( rule__Association__SourceAssignment_0 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2796:2: rule__Association__SourceAssignment_0
            {
            pushFollow(FOLLOW_rule__Association__SourceAssignment_0_in_rule__Association__Group__05738);
            rule__Association__SourceAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getAssociationAccess().getSourceAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Association__Group__1_in_rule__Association__Group__05747);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2807:1: rule__Association__Group__1 : ( '~~>' ) rule__Association__Group__2 ;
    public final void rule__Association__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2811:1: ( ( '~~>' ) rule__Association__Group__2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2812:1: ( '~~>' ) rule__Association__Group__2
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2812:1: ( '~~>' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2813:1: '~~>'
            {
             before(grammarAccess.getAssociationAccess().getTildeTildeGreaterThanSignKeyword_1()); 
            match(input,39,FOLLOW_39_in_rule__Association__Group__15776); 
             after(grammarAccess.getAssociationAccess().getTildeTildeGreaterThanSignKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__Association__Group__2_in_rule__Association__Group__15786);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2827:1: rule__Association__Group__2 : ( ( rule__Association__TargetAssignment_2 ) ) ;
    public final void rule__Association__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2831:1: ( ( ( rule__Association__TargetAssignment_2 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2832:1: ( ( rule__Association__TargetAssignment_2 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2832:1: ( ( rule__Association__TargetAssignment_2 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2833:1: ( rule__Association__TargetAssignment_2 )
            {
             before(grammarAccess.getAssociationAccess().getTargetAssignment_2()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2834:1: ( rule__Association__TargetAssignment_2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2834:2: rule__Association__TargetAssignment_2
            {
            pushFollow(FOLLOW_rule__Association__TargetAssignment_2_in_rule__Association__Group__25814);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2850:1: rule__Dependency__Group__0 : ( ( rule__Dependency__DependencyFromAssignment_0 ) ) rule__Dependency__Group__1 ;
    public final void rule__Dependency__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2854:1: ( ( ( rule__Dependency__DependencyFromAssignment_0 ) ) rule__Dependency__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2855:1: ( ( rule__Dependency__DependencyFromAssignment_0 ) ) rule__Dependency__Group__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2855:1: ( ( rule__Dependency__DependencyFromAssignment_0 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2856:1: ( rule__Dependency__DependencyFromAssignment_0 )
            {
             before(grammarAccess.getDependencyAccess().getDependencyFromAssignment_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2857:1: ( rule__Dependency__DependencyFromAssignment_0 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2857:2: rule__Dependency__DependencyFromAssignment_0
            {
            pushFollow(FOLLOW_rule__Dependency__DependencyFromAssignment_0_in_rule__Dependency__Group__05854);
            rule__Dependency__DependencyFromAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getDependencyAccess().getDependencyFromAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Dependency__Group__1_in_rule__Dependency__Group__05863);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2868:1: rule__Dependency__Group__1 : ( '~>' ) rule__Dependency__Group__2 ;
    public final void rule__Dependency__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2872:1: ( ( '~>' ) rule__Dependency__Group__2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2873:1: ( '~>' ) rule__Dependency__Group__2
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2873:1: ( '~>' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2874:1: '~>'
            {
             before(grammarAccess.getDependencyAccess().getTildeGreaterThanSignKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__Dependency__Group__15892); 
             after(grammarAccess.getDependencyAccess().getTildeGreaterThanSignKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__Dependency__Group__2_in_rule__Dependency__Group__15902);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2888:1: rule__Dependency__Group__2 : ( ( rule__Dependency__DependencyToAssignment_2 ) ) ;
    public final void rule__Dependency__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2892:1: ( ( ( rule__Dependency__DependencyToAssignment_2 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2893:1: ( ( rule__Dependency__DependencyToAssignment_2 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2893:1: ( ( rule__Dependency__DependencyToAssignment_2 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2894:1: ( rule__Dependency__DependencyToAssignment_2 )
            {
             before(grammarAccess.getDependencyAccess().getDependencyToAssignment_2()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2895:1: ( rule__Dependency__DependencyToAssignment_2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2895:2: rule__Dependency__DependencyToAssignment_2
            {
            pushFollow(FOLLOW_rule__Dependency__DependencyToAssignment_2_in_rule__Dependency__Group__25930);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2911:1: rule__AndDecomposition__Group__0 : ( ( rule__AndDecomposition__TargetAssignment_0 ) ) rule__AndDecomposition__Group__1 ;
    public final void rule__AndDecomposition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2915:1: ( ( ( rule__AndDecomposition__TargetAssignment_0 ) ) rule__AndDecomposition__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2916:1: ( ( rule__AndDecomposition__TargetAssignment_0 ) ) rule__AndDecomposition__Group__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2916:1: ( ( rule__AndDecomposition__TargetAssignment_0 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2917:1: ( rule__AndDecomposition__TargetAssignment_0 )
            {
             before(grammarAccess.getAndDecompositionAccess().getTargetAssignment_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2918:1: ( rule__AndDecomposition__TargetAssignment_0 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2918:2: rule__AndDecomposition__TargetAssignment_0
            {
            pushFollow(FOLLOW_rule__AndDecomposition__TargetAssignment_0_in_rule__AndDecomposition__Group__05970);
            rule__AndDecomposition__TargetAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getAndDecompositionAccess().getTargetAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__AndDecomposition__Group__1_in_rule__AndDecomposition__Group__05979);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2929:1: rule__AndDecomposition__Group__1 : ( '<-(and)-' ) rule__AndDecomposition__Group__2 ;
    public final void rule__AndDecomposition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2933:1: ( ( '<-(and)-' ) rule__AndDecomposition__Group__2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2934:1: ( '<-(and)-' ) rule__AndDecomposition__Group__2
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2934:1: ( '<-(and)-' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2935:1: '<-(and)-'
            {
             before(grammarAccess.getAndDecompositionAccess().getAndKeyword_1()); 
            match(input,40,FOLLOW_40_in_rule__AndDecomposition__Group__16008); 
             after(grammarAccess.getAndDecompositionAccess().getAndKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__AndDecomposition__Group__2_in_rule__AndDecomposition__Group__16018);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2949:1: rule__AndDecomposition__Group__2 : ( ( rule__AndDecomposition__SourceAssignment_2 ) ) ;
    public final void rule__AndDecomposition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2953:1: ( ( ( rule__AndDecomposition__SourceAssignment_2 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2954:1: ( ( rule__AndDecomposition__SourceAssignment_2 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2954:1: ( ( rule__AndDecomposition__SourceAssignment_2 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2955:1: ( rule__AndDecomposition__SourceAssignment_2 )
            {
             before(grammarAccess.getAndDecompositionAccess().getSourceAssignment_2()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2956:1: ( rule__AndDecomposition__SourceAssignment_2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2956:2: rule__AndDecomposition__SourceAssignment_2
            {
            pushFollow(FOLLOW_rule__AndDecomposition__SourceAssignment_2_in_rule__AndDecomposition__Group__26046);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2972:1: rule__OrDecomposition__Group__0 : ( ( rule__OrDecomposition__TargetAssignment_0 ) ) rule__OrDecomposition__Group__1 ;
    public final void rule__OrDecomposition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2976:1: ( ( ( rule__OrDecomposition__TargetAssignment_0 ) ) rule__OrDecomposition__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2977:1: ( ( rule__OrDecomposition__TargetAssignment_0 ) ) rule__OrDecomposition__Group__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2977:1: ( ( rule__OrDecomposition__TargetAssignment_0 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2978:1: ( rule__OrDecomposition__TargetAssignment_0 )
            {
             before(grammarAccess.getOrDecompositionAccess().getTargetAssignment_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2979:1: ( rule__OrDecomposition__TargetAssignment_0 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2979:2: rule__OrDecomposition__TargetAssignment_0
            {
            pushFollow(FOLLOW_rule__OrDecomposition__TargetAssignment_0_in_rule__OrDecomposition__Group__06086);
            rule__OrDecomposition__TargetAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getOrDecompositionAccess().getTargetAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__OrDecomposition__Group__1_in_rule__OrDecomposition__Group__06095);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2990:1: rule__OrDecomposition__Group__1 : ( '<-(or)-' ) rule__OrDecomposition__Group__2 ;
    public final void rule__OrDecomposition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2994:1: ( ( '<-(or)-' ) rule__OrDecomposition__Group__2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2995:1: ( '<-(or)-' ) rule__OrDecomposition__Group__2
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2995:1: ( '<-(or)-' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2996:1: '<-(or)-'
            {
             before(grammarAccess.getOrDecompositionAccess().getOrKeyword_1()); 
            match(input,41,FOLLOW_41_in_rule__OrDecomposition__Group__16124); 
             after(grammarAccess.getOrDecompositionAccess().getOrKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__OrDecomposition__Group__2_in_rule__OrDecomposition__Group__16134);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3010:1: rule__OrDecomposition__Group__2 : ( ( rule__OrDecomposition__SourceAssignment_2 ) ) ;
    public final void rule__OrDecomposition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3014:1: ( ( ( rule__OrDecomposition__SourceAssignment_2 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3015:1: ( ( rule__OrDecomposition__SourceAssignment_2 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3015:1: ( ( rule__OrDecomposition__SourceAssignment_2 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3016:1: ( rule__OrDecomposition__SourceAssignment_2 )
            {
             before(grammarAccess.getOrDecompositionAccess().getSourceAssignment_2()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3017:1: ( rule__OrDecomposition__SourceAssignment_2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3017:2: rule__OrDecomposition__SourceAssignment_2
            {
            pushFollow(FOLLOW_rule__OrDecomposition__SourceAssignment_2_in_rule__OrDecomposition__Group__26162);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3033:1: rule__AndContribution__Group__0 : ( ( rule__AndContribution__SourceAssignment_0 ) ) rule__AndContribution__Group__1 ;
    public final void rule__AndContribution__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3037:1: ( ( ( rule__AndContribution__SourceAssignment_0 ) ) rule__AndContribution__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3038:1: ( ( rule__AndContribution__SourceAssignment_0 ) ) rule__AndContribution__Group__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3038:1: ( ( rule__AndContribution__SourceAssignment_0 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3039:1: ( rule__AndContribution__SourceAssignment_0 )
            {
             before(grammarAccess.getAndContributionAccess().getSourceAssignment_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3040:1: ( rule__AndContribution__SourceAssignment_0 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3040:2: rule__AndContribution__SourceAssignment_0
            {
            pushFollow(FOLLOW_rule__AndContribution__SourceAssignment_0_in_rule__AndContribution__Group__06202);
            rule__AndContribution__SourceAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getAndContributionAccess().getSourceAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__AndContribution__Group__1_in_rule__AndContribution__Group__06211);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3051:1: rule__AndContribution__Group__1 : ( '-(and)->' ) rule__AndContribution__Group__2 ;
    public final void rule__AndContribution__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3055:1: ( ( '-(and)->' ) rule__AndContribution__Group__2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3056:1: ( '-(and)->' ) rule__AndContribution__Group__2
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3056:1: ( '-(and)->' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3057:1: '-(and)->'
            {
             before(grammarAccess.getAndContributionAccess().getAndKeyword_1()); 
            match(input,42,FOLLOW_42_in_rule__AndContribution__Group__16240); 
             after(grammarAccess.getAndContributionAccess().getAndKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__AndContribution__Group__2_in_rule__AndContribution__Group__16250);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3071:1: rule__AndContribution__Group__2 : ( ( rule__AndContribution__TargetAssignment_2 ) ) ;
    public final void rule__AndContribution__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3075:1: ( ( ( rule__AndContribution__TargetAssignment_2 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3076:1: ( ( rule__AndContribution__TargetAssignment_2 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3076:1: ( ( rule__AndContribution__TargetAssignment_2 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3077:1: ( rule__AndContribution__TargetAssignment_2 )
            {
             before(grammarAccess.getAndContributionAccess().getTargetAssignment_2()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3078:1: ( rule__AndContribution__TargetAssignment_2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3078:2: rule__AndContribution__TargetAssignment_2
            {
            pushFollow(FOLLOW_rule__AndContribution__TargetAssignment_2_in_rule__AndContribution__Group__26278);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3094:1: rule__OrContribution__Group__0 : ( ( rule__OrContribution__SourceAssignment_0 ) ) rule__OrContribution__Group__1 ;
    public final void rule__OrContribution__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3098:1: ( ( ( rule__OrContribution__SourceAssignment_0 ) ) rule__OrContribution__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3099:1: ( ( rule__OrContribution__SourceAssignment_0 ) ) rule__OrContribution__Group__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3099:1: ( ( rule__OrContribution__SourceAssignment_0 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3100:1: ( rule__OrContribution__SourceAssignment_0 )
            {
             before(grammarAccess.getOrContributionAccess().getSourceAssignment_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3101:1: ( rule__OrContribution__SourceAssignment_0 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3101:2: rule__OrContribution__SourceAssignment_0
            {
            pushFollow(FOLLOW_rule__OrContribution__SourceAssignment_0_in_rule__OrContribution__Group__06318);
            rule__OrContribution__SourceAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getOrContributionAccess().getSourceAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__OrContribution__Group__1_in_rule__OrContribution__Group__06327);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3112:1: rule__OrContribution__Group__1 : ( '-(or)->' ) rule__OrContribution__Group__2 ;
    public final void rule__OrContribution__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3116:1: ( ( '-(or)->' ) rule__OrContribution__Group__2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3117:1: ( '-(or)->' ) rule__OrContribution__Group__2
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3117:1: ( '-(or)->' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3118:1: '-(or)->'
            {
             before(grammarAccess.getOrContributionAccess().getOrKeyword_1()); 
            match(input,43,FOLLOW_43_in_rule__OrContribution__Group__16356); 
             after(grammarAccess.getOrContributionAccess().getOrKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__OrContribution__Group__2_in_rule__OrContribution__Group__16366);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3132:1: rule__OrContribution__Group__2 : ( ( rule__OrContribution__TargetAssignment_2 ) ) ;
    public final void rule__OrContribution__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3136:1: ( ( ( rule__OrContribution__TargetAssignment_2 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3137:1: ( ( rule__OrContribution__TargetAssignment_2 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3137:1: ( ( rule__OrContribution__TargetAssignment_2 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3138:1: ( rule__OrContribution__TargetAssignment_2 )
            {
             before(grammarAccess.getOrContributionAccess().getTargetAssignment_2()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3139:1: ( rule__OrContribution__TargetAssignment_2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3139:2: rule__OrContribution__TargetAssignment_2
            {
            pushFollow(FOLLOW_rule__OrContribution__TargetAssignment_2_in_rule__OrContribution__Group__26394);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3155:1: rule__HelpContribution__Group__0 : ( ( rule__HelpContribution__SourceAssignment_0 ) ) rule__HelpContribution__Group__1 ;
    public final void rule__HelpContribution__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3159:1: ( ( ( rule__HelpContribution__SourceAssignment_0 ) ) rule__HelpContribution__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3160:1: ( ( rule__HelpContribution__SourceAssignment_0 ) ) rule__HelpContribution__Group__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3160:1: ( ( rule__HelpContribution__SourceAssignment_0 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3161:1: ( rule__HelpContribution__SourceAssignment_0 )
            {
             before(grammarAccess.getHelpContributionAccess().getSourceAssignment_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3162:1: ( rule__HelpContribution__SourceAssignment_0 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3162:2: rule__HelpContribution__SourceAssignment_0
            {
            pushFollow(FOLLOW_rule__HelpContribution__SourceAssignment_0_in_rule__HelpContribution__Group__06434);
            rule__HelpContribution__SourceAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getHelpContributionAccess().getSourceAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__HelpContribution__Group__1_in_rule__HelpContribution__Group__06443);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3173:1: rule__HelpContribution__Group__1 : ( '-(+)->' ) rule__HelpContribution__Group__2 ;
    public final void rule__HelpContribution__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3177:1: ( ( '-(+)->' ) rule__HelpContribution__Group__2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3178:1: ( '-(+)->' ) rule__HelpContribution__Group__2
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3178:1: ( '-(+)->' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3179:1: '-(+)->'
            {
             before(grammarAccess.getHelpContributionAccess().getHyphenMinusLeftParenthesisPlusSignRightParenthesisHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,44,FOLLOW_44_in_rule__HelpContribution__Group__16472); 
             after(grammarAccess.getHelpContributionAccess().getHyphenMinusLeftParenthesisPlusSignRightParenthesisHyphenMinusGreaterThanSignKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__HelpContribution__Group__2_in_rule__HelpContribution__Group__16482);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3193:1: rule__HelpContribution__Group__2 : ( ( rule__HelpContribution__TargetAssignment_2 ) ) ;
    public final void rule__HelpContribution__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3197:1: ( ( ( rule__HelpContribution__TargetAssignment_2 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3198:1: ( ( rule__HelpContribution__TargetAssignment_2 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3198:1: ( ( rule__HelpContribution__TargetAssignment_2 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3199:1: ( rule__HelpContribution__TargetAssignment_2 )
            {
             before(grammarAccess.getHelpContributionAccess().getTargetAssignment_2()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3200:1: ( rule__HelpContribution__TargetAssignment_2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3200:2: rule__HelpContribution__TargetAssignment_2
            {
            pushFollow(FOLLOW_rule__HelpContribution__TargetAssignment_2_in_rule__HelpContribution__Group__26510);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3216:1: rule__MakeContribution__Group__0 : ( ( rule__MakeContribution__SourceAssignment_0 ) ) rule__MakeContribution__Group__1 ;
    public final void rule__MakeContribution__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3220:1: ( ( ( rule__MakeContribution__SourceAssignment_0 ) ) rule__MakeContribution__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3221:1: ( ( rule__MakeContribution__SourceAssignment_0 ) ) rule__MakeContribution__Group__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3221:1: ( ( rule__MakeContribution__SourceAssignment_0 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3222:1: ( rule__MakeContribution__SourceAssignment_0 )
            {
             before(grammarAccess.getMakeContributionAccess().getSourceAssignment_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3223:1: ( rule__MakeContribution__SourceAssignment_0 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3223:2: rule__MakeContribution__SourceAssignment_0
            {
            pushFollow(FOLLOW_rule__MakeContribution__SourceAssignment_0_in_rule__MakeContribution__Group__06550);
            rule__MakeContribution__SourceAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getMakeContributionAccess().getSourceAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__MakeContribution__Group__1_in_rule__MakeContribution__Group__06559);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3234:1: rule__MakeContribution__Group__1 : ( '-(++)->' ) rule__MakeContribution__Group__2 ;
    public final void rule__MakeContribution__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3238:1: ( ( '-(++)->' ) rule__MakeContribution__Group__2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3239:1: ( '-(++)->' ) rule__MakeContribution__Group__2
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3239:1: ( '-(++)->' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3240:1: '-(++)->'
            {
             before(grammarAccess.getMakeContributionAccess().getHyphenMinusLeftParenthesisPlusSignPlusSignRightParenthesisHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,45,FOLLOW_45_in_rule__MakeContribution__Group__16588); 
             after(grammarAccess.getMakeContributionAccess().getHyphenMinusLeftParenthesisPlusSignPlusSignRightParenthesisHyphenMinusGreaterThanSignKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__MakeContribution__Group__2_in_rule__MakeContribution__Group__16598);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3254:1: rule__MakeContribution__Group__2 : ( ( rule__MakeContribution__TargetAssignment_2 ) ) ;
    public final void rule__MakeContribution__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3258:1: ( ( ( rule__MakeContribution__TargetAssignment_2 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3259:1: ( ( rule__MakeContribution__TargetAssignment_2 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3259:1: ( ( rule__MakeContribution__TargetAssignment_2 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3260:1: ( rule__MakeContribution__TargetAssignment_2 )
            {
             before(grammarAccess.getMakeContributionAccess().getTargetAssignment_2()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3261:1: ( rule__MakeContribution__TargetAssignment_2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3261:2: rule__MakeContribution__TargetAssignment_2
            {
            pushFollow(FOLLOW_rule__MakeContribution__TargetAssignment_2_in_rule__MakeContribution__Group__26626);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3277:1: rule__HurtContribution__Group__0 : ( ( rule__HurtContribution__SourceAssignment_0 ) ) rule__HurtContribution__Group__1 ;
    public final void rule__HurtContribution__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3281:1: ( ( ( rule__HurtContribution__SourceAssignment_0 ) ) rule__HurtContribution__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3282:1: ( ( rule__HurtContribution__SourceAssignment_0 ) ) rule__HurtContribution__Group__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3282:1: ( ( rule__HurtContribution__SourceAssignment_0 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3283:1: ( rule__HurtContribution__SourceAssignment_0 )
            {
             before(grammarAccess.getHurtContributionAccess().getSourceAssignment_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3284:1: ( rule__HurtContribution__SourceAssignment_0 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3284:2: rule__HurtContribution__SourceAssignment_0
            {
            pushFollow(FOLLOW_rule__HurtContribution__SourceAssignment_0_in_rule__HurtContribution__Group__06666);
            rule__HurtContribution__SourceAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getHurtContributionAccess().getSourceAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__HurtContribution__Group__1_in_rule__HurtContribution__Group__06675);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3295:1: rule__HurtContribution__Group__1 : ( '-(-)->' ) rule__HurtContribution__Group__2 ;
    public final void rule__HurtContribution__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3299:1: ( ( '-(-)->' ) rule__HurtContribution__Group__2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3300:1: ( '-(-)->' ) rule__HurtContribution__Group__2
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3300:1: ( '-(-)->' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3301:1: '-(-)->'
            {
             before(grammarAccess.getHurtContributionAccess().getHyphenMinusLeftParenthesisHyphenMinusRightParenthesisHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,46,FOLLOW_46_in_rule__HurtContribution__Group__16704); 
             after(grammarAccess.getHurtContributionAccess().getHyphenMinusLeftParenthesisHyphenMinusRightParenthesisHyphenMinusGreaterThanSignKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__HurtContribution__Group__2_in_rule__HurtContribution__Group__16714);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3315:1: rule__HurtContribution__Group__2 : ( ( rule__HurtContribution__TargetAssignment_2 ) ) ;
    public final void rule__HurtContribution__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3319:1: ( ( ( rule__HurtContribution__TargetAssignment_2 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3320:1: ( ( rule__HurtContribution__TargetAssignment_2 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3320:1: ( ( rule__HurtContribution__TargetAssignment_2 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3321:1: ( rule__HurtContribution__TargetAssignment_2 )
            {
             before(grammarAccess.getHurtContributionAccess().getTargetAssignment_2()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3322:1: ( rule__HurtContribution__TargetAssignment_2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3322:2: rule__HurtContribution__TargetAssignment_2
            {
            pushFollow(FOLLOW_rule__HurtContribution__TargetAssignment_2_in_rule__HurtContribution__Group__26742);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3338:1: rule__BreakContribution__Group__0 : ( ( rule__BreakContribution__SourceAssignment_0 ) ) rule__BreakContribution__Group__1 ;
    public final void rule__BreakContribution__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3342:1: ( ( ( rule__BreakContribution__SourceAssignment_0 ) ) rule__BreakContribution__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3343:1: ( ( rule__BreakContribution__SourceAssignment_0 ) ) rule__BreakContribution__Group__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3343:1: ( ( rule__BreakContribution__SourceAssignment_0 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3344:1: ( rule__BreakContribution__SourceAssignment_0 )
            {
             before(grammarAccess.getBreakContributionAccess().getSourceAssignment_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3345:1: ( rule__BreakContribution__SourceAssignment_0 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3345:2: rule__BreakContribution__SourceAssignment_0
            {
            pushFollow(FOLLOW_rule__BreakContribution__SourceAssignment_0_in_rule__BreakContribution__Group__06782);
            rule__BreakContribution__SourceAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getBreakContributionAccess().getSourceAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__BreakContribution__Group__1_in_rule__BreakContribution__Group__06791);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3356:1: rule__BreakContribution__Group__1 : ( '-(--)->' ) rule__BreakContribution__Group__2 ;
    public final void rule__BreakContribution__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3360:1: ( ( '-(--)->' ) rule__BreakContribution__Group__2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3361:1: ( '-(--)->' ) rule__BreakContribution__Group__2
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3361:1: ( '-(--)->' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3362:1: '-(--)->'
            {
             before(grammarAccess.getBreakContributionAccess().getHyphenMinusLeftParenthesisHyphenMinusHyphenMinusRightParenthesisHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,47,FOLLOW_47_in_rule__BreakContribution__Group__16820); 
             after(grammarAccess.getBreakContributionAccess().getHyphenMinusLeftParenthesisHyphenMinusHyphenMinusRightParenthesisHyphenMinusGreaterThanSignKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__BreakContribution__Group__2_in_rule__BreakContribution__Group__16830);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3376:1: rule__BreakContribution__Group__2 : ( ( rule__BreakContribution__TargetAssignment_2 ) ) ;
    public final void rule__BreakContribution__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3380:1: ( ( ( rule__BreakContribution__TargetAssignment_2 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3381:1: ( ( rule__BreakContribution__TargetAssignment_2 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3381:1: ( ( rule__BreakContribution__TargetAssignment_2 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3382:1: ( rule__BreakContribution__TargetAssignment_2 )
            {
             before(grammarAccess.getBreakContributionAccess().getTargetAssignment_2()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3383:1: ( rule__BreakContribution__TargetAssignment_2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3383:2: rule__BreakContribution__TargetAssignment_2
            {
            pushFollow(FOLLOW_rule__BreakContribution__TargetAssignment_2_in_rule__BreakContribution__Group__26858);
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


    // $ANTLR start rule__ProblemDiagram__DescriptionAssignment_0_2
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3399:1: rule__ProblemDiagram__DescriptionAssignment_0_2 : ( RULE_STRING ) ;
    public final void rule__ProblemDiagram__DescriptionAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3403:1: ( ( RULE_STRING ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3404:1: ( RULE_STRING )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3404:1: ( RULE_STRING )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3405:1: RULE_STRING
            {
             before(grammarAccess.getProblemDiagramAccess().getDescriptionSTRINGTerminalRuleCall_0_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ProblemDiagram__DescriptionAssignment_0_26898); 
             after(grammarAccess.getProblemDiagramAccess().getDescriptionSTRINGTerminalRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProblemDiagram__DescriptionAssignment_0_2


    // $ANTLR start rule__ProblemDiagram__NodesAssignment_1_0
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3414:1: rule__ProblemDiagram__NodesAssignment_1_0 : ( ruleNode ) ;
    public final void rule__ProblemDiagram__NodesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3418:1: ( ( ruleNode ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3419:1: ( ruleNode )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3419:1: ( ruleNode )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3420:1: ruleNode
            {
             before(grammarAccess.getProblemDiagramAccess().getNodesNodeParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleNode_in_rule__ProblemDiagram__NodesAssignment_1_06929);
            ruleNode();
            _fsp--;

             after(grammarAccess.getProblemDiagramAccess().getNodesNodeParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProblemDiagram__NodesAssignment_1_0


    // $ANTLR start rule__ProblemDiagram__LinksAssignment_1_1
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3429:1: rule__ProblemDiagram__LinksAssignment_1_1 : ( ruleLink ) ;
    public final void rule__ProblemDiagram__LinksAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3433:1: ( ( ruleLink ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3434:1: ( ruleLink )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3434:1: ( ruleLink )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3435:1: ruleLink
            {
             before(grammarAccess.getProblemDiagramAccess().getLinksLinkParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleLink_in_rule__ProblemDiagram__LinksAssignment_1_16960);
            ruleLink();
            _fsp--;

             after(grammarAccess.getProblemDiagramAccess().getLinksLinkParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProblemDiagram__LinksAssignment_1_1


    // $ANTLR start rule__Node__NameAssignment_0
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3444:1: rule__Node__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Node__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3448:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3449:1: ( RULE_ID )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3449:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3450:1: RULE_ID
            {
             before(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Node__NameAssignment_06991); 
             after(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__NameAssignment_0


    // $ANTLR start rule__Node__TypeAssignment_1
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3459:1: rule__Node__TypeAssignment_1 : ( ruleNodeType ) ;
    public final void rule__Node__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3463:1: ( ( ruleNodeType ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3464:1: ( ruleNodeType )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3464:1: ( ruleNodeType )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3465:1: ruleNodeType
            {
             before(grammarAccess.getNodeAccess().getTypeNodeTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleNodeType_in_rule__Node__TypeAssignment_17022);
            ruleNodeType();
            _fsp--;

             after(grammarAccess.getNodeAccess().getTypeNodeTypeEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__TypeAssignment_1


    // $ANTLR start rule__Node__DescriptionAssignment_2_1
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3474:1: rule__Node__DescriptionAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Node__DescriptionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3478:1: ( ( RULE_STRING ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3479:1: ( RULE_STRING )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3479:1: ( RULE_STRING )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3480:1: RULE_STRING
            {
             before(grammarAccess.getNodeAccess().getDescriptionSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Node__DescriptionAssignment_2_17053); 
             after(grammarAccess.getNodeAccess().getDescriptionSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__DescriptionAssignment_2_1


    // $ANTLR start rule__Node__SubproblemAssignment_3_1_0
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3489:1: rule__Node__SubproblemAssignment_3_1_0 : ( ruleProblemDiagram ) ;
    public final void rule__Node__SubproblemAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3493:1: ( ( ruleProblemDiagram ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3494:1: ( ruleProblemDiagram )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3494:1: ( ruleProblemDiagram )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3495:1: ruleProblemDiagram
            {
             before(grammarAccess.getNodeAccess().getSubproblemProblemDiagramParserRuleCall_3_1_0_0()); 
            pushFollow(FOLLOW_ruleProblemDiagram_in_rule__Node__SubproblemAssignment_3_1_07084);
            ruleProblemDiagram();
            _fsp--;

             after(grammarAccess.getNodeAccess().getSubproblemProblemDiagramParserRuleCall_3_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__SubproblemAssignment_3_1_0


    // $ANTLR start rule__Node__IstarAssignment_3_1_1
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3504:1: rule__Node__IstarAssignment_3_1_1 : ( ruleModel ) ;
    public final void rule__Node__IstarAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3508:1: ( ( ruleModel ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3509:1: ( ruleModel )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3509:1: ( ruleModel )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3510:1: ruleModel
            {
             before(grammarAccess.getNodeAccess().getIstarModelParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_ruleModel_in_rule__Node__IstarAssignment_3_1_17115);
            ruleModel();
            _fsp--;

             after(grammarAccess.getNodeAccess().getIstarModelParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__IstarAssignment_3_1_1


    // $ANTLR start rule__Phenomenon__TypeAssignment_0
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3519:1: rule__Phenomenon__TypeAssignment_0 : ( rulePhenomenonType ) ;
    public final void rule__Phenomenon__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3523:1: ( ( rulePhenomenonType ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3524:1: ( rulePhenomenonType )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3524:1: ( rulePhenomenonType )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3525:1: rulePhenomenonType
            {
             before(grammarAccess.getPhenomenonAccess().getTypePhenomenonTypeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_rulePhenomenonType_in_rule__Phenomenon__TypeAssignment_07146);
            rulePhenomenonType();
            _fsp--;

             after(grammarAccess.getPhenomenonAccess().getTypePhenomenonTypeEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Phenomenon__TypeAssignment_0


    // $ANTLR start rule__Phenomenon__NameAssignment_1
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3534:1: rule__Phenomenon__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Phenomenon__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3538:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3539:1: ( RULE_ID )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3539:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3540:1: RULE_ID
            {
             before(grammarAccess.getPhenomenonAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Phenomenon__NameAssignment_17177); 
             after(grammarAccess.getPhenomenonAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Phenomenon__NameAssignment_1


    // $ANTLR start rule__Phenomenon__DescriptionAssignment_2_1
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3549:1: rule__Phenomenon__DescriptionAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Phenomenon__DescriptionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3553:1: ( ( RULE_STRING ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3554:1: ( RULE_STRING )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3554:1: ( RULE_STRING )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3555:1: RULE_STRING
            {
             before(grammarAccess.getPhenomenonAccess().getDescriptionSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Phenomenon__DescriptionAssignment_2_17208); 
             after(grammarAccess.getPhenomenonAccess().getDescriptionSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Phenomenon__DescriptionAssignment_2_1


    // $ANTLR start rule__Link__FromAssignment_0
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3564:1: rule__Link__FromAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Link__FromAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3568:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3569:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3569:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3570:1: ( RULE_ID )
            {
             before(grammarAccess.getLinkAccess().getFromNodeCrossReference_0_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3571:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3572:1: RULE_ID
            {
             before(grammarAccess.getLinkAccess().getFromNodeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Link__FromAssignment_07243); 
             after(grammarAccess.getLinkAccess().getFromNodeIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getLinkAccess().getFromNodeCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__FromAssignment_0


    // $ANTLR start rule__Link__TypeAssignment_1
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3583:1: rule__Link__TypeAssignment_1 : ( ruleLinkType ) ;
    public final void rule__Link__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3587:1: ( ( ruleLinkType ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3588:1: ( ruleLinkType )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3588:1: ( ruleLinkType )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3589:1: ruleLinkType
            {
             before(grammarAccess.getLinkAccess().getTypeLinkTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleLinkType_in_rule__Link__TypeAssignment_17278);
            ruleLinkType();
            _fsp--;

             after(grammarAccess.getLinkAccess().getTypeLinkTypeEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__TypeAssignment_1


    // $ANTLR start rule__Link__ToAssignment_2
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3598:1: rule__Link__ToAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Link__ToAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3602:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3603:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3603:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3604:1: ( RULE_ID )
            {
             before(grammarAccess.getLinkAccess().getToNodeCrossReference_2_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3605:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3606:1: RULE_ID
            {
             before(grammarAccess.getLinkAccess().getToNodeIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Link__ToAssignment_27313); 
             after(grammarAccess.getLinkAccess().getToNodeIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getLinkAccess().getToNodeCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__ToAssignment_2


    // $ANTLR start rule__Link__PhenomenaAssignment_3_1
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3617:1: rule__Link__PhenomenaAssignment_3_1 : ( rulePhenomenon ) ;
    public final void rule__Link__PhenomenaAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3621:1: ( ( rulePhenomenon ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3622:1: ( rulePhenomenon )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3622:1: ( rulePhenomenon )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3623:1: rulePhenomenon
            {
             before(grammarAccess.getLinkAccess().getPhenomenaPhenomenonParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_rulePhenomenon_in_rule__Link__PhenomenaAssignment_3_17348);
            rulePhenomenon();
            _fsp--;

             after(grammarAccess.getLinkAccess().getPhenomenaPhenomenonParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__PhenomenaAssignment_3_1


    // $ANTLR start rule__Link__PhenomenaAssignment_3_2_1
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3632:1: rule__Link__PhenomenaAssignment_3_2_1 : ( rulePhenomenon ) ;
    public final void rule__Link__PhenomenaAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3636:1: ( ( rulePhenomenon ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3637:1: ( rulePhenomenon )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3637:1: ( rulePhenomenon )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3638:1: rulePhenomenon
            {
             before(grammarAccess.getLinkAccess().getPhenomenaPhenomenonParserRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_rulePhenomenon_in_rule__Link__PhenomenaAssignment_3_2_17379);
            rulePhenomenon();
            _fsp--;

             after(grammarAccess.getLinkAccess().getPhenomenaPhenomenonParserRuleCall_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__PhenomenaAssignment_3_2_1


    // $ANTLR start rule__Link__DescriptionAssignment_4_1
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3647:1: rule__Link__DescriptionAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Link__DescriptionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3651:1: ( ( RULE_STRING ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3652:1: ( RULE_STRING )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3652:1: ( RULE_STRING )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3653:1: RULE_STRING
            {
             before(grammarAccess.getLinkAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Link__DescriptionAssignment_4_17410); 
             after(grammarAccess.getLinkAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__DescriptionAssignment_4_1


    // $ANTLR start rule__Model__NameAssignment_1
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3662:1: rule__Model__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3666:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3667:1: ( RULE_ID )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3667:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3668:1: RULE_ID
            {
             before(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Model__NameAssignment_17441); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3677:1: rule__Model__ContainersAssignment_3_0 : ( ruleContainer ) ;
    public final void rule__Model__ContainersAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3681:1: ( ( ruleContainer ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3682:1: ( ruleContainer )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3682:1: ( ruleContainer )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3683:1: ruleContainer
            {
             before(grammarAccess.getModelAccess().getContainersContainerParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_ruleContainer_in_rule__Model__ContainersAssignment_3_07472);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3692:1: rule__Model__IntentionsAssignment_3_1 : ( ruleIntention ) ;
    public final void rule__Model__IntentionsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3696:1: ( ( ruleIntention ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3697:1: ( ruleIntention )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3697:1: ( ruleIntention )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3698:1: ruleIntention
            {
             before(grammarAccess.getModelAccess().getIntentionsIntentionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleIntention_in_rule__Model__IntentionsAssignment_3_17503);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3707:1: rule__Model__DecompositionsAssignment_3_2 : ( ruleDecomposition ) ;
    public final void rule__Model__DecompositionsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3711:1: ( ( ruleDecomposition ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3712:1: ( ruleDecomposition )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3712:1: ( ruleDecomposition )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3713:1: ruleDecomposition
            {
             before(grammarAccess.getModelAccess().getDecompositionsDecompositionParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_ruleDecomposition_in_rule__Model__DecompositionsAssignment_3_27534);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3722:1: rule__Model__DependenciesAssignment_3_3 : ( ruleDependency ) ;
    public final void rule__Model__DependenciesAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3726:1: ( ( ruleDependency ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3727:1: ( ruleDependency )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3727:1: ( ruleDependency )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3728:1: ruleDependency
            {
             before(grammarAccess.getModelAccess().getDependenciesDependencyParserRuleCall_3_3_0()); 
            pushFollow(FOLLOW_ruleDependency_in_rule__Model__DependenciesAssignment_3_37565);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3737:1: rule__Model__ContributionsAssignment_3_4 : ( ruleContribution ) ;
    public final void rule__Model__ContributionsAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3741:1: ( ( ruleContribution ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3742:1: ( ruleContribution )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3742:1: ( ruleContribution )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3743:1: ruleContribution
            {
             before(grammarAccess.getModelAccess().getContributionsContributionParserRuleCall_3_4_0()); 
            pushFollow(FOLLOW_ruleContribution_in_rule__Model__ContributionsAssignment_3_47596);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3752:1: rule__Model__AssociationsAssignment_3_5 : ( ruleAssociation ) ;
    public final void rule__Model__AssociationsAssignment_3_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3756:1: ( ( ruleAssociation ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3757:1: ( ruleAssociation )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3757:1: ( ruleAssociation )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3758:1: ruleAssociation
            {
             before(grammarAccess.getModelAccess().getAssociationsAssociationParserRuleCall_3_5_0()); 
            pushFollow(FOLLOW_ruleAssociation_in_rule__Model__AssociationsAssignment_3_57627);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3767:1: rule__Actor__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Actor__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3771:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3772:1: ( RULE_ID )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3772:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3773:1: RULE_ID
            {
             before(grammarAccess.getActorAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Actor__NameAssignment_17658); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3782:1: rule__Actor__Is_aAssignment_2_0 : ( ( RULE_ID ) ) ;
    public final void rule__Actor__Is_aAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3786:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3787:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3787:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3788:1: ( RULE_ID )
            {
             before(grammarAccess.getActorAccess().getIs_aActorCrossReference_2_0_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3789:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3790:1: RULE_ID
            {
             before(grammarAccess.getActorAccess().getIs_aActorIDTerminalRuleCall_2_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Actor__Is_aAssignment_2_07693); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3801:1: rule__Actor__Is_part_ofAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Actor__Is_part_ofAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3805:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3806:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3806:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3807:1: ( RULE_ID )
            {
             before(grammarAccess.getActorAccess().getIs_part_ofActorCrossReference_2_1_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3808:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3809:1: RULE_ID
            {
             before(grammarAccess.getActorAccess().getIs_part_ofActorIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Actor__Is_part_ofAssignment_2_17732); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3820:1: rule__Actor__IntentionsAssignment_3_1 : ( ruleIntention ) ;
    public final void rule__Actor__IntentionsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3824:1: ( ( ruleIntention ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3825:1: ( ruleIntention )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3825:1: ( ruleIntention )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3826:1: ruleIntention
            {
             before(grammarAccess.getActorAccess().getIntentionsIntentionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleIntention_in_rule__Actor__IntentionsAssignment_3_17767);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3835:1: rule__Agent__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Agent__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3839:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3840:1: ( RULE_ID )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3840:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3841:1: RULE_ID
            {
             before(grammarAccess.getAgentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Agent__NameAssignment_17798); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3850:1: rule__Agent__IntentionsAssignment_2_1 : ( ruleIntention ) ;
    public final void rule__Agent__IntentionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3854:1: ( ( ruleIntention ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3855:1: ( ruleIntention )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3855:1: ( ruleIntention )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3856:1: ruleIntention
            {
             before(grammarAccess.getAgentAccess().getIntentionsIntentionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleIntention_in_rule__Agent__IntentionsAssignment_2_17829);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3865:1: rule__Role__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Role__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3869:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3870:1: ( RULE_ID )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3870:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3871:1: RULE_ID
            {
             before(grammarAccess.getRoleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Role__NameAssignment_17860); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3880:1: rule__Role__IntentionsAssignment_2_1 : ( ruleIntention ) ;
    public final void rule__Role__IntentionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3884:1: ( ( ruleIntention ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3885:1: ( ruleIntention )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3885:1: ( ruleIntention )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3886:1: ruleIntention
            {
             before(grammarAccess.getRoleAccess().getIntentionsIntentionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleIntention_in_rule__Role__IntentionsAssignment_2_17891);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3895:1: rule__Position__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Position__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3899:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3900:1: ( RULE_ID )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3900:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3901:1: RULE_ID
            {
             before(grammarAccess.getPositionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Position__NameAssignment_17922); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3910:1: rule__Position__IntentionsAssignment_2_1 : ( ruleIntention ) ;
    public final void rule__Position__IntentionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3914:1: ( ( ruleIntention ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3915:1: ( ruleIntention )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3915:1: ( ruleIntention )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3916:1: ruleIntention
            {
             before(grammarAccess.getPositionAccess().getIntentionsIntentionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleIntention_in_rule__Position__IntentionsAssignment_2_17953);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3925:1: rule__Goal__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Goal__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3929:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3930:1: ( RULE_ID )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3930:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3931:1: RULE_ID
            {
             before(grammarAccess.getGoalAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Goal__NameAssignment_17984); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3940:1: rule__Goal__DecompositionsAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Goal__DecompositionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3944:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3945:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3945:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3946:1: ( RULE_ID )
            {
             before(grammarAccess.getGoalAccess().getDecompositionsDecompositionCrossReference_2_1_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3947:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3948:1: RULE_ID
            {
             before(grammarAccess.getGoalAccess().getDecompositionsDecompositionIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Goal__DecompositionsAssignment_2_18019); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3959:1: rule__Softgoal__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Softgoal__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3963:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3964:1: ( RULE_ID )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3964:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3965:1: RULE_ID
            {
             before(grammarAccess.getSoftgoalAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Softgoal__NameAssignment_18054); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3974:1: rule__Task__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Task__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3978:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3979:1: ( RULE_ID )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3979:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3980:1: RULE_ID
            {
             before(grammarAccess.getTaskAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Task__NameAssignment_18085); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3989:1: rule__Resource__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Resource__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3993:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3994:1: ( RULE_ID )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3994:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3995:1: RULE_ID
            {
             before(grammarAccess.getResourceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Resource__NameAssignment_18116); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4004:1: rule__Belief__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Belief__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4008:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4009:1: ( RULE_ID )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4009:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4010:1: RULE_ID
            {
             before(grammarAccess.getBeliefAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Belief__NameAssignment_18147); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4019:1: rule__Association__SourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Association__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4023:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4024:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4024:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4025:1: ( RULE_ID )
            {
             before(grammarAccess.getAssociationAccess().getSourceContainerCrossReference_0_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4026:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4027:1: RULE_ID
            {
             before(grammarAccess.getAssociationAccess().getSourceContainerIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Association__SourceAssignment_08182); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4038:1: rule__Association__TargetAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Association__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4042:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4043:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4043:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4044:1: ( RULE_ID )
            {
             before(grammarAccess.getAssociationAccess().getTargetContainerCrossReference_2_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4045:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4046:1: RULE_ID
            {
             before(grammarAccess.getAssociationAccess().getTargetContainerIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Association__TargetAssignment_28221); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4057:1: rule__Dependency__DependencyFromAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Dependency__DependencyFromAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4061:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4062:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4062:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4063:1: ( RULE_ID )
            {
             before(grammarAccess.getDependencyAccess().getDependencyFromDependableCrossReference_0_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4064:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4065:1: RULE_ID
            {
             before(grammarAccess.getDependencyAccess().getDependencyFromDependableIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Dependency__DependencyFromAssignment_08260); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4076:1: rule__Dependency__DependencyToAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Dependency__DependencyToAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4080:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4081:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4081:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4082:1: ( RULE_ID )
            {
             before(grammarAccess.getDependencyAccess().getDependencyToDependableCrossReference_2_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4083:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4084:1: RULE_ID
            {
             before(grammarAccess.getDependencyAccess().getDependencyToDependableIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Dependency__DependencyToAssignment_28299); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4095:1: rule__AndDecomposition__TargetAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__AndDecomposition__TargetAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4099:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4100:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4100:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4101:1: ( RULE_ID )
            {
             before(grammarAccess.getAndDecompositionAccess().getTargetIntentionCrossReference_0_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4102:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4103:1: RULE_ID
            {
             before(grammarAccess.getAndDecompositionAccess().getTargetIntentionIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AndDecomposition__TargetAssignment_08338); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4114:1: rule__AndDecomposition__SourceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__AndDecomposition__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4118:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4119:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4119:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4120:1: ( RULE_ID )
            {
             before(grammarAccess.getAndDecompositionAccess().getSourceIntentionCrossReference_2_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4121:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4122:1: RULE_ID
            {
             before(grammarAccess.getAndDecompositionAccess().getSourceIntentionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AndDecomposition__SourceAssignment_28377); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4133:1: rule__OrDecomposition__TargetAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__OrDecomposition__TargetAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4137:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4138:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4138:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4139:1: ( RULE_ID )
            {
             before(grammarAccess.getOrDecompositionAccess().getTargetIntentionCrossReference_0_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4140:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4141:1: RULE_ID
            {
             before(grammarAccess.getOrDecompositionAccess().getTargetIntentionIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__OrDecomposition__TargetAssignment_08416); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4152:1: rule__OrDecomposition__SourceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__OrDecomposition__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4156:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4157:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4157:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4158:1: ( RULE_ID )
            {
             before(grammarAccess.getOrDecompositionAccess().getSourceIntentionCrossReference_2_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4159:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4160:1: RULE_ID
            {
             before(grammarAccess.getOrDecompositionAccess().getSourceIntentionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__OrDecomposition__SourceAssignment_28455); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4171:1: rule__AndContribution__SourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__AndContribution__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4175:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4176:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4176:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4177:1: ( RULE_ID )
            {
             before(grammarAccess.getAndContributionAccess().getSourceIntentionCrossReference_0_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4178:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4179:1: RULE_ID
            {
             before(grammarAccess.getAndContributionAccess().getSourceIntentionIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AndContribution__SourceAssignment_08494); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4190:1: rule__AndContribution__TargetAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__AndContribution__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4194:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4195:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4195:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4196:1: ( RULE_ID )
            {
             before(grammarAccess.getAndContributionAccess().getTargetIntentionCrossReference_2_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4197:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4198:1: RULE_ID
            {
             before(grammarAccess.getAndContributionAccess().getTargetIntentionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AndContribution__TargetAssignment_28533); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4209:1: rule__OrContribution__SourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__OrContribution__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4213:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4214:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4214:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4215:1: ( RULE_ID )
            {
             before(grammarAccess.getOrContributionAccess().getSourceIntentionCrossReference_0_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4216:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4217:1: RULE_ID
            {
             before(grammarAccess.getOrContributionAccess().getSourceIntentionIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__OrContribution__SourceAssignment_08572); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4228:1: rule__OrContribution__TargetAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__OrContribution__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4232:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4233:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4233:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4234:1: ( RULE_ID )
            {
             before(grammarAccess.getOrContributionAccess().getTargetIntentionCrossReference_2_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4235:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4236:1: RULE_ID
            {
             before(grammarAccess.getOrContributionAccess().getTargetIntentionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__OrContribution__TargetAssignment_28611); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4247:1: rule__HelpContribution__SourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__HelpContribution__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4251:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4252:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4252:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4253:1: ( RULE_ID )
            {
             before(grammarAccess.getHelpContributionAccess().getSourceIntentionCrossReference_0_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4254:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4255:1: RULE_ID
            {
             before(grammarAccess.getHelpContributionAccess().getSourceIntentionIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__HelpContribution__SourceAssignment_08650); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4266:1: rule__HelpContribution__TargetAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__HelpContribution__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4270:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4271:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4271:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4272:1: ( RULE_ID )
            {
             before(grammarAccess.getHelpContributionAccess().getTargetIntentionCrossReference_2_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4273:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4274:1: RULE_ID
            {
             before(grammarAccess.getHelpContributionAccess().getTargetIntentionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__HelpContribution__TargetAssignment_28689); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4285:1: rule__MakeContribution__SourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__MakeContribution__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4289:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4290:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4290:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4291:1: ( RULE_ID )
            {
             before(grammarAccess.getMakeContributionAccess().getSourceIntentionCrossReference_0_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4292:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4293:1: RULE_ID
            {
             before(grammarAccess.getMakeContributionAccess().getSourceIntentionIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MakeContribution__SourceAssignment_08728); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4304:1: rule__MakeContribution__TargetAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__MakeContribution__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4308:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4309:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4309:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4310:1: ( RULE_ID )
            {
             before(grammarAccess.getMakeContributionAccess().getTargetIntentionCrossReference_2_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4311:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4312:1: RULE_ID
            {
             before(grammarAccess.getMakeContributionAccess().getTargetIntentionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MakeContribution__TargetAssignment_28767); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4323:1: rule__HurtContribution__SourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__HurtContribution__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4327:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4328:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4328:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4329:1: ( RULE_ID )
            {
             before(grammarAccess.getHurtContributionAccess().getSourceIntentionCrossReference_0_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4330:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4331:1: RULE_ID
            {
             before(grammarAccess.getHurtContributionAccess().getSourceIntentionIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__HurtContribution__SourceAssignment_08806); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4342:1: rule__HurtContribution__TargetAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__HurtContribution__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4346:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4347:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4347:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4348:1: ( RULE_ID )
            {
             before(grammarAccess.getHurtContributionAccess().getTargetIntentionCrossReference_2_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4349:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4350:1: RULE_ID
            {
             before(grammarAccess.getHurtContributionAccess().getTargetIntentionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__HurtContribution__TargetAssignment_28845); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4361:1: rule__BreakContribution__SourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__BreakContribution__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4365:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4366:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4366:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4367:1: ( RULE_ID )
            {
             before(grammarAccess.getBreakContributionAccess().getSourceIntentionCrossReference_0_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4368:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4369:1: RULE_ID
            {
             before(grammarAccess.getBreakContributionAccess().getSourceIntentionIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BreakContribution__SourceAssignment_08884); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4380:1: rule__BreakContribution__TargetAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__BreakContribution__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4384:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4385:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4385:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4386:1: ( RULE_ID )
            {
             before(grammarAccess.getBreakContributionAccess().getTargetIntentionCrossReference_2_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4387:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4388:1: RULE_ID
            {
             before(grammarAccess.getBreakContributionAccess().getTargetIntentionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BreakContribution__TargetAssignment_28923); 
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


 

    public static final BitSet FOLLOW_ruleProblemDiagram_in_entryRuleProblemDiagram60 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProblemDiagram67 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__Group__0_in_ruleProblemDiagram94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_entryRuleNode120 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNode127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__0_in_ruleNode154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhenomenon_in_entryRulePhenomenon180 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePhenomenon187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Phenomenon__Group__0_in_rulePhenomenon214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_entryRuleLink240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLink247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group__0_in_ruleLink274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainer_in_entryRuleContainer360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContainer367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Container__Alternatives_in_ruleContainer394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActor_in_entryRuleActor420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActor427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actor__Group__0_in_ruleActor454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAgent_in_entryRuleAgent480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAgent487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Agent__Group__0_in_ruleAgent514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRole_in_entryRuleRole540 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRole547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group__0_in_ruleRole574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePosition_in_entryRulePosition600 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePosition607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Position__Group__0_in_rulePosition634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntention_in_entryRuleIntention660 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntention667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Intention__Alternatives_in_ruleIntention694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoal_in_entryRuleGoal720 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoal727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goal__Group__0_in_ruleGoal754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSoftgoal_in_entryRuleSoftgoal780 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSoftgoal787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Softgoal__Group__0_in_ruleSoftgoal814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTask_in_entryRuleTask840 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTask847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group__0_in_ruleTask874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResource_in_entryRuleResource900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResource907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__0_in_ruleResource934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBelief_in_entryRuleBelief960 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBelief967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Belief__Group__0_in_ruleBelief994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociation_in_entryRuleAssociation1022 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssociation1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group__0_in_ruleAssociation1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependency_in_entryRuleDependency1082 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependency1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dependency__Group__0_in_ruleDependency1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecomposition_in_entryRuleDecomposition1142 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecomposition1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decomposition__Alternatives_in_ruleDecomposition1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndDecomposition_in_entryRuleAndDecomposition1202 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndDecomposition1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndDecomposition__Group__0_in_ruleAndDecomposition1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrDecomposition_in_entryRuleOrDecomposition1262 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrDecomposition1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrDecomposition__Group__0_in_ruleOrDecomposition1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContribution_in_entryRuleContribution1322 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContribution1329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Contribution__Alternatives_in_ruleContribution1356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndContribution_in_entryRuleAndContribution1382 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndContribution1389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndContribution__Group__0_in_ruleAndContribution1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrContribution_in_entryRuleOrContribution1442 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrContribution1449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrContribution__Group__0_in_ruleOrContribution1476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHelpContribution_in_entryRuleHelpContribution1502 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHelpContribution1509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HelpContribution__Group__0_in_ruleHelpContribution1536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMakeContribution_in_entryRuleMakeContribution1562 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMakeContribution1569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MakeContribution__Group__0_in_ruleMakeContribution1596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHurtContribution_in_entryRuleHurtContribution1622 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHurtContribution1629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HurtContribution__Group__0_in_ruleHurtContribution1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBreakContribution_in_entryRuleBreakContribution1682 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBreakContribution1689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BreakContribution__Group__0_in_ruleBreakContribution1716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeType__Alternatives_in_ruleNodeType1753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PhenomenonType__Alternatives_in_rulePhenomenonType1789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinkType__Alternatives_in_ruleLinkType1825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__NodesAssignment_1_0_in_rule__ProblemDiagram__Alternatives_11860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__LinksAssignment_1_1_in_rule__ProblemDiagram__Alternatives_11878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__SubproblemAssignment_3_1_0_in_rule__Node__Alternatives_3_11911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__IstarAssignment_3_1_1_in_rule__Node__Alternatives_3_11929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ContainersAssignment_3_0_in_rule__Model__Alternatives_31962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__IntentionsAssignment_3_1_in_rule__Model__Alternatives_31980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__DecompositionsAssignment_3_2_in_rule__Model__Alternatives_31998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__DependenciesAssignment_3_3_in_rule__Model__Alternatives_32016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ContributionsAssignment_3_4_in_rule__Model__Alternatives_32034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__AssociationsAssignment_3_5_in_rule__Model__Alternatives_32052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActor_in_rule__Container__Alternatives2085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAgent_in_rule__Container__Alternatives2102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRole_in_rule__Container__Alternatives2119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePosition_in_rule__Container__Alternatives2136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actor__Is_aAssignment_2_0_in_rule__Actor__Alternatives_22168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actor__Is_part_ofAssignment_2_1_in_rule__Actor__Alternatives_22186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoal_in_rule__Intention__Alternatives2219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSoftgoal_in_rule__Intention__Alternatives2236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTask_in_rule__Intention__Alternatives2253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResource_in_rule__Intention__Alternatives2270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBelief_in_rule__Intention__Alternatives2287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndDecomposition_in_rule__Decomposition__Alternatives2320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrDecomposition_in_rule__Decomposition__Alternatives2337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndContribution_in_rule__Contribution__Alternatives2369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrContribution_in_rule__Contribution__Alternatives2386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHelpContribution_in_rule__Contribution__Alternatives2403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHurtContribution_in_rule__Contribution__Alternatives2420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMakeContribution_in_rule__Contribution__Alternatives2437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBreakContribution_in_rule__Contribution__Alternatives2454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__NodeType__Alternatives2487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__NodeType__Alternatives2508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__NodeType__Alternatives2529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__NodeType__Alternatives2550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__NodeType__Alternatives2571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__NodeType__Alternatives2592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__NodeType__Alternatives2613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__PhenomenonType__Alternatives2649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__PhenomenonType__Alternatives2670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__PhenomenonType__Alternatives2691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__LinkType__Alternatives2727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__LinkType__Alternatives2748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__LinkType__Alternatives2769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__Group_0__0_in_rule__ProblemDiagram__Group__02806 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__Group__1_in_rule__ProblemDiagram__Group__02816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__Alternatives_1_in_rule__ProblemDiagram__Group__12844 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_24_in_rule__ProblemDiagram__Group_0__02884 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__Group_0__1_in_rule__ProblemDiagram__Group_0__02894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ProblemDiagram__Group_0__12923 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__Group_0__2_in_rule__ProblemDiagram__Group_0__12933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__DescriptionAssignment_0_2_in_rule__ProblemDiagram__Group_0__22961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__NameAssignment_0_in_rule__Node__Group__03001 = new BitSet(new long[]{0x000000000603F802L});
    public static final BitSet FOLLOW_rule__Node__Group__1_in_rule__Node__Group__03010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__TypeAssignment_1_in_rule__Node__Group__13038 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_rule__Node__Group__2_in_rule__Node__Group__13048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_2__0_in_rule__Node__Group__23076 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Node__Group__3_in_rule__Node__Group__23086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3__0_in_rule__Node__Group__33114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Node__Group_2__03158 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Node__Group_2__1_in_rule__Node__Group_2__03168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__DescriptionAssignment_2_1_in_rule__Node__Group_2__13196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Node__Group_3__03235 = new BitSet(new long[]{0x0000000029000020L});
    public static final BitSet FOLLOW_rule__Node__Group_3__1_in_rule__Node__Group_3__03245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Alternatives_3_1_in_rule__Node__Group_3__13273 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Node__Group_3__2_in_rule__Node__Group_3__13282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Node__Group_3__23311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Phenomenon__TypeAssignment_0_in_rule__Phenomenon__Group__03352 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Phenomenon__Group__1_in_rule__Phenomenon__Group__03362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Phenomenon__NameAssignment_1_in_rule__Phenomenon__Group__13390 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Phenomenon__Group__2_in_rule__Phenomenon__Group__13399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Phenomenon__Group_2__0_in_rule__Phenomenon__Group__23427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Phenomenon__Group_2__03469 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Phenomenon__Group_2__1_in_rule__Phenomenon__Group_2__03479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Phenomenon__DescriptionAssignment_2_1_in_rule__Phenomenon__Group_2__13507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__FromAssignment_0_in_rule__Link__Group__03545 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_rule__Link__Group__1_in_rule__Link__Group__03554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__TypeAssignment_1_in_rule__Link__Group__13582 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Link__Group__2_in_rule__Link__Group__13591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__ToAssignment_2_in_rule__Link__Group__23619 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_rule__Link__Group__3_in_rule__Link__Group__23628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group_3__0_in_rule__Link__Group__33656 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Link__Group__4_in_rule__Link__Group__33666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group_4__0_in_rule__Link__Group__43694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Link__Group_3__03740 = new BitSet(new long[]{0x00000000001C0020L});
    public static final BitSet FOLLOW_rule__Link__Group_3__1_in_rule__Link__Group_3__03750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__PhenomenaAssignment_3_1_in_rule__Link__Group_3__13778 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_rule__Link__Group_3__2_in_rule__Link__Group_3__13787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group_3_2__0_in_rule__Link__Group_3__23815 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_rule__Link__Group_3__3_in_rule__Link__Group_3__23825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Link__Group_3__33854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Link__Group_3_2__03898 = new BitSet(new long[]{0x00000000001C0020L});
    public static final BitSet FOLLOW_rule__Link__Group_3_2__1_in_rule__Link__Group_3_2__03908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__PhenomenaAssignment_3_2_1_in_rule__Link__Group_3_2__13936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Link__Group_4__03975 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Link__Group_4__1_in_rule__Link__Group_4__03985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__DescriptionAssignment_4_1_in_rule__Link__Group_4__14013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Model__Group__04052 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__04062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__NameAssignment_1_in_rule__Model__Group__14090 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__14100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Model__Group__24129 = new BitSet(new long[]{0x0000007FC0000022L});
    public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__24139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Alternatives_3_in_rule__Model__Group__34167 = new BitSet(new long[]{0x0000007FC0000022L});
    public static final BitSet FOLLOW_30_in_rule__Actor__Group__04211 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Actor__Group__1_in_rule__Actor__Group__04221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actor__NameAssignment_1_in_rule__Actor__Group__14249 = new BitSet(new long[]{0x0000000004000022L});
    public static final BitSet FOLLOW_rule__Actor__Group__2_in_rule__Actor__Group__14258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actor__Alternatives_2_in_rule__Actor__Group__24286 = new BitSet(new long[]{0x0000000004000022L});
    public static final BitSet FOLLOW_rule__Actor__Group__3_in_rule__Actor__Group__24296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actor__Group_3__0_in_rule__Actor__Group__34324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Actor__Group_3__04368 = new BitSet(new long[]{0x0000007C08000000L});
    public static final BitSet FOLLOW_rule__Actor__Group_3__1_in_rule__Actor__Group_3__04378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actor__IntentionsAssignment_3_1_in_rule__Actor__Group_3__14406 = new BitSet(new long[]{0x0000007C08000000L});
    public static final BitSet FOLLOW_rule__Actor__Group_3__2_in_rule__Actor__Group_3__14416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Actor__Group_3__24445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Agent__Group__04487 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Agent__Group__1_in_rule__Agent__Group__04497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Agent__NameAssignment_1_in_rule__Agent__Group__14525 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Agent__Group__2_in_rule__Agent__Group__14534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Agent__Group_2__0_in_rule__Agent__Group__24562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Agent__Group_2__04604 = new BitSet(new long[]{0x0000007C08000000L});
    public static final BitSet FOLLOW_rule__Agent__Group_2__1_in_rule__Agent__Group_2__04614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Agent__IntentionsAssignment_2_1_in_rule__Agent__Group_2__14642 = new BitSet(new long[]{0x0000007C08000000L});
    public static final BitSet FOLLOW_rule__Agent__Group_2__2_in_rule__Agent__Group_2__14652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Agent__Group_2__24681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Role__Group__04723 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Role__Group__1_in_rule__Role__Group__04733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__NameAssignment_1_in_rule__Role__Group__14761 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Role__Group__2_in_rule__Role__Group__14770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group_2__0_in_rule__Role__Group__24798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Role__Group_2__04840 = new BitSet(new long[]{0x0000007C08000000L});
    public static final BitSet FOLLOW_rule__Role__Group_2__1_in_rule__Role__Group_2__04850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__IntentionsAssignment_2_1_in_rule__Role__Group_2__14878 = new BitSet(new long[]{0x0000007C08000000L});
    public static final BitSet FOLLOW_rule__Role__Group_2__2_in_rule__Role__Group_2__14888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Role__Group_2__24917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Position__Group__04959 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Position__Group__1_in_rule__Position__Group__04969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Position__NameAssignment_1_in_rule__Position__Group__14997 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Position__Group__2_in_rule__Position__Group__15006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Position__Group_2__0_in_rule__Position__Group__25034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Position__Group_2__05076 = new BitSet(new long[]{0x0000007C08000000L});
    public static final BitSet FOLLOW_rule__Position__Group_2__1_in_rule__Position__Group_2__05086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Position__IntentionsAssignment_2_1_in_rule__Position__Group_2__15114 = new BitSet(new long[]{0x0000007C08000000L});
    public static final BitSet FOLLOW_rule__Position__Group_2__2_in_rule__Position__Group_2__15124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Position__Group_2__25153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Goal__Group__05195 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Goal__Group__1_in_rule__Goal__Group__05205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goal__NameAssignment_1_in_rule__Goal__Group__15233 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Goal__Group__2_in_rule__Goal__Group__15242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goal__Group_2__0_in_rule__Goal__Group__25270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Goal__Group_2__05312 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_rule__Goal__Group_2__1_in_rule__Goal__Group_2__05322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goal__DecompositionsAssignment_2_1_in_rule__Goal__Group_2__15350 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_rule__Goal__Group_2__2_in_rule__Goal__Group_2__15360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Goal__Group_2__25389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Softgoal__Group__05431 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Softgoal__Group__1_in_rule__Softgoal__Group__05441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Softgoal__NameAssignment_1_in_rule__Softgoal__Group__15469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Task__Group__05508 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Task__Group__1_in_rule__Task__Group__05518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__NameAssignment_1_in_rule__Task__Group__15546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Resource__Group__05585 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Resource__Group__1_in_rule__Resource__Group__05595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__NameAssignment_1_in_rule__Resource__Group__15623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Belief__Group__05662 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Belief__Group__1_in_rule__Belief__Group__05672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Belief__NameAssignment_1_in_rule__Belief__Group__15700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__SourceAssignment_0_in_rule__Association__Group__05738 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__Association__Group__1_in_rule__Association__Group__05747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Association__Group__15776 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Association__Group__2_in_rule__Association__Group__15786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__TargetAssignment_2_in_rule__Association__Group__25814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dependency__DependencyFromAssignment_0_in_rule__Dependency__Group__05854 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Dependency__Group__1_in_rule__Dependency__Group__05863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Dependency__Group__15892 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Dependency__Group__2_in_rule__Dependency__Group__15902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dependency__DependencyToAssignment_2_in_rule__Dependency__Group__25930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndDecomposition__TargetAssignment_0_in_rule__AndDecomposition__Group__05970 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__AndDecomposition__Group__1_in_rule__AndDecomposition__Group__05979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__AndDecomposition__Group__16008 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AndDecomposition__Group__2_in_rule__AndDecomposition__Group__16018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndDecomposition__SourceAssignment_2_in_rule__AndDecomposition__Group__26046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrDecomposition__TargetAssignment_0_in_rule__OrDecomposition__Group__06086 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__OrDecomposition__Group__1_in_rule__OrDecomposition__Group__06095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__OrDecomposition__Group__16124 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__OrDecomposition__Group__2_in_rule__OrDecomposition__Group__16134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrDecomposition__SourceAssignment_2_in_rule__OrDecomposition__Group__26162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndContribution__SourceAssignment_0_in_rule__AndContribution__Group__06202 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__AndContribution__Group__1_in_rule__AndContribution__Group__06211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__AndContribution__Group__16240 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AndContribution__Group__2_in_rule__AndContribution__Group__16250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndContribution__TargetAssignment_2_in_rule__AndContribution__Group__26278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrContribution__SourceAssignment_0_in_rule__OrContribution__Group__06318 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__OrContribution__Group__1_in_rule__OrContribution__Group__06327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__OrContribution__Group__16356 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__OrContribution__Group__2_in_rule__OrContribution__Group__16366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrContribution__TargetAssignment_2_in_rule__OrContribution__Group__26394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HelpContribution__SourceAssignment_0_in_rule__HelpContribution__Group__06434 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__HelpContribution__Group__1_in_rule__HelpContribution__Group__06443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__HelpContribution__Group__16472 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__HelpContribution__Group__2_in_rule__HelpContribution__Group__16482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HelpContribution__TargetAssignment_2_in_rule__HelpContribution__Group__26510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MakeContribution__SourceAssignment_0_in_rule__MakeContribution__Group__06550 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__MakeContribution__Group__1_in_rule__MakeContribution__Group__06559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__MakeContribution__Group__16588 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MakeContribution__Group__2_in_rule__MakeContribution__Group__16598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MakeContribution__TargetAssignment_2_in_rule__MakeContribution__Group__26626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HurtContribution__SourceAssignment_0_in_rule__HurtContribution__Group__06666 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__HurtContribution__Group__1_in_rule__HurtContribution__Group__06675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__HurtContribution__Group__16704 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__HurtContribution__Group__2_in_rule__HurtContribution__Group__16714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HurtContribution__TargetAssignment_2_in_rule__HurtContribution__Group__26742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BreakContribution__SourceAssignment_0_in_rule__BreakContribution__Group__06782 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__BreakContribution__Group__1_in_rule__BreakContribution__Group__06791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__BreakContribution__Group__16820 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__BreakContribution__Group__2_in_rule__BreakContribution__Group__16830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BreakContribution__TargetAssignment_2_in_rule__BreakContribution__Group__26858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ProblemDiagram__DescriptionAssignment_0_26898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_rule__ProblemDiagram__NodesAssignment_1_06929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_rule__ProblemDiagram__LinksAssignment_1_16960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Node__NameAssignment_06991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeType_in_rule__Node__TypeAssignment_17022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Node__DescriptionAssignment_2_17053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProblemDiagram_in_rule__Node__SubproblemAssignment_3_1_07084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModel_in_rule__Node__IstarAssignment_3_1_17115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhenomenonType_in_rule__Phenomenon__TypeAssignment_07146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Phenomenon__NameAssignment_17177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Phenomenon__DescriptionAssignment_2_17208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Link__FromAssignment_07243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkType_in_rule__Link__TypeAssignment_17278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Link__ToAssignment_27313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhenomenon_in_rule__Link__PhenomenaAssignment_3_17348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhenomenon_in_rule__Link__PhenomenaAssignment_3_2_17379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Link__DescriptionAssignment_4_17410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Model__NameAssignment_17441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainer_in_rule__Model__ContainersAssignment_3_07472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntention_in_rule__Model__IntentionsAssignment_3_17503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecomposition_in_rule__Model__DecompositionsAssignment_3_27534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependency_in_rule__Model__DependenciesAssignment_3_37565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContribution_in_rule__Model__ContributionsAssignment_3_47596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociation_in_rule__Model__AssociationsAssignment_3_57627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Actor__NameAssignment_17658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Actor__Is_aAssignment_2_07693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Actor__Is_part_ofAssignment_2_17732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntention_in_rule__Actor__IntentionsAssignment_3_17767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Agent__NameAssignment_17798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntention_in_rule__Agent__IntentionsAssignment_2_17829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Role__NameAssignment_17860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntention_in_rule__Role__IntentionsAssignment_2_17891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Position__NameAssignment_17922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntention_in_rule__Position__IntentionsAssignment_2_17953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Goal__NameAssignment_17984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Goal__DecompositionsAssignment_2_18019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Softgoal__NameAssignment_18054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Task__NameAssignment_18085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Resource__NameAssignment_18116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Belief__NameAssignment_18147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Association__SourceAssignment_08182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Association__TargetAssignment_28221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Dependency__DependencyFromAssignment_08260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Dependency__DependencyToAssignment_28299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AndDecomposition__TargetAssignment_08338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AndDecomposition__SourceAssignment_28377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__OrDecomposition__TargetAssignment_08416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__OrDecomposition__SourceAssignment_28455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AndContribution__SourceAssignment_08494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AndContribution__TargetAssignment_28533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__OrContribution__SourceAssignment_08572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__OrContribution__TargetAssignment_28611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__HelpContribution__SourceAssignment_08650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__HelpContribution__TargetAssignment_28689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MakeContribution__SourceAssignment_08728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MakeContribution__TargetAssignment_28767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__HurtContribution__SourceAssignment_08806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__HurtContribution__TargetAssignment_28845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BreakContribution__SourceAssignment_08884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BreakContribution__TargetAssignment_28923 = new BitSet(new long[]{0x0000000000000002L});

}