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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_QUALIFIED_NAME", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'argument:'", "'for'", "'A'", "':'", "'{'", "'}'", "'round'", "'supported by'", "','", "'warranted by'", "'G'", "'rebuts'", "'mitigates'", "'restores'"
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


    // $ANTLR start entryRuleNode
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:89:1: entryRuleNode : ruleNode EOF ;
    public final void entryRuleNode() throws RecognitionException {
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:90:1: ( ruleNode EOF )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:91:1: ruleNode EOF
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:98:1: ruleNode : ( ( rule__Node__Alternatives ) ) ;
    public final void ruleNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:102:2: ( ( ( rule__Node__Alternatives ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:103:1: ( ( rule__Node__Alternatives ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:103:1: ( ( rule__Node__Alternatives ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:104:1: ( rule__Node__Alternatives )
            {
             before(grammarAccess.getNodeAccess().getAlternatives()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:105:1: ( rule__Node__Alternatives )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:105:2: rule__Node__Alternatives
            {
            pushFollow(FOLLOW_rule__Node__Alternatives_in_ruleNode154);
            rule__Node__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getNodeAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start entryRuleArgument
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:117:1: entryRuleArgument : ruleArgument EOF ;
    public final void entryRuleArgument() throws RecognitionException {
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:118:1: ( ruleArgument EOF )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:119:1: ruleArgument EOF
            {
             before(grammarAccess.getArgumentRule()); 
            pushFollow(FOLLOW_ruleArgument_in_entryRuleArgument181);
            ruleArgument();
            _fsp--;

             after(grammarAccess.getArgumentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgument188); 

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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:126:1: ruleArgument : ( ( rule__Argument__Group__0 ) ) ;
    public final void ruleArgument() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:130:2: ( ( ( rule__Argument__Group__0 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:131:1: ( ( rule__Argument__Group__0 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:131:1: ( ( rule__Argument__Group__0 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:132:1: ( rule__Argument__Group__0 )
            {
             before(grammarAccess.getArgumentAccess().getGroup()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:133:1: ( rule__Argument__Group__0 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:133:2: rule__Argument__Group__0
            {
            pushFollow(FOLLOW_rule__Argument__Group__0_in_ruleArgument214);
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


    // $ANTLR start entryRuleFact
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:145:1: entryRuleFact : ruleFact EOF ;
    public final void entryRuleFact() throws RecognitionException {
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:146:1: ( ruleFact EOF )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:147:1: ruleFact EOF
            {
             before(grammarAccess.getFactRule()); 
            pushFollow(FOLLOW_ruleFact_in_entryRuleFact241);
            ruleFact();
            _fsp--;

             after(grammarAccess.getFactRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFact248); 

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
    // $ANTLR end entryRuleFact


    // $ANTLR start ruleFact
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:154:1: ruleFact : ( ( rule__Fact__Group__0 ) ) ;
    public final void ruleFact() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:158:2: ( ( ( rule__Fact__Group__0 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:159:1: ( ( rule__Fact__Group__0 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:159:1: ( ( rule__Fact__Group__0 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:160:1: ( rule__Fact__Group__0 )
            {
             before(grammarAccess.getFactAccess().getGroup()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:161:1: ( rule__Fact__Group__0 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:161:2: rule__Fact__Group__0
            {
            pushFollow(FOLLOW_rule__Fact__Group__0_in_ruleFact274);
            rule__Fact__Group__0();
            _fsp--;


            }

             after(grammarAccess.getFactAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleFact


    // $ANTLR start entryRuleLink
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:173:1: entryRuleLink : ruleLink EOF ;
    public final void entryRuleLink() throws RecognitionException {
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:174:1: ( ruleLink EOF )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:175:1: ruleLink EOF
            {
             before(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_ruleLink_in_entryRuleLink301);
            ruleLink();
            _fsp--;

             after(grammarAccess.getLinkRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLink308); 

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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:182:1: ruleLink : ( ( rule__Link__Alternatives ) ) ;
    public final void ruleLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:186:2: ( ( ( rule__Link__Alternatives ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:187:1: ( ( rule__Link__Alternatives ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:187:1: ( ( rule__Link__Alternatives ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:188:1: ( rule__Link__Alternatives )
            {
             before(grammarAccess.getLinkAccess().getAlternatives()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:189:1: ( rule__Link__Alternatives )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:189:2: rule__Link__Alternatives
            {
            pushFollow(FOLLOW_rule__Link__Alternatives_in_ruleLink334);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:201:1: entryRuleRebuts : ruleRebuts EOF ;
    public final void entryRuleRebuts() throws RecognitionException {
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:202:1: ( ruleRebuts EOF )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:203:1: ruleRebuts EOF
            {
             before(grammarAccess.getRebutsRule()); 
            pushFollow(FOLLOW_ruleRebuts_in_entryRuleRebuts361);
            ruleRebuts();
            _fsp--;

             after(grammarAccess.getRebutsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRebuts368); 

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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:210:1: ruleRebuts : ( ( rule__Rebuts__Group__0 ) ) ;
    public final void ruleRebuts() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:214:2: ( ( ( rule__Rebuts__Group__0 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:215:1: ( ( rule__Rebuts__Group__0 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:215:1: ( ( rule__Rebuts__Group__0 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:216:1: ( rule__Rebuts__Group__0 )
            {
             before(grammarAccess.getRebutsAccess().getGroup()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:217:1: ( rule__Rebuts__Group__0 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:217:2: rule__Rebuts__Group__0
            {
            pushFollow(FOLLOW_rule__Rebuts__Group__0_in_ruleRebuts394);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:229:1: entryRuleMitigates : ruleMitigates EOF ;
    public final void entryRuleMitigates() throws RecognitionException {
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:230:1: ( ruleMitigates EOF )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:231:1: ruleMitigates EOF
            {
             before(grammarAccess.getMitigatesRule()); 
            pushFollow(FOLLOW_ruleMitigates_in_entryRuleMitigates421);
            ruleMitigates();
            _fsp--;

             after(grammarAccess.getMitigatesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMitigates428); 

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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:238:1: ruleMitigates : ( ( rule__Mitigates__Group__0 ) ) ;
    public final void ruleMitigates() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:242:2: ( ( ( rule__Mitigates__Group__0 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:243:1: ( ( rule__Mitigates__Group__0 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:243:1: ( ( rule__Mitigates__Group__0 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:244:1: ( rule__Mitigates__Group__0 )
            {
             before(grammarAccess.getMitigatesAccess().getGroup()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:245:1: ( rule__Mitigates__Group__0 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:245:2: rule__Mitigates__Group__0
            {
            pushFollow(FOLLOW_rule__Mitigates__Group__0_in_ruleMitigates454);
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


    // $ANTLR start entryRuleRestores
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:257:1: entryRuleRestores : ruleRestores EOF ;
    public final void entryRuleRestores() throws RecognitionException {
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:258:1: ( ruleRestores EOF )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:259:1: ruleRestores EOF
            {
             before(grammarAccess.getRestoresRule()); 
            pushFollow(FOLLOW_ruleRestores_in_entryRuleRestores481);
            ruleRestores();
            _fsp--;

             after(grammarAccess.getRestoresRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRestores488); 

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
    // $ANTLR end entryRuleRestores


    // $ANTLR start ruleRestores
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:266:1: ruleRestores : ( ( rule__Restores__Group__0 ) ) ;
    public final void ruleRestores() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:270:2: ( ( ( rule__Restores__Group__0 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:271:1: ( ( rule__Restores__Group__0 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:271:1: ( ( rule__Restores__Group__0 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:272:1: ( rule__Restores__Group__0 )
            {
             before(grammarAccess.getRestoresAccess().getGroup()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:273:1: ( rule__Restores__Group__0 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:273:2: rule__Restores__Group__0
            {
            pushFollow(FOLLOW_rule__Restores__Group__0_in_ruleRestores514);
            rule__Restores__Group__0();
            _fsp--;


            }

             after(grammarAccess.getRestoresAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleRestores


    // $ANTLR start rule__ArgumentDiagram__Alternatives_2
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:285:1: rule__ArgumentDiagram__Alternatives_2 : ( ( ( rule__ArgumentDiagram__NodesAssignment_2_0 ) ) | ( ( rule__ArgumentDiagram__LinksAssignment_2_1 ) ) );
    public final void rule__ArgumentDiagram__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:289:1: ( ( ( rule__ArgumentDiagram__NodesAssignment_2_0 ) ) | ( ( rule__ArgumentDiagram__LinksAssignment_2_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==14||LA1_1==22) ) {
                    alt1=1;
                }
                else if ( ((LA1_1>=23 && LA1_1<=25)) ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("285:1: rule__ArgumentDiagram__Alternatives_2 : ( ( ( rule__ArgumentDiagram__NodesAssignment_2_0 ) ) | ( ( rule__ArgumentDiagram__LinksAssignment_2_1 ) ) );", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("285:1: rule__ArgumentDiagram__Alternatives_2 : ( ( ( rule__ArgumentDiagram__NodesAssignment_2_0 ) ) | ( ( rule__ArgumentDiagram__LinksAssignment_2_1 ) ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:290:1: ( ( rule__ArgumentDiagram__NodesAssignment_2_0 ) )
                    {
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:290:1: ( ( rule__ArgumentDiagram__NodesAssignment_2_0 ) )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:291:1: ( rule__ArgumentDiagram__NodesAssignment_2_0 )
                    {
                     before(grammarAccess.getArgumentDiagramAccess().getNodesAssignment_2_0()); 
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:292:1: ( rule__ArgumentDiagram__NodesAssignment_2_0 )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:292:2: rule__ArgumentDiagram__NodesAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__ArgumentDiagram__NodesAssignment_2_0_in_rule__ArgumentDiagram__Alternatives_2550);
                    rule__ArgumentDiagram__NodesAssignment_2_0();
                    _fsp--;


                    }

                     after(grammarAccess.getArgumentDiagramAccess().getNodesAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:296:6: ( ( rule__ArgumentDiagram__LinksAssignment_2_1 ) )
                    {
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:296:6: ( ( rule__ArgumentDiagram__LinksAssignment_2_1 ) )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:297:1: ( rule__ArgumentDiagram__LinksAssignment_2_1 )
                    {
                     before(grammarAccess.getArgumentDiagramAccess().getLinksAssignment_2_1()); 
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:298:1: ( rule__ArgumentDiagram__LinksAssignment_2_1 )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:298:2: rule__ArgumentDiagram__LinksAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__ArgumentDiagram__LinksAssignment_2_1_in_rule__ArgumentDiagram__Alternatives_2568);
                    rule__ArgumentDiagram__LinksAssignment_2_1();
                    _fsp--;


                    }

                     after(grammarAccess.getArgumentDiagramAccess().getLinksAssignment_2_1()); 

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
    // $ANTLR end rule__ArgumentDiagram__Alternatives_2


    // $ANTLR start rule__Node__Alternatives
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:307:1: rule__Node__Alternatives : ( ( ruleArgument ) | ( ruleFact ) );
    public final void rule__Node__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:311:1: ( ( ruleArgument ) | ( ruleFact ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==14) ) {
                    alt2=1;
                }
                else if ( (LA2_1==22) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("307:1: rule__Node__Alternatives : ( ( ruleArgument ) | ( ruleFact ) );", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("307:1: rule__Node__Alternatives : ( ( ruleArgument ) | ( ruleFact ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:312:1: ( ruleArgument )
                    {
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:312:1: ( ruleArgument )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:313:1: ruleArgument
                    {
                     before(grammarAccess.getNodeAccess().getArgumentParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleArgument_in_rule__Node__Alternatives601);
                    ruleArgument();
                    _fsp--;

                     after(grammarAccess.getNodeAccess().getArgumentParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:318:6: ( ruleFact )
                    {
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:318:6: ( ruleFact )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:319:1: ruleFact
                    {
                     before(grammarAccess.getNodeAccess().getFactParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleFact_in_rule__Node__Alternatives618);
                    ruleFact();
                    _fsp--;

                     after(grammarAccess.getNodeAccess().getFactParserRuleCall_1()); 

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
    // $ANTLR end rule__Node__Alternatives


    // $ANTLR start rule__Link__Alternatives
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:329:1: rule__Link__Alternatives : ( ( ruleRebuts ) | ( ruleMitigates ) | ( ruleRestores ) );
    public final void rule__Link__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:333:1: ( ( ruleRebuts ) | ( ruleMitigates ) | ( ruleRestores ) )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 25:
                    {
                    alt3=3;
                    }
                    break;
                case 23:
                    {
                    alt3=1;
                    }
                    break;
                case 24:
                    {
                    alt3=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("329:1: rule__Link__Alternatives : ( ( ruleRebuts ) | ( ruleMitigates ) | ( ruleRestores ) );", 3, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("329:1: rule__Link__Alternatives : ( ( ruleRebuts ) | ( ruleMitigates ) | ( ruleRestores ) );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:334:1: ( ruleRebuts )
                    {
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:334:1: ( ruleRebuts )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:335:1: ruleRebuts
                    {
                     before(grammarAccess.getLinkAccess().getRebutsParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleRebuts_in_rule__Link__Alternatives650);
                    ruleRebuts();
                    _fsp--;

                     after(grammarAccess.getLinkAccess().getRebutsParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:340:6: ( ruleMitigates )
                    {
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:340:6: ( ruleMitigates )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:341:1: ruleMitigates
                    {
                     before(grammarAccess.getLinkAccess().getMitigatesParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleMitigates_in_rule__Link__Alternatives667);
                    ruleMitigates();
                    _fsp--;

                     after(grammarAccess.getLinkAccess().getMitigatesParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:346:6: ( ruleRestores )
                    {
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:346:6: ( ruleRestores )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:347:1: ruleRestores
                    {
                     before(grammarAccess.getLinkAccess().getRestoresParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleRestores_in_rule__Link__Alternatives684);
                    ruleRestores();
                    _fsp--;

                     after(grammarAccess.getLinkAccess().getRestoresParserRuleCall_2()); 

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


    // $ANTLR start rule__ArgumentDiagram__Group__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:359:1: rule__ArgumentDiagram__Group__0 : rule__ArgumentDiagram__Group__0__Impl rule__ArgumentDiagram__Group__1 ;
    public final void rule__ArgumentDiagram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:363:1: ( rule__ArgumentDiagram__Group__0__Impl rule__ArgumentDiagram__Group__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:364:2: rule__ArgumentDiagram__Group__0__Impl rule__ArgumentDiagram__Group__1
            {
            pushFollow(FOLLOW_rule__ArgumentDiagram__Group__0__Impl_in_rule__ArgumentDiagram__Group__0714);
            rule__ArgumentDiagram__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ArgumentDiagram__Group__1_in_rule__ArgumentDiagram__Group__0717);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:371:1: rule__ArgumentDiagram__Group__0__Impl : ( ( rule__ArgumentDiagram__Group_0__0 )? ) ;
    public final void rule__ArgumentDiagram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:375:1: ( ( ( rule__ArgumentDiagram__Group_0__0 )? ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:376:1: ( ( rule__ArgumentDiagram__Group_0__0 )? )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:376:1: ( ( rule__ArgumentDiagram__Group_0__0 )? )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:377:1: ( rule__ArgumentDiagram__Group_0__0 )?
            {
             before(grammarAccess.getArgumentDiagramAccess().getGroup_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:378:1: ( rule__ArgumentDiagram__Group_0__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:378:2: rule__ArgumentDiagram__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__ArgumentDiagram__Group_0__0_in_rule__ArgumentDiagram__Group__0__Impl744);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:388:1: rule__ArgumentDiagram__Group__1 : rule__ArgumentDiagram__Group__1__Impl rule__ArgumentDiagram__Group__2 ;
    public final void rule__ArgumentDiagram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:392:1: ( rule__ArgumentDiagram__Group__1__Impl rule__ArgumentDiagram__Group__2 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:393:2: rule__ArgumentDiagram__Group__1__Impl rule__ArgumentDiagram__Group__2
            {
            pushFollow(FOLLOW_rule__ArgumentDiagram__Group__1__Impl_in_rule__ArgumentDiagram__Group__1775);
            rule__ArgumentDiagram__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ArgumentDiagram__Group__2_in_rule__ArgumentDiagram__Group__1778);
            rule__ArgumentDiagram__Group__2();
            _fsp--;


            }

        }
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:400:1: rule__ArgumentDiagram__Group__1__Impl : ( ( rule__ArgumentDiagram__Group_1__0 )? ) ;
    public final void rule__ArgumentDiagram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:404:1: ( ( ( rule__ArgumentDiagram__Group_1__0 )? ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:405:1: ( ( rule__ArgumentDiagram__Group_1__0 )? )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:405:1: ( ( rule__ArgumentDiagram__Group_1__0 )? )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:406:1: ( rule__ArgumentDiagram__Group_1__0 )?
            {
             before(grammarAccess.getArgumentDiagramAccess().getGroup_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:407:1: ( rule__ArgumentDiagram__Group_1__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:407:2: rule__ArgumentDiagram__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ArgumentDiagram__Group_1__0_in_rule__ArgumentDiagram__Group__1__Impl805);
                    rule__ArgumentDiagram__Group_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArgumentDiagramAccess().getGroup_1()); 

            }


            }

        }
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


    // $ANTLR start rule__ArgumentDiagram__Group__2
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:417:1: rule__ArgumentDiagram__Group__2 : rule__ArgumentDiagram__Group__2__Impl ;
    public final void rule__ArgumentDiagram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:421:1: ( rule__ArgumentDiagram__Group__2__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:422:2: rule__ArgumentDiagram__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ArgumentDiagram__Group__2__Impl_in_rule__ArgumentDiagram__Group__2836);
            rule__ArgumentDiagram__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ArgumentDiagram__Group__2


    // $ANTLR start rule__ArgumentDiagram__Group__2__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:428:1: rule__ArgumentDiagram__Group__2__Impl : ( ( rule__ArgumentDiagram__Alternatives_2 )* ) ;
    public final void rule__ArgumentDiagram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:432:1: ( ( ( rule__ArgumentDiagram__Alternatives_2 )* ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:433:1: ( ( rule__ArgumentDiagram__Alternatives_2 )* )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:433:1: ( ( rule__ArgumentDiagram__Alternatives_2 )* )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:434:1: ( rule__ArgumentDiagram__Alternatives_2 )*
            {
             before(grammarAccess.getArgumentDiagramAccess().getAlternatives_2()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:435:1: ( rule__ArgumentDiagram__Alternatives_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:435:2: rule__ArgumentDiagram__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_rule__ArgumentDiagram__Alternatives_2_in_rule__ArgumentDiagram__Group__2__Impl863);
            	    rule__ArgumentDiagram__Alternatives_2();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getArgumentDiagramAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ArgumentDiagram__Group__2__Impl


    // $ANTLR start rule__ArgumentDiagram__Group_0__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:451:1: rule__ArgumentDiagram__Group_0__0 : rule__ArgumentDiagram__Group_0__0__Impl rule__ArgumentDiagram__Group_0__1 ;
    public final void rule__ArgumentDiagram__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:455:1: ( rule__ArgumentDiagram__Group_0__0__Impl rule__ArgumentDiagram__Group_0__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:456:2: rule__ArgumentDiagram__Group_0__0__Impl rule__ArgumentDiagram__Group_0__1
            {
            pushFollow(FOLLOW_rule__ArgumentDiagram__Group_0__0__Impl_in_rule__ArgumentDiagram__Group_0__0900);
            rule__ArgumentDiagram__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ArgumentDiagram__Group_0__1_in_rule__ArgumentDiagram__Group_0__0903);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:463:1: rule__ArgumentDiagram__Group_0__0__Impl : ( 'argument:' ) ;
    public final void rule__ArgumentDiagram__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:467:1: ( ( 'argument:' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:468:1: ( 'argument:' )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:468:1: ( 'argument:' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:469:1: 'argument:'
            {
             before(grammarAccess.getArgumentDiagramAccess().getArgumentKeyword_0_0()); 
            match(input,12,FOLLOW_12_in_rule__ArgumentDiagram__Group_0__0__Impl931); 
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:482:1: rule__ArgumentDiagram__Group_0__1 : rule__ArgumentDiagram__Group_0__1__Impl ;
    public final void rule__ArgumentDiagram__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:486:1: ( rule__ArgumentDiagram__Group_0__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:487:2: rule__ArgumentDiagram__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__ArgumentDiagram__Group_0__1__Impl_in_rule__ArgumentDiagram__Group_0__1962);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:493:1: rule__ArgumentDiagram__Group_0__1__Impl : ( ( rule__ArgumentDiagram__NameAssignment_0_1 ) ) ;
    public final void rule__ArgumentDiagram__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:497:1: ( ( ( rule__ArgumentDiagram__NameAssignment_0_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:498:1: ( ( rule__ArgumentDiagram__NameAssignment_0_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:498:1: ( ( rule__ArgumentDiagram__NameAssignment_0_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:499:1: ( rule__ArgumentDiagram__NameAssignment_0_1 )
            {
             before(grammarAccess.getArgumentDiagramAccess().getNameAssignment_0_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:500:1: ( rule__ArgumentDiagram__NameAssignment_0_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:500:2: rule__ArgumentDiagram__NameAssignment_0_1
            {
            pushFollow(FOLLOW_rule__ArgumentDiagram__NameAssignment_0_1_in_rule__ArgumentDiagram__Group_0__1__Impl989);
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


    // $ANTLR start rule__ArgumentDiagram__Group_1__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:514:1: rule__ArgumentDiagram__Group_1__0 : rule__ArgumentDiagram__Group_1__0__Impl rule__ArgumentDiagram__Group_1__1 ;
    public final void rule__ArgumentDiagram__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:518:1: ( rule__ArgumentDiagram__Group_1__0__Impl rule__ArgumentDiagram__Group_1__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:519:2: rule__ArgumentDiagram__Group_1__0__Impl rule__ArgumentDiagram__Group_1__1
            {
            pushFollow(FOLLOW_rule__ArgumentDiagram__Group_1__0__Impl_in_rule__ArgumentDiagram__Group_1__01023);
            rule__ArgumentDiagram__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ArgumentDiagram__Group_1__1_in_rule__ArgumentDiagram__Group_1__01026);
            rule__ArgumentDiagram__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ArgumentDiagram__Group_1__0


    // $ANTLR start rule__ArgumentDiagram__Group_1__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:526:1: rule__ArgumentDiagram__Group_1__0__Impl : ( 'for' ) ;
    public final void rule__ArgumentDiagram__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:530:1: ( ( 'for' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:531:1: ( 'for' )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:531:1: ( 'for' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:532:1: 'for'
            {
             before(grammarAccess.getArgumentDiagramAccess().getForKeyword_1_0()); 
            match(input,13,FOLLOW_13_in_rule__ArgumentDiagram__Group_1__0__Impl1054); 
             after(grammarAccess.getArgumentDiagramAccess().getForKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ArgumentDiagram__Group_1__0__Impl


    // $ANTLR start rule__ArgumentDiagram__Group_1__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:545:1: rule__ArgumentDiagram__Group_1__1 : rule__ArgumentDiagram__Group_1__1__Impl ;
    public final void rule__ArgumentDiagram__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:549:1: ( rule__ArgumentDiagram__Group_1__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:550:2: rule__ArgumentDiagram__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ArgumentDiagram__Group_1__1__Impl_in_rule__ArgumentDiagram__Group_1__11085);
            rule__ArgumentDiagram__Group_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ArgumentDiagram__Group_1__1


    // $ANTLR start rule__ArgumentDiagram__Group_1__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:556:1: rule__ArgumentDiagram__Group_1__1__Impl : ( ( rule__ArgumentDiagram__HighlightAssignment_1_1 ) ) ;
    public final void rule__ArgumentDiagram__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:560:1: ( ( ( rule__ArgumentDiagram__HighlightAssignment_1_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:561:1: ( ( rule__ArgumentDiagram__HighlightAssignment_1_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:561:1: ( ( rule__ArgumentDiagram__HighlightAssignment_1_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:562:1: ( rule__ArgumentDiagram__HighlightAssignment_1_1 )
            {
             before(grammarAccess.getArgumentDiagramAccess().getHighlightAssignment_1_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:563:1: ( rule__ArgumentDiagram__HighlightAssignment_1_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:563:2: rule__ArgumentDiagram__HighlightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ArgumentDiagram__HighlightAssignment_1_1_in_rule__ArgumentDiagram__Group_1__1__Impl1112);
            rule__ArgumentDiagram__HighlightAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getArgumentDiagramAccess().getHighlightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ArgumentDiagram__Group_1__1__Impl


    // $ANTLR start rule__Argument__Group__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:577:1: rule__Argument__Group__0 : rule__Argument__Group__0__Impl rule__Argument__Group__1 ;
    public final void rule__Argument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:581:1: ( rule__Argument__Group__0__Impl rule__Argument__Group__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:582:2: rule__Argument__Group__0__Impl rule__Argument__Group__1
            {
            pushFollow(FOLLOW_rule__Argument__Group__0__Impl_in_rule__Argument__Group__01146);
            rule__Argument__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group__1_in_rule__Argument__Group__01149);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:589:1: rule__Argument__Group__0__Impl : ( ( rule__Argument__NameAssignment_0 ) ) ;
    public final void rule__Argument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:593:1: ( ( ( rule__Argument__NameAssignment_0 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:594:1: ( ( rule__Argument__NameAssignment_0 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:594:1: ( ( rule__Argument__NameAssignment_0 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:595:1: ( rule__Argument__NameAssignment_0 )
            {
             before(grammarAccess.getArgumentAccess().getNameAssignment_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:596:1: ( rule__Argument__NameAssignment_0 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:596:2: rule__Argument__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Argument__NameAssignment_0_in_rule__Argument__Group__0__Impl1176);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:606:1: rule__Argument__Group__1 : rule__Argument__Group__1__Impl rule__Argument__Group__2 ;
    public final void rule__Argument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:610:1: ( rule__Argument__Group__1__Impl rule__Argument__Group__2 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:611:2: rule__Argument__Group__1__Impl rule__Argument__Group__2
            {
            pushFollow(FOLLOW_rule__Argument__Group__1__Impl_in_rule__Argument__Group__11206);
            rule__Argument__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group__2_in_rule__Argument__Group__11209);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:618:1: rule__Argument__Group__1__Impl : ( 'A' ) ;
    public final void rule__Argument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:622:1: ( ( 'A' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:623:1: ( 'A' )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:623:1: ( 'A' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:624:1: 'A'
            {
             before(grammarAccess.getArgumentAccess().getAKeyword_1()); 
            match(input,14,FOLLOW_14_in_rule__Argument__Group__1__Impl1237); 
             after(grammarAccess.getArgumentAccess().getAKeyword_1()); 

            }


            }

        }
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:637:1: rule__Argument__Group__2 : rule__Argument__Group__2__Impl rule__Argument__Group__3 ;
    public final void rule__Argument__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:641:1: ( rule__Argument__Group__2__Impl rule__Argument__Group__3 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:642:2: rule__Argument__Group__2__Impl rule__Argument__Group__3
            {
            pushFollow(FOLLOW_rule__Argument__Group__2__Impl_in_rule__Argument__Group__21268);
            rule__Argument__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group__3_in_rule__Argument__Group__21271);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:649:1: rule__Argument__Group__2__Impl : ( ( rule__Argument__Group_2__0 )? ) ;
    public final void rule__Argument__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:653:1: ( ( ( rule__Argument__Group_2__0 )? ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:654:1: ( ( rule__Argument__Group_2__0 )? )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:654:1: ( ( rule__Argument__Group_2__0 )? )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:655:1: ( rule__Argument__Group_2__0 )?
            {
             before(grammarAccess.getArgumentAccess().getGroup_2()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:656:1: ( rule__Argument__Group_2__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:656:2: rule__Argument__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Argument__Group_2__0_in_rule__Argument__Group__2__Impl1298);
                    rule__Argument__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArgumentAccess().getGroup_2()); 

            }


            }

        }
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:666:1: rule__Argument__Group__3 : rule__Argument__Group__3__Impl rule__Argument__Group__4 ;
    public final void rule__Argument__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:670:1: ( rule__Argument__Group__3__Impl rule__Argument__Group__4 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:671:2: rule__Argument__Group__3__Impl rule__Argument__Group__4
            {
            pushFollow(FOLLOW_rule__Argument__Group__3__Impl_in_rule__Argument__Group__31329);
            rule__Argument__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group__4_in_rule__Argument__Group__31332);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:678:1: rule__Argument__Group__3__Impl : ( ( ':' )? ) ;
    public final void rule__Argument__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:682:1: ( ( ( ':' )? ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:683:1: ( ( ':' )? )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:683:1: ( ( ':' )? )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:684:1: ( ':' )?
            {
             before(grammarAccess.getArgumentAccess().getColonKeyword_3()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:685:1: ( ':' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:686:2: ':'
                    {
                    match(input,15,FOLLOW_15_in_rule__Argument__Group__3__Impl1361); 

                    }
                    break;

            }

             after(grammarAccess.getArgumentAccess().getColonKeyword_3()); 

            }


            }

        }
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:697:1: rule__Argument__Group__4 : rule__Argument__Group__4__Impl ;
    public final void rule__Argument__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:701:1: ( rule__Argument__Group__4__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:702:2: rule__Argument__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Argument__Group__4__Impl_in_rule__Argument__Group__41394);
            rule__Argument__Group__4__Impl();
            _fsp--;


            }

        }
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:708:1: rule__Argument__Group__4__Impl : ( ( rule__Argument__DescriptionAssignment_4 )? ) ;
    public final void rule__Argument__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:712:1: ( ( ( rule__Argument__DescriptionAssignment_4 )? ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:713:1: ( ( rule__Argument__DescriptionAssignment_4 )? )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:713:1: ( ( rule__Argument__DescriptionAssignment_4 )? )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:714:1: ( rule__Argument__DescriptionAssignment_4 )?
            {
             before(grammarAccess.getArgumentAccess().getDescriptionAssignment_4()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:715:1: ( rule__Argument__DescriptionAssignment_4 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:715:2: rule__Argument__DescriptionAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Argument__DescriptionAssignment_4_in_rule__Argument__Group__4__Impl1421);
                    rule__Argument__DescriptionAssignment_4();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArgumentAccess().getDescriptionAssignment_4()); 

            }


            }

        }
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


    // $ANTLR start rule__Argument__Group_2__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:735:1: rule__Argument__Group_2__0 : rule__Argument__Group_2__0__Impl rule__Argument__Group_2__1 ;
    public final void rule__Argument__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:739:1: ( rule__Argument__Group_2__0__Impl rule__Argument__Group_2__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:740:2: rule__Argument__Group_2__0__Impl rule__Argument__Group_2__1
            {
            pushFollow(FOLLOW_rule__Argument__Group_2__0__Impl_in_rule__Argument__Group_2__01462);
            rule__Argument__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group_2__1_in_rule__Argument__Group_2__01465);
            rule__Argument__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_2__0


    // $ANTLR start rule__Argument__Group_2__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:747:1: rule__Argument__Group_2__0__Impl : ( '{' ) ;
    public final void rule__Argument__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:751:1: ( ( '{' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:752:1: ( '{' )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:752:1: ( '{' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:753:1: '{'
            {
             before(grammarAccess.getArgumentAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,16,FOLLOW_16_in_rule__Argument__Group_2__0__Impl1493); 
             after(grammarAccess.getArgumentAccess().getLeftCurlyBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_2__0__Impl


    // $ANTLR start rule__Argument__Group_2__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:766:1: rule__Argument__Group_2__1 : rule__Argument__Group_2__1__Impl rule__Argument__Group_2__2 ;
    public final void rule__Argument__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:770:1: ( rule__Argument__Group_2__1__Impl rule__Argument__Group_2__2 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:771:2: rule__Argument__Group_2__1__Impl rule__Argument__Group_2__2
            {
            pushFollow(FOLLOW_rule__Argument__Group_2__1__Impl_in_rule__Argument__Group_2__11524);
            rule__Argument__Group_2__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group_2__2_in_rule__Argument__Group_2__11527);
            rule__Argument__Group_2__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_2__1


    // $ANTLR start rule__Argument__Group_2__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:778:1: rule__Argument__Group_2__1__Impl : ( ( rule__Argument__Group_2_1__0 )? ) ;
    public final void rule__Argument__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:782:1: ( ( ( rule__Argument__Group_2_1__0 )? ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:783:1: ( ( rule__Argument__Group_2_1__0 )? )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:783:1: ( ( rule__Argument__Group_2_1__0 )? )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:784:1: ( rule__Argument__Group_2_1__0 )?
            {
             before(grammarAccess.getArgumentAccess().getGroup_2_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:785:1: ( rule__Argument__Group_2_1__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:785:2: rule__Argument__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__Argument__Group_2_1__0_in_rule__Argument__Group_2__1__Impl1554);
                    rule__Argument__Group_2_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArgumentAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_2__1__Impl


    // $ANTLR start rule__Argument__Group_2__2
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:795:1: rule__Argument__Group_2__2 : rule__Argument__Group_2__2__Impl rule__Argument__Group_2__3 ;
    public final void rule__Argument__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:799:1: ( rule__Argument__Group_2__2__Impl rule__Argument__Group_2__3 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:800:2: rule__Argument__Group_2__2__Impl rule__Argument__Group_2__3
            {
            pushFollow(FOLLOW_rule__Argument__Group_2__2__Impl_in_rule__Argument__Group_2__21585);
            rule__Argument__Group_2__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group_2__3_in_rule__Argument__Group_2__21588);
            rule__Argument__Group_2__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_2__2


    // $ANTLR start rule__Argument__Group_2__2__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:807:1: rule__Argument__Group_2__2__Impl : ( ( rule__Argument__Group_2_2__0 )? ) ;
    public final void rule__Argument__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:811:1: ( ( ( rule__Argument__Group_2_2__0 )? ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:812:1: ( ( rule__Argument__Group_2_2__0 )? )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:812:1: ( ( rule__Argument__Group_2_2__0 )? )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:813:1: ( rule__Argument__Group_2_2__0 )?
            {
             before(grammarAccess.getArgumentAccess().getGroup_2_2()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:814:1: ( rule__Argument__Group_2_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:814:2: rule__Argument__Group_2_2__0
                    {
                    pushFollow(FOLLOW_rule__Argument__Group_2_2__0_in_rule__Argument__Group_2__2__Impl1615);
                    rule__Argument__Group_2_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArgumentAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_2__2__Impl


    // $ANTLR start rule__Argument__Group_2__3
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:824:1: rule__Argument__Group_2__3 : rule__Argument__Group_2__3__Impl rule__Argument__Group_2__4 ;
    public final void rule__Argument__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:828:1: ( rule__Argument__Group_2__3__Impl rule__Argument__Group_2__4 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:829:2: rule__Argument__Group_2__3__Impl rule__Argument__Group_2__4
            {
            pushFollow(FOLLOW_rule__Argument__Group_2__3__Impl_in_rule__Argument__Group_2__31646);
            rule__Argument__Group_2__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group_2__4_in_rule__Argument__Group_2__31649);
            rule__Argument__Group_2__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_2__3


    // $ANTLR start rule__Argument__Group_2__3__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:836:1: rule__Argument__Group_2__3__Impl : ( ( rule__Argument__Group_2_3__0 )? ) ;
    public final void rule__Argument__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:840:1: ( ( ( rule__Argument__Group_2_3__0 )? ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:841:1: ( ( rule__Argument__Group_2_3__0 )? )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:841:1: ( ( rule__Argument__Group_2_3__0 )? )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:842:1: ( rule__Argument__Group_2_3__0 )?
            {
             before(grammarAccess.getArgumentAccess().getGroup_2_3()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:843:1: ( rule__Argument__Group_2_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:843:2: rule__Argument__Group_2_3__0
                    {
                    pushFollow(FOLLOW_rule__Argument__Group_2_3__0_in_rule__Argument__Group_2__3__Impl1676);
                    rule__Argument__Group_2_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArgumentAccess().getGroup_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_2__3__Impl


    // $ANTLR start rule__Argument__Group_2__4
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:853:1: rule__Argument__Group_2__4 : rule__Argument__Group_2__4__Impl ;
    public final void rule__Argument__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:857:1: ( rule__Argument__Group_2__4__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:858:2: rule__Argument__Group_2__4__Impl
            {
            pushFollow(FOLLOW_rule__Argument__Group_2__4__Impl_in_rule__Argument__Group_2__41707);
            rule__Argument__Group_2__4__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_2__4


    // $ANTLR start rule__Argument__Group_2__4__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:864:1: rule__Argument__Group_2__4__Impl : ( '}' ) ;
    public final void rule__Argument__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:868:1: ( ( '}' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:869:1: ( '}' )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:869:1: ( '}' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:870:1: '}'
            {
             before(grammarAccess.getArgumentAccess().getRightCurlyBracketKeyword_2_4()); 
            match(input,17,FOLLOW_17_in_rule__Argument__Group_2__4__Impl1735); 
             after(grammarAccess.getArgumentAccess().getRightCurlyBracketKeyword_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_2__4__Impl


    // $ANTLR start rule__Argument__Group_2_1__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:893:1: rule__Argument__Group_2_1__0 : rule__Argument__Group_2_1__0__Impl rule__Argument__Group_2_1__1 ;
    public final void rule__Argument__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:897:1: ( rule__Argument__Group_2_1__0__Impl rule__Argument__Group_2_1__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:898:2: rule__Argument__Group_2_1__0__Impl rule__Argument__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__Argument__Group_2_1__0__Impl_in_rule__Argument__Group_2_1__01776);
            rule__Argument__Group_2_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group_2_1__1_in_rule__Argument__Group_2_1__01779);
            rule__Argument__Group_2_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_2_1__0


    // $ANTLR start rule__Argument__Group_2_1__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:905:1: rule__Argument__Group_2_1__0__Impl : ( 'round' ) ;
    public final void rule__Argument__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:909:1: ( ( 'round' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:910:1: ( 'round' )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:910:1: ( 'round' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:911:1: 'round'
            {
             before(grammarAccess.getArgumentAccess().getRoundKeyword_2_1_0()); 
            match(input,18,FOLLOW_18_in_rule__Argument__Group_2_1__0__Impl1807); 
             after(grammarAccess.getArgumentAccess().getRoundKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_2_1__0__Impl


    // $ANTLR start rule__Argument__Group_2_1__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:924:1: rule__Argument__Group_2_1__1 : rule__Argument__Group_2_1__1__Impl ;
    public final void rule__Argument__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:928:1: ( rule__Argument__Group_2_1__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:929:2: rule__Argument__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Argument__Group_2_1__1__Impl_in_rule__Argument__Group_2_1__11838);
            rule__Argument__Group_2_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_2_1__1


    // $ANTLR start rule__Argument__Group_2_1__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:935:1: rule__Argument__Group_2_1__1__Impl : ( ( rule__Argument__RoundAssignment_2_1_1 ) ) ;
    public final void rule__Argument__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:939:1: ( ( ( rule__Argument__RoundAssignment_2_1_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:940:1: ( ( rule__Argument__RoundAssignment_2_1_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:940:1: ( ( rule__Argument__RoundAssignment_2_1_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:941:1: ( rule__Argument__RoundAssignment_2_1_1 )
            {
             before(grammarAccess.getArgumentAccess().getRoundAssignment_2_1_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:942:1: ( rule__Argument__RoundAssignment_2_1_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:942:2: rule__Argument__RoundAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__Argument__RoundAssignment_2_1_1_in_rule__Argument__Group_2_1__1__Impl1865);
            rule__Argument__RoundAssignment_2_1_1();
            _fsp--;


            }

             after(grammarAccess.getArgumentAccess().getRoundAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_2_1__1__Impl


    // $ANTLR start rule__Argument__Group_2_2__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:956:1: rule__Argument__Group_2_2__0 : rule__Argument__Group_2_2__0__Impl rule__Argument__Group_2_2__1 ;
    public final void rule__Argument__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:960:1: ( rule__Argument__Group_2_2__0__Impl rule__Argument__Group_2_2__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:961:2: rule__Argument__Group_2_2__0__Impl rule__Argument__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__Argument__Group_2_2__0__Impl_in_rule__Argument__Group_2_2__01899);
            rule__Argument__Group_2_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group_2_2__1_in_rule__Argument__Group_2_2__01902);
            rule__Argument__Group_2_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_2_2__0


    // $ANTLR start rule__Argument__Group_2_2__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:968:1: rule__Argument__Group_2_2__0__Impl : ( 'supported by' ) ;
    public final void rule__Argument__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:972:1: ( ( 'supported by' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:973:1: ( 'supported by' )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:973:1: ( 'supported by' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:974:1: 'supported by'
            {
             before(grammarAccess.getArgumentAccess().getSupportedByKeyword_2_2_0()); 
            match(input,19,FOLLOW_19_in_rule__Argument__Group_2_2__0__Impl1930); 
             after(grammarAccess.getArgumentAccess().getSupportedByKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_2_2__0__Impl


    // $ANTLR start rule__Argument__Group_2_2__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:987:1: rule__Argument__Group_2_2__1 : rule__Argument__Group_2_2__1__Impl ;
    public final void rule__Argument__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:991:1: ( rule__Argument__Group_2_2__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:992:2: rule__Argument__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Argument__Group_2_2__1__Impl_in_rule__Argument__Group_2_2__11961);
            rule__Argument__Group_2_2__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_2_2__1


    // $ANTLR start rule__Argument__Group_2_2__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:998:1: rule__Argument__Group_2_2__1__Impl : ( ( rule__Argument__Group_2_2_1__0 )* ) ;
    public final void rule__Argument__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1002:1: ( ( ( rule__Argument__Group_2_2_1__0 )* ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1003:1: ( ( rule__Argument__Group_2_2_1__0 )* )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1003:1: ( ( rule__Argument__Group_2_2_1__0 )* )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1004:1: ( rule__Argument__Group_2_2_1__0 )*
            {
             before(grammarAccess.getArgumentAccess().getGroup_2_2_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1005:1: ( rule__Argument__Group_2_2_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID||LA13_0==20) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1005:2: rule__Argument__Group_2_2_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Argument__Group_2_2_1__0_in_rule__Argument__Group_2_2__1__Impl1988);
            	    rule__Argument__Group_2_2_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getArgumentAccess().getGroup_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_2_2__1__Impl


    // $ANTLR start rule__Argument__Group_2_2_1__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1019:1: rule__Argument__Group_2_2_1__0 : rule__Argument__Group_2_2_1__0__Impl rule__Argument__Group_2_2_1__1 ;
    public final void rule__Argument__Group_2_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1023:1: ( rule__Argument__Group_2_2_1__0__Impl rule__Argument__Group_2_2_1__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1024:2: rule__Argument__Group_2_2_1__0__Impl rule__Argument__Group_2_2_1__1
            {
            pushFollow(FOLLOW_rule__Argument__Group_2_2_1__0__Impl_in_rule__Argument__Group_2_2_1__02023);
            rule__Argument__Group_2_2_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group_2_2_1__1_in_rule__Argument__Group_2_2_1__02026);
            rule__Argument__Group_2_2_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_2_2_1__0


    // $ANTLR start rule__Argument__Group_2_2_1__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1031:1: rule__Argument__Group_2_2_1__0__Impl : ( ( ',' )? ) ;
    public final void rule__Argument__Group_2_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1035:1: ( ( ( ',' )? ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1036:1: ( ( ',' )? )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1036:1: ( ( ',' )? )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1037:1: ( ',' )?
            {
             before(grammarAccess.getArgumentAccess().getCommaKeyword_2_2_1_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1038:1: ( ',' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==20) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1039:2: ','
                    {
                    match(input,20,FOLLOW_20_in_rule__Argument__Group_2_2_1__0__Impl2055); 

                    }
                    break;

            }

             after(grammarAccess.getArgumentAccess().getCommaKeyword_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_2_2_1__0__Impl


    // $ANTLR start rule__Argument__Group_2_2_1__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1050:1: rule__Argument__Group_2_2_1__1 : rule__Argument__Group_2_2_1__1__Impl ;
    public final void rule__Argument__Group_2_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1054:1: ( rule__Argument__Group_2_2_1__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1055:2: rule__Argument__Group_2_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Argument__Group_2_2_1__1__Impl_in_rule__Argument__Group_2_2_1__12088);
            rule__Argument__Group_2_2_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_2_2_1__1


    // $ANTLR start rule__Argument__Group_2_2_1__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1061:1: rule__Argument__Group_2_2_1__1__Impl : ( ( rule__Argument__GroundsAssignment_2_2_1_1 ) ) ;
    public final void rule__Argument__Group_2_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1065:1: ( ( ( rule__Argument__GroundsAssignment_2_2_1_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1066:1: ( ( rule__Argument__GroundsAssignment_2_2_1_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1066:1: ( ( rule__Argument__GroundsAssignment_2_2_1_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1067:1: ( rule__Argument__GroundsAssignment_2_2_1_1 )
            {
             before(grammarAccess.getArgumentAccess().getGroundsAssignment_2_2_1_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1068:1: ( rule__Argument__GroundsAssignment_2_2_1_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1068:2: rule__Argument__GroundsAssignment_2_2_1_1
            {
            pushFollow(FOLLOW_rule__Argument__GroundsAssignment_2_2_1_1_in_rule__Argument__Group_2_2_1__1__Impl2115);
            rule__Argument__GroundsAssignment_2_2_1_1();
            _fsp--;


            }

             after(grammarAccess.getArgumentAccess().getGroundsAssignment_2_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_2_2_1__1__Impl


    // $ANTLR start rule__Argument__Group_2_3__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1082:1: rule__Argument__Group_2_3__0 : rule__Argument__Group_2_3__0__Impl rule__Argument__Group_2_3__1 ;
    public final void rule__Argument__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1086:1: ( rule__Argument__Group_2_3__0__Impl rule__Argument__Group_2_3__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1087:2: rule__Argument__Group_2_3__0__Impl rule__Argument__Group_2_3__1
            {
            pushFollow(FOLLOW_rule__Argument__Group_2_3__0__Impl_in_rule__Argument__Group_2_3__02149);
            rule__Argument__Group_2_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group_2_3__1_in_rule__Argument__Group_2_3__02152);
            rule__Argument__Group_2_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_2_3__0


    // $ANTLR start rule__Argument__Group_2_3__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1094:1: rule__Argument__Group_2_3__0__Impl : ( 'warranted by' ) ;
    public final void rule__Argument__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1098:1: ( ( 'warranted by' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1099:1: ( 'warranted by' )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1099:1: ( 'warranted by' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1100:1: 'warranted by'
            {
             before(grammarAccess.getArgumentAccess().getWarrantedByKeyword_2_3_0()); 
            match(input,21,FOLLOW_21_in_rule__Argument__Group_2_3__0__Impl2180); 
             after(grammarAccess.getArgumentAccess().getWarrantedByKeyword_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_2_3__0__Impl


    // $ANTLR start rule__Argument__Group_2_3__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1113:1: rule__Argument__Group_2_3__1 : rule__Argument__Group_2_3__1__Impl ;
    public final void rule__Argument__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1117:1: ( rule__Argument__Group_2_3__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1118:2: rule__Argument__Group_2_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Argument__Group_2_3__1__Impl_in_rule__Argument__Group_2_3__12211);
            rule__Argument__Group_2_3__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_2_3__1


    // $ANTLR start rule__Argument__Group_2_3__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1124:1: rule__Argument__Group_2_3__1__Impl : ( ( rule__Argument__Group_2_3_1__0 )* ) ;
    public final void rule__Argument__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1128:1: ( ( ( rule__Argument__Group_2_3_1__0 )* ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1129:1: ( ( rule__Argument__Group_2_3_1__0 )* )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1129:1: ( ( rule__Argument__Group_2_3_1__0 )* )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1130:1: ( rule__Argument__Group_2_3_1__0 )*
            {
             before(grammarAccess.getArgumentAccess().getGroup_2_3_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1131:1: ( rule__Argument__Group_2_3_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID||LA15_0==20) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1131:2: rule__Argument__Group_2_3_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Argument__Group_2_3_1__0_in_rule__Argument__Group_2_3__1__Impl2238);
            	    rule__Argument__Group_2_3_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getArgumentAccess().getGroup_2_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_2_3__1__Impl


    // $ANTLR start rule__Argument__Group_2_3_1__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1145:1: rule__Argument__Group_2_3_1__0 : rule__Argument__Group_2_3_1__0__Impl rule__Argument__Group_2_3_1__1 ;
    public final void rule__Argument__Group_2_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1149:1: ( rule__Argument__Group_2_3_1__0__Impl rule__Argument__Group_2_3_1__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1150:2: rule__Argument__Group_2_3_1__0__Impl rule__Argument__Group_2_3_1__1
            {
            pushFollow(FOLLOW_rule__Argument__Group_2_3_1__0__Impl_in_rule__Argument__Group_2_3_1__02273);
            rule__Argument__Group_2_3_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group_2_3_1__1_in_rule__Argument__Group_2_3_1__02276);
            rule__Argument__Group_2_3_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_2_3_1__0


    // $ANTLR start rule__Argument__Group_2_3_1__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1157:1: rule__Argument__Group_2_3_1__0__Impl : ( ( ',' )? ) ;
    public final void rule__Argument__Group_2_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1161:1: ( ( ( ',' )? ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1162:1: ( ( ',' )? )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1162:1: ( ( ',' )? )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1163:1: ( ',' )?
            {
             before(grammarAccess.getArgumentAccess().getCommaKeyword_2_3_1_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1164:1: ( ',' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==20) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1165:2: ','
                    {
                    match(input,20,FOLLOW_20_in_rule__Argument__Group_2_3_1__0__Impl2305); 

                    }
                    break;

            }

             after(grammarAccess.getArgumentAccess().getCommaKeyword_2_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_2_3_1__0__Impl


    // $ANTLR start rule__Argument__Group_2_3_1__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1176:1: rule__Argument__Group_2_3_1__1 : rule__Argument__Group_2_3_1__1__Impl ;
    public final void rule__Argument__Group_2_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1180:1: ( rule__Argument__Group_2_3_1__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1181:2: rule__Argument__Group_2_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Argument__Group_2_3_1__1__Impl_in_rule__Argument__Group_2_3_1__12338);
            rule__Argument__Group_2_3_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_2_3_1__1


    // $ANTLR start rule__Argument__Group_2_3_1__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1187:1: rule__Argument__Group_2_3_1__1__Impl : ( ( rule__Argument__WarrantsAssignment_2_3_1_1 ) ) ;
    public final void rule__Argument__Group_2_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1191:1: ( ( ( rule__Argument__WarrantsAssignment_2_3_1_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1192:1: ( ( rule__Argument__WarrantsAssignment_2_3_1_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1192:1: ( ( rule__Argument__WarrantsAssignment_2_3_1_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1193:1: ( rule__Argument__WarrantsAssignment_2_3_1_1 )
            {
             before(grammarAccess.getArgumentAccess().getWarrantsAssignment_2_3_1_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1194:1: ( rule__Argument__WarrantsAssignment_2_3_1_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1194:2: rule__Argument__WarrantsAssignment_2_3_1_1
            {
            pushFollow(FOLLOW_rule__Argument__WarrantsAssignment_2_3_1_1_in_rule__Argument__Group_2_3_1__1__Impl2365);
            rule__Argument__WarrantsAssignment_2_3_1_1();
            _fsp--;


            }

             after(grammarAccess.getArgumentAccess().getWarrantsAssignment_2_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_2_3_1__1__Impl


    // $ANTLR start rule__Fact__Group__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1208:1: rule__Fact__Group__0 : rule__Fact__Group__0__Impl rule__Fact__Group__1 ;
    public final void rule__Fact__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1212:1: ( rule__Fact__Group__0__Impl rule__Fact__Group__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1213:2: rule__Fact__Group__0__Impl rule__Fact__Group__1
            {
            pushFollow(FOLLOW_rule__Fact__Group__0__Impl_in_rule__Fact__Group__02399);
            rule__Fact__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Fact__Group__1_in_rule__Fact__Group__02402);
            rule__Fact__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fact__Group__0


    // $ANTLR start rule__Fact__Group__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1220:1: rule__Fact__Group__0__Impl : ( ( rule__Fact__NameAssignment_0 ) ) ;
    public final void rule__Fact__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1224:1: ( ( ( rule__Fact__NameAssignment_0 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1225:1: ( ( rule__Fact__NameAssignment_0 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1225:1: ( ( rule__Fact__NameAssignment_0 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1226:1: ( rule__Fact__NameAssignment_0 )
            {
             before(grammarAccess.getFactAccess().getNameAssignment_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1227:1: ( rule__Fact__NameAssignment_0 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1227:2: rule__Fact__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Fact__NameAssignment_0_in_rule__Fact__Group__0__Impl2429);
            rule__Fact__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getFactAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fact__Group__0__Impl


    // $ANTLR start rule__Fact__Group__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1237:1: rule__Fact__Group__1 : rule__Fact__Group__1__Impl rule__Fact__Group__2 ;
    public final void rule__Fact__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1241:1: ( rule__Fact__Group__1__Impl rule__Fact__Group__2 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1242:2: rule__Fact__Group__1__Impl rule__Fact__Group__2
            {
            pushFollow(FOLLOW_rule__Fact__Group__1__Impl_in_rule__Fact__Group__12459);
            rule__Fact__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Fact__Group__2_in_rule__Fact__Group__12462);
            rule__Fact__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fact__Group__1


    // $ANTLR start rule__Fact__Group__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1249:1: rule__Fact__Group__1__Impl : ( 'G' ) ;
    public final void rule__Fact__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1253:1: ( ( 'G' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1254:1: ( 'G' )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1254:1: ( 'G' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1255:1: 'G'
            {
             before(grammarAccess.getFactAccess().getGKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__Fact__Group__1__Impl2490); 
             after(grammarAccess.getFactAccess().getGKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fact__Group__1__Impl


    // $ANTLR start rule__Fact__Group__2
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1268:1: rule__Fact__Group__2 : rule__Fact__Group__2__Impl ;
    public final void rule__Fact__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1272:1: ( rule__Fact__Group__2__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1273:2: rule__Fact__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Fact__Group__2__Impl_in_rule__Fact__Group__22521);
            rule__Fact__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fact__Group__2


    // $ANTLR start rule__Fact__Group__2__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1279:1: rule__Fact__Group__2__Impl : ( ( rule__Fact__Group_2__0 )? ) ;
    public final void rule__Fact__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1283:1: ( ( ( rule__Fact__Group_2__0 )? ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1284:1: ( ( rule__Fact__Group_2__0 )? )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1284:1: ( ( rule__Fact__Group_2__0 )? )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1285:1: ( rule__Fact__Group_2__0 )?
            {
             before(grammarAccess.getFactAccess().getGroup_2()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1286:1: ( rule__Fact__Group_2__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING||LA17_0==15) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1286:2: rule__Fact__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Fact__Group_2__0_in_rule__Fact__Group__2__Impl2548);
                    rule__Fact__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFactAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fact__Group__2__Impl


    // $ANTLR start rule__Fact__Group_2__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1302:1: rule__Fact__Group_2__0 : rule__Fact__Group_2__0__Impl rule__Fact__Group_2__1 ;
    public final void rule__Fact__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1306:1: ( rule__Fact__Group_2__0__Impl rule__Fact__Group_2__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1307:2: rule__Fact__Group_2__0__Impl rule__Fact__Group_2__1
            {
            pushFollow(FOLLOW_rule__Fact__Group_2__0__Impl_in_rule__Fact__Group_2__02585);
            rule__Fact__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Fact__Group_2__1_in_rule__Fact__Group_2__02588);
            rule__Fact__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fact__Group_2__0


    // $ANTLR start rule__Fact__Group_2__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1314:1: rule__Fact__Group_2__0__Impl : ( ( ':' )? ) ;
    public final void rule__Fact__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1318:1: ( ( ( ':' )? ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1319:1: ( ( ':' )? )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1319:1: ( ( ':' )? )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1320:1: ( ':' )?
            {
             before(grammarAccess.getFactAccess().getColonKeyword_2_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1321:1: ( ':' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==15) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1322:2: ':'
                    {
                    match(input,15,FOLLOW_15_in_rule__Fact__Group_2__0__Impl2617); 

                    }
                    break;

            }

             after(grammarAccess.getFactAccess().getColonKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fact__Group_2__0__Impl


    // $ANTLR start rule__Fact__Group_2__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1333:1: rule__Fact__Group_2__1 : rule__Fact__Group_2__1__Impl ;
    public final void rule__Fact__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1337:1: ( rule__Fact__Group_2__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1338:2: rule__Fact__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Fact__Group_2__1__Impl_in_rule__Fact__Group_2__12650);
            rule__Fact__Group_2__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fact__Group_2__1


    // $ANTLR start rule__Fact__Group_2__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1344:1: rule__Fact__Group_2__1__Impl : ( ( rule__Fact__DescriptionAssignment_2_1 ) ) ;
    public final void rule__Fact__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1348:1: ( ( ( rule__Fact__DescriptionAssignment_2_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1349:1: ( ( rule__Fact__DescriptionAssignment_2_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1349:1: ( ( rule__Fact__DescriptionAssignment_2_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1350:1: ( rule__Fact__DescriptionAssignment_2_1 )
            {
             before(grammarAccess.getFactAccess().getDescriptionAssignment_2_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1351:1: ( rule__Fact__DescriptionAssignment_2_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1351:2: rule__Fact__DescriptionAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Fact__DescriptionAssignment_2_1_in_rule__Fact__Group_2__1__Impl2677);
            rule__Fact__DescriptionAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getFactAccess().getDescriptionAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fact__Group_2__1__Impl


    // $ANTLR start rule__Rebuts__Group__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1365:1: rule__Rebuts__Group__0 : rule__Rebuts__Group__0__Impl rule__Rebuts__Group__1 ;
    public final void rule__Rebuts__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1369:1: ( rule__Rebuts__Group__0__Impl rule__Rebuts__Group__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1370:2: rule__Rebuts__Group__0__Impl rule__Rebuts__Group__1
            {
            pushFollow(FOLLOW_rule__Rebuts__Group__0__Impl_in_rule__Rebuts__Group__02711);
            rule__Rebuts__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Rebuts__Group__1_in_rule__Rebuts__Group__02714);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1377:1: rule__Rebuts__Group__0__Impl : ( ( rule__Rebuts__FromAssignment_0 ) ) ;
    public final void rule__Rebuts__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1381:1: ( ( ( rule__Rebuts__FromAssignment_0 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1382:1: ( ( rule__Rebuts__FromAssignment_0 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1382:1: ( ( rule__Rebuts__FromAssignment_0 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1383:1: ( rule__Rebuts__FromAssignment_0 )
            {
             before(grammarAccess.getRebutsAccess().getFromAssignment_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1384:1: ( rule__Rebuts__FromAssignment_0 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1384:2: rule__Rebuts__FromAssignment_0
            {
            pushFollow(FOLLOW_rule__Rebuts__FromAssignment_0_in_rule__Rebuts__Group__0__Impl2741);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1394:1: rule__Rebuts__Group__1 : rule__Rebuts__Group__1__Impl rule__Rebuts__Group__2 ;
    public final void rule__Rebuts__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1398:1: ( rule__Rebuts__Group__1__Impl rule__Rebuts__Group__2 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1399:2: rule__Rebuts__Group__1__Impl rule__Rebuts__Group__2
            {
            pushFollow(FOLLOW_rule__Rebuts__Group__1__Impl_in_rule__Rebuts__Group__12771);
            rule__Rebuts__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Rebuts__Group__2_in_rule__Rebuts__Group__12774);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1406:1: rule__Rebuts__Group__1__Impl : ( 'rebuts' ) ;
    public final void rule__Rebuts__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1410:1: ( ( 'rebuts' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1411:1: ( 'rebuts' )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1411:1: ( 'rebuts' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1412:1: 'rebuts'
            {
             before(grammarAccess.getRebutsAccess().getRebutsKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__Rebuts__Group__1__Impl2802); 
             after(grammarAccess.getRebutsAccess().getRebutsKeyword_1()); 

            }


            }

        }
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1425:1: rule__Rebuts__Group__2 : rule__Rebuts__Group__2__Impl ;
    public final void rule__Rebuts__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1429:1: ( rule__Rebuts__Group__2__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1430:2: rule__Rebuts__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Rebuts__Group__2__Impl_in_rule__Rebuts__Group__22833);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1436:1: rule__Rebuts__Group__2__Impl : ( ( rule__Rebuts__ToAssignment_2 ) ) ;
    public final void rule__Rebuts__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1440:1: ( ( ( rule__Rebuts__ToAssignment_2 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1441:1: ( ( rule__Rebuts__ToAssignment_2 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1441:1: ( ( rule__Rebuts__ToAssignment_2 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1442:1: ( rule__Rebuts__ToAssignment_2 )
            {
             before(grammarAccess.getRebutsAccess().getToAssignment_2()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1443:1: ( rule__Rebuts__ToAssignment_2 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1443:2: rule__Rebuts__ToAssignment_2
            {
            pushFollow(FOLLOW_rule__Rebuts__ToAssignment_2_in_rule__Rebuts__Group__2__Impl2860);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1459:1: rule__Mitigates__Group__0 : rule__Mitigates__Group__0__Impl rule__Mitigates__Group__1 ;
    public final void rule__Mitigates__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1463:1: ( rule__Mitigates__Group__0__Impl rule__Mitigates__Group__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1464:2: rule__Mitigates__Group__0__Impl rule__Mitigates__Group__1
            {
            pushFollow(FOLLOW_rule__Mitigates__Group__0__Impl_in_rule__Mitigates__Group__02896);
            rule__Mitigates__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Mitigates__Group__1_in_rule__Mitigates__Group__02899);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1471:1: rule__Mitigates__Group__0__Impl : ( ( rule__Mitigates__FromAssignment_0 ) ) ;
    public final void rule__Mitigates__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1475:1: ( ( ( rule__Mitigates__FromAssignment_0 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1476:1: ( ( rule__Mitigates__FromAssignment_0 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1476:1: ( ( rule__Mitigates__FromAssignment_0 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1477:1: ( rule__Mitigates__FromAssignment_0 )
            {
             before(grammarAccess.getMitigatesAccess().getFromAssignment_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1478:1: ( rule__Mitigates__FromAssignment_0 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1478:2: rule__Mitigates__FromAssignment_0
            {
            pushFollow(FOLLOW_rule__Mitigates__FromAssignment_0_in_rule__Mitigates__Group__0__Impl2926);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1488:1: rule__Mitigates__Group__1 : rule__Mitigates__Group__1__Impl rule__Mitigates__Group__2 ;
    public final void rule__Mitigates__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1492:1: ( rule__Mitigates__Group__1__Impl rule__Mitigates__Group__2 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1493:2: rule__Mitigates__Group__1__Impl rule__Mitigates__Group__2
            {
            pushFollow(FOLLOW_rule__Mitigates__Group__1__Impl_in_rule__Mitigates__Group__12956);
            rule__Mitigates__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Mitigates__Group__2_in_rule__Mitigates__Group__12959);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1500:1: rule__Mitigates__Group__1__Impl : ( 'mitigates' ) ;
    public final void rule__Mitigates__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1504:1: ( ( 'mitigates' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1505:1: ( 'mitigates' )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1505:1: ( 'mitigates' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1506:1: 'mitigates'
            {
             before(grammarAccess.getMitigatesAccess().getMitigatesKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__Mitigates__Group__1__Impl2987); 
             after(grammarAccess.getMitigatesAccess().getMitigatesKeyword_1()); 

            }


            }

        }
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1519:1: rule__Mitigates__Group__2 : rule__Mitigates__Group__2__Impl ;
    public final void rule__Mitigates__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1523:1: ( rule__Mitigates__Group__2__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1524:2: rule__Mitigates__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Mitigates__Group__2__Impl_in_rule__Mitigates__Group__23018);
            rule__Mitigates__Group__2__Impl();
            _fsp--;


            }

        }
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1530:1: rule__Mitigates__Group__2__Impl : ( ( rule__Mitigates__ToAssignment_2 ) ) ;
    public final void rule__Mitigates__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1534:1: ( ( ( rule__Mitigates__ToAssignment_2 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1535:1: ( ( rule__Mitigates__ToAssignment_2 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1535:1: ( ( rule__Mitigates__ToAssignment_2 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1536:1: ( rule__Mitigates__ToAssignment_2 )
            {
             before(grammarAccess.getMitigatesAccess().getToAssignment_2()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1537:1: ( rule__Mitigates__ToAssignment_2 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1537:2: rule__Mitigates__ToAssignment_2
            {
            pushFollow(FOLLOW_rule__Mitigates__ToAssignment_2_in_rule__Mitigates__Group__2__Impl3045);
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


    // $ANTLR start rule__Restores__Group__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1553:1: rule__Restores__Group__0 : rule__Restores__Group__0__Impl rule__Restores__Group__1 ;
    public final void rule__Restores__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1557:1: ( rule__Restores__Group__0__Impl rule__Restores__Group__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1558:2: rule__Restores__Group__0__Impl rule__Restores__Group__1
            {
            pushFollow(FOLLOW_rule__Restores__Group__0__Impl_in_rule__Restores__Group__03081);
            rule__Restores__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Restores__Group__1_in_rule__Restores__Group__03084);
            rule__Restores__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Restores__Group__0


    // $ANTLR start rule__Restores__Group__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1565:1: rule__Restores__Group__0__Impl : ( ( rule__Restores__FromAssignment_0 ) ) ;
    public final void rule__Restores__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1569:1: ( ( ( rule__Restores__FromAssignment_0 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1570:1: ( ( rule__Restores__FromAssignment_0 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1570:1: ( ( rule__Restores__FromAssignment_0 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1571:1: ( rule__Restores__FromAssignment_0 )
            {
             before(grammarAccess.getRestoresAccess().getFromAssignment_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1572:1: ( rule__Restores__FromAssignment_0 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1572:2: rule__Restores__FromAssignment_0
            {
            pushFollow(FOLLOW_rule__Restores__FromAssignment_0_in_rule__Restores__Group__0__Impl3111);
            rule__Restores__FromAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getRestoresAccess().getFromAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Restores__Group__0__Impl


    // $ANTLR start rule__Restores__Group__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1582:1: rule__Restores__Group__1 : rule__Restores__Group__1__Impl rule__Restores__Group__2 ;
    public final void rule__Restores__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1586:1: ( rule__Restores__Group__1__Impl rule__Restores__Group__2 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1587:2: rule__Restores__Group__1__Impl rule__Restores__Group__2
            {
            pushFollow(FOLLOW_rule__Restores__Group__1__Impl_in_rule__Restores__Group__13141);
            rule__Restores__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Restores__Group__2_in_rule__Restores__Group__13144);
            rule__Restores__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Restores__Group__1


    // $ANTLR start rule__Restores__Group__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1594:1: rule__Restores__Group__1__Impl : ( 'restores' ) ;
    public final void rule__Restores__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1598:1: ( ( 'restores' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1599:1: ( 'restores' )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1599:1: ( 'restores' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1600:1: 'restores'
            {
             before(grammarAccess.getRestoresAccess().getRestoresKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__Restores__Group__1__Impl3172); 
             after(grammarAccess.getRestoresAccess().getRestoresKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Restores__Group__1__Impl


    // $ANTLR start rule__Restores__Group__2
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1613:1: rule__Restores__Group__2 : rule__Restores__Group__2__Impl ;
    public final void rule__Restores__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1617:1: ( rule__Restores__Group__2__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1618:2: rule__Restores__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Restores__Group__2__Impl_in_rule__Restores__Group__23203);
            rule__Restores__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Restores__Group__2


    // $ANTLR start rule__Restores__Group__2__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1624:1: rule__Restores__Group__2__Impl : ( ( rule__Restores__ToAssignment_2 ) ) ;
    public final void rule__Restores__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1628:1: ( ( ( rule__Restores__ToAssignment_2 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1629:1: ( ( rule__Restores__ToAssignment_2 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1629:1: ( ( rule__Restores__ToAssignment_2 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1630:1: ( rule__Restores__ToAssignment_2 )
            {
             before(grammarAccess.getRestoresAccess().getToAssignment_2()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1631:1: ( rule__Restores__ToAssignment_2 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1631:2: rule__Restores__ToAssignment_2
            {
            pushFollow(FOLLOW_rule__Restores__ToAssignment_2_in_rule__Restores__Group__2__Impl3230);
            rule__Restores__ToAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getRestoresAccess().getToAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Restores__Group__2__Impl


    // $ANTLR start rule__ArgumentDiagram__NameAssignment_0_1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1648:1: rule__ArgumentDiagram__NameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__ArgumentDiagram__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1652:1: ( ( RULE_ID ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1653:1: ( RULE_ID )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1653:1: ( RULE_ID )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1654:1: RULE_ID
            {
             before(grammarAccess.getArgumentDiagramAccess().getNameIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ArgumentDiagram__NameAssignment_0_13271); 
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


    // $ANTLR start rule__ArgumentDiagram__HighlightAssignment_1_1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1663:1: rule__ArgumentDiagram__HighlightAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__ArgumentDiagram__HighlightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1667:1: ( ( ( RULE_ID ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1668:1: ( ( RULE_ID ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1668:1: ( ( RULE_ID ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1669:1: ( RULE_ID )
            {
             before(grammarAccess.getArgumentDiagramAccess().getHighlightNodeCrossReference_1_1_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1670:1: ( RULE_ID )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1671:1: RULE_ID
            {
             before(grammarAccess.getArgumentDiagramAccess().getHighlightNodeIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ArgumentDiagram__HighlightAssignment_1_13306); 
             after(grammarAccess.getArgumentDiagramAccess().getHighlightNodeIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getArgumentDiagramAccess().getHighlightNodeCrossReference_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ArgumentDiagram__HighlightAssignment_1_1


    // $ANTLR start rule__ArgumentDiagram__NodesAssignment_2_0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1682:1: rule__ArgumentDiagram__NodesAssignment_2_0 : ( ruleNode ) ;
    public final void rule__ArgumentDiagram__NodesAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1686:1: ( ( ruleNode ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1687:1: ( ruleNode )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1687:1: ( ruleNode )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1688:1: ruleNode
            {
             before(grammarAccess.getArgumentDiagramAccess().getNodesNodeParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleNode_in_rule__ArgumentDiagram__NodesAssignment_2_03341);
            ruleNode();
            _fsp--;

             after(grammarAccess.getArgumentDiagramAccess().getNodesNodeParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ArgumentDiagram__NodesAssignment_2_0


    // $ANTLR start rule__ArgumentDiagram__LinksAssignment_2_1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1697:1: rule__ArgumentDiagram__LinksAssignment_2_1 : ( ruleLink ) ;
    public final void rule__ArgumentDiagram__LinksAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1701:1: ( ( ruleLink ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1702:1: ( ruleLink )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1702:1: ( ruleLink )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1703:1: ruleLink
            {
             before(grammarAccess.getArgumentDiagramAccess().getLinksLinkParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleLink_in_rule__ArgumentDiagram__LinksAssignment_2_13372);
            ruleLink();
            _fsp--;

             after(grammarAccess.getArgumentDiagramAccess().getLinksLinkParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ArgumentDiagram__LinksAssignment_2_1


    // $ANTLR start rule__Argument__NameAssignment_0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1712:1: rule__Argument__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Argument__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1716:1: ( ( RULE_ID ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1717:1: ( RULE_ID )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1717:1: ( RULE_ID )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1718:1: RULE_ID
            {
             before(grammarAccess.getArgumentAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Argument__NameAssignment_03403); 
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


    // $ANTLR start rule__Argument__RoundAssignment_2_1_1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1727:1: rule__Argument__RoundAssignment_2_1_1 : ( RULE_STRING ) ;
    public final void rule__Argument__RoundAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1731:1: ( ( RULE_STRING ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1732:1: ( RULE_STRING )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1732:1: ( RULE_STRING )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1733:1: RULE_STRING
            {
             before(grammarAccess.getArgumentAccess().getRoundSTRINGTerminalRuleCall_2_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Argument__RoundAssignment_2_1_13434); 
             after(grammarAccess.getArgumentAccess().getRoundSTRINGTerminalRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__RoundAssignment_2_1_1


    // $ANTLR start rule__Argument__GroundsAssignment_2_2_1_1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1742:1: rule__Argument__GroundsAssignment_2_2_1_1 : ( ruleFact ) ;
    public final void rule__Argument__GroundsAssignment_2_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1746:1: ( ( ruleFact ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1747:1: ( ruleFact )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1747:1: ( ruleFact )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1748:1: ruleFact
            {
             before(grammarAccess.getArgumentAccess().getGroundsFactParserRuleCall_2_2_1_1_0()); 
            pushFollow(FOLLOW_ruleFact_in_rule__Argument__GroundsAssignment_2_2_1_13465);
            ruleFact();
            _fsp--;

             after(grammarAccess.getArgumentAccess().getGroundsFactParserRuleCall_2_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__GroundsAssignment_2_2_1_1


    // $ANTLR start rule__Argument__WarrantsAssignment_2_3_1_1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1757:1: rule__Argument__WarrantsAssignment_2_3_1_1 : ( ruleNode ) ;
    public final void rule__Argument__WarrantsAssignment_2_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1761:1: ( ( ruleNode ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1762:1: ( ruleNode )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1762:1: ( ruleNode )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1763:1: ruleNode
            {
             before(grammarAccess.getArgumentAccess().getWarrantsNodeParserRuleCall_2_3_1_1_0()); 
            pushFollow(FOLLOW_ruleNode_in_rule__Argument__WarrantsAssignment_2_3_1_13496);
            ruleNode();
            _fsp--;

             after(grammarAccess.getArgumentAccess().getWarrantsNodeParserRuleCall_2_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__WarrantsAssignment_2_3_1_1


    // $ANTLR start rule__Argument__DescriptionAssignment_4
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1772:1: rule__Argument__DescriptionAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Argument__DescriptionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1776:1: ( ( RULE_STRING ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1777:1: ( RULE_STRING )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1777:1: ( RULE_STRING )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1778:1: RULE_STRING
            {
             before(grammarAccess.getArgumentAccess().getDescriptionSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Argument__DescriptionAssignment_43527); 
             after(grammarAccess.getArgumentAccess().getDescriptionSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__DescriptionAssignment_4


    // $ANTLR start rule__Fact__NameAssignment_0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1787:1: rule__Fact__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Fact__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1791:1: ( ( RULE_ID ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1792:1: ( RULE_ID )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1792:1: ( RULE_ID )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1793:1: RULE_ID
            {
             before(grammarAccess.getFactAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Fact__NameAssignment_03558); 
             after(grammarAccess.getFactAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fact__NameAssignment_0


    // $ANTLR start rule__Fact__DescriptionAssignment_2_1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1802:1: rule__Fact__DescriptionAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Fact__DescriptionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1806:1: ( ( RULE_STRING ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1807:1: ( RULE_STRING )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1807:1: ( RULE_STRING )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1808:1: RULE_STRING
            {
             before(grammarAccess.getFactAccess().getDescriptionSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Fact__DescriptionAssignment_2_13589); 
             after(grammarAccess.getFactAccess().getDescriptionSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fact__DescriptionAssignment_2_1


    // $ANTLR start rule__Rebuts__FromAssignment_0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1817:1: rule__Rebuts__FromAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Rebuts__FromAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1821:1: ( ( ( RULE_ID ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1822:1: ( ( RULE_ID ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1822:1: ( ( RULE_ID ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1823:1: ( RULE_ID )
            {
             before(grammarAccess.getRebutsAccess().getFromArgumentCrossReference_0_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1824:1: ( RULE_ID )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1825:1: RULE_ID
            {
             before(grammarAccess.getRebutsAccess().getFromArgumentIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Rebuts__FromAssignment_03624); 
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1836:1: rule__Rebuts__ToAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Rebuts__ToAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1840:1: ( ( ( RULE_ID ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1841:1: ( ( RULE_ID ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1841:1: ( ( RULE_ID ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1842:1: ( RULE_ID )
            {
             before(grammarAccess.getRebutsAccess().getToArgumentCrossReference_2_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1843:1: ( RULE_ID )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1844:1: RULE_ID
            {
             before(grammarAccess.getRebutsAccess().getToArgumentIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Rebuts__ToAssignment_23663); 
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1855:1: rule__Mitigates__FromAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Mitigates__FromAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1859:1: ( ( ( RULE_ID ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1860:1: ( ( RULE_ID ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1860:1: ( ( RULE_ID ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1861:1: ( RULE_ID )
            {
             before(grammarAccess.getMitigatesAccess().getFromArgumentCrossReference_0_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1862:1: ( RULE_ID )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1863:1: RULE_ID
            {
             before(grammarAccess.getMitigatesAccess().getFromArgumentIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Mitigates__FromAssignment_03702); 
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1874:1: rule__Mitigates__ToAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Mitigates__ToAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1878:1: ( ( ( RULE_ID ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1879:1: ( ( RULE_ID ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1879:1: ( ( RULE_ID ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1880:1: ( RULE_ID )
            {
             before(grammarAccess.getMitigatesAccess().getToArgumentCrossReference_2_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1881:1: ( RULE_ID )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1882:1: RULE_ID
            {
             before(grammarAccess.getMitigatesAccess().getToArgumentIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Mitigates__ToAssignment_23741); 
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


    // $ANTLR start rule__Restores__FromAssignment_0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1893:1: rule__Restores__FromAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Restores__FromAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1897:1: ( ( ( RULE_ID ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1898:1: ( ( RULE_ID ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1898:1: ( ( RULE_ID ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1899:1: ( RULE_ID )
            {
             before(grammarAccess.getRestoresAccess().getFromArgumentCrossReference_0_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1900:1: ( RULE_ID )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1901:1: RULE_ID
            {
             before(grammarAccess.getRestoresAccess().getFromArgumentIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Restores__FromAssignment_03780); 
             after(grammarAccess.getRestoresAccess().getFromArgumentIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getRestoresAccess().getFromArgumentCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Restores__FromAssignment_0


    // $ANTLR start rule__Restores__ToAssignment_2
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1912:1: rule__Restores__ToAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Restores__ToAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1916:1: ( ( ( RULE_ID ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1917:1: ( ( RULE_ID ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1917:1: ( ( RULE_ID ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1918:1: ( RULE_ID )
            {
             before(grammarAccess.getRestoresAccess().getToArgumentCrossReference_2_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1919:1: ( RULE_ID )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1920:1: RULE_ID
            {
             before(grammarAccess.getRestoresAccess().getToArgumentIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Restores__ToAssignment_23819); 
             after(grammarAccess.getRestoresAccess().getToArgumentIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getRestoresAccess().getToArgumentCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Restores__ToAssignment_2


 

    public static final BitSet FOLLOW_ruleArgumentDiagram_in_entryRuleArgumentDiagram61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgumentDiagram68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArgumentDiagram__Group__0_in_ruleArgumentDiagram94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_entryRuleNode121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNode128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Alternatives_in_ruleNode154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_entryRuleArgument181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgument188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__0_in_ruleArgument214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFact_in_entryRuleFact241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFact248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fact__Group__0_in_ruleFact274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_entryRuleLink301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLink308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Alternatives_in_ruleLink334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRebuts_in_entryRuleRebuts361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRebuts368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rebuts__Group__0_in_ruleRebuts394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMitigates_in_entryRuleMitigates421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMitigates428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mitigates__Group__0_in_ruleMitigates454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestores_in_entryRuleRestores481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRestores488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Restores__Group__0_in_ruleRestores514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArgumentDiagram__NodesAssignment_2_0_in_rule__ArgumentDiagram__Alternatives_2550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArgumentDiagram__LinksAssignment_2_1_in_rule__ArgumentDiagram__Alternatives_2568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_rule__Node__Alternatives601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFact_in_rule__Node__Alternatives618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRebuts_in_rule__Link__Alternatives650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMitigates_in_rule__Link__Alternatives667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestores_in_rule__Link__Alternatives684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArgumentDiagram__Group__0__Impl_in_rule__ArgumentDiagram__Group__0714 = new BitSet(new long[]{0x0000000000002012L});
    public static final BitSet FOLLOW_rule__ArgumentDiagram__Group__1_in_rule__ArgumentDiagram__Group__0717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArgumentDiagram__Group_0__0_in_rule__ArgumentDiagram__Group__0__Impl744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArgumentDiagram__Group__1__Impl_in_rule__ArgumentDiagram__Group__1775 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__ArgumentDiagram__Group__2_in_rule__ArgumentDiagram__Group__1778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArgumentDiagram__Group_1__0_in_rule__ArgumentDiagram__Group__1__Impl805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArgumentDiagram__Group__2__Impl_in_rule__ArgumentDiagram__Group__2836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArgumentDiagram__Alternatives_2_in_rule__ArgumentDiagram__Group__2__Impl863 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__ArgumentDiagram__Group_0__0__Impl_in_rule__ArgumentDiagram__Group_0__0900 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ArgumentDiagram__Group_0__1_in_rule__ArgumentDiagram__Group_0__0903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ArgumentDiagram__Group_0__0__Impl931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArgumentDiagram__Group_0__1__Impl_in_rule__ArgumentDiagram__Group_0__1962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArgumentDiagram__NameAssignment_0_1_in_rule__ArgumentDiagram__Group_0__1__Impl989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArgumentDiagram__Group_1__0__Impl_in_rule__ArgumentDiagram__Group_1__01023 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ArgumentDiagram__Group_1__1_in_rule__ArgumentDiagram__Group_1__01026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ArgumentDiagram__Group_1__0__Impl1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArgumentDiagram__Group_1__1__Impl_in_rule__ArgumentDiagram__Group_1__11085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArgumentDiagram__HighlightAssignment_1_1_in_rule__ArgumentDiagram__Group_1__1__Impl1112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__0__Impl_in_rule__Argument__Group__01146 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Argument__Group__1_in_rule__Argument__Group__01149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__NameAssignment_0_in_rule__Argument__Group__0__Impl1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__1__Impl_in_rule__Argument__Group__11206 = new BitSet(new long[]{0x0000000000018022L});
    public static final BitSet FOLLOW_rule__Argument__Group__2_in_rule__Argument__Group__11209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Argument__Group__1__Impl1237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__2__Impl_in_rule__Argument__Group__21268 = new BitSet(new long[]{0x0000000000008022L});
    public static final BitSet FOLLOW_rule__Argument__Group__3_in_rule__Argument__Group__21271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_2__0_in_rule__Argument__Group__2__Impl1298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__3__Impl_in_rule__Argument__Group__31329 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Argument__Group__4_in_rule__Argument__Group__31332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Argument__Group__3__Impl1361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__4__Impl_in_rule__Argument__Group__41394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__DescriptionAssignment_4_in_rule__Argument__Group__4__Impl1421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_2__0__Impl_in_rule__Argument__Group_2__01462 = new BitSet(new long[]{0x00000000002E0000L});
    public static final BitSet FOLLOW_rule__Argument__Group_2__1_in_rule__Argument__Group_2__01465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Argument__Group_2__0__Impl1493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_2__1__Impl_in_rule__Argument__Group_2__11524 = new BitSet(new long[]{0x00000000002A0000L});
    public static final BitSet FOLLOW_rule__Argument__Group_2__2_in_rule__Argument__Group_2__11527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_2_1__0_in_rule__Argument__Group_2__1__Impl1554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_2__2__Impl_in_rule__Argument__Group_2__21585 = new BitSet(new long[]{0x0000000000220000L});
    public static final BitSet FOLLOW_rule__Argument__Group_2__3_in_rule__Argument__Group_2__21588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_2_2__0_in_rule__Argument__Group_2__2__Impl1615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_2__3__Impl_in_rule__Argument__Group_2__31646 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Argument__Group_2__4_in_rule__Argument__Group_2__31649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_2_3__0_in_rule__Argument__Group_2__3__Impl1676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_2__4__Impl_in_rule__Argument__Group_2__41707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Argument__Group_2__4__Impl1735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_2_1__0__Impl_in_rule__Argument__Group_2_1__01776 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Argument__Group_2_1__1_in_rule__Argument__Group_2_1__01779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Argument__Group_2_1__0__Impl1807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_2_1__1__Impl_in_rule__Argument__Group_2_1__11838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__RoundAssignment_2_1_1_in_rule__Argument__Group_2_1__1__Impl1865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_2_2__0__Impl_in_rule__Argument__Group_2_2__01899 = new BitSet(new long[]{0x0000000000100012L});
    public static final BitSet FOLLOW_rule__Argument__Group_2_2__1_in_rule__Argument__Group_2_2__01902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Argument__Group_2_2__0__Impl1930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_2_2__1__Impl_in_rule__Argument__Group_2_2__11961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_2_2_1__0_in_rule__Argument__Group_2_2__1__Impl1988 = new BitSet(new long[]{0x0000000000100012L});
    public static final BitSet FOLLOW_rule__Argument__Group_2_2_1__0__Impl_in_rule__Argument__Group_2_2_1__02023 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Argument__Group_2_2_1__1_in_rule__Argument__Group_2_2_1__02026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Argument__Group_2_2_1__0__Impl2055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_2_2_1__1__Impl_in_rule__Argument__Group_2_2_1__12088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__GroundsAssignment_2_2_1_1_in_rule__Argument__Group_2_2_1__1__Impl2115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_2_3__0__Impl_in_rule__Argument__Group_2_3__02149 = new BitSet(new long[]{0x0000000000100012L});
    public static final BitSet FOLLOW_rule__Argument__Group_2_3__1_in_rule__Argument__Group_2_3__02152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Argument__Group_2_3__0__Impl2180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_2_3__1__Impl_in_rule__Argument__Group_2_3__12211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_2_3_1__0_in_rule__Argument__Group_2_3__1__Impl2238 = new BitSet(new long[]{0x0000000000100012L});
    public static final BitSet FOLLOW_rule__Argument__Group_2_3_1__0__Impl_in_rule__Argument__Group_2_3_1__02273 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Argument__Group_2_3_1__1_in_rule__Argument__Group_2_3_1__02276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Argument__Group_2_3_1__0__Impl2305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_2_3_1__1__Impl_in_rule__Argument__Group_2_3_1__12338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__WarrantsAssignment_2_3_1_1_in_rule__Argument__Group_2_3_1__1__Impl2365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fact__Group__0__Impl_in_rule__Fact__Group__02399 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Fact__Group__1_in_rule__Fact__Group__02402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fact__NameAssignment_0_in_rule__Fact__Group__0__Impl2429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fact__Group__1__Impl_in_rule__Fact__Group__12459 = new BitSet(new long[]{0x0000000000008022L});
    public static final BitSet FOLLOW_rule__Fact__Group__2_in_rule__Fact__Group__12462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Fact__Group__1__Impl2490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fact__Group__2__Impl_in_rule__Fact__Group__22521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fact__Group_2__0_in_rule__Fact__Group__2__Impl2548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fact__Group_2__0__Impl_in_rule__Fact__Group_2__02585 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Fact__Group_2__1_in_rule__Fact__Group_2__02588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Fact__Group_2__0__Impl2617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fact__Group_2__1__Impl_in_rule__Fact__Group_2__12650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fact__DescriptionAssignment_2_1_in_rule__Fact__Group_2__1__Impl2677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rebuts__Group__0__Impl_in_rule__Rebuts__Group__02711 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Rebuts__Group__1_in_rule__Rebuts__Group__02714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rebuts__FromAssignment_0_in_rule__Rebuts__Group__0__Impl2741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rebuts__Group__1__Impl_in_rule__Rebuts__Group__12771 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Rebuts__Group__2_in_rule__Rebuts__Group__12774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Rebuts__Group__1__Impl2802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rebuts__Group__2__Impl_in_rule__Rebuts__Group__22833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rebuts__ToAssignment_2_in_rule__Rebuts__Group__2__Impl2860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mitigates__Group__0__Impl_in_rule__Mitigates__Group__02896 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Mitigates__Group__1_in_rule__Mitigates__Group__02899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mitigates__FromAssignment_0_in_rule__Mitigates__Group__0__Impl2926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mitigates__Group__1__Impl_in_rule__Mitigates__Group__12956 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Mitigates__Group__2_in_rule__Mitigates__Group__12959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Mitigates__Group__1__Impl2987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mitigates__Group__2__Impl_in_rule__Mitigates__Group__23018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mitigates__ToAssignment_2_in_rule__Mitigates__Group__2__Impl3045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Restores__Group__0__Impl_in_rule__Restores__Group__03081 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Restores__Group__1_in_rule__Restores__Group__03084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Restores__FromAssignment_0_in_rule__Restores__Group__0__Impl3111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Restores__Group__1__Impl_in_rule__Restores__Group__13141 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Restores__Group__2_in_rule__Restores__Group__13144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Restores__Group__1__Impl3172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Restores__Group__2__Impl_in_rule__Restores__Group__23203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Restores__ToAssignment_2_in_rule__Restores__Group__2__Impl3230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ArgumentDiagram__NameAssignment_0_13271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ArgumentDiagram__HighlightAssignment_1_13306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_rule__ArgumentDiagram__NodesAssignment_2_03341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_rule__ArgumentDiagram__LinksAssignment_2_13372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Argument__NameAssignment_03403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Argument__RoundAssignment_2_1_13434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFact_in_rule__Argument__GroundsAssignment_2_2_1_13465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_rule__Argument__WarrantsAssignment_2_3_1_13496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Argument__DescriptionAssignment_43527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Fact__NameAssignment_03558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Fact__DescriptionAssignment_2_13589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Rebuts__FromAssignment_03624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Rebuts__ToAssignment_23663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Mitigates__FromAssignment_03702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Mitigates__ToAssignment_23741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Restores__FromAssignment_03780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Restores__ToAssignment_23819 = new BitSet(new long[]{0x0000000000000002L});

}