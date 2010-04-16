package uk.ac.open.contentassist.antlr.internal; 

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
import uk.ac.open.services.ProblemGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalProblemParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'R'", "'M'", "'B'", "'X'", "'C'", "'D'", "'P'", "'phenomenon'", "'event'", "'state'", "'--'", "'~~'", "'~>'", "'problem'", "':'", "'{'", "'}'", "','", "'see'", "'domain'", "'!'"
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
    public String getGrammarFileName() { return "../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g"; }


     
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:60:1: entryRuleProblemDiagram : ruleProblemDiagram EOF ;
    public final void entryRuleProblemDiagram() throws RecognitionException {
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:60:25: ( ruleProblemDiagram EOF )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:61:1: ruleProblemDiagram EOF
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:68:1: ruleProblemDiagram : ( ( rule__ProblemDiagram__Group__0 ) ) ;
    public final void ruleProblemDiagram() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:72:2: ( ( ( rule__ProblemDiagram__Group__0 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:73:1: ( ( rule__ProblemDiagram__Group__0 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:73:1: ( ( rule__ProblemDiagram__Group__0 ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:74:1: ( rule__ProblemDiagram__Group__0 )
            {
             before(grammarAccess.getProblemDiagramAccess().getGroup()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:75:1: ( rule__ProblemDiagram__Group__0 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:75:2: rule__ProblemDiagram__Group__0
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:87:1: entryRuleNode : ruleNode EOF ;
    public final void entryRuleNode() throws RecognitionException {
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:87:15: ( ruleNode EOF )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:88:1: ruleNode EOF
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:95:1: ruleNode : ( ( rule__Node__Group__0 ) ) ;
    public final void ruleNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:99:2: ( ( ( rule__Node__Group__0 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:100:1: ( ( rule__Node__Group__0 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:100:1: ( ( rule__Node__Group__0 ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:101:1: ( rule__Node__Group__0 )
            {
             before(grammarAccess.getNodeAccess().getGroup()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:102:1: ( rule__Node__Group__0 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:102:2: rule__Node__Group__0
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:114:1: entryRulePhenomenon : rulePhenomenon EOF ;
    public final void entryRulePhenomenon() throws RecognitionException {
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:114:21: ( rulePhenomenon EOF )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:115:1: rulePhenomenon EOF
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:122:1: rulePhenomenon : ( ( rule__Phenomenon__Group__0 ) ) ;
    public final void rulePhenomenon() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:126:2: ( ( ( rule__Phenomenon__Group__0 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:127:1: ( ( rule__Phenomenon__Group__0 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:127:1: ( ( rule__Phenomenon__Group__0 ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:128:1: ( rule__Phenomenon__Group__0 )
            {
             before(grammarAccess.getPhenomenonAccess().getGroup()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:129:1: ( rule__Phenomenon__Group__0 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:129:2: rule__Phenomenon__Group__0
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:141:1: entryRuleLink : ruleLink EOF ;
    public final void entryRuleLink() throws RecognitionException {
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:141:15: ( ruleLink EOF )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:142:1: ruleLink EOF
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:149:1: ruleLink : ( ( rule__Link__Group__0 ) ) ;
    public final void ruleLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:153:2: ( ( ( rule__Link__Group__0 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:154:1: ( ( rule__Link__Group__0 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:154:1: ( ( rule__Link__Group__0 ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:155:1: ( rule__Link__Group__0 )
            {
             before(grammarAccess.getLinkAccess().getGroup()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:156:1: ( rule__Link__Group__0 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:156:2: rule__Link__Group__0
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:169:1: ruleNodeType : ( ( rule__NodeType__Alternatives ) ) ;
    public final void ruleNodeType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:173:1: ( ( ( rule__NodeType__Alternatives ) ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:174:1: ( ( rule__NodeType__Alternatives ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:174:1: ( ( rule__NodeType__Alternatives ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:175:1: ( rule__NodeType__Alternatives )
            {
             before(grammarAccess.getNodeTypeAccess().getAlternatives()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:176:1: ( rule__NodeType__Alternatives )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:176:2: rule__NodeType__Alternatives
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:188:1: rulePhenomenonType : ( ( rule__PhenomenonType__Alternatives ) ) ;
    public final void rulePhenomenonType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:192:1: ( ( ( rule__PhenomenonType__Alternatives ) ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:193:1: ( ( rule__PhenomenonType__Alternatives ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:193:1: ( ( rule__PhenomenonType__Alternatives ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:194:1: ( rule__PhenomenonType__Alternatives )
            {
             before(grammarAccess.getPhenomenonTypeAccess().getAlternatives()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:195:1: ( rule__PhenomenonType__Alternatives )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:195:2: rule__PhenomenonType__Alternatives
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:207:1: ruleLinkType : ( ( rule__LinkType__Alternatives ) ) ;
    public final void ruleLinkType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:211:1: ( ( ( rule__LinkType__Alternatives ) ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:212:1: ( ( rule__LinkType__Alternatives ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:212:1: ( ( rule__LinkType__Alternatives ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:213:1: ( rule__LinkType__Alternatives )
            {
             before(grammarAccess.getLinkTypeAccess().getAlternatives()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:214:1: ( rule__LinkType__Alternatives )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:214:2: rule__LinkType__Alternatives
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


    // $ANTLR start rule__ProblemDiagram__Alternatives_3
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:225:1: rule__ProblemDiagram__Alternatives_3 : ( ( ( rule__ProblemDiagram__NodesAssignment_3_0 ) ) | ( ( rule__ProblemDiagram__LinksAssignment_3_1 ) ) );
    public final void rule__ProblemDiagram__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:229:1: ( ( ( rule__ProblemDiagram__NodesAssignment_3_0 ) ) | ( ( rule__ProblemDiagram__LinksAssignment_3_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                int LA1_1 = input.LA(2);

                if ( ((LA1_1>=21 && LA1_1<=23)) ) {
                    alt1=2;
                }
                else if ( (LA1_1==EOF||LA1_1==RULE_ID||(LA1_1>=11 && LA1_1<=17)||(LA1_1>=24 && LA1_1<=27)||LA1_1==29) ) {
                    alt1=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("225:1: rule__ProblemDiagram__Alternatives_3 : ( ( ( rule__ProblemDiagram__NodesAssignment_3_0 ) ) | ( ( rule__ProblemDiagram__LinksAssignment_3_1 ) ) );", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("225:1: rule__ProblemDiagram__Alternatives_3 : ( ( ( rule__ProblemDiagram__NodesAssignment_3_0 ) ) | ( ( rule__ProblemDiagram__LinksAssignment_3_1 ) ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:230:1: ( ( rule__ProblemDiagram__NodesAssignment_3_0 ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:230:1: ( ( rule__ProblemDiagram__NodesAssignment_3_0 ) )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:231:1: ( rule__ProblemDiagram__NodesAssignment_3_0 )
                    {
                     before(grammarAccess.getProblemDiagramAccess().getNodesAssignment_3_0()); 
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:232:1: ( rule__ProblemDiagram__NodesAssignment_3_0 )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:232:2: rule__ProblemDiagram__NodesAssignment_3_0
                    {
                    pushFollow(FOLLOW_rule__ProblemDiagram__NodesAssignment_3_0_in_rule__ProblemDiagram__Alternatives_3418);
                    rule__ProblemDiagram__NodesAssignment_3_0();
                    _fsp--;


                    }

                     after(grammarAccess.getProblemDiagramAccess().getNodesAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:236:6: ( ( rule__ProblemDiagram__LinksAssignment_3_1 ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:236:6: ( ( rule__ProblemDiagram__LinksAssignment_3_1 ) )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:237:1: ( rule__ProblemDiagram__LinksAssignment_3_1 )
                    {
                     before(grammarAccess.getProblemDiagramAccess().getLinksAssignment_3_1()); 
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:238:1: ( rule__ProblemDiagram__LinksAssignment_3_1 )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:238:2: rule__ProblemDiagram__LinksAssignment_3_1
                    {
                    pushFollow(FOLLOW_rule__ProblemDiagram__LinksAssignment_3_1_in_rule__ProblemDiagram__Alternatives_3436);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:247:1: rule__Node__Alternatives_3_2 : ( ( ( rule__Node__SubproblemAssignment_3_2_0 ) ) | ( ( rule__Node__Group_3_2_1__0 ) ) | ( ( rule__Node__Group_3_2_2__0 ) ) | ( ( rule__Node__Group_3_2_3__0 ) ) );
    public final void rule__Node__Alternatives_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:251:1: ( ( ( rule__Node__SubproblemAssignment_3_2_0 ) ) | ( ( rule__Node__Group_3_2_1__0 ) ) | ( ( rule__Node__Group_3_2_2__0 ) ) | ( ( rule__Node__Group_3_2_3__0 ) ) )
            int alt2=4;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==24) ) {
                alt2=1;
            }
            else if ( (LA2_0==29) ) {
                switch ( input.LA(2) ) {
                case RULE_STRING:
                    {
                    alt2=4;
                    }
                    break;
                case 30:
                    {
                    alt2=2;
                    }
                    break;
                case 24:
                    {
                    alt2=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("247:1: rule__Node__Alternatives_3_2 : ( ( ( rule__Node__SubproblemAssignment_3_2_0 ) ) | ( ( rule__Node__Group_3_2_1__0 ) ) | ( ( rule__Node__Group_3_2_2__0 ) ) | ( ( rule__Node__Group_3_2_3__0 ) ) );", 2, 2, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("247:1: rule__Node__Alternatives_3_2 : ( ( ( rule__Node__SubproblemAssignment_3_2_0 ) ) | ( ( rule__Node__Group_3_2_1__0 ) ) | ( ( rule__Node__Group_3_2_2__0 ) ) | ( ( rule__Node__Group_3_2_3__0 ) ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:252:1: ( ( rule__Node__SubproblemAssignment_3_2_0 ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:252:1: ( ( rule__Node__SubproblemAssignment_3_2_0 ) )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:253:1: ( rule__Node__SubproblemAssignment_3_2_0 )
                    {
                     before(grammarAccess.getNodeAccess().getSubproblemAssignment_3_2_0()); 
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:254:1: ( rule__Node__SubproblemAssignment_3_2_0 )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:254:2: rule__Node__SubproblemAssignment_3_2_0
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
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:258:6: ( ( rule__Node__Group_3_2_1__0 ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:258:6: ( ( rule__Node__Group_3_2_1__0 ) )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:259:1: ( rule__Node__Group_3_2_1__0 )
                    {
                     before(grammarAccess.getNodeAccess().getGroup_3_2_1()); 
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:260:1: ( rule__Node__Group_3_2_1__0 )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:260:2: rule__Node__Group_3_2_1__0
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
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:264:6: ( ( rule__Node__Group_3_2_2__0 ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:264:6: ( ( rule__Node__Group_3_2_2__0 ) )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:265:1: ( rule__Node__Group_3_2_2__0 )
                    {
                     before(grammarAccess.getNodeAccess().getGroup_3_2_2()); 
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:266:1: ( rule__Node__Group_3_2_2__0 )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:266:2: rule__Node__Group_3_2_2__0
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
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:270:6: ( ( rule__Node__Group_3_2_3__0 ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:270:6: ( ( rule__Node__Group_3_2_3__0 ) )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:271:1: ( rule__Node__Group_3_2_3__0 )
                    {
                     before(grammarAccess.getNodeAccess().getGroup_3_2_3()); 
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:272:1: ( rule__Node__Group_3_2_3__0 )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:272:2: rule__Node__Group_3_2_3__0
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:281:1: rule__NodeType__Alternatives : ( ( ( 'R' ) ) | ( ( 'M' ) ) | ( ( 'B' ) ) | ( ( 'X' ) ) | ( ( 'C' ) ) | ( ( 'D' ) ) | ( ( 'P' ) ) );
    public final void rule__NodeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:285:1: ( ( ( 'R' ) ) | ( ( 'M' ) ) | ( ( 'B' ) ) | ( ( 'X' ) ) | ( ( 'C' ) ) | ( ( 'D' ) ) | ( ( 'P' ) ) )
            int alt3=7;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            case 14:
                {
                alt3=4;
                }
                break;
            case 15:
                {
                alt3=5;
                }
                break;
            case 16:
                {
                alt3=6;
                }
                break;
            case 17:
                {
                alt3=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("281:1: rule__NodeType__Alternatives : ( ( ( 'R' ) ) | ( ( 'M' ) ) | ( ( 'B' ) ) | ( ( 'X' ) ) | ( ( 'C' ) ) | ( ( 'D' ) ) | ( ( 'P' ) ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:286:1: ( ( 'R' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:286:1: ( ( 'R' ) )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:287:1: ( 'R' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getREQUIREMENTEnumLiteralDeclaration_0()); 
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:288:1: ( 'R' )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:288:3: 'R'
                    {
                    match(input,11,FOLLOW_11_in_rule__NodeType__Alternatives557); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getREQUIREMENTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:293:6: ( ( 'M' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:293:6: ( ( 'M' ) )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:294:1: ( 'M' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getMACHINEEnumLiteralDeclaration_1()); 
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:295:1: ( 'M' )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:295:3: 'M'
                    {
                    match(input,12,FOLLOW_12_in_rule__NodeType__Alternatives578); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getMACHINEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:300:6: ( ( 'B' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:300:6: ( ( 'B' ) )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:301:1: ( 'B' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getBIDDABLEEnumLiteralDeclaration_2()); 
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:302:1: ( 'B' )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:302:3: 'B'
                    {
                    match(input,13,FOLLOW_13_in_rule__NodeType__Alternatives599); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getBIDDABLEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:307:6: ( ( 'X' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:307:6: ( ( 'X' ) )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:308:1: ( 'X' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getLEXICALEnumLiteralDeclaration_3()); 
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:309:1: ( 'X' )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:309:3: 'X'
                    {
                    match(input,14,FOLLOW_14_in_rule__NodeType__Alternatives620); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getLEXICALEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:314:6: ( ( 'C' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:314:6: ( ( 'C' ) )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:315:1: ( 'C' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getCAUSALEnumLiteralDeclaration_4()); 
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:316:1: ( 'C' )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:316:3: 'C'
                    {
                    match(input,15,FOLLOW_15_in_rule__NodeType__Alternatives641); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getCAUSALEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:321:6: ( ( 'D' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:321:6: ( ( 'D' ) )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:322:1: ( 'D' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getDESIGNEDEnumLiteralDeclaration_5()); 
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:323:1: ( 'D' )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:323:3: 'D'
                    {
                    match(input,16,FOLLOW_16_in_rule__NodeType__Alternatives662); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getDESIGNEDEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:328:6: ( ( 'P' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:328:6: ( ( 'P' ) )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:329:1: ( 'P' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getPHYSICALEnumLiteralDeclaration_6()); 
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:330:1: ( 'P' )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:330:3: 'P'
                    {
                    match(input,17,FOLLOW_17_in_rule__NodeType__Alternatives683); 

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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:340:1: rule__PhenomenonType__Alternatives : ( ( ( 'phenomenon' ) ) | ( ( 'event' ) ) | ( ( 'state' ) ) );
    public final void rule__PhenomenonType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:344:1: ( ( ( 'phenomenon' ) ) | ( ( 'event' ) ) | ( ( 'state' ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt4=1;
                }
                break;
            case 19:
                {
                alt4=2;
                }
                break;
            case 20:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("340:1: rule__PhenomenonType__Alternatives : ( ( ( 'phenomenon' ) ) | ( ( 'event' ) ) | ( ( 'state' ) ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:345:1: ( ( 'phenomenon' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:345:1: ( ( 'phenomenon' ) )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:346:1: ( 'phenomenon' )
                    {
                     before(grammarAccess.getPhenomenonTypeAccess().getUNSPECIFIEDEnumLiteralDeclaration_0()); 
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:347:1: ( 'phenomenon' )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:347:3: 'phenomenon'
                    {
                    match(input,18,FOLLOW_18_in_rule__PhenomenonType__Alternatives719); 

                    }

                     after(grammarAccess.getPhenomenonTypeAccess().getUNSPECIFIEDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:352:6: ( ( 'event' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:352:6: ( ( 'event' ) )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:353:1: ( 'event' )
                    {
                     before(grammarAccess.getPhenomenonTypeAccess().getEVENTEnumLiteralDeclaration_1()); 
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:354:1: ( 'event' )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:354:3: 'event'
                    {
                    match(input,19,FOLLOW_19_in_rule__PhenomenonType__Alternatives740); 

                    }

                     after(grammarAccess.getPhenomenonTypeAccess().getEVENTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:359:6: ( ( 'state' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:359:6: ( ( 'state' ) )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:360:1: ( 'state' )
                    {
                     before(grammarAccess.getPhenomenonTypeAccess().getSTATEEnumLiteralDeclaration_2()); 
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:361:1: ( 'state' )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:361:3: 'state'
                    {
                    match(input,20,FOLLOW_20_in_rule__PhenomenonType__Alternatives761); 

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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:371:1: rule__LinkType__Alternatives : ( ( ( '--' ) ) | ( ( '~~' ) ) | ( ( '~>' ) ) );
    public final void rule__LinkType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:375:1: ( ( ( '--' ) ) | ( ( '~~' ) ) | ( ( '~>' ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt5=1;
                }
                break;
            case 22:
                {
                alt5=2;
                }
                break;
            case 23:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("371:1: rule__LinkType__Alternatives : ( ( ( '--' ) ) | ( ( '~~' ) ) | ( ( '~>' ) ) );", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:376:1: ( ( '--' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:376:1: ( ( '--' ) )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:377:1: ( '--' )
                    {
                     before(grammarAccess.getLinkTypeAccess().getINTERFACEEnumLiteralDeclaration_0()); 
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:378:1: ( '--' )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:378:3: '--'
                    {
                    match(input,21,FOLLOW_21_in_rule__LinkType__Alternatives797); 

                    }

                     after(grammarAccess.getLinkTypeAccess().getINTERFACEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:383:6: ( ( '~~' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:383:6: ( ( '~~' ) )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:384:1: ( '~~' )
                    {
                     before(grammarAccess.getLinkTypeAccess().getREFERENCEEnumLiteralDeclaration_1()); 
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:385:1: ( '~~' )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:385:3: '~~'
                    {
                    match(input,22,FOLLOW_22_in_rule__LinkType__Alternatives818); 

                    }

                     after(grammarAccess.getLinkTypeAccess().getREFERENCEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:390:6: ( ( '~>' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:390:6: ( ( '~>' ) )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:391:1: ( '~>' )
                    {
                     before(grammarAccess.getLinkTypeAccess().getCONSTRAINTEnumLiteralDeclaration_2()); 
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:392:1: ( '~>' )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:392:3: '~>'
                    {
                    match(input,23,FOLLOW_23_in_rule__LinkType__Alternatives839); 

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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:404:1: rule__ProblemDiagram__Group__0 : ( 'problem' ) rule__ProblemDiagram__Group__1 ;
    public final void rule__ProblemDiagram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:408:1: ( ( 'problem' ) rule__ProblemDiagram__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:409:1: ( 'problem' ) rule__ProblemDiagram__Group__1
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:409:1: ( 'problem' )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:410:1: 'problem'
            {
             before(grammarAccess.getProblemDiagramAccess().getProblemKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__ProblemDiagram__Group__0877); 
             after(grammarAccess.getProblemDiagramAccess().getProblemKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__ProblemDiagram__Group__1_in_rule__ProblemDiagram__Group__0887);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:424:1: rule__ProblemDiagram__Group__1 : ( ':' ) rule__ProblemDiagram__Group__2 ;
    public final void rule__ProblemDiagram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:428:1: ( ( ':' ) rule__ProblemDiagram__Group__2 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:429:1: ( ':' ) rule__ProblemDiagram__Group__2
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:429:1: ( ':' )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:430:1: ':'
            {
             before(grammarAccess.getProblemDiagramAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__ProblemDiagram__Group__1916); 
             after(grammarAccess.getProblemDiagramAccess().getColonKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__ProblemDiagram__Group__2_in_rule__ProblemDiagram__Group__1926);
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


    // $ANTLR start rule__ProblemDiagram__Group__2
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:444:1: rule__ProblemDiagram__Group__2 : ( ( rule__ProblemDiagram__NameAssignment_2 ) ) rule__ProblemDiagram__Group__3 ;
    public final void rule__ProblemDiagram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:448:1: ( ( ( rule__ProblemDiagram__NameAssignment_2 ) ) rule__ProblemDiagram__Group__3 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:449:1: ( ( rule__ProblemDiagram__NameAssignment_2 ) ) rule__ProblemDiagram__Group__3
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:449:1: ( ( rule__ProblemDiagram__NameAssignment_2 ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:450:1: ( rule__ProblemDiagram__NameAssignment_2 )
            {
             before(grammarAccess.getProblemDiagramAccess().getNameAssignment_2()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:451:1: ( rule__ProblemDiagram__NameAssignment_2 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:451:2: rule__ProblemDiagram__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__ProblemDiagram__NameAssignment_2_in_rule__ProblemDiagram__Group__2954);
            rule__ProblemDiagram__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getProblemDiagramAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__ProblemDiagram__Group__3_in_rule__ProblemDiagram__Group__2963);
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


    // $ANTLR start rule__ProblemDiagram__Group__3
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:462:1: rule__ProblemDiagram__Group__3 : ( ( rule__ProblemDiagram__Alternatives_3 )* ) ;
    public final void rule__ProblemDiagram__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:466:1: ( ( ( rule__ProblemDiagram__Alternatives_3 )* ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:467:1: ( ( rule__ProblemDiagram__Alternatives_3 )* )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:467:1: ( ( rule__ProblemDiagram__Alternatives_3 )* )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:468:1: ( rule__ProblemDiagram__Alternatives_3 )*
            {
             before(grammarAccess.getProblemDiagramAccess().getAlternatives_3()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:469:1: ( rule__ProblemDiagram__Alternatives_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:469:2: rule__ProblemDiagram__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_rule__ProblemDiagram__Alternatives_3_in_rule__ProblemDiagram__Group__3991);
            	    rule__ProblemDiagram__Alternatives_3();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // $ANTLR end rule__ProblemDiagram__Group__3


    // $ANTLR start rule__Node__Group__0
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:487:1: rule__Node__Group__0 : ( ( rule__Node__NameAssignment_0 ) ) rule__Node__Group__1 ;
    public final void rule__Node__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:491:1: ( ( ( rule__Node__NameAssignment_0 ) ) rule__Node__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:492:1: ( ( rule__Node__NameAssignment_0 ) ) rule__Node__Group__1
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:492:1: ( ( rule__Node__NameAssignment_0 ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:493:1: ( rule__Node__NameAssignment_0 )
            {
             before(grammarAccess.getNodeAccess().getNameAssignment_0()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:494:1: ( rule__Node__NameAssignment_0 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:494:2: rule__Node__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Node__NameAssignment_0_in_rule__Node__Group__01034);
            rule__Node__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getNodeAccess().getNameAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Node__Group__1_in_rule__Node__Group__01043);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:505:1: rule__Node__Group__1 : ( ( rule__Node__TypeAssignment_1 )? ) rule__Node__Group__2 ;
    public final void rule__Node__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:509:1: ( ( ( rule__Node__TypeAssignment_1 )? ) rule__Node__Group__2 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:510:1: ( ( rule__Node__TypeAssignment_1 )? ) rule__Node__Group__2
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:510:1: ( ( rule__Node__TypeAssignment_1 )? )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:511:1: ( rule__Node__TypeAssignment_1 )?
            {
             before(grammarAccess.getNodeAccess().getTypeAssignment_1()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:512:1: ( rule__Node__TypeAssignment_1 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=11 && LA7_0<=17)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:512:2: rule__Node__TypeAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Node__TypeAssignment_1_in_rule__Node__Group__11071);
                    rule__Node__TypeAssignment_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNodeAccess().getTypeAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Node__Group__2_in_rule__Node__Group__11081);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:523:1: rule__Node__Group__2 : ( ( rule__Node__Group_2__0 )? ) rule__Node__Group__3 ;
    public final void rule__Node__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:527:1: ( ( ( rule__Node__Group_2__0 )? ) rule__Node__Group__3 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:528:1: ( ( rule__Node__Group_2__0 )? ) rule__Node__Group__3
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:528:1: ( ( rule__Node__Group_2__0 )? )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:529:1: ( rule__Node__Group_2__0 )?
            {
             before(grammarAccess.getNodeAccess().getGroup_2()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:530:1: ( rule__Node__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:530:2: rule__Node__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Node__Group_2__0_in_rule__Node__Group__21109);
                    rule__Node__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNodeAccess().getGroup_2()); 

            }

            pushFollow(FOLLOW_rule__Node__Group__3_in_rule__Node__Group__21119);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:541:1: rule__Node__Group__3 : ( ( rule__Node__Group_3__0 )? ) ;
    public final void rule__Node__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:545:1: ( ( ( rule__Node__Group_3__0 )? ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:546:1: ( ( rule__Node__Group_3__0 )? )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:546:1: ( ( rule__Node__Group_3__0 )? )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:547:1: ( rule__Node__Group_3__0 )?
            {
             before(grammarAccess.getNodeAccess().getGroup_3()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:548:1: ( rule__Node__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:548:2: rule__Node__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Node__Group_3__0_in_rule__Node__Group__31147);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:566:1: rule__Node__Group_2__0 : ( ':' ) rule__Node__Group_2__1 ;
    public final void rule__Node__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:570:1: ( ( ':' ) rule__Node__Group_2__1 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:571:1: ( ':' ) rule__Node__Group_2__1
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:571:1: ( ':' )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:572:1: ':'
            {
             before(grammarAccess.getNodeAccess().getColonKeyword_2_0()); 
            match(input,25,FOLLOW_25_in_rule__Node__Group_2__01191); 
             after(grammarAccess.getNodeAccess().getColonKeyword_2_0()); 

            }

            pushFollow(FOLLOW_rule__Node__Group_2__1_in_rule__Node__Group_2__01201);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:586:1: rule__Node__Group_2__1 : ( ( rule__Node__DescriptionAssignment_2_1 ) ) ;
    public final void rule__Node__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:590:1: ( ( ( rule__Node__DescriptionAssignment_2_1 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:591:1: ( ( rule__Node__DescriptionAssignment_2_1 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:591:1: ( ( rule__Node__DescriptionAssignment_2_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:592:1: ( rule__Node__DescriptionAssignment_2_1 )
            {
             before(grammarAccess.getNodeAccess().getDescriptionAssignment_2_1()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:593:1: ( rule__Node__DescriptionAssignment_2_1 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:593:2: rule__Node__DescriptionAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Node__DescriptionAssignment_2_1_in_rule__Node__Group_2__11229);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:607:1: rule__Node__Group_3__0 : ( '{' ) rule__Node__Group_3__1 ;
    public final void rule__Node__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:611:1: ( ( '{' ) rule__Node__Group_3__1 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:612:1: ( '{' ) rule__Node__Group_3__1
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:612:1: ( '{' )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:613:1: '{'
            {
             before(grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,26,FOLLOW_26_in_rule__Node__Group_3__01268); 
             after(grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_3_0()); 

            }

            pushFollow(FOLLOW_rule__Node__Group_3__1_in_rule__Node__Group_3__01278);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:627:1: rule__Node__Group_3__1 : ( ( rule__Node__Group_3_1__0 )? ) rule__Node__Group_3__2 ;
    public final void rule__Node__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:631:1: ( ( ( rule__Node__Group_3_1__0 )? ) rule__Node__Group_3__2 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:632:1: ( ( rule__Node__Group_3_1__0 )? ) rule__Node__Group_3__2
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:632:1: ( ( rule__Node__Group_3_1__0 )? )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:633:1: ( rule__Node__Group_3_1__0 )?
            {
             before(grammarAccess.getNodeAccess().getGroup_3_1()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:634:1: ( rule__Node__Group_3_1__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID||(LA10_0>=18 && LA10_0<=20)||LA10_0==31) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:634:2: rule__Node__Group_3_1__0
                    {
                    pushFollow(FOLLOW_rule__Node__Group_3_1__0_in_rule__Node__Group_3__11306);
                    rule__Node__Group_3_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNodeAccess().getGroup_3_1()); 

            }

            pushFollow(FOLLOW_rule__Node__Group_3__2_in_rule__Node__Group_3__11316);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:645:1: rule__Node__Group_3__2 : ( ( rule__Node__Alternatives_3_2 )* ) rule__Node__Group_3__3 ;
    public final void rule__Node__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:649:1: ( ( ( rule__Node__Alternatives_3_2 )* ) rule__Node__Group_3__3 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:650:1: ( ( rule__Node__Alternatives_3_2 )* ) rule__Node__Group_3__3
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:650:1: ( ( rule__Node__Alternatives_3_2 )* )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:651:1: ( rule__Node__Alternatives_3_2 )*
            {
             before(grammarAccess.getNodeAccess().getAlternatives_3_2()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:652:1: ( rule__Node__Alternatives_3_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==24||LA11_0==29) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:652:2: rule__Node__Alternatives_3_2
            	    {
            	    pushFollow(FOLLOW_rule__Node__Alternatives_3_2_in_rule__Node__Group_3__21344);
            	    rule__Node__Alternatives_3_2();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getNodeAccess().getAlternatives_3_2()); 

            }

            pushFollow(FOLLOW_rule__Node__Group_3__3_in_rule__Node__Group_3__21354);
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


    // $ANTLR start rule__Node__Group_3__3
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:663:1: rule__Node__Group_3__3 : ( '}' ) ;
    public final void rule__Node__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:667:1: ( ( '}' ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:668:1: ( '}' )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:668:1: ( '}' )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:669:1: '}'
            {
             before(grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_3_3()); 
            match(input,27,FOLLOW_27_in_rule__Node__Group_3__31383); 
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
    // $ANTLR end rule__Node__Group_3__3


    // $ANTLR start rule__Node__Group_3_1__0
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:690:1: rule__Node__Group_3_1__0 : ( ( rule__Node__HiddenPhenomenaAssignment_3_1_0 ) ) rule__Node__Group_3_1__1 ;
    public final void rule__Node__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:694:1: ( ( ( rule__Node__HiddenPhenomenaAssignment_3_1_0 ) ) rule__Node__Group_3_1__1 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:695:1: ( ( rule__Node__HiddenPhenomenaAssignment_3_1_0 ) ) rule__Node__Group_3_1__1
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:695:1: ( ( rule__Node__HiddenPhenomenaAssignment_3_1_0 ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:696:1: ( rule__Node__HiddenPhenomenaAssignment_3_1_0 )
            {
             before(grammarAccess.getNodeAccess().getHiddenPhenomenaAssignment_3_1_0()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:697:1: ( rule__Node__HiddenPhenomenaAssignment_3_1_0 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:697:2: rule__Node__HiddenPhenomenaAssignment_3_1_0
            {
            pushFollow(FOLLOW_rule__Node__HiddenPhenomenaAssignment_3_1_0_in_rule__Node__Group_3_1__01426);
            rule__Node__HiddenPhenomenaAssignment_3_1_0();
            _fsp--;


            }

             after(grammarAccess.getNodeAccess().getHiddenPhenomenaAssignment_3_1_0()); 

            }

            pushFollow(FOLLOW_rule__Node__Group_3_1__1_in_rule__Node__Group_3_1__01435);
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


    // $ANTLR start rule__Node__Group_3_1__1
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:708:1: rule__Node__Group_3_1__1 : ( ( rule__Node__Group_3_1_1__0 )* ) ;
    public final void rule__Node__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:712:1: ( ( ( rule__Node__Group_3_1_1__0 )* ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:713:1: ( ( rule__Node__Group_3_1_1__0 )* )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:713:1: ( ( rule__Node__Group_3_1_1__0 )* )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:714:1: ( rule__Node__Group_3_1_1__0 )*
            {
             before(grammarAccess.getNodeAccess().getGroup_3_1_1()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:715:1: ( rule__Node__Group_3_1_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==28) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:715:2: rule__Node__Group_3_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Node__Group_3_1_1__0_in_rule__Node__Group_3_1__11463);
            	    rule__Node__Group_3_1_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // $ANTLR end rule__Node__Group_3_1__1


    // $ANTLR start rule__Node__Group_3_1_1__0
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:729:1: rule__Node__Group_3_1_1__0 : ( ',' ) rule__Node__Group_3_1_1__1 ;
    public final void rule__Node__Group_3_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:733:1: ( ( ',' ) rule__Node__Group_3_1_1__1 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:734:1: ( ',' ) rule__Node__Group_3_1_1__1
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:734:1: ( ',' )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:735:1: ','
            {
             before(grammarAccess.getNodeAccess().getCommaKeyword_3_1_1_0()); 
            match(input,28,FOLLOW_28_in_rule__Node__Group_3_1_1__01503); 
             after(grammarAccess.getNodeAccess().getCommaKeyword_3_1_1_0()); 

            }

            pushFollow(FOLLOW_rule__Node__Group_3_1_1__1_in_rule__Node__Group_3_1_1__01513);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:749:1: rule__Node__Group_3_1_1__1 : ( ( rule__Node__HiddenPhenomenaAssignment_3_1_1_1 ) ) ;
    public final void rule__Node__Group_3_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:753:1: ( ( ( rule__Node__HiddenPhenomenaAssignment_3_1_1_1 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:754:1: ( ( rule__Node__HiddenPhenomenaAssignment_3_1_1_1 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:754:1: ( ( rule__Node__HiddenPhenomenaAssignment_3_1_1_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:755:1: ( rule__Node__HiddenPhenomenaAssignment_3_1_1_1 )
            {
             before(grammarAccess.getNodeAccess().getHiddenPhenomenaAssignment_3_1_1_1()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:756:1: ( rule__Node__HiddenPhenomenaAssignment_3_1_1_1 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:756:2: rule__Node__HiddenPhenomenaAssignment_3_1_1_1
            {
            pushFollow(FOLLOW_rule__Node__HiddenPhenomenaAssignment_3_1_1_1_in_rule__Node__Group_3_1_1__11541);
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
    // $ANTLR end rule__Node__Group_3_1_1__1


    // $ANTLR start rule__Node__Group_3_2_1__0
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:770:1: rule__Node__Group_3_2_1__0 : ( 'see' ) rule__Node__Group_3_2_1__1 ;
    public final void rule__Node__Group_3_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:774:1: ( ( 'see' ) rule__Node__Group_3_2_1__1 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:775:1: ( 'see' ) rule__Node__Group_3_2_1__1
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:775:1: ( 'see' )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:776:1: 'see'
            {
             before(grammarAccess.getNodeAccess().getSeeKeyword_3_2_1_0()); 
            match(input,29,FOLLOW_29_in_rule__Node__Group_3_2_1__01580); 
             after(grammarAccess.getNodeAccess().getSeeKeyword_3_2_1_0()); 

            }

            pushFollow(FOLLOW_rule__Node__Group_3_2_1__1_in_rule__Node__Group_3_2_1__01590);
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


    // $ANTLR start rule__Node__Group_3_2_1__1
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:790:1: rule__Node__Group_3_2_1__1 : ( 'domain' ) rule__Node__Group_3_2_1__2 ;
    public final void rule__Node__Group_3_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:794:1: ( ( 'domain' ) rule__Node__Group_3_2_1__2 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:795:1: ( 'domain' ) rule__Node__Group_3_2_1__2
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:795:1: ( 'domain' )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:796:1: 'domain'
            {
             before(grammarAccess.getNodeAccess().getDomainKeyword_3_2_1_1()); 
            match(input,30,FOLLOW_30_in_rule__Node__Group_3_2_1__11619); 
             after(grammarAccess.getNodeAccess().getDomainKeyword_3_2_1_1()); 

            }

            pushFollow(FOLLOW_rule__Node__Group_3_2_1__2_in_rule__Node__Group_3_2_1__11629);
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


    // $ANTLR start rule__Node__Group_3_2_1__2
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:810:1: rule__Node__Group_3_2_1__2 : ( ( rule__Node__ProblemNodeRefAssignment_3_2_1_2 ) ) ;
    public final void rule__Node__Group_3_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:814:1: ( ( ( rule__Node__ProblemNodeRefAssignment_3_2_1_2 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:815:1: ( ( rule__Node__ProblemNodeRefAssignment_3_2_1_2 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:815:1: ( ( rule__Node__ProblemNodeRefAssignment_3_2_1_2 ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:816:1: ( rule__Node__ProblemNodeRefAssignment_3_2_1_2 )
            {
             before(grammarAccess.getNodeAccess().getProblemNodeRefAssignment_3_2_1_2()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:817:1: ( rule__Node__ProblemNodeRefAssignment_3_2_1_2 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:817:2: rule__Node__ProblemNodeRefAssignment_3_2_1_2
            {
            pushFollow(FOLLOW_rule__Node__ProblemNodeRefAssignment_3_2_1_2_in_rule__Node__Group_3_2_1__21657);
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
    // $ANTLR end rule__Node__Group_3_2_1__2


    // $ANTLR start rule__Node__Group_3_2_2__0
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:833:1: rule__Node__Group_3_2_2__0 : ( 'see' ) rule__Node__Group_3_2_2__1 ;
    public final void rule__Node__Group_3_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:837:1: ( ( 'see' ) rule__Node__Group_3_2_2__1 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:838:1: ( 'see' ) rule__Node__Group_3_2_2__1
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:838:1: ( 'see' )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:839:1: 'see'
            {
             before(grammarAccess.getNodeAccess().getSeeKeyword_3_2_2_0()); 
            match(input,29,FOLLOW_29_in_rule__Node__Group_3_2_2__01698); 
             after(grammarAccess.getNodeAccess().getSeeKeyword_3_2_2_0()); 

            }

            pushFollow(FOLLOW_rule__Node__Group_3_2_2__1_in_rule__Node__Group_3_2_2__01708);
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


    // $ANTLR start rule__Node__Group_3_2_2__1
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:853:1: rule__Node__Group_3_2_2__1 : ( 'problem' ) rule__Node__Group_3_2_2__2 ;
    public final void rule__Node__Group_3_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:857:1: ( ( 'problem' ) rule__Node__Group_3_2_2__2 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:858:1: ( 'problem' ) rule__Node__Group_3_2_2__2
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:858:1: ( 'problem' )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:859:1: 'problem'
            {
             before(grammarAccess.getNodeAccess().getProblemKeyword_3_2_2_1()); 
            match(input,24,FOLLOW_24_in_rule__Node__Group_3_2_2__11737); 
             after(grammarAccess.getNodeAccess().getProblemKeyword_3_2_2_1()); 

            }

            pushFollow(FOLLOW_rule__Node__Group_3_2_2__2_in_rule__Node__Group_3_2_2__11747);
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


    // $ANTLR start rule__Node__Group_3_2_2__2
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:873:1: rule__Node__Group_3_2_2__2 : ( ( rule__Node__ProblemRefAssignment_3_2_2_2 ) ) ;
    public final void rule__Node__Group_3_2_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:877:1: ( ( ( rule__Node__ProblemRefAssignment_3_2_2_2 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:878:1: ( ( rule__Node__ProblemRefAssignment_3_2_2_2 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:878:1: ( ( rule__Node__ProblemRefAssignment_3_2_2_2 ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:879:1: ( rule__Node__ProblemRefAssignment_3_2_2_2 )
            {
             before(grammarAccess.getNodeAccess().getProblemRefAssignment_3_2_2_2()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:880:1: ( rule__Node__ProblemRefAssignment_3_2_2_2 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:880:2: rule__Node__ProblemRefAssignment_3_2_2_2
            {
            pushFollow(FOLLOW_rule__Node__ProblemRefAssignment_3_2_2_2_in_rule__Node__Group_3_2_2__21775);
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
    // $ANTLR end rule__Node__Group_3_2_2__2


    // $ANTLR start rule__Node__Group_3_2_3__0
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:896:1: rule__Node__Group_3_2_3__0 : ( 'see' ) rule__Node__Group_3_2_3__1 ;
    public final void rule__Node__Group_3_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:900:1: ( ( 'see' ) rule__Node__Group_3_2_3__1 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:901:1: ( 'see' ) rule__Node__Group_3_2_3__1
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:901:1: ( 'see' )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:902:1: 'see'
            {
             before(grammarAccess.getNodeAccess().getSeeKeyword_3_2_3_0()); 
            match(input,29,FOLLOW_29_in_rule__Node__Group_3_2_3__01816); 
             after(grammarAccess.getNodeAccess().getSeeKeyword_3_2_3_0()); 

            }

            pushFollow(FOLLOW_rule__Node__Group_3_2_3__1_in_rule__Node__Group_3_2_3__01826);
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


    // $ANTLR start rule__Node__Group_3_2_3__1
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:916:1: rule__Node__Group_3_2_3__1 : ( ( rule__Node__HrefAssignment_3_2_3_1 ) ) ;
    public final void rule__Node__Group_3_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:920:1: ( ( ( rule__Node__HrefAssignment_3_2_3_1 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:921:1: ( ( rule__Node__HrefAssignment_3_2_3_1 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:921:1: ( ( rule__Node__HrefAssignment_3_2_3_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:922:1: ( rule__Node__HrefAssignment_3_2_3_1 )
            {
             before(grammarAccess.getNodeAccess().getHrefAssignment_3_2_3_1()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:923:1: ( rule__Node__HrefAssignment_3_2_3_1 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:923:2: rule__Node__HrefAssignment_3_2_3_1
            {
            pushFollow(FOLLOW_rule__Node__HrefAssignment_3_2_3_1_in_rule__Node__Group_3_2_3__11854);
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
    // $ANTLR end rule__Node__Group_3_2_3__1


    // $ANTLR start rule__Phenomenon__Group__0
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:937:1: rule__Phenomenon__Group__0 : ( ( rule__Phenomenon__TypeAssignment_0 )? ) rule__Phenomenon__Group__1 ;
    public final void rule__Phenomenon__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:941:1: ( ( ( rule__Phenomenon__TypeAssignment_0 )? ) rule__Phenomenon__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:942:1: ( ( rule__Phenomenon__TypeAssignment_0 )? ) rule__Phenomenon__Group__1
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:942:1: ( ( rule__Phenomenon__TypeAssignment_0 )? )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:943:1: ( rule__Phenomenon__TypeAssignment_0 )?
            {
             before(grammarAccess.getPhenomenonAccess().getTypeAssignment_0()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:944:1: ( rule__Phenomenon__TypeAssignment_0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=18 && LA13_0<=20)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:944:2: rule__Phenomenon__TypeAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Phenomenon__TypeAssignment_0_in_rule__Phenomenon__Group__01892);
                    rule__Phenomenon__TypeAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPhenomenonAccess().getTypeAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Phenomenon__Group__1_in_rule__Phenomenon__Group__01902);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:955:1: rule__Phenomenon__Group__1 : ( ( rule__Phenomenon__IsControlledAssignment_1 )? ) rule__Phenomenon__Group__2 ;
    public final void rule__Phenomenon__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:959:1: ( ( ( rule__Phenomenon__IsControlledAssignment_1 )? ) rule__Phenomenon__Group__2 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:960:1: ( ( rule__Phenomenon__IsControlledAssignment_1 )? ) rule__Phenomenon__Group__2
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:960:1: ( ( rule__Phenomenon__IsControlledAssignment_1 )? )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:961:1: ( rule__Phenomenon__IsControlledAssignment_1 )?
            {
             before(grammarAccess.getPhenomenonAccess().getIsControlledAssignment_1()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:962:1: ( rule__Phenomenon__IsControlledAssignment_1 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==31) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:962:2: rule__Phenomenon__IsControlledAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Phenomenon__IsControlledAssignment_1_in_rule__Phenomenon__Group__11930);
                    rule__Phenomenon__IsControlledAssignment_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPhenomenonAccess().getIsControlledAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Phenomenon__Group__2_in_rule__Phenomenon__Group__11940);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:973:1: rule__Phenomenon__Group__2 : ( ( rule__Phenomenon__NameAssignment_2 ) ) rule__Phenomenon__Group__3 ;
    public final void rule__Phenomenon__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:977:1: ( ( ( rule__Phenomenon__NameAssignment_2 ) ) rule__Phenomenon__Group__3 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:978:1: ( ( rule__Phenomenon__NameAssignment_2 ) ) rule__Phenomenon__Group__3
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:978:1: ( ( rule__Phenomenon__NameAssignment_2 ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:979:1: ( rule__Phenomenon__NameAssignment_2 )
            {
             before(grammarAccess.getPhenomenonAccess().getNameAssignment_2()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:980:1: ( rule__Phenomenon__NameAssignment_2 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:980:2: rule__Phenomenon__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Phenomenon__NameAssignment_2_in_rule__Phenomenon__Group__21968);
            rule__Phenomenon__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getPhenomenonAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__Phenomenon__Group__3_in_rule__Phenomenon__Group__21977);
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


    // $ANTLR start rule__Phenomenon__Group__3
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:991:1: rule__Phenomenon__Group__3 : ( ( rule__Phenomenon__Group_3__0 )? ) ;
    public final void rule__Phenomenon__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:995:1: ( ( ( rule__Phenomenon__Group_3__0 )? ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:996:1: ( ( rule__Phenomenon__Group_3__0 )? )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:996:1: ( ( rule__Phenomenon__Group_3__0 )? )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:997:1: ( rule__Phenomenon__Group_3__0 )?
            {
             before(grammarAccess.getPhenomenonAccess().getGroup_3()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:998:1: ( rule__Phenomenon__Group_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:998:2: rule__Phenomenon__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Phenomenon__Group_3__0_in_rule__Phenomenon__Group__32005);
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
    // $ANTLR end rule__Phenomenon__Group__3


    // $ANTLR start rule__Phenomenon__Group_3__0
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1016:1: rule__Phenomenon__Group_3__0 : ( ':' ) rule__Phenomenon__Group_3__1 ;
    public final void rule__Phenomenon__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1020:1: ( ( ':' ) rule__Phenomenon__Group_3__1 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1021:1: ( ':' ) rule__Phenomenon__Group_3__1
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1021:1: ( ':' )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1022:1: ':'
            {
             before(grammarAccess.getPhenomenonAccess().getColonKeyword_3_0()); 
            match(input,25,FOLLOW_25_in_rule__Phenomenon__Group_3__02049); 
             after(grammarAccess.getPhenomenonAccess().getColonKeyword_3_0()); 

            }

            pushFollow(FOLLOW_rule__Phenomenon__Group_3__1_in_rule__Phenomenon__Group_3__02059);
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


    // $ANTLR start rule__Phenomenon__Group_3__1
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1036:1: rule__Phenomenon__Group_3__1 : ( ( rule__Phenomenon__DescriptionAssignment_3_1 ) ) ;
    public final void rule__Phenomenon__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1040:1: ( ( ( rule__Phenomenon__DescriptionAssignment_3_1 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1041:1: ( ( rule__Phenomenon__DescriptionAssignment_3_1 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1041:1: ( ( rule__Phenomenon__DescriptionAssignment_3_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1042:1: ( rule__Phenomenon__DescriptionAssignment_3_1 )
            {
             before(grammarAccess.getPhenomenonAccess().getDescriptionAssignment_3_1()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1043:1: ( rule__Phenomenon__DescriptionAssignment_3_1 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1043:2: rule__Phenomenon__DescriptionAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Phenomenon__DescriptionAssignment_3_1_in_rule__Phenomenon__Group_3__12087);
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
    // $ANTLR end rule__Phenomenon__Group_3__1


    // $ANTLR start rule__Link__Group__0
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1057:1: rule__Link__Group__0 : ( ( rule__Link__FromAssignment_0 ) ) rule__Link__Group__1 ;
    public final void rule__Link__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1061:1: ( ( ( rule__Link__FromAssignment_0 ) ) rule__Link__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1062:1: ( ( rule__Link__FromAssignment_0 ) ) rule__Link__Group__1
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1062:1: ( ( rule__Link__FromAssignment_0 ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1063:1: ( rule__Link__FromAssignment_0 )
            {
             before(grammarAccess.getLinkAccess().getFromAssignment_0()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1064:1: ( rule__Link__FromAssignment_0 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1064:2: rule__Link__FromAssignment_0
            {
            pushFollow(FOLLOW_rule__Link__FromAssignment_0_in_rule__Link__Group__02125);
            rule__Link__FromAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getLinkAccess().getFromAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Link__Group__1_in_rule__Link__Group__02134);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1075:1: rule__Link__Group__1 : ( ( rule__Link__TypeAssignment_1 ) ) rule__Link__Group__2 ;
    public final void rule__Link__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1079:1: ( ( ( rule__Link__TypeAssignment_1 ) ) rule__Link__Group__2 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1080:1: ( ( rule__Link__TypeAssignment_1 ) ) rule__Link__Group__2
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1080:1: ( ( rule__Link__TypeAssignment_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1081:1: ( rule__Link__TypeAssignment_1 )
            {
             before(grammarAccess.getLinkAccess().getTypeAssignment_1()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1082:1: ( rule__Link__TypeAssignment_1 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1082:2: rule__Link__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Link__TypeAssignment_1_in_rule__Link__Group__12162);
            rule__Link__TypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getLinkAccess().getTypeAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Link__Group__2_in_rule__Link__Group__12171);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1093:1: rule__Link__Group__2 : ( ( rule__Link__ToAssignment_2 ) ) rule__Link__Group__3 ;
    public final void rule__Link__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1097:1: ( ( ( rule__Link__ToAssignment_2 ) ) rule__Link__Group__3 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1098:1: ( ( rule__Link__ToAssignment_2 ) ) rule__Link__Group__3
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1098:1: ( ( rule__Link__ToAssignment_2 ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1099:1: ( rule__Link__ToAssignment_2 )
            {
             before(grammarAccess.getLinkAccess().getToAssignment_2()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1100:1: ( rule__Link__ToAssignment_2 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1100:2: rule__Link__ToAssignment_2
            {
            pushFollow(FOLLOW_rule__Link__ToAssignment_2_in_rule__Link__Group__22199);
            rule__Link__ToAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getLinkAccess().getToAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__Link__Group__3_in_rule__Link__Group__22208);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1111:1: rule__Link__Group__3 : ( ( rule__Link__Group_3__0 )? ) rule__Link__Group__4 ;
    public final void rule__Link__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1115:1: ( ( ( rule__Link__Group_3__0 )? ) rule__Link__Group__4 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1116:1: ( ( rule__Link__Group_3__0 )? ) rule__Link__Group__4
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1116:1: ( ( rule__Link__Group_3__0 )? )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1117:1: ( rule__Link__Group_3__0 )?
            {
             before(grammarAccess.getLinkAccess().getGroup_3()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1118:1: ( rule__Link__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1118:2: rule__Link__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Link__Group_3__0_in_rule__Link__Group__32236);
                    rule__Link__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLinkAccess().getGroup_3()); 

            }

            pushFollow(FOLLOW_rule__Link__Group__4_in_rule__Link__Group__32246);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1129:1: rule__Link__Group__4 : ( ( rule__Link__Group_4__0 )? ) ;
    public final void rule__Link__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1133:1: ( ( ( rule__Link__Group_4__0 )? ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1134:1: ( ( rule__Link__Group_4__0 )? )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1134:1: ( ( rule__Link__Group_4__0 )? )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1135:1: ( rule__Link__Group_4__0 )?
            {
             before(grammarAccess.getLinkAccess().getGroup_4()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1136:1: ( rule__Link__Group_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==25) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1136:2: rule__Link__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Link__Group_4__0_in_rule__Link__Group__42274);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1156:1: rule__Link__Group_3__0 : ( '{' ) rule__Link__Group_3__1 ;
    public final void rule__Link__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1160:1: ( ( '{' ) rule__Link__Group_3__1 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1161:1: ( '{' ) rule__Link__Group_3__1
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1161:1: ( '{' )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1162:1: '{'
            {
             before(grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,26,FOLLOW_26_in_rule__Link__Group_3__02320); 
             after(grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_3_0()); 

            }

            pushFollow(FOLLOW_rule__Link__Group_3__1_in_rule__Link__Group_3__02330);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1176:1: rule__Link__Group_3__1 : ( ( rule__Link__PhenomenaAssignment_3_1 ) ) rule__Link__Group_3__2 ;
    public final void rule__Link__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1180:1: ( ( ( rule__Link__PhenomenaAssignment_3_1 ) ) rule__Link__Group_3__2 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1181:1: ( ( rule__Link__PhenomenaAssignment_3_1 ) ) rule__Link__Group_3__2
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1181:1: ( ( rule__Link__PhenomenaAssignment_3_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1182:1: ( rule__Link__PhenomenaAssignment_3_1 )
            {
             before(grammarAccess.getLinkAccess().getPhenomenaAssignment_3_1()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1183:1: ( rule__Link__PhenomenaAssignment_3_1 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1183:2: rule__Link__PhenomenaAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Link__PhenomenaAssignment_3_1_in_rule__Link__Group_3__12358);
            rule__Link__PhenomenaAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getLinkAccess().getPhenomenaAssignment_3_1()); 

            }

            pushFollow(FOLLOW_rule__Link__Group_3__2_in_rule__Link__Group_3__12367);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1194:1: rule__Link__Group_3__2 : ( ( rule__Link__Group_3_2__0 )* ) rule__Link__Group_3__3 ;
    public final void rule__Link__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1198:1: ( ( ( rule__Link__Group_3_2__0 )* ) rule__Link__Group_3__3 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1199:1: ( ( rule__Link__Group_3_2__0 )* ) rule__Link__Group_3__3
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1199:1: ( ( rule__Link__Group_3_2__0 )* )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1200:1: ( rule__Link__Group_3_2__0 )*
            {
             before(grammarAccess.getLinkAccess().getGroup_3_2()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1201:1: ( rule__Link__Group_3_2__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==28) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1201:2: rule__Link__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Link__Group_3_2__0_in_rule__Link__Group_3__22395);
            	    rule__Link__Group_3_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getLinkAccess().getGroup_3_2()); 

            }

            pushFollow(FOLLOW_rule__Link__Group_3__3_in_rule__Link__Group_3__22405);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1212:1: rule__Link__Group_3__3 : ( '}' ) ;
    public final void rule__Link__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1216:1: ( ( '}' ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1217:1: ( '}' )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1217:1: ( '}' )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1218:1: '}'
            {
             before(grammarAccess.getLinkAccess().getRightCurlyBracketKeyword_3_3()); 
            match(input,27,FOLLOW_27_in_rule__Link__Group_3__32434); 
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1239:1: rule__Link__Group_3_2__0 : ( ',' ) rule__Link__Group_3_2__1 ;
    public final void rule__Link__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1243:1: ( ( ',' ) rule__Link__Group_3_2__1 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1244:1: ( ',' ) rule__Link__Group_3_2__1
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1244:1: ( ',' )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1245:1: ','
            {
             before(grammarAccess.getLinkAccess().getCommaKeyword_3_2_0()); 
            match(input,28,FOLLOW_28_in_rule__Link__Group_3_2__02478); 
             after(grammarAccess.getLinkAccess().getCommaKeyword_3_2_0()); 

            }

            pushFollow(FOLLOW_rule__Link__Group_3_2__1_in_rule__Link__Group_3_2__02488);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1259:1: rule__Link__Group_3_2__1 : ( ( rule__Link__PhenomenaAssignment_3_2_1 ) ) ;
    public final void rule__Link__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1263:1: ( ( ( rule__Link__PhenomenaAssignment_3_2_1 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1264:1: ( ( rule__Link__PhenomenaAssignment_3_2_1 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1264:1: ( ( rule__Link__PhenomenaAssignment_3_2_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1265:1: ( rule__Link__PhenomenaAssignment_3_2_1 )
            {
             before(grammarAccess.getLinkAccess().getPhenomenaAssignment_3_2_1()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1266:1: ( rule__Link__PhenomenaAssignment_3_2_1 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1266:2: rule__Link__PhenomenaAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__Link__PhenomenaAssignment_3_2_1_in_rule__Link__Group_3_2__12516);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1280:1: rule__Link__Group_4__0 : ( ':' ) rule__Link__Group_4__1 ;
    public final void rule__Link__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1284:1: ( ( ':' ) rule__Link__Group_4__1 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1285:1: ( ':' ) rule__Link__Group_4__1
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1285:1: ( ':' )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1286:1: ':'
            {
             before(grammarAccess.getLinkAccess().getColonKeyword_4_0()); 
            match(input,25,FOLLOW_25_in_rule__Link__Group_4__02555); 
             after(grammarAccess.getLinkAccess().getColonKeyword_4_0()); 

            }

            pushFollow(FOLLOW_rule__Link__Group_4__1_in_rule__Link__Group_4__02565);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1300:1: rule__Link__Group_4__1 : ( ( rule__Link__DescriptionAssignment_4_1 ) ) ;
    public final void rule__Link__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1304:1: ( ( ( rule__Link__DescriptionAssignment_4_1 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1305:1: ( ( rule__Link__DescriptionAssignment_4_1 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1305:1: ( ( rule__Link__DescriptionAssignment_4_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1306:1: ( rule__Link__DescriptionAssignment_4_1 )
            {
             before(grammarAccess.getLinkAccess().getDescriptionAssignment_4_1()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1307:1: ( rule__Link__DescriptionAssignment_4_1 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1307:2: rule__Link__DescriptionAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Link__DescriptionAssignment_4_1_in_rule__Link__Group_4__12593);
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


    // $ANTLR start rule__ProblemDiagram__NameAssignment_2
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1321:1: rule__ProblemDiagram__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ProblemDiagram__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1325:1: ( ( RULE_STRING ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1326:1: ( RULE_STRING )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1326:1: ( RULE_STRING )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1327:1: RULE_STRING
            {
             before(grammarAccess.getProblemDiagramAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ProblemDiagram__NameAssignment_22631); 
             after(grammarAccess.getProblemDiagramAccess().getNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
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


    // $ANTLR start rule__ProblemDiagram__NodesAssignment_3_0
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1336:1: rule__ProblemDiagram__NodesAssignment_3_0 : ( ruleNode ) ;
    public final void rule__ProblemDiagram__NodesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1340:1: ( ( ruleNode ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1341:1: ( ruleNode )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1341:1: ( ruleNode )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1342:1: ruleNode
            {
             before(grammarAccess.getProblemDiagramAccess().getNodesNodeParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_ruleNode_in_rule__ProblemDiagram__NodesAssignment_3_02662);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1351:1: rule__ProblemDiagram__LinksAssignment_3_1 : ( ruleLink ) ;
    public final void rule__ProblemDiagram__LinksAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1355:1: ( ( ruleLink ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1356:1: ( ruleLink )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1356:1: ( ruleLink )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1357:1: ruleLink
            {
             before(grammarAccess.getProblemDiagramAccess().getLinksLinkParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleLink_in_rule__ProblemDiagram__LinksAssignment_3_12693);
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


    // $ANTLR start rule__Node__NameAssignment_0
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1366:1: rule__Node__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Node__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1370:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1371:1: ( RULE_ID )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1371:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1372:1: RULE_ID
            {
             before(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Node__NameAssignment_02724); 
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1381:1: rule__Node__TypeAssignment_1 : ( ruleNodeType ) ;
    public final void rule__Node__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1385:1: ( ( ruleNodeType ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1386:1: ( ruleNodeType )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1386:1: ( ruleNodeType )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1387:1: ruleNodeType
            {
             before(grammarAccess.getNodeAccess().getTypeNodeTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleNodeType_in_rule__Node__TypeAssignment_12755);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1396:1: rule__Node__DescriptionAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Node__DescriptionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1400:1: ( ( RULE_STRING ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1401:1: ( RULE_STRING )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1401:1: ( RULE_STRING )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1402:1: RULE_STRING
            {
             before(grammarAccess.getNodeAccess().getDescriptionSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Node__DescriptionAssignment_2_12786); 
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1411:1: rule__Node__HiddenPhenomenaAssignment_3_1_0 : ( rulePhenomenon ) ;
    public final void rule__Node__HiddenPhenomenaAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1415:1: ( ( rulePhenomenon ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1416:1: ( rulePhenomenon )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1416:1: ( rulePhenomenon )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1417:1: rulePhenomenon
            {
             before(grammarAccess.getNodeAccess().getHiddenPhenomenaPhenomenonParserRuleCall_3_1_0_0()); 
            pushFollow(FOLLOW_rulePhenomenon_in_rule__Node__HiddenPhenomenaAssignment_3_1_02817);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1426:1: rule__Node__HiddenPhenomenaAssignment_3_1_1_1 : ( rulePhenomenon ) ;
    public final void rule__Node__HiddenPhenomenaAssignment_3_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1430:1: ( ( rulePhenomenon ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1431:1: ( rulePhenomenon )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1431:1: ( rulePhenomenon )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1432:1: rulePhenomenon
            {
             before(grammarAccess.getNodeAccess().getHiddenPhenomenaPhenomenonParserRuleCall_3_1_1_1_0()); 
            pushFollow(FOLLOW_rulePhenomenon_in_rule__Node__HiddenPhenomenaAssignment_3_1_1_12848);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1441:1: rule__Node__SubproblemAssignment_3_2_0 : ( ruleProblemDiagram ) ;
    public final void rule__Node__SubproblemAssignment_3_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1445:1: ( ( ruleProblemDiagram ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1446:1: ( ruleProblemDiagram )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1446:1: ( ruleProblemDiagram )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1447:1: ruleProblemDiagram
            {
             before(grammarAccess.getNodeAccess().getSubproblemProblemDiagramParserRuleCall_3_2_0_0()); 
            pushFollow(FOLLOW_ruleProblemDiagram_in_rule__Node__SubproblemAssignment_3_2_02879);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1456:1: rule__Node__ProblemNodeRefAssignment_3_2_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__Node__ProblemNodeRefAssignment_3_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1460:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1461:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1461:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1462:1: ( RULE_ID )
            {
             before(grammarAccess.getNodeAccess().getProblemNodeRefNodeCrossReference_3_2_1_2_0()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1463:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1464:1: RULE_ID
            {
             before(grammarAccess.getNodeAccess().getProblemNodeRefNodeIDTerminalRuleCall_3_2_1_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Node__ProblemNodeRefAssignment_3_2_1_22914); 
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1475:1: rule__Node__ProblemRefAssignment_3_2_2_2 : ( ( RULE_ID ) ) ;
    public final void rule__Node__ProblemRefAssignment_3_2_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1479:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1480:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1480:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1481:1: ( RULE_ID )
            {
             before(grammarAccess.getNodeAccess().getProblemRefProblemDiagramCrossReference_3_2_2_2_0()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1482:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1483:1: RULE_ID
            {
             before(grammarAccess.getNodeAccess().getProblemRefProblemDiagramIDTerminalRuleCall_3_2_2_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Node__ProblemRefAssignment_3_2_2_22953); 
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1494:1: rule__Node__HrefAssignment_3_2_3_1 : ( RULE_STRING ) ;
    public final void rule__Node__HrefAssignment_3_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1498:1: ( ( RULE_STRING ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1499:1: ( RULE_STRING )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1499:1: ( RULE_STRING )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1500:1: RULE_STRING
            {
             before(grammarAccess.getNodeAccess().getHrefSTRINGTerminalRuleCall_3_2_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Node__HrefAssignment_3_2_3_12988); 
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1509:1: rule__Phenomenon__TypeAssignment_0 : ( rulePhenomenonType ) ;
    public final void rule__Phenomenon__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1513:1: ( ( rulePhenomenonType ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1514:1: ( rulePhenomenonType )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1514:1: ( rulePhenomenonType )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1515:1: rulePhenomenonType
            {
             before(grammarAccess.getPhenomenonAccess().getTypePhenomenonTypeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_rulePhenomenonType_in_rule__Phenomenon__TypeAssignment_03019);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1524:1: rule__Phenomenon__IsControlledAssignment_1 : ( ( '!' ) ) ;
    public final void rule__Phenomenon__IsControlledAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1528:1: ( ( ( '!' ) ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1529:1: ( ( '!' ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1529:1: ( ( '!' ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1530:1: ( '!' )
            {
             before(grammarAccess.getPhenomenonAccess().getIsControlledExclamationMarkKeyword_1_0()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1531:1: ( '!' )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1532:1: '!'
            {
             before(grammarAccess.getPhenomenonAccess().getIsControlledExclamationMarkKeyword_1_0()); 
            match(input,31,FOLLOW_31_in_rule__Phenomenon__IsControlledAssignment_13055); 
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1547:1: rule__Phenomenon__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Phenomenon__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1551:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1552:1: ( RULE_ID )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1552:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1553:1: RULE_ID
            {
             before(grammarAccess.getPhenomenonAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Phenomenon__NameAssignment_23094); 
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1562:1: rule__Phenomenon__DescriptionAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Phenomenon__DescriptionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1566:1: ( ( RULE_STRING ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1567:1: ( RULE_STRING )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1567:1: ( RULE_STRING )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1568:1: RULE_STRING
            {
             before(grammarAccess.getPhenomenonAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Phenomenon__DescriptionAssignment_3_13125); 
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1577:1: rule__Link__FromAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Link__FromAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1581:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1582:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1582:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1583:1: ( RULE_ID )
            {
             before(grammarAccess.getLinkAccess().getFromNodeCrossReference_0_0()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1584:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1585:1: RULE_ID
            {
             before(grammarAccess.getLinkAccess().getFromNodeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Link__FromAssignment_03160); 
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1596:1: rule__Link__TypeAssignment_1 : ( ruleLinkType ) ;
    public final void rule__Link__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1600:1: ( ( ruleLinkType ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1601:1: ( ruleLinkType )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1601:1: ( ruleLinkType )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1602:1: ruleLinkType
            {
             before(grammarAccess.getLinkAccess().getTypeLinkTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleLinkType_in_rule__Link__TypeAssignment_13195);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1611:1: rule__Link__ToAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Link__ToAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1615:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1616:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1616:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1617:1: ( RULE_ID )
            {
             before(grammarAccess.getLinkAccess().getToNodeCrossReference_2_0()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1618:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1619:1: RULE_ID
            {
             before(grammarAccess.getLinkAccess().getToNodeIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Link__ToAssignment_23230); 
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1630:1: rule__Link__PhenomenaAssignment_3_1 : ( rulePhenomenon ) ;
    public final void rule__Link__PhenomenaAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1634:1: ( ( rulePhenomenon ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1635:1: ( rulePhenomenon )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1635:1: ( rulePhenomenon )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1636:1: rulePhenomenon
            {
             before(grammarAccess.getLinkAccess().getPhenomenaPhenomenonParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_rulePhenomenon_in_rule__Link__PhenomenaAssignment_3_13265);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1645:1: rule__Link__PhenomenaAssignment_3_2_1 : ( rulePhenomenon ) ;
    public final void rule__Link__PhenomenaAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1649:1: ( ( rulePhenomenon ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1650:1: ( rulePhenomenon )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1650:1: ( rulePhenomenon )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1651:1: rulePhenomenon
            {
             before(grammarAccess.getLinkAccess().getPhenomenaPhenomenonParserRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_rulePhenomenon_in_rule__Link__PhenomenaAssignment_3_2_13296);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1660:1: rule__Link__DescriptionAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Link__DescriptionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1664:1: ( ( RULE_STRING ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1665:1: ( RULE_STRING )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1665:1: ( RULE_STRING )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1666:1: RULE_STRING
            {
             before(grammarAccess.getLinkAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Link__DescriptionAssignment_4_13327); 
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
    public static final BitSet FOLLOW_rule__NodeType__Alternatives_in_ruleNodeType311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PhenomenonType__Alternatives_in_rulePhenomenonType347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinkType__Alternatives_in_ruleLinkType383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__NodesAssignment_3_0_in_rule__ProblemDiagram__Alternatives_3418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__LinksAssignment_3_1_in_rule__ProblemDiagram__Alternatives_3436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__SubproblemAssignment_3_2_0_in_rule__Node__Alternatives_3_2469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3_2_1__0_in_rule__Node__Alternatives_3_2487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3_2_2__0_in_rule__Node__Alternatives_3_2505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3_2_3__0_in_rule__Node__Alternatives_3_2523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__NodeType__Alternatives557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__NodeType__Alternatives578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__NodeType__Alternatives599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__NodeType__Alternatives620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__NodeType__Alternatives641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__NodeType__Alternatives662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__NodeType__Alternatives683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__PhenomenonType__Alternatives719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__PhenomenonType__Alternatives740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__PhenomenonType__Alternatives761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__LinkType__Alternatives797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__LinkType__Alternatives818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__LinkType__Alternatives839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ProblemDiagram__Group__0877 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__Group__1_in_rule__ProblemDiagram__Group__0887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ProblemDiagram__Group__1916 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__Group__2_in_rule__ProblemDiagram__Group__1926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__NameAssignment_2_in_rule__ProblemDiagram__Group__2954 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__Group__3_in_rule__ProblemDiagram__Group__2963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__Alternatives_3_in_rule__ProblemDiagram__Group__3991 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Node__NameAssignment_0_in_rule__Node__Group__01034 = new BitSet(new long[]{0x000000000603F802L});
    public static final BitSet FOLLOW_rule__Node__Group__1_in_rule__Node__Group__01043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__TypeAssignment_1_in_rule__Node__Group__11071 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_rule__Node__Group__2_in_rule__Node__Group__11081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_2__0_in_rule__Node__Group__21109 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Node__Group__3_in_rule__Node__Group__21119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3__0_in_rule__Node__Group__31147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Node__Group_2__01191 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Node__Group_2__1_in_rule__Node__Group_2__01201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__DescriptionAssignment_2_1_in_rule__Node__Group_2__11229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Node__Group_3__01268 = new BitSet(new long[]{0x00000000A91C0020L});
    public static final BitSet FOLLOW_rule__Node__Group_3__1_in_rule__Node__Group_3__01278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3_1__0_in_rule__Node__Group_3__11306 = new BitSet(new long[]{0x0000000029000000L});
    public static final BitSet FOLLOW_rule__Node__Group_3__2_in_rule__Node__Group_3__11316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Alternatives_3_2_in_rule__Node__Group_3__21344 = new BitSet(new long[]{0x0000000029000000L});
    public static final BitSet FOLLOW_rule__Node__Group_3__3_in_rule__Node__Group_3__21354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Node__Group_3__31383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__HiddenPhenomenaAssignment_3_1_0_in_rule__Node__Group_3_1__01426 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3_1__1_in_rule__Node__Group_3_1__01435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3_1_1__0_in_rule__Node__Group_3_1__11463 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_rule__Node__Group_3_1_1__01503 = new BitSet(new long[]{0x00000000801C0020L});
    public static final BitSet FOLLOW_rule__Node__Group_3_1_1__1_in_rule__Node__Group_3_1_1__01513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__HiddenPhenomenaAssignment_3_1_1_1_in_rule__Node__Group_3_1_1__11541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Node__Group_3_2_1__01580 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Node__Group_3_2_1__1_in_rule__Node__Group_3_2_1__01590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Node__Group_3_2_1__11619 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Node__Group_3_2_1__2_in_rule__Node__Group_3_2_1__11629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__ProblemNodeRefAssignment_3_2_1_2_in_rule__Node__Group_3_2_1__21657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Node__Group_3_2_2__01698 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Node__Group_3_2_2__1_in_rule__Node__Group_3_2_2__01708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Node__Group_3_2_2__11737 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Node__Group_3_2_2__2_in_rule__Node__Group_3_2_2__11747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__ProblemRefAssignment_3_2_2_2_in_rule__Node__Group_3_2_2__21775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Node__Group_3_2_3__01816 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Node__Group_3_2_3__1_in_rule__Node__Group_3_2_3__01826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__HrefAssignment_3_2_3_1_in_rule__Node__Group_3_2_3__11854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Phenomenon__TypeAssignment_0_in_rule__Phenomenon__Group__01892 = new BitSet(new long[]{0x0000000080000020L});
    public static final BitSet FOLLOW_rule__Phenomenon__Group__1_in_rule__Phenomenon__Group__01902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Phenomenon__IsControlledAssignment_1_in_rule__Phenomenon__Group__11930 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Phenomenon__Group__2_in_rule__Phenomenon__Group__11940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Phenomenon__NameAssignment_2_in_rule__Phenomenon__Group__21968 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Phenomenon__Group__3_in_rule__Phenomenon__Group__21977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Phenomenon__Group_3__0_in_rule__Phenomenon__Group__32005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Phenomenon__Group_3__02049 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Phenomenon__Group_3__1_in_rule__Phenomenon__Group_3__02059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Phenomenon__DescriptionAssignment_3_1_in_rule__Phenomenon__Group_3__12087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__FromAssignment_0_in_rule__Link__Group__02125 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_rule__Link__Group__1_in_rule__Link__Group__02134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__TypeAssignment_1_in_rule__Link__Group__12162 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Link__Group__2_in_rule__Link__Group__12171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__ToAssignment_2_in_rule__Link__Group__22199 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_rule__Link__Group__3_in_rule__Link__Group__22208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group_3__0_in_rule__Link__Group__32236 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Link__Group__4_in_rule__Link__Group__32246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group_4__0_in_rule__Link__Group__42274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Link__Group_3__02320 = new BitSet(new long[]{0x00000000801C0020L});
    public static final BitSet FOLLOW_rule__Link__Group_3__1_in_rule__Link__Group_3__02330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__PhenomenaAssignment_3_1_in_rule__Link__Group_3__12358 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_rule__Link__Group_3__2_in_rule__Link__Group_3__12367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group_3_2__0_in_rule__Link__Group_3__22395 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_rule__Link__Group_3__3_in_rule__Link__Group_3__22405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Link__Group_3__32434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Link__Group_3_2__02478 = new BitSet(new long[]{0x00000000801C0020L});
    public static final BitSet FOLLOW_rule__Link__Group_3_2__1_in_rule__Link__Group_3_2__02488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__PhenomenaAssignment_3_2_1_in_rule__Link__Group_3_2__12516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Link__Group_4__02555 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Link__Group_4__1_in_rule__Link__Group_4__02565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__DescriptionAssignment_4_1_in_rule__Link__Group_4__12593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ProblemDiagram__NameAssignment_22631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_rule__ProblemDiagram__NodesAssignment_3_02662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_rule__ProblemDiagram__LinksAssignment_3_12693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Node__NameAssignment_02724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeType_in_rule__Node__TypeAssignment_12755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Node__DescriptionAssignment_2_12786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhenomenon_in_rule__Node__HiddenPhenomenaAssignment_3_1_02817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhenomenon_in_rule__Node__HiddenPhenomenaAssignment_3_1_1_12848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProblemDiagram_in_rule__Node__SubproblemAssignment_3_2_02879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Node__ProblemNodeRefAssignment_3_2_1_22914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Node__ProblemRefAssignment_3_2_2_22953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Node__HrefAssignment_3_2_3_12988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhenomenonType_in_rule__Phenomenon__TypeAssignment_03019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Phenomenon__IsControlledAssignment_13055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Phenomenon__NameAssignment_23094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Phenomenon__DescriptionAssignment_3_13125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Link__FromAssignment_03160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkType_in_rule__Link__TypeAssignment_13195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Link__ToAssignment_23230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhenomenon_in_rule__Link__PhenomenaAssignment_3_13265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhenomenon_in_rule__Link__PhenomenaAssignment_3_2_13296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Link__DescriptionAssignment_4_13327 = new BitSet(new long[]{0x0000000000000002L});

}