package uk.ac.open.ui.contentassist.antlr.internal; 

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
import uk.ac.open.services.ProblemGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalProblemParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_QUALIFIED_NAME", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'R'", "'M'", "'B'", "'X'", "'C'", "'D'", "'P'", "'phenomenon'", "'event'", "'state'", "'--'", "'~~'", "'~>'", "'problem:'", "'for'", "'concern'", "':'", "'{'", "'}'", "','", "'see'", "'domain'", "'problem'", "'!'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=7;
    public static final int RULE_QUALIFIED_NAME=6;
    public static final int RULE_WS=10;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;

        public InternalProblemParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g"; }


     
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:61:1: entryRuleProblemDiagram : ruleProblemDiagram EOF ;
    public final void entryRuleProblemDiagram() throws RecognitionException {
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:62:1: ( ruleProblemDiagram EOF )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:63:1: ruleProblemDiagram EOF
            {
             before(grammarAccess.getProblemDiagramRule()); 
            pushFollow(FOLLOW_ruleProblemDiagram_in_entryRuleProblemDiagram61);
            ruleProblemDiagram();
            _fsp--;

             after(grammarAccess.getProblemDiagramRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProblemDiagram68); 

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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:70:1: ruleProblemDiagram : ( ( rule__ProblemDiagram__Group__0 ) ) ;
    public final void ruleProblemDiagram() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:74:2: ( ( ( rule__ProblemDiagram__Group__0 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:75:1: ( ( rule__ProblemDiagram__Group__0 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:75:1: ( ( rule__ProblemDiagram__Group__0 ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:76:1: ( rule__ProblemDiagram__Group__0 )
            {
             before(grammarAccess.getProblemDiagramAccess().getGroup()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:77:1: ( rule__ProblemDiagram__Group__0 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:77:2: rule__ProblemDiagram__Group__0
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


    // $ANTLR start entryRuleConcern
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:89:1: entryRuleConcern : ruleConcern EOF ;
    public final void entryRuleConcern() throws RecognitionException {
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:90:1: ( ruleConcern EOF )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:91:1: ruleConcern EOF
            {
             before(grammarAccess.getConcernRule()); 
            pushFollow(FOLLOW_ruleConcern_in_entryRuleConcern121);
            ruleConcern();
            _fsp--;

             after(grammarAccess.getConcernRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConcern128); 

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
    // $ANTLR end entryRuleConcern


    // $ANTLR start ruleConcern
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:98:1: ruleConcern : ( ( rule__Concern__Group__0 ) ) ;
    public final void ruleConcern() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:102:2: ( ( ( rule__Concern__Group__0 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:103:1: ( ( rule__Concern__Group__0 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:103:1: ( ( rule__Concern__Group__0 ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:104:1: ( rule__Concern__Group__0 )
            {
             before(grammarAccess.getConcernAccess().getGroup()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:105:1: ( rule__Concern__Group__0 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:105:2: rule__Concern__Group__0
            {
            pushFollow(FOLLOW_rule__Concern__Group__0_in_ruleConcern154);
            rule__Concern__Group__0();
            _fsp--;


            }

             after(grammarAccess.getConcernAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleConcern


    // $ANTLR start entryRuleNode
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:117:1: entryRuleNode : ruleNode EOF ;
    public final void entryRuleNode() throws RecognitionException {
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:118:1: ( ruleNode EOF )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:119:1: ruleNode EOF
            {
             before(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_ruleNode_in_entryRuleNode181);
            ruleNode();
            _fsp--;

             after(grammarAccess.getNodeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNode188); 

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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:126:1: ruleNode : ( ( rule__Node__Group__0 ) ) ;
    public final void ruleNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:130:2: ( ( ( rule__Node__Group__0 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:131:1: ( ( rule__Node__Group__0 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:131:1: ( ( rule__Node__Group__0 ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:132:1: ( rule__Node__Group__0 )
            {
             before(grammarAccess.getNodeAccess().getGroup()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:133:1: ( rule__Node__Group__0 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:133:2: rule__Node__Group__0
            {
            pushFollow(FOLLOW_rule__Node__Group__0_in_ruleNode214);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:145:1: entryRulePhenomenon : rulePhenomenon EOF ;
    public final void entryRulePhenomenon() throws RecognitionException {
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:146:1: ( rulePhenomenon EOF )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:147:1: rulePhenomenon EOF
            {
             before(grammarAccess.getPhenomenonRule()); 
            pushFollow(FOLLOW_rulePhenomenon_in_entryRulePhenomenon241);
            rulePhenomenon();
            _fsp--;

             after(grammarAccess.getPhenomenonRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePhenomenon248); 

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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:154:1: rulePhenomenon : ( ( rule__Phenomenon__Group__0 ) ) ;
    public final void rulePhenomenon() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:158:2: ( ( ( rule__Phenomenon__Group__0 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:159:1: ( ( rule__Phenomenon__Group__0 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:159:1: ( ( rule__Phenomenon__Group__0 ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:160:1: ( rule__Phenomenon__Group__0 )
            {
             before(grammarAccess.getPhenomenonAccess().getGroup()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:161:1: ( rule__Phenomenon__Group__0 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:161:2: rule__Phenomenon__Group__0
            {
            pushFollow(FOLLOW_rule__Phenomenon__Group__0_in_rulePhenomenon274);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:173:1: entryRuleLink : ruleLink EOF ;
    public final void entryRuleLink() throws RecognitionException {
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:174:1: ( ruleLink EOF )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:175:1: ruleLink EOF
            {
             before(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_ruleLink_in_entryRuleLink301);
            ruleLink();
            _fsp--;

             after(grammarAccess.getLinkRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLink308); 

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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:182:1: ruleLink : ( ( rule__Link__Group__0 ) ) ;
    public final void ruleLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:186:2: ( ( ( rule__Link__Group__0 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:187:1: ( ( rule__Link__Group__0 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:187:1: ( ( rule__Link__Group__0 ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:188:1: ( rule__Link__Group__0 )
            {
             before(grammarAccess.getLinkAccess().getGroup()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:189:1: ( rule__Link__Group__0 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:189:2: rule__Link__Group__0
            {
            pushFollow(FOLLOW_rule__Link__Group__0_in_ruleLink334);
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


    // $ANTLR start ruleNodeType
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:202:1: ruleNodeType : ( ( rule__NodeType__Alternatives ) ) ;
    public final void ruleNodeType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:206:1: ( ( ( rule__NodeType__Alternatives ) ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:207:1: ( ( rule__NodeType__Alternatives ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:207:1: ( ( rule__NodeType__Alternatives ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:208:1: ( rule__NodeType__Alternatives )
            {
             before(grammarAccess.getNodeTypeAccess().getAlternatives()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:209:1: ( rule__NodeType__Alternatives )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:209:2: rule__NodeType__Alternatives
            {
            pushFollow(FOLLOW_rule__NodeType__Alternatives_in_ruleNodeType371);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:221:1: rulePhenomenonType : ( ( rule__PhenomenonType__Alternatives ) ) ;
    public final void rulePhenomenonType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:225:1: ( ( ( rule__PhenomenonType__Alternatives ) ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:226:1: ( ( rule__PhenomenonType__Alternatives ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:226:1: ( ( rule__PhenomenonType__Alternatives ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:227:1: ( rule__PhenomenonType__Alternatives )
            {
             before(grammarAccess.getPhenomenonTypeAccess().getAlternatives()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:228:1: ( rule__PhenomenonType__Alternatives )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:228:2: rule__PhenomenonType__Alternatives
            {
            pushFollow(FOLLOW_rule__PhenomenonType__Alternatives_in_rulePhenomenonType407);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:240:1: ruleLinkType : ( ( rule__LinkType__Alternatives ) ) ;
    public final void ruleLinkType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:244:1: ( ( ( rule__LinkType__Alternatives ) ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:245:1: ( ( rule__LinkType__Alternatives ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:245:1: ( ( rule__LinkType__Alternatives ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:246:1: ( rule__LinkType__Alternatives )
            {
             before(grammarAccess.getLinkTypeAccess().getAlternatives()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:247:1: ( rule__LinkType__Alternatives )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:247:2: rule__LinkType__Alternatives
            {
            pushFollow(FOLLOW_rule__LinkType__Alternatives_in_ruleLinkType443);
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


    // $ANTLR start rule__ProblemDiagram__Alternatives_3
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:258:1: rule__ProblemDiagram__Alternatives_3 : ( ( ( rule__ProblemDiagram__NodesAssignment_3_0 ) ) | ( ( rule__ProblemDiagram__LinksAssignment_3_1 ) ) );
    public final void rule__ProblemDiagram__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:262:1: ( ( ( rule__ProblemDiagram__NodesAssignment_3_0 ) ) | ( ( rule__ProblemDiagram__LinksAssignment_3_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==EOF||(LA1_1>=RULE_ID && LA1_1<=RULE_STRING)||(LA1_1>=12 && LA1_1<=18)||LA1_1==25||(LA1_1>=27 && LA1_1<=30)||LA1_1==32) ) {
                    alt1=1;
                }
                else if ( ((LA1_1>=22 && LA1_1<=24)) ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("258:1: rule__ProblemDiagram__Alternatives_3 : ( ( ( rule__ProblemDiagram__NodesAssignment_3_0 ) ) | ( ( rule__ProblemDiagram__LinksAssignment_3_1 ) ) );", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("258:1: rule__ProblemDiagram__Alternatives_3 : ( ( ( rule__ProblemDiagram__NodesAssignment_3_0 ) ) | ( ( rule__ProblemDiagram__LinksAssignment_3_1 ) ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:263:1: ( ( rule__ProblemDiagram__NodesAssignment_3_0 ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:263:1: ( ( rule__ProblemDiagram__NodesAssignment_3_0 ) )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:264:1: ( rule__ProblemDiagram__NodesAssignment_3_0 )
                    {
                     before(grammarAccess.getProblemDiagramAccess().getNodesAssignment_3_0()); 
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:265:1: ( rule__ProblemDiagram__NodesAssignment_3_0 )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:265:2: rule__ProblemDiagram__NodesAssignment_3_0
                    {
                    pushFollow(FOLLOW_rule__ProblemDiagram__NodesAssignment_3_0_in_rule__ProblemDiagram__Alternatives_3478);
                    rule__ProblemDiagram__NodesAssignment_3_0();
                    _fsp--;


                    }

                     after(grammarAccess.getProblemDiagramAccess().getNodesAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:269:6: ( ( rule__ProblemDiagram__LinksAssignment_3_1 ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:269:6: ( ( rule__ProblemDiagram__LinksAssignment_3_1 ) )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:270:1: ( rule__ProblemDiagram__LinksAssignment_3_1 )
                    {
                     before(grammarAccess.getProblemDiagramAccess().getLinksAssignment_3_1()); 
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:271:1: ( rule__ProblemDiagram__LinksAssignment_3_1 )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:271:2: rule__ProblemDiagram__LinksAssignment_3_1
                    {
                    pushFollow(FOLLOW_rule__ProblemDiagram__LinksAssignment_3_1_in_rule__ProblemDiagram__Alternatives_3496);
                    rule__ProblemDiagram__LinksAssignment_3_1();
                    _fsp--;


                    }

                     after(grammarAccess.getProblemDiagramAccess().getLinksAssignment_3_1()); 

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
    // $ANTLR end rule__ProblemDiagram__Alternatives_3


    // $ANTLR start rule__Node__Alternatives_3_2
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:280:1: rule__Node__Alternatives_3_2 : ( ( ( rule__Node__SubproblemAssignment_3_2_0 ) ) | ( ( rule__Node__Group_3_2_1__0 ) ) | ( ( rule__Node__Group_3_2_2__0 ) ) | ( ( rule__Node__Group_3_2_3__0 ) ) | ( ( rule__Node__ConcernsAssignment_3_2_4 ) ) );
    public final void rule__Node__Alternatives_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:284:1: ( ( ( rule__Node__SubproblemAssignment_3_2_0 ) ) | ( ( rule__Node__Group_3_2_1__0 ) ) | ( ( rule__Node__Group_3_2_2__0 ) ) | ( ( rule__Node__Group_3_2_3__0 ) ) | ( ( rule__Node__ConcernsAssignment_3_2_4 ) ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt2=1;
                }
                break;
            case 32:
                {
                switch ( input.LA(2) ) {
                case RULE_STRING:
                    {
                    alt2=4;
                    }
                    break;
                case 33:
                    {
                    alt2=2;
                    }
                    break;
                case 34:
                    {
                    alt2=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("280:1: rule__Node__Alternatives_3_2 : ( ( ( rule__Node__SubproblemAssignment_3_2_0 ) ) | ( ( rule__Node__Group_3_2_1__0 ) ) | ( ( rule__Node__Group_3_2_2__0 ) ) | ( ( rule__Node__Group_3_2_3__0 ) ) | ( ( rule__Node__ConcernsAssignment_3_2_4 ) ) );", 2, 2, input);

                    throw nvae;
                }

                }
                break;
            case 27:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("280:1: rule__Node__Alternatives_3_2 : ( ( ( rule__Node__SubproblemAssignment_3_2_0 ) ) | ( ( rule__Node__Group_3_2_1__0 ) ) | ( ( rule__Node__Group_3_2_2__0 ) ) | ( ( rule__Node__Group_3_2_3__0 ) ) | ( ( rule__Node__ConcernsAssignment_3_2_4 ) ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:285:1: ( ( rule__Node__SubproblemAssignment_3_2_0 ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:285:1: ( ( rule__Node__SubproblemAssignment_3_2_0 ) )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:286:1: ( rule__Node__SubproblemAssignment_3_2_0 )
                    {
                     before(grammarAccess.getNodeAccess().getSubproblemAssignment_3_2_0()); 
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:287:1: ( rule__Node__SubproblemAssignment_3_2_0 )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:287:2: rule__Node__SubproblemAssignment_3_2_0
                    {
                    pushFollow(FOLLOW_rule__Node__SubproblemAssignment_3_2_0_in_rule__Node__Alternatives_3_2529);
                    rule__Node__SubproblemAssignment_3_2_0();
                    _fsp--;


                    }

                     after(grammarAccess.getNodeAccess().getSubproblemAssignment_3_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:291:6: ( ( rule__Node__Group_3_2_1__0 ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:291:6: ( ( rule__Node__Group_3_2_1__0 ) )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:292:1: ( rule__Node__Group_3_2_1__0 )
                    {
                     before(grammarAccess.getNodeAccess().getGroup_3_2_1()); 
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:293:1: ( rule__Node__Group_3_2_1__0 )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:293:2: rule__Node__Group_3_2_1__0
                    {
                    pushFollow(FOLLOW_rule__Node__Group_3_2_1__0_in_rule__Node__Alternatives_3_2547);
                    rule__Node__Group_3_2_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getNodeAccess().getGroup_3_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:297:6: ( ( rule__Node__Group_3_2_2__0 ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:297:6: ( ( rule__Node__Group_3_2_2__0 ) )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:298:1: ( rule__Node__Group_3_2_2__0 )
                    {
                     before(grammarAccess.getNodeAccess().getGroup_3_2_2()); 
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:299:1: ( rule__Node__Group_3_2_2__0 )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:299:2: rule__Node__Group_3_2_2__0
                    {
                    pushFollow(FOLLOW_rule__Node__Group_3_2_2__0_in_rule__Node__Alternatives_3_2565);
                    rule__Node__Group_3_2_2__0();
                    _fsp--;


                    }

                     after(grammarAccess.getNodeAccess().getGroup_3_2_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:303:6: ( ( rule__Node__Group_3_2_3__0 ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:303:6: ( ( rule__Node__Group_3_2_3__0 ) )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:304:1: ( rule__Node__Group_3_2_3__0 )
                    {
                     before(grammarAccess.getNodeAccess().getGroup_3_2_3()); 
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:305:1: ( rule__Node__Group_3_2_3__0 )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:305:2: rule__Node__Group_3_2_3__0
                    {
                    pushFollow(FOLLOW_rule__Node__Group_3_2_3__0_in_rule__Node__Alternatives_3_2583);
                    rule__Node__Group_3_2_3__0();
                    _fsp--;


                    }

                     after(grammarAccess.getNodeAccess().getGroup_3_2_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:309:6: ( ( rule__Node__ConcernsAssignment_3_2_4 ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:309:6: ( ( rule__Node__ConcernsAssignment_3_2_4 ) )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:310:1: ( rule__Node__ConcernsAssignment_3_2_4 )
                    {
                     before(grammarAccess.getNodeAccess().getConcernsAssignment_3_2_4()); 
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:311:1: ( rule__Node__ConcernsAssignment_3_2_4 )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:311:2: rule__Node__ConcernsAssignment_3_2_4
                    {
                    pushFollow(FOLLOW_rule__Node__ConcernsAssignment_3_2_4_in_rule__Node__Alternatives_3_2601);
                    rule__Node__ConcernsAssignment_3_2_4();
                    _fsp--;


                    }

                     after(grammarAccess.getNodeAccess().getConcernsAssignment_3_2_4()); 

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
    // $ANTLR end rule__Node__Alternatives_3_2


    // $ANTLR start rule__NodeType__Alternatives
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:320:1: rule__NodeType__Alternatives : ( ( ( 'R' ) ) | ( ( 'M' ) ) | ( ( 'B' ) ) | ( ( 'X' ) ) | ( ( 'C' ) ) | ( ( 'D' ) ) | ( ( 'P' ) ) );
    public final void rule__NodeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:324:1: ( ( ( 'R' ) ) | ( ( 'M' ) ) | ( ( 'B' ) ) | ( ( 'X' ) ) | ( ( 'C' ) ) | ( ( 'D' ) ) | ( ( 'P' ) ) )
            int alt3=7;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt3=1;
                }
                break;
            case 13:
                {
                alt3=2;
                }
                break;
            case 14:
                {
                alt3=3;
                }
                break;
            case 15:
                {
                alt3=4;
                }
                break;
            case 16:
                {
                alt3=5;
                }
                break;
            case 17:
                {
                alt3=6;
                }
                break;
            case 18:
                {
                alt3=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("320:1: rule__NodeType__Alternatives : ( ( ( 'R' ) ) | ( ( 'M' ) ) | ( ( 'B' ) ) | ( ( 'X' ) ) | ( ( 'C' ) ) | ( ( 'D' ) ) | ( ( 'P' ) ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:325:1: ( ( 'R' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:325:1: ( ( 'R' ) )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:326:1: ( 'R' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getREQUIREMENTEnumLiteralDeclaration_0()); 
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:327:1: ( 'R' )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:327:3: 'R'
                    {
                    match(input,12,FOLLOW_12_in_rule__NodeType__Alternatives635); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getREQUIREMENTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:332:6: ( ( 'M' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:332:6: ( ( 'M' ) )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:333:1: ( 'M' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getMACHINEEnumLiteralDeclaration_1()); 
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:334:1: ( 'M' )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:334:3: 'M'
                    {
                    match(input,13,FOLLOW_13_in_rule__NodeType__Alternatives656); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getMACHINEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:339:6: ( ( 'B' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:339:6: ( ( 'B' ) )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:340:1: ( 'B' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getBIDDABLEEnumLiteralDeclaration_2()); 
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:341:1: ( 'B' )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:341:3: 'B'
                    {
                    match(input,14,FOLLOW_14_in_rule__NodeType__Alternatives677); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getBIDDABLEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:346:6: ( ( 'X' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:346:6: ( ( 'X' ) )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:347:1: ( 'X' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getLEXICALEnumLiteralDeclaration_3()); 
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:348:1: ( 'X' )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:348:3: 'X'
                    {
                    match(input,15,FOLLOW_15_in_rule__NodeType__Alternatives698); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getLEXICALEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:353:6: ( ( 'C' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:353:6: ( ( 'C' ) )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:354:1: ( 'C' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getCAUSALEnumLiteralDeclaration_4()); 
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:355:1: ( 'C' )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:355:3: 'C'
                    {
                    match(input,16,FOLLOW_16_in_rule__NodeType__Alternatives719); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getCAUSALEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:360:6: ( ( 'D' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:360:6: ( ( 'D' ) )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:361:1: ( 'D' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getDESIGNEDEnumLiteralDeclaration_5()); 
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:362:1: ( 'D' )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:362:3: 'D'
                    {
                    match(input,17,FOLLOW_17_in_rule__NodeType__Alternatives740); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getDESIGNEDEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:367:6: ( ( 'P' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:367:6: ( ( 'P' ) )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:368:1: ( 'P' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getPHYSICALEnumLiteralDeclaration_6()); 
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:369:1: ( 'P' )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:369:3: 'P'
                    {
                    match(input,18,FOLLOW_18_in_rule__NodeType__Alternatives761); 

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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:379:1: rule__PhenomenonType__Alternatives : ( ( ( 'phenomenon' ) ) | ( ( 'event' ) ) | ( ( 'state' ) ) );
    public final void rule__PhenomenonType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:383:1: ( ( ( 'phenomenon' ) ) | ( ( 'event' ) ) | ( ( 'state' ) ) )
            int alt4=3;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("379:1: rule__PhenomenonType__Alternatives : ( ( ( 'phenomenon' ) ) | ( ( 'event' ) ) | ( ( 'state' ) ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:384:1: ( ( 'phenomenon' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:384:1: ( ( 'phenomenon' ) )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:385:1: ( 'phenomenon' )
                    {
                     before(grammarAccess.getPhenomenonTypeAccess().getUNSPECIFIEDEnumLiteralDeclaration_0()); 
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:386:1: ( 'phenomenon' )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:386:3: 'phenomenon'
                    {
                    match(input,19,FOLLOW_19_in_rule__PhenomenonType__Alternatives797); 

                    }

                     after(grammarAccess.getPhenomenonTypeAccess().getUNSPECIFIEDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:391:6: ( ( 'event' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:391:6: ( ( 'event' ) )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:392:1: ( 'event' )
                    {
                     before(grammarAccess.getPhenomenonTypeAccess().getEVENTEnumLiteralDeclaration_1()); 
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:393:1: ( 'event' )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:393:3: 'event'
                    {
                    match(input,20,FOLLOW_20_in_rule__PhenomenonType__Alternatives818); 

                    }

                     after(grammarAccess.getPhenomenonTypeAccess().getEVENTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:398:6: ( ( 'state' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:398:6: ( ( 'state' ) )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:399:1: ( 'state' )
                    {
                     before(grammarAccess.getPhenomenonTypeAccess().getSTATEEnumLiteralDeclaration_2()); 
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:400:1: ( 'state' )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:400:3: 'state'
                    {
                    match(input,21,FOLLOW_21_in_rule__PhenomenonType__Alternatives839); 

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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:410:1: rule__LinkType__Alternatives : ( ( ( '--' ) ) | ( ( '~~' ) ) | ( ( '~>' ) ) );
    public final void rule__LinkType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:414:1: ( ( ( '--' ) ) | ( ( '~~' ) ) | ( ( '~>' ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt5=1;
                }
                break;
            case 23:
                {
                alt5=2;
                }
                break;
            case 24:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("410:1: rule__LinkType__Alternatives : ( ( ( '--' ) ) | ( ( '~~' ) ) | ( ( '~>' ) ) );", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:415:1: ( ( '--' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:415:1: ( ( '--' ) )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:416:1: ( '--' )
                    {
                     before(grammarAccess.getLinkTypeAccess().getINTERFACEEnumLiteralDeclaration_0()); 
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:417:1: ( '--' )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:417:3: '--'
                    {
                    match(input,22,FOLLOW_22_in_rule__LinkType__Alternatives875); 

                    }

                     after(grammarAccess.getLinkTypeAccess().getINTERFACEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:422:6: ( ( '~~' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:422:6: ( ( '~~' ) )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:423:1: ( '~~' )
                    {
                     before(grammarAccess.getLinkTypeAccess().getREFERENCEEnumLiteralDeclaration_1()); 
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:424:1: ( '~~' )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:424:3: '~~'
                    {
                    match(input,23,FOLLOW_23_in_rule__LinkType__Alternatives896); 

                    }

                     after(grammarAccess.getLinkTypeAccess().getREFERENCEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:429:6: ( ( '~>' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:429:6: ( ( '~>' ) )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:430:1: ( '~>' )
                    {
                     before(grammarAccess.getLinkTypeAccess().getCONSTRAINTEnumLiteralDeclaration_2()); 
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:431:1: ( '~>' )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:431:3: '~>'
                    {
                    match(input,24,FOLLOW_24_in_rule__LinkType__Alternatives917); 

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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:443:1: rule__ProblemDiagram__Group__0 : rule__ProblemDiagram__Group__0__Impl rule__ProblemDiagram__Group__1 ;
    public final void rule__ProblemDiagram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:447:1: ( rule__ProblemDiagram__Group__0__Impl rule__ProblemDiagram__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:448:2: rule__ProblemDiagram__Group__0__Impl rule__ProblemDiagram__Group__1
            {
            pushFollow(FOLLOW_rule__ProblemDiagram__Group__0__Impl_in_rule__ProblemDiagram__Group__0950);
            rule__ProblemDiagram__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ProblemDiagram__Group__1_in_rule__ProblemDiagram__Group__0953);
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


    // $ANTLR start rule__ProblemDiagram__Group__0__Impl
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:455:1: rule__ProblemDiagram__Group__0__Impl : ( 'problem:' ) ;
    public final void rule__ProblemDiagram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:459:1: ( ( 'problem:' ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:460:1: ( 'problem:' )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:460:1: ( 'problem:' )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:461:1: 'problem:'
            {
             before(grammarAccess.getProblemDiagramAccess().getProblemKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__ProblemDiagram__Group__0__Impl981); 
             after(grammarAccess.getProblemDiagramAccess().getProblemKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProblemDiagram__Group__0__Impl


    // $ANTLR start rule__ProblemDiagram__Group__1
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:474:1: rule__ProblemDiagram__Group__1 : rule__ProblemDiagram__Group__1__Impl rule__ProblemDiagram__Group__2 ;
    public final void rule__ProblemDiagram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:478:1: ( rule__ProblemDiagram__Group__1__Impl rule__ProblemDiagram__Group__2 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:479:2: rule__ProblemDiagram__Group__1__Impl rule__ProblemDiagram__Group__2
            {
            pushFollow(FOLLOW_rule__ProblemDiagram__Group__1__Impl_in_rule__ProblemDiagram__Group__11012);
            rule__ProblemDiagram__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ProblemDiagram__Group__2_in_rule__ProblemDiagram__Group__11015);
            rule__ProblemDiagram__Group__2();
            _fsp--;


            }

        }
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


    // $ANTLR start rule__ProblemDiagram__Group__1__Impl
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:486:1: rule__ProblemDiagram__Group__1__Impl : ( ( rule__ProblemDiagram__NameAssignment_1 ) ) ;
    public final void rule__ProblemDiagram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:490:1: ( ( ( rule__ProblemDiagram__NameAssignment_1 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:491:1: ( ( rule__ProblemDiagram__NameAssignment_1 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:491:1: ( ( rule__ProblemDiagram__NameAssignment_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:492:1: ( rule__ProblemDiagram__NameAssignment_1 )
            {
             before(grammarAccess.getProblemDiagramAccess().getNameAssignment_1()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:493:1: ( rule__ProblemDiagram__NameAssignment_1 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:493:2: rule__ProblemDiagram__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ProblemDiagram__NameAssignment_1_in_rule__ProblemDiagram__Group__1__Impl1042);
            rule__ProblemDiagram__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getProblemDiagramAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProblemDiagram__Group__1__Impl


    // $ANTLR start rule__ProblemDiagram__Group__2
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:503:1: rule__ProblemDiagram__Group__2 : rule__ProblemDiagram__Group__2__Impl rule__ProblemDiagram__Group__3 ;
    public final void rule__ProblemDiagram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:507:1: ( rule__ProblemDiagram__Group__2__Impl rule__ProblemDiagram__Group__3 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:508:2: rule__ProblemDiagram__Group__2__Impl rule__ProblemDiagram__Group__3
            {
            pushFollow(FOLLOW_rule__ProblemDiagram__Group__2__Impl_in_rule__ProblemDiagram__Group__21072);
            rule__ProblemDiagram__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ProblemDiagram__Group__3_in_rule__ProblemDiagram__Group__21075);
            rule__ProblemDiagram__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProblemDiagram__Group__2


    // $ANTLR start rule__ProblemDiagram__Group__2__Impl
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:515:1: rule__ProblemDiagram__Group__2__Impl : ( ( rule__ProblemDiagram__Group_2__0 )? ) ;
    public final void rule__ProblemDiagram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:519:1: ( ( ( rule__ProblemDiagram__Group_2__0 )? ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:520:1: ( ( rule__ProblemDiagram__Group_2__0 )? )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:520:1: ( ( rule__ProblemDiagram__Group_2__0 )? )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:521:1: ( rule__ProblemDiagram__Group_2__0 )?
            {
             before(grammarAccess.getProblemDiagramAccess().getGroup_2()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:522:1: ( rule__ProblemDiagram__Group_2__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==26) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:522:2: rule__ProblemDiagram__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ProblemDiagram__Group_2__0_in_rule__ProblemDiagram__Group__2__Impl1102);
                    rule__ProblemDiagram__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProblemDiagramAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProblemDiagram__Group__2__Impl


    // $ANTLR start rule__ProblemDiagram__Group__3
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:532:1: rule__ProblemDiagram__Group__3 : rule__ProblemDiagram__Group__3__Impl ;
    public final void rule__ProblemDiagram__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:536:1: ( rule__ProblemDiagram__Group__3__Impl )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:537:2: rule__ProblemDiagram__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ProblemDiagram__Group__3__Impl_in_rule__ProblemDiagram__Group__31133);
            rule__ProblemDiagram__Group__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProblemDiagram__Group__3


    // $ANTLR start rule__ProblemDiagram__Group__3__Impl
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:543:1: rule__ProblemDiagram__Group__3__Impl : ( ( rule__ProblemDiagram__Alternatives_3 )* ) ;
    public final void rule__ProblemDiagram__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:547:1: ( ( ( rule__ProblemDiagram__Alternatives_3 )* ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:548:1: ( ( rule__ProblemDiagram__Alternatives_3 )* )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:548:1: ( ( rule__ProblemDiagram__Alternatives_3 )* )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:549:1: ( rule__ProblemDiagram__Alternatives_3 )*
            {
             before(grammarAccess.getProblemDiagramAccess().getAlternatives_3()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:550:1: ( rule__ProblemDiagram__Alternatives_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:550:2: rule__ProblemDiagram__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_rule__ProblemDiagram__Alternatives_3_in_rule__ProblemDiagram__Group__3__Impl1160);
            	    rule__ProblemDiagram__Alternatives_3();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getProblemDiagramAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProblemDiagram__Group__3__Impl


    // $ANTLR start rule__ProblemDiagram__Group_2__0
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:568:1: rule__ProblemDiagram__Group_2__0 : rule__ProblemDiagram__Group_2__0__Impl rule__ProblemDiagram__Group_2__1 ;
    public final void rule__ProblemDiagram__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:572:1: ( rule__ProblemDiagram__Group_2__0__Impl rule__ProblemDiagram__Group_2__1 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:573:2: rule__ProblemDiagram__Group_2__0__Impl rule__ProblemDiagram__Group_2__1
            {
            pushFollow(FOLLOW_rule__ProblemDiagram__Group_2__0__Impl_in_rule__ProblemDiagram__Group_2__01199);
            rule__ProblemDiagram__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ProblemDiagram__Group_2__1_in_rule__ProblemDiagram__Group_2__01202);
            rule__ProblemDiagram__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProblemDiagram__Group_2__0


    // $ANTLR start rule__ProblemDiagram__Group_2__0__Impl
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:580:1: rule__ProblemDiagram__Group_2__0__Impl : ( 'for' ) ;
    public final void rule__ProblemDiagram__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:584:1: ( ( 'for' ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:585:1: ( 'for' )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:585:1: ( 'for' )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:586:1: 'for'
            {
             before(grammarAccess.getProblemDiagramAccess().getForKeyword_2_0()); 
            match(input,26,FOLLOW_26_in_rule__ProblemDiagram__Group_2__0__Impl1230); 
             after(grammarAccess.getProblemDiagramAccess().getForKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProblemDiagram__Group_2__0__Impl


    // $ANTLR start rule__ProblemDiagram__Group_2__1
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:599:1: rule__ProblemDiagram__Group_2__1 : rule__ProblemDiagram__Group_2__1__Impl ;
    public final void rule__ProblemDiagram__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:603:1: ( rule__ProblemDiagram__Group_2__1__Impl )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:604:2: rule__ProblemDiagram__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ProblemDiagram__Group_2__1__Impl_in_rule__ProblemDiagram__Group_2__11261);
            rule__ProblemDiagram__Group_2__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProblemDiagram__Group_2__1


    // $ANTLR start rule__ProblemDiagram__Group_2__1__Impl
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:610:1: rule__ProblemDiagram__Group_2__1__Impl : ( ( rule__ProblemDiagram__HighlightAssignment_2_1 ) ) ;
    public final void rule__ProblemDiagram__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:614:1: ( ( ( rule__ProblemDiagram__HighlightAssignment_2_1 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:615:1: ( ( rule__ProblemDiagram__HighlightAssignment_2_1 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:615:1: ( ( rule__ProblemDiagram__HighlightAssignment_2_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:616:1: ( rule__ProblemDiagram__HighlightAssignment_2_1 )
            {
             before(grammarAccess.getProblemDiagramAccess().getHighlightAssignment_2_1()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:617:1: ( rule__ProblemDiagram__HighlightAssignment_2_1 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:617:2: rule__ProblemDiagram__HighlightAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ProblemDiagram__HighlightAssignment_2_1_in_rule__ProblemDiagram__Group_2__1__Impl1288);
            rule__ProblemDiagram__HighlightAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getProblemDiagramAccess().getHighlightAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProblemDiagram__Group_2__1__Impl


    // $ANTLR start rule__Concern__Group__0
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:631:1: rule__Concern__Group__0 : rule__Concern__Group__0__Impl rule__Concern__Group__1 ;
    public final void rule__Concern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:635:1: ( rule__Concern__Group__0__Impl rule__Concern__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:636:2: rule__Concern__Group__0__Impl rule__Concern__Group__1
            {
            pushFollow(FOLLOW_rule__Concern__Group__0__Impl_in_rule__Concern__Group__01322);
            rule__Concern__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Concern__Group__1_in_rule__Concern__Group__01325);
            rule__Concern__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Concern__Group__0


    // $ANTLR start rule__Concern__Group__0__Impl
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:643:1: rule__Concern__Group__0__Impl : ( 'concern' ) ;
    public final void rule__Concern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:647:1: ( ( 'concern' ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:648:1: ( 'concern' )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:648:1: ( 'concern' )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:649:1: 'concern'
            {
             before(grammarAccess.getConcernAccess().getConcernKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__Concern__Group__0__Impl1353); 
             after(grammarAccess.getConcernAccess().getConcernKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Concern__Group__0__Impl


    // $ANTLR start rule__Concern__Group__1
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:662:1: rule__Concern__Group__1 : rule__Concern__Group__1__Impl ;
    public final void rule__Concern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:666:1: ( rule__Concern__Group__1__Impl )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:667:2: rule__Concern__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Concern__Group__1__Impl_in_rule__Concern__Group__11384);
            rule__Concern__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Concern__Group__1


    // $ANTLR start rule__Concern__Group__1__Impl
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:673:1: rule__Concern__Group__1__Impl : ( ( rule__Concern__NameAssignment_1 ) ) ;
    public final void rule__Concern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:677:1: ( ( ( rule__Concern__NameAssignment_1 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:678:1: ( ( rule__Concern__NameAssignment_1 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:678:1: ( ( rule__Concern__NameAssignment_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:679:1: ( rule__Concern__NameAssignment_1 )
            {
             before(grammarAccess.getConcernAccess().getNameAssignment_1()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:680:1: ( rule__Concern__NameAssignment_1 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:680:2: rule__Concern__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Concern__NameAssignment_1_in_rule__Concern__Group__1__Impl1411);
            rule__Concern__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getConcernAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Concern__Group__1__Impl


    // $ANTLR start rule__Node__Group__0
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:694:1: rule__Node__Group__0 : rule__Node__Group__0__Impl rule__Node__Group__1 ;
    public final void rule__Node__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:698:1: ( rule__Node__Group__0__Impl rule__Node__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:699:2: rule__Node__Group__0__Impl rule__Node__Group__1
            {
            pushFollow(FOLLOW_rule__Node__Group__0__Impl_in_rule__Node__Group__01445);
            rule__Node__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Node__Group__1_in_rule__Node__Group__01448);
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


    // $ANTLR start rule__Node__Group__0__Impl
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:706:1: rule__Node__Group__0__Impl : ( ( rule__Node__NameAssignment_0 ) ) ;
    public final void rule__Node__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:710:1: ( ( ( rule__Node__NameAssignment_0 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:711:1: ( ( rule__Node__NameAssignment_0 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:711:1: ( ( rule__Node__NameAssignment_0 ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:712:1: ( rule__Node__NameAssignment_0 )
            {
             before(grammarAccess.getNodeAccess().getNameAssignment_0()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:713:1: ( rule__Node__NameAssignment_0 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:713:2: rule__Node__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Node__NameAssignment_0_in_rule__Node__Group__0__Impl1475);
            rule__Node__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getNodeAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__Group__0__Impl


    // $ANTLR start rule__Node__Group__1
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:723:1: rule__Node__Group__1 : rule__Node__Group__1__Impl rule__Node__Group__2 ;
    public final void rule__Node__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:727:1: ( rule__Node__Group__1__Impl rule__Node__Group__2 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:728:2: rule__Node__Group__1__Impl rule__Node__Group__2
            {
            pushFollow(FOLLOW_rule__Node__Group__1__Impl_in_rule__Node__Group__11505);
            rule__Node__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Node__Group__2_in_rule__Node__Group__11508);
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


    // $ANTLR start rule__Node__Group__1__Impl
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:735:1: rule__Node__Group__1__Impl : ( ( rule__Node__TypeAssignment_1 )? ) ;
    public final void rule__Node__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:739:1: ( ( ( rule__Node__TypeAssignment_1 )? ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:740:1: ( ( rule__Node__TypeAssignment_1 )? )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:740:1: ( ( rule__Node__TypeAssignment_1 )? )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:741:1: ( rule__Node__TypeAssignment_1 )?
            {
             before(grammarAccess.getNodeAccess().getTypeAssignment_1()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:742:1: ( rule__Node__TypeAssignment_1 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=12 && LA8_0<=18)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:742:2: rule__Node__TypeAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Node__TypeAssignment_1_in_rule__Node__Group__1__Impl1535);
                    rule__Node__TypeAssignment_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNodeAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__Group__1__Impl


    // $ANTLR start rule__Node__Group__2
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:752:1: rule__Node__Group__2 : rule__Node__Group__2__Impl rule__Node__Group__3 ;
    public final void rule__Node__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:756:1: ( rule__Node__Group__2__Impl rule__Node__Group__3 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:757:2: rule__Node__Group__2__Impl rule__Node__Group__3
            {
            pushFollow(FOLLOW_rule__Node__Group__2__Impl_in_rule__Node__Group__21566);
            rule__Node__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Node__Group__3_in_rule__Node__Group__21569);
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


    // $ANTLR start rule__Node__Group__2__Impl
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:764:1: rule__Node__Group__2__Impl : ( ( rule__Node__Group_2__0 )? ) ;
    public final void rule__Node__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:768:1: ( ( ( rule__Node__Group_2__0 )? ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:769:1: ( ( rule__Node__Group_2__0 )? )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:769:1: ( ( rule__Node__Group_2__0 )? )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:770:1: ( rule__Node__Group_2__0 )?
            {
             before(grammarAccess.getNodeAccess().getGroup_2()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:771:1: ( rule__Node__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING||LA9_0==28) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:771:2: rule__Node__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Node__Group_2__0_in_rule__Node__Group__2__Impl1596);
                    rule__Node__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNodeAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__Group__2__Impl


    // $ANTLR start rule__Node__Group__3
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:781:1: rule__Node__Group__3 : rule__Node__Group__3__Impl ;
    public final void rule__Node__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:785:1: ( rule__Node__Group__3__Impl )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:786:2: rule__Node__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Node__Group__3__Impl_in_rule__Node__Group__31627);
            rule__Node__Group__3__Impl();
            _fsp--;


            }

        }
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


    // $ANTLR start rule__Node__Group__3__Impl
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:792:1: rule__Node__Group__3__Impl : ( ( rule__Node__Group_3__0 )? ) ;
    public final void rule__Node__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:796:1: ( ( ( rule__Node__Group_3__0 )? ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:797:1: ( ( rule__Node__Group_3__0 )? )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:797:1: ( ( rule__Node__Group_3__0 )? )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:798:1: ( rule__Node__Group_3__0 )?
            {
             before(grammarAccess.getNodeAccess().getGroup_3()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:799:1: ( rule__Node__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==29) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:799:2: rule__Node__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Node__Group_3__0_in_rule__Node__Group__3__Impl1654);
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
    // $ANTLR end rule__Node__Group__3__Impl


    // $ANTLR start rule__Node__Group_2__0
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:817:1: rule__Node__Group_2__0 : rule__Node__Group_2__0__Impl rule__Node__Group_2__1 ;
    public final void rule__Node__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:821:1: ( rule__Node__Group_2__0__Impl rule__Node__Group_2__1 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:822:2: rule__Node__Group_2__0__Impl rule__Node__Group_2__1
            {
            pushFollow(FOLLOW_rule__Node__Group_2__0__Impl_in_rule__Node__Group_2__01693);
            rule__Node__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Node__Group_2__1_in_rule__Node__Group_2__01696);
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


    // $ANTLR start rule__Node__Group_2__0__Impl
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:829:1: rule__Node__Group_2__0__Impl : ( ( ':' )? ) ;
    public final void rule__Node__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:833:1: ( ( ( ':' )? ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:834:1: ( ( ':' )? )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:834:1: ( ( ':' )? )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:835:1: ( ':' )?
            {
             before(grammarAccess.getNodeAccess().getColonKeyword_2_0()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:836:1: ( ':' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==28) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:837:2: ':'
                    {
                    match(input,28,FOLLOW_28_in_rule__Node__Group_2__0__Impl1725); 

                    }
                    break;

            }

             after(grammarAccess.getNodeAccess().getColonKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__Group_2__0__Impl


    // $ANTLR start rule__Node__Group_2__1
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:848:1: rule__Node__Group_2__1 : rule__Node__Group_2__1__Impl ;
    public final void rule__Node__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:852:1: ( rule__Node__Group_2__1__Impl )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:853:2: rule__Node__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Node__Group_2__1__Impl_in_rule__Node__Group_2__11758);
            rule__Node__Group_2__1__Impl();
            _fsp--;


            }

        }
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


    // $ANTLR start rule__Node__Group_2__1__Impl
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:859:1: rule__Node__Group_2__1__Impl : ( ( rule__Node__DescriptionAssignment_2_1 ) ) ;
    public final void rule__Node__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:863:1: ( ( ( rule__Node__DescriptionAssignment_2_1 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:864:1: ( ( rule__Node__DescriptionAssignment_2_1 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:864:1: ( ( rule__Node__DescriptionAssignment_2_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:865:1: ( rule__Node__DescriptionAssignment_2_1 )
            {
             before(grammarAccess.getNodeAccess().getDescriptionAssignment_2_1()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:866:1: ( rule__Node__DescriptionAssignment_2_1 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:866:2: rule__Node__DescriptionAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Node__DescriptionAssignment_2_1_in_rule__Node__Group_2__1__Impl1785);
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
    // $ANTLR end rule__Node__Group_2__1__Impl


    // $ANTLR start rule__Node__Group_3__0
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:880:1: rule__Node__Group_3__0 : rule__Node__Group_3__0__Impl rule__Node__Group_3__1 ;
    public final void rule__Node__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:884:1: ( rule__Node__Group_3__0__Impl rule__Node__Group_3__1 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:885:2: rule__Node__Group_3__0__Impl rule__Node__Group_3__1
            {
            pushFollow(FOLLOW_rule__Node__Group_3__0__Impl_in_rule__Node__Group_3__01819);
            rule__Node__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Node__Group_3__1_in_rule__Node__Group_3__01822);
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


    // $ANTLR start rule__Node__Group_3__0__Impl
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:892:1: rule__Node__Group_3__0__Impl : ( '{' ) ;
    public final void rule__Node__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:896:1: ( ( '{' ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:897:1: ( '{' )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:897:1: ( '{' )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:898:1: '{'
            {
             before(grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,29,FOLLOW_29_in_rule__Node__Group_3__0__Impl1850); 
             after(grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__Group_3__0__Impl


    // $ANTLR start rule__Node__Group_3__1
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:911:1: rule__Node__Group_3__1 : rule__Node__Group_3__1__Impl rule__Node__Group_3__2 ;
    public final void rule__Node__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:915:1: ( rule__Node__Group_3__1__Impl rule__Node__Group_3__2 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:916:2: rule__Node__Group_3__1__Impl rule__Node__Group_3__2
            {
            pushFollow(FOLLOW_rule__Node__Group_3__1__Impl_in_rule__Node__Group_3__11881);
            rule__Node__Group_3__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Node__Group_3__2_in_rule__Node__Group_3__11884);
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


    // $ANTLR start rule__Node__Group_3__1__Impl
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:923:1: rule__Node__Group_3__1__Impl : ( ( rule__Node__Group_3_1__0 )? ) ;
    public final void rule__Node__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:927:1: ( ( ( rule__Node__Group_3_1__0 )? ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:928:1: ( ( rule__Node__Group_3_1__0 )? )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:928:1: ( ( rule__Node__Group_3_1__0 )? )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:929:1: ( rule__Node__Group_3_1__0 )?
            {
             before(grammarAccess.getNodeAccess().getGroup_3_1()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:930:1: ( rule__Node__Group_3_1__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID||(LA12_0>=19 && LA12_0<=21)||LA12_0==35) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:930:2: rule__Node__Group_3_1__0
                    {
                    pushFollow(FOLLOW_rule__Node__Group_3_1__0_in_rule__Node__Group_3__1__Impl1911);
                    rule__Node__Group_3_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNodeAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__Group_3__1__Impl


    // $ANTLR start rule__Node__Group_3__2
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:940:1: rule__Node__Group_3__2 : rule__Node__Group_3__2__Impl rule__Node__Group_3__3 ;
    public final void rule__Node__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:944:1: ( rule__Node__Group_3__2__Impl rule__Node__Group_3__3 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:945:2: rule__Node__Group_3__2__Impl rule__Node__Group_3__3
            {
            pushFollow(FOLLOW_rule__Node__Group_3__2__Impl_in_rule__Node__Group_3__21942);
            rule__Node__Group_3__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Node__Group_3__3_in_rule__Node__Group_3__21945);
            rule__Node__Group_3__3();
            _fsp--;


            }

        }
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


    // $ANTLR start rule__Node__Group_3__2__Impl
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:952:1: rule__Node__Group_3__2__Impl : ( ( rule__Node__Alternatives_3_2 )* ) ;
    public final void rule__Node__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:956:1: ( ( ( rule__Node__Alternatives_3_2 )* ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:957:1: ( ( rule__Node__Alternatives_3_2 )* )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:957:1: ( ( rule__Node__Alternatives_3_2 )* )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:958:1: ( rule__Node__Alternatives_3_2 )*
            {
             before(grammarAccess.getNodeAccess().getAlternatives_3_2()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:959:1: ( rule__Node__Alternatives_3_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==25||LA13_0==27||LA13_0==32) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:959:2: rule__Node__Alternatives_3_2
            	    {
            	    pushFollow(FOLLOW_rule__Node__Alternatives_3_2_in_rule__Node__Group_3__2__Impl1972);
            	    rule__Node__Alternatives_3_2();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getNodeAccess().getAlternatives_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__Group_3__2__Impl


    // $ANTLR start rule__Node__Group_3__3
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:969:1: rule__Node__Group_3__3 : rule__Node__Group_3__3__Impl ;
    public final void rule__Node__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:973:1: ( rule__Node__Group_3__3__Impl )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:974:2: rule__Node__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__Node__Group_3__3__Impl_in_rule__Node__Group_3__32003);
            rule__Node__Group_3__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__Group_3__3


    // $ANTLR start rule__Node__Group_3__3__Impl
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:980:1: rule__Node__Group_3__3__Impl : ( '}' ) ;
    public final void rule__Node__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:984:1: ( ( '}' ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:985:1: ( '}' )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:985:1: ( '}' )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:986:1: '}'
            {
             before(grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_3_3()); 
            match(input,30,FOLLOW_30_in_rule__Node__Group_3__3__Impl2031); 
             after(grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__Group_3__3__Impl


    // $ANTLR start rule__Node__Group_3_1__0
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1007:1: rule__Node__Group_3_1__0 : rule__Node__Group_3_1__0__Impl rule__Node__Group_3_1__1 ;
    public final void rule__Node__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1011:1: ( rule__Node__Group_3_1__0__Impl rule__Node__Group_3_1__1 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1012:2: rule__Node__Group_3_1__0__Impl rule__Node__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__Node__Group_3_1__0__Impl_in_rule__Node__Group_3_1__02070);
            rule__Node__Group_3_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Node__Group_3_1__1_in_rule__Node__Group_3_1__02073);
            rule__Node__Group_3_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__Group_3_1__0


    // $ANTLR start rule__Node__Group_3_1__0__Impl
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1019:1: rule__Node__Group_3_1__0__Impl : ( ( rule__Node__HiddenPhenomenaAssignment_3_1_0 ) ) ;
    public final void rule__Node__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1023:1: ( ( ( rule__Node__HiddenPhenomenaAssignment_3_1_0 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1024:1: ( ( rule__Node__HiddenPhenomenaAssignment_3_1_0 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1024:1: ( ( rule__Node__HiddenPhenomenaAssignment_3_1_0 ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1025:1: ( rule__Node__HiddenPhenomenaAssignment_3_1_0 )
            {
             before(grammarAccess.getNodeAccess().getHiddenPhenomenaAssignment_3_1_0()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1026:1: ( rule__Node__HiddenPhenomenaAssignment_3_1_0 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1026:2: rule__Node__HiddenPhenomenaAssignment_3_1_0
            {
            pushFollow(FOLLOW_rule__Node__HiddenPhenomenaAssignment_3_1_0_in_rule__Node__Group_3_1__0__Impl2100);
            rule__Node__HiddenPhenomenaAssignment_3_1_0();
            _fsp--;


            }

             after(grammarAccess.getNodeAccess().getHiddenPhenomenaAssignment_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__Group_3_1__0__Impl


    // $ANTLR start rule__Node__Group_3_1__1
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1036:1: rule__Node__Group_3_1__1 : rule__Node__Group_3_1__1__Impl ;
    public final void rule__Node__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1040:1: ( rule__Node__Group_3_1__1__Impl )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1041:2: rule__Node__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Node__Group_3_1__1__Impl_in_rule__Node__Group_3_1__12130);
            rule__Node__Group_3_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__Group_3_1__1


    // $ANTLR start rule__Node__Group_3_1__1__Impl
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1047:1: rule__Node__Group_3_1__1__Impl : ( ( rule__Node__Group_3_1_1__0 )* ) ;
    public final void rule__Node__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1051:1: ( ( ( rule__Node__Group_3_1_1__0 )* ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1052:1: ( ( rule__Node__Group_3_1_1__0 )* )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1052:1: ( ( rule__Node__Group_3_1_1__0 )* )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1053:1: ( rule__Node__Group_3_1_1__0 )*
            {
             before(grammarAccess.getNodeAccess().getGroup_3_1_1()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1054:1: ( rule__Node__Group_3_1_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==31) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1054:2: rule__Node__Group_3_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Node__Group_3_1_1__0_in_rule__Node__Group_3_1__1__Impl2157);
            	    rule__Node__Group_3_1_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getNodeAccess().getGroup_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__Group_3_1__1__Impl


    // $ANTLR start rule__Node__Group_3_1_1__0
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1068:1: rule__Node__Group_3_1_1__0 : rule__Node__Group_3_1_1__0__Impl rule__Node__Group_3_1_1__1 ;
    public final void rule__Node__Group_3_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1072:1: ( rule__Node__Group_3_1_1__0__Impl rule__Node__Group_3_1_1__1 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1073:2: rule__Node__Group_3_1_1__0__Impl rule__Node__Group_3_1_1__1
            {
            pushFollow(FOLLOW_rule__Node__Group_3_1_1__0__Impl_in_rule__Node__Group_3_1_1__02192);
            rule__Node__Group_3_1_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Node__Group_3_1_1__1_in_rule__Node__Group_3_1_1__02195);
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


    // $ANTLR start rule__Node__Group_3_1_1__0__Impl
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1080:1: rule__Node__Group_3_1_1__0__Impl : ( ',' ) ;
    public final void rule__Node__Group_3_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1084:1: ( ( ',' ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1085:1: ( ',' )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1085:1: ( ',' )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1086:1: ','
            {
             before(grammarAccess.getNodeAccess().getCommaKeyword_3_1_1_0()); 
            match(input,31,FOLLOW_31_in_rule__Node__Group_3_1_1__0__Impl2223); 
             after(grammarAccess.getNodeAccess().getCommaKeyword_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__Group_3_1_1__0__Impl


    // $ANTLR start rule__Node__Group_3_1_1__1
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1099:1: rule__Node__Group_3_1_1__1 : rule__Node__Group_3_1_1__1__Impl ;
    public final void rule__Node__Group_3_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1103:1: ( rule__Node__Group_3_1_1__1__Impl )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1104:2: rule__Node__Group_3_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Node__Group_3_1_1__1__Impl_in_rule__Node__Group_3_1_1__12254);
            rule__Node__Group_3_1_1__1__Impl();
            _fsp--;


            }

        }
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


    // $ANTLR start rule__Node__Group_3_1_1__1__Impl
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1110:1: rule__Node__Group_3_1_1__1__Impl : ( ( rule__Node__HiddenPhenomenaAssignment_3_1_1_1 ) ) ;
    public final void rule__Node__Group_3_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1114:1: ( ( ( rule__Node__HiddenPhenomenaAssignment_3_1_1_1 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1115:1: ( ( rule__Node__HiddenPhenomenaAssignment_3_1_1_1 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1115:1: ( ( rule__Node__HiddenPhenomenaAssignment_3_1_1_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1116:1: ( rule__Node__HiddenPhenomenaAssignment_3_1_1_1 )
            {
             before(grammarAccess.getNodeAccess().getHiddenPhenomenaAssignment_3_1_1_1()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1117:1: ( rule__Node__HiddenPhenomenaAssignment_3_1_1_1 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1117:2: rule__Node__HiddenPhenomenaAssignment_3_1_1_1
            {
            pushFollow(FOLLOW_rule__Node__HiddenPhenomenaAssignment_3_1_1_1_in_rule__Node__Group_3_1_1__1__Impl2281);
            rule__Node__HiddenPhenomenaAssignment_3_1_1_1();
            _fsp--;


            }

             after(grammarAccess.getNodeAccess().getHiddenPhenomenaAssignment_3_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__Group_3_1_1__1__Impl


    // $ANTLR start rule__Node__Group_3_2_1__0
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1131:1: rule__Node__Group_3_2_1__0 : rule__Node__Group_3_2_1__0__Impl rule__Node__Group_3_2_1__1 ;
    public final void rule__Node__Group_3_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1135:1: ( rule__Node__Group_3_2_1__0__Impl rule__Node__Group_3_2_1__1 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1136:2: rule__Node__Group_3_2_1__0__Impl rule__Node__Group_3_2_1__1
            {
            pushFollow(FOLLOW_rule__Node__Group_3_2_1__0__Impl_in_rule__Node__Group_3_2_1__02315);
            rule__Node__Group_3_2_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Node__Group_3_2_1__1_in_rule__Node__Group_3_2_1__02318);
            rule__Node__Group_3_2_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__Group_3_2_1__0


    // $ANTLR start rule__Node__Group_3_2_1__0__Impl
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1143:1: rule__Node__Group_3_2_1__0__Impl : ( 'see' ) ;
    public final void rule__Node__Group_3_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1147:1: ( ( 'see' ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1148:1: ( 'see' )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1148:1: ( 'see' )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1149:1: 'see'
            {
             before(grammarAccess.getNodeAccess().getSeeKeyword_3_2_1_0()); 
            match(input,32,FOLLOW_32_in_rule__Node__Group_3_2_1__0__Impl2346); 
             after(grammarAccess.getNodeAccess().getSeeKeyword_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__Group_3_2_1__0__Impl


    // $ANTLR start rule__Node__Group_3_2_1__1
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1162:1: rule__Node__Group_3_2_1__1 : rule__Node__Group_3_2_1__1__Impl rule__Node__Group_3_2_1__2 ;
    public final void rule__Node__Group_3_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1166:1: ( rule__Node__Group_3_2_1__1__Impl rule__Node__Group_3_2_1__2 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1167:2: rule__Node__Group_3_2_1__1__Impl rule__Node__Group_3_2_1__2
            {
            pushFollow(FOLLOW_rule__Node__Group_3_2_1__1__Impl_in_rule__Node__Group_3_2_1__12377);
            rule__Node__Group_3_2_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Node__Group_3_2_1__2_in_rule__Node__Group_3_2_1__12380);
            rule__Node__Group_3_2_1__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__Group_3_2_1__1


    // $ANTLR start rule__Node__Group_3_2_1__1__Impl
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1174:1: rule__Node__Group_3_2_1__1__Impl : ( 'domain' ) ;
    public final void rule__Node__Group_3_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1178:1: ( ( 'domain' ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1179:1: ( 'domain' )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1179:1: ( 'domain' )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1180:1: 'domain'
            {
             before(grammarAccess.getNodeAccess().getDomainKeyword_3_2_1_1()); 
            match(input,33,FOLLOW_33_in_rule__Node__Group_3_2_1__1__Impl2408); 
             after(grammarAccess.getNodeAccess().getDomainKeyword_3_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__Group_3_2_1__1__Impl


    // $ANTLR start rule__Node__Group_3_2_1__2
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1193:1: rule__Node__Group_3_2_1__2 : rule__Node__Group_3_2_1__2__Impl ;
    public final void rule__Node__Group_3_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1197:1: ( rule__Node__Group_3_2_1__2__Impl )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1198:2: rule__Node__Group_3_2_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Node__Group_3_2_1__2__Impl_in_rule__Node__Group_3_2_1__22439);
            rule__Node__Group_3_2_1__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__Group_3_2_1__2


    // $ANTLR start rule__Node__Group_3_2_1__2__Impl
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1204:1: rule__Node__Group_3_2_1__2__Impl : ( ( rule__Node__ProblemNodeRefAssignment_3_2_1_2 ) ) ;
    public final void rule__Node__Group_3_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1208:1: ( ( ( rule__Node__ProblemNodeRefAssignment_3_2_1_2 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1209:1: ( ( rule__Node__ProblemNodeRefAssignment_3_2_1_2 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1209:1: ( ( rule__Node__ProblemNodeRefAssignment_3_2_1_2 ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1210:1: ( rule__Node__ProblemNodeRefAssignment_3_2_1_2 )
            {
             before(grammarAccess.getNodeAccess().getProblemNodeRefAssignment_3_2_1_2()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1211:1: ( rule__Node__ProblemNodeRefAssignment_3_2_1_2 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1211:2: rule__Node__ProblemNodeRefAssignment_3_2_1_2
            {
            pushFollow(FOLLOW_rule__Node__ProblemNodeRefAssignment_3_2_1_2_in_rule__Node__Group_3_2_1__2__Impl2466);
            rule__Node__ProblemNodeRefAssignment_3_2_1_2();
            _fsp--;


            }

             after(grammarAccess.getNodeAccess().getProblemNodeRefAssignment_3_2_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__Group_3_2_1__2__Impl


    // $ANTLR start rule__Node__Group_3_2_2__0
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1227:1: rule__Node__Group_3_2_2__0 : rule__Node__Group_3_2_2__0__Impl rule__Node__Group_3_2_2__1 ;
    public final void rule__Node__Group_3_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1231:1: ( rule__Node__Group_3_2_2__0__Impl rule__Node__Group_3_2_2__1 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1232:2: rule__Node__Group_3_2_2__0__Impl rule__Node__Group_3_2_2__1
            {
            pushFollow(FOLLOW_rule__Node__Group_3_2_2__0__Impl_in_rule__Node__Group_3_2_2__02502);
            rule__Node__Group_3_2_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Node__Group_3_2_2__1_in_rule__Node__Group_3_2_2__02505);
            rule__Node__Group_3_2_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__Group_3_2_2__0


    // $ANTLR start rule__Node__Group_3_2_2__0__Impl
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1239:1: rule__Node__Group_3_2_2__0__Impl : ( 'see' ) ;
    public final void rule__Node__Group_3_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1243:1: ( ( 'see' ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1244:1: ( 'see' )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1244:1: ( 'see' )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1245:1: 'see'
            {
             before(grammarAccess.getNodeAccess().getSeeKeyword_3_2_2_0()); 
            match(input,32,FOLLOW_32_in_rule__Node__Group_3_2_2__0__Impl2533); 
             after(grammarAccess.getNodeAccess().getSeeKeyword_3_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__Group_3_2_2__0__Impl


    // $ANTLR start rule__Node__Group_3_2_2__1
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1258:1: rule__Node__Group_3_2_2__1 : rule__Node__Group_3_2_2__1__Impl rule__Node__Group_3_2_2__2 ;
    public final void rule__Node__Group_3_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1262:1: ( rule__Node__Group_3_2_2__1__Impl rule__Node__Group_3_2_2__2 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1263:2: rule__Node__Group_3_2_2__1__Impl rule__Node__Group_3_2_2__2
            {
            pushFollow(FOLLOW_rule__Node__Group_3_2_2__1__Impl_in_rule__Node__Group_3_2_2__12564);
            rule__Node__Group_3_2_2__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Node__Group_3_2_2__2_in_rule__Node__Group_3_2_2__12567);
            rule__Node__Group_3_2_2__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__Group_3_2_2__1


    // $ANTLR start rule__Node__Group_3_2_2__1__Impl
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1270:1: rule__Node__Group_3_2_2__1__Impl : ( 'problem' ) ;
    public final void rule__Node__Group_3_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1274:1: ( ( 'problem' ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1275:1: ( 'problem' )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1275:1: ( 'problem' )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1276:1: 'problem'
            {
             before(grammarAccess.getNodeAccess().getProblemKeyword_3_2_2_1()); 
            match(input,34,FOLLOW_34_in_rule__Node__Group_3_2_2__1__Impl2595); 
             after(grammarAccess.getNodeAccess().getProblemKeyword_3_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__Group_3_2_2__1__Impl


    // $ANTLR start rule__Node__Group_3_2_2__2
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1289:1: rule__Node__Group_3_2_2__2 : rule__Node__Group_3_2_2__2__Impl ;
    public final void rule__Node__Group_3_2_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1293:1: ( rule__Node__Group_3_2_2__2__Impl )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1294:2: rule__Node__Group_3_2_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Node__Group_3_2_2__2__Impl_in_rule__Node__Group_3_2_2__22626);
            rule__Node__Group_3_2_2__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__Group_3_2_2__2


    // $ANTLR start rule__Node__Group_3_2_2__2__Impl
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1300:1: rule__Node__Group_3_2_2__2__Impl : ( ( rule__Node__ProblemRefAssignment_3_2_2_2 ) ) ;
    public final void rule__Node__Group_3_2_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1304:1: ( ( ( rule__Node__ProblemRefAssignment_3_2_2_2 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1305:1: ( ( rule__Node__ProblemRefAssignment_3_2_2_2 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1305:1: ( ( rule__Node__ProblemRefAssignment_3_2_2_2 ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1306:1: ( rule__Node__ProblemRefAssignment_3_2_2_2 )
            {
             before(grammarAccess.getNodeAccess().getProblemRefAssignment_3_2_2_2()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1307:1: ( rule__Node__ProblemRefAssignment_3_2_2_2 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1307:2: rule__Node__ProblemRefAssignment_3_2_2_2
            {
            pushFollow(FOLLOW_rule__Node__ProblemRefAssignment_3_2_2_2_in_rule__Node__Group_3_2_2__2__Impl2653);
            rule__Node__ProblemRefAssignment_3_2_2_2();
            _fsp--;


            }

             after(grammarAccess.getNodeAccess().getProblemRefAssignment_3_2_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__Group_3_2_2__2__Impl


    // $ANTLR start rule__Node__Group_3_2_3__0
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1323:1: rule__Node__Group_3_2_3__0 : rule__Node__Group_3_2_3__0__Impl rule__Node__Group_3_2_3__1 ;
    public final void rule__Node__Group_3_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1327:1: ( rule__Node__Group_3_2_3__0__Impl rule__Node__Group_3_2_3__1 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1328:2: rule__Node__Group_3_2_3__0__Impl rule__Node__Group_3_2_3__1
            {
            pushFollow(FOLLOW_rule__Node__Group_3_2_3__0__Impl_in_rule__Node__Group_3_2_3__02689);
            rule__Node__Group_3_2_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Node__Group_3_2_3__1_in_rule__Node__Group_3_2_3__02692);
            rule__Node__Group_3_2_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__Group_3_2_3__0


    // $ANTLR start rule__Node__Group_3_2_3__0__Impl
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1335:1: rule__Node__Group_3_2_3__0__Impl : ( 'see' ) ;
    public final void rule__Node__Group_3_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1339:1: ( ( 'see' ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1340:1: ( 'see' )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1340:1: ( 'see' )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1341:1: 'see'
            {
             before(grammarAccess.getNodeAccess().getSeeKeyword_3_2_3_0()); 
            match(input,32,FOLLOW_32_in_rule__Node__Group_3_2_3__0__Impl2720); 
             after(grammarAccess.getNodeAccess().getSeeKeyword_3_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__Group_3_2_3__0__Impl


    // $ANTLR start rule__Node__Group_3_2_3__1
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1354:1: rule__Node__Group_3_2_3__1 : rule__Node__Group_3_2_3__1__Impl ;
    public final void rule__Node__Group_3_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1358:1: ( rule__Node__Group_3_2_3__1__Impl )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1359:2: rule__Node__Group_3_2_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Node__Group_3_2_3__1__Impl_in_rule__Node__Group_3_2_3__12751);
            rule__Node__Group_3_2_3__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__Group_3_2_3__1


    // $ANTLR start rule__Node__Group_3_2_3__1__Impl
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1365:1: rule__Node__Group_3_2_3__1__Impl : ( ( rule__Node__HrefAssignment_3_2_3_1 ) ) ;
    public final void rule__Node__Group_3_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1369:1: ( ( ( rule__Node__HrefAssignment_3_2_3_1 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1370:1: ( ( rule__Node__HrefAssignment_3_2_3_1 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1370:1: ( ( rule__Node__HrefAssignment_3_2_3_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1371:1: ( rule__Node__HrefAssignment_3_2_3_1 )
            {
             before(grammarAccess.getNodeAccess().getHrefAssignment_3_2_3_1()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1372:1: ( rule__Node__HrefAssignment_3_2_3_1 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1372:2: rule__Node__HrefAssignment_3_2_3_1
            {
            pushFollow(FOLLOW_rule__Node__HrefAssignment_3_2_3_1_in_rule__Node__Group_3_2_3__1__Impl2778);
            rule__Node__HrefAssignment_3_2_3_1();
            _fsp--;


            }

             after(grammarAccess.getNodeAccess().getHrefAssignment_3_2_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__Group_3_2_3__1__Impl


    // $ANTLR start rule__Phenomenon__Group__0
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1386:1: rule__Phenomenon__Group__0 : rule__Phenomenon__Group__0__Impl rule__Phenomenon__Group__1 ;
    public final void rule__Phenomenon__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1390:1: ( rule__Phenomenon__Group__0__Impl rule__Phenomenon__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1391:2: rule__Phenomenon__Group__0__Impl rule__Phenomenon__Group__1
            {
            pushFollow(FOLLOW_rule__Phenomenon__Group__0__Impl_in_rule__Phenomenon__Group__02812);
            rule__Phenomenon__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Phenomenon__Group__1_in_rule__Phenomenon__Group__02815);
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


    // $ANTLR start rule__Phenomenon__Group__0__Impl
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1398:1: rule__Phenomenon__Group__0__Impl : ( ( rule__Phenomenon__TypeAssignment_0 )? ) ;
    public final void rule__Phenomenon__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1402:1: ( ( ( rule__Phenomenon__TypeAssignment_0 )? ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1403:1: ( ( rule__Phenomenon__TypeAssignment_0 )? )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1403:1: ( ( rule__Phenomenon__TypeAssignment_0 )? )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1404:1: ( rule__Phenomenon__TypeAssignment_0 )?
            {
             before(grammarAccess.getPhenomenonAccess().getTypeAssignment_0()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1405:1: ( rule__Phenomenon__TypeAssignment_0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=19 && LA15_0<=21)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1405:2: rule__Phenomenon__TypeAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Phenomenon__TypeAssignment_0_in_rule__Phenomenon__Group__0__Impl2842);
                    rule__Phenomenon__TypeAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPhenomenonAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Phenomenon__Group__0__Impl


    // $ANTLR start rule__Phenomenon__Group__1
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1415:1: rule__Phenomenon__Group__1 : rule__Phenomenon__Group__1__Impl rule__Phenomenon__Group__2 ;
    public final void rule__Phenomenon__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1419:1: ( rule__Phenomenon__Group__1__Impl rule__Phenomenon__Group__2 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1420:2: rule__Phenomenon__Group__1__Impl rule__Phenomenon__Group__2
            {
            pushFollow(FOLLOW_rule__Phenomenon__Group__1__Impl_in_rule__Phenomenon__Group__12873);
            rule__Phenomenon__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Phenomenon__Group__2_in_rule__Phenomenon__Group__12876);
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


    // $ANTLR start rule__Phenomenon__Group__1__Impl
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1427:1: rule__Phenomenon__Group__1__Impl : ( ( rule__Phenomenon__IsControlledAssignment_1 )? ) ;
    public final void rule__Phenomenon__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1431:1: ( ( ( rule__Phenomenon__IsControlledAssignment_1 )? ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1432:1: ( ( rule__Phenomenon__IsControlledAssignment_1 )? )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1432:1: ( ( rule__Phenomenon__IsControlledAssignment_1 )? )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1433:1: ( rule__Phenomenon__IsControlledAssignment_1 )?
            {
             before(grammarAccess.getPhenomenonAccess().getIsControlledAssignment_1()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1434:1: ( rule__Phenomenon__IsControlledAssignment_1 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==35) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1434:2: rule__Phenomenon__IsControlledAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Phenomenon__IsControlledAssignment_1_in_rule__Phenomenon__Group__1__Impl2903);
                    rule__Phenomenon__IsControlledAssignment_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPhenomenonAccess().getIsControlledAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Phenomenon__Group__1__Impl


    // $ANTLR start rule__Phenomenon__Group__2
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1444:1: rule__Phenomenon__Group__2 : rule__Phenomenon__Group__2__Impl rule__Phenomenon__Group__3 ;
    public final void rule__Phenomenon__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1448:1: ( rule__Phenomenon__Group__2__Impl rule__Phenomenon__Group__3 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1449:2: rule__Phenomenon__Group__2__Impl rule__Phenomenon__Group__3
            {
            pushFollow(FOLLOW_rule__Phenomenon__Group__2__Impl_in_rule__Phenomenon__Group__22934);
            rule__Phenomenon__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Phenomenon__Group__3_in_rule__Phenomenon__Group__22937);
            rule__Phenomenon__Group__3();
            _fsp--;


            }

        }
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


    // $ANTLR start rule__Phenomenon__Group__2__Impl
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1456:1: rule__Phenomenon__Group__2__Impl : ( ( rule__Phenomenon__NameAssignment_2 ) ) ;
    public final void rule__Phenomenon__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1460:1: ( ( ( rule__Phenomenon__NameAssignment_2 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1461:1: ( ( rule__Phenomenon__NameAssignment_2 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1461:1: ( ( rule__Phenomenon__NameAssignment_2 ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1462:1: ( rule__Phenomenon__NameAssignment_2 )
            {
             before(grammarAccess.getPhenomenonAccess().getNameAssignment_2()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1463:1: ( rule__Phenomenon__NameAssignment_2 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1463:2: rule__Phenomenon__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Phenomenon__NameAssignment_2_in_rule__Phenomenon__Group__2__Impl2964);
            rule__Phenomenon__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getPhenomenonAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Phenomenon__Group__2__Impl


    // $ANTLR start rule__Phenomenon__Group__3
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1473:1: rule__Phenomenon__Group__3 : rule__Phenomenon__Group__3__Impl ;
    public final void rule__Phenomenon__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1477:1: ( rule__Phenomenon__Group__3__Impl )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1478:2: rule__Phenomenon__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Phenomenon__Group__3__Impl_in_rule__Phenomenon__Group__32994);
            rule__Phenomenon__Group__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Phenomenon__Group__3


    // $ANTLR start rule__Phenomenon__Group__3__Impl
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1484:1: rule__Phenomenon__Group__3__Impl : ( ( rule__Phenomenon__Group_3__0 )? ) ;
    public final void rule__Phenomenon__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1488:1: ( ( ( rule__Phenomenon__Group_3__0 )? ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1489:1: ( ( rule__Phenomenon__Group_3__0 )? )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1489:1: ( ( rule__Phenomenon__Group_3__0 )? )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1490:1: ( rule__Phenomenon__Group_3__0 )?
            {
             before(grammarAccess.getPhenomenonAccess().getGroup_3()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1491:1: ( rule__Phenomenon__Group_3__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING||LA17_0==28) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1491:2: rule__Phenomenon__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Phenomenon__Group_3__0_in_rule__Phenomenon__Group__3__Impl3021);
                    rule__Phenomenon__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPhenomenonAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Phenomenon__Group__3__Impl


    // $ANTLR start rule__Phenomenon__Group_3__0
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1509:1: rule__Phenomenon__Group_3__0 : rule__Phenomenon__Group_3__0__Impl rule__Phenomenon__Group_3__1 ;
    public final void rule__Phenomenon__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1513:1: ( rule__Phenomenon__Group_3__0__Impl rule__Phenomenon__Group_3__1 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1514:2: rule__Phenomenon__Group_3__0__Impl rule__Phenomenon__Group_3__1
            {
            pushFollow(FOLLOW_rule__Phenomenon__Group_3__0__Impl_in_rule__Phenomenon__Group_3__03060);
            rule__Phenomenon__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Phenomenon__Group_3__1_in_rule__Phenomenon__Group_3__03063);
            rule__Phenomenon__Group_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Phenomenon__Group_3__0


    // $ANTLR start rule__Phenomenon__Group_3__0__Impl
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1521:1: rule__Phenomenon__Group_3__0__Impl : ( ( ':' )? ) ;
    public final void rule__Phenomenon__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1525:1: ( ( ( ':' )? ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1526:1: ( ( ':' )? )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1526:1: ( ( ':' )? )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1527:1: ( ':' )?
            {
             before(grammarAccess.getPhenomenonAccess().getColonKeyword_3_0()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1528:1: ( ':' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==28) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1529:2: ':'
                    {
                    match(input,28,FOLLOW_28_in_rule__Phenomenon__Group_3__0__Impl3092); 

                    }
                    break;

            }

             after(grammarAccess.getPhenomenonAccess().getColonKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Phenomenon__Group_3__0__Impl


    // $ANTLR start rule__Phenomenon__Group_3__1
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1540:1: rule__Phenomenon__Group_3__1 : rule__Phenomenon__Group_3__1__Impl ;
    public final void rule__Phenomenon__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1544:1: ( rule__Phenomenon__Group_3__1__Impl )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1545:2: rule__Phenomenon__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Phenomenon__Group_3__1__Impl_in_rule__Phenomenon__Group_3__13125);
            rule__Phenomenon__Group_3__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Phenomenon__Group_3__1


    // $ANTLR start rule__Phenomenon__Group_3__1__Impl
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1551:1: rule__Phenomenon__Group_3__1__Impl : ( ( rule__Phenomenon__DescriptionAssignment_3_1 ) ) ;
    public final void rule__Phenomenon__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1555:1: ( ( ( rule__Phenomenon__DescriptionAssignment_3_1 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1556:1: ( ( rule__Phenomenon__DescriptionAssignment_3_1 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1556:1: ( ( rule__Phenomenon__DescriptionAssignment_3_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1557:1: ( rule__Phenomenon__DescriptionAssignment_3_1 )
            {
             before(grammarAccess.getPhenomenonAccess().getDescriptionAssignment_3_1()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1558:1: ( rule__Phenomenon__DescriptionAssignment_3_1 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1558:2: rule__Phenomenon__DescriptionAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Phenomenon__DescriptionAssignment_3_1_in_rule__Phenomenon__Group_3__1__Impl3152);
            rule__Phenomenon__DescriptionAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getPhenomenonAccess().getDescriptionAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Phenomenon__Group_3__1__Impl


    // $ANTLR start rule__Link__Group__0
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1572:1: rule__Link__Group__0 : rule__Link__Group__0__Impl rule__Link__Group__1 ;
    public final void rule__Link__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1576:1: ( rule__Link__Group__0__Impl rule__Link__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1577:2: rule__Link__Group__0__Impl rule__Link__Group__1
            {
            pushFollow(FOLLOW_rule__Link__Group__0__Impl_in_rule__Link__Group__03186);
            rule__Link__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Link__Group__1_in_rule__Link__Group__03189);
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


    // $ANTLR start rule__Link__Group__0__Impl
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1584:1: rule__Link__Group__0__Impl : ( ( rule__Link__FromAssignment_0 ) ) ;
    public final void rule__Link__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1588:1: ( ( ( rule__Link__FromAssignment_0 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1589:1: ( ( rule__Link__FromAssignment_0 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1589:1: ( ( rule__Link__FromAssignment_0 ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1590:1: ( rule__Link__FromAssignment_0 )
            {
             before(grammarAccess.getLinkAccess().getFromAssignment_0()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1591:1: ( rule__Link__FromAssignment_0 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1591:2: rule__Link__FromAssignment_0
            {
            pushFollow(FOLLOW_rule__Link__FromAssignment_0_in_rule__Link__Group__0__Impl3216);
            rule__Link__FromAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getLinkAccess().getFromAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__Group__0__Impl


    // $ANTLR start rule__Link__Group__1
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1601:1: rule__Link__Group__1 : rule__Link__Group__1__Impl rule__Link__Group__2 ;
    public final void rule__Link__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1605:1: ( rule__Link__Group__1__Impl rule__Link__Group__2 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1606:2: rule__Link__Group__1__Impl rule__Link__Group__2
            {
            pushFollow(FOLLOW_rule__Link__Group__1__Impl_in_rule__Link__Group__13246);
            rule__Link__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Link__Group__2_in_rule__Link__Group__13249);
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


    // $ANTLR start rule__Link__Group__1__Impl
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1613:1: rule__Link__Group__1__Impl : ( ( rule__Link__TypeAssignment_1 ) ) ;
    public final void rule__Link__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1617:1: ( ( ( rule__Link__TypeAssignment_1 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1618:1: ( ( rule__Link__TypeAssignment_1 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1618:1: ( ( rule__Link__TypeAssignment_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1619:1: ( rule__Link__TypeAssignment_1 )
            {
             before(grammarAccess.getLinkAccess().getTypeAssignment_1()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1620:1: ( rule__Link__TypeAssignment_1 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1620:2: rule__Link__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Link__TypeAssignment_1_in_rule__Link__Group__1__Impl3276);
            rule__Link__TypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getLinkAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__Group__1__Impl


    // $ANTLR start rule__Link__Group__2
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1630:1: rule__Link__Group__2 : rule__Link__Group__2__Impl rule__Link__Group__3 ;
    public final void rule__Link__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1634:1: ( rule__Link__Group__2__Impl rule__Link__Group__3 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1635:2: rule__Link__Group__2__Impl rule__Link__Group__3
            {
            pushFollow(FOLLOW_rule__Link__Group__2__Impl_in_rule__Link__Group__23306);
            rule__Link__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Link__Group__3_in_rule__Link__Group__23309);
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


    // $ANTLR start rule__Link__Group__2__Impl
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1642:1: rule__Link__Group__2__Impl : ( ( rule__Link__ToAssignment_2 ) ) ;
    public final void rule__Link__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1646:1: ( ( ( rule__Link__ToAssignment_2 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1647:1: ( ( rule__Link__ToAssignment_2 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1647:1: ( ( rule__Link__ToAssignment_2 ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1648:1: ( rule__Link__ToAssignment_2 )
            {
             before(grammarAccess.getLinkAccess().getToAssignment_2()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1649:1: ( rule__Link__ToAssignment_2 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1649:2: rule__Link__ToAssignment_2
            {
            pushFollow(FOLLOW_rule__Link__ToAssignment_2_in_rule__Link__Group__2__Impl3336);
            rule__Link__ToAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getLinkAccess().getToAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__Group__2__Impl


    // $ANTLR start rule__Link__Group__3
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1659:1: rule__Link__Group__3 : rule__Link__Group__3__Impl rule__Link__Group__4 ;
    public final void rule__Link__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1663:1: ( rule__Link__Group__3__Impl rule__Link__Group__4 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1664:2: rule__Link__Group__3__Impl rule__Link__Group__4
            {
            pushFollow(FOLLOW_rule__Link__Group__3__Impl_in_rule__Link__Group__33366);
            rule__Link__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Link__Group__4_in_rule__Link__Group__33369);
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


    // $ANTLR start rule__Link__Group__3__Impl
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1671:1: rule__Link__Group__3__Impl : ( ( rule__Link__Group_3__0 )? ) ;
    public final void rule__Link__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1675:1: ( ( ( rule__Link__Group_3__0 )? ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1676:1: ( ( rule__Link__Group_3__0 )? )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1676:1: ( ( rule__Link__Group_3__0 )? )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1677:1: ( rule__Link__Group_3__0 )?
            {
             before(grammarAccess.getLinkAccess().getGroup_3()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1678:1: ( rule__Link__Group_3__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==29) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==RULE_ID||(LA19_1>=19 && LA19_1<=21)||LA19_1==35) ) {
                    alt19=1;
                }
            }
            switch (alt19) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1678:2: rule__Link__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Link__Group_3__0_in_rule__Link__Group__3__Impl3396);
                    rule__Link__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLinkAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__Group__3__Impl


    // $ANTLR start rule__Link__Group__4
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1688:1: rule__Link__Group__4 : rule__Link__Group__4__Impl rule__Link__Group__5 ;
    public final void rule__Link__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1692:1: ( rule__Link__Group__4__Impl rule__Link__Group__5 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1693:2: rule__Link__Group__4__Impl rule__Link__Group__5
            {
            pushFollow(FOLLOW_rule__Link__Group__4__Impl_in_rule__Link__Group__43427);
            rule__Link__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Link__Group__5_in_rule__Link__Group__43430);
            rule__Link__Group__5();
            _fsp--;


            }

        }
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


    // $ANTLR start rule__Link__Group__4__Impl
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1700:1: rule__Link__Group__4__Impl : ( ( rule__Link__Group_4__0 )? ) ;
    public final void rule__Link__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1704:1: ( ( ( rule__Link__Group_4__0 )? ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1705:1: ( ( rule__Link__Group_4__0 )? )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1705:1: ( ( rule__Link__Group_4__0 )? )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1706:1: ( rule__Link__Group_4__0 )?
            {
             before(grammarAccess.getLinkAccess().getGroup_4()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1707:1: ( rule__Link__Group_4__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_STRING||LA20_0==28) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1707:2: rule__Link__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Link__Group_4__0_in_rule__Link__Group__4__Impl3457);
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
    // $ANTLR end rule__Link__Group__4__Impl


    // $ANTLR start rule__Link__Group__5
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1717:1: rule__Link__Group__5 : rule__Link__Group__5__Impl ;
    public final void rule__Link__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1721:1: ( rule__Link__Group__5__Impl )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1722:2: rule__Link__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Link__Group__5__Impl_in_rule__Link__Group__53488);
            rule__Link__Group__5__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__Group__5


    // $ANTLR start rule__Link__Group__5__Impl
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1728:1: rule__Link__Group__5__Impl : ( ( rule__Link__Group_5__0 )? ) ;
    public final void rule__Link__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1732:1: ( ( ( rule__Link__Group_5__0 )? ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1733:1: ( ( rule__Link__Group_5__0 )? )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1733:1: ( ( rule__Link__Group_5__0 )? )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1734:1: ( rule__Link__Group_5__0 )?
            {
             before(grammarAccess.getLinkAccess().getGroup_5()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1735:1: ( rule__Link__Group_5__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==29) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1735:2: rule__Link__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Link__Group_5__0_in_rule__Link__Group__5__Impl3515);
                    rule__Link__Group_5__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLinkAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__Group__5__Impl


    // $ANTLR start rule__Link__Group_3__0
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1757:1: rule__Link__Group_3__0 : rule__Link__Group_3__0__Impl rule__Link__Group_3__1 ;
    public final void rule__Link__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1761:1: ( rule__Link__Group_3__0__Impl rule__Link__Group_3__1 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1762:2: rule__Link__Group_3__0__Impl rule__Link__Group_3__1
            {
            pushFollow(FOLLOW_rule__Link__Group_3__0__Impl_in_rule__Link__Group_3__03558);
            rule__Link__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Link__Group_3__1_in_rule__Link__Group_3__03561);
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


    // $ANTLR start rule__Link__Group_3__0__Impl
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1769:1: rule__Link__Group_3__0__Impl : ( '{' ) ;
    public final void rule__Link__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1773:1: ( ( '{' ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1774:1: ( '{' )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1774:1: ( '{' )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1775:1: '{'
            {
             before(grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,29,FOLLOW_29_in_rule__Link__Group_3__0__Impl3589); 
             after(grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__Group_3__0__Impl


    // $ANTLR start rule__Link__Group_3__1
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1788:1: rule__Link__Group_3__1 : rule__Link__Group_3__1__Impl rule__Link__Group_3__2 ;
    public final void rule__Link__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1792:1: ( rule__Link__Group_3__1__Impl rule__Link__Group_3__2 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1793:2: rule__Link__Group_3__1__Impl rule__Link__Group_3__2
            {
            pushFollow(FOLLOW_rule__Link__Group_3__1__Impl_in_rule__Link__Group_3__13620);
            rule__Link__Group_3__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Link__Group_3__2_in_rule__Link__Group_3__13623);
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


    // $ANTLR start rule__Link__Group_3__1__Impl
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1800:1: rule__Link__Group_3__1__Impl : ( ( rule__Link__PhenomenaAssignment_3_1 ) ) ;
    public final void rule__Link__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1804:1: ( ( ( rule__Link__PhenomenaAssignment_3_1 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1805:1: ( ( rule__Link__PhenomenaAssignment_3_1 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1805:1: ( ( rule__Link__PhenomenaAssignment_3_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1806:1: ( rule__Link__PhenomenaAssignment_3_1 )
            {
             before(grammarAccess.getLinkAccess().getPhenomenaAssignment_3_1()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1807:1: ( rule__Link__PhenomenaAssignment_3_1 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1807:2: rule__Link__PhenomenaAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Link__PhenomenaAssignment_3_1_in_rule__Link__Group_3__1__Impl3650);
            rule__Link__PhenomenaAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getLinkAccess().getPhenomenaAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__Group_3__1__Impl


    // $ANTLR start rule__Link__Group_3__2
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1817:1: rule__Link__Group_3__2 : rule__Link__Group_3__2__Impl rule__Link__Group_3__3 ;
    public final void rule__Link__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1821:1: ( rule__Link__Group_3__2__Impl rule__Link__Group_3__3 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1822:2: rule__Link__Group_3__2__Impl rule__Link__Group_3__3
            {
            pushFollow(FOLLOW_rule__Link__Group_3__2__Impl_in_rule__Link__Group_3__23680);
            rule__Link__Group_3__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Link__Group_3__3_in_rule__Link__Group_3__23683);
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


    // $ANTLR start rule__Link__Group_3__2__Impl
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1829:1: rule__Link__Group_3__2__Impl : ( ( rule__Link__Group_3_2__0 )* ) ;
    public final void rule__Link__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1833:1: ( ( ( rule__Link__Group_3_2__0 )* ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1834:1: ( ( rule__Link__Group_3_2__0 )* )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1834:1: ( ( rule__Link__Group_3_2__0 )* )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1835:1: ( rule__Link__Group_3_2__0 )*
            {
             before(grammarAccess.getLinkAccess().getGroup_3_2()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1836:1: ( rule__Link__Group_3_2__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==31) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1836:2: rule__Link__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Link__Group_3_2__0_in_rule__Link__Group_3__2__Impl3710);
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


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__Group_3__2__Impl


    // $ANTLR start rule__Link__Group_3__3
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1846:1: rule__Link__Group_3__3 : rule__Link__Group_3__3__Impl ;
    public final void rule__Link__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1850:1: ( rule__Link__Group_3__3__Impl )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1851:2: rule__Link__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__Link__Group_3__3__Impl_in_rule__Link__Group_3__33741);
            rule__Link__Group_3__3__Impl();
            _fsp--;


            }

        }
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


    // $ANTLR start rule__Link__Group_3__3__Impl
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1857:1: rule__Link__Group_3__3__Impl : ( '}' ) ;
    public final void rule__Link__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1861:1: ( ( '}' ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1862:1: ( '}' )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1862:1: ( '}' )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1863:1: '}'
            {
             before(grammarAccess.getLinkAccess().getRightCurlyBracketKeyword_3_3()); 
            match(input,30,FOLLOW_30_in_rule__Link__Group_3__3__Impl3769); 
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
    // $ANTLR end rule__Link__Group_3__3__Impl


    // $ANTLR start rule__Link__Group_3_2__0
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1884:1: rule__Link__Group_3_2__0 : rule__Link__Group_3_2__0__Impl rule__Link__Group_3_2__1 ;
    public final void rule__Link__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1888:1: ( rule__Link__Group_3_2__0__Impl rule__Link__Group_3_2__1 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1889:2: rule__Link__Group_3_2__0__Impl rule__Link__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__Link__Group_3_2__0__Impl_in_rule__Link__Group_3_2__03808);
            rule__Link__Group_3_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Link__Group_3_2__1_in_rule__Link__Group_3_2__03811);
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


    // $ANTLR start rule__Link__Group_3_2__0__Impl
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1896:1: rule__Link__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__Link__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1900:1: ( ( ',' ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1901:1: ( ',' )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1901:1: ( ',' )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1902:1: ','
            {
             before(grammarAccess.getLinkAccess().getCommaKeyword_3_2_0()); 
            match(input,31,FOLLOW_31_in_rule__Link__Group_3_2__0__Impl3839); 
             after(grammarAccess.getLinkAccess().getCommaKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__Group_3_2__0__Impl


    // $ANTLR start rule__Link__Group_3_2__1
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1915:1: rule__Link__Group_3_2__1 : rule__Link__Group_3_2__1__Impl ;
    public final void rule__Link__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1919:1: ( rule__Link__Group_3_2__1__Impl )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1920:2: rule__Link__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Link__Group_3_2__1__Impl_in_rule__Link__Group_3_2__13870);
            rule__Link__Group_3_2__1__Impl();
            _fsp--;


            }

        }
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


    // $ANTLR start rule__Link__Group_3_2__1__Impl
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1926:1: rule__Link__Group_3_2__1__Impl : ( ( rule__Link__PhenomenaAssignment_3_2_1 ) ) ;
    public final void rule__Link__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1930:1: ( ( ( rule__Link__PhenomenaAssignment_3_2_1 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1931:1: ( ( rule__Link__PhenomenaAssignment_3_2_1 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1931:1: ( ( rule__Link__PhenomenaAssignment_3_2_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1932:1: ( rule__Link__PhenomenaAssignment_3_2_1 )
            {
             before(grammarAccess.getLinkAccess().getPhenomenaAssignment_3_2_1()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1933:1: ( rule__Link__PhenomenaAssignment_3_2_1 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1933:2: rule__Link__PhenomenaAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__Link__PhenomenaAssignment_3_2_1_in_rule__Link__Group_3_2__1__Impl3897);
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
    // $ANTLR end rule__Link__Group_3_2__1__Impl


    // $ANTLR start rule__Link__Group_4__0
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1947:1: rule__Link__Group_4__0 : rule__Link__Group_4__0__Impl rule__Link__Group_4__1 ;
    public final void rule__Link__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1951:1: ( rule__Link__Group_4__0__Impl rule__Link__Group_4__1 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1952:2: rule__Link__Group_4__0__Impl rule__Link__Group_4__1
            {
            pushFollow(FOLLOW_rule__Link__Group_4__0__Impl_in_rule__Link__Group_4__03931);
            rule__Link__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Link__Group_4__1_in_rule__Link__Group_4__03934);
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


    // $ANTLR start rule__Link__Group_4__0__Impl
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1959:1: rule__Link__Group_4__0__Impl : ( ( ':' )? ) ;
    public final void rule__Link__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1963:1: ( ( ( ':' )? ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1964:1: ( ( ':' )? )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1964:1: ( ( ':' )? )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1965:1: ( ':' )?
            {
             before(grammarAccess.getLinkAccess().getColonKeyword_4_0()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1966:1: ( ':' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==28) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1967:2: ':'
                    {
                    match(input,28,FOLLOW_28_in_rule__Link__Group_4__0__Impl3963); 

                    }
                    break;

            }

             after(grammarAccess.getLinkAccess().getColonKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__Group_4__0__Impl


    // $ANTLR start rule__Link__Group_4__1
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1978:1: rule__Link__Group_4__1 : rule__Link__Group_4__1__Impl ;
    public final void rule__Link__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1982:1: ( rule__Link__Group_4__1__Impl )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1983:2: rule__Link__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Link__Group_4__1__Impl_in_rule__Link__Group_4__13996);
            rule__Link__Group_4__1__Impl();
            _fsp--;


            }

        }
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


    // $ANTLR start rule__Link__Group_4__1__Impl
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1989:1: rule__Link__Group_4__1__Impl : ( ( rule__Link__DescriptionAssignment_4_1 ) ) ;
    public final void rule__Link__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1993:1: ( ( ( rule__Link__DescriptionAssignment_4_1 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1994:1: ( ( rule__Link__DescriptionAssignment_4_1 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1994:1: ( ( rule__Link__DescriptionAssignment_4_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1995:1: ( rule__Link__DescriptionAssignment_4_1 )
            {
             before(grammarAccess.getLinkAccess().getDescriptionAssignment_4_1()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1996:1: ( rule__Link__DescriptionAssignment_4_1 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1996:2: rule__Link__DescriptionAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Link__DescriptionAssignment_4_1_in_rule__Link__Group_4__1__Impl4023);
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
    // $ANTLR end rule__Link__Group_4__1__Impl


    // $ANTLR start rule__Link__Group_5__0
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2010:1: rule__Link__Group_5__0 : rule__Link__Group_5__0__Impl rule__Link__Group_5__1 ;
    public final void rule__Link__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2014:1: ( rule__Link__Group_5__0__Impl rule__Link__Group_5__1 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2015:2: rule__Link__Group_5__0__Impl rule__Link__Group_5__1
            {
            pushFollow(FOLLOW_rule__Link__Group_5__0__Impl_in_rule__Link__Group_5__04057);
            rule__Link__Group_5__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Link__Group_5__1_in_rule__Link__Group_5__04060);
            rule__Link__Group_5__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__Group_5__0


    // $ANTLR start rule__Link__Group_5__0__Impl
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2022:1: rule__Link__Group_5__0__Impl : ( '{' ) ;
    public final void rule__Link__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2026:1: ( ( '{' ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2027:1: ( '{' )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2027:1: ( '{' )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2028:1: '{'
            {
             before(grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_5_0()); 
            match(input,29,FOLLOW_29_in_rule__Link__Group_5__0__Impl4088); 
             after(grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__Group_5__0__Impl


    // $ANTLR start rule__Link__Group_5__1
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2041:1: rule__Link__Group_5__1 : rule__Link__Group_5__1__Impl rule__Link__Group_5__2 ;
    public final void rule__Link__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2045:1: ( rule__Link__Group_5__1__Impl rule__Link__Group_5__2 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2046:2: rule__Link__Group_5__1__Impl rule__Link__Group_5__2
            {
            pushFollow(FOLLOW_rule__Link__Group_5__1__Impl_in_rule__Link__Group_5__14119);
            rule__Link__Group_5__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Link__Group_5__2_in_rule__Link__Group_5__14122);
            rule__Link__Group_5__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__Group_5__1


    // $ANTLR start rule__Link__Group_5__1__Impl
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2053:1: rule__Link__Group_5__1__Impl : ( ( rule__Link__ConcernsAssignment_5_1 )* ) ;
    public final void rule__Link__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2057:1: ( ( ( rule__Link__ConcernsAssignment_5_1 )* ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2058:1: ( ( rule__Link__ConcernsAssignment_5_1 )* )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2058:1: ( ( rule__Link__ConcernsAssignment_5_1 )* )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2059:1: ( rule__Link__ConcernsAssignment_5_1 )*
            {
             before(grammarAccess.getLinkAccess().getConcernsAssignment_5_1()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2060:1: ( rule__Link__ConcernsAssignment_5_1 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==27) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2060:2: rule__Link__ConcernsAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_rule__Link__ConcernsAssignment_5_1_in_rule__Link__Group_5__1__Impl4149);
            	    rule__Link__ConcernsAssignment_5_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getLinkAccess().getConcernsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__Group_5__1__Impl


    // $ANTLR start rule__Link__Group_5__2
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2070:1: rule__Link__Group_5__2 : rule__Link__Group_5__2__Impl ;
    public final void rule__Link__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2074:1: ( rule__Link__Group_5__2__Impl )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2075:2: rule__Link__Group_5__2__Impl
            {
            pushFollow(FOLLOW_rule__Link__Group_5__2__Impl_in_rule__Link__Group_5__24180);
            rule__Link__Group_5__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__Group_5__2


    // $ANTLR start rule__Link__Group_5__2__Impl
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2081:1: rule__Link__Group_5__2__Impl : ( '}' ) ;
    public final void rule__Link__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2085:1: ( ( '}' ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2086:1: ( '}' )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2086:1: ( '}' )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2087:1: '}'
            {
             before(grammarAccess.getLinkAccess().getRightCurlyBracketKeyword_5_2()); 
            match(input,30,FOLLOW_30_in_rule__Link__Group_5__2__Impl4208); 
             after(grammarAccess.getLinkAccess().getRightCurlyBracketKeyword_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__Group_5__2__Impl


    // $ANTLR start rule__ProblemDiagram__NameAssignment_1
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2107:1: rule__ProblemDiagram__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ProblemDiagram__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2111:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2112:1: ( RULE_ID )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2112:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2113:1: RULE_ID
            {
             before(grammarAccess.getProblemDiagramAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ProblemDiagram__NameAssignment_14250); 
             after(grammarAccess.getProblemDiagramAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProblemDiagram__NameAssignment_1


    // $ANTLR start rule__ProblemDiagram__HighlightAssignment_2_1
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2122:1: rule__ProblemDiagram__HighlightAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__ProblemDiagram__HighlightAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2126:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2127:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2127:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2128:1: ( RULE_ID )
            {
             before(grammarAccess.getProblemDiagramAccess().getHighlightNodeCrossReference_2_1_0()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2129:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2130:1: RULE_ID
            {
             before(grammarAccess.getProblemDiagramAccess().getHighlightNodeIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ProblemDiagram__HighlightAssignment_2_14285); 
             after(grammarAccess.getProblemDiagramAccess().getHighlightNodeIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getProblemDiagramAccess().getHighlightNodeCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProblemDiagram__HighlightAssignment_2_1


    // $ANTLR start rule__ProblemDiagram__NodesAssignment_3_0
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2141:1: rule__ProblemDiagram__NodesAssignment_3_0 : ( ruleNode ) ;
    public final void rule__ProblemDiagram__NodesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2145:1: ( ( ruleNode ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2146:1: ( ruleNode )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2146:1: ( ruleNode )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2147:1: ruleNode
            {
             before(grammarAccess.getProblemDiagramAccess().getNodesNodeParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_ruleNode_in_rule__ProblemDiagram__NodesAssignment_3_04320);
            ruleNode();
            _fsp--;

             after(grammarAccess.getProblemDiagramAccess().getNodesNodeParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProblemDiagram__NodesAssignment_3_0


    // $ANTLR start rule__ProblemDiagram__LinksAssignment_3_1
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2156:1: rule__ProblemDiagram__LinksAssignment_3_1 : ( ruleLink ) ;
    public final void rule__ProblemDiagram__LinksAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2160:1: ( ( ruleLink ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2161:1: ( ruleLink )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2161:1: ( ruleLink )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2162:1: ruleLink
            {
             before(grammarAccess.getProblemDiagramAccess().getLinksLinkParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleLink_in_rule__ProblemDiagram__LinksAssignment_3_14351);
            ruleLink();
            _fsp--;

             after(grammarAccess.getProblemDiagramAccess().getLinksLinkParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProblemDiagram__LinksAssignment_3_1


    // $ANTLR start rule__Concern__NameAssignment_1
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2171:1: rule__Concern__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Concern__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2175:1: ( ( RULE_STRING ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2176:1: ( RULE_STRING )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2176:1: ( RULE_STRING )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2177:1: RULE_STRING
            {
             before(grammarAccess.getConcernAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Concern__NameAssignment_14382); 
             after(grammarAccess.getConcernAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Concern__NameAssignment_1


    // $ANTLR start rule__Node__NameAssignment_0
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2186:1: rule__Node__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Node__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2190:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2191:1: ( RULE_ID )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2191:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2192:1: RULE_ID
            {
             before(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Node__NameAssignment_04413); 
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2201:1: rule__Node__TypeAssignment_1 : ( ruleNodeType ) ;
    public final void rule__Node__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2205:1: ( ( ruleNodeType ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2206:1: ( ruleNodeType )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2206:1: ( ruleNodeType )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2207:1: ruleNodeType
            {
             before(grammarAccess.getNodeAccess().getTypeNodeTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleNodeType_in_rule__Node__TypeAssignment_14444);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2216:1: rule__Node__DescriptionAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Node__DescriptionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2220:1: ( ( RULE_STRING ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2221:1: ( RULE_STRING )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2221:1: ( RULE_STRING )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2222:1: RULE_STRING
            {
             before(grammarAccess.getNodeAccess().getDescriptionSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Node__DescriptionAssignment_2_14475); 
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


    // $ANTLR start rule__Node__HiddenPhenomenaAssignment_3_1_0
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2231:1: rule__Node__HiddenPhenomenaAssignment_3_1_0 : ( rulePhenomenon ) ;
    public final void rule__Node__HiddenPhenomenaAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2235:1: ( ( rulePhenomenon ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2236:1: ( rulePhenomenon )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2236:1: ( rulePhenomenon )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2237:1: rulePhenomenon
            {
             before(grammarAccess.getNodeAccess().getHiddenPhenomenaPhenomenonParserRuleCall_3_1_0_0()); 
            pushFollow(FOLLOW_rulePhenomenon_in_rule__Node__HiddenPhenomenaAssignment_3_1_04506);
            rulePhenomenon();
            _fsp--;

             after(grammarAccess.getNodeAccess().getHiddenPhenomenaPhenomenonParserRuleCall_3_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__HiddenPhenomenaAssignment_3_1_0


    // $ANTLR start rule__Node__HiddenPhenomenaAssignment_3_1_1_1
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2246:1: rule__Node__HiddenPhenomenaAssignment_3_1_1_1 : ( rulePhenomenon ) ;
    public final void rule__Node__HiddenPhenomenaAssignment_3_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2250:1: ( ( rulePhenomenon ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2251:1: ( rulePhenomenon )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2251:1: ( rulePhenomenon )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2252:1: rulePhenomenon
            {
             before(grammarAccess.getNodeAccess().getHiddenPhenomenaPhenomenonParserRuleCall_3_1_1_1_0()); 
            pushFollow(FOLLOW_rulePhenomenon_in_rule__Node__HiddenPhenomenaAssignment_3_1_1_14537);
            rulePhenomenon();
            _fsp--;

             after(grammarAccess.getNodeAccess().getHiddenPhenomenaPhenomenonParserRuleCall_3_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__HiddenPhenomenaAssignment_3_1_1_1


    // $ANTLR start rule__Node__SubproblemAssignment_3_2_0
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2261:1: rule__Node__SubproblemAssignment_3_2_0 : ( ruleProblemDiagram ) ;
    public final void rule__Node__SubproblemAssignment_3_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2265:1: ( ( ruleProblemDiagram ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2266:1: ( ruleProblemDiagram )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2266:1: ( ruleProblemDiagram )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2267:1: ruleProblemDiagram
            {
             before(grammarAccess.getNodeAccess().getSubproblemProblemDiagramParserRuleCall_3_2_0_0()); 
            pushFollow(FOLLOW_ruleProblemDiagram_in_rule__Node__SubproblemAssignment_3_2_04568);
            ruleProblemDiagram();
            _fsp--;

             after(grammarAccess.getNodeAccess().getSubproblemProblemDiagramParserRuleCall_3_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__SubproblemAssignment_3_2_0


    // $ANTLR start rule__Node__ProblemNodeRefAssignment_3_2_1_2
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2276:1: rule__Node__ProblemNodeRefAssignment_3_2_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__Node__ProblemNodeRefAssignment_3_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2280:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2281:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2281:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2282:1: ( RULE_ID )
            {
             before(grammarAccess.getNodeAccess().getProblemNodeRefNodeCrossReference_3_2_1_2_0()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2283:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2284:1: RULE_ID
            {
             before(grammarAccess.getNodeAccess().getProblemNodeRefNodeIDTerminalRuleCall_3_2_1_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Node__ProblemNodeRefAssignment_3_2_1_24603); 
             after(grammarAccess.getNodeAccess().getProblemNodeRefNodeIDTerminalRuleCall_3_2_1_2_0_1()); 

            }

             after(grammarAccess.getNodeAccess().getProblemNodeRefNodeCrossReference_3_2_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__ProblemNodeRefAssignment_3_2_1_2


    // $ANTLR start rule__Node__ProblemRefAssignment_3_2_2_2
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2295:1: rule__Node__ProblemRefAssignment_3_2_2_2 : ( ( RULE_ID ) ) ;
    public final void rule__Node__ProblemRefAssignment_3_2_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2299:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2300:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2300:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2301:1: ( RULE_ID )
            {
             before(grammarAccess.getNodeAccess().getProblemRefProblemDiagramCrossReference_3_2_2_2_0()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2302:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2303:1: RULE_ID
            {
             before(grammarAccess.getNodeAccess().getProblemRefProblemDiagramIDTerminalRuleCall_3_2_2_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Node__ProblemRefAssignment_3_2_2_24642); 
             after(grammarAccess.getNodeAccess().getProblemRefProblemDiagramIDTerminalRuleCall_3_2_2_2_0_1()); 

            }

             after(grammarAccess.getNodeAccess().getProblemRefProblemDiagramCrossReference_3_2_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__ProblemRefAssignment_3_2_2_2


    // $ANTLR start rule__Node__HrefAssignment_3_2_3_1
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2314:1: rule__Node__HrefAssignment_3_2_3_1 : ( RULE_STRING ) ;
    public final void rule__Node__HrefAssignment_3_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2318:1: ( ( RULE_STRING ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2319:1: ( RULE_STRING )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2319:1: ( RULE_STRING )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2320:1: RULE_STRING
            {
             before(grammarAccess.getNodeAccess().getHrefSTRINGTerminalRuleCall_3_2_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Node__HrefAssignment_3_2_3_14677); 
             after(grammarAccess.getNodeAccess().getHrefSTRINGTerminalRuleCall_3_2_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__HrefAssignment_3_2_3_1


    // $ANTLR start rule__Node__ConcernsAssignment_3_2_4
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2329:1: rule__Node__ConcernsAssignment_3_2_4 : ( ruleConcern ) ;
    public final void rule__Node__ConcernsAssignment_3_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2333:1: ( ( ruleConcern ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2334:1: ( ruleConcern )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2334:1: ( ruleConcern )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2335:1: ruleConcern
            {
             before(grammarAccess.getNodeAccess().getConcernsConcernParserRuleCall_3_2_4_0()); 
            pushFollow(FOLLOW_ruleConcern_in_rule__Node__ConcernsAssignment_3_2_44708);
            ruleConcern();
            _fsp--;

             after(grammarAccess.getNodeAccess().getConcernsConcernParserRuleCall_3_2_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__ConcernsAssignment_3_2_4


    // $ANTLR start rule__Phenomenon__TypeAssignment_0
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2344:1: rule__Phenomenon__TypeAssignment_0 : ( rulePhenomenonType ) ;
    public final void rule__Phenomenon__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2348:1: ( ( rulePhenomenonType ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2349:1: ( rulePhenomenonType )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2349:1: ( rulePhenomenonType )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2350:1: rulePhenomenonType
            {
             before(grammarAccess.getPhenomenonAccess().getTypePhenomenonTypeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_rulePhenomenonType_in_rule__Phenomenon__TypeAssignment_04739);
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


    // $ANTLR start rule__Phenomenon__IsControlledAssignment_1
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2359:1: rule__Phenomenon__IsControlledAssignment_1 : ( ( '!' ) ) ;
    public final void rule__Phenomenon__IsControlledAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2363:1: ( ( ( '!' ) ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2364:1: ( ( '!' ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2364:1: ( ( '!' ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2365:1: ( '!' )
            {
             before(grammarAccess.getPhenomenonAccess().getIsControlledExclamationMarkKeyword_1_0()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2366:1: ( '!' )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2367:1: '!'
            {
             before(grammarAccess.getPhenomenonAccess().getIsControlledExclamationMarkKeyword_1_0()); 
            match(input,35,FOLLOW_35_in_rule__Phenomenon__IsControlledAssignment_14775); 
             after(grammarAccess.getPhenomenonAccess().getIsControlledExclamationMarkKeyword_1_0()); 

            }

             after(grammarAccess.getPhenomenonAccess().getIsControlledExclamationMarkKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Phenomenon__IsControlledAssignment_1


    // $ANTLR start rule__Phenomenon__NameAssignment_2
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2382:1: rule__Phenomenon__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Phenomenon__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2386:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2387:1: ( RULE_ID )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2387:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2388:1: RULE_ID
            {
             before(grammarAccess.getPhenomenonAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Phenomenon__NameAssignment_24814); 
             after(grammarAccess.getPhenomenonAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Phenomenon__NameAssignment_2


    // $ANTLR start rule__Phenomenon__DescriptionAssignment_3_1
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2397:1: rule__Phenomenon__DescriptionAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Phenomenon__DescriptionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2401:1: ( ( RULE_STRING ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2402:1: ( RULE_STRING )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2402:1: ( RULE_STRING )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2403:1: RULE_STRING
            {
             before(grammarAccess.getPhenomenonAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Phenomenon__DescriptionAssignment_3_14845); 
             after(grammarAccess.getPhenomenonAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Phenomenon__DescriptionAssignment_3_1


    // $ANTLR start rule__Link__FromAssignment_0
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2412:1: rule__Link__FromAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Link__FromAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2416:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2417:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2417:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2418:1: ( RULE_ID )
            {
             before(grammarAccess.getLinkAccess().getFromNodeCrossReference_0_0()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2419:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2420:1: RULE_ID
            {
             before(grammarAccess.getLinkAccess().getFromNodeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Link__FromAssignment_04880); 
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2431:1: rule__Link__TypeAssignment_1 : ( ruleLinkType ) ;
    public final void rule__Link__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2435:1: ( ( ruleLinkType ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2436:1: ( ruleLinkType )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2436:1: ( ruleLinkType )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2437:1: ruleLinkType
            {
             before(grammarAccess.getLinkAccess().getTypeLinkTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleLinkType_in_rule__Link__TypeAssignment_14915);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2446:1: rule__Link__ToAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Link__ToAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2450:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2451:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2451:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2452:1: ( RULE_ID )
            {
             before(grammarAccess.getLinkAccess().getToNodeCrossReference_2_0()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2453:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2454:1: RULE_ID
            {
             before(grammarAccess.getLinkAccess().getToNodeIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Link__ToAssignment_24950); 
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2465:1: rule__Link__PhenomenaAssignment_3_1 : ( rulePhenomenon ) ;
    public final void rule__Link__PhenomenaAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2469:1: ( ( rulePhenomenon ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2470:1: ( rulePhenomenon )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2470:1: ( rulePhenomenon )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2471:1: rulePhenomenon
            {
             before(grammarAccess.getLinkAccess().getPhenomenaPhenomenonParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_rulePhenomenon_in_rule__Link__PhenomenaAssignment_3_14985);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2480:1: rule__Link__PhenomenaAssignment_3_2_1 : ( rulePhenomenon ) ;
    public final void rule__Link__PhenomenaAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2484:1: ( ( rulePhenomenon ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2485:1: ( rulePhenomenon )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2485:1: ( rulePhenomenon )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2486:1: rulePhenomenon
            {
             before(grammarAccess.getLinkAccess().getPhenomenaPhenomenonParserRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_rulePhenomenon_in_rule__Link__PhenomenaAssignment_3_2_15016);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2495:1: rule__Link__DescriptionAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Link__DescriptionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2499:1: ( ( RULE_STRING ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2500:1: ( RULE_STRING )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2500:1: ( RULE_STRING )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2501:1: RULE_STRING
            {
             before(grammarAccess.getLinkAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Link__DescriptionAssignment_4_15047); 
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


    // $ANTLR start rule__Link__ConcernsAssignment_5_1
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2510:1: rule__Link__ConcernsAssignment_5_1 : ( ruleConcern ) ;
    public final void rule__Link__ConcernsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2514:1: ( ( ruleConcern ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2515:1: ( ruleConcern )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2515:1: ( ruleConcern )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2516:1: ruleConcern
            {
             before(grammarAccess.getLinkAccess().getConcernsConcernParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleConcern_in_rule__Link__ConcernsAssignment_5_15078);
            ruleConcern();
            _fsp--;

             after(grammarAccess.getLinkAccess().getConcernsConcernParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__ConcernsAssignment_5_1


 

    public static final BitSet FOLLOW_ruleProblemDiagram_in_entryRuleProblemDiagram61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProblemDiagram68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__Group__0_in_ruleProblemDiagram94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcern_in_entryRuleConcern121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConcern128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Concern__Group__0_in_ruleConcern154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_entryRuleNode181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNode188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__0_in_ruleNode214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhenomenon_in_entryRulePhenomenon241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePhenomenon248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Phenomenon__Group__0_in_rulePhenomenon274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_entryRuleLink301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLink308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group__0_in_ruleLink334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeType__Alternatives_in_ruleNodeType371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PhenomenonType__Alternatives_in_rulePhenomenonType407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinkType__Alternatives_in_ruleLinkType443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__NodesAssignment_3_0_in_rule__ProblemDiagram__Alternatives_3478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__LinksAssignment_3_1_in_rule__ProblemDiagram__Alternatives_3496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__SubproblemAssignment_3_2_0_in_rule__Node__Alternatives_3_2529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3_2_1__0_in_rule__Node__Alternatives_3_2547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3_2_2__0_in_rule__Node__Alternatives_3_2565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3_2_3__0_in_rule__Node__Alternatives_3_2583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__ConcernsAssignment_3_2_4_in_rule__Node__Alternatives_3_2601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__NodeType__Alternatives635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__NodeType__Alternatives656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__NodeType__Alternatives677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__NodeType__Alternatives698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__NodeType__Alternatives719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__NodeType__Alternatives740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__NodeType__Alternatives761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__PhenomenonType__Alternatives797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__PhenomenonType__Alternatives818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__PhenomenonType__Alternatives839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__LinkType__Alternatives875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__LinkType__Alternatives896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__LinkType__Alternatives917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__Group__0__Impl_in_rule__ProblemDiagram__Group__0950 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__Group__1_in_rule__ProblemDiagram__Group__0953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ProblemDiagram__Group__0__Impl981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__Group__1__Impl_in_rule__ProblemDiagram__Group__11012 = new BitSet(new long[]{0x0000000004000012L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__Group__2_in_rule__ProblemDiagram__Group__11015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__NameAssignment_1_in_rule__ProblemDiagram__Group__1__Impl1042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__Group__2__Impl_in_rule__ProblemDiagram__Group__21072 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__Group__3_in_rule__ProblemDiagram__Group__21075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__Group_2__0_in_rule__ProblemDiagram__Group__2__Impl1102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__Group__3__Impl_in_rule__ProblemDiagram__Group__31133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__Alternatives_3_in_rule__ProblemDiagram__Group__3__Impl1160 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__Group_2__0__Impl_in_rule__ProblemDiagram__Group_2__01199 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__Group_2__1_in_rule__ProblemDiagram__Group_2__01202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ProblemDiagram__Group_2__0__Impl1230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__Group_2__1__Impl_in_rule__ProblemDiagram__Group_2__11261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__HighlightAssignment_2_1_in_rule__ProblemDiagram__Group_2__1__Impl1288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Concern__Group__0__Impl_in_rule__Concern__Group__01322 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Concern__Group__1_in_rule__Concern__Group__01325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Concern__Group__0__Impl1353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Concern__Group__1__Impl_in_rule__Concern__Group__11384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Concern__NameAssignment_1_in_rule__Concern__Group__1__Impl1411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__0__Impl_in_rule__Node__Group__01445 = new BitSet(new long[]{0x000000003007F022L});
    public static final BitSet FOLLOW_rule__Node__Group__1_in_rule__Node__Group__01448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__NameAssignment_0_in_rule__Node__Group__0__Impl1475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__1__Impl_in_rule__Node__Group__11505 = new BitSet(new long[]{0x0000000030000022L});
    public static final BitSet FOLLOW_rule__Node__Group__2_in_rule__Node__Group__11508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__TypeAssignment_1_in_rule__Node__Group__1__Impl1535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__2__Impl_in_rule__Node__Group__21566 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__Node__Group__3_in_rule__Node__Group__21569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_2__0_in_rule__Node__Group__2__Impl1596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__3__Impl_in_rule__Node__Group__31627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3__0_in_rule__Node__Group__3__Impl1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_2__0__Impl_in_rule__Node__Group_2__01693 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Node__Group_2__1_in_rule__Node__Group_2__01696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Node__Group_2__0__Impl1725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_2__1__Impl_in_rule__Node__Group_2__11758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__DescriptionAssignment_2_1_in_rule__Node__Group_2__1__Impl1785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3__0__Impl_in_rule__Node__Group_3__01819 = new BitSet(new long[]{0x000000094A380010L});
    public static final BitSet FOLLOW_rule__Node__Group_3__1_in_rule__Node__Group_3__01822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Node__Group_3__0__Impl1850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3__1__Impl_in_rule__Node__Group_3__11881 = new BitSet(new long[]{0x000000014A000000L});
    public static final BitSet FOLLOW_rule__Node__Group_3__2_in_rule__Node__Group_3__11884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3_1__0_in_rule__Node__Group_3__1__Impl1911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3__2__Impl_in_rule__Node__Group_3__21942 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Node__Group_3__3_in_rule__Node__Group_3__21945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Alternatives_3_2_in_rule__Node__Group_3__2__Impl1972 = new BitSet(new long[]{0x000000010A000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3__3__Impl_in_rule__Node__Group_3__32003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Node__Group_3__3__Impl2031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3_1__0__Impl_in_rule__Node__Group_3_1__02070 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3_1__1_in_rule__Node__Group_3_1__02073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__HiddenPhenomenaAssignment_3_1_0_in_rule__Node__Group_3_1__0__Impl2100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3_1__1__Impl_in_rule__Node__Group_3_1__12130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3_1_1__0_in_rule__Node__Group_3_1__1__Impl2157 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3_1_1__0__Impl_in_rule__Node__Group_3_1_1__02192 = new BitSet(new long[]{0x0000000800380010L});
    public static final BitSet FOLLOW_rule__Node__Group_3_1_1__1_in_rule__Node__Group_3_1_1__02195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Node__Group_3_1_1__0__Impl2223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3_1_1__1__Impl_in_rule__Node__Group_3_1_1__12254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__HiddenPhenomenaAssignment_3_1_1_1_in_rule__Node__Group_3_1_1__1__Impl2281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3_2_1__0__Impl_in_rule__Node__Group_3_2_1__02315 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Node__Group_3_2_1__1_in_rule__Node__Group_3_2_1__02318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Node__Group_3_2_1__0__Impl2346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3_2_1__1__Impl_in_rule__Node__Group_3_2_1__12377 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Node__Group_3_2_1__2_in_rule__Node__Group_3_2_1__12380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Node__Group_3_2_1__1__Impl2408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3_2_1__2__Impl_in_rule__Node__Group_3_2_1__22439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__ProblemNodeRefAssignment_3_2_1_2_in_rule__Node__Group_3_2_1__2__Impl2466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3_2_2__0__Impl_in_rule__Node__Group_3_2_2__02502 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Node__Group_3_2_2__1_in_rule__Node__Group_3_2_2__02505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Node__Group_3_2_2__0__Impl2533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3_2_2__1__Impl_in_rule__Node__Group_3_2_2__12564 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Node__Group_3_2_2__2_in_rule__Node__Group_3_2_2__12567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Node__Group_3_2_2__1__Impl2595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3_2_2__2__Impl_in_rule__Node__Group_3_2_2__22626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__ProblemRefAssignment_3_2_2_2_in_rule__Node__Group_3_2_2__2__Impl2653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3_2_3__0__Impl_in_rule__Node__Group_3_2_3__02689 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Node__Group_3_2_3__1_in_rule__Node__Group_3_2_3__02692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Node__Group_3_2_3__0__Impl2720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3_2_3__1__Impl_in_rule__Node__Group_3_2_3__12751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__HrefAssignment_3_2_3_1_in_rule__Node__Group_3_2_3__1__Impl2778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Phenomenon__Group__0__Impl_in_rule__Phenomenon__Group__02812 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_rule__Phenomenon__Group__1_in_rule__Phenomenon__Group__02815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Phenomenon__TypeAssignment_0_in_rule__Phenomenon__Group__0__Impl2842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Phenomenon__Group__1__Impl_in_rule__Phenomenon__Group__12873 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Phenomenon__Group__2_in_rule__Phenomenon__Group__12876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Phenomenon__IsControlledAssignment_1_in_rule__Phenomenon__Group__1__Impl2903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Phenomenon__Group__2__Impl_in_rule__Phenomenon__Group__22934 = new BitSet(new long[]{0x0000000010000022L});
    public static final BitSet FOLLOW_rule__Phenomenon__Group__3_in_rule__Phenomenon__Group__22937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Phenomenon__NameAssignment_2_in_rule__Phenomenon__Group__2__Impl2964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Phenomenon__Group__3__Impl_in_rule__Phenomenon__Group__32994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Phenomenon__Group_3__0_in_rule__Phenomenon__Group__3__Impl3021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Phenomenon__Group_3__0__Impl_in_rule__Phenomenon__Group_3__03060 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Phenomenon__Group_3__1_in_rule__Phenomenon__Group_3__03063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Phenomenon__Group_3__0__Impl3092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Phenomenon__Group_3__1__Impl_in_rule__Phenomenon__Group_3__13125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Phenomenon__DescriptionAssignment_3_1_in_rule__Phenomenon__Group_3__1__Impl3152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group__0__Impl_in_rule__Link__Group__03186 = new BitSet(new long[]{0x0000000001C00000L});
    public static final BitSet FOLLOW_rule__Link__Group__1_in_rule__Link__Group__03189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__FromAssignment_0_in_rule__Link__Group__0__Impl3216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group__1__Impl_in_rule__Link__Group__13246 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Link__Group__2_in_rule__Link__Group__13249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__TypeAssignment_1_in_rule__Link__Group__1__Impl3276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group__2__Impl_in_rule__Link__Group__23306 = new BitSet(new long[]{0x0000000030000022L});
    public static final BitSet FOLLOW_rule__Link__Group__3_in_rule__Link__Group__23309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__ToAssignment_2_in_rule__Link__Group__2__Impl3336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group__3__Impl_in_rule__Link__Group__33366 = new BitSet(new long[]{0x0000000030000022L});
    public static final BitSet FOLLOW_rule__Link__Group__4_in_rule__Link__Group__33369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group_3__0_in_rule__Link__Group__3__Impl3396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group__4__Impl_in_rule__Link__Group__43427 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__Link__Group__5_in_rule__Link__Group__43430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group_4__0_in_rule__Link__Group__4__Impl3457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group__5__Impl_in_rule__Link__Group__53488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group_5__0_in_rule__Link__Group__5__Impl3515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group_3__0__Impl_in_rule__Link__Group_3__03558 = new BitSet(new long[]{0x0000000800380010L});
    public static final BitSet FOLLOW_rule__Link__Group_3__1_in_rule__Link__Group_3__03561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Link__Group_3__0__Impl3589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group_3__1__Impl_in_rule__Link__Group_3__13620 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_rule__Link__Group_3__2_in_rule__Link__Group_3__13623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__PhenomenaAssignment_3_1_in_rule__Link__Group_3__1__Impl3650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group_3__2__Impl_in_rule__Link__Group_3__23680 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Link__Group_3__3_in_rule__Link__Group_3__23683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group_3_2__0_in_rule__Link__Group_3__2__Impl3710 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__Link__Group_3__3__Impl_in_rule__Link__Group_3__33741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Link__Group_3__3__Impl3769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group_3_2__0__Impl_in_rule__Link__Group_3_2__03808 = new BitSet(new long[]{0x0000000800380010L});
    public static final BitSet FOLLOW_rule__Link__Group_3_2__1_in_rule__Link__Group_3_2__03811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Link__Group_3_2__0__Impl3839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group_3_2__1__Impl_in_rule__Link__Group_3_2__13870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__PhenomenaAssignment_3_2_1_in_rule__Link__Group_3_2__1__Impl3897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group_4__0__Impl_in_rule__Link__Group_4__03931 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Link__Group_4__1_in_rule__Link__Group_4__03934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Link__Group_4__0__Impl3963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group_4__1__Impl_in_rule__Link__Group_4__13996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__DescriptionAssignment_4_1_in_rule__Link__Group_4__1__Impl4023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group_5__0__Impl_in_rule__Link__Group_5__04057 = new BitSet(new long[]{0x0000000048000000L});
    public static final BitSet FOLLOW_rule__Link__Group_5__1_in_rule__Link__Group_5__04060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Link__Group_5__0__Impl4088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group_5__1__Impl_in_rule__Link__Group_5__14119 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Link__Group_5__2_in_rule__Link__Group_5__14122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__ConcernsAssignment_5_1_in_rule__Link__Group_5__1__Impl4149 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__Link__Group_5__2__Impl_in_rule__Link__Group_5__24180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Link__Group_5__2__Impl4208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ProblemDiagram__NameAssignment_14250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ProblemDiagram__HighlightAssignment_2_14285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_rule__ProblemDiagram__NodesAssignment_3_04320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_rule__ProblemDiagram__LinksAssignment_3_14351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Concern__NameAssignment_14382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Node__NameAssignment_04413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeType_in_rule__Node__TypeAssignment_14444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Node__DescriptionAssignment_2_14475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhenomenon_in_rule__Node__HiddenPhenomenaAssignment_3_1_04506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhenomenon_in_rule__Node__HiddenPhenomenaAssignment_3_1_1_14537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProblemDiagram_in_rule__Node__SubproblemAssignment_3_2_04568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Node__ProblemNodeRefAssignment_3_2_1_24603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Node__ProblemRefAssignment_3_2_2_24642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Node__HrefAssignment_3_2_3_14677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcern_in_rule__Node__ConcernsAssignment_3_2_44708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhenomenonType_in_rule__Phenomenon__TypeAssignment_04739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Phenomenon__IsControlledAssignment_14775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Phenomenon__NameAssignment_24814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Phenomenon__DescriptionAssignment_3_14845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Link__FromAssignment_04880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkType_in_rule__Link__TypeAssignment_14915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Link__ToAssignment_24950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhenomenon_in_rule__Link__PhenomenaAssignment_3_14985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhenomenon_in_rule__Link__PhenomenaAssignment_3_2_15016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Link__DescriptionAssignment_4_15047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcern_in_rule__Link__ConcernsAssignment_5_15078 = new BitSet(new long[]{0x0000000000000002L});

}