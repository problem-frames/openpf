package uk.ac.open.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
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
    // InternalProblem.g:53:1: entryRuleProblemDiagram : ruleProblemDiagram EOF ;
    public final void entryRuleProblemDiagram() throws RecognitionException {
        try {
            // InternalProblem.g:54:1: ( ruleProblemDiagram EOF )
            // InternalProblem.g:55:1: ruleProblemDiagram EOF
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
    // InternalProblem.g:62:1: ruleProblemDiagram : ( ( rule__ProblemDiagram__Group__0 ) ) ;
    public final void ruleProblemDiagram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:66:2: ( ( ( rule__ProblemDiagram__Group__0 ) ) )
            // InternalProblem.g:67:2: ( ( rule__ProblemDiagram__Group__0 ) )
            {
            // InternalProblem.g:67:2: ( ( rule__ProblemDiagram__Group__0 ) )
            // InternalProblem.g:68:3: ( rule__ProblemDiagram__Group__0 )
            {
             before(grammarAccess.getProblemDiagramAccess().getGroup()); 
            // InternalProblem.g:69:3: ( rule__ProblemDiagram__Group__0 )
            // InternalProblem.g:69:4: rule__ProblemDiagram__Group__0
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
    // InternalProblem.g:78:1: entryRuleNode : ruleNode EOF ;
    public final void entryRuleNode() throws RecognitionException {
        try {
            // InternalProblem.g:79:1: ( ruleNode EOF )
            // InternalProblem.g:80:1: ruleNode EOF
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
    // InternalProblem.g:87:1: ruleNode : ( ( rule__Node__Group__0 ) ) ;
    public final void ruleNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:91:2: ( ( ( rule__Node__Group__0 ) ) )
            // InternalProblem.g:92:2: ( ( rule__Node__Group__0 ) )
            {
            // InternalProblem.g:92:2: ( ( rule__Node__Group__0 ) )
            // InternalProblem.g:93:3: ( rule__Node__Group__0 )
            {
             before(grammarAccess.getNodeAccess().getGroup()); 
            // InternalProblem.g:94:3: ( rule__Node__Group__0 )
            // InternalProblem.g:94:4: rule__Node__Group__0
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
    // InternalProblem.g:103:1: entryRulePhenomenon : rulePhenomenon EOF ;
    public final void entryRulePhenomenon() throws RecognitionException {
        try {
            // InternalProblem.g:104:1: ( rulePhenomenon EOF )
            // InternalProblem.g:105:1: rulePhenomenon EOF
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
    // InternalProblem.g:112:1: rulePhenomenon : ( ( rule__Phenomenon__Group__0 ) ) ;
    public final void rulePhenomenon() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:116:2: ( ( ( rule__Phenomenon__Group__0 ) ) )
            // InternalProblem.g:117:2: ( ( rule__Phenomenon__Group__0 ) )
            {
            // InternalProblem.g:117:2: ( ( rule__Phenomenon__Group__0 ) )
            // InternalProblem.g:118:3: ( rule__Phenomenon__Group__0 )
            {
             before(grammarAccess.getPhenomenonAccess().getGroup()); 
            // InternalProblem.g:119:3: ( rule__Phenomenon__Group__0 )
            // InternalProblem.g:119:4: rule__Phenomenon__Group__0
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
    // InternalProblem.g:128:1: entryRuleConstraint : ruleConstraint EOF ;
    public final void entryRuleConstraint() throws RecognitionException {
        try {
            // InternalProblem.g:129:1: ( ruleConstraint EOF )
            // InternalProblem.g:130:1: ruleConstraint EOF
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
    // InternalProblem.g:137:1: ruleConstraint : ( ( rule__Constraint__Group__0 ) ) ;
    public final void ruleConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:141:2: ( ( ( rule__Constraint__Group__0 ) ) )
            // InternalProblem.g:142:2: ( ( rule__Constraint__Group__0 ) )
            {
            // InternalProblem.g:142:2: ( ( rule__Constraint__Group__0 ) )
            // InternalProblem.g:143:3: ( rule__Constraint__Group__0 )
            {
             before(grammarAccess.getConstraintAccess().getGroup()); 
            // InternalProblem.g:144:3: ( rule__Constraint__Group__0 )
            // InternalProblem.g:144:4: rule__Constraint__Group__0
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
    // InternalProblem.g:153:1: entryRuleLink : ruleLink EOF ;
    public final void entryRuleLink() throws RecognitionException {
        try {
            // InternalProblem.g:154:1: ( ruleLink EOF )
            // InternalProblem.g:155:1: ruleLink EOF
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
    // InternalProblem.g:162:1: ruleLink : ( ( rule__Link__Group__0 ) ) ;
    public final void ruleLink() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:166:2: ( ( ( rule__Link__Group__0 ) ) )
            // InternalProblem.g:167:2: ( ( rule__Link__Group__0 ) )
            {
            // InternalProblem.g:167:2: ( ( rule__Link__Group__0 ) )
            // InternalProblem.g:168:3: ( rule__Link__Group__0 )
            {
             before(grammarAccess.getLinkAccess().getGroup()); 
            // InternalProblem.g:169:3: ( rule__Link__Group__0 )
            // InternalProblem.g:169:4: rule__Link__Group__0
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
    // InternalProblem.g:178:1: ruleNodeType : ( ( rule__NodeType__Alternatives ) ) ;
    public final void ruleNodeType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:182:1: ( ( ( rule__NodeType__Alternatives ) ) )
            // InternalProblem.g:183:2: ( ( rule__NodeType__Alternatives ) )
            {
            // InternalProblem.g:183:2: ( ( rule__NodeType__Alternatives ) )
            // InternalProblem.g:184:3: ( rule__NodeType__Alternatives )
            {
             before(grammarAccess.getNodeTypeAccess().getAlternatives()); 
            // InternalProblem.g:185:3: ( rule__NodeType__Alternatives )
            // InternalProblem.g:185:4: rule__NodeType__Alternatives
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
    // InternalProblem.g:194:1: rulePhenomenonType : ( ( rule__PhenomenonType__Alternatives ) ) ;
    public final void rulePhenomenonType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:198:1: ( ( ( rule__PhenomenonType__Alternatives ) ) )
            // InternalProblem.g:199:2: ( ( rule__PhenomenonType__Alternatives ) )
            {
            // InternalProblem.g:199:2: ( ( rule__PhenomenonType__Alternatives ) )
            // InternalProblem.g:200:3: ( rule__PhenomenonType__Alternatives )
            {
             before(grammarAccess.getPhenomenonTypeAccess().getAlternatives()); 
            // InternalProblem.g:201:3: ( rule__PhenomenonType__Alternatives )
            // InternalProblem.g:201:4: rule__PhenomenonType__Alternatives
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
    // InternalProblem.g:210:1: ruleConstraintType : ( ( rule__ConstraintType__Alternatives ) ) ;
    public final void ruleConstraintType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:214:1: ( ( ( rule__ConstraintType__Alternatives ) ) )
            // InternalProblem.g:215:2: ( ( rule__ConstraintType__Alternatives ) )
            {
            // InternalProblem.g:215:2: ( ( rule__ConstraintType__Alternatives ) )
            // InternalProblem.g:216:3: ( rule__ConstraintType__Alternatives )
            {
             before(grammarAccess.getConstraintTypeAccess().getAlternatives()); 
            // InternalProblem.g:217:3: ( rule__ConstraintType__Alternatives )
            // InternalProblem.g:217:4: rule__ConstraintType__Alternatives
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
    // InternalProblem.g:226:1: ruleLinkType : ( ( rule__LinkType__Alternatives ) ) ;
    public final void ruleLinkType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:230:1: ( ( ( rule__LinkType__Alternatives ) ) )
            // InternalProblem.g:231:2: ( ( rule__LinkType__Alternatives ) )
            {
            // InternalProblem.g:231:2: ( ( rule__LinkType__Alternatives ) )
            // InternalProblem.g:232:3: ( rule__LinkType__Alternatives )
            {
             before(grammarAccess.getLinkTypeAccess().getAlternatives()); 
            // InternalProblem.g:233:3: ( rule__LinkType__Alternatives )
            // InternalProblem.g:233:4: rule__LinkType__Alternatives
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
    // InternalProblem.g:241:1: rule__ProblemDiagram__Alternatives_3 : ( ( ( rule__ProblemDiagram__NodesAssignment_3_0 ) ) | ( ( rule__ProblemDiagram__LinksAssignment_3_1 ) ) );
    public final void rule__ProblemDiagram__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:245:1: ( ( ( rule__ProblemDiagram__NodesAssignment_3_0 ) ) | ( ( rule__ProblemDiagram__LinksAssignment_3_1 ) ) )
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
                    // InternalProblem.g:246:2: ( ( rule__ProblemDiagram__NodesAssignment_3_0 ) )
                    {
                    // InternalProblem.g:246:2: ( ( rule__ProblemDiagram__NodesAssignment_3_0 ) )
                    // InternalProblem.g:247:3: ( rule__ProblemDiagram__NodesAssignment_3_0 )
                    {
                     before(grammarAccess.getProblemDiagramAccess().getNodesAssignment_3_0()); 
                    // InternalProblem.g:248:3: ( rule__ProblemDiagram__NodesAssignment_3_0 )
                    // InternalProblem.g:248:4: rule__ProblemDiagram__NodesAssignment_3_0
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
                    // InternalProblem.g:252:2: ( ( rule__ProblemDiagram__LinksAssignment_3_1 ) )
                    {
                    // InternalProblem.g:252:2: ( ( rule__ProblemDiagram__LinksAssignment_3_1 ) )
                    // InternalProblem.g:253:3: ( rule__ProblemDiagram__LinksAssignment_3_1 )
                    {
                     before(grammarAccess.getProblemDiagramAccess().getLinksAssignment_3_1()); 
                    // InternalProblem.g:254:3: ( rule__ProblemDiagram__LinksAssignment_3_1 )
                    // InternalProblem.g:254:4: rule__ProblemDiagram__LinksAssignment_3_1
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
    // InternalProblem.g:262:1: rule__Node__Alternatives_3_3 : ( ( ( rule__Node__SubproblemAssignment_3_3_0 ) ) | ( ( rule__Node__Group_3_3_1__0 ) ) | ( ( rule__Node__Group_3_3_2__0 ) ) | ( ( rule__Node__Group_3_3_3__0 ) ) );
    public final void rule__Node__Alternatives_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:266:1: ( ( ( rule__Node__SubproblemAssignment_3_3_0 ) ) | ( ( rule__Node__Group_3_3_1__0 ) ) | ( ( rule__Node__Group_3_3_2__0 ) ) | ( ( rule__Node__Group_3_3_3__0 ) ) )
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
                    // InternalProblem.g:267:2: ( ( rule__Node__SubproblemAssignment_3_3_0 ) )
                    {
                    // InternalProblem.g:267:2: ( ( rule__Node__SubproblemAssignment_3_3_0 ) )
                    // InternalProblem.g:268:3: ( rule__Node__SubproblemAssignment_3_3_0 )
                    {
                     before(grammarAccess.getNodeAccess().getSubproblemAssignment_3_3_0()); 
                    // InternalProblem.g:269:3: ( rule__Node__SubproblemAssignment_3_3_0 )
                    // InternalProblem.g:269:4: rule__Node__SubproblemAssignment_3_3_0
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
                    // InternalProblem.g:273:2: ( ( rule__Node__Group_3_3_1__0 ) )
                    {
                    // InternalProblem.g:273:2: ( ( rule__Node__Group_3_3_1__0 ) )
                    // InternalProblem.g:274:3: ( rule__Node__Group_3_3_1__0 )
                    {
                     before(grammarAccess.getNodeAccess().getGroup_3_3_1()); 
                    // InternalProblem.g:275:3: ( rule__Node__Group_3_3_1__0 )
                    // InternalProblem.g:275:4: rule__Node__Group_3_3_1__0
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
                    // InternalProblem.g:279:2: ( ( rule__Node__Group_3_3_2__0 ) )
                    {
                    // InternalProblem.g:279:2: ( ( rule__Node__Group_3_3_2__0 ) )
                    // InternalProblem.g:280:3: ( rule__Node__Group_3_3_2__0 )
                    {
                     before(grammarAccess.getNodeAccess().getGroup_3_3_2()); 
                    // InternalProblem.g:281:3: ( rule__Node__Group_3_3_2__0 )
                    // InternalProblem.g:281:4: rule__Node__Group_3_3_2__0
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
                    // InternalProblem.g:285:2: ( ( rule__Node__Group_3_3_3__0 ) )
                    {
                    // InternalProblem.g:285:2: ( ( rule__Node__Group_3_3_3__0 ) )
                    // InternalProblem.g:286:3: ( rule__Node__Group_3_3_3__0 )
                    {
                     before(grammarAccess.getNodeAccess().getGroup_3_3_3()); 
                    // InternalProblem.g:287:3: ( rule__Node__Group_3_3_3__0 )
                    // InternalProblem.g:287:4: rule__Node__Group_3_3_3__0
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
    // InternalProblem.g:295:1: rule__NodeType__Alternatives : ( ( ( 'R' ) ) | ( ( 'M' ) ) | ( ( 'B' ) ) | ( ( 'X' ) ) | ( ( 'C' ) ) | ( ( 'D' ) ) | ( ( 'P' ) ) | ( ( '?' ) ) );
    public final void rule__NodeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:299:1: ( ( ( 'R' ) ) | ( ( 'M' ) ) | ( ( 'B' ) ) | ( ( 'X' ) ) | ( ( 'C' ) ) | ( ( 'D' ) ) | ( ( 'P' ) ) | ( ( '?' ) ) )
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
                    // InternalProblem.g:300:2: ( ( 'R' ) )
                    {
                    // InternalProblem.g:300:2: ( ( 'R' ) )
                    // InternalProblem.g:301:3: ( 'R' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getREQUIREMENTEnumLiteralDeclaration_0()); 
                    // InternalProblem.g:302:3: ( 'R' )
                    // InternalProblem.g:302:4: 'R'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getREQUIREMENTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:306:2: ( ( 'M' ) )
                    {
                    // InternalProblem.g:306:2: ( ( 'M' ) )
                    // InternalProblem.g:307:3: ( 'M' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getMACHINEEnumLiteralDeclaration_1()); 
                    // InternalProblem.g:308:3: ( 'M' )
                    // InternalProblem.g:308:4: 'M'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getMACHINEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalProblem.g:312:2: ( ( 'B' ) )
                    {
                    // InternalProblem.g:312:2: ( ( 'B' ) )
                    // InternalProblem.g:313:3: ( 'B' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getBIDDABLEEnumLiteralDeclaration_2()); 
                    // InternalProblem.g:314:3: ( 'B' )
                    // InternalProblem.g:314:4: 'B'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getBIDDABLEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalProblem.g:318:2: ( ( 'X' ) )
                    {
                    // InternalProblem.g:318:2: ( ( 'X' ) )
                    // InternalProblem.g:319:3: ( 'X' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getLEXICALEnumLiteralDeclaration_3()); 
                    // InternalProblem.g:320:3: ( 'X' )
                    // InternalProblem.g:320:4: 'X'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getLEXICALEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalProblem.g:324:2: ( ( 'C' ) )
                    {
                    // InternalProblem.g:324:2: ( ( 'C' ) )
                    // InternalProblem.g:325:3: ( 'C' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getCAUSALEnumLiteralDeclaration_4()); 
                    // InternalProblem.g:326:3: ( 'C' )
                    // InternalProblem.g:326:4: 'C'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getCAUSALEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalProblem.g:330:2: ( ( 'D' ) )
                    {
                    // InternalProblem.g:330:2: ( ( 'D' ) )
                    // InternalProblem.g:331:3: ( 'D' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getDESIGNEDEnumLiteralDeclaration_5()); 
                    // InternalProblem.g:332:3: ( 'D' )
                    // InternalProblem.g:332:4: 'D'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getDESIGNEDEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalProblem.g:336:2: ( ( 'P' ) )
                    {
                    // InternalProblem.g:336:2: ( ( 'P' ) )
                    // InternalProblem.g:337:3: ( 'P' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getPHYSICALEnumLiteralDeclaration_6()); 
                    // InternalProblem.g:338:3: ( 'P' )
                    // InternalProblem.g:338:4: 'P'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getPHYSICALEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalProblem.g:342:2: ( ( '?' ) )
                    {
                    // InternalProblem.g:342:2: ( ( '?' ) )
                    // InternalProblem.g:343:3: ( '?' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getCONCERNEnumLiteralDeclaration_7()); 
                    // InternalProblem.g:344:3: ( '?' )
                    // InternalProblem.g:344:4: '?'
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
    // InternalProblem.g:352:1: rule__PhenomenonType__Alternatives : ( ( ( 'phenomenon' ) ) | ( ( 'event' ) ) | ( ( 'state' ) ) );
    public final void rule__PhenomenonType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:356:1: ( ( ( 'phenomenon' ) ) | ( ( 'event' ) ) | ( ( 'state' ) ) )
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
                    // InternalProblem.g:357:2: ( ( 'phenomenon' ) )
                    {
                    // InternalProblem.g:357:2: ( ( 'phenomenon' ) )
                    // InternalProblem.g:358:3: ( 'phenomenon' )
                    {
                     before(grammarAccess.getPhenomenonTypeAccess().getUNSPECIFIEDEnumLiteralDeclaration_0()); 
                    // InternalProblem.g:359:3: ( 'phenomenon' )
                    // InternalProblem.g:359:4: 'phenomenon'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getPhenomenonTypeAccess().getUNSPECIFIEDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:363:2: ( ( 'event' ) )
                    {
                    // InternalProblem.g:363:2: ( ( 'event' ) )
                    // InternalProblem.g:364:3: ( 'event' )
                    {
                     before(grammarAccess.getPhenomenonTypeAccess().getEVENTEnumLiteralDeclaration_1()); 
                    // InternalProblem.g:365:3: ( 'event' )
                    // InternalProblem.g:365:4: 'event'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getPhenomenonTypeAccess().getEVENTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalProblem.g:369:2: ( ( 'state' ) )
                    {
                    // InternalProblem.g:369:2: ( ( 'state' ) )
                    // InternalProblem.g:370:3: ( 'state' )
                    {
                     before(grammarAccess.getPhenomenonTypeAccess().getSTATEEnumLiteralDeclaration_2()); 
                    // InternalProblem.g:371:3: ( 'state' )
                    // InternalProblem.g:371:4: 'state'
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
    // InternalProblem.g:379:1: rule__ConstraintType__Alternatives : ( ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '~' ) ) );
    public final void rule__ConstraintType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:383:1: ( ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '~' ) ) )
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
                    // InternalProblem.g:384:2: ( ( '<' ) )
                    {
                    // InternalProblem.g:384:2: ( ( '<' ) )
                    // InternalProblem.g:385:3: ( '<' )
                    {
                     before(grammarAccess.getConstraintTypeAccess().getStrictPreEnumLiteralDeclaration_0()); 
                    // InternalProblem.g:386:3: ( '<' )
                    // InternalProblem.g:386:4: '<'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getConstraintTypeAccess().getStrictPreEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:390:2: ( ( '<=' ) )
                    {
                    // InternalProblem.g:390:2: ( ( '<=' ) )
                    // InternalProblem.g:391:3: ( '<=' )
                    {
                     before(grammarAccess.getConstraintTypeAccess().getCauseEnumLiteralDeclaration_1()); 
                    // InternalProblem.g:392:3: ( '<=' )
                    // InternalProblem.g:392:4: '<='
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getConstraintTypeAccess().getCauseEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalProblem.g:396:2: ( ( '~' ) )
                    {
                    // InternalProblem.g:396:2: ( ( '~' ) )
                    // InternalProblem.g:397:3: ( '~' )
                    {
                     before(grammarAccess.getConstraintTypeAccess().getAlternateEnumLiteralDeclaration_2()); 
                    // InternalProblem.g:398:3: ( '~' )
                    // InternalProblem.g:398:4: '~'
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
    // InternalProblem.g:406:1: rule__LinkType__Alternatives : ( ( ( '--' ) ) | ( ( '~~' ) ) | ( ( '<~' ) ) | ( ( '->' ) ) | ( ( '~>' ) ) );
    public final void rule__LinkType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:410:1: ( ( ( '--' ) ) | ( ( '~~' ) ) | ( ( '<~' ) ) | ( ( '->' ) ) | ( ( '~>' ) ) )
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
                    // InternalProblem.g:411:2: ( ( '--' ) )
                    {
                    // InternalProblem.g:411:2: ( ( '--' ) )
                    // InternalProblem.g:412:3: ( '--' )
                    {
                     before(grammarAccess.getLinkTypeAccess().getINTERFACEEnumLiteralDeclaration_0()); 
                    // InternalProblem.g:413:3: ( '--' )
                    // InternalProblem.g:413:4: '--'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getLinkTypeAccess().getINTERFACEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:417:2: ( ( '~~' ) )
                    {
                    // InternalProblem.g:417:2: ( ( '~~' ) )
                    // InternalProblem.g:418:3: ( '~~' )
                    {
                     before(grammarAccess.getLinkTypeAccess().getREFERENCEEnumLiteralDeclaration_1()); 
                    // InternalProblem.g:419:3: ( '~~' )
                    // InternalProblem.g:419:4: '~~'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getLinkTypeAccess().getREFERENCEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalProblem.g:423:2: ( ( '<~' ) )
                    {
                    // InternalProblem.g:423:2: ( ( '<~' ) )
                    // InternalProblem.g:424:3: ( '<~' )
                    {
                     before(grammarAccess.getLinkTypeAccess().getCONSTRAINTEnumLiteralDeclaration_2()); 
                    // InternalProblem.g:425:3: ( '<~' )
                    // InternalProblem.g:425:4: '<~'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getLinkTypeAccess().getCONSTRAINTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalProblem.g:429:2: ( ( '->' ) )
                    {
                    // InternalProblem.g:429:2: ( ( '->' ) )
                    // InternalProblem.g:430:3: ( '->' )
                    {
                     before(grammarAccess.getLinkTypeAccess().getCONCERNEnumLiteralDeclaration_3()); 
                    // InternalProblem.g:431:3: ( '->' )
                    // InternalProblem.g:431:4: '->'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getLinkTypeAccess().getCONCERNEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalProblem.g:435:2: ( ( '~>' ) )
                    {
                    // InternalProblem.g:435:2: ( ( '~>' ) )
                    // InternalProblem.g:436:3: ( '~>' )
                    {
                     before(grammarAccess.getLinkTypeAccess().getINV_CONSTRAINTEnumLiteralDeclaration_4()); 
                    // InternalProblem.g:437:3: ( '~>' )
                    // InternalProblem.g:437:4: '~>'
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
    // InternalProblem.g:445:1: rule__ProblemDiagram__Group__0 : rule__ProblemDiagram__Group__0__Impl rule__ProblemDiagram__Group__1 ;
    public final void rule__ProblemDiagram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:449:1: ( rule__ProblemDiagram__Group__0__Impl rule__ProblemDiagram__Group__1 )
            // InternalProblem.g:450:2: rule__ProblemDiagram__Group__0__Impl rule__ProblemDiagram__Group__1
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
    // InternalProblem.g:457:1: rule__ProblemDiagram__Group__0__Impl : ( 'problem:' ) ;
    public final void rule__ProblemDiagram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:461:1: ( ( 'problem:' ) )
            // InternalProblem.g:462:1: ( 'problem:' )
            {
            // InternalProblem.g:462:1: ( 'problem:' )
            // InternalProblem.g:463:2: 'problem:'
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
    // InternalProblem.g:472:1: rule__ProblemDiagram__Group__1 : rule__ProblemDiagram__Group__1__Impl rule__ProblemDiagram__Group__2 ;
    public final void rule__ProblemDiagram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:476:1: ( rule__ProblemDiagram__Group__1__Impl rule__ProblemDiagram__Group__2 )
            // InternalProblem.g:477:2: rule__ProblemDiagram__Group__1__Impl rule__ProblemDiagram__Group__2
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
    // InternalProblem.g:484:1: rule__ProblemDiagram__Group__1__Impl : ( ( rule__ProblemDiagram__NameAssignment_1 ) ) ;
    public final void rule__ProblemDiagram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:488:1: ( ( ( rule__ProblemDiagram__NameAssignment_1 ) ) )
            // InternalProblem.g:489:1: ( ( rule__ProblemDiagram__NameAssignment_1 ) )
            {
            // InternalProblem.g:489:1: ( ( rule__ProblemDiagram__NameAssignment_1 ) )
            // InternalProblem.g:490:2: ( rule__ProblemDiagram__NameAssignment_1 )
            {
             before(grammarAccess.getProblemDiagramAccess().getNameAssignment_1()); 
            // InternalProblem.g:491:2: ( rule__ProblemDiagram__NameAssignment_1 )
            // InternalProblem.g:491:3: rule__ProblemDiagram__NameAssignment_1
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
    // InternalProblem.g:499:1: rule__ProblemDiagram__Group__2 : rule__ProblemDiagram__Group__2__Impl rule__ProblemDiagram__Group__3 ;
    public final void rule__ProblemDiagram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:503:1: ( rule__ProblemDiagram__Group__2__Impl rule__ProblemDiagram__Group__3 )
            // InternalProblem.g:504:2: rule__ProblemDiagram__Group__2__Impl rule__ProblemDiagram__Group__3
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
    // InternalProblem.g:511:1: rule__ProblemDiagram__Group__2__Impl : ( ( rule__ProblemDiagram__Group_2__0 )? ) ;
    public final void rule__ProblemDiagram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:515:1: ( ( ( rule__ProblemDiagram__Group_2__0 )? ) )
            // InternalProblem.g:516:1: ( ( rule__ProblemDiagram__Group_2__0 )? )
            {
            // InternalProblem.g:516:1: ( ( rule__ProblemDiagram__Group_2__0 )? )
            // InternalProblem.g:517:2: ( rule__ProblemDiagram__Group_2__0 )?
            {
             before(grammarAccess.getProblemDiagramAccess().getGroup_2()); 
            // InternalProblem.g:518:2: ( rule__ProblemDiagram__Group_2__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==32) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalProblem.g:518:3: rule__ProblemDiagram__Group_2__0
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
    // InternalProblem.g:526:1: rule__ProblemDiagram__Group__3 : rule__ProblemDiagram__Group__3__Impl ;
    public final void rule__ProblemDiagram__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:530:1: ( rule__ProblemDiagram__Group__3__Impl )
            // InternalProblem.g:531:2: rule__ProblemDiagram__Group__3__Impl
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
    // InternalProblem.g:537:1: rule__ProblemDiagram__Group__3__Impl : ( ( rule__ProblemDiagram__Alternatives_3 )* ) ;
    public final void rule__ProblemDiagram__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:541:1: ( ( ( rule__ProblemDiagram__Alternatives_3 )* ) )
            // InternalProblem.g:542:1: ( ( rule__ProblemDiagram__Alternatives_3 )* )
            {
            // InternalProblem.g:542:1: ( ( rule__ProblemDiagram__Alternatives_3 )* )
            // InternalProblem.g:543:2: ( rule__ProblemDiagram__Alternatives_3 )*
            {
             before(grammarAccess.getProblemDiagramAccess().getAlternatives_3()); 
            // InternalProblem.g:544:2: ( rule__ProblemDiagram__Alternatives_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalProblem.g:544:3: rule__ProblemDiagram__Alternatives_3
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
    // InternalProblem.g:553:1: rule__ProblemDiagram__Group_2__0 : rule__ProblemDiagram__Group_2__0__Impl rule__ProblemDiagram__Group_2__1 ;
    public final void rule__ProblemDiagram__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:557:1: ( rule__ProblemDiagram__Group_2__0__Impl rule__ProblemDiagram__Group_2__1 )
            // InternalProblem.g:558:2: rule__ProblemDiagram__Group_2__0__Impl rule__ProblemDiagram__Group_2__1
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
    // InternalProblem.g:565:1: rule__ProblemDiagram__Group_2__0__Impl : ( 'for' ) ;
    public final void rule__ProblemDiagram__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:569:1: ( ( 'for' ) )
            // InternalProblem.g:570:1: ( 'for' )
            {
            // InternalProblem.g:570:1: ( 'for' )
            // InternalProblem.g:571:2: 'for'
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
    // InternalProblem.g:580:1: rule__ProblemDiagram__Group_2__1 : rule__ProblemDiagram__Group_2__1__Impl ;
    public final void rule__ProblemDiagram__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:584:1: ( rule__ProblemDiagram__Group_2__1__Impl )
            // InternalProblem.g:585:2: rule__ProblemDiagram__Group_2__1__Impl
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
    // InternalProblem.g:591:1: rule__ProblemDiagram__Group_2__1__Impl : ( ( rule__ProblemDiagram__HighlightAssignment_2_1 ) ) ;
    public final void rule__ProblemDiagram__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:595:1: ( ( ( rule__ProblemDiagram__HighlightAssignment_2_1 ) ) )
            // InternalProblem.g:596:1: ( ( rule__ProblemDiagram__HighlightAssignment_2_1 ) )
            {
            // InternalProblem.g:596:1: ( ( rule__ProblemDiagram__HighlightAssignment_2_1 ) )
            // InternalProblem.g:597:2: ( rule__ProblemDiagram__HighlightAssignment_2_1 )
            {
             before(grammarAccess.getProblemDiagramAccess().getHighlightAssignment_2_1()); 
            // InternalProblem.g:598:2: ( rule__ProblemDiagram__HighlightAssignment_2_1 )
            // InternalProblem.g:598:3: rule__ProblemDiagram__HighlightAssignment_2_1
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
    // InternalProblem.g:607:1: rule__Node__Group__0 : rule__Node__Group__0__Impl rule__Node__Group__1 ;
    public final void rule__Node__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:611:1: ( rule__Node__Group__0__Impl rule__Node__Group__1 )
            // InternalProblem.g:612:2: rule__Node__Group__0__Impl rule__Node__Group__1
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
    // InternalProblem.g:619:1: rule__Node__Group__0__Impl : ( ( rule__Node__NameAssignment_0 ) ) ;
    public final void rule__Node__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:623:1: ( ( ( rule__Node__NameAssignment_0 ) ) )
            // InternalProblem.g:624:1: ( ( rule__Node__NameAssignment_0 ) )
            {
            // InternalProblem.g:624:1: ( ( rule__Node__NameAssignment_0 ) )
            // InternalProblem.g:625:2: ( rule__Node__NameAssignment_0 )
            {
             before(grammarAccess.getNodeAccess().getNameAssignment_0()); 
            // InternalProblem.g:626:2: ( rule__Node__NameAssignment_0 )
            // InternalProblem.g:626:3: rule__Node__NameAssignment_0
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
    // InternalProblem.g:634:1: rule__Node__Group__1 : rule__Node__Group__1__Impl rule__Node__Group__2 ;
    public final void rule__Node__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:638:1: ( rule__Node__Group__1__Impl rule__Node__Group__2 )
            // InternalProblem.g:639:2: rule__Node__Group__1__Impl rule__Node__Group__2
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
    // InternalProblem.g:646:1: rule__Node__Group__1__Impl : ( ( rule__Node__TypeAssignment_1 )? ) ;
    public final void rule__Node__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:650:1: ( ( ( rule__Node__TypeAssignment_1 )? ) )
            // InternalProblem.g:651:1: ( ( rule__Node__TypeAssignment_1 )? )
            {
            // InternalProblem.g:651:1: ( ( rule__Node__TypeAssignment_1 )? )
            // InternalProblem.g:652:2: ( rule__Node__TypeAssignment_1 )?
            {
             before(grammarAccess.getNodeAccess().getTypeAssignment_1()); 
            // InternalProblem.g:653:2: ( rule__Node__TypeAssignment_1 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=12 && LA9_0<=19)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalProblem.g:653:3: rule__Node__TypeAssignment_1
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
    // InternalProblem.g:661:1: rule__Node__Group__2 : rule__Node__Group__2__Impl rule__Node__Group__3 ;
    public final void rule__Node__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:665:1: ( rule__Node__Group__2__Impl rule__Node__Group__3 )
            // InternalProblem.g:666:2: rule__Node__Group__2__Impl rule__Node__Group__3
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
    // InternalProblem.g:673:1: rule__Node__Group__2__Impl : ( ( rule__Node__Group_2__0 )? ) ;
    public final void rule__Node__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:677:1: ( ( ( rule__Node__Group_2__0 )? ) )
            // InternalProblem.g:678:1: ( ( rule__Node__Group_2__0 )? )
            {
            // InternalProblem.g:678:1: ( ( rule__Node__Group_2__0 )? )
            // InternalProblem.g:679:2: ( rule__Node__Group_2__0 )?
            {
             before(grammarAccess.getNodeAccess().getGroup_2()); 
            // InternalProblem.g:680:2: ( rule__Node__Group_2__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING||LA10_0==33) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalProblem.g:680:3: rule__Node__Group_2__0
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
    // InternalProblem.g:688:1: rule__Node__Group__3 : rule__Node__Group__3__Impl ;
    public final void rule__Node__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:692:1: ( rule__Node__Group__3__Impl )
            // InternalProblem.g:693:2: rule__Node__Group__3__Impl
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
    // InternalProblem.g:699:1: rule__Node__Group__3__Impl : ( ( rule__Node__Group_3__0 )? ) ;
    public final void rule__Node__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:703:1: ( ( ( rule__Node__Group_3__0 )? ) )
            // InternalProblem.g:704:1: ( ( rule__Node__Group_3__0 )? )
            {
            // InternalProblem.g:704:1: ( ( rule__Node__Group_3__0 )? )
            // InternalProblem.g:705:2: ( rule__Node__Group_3__0 )?
            {
             before(grammarAccess.getNodeAccess().getGroup_3()); 
            // InternalProblem.g:706:2: ( rule__Node__Group_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==34) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalProblem.g:706:3: rule__Node__Group_3__0
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
    // InternalProblem.g:715:1: rule__Node__Group_2__0 : rule__Node__Group_2__0__Impl rule__Node__Group_2__1 ;
    public final void rule__Node__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:719:1: ( rule__Node__Group_2__0__Impl rule__Node__Group_2__1 )
            // InternalProblem.g:720:2: rule__Node__Group_2__0__Impl rule__Node__Group_2__1
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
    // InternalProblem.g:727:1: rule__Node__Group_2__0__Impl : ( ( ':' )? ) ;
    public final void rule__Node__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:731:1: ( ( ( ':' )? ) )
            // InternalProblem.g:732:1: ( ( ':' )? )
            {
            // InternalProblem.g:732:1: ( ( ':' )? )
            // InternalProblem.g:733:2: ( ':' )?
            {
             before(grammarAccess.getNodeAccess().getColonKeyword_2_0()); 
            // InternalProblem.g:734:2: ( ':' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==33) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalProblem.g:734:3: ':'
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
    // InternalProblem.g:742:1: rule__Node__Group_2__1 : rule__Node__Group_2__1__Impl ;
    public final void rule__Node__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:746:1: ( rule__Node__Group_2__1__Impl )
            // InternalProblem.g:747:2: rule__Node__Group_2__1__Impl
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
    // InternalProblem.g:753:1: rule__Node__Group_2__1__Impl : ( ( rule__Node__DescriptionAssignment_2_1 ) ) ;
    public final void rule__Node__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:757:1: ( ( ( rule__Node__DescriptionAssignment_2_1 ) ) )
            // InternalProblem.g:758:1: ( ( rule__Node__DescriptionAssignment_2_1 ) )
            {
            // InternalProblem.g:758:1: ( ( rule__Node__DescriptionAssignment_2_1 ) )
            // InternalProblem.g:759:2: ( rule__Node__DescriptionAssignment_2_1 )
            {
             before(grammarAccess.getNodeAccess().getDescriptionAssignment_2_1()); 
            // InternalProblem.g:760:2: ( rule__Node__DescriptionAssignment_2_1 )
            // InternalProblem.g:760:3: rule__Node__DescriptionAssignment_2_1
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
    // InternalProblem.g:769:1: rule__Node__Group_3__0 : rule__Node__Group_3__0__Impl rule__Node__Group_3__1 ;
    public final void rule__Node__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:773:1: ( rule__Node__Group_3__0__Impl rule__Node__Group_3__1 )
            // InternalProblem.g:774:2: rule__Node__Group_3__0__Impl rule__Node__Group_3__1
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
    // InternalProblem.g:781:1: rule__Node__Group_3__0__Impl : ( '{' ) ;
    public final void rule__Node__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:785:1: ( ( '{' ) )
            // InternalProblem.g:786:1: ( '{' )
            {
            // InternalProblem.g:786:1: ( '{' )
            // InternalProblem.g:787:2: '{'
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
    // InternalProblem.g:796:1: rule__Node__Group_3__1 : rule__Node__Group_3__1__Impl rule__Node__Group_3__2 ;
    public final void rule__Node__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:800:1: ( rule__Node__Group_3__1__Impl rule__Node__Group_3__2 )
            // InternalProblem.g:801:2: rule__Node__Group_3__1__Impl rule__Node__Group_3__2
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
    // InternalProblem.g:808:1: rule__Node__Group_3__1__Impl : ( ( rule__Node__Group_3_1__0 )? ) ;
    public final void rule__Node__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:812:1: ( ( ( rule__Node__Group_3_1__0 )? ) )
            // InternalProblem.g:813:1: ( ( rule__Node__Group_3_1__0 )? )
            {
            // InternalProblem.g:813:1: ( ( rule__Node__Group_3_1__0 )? )
            // InternalProblem.g:814:2: ( rule__Node__Group_3_1__0 )?
            {
             before(grammarAccess.getNodeAccess().getGroup_3_1()); 
            // InternalProblem.g:815:2: ( rule__Node__Group_3_1__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID||(LA13_0>=20 && LA13_0<=22)||LA13_0==43) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalProblem.g:815:3: rule__Node__Group_3_1__0
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
    // InternalProblem.g:823:1: rule__Node__Group_3__2 : rule__Node__Group_3__2__Impl rule__Node__Group_3__3 ;
    public final void rule__Node__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:827:1: ( rule__Node__Group_3__2__Impl rule__Node__Group_3__3 )
            // InternalProblem.g:828:2: rule__Node__Group_3__2__Impl rule__Node__Group_3__3
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
    // InternalProblem.g:835:1: rule__Node__Group_3__2__Impl : ( ( rule__Node__Group_3_2__0 )? ) ;
    public final void rule__Node__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:839:1: ( ( ( rule__Node__Group_3_2__0 )? ) )
            // InternalProblem.g:840:1: ( ( rule__Node__Group_3_2__0 )? )
            {
            // InternalProblem.g:840:1: ( ( rule__Node__Group_3_2__0 )? )
            // InternalProblem.g:841:2: ( rule__Node__Group_3_2__0 )?
            {
             before(grammarAccess.getNodeAccess().getGroup_3_2()); 
            // InternalProblem.g:842:2: ( rule__Node__Group_3_2__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=23 && LA14_0<=25)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalProblem.g:842:3: rule__Node__Group_3_2__0
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
    // InternalProblem.g:850:1: rule__Node__Group_3__3 : rule__Node__Group_3__3__Impl rule__Node__Group_3__4 ;
    public final void rule__Node__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:854:1: ( rule__Node__Group_3__3__Impl rule__Node__Group_3__4 )
            // InternalProblem.g:855:2: rule__Node__Group_3__3__Impl rule__Node__Group_3__4
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
    // InternalProblem.g:862:1: rule__Node__Group_3__3__Impl : ( ( rule__Node__Alternatives_3_3 )* ) ;
    public final void rule__Node__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:866:1: ( ( ( rule__Node__Alternatives_3_3 )* ) )
            // InternalProblem.g:867:1: ( ( rule__Node__Alternatives_3_3 )* )
            {
            // InternalProblem.g:867:1: ( ( rule__Node__Alternatives_3_3 )* )
            // InternalProblem.g:868:2: ( rule__Node__Alternatives_3_3 )*
            {
             before(grammarAccess.getNodeAccess().getAlternatives_3_3()); 
            // InternalProblem.g:869:2: ( rule__Node__Alternatives_3_3 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==31||LA15_0==38) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalProblem.g:869:3: rule__Node__Alternatives_3_3
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
    // InternalProblem.g:877:1: rule__Node__Group_3__4 : rule__Node__Group_3__4__Impl ;
    public final void rule__Node__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:881:1: ( rule__Node__Group_3__4__Impl )
            // InternalProblem.g:882:2: rule__Node__Group_3__4__Impl
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
    // InternalProblem.g:888:1: rule__Node__Group_3__4__Impl : ( '}' ) ;
    public final void rule__Node__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:892:1: ( ( '}' ) )
            // InternalProblem.g:893:1: ( '}' )
            {
            // InternalProblem.g:893:1: ( '}' )
            // InternalProblem.g:894:2: '}'
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
    // InternalProblem.g:904:1: rule__Node__Group_3_1__0 : rule__Node__Group_3_1__0__Impl rule__Node__Group_3_1__1 ;
    public final void rule__Node__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:908:1: ( rule__Node__Group_3_1__0__Impl rule__Node__Group_3_1__1 )
            // InternalProblem.g:909:2: rule__Node__Group_3_1__0__Impl rule__Node__Group_3_1__1
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
    // InternalProblem.g:916:1: rule__Node__Group_3_1__0__Impl : ( ( rule__Node__HiddenPhenomenaAssignment_3_1_0 ) ) ;
    public final void rule__Node__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:920:1: ( ( ( rule__Node__HiddenPhenomenaAssignment_3_1_0 ) ) )
            // InternalProblem.g:921:1: ( ( rule__Node__HiddenPhenomenaAssignment_3_1_0 ) )
            {
            // InternalProblem.g:921:1: ( ( rule__Node__HiddenPhenomenaAssignment_3_1_0 ) )
            // InternalProblem.g:922:2: ( rule__Node__HiddenPhenomenaAssignment_3_1_0 )
            {
             before(grammarAccess.getNodeAccess().getHiddenPhenomenaAssignment_3_1_0()); 
            // InternalProblem.g:923:2: ( rule__Node__HiddenPhenomenaAssignment_3_1_0 )
            // InternalProblem.g:923:3: rule__Node__HiddenPhenomenaAssignment_3_1_0
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
    // InternalProblem.g:931:1: rule__Node__Group_3_1__1 : rule__Node__Group_3_1__1__Impl ;
    public final void rule__Node__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:935:1: ( rule__Node__Group_3_1__1__Impl )
            // InternalProblem.g:936:2: rule__Node__Group_3_1__1__Impl
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
    // InternalProblem.g:942:1: rule__Node__Group_3_1__1__Impl : ( ( rule__Node__Group_3_1_1__0 )* ) ;
    public final void rule__Node__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:946:1: ( ( ( rule__Node__Group_3_1_1__0 )* ) )
            // InternalProblem.g:947:1: ( ( rule__Node__Group_3_1_1__0 )* )
            {
            // InternalProblem.g:947:1: ( ( rule__Node__Group_3_1_1__0 )* )
            // InternalProblem.g:948:2: ( rule__Node__Group_3_1_1__0 )*
            {
             before(grammarAccess.getNodeAccess().getGroup_3_1_1()); 
            // InternalProblem.g:949:2: ( rule__Node__Group_3_1_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==36) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalProblem.g:949:3: rule__Node__Group_3_1_1__0
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
    // InternalProblem.g:958:1: rule__Node__Group_3_1_1__0 : rule__Node__Group_3_1_1__0__Impl rule__Node__Group_3_1_1__1 ;
    public final void rule__Node__Group_3_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:962:1: ( rule__Node__Group_3_1_1__0__Impl rule__Node__Group_3_1_1__1 )
            // InternalProblem.g:963:2: rule__Node__Group_3_1_1__0__Impl rule__Node__Group_3_1_1__1
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
    // InternalProblem.g:970:1: rule__Node__Group_3_1_1__0__Impl : ( ',' ) ;
    public final void rule__Node__Group_3_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:974:1: ( ( ',' ) )
            // InternalProblem.g:975:1: ( ',' )
            {
            // InternalProblem.g:975:1: ( ',' )
            // InternalProblem.g:976:2: ','
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
    // InternalProblem.g:985:1: rule__Node__Group_3_1_1__1 : rule__Node__Group_3_1_1__1__Impl ;
    public final void rule__Node__Group_3_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:989:1: ( rule__Node__Group_3_1_1__1__Impl )
            // InternalProblem.g:990:2: rule__Node__Group_3_1_1__1__Impl
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
    // InternalProblem.g:996:1: rule__Node__Group_3_1_1__1__Impl : ( ( rule__Node__HiddenPhenomenaAssignment_3_1_1_1 ) ) ;
    public final void rule__Node__Group_3_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1000:1: ( ( ( rule__Node__HiddenPhenomenaAssignment_3_1_1_1 ) ) )
            // InternalProblem.g:1001:1: ( ( rule__Node__HiddenPhenomenaAssignment_3_1_1_1 ) )
            {
            // InternalProblem.g:1001:1: ( ( rule__Node__HiddenPhenomenaAssignment_3_1_1_1 ) )
            // InternalProblem.g:1002:2: ( rule__Node__HiddenPhenomenaAssignment_3_1_1_1 )
            {
             before(grammarAccess.getNodeAccess().getHiddenPhenomenaAssignment_3_1_1_1()); 
            // InternalProblem.g:1003:2: ( rule__Node__HiddenPhenomenaAssignment_3_1_1_1 )
            // InternalProblem.g:1003:3: rule__Node__HiddenPhenomenaAssignment_3_1_1_1
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
    // InternalProblem.g:1012:1: rule__Node__Group_3_2__0 : rule__Node__Group_3_2__0__Impl rule__Node__Group_3_2__1 ;
    public final void rule__Node__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1016:1: ( rule__Node__Group_3_2__0__Impl rule__Node__Group_3_2__1 )
            // InternalProblem.g:1017:2: rule__Node__Group_3_2__0__Impl rule__Node__Group_3_2__1
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
    // InternalProblem.g:1024:1: rule__Node__Group_3_2__0__Impl : ( ( rule__Node__TimingConstraintAssignment_3_2_0 ) ) ;
    public final void rule__Node__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1028:1: ( ( ( rule__Node__TimingConstraintAssignment_3_2_0 ) ) )
            // InternalProblem.g:1029:1: ( ( rule__Node__TimingConstraintAssignment_3_2_0 ) )
            {
            // InternalProblem.g:1029:1: ( ( rule__Node__TimingConstraintAssignment_3_2_0 ) )
            // InternalProblem.g:1030:2: ( rule__Node__TimingConstraintAssignment_3_2_0 )
            {
             before(grammarAccess.getNodeAccess().getTimingConstraintAssignment_3_2_0()); 
            // InternalProblem.g:1031:2: ( rule__Node__TimingConstraintAssignment_3_2_0 )
            // InternalProblem.g:1031:3: rule__Node__TimingConstraintAssignment_3_2_0
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
    // InternalProblem.g:1039:1: rule__Node__Group_3_2__1 : rule__Node__Group_3_2__1__Impl ;
    public final void rule__Node__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1043:1: ( rule__Node__Group_3_2__1__Impl )
            // InternalProblem.g:1044:2: rule__Node__Group_3_2__1__Impl
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
    // InternalProblem.g:1050:1: rule__Node__Group_3_2__1__Impl : ( ( rule__Node__Group_3_2_1__0 )* ) ;
    public final void rule__Node__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1054:1: ( ( ( rule__Node__Group_3_2_1__0 )* ) )
            // InternalProblem.g:1055:1: ( ( rule__Node__Group_3_2_1__0 )* )
            {
            // InternalProblem.g:1055:1: ( ( rule__Node__Group_3_2_1__0 )* )
            // InternalProblem.g:1056:2: ( rule__Node__Group_3_2_1__0 )*
            {
             before(grammarAccess.getNodeAccess().getGroup_3_2_1()); 
            // InternalProblem.g:1057:2: ( rule__Node__Group_3_2_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==37) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalProblem.g:1057:3: rule__Node__Group_3_2_1__0
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
    // InternalProblem.g:1066:1: rule__Node__Group_3_2_1__0 : rule__Node__Group_3_2_1__0__Impl rule__Node__Group_3_2_1__1 ;
    public final void rule__Node__Group_3_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1070:1: ( rule__Node__Group_3_2_1__0__Impl rule__Node__Group_3_2_1__1 )
            // InternalProblem.g:1071:2: rule__Node__Group_3_2_1__0__Impl rule__Node__Group_3_2_1__1
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
    // InternalProblem.g:1078:1: rule__Node__Group_3_2_1__0__Impl : ( ';' ) ;
    public final void rule__Node__Group_3_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1082:1: ( ( ';' ) )
            // InternalProblem.g:1083:1: ( ';' )
            {
            // InternalProblem.g:1083:1: ( ';' )
            // InternalProblem.g:1084:2: ';'
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
    // InternalProblem.g:1093:1: rule__Node__Group_3_2_1__1 : rule__Node__Group_3_2_1__1__Impl ;
    public final void rule__Node__Group_3_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1097:1: ( rule__Node__Group_3_2_1__1__Impl )
            // InternalProblem.g:1098:2: rule__Node__Group_3_2_1__1__Impl
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
    // InternalProblem.g:1104:1: rule__Node__Group_3_2_1__1__Impl : ( ( rule__Node__TimingConstraintAssignment_3_2_1_1 ) ) ;
    public final void rule__Node__Group_3_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1108:1: ( ( ( rule__Node__TimingConstraintAssignment_3_2_1_1 ) ) )
            // InternalProblem.g:1109:1: ( ( rule__Node__TimingConstraintAssignment_3_2_1_1 ) )
            {
            // InternalProblem.g:1109:1: ( ( rule__Node__TimingConstraintAssignment_3_2_1_1 ) )
            // InternalProblem.g:1110:2: ( rule__Node__TimingConstraintAssignment_3_2_1_1 )
            {
             before(grammarAccess.getNodeAccess().getTimingConstraintAssignment_3_2_1_1()); 
            // InternalProblem.g:1111:2: ( rule__Node__TimingConstraintAssignment_3_2_1_1 )
            // InternalProblem.g:1111:3: rule__Node__TimingConstraintAssignment_3_2_1_1
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
    // InternalProblem.g:1120:1: rule__Node__Group_3_3_1__0 : rule__Node__Group_3_3_1__0__Impl rule__Node__Group_3_3_1__1 ;
    public final void rule__Node__Group_3_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1124:1: ( rule__Node__Group_3_3_1__0__Impl rule__Node__Group_3_3_1__1 )
            // InternalProblem.g:1125:2: rule__Node__Group_3_3_1__0__Impl rule__Node__Group_3_3_1__1
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
    // InternalProblem.g:1132:1: rule__Node__Group_3_3_1__0__Impl : ( 'see' ) ;
    public final void rule__Node__Group_3_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1136:1: ( ( 'see' ) )
            // InternalProblem.g:1137:1: ( 'see' )
            {
            // InternalProblem.g:1137:1: ( 'see' )
            // InternalProblem.g:1138:2: 'see'
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
    // InternalProblem.g:1147:1: rule__Node__Group_3_3_1__1 : rule__Node__Group_3_3_1__1__Impl rule__Node__Group_3_3_1__2 ;
    public final void rule__Node__Group_3_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1151:1: ( rule__Node__Group_3_3_1__1__Impl rule__Node__Group_3_3_1__2 )
            // InternalProblem.g:1152:2: rule__Node__Group_3_3_1__1__Impl rule__Node__Group_3_3_1__2
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
    // InternalProblem.g:1159:1: rule__Node__Group_3_3_1__1__Impl : ( 'domain' ) ;
    public final void rule__Node__Group_3_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1163:1: ( ( 'domain' ) )
            // InternalProblem.g:1164:1: ( 'domain' )
            {
            // InternalProblem.g:1164:1: ( 'domain' )
            // InternalProblem.g:1165:2: 'domain'
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
    // InternalProblem.g:1174:1: rule__Node__Group_3_3_1__2 : rule__Node__Group_3_3_1__2__Impl ;
    public final void rule__Node__Group_3_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1178:1: ( rule__Node__Group_3_3_1__2__Impl )
            // InternalProblem.g:1179:2: rule__Node__Group_3_3_1__2__Impl
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
    // InternalProblem.g:1185:1: rule__Node__Group_3_3_1__2__Impl : ( ( rule__Node__ProblemNodeRefAssignment_3_3_1_2 ) ) ;
    public final void rule__Node__Group_3_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1189:1: ( ( ( rule__Node__ProblemNodeRefAssignment_3_3_1_2 ) ) )
            // InternalProblem.g:1190:1: ( ( rule__Node__ProblemNodeRefAssignment_3_3_1_2 ) )
            {
            // InternalProblem.g:1190:1: ( ( rule__Node__ProblemNodeRefAssignment_3_3_1_2 ) )
            // InternalProblem.g:1191:2: ( rule__Node__ProblemNodeRefAssignment_3_3_1_2 )
            {
             before(grammarAccess.getNodeAccess().getProblemNodeRefAssignment_3_3_1_2()); 
            // InternalProblem.g:1192:2: ( rule__Node__ProblemNodeRefAssignment_3_3_1_2 )
            // InternalProblem.g:1192:3: rule__Node__ProblemNodeRefAssignment_3_3_1_2
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
    // InternalProblem.g:1201:1: rule__Node__Group_3_3_2__0 : rule__Node__Group_3_3_2__0__Impl rule__Node__Group_3_3_2__1 ;
    public final void rule__Node__Group_3_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1205:1: ( rule__Node__Group_3_3_2__0__Impl rule__Node__Group_3_3_2__1 )
            // InternalProblem.g:1206:2: rule__Node__Group_3_3_2__0__Impl rule__Node__Group_3_3_2__1
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
    // InternalProblem.g:1213:1: rule__Node__Group_3_3_2__0__Impl : ( 'see' ) ;
    public final void rule__Node__Group_3_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1217:1: ( ( 'see' ) )
            // InternalProblem.g:1218:1: ( 'see' )
            {
            // InternalProblem.g:1218:1: ( 'see' )
            // InternalProblem.g:1219:2: 'see'
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
    // InternalProblem.g:1228:1: rule__Node__Group_3_3_2__1 : rule__Node__Group_3_3_2__1__Impl rule__Node__Group_3_3_2__2 ;
    public final void rule__Node__Group_3_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1232:1: ( rule__Node__Group_3_3_2__1__Impl rule__Node__Group_3_3_2__2 )
            // InternalProblem.g:1233:2: rule__Node__Group_3_3_2__1__Impl rule__Node__Group_3_3_2__2
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
    // InternalProblem.g:1240:1: rule__Node__Group_3_3_2__1__Impl : ( 'problem' ) ;
    public final void rule__Node__Group_3_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1244:1: ( ( 'problem' ) )
            // InternalProblem.g:1245:1: ( 'problem' )
            {
            // InternalProblem.g:1245:1: ( 'problem' )
            // InternalProblem.g:1246:2: 'problem'
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
    // InternalProblem.g:1255:1: rule__Node__Group_3_3_2__2 : rule__Node__Group_3_3_2__2__Impl ;
    public final void rule__Node__Group_3_3_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1259:1: ( rule__Node__Group_3_3_2__2__Impl )
            // InternalProblem.g:1260:2: rule__Node__Group_3_3_2__2__Impl
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
    // InternalProblem.g:1266:1: rule__Node__Group_3_3_2__2__Impl : ( ( rule__Node__ProblemRefAssignment_3_3_2_2 ) ) ;
    public final void rule__Node__Group_3_3_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1270:1: ( ( ( rule__Node__ProblemRefAssignment_3_3_2_2 ) ) )
            // InternalProblem.g:1271:1: ( ( rule__Node__ProblemRefAssignment_3_3_2_2 ) )
            {
            // InternalProblem.g:1271:1: ( ( rule__Node__ProblemRefAssignment_3_3_2_2 ) )
            // InternalProblem.g:1272:2: ( rule__Node__ProblemRefAssignment_3_3_2_2 )
            {
             before(grammarAccess.getNodeAccess().getProblemRefAssignment_3_3_2_2()); 
            // InternalProblem.g:1273:2: ( rule__Node__ProblemRefAssignment_3_3_2_2 )
            // InternalProblem.g:1273:3: rule__Node__ProblemRefAssignment_3_3_2_2
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
    // InternalProblem.g:1282:1: rule__Node__Group_3_3_3__0 : rule__Node__Group_3_3_3__0__Impl rule__Node__Group_3_3_3__1 ;
    public final void rule__Node__Group_3_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1286:1: ( rule__Node__Group_3_3_3__0__Impl rule__Node__Group_3_3_3__1 )
            // InternalProblem.g:1287:2: rule__Node__Group_3_3_3__0__Impl rule__Node__Group_3_3_3__1
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
    // InternalProblem.g:1294:1: rule__Node__Group_3_3_3__0__Impl : ( 'see' ) ;
    public final void rule__Node__Group_3_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1298:1: ( ( 'see' ) )
            // InternalProblem.g:1299:1: ( 'see' )
            {
            // InternalProblem.g:1299:1: ( 'see' )
            // InternalProblem.g:1300:2: 'see'
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
    // InternalProblem.g:1309:1: rule__Node__Group_3_3_3__1 : rule__Node__Group_3_3_3__1__Impl ;
    public final void rule__Node__Group_3_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1313:1: ( rule__Node__Group_3_3_3__1__Impl )
            // InternalProblem.g:1314:2: rule__Node__Group_3_3_3__1__Impl
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
    // InternalProblem.g:1320:1: rule__Node__Group_3_3_3__1__Impl : ( ( rule__Node__HrefAssignment_3_3_3_1 ) ) ;
    public final void rule__Node__Group_3_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1324:1: ( ( ( rule__Node__HrefAssignment_3_3_3_1 ) ) )
            // InternalProblem.g:1325:1: ( ( rule__Node__HrefAssignment_3_3_3_1 ) )
            {
            // InternalProblem.g:1325:1: ( ( rule__Node__HrefAssignment_3_3_3_1 ) )
            // InternalProblem.g:1326:2: ( rule__Node__HrefAssignment_3_3_3_1 )
            {
             before(grammarAccess.getNodeAccess().getHrefAssignment_3_3_3_1()); 
            // InternalProblem.g:1327:2: ( rule__Node__HrefAssignment_3_3_3_1 )
            // InternalProblem.g:1327:3: rule__Node__HrefAssignment_3_3_3_1
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
    // InternalProblem.g:1336:1: rule__Phenomenon__Group__0 : rule__Phenomenon__Group__0__Impl rule__Phenomenon__Group__1 ;
    public final void rule__Phenomenon__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1340:1: ( rule__Phenomenon__Group__0__Impl rule__Phenomenon__Group__1 )
            // InternalProblem.g:1341:2: rule__Phenomenon__Group__0__Impl rule__Phenomenon__Group__1
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
    // InternalProblem.g:1348:1: rule__Phenomenon__Group__0__Impl : ( ( rule__Phenomenon__TypeAssignment_0 )? ) ;
    public final void rule__Phenomenon__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1352:1: ( ( ( rule__Phenomenon__TypeAssignment_0 )? ) )
            // InternalProblem.g:1353:1: ( ( rule__Phenomenon__TypeAssignment_0 )? )
            {
            // InternalProblem.g:1353:1: ( ( rule__Phenomenon__TypeAssignment_0 )? )
            // InternalProblem.g:1354:2: ( rule__Phenomenon__TypeAssignment_0 )?
            {
             before(grammarAccess.getPhenomenonAccess().getTypeAssignment_0()); 
            // InternalProblem.g:1355:2: ( rule__Phenomenon__TypeAssignment_0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=20 && LA18_0<=22)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalProblem.g:1355:3: rule__Phenomenon__TypeAssignment_0
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
    // InternalProblem.g:1363:1: rule__Phenomenon__Group__1 : rule__Phenomenon__Group__1__Impl rule__Phenomenon__Group__2 ;
    public final void rule__Phenomenon__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1367:1: ( rule__Phenomenon__Group__1__Impl rule__Phenomenon__Group__2 )
            // InternalProblem.g:1368:2: rule__Phenomenon__Group__1__Impl rule__Phenomenon__Group__2
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
    // InternalProblem.g:1375:1: rule__Phenomenon__Group__1__Impl : ( ( rule__Phenomenon__IsControlledAssignment_1 )? ) ;
    public final void rule__Phenomenon__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1379:1: ( ( ( rule__Phenomenon__IsControlledAssignment_1 )? ) )
            // InternalProblem.g:1380:1: ( ( rule__Phenomenon__IsControlledAssignment_1 )? )
            {
            // InternalProblem.g:1380:1: ( ( rule__Phenomenon__IsControlledAssignment_1 )? )
            // InternalProblem.g:1381:2: ( rule__Phenomenon__IsControlledAssignment_1 )?
            {
             before(grammarAccess.getPhenomenonAccess().getIsControlledAssignment_1()); 
            // InternalProblem.g:1382:2: ( rule__Phenomenon__IsControlledAssignment_1 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==43) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalProblem.g:1382:3: rule__Phenomenon__IsControlledAssignment_1
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
    // InternalProblem.g:1390:1: rule__Phenomenon__Group__2 : rule__Phenomenon__Group__2__Impl rule__Phenomenon__Group__3 ;
    public final void rule__Phenomenon__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1394:1: ( rule__Phenomenon__Group__2__Impl rule__Phenomenon__Group__3 )
            // InternalProblem.g:1395:2: rule__Phenomenon__Group__2__Impl rule__Phenomenon__Group__3
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
    // InternalProblem.g:1402:1: rule__Phenomenon__Group__2__Impl : ( ( rule__Phenomenon__NameAssignment_2 ) ) ;
    public final void rule__Phenomenon__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1406:1: ( ( ( rule__Phenomenon__NameAssignment_2 ) ) )
            // InternalProblem.g:1407:1: ( ( rule__Phenomenon__NameAssignment_2 ) )
            {
            // InternalProblem.g:1407:1: ( ( rule__Phenomenon__NameAssignment_2 ) )
            // InternalProblem.g:1408:2: ( rule__Phenomenon__NameAssignment_2 )
            {
             before(grammarAccess.getPhenomenonAccess().getNameAssignment_2()); 
            // InternalProblem.g:1409:2: ( rule__Phenomenon__NameAssignment_2 )
            // InternalProblem.g:1409:3: rule__Phenomenon__NameAssignment_2
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
    // InternalProblem.g:1417:1: rule__Phenomenon__Group__3 : rule__Phenomenon__Group__3__Impl ;
    public final void rule__Phenomenon__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1421:1: ( rule__Phenomenon__Group__3__Impl )
            // InternalProblem.g:1422:2: rule__Phenomenon__Group__3__Impl
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
    // InternalProblem.g:1428:1: rule__Phenomenon__Group__3__Impl : ( ( rule__Phenomenon__Group_3__0 )? ) ;
    public final void rule__Phenomenon__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1432:1: ( ( ( rule__Phenomenon__Group_3__0 )? ) )
            // InternalProblem.g:1433:1: ( ( rule__Phenomenon__Group_3__0 )? )
            {
            // InternalProblem.g:1433:1: ( ( rule__Phenomenon__Group_3__0 )? )
            // InternalProblem.g:1434:2: ( rule__Phenomenon__Group_3__0 )?
            {
             before(grammarAccess.getPhenomenonAccess().getGroup_3()); 
            // InternalProblem.g:1435:2: ( rule__Phenomenon__Group_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_STRING||LA20_0==33) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalProblem.g:1435:3: rule__Phenomenon__Group_3__0
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
    // InternalProblem.g:1444:1: rule__Phenomenon__Group_3__0 : rule__Phenomenon__Group_3__0__Impl rule__Phenomenon__Group_3__1 ;
    public final void rule__Phenomenon__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1448:1: ( rule__Phenomenon__Group_3__0__Impl rule__Phenomenon__Group_3__1 )
            // InternalProblem.g:1449:2: rule__Phenomenon__Group_3__0__Impl rule__Phenomenon__Group_3__1
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
    // InternalProblem.g:1456:1: rule__Phenomenon__Group_3__0__Impl : ( ( ':' )? ) ;
    public final void rule__Phenomenon__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1460:1: ( ( ( ':' )? ) )
            // InternalProblem.g:1461:1: ( ( ':' )? )
            {
            // InternalProblem.g:1461:1: ( ( ':' )? )
            // InternalProblem.g:1462:2: ( ':' )?
            {
             before(grammarAccess.getPhenomenonAccess().getColonKeyword_3_0()); 
            // InternalProblem.g:1463:2: ( ':' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==33) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalProblem.g:1463:3: ':'
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
    // InternalProblem.g:1471:1: rule__Phenomenon__Group_3__1 : rule__Phenomenon__Group_3__1__Impl ;
    public final void rule__Phenomenon__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1475:1: ( rule__Phenomenon__Group_3__1__Impl )
            // InternalProblem.g:1476:2: rule__Phenomenon__Group_3__1__Impl
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
    // InternalProblem.g:1482:1: rule__Phenomenon__Group_3__1__Impl : ( ( rule__Phenomenon__DescriptionAssignment_3_1 ) ) ;
    public final void rule__Phenomenon__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1486:1: ( ( ( rule__Phenomenon__DescriptionAssignment_3_1 ) ) )
            // InternalProblem.g:1487:1: ( ( rule__Phenomenon__DescriptionAssignment_3_1 ) )
            {
            // InternalProblem.g:1487:1: ( ( rule__Phenomenon__DescriptionAssignment_3_1 ) )
            // InternalProblem.g:1488:2: ( rule__Phenomenon__DescriptionAssignment_3_1 )
            {
             before(grammarAccess.getPhenomenonAccess().getDescriptionAssignment_3_1()); 
            // InternalProblem.g:1489:2: ( rule__Phenomenon__DescriptionAssignment_3_1 )
            // InternalProblem.g:1489:3: rule__Phenomenon__DescriptionAssignment_3_1
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
    // InternalProblem.g:1498:1: rule__Constraint__Group__0 : rule__Constraint__Group__0__Impl rule__Constraint__Group__1 ;
    public final void rule__Constraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1502:1: ( rule__Constraint__Group__0__Impl rule__Constraint__Group__1 )
            // InternalProblem.g:1503:2: rule__Constraint__Group__0__Impl rule__Constraint__Group__1
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
    // InternalProblem.g:1510:1: rule__Constraint__Group__0__Impl : ( ( rule__Constraint__TypeAssignment_0 ) ) ;
    public final void rule__Constraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1514:1: ( ( ( rule__Constraint__TypeAssignment_0 ) ) )
            // InternalProblem.g:1515:1: ( ( rule__Constraint__TypeAssignment_0 ) )
            {
            // InternalProblem.g:1515:1: ( ( rule__Constraint__TypeAssignment_0 ) )
            // InternalProblem.g:1516:2: ( rule__Constraint__TypeAssignment_0 )
            {
             before(grammarAccess.getConstraintAccess().getTypeAssignment_0()); 
            // InternalProblem.g:1517:2: ( rule__Constraint__TypeAssignment_0 )
            // InternalProblem.g:1517:3: rule__Constraint__TypeAssignment_0
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
    // InternalProblem.g:1525:1: rule__Constraint__Group__1 : rule__Constraint__Group__1__Impl rule__Constraint__Group__2 ;
    public final void rule__Constraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1529:1: ( rule__Constraint__Group__1__Impl rule__Constraint__Group__2 )
            // InternalProblem.g:1530:2: rule__Constraint__Group__1__Impl rule__Constraint__Group__2
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
    // InternalProblem.g:1537:1: rule__Constraint__Group__1__Impl : ( '(' ) ;
    public final void rule__Constraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1541:1: ( ( '(' ) )
            // InternalProblem.g:1542:1: ( '(' )
            {
            // InternalProblem.g:1542:1: ( '(' )
            // InternalProblem.g:1543:2: '('
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
    // InternalProblem.g:1552:1: rule__Constraint__Group__2 : rule__Constraint__Group__2__Impl rule__Constraint__Group__3 ;
    public final void rule__Constraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1556:1: ( rule__Constraint__Group__2__Impl rule__Constraint__Group__3 )
            // InternalProblem.g:1557:2: rule__Constraint__Group__2__Impl rule__Constraint__Group__3
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
    // InternalProblem.g:1564:1: rule__Constraint__Group__2__Impl : ( ( rule__Constraint__OperandAssignment_2 ) ) ;
    public final void rule__Constraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1568:1: ( ( ( rule__Constraint__OperandAssignment_2 ) ) )
            // InternalProblem.g:1569:1: ( ( rule__Constraint__OperandAssignment_2 ) )
            {
            // InternalProblem.g:1569:1: ( ( rule__Constraint__OperandAssignment_2 ) )
            // InternalProblem.g:1570:2: ( rule__Constraint__OperandAssignment_2 )
            {
             before(grammarAccess.getConstraintAccess().getOperandAssignment_2()); 
            // InternalProblem.g:1571:2: ( rule__Constraint__OperandAssignment_2 )
            // InternalProblem.g:1571:3: rule__Constraint__OperandAssignment_2
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
    // InternalProblem.g:1579:1: rule__Constraint__Group__3 : rule__Constraint__Group__3__Impl rule__Constraint__Group__4 ;
    public final void rule__Constraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1583:1: ( rule__Constraint__Group__3__Impl rule__Constraint__Group__4 )
            // InternalProblem.g:1584:2: rule__Constraint__Group__3__Impl rule__Constraint__Group__4
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
    // InternalProblem.g:1591:1: rule__Constraint__Group__3__Impl : ( ( rule__Constraint__Group_3__0 )* ) ;
    public final void rule__Constraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1595:1: ( ( ( rule__Constraint__Group_3__0 )* ) )
            // InternalProblem.g:1596:1: ( ( rule__Constraint__Group_3__0 )* )
            {
            // InternalProblem.g:1596:1: ( ( rule__Constraint__Group_3__0 )* )
            // InternalProblem.g:1597:2: ( rule__Constraint__Group_3__0 )*
            {
             before(grammarAccess.getConstraintAccess().getGroup_3()); 
            // InternalProblem.g:1598:2: ( rule__Constraint__Group_3__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==36) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalProblem.g:1598:3: rule__Constraint__Group_3__0
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
    // InternalProblem.g:1606:1: rule__Constraint__Group__4 : rule__Constraint__Group__4__Impl ;
    public final void rule__Constraint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1610:1: ( rule__Constraint__Group__4__Impl )
            // InternalProblem.g:1611:2: rule__Constraint__Group__4__Impl
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
    // InternalProblem.g:1617:1: rule__Constraint__Group__4__Impl : ( ')' ) ;
    public final void rule__Constraint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1621:1: ( ( ')' ) )
            // InternalProblem.g:1622:1: ( ')' )
            {
            // InternalProblem.g:1622:1: ( ')' )
            // InternalProblem.g:1623:2: ')'
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
    // InternalProblem.g:1633:1: rule__Constraint__Group_3__0 : rule__Constraint__Group_3__0__Impl rule__Constraint__Group_3__1 ;
    public final void rule__Constraint__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1637:1: ( rule__Constraint__Group_3__0__Impl rule__Constraint__Group_3__1 )
            // InternalProblem.g:1638:2: rule__Constraint__Group_3__0__Impl rule__Constraint__Group_3__1
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
    // InternalProblem.g:1645:1: rule__Constraint__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Constraint__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1649:1: ( ( ',' ) )
            // InternalProblem.g:1650:1: ( ',' )
            {
            // InternalProblem.g:1650:1: ( ',' )
            // InternalProblem.g:1651:2: ','
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
    // InternalProblem.g:1660:1: rule__Constraint__Group_3__1 : rule__Constraint__Group_3__1__Impl ;
    public final void rule__Constraint__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1664:1: ( rule__Constraint__Group_3__1__Impl )
            // InternalProblem.g:1665:2: rule__Constraint__Group_3__1__Impl
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
    // InternalProblem.g:1671:1: rule__Constraint__Group_3__1__Impl : ( ( rule__Constraint__OperandAssignment_3_1 ) ) ;
    public final void rule__Constraint__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1675:1: ( ( ( rule__Constraint__OperandAssignment_3_1 ) ) )
            // InternalProblem.g:1676:1: ( ( rule__Constraint__OperandAssignment_3_1 ) )
            {
            // InternalProblem.g:1676:1: ( ( rule__Constraint__OperandAssignment_3_1 ) )
            // InternalProblem.g:1677:2: ( rule__Constraint__OperandAssignment_3_1 )
            {
             before(grammarAccess.getConstraintAccess().getOperandAssignment_3_1()); 
            // InternalProblem.g:1678:2: ( rule__Constraint__OperandAssignment_3_1 )
            // InternalProblem.g:1678:3: rule__Constraint__OperandAssignment_3_1
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
    // InternalProblem.g:1687:1: rule__Link__Group__0 : rule__Link__Group__0__Impl rule__Link__Group__1 ;
    public final void rule__Link__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1691:1: ( rule__Link__Group__0__Impl rule__Link__Group__1 )
            // InternalProblem.g:1692:2: rule__Link__Group__0__Impl rule__Link__Group__1
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
    // InternalProblem.g:1699:1: rule__Link__Group__0__Impl : ( ( rule__Link__FromAssignment_0 ) ) ;
    public final void rule__Link__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1703:1: ( ( ( rule__Link__FromAssignment_0 ) ) )
            // InternalProblem.g:1704:1: ( ( rule__Link__FromAssignment_0 ) )
            {
            // InternalProblem.g:1704:1: ( ( rule__Link__FromAssignment_0 ) )
            // InternalProblem.g:1705:2: ( rule__Link__FromAssignment_0 )
            {
             before(grammarAccess.getLinkAccess().getFromAssignment_0()); 
            // InternalProblem.g:1706:2: ( rule__Link__FromAssignment_0 )
            // InternalProblem.g:1706:3: rule__Link__FromAssignment_0
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
    // InternalProblem.g:1714:1: rule__Link__Group__1 : rule__Link__Group__1__Impl rule__Link__Group__2 ;
    public final void rule__Link__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1718:1: ( rule__Link__Group__1__Impl rule__Link__Group__2 )
            // InternalProblem.g:1719:2: rule__Link__Group__1__Impl rule__Link__Group__2
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
    // InternalProblem.g:1726:1: rule__Link__Group__1__Impl : ( ( rule__Link__TypeAssignment_1 ) ) ;
    public final void rule__Link__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1730:1: ( ( ( rule__Link__TypeAssignment_1 ) ) )
            // InternalProblem.g:1731:1: ( ( rule__Link__TypeAssignment_1 ) )
            {
            // InternalProblem.g:1731:1: ( ( rule__Link__TypeAssignment_1 ) )
            // InternalProblem.g:1732:2: ( rule__Link__TypeAssignment_1 )
            {
             before(grammarAccess.getLinkAccess().getTypeAssignment_1()); 
            // InternalProblem.g:1733:2: ( rule__Link__TypeAssignment_1 )
            // InternalProblem.g:1733:3: rule__Link__TypeAssignment_1
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
    // InternalProblem.g:1741:1: rule__Link__Group__2 : rule__Link__Group__2__Impl rule__Link__Group__3 ;
    public final void rule__Link__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1745:1: ( rule__Link__Group__2__Impl rule__Link__Group__3 )
            // InternalProblem.g:1746:2: rule__Link__Group__2__Impl rule__Link__Group__3
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
    // InternalProblem.g:1753:1: rule__Link__Group__2__Impl : ( ( rule__Link__ToAssignment_2 ) ) ;
    public final void rule__Link__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1757:1: ( ( ( rule__Link__ToAssignment_2 ) ) )
            // InternalProblem.g:1758:1: ( ( rule__Link__ToAssignment_2 ) )
            {
            // InternalProblem.g:1758:1: ( ( rule__Link__ToAssignment_2 ) )
            // InternalProblem.g:1759:2: ( rule__Link__ToAssignment_2 )
            {
             before(grammarAccess.getLinkAccess().getToAssignment_2()); 
            // InternalProblem.g:1760:2: ( rule__Link__ToAssignment_2 )
            // InternalProblem.g:1760:3: rule__Link__ToAssignment_2
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
    // InternalProblem.g:1768:1: rule__Link__Group__3 : rule__Link__Group__3__Impl rule__Link__Group__4 ;
    public final void rule__Link__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1772:1: ( rule__Link__Group__3__Impl rule__Link__Group__4 )
            // InternalProblem.g:1773:2: rule__Link__Group__3__Impl rule__Link__Group__4
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
    // InternalProblem.g:1780:1: rule__Link__Group__3__Impl : ( ( rule__Link__Group_3__0 )? ) ;
    public final void rule__Link__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1784:1: ( ( ( rule__Link__Group_3__0 )? ) )
            // InternalProblem.g:1785:1: ( ( rule__Link__Group_3__0 )? )
            {
            // InternalProblem.g:1785:1: ( ( rule__Link__Group_3__0 )? )
            // InternalProblem.g:1786:2: ( rule__Link__Group_3__0 )?
            {
             before(grammarAccess.getLinkAccess().getGroup_3()); 
            // InternalProblem.g:1787:2: ( rule__Link__Group_3__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==34) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalProblem.g:1787:3: rule__Link__Group_3__0
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
    // InternalProblem.g:1795:1: rule__Link__Group__4 : rule__Link__Group__4__Impl ;
    public final void rule__Link__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1799:1: ( rule__Link__Group__4__Impl )
            // InternalProblem.g:1800:2: rule__Link__Group__4__Impl
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
    // InternalProblem.g:1806:1: rule__Link__Group__4__Impl : ( ( rule__Link__Group_4__0 )? ) ;
    public final void rule__Link__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1810:1: ( ( ( rule__Link__Group_4__0 )? ) )
            // InternalProblem.g:1811:1: ( ( rule__Link__Group_4__0 )? )
            {
            // InternalProblem.g:1811:1: ( ( rule__Link__Group_4__0 )? )
            // InternalProblem.g:1812:2: ( rule__Link__Group_4__0 )?
            {
             before(grammarAccess.getLinkAccess().getGroup_4()); 
            // InternalProblem.g:1813:2: ( rule__Link__Group_4__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_STRING||LA24_0==33) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalProblem.g:1813:3: rule__Link__Group_4__0
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
    // InternalProblem.g:1822:1: rule__Link__Group_3__0 : rule__Link__Group_3__0__Impl rule__Link__Group_3__1 ;
    public final void rule__Link__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1826:1: ( rule__Link__Group_3__0__Impl rule__Link__Group_3__1 )
            // InternalProblem.g:1827:2: rule__Link__Group_3__0__Impl rule__Link__Group_3__1
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
    // InternalProblem.g:1834:1: rule__Link__Group_3__0__Impl : ( '{' ) ;
    public final void rule__Link__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1838:1: ( ( '{' ) )
            // InternalProblem.g:1839:1: ( '{' )
            {
            // InternalProblem.g:1839:1: ( '{' )
            // InternalProblem.g:1840:2: '{'
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
    // InternalProblem.g:1849:1: rule__Link__Group_3__1 : rule__Link__Group_3__1__Impl rule__Link__Group_3__2 ;
    public final void rule__Link__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1853:1: ( rule__Link__Group_3__1__Impl rule__Link__Group_3__2 )
            // InternalProblem.g:1854:2: rule__Link__Group_3__1__Impl rule__Link__Group_3__2
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
    // InternalProblem.g:1861:1: rule__Link__Group_3__1__Impl : ( ( rule__Link__PhenomenaAssignment_3_1 ) ) ;
    public final void rule__Link__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1865:1: ( ( ( rule__Link__PhenomenaAssignment_3_1 ) ) )
            // InternalProblem.g:1866:1: ( ( rule__Link__PhenomenaAssignment_3_1 ) )
            {
            // InternalProblem.g:1866:1: ( ( rule__Link__PhenomenaAssignment_3_1 ) )
            // InternalProblem.g:1867:2: ( rule__Link__PhenomenaAssignment_3_1 )
            {
             before(grammarAccess.getLinkAccess().getPhenomenaAssignment_3_1()); 
            // InternalProblem.g:1868:2: ( rule__Link__PhenomenaAssignment_3_1 )
            // InternalProblem.g:1868:3: rule__Link__PhenomenaAssignment_3_1
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
    // InternalProblem.g:1876:1: rule__Link__Group_3__2 : rule__Link__Group_3__2__Impl rule__Link__Group_3__3 ;
    public final void rule__Link__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1880:1: ( rule__Link__Group_3__2__Impl rule__Link__Group_3__3 )
            // InternalProblem.g:1881:2: rule__Link__Group_3__2__Impl rule__Link__Group_3__3
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
    // InternalProblem.g:1888:1: rule__Link__Group_3__2__Impl : ( ( rule__Link__Group_3_2__0 )* ) ;
    public final void rule__Link__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1892:1: ( ( ( rule__Link__Group_3_2__0 )* ) )
            // InternalProblem.g:1893:1: ( ( rule__Link__Group_3_2__0 )* )
            {
            // InternalProblem.g:1893:1: ( ( rule__Link__Group_3_2__0 )* )
            // InternalProblem.g:1894:2: ( rule__Link__Group_3_2__0 )*
            {
             before(grammarAccess.getLinkAccess().getGroup_3_2()); 
            // InternalProblem.g:1895:2: ( rule__Link__Group_3_2__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==36) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalProblem.g:1895:3: rule__Link__Group_3_2__0
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
    // InternalProblem.g:1903:1: rule__Link__Group_3__3 : rule__Link__Group_3__3__Impl rule__Link__Group_3__4 ;
    public final void rule__Link__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1907:1: ( rule__Link__Group_3__3__Impl rule__Link__Group_3__4 )
            // InternalProblem.g:1908:2: rule__Link__Group_3__3__Impl rule__Link__Group_3__4
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
    // InternalProblem.g:1915:1: rule__Link__Group_3__3__Impl : ( ( rule__Link__Group_3_3__0 )? ) ;
    public final void rule__Link__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1919:1: ( ( ( rule__Link__Group_3_3__0 )? ) )
            // InternalProblem.g:1920:1: ( ( rule__Link__Group_3_3__0 )? )
            {
            // InternalProblem.g:1920:1: ( ( rule__Link__Group_3_3__0 )? )
            // InternalProblem.g:1921:2: ( rule__Link__Group_3_3__0 )?
            {
             before(grammarAccess.getLinkAccess().getGroup_3_3()); 
            // InternalProblem.g:1922:2: ( rule__Link__Group_3_3__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=23 && LA26_0<=25)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalProblem.g:1922:3: rule__Link__Group_3_3__0
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
    // InternalProblem.g:1930:1: rule__Link__Group_3__4 : rule__Link__Group_3__4__Impl ;
    public final void rule__Link__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1934:1: ( rule__Link__Group_3__4__Impl )
            // InternalProblem.g:1935:2: rule__Link__Group_3__4__Impl
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
    // InternalProblem.g:1941:1: rule__Link__Group_3__4__Impl : ( '}' ) ;
    public final void rule__Link__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1945:1: ( ( '}' ) )
            // InternalProblem.g:1946:1: ( '}' )
            {
            // InternalProblem.g:1946:1: ( '}' )
            // InternalProblem.g:1947:2: '}'
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
    // InternalProblem.g:1957:1: rule__Link__Group_3_2__0 : rule__Link__Group_3_2__0__Impl rule__Link__Group_3_2__1 ;
    public final void rule__Link__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1961:1: ( rule__Link__Group_3_2__0__Impl rule__Link__Group_3_2__1 )
            // InternalProblem.g:1962:2: rule__Link__Group_3_2__0__Impl rule__Link__Group_3_2__1
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
    // InternalProblem.g:1969:1: rule__Link__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__Link__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1973:1: ( ( ',' ) )
            // InternalProblem.g:1974:1: ( ',' )
            {
            // InternalProblem.g:1974:1: ( ',' )
            // InternalProblem.g:1975:2: ','
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
    // InternalProblem.g:1984:1: rule__Link__Group_3_2__1 : rule__Link__Group_3_2__1__Impl ;
    public final void rule__Link__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1988:1: ( rule__Link__Group_3_2__1__Impl )
            // InternalProblem.g:1989:2: rule__Link__Group_3_2__1__Impl
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
    // InternalProblem.g:1995:1: rule__Link__Group_3_2__1__Impl : ( ( rule__Link__PhenomenaAssignment_3_2_1 ) ) ;
    public final void rule__Link__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:1999:1: ( ( ( rule__Link__PhenomenaAssignment_3_2_1 ) ) )
            // InternalProblem.g:2000:1: ( ( rule__Link__PhenomenaAssignment_3_2_1 ) )
            {
            // InternalProblem.g:2000:1: ( ( rule__Link__PhenomenaAssignment_3_2_1 ) )
            // InternalProblem.g:2001:2: ( rule__Link__PhenomenaAssignment_3_2_1 )
            {
             before(grammarAccess.getLinkAccess().getPhenomenaAssignment_3_2_1()); 
            // InternalProblem.g:2002:2: ( rule__Link__PhenomenaAssignment_3_2_1 )
            // InternalProblem.g:2002:3: rule__Link__PhenomenaAssignment_3_2_1
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
    // InternalProblem.g:2011:1: rule__Link__Group_3_3__0 : rule__Link__Group_3_3__0__Impl rule__Link__Group_3_3__1 ;
    public final void rule__Link__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2015:1: ( rule__Link__Group_3_3__0__Impl rule__Link__Group_3_3__1 )
            // InternalProblem.g:2016:2: rule__Link__Group_3_3__0__Impl rule__Link__Group_3_3__1
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
    // InternalProblem.g:2023:1: rule__Link__Group_3_3__0__Impl : ( ( rule__Link__TimingAssignment_3_3_0 ) ) ;
    public final void rule__Link__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2027:1: ( ( ( rule__Link__TimingAssignment_3_3_0 ) ) )
            // InternalProblem.g:2028:1: ( ( rule__Link__TimingAssignment_3_3_0 ) )
            {
            // InternalProblem.g:2028:1: ( ( rule__Link__TimingAssignment_3_3_0 ) )
            // InternalProblem.g:2029:2: ( rule__Link__TimingAssignment_3_3_0 )
            {
             before(grammarAccess.getLinkAccess().getTimingAssignment_3_3_0()); 
            // InternalProblem.g:2030:2: ( rule__Link__TimingAssignment_3_3_0 )
            // InternalProblem.g:2030:3: rule__Link__TimingAssignment_3_3_0
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
    // InternalProblem.g:2038:1: rule__Link__Group_3_3__1 : rule__Link__Group_3_3__1__Impl ;
    public final void rule__Link__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2042:1: ( rule__Link__Group_3_3__1__Impl )
            // InternalProblem.g:2043:2: rule__Link__Group_3_3__1__Impl
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
    // InternalProblem.g:2049:1: rule__Link__Group_3_3__1__Impl : ( ( rule__Link__Group_3_3_1__0 )* ) ;
    public final void rule__Link__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2053:1: ( ( ( rule__Link__Group_3_3_1__0 )* ) )
            // InternalProblem.g:2054:1: ( ( rule__Link__Group_3_3_1__0 )* )
            {
            // InternalProblem.g:2054:1: ( ( rule__Link__Group_3_3_1__0 )* )
            // InternalProblem.g:2055:2: ( rule__Link__Group_3_3_1__0 )*
            {
             before(grammarAccess.getLinkAccess().getGroup_3_3_1()); 
            // InternalProblem.g:2056:2: ( rule__Link__Group_3_3_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==37) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalProblem.g:2056:3: rule__Link__Group_3_3_1__0
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
    // InternalProblem.g:2065:1: rule__Link__Group_3_3_1__0 : rule__Link__Group_3_3_1__0__Impl rule__Link__Group_3_3_1__1 ;
    public final void rule__Link__Group_3_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2069:1: ( rule__Link__Group_3_3_1__0__Impl rule__Link__Group_3_3_1__1 )
            // InternalProblem.g:2070:2: rule__Link__Group_3_3_1__0__Impl rule__Link__Group_3_3_1__1
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
    // InternalProblem.g:2077:1: rule__Link__Group_3_3_1__0__Impl : ( ';' ) ;
    public final void rule__Link__Group_3_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2081:1: ( ( ';' ) )
            // InternalProblem.g:2082:1: ( ';' )
            {
            // InternalProblem.g:2082:1: ( ';' )
            // InternalProblem.g:2083:2: ';'
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
    // InternalProblem.g:2092:1: rule__Link__Group_3_3_1__1 : rule__Link__Group_3_3_1__1__Impl ;
    public final void rule__Link__Group_3_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2096:1: ( rule__Link__Group_3_3_1__1__Impl )
            // InternalProblem.g:2097:2: rule__Link__Group_3_3_1__1__Impl
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
    // InternalProblem.g:2103:1: rule__Link__Group_3_3_1__1__Impl : ( ( rule__Link__TimingAssignment_3_3_1_1 ) ) ;
    public final void rule__Link__Group_3_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2107:1: ( ( ( rule__Link__TimingAssignment_3_3_1_1 ) ) )
            // InternalProblem.g:2108:1: ( ( rule__Link__TimingAssignment_3_3_1_1 ) )
            {
            // InternalProblem.g:2108:1: ( ( rule__Link__TimingAssignment_3_3_1_1 ) )
            // InternalProblem.g:2109:2: ( rule__Link__TimingAssignment_3_3_1_1 )
            {
             before(grammarAccess.getLinkAccess().getTimingAssignment_3_3_1_1()); 
            // InternalProblem.g:2110:2: ( rule__Link__TimingAssignment_3_3_1_1 )
            // InternalProblem.g:2110:3: rule__Link__TimingAssignment_3_3_1_1
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
    // InternalProblem.g:2119:1: rule__Link__Group_4__0 : rule__Link__Group_4__0__Impl rule__Link__Group_4__1 ;
    public final void rule__Link__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2123:1: ( rule__Link__Group_4__0__Impl rule__Link__Group_4__1 )
            // InternalProblem.g:2124:2: rule__Link__Group_4__0__Impl rule__Link__Group_4__1
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
    // InternalProblem.g:2131:1: rule__Link__Group_4__0__Impl : ( ( ':' )? ) ;
    public final void rule__Link__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2135:1: ( ( ( ':' )? ) )
            // InternalProblem.g:2136:1: ( ( ':' )? )
            {
            // InternalProblem.g:2136:1: ( ( ':' )? )
            // InternalProblem.g:2137:2: ( ':' )?
            {
             before(grammarAccess.getLinkAccess().getColonKeyword_4_0()); 
            // InternalProblem.g:2138:2: ( ':' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==33) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalProblem.g:2138:3: ':'
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
    // InternalProblem.g:2146:1: rule__Link__Group_4__1 : rule__Link__Group_4__1__Impl ;
    public final void rule__Link__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2150:1: ( rule__Link__Group_4__1__Impl )
            // InternalProblem.g:2151:2: rule__Link__Group_4__1__Impl
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
    // InternalProblem.g:2157:1: rule__Link__Group_4__1__Impl : ( ( rule__Link__DescriptionAssignment_4_1 ) ) ;
    public final void rule__Link__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2161:1: ( ( ( rule__Link__DescriptionAssignment_4_1 ) ) )
            // InternalProblem.g:2162:1: ( ( rule__Link__DescriptionAssignment_4_1 ) )
            {
            // InternalProblem.g:2162:1: ( ( rule__Link__DescriptionAssignment_4_1 ) )
            // InternalProblem.g:2163:2: ( rule__Link__DescriptionAssignment_4_1 )
            {
             before(grammarAccess.getLinkAccess().getDescriptionAssignment_4_1()); 
            // InternalProblem.g:2164:2: ( rule__Link__DescriptionAssignment_4_1 )
            // InternalProblem.g:2164:3: rule__Link__DescriptionAssignment_4_1
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
    // InternalProblem.g:2173:1: rule__ProblemDiagram__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ProblemDiagram__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2177:1: ( ( RULE_ID ) )
            // InternalProblem.g:2178:2: ( RULE_ID )
            {
            // InternalProblem.g:2178:2: ( RULE_ID )
            // InternalProblem.g:2179:3: RULE_ID
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
    // InternalProblem.g:2188:1: rule__ProblemDiagram__HighlightAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__ProblemDiagram__HighlightAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2192:1: ( ( ( RULE_ID ) ) )
            // InternalProblem.g:2193:2: ( ( RULE_ID ) )
            {
            // InternalProblem.g:2193:2: ( ( RULE_ID ) )
            // InternalProblem.g:2194:3: ( RULE_ID )
            {
             before(grammarAccess.getProblemDiagramAccess().getHighlightNodeCrossReference_2_1_0()); 
            // InternalProblem.g:2195:3: ( RULE_ID )
            // InternalProblem.g:2196:4: RULE_ID
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
    // InternalProblem.g:2207:1: rule__ProblemDiagram__NodesAssignment_3_0 : ( ruleNode ) ;
    public final void rule__ProblemDiagram__NodesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2211:1: ( ( ruleNode ) )
            // InternalProblem.g:2212:2: ( ruleNode )
            {
            // InternalProblem.g:2212:2: ( ruleNode )
            // InternalProblem.g:2213:3: ruleNode
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
    // InternalProblem.g:2222:1: rule__ProblemDiagram__LinksAssignment_3_1 : ( ruleLink ) ;
    public final void rule__ProblemDiagram__LinksAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2226:1: ( ( ruleLink ) )
            // InternalProblem.g:2227:2: ( ruleLink )
            {
            // InternalProblem.g:2227:2: ( ruleLink )
            // InternalProblem.g:2228:3: ruleLink
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
    // InternalProblem.g:2237:1: rule__Node__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Node__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2241:1: ( ( RULE_ID ) )
            // InternalProblem.g:2242:2: ( RULE_ID )
            {
            // InternalProblem.g:2242:2: ( RULE_ID )
            // InternalProblem.g:2243:3: RULE_ID
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
    // InternalProblem.g:2252:1: rule__Node__TypeAssignment_1 : ( ruleNodeType ) ;
    public final void rule__Node__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2256:1: ( ( ruleNodeType ) )
            // InternalProblem.g:2257:2: ( ruleNodeType )
            {
            // InternalProblem.g:2257:2: ( ruleNodeType )
            // InternalProblem.g:2258:3: ruleNodeType
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
    // InternalProblem.g:2267:1: rule__Node__DescriptionAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Node__DescriptionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2271:1: ( ( RULE_STRING ) )
            // InternalProblem.g:2272:2: ( RULE_STRING )
            {
            // InternalProblem.g:2272:2: ( RULE_STRING )
            // InternalProblem.g:2273:3: RULE_STRING
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
    // InternalProblem.g:2282:1: rule__Node__HiddenPhenomenaAssignment_3_1_0 : ( rulePhenomenon ) ;
    public final void rule__Node__HiddenPhenomenaAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2286:1: ( ( rulePhenomenon ) )
            // InternalProblem.g:2287:2: ( rulePhenomenon )
            {
            // InternalProblem.g:2287:2: ( rulePhenomenon )
            // InternalProblem.g:2288:3: rulePhenomenon
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
    // InternalProblem.g:2297:1: rule__Node__HiddenPhenomenaAssignment_3_1_1_1 : ( rulePhenomenon ) ;
    public final void rule__Node__HiddenPhenomenaAssignment_3_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2301:1: ( ( rulePhenomenon ) )
            // InternalProblem.g:2302:2: ( rulePhenomenon )
            {
            // InternalProblem.g:2302:2: ( rulePhenomenon )
            // InternalProblem.g:2303:3: rulePhenomenon
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
    // InternalProblem.g:2312:1: rule__Node__TimingConstraintAssignment_3_2_0 : ( ruleConstraint ) ;
    public final void rule__Node__TimingConstraintAssignment_3_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2316:1: ( ( ruleConstraint ) )
            // InternalProblem.g:2317:2: ( ruleConstraint )
            {
            // InternalProblem.g:2317:2: ( ruleConstraint )
            // InternalProblem.g:2318:3: ruleConstraint
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
    // InternalProblem.g:2327:1: rule__Node__TimingConstraintAssignment_3_2_1_1 : ( ruleConstraint ) ;
    public final void rule__Node__TimingConstraintAssignment_3_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2331:1: ( ( ruleConstraint ) )
            // InternalProblem.g:2332:2: ( ruleConstraint )
            {
            // InternalProblem.g:2332:2: ( ruleConstraint )
            // InternalProblem.g:2333:3: ruleConstraint
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
    // InternalProblem.g:2342:1: rule__Node__SubproblemAssignment_3_3_0 : ( ruleProblemDiagram ) ;
    public final void rule__Node__SubproblemAssignment_3_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2346:1: ( ( ruleProblemDiagram ) )
            // InternalProblem.g:2347:2: ( ruleProblemDiagram )
            {
            // InternalProblem.g:2347:2: ( ruleProblemDiagram )
            // InternalProblem.g:2348:3: ruleProblemDiagram
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
    // InternalProblem.g:2357:1: rule__Node__ProblemNodeRefAssignment_3_3_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__Node__ProblemNodeRefAssignment_3_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2361:1: ( ( ( RULE_ID ) ) )
            // InternalProblem.g:2362:2: ( ( RULE_ID ) )
            {
            // InternalProblem.g:2362:2: ( ( RULE_ID ) )
            // InternalProblem.g:2363:3: ( RULE_ID )
            {
             before(grammarAccess.getNodeAccess().getProblemNodeRefNodeCrossReference_3_3_1_2_0()); 
            // InternalProblem.g:2364:3: ( RULE_ID )
            // InternalProblem.g:2365:4: RULE_ID
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
    // InternalProblem.g:2376:1: rule__Node__ProblemRefAssignment_3_3_2_2 : ( ( RULE_ID ) ) ;
    public final void rule__Node__ProblemRefAssignment_3_3_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2380:1: ( ( ( RULE_ID ) ) )
            // InternalProblem.g:2381:2: ( ( RULE_ID ) )
            {
            // InternalProblem.g:2381:2: ( ( RULE_ID ) )
            // InternalProblem.g:2382:3: ( RULE_ID )
            {
             before(grammarAccess.getNodeAccess().getProblemRefProblemDiagramCrossReference_3_3_2_2_0()); 
            // InternalProblem.g:2383:3: ( RULE_ID )
            // InternalProblem.g:2384:4: RULE_ID
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
    // InternalProblem.g:2395:1: rule__Node__HrefAssignment_3_3_3_1 : ( RULE_STRING ) ;
    public final void rule__Node__HrefAssignment_3_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2399:1: ( ( RULE_STRING ) )
            // InternalProblem.g:2400:2: ( RULE_STRING )
            {
            // InternalProblem.g:2400:2: ( RULE_STRING )
            // InternalProblem.g:2401:3: RULE_STRING
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
    // InternalProblem.g:2410:1: rule__Phenomenon__TypeAssignment_0 : ( rulePhenomenonType ) ;
    public final void rule__Phenomenon__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2414:1: ( ( rulePhenomenonType ) )
            // InternalProblem.g:2415:2: ( rulePhenomenonType )
            {
            // InternalProblem.g:2415:2: ( rulePhenomenonType )
            // InternalProblem.g:2416:3: rulePhenomenonType
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
    // InternalProblem.g:2425:1: rule__Phenomenon__IsControlledAssignment_1 : ( ( '!' ) ) ;
    public final void rule__Phenomenon__IsControlledAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2429:1: ( ( ( '!' ) ) )
            // InternalProblem.g:2430:2: ( ( '!' ) )
            {
            // InternalProblem.g:2430:2: ( ( '!' ) )
            // InternalProblem.g:2431:3: ( '!' )
            {
             before(grammarAccess.getPhenomenonAccess().getIsControlledExclamationMarkKeyword_1_0()); 
            // InternalProblem.g:2432:3: ( '!' )
            // InternalProblem.g:2433:4: '!'
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
    // InternalProblem.g:2444:1: rule__Phenomenon__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Phenomenon__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2448:1: ( ( RULE_ID ) )
            // InternalProblem.g:2449:2: ( RULE_ID )
            {
            // InternalProblem.g:2449:2: ( RULE_ID )
            // InternalProblem.g:2450:3: RULE_ID
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
    // InternalProblem.g:2459:1: rule__Phenomenon__DescriptionAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Phenomenon__DescriptionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2463:1: ( ( RULE_STRING ) )
            // InternalProblem.g:2464:2: ( RULE_STRING )
            {
            // InternalProblem.g:2464:2: ( RULE_STRING )
            // InternalProblem.g:2465:3: RULE_STRING
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
    // InternalProblem.g:2474:1: rule__Constraint__TypeAssignment_0 : ( ruleConstraintType ) ;
    public final void rule__Constraint__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2478:1: ( ( ruleConstraintType ) )
            // InternalProblem.g:2479:2: ( ruleConstraintType )
            {
            // InternalProblem.g:2479:2: ( ruleConstraintType )
            // InternalProblem.g:2480:3: ruleConstraintType
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
    // InternalProblem.g:2489:1: rule__Constraint__OperandAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Constraint__OperandAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2493:1: ( ( ( RULE_ID ) ) )
            // InternalProblem.g:2494:2: ( ( RULE_ID ) )
            {
            // InternalProblem.g:2494:2: ( ( RULE_ID ) )
            // InternalProblem.g:2495:3: ( RULE_ID )
            {
             before(grammarAccess.getConstraintAccess().getOperandClockCrossReference_2_0()); 
            // InternalProblem.g:2496:3: ( RULE_ID )
            // InternalProblem.g:2497:4: RULE_ID
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
    // InternalProblem.g:2508:1: rule__Constraint__OperandAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Constraint__OperandAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2512:1: ( ( ( RULE_ID ) ) )
            // InternalProblem.g:2513:2: ( ( RULE_ID ) )
            {
            // InternalProblem.g:2513:2: ( ( RULE_ID ) )
            // InternalProblem.g:2514:3: ( RULE_ID )
            {
             before(grammarAccess.getConstraintAccess().getOperandClockCrossReference_3_1_0()); 
            // InternalProblem.g:2515:3: ( RULE_ID )
            // InternalProblem.g:2516:4: RULE_ID
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
    // InternalProblem.g:2527:1: rule__Link__FromAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Link__FromAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2531:1: ( ( ( RULE_ID ) ) )
            // InternalProblem.g:2532:2: ( ( RULE_ID ) )
            {
            // InternalProblem.g:2532:2: ( ( RULE_ID ) )
            // InternalProblem.g:2533:3: ( RULE_ID )
            {
             before(grammarAccess.getLinkAccess().getFromNodeCrossReference_0_0()); 
            // InternalProblem.g:2534:3: ( RULE_ID )
            // InternalProblem.g:2535:4: RULE_ID
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
    // InternalProblem.g:2546:1: rule__Link__TypeAssignment_1 : ( ruleLinkType ) ;
    public final void rule__Link__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2550:1: ( ( ruleLinkType ) )
            // InternalProblem.g:2551:2: ( ruleLinkType )
            {
            // InternalProblem.g:2551:2: ( ruleLinkType )
            // InternalProblem.g:2552:3: ruleLinkType
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
    // InternalProblem.g:2561:1: rule__Link__ToAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Link__ToAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2565:1: ( ( ( RULE_ID ) ) )
            // InternalProblem.g:2566:2: ( ( RULE_ID ) )
            {
            // InternalProblem.g:2566:2: ( ( RULE_ID ) )
            // InternalProblem.g:2567:3: ( RULE_ID )
            {
             before(grammarAccess.getLinkAccess().getToNodeCrossReference_2_0()); 
            // InternalProblem.g:2568:3: ( RULE_ID )
            // InternalProblem.g:2569:4: RULE_ID
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
    // InternalProblem.g:2580:1: rule__Link__PhenomenaAssignment_3_1 : ( rulePhenomenon ) ;
    public final void rule__Link__PhenomenaAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2584:1: ( ( rulePhenomenon ) )
            // InternalProblem.g:2585:2: ( rulePhenomenon )
            {
            // InternalProblem.g:2585:2: ( rulePhenomenon )
            // InternalProblem.g:2586:3: rulePhenomenon
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
    // InternalProblem.g:2595:1: rule__Link__PhenomenaAssignment_3_2_1 : ( rulePhenomenon ) ;
    public final void rule__Link__PhenomenaAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2599:1: ( ( rulePhenomenon ) )
            // InternalProblem.g:2600:2: ( rulePhenomenon )
            {
            // InternalProblem.g:2600:2: ( rulePhenomenon )
            // InternalProblem.g:2601:3: rulePhenomenon
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
    // InternalProblem.g:2610:1: rule__Link__TimingAssignment_3_3_0 : ( ruleConstraint ) ;
    public final void rule__Link__TimingAssignment_3_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2614:1: ( ( ruleConstraint ) )
            // InternalProblem.g:2615:2: ( ruleConstraint )
            {
            // InternalProblem.g:2615:2: ( ruleConstraint )
            // InternalProblem.g:2616:3: ruleConstraint
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
    // InternalProblem.g:2625:1: rule__Link__TimingAssignment_3_3_1_1 : ( ruleConstraint ) ;
    public final void rule__Link__TimingAssignment_3_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2629:1: ( ( ruleConstraint ) )
            // InternalProblem.g:2630:2: ( ruleConstraint )
            {
            // InternalProblem.g:2630:2: ( ruleConstraint )
            // InternalProblem.g:2631:3: ruleConstraint
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
    // InternalProblem.g:2640:1: rule__Link__DescriptionAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Link__DescriptionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProblem.g:2644:1: ( ( RULE_STRING ) )
            // InternalProblem.g:2645:2: ( RULE_STRING )
            {
            // InternalProblem.g:2645:2: ( RULE_STRING )
            // InternalProblem.g:2646:3: RULE_STRING
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