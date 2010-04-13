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



import org.antlr.runtime.*;

import uk.ac.open.problem.services.ProblemGrammarAccess;

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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:897:1: rule__Node__Alternatives_3_1 : ( ( ( rule__Node__SubproblemAssignment_3_1_0 ) ) | ( ( rule__Node__Group_3_1_1__0 ) ) | ( ( rule__Node__IstarAssignment_3_1_2 ) ) | ( ( rule__Node__Group_3_1_3__0 ) ) | ( ( rule__Node__Group_3_1_4__0 ) ) );
    public final void rule__Node__Alternatives_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:901:1: ( ( ( rule__Node__SubproblemAssignment_3_1_0 ) ) | ( ( rule__Node__Group_3_1_1__0 ) ) | ( ( rule__Node__IstarAssignment_3_1_2 ) ) | ( ( rule__Node__Group_3_1_3__0 ) ) | ( ( rule__Node__Group_3_1_4__0 ) ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt2=1;
                }
                break;
            case RULE_ID:
            case 27:
                {
                alt2=1;
                }
                break;
            case 28:
                {
                int LA2_3 = input.LA(2);

                if ( (LA2_3==29) ) {
                    alt2=2;
                }
                else if ( (LA2_3==30) ) {
                    alt2=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("897:1: rule__Node__Alternatives_3_1 : ( ( ( rule__Node__SubproblemAssignment_3_1_0 ) ) | ( ( rule__Node__Group_3_1_1__0 ) ) | ( ( rule__Node__IstarAssignment_3_1_2 ) ) | ( ( rule__Node__Group_3_1_3__0 ) ) | ( ( rule__Node__Group_3_1_4__0 ) ) );", 2, 3, input);

                    throw nvae;
                }
                }
                break;
            case 32:
                {
                alt2=3;
                }
                break;
            case 18:
            case 19:
            case 20:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("897:1: rule__Node__Alternatives_3_1 : ( ( ( rule__Node__SubproblemAssignment_3_1_0 ) ) | ( ( rule__Node__Group_3_1_1__0 ) ) | ( ( rule__Node__IstarAssignment_3_1_2 ) ) | ( ( rule__Node__Group_3_1_3__0 ) ) | ( ( rule__Node__Group_3_1_4__0 ) ) );", 2, 0, input);

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
                case 5 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:926:6: ( ( rule__Node__Group_3_1_4__0 ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:926:6: ( ( rule__Node__Group_3_1_4__0 ) )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:927:1: ( rule__Node__Group_3_1_4__0 )
                    {
                     before(grammarAccess.getNodeAccess().getGroup_3_1_4()); 
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:928:1: ( rule__Node__Group_3_1_4__0 )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:928:2: rule__Node__Group_3_1_4__0
                    {
                    pushFollow(FOLLOW_rule__Node__Group_3_1_4__0_in_rule__Node__Alternatives_3_11983);
                    rule__Node__Group_3_1_4__0();
                    _fsp--;


                    }

                     after(grammarAccess.getNodeAccess().getGroup_3_1_4()); 

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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:937:1: rule__Model__Alternatives_3 : ( ( ( rule__Model__ContainersAssignment_3_0 ) ) | ( ( rule__Model__IntentionsAssignment_3_1 ) ) | ( ( rule__Model__DecompositionsAssignment_3_2 ) ) | ( ( rule__Model__DependenciesAssignment_3_3 ) ) | ( ( rule__Model__ContributionsAssignment_3_4 ) ) | ( ( rule__Model__AssociationsAssignment_3_5 ) ) );
    public final void rule__Model__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:941:1: ( ( ( rule__Model__ContainersAssignment_3_0 ) ) | ( ( rule__Model__IntentionsAssignment_3_1 ) ) | ( ( rule__Model__DecompositionsAssignment_3_2 ) ) | ( ( rule__Model__DependenciesAssignment_3_3 ) ) | ( ( rule__Model__ContributionsAssignment_3_4 ) ) | ( ( rule__Model__AssociationsAssignment_3_5 ) ) )
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
                case 23:
                    {
                    alt3=4;
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
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("937:1: rule__Model__Alternatives_3 : ( ( ( rule__Model__ContainersAssignment_3_0 ) ) | ( ( rule__Model__IntentionsAssignment_3_1 ) ) | ( ( rule__Model__DecompositionsAssignment_3_2 ) ) | ( ( rule__Model__DependenciesAssignment_3_3 ) ) | ( ( rule__Model__ContributionsAssignment_3_4 ) ) | ( ( rule__Model__AssociationsAssignment_3_5 ) ) );", 3, 3, input);

                    throw nvae;
                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("937:1: rule__Model__Alternatives_3 : ( ( ( rule__Model__ContainersAssignment_3_0 ) ) | ( ( rule__Model__IntentionsAssignment_3_1 ) ) | ( ( rule__Model__DecompositionsAssignment_3_2 ) ) | ( ( rule__Model__DependenciesAssignment_3_3 ) ) | ( ( rule__Model__ContributionsAssignment_3_4 ) ) | ( ( rule__Model__AssociationsAssignment_3_5 ) ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:942:1: ( ( rule__Model__ContainersAssignment_3_0 ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:942:1: ( ( rule__Model__ContainersAssignment_3_0 ) )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:943:1: ( rule__Model__ContainersAssignment_3_0 )
                    {
                     before(grammarAccess.getModelAccess().getContainersAssignment_3_0()); 
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:944:1: ( rule__Model__ContainersAssignment_3_0 )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:944:2: rule__Model__ContainersAssignment_3_0
                    {
                    pushFollow(FOLLOW_rule__Model__ContainersAssignment_3_0_in_rule__Model__Alternatives_32016);
                    rule__Model__ContainersAssignment_3_0();
                    _fsp--;


                    }

                     after(grammarAccess.getModelAccess().getContainersAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:948:6: ( ( rule__Model__IntentionsAssignment_3_1 ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:948:6: ( ( rule__Model__IntentionsAssignment_3_1 ) )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:949:1: ( rule__Model__IntentionsAssignment_3_1 )
                    {
                     before(grammarAccess.getModelAccess().getIntentionsAssignment_3_1()); 
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:950:1: ( rule__Model__IntentionsAssignment_3_1 )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:950:2: rule__Model__IntentionsAssignment_3_1
                    {
                    pushFollow(FOLLOW_rule__Model__IntentionsAssignment_3_1_in_rule__Model__Alternatives_32034);
                    rule__Model__IntentionsAssignment_3_1();
                    _fsp--;


                    }

                     after(grammarAccess.getModelAccess().getIntentionsAssignment_3_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:954:6: ( ( rule__Model__DecompositionsAssignment_3_2 ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:954:6: ( ( rule__Model__DecompositionsAssignment_3_2 ) )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:955:1: ( rule__Model__DecompositionsAssignment_3_2 )
                    {
                     before(grammarAccess.getModelAccess().getDecompositionsAssignment_3_2()); 
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:956:1: ( rule__Model__DecompositionsAssignment_3_2 )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:956:2: rule__Model__DecompositionsAssignment_3_2
                    {
                    pushFollow(FOLLOW_rule__Model__DecompositionsAssignment_3_2_in_rule__Model__Alternatives_32052);
                    rule__Model__DecompositionsAssignment_3_2();
                    _fsp--;


                    }

                     after(grammarAccess.getModelAccess().getDecompositionsAssignment_3_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:960:6: ( ( rule__Model__DependenciesAssignment_3_3 ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:960:6: ( ( rule__Model__DependenciesAssignment_3_3 ) )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:961:1: ( rule__Model__DependenciesAssignment_3_3 )
                    {
                     before(grammarAccess.getModelAccess().getDependenciesAssignment_3_3()); 
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:962:1: ( rule__Model__DependenciesAssignment_3_3 )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:962:2: rule__Model__DependenciesAssignment_3_3
                    {
                    pushFollow(FOLLOW_rule__Model__DependenciesAssignment_3_3_in_rule__Model__Alternatives_32070);
                    rule__Model__DependenciesAssignment_3_3();
                    _fsp--;


                    }

                     after(grammarAccess.getModelAccess().getDependenciesAssignment_3_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:966:6: ( ( rule__Model__ContributionsAssignment_3_4 ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:966:6: ( ( rule__Model__ContributionsAssignment_3_4 ) )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:967:1: ( rule__Model__ContributionsAssignment_3_4 )
                    {
                     before(grammarAccess.getModelAccess().getContributionsAssignment_3_4()); 
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:968:1: ( rule__Model__ContributionsAssignment_3_4 )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:968:2: rule__Model__ContributionsAssignment_3_4
                    {
                    pushFollow(FOLLOW_rule__Model__ContributionsAssignment_3_4_in_rule__Model__Alternatives_32088);
                    rule__Model__ContributionsAssignment_3_4();
                    _fsp--;


                    }

                     after(grammarAccess.getModelAccess().getContributionsAssignment_3_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:972:6: ( ( rule__Model__AssociationsAssignment_3_5 ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:972:6: ( ( rule__Model__AssociationsAssignment_3_5 ) )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:973:1: ( rule__Model__AssociationsAssignment_3_5 )
                    {
                     before(grammarAccess.getModelAccess().getAssociationsAssignment_3_5()); 
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:974:1: ( rule__Model__AssociationsAssignment_3_5 )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:974:2: rule__Model__AssociationsAssignment_3_5
                    {
                    pushFollow(FOLLOW_rule__Model__AssociationsAssignment_3_5_in_rule__Model__Alternatives_32106);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:983:1: rule__Container__Alternatives : ( ( ruleActor ) | ( ruleAgent ) | ( ruleRole ) | ( rulePosition ) );
    public final void rule__Container__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:987:1: ( ( ruleActor ) | ( ruleAgent ) | ( ruleRole ) | ( rulePosition ) )
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
                    new NoViableAltException("983:1: rule__Container__Alternatives : ( ( ruleActor ) | ( ruleAgent ) | ( ruleRole ) | ( rulePosition ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:988:1: ( ruleActor )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:988:1: ( ruleActor )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:989:1: ruleActor
                    {
                     before(grammarAccess.getContainerAccess().getActorParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleActor_in_rule__Container__Alternatives2139);
                    ruleActor();
                    _fsp--;

                     after(grammarAccess.getContainerAccess().getActorParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:994:6: ( ruleAgent )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:994:6: ( ruleAgent )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:995:1: ruleAgent
                    {
                     before(grammarAccess.getContainerAccess().getAgentParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAgent_in_rule__Container__Alternatives2156);
                    ruleAgent();
                    _fsp--;

                     after(grammarAccess.getContainerAccess().getAgentParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1000:6: ( ruleRole )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1000:6: ( ruleRole )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1001:1: ruleRole
                    {
                     before(grammarAccess.getContainerAccess().getRoleParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleRole_in_rule__Container__Alternatives2173);
                    ruleRole();
                    _fsp--;

                     after(grammarAccess.getContainerAccess().getRoleParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1006:6: ( rulePosition )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1006:6: ( rulePosition )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1007:1: rulePosition
                    {
                     before(grammarAccess.getContainerAccess().getPositionParserRuleCall_3()); 
                    pushFollow(FOLLOW_rulePosition_in_rule__Container__Alternatives2190);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1017:1: rule__Actor__Alternatives_2 : ( ( ( rule__Actor__Is_aAssignment_2_0 ) ) | ( ( rule__Actor__Is_part_ofAssignment_2_1 ) ) );
    public final void rule__Actor__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1021:1: ( ( ( rule__Actor__Is_aAssignment_2_0 ) ) | ( ( rule__Actor__Is_part_ofAssignment_2_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1017:1: rule__Actor__Alternatives_2 : ( ( ( rule__Actor__Is_aAssignment_2_0 ) ) | ( ( rule__Actor__Is_part_ofAssignment_2_1 ) ) );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1022:1: ( ( rule__Actor__Is_aAssignment_2_0 ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1022:1: ( ( rule__Actor__Is_aAssignment_2_0 ) )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1023:1: ( rule__Actor__Is_aAssignment_2_0 )
                    {
                     before(grammarAccess.getActorAccess().getIs_aAssignment_2_0()); 
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1024:1: ( rule__Actor__Is_aAssignment_2_0 )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1024:2: rule__Actor__Is_aAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__Actor__Is_aAssignment_2_0_in_rule__Actor__Alternatives_22222);
                    rule__Actor__Is_aAssignment_2_0();
                    _fsp--;


                    }

                     after(grammarAccess.getActorAccess().getIs_aAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1028:6: ( ( rule__Actor__Is_part_ofAssignment_2_1 ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1028:6: ( ( rule__Actor__Is_part_ofAssignment_2_1 ) )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1029:1: ( rule__Actor__Is_part_ofAssignment_2_1 )
                    {
                     before(grammarAccess.getActorAccess().getIs_part_ofAssignment_2_1()); 
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1030:1: ( rule__Actor__Is_part_ofAssignment_2_1 )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1030:2: rule__Actor__Is_part_ofAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__Actor__Is_part_ofAssignment_2_1_in_rule__Actor__Alternatives_22240);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1039:1: rule__Intention__Alternatives : ( ( ruleGoal ) | ( ruleSoftgoal ) | ( ruleTask ) | ( ruleResource ) | ( ruleBelief ) );
    public final void rule__Intention__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1043:1: ( ( ruleGoal ) | ( ruleSoftgoal ) | ( ruleTask ) | ( ruleResource ) | ( ruleBelief ) )
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
                    new NoViableAltException("1039:1: rule__Intention__Alternatives : ( ( ruleGoal ) | ( ruleSoftgoal ) | ( ruleTask ) | ( ruleResource ) | ( ruleBelief ) );", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1044:1: ( ruleGoal )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1044:1: ( ruleGoal )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1045:1: ruleGoal
                    {
                     before(grammarAccess.getIntentionAccess().getGoalParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleGoal_in_rule__Intention__Alternatives2273);
                    ruleGoal();
                    _fsp--;

                     after(grammarAccess.getIntentionAccess().getGoalParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1050:6: ( ruleSoftgoal )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1050:6: ( ruleSoftgoal )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1051:1: ruleSoftgoal
                    {
                     before(grammarAccess.getIntentionAccess().getSoftgoalParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleSoftgoal_in_rule__Intention__Alternatives2290);
                    ruleSoftgoal();
                    _fsp--;

                     after(grammarAccess.getIntentionAccess().getSoftgoalParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1056:6: ( ruleTask )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1056:6: ( ruleTask )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1057:1: ruleTask
                    {
                     before(grammarAccess.getIntentionAccess().getTaskParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleTask_in_rule__Intention__Alternatives2307);
                    ruleTask();
                    _fsp--;

                     after(grammarAccess.getIntentionAccess().getTaskParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1062:6: ( ruleResource )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1062:6: ( ruleResource )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1063:1: ruleResource
                    {
                     before(grammarAccess.getIntentionAccess().getResourceParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleResource_in_rule__Intention__Alternatives2324);
                    ruleResource();
                    _fsp--;

                     after(grammarAccess.getIntentionAccess().getResourceParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1068:6: ( ruleBelief )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1068:6: ( ruleBelief )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1069:1: ruleBelief
                    {
                     before(grammarAccess.getIntentionAccess().getBeliefParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleBelief_in_rule__Intention__Alternatives2341);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1080:1: rule__Decomposition__Alternatives : ( ( ruleAndDecomposition ) | ( ruleOrDecomposition ) );
    public final void rule__Decomposition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1084:1: ( ( ruleAndDecomposition ) | ( ruleOrDecomposition ) )
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
                        new NoViableAltException("1080:1: rule__Decomposition__Alternatives : ( ( ruleAndDecomposition ) | ( ruleOrDecomposition ) );", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1080:1: rule__Decomposition__Alternatives : ( ( ruleAndDecomposition ) | ( ruleOrDecomposition ) );", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1085:1: ( ruleAndDecomposition )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1085:1: ( ruleAndDecomposition )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1086:1: ruleAndDecomposition
                    {
                     before(grammarAccess.getDecompositionAccess().getAndDecompositionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleAndDecomposition_in_rule__Decomposition__Alternatives2374);
                    ruleAndDecomposition();
                    _fsp--;

                     after(grammarAccess.getDecompositionAccess().getAndDecompositionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1091:6: ( ruleOrDecomposition )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1091:6: ( ruleOrDecomposition )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1092:1: ruleOrDecomposition
                    {
                     before(grammarAccess.getDecompositionAccess().getOrDecompositionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleOrDecomposition_in_rule__Decomposition__Alternatives2391);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1102:1: rule__Contribution__Alternatives : ( ( ruleAndContribution ) | ( ruleOrContribution ) | ( ruleHelpContribution ) | ( ruleHurtContribution ) | ( ruleMakeContribution ) | ( ruleBreakContribution ) );
    public final void rule__Contribution__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1106:1: ( ( ruleAndContribution ) | ( ruleOrContribution ) | ( ruleHelpContribution ) | ( ruleHurtContribution ) | ( ruleMakeContribution ) | ( ruleBreakContribution ) )
            int alt8=6;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 49:
                    {
                    alt8=4;
                    }
                    break;
                case 45:
                    {
                    alt8=1;
                    }
                    break;
                case 50:
                    {
                    alt8=6;
                    }
                    break;
                case 48:
                    {
                    alt8=5;
                    }
                    break;
                case 46:
                    {
                    alt8=2;
                    }
                    break;
                case 47:
                    {
                    alt8=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("1102:1: rule__Contribution__Alternatives : ( ( ruleAndContribution ) | ( ruleOrContribution ) | ( ruleHelpContribution ) | ( ruleHurtContribution ) | ( ruleMakeContribution ) | ( ruleBreakContribution ) );", 8, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1102:1: rule__Contribution__Alternatives : ( ( ruleAndContribution ) | ( ruleOrContribution ) | ( ruleHelpContribution ) | ( ruleHurtContribution ) | ( ruleMakeContribution ) | ( ruleBreakContribution ) );", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1107:1: ( ruleAndContribution )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1107:1: ( ruleAndContribution )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1108:1: ruleAndContribution
                    {
                     before(grammarAccess.getContributionAccess().getAndContributionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleAndContribution_in_rule__Contribution__Alternatives2423);
                    ruleAndContribution();
                    _fsp--;

                     after(grammarAccess.getContributionAccess().getAndContributionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1113:6: ( ruleOrContribution )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1113:6: ( ruleOrContribution )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1114:1: ruleOrContribution
                    {
                     before(grammarAccess.getContributionAccess().getOrContributionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleOrContribution_in_rule__Contribution__Alternatives2440);
                    ruleOrContribution();
                    _fsp--;

                     after(grammarAccess.getContributionAccess().getOrContributionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1119:6: ( ruleHelpContribution )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1119:6: ( ruleHelpContribution )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1120:1: ruleHelpContribution
                    {
                     before(grammarAccess.getContributionAccess().getHelpContributionParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleHelpContribution_in_rule__Contribution__Alternatives2457);
                    ruleHelpContribution();
                    _fsp--;

                     after(grammarAccess.getContributionAccess().getHelpContributionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1125:6: ( ruleHurtContribution )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1125:6: ( ruleHurtContribution )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1126:1: ruleHurtContribution
                    {
                     before(grammarAccess.getContributionAccess().getHurtContributionParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleHurtContribution_in_rule__Contribution__Alternatives2474);
                    ruleHurtContribution();
                    _fsp--;

                     after(grammarAccess.getContributionAccess().getHurtContributionParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1131:6: ( ruleMakeContribution )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1131:6: ( ruleMakeContribution )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1132:1: ruleMakeContribution
                    {
                     before(grammarAccess.getContributionAccess().getMakeContributionParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleMakeContribution_in_rule__Contribution__Alternatives2491);
                    ruleMakeContribution();
                    _fsp--;

                     after(grammarAccess.getContributionAccess().getMakeContributionParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1137:6: ( ruleBreakContribution )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1137:6: ( ruleBreakContribution )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1138:1: ruleBreakContribution
                    {
                     before(grammarAccess.getContributionAccess().getBreakContributionParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleBreakContribution_in_rule__Contribution__Alternatives2508);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1148:1: rule__NodeType__Alternatives : ( ( ( 'R' ) ) | ( ( 'M' ) ) | ( ( 'B' ) ) | ( ( 'X' ) ) | ( ( 'C' ) ) | ( ( 'D' ) ) | ( ( 'P' ) ) );
    public final void rule__NodeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1152:1: ( ( ( 'R' ) ) | ( ( 'M' ) ) | ( ( 'B' ) ) | ( ( 'X' ) ) | ( ( 'C' ) ) | ( ( 'D' ) ) | ( ( 'P' ) ) )
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
                    new NoViableAltException("1148:1: rule__NodeType__Alternatives : ( ( ( 'R' ) ) | ( ( 'M' ) ) | ( ( 'B' ) ) | ( ( 'X' ) ) | ( ( 'C' ) ) | ( ( 'D' ) ) | ( ( 'P' ) ) );", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1153:1: ( ( 'R' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1153:1: ( ( 'R' ) )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1154:1: ( 'R' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getREQUIREMENTEnumLiteralDeclaration_0()); 
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1155:1: ( 'R' )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1155:3: 'R'
                    {
                    match(input,11,FOLLOW_11_in_rule__NodeType__Alternatives2541); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getREQUIREMENTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1160:6: ( ( 'M' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1160:6: ( ( 'M' ) )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1161:1: ( 'M' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getMACHINEEnumLiteralDeclaration_1()); 
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1162:1: ( 'M' )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1162:3: 'M'
                    {
                    match(input,12,FOLLOW_12_in_rule__NodeType__Alternatives2562); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getMACHINEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1167:6: ( ( 'B' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1167:6: ( ( 'B' ) )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1168:1: ( 'B' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getBIDDABLEEnumLiteralDeclaration_2()); 
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1169:1: ( 'B' )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1169:3: 'B'
                    {
                    match(input,13,FOLLOW_13_in_rule__NodeType__Alternatives2583); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getBIDDABLEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1174:6: ( ( 'X' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1174:6: ( ( 'X' ) )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1175:1: ( 'X' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getLEXICALEnumLiteralDeclaration_3()); 
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1176:1: ( 'X' )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1176:3: 'X'
                    {
                    match(input,14,FOLLOW_14_in_rule__NodeType__Alternatives2604); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getLEXICALEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1181:6: ( ( 'C' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1181:6: ( ( 'C' ) )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1182:1: ( 'C' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getCAUSALEnumLiteralDeclaration_4()); 
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1183:1: ( 'C' )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1183:3: 'C'
                    {
                    match(input,15,FOLLOW_15_in_rule__NodeType__Alternatives2625); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getCAUSALEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1188:6: ( ( 'D' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1188:6: ( ( 'D' ) )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1189:1: ( 'D' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getDESIGNEDEnumLiteralDeclaration_5()); 
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1190:1: ( 'D' )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1190:3: 'D'
                    {
                    match(input,16,FOLLOW_16_in_rule__NodeType__Alternatives2646); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getDESIGNEDEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1195:6: ( ( 'P' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1195:6: ( ( 'P' ) )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1196:1: ( 'P' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getPHYSICALEnumLiteralDeclaration_6()); 
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1197:1: ( 'P' )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1197:3: 'P'
                    {
                    match(input,17,FOLLOW_17_in_rule__NodeType__Alternatives2667); 

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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1207:1: rule__PhenomenonType__Alternatives : ( ( ( 'phenomenon' ) ) | ( ( 'event' ) ) | ( ( 'state' ) ) );
    public final void rule__PhenomenonType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1211:1: ( ( ( 'phenomenon' ) ) | ( ( 'event' ) ) | ( ( 'state' ) ) )
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
                    new NoViableAltException("1207:1: rule__PhenomenonType__Alternatives : ( ( ( 'phenomenon' ) ) | ( ( 'event' ) ) | ( ( 'state' ) ) );", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1212:1: ( ( 'phenomenon' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1212:1: ( ( 'phenomenon' ) )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1213:1: ( 'phenomenon' )
                    {
                     before(grammarAccess.getPhenomenonTypeAccess().getUNSPECIFIEDEnumLiteralDeclaration_0()); 
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1214:1: ( 'phenomenon' )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1214:3: 'phenomenon'
                    {
                    match(input,18,FOLLOW_18_in_rule__PhenomenonType__Alternatives2703); 

                    }

                     after(grammarAccess.getPhenomenonTypeAccess().getUNSPECIFIEDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1219:6: ( ( 'event' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1219:6: ( ( 'event' ) )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1220:1: ( 'event' )
                    {
                     before(grammarAccess.getPhenomenonTypeAccess().getEVENTEnumLiteralDeclaration_1()); 
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1221:1: ( 'event' )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1221:3: 'event'
                    {
                    match(input,19,FOLLOW_19_in_rule__PhenomenonType__Alternatives2724); 

                    }

                     after(grammarAccess.getPhenomenonTypeAccess().getEVENTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1226:6: ( ( 'state' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1226:6: ( ( 'state' ) )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1227:1: ( 'state' )
                    {
                     before(grammarAccess.getPhenomenonTypeAccess().getSTATEEnumLiteralDeclaration_2()); 
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1228:1: ( 'state' )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1228:3: 'state'
                    {
                    match(input,20,FOLLOW_20_in_rule__PhenomenonType__Alternatives2745); 

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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1238:1: rule__LinkType__Alternatives : ( ( ( '->' ) ) | ( ( '~~' ) ) | ( ( '~>' ) ) );
    public final void rule__LinkType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1242:1: ( ( ( '->' ) ) | ( ( '~~' ) ) | ( ( '~>' ) ) )
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
                    new NoViableAltException("1238:1: rule__LinkType__Alternatives : ( ( ( '->' ) ) | ( ( '~~' ) ) | ( ( '~>' ) ) );", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1243:1: ( ( '->' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1243:1: ( ( '->' ) )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1244:1: ( '->' )
                    {
                     before(grammarAccess.getLinkTypeAccess().getINTERFACEEnumLiteralDeclaration_0()); 
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1245:1: ( '->' )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1245:3: '->'
                    {
                    match(input,21,FOLLOW_21_in_rule__LinkType__Alternatives2781); 

                    }

                     after(grammarAccess.getLinkTypeAccess().getINTERFACEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1250:6: ( ( '~~' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1250:6: ( ( '~~' ) )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1251:1: ( '~~' )
                    {
                     before(grammarAccess.getLinkTypeAccess().getREFERENCEEnumLiteralDeclaration_1()); 
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1252:1: ( '~~' )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1252:3: '~~'
                    {
                    match(input,22,FOLLOW_22_in_rule__LinkType__Alternatives2802); 

                    }

                     after(grammarAccess.getLinkTypeAccess().getREFERENCEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1257:6: ( ( '~>' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1257:6: ( ( '~>' ) )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1258:1: ( '~>' )
                    {
                     before(grammarAccess.getLinkTypeAccess().getCONSTRAINTEnumLiteralDeclaration_2()); 
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1259:1: ( '~>' )
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1259:3: '~>'
                    {
                    match(input,23,FOLLOW_23_in_rule__LinkType__Alternatives2823); 

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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1271:1: rule__ProblemDiagram__Group__0 : ( ( rule__ProblemDiagram__Group_0__0 )? ) rule__ProblemDiagram__Group__1 ;
    public final void rule__ProblemDiagram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1275:1: ( ( ( rule__ProblemDiagram__Group_0__0 )? ) rule__ProblemDiagram__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1276:1: ( ( rule__ProblemDiagram__Group_0__0 )? ) rule__ProblemDiagram__Group__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1276:1: ( ( rule__ProblemDiagram__Group_0__0 )? )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1277:1: ( rule__ProblemDiagram__Group_0__0 )?
            {
             before(grammarAccess.getProblemDiagramAccess().getGroup_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1278:1: ( rule__ProblemDiagram__Group_0__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1278:2: rule__ProblemDiagram__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__ProblemDiagram__Group_0__0_in_rule__ProblemDiagram__Group__02860);
                    rule__ProblemDiagram__Group_0__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProblemDiagramAccess().getGroup_0()); 

            }

            pushFollow(FOLLOW_rule__ProblemDiagram__Group__1_in_rule__ProblemDiagram__Group__02870);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1289:1: rule__ProblemDiagram__Group__1 : ( ( rule__ProblemDiagram__Alternatives_1 )* ) ;
    public final void rule__ProblemDiagram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1293:1: ( ( ( rule__ProblemDiagram__Alternatives_1 )* ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1294:1: ( ( rule__ProblemDiagram__Alternatives_1 )* )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1294:1: ( ( rule__ProblemDiagram__Alternatives_1 )* )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1295:1: ( rule__ProblemDiagram__Alternatives_1 )*
            {
             before(grammarAccess.getProblemDiagramAccess().getAlternatives_1()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1296:1: ( rule__ProblemDiagram__Alternatives_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1296:2: rule__ProblemDiagram__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_rule__ProblemDiagram__Alternatives_1_in_rule__ProblemDiagram__Group__12898);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1310:1: rule__ProblemDiagram__Group_0__0 : ( 'problem' ) rule__ProblemDiagram__Group_0__1 ;
    public final void rule__ProblemDiagram__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1314:1: ( ( 'problem' ) rule__ProblemDiagram__Group_0__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1315:1: ( 'problem' ) rule__ProblemDiagram__Group_0__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1315:1: ( 'problem' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1316:1: 'problem'
            {
             before(grammarAccess.getProblemDiagramAccess().getProblemKeyword_0_0()); 
            match(input,24,FOLLOW_24_in_rule__ProblemDiagram__Group_0__02938); 
             after(grammarAccess.getProblemDiagramAccess().getProblemKeyword_0_0()); 

            }

            pushFollow(FOLLOW_rule__ProblemDiagram__Group_0__1_in_rule__ProblemDiagram__Group_0__02948);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1330:1: rule__ProblemDiagram__Group_0__1 : ( ':' ) rule__ProblemDiagram__Group_0__2 ;
    public final void rule__ProblemDiagram__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1334:1: ( ( ':' ) rule__ProblemDiagram__Group_0__2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1335:1: ( ':' ) rule__ProblemDiagram__Group_0__2
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1335:1: ( ':' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1336:1: ':'
            {
             before(grammarAccess.getProblemDiagramAccess().getColonKeyword_0_1()); 
            match(input,25,FOLLOW_25_in_rule__ProblemDiagram__Group_0__12977); 
             after(grammarAccess.getProblemDiagramAccess().getColonKeyword_0_1()); 

            }

            pushFollow(FOLLOW_rule__ProblemDiagram__Group_0__2_in_rule__ProblemDiagram__Group_0__12987);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1350:1: rule__ProblemDiagram__Group_0__2 : ( ( rule__ProblemDiagram__DescriptionAssignment_0_2 ) ) ;
    public final void rule__ProblemDiagram__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1354:1: ( ( ( rule__ProblemDiagram__DescriptionAssignment_0_2 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1355:1: ( ( rule__ProblemDiagram__DescriptionAssignment_0_2 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1355:1: ( ( rule__ProblemDiagram__DescriptionAssignment_0_2 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1356:1: ( rule__ProblemDiagram__DescriptionAssignment_0_2 )
            {
             before(grammarAccess.getProblemDiagramAccess().getDescriptionAssignment_0_2()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1357:1: ( rule__ProblemDiagram__DescriptionAssignment_0_2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1357:2: rule__ProblemDiagram__DescriptionAssignment_0_2
            {
            pushFollow(FOLLOW_rule__ProblemDiagram__DescriptionAssignment_0_2_in_rule__ProblemDiagram__Group_0__23015);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1373:1: rule__Node__Group__0 : ( ( rule__Node__NameAssignment_0 ) ) rule__Node__Group__1 ;
    public final void rule__Node__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1377:1: ( ( ( rule__Node__NameAssignment_0 ) ) rule__Node__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1378:1: ( ( rule__Node__NameAssignment_0 ) ) rule__Node__Group__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1378:1: ( ( rule__Node__NameAssignment_0 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1379:1: ( rule__Node__NameAssignment_0 )
            {
             before(grammarAccess.getNodeAccess().getNameAssignment_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1380:1: ( rule__Node__NameAssignment_0 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1380:2: rule__Node__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Node__NameAssignment_0_in_rule__Node__Group__03055);
            rule__Node__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getNodeAccess().getNameAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Node__Group__1_in_rule__Node__Group__03064);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1391:1: rule__Node__Group__1 : ( ( rule__Node__TypeAssignment_1 )? ) rule__Node__Group__2 ;
    public final void rule__Node__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1395:1: ( ( ( rule__Node__TypeAssignment_1 )? ) rule__Node__Group__2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1396:1: ( ( rule__Node__TypeAssignment_1 )? ) rule__Node__Group__2
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1396:1: ( ( rule__Node__TypeAssignment_1 )? )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1397:1: ( rule__Node__TypeAssignment_1 )?
            {
             before(grammarAccess.getNodeAccess().getTypeAssignment_1()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1398:1: ( rule__Node__TypeAssignment_1 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=11 && LA14_0<=17)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1398:2: rule__Node__TypeAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Node__TypeAssignment_1_in_rule__Node__Group__13092);
                    rule__Node__TypeAssignment_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNodeAccess().getTypeAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Node__Group__2_in_rule__Node__Group__13102);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1409:1: rule__Node__Group__2 : ( ( rule__Node__Group_2__0 )? ) rule__Node__Group__3 ;
    public final void rule__Node__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1413:1: ( ( ( rule__Node__Group_2__0 )? ) rule__Node__Group__3 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1414:1: ( ( rule__Node__Group_2__0 )? ) rule__Node__Group__3
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1414:1: ( ( rule__Node__Group_2__0 )? )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1415:1: ( rule__Node__Group_2__0 )?
            {
             before(grammarAccess.getNodeAccess().getGroup_2()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1416:1: ( rule__Node__Group_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1416:2: rule__Node__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Node__Group_2__0_in_rule__Node__Group__23130);
                    rule__Node__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNodeAccess().getGroup_2()); 

            }

            pushFollow(FOLLOW_rule__Node__Group__3_in_rule__Node__Group__23140);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1427:1: rule__Node__Group__3 : ( ( rule__Node__Group_3__0 )? ) ;
    public final void rule__Node__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1431:1: ( ( ( rule__Node__Group_3__0 )? ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1432:1: ( ( rule__Node__Group_3__0 )? )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1432:1: ( ( rule__Node__Group_3__0 )? )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1433:1: ( rule__Node__Group_3__0 )?
            {
             before(grammarAccess.getNodeAccess().getGroup_3()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1434:1: ( rule__Node__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1434:2: rule__Node__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Node__Group_3__0_in_rule__Node__Group__33168);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1452:1: rule__Node__Group_2__0 : ( ':' ) rule__Node__Group_2__1 ;
    public final void rule__Node__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1456:1: ( ( ':' ) rule__Node__Group_2__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1457:1: ( ':' ) rule__Node__Group_2__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1457:1: ( ':' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1458:1: ':'
            {
             before(grammarAccess.getNodeAccess().getColonKeyword_2_0()); 
            match(input,25,FOLLOW_25_in_rule__Node__Group_2__03212); 
             after(grammarAccess.getNodeAccess().getColonKeyword_2_0()); 

            }

            pushFollow(FOLLOW_rule__Node__Group_2__1_in_rule__Node__Group_2__03222);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1472:1: rule__Node__Group_2__1 : ( ( rule__Node__DescriptionAssignment_2_1 ) ) ;
    public final void rule__Node__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1476:1: ( ( ( rule__Node__DescriptionAssignment_2_1 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1477:1: ( ( rule__Node__DescriptionAssignment_2_1 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1477:1: ( ( rule__Node__DescriptionAssignment_2_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1478:1: ( rule__Node__DescriptionAssignment_2_1 )
            {
             before(grammarAccess.getNodeAccess().getDescriptionAssignment_2_1()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1479:1: ( rule__Node__DescriptionAssignment_2_1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1479:2: rule__Node__DescriptionAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Node__DescriptionAssignment_2_1_in_rule__Node__Group_2__13250);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1493:1: rule__Node__Group_3__0 : ( '{' ) rule__Node__Group_3__1 ;
    public final void rule__Node__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1497:1: ( ( '{' ) rule__Node__Group_3__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1498:1: ( '{' ) rule__Node__Group_3__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1498:1: ( '{' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1499:1: '{'
            {
             before(grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,26,FOLLOW_26_in_rule__Node__Group_3__03289); 
             after(grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_3_0()); 

            }

            pushFollow(FOLLOW_rule__Node__Group_3__1_in_rule__Node__Group_3__03299);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1513:1: rule__Node__Group_3__1 : ( ( rule__Node__Alternatives_3_1 ) ) rule__Node__Group_3__2 ;
    public final void rule__Node__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1517:1: ( ( ( rule__Node__Alternatives_3_1 ) ) rule__Node__Group_3__2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1518:1: ( ( rule__Node__Alternatives_3_1 ) ) rule__Node__Group_3__2
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1518:1: ( ( rule__Node__Alternatives_3_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1519:1: ( rule__Node__Alternatives_3_1 )
            {
             before(grammarAccess.getNodeAccess().getAlternatives_3_1()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1520:1: ( rule__Node__Alternatives_3_1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1520:2: rule__Node__Alternatives_3_1
            {
            pushFollow(FOLLOW_rule__Node__Alternatives_3_1_in_rule__Node__Group_3__13327);
            rule__Node__Alternatives_3_1();
            _fsp--;


            }

             after(grammarAccess.getNodeAccess().getAlternatives_3_1()); 

            }

            pushFollow(FOLLOW_rule__Node__Group_3__2_in_rule__Node__Group_3__13336);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1531:1: rule__Node__Group_3__2 : ( '}' ) ;
    public final void rule__Node__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1535:1: ( ( '}' ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1536:1: ( '}' )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1536:1: ( '}' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1537:1: '}'
            {
             before(grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_3_2()); 
            match(input,27,FOLLOW_27_in_rule__Node__Group_3__23365); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1556:1: rule__Node__Group_3_1_1__0 : ( 'see' ) rule__Node__Group_3_1_1__1 ;
    public final void rule__Node__Group_3_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1560:1: ( ( 'see' ) rule__Node__Group_3_1_1__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1561:1: ( 'see' ) rule__Node__Group_3_1_1__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1561:1: ( 'see' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1562:1: 'see'
            {
             before(grammarAccess.getNodeAccess().getSeeKeyword_3_1_1_0()); 
            match(input,28,FOLLOW_28_in_rule__Node__Group_3_1_1__03407); 
             after(grammarAccess.getNodeAccess().getSeeKeyword_3_1_1_0()); 

            }

            pushFollow(FOLLOW_rule__Node__Group_3_1_1__1_in_rule__Node__Group_3_1_1__03417);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1576:1: rule__Node__Group_3_1_1__1 : ( 'domain' ) rule__Node__Group_3_1_1__2 ;
    public final void rule__Node__Group_3_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1580:1: ( ( 'domain' ) rule__Node__Group_3_1_1__2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1581:1: ( 'domain' ) rule__Node__Group_3_1_1__2
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1581:1: ( 'domain' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1582:1: 'domain'
            {
             before(grammarAccess.getNodeAccess().getDomainKeyword_3_1_1_1()); 
            match(input,29,FOLLOW_29_in_rule__Node__Group_3_1_1__13446); 
             after(grammarAccess.getNodeAccess().getDomainKeyword_3_1_1_1()); 

            }

            pushFollow(FOLLOW_rule__Node__Group_3_1_1__2_in_rule__Node__Group_3_1_1__13456);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1596:1: rule__Node__Group_3_1_1__2 : ( ( rule__Node__ProblemRefAssignment_3_1_1_2 ) ) ;
    public final void rule__Node__Group_3_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1600:1: ( ( ( rule__Node__ProblemRefAssignment_3_1_1_2 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1601:1: ( ( rule__Node__ProblemRefAssignment_3_1_1_2 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1601:1: ( ( rule__Node__ProblemRefAssignment_3_1_1_2 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1602:1: ( rule__Node__ProblemRefAssignment_3_1_1_2 )
            {
             before(grammarAccess.getNodeAccess().getProblemRefAssignment_3_1_1_2()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1603:1: ( rule__Node__ProblemRefAssignment_3_1_1_2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1603:2: rule__Node__ProblemRefAssignment_3_1_1_2
            {
            pushFollow(FOLLOW_rule__Node__ProblemRefAssignment_3_1_1_2_in_rule__Node__Group_3_1_1__23484);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1619:1: rule__Node__Group_3_1_3__0 : ( 'see' ) rule__Node__Group_3_1_3__1 ;
    public final void rule__Node__Group_3_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1623:1: ( ( 'see' ) rule__Node__Group_3_1_3__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1624:1: ( 'see' ) rule__Node__Group_3_1_3__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1624:1: ( 'see' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1625:1: 'see'
            {
             before(grammarAccess.getNodeAccess().getSeeKeyword_3_1_3_0()); 
            match(input,28,FOLLOW_28_in_rule__Node__Group_3_1_3__03525); 
             after(grammarAccess.getNodeAccess().getSeeKeyword_3_1_3_0()); 

            }

            pushFollow(FOLLOW_rule__Node__Group_3_1_3__1_in_rule__Node__Group_3_1_3__03535);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1639:1: rule__Node__Group_3_1_3__1 : ( 'intention' ) rule__Node__Group_3_1_3__2 ;
    public final void rule__Node__Group_3_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1643:1: ( ( 'intention' ) rule__Node__Group_3_1_3__2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1644:1: ( 'intention' ) rule__Node__Group_3_1_3__2
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1644:1: ( 'intention' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1645:1: 'intention'
            {
             before(grammarAccess.getNodeAccess().getIntentionKeyword_3_1_3_1()); 
            match(input,30,FOLLOW_30_in_rule__Node__Group_3_1_3__13564); 
             after(grammarAccess.getNodeAccess().getIntentionKeyword_3_1_3_1()); 

            }

            pushFollow(FOLLOW_rule__Node__Group_3_1_3__2_in_rule__Node__Group_3_1_3__13574);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1659:1: rule__Node__Group_3_1_3__2 : ( ( rule__Node__IstarRefAssignment_3_1_3_2 ) ) ;
    public final void rule__Node__Group_3_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1663:1: ( ( ( rule__Node__IstarRefAssignment_3_1_3_2 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1664:1: ( ( rule__Node__IstarRefAssignment_3_1_3_2 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1664:1: ( ( rule__Node__IstarRefAssignment_3_1_3_2 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1665:1: ( rule__Node__IstarRefAssignment_3_1_3_2 )
            {
             before(grammarAccess.getNodeAccess().getIstarRefAssignment_3_1_3_2()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1666:1: ( rule__Node__IstarRefAssignment_3_1_3_2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1666:2: rule__Node__IstarRefAssignment_3_1_3_2
            {
            pushFollow(FOLLOW_rule__Node__IstarRefAssignment_3_1_3_2_in_rule__Node__Group_3_1_3__23602);
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


    // $ANTLR start rule__Node__Group_3_1_4__0
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1682:1: rule__Node__Group_3_1_4__0 : ( ( rule__Node__HiddenPhenomenaAssignment_3_1_4_0 ) ) rule__Node__Group_3_1_4__1 ;
    public final void rule__Node__Group_3_1_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1686:1: ( ( ( rule__Node__HiddenPhenomenaAssignment_3_1_4_0 ) ) rule__Node__Group_3_1_4__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1687:1: ( ( rule__Node__HiddenPhenomenaAssignment_3_1_4_0 ) ) rule__Node__Group_3_1_4__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1687:1: ( ( rule__Node__HiddenPhenomenaAssignment_3_1_4_0 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1688:1: ( rule__Node__HiddenPhenomenaAssignment_3_1_4_0 )
            {
             before(grammarAccess.getNodeAccess().getHiddenPhenomenaAssignment_3_1_4_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1689:1: ( rule__Node__HiddenPhenomenaAssignment_3_1_4_0 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1689:2: rule__Node__HiddenPhenomenaAssignment_3_1_4_0
            {
            pushFollow(FOLLOW_rule__Node__HiddenPhenomenaAssignment_3_1_4_0_in_rule__Node__Group_3_1_4__03642);
            rule__Node__HiddenPhenomenaAssignment_3_1_4_0();
            _fsp--;


            }

             after(grammarAccess.getNodeAccess().getHiddenPhenomenaAssignment_3_1_4_0()); 

            }

            pushFollow(FOLLOW_rule__Node__Group_3_1_4__1_in_rule__Node__Group_3_1_4__03651);
            rule__Node__Group_3_1_4__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__Group_3_1_4__0


    // $ANTLR start rule__Node__Group_3_1_4__1
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1700:1: rule__Node__Group_3_1_4__1 : ( ( rule__Node__Group_3_1_4_1__0 )* ) ;
    public final void rule__Node__Group_3_1_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1704:1: ( ( ( rule__Node__Group_3_1_4_1__0 )* ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1705:1: ( ( rule__Node__Group_3_1_4_1__0 )* )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1705:1: ( ( rule__Node__Group_3_1_4_1__0 )* )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1706:1: ( rule__Node__Group_3_1_4_1__0 )*
            {
             before(grammarAccess.getNodeAccess().getGroup_3_1_4_1()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1707:1: ( rule__Node__Group_3_1_4_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==31) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1707:2: rule__Node__Group_3_1_4_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Node__Group_3_1_4_1__0_in_rule__Node__Group_3_1_4__13679);
            	    rule__Node__Group_3_1_4_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getNodeAccess().getGroup_3_1_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__Group_3_1_4__1


    // $ANTLR start rule__Node__Group_3_1_4_1__0
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1721:1: rule__Node__Group_3_1_4_1__0 : ( ',' ) rule__Node__Group_3_1_4_1__1 ;
    public final void rule__Node__Group_3_1_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1725:1: ( ( ',' ) rule__Node__Group_3_1_4_1__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1726:1: ( ',' ) rule__Node__Group_3_1_4_1__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1726:1: ( ',' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1727:1: ','
            {
             before(grammarAccess.getNodeAccess().getCommaKeyword_3_1_4_1_0()); 
            match(input,31,FOLLOW_31_in_rule__Node__Group_3_1_4_1__03719); 
             after(grammarAccess.getNodeAccess().getCommaKeyword_3_1_4_1_0()); 

            }

            pushFollow(FOLLOW_rule__Node__Group_3_1_4_1__1_in_rule__Node__Group_3_1_4_1__03729);
            rule__Node__Group_3_1_4_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__Group_3_1_4_1__0


    // $ANTLR start rule__Node__Group_3_1_4_1__1
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1741:1: rule__Node__Group_3_1_4_1__1 : ( ( rule__Node__HiddenPhenomenaAssignment_3_1_4_1_1 ) ) ;
    public final void rule__Node__Group_3_1_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1745:1: ( ( ( rule__Node__HiddenPhenomenaAssignment_3_1_4_1_1 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1746:1: ( ( rule__Node__HiddenPhenomenaAssignment_3_1_4_1_1 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1746:1: ( ( rule__Node__HiddenPhenomenaAssignment_3_1_4_1_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1747:1: ( rule__Node__HiddenPhenomenaAssignment_3_1_4_1_1 )
            {
             before(grammarAccess.getNodeAccess().getHiddenPhenomenaAssignment_3_1_4_1_1()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1748:1: ( rule__Node__HiddenPhenomenaAssignment_3_1_4_1_1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1748:2: rule__Node__HiddenPhenomenaAssignment_3_1_4_1_1
            {
            pushFollow(FOLLOW_rule__Node__HiddenPhenomenaAssignment_3_1_4_1_1_in_rule__Node__Group_3_1_4_1__13757);
            rule__Node__HiddenPhenomenaAssignment_3_1_4_1_1();
            _fsp--;


            }

             after(grammarAccess.getNodeAccess().getHiddenPhenomenaAssignment_3_1_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__Group_3_1_4_1__1


    // $ANTLR start rule__Phenomenon__Group__0
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1762:1: rule__Phenomenon__Group__0 : ( ( rule__Phenomenon__TypeAssignment_0 )? ) rule__Phenomenon__Group__1 ;
    public final void rule__Phenomenon__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1766:1: ( ( ( rule__Phenomenon__TypeAssignment_0 )? ) rule__Phenomenon__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1767:1: ( ( rule__Phenomenon__TypeAssignment_0 )? ) rule__Phenomenon__Group__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1767:1: ( ( rule__Phenomenon__TypeAssignment_0 )? )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1768:1: ( rule__Phenomenon__TypeAssignment_0 )?
            {
             before(grammarAccess.getPhenomenonAccess().getTypeAssignment_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1769:1: ( rule__Phenomenon__TypeAssignment_0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=18 && LA18_0<=20)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1769:2: rule__Phenomenon__TypeAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Phenomenon__TypeAssignment_0_in_rule__Phenomenon__Group__03795);
                    rule__Phenomenon__TypeAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPhenomenonAccess().getTypeAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Phenomenon__Group__1_in_rule__Phenomenon__Group__03805);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1780:1: rule__Phenomenon__Group__1 : ( ( rule__Phenomenon__NameAssignment_1 ) ) rule__Phenomenon__Group__2 ;
    public final void rule__Phenomenon__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1784:1: ( ( ( rule__Phenomenon__NameAssignment_1 ) ) rule__Phenomenon__Group__2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1785:1: ( ( rule__Phenomenon__NameAssignment_1 ) ) rule__Phenomenon__Group__2
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1785:1: ( ( rule__Phenomenon__NameAssignment_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1786:1: ( rule__Phenomenon__NameAssignment_1 )
            {
             before(grammarAccess.getPhenomenonAccess().getNameAssignment_1()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1787:1: ( rule__Phenomenon__NameAssignment_1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1787:2: rule__Phenomenon__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Phenomenon__NameAssignment_1_in_rule__Phenomenon__Group__13833);
            rule__Phenomenon__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getPhenomenonAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Phenomenon__Group__2_in_rule__Phenomenon__Group__13842);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1798:1: rule__Phenomenon__Group__2 : ( ( rule__Phenomenon__Group_2__0 )? ) ;
    public final void rule__Phenomenon__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1802:1: ( ( ( rule__Phenomenon__Group_2__0 )? ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1803:1: ( ( rule__Phenomenon__Group_2__0 )? )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1803:1: ( ( rule__Phenomenon__Group_2__0 )? )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1804:1: ( rule__Phenomenon__Group_2__0 )?
            {
             before(grammarAccess.getPhenomenonAccess().getGroup_2()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1805:1: ( rule__Phenomenon__Group_2__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==25) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1805:2: rule__Phenomenon__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Phenomenon__Group_2__0_in_rule__Phenomenon__Group__23870);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1821:1: rule__Phenomenon__Group_2__0 : ( ':' ) rule__Phenomenon__Group_2__1 ;
    public final void rule__Phenomenon__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1825:1: ( ( ':' ) rule__Phenomenon__Group_2__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1826:1: ( ':' ) rule__Phenomenon__Group_2__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1826:1: ( ':' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1827:1: ':'
            {
             before(grammarAccess.getPhenomenonAccess().getColonKeyword_2_0()); 
            match(input,25,FOLLOW_25_in_rule__Phenomenon__Group_2__03912); 
             after(grammarAccess.getPhenomenonAccess().getColonKeyword_2_0()); 

            }

            pushFollow(FOLLOW_rule__Phenomenon__Group_2__1_in_rule__Phenomenon__Group_2__03922);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1841:1: rule__Phenomenon__Group_2__1 : ( ( rule__Phenomenon__DescriptionAssignment_2_1 ) ) ;
    public final void rule__Phenomenon__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1845:1: ( ( ( rule__Phenomenon__DescriptionAssignment_2_1 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1846:1: ( ( rule__Phenomenon__DescriptionAssignment_2_1 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1846:1: ( ( rule__Phenomenon__DescriptionAssignment_2_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1847:1: ( rule__Phenomenon__DescriptionAssignment_2_1 )
            {
             before(grammarAccess.getPhenomenonAccess().getDescriptionAssignment_2_1()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1848:1: ( rule__Phenomenon__DescriptionAssignment_2_1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1848:2: rule__Phenomenon__DescriptionAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Phenomenon__DescriptionAssignment_2_1_in_rule__Phenomenon__Group_2__13950);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1862:1: rule__Link__Group__0 : ( ( rule__Link__FromAssignment_0 ) ) rule__Link__Group__1 ;
    public final void rule__Link__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1866:1: ( ( ( rule__Link__FromAssignment_0 ) ) rule__Link__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1867:1: ( ( rule__Link__FromAssignment_0 ) ) rule__Link__Group__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1867:1: ( ( rule__Link__FromAssignment_0 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1868:1: ( rule__Link__FromAssignment_0 )
            {
             before(grammarAccess.getLinkAccess().getFromAssignment_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1869:1: ( rule__Link__FromAssignment_0 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1869:2: rule__Link__FromAssignment_0
            {
            pushFollow(FOLLOW_rule__Link__FromAssignment_0_in_rule__Link__Group__03988);
            rule__Link__FromAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getLinkAccess().getFromAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Link__Group__1_in_rule__Link__Group__03997);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1880:1: rule__Link__Group__1 : ( ( rule__Link__TypeAssignment_1 ) ) rule__Link__Group__2 ;
    public final void rule__Link__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1884:1: ( ( ( rule__Link__TypeAssignment_1 ) ) rule__Link__Group__2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1885:1: ( ( rule__Link__TypeAssignment_1 ) ) rule__Link__Group__2
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1885:1: ( ( rule__Link__TypeAssignment_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1886:1: ( rule__Link__TypeAssignment_1 )
            {
             before(grammarAccess.getLinkAccess().getTypeAssignment_1()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1887:1: ( rule__Link__TypeAssignment_1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1887:2: rule__Link__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Link__TypeAssignment_1_in_rule__Link__Group__14025);
            rule__Link__TypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getLinkAccess().getTypeAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Link__Group__2_in_rule__Link__Group__14034);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1898:1: rule__Link__Group__2 : ( ( rule__Link__ToAssignment_2 ) ) rule__Link__Group__3 ;
    public final void rule__Link__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1902:1: ( ( ( rule__Link__ToAssignment_2 ) ) rule__Link__Group__3 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1903:1: ( ( rule__Link__ToAssignment_2 ) ) rule__Link__Group__3
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1903:1: ( ( rule__Link__ToAssignment_2 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1904:1: ( rule__Link__ToAssignment_2 )
            {
             before(grammarAccess.getLinkAccess().getToAssignment_2()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1905:1: ( rule__Link__ToAssignment_2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1905:2: rule__Link__ToAssignment_2
            {
            pushFollow(FOLLOW_rule__Link__ToAssignment_2_in_rule__Link__Group__24062);
            rule__Link__ToAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getLinkAccess().getToAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__Link__Group__3_in_rule__Link__Group__24071);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1916:1: rule__Link__Group__3 : ( ( rule__Link__Group_3__0 )? ) rule__Link__Group__4 ;
    public final void rule__Link__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1920:1: ( ( ( rule__Link__Group_3__0 )? ) rule__Link__Group__4 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1921:1: ( ( rule__Link__Group_3__0 )? ) rule__Link__Group__4
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1921:1: ( ( rule__Link__Group_3__0 )? )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1922:1: ( rule__Link__Group_3__0 )?
            {
             before(grammarAccess.getLinkAccess().getGroup_3()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1923:1: ( rule__Link__Group_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==26) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1923:2: rule__Link__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Link__Group_3__0_in_rule__Link__Group__34099);
                    rule__Link__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLinkAccess().getGroup_3()); 

            }

            pushFollow(FOLLOW_rule__Link__Group__4_in_rule__Link__Group__34109);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1934:1: rule__Link__Group__4 : ( ( rule__Link__Group_4__0 )? ) ;
    public final void rule__Link__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1938:1: ( ( ( rule__Link__Group_4__0 )? ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1939:1: ( ( rule__Link__Group_4__0 )? )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1939:1: ( ( rule__Link__Group_4__0 )? )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1940:1: ( rule__Link__Group_4__0 )?
            {
             before(grammarAccess.getLinkAccess().getGroup_4()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1941:1: ( rule__Link__Group_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==25) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1941:2: rule__Link__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Link__Group_4__0_in_rule__Link__Group__44137);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1961:1: rule__Link__Group_3__0 : ( '{' ) rule__Link__Group_3__1 ;
    public final void rule__Link__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1965:1: ( ( '{' ) rule__Link__Group_3__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1966:1: ( '{' ) rule__Link__Group_3__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1966:1: ( '{' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1967:1: '{'
            {
             before(grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,26,FOLLOW_26_in_rule__Link__Group_3__04183); 
             after(grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_3_0()); 

            }

            pushFollow(FOLLOW_rule__Link__Group_3__1_in_rule__Link__Group_3__04193);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1981:1: rule__Link__Group_3__1 : ( ( rule__Link__PhenomenaAssignment_3_1 ) ) rule__Link__Group_3__2 ;
    public final void rule__Link__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1985:1: ( ( ( rule__Link__PhenomenaAssignment_3_1 ) ) rule__Link__Group_3__2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1986:1: ( ( rule__Link__PhenomenaAssignment_3_1 ) ) rule__Link__Group_3__2
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1986:1: ( ( rule__Link__PhenomenaAssignment_3_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1987:1: ( rule__Link__PhenomenaAssignment_3_1 )
            {
             before(grammarAccess.getLinkAccess().getPhenomenaAssignment_3_1()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1988:1: ( rule__Link__PhenomenaAssignment_3_1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1988:2: rule__Link__PhenomenaAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Link__PhenomenaAssignment_3_1_in_rule__Link__Group_3__14221);
            rule__Link__PhenomenaAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getLinkAccess().getPhenomenaAssignment_3_1()); 

            }

            pushFollow(FOLLOW_rule__Link__Group_3__2_in_rule__Link__Group_3__14230);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1999:1: rule__Link__Group_3__2 : ( ( rule__Link__Group_3_2__0 )* ) rule__Link__Group_3__3 ;
    public final void rule__Link__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2003:1: ( ( ( rule__Link__Group_3_2__0 )* ) rule__Link__Group_3__3 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2004:1: ( ( rule__Link__Group_3_2__0 )* ) rule__Link__Group_3__3
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2004:1: ( ( rule__Link__Group_3_2__0 )* )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2005:1: ( rule__Link__Group_3_2__0 )*
            {
             before(grammarAccess.getLinkAccess().getGroup_3_2()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2006:1: ( rule__Link__Group_3_2__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==31) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2006:2: rule__Link__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Link__Group_3_2__0_in_rule__Link__Group_3__24258);
            	    rule__Link__Group_3_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getLinkAccess().getGroup_3_2()); 

            }

            pushFollow(FOLLOW_rule__Link__Group_3__3_in_rule__Link__Group_3__24268);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2017:1: rule__Link__Group_3__3 : ( '}' ) ;
    public final void rule__Link__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2021:1: ( ( '}' ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2022:1: ( '}' )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2022:1: ( '}' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2023:1: '}'
            {
             before(grammarAccess.getLinkAccess().getRightCurlyBracketKeyword_3_3()); 
            match(input,27,FOLLOW_27_in_rule__Link__Group_3__34297); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2044:1: rule__Link__Group_3_2__0 : ( ',' ) rule__Link__Group_3_2__1 ;
    public final void rule__Link__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2048:1: ( ( ',' ) rule__Link__Group_3_2__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2049:1: ( ',' ) rule__Link__Group_3_2__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2049:1: ( ',' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2050:1: ','
            {
             before(grammarAccess.getLinkAccess().getCommaKeyword_3_2_0()); 
            match(input,31,FOLLOW_31_in_rule__Link__Group_3_2__04341); 
             after(grammarAccess.getLinkAccess().getCommaKeyword_3_2_0()); 

            }

            pushFollow(FOLLOW_rule__Link__Group_3_2__1_in_rule__Link__Group_3_2__04351);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2064:1: rule__Link__Group_3_2__1 : ( ( rule__Link__PhenomenaAssignment_3_2_1 ) ) ;
    public final void rule__Link__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2068:1: ( ( ( rule__Link__PhenomenaAssignment_3_2_1 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2069:1: ( ( rule__Link__PhenomenaAssignment_3_2_1 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2069:1: ( ( rule__Link__PhenomenaAssignment_3_2_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2070:1: ( rule__Link__PhenomenaAssignment_3_2_1 )
            {
             before(grammarAccess.getLinkAccess().getPhenomenaAssignment_3_2_1()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2071:1: ( rule__Link__PhenomenaAssignment_3_2_1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2071:2: rule__Link__PhenomenaAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__Link__PhenomenaAssignment_3_2_1_in_rule__Link__Group_3_2__14379);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2085:1: rule__Link__Group_4__0 : ( ':' ) rule__Link__Group_4__1 ;
    public final void rule__Link__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2089:1: ( ( ':' ) rule__Link__Group_4__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2090:1: ( ':' ) rule__Link__Group_4__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2090:1: ( ':' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2091:1: ':'
            {
             before(grammarAccess.getLinkAccess().getColonKeyword_4_0()); 
            match(input,25,FOLLOW_25_in_rule__Link__Group_4__04418); 
             after(grammarAccess.getLinkAccess().getColonKeyword_4_0()); 

            }

            pushFollow(FOLLOW_rule__Link__Group_4__1_in_rule__Link__Group_4__04428);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2105:1: rule__Link__Group_4__1 : ( ( rule__Link__DescriptionAssignment_4_1 ) ) ;
    public final void rule__Link__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2109:1: ( ( ( rule__Link__DescriptionAssignment_4_1 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2110:1: ( ( rule__Link__DescriptionAssignment_4_1 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2110:1: ( ( rule__Link__DescriptionAssignment_4_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2111:1: ( rule__Link__DescriptionAssignment_4_1 )
            {
             before(grammarAccess.getLinkAccess().getDescriptionAssignment_4_1()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2112:1: ( rule__Link__DescriptionAssignment_4_1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2112:2: rule__Link__DescriptionAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Link__DescriptionAssignment_4_1_in_rule__Link__Group_4__14456);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2126:1: rule__Model__Group__0 : ( 'istar' ) rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2130:1: ( ( 'istar' ) rule__Model__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2131:1: ( 'istar' ) rule__Model__Group__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2131:1: ( 'istar' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2132:1: 'istar'
            {
             before(grammarAccess.getModelAccess().getIstarKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__Model__Group__04495); 
             after(grammarAccess.getModelAccess().getIstarKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__04505);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2146:1: rule__Model__Group__1 : ( ( rule__Model__NameAssignment_1 )? ) rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2150:1: ( ( ( rule__Model__NameAssignment_1 )? ) rule__Model__Group__2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2151:1: ( ( rule__Model__NameAssignment_1 )? ) rule__Model__Group__2
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2151:1: ( ( rule__Model__NameAssignment_1 )? )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2152:1: ( rule__Model__NameAssignment_1 )?
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2153:1: ( rule__Model__NameAssignment_1 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2153:2: rule__Model__NameAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Model__NameAssignment_1_in_rule__Model__Group__14533);
                    rule__Model__NameAssignment_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__14543);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2164:1: rule__Model__Group__2 : ( ':' ) rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2168:1: ( ( ':' ) rule__Model__Group__3 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2169:1: ( ':' ) rule__Model__Group__3
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2169:1: ( ':' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2170:1: ':'
            {
             before(grammarAccess.getModelAccess().getColonKeyword_2()); 
            match(input,25,FOLLOW_25_in_rule__Model__Group__24572); 
             after(grammarAccess.getModelAccess().getColonKeyword_2()); 

            }

            pushFollow(FOLLOW_rule__Model__Group__3_in_rule__Model__Group__24582);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2184:1: rule__Model__Group__3 : ( ( rule__Model__Alternatives_3 )* ) ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2188:1: ( ( ( rule__Model__Alternatives_3 )* ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2189:1: ( ( rule__Model__Alternatives_3 )* )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2189:1: ( ( rule__Model__Alternatives_3 )* )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2190:1: ( rule__Model__Alternatives_3 )*
            {
             before(grammarAccess.getModelAccess().getAlternatives_3()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2191:1: ( rule__Model__Alternatives_3 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ID||(LA24_0>=33 && LA24_0<=41)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2191:2: rule__Model__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_rule__Model__Alternatives_3_in_rule__Model__Group__34610);
            	    rule__Model__Alternatives_3();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2209:1: rule__Actor__Group__0 : ( 'actor' ) rule__Actor__Group__1 ;
    public final void rule__Actor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2213:1: ( ( 'actor' ) rule__Actor__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2214:1: ( 'actor' ) rule__Actor__Group__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2214:1: ( 'actor' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2215:1: 'actor'
            {
             before(grammarAccess.getActorAccess().getActorKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__Actor__Group__04654); 
             after(grammarAccess.getActorAccess().getActorKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Actor__Group__1_in_rule__Actor__Group__04664);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2229:1: rule__Actor__Group__1 : ( ( rule__Actor__NameAssignment_1 ) ) rule__Actor__Group__2 ;
    public final void rule__Actor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2233:1: ( ( ( rule__Actor__NameAssignment_1 ) ) rule__Actor__Group__2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2234:1: ( ( rule__Actor__NameAssignment_1 ) ) rule__Actor__Group__2
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2234:1: ( ( rule__Actor__NameAssignment_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2235:1: ( rule__Actor__NameAssignment_1 )
            {
             before(grammarAccess.getActorAccess().getNameAssignment_1()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2236:1: ( rule__Actor__NameAssignment_1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2236:2: rule__Actor__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Actor__NameAssignment_1_in_rule__Actor__Group__14692);
            rule__Actor__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getActorAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Actor__Group__2_in_rule__Actor__Group__14701);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2247:1: rule__Actor__Group__2 : ( ( rule__Actor__Alternatives_2 )* ) rule__Actor__Group__3 ;
    public final void rule__Actor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2251:1: ( ( ( rule__Actor__Alternatives_2 )* ) rule__Actor__Group__3 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2252:1: ( ( rule__Actor__Alternatives_2 )* ) rule__Actor__Group__3
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2252:1: ( ( rule__Actor__Alternatives_2 )* )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2253:1: ( rule__Actor__Alternatives_2 )*
            {
             before(grammarAccess.getActorAccess().getAlternatives_2()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2254:1: ( rule__Actor__Alternatives_2 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID) ) {
                    int LA25_2 = input.LA(2);

                    if ( (LA25_2==EOF||LA25_2==RULE_ID||(LA25_2>=26 && LA25_2<=27)||(LA25_2>=33 && LA25_2<=41)) ) {
                        alt25=1;
                    }


                }


                switch (alt25) {
            	case 1 :
            	    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2254:2: rule__Actor__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_rule__Actor__Alternatives_2_in_rule__Actor__Group__24729);
            	    rule__Actor__Alternatives_2();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getActorAccess().getAlternatives_2()); 

            }

            pushFollow(FOLLOW_rule__Actor__Group__3_in_rule__Actor__Group__24739);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2265:1: rule__Actor__Group__3 : ( ( rule__Actor__Group_3__0 )? ) ;
    public final void rule__Actor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2269:1: ( ( ( rule__Actor__Group_3__0 )? ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2270:1: ( ( rule__Actor__Group_3__0 )? )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2270:1: ( ( rule__Actor__Group_3__0 )? )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2271:1: ( rule__Actor__Group_3__0 )?
            {
             before(grammarAccess.getActorAccess().getGroup_3()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2272:1: ( rule__Actor__Group_3__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==26) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2272:2: rule__Actor__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Actor__Group_3__0_in_rule__Actor__Group__34767);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2290:1: rule__Actor__Group_3__0 : ( '{' ) rule__Actor__Group_3__1 ;
    public final void rule__Actor__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2294:1: ( ( '{' ) rule__Actor__Group_3__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2295:1: ( '{' ) rule__Actor__Group_3__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2295:1: ( '{' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2296:1: '{'
            {
             before(grammarAccess.getActorAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,26,FOLLOW_26_in_rule__Actor__Group_3__04811); 
             after(grammarAccess.getActorAccess().getLeftCurlyBracketKeyword_3_0()); 

            }

            pushFollow(FOLLOW_rule__Actor__Group_3__1_in_rule__Actor__Group_3__04821);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2310:1: rule__Actor__Group_3__1 : ( ( rule__Actor__IntentionsAssignment_3_1 )* ) rule__Actor__Group_3__2 ;
    public final void rule__Actor__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2314:1: ( ( ( rule__Actor__IntentionsAssignment_3_1 )* ) rule__Actor__Group_3__2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2315:1: ( ( rule__Actor__IntentionsAssignment_3_1 )* ) rule__Actor__Group_3__2
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2315:1: ( ( rule__Actor__IntentionsAssignment_3_1 )* )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2316:1: ( rule__Actor__IntentionsAssignment_3_1 )*
            {
             before(grammarAccess.getActorAccess().getIntentionsAssignment_3_1()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2317:1: ( rule__Actor__IntentionsAssignment_3_1 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=37 && LA27_0<=41)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2317:2: rule__Actor__IntentionsAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_rule__Actor__IntentionsAssignment_3_1_in_rule__Actor__Group_3__14849);
            	    rule__Actor__IntentionsAssignment_3_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getActorAccess().getIntentionsAssignment_3_1()); 

            }

            pushFollow(FOLLOW_rule__Actor__Group_3__2_in_rule__Actor__Group_3__14859);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2328:1: rule__Actor__Group_3__2 : ( '}' ) ;
    public final void rule__Actor__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2332:1: ( ( '}' ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2333:1: ( '}' )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2333:1: ( '}' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2334:1: '}'
            {
             before(grammarAccess.getActorAccess().getRightCurlyBracketKeyword_3_2()); 
            match(input,27,FOLLOW_27_in_rule__Actor__Group_3__24888); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2353:1: rule__Agent__Group__0 : ( 'agent' ) rule__Agent__Group__1 ;
    public final void rule__Agent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2357:1: ( ( 'agent' ) rule__Agent__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2358:1: ( 'agent' ) rule__Agent__Group__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2358:1: ( 'agent' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2359:1: 'agent'
            {
             before(grammarAccess.getAgentAccess().getAgentKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__Agent__Group__04930); 
             after(grammarAccess.getAgentAccess().getAgentKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Agent__Group__1_in_rule__Agent__Group__04940);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2373:1: rule__Agent__Group__1 : ( ( rule__Agent__NameAssignment_1 ) ) rule__Agent__Group__2 ;
    public final void rule__Agent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2377:1: ( ( ( rule__Agent__NameAssignment_1 ) ) rule__Agent__Group__2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2378:1: ( ( rule__Agent__NameAssignment_1 ) ) rule__Agent__Group__2
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2378:1: ( ( rule__Agent__NameAssignment_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2379:1: ( rule__Agent__NameAssignment_1 )
            {
             before(grammarAccess.getAgentAccess().getNameAssignment_1()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2380:1: ( rule__Agent__NameAssignment_1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2380:2: rule__Agent__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Agent__NameAssignment_1_in_rule__Agent__Group__14968);
            rule__Agent__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getAgentAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Agent__Group__2_in_rule__Agent__Group__14977);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2391:1: rule__Agent__Group__2 : ( ( rule__Agent__Group_2__0 )? ) ;
    public final void rule__Agent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2395:1: ( ( ( rule__Agent__Group_2__0 )? ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2396:1: ( ( rule__Agent__Group_2__0 )? )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2396:1: ( ( rule__Agent__Group_2__0 )? )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2397:1: ( rule__Agent__Group_2__0 )?
            {
             before(grammarAccess.getAgentAccess().getGroup_2()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2398:1: ( rule__Agent__Group_2__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==26) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2398:2: rule__Agent__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Agent__Group_2__0_in_rule__Agent__Group__25005);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2414:1: rule__Agent__Group_2__0 : ( '{' ) rule__Agent__Group_2__1 ;
    public final void rule__Agent__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2418:1: ( ( '{' ) rule__Agent__Group_2__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2419:1: ( '{' ) rule__Agent__Group_2__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2419:1: ( '{' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2420:1: '{'
            {
             before(grammarAccess.getAgentAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,26,FOLLOW_26_in_rule__Agent__Group_2__05047); 
             after(grammarAccess.getAgentAccess().getLeftCurlyBracketKeyword_2_0()); 

            }

            pushFollow(FOLLOW_rule__Agent__Group_2__1_in_rule__Agent__Group_2__05057);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2434:1: rule__Agent__Group_2__1 : ( ( rule__Agent__IntentionsAssignment_2_1 )* ) rule__Agent__Group_2__2 ;
    public final void rule__Agent__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2438:1: ( ( ( rule__Agent__IntentionsAssignment_2_1 )* ) rule__Agent__Group_2__2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2439:1: ( ( rule__Agent__IntentionsAssignment_2_1 )* ) rule__Agent__Group_2__2
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2439:1: ( ( rule__Agent__IntentionsAssignment_2_1 )* )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2440:1: ( rule__Agent__IntentionsAssignment_2_1 )*
            {
             before(grammarAccess.getAgentAccess().getIntentionsAssignment_2_1()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2441:1: ( rule__Agent__IntentionsAssignment_2_1 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=37 && LA29_0<=41)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2441:2: rule__Agent__IntentionsAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_rule__Agent__IntentionsAssignment_2_1_in_rule__Agent__Group_2__15085);
            	    rule__Agent__IntentionsAssignment_2_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getAgentAccess().getIntentionsAssignment_2_1()); 

            }

            pushFollow(FOLLOW_rule__Agent__Group_2__2_in_rule__Agent__Group_2__15095);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2452:1: rule__Agent__Group_2__2 : ( '}' ) ;
    public final void rule__Agent__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2456:1: ( ( '}' ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2457:1: ( '}' )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2457:1: ( '}' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2458:1: '}'
            {
             before(grammarAccess.getAgentAccess().getRightCurlyBracketKeyword_2_2()); 
            match(input,27,FOLLOW_27_in_rule__Agent__Group_2__25124); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2477:1: rule__Role__Group__0 : ( 'role' ) rule__Role__Group__1 ;
    public final void rule__Role__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2481:1: ( ( 'role' ) rule__Role__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2482:1: ( 'role' ) rule__Role__Group__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2482:1: ( 'role' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2483:1: 'role'
            {
             before(grammarAccess.getRoleAccess().getRoleKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__Role__Group__05166); 
             after(grammarAccess.getRoleAccess().getRoleKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Role__Group__1_in_rule__Role__Group__05176);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2497:1: rule__Role__Group__1 : ( ( rule__Role__NameAssignment_1 ) ) rule__Role__Group__2 ;
    public final void rule__Role__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2501:1: ( ( ( rule__Role__NameAssignment_1 ) ) rule__Role__Group__2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2502:1: ( ( rule__Role__NameAssignment_1 ) ) rule__Role__Group__2
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2502:1: ( ( rule__Role__NameAssignment_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2503:1: ( rule__Role__NameAssignment_1 )
            {
             before(grammarAccess.getRoleAccess().getNameAssignment_1()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2504:1: ( rule__Role__NameAssignment_1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2504:2: rule__Role__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Role__NameAssignment_1_in_rule__Role__Group__15204);
            rule__Role__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getRoleAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Role__Group__2_in_rule__Role__Group__15213);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2515:1: rule__Role__Group__2 : ( ( rule__Role__Group_2__0 )? ) ;
    public final void rule__Role__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2519:1: ( ( ( rule__Role__Group_2__0 )? ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2520:1: ( ( rule__Role__Group_2__0 )? )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2520:1: ( ( rule__Role__Group_2__0 )? )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2521:1: ( rule__Role__Group_2__0 )?
            {
             before(grammarAccess.getRoleAccess().getGroup_2()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2522:1: ( rule__Role__Group_2__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==26) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2522:2: rule__Role__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Role__Group_2__0_in_rule__Role__Group__25241);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2538:1: rule__Role__Group_2__0 : ( '{' ) rule__Role__Group_2__1 ;
    public final void rule__Role__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2542:1: ( ( '{' ) rule__Role__Group_2__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2543:1: ( '{' ) rule__Role__Group_2__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2543:1: ( '{' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2544:1: '{'
            {
             before(grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,26,FOLLOW_26_in_rule__Role__Group_2__05283); 
             after(grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_2_0()); 

            }

            pushFollow(FOLLOW_rule__Role__Group_2__1_in_rule__Role__Group_2__05293);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2558:1: rule__Role__Group_2__1 : ( ( rule__Role__IntentionsAssignment_2_1 )* ) rule__Role__Group_2__2 ;
    public final void rule__Role__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2562:1: ( ( ( rule__Role__IntentionsAssignment_2_1 )* ) rule__Role__Group_2__2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2563:1: ( ( rule__Role__IntentionsAssignment_2_1 )* ) rule__Role__Group_2__2
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2563:1: ( ( rule__Role__IntentionsAssignment_2_1 )* )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2564:1: ( rule__Role__IntentionsAssignment_2_1 )*
            {
             before(grammarAccess.getRoleAccess().getIntentionsAssignment_2_1()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2565:1: ( rule__Role__IntentionsAssignment_2_1 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=37 && LA31_0<=41)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2565:2: rule__Role__IntentionsAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_rule__Role__IntentionsAssignment_2_1_in_rule__Role__Group_2__15321);
            	    rule__Role__IntentionsAssignment_2_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getRoleAccess().getIntentionsAssignment_2_1()); 

            }

            pushFollow(FOLLOW_rule__Role__Group_2__2_in_rule__Role__Group_2__15331);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2576:1: rule__Role__Group_2__2 : ( '}' ) ;
    public final void rule__Role__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2580:1: ( ( '}' ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2581:1: ( '}' )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2581:1: ( '}' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2582:1: '}'
            {
             before(grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_2_2()); 
            match(input,27,FOLLOW_27_in_rule__Role__Group_2__25360); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2601:1: rule__Position__Group__0 : ( 'position' ) rule__Position__Group__1 ;
    public final void rule__Position__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2605:1: ( ( 'position' ) rule__Position__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2606:1: ( 'position' ) rule__Position__Group__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2606:1: ( 'position' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2607:1: 'position'
            {
             before(grammarAccess.getPositionAccess().getPositionKeyword_0()); 
            match(input,36,FOLLOW_36_in_rule__Position__Group__05402); 
             after(grammarAccess.getPositionAccess().getPositionKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Position__Group__1_in_rule__Position__Group__05412);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2621:1: rule__Position__Group__1 : ( ( rule__Position__NameAssignment_1 ) ) rule__Position__Group__2 ;
    public final void rule__Position__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2625:1: ( ( ( rule__Position__NameAssignment_1 ) ) rule__Position__Group__2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2626:1: ( ( rule__Position__NameAssignment_1 ) ) rule__Position__Group__2
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2626:1: ( ( rule__Position__NameAssignment_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2627:1: ( rule__Position__NameAssignment_1 )
            {
             before(grammarAccess.getPositionAccess().getNameAssignment_1()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2628:1: ( rule__Position__NameAssignment_1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2628:2: rule__Position__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Position__NameAssignment_1_in_rule__Position__Group__15440);
            rule__Position__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getPositionAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Position__Group__2_in_rule__Position__Group__15449);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2639:1: rule__Position__Group__2 : ( ( rule__Position__Group_2__0 )? ) ;
    public final void rule__Position__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2643:1: ( ( ( rule__Position__Group_2__0 )? ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2644:1: ( ( rule__Position__Group_2__0 )? )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2644:1: ( ( rule__Position__Group_2__0 )? )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2645:1: ( rule__Position__Group_2__0 )?
            {
             before(grammarAccess.getPositionAccess().getGroup_2()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2646:1: ( rule__Position__Group_2__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==26) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2646:2: rule__Position__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Position__Group_2__0_in_rule__Position__Group__25477);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2662:1: rule__Position__Group_2__0 : ( '{' ) rule__Position__Group_2__1 ;
    public final void rule__Position__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2666:1: ( ( '{' ) rule__Position__Group_2__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2667:1: ( '{' ) rule__Position__Group_2__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2667:1: ( '{' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2668:1: '{'
            {
             before(grammarAccess.getPositionAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,26,FOLLOW_26_in_rule__Position__Group_2__05519); 
             after(grammarAccess.getPositionAccess().getLeftCurlyBracketKeyword_2_0()); 

            }

            pushFollow(FOLLOW_rule__Position__Group_2__1_in_rule__Position__Group_2__05529);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2682:1: rule__Position__Group_2__1 : ( ( rule__Position__IntentionsAssignment_2_1 )* ) rule__Position__Group_2__2 ;
    public final void rule__Position__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2686:1: ( ( ( rule__Position__IntentionsAssignment_2_1 )* ) rule__Position__Group_2__2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2687:1: ( ( rule__Position__IntentionsAssignment_2_1 )* ) rule__Position__Group_2__2
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2687:1: ( ( rule__Position__IntentionsAssignment_2_1 )* )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2688:1: ( rule__Position__IntentionsAssignment_2_1 )*
            {
             before(grammarAccess.getPositionAccess().getIntentionsAssignment_2_1()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2689:1: ( rule__Position__IntentionsAssignment_2_1 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=37 && LA33_0<=41)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2689:2: rule__Position__IntentionsAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_rule__Position__IntentionsAssignment_2_1_in_rule__Position__Group_2__15557);
            	    rule__Position__IntentionsAssignment_2_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getPositionAccess().getIntentionsAssignment_2_1()); 

            }

            pushFollow(FOLLOW_rule__Position__Group_2__2_in_rule__Position__Group_2__15567);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2700:1: rule__Position__Group_2__2 : ( '}' ) ;
    public final void rule__Position__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2704:1: ( ( '}' ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2705:1: ( '}' )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2705:1: ( '}' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2706:1: '}'
            {
             before(grammarAccess.getPositionAccess().getRightCurlyBracketKeyword_2_2()); 
            match(input,27,FOLLOW_27_in_rule__Position__Group_2__25596); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2725:1: rule__Goal__Group__0 : ( 'goal' ) rule__Goal__Group__1 ;
    public final void rule__Goal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2729:1: ( ( 'goal' ) rule__Goal__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2730:1: ( 'goal' ) rule__Goal__Group__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2730:1: ( 'goal' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2731:1: 'goal'
            {
             before(grammarAccess.getGoalAccess().getGoalKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__Goal__Group__05638); 
             after(grammarAccess.getGoalAccess().getGoalKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Goal__Group__1_in_rule__Goal__Group__05648);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2745:1: rule__Goal__Group__1 : ( ( rule__Goal__NameAssignment_1 ) ) rule__Goal__Group__2 ;
    public final void rule__Goal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2749:1: ( ( ( rule__Goal__NameAssignment_1 ) ) rule__Goal__Group__2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2750:1: ( ( rule__Goal__NameAssignment_1 ) ) rule__Goal__Group__2
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2750:1: ( ( rule__Goal__NameAssignment_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2751:1: ( rule__Goal__NameAssignment_1 )
            {
             before(grammarAccess.getGoalAccess().getNameAssignment_1()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2752:1: ( rule__Goal__NameAssignment_1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2752:2: rule__Goal__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Goal__NameAssignment_1_in_rule__Goal__Group__15676);
            rule__Goal__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getGoalAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Goal__Group__2_in_rule__Goal__Group__15685);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2763:1: rule__Goal__Group__2 : ( ( rule__Goal__Group_2__0 )? ) ;
    public final void rule__Goal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2767:1: ( ( ( rule__Goal__Group_2__0 )? ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2768:1: ( ( rule__Goal__Group_2__0 )? )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2768:1: ( ( rule__Goal__Group_2__0 )? )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2769:1: ( rule__Goal__Group_2__0 )?
            {
             before(grammarAccess.getGoalAccess().getGroup_2()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2770:1: ( rule__Goal__Group_2__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==26) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2770:2: rule__Goal__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Goal__Group_2__0_in_rule__Goal__Group__25713);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2786:1: rule__Goal__Group_2__0 : ( '{' ) rule__Goal__Group_2__1 ;
    public final void rule__Goal__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2790:1: ( ( '{' ) rule__Goal__Group_2__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2791:1: ( '{' ) rule__Goal__Group_2__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2791:1: ( '{' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2792:1: '{'
            {
             before(grammarAccess.getGoalAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,26,FOLLOW_26_in_rule__Goal__Group_2__05755); 
             after(grammarAccess.getGoalAccess().getLeftCurlyBracketKeyword_2_0()); 

            }

            pushFollow(FOLLOW_rule__Goal__Group_2__1_in_rule__Goal__Group_2__05765);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2806:1: rule__Goal__Group_2__1 : ( ( rule__Goal__DecompositionsAssignment_2_1 )* ) rule__Goal__Group_2__2 ;
    public final void rule__Goal__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2810:1: ( ( ( rule__Goal__DecompositionsAssignment_2_1 )* ) rule__Goal__Group_2__2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2811:1: ( ( rule__Goal__DecompositionsAssignment_2_1 )* ) rule__Goal__Group_2__2
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2811:1: ( ( rule__Goal__DecompositionsAssignment_2_1 )* )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2812:1: ( rule__Goal__DecompositionsAssignment_2_1 )*
            {
             before(grammarAccess.getGoalAccess().getDecompositionsAssignment_2_1()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2813:1: ( rule__Goal__DecompositionsAssignment_2_1 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_ID) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2813:2: rule__Goal__DecompositionsAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_rule__Goal__DecompositionsAssignment_2_1_in_rule__Goal__Group_2__15793);
            	    rule__Goal__DecompositionsAssignment_2_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getGoalAccess().getDecompositionsAssignment_2_1()); 

            }

            pushFollow(FOLLOW_rule__Goal__Group_2__2_in_rule__Goal__Group_2__15803);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2824:1: rule__Goal__Group_2__2 : ( '}' ) ;
    public final void rule__Goal__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2828:1: ( ( '}' ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2829:1: ( '}' )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2829:1: ( '}' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2830:1: '}'
            {
             before(grammarAccess.getGoalAccess().getRightCurlyBracketKeyword_2_2()); 
            match(input,27,FOLLOW_27_in_rule__Goal__Group_2__25832); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2849:1: rule__Softgoal__Group__0 : ( 'soft' ) rule__Softgoal__Group__1 ;
    public final void rule__Softgoal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2853:1: ( ( 'soft' ) rule__Softgoal__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2854:1: ( 'soft' ) rule__Softgoal__Group__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2854:1: ( 'soft' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2855:1: 'soft'
            {
             before(grammarAccess.getSoftgoalAccess().getSoftKeyword_0()); 
            match(input,38,FOLLOW_38_in_rule__Softgoal__Group__05874); 
             after(grammarAccess.getSoftgoalAccess().getSoftKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Softgoal__Group__1_in_rule__Softgoal__Group__05884);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2869:1: rule__Softgoal__Group__1 : ( ( rule__Softgoal__NameAssignment_1 ) ) ;
    public final void rule__Softgoal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2873:1: ( ( ( rule__Softgoal__NameAssignment_1 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2874:1: ( ( rule__Softgoal__NameAssignment_1 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2874:1: ( ( rule__Softgoal__NameAssignment_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2875:1: ( rule__Softgoal__NameAssignment_1 )
            {
             before(grammarAccess.getSoftgoalAccess().getNameAssignment_1()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2876:1: ( rule__Softgoal__NameAssignment_1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2876:2: rule__Softgoal__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Softgoal__NameAssignment_1_in_rule__Softgoal__Group__15912);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2890:1: rule__Task__Group__0 : ( 'task' ) rule__Task__Group__1 ;
    public final void rule__Task__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2894:1: ( ( 'task' ) rule__Task__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2895:1: ( 'task' ) rule__Task__Group__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2895:1: ( 'task' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2896:1: 'task'
            {
             before(grammarAccess.getTaskAccess().getTaskKeyword_0()); 
            match(input,39,FOLLOW_39_in_rule__Task__Group__05951); 
             after(grammarAccess.getTaskAccess().getTaskKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Task__Group__1_in_rule__Task__Group__05961);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2910:1: rule__Task__Group__1 : ( ( rule__Task__NameAssignment_1 ) ) ;
    public final void rule__Task__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2914:1: ( ( ( rule__Task__NameAssignment_1 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2915:1: ( ( rule__Task__NameAssignment_1 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2915:1: ( ( rule__Task__NameAssignment_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2916:1: ( rule__Task__NameAssignment_1 )
            {
             before(grammarAccess.getTaskAccess().getNameAssignment_1()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2917:1: ( rule__Task__NameAssignment_1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2917:2: rule__Task__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Task__NameAssignment_1_in_rule__Task__Group__15989);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2931:1: rule__Resource__Group__0 : ( 'resource' ) rule__Resource__Group__1 ;
    public final void rule__Resource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2935:1: ( ( 'resource' ) rule__Resource__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2936:1: ( 'resource' ) rule__Resource__Group__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2936:1: ( 'resource' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2937:1: 'resource'
            {
             before(grammarAccess.getResourceAccess().getResourceKeyword_0()); 
            match(input,40,FOLLOW_40_in_rule__Resource__Group__06028); 
             after(grammarAccess.getResourceAccess().getResourceKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Resource__Group__1_in_rule__Resource__Group__06038);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2951:1: rule__Resource__Group__1 : ( ( rule__Resource__NameAssignment_1 ) ) ;
    public final void rule__Resource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2955:1: ( ( ( rule__Resource__NameAssignment_1 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2956:1: ( ( rule__Resource__NameAssignment_1 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2956:1: ( ( rule__Resource__NameAssignment_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2957:1: ( rule__Resource__NameAssignment_1 )
            {
             before(grammarAccess.getResourceAccess().getNameAssignment_1()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2958:1: ( rule__Resource__NameAssignment_1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2958:2: rule__Resource__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Resource__NameAssignment_1_in_rule__Resource__Group__16066);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2972:1: rule__Belief__Group__0 : ( 'belief' ) rule__Belief__Group__1 ;
    public final void rule__Belief__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2976:1: ( ( 'belief' ) rule__Belief__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2977:1: ( 'belief' ) rule__Belief__Group__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2977:1: ( 'belief' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2978:1: 'belief'
            {
             before(grammarAccess.getBeliefAccess().getBeliefKeyword_0()); 
            match(input,41,FOLLOW_41_in_rule__Belief__Group__06105); 
             after(grammarAccess.getBeliefAccess().getBeliefKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Belief__Group__1_in_rule__Belief__Group__06115);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2992:1: rule__Belief__Group__1 : ( ( rule__Belief__NameAssignment_1 ) ) ;
    public final void rule__Belief__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2996:1: ( ( ( rule__Belief__NameAssignment_1 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2997:1: ( ( rule__Belief__NameAssignment_1 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2997:1: ( ( rule__Belief__NameAssignment_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2998:1: ( rule__Belief__NameAssignment_1 )
            {
             before(grammarAccess.getBeliefAccess().getNameAssignment_1()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2999:1: ( rule__Belief__NameAssignment_1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:2999:2: rule__Belief__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Belief__NameAssignment_1_in_rule__Belief__Group__16143);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3013:1: rule__Association__Group__0 : ( ( rule__Association__SourceAssignment_0 ) ) rule__Association__Group__1 ;
    public final void rule__Association__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3017:1: ( ( ( rule__Association__SourceAssignment_0 ) ) rule__Association__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3018:1: ( ( rule__Association__SourceAssignment_0 ) ) rule__Association__Group__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3018:1: ( ( rule__Association__SourceAssignment_0 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3019:1: ( rule__Association__SourceAssignment_0 )
            {
             before(grammarAccess.getAssociationAccess().getSourceAssignment_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3020:1: ( rule__Association__SourceAssignment_0 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3020:2: rule__Association__SourceAssignment_0
            {
            pushFollow(FOLLOW_rule__Association__SourceAssignment_0_in_rule__Association__Group__06181);
            rule__Association__SourceAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getAssociationAccess().getSourceAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Association__Group__1_in_rule__Association__Group__06190);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3031:1: rule__Association__Group__1 : ( '~~>' ) rule__Association__Group__2 ;
    public final void rule__Association__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3035:1: ( ( '~~>' ) rule__Association__Group__2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3036:1: ( '~~>' ) rule__Association__Group__2
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3036:1: ( '~~>' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3037:1: '~~>'
            {
             before(grammarAccess.getAssociationAccess().getTildeTildeGreaterThanSignKeyword_1()); 
            match(input,42,FOLLOW_42_in_rule__Association__Group__16219); 
             after(grammarAccess.getAssociationAccess().getTildeTildeGreaterThanSignKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__Association__Group__2_in_rule__Association__Group__16229);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3051:1: rule__Association__Group__2 : ( ( rule__Association__TargetAssignment_2 ) ) ;
    public final void rule__Association__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3055:1: ( ( ( rule__Association__TargetAssignment_2 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3056:1: ( ( rule__Association__TargetAssignment_2 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3056:1: ( ( rule__Association__TargetAssignment_2 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3057:1: ( rule__Association__TargetAssignment_2 )
            {
             before(grammarAccess.getAssociationAccess().getTargetAssignment_2()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3058:1: ( rule__Association__TargetAssignment_2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3058:2: rule__Association__TargetAssignment_2
            {
            pushFollow(FOLLOW_rule__Association__TargetAssignment_2_in_rule__Association__Group__26257);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3074:1: rule__Dependency__Group__0 : ( ( rule__Dependency__DependencyFromAssignment_0 ) ) rule__Dependency__Group__1 ;
    public final void rule__Dependency__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3078:1: ( ( ( rule__Dependency__DependencyFromAssignment_0 ) ) rule__Dependency__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3079:1: ( ( rule__Dependency__DependencyFromAssignment_0 ) ) rule__Dependency__Group__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3079:1: ( ( rule__Dependency__DependencyFromAssignment_0 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3080:1: ( rule__Dependency__DependencyFromAssignment_0 )
            {
             before(grammarAccess.getDependencyAccess().getDependencyFromAssignment_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3081:1: ( rule__Dependency__DependencyFromAssignment_0 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3081:2: rule__Dependency__DependencyFromAssignment_0
            {
            pushFollow(FOLLOW_rule__Dependency__DependencyFromAssignment_0_in_rule__Dependency__Group__06297);
            rule__Dependency__DependencyFromAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getDependencyAccess().getDependencyFromAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Dependency__Group__1_in_rule__Dependency__Group__06306);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3092:1: rule__Dependency__Group__1 : ( '~>' ) rule__Dependency__Group__2 ;
    public final void rule__Dependency__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3096:1: ( ( '~>' ) rule__Dependency__Group__2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3097:1: ( '~>' ) rule__Dependency__Group__2
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3097:1: ( '~>' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3098:1: '~>'
            {
             before(grammarAccess.getDependencyAccess().getTildeGreaterThanSignKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__Dependency__Group__16335); 
             after(grammarAccess.getDependencyAccess().getTildeGreaterThanSignKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__Dependency__Group__2_in_rule__Dependency__Group__16345);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3112:1: rule__Dependency__Group__2 : ( ( rule__Dependency__DependencyToAssignment_2 ) ) ;
    public final void rule__Dependency__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3116:1: ( ( ( rule__Dependency__DependencyToAssignment_2 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3117:1: ( ( rule__Dependency__DependencyToAssignment_2 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3117:1: ( ( rule__Dependency__DependencyToAssignment_2 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3118:1: ( rule__Dependency__DependencyToAssignment_2 )
            {
             before(grammarAccess.getDependencyAccess().getDependencyToAssignment_2()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3119:1: ( rule__Dependency__DependencyToAssignment_2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3119:2: rule__Dependency__DependencyToAssignment_2
            {
            pushFollow(FOLLOW_rule__Dependency__DependencyToAssignment_2_in_rule__Dependency__Group__26373);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3135:1: rule__AndDecomposition__Group__0 : ( ( rule__AndDecomposition__TargetAssignment_0 ) ) rule__AndDecomposition__Group__1 ;
    public final void rule__AndDecomposition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3139:1: ( ( ( rule__AndDecomposition__TargetAssignment_0 ) ) rule__AndDecomposition__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3140:1: ( ( rule__AndDecomposition__TargetAssignment_0 ) ) rule__AndDecomposition__Group__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3140:1: ( ( rule__AndDecomposition__TargetAssignment_0 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3141:1: ( rule__AndDecomposition__TargetAssignment_0 )
            {
             before(grammarAccess.getAndDecompositionAccess().getTargetAssignment_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3142:1: ( rule__AndDecomposition__TargetAssignment_0 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3142:2: rule__AndDecomposition__TargetAssignment_0
            {
            pushFollow(FOLLOW_rule__AndDecomposition__TargetAssignment_0_in_rule__AndDecomposition__Group__06413);
            rule__AndDecomposition__TargetAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getAndDecompositionAccess().getTargetAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__AndDecomposition__Group__1_in_rule__AndDecomposition__Group__06422);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3153:1: rule__AndDecomposition__Group__1 : ( '<-(and)-' ) rule__AndDecomposition__Group__2 ;
    public final void rule__AndDecomposition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3157:1: ( ( '<-(and)-' ) rule__AndDecomposition__Group__2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3158:1: ( '<-(and)-' ) rule__AndDecomposition__Group__2
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3158:1: ( '<-(and)-' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3159:1: '<-(and)-'
            {
             before(grammarAccess.getAndDecompositionAccess().getAndKeyword_1()); 
            match(input,43,FOLLOW_43_in_rule__AndDecomposition__Group__16451); 
             after(grammarAccess.getAndDecompositionAccess().getAndKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__AndDecomposition__Group__2_in_rule__AndDecomposition__Group__16461);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3173:1: rule__AndDecomposition__Group__2 : ( ( rule__AndDecomposition__SourceAssignment_2 ) ) ;
    public final void rule__AndDecomposition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3177:1: ( ( ( rule__AndDecomposition__SourceAssignment_2 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3178:1: ( ( rule__AndDecomposition__SourceAssignment_2 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3178:1: ( ( rule__AndDecomposition__SourceAssignment_2 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3179:1: ( rule__AndDecomposition__SourceAssignment_2 )
            {
             before(grammarAccess.getAndDecompositionAccess().getSourceAssignment_2()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3180:1: ( rule__AndDecomposition__SourceAssignment_2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3180:2: rule__AndDecomposition__SourceAssignment_2
            {
            pushFollow(FOLLOW_rule__AndDecomposition__SourceAssignment_2_in_rule__AndDecomposition__Group__26489);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3196:1: rule__OrDecomposition__Group__0 : ( ( rule__OrDecomposition__TargetAssignment_0 ) ) rule__OrDecomposition__Group__1 ;
    public final void rule__OrDecomposition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3200:1: ( ( ( rule__OrDecomposition__TargetAssignment_0 ) ) rule__OrDecomposition__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3201:1: ( ( rule__OrDecomposition__TargetAssignment_0 ) ) rule__OrDecomposition__Group__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3201:1: ( ( rule__OrDecomposition__TargetAssignment_0 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3202:1: ( rule__OrDecomposition__TargetAssignment_0 )
            {
             before(grammarAccess.getOrDecompositionAccess().getTargetAssignment_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3203:1: ( rule__OrDecomposition__TargetAssignment_0 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3203:2: rule__OrDecomposition__TargetAssignment_0
            {
            pushFollow(FOLLOW_rule__OrDecomposition__TargetAssignment_0_in_rule__OrDecomposition__Group__06529);
            rule__OrDecomposition__TargetAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getOrDecompositionAccess().getTargetAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__OrDecomposition__Group__1_in_rule__OrDecomposition__Group__06538);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3214:1: rule__OrDecomposition__Group__1 : ( '<-(or)-' ) rule__OrDecomposition__Group__2 ;
    public final void rule__OrDecomposition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3218:1: ( ( '<-(or)-' ) rule__OrDecomposition__Group__2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3219:1: ( '<-(or)-' ) rule__OrDecomposition__Group__2
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3219:1: ( '<-(or)-' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3220:1: '<-(or)-'
            {
             before(grammarAccess.getOrDecompositionAccess().getOrKeyword_1()); 
            match(input,44,FOLLOW_44_in_rule__OrDecomposition__Group__16567); 
             after(grammarAccess.getOrDecompositionAccess().getOrKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__OrDecomposition__Group__2_in_rule__OrDecomposition__Group__16577);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3234:1: rule__OrDecomposition__Group__2 : ( ( rule__OrDecomposition__SourceAssignment_2 ) ) ;
    public final void rule__OrDecomposition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3238:1: ( ( ( rule__OrDecomposition__SourceAssignment_2 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3239:1: ( ( rule__OrDecomposition__SourceAssignment_2 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3239:1: ( ( rule__OrDecomposition__SourceAssignment_2 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3240:1: ( rule__OrDecomposition__SourceAssignment_2 )
            {
             before(grammarAccess.getOrDecompositionAccess().getSourceAssignment_2()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3241:1: ( rule__OrDecomposition__SourceAssignment_2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3241:2: rule__OrDecomposition__SourceAssignment_2
            {
            pushFollow(FOLLOW_rule__OrDecomposition__SourceAssignment_2_in_rule__OrDecomposition__Group__26605);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3257:1: rule__AndContribution__Group__0 : ( ( rule__AndContribution__SourceAssignment_0 ) ) rule__AndContribution__Group__1 ;
    public final void rule__AndContribution__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3261:1: ( ( ( rule__AndContribution__SourceAssignment_0 ) ) rule__AndContribution__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3262:1: ( ( rule__AndContribution__SourceAssignment_0 ) ) rule__AndContribution__Group__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3262:1: ( ( rule__AndContribution__SourceAssignment_0 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3263:1: ( rule__AndContribution__SourceAssignment_0 )
            {
             before(grammarAccess.getAndContributionAccess().getSourceAssignment_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3264:1: ( rule__AndContribution__SourceAssignment_0 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3264:2: rule__AndContribution__SourceAssignment_0
            {
            pushFollow(FOLLOW_rule__AndContribution__SourceAssignment_0_in_rule__AndContribution__Group__06645);
            rule__AndContribution__SourceAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getAndContributionAccess().getSourceAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__AndContribution__Group__1_in_rule__AndContribution__Group__06654);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3275:1: rule__AndContribution__Group__1 : ( '-(and)->' ) rule__AndContribution__Group__2 ;
    public final void rule__AndContribution__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3279:1: ( ( '-(and)->' ) rule__AndContribution__Group__2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3280:1: ( '-(and)->' ) rule__AndContribution__Group__2
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3280:1: ( '-(and)->' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3281:1: '-(and)->'
            {
             before(grammarAccess.getAndContributionAccess().getAndKeyword_1()); 
            match(input,45,FOLLOW_45_in_rule__AndContribution__Group__16683); 
             after(grammarAccess.getAndContributionAccess().getAndKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__AndContribution__Group__2_in_rule__AndContribution__Group__16693);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3295:1: rule__AndContribution__Group__2 : ( ( rule__AndContribution__TargetAssignment_2 ) ) ;
    public final void rule__AndContribution__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3299:1: ( ( ( rule__AndContribution__TargetAssignment_2 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3300:1: ( ( rule__AndContribution__TargetAssignment_2 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3300:1: ( ( rule__AndContribution__TargetAssignment_2 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3301:1: ( rule__AndContribution__TargetAssignment_2 )
            {
             before(grammarAccess.getAndContributionAccess().getTargetAssignment_2()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3302:1: ( rule__AndContribution__TargetAssignment_2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3302:2: rule__AndContribution__TargetAssignment_2
            {
            pushFollow(FOLLOW_rule__AndContribution__TargetAssignment_2_in_rule__AndContribution__Group__26721);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3318:1: rule__OrContribution__Group__0 : ( ( rule__OrContribution__SourceAssignment_0 ) ) rule__OrContribution__Group__1 ;
    public final void rule__OrContribution__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3322:1: ( ( ( rule__OrContribution__SourceAssignment_0 ) ) rule__OrContribution__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3323:1: ( ( rule__OrContribution__SourceAssignment_0 ) ) rule__OrContribution__Group__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3323:1: ( ( rule__OrContribution__SourceAssignment_0 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3324:1: ( rule__OrContribution__SourceAssignment_0 )
            {
             before(grammarAccess.getOrContributionAccess().getSourceAssignment_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3325:1: ( rule__OrContribution__SourceAssignment_0 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3325:2: rule__OrContribution__SourceAssignment_0
            {
            pushFollow(FOLLOW_rule__OrContribution__SourceAssignment_0_in_rule__OrContribution__Group__06761);
            rule__OrContribution__SourceAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getOrContributionAccess().getSourceAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__OrContribution__Group__1_in_rule__OrContribution__Group__06770);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3336:1: rule__OrContribution__Group__1 : ( '-(or)->' ) rule__OrContribution__Group__2 ;
    public final void rule__OrContribution__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3340:1: ( ( '-(or)->' ) rule__OrContribution__Group__2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3341:1: ( '-(or)->' ) rule__OrContribution__Group__2
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3341:1: ( '-(or)->' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3342:1: '-(or)->'
            {
             before(grammarAccess.getOrContributionAccess().getOrKeyword_1()); 
            match(input,46,FOLLOW_46_in_rule__OrContribution__Group__16799); 
             after(grammarAccess.getOrContributionAccess().getOrKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__OrContribution__Group__2_in_rule__OrContribution__Group__16809);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3356:1: rule__OrContribution__Group__2 : ( ( rule__OrContribution__TargetAssignment_2 ) ) ;
    public final void rule__OrContribution__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3360:1: ( ( ( rule__OrContribution__TargetAssignment_2 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3361:1: ( ( rule__OrContribution__TargetAssignment_2 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3361:1: ( ( rule__OrContribution__TargetAssignment_2 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3362:1: ( rule__OrContribution__TargetAssignment_2 )
            {
             before(grammarAccess.getOrContributionAccess().getTargetAssignment_2()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3363:1: ( rule__OrContribution__TargetAssignment_2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3363:2: rule__OrContribution__TargetAssignment_2
            {
            pushFollow(FOLLOW_rule__OrContribution__TargetAssignment_2_in_rule__OrContribution__Group__26837);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3379:1: rule__HelpContribution__Group__0 : ( ( rule__HelpContribution__SourceAssignment_0 ) ) rule__HelpContribution__Group__1 ;
    public final void rule__HelpContribution__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3383:1: ( ( ( rule__HelpContribution__SourceAssignment_0 ) ) rule__HelpContribution__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3384:1: ( ( rule__HelpContribution__SourceAssignment_0 ) ) rule__HelpContribution__Group__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3384:1: ( ( rule__HelpContribution__SourceAssignment_0 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3385:1: ( rule__HelpContribution__SourceAssignment_0 )
            {
             before(grammarAccess.getHelpContributionAccess().getSourceAssignment_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3386:1: ( rule__HelpContribution__SourceAssignment_0 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3386:2: rule__HelpContribution__SourceAssignment_0
            {
            pushFollow(FOLLOW_rule__HelpContribution__SourceAssignment_0_in_rule__HelpContribution__Group__06877);
            rule__HelpContribution__SourceAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getHelpContributionAccess().getSourceAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__HelpContribution__Group__1_in_rule__HelpContribution__Group__06886);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3397:1: rule__HelpContribution__Group__1 : ( '-(+)->' ) rule__HelpContribution__Group__2 ;
    public final void rule__HelpContribution__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3401:1: ( ( '-(+)->' ) rule__HelpContribution__Group__2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3402:1: ( '-(+)->' ) rule__HelpContribution__Group__2
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3402:1: ( '-(+)->' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3403:1: '-(+)->'
            {
             before(grammarAccess.getHelpContributionAccess().getHyphenMinusLeftParenthesisPlusSignRightParenthesisHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,47,FOLLOW_47_in_rule__HelpContribution__Group__16915); 
             after(grammarAccess.getHelpContributionAccess().getHyphenMinusLeftParenthesisPlusSignRightParenthesisHyphenMinusGreaterThanSignKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__HelpContribution__Group__2_in_rule__HelpContribution__Group__16925);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3417:1: rule__HelpContribution__Group__2 : ( ( rule__HelpContribution__TargetAssignment_2 ) ) ;
    public final void rule__HelpContribution__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3421:1: ( ( ( rule__HelpContribution__TargetAssignment_2 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3422:1: ( ( rule__HelpContribution__TargetAssignment_2 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3422:1: ( ( rule__HelpContribution__TargetAssignment_2 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3423:1: ( rule__HelpContribution__TargetAssignment_2 )
            {
             before(grammarAccess.getHelpContributionAccess().getTargetAssignment_2()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3424:1: ( rule__HelpContribution__TargetAssignment_2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3424:2: rule__HelpContribution__TargetAssignment_2
            {
            pushFollow(FOLLOW_rule__HelpContribution__TargetAssignment_2_in_rule__HelpContribution__Group__26953);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3440:1: rule__MakeContribution__Group__0 : ( ( rule__MakeContribution__SourceAssignment_0 ) ) rule__MakeContribution__Group__1 ;
    public final void rule__MakeContribution__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3444:1: ( ( ( rule__MakeContribution__SourceAssignment_0 ) ) rule__MakeContribution__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3445:1: ( ( rule__MakeContribution__SourceAssignment_0 ) ) rule__MakeContribution__Group__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3445:1: ( ( rule__MakeContribution__SourceAssignment_0 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3446:1: ( rule__MakeContribution__SourceAssignment_0 )
            {
             before(grammarAccess.getMakeContributionAccess().getSourceAssignment_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3447:1: ( rule__MakeContribution__SourceAssignment_0 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3447:2: rule__MakeContribution__SourceAssignment_0
            {
            pushFollow(FOLLOW_rule__MakeContribution__SourceAssignment_0_in_rule__MakeContribution__Group__06993);
            rule__MakeContribution__SourceAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getMakeContributionAccess().getSourceAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__MakeContribution__Group__1_in_rule__MakeContribution__Group__07002);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3458:1: rule__MakeContribution__Group__1 : ( '-(++)->' ) rule__MakeContribution__Group__2 ;
    public final void rule__MakeContribution__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3462:1: ( ( '-(++)->' ) rule__MakeContribution__Group__2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3463:1: ( '-(++)->' ) rule__MakeContribution__Group__2
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3463:1: ( '-(++)->' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3464:1: '-(++)->'
            {
             before(grammarAccess.getMakeContributionAccess().getHyphenMinusLeftParenthesisPlusSignPlusSignRightParenthesisHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,48,FOLLOW_48_in_rule__MakeContribution__Group__17031); 
             after(grammarAccess.getMakeContributionAccess().getHyphenMinusLeftParenthesisPlusSignPlusSignRightParenthesisHyphenMinusGreaterThanSignKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__MakeContribution__Group__2_in_rule__MakeContribution__Group__17041);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3478:1: rule__MakeContribution__Group__2 : ( ( rule__MakeContribution__TargetAssignment_2 ) ) ;
    public final void rule__MakeContribution__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3482:1: ( ( ( rule__MakeContribution__TargetAssignment_2 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3483:1: ( ( rule__MakeContribution__TargetAssignment_2 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3483:1: ( ( rule__MakeContribution__TargetAssignment_2 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3484:1: ( rule__MakeContribution__TargetAssignment_2 )
            {
             before(grammarAccess.getMakeContributionAccess().getTargetAssignment_2()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3485:1: ( rule__MakeContribution__TargetAssignment_2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3485:2: rule__MakeContribution__TargetAssignment_2
            {
            pushFollow(FOLLOW_rule__MakeContribution__TargetAssignment_2_in_rule__MakeContribution__Group__27069);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3501:1: rule__HurtContribution__Group__0 : ( ( rule__HurtContribution__SourceAssignment_0 ) ) rule__HurtContribution__Group__1 ;
    public final void rule__HurtContribution__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3505:1: ( ( ( rule__HurtContribution__SourceAssignment_0 ) ) rule__HurtContribution__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3506:1: ( ( rule__HurtContribution__SourceAssignment_0 ) ) rule__HurtContribution__Group__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3506:1: ( ( rule__HurtContribution__SourceAssignment_0 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3507:1: ( rule__HurtContribution__SourceAssignment_0 )
            {
             before(grammarAccess.getHurtContributionAccess().getSourceAssignment_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3508:1: ( rule__HurtContribution__SourceAssignment_0 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3508:2: rule__HurtContribution__SourceAssignment_0
            {
            pushFollow(FOLLOW_rule__HurtContribution__SourceAssignment_0_in_rule__HurtContribution__Group__07109);
            rule__HurtContribution__SourceAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getHurtContributionAccess().getSourceAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__HurtContribution__Group__1_in_rule__HurtContribution__Group__07118);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3519:1: rule__HurtContribution__Group__1 : ( '-(-)->' ) rule__HurtContribution__Group__2 ;
    public final void rule__HurtContribution__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3523:1: ( ( '-(-)->' ) rule__HurtContribution__Group__2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3524:1: ( '-(-)->' ) rule__HurtContribution__Group__2
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3524:1: ( '-(-)->' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3525:1: '-(-)->'
            {
             before(grammarAccess.getHurtContributionAccess().getHyphenMinusLeftParenthesisHyphenMinusRightParenthesisHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,49,FOLLOW_49_in_rule__HurtContribution__Group__17147); 
             after(grammarAccess.getHurtContributionAccess().getHyphenMinusLeftParenthesisHyphenMinusRightParenthesisHyphenMinusGreaterThanSignKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__HurtContribution__Group__2_in_rule__HurtContribution__Group__17157);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3539:1: rule__HurtContribution__Group__2 : ( ( rule__HurtContribution__TargetAssignment_2 ) ) ;
    public final void rule__HurtContribution__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3543:1: ( ( ( rule__HurtContribution__TargetAssignment_2 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3544:1: ( ( rule__HurtContribution__TargetAssignment_2 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3544:1: ( ( rule__HurtContribution__TargetAssignment_2 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3545:1: ( rule__HurtContribution__TargetAssignment_2 )
            {
             before(grammarAccess.getHurtContributionAccess().getTargetAssignment_2()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3546:1: ( rule__HurtContribution__TargetAssignment_2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3546:2: rule__HurtContribution__TargetAssignment_2
            {
            pushFollow(FOLLOW_rule__HurtContribution__TargetAssignment_2_in_rule__HurtContribution__Group__27185);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3562:1: rule__BreakContribution__Group__0 : ( ( rule__BreakContribution__SourceAssignment_0 ) ) rule__BreakContribution__Group__1 ;
    public final void rule__BreakContribution__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3566:1: ( ( ( rule__BreakContribution__SourceAssignment_0 ) ) rule__BreakContribution__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3567:1: ( ( rule__BreakContribution__SourceAssignment_0 ) ) rule__BreakContribution__Group__1
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3567:1: ( ( rule__BreakContribution__SourceAssignment_0 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3568:1: ( rule__BreakContribution__SourceAssignment_0 )
            {
             before(grammarAccess.getBreakContributionAccess().getSourceAssignment_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3569:1: ( rule__BreakContribution__SourceAssignment_0 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3569:2: rule__BreakContribution__SourceAssignment_0
            {
            pushFollow(FOLLOW_rule__BreakContribution__SourceAssignment_0_in_rule__BreakContribution__Group__07225);
            rule__BreakContribution__SourceAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getBreakContributionAccess().getSourceAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__BreakContribution__Group__1_in_rule__BreakContribution__Group__07234);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3580:1: rule__BreakContribution__Group__1 : ( '-(--)->' ) rule__BreakContribution__Group__2 ;
    public final void rule__BreakContribution__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3584:1: ( ( '-(--)->' ) rule__BreakContribution__Group__2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3585:1: ( '-(--)->' ) rule__BreakContribution__Group__2
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3585:1: ( '-(--)->' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3586:1: '-(--)->'
            {
             before(grammarAccess.getBreakContributionAccess().getHyphenMinusLeftParenthesisHyphenMinusHyphenMinusRightParenthesisHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,50,FOLLOW_50_in_rule__BreakContribution__Group__17263); 
             after(grammarAccess.getBreakContributionAccess().getHyphenMinusLeftParenthesisHyphenMinusHyphenMinusRightParenthesisHyphenMinusGreaterThanSignKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__BreakContribution__Group__2_in_rule__BreakContribution__Group__17273);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3600:1: rule__BreakContribution__Group__2 : ( ( rule__BreakContribution__TargetAssignment_2 ) ) ;
    public final void rule__BreakContribution__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3604:1: ( ( ( rule__BreakContribution__TargetAssignment_2 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3605:1: ( ( rule__BreakContribution__TargetAssignment_2 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3605:1: ( ( rule__BreakContribution__TargetAssignment_2 ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3606:1: ( rule__BreakContribution__TargetAssignment_2 )
            {
             before(grammarAccess.getBreakContributionAccess().getTargetAssignment_2()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3607:1: ( rule__BreakContribution__TargetAssignment_2 )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3607:2: rule__BreakContribution__TargetAssignment_2
            {
            pushFollow(FOLLOW_rule__BreakContribution__TargetAssignment_2_in_rule__BreakContribution__Group__27301);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3623:1: rule__ProblemDiagram__DescriptionAssignment_0_2 : ( RULE_STRING ) ;
    public final void rule__ProblemDiagram__DescriptionAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3627:1: ( ( RULE_STRING ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3628:1: ( RULE_STRING )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3628:1: ( RULE_STRING )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3629:1: RULE_STRING
            {
             before(grammarAccess.getProblemDiagramAccess().getDescriptionSTRINGTerminalRuleCall_0_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ProblemDiagram__DescriptionAssignment_0_27341); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3638:1: rule__ProblemDiagram__NodesAssignment_1_0 : ( ruleNode ) ;
    public final void rule__ProblemDiagram__NodesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3642:1: ( ( ruleNode ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3643:1: ( ruleNode )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3643:1: ( ruleNode )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3644:1: ruleNode
            {
             before(grammarAccess.getProblemDiagramAccess().getNodesNodeParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleNode_in_rule__ProblemDiagram__NodesAssignment_1_07372);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3653:1: rule__ProblemDiagram__LinksAssignment_1_1 : ( ruleLink ) ;
    public final void rule__ProblemDiagram__LinksAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3657:1: ( ( ruleLink ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3658:1: ( ruleLink )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3658:1: ( ruleLink )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3659:1: ruleLink
            {
             before(grammarAccess.getProblemDiagramAccess().getLinksLinkParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleLink_in_rule__ProblemDiagram__LinksAssignment_1_17403);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3668:1: rule__Node__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Node__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3672:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3673:1: ( RULE_ID )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3673:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3674:1: RULE_ID
            {
             before(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Node__NameAssignment_07434); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3683:1: rule__Node__TypeAssignment_1 : ( ruleNodeType ) ;
    public final void rule__Node__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3687:1: ( ( ruleNodeType ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3688:1: ( ruleNodeType )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3688:1: ( ruleNodeType )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3689:1: ruleNodeType
            {
             before(grammarAccess.getNodeAccess().getTypeNodeTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleNodeType_in_rule__Node__TypeAssignment_17465);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3698:1: rule__Node__DescriptionAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Node__DescriptionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3702:1: ( ( RULE_STRING ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3703:1: ( RULE_STRING )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3703:1: ( RULE_STRING )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3704:1: RULE_STRING
            {
             before(grammarAccess.getNodeAccess().getDescriptionSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Node__DescriptionAssignment_2_17496); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3713:1: rule__Node__SubproblemAssignment_3_1_0 : ( ruleProblemDiagram ) ;
    public final void rule__Node__SubproblemAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3717:1: ( ( ruleProblemDiagram ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3718:1: ( ruleProblemDiagram )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3718:1: ( ruleProblemDiagram )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3719:1: ruleProblemDiagram
            {
             before(grammarAccess.getNodeAccess().getSubproblemProblemDiagramParserRuleCall_3_1_0_0()); 
            pushFollow(FOLLOW_ruleProblemDiagram_in_rule__Node__SubproblemAssignment_3_1_07527);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3728:1: rule__Node__ProblemRefAssignment_3_1_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__Node__ProblemRefAssignment_3_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3732:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3733:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3733:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3734:1: ( RULE_ID )
            {
             before(grammarAccess.getNodeAccess().getProblemRefNodeCrossReference_3_1_1_2_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3735:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3736:1: RULE_ID
            {
             before(grammarAccess.getNodeAccess().getProblemRefNodeIDTerminalRuleCall_3_1_1_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Node__ProblemRefAssignment_3_1_1_27562); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3747:1: rule__Node__IstarAssignment_3_1_2 : ( ruleModel ) ;
    public final void rule__Node__IstarAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3751:1: ( ( ruleModel ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3752:1: ( ruleModel )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3752:1: ( ruleModel )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3753:1: ruleModel
            {
             before(grammarAccess.getNodeAccess().getIstarModelParserRuleCall_3_1_2_0()); 
            pushFollow(FOLLOW_ruleModel_in_rule__Node__IstarAssignment_3_1_27597);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3762:1: rule__Node__IstarRefAssignment_3_1_3_2 : ( ( RULE_ID ) ) ;
    public final void rule__Node__IstarRefAssignment_3_1_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3766:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3767:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3767:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3768:1: ( RULE_ID )
            {
             before(grammarAccess.getNodeAccess().getIstarRefIntentionCrossReference_3_1_3_2_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3769:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3770:1: RULE_ID
            {
             before(grammarAccess.getNodeAccess().getIstarRefIntentionIDTerminalRuleCall_3_1_3_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Node__IstarRefAssignment_3_1_3_27632); 
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


    // $ANTLR start rule__Node__HiddenPhenomenaAssignment_3_1_4_0
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3781:1: rule__Node__HiddenPhenomenaAssignment_3_1_4_0 : ( rulePhenomenon ) ;
    public final void rule__Node__HiddenPhenomenaAssignment_3_1_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3785:1: ( ( rulePhenomenon ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3786:1: ( rulePhenomenon )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3786:1: ( rulePhenomenon )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3787:1: rulePhenomenon
            {
             before(grammarAccess.getNodeAccess().getHiddenPhenomenaPhenomenonParserRuleCall_3_1_4_0_0()); 
            pushFollow(FOLLOW_rulePhenomenon_in_rule__Node__HiddenPhenomenaAssignment_3_1_4_07667);
            rulePhenomenon();
            _fsp--;

             after(grammarAccess.getNodeAccess().getHiddenPhenomenaPhenomenonParserRuleCall_3_1_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__HiddenPhenomenaAssignment_3_1_4_0


    // $ANTLR start rule__Node__HiddenPhenomenaAssignment_3_1_4_1_1
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3796:1: rule__Node__HiddenPhenomenaAssignment_3_1_4_1_1 : ( rulePhenomenon ) ;
    public final void rule__Node__HiddenPhenomenaAssignment_3_1_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3800:1: ( ( rulePhenomenon ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3801:1: ( rulePhenomenon )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3801:1: ( rulePhenomenon )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3802:1: rulePhenomenon
            {
             before(grammarAccess.getNodeAccess().getHiddenPhenomenaPhenomenonParserRuleCall_3_1_4_1_1_0()); 
            pushFollow(FOLLOW_rulePhenomenon_in_rule__Node__HiddenPhenomenaAssignment_3_1_4_1_17698);
            rulePhenomenon();
            _fsp--;

             after(grammarAccess.getNodeAccess().getHiddenPhenomenaPhenomenonParserRuleCall_3_1_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__HiddenPhenomenaAssignment_3_1_4_1_1


    // $ANTLR start rule__Phenomenon__TypeAssignment_0
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3811:1: rule__Phenomenon__TypeAssignment_0 : ( rulePhenomenonType ) ;
    public final void rule__Phenomenon__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3815:1: ( ( rulePhenomenonType ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3816:1: ( rulePhenomenonType )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3816:1: ( rulePhenomenonType )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3817:1: rulePhenomenonType
            {
             before(grammarAccess.getPhenomenonAccess().getTypePhenomenonTypeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_rulePhenomenonType_in_rule__Phenomenon__TypeAssignment_07729);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3826:1: rule__Phenomenon__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Phenomenon__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3830:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3831:1: ( RULE_ID )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3831:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3832:1: RULE_ID
            {
             before(grammarAccess.getPhenomenonAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Phenomenon__NameAssignment_17760); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3841:1: rule__Phenomenon__DescriptionAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Phenomenon__DescriptionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3845:1: ( ( RULE_STRING ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3846:1: ( RULE_STRING )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3846:1: ( RULE_STRING )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3847:1: RULE_STRING
            {
             before(grammarAccess.getPhenomenonAccess().getDescriptionSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Phenomenon__DescriptionAssignment_2_17791); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3856:1: rule__Link__FromAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Link__FromAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3860:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3861:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3861:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3862:1: ( RULE_ID )
            {
             before(grammarAccess.getLinkAccess().getFromNodeCrossReference_0_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3863:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3864:1: RULE_ID
            {
             before(grammarAccess.getLinkAccess().getFromNodeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Link__FromAssignment_07826); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3875:1: rule__Link__TypeAssignment_1 : ( ruleLinkType ) ;
    public final void rule__Link__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3879:1: ( ( ruleLinkType ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3880:1: ( ruleLinkType )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3880:1: ( ruleLinkType )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3881:1: ruleLinkType
            {
             before(grammarAccess.getLinkAccess().getTypeLinkTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleLinkType_in_rule__Link__TypeAssignment_17861);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3890:1: rule__Link__ToAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Link__ToAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3894:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3895:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3895:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3896:1: ( RULE_ID )
            {
             before(grammarAccess.getLinkAccess().getToNodeCrossReference_2_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3897:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3898:1: RULE_ID
            {
             before(grammarAccess.getLinkAccess().getToNodeIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Link__ToAssignment_27896); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3909:1: rule__Link__PhenomenaAssignment_3_1 : ( rulePhenomenon ) ;
    public final void rule__Link__PhenomenaAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3913:1: ( ( rulePhenomenon ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3914:1: ( rulePhenomenon )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3914:1: ( rulePhenomenon )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3915:1: rulePhenomenon
            {
             before(grammarAccess.getLinkAccess().getPhenomenaPhenomenonParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_rulePhenomenon_in_rule__Link__PhenomenaAssignment_3_17931);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3924:1: rule__Link__PhenomenaAssignment_3_2_1 : ( rulePhenomenon ) ;
    public final void rule__Link__PhenomenaAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3928:1: ( ( rulePhenomenon ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3929:1: ( rulePhenomenon )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3929:1: ( rulePhenomenon )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3930:1: rulePhenomenon
            {
             before(grammarAccess.getLinkAccess().getPhenomenaPhenomenonParserRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_rulePhenomenon_in_rule__Link__PhenomenaAssignment_3_2_17962);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3939:1: rule__Link__DescriptionAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Link__DescriptionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3943:1: ( ( RULE_STRING ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3944:1: ( RULE_STRING )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3944:1: ( RULE_STRING )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3945:1: RULE_STRING
            {
             before(grammarAccess.getLinkAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Link__DescriptionAssignment_4_17993); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3954:1: rule__Model__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3958:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3959:1: ( RULE_ID )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3959:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3960:1: RULE_ID
            {
             before(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Model__NameAssignment_18024); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3969:1: rule__Model__ContainersAssignment_3_0 : ( ruleContainer ) ;
    public final void rule__Model__ContainersAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3973:1: ( ( ruleContainer ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3974:1: ( ruleContainer )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3974:1: ( ruleContainer )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3975:1: ruleContainer
            {
             before(grammarAccess.getModelAccess().getContainersContainerParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_ruleContainer_in_rule__Model__ContainersAssignment_3_08055);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3984:1: rule__Model__IntentionsAssignment_3_1 : ( ruleIntention ) ;
    public final void rule__Model__IntentionsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3988:1: ( ( ruleIntention ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3989:1: ( ruleIntention )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3989:1: ( ruleIntention )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3990:1: ruleIntention
            {
             before(grammarAccess.getModelAccess().getIntentionsIntentionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleIntention_in_rule__Model__IntentionsAssignment_3_18086);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:3999:1: rule__Model__DecompositionsAssignment_3_2 : ( ruleDecomposition ) ;
    public final void rule__Model__DecompositionsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4003:1: ( ( ruleDecomposition ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4004:1: ( ruleDecomposition )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4004:1: ( ruleDecomposition )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4005:1: ruleDecomposition
            {
             before(grammarAccess.getModelAccess().getDecompositionsDecompositionParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_ruleDecomposition_in_rule__Model__DecompositionsAssignment_3_28117);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4014:1: rule__Model__DependenciesAssignment_3_3 : ( ruleDependency ) ;
    public final void rule__Model__DependenciesAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4018:1: ( ( ruleDependency ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4019:1: ( ruleDependency )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4019:1: ( ruleDependency )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4020:1: ruleDependency
            {
             before(grammarAccess.getModelAccess().getDependenciesDependencyParserRuleCall_3_3_0()); 
            pushFollow(FOLLOW_ruleDependency_in_rule__Model__DependenciesAssignment_3_38148);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4029:1: rule__Model__ContributionsAssignment_3_4 : ( ruleContribution ) ;
    public final void rule__Model__ContributionsAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4033:1: ( ( ruleContribution ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4034:1: ( ruleContribution )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4034:1: ( ruleContribution )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4035:1: ruleContribution
            {
             before(grammarAccess.getModelAccess().getContributionsContributionParserRuleCall_3_4_0()); 
            pushFollow(FOLLOW_ruleContribution_in_rule__Model__ContributionsAssignment_3_48179);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4044:1: rule__Model__AssociationsAssignment_3_5 : ( ruleAssociation ) ;
    public final void rule__Model__AssociationsAssignment_3_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4048:1: ( ( ruleAssociation ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4049:1: ( ruleAssociation )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4049:1: ( ruleAssociation )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4050:1: ruleAssociation
            {
             before(grammarAccess.getModelAccess().getAssociationsAssociationParserRuleCall_3_5_0()); 
            pushFollow(FOLLOW_ruleAssociation_in_rule__Model__AssociationsAssignment_3_58210);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4059:1: rule__Actor__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Actor__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4063:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4064:1: ( RULE_ID )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4064:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4065:1: RULE_ID
            {
             before(grammarAccess.getActorAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Actor__NameAssignment_18241); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4074:1: rule__Actor__Is_aAssignment_2_0 : ( ( RULE_ID ) ) ;
    public final void rule__Actor__Is_aAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4078:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4079:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4079:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4080:1: ( RULE_ID )
            {
             before(grammarAccess.getActorAccess().getIs_aActorCrossReference_2_0_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4081:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4082:1: RULE_ID
            {
             before(grammarAccess.getActorAccess().getIs_aActorIDTerminalRuleCall_2_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Actor__Is_aAssignment_2_08276); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4093:1: rule__Actor__Is_part_ofAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Actor__Is_part_ofAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4097:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4098:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4098:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4099:1: ( RULE_ID )
            {
             before(grammarAccess.getActorAccess().getIs_part_ofActorCrossReference_2_1_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4100:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4101:1: RULE_ID
            {
             before(grammarAccess.getActorAccess().getIs_part_ofActorIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Actor__Is_part_ofAssignment_2_18315); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4112:1: rule__Actor__IntentionsAssignment_3_1 : ( ruleIntention ) ;
    public final void rule__Actor__IntentionsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4116:1: ( ( ruleIntention ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4117:1: ( ruleIntention )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4117:1: ( ruleIntention )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4118:1: ruleIntention
            {
             before(grammarAccess.getActorAccess().getIntentionsIntentionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleIntention_in_rule__Actor__IntentionsAssignment_3_18350);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4127:1: rule__Agent__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Agent__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4131:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4132:1: ( RULE_ID )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4132:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4133:1: RULE_ID
            {
             before(grammarAccess.getAgentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Agent__NameAssignment_18381); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4142:1: rule__Agent__IntentionsAssignment_2_1 : ( ruleIntention ) ;
    public final void rule__Agent__IntentionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4146:1: ( ( ruleIntention ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4147:1: ( ruleIntention )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4147:1: ( ruleIntention )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4148:1: ruleIntention
            {
             before(grammarAccess.getAgentAccess().getIntentionsIntentionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleIntention_in_rule__Agent__IntentionsAssignment_2_18412);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4157:1: rule__Role__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Role__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4161:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4162:1: ( RULE_ID )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4162:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4163:1: RULE_ID
            {
             before(grammarAccess.getRoleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Role__NameAssignment_18443); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4172:1: rule__Role__IntentionsAssignment_2_1 : ( ruleIntention ) ;
    public final void rule__Role__IntentionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4176:1: ( ( ruleIntention ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4177:1: ( ruleIntention )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4177:1: ( ruleIntention )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4178:1: ruleIntention
            {
             before(grammarAccess.getRoleAccess().getIntentionsIntentionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleIntention_in_rule__Role__IntentionsAssignment_2_18474);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4187:1: rule__Position__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Position__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4191:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4192:1: ( RULE_ID )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4192:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4193:1: RULE_ID
            {
             before(grammarAccess.getPositionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Position__NameAssignment_18505); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4202:1: rule__Position__IntentionsAssignment_2_1 : ( ruleIntention ) ;
    public final void rule__Position__IntentionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4206:1: ( ( ruleIntention ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4207:1: ( ruleIntention )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4207:1: ( ruleIntention )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4208:1: ruleIntention
            {
             before(grammarAccess.getPositionAccess().getIntentionsIntentionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleIntention_in_rule__Position__IntentionsAssignment_2_18536);
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4217:1: rule__Goal__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Goal__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4221:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4222:1: ( RULE_ID )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4222:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4223:1: RULE_ID
            {
             before(grammarAccess.getGoalAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Goal__NameAssignment_18567); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4232:1: rule__Goal__DecompositionsAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Goal__DecompositionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4236:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4237:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4237:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4238:1: ( RULE_ID )
            {
             before(grammarAccess.getGoalAccess().getDecompositionsDecompositionCrossReference_2_1_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4239:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4240:1: RULE_ID
            {
             before(grammarAccess.getGoalAccess().getDecompositionsDecompositionIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Goal__DecompositionsAssignment_2_18602); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4251:1: rule__Softgoal__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Softgoal__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4255:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4256:1: ( RULE_ID )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4256:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4257:1: RULE_ID
            {
             before(grammarAccess.getSoftgoalAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Softgoal__NameAssignment_18637); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4266:1: rule__Task__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Task__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4270:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4271:1: ( RULE_ID )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4271:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4272:1: RULE_ID
            {
             before(grammarAccess.getTaskAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Task__NameAssignment_18668); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4281:1: rule__Resource__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Resource__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4285:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4286:1: ( RULE_ID )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4286:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4287:1: RULE_ID
            {
             before(grammarAccess.getResourceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Resource__NameAssignment_18699); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4296:1: rule__Belief__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Belief__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4300:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4301:1: ( RULE_ID )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4301:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4302:1: RULE_ID
            {
             before(grammarAccess.getBeliefAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Belief__NameAssignment_18730); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4311:1: rule__Association__SourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Association__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4315:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4316:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4316:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4317:1: ( RULE_ID )
            {
             before(grammarAccess.getAssociationAccess().getSourceContainerCrossReference_0_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4318:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4319:1: RULE_ID
            {
             before(grammarAccess.getAssociationAccess().getSourceContainerIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Association__SourceAssignment_08765); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4330:1: rule__Association__TargetAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Association__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4334:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4335:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4335:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4336:1: ( RULE_ID )
            {
             before(grammarAccess.getAssociationAccess().getTargetContainerCrossReference_2_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4337:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4338:1: RULE_ID
            {
             before(grammarAccess.getAssociationAccess().getTargetContainerIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Association__TargetAssignment_28804); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4349:1: rule__Dependency__DependencyFromAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Dependency__DependencyFromAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4353:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4354:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4354:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4355:1: ( RULE_ID )
            {
             before(grammarAccess.getDependencyAccess().getDependencyFromDependableCrossReference_0_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4356:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4357:1: RULE_ID
            {
             before(grammarAccess.getDependencyAccess().getDependencyFromDependableIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Dependency__DependencyFromAssignment_08843); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4368:1: rule__Dependency__DependencyToAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Dependency__DependencyToAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4372:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4373:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4373:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4374:1: ( RULE_ID )
            {
             before(grammarAccess.getDependencyAccess().getDependencyToDependableCrossReference_2_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4375:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4376:1: RULE_ID
            {
             before(grammarAccess.getDependencyAccess().getDependencyToDependableIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Dependency__DependencyToAssignment_28882); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4387:1: rule__AndDecomposition__TargetAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__AndDecomposition__TargetAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4391:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4392:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4392:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4393:1: ( RULE_ID )
            {
             before(grammarAccess.getAndDecompositionAccess().getTargetIntentionCrossReference_0_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4394:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4395:1: RULE_ID
            {
             before(grammarAccess.getAndDecompositionAccess().getTargetIntentionIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AndDecomposition__TargetAssignment_08921); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4406:1: rule__AndDecomposition__SourceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__AndDecomposition__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4410:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4411:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4411:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4412:1: ( RULE_ID )
            {
             before(grammarAccess.getAndDecompositionAccess().getSourceIntentionCrossReference_2_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4413:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4414:1: RULE_ID
            {
             before(grammarAccess.getAndDecompositionAccess().getSourceIntentionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AndDecomposition__SourceAssignment_28960); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4425:1: rule__OrDecomposition__TargetAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__OrDecomposition__TargetAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4429:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4430:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4430:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4431:1: ( RULE_ID )
            {
             before(grammarAccess.getOrDecompositionAccess().getTargetIntentionCrossReference_0_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4432:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4433:1: RULE_ID
            {
             before(grammarAccess.getOrDecompositionAccess().getTargetIntentionIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__OrDecomposition__TargetAssignment_08999); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4444:1: rule__OrDecomposition__SourceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__OrDecomposition__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4448:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4449:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4449:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4450:1: ( RULE_ID )
            {
             before(grammarAccess.getOrDecompositionAccess().getSourceIntentionCrossReference_2_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4451:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4452:1: RULE_ID
            {
             before(grammarAccess.getOrDecompositionAccess().getSourceIntentionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__OrDecomposition__SourceAssignment_29038); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4463:1: rule__AndContribution__SourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__AndContribution__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4467:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4468:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4468:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4469:1: ( RULE_ID )
            {
             before(grammarAccess.getAndContributionAccess().getSourceIntentionCrossReference_0_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4470:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4471:1: RULE_ID
            {
             before(grammarAccess.getAndContributionAccess().getSourceIntentionIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AndContribution__SourceAssignment_09077); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4482:1: rule__AndContribution__TargetAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__AndContribution__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4486:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4487:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4487:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4488:1: ( RULE_ID )
            {
             before(grammarAccess.getAndContributionAccess().getTargetIntentionCrossReference_2_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4489:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4490:1: RULE_ID
            {
             before(grammarAccess.getAndContributionAccess().getTargetIntentionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AndContribution__TargetAssignment_29116); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4501:1: rule__OrContribution__SourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__OrContribution__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4505:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4506:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4506:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4507:1: ( RULE_ID )
            {
             before(grammarAccess.getOrContributionAccess().getSourceIntentionCrossReference_0_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4508:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4509:1: RULE_ID
            {
             before(grammarAccess.getOrContributionAccess().getSourceIntentionIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__OrContribution__SourceAssignment_09155); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4520:1: rule__OrContribution__TargetAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__OrContribution__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4524:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4525:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4525:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4526:1: ( RULE_ID )
            {
             before(grammarAccess.getOrContributionAccess().getTargetIntentionCrossReference_2_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4527:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4528:1: RULE_ID
            {
             before(grammarAccess.getOrContributionAccess().getTargetIntentionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__OrContribution__TargetAssignment_29194); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4539:1: rule__HelpContribution__SourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__HelpContribution__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4543:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4544:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4544:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4545:1: ( RULE_ID )
            {
             before(grammarAccess.getHelpContributionAccess().getSourceIntentionCrossReference_0_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4546:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4547:1: RULE_ID
            {
             before(grammarAccess.getHelpContributionAccess().getSourceIntentionIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__HelpContribution__SourceAssignment_09233); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4558:1: rule__HelpContribution__TargetAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__HelpContribution__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4562:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4563:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4563:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4564:1: ( RULE_ID )
            {
             before(grammarAccess.getHelpContributionAccess().getTargetIntentionCrossReference_2_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4565:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4566:1: RULE_ID
            {
             before(grammarAccess.getHelpContributionAccess().getTargetIntentionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__HelpContribution__TargetAssignment_29272); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4577:1: rule__MakeContribution__SourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__MakeContribution__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4581:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4582:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4582:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4583:1: ( RULE_ID )
            {
             before(grammarAccess.getMakeContributionAccess().getSourceIntentionCrossReference_0_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4584:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4585:1: RULE_ID
            {
             before(grammarAccess.getMakeContributionAccess().getSourceIntentionIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MakeContribution__SourceAssignment_09311); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4596:1: rule__MakeContribution__TargetAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__MakeContribution__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4600:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4601:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4601:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4602:1: ( RULE_ID )
            {
             before(grammarAccess.getMakeContributionAccess().getTargetIntentionCrossReference_2_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4603:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4604:1: RULE_ID
            {
             before(grammarAccess.getMakeContributionAccess().getTargetIntentionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MakeContribution__TargetAssignment_29350); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4615:1: rule__HurtContribution__SourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__HurtContribution__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4619:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4620:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4620:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4621:1: ( RULE_ID )
            {
             before(grammarAccess.getHurtContributionAccess().getSourceIntentionCrossReference_0_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4622:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4623:1: RULE_ID
            {
             before(grammarAccess.getHurtContributionAccess().getSourceIntentionIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__HurtContribution__SourceAssignment_09389); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4634:1: rule__HurtContribution__TargetAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__HurtContribution__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4638:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4639:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4639:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4640:1: ( RULE_ID )
            {
             before(grammarAccess.getHurtContributionAccess().getTargetIntentionCrossReference_2_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4641:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4642:1: RULE_ID
            {
             before(grammarAccess.getHurtContributionAccess().getTargetIntentionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__HurtContribution__TargetAssignment_29428); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4653:1: rule__BreakContribution__SourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__BreakContribution__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4657:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4658:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4658:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4659:1: ( RULE_ID )
            {
             before(grammarAccess.getBreakContributionAccess().getSourceIntentionCrossReference_0_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4660:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4661:1: RULE_ID
            {
             before(grammarAccess.getBreakContributionAccess().getSourceIntentionIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BreakContribution__SourceAssignment_09467); 
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
    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4672:1: rule__BreakContribution__TargetAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__BreakContribution__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4676:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4677:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4677:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4678:1: ( RULE_ID )
            {
             before(grammarAccess.getBreakContributionAccess().getTargetIntentionCrossReference_2_0()); 
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4679:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4680:1: RULE_ID
            {
             before(grammarAccess.getBreakContributionAccess().getTargetIntentionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BreakContribution__TargetAssignment_29506); 
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
    public static final BitSet FOLLOW_rule__Node__Group_3_1_4__0_in_rule__Node__Alternatives_3_11983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ContainersAssignment_3_0_in_rule__Model__Alternatives_32016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__IntentionsAssignment_3_1_in_rule__Model__Alternatives_32034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__DecompositionsAssignment_3_2_in_rule__Model__Alternatives_32052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__DependenciesAssignment_3_3_in_rule__Model__Alternatives_32070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ContributionsAssignment_3_4_in_rule__Model__Alternatives_32088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__AssociationsAssignment_3_5_in_rule__Model__Alternatives_32106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActor_in_rule__Container__Alternatives2139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAgent_in_rule__Container__Alternatives2156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRole_in_rule__Container__Alternatives2173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePosition_in_rule__Container__Alternatives2190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actor__Is_aAssignment_2_0_in_rule__Actor__Alternatives_22222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actor__Is_part_ofAssignment_2_1_in_rule__Actor__Alternatives_22240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoal_in_rule__Intention__Alternatives2273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSoftgoal_in_rule__Intention__Alternatives2290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTask_in_rule__Intention__Alternatives2307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResource_in_rule__Intention__Alternatives2324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBelief_in_rule__Intention__Alternatives2341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndDecomposition_in_rule__Decomposition__Alternatives2374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrDecomposition_in_rule__Decomposition__Alternatives2391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndContribution_in_rule__Contribution__Alternatives2423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrContribution_in_rule__Contribution__Alternatives2440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHelpContribution_in_rule__Contribution__Alternatives2457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHurtContribution_in_rule__Contribution__Alternatives2474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMakeContribution_in_rule__Contribution__Alternatives2491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBreakContribution_in_rule__Contribution__Alternatives2508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__NodeType__Alternatives2541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__NodeType__Alternatives2562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__NodeType__Alternatives2583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__NodeType__Alternatives2604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__NodeType__Alternatives2625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__NodeType__Alternatives2646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__NodeType__Alternatives2667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__PhenomenonType__Alternatives2703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__PhenomenonType__Alternatives2724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__PhenomenonType__Alternatives2745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__LinkType__Alternatives2781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__LinkType__Alternatives2802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__LinkType__Alternatives2823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__Group_0__0_in_rule__ProblemDiagram__Group__02860 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__Group__1_in_rule__ProblemDiagram__Group__02870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__Alternatives_1_in_rule__ProblemDiagram__Group__12898 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_24_in_rule__ProblemDiagram__Group_0__02938 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__Group_0__1_in_rule__ProblemDiagram__Group_0__02948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ProblemDiagram__Group_0__12977 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__Group_0__2_in_rule__ProblemDiagram__Group_0__12987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__DescriptionAssignment_0_2_in_rule__ProblemDiagram__Group_0__23015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__NameAssignment_0_in_rule__Node__Group__03055 = new BitSet(new long[]{0x000000000603F802L});
    public static final BitSet FOLLOW_rule__Node__Group__1_in_rule__Node__Group__03064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__TypeAssignment_1_in_rule__Node__Group__13092 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_rule__Node__Group__2_in_rule__Node__Group__13102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_2__0_in_rule__Node__Group__23130 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Node__Group__3_in_rule__Node__Group__23140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3__0_in_rule__Node__Group__33168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Node__Group_2__03212 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Node__Group_2__1_in_rule__Node__Group_2__03222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__DescriptionAssignment_2_1_in_rule__Node__Group_2__13250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Node__Group_3__03289 = new BitSet(new long[]{0x00000001191C0020L});
    public static final BitSet FOLLOW_rule__Node__Group_3__1_in_rule__Node__Group_3__03299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Alternatives_3_1_in_rule__Node__Group_3__13327 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Node__Group_3__2_in_rule__Node__Group_3__13336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Node__Group_3__23365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Node__Group_3_1_1__03407 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Node__Group_3_1_1__1_in_rule__Node__Group_3_1_1__03417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Node__Group_3_1_1__13446 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Node__Group_3_1_1__2_in_rule__Node__Group_3_1_1__13456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__ProblemRefAssignment_3_1_1_2_in_rule__Node__Group_3_1_1__23484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Node__Group_3_1_3__03525 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Node__Group_3_1_3__1_in_rule__Node__Group_3_1_3__03535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Node__Group_3_1_3__13564 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Node__Group_3_1_3__2_in_rule__Node__Group_3_1_3__13574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__IstarRefAssignment_3_1_3_2_in_rule__Node__Group_3_1_3__23602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__HiddenPhenomenaAssignment_3_1_4_0_in_rule__Node__Group_3_1_4__03642 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3_1_4__1_in_rule__Node__Group_3_1_4__03651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3_1_4_1__0_in_rule__Node__Group_3_1_4__13679 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_rule__Node__Group_3_1_4_1__03719 = new BitSet(new long[]{0x00000000001C0020L});
    public static final BitSet FOLLOW_rule__Node__Group_3_1_4_1__1_in_rule__Node__Group_3_1_4_1__03729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__HiddenPhenomenaAssignment_3_1_4_1_1_in_rule__Node__Group_3_1_4_1__13757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Phenomenon__TypeAssignment_0_in_rule__Phenomenon__Group__03795 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Phenomenon__Group__1_in_rule__Phenomenon__Group__03805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Phenomenon__NameAssignment_1_in_rule__Phenomenon__Group__13833 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Phenomenon__Group__2_in_rule__Phenomenon__Group__13842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Phenomenon__Group_2__0_in_rule__Phenomenon__Group__23870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Phenomenon__Group_2__03912 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Phenomenon__Group_2__1_in_rule__Phenomenon__Group_2__03922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Phenomenon__DescriptionAssignment_2_1_in_rule__Phenomenon__Group_2__13950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__FromAssignment_0_in_rule__Link__Group__03988 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_rule__Link__Group__1_in_rule__Link__Group__03997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__TypeAssignment_1_in_rule__Link__Group__14025 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Link__Group__2_in_rule__Link__Group__14034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__ToAssignment_2_in_rule__Link__Group__24062 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_rule__Link__Group__3_in_rule__Link__Group__24071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group_3__0_in_rule__Link__Group__34099 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Link__Group__4_in_rule__Link__Group__34109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group_4__0_in_rule__Link__Group__44137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Link__Group_3__04183 = new BitSet(new long[]{0x00000000001C0020L});
    public static final BitSet FOLLOW_rule__Link__Group_3__1_in_rule__Link__Group_3__04193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__PhenomenaAssignment_3_1_in_rule__Link__Group_3__14221 = new BitSet(new long[]{0x0000000088000000L});
    public static final BitSet FOLLOW_rule__Link__Group_3__2_in_rule__Link__Group_3__14230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group_3_2__0_in_rule__Link__Group_3__24258 = new BitSet(new long[]{0x0000000088000000L});
    public static final BitSet FOLLOW_rule__Link__Group_3__3_in_rule__Link__Group_3__24268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Link__Group_3__34297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Link__Group_3_2__04341 = new BitSet(new long[]{0x00000000001C0020L});
    public static final BitSet FOLLOW_rule__Link__Group_3_2__1_in_rule__Link__Group_3_2__04351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__PhenomenaAssignment_3_2_1_in_rule__Link__Group_3_2__14379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Link__Group_4__04418 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Link__Group_4__1_in_rule__Link__Group_4__04428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__DescriptionAssignment_4_1_in_rule__Link__Group_4__14456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Model__Group__04495 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__04505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__NameAssignment_1_in_rule__Model__Group__14533 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__14543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Model__Group__24572 = new BitSet(new long[]{0x000003FE00000022L});
    public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__24582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Alternatives_3_in_rule__Model__Group__34610 = new BitSet(new long[]{0x000003FE00000022L});
    public static final BitSet FOLLOW_33_in_rule__Actor__Group__04654 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Actor__Group__1_in_rule__Actor__Group__04664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actor__NameAssignment_1_in_rule__Actor__Group__14692 = new BitSet(new long[]{0x0000000004000022L});
    public static final BitSet FOLLOW_rule__Actor__Group__2_in_rule__Actor__Group__14701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actor__Alternatives_2_in_rule__Actor__Group__24729 = new BitSet(new long[]{0x0000000004000022L});
    public static final BitSet FOLLOW_rule__Actor__Group__3_in_rule__Actor__Group__24739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actor__Group_3__0_in_rule__Actor__Group__34767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Actor__Group_3__04811 = new BitSet(new long[]{0x000003E008000000L});
    public static final BitSet FOLLOW_rule__Actor__Group_3__1_in_rule__Actor__Group_3__04821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actor__IntentionsAssignment_3_1_in_rule__Actor__Group_3__14849 = new BitSet(new long[]{0x000003E008000000L});
    public static final BitSet FOLLOW_rule__Actor__Group_3__2_in_rule__Actor__Group_3__14859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Actor__Group_3__24888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Agent__Group__04930 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Agent__Group__1_in_rule__Agent__Group__04940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Agent__NameAssignment_1_in_rule__Agent__Group__14968 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Agent__Group__2_in_rule__Agent__Group__14977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Agent__Group_2__0_in_rule__Agent__Group__25005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Agent__Group_2__05047 = new BitSet(new long[]{0x000003E008000000L});
    public static final BitSet FOLLOW_rule__Agent__Group_2__1_in_rule__Agent__Group_2__05057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Agent__IntentionsAssignment_2_1_in_rule__Agent__Group_2__15085 = new BitSet(new long[]{0x000003E008000000L});
    public static final BitSet FOLLOW_rule__Agent__Group_2__2_in_rule__Agent__Group_2__15095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Agent__Group_2__25124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Role__Group__05166 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Role__Group__1_in_rule__Role__Group__05176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__NameAssignment_1_in_rule__Role__Group__15204 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Role__Group__2_in_rule__Role__Group__15213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group_2__0_in_rule__Role__Group__25241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Role__Group_2__05283 = new BitSet(new long[]{0x000003E008000000L});
    public static final BitSet FOLLOW_rule__Role__Group_2__1_in_rule__Role__Group_2__05293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__IntentionsAssignment_2_1_in_rule__Role__Group_2__15321 = new BitSet(new long[]{0x000003E008000000L});
    public static final BitSet FOLLOW_rule__Role__Group_2__2_in_rule__Role__Group_2__15331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Role__Group_2__25360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Position__Group__05402 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Position__Group__1_in_rule__Position__Group__05412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Position__NameAssignment_1_in_rule__Position__Group__15440 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Position__Group__2_in_rule__Position__Group__15449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Position__Group_2__0_in_rule__Position__Group__25477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Position__Group_2__05519 = new BitSet(new long[]{0x000003E008000000L});
    public static final BitSet FOLLOW_rule__Position__Group_2__1_in_rule__Position__Group_2__05529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Position__IntentionsAssignment_2_1_in_rule__Position__Group_2__15557 = new BitSet(new long[]{0x000003E008000000L});
    public static final BitSet FOLLOW_rule__Position__Group_2__2_in_rule__Position__Group_2__15567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Position__Group_2__25596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Goal__Group__05638 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Goal__Group__1_in_rule__Goal__Group__05648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goal__NameAssignment_1_in_rule__Goal__Group__15676 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Goal__Group__2_in_rule__Goal__Group__15685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goal__Group_2__0_in_rule__Goal__Group__25713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Goal__Group_2__05755 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_rule__Goal__Group_2__1_in_rule__Goal__Group_2__05765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goal__DecompositionsAssignment_2_1_in_rule__Goal__Group_2__15793 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_rule__Goal__Group_2__2_in_rule__Goal__Group_2__15803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Goal__Group_2__25832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Softgoal__Group__05874 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Softgoal__Group__1_in_rule__Softgoal__Group__05884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Softgoal__NameAssignment_1_in_rule__Softgoal__Group__15912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Task__Group__05951 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Task__Group__1_in_rule__Task__Group__05961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__NameAssignment_1_in_rule__Task__Group__15989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Resource__Group__06028 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Resource__Group__1_in_rule__Resource__Group__06038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__NameAssignment_1_in_rule__Resource__Group__16066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Belief__Group__06105 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Belief__Group__1_in_rule__Belief__Group__06115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Belief__NameAssignment_1_in_rule__Belief__Group__16143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__SourceAssignment_0_in_rule__Association__Group__06181 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__Association__Group__1_in_rule__Association__Group__06190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Association__Group__16219 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Association__Group__2_in_rule__Association__Group__16229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__TargetAssignment_2_in_rule__Association__Group__26257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dependency__DependencyFromAssignment_0_in_rule__Dependency__Group__06297 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Dependency__Group__1_in_rule__Dependency__Group__06306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Dependency__Group__16335 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Dependency__Group__2_in_rule__Dependency__Group__16345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dependency__DependencyToAssignment_2_in_rule__Dependency__Group__26373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndDecomposition__TargetAssignment_0_in_rule__AndDecomposition__Group__06413 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__AndDecomposition__Group__1_in_rule__AndDecomposition__Group__06422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__AndDecomposition__Group__16451 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AndDecomposition__Group__2_in_rule__AndDecomposition__Group__16461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndDecomposition__SourceAssignment_2_in_rule__AndDecomposition__Group__26489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrDecomposition__TargetAssignment_0_in_rule__OrDecomposition__Group__06529 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__OrDecomposition__Group__1_in_rule__OrDecomposition__Group__06538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__OrDecomposition__Group__16567 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__OrDecomposition__Group__2_in_rule__OrDecomposition__Group__16577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrDecomposition__SourceAssignment_2_in_rule__OrDecomposition__Group__26605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndContribution__SourceAssignment_0_in_rule__AndContribution__Group__06645 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__AndContribution__Group__1_in_rule__AndContribution__Group__06654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__AndContribution__Group__16683 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AndContribution__Group__2_in_rule__AndContribution__Group__16693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndContribution__TargetAssignment_2_in_rule__AndContribution__Group__26721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrContribution__SourceAssignment_0_in_rule__OrContribution__Group__06761 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__OrContribution__Group__1_in_rule__OrContribution__Group__06770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__OrContribution__Group__16799 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__OrContribution__Group__2_in_rule__OrContribution__Group__16809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrContribution__TargetAssignment_2_in_rule__OrContribution__Group__26837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HelpContribution__SourceAssignment_0_in_rule__HelpContribution__Group__06877 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__HelpContribution__Group__1_in_rule__HelpContribution__Group__06886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__HelpContribution__Group__16915 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__HelpContribution__Group__2_in_rule__HelpContribution__Group__16925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HelpContribution__TargetAssignment_2_in_rule__HelpContribution__Group__26953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MakeContribution__SourceAssignment_0_in_rule__MakeContribution__Group__06993 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__MakeContribution__Group__1_in_rule__MakeContribution__Group__07002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__MakeContribution__Group__17031 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MakeContribution__Group__2_in_rule__MakeContribution__Group__17041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MakeContribution__TargetAssignment_2_in_rule__MakeContribution__Group__27069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HurtContribution__SourceAssignment_0_in_rule__HurtContribution__Group__07109 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__HurtContribution__Group__1_in_rule__HurtContribution__Group__07118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__HurtContribution__Group__17147 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__HurtContribution__Group__2_in_rule__HurtContribution__Group__17157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HurtContribution__TargetAssignment_2_in_rule__HurtContribution__Group__27185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BreakContribution__SourceAssignment_0_in_rule__BreakContribution__Group__07225 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__BreakContribution__Group__1_in_rule__BreakContribution__Group__07234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__BreakContribution__Group__17263 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__BreakContribution__Group__2_in_rule__BreakContribution__Group__17273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BreakContribution__TargetAssignment_2_in_rule__BreakContribution__Group__27301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ProblemDiagram__DescriptionAssignment_0_27341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_rule__ProblemDiagram__NodesAssignment_1_07372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_rule__ProblemDiagram__LinksAssignment_1_17403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Node__NameAssignment_07434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeType_in_rule__Node__TypeAssignment_17465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Node__DescriptionAssignment_2_17496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProblemDiagram_in_rule__Node__SubproblemAssignment_3_1_07527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Node__ProblemRefAssignment_3_1_1_27562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModel_in_rule__Node__IstarAssignment_3_1_27597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Node__IstarRefAssignment_3_1_3_27632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhenomenon_in_rule__Node__HiddenPhenomenaAssignment_3_1_4_07667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhenomenon_in_rule__Node__HiddenPhenomenaAssignment_3_1_4_1_17698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhenomenonType_in_rule__Phenomenon__TypeAssignment_07729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Phenomenon__NameAssignment_17760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Phenomenon__DescriptionAssignment_2_17791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Link__FromAssignment_07826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkType_in_rule__Link__TypeAssignment_17861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Link__ToAssignment_27896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhenomenon_in_rule__Link__PhenomenaAssignment_3_17931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhenomenon_in_rule__Link__PhenomenaAssignment_3_2_17962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Link__DescriptionAssignment_4_17993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Model__NameAssignment_18024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainer_in_rule__Model__ContainersAssignment_3_08055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntention_in_rule__Model__IntentionsAssignment_3_18086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecomposition_in_rule__Model__DecompositionsAssignment_3_28117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependency_in_rule__Model__DependenciesAssignment_3_38148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContribution_in_rule__Model__ContributionsAssignment_3_48179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociation_in_rule__Model__AssociationsAssignment_3_58210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Actor__NameAssignment_18241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Actor__Is_aAssignment_2_08276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Actor__Is_part_ofAssignment_2_18315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntention_in_rule__Actor__IntentionsAssignment_3_18350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Agent__NameAssignment_18381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntention_in_rule__Agent__IntentionsAssignment_2_18412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Role__NameAssignment_18443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntention_in_rule__Role__IntentionsAssignment_2_18474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Position__NameAssignment_18505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntention_in_rule__Position__IntentionsAssignment_2_18536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Goal__NameAssignment_18567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Goal__DecompositionsAssignment_2_18602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Softgoal__NameAssignment_18637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Task__NameAssignment_18668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Resource__NameAssignment_18699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Belief__NameAssignment_18730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Association__SourceAssignment_08765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Association__TargetAssignment_28804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Dependency__DependencyFromAssignment_08843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Dependency__DependencyToAssignment_28882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AndDecomposition__TargetAssignment_08921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AndDecomposition__SourceAssignment_28960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__OrDecomposition__TargetAssignment_08999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__OrDecomposition__SourceAssignment_29038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AndContribution__SourceAssignment_09077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AndContribution__TargetAssignment_29116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__OrContribution__SourceAssignment_09155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__OrContribution__TargetAssignment_29194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__HelpContribution__SourceAssignment_09233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__HelpContribution__TargetAssignment_29272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MakeContribution__SourceAssignment_09311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MakeContribution__TargetAssignment_29350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__HurtContribution__SourceAssignment_09389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__HurtContribution__TargetAssignment_29428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BreakContribution__SourceAssignment_09467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BreakContribution__TargetAssignment_29506 = new BitSet(new long[]{0x0000000000000002L});

}