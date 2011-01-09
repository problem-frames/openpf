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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_BOOLEAN", "RULE_QUALIFIED_NAME", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'?'", "'!'", "'argument:'", "'rebutted by'", "'mitigated by'", "'on'", "':'", "'round'", "'replacing'", "'with'", "'foreground'", "'background'", "'shape'", "'image'", "'{'", "'}'", "'supported by'", "','", "'warranted by'", "'('", "')'", "'-'", "'->'", "'<->'", "'|'", "'&'", "'!='", "'=='", "'>='", "'<='", "'='", "'<'", "'>'", "'+'", "'*'", "'/'", "'^'"
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

                if ( ((LA1_1>=16 && LA1_1<=17)) ) {
                    alt1=2;
                }
                else if ( (LA1_1==RULE_STRING||LA1_1==19) ) {
                    alt1=1;
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
                else if ( (LA2_1==17) ) {
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:956:1: rule__Rebuts__Group__2 : rule__Rebuts__Group__2__Impl ;
    public final void rule__Rebuts__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:960:1: ( rule__Rebuts__Group__2__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:961:2: rule__Rebuts__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Rebuts__Group__2__Impl_in_rule__Rebuts__Group__22020);
            rule__Rebuts__Group__2__Impl();
            _fsp--;


            }

        }
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:967:1: rule__Rebuts__Group__2__Impl : ( ( rule__Rebuts__ToAssignment_2 ) ) ;
    public final void rule__Rebuts__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:971:1: ( ( ( rule__Rebuts__ToAssignment_2 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:972:1: ( ( rule__Rebuts__ToAssignment_2 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:972:1: ( ( rule__Rebuts__ToAssignment_2 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:973:1: ( rule__Rebuts__ToAssignment_2 )
            {
             before(grammarAccess.getRebutsAccess().getToAssignment_2()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:974:1: ( rule__Rebuts__ToAssignment_2 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:974:2: rule__Rebuts__ToAssignment_2
            {
            pushFollow(FOLLOW_rule__Rebuts__ToAssignment_2_in_rule__Rebuts__Group__2__Impl2047);
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


    // $ANTLR start rule__Mitigates__Group__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:990:1: rule__Mitigates__Group__0 : rule__Mitigates__Group__0__Impl rule__Mitigates__Group__1 ;
    public final void rule__Mitigates__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:994:1: ( rule__Mitigates__Group__0__Impl rule__Mitigates__Group__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:995:2: rule__Mitigates__Group__0__Impl rule__Mitigates__Group__1
            {
            pushFollow(FOLLOW_rule__Mitigates__Group__0__Impl_in_rule__Mitigates__Group__02083);
            rule__Mitigates__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Mitigates__Group__1_in_rule__Mitigates__Group__02086);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1002:1: rule__Mitigates__Group__0__Impl : ( ( rule__Mitigates__FromAssignment_0 ) ) ;
    public final void rule__Mitigates__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1006:1: ( ( ( rule__Mitigates__FromAssignment_0 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1007:1: ( ( rule__Mitigates__FromAssignment_0 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1007:1: ( ( rule__Mitigates__FromAssignment_0 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1008:1: ( rule__Mitigates__FromAssignment_0 )
            {
             before(grammarAccess.getMitigatesAccess().getFromAssignment_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1009:1: ( rule__Mitigates__FromAssignment_0 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1009:2: rule__Mitigates__FromAssignment_0
            {
            pushFollow(FOLLOW_rule__Mitigates__FromAssignment_0_in_rule__Mitigates__Group__0__Impl2113);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1019:1: rule__Mitigates__Group__1 : rule__Mitigates__Group__1__Impl rule__Mitigates__Group__2 ;
    public final void rule__Mitigates__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1023:1: ( rule__Mitigates__Group__1__Impl rule__Mitigates__Group__2 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1024:2: rule__Mitigates__Group__1__Impl rule__Mitigates__Group__2
            {
            pushFollow(FOLLOW_rule__Mitigates__Group__1__Impl_in_rule__Mitigates__Group__12143);
            rule__Mitigates__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Mitigates__Group__2_in_rule__Mitigates__Group__12146);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1031:1: rule__Mitigates__Group__1__Impl : ( 'mitigated by' ) ;
    public final void rule__Mitigates__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1035:1: ( ( 'mitigated by' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1036:1: ( 'mitigated by' )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1036:1: ( 'mitigated by' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1037:1: 'mitigated by'
            {
             before(grammarAccess.getMitigatesAccess().getMitigatedByKeyword_1()); 
            match(input,17,FOLLOW_17_in_rule__Mitigates__Group__1__Impl2174); 
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1050:1: rule__Mitigates__Group__2 : rule__Mitigates__Group__2__Impl rule__Mitigates__Group__3 ;
    public final void rule__Mitigates__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1054:1: ( rule__Mitigates__Group__2__Impl rule__Mitigates__Group__3 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1055:2: rule__Mitigates__Group__2__Impl rule__Mitigates__Group__3
            {
            pushFollow(FOLLOW_rule__Mitigates__Group__2__Impl_in_rule__Mitigates__Group__22205);
            rule__Mitigates__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Mitigates__Group__3_in_rule__Mitigates__Group__22208);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1062:1: rule__Mitigates__Group__2__Impl : ( ( rule__Mitigates__ToAssignment_2 ) ) ;
    public final void rule__Mitigates__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1066:1: ( ( ( rule__Mitigates__ToAssignment_2 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1067:1: ( ( rule__Mitigates__ToAssignment_2 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1067:1: ( ( rule__Mitigates__ToAssignment_2 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1068:1: ( rule__Mitigates__ToAssignment_2 )
            {
             before(grammarAccess.getMitigatesAccess().getToAssignment_2()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1069:1: ( rule__Mitigates__ToAssignment_2 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1069:2: rule__Mitigates__ToAssignment_2
            {
            pushFollow(FOLLOW_rule__Mitigates__ToAssignment_2_in_rule__Mitigates__Group__2__Impl2235);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1079:1: rule__Mitigates__Group__3 : rule__Mitigates__Group__3__Impl rule__Mitigates__Group__4 ;
    public final void rule__Mitigates__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1083:1: ( rule__Mitigates__Group__3__Impl rule__Mitigates__Group__4 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1084:2: rule__Mitigates__Group__3__Impl rule__Mitigates__Group__4
            {
            pushFollow(FOLLOW_rule__Mitigates__Group__3__Impl_in_rule__Mitigates__Group__32265);
            rule__Mitigates__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Mitigates__Group__4_in_rule__Mitigates__Group__32268);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1091:1: rule__Mitigates__Group__3__Impl : ( 'on' ) ;
    public final void rule__Mitigates__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1095:1: ( ( 'on' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1096:1: ( 'on' )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1096:1: ( 'on' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1097:1: 'on'
            {
             before(grammarAccess.getMitigatesAccess().getOnKeyword_3()); 
            match(input,18,FOLLOW_18_in_rule__Mitigates__Group__3__Impl2296); 
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1110:1: rule__Mitigates__Group__4 : rule__Mitigates__Group__4__Impl ;
    public final void rule__Mitigates__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1114:1: ( rule__Mitigates__Group__4__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1115:2: rule__Mitigates__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Mitigates__Group__4__Impl_in_rule__Mitigates__Group__42327);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1121:1: rule__Mitigates__Group__4__Impl : ( ( rule__Mitigates__RebuttalAssignment_4 ) ) ;
    public final void rule__Mitigates__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1125:1: ( ( ( rule__Mitigates__RebuttalAssignment_4 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1126:1: ( ( rule__Mitigates__RebuttalAssignment_4 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1126:1: ( ( rule__Mitigates__RebuttalAssignment_4 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1127:1: ( rule__Mitigates__RebuttalAssignment_4 )
            {
             before(grammarAccess.getMitigatesAccess().getRebuttalAssignment_4()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1128:1: ( rule__Mitigates__RebuttalAssignment_4 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1128:2: rule__Mitigates__RebuttalAssignment_4
            {
            pushFollow(FOLLOW_rule__Mitigates__RebuttalAssignment_4_in_rule__Mitigates__Group__4__Impl2354);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1148:1: rule__Argument__Group__0 : rule__Argument__Group__0__Impl rule__Argument__Group__1 ;
    public final void rule__Argument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1152:1: ( rule__Argument__Group__0__Impl rule__Argument__Group__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1153:2: rule__Argument__Group__0__Impl rule__Argument__Group__1
            {
            pushFollow(FOLLOW_rule__Argument__Group__0__Impl_in_rule__Argument__Group__02394);
            rule__Argument__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group__1_in_rule__Argument__Group__02397);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1160:1: rule__Argument__Group__0__Impl : ( ( rule__Argument__NameAssignment_0 ) ) ;
    public final void rule__Argument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1164:1: ( ( ( rule__Argument__NameAssignment_0 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1165:1: ( ( rule__Argument__NameAssignment_0 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1165:1: ( ( rule__Argument__NameAssignment_0 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1166:1: ( rule__Argument__NameAssignment_0 )
            {
             before(grammarAccess.getArgumentAccess().getNameAssignment_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1167:1: ( rule__Argument__NameAssignment_0 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1167:2: rule__Argument__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Argument__NameAssignment_0_in_rule__Argument__Group__0__Impl2424);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1177:1: rule__Argument__Group__1 : rule__Argument__Group__1__Impl rule__Argument__Group__2 ;
    public final void rule__Argument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1181:1: ( rule__Argument__Group__1__Impl rule__Argument__Group__2 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1182:2: rule__Argument__Group__1__Impl rule__Argument__Group__2
            {
            pushFollow(FOLLOW_rule__Argument__Group__1__Impl_in_rule__Argument__Group__12454);
            rule__Argument__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group__2_in_rule__Argument__Group__12457);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1189:1: rule__Argument__Group__1__Impl : ( ( ':' )? ) ;
    public final void rule__Argument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1193:1: ( ( ( ':' )? ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1194:1: ( ( ':' )? )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1194:1: ( ( ':' )? )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1195:1: ( ':' )?
            {
             before(grammarAccess.getArgumentAccess().getColonKeyword_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1196:1: ( ':' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==19) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1197:2: ':'
                    {
                    match(input,19,FOLLOW_19_in_rule__Argument__Group__1__Impl2486); 

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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1208:1: rule__Argument__Group__2 : rule__Argument__Group__2__Impl rule__Argument__Group__3 ;
    public final void rule__Argument__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1212:1: ( rule__Argument__Group__2__Impl rule__Argument__Group__3 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1213:2: rule__Argument__Group__2__Impl rule__Argument__Group__3
            {
            pushFollow(FOLLOW_rule__Argument__Group__2__Impl_in_rule__Argument__Group__22519);
            rule__Argument__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group__3_in_rule__Argument__Group__22522);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1220:1: rule__Argument__Group__2__Impl : ( ( rule__Argument__DescriptionAssignment_2 ) ) ;
    public final void rule__Argument__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1224:1: ( ( ( rule__Argument__DescriptionAssignment_2 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1225:1: ( ( rule__Argument__DescriptionAssignment_2 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1225:1: ( ( rule__Argument__DescriptionAssignment_2 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1226:1: ( rule__Argument__DescriptionAssignment_2 )
            {
             before(grammarAccess.getArgumentAccess().getDescriptionAssignment_2()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1227:1: ( rule__Argument__DescriptionAssignment_2 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1227:2: rule__Argument__DescriptionAssignment_2
            {
            pushFollow(FOLLOW_rule__Argument__DescriptionAssignment_2_in_rule__Argument__Group__2__Impl2549);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1237:1: rule__Argument__Group__3 : rule__Argument__Group__3__Impl rule__Argument__Group__4 ;
    public final void rule__Argument__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1241:1: ( rule__Argument__Group__3__Impl rule__Argument__Group__4 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1242:2: rule__Argument__Group__3__Impl rule__Argument__Group__4
            {
            pushFollow(FOLLOW_rule__Argument__Group__3__Impl_in_rule__Argument__Group__32579);
            rule__Argument__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group__4_in_rule__Argument__Group__32582);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1249:1: rule__Argument__Group__3__Impl : ( ( rule__Argument__Group_3__0 )? ) ;
    public final void rule__Argument__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1253:1: ( ( ( rule__Argument__Group_3__0 )? ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1254:1: ( ( rule__Argument__Group_3__0 )? )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1254:1: ( ( rule__Argument__Group_3__0 )? )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1255:1: ( rule__Argument__Group_3__0 )?
            {
             before(grammarAccess.getArgumentAccess().getGroup_3()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1256:1: ( rule__Argument__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==20) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1256:2: rule__Argument__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Argument__Group_3__0_in_rule__Argument__Group__3__Impl2609);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1266:1: rule__Argument__Group__4 : rule__Argument__Group__4__Impl rule__Argument__Group__5 ;
    public final void rule__Argument__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1270:1: ( rule__Argument__Group__4__Impl rule__Argument__Group__5 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1271:2: rule__Argument__Group__4__Impl rule__Argument__Group__5
            {
            pushFollow(FOLLOW_rule__Argument__Group__4__Impl_in_rule__Argument__Group__42640);
            rule__Argument__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group__5_in_rule__Argument__Group__42643);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1278:1: rule__Argument__Group__4__Impl : ( ( rule__Argument__Group_4__0 )? ) ;
    public final void rule__Argument__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1282:1: ( ( ( rule__Argument__Group_4__0 )? ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1283:1: ( ( rule__Argument__Group_4__0 )? )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1283:1: ( ( rule__Argument__Group_4__0 )? )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1284:1: ( rule__Argument__Group_4__0 )?
            {
             before(grammarAccess.getArgumentAccess().getGroup_4()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1285:1: ( rule__Argument__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==21) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1285:2: rule__Argument__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Argument__Group_4__0_in_rule__Argument__Group__4__Impl2670);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1295:1: rule__Argument__Group__5 : rule__Argument__Group__5__Impl rule__Argument__Group__6 ;
    public final void rule__Argument__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1299:1: ( rule__Argument__Group__5__Impl rule__Argument__Group__6 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1300:2: rule__Argument__Group__5__Impl rule__Argument__Group__6
            {
            pushFollow(FOLLOW_rule__Argument__Group__5__Impl_in_rule__Argument__Group__52701);
            rule__Argument__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group__6_in_rule__Argument__Group__52704);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1307:1: rule__Argument__Group__5__Impl : ( ( rule__Argument__Group_5__0 )? ) ;
    public final void rule__Argument__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1311:1: ( ( ( rule__Argument__Group_5__0 )? ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1312:1: ( ( rule__Argument__Group_5__0 )? )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1312:1: ( ( rule__Argument__Group_5__0 )? )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1313:1: ( rule__Argument__Group_5__0 )?
            {
             before(grammarAccess.getArgumentAccess().getGroup_5()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1314:1: ( rule__Argument__Group_5__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==22) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1314:2: rule__Argument__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Argument__Group_5__0_in_rule__Argument__Group__5__Impl2731);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1324:1: rule__Argument__Group__6 : rule__Argument__Group__6__Impl rule__Argument__Group__7 ;
    public final void rule__Argument__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1328:1: ( rule__Argument__Group__6__Impl rule__Argument__Group__7 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1329:2: rule__Argument__Group__6__Impl rule__Argument__Group__7
            {
            pushFollow(FOLLOW_rule__Argument__Group__6__Impl_in_rule__Argument__Group__62762);
            rule__Argument__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group__7_in_rule__Argument__Group__62765);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1336:1: rule__Argument__Group__6__Impl : ( ( rule__Argument__Group_6__0 )? ) ;
    public final void rule__Argument__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1340:1: ( ( ( rule__Argument__Group_6__0 )? ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1341:1: ( ( rule__Argument__Group_6__0 )? )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1341:1: ( ( rule__Argument__Group_6__0 )? )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1342:1: ( rule__Argument__Group_6__0 )?
            {
             before(grammarAccess.getArgumentAccess().getGroup_6()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1343:1: ( rule__Argument__Group_6__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==23) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1343:2: rule__Argument__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Argument__Group_6__0_in_rule__Argument__Group__6__Impl2792);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1353:1: rule__Argument__Group__7 : rule__Argument__Group__7__Impl rule__Argument__Group__8 ;
    public final void rule__Argument__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1357:1: ( rule__Argument__Group__7__Impl rule__Argument__Group__8 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1358:2: rule__Argument__Group__7__Impl rule__Argument__Group__8
            {
            pushFollow(FOLLOW_rule__Argument__Group__7__Impl_in_rule__Argument__Group__72823);
            rule__Argument__Group__7__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group__8_in_rule__Argument__Group__72826);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1365:1: rule__Argument__Group__7__Impl : ( ( rule__Argument__Group_7__0 )? ) ;
    public final void rule__Argument__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1369:1: ( ( ( rule__Argument__Group_7__0 )? ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1370:1: ( ( rule__Argument__Group_7__0 )? )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1370:1: ( ( rule__Argument__Group_7__0 )? )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1371:1: ( rule__Argument__Group_7__0 )?
            {
             before(grammarAccess.getArgumentAccess().getGroup_7()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1372:1: ( rule__Argument__Group_7__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==24) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1372:2: rule__Argument__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Argument__Group_7__0_in_rule__Argument__Group__7__Impl2853);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1382:1: rule__Argument__Group__8 : rule__Argument__Group__8__Impl rule__Argument__Group__9 ;
    public final void rule__Argument__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1386:1: ( rule__Argument__Group__8__Impl rule__Argument__Group__9 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1387:2: rule__Argument__Group__8__Impl rule__Argument__Group__9
            {
            pushFollow(FOLLOW_rule__Argument__Group__8__Impl_in_rule__Argument__Group__82884);
            rule__Argument__Group__8__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group__9_in_rule__Argument__Group__82887);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1394:1: rule__Argument__Group__8__Impl : ( ( rule__Argument__Group_8__0 )? ) ;
    public final void rule__Argument__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1398:1: ( ( ( rule__Argument__Group_8__0 )? ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1399:1: ( ( rule__Argument__Group_8__0 )? )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1399:1: ( ( rule__Argument__Group_8__0 )? )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1400:1: ( rule__Argument__Group_8__0 )?
            {
             before(grammarAccess.getArgumentAccess().getGroup_8()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1401:1: ( rule__Argument__Group_8__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==25) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1401:2: rule__Argument__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__Argument__Group_8__0_in_rule__Argument__Group__8__Impl2914);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1411:1: rule__Argument__Group__9 : rule__Argument__Group__9__Impl rule__Argument__Group__10 ;
    public final void rule__Argument__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1415:1: ( rule__Argument__Group__9__Impl rule__Argument__Group__10 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1416:2: rule__Argument__Group__9__Impl rule__Argument__Group__10
            {
            pushFollow(FOLLOW_rule__Argument__Group__9__Impl_in_rule__Argument__Group__92945);
            rule__Argument__Group__9__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group__10_in_rule__Argument__Group__92948);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1423:1: rule__Argument__Group__9__Impl : ( ( rule__Argument__Group_9__0 )? ) ;
    public final void rule__Argument__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1427:1: ( ( ( rule__Argument__Group_9__0 )? ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1428:1: ( ( rule__Argument__Group_9__0 )? )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1428:1: ( ( rule__Argument__Group_9__0 )? )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1429:1: ( rule__Argument__Group_9__0 )?
            {
             before(grammarAccess.getArgumentAccess().getGroup_9()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1430:1: ( rule__Argument__Group_9__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==26) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1430:2: rule__Argument__Group_9__0
                    {
                    pushFollow(FOLLOW_rule__Argument__Group_9__0_in_rule__Argument__Group__9__Impl2975);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1440:1: rule__Argument__Group__10 : rule__Argument__Group__10__Impl ;
    public final void rule__Argument__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1444:1: ( rule__Argument__Group__10__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1445:2: rule__Argument__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__Argument__Group__10__Impl_in_rule__Argument__Group__103006);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1451:1: rule__Argument__Group__10__Impl : ( ( rule__Argument__Group_10__0 )? ) ;
    public final void rule__Argument__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1455:1: ( ( ( rule__Argument__Group_10__0 )? ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1456:1: ( ( rule__Argument__Group_10__0 )? )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1456:1: ( ( rule__Argument__Group_10__0 )? )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1457:1: ( rule__Argument__Group_10__0 )?
            {
             before(grammarAccess.getArgumentAccess().getGroup_10()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1458:1: ( rule__Argument__Group_10__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==27) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1458:2: rule__Argument__Group_10__0
                    {
                    pushFollow(FOLLOW_rule__Argument__Group_10__0_in_rule__Argument__Group__10__Impl3033);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1490:1: rule__Argument__Group_3__0 : rule__Argument__Group_3__0__Impl rule__Argument__Group_3__1 ;
    public final void rule__Argument__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1494:1: ( rule__Argument__Group_3__0__Impl rule__Argument__Group_3__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1495:2: rule__Argument__Group_3__0__Impl rule__Argument__Group_3__1
            {
            pushFollow(FOLLOW_rule__Argument__Group_3__0__Impl_in_rule__Argument__Group_3__03086);
            rule__Argument__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group_3__1_in_rule__Argument__Group_3__03089);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1502:1: rule__Argument__Group_3__0__Impl : ( 'round' ) ;
    public final void rule__Argument__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1506:1: ( ( 'round' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1507:1: ( 'round' )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1507:1: ( 'round' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1508:1: 'round'
            {
             before(grammarAccess.getArgumentAccess().getRoundKeyword_3_0()); 
            match(input,20,FOLLOW_20_in_rule__Argument__Group_3__0__Impl3117); 
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1521:1: rule__Argument__Group_3__1 : rule__Argument__Group_3__1__Impl ;
    public final void rule__Argument__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1525:1: ( rule__Argument__Group_3__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1526:2: rule__Argument__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Argument__Group_3__1__Impl_in_rule__Argument__Group_3__13148);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1532:1: rule__Argument__Group_3__1__Impl : ( ( rule__Argument__RoundAssignment_3_1 ) ) ;
    public final void rule__Argument__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1536:1: ( ( ( rule__Argument__RoundAssignment_3_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1537:1: ( ( rule__Argument__RoundAssignment_3_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1537:1: ( ( rule__Argument__RoundAssignment_3_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1538:1: ( rule__Argument__RoundAssignment_3_1 )
            {
             before(grammarAccess.getArgumentAccess().getRoundAssignment_3_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1539:1: ( rule__Argument__RoundAssignment_3_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1539:2: rule__Argument__RoundAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Argument__RoundAssignment_3_1_in_rule__Argument__Group_3__1__Impl3175);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1553:1: rule__Argument__Group_4__0 : rule__Argument__Group_4__0__Impl rule__Argument__Group_4__1 ;
    public final void rule__Argument__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1557:1: ( rule__Argument__Group_4__0__Impl rule__Argument__Group_4__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1558:2: rule__Argument__Group_4__0__Impl rule__Argument__Group_4__1
            {
            pushFollow(FOLLOW_rule__Argument__Group_4__0__Impl_in_rule__Argument__Group_4__03209);
            rule__Argument__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group_4__1_in_rule__Argument__Group_4__03212);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1565:1: rule__Argument__Group_4__0__Impl : ( 'replacing' ) ;
    public final void rule__Argument__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1569:1: ( ( 'replacing' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1570:1: ( 'replacing' )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1570:1: ( 'replacing' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1571:1: 'replacing'
            {
             before(grammarAccess.getArgumentAccess().getReplacingKeyword_4_0()); 
            match(input,21,FOLLOW_21_in_rule__Argument__Group_4__0__Impl3240); 
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1584:1: rule__Argument__Group_4__1 : rule__Argument__Group_4__1__Impl ;
    public final void rule__Argument__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1588:1: ( rule__Argument__Group_4__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1589:2: rule__Argument__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Argument__Group_4__1__Impl_in_rule__Argument__Group_4__13271);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1595:1: rule__Argument__Group_4__1__Impl : ( ( rule__Argument__OriginAssignment_4_1 ) ) ;
    public final void rule__Argument__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1599:1: ( ( ( rule__Argument__OriginAssignment_4_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1600:1: ( ( rule__Argument__OriginAssignment_4_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1600:1: ( ( rule__Argument__OriginAssignment_4_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1601:1: ( rule__Argument__OriginAssignment_4_1 )
            {
             before(grammarAccess.getArgumentAccess().getOriginAssignment_4_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1602:1: ( rule__Argument__OriginAssignment_4_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1602:2: rule__Argument__OriginAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Argument__OriginAssignment_4_1_in_rule__Argument__Group_4__1__Impl3298);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1616:1: rule__Argument__Group_5__0 : rule__Argument__Group_5__0__Impl rule__Argument__Group_5__1 ;
    public final void rule__Argument__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1620:1: ( rule__Argument__Group_5__0__Impl rule__Argument__Group_5__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1621:2: rule__Argument__Group_5__0__Impl rule__Argument__Group_5__1
            {
            pushFollow(FOLLOW_rule__Argument__Group_5__0__Impl_in_rule__Argument__Group_5__03332);
            rule__Argument__Group_5__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group_5__1_in_rule__Argument__Group_5__03335);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1628:1: rule__Argument__Group_5__0__Impl : ( 'with' ) ;
    public final void rule__Argument__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1632:1: ( ( 'with' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1633:1: ( 'with' )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1633:1: ( 'with' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1634:1: 'with'
            {
             before(grammarAccess.getArgumentAccess().getWithKeyword_5_0()); 
            match(input,22,FOLLOW_22_in_rule__Argument__Group_5__0__Impl3363); 
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1647:1: rule__Argument__Group_5__1 : rule__Argument__Group_5__1__Impl ;
    public final void rule__Argument__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1651:1: ( rule__Argument__Group_5__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1652:2: rule__Argument__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Argument__Group_5__1__Impl_in_rule__Argument__Group_5__13394);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1658:1: rule__Argument__Group_5__1__Impl : ( ( rule__Argument__ExprAssignment_5_1 ) ) ;
    public final void rule__Argument__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1662:1: ( ( ( rule__Argument__ExprAssignment_5_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1663:1: ( ( rule__Argument__ExprAssignment_5_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1663:1: ( ( rule__Argument__ExprAssignment_5_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1664:1: ( rule__Argument__ExprAssignment_5_1 )
            {
             before(grammarAccess.getArgumentAccess().getExprAssignment_5_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1665:1: ( rule__Argument__ExprAssignment_5_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1665:2: rule__Argument__ExprAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Argument__ExprAssignment_5_1_in_rule__Argument__Group_5__1__Impl3421);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1679:1: rule__Argument__Group_6__0 : rule__Argument__Group_6__0__Impl rule__Argument__Group_6__1 ;
    public final void rule__Argument__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1683:1: ( rule__Argument__Group_6__0__Impl rule__Argument__Group_6__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1684:2: rule__Argument__Group_6__0__Impl rule__Argument__Group_6__1
            {
            pushFollow(FOLLOW_rule__Argument__Group_6__0__Impl_in_rule__Argument__Group_6__03455);
            rule__Argument__Group_6__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group_6__1_in_rule__Argument__Group_6__03458);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1691:1: rule__Argument__Group_6__0__Impl : ( 'foreground' ) ;
    public final void rule__Argument__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1695:1: ( ( 'foreground' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1696:1: ( 'foreground' )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1696:1: ( 'foreground' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1697:1: 'foreground'
            {
             before(grammarAccess.getArgumentAccess().getForegroundKeyword_6_0()); 
            match(input,23,FOLLOW_23_in_rule__Argument__Group_6__0__Impl3486); 
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1710:1: rule__Argument__Group_6__1 : rule__Argument__Group_6__1__Impl ;
    public final void rule__Argument__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1714:1: ( rule__Argument__Group_6__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1715:2: rule__Argument__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Argument__Group_6__1__Impl_in_rule__Argument__Group_6__13517);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1721:1: rule__Argument__Group_6__1__Impl : ( ( rule__Argument__ForegroundAssignment_6_1 ) ) ;
    public final void rule__Argument__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1725:1: ( ( ( rule__Argument__ForegroundAssignment_6_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1726:1: ( ( rule__Argument__ForegroundAssignment_6_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1726:1: ( ( rule__Argument__ForegroundAssignment_6_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1727:1: ( rule__Argument__ForegroundAssignment_6_1 )
            {
             before(grammarAccess.getArgumentAccess().getForegroundAssignment_6_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1728:1: ( rule__Argument__ForegroundAssignment_6_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1728:2: rule__Argument__ForegroundAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Argument__ForegroundAssignment_6_1_in_rule__Argument__Group_6__1__Impl3544);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1742:1: rule__Argument__Group_7__0 : rule__Argument__Group_7__0__Impl rule__Argument__Group_7__1 ;
    public final void rule__Argument__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1746:1: ( rule__Argument__Group_7__0__Impl rule__Argument__Group_7__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1747:2: rule__Argument__Group_7__0__Impl rule__Argument__Group_7__1
            {
            pushFollow(FOLLOW_rule__Argument__Group_7__0__Impl_in_rule__Argument__Group_7__03578);
            rule__Argument__Group_7__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group_7__1_in_rule__Argument__Group_7__03581);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1754:1: rule__Argument__Group_7__0__Impl : ( 'background' ) ;
    public final void rule__Argument__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1758:1: ( ( 'background' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1759:1: ( 'background' )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1759:1: ( 'background' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1760:1: 'background'
            {
             before(grammarAccess.getArgumentAccess().getBackgroundKeyword_7_0()); 
            match(input,24,FOLLOW_24_in_rule__Argument__Group_7__0__Impl3609); 
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1773:1: rule__Argument__Group_7__1 : rule__Argument__Group_7__1__Impl ;
    public final void rule__Argument__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1777:1: ( rule__Argument__Group_7__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1778:2: rule__Argument__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__Argument__Group_7__1__Impl_in_rule__Argument__Group_7__13640);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1784:1: rule__Argument__Group_7__1__Impl : ( ( rule__Argument__BackgroundAssignment_7_1 ) ) ;
    public final void rule__Argument__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1788:1: ( ( ( rule__Argument__BackgroundAssignment_7_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1789:1: ( ( rule__Argument__BackgroundAssignment_7_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1789:1: ( ( rule__Argument__BackgroundAssignment_7_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1790:1: ( rule__Argument__BackgroundAssignment_7_1 )
            {
             before(grammarAccess.getArgumentAccess().getBackgroundAssignment_7_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1791:1: ( rule__Argument__BackgroundAssignment_7_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1791:2: rule__Argument__BackgroundAssignment_7_1
            {
            pushFollow(FOLLOW_rule__Argument__BackgroundAssignment_7_1_in_rule__Argument__Group_7__1__Impl3667);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1805:1: rule__Argument__Group_8__0 : rule__Argument__Group_8__0__Impl rule__Argument__Group_8__1 ;
    public final void rule__Argument__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1809:1: ( rule__Argument__Group_8__0__Impl rule__Argument__Group_8__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1810:2: rule__Argument__Group_8__0__Impl rule__Argument__Group_8__1
            {
            pushFollow(FOLLOW_rule__Argument__Group_8__0__Impl_in_rule__Argument__Group_8__03701);
            rule__Argument__Group_8__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group_8__1_in_rule__Argument__Group_8__03704);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1817:1: rule__Argument__Group_8__0__Impl : ( 'shape' ) ;
    public final void rule__Argument__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1821:1: ( ( 'shape' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1822:1: ( 'shape' )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1822:1: ( 'shape' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1823:1: 'shape'
            {
             before(grammarAccess.getArgumentAccess().getShapeKeyword_8_0()); 
            match(input,25,FOLLOW_25_in_rule__Argument__Group_8__0__Impl3732); 
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1836:1: rule__Argument__Group_8__1 : rule__Argument__Group_8__1__Impl ;
    public final void rule__Argument__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1840:1: ( rule__Argument__Group_8__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1841:2: rule__Argument__Group_8__1__Impl
            {
            pushFollow(FOLLOW_rule__Argument__Group_8__1__Impl_in_rule__Argument__Group_8__13763);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1847:1: rule__Argument__Group_8__1__Impl : ( ( rule__Argument__ShapeAssignment_8_1 ) ) ;
    public final void rule__Argument__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1851:1: ( ( ( rule__Argument__ShapeAssignment_8_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1852:1: ( ( rule__Argument__ShapeAssignment_8_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1852:1: ( ( rule__Argument__ShapeAssignment_8_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1853:1: ( rule__Argument__ShapeAssignment_8_1 )
            {
             before(grammarAccess.getArgumentAccess().getShapeAssignment_8_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1854:1: ( rule__Argument__ShapeAssignment_8_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1854:2: rule__Argument__ShapeAssignment_8_1
            {
            pushFollow(FOLLOW_rule__Argument__ShapeAssignment_8_1_in_rule__Argument__Group_8__1__Impl3790);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1868:1: rule__Argument__Group_9__0 : rule__Argument__Group_9__0__Impl rule__Argument__Group_9__1 ;
    public final void rule__Argument__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1872:1: ( rule__Argument__Group_9__0__Impl rule__Argument__Group_9__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1873:2: rule__Argument__Group_9__0__Impl rule__Argument__Group_9__1
            {
            pushFollow(FOLLOW_rule__Argument__Group_9__0__Impl_in_rule__Argument__Group_9__03824);
            rule__Argument__Group_9__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group_9__1_in_rule__Argument__Group_9__03827);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1880:1: rule__Argument__Group_9__0__Impl : ( 'image' ) ;
    public final void rule__Argument__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1884:1: ( ( 'image' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1885:1: ( 'image' )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1885:1: ( 'image' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1886:1: 'image'
            {
             before(grammarAccess.getArgumentAccess().getImageKeyword_9_0()); 
            match(input,26,FOLLOW_26_in_rule__Argument__Group_9__0__Impl3855); 
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1899:1: rule__Argument__Group_9__1 : rule__Argument__Group_9__1__Impl ;
    public final void rule__Argument__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1903:1: ( rule__Argument__Group_9__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1904:2: rule__Argument__Group_9__1__Impl
            {
            pushFollow(FOLLOW_rule__Argument__Group_9__1__Impl_in_rule__Argument__Group_9__13886);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1910:1: rule__Argument__Group_9__1__Impl : ( ( rule__Argument__ImageAssignment_9_1 ) ) ;
    public final void rule__Argument__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1914:1: ( ( ( rule__Argument__ImageAssignment_9_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1915:1: ( ( rule__Argument__ImageAssignment_9_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1915:1: ( ( rule__Argument__ImageAssignment_9_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1916:1: ( rule__Argument__ImageAssignment_9_1 )
            {
             before(grammarAccess.getArgumentAccess().getImageAssignment_9_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1917:1: ( rule__Argument__ImageAssignment_9_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1917:2: rule__Argument__ImageAssignment_9_1
            {
            pushFollow(FOLLOW_rule__Argument__ImageAssignment_9_1_in_rule__Argument__Group_9__1__Impl3913);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1931:1: rule__Argument__Group_10__0 : rule__Argument__Group_10__0__Impl rule__Argument__Group_10__1 ;
    public final void rule__Argument__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1935:1: ( rule__Argument__Group_10__0__Impl rule__Argument__Group_10__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1936:2: rule__Argument__Group_10__0__Impl rule__Argument__Group_10__1
            {
            pushFollow(FOLLOW_rule__Argument__Group_10__0__Impl_in_rule__Argument__Group_10__03947);
            rule__Argument__Group_10__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group_10__1_in_rule__Argument__Group_10__03950);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1943:1: rule__Argument__Group_10__0__Impl : ( '{' ) ;
    public final void rule__Argument__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1947:1: ( ( '{' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1948:1: ( '{' )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1948:1: ( '{' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1949:1: '{'
            {
             before(grammarAccess.getArgumentAccess().getLeftCurlyBracketKeyword_10_0()); 
            match(input,27,FOLLOW_27_in_rule__Argument__Group_10__0__Impl3978); 
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1962:1: rule__Argument__Group_10__1 : rule__Argument__Group_10__1__Impl rule__Argument__Group_10__2 ;
    public final void rule__Argument__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1966:1: ( rule__Argument__Group_10__1__Impl rule__Argument__Group_10__2 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1967:2: rule__Argument__Group_10__1__Impl rule__Argument__Group_10__2
            {
            pushFollow(FOLLOW_rule__Argument__Group_10__1__Impl_in_rule__Argument__Group_10__14009);
            rule__Argument__Group_10__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group_10__2_in_rule__Argument__Group_10__14012);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1974:1: rule__Argument__Group_10__1__Impl : ( ( rule__Argument__Group_10_1__0 )? ) ;
    public final void rule__Argument__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1978:1: ( ( ( rule__Argument__Group_10_1__0 )? ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1979:1: ( ( rule__Argument__Group_10_1__0 )? )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1979:1: ( ( rule__Argument__Group_10_1__0 )? )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1980:1: ( rule__Argument__Group_10_1__0 )?
            {
             before(grammarAccess.getArgumentAccess().getGroup_10_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1981:1: ( rule__Argument__Group_10_1__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==29) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1981:2: rule__Argument__Group_10_1__0
                    {
                    pushFollow(FOLLOW_rule__Argument__Group_10_1__0_in_rule__Argument__Group_10__1__Impl4039);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1991:1: rule__Argument__Group_10__2 : rule__Argument__Group_10__2__Impl rule__Argument__Group_10__3 ;
    public final void rule__Argument__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1995:1: ( rule__Argument__Group_10__2__Impl rule__Argument__Group_10__3 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1996:2: rule__Argument__Group_10__2__Impl rule__Argument__Group_10__3
            {
            pushFollow(FOLLOW_rule__Argument__Group_10__2__Impl_in_rule__Argument__Group_10__24070);
            rule__Argument__Group_10__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group_10__3_in_rule__Argument__Group_10__24073);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2003:1: rule__Argument__Group_10__2__Impl : ( ( rule__Argument__Group_10_2__0 )? ) ;
    public final void rule__Argument__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2007:1: ( ( ( rule__Argument__Group_10_2__0 )? ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2008:1: ( ( rule__Argument__Group_10_2__0 )? )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2008:1: ( ( rule__Argument__Group_10_2__0 )? )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2009:1: ( rule__Argument__Group_10_2__0 )?
            {
             before(grammarAccess.getArgumentAccess().getGroup_10_2()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2010:1: ( rule__Argument__Group_10_2__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==31) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2010:2: rule__Argument__Group_10_2__0
                    {
                    pushFollow(FOLLOW_rule__Argument__Group_10_2__0_in_rule__Argument__Group_10__2__Impl4100);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2020:1: rule__Argument__Group_10__3 : rule__Argument__Group_10__3__Impl ;
    public final void rule__Argument__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2024:1: ( rule__Argument__Group_10__3__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2025:2: rule__Argument__Group_10__3__Impl
            {
            pushFollow(FOLLOW_rule__Argument__Group_10__3__Impl_in_rule__Argument__Group_10__34131);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2031:1: rule__Argument__Group_10__3__Impl : ( '}' ) ;
    public final void rule__Argument__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2035:1: ( ( '}' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2036:1: ( '}' )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2036:1: ( '}' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2037:1: '}'
            {
             before(grammarAccess.getArgumentAccess().getRightCurlyBracketKeyword_10_3()); 
            match(input,28,FOLLOW_28_in_rule__Argument__Group_10__3__Impl4159); 
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2058:1: rule__Argument__Group_10_1__0 : rule__Argument__Group_10_1__0__Impl rule__Argument__Group_10_1__1 ;
    public final void rule__Argument__Group_10_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2062:1: ( rule__Argument__Group_10_1__0__Impl rule__Argument__Group_10_1__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2063:2: rule__Argument__Group_10_1__0__Impl rule__Argument__Group_10_1__1
            {
            pushFollow(FOLLOW_rule__Argument__Group_10_1__0__Impl_in_rule__Argument__Group_10_1__04198);
            rule__Argument__Group_10_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group_10_1__1_in_rule__Argument__Group_10_1__04201);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2070:1: rule__Argument__Group_10_1__0__Impl : ( 'supported by' ) ;
    public final void rule__Argument__Group_10_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2074:1: ( ( 'supported by' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2075:1: ( 'supported by' )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2075:1: ( 'supported by' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2076:1: 'supported by'
            {
             before(grammarAccess.getArgumentAccess().getSupportedByKeyword_10_1_0()); 
            match(input,29,FOLLOW_29_in_rule__Argument__Group_10_1__0__Impl4229); 
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2089:1: rule__Argument__Group_10_1__1 : rule__Argument__Group_10_1__1__Impl ;
    public final void rule__Argument__Group_10_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2093:1: ( rule__Argument__Group_10_1__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2094:2: rule__Argument__Group_10_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Argument__Group_10_1__1__Impl_in_rule__Argument__Group_10_1__14260);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2100:1: rule__Argument__Group_10_1__1__Impl : ( ( rule__Argument__Group_10_1_1__0 )* ) ;
    public final void rule__Argument__Group_10_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2104:1: ( ( ( rule__Argument__Group_10_1_1__0 )* ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2105:1: ( ( rule__Argument__Group_10_1_1__0 )* )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2105:1: ( ( rule__Argument__Group_10_1_1__0 )* )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2106:1: ( rule__Argument__Group_10_1_1__0 )*
            {
             before(grammarAccess.getArgumentAccess().getGroup_10_1_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2107:1: ( rule__Argument__Group_10_1_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID||LA23_0==30) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2107:2: rule__Argument__Group_10_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Argument__Group_10_1_1__0_in_rule__Argument__Group_10_1__1__Impl4287);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2121:1: rule__Argument__Group_10_1_1__0 : rule__Argument__Group_10_1_1__0__Impl rule__Argument__Group_10_1_1__1 ;
    public final void rule__Argument__Group_10_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2125:1: ( rule__Argument__Group_10_1_1__0__Impl rule__Argument__Group_10_1_1__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2126:2: rule__Argument__Group_10_1_1__0__Impl rule__Argument__Group_10_1_1__1
            {
            pushFollow(FOLLOW_rule__Argument__Group_10_1_1__0__Impl_in_rule__Argument__Group_10_1_1__04322);
            rule__Argument__Group_10_1_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group_10_1_1__1_in_rule__Argument__Group_10_1_1__04325);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2133:1: rule__Argument__Group_10_1_1__0__Impl : ( ( ',' )? ) ;
    public final void rule__Argument__Group_10_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2137:1: ( ( ( ',' )? ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2138:1: ( ( ',' )? )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2138:1: ( ( ',' )? )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2139:1: ( ',' )?
            {
             before(grammarAccess.getArgumentAccess().getCommaKeyword_10_1_1_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2140:1: ( ',' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==30) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2141:2: ','
                    {
                    match(input,30,FOLLOW_30_in_rule__Argument__Group_10_1_1__0__Impl4354); 

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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2152:1: rule__Argument__Group_10_1_1__1 : rule__Argument__Group_10_1_1__1__Impl ;
    public final void rule__Argument__Group_10_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2156:1: ( rule__Argument__Group_10_1_1__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2157:2: rule__Argument__Group_10_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Argument__Group_10_1_1__1__Impl_in_rule__Argument__Group_10_1_1__14387);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2163:1: rule__Argument__Group_10_1_1__1__Impl : ( ( rule__Argument__GroundsAssignment_10_1_1_1 ) ) ;
    public final void rule__Argument__Group_10_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2167:1: ( ( ( rule__Argument__GroundsAssignment_10_1_1_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2168:1: ( ( rule__Argument__GroundsAssignment_10_1_1_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2168:1: ( ( rule__Argument__GroundsAssignment_10_1_1_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2169:1: ( rule__Argument__GroundsAssignment_10_1_1_1 )
            {
             before(grammarAccess.getArgumentAccess().getGroundsAssignment_10_1_1_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2170:1: ( rule__Argument__GroundsAssignment_10_1_1_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2170:2: rule__Argument__GroundsAssignment_10_1_1_1
            {
            pushFollow(FOLLOW_rule__Argument__GroundsAssignment_10_1_1_1_in_rule__Argument__Group_10_1_1__1__Impl4414);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2184:1: rule__Argument__Group_10_2__0 : rule__Argument__Group_10_2__0__Impl rule__Argument__Group_10_2__1 ;
    public final void rule__Argument__Group_10_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2188:1: ( rule__Argument__Group_10_2__0__Impl rule__Argument__Group_10_2__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2189:2: rule__Argument__Group_10_2__0__Impl rule__Argument__Group_10_2__1
            {
            pushFollow(FOLLOW_rule__Argument__Group_10_2__0__Impl_in_rule__Argument__Group_10_2__04448);
            rule__Argument__Group_10_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group_10_2__1_in_rule__Argument__Group_10_2__04451);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2196:1: rule__Argument__Group_10_2__0__Impl : ( 'warranted by' ) ;
    public final void rule__Argument__Group_10_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2200:1: ( ( 'warranted by' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2201:1: ( 'warranted by' )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2201:1: ( 'warranted by' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2202:1: 'warranted by'
            {
             before(grammarAccess.getArgumentAccess().getWarrantedByKeyword_10_2_0()); 
            match(input,31,FOLLOW_31_in_rule__Argument__Group_10_2__0__Impl4479); 
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2215:1: rule__Argument__Group_10_2__1 : rule__Argument__Group_10_2__1__Impl ;
    public final void rule__Argument__Group_10_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2219:1: ( rule__Argument__Group_10_2__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2220:2: rule__Argument__Group_10_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Argument__Group_10_2__1__Impl_in_rule__Argument__Group_10_2__14510);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2226:1: rule__Argument__Group_10_2__1__Impl : ( ( rule__Argument__Group_10_2_1__0 )* ) ;
    public final void rule__Argument__Group_10_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2230:1: ( ( ( rule__Argument__Group_10_2_1__0 )* ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2231:1: ( ( rule__Argument__Group_10_2_1__0 )* )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2231:1: ( ( rule__Argument__Group_10_2_1__0 )* )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2232:1: ( rule__Argument__Group_10_2_1__0 )*
            {
             before(grammarAccess.getArgumentAccess().getGroup_10_2_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2233:1: ( rule__Argument__Group_10_2_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID||LA25_0==30) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2233:2: rule__Argument__Group_10_2_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Argument__Group_10_2_1__0_in_rule__Argument__Group_10_2__1__Impl4537);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2247:1: rule__Argument__Group_10_2_1__0 : rule__Argument__Group_10_2_1__0__Impl rule__Argument__Group_10_2_1__1 ;
    public final void rule__Argument__Group_10_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2251:1: ( rule__Argument__Group_10_2_1__0__Impl rule__Argument__Group_10_2_1__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2252:2: rule__Argument__Group_10_2_1__0__Impl rule__Argument__Group_10_2_1__1
            {
            pushFollow(FOLLOW_rule__Argument__Group_10_2_1__0__Impl_in_rule__Argument__Group_10_2_1__04572);
            rule__Argument__Group_10_2_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group_10_2_1__1_in_rule__Argument__Group_10_2_1__04575);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2259:1: rule__Argument__Group_10_2_1__0__Impl : ( ( ',' )? ) ;
    public final void rule__Argument__Group_10_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2263:1: ( ( ( ',' )? ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2264:1: ( ( ',' )? )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2264:1: ( ( ',' )? )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2265:1: ( ',' )?
            {
             before(grammarAccess.getArgumentAccess().getCommaKeyword_10_2_1_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2266:1: ( ',' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==30) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2267:2: ','
                    {
                    match(input,30,FOLLOW_30_in_rule__Argument__Group_10_2_1__0__Impl4604); 

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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2278:1: rule__Argument__Group_10_2_1__1 : rule__Argument__Group_10_2_1__1__Impl ;
    public final void rule__Argument__Group_10_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2282:1: ( rule__Argument__Group_10_2_1__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2283:2: rule__Argument__Group_10_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Argument__Group_10_2_1__1__Impl_in_rule__Argument__Group_10_2_1__14637);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2289:1: rule__Argument__Group_10_2_1__1__Impl : ( ( rule__Argument__WarrantsAssignment_10_2_1_1 ) ) ;
    public final void rule__Argument__Group_10_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2293:1: ( ( ( rule__Argument__WarrantsAssignment_10_2_1_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2294:1: ( ( rule__Argument__WarrantsAssignment_10_2_1_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2294:1: ( ( rule__Argument__WarrantsAssignment_10_2_1_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2295:1: ( rule__Argument__WarrantsAssignment_10_2_1_1 )
            {
             before(grammarAccess.getArgumentAccess().getWarrantsAssignment_10_2_1_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2296:1: ( rule__Argument__WarrantsAssignment_10_2_1_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2296:2: rule__Argument__WarrantsAssignment_10_2_1_1
            {
            pushFollow(FOLLOW_rule__Argument__WarrantsAssignment_10_2_1_1_in_rule__Argument__Group_10_2_1__1__Impl4664);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2310:1: rule__AssignmentOp__Group__0 : rule__AssignmentOp__Group__0__Impl rule__AssignmentOp__Group__1 ;
    public final void rule__AssignmentOp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2314:1: ( rule__AssignmentOp__Group__0__Impl rule__AssignmentOp__Group__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2315:2: rule__AssignmentOp__Group__0__Impl rule__AssignmentOp__Group__1
            {
            pushFollow(FOLLOW_rule__AssignmentOp__Group__0__Impl_in_rule__AssignmentOp__Group__04698);
            rule__AssignmentOp__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AssignmentOp__Group__1_in_rule__AssignmentOp__Group__04701);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2322:1: rule__AssignmentOp__Group__0__Impl : ( ruleOrExp ) ;
    public final void rule__AssignmentOp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2326:1: ( ( ruleOrExp ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2327:1: ( ruleOrExp )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2327:1: ( ruleOrExp )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2328:1: ruleOrExp
            {
             before(grammarAccess.getAssignmentOpAccess().getOrExpParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleOrExp_in_rule__AssignmentOp__Group__0__Impl4728);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2339:1: rule__AssignmentOp__Group__1 : rule__AssignmentOp__Group__1__Impl ;
    public final void rule__AssignmentOp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2343:1: ( rule__AssignmentOp__Group__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2344:2: rule__AssignmentOp__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AssignmentOp__Group__1__Impl_in_rule__AssignmentOp__Group__14757);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2350:1: rule__AssignmentOp__Group__1__Impl : ( ( rule__AssignmentOp__Group_1__0 )? ) ;
    public final void rule__AssignmentOp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2354:1: ( ( ( rule__AssignmentOp__Group_1__0 )? ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2355:1: ( ( rule__AssignmentOp__Group_1__0 )? )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2355:1: ( ( rule__AssignmentOp__Group_1__0 )? )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2356:1: ( rule__AssignmentOp__Group_1__0 )?
            {
             before(grammarAccess.getAssignmentOpAccess().getGroup_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2357:1: ( rule__AssignmentOp__Group_1__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=35 && LA27_0<=36)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2357:2: rule__AssignmentOp__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__AssignmentOp__Group_1__0_in_rule__AssignmentOp__Group__1__Impl4784);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2371:1: rule__AssignmentOp__Group_1__0 : rule__AssignmentOp__Group_1__0__Impl rule__AssignmentOp__Group_1__1 ;
    public final void rule__AssignmentOp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2375:1: ( rule__AssignmentOp__Group_1__0__Impl rule__AssignmentOp__Group_1__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2376:2: rule__AssignmentOp__Group_1__0__Impl rule__AssignmentOp__Group_1__1
            {
            pushFollow(FOLLOW_rule__AssignmentOp__Group_1__0__Impl_in_rule__AssignmentOp__Group_1__04819);
            rule__AssignmentOp__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AssignmentOp__Group_1__1_in_rule__AssignmentOp__Group_1__04822);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2383:1: rule__AssignmentOp__Group_1__0__Impl : ( ( rule__AssignmentOp__Alternatives_1_0 ) ) ;
    public final void rule__AssignmentOp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2387:1: ( ( ( rule__AssignmentOp__Alternatives_1_0 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2388:1: ( ( rule__AssignmentOp__Alternatives_1_0 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2388:1: ( ( rule__AssignmentOp__Alternatives_1_0 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2389:1: ( rule__AssignmentOp__Alternatives_1_0 )
            {
             before(grammarAccess.getAssignmentOpAccess().getAlternatives_1_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2390:1: ( rule__AssignmentOp__Alternatives_1_0 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2390:2: rule__AssignmentOp__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__AssignmentOp__Alternatives_1_0_in_rule__AssignmentOp__Group_1__0__Impl4849);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2400:1: rule__AssignmentOp__Group_1__1 : rule__AssignmentOp__Group_1__1__Impl ;
    public final void rule__AssignmentOp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2404:1: ( rule__AssignmentOp__Group_1__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2405:2: rule__AssignmentOp__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AssignmentOp__Group_1__1__Impl_in_rule__AssignmentOp__Group_1__14879);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2411:1: rule__AssignmentOp__Group_1__1__Impl : ( ( rule__AssignmentOp__RightAssignment_1_1 ) ) ;
    public final void rule__AssignmentOp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2415:1: ( ( ( rule__AssignmentOp__RightAssignment_1_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2416:1: ( ( rule__AssignmentOp__RightAssignment_1_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2416:1: ( ( rule__AssignmentOp__RightAssignment_1_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2417:1: ( rule__AssignmentOp__RightAssignment_1_1 )
            {
             before(grammarAccess.getAssignmentOpAccess().getRightAssignment_1_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2418:1: ( rule__AssignmentOp__RightAssignment_1_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2418:2: rule__AssignmentOp__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__AssignmentOp__RightAssignment_1_1_in_rule__AssignmentOp__Group_1__1__Impl4906);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2432:1: rule__AssignmentOp__Group_1_0_0__0 : rule__AssignmentOp__Group_1_0_0__0__Impl rule__AssignmentOp__Group_1_0_0__1 ;
    public final void rule__AssignmentOp__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2436:1: ( rule__AssignmentOp__Group_1_0_0__0__Impl rule__AssignmentOp__Group_1_0_0__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2437:2: rule__AssignmentOp__Group_1_0_0__0__Impl rule__AssignmentOp__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__AssignmentOp__Group_1_0_0__0__Impl_in_rule__AssignmentOp__Group_1_0_0__04940);
            rule__AssignmentOp__Group_1_0_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AssignmentOp__Group_1_0_0__1_in_rule__AssignmentOp__Group_1_0_0__04943);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2444:1: rule__AssignmentOp__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__AssignmentOp__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2448:1: ( ( () ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2449:1: ( () )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2449:1: ( () )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2450:1: ()
            {
             before(grammarAccess.getAssignmentOpAccess().getAssignPlusLeftAction_1_0_0_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2451:1: ()
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2453:1: 
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2463:1: rule__AssignmentOp__Group_1_0_0__1 : rule__AssignmentOp__Group_1_0_0__1__Impl ;
    public final void rule__AssignmentOp__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2467:1: ( rule__AssignmentOp__Group_1_0_0__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2468:2: rule__AssignmentOp__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__AssignmentOp__Group_1_0_0__1__Impl_in_rule__AssignmentOp__Group_1_0_0__15001);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2474:1: rule__AssignmentOp__Group_1_0_0__1__Impl : ( ( rule__AssignmentOp__AopAssignment_1_0_0_1 ) ) ;
    public final void rule__AssignmentOp__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2478:1: ( ( ( rule__AssignmentOp__AopAssignment_1_0_0_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2479:1: ( ( rule__AssignmentOp__AopAssignment_1_0_0_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2479:1: ( ( rule__AssignmentOp__AopAssignment_1_0_0_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2480:1: ( rule__AssignmentOp__AopAssignment_1_0_0_1 )
            {
             before(grammarAccess.getAssignmentOpAccess().getAopAssignment_1_0_0_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2481:1: ( rule__AssignmentOp__AopAssignment_1_0_0_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2481:2: rule__AssignmentOp__AopAssignment_1_0_0_1
            {
            pushFollow(FOLLOW_rule__AssignmentOp__AopAssignment_1_0_0_1_in_rule__AssignmentOp__Group_1_0_0__1__Impl5028);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2495:1: rule__AssignmentOp__Group_1_0_1__0 : rule__AssignmentOp__Group_1_0_1__0__Impl rule__AssignmentOp__Group_1_0_1__1 ;
    public final void rule__AssignmentOp__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2499:1: ( rule__AssignmentOp__Group_1_0_1__0__Impl rule__AssignmentOp__Group_1_0_1__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2500:2: rule__AssignmentOp__Group_1_0_1__0__Impl rule__AssignmentOp__Group_1_0_1__1
            {
            pushFollow(FOLLOW_rule__AssignmentOp__Group_1_0_1__0__Impl_in_rule__AssignmentOp__Group_1_0_1__05062);
            rule__AssignmentOp__Group_1_0_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AssignmentOp__Group_1_0_1__1_in_rule__AssignmentOp__Group_1_0_1__05065);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2507:1: rule__AssignmentOp__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__AssignmentOp__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2511:1: ( ( () ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2512:1: ( () )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2512:1: ( () )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2513:1: ()
            {
             before(grammarAccess.getAssignmentOpAccess().getAssignMinLeftAction_1_0_1_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2514:1: ()
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2516:1: 
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2526:1: rule__AssignmentOp__Group_1_0_1__1 : rule__AssignmentOp__Group_1_0_1__1__Impl ;
    public final void rule__AssignmentOp__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2530:1: ( rule__AssignmentOp__Group_1_0_1__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2531:2: rule__AssignmentOp__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AssignmentOp__Group_1_0_1__1__Impl_in_rule__AssignmentOp__Group_1_0_1__15123);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2537:1: rule__AssignmentOp__Group_1_0_1__1__Impl : ( ( rule__AssignmentOp__AopAssignment_1_0_1_1 ) ) ;
    public final void rule__AssignmentOp__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2541:1: ( ( ( rule__AssignmentOp__AopAssignment_1_0_1_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2542:1: ( ( rule__AssignmentOp__AopAssignment_1_0_1_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2542:1: ( ( rule__AssignmentOp__AopAssignment_1_0_1_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2543:1: ( rule__AssignmentOp__AopAssignment_1_0_1_1 )
            {
             before(grammarAccess.getAssignmentOpAccess().getAopAssignment_1_0_1_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2544:1: ( rule__AssignmentOp__AopAssignment_1_0_1_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2544:2: rule__AssignmentOp__AopAssignment_1_0_1_1
            {
            pushFollow(FOLLOW_rule__AssignmentOp__AopAssignment_1_0_1_1_in_rule__AssignmentOp__Group_1_0_1__1__Impl5150);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2558:1: rule__OrExp__Group__0 : rule__OrExp__Group__0__Impl rule__OrExp__Group__1 ;
    public final void rule__OrExp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2562:1: ( rule__OrExp__Group__0__Impl rule__OrExp__Group__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2563:2: rule__OrExp__Group__0__Impl rule__OrExp__Group__1
            {
            pushFollow(FOLLOW_rule__OrExp__Group__0__Impl_in_rule__OrExp__Group__05184);
            rule__OrExp__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__OrExp__Group__1_in_rule__OrExp__Group__05187);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2570:1: rule__OrExp__Group__0__Impl : ( ruleAndExp ) ;
    public final void rule__OrExp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2574:1: ( ( ruleAndExp ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2575:1: ( ruleAndExp )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2575:1: ( ruleAndExp )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2576:1: ruleAndExp
            {
             before(grammarAccess.getOrExpAccess().getAndExpParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAndExp_in_rule__OrExp__Group__0__Impl5214);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2587:1: rule__OrExp__Group__1 : rule__OrExp__Group__1__Impl ;
    public final void rule__OrExp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2591:1: ( rule__OrExp__Group__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2592:2: rule__OrExp__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__OrExp__Group__1__Impl_in_rule__OrExp__Group__15243);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2598:1: rule__OrExp__Group__1__Impl : ( ( rule__OrExp__Group_1__0 )* ) ;
    public final void rule__OrExp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2602:1: ( ( ( rule__OrExp__Group_1__0 )* ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2603:1: ( ( rule__OrExp__Group_1__0 )* )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2603:1: ( ( rule__OrExp__Group_1__0 )* )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2604:1: ( rule__OrExp__Group_1__0 )*
            {
             before(grammarAccess.getOrExpAccess().getGroup_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2605:1: ( rule__OrExp__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==37) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2605:2: rule__OrExp__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__OrExp__Group_1__0_in_rule__OrExp__Group__1__Impl5270);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2619:1: rule__OrExp__Group_1__0 : rule__OrExp__Group_1__0__Impl rule__OrExp__Group_1__1 ;
    public final void rule__OrExp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2623:1: ( rule__OrExp__Group_1__0__Impl rule__OrExp__Group_1__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2624:2: rule__OrExp__Group_1__0__Impl rule__OrExp__Group_1__1
            {
            pushFollow(FOLLOW_rule__OrExp__Group_1__0__Impl_in_rule__OrExp__Group_1__05305);
            rule__OrExp__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__OrExp__Group_1__1_in_rule__OrExp__Group_1__05308);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2631:1: rule__OrExp__Group_1__0__Impl : ( () ) ;
    public final void rule__OrExp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2635:1: ( ( () ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2636:1: ( () )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2636:1: ( () )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2637:1: ()
            {
             before(grammarAccess.getOrExpAccess().getOrLeftAction_1_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2638:1: ()
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2640:1: 
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2650:1: rule__OrExp__Group_1__1 : rule__OrExp__Group_1__1__Impl rule__OrExp__Group_1__2 ;
    public final void rule__OrExp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2654:1: ( rule__OrExp__Group_1__1__Impl rule__OrExp__Group_1__2 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2655:2: rule__OrExp__Group_1__1__Impl rule__OrExp__Group_1__2
            {
            pushFollow(FOLLOW_rule__OrExp__Group_1__1__Impl_in_rule__OrExp__Group_1__15366);
            rule__OrExp__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__OrExp__Group_1__2_in_rule__OrExp__Group_1__15369);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2662:1: rule__OrExp__Group_1__1__Impl : ( ( rule__OrExp__Or_opAssignment_1_1 ) ) ;
    public final void rule__OrExp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2666:1: ( ( ( rule__OrExp__Or_opAssignment_1_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2667:1: ( ( rule__OrExp__Or_opAssignment_1_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2667:1: ( ( rule__OrExp__Or_opAssignment_1_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2668:1: ( rule__OrExp__Or_opAssignment_1_1 )
            {
             before(grammarAccess.getOrExpAccess().getOr_opAssignment_1_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2669:1: ( rule__OrExp__Or_opAssignment_1_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2669:2: rule__OrExp__Or_opAssignment_1_1
            {
            pushFollow(FOLLOW_rule__OrExp__Or_opAssignment_1_1_in_rule__OrExp__Group_1__1__Impl5396);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2679:1: rule__OrExp__Group_1__2 : rule__OrExp__Group_1__2__Impl ;
    public final void rule__OrExp__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2683:1: ( rule__OrExp__Group_1__2__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2684:2: rule__OrExp__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__OrExp__Group_1__2__Impl_in_rule__OrExp__Group_1__25426);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2690:1: rule__OrExp__Group_1__2__Impl : ( ( rule__OrExp__RightAssignment_1_2 ) ) ;
    public final void rule__OrExp__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2694:1: ( ( ( rule__OrExp__RightAssignment_1_2 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2695:1: ( ( rule__OrExp__RightAssignment_1_2 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2695:1: ( ( rule__OrExp__RightAssignment_1_2 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2696:1: ( rule__OrExp__RightAssignment_1_2 )
            {
             before(grammarAccess.getOrExpAccess().getRightAssignment_1_2()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2697:1: ( rule__OrExp__RightAssignment_1_2 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2697:2: rule__OrExp__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__OrExp__RightAssignment_1_2_in_rule__OrExp__Group_1__2__Impl5453);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2713:1: rule__AndExp__Group__0 : rule__AndExp__Group__0__Impl rule__AndExp__Group__1 ;
    public final void rule__AndExp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2717:1: ( rule__AndExp__Group__0__Impl rule__AndExp__Group__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2718:2: rule__AndExp__Group__0__Impl rule__AndExp__Group__1
            {
            pushFollow(FOLLOW_rule__AndExp__Group__0__Impl_in_rule__AndExp__Group__05489);
            rule__AndExp__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AndExp__Group__1_in_rule__AndExp__Group__05492);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2725:1: rule__AndExp__Group__0__Impl : ( ruleRelational ) ;
    public final void rule__AndExp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2729:1: ( ( ruleRelational ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2730:1: ( ruleRelational )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2730:1: ( ruleRelational )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2731:1: ruleRelational
            {
             before(grammarAccess.getAndExpAccess().getRelationalParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleRelational_in_rule__AndExp__Group__0__Impl5519);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2742:1: rule__AndExp__Group__1 : rule__AndExp__Group__1__Impl ;
    public final void rule__AndExp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2746:1: ( rule__AndExp__Group__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2747:2: rule__AndExp__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AndExp__Group__1__Impl_in_rule__AndExp__Group__15548);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2753:1: rule__AndExp__Group__1__Impl : ( ( rule__AndExp__Group_1__0 )* ) ;
    public final void rule__AndExp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2757:1: ( ( ( rule__AndExp__Group_1__0 )* ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2758:1: ( ( rule__AndExp__Group_1__0 )* )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2758:1: ( ( rule__AndExp__Group_1__0 )* )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2759:1: ( rule__AndExp__Group_1__0 )*
            {
             before(grammarAccess.getAndExpAccess().getGroup_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2760:1: ( rule__AndExp__Group_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==38) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2760:2: rule__AndExp__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AndExp__Group_1__0_in_rule__AndExp__Group__1__Impl5575);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2774:1: rule__AndExp__Group_1__0 : rule__AndExp__Group_1__0__Impl rule__AndExp__Group_1__1 ;
    public final void rule__AndExp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2778:1: ( rule__AndExp__Group_1__0__Impl rule__AndExp__Group_1__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2779:2: rule__AndExp__Group_1__0__Impl rule__AndExp__Group_1__1
            {
            pushFollow(FOLLOW_rule__AndExp__Group_1__0__Impl_in_rule__AndExp__Group_1__05610);
            rule__AndExp__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AndExp__Group_1__1_in_rule__AndExp__Group_1__05613);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2786:1: rule__AndExp__Group_1__0__Impl : ( () ) ;
    public final void rule__AndExp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2790:1: ( ( () ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2791:1: ( () )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2791:1: ( () )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2792:1: ()
            {
             before(grammarAccess.getAndExpAccess().getAndLeftAction_1_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2793:1: ()
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2795:1: 
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2805:1: rule__AndExp__Group_1__1 : rule__AndExp__Group_1__1__Impl rule__AndExp__Group_1__2 ;
    public final void rule__AndExp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2809:1: ( rule__AndExp__Group_1__1__Impl rule__AndExp__Group_1__2 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2810:2: rule__AndExp__Group_1__1__Impl rule__AndExp__Group_1__2
            {
            pushFollow(FOLLOW_rule__AndExp__Group_1__1__Impl_in_rule__AndExp__Group_1__15671);
            rule__AndExp__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AndExp__Group_1__2_in_rule__AndExp__Group_1__15674);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2817:1: rule__AndExp__Group_1__1__Impl : ( ( rule__AndExp__And_opAssignment_1_1 ) ) ;
    public final void rule__AndExp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2821:1: ( ( ( rule__AndExp__And_opAssignment_1_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2822:1: ( ( rule__AndExp__And_opAssignment_1_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2822:1: ( ( rule__AndExp__And_opAssignment_1_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2823:1: ( rule__AndExp__And_opAssignment_1_1 )
            {
             before(grammarAccess.getAndExpAccess().getAnd_opAssignment_1_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2824:1: ( rule__AndExp__And_opAssignment_1_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2824:2: rule__AndExp__And_opAssignment_1_1
            {
            pushFollow(FOLLOW_rule__AndExp__And_opAssignment_1_1_in_rule__AndExp__Group_1__1__Impl5701);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2834:1: rule__AndExp__Group_1__2 : rule__AndExp__Group_1__2__Impl ;
    public final void rule__AndExp__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2838:1: ( rule__AndExp__Group_1__2__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2839:2: rule__AndExp__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__AndExp__Group_1__2__Impl_in_rule__AndExp__Group_1__25731);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2845:1: rule__AndExp__Group_1__2__Impl : ( ( rule__AndExp__RightAssignment_1_2 ) ) ;
    public final void rule__AndExp__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2849:1: ( ( ( rule__AndExp__RightAssignment_1_2 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2850:1: ( ( rule__AndExp__RightAssignment_1_2 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2850:1: ( ( rule__AndExp__RightAssignment_1_2 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2851:1: ( rule__AndExp__RightAssignment_1_2 )
            {
             before(grammarAccess.getAndExpAccess().getRightAssignment_1_2()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2852:1: ( rule__AndExp__RightAssignment_1_2 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2852:2: rule__AndExp__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__AndExp__RightAssignment_1_2_in_rule__AndExp__Group_1__2__Impl5758);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2868:1: rule__Relational__Group__0 : rule__Relational__Group__0__Impl rule__Relational__Group__1 ;
    public final void rule__Relational__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2872:1: ( rule__Relational__Group__0__Impl rule__Relational__Group__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2873:2: rule__Relational__Group__0__Impl rule__Relational__Group__1
            {
            pushFollow(FOLLOW_rule__Relational__Group__0__Impl_in_rule__Relational__Group__05794);
            rule__Relational__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Relational__Group__1_in_rule__Relational__Group__05797);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2880:1: rule__Relational__Group__0__Impl : ( ruleAddition ) ;
    public final void rule__Relational__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2884:1: ( ( ruleAddition ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2885:1: ( ruleAddition )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2885:1: ( ruleAddition )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2886:1: ruleAddition
            {
             before(grammarAccess.getRelationalAccess().getAdditionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAddition_in_rule__Relational__Group__0__Impl5824);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2897:1: rule__Relational__Group__1 : rule__Relational__Group__1__Impl ;
    public final void rule__Relational__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2901:1: ( rule__Relational__Group__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2902:2: rule__Relational__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Relational__Group__1__Impl_in_rule__Relational__Group__15853);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2908:1: rule__Relational__Group__1__Impl : ( ( rule__Relational__Group_1__0 )? ) ;
    public final void rule__Relational__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2912:1: ( ( ( rule__Relational__Group_1__0 )? ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2913:1: ( ( rule__Relational__Group_1__0 )? )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2913:1: ( ( rule__Relational__Group_1__0 )? )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2914:1: ( rule__Relational__Group_1__0 )?
            {
             before(grammarAccess.getRelationalAccess().getGroup_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2915:1: ( rule__Relational__Group_1__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=39 && LA30_0<=45)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2915:2: rule__Relational__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Relational__Group_1__0_in_rule__Relational__Group__1__Impl5880);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2929:1: rule__Relational__Group_1__0 : rule__Relational__Group_1__0__Impl rule__Relational__Group_1__1 ;
    public final void rule__Relational__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2933:1: ( rule__Relational__Group_1__0__Impl rule__Relational__Group_1__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2934:2: rule__Relational__Group_1__0__Impl rule__Relational__Group_1__1
            {
            pushFollow(FOLLOW_rule__Relational__Group_1__0__Impl_in_rule__Relational__Group_1__05915);
            rule__Relational__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Relational__Group_1__1_in_rule__Relational__Group_1__05918);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2941:1: rule__Relational__Group_1__0__Impl : ( ( rule__Relational__Alternatives_1_0 ) ) ;
    public final void rule__Relational__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2945:1: ( ( ( rule__Relational__Alternatives_1_0 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2946:1: ( ( rule__Relational__Alternatives_1_0 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2946:1: ( ( rule__Relational__Alternatives_1_0 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2947:1: ( rule__Relational__Alternatives_1_0 )
            {
             before(grammarAccess.getRelationalAccess().getAlternatives_1_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2948:1: ( rule__Relational__Alternatives_1_0 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2948:2: rule__Relational__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__Relational__Alternatives_1_0_in_rule__Relational__Group_1__0__Impl5945);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2958:1: rule__Relational__Group_1__1 : rule__Relational__Group_1__1__Impl ;
    public final void rule__Relational__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2962:1: ( rule__Relational__Group_1__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2963:2: rule__Relational__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Relational__Group_1__1__Impl_in_rule__Relational__Group_1__15975);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2969:1: rule__Relational__Group_1__1__Impl : ( ( rule__Relational__RightAssignment_1_1 ) ) ;
    public final void rule__Relational__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2973:1: ( ( ( rule__Relational__RightAssignment_1_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2974:1: ( ( rule__Relational__RightAssignment_1_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2974:1: ( ( rule__Relational__RightAssignment_1_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2975:1: ( rule__Relational__RightAssignment_1_1 )
            {
             before(grammarAccess.getRelationalAccess().getRightAssignment_1_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2976:1: ( rule__Relational__RightAssignment_1_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2976:2: rule__Relational__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Relational__RightAssignment_1_1_in_rule__Relational__Group_1__1__Impl6002);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2990:1: rule__Relational__Group_1_0_0__0 : rule__Relational__Group_1_0_0__0__Impl rule__Relational__Group_1_0_0__1 ;
    public final void rule__Relational__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2994:1: ( rule__Relational__Group_1_0_0__0__Impl rule__Relational__Group_1_0_0__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2995:2: rule__Relational__Group_1_0_0__0__Impl rule__Relational__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__Relational__Group_1_0_0__0__Impl_in_rule__Relational__Group_1_0_0__06036);
            rule__Relational__Group_1_0_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Relational__Group_1_0_0__1_in_rule__Relational__Group_1_0_0__06039);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3002:1: rule__Relational__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Relational__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3006:1: ( ( () ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3007:1: ( () )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3007:1: ( () )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3008:1: ()
            {
             before(grammarAccess.getRelationalAccess().getRelNotEqLeftAction_1_0_0_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3009:1: ()
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3011:1: 
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3021:1: rule__Relational__Group_1_0_0__1 : rule__Relational__Group_1_0_0__1__Impl ;
    public final void rule__Relational__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3025:1: ( rule__Relational__Group_1_0_0__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3026:2: rule__Relational__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Relational__Group_1_0_0__1__Impl_in_rule__Relational__Group_1_0_0__16097);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3032:1: rule__Relational__Group_1_0_0__1__Impl : ( ( rule__Relational__Rel_opAssignment_1_0_0_1 ) ) ;
    public final void rule__Relational__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3036:1: ( ( ( rule__Relational__Rel_opAssignment_1_0_0_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3037:1: ( ( rule__Relational__Rel_opAssignment_1_0_0_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3037:1: ( ( rule__Relational__Rel_opAssignment_1_0_0_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3038:1: ( rule__Relational__Rel_opAssignment_1_0_0_1 )
            {
             before(grammarAccess.getRelationalAccess().getRel_opAssignment_1_0_0_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3039:1: ( rule__Relational__Rel_opAssignment_1_0_0_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3039:2: rule__Relational__Rel_opAssignment_1_0_0_1
            {
            pushFollow(FOLLOW_rule__Relational__Rel_opAssignment_1_0_0_1_in_rule__Relational__Group_1_0_0__1__Impl6124);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3053:1: rule__Relational__Group_1_0_1__0 : rule__Relational__Group_1_0_1__0__Impl rule__Relational__Group_1_0_1__1 ;
    public final void rule__Relational__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3057:1: ( rule__Relational__Group_1_0_1__0__Impl rule__Relational__Group_1_0_1__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3058:2: rule__Relational__Group_1_0_1__0__Impl rule__Relational__Group_1_0_1__1
            {
            pushFollow(FOLLOW_rule__Relational__Group_1_0_1__0__Impl_in_rule__Relational__Group_1_0_1__06158);
            rule__Relational__Group_1_0_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Relational__Group_1_0_1__1_in_rule__Relational__Group_1_0_1__06161);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3065:1: rule__Relational__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Relational__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3069:1: ( ( () ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3070:1: ( () )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3070:1: ( () )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3071:1: ()
            {
             before(grammarAccess.getRelationalAccess().getRelEqEqLeftAction_1_0_1_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3072:1: ()
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3074:1: 
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3084:1: rule__Relational__Group_1_0_1__1 : rule__Relational__Group_1_0_1__1__Impl ;
    public final void rule__Relational__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3088:1: ( rule__Relational__Group_1_0_1__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3089:2: rule__Relational__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Relational__Group_1_0_1__1__Impl_in_rule__Relational__Group_1_0_1__16219);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3095:1: rule__Relational__Group_1_0_1__1__Impl : ( ( rule__Relational__Rel_opAssignment_1_0_1_1 ) ) ;
    public final void rule__Relational__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3099:1: ( ( ( rule__Relational__Rel_opAssignment_1_0_1_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3100:1: ( ( rule__Relational__Rel_opAssignment_1_0_1_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3100:1: ( ( rule__Relational__Rel_opAssignment_1_0_1_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3101:1: ( rule__Relational__Rel_opAssignment_1_0_1_1 )
            {
             before(grammarAccess.getRelationalAccess().getRel_opAssignment_1_0_1_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3102:1: ( rule__Relational__Rel_opAssignment_1_0_1_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3102:2: rule__Relational__Rel_opAssignment_1_0_1_1
            {
            pushFollow(FOLLOW_rule__Relational__Rel_opAssignment_1_0_1_1_in_rule__Relational__Group_1_0_1__1__Impl6246);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3116:1: rule__Relational__Group_1_0_2__0 : rule__Relational__Group_1_0_2__0__Impl rule__Relational__Group_1_0_2__1 ;
    public final void rule__Relational__Group_1_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3120:1: ( rule__Relational__Group_1_0_2__0__Impl rule__Relational__Group_1_0_2__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3121:2: rule__Relational__Group_1_0_2__0__Impl rule__Relational__Group_1_0_2__1
            {
            pushFollow(FOLLOW_rule__Relational__Group_1_0_2__0__Impl_in_rule__Relational__Group_1_0_2__06280);
            rule__Relational__Group_1_0_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Relational__Group_1_0_2__1_in_rule__Relational__Group_1_0_2__06283);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3128:1: rule__Relational__Group_1_0_2__0__Impl : ( () ) ;
    public final void rule__Relational__Group_1_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3132:1: ( ( () ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3133:1: ( () )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3133:1: ( () )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3134:1: ()
            {
             before(grammarAccess.getRelationalAccess().getRelLtEqLeftAction_1_0_2_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3135:1: ()
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3137:1: 
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3147:1: rule__Relational__Group_1_0_2__1 : rule__Relational__Group_1_0_2__1__Impl ;
    public final void rule__Relational__Group_1_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3151:1: ( rule__Relational__Group_1_0_2__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3152:2: rule__Relational__Group_1_0_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Relational__Group_1_0_2__1__Impl_in_rule__Relational__Group_1_0_2__16341);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3158:1: rule__Relational__Group_1_0_2__1__Impl : ( ( rule__Relational__Rel_opAssignment_1_0_2_1 ) ) ;
    public final void rule__Relational__Group_1_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3162:1: ( ( ( rule__Relational__Rel_opAssignment_1_0_2_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3163:1: ( ( rule__Relational__Rel_opAssignment_1_0_2_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3163:1: ( ( rule__Relational__Rel_opAssignment_1_0_2_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3164:1: ( rule__Relational__Rel_opAssignment_1_0_2_1 )
            {
             before(grammarAccess.getRelationalAccess().getRel_opAssignment_1_0_2_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3165:1: ( rule__Relational__Rel_opAssignment_1_0_2_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3165:2: rule__Relational__Rel_opAssignment_1_0_2_1
            {
            pushFollow(FOLLOW_rule__Relational__Rel_opAssignment_1_0_2_1_in_rule__Relational__Group_1_0_2__1__Impl6368);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3179:1: rule__Relational__Group_1_0_3__0 : rule__Relational__Group_1_0_3__0__Impl rule__Relational__Group_1_0_3__1 ;
    public final void rule__Relational__Group_1_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3183:1: ( rule__Relational__Group_1_0_3__0__Impl rule__Relational__Group_1_0_3__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3184:2: rule__Relational__Group_1_0_3__0__Impl rule__Relational__Group_1_0_3__1
            {
            pushFollow(FOLLOW_rule__Relational__Group_1_0_3__0__Impl_in_rule__Relational__Group_1_0_3__06402);
            rule__Relational__Group_1_0_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Relational__Group_1_0_3__1_in_rule__Relational__Group_1_0_3__06405);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3191:1: rule__Relational__Group_1_0_3__0__Impl : ( () ) ;
    public final void rule__Relational__Group_1_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3195:1: ( ( () ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3196:1: ( () )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3196:1: ( () )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3197:1: ()
            {
             before(grammarAccess.getRelationalAccess().getRelGtEqLeftAction_1_0_3_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3198:1: ()
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3200:1: 
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3210:1: rule__Relational__Group_1_0_3__1 : rule__Relational__Group_1_0_3__1__Impl ;
    public final void rule__Relational__Group_1_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3214:1: ( rule__Relational__Group_1_0_3__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3215:2: rule__Relational__Group_1_0_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Relational__Group_1_0_3__1__Impl_in_rule__Relational__Group_1_0_3__16463);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3221:1: rule__Relational__Group_1_0_3__1__Impl : ( ( rule__Relational__Rel_opAssignment_1_0_3_1 ) ) ;
    public final void rule__Relational__Group_1_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3225:1: ( ( ( rule__Relational__Rel_opAssignment_1_0_3_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3226:1: ( ( rule__Relational__Rel_opAssignment_1_0_3_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3226:1: ( ( rule__Relational__Rel_opAssignment_1_0_3_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3227:1: ( rule__Relational__Rel_opAssignment_1_0_3_1 )
            {
             before(grammarAccess.getRelationalAccess().getRel_opAssignment_1_0_3_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3228:1: ( rule__Relational__Rel_opAssignment_1_0_3_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3228:2: rule__Relational__Rel_opAssignment_1_0_3_1
            {
            pushFollow(FOLLOW_rule__Relational__Rel_opAssignment_1_0_3_1_in_rule__Relational__Group_1_0_3__1__Impl6490);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3242:1: rule__Relational__Group_1_0_4__0 : rule__Relational__Group_1_0_4__0__Impl rule__Relational__Group_1_0_4__1 ;
    public final void rule__Relational__Group_1_0_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3246:1: ( rule__Relational__Group_1_0_4__0__Impl rule__Relational__Group_1_0_4__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3247:2: rule__Relational__Group_1_0_4__0__Impl rule__Relational__Group_1_0_4__1
            {
            pushFollow(FOLLOW_rule__Relational__Group_1_0_4__0__Impl_in_rule__Relational__Group_1_0_4__06524);
            rule__Relational__Group_1_0_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Relational__Group_1_0_4__1_in_rule__Relational__Group_1_0_4__06527);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3254:1: rule__Relational__Group_1_0_4__0__Impl : ( () ) ;
    public final void rule__Relational__Group_1_0_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3258:1: ( ( () ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3259:1: ( () )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3259:1: ( () )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3260:1: ()
            {
             before(grammarAccess.getRelationalAccess().getRelEqLeftAction_1_0_4_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3261:1: ()
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3263:1: 
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3273:1: rule__Relational__Group_1_0_4__1 : rule__Relational__Group_1_0_4__1__Impl ;
    public final void rule__Relational__Group_1_0_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3277:1: ( rule__Relational__Group_1_0_4__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3278:2: rule__Relational__Group_1_0_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Relational__Group_1_0_4__1__Impl_in_rule__Relational__Group_1_0_4__16585);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3284:1: rule__Relational__Group_1_0_4__1__Impl : ( ( rule__Relational__Rel_opAssignment_1_0_4_1 ) ) ;
    public final void rule__Relational__Group_1_0_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3288:1: ( ( ( rule__Relational__Rel_opAssignment_1_0_4_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3289:1: ( ( rule__Relational__Rel_opAssignment_1_0_4_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3289:1: ( ( rule__Relational__Rel_opAssignment_1_0_4_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3290:1: ( rule__Relational__Rel_opAssignment_1_0_4_1 )
            {
             before(grammarAccess.getRelationalAccess().getRel_opAssignment_1_0_4_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3291:1: ( rule__Relational__Rel_opAssignment_1_0_4_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3291:2: rule__Relational__Rel_opAssignment_1_0_4_1
            {
            pushFollow(FOLLOW_rule__Relational__Rel_opAssignment_1_0_4_1_in_rule__Relational__Group_1_0_4__1__Impl6612);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3305:1: rule__Relational__Group_1_0_5__0 : rule__Relational__Group_1_0_5__0__Impl rule__Relational__Group_1_0_5__1 ;
    public final void rule__Relational__Group_1_0_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3309:1: ( rule__Relational__Group_1_0_5__0__Impl rule__Relational__Group_1_0_5__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3310:2: rule__Relational__Group_1_0_5__0__Impl rule__Relational__Group_1_0_5__1
            {
            pushFollow(FOLLOW_rule__Relational__Group_1_0_5__0__Impl_in_rule__Relational__Group_1_0_5__06646);
            rule__Relational__Group_1_0_5__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Relational__Group_1_0_5__1_in_rule__Relational__Group_1_0_5__06649);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3317:1: rule__Relational__Group_1_0_5__0__Impl : ( () ) ;
    public final void rule__Relational__Group_1_0_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3321:1: ( ( () ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3322:1: ( () )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3322:1: ( () )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3323:1: ()
            {
             before(grammarAccess.getRelationalAccess().getRelLtLeftAction_1_0_5_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3324:1: ()
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3326:1: 
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3336:1: rule__Relational__Group_1_0_5__1 : rule__Relational__Group_1_0_5__1__Impl ;
    public final void rule__Relational__Group_1_0_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3340:1: ( rule__Relational__Group_1_0_5__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3341:2: rule__Relational__Group_1_0_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Relational__Group_1_0_5__1__Impl_in_rule__Relational__Group_1_0_5__16707);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3347:1: rule__Relational__Group_1_0_5__1__Impl : ( ( rule__Relational__Rel_opAssignment_1_0_5_1 ) ) ;
    public final void rule__Relational__Group_1_0_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3351:1: ( ( ( rule__Relational__Rel_opAssignment_1_0_5_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3352:1: ( ( rule__Relational__Rel_opAssignment_1_0_5_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3352:1: ( ( rule__Relational__Rel_opAssignment_1_0_5_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3353:1: ( rule__Relational__Rel_opAssignment_1_0_5_1 )
            {
             before(grammarAccess.getRelationalAccess().getRel_opAssignment_1_0_5_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3354:1: ( rule__Relational__Rel_opAssignment_1_0_5_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3354:2: rule__Relational__Rel_opAssignment_1_0_5_1
            {
            pushFollow(FOLLOW_rule__Relational__Rel_opAssignment_1_0_5_1_in_rule__Relational__Group_1_0_5__1__Impl6734);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3368:1: rule__Relational__Group_1_0_6__0 : rule__Relational__Group_1_0_6__0__Impl rule__Relational__Group_1_0_6__1 ;
    public final void rule__Relational__Group_1_0_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3372:1: ( rule__Relational__Group_1_0_6__0__Impl rule__Relational__Group_1_0_6__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3373:2: rule__Relational__Group_1_0_6__0__Impl rule__Relational__Group_1_0_6__1
            {
            pushFollow(FOLLOW_rule__Relational__Group_1_0_6__0__Impl_in_rule__Relational__Group_1_0_6__06768);
            rule__Relational__Group_1_0_6__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Relational__Group_1_0_6__1_in_rule__Relational__Group_1_0_6__06771);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3380:1: rule__Relational__Group_1_0_6__0__Impl : ( () ) ;
    public final void rule__Relational__Group_1_0_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3384:1: ( ( () ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3385:1: ( () )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3385:1: ( () )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3386:1: ()
            {
             before(grammarAccess.getRelationalAccess().getRelGtLeftAction_1_0_6_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3387:1: ()
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3389:1: 
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3399:1: rule__Relational__Group_1_0_6__1 : rule__Relational__Group_1_0_6__1__Impl ;
    public final void rule__Relational__Group_1_0_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3403:1: ( rule__Relational__Group_1_0_6__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3404:2: rule__Relational__Group_1_0_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Relational__Group_1_0_6__1__Impl_in_rule__Relational__Group_1_0_6__16829);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3410:1: rule__Relational__Group_1_0_6__1__Impl : ( ( rule__Relational__Rel_opAssignment_1_0_6_1 ) ) ;
    public final void rule__Relational__Group_1_0_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3414:1: ( ( ( rule__Relational__Rel_opAssignment_1_0_6_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3415:1: ( ( rule__Relational__Rel_opAssignment_1_0_6_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3415:1: ( ( rule__Relational__Rel_opAssignment_1_0_6_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3416:1: ( rule__Relational__Rel_opAssignment_1_0_6_1 )
            {
             before(grammarAccess.getRelationalAccess().getRel_opAssignment_1_0_6_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3417:1: ( rule__Relational__Rel_opAssignment_1_0_6_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3417:2: rule__Relational__Rel_opAssignment_1_0_6_1
            {
            pushFollow(FOLLOW_rule__Relational__Rel_opAssignment_1_0_6_1_in_rule__Relational__Group_1_0_6__1__Impl6856);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3431:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3435:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3436:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
            {
            pushFollow(FOLLOW_rule__Addition__Group__0__Impl_in_rule__Addition__Group__06890);
            rule__Addition__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Addition__Group__1_in_rule__Addition__Group__06893);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3443:1: rule__Addition__Group__0__Impl : ( ruleMultiplication ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3447:1: ( ( ruleMultiplication ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3448:1: ( ruleMultiplication )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3448:1: ( ruleMultiplication )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3449:1: ruleMultiplication
            {
             before(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleMultiplication_in_rule__Addition__Group__0__Impl6920);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3460:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3464:1: ( rule__Addition__Group__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3465:2: rule__Addition__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group__1__Impl_in_rule__Addition__Group__16949);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3471:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__Group_1__0 )* ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3475:1: ( ( ( rule__Addition__Group_1__0 )* ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3476:1: ( ( rule__Addition__Group_1__0 )* )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3476:1: ( ( rule__Addition__Group_1__0 )* )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3477:1: ( rule__Addition__Group_1__0 )*
            {
             before(grammarAccess.getAdditionAccess().getGroup_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3478:1: ( rule__Addition__Group_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==34||LA31_0==46) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3478:2: rule__Addition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Addition__Group_1__0_in_rule__Addition__Group__1__Impl6976);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3492:1: rule__Addition__Group_1__0 : rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 ;
    public final void rule__Addition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3496:1: ( rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3497:2: rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1
            {
            pushFollow(FOLLOW_rule__Addition__Group_1__0__Impl_in_rule__Addition__Group_1__07011);
            rule__Addition__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Addition__Group_1__1_in_rule__Addition__Group_1__07014);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3504:1: rule__Addition__Group_1__0__Impl : ( ( rule__Addition__Alternatives_1_0 ) ) ;
    public final void rule__Addition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3508:1: ( ( ( rule__Addition__Alternatives_1_0 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3509:1: ( ( rule__Addition__Alternatives_1_0 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3509:1: ( ( rule__Addition__Alternatives_1_0 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3510:1: ( rule__Addition__Alternatives_1_0 )
            {
             before(grammarAccess.getAdditionAccess().getAlternatives_1_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3511:1: ( rule__Addition__Alternatives_1_0 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3511:2: rule__Addition__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__Addition__Alternatives_1_0_in_rule__Addition__Group_1__0__Impl7041);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3521:1: rule__Addition__Group_1__1 : rule__Addition__Group_1__1__Impl ;
    public final void rule__Addition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3525:1: ( rule__Addition__Group_1__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3526:2: rule__Addition__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group_1__1__Impl_in_rule__Addition__Group_1__17071);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3532:1: rule__Addition__Group_1__1__Impl : ( ( rule__Addition__RightAssignment_1_1 ) ) ;
    public final void rule__Addition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3536:1: ( ( ( rule__Addition__RightAssignment_1_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3537:1: ( ( rule__Addition__RightAssignment_1_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3537:1: ( ( rule__Addition__RightAssignment_1_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3538:1: ( rule__Addition__RightAssignment_1_1 )
            {
             before(grammarAccess.getAdditionAccess().getRightAssignment_1_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3539:1: ( rule__Addition__RightAssignment_1_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3539:2: rule__Addition__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Addition__RightAssignment_1_1_in_rule__Addition__Group_1__1__Impl7098);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3553:1: rule__Addition__Group_1_0_0__0 : rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1 ;
    public final void rule__Addition__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3557:1: ( rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3558:2: rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0_0__0__Impl_in_rule__Addition__Group_1_0_0__07132);
            rule__Addition__Group_1_0_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Addition__Group_1_0_0__1_in_rule__Addition__Group_1_0_0__07135);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3565:1: rule__Addition__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3569:1: ( ( () ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3570:1: ( () )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3570:1: ( () )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3571:1: ()
            {
             before(grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3572:1: ()
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3574:1: 
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3584:1: rule__Addition__Group_1_0_0__1 : rule__Addition__Group_1_0_0__1__Impl ;
    public final void rule__Addition__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3588:1: ( rule__Addition__Group_1_0_0__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3589:2: rule__Addition__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0_0__1__Impl_in_rule__Addition__Group_1_0_0__17193);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3595:1: rule__Addition__Group_1_0_0__1__Impl : ( ( rule__Addition__Add_opAssignment_1_0_0_1 ) ) ;
    public final void rule__Addition__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3599:1: ( ( ( rule__Addition__Add_opAssignment_1_0_0_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3600:1: ( ( rule__Addition__Add_opAssignment_1_0_0_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3600:1: ( ( rule__Addition__Add_opAssignment_1_0_0_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3601:1: ( rule__Addition__Add_opAssignment_1_0_0_1 )
            {
             before(grammarAccess.getAdditionAccess().getAdd_opAssignment_1_0_0_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3602:1: ( rule__Addition__Add_opAssignment_1_0_0_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3602:2: rule__Addition__Add_opAssignment_1_0_0_1
            {
            pushFollow(FOLLOW_rule__Addition__Add_opAssignment_1_0_0_1_in_rule__Addition__Group_1_0_0__1__Impl7220);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3616:1: rule__Addition__Group_1_0_1__0 : rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1 ;
    public final void rule__Addition__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3620:1: ( rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3621:2: rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0_1__0__Impl_in_rule__Addition__Group_1_0_1__07254);
            rule__Addition__Group_1_0_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Addition__Group_1_0_1__1_in_rule__Addition__Group_1_0_1__07257);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3628:1: rule__Addition__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3632:1: ( ( () ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3633:1: ( () )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3633:1: ( () )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3634:1: ()
            {
             before(grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3635:1: ()
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3637:1: 
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3647:1: rule__Addition__Group_1_0_1__1 : rule__Addition__Group_1_0_1__1__Impl ;
    public final void rule__Addition__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3651:1: ( rule__Addition__Group_1_0_1__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3652:2: rule__Addition__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0_1__1__Impl_in_rule__Addition__Group_1_0_1__17315);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3658:1: rule__Addition__Group_1_0_1__1__Impl : ( ( rule__Addition__Add_opAssignment_1_0_1_1 ) ) ;
    public final void rule__Addition__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3662:1: ( ( ( rule__Addition__Add_opAssignment_1_0_1_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3663:1: ( ( rule__Addition__Add_opAssignment_1_0_1_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3663:1: ( ( rule__Addition__Add_opAssignment_1_0_1_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3664:1: ( rule__Addition__Add_opAssignment_1_0_1_1 )
            {
             before(grammarAccess.getAdditionAccess().getAdd_opAssignment_1_0_1_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3665:1: ( rule__Addition__Add_opAssignment_1_0_1_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3665:2: rule__Addition__Add_opAssignment_1_0_1_1
            {
            pushFollow(FOLLOW_rule__Addition__Add_opAssignment_1_0_1_1_in_rule__Addition__Group_1_0_1__1__Impl7342);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3679:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3683:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3684:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__0__Impl_in_rule__Multiplication__Group__07376);
            rule__Multiplication__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Multiplication__Group__1_in_rule__Multiplication__Group__07379);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3691:1: rule__Multiplication__Group__0__Impl : ( rulePower ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3695:1: ( ( rulePower ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3696:1: ( rulePower )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3696:1: ( rulePower )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3697:1: rulePower
            {
             before(grammarAccess.getMultiplicationAccess().getPowerParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePower_in_rule__Multiplication__Group__0__Impl7406);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3708:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3712:1: ( rule__Multiplication__Group__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3713:2: rule__Multiplication__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__1__Impl_in_rule__Multiplication__Group__17435);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3719:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__Group_1__0 )* ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3723:1: ( ( ( rule__Multiplication__Group_1__0 )* ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3724:1: ( ( rule__Multiplication__Group_1__0 )* )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3724:1: ( ( rule__Multiplication__Group_1__0 )* )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3725:1: ( rule__Multiplication__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3726:1: ( rule__Multiplication__Group_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=47 && LA32_0<=48)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3726:2: rule__Multiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Multiplication__Group_1__0_in_rule__Multiplication__Group__1__Impl7462);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3740:1: rule__Multiplication__Group_1__0 : rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 ;
    public final void rule__Multiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3744:1: ( rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3745:2: rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1__0__Impl_in_rule__Multiplication__Group_1__07497);
            rule__Multiplication__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Multiplication__Group_1__1_in_rule__Multiplication__Group_1__07500);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3752:1: rule__Multiplication__Group_1__0__Impl : ( ( rule__Multiplication__Alternatives_1_0 ) ) ;
    public final void rule__Multiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3756:1: ( ( ( rule__Multiplication__Alternatives_1_0 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3757:1: ( ( rule__Multiplication__Alternatives_1_0 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3757:1: ( ( rule__Multiplication__Alternatives_1_0 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3758:1: ( rule__Multiplication__Alternatives_1_0 )
            {
             before(grammarAccess.getMultiplicationAccess().getAlternatives_1_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3759:1: ( rule__Multiplication__Alternatives_1_0 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3759:2: rule__Multiplication__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__Multiplication__Alternatives_1_0_in_rule__Multiplication__Group_1__0__Impl7527);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3769:1: rule__Multiplication__Group_1__1 : rule__Multiplication__Group_1__1__Impl ;
    public final void rule__Multiplication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3773:1: ( rule__Multiplication__Group_1__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3774:2: rule__Multiplication__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1__1__Impl_in_rule__Multiplication__Group_1__17557);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3780:1: rule__Multiplication__Group_1__1__Impl : ( ( rule__Multiplication__RightAssignment_1_1 ) ) ;
    public final void rule__Multiplication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3784:1: ( ( ( rule__Multiplication__RightAssignment_1_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3785:1: ( ( rule__Multiplication__RightAssignment_1_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3785:1: ( ( rule__Multiplication__RightAssignment_1_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3786:1: ( rule__Multiplication__RightAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicationAccess().getRightAssignment_1_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3787:1: ( rule__Multiplication__RightAssignment_1_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3787:2: rule__Multiplication__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Multiplication__RightAssignment_1_1_in_rule__Multiplication__Group_1__1__Impl7584);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3801:1: rule__Multiplication__Group_1_0_0__0 : rule__Multiplication__Group_1_0_0__0__Impl rule__Multiplication__Group_1_0_0__1 ;
    public final void rule__Multiplication__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3805:1: ( rule__Multiplication__Group_1_0_0__0__Impl rule__Multiplication__Group_1_0_0__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3806:2: rule__Multiplication__Group_1_0_0__0__Impl rule__Multiplication__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_0__0__Impl_in_rule__Multiplication__Group_1_0_0__07618);
            rule__Multiplication__Group_1_0_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_0__1_in_rule__Multiplication__Group_1_0_0__07621);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3813:1: rule__Multiplication__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3817:1: ( ( () ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3818:1: ( () )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3818:1: ( () )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3819:1: ()
            {
             before(grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3820:1: ()
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3822:1: 
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3832:1: rule__Multiplication__Group_1_0_0__1 : rule__Multiplication__Group_1_0_0__1__Impl ;
    public final void rule__Multiplication__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3836:1: ( rule__Multiplication__Group_1_0_0__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3837:2: rule__Multiplication__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_0__1__Impl_in_rule__Multiplication__Group_1_0_0__17679);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3843:1: rule__Multiplication__Group_1_0_0__1__Impl : ( ( rule__Multiplication__Mul_opAssignment_1_0_0_1 ) ) ;
    public final void rule__Multiplication__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3847:1: ( ( ( rule__Multiplication__Mul_opAssignment_1_0_0_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3848:1: ( ( rule__Multiplication__Mul_opAssignment_1_0_0_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3848:1: ( ( rule__Multiplication__Mul_opAssignment_1_0_0_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3849:1: ( rule__Multiplication__Mul_opAssignment_1_0_0_1 )
            {
             before(grammarAccess.getMultiplicationAccess().getMul_opAssignment_1_0_0_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3850:1: ( rule__Multiplication__Mul_opAssignment_1_0_0_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3850:2: rule__Multiplication__Mul_opAssignment_1_0_0_1
            {
            pushFollow(FOLLOW_rule__Multiplication__Mul_opAssignment_1_0_0_1_in_rule__Multiplication__Group_1_0_0__1__Impl7706);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3864:1: rule__Multiplication__Group_1_0_1__0 : rule__Multiplication__Group_1_0_1__0__Impl rule__Multiplication__Group_1_0_1__1 ;
    public final void rule__Multiplication__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3868:1: ( rule__Multiplication__Group_1_0_1__0__Impl rule__Multiplication__Group_1_0_1__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3869:2: rule__Multiplication__Group_1_0_1__0__Impl rule__Multiplication__Group_1_0_1__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_1__0__Impl_in_rule__Multiplication__Group_1_0_1__07740);
            rule__Multiplication__Group_1_0_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_1__1_in_rule__Multiplication__Group_1_0_1__07743);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3876:1: rule__Multiplication__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3880:1: ( ( () ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3881:1: ( () )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3881:1: ( () )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3882:1: ()
            {
             before(grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3883:1: ()
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3885:1: 
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3895:1: rule__Multiplication__Group_1_0_1__1 : rule__Multiplication__Group_1_0_1__1__Impl ;
    public final void rule__Multiplication__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3899:1: ( rule__Multiplication__Group_1_0_1__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3900:2: rule__Multiplication__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_1__1__Impl_in_rule__Multiplication__Group_1_0_1__17801);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3906:1: rule__Multiplication__Group_1_0_1__1__Impl : ( ( rule__Multiplication__Mul_opAssignment_1_0_1_1 ) ) ;
    public final void rule__Multiplication__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3910:1: ( ( ( rule__Multiplication__Mul_opAssignment_1_0_1_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3911:1: ( ( rule__Multiplication__Mul_opAssignment_1_0_1_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3911:1: ( ( rule__Multiplication__Mul_opAssignment_1_0_1_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3912:1: ( rule__Multiplication__Mul_opAssignment_1_0_1_1 )
            {
             before(grammarAccess.getMultiplicationAccess().getMul_opAssignment_1_0_1_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3913:1: ( rule__Multiplication__Mul_opAssignment_1_0_1_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3913:2: rule__Multiplication__Mul_opAssignment_1_0_1_1
            {
            pushFollow(FOLLOW_rule__Multiplication__Mul_opAssignment_1_0_1_1_in_rule__Multiplication__Group_1_0_1__1__Impl7828);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3927:1: rule__Power__Group__0 : rule__Power__Group__0__Impl rule__Power__Group__1 ;
    public final void rule__Power__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3931:1: ( rule__Power__Group__0__Impl rule__Power__Group__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3932:2: rule__Power__Group__0__Impl rule__Power__Group__1
            {
            pushFollow(FOLLOW_rule__Power__Group__0__Impl_in_rule__Power__Group__07862);
            rule__Power__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Power__Group__1_in_rule__Power__Group__07865);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3939:1: rule__Power__Group__0__Impl : ( ruleUnaryExpr ) ;
    public final void rule__Power__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3943:1: ( ( ruleUnaryExpr ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3944:1: ( ruleUnaryExpr )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3944:1: ( ruleUnaryExpr )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3945:1: ruleUnaryExpr
            {
             before(grammarAccess.getPowerAccess().getUnaryExprParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleUnaryExpr_in_rule__Power__Group__0__Impl7892);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3956:1: rule__Power__Group__1 : rule__Power__Group__1__Impl ;
    public final void rule__Power__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3960:1: ( rule__Power__Group__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3961:2: rule__Power__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Power__Group__1__Impl_in_rule__Power__Group__17921);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3967:1: rule__Power__Group__1__Impl : ( ( rule__Power__Group_1__0 )* ) ;
    public final void rule__Power__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3971:1: ( ( ( rule__Power__Group_1__0 )* ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3972:1: ( ( rule__Power__Group_1__0 )* )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3972:1: ( ( rule__Power__Group_1__0 )* )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3973:1: ( rule__Power__Group_1__0 )*
            {
             before(grammarAccess.getPowerAccess().getGroup_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3974:1: ( rule__Power__Group_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==49) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3974:2: rule__Power__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Power__Group_1__0_in_rule__Power__Group__1__Impl7948);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3988:1: rule__Power__Group_1__0 : rule__Power__Group_1__0__Impl rule__Power__Group_1__1 ;
    public final void rule__Power__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3992:1: ( rule__Power__Group_1__0__Impl rule__Power__Group_1__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:3993:2: rule__Power__Group_1__0__Impl rule__Power__Group_1__1
            {
            pushFollow(FOLLOW_rule__Power__Group_1__0__Impl_in_rule__Power__Group_1__07983);
            rule__Power__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Power__Group_1__1_in_rule__Power__Group_1__07986);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4000:1: rule__Power__Group_1__0__Impl : ( ( rule__Power__Group_1_0__0 ) ) ;
    public final void rule__Power__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4004:1: ( ( ( rule__Power__Group_1_0__0 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4005:1: ( ( rule__Power__Group_1_0__0 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4005:1: ( ( rule__Power__Group_1_0__0 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4006:1: ( rule__Power__Group_1_0__0 )
            {
             before(grammarAccess.getPowerAccess().getGroup_1_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4007:1: ( rule__Power__Group_1_0__0 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4007:2: rule__Power__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__Power__Group_1_0__0_in_rule__Power__Group_1__0__Impl8013);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4017:1: rule__Power__Group_1__1 : rule__Power__Group_1__1__Impl ;
    public final void rule__Power__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4021:1: ( rule__Power__Group_1__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4022:2: rule__Power__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Power__Group_1__1__Impl_in_rule__Power__Group_1__18043);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4028:1: rule__Power__Group_1__1__Impl : ( ( rule__Power__RightAssignment_1_1 ) ) ;
    public final void rule__Power__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4032:1: ( ( ( rule__Power__RightAssignment_1_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4033:1: ( ( rule__Power__RightAssignment_1_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4033:1: ( ( rule__Power__RightAssignment_1_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4034:1: ( rule__Power__RightAssignment_1_1 )
            {
             before(grammarAccess.getPowerAccess().getRightAssignment_1_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4035:1: ( rule__Power__RightAssignment_1_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4035:2: rule__Power__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Power__RightAssignment_1_1_in_rule__Power__Group_1__1__Impl8070);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4049:1: rule__Power__Group_1_0__0 : rule__Power__Group_1_0__0__Impl rule__Power__Group_1_0__1 ;
    public final void rule__Power__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4053:1: ( rule__Power__Group_1_0__0__Impl rule__Power__Group_1_0__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4054:2: rule__Power__Group_1_0__0__Impl rule__Power__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__Power__Group_1_0__0__Impl_in_rule__Power__Group_1_0__08104);
            rule__Power__Group_1_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Power__Group_1_0__1_in_rule__Power__Group_1_0__08107);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4061:1: rule__Power__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Power__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4065:1: ( ( () ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4066:1: ( () )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4066:1: ( () )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4067:1: ()
            {
             before(grammarAccess.getPowerAccess().getPowLeftAction_1_0_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4068:1: ()
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4070:1: 
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4080:1: rule__Power__Group_1_0__1 : rule__Power__Group_1_0__1__Impl ;
    public final void rule__Power__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4084:1: ( rule__Power__Group_1_0__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4085:2: rule__Power__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Power__Group_1_0__1__Impl_in_rule__Power__Group_1_0__18165);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4091:1: rule__Power__Group_1_0__1__Impl : ( ( rule__Power__Pow_opAssignment_1_0_1 ) ) ;
    public final void rule__Power__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4095:1: ( ( ( rule__Power__Pow_opAssignment_1_0_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4096:1: ( ( rule__Power__Pow_opAssignment_1_0_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4096:1: ( ( rule__Power__Pow_opAssignment_1_0_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4097:1: ( rule__Power__Pow_opAssignment_1_0_1 )
            {
             before(grammarAccess.getPowerAccess().getPow_opAssignment_1_0_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4098:1: ( rule__Power__Pow_opAssignment_1_0_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4098:2: rule__Power__Pow_opAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__Power__Pow_opAssignment_1_0_1_in_rule__Power__Group_1_0__1__Impl8192);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4112:1: rule__UnaryExpr__Group__0 : rule__UnaryExpr__Group__0__Impl rule__UnaryExpr__Group__1 ;
    public final void rule__UnaryExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4116:1: ( rule__UnaryExpr__Group__0__Impl rule__UnaryExpr__Group__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4117:2: rule__UnaryExpr__Group__0__Impl rule__UnaryExpr__Group__1
            {
            pushFollow(FOLLOW_rule__UnaryExpr__Group__0__Impl_in_rule__UnaryExpr__Group__08226);
            rule__UnaryExpr__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UnaryExpr__Group__1_in_rule__UnaryExpr__Group__08229);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4124:1: rule__UnaryExpr__Group__0__Impl : ( ( rule__UnaryExpr__UopAssignment_0 )? ) ;
    public final void rule__UnaryExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4128:1: ( ( ( rule__UnaryExpr__UopAssignment_0 )? ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4129:1: ( ( rule__UnaryExpr__UopAssignment_0 )? )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4129:1: ( ( rule__UnaryExpr__UopAssignment_0 )? )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4130:1: ( rule__UnaryExpr__UopAssignment_0 )?
            {
             before(grammarAccess.getUnaryExprAccess().getUopAssignment_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4131:1: ( rule__UnaryExpr__UopAssignment_0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=13 && LA34_0<=14)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4131:2: rule__UnaryExpr__UopAssignment_0
                    {
                    pushFollow(FOLLOW_rule__UnaryExpr__UopAssignment_0_in_rule__UnaryExpr__Group__0__Impl8256);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4141:1: rule__UnaryExpr__Group__1 : rule__UnaryExpr__Group__1__Impl ;
    public final void rule__UnaryExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4145:1: ( rule__UnaryExpr__Group__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4146:2: rule__UnaryExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__UnaryExpr__Group__1__Impl_in_rule__UnaryExpr__Group__18287);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4152:1: rule__UnaryExpr__Group__1__Impl : ( ( rule__UnaryExpr__RightAssignment_1 ) ) ;
    public final void rule__UnaryExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4156:1: ( ( ( rule__UnaryExpr__RightAssignment_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4157:1: ( ( rule__UnaryExpr__RightAssignment_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4157:1: ( ( rule__UnaryExpr__RightAssignment_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4158:1: ( rule__UnaryExpr__RightAssignment_1 )
            {
             before(grammarAccess.getUnaryExprAccess().getRightAssignment_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4159:1: ( rule__UnaryExpr__RightAssignment_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4159:2: rule__UnaryExpr__RightAssignment_1
            {
            pushFollow(FOLLOW_rule__UnaryExpr__RightAssignment_1_in_rule__UnaryExpr__Group__1__Impl8314);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4173:1: rule__PrePrimaryExpr__Group_1__0 : rule__PrePrimaryExpr__Group_1__0__Impl rule__PrePrimaryExpr__Group_1__1 ;
    public final void rule__PrePrimaryExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4177:1: ( rule__PrePrimaryExpr__Group_1__0__Impl rule__PrePrimaryExpr__Group_1__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4178:2: rule__PrePrimaryExpr__Group_1__0__Impl rule__PrePrimaryExpr__Group_1__1
            {
            pushFollow(FOLLOW_rule__PrePrimaryExpr__Group_1__0__Impl_in_rule__PrePrimaryExpr__Group_1__08348);
            rule__PrePrimaryExpr__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PrePrimaryExpr__Group_1__1_in_rule__PrePrimaryExpr__Group_1__08351);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4185:1: rule__PrePrimaryExpr__Group_1__0__Impl : ( '(' ) ;
    public final void rule__PrePrimaryExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4189:1: ( ( '(' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4190:1: ( '(' )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4190:1: ( '(' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4191:1: '('
            {
             before(grammarAccess.getPrePrimaryExprAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,32,FOLLOW_32_in_rule__PrePrimaryExpr__Group_1__0__Impl8379); 
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4204:1: rule__PrePrimaryExpr__Group_1__1 : rule__PrePrimaryExpr__Group_1__1__Impl rule__PrePrimaryExpr__Group_1__2 ;
    public final void rule__PrePrimaryExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4208:1: ( rule__PrePrimaryExpr__Group_1__1__Impl rule__PrePrimaryExpr__Group_1__2 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4209:2: rule__PrePrimaryExpr__Group_1__1__Impl rule__PrePrimaryExpr__Group_1__2
            {
            pushFollow(FOLLOW_rule__PrePrimaryExpr__Group_1__1__Impl_in_rule__PrePrimaryExpr__Group_1__18410);
            rule__PrePrimaryExpr__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PrePrimaryExpr__Group_1__2_in_rule__PrePrimaryExpr__Group_1__18413);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4216:1: rule__PrePrimaryExpr__Group_1__1__Impl : ( ruleExpression ) ;
    public final void rule__PrePrimaryExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4220:1: ( ( ruleExpression ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4221:1: ( ruleExpression )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4221:1: ( ruleExpression )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4222:1: ruleExpression
            {
             before(grammarAccess.getPrePrimaryExprAccess().getExpressionParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__PrePrimaryExpr__Group_1__1__Impl8440);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4233:1: rule__PrePrimaryExpr__Group_1__2 : rule__PrePrimaryExpr__Group_1__2__Impl ;
    public final void rule__PrePrimaryExpr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4237:1: ( rule__PrePrimaryExpr__Group_1__2__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4238:2: rule__PrePrimaryExpr__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__PrePrimaryExpr__Group_1__2__Impl_in_rule__PrePrimaryExpr__Group_1__28469);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4244:1: rule__PrePrimaryExpr__Group_1__2__Impl : ( ')' ) ;
    public final void rule__PrePrimaryExpr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4248:1: ( ( ')' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4249:1: ( ')' )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4249:1: ( ')' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4250:1: ')'
            {
             before(grammarAccess.getPrePrimaryExprAccess().getRightParenthesisKeyword_1_2()); 
            match(input,33,FOLLOW_33_in_rule__PrePrimaryExpr__Group_1__2__Impl8497); 
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4269:1: rule__PrePrimaryExpr__Group_2__0 : rule__PrePrimaryExpr__Group_2__0__Impl rule__PrePrimaryExpr__Group_2__1 ;
    public final void rule__PrePrimaryExpr__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4273:1: ( rule__PrePrimaryExpr__Group_2__0__Impl rule__PrePrimaryExpr__Group_2__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4274:2: rule__PrePrimaryExpr__Group_2__0__Impl rule__PrePrimaryExpr__Group_2__1
            {
            pushFollow(FOLLOW_rule__PrePrimaryExpr__Group_2__0__Impl_in_rule__PrePrimaryExpr__Group_2__08534);
            rule__PrePrimaryExpr__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PrePrimaryExpr__Group_2__1_in_rule__PrePrimaryExpr__Group_2__08537);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4281:1: rule__PrePrimaryExpr__Group_2__0__Impl : ( '-' ) ;
    public final void rule__PrePrimaryExpr__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4285:1: ( ( '-' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4286:1: ( '-' )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4286:1: ( '-' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4287:1: '-'
            {
             before(grammarAccess.getPrePrimaryExprAccess().getHyphenMinusKeyword_2_0()); 
            match(input,34,FOLLOW_34_in_rule__PrePrimaryExpr__Group_2__0__Impl8565); 
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4300:1: rule__PrePrimaryExpr__Group_2__1 : rule__PrePrimaryExpr__Group_2__1__Impl ;
    public final void rule__PrePrimaryExpr__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4304:1: ( rule__PrePrimaryExpr__Group_2__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4305:2: rule__PrePrimaryExpr__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__PrePrimaryExpr__Group_2__1__Impl_in_rule__PrePrimaryExpr__Group_2__18596);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4311:1: rule__PrePrimaryExpr__Group_2__1__Impl : ( ( rule__PrePrimaryExpr__NAssignment_2_1 ) ) ;
    public final void rule__PrePrimaryExpr__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4315:1: ( ( ( rule__PrePrimaryExpr__NAssignment_2_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4316:1: ( ( rule__PrePrimaryExpr__NAssignment_2_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4316:1: ( ( rule__PrePrimaryExpr__NAssignment_2_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4317:1: ( rule__PrePrimaryExpr__NAssignment_2_1 )
            {
             before(grammarAccess.getPrePrimaryExprAccess().getNAssignment_2_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4318:1: ( rule__PrePrimaryExpr__NAssignment_2_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4318:2: rule__PrePrimaryExpr__NAssignment_2_1
            {
            pushFollow(FOLLOW_rule__PrePrimaryExpr__NAssignment_2_1_in_rule__PrePrimaryExpr__Group_2__1__Impl8623);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4332:1: rule__TerminalExpression__Group_0__0 : rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1 ;
    public final void rule__TerminalExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4336:1: ( rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4337:2: rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_0__0__Impl_in_rule__TerminalExpression__Group_0__08657);
            rule__TerminalExpression__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_0__1_in_rule__TerminalExpression__Group_0__08660);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4344:1: rule__TerminalExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4348:1: ( ( () ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4349:1: ( () )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4349:1: ( () )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4350:1: ()
            {
             before(grammarAccess.getTerminalExpressionAccess().getIntLiteralAction_0_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4351:1: ()
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4353:1: 
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4363:1: rule__TerminalExpression__Group_0__1 : rule__TerminalExpression__Group_0__1__Impl ;
    public final void rule__TerminalExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4367:1: ( rule__TerminalExpression__Group_0__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4368:2: rule__TerminalExpression__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_0__1__Impl_in_rule__TerminalExpression__Group_0__18718);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4374:1: rule__TerminalExpression__Group_0__1__Impl : ( ( rule__TerminalExpression__ValueAssignment_0_1 ) ) ;
    public final void rule__TerminalExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4378:1: ( ( ( rule__TerminalExpression__ValueAssignment_0_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4379:1: ( ( rule__TerminalExpression__ValueAssignment_0_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4379:1: ( ( rule__TerminalExpression__ValueAssignment_0_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4380:1: ( rule__TerminalExpression__ValueAssignment_0_1 )
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_0_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4381:1: ( rule__TerminalExpression__ValueAssignment_0_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4381:2: rule__TerminalExpression__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__ValueAssignment_0_1_in_rule__TerminalExpression__Group_0__1__Impl8745);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4395:1: rule__TerminalExpression__Group_1__0 : rule__TerminalExpression__Group_1__0__Impl rule__TerminalExpression__Group_1__1 ;
    public final void rule__TerminalExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4399:1: ( rule__TerminalExpression__Group_1__0__Impl rule__TerminalExpression__Group_1__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4400:2: rule__TerminalExpression__Group_1__0__Impl rule__TerminalExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_1__0__Impl_in_rule__TerminalExpression__Group_1__08779);
            rule__TerminalExpression__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_1__1_in_rule__TerminalExpression__Group_1__08782);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4407:1: rule__TerminalExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4411:1: ( ( () ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4412:1: ( () )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4412:1: ( () )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4413:1: ()
            {
             before(grammarAccess.getTerminalExpressionAccess().getBooleanLiteralAction_1_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4414:1: ()
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4416:1: 
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4426:1: rule__TerminalExpression__Group_1__1 : rule__TerminalExpression__Group_1__1__Impl ;
    public final void rule__TerminalExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4430:1: ( rule__TerminalExpression__Group_1__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4431:2: rule__TerminalExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_1__1__Impl_in_rule__TerminalExpression__Group_1__18840);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4437:1: rule__TerminalExpression__Group_1__1__Impl : ( ( rule__TerminalExpression__ValueAssignment_1_1 ) ) ;
    public final void rule__TerminalExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4441:1: ( ( ( rule__TerminalExpression__ValueAssignment_1_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4442:1: ( ( rule__TerminalExpression__ValueAssignment_1_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4442:1: ( ( rule__TerminalExpression__ValueAssignment_1_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4443:1: ( rule__TerminalExpression__ValueAssignment_1_1 )
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_1_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4444:1: ( rule__TerminalExpression__ValueAssignment_1_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4444:2: rule__TerminalExpression__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__ValueAssignment_1_1_in_rule__TerminalExpression__Group_1__1__Impl8867);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4458:1: rule__TerminalExpression__Group_2__0 : rule__TerminalExpression__Group_2__0__Impl rule__TerminalExpression__Group_2__1 ;
    public final void rule__TerminalExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4462:1: ( rule__TerminalExpression__Group_2__0__Impl rule__TerminalExpression__Group_2__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4463:2: rule__TerminalExpression__Group_2__0__Impl rule__TerminalExpression__Group_2__1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_2__0__Impl_in_rule__TerminalExpression__Group_2__08901);
            rule__TerminalExpression__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_2__1_in_rule__TerminalExpression__Group_2__08904);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4470:1: rule__TerminalExpression__Group_2__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4474:1: ( ( () ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4475:1: ( () )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4475:1: ( () )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4476:1: ()
            {
             before(grammarAccess.getTerminalExpressionAccess().getArgumentAction_2_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4477:1: ()
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4479:1: 
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4489:1: rule__TerminalExpression__Group_2__1 : rule__TerminalExpression__Group_2__1__Impl ;
    public final void rule__TerminalExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4493:1: ( rule__TerminalExpression__Group_2__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4494:2: rule__TerminalExpression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_2__1__Impl_in_rule__TerminalExpression__Group_2__18962);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4500:1: rule__TerminalExpression__Group_2__1__Impl : ( ( rule__TerminalExpression__ValueAssignment_2_1 ) ) ;
    public final void rule__TerminalExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4504:1: ( ( ( rule__TerminalExpression__ValueAssignment_2_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4505:1: ( ( rule__TerminalExpression__ValueAssignment_2_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4505:1: ( ( rule__TerminalExpression__ValueAssignment_2_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4506:1: ( rule__TerminalExpression__ValueAssignment_2_1 )
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_2_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4507:1: ( rule__TerminalExpression__ValueAssignment_2_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4507:2: rule__TerminalExpression__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__ValueAssignment_2_1_in_rule__TerminalExpression__Group_2__1__Impl8989);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4522:1: rule__ArgumentDiagram__NameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__ArgumentDiagram__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4526:1: ( ( RULE_ID ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4527:1: ( RULE_ID )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4527:1: ( RULE_ID )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4528:1: RULE_ID
            {
             before(grammarAccess.getArgumentDiagramAccess().getNameIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ArgumentDiagram__NameAssignment_0_19028); 
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4537:1: rule__ArgumentDiagram__NodesAssignment_1_0 : ( ruleArgument ) ;
    public final void rule__ArgumentDiagram__NodesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4541:1: ( ( ruleArgument ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4542:1: ( ruleArgument )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4542:1: ( ruleArgument )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4543:1: ruleArgument
            {
             before(grammarAccess.getArgumentDiagramAccess().getNodesArgumentParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleArgument_in_rule__ArgumentDiagram__NodesAssignment_1_09059);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4552:1: rule__ArgumentDiagram__LinksAssignment_1_1 : ( ruleLink ) ;
    public final void rule__ArgumentDiagram__LinksAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4556:1: ( ( ruleLink ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4557:1: ( ruleLink )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4557:1: ( ruleLink )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4558:1: ruleLink
            {
             before(grammarAccess.getArgumentDiagramAccess().getLinksLinkParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleLink_in_rule__ArgumentDiagram__LinksAssignment_1_19090);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4567:1: rule__Rebuts__FromAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Rebuts__FromAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4571:1: ( ( ( RULE_ID ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4572:1: ( ( RULE_ID ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4572:1: ( ( RULE_ID ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4573:1: ( RULE_ID )
            {
             before(grammarAccess.getRebutsAccess().getFromArgumentCrossReference_0_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4574:1: ( RULE_ID )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4575:1: RULE_ID
            {
             before(grammarAccess.getRebutsAccess().getFromArgumentIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Rebuts__FromAssignment_09125); 
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4586:1: rule__Rebuts__ToAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Rebuts__ToAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4590:1: ( ( ( RULE_ID ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4591:1: ( ( RULE_ID ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4591:1: ( ( RULE_ID ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4592:1: ( RULE_ID )
            {
             before(grammarAccess.getRebutsAccess().getToArgumentCrossReference_2_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4593:1: ( RULE_ID )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4594:1: RULE_ID
            {
             before(grammarAccess.getRebutsAccess().getToArgumentIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Rebuts__ToAssignment_29164); 
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


    // $ANTLR start rule__Mitigates__FromAssignment_0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4605:1: rule__Mitigates__FromAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Mitigates__FromAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4609:1: ( ( ( RULE_ID ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4610:1: ( ( RULE_ID ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4610:1: ( ( RULE_ID ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4611:1: ( RULE_ID )
            {
             before(grammarAccess.getMitigatesAccess().getFromArgumentCrossReference_0_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4612:1: ( RULE_ID )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4613:1: RULE_ID
            {
             before(grammarAccess.getMitigatesAccess().getFromArgumentIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Mitigates__FromAssignment_09203); 
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4624:1: rule__Mitigates__ToAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Mitigates__ToAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4628:1: ( ( ( RULE_ID ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4629:1: ( ( RULE_ID ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4629:1: ( ( RULE_ID ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4630:1: ( RULE_ID )
            {
             before(grammarAccess.getMitigatesAccess().getToArgumentCrossReference_2_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4631:1: ( RULE_ID )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4632:1: RULE_ID
            {
             before(grammarAccess.getMitigatesAccess().getToArgumentIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Mitigates__ToAssignment_29242); 
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4643:1: rule__Mitigates__RebuttalAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Mitigates__RebuttalAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4647:1: ( ( ( RULE_ID ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4648:1: ( ( RULE_ID ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4648:1: ( ( RULE_ID ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4649:1: ( RULE_ID )
            {
             before(grammarAccess.getMitigatesAccess().getRebuttalArgumentCrossReference_4_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4650:1: ( RULE_ID )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4651:1: RULE_ID
            {
             before(grammarAccess.getMitigatesAccess().getRebuttalArgumentIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Mitigates__RebuttalAssignment_49281); 
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4662:1: rule__Argument__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Argument__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4666:1: ( ( RULE_ID ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4667:1: ( RULE_ID )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4667:1: ( RULE_ID )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4668:1: RULE_ID
            {
             before(grammarAccess.getArgumentAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Argument__NameAssignment_09316); 
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4677:1: rule__Argument__DescriptionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Argument__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4681:1: ( ( RULE_STRING ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4682:1: ( RULE_STRING )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4682:1: ( RULE_STRING )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4683:1: RULE_STRING
            {
             before(grammarAccess.getArgumentAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Argument__DescriptionAssignment_29347); 
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4692:1: rule__Argument__RoundAssignment_3_1 : ( RULE_INT ) ;
    public final void rule__Argument__RoundAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4696:1: ( ( RULE_INT ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4697:1: ( RULE_INT )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4697:1: ( RULE_INT )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4698:1: RULE_INT
            {
             before(grammarAccess.getArgumentAccess().getRoundINTTerminalRuleCall_3_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Argument__RoundAssignment_3_19378); 
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4707:1: rule__Argument__OriginAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Argument__OriginAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4711:1: ( ( ( RULE_ID ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4712:1: ( ( RULE_ID ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4712:1: ( ( RULE_ID ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4713:1: ( RULE_ID )
            {
             before(grammarAccess.getArgumentAccess().getOriginArgumentCrossReference_4_1_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4714:1: ( RULE_ID )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4715:1: RULE_ID
            {
             before(grammarAccess.getArgumentAccess().getOriginArgumentIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Argument__OriginAssignment_4_19413); 
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4726:1: rule__Argument__ExprAssignment_5_1 : ( ruleExpression ) ;
    public final void rule__Argument__ExprAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4730:1: ( ( ruleExpression ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4731:1: ( ruleExpression )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4731:1: ( ruleExpression )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4732:1: ruleExpression
            {
             before(grammarAccess.getArgumentAccess().getExprExpressionParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__Argument__ExprAssignment_5_19448);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4741:1: rule__Argument__ForegroundAssignment_6_1 : ( RULE_STRING ) ;
    public final void rule__Argument__ForegroundAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4745:1: ( ( RULE_STRING ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4746:1: ( RULE_STRING )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4746:1: ( RULE_STRING )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4747:1: RULE_STRING
            {
             before(grammarAccess.getArgumentAccess().getForegroundSTRINGTerminalRuleCall_6_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Argument__ForegroundAssignment_6_19479); 
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4756:1: rule__Argument__BackgroundAssignment_7_1 : ( RULE_STRING ) ;
    public final void rule__Argument__BackgroundAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4760:1: ( ( RULE_STRING ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4761:1: ( RULE_STRING )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4761:1: ( RULE_STRING )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4762:1: RULE_STRING
            {
             before(grammarAccess.getArgumentAccess().getBackgroundSTRINGTerminalRuleCall_7_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Argument__BackgroundAssignment_7_19510); 
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4771:1: rule__Argument__ShapeAssignment_8_1 : ( RULE_STRING ) ;
    public final void rule__Argument__ShapeAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4775:1: ( ( RULE_STRING ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4776:1: ( RULE_STRING )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4776:1: ( RULE_STRING )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4777:1: RULE_STRING
            {
             before(grammarAccess.getArgumentAccess().getShapeSTRINGTerminalRuleCall_8_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Argument__ShapeAssignment_8_19541); 
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4786:1: rule__Argument__ImageAssignment_9_1 : ( RULE_STRING ) ;
    public final void rule__Argument__ImageAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4790:1: ( ( RULE_STRING ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4791:1: ( RULE_STRING )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4791:1: ( RULE_STRING )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4792:1: RULE_STRING
            {
             before(grammarAccess.getArgumentAccess().getImageSTRINGTerminalRuleCall_9_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Argument__ImageAssignment_9_19572); 
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4801:1: rule__Argument__GroundsAssignment_10_1_1_1 : ( ruleArgument ) ;
    public final void rule__Argument__GroundsAssignment_10_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4805:1: ( ( ruleArgument ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4806:1: ( ruleArgument )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4806:1: ( ruleArgument )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4807:1: ruleArgument
            {
             before(grammarAccess.getArgumentAccess().getGroundsArgumentParserRuleCall_10_1_1_1_0()); 
            pushFollow(FOLLOW_ruleArgument_in_rule__Argument__GroundsAssignment_10_1_1_19603);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4816:1: rule__Argument__WarrantsAssignment_10_2_1_1 : ( ruleArgument ) ;
    public final void rule__Argument__WarrantsAssignment_10_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4820:1: ( ( ruleArgument ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4821:1: ( ruleArgument )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4821:1: ( ruleArgument )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4822:1: ruleArgument
            {
             before(grammarAccess.getArgumentAccess().getWarrantsArgumentParserRuleCall_10_2_1_1_0()); 
            pushFollow(FOLLOW_ruleArgument_in_rule__Argument__WarrantsAssignment_10_2_1_19634);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4831:1: rule__Expression__AssignAssignment : ( ruleAssignmentOp ) ;
    public final void rule__Expression__AssignAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4835:1: ( ( ruleAssignmentOp ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4836:1: ( ruleAssignmentOp )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4836:1: ( ruleAssignmentOp )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4837:1: ruleAssignmentOp
            {
             before(grammarAccess.getExpressionAccess().getAssignAssignmentOpParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAssignmentOp_in_rule__Expression__AssignAssignment9665);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4846:1: rule__AssignmentOp__AopAssignment_1_0_0_1 : ( ( '->' ) ) ;
    public final void rule__AssignmentOp__AopAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4850:1: ( ( ( '->' ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4851:1: ( ( '->' ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4851:1: ( ( '->' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4852:1: ( '->' )
            {
             before(grammarAccess.getAssignmentOpAccess().getAopHyphenMinusGreaterThanSignKeyword_1_0_0_1_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4853:1: ( '->' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4854:1: '->'
            {
             before(grammarAccess.getAssignmentOpAccess().getAopHyphenMinusGreaterThanSignKeyword_1_0_0_1_0()); 
            match(input,35,FOLLOW_35_in_rule__AssignmentOp__AopAssignment_1_0_0_19701); 
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4869:1: rule__AssignmentOp__AopAssignment_1_0_1_1 : ( ( '<->' ) ) ;
    public final void rule__AssignmentOp__AopAssignment_1_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4873:1: ( ( ( '<->' ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4874:1: ( ( '<->' ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4874:1: ( ( '<->' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4875:1: ( '<->' )
            {
             before(grammarAccess.getAssignmentOpAccess().getAopLessThanSignHyphenMinusGreaterThanSignKeyword_1_0_1_1_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4876:1: ( '<->' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4877:1: '<->'
            {
             before(grammarAccess.getAssignmentOpAccess().getAopLessThanSignHyphenMinusGreaterThanSignKeyword_1_0_1_1_0()); 
            match(input,36,FOLLOW_36_in_rule__AssignmentOp__AopAssignment_1_0_1_19745); 
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4892:1: rule__AssignmentOp__RightAssignment_1_1 : ( ruleOrExp ) ;
    public final void rule__AssignmentOp__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4896:1: ( ( ruleOrExp ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4897:1: ( ruleOrExp )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4897:1: ( ruleOrExp )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4898:1: ruleOrExp
            {
             before(grammarAccess.getAssignmentOpAccess().getRightOrExpParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleOrExp_in_rule__AssignmentOp__RightAssignment_1_19784);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4907:1: rule__OrExp__Or_opAssignment_1_1 : ( ( '|' ) ) ;
    public final void rule__OrExp__Or_opAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4911:1: ( ( ( '|' ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4912:1: ( ( '|' ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4912:1: ( ( '|' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4913:1: ( '|' )
            {
             before(grammarAccess.getOrExpAccess().getOr_opVerticalLineKeyword_1_1_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4914:1: ( '|' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4915:1: '|'
            {
             before(grammarAccess.getOrExpAccess().getOr_opVerticalLineKeyword_1_1_0()); 
            match(input,37,FOLLOW_37_in_rule__OrExp__Or_opAssignment_1_19820); 
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4930:1: rule__OrExp__RightAssignment_1_2 : ( ruleAndExp ) ;
    public final void rule__OrExp__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4934:1: ( ( ruleAndExp ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4935:1: ( ruleAndExp )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4935:1: ( ruleAndExp )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4936:1: ruleAndExp
            {
             before(grammarAccess.getOrExpAccess().getRightAndExpParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleAndExp_in_rule__OrExp__RightAssignment_1_29859);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4945:1: rule__AndExp__And_opAssignment_1_1 : ( ( '&' ) ) ;
    public final void rule__AndExp__And_opAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4949:1: ( ( ( '&' ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4950:1: ( ( '&' ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4950:1: ( ( '&' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4951:1: ( '&' )
            {
             before(grammarAccess.getAndExpAccess().getAnd_opAmpersandKeyword_1_1_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4952:1: ( '&' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4953:1: '&'
            {
             before(grammarAccess.getAndExpAccess().getAnd_opAmpersandKeyword_1_1_0()); 
            match(input,38,FOLLOW_38_in_rule__AndExp__And_opAssignment_1_19895); 
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4968:1: rule__AndExp__RightAssignment_1_2 : ( ruleRelational ) ;
    public final void rule__AndExp__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4972:1: ( ( ruleRelational ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4973:1: ( ruleRelational )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4973:1: ( ruleRelational )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4974:1: ruleRelational
            {
             before(grammarAccess.getAndExpAccess().getRightRelationalParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleRelational_in_rule__AndExp__RightAssignment_1_29934);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4983:1: rule__Relational__Rel_opAssignment_1_0_0_1 : ( ( '!=' ) ) ;
    public final void rule__Relational__Rel_opAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4987:1: ( ( ( '!=' ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4988:1: ( ( '!=' ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4988:1: ( ( '!=' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4989:1: ( '!=' )
            {
             before(grammarAccess.getRelationalAccess().getRel_opExclamationMarkEqualsSignKeyword_1_0_0_1_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4990:1: ( '!=' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:4991:1: '!='
            {
             before(grammarAccess.getRelationalAccess().getRel_opExclamationMarkEqualsSignKeyword_1_0_0_1_0()); 
            match(input,39,FOLLOW_39_in_rule__Relational__Rel_opAssignment_1_0_0_19970); 
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5006:1: rule__Relational__Rel_opAssignment_1_0_1_1 : ( ( '==' ) ) ;
    public final void rule__Relational__Rel_opAssignment_1_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5010:1: ( ( ( '==' ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5011:1: ( ( '==' ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5011:1: ( ( '==' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5012:1: ( '==' )
            {
             before(grammarAccess.getRelationalAccess().getRel_opEqualsSignEqualsSignKeyword_1_0_1_1_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5013:1: ( '==' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5014:1: '=='
            {
             before(grammarAccess.getRelationalAccess().getRel_opEqualsSignEqualsSignKeyword_1_0_1_1_0()); 
            match(input,40,FOLLOW_40_in_rule__Relational__Rel_opAssignment_1_0_1_110014); 
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5029:1: rule__Relational__Rel_opAssignment_1_0_2_1 : ( ( '>=' ) ) ;
    public final void rule__Relational__Rel_opAssignment_1_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5033:1: ( ( ( '>=' ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5034:1: ( ( '>=' ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5034:1: ( ( '>=' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5035:1: ( '>=' )
            {
             before(grammarAccess.getRelationalAccess().getRel_opGreaterThanSignEqualsSignKeyword_1_0_2_1_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5036:1: ( '>=' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5037:1: '>='
            {
             before(grammarAccess.getRelationalAccess().getRel_opGreaterThanSignEqualsSignKeyword_1_0_2_1_0()); 
            match(input,41,FOLLOW_41_in_rule__Relational__Rel_opAssignment_1_0_2_110058); 
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5052:1: rule__Relational__Rel_opAssignment_1_0_3_1 : ( ( '<=' ) ) ;
    public final void rule__Relational__Rel_opAssignment_1_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5056:1: ( ( ( '<=' ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5057:1: ( ( '<=' ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5057:1: ( ( '<=' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5058:1: ( '<=' )
            {
             before(grammarAccess.getRelationalAccess().getRel_opLessThanSignEqualsSignKeyword_1_0_3_1_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5059:1: ( '<=' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5060:1: '<='
            {
             before(grammarAccess.getRelationalAccess().getRel_opLessThanSignEqualsSignKeyword_1_0_3_1_0()); 
            match(input,42,FOLLOW_42_in_rule__Relational__Rel_opAssignment_1_0_3_110102); 
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5075:1: rule__Relational__Rel_opAssignment_1_0_4_1 : ( ( '=' ) ) ;
    public final void rule__Relational__Rel_opAssignment_1_0_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5079:1: ( ( ( '=' ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5080:1: ( ( '=' ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5080:1: ( ( '=' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5081:1: ( '=' )
            {
             before(grammarAccess.getRelationalAccess().getRel_opEqualsSignKeyword_1_0_4_1_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5082:1: ( '=' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5083:1: '='
            {
             before(grammarAccess.getRelationalAccess().getRel_opEqualsSignKeyword_1_0_4_1_0()); 
            match(input,43,FOLLOW_43_in_rule__Relational__Rel_opAssignment_1_0_4_110146); 
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5098:1: rule__Relational__Rel_opAssignment_1_0_5_1 : ( ( '<' ) ) ;
    public final void rule__Relational__Rel_opAssignment_1_0_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5102:1: ( ( ( '<' ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5103:1: ( ( '<' ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5103:1: ( ( '<' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5104:1: ( '<' )
            {
             before(grammarAccess.getRelationalAccess().getRel_opLessThanSignKeyword_1_0_5_1_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5105:1: ( '<' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5106:1: '<'
            {
             before(grammarAccess.getRelationalAccess().getRel_opLessThanSignKeyword_1_0_5_1_0()); 
            match(input,44,FOLLOW_44_in_rule__Relational__Rel_opAssignment_1_0_5_110190); 
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5121:1: rule__Relational__Rel_opAssignment_1_0_6_1 : ( ( '>' ) ) ;
    public final void rule__Relational__Rel_opAssignment_1_0_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5125:1: ( ( ( '>' ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5126:1: ( ( '>' ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5126:1: ( ( '>' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5127:1: ( '>' )
            {
             before(grammarAccess.getRelationalAccess().getRel_opGreaterThanSignKeyword_1_0_6_1_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5128:1: ( '>' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5129:1: '>'
            {
             before(grammarAccess.getRelationalAccess().getRel_opGreaterThanSignKeyword_1_0_6_1_0()); 
            match(input,45,FOLLOW_45_in_rule__Relational__Rel_opAssignment_1_0_6_110234); 
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5144:1: rule__Relational__RightAssignment_1_1 : ( ruleAddition ) ;
    public final void rule__Relational__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5148:1: ( ( ruleAddition ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5149:1: ( ruleAddition )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5149:1: ( ruleAddition )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5150:1: ruleAddition
            {
             before(grammarAccess.getRelationalAccess().getRightAdditionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleAddition_in_rule__Relational__RightAssignment_1_110273);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5159:1: rule__Addition__Add_opAssignment_1_0_0_1 : ( ( '+' ) ) ;
    public final void rule__Addition__Add_opAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5163:1: ( ( ( '+' ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5164:1: ( ( '+' ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5164:1: ( ( '+' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5165:1: ( '+' )
            {
             before(grammarAccess.getAdditionAccess().getAdd_opPlusSignKeyword_1_0_0_1_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5166:1: ( '+' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5167:1: '+'
            {
             before(grammarAccess.getAdditionAccess().getAdd_opPlusSignKeyword_1_0_0_1_0()); 
            match(input,46,FOLLOW_46_in_rule__Addition__Add_opAssignment_1_0_0_110309); 
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5182:1: rule__Addition__Add_opAssignment_1_0_1_1 : ( ( '-' ) ) ;
    public final void rule__Addition__Add_opAssignment_1_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5186:1: ( ( ( '-' ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5187:1: ( ( '-' ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5187:1: ( ( '-' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5188:1: ( '-' )
            {
             before(grammarAccess.getAdditionAccess().getAdd_opHyphenMinusKeyword_1_0_1_1_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5189:1: ( '-' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5190:1: '-'
            {
             before(grammarAccess.getAdditionAccess().getAdd_opHyphenMinusKeyword_1_0_1_1_0()); 
            match(input,34,FOLLOW_34_in_rule__Addition__Add_opAssignment_1_0_1_110353); 
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5205:1: rule__Addition__RightAssignment_1_1 : ( ruleMultiplication ) ;
    public final void rule__Addition__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5209:1: ( ( ruleMultiplication ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5210:1: ( ruleMultiplication )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5210:1: ( ruleMultiplication )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5211:1: ruleMultiplication
            {
             before(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleMultiplication_in_rule__Addition__RightAssignment_1_110392);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5220:1: rule__Multiplication__Mul_opAssignment_1_0_0_1 : ( ( '*' ) ) ;
    public final void rule__Multiplication__Mul_opAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5224:1: ( ( ( '*' ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5225:1: ( ( '*' ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5225:1: ( ( '*' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5226:1: ( '*' )
            {
             before(grammarAccess.getMultiplicationAccess().getMul_opAsteriskKeyword_1_0_0_1_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5227:1: ( '*' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5228:1: '*'
            {
             before(grammarAccess.getMultiplicationAccess().getMul_opAsteriskKeyword_1_0_0_1_0()); 
            match(input,47,FOLLOW_47_in_rule__Multiplication__Mul_opAssignment_1_0_0_110428); 
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5243:1: rule__Multiplication__Mul_opAssignment_1_0_1_1 : ( ( '/' ) ) ;
    public final void rule__Multiplication__Mul_opAssignment_1_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5247:1: ( ( ( '/' ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5248:1: ( ( '/' ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5248:1: ( ( '/' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5249:1: ( '/' )
            {
             before(grammarAccess.getMultiplicationAccess().getMul_opSolidusKeyword_1_0_1_1_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5250:1: ( '/' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5251:1: '/'
            {
             before(grammarAccess.getMultiplicationAccess().getMul_opSolidusKeyword_1_0_1_1_0()); 
            match(input,48,FOLLOW_48_in_rule__Multiplication__Mul_opAssignment_1_0_1_110472); 
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5266:1: rule__Multiplication__RightAssignment_1_1 : ( rulePower ) ;
    public final void rule__Multiplication__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5270:1: ( ( rulePower ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5271:1: ( rulePower )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5271:1: ( rulePower )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5272:1: rulePower
            {
             before(grammarAccess.getMultiplicationAccess().getRightPowerParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_rulePower_in_rule__Multiplication__RightAssignment_1_110511);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5281:1: rule__Power__Pow_opAssignment_1_0_1 : ( ( '^' ) ) ;
    public final void rule__Power__Pow_opAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5285:1: ( ( ( '^' ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5286:1: ( ( '^' ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5286:1: ( ( '^' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5287:1: ( '^' )
            {
             before(grammarAccess.getPowerAccess().getPow_opCircumflexAccentKeyword_1_0_1_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5288:1: ( '^' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5289:1: '^'
            {
             before(grammarAccess.getPowerAccess().getPow_opCircumflexAccentKeyword_1_0_1_0()); 
            match(input,49,FOLLOW_49_in_rule__Power__Pow_opAssignment_1_0_110547); 
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5304:1: rule__Power__RightAssignment_1_1 : ( ruleUnaryExpr ) ;
    public final void rule__Power__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5308:1: ( ( ruleUnaryExpr ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5309:1: ( ruleUnaryExpr )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5309:1: ( ruleUnaryExpr )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5310:1: ruleUnaryExpr
            {
             before(grammarAccess.getPowerAccess().getRightUnaryExprParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleUnaryExpr_in_rule__Power__RightAssignment_1_110586);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5319:1: rule__UnaryExpr__UopAssignment_0 : ( ruleUnaryOp ) ;
    public final void rule__UnaryExpr__UopAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5323:1: ( ( ruleUnaryOp ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5324:1: ( ruleUnaryOp )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5324:1: ( ruleUnaryOp )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5325:1: ruleUnaryOp
            {
             before(grammarAccess.getUnaryExprAccess().getUopUnaryOpEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleUnaryOp_in_rule__UnaryExpr__UopAssignment_010617);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5334:1: rule__UnaryExpr__RightAssignment_1 : ( rulePrePrimaryExpr ) ;
    public final void rule__UnaryExpr__RightAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5338:1: ( ( rulePrePrimaryExpr ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5339:1: ( rulePrePrimaryExpr )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5339:1: ( rulePrePrimaryExpr )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5340:1: rulePrePrimaryExpr
            {
             before(grammarAccess.getUnaryExprAccess().getRightPrePrimaryExprParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePrePrimaryExpr_in_rule__UnaryExpr__RightAssignment_110648);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5349:1: rule__PrePrimaryExpr__NAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__PrePrimaryExpr__NAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5353:1: ( ( RULE_INT ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5354:1: ( RULE_INT )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5354:1: ( RULE_INT )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5355:1: RULE_INT
            {
             before(grammarAccess.getPrePrimaryExprAccess().getNINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__PrePrimaryExpr__NAssignment_2_110679); 
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5364:1: rule__TerminalExpression__ValueAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__TerminalExpression__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5368:1: ( ( RULE_INT ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5369:1: ( RULE_INT )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5369:1: ( RULE_INT )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5370:1: RULE_INT
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueINTTerminalRuleCall_0_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__TerminalExpression__ValueAssignment_0_110710); 
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5379:1: rule__TerminalExpression__ValueAssignment_1_1 : ( RULE_BOOLEAN ) ;
    public final void rule__TerminalExpression__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5383:1: ( ( RULE_BOOLEAN ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5384:1: ( RULE_BOOLEAN )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5384:1: ( RULE_BOOLEAN )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5385:1: RULE_BOOLEAN
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueBOOLEANTerminalRuleCall_1_1_0()); 
            match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_rule__TerminalExpression__ValueAssignment_1_110741); 
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5394:1: rule__TerminalExpression__ValueAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__TerminalExpression__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5398:1: ( ( ( RULE_ID ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5399:1: ( ( RULE_ID ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5399:1: ( ( RULE_ID ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5400:1: ( RULE_ID )
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueArgumentCrossReference_2_1_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5401:1: ( RULE_ID )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:5402:1: RULE_ID
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueArgumentIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TerminalExpression__ValueAssignment_2_110776); 
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
    public static final BitSet FOLLOW_rule__Rebuts__Group__2__Impl_in_rule__Rebuts__Group__22020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rebuts__ToAssignment_2_in_rule__Rebuts__Group__2__Impl2047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mitigates__Group__0__Impl_in_rule__Mitigates__Group__02083 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Mitigates__Group__1_in_rule__Mitigates__Group__02086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mitigates__FromAssignment_0_in_rule__Mitigates__Group__0__Impl2113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mitigates__Group__1__Impl_in_rule__Mitigates__Group__12143 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Mitigates__Group__2_in_rule__Mitigates__Group__12146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Mitigates__Group__1__Impl2174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mitigates__Group__2__Impl_in_rule__Mitigates__Group__22205 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Mitigates__Group__3_in_rule__Mitigates__Group__22208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mitigates__ToAssignment_2_in_rule__Mitigates__Group__2__Impl2235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mitigates__Group__3__Impl_in_rule__Mitigates__Group__32265 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Mitigates__Group__4_in_rule__Mitigates__Group__32268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Mitigates__Group__3__Impl2296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mitigates__Group__4__Impl_in_rule__Mitigates__Group__42327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mitigates__RebuttalAssignment_4_in_rule__Mitigates__Group__4__Impl2354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__0__Impl_in_rule__Argument__Group__02394 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_rule__Argument__Group__1_in_rule__Argument__Group__02397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__NameAssignment_0_in_rule__Argument__Group__0__Impl2424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__1__Impl_in_rule__Argument__Group__12454 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Argument__Group__2_in_rule__Argument__Group__12457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Argument__Group__1__Impl2486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__2__Impl_in_rule__Argument__Group__22519 = new BitSet(new long[]{0x000000000FF00002L});
    public static final BitSet FOLLOW_rule__Argument__Group__3_in_rule__Argument__Group__22522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__DescriptionAssignment_2_in_rule__Argument__Group__2__Impl2549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__3__Impl_in_rule__Argument__Group__32579 = new BitSet(new long[]{0x000000000FE00002L});
    public static final BitSet FOLLOW_rule__Argument__Group__4_in_rule__Argument__Group__32582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_3__0_in_rule__Argument__Group__3__Impl2609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__4__Impl_in_rule__Argument__Group__42640 = new BitSet(new long[]{0x000000000FC00002L});
    public static final BitSet FOLLOW_rule__Argument__Group__5_in_rule__Argument__Group__42643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_4__0_in_rule__Argument__Group__4__Impl2670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__5__Impl_in_rule__Argument__Group__52701 = new BitSet(new long[]{0x000000000F800002L});
    public static final BitSet FOLLOW_rule__Argument__Group__6_in_rule__Argument__Group__52704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_5__0_in_rule__Argument__Group__5__Impl2731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__6__Impl_in_rule__Argument__Group__62762 = new BitSet(new long[]{0x000000000F000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__7_in_rule__Argument__Group__62765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_6__0_in_rule__Argument__Group__6__Impl2792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__7__Impl_in_rule__Argument__Group__72823 = new BitSet(new long[]{0x000000000E000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__8_in_rule__Argument__Group__72826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_7__0_in_rule__Argument__Group__7__Impl2853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__8__Impl_in_rule__Argument__Group__82884 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__9_in_rule__Argument__Group__82887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_8__0_in_rule__Argument__Group__8__Impl2914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__9__Impl_in_rule__Argument__Group__92945 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__10_in_rule__Argument__Group__92948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_9__0_in_rule__Argument__Group__9__Impl2975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__10__Impl_in_rule__Argument__Group__103006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_10__0_in_rule__Argument__Group__10__Impl3033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_3__0__Impl_in_rule__Argument__Group_3__03086 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Argument__Group_3__1_in_rule__Argument__Group_3__03089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Argument__Group_3__0__Impl3117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_3__1__Impl_in_rule__Argument__Group_3__13148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__RoundAssignment_3_1_in_rule__Argument__Group_3__1__Impl3175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_4__0__Impl_in_rule__Argument__Group_4__03209 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Argument__Group_4__1_in_rule__Argument__Group_4__03212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Argument__Group_4__0__Impl3240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_4__1__Impl_in_rule__Argument__Group_4__13271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__OriginAssignment_4_1_in_rule__Argument__Group_4__1__Impl3298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_5__0__Impl_in_rule__Argument__Group_5__03332 = new BitSet(new long[]{0x00000005000060D0L});
    public static final BitSet FOLLOW_rule__Argument__Group_5__1_in_rule__Argument__Group_5__03335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Argument__Group_5__0__Impl3363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_5__1__Impl_in_rule__Argument__Group_5__13394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__ExprAssignment_5_1_in_rule__Argument__Group_5__1__Impl3421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_6__0__Impl_in_rule__Argument__Group_6__03455 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Argument__Group_6__1_in_rule__Argument__Group_6__03458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Argument__Group_6__0__Impl3486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_6__1__Impl_in_rule__Argument__Group_6__13517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__ForegroundAssignment_6_1_in_rule__Argument__Group_6__1__Impl3544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_7__0__Impl_in_rule__Argument__Group_7__03578 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Argument__Group_7__1_in_rule__Argument__Group_7__03581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Argument__Group_7__0__Impl3609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_7__1__Impl_in_rule__Argument__Group_7__13640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__BackgroundAssignment_7_1_in_rule__Argument__Group_7__1__Impl3667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_8__0__Impl_in_rule__Argument__Group_8__03701 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Argument__Group_8__1_in_rule__Argument__Group_8__03704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Argument__Group_8__0__Impl3732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_8__1__Impl_in_rule__Argument__Group_8__13763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__ShapeAssignment_8_1_in_rule__Argument__Group_8__1__Impl3790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_9__0__Impl_in_rule__Argument__Group_9__03824 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Argument__Group_9__1_in_rule__Argument__Group_9__03827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Argument__Group_9__0__Impl3855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_9__1__Impl_in_rule__Argument__Group_9__13886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__ImageAssignment_9_1_in_rule__Argument__Group_9__1__Impl3913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_10__0__Impl_in_rule__Argument__Group_10__03947 = new BitSet(new long[]{0x00000000B0000000L});
    public static final BitSet FOLLOW_rule__Argument__Group_10__1_in_rule__Argument__Group_10__03950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Argument__Group_10__0__Impl3978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_10__1__Impl_in_rule__Argument__Group_10__14009 = new BitSet(new long[]{0x0000000090000000L});
    public static final BitSet FOLLOW_rule__Argument__Group_10__2_in_rule__Argument__Group_10__14012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_10_1__0_in_rule__Argument__Group_10__1__Impl4039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_10__2__Impl_in_rule__Argument__Group_10__24070 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Argument__Group_10__3_in_rule__Argument__Group_10__24073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_10_2__0_in_rule__Argument__Group_10__2__Impl4100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_10__3__Impl_in_rule__Argument__Group_10__34131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Argument__Group_10__3__Impl4159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_10_1__0__Impl_in_rule__Argument__Group_10_1__04198 = new BitSet(new long[]{0x0000000040000012L});
    public static final BitSet FOLLOW_rule__Argument__Group_10_1__1_in_rule__Argument__Group_10_1__04201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Argument__Group_10_1__0__Impl4229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_10_1__1__Impl_in_rule__Argument__Group_10_1__14260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_10_1_1__0_in_rule__Argument__Group_10_1__1__Impl4287 = new BitSet(new long[]{0x0000000040000012L});
    public static final BitSet FOLLOW_rule__Argument__Group_10_1_1__0__Impl_in_rule__Argument__Group_10_1_1__04322 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Argument__Group_10_1_1__1_in_rule__Argument__Group_10_1_1__04325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Argument__Group_10_1_1__0__Impl4354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_10_1_1__1__Impl_in_rule__Argument__Group_10_1_1__14387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__GroundsAssignment_10_1_1_1_in_rule__Argument__Group_10_1_1__1__Impl4414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_10_2__0__Impl_in_rule__Argument__Group_10_2__04448 = new BitSet(new long[]{0x0000000040000012L});
    public static final BitSet FOLLOW_rule__Argument__Group_10_2__1_in_rule__Argument__Group_10_2__04451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Argument__Group_10_2__0__Impl4479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_10_2__1__Impl_in_rule__Argument__Group_10_2__14510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_10_2_1__0_in_rule__Argument__Group_10_2__1__Impl4537 = new BitSet(new long[]{0x0000000040000012L});
    public static final BitSet FOLLOW_rule__Argument__Group_10_2_1__0__Impl_in_rule__Argument__Group_10_2_1__04572 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Argument__Group_10_2_1__1_in_rule__Argument__Group_10_2_1__04575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Argument__Group_10_2_1__0__Impl4604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_10_2_1__1__Impl_in_rule__Argument__Group_10_2_1__14637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__WarrantsAssignment_10_2_1_1_in_rule__Argument__Group_10_2_1__1__Impl4664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Group__0__Impl_in_rule__AssignmentOp__Group__04698 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Group__1_in_rule__AssignmentOp__Group__04701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExp_in_rule__AssignmentOp__Group__0__Impl4728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Group__1__Impl_in_rule__AssignmentOp__Group__14757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Group_1__0_in_rule__AssignmentOp__Group__1__Impl4784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Group_1__0__Impl_in_rule__AssignmentOp__Group_1__04819 = new BitSet(new long[]{0x00000005000060D0L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Group_1__1_in_rule__AssignmentOp__Group_1__04822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Alternatives_1_0_in_rule__AssignmentOp__Group_1__0__Impl4849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Group_1__1__Impl_in_rule__AssignmentOp__Group_1__14879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentOp__RightAssignment_1_1_in_rule__AssignmentOp__Group_1__1__Impl4906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Group_1_0_0__0__Impl_in_rule__AssignmentOp__Group_1_0_0__04940 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Group_1_0_0__1_in_rule__AssignmentOp__Group_1_0_0__04943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Group_1_0_0__1__Impl_in_rule__AssignmentOp__Group_1_0_0__15001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentOp__AopAssignment_1_0_0_1_in_rule__AssignmentOp__Group_1_0_0__1__Impl5028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Group_1_0_1__0__Impl_in_rule__AssignmentOp__Group_1_0_1__05062 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Group_1_0_1__1_in_rule__AssignmentOp__Group_1_0_1__05065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Group_1_0_1__1__Impl_in_rule__AssignmentOp__Group_1_0_1__15123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentOp__AopAssignment_1_0_1_1_in_rule__AssignmentOp__Group_1_0_1__1__Impl5150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExp__Group__0__Impl_in_rule__OrExp__Group__05184 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_rule__OrExp__Group__1_in_rule__OrExp__Group__05187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExp_in_rule__OrExp__Group__0__Impl5214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExp__Group__1__Impl_in_rule__OrExp__Group__15243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExp__Group_1__0_in_rule__OrExp__Group__1__Impl5270 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_rule__OrExp__Group_1__0__Impl_in_rule__OrExp__Group_1__05305 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__OrExp__Group_1__1_in_rule__OrExp__Group_1__05308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExp__Group_1__1__Impl_in_rule__OrExp__Group_1__15366 = new BitSet(new long[]{0x00000005000060D0L});
    public static final BitSet FOLLOW_rule__OrExp__Group_1__2_in_rule__OrExp__Group_1__15369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExp__Or_opAssignment_1_1_in_rule__OrExp__Group_1__1__Impl5396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExp__Group_1__2__Impl_in_rule__OrExp__Group_1__25426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExp__RightAssignment_1_2_in_rule__OrExp__Group_1__2__Impl5453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExp__Group__0__Impl_in_rule__AndExp__Group__05489 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_rule__AndExp__Group__1_in_rule__AndExp__Group__05492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelational_in_rule__AndExp__Group__0__Impl5519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExp__Group__1__Impl_in_rule__AndExp__Group__15548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExp__Group_1__0_in_rule__AndExp__Group__1__Impl5575 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_rule__AndExp__Group_1__0__Impl_in_rule__AndExp__Group_1__05610 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__AndExp__Group_1__1_in_rule__AndExp__Group_1__05613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExp__Group_1__1__Impl_in_rule__AndExp__Group_1__15671 = new BitSet(new long[]{0x00000005000060D0L});
    public static final BitSet FOLLOW_rule__AndExp__Group_1__2_in_rule__AndExp__Group_1__15674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExp__And_opAssignment_1_1_in_rule__AndExp__Group_1__1__Impl5701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExp__Group_1__2__Impl_in_rule__AndExp__Group_1__25731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExp__RightAssignment_1_2_in_rule__AndExp__Group_1__2__Impl5758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group__0__Impl_in_rule__Relational__Group__05794 = new BitSet(new long[]{0x00003F8000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group__1_in_rule__Relational__Group__05797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_rule__Relational__Group__0__Impl5824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group__1__Impl_in_rule__Relational__Group__15853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1__0_in_rule__Relational__Group__1__Impl5880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1__0__Impl_in_rule__Relational__Group_1__05915 = new BitSet(new long[]{0x00000005000060D0L});
    public static final BitSet FOLLOW_rule__Relational__Group_1__1_in_rule__Relational__Group_1__05918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Alternatives_1_0_in_rule__Relational__Group_1__0__Impl5945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1__1__Impl_in_rule__Relational__Group_1__15975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__RightAssignment_1_1_in_rule__Relational__Group_1__1__Impl6002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_0__0__Impl_in_rule__Relational__Group_1_0_0__06036 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_0__1_in_rule__Relational__Group_1_0_0__06039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_0__1__Impl_in_rule__Relational__Group_1_0_0__16097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Rel_opAssignment_1_0_0_1_in_rule__Relational__Group_1_0_0__1__Impl6124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_1__0__Impl_in_rule__Relational__Group_1_0_1__06158 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_1__1_in_rule__Relational__Group_1_0_1__06161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_1__1__Impl_in_rule__Relational__Group_1_0_1__16219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Rel_opAssignment_1_0_1_1_in_rule__Relational__Group_1_0_1__1__Impl6246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_2__0__Impl_in_rule__Relational__Group_1_0_2__06280 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_2__1_in_rule__Relational__Group_1_0_2__06283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_2__1__Impl_in_rule__Relational__Group_1_0_2__16341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Rel_opAssignment_1_0_2_1_in_rule__Relational__Group_1_0_2__1__Impl6368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_3__0__Impl_in_rule__Relational__Group_1_0_3__06402 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_3__1_in_rule__Relational__Group_1_0_3__06405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_3__1__Impl_in_rule__Relational__Group_1_0_3__16463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Rel_opAssignment_1_0_3_1_in_rule__Relational__Group_1_0_3__1__Impl6490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_4__0__Impl_in_rule__Relational__Group_1_0_4__06524 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_4__1_in_rule__Relational__Group_1_0_4__06527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_4__1__Impl_in_rule__Relational__Group_1_0_4__16585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Rel_opAssignment_1_0_4_1_in_rule__Relational__Group_1_0_4__1__Impl6612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_5__0__Impl_in_rule__Relational__Group_1_0_5__06646 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_5__1_in_rule__Relational__Group_1_0_5__06649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_5__1__Impl_in_rule__Relational__Group_1_0_5__16707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Rel_opAssignment_1_0_5_1_in_rule__Relational__Group_1_0_5__1__Impl6734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_6__0__Impl_in_rule__Relational__Group_1_0_6__06768 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_6__1_in_rule__Relational__Group_1_0_6__06771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_6__1__Impl_in_rule__Relational__Group_1_0_6__16829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Rel_opAssignment_1_0_6_1_in_rule__Relational__Group_1_0_6__1__Impl6856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__0__Impl_in_rule__Addition__Group__06890 = new BitSet(new long[]{0x0000400400000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__1_in_rule__Addition__Group__06893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_rule__Addition__Group__0__Impl6920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__1__Impl_in_rule__Addition__Group__16949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__0_in_rule__Addition__Group__1__Impl6976 = new BitSet(new long[]{0x0000400400000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__0__Impl_in_rule__Addition__Group_1__07011 = new BitSet(new long[]{0x00000005000060D0L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__1_in_rule__Addition__Group_1__07014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Alternatives_1_0_in_rule__Addition__Group_1__0__Impl7041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__1__Impl_in_rule__Addition__Group_1__17071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__RightAssignment_1_1_in_rule__Addition__Group_1__1__Impl7098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_0__0__Impl_in_rule__Addition__Group_1_0_0__07132 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_0__1_in_rule__Addition__Group_1_0_0__07135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_0__1__Impl_in_rule__Addition__Group_1_0_0__17193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Add_opAssignment_1_0_0_1_in_rule__Addition__Group_1_0_0__1__Impl7220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_1__0__Impl_in_rule__Addition__Group_1_0_1__07254 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_1__1_in_rule__Addition__Group_1_0_1__07257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_1__1__Impl_in_rule__Addition__Group_1_0_1__17315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Add_opAssignment_1_0_1_1_in_rule__Addition__Group_1_0_1__1__Impl7342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__0__Impl_in_rule__Multiplication__Group__07376 = new BitSet(new long[]{0x0001800000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__1_in_rule__Multiplication__Group__07379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePower_in_rule__Multiplication__Group__0__Impl7406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__1__Impl_in_rule__Multiplication__Group__17435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__0_in_rule__Multiplication__Group__1__Impl7462 = new BitSet(new long[]{0x0001800000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__0__Impl_in_rule__Multiplication__Group_1__07497 = new BitSet(new long[]{0x00000005000060D0L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__1_in_rule__Multiplication__Group_1__07500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Alternatives_1_0_in_rule__Multiplication__Group_1__0__Impl7527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__1__Impl_in_rule__Multiplication__Group_1__17557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__RightAssignment_1_1_in_rule__Multiplication__Group_1__1__Impl7584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_0__0__Impl_in_rule__Multiplication__Group_1_0_0__07618 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_0__1_in_rule__Multiplication__Group_1_0_0__07621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_0__1__Impl_in_rule__Multiplication__Group_1_0_0__17679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Mul_opAssignment_1_0_0_1_in_rule__Multiplication__Group_1_0_0__1__Impl7706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_1__0__Impl_in_rule__Multiplication__Group_1_0_1__07740 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_1__1_in_rule__Multiplication__Group_1_0_1__07743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_1__1__Impl_in_rule__Multiplication__Group_1_0_1__17801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Mul_opAssignment_1_0_1_1_in_rule__Multiplication__Group_1_0_1__1__Impl7828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Power__Group__0__Impl_in_rule__Power__Group__07862 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_rule__Power__Group__1_in_rule__Power__Group__07865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpr_in_rule__Power__Group__0__Impl7892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Power__Group__1__Impl_in_rule__Power__Group__17921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Power__Group_1__0_in_rule__Power__Group__1__Impl7948 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_rule__Power__Group_1__0__Impl_in_rule__Power__Group_1__07983 = new BitSet(new long[]{0x00000005000060D0L});
    public static final BitSet FOLLOW_rule__Power__Group_1__1_in_rule__Power__Group_1__07986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Power__Group_1_0__0_in_rule__Power__Group_1__0__Impl8013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Power__Group_1__1__Impl_in_rule__Power__Group_1__18043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Power__RightAssignment_1_1_in_rule__Power__Group_1__1__Impl8070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Power__Group_1_0__0__Impl_in_rule__Power__Group_1_0__08104 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__Power__Group_1_0__1_in_rule__Power__Group_1_0__08107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Power__Group_1_0__1__Impl_in_rule__Power__Group_1_0__18165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Power__Pow_opAssignment_1_0_1_in_rule__Power__Group_1_0__1__Impl8192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpr__Group__0__Impl_in_rule__UnaryExpr__Group__08226 = new BitSet(new long[]{0x00000005000000D0L});
    public static final BitSet FOLLOW_rule__UnaryExpr__Group__1_in_rule__UnaryExpr__Group__08229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpr__UopAssignment_0_in_rule__UnaryExpr__Group__0__Impl8256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpr__Group__1__Impl_in_rule__UnaryExpr__Group__18287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpr__RightAssignment_1_in_rule__UnaryExpr__Group__1__Impl8314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrePrimaryExpr__Group_1__0__Impl_in_rule__PrePrimaryExpr__Group_1__08348 = new BitSet(new long[]{0x00000005000060D0L});
    public static final BitSet FOLLOW_rule__PrePrimaryExpr__Group_1__1_in_rule__PrePrimaryExpr__Group_1__08351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__PrePrimaryExpr__Group_1__0__Impl8379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrePrimaryExpr__Group_1__1__Impl_in_rule__PrePrimaryExpr__Group_1__18410 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__PrePrimaryExpr__Group_1__2_in_rule__PrePrimaryExpr__Group_1__18413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__PrePrimaryExpr__Group_1__1__Impl8440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrePrimaryExpr__Group_1__2__Impl_in_rule__PrePrimaryExpr__Group_1__28469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__PrePrimaryExpr__Group_1__2__Impl8497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrePrimaryExpr__Group_2__0__Impl_in_rule__PrePrimaryExpr__Group_2__08534 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__PrePrimaryExpr__Group_2__1_in_rule__PrePrimaryExpr__Group_2__08537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__PrePrimaryExpr__Group_2__0__Impl8565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrePrimaryExpr__Group_2__1__Impl_in_rule__PrePrimaryExpr__Group_2__18596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrePrimaryExpr__NAssignment_2_1_in_rule__PrePrimaryExpr__Group_2__1__Impl8623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_0__0__Impl_in_rule__TerminalExpression__Group_0__08657 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_0__1_in_rule__TerminalExpression__Group_0__08660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_0__1__Impl_in_rule__TerminalExpression__Group_0__18718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__ValueAssignment_0_1_in_rule__TerminalExpression__Group_0__1__Impl8745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_1__0__Impl_in_rule__TerminalExpression__Group_1__08779 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_1__1_in_rule__TerminalExpression__Group_1__08782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_1__1__Impl_in_rule__TerminalExpression__Group_1__18840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__ValueAssignment_1_1_in_rule__TerminalExpression__Group_1__1__Impl8867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_2__0__Impl_in_rule__TerminalExpression__Group_2__08901 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_2__1_in_rule__TerminalExpression__Group_2__08904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_2__1__Impl_in_rule__TerminalExpression__Group_2__18962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__ValueAssignment_2_1_in_rule__TerminalExpression__Group_2__1__Impl8989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ArgumentDiagram__NameAssignment_0_19028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_rule__ArgumentDiagram__NodesAssignment_1_09059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_rule__ArgumentDiagram__LinksAssignment_1_19090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Rebuts__FromAssignment_09125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Rebuts__ToAssignment_29164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Mitigates__FromAssignment_09203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Mitigates__ToAssignment_29242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Mitigates__RebuttalAssignment_49281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Argument__NameAssignment_09316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Argument__DescriptionAssignment_29347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Argument__RoundAssignment_3_19378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Argument__OriginAssignment_4_19413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Argument__ExprAssignment_5_19448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Argument__ForegroundAssignment_6_19479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Argument__BackgroundAssignment_7_19510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Argument__ShapeAssignment_8_19541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Argument__ImageAssignment_9_19572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_rule__Argument__GroundsAssignment_10_1_1_19603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_rule__Argument__WarrantsAssignment_10_2_1_19634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentOp_in_rule__Expression__AssignAssignment9665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__AssignmentOp__AopAssignment_1_0_0_19701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__AssignmentOp__AopAssignment_1_0_1_19745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExp_in_rule__AssignmentOp__RightAssignment_1_19784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__OrExp__Or_opAssignment_1_19820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExp_in_rule__OrExp__RightAssignment_1_29859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__AndExp__And_opAssignment_1_19895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelational_in_rule__AndExp__RightAssignment_1_29934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Relational__Rel_opAssignment_1_0_0_19970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Relational__Rel_opAssignment_1_0_1_110014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Relational__Rel_opAssignment_1_0_2_110058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Relational__Rel_opAssignment_1_0_3_110102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Relational__Rel_opAssignment_1_0_4_110146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Relational__Rel_opAssignment_1_0_5_110190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Relational__Rel_opAssignment_1_0_6_110234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_rule__Relational__RightAssignment_1_110273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Addition__Add_opAssignment_1_0_0_110309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Addition__Add_opAssignment_1_0_1_110353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_rule__Addition__RightAssignment_1_110392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Multiplication__Mul_opAssignment_1_0_0_110428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__Multiplication__Mul_opAssignment_1_0_1_110472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePower_in_rule__Multiplication__RightAssignment_1_110511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__Power__Pow_opAssignment_1_0_110547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpr_in_rule__Power__RightAssignment_1_110586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOp_in_rule__UnaryExpr__UopAssignment_010617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrePrimaryExpr_in_rule__UnaryExpr__RightAssignment_110648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__PrePrimaryExpr__NAssignment_2_110679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__TerminalExpression__ValueAssignment_0_110710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__TerminalExpression__ValueAssignment_1_110741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TerminalExpression__ValueAssignment_2_110776 = new BitSet(new long[]{0x0000000000000002L});

}