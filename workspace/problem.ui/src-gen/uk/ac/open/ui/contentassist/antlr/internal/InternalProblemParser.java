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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_QUALIFIED_NAME", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'R'", "'M'", "'B'", "'X'", "'C'", "'D'", "'P'", "'?'", "'phenomenon'", "'event'", "'state'", "'<'", "'<='", "'~'", "'--'", "'~~'", "'<~'", "'->'", "'~>'", "'problem:'", "'for'", "':'", "'{'", "'}'", "','", "';'", "'see'", "'domain'", "'problem'", "'('", "')'", "'!'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_QUALIFIED_NAME=6;
    public static final int RULE_ID=4;
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
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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
    // InternalProblem.g:90:1: entryRuleNode : ruleNode EOF ;
    public final void entryRuleNode() throws RecognitionException {
        try {
            // InternalProblem.g:91:1: ( ruleNode EOF )
            // InternalProblem.g:92:1: ruleNode EOF
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
    // InternalProblem.g:99:1: ruleNode : ( ( rule__Node__Group__0 ) ) ;
    public final void ruleNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:103:2: ( ( ( rule__Node__Group__0 ) ) )
            // InternalProblem.g:104:1: ( ( rule__Node__Group__0 ) )
            {
            // InternalProblem.g:104:1: ( ( rule__Node__Group__0 ) )
            // InternalProblem.g:105:1: ( rule__Node__Group__0 )
            {
             before(grammarAccess.getNodeAccess().getGroup()); 
            // InternalProblem.g:106:1: ( rule__Node__Group__0 )
            // InternalProblem.g:106:2: rule__Node__Group__0
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
    // InternalProblem.g:118:1: entryRulePhenomenon : rulePhenomenon EOF ;
    public final void entryRulePhenomenon() throws RecognitionException {
        try {
            // InternalProblem.g:119:1: ( rulePhenomenon EOF )
            // InternalProblem.g:120:1: rulePhenomenon EOF
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
    // InternalProblem.g:127:1: rulePhenomenon : ( ( rule__Phenomenon__Group__0 ) ) ;
    public final void rulePhenomenon() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:131:2: ( ( ( rule__Phenomenon__Group__0 ) ) )
            // InternalProblem.g:132:1: ( ( rule__Phenomenon__Group__0 ) )
            {
            // InternalProblem.g:132:1: ( ( rule__Phenomenon__Group__0 ) )
            // InternalProblem.g:133:1: ( rule__Phenomenon__Group__0 )
            {
             before(grammarAccess.getPhenomenonAccess().getGroup()); 
            // InternalProblem.g:134:1: ( rule__Phenomenon__Group__0 )
            // InternalProblem.g:134:2: rule__Phenomenon__Group__0
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


    // $ANTLR start "entryRuleConstraint"
    // InternalProblem.g:146:1: entryRuleConstraint : ruleConstraint EOF ;
    public final void entryRuleConstraint() throws RecognitionException {
        try {
            // InternalProblem.g:147:1: ( ruleConstraint EOF )
            // InternalProblem.g:148:1: ruleConstraint EOF
            {
             before(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_1);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getConstraintRule()); 
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
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // InternalProblem.g:155:1: ruleConstraint : ( ( rule__Constraint__Group__0 ) ) ;
    public final void ruleConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:159:2: ( ( ( rule__Constraint__Group__0 ) ) )
            // InternalProblem.g:160:1: ( ( rule__Constraint__Group__0 ) )
            {
            // InternalProblem.g:160:1: ( ( rule__Constraint__Group__0 ) )
            // InternalProblem.g:161:1: ( rule__Constraint__Group__0 )
            {
             before(grammarAccess.getConstraintAccess().getGroup()); 
            // InternalProblem.g:162:1: ( rule__Constraint__Group__0 )
            // InternalProblem.g:162:2: rule__Constraint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleLink"
    // InternalProblem.g:174:1: entryRuleLink : ruleLink EOF ;
    public final void entryRuleLink() throws RecognitionException {
        try {
            // InternalProblem.g:175:1: ( ruleLink EOF )
            // InternalProblem.g:176:1: ruleLink EOF
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
    // InternalProblem.g:183:1: ruleLink : ( ( rule__Link__Group__0 ) ) ;
    public final void ruleLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:187:2: ( ( ( rule__Link__Group__0 ) ) )
            // InternalProblem.g:188:1: ( ( rule__Link__Group__0 ) )
            {
            // InternalProblem.g:188:1: ( ( rule__Link__Group__0 ) )
            // InternalProblem.g:189:1: ( rule__Link__Group__0 )
            {
             before(grammarAccess.getLinkAccess().getGroup()); 
            // InternalProblem.g:190:1: ( rule__Link__Group__0 )
            // InternalProblem.g:190:2: rule__Link__Group__0
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
    // InternalProblem.g:203:1: ruleNodeType : ( ( rule__NodeType__Alternatives ) ) ;
    public final void ruleNodeType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:207:1: ( ( ( rule__NodeType__Alternatives ) ) )
            // InternalProblem.g:208:1: ( ( rule__NodeType__Alternatives ) )
            {
            // InternalProblem.g:208:1: ( ( rule__NodeType__Alternatives ) )
            // InternalProblem.g:209:1: ( rule__NodeType__Alternatives )
            {
             before(grammarAccess.getNodeTypeAccess().getAlternatives()); 
            // InternalProblem.g:210:1: ( rule__NodeType__Alternatives )
            // InternalProblem.g:210:2: rule__NodeType__Alternatives
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
    // InternalProblem.g:222:1: rulePhenomenonType : ( ( rule__PhenomenonType__Alternatives ) ) ;
    public final void rulePhenomenonType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:226:1: ( ( ( rule__PhenomenonType__Alternatives ) ) )
            // InternalProblem.g:227:1: ( ( rule__PhenomenonType__Alternatives ) )
            {
            // InternalProblem.g:227:1: ( ( rule__PhenomenonType__Alternatives ) )
            // InternalProblem.g:228:1: ( rule__PhenomenonType__Alternatives )
            {
             before(grammarAccess.getPhenomenonTypeAccess().getAlternatives()); 
            // InternalProblem.g:229:1: ( rule__PhenomenonType__Alternatives )
            // InternalProblem.g:229:2: rule__PhenomenonType__Alternatives
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


    // $ANTLR start "ruleConstraintType"
    // InternalProblem.g:241:1: ruleConstraintType : ( ( rule__ConstraintType__Alternatives ) ) ;
    public final void ruleConstraintType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:245:1: ( ( ( rule__ConstraintType__Alternatives ) ) )
            // InternalProblem.g:246:1: ( ( rule__ConstraintType__Alternatives ) )
            {
            // InternalProblem.g:246:1: ( ( rule__ConstraintType__Alternatives ) )
            // InternalProblem.g:247:1: ( rule__ConstraintType__Alternatives )
            {
             before(grammarAccess.getConstraintTypeAccess().getAlternatives()); 
            // InternalProblem.g:248:1: ( rule__ConstraintType__Alternatives )
            // InternalProblem.g:248:2: rule__ConstraintType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ConstraintType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConstraintTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstraintType"


    // $ANTLR start "ruleLinkType"
    // InternalProblem.g:260:1: ruleLinkType : ( ( rule__LinkType__Alternatives ) ) ;
    public final void ruleLinkType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:264:1: ( ( ( rule__LinkType__Alternatives ) ) )
            // InternalProblem.g:265:1: ( ( rule__LinkType__Alternatives ) )
            {
            // InternalProblem.g:265:1: ( ( rule__LinkType__Alternatives ) )
            // InternalProblem.g:266:1: ( rule__LinkType__Alternatives )
            {
             before(grammarAccess.getLinkTypeAccess().getAlternatives()); 
            // InternalProblem.g:267:1: ( rule__LinkType__Alternatives )
            // InternalProblem.g:267:2: rule__LinkType__Alternatives
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
    // InternalProblem.g:278:1: rule__ProblemDiagram__Alternatives_3 : ( ( ( rule__ProblemDiagram__NodesAssignment_3_0 ) ) | ( ( rule__ProblemDiagram__LinksAssignment_3_1 ) ) );
    public final void rule__ProblemDiagram__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:282:1: ( ( ( rule__ProblemDiagram__NodesAssignment_3_0 ) ) | ( ( rule__ProblemDiagram__LinksAssignment_3_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                int LA1_1 = input.LA(2);

                if ( ((LA1_1>=26 && LA1_1<=30)) ) {
                    alt1=2;
                }
                else if ( (LA1_1==EOF||(LA1_1>=RULE_ID && LA1_1<=RULE_STRING)||(LA1_1>=12 && LA1_1<=19)||LA1_1==31||(LA1_1>=33 && LA1_1<=35)||LA1_1==38) ) {
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
                    // InternalProblem.g:283:1: ( ( rule__ProblemDiagram__NodesAssignment_3_0 ) )
                    {
                    // InternalProblem.g:283:1: ( ( rule__ProblemDiagram__NodesAssignment_3_0 ) )
                    // InternalProblem.g:284:1: ( rule__ProblemDiagram__NodesAssignment_3_0 )
                    {
                     before(grammarAccess.getProblemDiagramAccess().getNodesAssignment_3_0()); 
                    // InternalProblem.g:285:1: ( rule__ProblemDiagram__NodesAssignment_3_0 )
                    // InternalProblem.g:285:2: rule__ProblemDiagram__NodesAssignment_3_0
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
                    // InternalProblem.g:289:6: ( ( rule__ProblemDiagram__LinksAssignment_3_1 ) )
                    {
                    // InternalProblem.g:289:6: ( ( rule__ProblemDiagram__LinksAssignment_3_1 ) )
                    // InternalProblem.g:290:1: ( rule__ProblemDiagram__LinksAssignment_3_1 )
                    {
                     before(grammarAccess.getProblemDiagramAccess().getLinksAssignment_3_1()); 
                    // InternalProblem.g:291:1: ( rule__ProblemDiagram__LinksAssignment_3_1 )
                    // InternalProblem.g:291:2: rule__ProblemDiagram__LinksAssignment_3_1
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


    // $ANTLR start "rule__Node__Alternatives_3_3"
    // InternalProblem.g:301:1: rule__Node__Alternatives_3_3 : ( ( ( rule__Node__SubproblemAssignment_3_3_0 ) ) | ( ( rule__Node__Group_3_3_1__0 ) ) | ( ( rule__Node__Group_3_3_2__0 ) ) | ( ( rule__Node__Group_3_3_3__0 ) ) );
    public final void rule__Node__Alternatives_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:305:1: ( ( ( rule__Node__SubproblemAssignment_3_3_0 ) ) | ( ( rule__Node__Group_3_3_1__0 ) ) | ( ( rule__Node__Group_3_3_2__0 ) ) | ( ( rule__Node__Group_3_3_3__0 ) ) )
            int alt2=4;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==31) ) {
                alt2=1;
            }
            else if ( (LA2_0==38) ) {
                switch ( input.LA(2) ) {
                case RULE_STRING:
                    {
                    alt2=4;
                    }
                    break;
                case 39:
                    {
                    alt2=2;
                    }
                    break;
                case 40:
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
                    // InternalProblem.g:306:1: ( ( rule__Node__SubproblemAssignment_3_3_0 ) )
                    {
                    // InternalProblem.g:306:1: ( ( rule__Node__SubproblemAssignment_3_3_0 ) )
                    // InternalProblem.g:307:1: ( rule__Node__SubproblemAssignment_3_3_0 )
                    {
                     before(grammarAccess.getNodeAccess().getSubproblemAssignment_3_3_0()); 
                    // InternalProblem.g:308:1: ( rule__Node__SubproblemAssignment_3_3_0 )
                    // InternalProblem.g:308:2: rule__Node__SubproblemAssignment_3_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Node__SubproblemAssignment_3_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNodeAccess().getSubproblemAssignment_3_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:312:6: ( ( rule__Node__Group_3_3_1__0 ) )
                    {
                    // InternalProblem.g:312:6: ( ( rule__Node__Group_3_3_1__0 ) )
                    // InternalProblem.g:313:1: ( rule__Node__Group_3_3_1__0 )
                    {
                     before(grammarAccess.getNodeAccess().getGroup_3_3_1()); 
                    // InternalProblem.g:314:1: ( rule__Node__Group_3_3_1__0 )
                    // InternalProblem.g:314:2: rule__Node__Group_3_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Node__Group_3_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNodeAccess().getGroup_3_3_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalProblem.g:318:6: ( ( rule__Node__Group_3_3_2__0 ) )
                    {
                    // InternalProblem.g:318:6: ( ( rule__Node__Group_3_3_2__0 ) )
                    // InternalProblem.g:319:1: ( rule__Node__Group_3_3_2__0 )
                    {
                     before(grammarAccess.getNodeAccess().getGroup_3_3_2()); 
                    // InternalProblem.g:320:1: ( rule__Node__Group_3_3_2__0 )
                    // InternalProblem.g:320:2: rule__Node__Group_3_3_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Node__Group_3_3_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNodeAccess().getGroup_3_3_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalProblem.g:324:6: ( ( rule__Node__Group_3_3_3__0 ) )
                    {
                    // InternalProblem.g:324:6: ( ( rule__Node__Group_3_3_3__0 ) )
                    // InternalProblem.g:325:1: ( rule__Node__Group_3_3_3__0 )
                    {
                     before(grammarAccess.getNodeAccess().getGroup_3_3_3()); 
                    // InternalProblem.g:326:1: ( rule__Node__Group_3_3_3__0 )
                    // InternalProblem.g:326:2: rule__Node__Group_3_3_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Node__Group_3_3_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNodeAccess().getGroup_3_3_3()); 

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
    // $ANTLR end "rule__Node__Alternatives_3_3"


    // $ANTLR start "rule__NodeType__Alternatives"
    // InternalProblem.g:335:1: rule__NodeType__Alternatives : ( ( ( 'R' ) ) | ( ( 'M' ) ) | ( ( 'B' ) ) | ( ( 'X' ) ) | ( ( 'C' ) ) | ( ( 'D' ) ) | ( ( 'P' ) ) | ( ( '?' ) ) );
    public final void rule__NodeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:339:1: ( ( ( 'R' ) ) | ( ( 'M' ) ) | ( ( 'B' ) ) | ( ( 'X' ) ) | ( ( 'C' ) ) | ( ( 'D' ) ) | ( ( 'P' ) ) | ( ( '?' ) ) )
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
                    // InternalProblem.g:340:1: ( ( 'R' ) )
                    {
                    // InternalProblem.g:340:1: ( ( 'R' ) )
                    // InternalProblem.g:341:1: ( 'R' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getREQUIREMENTEnumLiteralDeclaration_0()); 
                    // InternalProblem.g:342:1: ( 'R' )
                    // InternalProblem.g:342:3: 'R'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getREQUIREMENTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:347:6: ( ( 'M' ) )
                    {
                    // InternalProblem.g:347:6: ( ( 'M' ) )
                    // InternalProblem.g:348:1: ( 'M' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getMACHINEEnumLiteralDeclaration_1()); 
                    // InternalProblem.g:349:1: ( 'M' )
                    // InternalProblem.g:349:3: 'M'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getMACHINEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalProblem.g:354:6: ( ( 'B' ) )
                    {
                    // InternalProblem.g:354:6: ( ( 'B' ) )
                    // InternalProblem.g:355:1: ( 'B' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getBIDDABLEEnumLiteralDeclaration_2()); 
                    // InternalProblem.g:356:1: ( 'B' )
                    // InternalProblem.g:356:3: 'B'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getBIDDABLEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalProblem.g:361:6: ( ( 'X' ) )
                    {
                    // InternalProblem.g:361:6: ( ( 'X' ) )
                    // InternalProblem.g:362:1: ( 'X' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getLEXICALEnumLiteralDeclaration_3()); 
                    // InternalProblem.g:363:1: ( 'X' )
                    // InternalProblem.g:363:3: 'X'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getLEXICALEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalProblem.g:368:6: ( ( 'C' ) )
                    {
                    // InternalProblem.g:368:6: ( ( 'C' ) )
                    // InternalProblem.g:369:1: ( 'C' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getCAUSALEnumLiteralDeclaration_4()); 
                    // InternalProblem.g:370:1: ( 'C' )
                    // InternalProblem.g:370:3: 'C'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getCAUSALEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalProblem.g:375:6: ( ( 'D' ) )
                    {
                    // InternalProblem.g:375:6: ( ( 'D' ) )
                    // InternalProblem.g:376:1: ( 'D' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getDESIGNEDEnumLiteralDeclaration_5()); 
                    // InternalProblem.g:377:1: ( 'D' )
                    // InternalProblem.g:377:3: 'D'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getDESIGNEDEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalProblem.g:382:6: ( ( 'P' ) )
                    {
                    // InternalProblem.g:382:6: ( ( 'P' ) )
                    // InternalProblem.g:383:1: ( 'P' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getPHYSICALEnumLiteralDeclaration_6()); 
                    // InternalProblem.g:384:1: ( 'P' )
                    // InternalProblem.g:384:3: 'P'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getPHYSICALEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalProblem.g:389:6: ( ( '?' ) )
                    {
                    // InternalProblem.g:389:6: ( ( '?' ) )
                    // InternalProblem.g:390:1: ( '?' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getCONCERNEnumLiteralDeclaration_7()); 
                    // InternalProblem.g:391:1: ( '?' )
                    // InternalProblem.g:391:3: '?'
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
    // InternalProblem.g:401:1: rule__PhenomenonType__Alternatives : ( ( ( 'phenomenon' ) ) | ( ( 'event' ) ) | ( ( 'state' ) ) );
    public final void rule__PhenomenonType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:405:1: ( ( ( 'phenomenon' ) ) | ( ( 'event' ) ) | ( ( 'state' ) ) )
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
                    // InternalProblem.g:406:1: ( ( 'phenomenon' ) )
                    {
                    // InternalProblem.g:406:1: ( ( 'phenomenon' ) )
                    // InternalProblem.g:407:1: ( 'phenomenon' )
                    {
                     before(grammarAccess.getPhenomenonTypeAccess().getUNSPECIFIEDEnumLiteralDeclaration_0()); 
                    // InternalProblem.g:408:1: ( 'phenomenon' )
                    // InternalProblem.g:408:3: 'phenomenon'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getPhenomenonTypeAccess().getUNSPECIFIEDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:413:6: ( ( 'event' ) )
                    {
                    // InternalProblem.g:413:6: ( ( 'event' ) )
                    // InternalProblem.g:414:1: ( 'event' )
                    {
                     before(grammarAccess.getPhenomenonTypeAccess().getEVENTEnumLiteralDeclaration_1()); 
                    // InternalProblem.g:415:1: ( 'event' )
                    // InternalProblem.g:415:3: 'event'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getPhenomenonTypeAccess().getEVENTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalProblem.g:420:6: ( ( 'state' ) )
                    {
                    // InternalProblem.g:420:6: ( ( 'state' ) )
                    // InternalProblem.g:421:1: ( 'state' )
                    {
                     before(grammarAccess.getPhenomenonTypeAccess().getSTATEEnumLiteralDeclaration_2()); 
                    // InternalProblem.g:422:1: ( 'state' )
                    // InternalProblem.g:422:3: 'state'
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


    // $ANTLR start "rule__ConstraintType__Alternatives"
    // InternalProblem.g:432:1: rule__ConstraintType__Alternatives : ( ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '~' ) ) );
    public final void rule__ConstraintType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:436:1: ( ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '~' ) ) )
            int alt5=3;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalProblem.g:437:1: ( ( '<' ) )
                    {
                    // InternalProblem.g:437:1: ( ( '<' ) )
                    // InternalProblem.g:438:1: ( '<' )
                    {
                     before(grammarAccess.getConstraintTypeAccess().getStrictPreEnumLiteralDeclaration_0()); 
                    // InternalProblem.g:439:1: ( '<' )
                    // InternalProblem.g:439:3: '<'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getConstraintTypeAccess().getStrictPreEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:444:6: ( ( '<=' ) )
                    {
                    // InternalProblem.g:444:6: ( ( '<=' ) )
                    // InternalProblem.g:445:1: ( '<=' )
                    {
                     before(grammarAccess.getConstraintTypeAccess().getCauseEnumLiteralDeclaration_1()); 
                    // InternalProblem.g:446:1: ( '<=' )
                    // InternalProblem.g:446:3: '<='
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getConstraintTypeAccess().getCauseEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalProblem.g:451:6: ( ( '~' ) )
                    {
                    // InternalProblem.g:451:6: ( ( '~' ) )
                    // InternalProblem.g:452:1: ( '~' )
                    {
                     before(grammarAccess.getConstraintTypeAccess().getAlternateEnumLiteralDeclaration_2()); 
                    // InternalProblem.g:453:1: ( '~' )
                    // InternalProblem.g:453:3: '~'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getConstraintTypeAccess().getAlternateEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__ConstraintType__Alternatives"


    // $ANTLR start "rule__LinkType__Alternatives"
    // InternalProblem.g:463:1: rule__LinkType__Alternatives : ( ( ( '--' ) ) | ( ( '~~' ) ) | ( ( '<~' ) ) | ( ( '->' ) ) | ( ( '~>' ) ) );
    public final void rule__LinkType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:467:1: ( ( ( '--' ) ) | ( ( '~~' ) ) | ( ( '<~' ) ) | ( ( '->' ) ) | ( ( '~>' ) ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt6=1;
                }
                break;
            case 27:
                {
                alt6=2;
                }
                break;
            case 28:
                {
                alt6=3;
                }
                break;
            case 29:
                {
                alt6=4;
                }
                break;
            case 30:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalProblem.g:468:1: ( ( '--' ) )
                    {
                    // InternalProblem.g:468:1: ( ( '--' ) )
                    // InternalProblem.g:469:1: ( '--' )
                    {
                     before(grammarAccess.getLinkTypeAccess().getINTERFACEEnumLiteralDeclaration_0()); 
                    // InternalProblem.g:470:1: ( '--' )
                    // InternalProblem.g:470:3: '--'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getLinkTypeAccess().getINTERFACEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:475:6: ( ( '~~' ) )
                    {
                    // InternalProblem.g:475:6: ( ( '~~' ) )
                    // InternalProblem.g:476:1: ( '~~' )
                    {
                     before(grammarAccess.getLinkTypeAccess().getREFERENCEEnumLiteralDeclaration_1()); 
                    // InternalProblem.g:477:1: ( '~~' )
                    // InternalProblem.g:477:3: '~~'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getLinkTypeAccess().getREFERENCEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalProblem.g:482:6: ( ( '<~' ) )
                    {
                    // InternalProblem.g:482:6: ( ( '<~' ) )
                    // InternalProblem.g:483:1: ( '<~' )
                    {
                     before(grammarAccess.getLinkTypeAccess().getCONSTRAINTEnumLiteralDeclaration_2()); 
                    // InternalProblem.g:484:1: ( '<~' )
                    // InternalProblem.g:484:3: '<~'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getLinkTypeAccess().getCONSTRAINTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalProblem.g:489:6: ( ( '->' ) )
                    {
                    // InternalProblem.g:489:6: ( ( '->' ) )
                    // InternalProblem.g:490:1: ( '->' )
                    {
                     before(grammarAccess.getLinkTypeAccess().getCONCERNEnumLiteralDeclaration_3()); 
                    // InternalProblem.g:491:1: ( '->' )
                    // InternalProblem.g:491:3: '->'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getLinkTypeAccess().getCONCERNEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalProblem.g:496:6: ( ( '~>' ) )
                    {
                    // InternalProblem.g:496:6: ( ( '~>' ) )
                    // InternalProblem.g:497:1: ( '~>' )
                    {
                     before(grammarAccess.getLinkTypeAccess().getINV_CONSTRAINTEnumLiteralDeclaration_4()); 
                    // InternalProblem.g:498:1: ( '~>' )
                    // InternalProblem.g:498:3: '~>'
                    {
                    match(input,30,FOLLOW_2); 

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
    // InternalProblem.g:510:1: rule__ProblemDiagram__Group__0 : rule__ProblemDiagram__Group__0__Impl rule__ProblemDiagram__Group__1 ;
    public final void rule__ProblemDiagram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:514:1: ( rule__ProblemDiagram__Group__0__Impl rule__ProblemDiagram__Group__1 )
            // InternalProblem.g:515:2: rule__ProblemDiagram__Group__0__Impl rule__ProblemDiagram__Group__1
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
    // InternalProblem.g:522:1: rule__ProblemDiagram__Group__0__Impl : ( 'problem:' ) ;
    public final void rule__ProblemDiagram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:526:1: ( ( 'problem:' ) )
            // InternalProblem.g:527:1: ( 'problem:' )
            {
            // InternalProblem.g:527:1: ( 'problem:' )
            // InternalProblem.g:528:1: 'problem:'
            {
             before(grammarAccess.getProblemDiagramAccess().getProblemKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalProblem.g:541:1: rule__ProblemDiagram__Group__1 : rule__ProblemDiagram__Group__1__Impl rule__ProblemDiagram__Group__2 ;
    public final void rule__ProblemDiagram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:545:1: ( rule__ProblemDiagram__Group__1__Impl rule__ProblemDiagram__Group__2 )
            // InternalProblem.g:546:2: rule__ProblemDiagram__Group__1__Impl rule__ProblemDiagram__Group__2
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
    // InternalProblem.g:553:1: rule__ProblemDiagram__Group__1__Impl : ( ( rule__ProblemDiagram__NameAssignment_1 ) ) ;
    public final void rule__ProblemDiagram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:557:1: ( ( ( rule__ProblemDiagram__NameAssignment_1 ) ) )
            // InternalProblem.g:558:1: ( ( rule__ProblemDiagram__NameAssignment_1 ) )
            {
            // InternalProblem.g:558:1: ( ( rule__ProblemDiagram__NameAssignment_1 ) )
            // InternalProblem.g:559:1: ( rule__ProblemDiagram__NameAssignment_1 )
            {
             before(grammarAccess.getProblemDiagramAccess().getNameAssignment_1()); 
            // InternalProblem.g:560:1: ( rule__ProblemDiagram__NameAssignment_1 )
            // InternalProblem.g:560:2: rule__ProblemDiagram__NameAssignment_1
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
    // InternalProblem.g:570:1: rule__ProblemDiagram__Group__2 : rule__ProblemDiagram__Group__2__Impl rule__ProblemDiagram__Group__3 ;
    public final void rule__ProblemDiagram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:574:1: ( rule__ProblemDiagram__Group__2__Impl rule__ProblemDiagram__Group__3 )
            // InternalProblem.g:575:2: rule__ProblemDiagram__Group__2__Impl rule__ProblemDiagram__Group__3
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
    // InternalProblem.g:582:1: rule__ProblemDiagram__Group__2__Impl : ( ( rule__ProblemDiagram__Group_2__0 )? ) ;
    public final void rule__ProblemDiagram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:586:1: ( ( ( rule__ProblemDiagram__Group_2__0 )? ) )
            // InternalProblem.g:587:1: ( ( rule__ProblemDiagram__Group_2__0 )? )
            {
            // InternalProblem.g:587:1: ( ( rule__ProblemDiagram__Group_2__0 )? )
            // InternalProblem.g:588:1: ( rule__ProblemDiagram__Group_2__0 )?
            {
             before(grammarAccess.getProblemDiagramAccess().getGroup_2()); 
            // InternalProblem.g:589:1: ( rule__ProblemDiagram__Group_2__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==32) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalProblem.g:589:2: rule__ProblemDiagram__Group_2__0
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
    // InternalProblem.g:599:1: rule__ProblemDiagram__Group__3 : rule__ProblemDiagram__Group__3__Impl ;
    public final void rule__ProblemDiagram__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:603:1: ( rule__ProblemDiagram__Group__3__Impl )
            // InternalProblem.g:604:2: rule__ProblemDiagram__Group__3__Impl
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
    // InternalProblem.g:610:1: rule__ProblemDiagram__Group__3__Impl : ( ( rule__ProblemDiagram__Alternatives_3 )* ) ;
    public final void rule__ProblemDiagram__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:614:1: ( ( ( rule__ProblemDiagram__Alternatives_3 )* ) )
            // InternalProblem.g:615:1: ( ( rule__ProblemDiagram__Alternatives_3 )* )
            {
            // InternalProblem.g:615:1: ( ( rule__ProblemDiagram__Alternatives_3 )* )
            // InternalProblem.g:616:1: ( rule__ProblemDiagram__Alternatives_3 )*
            {
             before(grammarAccess.getProblemDiagramAccess().getAlternatives_3()); 
            // InternalProblem.g:617:1: ( rule__ProblemDiagram__Alternatives_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalProblem.g:617:2: rule__ProblemDiagram__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__ProblemDiagram__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalProblem.g:635:1: rule__ProblemDiagram__Group_2__0 : rule__ProblemDiagram__Group_2__0__Impl rule__ProblemDiagram__Group_2__1 ;
    public final void rule__ProblemDiagram__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:639:1: ( rule__ProblemDiagram__Group_2__0__Impl rule__ProblemDiagram__Group_2__1 )
            // InternalProblem.g:640:2: rule__ProblemDiagram__Group_2__0__Impl rule__ProblemDiagram__Group_2__1
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
    // InternalProblem.g:647:1: rule__ProblemDiagram__Group_2__0__Impl : ( 'for' ) ;
    public final void rule__ProblemDiagram__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:651:1: ( ( 'for' ) )
            // InternalProblem.g:652:1: ( 'for' )
            {
            // InternalProblem.g:652:1: ( 'for' )
            // InternalProblem.g:653:1: 'for'
            {
             before(grammarAccess.getProblemDiagramAccess().getForKeyword_2_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalProblem.g:666:1: rule__ProblemDiagram__Group_2__1 : rule__ProblemDiagram__Group_2__1__Impl ;
    public final void rule__ProblemDiagram__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:670:1: ( rule__ProblemDiagram__Group_2__1__Impl )
            // InternalProblem.g:671:2: rule__ProblemDiagram__Group_2__1__Impl
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
    // InternalProblem.g:677:1: rule__ProblemDiagram__Group_2__1__Impl : ( ( rule__ProblemDiagram__HighlightAssignment_2_1 ) ) ;
    public final void rule__ProblemDiagram__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:681:1: ( ( ( rule__ProblemDiagram__HighlightAssignment_2_1 ) ) )
            // InternalProblem.g:682:1: ( ( rule__ProblemDiagram__HighlightAssignment_2_1 ) )
            {
            // InternalProblem.g:682:1: ( ( rule__ProblemDiagram__HighlightAssignment_2_1 ) )
            // InternalProblem.g:683:1: ( rule__ProblemDiagram__HighlightAssignment_2_1 )
            {
             before(grammarAccess.getProblemDiagramAccess().getHighlightAssignment_2_1()); 
            // InternalProblem.g:684:1: ( rule__ProblemDiagram__HighlightAssignment_2_1 )
            // InternalProblem.g:684:2: rule__ProblemDiagram__HighlightAssignment_2_1
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
    // InternalProblem.g:698:1: rule__Node__Group__0 : rule__Node__Group__0__Impl rule__Node__Group__1 ;
    public final void rule__Node__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:702:1: ( rule__Node__Group__0__Impl rule__Node__Group__1 )
            // InternalProblem.g:703:2: rule__Node__Group__0__Impl rule__Node__Group__1
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
    // InternalProblem.g:710:1: rule__Node__Group__0__Impl : ( ( rule__Node__NameAssignment_0 ) ) ;
    public final void rule__Node__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:714:1: ( ( ( rule__Node__NameAssignment_0 ) ) )
            // InternalProblem.g:715:1: ( ( rule__Node__NameAssignment_0 ) )
            {
            // InternalProblem.g:715:1: ( ( rule__Node__NameAssignment_0 ) )
            // InternalProblem.g:716:1: ( rule__Node__NameAssignment_0 )
            {
             before(grammarAccess.getNodeAccess().getNameAssignment_0()); 
            // InternalProblem.g:717:1: ( rule__Node__NameAssignment_0 )
            // InternalProblem.g:717:2: rule__Node__NameAssignment_0
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
    // InternalProblem.g:727:1: rule__Node__Group__1 : rule__Node__Group__1__Impl rule__Node__Group__2 ;
    public final void rule__Node__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:731:1: ( rule__Node__Group__1__Impl rule__Node__Group__2 )
            // InternalProblem.g:732:2: rule__Node__Group__1__Impl rule__Node__Group__2
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
    // InternalProblem.g:739:1: rule__Node__Group__1__Impl : ( ( rule__Node__TypeAssignment_1 )? ) ;
    public final void rule__Node__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:743:1: ( ( ( rule__Node__TypeAssignment_1 )? ) )
            // InternalProblem.g:744:1: ( ( rule__Node__TypeAssignment_1 )? )
            {
            // InternalProblem.g:744:1: ( ( rule__Node__TypeAssignment_1 )? )
            // InternalProblem.g:745:1: ( rule__Node__TypeAssignment_1 )?
            {
             before(grammarAccess.getNodeAccess().getTypeAssignment_1()); 
            // InternalProblem.g:746:1: ( rule__Node__TypeAssignment_1 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=12 && LA9_0<=19)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalProblem.g:746:2: rule__Node__TypeAssignment_1
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
    // InternalProblem.g:756:1: rule__Node__Group__2 : rule__Node__Group__2__Impl rule__Node__Group__3 ;
    public final void rule__Node__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:760:1: ( rule__Node__Group__2__Impl rule__Node__Group__3 )
            // InternalProblem.g:761:2: rule__Node__Group__2__Impl rule__Node__Group__3
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
    // InternalProblem.g:768:1: rule__Node__Group__2__Impl : ( ( rule__Node__Group_2__0 )? ) ;
    public final void rule__Node__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:772:1: ( ( ( rule__Node__Group_2__0 )? ) )
            // InternalProblem.g:773:1: ( ( rule__Node__Group_2__0 )? )
            {
            // InternalProblem.g:773:1: ( ( rule__Node__Group_2__0 )? )
            // InternalProblem.g:774:1: ( rule__Node__Group_2__0 )?
            {
             before(grammarAccess.getNodeAccess().getGroup_2()); 
            // InternalProblem.g:775:1: ( rule__Node__Group_2__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING||LA10_0==33) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalProblem.g:775:2: rule__Node__Group_2__0
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
    // InternalProblem.g:785:1: rule__Node__Group__3 : rule__Node__Group__3__Impl ;
    public final void rule__Node__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:789:1: ( rule__Node__Group__3__Impl )
            // InternalProblem.g:790:2: rule__Node__Group__3__Impl
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
    // InternalProblem.g:796:1: rule__Node__Group__3__Impl : ( ( rule__Node__Group_3__0 )? ) ;
    public final void rule__Node__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:800:1: ( ( ( rule__Node__Group_3__0 )? ) )
            // InternalProblem.g:801:1: ( ( rule__Node__Group_3__0 )? )
            {
            // InternalProblem.g:801:1: ( ( rule__Node__Group_3__0 )? )
            // InternalProblem.g:802:1: ( rule__Node__Group_3__0 )?
            {
             before(grammarAccess.getNodeAccess().getGroup_3()); 
            // InternalProblem.g:803:1: ( rule__Node__Group_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==34) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalProblem.g:803:2: rule__Node__Group_3__0
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
    // InternalProblem.g:821:1: rule__Node__Group_2__0 : rule__Node__Group_2__0__Impl rule__Node__Group_2__1 ;
    public final void rule__Node__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:825:1: ( rule__Node__Group_2__0__Impl rule__Node__Group_2__1 )
            // InternalProblem.g:826:2: rule__Node__Group_2__0__Impl rule__Node__Group_2__1
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
    // InternalProblem.g:833:1: rule__Node__Group_2__0__Impl : ( ( ':' )? ) ;
    public final void rule__Node__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:837:1: ( ( ( ':' )? ) )
            // InternalProblem.g:838:1: ( ( ':' )? )
            {
            // InternalProblem.g:838:1: ( ( ':' )? )
            // InternalProblem.g:839:1: ( ':' )?
            {
             before(grammarAccess.getNodeAccess().getColonKeyword_2_0()); 
            // InternalProblem.g:840:1: ( ':' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==33) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalProblem.g:841:2: ':'
                    {
                    match(input,33,FOLLOW_2); 

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
    // InternalProblem.g:852:1: rule__Node__Group_2__1 : rule__Node__Group_2__1__Impl ;
    public final void rule__Node__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:856:1: ( rule__Node__Group_2__1__Impl )
            // InternalProblem.g:857:2: rule__Node__Group_2__1__Impl
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
    // InternalProblem.g:863:1: rule__Node__Group_2__1__Impl : ( ( rule__Node__DescriptionAssignment_2_1 ) ) ;
    public final void rule__Node__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:867:1: ( ( ( rule__Node__DescriptionAssignment_2_1 ) ) )
            // InternalProblem.g:868:1: ( ( rule__Node__DescriptionAssignment_2_1 ) )
            {
            // InternalProblem.g:868:1: ( ( rule__Node__DescriptionAssignment_2_1 ) )
            // InternalProblem.g:869:1: ( rule__Node__DescriptionAssignment_2_1 )
            {
             before(grammarAccess.getNodeAccess().getDescriptionAssignment_2_1()); 
            // InternalProblem.g:870:1: ( rule__Node__DescriptionAssignment_2_1 )
            // InternalProblem.g:870:2: rule__Node__DescriptionAssignment_2_1
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
    // InternalProblem.g:884:1: rule__Node__Group_3__0 : rule__Node__Group_3__0__Impl rule__Node__Group_3__1 ;
    public final void rule__Node__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:888:1: ( rule__Node__Group_3__0__Impl rule__Node__Group_3__1 )
            // InternalProblem.g:889:2: rule__Node__Group_3__0__Impl rule__Node__Group_3__1
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
    // InternalProblem.g:896:1: rule__Node__Group_3__0__Impl : ( '{' ) ;
    public final void rule__Node__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:900:1: ( ( '{' ) )
            // InternalProblem.g:901:1: ( '{' )
            {
            // InternalProblem.g:901:1: ( '{' )
            // InternalProblem.g:902:1: '{'
            {
             before(grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalProblem.g:915:1: rule__Node__Group_3__1 : rule__Node__Group_3__1__Impl rule__Node__Group_3__2 ;
    public final void rule__Node__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:919:1: ( rule__Node__Group_3__1__Impl rule__Node__Group_3__2 )
            // InternalProblem.g:920:2: rule__Node__Group_3__1__Impl rule__Node__Group_3__2
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
    // InternalProblem.g:927:1: rule__Node__Group_3__1__Impl : ( ( rule__Node__Group_3_1__0 )? ) ;
    public final void rule__Node__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:931:1: ( ( ( rule__Node__Group_3_1__0 )? ) )
            // InternalProblem.g:932:1: ( ( rule__Node__Group_3_1__0 )? )
            {
            // InternalProblem.g:932:1: ( ( rule__Node__Group_3_1__0 )? )
            // InternalProblem.g:933:1: ( rule__Node__Group_3_1__0 )?
            {
             before(grammarAccess.getNodeAccess().getGroup_3_1()); 
            // InternalProblem.g:934:1: ( rule__Node__Group_3_1__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID||(LA13_0>=20 && LA13_0<=22)||LA13_0==43) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalProblem.g:934:2: rule__Node__Group_3_1__0
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
    // InternalProblem.g:944:1: rule__Node__Group_3__2 : rule__Node__Group_3__2__Impl rule__Node__Group_3__3 ;
    public final void rule__Node__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:948:1: ( rule__Node__Group_3__2__Impl rule__Node__Group_3__3 )
            // InternalProblem.g:949:2: rule__Node__Group_3__2__Impl rule__Node__Group_3__3
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
    // InternalProblem.g:956:1: rule__Node__Group_3__2__Impl : ( ( rule__Node__Group_3_2__0 )? ) ;
    public final void rule__Node__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:960:1: ( ( ( rule__Node__Group_3_2__0 )? ) )
            // InternalProblem.g:961:1: ( ( rule__Node__Group_3_2__0 )? )
            {
            // InternalProblem.g:961:1: ( ( rule__Node__Group_3_2__0 )? )
            // InternalProblem.g:962:1: ( rule__Node__Group_3_2__0 )?
            {
             before(grammarAccess.getNodeAccess().getGroup_3_2()); 
            // InternalProblem.g:963:1: ( rule__Node__Group_3_2__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=23 && LA14_0<=25)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalProblem.g:963:2: rule__Node__Group_3_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Node__Group_3_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNodeAccess().getGroup_3_2()); 

            }


            }

        }
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
    // InternalProblem.g:973:1: rule__Node__Group_3__3 : rule__Node__Group_3__3__Impl rule__Node__Group_3__4 ;
    public final void rule__Node__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:977:1: ( rule__Node__Group_3__3__Impl rule__Node__Group_3__4 )
            // InternalProblem.g:978:2: rule__Node__Group_3__3__Impl rule__Node__Group_3__4
            {
            pushFollow(FOLLOW_8);
            rule__Node__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group_3__4();

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
    // InternalProblem.g:985:1: rule__Node__Group_3__3__Impl : ( ( rule__Node__Alternatives_3_3 )* ) ;
    public final void rule__Node__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:989:1: ( ( ( rule__Node__Alternatives_3_3 )* ) )
            // InternalProblem.g:990:1: ( ( rule__Node__Alternatives_3_3 )* )
            {
            // InternalProblem.g:990:1: ( ( rule__Node__Alternatives_3_3 )* )
            // InternalProblem.g:991:1: ( rule__Node__Alternatives_3_3 )*
            {
             before(grammarAccess.getNodeAccess().getAlternatives_3_3()); 
            // InternalProblem.g:992:1: ( rule__Node__Alternatives_3_3 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==31||LA15_0==38) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalProblem.g:992:2: rule__Node__Alternatives_3_3
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Node__Alternatives_3_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getNodeAccess().getAlternatives_3_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Node__Group_3__4"
    // InternalProblem.g:1002:1: rule__Node__Group_3__4 : rule__Node__Group_3__4__Impl ;
    public final void rule__Node__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1006:1: ( rule__Node__Group_3__4__Impl )
            // InternalProblem.g:1007:2: rule__Node__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Node__Group_3__4__Impl();

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
    // $ANTLR end "rule__Node__Group_3__4"


    // $ANTLR start "rule__Node__Group_3__4__Impl"
    // InternalProblem.g:1013:1: rule__Node__Group_3__4__Impl : ( '}' ) ;
    public final void rule__Node__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1017:1: ( ( '}' ) )
            // InternalProblem.g:1018:1: ( '}' )
            {
            // InternalProblem.g:1018:1: ( '}' )
            // InternalProblem.g:1019:1: '}'
            {
             before(grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_3__4__Impl"


    // $ANTLR start "rule__Node__Group_3_1__0"
    // InternalProblem.g:1042:1: rule__Node__Group_3_1__0 : rule__Node__Group_3_1__0__Impl rule__Node__Group_3_1__1 ;
    public final void rule__Node__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1046:1: ( rule__Node__Group_3_1__0__Impl rule__Node__Group_3_1__1 )
            // InternalProblem.g:1047:2: rule__Node__Group_3_1__0__Impl rule__Node__Group_3_1__1
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
    // InternalProblem.g:1054:1: rule__Node__Group_3_1__0__Impl : ( ( rule__Node__HiddenPhenomenaAssignment_3_1_0 ) ) ;
    public final void rule__Node__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1058:1: ( ( ( rule__Node__HiddenPhenomenaAssignment_3_1_0 ) ) )
            // InternalProblem.g:1059:1: ( ( rule__Node__HiddenPhenomenaAssignment_3_1_0 ) )
            {
            // InternalProblem.g:1059:1: ( ( rule__Node__HiddenPhenomenaAssignment_3_1_0 ) )
            // InternalProblem.g:1060:1: ( rule__Node__HiddenPhenomenaAssignment_3_1_0 )
            {
             before(grammarAccess.getNodeAccess().getHiddenPhenomenaAssignment_3_1_0()); 
            // InternalProblem.g:1061:1: ( rule__Node__HiddenPhenomenaAssignment_3_1_0 )
            // InternalProblem.g:1061:2: rule__Node__HiddenPhenomenaAssignment_3_1_0
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
    // InternalProblem.g:1071:1: rule__Node__Group_3_1__1 : rule__Node__Group_3_1__1__Impl ;
    public final void rule__Node__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1075:1: ( rule__Node__Group_3_1__1__Impl )
            // InternalProblem.g:1076:2: rule__Node__Group_3_1__1__Impl
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
    // InternalProblem.g:1082:1: rule__Node__Group_3_1__1__Impl : ( ( rule__Node__Group_3_1_1__0 )* ) ;
    public final void rule__Node__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1086:1: ( ( ( rule__Node__Group_3_1_1__0 )* ) )
            // InternalProblem.g:1087:1: ( ( rule__Node__Group_3_1_1__0 )* )
            {
            // InternalProblem.g:1087:1: ( ( rule__Node__Group_3_1_1__0 )* )
            // InternalProblem.g:1088:1: ( rule__Node__Group_3_1_1__0 )*
            {
             before(grammarAccess.getNodeAccess().getGroup_3_1_1()); 
            // InternalProblem.g:1089:1: ( rule__Node__Group_3_1_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==36) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalProblem.g:1089:2: rule__Node__Group_3_1_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Node__Group_3_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalProblem.g:1103:1: rule__Node__Group_3_1_1__0 : rule__Node__Group_3_1_1__0__Impl rule__Node__Group_3_1_1__1 ;
    public final void rule__Node__Group_3_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1107:1: ( rule__Node__Group_3_1_1__0__Impl rule__Node__Group_3_1_1__1 )
            // InternalProblem.g:1108:2: rule__Node__Group_3_1_1__0__Impl rule__Node__Group_3_1_1__1
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
    // InternalProblem.g:1115:1: rule__Node__Group_3_1_1__0__Impl : ( ',' ) ;
    public final void rule__Node__Group_3_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1119:1: ( ( ',' ) )
            // InternalProblem.g:1120:1: ( ',' )
            {
            // InternalProblem.g:1120:1: ( ',' )
            // InternalProblem.g:1121:1: ','
            {
             before(grammarAccess.getNodeAccess().getCommaKeyword_3_1_1_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalProblem.g:1134:1: rule__Node__Group_3_1_1__1 : rule__Node__Group_3_1_1__1__Impl ;
    public final void rule__Node__Group_3_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1138:1: ( rule__Node__Group_3_1_1__1__Impl )
            // InternalProblem.g:1139:2: rule__Node__Group_3_1_1__1__Impl
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
    // InternalProblem.g:1145:1: rule__Node__Group_3_1_1__1__Impl : ( ( rule__Node__HiddenPhenomenaAssignment_3_1_1_1 ) ) ;
    public final void rule__Node__Group_3_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1149:1: ( ( ( rule__Node__HiddenPhenomenaAssignment_3_1_1_1 ) ) )
            // InternalProblem.g:1150:1: ( ( rule__Node__HiddenPhenomenaAssignment_3_1_1_1 ) )
            {
            // InternalProblem.g:1150:1: ( ( rule__Node__HiddenPhenomenaAssignment_3_1_1_1 ) )
            // InternalProblem.g:1151:1: ( rule__Node__HiddenPhenomenaAssignment_3_1_1_1 )
            {
             before(grammarAccess.getNodeAccess().getHiddenPhenomenaAssignment_3_1_1_1()); 
            // InternalProblem.g:1152:1: ( rule__Node__HiddenPhenomenaAssignment_3_1_1_1 )
            // InternalProblem.g:1152:2: rule__Node__HiddenPhenomenaAssignment_3_1_1_1
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


    // $ANTLR start "rule__Node__Group_3_2__0"
    // InternalProblem.g:1166:1: rule__Node__Group_3_2__0 : rule__Node__Group_3_2__0__Impl rule__Node__Group_3_2__1 ;
    public final void rule__Node__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1170:1: ( rule__Node__Group_3_2__0__Impl rule__Node__Group_3_2__1 )
            // InternalProblem.g:1171:2: rule__Node__Group_3_2__0__Impl rule__Node__Group_3_2__1
            {
            pushFollow(FOLLOW_13);
            rule__Node__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group_3_2__1();

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
    // $ANTLR end "rule__Node__Group_3_2__0"


    // $ANTLR start "rule__Node__Group_3_2__0__Impl"
    // InternalProblem.g:1178:1: rule__Node__Group_3_2__0__Impl : ( ( rule__Node__TimingConstraintAssignment_3_2_0 ) ) ;
    public final void rule__Node__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1182:1: ( ( ( rule__Node__TimingConstraintAssignment_3_2_0 ) ) )
            // InternalProblem.g:1183:1: ( ( rule__Node__TimingConstraintAssignment_3_2_0 ) )
            {
            // InternalProblem.g:1183:1: ( ( rule__Node__TimingConstraintAssignment_3_2_0 ) )
            // InternalProblem.g:1184:1: ( rule__Node__TimingConstraintAssignment_3_2_0 )
            {
             before(grammarAccess.getNodeAccess().getTimingConstraintAssignment_3_2_0()); 
            // InternalProblem.g:1185:1: ( rule__Node__TimingConstraintAssignment_3_2_0 )
            // InternalProblem.g:1185:2: rule__Node__TimingConstraintAssignment_3_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Node__TimingConstraintAssignment_3_2_0();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getTimingConstraintAssignment_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_3_2__0__Impl"


    // $ANTLR start "rule__Node__Group_3_2__1"
    // InternalProblem.g:1195:1: rule__Node__Group_3_2__1 : rule__Node__Group_3_2__1__Impl ;
    public final void rule__Node__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1199:1: ( rule__Node__Group_3_2__1__Impl )
            // InternalProblem.g:1200:2: rule__Node__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Node__Group_3_2__1__Impl();

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
    // $ANTLR end "rule__Node__Group_3_2__1"


    // $ANTLR start "rule__Node__Group_3_2__1__Impl"
    // InternalProblem.g:1206:1: rule__Node__Group_3_2__1__Impl : ( ( rule__Node__Group_3_2_1__0 )* ) ;
    public final void rule__Node__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1210:1: ( ( ( rule__Node__Group_3_2_1__0 )* ) )
            // InternalProblem.g:1211:1: ( ( rule__Node__Group_3_2_1__0 )* )
            {
            // InternalProblem.g:1211:1: ( ( rule__Node__Group_3_2_1__0 )* )
            // InternalProblem.g:1212:1: ( rule__Node__Group_3_2_1__0 )*
            {
             before(grammarAccess.getNodeAccess().getGroup_3_2_1()); 
            // InternalProblem.g:1213:1: ( rule__Node__Group_3_2_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==37) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalProblem.g:1213:2: rule__Node__Group_3_2_1__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Node__Group_3_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getNodeAccess().getGroup_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_3_2__1__Impl"


    // $ANTLR start "rule__Node__Group_3_2_1__0"
    // InternalProblem.g:1227:1: rule__Node__Group_3_2_1__0 : rule__Node__Group_3_2_1__0__Impl rule__Node__Group_3_2_1__1 ;
    public final void rule__Node__Group_3_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1231:1: ( rule__Node__Group_3_2_1__0__Impl rule__Node__Group_3_2_1__1 )
            // InternalProblem.g:1232:2: rule__Node__Group_3_2_1__0__Impl rule__Node__Group_3_2_1__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalProblem.g:1239:1: rule__Node__Group_3_2_1__0__Impl : ( ';' ) ;
    public final void rule__Node__Group_3_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1243:1: ( ( ';' ) )
            // InternalProblem.g:1244:1: ( ';' )
            {
            // InternalProblem.g:1244:1: ( ';' )
            // InternalProblem.g:1245:1: ';'
            {
             before(grammarAccess.getNodeAccess().getSemicolonKeyword_3_2_1_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getSemicolonKeyword_3_2_1_0()); 

            }


            }

        }
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
    // InternalProblem.g:1258:1: rule__Node__Group_3_2_1__1 : rule__Node__Group_3_2_1__1__Impl ;
    public final void rule__Node__Group_3_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1262:1: ( rule__Node__Group_3_2_1__1__Impl )
            // InternalProblem.g:1263:2: rule__Node__Group_3_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Node__Group_3_2_1__1__Impl();

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
    // InternalProblem.g:1269:1: rule__Node__Group_3_2_1__1__Impl : ( ( rule__Node__TimingConstraintAssignment_3_2_1_1 ) ) ;
    public final void rule__Node__Group_3_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1273:1: ( ( ( rule__Node__TimingConstraintAssignment_3_2_1_1 ) ) )
            // InternalProblem.g:1274:1: ( ( rule__Node__TimingConstraintAssignment_3_2_1_1 ) )
            {
            // InternalProblem.g:1274:1: ( ( rule__Node__TimingConstraintAssignment_3_2_1_1 ) )
            // InternalProblem.g:1275:1: ( rule__Node__TimingConstraintAssignment_3_2_1_1 )
            {
             before(grammarAccess.getNodeAccess().getTimingConstraintAssignment_3_2_1_1()); 
            // InternalProblem.g:1276:1: ( rule__Node__TimingConstraintAssignment_3_2_1_1 )
            // InternalProblem.g:1276:2: rule__Node__TimingConstraintAssignment_3_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Node__TimingConstraintAssignment_3_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getTimingConstraintAssignment_3_2_1_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Node__Group_3_3_1__0"
    // InternalProblem.g:1290:1: rule__Node__Group_3_3_1__0 : rule__Node__Group_3_3_1__0__Impl rule__Node__Group_3_3_1__1 ;
    public final void rule__Node__Group_3_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1294:1: ( rule__Node__Group_3_3_1__0__Impl rule__Node__Group_3_3_1__1 )
            // InternalProblem.g:1295:2: rule__Node__Group_3_3_1__0__Impl rule__Node__Group_3_3_1__1
            {
            pushFollow(FOLLOW_16);
            rule__Node__Group_3_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group_3_3_1__1();

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
    // $ANTLR end "rule__Node__Group_3_3_1__0"


    // $ANTLR start "rule__Node__Group_3_3_1__0__Impl"
    // InternalProblem.g:1302:1: rule__Node__Group_3_3_1__0__Impl : ( 'see' ) ;
    public final void rule__Node__Group_3_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1306:1: ( ( 'see' ) )
            // InternalProblem.g:1307:1: ( 'see' )
            {
            // InternalProblem.g:1307:1: ( 'see' )
            // InternalProblem.g:1308:1: 'see'
            {
             before(grammarAccess.getNodeAccess().getSeeKeyword_3_3_1_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getSeeKeyword_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_3_3_1__0__Impl"


    // $ANTLR start "rule__Node__Group_3_3_1__1"
    // InternalProblem.g:1321:1: rule__Node__Group_3_3_1__1 : rule__Node__Group_3_3_1__1__Impl rule__Node__Group_3_3_1__2 ;
    public final void rule__Node__Group_3_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1325:1: ( rule__Node__Group_3_3_1__1__Impl rule__Node__Group_3_3_1__2 )
            // InternalProblem.g:1326:2: rule__Node__Group_3_3_1__1__Impl rule__Node__Group_3_3_1__2
            {
            pushFollow(FOLLOW_3);
            rule__Node__Group_3_3_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group_3_3_1__2();

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
    // $ANTLR end "rule__Node__Group_3_3_1__1"


    // $ANTLR start "rule__Node__Group_3_3_1__1__Impl"
    // InternalProblem.g:1333:1: rule__Node__Group_3_3_1__1__Impl : ( 'domain' ) ;
    public final void rule__Node__Group_3_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1337:1: ( ( 'domain' ) )
            // InternalProblem.g:1338:1: ( 'domain' )
            {
            // InternalProblem.g:1338:1: ( 'domain' )
            // InternalProblem.g:1339:1: 'domain'
            {
             before(grammarAccess.getNodeAccess().getDomainKeyword_3_3_1_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getDomainKeyword_3_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_3_3_1__1__Impl"


    // $ANTLR start "rule__Node__Group_3_3_1__2"
    // InternalProblem.g:1352:1: rule__Node__Group_3_3_1__2 : rule__Node__Group_3_3_1__2__Impl ;
    public final void rule__Node__Group_3_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1356:1: ( rule__Node__Group_3_3_1__2__Impl )
            // InternalProblem.g:1357:2: rule__Node__Group_3_3_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Node__Group_3_3_1__2__Impl();

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
    // $ANTLR end "rule__Node__Group_3_3_1__2"


    // $ANTLR start "rule__Node__Group_3_3_1__2__Impl"
    // InternalProblem.g:1363:1: rule__Node__Group_3_3_1__2__Impl : ( ( rule__Node__ProblemNodeRefAssignment_3_3_1_2 ) ) ;
    public final void rule__Node__Group_3_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1367:1: ( ( ( rule__Node__ProblemNodeRefAssignment_3_3_1_2 ) ) )
            // InternalProblem.g:1368:1: ( ( rule__Node__ProblemNodeRefAssignment_3_3_1_2 ) )
            {
            // InternalProblem.g:1368:1: ( ( rule__Node__ProblemNodeRefAssignment_3_3_1_2 ) )
            // InternalProblem.g:1369:1: ( rule__Node__ProblemNodeRefAssignment_3_3_1_2 )
            {
             before(grammarAccess.getNodeAccess().getProblemNodeRefAssignment_3_3_1_2()); 
            // InternalProblem.g:1370:1: ( rule__Node__ProblemNodeRefAssignment_3_3_1_2 )
            // InternalProblem.g:1370:2: rule__Node__ProblemNodeRefAssignment_3_3_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Node__ProblemNodeRefAssignment_3_3_1_2();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getProblemNodeRefAssignment_3_3_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_3_3_1__2__Impl"


    // $ANTLR start "rule__Node__Group_3_3_2__0"
    // InternalProblem.g:1386:1: rule__Node__Group_3_3_2__0 : rule__Node__Group_3_3_2__0__Impl rule__Node__Group_3_3_2__1 ;
    public final void rule__Node__Group_3_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1390:1: ( rule__Node__Group_3_3_2__0__Impl rule__Node__Group_3_3_2__1 )
            // InternalProblem.g:1391:2: rule__Node__Group_3_3_2__0__Impl rule__Node__Group_3_3_2__1
            {
            pushFollow(FOLLOW_17);
            rule__Node__Group_3_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group_3_3_2__1();

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
    // $ANTLR end "rule__Node__Group_3_3_2__0"


    // $ANTLR start "rule__Node__Group_3_3_2__0__Impl"
    // InternalProblem.g:1398:1: rule__Node__Group_3_3_2__0__Impl : ( 'see' ) ;
    public final void rule__Node__Group_3_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1402:1: ( ( 'see' ) )
            // InternalProblem.g:1403:1: ( 'see' )
            {
            // InternalProblem.g:1403:1: ( 'see' )
            // InternalProblem.g:1404:1: 'see'
            {
             before(grammarAccess.getNodeAccess().getSeeKeyword_3_3_2_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getSeeKeyword_3_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_3_3_2__0__Impl"


    // $ANTLR start "rule__Node__Group_3_3_2__1"
    // InternalProblem.g:1417:1: rule__Node__Group_3_3_2__1 : rule__Node__Group_3_3_2__1__Impl rule__Node__Group_3_3_2__2 ;
    public final void rule__Node__Group_3_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1421:1: ( rule__Node__Group_3_3_2__1__Impl rule__Node__Group_3_3_2__2 )
            // InternalProblem.g:1422:2: rule__Node__Group_3_3_2__1__Impl rule__Node__Group_3_3_2__2
            {
            pushFollow(FOLLOW_3);
            rule__Node__Group_3_3_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group_3_3_2__2();

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
    // $ANTLR end "rule__Node__Group_3_3_2__1"


    // $ANTLR start "rule__Node__Group_3_3_2__1__Impl"
    // InternalProblem.g:1429:1: rule__Node__Group_3_3_2__1__Impl : ( 'problem' ) ;
    public final void rule__Node__Group_3_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1433:1: ( ( 'problem' ) )
            // InternalProblem.g:1434:1: ( 'problem' )
            {
            // InternalProblem.g:1434:1: ( 'problem' )
            // InternalProblem.g:1435:1: 'problem'
            {
             before(grammarAccess.getNodeAccess().getProblemKeyword_3_3_2_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getProblemKeyword_3_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_3_3_2__1__Impl"


    // $ANTLR start "rule__Node__Group_3_3_2__2"
    // InternalProblem.g:1448:1: rule__Node__Group_3_3_2__2 : rule__Node__Group_3_3_2__2__Impl ;
    public final void rule__Node__Group_3_3_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1452:1: ( rule__Node__Group_3_3_2__2__Impl )
            // InternalProblem.g:1453:2: rule__Node__Group_3_3_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Node__Group_3_3_2__2__Impl();

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
    // $ANTLR end "rule__Node__Group_3_3_2__2"


    // $ANTLR start "rule__Node__Group_3_3_2__2__Impl"
    // InternalProblem.g:1459:1: rule__Node__Group_3_3_2__2__Impl : ( ( rule__Node__ProblemRefAssignment_3_3_2_2 ) ) ;
    public final void rule__Node__Group_3_3_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1463:1: ( ( ( rule__Node__ProblemRefAssignment_3_3_2_2 ) ) )
            // InternalProblem.g:1464:1: ( ( rule__Node__ProblemRefAssignment_3_3_2_2 ) )
            {
            // InternalProblem.g:1464:1: ( ( rule__Node__ProblemRefAssignment_3_3_2_2 ) )
            // InternalProblem.g:1465:1: ( rule__Node__ProblemRefAssignment_3_3_2_2 )
            {
             before(grammarAccess.getNodeAccess().getProblemRefAssignment_3_3_2_2()); 
            // InternalProblem.g:1466:1: ( rule__Node__ProblemRefAssignment_3_3_2_2 )
            // InternalProblem.g:1466:2: rule__Node__ProblemRefAssignment_3_3_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Node__ProblemRefAssignment_3_3_2_2();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getProblemRefAssignment_3_3_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_3_3_2__2__Impl"


    // $ANTLR start "rule__Node__Group_3_3_3__0"
    // InternalProblem.g:1482:1: rule__Node__Group_3_3_3__0 : rule__Node__Group_3_3_3__0__Impl rule__Node__Group_3_3_3__1 ;
    public final void rule__Node__Group_3_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1486:1: ( rule__Node__Group_3_3_3__0__Impl rule__Node__Group_3_3_3__1 )
            // InternalProblem.g:1487:2: rule__Node__Group_3_3_3__0__Impl rule__Node__Group_3_3_3__1
            {
            pushFollow(FOLLOW_18);
            rule__Node__Group_3_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group_3_3_3__1();

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
    // $ANTLR end "rule__Node__Group_3_3_3__0"


    // $ANTLR start "rule__Node__Group_3_3_3__0__Impl"
    // InternalProblem.g:1494:1: rule__Node__Group_3_3_3__0__Impl : ( 'see' ) ;
    public final void rule__Node__Group_3_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1498:1: ( ( 'see' ) )
            // InternalProblem.g:1499:1: ( 'see' )
            {
            // InternalProblem.g:1499:1: ( 'see' )
            // InternalProblem.g:1500:1: 'see'
            {
             before(grammarAccess.getNodeAccess().getSeeKeyword_3_3_3_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getSeeKeyword_3_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_3_3_3__0__Impl"


    // $ANTLR start "rule__Node__Group_3_3_3__1"
    // InternalProblem.g:1513:1: rule__Node__Group_3_3_3__1 : rule__Node__Group_3_3_3__1__Impl ;
    public final void rule__Node__Group_3_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1517:1: ( rule__Node__Group_3_3_3__1__Impl )
            // InternalProblem.g:1518:2: rule__Node__Group_3_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Node__Group_3_3_3__1__Impl();

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
    // $ANTLR end "rule__Node__Group_3_3_3__1"


    // $ANTLR start "rule__Node__Group_3_3_3__1__Impl"
    // InternalProblem.g:1524:1: rule__Node__Group_3_3_3__1__Impl : ( ( rule__Node__HrefAssignment_3_3_3_1 ) ) ;
    public final void rule__Node__Group_3_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1528:1: ( ( ( rule__Node__HrefAssignment_3_3_3_1 ) ) )
            // InternalProblem.g:1529:1: ( ( rule__Node__HrefAssignment_3_3_3_1 ) )
            {
            // InternalProblem.g:1529:1: ( ( rule__Node__HrefAssignment_3_3_3_1 ) )
            // InternalProblem.g:1530:1: ( rule__Node__HrefAssignment_3_3_3_1 )
            {
             before(grammarAccess.getNodeAccess().getHrefAssignment_3_3_3_1()); 
            // InternalProblem.g:1531:1: ( rule__Node__HrefAssignment_3_3_3_1 )
            // InternalProblem.g:1531:2: rule__Node__HrefAssignment_3_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Node__HrefAssignment_3_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getHrefAssignment_3_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_3_3_3__1__Impl"


    // $ANTLR start "rule__Phenomenon__Group__0"
    // InternalProblem.g:1545:1: rule__Phenomenon__Group__0 : rule__Phenomenon__Group__0__Impl rule__Phenomenon__Group__1 ;
    public final void rule__Phenomenon__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1549:1: ( rule__Phenomenon__Group__0__Impl rule__Phenomenon__Group__1 )
            // InternalProblem.g:1550:2: rule__Phenomenon__Group__0__Impl rule__Phenomenon__Group__1
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
    // InternalProblem.g:1557:1: rule__Phenomenon__Group__0__Impl : ( ( rule__Phenomenon__TypeAssignment_0 )? ) ;
    public final void rule__Phenomenon__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1561:1: ( ( ( rule__Phenomenon__TypeAssignment_0 )? ) )
            // InternalProblem.g:1562:1: ( ( rule__Phenomenon__TypeAssignment_0 )? )
            {
            // InternalProblem.g:1562:1: ( ( rule__Phenomenon__TypeAssignment_0 )? )
            // InternalProblem.g:1563:1: ( rule__Phenomenon__TypeAssignment_0 )?
            {
             before(grammarAccess.getPhenomenonAccess().getTypeAssignment_0()); 
            // InternalProblem.g:1564:1: ( rule__Phenomenon__TypeAssignment_0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=20 && LA18_0<=22)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalProblem.g:1564:2: rule__Phenomenon__TypeAssignment_0
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
    // InternalProblem.g:1574:1: rule__Phenomenon__Group__1 : rule__Phenomenon__Group__1__Impl rule__Phenomenon__Group__2 ;
    public final void rule__Phenomenon__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1578:1: ( rule__Phenomenon__Group__1__Impl rule__Phenomenon__Group__2 )
            // InternalProblem.g:1579:2: rule__Phenomenon__Group__1__Impl rule__Phenomenon__Group__2
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
    // InternalProblem.g:1586:1: rule__Phenomenon__Group__1__Impl : ( ( rule__Phenomenon__IsControlledAssignment_1 )? ) ;
    public final void rule__Phenomenon__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1590:1: ( ( ( rule__Phenomenon__IsControlledAssignment_1 )? ) )
            // InternalProblem.g:1591:1: ( ( rule__Phenomenon__IsControlledAssignment_1 )? )
            {
            // InternalProblem.g:1591:1: ( ( rule__Phenomenon__IsControlledAssignment_1 )? )
            // InternalProblem.g:1592:1: ( rule__Phenomenon__IsControlledAssignment_1 )?
            {
             before(grammarAccess.getPhenomenonAccess().getIsControlledAssignment_1()); 
            // InternalProblem.g:1593:1: ( rule__Phenomenon__IsControlledAssignment_1 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==43) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalProblem.g:1593:2: rule__Phenomenon__IsControlledAssignment_1
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
    // InternalProblem.g:1603:1: rule__Phenomenon__Group__2 : rule__Phenomenon__Group__2__Impl rule__Phenomenon__Group__3 ;
    public final void rule__Phenomenon__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1607:1: ( rule__Phenomenon__Group__2__Impl rule__Phenomenon__Group__3 )
            // InternalProblem.g:1608:2: rule__Phenomenon__Group__2__Impl rule__Phenomenon__Group__3
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
    // InternalProblem.g:1615:1: rule__Phenomenon__Group__2__Impl : ( ( rule__Phenomenon__NameAssignment_2 ) ) ;
    public final void rule__Phenomenon__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1619:1: ( ( ( rule__Phenomenon__NameAssignment_2 ) ) )
            // InternalProblem.g:1620:1: ( ( rule__Phenomenon__NameAssignment_2 ) )
            {
            // InternalProblem.g:1620:1: ( ( rule__Phenomenon__NameAssignment_2 ) )
            // InternalProblem.g:1621:1: ( rule__Phenomenon__NameAssignment_2 )
            {
             before(grammarAccess.getPhenomenonAccess().getNameAssignment_2()); 
            // InternalProblem.g:1622:1: ( rule__Phenomenon__NameAssignment_2 )
            // InternalProblem.g:1622:2: rule__Phenomenon__NameAssignment_2
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
    // InternalProblem.g:1632:1: rule__Phenomenon__Group__3 : rule__Phenomenon__Group__3__Impl ;
    public final void rule__Phenomenon__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1636:1: ( rule__Phenomenon__Group__3__Impl )
            // InternalProblem.g:1637:2: rule__Phenomenon__Group__3__Impl
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
    // InternalProblem.g:1643:1: rule__Phenomenon__Group__3__Impl : ( ( rule__Phenomenon__Group_3__0 )? ) ;
    public final void rule__Phenomenon__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1647:1: ( ( ( rule__Phenomenon__Group_3__0 )? ) )
            // InternalProblem.g:1648:1: ( ( rule__Phenomenon__Group_3__0 )? )
            {
            // InternalProblem.g:1648:1: ( ( rule__Phenomenon__Group_3__0 )? )
            // InternalProblem.g:1649:1: ( rule__Phenomenon__Group_3__0 )?
            {
             before(grammarAccess.getPhenomenonAccess().getGroup_3()); 
            // InternalProblem.g:1650:1: ( rule__Phenomenon__Group_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_STRING||LA20_0==33) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalProblem.g:1650:2: rule__Phenomenon__Group_3__0
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
    // InternalProblem.g:1668:1: rule__Phenomenon__Group_3__0 : rule__Phenomenon__Group_3__0__Impl rule__Phenomenon__Group_3__1 ;
    public final void rule__Phenomenon__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1672:1: ( rule__Phenomenon__Group_3__0__Impl rule__Phenomenon__Group_3__1 )
            // InternalProblem.g:1673:2: rule__Phenomenon__Group_3__0__Impl rule__Phenomenon__Group_3__1
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
    // InternalProblem.g:1680:1: rule__Phenomenon__Group_3__0__Impl : ( ( ':' )? ) ;
    public final void rule__Phenomenon__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1684:1: ( ( ( ':' )? ) )
            // InternalProblem.g:1685:1: ( ( ':' )? )
            {
            // InternalProblem.g:1685:1: ( ( ':' )? )
            // InternalProblem.g:1686:1: ( ':' )?
            {
             before(grammarAccess.getPhenomenonAccess().getColonKeyword_3_0()); 
            // InternalProblem.g:1687:1: ( ':' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==33) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalProblem.g:1688:2: ':'
                    {
                    match(input,33,FOLLOW_2); 

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
    // InternalProblem.g:1699:1: rule__Phenomenon__Group_3__1 : rule__Phenomenon__Group_3__1__Impl ;
    public final void rule__Phenomenon__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1703:1: ( rule__Phenomenon__Group_3__1__Impl )
            // InternalProblem.g:1704:2: rule__Phenomenon__Group_3__1__Impl
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
    // InternalProblem.g:1710:1: rule__Phenomenon__Group_3__1__Impl : ( ( rule__Phenomenon__DescriptionAssignment_3_1 ) ) ;
    public final void rule__Phenomenon__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1714:1: ( ( ( rule__Phenomenon__DescriptionAssignment_3_1 ) ) )
            // InternalProblem.g:1715:1: ( ( rule__Phenomenon__DescriptionAssignment_3_1 ) )
            {
            // InternalProblem.g:1715:1: ( ( rule__Phenomenon__DescriptionAssignment_3_1 ) )
            // InternalProblem.g:1716:1: ( rule__Phenomenon__DescriptionAssignment_3_1 )
            {
             before(grammarAccess.getPhenomenonAccess().getDescriptionAssignment_3_1()); 
            // InternalProblem.g:1717:1: ( rule__Phenomenon__DescriptionAssignment_3_1 )
            // InternalProblem.g:1717:2: rule__Phenomenon__DescriptionAssignment_3_1
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


    // $ANTLR start "rule__Constraint__Group__0"
    // InternalProblem.g:1731:1: rule__Constraint__Group__0 : rule__Constraint__Group__0__Impl rule__Constraint__Group__1 ;
    public final void rule__Constraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1735:1: ( rule__Constraint__Group__0__Impl rule__Constraint__Group__1 )
            // InternalProblem.g:1736:2: rule__Constraint__Group__0__Impl rule__Constraint__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Constraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group__1();

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
    // $ANTLR end "rule__Constraint__Group__0"


    // $ANTLR start "rule__Constraint__Group__0__Impl"
    // InternalProblem.g:1743:1: rule__Constraint__Group__0__Impl : ( ( rule__Constraint__TypeAssignment_0 ) ) ;
    public final void rule__Constraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1747:1: ( ( ( rule__Constraint__TypeAssignment_0 ) ) )
            // InternalProblem.g:1748:1: ( ( rule__Constraint__TypeAssignment_0 ) )
            {
            // InternalProblem.g:1748:1: ( ( rule__Constraint__TypeAssignment_0 ) )
            // InternalProblem.g:1749:1: ( rule__Constraint__TypeAssignment_0 )
            {
             before(grammarAccess.getConstraintAccess().getTypeAssignment_0()); 
            // InternalProblem.g:1750:1: ( rule__Constraint__TypeAssignment_0 )
            // InternalProblem.g:1750:2: rule__Constraint__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__0__Impl"


    // $ANTLR start "rule__Constraint__Group__1"
    // InternalProblem.g:1760:1: rule__Constraint__Group__1 : rule__Constraint__Group__1__Impl rule__Constraint__Group__2 ;
    public final void rule__Constraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1764:1: ( rule__Constraint__Group__1__Impl rule__Constraint__Group__2 )
            // InternalProblem.g:1765:2: rule__Constraint__Group__1__Impl rule__Constraint__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Constraint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group__2();

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
    // $ANTLR end "rule__Constraint__Group__1"


    // $ANTLR start "rule__Constraint__Group__1__Impl"
    // InternalProblem.g:1772:1: rule__Constraint__Group__1__Impl : ( '(' ) ;
    public final void rule__Constraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1776:1: ( ( '(' ) )
            // InternalProblem.g:1777:1: ( '(' )
            {
            // InternalProblem.g:1777:1: ( '(' )
            // InternalProblem.g:1778:1: '('
            {
             before(grammarAccess.getConstraintAccess().getLeftParenthesisKeyword_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__1__Impl"


    // $ANTLR start "rule__Constraint__Group__2"
    // InternalProblem.g:1791:1: rule__Constraint__Group__2 : rule__Constraint__Group__2__Impl rule__Constraint__Group__3 ;
    public final void rule__Constraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1795:1: ( rule__Constraint__Group__2__Impl rule__Constraint__Group__3 )
            // InternalProblem.g:1796:2: rule__Constraint__Group__2__Impl rule__Constraint__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__Constraint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group__3();

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
    // $ANTLR end "rule__Constraint__Group__2"


    // $ANTLR start "rule__Constraint__Group__2__Impl"
    // InternalProblem.g:1803:1: rule__Constraint__Group__2__Impl : ( ( rule__Constraint__OperandAssignment_2 ) ) ;
    public final void rule__Constraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1807:1: ( ( ( rule__Constraint__OperandAssignment_2 ) ) )
            // InternalProblem.g:1808:1: ( ( rule__Constraint__OperandAssignment_2 ) )
            {
            // InternalProblem.g:1808:1: ( ( rule__Constraint__OperandAssignment_2 ) )
            // InternalProblem.g:1809:1: ( rule__Constraint__OperandAssignment_2 )
            {
             before(grammarAccess.getConstraintAccess().getOperandAssignment_2()); 
            // InternalProblem.g:1810:1: ( rule__Constraint__OperandAssignment_2 )
            // InternalProblem.g:1810:2: rule__Constraint__OperandAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__OperandAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getOperandAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__2__Impl"


    // $ANTLR start "rule__Constraint__Group__3"
    // InternalProblem.g:1820:1: rule__Constraint__Group__3 : rule__Constraint__Group__3__Impl rule__Constraint__Group__4 ;
    public final void rule__Constraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1824:1: ( rule__Constraint__Group__3__Impl rule__Constraint__Group__4 )
            // InternalProblem.g:1825:2: rule__Constraint__Group__3__Impl rule__Constraint__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__Constraint__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group__4();

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
    // $ANTLR end "rule__Constraint__Group__3"


    // $ANTLR start "rule__Constraint__Group__3__Impl"
    // InternalProblem.g:1832:1: rule__Constraint__Group__3__Impl : ( ( rule__Constraint__Group_3__0 )* ) ;
    public final void rule__Constraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1836:1: ( ( ( rule__Constraint__Group_3__0 )* ) )
            // InternalProblem.g:1837:1: ( ( rule__Constraint__Group_3__0 )* )
            {
            // InternalProblem.g:1837:1: ( ( rule__Constraint__Group_3__0 )* )
            // InternalProblem.g:1838:1: ( rule__Constraint__Group_3__0 )*
            {
             before(grammarAccess.getConstraintAccess().getGroup_3()); 
            // InternalProblem.g:1839:1: ( rule__Constraint__Group_3__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==36) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalProblem.g:1839:2: rule__Constraint__Group_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Constraint__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getConstraintAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__3__Impl"


    // $ANTLR start "rule__Constraint__Group__4"
    // InternalProblem.g:1849:1: rule__Constraint__Group__4 : rule__Constraint__Group__4__Impl ;
    public final void rule__Constraint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1853:1: ( rule__Constraint__Group__4__Impl )
            // InternalProblem.g:1854:2: rule__Constraint__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__Group__4__Impl();

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
    // $ANTLR end "rule__Constraint__Group__4"


    // $ANTLR start "rule__Constraint__Group__4__Impl"
    // InternalProblem.g:1860:1: rule__Constraint__Group__4__Impl : ( ')' ) ;
    public final void rule__Constraint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1864:1: ( ( ')' ) )
            // InternalProblem.g:1865:1: ( ')' )
            {
            // InternalProblem.g:1865:1: ( ')' )
            // InternalProblem.g:1866:1: ')'
            {
             before(grammarAccess.getConstraintAccess().getRightParenthesisKeyword_4()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__4__Impl"


    // $ANTLR start "rule__Constraint__Group_3__0"
    // InternalProblem.g:1889:1: rule__Constraint__Group_3__0 : rule__Constraint__Group_3__0__Impl rule__Constraint__Group_3__1 ;
    public final void rule__Constraint__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1893:1: ( rule__Constraint__Group_3__0__Impl rule__Constraint__Group_3__1 )
            // InternalProblem.g:1894:2: rule__Constraint__Group_3__0__Impl rule__Constraint__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Constraint__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group_3__1();

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
    // $ANTLR end "rule__Constraint__Group_3__0"


    // $ANTLR start "rule__Constraint__Group_3__0__Impl"
    // InternalProblem.g:1901:1: rule__Constraint__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Constraint__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1905:1: ( ( ',' ) )
            // InternalProblem.g:1906:1: ( ',' )
            {
            // InternalProblem.g:1906:1: ( ',' )
            // InternalProblem.g:1907:1: ','
            {
             before(grammarAccess.getConstraintAccess().getCommaKeyword_3_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_3__0__Impl"


    // $ANTLR start "rule__Constraint__Group_3__1"
    // InternalProblem.g:1920:1: rule__Constraint__Group_3__1 : rule__Constraint__Group_3__1__Impl ;
    public final void rule__Constraint__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1924:1: ( rule__Constraint__Group_3__1__Impl )
            // InternalProblem.g:1925:2: rule__Constraint__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__Group_3__1__Impl();

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
    // $ANTLR end "rule__Constraint__Group_3__1"


    // $ANTLR start "rule__Constraint__Group_3__1__Impl"
    // InternalProblem.g:1931:1: rule__Constraint__Group_3__1__Impl : ( ( rule__Constraint__OperandAssignment_3_1 ) ) ;
    public final void rule__Constraint__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1935:1: ( ( ( rule__Constraint__OperandAssignment_3_1 ) ) )
            // InternalProblem.g:1936:1: ( ( rule__Constraint__OperandAssignment_3_1 ) )
            {
            // InternalProblem.g:1936:1: ( ( rule__Constraint__OperandAssignment_3_1 ) )
            // InternalProblem.g:1937:1: ( rule__Constraint__OperandAssignment_3_1 )
            {
             before(grammarAccess.getConstraintAccess().getOperandAssignment_3_1()); 
            // InternalProblem.g:1938:1: ( rule__Constraint__OperandAssignment_3_1 )
            // InternalProblem.g:1938:2: rule__Constraint__OperandAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__OperandAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getOperandAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_3__1__Impl"


    // $ANTLR start "rule__Link__Group__0"
    // InternalProblem.g:1952:1: rule__Link__Group__0 : rule__Link__Group__0__Impl rule__Link__Group__1 ;
    public final void rule__Link__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1956:1: ( rule__Link__Group__0__Impl rule__Link__Group__1 )
            // InternalProblem.g:1957:2: rule__Link__Group__0__Impl rule__Link__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalProblem.g:1964:1: rule__Link__Group__0__Impl : ( ( rule__Link__FromAssignment_0 ) ) ;
    public final void rule__Link__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1968:1: ( ( ( rule__Link__FromAssignment_0 ) ) )
            // InternalProblem.g:1969:1: ( ( rule__Link__FromAssignment_0 ) )
            {
            // InternalProblem.g:1969:1: ( ( rule__Link__FromAssignment_0 ) )
            // InternalProblem.g:1970:1: ( rule__Link__FromAssignment_0 )
            {
             before(grammarAccess.getLinkAccess().getFromAssignment_0()); 
            // InternalProblem.g:1971:1: ( rule__Link__FromAssignment_0 )
            // InternalProblem.g:1971:2: rule__Link__FromAssignment_0
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
    // InternalProblem.g:1981:1: rule__Link__Group__1 : rule__Link__Group__1__Impl rule__Link__Group__2 ;
    public final void rule__Link__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1985:1: ( rule__Link__Group__1__Impl rule__Link__Group__2 )
            // InternalProblem.g:1986:2: rule__Link__Group__1__Impl rule__Link__Group__2
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
    // InternalProblem.g:1993:1: rule__Link__Group__1__Impl : ( ( rule__Link__TypeAssignment_1 ) ) ;
    public final void rule__Link__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:1997:1: ( ( ( rule__Link__TypeAssignment_1 ) ) )
            // InternalProblem.g:1998:1: ( ( rule__Link__TypeAssignment_1 ) )
            {
            // InternalProblem.g:1998:1: ( ( rule__Link__TypeAssignment_1 ) )
            // InternalProblem.g:1999:1: ( rule__Link__TypeAssignment_1 )
            {
             before(grammarAccess.getLinkAccess().getTypeAssignment_1()); 
            // InternalProblem.g:2000:1: ( rule__Link__TypeAssignment_1 )
            // InternalProblem.g:2000:2: rule__Link__TypeAssignment_1
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
    // InternalProblem.g:2010:1: rule__Link__Group__2 : rule__Link__Group__2__Impl rule__Link__Group__3 ;
    public final void rule__Link__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:2014:1: ( rule__Link__Group__2__Impl rule__Link__Group__3 )
            // InternalProblem.g:2015:2: rule__Link__Group__2__Impl rule__Link__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalProblem.g:2022:1: rule__Link__Group__2__Impl : ( ( rule__Link__ToAssignment_2 ) ) ;
    public final void rule__Link__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:2026:1: ( ( ( rule__Link__ToAssignment_2 ) ) )
            // InternalProblem.g:2027:1: ( ( rule__Link__ToAssignment_2 ) )
            {
            // InternalProblem.g:2027:1: ( ( rule__Link__ToAssignment_2 ) )
            // InternalProblem.g:2028:1: ( rule__Link__ToAssignment_2 )
            {
             before(grammarAccess.getLinkAccess().getToAssignment_2()); 
            // InternalProblem.g:2029:1: ( rule__Link__ToAssignment_2 )
            // InternalProblem.g:2029:2: rule__Link__ToAssignment_2
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
    // InternalProblem.g:2039:1: rule__Link__Group__3 : rule__Link__Group__3__Impl rule__Link__Group__4 ;
    public final void rule__Link__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:2043:1: ( rule__Link__Group__3__Impl rule__Link__Group__4 )
            // InternalProblem.g:2044:2: rule__Link__Group__3__Impl rule__Link__Group__4
            {
            pushFollow(FOLLOW_22);
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
    // InternalProblem.g:2051:1: rule__Link__Group__3__Impl : ( ( rule__Link__Group_3__0 )? ) ;
    public final void rule__Link__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:2055:1: ( ( ( rule__Link__Group_3__0 )? ) )
            // InternalProblem.g:2056:1: ( ( rule__Link__Group_3__0 )? )
            {
            // InternalProblem.g:2056:1: ( ( rule__Link__Group_3__0 )? )
            // InternalProblem.g:2057:1: ( rule__Link__Group_3__0 )?
            {
             before(grammarAccess.getLinkAccess().getGroup_3()); 
            // InternalProblem.g:2058:1: ( rule__Link__Group_3__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==34) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalProblem.g:2058:2: rule__Link__Group_3__0
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
    // InternalProblem.g:2068:1: rule__Link__Group__4 : rule__Link__Group__4__Impl ;
    public final void rule__Link__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:2072:1: ( rule__Link__Group__4__Impl )
            // InternalProblem.g:2073:2: rule__Link__Group__4__Impl
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
    // InternalProblem.g:2079:1: rule__Link__Group__4__Impl : ( ( rule__Link__Group_4__0 )? ) ;
    public final void rule__Link__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:2083:1: ( ( ( rule__Link__Group_4__0 )? ) )
            // InternalProblem.g:2084:1: ( ( rule__Link__Group_4__0 )? )
            {
            // InternalProblem.g:2084:1: ( ( rule__Link__Group_4__0 )? )
            // InternalProblem.g:2085:1: ( rule__Link__Group_4__0 )?
            {
             before(grammarAccess.getLinkAccess().getGroup_4()); 
            // InternalProblem.g:2086:1: ( rule__Link__Group_4__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_STRING||LA24_0==33) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalProblem.g:2086:2: rule__Link__Group_4__0
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
    // InternalProblem.g:2106:1: rule__Link__Group_3__0 : rule__Link__Group_3__0__Impl rule__Link__Group_3__1 ;
    public final void rule__Link__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:2110:1: ( rule__Link__Group_3__0__Impl rule__Link__Group_3__1 )
            // InternalProblem.g:2111:2: rule__Link__Group_3__0__Impl rule__Link__Group_3__1
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
    // InternalProblem.g:2118:1: rule__Link__Group_3__0__Impl : ( '{' ) ;
    public final void rule__Link__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:2122:1: ( ( '{' ) )
            // InternalProblem.g:2123:1: ( '{' )
            {
            // InternalProblem.g:2123:1: ( '{' )
            // InternalProblem.g:2124:1: '{'
            {
             before(grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalProblem.g:2137:1: rule__Link__Group_3__1 : rule__Link__Group_3__1__Impl rule__Link__Group_3__2 ;
    public final void rule__Link__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:2141:1: ( rule__Link__Group_3__1__Impl rule__Link__Group_3__2 )
            // InternalProblem.g:2142:2: rule__Link__Group_3__1__Impl rule__Link__Group_3__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalProblem.g:2149:1: rule__Link__Group_3__1__Impl : ( ( rule__Link__PhenomenaAssignment_3_1 ) ) ;
    public final void rule__Link__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:2153:1: ( ( ( rule__Link__PhenomenaAssignment_3_1 ) ) )
            // InternalProblem.g:2154:1: ( ( rule__Link__PhenomenaAssignment_3_1 ) )
            {
            // InternalProblem.g:2154:1: ( ( rule__Link__PhenomenaAssignment_3_1 ) )
            // InternalProblem.g:2155:1: ( rule__Link__PhenomenaAssignment_3_1 )
            {
             before(grammarAccess.getLinkAccess().getPhenomenaAssignment_3_1()); 
            // InternalProblem.g:2156:1: ( rule__Link__PhenomenaAssignment_3_1 )
            // InternalProblem.g:2156:2: rule__Link__PhenomenaAssignment_3_1
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
    // InternalProblem.g:2166:1: rule__Link__Group_3__2 : rule__Link__Group_3__2__Impl rule__Link__Group_3__3 ;
    public final void rule__Link__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:2170:1: ( rule__Link__Group_3__2__Impl rule__Link__Group_3__3 )
            // InternalProblem.g:2171:2: rule__Link__Group_3__2__Impl rule__Link__Group_3__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalProblem.g:2178:1: rule__Link__Group_3__2__Impl : ( ( rule__Link__Group_3_2__0 )* ) ;
    public final void rule__Link__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:2182:1: ( ( ( rule__Link__Group_3_2__0 )* ) )
            // InternalProblem.g:2183:1: ( ( rule__Link__Group_3_2__0 )* )
            {
            // InternalProblem.g:2183:1: ( ( rule__Link__Group_3_2__0 )* )
            // InternalProblem.g:2184:1: ( rule__Link__Group_3_2__0 )*
            {
             before(grammarAccess.getLinkAccess().getGroup_3_2()); 
            // InternalProblem.g:2185:1: ( rule__Link__Group_3_2__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==36) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalProblem.g:2185:2: rule__Link__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Link__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalProblem.g:2195:1: rule__Link__Group_3__3 : rule__Link__Group_3__3__Impl rule__Link__Group_3__4 ;
    public final void rule__Link__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:2199:1: ( rule__Link__Group_3__3__Impl rule__Link__Group_3__4 )
            // InternalProblem.g:2200:2: rule__Link__Group_3__3__Impl rule__Link__Group_3__4
            {
            pushFollow(FOLLOW_23);
            rule__Link__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group_3__4();

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
    // InternalProblem.g:2207:1: rule__Link__Group_3__3__Impl : ( ( rule__Link__Group_3_3__0 )? ) ;
    public final void rule__Link__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:2211:1: ( ( ( rule__Link__Group_3_3__0 )? ) )
            // InternalProblem.g:2212:1: ( ( rule__Link__Group_3_3__0 )? )
            {
            // InternalProblem.g:2212:1: ( ( rule__Link__Group_3_3__0 )? )
            // InternalProblem.g:2213:1: ( rule__Link__Group_3_3__0 )?
            {
             before(grammarAccess.getLinkAccess().getGroup_3_3()); 
            // InternalProblem.g:2214:1: ( rule__Link__Group_3_3__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=23 && LA26_0<=25)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalProblem.g:2214:2: rule__Link__Group_3_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Link__Group_3_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLinkAccess().getGroup_3_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Link__Group_3__4"
    // InternalProblem.g:2224:1: rule__Link__Group_3__4 : rule__Link__Group_3__4__Impl ;
    public final void rule__Link__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:2228:1: ( rule__Link__Group_3__4__Impl )
            // InternalProblem.g:2229:2: rule__Link__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group_3__4__Impl();

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
    // $ANTLR end "rule__Link__Group_3__4"


    // $ANTLR start "rule__Link__Group_3__4__Impl"
    // InternalProblem.g:2235:1: rule__Link__Group_3__4__Impl : ( '}' ) ;
    public final void rule__Link__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:2239:1: ( ( '}' ) )
            // InternalProblem.g:2240:1: ( '}' )
            {
            // InternalProblem.g:2240:1: ( '}' )
            // InternalProblem.g:2241:1: '}'
            {
             before(grammarAccess.getLinkAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getRightCurlyBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_3__4__Impl"


    // $ANTLR start "rule__Link__Group_3_2__0"
    // InternalProblem.g:2264:1: rule__Link__Group_3_2__0 : rule__Link__Group_3_2__0__Impl rule__Link__Group_3_2__1 ;
    public final void rule__Link__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:2268:1: ( rule__Link__Group_3_2__0__Impl rule__Link__Group_3_2__1 )
            // InternalProblem.g:2269:2: rule__Link__Group_3_2__0__Impl rule__Link__Group_3_2__1
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
    // InternalProblem.g:2276:1: rule__Link__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__Link__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:2280:1: ( ( ',' ) )
            // InternalProblem.g:2281:1: ( ',' )
            {
            // InternalProblem.g:2281:1: ( ',' )
            // InternalProblem.g:2282:1: ','
            {
             before(grammarAccess.getLinkAccess().getCommaKeyword_3_2_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalProblem.g:2295:1: rule__Link__Group_3_2__1 : rule__Link__Group_3_2__1__Impl ;
    public final void rule__Link__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:2299:1: ( rule__Link__Group_3_2__1__Impl )
            // InternalProblem.g:2300:2: rule__Link__Group_3_2__1__Impl
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
    // InternalProblem.g:2306:1: rule__Link__Group_3_2__1__Impl : ( ( rule__Link__PhenomenaAssignment_3_2_1 ) ) ;
    public final void rule__Link__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:2310:1: ( ( ( rule__Link__PhenomenaAssignment_3_2_1 ) ) )
            // InternalProblem.g:2311:1: ( ( rule__Link__PhenomenaAssignment_3_2_1 ) )
            {
            // InternalProblem.g:2311:1: ( ( rule__Link__PhenomenaAssignment_3_2_1 ) )
            // InternalProblem.g:2312:1: ( rule__Link__PhenomenaAssignment_3_2_1 )
            {
             before(grammarAccess.getLinkAccess().getPhenomenaAssignment_3_2_1()); 
            // InternalProblem.g:2313:1: ( rule__Link__PhenomenaAssignment_3_2_1 )
            // InternalProblem.g:2313:2: rule__Link__PhenomenaAssignment_3_2_1
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


    // $ANTLR start "rule__Link__Group_3_3__0"
    // InternalProblem.g:2327:1: rule__Link__Group_3_3__0 : rule__Link__Group_3_3__0__Impl rule__Link__Group_3_3__1 ;
    public final void rule__Link__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:2331:1: ( rule__Link__Group_3_3__0__Impl rule__Link__Group_3_3__1 )
            // InternalProblem.g:2332:2: rule__Link__Group_3_3__0__Impl rule__Link__Group_3_3__1
            {
            pushFollow(FOLLOW_13);
            rule__Link__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group_3_3__1();

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
    // $ANTLR end "rule__Link__Group_3_3__0"


    // $ANTLR start "rule__Link__Group_3_3__0__Impl"
    // InternalProblem.g:2339:1: rule__Link__Group_3_3__0__Impl : ( ( rule__Link__TimingAssignment_3_3_0 ) ) ;
    public final void rule__Link__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:2343:1: ( ( ( rule__Link__TimingAssignment_3_3_0 ) ) )
            // InternalProblem.g:2344:1: ( ( rule__Link__TimingAssignment_3_3_0 ) )
            {
            // InternalProblem.g:2344:1: ( ( rule__Link__TimingAssignment_3_3_0 ) )
            // InternalProblem.g:2345:1: ( rule__Link__TimingAssignment_3_3_0 )
            {
             before(grammarAccess.getLinkAccess().getTimingAssignment_3_3_0()); 
            // InternalProblem.g:2346:1: ( rule__Link__TimingAssignment_3_3_0 )
            // InternalProblem.g:2346:2: rule__Link__TimingAssignment_3_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Link__TimingAssignment_3_3_0();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getTimingAssignment_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_3_3__0__Impl"


    // $ANTLR start "rule__Link__Group_3_3__1"
    // InternalProblem.g:2356:1: rule__Link__Group_3_3__1 : rule__Link__Group_3_3__1__Impl ;
    public final void rule__Link__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:2360:1: ( rule__Link__Group_3_3__1__Impl )
            // InternalProblem.g:2361:2: rule__Link__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group_3_3__1__Impl();

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
    // $ANTLR end "rule__Link__Group_3_3__1"


    // $ANTLR start "rule__Link__Group_3_3__1__Impl"
    // InternalProblem.g:2367:1: rule__Link__Group_3_3__1__Impl : ( ( rule__Link__Group_3_3_1__0 )* ) ;
    public final void rule__Link__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:2371:1: ( ( ( rule__Link__Group_3_3_1__0 )* ) )
            // InternalProblem.g:2372:1: ( ( rule__Link__Group_3_3_1__0 )* )
            {
            // InternalProblem.g:2372:1: ( ( rule__Link__Group_3_3_1__0 )* )
            // InternalProblem.g:2373:1: ( rule__Link__Group_3_3_1__0 )*
            {
             before(grammarAccess.getLinkAccess().getGroup_3_3_1()); 
            // InternalProblem.g:2374:1: ( rule__Link__Group_3_3_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==37) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalProblem.g:2374:2: rule__Link__Group_3_3_1__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Link__Group_3_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getLinkAccess().getGroup_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_3_3__1__Impl"


    // $ANTLR start "rule__Link__Group_3_3_1__0"
    // InternalProblem.g:2388:1: rule__Link__Group_3_3_1__0 : rule__Link__Group_3_3_1__0__Impl rule__Link__Group_3_3_1__1 ;
    public final void rule__Link__Group_3_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:2392:1: ( rule__Link__Group_3_3_1__0__Impl rule__Link__Group_3_3_1__1 )
            // InternalProblem.g:2393:2: rule__Link__Group_3_3_1__0__Impl rule__Link__Group_3_3_1__1
            {
            pushFollow(FOLLOW_15);
            rule__Link__Group_3_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group_3_3_1__1();

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
    // $ANTLR end "rule__Link__Group_3_3_1__0"


    // $ANTLR start "rule__Link__Group_3_3_1__0__Impl"
    // InternalProblem.g:2400:1: rule__Link__Group_3_3_1__0__Impl : ( ';' ) ;
    public final void rule__Link__Group_3_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:2404:1: ( ( ';' ) )
            // InternalProblem.g:2405:1: ( ';' )
            {
            // InternalProblem.g:2405:1: ( ';' )
            // InternalProblem.g:2406:1: ';'
            {
             before(grammarAccess.getLinkAccess().getSemicolonKeyword_3_3_1_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getSemicolonKeyword_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_3_3_1__0__Impl"


    // $ANTLR start "rule__Link__Group_3_3_1__1"
    // InternalProblem.g:2419:1: rule__Link__Group_3_3_1__1 : rule__Link__Group_3_3_1__1__Impl ;
    public final void rule__Link__Group_3_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:2423:1: ( rule__Link__Group_3_3_1__1__Impl )
            // InternalProblem.g:2424:2: rule__Link__Group_3_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group_3_3_1__1__Impl();

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
    // $ANTLR end "rule__Link__Group_3_3_1__1"


    // $ANTLR start "rule__Link__Group_3_3_1__1__Impl"
    // InternalProblem.g:2430:1: rule__Link__Group_3_3_1__1__Impl : ( ( rule__Link__TimingAssignment_3_3_1_1 ) ) ;
    public final void rule__Link__Group_3_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:2434:1: ( ( ( rule__Link__TimingAssignment_3_3_1_1 ) ) )
            // InternalProblem.g:2435:1: ( ( rule__Link__TimingAssignment_3_3_1_1 ) )
            {
            // InternalProblem.g:2435:1: ( ( rule__Link__TimingAssignment_3_3_1_1 ) )
            // InternalProblem.g:2436:1: ( rule__Link__TimingAssignment_3_3_1_1 )
            {
             before(grammarAccess.getLinkAccess().getTimingAssignment_3_3_1_1()); 
            // InternalProblem.g:2437:1: ( rule__Link__TimingAssignment_3_3_1_1 )
            // InternalProblem.g:2437:2: rule__Link__TimingAssignment_3_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Link__TimingAssignment_3_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getTimingAssignment_3_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_3_3_1__1__Impl"


    // $ANTLR start "rule__Link__Group_4__0"
    // InternalProblem.g:2451:1: rule__Link__Group_4__0 : rule__Link__Group_4__0__Impl rule__Link__Group_4__1 ;
    public final void rule__Link__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:2455:1: ( rule__Link__Group_4__0__Impl rule__Link__Group_4__1 )
            // InternalProblem.g:2456:2: rule__Link__Group_4__0__Impl rule__Link__Group_4__1
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
    // InternalProblem.g:2463:1: rule__Link__Group_4__0__Impl : ( ( ':' )? ) ;
    public final void rule__Link__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:2467:1: ( ( ( ':' )? ) )
            // InternalProblem.g:2468:1: ( ( ':' )? )
            {
            // InternalProblem.g:2468:1: ( ( ':' )? )
            // InternalProblem.g:2469:1: ( ':' )?
            {
             before(grammarAccess.getLinkAccess().getColonKeyword_4_0()); 
            // InternalProblem.g:2470:1: ( ':' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==33) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalProblem.g:2471:2: ':'
                    {
                    match(input,33,FOLLOW_2); 

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
    // InternalProblem.g:2482:1: rule__Link__Group_4__1 : rule__Link__Group_4__1__Impl ;
    public final void rule__Link__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:2486:1: ( rule__Link__Group_4__1__Impl )
            // InternalProblem.g:2487:2: rule__Link__Group_4__1__Impl
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
    // InternalProblem.g:2493:1: rule__Link__Group_4__1__Impl : ( ( rule__Link__DescriptionAssignment_4_1 ) ) ;
    public final void rule__Link__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:2497:1: ( ( ( rule__Link__DescriptionAssignment_4_1 ) ) )
            // InternalProblem.g:2498:1: ( ( rule__Link__DescriptionAssignment_4_1 ) )
            {
            // InternalProblem.g:2498:1: ( ( rule__Link__DescriptionAssignment_4_1 ) )
            // InternalProblem.g:2499:1: ( rule__Link__DescriptionAssignment_4_1 )
            {
             before(grammarAccess.getLinkAccess().getDescriptionAssignment_4_1()); 
            // InternalProblem.g:2500:1: ( rule__Link__DescriptionAssignment_4_1 )
            // InternalProblem.g:2500:2: rule__Link__DescriptionAssignment_4_1
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
    // InternalProblem.g:2515:1: rule__ProblemDiagram__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ProblemDiagram__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:2519:1: ( ( RULE_ID ) )
            // InternalProblem.g:2520:1: ( RULE_ID )
            {
            // InternalProblem.g:2520:1: ( RULE_ID )
            // InternalProblem.g:2521:1: RULE_ID
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
    // InternalProblem.g:2530:1: rule__ProblemDiagram__HighlightAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__ProblemDiagram__HighlightAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:2534:1: ( ( ( RULE_ID ) ) )
            // InternalProblem.g:2535:1: ( ( RULE_ID ) )
            {
            // InternalProblem.g:2535:1: ( ( RULE_ID ) )
            // InternalProblem.g:2536:1: ( RULE_ID )
            {
             before(grammarAccess.getProblemDiagramAccess().getHighlightNodeCrossReference_2_1_0()); 
            // InternalProblem.g:2537:1: ( RULE_ID )
            // InternalProblem.g:2538:1: RULE_ID
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
    // InternalProblem.g:2549:1: rule__ProblemDiagram__NodesAssignment_3_0 : ( ruleNode ) ;
    public final void rule__ProblemDiagram__NodesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:2553:1: ( ( ruleNode ) )
            // InternalProblem.g:2554:1: ( ruleNode )
            {
            // InternalProblem.g:2554:1: ( ruleNode )
            // InternalProblem.g:2555:1: ruleNode
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
    // InternalProblem.g:2564:1: rule__ProblemDiagram__LinksAssignment_3_1 : ( ruleLink ) ;
    public final void rule__ProblemDiagram__LinksAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:2568:1: ( ( ruleLink ) )
            // InternalProblem.g:2569:1: ( ruleLink )
            {
            // InternalProblem.g:2569:1: ( ruleLink )
            // InternalProblem.g:2570:1: ruleLink
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
    // InternalProblem.g:2579:1: rule__Node__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Node__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:2583:1: ( ( RULE_ID ) )
            // InternalProblem.g:2584:1: ( RULE_ID )
            {
            // InternalProblem.g:2584:1: ( RULE_ID )
            // InternalProblem.g:2585:1: RULE_ID
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
    // InternalProblem.g:2594:1: rule__Node__TypeAssignment_1 : ( ruleNodeType ) ;
    public final void rule__Node__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:2598:1: ( ( ruleNodeType ) )
            // InternalProblem.g:2599:1: ( ruleNodeType )
            {
            // InternalProblem.g:2599:1: ( ruleNodeType )
            // InternalProblem.g:2600:1: ruleNodeType
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
    // InternalProblem.g:2609:1: rule__Node__DescriptionAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Node__DescriptionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:2613:1: ( ( RULE_STRING ) )
            // InternalProblem.g:2614:1: ( RULE_STRING )
            {
            // InternalProblem.g:2614:1: ( RULE_STRING )
            // InternalProblem.g:2615:1: RULE_STRING
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
    // InternalProblem.g:2624:1: rule__Node__HiddenPhenomenaAssignment_3_1_0 : ( rulePhenomenon ) ;
    public final void rule__Node__HiddenPhenomenaAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:2628:1: ( ( rulePhenomenon ) )
            // InternalProblem.g:2629:1: ( rulePhenomenon )
            {
            // InternalProblem.g:2629:1: ( rulePhenomenon )
            // InternalProblem.g:2630:1: rulePhenomenon
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
    // InternalProblem.g:2639:1: rule__Node__HiddenPhenomenaAssignment_3_1_1_1 : ( rulePhenomenon ) ;
    public final void rule__Node__HiddenPhenomenaAssignment_3_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:2643:1: ( ( rulePhenomenon ) )
            // InternalProblem.g:2644:1: ( rulePhenomenon )
            {
            // InternalProblem.g:2644:1: ( rulePhenomenon )
            // InternalProblem.g:2645:1: rulePhenomenon
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


    // $ANTLR start "rule__Node__TimingConstraintAssignment_3_2_0"
    // InternalProblem.g:2654:1: rule__Node__TimingConstraintAssignment_3_2_0 : ( ruleConstraint ) ;
    public final void rule__Node__TimingConstraintAssignment_3_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:2658:1: ( ( ruleConstraint ) )
            // InternalProblem.g:2659:1: ( ruleConstraint )
            {
            // InternalProblem.g:2659:1: ( ruleConstraint )
            // InternalProblem.g:2660:1: ruleConstraint
            {
             before(grammarAccess.getNodeAccess().getTimingConstraintConstraintParserRuleCall_3_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getNodeAccess().getTimingConstraintConstraintParserRuleCall_3_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__TimingConstraintAssignment_3_2_0"


    // $ANTLR start "rule__Node__TimingConstraintAssignment_3_2_1_1"
    // InternalProblem.g:2669:1: rule__Node__TimingConstraintAssignment_3_2_1_1 : ( ruleConstraint ) ;
    public final void rule__Node__TimingConstraintAssignment_3_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:2673:1: ( ( ruleConstraint ) )
            // InternalProblem.g:2674:1: ( ruleConstraint )
            {
            // InternalProblem.g:2674:1: ( ruleConstraint )
            // InternalProblem.g:2675:1: ruleConstraint
            {
             before(grammarAccess.getNodeAccess().getTimingConstraintConstraintParserRuleCall_3_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getNodeAccess().getTimingConstraintConstraintParserRuleCall_3_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__TimingConstraintAssignment_3_2_1_1"


    // $ANTLR start "rule__Node__SubproblemAssignment_3_3_0"
    // InternalProblem.g:2684:1: rule__Node__SubproblemAssignment_3_3_0 : ( ruleProblemDiagram ) ;
    public final void rule__Node__SubproblemAssignment_3_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:2688:1: ( ( ruleProblemDiagram ) )
            // InternalProblem.g:2689:1: ( ruleProblemDiagram )
            {
            // InternalProblem.g:2689:1: ( ruleProblemDiagram )
            // InternalProblem.g:2690:1: ruleProblemDiagram
            {
             before(grammarAccess.getNodeAccess().getSubproblemProblemDiagramParserRuleCall_3_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleProblemDiagram();

            state._fsp--;

             after(grammarAccess.getNodeAccess().getSubproblemProblemDiagramParserRuleCall_3_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__SubproblemAssignment_3_3_0"


    // $ANTLR start "rule__Node__ProblemNodeRefAssignment_3_3_1_2"
    // InternalProblem.g:2699:1: rule__Node__ProblemNodeRefAssignment_3_3_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__Node__ProblemNodeRefAssignment_3_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:2703:1: ( ( ( RULE_ID ) ) )
            // InternalProblem.g:2704:1: ( ( RULE_ID ) )
            {
            // InternalProblem.g:2704:1: ( ( RULE_ID ) )
            // InternalProblem.g:2705:1: ( RULE_ID )
            {
             before(grammarAccess.getNodeAccess().getProblemNodeRefNodeCrossReference_3_3_1_2_0()); 
            // InternalProblem.g:2706:1: ( RULE_ID )
            // InternalProblem.g:2707:1: RULE_ID
            {
             before(grammarAccess.getNodeAccess().getProblemNodeRefNodeIDTerminalRuleCall_3_3_1_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getProblemNodeRefNodeIDTerminalRuleCall_3_3_1_2_0_1()); 

            }

             after(grammarAccess.getNodeAccess().getProblemNodeRefNodeCrossReference_3_3_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__ProblemNodeRefAssignment_3_3_1_2"


    // $ANTLR start "rule__Node__ProblemRefAssignment_3_3_2_2"
    // InternalProblem.g:2718:1: rule__Node__ProblemRefAssignment_3_3_2_2 : ( ( RULE_ID ) ) ;
    public final void rule__Node__ProblemRefAssignment_3_3_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:2722:1: ( ( ( RULE_ID ) ) )
            // InternalProblem.g:2723:1: ( ( RULE_ID ) )
            {
            // InternalProblem.g:2723:1: ( ( RULE_ID ) )
            // InternalProblem.g:2724:1: ( RULE_ID )
            {
             before(grammarAccess.getNodeAccess().getProblemRefProblemDiagramCrossReference_3_3_2_2_0()); 
            // InternalProblem.g:2725:1: ( RULE_ID )
            // InternalProblem.g:2726:1: RULE_ID
            {
             before(grammarAccess.getNodeAccess().getProblemRefProblemDiagramIDTerminalRuleCall_3_3_2_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getProblemRefProblemDiagramIDTerminalRuleCall_3_3_2_2_0_1()); 

            }

             after(grammarAccess.getNodeAccess().getProblemRefProblemDiagramCrossReference_3_3_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__ProblemRefAssignment_3_3_2_2"


    // $ANTLR start "rule__Node__HrefAssignment_3_3_3_1"
    // InternalProblem.g:2737:1: rule__Node__HrefAssignment_3_3_3_1 : ( RULE_STRING ) ;
    public final void rule__Node__HrefAssignment_3_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:2741:1: ( ( RULE_STRING ) )
            // InternalProblem.g:2742:1: ( RULE_STRING )
            {
            // InternalProblem.g:2742:1: ( RULE_STRING )
            // InternalProblem.g:2743:1: RULE_STRING
            {
             before(grammarAccess.getNodeAccess().getHrefSTRINGTerminalRuleCall_3_3_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getHrefSTRINGTerminalRuleCall_3_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__HrefAssignment_3_3_3_1"


    // $ANTLR start "rule__Phenomenon__TypeAssignment_0"
    // InternalProblem.g:2752:1: rule__Phenomenon__TypeAssignment_0 : ( rulePhenomenonType ) ;
    public final void rule__Phenomenon__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:2756:1: ( ( rulePhenomenonType ) )
            // InternalProblem.g:2757:1: ( rulePhenomenonType )
            {
            // InternalProblem.g:2757:1: ( rulePhenomenonType )
            // InternalProblem.g:2758:1: rulePhenomenonType
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
    // InternalProblem.g:2767:1: rule__Phenomenon__IsControlledAssignment_1 : ( ( '!' ) ) ;
    public final void rule__Phenomenon__IsControlledAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:2771:1: ( ( ( '!' ) ) )
            // InternalProblem.g:2772:1: ( ( '!' ) )
            {
            // InternalProblem.g:2772:1: ( ( '!' ) )
            // InternalProblem.g:2773:1: ( '!' )
            {
             before(grammarAccess.getPhenomenonAccess().getIsControlledExclamationMarkKeyword_1_0()); 
            // InternalProblem.g:2774:1: ( '!' )
            // InternalProblem.g:2775:1: '!'
            {
             before(grammarAccess.getPhenomenonAccess().getIsControlledExclamationMarkKeyword_1_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalProblem.g:2790:1: rule__Phenomenon__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Phenomenon__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:2794:1: ( ( RULE_ID ) )
            // InternalProblem.g:2795:1: ( RULE_ID )
            {
            // InternalProblem.g:2795:1: ( RULE_ID )
            // InternalProblem.g:2796:1: RULE_ID
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
    // InternalProblem.g:2805:1: rule__Phenomenon__DescriptionAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Phenomenon__DescriptionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:2809:1: ( ( RULE_STRING ) )
            // InternalProblem.g:2810:1: ( RULE_STRING )
            {
            // InternalProblem.g:2810:1: ( RULE_STRING )
            // InternalProblem.g:2811:1: RULE_STRING
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


    // $ANTLR start "rule__Constraint__TypeAssignment_0"
    // InternalProblem.g:2820:1: rule__Constraint__TypeAssignment_0 : ( ruleConstraintType ) ;
    public final void rule__Constraint__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:2824:1: ( ( ruleConstraintType ) )
            // InternalProblem.g:2825:1: ( ruleConstraintType )
            {
            // InternalProblem.g:2825:1: ( ruleConstraintType )
            // InternalProblem.g:2826:1: ruleConstraintType
            {
             before(grammarAccess.getConstraintAccess().getTypeConstraintTypeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleConstraintType();

            state._fsp--;

             after(grammarAccess.getConstraintAccess().getTypeConstraintTypeEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__TypeAssignment_0"


    // $ANTLR start "rule__Constraint__OperandAssignment_2"
    // InternalProblem.g:2835:1: rule__Constraint__OperandAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Constraint__OperandAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:2839:1: ( ( ( RULE_ID ) ) )
            // InternalProblem.g:2840:1: ( ( RULE_ID ) )
            {
            // InternalProblem.g:2840:1: ( ( RULE_ID ) )
            // InternalProblem.g:2841:1: ( RULE_ID )
            {
             before(grammarAccess.getConstraintAccess().getOperandClockCrossReference_2_0()); 
            // InternalProblem.g:2842:1: ( RULE_ID )
            // InternalProblem.g:2843:1: RULE_ID
            {
             before(grammarAccess.getConstraintAccess().getOperandClockIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getOperandClockIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getConstraintAccess().getOperandClockCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__OperandAssignment_2"


    // $ANTLR start "rule__Constraint__OperandAssignment_3_1"
    // InternalProblem.g:2854:1: rule__Constraint__OperandAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Constraint__OperandAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:2858:1: ( ( ( RULE_ID ) ) )
            // InternalProblem.g:2859:1: ( ( RULE_ID ) )
            {
            // InternalProblem.g:2859:1: ( ( RULE_ID ) )
            // InternalProblem.g:2860:1: ( RULE_ID )
            {
             before(grammarAccess.getConstraintAccess().getOperandClockCrossReference_3_1_0()); 
            // InternalProblem.g:2861:1: ( RULE_ID )
            // InternalProblem.g:2862:1: RULE_ID
            {
             before(grammarAccess.getConstraintAccess().getOperandClockIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getOperandClockIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getConstraintAccess().getOperandClockCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__OperandAssignment_3_1"


    // $ANTLR start "rule__Link__FromAssignment_0"
    // InternalProblem.g:2873:1: rule__Link__FromAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Link__FromAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:2877:1: ( ( ( RULE_ID ) ) )
            // InternalProblem.g:2878:1: ( ( RULE_ID ) )
            {
            // InternalProblem.g:2878:1: ( ( RULE_ID ) )
            // InternalProblem.g:2879:1: ( RULE_ID )
            {
             before(grammarAccess.getLinkAccess().getFromNodeCrossReference_0_0()); 
            // InternalProblem.g:2880:1: ( RULE_ID )
            // InternalProblem.g:2881:1: RULE_ID
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
    // InternalProblem.g:2892:1: rule__Link__TypeAssignment_1 : ( ruleLinkType ) ;
    public final void rule__Link__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:2896:1: ( ( ruleLinkType ) )
            // InternalProblem.g:2897:1: ( ruleLinkType )
            {
            // InternalProblem.g:2897:1: ( ruleLinkType )
            // InternalProblem.g:2898:1: ruleLinkType
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
    // InternalProblem.g:2907:1: rule__Link__ToAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Link__ToAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:2911:1: ( ( ( RULE_ID ) ) )
            // InternalProblem.g:2912:1: ( ( RULE_ID ) )
            {
            // InternalProblem.g:2912:1: ( ( RULE_ID ) )
            // InternalProblem.g:2913:1: ( RULE_ID )
            {
             before(grammarAccess.getLinkAccess().getToNodeCrossReference_2_0()); 
            // InternalProblem.g:2914:1: ( RULE_ID )
            // InternalProblem.g:2915:1: RULE_ID
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
    // InternalProblem.g:2926:1: rule__Link__PhenomenaAssignment_3_1 : ( rulePhenomenon ) ;
    public final void rule__Link__PhenomenaAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:2930:1: ( ( rulePhenomenon ) )
            // InternalProblem.g:2931:1: ( rulePhenomenon )
            {
            // InternalProblem.g:2931:1: ( rulePhenomenon )
            // InternalProblem.g:2932:1: rulePhenomenon
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
    // InternalProblem.g:2941:1: rule__Link__PhenomenaAssignment_3_2_1 : ( rulePhenomenon ) ;
    public final void rule__Link__PhenomenaAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:2945:1: ( ( rulePhenomenon ) )
            // InternalProblem.g:2946:1: ( rulePhenomenon )
            {
            // InternalProblem.g:2946:1: ( rulePhenomenon )
            // InternalProblem.g:2947:1: rulePhenomenon
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


    // $ANTLR start "rule__Link__TimingAssignment_3_3_0"
    // InternalProblem.g:2956:1: rule__Link__TimingAssignment_3_3_0 : ( ruleConstraint ) ;
    public final void rule__Link__TimingAssignment_3_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:2960:1: ( ( ruleConstraint ) )
            // InternalProblem.g:2961:1: ( ruleConstraint )
            {
            // InternalProblem.g:2961:1: ( ruleConstraint )
            // InternalProblem.g:2962:1: ruleConstraint
            {
             before(grammarAccess.getLinkAccess().getTimingConstraintParserRuleCall_3_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getLinkAccess().getTimingConstraintParserRuleCall_3_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__TimingAssignment_3_3_0"


    // $ANTLR start "rule__Link__TimingAssignment_3_3_1_1"
    // InternalProblem.g:2971:1: rule__Link__TimingAssignment_3_3_1_1 : ( ruleConstraint ) ;
    public final void rule__Link__TimingAssignment_3_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:2975:1: ( ( ruleConstraint ) )
            // InternalProblem.g:2976:1: ( ruleConstraint )
            {
            // InternalProblem.g:2976:1: ( ruleConstraint )
            // InternalProblem.g:2977:1: ruleConstraint
            {
             before(grammarAccess.getLinkAccess().getTimingConstraintParserRuleCall_3_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getLinkAccess().getTimingConstraintParserRuleCall_3_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__TimingAssignment_3_3_1_1"


    // $ANTLR start "rule__Link__DescriptionAssignment_4_1"
    // InternalProblem.g:2986:1: rule__Link__DescriptionAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Link__DescriptionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProblem.g:2990:1: ( ( RULE_STRING ) )
            // InternalProblem.g:2991:1: ( RULE_STRING )
            {
            // InternalProblem.g:2991:1: ( RULE_STRING )
            // InternalProblem.g:2992:1: RULE_STRING
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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000006000FF020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000200000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000084883F00010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000004080000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000080000700010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000003800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000041000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000007C000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000600000020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001803800000L});

}