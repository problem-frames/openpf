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


    // $ANTLR start entryRuleOtherLanguage
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:114:1: entryRuleOtherLanguage : ruleOtherLanguage EOF ;
    public final void entryRuleOtherLanguage() throws RecognitionException {
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:114:24: ( ruleOtherLanguage EOF )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:115:1: ruleOtherLanguage EOF
            {
             before(grammarAccess.getOtherLanguageRule()); 
            pushFollow(FOLLOW_ruleOtherLanguage_in_entryRuleOtherLanguage180);
            ruleOtherLanguage();
            _fsp--;

             after(grammarAccess.getOtherLanguageRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOtherLanguage187); 

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
    // $ANTLR end entryRuleOtherLanguage


    // $ANTLR start ruleOtherLanguage
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:122:1: ruleOtherLanguage : ( ( rule__OtherLanguage__Group__0 ) ) ;
    public final void ruleOtherLanguage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:126:2: ( ( ( rule__OtherLanguage__Group__0 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:127:1: ( ( rule__OtherLanguage__Group__0 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:127:1: ( ( rule__OtherLanguage__Group__0 ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:128:1: ( rule__OtherLanguage__Group__0 )
            {
             before(grammarAccess.getOtherLanguageAccess().getGroup()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:129:1: ( rule__OtherLanguage__Group__0 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:129:2: rule__OtherLanguage__Group__0
            {
            pushFollow(FOLLOW_rule__OtherLanguage__Group__0_in_ruleOtherLanguage214);
            rule__OtherLanguage__Group__0();
            _fsp--;


            }

             after(grammarAccess.getOtherLanguageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleOtherLanguage


    // $ANTLR start entryRulePhenomenon
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:141:1: entryRulePhenomenon : rulePhenomenon EOF ;
    public final void entryRulePhenomenon() throws RecognitionException {
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:141:21: ( rulePhenomenon EOF )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:142:1: rulePhenomenon EOF
            {
             before(grammarAccess.getPhenomenonRule()); 
            pushFollow(FOLLOW_rulePhenomenon_in_entryRulePhenomenon240);
            rulePhenomenon();
            _fsp--;

             after(grammarAccess.getPhenomenonRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePhenomenon247); 

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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:149:1: rulePhenomenon : ( ( rule__Phenomenon__Group__0 ) ) ;
    public final void rulePhenomenon() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:153:2: ( ( ( rule__Phenomenon__Group__0 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:154:1: ( ( rule__Phenomenon__Group__0 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:154:1: ( ( rule__Phenomenon__Group__0 ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:155:1: ( rule__Phenomenon__Group__0 )
            {
             before(grammarAccess.getPhenomenonAccess().getGroup()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:156:1: ( rule__Phenomenon__Group__0 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:156:2: rule__Phenomenon__Group__0
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:168:1: entryRuleLink : ruleLink EOF ;
    public final void entryRuleLink() throws RecognitionException {
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:168:15: ( ruleLink EOF )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:169:1: ruleLink EOF
            {
             before(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_ruleLink_in_entryRuleLink300);
            ruleLink();
            _fsp--;

             after(grammarAccess.getLinkRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLink307); 

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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:176:1: ruleLink : ( ( rule__Link__Group__0 ) ) ;
    public final void ruleLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:180:2: ( ( ( rule__Link__Group__0 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:181:1: ( ( rule__Link__Group__0 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:181:1: ( ( rule__Link__Group__0 ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:182:1: ( rule__Link__Group__0 )
            {
             before(grammarAccess.getLinkAccess().getGroup()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:183:1: ( rule__Link__Group__0 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:183:2: rule__Link__Group__0
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:196:1: ruleNodeType : ( ( rule__NodeType__Alternatives ) ) ;
    public final void ruleNodeType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:200:1: ( ( ( rule__NodeType__Alternatives ) ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:201:1: ( ( rule__NodeType__Alternatives ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:201:1: ( ( rule__NodeType__Alternatives ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:202:1: ( rule__NodeType__Alternatives )
            {
             before(grammarAccess.getNodeTypeAccess().getAlternatives()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:203:1: ( rule__NodeType__Alternatives )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:203:2: rule__NodeType__Alternatives
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:215:1: rulePhenomenonType : ( ( rule__PhenomenonType__Alternatives ) ) ;
    public final void rulePhenomenonType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:219:1: ( ( ( rule__PhenomenonType__Alternatives ) ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:220:1: ( ( rule__PhenomenonType__Alternatives ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:220:1: ( ( rule__PhenomenonType__Alternatives ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:221:1: ( rule__PhenomenonType__Alternatives )
            {
             before(grammarAccess.getPhenomenonTypeAccess().getAlternatives()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:222:1: ( rule__PhenomenonType__Alternatives )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:222:2: rule__PhenomenonType__Alternatives
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:234:1: ruleLinkType : ( ( rule__LinkType__Alternatives ) ) ;
    public final void ruleLinkType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:238:1: ( ( ( rule__LinkType__Alternatives ) ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:239:1: ( ( rule__LinkType__Alternatives ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:239:1: ( ( rule__LinkType__Alternatives ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:240:1: ( rule__LinkType__Alternatives )
            {
             before(grammarAccess.getLinkTypeAccess().getAlternatives()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:241:1: ( rule__LinkType__Alternatives )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:241:2: rule__LinkType__Alternatives
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:252:1: rule__ProblemDiagram__Alternatives_3 : ( ( ( rule__ProblemDiagram__NodesAssignment_3_0 ) ) | ( ( rule__ProblemDiagram__LinksAssignment_3_1 ) ) );
    public final void rule__ProblemDiagram__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:256:1: ( ( ( rule__ProblemDiagram__NodesAssignment_3_0 ) ) | ( ( rule__ProblemDiagram__LinksAssignment_3_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==EOF||LA1_1==RULE_ID||(LA1_1>=11 && LA1_1<=17)||(LA1_1>=24 && LA1_1<=27)||LA1_1==29) ) {
                    alt1=1;
                }
                else if ( ((LA1_1>=21 && LA1_1<=23)) ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("252:1: rule__ProblemDiagram__Alternatives_3 : ( ( ( rule__ProblemDiagram__NodesAssignment_3_0 ) ) | ( ( rule__ProblemDiagram__LinksAssignment_3_1 ) ) );", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("252:1: rule__ProblemDiagram__Alternatives_3 : ( ( ( rule__ProblemDiagram__NodesAssignment_3_0 ) ) | ( ( rule__ProblemDiagram__LinksAssignment_3_1 ) ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:257:1: ( ( rule__ProblemDiagram__NodesAssignment_3_0 ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:257:1: ( ( rule__ProblemDiagram__NodesAssignment_3_0 ) )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:258:1: ( rule__ProblemDiagram__NodesAssignment_3_0 )
                    {
                     before(grammarAccess.getProblemDiagramAccess().getNodesAssignment_3_0()); 
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:259:1: ( rule__ProblemDiagram__NodesAssignment_3_0 )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:259:2: rule__ProblemDiagram__NodesAssignment_3_0
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
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:263:6: ( ( rule__ProblemDiagram__LinksAssignment_3_1 ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:263:6: ( ( rule__ProblemDiagram__LinksAssignment_3_1 ) )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:264:1: ( rule__ProblemDiagram__LinksAssignment_3_1 )
                    {
                     before(grammarAccess.getProblemDiagramAccess().getLinksAssignment_3_1()); 
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:265:1: ( rule__ProblemDiagram__LinksAssignment_3_1 )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:265:2: rule__ProblemDiagram__LinksAssignment_3_1
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:274:1: rule__Node__Alternatives_3_2 : ( ( ( rule__Node__SubproblemAssignment_3_2_0 ) ) | ( ( rule__Node__Group_3_2_1__0 ) ) | ( ( rule__Node__Group_3_2_2__0 ) ) | ( ( rule__Node__Group_3_2_3__0 ) ) );
    public final void rule__Node__Alternatives_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:278:1: ( ( ( rule__Node__SubproblemAssignment_3_2_0 ) ) | ( ( rule__Node__Group_3_2_1__0 ) ) | ( ( rule__Node__Group_3_2_2__0 ) ) | ( ( rule__Node__Group_3_2_3__0 ) ) )
            int alt2=4;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==24) ) {
                alt2=1;
            }
            else if ( (LA2_0==29) ) {
                switch ( input.LA(2) ) {
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
                case RULE_STRING:
                    {
                    alt2=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("274:1: rule__Node__Alternatives_3_2 : ( ( ( rule__Node__SubproblemAssignment_3_2_0 ) ) | ( ( rule__Node__Group_3_2_1__0 ) ) | ( ( rule__Node__Group_3_2_2__0 ) ) | ( ( rule__Node__Group_3_2_3__0 ) ) );", 2, 2, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("274:1: rule__Node__Alternatives_3_2 : ( ( ( rule__Node__SubproblemAssignment_3_2_0 ) ) | ( ( rule__Node__Group_3_2_1__0 ) ) | ( ( rule__Node__Group_3_2_2__0 ) ) | ( ( rule__Node__Group_3_2_3__0 ) ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:279:1: ( ( rule__Node__SubproblemAssignment_3_2_0 ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:279:1: ( ( rule__Node__SubproblemAssignment_3_2_0 ) )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:280:1: ( rule__Node__SubproblemAssignment_3_2_0 )
                    {
                     before(grammarAccess.getNodeAccess().getSubproblemAssignment_3_2_0()); 
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:281:1: ( rule__Node__SubproblemAssignment_3_2_0 )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:281:2: rule__Node__SubproblemAssignment_3_2_0
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
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:285:6: ( ( rule__Node__Group_3_2_1__0 ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:285:6: ( ( rule__Node__Group_3_2_1__0 ) )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:286:1: ( rule__Node__Group_3_2_1__0 )
                    {
                     before(grammarAccess.getNodeAccess().getGroup_3_2_1()); 
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:287:1: ( rule__Node__Group_3_2_1__0 )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:287:2: rule__Node__Group_3_2_1__0
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
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:291:6: ( ( rule__Node__Group_3_2_2__0 ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:291:6: ( ( rule__Node__Group_3_2_2__0 ) )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:292:1: ( rule__Node__Group_3_2_2__0 )
                    {
                     before(grammarAccess.getNodeAccess().getGroup_3_2_2()); 
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:293:1: ( rule__Node__Group_3_2_2__0 )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:293:2: rule__Node__Group_3_2_2__0
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
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:297:6: ( ( rule__Node__Group_3_2_3__0 ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:297:6: ( ( rule__Node__Group_3_2_3__0 ) )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:298:1: ( rule__Node__Group_3_2_3__0 )
                    {
                     before(grammarAccess.getNodeAccess().getGroup_3_2_3()); 
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:299:1: ( rule__Node__Group_3_2_3__0 )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:299:2: rule__Node__Group_3_2_3__0
                    {
                    pushFollow(FOLLOW_rule__Node__Group_3_2_3__0_in_rule__Node__Alternatives_3_2583);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:308:1: rule__NodeType__Alternatives : ( ( ( 'R' ) ) | ( ( 'M' ) ) | ( ( 'B' ) ) | ( ( 'X' ) ) | ( ( 'C' ) ) | ( ( 'D' ) ) | ( ( 'P' ) ) );
    public final void rule__NodeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:312:1: ( ( ( 'R' ) ) | ( ( 'M' ) ) | ( ( 'B' ) ) | ( ( 'X' ) ) | ( ( 'C' ) ) | ( ( 'D' ) ) | ( ( 'P' ) ) )
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
                    new NoViableAltException("308:1: rule__NodeType__Alternatives : ( ( ( 'R' ) ) | ( ( 'M' ) ) | ( ( 'B' ) ) | ( ( 'X' ) ) | ( ( 'C' ) ) | ( ( 'D' ) ) | ( ( 'P' ) ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:313:1: ( ( 'R' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:313:1: ( ( 'R' ) )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:314:1: ( 'R' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getREQUIREMENTEnumLiteralDeclaration_0()); 
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:315:1: ( 'R' )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:315:3: 'R'
                    {
                    match(input,11,FOLLOW_11_in_rule__NodeType__Alternatives617); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getREQUIREMENTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:320:6: ( ( 'M' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:320:6: ( ( 'M' ) )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:321:1: ( 'M' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getMACHINEEnumLiteralDeclaration_1()); 
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:322:1: ( 'M' )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:322:3: 'M'
                    {
                    match(input,12,FOLLOW_12_in_rule__NodeType__Alternatives638); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getMACHINEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:327:6: ( ( 'B' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:327:6: ( ( 'B' ) )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:328:1: ( 'B' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getBIDDABLEEnumLiteralDeclaration_2()); 
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:329:1: ( 'B' )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:329:3: 'B'
                    {
                    match(input,13,FOLLOW_13_in_rule__NodeType__Alternatives659); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getBIDDABLEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:334:6: ( ( 'X' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:334:6: ( ( 'X' ) )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:335:1: ( 'X' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getLEXICALEnumLiteralDeclaration_3()); 
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:336:1: ( 'X' )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:336:3: 'X'
                    {
                    match(input,14,FOLLOW_14_in_rule__NodeType__Alternatives680); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getLEXICALEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:341:6: ( ( 'C' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:341:6: ( ( 'C' ) )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:342:1: ( 'C' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getCAUSALEnumLiteralDeclaration_4()); 
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:343:1: ( 'C' )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:343:3: 'C'
                    {
                    match(input,15,FOLLOW_15_in_rule__NodeType__Alternatives701); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getCAUSALEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:348:6: ( ( 'D' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:348:6: ( ( 'D' ) )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:349:1: ( 'D' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getDESIGNEDEnumLiteralDeclaration_5()); 
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:350:1: ( 'D' )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:350:3: 'D'
                    {
                    match(input,16,FOLLOW_16_in_rule__NodeType__Alternatives722); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getDESIGNEDEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:355:6: ( ( 'P' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:355:6: ( ( 'P' ) )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:356:1: ( 'P' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getPHYSICALEnumLiteralDeclaration_6()); 
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:357:1: ( 'P' )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:357:3: 'P'
                    {
                    match(input,17,FOLLOW_17_in_rule__NodeType__Alternatives743); 

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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:367:1: rule__PhenomenonType__Alternatives : ( ( ( 'phenomenon' ) ) | ( ( 'event' ) ) | ( ( 'state' ) ) );
    public final void rule__PhenomenonType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:371:1: ( ( ( 'phenomenon' ) ) | ( ( 'event' ) ) | ( ( 'state' ) ) )
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
                    new NoViableAltException("367:1: rule__PhenomenonType__Alternatives : ( ( ( 'phenomenon' ) ) | ( ( 'event' ) ) | ( ( 'state' ) ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:372:1: ( ( 'phenomenon' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:372:1: ( ( 'phenomenon' ) )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:373:1: ( 'phenomenon' )
                    {
                     before(grammarAccess.getPhenomenonTypeAccess().getUNSPECIFIEDEnumLiteralDeclaration_0()); 
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:374:1: ( 'phenomenon' )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:374:3: 'phenomenon'
                    {
                    match(input,18,FOLLOW_18_in_rule__PhenomenonType__Alternatives779); 

                    }

                     after(grammarAccess.getPhenomenonTypeAccess().getUNSPECIFIEDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:379:6: ( ( 'event' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:379:6: ( ( 'event' ) )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:380:1: ( 'event' )
                    {
                     before(grammarAccess.getPhenomenonTypeAccess().getEVENTEnumLiteralDeclaration_1()); 
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:381:1: ( 'event' )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:381:3: 'event'
                    {
                    match(input,19,FOLLOW_19_in_rule__PhenomenonType__Alternatives800); 

                    }

                     after(grammarAccess.getPhenomenonTypeAccess().getEVENTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:386:6: ( ( 'state' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:386:6: ( ( 'state' ) )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:387:1: ( 'state' )
                    {
                     before(grammarAccess.getPhenomenonTypeAccess().getSTATEEnumLiteralDeclaration_2()); 
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:388:1: ( 'state' )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:388:3: 'state'
                    {
                    match(input,20,FOLLOW_20_in_rule__PhenomenonType__Alternatives821); 

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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:398:1: rule__LinkType__Alternatives : ( ( ( '--' ) ) | ( ( '~~' ) ) | ( ( '~>' ) ) );
    public final void rule__LinkType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:402:1: ( ( ( '--' ) ) | ( ( '~~' ) ) | ( ( '~>' ) ) )
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
                    new NoViableAltException("398:1: rule__LinkType__Alternatives : ( ( ( '--' ) ) | ( ( '~~' ) ) | ( ( '~>' ) ) );", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:403:1: ( ( '--' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:403:1: ( ( '--' ) )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:404:1: ( '--' )
                    {
                     before(grammarAccess.getLinkTypeAccess().getINTERFACEEnumLiteralDeclaration_0()); 
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:405:1: ( '--' )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:405:3: '--'
                    {
                    match(input,21,FOLLOW_21_in_rule__LinkType__Alternatives857); 

                    }

                     after(grammarAccess.getLinkTypeAccess().getINTERFACEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:410:6: ( ( '~~' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:410:6: ( ( '~~' ) )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:411:1: ( '~~' )
                    {
                     before(grammarAccess.getLinkTypeAccess().getREFERENCEEnumLiteralDeclaration_1()); 
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:412:1: ( '~~' )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:412:3: '~~'
                    {
                    match(input,22,FOLLOW_22_in_rule__LinkType__Alternatives878); 

                    }

                     after(grammarAccess.getLinkTypeAccess().getREFERENCEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:417:6: ( ( '~>' ) )
                    {
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:417:6: ( ( '~>' ) )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:418:1: ( '~>' )
                    {
                     before(grammarAccess.getLinkTypeAccess().getCONSTRAINTEnumLiteralDeclaration_2()); 
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:419:1: ( '~>' )
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:419:3: '~>'
                    {
                    match(input,23,FOLLOW_23_in_rule__LinkType__Alternatives899); 

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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:431:1: rule__ProblemDiagram__Group__0 : ( 'problem' ) rule__ProblemDiagram__Group__1 ;
    public final void rule__ProblemDiagram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:435:1: ( ( 'problem' ) rule__ProblemDiagram__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:436:1: ( 'problem' ) rule__ProblemDiagram__Group__1
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:436:1: ( 'problem' )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:437:1: 'problem'
            {
             before(grammarAccess.getProblemDiagramAccess().getProblemKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__ProblemDiagram__Group__0937); 
             after(grammarAccess.getProblemDiagramAccess().getProblemKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__ProblemDiagram__Group__1_in_rule__ProblemDiagram__Group__0947);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:451:1: rule__ProblemDiagram__Group__1 : ( ':' ) rule__ProblemDiagram__Group__2 ;
    public final void rule__ProblemDiagram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:455:1: ( ( ':' ) rule__ProblemDiagram__Group__2 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:456:1: ( ':' ) rule__ProblemDiagram__Group__2
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:456:1: ( ':' )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:457:1: ':'
            {
             before(grammarAccess.getProblemDiagramAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__ProblemDiagram__Group__1976); 
             after(grammarAccess.getProblemDiagramAccess().getColonKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__ProblemDiagram__Group__2_in_rule__ProblemDiagram__Group__1986);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:471:1: rule__ProblemDiagram__Group__2 : ( ( rule__ProblemDiagram__NameAssignment_2 ) ) rule__ProblemDiagram__Group__3 ;
    public final void rule__ProblemDiagram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:475:1: ( ( ( rule__ProblemDiagram__NameAssignment_2 ) ) rule__ProblemDiagram__Group__3 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:476:1: ( ( rule__ProblemDiagram__NameAssignment_2 ) ) rule__ProblemDiagram__Group__3
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:476:1: ( ( rule__ProblemDiagram__NameAssignment_2 ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:477:1: ( rule__ProblemDiagram__NameAssignment_2 )
            {
             before(grammarAccess.getProblemDiagramAccess().getNameAssignment_2()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:478:1: ( rule__ProblemDiagram__NameAssignment_2 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:478:2: rule__ProblemDiagram__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__ProblemDiagram__NameAssignment_2_in_rule__ProblemDiagram__Group__21014);
            rule__ProblemDiagram__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getProblemDiagramAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__ProblemDiagram__Group__3_in_rule__ProblemDiagram__Group__21023);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:489:1: rule__ProblemDiagram__Group__3 : ( ( rule__ProblemDiagram__Alternatives_3 )* ) ;
    public final void rule__ProblemDiagram__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:493:1: ( ( ( rule__ProblemDiagram__Alternatives_3 )* ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:494:1: ( ( rule__ProblemDiagram__Alternatives_3 )* )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:494:1: ( ( rule__ProblemDiagram__Alternatives_3 )* )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:495:1: ( rule__ProblemDiagram__Alternatives_3 )*
            {
             before(grammarAccess.getProblemDiagramAccess().getAlternatives_3()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:496:1: ( rule__ProblemDiagram__Alternatives_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:496:2: rule__ProblemDiagram__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_rule__ProblemDiagram__Alternatives_3_in_rule__ProblemDiagram__Group__31051);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:514:1: rule__Node__Group__0 : ( ( rule__Node__NameAssignment_0 ) ) rule__Node__Group__1 ;
    public final void rule__Node__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:518:1: ( ( ( rule__Node__NameAssignment_0 ) ) rule__Node__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:519:1: ( ( rule__Node__NameAssignment_0 ) ) rule__Node__Group__1
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:519:1: ( ( rule__Node__NameAssignment_0 ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:520:1: ( rule__Node__NameAssignment_0 )
            {
             before(grammarAccess.getNodeAccess().getNameAssignment_0()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:521:1: ( rule__Node__NameAssignment_0 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:521:2: rule__Node__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Node__NameAssignment_0_in_rule__Node__Group__01094);
            rule__Node__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getNodeAccess().getNameAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Node__Group__1_in_rule__Node__Group__01103);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:532:1: rule__Node__Group__1 : ( ( rule__Node__TypeAssignment_1 )? ) rule__Node__Group__2 ;
    public final void rule__Node__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:536:1: ( ( ( rule__Node__TypeAssignment_1 )? ) rule__Node__Group__2 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:537:1: ( ( rule__Node__TypeAssignment_1 )? ) rule__Node__Group__2
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:537:1: ( ( rule__Node__TypeAssignment_1 )? )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:538:1: ( rule__Node__TypeAssignment_1 )?
            {
             before(grammarAccess.getNodeAccess().getTypeAssignment_1()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:539:1: ( rule__Node__TypeAssignment_1 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=11 && LA7_0<=17)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:539:2: rule__Node__TypeAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Node__TypeAssignment_1_in_rule__Node__Group__11131);
                    rule__Node__TypeAssignment_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNodeAccess().getTypeAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Node__Group__2_in_rule__Node__Group__11141);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:550:1: rule__Node__Group__2 : ( ( rule__Node__Group_2__0 )? ) rule__Node__Group__3 ;
    public final void rule__Node__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:554:1: ( ( ( rule__Node__Group_2__0 )? ) rule__Node__Group__3 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:555:1: ( ( rule__Node__Group_2__0 )? ) rule__Node__Group__3
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:555:1: ( ( rule__Node__Group_2__0 )? )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:556:1: ( rule__Node__Group_2__0 )?
            {
             before(grammarAccess.getNodeAccess().getGroup_2()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:557:1: ( rule__Node__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:557:2: rule__Node__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Node__Group_2__0_in_rule__Node__Group__21169);
                    rule__Node__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNodeAccess().getGroup_2()); 

            }

            pushFollow(FOLLOW_rule__Node__Group__3_in_rule__Node__Group__21179);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:568:1: rule__Node__Group__3 : ( ( rule__Node__Group_3__0 )? ) ;
    public final void rule__Node__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:572:1: ( ( ( rule__Node__Group_3__0 )? ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:573:1: ( ( rule__Node__Group_3__0 )? )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:573:1: ( ( rule__Node__Group_3__0 )? )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:574:1: ( rule__Node__Group_3__0 )?
            {
             before(grammarAccess.getNodeAccess().getGroup_3()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:575:1: ( rule__Node__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:575:2: rule__Node__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Node__Group_3__0_in_rule__Node__Group__31207);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:593:1: rule__Node__Group_2__0 : ( ':' ) rule__Node__Group_2__1 ;
    public final void rule__Node__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:597:1: ( ( ':' ) rule__Node__Group_2__1 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:598:1: ( ':' ) rule__Node__Group_2__1
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:598:1: ( ':' )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:599:1: ':'
            {
             before(grammarAccess.getNodeAccess().getColonKeyword_2_0()); 
            match(input,25,FOLLOW_25_in_rule__Node__Group_2__01251); 
             after(grammarAccess.getNodeAccess().getColonKeyword_2_0()); 

            }

            pushFollow(FOLLOW_rule__Node__Group_2__1_in_rule__Node__Group_2__01261);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:613:1: rule__Node__Group_2__1 : ( ( rule__Node__DescriptionAssignment_2_1 ) ) ;
    public final void rule__Node__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:617:1: ( ( ( rule__Node__DescriptionAssignment_2_1 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:618:1: ( ( rule__Node__DescriptionAssignment_2_1 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:618:1: ( ( rule__Node__DescriptionAssignment_2_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:619:1: ( rule__Node__DescriptionAssignment_2_1 )
            {
             before(grammarAccess.getNodeAccess().getDescriptionAssignment_2_1()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:620:1: ( rule__Node__DescriptionAssignment_2_1 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:620:2: rule__Node__DescriptionAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Node__DescriptionAssignment_2_1_in_rule__Node__Group_2__11289);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:634:1: rule__Node__Group_3__0 : ( '{' ) rule__Node__Group_3__1 ;
    public final void rule__Node__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:638:1: ( ( '{' ) rule__Node__Group_3__1 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:639:1: ( '{' ) rule__Node__Group_3__1
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:639:1: ( '{' )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:640:1: '{'
            {
             before(grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,26,FOLLOW_26_in_rule__Node__Group_3__01328); 
             after(grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_3_0()); 

            }

            pushFollow(FOLLOW_rule__Node__Group_3__1_in_rule__Node__Group_3__01338);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:654:1: rule__Node__Group_3__1 : ( ( rule__Node__Group_3_1__0 )? ) rule__Node__Group_3__2 ;
    public final void rule__Node__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:658:1: ( ( ( rule__Node__Group_3_1__0 )? ) rule__Node__Group_3__2 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:659:1: ( ( rule__Node__Group_3_1__0 )? ) rule__Node__Group_3__2
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:659:1: ( ( rule__Node__Group_3_1__0 )? )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:660:1: ( rule__Node__Group_3_1__0 )?
            {
             before(grammarAccess.getNodeAccess().getGroup_3_1()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:661:1: ( rule__Node__Group_3_1__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID||(LA10_0>=18 && LA10_0<=20)||LA10_0==31) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:661:2: rule__Node__Group_3_1__0
                    {
                    pushFollow(FOLLOW_rule__Node__Group_3_1__0_in_rule__Node__Group_3__11366);
                    rule__Node__Group_3_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNodeAccess().getGroup_3_1()); 

            }

            pushFollow(FOLLOW_rule__Node__Group_3__2_in_rule__Node__Group_3__11376);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:672:1: rule__Node__Group_3__2 : ( ( rule__Node__Alternatives_3_2 )* ) rule__Node__Group_3__3 ;
    public final void rule__Node__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:676:1: ( ( ( rule__Node__Alternatives_3_2 )* ) rule__Node__Group_3__3 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:677:1: ( ( rule__Node__Alternatives_3_2 )* ) rule__Node__Group_3__3
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:677:1: ( ( rule__Node__Alternatives_3_2 )* )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:678:1: ( rule__Node__Alternatives_3_2 )*
            {
             before(grammarAccess.getNodeAccess().getAlternatives_3_2()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:679:1: ( rule__Node__Alternatives_3_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==24||LA11_0==29) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:679:2: rule__Node__Alternatives_3_2
            	    {
            	    pushFollow(FOLLOW_rule__Node__Alternatives_3_2_in_rule__Node__Group_3__21404);
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

            pushFollow(FOLLOW_rule__Node__Group_3__3_in_rule__Node__Group_3__21414);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:690:1: rule__Node__Group_3__3 : ( '}' ) ;
    public final void rule__Node__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:694:1: ( ( '}' ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:695:1: ( '}' )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:695:1: ( '}' )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:696:1: '}'
            {
             before(grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_3_3()); 
            match(input,27,FOLLOW_27_in_rule__Node__Group_3__31443); 
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:717:1: rule__Node__Group_3_1__0 : ( ( rule__Node__HiddenPhenomenaAssignment_3_1_0 ) ) rule__Node__Group_3_1__1 ;
    public final void rule__Node__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:721:1: ( ( ( rule__Node__HiddenPhenomenaAssignment_3_1_0 ) ) rule__Node__Group_3_1__1 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:722:1: ( ( rule__Node__HiddenPhenomenaAssignment_3_1_0 ) ) rule__Node__Group_3_1__1
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:722:1: ( ( rule__Node__HiddenPhenomenaAssignment_3_1_0 ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:723:1: ( rule__Node__HiddenPhenomenaAssignment_3_1_0 )
            {
             before(grammarAccess.getNodeAccess().getHiddenPhenomenaAssignment_3_1_0()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:724:1: ( rule__Node__HiddenPhenomenaAssignment_3_1_0 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:724:2: rule__Node__HiddenPhenomenaAssignment_3_1_0
            {
            pushFollow(FOLLOW_rule__Node__HiddenPhenomenaAssignment_3_1_0_in_rule__Node__Group_3_1__01486);
            rule__Node__HiddenPhenomenaAssignment_3_1_0();
            _fsp--;


            }

             after(grammarAccess.getNodeAccess().getHiddenPhenomenaAssignment_3_1_0()); 

            }

            pushFollow(FOLLOW_rule__Node__Group_3_1__1_in_rule__Node__Group_3_1__01495);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:735:1: rule__Node__Group_3_1__1 : ( ( rule__Node__Group_3_1_1__0 )* ) ;
    public final void rule__Node__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:739:1: ( ( ( rule__Node__Group_3_1_1__0 )* ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:740:1: ( ( rule__Node__Group_3_1_1__0 )* )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:740:1: ( ( rule__Node__Group_3_1_1__0 )* )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:741:1: ( rule__Node__Group_3_1_1__0 )*
            {
             before(grammarAccess.getNodeAccess().getGroup_3_1_1()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:742:1: ( rule__Node__Group_3_1_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==28) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:742:2: rule__Node__Group_3_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Node__Group_3_1_1__0_in_rule__Node__Group_3_1__11523);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:756:1: rule__Node__Group_3_1_1__0 : ( ',' ) rule__Node__Group_3_1_1__1 ;
    public final void rule__Node__Group_3_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:760:1: ( ( ',' ) rule__Node__Group_3_1_1__1 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:761:1: ( ',' ) rule__Node__Group_3_1_1__1
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:761:1: ( ',' )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:762:1: ','
            {
             before(grammarAccess.getNodeAccess().getCommaKeyword_3_1_1_0()); 
            match(input,28,FOLLOW_28_in_rule__Node__Group_3_1_1__01563); 
             after(grammarAccess.getNodeAccess().getCommaKeyword_3_1_1_0()); 

            }

            pushFollow(FOLLOW_rule__Node__Group_3_1_1__1_in_rule__Node__Group_3_1_1__01573);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:776:1: rule__Node__Group_3_1_1__1 : ( ( rule__Node__HiddenPhenomenaAssignment_3_1_1_1 ) ) ;
    public final void rule__Node__Group_3_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:780:1: ( ( ( rule__Node__HiddenPhenomenaAssignment_3_1_1_1 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:781:1: ( ( rule__Node__HiddenPhenomenaAssignment_3_1_1_1 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:781:1: ( ( rule__Node__HiddenPhenomenaAssignment_3_1_1_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:782:1: ( rule__Node__HiddenPhenomenaAssignment_3_1_1_1 )
            {
             before(grammarAccess.getNodeAccess().getHiddenPhenomenaAssignment_3_1_1_1()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:783:1: ( rule__Node__HiddenPhenomenaAssignment_3_1_1_1 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:783:2: rule__Node__HiddenPhenomenaAssignment_3_1_1_1
            {
            pushFollow(FOLLOW_rule__Node__HiddenPhenomenaAssignment_3_1_1_1_in_rule__Node__Group_3_1_1__11601);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:797:1: rule__Node__Group_3_2_1__0 : ( 'see' ) rule__Node__Group_3_2_1__1 ;
    public final void rule__Node__Group_3_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:801:1: ( ( 'see' ) rule__Node__Group_3_2_1__1 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:802:1: ( 'see' ) rule__Node__Group_3_2_1__1
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:802:1: ( 'see' )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:803:1: 'see'
            {
             before(grammarAccess.getNodeAccess().getSeeKeyword_3_2_1_0()); 
            match(input,29,FOLLOW_29_in_rule__Node__Group_3_2_1__01640); 
             after(grammarAccess.getNodeAccess().getSeeKeyword_3_2_1_0()); 

            }

            pushFollow(FOLLOW_rule__Node__Group_3_2_1__1_in_rule__Node__Group_3_2_1__01650);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:817:1: rule__Node__Group_3_2_1__1 : ( 'domain' ) rule__Node__Group_3_2_1__2 ;
    public final void rule__Node__Group_3_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:821:1: ( ( 'domain' ) rule__Node__Group_3_2_1__2 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:822:1: ( 'domain' ) rule__Node__Group_3_2_1__2
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:822:1: ( 'domain' )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:823:1: 'domain'
            {
             before(grammarAccess.getNodeAccess().getDomainKeyword_3_2_1_1()); 
            match(input,30,FOLLOW_30_in_rule__Node__Group_3_2_1__11679); 
             after(grammarAccess.getNodeAccess().getDomainKeyword_3_2_1_1()); 

            }

            pushFollow(FOLLOW_rule__Node__Group_3_2_1__2_in_rule__Node__Group_3_2_1__11689);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:837:1: rule__Node__Group_3_2_1__2 : ( ( rule__Node__ProblemNodeRefAssignment_3_2_1_2 ) ) ;
    public final void rule__Node__Group_3_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:841:1: ( ( ( rule__Node__ProblemNodeRefAssignment_3_2_1_2 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:842:1: ( ( rule__Node__ProblemNodeRefAssignment_3_2_1_2 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:842:1: ( ( rule__Node__ProblemNodeRefAssignment_3_2_1_2 ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:843:1: ( rule__Node__ProblemNodeRefAssignment_3_2_1_2 )
            {
             before(grammarAccess.getNodeAccess().getProblemNodeRefAssignment_3_2_1_2()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:844:1: ( rule__Node__ProblemNodeRefAssignment_3_2_1_2 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:844:2: rule__Node__ProblemNodeRefAssignment_3_2_1_2
            {
            pushFollow(FOLLOW_rule__Node__ProblemNodeRefAssignment_3_2_1_2_in_rule__Node__Group_3_2_1__21717);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:860:1: rule__Node__Group_3_2_2__0 : ( 'see' ) rule__Node__Group_3_2_2__1 ;
    public final void rule__Node__Group_3_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:864:1: ( ( 'see' ) rule__Node__Group_3_2_2__1 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:865:1: ( 'see' ) rule__Node__Group_3_2_2__1
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:865:1: ( 'see' )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:866:1: 'see'
            {
             before(grammarAccess.getNodeAccess().getSeeKeyword_3_2_2_0()); 
            match(input,29,FOLLOW_29_in_rule__Node__Group_3_2_2__01758); 
             after(grammarAccess.getNodeAccess().getSeeKeyword_3_2_2_0()); 

            }

            pushFollow(FOLLOW_rule__Node__Group_3_2_2__1_in_rule__Node__Group_3_2_2__01768);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:880:1: rule__Node__Group_3_2_2__1 : ( 'problem' ) rule__Node__Group_3_2_2__2 ;
    public final void rule__Node__Group_3_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:884:1: ( ( 'problem' ) rule__Node__Group_3_2_2__2 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:885:1: ( 'problem' ) rule__Node__Group_3_2_2__2
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:885:1: ( 'problem' )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:886:1: 'problem'
            {
             before(grammarAccess.getNodeAccess().getProblemKeyword_3_2_2_1()); 
            match(input,24,FOLLOW_24_in_rule__Node__Group_3_2_2__11797); 
             after(grammarAccess.getNodeAccess().getProblemKeyword_3_2_2_1()); 

            }

            pushFollow(FOLLOW_rule__Node__Group_3_2_2__2_in_rule__Node__Group_3_2_2__11807);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:900:1: rule__Node__Group_3_2_2__2 : ( ( rule__Node__ProblemRefAssignment_3_2_2_2 ) ) ;
    public final void rule__Node__Group_3_2_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:904:1: ( ( ( rule__Node__ProblemRefAssignment_3_2_2_2 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:905:1: ( ( rule__Node__ProblemRefAssignment_3_2_2_2 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:905:1: ( ( rule__Node__ProblemRefAssignment_3_2_2_2 ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:906:1: ( rule__Node__ProblemRefAssignment_3_2_2_2 )
            {
             before(grammarAccess.getNodeAccess().getProblemRefAssignment_3_2_2_2()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:907:1: ( rule__Node__ProblemRefAssignment_3_2_2_2 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:907:2: rule__Node__ProblemRefAssignment_3_2_2_2
            {
            pushFollow(FOLLOW_rule__Node__ProblemRefAssignment_3_2_2_2_in_rule__Node__Group_3_2_2__21835);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:923:1: rule__Node__Group_3_2_3__0 : ( 'see' ) rule__Node__Group_3_2_3__1 ;
    public final void rule__Node__Group_3_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:927:1: ( ( 'see' ) rule__Node__Group_3_2_3__1 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:928:1: ( 'see' ) rule__Node__Group_3_2_3__1
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:928:1: ( 'see' )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:929:1: 'see'
            {
             before(grammarAccess.getNodeAccess().getSeeKeyword_3_2_3_0()); 
            match(input,29,FOLLOW_29_in_rule__Node__Group_3_2_3__01876); 
             after(grammarAccess.getNodeAccess().getSeeKeyword_3_2_3_0()); 

            }

            pushFollow(FOLLOW_rule__Node__Group_3_2_3__1_in_rule__Node__Group_3_2_3__01886);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:943:1: rule__Node__Group_3_2_3__1 : ( ( rule__Node__OtherAssignment_3_2_3_1 ) ) ;
    public final void rule__Node__Group_3_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:947:1: ( ( ( rule__Node__OtherAssignment_3_2_3_1 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:948:1: ( ( rule__Node__OtherAssignment_3_2_3_1 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:948:1: ( ( rule__Node__OtherAssignment_3_2_3_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:949:1: ( rule__Node__OtherAssignment_3_2_3_1 )
            {
             before(grammarAccess.getNodeAccess().getOtherAssignment_3_2_3_1()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:950:1: ( rule__Node__OtherAssignment_3_2_3_1 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:950:2: rule__Node__OtherAssignment_3_2_3_1
            {
            pushFollow(FOLLOW_rule__Node__OtherAssignment_3_2_3_1_in_rule__Node__Group_3_2_3__11914);
            rule__Node__OtherAssignment_3_2_3_1();
            _fsp--;


            }

             after(grammarAccess.getNodeAccess().getOtherAssignment_3_2_3_1()); 

            }


            }

        }
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


    // $ANTLR start rule__OtherLanguage__Group__0
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:964:1: rule__OtherLanguage__Group__0 : ( ( rule__OtherLanguage__TypeAssignment_0 ) ) rule__OtherLanguage__Group__1 ;
    public final void rule__OtherLanguage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:968:1: ( ( ( rule__OtherLanguage__TypeAssignment_0 ) ) rule__OtherLanguage__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:969:1: ( ( rule__OtherLanguage__TypeAssignment_0 ) ) rule__OtherLanguage__Group__1
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:969:1: ( ( rule__OtherLanguage__TypeAssignment_0 ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:970:1: ( rule__OtherLanguage__TypeAssignment_0 )
            {
             before(grammarAccess.getOtherLanguageAccess().getTypeAssignment_0()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:971:1: ( rule__OtherLanguage__TypeAssignment_0 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:971:2: rule__OtherLanguage__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__OtherLanguage__TypeAssignment_0_in_rule__OtherLanguage__Group__01952);
            rule__OtherLanguage__TypeAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getOtherLanguageAccess().getTypeAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__OtherLanguage__Group__1_in_rule__OtherLanguage__Group__01961);
            rule__OtherLanguage__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OtherLanguage__Group__0


    // $ANTLR start rule__OtherLanguage__Group__1
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:982:1: rule__OtherLanguage__Group__1 : ( ( rule__OtherLanguage__HrefAssignment_1 ) ) ;
    public final void rule__OtherLanguage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:986:1: ( ( ( rule__OtherLanguage__HrefAssignment_1 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:987:1: ( ( rule__OtherLanguage__HrefAssignment_1 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:987:1: ( ( rule__OtherLanguage__HrefAssignment_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:988:1: ( rule__OtherLanguage__HrefAssignment_1 )
            {
             before(grammarAccess.getOtherLanguageAccess().getHrefAssignment_1()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:989:1: ( rule__OtherLanguage__HrefAssignment_1 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:989:2: rule__OtherLanguage__HrefAssignment_1
            {
            pushFollow(FOLLOW_rule__OtherLanguage__HrefAssignment_1_in_rule__OtherLanguage__Group__11989);
            rule__OtherLanguage__HrefAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getOtherLanguageAccess().getHrefAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OtherLanguage__Group__1


    // $ANTLR start rule__Phenomenon__Group__0
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1003:1: rule__Phenomenon__Group__0 : ( ( rule__Phenomenon__TypeAssignment_0 )? ) rule__Phenomenon__Group__1 ;
    public final void rule__Phenomenon__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1007:1: ( ( ( rule__Phenomenon__TypeAssignment_0 )? ) rule__Phenomenon__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1008:1: ( ( rule__Phenomenon__TypeAssignment_0 )? ) rule__Phenomenon__Group__1
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1008:1: ( ( rule__Phenomenon__TypeAssignment_0 )? )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1009:1: ( rule__Phenomenon__TypeAssignment_0 )?
            {
             before(grammarAccess.getPhenomenonAccess().getTypeAssignment_0()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1010:1: ( rule__Phenomenon__TypeAssignment_0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=18 && LA13_0<=20)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1010:2: rule__Phenomenon__TypeAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Phenomenon__TypeAssignment_0_in_rule__Phenomenon__Group__02027);
                    rule__Phenomenon__TypeAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPhenomenonAccess().getTypeAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Phenomenon__Group__1_in_rule__Phenomenon__Group__02037);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1021:1: rule__Phenomenon__Group__1 : ( ( rule__Phenomenon__IsControlledAssignment_1 )? ) rule__Phenomenon__Group__2 ;
    public final void rule__Phenomenon__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1025:1: ( ( ( rule__Phenomenon__IsControlledAssignment_1 )? ) rule__Phenomenon__Group__2 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1026:1: ( ( rule__Phenomenon__IsControlledAssignment_1 )? ) rule__Phenomenon__Group__2
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1026:1: ( ( rule__Phenomenon__IsControlledAssignment_1 )? )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1027:1: ( rule__Phenomenon__IsControlledAssignment_1 )?
            {
             before(grammarAccess.getPhenomenonAccess().getIsControlledAssignment_1()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1028:1: ( rule__Phenomenon__IsControlledAssignment_1 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==31) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1028:2: rule__Phenomenon__IsControlledAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Phenomenon__IsControlledAssignment_1_in_rule__Phenomenon__Group__12065);
                    rule__Phenomenon__IsControlledAssignment_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPhenomenonAccess().getIsControlledAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Phenomenon__Group__2_in_rule__Phenomenon__Group__12075);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1039:1: rule__Phenomenon__Group__2 : ( ( rule__Phenomenon__NameAssignment_2 ) ) rule__Phenomenon__Group__3 ;
    public final void rule__Phenomenon__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1043:1: ( ( ( rule__Phenomenon__NameAssignment_2 ) ) rule__Phenomenon__Group__3 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1044:1: ( ( rule__Phenomenon__NameAssignment_2 ) ) rule__Phenomenon__Group__3
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1044:1: ( ( rule__Phenomenon__NameAssignment_2 ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1045:1: ( rule__Phenomenon__NameAssignment_2 )
            {
             before(grammarAccess.getPhenomenonAccess().getNameAssignment_2()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1046:1: ( rule__Phenomenon__NameAssignment_2 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1046:2: rule__Phenomenon__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Phenomenon__NameAssignment_2_in_rule__Phenomenon__Group__22103);
            rule__Phenomenon__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getPhenomenonAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__Phenomenon__Group__3_in_rule__Phenomenon__Group__22112);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1057:1: rule__Phenomenon__Group__3 : ( ( rule__Phenomenon__Group_3__0 )? ) ;
    public final void rule__Phenomenon__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1061:1: ( ( ( rule__Phenomenon__Group_3__0 )? ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1062:1: ( ( rule__Phenomenon__Group_3__0 )? )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1062:1: ( ( rule__Phenomenon__Group_3__0 )? )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1063:1: ( rule__Phenomenon__Group_3__0 )?
            {
             before(grammarAccess.getPhenomenonAccess().getGroup_3()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1064:1: ( rule__Phenomenon__Group_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1064:2: rule__Phenomenon__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Phenomenon__Group_3__0_in_rule__Phenomenon__Group__32140);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1082:1: rule__Phenomenon__Group_3__0 : ( ':' ) rule__Phenomenon__Group_3__1 ;
    public final void rule__Phenomenon__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1086:1: ( ( ':' ) rule__Phenomenon__Group_3__1 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1087:1: ( ':' ) rule__Phenomenon__Group_3__1
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1087:1: ( ':' )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1088:1: ':'
            {
             before(grammarAccess.getPhenomenonAccess().getColonKeyword_3_0()); 
            match(input,25,FOLLOW_25_in_rule__Phenomenon__Group_3__02184); 
             after(grammarAccess.getPhenomenonAccess().getColonKeyword_3_0()); 

            }

            pushFollow(FOLLOW_rule__Phenomenon__Group_3__1_in_rule__Phenomenon__Group_3__02194);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1102:1: rule__Phenomenon__Group_3__1 : ( ( rule__Phenomenon__DescriptionAssignment_3_1 ) ) ;
    public final void rule__Phenomenon__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1106:1: ( ( ( rule__Phenomenon__DescriptionAssignment_3_1 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1107:1: ( ( rule__Phenomenon__DescriptionAssignment_3_1 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1107:1: ( ( rule__Phenomenon__DescriptionAssignment_3_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1108:1: ( rule__Phenomenon__DescriptionAssignment_3_1 )
            {
             before(grammarAccess.getPhenomenonAccess().getDescriptionAssignment_3_1()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1109:1: ( rule__Phenomenon__DescriptionAssignment_3_1 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1109:2: rule__Phenomenon__DescriptionAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Phenomenon__DescriptionAssignment_3_1_in_rule__Phenomenon__Group_3__12222);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1123:1: rule__Link__Group__0 : ( ( rule__Link__FromAssignment_0 ) ) rule__Link__Group__1 ;
    public final void rule__Link__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1127:1: ( ( ( rule__Link__FromAssignment_0 ) ) rule__Link__Group__1 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1128:1: ( ( rule__Link__FromAssignment_0 ) ) rule__Link__Group__1
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1128:1: ( ( rule__Link__FromAssignment_0 ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1129:1: ( rule__Link__FromAssignment_0 )
            {
             before(grammarAccess.getLinkAccess().getFromAssignment_0()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1130:1: ( rule__Link__FromAssignment_0 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1130:2: rule__Link__FromAssignment_0
            {
            pushFollow(FOLLOW_rule__Link__FromAssignment_0_in_rule__Link__Group__02260);
            rule__Link__FromAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getLinkAccess().getFromAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Link__Group__1_in_rule__Link__Group__02269);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1141:1: rule__Link__Group__1 : ( ( rule__Link__TypeAssignment_1 ) ) rule__Link__Group__2 ;
    public final void rule__Link__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1145:1: ( ( ( rule__Link__TypeAssignment_1 ) ) rule__Link__Group__2 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1146:1: ( ( rule__Link__TypeAssignment_1 ) ) rule__Link__Group__2
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1146:1: ( ( rule__Link__TypeAssignment_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1147:1: ( rule__Link__TypeAssignment_1 )
            {
             before(grammarAccess.getLinkAccess().getTypeAssignment_1()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1148:1: ( rule__Link__TypeAssignment_1 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1148:2: rule__Link__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Link__TypeAssignment_1_in_rule__Link__Group__12297);
            rule__Link__TypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getLinkAccess().getTypeAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Link__Group__2_in_rule__Link__Group__12306);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1159:1: rule__Link__Group__2 : ( ( rule__Link__ToAssignment_2 ) ) rule__Link__Group__3 ;
    public final void rule__Link__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1163:1: ( ( ( rule__Link__ToAssignment_2 ) ) rule__Link__Group__3 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1164:1: ( ( rule__Link__ToAssignment_2 ) ) rule__Link__Group__3
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1164:1: ( ( rule__Link__ToAssignment_2 ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1165:1: ( rule__Link__ToAssignment_2 )
            {
             before(grammarAccess.getLinkAccess().getToAssignment_2()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1166:1: ( rule__Link__ToAssignment_2 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1166:2: rule__Link__ToAssignment_2
            {
            pushFollow(FOLLOW_rule__Link__ToAssignment_2_in_rule__Link__Group__22334);
            rule__Link__ToAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getLinkAccess().getToAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__Link__Group__3_in_rule__Link__Group__22343);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1177:1: rule__Link__Group__3 : ( ( rule__Link__Group_3__0 )? ) rule__Link__Group__4 ;
    public final void rule__Link__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1181:1: ( ( ( rule__Link__Group_3__0 )? ) rule__Link__Group__4 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1182:1: ( ( rule__Link__Group_3__0 )? ) rule__Link__Group__4
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1182:1: ( ( rule__Link__Group_3__0 )? )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1183:1: ( rule__Link__Group_3__0 )?
            {
             before(grammarAccess.getLinkAccess().getGroup_3()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1184:1: ( rule__Link__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1184:2: rule__Link__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Link__Group_3__0_in_rule__Link__Group__32371);
                    rule__Link__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLinkAccess().getGroup_3()); 

            }

            pushFollow(FOLLOW_rule__Link__Group__4_in_rule__Link__Group__32381);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1195:1: rule__Link__Group__4 : ( ( rule__Link__Group_4__0 )? ) ;
    public final void rule__Link__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1199:1: ( ( ( rule__Link__Group_4__0 )? ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1200:1: ( ( rule__Link__Group_4__0 )? )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1200:1: ( ( rule__Link__Group_4__0 )? )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1201:1: ( rule__Link__Group_4__0 )?
            {
             before(grammarAccess.getLinkAccess().getGroup_4()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1202:1: ( rule__Link__Group_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==25) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1202:2: rule__Link__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Link__Group_4__0_in_rule__Link__Group__42409);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1222:1: rule__Link__Group_3__0 : ( '{' ) rule__Link__Group_3__1 ;
    public final void rule__Link__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1226:1: ( ( '{' ) rule__Link__Group_3__1 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1227:1: ( '{' ) rule__Link__Group_3__1
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1227:1: ( '{' )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1228:1: '{'
            {
             before(grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,26,FOLLOW_26_in_rule__Link__Group_3__02455); 
             after(grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_3_0()); 

            }

            pushFollow(FOLLOW_rule__Link__Group_3__1_in_rule__Link__Group_3__02465);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1242:1: rule__Link__Group_3__1 : ( ( rule__Link__PhenomenaAssignment_3_1 ) ) rule__Link__Group_3__2 ;
    public final void rule__Link__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1246:1: ( ( ( rule__Link__PhenomenaAssignment_3_1 ) ) rule__Link__Group_3__2 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1247:1: ( ( rule__Link__PhenomenaAssignment_3_1 ) ) rule__Link__Group_3__2
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1247:1: ( ( rule__Link__PhenomenaAssignment_3_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1248:1: ( rule__Link__PhenomenaAssignment_3_1 )
            {
             before(grammarAccess.getLinkAccess().getPhenomenaAssignment_3_1()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1249:1: ( rule__Link__PhenomenaAssignment_3_1 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1249:2: rule__Link__PhenomenaAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Link__PhenomenaAssignment_3_1_in_rule__Link__Group_3__12493);
            rule__Link__PhenomenaAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getLinkAccess().getPhenomenaAssignment_3_1()); 

            }

            pushFollow(FOLLOW_rule__Link__Group_3__2_in_rule__Link__Group_3__12502);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1260:1: rule__Link__Group_3__2 : ( ( rule__Link__Group_3_2__0 )* ) rule__Link__Group_3__3 ;
    public final void rule__Link__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1264:1: ( ( ( rule__Link__Group_3_2__0 )* ) rule__Link__Group_3__3 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1265:1: ( ( rule__Link__Group_3_2__0 )* ) rule__Link__Group_3__3
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1265:1: ( ( rule__Link__Group_3_2__0 )* )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1266:1: ( rule__Link__Group_3_2__0 )*
            {
             before(grammarAccess.getLinkAccess().getGroup_3_2()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1267:1: ( rule__Link__Group_3_2__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==28) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1267:2: rule__Link__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Link__Group_3_2__0_in_rule__Link__Group_3__22530);
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

            pushFollow(FOLLOW_rule__Link__Group_3__3_in_rule__Link__Group_3__22540);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1278:1: rule__Link__Group_3__3 : ( '}' ) ;
    public final void rule__Link__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1282:1: ( ( '}' ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1283:1: ( '}' )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1283:1: ( '}' )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1284:1: '}'
            {
             before(grammarAccess.getLinkAccess().getRightCurlyBracketKeyword_3_3()); 
            match(input,27,FOLLOW_27_in_rule__Link__Group_3__32569); 
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1305:1: rule__Link__Group_3_2__0 : ( ',' ) rule__Link__Group_3_2__1 ;
    public final void rule__Link__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1309:1: ( ( ',' ) rule__Link__Group_3_2__1 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1310:1: ( ',' ) rule__Link__Group_3_2__1
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1310:1: ( ',' )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1311:1: ','
            {
             before(grammarAccess.getLinkAccess().getCommaKeyword_3_2_0()); 
            match(input,28,FOLLOW_28_in_rule__Link__Group_3_2__02613); 
             after(grammarAccess.getLinkAccess().getCommaKeyword_3_2_0()); 

            }

            pushFollow(FOLLOW_rule__Link__Group_3_2__1_in_rule__Link__Group_3_2__02623);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1325:1: rule__Link__Group_3_2__1 : ( ( rule__Link__PhenomenaAssignment_3_2_1 ) ) ;
    public final void rule__Link__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1329:1: ( ( ( rule__Link__PhenomenaAssignment_3_2_1 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1330:1: ( ( rule__Link__PhenomenaAssignment_3_2_1 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1330:1: ( ( rule__Link__PhenomenaAssignment_3_2_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1331:1: ( rule__Link__PhenomenaAssignment_3_2_1 )
            {
             before(grammarAccess.getLinkAccess().getPhenomenaAssignment_3_2_1()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1332:1: ( rule__Link__PhenomenaAssignment_3_2_1 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1332:2: rule__Link__PhenomenaAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__Link__PhenomenaAssignment_3_2_1_in_rule__Link__Group_3_2__12651);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1346:1: rule__Link__Group_4__0 : ( ':' ) rule__Link__Group_4__1 ;
    public final void rule__Link__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1350:1: ( ( ':' ) rule__Link__Group_4__1 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1351:1: ( ':' ) rule__Link__Group_4__1
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1351:1: ( ':' )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1352:1: ':'
            {
             before(grammarAccess.getLinkAccess().getColonKeyword_4_0()); 
            match(input,25,FOLLOW_25_in_rule__Link__Group_4__02690); 
             after(grammarAccess.getLinkAccess().getColonKeyword_4_0()); 

            }

            pushFollow(FOLLOW_rule__Link__Group_4__1_in_rule__Link__Group_4__02700);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1366:1: rule__Link__Group_4__1 : ( ( rule__Link__DescriptionAssignment_4_1 ) ) ;
    public final void rule__Link__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1370:1: ( ( ( rule__Link__DescriptionAssignment_4_1 ) ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1371:1: ( ( rule__Link__DescriptionAssignment_4_1 ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1371:1: ( ( rule__Link__DescriptionAssignment_4_1 ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1372:1: ( rule__Link__DescriptionAssignment_4_1 )
            {
             before(grammarAccess.getLinkAccess().getDescriptionAssignment_4_1()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1373:1: ( rule__Link__DescriptionAssignment_4_1 )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1373:2: rule__Link__DescriptionAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Link__DescriptionAssignment_4_1_in_rule__Link__Group_4__12728);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1387:1: rule__ProblemDiagram__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ProblemDiagram__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1391:1: ( ( RULE_STRING ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1392:1: ( RULE_STRING )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1392:1: ( RULE_STRING )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1393:1: RULE_STRING
            {
             before(grammarAccess.getProblemDiagramAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ProblemDiagram__NameAssignment_22766); 
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1402:1: rule__ProblemDiagram__NodesAssignment_3_0 : ( ruleNode ) ;
    public final void rule__ProblemDiagram__NodesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1406:1: ( ( ruleNode ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1407:1: ( ruleNode )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1407:1: ( ruleNode )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1408:1: ruleNode
            {
             before(grammarAccess.getProblemDiagramAccess().getNodesNodeParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_ruleNode_in_rule__ProblemDiagram__NodesAssignment_3_02797);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1417:1: rule__ProblemDiagram__LinksAssignment_3_1 : ( ruleLink ) ;
    public final void rule__ProblemDiagram__LinksAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1421:1: ( ( ruleLink ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1422:1: ( ruleLink )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1422:1: ( ruleLink )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1423:1: ruleLink
            {
             before(grammarAccess.getProblemDiagramAccess().getLinksLinkParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleLink_in_rule__ProblemDiagram__LinksAssignment_3_12828);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1432:1: rule__Node__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Node__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1436:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1437:1: ( RULE_ID )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1437:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1438:1: RULE_ID
            {
             before(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Node__NameAssignment_02859); 
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1447:1: rule__Node__TypeAssignment_1 : ( ruleNodeType ) ;
    public final void rule__Node__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1451:1: ( ( ruleNodeType ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1452:1: ( ruleNodeType )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1452:1: ( ruleNodeType )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1453:1: ruleNodeType
            {
             before(grammarAccess.getNodeAccess().getTypeNodeTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleNodeType_in_rule__Node__TypeAssignment_12890);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1462:1: rule__Node__DescriptionAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Node__DescriptionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1466:1: ( ( RULE_STRING ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1467:1: ( RULE_STRING )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1467:1: ( RULE_STRING )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1468:1: RULE_STRING
            {
             before(grammarAccess.getNodeAccess().getDescriptionSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Node__DescriptionAssignment_2_12921); 
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1477:1: rule__Node__HiddenPhenomenaAssignment_3_1_0 : ( rulePhenomenon ) ;
    public final void rule__Node__HiddenPhenomenaAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1481:1: ( ( rulePhenomenon ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1482:1: ( rulePhenomenon )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1482:1: ( rulePhenomenon )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1483:1: rulePhenomenon
            {
             before(grammarAccess.getNodeAccess().getHiddenPhenomenaPhenomenonParserRuleCall_3_1_0_0()); 
            pushFollow(FOLLOW_rulePhenomenon_in_rule__Node__HiddenPhenomenaAssignment_3_1_02952);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1492:1: rule__Node__HiddenPhenomenaAssignment_3_1_1_1 : ( rulePhenomenon ) ;
    public final void rule__Node__HiddenPhenomenaAssignment_3_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1496:1: ( ( rulePhenomenon ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1497:1: ( rulePhenomenon )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1497:1: ( rulePhenomenon )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1498:1: rulePhenomenon
            {
             before(grammarAccess.getNodeAccess().getHiddenPhenomenaPhenomenonParserRuleCall_3_1_1_1_0()); 
            pushFollow(FOLLOW_rulePhenomenon_in_rule__Node__HiddenPhenomenaAssignment_3_1_1_12983);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1507:1: rule__Node__SubproblemAssignment_3_2_0 : ( ruleProblemDiagram ) ;
    public final void rule__Node__SubproblemAssignment_3_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1511:1: ( ( ruleProblemDiagram ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1512:1: ( ruleProblemDiagram )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1512:1: ( ruleProblemDiagram )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1513:1: ruleProblemDiagram
            {
             before(grammarAccess.getNodeAccess().getSubproblemProblemDiagramParserRuleCall_3_2_0_0()); 
            pushFollow(FOLLOW_ruleProblemDiagram_in_rule__Node__SubproblemAssignment_3_2_03014);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1522:1: rule__Node__ProblemNodeRefAssignment_3_2_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__Node__ProblemNodeRefAssignment_3_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1526:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1527:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1527:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1528:1: ( RULE_ID )
            {
             before(grammarAccess.getNodeAccess().getProblemNodeRefNodeCrossReference_3_2_1_2_0()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1529:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1530:1: RULE_ID
            {
             before(grammarAccess.getNodeAccess().getProblemNodeRefNodeIDTerminalRuleCall_3_2_1_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Node__ProblemNodeRefAssignment_3_2_1_23049); 
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1541:1: rule__Node__ProblemRefAssignment_3_2_2_2 : ( ( RULE_ID ) ) ;
    public final void rule__Node__ProblemRefAssignment_3_2_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1545:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1546:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1546:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1547:1: ( RULE_ID )
            {
             before(grammarAccess.getNodeAccess().getProblemRefProblemDiagramCrossReference_3_2_2_2_0()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1548:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1549:1: RULE_ID
            {
             before(grammarAccess.getNodeAccess().getProblemRefProblemDiagramIDTerminalRuleCall_3_2_2_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Node__ProblemRefAssignment_3_2_2_23088); 
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


    // $ANTLR start rule__Node__OtherAssignment_3_2_3_1
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1560:1: rule__Node__OtherAssignment_3_2_3_1 : ( ruleOtherLanguage ) ;
    public final void rule__Node__OtherAssignment_3_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1564:1: ( ( ruleOtherLanguage ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1565:1: ( ruleOtherLanguage )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1565:1: ( ruleOtherLanguage )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1566:1: ruleOtherLanguage
            {
             before(grammarAccess.getNodeAccess().getOtherOtherLanguageParserRuleCall_3_2_3_1_0()); 
            pushFollow(FOLLOW_ruleOtherLanguage_in_rule__Node__OtherAssignment_3_2_3_13123);
            ruleOtherLanguage();
            _fsp--;

             after(grammarAccess.getNodeAccess().getOtherOtherLanguageParserRuleCall_3_2_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__OtherAssignment_3_2_3_1


    // $ANTLR start rule__OtherLanguage__TypeAssignment_0
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1575:1: rule__OtherLanguage__TypeAssignment_0 : ( RULE_STRING ) ;
    public final void rule__OtherLanguage__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1579:1: ( ( RULE_STRING ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1580:1: ( RULE_STRING )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1580:1: ( RULE_STRING )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1581:1: RULE_STRING
            {
             before(grammarAccess.getOtherLanguageAccess().getTypeSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__OtherLanguage__TypeAssignment_03154); 
             after(grammarAccess.getOtherLanguageAccess().getTypeSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OtherLanguage__TypeAssignment_0


    // $ANTLR start rule__OtherLanguage__HrefAssignment_1
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1590:1: rule__OtherLanguage__HrefAssignment_1 : ( RULE_STRING ) ;
    public final void rule__OtherLanguage__HrefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1594:1: ( ( RULE_STRING ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1595:1: ( RULE_STRING )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1595:1: ( RULE_STRING )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1596:1: RULE_STRING
            {
             before(grammarAccess.getOtherLanguageAccess().getHrefSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__OtherLanguage__HrefAssignment_13185); 
             after(grammarAccess.getOtherLanguageAccess().getHrefSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OtherLanguage__HrefAssignment_1


    // $ANTLR start rule__Phenomenon__TypeAssignment_0
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1605:1: rule__Phenomenon__TypeAssignment_0 : ( rulePhenomenonType ) ;
    public final void rule__Phenomenon__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1609:1: ( ( rulePhenomenonType ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1610:1: ( rulePhenomenonType )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1610:1: ( rulePhenomenonType )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1611:1: rulePhenomenonType
            {
             before(grammarAccess.getPhenomenonAccess().getTypePhenomenonTypeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_rulePhenomenonType_in_rule__Phenomenon__TypeAssignment_03216);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1620:1: rule__Phenomenon__IsControlledAssignment_1 : ( ( '!' ) ) ;
    public final void rule__Phenomenon__IsControlledAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1624:1: ( ( ( '!' ) ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1625:1: ( ( '!' ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1625:1: ( ( '!' ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1626:1: ( '!' )
            {
             before(grammarAccess.getPhenomenonAccess().getIsControlledExclamationMarkKeyword_1_0()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1627:1: ( '!' )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1628:1: '!'
            {
             before(grammarAccess.getPhenomenonAccess().getIsControlledExclamationMarkKeyword_1_0()); 
            match(input,31,FOLLOW_31_in_rule__Phenomenon__IsControlledAssignment_13252); 
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1643:1: rule__Phenomenon__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Phenomenon__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1647:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1648:1: ( RULE_ID )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1648:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1649:1: RULE_ID
            {
             before(grammarAccess.getPhenomenonAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Phenomenon__NameAssignment_23291); 
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1658:1: rule__Phenomenon__DescriptionAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Phenomenon__DescriptionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1662:1: ( ( RULE_STRING ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1663:1: ( RULE_STRING )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1663:1: ( RULE_STRING )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1664:1: RULE_STRING
            {
             before(grammarAccess.getPhenomenonAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Phenomenon__DescriptionAssignment_3_13322); 
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1673:1: rule__Link__FromAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Link__FromAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1677:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1678:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1678:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1679:1: ( RULE_ID )
            {
             before(grammarAccess.getLinkAccess().getFromNodeCrossReference_0_0()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1680:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1681:1: RULE_ID
            {
             before(grammarAccess.getLinkAccess().getFromNodeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Link__FromAssignment_03357); 
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1692:1: rule__Link__TypeAssignment_1 : ( ruleLinkType ) ;
    public final void rule__Link__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1696:1: ( ( ruleLinkType ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1697:1: ( ruleLinkType )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1697:1: ( ruleLinkType )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1698:1: ruleLinkType
            {
             before(grammarAccess.getLinkAccess().getTypeLinkTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleLinkType_in_rule__Link__TypeAssignment_13392);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1707:1: rule__Link__ToAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Link__ToAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1711:1: ( ( ( RULE_ID ) ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1712:1: ( ( RULE_ID ) )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1712:1: ( ( RULE_ID ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1713:1: ( RULE_ID )
            {
             before(grammarAccess.getLinkAccess().getToNodeCrossReference_2_0()); 
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1714:1: ( RULE_ID )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1715:1: RULE_ID
            {
             before(grammarAccess.getLinkAccess().getToNodeIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Link__ToAssignment_23427); 
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1726:1: rule__Link__PhenomenaAssignment_3_1 : ( rulePhenomenon ) ;
    public final void rule__Link__PhenomenaAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1730:1: ( ( rulePhenomenon ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1731:1: ( rulePhenomenon )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1731:1: ( rulePhenomenon )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1732:1: rulePhenomenon
            {
             before(grammarAccess.getLinkAccess().getPhenomenaPhenomenonParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_rulePhenomenon_in_rule__Link__PhenomenaAssignment_3_13462);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1741:1: rule__Link__PhenomenaAssignment_3_2_1 : ( rulePhenomenon ) ;
    public final void rule__Link__PhenomenaAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1745:1: ( ( rulePhenomenon ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1746:1: ( rulePhenomenon )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1746:1: ( rulePhenomenon )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1747:1: rulePhenomenon
            {
             before(grammarAccess.getLinkAccess().getPhenomenaPhenomenonParserRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_rulePhenomenon_in_rule__Link__PhenomenaAssignment_3_2_13493);
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
    // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1756:1: rule__Link__DescriptionAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Link__DescriptionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1760:1: ( ( RULE_STRING ) )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1761:1: ( RULE_STRING )
            {
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1761:1: ( RULE_STRING )
            // ../problem.ui/src-gen/uk/ac/open/contentassist/antlr/internal/InternalProblem.g:1762:1: RULE_STRING
            {
             before(grammarAccess.getLinkAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Link__DescriptionAssignment_4_13524); 
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
    public static final BitSet FOLLOW_ruleOtherLanguage_in_entryRuleOtherLanguage180 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOtherLanguage187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OtherLanguage__Group__0_in_ruleOtherLanguage214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhenomenon_in_entryRulePhenomenon240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePhenomenon247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Phenomenon__Group__0_in_rulePhenomenon274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_entryRuleLink300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLink307 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_11_in_rule__NodeType__Alternatives617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__NodeType__Alternatives638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__NodeType__Alternatives659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__NodeType__Alternatives680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__NodeType__Alternatives701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__NodeType__Alternatives722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__NodeType__Alternatives743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__PhenomenonType__Alternatives779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__PhenomenonType__Alternatives800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__PhenomenonType__Alternatives821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__LinkType__Alternatives857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__LinkType__Alternatives878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__LinkType__Alternatives899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ProblemDiagram__Group__0937 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__Group__1_in_rule__ProblemDiagram__Group__0947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ProblemDiagram__Group__1976 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__Group__2_in_rule__ProblemDiagram__Group__1986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__NameAssignment_2_in_rule__ProblemDiagram__Group__21014 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__Group__3_in_rule__ProblemDiagram__Group__21023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProblemDiagram__Alternatives_3_in_rule__ProblemDiagram__Group__31051 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Node__NameAssignment_0_in_rule__Node__Group__01094 = new BitSet(new long[]{0x000000000603F802L});
    public static final BitSet FOLLOW_rule__Node__Group__1_in_rule__Node__Group__01103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__TypeAssignment_1_in_rule__Node__Group__11131 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_rule__Node__Group__2_in_rule__Node__Group__11141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_2__0_in_rule__Node__Group__21169 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Node__Group__3_in_rule__Node__Group__21179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3__0_in_rule__Node__Group__31207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Node__Group_2__01251 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Node__Group_2__1_in_rule__Node__Group_2__01261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__DescriptionAssignment_2_1_in_rule__Node__Group_2__11289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Node__Group_3__01328 = new BitSet(new long[]{0x00000000A91C0020L});
    public static final BitSet FOLLOW_rule__Node__Group_3__1_in_rule__Node__Group_3__01338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3_1__0_in_rule__Node__Group_3__11366 = new BitSet(new long[]{0x0000000029000000L});
    public static final BitSet FOLLOW_rule__Node__Group_3__2_in_rule__Node__Group_3__11376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Alternatives_3_2_in_rule__Node__Group_3__21404 = new BitSet(new long[]{0x0000000029000000L});
    public static final BitSet FOLLOW_rule__Node__Group_3__3_in_rule__Node__Group_3__21414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Node__Group_3__31443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__HiddenPhenomenaAssignment_3_1_0_in_rule__Node__Group_3_1__01486 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3_1__1_in_rule__Node__Group_3_1__01495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_3_1_1__0_in_rule__Node__Group_3_1__11523 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_rule__Node__Group_3_1_1__01563 = new BitSet(new long[]{0x00000000801C0020L});
    public static final BitSet FOLLOW_rule__Node__Group_3_1_1__1_in_rule__Node__Group_3_1_1__01573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__HiddenPhenomenaAssignment_3_1_1_1_in_rule__Node__Group_3_1_1__11601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Node__Group_3_2_1__01640 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Node__Group_3_2_1__1_in_rule__Node__Group_3_2_1__01650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Node__Group_3_2_1__11679 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Node__Group_3_2_1__2_in_rule__Node__Group_3_2_1__11689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__ProblemNodeRefAssignment_3_2_1_2_in_rule__Node__Group_3_2_1__21717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Node__Group_3_2_2__01758 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Node__Group_3_2_2__1_in_rule__Node__Group_3_2_2__01768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Node__Group_3_2_2__11797 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Node__Group_3_2_2__2_in_rule__Node__Group_3_2_2__11807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__ProblemRefAssignment_3_2_2_2_in_rule__Node__Group_3_2_2__21835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Node__Group_3_2_3__01876 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Node__Group_3_2_3__1_in_rule__Node__Group_3_2_3__01886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__OtherAssignment_3_2_3_1_in_rule__Node__Group_3_2_3__11914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OtherLanguage__TypeAssignment_0_in_rule__OtherLanguage__Group__01952 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__OtherLanguage__Group__1_in_rule__OtherLanguage__Group__01961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OtherLanguage__HrefAssignment_1_in_rule__OtherLanguage__Group__11989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Phenomenon__TypeAssignment_0_in_rule__Phenomenon__Group__02027 = new BitSet(new long[]{0x0000000080000020L});
    public static final BitSet FOLLOW_rule__Phenomenon__Group__1_in_rule__Phenomenon__Group__02037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Phenomenon__IsControlledAssignment_1_in_rule__Phenomenon__Group__12065 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Phenomenon__Group__2_in_rule__Phenomenon__Group__12075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Phenomenon__NameAssignment_2_in_rule__Phenomenon__Group__22103 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Phenomenon__Group__3_in_rule__Phenomenon__Group__22112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Phenomenon__Group_3__0_in_rule__Phenomenon__Group__32140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Phenomenon__Group_3__02184 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Phenomenon__Group_3__1_in_rule__Phenomenon__Group_3__02194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Phenomenon__DescriptionAssignment_3_1_in_rule__Phenomenon__Group_3__12222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__FromAssignment_0_in_rule__Link__Group__02260 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_rule__Link__Group__1_in_rule__Link__Group__02269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__TypeAssignment_1_in_rule__Link__Group__12297 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Link__Group__2_in_rule__Link__Group__12306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__ToAssignment_2_in_rule__Link__Group__22334 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_rule__Link__Group__3_in_rule__Link__Group__22343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group_3__0_in_rule__Link__Group__32371 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Link__Group__4_in_rule__Link__Group__32381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group_4__0_in_rule__Link__Group__42409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Link__Group_3__02455 = new BitSet(new long[]{0x00000000801C0020L});
    public static final BitSet FOLLOW_rule__Link__Group_3__1_in_rule__Link__Group_3__02465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__PhenomenaAssignment_3_1_in_rule__Link__Group_3__12493 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_rule__Link__Group_3__2_in_rule__Link__Group_3__12502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group_3_2__0_in_rule__Link__Group_3__22530 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_rule__Link__Group_3__3_in_rule__Link__Group_3__22540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Link__Group_3__32569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Link__Group_3_2__02613 = new BitSet(new long[]{0x00000000801C0020L});
    public static final BitSet FOLLOW_rule__Link__Group_3_2__1_in_rule__Link__Group_3_2__02623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__PhenomenaAssignment_3_2_1_in_rule__Link__Group_3_2__12651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Link__Group_4__02690 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Link__Group_4__1_in_rule__Link__Group_4__02700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__DescriptionAssignment_4_1_in_rule__Link__Group_4__12728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ProblemDiagram__NameAssignment_22766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_rule__ProblemDiagram__NodesAssignment_3_02797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_rule__ProblemDiagram__LinksAssignment_3_12828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Node__NameAssignment_02859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeType_in_rule__Node__TypeAssignment_12890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Node__DescriptionAssignment_2_12921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhenomenon_in_rule__Node__HiddenPhenomenaAssignment_3_1_02952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhenomenon_in_rule__Node__HiddenPhenomenaAssignment_3_1_1_12983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProblemDiagram_in_rule__Node__SubproblemAssignment_3_2_03014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Node__ProblemNodeRefAssignment_3_2_1_23049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Node__ProblemRefAssignment_3_2_2_23088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOtherLanguage_in_rule__Node__OtherAssignment_3_2_3_13123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__OtherLanguage__TypeAssignment_03154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__OtherLanguage__HrefAssignment_13185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhenomenonType_in_rule__Phenomenon__TypeAssignment_03216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Phenomenon__IsControlledAssignment_13252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Phenomenon__NameAssignment_23291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Phenomenon__DescriptionAssignment_3_13322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Link__FromAssignment_03357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkType_in_rule__Link__TypeAssignment_13392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Link__ToAssignment_23427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhenomenon_in_rule__Link__PhenomenaAssignment_3_13462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhenomenon_in_rule__Link__PhenomenaAssignment_3_2_13493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Link__DescriptionAssignment_4_13524 = new BitSet(new long[]{0x0000000000000002L});

}