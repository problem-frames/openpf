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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'R'", "'M'", "'B'", "'X'", "'C'", "'D'", "'P'", "'phenomenon'", "'event'", "'state'", "'->'", "'~~'", "'~>'", "'problem'", "':'", "'{'", "'}'", "','"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=5;
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


    // $ANTLR start rule__ProblemDiagram__Alternatives_1
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:225:1: rule__ProblemDiagram__Alternatives_1 : ( ( ( rule__ProblemDiagram__NodesAssignment_1_0 ) ) | ( ( rule__ProblemDiagram__LinksAssignment_1_1 ) ) );
    public final void rule__ProblemDiagram__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:229:1: ( ( ( rule__ProblemDiagram__NodesAssignment_1_0 ) ) | ( ( rule__ProblemDiagram__LinksAssignment_1_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                int LA1_1 = input.LA(2);

                if ( ((LA1_1>=21 && LA1_1<=23)) ) {
                    alt1=2;
                }
                else if ( (LA1_1==EOF||LA1_1==RULE_ID||(LA1_1>=11 && LA1_1<=17)||LA1_1==25) ) {
                    alt1=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("225:1: rule__ProblemDiagram__Alternatives_1 : ( ( ( rule__ProblemDiagram__NodesAssignment_1_0 ) ) | ( ( rule__ProblemDiagram__LinksAssignment_1_1 ) ) );", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("225:1: rule__ProblemDiagram__Alternatives_1 : ( ( ( rule__ProblemDiagram__NodesAssignment_1_0 ) ) | ( ( rule__ProblemDiagram__LinksAssignment_1_1 ) ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:230:1: ( ( rule__ProblemDiagram__NodesAssignment_1_0 ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:230:1: ( ( rule__ProblemDiagram__NodesAssignment_1_0 ) )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:231:1: ( rule__ProblemDiagram__NodesAssignment_1_0 )
                    {
                     before(grammarAccess.getProblemDiagramAccess().getNodesAssignment_1_0()); 
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:232:1: ( rule__ProblemDiagram__NodesAssignment_1_0 )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:232:2: rule__ProblemDiagram__NodesAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__ProblemDiagram__NodesAssignment_1_0_in_rule__ProblemDiagram__Alternatives_1418);
                    rule__ProblemDiagram__NodesAssignment_1_0();
                    _fsp--;


                    }

                     after(grammarAccess.getProblemDiagramAccess().getNodesAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:236:6: ( ( rule__ProblemDiagram__LinksAssignment_1_1 ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:236:6: ( ( rule__ProblemDiagram__LinksAssignment_1_1 ) )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:237:1: ( rule__ProblemDiagram__LinksAssignment_1_1 )
                    {
                     before(grammarAccess.getProblemDiagramAccess().getLinksAssignment_1_1()); 
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:238:1: ( rule__ProblemDiagram__LinksAssignment_1_1 )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:238:2: rule__ProblemDiagram__LinksAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__ProblemDiagram__LinksAssignment_1_1_in_rule__ProblemDiagram__Alternatives_1436);
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


    // $ANTLR start rule__Phenomenon__NameAlternatives_1_0
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:247:1: rule__Phenomenon__NameAlternatives_1_0 : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__Phenomenon__NameAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:251:1: ( ( RULE_ID ) | ( RULE_STRING ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_STRING) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("247:1: rule__Phenomenon__NameAlternatives_1_0 : ( ( RULE_ID ) | ( RULE_STRING ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:252:1: ( RULE_ID )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:252:1: ( RULE_ID )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:253:1: RULE_ID
                    {
                     before(grammarAccess.getPhenomenonAccess().getNameIDTerminalRuleCall_1_0_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Phenomenon__NameAlternatives_1_0469); 
                     after(grammarAccess.getPhenomenonAccess().getNameIDTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:258:6: ( RULE_STRING )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:258:6: ( RULE_STRING )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:259:1: RULE_STRING
                    {
                     before(grammarAccess.getPhenomenonAccess().getNameSTRINGTerminalRuleCall_1_0_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Phenomenon__NameAlternatives_1_0486); 
                     after(grammarAccess.getPhenomenonAccess().getNameSTRINGTerminalRuleCall_1_0_1()); 

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
    // $ANTLR end rule__Phenomenon__NameAlternatives_1_0


    // $ANTLR start rule__NodeType__Alternatives
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:269:1: rule__NodeType__Alternatives : ( ( ( 'R' ) ) | ( ( 'M' ) ) | ( ( 'B' ) ) | ( ( 'X' ) ) | ( ( 'C' ) ) | ( ( 'D' ) ) | ( ( 'P' ) ) );
    public final void rule__NodeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:273:1: ( ( ( 'R' ) ) | ( ( 'M' ) ) | ( ( 'B' ) ) | ( ( 'X' ) ) | ( ( 'C' ) ) | ( ( 'D' ) ) | ( ( 'P' ) ) )
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
                    new NoViableAltException("269:1: rule__NodeType__Alternatives : ( ( ( 'R' ) ) | ( ( 'M' ) ) | ( ( 'B' ) ) | ( ( 'X' ) ) | ( ( 'C' ) ) | ( ( 'D' ) ) | ( ( 'P' ) ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:274:1: ( ( 'R' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:274:1: ( ( 'R' ) )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:275:1: ( 'R' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getREQUIREMENTEnumLiteralDeclaration_0()); 
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:276:1: ( 'R' )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:276:3: 'R'
                    {
                    match(input,11,FOLLOW_11_in_rule__NodeType__Alternatives519); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getREQUIREMENTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:281:6: ( ( 'M' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:281:6: ( ( 'M' ) )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:282:1: ( 'M' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getMACHINEEnumLiteralDeclaration_1()); 
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:283:1: ( 'M' )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:283:3: 'M'
                    {
                    match(input,12,FOLLOW_12_in_rule__NodeType__Alternatives540); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getMACHINEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:288:6: ( ( 'B' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:288:6: ( ( 'B' ) )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:289:1: ( 'B' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getBIDDABLEEnumLiteralDeclaration_2()); 
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:290:1: ( 'B' )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:290:3: 'B'
                    {
                    match(input,13,FOLLOW_13_in_rule__NodeType__Alternatives561); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getBIDDABLEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:295:6: ( ( 'X' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:295:6: ( ( 'X' ) )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:296:1: ( 'X' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getLEXICALEnumLiteralDeclaration_3()); 
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:297:1: ( 'X' )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:297:3: 'X'
                    {
                    match(input,14,FOLLOW_14_in_rule__NodeType__Alternatives582); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getLEXICALEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:302:6: ( ( 'C' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:302:6: ( ( 'C' ) )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:303:1: ( 'C' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getCAUSALEnumLiteralDeclaration_4()); 
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:304:1: ( 'C' )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:304:3: 'C'
                    {
                    match(input,15,FOLLOW_15_in_rule__NodeType__Alternatives603); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getCAUSALEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:309:6: ( ( 'D' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:309:6: ( ( 'D' ) )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:310:1: ( 'D' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getDESIGNEDEnumLiteralDeclaration_5()); 
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:311:1: ( 'D' )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:311:3: 'D'
                    {
                    match(input,16,FOLLOW_16_in_rule__NodeType__Alternatives624); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getDESIGNEDEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:316:6: ( ( 'P' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:316:6: ( ( 'P' ) )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:317:1: ( 'P' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getPHYSICALEnumLiteralDeclaration_6()); 
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:318:1: ( 'P' )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:318:3: 'P'
                    {
                    match(input,17,FOLLOW_17_in_rule__NodeType__Alternatives645); 

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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:328:1: rule__PhenomenonType__Alternatives : ( ( ( 'phenomenon' ) ) | ( ( 'event' ) ) | ( ( 'state' ) ) );
    public final void rule__PhenomenonType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:332:1: ( ( ( 'phenomenon' ) ) | ( ( 'event' ) ) | ( ( 'state' ) ) )
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
                    new NoViableAltException("328:1: rule__PhenomenonType__Alternatives : ( ( ( 'phenomenon' ) ) | ( ( 'event' ) ) | ( ( 'state' ) ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:333:1: ( ( 'phenomenon' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:333:1: ( ( 'phenomenon' ) )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:334:1: ( 'phenomenon' )
                    {
                     before(grammarAccess.getPhenomenonTypeAccess().getUNSPECIFIEDEnumLiteralDeclaration_0()); 
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:335:1: ( 'phenomenon' )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:335:3: 'phenomenon'
                    {
                    match(input,18,FOLLOW_18_in_rule__PhenomenonType__Alternatives681); 

                    }

                     after(grammarAccess.getPhenomenonTypeAccess().getUNSPECIFIEDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:340:6: ( ( 'event' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:340:6: ( ( 'event' ) )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:341:1: ( 'event' )
                    {
                     before(grammarAccess.getPhenomenonTypeAccess().getEVENTEnumLiteralDeclaration_1()); 
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:342:1: ( 'event' )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:342:3: 'event'
                    {
                    match(input,19,FOLLOW_19_in_rule__PhenomenonType__Alternatives702); 

                    }

                     after(grammarAccess.getPhenomenonTypeAccess().getEVENTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:347:6: ( ( 'state' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:347:6: ( ( 'state' ) )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:348:1: ( 'state' )
                    {
                     before(grammarAccess.getPhenomenonTypeAccess().getSTATEEnumLiteralDeclaration_2()); 
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:349:1: ( 'state' )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:349:3: 'state'
                    {
                    match(input,20,FOLLOW_20_in_rule__PhenomenonType__Alternatives723); 

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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:359:1: rule__LinkType__Alternatives : ( ( ( '->' ) ) | ( ( '~~' ) ) | ( ( '~>' ) ) );
    public final void rule__LinkType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:363:1: ( ( ( '->' ) ) | ( ( '~~' ) ) | ( ( '~>' ) ) )
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
                    new NoViableAltException("359:1: rule__LinkType__Alternatives : ( ( ( '->' ) ) | ( ( '~~' ) ) | ( ( '~>' ) ) );", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:364:1: ( ( '->' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:364:1: ( ( '->' ) )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:365:1: ( '->' )
                    {
                     before(grammarAccess.getLinkTypeAccess().getINTERFACEEnumLiteralDeclaration_0()); 
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:366:1: ( '->' )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:366:3: '->'
                    {
                    match(input,21,FOLLOW_21_in_rule__LinkType__Alternatives759); 

                    }

                     after(grammarAccess.getLinkTypeAccess().getINTERFACEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:371:6: ( ( '~~' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:371:6: ( ( '~~' ) )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:372:1: ( '~~' )
                    {
                     before(grammarAccess.getLinkTypeAccess().getREFERENCEEnumLiteralDeclaration_1()); 
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:373:1: ( '~~' )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:373:3: '~~'
                    {
                    match(input,22,FOLLOW_22_in_rule__LinkType__Alternatives780); 

                    }

                     after(grammarAccess.getLinkTypeAccess().getREFERENCEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:378:6: ( ( '~>' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:378:6: ( ( '~>' ) )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:379:1: ( '~>' )
                    {
                     before(grammarAccess.getLinkTypeAccess().getCONSTRAINTEnumLiteralDeclaration_2()); 
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:380:1: ( '~>' )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:380:3: '~>'
                    {
                    match(input,23,FOLLOW_23_in_rule__LinkType__Alternatives801); 

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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:392:1: rule__ProblemDiagram__Group__0 : ( ( rule__ProblemDiagram__Group_0__0 )? ) rule__ProblemDiagram__Group__1 ;
    public final void rule__ProblemDiagram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:396:1: ( ( ( rule__ProblemDiagram__Group_0__0 )? ) rule__ProblemDiagram__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:397:1: ( ( rule__ProblemDiagram__Group_0__0 )? ) rule__ProblemDiagram__Group__1
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:397:1: ( ( rule__ProblemDiagram__Group_0__0 )? )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:398:1: ( rule__ProblemDiagram__Group_0__0 )?
            {
             before(grammarAccess.getProblemDiagramAccess().getGroup_0()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:399:1: ( rule__ProblemDiagram__Group_0__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:399:2: rule__ProblemDiagram__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__ProblemDiagram__Group_0__0_in_rule__ProblemDiagram__Group__0838);
                    rule__ProblemDiagram__Group_0__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProblemDiagramAccess().getGroup_0()); 

            }

            pushFollow(FOLLOW_rule__ProblemDiagram__Group__1_in_rule__ProblemDiagram__Group__0848);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:410:1: rule__ProblemDiagram__Group__1 : ( ( rule__ProblemDiagram__Alternatives_1 )* ) ;
    public final void rule__ProblemDiagram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:414:1: ( ( ( rule__ProblemDiagram__Alternatives_1 )* ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:415:1: ( ( rule__ProblemDiagram__Alternatives_1 )* )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:415:1: ( ( rule__ProblemDiagram__Alternatives_1 )* )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:416:1: ( rule__ProblemDiagram__Alternatives_1 )*
            {
             before(grammarAccess.getProblemDiagramAccess().getAlternatives_1()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:417:1: ( rule__ProblemDiagram__Alternatives_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:417:2: rule__ProblemDiagram__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_rule__ProblemDiagram__Alternatives_1_in_rule__ProblemDiagram__Group__1876);
            	    rule__ProblemDiagram__Alternatives_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:431:1: rule__ProblemDiagram__Group_0__0 : ( 'problem' ) rule__ProblemDiagram__Group_0__1 ;
    public final void rule__ProblemDiagram__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:435:1: ( ( 'problem' ) rule__ProblemDiagram__Group_0__1 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:436:1: ( 'problem' ) rule__ProblemDiagram__Group_0__1
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:436:1: ( 'problem' )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:437:1: 'problem'
            {
             before(grammarAccess.getProblemDiagramAccess().getProblemKeyword_0_0()); 
            match(input,24,FOLLOW_24_in_rule__ProblemDiagram__Group_0__0916); 
             after(grammarAccess.getProblemDiagramAccess().getProblemKeyword_0_0()); 

            }

            pushFollow(FOLLOW_rule__ProblemDiagram__Group_0__1_in_rule__ProblemDiagram__Group_0__0926);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:451:1: rule__ProblemDiagram__Group_0__1 : ( ':' ) rule__ProblemDiagram__Group_0__2 ;
    public final void rule__ProblemDiagram__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:455:1: ( ( ':' ) rule__ProblemDiagram__Group_0__2 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:456:1: ( ':' ) rule__ProblemDiagram__Group_0__2
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:456:1: ( ':' )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:457:1: ':'
            {
             before(grammarAccess.getProblemDiagramAccess().getColonKeyword_0_1()); 
            match(input,25,FOLLOW_25_in_rule__ProblemDiagram__Group_0__1955); 
             after(grammarAccess.getProblemDiagramAccess().getColonKeyword_0_1()); 

            }

            pushFollow(FOLLOW_rule__ProblemDiagram__Group_0__2_in_rule__ProblemDiagram__Group_0__1965);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:471:1: rule__ProblemDiagram__Group_0__2 : ( ( rule__ProblemDiagram__DescriptionAssignment_0_2 ) ) ;
    public final void rule__ProblemDiagram__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:475:1: ( ( ( rule__ProblemDiagram__DescriptionAssignment_0_2 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:476:1: ( ( rule__ProblemDiagram__DescriptionAssignment_0_2 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:476:1: ( ( rule__ProblemDiagram__DescriptionAssignment_0_2 ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:477:1: ( rule__ProblemDiagram__DescriptionAssignment_0_2 )
            {
             before(grammarAccess.getProblemDiagramAccess().getDescriptionAssignment_0_2()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:478:1: ( rule__ProblemDiagram__DescriptionAssignment_0_2 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:478:2: rule__ProblemDiagram__DescriptionAssignment_0_2
            {
            pushFollow(FOLLOW_rule__ProblemDiagram__DescriptionAssignment_0_2_in_rule__ProblemDiagram__Group_0__2993);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:494:1: rule__Node__Group__0 : ( ( rule__Node__NameAssignment_0 ) ) rule__Node__Group__1 ;
    public final void rule__Node__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:498:1: ( ( ( rule__Node__NameAssignment_0 ) ) rule__Node__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:499:1: ( ( rule__Node__NameAssignment_0 ) ) rule__Node__Group__1
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:499:1: ( ( rule__Node__NameAssignment_0 ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:500:1: ( rule__Node__NameAssignment_0 )
            {
             before(grammarAccess.getNodeAccess().getNameAssignment_0()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:501:1: ( rule__Node__NameAssignment_0 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:501:2: rule__Node__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Node__NameAssignment_0_in_rule__Node__Group__01033);
            rule__Node__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getNodeAccess().getNameAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Node__Group__1_in_rule__Node__Group__01042);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:512:1: rule__Node__Group__1 : ( ( rule__Node__TypeAssignment_1 )? ) rule__Node__Group__2 ;
    public final void rule__Node__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:516:1: ( ( ( rule__Node__TypeAssignment_1 )? ) rule__Node__Group__2 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:517:1: ( ( rule__Node__TypeAssignment_1 )? ) rule__Node__Group__2
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:517:1: ( ( rule__Node__TypeAssignment_1 )? )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:518:1: ( rule__Node__TypeAssignment_1 )?
            {
             before(grammarAccess.getNodeAccess().getTypeAssignment_1()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:519:1: ( rule__Node__TypeAssignment_1 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=11 && LA8_0<=17)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:519:2: rule__Node__TypeAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Node__TypeAssignment_1_in_rule__Node__Group__11070);
                    rule__Node__TypeAssignment_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNodeAccess().getTypeAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Node__Group__2_in_rule__Node__Group__11080);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:530:1: rule__Node__Group__2 : ( ( rule__Node__Group_2__0 )? ) ;
    public final void rule__Node__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:534:1: ( ( ( rule__Node__Group_2__0 )? ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:535:1: ( ( rule__Node__Group_2__0 )? )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:535:1: ( ( rule__Node__Group_2__0 )? )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:536:1: ( rule__Node__Group_2__0 )?
            {
             before(grammarAccess.getNodeAccess().getGroup_2()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:537:1: ( rule__Node__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:537:2: rule__Node__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Node__Group_2__0_in_rule__Node__Group__21108);
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
    // $ANTLR end rule__Node__Group__2


    // $ANTLR start rule__Node__Group_2__0
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:553:1: rule__Node__Group_2__0 : ( ':' ) rule__Node__Group_2__1 ;
    public final void rule__Node__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:557:1: ( ( ':' ) rule__Node__Group_2__1 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:558:1: ( ':' ) rule__Node__Group_2__1
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:558:1: ( ':' )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:559:1: ':'
            {
             before(grammarAccess.getNodeAccess().getColonKeyword_2_0()); 
            match(input,25,FOLLOW_25_in_rule__Node__Group_2__01150); 
             after(grammarAccess.getNodeAccess().getColonKeyword_2_0()); 

            }

            pushFollow(FOLLOW_rule__Node__Group_2__1_in_rule__Node__Group_2__01160);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:573:1: rule__Node__Group_2__1 : ( ( rule__Node__DescriptionAssignment_2_1 ) ) ;
    public final void rule__Node__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:577:1: ( ( ( rule__Node__DescriptionAssignment_2_1 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:578:1: ( ( rule__Node__DescriptionAssignment_2_1 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:578:1: ( ( rule__Node__DescriptionAssignment_2_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:579:1: ( rule__Node__DescriptionAssignment_2_1 )
            {
             before(grammarAccess.getNodeAccess().getDescriptionAssignment_2_1()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:580:1: ( rule__Node__DescriptionAssignment_2_1 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:580:2: rule__Node__DescriptionAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Node__DescriptionAssignment_2_1_in_rule__Node__Group_2__11188);
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


    // $ANTLR start rule__Phenomenon__Group__0
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:594:1: rule__Phenomenon__Group__0 : ( ( rule__Phenomenon__TypeAssignment_0 )? ) rule__Phenomenon__Group__1 ;
    public final void rule__Phenomenon__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:598:1: ( ( ( rule__Phenomenon__TypeAssignment_0 )? ) rule__Phenomenon__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:599:1: ( ( rule__Phenomenon__TypeAssignment_0 )? ) rule__Phenomenon__Group__1
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:599:1: ( ( rule__Phenomenon__TypeAssignment_0 )? )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:600:1: ( rule__Phenomenon__TypeAssignment_0 )?
            {
             before(grammarAccess.getPhenomenonAccess().getTypeAssignment_0()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:601:1: ( rule__Phenomenon__TypeAssignment_0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=18 && LA10_0<=20)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:601:2: rule__Phenomenon__TypeAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Phenomenon__TypeAssignment_0_in_rule__Phenomenon__Group__01226);
                    rule__Phenomenon__TypeAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPhenomenonAccess().getTypeAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Phenomenon__Group__1_in_rule__Phenomenon__Group__01236);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:612:1: rule__Phenomenon__Group__1 : ( ( rule__Phenomenon__NameAssignment_1 ) ) rule__Phenomenon__Group__2 ;
    public final void rule__Phenomenon__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:616:1: ( ( ( rule__Phenomenon__NameAssignment_1 ) ) rule__Phenomenon__Group__2 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:617:1: ( ( rule__Phenomenon__NameAssignment_1 ) ) rule__Phenomenon__Group__2
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:617:1: ( ( rule__Phenomenon__NameAssignment_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:618:1: ( rule__Phenomenon__NameAssignment_1 )
            {
             before(grammarAccess.getPhenomenonAccess().getNameAssignment_1()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:619:1: ( rule__Phenomenon__NameAssignment_1 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:619:2: rule__Phenomenon__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Phenomenon__NameAssignment_1_in_rule__Phenomenon__Group__11264);
            rule__Phenomenon__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getPhenomenonAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Phenomenon__Group__2_in_rule__Phenomenon__Group__11273);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:630:1: rule__Phenomenon__Group__2 : ( ( rule__Phenomenon__Group_2__0 )? ) ;
    public final void rule__Phenomenon__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:634:1: ( ( ( rule__Phenomenon__Group_2__0 )? ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:635:1: ( ( rule__Phenomenon__Group_2__0 )? )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:635:1: ( ( rule__Phenomenon__Group_2__0 )? )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:636:1: ( rule__Phenomenon__Group_2__0 )?
            {
             before(grammarAccess.getPhenomenonAccess().getGroup_2()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:637:1: ( rule__Phenomenon__Group_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:637:2: rule__Phenomenon__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Phenomenon__Group_2__0_in_rule__Phenomenon__Group__21301);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:653:1: rule__Phenomenon__Group_2__0 : ( ':' ) rule__Phenomenon__Group_2__1 ;
    public final void rule__Phenomenon__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:657:1: ( ( ':' ) rule__Phenomenon__Group_2__1 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:658:1: ( ':' ) rule__Phenomenon__Group_2__1
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:658:1: ( ':' )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:659:1: ':'
            {
             before(grammarAccess.getPhenomenonAccess().getColonKeyword_2_0()); 
            match(input,25,FOLLOW_25_in_rule__Phenomenon__Group_2__01343); 
             after(grammarAccess.getPhenomenonAccess().getColonKeyword_2_0()); 

            }

            pushFollow(FOLLOW_rule__Phenomenon__Group_2__1_in_rule__Phenomenon__Group_2__01353);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:673:1: rule__Phenomenon__Group_2__1 : ( ( rule__Phenomenon__DescriptionAssignment_2_1 ) ) ;
    public final void rule__Phenomenon__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:677:1: ( ( ( rule__Phenomenon__DescriptionAssignment_2_1 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:678:1: ( ( rule__Phenomenon__DescriptionAssignment_2_1 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:678:1: ( ( rule__Phenomenon__DescriptionAssignment_2_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:679:1: ( rule__Phenomenon__DescriptionAssignment_2_1 )
            {
             before(grammarAccess.getPhenomenonAccess().getDescriptionAssignment_2_1()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:680:1: ( rule__Phenomenon__DescriptionAssignment_2_1 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:680:2: rule__Phenomenon__DescriptionAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Phenomenon__DescriptionAssignment_2_1_in_rule__Phenomenon__Group_2__11381);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:694:1: rule__Link__Group__0 : ( ( rule__Link__FromAssignment_0 ) ) rule__Link__Group__1 ;
    public final void rule__Link__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:698:1: ( ( ( rule__Link__FromAssignment_0 ) ) rule__Link__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:699:1: ( ( rule__Link__FromAssignment_0 ) ) rule__Link__Group__1
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:699:1: ( ( rule__Link__FromAssignment_0 ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:700:1: ( rule__Link__FromAssignment_0 )
            {
             before(grammarAccess.getLinkAccess().getFromAssignment_0()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:701:1: ( rule__Link__FromAssignment_0 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:701:2: rule__Link__FromAssignment_0
            {
            pushFollow(FOLLOW_rule__Link__FromAssignment_0_in_rule__Link__Group__01419);
            rule__Link__FromAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getLinkAccess().getFromAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Link__Group__1_in_rule__Link__Group__01428);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:712:1: rule__Link__Group__1 : ( ( rule__Link__TypeAssignment_1 ) ) rule__Link__Group__2 ;
    public final void rule__Link__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:716:1: ( ( ( rule__Link__TypeAssignment_1 ) ) rule__Link__Group__2 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:717:1: ( ( rule__Link__TypeAssignment_1 ) ) rule__Link__Group__2
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:717:1: ( ( rule__Link__TypeAssignment_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:718:1: ( rule__Link__TypeAssignment_1 )
            {
             before(grammarAccess.getLinkAccess().getTypeAssignment_1()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:719:1: ( rule__Link__TypeAssignment_1 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:719:2: rule__Link__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Link__TypeAssignment_1_in_rule__Link__Group__11456);
            rule__Link__TypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getLinkAccess().getTypeAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Link__Group__2_in_rule__Link__Group__11465);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:730:1: rule__Link__Group__2 : ( ( rule__Link__ToAssignment_2 ) ) rule__Link__Group__3 ;
    public final void rule__Link__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:734:1: ( ( ( rule__Link__ToAssignment_2 ) ) rule__Link__Group__3 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:735:1: ( ( rule__Link__ToAssignment_2 ) ) rule__Link__Group__3
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:735:1: ( ( rule__Link__ToAssignment_2 ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:736:1: ( rule__Link__ToAssignment_2 )
            {
             before(grammarAccess.getLinkAccess().getToAssignment_2()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:737:1: ( rule__Link__ToAssignment_2 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:737:2: rule__Link__ToAssignment_2
            {
            pushFollow(FOLLOW_rule__Link__ToAssignment_2_in_rule__Link__Group__21493);
            rule__Link__ToAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getLinkAccess().getToAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__Link__Group__3_in_rule__Link__Group__21502);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:748:1: rule__Link__Group__3 : ( ( rule__Link__Group_3__0 )? ) rule__Link__Group__4 ;
    public final void rule__Link__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:752:1: ( ( ( rule__Link__Group_3__0 )? ) rule__Link__Group__4 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:753:1: ( ( rule__Link__Group_3__0 )? ) rule__Link__Group__4
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:753:1: ( ( rule__Link__Group_3__0 )? )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:754:1: ( rule__Link__Group_3__0 )?
            {
             before(grammarAccess.getLinkAccess().getGroup_3()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:755:1: ( rule__Link__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:755:2: rule__Link__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Link__Group_3__0_in_rule__Link__Group__31530);
                    rule__Link__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLinkAccess().getGroup_3()); 

            }

            pushFollow(FOLLOW_rule__Link__Group__4_in_rule__Link__Group__31540);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:766:1: rule__Link__Group__4 : ( ( rule__Link__Group_4__0 )? ) ;
    public final void rule__Link__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:770:1: ( ( ( rule__Link__Group_4__0 )? ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:771:1: ( ( rule__Link__Group_4__0 )? )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:771:1: ( ( rule__Link__Group_4__0 )? )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:772:1: ( rule__Link__Group_4__0 )?
            {
             before(grammarAccess.getLinkAccess().getGroup_4()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:773:1: ( rule__Link__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:773:2: rule__Link__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Link__Group_4__0_in_rule__Link__Group__41568);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:793:1: rule__Link__Group_3__0 : ( '{' ) rule__Link__Group_3__1 ;
    public final void rule__Link__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:797:1: ( ( '{' ) rule__Link__Group_3__1 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:798:1: ( '{' ) rule__Link__Group_3__1
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:798:1: ( '{' )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:799:1: '{'
            {
             before(grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,26,FOLLOW_26_in_rule__Link__Group_3__01614); 
             after(grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_3_0()); 

            }

            pushFollow(FOLLOW_rule__Link__Group_3__1_in_rule__Link__Group_3__01624);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:813:1: rule__Link__Group_3__1 : ( ( rule__Link__PhenomenaAssignment_3_1 ) ) rule__Link__Group_3__2 ;
    public final void rule__Link__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:817:1: ( ( ( rule__Link__PhenomenaAssignment_3_1 ) ) rule__Link__Group_3__2 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:818:1: ( ( rule__Link__PhenomenaAssignment_3_1 ) ) rule__Link__Group_3__2
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:818:1: ( ( rule__Link__PhenomenaAssignment_3_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:819:1: ( rule__Link__PhenomenaAssignment_3_1 )
            {
             before(grammarAccess.getLinkAccess().getPhenomenaAssignment_3_1()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:820:1: ( rule__Link__PhenomenaAssignment_3_1 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:820:2: rule__Link__PhenomenaAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Link__PhenomenaAssignment_3_1_in_rule__Link__Group_3__11652);
            rule__Link__PhenomenaAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getLinkAccess().getPhenomenaAssignment_3_1()); 

            }

            pushFollow(FOLLOW_rule__Link__Group_3__2_in_rule__Link__Group_3__11661);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:831:1: rule__Link__Group_3__2 : ( ( rule__Link__Group_3_2__0 )* ) rule__Link__Group_3__3 ;
    public final void rule__Link__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:835:1: ( ( ( rule__Link__Group_3_2__0 )* ) rule__Link__Group_3__3 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:836:1: ( ( rule__Link__Group_3_2__0 )* ) rule__Link__Group_3__3
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:836:1: ( ( rule__Link__Group_3_2__0 )* )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:837:1: ( rule__Link__Group_3_2__0 )*
            {
             before(grammarAccess.getLinkAccess().getGroup_3_2()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:838:1: ( rule__Link__Group_3_2__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==28) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:838:2: rule__Link__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Link__Group_3_2__0_in_rule__Link__Group_3__21689);
            	    rule__Link__Group_3_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getLinkAccess().getGroup_3_2()); 

            }

            pushFollow(FOLLOW_rule__Link__Group_3__3_in_rule__Link__Group_3__21699);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:849:1: rule__Link__Group_3__3 : ( '}' ) ;
    public final void rule__Link__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:853:1: ( ( '}' ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:854:1: ( '}' )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:854:1: ( '}' )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:855:1: '}'
            {
             before(grammarAccess.getLinkAccess().getRightCurlyBracketKeyword_3_3()); 
            match(input,27,FOLLOW_27_in_rule__Link__Group_3__31728); 
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:876:1: rule__Link__Group_3_2__0 : ( ',' ) rule__Link__Group_3_2__1 ;
    public final void rule__Link__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:880:1: ( ( ',' ) rule__Link__Group_3_2__1 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:881:1: ( ',' ) rule__Link__Group_3_2__1
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:881:1: ( ',' )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:882:1: ','
            {
             before(grammarAccess.getLinkAccess().getCommaKeyword_3_2_0()); 
            match(input,28,FOLLOW_28_in_rule__Link__Group_3_2__01772); 
             after(grammarAccess.getLinkAccess().getCommaKeyword_3_2_0()); 

            }

            pushFollow(FOLLOW_rule__Link__Group_3_2__1_in_rule__Link__Group_3_2__01782);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:896:1: rule__Link__Group_3_2__1 : ( ( rule__Link__PhenomenaAssignment_3_2_1 ) ) ;
    public final void rule__Link__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:900:1: ( ( ( rule__Link__PhenomenaAssignment_3_2_1 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:901:1: ( ( rule__Link__PhenomenaAssignment_3_2_1 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:901:1: ( ( rule__Link__PhenomenaAssignment_3_2_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:902:1: ( rule__Link__PhenomenaAssignment_3_2_1 )
            {
             before(grammarAccess.getLinkAccess().getPhenomenaAssignment_3_2_1()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:903:1: ( rule__Link__PhenomenaAssignment_3_2_1 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:903:2: rule__Link__PhenomenaAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__Link__PhenomenaAssignment_3_2_1_in_rule__Link__Group_3_2__11810);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:917:1: rule__Link__Group_4__0 : ( ':' ) rule__Link__Group_4__1 ;
    public final void rule__Link__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:921:1: ( ( ':' ) rule__Link__Group_4__1 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:922:1: ( ':' ) rule__Link__Group_4__1
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:922:1: ( ':' )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:923:1: ':'
            {
             before(grammarAccess.getLinkAccess().getColonKeyword_4_0()); 
            match(input,25,FOLLOW_25_in_rule__Link__Group_4__01849); 
             after(grammarAccess.getLinkAccess().getColonKeyword_4_0()); 

            }

            pushFollow(FOLLOW_rule__Link__Group_4__1_in_rule__Link__Group_4__01859);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:937:1: rule__Link__Group_4__1 : ( ( rule__Link__DescriptionAssignment_4_1 ) ) ;
    public final void rule__Link__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:941:1: ( ( ( rule__Link__DescriptionAssignment_4_1 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:942:1: ( ( rule__Link__DescriptionAssignment_4_1 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:942:1: ( ( rule__Link__DescriptionAssignment_4_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:943:1: ( rule__Link__DescriptionAssignment_4_1 )
            {
             before(grammarAccess.getLinkAccess().getDescriptionAssignment_4_1()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:944:1: ( rule__Link__DescriptionAssignment_4_1 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:944:2: rule__Link__DescriptionAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Link__DescriptionAssignment_4_1_in_rule__Link__Group_4__11887);
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


    // $ANTLR start rule__ProblemDiagram__DescriptionAssignment_0_2
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:958:1: rule__ProblemDiagram__DescriptionAssignment_0_2 : ( RULE_STRING ) ;
    public final void rule__ProblemDiagram__DescriptionAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:962:1: ( ( RULE_STRING ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:963:1: ( RULE_STRING )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:963:1: ( RULE_STRING )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:964:1: RULE_STRING
            {
             before(grammarAccess.getProblemDiagramAccess().getDescriptionSTRINGTerminalRuleCall_0_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ProblemDiagram__DescriptionAssignment_0_21925); 
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:973:1: rule__ProblemDiagram__NodesAssignment_1_0 : ( ruleNode ) ;
    public final void rule__ProblemDiagram__NodesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:977:1: ( ( ruleNode ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:978:1: ( ruleNode )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:978:1: ( ruleNode )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:979:1: ruleNode
            {
             before(grammarAccess.getProblemDiagramAccess().getNodesNodeParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleNode_in_rule__ProblemDiagram__NodesAssignment_1_01956);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:988:1: rule__ProblemDiagram__LinksAssignment_1_1 : ( ruleLink ) ;
    public final void rule__ProblemDiagram__LinksAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:992:1: ( ( ruleLink ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:993:1: ( ruleLink )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:993:1: ( ruleLink )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:994:1: ruleLink
            {
             before(grammarAccess.getProblemDiagramAccess().getLinksLinkParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleLink_in_rule__ProblemDiagram__LinksAssignment_1_11987);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1003:1: rule__Node__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Node__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1007:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1008:1: ( RULE_ID )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1008:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1009:1: RULE_ID
            {
             before(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Node__NameAssignment_02018); 
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1018:1: rule__Node__TypeAssignment_1 : ( ruleNodeType ) ;
    public final void rule__Node__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1022:1: ( ( ruleNodeType ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1023:1: ( ruleNodeType )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1023:1: ( ruleNodeType )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1024:1: ruleNodeType
            {
             before(grammarAccess.getNodeAccess().getTypeNodeTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleNodeType_in_rule__Node__TypeAssignment_12049);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1033:1: rule__Node__DescriptionAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Node__DescriptionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1037:1: ( ( RULE_STRING ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1038:1: ( RULE_STRING )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1038:1: ( RULE_STRING )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1039:1: RULE_STRING
            {
             before(grammarAccess.getNodeAccess().getDescriptionSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Node__DescriptionAssignment_2_12080); 
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


    // $ANTLR start rule__Phenomenon__TypeAssignment_0
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1048:1: rule__Phenomenon__TypeAssignment_0 : ( rulePhenomenonType ) ;
    public final void rule__Phenomenon__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1052:1: ( ( rulePhenomenonType ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1053:1: ( rulePhenomenonType )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1053:1: ( rulePhenomenonType )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1054:1: rulePhenomenonType
            {
             before(grammarAccess.getPhenomenonAccess().getTypePhenomenonTypeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_rulePhenomenonType_in_rule__Phenomenon__TypeAssignment_02111);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1063:1: rule__Phenomenon__NameAssignment_1 : ( ( rule__Phenomenon__NameAlternatives_1_0 ) ) ;
    public final void rule__Phenomenon__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1067:1: ( ( ( rule__Phenomenon__NameAlternatives_1_0 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1068:1: ( ( rule__Phenomenon__NameAlternatives_1_0 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1068:1: ( ( rule__Phenomenon__NameAlternatives_1_0 ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1069:1: ( rule__Phenomenon__NameAlternatives_1_0 )
            {
             before(grammarAccess.getPhenomenonAccess().getNameAlternatives_1_0()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1070:1: ( rule__Phenomenon__NameAlternatives_1_0 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1070:2: rule__Phenomenon__NameAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__Phenomenon__NameAlternatives_1_0_in_rule__Phenomenon__NameAssignment_12142);
            rule__Phenomenon__NameAlternatives_1_0();
            _fsp--;


            }

             after(grammarAccess.getPhenomenonAccess().getNameAlternatives_1_0()); 

            }


            }

        }
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1079:1: rule__Phenomenon__DescriptionAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Phenomenon__DescriptionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1083:1: ( ( RULE_STRING ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1084:1: ( RULE_STRING )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1084:1: ( RULE_STRING )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1085:1: RULE_STRING
            {
             before(grammarAccess.getPhenomenonAccess().getDescriptionSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Phenomenon__DescriptionAssignment_2_12175); 
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1094:1: rule__Link__FromAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Link__FromAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1098:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1099:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1099:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1100:1: ( RULE_ID )
            {
             before(grammarAccess.getLinkAccess().getFromNodeCrossReference_0_0()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1101:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1102:1: RULE_ID
            {
             before(grammarAccess.getLinkAccess().getFromNodeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Link__FromAssignment_02210); 
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1113:1: rule__Link__TypeAssignment_1 : ( ruleLinkType ) ;
    public final void rule__Link__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1117:1: ( ( ruleLinkType ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1118:1: ( ruleLinkType )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1118:1: ( ruleLinkType )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1119:1: ruleLinkType
            {
             before(grammarAccess.getLinkAccess().getTypeLinkTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleLinkType_in_rule__Link__TypeAssignment_12245);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1128:1: rule__Link__ToAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Link__ToAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1132:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1133:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1133:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1134:1: ( RULE_ID )
            {
             before(grammarAccess.getLinkAccess().getToNodeCrossReference_2_0()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1135:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1136:1: RULE_ID
            {
             before(grammarAccess.getLinkAccess().getToNodeIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Link__ToAssignment_22280); 
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1147:1: rule__Link__PhenomenaAssignment_3_1 : ( rulePhenomenon ) ;
    public final void rule__Link__PhenomenaAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1151:1: ( ( rulePhenomenon ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1152:1: ( rulePhenomenon )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1152:1: ( rulePhenomenon )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1153:1: rulePhenomenon
            {
             before(grammarAccess.getLinkAccess().getPhenomenaPhenomenonParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_rulePhenomenon_in_rule__Link__PhenomenaAssignment_3_12315);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1162:1: rule__Link__PhenomenaAssignment_3_2_1 : ( rulePhenomenon ) ;
    public final void rule__Link__PhenomenaAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1166:1: ( ( rulePhenomenon ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1167:1: ( rulePhenomenon )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1167:1: ( rulePhenomenon )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1168:1: rulePhenomenon
            {
             before(grammarAccess.getLinkAccess().getPhenomenaPhenomenonParserRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_rulePhenomenon_in_rule__Link__PhenomenaAssignment_3_2_12346);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1177:1: rule__Link__DescriptionAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Link__DescriptionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1181:1: ( ( RULE_STRING ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1182:1: ( RULE_STRING )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1182:1: ( RULE_STRING )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1183:1: RULE_STRING
            {
             before(grammarAccess.getLinkAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Link__DescriptionAssignment_4_12377); 
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
    public static final BitSet FOLLOW_rule__ProblemDiagram__NodesAssignment_1_0_in_rule__ProblemDiagram__Alternatives_1418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__LinksAssignment_1_1_in_rule__ProblemDiagram__Alternatives_1436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Phenomenon__NameAlternatives_1_0469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Phenomenon__NameAlternatives_1_0486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__NodeType__Alternatives519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__NodeType__Alternatives540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__NodeType__Alternatives561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__NodeType__Alternatives582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__NodeType__Alternatives603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__NodeType__Alternatives624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__NodeType__Alternatives645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__PhenomenonType__Alternatives681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__PhenomenonType__Alternatives702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__PhenomenonType__Alternatives723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__LinkType__Alternatives759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__LinkType__Alternatives780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__LinkType__Alternatives801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__Group_0__0_in_rule__ProblemDiagram__Group__0838 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__Group__1_in_rule__ProblemDiagram__Group__0848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__Alternatives_1_in_rule__ProblemDiagram__Group__1876 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_24_in_rule__ProblemDiagram__Group_0__0916 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__Group_0__1_in_rule__ProblemDiagram__Group_0__0926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ProblemDiagram__Group_0__1955 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__Group_0__2_in_rule__ProblemDiagram__Group_0__1965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__DescriptionAssignment_0_2_in_rule__ProblemDiagram__Group_0__2993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__NameAssignment_0_in_rule__Node__Group__01033 = new BitSet(new long[]{0x000000000203F802L});
    public static final BitSet FOLLOW_rule__Node__Group__1_in_rule__Node__Group__01042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__TypeAssignment_1_in_rule__Node__Group__11070 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Node__Group__2_in_rule__Node__Group__11080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_2__0_in_rule__Node__Group__21108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Node__Group_2__01150 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Node__Group_2__1_in_rule__Node__Group_2__01160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__DescriptionAssignment_2_1_in_rule__Node__Group_2__11188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Phenomenon__TypeAssignment_0_in_rule__Phenomenon__Group__01226 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Phenomenon__Group__1_in_rule__Phenomenon__Group__01236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Phenomenon__NameAssignment_1_in_rule__Phenomenon__Group__11264 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Phenomenon__Group__2_in_rule__Phenomenon__Group__11273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Phenomenon__Group_2__0_in_rule__Phenomenon__Group__21301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Phenomenon__Group_2__01343 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Phenomenon__Group_2__1_in_rule__Phenomenon__Group_2__01353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Phenomenon__DescriptionAssignment_2_1_in_rule__Phenomenon__Group_2__11381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__FromAssignment_0_in_rule__Link__Group__01419 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_rule__Link__Group__1_in_rule__Link__Group__01428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__TypeAssignment_1_in_rule__Link__Group__11456 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Link__Group__2_in_rule__Link__Group__11465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__ToAssignment_2_in_rule__Link__Group__21493 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_rule__Link__Group__3_in_rule__Link__Group__21502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group_3__0_in_rule__Link__Group__31530 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Link__Group__4_in_rule__Link__Group__31540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group_4__0_in_rule__Link__Group__41568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Link__Group_3__01614 = new BitSet(new long[]{0x00000000001C0030L});
    public static final BitSet FOLLOW_rule__Link__Group_3__1_in_rule__Link__Group_3__01624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__PhenomenaAssignment_3_1_in_rule__Link__Group_3__11652 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_rule__Link__Group_3__2_in_rule__Link__Group_3__11661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group_3_2__0_in_rule__Link__Group_3__21689 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_rule__Link__Group_3__3_in_rule__Link__Group_3__21699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Link__Group_3__31728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Link__Group_3_2__01772 = new BitSet(new long[]{0x00000000001C0030L});
    public static final BitSet FOLLOW_rule__Link__Group_3_2__1_in_rule__Link__Group_3_2__01782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__PhenomenaAssignment_3_2_1_in_rule__Link__Group_3_2__11810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Link__Group_4__01849 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Link__Group_4__1_in_rule__Link__Group_4__01859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__DescriptionAssignment_4_1_in_rule__Link__Group_4__11887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ProblemDiagram__DescriptionAssignment_0_21925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_rule__ProblemDiagram__NodesAssignment_1_01956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_rule__ProblemDiagram__LinksAssignment_1_11987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Node__NameAssignment_02018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeType_in_rule__Node__TypeAssignment_12049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Node__DescriptionAssignment_2_12080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhenomenonType_in_rule__Phenomenon__TypeAssignment_02111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Phenomenon__NameAlternatives_1_0_in_rule__Phenomenon__NameAssignment_12142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Phenomenon__DescriptionAssignment_2_12175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Link__FromAssignment_02210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkType_in_rule__Link__TypeAssignment_12245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Link__ToAssignment_22280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhenomenon_in_rule__Link__PhenomenaAssignment_3_12315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhenomenon_in_rule__Link__PhenomenaAssignment_3_2_12346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Link__DescriptionAssignment_4_12377 = new BitSet(new long[]{0x0000000000000002L});

}