package uk.ac.open.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_QUALIFIED_NAME", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'R'", "'M'", "'B'", "'X'", "'C'", "'D'", "'P'", "'?'", "'phenomenon'", "'event'", "'state'", "'--'", "'~~'", "'<~'", "'->'", "'~>'", "'problem:'", "'for'", "':'", "'{'", "'}'", "','", "'see'", "'domain'", "'problem'", "'!'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_QUALIFIED_NAME=6;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalProblemParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalProblemParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalProblemParser.tokenNames; }
    public String getGrammarFileName() { return "InternalProblem.g"; }


     
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




    // $ANTLR start "entryRuleProblemDiagram"
    // InternalProblem.g:60:1: entryRuleProblemDiagram : ruleProblemDiagram EOF ;
    public final void entryRuleProblemDiagram() throws RecognitionException {
        try {
            // InternalProblem.g:61:1: ( ruleProblemDiagram EOF )
            // InternalProblem.g:62:1: ruleProblemDiagram EOF
            {
             before(grammarAccess.getProblemDiagramRule()); 
            pushFollow(FOLLOW_1);
            ruleProblemDiagram();

            state._fsp--;

             after(grammarAccess.getProblemDiagramRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProblemDiagram"


    // $ANTLR start "ruleProblemDiagram"
    // InternalProblem.g:69:1: ruleProblemDiagram : ( ( rule__ProblemDiagram__Group__0 ) ) ;
    public final void ruleProblemDiagram() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:73:2: ( ( ( rule__ProblemDiagram__Group__0 ) ) )
            // InternalProblem.g:74:1: ( ( rule__ProblemDiagram__Group__0 ) )
            {
            // InternalProblem.g:74:1: ( ( rule__ProblemDiagram__Group__0 ) )
            // InternalProblem.g:75:1: ( rule__ProblemDiagram__Group__0 )
            {
             before(grammarAccess.getProblemDiagramAccess().getGroup()); 
            // InternalProblem.g:76:1: ( rule__ProblemDiagram__Group__0 )
            // InternalProblem.g:76:2: rule__ProblemDiagram__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ProblemDiagram__Group__0();

            state._fsp--;


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
    // $ANTLR end "ruleProblemDiagram"


    // $ANTLR start "entryRuleNode"
    // InternalProblem.g:88:1: entryRuleNode : ruleNode EOF ;
    public final void entryRuleNode() throws RecognitionException {
        try {
            // InternalProblem.g:89:1: ( ruleNode EOF )
            // InternalProblem.g:90:1: ruleNode EOF
            {
             before(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_1);
            ruleNode();

            state._fsp--;

             after(grammarAccess.getNodeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // InternalProblem.g:97:1: ruleNode : ( ( rule__Node__Group__0 ) ) ;
    public final void ruleNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:101:2: ( ( ( rule__Node__Group__0 ) ) )
            // InternalProblem.g:102:1: ( ( rule__Node__Group__0 ) )
            {
            // InternalProblem.g:102:1: ( ( rule__Node__Group__0 ) )
            // InternalProblem.g:103:1: ( rule__Node__Group__0 )
            {
             before(grammarAccess.getNodeAccess().getGroup()); 
            // InternalProblem.g:104:1: ( rule__Node__Group__0 )
            // InternalProblem.g:104:2: rule__Node__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Node__Group__0();

            state._fsp--;


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
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRulePhenomenon"
    // InternalProblem.g:116:1: entryRulePhenomenon : rulePhenomenon EOF ;
    public final void entryRulePhenomenon() throws RecognitionException {
        try {
            // InternalProblem.g:117:1: ( rulePhenomenon EOF )
            // InternalProblem.g:118:1: rulePhenomenon EOF
            {
             before(grammarAccess.getPhenomenonRule()); 
            pushFollow(FOLLOW_1);
            rulePhenomenon();

            state._fsp--;

             after(grammarAccess.getPhenomenonRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePhenomenon"


    // $ANTLR start "rulePhenomenon"
    // InternalProblem.g:125:1: rulePhenomenon : ( ( rule__Phenomenon__Group__0 ) ) ;
    public final void rulePhenomenon() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:129:2: ( ( ( rule__Phenomenon__Group__0 ) ) )
            // InternalProblem.g:130:1: ( ( rule__Phenomenon__Group__0 ) )
            {
            // InternalProblem.g:130:1: ( ( rule__Phenomenon__Group__0 ) )
            // InternalProblem.g:131:1: ( rule__Phenomenon__Group__0 )
            {
             before(grammarAccess.getPhenomenonAccess().getGroup()); 
            // InternalProblem.g:132:1: ( rule__Phenomenon__Group__0 )
            // InternalProblem.g:132:2: rule__Phenomenon__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Phenomenon__Group__0();

            state._fsp--;


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
    // $ANTLR end "rulePhenomenon"


    // $ANTLR start "entryRuleLink"
    // InternalProblem.g:144:1: entryRuleLink : ruleLink EOF ;
    public final void entryRuleLink() throws RecognitionException {
        try {
            // InternalProblem.g:145:1: ( ruleLink EOF )
            // InternalProblem.g:146:1: ruleLink EOF
            {
             before(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_1);
            ruleLink();

            state._fsp--;

             after(grammarAccess.getLinkRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLink"


    // $ANTLR start "ruleLink"
    // InternalProblem.g:153:1: ruleLink : ( ( rule__Link__Group__0 ) ) ;
    public final void ruleLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:157:2: ( ( ( rule__Link__Group__0 ) ) )
            // InternalProblem.g:158:1: ( ( rule__Link__Group__0 ) )
            {
            // InternalProblem.g:158:1: ( ( rule__Link__Group__0 ) )
            // InternalProblem.g:159:1: ( rule__Link__Group__0 )
            {
             before(grammarAccess.getLinkAccess().getGroup()); 
            // InternalProblem.g:160:1: ( rule__Link__Group__0 )
            // InternalProblem.g:160:2: rule__Link__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group__0();

            state._fsp--;


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
    // $ANTLR end "ruleLink"


    // $ANTLR start "ruleNodeType"
    // InternalProblem.g:173:1: ruleNodeType : ( ( rule__NodeType__Alternatives ) ) ;
    public final void ruleNodeType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:177:1: ( ( ( rule__NodeType__Alternatives ) ) )
            // InternalProblem.g:178:1: ( ( rule__NodeType__Alternatives ) )
            {
            // InternalProblem.g:178:1: ( ( rule__NodeType__Alternatives ) )
            // InternalProblem.g:179:1: ( rule__NodeType__Alternatives )
            {
             before(grammarAccess.getNodeTypeAccess().getAlternatives()); 
            // InternalProblem.g:180:1: ( rule__NodeType__Alternatives )
            // InternalProblem.g:180:2: rule__NodeType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NodeType__Alternatives();

            state._fsp--;


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
    // $ANTLR end "ruleNodeType"


    // $ANTLR start "rulePhenomenonType"
    // InternalProblem.g:192:1: rulePhenomenonType : ( ( rule__PhenomenonType__Alternatives ) ) ;
    public final void rulePhenomenonType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:196:1: ( ( ( rule__PhenomenonType__Alternatives ) ) )
            // InternalProblem.g:197:1: ( ( rule__PhenomenonType__Alternatives ) )
            {
            // InternalProblem.g:197:1: ( ( rule__PhenomenonType__Alternatives ) )
            // InternalProblem.g:198:1: ( rule__PhenomenonType__Alternatives )
            {
             before(grammarAccess.getPhenomenonTypeAccess().getAlternatives()); 
            // InternalProblem.g:199:1: ( rule__PhenomenonType__Alternatives )
            // InternalProblem.g:199:2: rule__PhenomenonType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PhenomenonType__Alternatives();

            state._fsp--;


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
    // $ANTLR end "rulePhenomenonType"


    // $ANTLR start "ruleLinkType"
    // InternalProblem.g:211:1: ruleLinkType : ( ( rule__LinkType__Alternatives ) ) ;
    public final void ruleLinkType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:215:1: ( ( ( rule__LinkType__Alternatives ) ) )
            // InternalProblem.g:216:1: ( ( rule__LinkType__Alternatives ) )
            {
            // InternalProblem.g:216:1: ( ( rule__LinkType__Alternatives ) )
            // InternalProblem.g:217:1: ( rule__LinkType__Alternatives )
            {
             before(grammarAccess.getLinkTypeAccess().getAlternatives()); 
            // InternalProblem.g:218:1: ( rule__LinkType__Alternatives )
            // InternalProblem.g:218:2: rule__LinkType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LinkType__Alternatives();

            state._fsp--;


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
    // $ANTLR end "ruleLinkType"


    // $ANTLR start "rule__ProblemDiagram__Alternatives_3"
    // InternalProblem.g:229:1: rule__ProblemDiagram__Alternatives_3 : ( ( ( rule__ProblemDiagram__NodesAssignment_3_0 ) ) | ( ( rule__ProblemDiagram__LinksAssignment_3_1 ) ) );
    public final void rule__ProblemDiagram__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:233:1: ( ( ( rule__ProblemDiagram__NodesAssignment_3_0 ) ) | ( ( rule__ProblemDiagram__LinksAssignment_3_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                int LA1_1 = input.LA(2);

                if ( ((LA1_1>=23 && LA1_1<=27)) ) {
                    alt1=2;
                }
                else if ( (LA1_1==EOF||(LA1_1>=RULE_ID && LA1_1<=RULE_STRING)||(LA1_1>=12 && LA1_1<=19)||LA1_1==28||(LA1_1>=30 && LA1_1<=32)||LA1_1==34) ) {
                    alt1=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalProblem.g:234:1: ( ( rule__ProblemDiagram__NodesAssignment_3_0 ) )
                    {
                    // InternalProblem.g:234:1: ( ( rule__ProblemDiagram__NodesAssignment_3_0 ) )
                    // InternalProblem.g:235:1: ( rule__ProblemDiagram__NodesAssignment_3_0 )
                    {
                     before(grammarAccess.getProblemDiagramAccess().getNodesAssignment_3_0()); 
                    // InternalProblem.g:236:1: ( rule__ProblemDiagram__NodesAssignment_3_0 )
                    // InternalProblem.g:236:2: rule__ProblemDiagram__NodesAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProblemDiagram__NodesAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getProblemDiagramAccess().getNodesAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:240:6: ( ( rule__ProblemDiagram__LinksAssignment_3_1 ) )
                    {
                    // InternalProblem.g:240:6: ( ( rule__ProblemDiagram__LinksAssignment_3_1 ) )
                    // InternalProblem.g:241:1: ( rule__ProblemDiagram__LinksAssignment_3_1 )
                    {
                     before(grammarAccess.getProblemDiagramAccess().getLinksAssignment_3_1()); 
                    // InternalProblem.g:242:1: ( rule__ProblemDiagram__LinksAssignment_3_1 )
                    // InternalProblem.g:242:2: rule__ProblemDiagram__LinksAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProblemDiagram__LinksAssignment_3_1();

                    state._fsp--;


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
    // $ANTLR end "rule__ProblemDiagram__Alternatives_3"


    // $ANTLR start "rule__Node__Alternatives_3_2"
    // InternalProblem.g:251:1: rule__Node__Alternatives_3_2 : ( ( ( rule__Node__SubproblemAssignment_3_2_0 ) ) | ( ( rule__Node__Group_3_2_1__0 ) ) | ( ( rule__Node__Group_3_2_2__0 ) ) | ( ( rule__Node__Group_3_2_3__0 ) ) );
    public final void rule__Node__Alternatives_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:255:1: ( ( ( rule__Node__SubproblemAssignment_3_2_0 ) ) | ( ( rule__Node__Group_3_2_1__0 ) ) | ( ( rule__Node__Group_3_2_2__0 ) ) | ( ( rule__Node__Group_3_2_3__0 ) ) )
            int alt2=4;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==28) ) {
                alt2=1;
            }
            else if ( (LA2_0==34) ) {
                switch ( input.LA(2) ) {
                case RULE_STRING:
                    {
                    alt2=4;
                    }
                    break;
                case 35:
                    {
                    alt2=2;
                    }
                    break;
                case 36:
                    {
                    alt2=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalProblem.g:256:1: ( ( rule__Node__SubproblemAssignment_3_2_0 ) )
                    {
                    // InternalProblem.g:256:1: ( ( rule__Node__SubproblemAssignment_3_2_0 ) )
                    // InternalProblem.g:257:1: ( rule__Node__SubproblemAssignment_3_2_0 )
                    {
                     before(grammarAccess.getNodeAccess().getSubproblemAssignment_3_2_0()); 
                    // InternalProblem.g:258:1: ( rule__Node__SubproblemAssignment_3_2_0 )
                    // InternalProblem.g:258:2: rule__Node__SubproblemAssignment_3_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Node__SubproblemAssignment_3_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNodeAccess().getSubproblemAssignment_3_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:262:6: ( ( rule__Node__Group_3_2_1__0 ) )
                    {
                    // InternalProblem.g:262:6: ( ( rule__Node__Group_3_2_1__0 ) )
                    // InternalProblem.g:263:1: ( rule__Node__Group_3_2_1__0 )
                    {
                     before(grammarAccess.getNodeAccess().getGroup_3_2_1()); 
                    // InternalProblem.g:264:1: ( rule__Node__Group_3_2_1__0 )
                    // InternalProblem.g:264:2: rule__Node__Group_3_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Node__Group_3_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNodeAccess().getGroup_3_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalProblem.g:268:6: ( ( rule__Node__Group_3_2_2__0 ) )
                    {
                    // InternalProblem.g:268:6: ( ( rule__Node__Group_3_2_2__0 ) )
                    // InternalProblem.g:269:1: ( rule__Node__Group_3_2_2__0 )
                    {
                     before(grammarAccess.getNodeAccess().getGroup_3_2_2()); 
                    // InternalProblem.g:270:1: ( rule__Node__Group_3_2_2__0 )
                    // InternalProblem.g:270:2: rule__Node__Group_3_2_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Node__Group_3_2_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNodeAccess().getGroup_3_2_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalProblem.g:274:6: ( ( rule__Node__Group_3_2_3__0 ) )
                    {
                    // InternalProblem.g:274:6: ( ( rule__Node__Group_3_2_3__0 ) )
                    // InternalProblem.g:275:1: ( rule__Node__Group_3_2_3__0 )
                    {
                     before(grammarAccess.getNodeAccess().getGroup_3_2_3()); 
                    // InternalProblem.g:276:1: ( rule__Node__Group_3_2_3__0 )
                    // InternalProblem.g:276:2: rule__Node__Group_3_2_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Node__Group_3_2_3__0();

                    state._fsp--;


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
    // $ANTLR end "rule__Node__Alternatives_3_2"


    // $ANTLR start "rule__NodeType__Alternatives"
    // InternalProblem.g:285:1: rule__NodeType__Alternatives : ( ( ( 'R' ) ) | ( ( 'M' ) ) | ( ( 'B' ) ) | ( ( 'X' ) ) | ( ( 'C' ) ) | ( ( 'D' ) ) | ( ( 'P' ) ) | ( ( '?' ) ) );
    public final void rule__NodeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:289:1: ( ( ( 'R' ) ) | ( ( 'M' ) ) | ( ( 'B' ) ) | ( ( 'X' ) ) | ( ( 'C' ) ) | ( ( 'D' ) ) | ( ( 'P' ) ) | ( ( '?' ) ) )
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
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalProblem.g:290:1: ( ( 'R' ) )
                    {
                    // InternalProblem.g:290:1: ( ( 'R' ) )
                    // InternalProblem.g:291:1: ( 'R' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getREQUIREMENTEnumLiteralDeclaration_0()); 
                    // InternalProblem.g:292:1: ( 'R' )
                    // InternalProblem.g:292:3: 'R'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getREQUIREMENTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:297:6: ( ( 'M' ) )
                    {
                    // InternalProblem.g:297:6: ( ( 'M' ) )
                    // InternalProblem.g:298:1: ( 'M' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getMACHINEEnumLiteralDeclaration_1()); 
                    // InternalProblem.g:299:1: ( 'M' )
                    // InternalProblem.g:299:3: 'M'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getMACHINEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalProblem.g:304:6: ( ( 'B' ) )
                    {
                    // InternalProblem.g:304:6: ( ( 'B' ) )
                    // InternalProblem.g:305:1: ( 'B' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getBIDDABLEEnumLiteralDeclaration_2()); 
                    // InternalProblem.g:306:1: ( 'B' )
                    // InternalProblem.g:306:3: 'B'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getBIDDABLEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalProblem.g:311:6: ( ( 'X' ) )
                    {
                    // InternalProblem.g:311:6: ( ( 'X' ) )
                    // InternalProblem.g:312:1: ( 'X' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getLEXICALEnumLiteralDeclaration_3()); 
                    // InternalProblem.g:313:1: ( 'X' )
                    // InternalProblem.g:313:3: 'X'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getLEXICALEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalProblem.g:318:6: ( ( 'C' ) )
                    {
                    // InternalProblem.g:318:6: ( ( 'C' ) )
                    // InternalProblem.g:319:1: ( 'C' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getCAUSALEnumLiteralDeclaration_4()); 
                    // InternalProblem.g:320:1: ( 'C' )
                    // InternalProblem.g:320:3: 'C'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getCAUSALEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalProblem.g:325:6: ( ( 'D' ) )
                    {
                    // InternalProblem.g:325:6: ( ( 'D' ) )
                    // InternalProblem.g:326:1: ( 'D' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getDESIGNEDEnumLiteralDeclaration_5()); 
                    // InternalProblem.g:327:1: ( 'D' )
                    // InternalProblem.g:327:3: 'D'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getDESIGNEDEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalProblem.g:332:6: ( ( 'P' ) )
                    {
                    // InternalProblem.g:332:6: ( ( 'P' ) )
                    // InternalProblem.g:333:1: ( 'P' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getPHYSICALEnumLiteralDeclaration_6()); 
                    // InternalProblem.g:334:1: ( 'P' )
                    // InternalProblem.g:334:3: 'P'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getPHYSICALEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalProblem.g:339:6: ( ( '?' ) )
                    {
                    // InternalProblem.g:339:6: ( ( '?' ) )
                    // InternalProblem.g:340:1: ( '?' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getCONCERNEnumLiteralDeclaration_7()); 
                    // InternalProblem.g:341:1: ( '?' )
                    // InternalProblem.g:341:3: '?'
                    {
                    match(input,19,FOLLOW_2); 

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
    // $ANTLR end "rule__NodeType__Alternatives"


    // $ANTLR start "rule__PhenomenonType__Alternatives"
    // InternalProblem.g:351:1: rule__PhenomenonType__Alternatives : ( ( ( 'phenomenon' ) ) | ( ( 'event' ) ) | ( ( 'state' ) ) );
    public final void rule__PhenomenonType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:355:1: ( ( ( 'phenomenon' ) ) | ( ( 'event' ) ) | ( ( 'state' ) ) )
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
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalProblem.g:356:1: ( ( 'phenomenon' ) )
                    {
                    // InternalProblem.g:356:1: ( ( 'phenomenon' ) )
                    // InternalProblem.g:357:1: ( 'phenomenon' )
                    {
                     before(grammarAccess.getPhenomenonTypeAccess().getUNSPECIFIEDEnumLiteralDeclaration_0()); 
                    // InternalProblem.g:358:1: ( 'phenomenon' )
                    // InternalProblem.g:358:3: 'phenomenon'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getPhenomenonTypeAccess().getUNSPECIFIEDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:363:6: ( ( 'event' ) )
                    {
                    // InternalProblem.g:363:6: ( ( 'event' ) )
                    // InternalProblem.g:364:1: ( 'event' )
                    {
                     before(grammarAccess.getPhenomenonTypeAccess().getEVENTEnumLiteralDeclaration_1()); 
                    // InternalProblem.g:365:1: ( 'event' )
                    // InternalProblem.g:365:3: 'event'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getPhenomenonTypeAccess().getEVENTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalProblem.g:370:6: ( ( 'state' ) )
                    {
                    // InternalProblem.g:370:6: ( ( 'state' ) )
                    // InternalProblem.g:371:1: ( 'state' )
                    {
                     before(grammarAccess.getPhenomenonTypeAccess().getSTATEEnumLiteralDeclaration_2()); 
                    // InternalProblem.g:372:1: ( 'state' )
                    // InternalProblem.g:372:3: 'state'
                    {
                    match(input,22,FOLLOW_2); 

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
    // $ANTLR end "rule__PhenomenonType__Alternatives"


    // $ANTLR start "rule__LinkType__Alternatives"
    // InternalProblem.g:382:1: rule__LinkType__Alternatives : ( ( ( '--' ) ) | ( ( '~~' ) ) | ( ( '<~' ) ) | ( ( '->' ) ) | ( ( '~>' ) ) );
    public final void rule__LinkType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:386:1: ( ( ( '--' ) ) | ( ( '~~' ) ) | ( ( '<~' ) ) | ( ( '->' ) ) | ( ( '~>' ) ) )
            int alt5=5;
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
            case 27:
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalProblem.g:387:1: ( ( '--' ) )
                    {
                    // InternalProblem.g:387:1: ( ( '--' ) )
                    // InternalProblem.g:388:1: ( '--' )
                    {
                     before(grammarAccess.getLinkTypeAccess().getINTERFACEEnumLiteralDeclaration_0()); 
                    // InternalProblem.g:389:1: ( '--' )
                    // InternalProblem.g:389:3: '--'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getLinkTypeAccess().getINTERFACEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:394:6: ( ( '~~' ) )
                    {
                    // InternalProblem.g:394:6: ( ( '~~' ) )
                    // InternalProblem.g:395:1: ( '~~' )
                    {
                     before(grammarAccess.getLinkTypeAccess().getREFERENCEEnumLiteralDeclaration_1()); 
                    // InternalProblem.g:396:1: ( '~~' )
                    // InternalProblem.g:396:3: '~~'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getLinkTypeAccess().getREFERENCEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalProblem.g:401:6: ( ( '<~' ) )
                    {
                    // InternalProblem.g:401:6: ( ( '<~' ) )
                    // InternalProblem.g:402:1: ( '<~' )
                    {
                     before(grammarAccess.getLinkTypeAccess().getCONSTRAINTEnumLiteralDeclaration_2()); 
                    // InternalProblem.g:403:1: ( '<~' )
                    // InternalProblem.g:403:3: '<~'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getLinkTypeAccess().getCONSTRAINTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalProblem.g:408:6: ( ( '->' ) )
                    {
                    // InternalProblem.g:408:6: ( ( '->' ) )
                    // InternalProblem.g:409:1: ( '->' )
                    {
                     before(grammarAccess.getLinkTypeAccess().getCONCERNEnumLiteralDeclaration_3()); 
                    // InternalProblem.g:410:1: ( '->' )
                    // InternalProblem.g:410:3: '->'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getLinkTypeAccess().getCONCERNEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalProblem.g:415:6: ( ( '~>' ) )
                    {
                    // InternalProblem.g:415:6: ( ( '~>' ) )
                    // InternalProblem.g:416:1: ( '~>' )
                    {
                     before(grammarAccess.getLinkTypeAccess().getINV_CONSTRAINTEnumLiteralDeclaration_4()); 
                    // InternalProblem.g:417:1: ( '~>' )
                    // InternalProblem.g:417:3: '~>'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getLinkTypeAccess().getINV_CONSTRAINTEnumLiteralDeclaration_4()); 

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
    // $ANTLR end "rule__LinkType__Alternatives"


    // $ANTLR start "rule__ProblemDiagram__Group__0"
    // InternalProblem.g:429:1: rule__ProblemDiagram__Group__0 : rule__ProblemDiagram__Group__0__Impl rule__ProblemDiagram__Group__1 ;
    public final void rule__ProblemDiagram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:433:1: ( rule__ProblemDiagram__Group__0__Impl rule__ProblemDiagram__Group__1 )
            // InternalProblem.g:434:2: rule__ProblemDiagram__Group__0__Impl rule__ProblemDiagram__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ProblemDiagram__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProblemDiagram__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProblemDiagram__Group__0"


    // $ANTLR start "rule__ProblemDiagram__Group__0__Impl"
    // InternalProblem.g:441:1: rule__ProblemDiagram__Group__0__Impl : ( 'problem:' ) ;
    public final void rule__ProblemDiagram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:445:1: ( ( 'problem:' ) )
            // InternalProblem.g:446:1: ( 'problem:' )
            {
            // InternalProblem.g:446:1: ( 'problem:' )
            // InternalProblem.g:447:1: 'problem:'
            {
             before(grammarAccess.getProblemDiagramAccess().getProblemKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // $ANTLR end "rule__ProblemDiagram__Group__0__Impl"


    // $ANTLR start "rule__ProblemDiagram__Group__1"
    // InternalProblem.g:460:1: rule__ProblemDiagram__Group__1 : rule__ProblemDiagram__Group__1__Impl rule__ProblemDiagram__Group__2 ;
    public final void rule__ProblemDiagram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:464:1: ( rule__ProblemDiagram__Group__1__Impl rule__ProblemDiagram__Group__2 )
            // InternalProblem.g:465:2: rule__ProblemDiagram__Group__1__Impl rule__ProblemDiagram__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ProblemDiagram__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProblemDiagram__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProblemDiagram__Group__1"


    // $ANTLR start "rule__ProblemDiagram__Group__1__Impl"
    // InternalProblem.g:472:1: rule__ProblemDiagram__Group__1__Impl : ( ( rule__ProblemDiagram__NameAssignment_1 ) ) ;
    public final void rule__ProblemDiagram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:476:1: ( ( ( rule__ProblemDiagram__NameAssignment_1 ) ) )
            // InternalProblem.g:477:1: ( ( rule__ProblemDiagram__NameAssignment_1 ) )
            {
            // InternalProblem.g:477:1: ( ( rule__ProblemDiagram__NameAssignment_1 ) )
            // InternalProblem.g:478:1: ( rule__ProblemDiagram__NameAssignment_1 )
            {
             before(grammarAccess.getProblemDiagramAccess().getNameAssignment_1()); 
            // InternalProblem.g:479:1: ( rule__ProblemDiagram__NameAssignment_1 )
            // InternalProblem.g:479:2: rule__ProblemDiagram__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ProblemDiagram__NameAssignment_1();

            state._fsp--;


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
    // $ANTLR end "rule__ProblemDiagram__Group__1__Impl"


    // $ANTLR start "rule__ProblemDiagram__Group__2"
    // InternalProblem.g:489:1: rule__ProblemDiagram__Group__2 : rule__ProblemDiagram__Group__2__Impl rule__ProblemDiagram__Group__3 ;
    public final void rule__ProblemDiagram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:493:1: ( rule__ProblemDiagram__Group__2__Impl rule__ProblemDiagram__Group__3 )
            // InternalProblem.g:494:2: rule__ProblemDiagram__Group__2__Impl rule__ProblemDiagram__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__ProblemDiagram__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProblemDiagram__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProblemDiagram__Group__2"


    // $ANTLR start "rule__ProblemDiagram__Group__2__Impl"
    // InternalProblem.g:501:1: rule__ProblemDiagram__Group__2__Impl : ( ( rule__ProblemDiagram__Group_2__0 )? ) ;
    public final void rule__ProblemDiagram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:505:1: ( ( ( rule__ProblemDiagram__Group_2__0 )? ) )
            // InternalProblem.g:506:1: ( ( rule__ProblemDiagram__Group_2__0 )? )
            {
            // InternalProblem.g:506:1: ( ( rule__ProblemDiagram__Group_2__0 )? )
            // InternalProblem.g:507:1: ( rule__ProblemDiagram__Group_2__0 )?
            {
             before(grammarAccess.getProblemDiagramAccess().getGroup_2()); 
            // InternalProblem.g:508:1: ( rule__ProblemDiagram__Group_2__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==29) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalProblem.g:508:2: rule__ProblemDiagram__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProblemDiagram__Group_2__0();

                    state._fsp--;


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
    // $ANTLR end "rule__ProblemDiagram__Group__2__Impl"


    // $ANTLR start "rule__ProblemDiagram__Group__3"
    // InternalProblem.g:518:1: rule__ProblemDiagram__Group__3 : rule__ProblemDiagram__Group__3__Impl ;
    public final void rule__ProblemDiagram__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:522:1: ( rule__ProblemDiagram__Group__3__Impl )
            // InternalProblem.g:523:2: rule__ProblemDiagram__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProblemDiagram__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProblemDiagram__Group__3"


    // $ANTLR start "rule__ProblemDiagram__Group__3__Impl"
    // InternalProblem.g:529:1: rule__ProblemDiagram__Group__3__Impl : ( ( rule__ProblemDiagram__Alternatives_3 )* ) ;
    public final void rule__ProblemDiagram__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:533:1: ( ( ( rule__ProblemDiagram__Alternatives_3 )* ) )
            // InternalProblem.g:534:1: ( ( rule__ProblemDiagram__Alternatives_3 )* )
            {
            // InternalProblem.g:534:1: ( ( rule__ProblemDiagram__Alternatives_3 )* )
            // InternalProblem.g:535:1: ( rule__ProblemDiagram__Alternatives_3 )*
            {
             before(grammarAccess.getProblemDiagramAccess().getAlternatives_3()); 
            // InternalProblem.g:536:1: ( rule__ProblemDiagram__Alternatives_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalProblem.g:536:2: rule__ProblemDiagram__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__ProblemDiagram__Alternatives_3();

            	    state._fsp--;


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
    // $ANTLR end "rule__ProblemDiagram__Group__3__Impl"


    // $ANTLR start "rule__ProblemDiagram__Group_2__0"
    // InternalProblem.g:554:1: rule__ProblemDiagram__Group_2__0 : rule__ProblemDiagram__Group_2__0__Impl rule__ProblemDiagram__Group_2__1 ;
    public final void rule__ProblemDiagram__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:558:1: ( rule__ProblemDiagram__Group_2__0__Impl rule__ProblemDiagram__Group_2__1 )
            // InternalProblem.g:559:2: rule__ProblemDiagram__Group_2__0__Impl rule__ProblemDiagram__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__ProblemDiagram__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProblemDiagram__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProblemDiagram__Group_2__0"


    // $ANTLR start "rule__ProblemDiagram__Group_2__0__Impl"
    // InternalProblem.g:566:1: rule__ProblemDiagram__Group_2__0__Impl : ( 'for' ) ;
    public final void rule__ProblemDiagram__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:570:1: ( ( 'for' ) )
            // InternalProblem.g:571:1: ( 'for' )
            {
            // InternalProblem.g:571:1: ( 'for' )
            // InternalProblem.g:572:1: 'for'
            {
             before(grammarAccess.getProblemDiagramAccess().getForKeyword_2_0()); 
            match(input,29,FOLLOW_2); 
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
    // $ANTLR end "rule__ProblemDiagram__Group_2__0__Impl"


    // $ANTLR start "rule__ProblemDiagram__Group_2__1"
    // InternalProblem.g:585:1: rule__ProblemDiagram__Group_2__1 : rule__ProblemDiagram__Group_2__1__Impl ;
    public final void rule__ProblemDiagram__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:589:1: ( rule__ProblemDiagram__Group_2__1__Impl )
            // InternalProblem.g:590:2: rule__ProblemDiagram__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProblemDiagram__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProblemDiagram__Group_2__1"


    // $ANTLR start "rule__ProblemDiagram__Group_2__1__Impl"
    // InternalProblem.g:596:1: rule__ProblemDiagram__Group_2__1__Impl : ( ( rule__ProblemDiagram__HighlightAssignment_2_1 ) ) ;
    public final void rule__ProblemDiagram__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:600:1: ( ( ( rule__ProblemDiagram__HighlightAssignment_2_1 ) ) )
            // InternalProblem.g:601:1: ( ( rule__ProblemDiagram__HighlightAssignment_2_1 ) )
            {
            // InternalProblem.g:601:1: ( ( rule__ProblemDiagram__HighlightAssignment_2_1 ) )
            // InternalProblem.g:602:1: ( rule__ProblemDiagram__HighlightAssignment_2_1 )
            {
             before(grammarAccess.getProblemDiagramAccess().getHighlightAssignment_2_1()); 
            // InternalProblem.g:603:1: ( rule__ProblemDiagram__HighlightAssignment_2_1 )
            // InternalProblem.g:603:2: rule__ProblemDiagram__HighlightAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ProblemDiagram__HighlightAssignment_2_1();

            state._fsp--;


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
    // $ANTLR end "rule__ProblemDiagram__Group_2__1__Impl"


    // $ANTLR start "rule__Node__Group__0"
    // InternalProblem.g:617:1: rule__Node__Group__0 : rule__Node__Group__0__Impl rule__Node__Group__1 ;
    public final void rule__Node__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:621:1: ( rule__Node__Group__0__Impl rule__Node__Group__1 )
            // InternalProblem.g:622:2: rule__Node__Group__0__Impl rule__Node__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Node__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__0"


    // $ANTLR start "rule__Node__Group__0__Impl"
    // InternalProblem.g:629:1: rule__Node__Group__0__Impl : ( ( rule__Node__NameAssignment_0 ) ) ;
    public final void rule__Node__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:633:1: ( ( ( rule__Node__NameAssignment_0 ) ) )
            // InternalProblem.g:634:1: ( ( rule__Node__NameAssignment_0 ) )
            {
            // InternalProblem.g:634:1: ( ( rule__Node__NameAssignment_0 ) )
            // InternalProblem.g:635:1: ( rule__Node__NameAssignment_0 )
            {
             before(grammarAccess.getNodeAccess().getNameAssignment_0()); 
            // InternalProblem.g:636:1: ( rule__Node__NameAssignment_0 )
            // InternalProblem.g:636:2: rule__Node__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Node__NameAssignment_0();

            state._fsp--;


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
    // $ANTLR end "rule__Node__Group__0__Impl"


    // $ANTLR start "rule__Node__Group__1"
    // InternalProblem.g:646:1: rule__Node__Group__1 : rule__Node__Group__1__Impl rule__Node__Group__2 ;
    public final void rule__Node__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:650:1: ( rule__Node__Group__1__Impl rule__Node__Group__2 )
            // InternalProblem.g:651:2: rule__Node__Group__1__Impl rule__Node__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Node__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__1"


    // $ANTLR start "rule__Node__Group__1__Impl"
    // InternalProblem.g:658:1: rule__Node__Group__1__Impl : ( ( rule__Node__TypeAssignment_1 )? ) ;
    public final void rule__Node__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:662:1: ( ( ( rule__Node__TypeAssignment_1 )? ) )
            // InternalProblem.g:663:1: ( ( rule__Node__TypeAssignment_1 )? )
            {
            // InternalProblem.g:663:1: ( ( rule__Node__TypeAssignment_1 )? )
            // InternalProblem.g:664:1: ( rule__Node__TypeAssignment_1 )?
            {
             before(grammarAccess.getNodeAccess().getTypeAssignment_1()); 
            // InternalProblem.g:665:1: ( rule__Node__TypeAssignment_1 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=12 && LA8_0<=19)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalProblem.g:665:2: rule__Node__TypeAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Node__TypeAssignment_1();

                    state._fsp--;


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
    // $ANTLR end "rule__Node__Group__1__Impl"


    // $ANTLR start "rule__Node__Group__2"
    // InternalProblem.g:675:1: rule__Node__Group__2 : rule__Node__Group__2__Impl rule__Node__Group__3 ;
    public final void rule__Node__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:679:1: ( rule__Node__Group__2__Impl rule__Node__Group__3 )
            // InternalProblem.g:680:2: rule__Node__Group__2__Impl rule__Node__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Node__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__2"


    // $ANTLR start "rule__Node__Group__2__Impl"
    // InternalProblem.g:687:1: rule__Node__Group__2__Impl : ( ( rule__Node__Group_2__0 )? ) ;
    public final void rule__Node__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:691:1: ( ( ( rule__Node__Group_2__0 )? ) )
            // InternalProblem.g:692:1: ( ( rule__Node__Group_2__0 )? )
            {
            // InternalProblem.g:692:1: ( ( rule__Node__Group_2__0 )? )
            // InternalProblem.g:693:1: ( rule__Node__Group_2__0 )?
            {
             before(grammarAccess.getNodeAccess().getGroup_2()); 
            // InternalProblem.g:694:1: ( rule__Node__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING||LA9_0==30) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalProblem.g:694:2: rule__Node__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Node__Group_2__0();

                    state._fsp--;


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
    // $ANTLR end "rule__Node__Group__2__Impl"


    // $ANTLR start "rule__Node__Group__3"
    // InternalProblem.g:704:1: rule__Node__Group__3 : rule__Node__Group__3__Impl ;
    public final void rule__Node__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:708:1: ( rule__Node__Group__3__Impl )
            // InternalProblem.g:709:2: rule__Node__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Node__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__3"


    // $ANTLR start "rule__Node__Group__3__Impl"
    // InternalProblem.g:715:1: rule__Node__Group__3__Impl : ( ( rule__Node__Group_3__0 )? ) ;
    public final void rule__Node__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:719:1: ( ( ( rule__Node__Group_3__0 )? ) )
            // InternalProblem.g:720:1: ( ( rule__Node__Group_3__0 )? )
            {
            // InternalProblem.g:720:1: ( ( rule__Node__Group_3__0 )? )
            // InternalProblem.g:721:1: ( rule__Node__Group_3__0 )?
            {
             before(grammarAccess.getNodeAccess().getGroup_3()); 
            // InternalProblem.g:722:1: ( rule__Node__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==31) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalProblem.g:722:2: rule__Node__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Node__Group_3__0();

                    state._fsp--;


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
    // $ANTLR end "rule__Node__Group__3__Impl"


    // $ANTLR start "rule__Node__Group_2__0"
    // InternalProblem.g:740:1: rule__Node__Group_2__0 : rule__Node__Group_2__0__Impl rule__Node__Group_2__1 ;
    public final void rule__Node__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:744:1: ( rule__Node__Group_2__0__Impl rule__Node__Group_2__1 )
            // InternalProblem.g:745:2: rule__Node__Group_2__0__Impl rule__Node__Group_2__1
            {
            pushFollow(FOLLOW_7);
            rule__Node__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_2__0"


    // $ANTLR start "rule__Node__Group_2__0__Impl"
    // InternalProblem.g:752:1: rule__Node__Group_2__0__Impl : ( ( ':' )? ) ;
    public final void rule__Node__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:756:1: ( ( ( ':' )? ) )
            // InternalProblem.g:757:1: ( ( ':' )? )
            {
            // InternalProblem.g:757:1: ( ( ':' )? )
            // InternalProblem.g:758:1: ( ':' )?
            {
             before(grammarAccess.getNodeAccess().getColonKeyword_2_0()); 
            // InternalProblem.g:759:1: ( ':' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==30) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalProblem.g:760:2: ':'
                    {
                    match(input,30,FOLLOW_2); 

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
    // $ANTLR end "rule__Node__Group_2__0__Impl"


    // $ANTLR start "rule__Node__Group_2__1"
    // InternalProblem.g:771:1: rule__Node__Group_2__1 : rule__Node__Group_2__1__Impl ;
    public final void rule__Node__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:775:1: ( rule__Node__Group_2__1__Impl )
            // InternalProblem.g:776:2: rule__Node__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Node__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_2__1"


    // $ANTLR start "rule__Node__Group_2__1__Impl"
    // InternalProblem.g:782:1: rule__Node__Group_2__1__Impl : ( ( rule__Node__DescriptionAssignment_2_1 ) ) ;
    public final void rule__Node__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:786:1: ( ( ( rule__Node__DescriptionAssignment_2_1 ) ) )
            // InternalProblem.g:787:1: ( ( rule__Node__DescriptionAssignment_2_1 ) )
            {
            // InternalProblem.g:787:1: ( ( rule__Node__DescriptionAssignment_2_1 ) )
            // InternalProblem.g:788:1: ( rule__Node__DescriptionAssignment_2_1 )
            {
             before(grammarAccess.getNodeAccess().getDescriptionAssignment_2_1()); 
            // InternalProblem.g:789:1: ( rule__Node__DescriptionAssignment_2_1 )
            // InternalProblem.g:789:2: rule__Node__DescriptionAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Node__DescriptionAssignment_2_1();

            state._fsp--;


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
    // $ANTLR end "rule__Node__Group_2__1__Impl"


    // $ANTLR start "rule__Node__Group_3__0"
    // InternalProblem.g:803:1: rule__Node__Group_3__0 : rule__Node__Group_3__0__Impl rule__Node__Group_3__1 ;
    public final void rule__Node__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:807:1: ( rule__Node__Group_3__0__Impl rule__Node__Group_3__1 )
            // InternalProblem.g:808:2: rule__Node__Group_3__0__Impl rule__Node__Group_3__1
            {
            pushFollow(FOLLOW_8);
            rule__Node__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_3__0"


    // $ANTLR start "rule__Node__Group_3__0__Impl"
    // InternalProblem.g:815:1: rule__Node__Group_3__0__Impl : ( '{' ) ;
    public final void rule__Node__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:819:1: ( ( '{' ) )
            // InternalProblem.g:820:1: ( '{' )
            {
            // InternalProblem.g:820:1: ( '{' )
            // InternalProblem.g:821:1: '{'
            {
             before(grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,31,FOLLOW_2); 
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
    // $ANTLR end "rule__Node__Group_3__0__Impl"


    // $ANTLR start "rule__Node__Group_3__1"
    // InternalProblem.g:834:1: rule__Node__Group_3__1 : rule__Node__Group_3__1__Impl rule__Node__Group_3__2 ;
    public final void rule__Node__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:838:1: ( rule__Node__Group_3__1__Impl rule__Node__Group_3__2 )
            // InternalProblem.g:839:2: rule__Node__Group_3__1__Impl rule__Node__Group_3__2
            {
            pushFollow(FOLLOW_8);
            rule__Node__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_3__1"


    // $ANTLR start "rule__Node__Group_3__1__Impl"
    // InternalProblem.g:846:1: rule__Node__Group_3__1__Impl : ( ( rule__Node__Group_3_1__0 )? ) ;
    public final void rule__Node__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:850:1: ( ( ( rule__Node__Group_3_1__0 )? ) )
            // InternalProblem.g:851:1: ( ( rule__Node__Group_3_1__0 )? )
            {
            // InternalProblem.g:851:1: ( ( rule__Node__Group_3_1__0 )? )
            // InternalProblem.g:852:1: ( rule__Node__Group_3_1__0 )?
            {
             before(grammarAccess.getNodeAccess().getGroup_3_1()); 
            // InternalProblem.g:853:1: ( rule__Node__Group_3_1__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID||(LA12_0>=20 && LA12_0<=22)||LA12_0==37) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalProblem.g:853:2: rule__Node__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Node__Group_3_1__0();

                    state._fsp--;


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
    // $ANTLR end "rule__Node__Group_3__1__Impl"


    // $ANTLR start "rule__Node__Group_3__2"
    // InternalProblem.g:863:1: rule__Node__Group_3__2 : rule__Node__Group_3__2__Impl rule__Node__Group_3__3 ;
    public final void rule__Node__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:867:1: ( rule__Node__Group_3__2__Impl rule__Node__Group_3__3 )
            // InternalProblem.g:868:2: rule__Node__Group_3__2__Impl rule__Node__Group_3__3
            {
            pushFollow(FOLLOW_8);
            rule__Node__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_3__2"


    // $ANTLR start "rule__Node__Group_3__2__Impl"
    // InternalProblem.g:875:1: rule__Node__Group_3__2__Impl : ( ( rule__Node__Alternatives_3_2 )* ) ;
    public final void rule__Node__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:879:1: ( ( ( rule__Node__Alternatives_3_2 )* ) )
            // InternalProblem.g:880:1: ( ( rule__Node__Alternatives_3_2 )* )
            {
            // InternalProblem.g:880:1: ( ( rule__Node__Alternatives_3_2 )* )
            // InternalProblem.g:881:1: ( rule__Node__Alternatives_3_2 )*
            {
             before(grammarAccess.getNodeAccess().getAlternatives_3_2()); 
            // InternalProblem.g:882:1: ( rule__Node__Alternatives_3_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==28||LA13_0==34) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalProblem.g:882:2: rule__Node__Alternatives_3_2
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Node__Alternatives_3_2();

            	    state._fsp--;


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
    // $ANTLR end "rule__Node__Group_3__2__Impl"


    // $ANTLR start "rule__Node__Group_3__3"
    // InternalProblem.g:892:1: rule__Node__Group_3__3 : rule__Node__Group_3__3__Impl ;
    public final void rule__Node__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:896:1: ( rule__Node__Group_3__3__Impl )
            // InternalProblem.g:897:2: rule__Node__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Node__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_3__3"


    // $ANTLR start "rule__Node__Group_3__3__Impl"
    // InternalProblem.g:903:1: rule__Node__Group_3__3__Impl : ( '}' ) ;
    public final void rule__Node__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:907:1: ( ( '}' ) )
            // InternalProblem.g:908:1: ( '}' )
            {
            // InternalProblem.g:908:1: ( '}' )
            // InternalProblem.g:909:1: '}'
            {
             before(grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_3_3()); 
            match(input,32,FOLLOW_2); 
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
    // $ANTLR end "rule__Node__Group_3__3__Impl"


    // $ANTLR start "rule__Node__Group_3_1__0"
    // InternalProblem.g:930:1: rule__Node__Group_3_1__0 : rule__Node__Group_3_1__0__Impl rule__Node__Group_3_1__1 ;
    public final void rule__Node__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:934:1: ( rule__Node__Group_3_1__0__Impl rule__Node__Group_3_1__1 )
            // InternalProblem.g:935:2: rule__Node__Group_3_1__0__Impl rule__Node__Group_3_1__1
            {
            pushFollow(FOLLOW_10);
            rule__Node__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_3_1__0"


    // $ANTLR start "rule__Node__Group_3_1__0__Impl"
    // InternalProblem.g:942:1: rule__Node__Group_3_1__0__Impl : ( ( rule__Node__HiddenPhenomenaAssignment_3_1_0 ) ) ;
    public final void rule__Node__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:946:1: ( ( ( rule__Node__HiddenPhenomenaAssignment_3_1_0 ) ) )
            // InternalProblem.g:947:1: ( ( rule__Node__HiddenPhenomenaAssignment_3_1_0 ) )
            {
            // InternalProblem.g:947:1: ( ( rule__Node__HiddenPhenomenaAssignment_3_1_0 ) )
            // InternalProblem.g:948:1: ( rule__Node__HiddenPhenomenaAssignment_3_1_0 )
            {
             before(grammarAccess.getNodeAccess().getHiddenPhenomenaAssignment_3_1_0()); 
            // InternalProblem.g:949:1: ( rule__Node__HiddenPhenomenaAssignment_3_1_0 )
            // InternalProblem.g:949:2: rule__Node__HiddenPhenomenaAssignment_3_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Node__HiddenPhenomenaAssignment_3_1_0();

            state._fsp--;


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
    // $ANTLR end "rule__Node__Group_3_1__0__Impl"


    // $ANTLR start "rule__Node__Group_3_1__1"
    // InternalProblem.g:959:1: rule__Node__Group_3_1__1 : rule__Node__Group_3_1__1__Impl ;
    public final void rule__Node__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:963:1: ( rule__Node__Group_3_1__1__Impl )
            // InternalProblem.g:964:2: rule__Node__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Node__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_3_1__1"


    // $ANTLR start "rule__Node__Group_3_1__1__Impl"
    // InternalProblem.g:970:1: rule__Node__Group_3_1__1__Impl : ( ( rule__Node__Group_3_1_1__0 )* ) ;
    public final void rule__Node__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:974:1: ( ( ( rule__Node__Group_3_1_1__0 )* ) )
            // InternalProblem.g:975:1: ( ( rule__Node__Group_3_1_1__0 )* )
            {
            // InternalProblem.g:975:1: ( ( rule__Node__Group_3_1_1__0 )* )
            // InternalProblem.g:976:1: ( rule__Node__Group_3_1_1__0 )*
            {
             before(grammarAccess.getNodeAccess().getGroup_3_1_1()); 
            // InternalProblem.g:977:1: ( rule__Node__Group_3_1_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==33) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalProblem.g:977:2: rule__Node__Group_3_1_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Node__Group_3_1_1__0();

            	    state._fsp--;


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
    // $ANTLR end "rule__Node__Group_3_1__1__Impl"


    // $ANTLR start "rule__Node__Group_3_1_1__0"
    // InternalProblem.g:991:1: rule__Node__Group_3_1_1__0 : rule__Node__Group_3_1_1__0__Impl rule__Node__Group_3_1_1__1 ;
    public final void rule__Node__Group_3_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:995:1: ( rule__Node__Group_3_1_1__0__Impl rule__Node__Group_3_1_1__1 )
            // InternalProblem.g:996:2: rule__Node__Group_3_1_1__0__Impl rule__Node__Group_3_1_1__1
            {
            pushFollow(FOLLOW_12);
            rule__Node__Group_3_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group_3_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_3_1_1__0"


    // $ANTLR start "rule__Node__Group_3_1_1__0__Impl"
    // InternalProblem.g:1003:1: rule__Node__Group_3_1_1__0__Impl : ( ',' ) ;
    public final void rule__Node__Group_3_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1007:1: ( ( ',' ) )
            // InternalProblem.g:1008:1: ( ',' )
            {
            // InternalProblem.g:1008:1: ( ',' )
            // InternalProblem.g:1009:1: ','
            {
             before(grammarAccess.getNodeAccess().getCommaKeyword_3_1_1_0()); 
            match(input,33,FOLLOW_2); 
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
    // $ANTLR end "rule__Node__Group_3_1_1__0__Impl"


    // $ANTLR start "rule__Node__Group_3_1_1__1"
    // InternalProblem.g:1022:1: rule__Node__Group_3_1_1__1 : rule__Node__Group_3_1_1__1__Impl ;
    public final void rule__Node__Group_3_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1026:1: ( rule__Node__Group_3_1_1__1__Impl )
            // InternalProblem.g:1027:2: rule__Node__Group_3_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Node__Group_3_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_3_1_1__1"


    // $ANTLR start "rule__Node__Group_3_1_1__1__Impl"
    // InternalProblem.g:1033:1: rule__Node__Group_3_1_1__1__Impl : ( ( rule__Node__HiddenPhenomenaAssignment_3_1_1_1 ) ) ;
    public final void rule__Node__Group_3_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1037:1: ( ( ( rule__Node__HiddenPhenomenaAssignment_3_1_1_1 ) ) )
            // InternalProblem.g:1038:1: ( ( rule__Node__HiddenPhenomenaAssignment_3_1_1_1 ) )
            {
            // InternalProblem.g:1038:1: ( ( rule__Node__HiddenPhenomenaAssignment_3_1_1_1 ) )
            // InternalProblem.g:1039:1: ( rule__Node__HiddenPhenomenaAssignment_3_1_1_1 )
            {
             before(grammarAccess.getNodeAccess().getHiddenPhenomenaAssignment_3_1_1_1()); 
            // InternalProblem.g:1040:1: ( rule__Node__HiddenPhenomenaAssignment_3_1_1_1 )
            // InternalProblem.g:1040:2: rule__Node__HiddenPhenomenaAssignment_3_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Node__HiddenPhenomenaAssignment_3_1_1_1();

            state._fsp--;


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
    // $ANTLR end "rule__Node__Group_3_1_1__1__Impl"


    // $ANTLR start "rule__Node__Group_3_2_1__0"
    // InternalProblem.g:1054:1: rule__Node__Group_3_2_1__0 : rule__Node__Group_3_2_1__0__Impl rule__Node__Group_3_2_1__1 ;
    public final void rule__Node__Group_3_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1058:1: ( rule__Node__Group_3_2_1__0__Impl rule__Node__Group_3_2_1__1 )
            // InternalProblem.g:1059:2: rule__Node__Group_3_2_1__0__Impl rule__Node__Group_3_2_1__1
            {
            pushFollow(FOLLOW_13);
            rule__Node__Group_3_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group_3_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_3_2_1__0"


    // $ANTLR start "rule__Node__Group_3_2_1__0__Impl"
    // InternalProblem.g:1066:1: rule__Node__Group_3_2_1__0__Impl : ( 'see' ) ;
    public final void rule__Node__Group_3_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1070:1: ( ( 'see' ) )
            // InternalProblem.g:1071:1: ( 'see' )
            {
            // InternalProblem.g:1071:1: ( 'see' )
            // InternalProblem.g:1072:1: 'see'
            {
             before(grammarAccess.getNodeAccess().getSeeKeyword_3_2_1_0()); 
            match(input,34,FOLLOW_2); 
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
    // $ANTLR end "rule__Node__Group_3_2_1__0__Impl"


    // $ANTLR start "rule__Node__Group_3_2_1__1"
    // InternalProblem.g:1085:1: rule__Node__Group_3_2_1__1 : rule__Node__Group_3_2_1__1__Impl rule__Node__Group_3_2_1__2 ;
    public final void rule__Node__Group_3_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1089:1: ( rule__Node__Group_3_2_1__1__Impl rule__Node__Group_3_2_1__2 )
            // InternalProblem.g:1090:2: rule__Node__Group_3_2_1__1__Impl rule__Node__Group_3_2_1__2
            {
            pushFollow(FOLLOW_3);
            rule__Node__Group_3_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group_3_2_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_3_2_1__1"


    // $ANTLR start "rule__Node__Group_3_2_1__1__Impl"
    // InternalProblem.g:1097:1: rule__Node__Group_3_2_1__1__Impl : ( 'domain' ) ;
    public final void rule__Node__Group_3_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1101:1: ( ( 'domain' ) )
            // InternalProblem.g:1102:1: ( 'domain' )
            {
            // InternalProblem.g:1102:1: ( 'domain' )
            // InternalProblem.g:1103:1: 'domain'
            {
             before(grammarAccess.getNodeAccess().getDomainKeyword_3_2_1_1()); 
            match(input,35,FOLLOW_2); 
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
    // $ANTLR end "rule__Node__Group_3_2_1__1__Impl"


    // $ANTLR start "rule__Node__Group_3_2_1__2"
    // InternalProblem.g:1116:1: rule__Node__Group_3_2_1__2 : rule__Node__Group_3_2_1__2__Impl ;
    public final void rule__Node__Group_3_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1120:1: ( rule__Node__Group_3_2_1__2__Impl )
            // InternalProblem.g:1121:2: rule__Node__Group_3_2_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Node__Group_3_2_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_3_2_1__2"


    // $ANTLR start "rule__Node__Group_3_2_1__2__Impl"
    // InternalProblem.g:1127:1: rule__Node__Group_3_2_1__2__Impl : ( ( rule__Node__ProblemNodeRefAssignment_3_2_1_2 ) ) ;
    public final void rule__Node__Group_3_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1131:1: ( ( ( rule__Node__ProblemNodeRefAssignment_3_2_1_2 ) ) )
            // InternalProblem.g:1132:1: ( ( rule__Node__ProblemNodeRefAssignment_3_2_1_2 ) )
            {
            // InternalProblem.g:1132:1: ( ( rule__Node__ProblemNodeRefAssignment_3_2_1_2 ) )
            // InternalProblem.g:1133:1: ( rule__Node__ProblemNodeRefAssignment_3_2_1_2 )
            {
             before(grammarAccess.getNodeAccess().getProblemNodeRefAssignment_3_2_1_2()); 
            // InternalProblem.g:1134:1: ( rule__Node__ProblemNodeRefAssignment_3_2_1_2 )
            // InternalProblem.g:1134:2: rule__Node__ProblemNodeRefAssignment_3_2_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Node__ProblemNodeRefAssignment_3_2_1_2();

            state._fsp--;


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
    // $ANTLR end "rule__Node__Group_3_2_1__2__Impl"


    // $ANTLR start "rule__Node__Group_3_2_2__0"
    // InternalProblem.g:1150:1: rule__Node__Group_3_2_2__0 : rule__Node__Group_3_2_2__0__Impl rule__Node__Group_3_2_2__1 ;
    public final void rule__Node__Group_3_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1154:1: ( rule__Node__Group_3_2_2__0__Impl rule__Node__Group_3_2_2__1 )
            // InternalProblem.g:1155:2: rule__Node__Group_3_2_2__0__Impl rule__Node__Group_3_2_2__1
            {
            pushFollow(FOLLOW_14);
            rule__Node__Group_3_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group_3_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_3_2_2__0"


    // $ANTLR start "rule__Node__Group_3_2_2__0__Impl"
    // InternalProblem.g:1162:1: rule__Node__Group_3_2_2__0__Impl : ( 'see' ) ;
    public final void rule__Node__Group_3_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1166:1: ( ( 'see' ) )
            // InternalProblem.g:1167:1: ( 'see' )
            {
            // InternalProblem.g:1167:1: ( 'see' )
            // InternalProblem.g:1168:1: 'see'
            {
             before(grammarAccess.getNodeAccess().getSeeKeyword_3_2_2_0()); 
            match(input,34,FOLLOW_2); 
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
    // $ANTLR end "rule__Node__Group_3_2_2__0__Impl"


    // $ANTLR start "rule__Node__Group_3_2_2__1"
    // InternalProblem.g:1181:1: rule__Node__Group_3_2_2__1 : rule__Node__Group_3_2_2__1__Impl rule__Node__Group_3_2_2__2 ;
    public final void rule__Node__Group_3_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1185:1: ( rule__Node__Group_3_2_2__1__Impl rule__Node__Group_3_2_2__2 )
            // InternalProblem.g:1186:2: rule__Node__Group_3_2_2__1__Impl rule__Node__Group_3_2_2__2
            {
            pushFollow(FOLLOW_3);
            rule__Node__Group_3_2_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group_3_2_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_3_2_2__1"


    // $ANTLR start "rule__Node__Group_3_2_2__1__Impl"
    // InternalProblem.g:1193:1: rule__Node__Group_3_2_2__1__Impl : ( 'problem' ) ;
    public final void rule__Node__Group_3_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1197:1: ( ( 'problem' ) )
            // InternalProblem.g:1198:1: ( 'problem' )
            {
            // InternalProblem.g:1198:1: ( 'problem' )
            // InternalProblem.g:1199:1: 'problem'
            {
             before(grammarAccess.getNodeAccess().getProblemKeyword_3_2_2_1()); 
            match(input,36,FOLLOW_2); 
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
    // $ANTLR end "rule__Node__Group_3_2_2__1__Impl"


    // $ANTLR start "rule__Node__Group_3_2_2__2"
    // InternalProblem.g:1212:1: rule__Node__Group_3_2_2__2 : rule__Node__Group_3_2_2__2__Impl ;
    public final void rule__Node__Group_3_2_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1216:1: ( rule__Node__Group_3_2_2__2__Impl )
            // InternalProblem.g:1217:2: rule__Node__Group_3_2_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Node__Group_3_2_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_3_2_2__2"


    // $ANTLR start "rule__Node__Group_3_2_2__2__Impl"
    // InternalProblem.g:1223:1: rule__Node__Group_3_2_2__2__Impl : ( ( rule__Node__ProblemRefAssignment_3_2_2_2 ) ) ;
    public final void rule__Node__Group_3_2_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1227:1: ( ( ( rule__Node__ProblemRefAssignment_3_2_2_2 ) ) )
            // InternalProblem.g:1228:1: ( ( rule__Node__ProblemRefAssignment_3_2_2_2 ) )
            {
            // InternalProblem.g:1228:1: ( ( rule__Node__ProblemRefAssignment_3_2_2_2 ) )
            // InternalProblem.g:1229:1: ( rule__Node__ProblemRefAssignment_3_2_2_2 )
            {
             before(grammarAccess.getNodeAccess().getProblemRefAssignment_3_2_2_2()); 
            // InternalProblem.g:1230:1: ( rule__Node__ProblemRefAssignment_3_2_2_2 )
            // InternalProblem.g:1230:2: rule__Node__ProblemRefAssignment_3_2_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Node__ProblemRefAssignment_3_2_2_2();

            state._fsp--;


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
    // $ANTLR end "rule__Node__Group_3_2_2__2__Impl"


    // $ANTLR start "rule__Node__Group_3_2_3__0"
    // InternalProblem.g:1246:1: rule__Node__Group_3_2_3__0 : rule__Node__Group_3_2_3__0__Impl rule__Node__Group_3_2_3__1 ;
    public final void rule__Node__Group_3_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1250:1: ( rule__Node__Group_3_2_3__0__Impl rule__Node__Group_3_2_3__1 )
            // InternalProblem.g:1251:2: rule__Node__Group_3_2_3__0__Impl rule__Node__Group_3_2_3__1
            {
            pushFollow(FOLLOW_15);
            rule__Node__Group_3_2_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group_3_2_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_3_2_3__0"


    // $ANTLR start "rule__Node__Group_3_2_3__0__Impl"
    // InternalProblem.g:1258:1: rule__Node__Group_3_2_3__0__Impl : ( 'see' ) ;
    public final void rule__Node__Group_3_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1262:1: ( ( 'see' ) )
            // InternalProblem.g:1263:1: ( 'see' )
            {
            // InternalProblem.g:1263:1: ( 'see' )
            // InternalProblem.g:1264:1: 'see'
            {
             before(grammarAccess.getNodeAccess().getSeeKeyword_3_2_3_0()); 
            match(input,34,FOLLOW_2); 
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
    // $ANTLR end "rule__Node__Group_3_2_3__0__Impl"


    // $ANTLR start "rule__Node__Group_3_2_3__1"
    // InternalProblem.g:1277:1: rule__Node__Group_3_2_3__1 : rule__Node__Group_3_2_3__1__Impl ;
    public final void rule__Node__Group_3_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1281:1: ( rule__Node__Group_3_2_3__1__Impl )
            // InternalProblem.g:1282:2: rule__Node__Group_3_2_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Node__Group_3_2_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_3_2_3__1"


    // $ANTLR start "rule__Node__Group_3_2_3__1__Impl"
    // InternalProblem.g:1288:1: rule__Node__Group_3_2_3__1__Impl : ( ( rule__Node__HrefAssignment_3_2_3_1 ) ) ;
    public final void rule__Node__Group_3_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1292:1: ( ( ( rule__Node__HrefAssignment_3_2_3_1 ) ) )
            // InternalProblem.g:1293:1: ( ( rule__Node__HrefAssignment_3_2_3_1 ) )
            {
            // InternalProblem.g:1293:1: ( ( rule__Node__HrefAssignment_3_2_3_1 ) )
            // InternalProblem.g:1294:1: ( rule__Node__HrefAssignment_3_2_3_1 )
            {
             before(grammarAccess.getNodeAccess().getHrefAssignment_3_2_3_1()); 
            // InternalProblem.g:1295:1: ( rule__Node__HrefAssignment_3_2_3_1 )
            // InternalProblem.g:1295:2: rule__Node__HrefAssignment_3_2_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Node__HrefAssignment_3_2_3_1();

            state._fsp--;


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
    // $ANTLR end "rule__Node__Group_3_2_3__1__Impl"


    // $ANTLR start "rule__Phenomenon__Group__0"
    // InternalProblem.g:1309:1: rule__Phenomenon__Group__0 : rule__Phenomenon__Group__0__Impl rule__Phenomenon__Group__1 ;
    public final void rule__Phenomenon__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1313:1: ( rule__Phenomenon__Group__0__Impl rule__Phenomenon__Group__1 )
            // InternalProblem.g:1314:2: rule__Phenomenon__Group__0__Impl rule__Phenomenon__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Phenomenon__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Phenomenon__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phenomenon__Group__0"


    // $ANTLR start "rule__Phenomenon__Group__0__Impl"
    // InternalProblem.g:1321:1: rule__Phenomenon__Group__0__Impl : ( ( rule__Phenomenon__TypeAssignment_0 )? ) ;
    public final void rule__Phenomenon__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1325:1: ( ( ( rule__Phenomenon__TypeAssignment_0 )? ) )
            // InternalProblem.g:1326:1: ( ( rule__Phenomenon__TypeAssignment_0 )? )
            {
            // InternalProblem.g:1326:1: ( ( rule__Phenomenon__TypeAssignment_0 )? )
            // InternalProblem.g:1327:1: ( rule__Phenomenon__TypeAssignment_0 )?
            {
             before(grammarAccess.getPhenomenonAccess().getTypeAssignment_0()); 
            // InternalProblem.g:1328:1: ( rule__Phenomenon__TypeAssignment_0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=20 && LA15_0<=22)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalProblem.g:1328:2: rule__Phenomenon__TypeAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Phenomenon__TypeAssignment_0();

                    state._fsp--;


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
    // $ANTLR end "rule__Phenomenon__Group__0__Impl"


    // $ANTLR start "rule__Phenomenon__Group__1"
    // InternalProblem.g:1338:1: rule__Phenomenon__Group__1 : rule__Phenomenon__Group__1__Impl rule__Phenomenon__Group__2 ;
    public final void rule__Phenomenon__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1342:1: ( rule__Phenomenon__Group__1__Impl rule__Phenomenon__Group__2 )
            // InternalProblem.g:1343:2: rule__Phenomenon__Group__1__Impl rule__Phenomenon__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Phenomenon__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Phenomenon__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phenomenon__Group__1"


    // $ANTLR start "rule__Phenomenon__Group__1__Impl"
    // InternalProblem.g:1350:1: rule__Phenomenon__Group__1__Impl : ( ( rule__Phenomenon__IsControlledAssignment_1 )? ) ;
    public final void rule__Phenomenon__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1354:1: ( ( ( rule__Phenomenon__IsControlledAssignment_1 )? ) )
            // InternalProblem.g:1355:1: ( ( rule__Phenomenon__IsControlledAssignment_1 )? )
            {
            // InternalProblem.g:1355:1: ( ( rule__Phenomenon__IsControlledAssignment_1 )? )
            // InternalProblem.g:1356:1: ( rule__Phenomenon__IsControlledAssignment_1 )?
            {
             before(grammarAccess.getPhenomenonAccess().getIsControlledAssignment_1()); 
            // InternalProblem.g:1357:1: ( rule__Phenomenon__IsControlledAssignment_1 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==37) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalProblem.g:1357:2: rule__Phenomenon__IsControlledAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Phenomenon__IsControlledAssignment_1();

                    state._fsp--;


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
    // $ANTLR end "rule__Phenomenon__Group__1__Impl"


    // $ANTLR start "rule__Phenomenon__Group__2"
    // InternalProblem.g:1367:1: rule__Phenomenon__Group__2 : rule__Phenomenon__Group__2__Impl rule__Phenomenon__Group__3 ;
    public final void rule__Phenomenon__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1371:1: ( rule__Phenomenon__Group__2__Impl rule__Phenomenon__Group__3 )
            // InternalProblem.g:1372:2: rule__Phenomenon__Group__2__Impl rule__Phenomenon__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Phenomenon__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Phenomenon__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phenomenon__Group__2"


    // $ANTLR start "rule__Phenomenon__Group__2__Impl"
    // InternalProblem.g:1379:1: rule__Phenomenon__Group__2__Impl : ( ( rule__Phenomenon__NameAssignment_2 ) ) ;
    public final void rule__Phenomenon__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1383:1: ( ( ( rule__Phenomenon__NameAssignment_2 ) ) )
            // InternalProblem.g:1384:1: ( ( rule__Phenomenon__NameAssignment_2 ) )
            {
            // InternalProblem.g:1384:1: ( ( rule__Phenomenon__NameAssignment_2 ) )
            // InternalProblem.g:1385:1: ( rule__Phenomenon__NameAssignment_2 )
            {
             before(grammarAccess.getPhenomenonAccess().getNameAssignment_2()); 
            // InternalProblem.g:1386:1: ( rule__Phenomenon__NameAssignment_2 )
            // InternalProblem.g:1386:2: rule__Phenomenon__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Phenomenon__NameAssignment_2();

            state._fsp--;


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
    // $ANTLR end "rule__Phenomenon__Group__2__Impl"


    // $ANTLR start "rule__Phenomenon__Group__3"
    // InternalProblem.g:1396:1: rule__Phenomenon__Group__3 : rule__Phenomenon__Group__3__Impl ;
    public final void rule__Phenomenon__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1400:1: ( rule__Phenomenon__Group__3__Impl )
            // InternalProblem.g:1401:2: rule__Phenomenon__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Phenomenon__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phenomenon__Group__3"


    // $ANTLR start "rule__Phenomenon__Group__3__Impl"
    // InternalProblem.g:1407:1: rule__Phenomenon__Group__3__Impl : ( ( rule__Phenomenon__Group_3__0 )? ) ;
    public final void rule__Phenomenon__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1411:1: ( ( ( rule__Phenomenon__Group_3__0 )? ) )
            // InternalProblem.g:1412:1: ( ( rule__Phenomenon__Group_3__0 )? )
            {
            // InternalProblem.g:1412:1: ( ( rule__Phenomenon__Group_3__0 )? )
            // InternalProblem.g:1413:1: ( rule__Phenomenon__Group_3__0 )?
            {
             before(grammarAccess.getPhenomenonAccess().getGroup_3()); 
            // InternalProblem.g:1414:1: ( rule__Phenomenon__Group_3__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING||LA17_0==30) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalProblem.g:1414:2: rule__Phenomenon__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Phenomenon__Group_3__0();

                    state._fsp--;


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
    // $ANTLR end "rule__Phenomenon__Group__3__Impl"


    // $ANTLR start "rule__Phenomenon__Group_3__0"
    // InternalProblem.g:1432:1: rule__Phenomenon__Group_3__0 : rule__Phenomenon__Group_3__0__Impl rule__Phenomenon__Group_3__1 ;
    public final void rule__Phenomenon__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1436:1: ( rule__Phenomenon__Group_3__0__Impl rule__Phenomenon__Group_3__1 )
            // InternalProblem.g:1437:2: rule__Phenomenon__Group_3__0__Impl rule__Phenomenon__Group_3__1
            {
            pushFollow(FOLLOW_7);
            rule__Phenomenon__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Phenomenon__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phenomenon__Group_3__0"


    // $ANTLR start "rule__Phenomenon__Group_3__0__Impl"
    // InternalProblem.g:1444:1: rule__Phenomenon__Group_3__0__Impl : ( ( ':' )? ) ;
    public final void rule__Phenomenon__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1448:1: ( ( ( ':' )? ) )
            // InternalProblem.g:1449:1: ( ( ':' )? )
            {
            // InternalProblem.g:1449:1: ( ( ':' )? )
            // InternalProblem.g:1450:1: ( ':' )?
            {
             before(grammarAccess.getPhenomenonAccess().getColonKeyword_3_0()); 
            // InternalProblem.g:1451:1: ( ':' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==30) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalProblem.g:1452:2: ':'
                    {
                    match(input,30,FOLLOW_2); 

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
    // $ANTLR end "rule__Phenomenon__Group_3__0__Impl"


    // $ANTLR start "rule__Phenomenon__Group_3__1"
    // InternalProblem.g:1463:1: rule__Phenomenon__Group_3__1 : rule__Phenomenon__Group_3__1__Impl ;
    public final void rule__Phenomenon__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1467:1: ( rule__Phenomenon__Group_3__1__Impl )
            // InternalProblem.g:1468:2: rule__Phenomenon__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Phenomenon__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phenomenon__Group_3__1"


    // $ANTLR start "rule__Phenomenon__Group_3__1__Impl"
    // InternalProblem.g:1474:1: rule__Phenomenon__Group_3__1__Impl : ( ( rule__Phenomenon__DescriptionAssignment_3_1 ) ) ;
    public final void rule__Phenomenon__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1478:1: ( ( ( rule__Phenomenon__DescriptionAssignment_3_1 ) ) )
            // InternalProblem.g:1479:1: ( ( rule__Phenomenon__DescriptionAssignment_3_1 ) )
            {
            // InternalProblem.g:1479:1: ( ( rule__Phenomenon__DescriptionAssignment_3_1 ) )
            // InternalProblem.g:1480:1: ( rule__Phenomenon__DescriptionAssignment_3_1 )
            {
             before(grammarAccess.getPhenomenonAccess().getDescriptionAssignment_3_1()); 
            // InternalProblem.g:1481:1: ( rule__Phenomenon__DescriptionAssignment_3_1 )
            // InternalProblem.g:1481:2: rule__Phenomenon__DescriptionAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Phenomenon__DescriptionAssignment_3_1();

            state._fsp--;


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
    // $ANTLR end "rule__Phenomenon__Group_3__1__Impl"


    // $ANTLR start "rule__Link__Group__0"
    // InternalProblem.g:1495:1: rule__Link__Group__0 : rule__Link__Group__0__Impl rule__Link__Group__1 ;
    public final void rule__Link__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1499:1: ( rule__Link__Group__0__Impl rule__Link__Group__1 )
            // InternalProblem.g:1500:2: rule__Link__Group__0__Impl rule__Link__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Link__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__0"


    // $ANTLR start "rule__Link__Group__0__Impl"
    // InternalProblem.g:1507:1: rule__Link__Group__0__Impl : ( ( rule__Link__FromAssignment_0 ) ) ;
    public final void rule__Link__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1511:1: ( ( ( rule__Link__FromAssignment_0 ) ) )
            // InternalProblem.g:1512:1: ( ( rule__Link__FromAssignment_0 ) )
            {
            // InternalProblem.g:1512:1: ( ( rule__Link__FromAssignment_0 ) )
            // InternalProblem.g:1513:1: ( rule__Link__FromAssignment_0 )
            {
             before(grammarAccess.getLinkAccess().getFromAssignment_0()); 
            // InternalProblem.g:1514:1: ( rule__Link__FromAssignment_0 )
            // InternalProblem.g:1514:2: rule__Link__FromAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Link__FromAssignment_0();

            state._fsp--;


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
    // $ANTLR end "rule__Link__Group__0__Impl"


    // $ANTLR start "rule__Link__Group__1"
    // InternalProblem.g:1524:1: rule__Link__Group__1 : rule__Link__Group__1__Impl rule__Link__Group__2 ;
    public final void rule__Link__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1528:1: ( rule__Link__Group__1__Impl rule__Link__Group__2 )
            // InternalProblem.g:1529:2: rule__Link__Group__1__Impl rule__Link__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Link__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__1"


    // $ANTLR start "rule__Link__Group__1__Impl"
    // InternalProblem.g:1536:1: rule__Link__Group__1__Impl : ( ( rule__Link__TypeAssignment_1 ) ) ;
    public final void rule__Link__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1540:1: ( ( ( rule__Link__TypeAssignment_1 ) ) )
            // InternalProblem.g:1541:1: ( ( rule__Link__TypeAssignment_1 ) )
            {
            // InternalProblem.g:1541:1: ( ( rule__Link__TypeAssignment_1 ) )
            // InternalProblem.g:1542:1: ( rule__Link__TypeAssignment_1 )
            {
             before(grammarAccess.getLinkAccess().getTypeAssignment_1()); 
            // InternalProblem.g:1543:1: ( rule__Link__TypeAssignment_1 )
            // InternalProblem.g:1543:2: rule__Link__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Link__TypeAssignment_1();

            state._fsp--;


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
    // $ANTLR end "rule__Link__Group__1__Impl"


    // $ANTLR start "rule__Link__Group__2"
    // InternalProblem.g:1553:1: rule__Link__Group__2 : rule__Link__Group__2__Impl rule__Link__Group__3 ;
    public final void rule__Link__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1557:1: ( rule__Link__Group__2__Impl rule__Link__Group__3 )
            // InternalProblem.g:1558:2: rule__Link__Group__2__Impl rule__Link__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Link__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__2"


    // $ANTLR start "rule__Link__Group__2__Impl"
    // InternalProblem.g:1565:1: rule__Link__Group__2__Impl : ( ( rule__Link__ToAssignment_2 ) ) ;
    public final void rule__Link__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1569:1: ( ( ( rule__Link__ToAssignment_2 ) ) )
            // InternalProblem.g:1570:1: ( ( rule__Link__ToAssignment_2 ) )
            {
            // InternalProblem.g:1570:1: ( ( rule__Link__ToAssignment_2 ) )
            // InternalProblem.g:1571:1: ( rule__Link__ToAssignment_2 )
            {
             before(grammarAccess.getLinkAccess().getToAssignment_2()); 
            // InternalProblem.g:1572:1: ( rule__Link__ToAssignment_2 )
            // InternalProblem.g:1572:2: rule__Link__ToAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Link__ToAssignment_2();

            state._fsp--;


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
    // $ANTLR end "rule__Link__Group__2__Impl"


    // $ANTLR start "rule__Link__Group__3"
    // InternalProblem.g:1582:1: rule__Link__Group__3 : rule__Link__Group__3__Impl rule__Link__Group__4 ;
    public final void rule__Link__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1586:1: ( rule__Link__Group__3__Impl rule__Link__Group__4 )
            // InternalProblem.g:1587:2: rule__Link__Group__3__Impl rule__Link__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Link__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__3"


    // $ANTLR start "rule__Link__Group__3__Impl"
    // InternalProblem.g:1594:1: rule__Link__Group__3__Impl : ( ( rule__Link__Group_3__0 )? ) ;
    public final void rule__Link__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1598:1: ( ( ( rule__Link__Group_3__0 )? ) )
            // InternalProblem.g:1599:1: ( ( rule__Link__Group_3__0 )? )
            {
            // InternalProblem.g:1599:1: ( ( rule__Link__Group_3__0 )? )
            // InternalProblem.g:1600:1: ( rule__Link__Group_3__0 )?
            {
             before(grammarAccess.getLinkAccess().getGroup_3()); 
            // InternalProblem.g:1601:1: ( rule__Link__Group_3__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==31) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalProblem.g:1601:2: rule__Link__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Link__Group_3__0();

                    state._fsp--;


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
    // $ANTLR end "rule__Link__Group__3__Impl"


    // $ANTLR start "rule__Link__Group__4"
    // InternalProblem.g:1611:1: rule__Link__Group__4 : rule__Link__Group__4__Impl ;
    public final void rule__Link__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1615:1: ( rule__Link__Group__4__Impl )
            // InternalProblem.g:1616:2: rule__Link__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__4"


    // $ANTLR start "rule__Link__Group__4__Impl"
    // InternalProblem.g:1622:1: rule__Link__Group__4__Impl : ( ( rule__Link__Group_4__0 )? ) ;
    public final void rule__Link__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1626:1: ( ( ( rule__Link__Group_4__0 )? ) )
            // InternalProblem.g:1627:1: ( ( rule__Link__Group_4__0 )? )
            {
            // InternalProblem.g:1627:1: ( ( rule__Link__Group_4__0 )? )
            // InternalProblem.g:1628:1: ( rule__Link__Group_4__0 )?
            {
             before(grammarAccess.getLinkAccess().getGroup_4()); 
            // InternalProblem.g:1629:1: ( rule__Link__Group_4__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_STRING||LA20_0==30) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalProblem.g:1629:2: rule__Link__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Link__Group_4__0();

                    state._fsp--;


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
    // $ANTLR end "rule__Link__Group__4__Impl"


    // $ANTLR start "rule__Link__Group_3__0"
    // InternalProblem.g:1649:1: rule__Link__Group_3__0 : rule__Link__Group_3__0__Impl rule__Link__Group_3__1 ;
    public final void rule__Link__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1653:1: ( rule__Link__Group_3__0__Impl rule__Link__Group_3__1 )
            // InternalProblem.g:1654:2: rule__Link__Group_3__0__Impl rule__Link__Group_3__1
            {
            pushFollow(FOLLOW_12);
            rule__Link__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_3__0"


    // $ANTLR start "rule__Link__Group_3__0__Impl"
    // InternalProblem.g:1661:1: rule__Link__Group_3__0__Impl : ( '{' ) ;
    public final void rule__Link__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1665:1: ( ( '{' ) )
            // InternalProblem.g:1666:1: ( '{' )
            {
            // InternalProblem.g:1666:1: ( '{' )
            // InternalProblem.g:1667:1: '{'
            {
             before(grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,31,FOLLOW_2); 
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
    // $ANTLR end "rule__Link__Group_3__0__Impl"


    // $ANTLR start "rule__Link__Group_3__1"
    // InternalProblem.g:1680:1: rule__Link__Group_3__1 : rule__Link__Group_3__1__Impl rule__Link__Group_3__2 ;
    public final void rule__Link__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1684:1: ( rule__Link__Group_3__1__Impl rule__Link__Group_3__2 )
            // InternalProblem.g:1685:2: rule__Link__Group_3__1__Impl rule__Link__Group_3__2
            {
            pushFollow(FOLLOW_18);
            rule__Link__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_3__1"


    // $ANTLR start "rule__Link__Group_3__1__Impl"
    // InternalProblem.g:1692:1: rule__Link__Group_3__1__Impl : ( ( rule__Link__PhenomenaAssignment_3_1 ) ) ;
    public final void rule__Link__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1696:1: ( ( ( rule__Link__PhenomenaAssignment_3_1 ) ) )
            // InternalProblem.g:1697:1: ( ( rule__Link__PhenomenaAssignment_3_1 ) )
            {
            // InternalProblem.g:1697:1: ( ( rule__Link__PhenomenaAssignment_3_1 ) )
            // InternalProblem.g:1698:1: ( rule__Link__PhenomenaAssignment_3_1 )
            {
             before(grammarAccess.getLinkAccess().getPhenomenaAssignment_3_1()); 
            // InternalProblem.g:1699:1: ( rule__Link__PhenomenaAssignment_3_1 )
            // InternalProblem.g:1699:2: rule__Link__PhenomenaAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Link__PhenomenaAssignment_3_1();

            state._fsp--;


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
    // $ANTLR end "rule__Link__Group_3__1__Impl"


    // $ANTLR start "rule__Link__Group_3__2"
    // InternalProblem.g:1709:1: rule__Link__Group_3__2 : rule__Link__Group_3__2__Impl rule__Link__Group_3__3 ;
    public final void rule__Link__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1713:1: ( rule__Link__Group_3__2__Impl rule__Link__Group_3__3 )
            // InternalProblem.g:1714:2: rule__Link__Group_3__2__Impl rule__Link__Group_3__3
            {
            pushFollow(FOLLOW_18);
            rule__Link__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_3__2"


    // $ANTLR start "rule__Link__Group_3__2__Impl"
    // InternalProblem.g:1721:1: rule__Link__Group_3__2__Impl : ( ( rule__Link__Group_3_2__0 )* ) ;
    public final void rule__Link__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1725:1: ( ( ( rule__Link__Group_3_2__0 )* ) )
            // InternalProblem.g:1726:1: ( ( rule__Link__Group_3_2__0 )* )
            {
            // InternalProblem.g:1726:1: ( ( rule__Link__Group_3_2__0 )* )
            // InternalProblem.g:1727:1: ( rule__Link__Group_3_2__0 )*
            {
             before(grammarAccess.getLinkAccess().getGroup_3_2()); 
            // InternalProblem.g:1728:1: ( rule__Link__Group_3_2__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==33) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalProblem.g:1728:2: rule__Link__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Link__Group_3_2__0();

            	    state._fsp--;


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
    // $ANTLR end "rule__Link__Group_3__2__Impl"


    // $ANTLR start "rule__Link__Group_3__3"
    // InternalProblem.g:1738:1: rule__Link__Group_3__3 : rule__Link__Group_3__3__Impl ;
    public final void rule__Link__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1742:1: ( rule__Link__Group_3__3__Impl )
            // InternalProblem.g:1743:2: rule__Link__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_3__3"


    // $ANTLR start "rule__Link__Group_3__3__Impl"
    // InternalProblem.g:1749:1: rule__Link__Group_3__3__Impl : ( '}' ) ;
    public final void rule__Link__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1753:1: ( ( '}' ) )
            // InternalProblem.g:1754:1: ( '}' )
            {
            // InternalProblem.g:1754:1: ( '}' )
            // InternalProblem.g:1755:1: '}'
            {
             before(grammarAccess.getLinkAccess().getRightCurlyBracketKeyword_3_3()); 
            match(input,32,FOLLOW_2); 
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
    // $ANTLR end "rule__Link__Group_3__3__Impl"


    // $ANTLR start "rule__Link__Group_3_2__0"
    // InternalProblem.g:1776:1: rule__Link__Group_3_2__0 : rule__Link__Group_3_2__0__Impl rule__Link__Group_3_2__1 ;
    public final void rule__Link__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1780:1: ( rule__Link__Group_3_2__0__Impl rule__Link__Group_3_2__1 )
            // InternalProblem.g:1781:2: rule__Link__Group_3_2__0__Impl rule__Link__Group_3_2__1
            {
            pushFollow(FOLLOW_12);
            rule__Link__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_3_2__0"


    // $ANTLR start "rule__Link__Group_3_2__0__Impl"
    // InternalProblem.g:1788:1: rule__Link__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__Link__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1792:1: ( ( ',' ) )
            // InternalProblem.g:1793:1: ( ',' )
            {
            // InternalProblem.g:1793:1: ( ',' )
            // InternalProblem.g:1794:1: ','
            {
             before(grammarAccess.getLinkAccess().getCommaKeyword_3_2_0()); 
            match(input,33,FOLLOW_2); 
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
    // $ANTLR end "rule__Link__Group_3_2__0__Impl"


    // $ANTLR start "rule__Link__Group_3_2__1"
    // InternalProblem.g:1807:1: rule__Link__Group_3_2__1 : rule__Link__Group_3_2__1__Impl ;
    public final void rule__Link__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1811:1: ( rule__Link__Group_3_2__1__Impl )
            // InternalProblem.g:1812:2: rule__Link__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_3_2__1"


    // $ANTLR start "rule__Link__Group_3_2__1__Impl"
    // InternalProblem.g:1818:1: rule__Link__Group_3_2__1__Impl : ( ( rule__Link__PhenomenaAssignment_3_2_1 ) ) ;
    public final void rule__Link__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1822:1: ( ( ( rule__Link__PhenomenaAssignment_3_2_1 ) ) )
            // InternalProblem.g:1823:1: ( ( rule__Link__PhenomenaAssignment_3_2_1 ) )
            {
            // InternalProblem.g:1823:1: ( ( rule__Link__PhenomenaAssignment_3_2_1 ) )
            // InternalProblem.g:1824:1: ( rule__Link__PhenomenaAssignment_3_2_1 )
            {
             before(grammarAccess.getLinkAccess().getPhenomenaAssignment_3_2_1()); 
            // InternalProblem.g:1825:1: ( rule__Link__PhenomenaAssignment_3_2_1 )
            // InternalProblem.g:1825:2: rule__Link__PhenomenaAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Link__PhenomenaAssignment_3_2_1();

            state._fsp--;


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
    // $ANTLR end "rule__Link__Group_3_2__1__Impl"


    // $ANTLR start "rule__Link__Group_4__0"
    // InternalProblem.g:1839:1: rule__Link__Group_4__0 : rule__Link__Group_4__0__Impl rule__Link__Group_4__1 ;
    public final void rule__Link__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1843:1: ( rule__Link__Group_4__0__Impl rule__Link__Group_4__1 )
            // InternalProblem.g:1844:2: rule__Link__Group_4__0__Impl rule__Link__Group_4__1
            {
            pushFollow(FOLLOW_7);
            rule__Link__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_4__0"


    // $ANTLR start "rule__Link__Group_4__0__Impl"
    // InternalProblem.g:1851:1: rule__Link__Group_4__0__Impl : ( ( ':' )? ) ;
    public final void rule__Link__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1855:1: ( ( ( ':' )? ) )
            // InternalProblem.g:1856:1: ( ( ':' )? )
            {
            // InternalProblem.g:1856:1: ( ( ':' )? )
            // InternalProblem.g:1857:1: ( ':' )?
            {
             before(grammarAccess.getLinkAccess().getColonKeyword_4_0()); 
            // InternalProblem.g:1858:1: ( ':' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==30) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalProblem.g:1859:2: ':'
                    {
                    match(input,30,FOLLOW_2); 

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
    // $ANTLR end "rule__Link__Group_4__0__Impl"


    // $ANTLR start "rule__Link__Group_4__1"
    // InternalProblem.g:1870:1: rule__Link__Group_4__1 : rule__Link__Group_4__1__Impl ;
    public final void rule__Link__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1874:1: ( rule__Link__Group_4__1__Impl )
            // InternalProblem.g:1875:2: rule__Link__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_4__1"


    // $ANTLR start "rule__Link__Group_4__1__Impl"
    // InternalProblem.g:1881:1: rule__Link__Group_4__1__Impl : ( ( rule__Link__DescriptionAssignment_4_1 ) ) ;
    public final void rule__Link__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1885:1: ( ( ( rule__Link__DescriptionAssignment_4_1 ) ) )
            // InternalProblem.g:1886:1: ( ( rule__Link__DescriptionAssignment_4_1 ) )
            {
            // InternalProblem.g:1886:1: ( ( rule__Link__DescriptionAssignment_4_1 ) )
            // InternalProblem.g:1887:1: ( rule__Link__DescriptionAssignment_4_1 )
            {
             before(grammarAccess.getLinkAccess().getDescriptionAssignment_4_1()); 
            // InternalProblem.g:1888:1: ( rule__Link__DescriptionAssignment_4_1 )
            // InternalProblem.g:1888:2: rule__Link__DescriptionAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Link__DescriptionAssignment_4_1();

            state._fsp--;


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
    // $ANTLR end "rule__Link__Group_4__1__Impl"


    // $ANTLR start "rule__ProblemDiagram__NameAssignment_1"
    // InternalProblem.g:1903:1: rule__ProblemDiagram__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ProblemDiagram__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1907:1: ( ( RULE_ID ) )
            // InternalProblem.g:1908:1: ( RULE_ID )
            {
            // InternalProblem.g:1908:1: ( RULE_ID )
            // InternalProblem.g:1909:1: RULE_ID
            {
             before(grammarAccess.getProblemDiagramAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // $ANTLR end "rule__ProblemDiagram__NameAssignment_1"


    // $ANTLR start "rule__ProblemDiagram__HighlightAssignment_2_1"
    // InternalProblem.g:1918:1: rule__ProblemDiagram__HighlightAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__ProblemDiagram__HighlightAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1922:1: ( ( ( RULE_ID ) ) )
            // InternalProblem.g:1923:1: ( ( RULE_ID ) )
            {
            // InternalProblem.g:1923:1: ( ( RULE_ID ) )
            // InternalProblem.g:1924:1: ( RULE_ID )
            {
             before(grammarAccess.getProblemDiagramAccess().getHighlightNodeCrossReference_2_1_0()); 
            // InternalProblem.g:1925:1: ( RULE_ID )
            // InternalProblem.g:1926:1: RULE_ID
            {
             before(grammarAccess.getProblemDiagramAccess().getHighlightNodeIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // $ANTLR end "rule__ProblemDiagram__HighlightAssignment_2_1"


    // $ANTLR start "rule__ProblemDiagram__NodesAssignment_3_0"
    // InternalProblem.g:1937:1: rule__ProblemDiagram__NodesAssignment_3_0 : ( ruleNode ) ;
    public final void rule__ProblemDiagram__NodesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1941:1: ( ( ruleNode ) )
            // InternalProblem.g:1942:1: ( ruleNode )
            {
            // InternalProblem.g:1942:1: ( ruleNode )
            // InternalProblem.g:1943:1: ruleNode
            {
             before(grammarAccess.getProblemDiagramAccess().getNodesNodeParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNode();

            state._fsp--;

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
    // $ANTLR end "rule__ProblemDiagram__NodesAssignment_3_0"


    // $ANTLR start "rule__ProblemDiagram__LinksAssignment_3_1"
    // InternalProblem.g:1952:1: rule__ProblemDiagram__LinksAssignment_3_1 : ( ruleLink ) ;
    public final void rule__ProblemDiagram__LinksAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1956:1: ( ( ruleLink ) )
            // InternalProblem.g:1957:1: ( ruleLink )
            {
            // InternalProblem.g:1957:1: ( ruleLink )
            // InternalProblem.g:1958:1: ruleLink
            {
             before(grammarAccess.getProblemDiagramAccess().getLinksLinkParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLink();

            state._fsp--;

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
    // $ANTLR end "rule__ProblemDiagram__LinksAssignment_3_1"


    // $ANTLR start "rule__Node__NameAssignment_0"
    // InternalProblem.g:1967:1: rule__Node__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Node__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1971:1: ( ( RULE_ID ) )
            // InternalProblem.g:1972:1: ( RULE_ID )
            {
            // InternalProblem.g:1972:1: ( RULE_ID )
            // InternalProblem.g:1973:1: RULE_ID
            {
             before(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // $ANTLR end "rule__Node__NameAssignment_0"


    // $ANTLR start "rule__Node__TypeAssignment_1"
    // InternalProblem.g:1982:1: rule__Node__TypeAssignment_1 : ( ruleNodeType ) ;
    public final void rule__Node__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1986:1: ( ( ruleNodeType ) )
            // InternalProblem.g:1987:1: ( ruleNodeType )
            {
            // InternalProblem.g:1987:1: ( ruleNodeType )
            // InternalProblem.g:1988:1: ruleNodeType
            {
             before(grammarAccess.getNodeAccess().getTypeNodeTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNodeType();

            state._fsp--;

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
    // $ANTLR end "rule__Node__TypeAssignment_1"


    // $ANTLR start "rule__Node__DescriptionAssignment_2_1"
    // InternalProblem.g:1997:1: rule__Node__DescriptionAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Node__DescriptionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:2001:1: ( ( RULE_STRING ) )
            // InternalProblem.g:2002:1: ( RULE_STRING )
            {
            // InternalProblem.g:2002:1: ( RULE_STRING )
            // InternalProblem.g:2003:1: RULE_STRING
            {
             before(grammarAccess.getNodeAccess().getDescriptionSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
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
    // $ANTLR end "rule__Node__DescriptionAssignment_2_1"


    // $ANTLR start "rule__Node__HiddenPhenomenaAssignment_3_1_0"
    // InternalProblem.g:2012:1: rule__Node__HiddenPhenomenaAssignment_3_1_0 : ( rulePhenomenon ) ;
    public final void rule__Node__HiddenPhenomenaAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:2016:1: ( ( rulePhenomenon ) )
            // InternalProblem.g:2017:1: ( rulePhenomenon )
            {
            // InternalProblem.g:2017:1: ( rulePhenomenon )
            // InternalProblem.g:2018:1: rulePhenomenon
            {
             before(grammarAccess.getNodeAccess().getHiddenPhenomenaPhenomenonParserRuleCall_3_1_0_0()); 
            pushFollow(FOLLOW_2);
            rulePhenomenon();

            state._fsp--;

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
    // $ANTLR end "rule__Node__HiddenPhenomenaAssignment_3_1_0"


    // $ANTLR start "rule__Node__HiddenPhenomenaAssignment_3_1_1_1"
    // InternalProblem.g:2027:1: rule__Node__HiddenPhenomenaAssignment_3_1_1_1 : ( rulePhenomenon ) ;
    public final void rule__Node__HiddenPhenomenaAssignment_3_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:2031:1: ( ( rulePhenomenon ) )
            // InternalProblem.g:2032:1: ( rulePhenomenon )
            {
            // InternalProblem.g:2032:1: ( rulePhenomenon )
            // InternalProblem.g:2033:1: rulePhenomenon
            {
             before(grammarAccess.getNodeAccess().getHiddenPhenomenaPhenomenonParserRuleCall_3_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulePhenomenon();

            state._fsp--;

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
    // $ANTLR end "rule__Node__HiddenPhenomenaAssignment_3_1_1_1"


    // $ANTLR start "rule__Node__SubproblemAssignment_3_2_0"
    // InternalProblem.g:2042:1: rule__Node__SubproblemAssignment_3_2_0 : ( ruleProblemDiagram ) ;
    public final void rule__Node__SubproblemAssignment_3_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:2046:1: ( ( ruleProblemDiagram ) )
            // InternalProblem.g:2047:1: ( ruleProblemDiagram )
            {
            // InternalProblem.g:2047:1: ( ruleProblemDiagram )
            // InternalProblem.g:2048:1: ruleProblemDiagram
            {
             before(grammarAccess.getNodeAccess().getSubproblemProblemDiagramParserRuleCall_3_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleProblemDiagram();

            state._fsp--;

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
    // $ANTLR end "rule__Node__SubproblemAssignment_3_2_0"


    // $ANTLR start "rule__Node__ProblemNodeRefAssignment_3_2_1_2"
    // InternalProblem.g:2057:1: rule__Node__ProblemNodeRefAssignment_3_2_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__Node__ProblemNodeRefAssignment_3_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:2061:1: ( ( ( RULE_ID ) ) )
            // InternalProblem.g:2062:1: ( ( RULE_ID ) )
            {
            // InternalProblem.g:2062:1: ( ( RULE_ID ) )
            // InternalProblem.g:2063:1: ( RULE_ID )
            {
             before(grammarAccess.getNodeAccess().getProblemNodeRefNodeCrossReference_3_2_1_2_0()); 
            // InternalProblem.g:2064:1: ( RULE_ID )
            // InternalProblem.g:2065:1: RULE_ID
            {
             before(grammarAccess.getNodeAccess().getProblemNodeRefNodeIDTerminalRuleCall_3_2_1_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // $ANTLR end "rule__Node__ProblemNodeRefAssignment_3_2_1_2"


    // $ANTLR start "rule__Node__ProblemRefAssignment_3_2_2_2"
    // InternalProblem.g:2076:1: rule__Node__ProblemRefAssignment_3_2_2_2 : ( ( RULE_ID ) ) ;
    public final void rule__Node__ProblemRefAssignment_3_2_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:2080:1: ( ( ( RULE_ID ) ) )
            // InternalProblem.g:2081:1: ( ( RULE_ID ) )
            {
            // InternalProblem.g:2081:1: ( ( RULE_ID ) )
            // InternalProblem.g:2082:1: ( RULE_ID )
            {
             before(grammarAccess.getNodeAccess().getProblemRefProblemDiagramCrossReference_3_2_2_2_0()); 
            // InternalProblem.g:2083:1: ( RULE_ID )
            // InternalProblem.g:2084:1: RULE_ID
            {
             before(grammarAccess.getNodeAccess().getProblemRefProblemDiagramIDTerminalRuleCall_3_2_2_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // $ANTLR end "rule__Node__ProblemRefAssignment_3_2_2_2"


    // $ANTLR start "rule__Node__HrefAssignment_3_2_3_1"
    // InternalProblem.g:2095:1: rule__Node__HrefAssignment_3_2_3_1 : ( RULE_STRING ) ;
    public final void rule__Node__HrefAssignment_3_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:2099:1: ( ( RULE_STRING ) )
            // InternalProblem.g:2100:1: ( RULE_STRING )
            {
            // InternalProblem.g:2100:1: ( RULE_STRING )
            // InternalProblem.g:2101:1: RULE_STRING
            {
             before(grammarAccess.getNodeAccess().getHrefSTRINGTerminalRuleCall_3_2_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
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
    // $ANTLR end "rule__Node__HrefAssignment_3_2_3_1"


    // $ANTLR start "rule__Phenomenon__TypeAssignment_0"
    // InternalProblem.g:2110:1: rule__Phenomenon__TypeAssignment_0 : ( rulePhenomenonType ) ;
    public final void rule__Phenomenon__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:2114:1: ( ( rulePhenomenonType ) )
            // InternalProblem.g:2115:1: ( rulePhenomenonType )
            {
            // InternalProblem.g:2115:1: ( rulePhenomenonType )
            // InternalProblem.g:2116:1: rulePhenomenonType
            {
             before(grammarAccess.getPhenomenonAccess().getTypePhenomenonTypeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePhenomenonType();

            state._fsp--;

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
    // $ANTLR end "rule__Phenomenon__TypeAssignment_0"


    // $ANTLR start "rule__Phenomenon__IsControlledAssignment_1"
    // InternalProblem.g:2125:1: rule__Phenomenon__IsControlledAssignment_1 : ( ( '!' ) ) ;
    public final void rule__Phenomenon__IsControlledAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:2129:1: ( ( ( '!' ) ) )
            // InternalProblem.g:2130:1: ( ( '!' ) )
            {
            // InternalProblem.g:2130:1: ( ( '!' ) )
            // InternalProblem.g:2131:1: ( '!' )
            {
             before(grammarAccess.getPhenomenonAccess().getIsControlledExclamationMarkKeyword_1_0()); 
            // InternalProblem.g:2132:1: ( '!' )
            // InternalProblem.g:2133:1: '!'
            {
             before(grammarAccess.getPhenomenonAccess().getIsControlledExclamationMarkKeyword_1_0()); 
            match(input,37,FOLLOW_2); 
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
    // $ANTLR end "rule__Phenomenon__IsControlledAssignment_1"


    // $ANTLR start "rule__Phenomenon__NameAssignment_2"
    // InternalProblem.g:2148:1: rule__Phenomenon__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Phenomenon__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:2152:1: ( ( RULE_ID ) )
            // InternalProblem.g:2153:1: ( RULE_ID )
            {
            // InternalProblem.g:2153:1: ( RULE_ID )
            // InternalProblem.g:2154:1: RULE_ID
            {
             before(grammarAccess.getPhenomenonAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // $ANTLR end "rule__Phenomenon__NameAssignment_2"


    // $ANTLR start "rule__Phenomenon__DescriptionAssignment_3_1"
    // InternalProblem.g:2163:1: rule__Phenomenon__DescriptionAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Phenomenon__DescriptionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:2167:1: ( ( RULE_STRING ) )
            // InternalProblem.g:2168:1: ( RULE_STRING )
            {
            // InternalProblem.g:2168:1: ( RULE_STRING )
            // InternalProblem.g:2169:1: RULE_STRING
            {
             before(grammarAccess.getPhenomenonAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
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
    // $ANTLR end "rule__Phenomenon__DescriptionAssignment_3_1"


    // $ANTLR start "rule__Link__FromAssignment_0"
    // InternalProblem.g:2178:1: rule__Link__FromAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Link__FromAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:2182:1: ( ( ( RULE_ID ) ) )
            // InternalProblem.g:2183:1: ( ( RULE_ID ) )
            {
            // InternalProblem.g:2183:1: ( ( RULE_ID ) )
            // InternalProblem.g:2184:1: ( RULE_ID )
            {
             before(grammarAccess.getLinkAccess().getFromNodeCrossReference_0_0()); 
            // InternalProblem.g:2185:1: ( RULE_ID )
            // InternalProblem.g:2186:1: RULE_ID
            {
             before(grammarAccess.getLinkAccess().getFromNodeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // $ANTLR end "rule__Link__FromAssignment_0"


    // $ANTLR start "rule__Link__TypeAssignment_1"
    // InternalProblem.g:2197:1: rule__Link__TypeAssignment_1 : ( ruleLinkType ) ;
    public final void rule__Link__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:2201:1: ( ( ruleLinkType ) )
            // InternalProblem.g:2202:1: ( ruleLinkType )
            {
            // InternalProblem.g:2202:1: ( ruleLinkType )
            // InternalProblem.g:2203:1: ruleLinkType
            {
             before(grammarAccess.getLinkAccess().getTypeLinkTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLinkType();

            state._fsp--;

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
    // $ANTLR end "rule__Link__TypeAssignment_1"


    // $ANTLR start "rule__Link__ToAssignment_2"
    // InternalProblem.g:2212:1: rule__Link__ToAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Link__ToAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:2216:1: ( ( ( RULE_ID ) ) )
            // InternalProblem.g:2217:1: ( ( RULE_ID ) )
            {
            // InternalProblem.g:2217:1: ( ( RULE_ID ) )
            // InternalProblem.g:2218:1: ( RULE_ID )
            {
             before(grammarAccess.getLinkAccess().getToNodeCrossReference_2_0()); 
            // InternalProblem.g:2219:1: ( RULE_ID )
            // InternalProblem.g:2220:1: RULE_ID
            {
             before(grammarAccess.getLinkAccess().getToNodeIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // $ANTLR end "rule__Link__ToAssignment_2"


    // $ANTLR start "rule__Link__PhenomenaAssignment_3_1"
    // InternalProblem.g:2231:1: rule__Link__PhenomenaAssignment_3_1 : ( rulePhenomenon ) ;
    public final void rule__Link__PhenomenaAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:2235:1: ( ( rulePhenomenon ) )
            // InternalProblem.g:2236:1: ( rulePhenomenon )
            {
            // InternalProblem.g:2236:1: ( rulePhenomenon )
            // InternalProblem.g:2237:1: rulePhenomenon
            {
             before(grammarAccess.getLinkAccess().getPhenomenaPhenomenonParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            rulePhenomenon();

            state._fsp--;

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
    // $ANTLR end "rule__Link__PhenomenaAssignment_3_1"


    // $ANTLR start "rule__Link__PhenomenaAssignment_3_2_1"
    // InternalProblem.g:2246:1: rule__Link__PhenomenaAssignment_3_2_1 : ( rulePhenomenon ) ;
    public final void rule__Link__PhenomenaAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:2250:1: ( ( rulePhenomenon ) )
            // InternalProblem.g:2251:1: ( rulePhenomenon )
            {
            // InternalProblem.g:2251:1: ( rulePhenomenon )
            // InternalProblem.g:2252:1: rulePhenomenon
            {
             before(grammarAccess.getLinkAccess().getPhenomenaPhenomenonParserRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_2);
            rulePhenomenon();

            state._fsp--;

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
    // $ANTLR end "rule__Link__PhenomenaAssignment_3_2_1"


    // $ANTLR start "rule__Link__DescriptionAssignment_4_1"
    // InternalProblem.g:2261:1: rule__Link__DescriptionAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Link__DescriptionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:2265:1: ( ( RULE_STRING ) )
            // InternalProblem.g:2266:1: ( RULE_STRING )
            {
            // InternalProblem.g:2266:1: ( RULE_STRING )
            // InternalProblem.g:2267:1: RULE_STRING
            {
             before(grammarAccess.getLinkAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
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
    // $ANTLR end "rule__Link__DescriptionAssignment_4_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000C00FF020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000040000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000002510700010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000410000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000002000700010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000000F800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000000C0000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000300000000L});

}