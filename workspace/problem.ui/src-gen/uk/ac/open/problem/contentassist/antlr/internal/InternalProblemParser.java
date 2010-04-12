package uk.ac.open.problem.contentassist.antlr.internal; 

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
import uk.ac.open.problem.services.ProblemGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalProblemParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'R'", "'M'", "'B'", "'X'", "'C'", "'D'", "'P'", "'phenomenon'", "'event'", "'state'", "'->'", "'~~'", "'~>'", "'problem'", "':'", "'{'", "'}'", "'see'", "'domain'", "'intention'", "','", "'istar'", "'actor'", "'agent'", "'role'", "'position'", "'goal'", "'soft'", "'task'", "'resource'", "'belief'", "'~~>'", "'<-(and)-'", "'<-(or)-'", "'-(and)->'", "'-(or)->'", "'-(+)->'", "'-(++)->'", "'-(-)->'", "'-(--)->'"
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

                if ( ((LA1_1>=21 && LA1_1<=23)) ) {
                    alt1=2;
                }
                else if ( (LA1_1==EOF||LA1_1==RULE_ID||(LA1_1>=11 && LA1_1<=17)||(LA1_1>=25 && LA1_1<=27)) ) {
                    alt1=1;
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:897:1: rule__Node__Alternatives_3_1 : ( ( ( rule__Node__SubproblemAssignment_3_1_0 ) ) | ( ( rule__Node__Group_3_1_1__0 ) ) | ( ( rule__Node__IstarAssignment_3_1_2 ) ) | ( ( rule__Node__Group_3_1_3__0 ) ) );
    public final void rule__Node__Alternatives_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:901:1: ( ( ( rule__Node__SubproblemAssignment_3_1_0 ) ) | ( ( rule__Node__Group_3_1_1__0 ) ) | ( ( rule__Node__IstarAssignment_3_1_2 ) ) | ( ( rule__Node__Group_3_1_3__0 ) ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 24:
            case 27:
                {
                alt2=1;
                }
                break;
            case 28:
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==30) ) {
                    alt2=4;
                }
                else if ( (LA2_2==29) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("897:1: rule__Node__Alternatives_3_1 : ( ( ( rule__Node__SubproblemAssignment_3_1_0 ) ) | ( ( rule__Node__Group_3_1_1__0 ) ) | ( ( rule__Node__IstarAssignment_3_1_2 ) ) | ( ( rule__Node__Group_3_1_3__0 ) ) );", 2, 2, input);

                    throw nvae;
                }
                }
                break;
            case 32:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("897:1: rule__Node__Alternatives_3_1 : ( ( ( rule__Node__SubproblemAssignment_3_1_0 ) ) | ( ( rule__Node__Group_3_1_1__0 ) ) | ( ( rule__Node__IstarAssignment_3_1_2 ) ) | ( ( rule__Node__Group_3_1_3__0 ) ) );", 2, 0, input);

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
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:908:6: ( ( rule__Node__Group_3_1_1__0 ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:908:6: ( ( rule__Node__Group_3_1_1__0 ) )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:909:1: ( rule__Node__Group_3_1_1__0 )
                    {
                     before(grammarAccess.getNodeAccess().getGroup_3_1_1()); 
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:910:1: ( rule__Node__Group_3_1_1__0 )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:910:2: rule__Node__Group_3_1_1__0
                    {
                    pushFollow(FOLLOW_rule__Node__Group_3_1_1__0_in_rule__Node__Alternatives_3_11929);
                    rule__Node__Group_3_1_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getNodeAccess().getGroup_3_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:914:6: ( ( rule__Node__IstarAssignment_3_1_2 ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:914:6: ( ( rule__Node__IstarAssignment_3_1_2 ) )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:915:1: ( rule__Node__IstarAssignment_3_1_2 )
                    {
                     before(grammarAccess.getNodeAccess().getIstarAssignment_3_1_2()); 
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:916:1: ( rule__Node__IstarAssignment_3_1_2 )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:916:2: rule__Node__IstarAssignment_3_1_2
                    {
                    pushFollow(FOLLOW_rule__Node__IstarAssignment_3_1_2_in_rule__Node__Alternatives_3_11947);
                    rule__Node__IstarAssignment_3_1_2();
                    _fsp--;


                    }

                     after(grammarAccess.getNodeAccess().getIstarAssignment_3_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:920:6: ( ( rule__Node__Group_3_1_3__0 ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:920:6: ( ( rule__Node__Group_3_1_3__0 ) )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:921:1: ( rule__Node__Group_3_1_3__0 )
                    {
                     before(grammarAccess.getNodeAccess().getGroup_3_1_3()); 
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:922:1: ( rule__Node__Group_3_1_3__0 )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:922:2: rule__Node__Group_3_1_3__0
                    {
                    pushFollow(FOLLOW_rule__Node__Group_3_1_3__0_in_rule__Node__Alternatives_3_11965);
                    rule__Node__Group_3_1_3__0();
                    _fsp--;


                    }

                     after(grammarAccess.getNodeAccess().getGroup_3_1_3()); 

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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:931:1: rule__Model__Alternatives_3 : ( ( ( rule__Model__ContainersAssignment_3_0 ) ) | ( ( rule__Model__IntentionsAssignment_3_1 ) ) | ( ( rule__Model__DecompositionsAssignment_3_2 ) ) | ( ( rule__Model__DependenciesAssignment_3_3 ) ) | ( ( rule__Model__ContributionsAssignment_3_4 ) ) | ( ( rule__Model__AssociationsAssignment_3_5 ) ) );
    public final void rule__Model__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:935:1: ( ( ( rule__Model__ContainersAssignment_3_0 ) ) | ( ( rule__Model__IntentionsAssignment_3_1 ) ) | ( ( rule__Model__DecompositionsAssignment_3_2 ) ) | ( ( rule__Model__DependenciesAssignment_3_3 ) ) | ( ( rule__Model__ContributionsAssignment_3_4 ) ) | ( ( rule__Model__AssociationsAssignment_3_5 ) ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 33:
            case 34:
            case 35:
            case 36:
                {
                alt3=1;
                }
                break;
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
                {
                alt3=2;
                }
                break;
            case RULE_ID:
                {
                switch ( input.LA(2) ) {
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                    {
                    alt3=5;
                    }
                    break;
                case 42:
                    {
                    alt3=6;
                    }
                    break;
                case 43:
                case 44:
                    {
                    alt3=3;
                    }
                    break;
                case 23:
                    {
                    alt3=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("931:1: rule__Model__Alternatives_3 : ( ( ( rule__Model__ContainersAssignment_3_0 ) ) | ( ( rule__Model__IntentionsAssignment_3_1 ) ) | ( ( rule__Model__DecompositionsAssignment_3_2 ) ) | ( ( rule__Model__DependenciesAssignment_3_3 ) ) | ( ( rule__Model__ContributionsAssignment_3_4 ) ) | ( ( rule__Model__AssociationsAssignment_3_5 ) ) );", 3, 3, input);

                    throw nvae;
                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("931:1: rule__Model__Alternatives_3 : ( ( ( rule__Model__ContainersAssignment_3_0 ) ) | ( ( rule__Model__IntentionsAssignment_3_1 ) ) | ( ( rule__Model__DecompositionsAssignment_3_2 ) ) | ( ( rule__Model__DependenciesAssignment_3_3 ) ) | ( ( rule__Model__ContributionsAssignment_3_4 ) ) | ( ( rule__Model__AssociationsAssignment_3_5 ) ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:936:1: ( ( rule__Model__ContainersAssignment_3_0 ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:936:1: ( ( rule__Model__ContainersAssignment_3_0 ) )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:937:1: ( rule__Model__ContainersAssignment_3_0 )
                    {
                     before(grammarAccess.getModelAccess().getContainersAssignment_3_0()); 
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:938:1: ( rule__Model__ContainersAssignment_3_0 )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:938:2: rule__Model__ContainersAssignment_3_0
                    {
                    pushFollow(FOLLOW_rule__Model__ContainersAssignment_3_0_in_rule__Model__Alternatives_31998);
                    rule__Model__ContainersAssignment_3_0();
                    _fsp--;


                    }

                     after(grammarAccess.getModelAccess().getContainersAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:942:6: ( ( rule__Model__IntentionsAssignment_3_1 ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:942:6: ( ( rule__Model__IntentionsAssignment_3_1 ) )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:943:1: ( rule__Model__IntentionsAssignment_3_1 )
                    {
                     before(grammarAccess.getModelAccess().getIntentionsAssignment_3_1()); 
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:944:1: ( rule__Model__IntentionsAssignment_3_1 )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:944:2: rule__Model__IntentionsAssignment_3_1
                    {
                    pushFollow(FOLLOW_rule__Model__IntentionsAssignment_3_1_in_rule__Model__Alternatives_32016);
                    rule__Model__IntentionsAssignment_3_1();
                    _fsp--;


                    }

                     after(grammarAccess.getModelAccess().getIntentionsAssignment_3_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:948:6: ( ( rule__Model__DecompositionsAssignment_3_2 ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:948:6: ( ( rule__Model__DecompositionsAssignment_3_2 ) )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:949:1: ( rule__Model__DecompositionsAssignment_3_2 )
                    {
                     before(grammarAccess.getModelAccess().getDecompositionsAssignment_3_2()); 
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:950:1: ( rule__Model__DecompositionsAssignment_3_2 )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:950:2: rule__Model__DecompositionsAssignment_3_2
                    {
                    pushFollow(FOLLOW_rule__Model__DecompositionsAssignment_3_2_in_rule__Model__Alternatives_32034);
                    rule__Model__DecompositionsAssignment_3_2();
                    _fsp--;


                    }

                     after(grammarAccess.getModelAccess().getDecompositionsAssignment_3_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:954:6: ( ( rule__Model__DependenciesAssignment_3_3 ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:954:6: ( ( rule__Model__DependenciesAssignment_3_3 ) )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:955:1: ( rule__Model__DependenciesAssignment_3_3 )
                    {
                     before(grammarAccess.getModelAccess().getDependenciesAssignment_3_3()); 
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:956:1: ( rule__Model__DependenciesAssignment_3_3 )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:956:2: rule__Model__DependenciesAssignment_3_3
                    {
                    pushFollow(FOLLOW_rule__Model__DependenciesAssignment_3_3_in_rule__Model__Alternatives_32052);
                    rule__Model__DependenciesAssignment_3_3();
                    _fsp--;


                    }

                     after(grammarAccess.getModelAccess().getDependenciesAssignment_3_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:960:6: ( ( rule__Model__ContributionsAssignment_3_4 ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:960:6: ( ( rule__Model__ContributionsAssignment_3_4 ) )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:961:1: ( rule__Model__ContributionsAssignment_3_4 )
                    {
                     before(grammarAccess.getModelAccess().getContributionsAssignment_3_4()); 
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:962:1: ( rule__Model__ContributionsAssignment_3_4 )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:962:2: rule__Model__ContributionsAssignment_3_4
                    {
                    pushFollow(FOLLOW_rule__Model__ContributionsAssignment_3_4_in_rule__Model__Alternatives_32070);
                    rule__Model__ContributionsAssignment_3_4();
                    _fsp--;


                    }

                     after(grammarAccess.getModelAccess().getContributionsAssignment_3_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:966:6: ( ( rule__Model__AssociationsAssignment_3_5 ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:966:6: ( ( rule__Model__AssociationsAssignment_3_5 ) )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:967:1: ( rule__Model__AssociationsAssignment_3_5 )
                    {
                     before(grammarAccess.getModelAccess().getAssociationsAssignment_3_5()); 
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:968:1: ( rule__Model__AssociationsAssignment_3_5 )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:968:2: rule__Model__AssociationsAssignment_3_5
                    {
                    pushFollow(FOLLOW_rule__Model__AssociationsAssignment_3_5_in_rule__Model__Alternatives_32088);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:977:1: rule__Container__Alternatives : ( ( ruleActor ) | ( ruleAgent ) | ( ruleRole ) | ( rulePosition ) );
    public final void rule__Container__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:981:1: ( ( ruleActor ) | ( ruleAgent ) | ( ruleRole ) | ( rulePosition ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt4=1;
                }
                break;
            case 34:
                {
                alt4=2;
                }
                break;
            case 35:
                {
                alt4=3;
                }
                break;
            case 36:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("977:1: rule__Container__Alternatives : ( ( ruleActor ) | ( ruleAgent ) | ( ruleRole ) | ( rulePosition ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:982:1: ( ruleActor )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:982:1: ( ruleActor )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:983:1: ruleActor
                    {
                     before(grammarAccess.getContainerAccess().getActorParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleActor_in_rule__Container__Alternatives2121);
                    ruleActor();
                    _fsp--;

                     after(grammarAccess.getContainerAccess().getActorParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:988:6: ( ruleAgent )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:988:6: ( ruleAgent )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:989:1: ruleAgent
                    {
                     before(grammarAccess.getContainerAccess().getAgentParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAgent_in_rule__Container__Alternatives2138);
                    ruleAgent();
                    _fsp--;

                     after(grammarAccess.getContainerAccess().getAgentParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:994:6: ( ruleRole )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:994:6: ( ruleRole )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:995:1: ruleRole
                    {
                     before(grammarAccess.getContainerAccess().getRoleParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleRole_in_rule__Container__Alternatives2155);
                    ruleRole();
                    _fsp--;

                     after(grammarAccess.getContainerAccess().getRoleParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1000:6: ( rulePosition )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1000:6: ( rulePosition )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1001:1: rulePosition
                    {
                     before(grammarAccess.getContainerAccess().getPositionParserRuleCall_3()); 
                    pushFollow(FOLLOW_rulePosition_in_rule__Container__Alternatives2172);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1011:1: rule__Actor__Alternatives_2 : ( ( ( rule__Actor__Is_aAssignment_2_0 ) ) | ( ( rule__Actor__Is_part_ofAssignment_2_1 ) ) );
    public final void rule__Actor__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1015:1: ( ( ( rule__Actor__Is_aAssignment_2_0 ) ) | ( ( rule__Actor__Is_part_ofAssignment_2_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1011:1: rule__Actor__Alternatives_2 : ( ( ( rule__Actor__Is_aAssignment_2_0 ) ) | ( ( rule__Actor__Is_part_ofAssignment_2_1 ) ) );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1016:1: ( ( rule__Actor__Is_aAssignment_2_0 ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1016:1: ( ( rule__Actor__Is_aAssignment_2_0 ) )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1017:1: ( rule__Actor__Is_aAssignment_2_0 )
                    {
                     before(grammarAccess.getActorAccess().getIs_aAssignment_2_0()); 
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1018:1: ( rule__Actor__Is_aAssignment_2_0 )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1018:2: rule__Actor__Is_aAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__Actor__Is_aAssignment_2_0_in_rule__Actor__Alternatives_22204);
                    rule__Actor__Is_aAssignment_2_0();
                    _fsp--;


                    }

                     after(grammarAccess.getActorAccess().getIs_aAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1022:6: ( ( rule__Actor__Is_part_ofAssignment_2_1 ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1022:6: ( ( rule__Actor__Is_part_ofAssignment_2_1 ) )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1023:1: ( rule__Actor__Is_part_ofAssignment_2_1 )
                    {
                     before(grammarAccess.getActorAccess().getIs_part_ofAssignment_2_1()); 
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1024:1: ( rule__Actor__Is_part_ofAssignment_2_1 )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1024:2: rule__Actor__Is_part_ofAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__Actor__Is_part_ofAssignment_2_1_in_rule__Actor__Alternatives_22222);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1033:1: rule__Intention__Alternatives : ( ( ruleGoal ) | ( ruleSoftgoal ) | ( ruleTask ) | ( ruleResource ) | ( ruleBelief ) );
    public final void rule__Intention__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1037:1: ( ( ruleGoal ) | ( ruleSoftgoal ) | ( ruleTask ) | ( ruleResource ) | ( ruleBelief ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt6=1;
                }
                break;
            case 38:
                {
                alt6=2;
                }
                break;
            case 39:
                {
                alt6=3;
                }
                break;
            case 40:
                {
                alt6=4;
                }
                break;
            case 41:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1033:1: rule__Intention__Alternatives : ( ( ruleGoal ) | ( ruleSoftgoal ) | ( ruleTask ) | ( ruleResource ) | ( ruleBelief ) );", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1038:1: ( ruleGoal )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1038:1: ( ruleGoal )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1039:1: ruleGoal
                    {
                     before(grammarAccess.getIntentionAccess().getGoalParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleGoal_in_rule__Intention__Alternatives2255);
                    ruleGoal();
                    _fsp--;

                     after(grammarAccess.getIntentionAccess().getGoalParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1044:6: ( ruleSoftgoal )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1044:6: ( ruleSoftgoal )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1045:1: ruleSoftgoal
                    {
                     before(grammarAccess.getIntentionAccess().getSoftgoalParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleSoftgoal_in_rule__Intention__Alternatives2272);
                    ruleSoftgoal();
                    _fsp--;

                     after(grammarAccess.getIntentionAccess().getSoftgoalParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1050:6: ( ruleTask )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1050:6: ( ruleTask )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1051:1: ruleTask
                    {
                     before(grammarAccess.getIntentionAccess().getTaskParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleTask_in_rule__Intention__Alternatives2289);
                    ruleTask();
                    _fsp--;

                     after(grammarAccess.getIntentionAccess().getTaskParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1056:6: ( ruleResource )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1056:6: ( ruleResource )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1057:1: ruleResource
                    {
                     before(grammarAccess.getIntentionAccess().getResourceParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleResource_in_rule__Intention__Alternatives2306);
                    ruleResource();
                    _fsp--;

                     after(grammarAccess.getIntentionAccess().getResourceParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1062:6: ( ruleBelief )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1062:6: ( ruleBelief )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1063:1: ruleBelief
                    {
                     before(grammarAccess.getIntentionAccess().getBeliefParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleBelief_in_rule__Intention__Alternatives2323);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1074:1: rule__Decomposition__Alternatives : ( ( ruleAndDecomposition ) | ( ruleOrDecomposition ) );
    public final void rule__Decomposition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1078:1: ( ( ruleAndDecomposition ) | ( ruleOrDecomposition ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==44) ) {
                    alt7=2;
                }
                else if ( (LA7_1==43) ) {
                    alt7=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1074:1: rule__Decomposition__Alternatives : ( ( ruleAndDecomposition ) | ( ruleOrDecomposition ) );", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1074:1: rule__Decomposition__Alternatives : ( ( ruleAndDecomposition ) | ( ruleOrDecomposition ) );", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1079:1: ( ruleAndDecomposition )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1079:1: ( ruleAndDecomposition )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1080:1: ruleAndDecomposition
                    {
                     before(grammarAccess.getDecompositionAccess().getAndDecompositionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleAndDecomposition_in_rule__Decomposition__Alternatives2356);
                    ruleAndDecomposition();
                    _fsp--;

                     after(grammarAccess.getDecompositionAccess().getAndDecompositionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1085:6: ( ruleOrDecomposition )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1085:6: ( ruleOrDecomposition )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1086:1: ruleOrDecomposition
                    {
                     before(grammarAccess.getDecompositionAccess().getOrDecompositionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleOrDecomposition_in_rule__Decomposition__Alternatives2373);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1096:1: rule__Contribution__Alternatives : ( ( ruleAndContribution ) | ( ruleOrContribution ) | ( ruleHelpContribution ) | ( ruleHurtContribution ) | ( ruleMakeContribution ) | ( ruleBreakContribution ) );
    public final void rule__Contribution__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1100:1: ( ( ruleAndContribution ) | ( ruleOrContribution ) | ( ruleHelpContribution ) | ( ruleHurtContribution ) | ( ruleMakeContribution ) | ( ruleBreakContribution ) )
            int alt8=6;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 46:
                    {
                    alt8=2;
                    }
                    break;
                case 50:
                    {
                    alt8=6;
                    }
                    break;
                case 45:
                    {
                    alt8=1;
                    }
                    break;
                case 47:
                    {
                    alt8=3;
                    }
                    break;
                case 49:
                    {
                    alt8=4;
                    }
                    break;
                case 48:
                    {
                    alt8=5;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("1096:1: rule__Contribution__Alternatives : ( ( ruleAndContribution ) | ( ruleOrContribution ) | ( ruleHelpContribution ) | ( ruleHurtContribution ) | ( ruleMakeContribution ) | ( ruleBreakContribution ) );", 8, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1096:1: rule__Contribution__Alternatives : ( ( ruleAndContribution ) | ( ruleOrContribution ) | ( ruleHelpContribution ) | ( ruleHurtContribution ) | ( ruleMakeContribution ) | ( ruleBreakContribution ) );", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1101:1: ( ruleAndContribution )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1101:1: ( ruleAndContribution )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1102:1: ruleAndContribution
                    {
                     before(grammarAccess.getContributionAccess().getAndContributionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleAndContribution_in_rule__Contribution__Alternatives2405);
                    ruleAndContribution();
                    _fsp--;

                     after(grammarAccess.getContributionAccess().getAndContributionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1107:6: ( ruleOrContribution )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1107:6: ( ruleOrContribution )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1108:1: ruleOrContribution
                    {
                     before(grammarAccess.getContributionAccess().getOrContributionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleOrContribution_in_rule__Contribution__Alternatives2422);
                    ruleOrContribution();
                    _fsp--;

                     after(grammarAccess.getContributionAccess().getOrContributionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1113:6: ( ruleHelpContribution )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1113:6: ( ruleHelpContribution )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1114:1: ruleHelpContribution
                    {
                     before(grammarAccess.getContributionAccess().getHelpContributionParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleHelpContribution_in_rule__Contribution__Alternatives2439);
                    ruleHelpContribution();
                    _fsp--;

                     after(grammarAccess.getContributionAccess().getHelpContributionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1119:6: ( ruleHurtContribution )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1119:6: ( ruleHurtContribution )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1120:1: ruleHurtContribution
                    {
                     before(grammarAccess.getContributionAccess().getHurtContributionParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleHurtContribution_in_rule__Contribution__Alternatives2456);
                    ruleHurtContribution();
                    _fsp--;

                     after(grammarAccess.getContributionAccess().getHurtContributionParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1125:6: ( ruleMakeContribution )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1125:6: ( ruleMakeContribution )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1126:1: ruleMakeContribution
                    {
                     before(grammarAccess.getContributionAccess().getMakeContributionParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleMakeContribution_in_rule__Contribution__Alternatives2473);
                    ruleMakeContribution();
                    _fsp--;

                     after(grammarAccess.getContributionAccess().getMakeContributionParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1131:6: ( ruleBreakContribution )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1131:6: ( ruleBreakContribution )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1132:1: ruleBreakContribution
                    {
                     before(grammarAccess.getContributionAccess().getBreakContributionParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleBreakContribution_in_rule__Contribution__Alternatives2490);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1142:1: rule__NodeType__Alternatives : ( ( ( 'R' ) ) | ( ( 'M' ) ) | ( ( 'B' ) ) | ( ( 'X' ) ) | ( ( 'C' ) ) | ( ( 'D' ) ) | ( ( 'P' ) ) );
    public final void rule__NodeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1146:1: ( ( ( 'R' ) ) | ( ( 'M' ) ) | ( ( 'B' ) ) | ( ( 'X' ) ) | ( ( 'C' ) ) | ( ( 'D' ) ) | ( ( 'P' ) ) )
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
                    new NoViableAltException("1142:1: rule__NodeType__Alternatives : ( ( ( 'R' ) ) | ( ( 'M' ) ) | ( ( 'B' ) ) | ( ( 'X' ) ) | ( ( 'C' ) ) | ( ( 'D' ) ) | ( ( 'P' ) ) );", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1147:1: ( ( 'R' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1147:1: ( ( 'R' ) )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1148:1: ( 'R' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getREQUIREMENTEnumLiteralDeclaration_0()); 
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1149:1: ( 'R' )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1149:3: 'R'
                    {
                    match(input,11,FOLLOW_11_in_rule__NodeType__Alternatives2523); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getREQUIREMENTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1154:6: ( ( 'M' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1154:6: ( ( 'M' ) )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1155:1: ( 'M' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getMACHINEEnumLiteralDeclaration_1()); 
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1156:1: ( 'M' )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1156:3: 'M'
                    {
                    match(input,12,FOLLOW_12_in_rule__NodeType__Alternatives2544); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getMACHINEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1161:6: ( ( 'B' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1161:6: ( ( 'B' ) )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1162:1: ( 'B' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getBIDDABLEEnumLiteralDeclaration_2()); 
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1163:1: ( 'B' )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1163:3: 'B'
                    {
                    match(input,13,FOLLOW_13_in_rule__NodeType__Alternatives2565); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getBIDDABLEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1168:6: ( ( 'X' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1168:6: ( ( 'X' ) )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1169:1: ( 'X' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getLEXICALEnumLiteralDeclaration_3()); 
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1170:1: ( 'X' )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1170:3: 'X'
                    {
                    match(input,14,FOLLOW_14_in_rule__NodeType__Alternatives2586); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getLEXICALEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1175:6: ( ( 'C' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1175:6: ( ( 'C' ) )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1176:1: ( 'C' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getCAUSALEnumLiteralDeclaration_4()); 
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1177:1: ( 'C' )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1177:3: 'C'
                    {
                    match(input,15,FOLLOW_15_in_rule__NodeType__Alternatives2607); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getCAUSALEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1182:6: ( ( 'D' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1182:6: ( ( 'D' ) )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1183:1: ( 'D' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getDESIGNEDEnumLiteralDeclaration_5()); 
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1184:1: ( 'D' )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1184:3: 'D'
                    {
                    match(input,16,FOLLOW_16_in_rule__NodeType__Alternatives2628); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getDESIGNEDEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1189:6: ( ( 'P' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1189:6: ( ( 'P' ) )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1190:1: ( 'P' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getPHYSICALEnumLiteralDeclaration_6()); 
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1191:1: ( 'P' )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1191:3: 'P'
                    {
                    match(input,17,FOLLOW_17_in_rule__NodeType__Alternatives2649); 

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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1201:1: rule__PhenomenonType__Alternatives : ( ( ( 'phenomenon' ) ) | ( ( 'event' ) ) | ( ( 'state' ) ) );
    public final void rule__PhenomenonType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1205:1: ( ( ( 'phenomenon' ) ) | ( ( 'event' ) ) | ( ( 'state' ) ) )
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
                    new NoViableAltException("1201:1: rule__PhenomenonType__Alternatives : ( ( ( 'phenomenon' ) ) | ( ( 'event' ) ) | ( ( 'state' ) ) );", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1206:1: ( ( 'phenomenon' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1206:1: ( ( 'phenomenon' ) )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1207:1: ( 'phenomenon' )
                    {
                     before(grammarAccess.getPhenomenonTypeAccess().getUNSPECIFIEDEnumLiteralDeclaration_0()); 
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1208:1: ( 'phenomenon' )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1208:3: 'phenomenon'
                    {
                    match(input,18,FOLLOW_18_in_rule__PhenomenonType__Alternatives2685); 

                    }

                     after(grammarAccess.getPhenomenonTypeAccess().getUNSPECIFIEDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1213:6: ( ( 'event' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1213:6: ( ( 'event' ) )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1214:1: ( 'event' )
                    {
                     before(grammarAccess.getPhenomenonTypeAccess().getEVENTEnumLiteralDeclaration_1()); 
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1215:1: ( 'event' )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1215:3: 'event'
                    {
                    match(input,19,FOLLOW_19_in_rule__PhenomenonType__Alternatives2706); 

                    }

                     after(grammarAccess.getPhenomenonTypeAccess().getEVENTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1220:6: ( ( 'state' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1220:6: ( ( 'state' ) )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1221:1: ( 'state' )
                    {
                     before(grammarAccess.getPhenomenonTypeAccess().getSTATEEnumLiteralDeclaration_2()); 
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1222:1: ( 'state' )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1222:3: 'state'
                    {
                    match(input,20,FOLLOW_20_in_rule__PhenomenonType__Alternatives2727); 

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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1232:1: rule__LinkType__Alternatives : ( ( ( '->' ) ) | ( ( '~~' ) ) | ( ( '~>' ) ) );
    public final void rule__LinkType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1236:1: ( ( ( '->' ) ) | ( ( '~~' ) ) | ( ( '~>' ) ) )
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
                    new NoViableAltException("1232:1: rule__LinkType__Alternatives : ( ( ( '->' ) ) | ( ( '~~' ) ) | ( ( '~>' ) ) );", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1237:1: ( ( '->' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1237:1: ( ( '->' ) )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1238:1: ( '->' )
                    {
                     before(grammarAccess.getLinkTypeAccess().getINTERFACEEnumLiteralDeclaration_0()); 
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1239:1: ( '->' )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1239:3: '->'
                    {
                    match(input,21,FOLLOW_21_in_rule__LinkType__Alternatives2763); 

                    }

                     after(grammarAccess.getLinkTypeAccess().getINTERFACEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1244:6: ( ( '~~' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1244:6: ( ( '~~' ) )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1245:1: ( '~~' )
                    {
                     before(grammarAccess.getLinkTypeAccess().getREFERENCEEnumLiteralDeclaration_1()); 
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1246:1: ( '~~' )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1246:3: '~~'
                    {
                    match(input,22,FOLLOW_22_in_rule__LinkType__Alternatives2784); 

                    }

                     after(grammarAccess.getLinkTypeAccess().getREFERENCEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1251:6: ( ( '~>' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1251:6: ( ( '~>' ) )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1252:1: ( '~>' )
                    {
                     before(grammarAccess.getLinkTypeAccess().getCONSTRAINTEnumLiteralDeclaration_2()); 
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1253:1: ( '~>' )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1253:3: '~>'
                    {
                    match(input,23,FOLLOW_23_in_rule__LinkType__Alternatives2805); 

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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1265:1: rule__ProblemDiagram__Group__0 : ( ( rule__ProblemDiagram__Group_0__0 )? ) rule__ProblemDiagram__Group__1 ;
    public final void rule__ProblemDiagram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1269:1: ( ( ( rule__ProblemDiagram__Group_0__0 )? ) rule__ProblemDiagram__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1270:1: ( ( rule__ProblemDiagram__Group_0__0 )? ) rule__ProblemDiagram__Group__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1270:1: ( ( rule__ProblemDiagram__Group_0__0 )? )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1271:1: ( rule__ProblemDiagram__Group_0__0 )?
            {
             before(grammarAccess.getProblemDiagramAccess().getGroup_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1272:1: ( rule__ProblemDiagram__Group_0__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1272:2: rule__ProblemDiagram__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__ProblemDiagram__Group_0__0_in_rule__ProblemDiagram__Group__02842);
                    rule__ProblemDiagram__Group_0__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProblemDiagramAccess().getGroup_0()); 

            }

            pushFollow(FOLLOW_rule__ProblemDiagram__Group__1_in_rule__ProblemDiagram__Group__02852);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1283:1: rule__ProblemDiagram__Group__1 : ( ( rule__ProblemDiagram__Alternatives_1 )* ) ;
    public final void rule__ProblemDiagram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1287:1: ( ( ( rule__ProblemDiagram__Alternatives_1 )* ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1288:1: ( ( rule__ProblemDiagram__Alternatives_1 )* )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1288:1: ( ( rule__ProblemDiagram__Alternatives_1 )* )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1289:1: ( rule__ProblemDiagram__Alternatives_1 )*
            {
             before(grammarAccess.getProblemDiagramAccess().getAlternatives_1()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1290:1: ( rule__ProblemDiagram__Alternatives_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1290:2: rule__ProblemDiagram__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_rule__ProblemDiagram__Alternatives_1_in_rule__ProblemDiagram__Group__12880);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1304:1: rule__ProblemDiagram__Group_0__0 : ( 'problem' ) rule__ProblemDiagram__Group_0__1 ;
    public final void rule__ProblemDiagram__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1308:1: ( ( 'problem' ) rule__ProblemDiagram__Group_0__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1309:1: ( 'problem' ) rule__ProblemDiagram__Group_0__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1309:1: ( 'problem' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1310:1: 'problem'
            {
             before(grammarAccess.getProblemDiagramAccess().getProblemKeyword_0_0()); 
            match(input,24,FOLLOW_24_in_rule__ProblemDiagram__Group_0__02920); 
             after(grammarAccess.getProblemDiagramAccess().getProblemKeyword_0_0()); 

            }

            pushFollow(FOLLOW_rule__ProblemDiagram__Group_0__1_in_rule__ProblemDiagram__Group_0__02930);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1324:1: rule__ProblemDiagram__Group_0__1 : ( ':' ) rule__ProblemDiagram__Group_0__2 ;
    public final void rule__ProblemDiagram__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1328:1: ( ( ':' ) rule__ProblemDiagram__Group_0__2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1329:1: ( ':' ) rule__ProblemDiagram__Group_0__2
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1329:1: ( ':' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1330:1: ':'
            {
             before(grammarAccess.getProblemDiagramAccess().getColonKeyword_0_1()); 
            match(input,25,FOLLOW_25_in_rule__ProblemDiagram__Group_0__12959); 
             after(grammarAccess.getProblemDiagramAccess().getColonKeyword_0_1()); 

            }

            pushFollow(FOLLOW_rule__ProblemDiagram__Group_0__2_in_rule__ProblemDiagram__Group_0__12969);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1344:1: rule__ProblemDiagram__Group_0__2 : ( ( rule__ProblemDiagram__DescriptionAssignment_0_2 ) ) ;
    public final void rule__ProblemDiagram__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1348:1: ( ( ( rule__ProblemDiagram__DescriptionAssignment_0_2 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1349:1: ( ( rule__ProblemDiagram__DescriptionAssignment_0_2 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1349:1: ( ( rule__ProblemDiagram__DescriptionAssignment_0_2 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1350:1: ( rule__ProblemDiagram__DescriptionAssignment_0_2 )
            {
             before(grammarAccess.getProblemDiagramAccess().getDescriptionAssignment_0_2()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1351:1: ( rule__ProblemDiagram__DescriptionAssignment_0_2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1351:2: rule__ProblemDiagram__DescriptionAssignment_0_2
            {
            pushFollow(FOLLOW_rule__ProblemDiagram__DescriptionAssignment_0_2_in_rule__ProblemDiagram__Group_0__22997);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1367:1: rule__Node__Group__0 : ( ( rule__Node__NameAssignment_0 ) ) rule__Node__Group__1 ;
    public final void rule__Node__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1371:1: ( ( ( rule__Node__NameAssignment_0 ) ) rule__Node__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1372:1: ( ( rule__Node__NameAssignment_0 ) ) rule__Node__Group__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1372:1: ( ( rule__Node__NameAssignment_0 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1373:1: ( rule__Node__NameAssignment_0 )
            {
             before(grammarAccess.getNodeAccess().getNameAssignment_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1374:1: ( rule__Node__NameAssignment_0 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1374:2: rule__Node__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Node__NameAssignment_0_in_rule__Node__Group__03037);
            rule__Node__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getNodeAccess().getNameAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Node__Group__1_in_rule__Node__Group__03046);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1385:1: rule__Node__Group__1 : ( ( rule__Node__TypeAssignment_1 )? ) rule__Node__Group__2 ;
    public final void rule__Node__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1389:1: ( ( ( rule__Node__TypeAssignment_1 )? ) rule__Node__Group__2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1390:1: ( ( rule__Node__TypeAssignment_1 )? ) rule__Node__Group__2
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1390:1: ( ( rule__Node__TypeAssignment_1 )? )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1391:1: ( rule__Node__TypeAssignment_1 )?
            {
             before(grammarAccess.getNodeAccess().getTypeAssignment_1()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1392:1: ( rule__Node__TypeAssignment_1 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=11 && LA14_0<=17)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1392:2: rule__Node__TypeAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Node__TypeAssignment_1_in_rule__Node__Group__13074);
                    rule__Node__TypeAssignment_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNodeAccess().getTypeAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Node__Group__2_in_rule__Node__Group__13084);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1403:1: rule__Node__Group__2 : ( ( rule__Node__Group_2__0 )? ) rule__Node__Group__3 ;
    public final void rule__Node__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1407:1: ( ( ( rule__Node__Group_2__0 )? ) rule__Node__Group__3 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1408:1: ( ( rule__Node__Group_2__0 )? ) rule__Node__Group__3
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1408:1: ( ( rule__Node__Group_2__0 )? )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1409:1: ( rule__Node__Group_2__0 )?
            {
             before(grammarAccess.getNodeAccess().getGroup_2()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1410:1: ( rule__Node__Group_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1410:2: rule__Node__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Node__Group_2__0_in_rule__Node__Group__23112);
                    rule__Node__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNodeAccess().getGroup_2()); 

            }

            pushFollow(FOLLOW_rule__Node__Group__3_in_rule__Node__Group__23122);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1421:1: rule__Node__Group__3 : ( ( rule__Node__Group_3__0 )? ) ;
    public final void rule__Node__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1425:1: ( ( ( rule__Node__Group_3__0 )? ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1426:1: ( ( rule__Node__Group_3__0 )? )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1426:1: ( ( rule__Node__Group_3__0 )? )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1427:1: ( rule__Node__Group_3__0 )?
            {
             before(grammarAccess.getNodeAccess().getGroup_3()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1428:1: ( rule__Node__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1428:2: rule__Node__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Node__Group_3__0_in_rule__Node__Group__33150);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1446:1: rule__Node__Group_2__0 : ( ':' ) rule__Node__Group_2__1 ;
    public final void rule__Node__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1450:1: ( ( ':' ) rule__Node__Group_2__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1451:1: ( ':' ) rule__Node__Group_2__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1451:1: ( ':' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1452:1: ':'
            {
             before(grammarAccess.getNodeAccess().getColonKeyword_2_0()); 
            match(input,25,FOLLOW_25_in_rule__Node__Group_2__03194); 
             after(grammarAccess.getNodeAccess().getColonKeyword_2_0()); 

            }

            pushFollow(FOLLOW_rule__Node__Group_2__1_in_rule__Node__Group_2__03204);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1466:1: rule__Node__Group_2__1 : ( ( rule__Node__DescriptionAssignment_2_1 ) ) ;
    public final void rule__Node__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1470:1: ( ( ( rule__Node__DescriptionAssignment_2_1 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1471:1: ( ( rule__Node__DescriptionAssignment_2_1 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1471:1: ( ( rule__Node__DescriptionAssignment_2_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1472:1: ( rule__Node__DescriptionAssignment_2_1 )
            {
             before(grammarAccess.getNodeAccess().getDescriptionAssignment_2_1()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1473:1: ( rule__Node__DescriptionAssignment_2_1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1473:2: rule__Node__DescriptionAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Node__DescriptionAssignment_2_1_in_rule__Node__Group_2__13232);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1487:1: rule__Node__Group_3__0 : ( '{' ) rule__Node__Group_3__1 ;
    public final void rule__Node__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1491:1: ( ( '{' ) rule__Node__Group_3__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1492:1: ( '{' ) rule__Node__Group_3__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1492:1: ( '{' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1493:1: '{'
            {
             before(grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,26,FOLLOW_26_in_rule__Node__Group_3__03271); 
             after(grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_3_0()); 

            }

            pushFollow(FOLLOW_rule__Node__Group_3__1_in_rule__Node__Group_3__03281);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1507:1: rule__Node__Group_3__1 : ( ( rule__Node__Alternatives_3_1 ) ) rule__Node__Group_3__2 ;
    public final void rule__Node__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1511:1: ( ( ( rule__Node__Alternatives_3_1 ) ) rule__Node__Group_3__2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1512:1: ( ( rule__Node__Alternatives_3_1 ) ) rule__Node__Group_3__2
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1512:1: ( ( rule__Node__Alternatives_3_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1513:1: ( rule__Node__Alternatives_3_1 )
            {
             before(grammarAccess.getNodeAccess().getAlternatives_3_1()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1514:1: ( rule__Node__Alternatives_3_1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1514:2: rule__Node__Alternatives_3_1
            {
            pushFollow(FOLLOW_rule__Node__Alternatives_3_1_in_rule__Node__Group_3__13309);
            rule__Node__Alternatives_3_1();
            _fsp--;


            }

             after(grammarAccess.getNodeAccess().getAlternatives_3_1()); 

            }

            pushFollow(FOLLOW_rule__Node__Group_3__2_in_rule__Node__Group_3__13318);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1525:1: rule__Node__Group_3__2 : ( '}' ) ;
    public final void rule__Node__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1529:1: ( ( '}' ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1530:1: ( '}' )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1530:1: ( '}' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1531:1: '}'
            {
             before(grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_3_2()); 
            match(input,27,FOLLOW_27_in_rule__Node__Group_3__23347); 
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


    // $ANTLR start rule__Node__Group_3_1_1__0
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1550:1: rule__Node__Group_3_1_1__0 : ( 'see' ) rule__Node__Group_3_1_1__1 ;
    public final void rule__Node__Group_3_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1554:1: ( ( 'see' ) rule__Node__Group_3_1_1__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1555:1: ( 'see' ) rule__Node__Group_3_1_1__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1555:1: ( 'see' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1556:1: 'see'
            {
             before(grammarAccess.getNodeAccess().getSeeKeyword_3_1_1_0()); 
            match(input,28,FOLLOW_28_in_rule__Node__Group_3_1_1__03389); 
             after(grammarAccess.getNodeAccess().getSeeKeyword_3_1_1_0()); 

            }

            pushFollow(FOLLOW_rule__Node__Group_3_1_1__1_in_rule__Node__Group_3_1_1__03399);
            rule__Node__Group_3_1_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__Group_3_1_1__0


    // $ANTLR start rule__Node__Group_3_1_1__1
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1570:1: rule__Node__Group_3_1_1__1 : ( 'domain' ) rule__Node__Group_3_1_1__2 ;
    public final void rule__Node__Group_3_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1574:1: ( ( 'domain' ) rule__Node__Group_3_1_1__2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1575:1: ( 'domain' ) rule__Node__Group_3_1_1__2
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1575:1: ( 'domain' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1576:1: 'domain'
            {
             before(grammarAccess.getNodeAccess().getDomainKeyword_3_1_1_1()); 
            match(input,29,FOLLOW_29_in_rule__Node__Group_3_1_1__13428); 
             after(grammarAccess.getNodeAccess().getDomainKeyword_3_1_1_1()); 

            }

            pushFollow(FOLLOW_rule__Node__Group_3_1_1__2_in_rule__Node__Group_3_1_1__13438);
            rule__Node__Group_3_1_1__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__Group_3_1_1__1


    // $ANTLR start rule__Node__Group_3_1_1__2
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1590:1: rule__Node__Group_3_1_1__2 : ( ( rule__Node__ProblemRefAssignment_3_1_1_2 ) ) ;
    public final void rule__Node__Group_3_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1594:1: ( ( ( rule__Node__ProblemRefAssignment_3_1_1_2 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1595:1: ( ( rule__Node__ProblemRefAssignment_3_1_1_2 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1595:1: ( ( rule__Node__ProblemRefAssignment_3_1_1_2 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1596:1: ( rule__Node__ProblemRefAssignment_3_1_1_2 )
            {
             before(grammarAccess.getNodeAccess().getProblemRefAssignment_3_1_1_2()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1597:1: ( rule__Node__ProblemRefAssignment_3_1_1_2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1597:2: rule__Node__ProblemRefAssignment_3_1_1_2
            {
            pushFollow(FOLLOW_rule__Node__ProblemRefAssignment_3_1_1_2_in_rule__Node__Group_3_1_1__23466);
            rule__Node__ProblemRefAssignment_3_1_1_2();
            _fsp--;


            }

             after(grammarAccess.getNodeAccess().getProblemRefAssignment_3_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__Group_3_1_1__2


    // $ANTLR start rule__Node__Group_3_1_3__0
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1613:1: rule__Node__Group_3_1_3__0 : ( 'see' ) rule__Node__Group_3_1_3__1 ;
    public final void rule__Node__Group_3_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1617:1: ( ( 'see' ) rule__Node__Group_3_1_3__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1618:1: ( 'see' ) rule__Node__Group_3_1_3__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1618:1: ( 'see' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1619:1: 'see'
            {
             before(grammarAccess.getNodeAccess().getSeeKeyword_3_1_3_0()); 
            match(input,28,FOLLOW_28_in_rule__Node__Group_3_1_3__03507); 
             after(grammarAccess.getNodeAccess().getSeeKeyword_3_1_3_0()); 

            }

            pushFollow(FOLLOW_rule__Node__Group_3_1_3__1_in_rule__Node__Group_3_1_3__03517);
            rule__Node__Group_3_1_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__Group_3_1_3__0


    // $ANTLR start rule__Node__Group_3_1_3__1
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1633:1: rule__Node__Group_3_1_3__1 : ( 'intention' ) rule__Node__Group_3_1_3__2 ;
    public final void rule__Node__Group_3_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1637:1: ( ( 'intention' ) rule__Node__Group_3_1_3__2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1638:1: ( 'intention' ) rule__Node__Group_3_1_3__2
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1638:1: ( 'intention' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1639:1: 'intention'
            {
             before(grammarAccess.getNodeAccess().getIntentionKeyword_3_1_3_1()); 
            match(input,30,FOLLOW_30_in_rule__Node__Group_3_1_3__13546); 
             after(grammarAccess.getNodeAccess().getIntentionKeyword_3_1_3_1()); 

            }

            pushFollow(FOLLOW_rule__Node__Group_3_1_3__2_in_rule__Node__Group_3_1_3__13556);
            rule__Node__Group_3_1_3__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__Group_3_1_3__1


    // $ANTLR start rule__Node__Group_3_1_3__2
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1653:1: rule__Node__Group_3_1_3__2 : ( ( rule__Node__IstarRefAssignment_3_1_3_2 ) ) ;
    public final void rule__Node__Group_3_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1657:1: ( ( ( rule__Node__IstarRefAssignment_3_1_3_2 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1658:1: ( ( rule__Node__IstarRefAssignment_3_1_3_2 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1658:1: ( ( rule__Node__IstarRefAssignment_3_1_3_2 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1659:1: ( rule__Node__IstarRefAssignment_3_1_3_2 )
            {
             before(grammarAccess.getNodeAccess().getIstarRefAssignment_3_1_3_2()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1660:1: ( rule__Node__IstarRefAssignment_3_1_3_2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1660:2: rule__Node__IstarRefAssignment_3_1_3_2
            {
            pushFollow(FOLLOW_rule__Node__IstarRefAssignment_3_1_3_2_in_rule__Node__Group_3_1_3__23584);
            rule__Node__IstarRefAssignment_3_1_3_2();
            _fsp--;


            }

             after(grammarAccess.getNodeAccess().getIstarRefAssignment_3_1_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__Group_3_1_3__2


    // $ANTLR start rule__Phenomenon__Group__0
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1676:1: rule__Phenomenon__Group__0 : ( ( rule__Phenomenon__TypeAssignment_0 )? ) rule__Phenomenon__Group__1 ;
    public final void rule__Phenomenon__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1680:1: ( ( ( rule__Phenomenon__TypeAssignment_0 )? ) rule__Phenomenon__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1681:1: ( ( rule__Phenomenon__TypeAssignment_0 )? ) rule__Phenomenon__Group__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1681:1: ( ( rule__Phenomenon__TypeAssignment_0 )? )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1682:1: ( rule__Phenomenon__TypeAssignment_0 )?
            {
             before(grammarAccess.getPhenomenonAccess().getTypeAssignment_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1683:1: ( rule__Phenomenon__TypeAssignment_0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=18 && LA17_0<=20)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1683:2: rule__Phenomenon__TypeAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Phenomenon__TypeAssignment_0_in_rule__Phenomenon__Group__03624);
                    rule__Phenomenon__TypeAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPhenomenonAccess().getTypeAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Phenomenon__Group__1_in_rule__Phenomenon__Group__03634);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1694:1: rule__Phenomenon__Group__1 : ( ( rule__Phenomenon__NameAssignment_1 ) ) rule__Phenomenon__Group__2 ;
    public final void rule__Phenomenon__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1698:1: ( ( ( rule__Phenomenon__NameAssignment_1 ) ) rule__Phenomenon__Group__2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1699:1: ( ( rule__Phenomenon__NameAssignment_1 ) ) rule__Phenomenon__Group__2
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1699:1: ( ( rule__Phenomenon__NameAssignment_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1700:1: ( rule__Phenomenon__NameAssignment_1 )
            {
             before(grammarAccess.getPhenomenonAccess().getNameAssignment_1()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1701:1: ( rule__Phenomenon__NameAssignment_1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1701:2: rule__Phenomenon__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Phenomenon__NameAssignment_1_in_rule__Phenomenon__Group__13662);
            rule__Phenomenon__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getPhenomenonAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Phenomenon__Group__2_in_rule__Phenomenon__Group__13671);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1712:1: rule__Phenomenon__Group__2 : ( ( rule__Phenomenon__Group_2__0 )? ) ;
    public final void rule__Phenomenon__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1716:1: ( ( ( rule__Phenomenon__Group_2__0 )? ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1717:1: ( ( rule__Phenomenon__Group_2__0 )? )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1717:1: ( ( rule__Phenomenon__Group_2__0 )? )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1718:1: ( rule__Phenomenon__Group_2__0 )?
            {
             before(grammarAccess.getPhenomenonAccess().getGroup_2()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1719:1: ( rule__Phenomenon__Group_2__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==25) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1719:2: rule__Phenomenon__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Phenomenon__Group_2__0_in_rule__Phenomenon__Group__23699);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1735:1: rule__Phenomenon__Group_2__0 : ( ':' ) rule__Phenomenon__Group_2__1 ;
    public final void rule__Phenomenon__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1739:1: ( ( ':' ) rule__Phenomenon__Group_2__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1740:1: ( ':' ) rule__Phenomenon__Group_2__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1740:1: ( ':' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1741:1: ':'
            {
             before(grammarAccess.getPhenomenonAccess().getColonKeyword_2_0()); 
            match(input,25,FOLLOW_25_in_rule__Phenomenon__Group_2__03741); 
             after(grammarAccess.getPhenomenonAccess().getColonKeyword_2_0()); 

            }

            pushFollow(FOLLOW_rule__Phenomenon__Group_2__1_in_rule__Phenomenon__Group_2__03751);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1755:1: rule__Phenomenon__Group_2__1 : ( ( rule__Phenomenon__DescriptionAssignment_2_1 ) ) ;
    public final void rule__Phenomenon__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1759:1: ( ( ( rule__Phenomenon__DescriptionAssignment_2_1 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1760:1: ( ( rule__Phenomenon__DescriptionAssignment_2_1 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1760:1: ( ( rule__Phenomenon__DescriptionAssignment_2_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1761:1: ( rule__Phenomenon__DescriptionAssignment_2_1 )
            {
             before(grammarAccess.getPhenomenonAccess().getDescriptionAssignment_2_1()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1762:1: ( rule__Phenomenon__DescriptionAssignment_2_1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1762:2: rule__Phenomenon__DescriptionAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Phenomenon__DescriptionAssignment_2_1_in_rule__Phenomenon__Group_2__13779);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1776:1: rule__Link__Group__0 : ( ( rule__Link__FromAssignment_0 ) ) rule__Link__Group__1 ;
    public final void rule__Link__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1780:1: ( ( ( rule__Link__FromAssignment_0 ) ) rule__Link__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1781:1: ( ( rule__Link__FromAssignment_0 ) ) rule__Link__Group__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1781:1: ( ( rule__Link__FromAssignment_0 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1782:1: ( rule__Link__FromAssignment_0 )
            {
             before(grammarAccess.getLinkAccess().getFromAssignment_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1783:1: ( rule__Link__FromAssignment_0 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1783:2: rule__Link__FromAssignment_0
            {
            pushFollow(FOLLOW_rule__Link__FromAssignment_0_in_rule__Link__Group__03817);
            rule__Link__FromAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getLinkAccess().getFromAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Link__Group__1_in_rule__Link__Group__03826);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1794:1: rule__Link__Group__1 : ( ( rule__Link__TypeAssignment_1 ) ) rule__Link__Group__2 ;
    public final void rule__Link__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1798:1: ( ( ( rule__Link__TypeAssignment_1 ) ) rule__Link__Group__2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1799:1: ( ( rule__Link__TypeAssignment_1 ) ) rule__Link__Group__2
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1799:1: ( ( rule__Link__TypeAssignment_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1800:1: ( rule__Link__TypeAssignment_1 )
            {
             before(grammarAccess.getLinkAccess().getTypeAssignment_1()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1801:1: ( rule__Link__TypeAssignment_1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1801:2: rule__Link__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Link__TypeAssignment_1_in_rule__Link__Group__13854);
            rule__Link__TypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getLinkAccess().getTypeAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Link__Group__2_in_rule__Link__Group__13863);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1812:1: rule__Link__Group__2 : ( ( rule__Link__ToAssignment_2 ) ) rule__Link__Group__3 ;
    public final void rule__Link__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1816:1: ( ( ( rule__Link__ToAssignment_2 ) ) rule__Link__Group__3 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1817:1: ( ( rule__Link__ToAssignment_2 ) ) rule__Link__Group__3
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1817:1: ( ( rule__Link__ToAssignment_2 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1818:1: ( rule__Link__ToAssignment_2 )
            {
             before(grammarAccess.getLinkAccess().getToAssignment_2()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1819:1: ( rule__Link__ToAssignment_2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1819:2: rule__Link__ToAssignment_2
            {
            pushFollow(FOLLOW_rule__Link__ToAssignment_2_in_rule__Link__Group__23891);
            rule__Link__ToAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getLinkAccess().getToAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__Link__Group__3_in_rule__Link__Group__23900);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1830:1: rule__Link__Group__3 : ( ( rule__Link__Group_3__0 )? ) rule__Link__Group__4 ;
    public final void rule__Link__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1834:1: ( ( ( rule__Link__Group_3__0 )? ) rule__Link__Group__4 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1835:1: ( ( rule__Link__Group_3__0 )? ) rule__Link__Group__4
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1835:1: ( ( rule__Link__Group_3__0 )? )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1836:1: ( rule__Link__Group_3__0 )?
            {
             before(grammarAccess.getLinkAccess().getGroup_3()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1837:1: ( rule__Link__Group_3__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==26) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1837:2: rule__Link__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Link__Group_3__0_in_rule__Link__Group__33928);
                    rule__Link__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLinkAccess().getGroup_3()); 

            }

            pushFollow(FOLLOW_rule__Link__Group__4_in_rule__Link__Group__33938);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1848:1: rule__Link__Group__4 : ( ( rule__Link__Group_4__0 )? ) ;
    public final void rule__Link__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1852:1: ( ( ( rule__Link__Group_4__0 )? ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1853:1: ( ( rule__Link__Group_4__0 )? )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1853:1: ( ( rule__Link__Group_4__0 )? )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1854:1: ( rule__Link__Group_4__0 )?
            {
             before(grammarAccess.getLinkAccess().getGroup_4()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1855:1: ( rule__Link__Group_4__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==25) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1855:2: rule__Link__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Link__Group_4__0_in_rule__Link__Group__43966);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1875:1: rule__Link__Group_3__0 : ( '{' ) rule__Link__Group_3__1 ;
    public final void rule__Link__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1879:1: ( ( '{' ) rule__Link__Group_3__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1880:1: ( '{' ) rule__Link__Group_3__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1880:1: ( '{' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1881:1: '{'
            {
             before(grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,26,FOLLOW_26_in_rule__Link__Group_3__04012); 
             after(grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_3_0()); 

            }

            pushFollow(FOLLOW_rule__Link__Group_3__1_in_rule__Link__Group_3__04022);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1895:1: rule__Link__Group_3__1 : ( ( rule__Link__PhenomenaAssignment_3_1 ) ) rule__Link__Group_3__2 ;
    public final void rule__Link__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1899:1: ( ( ( rule__Link__PhenomenaAssignment_3_1 ) ) rule__Link__Group_3__2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1900:1: ( ( rule__Link__PhenomenaAssignment_3_1 ) ) rule__Link__Group_3__2
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1900:1: ( ( rule__Link__PhenomenaAssignment_3_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1901:1: ( rule__Link__PhenomenaAssignment_3_1 )
            {
             before(grammarAccess.getLinkAccess().getPhenomenaAssignment_3_1()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1902:1: ( rule__Link__PhenomenaAssignment_3_1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1902:2: rule__Link__PhenomenaAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Link__PhenomenaAssignment_3_1_in_rule__Link__Group_3__14050);
            rule__Link__PhenomenaAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getLinkAccess().getPhenomenaAssignment_3_1()); 

            }

            pushFollow(FOLLOW_rule__Link__Group_3__2_in_rule__Link__Group_3__14059);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1913:1: rule__Link__Group_3__2 : ( ( rule__Link__Group_3_2__0 )* ) rule__Link__Group_3__3 ;
    public final void rule__Link__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1917:1: ( ( ( rule__Link__Group_3_2__0 )* ) rule__Link__Group_3__3 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1918:1: ( ( rule__Link__Group_3_2__0 )* ) rule__Link__Group_3__3
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1918:1: ( ( rule__Link__Group_3_2__0 )* )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1919:1: ( rule__Link__Group_3_2__0 )*
            {
             before(grammarAccess.getLinkAccess().getGroup_3_2()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1920:1: ( rule__Link__Group_3_2__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==31) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1920:2: rule__Link__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Link__Group_3_2__0_in_rule__Link__Group_3__24087);
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

            pushFollow(FOLLOW_rule__Link__Group_3__3_in_rule__Link__Group_3__24097);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1931:1: rule__Link__Group_3__3 : ( '}' ) ;
    public final void rule__Link__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1935:1: ( ( '}' ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1936:1: ( '}' )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1936:1: ( '}' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1937:1: '}'
            {
             before(grammarAccess.getLinkAccess().getRightCurlyBracketKeyword_3_3()); 
            match(input,27,FOLLOW_27_in_rule__Link__Group_3__34126); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1958:1: rule__Link__Group_3_2__0 : ( ',' ) rule__Link__Group_3_2__1 ;
    public final void rule__Link__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1962:1: ( ( ',' ) rule__Link__Group_3_2__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1963:1: ( ',' ) rule__Link__Group_3_2__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1963:1: ( ',' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1964:1: ','
            {
             before(grammarAccess.getLinkAccess().getCommaKeyword_3_2_0()); 
            match(input,31,FOLLOW_31_in_rule__Link__Group_3_2__04170); 
             after(grammarAccess.getLinkAccess().getCommaKeyword_3_2_0()); 

            }

            pushFollow(FOLLOW_rule__Link__Group_3_2__1_in_rule__Link__Group_3_2__04180);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1978:1: rule__Link__Group_3_2__1 : ( ( rule__Link__PhenomenaAssignment_3_2_1 ) ) ;
    public final void rule__Link__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1982:1: ( ( ( rule__Link__PhenomenaAssignment_3_2_1 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1983:1: ( ( rule__Link__PhenomenaAssignment_3_2_1 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1983:1: ( ( rule__Link__PhenomenaAssignment_3_2_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1984:1: ( rule__Link__PhenomenaAssignment_3_2_1 )
            {
             before(grammarAccess.getLinkAccess().getPhenomenaAssignment_3_2_1()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1985:1: ( rule__Link__PhenomenaAssignment_3_2_1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1985:2: rule__Link__PhenomenaAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__Link__PhenomenaAssignment_3_2_1_in_rule__Link__Group_3_2__14208);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1999:1: rule__Link__Group_4__0 : ( ':' ) rule__Link__Group_4__1 ;
    public final void rule__Link__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2003:1: ( ( ':' ) rule__Link__Group_4__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2004:1: ( ':' ) rule__Link__Group_4__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2004:1: ( ':' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2005:1: ':'
            {
             before(grammarAccess.getLinkAccess().getColonKeyword_4_0()); 
            match(input,25,FOLLOW_25_in_rule__Link__Group_4__04247); 
             after(grammarAccess.getLinkAccess().getColonKeyword_4_0()); 

            }

            pushFollow(FOLLOW_rule__Link__Group_4__1_in_rule__Link__Group_4__04257);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2019:1: rule__Link__Group_4__1 : ( ( rule__Link__DescriptionAssignment_4_1 ) ) ;
    public final void rule__Link__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2023:1: ( ( ( rule__Link__DescriptionAssignment_4_1 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2024:1: ( ( rule__Link__DescriptionAssignment_4_1 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2024:1: ( ( rule__Link__DescriptionAssignment_4_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2025:1: ( rule__Link__DescriptionAssignment_4_1 )
            {
             before(grammarAccess.getLinkAccess().getDescriptionAssignment_4_1()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2026:1: ( rule__Link__DescriptionAssignment_4_1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2026:2: rule__Link__DescriptionAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Link__DescriptionAssignment_4_1_in_rule__Link__Group_4__14285);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2040:1: rule__Model__Group__0 : ( 'istar' ) rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2044:1: ( ( 'istar' ) rule__Model__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2045:1: ( 'istar' ) rule__Model__Group__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2045:1: ( 'istar' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2046:1: 'istar'
            {
             before(grammarAccess.getModelAccess().getIstarKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__Model__Group__04324); 
             after(grammarAccess.getModelAccess().getIstarKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__04334);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2060:1: rule__Model__Group__1 : ( ( rule__Model__NameAssignment_1 )? ) rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2064:1: ( ( ( rule__Model__NameAssignment_1 )? ) rule__Model__Group__2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2065:1: ( ( rule__Model__NameAssignment_1 )? ) rule__Model__Group__2
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2065:1: ( ( rule__Model__NameAssignment_1 )? )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2066:1: ( rule__Model__NameAssignment_1 )?
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2067:1: ( rule__Model__NameAssignment_1 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2067:2: rule__Model__NameAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Model__NameAssignment_1_in_rule__Model__Group__14362);
                    rule__Model__NameAssignment_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__14372);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2078:1: rule__Model__Group__2 : ( ':' ) rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2082:1: ( ( ':' ) rule__Model__Group__3 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2083:1: ( ':' ) rule__Model__Group__3
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2083:1: ( ':' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2084:1: ':'
            {
             before(grammarAccess.getModelAccess().getColonKeyword_2()); 
            match(input,25,FOLLOW_25_in_rule__Model__Group__24401); 
             after(grammarAccess.getModelAccess().getColonKeyword_2()); 

            }

            pushFollow(FOLLOW_rule__Model__Group__3_in_rule__Model__Group__24411);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2098:1: rule__Model__Group__3 : ( ( rule__Model__Alternatives_3 )* ) ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2102:1: ( ( ( rule__Model__Alternatives_3 )* ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2103:1: ( ( rule__Model__Alternatives_3 )* )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2103:1: ( ( rule__Model__Alternatives_3 )* )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2104:1: ( rule__Model__Alternatives_3 )*
            {
             before(grammarAccess.getModelAccess().getAlternatives_3()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2105:1: ( rule__Model__Alternatives_3 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID||(LA23_0>=33 && LA23_0<=41)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2105:2: rule__Model__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_rule__Model__Alternatives_3_in_rule__Model__Group__34439);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2123:1: rule__Actor__Group__0 : ( 'actor' ) rule__Actor__Group__1 ;
    public final void rule__Actor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2127:1: ( ( 'actor' ) rule__Actor__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2128:1: ( 'actor' ) rule__Actor__Group__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2128:1: ( 'actor' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2129:1: 'actor'
            {
             before(grammarAccess.getActorAccess().getActorKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__Actor__Group__04483); 
             after(grammarAccess.getActorAccess().getActorKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Actor__Group__1_in_rule__Actor__Group__04493);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2143:1: rule__Actor__Group__1 : ( ( rule__Actor__NameAssignment_1 ) ) rule__Actor__Group__2 ;
    public final void rule__Actor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2147:1: ( ( ( rule__Actor__NameAssignment_1 ) ) rule__Actor__Group__2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2148:1: ( ( rule__Actor__NameAssignment_1 ) ) rule__Actor__Group__2
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2148:1: ( ( rule__Actor__NameAssignment_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2149:1: ( rule__Actor__NameAssignment_1 )
            {
             before(grammarAccess.getActorAccess().getNameAssignment_1()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2150:1: ( rule__Actor__NameAssignment_1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2150:2: rule__Actor__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Actor__NameAssignment_1_in_rule__Actor__Group__14521);
            rule__Actor__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getActorAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Actor__Group__2_in_rule__Actor__Group__14530);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2161:1: rule__Actor__Group__2 : ( ( rule__Actor__Alternatives_2 )* ) rule__Actor__Group__3 ;
    public final void rule__Actor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2165:1: ( ( ( rule__Actor__Alternatives_2 )* ) rule__Actor__Group__3 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2166:1: ( ( rule__Actor__Alternatives_2 )* ) rule__Actor__Group__3
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2166:1: ( ( rule__Actor__Alternatives_2 )* )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2167:1: ( rule__Actor__Alternatives_2 )*
            {
             before(grammarAccess.getActorAccess().getAlternatives_2()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2168:1: ( rule__Actor__Alternatives_2 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ID) ) {
                    int LA24_2 = input.LA(2);

                    if ( (LA24_2==EOF||LA24_2==RULE_ID||(LA24_2>=26 && LA24_2<=27)||(LA24_2>=33 && LA24_2<=41)) ) {
                        alt24=1;
                    }


                }


                switch (alt24) {
            	case 1 :
            	    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2168:2: rule__Actor__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_rule__Actor__Alternatives_2_in_rule__Actor__Group__24558);
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

            pushFollow(FOLLOW_rule__Actor__Group__3_in_rule__Actor__Group__24568);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2179:1: rule__Actor__Group__3 : ( ( rule__Actor__Group_3__0 )? ) ;
    public final void rule__Actor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2183:1: ( ( ( rule__Actor__Group_3__0 )? ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2184:1: ( ( rule__Actor__Group_3__0 )? )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2184:1: ( ( rule__Actor__Group_3__0 )? )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2185:1: ( rule__Actor__Group_3__0 )?
            {
             before(grammarAccess.getActorAccess().getGroup_3()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2186:1: ( rule__Actor__Group_3__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==26) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2186:2: rule__Actor__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Actor__Group_3__0_in_rule__Actor__Group__34596);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2204:1: rule__Actor__Group_3__0 : ( '{' ) rule__Actor__Group_3__1 ;
    public final void rule__Actor__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2208:1: ( ( '{' ) rule__Actor__Group_3__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2209:1: ( '{' ) rule__Actor__Group_3__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2209:1: ( '{' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2210:1: '{'
            {
             before(grammarAccess.getActorAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,26,FOLLOW_26_in_rule__Actor__Group_3__04640); 
             after(grammarAccess.getActorAccess().getLeftCurlyBracketKeyword_3_0()); 

            }

            pushFollow(FOLLOW_rule__Actor__Group_3__1_in_rule__Actor__Group_3__04650);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2224:1: rule__Actor__Group_3__1 : ( ( rule__Actor__IntentionsAssignment_3_1 )* ) rule__Actor__Group_3__2 ;
    public final void rule__Actor__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2228:1: ( ( ( rule__Actor__IntentionsAssignment_3_1 )* ) rule__Actor__Group_3__2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2229:1: ( ( rule__Actor__IntentionsAssignment_3_1 )* ) rule__Actor__Group_3__2
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2229:1: ( ( rule__Actor__IntentionsAssignment_3_1 )* )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2230:1: ( rule__Actor__IntentionsAssignment_3_1 )*
            {
             before(grammarAccess.getActorAccess().getIntentionsAssignment_3_1()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2231:1: ( rule__Actor__IntentionsAssignment_3_1 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=37 && LA26_0<=41)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2231:2: rule__Actor__IntentionsAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_rule__Actor__IntentionsAssignment_3_1_in_rule__Actor__Group_3__14678);
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

            pushFollow(FOLLOW_rule__Actor__Group_3__2_in_rule__Actor__Group_3__14688);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2242:1: rule__Actor__Group_3__2 : ( '}' ) ;
    public final void rule__Actor__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2246:1: ( ( '}' ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2247:1: ( '}' )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2247:1: ( '}' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2248:1: '}'
            {
             before(grammarAccess.getActorAccess().getRightCurlyBracketKeyword_3_2()); 
            match(input,27,FOLLOW_27_in_rule__Actor__Group_3__24717); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2267:1: rule__Agent__Group__0 : ( 'agent' ) rule__Agent__Group__1 ;
    public final void rule__Agent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2271:1: ( ( 'agent' ) rule__Agent__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2272:1: ( 'agent' ) rule__Agent__Group__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2272:1: ( 'agent' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2273:1: 'agent'
            {
             before(grammarAccess.getAgentAccess().getAgentKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__Agent__Group__04759); 
             after(grammarAccess.getAgentAccess().getAgentKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Agent__Group__1_in_rule__Agent__Group__04769);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2287:1: rule__Agent__Group__1 : ( ( rule__Agent__NameAssignment_1 ) ) rule__Agent__Group__2 ;
    public final void rule__Agent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2291:1: ( ( ( rule__Agent__NameAssignment_1 ) ) rule__Agent__Group__2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2292:1: ( ( rule__Agent__NameAssignment_1 ) ) rule__Agent__Group__2
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2292:1: ( ( rule__Agent__NameAssignment_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2293:1: ( rule__Agent__NameAssignment_1 )
            {
             before(grammarAccess.getAgentAccess().getNameAssignment_1()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2294:1: ( rule__Agent__NameAssignment_1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2294:2: rule__Agent__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Agent__NameAssignment_1_in_rule__Agent__Group__14797);
            rule__Agent__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getAgentAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Agent__Group__2_in_rule__Agent__Group__14806);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2305:1: rule__Agent__Group__2 : ( ( rule__Agent__Group_2__0 )? ) ;
    public final void rule__Agent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2309:1: ( ( ( rule__Agent__Group_2__0 )? ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2310:1: ( ( rule__Agent__Group_2__0 )? )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2310:1: ( ( rule__Agent__Group_2__0 )? )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2311:1: ( rule__Agent__Group_2__0 )?
            {
             before(grammarAccess.getAgentAccess().getGroup_2()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2312:1: ( rule__Agent__Group_2__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==26) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2312:2: rule__Agent__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Agent__Group_2__0_in_rule__Agent__Group__24834);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2328:1: rule__Agent__Group_2__0 : ( '{' ) rule__Agent__Group_2__1 ;
    public final void rule__Agent__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2332:1: ( ( '{' ) rule__Agent__Group_2__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2333:1: ( '{' ) rule__Agent__Group_2__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2333:1: ( '{' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2334:1: '{'
            {
             before(grammarAccess.getAgentAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,26,FOLLOW_26_in_rule__Agent__Group_2__04876); 
             after(grammarAccess.getAgentAccess().getLeftCurlyBracketKeyword_2_0()); 

            }

            pushFollow(FOLLOW_rule__Agent__Group_2__1_in_rule__Agent__Group_2__04886);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2348:1: rule__Agent__Group_2__1 : ( ( rule__Agent__IntentionsAssignment_2_1 )* ) rule__Agent__Group_2__2 ;
    public final void rule__Agent__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2352:1: ( ( ( rule__Agent__IntentionsAssignment_2_1 )* ) rule__Agent__Group_2__2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2353:1: ( ( rule__Agent__IntentionsAssignment_2_1 )* ) rule__Agent__Group_2__2
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2353:1: ( ( rule__Agent__IntentionsAssignment_2_1 )* )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2354:1: ( rule__Agent__IntentionsAssignment_2_1 )*
            {
             before(grammarAccess.getAgentAccess().getIntentionsAssignment_2_1()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2355:1: ( rule__Agent__IntentionsAssignment_2_1 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=37 && LA28_0<=41)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2355:2: rule__Agent__IntentionsAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_rule__Agent__IntentionsAssignment_2_1_in_rule__Agent__Group_2__14914);
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

            pushFollow(FOLLOW_rule__Agent__Group_2__2_in_rule__Agent__Group_2__14924);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2366:1: rule__Agent__Group_2__2 : ( '}' ) ;
    public final void rule__Agent__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2370:1: ( ( '}' ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2371:1: ( '}' )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2371:1: ( '}' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2372:1: '}'
            {
             before(grammarAccess.getAgentAccess().getRightCurlyBracketKeyword_2_2()); 
            match(input,27,FOLLOW_27_in_rule__Agent__Group_2__24953); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2391:1: rule__Role__Group__0 : ( 'role' ) rule__Role__Group__1 ;
    public final void rule__Role__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2395:1: ( ( 'role' ) rule__Role__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2396:1: ( 'role' ) rule__Role__Group__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2396:1: ( 'role' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2397:1: 'role'
            {
             before(grammarAccess.getRoleAccess().getRoleKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__Role__Group__04995); 
             after(grammarAccess.getRoleAccess().getRoleKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Role__Group__1_in_rule__Role__Group__05005);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2411:1: rule__Role__Group__1 : ( ( rule__Role__NameAssignment_1 ) ) rule__Role__Group__2 ;
    public final void rule__Role__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2415:1: ( ( ( rule__Role__NameAssignment_1 ) ) rule__Role__Group__2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2416:1: ( ( rule__Role__NameAssignment_1 ) ) rule__Role__Group__2
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2416:1: ( ( rule__Role__NameAssignment_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2417:1: ( rule__Role__NameAssignment_1 )
            {
             before(grammarAccess.getRoleAccess().getNameAssignment_1()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2418:1: ( rule__Role__NameAssignment_1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2418:2: rule__Role__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Role__NameAssignment_1_in_rule__Role__Group__15033);
            rule__Role__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getRoleAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Role__Group__2_in_rule__Role__Group__15042);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2429:1: rule__Role__Group__2 : ( ( rule__Role__Group_2__0 )? ) ;
    public final void rule__Role__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2433:1: ( ( ( rule__Role__Group_2__0 )? ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2434:1: ( ( rule__Role__Group_2__0 )? )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2434:1: ( ( rule__Role__Group_2__0 )? )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2435:1: ( rule__Role__Group_2__0 )?
            {
             before(grammarAccess.getRoleAccess().getGroup_2()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2436:1: ( rule__Role__Group_2__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==26) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2436:2: rule__Role__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Role__Group_2__0_in_rule__Role__Group__25070);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2452:1: rule__Role__Group_2__0 : ( '{' ) rule__Role__Group_2__1 ;
    public final void rule__Role__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2456:1: ( ( '{' ) rule__Role__Group_2__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2457:1: ( '{' ) rule__Role__Group_2__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2457:1: ( '{' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2458:1: '{'
            {
             before(grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,26,FOLLOW_26_in_rule__Role__Group_2__05112); 
             after(grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_2_0()); 

            }

            pushFollow(FOLLOW_rule__Role__Group_2__1_in_rule__Role__Group_2__05122);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2472:1: rule__Role__Group_2__1 : ( ( rule__Role__IntentionsAssignment_2_1 )* ) rule__Role__Group_2__2 ;
    public final void rule__Role__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2476:1: ( ( ( rule__Role__IntentionsAssignment_2_1 )* ) rule__Role__Group_2__2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2477:1: ( ( rule__Role__IntentionsAssignment_2_1 )* ) rule__Role__Group_2__2
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2477:1: ( ( rule__Role__IntentionsAssignment_2_1 )* )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2478:1: ( rule__Role__IntentionsAssignment_2_1 )*
            {
             before(grammarAccess.getRoleAccess().getIntentionsAssignment_2_1()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2479:1: ( rule__Role__IntentionsAssignment_2_1 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=37 && LA30_0<=41)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2479:2: rule__Role__IntentionsAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_rule__Role__IntentionsAssignment_2_1_in_rule__Role__Group_2__15150);
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

            pushFollow(FOLLOW_rule__Role__Group_2__2_in_rule__Role__Group_2__15160);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2490:1: rule__Role__Group_2__2 : ( '}' ) ;
    public final void rule__Role__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2494:1: ( ( '}' ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2495:1: ( '}' )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2495:1: ( '}' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2496:1: '}'
            {
             before(grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_2_2()); 
            match(input,27,FOLLOW_27_in_rule__Role__Group_2__25189); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2515:1: rule__Position__Group__0 : ( 'position' ) rule__Position__Group__1 ;
    public final void rule__Position__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2519:1: ( ( 'position' ) rule__Position__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2520:1: ( 'position' ) rule__Position__Group__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2520:1: ( 'position' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2521:1: 'position'
            {
             before(grammarAccess.getPositionAccess().getPositionKeyword_0()); 
            match(input,36,FOLLOW_36_in_rule__Position__Group__05231); 
             after(grammarAccess.getPositionAccess().getPositionKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Position__Group__1_in_rule__Position__Group__05241);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2535:1: rule__Position__Group__1 : ( ( rule__Position__NameAssignment_1 ) ) rule__Position__Group__2 ;
    public final void rule__Position__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2539:1: ( ( ( rule__Position__NameAssignment_1 ) ) rule__Position__Group__2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2540:1: ( ( rule__Position__NameAssignment_1 ) ) rule__Position__Group__2
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2540:1: ( ( rule__Position__NameAssignment_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2541:1: ( rule__Position__NameAssignment_1 )
            {
             before(grammarAccess.getPositionAccess().getNameAssignment_1()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2542:1: ( rule__Position__NameAssignment_1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2542:2: rule__Position__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Position__NameAssignment_1_in_rule__Position__Group__15269);
            rule__Position__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getPositionAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Position__Group__2_in_rule__Position__Group__15278);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2553:1: rule__Position__Group__2 : ( ( rule__Position__Group_2__0 )? ) ;
    public final void rule__Position__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2557:1: ( ( ( rule__Position__Group_2__0 )? ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2558:1: ( ( rule__Position__Group_2__0 )? )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2558:1: ( ( rule__Position__Group_2__0 )? )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2559:1: ( rule__Position__Group_2__0 )?
            {
             before(grammarAccess.getPositionAccess().getGroup_2()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2560:1: ( rule__Position__Group_2__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==26) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2560:2: rule__Position__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Position__Group_2__0_in_rule__Position__Group__25306);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2576:1: rule__Position__Group_2__0 : ( '{' ) rule__Position__Group_2__1 ;
    public final void rule__Position__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2580:1: ( ( '{' ) rule__Position__Group_2__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2581:1: ( '{' ) rule__Position__Group_2__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2581:1: ( '{' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2582:1: '{'
            {
             before(grammarAccess.getPositionAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,26,FOLLOW_26_in_rule__Position__Group_2__05348); 
             after(grammarAccess.getPositionAccess().getLeftCurlyBracketKeyword_2_0()); 

            }

            pushFollow(FOLLOW_rule__Position__Group_2__1_in_rule__Position__Group_2__05358);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2596:1: rule__Position__Group_2__1 : ( ( rule__Position__IntentionsAssignment_2_1 )* ) rule__Position__Group_2__2 ;
    public final void rule__Position__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2600:1: ( ( ( rule__Position__IntentionsAssignment_2_1 )* ) rule__Position__Group_2__2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2601:1: ( ( rule__Position__IntentionsAssignment_2_1 )* ) rule__Position__Group_2__2
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2601:1: ( ( rule__Position__IntentionsAssignment_2_1 )* )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2602:1: ( rule__Position__IntentionsAssignment_2_1 )*
            {
             before(grammarAccess.getPositionAccess().getIntentionsAssignment_2_1()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2603:1: ( rule__Position__IntentionsAssignment_2_1 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=37 && LA32_0<=41)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2603:2: rule__Position__IntentionsAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_rule__Position__IntentionsAssignment_2_1_in_rule__Position__Group_2__15386);
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

            pushFollow(FOLLOW_rule__Position__Group_2__2_in_rule__Position__Group_2__15396);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2614:1: rule__Position__Group_2__2 : ( '}' ) ;
    public final void rule__Position__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2618:1: ( ( '}' ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2619:1: ( '}' )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2619:1: ( '}' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2620:1: '}'
            {
             before(grammarAccess.getPositionAccess().getRightCurlyBracketKeyword_2_2()); 
            match(input,27,FOLLOW_27_in_rule__Position__Group_2__25425); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2639:1: rule__Goal__Group__0 : ( 'goal' ) rule__Goal__Group__1 ;
    public final void rule__Goal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2643:1: ( ( 'goal' ) rule__Goal__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2644:1: ( 'goal' ) rule__Goal__Group__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2644:1: ( 'goal' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2645:1: 'goal'
            {
             before(grammarAccess.getGoalAccess().getGoalKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__Goal__Group__05467); 
             after(grammarAccess.getGoalAccess().getGoalKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Goal__Group__1_in_rule__Goal__Group__05477);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2659:1: rule__Goal__Group__1 : ( ( rule__Goal__NameAssignment_1 ) ) rule__Goal__Group__2 ;
    public final void rule__Goal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2663:1: ( ( ( rule__Goal__NameAssignment_1 ) ) rule__Goal__Group__2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2664:1: ( ( rule__Goal__NameAssignment_1 ) ) rule__Goal__Group__2
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2664:1: ( ( rule__Goal__NameAssignment_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2665:1: ( rule__Goal__NameAssignment_1 )
            {
             before(grammarAccess.getGoalAccess().getNameAssignment_1()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2666:1: ( rule__Goal__NameAssignment_1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2666:2: rule__Goal__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Goal__NameAssignment_1_in_rule__Goal__Group__15505);
            rule__Goal__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getGoalAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Goal__Group__2_in_rule__Goal__Group__15514);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2677:1: rule__Goal__Group__2 : ( ( rule__Goal__Group_2__0 )? ) ;
    public final void rule__Goal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2681:1: ( ( ( rule__Goal__Group_2__0 )? ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2682:1: ( ( rule__Goal__Group_2__0 )? )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2682:1: ( ( rule__Goal__Group_2__0 )? )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2683:1: ( rule__Goal__Group_2__0 )?
            {
             before(grammarAccess.getGoalAccess().getGroup_2()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2684:1: ( rule__Goal__Group_2__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==26) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2684:2: rule__Goal__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Goal__Group_2__0_in_rule__Goal__Group__25542);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2700:1: rule__Goal__Group_2__0 : ( '{' ) rule__Goal__Group_2__1 ;
    public final void rule__Goal__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2704:1: ( ( '{' ) rule__Goal__Group_2__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2705:1: ( '{' ) rule__Goal__Group_2__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2705:1: ( '{' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2706:1: '{'
            {
             before(grammarAccess.getGoalAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,26,FOLLOW_26_in_rule__Goal__Group_2__05584); 
             after(grammarAccess.getGoalAccess().getLeftCurlyBracketKeyword_2_0()); 

            }

            pushFollow(FOLLOW_rule__Goal__Group_2__1_in_rule__Goal__Group_2__05594);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2720:1: rule__Goal__Group_2__1 : ( ( rule__Goal__DecompositionsAssignment_2_1 )* ) rule__Goal__Group_2__2 ;
    public final void rule__Goal__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2724:1: ( ( ( rule__Goal__DecompositionsAssignment_2_1 )* ) rule__Goal__Group_2__2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2725:1: ( ( rule__Goal__DecompositionsAssignment_2_1 )* ) rule__Goal__Group_2__2
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2725:1: ( ( rule__Goal__DecompositionsAssignment_2_1 )* )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2726:1: ( rule__Goal__DecompositionsAssignment_2_1 )*
            {
             before(grammarAccess.getGoalAccess().getDecompositionsAssignment_2_1()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2727:1: ( rule__Goal__DecompositionsAssignment_2_1 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_ID) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2727:2: rule__Goal__DecompositionsAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_rule__Goal__DecompositionsAssignment_2_1_in_rule__Goal__Group_2__15622);
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

            pushFollow(FOLLOW_rule__Goal__Group_2__2_in_rule__Goal__Group_2__15632);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2738:1: rule__Goal__Group_2__2 : ( '}' ) ;
    public final void rule__Goal__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2742:1: ( ( '}' ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2743:1: ( '}' )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2743:1: ( '}' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2744:1: '}'
            {
             before(grammarAccess.getGoalAccess().getRightCurlyBracketKeyword_2_2()); 
            match(input,27,FOLLOW_27_in_rule__Goal__Group_2__25661); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2763:1: rule__Softgoal__Group__0 : ( 'soft' ) rule__Softgoal__Group__1 ;
    public final void rule__Softgoal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2767:1: ( ( 'soft' ) rule__Softgoal__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2768:1: ( 'soft' ) rule__Softgoal__Group__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2768:1: ( 'soft' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2769:1: 'soft'
            {
             before(grammarAccess.getSoftgoalAccess().getSoftKeyword_0()); 
            match(input,38,FOLLOW_38_in_rule__Softgoal__Group__05703); 
             after(grammarAccess.getSoftgoalAccess().getSoftKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Softgoal__Group__1_in_rule__Softgoal__Group__05713);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2783:1: rule__Softgoal__Group__1 : ( ( rule__Softgoal__NameAssignment_1 ) ) ;
    public final void rule__Softgoal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2787:1: ( ( ( rule__Softgoal__NameAssignment_1 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2788:1: ( ( rule__Softgoal__NameAssignment_1 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2788:1: ( ( rule__Softgoal__NameAssignment_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2789:1: ( rule__Softgoal__NameAssignment_1 )
            {
             before(grammarAccess.getSoftgoalAccess().getNameAssignment_1()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2790:1: ( rule__Softgoal__NameAssignment_1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2790:2: rule__Softgoal__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Softgoal__NameAssignment_1_in_rule__Softgoal__Group__15741);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2804:1: rule__Task__Group__0 : ( 'task' ) rule__Task__Group__1 ;
    public final void rule__Task__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2808:1: ( ( 'task' ) rule__Task__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2809:1: ( 'task' ) rule__Task__Group__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2809:1: ( 'task' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2810:1: 'task'
            {
             before(grammarAccess.getTaskAccess().getTaskKeyword_0()); 
            match(input,39,FOLLOW_39_in_rule__Task__Group__05780); 
             after(grammarAccess.getTaskAccess().getTaskKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Task__Group__1_in_rule__Task__Group__05790);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2824:1: rule__Task__Group__1 : ( ( rule__Task__NameAssignment_1 ) ) ;
    public final void rule__Task__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2828:1: ( ( ( rule__Task__NameAssignment_1 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2829:1: ( ( rule__Task__NameAssignment_1 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2829:1: ( ( rule__Task__NameAssignment_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2830:1: ( rule__Task__NameAssignment_1 )
            {
             before(grammarAccess.getTaskAccess().getNameAssignment_1()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2831:1: ( rule__Task__NameAssignment_1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2831:2: rule__Task__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Task__NameAssignment_1_in_rule__Task__Group__15818);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2845:1: rule__Resource__Group__0 : ( 'resource' ) rule__Resource__Group__1 ;
    public final void rule__Resource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2849:1: ( ( 'resource' ) rule__Resource__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2850:1: ( 'resource' ) rule__Resource__Group__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2850:1: ( 'resource' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2851:1: 'resource'
            {
             before(grammarAccess.getResourceAccess().getResourceKeyword_0()); 
            match(input,40,FOLLOW_40_in_rule__Resource__Group__05857); 
             after(grammarAccess.getResourceAccess().getResourceKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Resource__Group__1_in_rule__Resource__Group__05867);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2865:1: rule__Resource__Group__1 : ( ( rule__Resource__NameAssignment_1 ) ) ;
    public final void rule__Resource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2869:1: ( ( ( rule__Resource__NameAssignment_1 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2870:1: ( ( rule__Resource__NameAssignment_1 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2870:1: ( ( rule__Resource__NameAssignment_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2871:1: ( rule__Resource__NameAssignment_1 )
            {
             before(grammarAccess.getResourceAccess().getNameAssignment_1()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2872:1: ( rule__Resource__NameAssignment_1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2872:2: rule__Resource__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Resource__NameAssignment_1_in_rule__Resource__Group__15895);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2886:1: rule__Belief__Group__0 : ( 'belief' ) rule__Belief__Group__1 ;
    public final void rule__Belief__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2890:1: ( ( 'belief' ) rule__Belief__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2891:1: ( 'belief' ) rule__Belief__Group__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2891:1: ( 'belief' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2892:1: 'belief'
            {
             before(grammarAccess.getBeliefAccess().getBeliefKeyword_0()); 
            match(input,41,FOLLOW_41_in_rule__Belief__Group__05934); 
             after(grammarAccess.getBeliefAccess().getBeliefKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Belief__Group__1_in_rule__Belief__Group__05944);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2906:1: rule__Belief__Group__1 : ( ( rule__Belief__NameAssignment_1 ) ) ;
    public final void rule__Belief__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2910:1: ( ( ( rule__Belief__NameAssignment_1 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2911:1: ( ( rule__Belief__NameAssignment_1 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2911:1: ( ( rule__Belief__NameAssignment_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2912:1: ( rule__Belief__NameAssignment_1 )
            {
             before(grammarAccess.getBeliefAccess().getNameAssignment_1()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2913:1: ( rule__Belief__NameAssignment_1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2913:2: rule__Belief__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Belief__NameAssignment_1_in_rule__Belief__Group__15972);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2927:1: rule__Association__Group__0 : ( ( rule__Association__SourceAssignment_0 ) ) rule__Association__Group__1 ;
    public final void rule__Association__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2931:1: ( ( ( rule__Association__SourceAssignment_0 ) ) rule__Association__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2932:1: ( ( rule__Association__SourceAssignment_0 ) ) rule__Association__Group__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2932:1: ( ( rule__Association__SourceAssignment_0 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2933:1: ( rule__Association__SourceAssignment_0 )
            {
             before(grammarAccess.getAssociationAccess().getSourceAssignment_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2934:1: ( rule__Association__SourceAssignment_0 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2934:2: rule__Association__SourceAssignment_0
            {
            pushFollow(FOLLOW_rule__Association__SourceAssignment_0_in_rule__Association__Group__06010);
            rule__Association__SourceAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getAssociationAccess().getSourceAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Association__Group__1_in_rule__Association__Group__06019);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2945:1: rule__Association__Group__1 : ( '~~>' ) rule__Association__Group__2 ;
    public final void rule__Association__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2949:1: ( ( '~~>' ) rule__Association__Group__2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2950:1: ( '~~>' ) rule__Association__Group__2
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2950:1: ( '~~>' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2951:1: '~~>'
            {
             before(grammarAccess.getAssociationAccess().getTildeTildeGreaterThanSignKeyword_1()); 
            match(input,42,FOLLOW_42_in_rule__Association__Group__16048); 
             after(grammarAccess.getAssociationAccess().getTildeTildeGreaterThanSignKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__Association__Group__2_in_rule__Association__Group__16058);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2965:1: rule__Association__Group__2 : ( ( rule__Association__TargetAssignment_2 ) ) ;
    public final void rule__Association__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2969:1: ( ( ( rule__Association__TargetAssignment_2 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2970:1: ( ( rule__Association__TargetAssignment_2 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2970:1: ( ( rule__Association__TargetAssignment_2 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2971:1: ( rule__Association__TargetAssignment_2 )
            {
             before(grammarAccess.getAssociationAccess().getTargetAssignment_2()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2972:1: ( rule__Association__TargetAssignment_2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2972:2: rule__Association__TargetAssignment_2
            {
            pushFollow(FOLLOW_rule__Association__TargetAssignment_2_in_rule__Association__Group__26086);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2988:1: rule__Dependency__Group__0 : ( ( rule__Dependency__DependencyFromAssignment_0 ) ) rule__Dependency__Group__1 ;
    public final void rule__Dependency__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2992:1: ( ( ( rule__Dependency__DependencyFromAssignment_0 ) ) rule__Dependency__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2993:1: ( ( rule__Dependency__DependencyFromAssignment_0 ) ) rule__Dependency__Group__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2993:1: ( ( rule__Dependency__DependencyFromAssignment_0 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2994:1: ( rule__Dependency__DependencyFromAssignment_0 )
            {
             before(grammarAccess.getDependencyAccess().getDependencyFromAssignment_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2995:1: ( rule__Dependency__DependencyFromAssignment_0 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2995:2: rule__Dependency__DependencyFromAssignment_0
            {
            pushFollow(FOLLOW_rule__Dependency__DependencyFromAssignment_0_in_rule__Dependency__Group__06126);
            rule__Dependency__DependencyFromAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getDependencyAccess().getDependencyFromAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Dependency__Group__1_in_rule__Dependency__Group__06135);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3006:1: rule__Dependency__Group__1 : ( '~>' ) rule__Dependency__Group__2 ;
    public final void rule__Dependency__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3010:1: ( ( '~>' ) rule__Dependency__Group__2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3011:1: ( '~>' ) rule__Dependency__Group__2
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3011:1: ( '~>' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3012:1: '~>'
            {
             before(grammarAccess.getDependencyAccess().getTildeGreaterThanSignKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__Dependency__Group__16164); 
             after(grammarAccess.getDependencyAccess().getTildeGreaterThanSignKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__Dependency__Group__2_in_rule__Dependency__Group__16174);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3026:1: rule__Dependency__Group__2 : ( ( rule__Dependency__DependencyToAssignment_2 ) ) ;
    public final void rule__Dependency__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3030:1: ( ( ( rule__Dependency__DependencyToAssignment_2 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3031:1: ( ( rule__Dependency__DependencyToAssignment_2 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3031:1: ( ( rule__Dependency__DependencyToAssignment_2 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3032:1: ( rule__Dependency__DependencyToAssignment_2 )
            {
             before(grammarAccess.getDependencyAccess().getDependencyToAssignment_2()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3033:1: ( rule__Dependency__DependencyToAssignment_2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3033:2: rule__Dependency__DependencyToAssignment_2
            {
            pushFollow(FOLLOW_rule__Dependency__DependencyToAssignment_2_in_rule__Dependency__Group__26202);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3049:1: rule__AndDecomposition__Group__0 : ( ( rule__AndDecomposition__TargetAssignment_0 ) ) rule__AndDecomposition__Group__1 ;
    public final void rule__AndDecomposition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3053:1: ( ( ( rule__AndDecomposition__TargetAssignment_0 ) ) rule__AndDecomposition__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3054:1: ( ( rule__AndDecomposition__TargetAssignment_0 ) ) rule__AndDecomposition__Group__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3054:1: ( ( rule__AndDecomposition__TargetAssignment_0 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3055:1: ( rule__AndDecomposition__TargetAssignment_0 )
            {
             before(grammarAccess.getAndDecompositionAccess().getTargetAssignment_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3056:1: ( rule__AndDecomposition__TargetAssignment_0 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3056:2: rule__AndDecomposition__TargetAssignment_0
            {
            pushFollow(FOLLOW_rule__AndDecomposition__TargetAssignment_0_in_rule__AndDecomposition__Group__06242);
            rule__AndDecomposition__TargetAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getAndDecompositionAccess().getTargetAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__AndDecomposition__Group__1_in_rule__AndDecomposition__Group__06251);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3067:1: rule__AndDecomposition__Group__1 : ( '<-(and)-' ) rule__AndDecomposition__Group__2 ;
    public final void rule__AndDecomposition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3071:1: ( ( '<-(and)-' ) rule__AndDecomposition__Group__2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3072:1: ( '<-(and)-' ) rule__AndDecomposition__Group__2
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3072:1: ( '<-(and)-' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3073:1: '<-(and)-'
            {
             before(grammarAccess.getAndDecompositionAccess().getAndKeyword_1()); 
            match(input,43,FOLLOW_43_in_rule__AndDecomposition__Group__16280); 
             after(grammarAccess.getAndDecompositionAccess().getAndKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__AndDecomposition__Group__2_in_rule__AndDecomposition__Group__16290);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3087:1: rule__AndDecomposition__Group__2 : ( ( rule__AndDecomposition__SourceAssignment_2 ) ) ;
    public final void rule__AndDecomposition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3091:1: ( ( ( rule__AndDecomposition__SourceAssignment_2 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3092:1: ( ( rule__AndDecomposition__SourceAssignment_2 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3092:1: ( ( rule__AndDecomposition__SourceAssignment_2 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3093:1: ( rule__AndDecomposition__SourceAssignment_2 )
            {
             before(grammarAccess.getAndDecompositionAccess().getSourceAssignment_2()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3094:1: ( rule__AndDecomposition__SourceAssignment_2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3094:2: rule__AndDecomposition__SourceAssignment_2
            {
            pushFollow(FOLLOW_rule__AndDecomposition__SourceAssignment_2_in_rule__AndDecomposition__Group__26318);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3110:1: rule__OrDecomposition__Group__0 : ( ( rule__OrDecomposition__TargetAssignment_0 ) ) rule__OrDecomposition__Group__1 ;
    public final void rule__OrDecomposition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3114:1: ( ( ( rule__OrDecomposition__TargetAssignment_0 ) ) rule__OrDecomposition__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3115:1: ( ( rule__OrDecomposition__TargetAssignment_0 ) ) rule__OrDecomposition__Group__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3115:1: ( ( rule__OrDecomposition__TargetAssignment_0 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3116:1: ( rule__OrDecomposition__TargetAssignment_0 )
            {
             before(grammarAccess.getOrDecompositionAccess().getTargetAssignment_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3117:1: ( rule__OrDecomposition__TargetAssignment_0 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3117:2: rule__OrDecomposition__TargetAssignment_0
            {
            pushFollow(FOLLOW_rule__OrDecomposition__TargetAssignment_0_in_rule__OrDecomposition__Group__06358);
            rule__OrDecomposition__TargetAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getOrDecompositionAccess().getTargetAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__OrDecomposition__Group__1_in_rule__OrDecomposition__Group__06367);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3128:1: rule__OrDecomposition__Group__1 : ( '<-(or)-' ) rule__OrDecomposition__Group__2 ;
    public final void rule__OrDecomposition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3132:1: ( ( '<-(or)-' ) rule__OrDecomposition__Group__2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3133:1: ( '<-(or)-' ) rule__OrDecomposition__Group__2
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3133:1: ( '<-(or)-' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3134:1: '<-(or)-'
            {
             before(grammarAccess.getOrDecompositionAccess().getOrKeyword_1()); 
            match(input,44,FOLLOW_44_in_rule__OrDecomposition__Group__16396); 
             after(grammarAccess.getOrDecompositionAccess().getOrKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__OrDecomposition__Group__2_in_rule__OrDecomposition__Group__16406);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3148:1: rule__OrDecomposition__Group__2 : ( ( rule__OrDecomposition__SourceAssignment_2 ) ) ;
    public final void rule__OrDecomposition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3152:1: ( ( ( rule__OrDecomposition__SourceAssignment_2 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3153:1: ( ( rule__OrDecomposition__SourceAssignment_2 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3153:1: ( ( rule__OrDecomposition__SourceAssignment_2 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3154:1: ( rule__OrDecomposition__SourceAssignment_2 )
            {
             before(grammarAccess.getOrDecompositionAccess().getSourceAssignment_2()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3155:1: ( rule__OrDecomposition__SourceAssignment_2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3155:2: rule__OrDecomposition__SourceAssignment_2
            {
            pushFollow(FOLLOW_rule__OrDecomposition__SourceAssignment_2_in_rule__OrDecomposition__Group__26434);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3171:1: rule__AndContribution__Group__0 : ( ( rule__AndContribution__SourceAssignment_0 ) ) rule__AndContribution__Group__1 ;
    public final void rule__AndContribution__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3175:1: ( ( ( rule__AndContribution__SourceAssignment_0 ) ) rule__AndContribution__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3176:1: ( ( rule__AndContribution__SourceAssignment_0 ) ) rule__AndContribution__Group__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3176:1: ( ( rule__AndContribution__SourceAssignment_0 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3177:1: ( rule__AndContribution__SourceAssignment_0 )
            {
             before(grammarAccess.getAndContributionAccess().getSourceAssignment_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3178:1: ( rule__AndContribution__SourceAssignment_0 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3178:2: rule__AndContribution__SourceAssignment_0
            {
            pushFollow(FOLLOW_rule__AndContribution__SourceAssignment_0_in_rule__AndContribution__Group__06474);
            rule__AndContribution__SourceAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getAndContributionAccess().getSourceAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__AndContribution__Group__1_in_rule__AndContribution__Group__06483);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3189:1: rule__AndContribution__Group__1 : ( '-(and)->' ) rule__AndContribution__Group__2 ;
    public final void rule__AndContribution__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3193:1: ( ( '-(and)->' ) rule__AndContribution__Group__2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3194:1: ( '-(and)->' ) rule__AndContribution__Group__2
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3194:1: ( '-(and)->' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3195:1: '-(and)->'
            {
             before(grammarAccess.getAndContributionAccess().getAndKeyword_1()); 
            match(input,45,FOLLOW_45_in_rule__AndContribution__Group__16512); 
             after(grammarAccess.getAndContributionAccess().getAndKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__AndContribution__Group__2_in_rule__AndContribution__Group__16522);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3209:1: rule__AndContribution__Group__2 : ( ( rule__AndContribution__TargetAssignment_2 ) ) ;
    public final void rule__AndContribution__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3213:1: ( ( ( rule__AndContribution__TargetAssignment_2 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3214:1: ( ( rule__AndContribution__TargetAssignment_2 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3214:1: ( ( rule__AndContribution__TargetAssignment_2 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3215:1: ( rule__AndContribution__TargetAssignment_2 )
            {
             before(grammarAccess.getAndContributionAccess().getTargetAssignment_2()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3216:1: ( rule__AndContribution__TargetAssignment_2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3216:2: rule__AndContribution__TargetAssignment_2
            {
            pushFollow(FOLLOW_rule__AndContribution__TargetAssignment_2_in_rule__AndContribution__Group__26550);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3232:1: rule__OrContribution__Group__0 : ( ( rule__OrContribution__SourceAssignment_0 ) ) rule__OrContribution__Group__1 ;
    public final void rule__OrContribution__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3236:1: ( ( ( rule__OrContribution__SourceAssignment_0 ) ) rule__OrContribution__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3237:1: ( ( rule__OrContribution__SourceAssignment_0 ) ) rule__OrContribution__Group__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3237:1: ( ( rule__OrContribution__SourceAssignment_0 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3238:1: ( rule__OrContribution__SourceAssignment_0 )
            {
             before(grammarAccess.getOrContributionAccess().getSourceAssignment_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3239:1: ( rule__OrContribution__SourceAssignment_0 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3239:2: rule__OrContribution__SourceAssignment_0
            {
            pushFollow(FOLLOW_rule__OrContribution__SourceAssignment_0_in_rule__OrContribution__Group__06590);
            rule__OrContribution__SourceAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getOrContributionAccess().getSourceAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__OrContribution__Group__1_in_rule__OrContribution__Group__06599);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3250:1: rule__OrContribution__Group__1 : ( '-(or)->' ) rule__OrContribution__Group__2 ;
    public final void rule__OrContribution__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3254:1: ( ( '-(or)->' ) rule__OrContribution__Group__2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3255:1: ( '-(or)->' ) rule__OrContribution__Group__2
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3255:1: ( '-(or)->' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3256:1: '-(or)->'
            {
             before(grammarAccess.getOrContributionAccess().getOrKeyword_1()); 
            match(input,46,FOLLOW_46_in_rule__OrContribution__Group__16628); 
             after(grammarAccess.getOrContributionAccess().getOrKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__OrContribution__Group__2_in_rule__OrContribution__Group__16638);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3270:1: rule__OrContribution__Group__2 : ( ( rule__OrContribution__TargetAssignment_2 ) ) ;
    public final void rule__OrContribution__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3274:1: ( ( ( rule__OrContribution__TargetAssignment_2 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3275:1: ( ( rule__OrContribution__TargetAssignment_2 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3275:1: ( ( rule__OrContribution__TargetAssignment_2 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3276:1: ( rule__OrContribution__TargetAssignment_2 )
            {
             before(grammarAccess.getOrContributionAccess().getTargetAssignment_2()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3277:1: ( rule__OrContribution__TargetAssignment_2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3277:2: rule__OrContribution__TargetAssignment_2
            {
            pushFollow(FOLLOW_rule__OrContribution__TargetAssignment_2_in_rule__OrContribution__Group__26666);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3293:1: rule__HelpContribution__Group__0 : ( ( rule__HelpContribution__SourceAssignment_0 ) ) rule__HelpContribution__Group__1 ;
    public final void rule__HelpContribution__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3297:1: ( ( ( rule__HelpContribution__SourceAssignment_0 ) ) rule__HelpContribution__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3298:1: ( ( rule__HelpContribution__SourceAssignment_0 ) ) rule__HelpContribution__Group__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3298:1: ( ( rule__HelpContribution__SourceAssignment_0 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3299:1: ( rule__HelpContribution__SourceAssignment_0 )
            {
             before(grammarAccess.getHelpContributionAccess().getSourceAssignment_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3300:1: ( rule__HelpContribution__SourceAssignment_0 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3300:2: rule__HelpContribution__SourceAssignment_0
            {
            pushFollow(FOLLOW_rule__HelpContribution__SourceAssignment_0_in_rule__HelpContribution__Group__06706);
            rule__HelpContribution__SourceAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getHelpContributionAccess().getSourceAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__HelpContribution__Group__1_in_rule__HelpContribution__Group__06715);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3311:1: rule__HelpContribution__Group__1 : ( '-(+)->' ) rule__HelpContribution__Group__2 ;
    public final void rule__HelpContribution__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3315:1: ( ( '-(+)->' ) rule__HelpContribution__Group__2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3316:1: ( '-(+)->' ) rule__HelpContribution__Group__2
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3316:1: ( '-(+)->' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3317:1: '-(+)->'
            {
             before(grammarAccess.getHelpContributionAccess().getHyphenMinusLeftParenthesisPlusSignRightParenthesisHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,47,FOLLOW_47_in_rule__HelpContribution__Group__16744); 
             after(grammarAccess.getHelpContributionAccess().getHyphenMinusLeftParenthesisPlusSignRightParenthesisHyphenMinusGreaterThanSignKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__HelpContribution__Group__2_in_rule__HelpContribution__Group__16754);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3331:1: rule__HelpContribution__Group__2 : ( ( rule__HelpContribution__TargetAssignment_2 ) ) ;
    public final void rule__HelpContribution__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3335:1: ( ( ( rule__HelpContribution__TargetAssignment_2 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3336:1: ( ( rule__HelpContribution__TargetAssignment_2 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3336:1: ( ( rule__HelpContribution__TargetAssignment_2 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3337:1: ( rule__HelpContribution__TargetAssignment_2 )
            {
             before(grammarAccess.getHelpContributionAccess().getTargetAssignment_2()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3338:1: ( rule__HelpContribution__TargetAssignment_2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3338:2: rule__HelpContribution__TargetAssignment_2
            {
            pushFollow(FOLLOW_rule__HelpContribution__TargetAssignment_2_in_rule__HelpContribution__Group__26782);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3354:1: rule__MakeContribution__Group__0 : ( ( rule__MakeContribution__SourceAssignment_0 ) ) rule__MakeContribution__Group__1 ;
    public final void rule__MakeContribution__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3358:1: ( ( ( rule__MakeContribution__SourceAssignment_0 ) ) rule__MakeContribution__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3359:1: ( ( rule__MakeContribution__SourceAssignment_0 ) ) rule__MakeContribution__Group__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3359:1: ( ( rule__MakeContribution__SourceAssignment_0 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3360:1: ( rule__MakeContribution__SourceAssignment_0 )
            {
             before(grammarAccess.getMakeContributionAccess().getSourceAssignment_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3361:1: ( rule__MakeContribution__SourceAssignment_0 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3361:2: rule__MakeContribution__SourceAssignment_0
            {
            pushFollow(FOLLOW_rule__MakeContribution__SourceAssignment_0_in_rule__MakeContribution__Group__06822);
            rule__MakeContribution__SourceAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getMakeContributionAccess().getSourceAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__MakeContribution__Group__1_in_rule__MakeContribution__Group__06831);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3372:1: rule__MakeContribution__Group__1 : ( '-(++)->' ) rule__MakeContribution__Group__2 ;
    public final void rule__MakeContribution__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3376:1: ( ( '-(++)->' ) rule__MakeContribution__Group__2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3377:1: ( '-(++)->' ) rule__MakeContribution__Group__2
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3377:1: ( '-(++)->' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3378:1: '-(++)->'
            {
             before(grammarAccess.getMakeContributionAccess().getHyphenMinusLeftParenthesisPlusSignPlusSignRightParenthesisHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,48,FOLLOW_48_in_rule__MakeContribution__Group__16860); 
             after(grammarAccess.getMakeContributionAccess().getHyphenMinusLeftParenthesisPlusSignPlusSignRightParenthesisHyphenMinusGreaterThanSignKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__MakeContribution__Group__2_in_rule__MakeContribution__Group__16870);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3392:1: rule__MakeContribution__Group__2 : ( ( rule__MakeContribution__TargetAssignment_2 ) ) ;
    public final void rule__MakeContribution__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3396:1: ( ( ( rule__MakeContribution__TargetAssignment_2 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3397:1: ( ( rule__MakeContribution__TargetAssignment_2 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3397:1: ( ( rule__MakeContribution__TargetAssignment_2 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3398:1: ( rule__MakeContribution__TargetAssignment_2 )
            {
             before(grammarAccess.getMakeContributionAccess().getTargetAssignment_2()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3399:1: ( rule__MakeContribution__TargetAssignment_2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3399:2: rule__MakeContribution__TargetAssignment_2
            {
            pushFollow(FOLLOW_rule__MakeContribution__TargetAssignment_2_in_rule__MakeContribution__Group__26898);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3415:1: rule__HurtContribution__Group__0 : ( ( rule__HurtContribution__SourceAssignment_0 ) ) rule__HurtContribution__Group__1 ;
    public final void rule__HurtContribution__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3419:1: ( ( ( rule__HurtContribution__SourceAssignment_0 ) ) rule__HurtContribution__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3420:1: ( ( rule__HurtContribution__SourceAssignment_0 ) ) rule__HurtContribution__Group__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3420:1: ( ( rule__HurtContribution__SourceAssignment_0 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3421:1: ( rule__HurtContribution__SourceAssignment_0 )
            {
             before(grammarAccess.getHurtContributionAccess().getSourceAssignment_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3422:1: ( rule__HurtContribution__SourceAssignment_0 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3422:2: rule__HurtContribution__SourceAssignment_0
            {
            pushFollow(FOLLOW_rule__HurtContribution__SourceAssignment_0_in_rule__HurtContribution__Group__06938);
            rule__HurtContribution__SourceAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getHurtContributionAccess().getSourceAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__HurtContribution__Group__1_in_rule__HurtContribution__Group__06947);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3433:1: rule__HurtContribution__Group__1 : ( '-(-)->' ) rule__HurtContribution__Group__2 ;
    public final void rule__HurtContribution__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3437:1: ( ( '-(-)->' ) rule__HurtContribution__Group__2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3438:1: ( '-(-)->' ) rule__HurtContribution__Group__2
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3438:1: ( '-(-)->' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3439:1: '-(-)->'
            {
             before(grammarAccess.getHurtContributionAccess().getHyphenMinusLeftParenthesisHyphenMinusRightParenthesisHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,49,FOLLOW_49_in_rule__HurtContribution__Group__16976); 
             after(grammarAccess.getHurtContributionAccess().getHyphenMinusLeftParenthesisHyphenMinusRightParenthesisHyphenMinusGreaterThanSignKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__HurtContribution__Group__2_in_rule__HurtContribution__Group__16986);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3453:1: rule__HurtContribution__Group__2 : ( ( rule__HurtContribution__TargetAssignment_2 ) ) ;
    public final void rule__HurtContribution__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3457:1: ( ( ( rule__HurtContribution__TargetAssignment_2 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3458:1: ( ( rule__HurtContribution__TargetAssignment_2 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3458:1: ( ( rule__HurtContribution__TargetAssignment_2 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3459:1: ( rule__HurtContribution__TargetAssignment_2 )
            {
             before(grammarAccess.getHurtContributionAccess().getTargetAssignment_2()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3460:1: ( rule__HurtContribution__TargetAssignment_2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3460:2: rule__HurtContribution__TargetAssignment_2
            {
            pushFollow(FOLLOW_rule__HurtContribution__TargetAssignment_2_in_rule__HurtContribution__Group__27014);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3476:1: rule__BreakContribution__Group__0 : ( ( rule__BreakContribution__SourceAssignment_0 ) ) rule__BreakContribution__Group__1 ;
    public final void rule__BreakContribution__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3480:1: ( ( ( rule__BreakContribution__SourceAssignment_0 ) ) rule__BreakContribution__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3481:1: ( ( rule__BreakContribution__SourceAssignment_0 ) ) rule__BreakContribution__Group__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3481:1: ( ( rule__BreakContribution__SourceAssignment_0 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3482:1: ( rule__BreakContribution__SourceAssignment_0 )
            {
             before(grammarAccess.getBreakContributionAccess().getSourceAssignment_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3483:1: ( rule__BreakContribution__SourceAssignment_0 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3483:2: rule__BreakContribution__SourceAssignment_0
            {
            pushFollow(FOLLOW_rule__BreakContribution__SourceAssignment_0_in_rule__BreakContribution__Group__07054);
            rule__BreakContribution__SourceAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getBreakContributionAccess().getSourceAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__BreakContribution__Group__1_in_rule__BreakContribution__Group__07063);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3494:1: rule__BreakContribution__Group__1 : ( '-(--)->' ) rule__BreakContribution__Group__2 ;
    public final void rule__BreakContribution__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3498:1: ( ( '-(--)->' ) rule__BreakContribution__Group__2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3499:1: ( '-(--)->' ) rule__BreakContribution__Group__2
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3499:1: ( '-(--)->' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3500:1: '-(--)->'
            {
             before(grammarAccess.getBreakContributionAccess().getHyphenMinusLeftParenthesisHyphenMinusHyphenMinusRightParenthesisHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,50,FOLLOW_50_in_rule__BreakContribution__Group__17092); 
             after(grammarAccess.getBreakContributionAccess().getHyphenMinusLeftParenthesisHyphenMinusHyphenMinusRightParenthesisHyphenMinusGreaterThanSignKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__BreakContribution__Group__2_in_rule__BreakContribution__Group__17102);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3514:1: rule__BreakContribution__Group__2 : ( ( rule__BreakContribution__TargetAssignment_2 ) ) ;
    public final void rule__BreakContribution__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3518:1: ( ( ( rule__BreakContribution__TargetAssignment_2 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3519:1: ( ( rule__BreakContribution__TargetAssignment_2 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3519:1: ( ( rule__BreakContribution__TargetAssignment_2 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3520:1: ( rule__BreakContribution__TargetAssignment_2 )
            {
             before(grammarAccess.getBreakContributionAccess().getTargetAssignment_2()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3521:1: ( rule__BreakContribution__TargetAssignment_2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3521:2: rule__BreakContribution__TargetAssignment_2
            {
            pushFollow(FOLLOW_rule__BreakContribution__TargetAssignment_2_in_rule__BreakContribution__Group__27130);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3537:1: rule__ProblemDiagram__DescriptionAssignment_0_2 : ( RULE_STRING ) ;
    public final void rule__ProblemDiagram__DescriptionAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3541:1: ( ( RULE_STRING ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3542:1: ( RULE_STRING )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3542:1: ( RULE_STRING )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3543:1: RULE_STRING
            {
             before(grammarAccess.getProblemDiagramAccess().getDescriptionSTRINGTerminalRuleCall_0_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ProblemDiagram__DescriptionAssignment_0_27170); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3552:1: rule__ProblemDiagram__NodesAssignment_1_0 : ( ruleNode ) ;
    public final void rule__ProblemDiagram__NodesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3556:1: ( ( ruleNode ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3557:1: ( ruleNode )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3557:1: ( ruleNode )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3558:1: ruleNode
            {
             before(grammarAccess.getProblemDiagramAccess().getNodesNodeParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleNode_in_rule__ProblemDiagram__NodesAssignment_1_07201);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3567:1: rule__ProblemDiagram__LinksAssignment_1_1 : ( ruleLink ) ;
    public final void rule__ProblemDiagram__LinksAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3571:1: ( ( ruleLink ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3572:1: ( ruleLink )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3572:1: ( ruleLink )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3573:1: ruleLink
            {
             before(grammarAccess.getProblemDiagramAccess().getLinksLinkParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleLink_in_rule__ProblemDiagram__LinksAssignment_1_17232);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3582:1: rule__Node__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Node__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3586:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3587:1: ( RULE_ID )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3587:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3588:1: RULE_ID
            {
             before(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Node__NameAssignment_07263); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3597:1: rule__Node__TypeAssignment_1 : ( ruleNodeType ) ;
    public final void rule__Node__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3601:1: ( ( ruleNodeType ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3602:1: ( ruleNodeType )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3602:1: ( ruleNodeType )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3603:1: ruleNodeType
            {
             before(grammarAccess.getNodeAccess().getTypeNodeTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleNodeType_in_rule__Node__TypeAssignment_17294);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3612:1: rule__Node__DescriptionAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Node__DescriptionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3616:1: ( ( RULE_STRING ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3617:1: ( RULE_STRING )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3617:1: ( RULE_STRING )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3618:1: RULE_STRING
            {
             before(grammarAccess.getNodeAccess().getDescriptionSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Node__DescriptionAssignment_2_17325); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3627:1: rule__Node__SubproblemAssignment_3_1_0 : ( ruleProblemDiagram ) ;
    public final void rule__Node__SubproblemAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3631:1: ( ( ruleProblemDiagram ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3632:1: ( ruleProblemDiagram )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3632:1: ( ruleProblemDiagram )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3633:1: ruleProblemDiagram
            {
             before(grammarAccess.getNodeAccess().getSubproblemProblemDiagramParserRuleCall_3_1_0_0()); 
            pushFollow(FOLLOW_ruleProblemDiagram_in_rule__Node__SubproblemAssignment_3_1_07356);
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


    // $ANTLR start rule__Node__ProblemRefAssignment_3_1_1_2
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3642:1: rule__Node__ProblemRefAssignment_3_1_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__Node__ProblemRefAssignment_3_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3646:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3647:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3647:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3648:1: ( RULE_ID )
            {
             before(grammarAccess.getNodeAccess().getProblemRefNodeCrossReference_3_1_1_2_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3649:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3650:1: RULE_ID
            {
             before(grammarAccess.getNodeAccess().getProblemRefNodeIDTerminalRuleCall_3_1_1_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Node__ProblemRefAssignment_3_1_1_27391); 
             after(grammarAccess.getNodeAccess().getProblemRefNodeIDTerminalRuleCall_3_1_1_2_0_1()); 

            }

             after(grammarAccess.getNodeAccess().getProblemRefNodeCrossReference_3_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__ProblemRefAssignment_3_1_1_2


    // $ANTLR start rule__Node__IstarAssignment_3_1_2
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3661:1: rule__Node__IstarAssignment_3_1_2 : ( ruleModel ) ;
    public final void rule__Node__IstarAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3665:1: ( ( ruleModel ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3666:1: ( ruleModel )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3666:1: ( ruleModel )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3667:1: ruleModel
            {
             before(grammarAccess.getNodeAccess().getIstarModelParserRuleCall_3_1_2_0()); 
            pushFollow(FOLLOW_ruleModel_in_rule__Node__IstarAssignment_3_1_27426);
            ruleModel();
            _fsp--;

             after(grammarAccess.getNodeAccess().getIstarModelParserRuleCall_3_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__IstarAssignment_3_1_2


    // $ANTLR start rule__Node__IstarRefAssignment_3_1_3_2
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3676:1: rule__Node__IstarRefAssignment_3_1_3_2 : ( ( RULE_ID ) ) ;
    public final void rule__Node__IstarRefAssignment_3_1_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3680:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3681:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3681:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3682:1: ( RULE_ID )
            {
             before(grammarAccess.getNodeAccess().getIstarRefIntentionCrossReference_3_1_3_2_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3683:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3684:1: RULE_ID
            {
             before(grammarAccess.getNodeAccess().getIstarRefIntentionIDTerminalRuleCall_3_1_3_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Node__IstarRefAssignment_3_1_3_27461); 
             after(grammarAccess.getNodeAccess().getIstarRefIntentionIDTerminalRuleCall_3_1_3_2_0_1()); 

            }

             after(grammarAccess.getNodeAccess().getIstarRefIntentionCrossReference_3_1_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__IstarRefAssignment_3_1_3_2


    // $ANTLR start rule__Phenomenon__TypeAssignment_0
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3695:1: rule__Phenomenon__TypeAssignment_0 : ( rulePhenomenonType ) ;
    public final void rule__Phenomenon__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3699:1: ( ( rulePhenomenonType ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3700:1: ( rulePhenomenonType )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3700:1: ( rulePhenomenonType )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3701:1: rulePhenomenonType
            {
             before(grammarAccess.getPhenomenonAccess().getTypePhenomenonTypeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_rulePhenomenonType_in_rule__Phenomenon__TypeAssignment_07496);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3710:1: rule__Phenomenon__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Phenomenon__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3714:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3715:1: ( RULE_ID )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3715:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3716:1: RULE_ID
            {
             before(grammarAccess.getPhenomenonAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Phenomenon__NameAssignment_17527); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3725:1: rule__Phenomenon__DescriptionAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Phenomenon__DescriptionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3729:1: ( ( RULE_STRING ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3730:1: ( RULE_STRING )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3730:1: ( RULE_STRING )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3731:1: RULE_STRING
            {
             before(grammarAccess.getPhenomenonAccess().getDescriptionSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Phenomenon__DescriptionAssignment_2_17558); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3740:1: rule__Link__FromAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Link__FromAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3744:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3745:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3745:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3746:1: ( RULE_ID )
            {
             before(grammarAccess.getLinkAccess().getFromNodeCrossReference_0_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3747:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3748:1: RULE_ID
            {
             before(grammarAccess.getLinkAccess().getFromNodeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Link__FromAssignment_07593); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3759:1: rule__Link__TypeAssignment_1 : ( ruleLinkType ) ;
    public final void rule__Link__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3763:1: ( ( ruleLinkType ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3764:1: ( ruleLinkType )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3764:1: ( ruleLinkType )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3765:1: ruleLinkType
            {
             before(grammarAccess.getLinkAccess().getTypeLinkTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleLinkType_in_rule__Link__TypeAssignment_17628);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3774:1: rule__Link__ToAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Link__ToAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3778:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3779:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3779:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3780:1: ( RULE_ID )
            {
             before(grammarAccess.getLinkAccess().getToNodeCrossReference_2_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3781:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3782:1: RULE_ID
            {
             before(grammarAccess.getLinkAccess().getToNodeIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Link__ToAssignment_27663); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3793:1: rule__Link__PhenomenaAssignment_3_1 : ( rulePhenomenon ) ;
    public final void rule__Link__PhenomenaAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3797:1: ( ( rulePhenomenon ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3798:1: ( rulePhenomenon )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3798:1: ( rulePhenomenon )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3799:1: rulePhenomenon
            {
             before(grammarAccess.getLinkAccess().getPhenomenaPhenomenonParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_rulePhenomenon_in_rule__Link__PhenomenaAssignment_3_17698);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3808:1: rule__Link__PhenomenaAssignment_3_2_1 : ( rulePhenomenon ) ;
    public final void rule__Link__PhenomenaAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3812:1: ( ( rulePhenomenon ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3813:1: ( rulePhenomenon )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3813:1: ( rulePhenomenon )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3814:1: rulePhenomenon
            {
             before(grammarAccess.getLinkAccess().getPhenomenaPhenomenonParserRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_rulePhenomenon_in_rule__Link__PhenomenaAssignment_3_2_17729);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3823:1: rule__Link__DescriptionAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Link__DescriptionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3827:1: ( ( RULE_STRING ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3828:1: ( RULE_STRING )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3828:1: ( RULE_STRING )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3829:1: RULE_STRING
            {
             before(grammarAccess.getLinkAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Link__DescriptionAssignment_4_17760); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3838:1: rule__Model__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3842:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3843:1: ( RULE_ID )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3843:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3844:1: RULE_ID
            {
             before(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Model__NameAssignment_17791); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3853:1: rule__Model__ContainersAssignment_3_0 : ( ruleContainer ) ;
    public final void rule__Model__ContainersAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3857:1: ( ( ruleContainer ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3858:1: ( ruleContainer )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3858:1: ( ruleContainer )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3859:1: ruleContainer
            {
             before(grammarAccess.getModelAccess().getContainersContainerParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_ruleContainer_in_rule__Model__ContainersAssignment_3_07822);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3868:1: rule__Model__IntentionsAssignment_3_1 : ( ruleIntention ) ;
    public final void rule__Model__IntentionsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3872:1: ( ( ruleIntention ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3873:1: ( ruleIntention )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3873:1: ( ruleIntention )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3874:1: ruleIntention
            {
             before(grammarAccess.getModelAccess().getIntentionsIntentionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleIntention_in_rule__Model__IntentionsAssignment_3_17853);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3883:1: rule__Model__DecompositionsAssignment_3_2 : ( ruleDecomposition ) ;
    public final void rule__Model__DecompositionsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3887:1: ( ( ruleDecomposition ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3888:1: ( ruleDecomposition )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3888:1: ( ruleDecomposition )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3889:1: ruleDecomposition
            {
             before(grammarAccess.getModelAccess().getDecompositionsDecompositionParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_ruleDecomposition_in_rule__Model__DecompositionsAssignment_3_27884);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3898:1: rule__Model__DependenciesAssignment_3_3 : ( ruleDependency ) ;
    public final void rule__Model__DependenciesAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3902:1: ( ( ruleDependency ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3903:1: ( ruleDependency )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3903:1: ( ruleDependency )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3904:1: ruleDependency
            {
             before(grammarAccess.getModelAccess().getDependenciesDependencyParserRuleCall_3_3_0()); 
            pushFollow(FOLLOW_ruleDependency_in_rule__Model__DependenciesAssignment_3_37915);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3913:1: rule__Model__ContributionsAssignment_3_4 : ( ruleContribution ) ;
    public final void rule__Model__ContributionsAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3917:1: ( ( ruleContribution ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3918:1: ( ruleContribution )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3918:1: ( ruleContribution )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3919:1: ruleContribution
            {
             before(grammarAccess.getModelAccess().getContributionsContributionParserRuleCall_3_4_0()); 
            pushFollow(FOLLOW_ruleContribution_in_rule__Model__ContributionsAssignment_3_47946);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3928:1: rule__Model__AssociationsAssignment_3_5 : ( ruleAssociation ) ;
    public final void rule__Model__AssociationsAssignment_3_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3932:1: ( ( ruleAssociation ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3933:1: ( ruleAssociation )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3933:1: ( ruleAssociation )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3934:1: ruleAssociation
            {
             before(grammarAccess.getModelAccess().getAssociationsAssociationParserRuleCall_3_5_0()); 
            pushFollow(FOLLOW_ruleAssociation_in_rule__Model__AssociationsAssignment_3_57977);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3943:1: rule__Actor__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Actor__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3947:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3948:1: ( RULE_ID )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3948:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3949:1: RULE_ID
            {
             before(grammarAccess.getActorAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Actor__NameAssignment_18008); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3958:1: rule__Actor__Is_aAssignment_2_0 : ( ( RULE_ID ) ) ;
    public final void rule__Actor__Is_aAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3962:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3963:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3963:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3964:1: ( RULE_ID )
            {
             before(grammarAccess.getActorAccess().getIs_aActorCrossReference_2_0_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3965:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3966:1: RULE_ID
            {
             before(grammarAccess.getActorAccess().getIs_aActorIDTerminalRuleCall_2_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Actor__Is_aAssignment_2_08043); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3977:1: rule__Actor__Is_part_ofAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Actor__Is_part_ofAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3981:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3982:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3982:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3983:1: ( RULE_ID )
            {
             before(grammarAccess.getActorAccess().getIs_part_ofActorCrossReference_2_1_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3984:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3985:1: RULE_ID
            {
             before(grammarAccess.getActorAccess().getIs_part_ofActorIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Actor__Is_part_ofAssignment_2_18082); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3996:1: rule__Actor__IntentionsAssignment_3_1 : ( ruleIntention ) ;
    public final void rule__Actor__IntentionsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4000:1: ( ( ruleIntention ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4001:1: ( ruleIntention )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4001:1: ( ruleIntention )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4002:1: ruleIntention
            {
             before(grammarAccess.getActorAccess().getIntentionsIntentionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleIntention_in_rule__Actor__IntentionsAssignment_3_18117);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4011:1: rule__Agent__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Agent__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4015:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4016:1: ( RULE_ID )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4016:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4017:1: RULE_ID
            {
             before(grammarAccess.getAgentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Agent__NameAssignment_18148); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4026:1: rule__Agent__IntentionsAssignment_2_1 : ( ruleIntention ) ;
    public final void rule__Agent__IntentionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4030:1: ( ( ruleIntention ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4031:1: ( ruleIntention )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4031:1: ( ruleIntention )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4032:1: ruleIntention
            {
             before(grammarAccess.getAgentAccess().getIntentionsIntentionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleIntention_in_rule__Agent__IntentionsAssignment_2_18179);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4041:1: rule__Role__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Role__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4045:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4046:1: ( RULE_ID )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4046:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4047:1: RULE_ID
            {
             before(grammarAccess.getRoleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Role__NameAssignment_18210); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4056:1: rule__Role__IntentionsAssignment_2_1 : ( ruleIntention ) ;
    public final void rule__Role__IntentionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4060:1: ( ( ruleIntention ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4061:1: ( ruleIntention )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4061:1: ( ruleIntention )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4062:1: ruleIntention
            {
             before(grammarAccess.getRoleAccess().getIntentionsIntentionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleIntention_in_rule__Role__IntentionsAssignment_2_18241);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4071:1: rule__Position__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Position__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4075:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4076:1: ( RULE_ID )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4076:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4077:1: RULE_ID
            {
             before(grammarAccess.getPositionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Position__NameAssignment_18272); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4086:1: rule__Position__IntentionsAssignment_2_1 : ( ruleIntention ) ;
    public final void rule__Position__IntentionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4090:1: ( ( ruleIntention ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4091:1: ( ruleIntention )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4091:1: ( ruleIntention )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4092:1: ruleIntention
            {
             before(grammarAccess.getPositionAccess().getIntentionsIntentionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleIntention_in_rule__Position__IntentionsAssignment_2_18303);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4101:1: rule__Goal__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Goal__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4105:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4106:1: ( RULE_ID )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4106:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4107:1: RULE_ID
            {
             before(grammarAccess.getGoalAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Goal__NameAssignment_18334); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4116:1: rule__Goal__DecompositionsAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Goal__DecompositionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4120:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4121:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4121:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4122:1: ( RULE_ID )
            {
             before(grammarAccess.getGoalAccess().getDecompositionsDecompositionCrossReference_2_1_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4123:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4124:1: RULE_ID
            {
             before(grammarAccess.getGoalAccess().getDecompositionsDecompositionIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Goal__DecompositionsAssignment_2_18369); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4135:1: rule__Softgoal__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Softgoal__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4139:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4140:1: ( RULE_ID )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4140:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4141:1: RULE_ID
            {
             before(grammarAccess.getSoftgoalAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Softgoal__NameAssignment_18404); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4150:1: rule__Task__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Task__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4154:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4155:1: ( RULE_ID )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4155:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4156:1: RULE_ID
            {
             before(grammarAccess.getTaskAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Task__NameAssignment_18435); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4165:1: rule__Resource__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Resource__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4169:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4170:1: ( RULE_ID )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4170:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4171:1: RULE_ID
            {
             before(grammarAccess.getResourceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Resource__NameAssignment_18466); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4180:1: rule__Belief__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Belief__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4184:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4185:1: ( RULE_ID )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4185:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4186:1: RULE_ID
            {
             before(grammarAccess.getBeliefAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Belief__NameAssignment_18497); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4195:1: rule__Association__SourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Association__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4199:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4200:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4200:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4201:1: ( RULE_ID )
            {
             before(grammarAccess.getAssociationAccess().getSourceContainerCrossReference_0_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4202:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4203:1: RULE_ID
            {
             before(grammarAccess.getAssociationAccess().getSourceContainerIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Association__SourceAssignment_08532); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4214:1: rule__Association__TargetAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Association__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4218:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4219:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4219:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4220:1: ( RULE_ID )
            {
             before(grammarAccess.getAssociationAccess().getTargetContainerCrossReference_2_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4221:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4222:1: RULE_ID
            {
             before(grammarAccess.getAssociationAccess().getTargetContainerIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Association__TargetAssignment_28571); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4233:1: rule__Dependency__DependencyFromAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Dependency__DependencyFromAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4237:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4238:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4238:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4239:1: ( RULE_ID )
            {
             before(grammarAccess.getDependencyAccess().getDependencyFromDependableCrossReference_0_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4240:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4241:1: RULE_ID
            {
             before(grammarAccess.getDependencyAccess().getDependencyFromDependableIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Dependency__DependencyFromAssignment_08610); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4252:1: rule__Dependency__DependencyToAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Dependency__DependencyToAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4256:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4257:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4257:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4258:1: ( RULE_ID )
            {
             before(grammarAccess.getDependencyAccess().getDependencyToDependableCrossReference_2_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4259:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4260:1: RULE_ID
            {
             before(grammarAccess.getDependencyAccess().getDependencyToDependableIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Dependency__DependencyToAssignment_28649); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4271:1: rule__AndDecomposition__TargetAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__AndDecomposition__TargetAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4275:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4276:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4276:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4277:1: ( RULE_ID )
            {
             before(grammarAccess.getAndDecompositionAccess().getTargetIntentionCrossReference_0_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4278:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4279:1: RULE_ID
            {
             before(grammarAccess.getAndDecompositionAccess().getTargetIntentionIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AndDecomposition__TargetAssignment_08688); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4290:1: rule__AndDecomposition__SourceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__AndDecomposition__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4294:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4295:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4295:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4296:1: ( RULE_ID )
            {
             before(grammarAccess.getAndDecompositionAccess().getSourceIntentionCrossReference_2_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4297:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4298:1: RULE_ID
            {
             before(grammarAccess.getAndDecompositionAccess().getSourceIntentionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AndDecomposition__SourceAssignment_28727); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4309:1: rule__OrDecomposition__TargetAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__OrDecomposition__TargetAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4313:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4314:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4314:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4315:1: ( RULE_ID )
            {
             before(grammarAccess.getOrDecompositionAccess().getTargetIntentionCrossReference_0_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4316:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4317:1: RULE_ID
            {
             before(grammarAccess.getOrDecompositionAccess().getTargetIntentionIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__OrDecomposition__TargetAssignment_08766); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4328:1: rule__OrDecomposition__SourceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__OrDecomposition__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4332:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4333:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4333:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4334:1: ( RULE_ID )
            {
             before(grammarAccess.getOrDecompositionAccess().getSourceIntentionCrossReference_2_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4335:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4336:1: RULE_ID
            {
             before(grammarAccess.getOrDecompositionAccess().getSourceIntentionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__OrDecomposition__SourceAssignment_28805); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4347:1: rule__AndContribution__SourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__AndContribution__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4351:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4352:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4352:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4353:1: ( RULE_ID )
            {
             before(grammarAccess.getAndContributionAccess().getSourceIntentionCrossReference_0_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4354:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4355:1: RULE_ID
            {
             before(grammarAccess.getAndContributionAccess().getSourceIntentionIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AndContribution__SourceAssignment_08844); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4366:1: rule__AndContribution__TargetAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__AndContribution__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4370:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4371:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4371:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4372:1: ( RULE_ID )
            {
             before(grammarAccess.getAndContributionAccess().getTargetIntentionCrossReference_2_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4373:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4374:1: RULE_ID
            {
             before(grammarAccess.getAndContributionAccess().getTargetIntentionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AndContribution__TargetAssignment_28883); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4385:1: rule__OrContribution__SourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__OrContribution__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4389:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4390:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4390:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4391:1: ( RULE_ID )
            {
             before(grammarAccess.getOrContributionAccess().getSourceIntentionCrossReference_0_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4392:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4393:1: RULE_ID
            {
             before(grammarAccess.getOrContributionAccess().getSourceIntentionIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__OrContribution__SourceAssignment_08922); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4404:1: rule__OrContribution__TargetAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__OrContribution__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4408:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4409:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4409:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4410:1: ( RULE_ID )
            {
             before(grammarAccess.getOrContributionAccess().getTargetIntentionCrossReference_2_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4411:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4412:1: RULE_ID
            {
             before(grammarAccess.getOrContributionAccess().getTargetIntentionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__OrContribution__TargetAssignment_28961); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4423:1: rule__HelpContribution__SourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__HelpContribution__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4427:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4428:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4428:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4429:1: ( RULE_ID )
            {
             before(grammarAccess.getHelpContributionAccess().getSourceIntentionCrossReference_0_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4430:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4431:1: RULE_ID
            {
             before(grammarAccess.getHelpContributionAccess().getSourceIntentionIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__HelpContribution__SourceAssignment_09000); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4442:1: rule__HelpContribution__TargetAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__HelpContribution__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4446:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4447:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4447:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4448:1: ( RULE_ID )
            {
             before(grammarAccess.getHelpContributionAccess().getTargetIntentionCrossReference_2_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4449:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4450:1: RULE_ID
            {
             before(grammarAccess.getHelpContributionAccess().getTargetIntentionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__HelpContribution__TargetAssignment_29039); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4461:1: rule__MakeContribution__SourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__MakeContribution__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4465:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4466:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4466:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4467:1: ( RULE_ID )
            {
             before(grammarAccess.getMakeContributionAccess().getSourceIntentionCrossReference_0_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4468:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4469:1: RULE_ID
            {
             before(grammarAccess.getMakeContributionAccess().getSourceIntentionIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MakeContribution__SourceAssignment_09078); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4480:1: rule__MakeContribution__TargetAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__MakeContribution__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4484:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4485:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4485:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4486:1: ( RULE_ID )
            {
             before(grammarAccess.getMakeContributionAccess().getTargetIntentionCrossReference_2_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4487:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4488:1: RULE_ID
            {
             before(grammarAccess.getMakeContributionAccess().getTargetIntentionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MakeContribution__TargetAssignment_29117); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4499:1: rule__HurtContribution__SourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__HurtContribution__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4503:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4504:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4504:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4505:1: ( RULE_ID )
            {
             before(grammarAccess.getHurtContributionAccess().getSourceIntentionCrossReference_0_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4506:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4507:1: RULE_ID
            {
             before(grammarAccess.getHurtContributionAccess().getSourceIntentionIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__HurtContribution__SourceAssignment_09156); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4518:1: rule__HurtContribution__TargetAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__HurtContribution__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4522:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4523:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4523:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4524:1: ( RULE_ID )
            {
             before(grammarAccess.getHurtContributionAccess().getTargetIntentionCrossReference_2_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4525:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4526:1: RULE_ID
            {
             before(grammarAccess.getHurtContributionAccess().getTargetIntentionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__HurtContribution__TargetAssignment_29195); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4537:1: rule__BreakContribution__SourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__BreakContribution__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4541:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4542:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4542:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4543:1: ( RULE_ID )
            {
             before(grammarAccess.getBreakContributionAccess().getSourceIntentionCrossReference_0_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4544:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4545:1: RULE_ID
            {
             before(grammarAccess.getBreakContributionAccess().getSourceIntentionIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BreakContribution__SourceAssignment_09234); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4556:1: rule__BreakContribution__TargetAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__BreakContribution__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4560:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4561:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4561:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4562:1: ( RULE_ID )
            {
             before(grammarAccess.getBreakContributionAccess().getTargetIntentionCrossReference_2_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4563:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4564:1: RULE_ID
            {
             before(grammarAccess.getBreakContributionAccess().getTargetIntentionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BreakContribution__TargetAssignment_29273); 
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
    public static final BitSet FOLLOW_rule__Node__Group_3_1_1__0_in_rule__Node__Alternatives_3_11929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__IstarAssignment_3_1_2_in_rule__Node__Alternatives_3_11947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3_1_3__0_in_rule__Node__Alternatives_3_11965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ContainersAssignment_3_0_in_rule__Model__Alternatives_31998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__IntentionsAssignment_3_1_in_rule__Model__Alternatives_32016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__DecompositionsAssignment_3_2_in_rule__Model__Alternatives_32034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__DependenciesAssignment_3_3_in_rule__Model__Alternatives_32052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ContributionsAssignment_3_4_in_rule__Model__Alternatives_32070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__AssociationsAssignment_3_5_in_rule__Model__Alternatives_32088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActor_in_rule__Container__Alternatives2121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAgent_in_rule__Container__Alternatives2138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRole_in_rule__Container__Alternatives2155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePosition_in_rule__Container__Alternatives2172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actor__Is_aAssignment_2_0_in_rule__Actor__Alternatives_22204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actor__Is_part_ofAssignment_2_1_in_rule__Actor__Alternatives_22222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoal_in_rule__Intention__Alternatives2255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSoftgoal_in_rule__Intention__Alternatives2272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTask_in_rule__Intention__Alternatives2289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResource_in_rule__Intention__Alternatives2306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBelief_in_rule__Intention__Alternatives2323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndDecomposition_in_rule__Decomposition__Alternatives2356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrDecomposition_in_rule__Decomposition__Alternatives2373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndContribution_in_rule__Contribution__Alternatives2405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrContribution_in_rule__Contribution__Alternatives2422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHelpContribution_in_rule__Contribution__Alternatives2439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHurtContribution_in_rule__Contribution__Alternatives2456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMakeContribution_in_rule__Contribution__Alternatives2473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBreakContribution_in_rule__Contribution__Alternatives2490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__NodeType__Alternatives2523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__NodeType__Alternatives2544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__NodeType__Alternatives2565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__NodeType__Alternatives2586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__NodeType__Alternatives2607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__NodeType__Alternatives2628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__NodeType__Alternatives2649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__PhenomenonType__Alternatives2685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__PhenomenonType__Alternatives2706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__PhenomenonType__Alternatives2727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__LinkType__Alternatives2763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__LinkType__Alternatives2784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__LinkType__Alternatives2805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__Group_0__0_in_rule__ProblemDiagram__Group__02842 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__Group__1_in_rule__ProblemDiagram__Group__02852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__Alternatives_1_in_rule__ProblemDiagram__Group__12880 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_24_in_rule__ProblemDiagram__Group_0__02920 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__Group_0__1_in_rule__ProblemDiagram__Group_0__02930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ProblemDiagram__Group_0__12959 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__Group_0__2_in_rule__ProblemDiagram__Group_0__12969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__DescriptionAssignment_0_2_in_rule__ProblemDiagram__Group_0__22997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__NameAssignment_0_in_rule__Node__Group__03037 = new BitSet(new long[]{0x000000000603F802L});
    public static final BitSet FOLLOW_rule__Node__Group__1_in_rule__Node__Group__03046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__TypeAssignment_1_in_rule__Node__Group__13074 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_rule__Node__Group__2_in_rule__Node__Group__13084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_2__0_in_rule__Node__Group__23112 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Node__Group__3_in_rule__Node__Group__23122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3__0_in_rule__Node__Group__33150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Node__Group_2__03194 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Node__Group_2__1_in_rule__Node__Group_2__03204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__DescriptionAssignment_2_1_in_rule__Node__Group_2__13232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Node__Group_3__03271 = new BitSet(new long[]{0x0000000119000020L});
    public static final BitSet FOLLOW_rule__Node__Group_3__1_in_rule__Node__Group_3__03281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Alternatives_3_1_in_rule__Node__Group_3__13309 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Node__Group_3__2_in_rule__Node__Group_3__13318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Node__Group_3__23347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Node__Group_3_1_1__03389 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Node__Group_3_1_1__1_in_rule__Node__Group_3_1_1__03399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Node__Group_3_1_1__13428 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Node__Group_3_1_1__2_in_rule__Node__Group_3_1_1__13438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__ProblemRefAssignment_3_1_1_2_in_rule__Node__Group_3_1_1__23466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Node__Group_3_1_3__03507 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Node__Group_3_1_3__1_in_rule__Node__Group_3_1_3__03517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Node__Group_3_1_3__13546 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Node__Group_3_1_3__2_in_rule__Node__Group_3_1_3__13556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__IstarRefAssignment_3_1_3_2_in_rule__Node__Group_3_1_3__23584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Phenomenon__TypeAssignment_0_in_rule__Phenomenon__Group__03624 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Phenomenon__Group__1_in_rule__Phenomenon__Group__03634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Phenomenon__NameAssignment_1_in_rule__Phenomenon__Group__13662 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Phenomenon__Group__2_in_rule__Phenomenon__Group__13671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Phenomenon__Group_2__0_in_rule__Phenomenon__Group__23699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Phenomenon__Group_2__03741 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Phenomenon__Group_2__1_in_rule__Phenomenon__Group_2__03751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Phenomenon__DescriptionAssignment_2_1_in_rule__Phenomenon__Group_2__13779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__FromAssignment_0_in_rule__Link__Group__03817 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_rule__Link__Group__1_in_rule__Link__Group__03826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__TypeAssignment_1_in_rule__Link__Group__13854 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Link__Group__2_in_rule__Link__Group__13863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__ToAssignment_2_in_rule__Link__Group__23891 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_rule__Link__Group__3_in_rule__Link__Group__23900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group_3__0_in_rule__Link__Group__33928 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Link__Group__4_in_rule__Link__Group__33938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group_4__0_in_rule__Link__Group__43966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Link__Group_3__04012 = new BitSet(new long[]{0x00000000001C0020L});
    public static final BitSet FOLLOW_rule__Link__Group_3__1_in_rule__Link__Group_3__04022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__PhenomenaAssignment_3_1_in_rule__Link__Group_3__14050 = new BitSet(new long[]{0x0000000088000000L});
    public static final BitSet FOLLOW_rule__Link__Group_3__2_in_rule__Link__Group_3__14059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group_3_2__0_in_rule__Link__Group_3__24087 = new BitSet(new long[]{0x0000000088000000L});
    public static final BitSet FOLLOW_rule__Link__Group_3__3_in_rule__Link__Group_3__24097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Link__Group_3__34126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Link__Group_3_2__04170 = new BitSet(new long[]{0x00000000001C0020L});
    public static final BitSet FOLLOW_rule__Link__Group_3_2__1_in_rule__Link__Group_3_2__04180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__PhenomenaAssignment_3_2_1_in_rule__Link__Group_3_2__14208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Link__Group_4__04247 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Link__Group_4__1_in_rule__Link__Group_4__04257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__DescriptionAssignment_4_1_in_rule__Link__Group_4__14285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Model__Group__04324 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__04334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__NameAssignment_1_in_rule__Model__Group__14362 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__14372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Model__Group__24401 = new BitSet(new long[]{0x000003FE00000022L});
    public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__24411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Alternatives_3_in_rule__Model__Group__34439 = new BitSet(new long[]{0x000003FE00000022L});
    public static final BitSet FOLLOW_33_in_rule__Actor__Group__04483 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Actor__Group__1_in_rule__Actor__Group__04493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actor__NameAssignment_1_in_rule__Actor__Group__14521 = new BitSet(new long[]{0x0000000004000022L});
    public static final BitSet FOLLOW_rule__Actor__Group__2_in_rule__Actor__Group__14530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actor__Alternatives_2_in_rule__Actor__Group__24558 = new BitSet(new long[]{0x0000000004000022L});
    public static final BitSet FOLLOW_rule__Actor__Group__3_in_rule__Actor__Group__24568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actor__Group_3__0_in_rule__Actor__Group__34596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Actor__Group_3__04640 = new BitSet(new long[]{0x000003E008000000L});
    public static final BitSet FOLLOW_rule__Actor__Group_3__1_in_rule__Actor__Group_3__04650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actor__IntentionsAssignment_3_1_in_rule__Actor__Group_3__14678 = new BitSet(new long[]{0x000003E008000000L});
    public static final BitSet FOLLOW_rule__Actor__Group_3__2_in_rule__Actor__Group_3__14688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Actor__Group_3__24717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Agent__Group__04759 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Agent__Group__1_in_rule__Agent__Group__04769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Agent__NameAssignment_1_in_rule__Agent__Group__14797 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Agent__Group__2_in_rule__Agent__Group__14806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Agent__Group_2__0_in_rule__Agent__Group__24834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Agent__Group_2__04876 = new BitSet(new long[]{0x000003E008000000L});
    public static final BitSet FOLLOW_rule__Agent__Group_2__1_in_rule__Agent__Group_2__04886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Agent__IntentionsAssignment_2_1_in_rule__Agent__Group_2__14914 = new BitSet(new long[]{0x000003E008000000L});
    public static final BitSet FOLLOW_rule__Agent__Group_2__2_in_rule__Agent__Group_2__14924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Agent__Group_2__24953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Role__Group__04995 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Role__Group__1_in_rule__Role__Group__05005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__NameAssignment_1_in_rule__Role__Group__15033 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Role__Group__2_in_rule__Role__Group__15042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group_2__0_in_rule__Role__Group__25070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Role__Group_2__05112 = new BitSet(new long[]{0x000003E008000000L});
    public static final BitSet FOLLOW_rule__Role__Group_2__1_in_rule__Role__Group_2__05122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__IntentionsAssignment_2_1_in_rule__Role__Group_2__15150 = new BitSet(new long[]{0x000003E008000000L});
    public static final BitSet FOLLOW_rule__Role__Group_2__2_in_rule__Role__Group_2__15160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Role__Group_2__25189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Position__Group__05231 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Position__Group__1_in_rule__Position__Group__05241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Position__NameAssignment_1_in_rule__Position__Group__15269 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Position__Group__2_in_rule__Position__Group__15278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Position__Group_2__0_in_rule__Position__Group__25306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Position__Group_2__05348 = new BitSet(new long[]{0x000003E008000000L});
    public static final BitSet FOLLOW_rule__Position__Group_2__1_in_rule__Position__Group_2__05358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Position__IntentionsAssignment_2_1_in_rule__Position__Group_2__15386 = new BitSet(new long[]{0x000003E008000000L});
    public static final BitSet FOLLOW_rule__Position__Group_2__2_in_rule__Position__Group_2__15396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Position__Group_2__25425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Goal__Group__05467 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Goal__Group__1_in_rule__Goal__Group__05477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goal__NameAssignment_1_in_rule__Goal__Group__15505 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Goal__Group__2_in_rule__Goal__Group__15514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goal__Group_2__0_in_rule__Goal__Group__25542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Goal__Group_2__05584 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_rule__Goal__Group_2__1_in_rule__Goal__Group_2__05594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goal__DecompositionsAssignment_2_1_in_rule__Goal__Group_2__15622 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_rule__Goal__Group_2__2_in_rule__Goal__Group_2__15632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Goal__Group_2__25661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Softgoal__Group__05703 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Softgoal__Group__1_in_rule__Softgoal__Group__05713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Softgoal__NameAssignment_1_in_rule__Softgoal__Group__15741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Task__Group__05780 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Task__Group__1_in_rule__Task__Group__05790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__NameAssignment_1_in_rule__Task__Group__15818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Resource__Group__05857 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Resource__Group__1_in_rule__Resource__Group__05867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__NameAssignment_1_in_rule__Resource__Group__15895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Belief__Group__05934 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Belief__Group__1_in_rule__Belief__Group__05944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Belief__NameAssignment_1_in_rule__Belief__Group__15972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__SourceAssignment_0_in_rule__Association__Group__06010 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__Association__Group__1_in_rule__Association__Group__06019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Association__Group__16048 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Association__Group__2_in_rule__Association__Group__16058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__TargetAssignment_2_in_rule__Association__Group__26086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dependency__DependencyFromAssignment_0_in_rule__Dependency__Group__06126 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Dependency__Group__1_in_rule__Dependency__Group__06135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Dependency__Group__16164 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Dependency__Group__2_in_rule__Dependency__Group__16174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dependency__DependencyToAssignment_2_in_rule__Dependency__Group__26202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndDecomposition__TargetAssignment_0_in_rule__AndDecomposition__Group__06242 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__AndDecomposition__Group__1_in_rule__AndDecomposition__Group__06251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__AndDecomposition__Group__16280 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AndDecomposition__Group__2_in_rule__AndDecomposition__Group__16290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndDecomposition__SourceAssignment_2_in_rule__AndDecomposition__Group__26318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrDecomposition__TargetAssignment_0_in_rule__OrDecomposition__Group__06358 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__OrDecomposition__Group__1_in_rule__OrDecomposition__Group__06367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__OrDecomposition__Group__16396 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__OrDecomposition__Group__2_in_rule__OrDecomposition__Group__16406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrDecomposition__SourceAssignment_2_in_rule__OrDecomposition__Group__26434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndContribution__SourceAssignment_0_in_rule__AndContribution__Group__06474 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__AndContribution__Group__1_in_rule__AndContribution__Group__06483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__AndContribution__Group__16512 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AndContribution__Group__2_in_rule__AndContribution__Group__16522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndContribution__TargetAssignment_2_in_rule__AndContribution__Group__26550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrContribution__SourceAssignment_0_in_rule__OrContribution__Group__06590 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__OrContribution__Group__1_in_rule__OrContribution__Group__06599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__OrContribution__Group__16628 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__OrContribution__Group__2_in_rule__OrContribution__Group__16638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrContribution__TargetAssignment_2_in_rule__OrContribution__Group__26666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HelpContribution__SourceAssignment_0_in_rule__HelpContribution__Group__06706 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__HelpContribution__Group__1_in_rule__HelpContribution__Group__06715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__HelpContribution__Group__16744 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__HelpContribution__Group__2_in_rule__HelpContribution__Group__16754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HelpContribution__TargetAssignment_2_in_rule__HelpContribution__Group__26782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MakeContribution__SourceAssignment_0_in_rule__MakeContribution__Group__06822 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__MakeContribution__Group__1_in_rule__MakeContribution__Group__06831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__MakeContribution__Group__16860 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MakeContribution__Group__2_in_rule__MakeContribution__Group__16870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MakeContribution__TargetAssignment_2_in_rule__MakeContribution__Group__26898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HurtContribution__SourceAssignment_0_in_rule__HurtContribution__Group__06938 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__HurtContribution__Group__1_in_rule__HurtContribution__Group__06947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__HurtContribution__Group__16976 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__HurtContribution__Group__2_in_rule__HurtContribution__Group__16986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HurtContribution__TargetAssignment_2_in_rule__HurtContribution__Group__27014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BreakContribution__SourceAssignment_0_in_rule__BreakContribution__Group__07054 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__BreakContribution__Group__1_in_rule__BreakContribution__Group__07063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__BreakContribution__Group__17092 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__BreakContribution__Group__2_in_rule__BreakContribution__Group__17102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BreakContribution__TargetAssignment_2_in_rule__BreakContribution__Group__27130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ProblemDiagram__DescriptionAssignment_0_27170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_rule__ProblemDiagram__NodesAssignment_1_07201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_rule__ProblemDiagram__LinksAssignment_1_17232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Node__NameAssignment_07263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeType_in_rule__Node__TypeAssignment_17294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Node__DescriptionAssignment_2_17325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProblemDiagram_in_rule__Node__SubproblemAssignment_3_1_07356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Node__ProblemRefAssignment_3_1_1_27391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModel_in_rule__Node__IstarAssignment_3_1_27426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Node__IstarRefAssignment_3_1_3_27461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhenomenonType_in_rule__Phenomenon__TypeAssignment_07496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Phenomenon__NameAssignment_17527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Phenomenon__DescriptionAssignment_2_17558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Link__FromAssignment_07593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkType_in_rule__Link__TypeAssignment_17628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Link__ToAssignment_27663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhenomenon_in_rule__Link__PhenomenaAssignment_3_17698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhenomenon_in_rule__Link__PhenomenaAssignment_3_2_17729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Link__DescriptionAssignment_4_17760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Model__NameAssignment_17791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainer_in_rule__Model__ContainersAssignment_3_07822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntention_in_rule__Model__IntentionsAssignment_3_17853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecomposition_in_rule__Model__DecompositionsAssignment_3_27884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependency_in_rule__Model__DependenciesAssignment_3_37915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContribution_in_rule__Model__ContributionsAssignment_3_47946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociation_in_rule__Model__AssociationsAssignment_3_57977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Actor__NameAssignment_18008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Actor__Is_aAssignment_2_08043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Actor__Is_part_ofAssignment_2_18082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntention_in_rule__Actor__IntentionsAssignment_3_18117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Agent__NameAssignment_18148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntention_in_rule__Agent__IntentionsAssignment_2_18179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Role__NameAssignment_18210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntention_in_rule__Role__IntentionsAssignment_2_18241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Position__NameAssignment_18272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntention_in_rule__Position__IntentionsAssignment_2_18303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Goal__NameAssignment_18334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Goal__DecompositionsAssignment_2_18369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Softgoal__NameAssignment_18404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Task__NameAssignment_18435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Resource__NameAssignment_18466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Belief__NameAssignment_18497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Association__SourceAssignment_08532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Association__TargetAssignment_28571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Dependency__DependencyFromAssignment_08610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Dependency__DependencyToAssignment_28649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AndDecomposition__TargetAssignment_08688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AndDecomposition__SourceAssignment_28727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__OrDecomposition__TargetAssignment_08766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__OrDecomposition__SourceAssignment_28805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AndContribution__SourceAssignment_08844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AndContribution__TargetAssignment_28883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__OrContribution__SourceAssignment_08922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__OrContribution__TargetAssignment_28961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__HelpContribution__SourceAssignment_09000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__HelpContribution__TargetAssignment_29039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MakeContribution__SourceAssignment_09078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MakeContribution__TargetAssignment_29117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__HurtContribution__SourceAssignment_09156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__HurtContribution__TargetAssignment_29195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BreakContribution__SourceAssignment_09234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BreakContribution__TargetAssignment_29273 = new BitSet(new long[]{0x0000000000000002L});

}