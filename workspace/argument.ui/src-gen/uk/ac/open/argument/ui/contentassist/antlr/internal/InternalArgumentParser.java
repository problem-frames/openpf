package uk.ac.open.argument.ui.contentassist.antlr.internal; 

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
import uk.ac.open.argument.services.ArgumentGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalArgumentParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_BOOLEAN", "RULE_QUALIFIED_NAME", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'?'", "'!'", "'argument:'", "'rebutted by'", "'on'", "'mitigated by'", "':'", "'round'", "'replacing'", "'with'", "'foreground'", "'background'", "'shape'", "'image'", "'{'", "'}'", "'supported by'", "','", "'warranted by'", "'('", "')'", "'-'", "'->'", "'<->'", "'|'", "'&'", "'!='", "'=='", "'>='", "'<='", "'='", "'<'", "'>'", "'+'", "'*'", "'/'", "'^'"
    };
    public static final int RULE_BOOLEAN=7;
    public static final int RULE_ID=4;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_INT=6;
    public static final int RULE_QUALIFIED_NAME=8;
    public static final int RULE_WS=11;
    public static final int RULE_SL_COMMENT=10;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=9;

        public InternalArgumentParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g"; }


     
     	private ArgumentGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ArgumentGrammarAccess grammarAccess) {
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




    // $ANTLR start entryRuleArgumentDiagram
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:61:1: entryRuleArgumentDiagram : ruleArgumentDiagram EOF ;
    public final void entryRuleArgumentDiagram() throws RecognitionException {
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:62:1: ( ruleArgumentDiagram EOF )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:63:1: ruleArgumentDiagram EOF
            {
             before(grammarAccess.getArgumentDiagramRule()); 
            pushFollow(FOLLOW_ruleArgumentDiagram_in_entryRuleArgumentDiagram61);
            ruleArgumentDiagram();
            _fsp--;

             after(grammarAccess.getArgumentDiagramRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgumentDiagram68); 

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
    // $ANTLR end entryRuleArgumentDiagram


    // $ANTLR start ruleArgumentDiagram
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:70:1: ruleArgumentDiagram : ( ( rule__ArgumentDiagram__Group__0 ) ) ;
    public final void ruleArgumentDiagram() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:74:2: ( ( ( rule__ArgumentDiagram__Group__0 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:75:1: ( ( rule__ArgumentDiagram__Group__0 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:75:1: ( ( rule__ArgumentDiagram__Group__0 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:76:1: ( rule__ArgumentDiagram__Group__0 )
            {
             before(grammarAccess.getArgumentDiagramAccess().getGroup()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:77:1: ( rule__ArgumentDiagram__Group__0 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:77:2: rule__ArgumentDiagram__Group__0
            {
            pushFollow(FOLLOW_rule__ArgumentDiagram__Group__0_in_ruleArgumentDiagram94);
            rule__ArgumentDiagram__Group__0();
            _fsp--;


            }

             after(grammarAccess.getArgumentDiagramAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleArgumentDiagram


    // $ANTLR start entryRuleLink
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:89:1: entryRuleLink : ruleLink EOF ;
    public final void entryRuleLink() throws RecognitionException {
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:90:1: ( ruleLink EOF )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:91:1: ruleLink EOF
            {
             before(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_ruleLink_in_entryRuleLink121);
            ruleLink();
            _fsp--;

             after(grammarAccess.getLinkRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLink128); 

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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:98:1: ruleLink : ( ( rule__Link__Alternatives ) ) ;
    public final void ruleLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:102:2: ( ( ( rule__Link__Alternatives ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:103:1: ( ( rule__Link__Alternatives ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:103:1: ( ( rule__Link__Alternatives ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:104:1: ( rule__Link__Alternatives )
            {
             before(grammarAccess.getLinkAccess().getAlternatives()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:105:1: ( rule__Link__Alternatives )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:105:2: rule__Link__Alternatives
            {
            pushFollow(FOLLOW_rule__Link__Alternatives_in_ruleLink154);
            rule__Link__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getLinkAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start entryRuleRebuts
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:117:1: entryRuleRebuts : ruleRebuts EOF ;
    public final void entryRuleRebuts() throws RecognitionException {
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:118:1: ( ruleRebuts EOF )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:119:1: ruleRebuts EOF
            {
             before(grammarAccess.getRebutsRule()); 
            pushFollow(FOLLOW_ruleRebuts_in_entryRuleRebuts181);
            ruleRebuts();
            _fsp--;

             after(grammarAccess.getRebutsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRebuts188); 

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
    // $ANTLR end entryRuleRebuts


    // $ANTLR start ruleRebuts
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:126:1: ruleRebuts : ( ( rule__Rebuts__Group__0 ) ) ;
    public final void ruleRebuts() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:130:2: ( ( ( rule__Rebuts__Group__0 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:131:1: ( ( rule__Rebuts__Group__0 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:131:1: ( ( rule__Rebuts__Group__0 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:132:1: ( rule__Rebuts__Group__0 )
            {
             before(grammarAccess.getRebutsAccess().getGroup()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:133:1: ( rule__Rebuts__Group__0 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:133:2: rule__Rebuts__Group__0
            {
            pushFollow(FOLLOW_rule__Rebuts__Group__0_in_ruleRebuts214);
            rule__Rebuts__Group__0();
            _fsp--;


            }

             after(grammarAccess.getRebutsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleRebuts


    // $ANTLR start entryRuleMitigates
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:145:1: entryRuleMitigates : ruleMitigates EOF ;
    public final void entryRuleMitigates() throws RecognitionException {
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:146:1: ( ruleMitigates EOF )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:147:1: ruleMitigates EOF
            {
             before(grammarAccess.getMitigatesRule()); 
            pushFollow(FOLLOW_ruleMitigates_in_entryRuleMitigates241);
            ruleMitigates();
            _fsp--;

             after(grammarAccess.getMitigatesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMitigates248); 

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
    // $ANTLR end entryRuleMitigates


    // $ANTLR start ruleMitigates
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:154:1: ruleMitigates : ( ( rule__Mitigates__Group__0 ) ) ;
    public final void ruleMitigates() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:158:2: ( ( ( rule__Mitigates__Group__0 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:159:1: ( ( rule__Mitigates__Group__0 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:159:1: ( ( rule__Mitigates__Group__0 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:160:1: ( rule__Mitigates__Group__0 )
            {
             before(grammarAccess.getMitigatesAccess().getGroup()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:161:1: ( rule__Mitigates__Group__0 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:161:2: rule__Mitigates__Group__0
            {
            pushFollow(FOLLOW_rule__Mitigates__Group__0_in_ruleMitigates274);
            rule__Mitigates__Group__0();
            _fsp--;


            }

             after(grammarAccess.getMitigatesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleMitigates


    // $ANTLR start entryRuleArgument
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:173:1: entryRuleArgument : ruleArgument EOF ;
    public final void entryRuleArgument() throws RecognitionException {
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:174:1: ( ruleArgument EOF )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:175:1: ruleArgument EOF
            {
             before(grammarAccess.getArgumentRule()); 
            pushFollow(FOLLOW_ruleArgument_in_entryRuleArgument301);
            ruleArgument();
            _fsp--;

             after(grammarAccess.getArgumentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgument308); 

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
    // $ANTLR end entryRuleArgument


    // $ANTLR start ruleArgument
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:182:1: ruleArgument : ( ( rule__Argument__Group__0 ) ) ;
    public final void ruleArgument() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:186:2: ( ( ( rule__Argument__Group__0 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:187:1: ( ( rule__Argument__Group__0 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:187:1: ( ( rule__Argument__Group__0 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:188:1: ( rule__Argument__Group__0 )
            {
             before(grammarAccess.getArgumentAccess().getGroup()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:189:1: ( rule__Argument__Group__0 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:189:2: rule__Argument__Group__0
            {
            pushFollow(FOLLOW_rule__Argument__Group__0_in_ruleArgument334);
            rule__Argument__Group__0();
            _fsp--;


            }

             after(grammarAccess.getArgumentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleArgument


    // $ANTLR start entryRuleExpression
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:201:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:202:1: ( ruleExpression EOF )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:203:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression361);
            ruleExpression();
            _fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression368); 

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
    // $ANTLR end entryRuleExpression


    // $ANTLR start ruleExpression
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:210:1: ruleExpression : ( ( rule__Expression__AssignAssignment ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:214:2: ( ( ( rule__Expression__AssignAssignment ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:215:1: ( ( rule__Expression__AssignAssignment ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:215:1: ( ( rule__Expression__AssignAssignment ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:216:1: ( rule__Expression__AssignAssignment )
            {
             before(grammarAccess.getExpressionAccess().getAssignAssignment()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:217:1: ( rule__Expression__AssignAssignment )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:217:2: rule__Expression__AssignAssignment
            {
            pushFollow(FOLLOW_rule__Expression__AssignAssignment_in_ruleExpression394);
            rule__Expression__AssignAssignment();
            _fsp--;


            }

             after(grammarAccess.getExpressionAccess().getAssignAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleExpression


    // $ANTLR start entryRuleAssignmentOp
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:229:1: entryRuleAssignmentOp : ruleAssignmentOp EOF ;
    public final void entryRuleAssignmentOp() throws RecognitionException {
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:230:1: ( ruleAssignmentOp EOF )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:231:1: ruleAssignmentOp EOF
            {
             before(grammarAccess.getAssignmentOpRule()); 
            pushFollow(FOLLOW_ruleAssignmentOp_in_entryRuleAssignmentOp421);
            ruleAssignmentOp();
            _fsp--;

             after(grammarAccess.getAssignmentOpRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignmentOp428); 

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
    // $ANTLR end entryRuleAssignmentOp


    // $ANTLR start ruleAssignmentOp
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:238:1: ruleAssignmentOp : ( ( rule__AssignmentOp__Group__0 ) ) ;
    public final void ruleAssignmentOp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:242:2: ( ( ( rule__AssignmentOp__Group__0 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:243:1: ( ( rule__AssignmentOp__Group__0 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:243:1: ( ( rule__AssignmentOp__Group__0 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:244:1: ( rule__AssignmentOp__Group__0 )
            {
             before(grammarAccess.getAssignmentOpAccess().getGroup()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:245:1: ( rule__AssignmentOp__Group__0 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:245:2: rule__AssignmentOp__Group__0
            {
            pushFollow(FOLLOW_rule__AssignmentOp__Group__0_in_ruleAssignmentOp454);
            rule__AssignmentOp__Group__0();
            _fsp--;


            }

             after(grammarAccess.getAssignmentOpAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleAssignmentOp


    // $ANTLR start entryRuleOrExp
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:257:1: entryRuleOrExp : ruleOrExp EOF ;
    public final void entryRuleOrExp() throws RecognitionException {
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:258:1: ( ruleOrExp EOF )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:259:1: ruleOrExp EOF
            {
             before(grammarAccess.getOrExpRule()); 
            pushFollow(FOLLOW_ruleOrExp_in_entryRuleOrExp481);
            ruleOrExp();
            _fsp--;

             after(grammarAccess.getOrExpRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrExp488); 

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
    // $ANTLR end entryRuleOrExp


    // $ANTLR start ruleOrExp
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:266:1: ruleOrExp : ( ( rule__OrExp__Group__0 ) ) ;
    public final void ruleOrExp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:270:2: ( ( ( rule__OrExp__Group__0 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:271:1: ( ( rule__OrExp__Group__0 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:271:1: ( ( rule__OrExp__Group__0 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:272:1: ( rule__OrExp__Group__0 )
            {
             before(grammarAccess.getOrExpAccess().getGroup()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:273:1: ( rule__OrExp__Group__0 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:273:2: rule__OrExp__Group__0
            {
            pushFollow(FOLLOW_rule__OrExp__Group__0_in_ruleOrExp514);
            rule__OrExp__Group__0();
            _fsp--;


            }

             after(grammarAccess.getOrExpAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleOrExp


    // $ANTLR start entryRuleAndExp
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:285:1: entryRuleAndExp : ruleAndExp EOF ;
    public final void entryRuleAndExp() throws RecognitionException {
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:286:1: ( ruleAndExp EOF )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:287:1: ruleAndExp EOF
            {
             before(grammarAccess.getAndExpRule()); 
            pushFollow(FOLLOW_ruleAndExp_in_entryRuleAndExp541);
            ruleAndExp();
            _fsp--;

             after(grammarAccess.getAndExpRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndExp548); 

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
    // $ANTLR end entryRuleAndExp


    // $ANTLR start ruleAndExp
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:294:1: ruleAndExp : ( ( rule__AndExp__Group__0 ) ) ;
    public final void ruleAndExp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:298:2: ( ( ( rule__AndExp__Group__0 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:299:1: ( ( rule__AndExp__Group__0 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:299:1: ( ( rule__AndExp__Group__0 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:300:1: ( rule__AndExp__Group__0 )
            {
             before(grammarAccess.getAndExpAccess().getGroup()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:301:1: ( rule__AndExp__Group__0 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:301:2: rule__AndExp__Group__0
            {
            pushFollow(FOLLOW_rule__AndExp__Group__0_in_ruleAndExp574);
            rule__AndExp__Group__0();
            _fsp--;


            }

             after(grammarAccess.getAndExpAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleAndExp


    // $ANTLR start entryRuleRelational
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:313:1: entryRuleRelational : ruleRelational EOF ;
    public final void entryRuleRelational() throws RecognitionException {
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:314:1: ( ruleRelational EOF )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:315:1: ruleRelational EOF
            {
             before(grammarAccess.getRelationalRule()); 
            pushFollow(FOLLOW_ruleRelational_in_entryRuleRelational601);
            ruleRelational();
            _fsp--;

             after(grammarAccess.getRelationalRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelational608); 

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
    // $ANTLR end entryRuleRelational


    // $ANTLR start ruleRelational
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:322:1: ruleRelational : ( ( rule__Relational__Group__0 ) ) ;
    public final void ruleRelational() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:326:2: ( ( ( rule__Relational__Group__0 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:327:1: ( ( rule__Relational__Group__0 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:327:1: ( ( rule__Relational__Group__0 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:328:1: ( rule__Relational__Group__0 )
            {
             before(grammarAccess.getRelationalAccess().getGroup()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:329:1: ( rule__Relational__Group__0 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:329:2: rule__Relational__Group__0
            {
            pushFollow(FOLLOW_rule__Relational__Group__0_in_ruleRelational634);
            rule__Relational__Group__0();
            _fsp--;


            }

             after(grammarAccess.getRelationalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleRelational


    // $ANTLR start entryRuleAddition
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:341:1: entryRuleAddition : ruleAddition EOF ;
    public final void entryRuleAddition() throws RecognitionException {
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:342:1: ( ruleAddition EOF )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:343:1: ruleAddition EOF
            {
             before(grammarAccess.getAdditionRule()); 
            pushFollow(FOLLOW_ruleAddition_in_entryRuleAddition661);
            ruleAddition();
            _fsp--;

             after(grammarAccess.getAdditionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddition668); 

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
    // $ANTLR end entryRuleAddition


    // $ANTLR start ruleAddition
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:350:1: ruleAddition : ( ( rule__Addition__Group__0 ) ) ;
    public final void ruleAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:354:2: ( ( ( rule__Addition__Group__0 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:355:1: ( ( rule__Addition__Group__0 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:355:1: ( ( rule__Addition__Group__0 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:356:1: ( rule__Addition__Group__0 )
            {
             before(grammarAccess.getAdditionAccess().getGroup()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:357:1: ( rule__Addition__Group__0 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:357:2: rule__Addition__Group__0
            {
            pushFollow(FOLLOW_rule__Addition__Group__0_in_ruleAddition694);
            rule__Addition__Group__0();
            _fsp--;


            }

             after(grammarAccess.getAdditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleAddition


    // $ANTLR start entryRuleMultiplication
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:369:1: entryRuleMultiplication : ruleMultiplication EOF ;
    public final void entryRuleMultiplication() throws RecognitionException {
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:370:1: ( ruleMultiplication EOF )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:371:1: ruleMultiplication EOF
            {
             before(grammarAccess.getMultiplicationRule()); 
            pushFollow(FOLLOW_ruleMultiplication_in_entryRuleMultiplication721);
            ruleMultiplication();
            _fsp--;

             after(grammarAccess.getMultiplicationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplication728); 

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
    // $ANTLR end entryRuleMultiplication


    // $ANTLR start ruleMultiplication
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:378:1: ruleMultiplication : ( ( rule__Multiplication__Group__0 ) ) ;
    public final void ruleMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:382:2: ( ( ( rule__Multiplication__Group__0 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:383:1: ( ( rule__Multiplication__Group__0 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:383:1: ( ( rule__Multiplication__Group__0 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:384:1: ( rule__Multiplication__Group__0 )
            {
             before(grammarAccess.getMultiplicationAccess().getGroup()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:385:1: ( rule__Multiplication__Group__0 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:385:2: rule__Multiplication__Group__0
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__0_in_ruleMultiplication754);
            rule__Multiplication__Group__0();
            _fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleMultiplication


    // $ANTLR start entryRulePower
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:397:1: entryRulePower : rulePower EOF ;
    public final void entryRulePower() throws RecognitionException {
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:398:1: ( rulePower EOF )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:399:1: rulePower EOF
            {
             before(grammarAccess.getPowerRule()); 
            pushFollow(FOLLOW_rulePower_in_entryRulePower781);
            rulePower();
            _fsp--;

             after(grammarAccess.getPowerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePower788); 

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
    // $ANTLR end entryRulePower


    // $ANTLR start rulePower
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:406:1: rulePower : ( ( rule__Power__Group__0 ) ) ;
    public final void rulePower() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:410:2: ( ( ( rule__Power__Group__0 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:411:1: ( ( rule__Power__Group__0 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:411:1: ( ( rule__Power__Group__0 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:412:1: ( rule__Power__Group__0 )
            {
             before(grammarAccess.getPowerAccess().getGroup()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:413:1: ( rule__Power__Group__0 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:413:2: rule__Power__Group__0
            {
            pushFollow(FOLLOW_rule__Power__Group__0_in_rulePower814);
            rule__Power__Group__0();
            _fsp--;


            }

             after(grammarAccess.getPowerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rulePower


    // $ANTLR start entryRuleUnaryExpr
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:425:1: entryRuleUnaryExpr : ruleUnaryExpr EOF ;
    public final void entryRuleUnaryExpr() throws RecognitionException {
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:426:1: ( ruleUnaryExpr EOF )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:427:1: ruleUnaryExpr EOF
            {
             before(grammarAccess.getUnaryExprRule()); 
            pushFollow(FOLLOW_ruleUnaryExpr_in_entryRuleUnaryExpr841);
            ruleUnaryExpr();
            _fsp--;

             after(grammarAccess.getUnaryExprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryExpr848); 

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
    // $ANTLR end entryRuleUnaryExpr


    // $ANTLR start ruleUnaryExpr
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:434:1: ruleUnaryExpr : ( ( rule__UnaryExpr__Group__0 ) ) ;
    public final void ruleUnaryExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:438:2: ( ( ( rule__UnaryExpr__Group__0 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:439:1: ( ( rule__UnaryExpr__Group__0 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:439:1: ( ( rule__UnaryExpr__Group__0 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:440:1: ( rule__UnaryExpr__Group__0 )
            {
             before(grammarAccess.getUnaryExprAccess().getGroup()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:441:1: ( rule__UnaryExpr__Group__0 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:441:2: rule__UnaryExpr__Group__0
            {
            pushFollow(FOLLOW_rule__UnaryExpr__Group__0_in_ruleUnaryExpr874);
            rule__UnaryExpr__Group__0();
            _fsp--;


            }

             after(grammarAccess.getUnaryExprAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleUnaryExpr


    // $ANTLR start entryRulePrePrimaryExpr
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:453:1: entryRulePrePrimaryExpr : rulePrePrimaryExpr EOF ;
    public final void entryRulePrePrimaryExpr() throws RecognitionException {
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:454:1: ( rulePrePrimaryExpr EOF )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:455:1: rulePrePrimaryExpr EOF
            {
             before(grammarAccess.getPrePrimaryExprRule()); 
            pushFollow(FOLLOW_rulePrePrimaryExpr_in_entryRulePrePrimaryExpr901);
            rulePrePrimaryExpr();
            _fsp--;

             after(grammarAccess.getPrePrimaryExprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrePrimaryExpr908); 

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
    // $ANTLR end entryRulePrePrimaryExpr


    // $ANTLR start rulePrePrimaryExpr
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:462:1: rulePrePrimaryExpr : ( ( rule__PrePrimaryExpr__Alternatives ) ) ;
    public final void rulePrePrimaryExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:466:2: ( ( ( rule__PrePrimaryExpr__Alternatives ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:467:1: ( ( rule__PrePrimaryExpr__Alternatives ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:467:1: ( ( rule__PrePrimaryExpr__Alternatives ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:468:1: ( rule__PrePrimaryExpr__Alternatives )
            {
             before(grammarAccess.getPrePrimaryExprAccess().getAlternatives()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:469:1: ( rule__PrePrimaryExpr__Alternatives )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:469:2: rule__PrePrimaryExpr__Alternatives
            {
            pushFollow(FOLLOW_rule__PrePrimaryExpr__Alternatives_in_rulePrePrimaryExpr934);
            rule__PrePrimaryExpr__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getPrePrimaryExprAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rulePrePrimaryExpr


    // $ANTLR start entryRuleTerminalExpression
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:481:1: entryRuleTerminalExpression : ruleTerminalExpression EOF ;
    public final void entryRuleTerminalExpression() throws RecognitionException {
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:482:1: ( ruleTerminalExpression EOF )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:483:1: ruleTerminalExpression EOF
            {
             before(grammarAccess.getTerminalExpressionRule()); 
            pushFollow(FOLLOW_ruleTerminalExpression_in_entryRuleTerminalExpression961);
            ruleTerminalExpression();
            _fsp--;

             after(grammarAccess.getTerminalExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerminalExpression968); 

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
    // $ANTLR end entryRuleTerminalExpression


    // $ANTLR start ruleTerminalExpression
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:490:1: ruleTerminalExpression : ( ( rule__TerminalExpression__Alternatives ) ) ;
    public final void ruleTerminalExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:494:2: ( ( ( rule__TerminalExpression__Alternatives ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:495:1: ( ( rule__TerminalExpression__Alternatives ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:495:1: ( ( rule__TerminalExpression__Alternatives ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:496:1: ( rule__TerminalExpression__Alternatives )
            {
             before(grammarAccess.getTerminalExpressionAccess().getAlternatives()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:497:1: ( rule__TerminalExpression__Alternatives )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:497:2: rule__TerminalExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Alternatives_in_ruleTerminalExpression994);
            rule__TerminalExpression__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getTerminalExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleTerminalExpression


    // $ANTLR start ruleUnaryOp
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:510:1: ruleUnaryOp : ( ( rule__UnaryOp__Alternatives ) ) ;
    public final void ruleUnaryOp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:514:1: ( ( ( rule__UnaryOp__Alternatives ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:515:1: ( ( rule__UnaryOp__Alternatives ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:515:1: ( ( rule__UnaryOp__Alternatives ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:516:1: ( rule__UnaryOp__Alternatives )
            {
             before(grammarAccess.getUnaryOpAccess().getAlternatives()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:517:1: ( rule__UnaryOp__Alternatives )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:517:2: rule__UnaryOp__Alternatives
            {
            pushFollow(FOLLOW_rule__UnaryOp__Alternatives_in_ruleUnaryOp1031);
            rule__UnaryOp__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getUnaryOpAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleUnaryOp


    // $ANTLR start rule__ArgumentDiagram__Alternatives_1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:528:1: rule__ArgumentDiagram__Alternatives_1 : ( ( ( rule__ArgumentDiagram__NodesAssignment_1_0 ) ) | ( ( rule__ArgumentDiagram__LinksAssignment_1_1 ) ) );
    public final void rule__ArgumentDiagram__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:532:1: ( ( ( rule__ArgumentDiagram__NodesAssignment_1_0 ) ) | ( ( rule__ArgumentDiagram__LinksAssignment_1_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==RULE_STRING||LA1_1==19) ) {
                    alt1=1;
                }
                else if ( (LA1_1==16||LA1_1==18) ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("528:1: rule__ArgumentDiagram__Alternatives_1 : ( ( ( rule__ArgumentDiagram__NodesAssignment_1_0 ) ) | ( ( rule__ArgumentDiagram__LinksAssignment_1_1 ) ) );", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("528:1: rule__ArgumentDiagram__Alternatives_1 : ( ( ( rule__ArgumentDiagram__NodesAssignment_1_0 ) ) | ( ( rule__ArgumentDiagram__LinksAssignment_1_1 ) ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:533:1: ( ( rule__ArgumentDiagram__NodesAssignment_1_0 ) )
                    {
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:533:1: ( ( rule__ArgumentDiagram__NodesAssignment_1_0 ) )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:534:1: ( rule__ArgumentDiagram__NodesAssignment_1_0 )
                    {
                     before(grammarAccess.getArgumentDiagramAccess().getNodesAssignment_1_0()); 
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:535:1: ( rule__ArgumentDiagram__NodesAssignment_1_0 )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:535:2: rule__ArgumentDiagram__NodesAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__ArgumentDiagram__NodesAssignment_1_0_in_rule__ArgumentDiagram__Alternatives_11066);
                    rule__ArgumentDiagram__NodesAssignment_1_0();
                    _fsp--;


                    }

                     after(grammarAccess.getArgumentDiagramAccess().getNodesAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:539:6: ( ( rule__ArgumentDiagram__LinksAssignment_1_1 ) )
                    {
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:539:6: ( ( rule__ArgumentDiagram__LinksAssignment_1_1 ) )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:540:1: ( rule__ArgumentDiagram__LinksAssignment_1_1 )
                    {
                     before(grammarAccess.getArgumentDiagramAccess().getLinksAssignment_1_1()); 
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:541:1: ( rule__ArgumentDiagram__LinksAssignment_1_1 )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:541:2: rule__ArgumentDiagram__LinksAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__ArgumentDiagram__LinksAssignment_1_1_in_rule__ArgumentDiagram__Alternatives_11084);
                    rule__ArgumentDiagram__LinksAssignment_1_1();
                    _fsp--;


                    }

                     after(grammarAccess.getArgumentDiagramAccess().getLinksAssignment_1_1()); 

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
    // $ANTLR end rule__ArgumentDiagram__Alternatives_1


    // $ANTLR start rule__Link__Alternatives
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:550:1: rule__Link__Alternatives : ( ( ruleRebuts ) | ( ruleMitigates ) );
    public final void rule__Link__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:554:1: ( ( ruleRebuts ) | ( ruleMitigates ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==16) ) {
                    alt2=1;
                }
                else if ( (LA2_1==18) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("550:1: rule__Link__Alternatives : ( ( ruleRebuts ) | ( ruleMitigates ) );", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("550:1: rule__Link__Alternatives : ( ( ruleRebuts ) | ( ruleMitigates ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:555:1: ( ruleRebuts )
                    {
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:555:1: ( ruleRebuts )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:556:1: ruleRebuts
                    {
                     before(grammarAccess.getLinkAccess().getRebutsParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleRebuts_in_rule__Link__Alternatives1117);
                    ruleRebuts();
                    _fsp--;

                     after(grammarAccess.getLinkAccess().getRebutsParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:561:6: ( ruleMitigates )
                    {
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:561:6: ( ruleMitigates )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:562:1: ruleMitigates
                    {
                     before(grammarAccess.getLinkAccess().getMitigatesParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleMitigates_in_rule__Link__Alternatives1134);
                    ruleMitigates();
                    _fsp--;

                     after(grammarAccess.getLinkAccess().getMitigatesParserRuleCall_1()); 

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
    // $ANTLR end rule__Link__Alternatives


    // $ANTLR start rule__AssignmentOp__Alternatives_1_0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:572:1: rule__AssignmentOp__Alternatives_1_0 : ( ( ( rule__AssignmentOp__Group_1_0_0__0 ) ) | ( ( rule__AssignmentOp__Group_1_0_1__0 ) ) );
    public final void rule__AssignmentOp__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:576:1: ( ( ( rule__AssignmentOp__Group_1_0_0__0 ) ) | ( ( rule__AssignmentOp__Group_1_0_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==35) ) {
                alt3=1;
            }
            else if ( (LA3_0==36) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("572:1: rule__AssignmentOp__Alternatives_1_0 : ( ( ( rule__AssignmentOp__Group_1_0_0__0 ) ) | ( ( rule__AssignmentOp__Group_1_0_1__0 ) ) );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:577:1: ( ( rule__AssignmentOp__Group_1_0_0__0 ) )
                    {
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:577:1: ( ( rule__AssignmentOp__Group_1_0_0__0 ) )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:578:1: ( rule__AssignmentOp__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getAssignmentOpAccess().getGroup_1_0_0()); 
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:579:1: ( rule__AssignmentOp__Group_1_0_0__0 )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:579:2: rule__AssignmentOp__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_rule__AssignmentOp__Group_1_0_0__0_in_rule__AssignmentOp__Alternatives_1_01166);
                    rule__AssignmentOp__Group_1_0_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getAssignmentOpAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:583:6: ( ( rule__AssignmentOp__Group_1_0_1__0 ) )
                    {
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:583:6: ( ( rule__AssignmentOp__Group_1_0_1__0 ) )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:584:1: ( rule__AssignmentOp__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getAssignmentOpAccess().getGroup_1_0_1()); 
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:585:1: ( rule__AssignmentOp__Group_1_0_1__0 )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:585:2: rule__AssignmentOp__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_rule__AssignmentOp__Group_1_0_1__0_in_rule__AssignmentOp__Alternatives_1_01184);
                    rule__AssignmentOp__Group_1_0_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getAssignmentOpAccess().getGroup_1_0_1()); 

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
    // $ANTLR end rule__AssignmentOp__Alternatives_1_0


    // $ANTLR start rule__Relational__Alternatives_1_0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:594:1: rule__Relational__Alternatives_1_0 : ( ( ( rule__Relational__Group_1_0_0__0 ) ) | ( ( rule__Relational__Group_1_0_1__0 ) ) | ( ( rule__Relational__Group_1_0_2__0 ) ) | ( ( rule__Relational__Group_1_0_3__0 ) ) | ( ( rule__Relational__Group_1_0_4__0 ) ) | ( ( rule__Relational__Group_1_0_5__0 ) ) | ( ( rule__Relational__Group_1_0_6__0 ) ) );
    public final void rule__Relational__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:598:1: ( ( ( rule__Relational__Group_1_0_0__0 ) ) | ( ( rule__Relational__Group_1_0_1__0 ) ) | ( ( rule__Relational__Group_1_0_2__0 ) ) | ( ( rule__Relational__Group_1_0_3__0 ) ) | ( ( rule__Relational__Group_1_0_4__0 ) ) | ( ( rule__Relational__Group_1_0_5__0 ) ) | ( ( rule__Relational__Group_1_0_6__0 ) ) )
            int alt4=7;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt4=1;
                }
                break;
            case 40:
                {
                alt4=2;
                }
                break;
            case 41:
                {
                alt4=3;
                }
                break;
            case 42:
                {
                alt4=4;
                }
                break;
            case 43:
                {
                alt4=5;
                }
                break;
            case 44:
                {
                alt4=6;
                }
                break;
            case 45:
                {
                alt4=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("594:1: rule__Relational__Alternatives_1_0 : ( ( ( rule__Relational__Group_1_0_0__0 ) ) | ( ( rule__Relational__Group_1_0_1__0 ) ) | ( ( rule__Relational__Group_1_0_2__0 ) ) | ( ( rule__Relational__Group_1_0_3__0 ) ) | ( ( rule__Relational__Group_1_0_4__0 ) ) | ( ( rule__Relational__Group_1_0_5__0 ) ) | ( ( rule__Relational__Group_1_0_6__0 ) ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:599:1: ( ( rule__Relational__Group_1_0_0__0 ) )
                    {
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:599:1: ( ( rule__Relational__Group_1_0_0__0 ) )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:600:1: ( rule__Relational__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getRelationalAccess().getGroup_1_0_0()); 
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:601:1: ( rule__Relational__Group_1_0_0__0 )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:601:2: rule__Relational__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_rule__Relational__Group_1_0_0__0_in_rule__Relational__Alternatives_1_01217);
                    rule__Relational__Group_1_0_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getRelationalAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:605:6: ( ( rule__Relational__Group_1_0_1__0 ) )
                    {
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:605:6: ( ( rule__Relational__Group_1_0_1__0 ) )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:606:1: ( rule__Relational__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getRelationalAccess().getGroup_1_0_1()); 
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:607:1: ( rule__Relational__Group_1_0_1__0 )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:607:2: rule__Relational__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_rule__Relational__Group_1_0_1__0_in_rule__Relational__Alternatives_1_01235);
                    rule__Relational__Group_1_0_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getRelationalAccess().getGroup_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:611:6: ( ( rule__Relational__Group_1_0_2__0 ) )
                    {
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:611:6: ( ( rule__Relational__Group_1_0_2__0 ) )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:612:1: ( rule__Relational__Group_1_0_2__0 )
                    {
                     before(grammarAccess.getRelationalAccess().getGroup_1_0_2()); 
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:613:1: ( rule__Relational__Group_1_0_2__0 )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:613:2: rule__Relational__Group_1_0_2__0
                    {
                    pushFollow(FOLLOW_rule__Relational__Group_1_0_2__0_in_rule__Relational__Alternatives_1_01253);
                    rule__Relational__Group_1_0_2__0();
                    _fsp--;


                    }

                     after(grammarAccess.getRelationalAccess().getGroup_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:617:6: ( ( rule__Relational__Group_1_0_3__0 ) )
                    {
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:617:6: ( ( rule__Relational__Group_1_0_3__0 ) )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:618:1: ( rule__Relational__Group_1_0_3__0 )
                    {
                     before(grammarAccess.getRelationalAccess().getGroup_1_0_3()); 
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:619:1: ( rule__Relational__Group_1_0_3__0 )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:619:2: rule__Relational__Group_1_0_3__0
                    {
                    pushFollow(FOLLOW_rule__Relational__Group_1_0_3__0_in_rule__Relational__Alternatives_1_01271);
                    rule__Relational__Group_1_0_3__0();
                    _fsp--;


                    }

                     after(grammarAccess.getRelationalAccess().getGroup_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:623:6: ( ( rule__Relational__Group_1_0_4__0 ) )
                    {
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:623:6: ( ( rule__Relational__Group_1_0_4__0 ) )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:624:1: ( rule__Relational__Group_1_0_4__0 )
                    {
                     before(grammarAccess.getRelationalAccess().getGroup_1_0_4()); 
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:625:1: ( rule__Relational__Group_1_0_4__0 )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:625:2: rule__Relational__Group_1_0_4__0
                    {
                    pushFollow(FOLLOW_rule__Relational__Group_1_0_4__0_in_rule__Relational__Alternatives_1_01289);
                    rule__Relational__Group_1_0_4__0();
                    _fsp--;


                    }

                     after(grammarAccess.getRelationalAccess().getGroup_1_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:629:6: ( ( rule__Relational__Group_1_0_5__0 ) )
                    {
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:629:6: ( ( rule__Relational__Group_1_0_5__0 ) )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:630:1: ( rule__Relational__Group_1_0_5__0 )
                    {
                     before(grammarAccess.getRelationalAccess().getGroup_1_0_5()); 
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:631:1: ( rule__Relational__Group_1_0_5__0 )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:631:2: rule__Relational__Group_1_0_5__0
                    {
                    pushFollow(FOLLOW_rule__Relational__Group_1_0_5__0_in_rule__Relational__Alternatives_1_01307);
                    rule__Relational__Group_1_0_5__0();
                    _fsp--;


                    }

                     after(grammarAccess.getRelationalAccess().getGroup_1_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:635:6: ( ( rule__Relational__Group_1_0_6__0 ) )
                    {
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:635:6: ( ( rule__Relational__Group_1_0_6__0 ) )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:636:1: ( rule__Relational__Group_1_0_6__0 )
                    {
                     before(grammarAccess.getRelationalAccess().getGroup_1_0_6()); 
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:637:1: ( rule__Relational__Group_1_0_6__0 )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:637:2: rule__Relational__Group_1_0_6__0
                    {
                    pushFollow(FOLLOW_rule__Relational__Group_1_0_6__0_in_rule__Relational__Alternatives_1_01325);
                    rule__Relational__Group_1_0_6__0();
                    _fsp--;


                    }

                     after(grammarAccess.getRelationalAccess().getGroup_1_0_6()); 

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
    // $ANTLR end rule__Relational__Alternatives_1_0


    // $ANTLR start rule__Addition__Alternatives_1_0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:646:1: rule__Addition__Alternatives_1_0 : ( ( ( rule__Addition__Group_1_0_0__0 ) ) | ( ( rule__Addition__Group_1_0_1__0 ) ) );
    public final void rule__Addition__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:650:1: ( ( ( rule__Addition__Group_1_0_0__0 ) ) | ( ( rule__Addition__Group_1_0_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==46) ) {
                alt5=1;
            }
            else if ( (LA5_0==34) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("646:1: rule__Addition__Alternatives_1_0 : ( ( ( rule__Addition__Group_1_0_0__0 ) ) | ( ( rule__Addition__Group_1_0_1__0 ) ) );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:651:1: ( ( rule__Addition__Group_1_0_0__0 ) )
                    {
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:651:1: ( ( rule__Addition__Group_1_0_0__0 ) )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:652:1: ( rule__Addition__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getAdditionAccess().getGroup_1_0_0()); 
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:653:1: ( rule__Addition__Group_1_0_0__0 )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:653:2: rule__Addition__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_rule__Addition__Group_1_0_0__0_in_rule__Addition__Alternatives_1_01358);
                    rule__Addition__Group_1_0_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getAdditionAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:657:6: ( ( rule__Addition__Group_1_0_1__0 ) )
                    {
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:657:6: ( ( rule__Addition__Group_1_0_1__0 ) )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:658:1: ( rule__Addition__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getAdditionAccess().getGroup_1_0_1()); 
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:659:1: ( rule__Addition__Group_1_0_1__0 )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:659:2: rule__Addition__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_rule__Addition__Group_1_0_1__0_in_rule__Addition__Alternatives_1_01376);
                    rule__Addition__Group_1_0_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getAdditionAccess().getGroup_1_0_1()); 

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
    // $ANTLR end rule__Addition__Alternatives_1_0


    // $ANTLR start rule__Multiplication__Alternatives_1_0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:668:1: rule__Multiplication__Alternatives_1_0 : ( ( ( rule__Multiplication__Group_1_0_0__0 ) ) | ( ( rule__Multiplication__Group_1_0_1__0 ) ) );
    public final void rule__Multiplication__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:672:1: ( ( ( rule__Multiplication__Group_1_0_0__0 ) ) | ( ( rule__Multiplication__Group_1_0_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==47) ) {
                alt6=1;
            }
            else if ( (LA6_0==48) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("668:1: rule__Multiplication__Alternatives_1_0 : ( ( ( rule__Multiplication__Group_1_0_0__0 ) ) | ( ( rule__Multiplication__Group_1_0_1__0 ) ) );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:673:1: ( ( rule__Multiplication__Group_1_0_0__0 ) )
                    {
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:673:1: ( ( rule__Multiplication__Group_1_0_0__0 ) )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:674:1: ( rule__Multiplication__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getMultiplicationAccess().getGroup_1_0_0()); 
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:675:1: ( rule__Multiplication__Group_1_0_0__0 )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:675:2: rule__Multiplication__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_rule__Multiplication__Group_1_0_0__0_in_rule__Multiplication__Alternatives_1_01409);
                    rule__Multiplication__Group_1_0_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getMultiplicationAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:679:6: ( ( rule__Multiplication__Group_1_0_1__0 ) )
                    {
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:679:6: ( ( rule__Multiplication__Group_1_0_1__0 ) )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:680:1: ( rule__Multiplication__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getMultiplicationAccess().getGroup_1_0_1()); 
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:681:1: ( rule__Multiplication__Group_1_0_1__0 )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:681:2: rule__Multiplication__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_rule__Multiplication__Group_1_0_1__0_in_rule__Multiplication__Alternatives_1_01427);
                    rule__Multiplication__Group_1_0_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getMultiplicationAccess().getGroup_1_0_1()); 

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
    // $ANTLR end rule__Multiplication__Alternatives_1_0


    // $ANTLR start rule__PrePrimaryExpr__Alternatives
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:690:1: rule__PrePrimaryExpr__Alternatives : ( ( ruleTerminalExpression ) | ( ( rule__PrePrimaryExpr__Group_1__0 ) ) | ( ( rule__PrePrimaryExpr__Group_2__0 ) ) );
    public final void rule__PrePrimaryExpr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:694:1: ( ( ruleTerminalExpression ) | ( ( rule__PrePrimaryExpr__Group_1__0 ) ) | ( ( rule__PrePrimaryExpr__Group_2__0 ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_INT:
            case RULE_BOOLEAN:
                {
                alt7=1;
                }
                break;
            case 32:
                {
                alt7=2;
                }
                break;
            case 34:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("690:1: rule__PrePrimaryExpr__Alternatives : ( ( ruleTerminalExpression ) | ( ( rule__PrePrimaryExpr__Group_1__0 ) ) | ( ( rule__PrePrimaryExpr__Group_2__0 ) ) );", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:695:1: ( ruleTerminalExpression )
                    {
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:695:1: ( ruleTerminalExpression )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:696:1: ruleTerminalExpression
                    {
                     before(grammarAccess.getPrePrimaryExprAccess().getTerminalExpressionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleTerminalExpression_in_rule__PrePrimaryExpr__Alternatives1460);
                    ruleTerminalExpression();
                    _fsp--;

                     after(grammarAccess.getPrePrimaryExprAccess().getTerminalExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:701:6: ( ( rule__PrePrimaryExpr__Group_1__0 ) )
                    {
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:701:6: ( ( rule__PrePrimaryExpr__Group_1__0 ) )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:702:1: ( rule__PrePrimaryExpr__Group_1__0 )
                    {
                     before(grammarAccess.getPrePrimaryExprAccess().getGroup_1()); 
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:703:1: ( rule__PrePrimaryExpr__Group_1__0 )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:703:2: rule__PrePrimaryExpr__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__PrePrimaryExpr__Group_1__0_in_rule__PrePrimaryExpr__Alternatives1477);
                    rule__PrePrimaryExpr__Group_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getPrePrimaryExprAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:707:6: ( ( rule__PrePrimaryExpr__Group_2__0 ) )
                    {
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:707:6: ( ( rule__PrePrimaryExpr__Group_2__0 ) )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:708:1: ( rule__PrePrimaryExpr__Group_2__0 )
                    {
                     before(grammarAccess.getPrePrimaryExprAccess().getGroup_2()); 
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:709:1: ( rule__PrePrimaryExpr__Group_2__0 )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:709:2: rule__PrePrimaryExpr__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__PrePrimaryExpr__Group_2__0_in_rule__PrePrimaryExpr__Alternatives1495);
                    rule__PrePrimaryExpr__Group_2__0();
                    _fsp--;


                    }

                     after(grammarAccess.getPrePrimaryExprAccess().getGroup_2()); 

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
    // $ANTLR end rule__PrePrimaryExpr__Alternatives


    // $ANTLR start rule__TerminalExpression__Alternatives
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:718:1: rule__TerminalExpression__Alternatives : ( ( ( rule__TerminalExpression__Group_0__0 ) ) | ( ( rule__TerminalExpression__Group_1__0 ) ) | ( ( rule__TerminalExpression__Group_2__0 ) ) );
    public final void rule__TerminalExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:722:1: ( ( ( rule__TerminalExpression__Group_0__0 ) ) | ( ( rule__TerminalExpression__Group_1__0 ) ) | ( ( rule__TerminalExpression__Group_2__0 ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt8=1;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt8=2;
                }
                break;
            case RULE_ID:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("718:1: rule__TerminalExpression__Alternatives : ( ( ( rule__TerminalExpression__Group_0__0 ) ) | ( ( rule__TerminalExpression__Group_1__0 ) ) | ( ( rule__TerminalExpression__Group_2__0 ) ) );", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:723:1: ( ( rule__TerminalExpression__Group_0__0 ) )
                    {
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:723:1: ( ( rule__TerminalExpression__Group_0__0 ) )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:724:1: ( rule__TerminalExpression__Group_0__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_0()); 
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:725:1: ( rule__TerminalExpression__Group_0__0 )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:725:2: rule__TerminalExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__TerminalExpression__Group_0__0_in_rule__TerminalExpression__Alternatives1528);
                    rule__TerminalExpression__Group_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getTerminalExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:729:6: ( ( rule__TerminalExpression__Group_1__0 ) )
                    {
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:729:6: ( ( rule__TerminalExpression__Group_1__0 ) )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:730:1: ( rule__TerminalExpression__Group_1__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_1()); 
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:731:1: ( rule__TerminalExpression__Group_1__0 )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:731:2: rule__TerminalExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__TerminalExpression__Group_1__0_in_rule__TerminalExpression__Alternatives1546);
                    rule__TerminalExpression__Group_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getTerminalExpressionAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:735:6: ( ( rule__TerminalExpression__Group_2__0 ) )
                    {
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:735:6: ( ( rule__TerminalExpression__Group_2__0 ) )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:736:1: ( rule__TerminalExpression__Group_2__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_2()); 
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:737:1: ( rule__TerminalExpression__Group_2__0 )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:737:2: rule__TerminalExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__TerminalExpression__Group_2__0_in_rule__TerminalExpression__Alternatives1564);
                    rule__TerminalExpression__Group_2__0();
                    _fsp--;


                    }

                     after(grammarAccess.getTerminalExpressionAccess().getGroup_2()); 

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
    // $ANTLR end rule__TerminalExpression__Alternatives


    // $ANTLR start rule__UnaryOp__Alternatives
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:746:1: rule__UnaryOp__Alternatives : ( ( ( '?' ) ) | ( ( '!' ) ) );
    public final void rule__UnaryOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:750:1: ( ( ( '?' ) ) | ( ( '!' ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==13) ) {
                alt9=1;
            }
            else if ( (LA9_0==14) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("746:1: rule__UnaryOp__Alternatives : ( ( ( '?' ) ) | ( ( '!' ) ) );", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:751:1: ( ( '?' ) )
                    {
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:751:1: ( ( '?' ) )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:752:1: ( '?' )
                    {
                     before(grammarAccess.getUnaryOpAccess().getDEFAULTEnumLiteralDeclaration_0()); 
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:753:1: ( '?' )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:753:3: '?'
                    {
                    match(input,13,FOLLOW_13_in_rule__UnaryOp__Alternatives1598); 

                    }

                     after(grammarAccess.getUnaryOpAccess().getDEFAULTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:758:6: ( ( '!' ) )
                    {
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:758:6: ( ( '!' ) )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:759:1: ( '!' )
                    {
                     before(grammarAccess.getUnaryOpAccess().getNOTEnumLiteralDeclaration_1()); 
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:760:1: ( '!' )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:760:3: '!'
                    {
                    match(input,14,FOLLOW_14_in_rule__UnaryOp__Alternatives1619); 

                    }

                     after(grammarAccess.getUnaryOpAccess().getNOTEnumLiteralDeclaration_1()); 

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
    // $ANTLR end rule__UnaryOp__Alternatives


    // $ANTLR start rule__ArgumentDiagram__Group__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:772:1: rule__ArgumentDiagram__Group__0 : rule__ArgumentDiagram__Group__0__Impl rule__ArgumentDiagram__Group__1 ;
    public final void rule__ArgumentDiagram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:776:1: ( rule__ArgumentDiagram__Group__0__Impl rule__ArgumentDiagram__Group__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:777:2: rule__ArgumentDiagram__Group__0__Impl rule__ArgumentDiagram__Group__1
            {
            pushFollow(FOLLOW_rule__ArgumentDiagram__Group__0__Impl_in_rule__ArgumentDiagram__Group__01652);
            rule__ArgumentDiagram__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ArgumentDiagram__Group__1_in_rule__ArgumentDiagram__Group__01655);
            rule__ArgumentDiagram__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ArgumentDiagram__Group__0


    // $ANTLR start rule__ArgumentDiagram__Group__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:784:1: rule__ArgumentDiagram__Group__0__Impl : ( ( rule__ArgumentDiagram__Group_0__0 )? ) ;
    public final void rule__ArgumentDiagram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:788:1: ( ( ( rule__ArgumentDiagram__Group_0__0 )? ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:789:1: ( ( rule__ArgumentDiagram__Group_0__0 )? )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:789:1: ( ( rule__ArgumentDiagram__Group_0__0 )? )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:790:1: ( rule__ArgumentDiagram__Group_0__0 )?
            {
             before(grammarAccess.getArgumentDiagramAccess().getGroup_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:791:1: ( rule__ArgumentDiagram__Group_0__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==15) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:791:2: rule__ArgumentDiagram__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__ArgumentDiagram__Group_0__0_in_rule__ArgumentDiagram__Group__0__Impl1682);
                    rule__ArgumentDiagram__Group_0__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArgumentDiagramAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ArgumentDiagram__Group__0__Impl


    // $ANTLR start rule__ArgumentDiagram__Group__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:801:1: rule__ArgumentDiagram__Group__1 : rule__ArgumentDiagram__Group__1__Impl ;
    public final void rule__ArgumentDiagram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:805:1: ( rule__ArgumentDiagram__Group__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:806:2: rule__ArgumentDiagram__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ArgumentDiagram__Group__1__Impl_in_rule__ArgumentDiagram__Group__11713);
            rule__ArgumentDiagram__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ArgumentDiagram__Group__1


    // $ANTLR start rule__ArgumentDiagram__Group__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:812:1: rule__ArgumentDiagram__Group__1__Impl : ( ( rule__ArgumentDiagram__Alternatives_1 )* ) ;
    public final void rule__ArgumentDiagram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:816:1: ( ( ( rule__ArgumentDiagram__Alternatives_1 )* ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:817:1: ( ( rule__ArgumentDiagram__Alternatives_1 )* )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:817:1: ( ( rule__ArgumentDiagram__Alternatives_1 )* )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:818:1: ( rule__ArgumentDiagram__Alternatives_1 )*
            {
             before(grammarAccess.getArgumentDiagramAccess().getAlternatives_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:819:1: ( rule__ArgumentDiagram__Alternatives_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:819:2: rule__ArgumentDiagram__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_rule__ArgumentDiagram__Alternatives_1_in_rule__ArgumentDiagram__Group__1__Impl1740);
            	    rule__ArgumentDiagram__Alternatives_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getArgumentDiagramAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ArgumentDiagram__Group__1__Impl


    // $ANTLR start rule__ArgumentDiagram__Group_0__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:833:1: rule__ArgumentDiagram__Group_0__0 : rule__ArgumentDiagram__Group_0__0__Impl rule__ArgumentDiagram__Group_0__1 ;
    public final void rule__ArgumentDiagram__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:837:1: ( rule__ArgumentDiagram__Group_0__0__Impl rule__ArgumentDiagram__Group_0__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:838:2: rule__ArgumentDiagram__Group_0__0__Impl rule__ArgumentDiagram__Group_0__1
            {
            pushFollow(FOLLOW_rule__ArgumentDiagram__Group_0__0__Impl_in_rule__ArgumentDiagram__Group_0__01775);
            rule__ArgumentDiagram__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ArgumentDiagram__Group_0__1_in_rule__ArgumentDiagram__Group_0__01778);
            rule__ArgumentDiagram__Group_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ArgumentDiagram__Group_0__0


    // $ANTLR start rule__ArgumentDiagram__Group_0__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:845:1: rule__ArgumentDiagram__Group_0__0__Impl : ( 'argument:' ) ;
    public final void rule__ArgumentDiagram__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:849:1: ( ( 'argument:' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:850:1: ( 'argument:' )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:850:1: ( 'argument:' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:851:1: 'argument:'
            {
             before(grammarAccess.getArgumentDiagramAccess().getArgumentKeyword_0_0()); 
            match(input,15,FOLLOW_15_in_rule__ArgumentDiagram__Group_0__0__Impl1806); 
             after(grammarAccess.getArgumentDiagramAccess().getArgumentKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ArgumentDiagram__Group_0__0__Impl


    // $ANTLR start rule__ArgumentDiagram__Group_0__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:864:1: rule__ArgumentDiagram__Group_0__1 : rule__ArgumentDiagram__Group_0__1__Impl ;
    public final void rule__ArgumentDiagram__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:868:1: ( rule__ArgumentDiagram__Group_0__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:869:2: rule__ArgumentDiagram__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__ArgumentDiagram__Group_0__1__Impl_in_rule__ArgumentDiagram__Group_0__11837);
            rule__ArgumentDiagram__Group_0__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ArgumentDiagram__Group_0__1


    // $ANTLR start rule__ArgumentDiagram__Group_0__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:875:1: rule__ArgumentDiagram__Group_0__1__Impl : ( ( rule__ArgumentDiagram__NameAssignment_0_1 ) ) ;
    public final void rule__ArgumentDiagram__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:879:1: ( ( ( rule__ArgumentDiagram__NameAssignment_0_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:880:1: ( ( rule__ArgumentDiagram__NameAssignment_0_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:880:1: ( ( rule__ArgumentDiagram__NameAssignment_0_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:881:1: ( rule__ArgumentDiagram__NameAssignment_0_1 )
            {
             before(grammarAccess.getArgumentDiagramAccess().getNameAssignment_0_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:882:1: ( rule__ArgumentDiagram__NameAssignment_0_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:882:2: rule__ArgumentDiagram__NameAssignment_0_1
            {
            pushFollow(FOLLOW_rule__ArgumentDiagram__NameAssignment_0_1_in_rule__ArgumentDiagram__Group_0__1__Impl1864);
            rule__ArgumentDiagram__NameAssignment_0_1();
            _fsp--;


            }

             after(grammarAccess.getArgumentDiagramAccess().getNameAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ArgumentDiagram__Group_0__1__Impl


    // $ANTLR start rule__Rebuts__Group__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:896:1: rule__Rebuts__Group__0 : rule__Rebuts__Group__0__Impl rule__Rebuts__Group__1 ;
    public final void rule__Rebuts__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:900:1: ( rule__Rebuts__Group__0__Impl rule__Rebuts__Group__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:901:2: rule__Rebuts__Group__0__Impl rule__Rebuts__Group__1
            {
            pushFollow(FOLLOW_rule__Rebuts__Group__0__Impl_in_rule__Rebuts__Group__01898);
            rule__Rebuts__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Rebuts__Group__1_in_rule__Rebuts__Group__01901);
            rule__Rebuts__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Rebuts__Group__0


    // $ANTLR start rule__Rebuts__Group__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:908:1: rule__Rebuts__Group__0__Impl : ( ( rule__Rebuts__FromAssignment_0 ) ) ;
    public final void rule__Rebuts__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:912:1: ( ( ( rule__Rebuts__FromAssignment_0 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:913:1: ( ( rule__Rebuts__FromAssignment_0 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:913:1: ( ( rule__Rebuts__FromAssignment_0 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:914:1: ( rule__Rebuts__FromAssignment_0 )
            {
             before(grammarAccess.getRebutsAccess().getFromAssignment_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:915:1: ( rule__Rebuts__FromAssignment_0 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:915:2: rule__Rebuts__FromAssignment_0
            {
            pushFollow(FOLLOW_rule__Rebuts__FromAssignment_0_in_rule__Rebuts__Group__0__Impl1928);
            rule__Rebuts__FromAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getRebutsAccess().getFromAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Rebuts__Group__0__Impl


    // $ANTLR start rule__Rebuts__Group__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:925:1: rule__Rebuts__Group__1 : rule__Rebuts__Group__1__Impl rule__Rebuts__Group__2 ;
    public final void rule__Rebuts__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:929:1: ( rule__Rebuts__Group__1__Impl rule__Rebuts__Group__2 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:930:2: rule__Rebuts__Group__1__Impl rule__Rebuts__Group__2
            {
            pushFollow(FOLLOW_rule__Rebuts__Group__1__Impl_in_rule__Rebuts__Group__11958);
            rule__Rebuts__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Rebuts__Group__2_in_rule__Rebuts__Group__11961);
            rule__Rebuts__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Rebuts__Group__1


    // $ANTLR start rule__Rebuts__Group__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:937:1: rule__Rebuts__Group__1__Impl : ( 'rebutted by' ) ;
    public final void rule__Rebuts__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:941:1: ( ( 'rebutted by' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:942:1: ( 'rebutted by' )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:942:1: ( 'rebutted by' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:943:1: 'rebutted by'
            {
             before(grammarAccess.getRebutsAccess().getRebuttedByKeyword_1()); 
            match(input,16,FOLLOW_16_in_rule__Rebuts__Group__1__Impl1989); 
             after(grammarAccess.getRebutsAccess().getRebuttedByKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Rebuts__Group__1__Impl


    // $ANTLR start rule__Rebuts__Group__2
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:956:1: rule__Rebuts__Group__2 : rule__Rebuts__Group__2__Impl rule__Rebuts__Group__3 ;
    public final void rule__Rebuts__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:960:1: ( rule__Rebuts__Group__2__Impl rule__Rebuts__Group__3 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:961:2: rule__Rebuts__Group__2__Impl rule__Rebuts__Group__3
            {
            pushFollow(FOLLOW_rule__Rebuts__Group__2__Impl_in_rule__Rebuts__Group__22020);
            rule__Rebuts__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Rebuts__Group__3_in_rule__Rebuts__Group__22023);
            rule__Rebuts__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Rebuts__Group__2


    // $ANTLR start rule__Rebuts__Group__2__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:968:1: rule__Rebuts__Group__2__Impl : ( ( rule__Rebuts__ToAssignment_2 ) ) ;
    public final void rule__Rebuts__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:972:1: ( ( ( rule__Rebuts__ToAssignment_2 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:973:1: ( ( rule__Rebuts__ToAssignment_2 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:973:1: ( ( rule__Rebuts__ToAssignment_2 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:974:1: ( rule__Rebuts__ToAssignment_2 )
            {
             before(grammarAccess.getRebutsAccess().getToAssignment_2()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:975:1: ( rule__Rebuts__ToAssignment_2 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:975:2: rule__Rebuts__ToAssignment_2
            {
            pushFollow(FOLLOW_rule__Rebuts__ToAssignment_2_in_rule__Rebuts__Group__2__Impl2050);
            rule__Rebuts__ToAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getRebutsAccess().getToAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Rebuts__Group__2__Impl


    // $ANTLR start rule__Rebuts__Group__3
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:985:1: rule__Rebuts__Group__3 : rule__Rebuts__Group__3__Impl rule__Rebuts__Group__4 ;
    public final void rule__Rebuts__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:989:1: ( rule__Rebuts__Group__3__Impl rule__Rebuts__Group__4 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:990:2: rule__Rebuts__Group__3__Impl rule__Rebuts__Group__4
            {
            pushFollow(FOLLOW_rule__Rebuts__Group__3__Impl_in_rule__Rebuts__Group__32080);
            rule__Rebuts__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Rebuts__Group__4_in_rule__Rebuts__Group__32083);
            rule__Rebuts__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Rebuts__Group__3


    // $ANTLR start rule__Rebuts__Group__3__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:997:1: rule__Rebuts__Group__3__Impl : ( 'on' ) ;
    public final void rule__Rebuts__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1001:1: ( ( 'on' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1002:1: ( 'on' )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1002:1: ( 'on' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1003:1: 'on'
            {
             before(grammarAccess.getRebutsAccess().getOnKeyword_3()); 
            match(input,17,FOLLOW_17_in_rule__Rebuts__Group__3__Impl2111); 
             after(grammarAccess.getRebutsAccess().getOnKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Rebuts__Group__3__Impl


    // $ANTLR start rule__Rebuts__Group__4
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1016:1: rule__Rebuts__Group__4 : rule__Rebuts__Group__4__Impl ;
    public final void rule__Rebuts__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1020:1: ( rule__Rebuts__Group__4__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1021:2: rule__Rebuts__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Rebuts__Group__4__Impl_in_rule__Rebuts__Group__42142);
            rule__Rebuts__Group__4__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Rebuts__Group__4


    // $ANTLR start rule__Rebuts__Group__4__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1027:1: rule__Rebuts__Group__4__Impl : ( ( rule__Rebuts__OriginAssignment_4 ) ) ;
    public final void rule__Rebuts__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1031:1: ( ( ( rule__Rebuts__OriginAssignment_4 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1032:1: ( ( rule__Rebuts__OriginAssignment_4 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1032:1: ( ( rule__Rebuts__OriginAssignment_4 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1033:1: ( rule__Rebuts__OriginAssignment_4 )
            {
             before(grammarAccess.getRebutsAccess().getOriginAssignment_4()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1034:1: ( rule__Rebuts__OriginAssignment_4 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1034:2: rule__Rebuts__OriginAssignment_4
            {
            pushFollow(FOLLOW_rule__Rebuts__OriginAssignment_4_in_rule__Rebuts__Group__4__Impl2169);
            rule__Rebuts__OriginAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getRebutsAccess().getOriginAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Rebuts__Group__4__Impl


    // $ANTLR start rule__Mitigates__Group__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1054:1: rule__Mitigates__Group__0 : rule__Mitigates__Group__0__Impl rule__Mitigates__Group__1 ;
    public final void rule__Mitigates__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1058:1: ( rule__Mitigates__Group__0__Impl rule__Mitigates__Group__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1059:2: rule__Mitigates__Group__0__Impl rule__Mitigates__Group__1
            {
            pushFollow(FOLLOW_rule__Mitigates__Group__0__Impl_in_rule__Mitigates__Group__02209);
            rule__Mitigates__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Mitigates__Group__1_in_rule__Mitigates__Group__02212);
            rule__Mitigates__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mitigates__Group__0


    // $ANTLR start rule__Mitigates__Group__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1066:1: rule__Mitigates__Group__0__Impl : ( ( rule__Mitigates__FromAssignment_0 ) ) ;
    public final void rule__Mitigates__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1070:1: ( ( ( rule__Mitigates__FromAssignment_0 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1071:1: ( ( rule__Mitigates__FromAssignment_0 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1071:1: ( ( rule__Mitigates__FromAssignment_0 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1072:1: ( rule__Mitigates__FromAssignment_0 )
            {
             before(grammarAccess.getMitigatesAccess().getFromAssignment_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1073:1: ( rule__Mitigates__FromAssignment_0 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1073:2: rule__Mitigates__FromAssignment_0
            {
            pushFollow(FOLLOW_rule__Mitigates__FromAssignment_0_in_rule__Mitigates__Group__0__Impl2239);
            rule__Mitigates__FromAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getMitigatesAccess().getFromAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mitigates__Group__0__Impl


    // $ANTLR start rule__Mitigates__Group__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1083:1: rule__Mitigates__Group__1 : rule__Mitigates__Group__1__Impl rule__Mitigates__Group__2 ;
    public final void rule__Mitigates__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1087:1: ( rule__Mitigates__Group__1__Impl rule__Mitigates__Group__2 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1088:2: rule__Mitigates__Group__1__Impl rule__Mitigates__Group__2
            {
            pushFollow(FOLLOW_rule__Mitigates__Group__1__Impl_in_rule__Mitigates__Group__12269);
            rule__Mitigates__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Mitigates__Group__2_in_rule__Mitigates__Group__12272);
            rule__Mitigates__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mitigates__Group__1


    // $ANTLR start rule__Mitigates__Group__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1095:1: rule__Mitigates__Group__1__Impl : ( 'mitigated by' ) ;
    public final void rule__Mitigates__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1099:1: ( ( 'mitigated by' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1100:1: ( 'mitigated by' )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1100:1: ( 'mitigated by' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1101:1: 'mitigated by'
            {
             before(grammarAccess.getMitigatesAccess().getMitigatedByKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__Mitigates__Group__1__Impl2300); 
             after(grammarAccess.getMitigatesAccess().getMitigatedByKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mitigates__Group__1__Impl


    // $ANTLR start rule__Mitigates__Group__2
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1114:1: rule__Mitigates__Group__2 : rule__Mitigates__Group__2__Impl rule__Mitigates__Group__3 ;
    public final void rule__Mitigates__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1118:1: ( rule__Mitigates__Group__2__Impl rule__Mitigates__Group__3 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1119:2: rule__Mitigates__Group__2__Impl rule__Mitigates__Group__3
            {
            pushFollow(FOLLOW_rule__Mitigates__Group__2__Impl_in_rule__Mitigates__Group__22331);
            rule__Mitigates__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Mitigates__Group__3_in_rule__Mitigates__Group__22334);
            rule__Mitigates__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mitigates__Group__2


    // $ANTLR start rule__Mitigates__Group__2__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1126:1: rule__Mitigates__Group__2__Impl : ( ( rule__Mitigates__ToAssignment_2 ) ) ;
    public final void rule__Mitigates__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1130:1: ( ( ( rule__Mitigates__ToAssignment_2 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1131:1: ( ( rule__Mitigates__ToAssignment_2 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1131:1: ( ( rule__Mitigates__ToAssignment_2 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1132:1: ( rule__Mitigates__ToAssignment_2 )
            {
             before(grammarAccess.getMitigatesAccess().getToAssignment_2()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1133:1: ( rule__Mitigates__ToAssignment_2 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1133:2: rule__Mitigates__ToAssignment_2
            {
            pushFollow(FOLLOW_rule__Mitigates__ToAssignment_2_in_rule__Mitigates__Group__2__Impl2361);
            rule__Mitigates__ToAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getMitigatesAccess().getToAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mitigates__Group__2__Impl


    // $ANTLR start rule__Mitigates__Group__3
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1143:1: rule__Mitigates__Group__3 : rule__Mitigates__Group__3__Impl rule__Mitigates__Group__4 ;
    public final void rule__Mitigates__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1147:1: ( rule__Mitigates__Group__3__Impl rule__Mitigates__Group__4 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1148:2: rule__Mitigates__Group__3__Impl rule__Mitigates__Group__4
            {
            pushFollow(FOLLOW_rule__Mitigates__Group__3__Impl_in_rule__Mitigates__Group__32391);
            rule__Mitigates__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Mitigates__Group__4_in_rule__Mitigates__Group__32394);
            rule__Mitigates__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mitigates__Group__3


    // $ANTLR start rule__Mitigates__Group__3__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1155:1: rule__Mitigates__Group__3__Impl : ( 'on' ) ;
    public final void rule__Mitigates__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1159:1: ( ( 'on' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1160:1: ( 'on' )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1160:1: ( 'on' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1161:1: 'on'
            {
             before(grammarAccess.getMitigatesAccess().getOnKeyword_3()); 
            match(input,17,FOLLOW_17_in_rule__Mitigates__Group__3__Impl2422); 
             after(grammarAccess.getMitigatesAccess().getOnKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mitigates__Group__3__Impl


    // $ANTLR start rule__Mitigates__Group__4
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1174:1: rule__Mitigates__Group__4 : rule__Mitigates__Group__4__Impl ;
    public final void rule__Mitigates__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1178:1: ( rule__Mitigates__Group__4__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1179:2: rule__Mitigates__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Mitigates__Group__4__Impl_in_rule__Mitigates__Group__42453);
            rule__Mitigates__Group__4__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mitigates__Group__4


    // $ANTLR start rule__Mitigates__Group__4__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1185:1: rule__Mitigates__Group__4__Impl : ( ( rule__Mitigates__RebuttalAssignment_4 ) ) ;
    public final void rule__Mitigates__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1189:1: ( ( ( rule__Mitigates__RebuttalAssignment_4 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1190:1: ( ( rule__Mitigates__RebuttalAssignment_4 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1190:1: ( ( rule__Mitigates__RebuttalAssignment_4 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1191:1: ( rule__Mitigates__RebuttalAssignment_4 )
            {
             before(grammarAccess.getMitigatesAccess().getRebuttalAssignment_4()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1192:1: ( rule__Mitigates__RebuttalAssignment_4 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1192:2: rule__Mitigates__RebuttalAssignment_4
            {
            pushFollow(FOLLOW_rule__Mitigates__RebuttalAssignment_4_in_rule__Mitigates__Group__4__Impl2480);
            rule__Mitigates__RebuttalAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getMitigatesAccess().getRebuttalAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mitigates__Group__4__Impl


    // $ANTLR start rule__Argument__Group__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1212:1: rule__Argument__Group__0 : rule__Argument__Group__0__Impl rule__Argument__Group__1 ;
    public final void rule__Argument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1216:1: ( rule__Argument__Group__0__Impl rule__Argument__Group__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1217:2: rule__Argument__Group__0__Impl rule__Argument__Group__1
            {
            pushFollow(FOLLOW_rule__Argument__Group__0__Impl_in_rule__Argument__Group__02520);
            rule__Argument__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group__1_in_rule__Argument__Group__02523);
            rule__Argument__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group__0


    // $ANTLR start rule__Argument__Group__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1224:1: rule__Argument__Group__0__Impl : ( ( rule__Argument__NameAssignment_0 ) ) ;
    public final void rule__Argument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1228:1: ( ( ( rule__Argument__NameAssignment_0 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1229:1: ( ( rule__Argument__NameAssignment_0 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1229:1: ( ( rule__Argument__NameAssignment_0 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1230:1: ( rule__Argument__NameAssignment_0 )
            {
             before(grammarAccess.getArgumentAccess().getNameAssignment_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1231:1: ( rule__Argument__NameAssignment_0 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1231:2: rule__Argument__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Argument__NameAssignment_0_in_rule__Argument__Group__0__Impl2550);
            rule__Argument__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getArgumentAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group__0__Impl


    // $ANTLR start rule__Argument__Group__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1241:1: rule__Argument__Group__1 : rule__Argument__Group__1__Impl rule__Argument__Group__2 ;
    public final void rule__Argument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1245:1: ( rule__Argument__Group__1__Impl rule__Argument__Group__2 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1246:2: rule__Argument__Group__1__Impl rule__Argument__Group__2
            {
            pushFollow(FOLLOW_rule__Argument__Group__1__Impl_in_rule__Argument__Group__12580);
            rule__Argument__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group__2_in_rule__Argument__Group__12583);
            rule__Argument__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group__1


    // $ANTLR start rule__Argument__Group__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1253:1: rule__Argument__Group__1__Impl : ( ( ':' )? ) ;
    public final void rule__Argument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1257:1: ( ( ( ':' )? ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1258:1: ( ( ':' )? )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1258:1: ( ( ':' )? )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1259:1: ( ':' )?
            {
             before(grammarAccess.getArgumentAccess().getColonKeyword_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1260:1: ( ':' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==19) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1261:2: ':'
                    {
                    match(input,19,FOLLOW_19_in_rule__Argument__Group__1__Impl2612); 

                    }
                    break;

            }

             after(grammarAccess.getArgumentAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group__1__Impl


    // $ANTLR start rule__Argument__Group__2
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1272:1: rule__Argument__Group__2 : rule__Argument__Group__2__Impl rule__Argument__Group__3 ;
    public final void rule__Argument__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1276:1: ( rule__Argument__Group__2__Impl rule__Argument__Group__3 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1277:2: rule__Argument__Group__2__Impl rule__Argument__Group__3
            {
            pushFollow(FOLLOW_rule__Argument__Group__2__Impl_in_rule__Argument__Group__22645);
            rule__Argument__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group__3_in_rule__Argument__Group__22648);
            rule__Argument__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group__2


    // $ANTLR start rule__Argument__Group__2__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1284:1: rule__Argument__Group__2__Impl : ( ( rule__Argument__DescriptionAssignment_2 ) ) ;
    public final void rule__Argument__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1288:1: ( ( ( rule__Argument__DescriptionAssignment_2 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1289:1: ( ( rule__Argument__DescriptionAssignment_2 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1289:1: ( ( rule__Argument__DescriptionAssignment_2 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1290:1: ( rule__Argument__DescriptionAssignment_2 )
            {
             before(grammarAccess.getArgumentAccess().getDescriptionAssignment_2()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1291:1: ( rule__Argument__DescriptionAssignment_2 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1291:2: rule__Argument__DescriptionAssignment_2
            {
            pushFollow(FOLLOW_rule__Argument__DescriptionAssignment_2_in_rule__Argument__Group__2__Impl2675);
            rule__Argument__DescriptionAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getArgumentAccess().getDescriptionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group__2__Impl


    // $ANTLR start rule__Argument__Group__3
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1301:1: rule__Argument__Group__3 : rule__Argument__Group__3__Impl rule__Argument__Group__4 ;
    public final void rule__Argument__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1305:1: ( rule__Argument__Group__3__Impl rule__Argument__Group__4 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1306:2: rule__Argument__Group__3__Impl rule__Argument__Group__4
            {
            pushFollow(FOLLOW_rule__Argument__Group__3__Impl_in_rule__Argument__Group__32705);
            rule__Argument__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group__4_in_rule__Argument__Group__32708);
            rule__Argument__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group__3


    // $ANTLR start rule__Argument__Group__3__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1313:1: rule__Argument__Group__3__Impl : ( ( rule__Argument__Group_3__0 )? ) ;
    public final void rule__Argument__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1317:1: ( ( ( rule__Argument__Group_3__0 )? ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1318:1: ( ( rule__Argument__Group_3__0 )? )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1318:1: ( ( rule__Argument__Group_3__0 )? )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1319:1: ( rule__Argument__Group_3__0 )?
            {
             before(grammarAccess.getArgumentAccess().getGroup_3()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1320:1: ( rule__Argument__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==20) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1320:2: rule__Argument__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Argument__Group_3__0_in_rule__Argument__Group__3__Impl2735);
                    rule__Argument__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArgumentAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group__3__Impl


    // $ANTLR start rule__Argument__Group__4
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1330:1: rule__Argument__Group__4 : rule__Argument__Group__4__Impl rule__Argument__Group__5 ;
    public final void rule__Argument__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1334:1: ( rule__Argument__Group__4__Impl rule__Argument__Group__5 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1335:2: rule__Argument__Group__4__Impl rule__Argument__Group__5
            {
            pushFollow(FOLLOW_rule__Argument__Group__4__Impl_in_rule__Argument__Group__42766);
            rule__Argument__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group__5_in_rule__Argument__Group__42769);
            rule__Argument__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group__4


    // $ANTLR start rule__Argument__Group__4__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1342:1: rule__Argument__Group__4__Impl : ( ( rule__Argument__Group_4__0 )? ) ;
    public final void rule__Argument__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1346:1: ( ( ( rule__Argument__Group_4__0 )? ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1347:1: ( ( rule__Argument__Group_4__0 )? )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1347:1: ( ( rule__Argument__Group_4__0 )? )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1348:1: ( rule__Argument__Group_4__0 )?
            {
             before(grammarAccess.getArgumentAccess().getGroup_4()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1349:1: ( rule__Argument__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==21) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1349:2: rule__Argument__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Argument__Group_4__0_in_rule__Argument__Group__4__Impl2796);
                    rule__Argument__Group_4__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArgumentAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group__4__Impl


    // $ANTLR start rule__Argument__Group__5
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1359:1: rule__Argument__Group__5 : rule__Argument__Group__5__Impl rule__Argument__Group__6 ;
    public final void rule__Argument__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1363:1: ( rule__Argument__Group__5__Impl rule__Argument__Group__6 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1364:2: rule__Argument__Group__5__Impl rule__Argument__Group__6
            {
            pushFollow(FOLLOW_rule__Argument__Group__5__Impl_in_rule__Argument__Group__52827);
            rule__Argument__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group__6_in_rule__Argument__Group__52830);
            rule__Argument__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group__5


    // $ANTLR start rule__Argument__Group__5__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1371:1: rule__Argument__Group__5__Impl : ( ( rule__Argument__Group_5__0 )? ) ;
    public final void rule__Argument__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1375:1: ( ( ( rule__Argument__Group_5__0 )? ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1376:1: ( ( rule__Argument__Group_5__0 )? )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1376:1: ( ( rule__Argument__Group_5__0 )? )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1377:1: ( rule__Argument__Group_5__0 )?
            {
             before(grammarAccess.getArgumentAccess().getGroup_5()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1378:1: ( rule__Argument__Group_5__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==22) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1378:2: rule__Argument__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Argument__Group_5__0_in_rule__Argument__Group__5__Impl2857);
                    rule__Argument__Group_5__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArgumentAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group__5__Impl


    // $ANTLR start rule__Argument__Group__6
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1388:1: rule__Argument__Group__6 : rule__Argument__Group__6__Impl rule__Argument__Group__7 ;
    public final void rule__Argument__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1392:1: ( rule__Argument__Group__6__Impl rule__Argument__Group__7 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1393:2: rule__Argument__Group__6__Impl rule__Argument__Group__7
            {
            pushFollow(FOLLOW_rule__Argument__Group__6__Impl_in_rule__Argument__Group__62888);
            rule__Argument__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group__7_in_rule__Argument__Group__62891);
            rule__Argument__Group__7();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group__6


    // $ANTLR start rule__Argument__Group__6__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1400:1: rule__Argument__Group__6__Impl : ( ( rule__Argument__Group_6__0 )? ) ;
    public final void rule__Argument__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1404:1: ( ( ( rule__Argument__Group_6__0 )? ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1405:1: ( ( rule__Argument__Group_6__0 )? )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1405:1: ( ( rule__Argument__Group_6__0 )? )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1406:1: ( rule__Argument__Group_6__0 )?
            {
             before(grammarAccess.getArgumentAccess().getGroup_6()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1407:1: ( rule__Argument__Group_6__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==23) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1407:2: rule__Argument__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Argument__Group_6__0_in_rule__Argument__Group__6__Impl2918);
                    rule__Argument__Group_6__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArgumentAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group__6__Impl


    // $ANTLR start rule__Argument__Group__7
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1417:1: rule__Argument__Group__7 : rule__Argument__Group__7__Impl rule__Argument__Group__8 ;
    public final void rule__Argument__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1421:1: ( rule__Argument__Group__7__Impl rule__Argument__Group__8 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1422:2: rule__Argument__Group__7__Impl rule__Argument__Group__8
            {
            pushFollow(FOLLOW_rule__Argument__Group__7__Impl_in_rule__Argument__Group__72949);
            rule__Argument__Group__7__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group__8_in_rule__Argument__Group__72952);
            rule__Argument__Group__8();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group__7


    // $ANTLR start rule__Argument__Group__7__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1429:1: rule__Argument__Group__7__Impl : ( ( rule__Argument__Group_7__0 )? ) ;
    public final void rule__Argument__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1433:1: ( ( ( rule__Argument__Group_7__0 )? ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1434:1: ( ( rule__Argument__Group_7__0 )? )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1434:1: ( ( rule__Argument__Group_7__0 )? )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1435:1: ( rule__Argument__Group_7__0 )?
            {
             before(grammarAccess.getArgumentAccess().getGroup_7()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1436:1: ( rule__Argument__Group_7__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==24) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1436:2: rule__Argument__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Argument__Group_7__0_in_rule__Argument__Group__7__Impl2979);
                    rule__Argument__Group_7__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArgumentAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group__7__Impl


    // $ANTLR start rule__Argument__Group__8
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1446:1: rule__Argument__Group__8 : rule__Argument__Group__8__Impl rule__Argument__Group__9 ;
    public final void rule__Argument__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1450:1: ( rule__Argument__Group__8__Impl rule__Argument__Group__9 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1451:2: rule__Argument__Group__8__Impl rule__Argument__Group__9
            {
            pushFollow(FOLLOW_rule__Argument__Group__8__Impl_in_rule__Argument__Group__83010);
            rule__Argument__Group__8__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group__9_in_rule__Argument__Group__83013);
            rule__Argument__Group__9();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group__8


    // $ANTLR start rule__Argument__Group__8__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1458:1: rule__Argument__Group__8__Impl : ( ( rule__Argument__Group_8__0 )? ) ;
    public final void rule__Argument__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1462:1: ( ( ( rule__Argument__Group_8__0 )? ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1463:1: ( ( rule__Argument__Group_8__0 )? )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1463:1: ( ( rule__Argument__Group_8__0 )? )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1464:1: ( rule__Argument__Group_8__0 )?
            {
             before(grammarAccess.getArgumentAccess().getGroup_8()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1465:1: ( rule__Argument__Group_8__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==25) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1465:2: rule__Argument__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__Argument__Group_8__0_in_rule__Argument__Group__8__Impl3040);
                    rule__Argument__Group_8__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArgumentAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group__8__Impl


    // $ANTLR start rule__Argument__Group__9
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1475:1: rule__Argument__Group__9 : rule__Argument__Group__9__Impl rule__Argument__Group__10 ;
    public final void rule__Argument__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1479:1: ( rule__Argument__Group__9__Impl rule__Argument__Group__10 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1480:2: rule__Argument__Group__9__Impl rule__Argument__Group__10
            {
            pushFollow(FOLLOW_rule__Argument__Group__9__Impl_in_rule__Argument__Group__93071);
            rule__Argument__Group__9__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group__10_in_rule__Argument__Group__93074);
            rule__Argument__Group__10();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group__9


    // $ANTLR start rule__Argument__Group__9__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1487:1: rule__Argument__Group__9__Impl : ( ( rule__Argument__Group_9__0 )? ) ;
    public final void rule__Argument__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1491:1: ( ( ( rule__Argument__Group_9__0 )? ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1492:1: ( ( rule__Argument__Group_9__0 )? )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1492:1: ( ( rule__Argument__Group_9__0 )? )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1493:1: ( rule__Argument__Group_9__0 )?
            {
             before(grammarAccess.getArgumentAccess().getGroup_9()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1494:1: ( rule__Argument__Group_9__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==26) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1494:2: rule__Argument__Group_9__0
                    {
                    pushFollow(FOLLOW_rule__Argument__Group_9__0_in_rule__Argument__Group__9__Impl3101);
                    rule__Argument__Group_9__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArgumentAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group__9__Impl


    // $ANTLR start rule__Argument__Group__10
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1504:1: rule__Argument__Group__10 : rule__Argument__Group__10__Impl ;
    public final void rule__Argument__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1508:1: ( rule__Argument__Group__10__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1509:2: rule__Argument__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__Argument__Group__10__Impl_in_rule__Argument__Group__103132);
            rule__Argument__Group__10__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group__10


    // $ANTLR start rule__Argument__Group__10__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1515:1: rule__Argument__Group__10__Impl : ( ( rule__Argument__Group_10__0 )? ) ;
    public final void rule__Argument__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1519:1: ( ( ( rule__Argument__Group_10__0 )? ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1520:1: ( ( rule__Argument__Group_10__0 )? )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1520:1: ( ( rule__Argument__Group_10__0 )? )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1521:1: ( rule__Argument__Group_10__0 )?
            {
             before(grammarAccess.getArgumentAccess().getGroup_10()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1522:1: ( rule__Argument__Group_10__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==27) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1522:2: rule__Argument__Group_10__0
                    {
                    pushFollow(FOLLOW_rule__Argument__Group_10__0_in_rule__Argument__Group__10__Impl3159);
                    rule__Argument__Group_10__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArgumentAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group__10__Impl


    // $ANTLR start rule__Argument__Group_3__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1554:1: rule__Argument__Group_3__0 : rule__Argument__Group_3__0__Impl rule__Argument__Group_3__1 ;
    public final void rule__Argument__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1558:1: ( rule__Argument__Group_3__0__Impl rule__Argument__Group_3__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1559:2: rule__Argument__Group_3__0__Impl rule__Argument__Group_3__1
            {
            pushFollow(FOLLOW_rule__Argument__Group_3__0__Impl_in_rule__Argument__Group_3__03212);
            rule__Argument__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group_3__1_in_rule__Argument__Group_3__03215);
            rule__Argument__Group_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_3__0


    // $ANTLR start rule__Argument__Group_3__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1566:1: rule__Argument__Group_3__0__Impl : ( 'round' ) ;
    public final void rule__Argument__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1570:1: ( ( 'round' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1571:1: ( 'round' )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1571:1: ( 'round' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1572:1: 'round'
            {
             before(grammarAccess.getArgumentAccess().getRoundKeyword_3_0()); 
            match(input,20,FOLLOW_20_in_rule__Argument__Group_3__0__Impl3243); 
             after(grammarAccess.getArgumentAccess().getRoundKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_3__0__Impl


    // $ANTLR start rule__Argument__Group_3__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1585:1: rule__Argument__Group_3__1 : rule__Argument__Group_3__1__Impl ;
    public final void rule__Argument__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1589:1: ( rule__Argument__Group_3__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1590:2: rule__Argument__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Argument__Group_3__1__Impl_in_rule__Argument__Group_3__13274);
            rule__Argument__Group_3__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_3__1


    // $ANTLR start rule__Argument__Group_3__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1596:1: rule__Argument__Group_3__1__Impl : ( ( rule__Argument__RoundAssignment_3_1 ) ) ;
    public final void rule__Argument__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1600:1: ( ( ( rule__Argument__RoundAssignment_3_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1601:1: ( ( rule__Argument__RoundAssignment_3_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1601:1: ( ( rule__Argument__RoundAssignment_3_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1602:1: ( rule__Argument__RoundAssignment_3_1 )
            {
             before(grammarAccess.getArgumentAccess().getRoundAssignment_3_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1603:1: ( rule__Argument__RoundAssignment_3_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1603:2: rule__Argument__RoundAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Argument__RoundAssignment_3_1_in_rule__Argument__Group_3__1__Impl3301);
            rule__Argument__RoundAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getArgumentAccess().getRoundAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_3__1__Impl


    // $ANTLR start rule__Argument__Group_4__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1617:1: rule__Argument__Group_4__0 : rule__Argument__Group_4__0__Impl rule__Argument__Group_4__1 ;
    public final void rule__Argument__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1621:1: ( rule__Argument__Group_4__0__Impl rule__Argument__Group_4__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1622:2: rule__Argument__Group_4__0__Impl rule__Argument__Group_4__1
            {
            pushFollow(FOLLOW_rule__Argument__Group_4__0__Impl_in_rule__Argument__Group_4__03335);
            rule__Argument__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group_4__1_in_rule__Argument__Group_4__03338);
            rule__Argument__Group_4__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_4__0


    // $ANTLR start rule__Argument__Group_4__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1629:1: rule__Argument__Group_4__0__Impl : ( 'replacing' ) ;
    public final void rule__Argument__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1633:1: ( ( 'replacing' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1634:1: ( 'replacing' )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1634:1: ( 'replacing' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1635:1: 'replacing'
            {
             before(grammarAccess.getArgumentAccess().getReplacingKeyword_4_0()); 
            match(input,21,FOLLOW_21_in_rule__Argument__Group_4__0__Impl3366); 
             after(grammarAccess.getArgumentAccess().getReplacingKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_4__0__Impl


    // $ANTLR start rule__Argument__Group_4__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1648:1: rule__Argument__Group_4__1 : rule__Argument__Group_4__1__Impl ;
    public final void rule__Argument__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1652:1: ( rule__Argument__Group_4__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1653:2: rule__Argument__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Argument__Group_4__1__Impl_in_rule__Argument__Group_4__13397);
            rule__Argument__Group_4__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_4__1


    // $ANTLR start rule__Argument__Group_4__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1659:1: rule__Argument__Group_4__1__Impl : ( ( rule__Argument__OriginAssignment_4_1 ) ) ;
    public final void rule__Argument__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1663:1: ( ( ( rule__Argument__OriginAssignment_4_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1664:1: ( ( rule__Argument__OriginAssignment_4_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1664:1: ( ( rule__Argument__OriginAssignment_4_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1665:1: ( rule__Argument__OriginAssignment_4_1 )
            {
             before(grammarAccess.getArgumentAccess().getOriginAssignment_4_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1666:1: ( rule__Argument__OriginAssignment_4_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1666:2: rule__Argument__OriginAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Argument__OriginAssignment_4_1_in_rule__Argument__Group_4__1__Impl3424);
            rule__Argument__OriginAssignment_4_1();
            _fsp--;


            }

             after(grammarAccess.getArgumentAccess().getOriginAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_4__1__Impl


    // $ANTLR start rule__Argument__Group_5__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1680:1: rule__Argument__Group_5__0 : rule__Argument__Group_5__0__Impl rule__Argument__Group_5__1 ;
    public final void rule__Argument__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1684:1: ( rule__Argument__Group_5__0__Impl rule__Argument__Group_5__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1685:2: rule__Argument__Group_5__0__Impl rule__Argument__Group_5__1
            {
            pushFollow(FOLLOW_rule__Argument__Group_5__0__Impl_in_rule__Argument__Group_5__03458);
            rule__Argument__Group_5__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group_5__1_in_rule__Argument__Group_5__03461);
            rule__Argument__Group_5__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_5__0


    // $ANTLR start rule__Argument__Group_5__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1692:1: rule__Argument__Group_5__0__Impl : ( 'with' ) ;
    public final void rule__Argument__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1696:1: ( ( 'with' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1697:1: ( 'with' )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1697:1: ( 'with' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1698:1: 'with'
            {
             before(grammarAccess.getArgumentAccess().getWithKeyword_5_0()); 
            match(input,22,FOLLOW_22_in_rule__Argument__Group_5__0__Impl3489); 
             after(grammarAccess.getArgumentAccess().getWithKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_5__0__Impl


    // $ANTLR start rule__Argument__Group_5__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1711:1: rule__Argument__Group_5__1 : rule__Argument__Group_5__1__Impl ;
    public final void rule__Argument__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1715:1: ( rule__Argument__Group_5__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1716:2: rule__Argument__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Argument__Group_5__1__Impl_in_rule__Argument__Group_5__13520);
            rule__Argument__Group_5__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_5__1


    // $ANTLR start rule__Argument__Group_5__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1722:1: rule__Argument__Group_5__1__Impl : ( ( rule__Argument__ExprAssignment_5_1 ) ) ;
    public final void rule__Argument__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1726:1: ( ( ( rule__Argument__ExprAssignment_5_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1727:1: ( ( rule__Argument__ExprAssignment_5_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1727:1: ( ( rule__Argument__ExprAssignment_5_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1728:1: ( rule__Argument__ExprAssignment_5_1 )
            {
             before(grammarAccess.getArgumentAccess().getExprAssignment_5_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1729:1: ( rule__Argument__ExprAssignment_5_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1729:2: rule__Argument__ExprAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Argument__ExprAssignment_5_1_in_rule__Argument__Group_5__1__Impl3547);
            rule__Argument__ExprAssignment_5_1();
            _fsp--;


            }

             after(grammarAccess.getArgumentAccess().getExprAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_5__1__Impl


    // $ANTLR start rule__Argument__Group_6__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1743:1: rule__Argument__Group_6__0 : rule__Argument__Group_6__0__Impl rule__Argument__Group_6__1 ;
    public final void rule__Argument__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1747:1: ( rule__Argument__Group_6__0__Impl rule__Argument__Group_6__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1748:2: rule__Argument__Group_6__0__Impl rule__Argument__Group_6__1
            {
            pushFollow(FOLLOW_rule__Argument__Group_6__0__Impl_in_rule__Argument__Group_6__03581);
            rule__Argument__Group_6__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group_6__1_in_rule__Argument__Group_6__03584);
            rule__Argument__Group_6__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_6__0


    // $ANTLR start rule__Argument__Group_6__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1755:1: rule__Argument__Group_6__0__Impl : ( 'foreground' ) ;
    public final void rule__Argument__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1759:1: ( ( 'foreground' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1760:1: ( 'foreground' )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1760:1: ( 'foreground' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1761:1: 'foreground'
            {
             before(grammarAccess.getArgumentAccess().getForegroundKeyword_6_0()); 
            match(input,23,FOLLOW_23_in_rule__Argument__Group_6__0__Impl3612); 
             after(grammarAccess.getArgumentAccess().getForegroundKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_6__0__Impl


    // $ANTLR start rule__Argument__Group_6__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1774:1: rule__Argument__Group_6__1 : rule__Argument__Group_6__1__Impl ;
    public final void rule__Argument__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1778:1: ( rule__Argument__Group_6__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1779:2: rule__Argument__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Argument__Group_6__1__Impl_in_rule__Argument__Group_6__13643);
            rule__Argument__Group_6__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_6__1


    // $ANTLR start rule__Argument__Group_6__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1785:1: rule__Argument__Group_6__1__Impl : ( ( rule__Argument__ForegroundAssignment_6_1 ) ) ;
    public final void rule__Argument__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1789:1: ( ( ( rule__Argument__ForegroundAssignment_6_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1790:1: ( ( rule__Argument__ForegroundAssignment_6_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1790:1: ( ( rule__Argument__ForegroundAssignment_6_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1791:1: ( rule__Argument__ForegroundAssignment_6_1 )
            {
             before(grammarAccess.getArgumentAccess().getForegroundAssignment_6_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1792:1: ( rule__Argument__ForegroundAssignment_6_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1792:2: rule__Argument__ForegroundAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Argument__ForegroundAssignment_6_1_in_rule__Argument__Group_6__1__Impl3670);
            rule__Argument__ForegroundAssignment_6_1();
            _fsp--;


            }

             after(grammarAccess.getArgumentAccess().getForegroundAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_6__1__Impl


    // $ANTLR start rule__Argument__Group_7__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1806:1: rule__Argument__Group_7__0 : rule__Argument__Group_7__0__Impl rule__Argument__Group_7__1 ;
    public final void rule__Argument__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1810:1: ( rule__Argument__Group_7__0__Impl rule__Argument__Group_7__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1811:2: rule__Argument__Group_7__0__Impl rule__Argument__Group_7__1
            {
            pushFollow(FOLLOW_rule__Argument__Group_7__0__Impl_in_rule__Argument__Group_7__03704);
            rule__Argument__Group_7__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group_7__1_in_rule__Argument__Group_7__03707);
            rule__Argument__Group_7__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_7__0


    // $ANTLR start rule__Argument__Group_7__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1818:1: rule__Argument__Group_7__0__Impl : ( 'background' ) ;
    public final void rule__Argument__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1822:1: ( ( 'background' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1823:1: ( 'background' )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1823:1: ( 'background' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1824:1: 'background'
            {
             before(grammarAccess.getArgumentAccess().getBackgroundKeyword_7_0()); 
            match(input,24,FOLLOW_24_in_rule__Argument__Group_7__0__Impl3735); 
             after(grammarAccess.getArgumentAccess().getBackgroundKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_7__0__Impl


    // $ANTLR start rule__Argument__Group_7__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1837:1: rule__Argument__Group_7__1 : rule__Argument__Group_7__1__Impl ;
    public final void rule__Argument__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1841:1: ( rule__Argument__Group_7__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1842:2: rule__Argument__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__Argument__Group_7__1__Impl_in_rule__Argument__Group_7__13766);
            rule__Argument__Group_7__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_7__1


    // $ANTLR start rule__Argument__Group_7__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1848:1: rule__Argument__Group_7__1__Impl : ( ( rule__Argument__BackgroundAssignment_7_1 ) ) ;
    public final void rule__Argument__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1852:1: ( ( ( rule__Argument__BackgroundAssignment_7_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1853:1: ( ( rule__Argument__BackgroundAssignment_7_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1853:1: ( ( rule__Argument__BackgroundAssignment_7_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1854:1: ( rule__Argument__BackgroundAssignment_7_1 )
            {
             before(grammarAccess.getArgumentAccess().getBackgroundAssignment_7_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1855:1: ( rule__Argument__BackgroundAssignment_7_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1855:2: rule__Argument__BackgroundAssignment_7_1
            {
            pushFollow(FOLLOW_rule__Argument__BackgroundAssignment_7_1_in_rule__Argument__Group_7__1__Impl3793);
            rule__Argument__BackgroundAssignment_7_1();
            _fsp--;


            }

             after(grammarAccess.getArgumentAccess().getBackgroundAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_7__1__Impl


    // $ANTLR start rule__Argument__Group_8__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1869:1: rule__Argument__Group_8__0 : rule__Argument__Group_8__0__Impl rule__Argument__Group_8__1 ;
    public final void rule__Argument__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1873:1: ( rule__Argument__Group_8__0__Impl rule__Argument__Group_8__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1874:2: rule__Argument__Group_8__0__Impl rule__Argument__Group_8__1
            {
            pushFollow(FOLLOW_rule__Argument__Group_8__0__Impl_in_rule__Argument__Group_8__03827);
            rule__Argument__Group_8__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group_8__1_in_rule__Argument__Group_8__03830);
            rule__Argument__Group_8__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_8__0


    // $ANTLR start rule__Argument__Group_8__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1881:1: rule__Argument__Group_8__0__Impl : ( 'shape' ) ;
    public final void rule__Argument__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1885:1: ( ( 'shape' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1886:1: ( 'shape' )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1886:1: ( 'shape' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1887:1: 'shape'
            {
             before(grammarAccess.getArgumentAccess().getShapeKeyword_8_0()); 
            match(input,25,FOLLOW_25_in_rule__Argument__Group_8__0__Impl3858); 
             after(grammarAccess.getArgumentAccess().getShapeKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_8__0__Impl


    // $ANTLR start rule__Argument__Group_8__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1900:1: rule__Argument__Group_8__1 : rule__Argument__Group_8__1__Impl ;
    public final void rule__Argument__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1904:1: ( rule__Argument__Group_8__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1905:2: rule__Argument__Group_8__1__Impl
            {
            pushFollow(FOLLOW_rule__Argument__Group_8__1__Impl_in_rule__Argument__Group_8__13889);
            rule__Argument__Group_8__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_8__1


    // $ANTLR start rule__Argument__Group_8__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1911:1: rule__Argument__Group_8__1__Impl : ( ( rule__Argument__ShapeAssignment_8_1 ) ) ;
    public final void rule__Argument__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1915:1: ( ( ( rule__Argument__ShapeAssignment_8_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1916:1: ( ( rule__Argument__ShapeAssignment_8_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1916:1: ( ( rule__Argument__ShapeAssignment_8_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1917:1: ( rule__Argument__ShapeAssignment_8_1 )
            {
             before(grammarAccess.getArgumentAccess().getShapeAssignment_8_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1918:1: ( rule__Argument__ShapeAssignment_8_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1918:2: rule__Argument__ShapeAssignment_8_1
            {
            pushFollow(FOLLOW_rule__Argument__ShapeAssignment_8_1_in_rule__Argument__Group_8__1__Impl3916);
            rule__Argument__ShapeAssignment_8_1();
            _fsp--;


            }

             after(grammarAccess.getArgumentAccess().getShapeAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_8__1__Impl


    // $ANTLR start rule__Argument__Group_9__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1932:1: rule__Argument__Group_9__0 : rule__Argument__Group_9__0__Impl rule__Argument__Group_9__1 ;
    public final void rule__Argument__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1936:1: ( rule__Argument__Group_9__0__Impl rule__Argument__Group_9__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1937:2: rule__Argument__Group_9__0__Impl rule__Argument__Group_9__1
            {
            pushFollow(FOLLOW_rule__Argument__Group_9__0__Impl_in_rule__Argument__Group_9__03950);
            rule__Argument__Group_9__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group_9__1_in_rule__Argument__Group_9__03953);
            rule__Argument__Group_9__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_9__0


    // $ANTLR start rule__Argument__Group_9__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1944:1: rule__Argument__Group_9__0__Impl : ( 'image' ) ;
    public final void rule__Argument__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1948:1: ( ( 'image' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1949:1: ( 'image' )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1949:1: ( 'image' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1950:1: 'image'
            {
             before(grammarAccess.getArgumentAccess().getImageKeyword_9_0()); 
            match(input,26,FOLLOW_26_in_rule__Argument__Group_9__0__Impl3981); 
             after(grammarAccess.getArgumentAccess().getImageKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_9__0__Impl


    // $ANTLR start rule__Argument__Group_9__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1963:1: rule__Argument__Group_9__1 : rule__Argument__Group_9__1__Impl ;
    public final void rule__Argument__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1967:1: ( rule__Argument__Group_9__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1968:2: rule__Argument__Group_9__1__Impl
            {
            pushFollow(FOLLOW_rule__Argument__Group_9__1__Impl_in_rule__Argument__Group_9__14012);
            rule__Argument__Group_9__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_9__1


    // $ANTLR start rule__Argument__Group_9__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1974:1: rule__Argument__Group_9__1__Impl : ( ( rule__Argument__ImageAssignment_9_1 ) ) ;
    public final void rule__Argument__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1978:1: ( ( ( rule__Argument__ImageAssignment_9_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1979:1: ( ( rule__Argument__ImageAssignment_9_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1979:1: ( ( rule__Argument__ImageAssignment_9_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1980:1: ( rule__Argument__ImageAssignment_9_1 )
            {
             before(grammarAccess.getArgumentAccess().getImageAssignment_9_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1981:1: ( rule__Argument__ImageAssignment_9_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1981:2: rule__Argument__ImageAssignment_9_1
            {
            pushFollow(FOLLOW_rule__Argument__ImageAssignment_9_1_in_rule__Argument__Group_9__1__Impl4039);
            rule__Argument__ImageAssignment_9_1();
            _fsp--;


            }

             after(grammarAccess.getArgumentAccess().getImageAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_9__1__Impl


    // $ANTLR start rule__Argument__Group_10__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1995:1: rule__Argument__Group_10__0 : rule__Argument__Group_10__0__Impl rule__Argument__Group_10__1 ;
    public final void rule__Argument__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1999:1: ( rule__Argument__Group_10__0__Impl rule__Argument__Group_10__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2000:2: rule__Argument__Group_10__0__Impl rule__Argument__Group_10__1
            {
            pushFollow(FOLLOW_rule__Argument__Group_10__0__Impl_in_rule__Argument__Group_10__04073);
            rule__Argument__Group_10__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group_10__1_in_rule__Argument__Group_10__04076);
            rule__Argument__Group_10__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_10__0


    // $ANTLR start rule__Argument__Group_10__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2007:1: rule__Argument__Group_10__0__Impl : ( '{' ) ;
    public final void rule__Argument__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2011:1: ( ( '{' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2012:1: ( '{' )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2012:1: ( '{' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2013:1: '{'
            {
             before(grammarAccess.getArgumentAccess().getLeftCurlyBracketKeyword_10_0()); 
            match(input,27,FOLLOW_27_in_rule__Argument__Group_10__0__Impl4104); 
             after(grammarAccess.getArgumentAccess().getLeftCurlyBracketKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_10__0__Impl


    // $ANTLR start rule__Argument__Group_10__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2026:1: rule__Argument__Group_10__1 : rule__Argument__Group_10__1__Impl rule__Argument__Group_10__2 ;
    public final void rule__Argument__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2030:1: ( rule__Argument__Group_10__1__Impl rule__Argument__Group_10__2 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2031:2: rule__Argument__Group_10__1__Impl rule__Argument__Group_10__2
            {
            pushFollow(FOLLOW_rule__Argument__Group_10__1__Impl_in_rule__Argument__Group_10__14135);
            rule__Argument__Group_10__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group_10__2_in_rule__Argument__Group_10__14138);
            rule__Argument__Group_10__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_10__1


    // $ANTLR start rule__Argument__Group_10__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2038:1: rule__Argument__Group_10__1__Impl : ( ( rule__Argument__Group_10_1__0 )? ) ;
    public final void rule__Argument__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2042:1: ( ( ( rule__Argument__Group_10_1__0 )? ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2043:1: ( ( rule__Argument__Group_10_1__0 )? )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2043:1: ( ( rule__Argument__Group_10_1__0 )? )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2044:1: ( rule__Argument__Group_10_1__0 )?
            {
             before(grammarAccess.getArgumentAccess().getGroup_10_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2045:1: ( rule__Argument__Group_10_1__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==29) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2045:2: rule__Argument__Group_10_1__0
                    {
                    pushFollow(FOLLOW_rule__Argument__Group_10_1__0_in_rule__Argument__Group_10__1__Impl4165);
                    rule__Argument__Group_10_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArgumentAccess().getGroup_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_10__1__Impl


    // $ANTLR start rule__Argument__Group_10__2
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2055:1: rule__Argument__Group_10__2 : rule__Argument__Group_10__2__Impl rule__Argument__Group_10__3 ;
    public final void rule__Argument__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2059:1: ( rule__Argument__Group_10__2__Impl rule__Argument__Group_10__3 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2060:2: rule__Argument__Group_10__2__Impl rule__Argument__Group_10__3
            {
            pushFollow(FOLLOW_rule__Argument__Group_10__2__Impl_in_rule__Argument__Group_10__24196);
            rule__Argument__Group_10__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group_10__3_in_rule__Argument__Group_10__24199);
            rule__Argument__Group_10__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_10__2


    // $ANTLR start rule__Argument__Group_10__2__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2067:1: rule__Argument__Group_10__2__Impl : ( ( rule__Argument__Group_10_2__0 )? ) ;
    public final void rule__Argument__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2071:1: ( ( ( rule__Argument__Group_10_2__0 )? ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2072:1: ( ( rule__Argument__Group_10_2__0 )? )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2072:1: ( ( rule__Argument__Group_10_2__0 )? )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2073:1: ( rule__Argument__Group_10_2__0 )?
            {
             before(grammarAccess.getArgumentAccess().getGroup_10_2()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2074:1: ( rule__Argument__Group_10_2__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==31) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2074:2: rule__Argument__Group_10_2__0
                    {
                    pushFollow(FOLLOW_rule__Argument__Group_10_2__0_in_rule__Argument__Group_10__2__Impl4226);
                    rule__Argument__Group_10_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArgumentAccess().getGroup_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_10__2__Impl


    // $ANTLR start rule__Argument__Group_10__3
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2084:1: rule__Argument__Group_10__3 : rule__Argument__Group_10__3__Impl ;
    public final void rule__Argument__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2088:1: ( rule__Argument__Group_10__3__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2089:2: rule__Argument__Group_10__3__Impl
            {
            pushFollow(FOLLOW_rule__Argument__Group_10__3__Impl_in_rule__Argument__Group_10__34257);
            rule__Argument__Group_10__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_10__3


    // $ANTLR start rule__Argument__Group_10__3__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2095:1: rule__Argument__Group_10__3__Impl : ( '}' ) ;
    public final void rule__Argument__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2099:1: ( ( '}' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2100:1: ( '}' )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2100:1: ( '}' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2101:1: '}'
            {
             before(grammarAccess.getArgumentAccess().getRightCurlyBracketKeyword_10_3()); 
            match(input,28,FOLLOW_28_in_rule__Argument__Group_10__3__Impl4285); 
             after(grammarAccess.getArgumentAccess().getRightCurlyBracketKeyword_10_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_10__3__Impl


    // $ANTLR start rule__Argument__Group_10_1__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2122:1: rule__Argument__Group_10_1__0 : rule__Argument__Group_10_1__0__Impl rule__Argument__Group_10_1__1 ;
    public final void rule__Argument__Group_10_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2126:1: ( rule__Argument__Group_10_1__0__Impl rule__Argument__Group_10_1__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2127:2: rule__Argument__Group_10_1__0__Impl rule__Argument__Group_10_1__1
            {
            pushFollow(FOLLOW_rule__Argument__Group_10_1__0__Impl_in_rule__Argument__Group_10_1__04324);
            rule__Argument__Group_10_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group_10_1__1_in_rule__Argument__Group_10_1__04327);
            rule__Argument__Group_10_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_10_1__0


    // $ANTLR start rule__Argument__Group_10_1__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2134:1: rule__Argument__Group_10_1__0__Impl : ( 'supported by' ) ;
    public final void rule__Argument__Group_10_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2138:1: ( ( 'supported by' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2139:1: ( 'supported by' )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2139:1: ( 'supported by' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2140:1: 'supported by'
            {
             before(grammarAccess.getArgumentAccess().getSupportedByKeyword_10_1_0()); 
            match(input,29,FOLLOW_29_in_rule__Argument__Group_10_1__0__Impl4355); 
             after(grammarAccess.getArgumentAccess().getSupportedByKeyword_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_10_1__0__Impl


    // $ANTLR start rule__Argument__Group_10_1__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2153:1: rule__Argument__Group_10_1__1 : rule__Argument__Group_10_1__1__Impl ;
    public final void rule__Argument__Group_10_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2157:1: ( rule__Argument__Group_10_1__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2158:2: rule__Argument__Group_10_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Argument__Group_10_1__1__Impl_in_rule__Argument__Group_10_1__14386);
            rule__Argument__Group_10_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_10_1__1


    // $ANTLR start rule__Argument__Group_10_1__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2164:1: rule__Argument__Group_10_1__1__Impl : ( ( rule__Argument__Group_10_1_1__0 )* ) ;
    public final void rule__Argument__Group_10_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2168:1: ( ( ( rule__Argument__Group_10_1_1__0 )* ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2169:1: ( ( rule__Argument__Group_10_1_1__0 )* )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2169:1: ( ( rule__Argument__Group_10_1_1__0 )* )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2170:1: ( rule__Argument__Group_10_1_1__0 )*
            {
             before(grammarAccess.getArgumentAccess().getGroup_10_1_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2171:1: ( rule__Argument__Group_10_1_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID||LA23_0==30) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2171:2: rule__Argument__Group_10_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Argument__Group_10_1_1__0_in_rule__Argument__Group_10_1__1__Impl4413);
            	    rule__Argument__Group_10_1_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getArgumentAccess().getGroup_10_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_10_1__1__Impl


    // $ANTLR start rule__Argument__Group_10_1_1__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2185:1: rule__Argument__Group_10_1_1__0 : rule__Argument__Group_10_1_1__0__Impl rule__Argument__Group_10_1_1__1 ;
    public final void rule__Argument__Group_10_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2189:1: ( rule__Argument__Group_10_1_1__0__Impl rule__Argument__Group_10_1_1__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2190:2: rule__Argument__Group_10_1_1__0__Impl rule__Argument__Group_10_1_1__1
            {
            pushFollow(FOLLOW_rule__Argument__Group_10_1_1__0__Impl_in_rule__Argument__Group_10_1_1__04448);
            rule__Argument__Group_10_1_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group_10_1_1__1_in_rule__Argument__Group_10_1_1__04451);
            rule__Argument__Group_10_1_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_10_1_1__0


    // $ANTLR start rule__Argument__Group_10_1_1__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2197:1: rule__Argument__Group_10_1_1__0__Impl : ( ( ',' )? ) ;
    public final void rule__Argument__Group_10_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2201:1: ( ( ( ',' )? ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2202:1: ( ( ',' )? )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2202:1: ( ( ',' )? )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2203:1: ( ',' )?
            {
             before(grammarAccess.getArgumentAccess().getCommaKeyword_10_1_1_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2204:1: ( ',' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==30) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2205:2: ','
                    {
                    match(input,30,FOLLOW_30_in_rule__Argument__Group_10_1_1__0__Impl4480); 

                    }
                    break;

            }

             after(grammarAccess.getArgumentAccess().getCommaKeyword_10_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_10_1_1__0__Impl


    // $ANTLR start rule__Argument__Group_10_1_1__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2216:1: rule__Argument__Group_10_1_1__1 : rule__Argument__Group_10_1_1__1__Impl ;
    public final void rule__Argument__Group_10_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2220:1: ( rule__Argument__Group_10_1_1__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2221:2: rule__Argument__Group_10_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Argument__Group_10_1_1__1__Impl_in_rule__Argument__Group_10_1_1__14513);
            rule__Argument__Group_10_1_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_10_1_1__1


    // $ANTLR start rule__Argument__Group_10_1_1__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2227:1: rule__Argument__Group_10_1_1__1__Impl : ( ( rule__Argument__GroundsAssignment_10_1_1_1 ) ) ;
    public final void rule__Argument__Group_10_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2231:1: ( ( ( rule__Argument__GroundsAssignment_10_1_1_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2232:1: ( ( rule__Argument__GroundsAssignment_10_1_1_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2232:1: ( ( rule__Argument__GroundsAssignment_10_1_1_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2233:1: ( rule__Argument__GroundsAssignment_10_1_1_1 )
            {
             before(grammarAccess.getArgumentAccess().getGroundsAssignment_10_1_1_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2234:1: ( rule__Argument__GroundsAssignment_10_1_1_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2234:2: rule__Argument__GroundsAssignment_10_1_1_1
            {
            pushFollow(FOLLOW_rule__Argument__GroundsAssignment_10_1_1_1_in_rule__Argument__Group_10_1_1__1__Impl4540);
            rule__Argument__GroundsAssignment_10_1_1_1();
            _fsp--;


            }

             after(grammarAccess.getArgumentAccess().getGroundsAssignment_10_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_10_1_1__1__Impl


    // $ANTLR start rule__Argument__Group_10_2__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2248:1: rule__Argument__Group_10_2__0 : rule__Argument__Group_10_2__0__Impl rule__Argument__Group_10_2__1 ;
    public final void rule__Argument__Group_10_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2252:1: ( rule__Argument__Group_10_2__0__Impl rule__Argument__Group_10_2__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2253:2: rule__Argument__Group_10_2__0__Impl rule__Argument__Group_10_2__1
            {
            pushFollow(FOLLOW_rule__Argument__Group_10_2__0__Impl_in_rule__Argument__Group_10_2__04574);
            rule__Argument__Group_10_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group_10_2__1_in_rule__Argument__Group_10_2__04577);
            rule__Argument__Group_10_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_10_2__0


    // $ANTLR start rule__Argument__Group_10_2__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2260:1: rule__Argument__Group_10_2__0__Impl : ( 'warranted by' ) ;
    public final void rule__Argument__Group_10_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2264:1: ( ( 'warranted by' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2265:1: ( 'warranted by' )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2265:1: ( 'warranted by' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2266:1: 'warranted by'
            {
             before(grammarAccess.getArgumentAccess().getWarrantedByKeyword_10_2_0()); 
            match(input,31,FOLLOW_31_in_rule__Argument__Group_10_2__0__Impl4605); 
             after(grammarAccess.getArgumentAccess().getWarrantedByKeyword_10_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_10_2__0__Impl


    // $ANTLR start rule__Argument__Group_10_2__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2279:1: rule__Argument__Group_10_2__1 : rule__Argument__Group_10_2__1__Impl ;
    public final void rule__Argument__Group_10_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2283:1: ( rule__Argument__Group_10_2__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2284:2: rule__Argument__Group_10_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Argument__Group_10_2__1__Impl_in_rule__Argument__Group_10_2__14636);
            rule__Argument__Group_10_2__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_10_2__1


    // $ANTLR start rule__Argument__Group_10_2__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2290:1: rule__Argument__Group_10_2__1__Impl : ( ( rule__Argument__Group_10_2_1__0 )* ) ;
    public final void rule__Argument__Group_10_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2294:1: ( ( ( rule__Argument__Group_10_2_1__0 )* ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2295:1: ( ( rule__Argument__Group_10_2_1__0 )* )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2295:1: ( ( rule__Argument__Group_10_2_1__0 )* )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2296:1: ( rule__Argument__Group_10_2_1__0 )*
            {
             before(grammarAccess.getArgumentAccess().getGroup_10_2_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2297:1: ( rule__Argument__Group_10_2_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID||LA25_0==30) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2297:2: rule__Argument__Group_10_2_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Argument__Group_10_2_1__0_in_rule__Argument__Group_10_2__1__Impl4663);
            	    rule__Argument__Group_10_2_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getArgumentAccess().getGroup_10_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_10_2__1__Impl


    // $ANTLR start rule__Argument__Group_10_2_1__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2311:1: rule__Argument__Group_10_2_1__0 : rule__Argument__Group_10_2_1__0__Impl rule__Argument__Group_10_2_1__1 ;
    public final void rule__Argument__Group_10_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2315:1: ( rule__Argument__Group_10_2_1__0__Impl rule__Argument__Group_10_2_1__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2316:2: rule__Argument__Group_10_2_1__0__Impl rule__Argument__Group_10_2_1__1
            {
            pushFollow(FOLLOW_rule__Argument__Group_10_2_1__0__Impl_in_rule__Argument__Group_10_2_1__04698);
            rule__Argument__Group_10_2_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group_10_2_1__1_in_rule__Argument__Group_10_2_1__04701);
            rule__Argument__Group_10_2_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_10_2_1__0


    // $ANTLR start rule__Argument__Group_10_2_1__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2323:1: rule__Argument__Group_10_2_1__0__Impl : ( ( ',' )? ) ;
    public final void rule__Argument__Group_10_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2327:1: ( ( ( ',' )? ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2328:1: ( ( ',' )? )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2328:1: ( ( ',' )? )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2329:1: ( ',' )?
            {
             before(grammarAccess.getArgumentAccess().getCommaKeyword_10_2_1_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2330:1: ( ',' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==30) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2331:2: ','
                    {
                    match(input,30,FOLLOW_30_in_rule__Argument__Group_10_2_1__0__Impl4730); 

                    }
                    break;

            }

             after(grammarAccess.getArgumentAccess().getCommaKeyword_10_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_10_2_1__0__Impl


    // $ANTLR start rule__Argument__Group_10_2_1__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2342:1: rule__Argument__Group_10_2_1__1 : rule__Argument__Group_10_2_1__1__Impl ;
    public final void rule__Argument__Group_10_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2346:1: ( rule__Argument__Group_10_2_1__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2347:2: rule__Argument__Group_10_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Argument__Group_10_2_1__1__Impl_in_rule__Argument__Group_10_2_1__14763);
            rule__Argument__Group_10_2_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_10_2_1__1


    // $ANTLR start rule__Argument__Group_10_2_1__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2353:1: rule__Argument__Group_10_2_1__1__Impl : ( ( rule__Argument__WarrantsAssignment_10_2_1_1 ) ) ;
    public final void rule__Argument__Group_10_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2357:1: ( ( ( rule__Argument__WarrantsAssignment_10_2_1_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2358:1: ( ( rule__Argument__WarrantsAssignment_10_2_1_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2358:1: ( ( rule__Argument__WarrantsAssignment_10_2_1_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2359:1: ( rule__Argument__WarrantsAssignment_10_2_1_1 )
            {
             before(grammarAccess.getArgumentAccess().getWarrantsAssignment_10_2_1_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2360:1: ( rule__Argument__WarrantsAssignment_10_2_1_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2360:2: rule__Argument__WarrantsAssignment_10_2_1_1
            {
            pushFollow(FOLLOW_rule__Argument__WarrantsAssignment_10_2_1_1_in_rule__Argument__Group_10_2_1__1__Impl4790);
            rule__Argument__WarrantsAssignment_10_2_1_1();
            _fsp--;


            }

             after(grammarAccess.getArgumentAccess().getWarrantsAssignment_10_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_10_2_1__1__Impl


    // $ANTLR start rule__AssignmentOp__Group__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2374:1: rule__AssignmentOp__Group__0 : rule__AssignmentOp__Group__0__Impl rule__AssignmentOp__Group__1 ;
    public final void rule__AssignmentOp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2378:1: ( rule__AssignmentOp__Group__0__Impl rule__AssignmentOp__Group__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2379:2: rule__AssignmentOp__Group__0__Impl rule__AssignmentOp__Group__1
            {
            pushFollow(FOLLOW_rule__AssignmentOp__Group__0__Impl_in_rule__AssignmentOp__Group__04824);
            rule__AssignmentOp__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AssignmentOp__Group__1_in_rule__AssignmentOp__Group__04827);
            rule__AssignmentOp__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AssignmentOp__Group__0


    // $ANTLR start rule__AssignmentOp__Group__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2386:1: rule__AssignmentOp__Group__0__Impl : ( ruleOrExp ) ;
    public final void rule__AssignmentOp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2390:1: ( ( ruleOrExp ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2391:1: ( ruleOrExp )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2391:1: ( ruleOrExp )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2392:1: ruleOrExp
            {
             before(grammarAccess.getAssignmentOpAccess().getOrExpParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleOrExp_in_rule__AssignmentOp__Group__0__Impl4854);
            ruleOrExp();
            _fsp--;

             after(grammarAccess.getAssignmentOpAccess().getOrExpParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AssignmentOp__Group__0__Impl


    // $ANTLR start rule__AssignmentOp__Group__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2403:1: rule__AssignmentOp__Group__1 : rule__AssignmentOp__Group__1__Impl ;
    public final void rule__AssignmentOp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2407:1: ( rule__AssignmentOp__Group__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2408:2: rule__AssignmentOp__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AssignmentOp__Group__1__Impl_in_rule__AssignmentOp__Group__14883);
            rule__AssignmentOp__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AssignmentOp__Group__1


    // $ANTLR start rule__AssignmentOp__Group__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2414:1: rule__AssignmentOp__Group__1__Impl : ( ( rule__AssignmentOp__Group_1__0 )? ) ;
    public final void rule__AssignmentOp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2418:1: ( ( ( rule__AssignmentOp__Group_1__0 )? ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2419:1: ( ( rule__AssignmentOp__Group_1__0 )? )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2419:1: ( ( rule__AssignmentOp__Group_1__0 )? )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2420:1: ( rule__AssignmentOp__Group_1__0 )?
            {
             before(grammarAccess.getAssignmentOpAccess().getGroup_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2421:1: ( rule__AssignmentOp__Group_1__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=35 && LA27_0<=36)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2421:2: rule__AssignmentOp__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__AssignmentOp__Group_1__0_in_rule__AssignmentOp__Group__1__Impl4910);
                    rule__AssignmentOp__Group_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssignmentOpAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AssignmentOp__Group__1__Impl


    // $ANTLR start rule__AssignmentOp__Group_1__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2435:1: rule__AssignmentOp__Group_1__0 : rule__AssignmentOp__Group_1__0__Impl rule__AssignmentOp__Group_1__1 ;
    public final void rule__AssignmentOp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2439:1: ( rule__AssignmentOp__Group_1__0__Impl rule__AssignmentOp__Group_1__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2440:2: rule__AssignmentOp__Group_1__0__Impl rule__AssignmentOp__Group_1__1
            {
            pushFollow(FOLLOW_rule__AssignmentOp__Group_1__0__Impl_in_rule__AssignmentOp__Group_1__04945);
            rule__AssignmentOp__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AssignmentOp__Group_1__1_in_rule__AssignmentOp__Group_1__04948);
            rule__AssignmentOp__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AssignmentOp__Group_1__0


    // $ANTLR start rule__AssignmentOp__Group_1__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2447:1: rule__AssignmentOp__Group_1__0__Impl : ( ( rule__AssignmentOp__Alternatives_1_0 ) ) ;
    public final void rule__AssignmentOp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2451:1: ( ( ( rule__AssignmentOp__Alternatives_1_0 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2452:1: ( ( rule__AssignmentOp__Alternatives_1_0 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2452:1: ( ( rule__AssignmentOp__Alternatives_1_0 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2453:1: ( rule__AssignmentOp__Alternatives_1_0 )
            {
             before(grammarAccess.getAssignmentOpAccess().getAlternatives_1_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2454:1: ( rule__AssignmentOp__Alternatives_1_0 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2454:2: rule__AssignmentOp__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__AssignmentOp__Alternatives_1_0_in_rule__AssignmentOp__Group_1__0__Impl4975);
            rule__AssignmentOp__Alternatives_1_0();
            _fsp--;


            }

             after(grammarAccess.getAssignmentOpAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AssignmentOp__Group_1__0__Impl


    // $ANTLR start rule__AssignmentOp__Group_1__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2464:1: rule__AssignmentOp__Group_1__1 : rule__AssignmentOp__Group_1__1__Impl ;
    public final void rule__AssignmentOp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2468:1: ( rule__AssignmentOp__Group_1__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2469:2: rule__AssignmentOp__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AssignmentOp__Group_1__1__Impl_in_rule__AssignmentOp__Group_1__15005);
            rule__AssignmentOp__Group_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AssignmentOp__Group_1__1


    // $ANTLR start rule__AssignmentOp__Group_1__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2475:1: rule__AssignmentOp__Group_1__1__Impl : ( ( rule__AssignmentOp__RightAssignment_1_1 ) ) ;
    public final void rule__AssignmentOp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2479:1: ( ( ( rule__AssignmentOp__RightAssignment_1_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2480:1: ( ( rule__AssignmentOp__RightAssignment_1_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2480:1: ( ( rule__AssignmentOp__RightAssignment_1_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2481:1: ( rule__AssignmentOp__RightAssignment_1_1 )
            {
             before(grammarAccess.getAssignmentOpAccess().getRightAssignment_1_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2482:1: ( rule__AssignmentOp__RightAssignment_1_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2482:2: rule__AssignmentOp__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__AssignmentOp__RightAssignment_1_1_in_rule__AssignmentOp__Group_1__1__Impl5032);
            rule__AssignmentOp__RightAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getAssignmentOpAccess().getRightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AssignmentOp__Group_1__1__Impl


    // $ANTLR start rule__AssignmentOp__Group_1_0_0__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2496:1: rule__AssignmentOp__Group_1_0_0__0 : rule__AssignmentOp__Group_1_0_0__0__Impl rule__AssignmentOp__Group_1_0_0__1 ;
    public final void rule__AssignmentOp__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2500:1: ( rule__AssignmentOp__Group_1_0_0__0__Impl rule__AssignmentOp__Group_1_0_0__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2501:2: rule__AssignmentOp__Group_1_0_0__0__Impl rule__AssignmentOp__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__AssignmentOp__Group_1_0_0__0__Impl_in_rule__AssignmentOp__Group_1_0_0__05066);
            rule__AssignmentOp__Group_1_0_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AssignmentOp__Group_1_0_0__1_in_rule__AssignmentOp__Group_1_0_0__05069);
            rule__AssignmentOp__Group_1_0_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AssignmentOp__Group_1_0_0__0


    // $ANTLR start rule__AssignmentOp__Group_1_0_0__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2508:1: rule__AssignmentOp__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__AssignmentOp__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2512:1: ( ( () ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2513:1: ( () )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2513:1: ( () )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2514:1: ()
            {
             before(grammarAccess.getAssignmentOpAccess().getAssignPlusLeftAction_1_0_0_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2515:1: ()
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2517:1: 
            {
            }

             after(grammarAccess.getAssignmentOpAccess().getAssignPlusLeftAction_1_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AssignmentOp__Group_1_0_0__0__Impl


    // $ANTLR start rule__AssignmentOp__Group_1_0_0__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2527:1: rule__AssignmentOp__Group_1_0_0__1 : rule__AssignmentOp__Group_1_0_0__1__Impl ;
    public final void rule__AssignmentOp__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2531:1: ( rule__AssignmentOp__Group_1_0_0__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2532:2: rule__AssignmentOp__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__AssignmentOp__Group_1_0_0__1__Impl_in_rule__AssignmentOp__Group_1_0_0__15127);
            rule__AssignmentOp__Group_1_0_0__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AssignmentOp__Group_1_0_0__1


    // $ANTLR start rule__AssignmentOp__Group_1_0_0__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2538:1: rule__AssignmentOp__Group_1_0_0__1__Impl : ( ( rule__AssignmentOp__AopAssignment_1_0_0_1 ) ) ;
    public final void rule__AssignmentOp__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2542:1: ( ( ( rule__AssignmentOp__AopAssignment_1_0_0_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2543:1: ( ( rule__AssignmentOp__AopAssignment_1_0_0_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2543:1: ( ( rule__AssignmentOp__AopAssignment_1_0_0_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2544:1: ( rule__AssignmentOp__AopAssignment_1_0_0_1 )
            {
             before(grammarAccess.getAssignmentOpAccess().getAopAssignment_1_0_0_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2545:1: ( rule__AssignmentOp__AopAssignment_1_0_0_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2545:2: rule__AssignmentOp__AopAssignment_1_0_0_1
            {
            pushFollow(FOLLOW_rule__AssignmentOp__AopAssignment_1_0_0_1_in_rule__AssignmentOp__Group_1_0_0__1__Impl5154);
            rule__AssignmentOp__AopAssignment_1_0_0_1();
            _fsp--;


            }

             after(grammarAccess.getAssignmentOpAccess().getAopAssignment_1_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AssignmentOp__Group_1_0_0__1__Impl


    // $ANTLR start rule__AssignmentOp__Group_1_0_1__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2559:1: rule__AssignmentOp__Group_1_0_1__0 : rule__AssignmentOp__Group_1_0_1__0__Impl rule__AssignmentOp__Group_1_0_1__1 ;
    public final void rule__AssignmentOp__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2563:1: ( rule__AssignmentOp__Group_1_0_1__0__Impl rule__AssignmentOp__Group_1_0_1__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2564:2: rule__AssignmentOp__Group_1_0_1__0__Impl rule__AssignmentOp__Group_1_0_1__1
            {
            pushFollow(FOLLOW_rule__AssignmentOp__Group_1_0_1__0__Impl_in_rule__AssignmentOp__Group_1_0_1__05188);
            rule__AssignmentOp__Group_1_0_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AssignmentOp__Group_1_0_1__1_in_rule__AssignmentOp__Group_1_0_1__05191);
            rule__AssignmentOp__Group_1_0_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AssignmentOp__Group_1_0_1__0


    // $ANTLR start rule__AssignmentOp__Group_1_0_1__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2571:1: rule__AssignmentOp__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__AssignmentOp__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2575:1: ( ( () ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2576:1: ( () )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2576:1: ( () )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2577:1: ()
            {
             before(grammarAccess.getAssignmentOpAccess().getAssignMinLeftAction_1_0_1_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2578:1: ()
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2580:1: 
            {
            }

             after(grammarAccess.getAssignmentOpAccess().getAssignMinLeftAction_1_0_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AssignmentOp__Group_1_0_1__0__Impl


    // $ANTLR start rule__AssignmentOp__Group_1_0_1__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2590:1: rule__AssignmentOp__Group_1_0_1__1 : rule__AssignmentOp__Group_1_0_1__1__Impl ;
    public final void rule__AssignmentOp__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2594:1: ( rule__AssignmentOp__Group_1_0_1__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2595:2: rule__AssignmentOp__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AssignmentOp__Group_1_0_1__1__Impl_in_rule__AssignmentOp__Group_1_0_1__15249);
            rule__AssignmentOp__Group_1_0_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AssignmentOp__Group_1_0_1__1


    // $ANTLR start rule__AssignmentOp__Group_1_0_1__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2601:1: rule__AssignmentOp__Group_1_0_1__1__Impl : ( ( rule__AssignmentOp__AopAssignment_1_0_1_1 ) ) ;
    public final void rule__AssignmentOp__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2605:1: ( ( ( rule__AssignmentOp__AopAssignment_1_0_1_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2606:1: ( ( rule__AssignmentOp__AopAssignment_1_0_1_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2606:1: ( ( rule__AssignmentOp__AopAssignment_1_0_1_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2607:1: ( rule__AssignmentOp__AopAssignment_1_0_1_1 )
            {
             before(grammarAccess.getAssignmentOpAccess().getAopAssignment_1_0_1_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2608:1: ( rule__AssignmentOp__AopAssignment_1_0_1_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2608:2: rule__AssignmentOp__AopAssignment_1_0_1_1
            {
            pushFollow(FOLLOW_rule__AssignmentOp__AopAssignment_1_0_1_1_in_rule__AssignmentOp__Group_1_0_1__1__Impl5276);
            rule__AssignmentOp__AopAssignment_1_0_1_1();
            _fsp--;


            }

             after(grammarAccess.getAssignmentOpAccess().getAopAssignment_1_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AssignmentOp__Group_1_0_1__1__Impl


    // $ANTLR start rule__OrExp__Group__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2622:1: rule__OrExp__Group__0 : rule__OrExp__Group__0__Impl rule__OrExp__Group__1 ;
    public final void rule__OrExp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2626:1: ( rule__OrExp__Group__0__Impl rule__OrExp__Group__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2627:2: rule__OrExp__Group__0__Impl rule__OrExp__Group__1
            {
            pushFollow(FOLLOW_rule__OrExp__Group__0__Impl_in_rule__OrExp__Group__05310);
            rule__OrExp__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__OrExp__Group__1_in_rule__OrExp__Group__05313);
            rule__OrExp__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OrExp__Group__0


    // $ANTLR start rule__OrExp__Group__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2634:1: rule__OrExp__Group__0__Impl : ( ruleAndExp ) ;
    public final void rule__OrExp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2638:1: ( ( ruleAndExp ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2639:1: ( ruleAndExp )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2639:1: ( ruleAndExp )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2640:1: ruleAndExp
            {
             before(grammarAccess.getOrExpAccess().getAndExpParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAndExp_in_rule__OrExp__Group__0__Impl5340);
            ruleAndExp();
            _fsp--;

             after(grammarAccess.getOrExpAccess().getAndExpParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OrExp__Group__0__Impl


    // $ANTLR start rule__OrExp__Group__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2651:1: rule__OrExp__Group__1 : rule__OrExp__Group__1__Impl ;
    public final void rule__OrExp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2655:1: ( rule__OrExp__Group__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2656:2: rule__OrExp__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__OrExp__Group__1__Impl_in_rule__OrExp__Group__15369);
            rule__OrExp__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OrExp__Group__1


    // $ANTLR start rule__OrExp__Group__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2662:1: rule__OrExp__Group__1__Impl : ( ( rule__OrExp__Group_1__0 )* ) ;
    public final void rule__OrExp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2666:1: ( ( ( rule__OrExp__Group_1__0 )* ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2667:1: ( ( rule__OrExp__Group_1__0 )* )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2667:1: ( ( rule__OrExp__Group_1__0 )* )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2668:1: ( rule__OrExp__Group_1__0 )*
            {
             before(grammarAccess.getOrExpAccess().getGroup_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2669:1: ( rule__OrExp__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==37) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2669:2: rule__OrExp__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__OrExp__Group_1__0_in_rule__OrExp__Group__1__Impl5396);
            	    rule__OrExp__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getOrExpAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OrExp__Group__1__Impl


    // $ANTLR start rule__OrExp__Group_1__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2683:1: rule__OrExp__Group_1__0 : rule__OrExp__Group_1__0__Impl rule__OrExp__Group_1__1 ;
    public final void rule__OrExp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2687:1: ( rule__OrExp__Group_1__0__Impl rule__OrExp__Group_1__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2688:2: rule__OrExp__Group_1__0__Impl rule__OrExp__Group_1__1
            {
            pushFollow(FOLLOW_rule__OrExp__Group_1__0__Impl_in_rule__OrExp__Group_1__05431);
            rule__OrExp__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__OrExp__Group_1__1_in_rule__OrExp__Group_1__05434);
            rule__OrExp__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OrExp__Group_1__0


    // $ANTLR start rule__OrExp__Group_1__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2695:1: rule__OrExp__Group_1__0__Impl : ( () ) ;
    public final void rule__OrExp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2699:1: ( ( () ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2700:1: ( () )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2700:1: ( () )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2701:1: ()
            {
             before(grammarAccess.getOrExpAccess().getOrLeftAction_1_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2702:1: ()
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2704:1: 
            {
            }

             after(grammarAccess.getOrExpAccess().getOrLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OrExp__Group_1__0__Impl


    // $ANTLR start rule__OrExp__Group_1__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2714:1: rule__OrExp__Group_1__1 : rule__OrExp__Group_1__1__Impl rule__OrExp__Group_1__2 ;
    public final void rule__OrExp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2718:1: ( rule__OrExp__Group_1__1__Impl rule__OrExp__Group_1__2 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2719:2: rule__OrExp__Group_1__1__Impl rule__OrExp__Group_1__2
            {
            pushFollow(FOLLOW_rule__OrExp__Group_1__1__Impl_in_rule__OrExp__Group_1__15492);
            rule__OrExp__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__OrExp__Group_1__2_in_rule__OrExp__Group_1__15495);
            rule__OrExp__Group_1__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OrExp__Group_1__1


    // $ANTLR start rule__OrExp__Group_1__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2726:1: rule__OrExp__Group_1__1__Impl : ( ( rule__OrExp__Or_opAssignment_1_1 ) ) ;
    public final void rule__OrExp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2730:1: ( ( ( rule__OrExp__Or_opAssignment_1_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2731:1: ( ( rule__OrExp__Or_opAssignment_1_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2731:1: ( ( rule__OrExp__Or_opAssignment_1_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2732:1: ( rule__OrExp__Or_opAssignment_1_1 )
            {
             before(grammarAccess.getOrExpAccess().getOr_opAssignment_1_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2733:1: ( rule__OrExp__Or_opAssignment_1_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2733:2: rule__OrExp__Or_opAssignment_1_1
            {
            pushFollow(FOLLOW_rule__OrExp__Or_opAssignment_1_1_in_rule__OrExp__Group_1__1__Impl5522);
            rule__OrExp__Or_opAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getOrExpAccess().getOr_opAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OrExp__Group_1__1__Impl


    // $ANTLR start rule__OrExp__Group_1__2
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2743:1: rule__OrExp__Group_1__2 : rule__OrExp__Group_1__2__Impl ;
    public final void rule__OrExp__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2747:1: ( rule__OrExp__Group_1__2__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2748:2: rule__OrExp__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__OrExp__Group_1__2__Impl_in_rule__OrExp__Group_1__25552);
            rule__OrExp__Group_1__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OrExp__Group_1__2


    // $ANTLR start rule__OrExp__Group_1__2__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2754:1: rule__OrExp__Group_1__2__Impl : ( ( rule__OrExp__RightAssignment_1_2 ) ) ;
    public final void rule__OrExp__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2758:1: ( ( ( rule__OrExp__RightAssignment_1_2 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2759:1: ( ( rule__OrExp__RightAssignment_1_2 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2759:1: ( ( rule__OrExp__RightAssignment_1_2 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2760:1: ( rule__OrExp__RightAssignment_1_2 )
            {
             before(grammarAccess.getOrExpAccess().getRightAssignment_1_2()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2761:1: ( rule__OrExp__RightAssignment_1_2 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2761:2: rule__OrExp__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__OrExp__RightAssignment_1_2_in_rule__OrExp__Group_1__2__Impl5579);
            rule__OrExp__RightAssignment_1_2();
            _fsp--;


            }

             after(grammarAccess.getOrExpAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OrExp__Group_1__2__Impl


    // $ANTLR start rule__AndExp__Group__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2777:1: rule__AndExp__Group__0 : rule__AndExp__Group__0__Impl rule__AndExp__Group__1 ;
    public final void rule__AndExp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2781:1: ( rule__AndExp__Group__0__Impl rule__AndExp__Group__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2782:2: rule__AndExp__Group__0__Impl rule__AndExp__Group__1
            {
            pushFollow(FOLLOW_rule__AndExp__Group__0__Impl_in_rule__AndExp__Group__05615);
            rule__AndExp__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AndExp__Group__1_in_rule__AndExp__Group__05618);
            rule__AndExp__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AndExp__Group__0


    // $ANTLR start rule__AndExp__Group__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2789:1: rule__AndExp__Group__0__Impl : ( ruleRelational ) ;
    public final void rule__AndExp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2793:1: ( ( ruleRelational ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2794:1: ( ruleRelational )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2794:1: ( ruleRelational )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2795:1: ruleRelational
            {
             before(grammarAccess.getAndExpAccess().getRelationalParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleRelational_in_rule__AndExp__Group__0__Impl5645);
            ruleRelational();
            _fsp--;

             after(grammarAccess.getAndExpAccess().getRelationalParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AndExp__Group__0__Impl


    // $ANTLR start rule__AndExp__Group__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2806:1: rule__AndExp__Group__1 : rule__AndExp__Group__1__Impl ;
    public final void rule__AndExp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2810:1: ( rule__AndExp__Group__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2811:2: rule__AndExp__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AndExp__Group__1__Impl_in_rule__AndExp__Group__15674);
            rule__AndExp__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AndExp__Group__1


    // $ANTLR start rule__AndExp__Group__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2817:1: rule__AndExp__Group__1__Impl : ( ( rule__AndExp__Group_1__0 )* ) ;
    public final void rule__AndExp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2821:1: ( ( ( rule__AndExp__Group_1__0 )* ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2822:1: ( ( rule__AndExp__Group_1__0 )* )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2822:1: ( ( rule__AndExp__Group_1__0 )* )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2823:1: ( rule__AndExp__Group_1__0 )*
            {
             before(grammarAccess.getAndExpAccess().getGroup_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2824:1: ( rule__AndExp__Group_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==38) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2824:2: rule__AndExp__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AndExp__Group_1__0_in_rule__AndExp__Group__1__Impl5701);
            	    rule__AndExp__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getAndExpAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AndExp__Group__1__Impl


    // $ANTLR start rule__AndExp__Group_1__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2838:1: rule__AndExp__Group_1__0 : rule__AndExp__Group_1__0__Impl rule__AndExp__Group_1__1 ;
    public final void rule__AndExp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2842:1: ( rule__AndExp__Group_1__0__Impl rule__AndExp__Group_1__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2843:2: rule__AndExp__Group_1__0__Impl rule__AndExp__Group_1__1
            {
            pushFollow(FOLLOW_rule__AndExp__Group_1__0__Impl_in_rule__AndExp__Group_1__05736);
            rule__AndExp__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AndExp__Group_1__1_in_rule__AndExp__Group_1__05739);
            rule__AndExp__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AndExp__Group_1__0


    // $ANTLR start rule__AndExp__Group_1__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2850:1: rule__AndExp__Group_1__0__Impl : ( () ) ;
    public final void rule__AndExp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2854:1: ( ( () ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2855:1: ( () )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2855:1: ( () )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2856:1: ()
            {
             before(grammarAccess.getAndExpAccess().getAndLeftAction_1_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2857:1: ()
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2859:1: 
            {
            }

             after(grammarAccess.getAndExpAccess().getAndLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AndExp__Group_1__0__Impl


    // $ANTLR start rule__AndExp__Group_1__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2869:1: rule__AndExp__Group_1__1 : rule__AndExp__Group_1__1__Impl rule__AndExp__Group_1__2 ;
    public final void rule__AndExp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2873:1: ( rule__AndExp__Group_1__1__Impl rule__AndExp__Group_1__2 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2874:2: rule__AndExp__Group_1__1__Impl rule__AndExp__Group_1__2
            {
            pushFollow(FOLLOW_rule__AndExp__Group_1__1__Impl_in_rule__AndExp__Group_1__15797);
            rule__AndExp__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AndExp__Group_1__2_in_rule__AndExp__Group_1__15800);
            rule__AndExp__Group_1__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AndExp__Group_1__1


    // $ANTLR start rule__AndExp__Group_1__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2881:1: rule__AndExp__Group_1__1__Impl : ( ( rule__AndExp__And_opAssignment_1_1 ) ) ;
    public final void rule__AndExp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2885:1: ( ( ( rule__AndExp__And_opAssignment_1_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2886:1: ( ( rule__AndExp__And_opAssignment_1_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2886:1: ( ( rule__AndExp__And_opAssignment_1_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2887:1: ( rule__AndExp__And_opAssignment_1_1 )
            {
             before(grammarAccess.getAndExpAccess().getAnd_opAssignment_1_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2888:1: ( rule__AndExp__And_opAssignment_1_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2888:2: rule__AndExp__And_opAssignment_1_1
            {
            pushFollow(FOLLOW_rule__AndExp__And_opAssignment_1_1_in_rule__AndExp__Group_1__1__Impl5827);
            rule__AndExp__And_opAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getAndExpAccess().getAnd_opAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AndExp__Group_1__1__Impl


    // $ANTLR start rule__AndExp__Group_1__2
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2898:1: rule__AndExp__Group_1__2 : rule__AndExp__Group_1__2__Impl ;
    public final void rule__AndExp__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2902:1: ( rule__AndExp__Group_1__2__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2903:2: rule__AndExp__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__AndExp__Group_1__2__Impl_in_rule__AndExp__Group_1__25857);
            rule__AndExp__Group_1__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AndExp__Group_1__2


    // $ANTLR start rule__AndExp__Group_1__2__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2909:1: rule__AndExp__Group_1__2__Impl : ( ( rule__AndExp__RightAssignment_1_2 ) ) ;
    public final void rule__AndExp__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2913:1: ( ( ( rule__AndExp__RightAssignment_1_2 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2914:1: ( ( rule__AndExp__RightAssignment_1_2 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2914:1: ( ( rule__AndExp__RightAssignment_1_2 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2915:1: ( rule__AndExp__RightAssignment_1_2 )
            {
             before(grammarAccess.getAndExpAccess().getRightAssignment_1_2()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2916:1: ( rule__AndExp__RightAssignment_1_2 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2916:2: rule__AndExp__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__AndExp__RightAssignment_1_2_in_rule__AndExp__Group_1__2__Impl5884);
            rule__AndExp__RightAssignment_1_2();
            _fsp--;


            }

             after(grammarAccess.getAndExpAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AndExp__Group_1__2__Impl


    // $ANTLR start rule__Relational__Group__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2932:1: rule__Relational__Group__0 : rule__Relational__Group__0__Impl rule__Relational__Group__1 ;
    public final void rule__Relational__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2936:1: ( rule__Relational__Group__0__Impl rule__Relational__Group__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2937:2: rule__Relational__Group__0__Impl rule__Relational__Group__1
            {
            pushFollow(FOLLOW_rule__Relational__Group__0__Impl_in_rule__Relational__Group__05920);
            rule__Relational__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Relational__Group__1_in_rule__Relational__Group__05923);
            rule__Relational__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Relational__Group__0


    // $ANTLR start rule__Relational__Group__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2944:1: rule__Relational__Group__0__Impl : ( ruleAddition ) ;
    public final void rule__Relational__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2948:1: ( ( ruleAddition ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2949:1: ( ruleAddition )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2949:1: ( ruleAddition )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2950:1: ruleAddition
            {
             before(grammarAccess.getRelationalAccess().getAdditionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAddition_in_rule__Relational__Group__0__Impl5950);
            ruleAddition();
            _fsp--;

             after(grammarAccess.getRelationalAccess().getAdditionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Relational__Group__0__Impl


    // $ANTLR start rule__Relational__Group__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2961:1: rule__Relational__Group__1 : rule__Relational__Group__1__Impl ;
    public final void rule__Relational__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2965:1: ( rule__Relational__Group__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2966:2: rule__Relational__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Relational__Group__1__Impl_in_rule__Relational__Group__15979);
            rule__Relational__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Relational__Group__1


    // $ANTLR start rule__Relational__Group__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2972:1: rule__Relational__Group__1__Impl : ( ( rule__Relational__Group_1__0 )? ) ;
    public final void rule__Relational__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2976:1: ( ( ( rule__Relational__Group_1__0 )? ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2977:1: ( ( rule__Relational__Group_1__0 )? )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2977:1: ( ( rule__Relational__Group_1__0 )? )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2978:1: ( rule__Relational__Group_1__0 )?
            {
             before(grammarAccess.getRelationalAccess().getGroup_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2979:1: ( rule__Relational__Group_1__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=39 && LA30_0<=45)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2979:2: rule__Relational__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Relational__Group_1__0_in_rule__Relational__Group__1__Impl6006);
                    rule__Relational__Group_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRelationalAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Relational__Group__1__Impl


    // $ANTLR start rule__Relational__Group_1__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2993:1: rule__Relational__Group_1__0 : rule__Relational__Group_1__0__Impl rule__Relational__Group_1__1 ;
    public final void rule__Relational__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2997:1: ( rule__Relational__Group_1__0__Impl rule__Relational__Group_1__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2998:2: rule__Relational__Group_1__0__Impl rule__Relational__Group_1__1
            {
            pushFollow(FOLLOW_rule__Relational__Group_1__0__Impl_in_rule__Relational__Group_1__06041);
            rule__Relational__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Relational__Group_1__1_in_rule__Relational__Group_1__06044);
            rule__Relational__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Relational__Group_1__0


    // $ANTLR start rule__Relational__Group_1__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3005:1: rule__Relational__Group_1__0__Impl : ( ( rule__Relational__Alternatives_1_0 ) ) ;
    public final void rule__Relational__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3009:1: ( ( ( rule__Relational__Alternatives_1_0 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3010:1: ( ( rule__Relational__Alternatives_1_0 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3010:1: ( ( rule__Relational__Alternatives_1_0 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3011:1: ( rule__Relational__Alternatives_1_0 )
            {
             before(grammarAccess.getRelationalAccess().getAlternatives_1_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3012:1: ( rule__Relational__Alternatives_1_0 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3012:2: rule__Relational__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__Relational__Alternatives_1_0_in_rule__Relational__Group_1__0__Impl6071);
            rule__Relational__Alternatives_1_0();
            _fsp--;


            }

             after(grammarAccess.getRelationalAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Relational__Group_1__0__Impl


    // $ANTLR start rule__Relational__Group_1__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3022:1: rule__Relational__Group_1__1 : rule__Relational__Group_1__1__Impl ;
    public final void rule__Relational__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3026:1: ( rule__Relational__Group_1__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3027:2: rule__Relational__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Relational__Group_1__1__Impl_in_rule__Relational__Group_1__16101);
            rule__Relational__Group_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Relational__Group_1__1


    // $ANTLR start rule__Relational__Group_1__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3033:1: rule__Relational__Group_1__1__Impl : ( ( rule__Relational__RightAssignment_1_1 ) ) ;
    public final void rule__Relational__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3037:1: ( ( ( rule__Relational__RightAssignment_1_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3038:1: ( ( rule__Relational__RightAssignment_1_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3038:1: ( ( rule__Relational__RightAssignment_1_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3039:1: ( rule__Relational__RightAssignment_1_1 )
            {
             before(grammarAccess.getRelationalAccess().getRightAssignment_1_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3040:1: ( rule__Relational__RightAssignment_1_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3040:2: rule__Relational__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Relational__RightAssignment_1_1_in_rule__Relational__Group_1__1__Impl6128);
            rule__Relational__RightAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getRelationalAccess().getRightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Relational__Group_1__1__Impl


    // $ANTLR start rule__Relational__Group_1_0_0__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3054:1: rule__Relational__Group_1_0_0__0 : rule__Relational__Group_1_0_0__0__Impl rule__Relational__Group_1_0_0__1 ;
    public final void rule__Relational__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3058:1: ( rule__Relational__Group_1_0_0__0__Impl rule__Relational__Group_1_0_0__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3059:2: rule__Relational__Group_1_0_0__0__Impl rule__Relational__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__Relational__Group_1_0_0__0__Impl_in_rule__Relational__Group_1_0_0__06162);
            rule__Relational__Group_1_0_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Relational__Group_1_0_0__1_in_rule__Relational__Group_1_0_0__06165);
            rule__Relational__Group_1_0_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Relational__Group_1_0_0__0


    // $ANTLR start rule__Relational__Group_1_0_0__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3066:1: rule__Relational__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Relational__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3070:1: ( ( () ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3071:1: ( () )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3071:1: ( () )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3072:1: ()
            {
             before(grammarAccess.getRelationalAccess().getRelNotEqLeftAction_1_0_0_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3073:1: ()
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3075:1: 
            {
            }

             after(grammarAccess.getRelationalAccess().getRelNotEqLeftAction_1_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Relational__Group_1_0_0__0__Impl


    // $ANTLR start rule__Relational__Group_1_0_0__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3085:1: rule__Relational__Group_1_0_0__1 : rule__Relational__Group_1_0_0__1__Impl ;
    public final void rule__Relational__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3089:1: ( rule__Relational__Group_1_0_0__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3090:2: rule__Relational__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Relational__Group_1_0_0__1__Impl_in_rule__Relational__Group_1_0_0__16223);
            rule__Relational__Group_1_0_0__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Relational__Group_1_0_0__1


    // $ANTLR start rule__Relational__Group_1_0_0__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3096:1: rule__Relational__Group_1_0_0__1__Impl : ( ( rule__Relational__Rel_opAssignment_1_0_0_1 ) ) ;
    public final void rule__Relational__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3100:1: ( ( ( rule__Relational__Rel_opAssignment_1_0_0_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3101:1: ( ( rule__Relational__Rel_opAssignment_1_0_0_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3101:1: ( ( rule__Relational__Rel_opAssignment_1_0_0_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3102:1: ( rule__Relational__Rel_opAssignment_1_0_0_1 )
            {
             before(grammarAccess.getRelationalAccess().getRel_opAssignment_1_0_0_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3103:1: ( rule__Relational__Rel_opAssignment_1_0_0_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3103:2: rule__Relational__Rel_opAssignment_1_0_0_1
            {
            pushFollow(FOLLOW_rule__Relational__Rel_opAssignment_1_0_0_1_in_rule__Relational__Group_1_0_0__1__Impl6250);
            rule__Relational__Rel_opAssignment_1_0_0_1();
            _fsp--;


            }

             after(grammarAccess.getRelationalAccess().getRel_opAssignment_1_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Relational__Group_1_0_0__1__Impl


    // $ANTLR start rule__Relational__Group_1_0_1__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3117:1: rule__Relational__Group_1_0_1__0 : rule__Relational__Group_1_0_1__0__Impl rule__Relational__Group_1_0_1__1 ;
    public final void rule__Relational__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3121:1: ( rule__Relational__Group_1_0_1__0__Impl rule__Relational__Group_1_0_1__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3122:2: rule__Relational__Group_1_0_1__0__Impl rule__Relational__Group_1_0_1__1
            {
            pushFollow(FOLLOW_rule__Relational__Group_1_0_1__0__Impl_in_rule__Relational__Group_1_0_1__06284);
            rule__Relational__Group_1_0_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Relational__Group_1_0_1__1_in_rule__Relational__Group_1_0_1__06287);
            rule__Relational__Group_1_0_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Relational__Group_1_0_1__0


    // $ANTLR start rule__Relational__Group_1_0_1__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3129:1: rule__Relational__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Relational__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3133:1: ( ( () ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3134:1: ( () )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3134:1: ( () )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3135:1: ()
            {
             before(grammarAccess.getRelationalAccess().getRelEqEqLeftAction_1_0_1_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3136:1: ()
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3138:1: 
            {
            }

             after(grammarAccess.getRelationalAccess().getRelEqEqLeftAction_1_0_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Relational__Group_1_0_1__0__Impl


    // $ANTLR start rule__Relational__Group_1_0_1__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3148:1: rule__Relational__Group_1_0_1__1 : rule__Relational__Group_1_0_1__1__Impl ;
    public final void rule__Relational__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3152:1: ( rule__Relational__Group_1_0_1__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3153:2: rule__Relational__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Relational__Group_1_0_1__1__Impl_in_rule__Relational__Group_1_0_1__16345);
            rule__Relational__Group_1_0_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Relational__Group_1_0_1__1


    // $ANTLR start rule__Relational__Group_1_0_1__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3159:1: rule__Relational__Group_1_0_1__1__Impl : ( ( rule__Relational__Rel_opAssignment_1_0_1_1 ) ) ;
    public final void rule__Relational__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3163:1: ( ( ( rule__Relational__Rel_opAssignment_1_0_1_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3164:1: ( ( rule__Relational__Rel_opAssignment_1_0_1_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3164:1: ( ( rule__Relational__Rel_opAssignment_1_0_1_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3165:1: ( rule__Relational__Rel_opAssignment_1_0_1_1 )
            {
             before(grammarAccess.getRelationalAccess().getRel_opAssignment_1_0_1_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3166:1: ( rule__Relational__Rel_opAssignment_1_0_1_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3166:2: rule__Relational__Rel_opAssignment_1_0_1_1
            {
            pushFollow(FOLLOW_rule__Relational__Rel_opAssignment_1_0_1_1_in_rule__Relational__Group_1_0_1__1__Impl6372);
            rule__Relational__Rel_opAssignment_1_0_1_1();
            _fsp--;


            }

             after(grammarAccess.getRelationalAccess().getRel_opAssignment_1_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Relational__Group_1_0_1__1__Impl


    // $ANTLR start rule__Relational__Group_1_0_2__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3180:1: rule__Relational__Group_1_0_2__0 : rule__Relational__Group_1_0_2__0__Impl rule__Relational__Group_1_0_2__1 ;
    public final void rule__Relational__Group_1_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3184:1: ( rule__Relational__Group_1_0_2__0__Impl rule__Relational__Group_1_0_2__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3185:2: rule__Relational__Group_1_0_2__0__Impl rule__Relational__Group_1_0_2__1
            {
            pushFollow(FOLLOW_rule__Relational__Group_1_0_2__0__Impl_in_rule__Relational__Group_1_0_2__06406);
            rule__Relational__Group_1_0_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Relational__Group_1_0_2__1_in_rule__Relational__Group_1_0_2__06409);
            rule__Relational__Group_1_0_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Relational__Group_1_0_2__0


    // $ANTLR start rule__Relational__Group_1_0_2__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3192:1: rule__Relational__Group_1_0_2__0__Impl : ( () ) ;
    public final void rule__Relational__Group_1_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3196:1: ( ( () ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3197:1: ( () )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3197:1: ( () )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3198:1: ()
            {
             before(grammarAccess.getRelationalAccess().getRelLtEqLeftAction_1_0_2_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3199:1: ()
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3201:1: 
            {
            }

             after(grammarAccess.getRelationalAccess().getRelLtEqLeftAction_1_0_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Relational__Group_1_0_2__0__Impl


    // $ANTLR start rule__Relational__Group_1_0_2__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3211:1: rule__Relational__Group_1_0_2__1 : rule__Relational__Group_1_0_2__1__Impl ;
    public final void rule__Relational__Group_1_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3215:1: ( rule__Relational__Group_1_0_2__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3216:2: rule__Relational__Group_1_0_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Relational__Group_1_0_2__1__Impl_in_rule__Relational__Group_1_0_2__16467);
            rule__Relational__Group_1_0_2__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Relational__Group_1_0_2__1


    // $ANTLR start rule__Relational__Group_1_0_2__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3222:1: rule__Relational__Group_1_0_2__1__Impl : ( ( rule__Relational__Rel_opAssignment_1_0_2_1 ) ) ;
    public final void rule__Relational__Group_1_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3226:1: ( ( ( rule__Relational__Rel_opAssignment_1_0_2_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3227:1: ( ( rule__Relational__Rel_opAssignment_1_0_2_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3227:1: ( ( rule__Relational__Rel_opAssignment_1_0_2_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3228:1: ( rule__Relational__Rel_opAssignment_1_0_2_1 )
            {
             before(grammarAccess.getRelationalAccess().getRel_opAssignment_1_0_2_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3229:1: ( rule__Relational__Rel_opAssignment_1_0_2_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3229:2: rule__Relational__Rel_opAssignment_1_0_2_1
            {
            pushFollow(FOLLOW_rule__Relational__Rel_opAssignment_1_0_2_1_in_rule__Relational__Group_1_0_2__1__Impl6494);
            rule__Relational__Rel_opAssignment_1_0_2_1();
            _fsp--;


            }

             after(grammarAccess.getRelationalAccess().getRel_opAssignment_1_0_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Relational__Group_1_0_2__1__Impl


    // $ANTLR start rule__Relational__Group_1_0_3__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3243:1: rule__Relational__Group_1_0_3__0 : rule__Relational__Group_1_0_3__0__Impl rule__Relational__Group_1_0_3__1 ;
    public final void rule__Relational__Group_1_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3247:1: ( rule__Relational__Group_1_0_3__0__Impl rule__Relational__Group_1_0_3__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3248:2: rule__Relational__Group_1_0_3__0__Impl rule__Relational__Group_1_0_3__1
            {
            pushFollow(FOLLOW_rule__Relational__Group_1_0_3__0__Impl_in_rule__Relational__Group_1_0_3__06528);
            rule__Relational__Group_1_0_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Relational__Group_1_0_3__1_in_rule__Relational__Group_1_0_3__06531);
            rule__Relational__Group_1_0_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Relational__Group_1_0_3__0


    // $ANTLR start rule__Relational__Group_1_0_3__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3255:1: rule__Relational__Group_1_0_3__0__Impl : ( () ) ;
    public final void rule__Relational__Group_1_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3259:1: ( ( () ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3260:1: ( () )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3260:1: ( () )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3261:1: ()
            {
             before(grammarAccess.getRelationalAccess().getRelGtEqLeftAction_1_0_3_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3262:1: ()
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3264:1: 
            {
            }

             after(grammarAccess.getRelationalAccess().getRelGtEqLeftAction_1_0_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Relational__Group_1_0_3__0__Impl


    // $ANTLR start rule__Relational__Group_1_0_3__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3274:1: rule__Relational__Group_1_0_3__1 : rule__Relational__Group_1_0_3__1__Impl ;
    public final void rule__Relational__Group_1_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3278:1: ( rule__Relational__Group_1_0_3__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3279:2: rule__Relational__Group_1_0_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Relational__Group_1_0_3__1__Impl_in_rule__Relational__Group_1_0_3__16589);
            rule__Relational__Group_1_0_3__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Relational__Group_1_0_3__1


    // $ANTLR start rule__Relational__Group_1_0_3__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3285:1: rule__Relational__Group_1_0_3__1__Impl : ( ( rule__Relational__Rel_opAssignment_1_0_3_1 ) ) ;
    public final void rule__Relational__Group_1_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3289:1: ( ( ( rule__Relational__Rel_opAssignment_1_0_3_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3290:1: ( ( rule__Relational__Rel_opAssignment_1_0_3_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3290:1: ( ( rule__Relational__Rel_opAssignment_1_0_3_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3291:1: ( rule__Relational__Rel_opAssignment_1_0_3_1 )
            {
             before(grammarAccess.getRelationalAccess().getRel_opAssignment_1_0_3_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3292:1: ( rule__Relational__Rel_opAssignment_1_0_3_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3292:2: rule__Relational__Rel_opAssignment_1_0_3_1
            {
            pushFollow(FOLLOW_rule__Relational__Rel_opAssignment_1_0_3_1_in_rule__Relational__Group_1_0_3__1__Impl6616);
            rule__Relational__Rel_opAssignment_1_0_3_1();
            _fsp--;


            }

             after(grammarAccess.getRelationalAccess().getRel_opAssignment_1_0_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Relational__Group_1_0_3__1__Impl


    // $ANTLR start rule__Relational__Group_1_0_4__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3306:1: rule__Relational__Group_1_0_4__0 : rule__Relational__Group_1_0_4__0__Impl rule__Relational__Group_1_0_4__1 ;
    public final void rule__Relational__Group_1_0_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3310:1: ( rule__Relational__Group_1_0_4__0__Impl rule__Relational__Group_1_0_4__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3311:2: rule__Relational__Group_1_0_4__0__Impl rule__Relational__Group_1_0_4__1
            {
            pushFollow(FOLLOW_rule__Relational__Group_1_0_4__0__Impl_in_rule__Relational__Group_1_0_4__06650);
            rule__Relational__Group_1_0_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Relational__Group_1_0_4__1_in_rule__Relational__Group_1_0_4__06653);
            rule__Relational__Group_1_0_4__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Relational__Group_1_0_4__0


    // $ANTLR start rule__Relational__Group_1_0_4__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3318:1: rule__Relational__Group_1_0_4__0__Impl : ( () ) ;
    public final void rule__Relational__Group_1_0_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3322:1: ( ( () ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3323:1: ( () )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3323:1: ( () )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3324:1: ()
            {
             before(grammarAccess.getRelationalAccess().getRelEqLeftAction_1_0_4_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3325:1: ()
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3327:1: 
            {
            }

             after(grammarAccess.getRelationalAccess().getRelEqLeftAction_1_0_4_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Relational__Group_1_0_4__0__Impl


    // $ANTLR start rule__Relational__Group_1_0_4__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3337:1: rule__Relational__Group_1_0_4__1 : rule__Relational__Group_1_0_4__1__Impl ;
    public final void rule__Relational__Group_1_0_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3341:1: ( rule__Relational__Group_1_0_4__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3342:2: rule__Relational__Group_1_0_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Relational__Group_1_0_4__1__Impl_in_rule__Relational__Group_1_0_4__16711);
            rule__Relational__Group_1_0_4__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Relational__Group_1_0_4__1


    // $ANTLR start rule__Relational__Group_1_0_4__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3348:1: rule__Relational__Group_1_0_4__1__Impl : ( ( rule__Relational__Rel_opAssignment_1_0_4_1 ) ) ;
    public final void rule__Relational__Group_1_0_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3352:1: ( ( ( rule__Relational__Rel_opAssignment_1_0_4_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3353:1: ( ( rule__Relational__Rel_opAssignment_1_0_4_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3353:1: ( ( rule__Relational__Rel_opAssignment_1_0_4_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3354:1: ( rule__Relational__Rel_opAssignment_1_0_4_1 )
            {
             before(grammarAccess.getRelationalAccess().getRel_opAssignment_1_0_4_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3355:1: ( rule__Relational__Rel_opAssignment_1_0_4_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3355:2: rule__Relational__Rel_opAssignment_1_0_4_1
            {
            pushFollow(FOLLOW_rule__Relational__Rel_opAssignment_1_0_4_1_in_rule__Relational__Group_1_0_4__1__Impl6738);
            rule__Relational__Rel_opAssignment_1_0_4_1();
            _fsp--;


            }

             after(grammarAccess.getRelationalAccess().getRel_opAssignment_1_0_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Relational__Group_1_0_4__1__Impl


    // $ANTLR start rule__Relational__Group_1_0_5__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3369:1: rule__Relational__Group_1_0_5__0 : rule__Relational__Group_1_0_5__0__Impl rule__Relational__Group_1_0_5__1 ;
    public final void rule__Relational__Group_1_0_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3373:1: ( rule__Relational__Group_1_0_5__0__Impl rule__Relational__Group_1_0_5__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3374:2: rule__Relational__Group_1_0_5__0__Impl rule__Relational__Group_1_0_5__1
            {
            pushFollow(FOLLOW_rule__Relational__Group_1_0_5__0__Impl_in_rule__Relational__Group_1_0_5__06772);
            rule__Relational__Group_1_0_5__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Relational__Group_1_0_5__1_in_rule__Relational__Group_1_0_5__06775);
            rule__Relational__Group_1_0_5__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Relational__Group_1_0_5__0


    // $ANTLR start rule__Relational__Group_1_0_5__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3381:1: rule__Relational__Group_1_0_5__0__Impl : ( () ) ;
    public final void rule__Relational__Group_1_0_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3385:1: ( ( () ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3386:1: ( () )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3386:1: ( () )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3387:1: ()
            {
             before(grammarAccess.getRelationalAccess().getRelLtLeftAction_1_0_5_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3388:1: ()
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3390:1: 
            {
            }

             after(grammarAccess.getRelationalAccess().getRelLtLeftAction_1_0_5_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Relational__Group_1_0_5__0__Impl


    // $ANTLR start rule__Relational__Group_1_0_5__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3400:1: rule__Relational__Group_1_0_5__1 : rule__Relational__Group_1_0_5__1__Impl ;
    public final void rule__Relational__Group_1_0_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3404:1: ( rule__Relational__Group_1_0_5__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3405:2: rule__Relational__Group_1_0_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Relational__Group_1_0_5__1__Impl_in_rule__Relational__Group_1_0_5__16833);
            rule__Relational__Group_1_0_5__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Relational__Group_1_0_5__1


    // $ANTLR start rule__Relational__Group_1_0_5__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3411:1: rule__Relational__Group_1_0_5__1__Impl : ( ( rule__Relational__Rel_opAssignment_1_0_5_1 ) ) ;
    public final void rule__Relational__Group_1_0_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3415:1: ( ( ( rule__Relational__Rel_opAssignment_1_0_5_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3416:1: ( ( rule__Relational__Rel_opAssignment_1_0_5_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3416:1: ( ( rule__Relational__Rel_opAssignment_1_0_5_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3417:1: ( rule__Relational__Rel_opAssignment_1_0_5_1 )
            {
             before(grammarAccess.getRelationalAccess().getRel_opAssignment_1_0_5_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3418:1: ( rule__Relational__Rel_opAssignment_1_0_5_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3418:2: rule__Relational__Rel_opAssignment_1_0_5_1
            {
            pushFollow(FOLLOW_rule__Relational__Rel_opAssignment_1_0_5_1_in_rule__Relational__Group_1_0_5__1__Impl6860);
            rule__Relational__Rel_opAssignment_1_0_5_1();
            _fsp--;


            }

             after(grammarAccess.getRelationalAccess().getRel_opAssignment_1_0_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Relational__Group_1_0_5__1__Impl


    // $ANTLR start rule__Relational__Group_1_0_6__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3432:1: rule__Relational__Group_1_0_6__0 : rule__Relational__Group_1_0_6__0__Impl rule__Relational__Group_1_0_6__1 ;
    public final void rule__Relational__Group_1_0_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3436:1: ( rule__Relational__Group_1_0_6__0__Impl rule__Relational__Group_1_0_6__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3437:2: rule__Relational__Group_1_0_6__0__Impl rule__Relational__Group_1_0_6__1
            {
            pushFollow(FOLLOW_rule__Relational__Group_1_0_6__0__Impl_in_rule__Relational__Group_1_0_6__06894);
            rule__Relational__Group_1_0_6__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Relational__Group_1_0_6__1_in_rule__Relational__Group_1_0_6__06897);
            rule__Relational__Group_1_0_6__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Relational__Group_1_0_6__0


    // $ANTLR start rule__Relational__Group_1_0_6__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3444:1: rule__Relational__Group_1_0_6__0__Impl : ( () ) ;
    public final void rule__Relational__Group_1_0_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3448:1: ( ( () ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3449:1: ( () )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3449:1: ( () )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3450:1: ()
            {
             before(grammarAccess.getRelationalAccess().getRelGtLeftAction_1_0_6_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3451:1: ()
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3453:1: 
            {
            }

             after(grammarAccess.getRelationalAccess().getRelGtLeftAction_1_0_6_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Relational__Group_1_0_6__0__Impl


    // $ANTLR start rule__Relational__Group_1_0_6__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3463:1: rule__Relational__Group_1_0_6__1 : rule__Relational__Group_1_0_6__1__Impl ;
    public final void rule__Relational__Group_1_0_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3467:1: ( rule__Relational__Group_1_0_6__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3468:2: rule__Relational__Group_1_0_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Relational__Group_1_0_6__1__Impl_in_rule__Relational__Group_1_0_6__16955);
            rule__Relational__Group_1_0_6__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Relational__Group_1_0_6__1


    // $ANTLR start rule__Relational__Group_1_0_6__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3474:1: rule__Relational__Group_1_0_6__1__Impl : ( ( rule__Relational__Rel_opAssignment_1_0_6_1 ) ) ;
    public final void rule__Relational__Group_1_0_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3478:1: ( ( ( rule__Relational__Rel_opAssignment_1_0_6_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3479:1: ( ( rule__Relational__Rel_opAssignment_1_0_6_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3479:1: ( ( rule__Relational__Rel_opAssignment_1_0_6_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3480:1: ( rule__Relational__Rel_opAssignment_1_0_6_1 )
            {
             before(grammarAccess.getRelationalAccess().getRel_opAssignment_1_0_6_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3481:1: ( rule__Relational__Rel_opAssignment_1_0_6_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3481:2: rule__Relational__Rel_opAssignment_1_0_6_1
            {
            pushFollow(FOLLOW_rule__Relational__Rel_opAssignment_1_0_6_1_in_rule__Relational__Group_1_0_6__1__Impl6982);
            rule__Relational__Rel_opAssignment_1_0_6_1();
            _fsp--;


            }

             after(grammarAccess.getRelationalAccess().getRel_opAssignment_1_0_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Relational__Group_1_0_6__1__Impl


    // $ANTLR start rule__Addition__Group__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3495:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3499:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3500:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
            {
            pushFollow(FOLLOW_rule__Addition__Group__0__Impl_in_rule__Addition__Group__07016);
            rule__Addition__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Addition__Group__1_in_rule__Addition__Group__07019);
            rule__Addition__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Addition__Group__0


    // $ANTLR start rule__Addition__Group__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3507:1: rule__Addition__Group__0__Impl : ( ruleMultiplication ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3511:1: ( ( ruleMultiplication ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3512:1: ( ruleMultiplication )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3512:1: ( ruleMultiplication )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3513:1: ruleMultiplication
            {
             before(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleMultiplication_in_rule__Addition__Group__0__Impl7046);
            ruleMultiplication();
            _fsp--;

             after(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Addition__Group__0__Impl


    // $ANTLR start rule__Addition__Group__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3524:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3528:1: ( rule__Addition__Group__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3529:2: rule__Addition__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group__1__Impl_in_rule__Addition__Group__17075);
            rule__Addition__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Addition__Group__1


    // $ANTLR start rule__Addition__Group__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3535:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__Group_1__0 )* ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3539:1: ( ( ( rule__Addition__Group_1__0 )* ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3540:1: ( ( rule__Addition__Group_1__0 )* )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3540:1: ( ( rule__Addition__Group_1__0 )* )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3541:1: ( rule__Addition__Group_1__0 )*
            {
             before(grammarAccess.getAdditionAccess().getGroup_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3542:1: ( rule__Addition__Group_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==34||LA31_0==46) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3542:2: rule__Addition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Addition__Group_1__0_in_rule__Addition__Group__1__Impl7102);
            	    rule__Addition__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getAdditionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Addition__Group__1__Impl


    // $ANTLR start rule__Addition__Group_1__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3556:1: rule__Addition__Group_1__0 : rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 ;
    public final void rule__Addition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3560:1: ( rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3561:2: rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1
            {
            pushFollow(FOLLOW_rule__Addition__Group_1__0__Impl_in_rule__Addition__Group_1__07137);
            rule__Addition__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Addition__Group_1__1_in_rule__Addition__Group_1__07140);
            rule__Addition__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Addition__Group_1__0


    // $ANTLR start rule__Addition__Group_1__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3568:1: rule__Addition__Group_1__0__Impl : ( ( rule__Addition__Alternatives_1_0 ) ) ;
    public final void rule__Addition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3572:1: ( ( ( rule__Addition__Alternatives_1_0 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3573:1: ( ( rule__Addition__Alternatives_1_0 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3573:1: ( ( rule__Addition__Alternatives_1_0 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3574:1: ( rule__Addition__Alternatives_1_0 )
            {
             before(grammarAccess.getAdditionAccess().getAlternatives_1_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3575:1: ( rule__Addition__Alternatives_1_0 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3575:2: rule__Addition__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__Addition__Alternatives_1_0_in_rule__Addition__Group_1__0__Impl7167);
            rule__Addition__Alternatives_1_0();
            _fsp--;


            }

             after(grammarAccess.getAdditionAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Addition__Group_1__0__Impl


    // $ANTLR start rule__Addition__Group_1__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3585:1: rule__Addition__Group_1__1 : rule__Addition__Group_1__1__Impl ;
    public final void rule__Addition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3589:1: ( rule__Addition__Group_1__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3590:2: rule__Addition__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group_1__1__Impl_in_rule__Addition__Group_1__17197);
            rule__Addition__Group_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Addition__Group_1__1


    // $ANTLR start rule__Addition__Group_1__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3596:1: rule__Addition__Group_1__1__Impl : ( ( rule__Addition__RightAssignment_1_1 ) ) ;
    public final void rule__Addition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3600:1: ( ( ( rule__Addition__RightAssignment_1_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3601:1: ( ( rule__Addition__RightAssignment_1_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3601:1: ( ( rule__Addition__RightAssignment_1_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3602:1: ( rule__Addition__RightAssignment_1_1 )
            {
             before(grammarAccess.getAdditionAccess().getRightAssignment_1_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3603:1: ( rule__Addition__RightAssignment_1_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3603:2: rule__Addition__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Addition__RightAssignment_1_1_in_rule__Addition__Group_1__1__Impl7224);
            rule__Addition__RightAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getAdditionAccess().getRightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Addition__Group_1__1__Impl


    // $ANTLR start rule__Addition__Group_1_0_0__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3617:1: rule__Addition__Group_1_0_0__0 : rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1 ;
    public final void rule__Addition__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3621:1: ( rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3622:2: rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0_0__0__Impl_in_rule__Addition__Group_1_0_0__07258);
            rule__Addition__Group_1_0_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Addition__Group_1_0_0__1_in_rule__Addition__Group_1_0_0__07261);
            rule__Addition__Group_1_0_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Addition__Group_1_0_0__0


    // $ANTLR start rule__Addition__Group_1_0_0__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3629:1: rule__Addition__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3633:1: ( ( () ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3634:1: ( () )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3634:1: ( () )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3635:1: ()
            {
             before(grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3636:1: ()
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3638:1: 
            {
            }

             after(grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Addition__Group_1_0_0__0__Impl


    // $ANTLR start rule__Addition__Group_1_0_0__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3648:1: rule__Addition__Group_1_0_0__1 : rule__Addition__Group_1_0_0__1__Impl ;
    public final void rule__Addition__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3652:1: ( rule__Addition__Group_1_0_0__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3653:2: rule__Addition__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0_0__1__Impl_in_rule__Addition__Group_1_0_0__17319);
            rule__Addition__Group_1_0_0__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Addition__Group_1_0_0__1


    // $ANTLR start rule__Addition__Group_1_0_0__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3659:1: rule__Addition__Group_1_0_0__1__Impl : ( ( rule__Addition__Add_opAssignment_1_0_0_1 ) ) ;
    public final void rule__Addition__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3663:1: ( ( ( rule__Addition__Add_opAssignment_1_0_0_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3664:1: ( ( rule__Addition__Add_opAssignment_1_0_0_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3664:1: ( ( rule__Addition__Add_opAssignment_1_0_0_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3665:1: ( rule__Addition__Add_opAssignment_1_0_0_1 )
            {
             before(grammarAccess.getAdditionAccess().getAdd_opAssignment_1_0_0_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3666:1: ( rule__Addition__Add_opAssignment_1_0_0_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3666:2: rule__Addition__Add_opAssignment_1_0_0_1
            {
            pushFollow(FOLLOW_rule__Addition__Add_opAssignment_1_0_0_1_in_rule__Addition__Group_1_0_0__1__Impl7346);
            rule__Addition__Add_opAssignment_1_0_0_1();
            _fsp--;


            }

             after(grammarAccess.getAdditionAccess().getAdd_opAssignment_1_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Addition__Group_1_0_0__1__Impl


    // $ANTLR start rule__Addition__Group_1_0_1__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3680:1: rule__Addition__Group_1_0_1__0 : rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1 ;
    public final void rule__Addition__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3684:1: ( rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3685:2: rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0_1__0__Impl_in_rule__Addition__Group_1_0_1__07380);
            rule__Addition__Group_1_0_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Addition__Group_1_0_1__1_in_rule__Addition__Group_1_0_1__07383);
            rule__Addition__Group_1_0_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Addition__Group_1_0_1__0


    // $ANTLR start rule__Addition__Group_1_0_1__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3692:1: rule__Addition__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3696:1: ( ( () ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3697:1: ( () )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3697:1: ( () )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3698:1: ()
            {
             before(grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3699:1: ()
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3701:1: 
            {
            }

             after(grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Addition__Group_1_0_1__0__Impl


    // $ANTLR start rule__Addition__Group_1_0_1__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3711:1: rule__Addition__Group_1_0_1__1 : rule__Addition__Group_1_0_1__1__Impl ;
    public final void rule__Addition__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3715:1: ( rule__Addition__Group_1_0_1__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3716:2: rule__Addition__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0_1__1__Impl_in_rule__Addition__Group_1_0_1__17441);
            rule__Addition__Group_1_0_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Addition__Group_1_0_1__1


    // $ANTLR start rule__Addition__Group_1_0_1__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3722:1: rule__Addition__Group_1_0_1__1__Impl : ( ( rule__Addition__Add_opAssignment_1_0_1_1 ) ) ;
    public final void rule__Addition__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3726:1: ( ( ( rule__Addition__Add_opAssignment_1_0_1_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3727:1: ( ( rule__Addition__Add_opAssignment_1_0_1_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3727:1: ( ( rule__Addition__Add_opAssignment_1_0_1_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3728:1: ( rule__Addition__Add_opAssignment_1_0_1_1 )
            {
             before(grammarAccess.getAdditionAccess().getAdd_opAssignment_1_0_1_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3729:1: ( rule__Addition__Add_opAssignment_1_0_1_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3729:2: rule__Addition__Add_opAssignment_1_0_1_1
            {
            pushFollow(FOLLOW_rule__Addition__Add_opAssignment_1_0_1_1_in_rule__Addition__Group_1_0_1__1__Impl7468);
            rule__Addition__Add_opAssignment_1_0_1_1();
            _fsp--;


            }

             after(grammarAccess.getAdditionAccess().getAdd_opAssignment_1_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Addition__Group_1_0_1__1__Impl


    // $ANTLR start rule__Multiplication__Group__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3743:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3747:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3748:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__0__Impl_in_rule__Multiplication__Group__07502);
            rule__Multiplication__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Multiplication__Group__1_in_rule__Multiplication__Group__07505);
            rule__Multiplication__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Multiplication__Group__0


    // $ANTLR start rule__Multiplication__Group__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3755:1: rule__Multiplication__Group__0__Impl : ( rulePower ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3759:1: ( ( rulePower ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3760:1: ( rulePower )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3760:1: ( rulePower )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3761:1: rulePower
            {
             before(grammarAccess.getMultiplicationAccess().getPowerParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePower_in_rule__Multiplication__Group__0__Impl7532);
            rulePower();
            _fsp--;

             after(grammarAccess.getMultiplicationAccess().getPowerParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Multiplication__Group__0__Impl


    // $ANTLR start rule__Multiplication__Group__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3772:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3776:1: ( rule__Multiplication__Group__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3777:2: rule__Multiplication__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__1__Impl_in_rule__Multiplication__Group__17561);
            rule__Multiplication__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Multiplication__Group__1


    // $ANTLR start rule__Multiplication__Group__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3783:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__Group_1__0 )* ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3787:1: ( ( ( rule__Multiplication__Group_1__0 )* ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3788:1: ( ( rule__Multiplication__Group_1__0 )* )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3788:1: ( ( rule__Multiplication__Group_1__0 )* )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3789:1: ( rule__Multiplication__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3790:1: ( rule__Multiplication__Group_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=47 && LA32_0<=48)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3790:2: rule__Multiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Multiplication__Group_1__0_in_rule__Multiplication__Group__1__Impl7588);
            	    rule__Multiplication__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getMultiplicationAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Multiplication__Group__1__Impl


    // $ANTLR start rule__Multiplication__Group_1__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3804:1: rule__Multiplication__Group_1__0 : rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 ;
    public final void rule__Multiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3808:1: ( rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3809:2: rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1__0__Impl_in_rule__Multiplication__Group_1__07623);
            rule__Multiplication__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Multiplication__Group_1__1_in_rule__Multiplication__Group_1__07626);
            rule__Multiplication__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Multiplication__Group_1__0


    // $ANTLR start rule__Multiplication__Group_1__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3816:1: rule__Multiplication__Group_1__0__Impl : ( ( rule__Multiplication__Alternatives_1_0 ) ) ;
    public final void rule__Multiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3820:1: ( ( ( rule__Multiplication__Alternatives_1_0 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3821:1: ( ( rule__Multiplication__Alternatives_1_0 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3821:1: ( ( rule__Multiplication__Alternatives_1_0 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3822:1: ( rule__Multiplication__Alternatives_1_0 )
            {
             before(grammarAccess.getMultiplicationAccess().getAlternatives_1_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3823:1: ( rule__Multiplication__Alternatives_1_0 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3823:2: rule__Multiplication__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__Multiplication__Alternatives_1_0_in_rule__Multiplication__Group_1__0__Impl7653);
            rule__Multiplication__Alternatives_1_0();
            _fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Multiplication__Group_1__0__Impl


    // $ANTLR start rule__Multiplication__Group_1__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3833:1: rule__Multiplication__Group_1__1 : rule__Multiplication__Group_1__1__Impl ;
    public final void rule__Multiplication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3837:1: ( rule__Multiplication__Group_1__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3838:2: rule__Multiplication__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1__1__Impl_in_rule__Multiplication__Group_1__17683);
            rule__Multiplication__Group_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Multiplication__Group_1__1


    // $ANTLR start rule__Multiplication__Group_1__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3844:1: rule__Multiplication__Group_1__1__Impl : ( ( rule__Multiplication__RightAssignment_1_1 ) ) ;
    public final void rule__Multiplication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3848:1: ( ( ( rule__Multiplication__RightAssignment_1_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3849:1: ( ( rule__Multiplication__RightAssignment_1_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3849:1: ( ( rule__Multiplication__RightAssignment_1_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3850:1: ( rule__Multiplication__RightAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicationAccess().getRightAssignment_1_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3851:1: ( rule__Multiplication__RightAssignment_1_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3851:2: rule__Multiplication__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Multiplication__RightAssignment_1_1_in_rule__Multiplication__Group_1__1__Impl7710);
            rule__Multiplication__RightAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getRightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Multiplication__Group_1__1__Impl


    // $ANTLR start rule__Multiplication__Group_1_0_0__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3865:1: rule__Multiplication__Group_1_0_0__0 : rule__Multiplication__Group_1_0_0__0__Impl rule__Multiplication__Group_1_0_0__1 ;
    public final void rule__Multiplication__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3869:1: ( rule__Multiplication__Group_1_0_0__0__Impl rule__Multiplication__Group_1_0_0__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3870:2: rule__Multiplication__Group_1_0_0__0__Impl rule__Multiplication__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_0__0__Impl_in_rule__Multiplication__Group_1_0_0__07744);
            rule__Multiplication__Group_1_0_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_0__1_in_rule__Multiplication__Group_1_0_0__07747);
            rule__Multiplication__Group_1_0_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Multiplication__Group_1_0_0__0


    // $ANTLR start rule__Multiplication__Group_1_0_0__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3877:1: rule__Multiplication__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3881:1: ( ( () ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3882:1: ( () )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3882:1: ( () )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3883:1: ()
            {
             before(grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3884:1: ()
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3886:1: 
            {
            }

             after(grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Multiplication__Group_1_0_0__0__Impl


    // $ANTLR start rule__Multiplication__Group_1_0_0__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3896:1: rule__Multiplication__Group_1_0_0__1 : rule__Multiplication__Group_1_0_0__1__Impl ;
    public final void rule__Multiplication__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3900:1: ( rule__Multiplication__Group_1_0_0__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3901:2: rule__Multiplication__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_0__1__Impl_in_rule__Multiplication__Group_1_0_0__17805);
            rule__Multiplication__Group_1_0_0__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Multiplication__Group_1_0_0__1


    // $ANTLR start rule__Multiplication__Group_1_0_0__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3907:1: rule__Multiplication__Group_1_0_0__1__Impl : ( ( rule__Multiplication__Mul_opAssignment_1_0_0_1 ) ) ;
    public final void rule__Multiplication__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3911:1: ( ( ( rule__Multiplication__Mul_opAssignment_1_0_0_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3912:1: ( ( rule__Multiplication__Mul_opAssignment_1_0_0_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3912:1: ( ( rule__Multiplication__Mul_opAssignment_1_0_0_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3913:1: ( rule__Multiplication__Mul_opAssignment_1_0_0_1 )
            {
             before(grammarAccess.getMultiplicationAccess().getMul_opAssignment_1_0_0_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3914:1: ( rule__Multiplication__Mul_opAssignment_1_0_0_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3914:2: rule__Multiplication__Mul_opAssignment_1_0_0_1
            {
            pushFollow(FOLLOW_rule__Multiplication__Mul_opAssignment_1_0_0_1_in_rule__Multiplication__Group_1_0_0__1__Impl7832);
            rule__Multiplication__Mul_opAssignment_1_0_0_1();
            _fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getMul_opAssignment_1_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Multiplication__Group_1_0_0__1__Impl


    // $ANTLR start rule__Multiplication__Group_1_0_1__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3928:1: rule__Multiplication__Group_1_0_1__0 : rule__Multiplication__Group_1_0_1__0__Impl rule__Multiplication__Group_1_0_1__1 ;
    public final void rule__Multiplication__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3932:1: ( rule__Multiplication__Group_1_0_1__0__Impl rule__Multiplication__Group_1_0_1__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3933:2: rule__Multiplication__Group_1_0_1__0__Impl rule__Multiplication__Group_1_0_1__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_1__0__Impl_in_rule__Multiplication__Group_1_0_1__07866);
            rule__Multiplication__Group_1_0_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_1__1_in_rule__Multiplication__Group_1_0_1__07869);
            rule__Multiplication__Group_1_0_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Multiplication__Group_1_0_1__0


    // $ANTLR start rule__Multiplication__Group_1_0_1__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3940:1: rule__Multiplication__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3944:1: ( ( () ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3945:1: ( () )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3945:1: ( () )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3946:1: ()
            {
             before(grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3947:1: ()
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3949:1: 
            {
            }

             after(grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Multiplication__Group_1_0_1__0__Impl


    // $ANTLR start rule__Multiplication__Group_1_0_1__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3959:1: rule__Multiplication__Group_1_0_1__1 : rule__Multiplication__Group_1_0_1__1__Impl ;
    public final void rule__Multiplication__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3963:1: ( rule__Multiplication__Group_1_0_1__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3964:2: rule__Multiplication__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_1__1__Impl_in_rule__Multiplication__Group_1_0_1__17927);
            rule__Multiplication__Group_1_0_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Multiplication__Group_1_0_1__1


    // $ANTLR start rule__Multiplication__Group_1_0_1__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3970:1: rule__Multiplication__Group_1_0_1__1__Impl : ( ( rule__Multiplication__Mul_opAssignment_1_0_1_1 ) ) ;
    public final void rule__Multiplication__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3974:1: ( ( ( rule__Multiplication__Mul_opAssignment_1_0_1_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3975:1: ( ( rule__Multiplication__Mul_opAssignment_1_0_1_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3975:1: ( ( rule__Multiplication__Mul_opAssignment_1_0_1_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3976:1: ( rule__Multiplication__Mul_opAssignment_1_0_1_1 )
            {
             before(grammarAccess.getMultiplicationAccess().getMul_opAssignment_1_0_1_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3977:1: ( rule__Multiplication__Mul_opAssignment_1_0_1_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3977:2: rule__Multiplication__Mul_opAssignment_1_0_1_1
            {
            pushFollow(FOLLOW_rule__Multiplication__Mul_opAssignment_1_0_1_1_in_rule__Multiplication__Group_1_0_1__1__Impl7954);
            rule__Multiplication__Mul_opAssignment_1_0_1_1();
            _fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getMul_opAssignment_1_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Multiplication__Group_1_0_1__1__Impl


    // $ANTLR start rule__Power__Group__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3991:1: rule__Power__Group__0 : rule__Power__Group__0__Impl rule__Power__Group__1 ;
    public final void rule__Power__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3995:1: ( rule__Power__Group__0__Impl rule__Power__Group__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3996:2: rule__Power__Group__0__Impl rule__Power__Group__1
            {
            pushFollow(FOLLOW_rule__Power__Group__0__Impl_in_rule__Power__Group__07988);
            rule__Power__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Power__Group__1_in_rule__Power__Group__07991);
            rule__Power__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Power__Group__0


    // $ANTLR start rule__Power__Group__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4003:1: rule__Power__Group__0__Impl : ( ruleUnaryExpr ) ;
    public final void rule__Power__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4007:1: ( ( ruleUnaryExpr ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4008:1: ( ruleUnaryExpr )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4008:1: ( ruleUnaryExpr )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4009:1: ruleUnaryExpr
            {
             before(grammarAccess.getPowerAccess().getUnaryExprParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleUnaryExpr_in_rule__Power__Group__0__Impl8018);
            ruleUnaryExpr();
            _fsp--;

             after(grammarAccess.getPowerAccess().getUnaryExprParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Power__Group__0__Impl


    // $ANTLR start rule__Power__Group__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4020:1: rule__Power__Group__1 : rule__Power__Group__1__Impl ;
    public final void rule__Power__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4024:1: ( rule__Power__Group__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4025:2: rule__Power__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Power__Group__1__Impl_in_rule__Power__Group__18047);
            rule__Power__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Power__Group__1


    // $ANTLR start rule__Power__Group__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4031:1: rule__Power__Group__1__Impl : ( ( rule__Power__Group_1__0 )* ) ;
    public final void rule__Power__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4035:1: ( ( ( rule__Power__Group_1__0 )* ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4036:1: ( ( rule__Power__Group_1__0 )* )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4036:1: ( ( rule__Power__Group_1__0 )* )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4037:1: ( rule__Power__Group_1__0 )*
            {
             before(grammarAccess.getPowerAccess().getGroup_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4038:1: ( rule__Power__Group_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==49) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4038:2: rule__Power__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Power__Group_1__0_in_rule__Power__Group__1__Impl8074);
            	    rule__Power__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getPowerAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Power__Group__1__Impl


    // $ANTLR start rule__Power__Group_1__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4052:1: rule__Power__Group_1__0 : rule__Power__Group_1__0__Impl rule__Power__Group_1__1 ;
    public final void rule__Power__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4056:1: ( rule__Power__Group_1__0__Impl rule__Power__Group_1__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4057:2: rule__Power__Group_1__0__Impl rule__Power__Group_1__1
            {
            pushFollow(FOLLOW_rule__Power__Group_1__0__Impl_in_rule__Power__Group_1__08109);
            rule__Power__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Power__Group_1__1_in_rule__Power__Group_1__08112);
            rule__Power__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Power__Group_1__0


    // $ANTLR start rule__Power__Group_1__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4064:1: rule__Power__Group_1__0__Impl : ( ( rule__Power__Group_1_0__0 ) ) ;
    public final void rule__Power__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4068:1: ( ( ( rule__Power__Group_1_0__0 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4069:1: ( ( rule__Power__Group_1_0__0 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4069:1: ( ( rule__Power__Group_1_0__0 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4070:1: ( rule__Power__Group_1_0__0 )
            {
             before(grammarAccess.getPowerAccess().getGroup_1_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4071:1: ( rule__Power__Group_1_0__0 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4071:2: rule__Power__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__Power__Group_1_0__0_in_rule__Power__Group_1__0__Impl8139);
            rule__Power__Group_1_0__0();
            _fsp--;


            }

             after(grammarAccess.getPowerAccess().getGroup_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Power__Group_1__0__Impl


    // $ANTLR start rule__Power__Group_1__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4081:1: rule__Power__Group_1__1 : rule__Power__Group_1__1__Impl ;
    public final void rule__Power__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4085:1: ( rule__Power__Group_1__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4086:2: rule__Power__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Power__Group_1__1__Impl_in_rule__Power__Group_1__18169);
            rule__Power__Group_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Power__Group_1__1


    // $ANTLR start rule__Power__Group_1__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4092:1: rule__Power__Group_1__1__Impl : ( ( rule__Power__RightAssignment_1_1 ) ) ;
    public final void rule__Power__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4096:1: ( ( ( rule__Power__RightAssignment_1_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4097:1: ( ( rule__Power__RightAssignment_1_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4097:1: ( ( rule__Power__RightAssignment_1_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4098:1: ( rule__Power__RightAssignment_1_1 )
            {
             before(grammarAccess.getPowerAccess().getRightAssignment_1_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4099:1: ( rule__Power__RightAssignment_1_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4099:2: rule__Power__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Power__RightAssignment_1_1_in_rule__Power__Group_1__1__Impl8196);
            rule__Power__RightAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getPowerAccess().getRightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Power__Group_1__1__Impl


    // $ANTLR start rule__Power__Group_1_0__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4113:1: rule__Power__Group_1_0__0 : rule__Power__Group_1_0__0__Impl rule__Power__Group_1_0__1 ;
    public final void rule__Power__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4117:1: ( rule__Power__Group_1_0__0__Impl rule__Power__Group_1_0__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4118:2: rule__Power__Group_1_0__0__Impl rule__Power__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__Power__Group_1_0__0__Impl_in_rule__Power__Group_1_0__08230);
            rule__Power__Group_1_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Power__Group_1_0__1_in_rule__Power__Group_1_0__08233);
            rule__Power__Group_1_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Power__Group_1_0__0


    // $ANTLR start rule__Power__Group_1_0__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4125:1: rule__Power__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Power__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4129:1: ( ( () ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4130:1: ( () )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4130:1: ( () )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4131:1: ()
            {
             before(grammarAccess.getPowerAccess().getPowLeftAction_1_0_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4132:1: ()
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4134:1: 
            {
            }

             after(grammarAccess.getPowerAccess().getPowLeftAction_1_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Power__Group_1_0__0__Impl


    // $ANTLR start rule__Power__Group_1_0__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4144:1: rule__Power__Group_1_0__1 : rule__Power__Group_1_0__1__Impl ;
    public final void rule__Power__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4148:1: ( rule__Power__Group_1_0__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4149:2: rule__Power__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Power__Group_1_0__1__Impl_in_rule__Power__Group_1_0__18291);
            rule__Power__Group_1_0__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Power__Group_1_0__1


    // $ANTLR start rule__Power__Group_1_0__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4155:1: rule__Power__Group_1_0__1__Impl : ( ( rule__Power__Pow_opAssignment_1_0_1 ) ) ;
    public final void rule__Power__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4159:1: ( ( ( rule__Power__Pow_opAssignment_1_0_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4160:1: ( ( rule__Power__Pow_opAssignment_1_0_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4160:1: ( ( rule__Power__Pow_opAssignment_1_0_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4161:1: ( rule__Power__Pow_opAssignment_1_0_1 )
            {
             before(grammarAccess.getPowerAccess().getPow_opAssignment_1_0_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4162:1: ( rule__Power__Pow_opAssignment_1_0_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4162:2: rule__Power__Pow_opAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__Power__Pow_opAssignment_1_0_1_in_rule__Power__Group_1_0__1__Impl8318);
            rule__Power__Pow_opAssignment_1_0_1();
            _fsp--;


            }

             after(grammarAccess.getPowerAccess().getPow_opAssignment_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Power__Group_1_0__1__Impl


    // $ANTLR start rule__UnaryExpr__Group__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4176:1: rule__UnaryExpr__Group__0 : rule__UnaryExpr__Group__0__Impl rule__UnaryExpr__Group__1 ;
    public final void rule__UnaryExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4180:1: ( rule__UnaryExpr__Group__0__Impl rule__UnaryExpr__Group__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4181:2: rule__UnaryExpr__Group__0__Impl rule__UnaryExpr__Group__1
            {
            pushFollow(FOLLOW_rule__UnaryExpr__Group__0__Impl_in_rule__UnaryExpr__Group__08352);
            rule__UnaryExpr__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UnaryExpr__Group__1_in_rule__UnaryExpr__Group__08355);
            rule__UnaryExpr__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnaryExpr__Group__0


    // $ANTLR start rule__UnaryExpr__Group__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4188:1: rule__UnaryExpr__Group__0__Impl : ( ( rule__UnaryExpr__UopAssignment_0 )? ) ;
    public final void rule__UnaryExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4192:1: ( ( ( rule__UnaryExpr__UopAssignment_0 )? ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4193:1: ( ( rule__UnaryExpr__UopAssignment_0 )? )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4193:1: ( ( rule__UnaryExpr__UopAssignment_0 )? )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4194:1: ( rule__UnaryExpr__UopAssignment_0 )?
            {
             before(grammarAccess.getUnaryExprAccess().getUopAssignment_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4195:1: ( rule__UnaryExpr__UopAssignment_0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=13 && LA34_0<=14)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4195:2: rule__UnaryExpr__UopAssignment_0
                    {
                    pushFollow(FOLLOW_rule__UnaryExpr__UopAssignment_0_in_rule__UnaryExpr__Group__0__Impl8382);
                    rule__UnaryExpr__UopAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUnaryExprAccess().getUopAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnaryExpr__Group__0__Impl


    // $ANTLR start rule__UnaryExpr__Group__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4205:1: rule__UnaryExpr__Group__1 : rule__UnaryExpr__Group__1__Impl ;
    public final void rule__UnaryExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4209:1: ( rule__UnaryExpr__Group__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4210:2: rule__UnaryExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__UnaryExpr__Group__1__Impl_in_rule__UnaryExpr__Group__18413);
            rule__UnaryExpr__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnaryExpr__Group__1


    // $ANTLR start rule__UnaryExpr__Group__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4216:1: rule__UnaryExpr__Group__1__Impl : ( ( rule__UnaryExpr__RightAssignment_1 ) ) ;
    public final void rule__UnaryExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4220:1: ( ( ( rule__UnaryExpr__RightAssignment_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4221:1: ( ( rule__UnaryExpr__RightAssignment_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4221:1: ( ( rule__UnaryExpr__RightAssignment_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4222:1: ( rule__UnaryExpr__RightAssignment_1 )
            {
             before(grammarAccess.getUnaryExprAccess().getRightAssignment_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4223:1: ( rule__UnaryExpr__RightAssignment_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4223:2: rule__UnaryExpr__RightAssignment_1
            {
            pushFollow(FOLLOW_rule__UnaryExpr__RightAssignment_1_in_rule__UnaryExpr__Group__1__Impl8440);
            rule__UnaryExpr__RightAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getUnaryExprAccess().getRightAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnaryExpr__Group__1__Impl


    // $ANTLR start rule__PrePrimaryExpr__Group_1__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4237:1: rule__PrePrimaryExpr__Group_1__0 : rule__PrePrimaryExpr__Group_1__0__Impl rule__PrePrimaryExpr__Group_1__1 ;
    public final void rule__PrePrimaryExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4241:1: ( rule__PrePrimaryExpr__Group_1__0__Impl rule__PrePrimaryExpr__Group_1__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4242:2: rule__PrePrimaryExpr__Group_1__0__Impl rule__PrePrimaryExpr__Group_1__1
            {
            pushFollow(FOLLOW_rule__PrePrimaryExpr__Group_1__0__Impl_in_rule__PrePrimaryExpr__Group_1__08474);
            rule__PrePrimaryExpr__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PrePrimaryExpr__Group_1__1_in_rule__PrePrimaryExpr__Group_1__08477);
            rule__PrePrimaryExpr__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PrePrimaryExpr__Group_1__0


    // $ANTLR start rule__PrePrimaryExpr__Group_1__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4249:1: rule__PrePrimaryExpr__Group_1__0__Impl : ( '(' ) ;
    public final void rule__PrePrimaryExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4253:1: ( ( '(' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4254:1: ( '(' )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4254:1: ( '(' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4255:1: '('
            {
             before(grammarAccess.getPrePrimaryExprAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,32,FOLLOW_32_in_rule__PrePrimaryExpr__Group_1__0__Impl8505); 
             after(grammarAccess.getPrePrimaryExprAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PrePrimaryExpr__Group_1__0__Impl


    // $ANTLR start rule__PrePrimaryExpr__Group_1__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4268:1: rule__PrePrimaryExpr__Group_1__1 : rule__PrePrimaryExpr__Group_1__1__Impl rule__PrePrimaryExpr__Group_1__2 ;
    public final void rule__PrePrimaryExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4272:1: ( rule__PrePrimaryExpr__Group_1__1__Impl rule__PrePrimaryExpr__Group_1__2 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4273:2: rule__PrePrimaryExpr__Group_1__1__Impl rule__PrePrimaryExpr__Group_1__2
            {
            pushFollow(FOLLOW_rule__PrePrimaryExpr__Group_1__1__Impl_in_rule__PrePrimaryExpr__Group_1__18536);
            rule__PrePrimaryExpr__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PrePrimaryExpr__Group_1__2_in_rule__PrePrimaryExpr__Group_1__18539);
            rule__PrePrimaryExpr__Group_1__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PrePrimaryExpr__Group_1__1


    // $ANTLR start rule__PrePrimaryExpr__Group_1__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4280:1: rule__PrePrimaryExpr__Group_1__1__Impl : ( ruleExpression ) ;
    public final void rule__PrePrimaryExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4284:1: ( ( ruleExpression ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4285:1: ( ruleExpression )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4285:1: ( ruleExpression )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4286:1: ruleExpression
            {
             before(grammarAccess.getPrePrimaryExprAccess().getExpressionParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__PrePrimaryExpr__Group_1__1__Impl8566);
            ruleExpression();
            _fsp--;

             after(grammarAccess.getPrePrimaryExprAccess().getExpressionParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PrePrimaryExpr__Group_1__1__Impl


    // $ANTLR start rule__PrePrimaryExpr__Group_1__2
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4297:1: rule__PrePrimaryExpr__Group_1__2 : rule__PrePrimaryExpr__Group_1__2__Impl ;
    public final void rule__PrePrimaryExpr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4301:1: ( rule__PrePrimaryExpr__Group_1__2__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4302:2: rule__PrePrimaryExpr__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__PrePrimaryExpr__Group_1__2__Impl_in_rule__PrePrimaryExpr__Group_1__28595);
            rule__PrePrimaryExpr__Group_1__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PrePrimaryExpr__Group_1__2


    // $ANTLR start rule__PrePrimaryExpr__Group_1__2__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4308:1: rule__PrePrimaryExpr__Group_1__2__Impl : ( ')' ) ;
    public final void rule__PrePrimaryExpr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4312:1: ( ( ')' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4313:1: ( ')' )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4313:1: ( ')' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4314:1: ')'
            {
             before(grammarAccess.getPrePrimaryExprAccess().getRightParenthesisKeyword_1_2()); 
            match(input,33,FOLLOW_33_in_rule__PrePrimaryExpr__Group_1__2__Impl8623); 
             after(grammarAccess.getPrePrimaryExprAccess().getRightParenthesisKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PrePrimaryExpr__Group_1__2__Impl


    // $ANTLR start rule__PrePrimaryExpr__Group_2__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4333:1: rule__PrePrimaryExpr__Group_2__0 : rule__PrePrimaryExpr__Group_2__0__Impl rule__PrePrimaryExpr__Group_2__1 ;
    public final void rule__PrePrimaryExpr__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4337:1: ( rule__PrePrimaryExpr__Group_2__0__Impl rule__PrePrimaryExpr__Group_2__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4338:2: rule__PrePrimaryExpr__Group_2__0__Impl rule__PrePrimaryExpr__Group_2__1
            {
            pushFollow(FOLLOW_rule__PrePrimaryExpr__Group_2__0__Impl_in_rule__PrePrimaryExpr__Group_2__08660);
            rule__PrePrimaryExpr__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PrePrimaryExpr__Group_2__1_in_rule__PrePrimaryExpr__Group_2__08663);
            rule__PrePrimaryExpr__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PrePrimaryExpr__Group_2__0


    // $ANTLR start rule__PrePrimaryExpr__Group_2__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4345:1: rule__PrePrimaryExpr__Group_2__0__Impl : ( '-' ) ;
    public final void rule__PrePrimaryExpr__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4349:1: ( ( '-' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4350:1: ( '-' )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4350:1: ( '-' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4351:1: '-'
            {
             before(grammarAccess.getPrePrimaryExprAccess().getHyphenMinusKeyword_2_0()); 
            match(input,34,FOLLOW_34_in_rule__PrePrimaryExpr__Group_2__0__Impl8691); 
             after(grammarAccess.getPrePrimaryExprAccess().getHyphenMinusKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PrePrimaryExpr__Group_2__0__Impl


    // $ANTLR start rule__PrePrimaryExpr__Group_2__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4364:1: rule__PrePrimaryExpr__Group_2__1 : rule__PrePrimaryExpr__Group_2__1__Impl ;
    public final void rule__PrePrimaryExpr__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4368:1: ( rule__PrePrimaryExpr__Group_2__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4369:2: rule__PrePrimaryExpr__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__PrePrimaryExpr__Group_2__1__Impl_in_rule__PrePrimaryExpr__Group_2__18722);
            rule__PrePrimaryExpr__Group_2__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PrePrimaryExpr__Group_2__1


    // $ANTLR start rule__PrePrimaryExpr__Group_2__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4375:1: rule__PrePrimaryExpr__Group_2__1__Impl : ( ( rule__PrePrimaryExpr__NAssignment_2_1 ) ) ;
    public final void rule__PrePrimaryExpr__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4379:1: ( ( ( rule__PrePrimaryExpr__NAssignment_2_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4380:1: ( ( rule__PrePrimaryExpr__NAssignment_2_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4380:1: ( ( rule__PrePrimaryExpr__NAssignment_2_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4381:1: ( rule__PrePrimaryExpr__NAssignment_2_1 )
            {
             before(grammarAccess.getPrePrimaryExprAccess().getNAssignment_2_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4382:1: ( rule__PrePrimaryExpr__NAssignment_2_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4382:2: rule__PrePrimaryExpr__NAssignment_2_1
            {
            pushFollow(FOLLOW_rule__PrePrimaryExpr__NAssignment_2_1_in_rule__PrePrimaryExpr__Group_2__1__Impl8749);
            rule__PrePrimaryExpr__NAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getPrePrimaryExprAccess().getNAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PrePrimaryExpr__Group_2__1__Impl


    // $ANTLR start rule__TerminalExpression__Group_0__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4396:1: rule__TerminalExpression__Group_0__0 : rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1 ;
    public final void rule__TerminalExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4400:1: ( rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4401:2: rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_0__0__Impl_in_rule__TerminalExpression__Group_0__08783);
            rule__TerminalExpression__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_0__1_in_rule__TerminalExpression__Group_0__08786);
            rule__TerminalExpression__Group_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__Group_0__0


    // $ANTLR start rule__TerminalExpression__Group_0__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4408:1: rule__TerminalExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4412:1: ( ( () ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4413:1: ( () )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4413:1: ( () )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4414:1: ()
            {
             before(grammarAccess.getTerminalExpressionAccess().getIntLiteralAction_0_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4415:1: ()
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4417:1: 
            {
            }

             after(grammarAccess.getTerminalExpressionAccess().getIntLiteralAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__Group_0__0__Impl


    // $ANTLR start rule__TerminalExpression__Group_0__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4427:1: rule__TerminalExpression__Group_0__1 : rule__TerminalExpression__Group_0__1__Impl ;
    public final void rule__TerminalExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4431:1: ( rule__TerminalExpression__Group_0__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4432:2: rule__TerminalExpression__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_0__1__Impl_in_rule__TerminalExpression__Group_0__18844);
            rule__TerminalExpression__Group_0__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__Group_0__1


    // $ANTLR start rule__TerminalExpression__Group_0__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4438:1: rule__TerminalExpression__Group_0__1__Impl : ( ( rule__TerminalExpression__ValueAssignment_0_1 ) ) ;
    public final void rule__TerminalExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4442:1: ( ( ( rule__TerminalExpression__ValueAssignment_0_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4443:1: ( ( rule__TerminalExpression__ValueAssignment_0_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4443:1: ( ( rule__TerminalExpression__ValueAssignment_0_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4444:1: ( rule__TerminalExpression__ValueAssignment_0_1 )
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_0_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4445:1: ( rule__TerminalExpression__ValueAssignment_0_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4445:2: rule__TerminalExpression__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__ValueAssignment_0_1_in_rule__TerminalExpression__Group_0__1__Impl8871);
            rule__TerminalExpression__ValueAssignment_0_1();
            _fsp--;


            }

             after(grammarAccess.getTerminalExpressionAccess().getValueAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__Group_0__1__Impl


    // $ANTLR start rule__TerminalExpression__Group_1__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4459:1: rule__TerminalExpression__Group_1__0 : rule__TerminalExpression__Group_1__0__Impl rule__TerminalExpression__Group_1__1 ;
    public final void rule__TerminalExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4463:1: ( rule__TerminalExpression__Group_1__0__Impl rule__TerminalExpression__Group_1__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4464:2: rule__TerminalExpression__Group_1__0__Impl rule__TerminalExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_1__0__Impl_in_rule__TerminalExpression__Group_1__08905);
            rule__TerminalExpression__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_1__1_in_rule__TerminalExpression__Group_1__08908);
            rule__TerminalExpression__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__Group_1__0


    // $ANTLR start rule__TerminalExpression__Group_1__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4471:1: rule__TerminalExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4475:1: ( ( () ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4476:1: ( () )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4476:1: ( () )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4477:1: ()
            {
             before(grammarAccess.getTerminalExpressionAccess().getBooleanLiteralAction_1_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4478:1: ()
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4480:1: 
            {
            }

             after(grammarAccess.getTerminalExpressionAccess().getBooleanLiteralAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__Group_1__0__Impl


    // $ANTLR start rule__TerminalExpression__Group_1__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4490:1: rule__TerminalExpression__Group_1__1 : rule__TerminalExpression__Group_1__1__Impl ;
    public final void rule__TerminalExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4494:1: ( rule__TerminalExpression__Group_1__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4495:2: rule__TerminalExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_1__1__Impl_in_rule__TerminalExpression__Group_1__18966);
            rule__TerminalExpression__Group_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__Group_1__1


    // $ANTLR start rule__TerminalExpression__Group_1__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4501:1: rule__TerminalExpression__Group_1__1__Impl : ( ( rule__TerminalExpression__ValueAssignment_1_1 ) ) ;
    public final void rule__TerminalExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4505:1: ( ( ( rule__TerminalExpression__ValueAssignment_1_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4506:1: ( ( rule__TerminalExpression__ValueAssignment_1_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4506:1: ( ( rule__TerminalExpression__ValueAssignment_1_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4507:1: ( rule__TerminalExpression__ValueAssignment_1_1 )
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_1_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4508:1: ( rule__TerminalExpression__ValueAssignment_1_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4508:2: rule__TerminalExpression__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__ValueAssignment_1_1_in_rule__TerminalExpression__Group_1__1__Impl8993);
            rule__TerminalExpression__ValueAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getTerminalExpressionAccess().getValueAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__Group_1__1__Impl


    // $ANTLR start rule__TerminalExpression__Group_2__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4522:1: rule__TerminalExpression__Group_2__0 : rule__TerminalExpression__Group_2__0__Impl rule__TerminalExpression__Group_2__1 ;
    public final void rule__TerminalExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4526:1: ( rule__TerminalExpression__Group_2__0__Impl rule__TerminalExpression__Group_2__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4527:2: rule__TerminalExpression__Group_2__0__Impl rule__TerminalExpression__Group_2__1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_2__0__Impl_in_rule__TerminalExpression__Group_2__09027);
            rule__TerminalExpression__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_2__1_in_rule__TerminalExpression__Group_2__09030);
            rule__TerminalExpression__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__Group_2__0


    // $ANTLR start rule__TerminalExpression__Group_2__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4534:1: rule__TerminalExpression__Group_2__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4538:1: ( ( () ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4539:1: ( () )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4539:1: ( () )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4540:1: ()
            {
             before(grammarAccess.getTerminalExpressionAccess().getArgumentAction_2_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4541:1: ()
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4543:1: 
            {
            }

             after(grammarAccess.getTerminalExpressionAccess().getArgumentAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__Group_2__0__Impl


    // $ANTLR start rule__TerminalExpression__Group_2__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4553:1: rule__TerminalExpression__Group_2__1 : rule__TerminalExpression__Group_2__1__Impl ;
    public final void rule__TerminalExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4557:1: ( rule__TerminalExpression__Group_2__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4558:2: rule__TerminalExpression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_2__1__Impl_in_rule__TerminalExpression__Group_2__19088);
            rule__TerminalExpression__Group_2__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__Group_2__1


    // $ANTLR start rule__TerminalExpression__Group_2__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4564:1: rule__TerminalExpression__Group_2__1__Impl : ( ( rule__TerminalExpression__ValueAssignment_2_1 ) ) ;
    public final void rule__TerminalExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4568:1: ( ( ( rule__TerminalExpression__ValueAssignment_2_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4569:1: ( ( rule__TerminalExpression__ValueAssignment_2_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4569:1: ( ( rule__TerminalExpression__ValueAssignment_2_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4570:1: ( rule__TerminalExpression__ValueAssignment_2_1 )
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_2_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4571:1: ( rule__TerminalExpression__ValueAssignment_2_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4571:2: rule__TerminalExpression__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__ValueAssignment_2_1_in_rule__TerminalExpression__Group_2__1__Impl9115);
            rule__TerminalExpression__ValueAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getTerminalExpressionAccess().getValueAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__Group_2__1__Impl


    // $ANTLR start rule__ArgumentDiagram__NameAssignment_0_1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4586:1: rule__ArgumentDiagram__NameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__ArgumentDiagram__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4590:1: ( ( RULE_ID ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4591:1: ( RULE_ID )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4591:1: ( RULE_ID )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4592:1: RULE_ID
            {
             before(grammarAccess.getArgumentDiagramAccess().getNameIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ArgumentDiagram__NameAssignment_0_19154); 
             after(grammarAccess.getArgumentDiagramAccess().getNameIDTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ArgumentDiagram__NameAssignment_0_1


    // $ANTLR start rule__ArgumentDiagram__NodesAssignment_1_0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4601:1: rule__ArgumentDiagram__NodesAssignment_1_0 : ( ruleArgument ) ;
    public final void rule__ArgumentDiagram__NodesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4605:1: ( ( ruleArgument ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4606:1: ( ruleArgument )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4606:1: ( ruleArgument )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4607:1: ruleArgument
            {
             before(grammarAccess.getArgumentDiagramAccess().getNodesArgumentParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleArgument_in_rule__ArgumentDiagram__NodesAssignment_1_09185);
            ruleArgument();
            _fsp--;

             after(grammarAccess.getArgumentDiagramAccess().getNodesArgumentParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ArgumentDiagram__NodesAssignment_1_0


    // $ANTLR start rule__ArgumentDiagram__LinksAssignment_1_1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4616:1: rule__ArgumentDiagram__LinksAssignment_1_1 : ( ruleLink ) ;
    public final void rule__ArgumentDiagram__LinksAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4620:1: ( ( ruleLink ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4621:1: ( ruleLink )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4621:1: ( ruleLink )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4622:1: ruleLink
            {
             before(grammarAccess.getArgumentDiagramAccess().getLinksLinkParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleLink_in_rule__ArgumentDiagram__LinksAssignment_1_19216);
            ruleLink();
            _fsp--;

             after(grammarAccess.getArgumentDiagramAccess().getLinksLinkParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ArgumentDiagram__LinksAssignment_1_1


    // $ANTLR start rule__Rebuts__FromAssignment_0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4631:1: rule__Rebuts__FromAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Rebuts__FromAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4635:1: ( ( ( RULE_ID ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4636:1: ( ( RULE_ID ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4636:1: ( ( RULE_ID ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4637:1: ( RULE_ID )
            {
             before(grammarAccess.getRebutsAccess().getFromArgumentCrossReference_0_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4638:1: ( RULE_ID )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4639:1: RULE_ID
            {
             before(grammarAccess.getRebutsAccess().getFromArgumentIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Rebuts__FromAssignment_09251); 
             after(grammarAccess.getRebutsAccess().getFromArgumentIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getRebutsAccess().getFromArgumentCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Rebuts__FromAssignment_0


    // $ANTLR start rule__Rebuts__ToAssignment_2
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4650:1: rule__Rebuts__ToAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Rebuts__ToAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4654:1: ( ( ( RULE_ID ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4655:1: ( ( RULE_ID ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4655:1: ( ( RULE_ID ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4656:1: ( RULE_ID )
            {
             before(grammarAccess.getRebutsAccess().getToArgumentCrossReference_2_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4657:1: ( RULE_ID )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4658:1: RULE_ID
            {
             before(grammarAccess.getRebutsAccess().getToArgumentIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Rebuts__ToAssignment_29290); 
             after(grammarAccess.getRebutsAccess().getToArgumentIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getRebutsAccess().getToArgumentCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Rebuts__ToAssignment_2


    // $ANTLR start rule__Rebuts__OriginAssignment_4
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4669:1: rule__Rebuts__OriginAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Rebuts__OriginAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4673:1: ( ( ( RULE_ID ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4674:1: ( ( RULE_ID ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4674:1: ( ( RULE_ID ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4675:1: ( RULE_ID )
            {
             before(grammarAccess.getRebutsAccess().getOriginArgumentCrossReference_4_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4676:1: ( RULE_ID )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4677:1: RULE_ID
            {
             before(grammarAccess.getRebutsAccess().getOriginArgumentIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Rebuts__OriginAssignment_49329); 
             after(grammarAccess.getRebutsAccess().getOriginArgumentIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getRebutsAccess().getOriginArgumentCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Rebuts__OriginAssignment_4


    // $ANTLR start rule__Mitigates__FromAssignment_0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4688:1: rule__Mitigates__FromAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Mitigates__FromAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4692:1: ( ( ( RULE_ID ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4693:1: ( ( RULE_ID ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4693:1: ( ( RULE_ID ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4694:1: ( RULE_ID )
            {
             before(grammarAccess.getMitigatesAccess().getFromArgumentCrossReference_0_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4695:1: ( RULE_ID )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4696:1: RULE_ID
            {
             before(grammarAccess.getMitigatesAccess().getFromArgumentIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Mitigates__FromAssignment_09368); 
             after(grammarAccess.getMitigatesAccess().getFromArgumentIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getMitigatesAccess().getFromArgumentCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mitigates__FromAssignment_0


    // $ANTLR start rule__Mitigates__ToAssignment_2
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4707:1: rule__Mitigates__ToAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Mitigates__ToAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4711:1: ( ( ( RULE_ID ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4712:1: ( ( RULE_ID ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4712:1: ( ( RULE_ID ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4713:1: ( RULE_ID )
            {
             before(grammarAccess.getMitigatesAccess().getToArgumentCrossReference_2_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4714:1: ( RULE_ID )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4715:1: RULE_ID
            {
             before(grammarAccess.getMitigatesAccess().getToArgumentIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Mitigates__ToAssignment_29407); 
             after(grammarAccess.getMitigatesAccess().getToArgumentIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getMitigatesAccess().getToArgumentCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mitigates__ToAssignment_2


    // $ANTLR start rule__Mitigates__RebuttalAssignment_4
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4726:1: rule__Mitigates__RebuttalAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Mitigates__RebuttalAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4730:1: ( ( ( RULE_ID ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4731:1: ( ( RULE_ID ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4731:1: ( ( RULE_ID ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4732:1: ( RULE_ID )
            {
             before(grammarAccess.getMitigatesAccess().getRebuttalArgumentCrossReference_4_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4733:1: ( RULE_ID )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4734:1: RULE_ID
            {
             before(grammarAccess.getMitigatesAccess().getRebuttalArgumentIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Mitigates__RebuttalAssignment_49446); 
             after(grammarAccess.getMitigatesAccess().getRebuttalArgumentIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getMitigatesAccess().getRebuttalArgumentCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mitigates__RebuttalAssignment_4


    // $ANTLR start rule__Argument__NameAssignment_0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4745:1: rule__Argument__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Argument__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4749:1: ( ( RULE_ID ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4750:1: ( RULE_ID )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4750:1: ( RULE_ID )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4751:1: RULE_ID
            {
             before(grammarAccess.getArgumentAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Argument__NameAssignment_09481); 
             after(grammarAccess.getArgumentAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__NameAssignment_0


    // $ANTLR start rule__Argument__DescriptionAssignment_2
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4760:1: rule__Argument__DescriptionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Argument__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4764:1: ( ( RULE_STRING ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4765:1: ( RULE_STRING )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4765:1: ( RULE_STRING )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4766:1: RULE_STRING
            {
             before(grammarAccess.getArgumentAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Argument__DescriptionAssignment_29512); 
             after(grammarAccess.getArgumentAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__DescriptionAssignment_2


    // $ANTLR start rule__Argument__RoundAssignment_3_1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4775:1: rule__Argument__RoundAssignment_3_1 : ( RULE_INT ) ;
    public final void rule__Argument__RoundAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4779:1: ( ( RULE_INT ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4780:1: ( RULE_INT )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4780:1: ( RULE_INT )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4781:1: RULE_INT
            {
             before(grammarAccess.getArgumentAccess().getRoundINTTerminalRuleCall_3_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Argument__RoundAssignment_3_19543); 
             after(grammarAccess.getArgumentAccess().getRoundINTTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__RoundAssignment_3_1


    // $ANTLR start rule__Argument__OriginAssignment_4_1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4790:1: rule__Argument__OriginAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Argument__OriginAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4794:1: ( ( ( RULE_ID ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4795:1: ( ( RULE_ID ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4795:1: ( ( RULE_ID ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4796:1: ( RULE_ID )
            {
             before(grammarAccess.getArgumentAccess().getOriginArgumentCrossReference_4_1_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4797:1: ( RULE_ID )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4798:1: RULE_ID
            {
             before(grammarAccess.getArgumentAccess().getOriginArgumentIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Argument__OriginAssignment_4_19578); 
             after(grammarAccess.getArgumentAccess().getOriginArgumentIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getArgumentAccess().getOriginArgumentCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__OriginAssignment_4_1


    // $ANTLR start rule__Argument__ExprAssignment_5_1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4809:1: rule__Argument__ExprAssignment_5_1 : ( ruleExpression ) ;
    public final void rule__Argument__ExprAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4813:1: ( ( ruleExpression ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4814:1: ( ruleExpression )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4814:1: ( ruleExpression )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4815:1: ruleExpression
            {
             before(grammarAccess.getArgumentAccess().getExprExpressionParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__Argument__ExprAssignment_5_19613);
            ruleExpression();
            _fsp--;

             after(grammarAccess.getArgumentAccess().getExprExpressionParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__ExprAssignment_5_1


    // $ANTLR start rule__Argument__ForegroundAssignment_6_1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4824:1: rule__Argument__ForegroundAssignment_6_1 : ( RULE_STRING ) ;
    public final void rule__Argument__ForegroundAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4828:1: ( ( RULE_STRING ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4829:1: ( RULE_STRING )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4829:1: ( RULE_STRING )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4830:1: RULE_STRING
            {
             before(grammarAccess.getArgumentAccess().getForegroundSTRINGTerminalRuleCall_6_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Argument__ForegroundAssignment_6_19644); 
             after(grammarAccess.getArgumentAccess().getForegroundSTRINGTerminalRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__ForegroundAssignment_6_1


    // $ANTLR start rule__Argument__BackgroundAssignment_7_1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4839:1: rule__Argument__BackgroundAssignment_7_1 : ( RULE_STRING ) ;
    public final void rule__Argument__BackgroundAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4843:1: ( ( RULE_STRING ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4844:1: ( RULE_STRING )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4844:1: ( RULE_STRING )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4845:1: RULE_STRING
            {
             before(grammarAccess.getArgumentAccess().getBackgroundSTRINGTerminalRuleCall_7_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Argument__BackgroundAssignment_7_19675); 
             after(grammarAccess.getArgumentAccess().getBackgroundSTRINGTerminalRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__BackgroundAssignment_7_1


    // $ANTLR start rule__Argument__ShapeAssignment_8_1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4854:1: rule__Argument__ShapeAssignment_8_1 : ( RULE_STRING ) ;
    public final void rule__Argument__ShapeAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4858:1: ( ( RULE_STRING ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4859:1: ( RULE_STRING )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4859:1: ( RULE_STRING )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4860:1: RULE_STRING
            {
             before(grammarAccess.getArgumentAccess().getShapeSTRINGTerminalRuleCall_8_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Argument__ShapeAssignment_8_19706); 
             after(grammarAccess.getArgumentAccess().getShapeSTRINGTerminalRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__ShapeAssignment_8_1


    // $ANTLR start rule__Argument__ImageAssignment_9_1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4869:1: rule__Argument__ImageAssignment_9_1 : ( RULE_STRING ) ;
    public final void rule__Argument__ImageAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4873:1: ( ( RULE_STRING ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4874:1: ( RULE_STRING )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4874:1: ( RULE_STRING )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4875:1: RULE_STRING
            {
             before(grammarAccess.getArgumentAccess().getImageSTRINGTerminalRuleCall_9_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Argument__ImageAssignment_9_19737); 
             after(grammarAccess.getArgumentAccess().getImageSTRINGTerminalRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__ImageAssignment_9_1


    // $ANTLR start rule__Argument__GroundsAssignment_10_1_1_1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4884:1: rule__Argument__GroundsAssignment_10_1_1_1 : ( ruleArgument ) ;
    public final void rule__Argument__GroundsAssignment_10_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4888:1: ( ( ruleArgument ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4889:1: ( ruleArgument )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4889:1: ( ruleArgument )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4890:1: ruleArgument
            {
             before(grammarAccess.getArgumentAccess().getGroundsArgumentParserRuleCall_10_1_1_1_0()); 
            pushFollow(FOLLOW_ruleArgument_in_rule__Argument__GroundsAssignment_10_1_1_19768);
            ruleArgument();
            _fsp--;

             after(grammarAccess.getArgumentAccess().getGroundsArgumentParserRuleCall_10_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__GroundsAssignment_10_1_1_1


    // $ANTLR start rule__Argument__WarrantsAssignment_10_2_1_1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4899:1: rule__Argument__WarrantsAssignment_10_2_1_1 : ( ruleArgument ) ;
    public final void rule__Argument__WarrantsAssignment_10_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4903:1: ( ( ruleArgument ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4904:1: ( ruleArgument )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4904:1: ( ruleArgument )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4905:1: ruleArgument
            {
             before(grammarAccess.getArgumentAccess().getWarrantsArgumentParserRuleCall_10_2_1_1_0()); 
            pushFollow(FOLLOW_ruleArgument_in_rule__Argument__WarrantsAssignment_10_2_1_19799);
            ruleArgument();
            _fsp--;

             after(grammarAccess.getArgumentAccess().getWarrantsArgumentParserRuleCall_10_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__WarrantsAssignment_10_2_1_1


    // $ANTLR start rule__Expression__AssignAssignment
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4914:1: rule__Expression__AssignAssignment : ( ruleAssignmentOp ) ;
    public final void rule__Expression__AssignAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4918:1: ( ( ruleAssignmentOp ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4919:1: ( ruleAssignmentOp )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4919:1: ( ruleAssignmentOp )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4920:1: ruleAssignmentOp
            {
             before(grammarAccess.getExpressionAccess().getAssignAssignmentOpParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAssignmentOp_in_rule__Expression__AssignAssignment9830);
            ruleAssignmentOp();
            _fsp--;

             after(grammarAccess.getExpressionAccess().getAssignAssignmentOpParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Expression__AssignAssignment


    // $ANTLR start rule__AssignmentOp__AopAssignment_1_0_0_1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4929:1: rule__AssignmentOp__AopAssignment_1_0_0_1 : ( ( '->' ) ) ;
    public final void rule__AssignmentOp__AopAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4933:1: ( ( ( '->' ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4934:1: ( ( '->' ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4934:1: ( ( '->' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4935:1: ( '->' )
            {
             before(grammarAccess.getAssignmentOpAccess().getAopHyphenMinusGreaterThanSignKeyword_1_0_0_1_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4936:1: ( '->' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4937:1: '->'
            {
             before(grammarAccess.getAssignmentOpAccess().getAopHyphenMinusGreaterThanSignKeyword_1_0_0_1_0()); 
            match(input,35,FOLLOW_35_in_rule__AssignmentOp__AopAssignment_1_0_0_19866); 
             after(grammarAccess.getAssignmentOpAccess().getAopHyphenMinusGreaterThanSignKeyword_1_0_0_1_0()); 

            }

             after(grammarAccess.getAssignmentOpAccess().getAopHyphenMinusGreaterThanSignKeyword_1_0_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AssignmentOp__AopAssignment_1_0_0_1


    // $ANTLR start rule__AssignmentOp__AopAssignment_1_0_1_1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4952:1: rule__AssignmentOp__AopAssignment_1_0_1_1 : ( ( '<->' ) ) ;
    public final void rule__AssignmentOp__AopAssignment_1_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4956:1: ( ( ( '<->' ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4957:1: ( ( '<->' ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4957:1: ( ( '<->' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4958:1: ( '<->' )
            {
             before(grammarAccess.getAssignmentOpAccess().getAopLessThanSignHyphenMinusGreaterThanSignKeyword_1_0_1_1_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4959:1: ( '<->' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4960:1: '<->'
            {
             before(grammarAccess.getAssignmentOpAccess().getAopLessThanSignHyphenMinusGreaterThanSignKeyword_1_0_1_1_0()); 
            match(input,36,FOLLOW_36_in_rule__AssignmentOp__AopAssignment_1_0_1_19910); 
             after(grammarAccess.getAssignmentOpAccess().getAopLessThanSignHyphenMinusGreaterThanSignKeyword_1_0_1_1_0()); 

            }

             after(grammarAccess.getAssignmentOpAccess().getAopLessThanSignHyphenMinusGreaterThanSignKeyword_1_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AssignmentOp__AopAssignment_1_0_1_1


    // $ANTLR start rule__AssignmentOp__RightAssignment_1_1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4975:1: rule__AssignmentOp__RightAssignment_1_1 : ( ruleOrExp ) ;
    public final void rule__AssignmentOp__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4979:1: ( ( ruleOrExp ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4980:1: ( ruleOrExp )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4980:1: ( ruleOrExp )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4981:1: ruleOrExp
            {
             before(grammarAccess.getAssignmentOpAccess().getRightOrExpParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleOrExp_in_rule__AssignmentOp__RightAssignment_1_19949);
            ruleOrExp();
            _fsp--;

             after(grammarAccess.getAssignmentOpAccess().getRightOrExpParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AssignmentOp__RightAssignment_1_1


    // $ANTLR start rule__OrExp__Or_opAssignment_1_1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4990:1: rule__OrExp__Or_opAssignment_1_1 : ( ( '|' ) ) ;
    public final void rule__OrExp__Or_opAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4994:1: ( ( ( '|' ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4995:1: ( ( '|' ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4995:1: ( ( '|' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4996:1: ( '|' )
            {
             before(grammarAccess.getOrExpAccess().getOr_opVerticalLineKeyword_1_1_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4997:1: ( '|' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4998:1: '|'
            {
             before(grammarAccess.getOrExpAccess().getOr_opVerticalLineKeyword_1_1_0()); 
            match(input,37,FOLLOW_37_in_rule__OrExp__Or_opAssignment_1_19985); 
             after(grammarAccess.getOrExpAccess().getOr_opVerticalLineKeyword_1_1_0()); 

            }

             after(grammarAccess.getOrExpAccess().getOr_opVerticalLineKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OrExp__Or_opAssignment_1_1


    // $ANTLR start rule__OrExp__RightAssignment_1_2
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5013:1: rule__OrExp__RightAssignment_1_2 : ( ruleAndExp ) ;
    public final void rule__OrExp__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5017:1: ( ( ruleAndExp ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5018:1: ( ruleAndExp )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5018:1: ( ruleAndExp )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5019:1: ruleAndExp
            {
             before(grammarAccess.getOrExpAccess().getRightAndExpParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleAndExp_in_rule__OrExp__RightAssignment_1_210024);
            ruleAndExp();
            _fsp--;

             after(grammarAccess.getOrExpAccess().getRightAndExpParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OrExp__RightAssignment_1_2


    // $ANTLR start rule__AndExp__And_opAssignment_1_1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5028:1: rule__AndExp__And_opAssignment_1_1 : ( ( '&' ) ) ;
    public final void rule__AndExp__And_opAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5032:1: ( ( ( '&' ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5033:1: ( ( '&' ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5033:1: ( ( '&' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5034:1: ( '&' )
            {
             before(grammarAccess.getAndExpAccess().getAnd_opAmpersandKeyword_1_1_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5035:1: ( '&' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5036:1: '&'
            {
             before(grammarAccess.getAndExpAccess().getAnd_opAmpersandKeyword_1_1_0()); 
            match(input,38,FOLLOW_38_in_rule__AndExp__And_opAssignment_1_110060); 
             after(grammarAccess.getAndExpAccess().getAnd_opAmpersandKeyword_1_1_0()); 

            }

             after(grammarAccess.getAndExpAccess().getAnd_opAmpersandKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AndExp__And_opAssignment_1_1


    // $ANTLR start rule__AndExp__RightAssignment_1_2
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5051:1: rule__AndExp__RightAssignment_1_2 : ( ruleRelational ) ;
    public final void rule__AndExp__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5055:1: ( ( ruleRelational ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5056:1: ( ruleRelational )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5056:1: ( ruleRelational )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5057:1: ruleRelational
            {
             before(grammarAccess.getAndExpAccess().getRightRelationalParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleRelational_in_rule__AndExp__RightAssignment_1_210099);
            ruleRelational();
            _fsp--;

             after(grammarAccess.getAndExpAccess().getRightRelationalParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AndExp__RightAssignment_1_2


    // $ANTLR start rule__Relational__Rel_opAssignment_1_0_0_1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5066:1: rule__Relational__Rel_opAssignment_1_0_0_1 : ( ( '!=' ) ) ;
    public final void rule__Relational__Rel_opAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5070:1: ( ( ( '!=' ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5071:1: ( ( '!=' ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5071:1: ( ( '!=' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5072:1: ( '!=' )
            {
             before(grammarAccess.getRelationalAccess().getRel_opExclamationMarkEqualsSignKeyword_1_0_0_1_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5073:1: ( '!=' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5074:1: '!='
            {
             before(grammarAccess.getRelationalAccess().getRel_opExclamationMarkEqualsSignKeyword_1_0_0_1_0()); 
            match(input,39,FOLLOW_39_in_rule__Relational__Rel_opAssignment_1_0_0_110135); 
             after(grammarAccess.getRelationalAccess().getRel_opExclamationMarkEqualsSignKeyword_1_0_0_1_0()); 

            }

             after(grammarAccess.getRelationalAccess().getRel_opExclamationMarkEqualsSignKeyword_1_0_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Relational__Rel_opAssignment_1_0_0_1


    // $ANTLR start rule__Relational__Rel_opAssignment_1_0_1_1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5089:1: rule__Relational__Rel_opAssignment_1_0_1_1 : ( ( '==' ) ) ;
    public final void rule__Relational__Rel_opAssignment_1_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5093:1: ( ( ( '==' ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5094:1: ( ( '==' ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5094:1: ( ( '==' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5095:1: ( '==' )
            {
             before(grammarAccess.getRelationalAccess().getRel_opEqualsSignEqualsSignKeyword_1_0_1_1_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5096:1: ( '==' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5097:1: '=='
            {
             before(grammarAccess.getRelationalAccess().getRel_opEqualsSignEqualsSignKeyword_1_0_1_1_0()); 
            match(input,40,FOLLOW_40_in_rule__Relational__Rel_opAssignment_1_0_1_110179); 
             after(grammarAccess.getRelationalAccess().getRel_opEqualsSignEqualsSignKeyword_1_0_1_1_0()); 

            }

             after(grammarAccess.getRelationalAccess().getRel_opEqualsSignEqualsSignKeyword_1_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Relational__Rel_opAssignment_1_0_1_1


    // $ANTLR start rule__Relational__Rel_opAssignment_1_0_2_1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5112:1: rule__Relational__Rel_opAssignment_1_0_2_1 : ( ( '>=' ) ) ;
    public final void rule__Relational__Rel_opAssignment_1_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5116:1: ( ( ( '>=' ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5117:1: ( ( '>=' ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5117:1: ( ( '>=' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5118:1: ( '>=' )
            {
             before(grammarAccess.getRelationalAccess().getRel_opGreaterThanSignEqualsSignKeyword_1_0_2_1_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5119:1: ( '>=' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5120:1: '>='
            {
             before(grammarAccess.getRelationalAccess().getRel_opGreaterThanSignEqualsSignKeyword_1_0_2_1_0()); 
            match(input,41,FOLLOW_41_in_rule__Relational__Rel_opAssignment_1_0_2_110223); 
             after(grammarAccess.getRelationalAccess().getRel_opGreaterThanSignEqualsSignKeyword_1_0_2_1_0()); 

            }

             after(grammarAccess.getRelationalAccess().getRel_opGreaterThanSignEqualsSignKeyword_1_0_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Relational__Rel_opAssignment_1_0_2_1


    // $ANTLR start rule__Relational__Rel_opAssignment_1_0_3_1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5135:1: rule__Relational__Rel_opAssignment_1_0_3_1 : ( ( '<=' ) ) ;
    public final void rule__Relational__Rel_opAssignment_1_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5139:1: ( ( ( '<=' ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5140:1: ( ( '<=' ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5140:1: ( ( '<=' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5141:1: ( '<=' )
            {
             before(grammarAccess.getRelationalAccess().getRel_opLessThanSignEqualsSignKeyword_1_0_3_1_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5142:1: ( '<=' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5143:1: '<='
            {
             before(grammarAccess.getRelationalAccess().getRel_opLessThanSignEqualsSignKeyword_1_0_3_1_0()); 
            match(input,42,FOLLOW_42_in_rule__Relational__Rel_opAssignment_1_0_3_110267); 
             after(grammarAccess.getRelationalAccess().getRel_opLessThanSignEqualsSignKeyword_1_0_3_1_0()); 

            }

             after(grammarAccess.getRelationalAccess().getRel_opLessThanSignEqualsSignKeyword_1_0_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Relational__Rel_opAssignment_1_0_3_1


    // $ANTLR start rule__Relational__Rel_opAssignment_1_0_4_1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5158:1: rule__Relational__Rel_opAssignment_1_0_4_1 : ( ( '=' ) ) ;
    public final void rule__Relational__Rel_opAssignment_1_0_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5162:1: ( ( ( '=' ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5163:1: ( ( '=' ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5163:1: ( ( '=' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5164:1: ( '=' )
            {
             before(grammarAccess.getRelationalAccess().getRel_opEqualsSignKeyword_1_0_4_1_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5165:1: ( '=' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5166:1: '='
            {
             before(grammarAccess.getRelationalAccess().getRel_opEqualsSignKeyword_1_0_4_1_0()); 
            match(input,43,FOLLOW_43_in_rule__Relational__Rel_opAssignment_1_0_4_110311); 
             after(grammarAccess.getRelationalAccess().getRel_opEqualsSignKeyword_1_0_4_1_0()); 

            }

             after(grammarAccess.getRelationalAccess().getRel_opEqualsSignKeyword_1_0_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Relational__Rel_opAssignment_1_0_4_1


    // $ANTLR start rule__Relational__Rel_opAssignment_1_0_5_1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5181:1: rule__Relational__Rel_opAssignment_1_0_5_1 : ( ( '<' ) ) ;
    public final void rule__Relational__Rel_opAssignment_1_0_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5185:1: ( ( ( '<' ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5186:1: ( ( '<' ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5186:1: ( ( '<' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5187:1: ( '<' )
            {
             before(grammarAccess.getRelationalAccess().getRel_opLessThanSignKeyword_1_0_5_1_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5188:1: ( '<' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5189:1: '<'
            {
             before(grammarAccess.getRelationalAccess().getRel_opLessThanSignKeyword_1_0_5_1_0()); 
            match(input,44,FOLLOW_44_in_rule__Relational__Rel_opAssignment_1_0_5_110355); 
             after(grammarAccess.getRelationalAccess().getRel_opLessThanSignKeyword_1_0_5_1_0()); 

            }

             after(grammarAccess.getRelationalAccess().getRel_opLessThanSignKeyword_1_0_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Relational__Rel_opAssignment_1_0_5_1


    // $ANTLR start rule__Relational__Rel_opAssignment_1_0_6_1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5204:1: rule__Relational__Rel_opAssignment_1_0_6_1 : ( ( '>' ) ) ;
    public final void rule__Relational__Rel_opAssignment_1_0_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5208:1: ( ( ( '>' ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5209:1: ( ( '>' ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5209:1: ( ( '>' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5210:1: ( '>' )
            {
             before(grammarAccess.getRelationalAccess().getRel_opGreaterThanSignKeyword_1_0_6_1_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5211:1: ( '>' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5212:1: '>'
            {
             before(grammarAccess.getRelationalAccess().getRel_opGreaterThanSignKeyword_1_0_6_1_0()); 
            match(input,45,FOLLOW_45_in_rule__Relational__Rel_opAssignment_1_0_6_110399); 
             after(grammarAccess.getRelationalAccess().getRel_opGreaterThanSignKeyword_1_0_6_1_0()); 

            }

             after(grammarAccess.getRelationalAccess().getRel_opGreaterThanSignKeyword_1_0_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Relational__Rel_opAssignment_1_0_6_1


    // $ANTLR start rule__Relational__RightAssignment_1_1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5227:1: rule__Relational__RightAssignment_1_1 : ( ruleAddition ) ;
    public final void rule__Relational__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5231:1: ( ( ruleAddition ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5232:1: ( ruleAddition )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5232:1: ( ruleAddition )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5233:1: ruleAddition
            {
             before(grammarAccess.getRelationalAccess().getRightAdditionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleAddition_in_rule__Relational__RightAssignment_1_110438);
            ruleAddition();
            _fsp--;

             after(grammarAccess.getRelationalAccess().getRightAdditionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Relational__RightAssignment_1_1


    // $ANTLR start rule__Addition__Add_opAssignment_1_0_0_1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5242:1: rule__Addition__Add_opAssignment_1_0_0_1 : ( ( '+' ) ) ;
    public final void rule__Addition__Add_opAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5246:1: ( ( ( '+' ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5247:1: ( ( '+' ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5247:1: ( ( '+' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5248:1: ( '+' )
            {
             before(grammarAccess.getAdditionAccess().getAdd_opPlusSignKeyword_1_0_0_1_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5249:1: ( '+' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5250:1: '+'
            {
             before(grammarAccess.getAdditionAccess().getAdd_opPlusSignKeyword_1_0_0_1_0()); 
            match(input,46,FOLLOW_46_in_rule__Addition__Add_opAssignment_1_0_0_110474); 
             after(grammarAccess.getAdditionAccess().getAdd_opPlusSignKeyword_1_0_0_1_0()); 

            }

             after(grammarAccess.getAdditionAccess().getAdd_opPlusSignKeyword_1_0_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Addition__Add_opAssignment_1_0_0_1


    // $ANTLR start rule__Addition__Add_opAssignment_1_0_1_1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5265:1: rule__Addition__Add_opAssignment_1_0_1_1 : ( ( '-' ) ) ;
    public final void rule__Addition__Add_opAssignment_1_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5269:1: ( ( ( '-' ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5270:1: ( ( '-' ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5270:1: ( ( '-' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5271:1: ( '-' )
            {
             before(grammarAccess.getAdditionAccess().getAdd_opHyphenMinusKeyword_1_0_1_1_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5272:1: ( '-' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5273:1: '-'
            {
             before(grammarAccess.getAdditionAccess().getAdd_opHyphenMinusKeyword_1_0_1_1_0()); 
            match(input,34,FOLLOW_34_in_rule__Addition__Add_opAssignment_1_0_1_110518); 
             after(grammarAccess.getAdditionAccess().getAdd_opHyphenMinusKeyword_1_0_1_1_0()); 

            }

             after(grammarAccess.getAdditionAccess().getAdd_opHyphenMinusKeyword_1_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Addition__Add_opAssignment_1_0_1_1


    // $ANTLR start rule__Addition__RightAssignment_1_1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5288:1: rule__Addition__RightAssignment_1_1 : ( ruleMultiplication ) ;
    public final void rule__Addition__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5292:1: ( ( ruleMultiplication ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5293:1: ( ruleMultiplication )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5293:1: ( ruleMultiplication )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5294:1: ruleMultiplication
            {
             before(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleMultiplication_in_rule__Addition__RightAssignment_1_110557);
            ruleMultiplication();
            _fsp--;

             after(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Addition__RightAssignment_1_1


    // $ANTLR start rule__Multiplication__Mul_opAssignment_1_0_0_1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5303:1: rule__Multiplication__Mul_opAssignment_1_0_0_1 : ( ( '*' ) ) ;
    public final void rule__Multiplication__Mul_opAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5307:1: ( ( ( '*' ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5308:1: ( ( '*' ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5308:1: ( ( '*' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5309:1: ( '*' )
            {
             before(grammarAccess.getMultiplicationAccess().getMul_opAsteriskKeyword_1_0_0_1_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5310:1: ( '*' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5311:1: '*'
            {
             before(grammarAccess.getMultiplicationAccess().getMul_opAsteriskKeyword_1_0_0_1_0()); 
            match(input,47,FOLLOW_47_in_rule__Multiplication__Mul_opAssignment_1_0_0_110593); 
             after(grammarAccess.getMultiplicationAccess().getMul_opAsteriskKeyword_1_0_0_1_0()); 

            }

             after(grammarAccess.getMultiplicationAccess().getMul_opAsteriskKeyword_1_0_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Multiplication__Mul_opAssignment_1_0_0_1


    // $ANTLR start rule__Multiplication__Mul_opAssignment_1_0_1_1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5326:1: rule__Multiplication__Mul_opAssignment_1_0_1_1 : ( ( '/' ) ) ;
    public final void rule__Multiplication__Mul_opAssignment_1_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5330:1: ( ( ( '/' ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5331:1: ( ( '/' ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5331:1: ( ( '/' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5332:1: ( '/' )
            {
             before(grammarAccess.getMultiplicationAccess().getMul_opSolidusKeyword_1_0_1_1_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5333:1: ( '/' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5334:1: '/'
            {
             before(grammarAccess.getMultiplicationAccess().getMul_opSolidusKeyword_1_0_1_1_0()); 
            match(input,48,FOLLOW_48_in_rule__Multiplication__Mul_opAssignment_1_0_1_110637); 
             after(grammarAccess.getMultiplicationAccess().getMul_opSolidusKeyword_1_0_1_1_0()); 

            }

             after(grammarAccess.getMultiplicationAccess().getMul_opSolidusKeyword_1_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Multiplication__Mul_opAssignment_1_0_1_1


    // $ANTLR start rule__Multiplication__RightAssignment_1_1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5349:1: rule__Multiplication__RightAssignment_1_1 : ( rulePower ) ;
    public final void rule__Multiplication__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5353:1: ( ( rulePower ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5354:1: ( rulePower )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5354:1: ( rulePower )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5355:1: rulePower
            {
             before(grammarAccess.getMultiplicationAccess().getRightPowerParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_rulePower_in_rule__Multiplication__RightAssignment_1_110676);
            rulePower();
            _fsp--;

             after(grammarAccess.getMultiplicationAccess().getRightPowerParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Multiplication__RightAssignment_1_1


    // $ANTLR start rule__Power__Pow_opAssignment_1_0_1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5364:1: rule__Power__Pow_opAssignment_1_0_1 : ( ( '^' ) ) ;
    public final void rule__Power__Pow_opAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5368:1: ( ( ( '^' ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5369:1: ( ( '^' ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5369:1: ( ( '^' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5370:1: ( '^' )
            {
             before(grammarAccess.getPowerAccess().getPow_opCircumflexAccentKeyword_1_0_1_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5371:1: ( '^' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5372:1: '^'
            {
             before(grammarAccess.getPowerAccess().getPow_opCircumflexAccentKeyword_1_0_1_0()); 
            match(input,49,FOLLOW_49_in_rule__Power__Pow_opAssignment_1_0_110712); 
             after(grammarAccess.getPowerAccess().getPow_opCircumflexAccentKeyword_1_0_1_0()); 

            }

             after(grammarAccess.getPowerAccess().getPow_opCircumflexAccentKeyword_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Power__Pow_opAssignment_1_0_1


    // $ANTLR start rule__Power__RightAssignment_1_1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5387:1: rule__Power__RightAssignment_1_1 : ( ruleUnaryExpr ) ;
    public final void rule__Power__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5391:1: ( ( ruleUnaryExpr ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5392:1: ( ruleUnaryExpr )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5392:1: ( ruleUnaryExpr )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5393:1: ruleUnaryExpr
            {
             before(grammarAccess.getPowerAccess().getRightUnaryExprParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleUnaryExpr_in_rule__Power__RightAssignment_1_110751);
            ruleUnaryExpr();
            _fsp--;

             after(grammarAccess.getPowerAccess().getRightUnaryExprParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Power__RightAssignment_1_1


    // $ANTLR start rule__UnaryExpr__UopAssignment_0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5402:1: rule__UnaryExpr__UopAssignment_0 : ( ruleUnaryOp ) ;
    public final void rule__UnaryExpr__UopAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5406:1: ( ( ruleUnaryOp ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5407:1: ( ruleUnaryOp )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5407:1: ( ruleUnaryOp )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5408:1: ruleUnaryOp
            {
             before(grammarAccess.getUnaryExprAccess().getUopUnaryOpEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleUnaryOp_in_rule__UnaryExpr__UopAssignment_010782);
            ruleUnaryOp();
            _fsp--;

             after(grammarAccess.getUnaryExprAccess().getUopUnaryOpEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnaryExpr__UopAssignment_0


    // $ANTLR start rule__UnaryExpr__RightAssignment_1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5417:1: rule__UnaryExpr__RightAssignment_1 : ( rulePrePrimaryExpr ) ;
    public final void rule__UnaryExpr__RightAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5421:1: ( ( rulePrePrimaryExpr ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5422:1: ( rulePrePrimaryExpr )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5422:1: ( rulePrePrimaryExpr )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5423:1: rulePrePrimaryExpr
            {
             before(grammarAccess.getUnaryExprAccess().getRightPrePrimaryExprParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePrePrimaryExpr_in_rule__UnaryExpr__RightAssignment_110813);
            rulePrePrimaryExpr();
            _fsp--;

             after(grammarAccess.getUnaryExprAccess().getRightPrePrimaryExprParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnaryExpr__RightAssignment_1


    // $ANTLR start rule__PrePrimaryExpr__NAssignment_2_1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5432:1: rule__PrePrimaryExpr__NAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__PrePrimaryExpr__NAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5436:1: ( ( RULE_INT ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5437:1: ( RULE_INT )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5437:1: ( RULE_INT )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5438:1: RULE_INT
            {
             before(grammarAccess.getPrePrimaryExprAccess().getNINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__PrePrimaryExpr__NAssignment_2_110844); 
             after(grammarAccess.getPrePrimaryExprAccess().getNINTTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PrePrimaryExpr__NAssignment_2_1


    // $ANTLR start rule__TerminalExpression__ValueAssignment_0_1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5447:1: rule__TerminalExpression__ValueAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__TerminalExpression__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5451:1: ( ( RULE_INT ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5452:1: ( RULE_INT )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5452:1: ( RULE_INT )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5453:1: RULE_INT
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueINTTerminalRuleCall_0_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__TerminalExpression__ValueAssignment_0_110875); 
             after(grammarAccess.getTerminalExpressionAccess().getValueINTTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__ValueAssignment_0_1


    // $ANTLR start rule__TerminalExpression__ValueAssignment_1_1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5462:1: rule__TerminalExpression__ValueAssignment_1_1 : ( RULE_BOOLEAN ) ;
    public final void rule__TerminalExpression__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5466:1: ( ( RULE_BOOLEAN ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5467:1: ( RULE_BOOLEAN )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5467:1: ( RULE_BOOLEAN )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5468:1: RULE_BOOLEAN
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueBOOLEANTerminalRuleCall_1_1_0()); 
            match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_rule__TerminalExpression__ValueAssignment_1_110906); 
             after(grammarAccess.getTerminalExpressionAccess().getValueBOOLEANTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__ValueAssignment_1_1


    // $ANTLR start rule__TerminalExpression__ValueAssignment_2_1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5477:1: rule__TerminalExpression__ValueAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__TerminalExpression__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5481:1: ( ( ( RULE_ID ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5482:1: ( ( RULE_ID ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5482:1: ( ( RULE_ID ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5483:1: ( RULE_ID )
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueArgumentCrossReference_2_1_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5484:1: ( RULE_ID )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5485:1: RULE_ID
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueArgumentIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TerminalExpression__ValueAssignment_2_110941); 
             after(grammarAccess.getTerminalExpressionAccess().getValueArgumentIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getTerminalExpressionAccess().getValueArgumentCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TerminalExpression__ValueAssignment_2_1


 

    public static final BitSet FOLLOW_ruleArgumentDiagram_in_entryRuleArgumentDiagram61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgumentDiagram68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArgumentDiagram__Group__0_in_ruleArgumentDiagram94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_entryRuleLink121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLink128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Alternatives_in_ruleLink154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRebuts_in_entryRuleRebuts181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRebuts188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rebuts__Group__0_in_ruleRebuts214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMitigates_in_entryRuleMitigates241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMitigates248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mitigates__Group__0_in_ruleMitigates274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_entryRuleArgument301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgument308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__0_in_ruleArgument334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__AssignAssignment_in_ruleExpression394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentOp_in_entryRuleAssignmentOp421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignmentOp428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Group__0_in_ruleAssignmentOp454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExp_in_entryRuleOrExp481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrExp488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExp__Group__0_in_ruleOrExp514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExp_in_entryRuleAndExp541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndExp548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExp__Group__0_in_ruleAndExp574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelational_in_entryRuleRelational601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelational608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group__0_in_ruleRelational634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_entryRuleAddition661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddition668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__0_in_ruleAddition694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_entryRuleMultiplication721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplication728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__0_in_ruleMultiplication754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePower_in_entryRulePower781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePower788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Power__Group__0_in_rulePower814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpr_in_entryRuleUnaryExpr841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryExpr848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpr__Group__0_in_ruleUnaryExpr874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrePrimaryExpr_in_entryRulePrePrimaryExpr901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrePrimaryExpr908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrePrimaryExpr__Alternatives_in_rulePrePrimaryExpr934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_entryRuleTerminalExpression961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminalExpression968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Alternatives_in_ruleTerminalExpression994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryOp__Alternatives_in_ruleUnaryOp1031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArgumentDiagram__NodesAssignment_1_0_in_rule__ArgumentDiagram__Alternatives_11066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArgumentDiagram__LinksAssignment_1_1_in_rule__ArgumentDiagram__Alternatives_11084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRebuts_in_rule__Link__Alternatives1117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMitigates_in_rule__Link__Alternatives1134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Group_1_0_0__0_in_rule__AssignmentOp__Alternatives_1_01166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Group_1_0_1__0_in_rule__AssignmentOp__Alternatives_1_01184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_0__0_in_rule__Relational__Alternatives_1_01217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_1__0_in_rule__Relational__Alternatives_1_01235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_2__0_in_rule__Relational__Alternatives_1_01253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_3__0_in_rule__Relational__Alternatives_1_01271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_4__0_in_rule__Relational__Alternatives_1_01289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_5__0_in_rule__Relational__Alternatives_1_01307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_6__0_in_rule__Relational__Alternatives_1_01325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_0__0_in_rule__Addition__Alternatives_1_01358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_1__0_in_rule__Addition__Alternatives_1_01376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_0__0_in_rule__Multiplication__Alternatives_1_01409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_1__0_in_rule__Multiplication__Alternatives_1_01427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_rule__PrePrimaryExpr__Alternatives1460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrePrimaryExpr__Group_1__0_in_rule__PrePrimaryExpr__Alternatives1477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrePrimaryExpr__Group_2__0_in_rule__PrePrimaryExpr__Alternatives1495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_0__0_in_rule__TerminalExpression__Alternatives1528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_1__0_in_rule__TerminalExpression__Alternatives1546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_2__0_in_rule__TerminalExpression__Alternatives1564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__UnaryOp__Alternatives1598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__UnaryOp__Alternatives1619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArgumentDiagram__Group__0__Impl_in_rule__ArgumentDiagram__Group__01652 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__ArgumentDiagram__Group__1_in_rule__ArgumentDiagram__Group__01655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArgumentDiagram__Group_0__0_in_rule__ArgumentDiagram__Group__0__Impl1682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArgumentDiagram__Group__1__Impl_in_rule__ArgumentDiagram__Group__11713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArgumentDiagram__Alternatives_1_in_rule__ArgumentDiagram__Group__1__Impl1740 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__ArgumentDiagram__Group_0__0__Impl_in_rule__ArgumentDiagram__Group_0__01775 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ArgumentDiagram__Group_0__1_in_rule__ArgumentDiagram__Group_0__01778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ArgumentDiagram__Group_0__0__Impl1806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArgumentDiagram__Group_0__1__Impl_in_rule__ArgumentDiagram__Group_0__11837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArgumentDiagram__NameAssignment_0_1_in_rule__ArgumentDiagram__Group_0__1__Impl1864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rebuts__Group__0__Impl_in_rule__Rebuts__Group__01898 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Rebuts__Group__1_in_rule__Rebuts__Group__01901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rebuts__FromAssignment_0_in_rule__Rebuts__Group__0__Impl1928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rebuts__Group__1__Impl_in_rule__Rebuts__Group__11958 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Rebuts__Group__2_in_rule__Rebuts__Group__11961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Rebuts__Group__1__Impl1989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rebuts__Group__2__Impl_in_rule__Rebuts__Group__22020 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Rebuts__Group__3_in_rule__Rebuts__Group__22023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rebuts__ToAssignment_2_in_rule__Rebuts__Group__2__Impl2050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rebuts__Group__3__Impl_in_rule__Rebuts__Group__32080 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Rebuts__Group__4_in_rule__Rebuts__Group__32083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Rebuts__Group__3__Impl2111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rebuts__Group__4__Impl_in_rule__Rebuts__Group__42142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rebuts__OriginAssignment_4_in_rule__Rebuts__Group__4__Impl2169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mitigates__Group__0__Impl_in_rule__Mitigates__Group__02209 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Mitigates__Group__1_in_rule__Mitigates__Group__02212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mitigates__FromAssignment_0_in_rule__Mitigates__Group__0__Impl2239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mitigates__Group__1__Impl_in_rule__Mitigates__Group__12269 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Mitigates__Group__2_in_rule__Mitigates__Group__12272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Mitigates__Group__1__Impl2300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mitigates__Group__2__Impl_in_rule__Mitigates__Group__22331 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Mitigates__Group__3_in_rule__Mitigates__Group__22334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mitigates__ToAssignment_2_in_rule__Mitigates__Group__2__Impl2361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mitigates__Group__3__Impl_in_rule__Mitigates__Group__32391 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Mitigates__Group__4_in_rule__Mitigates__Group__32394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Mitigates__Group__3__Impl2422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mitigates__Group__4__Impl_in_rule__Mitigates__Group__42453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mitigates__RebuttalAssignment_4_in_rule__Mitigates__Group__4__Impl2480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__0__Impl_in_rule__Argument__Group__02520 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_rule__Argument__Group__1_in_rule__Argument__Group__02523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__NameAssignment_0_in_rule__Argument__Group__0__Impl2550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__1__Impl_in_rule__Argument__Group__12580 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Argument__Group__2_in_rule__Argument__Group__12583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Argument__Group__1__Impl2612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__2__Impl_in_rule__Argument__Group__22645 = new BitSet(new long[]{0x000000000FF00002L});
    public static final BitSet FOLLOW_rule__Argument__Group__3_in_rule__Argument__Group__22648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__DescriptionAssignment_2_in_rule__Argument__Group__2__Impl2675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__3__Impl_in_rule__Argument__Group__32705 = new BitSet(new long[]{0x000000000FE00002L});
    public static final BitSet FOLLOW_rule__Argument__Group__4_in_rule__Argument__Group__32708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_3__0_in_rule__Argument__Group__3__Impl2735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__4__Impl_in_rule__Argument__Group__42766 = new BitSet(new long[]{0x000000000FC00002L});
    public static final BitSet FOLLOW_rule__Argument__Group__5_in_rule__Argument__Group__42769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_4__0_in_rule__Argument__Group__4__Impl2796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__5__Impl_in_rule__Argument__Group__52827 = new BitSet(new long[]{0x000000000F800002L});
    public static final BitSet FOLLOW_rule__Argument__Group__6_in_rule__Argument__Group__52830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_5__0_in_rule__Argument__Group__5__Impl2857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__6__Impl_in_rule__Argument__Group__62888 = new BitSet(new long[]{0x000000000F000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__7_in_rule__Argument__Group__62891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_6__0_in_rule__Argument__Group__6__Impl2918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__7__Impl_in_rule__Argument__Group__72949 = new BitSet(new long[]{0x000000000E000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__8_in_rule__Argument__Group__72952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_7__0_in_rule__Argument__Group__7__Impl2979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__8__Impl_in_rule__Argument__Group__83010 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__9_in_rule__Argument__Group__83013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_8__0_in_rule__Argument__Group__8__Impl3040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__9__Impl_in_rule__Argument__Group__93071 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__10_in_rule__Argument__Group__93074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_9__0_in_rule__Argument__Group__9__Impl3101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__10__Impl_in_rule__Argument__Group__103132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_10__0_in_rule__Argument__Group__10__Impl3159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_3__0__Impl_in_rule__Argument__Group_3__03212 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Argument__Group_3__1_in_rule__Argument__Group_3__03215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Argument__Group_3__0__Impl3243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_3__1__Impl_in_rule__Argument__Group_3__13274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__RoundAssignment_3_1_in_rule__Argument__Group_3__1__Impl3301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_4__0__Impl_in_rule__Argument__Group_4__03335 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Argument__Group_4__1_in_rule__Argument__Group_4__03338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Argument__Group_4__0__Impl3366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_4__1__Impl_in_rule__Argument__Group_4__13397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__OriginAssignment_4_1_in_rule__Argument__Group_4__1__Impl3424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_5__0__Impl_in_rule__Argument__Group_5__03458 = new BitSet(new long[]{0x00000005000060D0L});
    public static final BitSet FOLLOW_rule__Argument__Group_5__1_in_rule__Argument__Group_5__03461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Argument__Group_5__0__Impl3489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_5__1__Impl_in_rule__Argument__Group_5__13520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__ExprAssignment_5_1_in_rule__Argument__Group_5__1__Impl3547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_6__0__Impl_in_rule__Argument__Group_6__03581 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Argument__Group_6__1_in_rule__Argument__Group_6__03584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Argument__Group_6__0__Impl3612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_6__1__Impl_in_rule__Argument__Group_6__13643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__ForegroundAssignment_6_1_in_rule__Argument__Group_6__1__Impl3670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_7__0__Impl_in_rule__Argument__Group_7__03704 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Argument__Group_7__1_in_rule__Argument__Group_7__03707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Argument__Group_7__0__Impl3735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_7__1__Impl_in_rule__Argument__Group_7__13766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__BackgroundAssignment_7_1_in_rule__Argument__Group_7__1__Impl3793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_8__0__Impl_in_rule__Argument__Group_8__03827 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Argument__Group_8__1_in_rule__Argument__Group_8__03830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Argument__Group_8__0__Impl3858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_8__1__Impl_in_rule__Argument__Group_8__13889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__ShapeAssignment_8_1_in_rule__Argument__Group_8__1__Impl3916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_9__0__Impl_in_rule__Argument__Group_9__03950 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Argument__Group_9__1_in_rule__Argument__Group_9__03953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Argument__Group_9__0__Impl3981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_9__1__Impl_in_rule__Argument__Group_9__14012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__ImageAssignment_9_1_in_rule__Argument__Group_9__1__Impl4039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_10__0__Impl_in_rule__Argument__Group_10__04073 = new BitSet(new long[]{0x00000000B0000000L});
    public static final BitSet FOLLOW_rule__Argument__Group_10__1_in_rule__Argument__Group_10__04076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Argument__Group_10__0__Impl4104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_10__1__Impl_in_rule__Argument__Group_10__14135 = new BitSet(new long[]{0x0000000090000000L});
    public static final BitSet FOLLOW_rule__Argument__Group_10__2_in_rule__Argument__Group_10__14138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_10_1__0_in_rule__Argument__Group_10__1__Impl4165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_10__2__Impl_in_rule__Argument__Group_10__24196 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Argument__Group_10__3_in_rule__Argument__Group_10__24199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_10_2__0_in_rule__Argument__Group_10__2__Impl4226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_10__3__Impl_in_rule__Argument__Group_10__34257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Argument__Group_10__3__Impl4285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_10_1__0__Impl_in_rule__Argument__Group_10_1__04324 = new BitSet(new long[]{0x0000000040000012L});
    public static final BitSet FOLLOW_rule__Argument__Group_10_1__1_in_rule__Argument__Group_10_1__04327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Argument__Group_10_1__0__Impl4355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_10_1__1__Impl_in_rule__Argument__Group_10_1__14386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_10_1_1__0_in_rule__Argument__Group_10_1__1__Impl4413 = new BitSet(new long[]{0x0000000040000012L});
    public static final BitSet FOLLOW_rule__Argument__Group_10_1_1__0__Impl_in_rule__Argument__Group_10_1_1__04448 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Argument__Group_10_1_1__1_in_rule__Argument__Group_10_1_1__04451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Argument__Group_10_1_1__0__Impl4480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_10_1_1__1__Impl_in_rule__Argument__Group_10_1_1__14513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__GroundsAssignment_10_1_1_1_in_rule__Argument__Group_10_1_1__1__Impl4540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_10_2__0__Impl_in_rule__Argument__Group_10_2__04574 = new BitSet(new long[]{0x0000000040000012L});
    public static final BitSet FOLLOW_rule__Argument__Group_10_2__1_in_rule__Argument__Group_10_2__04577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Argument__Group_10_2__0__Impl4605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_10_2__1__Impl_in_rule__Argument__Group_10_2__14636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_10_2_1__0_in_rule__Argument__Group_10_2__1__Impl4663 = new BitSet(new long[]{0x0000000040000012L});
    public static final BitSet FOLLOW_rule__Argument__Group_10_2_1__0__Impl_in_rule__Argument__Group_10_2_1__04698 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Argument__Group_10_2_1__1_in_rule__Argument__Group_10_2_1__04701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Argument__Group_10_2_1__0__Impl4730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_10_2_1__1__Impl_in_rule__Argument__Group_10_2_1__14763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__WarrantsAssignment_10_2_1_1_in_rule__Argument__Group_10_2_1__1__Impl4790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Group__0__Impl_in_rule__AssignmentOp__Group__04824 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Group__1_in_rule__AssignmentOp__Group__04827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExp_in_rule__AssignmentOp__Group__0__Impl4854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Group__1__Impl_in_rule__AssignmentOp__Group__14883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Group_1__0_in_rule__AssignmentOp__Group__1__Impl4910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Group_1__0__Impl_in_rule__AssignmentOp__Group_1__04945 = new BitSet(new long[]{0x00000005000060D0L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Group_1__1_in_rule__AssignmentOp__Group_1__04948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Alternatives_1_0_in_rule__AssignmentOp__Group_1__0__Impl4975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Group_1__1__Impl_in_rule__AssignmentOp__Group_1__15005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentOp__RightAssignment_1_1_in_rule__AssignmentOp__Group_1__1__Impl5032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Group_1_0_0__0__Impl_in_rule__AssignmentOp__Group_1_0_0__05066 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Group_1_0_0__1_in_rule__AssignmentOp__Group_1_0_0__05069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Group_1_0_0__1__Impl_in_rule__AssignmentOp__Group_1_0_0__15127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentOp__AopAssignment_1_0_0_1_in_rule__AssignmentOp__Group_1_0_0__1__Impl5154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Group_1_0_1__0__Impl_in_rule__AssignmentOp__Group_1_0_1__05188 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Group_1_0_1__1_in_rule__AssignmentOp__Group_1_0_1__05191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Group_1_0_1__1__Impl_in_rule__AssignmentOp__Group_1_0_1__15249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentOp__AopAssignment_1_0_1_1_in_rule__AssignmentOp__Group_1_0_1__1__Impl5276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExp__Group__0__Impl_in_rule__OrExp__Group__05310 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_rule__OrExp__Group__1_in_rule__OrExp__Group__05313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExp_in_rule__OrExp__Group__0__Impl5340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExp__Group__1__Impl_in_rule__OrExp__Group__15369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExp__Group_1__0_in_rule__OrExp__Group__1__Impl5396 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_rule__OrExp__Group_1__0__Impl_in_rule__OrExp__Group_1__05431 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__OrExp__Group_1__1_in_rule__OrExp__Group_1__05434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExp__Group_1__1__Impl_in_rule__OrExp__Group_1__15492 = new BitSet(new long[]{0x00000005000060D0L});
    public static final BitSet FOLLOW_rule__OrExp__Group_1__2_in_rule__OrExp__Group_1__15495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExp__Or_opAssignment_1_1_in_rule__OrExp__Group_1__1__Impl5522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExp__Group_1__2__Impl_in_rule__OrExp__Group_1__25552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExp__RightAssignment_1_2_in_rule__OrExp__Group_1__2__Impl5579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExp__Group__0__Impl_in_rule__AndExp__Group__05615 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_rule__AndExp__Group__1_in_rule__AndExp__Group__05618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelational_in_rule__AndExp__Group__0__Impl5645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExp__Group__1__Impl_in_rule__AndExp__Group__15674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExp__Group_1__0_in_rule__AndExp__Group__1__Impl5701 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_rule__AndExp__Group_1__0__Impl_in_rule__AndExp__Group_1__05736 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__AndExp__Group_1__1_in_rule__AndExp__Group_1__05739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExp__Group_1__1__Impl_in_rule__AndExp__Group_1__15797 = new BitSet(new long[]{0x00000005000060D0L});
    public static final BitSet FOLLOW_rule__AndExp__Group_1__2_in_rule__AndExp__Group_1__15800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExp__And_opAssignment_1_1_in_rule__AndExp__Group_1__1__Impl5827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExp__Group_1__2__Impl_in_rule__AndExp__Group_1__25857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExp__RightAssignment_1_2_in_rule__AndExp__Group_1__2__Impl5884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group__0__Impl_in_rule__Relational__Group__05920 = new BitSet(new long[]{0x00003F8000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group__1_in_rule__Relational__Group__05923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_rule__Relational__Group__0__Impl5950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group__1__Impl_in_rule__Relational__Group__15979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1__0_in_rule__Relational__Group__1__Impl6006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1__0__Impl_in_rule__Relational__Group_1__06041 = new BitSet(new long[]{0x00000005000060D0L});
    public static final BitSet FOLLOW_rule__Relational__Group_1__1_in_rule__Relational__Group_1__06044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Alternatives_1_0_in_rule__Relational__Group_1__0__Impl6071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1__1__Impl_in_rule__Relational__Group_1__16101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__RightAssignment_1_1_in_rule__Relational__Group_1__1__Impl6128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_0__0__Impl_in_rule__Relational__Group_1_0_0__06162 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_0__1_in_rule__Relational__Group_1_0_0__06165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_0__1__Impl_in_rule__Relational__Group_1_0_0__16223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Rel_opAssignment_1_0_0_1_in_rule__Relational__Group_1_0_0__1__Impl6250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_1__0__Impl_in_rule__Relational__Group_1_0_1__06284 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_1__1_in_rule__Relational__Group_1_0_1__06287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_1__1__Impl_in_rule__Relational__Group_1_0_1__16345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Rel_opAssignment_1_0_1_1_in_rule__Relational__Group_1_0_1__1__Impl6372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_2__0__Impl_in_rule__Relational__Group_1_0_2__06406 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_2__1_in_rule__Relational__Group_1_0_2__06409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_2__1__Impl_in_rule__Relational__Group_1_0_2__16467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Rel_opAssignment_1_0_2_1_in_rule__Relational__Group_1_0_2__1__Impl6494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_3__0__Impl_in_rule__Relational__Group_1_0_3__06528 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_3__1_in_rule__Relational__Group_1_0_3__06531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_3__1__Impl_in_rule__Relational__Group_1_0_3__16589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Rel_opAssignment_1_0_3_1_in_rule__Relational__Group_1_0_3__1__Impl6616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_4__0__Impl_in_rule__Relational__Group_1_0_4__06650 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_4__1_in_rule__Relational__Group_1_0_4__06653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_4__1__Impl_in_rule__Relational__Group_1_0_4__16711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Rel_opAssignment_1_0_4_1_in_rule__Relational__Group_1_0_4__1__Impl6738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_5__0__Impl_in_rule__Relational__Group_1_0_5__06772 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_5__1_in_rule__Relational__Group_1_0_5__06775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_5__1__Impl_in_rule__Relational__Group_1_0_5__16833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Rel_opAssignment_1_0_5_1_in_rule__Relational__Group_1_0_5__1__Impl6860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_6__0__Impl_in_rule__Relational__Group_1_0_6__06894 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_6__1_in_rule__Relational__Group_1_0_6__06897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_6__1__Impl_in_rule__Relational__Group_1_0_6__16955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Rel_opAssignment_1_0_6_1_in_rule__Relational__Group_1_0_6__1__Impl6982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__0__Impl_in_rule__Addition__Group__07016 = new BitSet(new long[]{0x0000400400000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__1_in_rule__Addition__Group__07019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_rule__Addition__Group__0__Impl7046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__1__Impl_in_rule__Addition__Group__17075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__0_in_rule__Addition__Group__1__Impl7102 = new BitSet(new long[]{0x0000400400000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__0__Impl_in_rule__Addition__Group_1__07137 = new BitSet(new long[]{0x00000005000060D0L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__1_in_rule__Addition__Group_1__07140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Alternatives_1_0_in_rule__Addition__Group_1__0__Impl7167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__1__Impl_in_rule__Addition__Group_1__17197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__RightAssignment_1_1_in_rule__Addition__Group_1__1__Impl7224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_0__0__Impl_in_rule__Addition__Group_1_0_0__07258 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_0__1_in_rule__Addition__Group_1_0_0__07261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_0__1__Impl_in_rule__Addition__Group_1_0_0__17319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Add_opAssignment_1_0_0_1_in_rule__Addition__Group_1_0_0__1__Impl7346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_1__0__Impl_in_rule__Addition__Group_1_0_1__07380 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_1__1_in_rule__Addition__Group_1_0_1__07383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_1__1__Impl_in_rule__Addition__Group_1_0_1__17441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Add_opAssignment_1_0_1_1_in_rule__Addition__Group_1_0_1__1__Impl7468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__0__Impl_in_rule__Multiplication__Group__07502 = new BitSet(new long[]{0x0001800000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__1_in_rule__Multiplication__Group__07505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePower_in_rule__Multiplication__Group__0__Impl7532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__1__Impl_in_rule__Multiplication__Group__17561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__0_in_rule__Multiplication__Group__1__Impl7588 = new BitSet(new long[]{0x0001800000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__0__Impl_in_rule__Multiplication__Group_1__07623 = new BitSet(new long[]{0x00000005000060D0L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__1_in_rule__Multiplication__Group_1__07626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Alternatives_1_0_in_rule__Multiplication__Group_1__0__Impl7653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__1__Impl_in_rule__Multiplication__Group_1__17683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__RightAssignment_1_1_in_rule__Multiplication__Group_1__1__Impl7710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_0__0__Impl_in_rule__Multiplication__Group_1_0_0__07744 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_0__1_in_rule__Multiplication__Group_1_0_0__07747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_0__1__Impl_in_rule__Multiplication__Group_1_0_0__17805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Mul_opAssignment_1_0_0_1_in_rule__Multiplication__Group_1_0_0__1__Impl7832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_1__0__Impl_in_rule__Multiplication__Group_1_0_1__07866 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_1__1_in_rule__Multiplication__Group_1_0_1__07869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_1__1__Impl_in_rule__Multiplication__Group_1_0_1__17927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Mul_opAssignment_1_0_1_1_in_rule__Multiplication__Group_1_0_1__1__Impl7954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Power__Group__0__Impl_in_rule__Power__Group__07988 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_rule__Power__Group__1_in_rule__Power__Group__07991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpr_in_rule__Power__Group__0__Impl8018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Power__Group__1__Impl_in_rule__Power__Group__18047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Power__Group_1__0_in_rule__Power__Group__1__Impl8074 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_rule__Power__Group_1__0__Impl_in_rule__Power__Group_1__08109 = new BitSet(new long[]{0x00000005000060D0L});
    public static final BitSet FOLLOW_rule__Power__Group_1__1_in_rule__Power__Group_1__08112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Power__Group_1_0__0_in_rule__Power__Group_1__0__Impl8139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Power__Group_1__1__Impl_in_rule__Power__Group_1__18169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Power__RightAssignment_1_1_in_rule__Power__Group_1__1__Impl8196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Power__Group_1_0__0__Impl_in_rule__Power__Group_1_0__08230 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__Power__Group_1_0__1_in_rule__Power__Group_1_0__08233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Power__Group_1_0__1__Impl_in_rule__Power__Group_1_0__18291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Power__Pow_opAssignment_1_0_1_in_rule__Power__Group_1_0__1__Impl8318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpr__Group__0__Impl_in_rule__UnaryExpr__Group__08352 = new BitSet(new long[]{0x00000005000000D0L});
    public static final BitSet FOLLOW_rule__UnaryExpr__Group__1_in_rule__UnaryExpr__Group__08355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpr__UopAssignment_0_in_rule__UnaryExpr__Group__0__Impl8382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpr__Group__1__Impl_in_rule__UnaryExpr__Group__18413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpr__RightAssignment_1_in_rule__UnaryExpr__Group__1__Impl8440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrePrimaryExpr__Group_1__0__Impl_in_rule__PrePrimaryExpr__Group_1__08474 = new BitSet(new long[]{0x00000005000060D0L});
    public static final BitSet FOLLOW_rule__PrePrimaryExpr__Group_1__1_in_rule__PrePrimaryExpr__Group_1__08477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__PrePrimaryExpr__Group_1__0__Impl8505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrePrimaryExpr__Group_1__1__Impl_in_rule__PrePrimaryExpr__Group_1__18536 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__PrePrimaryExpr__Group_1__2_in_rule__PrePrimaryExpr__Group_1__18539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__PrePrimaryExpr__Group_1__1__Impl8566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrePrimaryExpr__Group_1__2__Impl_in_rule__PrePrimaryExpr__Group_1__28595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__PrePrimaryExpr__Group_1__2__Impl8623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrePrimaryExpr__Group_2__0__Impl_in_rule__PrePrimaryExpr__Group_2__08660 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__PrePrimaryExpr__Group_2__1_in_rule__PrePrimaryExpr__Group_2__08663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__PrePrimaryExpr__Group_2__0__Impl8691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrePrimaryExpr__Group_2__1__Impl_in_rule__PrePrimaryExpr__Group_2__18722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrePrimaryExpr__NAssignment_2_1_in_rule__PrePrimaryExpr__Group_2__1__Impl8749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_0__0__Impl_in_rule__TerminalExpression__Group_0__08783 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_0__1_in_rule__TerminalExpression__Group_0__08786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_0__1__Impl_in_rule__TerminalExpression__Group_0__18844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__ValueAssignment_0_1_in_rule__TerminalExpression__Group_0__1__Impl8871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_1__0__Impl_in_rule__TerminalExpression__Group_1__08905 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_1__1_in_rule__TerminalExpression__Group_1__08908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_1__1__Impl_in_rule__TerminalExpression__Group_1__18966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__ValueAssignment_1_1_in_rule__TerminalExpression__Group_1__1__Impl8993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_2__0__Impl_in_rule__TerminalExpression__Group_2__09027 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_2__1_in_rule__TerminalExpression__Group_2__09030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_2__1__Impl_in_rule__TerminalExpression__Group_2__19088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__ValueAssignment_2_1_in_rule__TerminalExpression__Group_2__1__Impl9115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ArgumentDiagram__NameAssignment_0_19154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_rule__ArgumentDiagram__NodesAssignment_1_09185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_rule__ArgumentDiagram__LinksAssignment_1_19216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Rebuts__FromAssignment_09251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Rebuts__ToAssignment_29290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Rebuts__OriginAssignment_49329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Mitigates__FromAssignment_09368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Mitigates__ToAssignment_29407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Mitigates__RebuttalAssignment_49446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Argument__NameAssignment_09481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Argument__DescriptionAssignment_29512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Argument__RoundAssignment_3_19543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Argument__OriginAssignment_4_19578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Argument__ExprAssignment_5_19613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Argument__ForegroundAssignment_6_19644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Argument__BackgroundAssignment_7_19675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Argument__ShapeAssignment_8_19706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Argument__ImageAssignment_9_19737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_rule__Argument__GroundsAssignment_10_1_1_19768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_rule__Argument__WarrantsAssignment_10_2_1_19799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentOp_in_rule__Expression__AssignAssignment9830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__AssignmentOp__AopAssignment_1_0_0_19866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__AssignmentOp__AopAssignment_1_0_1_19910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExp_in_rule__AssignmentOp__RightAssignment_1_19949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__OrExp__Or_opAssignment_1_19985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExp_in_rule__OrExp__RightAssignment_1_210024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__AndExp__And_opAssignment_1_110060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelational_in_rule__AndExp__RightAssignment_1_210099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Relational__Rel_opAssignment_1_0_0_110135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Relational__Rel_opAssignment_1_0_1_110179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Relational__Rel_opAssignment_1_0_2_110223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Relational__Rel_opAssignment_1_0_3_110267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Relational__Rel_opAssignment_1_0_4_110311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Relational__Rel_opAssignment_1_0_5_110355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Relational__Rel_opAssignment_1_0_6_110399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_rule__Relational__RightAssignment_1_110438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Addition__Add_opAssignment_1_0_0_110474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Addition__Add_opAssignment_1_0_1_110518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_rule__Addition__RightAssignment_1_110557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Multiplication__Mul_opAssignment_1_0_0_110593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__Multiplication__Mul_opAssignment_1_0_1_110637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePower_in_rule__Multiplication__RightAssignment_1_110676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__Power__Pow_opAssignment_1_0_110712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpr_in_rule__Power__RightAssignment_1_110751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOp_in_rule__UnaryExpr__UopAssignment_010782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrePrimaryExpr_in_rule__UnaryExpr__RightAssignment_110813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__PrePrimaryExpr__NAssignment_2_110844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__TerminalExpression__ValueAssignment_0_110875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__TerminalExpression__ValueAssignment_1_110906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TerminalExpression__ValueAssignment_2_110941 = new BitSet(new long[]{0x0000000000000002L});

}