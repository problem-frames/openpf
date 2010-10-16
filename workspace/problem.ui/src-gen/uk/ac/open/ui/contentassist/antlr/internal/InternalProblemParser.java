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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_QUALIFIED_NAME", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'R'", "'M'", "'B'", "'X'", "'C'", "'D'", "'P'", "'?'", "'phenomenon'", "'event'", "'state'", "'--'", "'~~'", "'~>'", "'->'", "'problem:'", "'for'", "':'", "'{'", "'}'", "','", "'see'", "'domain'", "'problem'", "'!'"
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


    // $ANTLR start rule__ProblemDiagram__Alternatives_2
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:230:1: rule__ProblemDiagram__Alternatives_2 : ( ( ( rule__ProblemDiagram__NodesAssignment_2_0 ) ) | ( ( rule__ProblemDiagram__LinksAssignment_2_1 ) ) );
    public final void rule__ProblemDiagram__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:234:1: ( ( ( rule__ProblemDiagram__NodesAssignment_2_0 ) ) | ( ( rule__ProblemDiagram__LinksAssignment_2_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                int LA1_1 = input.LA(2);

                if ( ((LA1_1>=23 && LA1_1<=26)) ) {
                    alt1=2;
                }
                else if ( (LA1_1==EOF||(LA1_1>=RULE_ID && LA1_1<=RULE_STRING)||(LA1_1>=12 && LA1_1<=19)||(LA1_1>=27 && LA1_1<=31)||LA1_1==33) ) {
                    alt1=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("230:1: rule__ProblemDiagram__Alternatives_2 : ( ( ( rule__ProblemDiagram__NodesAssignment_2_0 ) ) | ( ( rule__ProblemDiagram__LinksAssignment_2_1 ) ) );", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("230:1: rule__ProblemDiagram__Alternatives_2 : ( ( ( rule__ProblemDiagram__NodesAssignment_2_0 ) ) | ( ( rule__ProblemDiagram__LinksAssignment_2_1 ) ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:235:1: ( ( rule__ProblemDiagram__NodesAssignment_2_0 ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:235:1: ( ( rule__ProblemDiagram__NodesAssignment_2_0 ) )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:236:1: ( rule__ProblemDiagram__NodesAssignment_2_0 )
                    {
                     before(grammarAccess.getProblemDiagramAccess().getNodesAssignment_2_0()); 
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:237:1: ( rule__ProblemDiagram__NodesAssignment_2_0 )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:237:2: rule__ProblemDiagram__NodesAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__ProblemDiagram__NodesAssignment_2_0_in_rule__ProblemDiagram__Alternatives_2418);
                    rule__ProblemDiagram__NodesAssignment_2_0();
                    _fsp--;


                    }

                     after(grammarAccess.getProblemDiagramAccess().getNodesAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:241:6: ( ( rule__ProblemDiagram__LinksAssignment_2_1 ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:241:6: ( ( rule__ProblemDiagram__LinksAssignment_2_1 ) )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:242:1: ( rule__ProblemDiagram__LinksAssignment_2_1 )
                    {
                     before(grammarAccess.getProblemDiagramAccess().getLinksAssignment_2_1()); 
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:243:1: ( rule__ProblemDiagram__LinksAssignment_2_1 )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:243:2: rule__ProblemDiagram__LinksAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__ProblemDiagram__LinksAssignment_2_1_in_rule__ProblemDiagram__Alternatives_2436);
                    rule__ProblemDiagram__LinksAssignment_2_1();
                    _fsp--;


                    }

                     after(grammarAccess.getProblemDiagramAccess().getLinksAssignment_2_1()); 

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
    // $ANTLR end rule__ProblemDiagram__Alternatives_2


    // $ANTLR start rule__Node__Alternatives_3_2
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:252:1: rule__Node__Alternatives_3_2 : ( ( ( rule__Node__SubproblemAssignment_3_2_0 ) ) | ( ( rule__Node__Group_3_2_1__0 ) ) | ( ( rule__Node__Group_3_2_2__0 ) ) | ( ( rule__Node__Group_3_2_3__0 ) ) );
    public final void rule__Node__Alternatives_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:256:1: ( ( ( rule__Node__SubproblemAssignment_3_2_0 ) ) | ( ( rule__Node__Group_3_2_1__0 ) ) | ( ( rule__Node__Group_3_2_2__0 ) ) | ( ( rule__Node__Group_3_2_3__0 ) ) )
            int alt2=4;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID||(LA2_0>=27 && LA2_0<=28)||LA2_0==31) ) {
                alt2=1;
            }
            else if ( (LA2_0==33) ) {
                alt2=1;
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:286:1: rule__NodeType__Alternatives : ( ( ( 'R' ) ) | ( ( 'M' ) ) | ( ( 'B' ) ) | ( ( 'X' ) ) | ( ( 'C' ) ) | ( ( 'D' ) ) | ( ( 'P' ) ) | ( ( '?' ) ) );
    public final void rule__NodeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:290:1: ( ( ( 'R' ) ) | ( ( 'M' ) ) | ( ( 'B' ) ) | ( ( 'X' ) ) | ( ( 'C' ) ) | ( ( 'D' ) ) | ( ( 'P' ) ) | ( ( '?' ) ) )
            int alt3=8;
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
            case 19:
                {
                alt3=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("286:1: rule__NodeType__Alternatives : ( ( ( 'R' ) ) | ( ( 'M' ) ) | ( ( 'B' ) ) | ( ( 'X' ) ) | ( ( 'C' ) ) | ( ( 'D' ) ) | ( ( 'P' ) ) | ( ( '?' ) ) );", 3, 0, input);

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
                case 8 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:340:6: ( ( '?' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:340:6: ( ( '?' ) )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:341:1: ( '?' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getCONCERNEnumLiteralDeclaration_7()); 
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:342:1: ( '?' )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:342:3: '?'
                    {
                    match(input,19,FOLLOW_19_in_rule__NodeType__Alternatives704); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getCONCERNEnumLiteralDeclaration_7()); 

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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:352:1: rule__PhenomenonType__Alternatives : ( ( ( 'phenomenon' ) ) | ( ( 'event' ) ) | ( ( 'state' ) ) );
    public final void rule__PhenomenonType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:356:1: ( ( ( 'phenomenon' ) ) | ( ( 'event' ) ) | ( ( 'state' ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt4=1;
                }
                break;
            case 21:
                {
                alt4=2;
                }
                break;
            case 22:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("352:1: rule__PhenomenonType__Alternatives : ( ( ( 'phenomenon' ) ) | ( ( 'event' ) ) | ( ( 'state' ) ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:357:1: ( ( 'phenomenon' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:357:1: ( ( 'phenomenon' ) )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:358:1: ( 'phenomenon' )
                    {
                     before(grammarAccess.getPhenomenonTypeAccess().getUNSPECIFIEDEnumLiteralDeclaration_0()); 
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:359:1: ( 'phenomenon' )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:359:3: 'phenomenon'
                    {
                    match(input,20,FOLLOW_20_in_rule__PhenomenonType__Alternatives740); 

                    }

                     after(grammarAccess.getPhenomenonTypeAccess().getUNSPECIFIEDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:364:6: ( ( 'event' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:364:6: ( ( 'event' ) )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:365:1: ( 'event' )
                    {
                     before(grammarAccess.getPhenomenonTypeAccess().getEVENTEnumLiteralDeclaration_1()); 
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:366:1: ( 'event' )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:366:3: 'event'
                    {
                    match(input,21,FOLLOW_21_in_rule__PhenomenonType__Alternatives761); 

                    }

                     after(grammarAccess.getPhenomenonTypeAccess().getEVENTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:371:6: ( ( 'state' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:371:6: ( ( 'state' ) )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:372:1: ( 'state' )
                    {
                     before(grammarAccess.getPhenomenonTypeAccess().getSTATEEnumLiteralDeclaration_2()); 
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:373:1: ( 'state' )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:373:3: 'state'
                    {
                    match(input,22,FOLLOW_22_in_rule__PhenomenonType__Alternatives782); 

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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:383:1: rule__LinkType__Alternatives : ( ( ( '--' ) ) | ( ( '~~' ) ) | ( ( '~>' ) ) | ( ( '->' ) ) );
    public final void rule__LinkType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:387:1: ( ( ( '--' ) ) | ( ( '~~' ) ) | ( ( '~>' ) ) | ( ( '->' ) ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt5=1;
                }
                break;
            case 24:
                {
                alt5=2;
                }
                break;
            case 25:
                {
                alt5=3;
                }
                break;
            case 26:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("383:1: rule__LinkType__Alternatives : ( ( ( '--' ) ) | ( ( '~~' ) ) | ( ( '~>' ) ) | ( ( '->' ) ) );", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:388:1: ( ( '--' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:388:1: ( ( '--' ) )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:389:1: ( '--' )
                    {
                     before(grammarAccess.getLinkTypeAccess().getINTERFACEEnumLiteralDeclaration_0()); 
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:390:1: ( '--' )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:390:3: '--'
                    {
                    match(input,23,FOLLOW_23_in_rule__LinkType__Alternatives818); 

                    }

                     after(grammarAccess.getLinkTypeAccess().getINTERFACEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:395:6: ( ( '~~' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:395:6: ( ( '~~' ) )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:396:1: ( '~~' )
                    {
                     before(grammarAccess.getLinkTypeAccess().getREFERENCEEnumLiteralDeclaration_1()); 
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:397:1: ( '~~' )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:397:3: '~~'
                    {
                    match(input,24,FOLLOW_24_in_rule__LinkType__Alternatives839); 

                    }

                     after(grammarAccess.getLinkTypeAccess().getREFERENCEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:402:6: ( ( '~>' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:402:6: ( ( '~>' ) )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:403:1: ( '~>' )
                    {
                     before(grammarAccess.getLinkTypeAccess().getCONSTRAINTEnumLiteralDeclaration_2()); 
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:404:1: ( '~>' )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:404:3: '~>'
                    {
                    match(input,25,FOLLOW_25_in_rule__LinkType__Alternatives860); 

                    }

                     after(grammarAccess.getLinkTypeAccess().getCONSTRAINTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:409:6: ( ( '->' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:409:6: ( ( '->' ) )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:410:1: ( '->' )
                    {
                     before(grammarAccess.getLinkTypeAccess().getCONCERNEnumLiteralDeclaration_3()); 
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:411:1: ( '->' )
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:411:3: '->'
                    {
                    match(input,26,FOLLOW_26_in_rule__LinkType__Alternatives881); 

                    }

                     after(grammarAccess.getLinkTypeAccess().getCONCERNEnumLiteralDeclaration_3()); 

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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:423:1: rule__ProblemDiagram__Group__0 : rule__ProblemDiagram__Group__0__Impl rule__ProblemDiagram__Group__1 ;
    public final void rule__ProblemDiagram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:427:1: ( rule__ProblemDiagram__Group__0__Impl rule__ProblemDiagram__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:428:2: rule__ProblemDiagram__Group__0__Impl rule__ProblemDiagram__Group__1
            {
            pushFollow(FOLLOW_rule__ProblemDiagram__Group__0__Impl_in_rule__ProblemDiagram__Group__0914);
            rule__ProblemDiagram__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ProblemDiagram__Group__1_in_rule__ProblemDiagram__Group__0917);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:435:1: rule__ProblemDiagram__Group__0__Impl : ( ( rule__ProblemDiagram__Group_0__0 )? ) ;
    public final void rule__ProblemDiagram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:439:1: ( ( ( rule__ProblemDiagram__Group_0__0 )? ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:440:1: ( ( rule__ProblemDiagram__Group_0__0 )? )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:440:1: ( ( rule__ProblemDiagram__Group_0__0 )? )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:441:1: ( rule__ProblemDiagram__Group_0__0 )?
            {
             before(grammarAccess.getProblemDiagramAccess().getGroup_0()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:442:1: ( rule__ProblemDiagram__Group_0__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==27) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:442:2: rule__ProblemDiagram__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__ProblemDiagram__Group_0__0_in_rule__ProblemDiagram__Group__0__Impl944);
                    rule__ProblemDiagram__Group_0__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProblemDiagramAccess().getGroup_0()); 

            }


            }

        }
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:452:1: rule__ProblemDiagram__Group__1 : rule__ProblemDiagram__Group__1__Impl rule__ProblemDiagram__Group__2 ;
    public final void rule__ProblemDiagram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:456:1: ( rule__ProblemDiagram__Group__1__Impl rule__ProblemDiagram__Group__2 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:457:2: rule__ProblemDiagram__Group__1__Impl rule__ProblemDiagram__Group__2
            {
            pushFollow(FOLLOW_rule__ProblemDiagram__Group__1__Impl_in_rule__ProblemDiagram__Group__1975);
            rule__ProblemDiagram__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ProblemDiagram__Group__2_in_rule__ProblemDiagram__Group__1978);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:464:1: rule__ProblemDiagram__Group__1__Impl : ( ( rule__ProblemDiagram__Group_1__0 )? ) ;
    public final void rule__ProblemDiagram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:468:1: ( ( ( rule__ProblemDiagram__Group_1__0 )? ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:469:1: ( ( rule__ProblemDiagram__Group_1__0 )? )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:469:1: ( ( rule__ProblemDiagram__Group_1__0 )? )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:470:1: ( rule__ProblemDiagram__Group_1__0 )?
            {
             before(grammarAccess.getProblemDiagramAccess().getGroup_1()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:471:1: ( rule__ProblemDiagram__Group_1__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==28) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:471:2: rule__ProblemDiagram__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ProblemDiagram__Group_1__0_in_rule__ProblemDiagram__Group__1__Impl1005);
                    rule__ProblemDiagram__Group_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProblemDiagramAccess().getGroup_1()); 

            }


            }

        }
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:481:1: rule__ProblemDiagram__Group__2 : rule__ProblemDiagram__Group__2__Impl ;
    public final void rule__ProblemDiagram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:485:1: ( rule__ProblemDiagram__Group__2__Impl )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:486:2: rule__ProblemDiagram__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ProblemDiagram__Group__2__Impl_in_rule__ProblemDiagram__Group__21036);
            rule__ProblemDiagram__Group__2__Impl();
            _fsp--;


            }

        }
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:492:1: rule__ProblemDiagram__Group__2__Impl : ( ( rule__ProblemDiagram__Alternatives_2 )* ) ;
    public final void rule__ProblemDiagram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:496:1: ( ( ( rule__ProblemDiagram__Alternatives_2 )* ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:497:1: ( ( rule__ProblemDiagram__Alternatives_2 )* )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:497:1: ( ( rule__ProblemDiagram__Alternatives_2 )* )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:498:1: ( rule__ProblemDiagram__Alternatives_2 )*
            {
             before(grammarAccess.getProblemDiagramAccess().getAlternatives_2()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:499:1: ( rule__ProblemDiagram__Alternatives_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:499:2: rule__ProblemDiagram__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_rule__ProblemDiagram__Alternatives_2_in_rule__ProblemDiagram__Group__2__Impl1063);
            	    rule__ProblemDiagram__Alternatives_2();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getProblemDiagramAccess().getAlternatives_2()); 

            }


            }

        }
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


    // $ANTLR start rule__ProblemDiagram__Group_0__0
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:515:1: rule__ProblemDiagram__Group_0__0 : rule__ProblemDiagram__Group_0__0__Impl rule__ProblemDiagram__Group_0__1 ;
    public final void rule__ProblemDiagram__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:519:1: ( rule__ProblemDiagram__Group_0__0__Impl rule__ProblemDiagram__Group_0__1 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:520:2: rule__ProblemDiagram__Group_0__0__Impl rule__ProblemDiagram__Group_0__1
            {
            pushFollow(FOLLOW_rule__ProblemDiagram__Group_0__0__Impl_in_rule__ProblemDiagram__Group_0__01100);
            rule__ProblemDiagram__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ProblemDiagram__Group_0__1_in_rule__ProblemDiagram__Group_0__01103);
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


    // $ANTLR start rule__ProblemDiagram__Group_0__0__Impl
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:527:1: rule__ProblemDiagram__Group_0__0__Impl : ( 'problem:' ) ;
    public final void rule__ProblemDiagram__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:531:1: ( ( 'problem:' ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:532:1: ( 'problem:' )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:532:1: ( 'problem:' )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:533:1: 'problem:'
            {
             before(grammarAccess.getProblemDiagramAccess().getProblemKeyword_0_0()); 
            match(input,27,FOLLOW_27_in_rule__ProblemDiagram__Group_0__0__Impl1131); 
             after(grammarAccess.getProblemDiagramAccess().getProblemKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProblemDiagram__Group_0__0__Impl


    // $ANTLR start rule__ProblemDiagram__Group_0__1
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:546:1: rule__ProblemDiagram__Group_0__1 : rule__ProblemDiagram__Group_0__1__Impl ;
    public final void rule__ProblemDiagram__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:550:1: ( rule__ProblemDiagram__Group_0__1__Impl )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:551:2: rule__ProblemDiagram__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__ProblemDiagram__Group_0__1__Impl_in_rule__ProblemDiagram__Group_0__11162);
            rule__ProblemDiagram__Group_0__1__Impl();
            _fsp--;


            }

        }
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


    // $ANTLR start rule__ProblemDiagram__Group_0__1__Impl
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:557:1: rule__ProblemDiagram__Group_0__1__Impl : ( ( rule__ProblemDiagram__NameAssignment_0_1 ) ) ;
    public final void rule__ProblemDiagram__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:561:1: ( ( ( rule__ProblemDiagram__NameAssignment_0_1 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:562:1: ( ( rule__ProblemDiagram__NameAssignment_0_1 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:562:1: ( ( rule__ProblemDiagram__NameAssignment_0_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:563:1: ( rule__ProblemDiagram__NameAssignment_0_1 )
            {
             before(grammarAccess.getProblemDiagramAccess().getNameAssignment_0_1()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:564:1: ( rule__ProblemDiagram__NameAssignment_0_1 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:564:2: rule__ProblemDiagram__NameAssignment_0_1
            {
            pushFollow(FOLLOW_rule__ProblemDiagram__NameAssignment_0_1_in_rule__ProblemDiagram__Group_0__1__Impl1189);
            rule__ProblemDiagram__NameAssignment_0_1();
            _fsp--;


            }

             after(grammarAccess.getProblemDiagramAccess().getNameAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProblemDiagram__Group_0__1__Impl


    // $ANTLR start rule__ProblemDiagram__Group_1__0
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:578:1: rule__ProblemDiagram__Group_1__0 : rule__ProblemDiagram__Group_1__0__Impl rule__ProblemDiagram__Group_1__1 ;
    public final void rule__ProblemDiagram__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:582:1: ( rule__ProblemDiagram__Group_1__0__Impl rule__ProblemDiagram__Group_1__1 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:583:2: rule__ProblemDiagram__Group_1__0__Impl rule__ProblemDiagram__Group_1__1
            {
            pushFollow(FOLLOW_rule__ProblemDiagram__Group_1__0__Impl_in_rule__ProblemDiagram__Group_1__01223);
            rule__ProblemDiagram__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ProblemDiagram__Group_1__1_in_rule__ProblemDiagram__Group_1__01226);
            rule__ProblemDiagram__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProblemDiagram__Group_1__0


    // $ANTLR start rule__ProblemDiagram__Group_1__0__Impl
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:590:1: rule__ProblemDiagram__Group_1__0__Impl : ( 'for' ) ;
    public final void rule__ProblemDiagram__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:594:1: ( ( 'for' ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:595:1: ( 'for' )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:595:1: ( 'for' )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:596:1: 'for'
            {
             before(grammarAccess.getProblemDiagramAccess().getForKeyword_1_0()); 
            match(input,28,FOLLOW_28_in_rule__ProblemDiagram__Group_1__0__Impl1254); 
             after(grammarAccess.getProblemDiagramAccess().getForKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProblemDiagram__Group_1__0__Impl


    // $ANTLR start rule__ProblemDiagram__Group_1__1
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:609:1: rule__ProblemDiagram__Group_1__1 : rule__ProblemDiagram__Group_1__1__Impl ;
    public final void rule__ProblemDiagram__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:613:1: ( rule__ProblemDiagram__Group_1__1__Impl )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:614:2: rule__ProblemDiagram__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ProblemDiagram__Group_1__1__Impl_in_rule__ProblemDiagram__Group_1__11285);
            rule__ProblemDiagram__Group_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProblemDiagram__Group_1__1


    // $ANTLR start rule__ProblemDiagram__Group_1__1__Impl
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:620:1: rule__ProblemDiagram__Group_1__1__Impl : ( ( rule__ProblemDiagram__HighlightAssignment_1_1 ) ) ;
    public final void rule__ProblemDiagram__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:624:1: ( ( ( rule__ProblemDiagram__HighlightAssignment_1_1 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:625:1: ( ( rule__ProblemDiagram__HighlightAssignment_1_1 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:625:1: ( ( rule__ProblemDiagram__HighlightAssignment_1_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:626:1: ( rule__ProblemDiagram__HighlightAssignment_1_1 )
            {
             before(grammarAccess.getProblemDiagramAccess().getHighlightAssignment_1_1()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:627:1: ( rule__ProblemDiagram__HighlightAssignment_1_1 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:627:2: rule__ProblemDiagram__HighlightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ProblemDiagram__HighlightAssignment_1_1_in_rule__ProblemDiagram__Group_1__1__Impl1312);
            rule__ProblemDiagram__HighlightAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getProblemDiagramAccess().getHighlightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProblemDiagram__Group_1__1__Impl


    // $ANTLR start rule__Node__Group__0
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:641:1: rule__Node__Group__0 : rule__Node__Group__0__Impl rule__Node__Group__1 ;
    public final void rule__Node__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:645:1: ( rule__Node__Group__0__Impl rule__Node__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:646:2: rule__Node__Group__0__Impl rule__Node__Group__1
            {
            pushFollow(FOLLOW_rule__Node__Group__0__Impl_in_rule__Node__Group__01346);
            rule__Node__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Node__Group__1_in_rule__Node__Group__01349);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:653:1: rule__Node__Group__0__Impl : ( ( rule__Node__NameAssignment_0 ) ) ;
    public final void rule__Node__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:657:1: ( ( ( rule__Node__NameAssignment_0 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:658:1: ( ( rule__Node__NameAssignment_0 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:658:1: ( ( rule__Node__NameAssignment_0 ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:659:1: ( rule__Node__NameAssignment_0 )
            {
             before(grammarAccess.getNodeAccess().getNameAssignment_0()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:660:1: ( rule__Node__NameAssignment_0 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:660:2: rule__Node__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Node__NameAssignment_0_in_rule__Node__Group__0__Impl1376);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:670:1: rule__Node__Group__1 : rule__Node__Group__1__Impl rule__Node__Group__2 ;
    public final void rule__Node__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:674:1: ( rule__Node__Group__1__Impl rule__Node__Group__2 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:675:2: rule__Node__Group__1__Impl rule__Node__Group__2
            {
            pushFollow(FOLLOW_rule__Node__Group__1__Impl_in_rule__Node__Group__11406);
            rule__Node__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Node__Group__2_in_rule__Node__Group__11409);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:682:1: rule__Node__Group__1__Impl : ( ( rule__Node__TypeAssignment_1 )? ) ;
    public final void rule__Node__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:686:1: ( ( ( rule__Node__TypeAssignment_1 )? ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:687:1: ( ( rule__Node__TypeAssignment_1 )? )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:687:1: ( ( rule__Node__TypeAssignment_1 )? )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:688:1: ( rule__Node__TypeAssignment_1 )?
            {
             before(grammarAccess.getNodeAccess().getTypeAssignment_1()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:689:1: ( rule__Node__TypeAssignment_1 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=12 && LA9_0<=19)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:689:2: rule__Node__TypeAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Node__TypeAssignment_1_in_rule__Node__Group__1__Impl1436);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:699:1: rule__Node__Group__2 : rule__Node__Group__2__Impl rule__Node__Group__3 ;
    public final void rule__Node__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:703:1: ( rule__Node__Group__2__Impl rule__Node__Group__3 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:704:2: rule__Node__Group__2__Impl rule__Node__Group__3
            {
            pushFollow(FOLLOW_rule__Node__Group__2__Impl_in_rule__Node__Group__21467);
            rule__Node__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Node__Group__3_in_rule__Node__Group__21470);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:711:1: rule__Node__Group__2__Impl : ( ( rule__Node__Group_2__0 )? ) ;
    public final void rule__Node__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:715:1: ( ( ( rule__Node__Group_2__0 )? ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:716:1: ( ( rule__Node__Group_2__0 )? )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:716:1: ( ( rule__Node__Group_2__0 )? )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:717:1: ( rule__Node__Group_2__0 )?
            {
             before(grammarAccess.getNodeAccess().getGroup_2()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:718:1: ( rule__Node__Group_2__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING||LA10_0==29) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:718:2: rule__Node__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Node__Group_2__0_in_rule__Node__Group__2__Impl1497);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:728:1: rule__Node__Group__3 : rule__Node__Group__3__Impl ;
    public final void rule__Node__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:732:1: ( rule__Node__Group__3__Impl )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:733:2: rule__Node__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Node__Group__3__Impl_in_rule__Node__Group__31528);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:739:1: rule__Node__Group__3__Impl : ( ( rule__Node__Group_3__0 )? ) ;
    public final void rule__Node__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:743:1: ( ( ( rule__Node__Group_3__0 )? ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:744:1: ( ( rule__Node__Group_3__0 )? )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:744:1: ( ( rule__Node__Group_3__0 )? )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:745:1: ( rule__Node__Group_3__0 )?
            {
             before(grammarAccess.getNodeAccess().getGroup_3()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:746:1: ( rule__Node__Group_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==30) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:746:2: rule__Node__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Node__Group_3__0_in_rule__Node__Group__3__Impl1555);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:764:1: rule__Node__Group_2__0 : rule__Node__Group_2__0__Impl rule__Node__Group_2__1 ;
    public final void rule__Node__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:768:1: ( rule__Node__Group_2__0__Impl rule__Node__Group_2__1 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:769:2: rule__Node__Group_2__0__Impl rule__Node__Group_2__1
            {
            pushFollow(FOLLOW_rule__Node__Group_2__0__Impl_in_rule__Node__Group_2__01594);
            rule__Node__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Node__Group_2__1_in_rule__Node__Group_2__01597);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:776:1: rule__Node__Group_2__0__Impl : ( ( ':' )? ) ;
    public final void rule__Node__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:780:1: ( ( ( ':' )? ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:781:1: ( ( ':' )? )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:781:1: ( ( ':' )? )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:782:1: ( ':' )?
            {
             before(grammarAccess.getNodeAccess().getColonKeyword_2_0()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:783:1: ( ':' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==29) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:784:2: ':'
                    {
                    match(input,29,FOLLOW_29_in_rule__Node__Group_2__0__Impl1626); 

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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:795:1: rule__Node__Group_2__1 : rule__Node__Group_2__1__Impl ;
    public final void rule__Node__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:799:1: ( rule__Node__Group_2__1__Impl )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:800:2: rule__Node__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Node__Group_2__1__Impl_in_rule__Node__Group_2__11659);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:806:1: rule__Node__Group_2__1__Impl : ( ( rule__Node__DescriptionAssignment_2_1 ) ) ;
    public final void rule__Node__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:810:1: ( ( ( rule__Node__DescriptionAssignment_2_1 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:811:1: ( ( rule__Node__DescriptionAssignment_2_1 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:811:1: ( ( rule__Node__DescriptionAssignment_2_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:812:1: ( rule__Node__DescriptionAssignment_2_1 )
            {
             before(grammarAccess.getNodeAccess().getDescriptionAssignment_2_1()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:813:1: ( rule__Node__DescriptionAssignment_2_1 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:813:2: rule__Node__DescriptionAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Node__DescriptionAssignment_2_1_in_rule__Node__Group_2__1__Impl1686);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:827:1: rule__Node__Group_3__0 : rule__Node__Group_3__0__Impl rule__Node__Group_3__1 ;
    public final void rule__Node__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:831:1: ( rule__Node__Group_3__0__Impl rule__Node__Group_3__1 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:832:2: rule__Node__Group_3__0__Impl rule__Node__Group_3__1
            {
            pushFollow(FOLLOW_rule__Node__Group_3__0__Impl_in_rule__Node__Group_3__01720);
            rule__Node__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Node__Group_3__1_in_rule__Node__Group_3__01723);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:839:1: rule__Node__Group_3__0__Impl : ( '{' ) ;
    public final void rule__Node__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:843:1: ( ( '{' ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:844:1: ( '{' )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:844:1: ( '{' )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:845:1: '{'
            {
             before(grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,30,FOLLOW_30_in_rule__Node__Group_3__0__Impl1751); 
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:858:1: rule__Node__Group_3__1 : rule__Node__Group_3__1__Impl rule__Node__Group_3__2 ;
    public final void rule__Node__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:862:1: ( rule__Node__Group_3__1__Impl rule__Node__Group_3__2 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:863:2: rule__Node__Group_3__1__Impl rule__Node__Group_3__2
            {
            pushFollow(FOLLOW_rule__Node__Group_3__1__Impl_in_rule__Node__Group_3__11782);
            rule__Node__Group_3__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Node__Group_3__2_in_rule__Node__Group_3__11785);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:870:1: rule__Node__Group_3__1__Impl : ( ( rule__Node__Group_3_1__0 )? ) ;
    public final void rule__Node__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:874:1: ( ( ( rule__Node__Group_3_1__0 )? ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:875:1: ( ( rule__Node__Group_3_1__0 )? )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:875:1: ( ( rule__Node__Group_3_1__0 )? )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:876:1: ( rule__Node__Group_3_1__0 )?
            {
             before(grammarAccess.getNodeAccess().getGroup_3_1()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:877:1: ( rule__Node__Group_3_1__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=20 && LA13_0<=22)||LA13_0==36) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:877:2: rule__Node__Group_3_1__0
                    {
                    pushFollow(FOLLOW_rule__Node__Group_3_1__0_in_rule__Node__Group_3__1__Impl1812);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:887:1: rule__Node__Group_3__2 : rule__Node__Group_3__2__Impl rule__Node__Group_3__3 ;
    public final void rule__Node__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:891:1: ( rule__Node__Group_3__2__Impl rule__Node__Group_3__3 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:892:2: rule__Node__Group_3__2__Impl rule__Node__Group_3__3
            {
            pushFollow(FOLLOW_rule__Node__Group_3__2__Impl_in_rule__Node__Group_3__21843);
            rule__Node__Group_3__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Node__Group_3__3_in_rule__Node__Group_3__21846);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:899:1: rule__Node__Group_3__2__Impl : ( ( rule__Node__Alternatives_3_2 )* ) ;
    public final void rule__Node__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:903:1: ( ( ( rule__Node__Alternatives_3_2 )* ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:904:1: ( ( rule__Node__Alternatives_3_2 )* )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:904:1: ( ( rule__Node__Alternatives_3_2 )* )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:905:1: ( rule__Node__Alternatives_3_2 )*
            {
             before(grammarAccess.getNodeAccess().getAlternatives_3_2()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:906:1: ( rule__Node__Alternatives_3_2 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID||(LA14_0>=27 && LA14_0<=28)||LA14_0==31||LA14_0==33) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:906:2: rule__Node__Alternatives_3_2
            	    {
            	    pushFollow(FOLLOW_rule__Node__Alternatives_3_2_in_rule__Node__Group_3__2__Impl1873);
            	    rule__Node__Alternatives_3_2();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:916:1: rule__Node__Group_3__3 : rule__Node__Group_3__3__Impl ;
    public final void rule__Node__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:920:1: ( rule__Node__Group_3__3__Impl )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:921:2: rule__Node__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__Node__Group_3__3__Impl_in_rule__Node__Group_3__31904);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:927:1: rule__Node__Group_3__3__Impl : ( '}' ) ;
    public final void rule__Node__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:931:1: ( ( '}' ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:932:1: ( '}' )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:932:1: ( '}' )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:933:1: '}'
            {
             before(grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_3_3()); 
            match(input,31,FOLLOW_31_in_rule__Node__Group_3__3__Impl1932); 
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:954:1: rule__Node__Group_3_1__0 : rule__Node__Group_3_1__0__Impl rule__Node__Group_3_1__1 ;
    public final void rule__Node__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:958:1: ( rule__Node__Group_3_1__0__Impl rule__Node__Group_3_1__1 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:959:2: rule__Node__Group_3_1__0__Impl rule__Node__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__Node__Group_3_1__0__Impl_in_rule__Node__Group_3_1__01971);
            rule__Node__Group_3_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Node__Group_3_1__1_in_rule__Node__Group_3_1__01974);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:966:1: rule__Node__Group_3_1__0__Impl : ( ( rule__Node__HiddenPhenomenaAssignment_3_1_0 ) ) ;
    public final void rule__Node__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:970:1: ( ( ( rule__Node__HiddenPhenomenaAssignment_3_1_0 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:971:1: ( ( rule__Node__HiddenPhenomenaAssignment_3_1_0 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:971:1: ( ( rule__Node__HiddenPhenomenaAssignment_3_1_0 ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:972:1: ( rule__Node__HiddenPhenomenaAssignment_3_1_0 )
            {
             before(grammarAccess.getNodeAccess().getHiddenPhenomenaAssignment_3_1_0()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:973:1: ( rule__Node__HiddenPhenomenaAssignment_3_1_0 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:973:2: rule__Node__HiddenPhenomenaAssignment_3_1_0
            {
            pushFollow(FOLLOW_rule__Node__HiddenPhenomenaAssignment_3_1_0_in_rule__Node__Group_3_1__0__Impl2001);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:983:1: rule__Node__Group_3_1__1 : rule__Node__Group_3_1__1__Impl ;
    public final void rule__Node__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:987:1: ( rule__Node__Group_3_1__1__Impl )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:988:2: rule__Node__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Node__Group_3_1__1__Impl_in_rule__Node__Group_3_1__12031);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:994:1: rule__Node__Group_3_1__1__Impl : ( ( rule__Node__Group_3_1_1__0 )* ) ;
    public final void rule__Node__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:998:1: ( ( ( rule__Node__Group_3_1_1__0 )* ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:999:1: ( ( rule__Node__Group_3_1_1__0 )* )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:999:1: ( ( rule__Node__Group_3_1_1__0 )* )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1000:1: ( rule__Node__Group_3_1_1__0 )*
            {
             before(grammarAccess.getNodeAccess().getGroup_3_1_1()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1001:1: ( rule__Node__Group_3_1_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==32) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1001:2: rule__Node__Group_3_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Node__Group_3_1_1__0_in_rule__Node__Group_3_1__1__Impl2058);
            	    rule__Node__Group_3_1_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1015:1: rule__Node__Group_3_1_1__0 : rule__Node__Group_3_1_1__0__Impl rule__Node__Group_3_1_1__1 ;
    public final void rule__Node__Group_3_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1019:1: ( rule__Node__Group_3_1_1__0__Impl rule__Node__Group_3_1_1__1 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1020:2: rule__Node__Group_3_1_1__0__Impl rule__Node__Group_3_1_1__1
            {
            pushFollow(FOLLOW_rule__Node__Group_3_1_1__0__Impl_in_rule__Node__Group_3_1_1__02093);
            rule__Node__Group_3_1_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Node__Group_3_1_1__1_in_rule__Node__Group_3_1_1__02096);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1027:1: rule__Node__Group_3_1_1__0__Impl : ( ',' ) ;
    public final void rule__Node__Group_3_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1031:1: ( ( ',' ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1032:1: ( ',' )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1032:1: ( ',' )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1033:1: ','
            {
             before(grammarAccess.getNodeAccess().getCommaKeyword_3_1_1_0()); 
            match(input,32,FOLLOW_32_in_rule__Node__Group_3_1_1__0__Impl2124); 
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1046:1: rule__Node__Group_3_1_1__1 : rule__Node__Group_3_1_1__1__Impl ;
    public final void rule__Node__Group_3_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1050:1: ( rule__Node__Group_3_1_1__1__Impl )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1051:2: rule__Node__Group_3_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Node__Group_3_1_1__1__Impl_in_rule__Node__Group_3_1_1__12155);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1057:1: rule__Node__Group_3_1_1__1__Impl : ( ( rule__Node__HiddenPhenomenaAssignment_3_1_1_1 ) ) ;
    public final void rule__Node__Group_3_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1061:1: ( ( ( rule__Node__HiddenPhenomenaAssignment_3_1_1_1 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1062:1: ( ( rule__Node__HiddenPhenomenaAssignment_3_1_1_1 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1062:1: ( ( rule__Node__HiddenPhenomenaAssignment_3_1_1_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1063:1: ( rule__Node__HiddenPhenomenaAssignment_3_1_1_1 )
            {
             before(grammarAccess.getNodeAccess().getHiddenPhenomenaAssignment_3_1_1_1()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1064:1: ( rule__Node__HiddenPhenomenaAssignment_3_1_1_1 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1064:2: rule__Node__HiddenPhenomenaAssignment_3_1_1_1
            {
            pushFollow(FOLLOW_rule__Node__HiddenPhenomenaAssignment_3_1_1_1_in_rule__Node__Group_3_1_1__1__Impl2182);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1078:1: rule__Node__Group_3_2_1__0 : rule__Node__Group_3_2_1__0__Impl rule__Node__Group_3_2_1__1 ;
    public final void rule__Node__Group_3_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1082:1: ( rule__Node__Group_3_2_1__0__Impl rule__Node__Group_3_2_1__1 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1083:2: rule__Node__Group_3_2_1__0__Impl rule__Node__Group_3_2_1__1
            {
            pushFollow(FOLLOW_rule__Node__Group_3_2_1__0__Impl_in_rule__Node__Group_3_2_1__02216);
            rule__Node__Group_3_2_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Node__Group_3_2_1__1_in_rule__Node__Group_3_2_1__02219);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1090:1: rule__Node__Group_3_2_1__0__Impl : ( 'see' ) ;
    public final void rule__Node__Group_3_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1094:1: ( ( 'see' ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1095:1: ( 'see' )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1095:1: ( 'see' )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1096:1: 'see'
            {
             before(grammarAccess.getNodeAccess().getSeeKeyword_3_2_1_0()); 
            match(input,33,FOLLOW_33_in_rule__Node__Group_3_2_1__0__Impl2247); 
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1109:1: rule__Node__Group_3_2_1__1 : rule__Node__Group_3_2_1__1__Impl rule__Node__Group_3_2_1__2 ;
    public final void rule__Node__Group_3_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1113:1: ( rule__Node__Group_3_2_1__1__Impl rule__Node__Group_3_2_1__2 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1114:2: rule__Node__Group_3_2_1__1__Impl rule__Node__Group_3_2_1__2
            {
            pushFollow(FOLLOW_rule__Node__Group_3_2_1__1__Impl_in_rule__Node__Group_3_2_1__12278);
            rule__Node__Group_3_2_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Node__Group_3_2_1__2_in_rule__Node__Group_3_2_1__12281);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1121:1: rule__Node__Group_3_2_1__1__Impl : ( 'domain' ) ;
    public final void rule__Node__Group_3_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1125:1: ( ( 'domain' ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1126:1: ( 'domain' )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1126:1: ( 'domain' )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1127:1: 'domain'
            {
             before(grammarAccess.getNodeAccess().getDomainKeyword_3_2_1_1()); 
            match(input,34,FOLLOW_34_in_rule__Node__Group_3_2_1__1__Impl2309); 
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1140:1: rule__Node__Group_3_2_1__2 : rule__Node__Group_3_2_1__2__Impl ;
    public final void rule__Node__Group_3_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1144:1: ( rule__Node__Group_3_2_1__2__Impl )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1145:2: rule__Node__Group_3_2_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Node__Group_3_2_1__2__Impl_in_rule__Node__Group_3_2_1__22340);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1151:1: rule__Node__Group_3_2_1__2__Impl : ( ( rule__Node__ProblemNodeRefAssignment_3_2_1_2 ) ) ;
    public final void rule__Node__Group_3_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1155:1: ( ( ( rule__Node__ProblemNodeRefAssignment_3_2_1_2 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1156:1: ( ( rule__Node__ProblemNodeRefAssignment_3_2_1_2 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1156:1: ( ( rule__Node__ProblemNodeRefAssignment_3_2_1_2 ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1157:1: ( rule__Node__ProblemNodeRefAssignment_3_2_1_2 )
            {
             before(grammarAccess.getNodeAccess().getProblemNodeRefAssignment_3_2_1_2()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1158:1: ( rule__Node__ProblemNodeRefAssignment_3_2_1_2 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1158:2: rule__Node__ProblemNodeRefAssignment_3_2_1_2
            {
            pushFollow(FOLLOW_rule__Node__ProblemNodeRefAssignment_3_2_1_2_in_rule__Node__Group_3_2_1__2__Impl2367);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1174:1: rule__Node__Group_3_2_2__0 : rule__Node__Group_3_2_2__0__Impl rule__Node__Group_3_2_2__1 ;
    public final void rule__Node__Group_3_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1178:1: ( rule__Node__Group_3_2_2__0__Impl rule__Node__Group_3_2_2__1 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1179:2: rule__Node__Group_3_2_2__0__Impl rule__Node__Group_3_2_2__1
            {
            pushFollow(FOLLOW_rule__Node__Group_3_2_2__0__Impl_in_rule__Node__Group_3_2_2__02403);
            rule__Node__Group_3_2_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Node__Group_3_2_2__1_in_rule__Node__Group_3_2_2__02406);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1186:1: rule__Node__Group_3_2_2__0__Impl : ( 'see' ) ;
    public final void rule__Node__Group_3_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1190:1: ( ( 'see' ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1191:1: ( 'see' )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1191:1: ( 'see' )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1192:1: 'see'
            {
             before(grammarAccess.getNodeAccess().getSeeKeyword_3_2_2_0()); 
            match(input,33,FOLLOW_33_in_rule__Node__Group_3_2_2__0__Impl2434); 
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1205:1: rule__Node__Group_3_2_2__1 : rule__Node__Group_3_2_2__1__Impl rule__Node__Group_3_2_2__2 ;
    public final void rule__Node__Group_3_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1209:1: ( rule__Node__Group_3_2_2__1__Impl rule__Node__Group_3_2_2__2 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1210:2: rule__Node__Group_3_2_2__1__Impl rule__Node__Group_3_2_2__2
            {
            pushFollow(FOLLOW_rule__Node__Group_3_2_2__1__Impl_in_rule__Node__Group_3_2_2__12465);
            rule__Node__Group_3_2_2__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Node__Group_3_2_2__2_in_rule__Node__Group_3_2_2__12468);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1217:1: rule__Node__Group_3_2_2__1__Impl : ( 'problem' ) ;
    public final void rule__Node__Group_3_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1221:1: ( ( 'problem' ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1222:1: ( 'problem' )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1222:1: ( 'problem' )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1223:1: 'problem'
            {
             before(grammarAccess.getNodeAccess().getProblemKeyword_3_2_2_1()); 
            match(input,35,FOLLOW_35_in_rule__Node__Group_3_2_2__1__Impl2496); 
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1236:1: rule__Node__Group_3_2_2__2 : rule__Node__Group_3_2_2__2__Impl ;
    public final void rule__Node__Group_3_2_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1240:1: ( rule__Node__Group_3_2_2__2__Impl )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1241:2: rule__Node__Group_3_2_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Node__Group_3_2_2__2__Impl_in_rule__Node__Group_3_2_2__22527);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1247:1: rule__Node__Group_3_2_2__2__Impl : ( ( rule__Node__ProblemRefAssignment_3_2_2_2 ) ) ;
    public final void rule__Node__Group_3_2_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1251:1: ( ( ( rule__Node__ProblemRefAssignment_3_2_2_2 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1252:1: ( ( rule__Node__ProblemRefAssignment_3_2_2_2 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1252:1: ( ( rule__Node__ProblemRefAssignment_3_2_2_2 ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1253:1: ( rule__Node__ProblemRefAssignment_3_2_2_2 )
            {
             before(grammarAccess.getNodeAccess().getProblemRefAssignment_3_2_2_2()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1254:1: ( rule__Node__ProblemRefAssignment_3_2_2_2 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1254:2: rule__Node__ProblemRefAssignment_3_2_2_2
            {
            pushFollow(FOLLOW_rule__Node__ProblemRefAssignment_3_2_2_2_in_rule__Node__Group_3_2_2__2__Impl2554);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1270:1: rule__Node__Group_3_2_3__0 : rule__Node__Group_3_2_3__0__Impl rule__Node__Group_3_2_3__1 ;
    public final void rule__Node__Group_3_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1274:1: ( rule__Node__Group_3_2_3__0__Impl rule__Node__Group_3_2_3__1 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1275:2: rule__Node__Group_3_2_3__0__Impl rule__Node__Group_3_2_3__1
            {
            pushFollow(FOLLOW_rule__Node__Group_3_2_3__0__Impl_in_rule__Node__Group_3_2_3__02590);
            rule__Node__Group_3_2_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Node__Group_3_2_3__1_in_rule__Node__Group_3_2_3__02593);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1282:1: rule__Node__Group_3_2_3__0__Impl : ( 'see' ) ;
    public final void rule__Node__Group_3_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1286:1: ( ( 'see' ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1287:1: ( 'see' )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1287:1: ( 'see' )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1288:1: 'see'
            {
             before(grammarAccess.getNodeAccess().getSeeKeyword_3_2_3_0()); 
            match(input,33,FOLLOW_33_in_rule__Node__Group_3_2_3__0__Impl2621); 
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1301:1: rule__Node__Group_3_2_3__1 : rule__Node__Group_3_2_3__1__Impl ;
    public final void rule__Node__Group_3_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1305:1: ( rule__Node__Group_3_2_3__1__Impl )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1306:2: rule__Node__Group_3_2_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Node__Group_3_2_3__1__Impl_in_rule__Node__Group_3_2_3__12652);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1312:1: rule__Node__Group_3_2_3__1__Impl : ( ( rule__Node__HrefAssignment_3_2_3_1 ) ) ;
    public final void rule__Node__Group_3_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1316:1: ( ( ( rule__Node__HrefAssignment_3_2_3_1 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1317:1: ( ( rule__Node__HrefAssignment_3_2_3_1 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1317:1: ( ( rule__Node__HrefAssignment_3_2_3_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1318:1: ( rule__Node__HrefAssignment_3_2_3_1 )
            {
             before(grammarAccess.getNodeAccess().getHrefAssignment_3_2_3_1()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1319:1: ( rule__Node__HrefAssignment_3_2_3_1 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1319:2: rule__Node__HrefAssignment_3_2_3_1
            {
            pushFollow(FOLLOW_rule__Node__HrefAssignment_3_2_3_1_in_rule__Node__Group_3_2_3__1__Impl2679);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1333:1: rule__Phenomenon__Group__0 : rule__Phenomenon__Group__0__Impl rule__Phenomenon__Group__1 ;
    public final void rule__Phenomenon__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1337:1: ( rule__Phenomenon__Group__0__Impl rule__Phenomenon__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1338:2: rule__Phenomenon__Group__0__Impl rule__Phenomenon__Group__1
            {
            pushFollow(FOLLOW_rule__Phenomenon__Group__0__Impl_in_rule__Phenomenon__Group__02713);
            rule__Phenomenon__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Phenomenon__Group__1_in_rule__Phenomenon__Group__02716);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1345:1: rule__Phenomenon__Group__0__Impl : ( ( rule__Phenomenon__TypeAssignment_0 )? ) ;
    public final void rule__Phenomenon__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1349:1: ( ( ( rule__Phenomenon__TypeAssignment_0 )? ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1350:1: ( ( rule__Phenomenon__TypeAssignment_0 )? )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1350:1: ( ( rule__Phenomenon__TypeAssignment_0 )? )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1351:1: ( rule__Phenomenon__TypeAssignment_0 )?
            {
             before(grammarAccess.getPhenomenonAccess().getTypeAssignment_0()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1352:1: ( rule__Phenomenon__TypeAssignment_0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=20 && LA16_0<=22)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1352:2: rule__Phenomenon__TypeAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Phenomenon__TypeAssignment_0_in_rule__Phenomenon__Group__0__Impl2743);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1362:1: rule__Phenomenon__Group__1 : rule__Phenomenon__Group__1__Impl rule__Phenomenon__Group__2 ;
    public final void rule__Phenomenon__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1366:1: ( rule__Phenomenon__Group__1__Impl rule__Phenomenon__Group__2 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1367:2: rule__Phenomenon__Group__1__Impl rule__Phenomenon__Group__2
            {
            pushFollow(FOLLOW_rule__Phenomenon__Group__1__Impl_in_rule__Phenomenon__Group__12774);
            rule__Phenomenon__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Phenomenon__Group__2_in_rule__Phenomenon__Group__12777);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1374:1: rule__Phenomenon__Group__1__Impl : ( ( rule__Phenomenon__IsControlledAssignment_1 )? ) ;
    public final void rule__Phenomenon__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1378:1: ( ( ( rule__Phenomenon__IsControlledAssignment_1 )? ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1379:1: ( ( rule__Phenomenon__IsControlledAssignment_1 )? )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1379:1: ( ( rule__Phenomenon__IsControlledAssignment_1 )? )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1380:1: ( rule__Phenomenon__IsControlledAssignment_1 )?
            {
             before(grammarAccess.getPhenomenonAccess().getIsControlledAssignment_1()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1381:1: ( rule__Phenomenon__IsControlledAssignment_1 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==36) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1381:2: rule__Phenomenon__IsControlledAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Phenomenon__IsControlledAssignment_1_in_rule__Phenomenon__Group__1__Impl2804);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1391:1: rule__Phenomenon__Group__2 : rule__Phenomenon__Group__2__Impl rule__Phenomenon__Group__3 ;
    public final void rule__Phenomenon__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1395:1: ( rule__Phenomenon__Group__2__Impl rule__Phenomenon__Group__3 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1396:2: rule__Phenomenon__Group__2__Impl rule__Phenomenon__Group__3
            {
            pushFollow(FOLLOW_rule__Phenomenon__Group__2__Impl_in_rule__Phenomenon__Group__22835);
            rule__Phenomenon__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Phenomenon__Group__3_in_rule__Phenomenon__Group__22838);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1403:1: rule__Phenomenon__Group__2__Impl : ( ( rule__Phenomenon__NameAssignment_2 ) ) ;
    public final void rule__Phenomenon__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1407:1: ( ( ( rule__Phenomenon__NameAssignment_2 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1408:1: ( ( rule__Phenomenon__NameAssignment_2 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1408:1: ( ( rule__Phenomenon__NameAssignment_2 ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1409:1: ( rule__Phenomenon__NameAssignment_2 )
            {
             before(grammarAccess.getPhenomenonAccess().getNameAssignment_2()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1410:1: ( rule__Phenomenon__NameAssignment_2 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1410:2: rule__Phenomenon__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Phenomenon__NameAssignment_2_in_rule__Phenomenon__Group__2__Impl2865);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1420:1: rule__Phenomenon__Group__3 : rule__Phenomenon__Group__3__Impl ;
    public final void rule__Phenomenon__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1424:1: ( rule__Phenomenon__Group__3__Impl )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1425:2: rule__Phenomenon__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Phenomenon__Group__3__Impl_in_rule__Phenomenon__Group__32895);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1431:1: rule__Phenomenon__Group__3__Impl : ( ( rule__Phenomenon__Group_3__0 )? ) ;
    public final void rule__Phenomenon__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1435:1: ( ( ( rule__Phenomenon__Group_3__0 )? ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1436:1: ( ( rule__Phenomenon__Group_3__0 )? )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1436:1: ( ( rule__Phenomenon__Group_3__0 )? )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1437:1: ( rule__Phenomenon__Group_3__0 )?
            {
             before(grammarAccess.getPhenomenonAccess().getGroup_3()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1438:1: ( rule__Phenomenon__Group_3__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_STRING||LA18_0==29) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1438:2: rule__Phenomenon__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Phenomenon__Group_3__0_in_rule__Phenomenon__Group__3__Impl2922);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1456:1: rule__Phenomenon__Group_3__0 : rule__Phenomenon__Group_3__0__Impl rule__Phenomenon__Group_3__1 ;
    public final void rule__Phenomenon__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1460:1: ( rule__Phenomenon__Group_3__0__Impl rule__Phenomenon__Group_3__1 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1461:2: rule__Phenomenon__Group_3__0__Impl rule__Phenomenon__Group_3__1
            {
            pushFollow(FOLLOW_rule__Phenomenon__Group_3__0__Impl_in_rule__Phenomenon__Group_3__02961);
            rule__Phenomenon__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Phenomenon__Group_3__1_in_rule__Phenomenon__Group_3__02964);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1468:1: rule__Phenomenon__Group_3__0__Impl : ( ( ':' )? ) ;
    public final void rule__Phenomenon__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1472:1: ( ( ( ':' )? ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1473:1: ( ( ':' )? )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1473:1: ( ( ':' )? )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1474:1: ( ':' )?
            {
             before(grammarAccess.getPhenomenonAccess().getColonKeyword_3_0()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1475:1: ( ':' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==29) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1476:2: ':'
                    {
                    match(input,29,FOLLOW_29_in_rule__Phenomenon__Group_3__0__Impl2993); 

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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1487:1: rule__Phenomenon__Group_3__1 : rule__Phenomenon__Group_3__1__Impl ;
    public final void rule__Phenomenon__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1491:1: ( rule__Phenomenon__Group_3__1__Impl )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1492:2: rule__Phenomenon__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Phenomenon__Group_3__1__Impl_in_rule__Phenomenon__Group_3__13026);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1498:1: rule__Phenomenon__Group_3__1__Impl : ( ( rule__Phenomenon__DescriptionAssignment_3_1 ) ) ;
    public final void rule__Phenomenon__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1502:1: ( ( ( rule__Phenomenon__DescriptionAssignment_3_1 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1503:1: ( ( rule__Phenomenon__DescriptionAssignment_3_1 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1503:1: ( ( rule__Phenomenon__DescriptionAssignment_3_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1504:1: ( rule__Phenomenon__DescriptionAssignment_3_1 )
            {
             before(grammarAccess.getPhenomenonAccess().getDescriptionAssignment_3_1()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1505:1: ( rule__Phenomenon__DescriptionAssignment_3_1 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1505:2: rule__Phenomenon__DescriptionAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Phenomenon__DescriptionAssignment_3_1_in_rule__Phenomenon__Group_3__1__Impl3053);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1519:1: rule__Link__Group__0 : rule__Link__Group__0__Impl rule__Link__Group__1 ;
    public final void rule__Link__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1523:1: ( rule__Link__Group__0__Impl rule__Link__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1524:2: rule__Link__Group__0__Impl rule__Link__Group__1
            {
            pushFollow(FOLLOW_rule__Link__Group__0__Impl_in_rule__Link__Group__03087);
            rule__Link__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Link__Group__1_in_rule__Link__Group__03090);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1531:1: rule__Link__Group__0__Impl : ( ( rule__Link__FromAssignment_0 ) ) ;
    public final void rule__Link__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1535:1: ( ( ( rule__Link__FromAssignment_0 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1536:1: ( ( rule__Link__FromAssignment_0 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1536:1: ( ( rule__Link__FromAssignment_0 ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1537:1: ( rule__Link__FromAssignment_0 )
            {
             before(grammarAccess.getLinkAccess().getFromAssignment_0()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1538:1: ( rule__Link__FromAssignment_0 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1538:2: rule__Link__FromAssignment_0
            {
            pushFollow(FOLLOW_rule__Link__FromAssignment_0_in_rule__Link__Group__0__Impl3117);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1548:1: rule__Link__Group__1 : rule__Link__Group__1__Impl rule__Link__Group__2 ;
    public final void rule__Link__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1552:1: ( rule__Link__Group__1__Impl rule__Link__Group__2 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1553:2: rule__Link__Group__1__Impl rule__Link__Group__2
            {
            pushFollow(FOLLOW_rule__Link__Group__1__Impl_in_rule__Link__Group__13147);
            rule__Link__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Link__Group__2_in_rule__Link__Group__13150);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1560:1: rule__Link__Group__1__Impl : ( ( rule__Link__TypeAssignment_1 ) ) ;
    public final void rule__Link__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1564:1: ( ( ( rule__Link__TypeAssignment_1 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1565:1: ( ( rule__Link__TypeAssignment_1 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1565:1: ( ( rule__Link__TypeAssignment_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1566:1: ( rule__Link__TypeAssignment_1 )
            {
             before(grammarAccess.getLinkAccess().getTypeAssignment_1()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1567:1: ( rule__Link__TypeAssignment_1 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1567:2: rule__Link__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Link__TypeAssignment_1_in_rule__Link__Group__1__Impl3177);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1577:1: rule__Link__Group__2 : rule__Link__Group__2__Impl rule__Link__Group__3 ;
    public final void rule__Link__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1581:1: ( rule__Link__Group__2__Impl rule__Link__Group__3 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1582:2: rule__Link__Group__2__Impl rule__Link__Group__3
            {
            pushFollow(FOLLOW_rule__Link__Group__2__Impl_in_rule__Link__Group__23207);
            rule__Link__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Link__Group__3_in_rule__Link__Group__23210);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1589:1: rule__Link__Group__2__Impl : ( ( rule__Link__ToAssignment_2 ) ) ;
    public final void rule__Link__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1593:1: ( ( ( rule__Link__ToAssignment_2 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1594:1: ( ( rule__Link__ToAssignment_2 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1594:1: ( ( rule__Link__ToAssignment_2 ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1595:1: ( rule__Link__ToAssignment_2 )
            {
             before(grammarAccess.getLinkAccess().getToAssignment_2()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1596:1: ( rule__Link__ToAssignment_2 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1596:2: rule__Link__ToAssignment_2
            {
            pushFollow(FOLLOW_rule__Link__ToAssignment_2_in_rule__Link__Group__2__Impl3237);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1606:1: rule__Link__Group__3 : rule__Link__Group__3__Impl rule__Link__Group__4 ;
    public final void rule__Link__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1610:1: ( rule__Link__Group__3__Impl rule__Link__Group__4 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1611:2: rule__Link__Group__3__Impl rule__Link__Group__4
            {
            pushFollow(FOLLOW_rule__Link__Group__3__Impl_in_rule__Link__Group__33267);
            rule__Link__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Link__Group__4_in_rule__Link__Group__33270);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1618:1: rule__Link__Group__3__Impl : ( ( rule__Link__Group_3__0 )? ) ;
    public final void rule__Link__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1622:1: ( ( ( rule__Link__Group_3__0 )? ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1623:1: ( ( rule__Link__Group_3__0 )? )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1623:1: ( ( rule__Link__Group_3__0 )? )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1624:1: ( rule__Link__Group_3__0 )?
            {
             before(grammarAccess.getLinkAccess().getGroup_3()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1625:1: ( rule__Link__Group_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==30) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1625:2: rule__Link__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Link__Group_3__0_in_rule__Link__Group__3__Impl3297);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1635:1: rule__Link__Group__4 : rule__Link__Group__4__Impl ;
    public final void rule__Link__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1639:1: ( rule__Link__Group__4__Impl )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1640:2: rule__Link__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Link__Group__4__Impl_in_rule__Link__Group__43328);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1646:1: rule__Link__Group__4__Impl : ( ( rule__Link__Group_4__0 )? ) ;
    public final void rule__Link__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1650:1: ( ( ( rule__Link__Group_4__0 )? ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1651:1: ( ( rule__Link__Group_4__0 )? )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1651:1: ( ( rule__Link__Group_4__0 )? )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1652:1: ( rule__Link__Group_4__0 )?
            {
             before(grammarAccess.getLinkAccess().getGroup_4()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1653:1: ( rule__Link__Group_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_STRING||LA21_0==29) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1653:2: rule__Link__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Link__Group_4__0_in_rule__Link__Group__4__Impl3355);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1673:1: rule__Link__Group_3__0 : rule__Link__Group_3__0__Impl rule__Link__Group_3__1 ;
    public final void rule__Link__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1677:1: ( rule__Link__Group_3__0__Impl rule__Link__Group_3__1 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1678:2: rule__Link__Group_3__0__Impl rule__Link__Group_3__1
            {
            pushFollow(FOLLOW_rule__Link__Group_3__0__Impl_in_rule__Link__Group_3__03396);
            rule__Link__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Link__Group_3__1_in_rule__Link__Group_3__03399);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1685:1: rule__Link__Group_3__0__Impl : ( '{' ) ;
    public final void rule__Link__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1689:1: ( ( '{' ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1690:1: ( '{' )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1690:1: ( '{' )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1691:1: '{'
            {
             before(grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,30,FOLLOW_30_in_rule__Link__Group_3__0__Impl3427); 
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1704:1: rule__Link__Group_3__1 : rule__Link__Group_3__1__Impl rule__Link__Group_3__2 ;
    public final void rule__Link__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1708:1: ( rule__Link__Group_3__1__Impl rule__Link__Group_3__2 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1709:2: rule__Link__Group_3__1__Impl rule__Link__Group_3__2
            {
            pushFollow(FOLLOW_rule__Link__Group_3__1__Impl_in_rule__Link__Group_3__13458);
            rule__Link__Group_3__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Link__Group_3__2_in_rule__Link__Group_3__13461);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1716:1: rule__Link__Group_3__1__Impl : ( ( rule__Link__PhenomenaAssignment_3_1 ) ) ;
    public final void rule__Link__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1720:1: ( ( ( rule__Link__PhenomenaAssignment_3_1 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1721:1: ( ( rule__Link__PhenomenaAssignment_3_1 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1721:1: ( ( rule__Link__PhenomenaAssignment_3_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1722:1: ( rule__Link__PhenomenaAssignment_3_1 )
            {
             before(grammarAccess.getLinkAccess().getPhenomenaAssignment_3_1()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1723:1: ( rule__Link__PhenomenaAssignment_3_1 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1723:2: rule__Link__PhenomenaAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Link__PhenomenaAssignment_3_1_in_rule__Link__Group_3__1__Impl3488);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1733:1: rule__Link__Group_3__2 : rule__Link__Group_3__2__Impl rule__Link__Group_3__3 ;
    public final void rule__Link__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1737:1: ( rule__Link__Group_3__2__Impl rule__Link__Group_3__3 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1738:2: rule__Link__Group_3__2__Impl rule__Link__Group_3__3
            {
            pushFollow(FOLLOW_rule__Link__Group_3__2__Impl_in_rule__Link__Group_3__23518);
            rule__Link__Group_3__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Link__Group_3__3_in_rule__Link__Group_3__23521);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1745:1: rule__Link__Group_3__2__Impl : ( ( rule__Link__Group_3_2__0 )* ) ;
    public final void rule__Link__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1749:1: ( ( ( rule__Link__Group_3_2__0 )* ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1750:1: ( ( rule__Link__Group_3_2__0 )* )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1750:1: ( ( rule__Link__Group_3_2__0 )* )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1751:1: ( rule__Link__Group_3_2__0 )*
            {
             before(grammarAccess.getLinkAccess().getGroup_3_2()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1752:1: ( rule__Link__Group_3_2__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==32) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1752:2: rule__Link__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Link__Group_3_2__0_in_rule__Link__Group_3__2__Impl3548);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1762:1: rule__Link__Group_3__3 : rule__Link__Group_3__3__Impl ;
    public final void rule__Link__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1766:1: ( rule__Link__Group_3__3__Impl )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1767:2: rule__Link__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__Link__Group_3__3__Impl_in_rule__Link__Group_3__33579);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1773:1: rule__Link__Group_3__3__Impl : ( '}' ) ;
    public final void rule__Link__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1777:1: ( ( '}' ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1778:1: ( '}' )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1778:1: ( '}' )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1779:1: '}'
            {
             before(grammarAccess.getLinkAccess().getRightCurlyBracketKeyword_3_3()); 
            match(input,31,FOLLOW_31_in_rule__Link__Group_3__3__Impl3607); 
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1800:1: rule__Link__Group_3_2__0 : rule__Link__Group_3_2__0__Impl rule__Link__Group_3_2__1 ;
    public final void rule__Link__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1804:1: ( rule__Link__Group_3_2__0__Impl rule__Link__Group_3_2__1 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1805:2: rule__Link__Group_3_2__0__Impl rule__Link__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__Link__Group_3_2__0__Impl_in_rule__Link__Group_3_2__03646);
            rule__Link__Group_3_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Link__Group_3_2__1_in_rule__Link__Group_3_2__03649);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1812:1: rule__Link__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__Link__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1816:1: ( ( ',' ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1817:1: ( ',' )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1817:1: ( ',' )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1818:1: ','
            {
             before(grammarAccess.getLinkAccess().getCommaKeyword_3_2_0()); 
            match(input,32,FOLLOW_32_in_rule__Link__Group_3_2__0__Impl3677); 
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1831:1: rule__Link__Group_3_2__1 : rule__Link__Group_3_2__1__Impl ;
    public final void rule__Link__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1835:1: ( rule__Link__Group_3_2__1__Impl )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1836:2: rule__Link__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Link__Group_3_2__1__Impl_in_rule__Link__Group_3_2__13708);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1842:1: rule__Link__Group_3_2__1__Impl : ( ( rule__Link__PhenomenaAssignment_3_2_1 ) ) ;
    public final void rule__Link__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1846:1: ( ( ( rule__Link__PhenomenaAssignment_3_2_1 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1847:1: ( ( rule__Link__PhenomenaAssignment_3_2_1 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1847:1: ( ( rule__Link__PhenomenaAssignment_3_2_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1848:1: ( rule__Link__PhenomenaAssignment_3_2_1 )
            {
             before(grammarAccess.getLinkAccess().getPhenomenaAssignment_3_2_1()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1849:1: ( rule__Link__PhenomenaAssignment_3_2_1 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1849:2: rule__Link__PhenomenaAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__Link__PhenomenaAssignment_3_2_1_in_rule__Link__Group_3_2__1__Impl3735);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1863:1: rule__Link__Group_4__0 : rule__Link__Group_4__0__Impl rule__Link__Group_4__1 ;
    public final void rule__Link__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1867:1: ( rule__Link__Group_4__0__Impl rule__Link__Group_4__1 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1868:2: rule__Link__Group_4__0__Impl rule__Link__Group_4__1
            {
            pushFollow(FOLLOW_rule__Link__Group_4__0__Impl_in_rule__Link__Group_4__03769);
            rule__Link__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Link__Group_4__1_in_rule__Link__Group_4__03772);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1875:1: rule__Link__Group_4__0__Impl : ( ( ':' )? ) ;
    public final void rule__Link__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1879:1: ( ( ( ':' )? ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1880:1: ( ( ':' )? )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1880:1: ( ( ':' )? )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1881:1: ( ':' )?
            {
             before(grammarAccess.getLinkAccess().getColonKeyword_4_0()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1882:1: ( ':' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==29) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1883:2: ':'
                    {
                    match(input,29,FOLLOW_29_in_rule__Link__Group_4__0__Impl3801); 

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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1894:1: rule__Link__Group_4__1 : rule__Link__Group_4__1__Impl ;
    public final void rule__Link__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1898:1: ( rule__Link__Group_4__1__Impl )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1899:2: rule__Link__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Link__Group_4__1__Impl_in_rule__Link__Group_4__13834);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1905:1: rule__Link__Group_4__1__Impl : ( ( rule__Link__DescriptionAssignment_4_1 ) ) ;
    public final void rule__Link__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1909:1: ( ( ( rule__Link__DescriptionAssignment_4_1 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1910:1: ( ( rule__Link__DescriptionAssignment_4_1 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1910:1: ( ( rule__Link__DescriptionAssignment_4_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1911:1: ( rule__Link__DescriptionAssignment_4_1 )
            {
             before(grammarAccess.getLinkAccess().getDescriptionAssignment_4_1()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1912:1: ( rule__Link__DescriptionAssignment_4_1 )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1912:2: rule__Link__DescriptionAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Link__DescriptionAssignment_4_1_in_rule__Link__Group_4__1__Impl3861);
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


    // $ANTLR start rule__ProblemDiagram__NameAssignment_0_1
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1927:1: rule__ProblemDiagram__NameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__ProblemDiagram__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1931:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1932:1: ( RULE_ID )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1932:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1933:1: RULE_ID
            {
             before(grammarAccess.getProblemDiagramAccess().getNameIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ProblemDiagram__NameAssignment_0_13900); 
             after(grammarAccess.getProblemDiagramAccess().getNameIDTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProblemDiagram__NameAssignment_0_1


    // $ANTLR start rule__ProblemDiagram__HighlightAssignment_1_1
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1942:1: rule__ProblemDiagram__HighlightAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__ProblemDiagram__HighlightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1946:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1947:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1947:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1948:1: ( RULE_ID )
            {
             before(grammarAccess.getProblemDiagramAccess().getHighlightNodeCrossReference_1_1_0()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1949:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1950:1: RULE_ID
            {
             before(grammarAccess.getProblemDiagramAccess().getHighlightNodeIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ProblemDiagram__HighlightAssignment_1_13935); 
             after(grammarAccess.getProblemDiagramAccess().getHighlightNodeIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getProblemDiagramAccess().getHighlightNodeCrossReference_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProblemDiagram__HighlightAssignment_1_1


    // $ANTLR start rule__ProblemDiagram__NodesAssignment_2_0
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1961:1: rule__ProblemDiagram__NodesAssignment_2_0 : ( ruleNode ) ;
    public final void rule__ProblemDiagram__NodesAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1965:1: ( ( ruleNode ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1966:1: ( ruleNode )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1966:1: ( ruleNode )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1967:1: ruleNode
            {
             before(grammarAccess.getProblemDiagramAccess().getNodesNodeParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleNode_in_rule__ProblemDiagram__NodesAssignment_2_03970);
            ruleNode();
            _fsp--;

             after(grammarAccess.getProblemDiagramAccess().getNodesNodeParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProblemDiagram__NodesAssignment_2_0


    // $ANTLR start rule__ProblemDiagram__LinksAssignment_2_1
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1976:1: rule__ProblemDiagram__LinksAssignment_2_1 : ( ruleLink ) ;
    public final void rule__ProblemDiagram__LinksAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1980:1: ( ( ruleLink ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1981:1: ( ruleLink )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1981:1: ( ruleLink )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1982:1: ruleLink
            {
             before(grammarAccess.getProblemDiagramAccess().getLinksLinkParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleLink_in_rule__ProblemDiagram__LinksAssignment_2_14001);
            ruleLink();
            _fsp--;

             after(grammarAccess.getProblemDiagramAccess().getLinksLinkParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ProblemDiagram__LinksAssignment_2_1


    // $ANTLR start rule__Node__NameAssignment_0
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1991:1: rule__Node__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Node__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1995:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1996:1: ( RULE_ID )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1996:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1997:1: RULE_ID
            {
             before(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Node__NameAssignment_04032); 
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2006:1: rule__Node__TypeAssignment_1 : ( ruleNodeType ) ;
    public final void rule__Node__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2010:1: ( ( ruleNodeType ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2011:1: ( ruleNodeType )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2011:1: ( ruleNodeType )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2012:1: ruleNodeType
            {
             before(grammarAccess.getNodeAccess().getTypeNodeTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleNodeType_in_rule__Node__TypeAssignment_14063);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2021:1: rule__Node__DescriptionAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Node__DescriptionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2025:1: ( ( RULE_STRING ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2026:1: ( RULE_STRING )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2026:1: ( RULE_STRING )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2027:1: RULE_STRING
            {
             before(grammarAccess.getNodeAccess().getDescriptionSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Node__DescriptionAssignment_2_14094); 
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2036:1: rule__Node__HiddenPhenomenaAssignment_3_1_0 : ( rulePhenomenon ) ;
    public final void rule__Node__HiddenPhenomenaAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2040:1: ( ( rulePhenomenon ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2041:1: ( rulePhenomenon )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2041:1: ( rulePhenomenon )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2042:1: rulePhenomenon
            {
             before(grammarAccess.getNodeAccess().getHiddenPhenomenaPhenomenonParserRuleCall_3_1_0_0()); 
            pushFollow(FOLLOW_rulePhenomenon_in_rule__Node__HiddenPhenomenaAssignment_3_1_04125);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2051:1: rule__Node__HiddenPhenomenaAssignment_3_1_1_1 : ( rulePhenomenon ) ;
    public final void rule__Node__HiddenPhenomenaAssignment_3_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2055:1: ( ( rulePhenomenon ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2056:1: ( rulePhenomenon )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2056:1: ( rulePhenomenon )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2057:1: rulePhenomenon
            {
             before(grammarAccess.getNodeAccess().getHiddenPhenomenaPhenomenonParserRuleCall_3_1_1_1_0()); 
            pushFollow(FOLLOW_rulePhenomenon_in_rule__Node__HiddenPhenomenaAssignment_3_1_1_14156);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2066:1: rule__Node__SubproblemAssignment_3_2_0 : ( ruleProblemDiagram ) ;
    public final void rule__Node__SubproblemAssignment_3_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2070:1: ( ( ruleProblemDiagram ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2071:1: ( ruleProblemDiagram )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2071:1: ( ruleProblemDiagram )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2072:1: ruleProblemDiagram
            {
             before(grammarAccess.getNodeAccess().getSubproblemProblemDiagramParserRuleCall_3_2_0_0()); 
            pushFollow(FOLLOW_ruleProblemDiagram_in_rule__Node__SubproblemAssignment_3_2_04187);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2081:1: rule__Node__ProblemNodeRefAssignment_3_2_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__Node__ProblemNodeRefAssignment_3_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2085:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2086:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2086:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2087:1: ( RULE_ID )
            {
             before(grammarAccess.getNodeAccess().getProblemNodeRefNodeCrossReference_3_2_1_2_0()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2088:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2089:1: RULE_ID
            {
             before(grammarAccess.getNodeAccess().getProblemNodeRefNodeIDTerminalRuleCall_3_2_1_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Node__ProblemNodeRefAssignment_3_2_1_24222); 
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2100:1: rule__Node__ProblemRefAssignment_3_2_2_2 : ( ( RULE_ID ) ) ;
    public final void rule__Node__ProblemRefAssignment_3_2_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2104:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2105:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2105:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2106:1: ( RULE_ID )
            {
             before(grammarAccess.getNodeAccess().getProblemRefProblemDiagramCrossReference_3_2_2_2_0()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2107:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2108:1: RULE_ID
            {
             before(grammarAccess.getNodeAccess().getProblemRefProblemDiagramIDTerminalRuleCall_3_2_2_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Node__ProblemRefAssignment_3_2_2_24261); 
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2119:1: rule__Node__HrefAssignment_3_2_3_1 : ( RULE_STRING ) ;
    public final void rule__Node__HrefAssignment_3_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2123:1: ( ( RULE_STRING ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2124:1: ( RULE_STRING )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2124:1: ( RULE_STRING )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2125:1: RULE_STRING
            {
             before(grammarAccess.getNodeAccess().getHrefSTRINGTerminalRuleCall_3_2_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Node__HrefAssignment_3_2_3_14296); 
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2134:1: rule__Phenomenon__TypeAssignment_0 : ( rulePhenomenonType ) ;
    public final void rule__Phenomenon__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2138:1: ( ( rulePhenomenonType ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2139:1: ( rulePhenomenonType )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2139:1: ( rulePhenomenonType )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2140:1: rulePhenomenonType
            {
             before(grammarAccess.getPhenomenonAccess().getTypePhenomenonTypeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_rulePhenomenonType_in_rule__Phenomenon__TypeAssignment_04327);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2149:1: rule__Phenomenon__IsControlledAssignment_1 : ( ( '!' ) ) ;
    public final void rule__Phenomenon__IsControlledAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2153:1: ( ( ( '!' ) ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2154:1: ( ( '!' ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2154:1: ( ( '!' ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2155:1: ( '!' )
            {
             before(grammarAccess.getPhenomenonAccess().getIsControlledExclamationMarkKeyword_1_0()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2156:1: ( '!' )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2157:1: '!'
            {
             before(grammarAccess.getPhenomenonAccess().getIsControlledExclamationMarkKeyword_1_0()); 
            match(input,36,FOLLOW_36_in_rule__Phenomenon__IsControlledAssignment_14363); 
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2172:1: rule__Phenomenon__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Phenomenon__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2176:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2177:1: ( RULE_ID )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2177:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2178:1: RULE_ID
            {
             before(grammarAccess.getPhenomenonAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Phenomenon__NameAssignment_24402); 
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2187:1: rule__Phenomenon__DescriptionAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Phenomenon__DescriptionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2191:1: ( ( RULE_STRING ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2192:1: ( RULE_STRING )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2192:1: ( RULE_STRING )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2193:1: RULE_STRING
            {
             before(grammarAccess.getPhenomenonAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Phenomenon__DescriptionAssignment_3_14433); 
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2202:1: rule__Link__FromAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Link__FromAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2206:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2207:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2207:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2208:1: ( RULE_ID )
            {
             before(grammarAccess.getLinkAccess().getFromNodeCrossReference_0_0()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2209:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2210:1: RULE_ID
            {
             before(grammarAccess.getLinkAccess().getFromNodeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Link__FromAssignment_04468); 
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2221:1: rule__Link__TypeAssignment_1 : ( ruleLinkType ) ;
    public final void rule__Link__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2225:1: ( ( ruleLinkType ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2226:1: ( ruleLinkType )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2226:1: ( ruleLinkType )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2227:1: ruleLinkType
            {
             before(grammarAccess.getLinkAccess().getTypeLinkTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleLinkType_in_rule__Link__TypeAssignment_14503);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2236:1: rule__Link__ToAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Link__ToAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2240:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2241:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2241:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2242:1: ( RULE_ID )
            {
             before(grammarAccess.getLinkAccess().getToNodeCrossReference_2_0()); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2243:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2244:1: RULE_ID
            {
             before(grammarAccess.getLinkAccess().getToNodeIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Link__ToAssignment_24538); 
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2255:1: rule__Link__PhenomenaAssignment_3_1 : ( rulePhenomenon ) ;
    public final void rule__Link__PhenomenaAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2259:1: ( ( rulePhenomenon ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2260:1: ( rulePhenomenon )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2260:1: ( rulePhenomenon )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2261:1: rulePhenomenon
            {
             before(grammarAccess.getLinkAccess().getPhenomenaPhenomenonParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_rulePhenomenon_in_rule__Link__PhenomenaAssignment_3_14573);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2270:1: rule__Link__PhenomenaAssignment_3_2_1 : ( rulePhenomenon ) ;
    public final void rule__Link__PhenomenaAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2274:1: ( ( rulePhenomenon ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2275:1: ( rulePhenomenon )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2275:1: ( rulePhenomenon )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2276:1: rulePhenomenon
            {
             before(grammarAccess.getLinkAccess().getPhenomenaPhenomenonParserRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_rulePhenomenon_in_rule__Link__PhenomenaAssignment_3_2_14604);
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
    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2285:1: rule__Link__DescriptionAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Link__DescriptionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2289:1: ( ( RULE_STRING ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2290:1: ( RULE_STRING )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2290:1: ( RULE_STRING )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2291:1: RULE_STRING
            {
             before(grammarAccess.getLinkAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Link__DescriptionAssignment_4_14635); 
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
    public static final BitSet FOLLOW_rule__ProblemDiagram__NodesAssignment_2_0_in_rule__ProblemDiagram__Alternatives_2418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__LinksAssignment_2_1_in_rule__ProblemDiagram__Alternatives_2436 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_19_in_rule__NodeType__Alternatives704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__PhenomenonType__Alternatives740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__PhenomenonType__Alternatives761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__PhenomenonType__Alternatives782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__LinkType__Alternatives818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__LinkType__Alternatives839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__LinkType__Alternatives860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__LinkType__Alternatives881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__Group__0__Impl_in_rule__ProblemDiagram__Group__0914 = new BitSet(new long[]{0x0000000010000012L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__Group__1_in_rule__ProblemDiagram__Group__0917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__Group_0__0_in_rule__ProblemDiagram__Group__0__Impl944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__Group__1__Impl_in_rule__ProblemDiagram__Group__1975 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__Group__2_in_rule__ProblemDiagram__Group__1978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__Group_1__0_in_rule__ProblemDiagram__Group__1__Impl1005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__Group__2__Impl_in_rule__ProblemDiagram__Group__21036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__Alternatives_2_in_rule__ProblemDiagram__Group__2__Impl1063 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__Group_0__0__Impl_in_rule__ProblemDiagram__Group_0__01100 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__Group_0__1_in_rule__ProblemDiagram__Group_0__01103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ProblemDiagram__Group_0__0__Impl1131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__Group_0__1__Impl_in_rule__ProblemDiagram__Group_0__11162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__NameAssignment_0_1_in_rule__ProblemDiagram__Group_0__1__Impl1189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__Group_1__0__Impl_in_rule__ProblemDiagram__Group_1__01223 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__Group_1__1_in_rule__ProblemDiagram__Group_1__01226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ProblemDiagram__Group_1__0__Impl1254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__Group_1__1__Impl_in_rule__ProblemDiagram__Group_1__11285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__HighlightAssignment_1_1_in_rule__ProblemDiagram__Group_1__1__Impl1312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__0__Impl_in_rule__Node__Group__01346 = new BitSet(new long[]{0x00000000600FF022L});
    public static final BitSet FOLLOW_rule__Node__Group__1_in_rule__Node__Group__01349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__NameAssignment_0_in_rule__Node__Group__0__Impl1376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__1__Impl_in_rule__Node__Group__11406 = new BitSet(new long[]{0x0000000060000022L});
    public static final BitSet FOLLOW_rule__Node__Group__2_in_rule__Node__Group__11409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__TypeAssignment_1_in_rule__Node__Group__1__Impl1436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__2__Impl_in_rule__Node__Group__21467 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__Node__Group__3_in_rule__Node__Group__21470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_2__0_in_rule__Node__Group__2__Impl1497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__3__Impl_in_rule__Node__Group__31528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3__0_in_rule__Node__Group__3__Impl1555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_2__0__Impl_in_rule__Node__Group_2__01594 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Node__Group_2__1_in_rule__Node__Group_2__01597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Node__Group_2__0__Impl1626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_2__1__Impl_in_rule__Node__Group_2__11659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__DescriptionAssignment_2_1_in_rule__Node__Group_2__1__Impl1686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3__0__Impl_in_rule__Node__Group_3__01720 = new BitSet(new long[]{0x0000001298700010L});
    public static final BitSet FOLLOW_rule__Node__Group_3__1_in_rule__Node__Group_3__01723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Node__Group_3__0__Impl1751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3__1__Impl_in_rule__Node__Group_3__11782 = new BitSet(new long[]{0x0000000298000010L});
    public static final BitSet FOLLOW_rule__Node__Group_3__2_in_rule__Node__Group_3__11785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3_1__0_in_rule__Node__Group_3__1__Impl1812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3__2__Impl_in_rule__Node__Group_3__21843 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Node__Group_3__3_in_rule__Node__Group_3__21846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Alternatives_3_2_in_rule__Node__Group_3__2__Impl1873 = new BitSet(new long[]{0x0000000218000012L});
    public static final BitSet FOLLOW_rule__Node__Group_3__3__Impl_in_rule__Node__Group_3__31904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Node__Group_3__3__Impl1932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3_1__0__Impl_in_rule__Node__Group_3_1__01971 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3_1__1_in_rule__Node__Group_3_1__01974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__HiddenPhenomenaAssignment_3_1_0_in_rule__Node__Group_3_1__0__Impl2001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3_1__1__Impl_in_rule__Node__Group_3_1__12031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3_1_1__0_in_rule__Node__Group_3_1__1__Impl2058 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3_1_1__0__Impl_in_rule__Node__Group_3_1_1__02093 = new BitSet(new long[]{0x0000001000700010L});
    public static final BitSet FOLLOW_rule__Node__Group_3_1_1__1_in_rule__Node__Group_3_1_1__02096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Node__Group_3_1_1__0__Impl2124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3_1_1__1__Impl_in_rule__Node__Group_3_1_1__12155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__HiddenPhenomenaAssignment_3_1_1_1_in_rule__Node__Group_3_1_1__1__Impl2182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3_2_1__0__Impl_in_rule__Node__Group_3_2_1__02216 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Node__Group_3_2_1__1_in_rule__Node__Group_3_2_1__02219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Node__Group_3_2_1__0__Impl2247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3_2_1__1__Impl_in_rule__Node__Group_3_2_1__12278 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Node__Group_3_2_1__2_in_rule__Node__Group_3_2_1__12281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Node__Group_3_2_1__1__Impl2309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3_2_1__2__Impl_in_rule__Node__Group_3_2_1__22340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__ProblemNodeRefAssignment_3_2_1_2_in_rule__Node__Group_3_2_1__2__Impl2367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3_2_2__0__Impl_in_rule__Node__Group_3_2_2__02403 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Node__Group_3_2_2__1_in_rule__Node__Group_3_2_2__02406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Node__Group_3_2_2__0__Impl2434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3_2_2__1__Impl_in_rule__Node__Group_3_2_2__12465 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Node__Group_3_2_2__2_in_rule__Node__Group_3_2_2__12468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Node__Group_3_2_2__1__Impl2496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3_2_2__2__Impl_in_rule__Node__Group_3_2_2__22527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__ProblemRefAssignment_3_2_2_2_in_rule__Node__Group_3_2_2__2__Impl2554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3_2_3__0__Impl_in_rule__Node__Group_3_2_3__02590 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Node__Group_3_2_3__1_in_rule__Node__Group_3_2_3__02593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Node__Group_3_2_3__0__Impl2621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3_2_3__1__Impl_in_rule__Node__Group_3_2_3__12652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__HrefAssignment_3_2_3_1_in_rule__Node__Group_3_2_3__1__Impl2679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Phenomenon__Group__0__Impl_in_rule__Phenomenon__Group__02713 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_rule__Phenomenon__Group__1_in_rule__Phenomenon__Group__02716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Phenomenon__TypeAssignment_0_in_rule__Phenomenon__Group__0__Impl2743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Phenomenon__Group__1__Impl_in_rule__Phenomenon__Group__12774 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Phenomenon__Group__2_in_rule__Phenomenon__Group__12777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Phenomenon__IsControlledAssignment_1_in_rule__Phenomenon__Group__1__Impl2804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Phenomenon__Group__2__Impl_in_rule__Phenomenon__Group__22835 = new BitSet(new long[]{0x0000000020000022L});
    public static final BitSet FOLLOW_rule__Phenomenon__Group__3_in_rule__Phenomenon__Group__22838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Phenomenon__NameAssignment_2_in_rule__Phenomenon__Group__2__Impl2865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Phenomenon__Group__3__Impl_in_rule__Phenomenon__Group__32895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Phenomenon__Group_3__0_in_rule__Phenomenon__Group__3__Impl2922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Phenomenon__Group_3__0__Impl_in_rule__Phenomenon__Group_3__02961 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Phenomenon__Group_3__1_in_rule__Phenomenon__Group_3__02964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Phenomenon__Group_3__0__Impl2993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Phenomenon__Group_3__1__Impl_in_rule__Phenomenon__Group_3__13026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Phenomenon__DescriptionAssignment_3_1_in_rule__Phenomenon__Group_3__1__Impl3053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group__0__Impl_in_rule__Link__Group__03087 = new BitSet(new long[]{0x0000000007800000L});
    public static final BitSet FOLLOW_rule__Link__Group__1_in_rule__Link__Group__03090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__FromAssignment_0_in_rule__Link__Group__0__Impl3117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group__1__Impl_in_rule__Link__Group__13147 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Link__Group__2_in_rule__Link__Group__13150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__TypeAssignment_1_in_rule__Link__Group__1__Impl3177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group__2__Impl_in_rule__Link__Group__23207 = new BitSet(new long[]{0x0000000060000022L});
    public static final BitSet FOLLOW_rule__Link__Group__3_in_rule__Link__Group__23210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__ToAssignment_2_in_rule__Link__Group__2__Impl3237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group__3__Impl_in_rule__Link__Group__33267 = new BitSet(new long[]{0x0000000020000022L});
    public static final BitSet FOLLOW_rule__Link__Group__4_in_rule__Link__Group__33270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group_3__0_in_rule__Link__Group__3__Impl3297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group__4__Impl_in_rule__Link__Group__43328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group_4__0_in_rule__Link__Group__4__Impl3355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group_3__0__Impl_in_rule__Link__Group_3__03396 = new BitSet(new long[]{0x0000001000700010L});
    public static final BitSet FOLLOW_rule__Link__Group_3__1_in_rule__Link__Group_3__03399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Link__Group_3__0__Impl3427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group_3__1__Impl_in_rule__Link__Group_3__13458 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_rule__Link__Group_3__2_in_rule__Link__Group_3__13461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__PhenomenaAssignment_3_1_in_rule__Link__Group_3__1__Impl3488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group_3__2__Impl_in_rule__Link__Group_3__23518 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Link__Group_3__3_in_rule__Link__Group_3__23521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group_3_2__0_in_rule__Link__Group_3__2__Impl3548 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__Link__Group_3__3__Impl_in_rule__Link__Group_3__33579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Link__Group_3__3__Impl3607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group_3_2__0__Impl_in_rule__Link__Group_3_2__03646 = new BitSet(new long[]{0x0000001000700010L});
    public static final BitSet FOLLOW_rule__Link__Group_3_2__1_in_rule__Link__Group_3_2__03649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Link__Group_3_2__0__Impl3677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group_3_2__1__Impl_in_rule__Link__Group_3_2__13708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__PhenomenaAssignment_3_2_1_in_rule__Link__Group_3_2__1__Impl3735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group_4__0__Impl_in_rule__Link__Group_4__03769 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Link__Group_4__1_in_rule__Link__Group_4__03772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Link__Group_4__0__Impl3801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group_4__1__Impl_in_rule__Link__Group_4__13834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__DescriptionAssignment_4_1_in_rule__Link__Group_4__1__Impl3861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ProblemDiagram__NameAssignment_0_13900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ProblemDiagram__HighlightAssignment_1_13935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_rule__ProblemDiagram__NodesAssignment_2_03970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_rule__ProblemDiagram__LinksAssignment_2_14001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Node__NameAssignment_04032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeType_in_rule__Node__TypeAssignment_14063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Node__DescriptionAssignment_2_14094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhenomenon_in_rule__Node__HiddenPhenomenaAssignment_3_1_04125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhenomenon_in_rule__Node__HiddenPhenomenaAssignment_3_1_1_14156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProblemDiagram_in_rule__Node__SubproblemAssignment_3_2_04187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Node__ProblemNodeRefAssignment_3_2_1_24222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Node__ProblemRefAssignment_3_2_2_24261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Node__HrefAssignment_3_2_3_14296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhenomenonType_in_rule__Phenomenon__TypeAssignment_04327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Phenomenon__IsControlledAssignment_14363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Phenomenon__NameAssignment_24402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Phenomenon__DescriptionAssignment_3_14433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Link__FromAssignment_04468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkType_in_rule__Link__TypeAssignment_14503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Link__ToAssignment_24538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhenomenon_in_rule__Link__PhenomenaAssignment_3_14573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhenomenon_in_rule__Link__PhenomenaAssignment_3_2_14604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Link__DescriptionAssignment_4_14635 = new BitSet(new long[]{0x0000000000000002L});

}