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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_QUALIFIED_NAME", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'R'", "'M'", "'B'", "'X'", "'C'", "'D'", "'P'", "'phenomenon'", "'event'", "'state'", "'--'", "'~~'", "'~>'", "'problem:'", "'for'", "':'", "'{'", "'}'", "','", "'see'", "'domain'", "'problem'", "'!'"
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


    // $ANTLR start entryRuleNode
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:89:1: entryRuleNode : ruleNode EOF ;
    public final void entryRuleNode() throws RecognitionException {
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:90:1: ( ruleNode EOF )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:91:1: ruleNode EOF
            {
             before(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_ruleNode_in_entryRuleNode121);
            ruleNode();
            _fsp--;

             after(grammarAccess.getNodeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNode128); 

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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:98:1: ruleNode : ( ( rule__Node__Group__0 ) ) ;
    public final void ruleNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:102:2: ( ( ( rule__Node__Group__0 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:103:1: ( ( rule__Node__Group__0 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:103:1: ( ( rule__Node__Group__0 ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:104:1: ( rule__Node__Group__0 )
            {
             before(grammarAccess.getNodeAccess().getGroup()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:105:1: ( rule__Node__Group__0 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:105:2: rule__Node__Group__0
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:117:1: entryRulePhenomenon : rulePhenomenon EOF ;
    public final void entryRulePhenomenon() throws RecognitionException {
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:118:1: ( rulePhenomenon EOF )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:119:1: rulePhenomenon EOF
            {
             before(grammarAccess.getPhenomenonRule()); 
            pushFollow(FOLLOW_rulePhenomenon_in_entryRulePhenomenon181);
            rulePhenomenon();
            _fsp--;

             after(grammarAccess.getPhenomenonRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePhenomenon188); 

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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:126:1: rulePhenomenon : ( ( rule__Phenomenon__Group__0 ) ) ;
    public final void rulePhenomenon() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:130:2: ( ( ( rule__Phenomenon__Group__0 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:131:1: ( ( rule__Phenomenon__Group__0 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:131:1: ( ( rule__Phenomenon__Group__0 ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:132:1: ( rule__Phenomenon__Group__0 )
            {
             before(grammarAccess.getPhenomenonAccess().getGroup()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:133:1: ( rule__Phenomenon__Group__0 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:133:2: rule__Phenomenon__Group__0
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:145:1: entryRuleLink : ruleLink EOF ;
    public final void entryRuleLink() throws RecognitionException {
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:146:1: ( ruleLink EOF )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:147:1: ruleLink EOF
            {
             before(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_ruleLink_in_entryRuleLink241);
            ruleLink();
            _fsp--;

             after(grammarAccess.getLinkRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLink248); 

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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:154:1: ruleLink : ( ( rule__Link__Group__0 ) ) ;
    public final void ruleLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:158:2: ( ( ( rule__Link__Group__0 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:159:1: ( ( rule__Link__Group__0 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:159:1: ( ( rule__Link__Group__0 ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:160:1: ( rule__Link__Group__0 )
            {
             before(grammarAccess.getLinkAccess().getGroup()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:161:1: ( rule__Link__Group__0 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:161:2: rule__Link__Group__0
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


    // $ANTLR start ruleNodeType
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:174:1: ruleNodeType : ( ( rule__NodeType__Alternatives ) ) ;
    public final void ruleNodeType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:178:1: ( ( ( rule__NodeType__Alternatives ) ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:179:1: ( ( rule__NodeType__Alternatives ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:179:1: ( ( rule__NodeType__Alternatives ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:180:1: ( rule__NodeType__Alternatives )
            {
             before(grammarAccess.getNodeTypeAccess().getAlternatives()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:181:1: ( rule__NodeType__Alternatives )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:181:2: rule__NodeType__Alternatives
            {
            pushFollow(FOLLOW_rule__NodeType__Alternatives_in_ruleNodeType311);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:193:1: rulePhenomenonType : ( ( rule__PhenomenonType__Alternatives ) ) ;
    public final void rulePhenomenonType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:197:1: ( ( ( rule__PhenomenonType__Alternatives ) ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:198:1: ( ( rule__PhenomenonType__Alternatives ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:198:1: ( ( rule__PhenomenonType__Alternatives ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:199:1: ( rule__PhenomenonType__Alternatives )
            {
             before(grammarAccess.getPhenomenonTypeAccess().getAlternatives()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:200:1: ( rule__PhenomenonType__Alternatives )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:200:2: rule__PhenomenonType__Alternatives
            {
            pushFollow(FOLLOW_rule__PhenomenonType__Alternatives_in_rulePhenomenonType347);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:212:1: ruleLinkType : ( ( rule__LinkType__Alternatives ) ) ;
    public final void ruleLinkType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:216:1: ( ( ( rule__LinkType__Alternatives ) ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:217:1: ( ( rule__LinkType__Alternatives ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:217:1: ( ( rule__LinkType__Alternatives ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:218:1: ( rule__LinkType__Alternatives )
            {
             before(grammarAccess.getLinkTypeAccess().getAlternatives()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:219:1: ( rule__LinkType__Alternatives )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:219:2: rule__LinkType__Alternatives
            {
            pushFollow(FOLLOW_rule__LinkType__Alternatives_in_ruleLinkType383);
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


    // $ANTLR start rule__ProblemDiagram__Alternatives_4
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:230:1: rule__ProblemDiagram__Alternatives_4 : ( ( ( rule__ProblemDiagram__NodesAssignment_4_0 ) ) | ( ( rule__ProblemDiagram__LinksAssignment_4_1 ) ) );
    public final void rule__ProblemDiagram__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:234:1: ( ( ( rule__ProblemDiagram__NodesAssignment_4_0 ) ) | ( ( rule__ProblemDiagram__LinksAssignment_4_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                int LA1_1 = input.LA(2);

                if ( ((LA1_1>=22 && LA1_1<=24)) ) {
                    alt1=2;
                }
                else if ( (LA1_1==EOF||(LA1_1>=RULE_ID && LA1_1<=RULE_STRING)||(LA1_1>=12 && LA1_1<=18)||LA1_1==25||(LA1_1>=27 && LA1_1<=29)||LA1_1==31) ) {
                    alt1=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("230:1: rule__ProblemDiagram__Alternatives_4 : ( ( ( rule__ProblemDiagram__NodesAssignment_4_0 ) ) | ( ( rule__ProblemDiagram__LinksAssignment_4_1 ) ) );", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("230:1: rule__ProblemDiagram__Alternatives_4 : ( ( ( rule__ProblemDiagram__NodesAssignment_4_0 ) ) | ( ( rule__ProblemDiagram__LinksAssignment_4_1 ) ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:235:1: ( ( rule__ProblemDiagram__NodesAssignment_4_0 ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:235:1: ( ( rule__ProblemDiagram__NodesAssignment_4_0 ) )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:236:1: ( rule__ProblemDiagram__NodesAssignment_4_0 )
                    {
                     before(grammarAccess.getProblemDiagramAccess().getNodesAssignment_4_0()); 
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:237:1: ( rule__ProblemDiagram__NodesAssignment_4_0 )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:237:2: rule__ProblemDiagram__NodesAssignment_4_0
                    {
                    pushFollow(FOLLOW_rule__ProblemDiagram__NodesAssignment_4_0_in_rule__ProblemDiagram__Alternatives_4418);
                    rule__ProblemDiagram__NodesAssignment_4_0();
                    _fsp--;


                    }

                     after(grammarAccess.getProblemDiagramAccess().getNodesAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:241:6: ( ( rule__ProblemDiagram__LinksAssignment_4_1 ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:241:6: ( ( rule__ProblemDiagram__LinksAssignment_4_1 ) )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:242:1: ( rule__ProblemDiagram__LinksAssignment_4_1 )
                    {
                     before(grammarAccess.getProblemDiagramAccess().getLinksAssignment_4_1()); 
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:243:1: ( rule__ProblemDiagram__LinksAssignment_4_1 )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:243:2: rule__ProblemDiagram__LinksAssignment_4_1
                    {
                    pushFollow(FOLLOW_rule__ProblemDiagram__LinksAssignment_4_1_in_rule__ProblemDiagram__Alternatives_4436);
                    rule__ProblemDiagram__LinksAssignment_4_1();
                    _fsp--;


                    }

                     after(grammarAccess.getProblemDiagramAccess().getLinksAssignment_4_1()); 

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
    // $ANTLR end rule__ProblemDiagram__Alternatives_4


    // $ANTLR start rule__Node__Alternatives_3_2
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:252:1: rule__Node__Alternatives_3_2 : ( ( ( rule__Node__SubproblemAssignment_3_2_0 ) ) | ( ( rule__Node__Group_3_2_1__0 ) ) | ( ( rule__Node__Group_3_2_2__0 ) ) | ( ( rule__Node__Group_3_2_3__0 ) ) );
    public final void rule__Node__Alternatives_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:256:1: ( ( ( rule__Node__SubproblemAssignment_3_2_0 ) ) | ( ( rule__Node__Group_3_2_1__0 ) ) | ( ( rule__Node__Group_3_2_2__0 ) ) | ( ( rule__Node__Group_3_2_3__0 ) ) )
            int alt2=4;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==25) ) {
                alt2=1;
            }
            else if ( (LA2_0==31) ) {
                switch ( input.LA(2) ) {
                case 32:
                    {
                    alt2=2;
                    }
                    break;
                case 33:
                    {
                    alt2=3;
                    }
                    break;
                case RULE_STRING:
                    {
                    alt2=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("252:1: rule__Node__Alternatives_3_2 : ( ( ( rule__Node__SubproblemAssignment_3_2_0 ) ) | ( ( rule__Node__Group_3_2_1__0 ) ) | ( ( rule__Node__Group_3_2_2__0 ) ) | ( ( rule__Node__Group_3_2_3__0 ) ) );", 2, 2, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("252:1: rule__Node__Alternatives_3_2 : ( ( ( rule__Node__SubproblemAssignment_3_2_0 ) ) | ( ( rule__Node__Group_3_2_1__0 ) ) | ( ( rule__Node__Group_3_2_2__0 ) ) | ( ( rule__Node__Group_3_2_3__0 ) ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:257:1: ( ( rule__Node__SubproblemAssignment_3_2_0 ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:257:1: ( ( rule__Node__SubproblemAssignment_3_2_0 ) )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:258:1: ( rule__Node__SubproblemAssignment_3_2_0 )
                    {
                     before(grammarAccess.getNodeAccess().getSubproblemAssignment_3_2_0()); 
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:259:1: ( rule__Node__SubproblemAssignment_3_2_0 )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:259:2: rule__Node__SubproblemAssignment_3_2_0
                    {
                    pushFollow(FOLLOW_rule__Node__SubproblemAssignment_3_2_0_in_rule__Node__Alternatives_3_2469);
                    rule__Node__SubproblemAssignment_3_2_0();
                    _fsp--;


                    }

                     after(grammarAccess.getNodeAccess().getSubproblemAssignment_3_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:263:6: ( ( rule__Node__Group_3_2_1__0 ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:263:6: ( ( rule__Node__Group_3_2_1__0 ) )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:264:1: ( rule__Node__Group_3_2_1__0 )
                    {
                     before(grammarAccess.getNodeAccess().getGroup_3_2_1()); 
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:265:1: ( rule__Node__Group_3_2_1__0 )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:265:2: rule__Node__Group_3_2_1__0
                    {
                    pushFollow(FOLLOW_rule__Node__Group_3_2_1__0_in_rule__Node__Alternatives_3_2487);
                    rule__Node__Group_3_2_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getNodeAccess().getGroup_3_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:269:6: ( ( rule__Node__Group_3_2_2__0 ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:269:6: ( ( rule__Node__Group_3_2_2__0 ) )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:270:1: ( rule__Node__Group_3_2_2__0 )
                    {
                     before(grammarAccess.getNodeAccess().getGroup_3_2_2()); 
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:271:1: ( rule__Node__Group_3_2_2__0 )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:271:2: rule__Node__Group_3_2_2__0
                    {
                    pushFollow(FOLLOW_rule__Node__Group_3_2_2__0_in_rule__Node__Alternatives_3_2505);
                    rule__Node__Group_3_2_2__0();
                    _fsp--;


                    }

                     after(grammarAccess.getNodeAccess().getGroup_3_2_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:275:6: ( ( rule__Node__Group_3_2_3__0 ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:275:6: ( ( rule__Node__Group_3_2_3__0 ) )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:276:1: ( rule__Node__Group_3_2_3__0 )
                    {
                     before(grammarAccess.getNodeAccess().getGroup_3_2_3()); 
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:277:1: ( rule__Node__Group_3_2_3__0 )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:277:2: rule__Node__Group_3_2_3__0
                    {
                    pushFollow(FOLLOW_rule__Node__Group_3_2_3__0_in_rule__Node__Alternatives_3_2523);
                    rule__Node__Group_3_2_3__0();
                    _fsp--;


                    }

                     after(grammarAccess.getNodeAccess().getGroup_3_2_3()); 

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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:286:1: rule__NodeType__Alternatives : ( ( ( 'R' ) ) | ( ( 'M' ) ) | ( ( 'B' ) ) | ( ( 'X' ) ) | ( ( 'C' ) ) | ( ( 'D' ) ) | ( ( 'P' ) ) );
    public final void rule__NodeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:290:1: ( ( ( 'R' ) ) | ( ( 'M' ) ) | ( ( 'B' ) ) | ( ( 'X' ) ) | ( ( 'C' ) ) | ( ( 'D' ) ) | ( ( 'P' ) ) )
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
                    new NoViableAltException("286:1: rule__NodeType__Alternatives : ( ( ( 'R' ) ) | ( ( 'M' ) ) | ( ( 'B' ) ) | ( ( 'X' ) ) | ( ( 'C' ) ) | ( ( 'D' ) ) | ( ( 'P' ) ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:291:1: ( ( 'R' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:291:1: ( ( 'R' ) )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:292:1: ( 'R' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getREQUIREMENTEnumLiteralDeclaration_0()); 
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:293:1: ( 'R' )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:293:3: 'R'
                    {
                    match(input,12,FOLLOW_12_in_rule__NodeType__Alternatives557); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getREQUIREMENTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:298:6: ( ( 'M' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:298:6: ( ( 'M' ) )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:299:1: ( 'M' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getMACHINEEnumLiteralDeclaration_1()); 
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:300:1: ( 'M' )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:300:3: 'M'
                    {
                    match(input,13,FOLLOW_13_in_rule__NodeType__Alternatives578); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getMACHINEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:305:6: ( ( 'B' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:305:6: ( ( 'B' ) )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:306:1: ( 'B' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getBIDDABLEEnumLiteralDeclaration_2()); 
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:307:1: ( 'B' )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:307:3: 'B'
                    {
                    match(input,14,FOLLOW_14_in_rule__NodeType__Alternatives599); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getBIDDABLEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:312:6: ( ( 'X' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:312:6: ( ( 'X' ) )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:313:1: ( 'X' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getLEXICALEnumLiteralDeclaration_3()); 
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:314:1: ( 'X' )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:314:3: 'X'
                    {
                    match(input,15,FOLLOW_15_in_rule__NodeType__Alternatives620); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getLEXICALEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:319:6: ( ( 'C' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:319:6: ( ( 'C' ) )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:320:1: ( 'C' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getCAUSALEnumLiteralDeclaration_4()); 
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:321:1: ( 'C' )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:321:3: 'C'
                    {
                    match(input,16,FOLLOW_16_in_rule__NodeType__Alternatives641); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getCAUSALEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:326:6: ( ( 'D' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:326:6: ( ( 'D' ) )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:327:1: ( 'D' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getDESIGNEDEnumLiteralDeclaration_5()); 
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:328:1: ( 'D' )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:328:3: 'D'
                    {
                    match(input,17,FOLLOW_17_in_rule__NodeType__Alternatives662); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getDESIGNEDEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:333:6: ( ( 'P' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:333:6: ( ( 'P' ) )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:334:1: ( 'P' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getPHYSICALEnumLiteralDeclaration_6()); 
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:335:1: ( 'P' )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:335:3: 'P'
                    {
                    match(input,18,FOLLOW_18_in_rule__NodeType__Alternatives683); 

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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:345:1: rule__PhenomenonType__Alternatives : ( ( ( 'phenomenon' ) ) | ( ( 'event' ) ) | ( ( 'state' ) ) );
    public final void rule__PhenomenonType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:349:1: ( ( ( 'phenomenon' ) ) | ( ( 'event' ) ) | ( ( 'state' ) ) )
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
                    new NoViableAltException("345:1: rule__PhenomenonType__Alternatives : ( ( ( 'phenomenon' ) ) | ( ( 'event' ) ) | ( ( 'state' ) ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:350:1: ( ( 'phenomenon' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:350:1: ( ( 'phenomenon' ) )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:351:1: ( 'phenomenon' )
                    {
                     before(grammarAccess.getPhenomenonTypeAccess().getUNSPECIFIEDEnumLiteralDeclaration_0()); 
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:352:1: ( 'phenomenon' )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:352:3: 'phenomenon'
                    {
                    match(input,19,FOLLOW_19_in_rule__PhenomenonType__Alternatives719); 

                    }

                     after(grammarAccess.getPhenomenonTypeAccess().getUNSPECIFIEDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:357:6: ( ( 'event' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:357:6: ( ( 'event' ) )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:358:1: ( 'event' )
                    {
                     before(grammarAccess.getPhenomenonTypeAccess().getEVENTEnumLiteralDeclaration_1()); 
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:359:1: ( 'event' )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:359:3: 'event'
                    {
                    match(input,20,FOLLOW_20_in_rule__PhenomenonType__Alternatives740); 

                    }

                     after(grammarAccess.getPhenomenonTypeAccess().getEVENTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:364:6: ( ( 'state' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:364:6: ( ( 'state' ) )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:365:1: ( 'state' )
                    {
                     before(grammarAccess.getPhenomenonTypeAccess().getSTATEEnumLiteralDeclaration_2()); 
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:366:1: ( 'state' )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:366:3: 'state'
                    {
                    match(input,21,FOLLOW_21_in_rule__PhenomenonType__Alternatives761); 

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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:376:1: rule__LinkType__Alternatives : ( ( ( '--' ) ) | ( ( '~~' ) ) | ( ( '~>' ) ) );
    public final void rule__LinkType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:380:1: ( ( ( '--' ) ) | ( ( '~~' ) ) | ( ( '~>' ) ) )
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
                    new NoViableAltException("376:1: rule__LinkType__Alternatives : ( ( ( '--' ) ) | ( ( '~~' ) ) | ( ( '~>' ) ) );", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:381:1: ( ( '--' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:381:1: ( ( '--' ) )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:382:1: ( '--' )
                    {
                     before(grammarAccess.getLinkTypeAccess().getINTERFACEEnumLiteralDeclaration_0()); 
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:383:1: ( '--' )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:383:3: '--'
                    {
                    match(input,22,FOLLOW_22_in_rule__LinkType__Alternatives797); 

                    }

                     after(grammarAccess.getLinkTypeAccess().getINTERFACEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:388:6: ( ( '~~' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:388:6: ( ( '~~' ) )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:389:1: ( '~~' )
                    {
                     before(grammarAccess.getLinkTypeAccess().getREFERENCEEnumLiteralDeclaration_1()); 
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:390:1: ( '~~' )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:390:3: '~~'
                    {
                    match(input,23,FOLLOW_23_in_rule__LinkType__Alternatives818); 

                    }

                     after(grammarAccess.getLinkTypeAccess().getREFERENCEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:395:6: ( ( '~>' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:395:6: ( ( '~>' ) )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:396:1: ( '~>' )
                    {
                     before(grammarAccess.getLinkTypeAccess().getCONSTRAINTEnumLiteralDeclaration_2()); 
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:397:1: ( '~>' )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:397:3: '~>'
                    {
                    match(input,24,FOLLOW_24_in_rule__LinkType__Alternatives839); 

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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:409:1: rule__ProblemDiagram__Group__0 : rule__ProblemDiagram__Group__0__Impl rule__ProblemDiagram__Group__1 ;
    public final void rule__ProblemDiagram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:413:1: ( rule__ProblemDiagram__Group__0__Impl rule__ProblemDiagram__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:414:2: rule__ProblemDiagram__Group__0__Impl rule__ProblemDiagram__Group__1
            {
            pushFollow(FOLLOW_rule__ProblemDiagram__Group__0__Impl_in_rule__ProblemDiagram__Group__0872);
            rule__ProblemDiagram__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ProblemDiagram__Group__1_in_rule__ProblemDiagram__Group__0875);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:421:1: rule__ProblemDiagram__Group__0__Impl : ( () ) ;
    public final void rule__ProblemDiagram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:425:1: ( ( () ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:426:1: ( () )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:426:1: ( () )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:427:1: ()
            {
             before(grammarAccess.getProblemDiagramAccess().getProblemDiagramAction_0()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:428:1: ()
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:430:1: 
            {
            }

             after(grammarAccess.getProblemDiagramAccess().getProblemDiagramAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProblemDiagram__Group__0__Impl


    // $ANTLR start rule__ProblemDiagram__Group__1
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:440:1: rule__ProblemDiagram__Group__1 : rule__ProblemDiagram__Group__1__Impl rule__ProblemDiagram__Group__2 ;
    public final void rule__ProblemDiagram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:444:1: ( rule__ProblemDiagram__Group__1__Impl rule__ProblemDiagram__Group__2 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:445:2: rule__ProblemDiagram__Group__1__Impl rule__ProblemDiagram__Group__2
            {
            pushFollow(FOLLOW_rule__ProblemDiagram__Group__1__Impl_in_rule__ProblemDiagram__Group__1933);
            rule__ProblemDiagram__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ProblemDiagram__Group__2_in_rule__ProblemDiagram__Group__1936);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:452:1: rule__ProblemDiagram__Group__1__Impl : ( 'problem:' ) ;
    public final void rule__ProblemDiagram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:456:1: ( ( 'problem:' ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:457:1: ( 'problem:' )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:457:1: ( 'problem:' )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:458:1: 'problem:'
            {
             before(grammarAccess.getProblemDiagramAccess().getProblemKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__ProblemDiagram__Group__1__Impl964); 
             after(grammarAccess.getProblemDiagramAccess().getProblemKeyword_1()); 

            }


            }

        }
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:471:1: rule__ProblemDiagram__Group__2 : rule__ProblemDiagram__Group__2__Impl rule__ProblemDiagram__Group__3 ;
    public final void rule__ProblemDiagram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:475:1: ( rule__ProblemDiagram__Group__2__Impl rule__ProblemDiagram__Group__3 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:476:2: rule__ProblemDiagram__Group__2__Impl rule__ProblemDiagram__Group__3
            {
            pushFollow(FOLLOW_rule__ProblemDiagram__Group__2__Impl_in_rule__ProblemDiagram__Group__2995);
            rule__ProblemDiagram__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ProblemDiagram__Group__3_in_rule__ProblemDiagram__Group__2998);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:483:1: rule__ProblemDiagram__Group__2__Impl : ( ( rule__ProblemDiagram__NameAssignment_2 ) ) ;
    public final void rule__ProblemDiagram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:487:1: ( ( ( rule__ProblemDiagram__NameAssignment_2 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:488:1: ( ( rule__ProblemDiagram__NameAssignment_2 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:488:1: ( ( rule__ProblemDiagram__NameAssignment_2 ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:489:1: ( rule__ProblemDiagram__NameAssignment_2 )
            {
             before(grammarAccess.getProblemDiagramAccess().getNameAssignment_2()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:490:1: ( rule__ProblemDiagram__NameAssignment_2 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:490:2: rule__ProblemDiagram__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__ProblemDiagram__NameAssignment_2_in_rule__ProblemDiagram__Group__2__Impl1025);
            rule__ProblemDiagram__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getProblemDiagramAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:500:1: rule__ProblemDiagram__Group__3 : rule__ProblemDiagram__Group__3__Impl rule__ProblemDiagram__Group__4 ;
    public final void rule__ProblemDiagram__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:504:1: ( rule__ProblemDiagram__Group__3__Impl rule__ProblemDiagram__Group__4 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:505:2: rule__ProblemDiagram__Group__3__Impl rule__ProblemDiagram__Group__4
            {
            pushFollow(FOLLOW_rule__ProblemDiagram__Group__3__Impl_in_rule__ProblemDiagram__Group__31055);
            rule__ProblemDiagram__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ProblemDiagram__Group__4_in_rule__ProblemDiagram__Group__31058);
            rule__ProblemDiagram__Group__4();
            _fsp--;


            }

        }
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:512:1: rule__ProblemDiagram__Group__3__Impl : ( ( rule__ProblemDiagram__Group_3__0 )? ) ;
    public final void rule__ProblemDiagram__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:516:1: ( ( ( rule__ProblemDiagram__Group_3__0 )? ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:517:1: ( ( rule__ProblemDiagram__Group_3__0 )? )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:517:1: ( ( rule__ProblemDiagram__Group_3__0 )? )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:518:1: ( rule__ProblemDiagram__Group_3__0 )?
            {
             before(grammarAccess.getProblemDiagramAccess().getGroup_3()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:519:1: ( rule__ProblemDiagram__Group_3__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==26) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:519:2: rule__ProblemDiagram__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__ProblemDiagram__Group_3__0_in_rule__ProblemDiagram__Group__3__Impl1085);
                    rule__ProblemDiagram__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProblemDiagramAccess().getGroup_3()); 

            }


            }

        }
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


    // $ANTLR start rule__ProblemDiagram__Group__4
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:529:1: rule__ProblemDiagram__Group__4 : rule__ProblemDiagram__Group__4__Impl ;
    public final void rule__ProblemDiagram__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:533:1: ( rule__ProblemDiagram__Group__4__Impl )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:534:2: rule__ProblemDiagram__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ProblemDiagram__Group__4__Impl_in_rule__ProblemDiagram__Group__41116);
            rule__ProblemDiagram__Group__4__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProblemDiagram__Group__4


    // $ANTLR start rule__ProblemDiagram__Group__4__Impl
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:540:1: rule__ProblemDiagram__Group__4__Impl : ( ( rule__ProblemDiagram__Alternatives_4 )* ) ;
    public final void rule__ProblemDiagram__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:544:1: ( ( ( rule__ProblemDiagram__Alternatives_4 )* ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:545:1: ( ( rule__ProblemDiagram__Alternatives_4 )* )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:545:1: ( ( rule__ProblemDiagram__Alternatives_4 )* )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:546:1: ( rule__ProblemDiagram__Alternatives_4 )*
            {
             before(grammarAccess.getProblemDiagramAccess().getAlternatives_4()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:547:1: ( rule__ProblemDiagram__Alternatives_4 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:547:2: rule__ProblemDiagram__Alternatives_4
            	    {
            	    pushFollow(FOLLOW_rule__ProblemDiagram__Alternatives_4_in_rule__ProblemDiagram__Group__4__Impl1143);
            	    rule__ProblemDiagram__Alternatives_4();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getProblemDiagramAccess().getAlternatives_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProblemDiagram__Group__4__Impl


    // $ANTLR start rule__ProblemDiagram__Group_3__0
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:567:1: rule__ProblemDiagram__Group_3__0 : rule__ProblemDiagram__Group_3__0__Impl rule__ProblemDiagram__Group_3__1 ;
    public final void rule__ProblemDiagram__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:571:1: ( rule__ProblemDiagram__Group_3__0__Impl rule__ProblemDiagram__Group_3__1 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:572:2: rule__ProblemDiagram__Group_3__0__Impl rule__ProblemDiagram__Group_3__1
            {
            pushFollow(FOLLOW_rule__ProblemDiagram__Group_3__0__Impl_in_rule__ProblemDiagram__Group_3__01184);
            rule__ProblemDiagram__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ProblemDiagram__Group_3__1_in_rule__ProblemDiagram__Group_3__01187);
            rule__ProblemDiagram__Group_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProblemDiagram__Group_3__0


    // $ANTLR start rule__ProblemDiagram__Group_3__0__Impl
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:579:1: rule__ProblemDiagram__Group_3__0__Impl : ( 'for' ) ;
    public final void rule__ProblemDiagram__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:583:1: ( ( 'for' ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:584:1: ( 'for' )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:584:1: ( 'for' )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:585:1: 'for'
            {
             before(grammarAccess.getProblemDiagramAccess().getForKeyword_3_0()); 
            match(input,26,FOLLOW_26_in_rule__ProblemDiagram__Group_3__0__Impl1215); 
             after(grammarAccess.getProblemDiagramAccess().getForKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProblemDiagram__Group_3__0__Impl


    // $ANTLR start rule__ProblemDiagram__Group_3__1
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:598:1: rule__ProblemDiagram__Group_3__1 : rule__ProblemDiagram__Group_3__1__Impl ;
    public final void rule__ProblemDiagram__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:602:1: ( rule__ProblemDiagram__Group_3__1__Impl )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:603:2: rule__ProblemDiagram__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ProblemDiagram__Group_3__1__Impl_in_rule__ProblemDiagram__Group_3__11246);
            rule__ProblemDiagram__Group_3__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProblemDiagram__Group_3__1


    // $ANTLR start rule__ProblemDiagram__Group_3__1__Impl
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:609:1: rule__ProblemDiagram__Group_3__1__Impl : ( ( rule__ProblemDiagram__HighlightAssignment_3_1 ) ) ;
    public final void rule__ProblemDiagram__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:613:1: ( ( ( rule__ProblemDiagram__HighlightAssignment_3_1 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:614:1: ( ( rule__ProblemDiagram__HighlightAssignment_3_1 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:614:1: ( ( rule__ProblemDiagram__HighlightAssignment_3_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:615:1: ( rule__ProblemDiagram__HighlightAssignment_3_1 )
            {
             before(grammarAccess.getProblemDiagramAccess().getHighlightAssignment_3_1()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:616:1: ( rule__ProblemDiagram__HighlightAssignment_3_1 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:616:2: rule__ProblemDiagram__HighlightAssignment_3_1
            {
            pushFollow(FOLLOW_rule__ProblemDiagram__HighlightAssignment_3_1_in_rule__ProblemDiagram__Group_3__1__Impl1273);
            rule__ProblemDiagram__HighlightAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getProblemDiagramAccess().getHighlightAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProblemDiagram__Group_3__1__Impl


    // $ANTLR start rule__Node__Group__0
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:630:1: rule__Node__Group__0 : rule__Node__Group__0__Impl rule__Node__Group__1 ;
    public final void rule__Node__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:634:1: ( rule__Node__Group__0__Impl rule__Node__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:635:2: rule__Node__Group__0__Impl rule__Node__Group__1
            {
            pushFollow(FOLLOW_rule__Node__Group__0__Impl_in_rule__Node__Group__01307);
            rule__Node__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Node__Group__1_in_rule__Node__Group__01310);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:642:1: rule__Node__Group__0__Impl : ( ( rule__Node__NameAssignment_0 ) ) ;
    public final void rule__Node__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:646:1: ( ( ( rule__Node__NameAssignment_0 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:647:1: ( ( rule__Node__NameAssignment_0 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:647:1: ( ( rule__Node__NameAssignment_0 ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:648:1: ( rule__Node__NameAssignment_0 )
            {
             before(grammarAccess.getNodeAccess().getNameAssignment_0()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:649:1: ( rule__Node__NameAssignment_0 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:649:2: rule__Node__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Node__NameAssignment_0_in_rule__Node__Group__0__Impl1337);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:659:1: rule__Node__Group__1 : rule__Node__Group__1__Impl rule__Node__Group__2 ;
    public final void rule__Node__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:663:1: ( rule__Node__Group__1__Impl rule__Node__Group__2 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:664:2: rule__Node__Group__1__Impl rule__Node__Group__2
            {
            pushFollow(FOLLOW_rule__Node__Group__1__Impl_in_rule__Node__Group__11367);
            rule__Node__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Node__Group__2_in_rule__Node__Group__11370);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:671:1: rule__Node__Group__1__Impl : ( ( rule__Node__TypeAssignment_1 )? ) ;
    public final void rule__Node__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:675:1: ( ( ( rule__Node__TypeAssignment_1 )? ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:676:1: ( ( rule__Node__TypeAssignment_1 )? )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:676:1: ( ( rule__Node__TypeAssignment_1 )? )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:677:1: ( rule__Node__TypeAssignment_1 )?
            {
             before(grammarAccess.getNodeAccess().getTypeAssignment_1()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:678:1: ( rule__Node__TypeAssignment_1 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=12 && LA8_0<=18)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:678:2: rule__Node__TypeAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Node__TypeAssignment_1_in_rule__Node__Group__1__Impl1397);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:688:1: rule__Node__Group__2 : rule__Node__Group__2__Impl rule__Node__Group__3 ;
    public final void rule__Node__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:692:1: ( rule__Node__Group__2__Impl rule__Node__Group__3 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:693:2: rule__Node__Group__2__Impl rule__Node__Group__3
            {
            pushFollow(FOLLOW_rule__Node__Group__2__Impl_in_rule__Node__Group__21428);
            rule__Node__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Node__Group__3_in_rule__Node__Group__21431);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:700:1: rule__Node__Group__2__Impl : ( ( rule__Node__Group_2__0 )? ) ;
    public final void rule__Node__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:704:1: ( ( ( rule__Node__Group_2__0 )? ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:705:1: ( ( rule__Node__Group_2__0 )? )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:705:1: ( ( rule__Node__Group_2__0 )? )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:706:1: ( rule__Node__Group_2__0 )?
            {
             before(grammarAccess.getNodeAccess().getGroup_2()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:707:1: ( rule__Node__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING||LA9_0==27) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:707:2: rule__Node__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Node__Group_2__0_in_rule__Node__Group__2__Impl1458);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:717:1: rule__Node__Group__3 : rule__Node__Group__3__Impl ;
    public final void rule__Node__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:721:1: ( rule__Node__Group__3__Impl )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:722:2: rule__Node__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Node__Group__3__Impl_in_rule__Node__Group__31489);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:728:1: rule__Node__Group__3__Impl : ( ( rule__Node__Group_3__0 )? ) ;
    public final void rule__Node__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:732:1: ( ( ( rule__Node__Group_3__0 )? ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:733:1: ( ( rule__Node__Group_3__0 )? )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:733:1: ( ( rule__Node__Group_3__0 )? )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:734:1: ( rule__Node__Group_3__0 )?
            {
             before(grammarAccess.getNodeAccess().getGroup_3()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:735:1: ( rule__Node__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:735:2: rule__Node__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Node__Group_3__0_in_rule__Node__Group__3__Impl1516);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:753:1: rule__Node__Group_2__0 : rule__Node__Group_2__0__Impl rule__Node__Group_2__1 ;
    public final void rule__Node__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:757:1: ( rule__Node__Group_2__0__Impl rule__Node__Group_2__1 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:758:2: rule__Node__Group_2__0__Impl rule__Node__Group_2__1
            {
            pushFollow(FOLLOW_rule__Node__Group_2__0__Impl_in_rule__Node__Group_2__01555);
            rule__Node__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Node__Group_2__1_in_rule__Node__Group_2__01558);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:765:1: rule__Node__Group_2__0__Impl : ( ( ':' )? ) ;
    public final void rule__Node__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:769:1: ( ( ( ':' )? ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:770:1: ( ( ':' )? )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:770:1: ( ( ':' )? )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:771:1: ( ':' )?
            {
             before(grammarAccess.getNodeAccess().getColonKeyword_2_0()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:772:1: ( ':' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==27) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:773:2: ':'
                    {
                    match(input,27,FOLLOW_27_in_rule__Node__Group_2__0__Impl1587); 

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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:784:1: rule__Node__Group_2__1 : rule__Node__Group_2__1__Impl ;
    public final void rule__Node__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:788:1: ( rule__Node__Group_2__1__Impl )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:789:2: rule__Node__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Node__Group_2__1__Impl_in_rule__Node__Group_2__11620);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:795:1: rule__Node__Group_2__1__Impl : ( ( rule__Node__DescriptionAssignment_2_1 ) ) ;
    public final void rule__Node__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:799:1: ( ( ( rule__Node__DescriptionAssignment_2_1 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:800:1: ( ( rule__Node__DescriptionAssignment_2_1 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:800:1: ( ( rule__Node__DescriptionAssignment_2_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:801:1: ( rule__Node__DescriptionAssignment_2_1 )
            {
             before(grammarAccess.getNodeAccess().getDescriptionAssignment_2_1()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:802:1: ( rule__Node__DescriptionAssignment_2_1 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:802:2: rule__Node__DescriptionAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Node__DescriptionAssignment_2_1_in_rule__Node__Group_2__1__Impl1647);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:816:1: rule__Node__Group_3__0 : rule__Node__Group_3__0__Impl rule__Node__Group_3__1 ;
    public final void rule__Node__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:820:1: ( rule__Node__Group_3__0__Impl rule__Node__Group_3__1 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:821:2: rule__Node__Group_3__0__Impl rule__Node__Group_3__1
            {
            pushFollow(FOLLOW_rule__Node__Group_3__0__Impl_in_rule__Node__Group_3__01681);
            rule__Node__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Node__Group_3__1_in_rule__Node__Group_3__01684);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:828:1: rule__Node__Group_3__0__Impl : ( '{' ) ;
    public final void rule__Node__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:832:1: ( ( '{' ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:833:1: ( '{' )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:833:1: ( '{' )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:834:1: '{'
            {
             before(grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,28,FOLLOW_28_in_rule__Node__Group_3__0__Impl1712); 
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:847:1: rule__Node__Group_3__1 : rule__Node__Group_3__1__Impl rule__Node__Group_3__2 ;
    public final void rule__Node__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:851:1: ( rule__Node__Group_3__1__Impl rule__Node__Group_3__2 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:852:2: rule__Node__Group_3__1__Impl rule__Node__Group_3__2
            {
            pushFollow(FOLLOW_rule__Node__Group_3__1__Impl_in_rule__Node__Group_3__11743);
            rule__Node__Group_3__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Node__Group_3__2_in_rule__Node__Group_3__11746);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:859:1: rule__Node__Group_3__1__Impl : ( ( rule__Node__Group_3_1__0 )? ) ;
    public final void rule__Node__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:863:1: ( ( ( rule__Node__Group_3_1__0 )? ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:864:1: ( ( rule__Node__Group_3_1__0 )? )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:864:1: ( ( rule__Node__Group_3_1__0 )? )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:865:1: ( rule__Node__Group_3_1__0 )?
            {
             before(grammarAccess.getNodeAccess().getGroup_3_1()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:866:1: ( rule__Node__Group_3_1__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID||(LA12_0>=19 && LA12_0<=21)||LA12_0==34) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:866:2: rule__Node__Group_3_1__0
                    {
                    pushFollow(FOLLOW_rule__Node__Group_3_1__0_in_rule__Node__Group_3__1__Impl1773);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:876:1: rule__Node__Group_3__2 : rule__Node__Group_3__2__Impl rule__Node__Group_3__3 ;
    public final void rule__Node__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:880:1: ( rule__Node__Group_3__2__Impl rule__Node__Group_3__3 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:881:2: rule__Node__Group_3__2__Impl rule__Node__Group_3__3
            {
            pushFollow(FOLLOW_rule__Node__Group_3__2__Impl_in_rule__Node__Group_3__21804);
            rule__Node__Group_3__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Node__Group_3__3_in_rule__Node__Group_3__21807);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:888:1: rule__Node__Group_3__2__Impl : ( ( rule__Node__Alternatives_3_2 )* ) ;
    public final void rule__Node__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:892:1: ( ( ( rule__Node__Alternatives_3_2 )* ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:893:1: ( ( rule__Node__Alternatives_3_2 )* )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:893:1: ( ( rule__Node__Alternatives_3_2 )* )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:894:1: ( rule__Node__Alternatives_3_2 )*
            {
             before(grammarAccess.getNodeAccess().getAlternatives_3_2()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:895:1: ( rule__Node__Alternatives_3_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==25||LA13_0==31) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:895:2: rule__Node__Alternatives_3_2
            	    {
            	    pushFollow(FOLLOW_rule__Node__Alternatives_3_2_in_rule__Node__Group_3__2__Impl1834);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:905:1: rule__Node__Group_3__3 : rule__Node__Group_3__3__Impl ;
    public final void rule__Node__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:909:1: ( rule__Node__Group_3__3__Impl )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:910:2: rule__Node__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__Node__Group_3__3__Impl_in_rule__Node__Group_3__31865);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:916:1: rule__Node__Group_3__3__Impl : ( '}' ) ;
    public final void rule__Node__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:920:1: ( ( '}' ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:921:1: ( '}' )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:921:1: ( '}' )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:922:1: '}'
            {
             before(grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_3_3()); 
            match(input,29,FOLLOW_29_in_rule__Node__Group_3__3__Impl1893); 
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:943:1: rule__Node__Group_3_1__0 : rule__Node__Group_3_1__0__Impl rule__Node__Group_3_1__1 ;
    public final void rule__Node__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:947:1: ( rule__Node__Group_3_1__0__Impl rule__Node__Group_3_1__1 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:948:2: rule__Node__Group_3_1__0__Impl rule__Node__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__Node__Group_3_1__0__Impl_in_rule__Node__Group_3_1__01932);
            rule__Node__Group_3_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Node__Group_3_1__1_in_rule__Node__Group_3_1__01935);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:955:1: rule__Node__Group_3_1__0__Impl : ( ( rule__Node__HiddenPhenomenaAssignment_3_1_0 ) ) ;
    public final void rule__Node__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:959:1: ( ( ( rule__Node__HiddenPhenomenaAssignment_3_1_0 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:960:1: ( ( rule__Node__HiddenPhenomenaAssignment_3_1_0 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:960:1: ( ( rule__Node__HiddenPhenomenaAssignment_3_1_0 ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:961:1: ( rule__Node__HiddenPhenomenaAssignment_3_1_0 )
            {
             before(grammarAccess.getNodeAccess().getHiddenPhenomenaAssignment_3_1_0()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:962:1: ( rule__Node__HiddenPhenomenaAssignment_3_1_0 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:962:2: rule__Node__HiddenPhenomenaAssignment_3_1_0
            {
            pushFollow(FOLLOW_rule__Node__HiddenPhenomenaAssignment_3_1_0_in_rule__Node__Group_3_1__0__Impl1962);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:972:1: rule__Node__Group_3_1__1 : rule__Node__Group_3_1__1__Impl ;
    public final void rule__Node__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:976:1: ( rule__Node__Group_3_1__1__Impl )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:977:2: rule__Node__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Node__Group_3_1__1__Impl_in_rule__Node__Group_3_1__11992);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:983:1: rule__Node__Group_3_1__1__Impl : ( ( rule__Node__Group_3_1_1__0 )* ) ;
    public final void rule__Node__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:987:1: ( ( ( rule__Node__Group_3_1_1__0 )* ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:988:1: ( ( rule__Node__Group_3_1_1__0 )* )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:988:1: ( ( rule__Node__Group_3_1_1__0 )* )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:989:1: ( rule__Node__Group_3_1_1__0 )*
            {
             before(grammarAccess.getNodeAccess().getGroup_3_1_1()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:990:1: ( rule__Node__Group_3_1_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==30) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:990:2: rule__Node__Group_3_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Node__Group_3_1_1__0_in_rule__Node__Group_3_1__1__Impl2019);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1004:1: rule__Node__Group_3_1_1__0 : rule__Node__Group_3_1_1__0__Impl rule__Node__Group_3_1_1__1 ;
    public final void rule__Node__Group_3_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1008:1: ( rule__Node__Group_3_1_1__0__Impl rule__Node__Group_3_1_1__1 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1009:2: rule__Node__Group_3_1_1__0__Impl rule__Node__Group_3_1_1__1
            {
            pushFollow(FOLLOW_rule__Node__Group_3_1_1__0__Impl_in_rule__Node__Group_3_1_1__02054);
            rule__Node__Group_3_1_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Node__Group_3_1_1__1_in_rule__Node__Group_3_1_1__02057);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1016:1: rule__Node__Group_3_1_1__0__Impl : ( ',' ) ;
    public final void rule__Node__Group_3_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1020:1: ( ( ',' ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1021:1: ( ',' )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1021:1: ( ',' )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1022:1: ','
            {
             before(grammarAccess.getNodeAccess().getCommaKeyword_3_1_1_0()); 
            match(input,30,FOLLOW_30_in_rule__Node__Group_3_1_1__0__Impl2085); 
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1035:1: rule__Node__Group_3_1_1__1 : rule__Node__Group_3_1_1__1__Impl ;
    public final void rule__Node__Group_3_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1039:1: ( rule__Node__Group_3_1_1__1__Impl )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1040:2: rule__Node__Group_3_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Node__Group_3_1_1__1__Impl_in_rule__Node__Group_3_1_1__12116);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1046:1: rule__Node__Group_3_1_1__1__Impl : ( ( rule__Node__HiddenPhenomenaAssignment_3_1_1_1 ) ) ;
    public final void rule__Node__Group_3_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1050:1: ( ( ( rule__Node__HiddenPhenomenaAssignment_3_1_1_1 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1051:1: ( ( rule__Node__HiddenPhenomenaAssignment_3_1_1_1 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1051:1: ( ( rule__Node__HiddenPhenomenaAssignment_3_1_1_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1052:1: ( rule__Node__HiddenPhenomenaAssignment_3_1_1_1 )
            {
             before(grammarAccess.getNodeAccess().getHiddenPhenomenaAssignment_3_1_1_1()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1053:1: ( rule__Node__HiddenPhenomenaAssignment_3_1_1_1 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1053:2: rule__Node__HiddenPhenomenaAssignment_3_1_1_1
            {
            pushFollow(FOLLOW_rule__Node__HiddenPhenomenaAssignment_3_1_1_1_in_rule__Node__Group_3_1_1__1__Impl2143);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1067:1: rule__Node__Group_3_2_1__0 : rule__Node__Group_3_2_1__0__Impl rule__Node__Group_3_2_1__1 ;
    public final void rule__Node__Group_3_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1071:1: ( rule__Node__Group_3_2_1__0__Impl rule__Node__Group_3_2_1__1 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1072:2: rule__Node__Group_3_2_1__0__Impl rule__Node__Group_3_2_1__1
            {
            pushFollow(FOLLOW_rule__Node__Group_3_2_1__0__Impl_in_rule__Node__Group_3_2_1__02177);
            rule__Node__Group_3_2_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Node__Group_3_2_1__1_in_rule__Node__Group_3_2_1__02180);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1079:1: rule__Node__Group_3_2_1__0__Impl : ( 'see' ) ;
    public final void rule__Node__Group_3_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1083:1: ( ( 'see' ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1084:1: ( 'see' )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1084:1: ( 'see' )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1085:1: 'see'
            {
             before(grammarAccess.getNodeAccess().getSeeKeyword_3_2_1_0()); 
            match(input,31,FOLLOW_31_in_rule__Node__Group_3_2_1__0__Impl2208); 
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1098:1: rule__Node__Group_3_2_1__1 : rule__Node__Group_3_2_1__1__Impl rule__Node__Group_3_2_1__2 ;
    public final void rule__Node__Group_3_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1102:1: ( rule__Node__Group_3_2_1__1__Impl rule__Node__Group_3_2_1__2 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1103:2: rule__Node__Group_3_2_1__1__Impl rule__Node__Group_3_2_1__2
            {
            pushFollow(FOLLOW_rule__Node__Group_3_2_1__1__Impl_in_rule__Node__Group_3_2_1__12239);
            rule__Node__Group_3_2_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Node__Group_3_2_1__2_in_rule__Node__Group_3_2_1__12242);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1110:1: rule__Node__Group_3_2_1__1__Impl : ( 'domain' ) ;
    public final void rule__Node__Group_3_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1114:1: ( ( 'domain' ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1115:1: ( 'domain' )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1115:1: ( 'domain' )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1116:1: 'domain'
            {
             before(grammarAccess.getNodeAccess().getDomainKeyword_3_2_1_1()); 
            match(input,32,FOLLOW_32_in_rule__Node__Group_3_2_1__1__Impl2270); 
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1129:1: rule__Node__Group_3_2_1__2 : rule__Node__Group_3_2_1__2__Impl ;
    public final void rule__Node__Group_3_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1133:1: ( rule__Node__Group_3_2_1__2__Impl )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1134:2: rule__Node__Group_3_2_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Node__Group_3_2_1__2__Impl_in_rule__Node__Group_3_2_1__22301);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1140:1: rule__Node__Group_3_2_1__2__Impl : ( ( rule__Node__ProblemNodeRefAssignment_3_2_1_2 ) ) ;
    public final void rule__Node__Group_3_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1144:1: ( ( ( rule__Node__ProblemNodeRefAssignment_3_2_1_2 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1145:1: ( ( rule__Node__ProblemNodeRefAssignment_3_2_1_2 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1145:1: ( ( rule__Node__ProblemNodeRefAssignment_3_2_1_2 ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1146:1: ( rule__Node__ProblemNodeRefAssignment_3_2_1_2 )
            {
             before(grammarAccess.getNodeAccess().getProblemNodeRefAssignment_3_2_1_2()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1147:1: ( rule__Node__ProblemNodeRefAssignment_3_2_1_2 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1147:2: rule__Node__ProblemNodeRefAssignment_3_2_1_2
            {
            pushFollow(FOLLOW_rule__Node__ProblemNodeRefAssignment_3_2_1_2_in_rule__Node__Group_3_2_1__2__Impl2328);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1163:1: rule__Node__Group_3_2_2__0 : rule__Node__Group_3_2_2__0__Impl rule__Node__Group_3_2_2__1 ;
    public final void rule__Node__Group_3_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1167:1: ( rule__Node__Group_3_2_2__0__Impl rule__Node__Group_3_2_2__1 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1168:2: rule__Node__Group_3_2_2__0__Impl rule__Node__Group_3_2_2__1
            {
            pushFollow(FOLLOW_rule__Node__Group_3_2_2__0__Impl_in_rule__Node__Group_3_2_2__02364);
            rule__Node__Group_3_2_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Node__Group_3_2_2__1_in_rule__Node__Group_3_2_2__02367);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1175:1: rule__Node__Group_3_2_2__0__Impl : ( 'see' ) ;
    public final void rule__Node__Group_3_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1179:1: ( ( 'see' ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1180:1: ( 'see' )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1180:1: ( 'see' )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1181:1: 'see'
            {
             before(grammarAccess.getNodeAccess().getSeeKeyword_3_2_2_0()); 
            match(input,31,FOLLOW_31_in_rule__Node__Group_3_2_2__0__Impl2395); 
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1194:1: rule__Node__Group_3_2_2__1 : rule__Node__Group_3_2_2__1__Impl rule__Node__Group_3_2_2__2 ;
    public final void rule__Node__Group_3_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1198:1: ( rule__Node__Group_3_2_2__1__Impl rule__Node__Group_3_2_2__2 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1199:2: rule__Node__Group_3_2_2__1__Impl rule__Node__Group_3_2_2__2
            {
            pushFollow(FOLLOW_rule__Node__Group_3_2_2__1__Impl_in_rule__Node__Group_3_2_2__12426);
            rule__Node__Group_3_2_2__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Node__Group_3_2_2__2_in_rule__Node__Group_3_2_2__12429);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1206:1: rule__Node__Group_3_2_2__1__Impl : ( 'problem' ) ;
    public final void rule__Node__Group_3_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1210:1: ( ( 'problem' ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1211:1: ( 'problem' )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1211:1: ( 'problem' )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1212:1: 'problem'
            {
             before(grammarAccess.getNodeAccess().getProblemKeyword_3_2_2_1()); 
            match(input,33,FOLLOW_33_in_rule__Node__Group_3_2_2__1__Impl2457); 
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1225:1: rule__Node__Group_3_2_2__2 : rule__Node__Group_3_2_2__2__Impl ;
    public final void rule__Node__Group_3_2_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1229:1: ( rule__Node__Group_3_2_2__2__Impl )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1230:2: rule__Node__Group_3_2_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Node__Group_3_2_2__2__Impl_in_rule__Node__Group_3_2_2__22488);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1236:1: rule__Node__Group_3_2_2__2__Impl : ( ( rule__Node__ProblemRefAssignment_3_2_2_2 ) ) ;
    public final void rule__Node__Group_3_2_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1240:1: ( ( ( rule__Node__ProblemRefAssignment_3_2_2_2 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1241:1: ( ( rule__Node__ProblemRefAssignment_3_2_2_2 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1241:1: ( ( rule__Node__ProblemRefAssignment_3_2_2_2 ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1242:1: ( rule__Node__ProblemRefAssignment_3_2_2_2 )
            {
             before(grammarAccess.getNodeAccess().getProblemRefAssignment_3_2_2_2()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1243:1: ( rule__Node__ProblemRefAssignment_3_2_2_2 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1243:2: rule__Node__ProblemRefAssignment_3_2_2_2
            {
            pushFollow(FOLLOW_rule__Node__ProblemRefAssignment_3_2_2_2_in_rule__Node__Group_3_2_2__2__Impl2515);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1259:1: rule__Node__Group_3_2_3__0 : rule__Node__Group_3_2_3__0__Impl rule__Node__Group_3_2_3__1 ;
    public final void rule__Node__Group_3_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1263:1: ( rule__Node__Group_3_2_3__0__Impl rule__Node__Group_3_2_3__1 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1264:2: rule__Node__Group_3_2_3__0__Impl rule__Node__Group_3_2_3__1
            {
            pushFollow(FOLLOW_rule__Node__Group_3_2_3__0__Impl_in_rule__Node__Group_3_2_3__02551);
            rule__Node__Group_3_2_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Node__Group_3_2_3__1_in_rule__Node__Group_3_2_3__02554);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1271:1: rule__Node__Group_3_2_3__0__Impl : ( 'see' ) ;
    public final void rule__Node__Group_3_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1275:1: ( ( 'see' ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1276:1: ( 'see' )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1276:1: ( 'see' )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1277:1: 'see'
            {
             before(grammarAccess.getNodeAccess().getSeeKeyword_3_2_3_0()); 
            match(input,31,FOLLOW_31_in_rule__Node__Group_3_2_3__0__Impl2582); 
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1290:1: rule__Node__Group_3_2_3__1 : rule__Node__Group_3_2_3__1__Impl ;
    public final void rule__Node__Group_3_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1294:1: ( rule__Node__Group_3_2_3__1__Impl )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1295:2: rule__Node__Group_3_2_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Node__Group_3_2_3__1__Impl_in_rule__Node__Group_3_2_3__12613);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1301:1: rule__Node__Group_3_2_3__1__Impl : ( ( rule__Node__HrefAssignment_3_2_3_1 ) ) ;
    public final void rule__Node__Group_3_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1305:1: ( ( ( rule__Node__HrefAssignment_3_2_3_1 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1306:1: ( ( rule__Node__HrefAssignment_3_2_3_1 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1306:1: ( ( rule__Node__HrefAssignment_3_2_3_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1307:1: ( rule__Node__HrefAssignment_3_2_3_1 )
            {
             before(grammarAccess.getNodeAccess().getHrefAssignment_3_2_3_1()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1308:1: ( rule__Node__HrefAssignment_3_2_3_1 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1308:2: rule__Node__HrefAssignment_3_2_3_1
            {
            pushFollow(FOLLOW_rule__Node__HrefAssignment_3_2_3_1_in_rule__Node__Group_3_2_3__1__Impl2640);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1322:1: rule__Phenomenon__Group__0 : rule__Phenomenon__Group__0__Impl rule__Phenomenon__Group__1 ;
    public final void rule__Phenomenon__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1326:1: ( rule__Phenomenon__Group__0__Impl rule__Phenomenon__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1327:2: rule__Phenomenon__Group__0__Impl rule__Phenomenon__Group__1
            {
            pushFollow(FOLLOW_rule__Phenomenon__Group__0__Impl_in_rule__Phenomenon__Group__02674);
            rule__Phenomenon__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Phenomenon__Group__1_in_rule__Phenomenon__Group__02677);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1334:1: rule__Phenomenon__Group__0__Impl : ( ( rule__Phenomenon__TypeAssignment_0 )? ) ;
    public final void rule__Phenomenon__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1338:1: ( ( ( rule__Phenomenon__TypeAssignment_0 )? ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1339:1: ( ( rule__Phenomenon__TypeAssignment_0 )? )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1339:1: ( ( rule__Phenomenon__TypeAssignment_0 )? )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1340:1: ( rule__Phenomenon__TypeAssignment_0 )?
            {
             before(grammarAccess.getPhenomenonAccess().getTypeAssignment_0()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1341:1: ( rule__Phenomenon__TypeAssignment_0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=19 && LA15_0<=21)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1341:2: rule__Phenomenon__TypeAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Phenomenon__TypeAssignment_0_in_rule__Phenomenon__Group__0__Impl2704);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1351:1: rule__Phenomenon__Group__1 : rule__Phenomenon__Group__1__Impl rule__Phenomenon__Group__2 ;
    public final void rule__Phenomenon__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1355:1: ( rule__Phenomenon__Group__1__Impl rule__Phenomenon__Group__2 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1356:2: rule__Phenomenon__Group__1__Impl rule__Phenomenon__Group__2
            {
            pushFollow(FOLLOW_rule__Phenomenon__Group__1__Impl_in_rule__Phenomenon__Group__12735);
            rule__Phenomenon__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Phenomenon__Group__2_in_rule__Phenomenon__Group__12738);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1363:1: rule__Phenomenon__Group__1__Impl : ( ( rule__Phenomenon__IsControlledAssignment_1 )? ) ;
    public final void rule__Phenomenon__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1367:1: ( ( ( rule__Phenomenon__IsControlledAssignment_1 )? ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1368:1: ( ( rule__Phenomenon__IsControlledAssignment_1 )? )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1368:1: ( ( rule__Phenomenon__IsControlledAssignment_1 )? )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1369:1: ( rule__Phenomenon__IsControlledAssignment_1 )?
            {
             before(grammarAccess.getPhenomenonAccess().getIsControlledAssignment_1()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1370:1: ( rule__Phenomenon__IsControlledAssignment_1 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==34) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1370:2: rule__Phenomenon__IsControlledAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Phenomenon__IsControlledAssignment_1_in_rule__Phenomenon__Group__1__Impl2765);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1380:1: rule__Phenomenon__Group__2 : rule__Phenomenon__Group__2__Impl rule__Phenomenon__Group__3 ;
    public final void rule__Phenomenon__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1384:1: ( rule__Phenomenon__Group__2__Impl rule__Phenomenon__Group__3 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1385:2: rule__Phenomenon__Group__2__Impl rule__Phenomenon__Group__3
            {
            pushFollow(FOLLOW_rule__Phenomenon__Group__2__Impl_in_rule__Phenomenon__Group__22796);
            rule__Phenomenon__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Phenomenon__Group__3_in_rule__Phenomenon__Group__22799);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1392:1: rule__Phenomenon__Group__2__Impl : ( ( rule__Phenomenon__NameAssignment_2 ) ) ;
    public final void rule__Phenomenon__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1396:1: ( ( ( rule__Phenomenon__NameAssignment_2 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1397:1: ( ( rule__Phenomenon__NameAssignment_2 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1397:1: ( ( rule__Phenomenon__NameAssignment_2 ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1398:1: ( rule__Phenomenon__NameAssignment_2 )
            {
             before(grammarAccess.getPhenomenonAccess().getNameAssignment_2()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1399:1: ( rule__Phenomenon__NameAssignment_2 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1399:2: rule__Phenomenon__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Phenomenon__NameAssignment_2_in_rule__Phenomenon__Group__2__Impl2826);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1409:1: rule__Phenomenon__Group__3 : rule__Phenomenon__Group__3__Impl ;
    public final void rule__Phenomenon__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1413:1: ( rule__Phenomenon__Group__3__Impl )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1414:2: rule__Phenomenon__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Phenomenon__Group__3__Impl_in_rule__Phenomenon__Group__32856);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1420:1: rule__Phenomenon__Group__3__Impl : ( ( rule__Phenomenon__Group_3__0 )? ) ;
    public final void rule__Phenomenon__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1424:1: ( ( ( rule__Phenomenon__Group_3__0 )? ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1425:1: ( ( rule__Phenomenon__Group_3__0 )? )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1425:1: ( ( rule__Phenomenon__Group_3__0 )? )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1426:1: ( rule__Phenomenon__Group_3__0 )?
            {
             before(grammarAccess.getPhenomenonAccess().getGroup_3()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1427:1: ( rule__Phenomenon__Group_3__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING||LA17_0==27) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1427:2: rule__Phenomenon__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Phenomenon__Group_3__0_in_rule__Phenomenon__Group__3__Impl2883);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1445:1: rule__Phenomenon__Group_3__0 : rule__Phenomenon__Group_3__0__Impl rule__Phenomenon__Group_3__1 ;
    public final void rule__Phenomenon__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1449:1: ( rule__Phenomenon__Group_3__0__Impl rule__Phenomenon__Group_3__1 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1450:2: rule__Phenomenon__Group_3__0__Impl rule__Phenomenon__Group_3__1
            {
            pushFollow(FOLLOW_rule__Phenomenon__Group_3__0__Impl_in_rule__Phenomenon__Group_3__02922);
            rule__Phenomenon__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Phenomenon__Group_3__1_in_rule__Phenomenon__Group_3__02925);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1457:1: rule__Phenomenon__Group_3__0__Impl : ( ( ':' )? ) ;
    public final void rule__Phenomenon__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1461:1: ( ( ( ':' )? ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1462:1: ( ( ':' )? )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1462:1: ( ( ':' )? )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1463:1: ( ':' )?
            {
             before(grammarAccess.getPhenomenonAccess().getColonKeyword_3_0()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1464:1: ( ':' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==27) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1465:2: ':'
                    {
                    match(input,27,FOLLOW_27_in_rule__Phenomenon__Group_3__0__Impl2954); 

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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1476:1: rule__Phenomenon__Group_3__1 : rule__Phenomenon__Group_3__1__Impl ;
    public final void rule__Phenomenon__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1480:1: ( rule__Phenomenon__Group_3__1__Impl )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1481:2: rule__Phenomenon__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Phenomenon__Group_3__1__Impl_in_rule__Phenomenon__Group_3__12987);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1487:1: rule__Phenomenon__Group_3__1__Impl : ( ( rule__Phenomenon__DescriptionAssignment_3_1 ) ) ;
    public final void rule__Phenomenon__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1491:1: ( ( ( rule__Phenomenon__DescriptionAssignment_3_1 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1492:1: ( ( rule__Phenomenon__DescriptionAssignment_3_1 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1492:1: ( ( rule__Phenomenon__DescriptionAssignment_3_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1493:1: ( rule__Phenomenon__DescriptionAssignment_3_1 )
            {
             before(grammarAccess.getPhenomenonAccess().getDescriptionAssignment_3_1()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1494:1: ( rule__Phenomenon__DescriptionAssignment_3_1 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1494:2: rule__Phenomenon__DescriptionAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Phenomenon__DescriptionAssignment_3_1_in_rule__Phenomenon__Group_3__1__Impl3014);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1508:1: rule__Link__Group__0 : rule__Link__Group__0__Impl rule__Link__Group__1 ;
    public final void rule__Link__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1512:1: ( rule__Link__Group__0__Impl rule__Link__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1513:2: rule__Link__Group__0__Impl rule__Link__Group__1
            {
            pushFollow(FOLLOW_rule__Link__Group__0__Impl_in_rule__Link__Group__03048);
            rule__Link__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Link__Group__1_in_rule__Link__Group__03051);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1520:1: rule__Link__Group__0__Impl : ( ( rule__Link__FromAssignment_0 ) ) ;
    public final void rule__Link__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1524:1: ( ( ( rule__Link__FromAssignment_0 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1525:1: ( ( rule__Link__FromAssignment_0 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1525:1: ( ( rule__Link__FromAssignment_0 ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1526:1: ( rule__Link__FromAssignment_0 )
            {
             before(grammarAccess.getLinkAccess().getFromAssignment_0()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1527:1: ( rule__Link__FromAssignment_0 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1527:2: rule__Link__FromAssignment_0
            {
            pushFollow(FOLLOW_rule__Link__FromAssignment_0_in_rule__Link__Group__0__Impl3078);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1537:1: rule__Link__Group__1 : rule__Link__Group__1__Impl rule__Link__Group__2 ;
    public final void rule__Link__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1541:1: ( rule__Link__Group__1__Impl rule__Link__Group__2 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1542:2: rule__Link__Group__1__Impl rule__Link__Group__2
            {
            pushFollow(FOLLOW_rule__Link__Group__1__Impl_in_rule__Link__Group__13108);
            rule__Link__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Link__Group__2_in_rule__Link__Group__13111);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1549:1: rule__Link__Group__1__Impl : ( ( rule__Link__TypeAssignment_1 ) ) ;
    public final void rule__Link__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1553:1: ( ( ( rule__Link__TypeAssignment_1 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1554:1: ( ( rule__Link__TypeAssignment_1 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1554:1: ( ( rule__Link__TypeAssignment_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1555:1: ( rule__Link__TypeAssignment_1 )
            {
             before(grammarAccess.getLinkAccess().getTypeAssignment_1()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1556:1: ( rule__Link__TypeAssignment_1 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1556:2: rule__Link__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Link__TypeAssignment_1_in_rule__Link__Group__1__Impl3138);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1566:1: rule__Link__Group__2 : rule__Link__Group__2__Impl rule__Link__Group__3 ;
    public final void rule__Link__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1570:1: ( rule__Link__Group__2__Impl rule__Link__Group__3 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1571:2: rule__Link__Group__2__Impl rule__Link__Group__3
            {
            pushFollow(FOLLOW_rule__Link__Group__2__Impl_in_rule__Link__Group__23168);
            rule__Link__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Link__Group__3_in_rule__Link__Group__23171);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1578:1: rule__Link__Group__2__Impl : ( ( rule__Link__ToAssignment_2 ) ) ;
    public final void rule__Link__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1582:1: ( ( ( rule__Link__ToAssignment_2 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1583:1: ( ( rule__Link__ToAssignment_2 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1583:1: ( ( rule__Link__ToAssignment_2 ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1584:1: ( rule__Link__ToAssignment_2 )
            {
             before(grammarAccess.getLinkAccess().getToAssignment_2()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1585:1: ( rule__Link__ToAssignment_2 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1585:2: rule__Link__ToAssignment_2
            {
            pushFollow(FOLLOW_rule__Link__ToAssignment_2_in_rule__Link__Group__2__Impl3198);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1595:1: rule__Link__Group__3 : rule__Link__Group__3__Impl rule__Link__Group__4 ;
    public final void rule__Link__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1599:1: ( rule__Link__Group__3__Impl rule__Link__Group__4 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1600:2: rule__Link__Group__3__Impl rule__Link__Group__4
            {
            pushFollow(FOLLOW_rule__Link__Group__3__Impl_in_rule__Link__Group__33228);
            rule__Link__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Link__Group__4_in_rule__Link__Group__33231);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1607:1: rule__Link__Group__3__Impl : ( ( rule__Link__Group_3__0 )? ) ;
    public final void rule__Link__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1611:1: ( ( ( rule__Link__Group_3__0 )? ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1612:1: ( ( rule__Link__Group_3__0 )? )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1612:1: ( ( rule__Link__Group_3__0 )? )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1613:1: ( rule__Link__Group_3__0 )?
            {
             before(grammarAccess.getLinkAccess().getGroup_3()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1614:1: ( rule__Link__Group_3__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==28) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1614:2: rule__Link__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Link__Group_3__0_in_rule__Link__Group__3__Impl3258);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1624:1: rule__Link__Group__4 : rule__Link__Group__4__Impl ;
    public final void rule__Link__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1628:1: ( rule__Link__Group__4__Impl )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1629:2: rule__Link__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Link__Group__4__Impl_in_rule__Link__Group__43289);
            rule__Link__Group__4__Impl();
            _fsp--;


            }

        }
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1635:1: rule__Link__Group__4__Impl : ( ( rule__Link__Group_4__0 )? ) ;
    public final void rule__Link__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1639:1: ( ( ( rule__Link__Group_4__0 )? ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1640:1: ( ( rule__Link__Group_4__0 )? )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1640:1: ( ( rule__Link__Group_4__0 )? )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1641:1: ( rule__Link__Group_4__0 )?
            {
             before(grammarAccess.getLinkAccess().getGroup_4()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1642:1: ( rule__Link__Group_4__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_STRING||LA20_0==27) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1642:2: rule__Link__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Link__Group_4__0_in_rule__Link__Group__4__Impl3316);
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


    // $ANTLR start rule__Link__Group_3__0
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1662:1: rule__Link__Group_3__0 : rule__Link__Group_3__0__Impl rule__Link__Group_3__1 ;
    public final void rule__Link__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1666:1: ( rule__Link__Group_3__0__Impl rule__Link__Group_3__1 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1667:2: rule__Link__Group_3__0__Impl rule__Link__Group_3__1
            {
            pushFollow(FOLLOW_rule__Link__Group_3__0__Impl_in_rule__Link__Group_3__03357);
            rule__Link__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Link__Group_3__1_in_rule__Link__Group_3__03360);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1674:1: rule__Link__Group_3__0__Impl : ( '{' ) ;
    public final void rule__Link__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1678:1: ( ( '{' ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1679:1: ( '{' )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1679:1: ( '{' )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1680:1: '{'
            {
             before(grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,28,FOLLOW_28_in_rule__Link__Group_3__0__Impl3388); 
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1693:1: rule__Link__Group_3__1 : rule__Link__Group_3__1__Impl rule__Link__Group_3__2 ;
    public final void rule__Link__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1697:1: ( rule__Link__Group_3__1__Impl rule__Link__Group_3__2 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1698:2: rule__Link__Group_3__1__Impl rule__Link__Group_3__2
            {
            pushFollow(FOLLOW_rule__Link__Group_3__1__Impl_in_rule__Link__Group_3__13419);
            rule__Link__Group_3__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Link__Group_3__2_in_rule__Link__Group_3__13422);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1705:1: rule__Link__Group_3__1__Impl : ( ( rule__Link__PhenomenaAssignment_3_1 ) ) ;
    public final void rule__Link__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1709:1: ( ( ( rule__Link__PhenomenaAssignment_3_1 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1710:1: ( ( rule__Link__PhenomenaAssignment_3_1 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1710:1: ( ( rule__Link__PhenomenaAssignment_3_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1711:1: ( rule__Link__PhenomenaAssignment_3_1 )
            {
             before(grammarAccess.getLinkAccess().getPhenomenaAssignment_3_1()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1712:1: ( rule__Link__PhenomenaAssignment_3_1 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1712:2: rule__Link__PhenomenaAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Link__PhenomenaAssignment_3_1_in_rule__Link__Group_3__1__Impl3449);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1722:1: rule__Link__Group_3__2 : rule__Link__Group_3__2__Impl rule__Link__Group_3__3 ;
    public final void rule__Link__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1726:1: ( rule__Link__Group_3__2__Impl rule__Link__Group_3__3 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1727:2: rule__Link__Group_3__2__Impl rule__Link__Group_3__3
            {
            pushFollow(FOLLOW_rule__Link__Group_3__2__Impl_in_rule__Link__Group_3__23479);
            rule__Link__Group_3__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Link__Group_3__3_in_rule__Link__Group_3__23482);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1734:1: rule__Link__Group_3__2__Impl : ( ( rule__Link__Group_3_2__0 )* ) ;
    public final void rule__Link__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1738:1: ( ( ( rule__Link__Group_3_2__0 )* ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1739:1: ( ( rule__Link__Group_3_2__0 )* )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1739:1: ( ( rule__Link__Group_3_2__0 )* )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1740:1: ( rule__Link__Group_3_2__0 )*
            {
             before(grammarAccess.getLinkAccess().getGroup_3_2()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1741:1: ( rule__Link__Group_3_2__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==30) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1741:2: rule__Link__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Link__Group_3_2__0_in_rule__Link__Group_3__2__Impl3509);
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


            }

        }
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1751:1: rule__Link__Group_3__3 : rule__Link__Group_3__3__Impl ;
    public final void rule__Link__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1755:1: ( rule__Link__Group_3__3__Impl )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1756:2: rule__Link__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__Link__Group_3__3__Impl_in_rule__Link__Group_3__33540);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1762:1: rule__Link__Group_3__3__Impl : ( '}' ) ;
    public final void rule__Link__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1766:1: ( ( '}' ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1767:1: ( '}' )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1767:1: ( '}' )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1768:1: '}'
            {
             before(grammarAccess.getLinkAccess().getRightCurlyBracketKeyword_3_3()); 
            match(input,29,FOLLOW_29_in_rule__Link__Group_3__3__Impl3568); 
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1789:1: rule__Link__Group_3_2__0 : rule__Link__Group_3_2__0__Impl rule__Link__Group_3_2__1 ;
    public final void rule__Link__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1793:1: ( rule__Link__Group_3_2__0__Impl rule__Link__Group_3_2__1 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1794:2: rule__Link__Group_3_2__0__Impl rule__Link__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__Link__Group_3_2__0__Impl_in_rule__Link__Group_3_2__03607);
            rule__Link__Group_3_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Link__Group_3_2__1_in_rule__Link__Group_3_2__03610);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1801:1: rule__Link__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__Link__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1805:1: ( ( ',' ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1806:1: ( ',' )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1806:1: ( ',' )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1807:1: ','
            {
             before(grammarAccess.getLinkAccess().getCommaKeyword_3_2_0()); 
            match(input,30,FOLLOW_30_in_rule__Link__Group_3_2__0__Impl3638); 
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1820:1: rule__Link__Group_3_2__1 : rule__Link__Group_3_2__1__Impl ;
    public final void rule__Link__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1824:1: ( rule__Link__Group_3_2__1__Impl )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1825:2: rule__Link__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Link__Group_3_2__1__Impl_in_rule__Link__Group_3_2__13669);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1831:1: rule__Link__Group_3_2__1__Impl : ( ( rule__Link__PhenomenaAssignment_3_2_1 ) ) ;
    public final void rule__Link__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1835:1: ( ( ( rule__Link__PhenomenaAssignment_3_2_1 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1836:1: ( ( rule__Link__PhenomenaAssignment_3_2_1 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1836:1: ( ( rule__Link__PhenomenaAssignment_3_2_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1837:1: ( rule__Link__PhenomenaAssignment_3_2_1 )
            {
             before(grammarAccess.getLinkAccess().getPhenomenaAssignment_3_2_1()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1838:1: ( rule__Link__PhenomenaAssignment_3_2_1 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1838:2: rule__Link__PhenomenaAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__Link__PhenomenaAssignment_3_2_1_in_rule__Link__Group_3_2__1__Impl3696);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1852:1: rule__Link__Group_4__0 : rule__Link__Group_4__0__Impl rule__Link__Group_4__1 ;
    public final void rule__Link__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1856:1: ( rule__Link__Group_4__0__Impl rule__Link__Group_4__1 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1857:2: rule__Link__Group_4__0__Impl rule__Link__Group_4__1
            {
            pushFollow(FOLLOW_rule__Link__Group_4__0__Impl_in_rule__Link__Group_4__03730);
            rule__Link__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Link__Group_4__1_in_rule__Link__Group_4__03733);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1864:1: rule__Link__Group_4__0__Impl : ( ( ':' )? ) ;
    public final void rule__Link__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1868:1: ( ( ( ':' )? ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1869:1: ( ( ':' )? )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1869:1: ( ( ':' )? )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1870:1: ( ':' )?
            {
             before(grammarAccess.getLinkAccess().getColonKeyword_4_0()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1871:1: ( ':' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==27) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1872:2: ':'
                    {
                    match(input,27,FOLLOW_27_in_rule__Link__Group_4__0__Impl3762); 

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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1883:1: rule__Link__Group_4__1 : rule__Link__Group_4__1__Impl ;
    public final void rule__Link__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1887:1: ( rule__Link__Group_4__1__Impl )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1888:2: rule__Link__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Link__Group_4__1__Impl_in_rule__Link__Group_4__13795);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1894:1: rule__Link__Group_4__1__Impl : ( ( rule__Link__DescriptionAssignment_4_1 ) ) ;
    public final void rule__Link__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1898:1: ( ( ( rule__Link__DescriptionAssignment_4_1 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1899:1: ( ( rule__Link__DescriptionAssignment_4_1 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1899:1: ( ( rule__Link__DescriptionAssignment_4_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1900:1: ( rule__Link__DescriptionAssignment_4_1 )
            {
             before(grammarAccess.getLinkAccess().getDescriptionAssignment_4_1()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1901:1: ( rule__Link__DescriptionAssignment_4_1 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1901:2: rule__Link__DescriptionAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Link__DescriptionAssignment_4_1_in_rule__Link__Group_4__1__Impl3822);
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


    // $ANTLR start rule__ProblemDiagram__NameAssignment_2
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1916:1: rule__ProblemDiagram__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ProblemDiagram__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1920:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1921:1: ( RULE_ID )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1921:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1922:1: RULE_ID
            {
             before(grammarAccess.getProblemDiagramAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ProblemDiagram__NameAssignment_23861); 
             after(grammarAccess.getProblemDiagramAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProblemDiagram__NameAssignment_2


    // $ANTLR start rule__ProblemDiagram__HighlightAssignment_3_1
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1931:1: rule__ProblemDiagram__HighlightAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__ProblemDiagram__HighlightAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1935:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1936:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1936:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1937:1: ( RULE_ID )
            {
             before(grammarAccess.getProblemDiagramAccess().getHighlightNodeCrossReference_3_1_0()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1938:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1939:1: RULE_ID
            {
             before(grammarAccess.getProblemDiagramAccess().getHighlightNodeIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ProblemDiagram__HighlightAssignment_3_13896); 
             after(grammarAccess.getProblemDiagramAccess().getHighlightNodeIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getProblemDiagramAccess().getHighlightNodeCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProblemDiagram__HighlightAssignment_3_1


    // $ANTLR start rule__ProblemDiagram__NodesAssignment_4_0
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1950:1: rule__ProblemDiagram__NodesAssignment_4_0 : ( ruleNode ) ;
    public final void rule__ProblemDiagram__NodesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1954:1: ( ( ruleNode ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1955:1: ( ruleNode )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1955:1: ( ruleNode )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1956:1: ruleNode
            {
             before(grammarAccess.getProblemDiagramAccess().getNodesNodeParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_ruleNode_in_rule__ProblemDiagram__NodesAssignment_4_03931);
            ruleNode();
            _fsp--;

             after(grammarAccess.getProblemDiagramAccess().getNodesNodeParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProblemDiagram__NodesAssignment_4_0


    // $ANTLR start rule__ProblemDiagram__LinksAssignment_4_1
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1965:1: rule__ProblemDiagram__LinksAssignment_4_1 : ( ruleLink ) ;
    public final void rule__ProblemDiagram__LinksAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1969:1: ( ( ruleLink ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1970:1: ( ruleLink )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1970:1: ( ruleLink )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1971:1: ruleLink
            {
             before(grammarAccess.getProblemDiagramAccess().getLinksLinkParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleLink_in_rule__ProblemDiagram__LinksAssignment_4_13962);
            ruleLink();
            _fsp--;

             after(grammarAccess.getProblemDiagramAccess().getLinksLinkParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProblemDiagram__LinksAssignment_4_1


    // $ANTLR start rule__Node__NameAssignment_0
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1980:1: rule__Node__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Node__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1984:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1985:1: ( RULE_ID )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1985:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1986:1: RULE_ID
            {
             before(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Node__NameAssignment_03993); 
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1995:1: rule__Node__TypeAssignment_1 : ( ruleNodeType ) ;
    public final void rule__Node__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1999:1: ( ( ruleNodeType ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2000:1: ( ruleNodeType )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2000:1: ( ruleNodeType )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2001:1: ruleNodeType
            {
             before(grammarAccess.getNodeAccess().getTypeNodeTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleNodeType_in_rule__Node__TypeAssignment_14024);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2010:1: rule__Node__DescriptionAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Node__DescriptionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2014:1: ( ( RULE_STRING ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2015:1: ( RULE_STRING )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2015:1: ( RULE_STRING )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2016:1: RULE_STRING
            {
             before(grammarAccess.getNodeAccess().getDescriptionSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Node__DescriptionAssignment_2_14055); 
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2025:1: rule__Node__HiddenPhenomenaAssignment_3_1_0 : ( rulePhenomenon ) ;
    public final void rule__Node__HiddenPhenomenaAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2029:1: ( ( rulePhenomenon ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2030:1: ( rulePhenomenon )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2030:1: ( rulePhenomenon )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2031:1: rulePhenomenon
            {
             before(grammarAccess.getNodeAccess().getHiddenPhenomenaPhenomenonParserRuleCall_3_1_0_0()); 
            pushFollow(FOLLOW_rulePhenomenon_in_rule__Node__HiddenPhenomenaAssignment_3_1_04086);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2040:1: rule__Node__HiddenPhenomenaAssignment_3_1_1_1 : ( rulePhenomenon ) ;
    public final void rule__Node__HiddenPhenomenaAssignment_3_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2044:1: ( ( rulePhenomenon ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2045:1: ( rulePhenomenon )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2045:1: ( rulePhenomenon )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2046:1: rulePhenomenon
            {
             before(grammarAccess.getNodeAccess().getHiddenPhenomenaPhenomenonParserRuleCall_3_1_1_1_0()); 
            pushFollow(FOLLOW_rulePhenomenon_in_rule__Node__HiddenPhenomenaAssignment_3_1_1_14117);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2055:1: rule__Node__SubproblemAssignment_3_2_0 : ( ruleProblemDiagram ) ;
    public final void rule__Node__SubproblemAssignment_3_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2059:1: ( ( ruleProblemDiagram ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2060:1: ( ruleProblemDiagram )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2060:1: ( ruleProblemDiagram )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2061:1: ruleProblemDiagram
            {
             before(grammarAccess.getNodeAccess().getSubproblemProblemDiagramParserRuleCall_3_2_0_0()); 
            pushFollow(FOLLOW_ruleProblemDiagram_in_rule__Node__SubproblemAssignment_3_2_04148);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2070:1: rule__Node__ProblemNodeRefAssignment_3_2_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__Node__ProblemNodeRefAssignment_3_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2074:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2075:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2075:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2076:1: ( RULE_ID )
            {
             before(grammarAccess.getNodeAccess().getProblemNodeRefNodeCrossReference_3_2_1_2_0()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2077:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2078:1: RULE_ID
            {
             before(grammarAccess.getNodeAccess().getProblemNodeRefNodeIDTerminalRuleCall_3_2_1_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Node__ProblemNodeRefAssignment_3_2_1_24183); 
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2089:1: rule__Node__ProblemRefAssignment_3_2_2_2 : ( ( RULE_ID ) ) ;
    public final void rule__Node__ProblemRefAssignment_3_2_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2093:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2094:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2094:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2095:1: ( RULE_ID )
            {
             before(grammarAccess.getNodeAccess().getProblemRefProblemDiagramCrossReference_3_2_2_2_0()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2096:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2097:1: RULE_ID
            {
             before(grammarAccess.getNodeAccess().getProblemRefProblemDiagramIDTerminalRuleCall_3_2_2_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Node__ProblemRefAssignment_3_2_2_24222); 
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2108:1: rule__Node__HrefAssignment_3_2_3_1 : ( RULE_STRING ) ;
    public final void rule__Node__HrefAssignment_3_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2112:1: ( ( RULE_STRING ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2113:1: ( RULE_STRING )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2113:1: ( RULE_STRING )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2114:1: RULE_STRING
            {
             before(grammarAccess.getNodeAccess().getHrefSTRINGTerminalRuleCall_3_2_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Node__HrefAssignment_3_2_3_14257); 
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


    // $ANTLR start rule__Phenomenon__TypeAssignment_0
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2123:1: rule__Phenomenon__TypeAssignment_0 : ( rulePhenomenonType ) ;
    public final void rule__Phenomenon__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2127:1: ( ( rulePhenomenonType ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2128:1: ( rulePhenomenonType )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2128:1: ( rulePhenomenonType )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2129:1: rulePhenomenonType
            {
             before(grammarAccess.getPhenomenonAccess().getTypePhenomenonTypeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_rulePhenomenonType_in_rule__Phenomenon__TypeAssignment_04288);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2138:1: rule__Phenomenon__IsControlledAssignment_1 : ( ( '!' ) ) ;
    public final void rule__Phenomenon__IsControlledAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2142:1: ( ( ( '!' ) ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2143:1: ( ( '!' ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2143:1: ( ( '!' ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2144:1: ( '!' )
            {
             before(grammarAccess.getPhenomenonAccess().getIsControlledExclamationMarkKeyword_1_0()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2145:1: ( '!' )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2146:1: '!'
            {
             before(grammarAccess.getPhenomenonAccess().getIsControlledExclamationMarkKeyword_1_0()); 
            match(input,34,FOLLOW_34_in_rule__Phenomenon__IsControlledAssignment_14324); 
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2161:1: rule__Phenomenon__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Phenomenon__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2165:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2166:1: ( RULE_ID )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2166:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2167:1: RULE_ID
            {
             before(grammarAccess.getPhenomenonAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Phenomenon__NameAssignment_24363); 
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2176:1: rule__Phenomenon__DescriptionAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Phenomenon__DescriptionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2180:1: ( ( RULE_STRING ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2181:1: ( RULE_STRING )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2181:1: ( RULE_STRING )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2182:1: RULE_STRING
            {
             before(grammarAccess.getPhenomenonAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Phenomenon__DescriptionAssignment_3_14394); 
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2191:1: rule__Link__FromAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Link__FromAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2195:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2196:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2196:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2197:1: ( RULE_ID )
            {
             before(grammarAccess.getLinkAccess().getFromNodeCrossReference_0_0()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2198:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2199:1: RULE_ID
            {
             before(grammarAccess.getLinkAccess().getFromNodeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Link__FromAssignment_04429); 
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2210:1: rule__Link__TypeAssignment_1 : ( ruleLinkType ) ;
    public final void rule__Link__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2214:1: ( ( ruleLinkType ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2215:1: ( ruleLinkType )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2215:1: ( ruleLinkType )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2216:1: ruleLinkType
            {
             before(grammarAccess.getLinkAccess().getTypeLinkTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleLinkType_in_rule__Link__TypeAssignment_14464);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2225:1: rule__Link__ToAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Link__ToAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2229:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2230:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2230:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2231:1: ( RULE_ID )
            {
             before(grammarAccess.getLinkAccess().getToNodeCrossReference_2_0()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2232:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2233:1: RULE_ID
            {
             before(grammarAccess.getLinkAccess().getToNodeIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Link__ToAssignment_24499); 
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2244:1: rule__Link__PhenomenaAssignment_3_1 : ( rulePhenomenon ) ;
    public final void rule__Link__PhenomenaAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2248:1: ( ( rulePhenomenon ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2249:1: ( rulePhenomenon )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2249:1: ( rulePhenomenon )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2250:1: rulePhenomenon
            {
             before(grammarAccess.getLinkAccess().getPhenomenaPhenomenonParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_rulePhenomenon_in_rule__Link__PhenomenaAssignment_3_14534);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2259:1: rule__Link__PhenomenaAssignment_3_2_1 : ( rulePhenomenon ) ;
    public final void rule__Link__PhenomenaAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2263:1: ( ( rulePhenomenon ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2264:1: ( rulePhenomenon )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2264:1: ( rulePhenomenon )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2265:1: rulePhenomenon
            {
             before(grammarAccess.getLinkAccess().getPhenomenaPhenomenonParserRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_rulePhenomenon_in_rule__Link__PhenomenaAssignment_3_2_14565);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2274:1: rule__Link__DescriptionAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Link__DescriptionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2278:1: ( ( RULE_STRING ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2279:1: ( RULE_STRING )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2279:1: ( RULE_STRING )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2280:1: RULE_STRING
            {
             before(grammarAccess.getLinkAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Link__DescriptionAssignment_4_14596); 
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


 

    public static final BitSet FOLLOW_ruleProblemDiagram_in_entryRuleProblemDiagram61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProblemDiagram68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__Group__0_in_ruleProblemDiagram94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_entryRuleNode121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNode128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__0_in_ruleNode154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhenomenon_in_entryRulePhenomenon181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePhenomenon188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Phenomenon__Group__0_in_rulePhenomenon214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_entryRuleLink241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLink248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group__0_in_ruleLink274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeType__Alternatives_in_ruleNodeType311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PhenomenonType__Alternatives_in_rulePhenomenonType347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinkType__Alternatives_in_ruleLinkType383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__NodesAssignment_4_0_in_rule__ProblemDiagram__Alternatives_4418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__LinksAssignment_4_1_in_rule__ProblemDiagram__Alternatives_4436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__SubproblemAssignment_3_2_0_in_rule__Node__Alternatives_3_2469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3_2_1__0_in_rule__Node__Alternatives_3_2487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3_2_2__0_in_rule__Node__Alternatives_3_2505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3_2_3__0_in_rule__Node__Alternatives_3_2523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__NodeType__Alternatives557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__NodeType__Alternatives578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__NodeType__Alternatives599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__NodeType__Alternatives620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__NodeType__Alternatives641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__NodeType__Alternatives662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__NodeType__Alternatives683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__PhenomenonType__Alternatives719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__PhenomenonType__Alternatives740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__PhenomenonType__Alternatives761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__LinkType__Alternatives797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__LinkType__Alternatives818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__LinkType__Alternatives839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__Group__0__Impl_in_rule__ProblemDiagram__Group__0872 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__Group__1_in_rule__ProblemDiagram__Group__0875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__Group__1__Impl_in_rule__ProblemDiagram__Group__1933 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__Group__2_in_rule__ProblemDiagram__Group__1936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ProblemDiagram__Group__1__Impl964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__Group__2__Impl_in_rule__ProblemDiagram__Group__2995 = new BitSet(new long[]{0x0000000004000012L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__Group__3_in_rule__ProblemDiagram__Group__2998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__NameAssignment_2_in_rule__ProblemDiagram__Group__2__Impl1025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__Group__3__Impl_in_rule__ProblemDiagram__Group__31055 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__Group__4_in_rule__ProblemDiagram__Group__31058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__Group_3__0_in_rule__ProblemDiagram__Group__3__Impl1085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__Group__4__Impl_in_rule__ProblemDiagram__Group__41116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__Alternatives_4_in_rule__ProblemDiagram__Group__4__Impl1143 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__Group_3__0__Impl_in_rule__ProblemDiagram__Group_3__01184 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__Group_3__1_in_rule__ProblemDiagram__Group_3__01187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ProblemDiagram__Group_3__0__Impl1215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__Group_3__1__Impl_in_rule__ProblemDiagram__Group_3__11246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__HighlightAssignment_3_1_in_rule__ProblemDiagram__Group_3__1__Impl1273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__0__Impl_in_rule__Node__Group__01307 = new BitSet(new long[]{0x000000001807F022L});
    public static final BitSet FOLLOW_rule__Node__Group__1_in_rule__Node__Group__01310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__NameAssignment_0_in_rule__Node__Group__0__Impl1337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__1__Impl_in_rule__Node__Group__11367 = new BitSet(new long[]{0x0000000018000022L});
    public static final BitSet FOLLOW_rule__Node__Group__2_in_rule__Node__Group__11370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__TypeAssignment_1_in_rule__Node__Group__1__Impl1397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__2__Impl_in_rule__Node__Group__21428 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__Node__Group__3_in_rule__Node__Group__21431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_2__0_in_rule__Node__Group__2__Impl1458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__3__Impl_in_rule__Node__Group__31489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3__0_in_rule__Node__Group__3__Impl1516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_2__0__Impl_in_rule__Node__Group_2__01555 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Node__Group_2__1_in_rule__Node__Group_2__01558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Node__Group_2__0__Impl1587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_2__1__Impl_in_rule__Node__Group_2__11620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__DescriptionAssignment_2_1_in_rule__Node__Group_2__1__Impl1647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3__0__Impl_in_rule__Node__Group_3__01681 = new BitSet(new long[]{0x00000004A2380010L});
    public static final BitSet FOLLOW_rule__Node__Group_3__1_in_rule__Node__Group_3__01684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Node__Group_3__0__Impl1712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3__1__Impl_in_rule__Node__Group_3__11743 = new BitSet(new long[]{0x00000000A2000000L});
    public static final BitSet FOLLOW_rule__Node__Group_3__2_in_rule__Node__Group_3__11746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3_1__0_in_rule__Node__Group_3__1__Impl1773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3__2__Impl_in_rule__Node__Group_3__21804 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Node__Group_3__3_in_rule__Node__Group_3__21807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Alternatives_3_2_in_rule__Node__Group_3__2__Impl1834 = new BitSet(new long[]{0x0000000082000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3__3__Impl_in_rule__Node__Group_3__31865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Node__Group_3__3__Impl1893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3_1__0__Impl_in_rule__Node__Group_3_1__01932 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3_1__1_in_rule__Node__Group_3_1__01935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__HiddenPhenomenaAssignment_3_1_0_in_rule__Node__Group_3_1__0__Impl1962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3_1__1__Impl_in_rule__Node__Group_3_1__11992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3_1_1__0_in_rule__Node__Group_3_1__1__Impl2019 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3_1_1__0__Impl_in_rule__Node__Group_3_1_1__02054 = new BitSet(new long[]{0x0000000400380010L});
    public static final BitSet FOLLOW_rule__Node__Group_3_1_1__1_in_rule__Node__Group_3_1_1__02057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Node__Group_3_1_1__0__Impl2085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3_1_1__1__Impl_in_rule__Node__Group_3_1_1__12116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__HiddenPhenomenaAssignment_3_1_1_1_in_rule__Node__Group_3_1_1__1__Impl2143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3_2_1__0__Impl_in_rule__Node__Group_3_2_1__02177 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Node__Group_3_2_1__1_in_rule__Node__Group_3_2_1__02180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Node__Group_3_2_1__0__Impl2208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3_2_1__1__Impl_in_rule__Node__Group_3_2_1__12239 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Node__Group_3_2_1__2_in_rule__Node__Group_3_2_1__12242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Node__Group_3_2_1__1__Impl2270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3_2_1__2__Impl_in_rule__Node__Group_3_2_1__22301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__ProblemNodeRefAssignment_3_2_1_2_in_rule__Node__Group_3_2_1__2__Impl2328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3_2_2__0__Impl_in_rule__Node__Group_3_2_2__02364 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Node__Group_3_2_2__1_in_rule__Node__Group_3_2_2__02367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Node__Group_3_2_2__0__Impl2395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3_2_2__1__Impl_in_rule__Node__Group_3_2_2__12426 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Node__Group_3_2_2__2_in_rule__Node__Group_3_2_2__12429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Node__Group_3_2_2__1__Impl2457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3_2_2__2__Impl_in_rule__Node__Group_3_2_2__22488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__ProblemRefAssignment_3_2_2_2_in_rule__Node__Group_3_2_2__2__Impl2515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3_2_3__0__Impl_in_rule__Node__Group_3_2_3__02551 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Node__Group_3_2_3__1_in_rule__Node__Group_3_2_3__02554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Node__Group_3_2_3__0__Impl2582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3_2_3__1__Impl_in_rule__Node__Group_3_2_3__12613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__HrefAssignment_3_2_3_1_in_rule__Node__Group_3_2_3__1__Impl2640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Phenomenon__Group__0__Impl_in_rule__Phenomenon__Group__02674 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_rule__Phenomenon__Group__1_in_rule__Phenomenon__Group__02677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Phenomenon__TypeAssignment_0_in_rule__Phenomenon__Group__0__Impl2704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Phenomenon__Group__1__Impl_in_rule__Phenomenon__Group__12735 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Phenomenon__Group__2_in_rule__Phenomenon__Group__12738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Phenomenon__IsControlledAssignment_1_in_rule__Phenomenon__Group__1__Impl2765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Phenomenon__Group__2__Impl_in_rule__Phenomenon__Group__22796 = new BitSet(new long[]{0x0000000008000022L});
    public static final BitSet FOLLOW_rule__Phenomenon__Group__3_in_rule__Phenomenon__Group__22799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Phenomenon__NameAssignment_2_in_rule__Phenomenon__Group__2__Impl2826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Phenomenon__Group__3__Impl_in_rule__Phenomenon__Group__32856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Phenomenon__Group_3__0_in_rule__Phenomenon__Group__3__Impl2883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Phenomenon__Group_3__0__Impl_in_rule__Phenomenon__Group_3__02922 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Phenomenon__Group_3__1_in_rule__Phenomenon__Group_3__02925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Phenomenon__Group_3__0__Impl2954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Phenomenon__Group_3__1__Impl_in_rule__Phenomenon__Group_3__12987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Phenomenon__DescriptionAssignment_3_1_in_rule__Phenomenon__Group_3__1__Impl3014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group__0__Impl_in_rule__Link__Group__03048 = new BitSet(new long[]{0x0000000001C00000L});
    public static final BitSet FOLLOW_rule__Link__Group__1_in_rule__Link__Group__03051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__FromAssignment_0_in_rule__Link__Group__0__Impl3078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group__1__Impl_in_rule__Link__Group__13108 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Link__Group__2_in_rule__Link__Group__13111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__TypeAssignment_1_in_rule__Link__Group__1__Impl3138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group__2__Impl_in_rule__Link__Group__23168 = new BitSet(new long[]{0x0000000018000022L});
    public static final BitSet FOLLOW_rule__Link__Group__3_in_rule__Link__Group__23171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__ToAssignment_2_in_rule__Link__Group__2__Impl3198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group__3__Impl_in_rule__Link__Group__33228 = new BitSet(new long[]{0x0000000008000022L});
    public static final BitSet FOLLOW_rule__Link__Group__4_in_rule__Link__Group__33231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group_3__0_in_rule__Link__Group__3__Impl3258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group__4__Impl_in_rule__Link__Group__43289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group_4__0_in_rule__Link__Group__4__Impl3316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group_3__0__Impl_in_rule__Link__Group_3__03357 = new BitSet(new long[]{0x0000000400380010L});
    public static final BitSet FOLLOW_rule__Link__Group_3__1_in_rule__Link__Group_3__03360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Link__Group_3__0__Impl3388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group_3__1__Impl_in_rule__Link__Group_3__13419 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_rule__Link__Group_3__2_in_rule__Link__Group_3__13422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__PhenomenaAssignment_3_1_in_rule__Link__Group_3__1__Impl3449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group_3__2__Impl_in_rule__Link__Group_3__23479 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Link__Group_3__3_in_rule__Link__Group_3__23482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group_3_2__0_in_rule__Link__Group_3__2__Impl3509 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__Link__Group_3__3__Impl_in_rule__Link__Group_3__33540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Link__Group_3__3__Impl3568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group_3_2__0__Impl_in_rule__Link__Group_3_2__03607 = new BitSet(new long[]{0x0000000400380010L});
    public static final BitSet FOLLOW_rule__Link__Group_3_2__1_in_rule__Link__Group_3_2__03610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Link__Group_3_2__0__Impl3638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group_3_2__1__Impl_in_rule__Link__Group_3_2__13669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__PhenomenaAssignment_3_2_1_in_rule__Link__Group_3_2__1__Impl3696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group_4__0__Impl_in_rule__Link__Group_4__03730 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Link__Group_4__1_in_rule__Link__Group_4__03733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Link__Group_4__0__Impl3762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group_4__1__Impl_in_rule__Link__Group_4__13795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__DescriptionAssignment_4_1_in_rule__Link__Group_4__1__Impl3822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ProblemDiagram__NameAssignment_23861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ProblemDiagram__HighlightAssignment_3_13896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_rule__ProblemDiagram__NodesAssignment_4_03931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_rule__ProblemDiagram__LinksAssignment_4_13962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Node__NameAssignment_03993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeType_in_rule__Node__TypeAssignment_14024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Node__DescriptionAssignment_2_14055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhenomenon_in_rule__Node__HiddenPhenomenaAssignment_3_1_04086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhenomenon_in_rule__Node__HiddenPhenomenaAssignment_3_1_1_14117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProblemDiagram_in_rule__Node__SubproblemAssignment_3_2_04148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Node__ProblemNodeRefAssignment_3_2_1_24183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Node__ProblemRefAssignment_3_2_2_24222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Node__HrefAssignment_3_2_3_14257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhenomenonType_in_rule__Phenomenon__TypeAssignment_04288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Phenomenon__IsControlledAssignment_14324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Phenomenon__NameAssignment_24363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Phenomenon__DescriptionAssignment_3_14394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Link__FromAssignment_04429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkType_in_rule__Link__TypeAssignment_14464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Link__ToAssignment_24499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhenomenon_in_rule__Link__PhenomenaAssignment_3_14534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhenomenon_in_rule__Link__PhenomenaAssignment_3_2_14565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Link__DescriptionAssignment_4_14596 = new BitSet(new long[]{0x0000000000000002L});

}