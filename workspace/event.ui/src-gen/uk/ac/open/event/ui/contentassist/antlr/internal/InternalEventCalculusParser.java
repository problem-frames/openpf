package uk.ac.open.event.ui.contentassist.antlr.internal; 

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
import uk.ac.open.event.services.EventCalculusGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEventCalculusParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_SL_COMMENT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'!'", "'+'", "'-'", "'->'", "'<->'", "'&'", "'|'", "'.'", "'['", "']'", "','", "'('", "')'", "'sort'", "'load'", "'range'", "'fluent'", "'event'", "'HoldsAt'", "'Happens'", "'Initiates'", "'Terminates'", "'/'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=7;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=6;
    public static final int RULE_ML_COMMENT=8;

        public InternalEventCalculusParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g"; }


     
     	private EventCalculusGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(EventCalculusGrammarAccess grammarAccess) {
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




    // $ANTLR start entryRuleKnowledge
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:61:1: entryRuleKnowledge : ruleKnowledge EOF ;
    public final void entryRuleKnowledge() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:62:1: ( ruleKnowledge EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:63:1: ruleKnowledge EOF
            {
             before(grammarAccess.getKnowledgeRule()); 
            pushFollow(FOLLOW_ruleKnowledge_in_entryRuleKnowledge61);
            ruleKnowledge();
            _fsp--;

             after(grammarAccess.getKnowledgeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKnowledge68); 

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
    // $ANTLR end entryRuleKnowledge


    // $ANTLR start ruleKnowledge
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:70:1: ruleKnowledge : ( ( rule__Knowledge__Group__0 ) ) ;
    public final void ruleKnowledge() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:74:2: ( ( ( rule__Knowledge__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:75:1: ( ( rule__Knowledge__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:75:1: ( ( rule__Knowledge__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:76:1: ( rule__Knowledge__Group__0 )
            {
             before(grammarAccess.getKnowledgeAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:77:1: ( rule__Knowledge__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:77:2: rule__Knowledge__Group__0
            {
            pushFollow(FOLLOW_rule__Knowledge__Group__0_in_ruleKnowledge94);
            rule__Knowledge__Group__0();
            _fsp--;


            }

             after(grammarAccess.getKnowledgeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleKnowledge


    // $ANTLR start entryRuleRule
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:89:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:90:1: ( ruleRule EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:91:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_ruleRule_in_entryRuleRule121);
            ruleRule();
            _fsp--;

             after(grammarAccess.getRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRule128); 

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
    // $ANTLR end entryRuleRule


    // $ANTLR start ruleRule
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:98:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:102:2: ( ( ( rule__Rule__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:103:1: ( ( rule__Rule__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:103:1: ( ( rule__Rule__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:104:1: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:105:1: ( rule__Rule__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:105:2: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_rule__Rule__Group__0_in_ruleRule154);
            rule__Rule__Group__0();
            _fsp--;


            }

             after(grammarAccess.getRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleRule


    // $ANTLR start entryRuleVarDecl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:117:1: entryRuleVarDecl : ruleVarDecl EOF ;
    public final void entryRuleVarDecl() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:118:1: ( ruleVarDecl EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:119:1: ruleVarDecl EOF
            {
             before(grammarAccess.getVarDeclRule()); 
            pushFollow(FOLLOW_ruleVarDecl_in_entryRuleVarDecl181);
            ruleVarDecl();
            _fsp--;

             after(grammarAccess.getVarDeclRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarDecl188); 

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
    // $ANTLR end entryRuleVarDecl


    // $ANTLR start ruleVarDecl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:126:1: ruleVarDecl : ( ( rule__VarDecl__Group__0 ) ) ;
    public final void ruleVarDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:130:2: ( ( ( rule__VarDecl__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:131:1: ( ( rule__VarDecl__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:131:1: ( ( rule__VarDecl__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:132:1: ( rule__VarDecl__Group__0 )
            {
             before(grammarAccess.getVarDeclAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:133:1: ( rule__VarDecl__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:133:2: rule__VarDecl__Group__0
            {
            pushFollow(FOLLOW_rule__VarDecl__Group__0_in_ruleVarDecl214);
            rule__VarDecl__Group__0();
            _fsp--;


            }

             after(grammarAccess.getVarDeclAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleVarDecl


    // $ANTLR start entryRuleIntTerm
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:145:1: entryRuleIntTerm : ruleIntTerm EOF ;
    public final void entryRuleIntTerm() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:146:1: ( ruleIntTerm EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:147:1: ruleIntTerm EOF
            {
             before(grammarAccess.getIntTermRule()); 
            pushFollow(FOLLOW_ruleIntTerm_in_entryRuleIntTerm241);
            ruleIntTerm();
            _fsp--;

             after(grammarAccess.getIntTermRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntTerm248); 

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
    // $ANTLR end entryRuleIntTerm


    // $ANTLR start ruleIntTerm
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:154:1: ruleIntTerm : ( ( rule__IntTerm__Alternatives ) ) ;
    public final void ruleIntTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:158:2: ( ( ( rule__IntTerm__Alternatives ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:159:1: ( ( rule__IntTerm__Alternatives ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:159:1: ( ( rule__IntTerm__Alternatives ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:160:1: ( rule__IntTerm__Alternatives )
            {
             before(grammarAccess.getIntTermAccess().getAlternatives()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:161:1: ( rule__IntTerm__Alternatives )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:161:2: rule__IntTerm__Alternatives
            {
            pushFollow(FOLLOW_rule__IntTerm__Alternatives_in_ruleIntTerm274);
            rule__IntTerm__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getIntTermAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleIntTerm


    // $ANTLR start entryRuleIntExpr
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:173:1: entryRuleIntExpr : ruleIntExpr EOF ;
    public final void entryRuleIntExpr() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:174:1: ( ruleIntExpr EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:175:1: ruleIntExpr EOF
            {
             before(grammarAccess.getIntExprRule()); 
            pushFollow(FOLLOW_ruleIntExpr_in_entryRuleIntExpr301);
            ruleIntExpr();
            _fsp--;

             after(grammarAccess.getIntExprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntExpr308); 

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
    // $ANTLR end entryRuleIntExpr


    // $ANTLR start ruleIntExpr
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:182:1: ruleIntExpr : ( ( rule__IntExpr__Alternatives ) ) ;
    public final void ruleIntExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:186:2: ( ( ( rule__IntExpr__Alternatives ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:187:1: ( ( rule__IntExpr__Alternatives ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:187:1: ( ( rule__IntExpr__Alternatives ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:188:1: ( rule__IntExpr__Alternatives )
            {
             before(grammarAccess.getIntExprAccess().getAlternatives()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:189:1: ( rule__IntExpr__Alternatives )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:189:2: rule__IntExpr__Alternatives
            {
            pushFollow(FOLLOW_rule__IntExpr__Alternatives_in_ruleIntExpr334);
            rule__IntExpr__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getIntExprAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleIntExpr


    // $ANTLR start entryRuleBinaryIntExpr
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:201:1: entryRuleBinaryIntExpr : ruleBinaryIntExpr EOF ;
    public final void entryRuleBinaryIntExpr() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:202:1: ( ruleBinaryIntExpr EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:203:1: ruleBinaryIntExpr EOF
            {
             before(grammarAccess.getBinaryIntExprRule()); 
            pushFollow(FOLLOW_ruleBinaryIntExpr_in_entryRuleBinaryIntExpr361);
            ruleBinaryIntExpr();
            _fsp--;

             after(grammarAccess.getBinaryIntExprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinaryIntExpr368); 

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
    // $ANTLR end entryRuleBinaryIntExpr


    // $ANTLR start ruleBinaryIntExpr
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:210:1: ruleBinaryIntExpr : ( ( rule__BinaryIntExpr__Group__0 ) ) ;
    public final void ruleBinaryIntExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:214:2: ( ( ( rule__BinaryIntExpr__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:215:1: ( ( rule__BinaryIntExpr__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:215:1: ( ( rule__BinaryIntExpr__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:216:1: ( rule__BinaryIntExpr__Group__0 )
            {
             before(grammarAccess.getBinaryIntExprAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:217:1: ( rule__BinaryIntExpr__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:217:2: rule__BinaryIntExpr__Group__0
            {
            pushFollow(FOLLOW_rule__BinaryIntExpr__Group__0_in_ruleBinaryIntExpr394);
            rule__BinaryIntExpr__Group__0();
            _fsp--;


            }

             after(grammarAccess.getBinaryIntExprAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleBinaryIntExpr


    // $ANTLR start entryRuleTemporalPredicate
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:229:1: entryRuleTemporalPredicate : ruleTemporalPredicate EOF ;
    public final void entryRuleTemporalPredicate() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:230:1: ( ruleTemporalPredicate EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:231:1: ruleTemporalPredicate EOF
            {
             before(grammarAccess.getTemporalPredicateRule()); 
            pushFollow(FOLLOW_ruleTemporalPredicate_in_entryRuleTemporalPredicate421);
            ruleTemporalPredicate();
            _fsp--;

             after(grammarAccess.getTemporalPredicateRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemporalPredicate428); 

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
    // $ANTLR end entryRuleTemporalPredicate


    // $ANTLR start ruleTemporalPredicate
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:238:1: ruleTemporalPredicate : ( ( rule__TemporalPredicate__Alternatives ) ) ;
    public final void ruleTemporalPredicate() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:242:2: ( ( ( rule__TemporalPredicate__Alternatives ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:243:1: ( ( rule__TemporalPredicate__Alternatives ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:243:1: ( ( rule__TemporalPredicate__Alternatives ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:244:1: ( rule__TemporalPredicate__Alternatives )
            {
             before(grammarAccess.getTemporalPredicateAccess().getAlternatives()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:245:1: ( rule__TemporalPredicate__Alternatives )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:245:2: rule__TemporalPredicate__Alternatives
            {
            pushFollow(FOLLOW_rule__TemporalPredicate__Alternatives_in_ruleTemporalPredicate454);
            rule__TemporalPredicate__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getTemporalPredicateAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleTemporalPredicate


    // $ANTLR start entryRuleBoolExpr
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:257:1: entryRuleBoolExpr : ruleBoolExpr EOF ;
    public final void entryRuleBoolExpr() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:258:1: ( ruleBoolExpr EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:259:1: ruleBoolExpr EOF
            {
             before(grammarAccess.getBoolExprRule()); 
            pushFollow(FOLLOW_ruleBoolExpr_in_entryRuleBoolExpr481);
            ruleBoolExpr();
            _fsp--;

             after(grammarAccess.getBoolExprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolExpr488); 

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
    // $ANTLR end entryRuleBoolExpr


    // $ANTLR start ruleBoolExpr
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:266:1: ruleBoolExpr : ( ( rule__BoolExpr__Alternatives ) ) ;
    public final void ruleBoolExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:270:2: ( ( ( rule__BoolExpr__Alternatives ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:271:1: ( ( rule__BoolExpr__Alternatives ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:271:1: ( ( rule__BoolExpr__Alternatives ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:272:1: ( rule__BoolExpr__Alternatives )
            {
             before(grammarAccess.getBoolExprAccess().getAlternatives()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:273:1: ( rule__BoolExpr__Alternatives )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:273:2: rule__BoolExpr__Alternatives
            {
            pushFollow(FOLLOW_rule__BoolExpr__Alternatives_in_ruleBoolExpr514);
            rule__BoolExpr__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getBoolExprAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleBoolExpr


    // $ANTLR start entryRuleUnaryBoolExpr
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:285:1: entryRuleUnaryBoolExpr : ruleUnaryBoolExpr EOF ;
    public final void entryRuleUnaryBoolExpr() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:286:1: ( ruleUnaryBoolExpr EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:287:1: ruleUnaryBoolExpr EOF
            {
             before(grammarAccess.getUnaryBoolExprRule()); 
            pushFollow(FOLLOW_ruleUnaryBoolExpr_in_entryRuleUnaryBoolExpr541);
            ruleUnaryBoolExpr();
            _fsp--;

             after(grammarAccess.getUnaryBoolExprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryBoolExpr548); 

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
    // $ANTLR end entryRuleUnaryBoolExpr


    // $ANTLR start ruleUnaryBoolExpr
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:294:1: ruleUnaryBoolExpr : ( ( rule__UnaryBoolExpr__Alternatives ) ) ;
    public final void ruleUnaryBoolExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:298:2: ( ( ( rule__UnaryBoolExpr__Alternatives ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:299:1: ( ( rule__UnaryBoolExpr__Alternatives ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:299:1: ( ( rule__UnaryBoolExpr__Alternatives ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:300:1: ( rule__UnaryBoolExpr__Alternatives )
            {
             before(grammarAccess.getUnaryBoolExprAccess().getAlternatives()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:301:1: ( rule__UnaryBoolExpr__Alternatives )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:301:2: rule__UnaryBoolExpr__Alternatives
            {
            pushFollow(FOLLOW_rule__UnaryBoolExpr__Alternatives_in_ruleUnaryBoolExpr574);
            rule__UnaryBoolExpr__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getUnaryBoolExprAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleUnaryBoolExpr


    // $ANTLR start entryRuleBinaryBoolExpr
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:313:1: entryRuleBinaryBoolExpr : ruleBinaryBoolExpr EOF ;
    public final void entryRuleBinaryBoolExpr() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:314:1: ( ruleBinaryBoolExpr EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:315:1: ruleBinaryBoolExpr EOF
            {
             before(grammarAccess.getBinaryBoolExprRule()); 
            pushFollow(FOLLOW_ruleBinaryBoolExpr_in_entryRuleBinaryBoolExpr601);
            ruleBinaryBoolExpr();
            _fsp--;

             after(grammarAccess.getBinaryBoolExprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinaryBoolExpr608); 

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
    // $ANTLR end entryRuleBinaryBoolExpr


    // $ANTLR start ruleBinaryBoolExpr
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:322:1: ruleBinaryBoolExpr : ( ( rule__BinaryBoolExpr__Group__0 ) ) ;
    public final void ruleBinaryBoolExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:326:2: ( ( ( rule__BinaryBoolExpr__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:327:1: ( ( rule__BinaryBoolExpr__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:327:1: ( ( rule__BinaryBoolExpr__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:328:1: ( rule__BinaryBoolExpr__Group__0 )
            {
             before(grammarAccess.getBinaryBoolExprAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:329:1: ( rule__BinaryBoolExpr__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:329:2: rule__BinaryBoolExpr__Group__0
            {
            pushFollow(FOLLOW_rule__BinaryBoolExpr__Group__0_in_ruleBinaryBoolExpr634);
            rule__BinaryBoolExpr__Group__0();
            _fsp--;


            }

             after(grammarAccess.getBinaryBoolExprAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleBinaryBoolExpr


    // $ANTLR start entryRuleEntity
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:341:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:342:1: ( ruleEntity EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:343:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity661);
            ruleEntity();
            _fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity668); 

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
    // $ANTLR end entryRuleEntity


    // $ANTLR start ruleEntity
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:350:1: ruleEntity : ( ( rule__Entity__Alternatives ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:354:2: ( ( ( rule__Entity__Alternatives ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:355:1: ( ( rule__Entity__Alternatives ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:355:1: ( ( rule__Entity__Alternatives ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:356:1: ( rule__Entity__Alternatives )
            {
             before(grammarAccess.getEntityAccess().getAlternatives()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:357:1: ( rule__Entity__Alternatives )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:357:2: rule__Entity__Alternatives
            {
            pushFollow(FOLLOW_rule__Entity__Alternatives_in_ruleEntity694);
            rule__Entity__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getEntityAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleEntity


    // $ANTLR start entryRuleSort
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:369:1: entryRuleSort : ruleSort EOF ;
    public final void entryRuleSort() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:370:1: ( ruleSort EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:371:1: ruleSort EOF
            {
             before(grammarAccess.getSortRule()); 
            pushFollow(FOLLOW_ruleSort_in_entryRuleSort721);
            ruleSort();
            _fsp--;

             after(grammarAccess.getSortRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSort728); 

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
    // $ANTLR end entryRuleSort


    // $ANTLR start ruleSort
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:378:1: ruleSort : ( ( rule__Sort__Group__0 ) ) ;
    public final void ruleSort() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:382:2: ( ( ( rule__Sort__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:383:1: ( ( rule__Sort__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:383:1: ( ( rule__Sort__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:384:1: ( rule__Sort__Group__0 )
            {
             before(grammarAccess.getSortAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:385:1: ( rule__Sort__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:385:2: rule__Sort__Group__0
            {
            pushFollow(FOLLOW_rule__Sort__Group__0_in_ruleSort754);
            rule__Sort__Group__0();
            _fsp--;


            }

             after(grammarAccess.getSortAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleSort


    // $ANTLR start entryRuleImport
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:397:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:398:1: ( ruleImport EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:399:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport781);
            ruleImport();
            _fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport788); 

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
    // $ANTLR end entryRuleImport


    // $ANTLR start ruleImport
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:406:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:410:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:411:1: ( ( rule__Import__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:411:1: ( ( rule__Import__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:412:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:413:1: ( rule__Import__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:413:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport814);
            rule__Import__Group__0();
            _fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleImport


    // $ANTLR start entryRuleVar
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:425:1: entryRuleVar : ruleVar EOF ;
    public final void entryRuleVar() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:426:1: ( ruleVar EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:427:1: ruleVar EOF
            {
             before(grammarAccess.getVarRule()); 
            pushFollow(FOLLOW_ruleVar_in_entryRuleVar841);
            ruleVar();
            _fsp--;

             after(grammarAccess.getVarRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVar848); 

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
    // $ANTLR end entryRuleVar


    // $ANTLR start ruleVar
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:434:1: ruleVar : ( ( rule__Var__Group__0 ) ) ;
    public final void ruleVar() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:438:2: ( ( ( rule__Var__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:439:1: ( ( rule__Var__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:439:1: ( ( rule__Var__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:440:1: ( rule__Var__Group__0 )
            {
             before(grammarAccess.getVarAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:441:1: ( rule__Var__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:441:2: rule__Var__Group__0
            {
            pushFollow(FOLLOW_rule__Var__Group__0_in_ruleVar874);
            rule__Var__Group__0();
            _fsp--;


            }

             after(grammarAccess.getVarAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleVar


    // $ANTLR start entryRuleFluent
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:453:1: entryRuleFluent : ruleFluent EOF ;
    public final void entryRuleFluent() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:454:1: ( ruleFluent EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:455:1: ruleFluent EOF
            {
             before(grammarAccess.getFluentRule()); 
            pushFollow(FOLLOW_ruleFluent_in_entryRuleFluent901);
            ruleFluent();
            _fsp--;

             after(grammarAccess.getFluentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFluent908); 

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
    // $ANTLR end entryRuleFluent


    // $ANTLR start ruleFluent
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:462:1: ruleFluent : ( ( rule__Fluent__Group__0 ) ) ;
    public final void ruleFluent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:466:2: ( ( ( rule__Fluent__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:467:1: ( ( rule__Fluent__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:467:1: ( ( rule__Fluent__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:468:1: ( rule__Fluent__Group__0 )
            {
             before(grammarAccess.getFluentAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:469:1: ( rule__Fluent__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:469:2: rule__Fluent__Group__0
            {
            pushFollow(FOLLOW_rule__Fluent__Group__0_in_ruleFluent934);
            rule__Fluent__Group__0();
            _fsp--;


            }

             after(grammarAccess.getFluentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleFluent


    // $ANTLR start entryRuleEvent
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:481:1: entryRuleEvent : ruleEvent EOF ;
    public final void entryRuleEvent() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:482:1: ( ruleEvent EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:483:1: ruleEvent EOF
            {
             before(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent961);
            ruleEvent();
            _fsp--;

             after(grammarAccess.getEventRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent968); 

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
    // $ANTLR end entryRuleEvent


    // $ANTLR start ruleEvent
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:490:1: ruleEvent : ( ( rule__Event__Group__0 ) ) ;
    public final void ruleEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:494:2: ( ( ( rule__Event__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:495:1: ( ( rule__Event__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:495:1: ( ( rule__Event__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:496:1: ( rule__Event__Group__0 )
            {
             before(grammarAccess.getEventAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:497:1: ( rule__Event__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:497:2: rule__Event__Group__0
            {
            pushFollow(FOLLOW_rule__Event__Group__0_in_ruleEvent994);
            rule__Event__Group__0();
            _fsp--;


            }

             after(grammarAccess.getEventAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleEvent


    // $ANTLR start entryRuleTerm
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:509:1: entryRuleTerm : ruleTerm EOF ;
    public final void entryRuleTerm() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:510:1: ( ruleTerm EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:511:1: ruleTerm EOF
            {
             before(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_ruleTerm_in_entryRuleTerm1021);
            ruleTerm();
            _fsp--;

             after(grammarAccess.getTermRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerm1028); 

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
    // $ANTLR end entryRuleTerm


    // $ANTLR start ruleTerm
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:518:1: ruleTerm : ( ( rule__Term__Group__0 ) ) ;
    public final void ruleTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:522:2: ( ( ( rule__Term__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:523:1: ( ( rule__Term__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:523:1: ( ( rule__Term__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:524:1: ( rule__Term__Group__0 )
            {
             before(grammarAccess.getTermAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:525:1: ( rule__Term__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:525:2: rule__Term__Group__0
            {
            pushFollow(FOLLOW_rule__Term__Group__0_in_ruleTerm1054);
            rule__Term__Group__0();
            _fsp--;


            }

             after(grammarAccess.getTermAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleTerm


    // $ANTLR start entryRuleHoldsAt
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:537:1: entryRuleHoldsAt : ruleHoldsAt EOF ;
    public final void entryRuleHoldsAt() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:538:1: ( ruleHoldsAt EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:539:1: ruleHoldsAt EOF
            {
             before(grammarAccess.getHoldsAtRule()); 
            pushFollow(FOLLOW_ruleHoldsAt_in_entryRuleHoldsAt1081);
            ruleHoldsAt();
            _fsp--;

             after(grammarAccess.getHoldsAtRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHoldsAt1088); 

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
    // $ANTLR end entryRuleHoldsAt


    // $ANTLR start ruleHoldsAt
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:546:1: ruleHoldsAt : ( ( rule__HoldsAt__Group__0 ) ) ;
    public final void ruleHoldsAt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:550:2: ( ( ( rule__HoldsAt__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:551:1: ( ( rule__HoldsAt__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:551:1: ( ( rule__HoldsAt__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:552:1: ( rule__HoldsAt__Group__0 )
            {
             before(grammarAccess.getHoldsAtAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:553:1: ( rule__HoldsAt__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:553:2: rule__HoldsAt__Group__0
            {
            pushFollow(FOLLOW_rule__HoldsAt__Group__0_in_ruleHoldsAt1114);
            rule__HoldsAt__Group__0();
            _fsp--;


            }

             after(grammarAccess.getHoldsAtAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleHoldsAt


    // $ANTLR start entryRuleHappens
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:565:1: entryRuleHappens : ruleHappens EOF ;
    public final void entryRuleHappens() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:566:1: ( ruleHappens EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:567:1: ruleHappens EOF
            {
             before(grammarAccess.getHappensRule()); 
            pushFollow(FOLLOW_ruleHappens_in_entryRuleHappens1141);
            ruleHappens();
            _fsp--;

             after(grammarAccess.getHappensRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHappens1148); 

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
    // $ANTLR end entryRuleHappens


    // $ANTLR start ruleHappens
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:574:1: ruleHappens : ( ( rule__Happens__Group__0 ) ) ;
    public final void ruleHappens() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:578:2: ( ( ( rule__Happens__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:579:1: ( ( rule__Happens__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:579:1: ( ( rule__Happens__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:580:1: ( rule__Happens__Group__0 )
            {
             before(grammarAccess.getHappensAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:581:1: ( rule__Happens__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:581:2: rule__Happens__Group__0
            {
            pushFollow(FOLLOW_rule__Happens__Group__0_in_ruleHappens1174);
            rule__Happens__Group__0();
            _fsp--;


            }

             after(grammarAccess.getHappensAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleHappens


    // $ANTLR start entryRuleInitiates
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:593:1: entryRuleInitiates : ruleInitiates EOF ;
    public final void entryRuleInitiates() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:594:1: ( ruleInitiates EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:595:1: ruleInitiates EOF
            {
             before(grammarAccess.getInitiatesRule()); 
            pushFollow(FOLLOW_ruleInitiates_in_entryRuleInitiates1201);
            ruleInitiates();
            _fsp--;

             after(grammarAccess.getInitiatesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInitiates1208); 

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
    // $ANTLR end entryRuleInitiates


    // $ANTLR start ruleInitiates
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:602:1: ruleInitiates : ( ( rule__Initiates__Group__0 ) ) ;
    public final void ruleInitiates() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:606:2: ( ( ( rule__Initiates__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:607:1: ( ( rule__Initiates__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:607:1: ( ( rule__Initiates__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:608:1: ( rule__Initiates__Group__0 )
            {
             before(grammarAccess.getInitiatesAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:609:1: ( rule__Initiates__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:609:2: rule__Initiates__Group__0
            {
            pushFollow(FOLLOW_rule__Initiates__Group__0_in_ruleInitiates1234);
            rule__Initiates__Group__0();
            _fsp--;


            }

             after(grammarAccess.getInitiatesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleInitiates


    // $ANTLR start entryRuleTerminates
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:621:1: entryRuleTerminates : ruleTerminates EOF ;
    public final void entryRuleTerminates() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:622:1: ( ruleTerminates EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:623:1: ruleTerminates EOF
            {
             before(grammarAccess.getTerminatesRule()); 
            pushFollow(FOLLOW_ruleTerminates_in_entryRuleTerminates1261);
            ruleTerminates();
            _fsp--;

             after(grammarAccess.getTerminatesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerminates1268); 

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
    // $ANTLR end entryRuleTerminates


    // $ANTLR start ruleTerminates
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:630:1: ruleTerminates : ( ( rule__Terminates__Group__0 ) ) ;
    public final void ruleTerminates() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:634:2: ( ( ( rule__Terminates__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:635:1: ( ( rule__Terminates__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:635:1: ( ( rule__Terminates__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:636:1: ( rule__Terminates__Group__0 )
            {
             before(grammarAccess.getTerminatesAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:637:1: ( rule__Terminates__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:637:2: rule__Terminates__Group__0
            {
            pushFollow(FOLLOW_rule__Terminates__Group__0_in_ruleTerminates1294);
            rule__Terminates__Group__0();
            _fsp--;


            }

             after(grammarAccess.getTerminatesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleTerminates


    // $ANTLR start entryRulePath
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:649:1: entryRulePath : rulePath EOF ;
    public final void entryRulePath() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:650:1: ( rulePath EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:651:1: rulePath EOF
            {
             before(grammarAccess.getPathRule()); 
            pushFollow(FOLLOW_rulePath_in_entryRulePath1321);
            rulePath();
            _fsp--;

             after(grammarAccess.getPathRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePath1328); 

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
    // $ANTLR end entryRulePath


    // $ANTLR start rulePath
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:658:1: rulePath : ( ( rule__Path__Group__0 ) ) ;
    public final void rulePath() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:662:2: ( ( ( rule__Path__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:663:1: ( ( rule__Path__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:663:1: ( ( rule__Path__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:664:1: ( rule__Path__Group__0 )
            {
             before(grammarAccess.getPathAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:665:1: ( rule__Path__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:665:2: rule__Path__Group__0
            {
            pushFollow(FOLLOW_rule__Path__Group__0_in_rulePath1354);
            rule__Path__Group__0();
            _fsp--;


            }

             after(grammarAccess.getPathAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rulePath


    // $ANTLR start entryRuleFile
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:677:1: entryRuleFile : ruleFile EOF ;
    public final void entryRuleFile() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:678:1: ( ruleFile EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:679:1: ruleFile EOF
            {
             before(grammarAccess.getFileRule()); 
            pushFollow(FOLLOW_ruleFile_in_entryRuleFile1381);
            ruleFile();
            _fsp--;

             after(grammarAccess.getFileRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFile1388); 

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
    // $ANTLR end entryRuleFile


    // $ANTLR start ruleFile
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:686:1: ruleFile : ( ( rule__File__Group__0 ) ) ;
    public final void ruleFile() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:690:2: ( ( ( rule__File__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:691:1: ( ( rule__File__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:691:1: ( ( rule__File__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:692:1: ( rule__File__Group__0 )
            {
             before(grammarAccess.getFileAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:693:1: ( rule__File__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:693:2: rule__File__Group__0
            {
            pushFollow(FOLLOW_rule__File__Group__0_in_ruleFile1414);
            rule__File__Group__0();
            _fsp--;


            }

             after(grammarAccess.getFileAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleFile


    // $ANTLR start ruleBinaryIntOp
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:706:1: ruleBinaryIntOp : ( ( rule__BinaryIntOp__Alternatives ) ) ;
    public final void ruleBinaryIntOp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:710:1: ( ( ( rule__BinaryIntOp__Alternatives ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:711:1: ( ( rule__BinaryIntOp__Alternatives ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:711:1: ( ( rule__BinaryIntOp__Alternatives ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:712:1: ( rule__BinaryIntOp__Alternatives )
            {
             before(grammarAccess.getBinaryIntOpAccess().getAlternatives()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:713:1: ( rule__BinaryIntOp__Alternatives )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:713:2: rule__BinaryIntOp__Alternatives
            {
            pushFollow(FOLLOW_rule__BinaryIntOp__Alternatives_in_ruleBinaryIntOp1451);
            rule__BinaryIntOp__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getBinaryIntOpAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleBinaryIntOp


    // $ANTLR start ruleUnaryBoolOp
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:725:1: ruleUnaryBoolOp : ( ( '!' ) ) ;
    public final void ruleUnaryBoolOp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:729:1: ( ( ( '!' ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:730:1: ( ( '!' ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:730:1: ( ( '!' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:731:1: ( '!' )
            {
             before(grammarAccess.getUnaryBoolOpAccess().getNEGATIONEnumLiteralDeclaration()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:732:1: ( '!' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:732:3: '!'
            {
            match(input,11,FOLLOW_11_in_ruleUnaryBoolOp1488); 

            }

             after(grammarAccess.getUnaryBoolOpAccess().getNEGATIONEnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleUnaryBoolOp


    // $ANTLR start ruleBinaryBoolOp
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:745:1: ruleBinaryBoolOp : ( ( rule__BinaryBoolOp__Alternatives ) ) ;
    public final void ruleBinaryBoolOp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:749:1: ( ( ( rule__BinaryBoolOp__Alternatives ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:750:1: ( ( rule__BinaryBoolOp__Alternatives ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:750:1: ( ( rule__BinaryBoolOp__Alternatives ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:751:1: ( rule__BinaryBoolOp__Alternatives )
            {
             before(grammarAccess.getBinaryBoolOpAccess().getAlternatives()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:752:1: ( rule__BinaryBoolOp__Alternatives )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:752:2: rule__BinaryBoolOp__Alternatives
            {
            pushFollow(FOLLOW_rule__BinaryBoolOp__Alternatives_in_ruleBinaryBoolOp1526);
            rule__BinaryBoolOp__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getBinaryBoolOpAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleBinaryBoolOp


    // $ANTLR start rule__IntTerm__Alternatives
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:763:1: rule__IntTerm__Alternatives : ( ( ( rule__IntTerm__ConstAssignment_0 ) ) | ( ( rule__IntTerm__VarAssignment_1 ) ) );
    public final void rule__IntTerm__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:767:1: ( ( ( rule__IntTerm__ConstAssignment_0 ) ) | ( ( rule__IntTerm__VarAssignment_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_INT) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("763:1: rule__IntTerm__Alternatives : ( ( ( rule__IntTerm__ConstAssignment_0 ) ) | ( ( rule__IntTerm__VarAssignment_1 ) ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:768:1: ( ( rule__IntTerm__ConstAssignment_0 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:768:1: ( ( rule__IntTerm__ConstAssignment_0 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:769:1: ( rule__IntTerm__ConstAssignment_0 )
                    {
                     before(grammarAccess.getIntTermAccess().getConstAssignment_0()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:770:1: ( rule__IntTerm__ConstAssignment_0 )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:770:2: rule__IntTerm__ConstAssignment_0
                    {
                    pushFollow(FOLLOW_rule__IntTerm__ConstAssignment_0_in_rule__IntTerm__Alternatives1561);
                    rule__IntTerm__ConstAssignment_0();
                    _fsp--;


                    }

                     after(grammarAccess.getIntTermAccess().getConstAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:774:6: ( ( rule__IntTerm__VarAssignment_1 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:774:6: ( ( rule__IntTerm__VarAssignment_1 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:775:1: ( rule__IntTerm__VarAssignment_1 )
                    {
                     before(grammarAccess.getIntTermAccess().getVarAssignment_1()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:776:1: ( rule__IntTerm__VarAssignment_1 )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:776:2: rule__IntTerm__VarAssignment_1
                    {
                    pushFollow(FOLLOW_rule__IntTerm__VarAssignment_1_in_rule__IntTerm__Alternatives1579);
                    rule__IntTerm__VarAssignment_1();
                    _fsp--;


                    }

                     after(grammarAccess.getIntTermAccess().getVarAssignment_1()); 

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
    // $ANTLR end rule__IntTerm__Alternatives


    // $ANTLR start rule__IntExpr__Alternatives
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:785:1: rule__IntExpr__Alternatives : ( ( ruleIntTerm ) | ( ruleBinaryIntExpr ) );
    public final void rule__IntExpr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:789:1: ( ( ruleIntTerm ) | ( ruleBinaryIntExpr ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_INT) ) {
                int LA2_1 = input.LA(2);

                if ( ((LA2_1>=12 && LA2_1<=13)) ) {
                    alt2=2;
                }
                else if ( (LA2_1==EOF||LA2_1==23) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("785:1: rule__IntExpr__Alternatives : ( ( ruleIntTerm ) | ( ruleBinaryIntExpr ) );", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA2_0==RULE_ID) ) {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==EOF||LA2_2==23) ) {
                    alt2=1;
                }
                else if ( ((LA2_2>=12 && LA2_2<=13)) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("785:1: rule__IntExpr__Alternatives : ( ( ruleIntTerm ) | ( ruleBinaryIntExpr ) );", 2, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("785:1: rule__IntExpr__Alternatives : ( ( ruleIntTerm ) | ( ruleBinaryIntExpr ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:790:1: ( ruleIntTerm )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:790:1: ( ruleIntTerm )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:791:1: ruleIntTerm
                    {
                     before(grammarAccess.getIntExprAccess().getIntTermParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleIntTerm_in_rule__IntExpr__Alternatives1612);
                    ruleIntTerm();
                    _fsp--;

                     after(grammarAccess.getIntExprAccess().getIntTermParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:796:6: ( ruleBinaryIntExpr )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:796:6: ( ruleBinaryIntExpr )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:797:1: ruleBinaryIntExpr
                    {
                     before(grammarAccess.getIntExprAccess().getBinaryIntExprParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleBinaryIntExpr_in_rule__IntExpr__Alternatives1629);
                    ruleBinaryIntExpr();
                    _fsp--;

                     after(grammarAccess.getIntExprAccess().getBinaryIntExprParserRuleCall_1()); 

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
    // $ANTLR end rule__IntExpr__Alternatives


    // $ANTLR start rule__TemporalPredicate__Alternatives
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:807:1: rule__TemporalPredicate__Alternatives : ( ( ruleHoldsAt ) | ( ruleHappens ) | ( ruleInitiates ) | ( ruleTerminates ) );
    public final void rule__TemporalPredicate__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:811:1: ( ( ruleHoldsAt ) | ( ruleHappens ) | ( ruleInitiates ) | ( ruleTerminates ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt3=1;
                }
                break;
            case 30:
                {
                alt3=2;
                }
                break;
            case 31:
                {
                alt3=3;
                }
                break;
            case 32:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("807:1: rule__TemporalPredicate__Alternatives : ( ( ruleHoldsAt ) | ( ruleHappens ) | ( ruleInitiates ) | ( ruleTerminates ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:812:1: ( ruleHoldsAt )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:812:1: ( ruleHoldsAt )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:813:1: ruleHoldsAt
                    {
                     before(grammarAccess.getTemporalPredicateAccess().getHoldsAtParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleHoldsAt_in_rule__TemporalPredicate__Alternatives1661);
                    ruleHoldsAt();
                    _fsp--;

                     after(grammarAccess.getTemporalPredicateAccess().getHoldsAtParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:818:6: ( ruleHappens )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:818:6: ( ruleHappens )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:819:1: ruleHappens
                    {
                     before(grammarAccess.getTemporalPredicateAccess().getHappensParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleHappens_in_rule__TemporalPredicate__Alternatives1678);
                    ruleHappens();
                    _fsp--;

                     after(grammarAccess.getTemporalPredicateAccess().getHappensParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:824:6: ( ruleInitiates )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:824:6: ( ruleInitiates )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:825:1: ruleInitiates
                    {
                     before(grammarAccess.getTemporalPredicateAccess().getInitiatesParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleInitiates_in_rule__TemporalPredicate__Alternatives1695);
                    ruleInitiates();
                    _fsp--;

                     after(grammarAccess.getTemporalPredicateAccess().getInitiatesParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:830:6: ( ruleTerminates )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:830:6: ( ruleTerminates )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:831:1: ruleTerminates
                    {
                     before(grammarAccess.getTemporalPredicateAccess().getTerminatesParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleTerminates_in_rule__TemporalPredicate__Alternatives1712);
                    ruleTerminates();
                    _fsp--;

                     after(grammarAccess.getTemporalPredicateAccess().getTerminatesParserRuleCall_3()); 

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
    // $ANTLR end rule__TemporalPredicate__Alternatives


    // $ANTLR start rule__BoolExpr__Alternatives
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:841:1: rule__BoolExpr__Alternatives : ( ( ruleTemporalPredicate ) | ( ruleUnaryBoolExpr ) | ( ruleBinaryBoolExpr ) );
    public final void rule__BoolExpr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:845:1: ( ( ruleTemporalPredicate ) | ( ruleUnaryBoolExpr ) | ( ruleBinaryBoolExpr ) )
            int alt4=3;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:846:1: ( ruleTemporalPredicate )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:846:1: ( ruleTemporalPredicate )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:847:1: ruleTemporalPredicate
                    {
                     before(grammarAccess.getBoolExprAccess().getTemporalPredicateParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleTemporalPredicate_in_rule__BoolExpr__Alternatives1744);
                    ruleTemporalPredicate();
                    _fsp--;

                     after(grammarAccess.getBoolExprAccess().getTemporalPredicateParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:852:6: ( ruleUnaryBoolExpr )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:852:6: ( ruleUnaryBoolExpr )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:853:1: ruleUnaryBoolExpr
                    {
                     before(grammarAccess.getBoolExprAccess().getUnaryBoolExprParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleUnaryBoolExpr_in_rule__BoolExpr__Alternatives1761);
                    ruleUnaryBoolExpr();
                    _fsp--;

                     after(grammarAccess.getBoolExprAccess().getUnaryBoolExprParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:858:6: ( ruleBinaryBoolExpr )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:858:6: ( ruleBinaryBoolExpr )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:859:1: ruleBinaryBoolExpr
                    {
                     before(grammarAccess.getBoolExprAccess().getBinaryBoolExprParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleBinaryBoolExpr_in_rule__BoolExpr__Alternatives1778);
                    ruleBinaryBoolExpr();
                    _fsp--;

                     after(grammarAccess.getBoolExprAccess().getBinaryBoolExprParserRuleCall_2()); 

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
    // $ANTLR end rule__BoolExpr__Alternatives


    // $ANTLR start rule__UnaryBoolExpr__Alternatives
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:869:1: rule__UnaryBoolExpr__Alternatives : ( ( ( rule__UnaryBoolExpr__Group_0__0 ) ) | ( ( rule__UnaryBoolExpr__Group_1__0 ) ) );
    public final void rule__UnaryBoolExpr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:873:1: ( ( ( rule__UnaryBoolExpr__Group_0__0 ) ) | ( ( rule__UnaryBoolExpr__Group_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==11) ) {
                alt5=1;
            }
            else if ( (LA5_0==22) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("869:1: rule__UnaryBoolExpr__Alternatives : ( ( ( rule__UnaryBoolExpr__Group_0__0 ) ) | ( ( rule__UnaryBoolExpr__Group_1__0 ) ) );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:874:1: ( ( rule__UnaryBoolExpr__Group_0__0 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:874:1: ( ( rule__UnaryBoolExpr__Group_0__0 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:875:1: ( rule__UnaryBoolExpr__Group_0__0 )
                    {
                     before(grammarAccess.getUnaryBoolExprAccess().getGroup_0()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:876:1: ( rule__UnaryBoolExpr__Group_0__0 )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:876:2: rule__UnaryBoolExpr__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__UnaryBoolExpr__Group_0__0_in_rule__UnaryBoolExpr__Alternatives1810);
                    rule__UnaryBoolExpr__Group_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getUnaryBoolExprAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:880:6: ( ( rule__UnaryBoolExpr__Group_1__0 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:880:6: ( ( rule__UnaryBoolExpr__Group_1__0 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:881:1: ( rule__UnaryBoolExpr__Group_1__0 )
                    {
                     before(grammarAccess.getUnaryBoolExprAccess().getGroup_1()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:882:1: ( rule__UnaryBoolExpr__Group_1__0 )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:882:2: rule__UnaryBoolExpr__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__UnaryBoolExpr__Group_1__0_in_rule__UnaryBoolExpr__Alternatives1828);
                    rule__UnaryBoolExpr__Group_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getUnaryBoolExprAccess().getGroup_1()); 

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
    // $ANTLR end rule__UnaryBoolExpr__Alternatives


    // $ANTLR start rule__Entity__Alternatives
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:891:1: rule__Entity__Alternatives : ( ( ruleFluent ) | ( ruleEvent ) | ( ruleSort ) );
    public final void rule__Entity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:895:1: ( ( ruleFluent ) | ( ruleEvent ) | ( ruleSort ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt6=1;
                }
                break;
            case 28:
                {
                alt6=2;
                }
                break;
            case 24:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("891:1: rule__Entity__Alternatives : ( ( ruleFluent ) | ( ruleEvent ) | ( ruleSort ) );", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:896:1: ( ruleFluent )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:896:1: ( ruleFluent )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:897:1: ruleFluent
                    {
                     before(grammarAccess.getEntityAccess().getFluentParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleFluent_in_rule__Entity__Alternatives1861);
                    ruleFluent();
                    _fsp--;

                     after(grammarAccess.getEntityAccess().getFluentParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:902:6: ( ruleEvent )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:902:6: ( ruleEvent )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:903:1: ruleEvent
                    {
                     before(grammarAccess.getEntityAccess().getEventParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEvent_in_rule__Entity__Alternatives1878);
                    ruleEvent();
                    _fsp--;

                     after(grammarAccess.getEntityAccess().getEventParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:908:6: ( ruleSort )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:908:6: ( ruleSort )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:909:1: ruleSort
                    {
                     before(grammarAccess.getEntityAccess().getSortParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleSort_in_rule__Entity__Alternatives1895);
                    ruleSort();
                    _fsp--;

                     after(grammarAccess.getEntityAccess().getSortParserRuleCall_2()); 

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
    // $ANTLR end rule__Entity__Alternatives


    // $ANTLR start rule__BinaryIntOp__Alternatives
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:919:1: rule__BinaryIntOp__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) );
    public final void rule__BinaryIntOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:923:1: ( ( ( '+' ) ) | ( ( '-' ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==12) ) {
                alt7=1;
            }
            else if ( (LA7_0==13) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("919:1: rule__BinaryIntOp__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) );", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:924:1: ( ( '+' ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:924:1: ( ( '+' ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:925:1: ( '+' )
                    {
                     before(grammarAccess.getBinaryIntOpAccess().getPLUSEnumLiteralDeclaration_0()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:926:1: ( '+' )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:926:3: '+'
                    {
                    match(input,12,FOLLOW_12_in_rule__BinaryIntOp__Alternatives1928); 

                    }

                     after(grammarAccess.getBinaryIntOpAccess().getPLUSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:931:6: ( ( '-' ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:931:6: ( ( '-' ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:932:1: ( '-' )
                    {
                     before(grammarAccess.getBinaryIntOpAccess().getMINUSEnumLiteralDeclaration_1()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:933:1: ( '-' )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:933:3: '-'
                    {
                    match(input,13,FOLLOW_13_in_rule__BinaryIntOp__Alternatives1949); 

                    }

                     after(grammarAccess.getBinaryIntOpAccess().getMINUSEnumLiteralDeclaration_1()); 

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
    // $ANTLR end rule__BinaryIntOp__Alternatives


    // $ANTLR start rule__BinaryBoolOp__Alternatives
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:943:1: rule__BinaryBoolOp__Alternatives : ( ( ( '->' ) ) | ( ( '<->' ) ) | ( ( '&' ) ) | ( ( '|' ) ) );
    public final void rule__BinaryBoolOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:947:1: ( ( ( '->' ) ) | ( ( '<->' ) ) | ( ( '&' ) ) | ( ( '|' ) ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt8=1;
                }
                break;
            case 15:
                {
                alt8=2;
                }
                break;
            case 16:
                {
                alt8=3;
                }
                break;
            case 17:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("943:1: rule__BinaryBoolOp__Alternatives : ( ( ( '->' ) ) | ( ( '<->' ) ) | ( ( '&' ) ) | ( ( '|' ) ) );", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:948:1: ( ( '->' ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:948:1: ( ( '->' ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:949:1: ( '->' )
                    {
                     before(grammarAccess.getBinaryBoolOpAccess().getIMPLICATIONEnumLiteralDeclaration_0()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:950:1: ( '->' )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:950:3: '->'
                    {
                    match(input,14,FOLLOW_14_in_rule__BinaryBoolOp__Alternatives1985); 

                    }

                     after(grammarAccess.getBinaryBoolOpAccess().getIMPLICATIONEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:955:6: ( ( '<->' ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:955:6: ( ( '<->' ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:956:1: ( '<->' )
                    {
                     before(grammarAccess.getBinaryBoolOpAccess().getEQUIVALENCEEnumLiteralDeclaration_1()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:957:1: ( '<->' )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:957:3: '<->'
                    {
                    match(input,15,FOLLOW_15_in_rule__BinaryBoolOp__Alternatives2006); 

                    }

                     after(grammarAccess.getBinaryBoolOpAccess().getEQUIVALENCEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:962:6: ( ( '&' ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:962:6: ( ( '&' ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:963:1: ( '&' )
                    {
                     before(grammarAccess.getBinaryBoolOpAccess().getANDEnumLiteralDeclaration_2()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:964:1: ( '&' )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:964:3: '&'
                    {
                    match(input,16,FOLLOW_16_in_rule__BinaryBoolOp__Alternatives2027); 

                    }

                     after(grammarAccess.getBinaryBoolOpAccess().getANDEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:969:6: ( ( '|' ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:969:6: ( ( '|' ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:970:1: ( '|' )
                    {
                     before(grammarAccess.getBinaryBoolOpAccess().getOREnumLiteralDeclaration_3()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:971:1: ( '|' )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:971:3: '|'
                    {
                    match(input,17,FOLLOW_17_in_rule__BinaryBoolOp__Alternatives2048); 

                    }

                     after(grammarAccess.getBinaryBoolOpAccess().getOREnumLiteralDeclaration_3()); 

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
    // $ANTLR end rule__BinaryBoolOp__Alternatives


    // $ANTLR start rule__Knowledge__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:983:1: rule__Knowledge__Group__0 : rule__Knowledge__Group__0__Impl rule__Knowledge__Group__1 ;
    public final void rule__Knowledge__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:987:1: ( rule__Knowledge__Group__0__Impl rule__Knowledge__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:988:2: rule__Knowledge__Group__0__Impl rule__Knowledge__Group__1
            {
            pushFollow(FOLLOW_rule__Knowledge__Group__0__Impl_in_rule__Knowledge__Group__02081);
            rule__Knowledge__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Knowledge__Group__1_in_rule__Knowledge__Group__02084);
            rule__Knowledge__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Knowledge__Group__0


    // $ANTLR start rule__Knowledge__Group__0__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:995:1: rule__Knowledge__Group__0__Impl : ( ( rule__Knowledge__ImportsAssignment_0 )* ) ;
    public final void rule__Knowledge__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:999:1: ( ( ( rule__Knowledge__ImportsAssignment_0 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1000:1: ( ( rule__Knowledge__ImportsAssignment_0 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1000:1: ( ( rule__Knowledge__ImportsAssignment_0 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1001:1: ( rule__Knowledge__ImportsAssignment_0 )*
            {
             before(grammarAccess.getKnowledgeAccess().getImportsAssignment_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1002:1: ( rule__Knowledge__ImportsAssignment_0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==25) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1002:2: rule__Knowledge__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Knowledge__ImportsAssignment_0_in_rule__Knowledge__Group__0__Impl2111);
            	    rule__Knowledge__ImportsAssignment_0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getKnowledgeAccess().getImportsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Knowledge__Group__0__Impl


    // $ANTLR start rule__Knowledge__Group__1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1012:1: rule__Knowledge__Group__1 : rule__Knowledge__Group__1__Impl rule__Knowledge__Group__2 ;
    public final void rule__Knowledge__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1016:1: ( rule__Knowledge__Group__1__Impl rule__Knowledge__Group__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1017:2: rule__Knowledge__Group__1__Impl rule__Knowledge__Group__2
            {
            pushFollow(FOLLOW_rule__Knowledge__Group__1__Impl_in_rule__Knowledge__Group__12142);
            rule__Knowledge__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Knowledge__Group__2_in_rule__Knowledge__Group__12145);
            rule__Knowledge__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Knowledge__Group__1


    // $ANTLR start rule__Knowledge__Group__1__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1024:1: rule__Knowledge__Group__1__Impl : ( ( rule__Knowledge__EntitiesAssignment_1 )* ) ;
    public final void rule__Knowledge__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1028:1: ( ( ( rule__Knowledge__EntitiesAssignment_1 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1029:1: ( ( rule__Knowledge__EntitiesAssignment_1 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1029:1: ( ( rule__Knowledge__EntitiesAssignment_1 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1030:1: ( rule__Knowledge__EntitiesAssignment_1 )*
            {
             before(grammarAccess.getKnowledgeAccess().getEntitiesAssignment_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1031:1: ( rule__Knowledge__EntitiesAssignment_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==24||(LA10_0>=27 && LA10_0<=28)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1031:2: rule__Knowledge__EntitiesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Knowledge__EntitiesAssignment_1_in_rule__Knowledge__Group__1__Impl2172);
            	    rule__Knowledge__EntitiesAssignment_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getKnowledgeAccess().getEntitiesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Knowledge__Group__1__Impl


    // $ANTLR start rule__Knowledge__Group__2
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1041:1: rule__Knowledge__Group__2 : rule__Knowledge__Group__2__Impl rule__Knowledge__Group__3 ;
    public final void rule__Knowledge__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1045:1: ( rule__Knowledge__Group__2__Impl rule__Knowledge__Group__3 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1046:2: rule__Knowledge__Group__2__Impl rule__Knowledge__Group__3
            {
            pushFollow(FOLLOW_rule__Knowledge__Group__2__Impl_in_rule__Knowledge__Group__22203);
            rule__Knowledge__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Knowledge__Group__3_in_rule__Knowledge__Group__22206);
            rule__Knowledge__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Knowledge__Group__2


    // $ANTLR start rule__Knowledge__Group__2__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1053:1: rule__Knowledge__Group__2__Impl : ( ( rule__Knowledge__Group_2__0 )* ) ;
    public final void rule__Knowledge__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1057:1: ( ( ( rule__Knowledge__Group_2__0 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1058:1: ( ( rule__Knowledge__Group_2__0 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1058:1: ( ( rule__Knowledge__Group_2__0 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1059:1: ( rule__Knowledge__Group_2__0 )*
            {
             before(grammarAccess.getKnowledgeAccess().getGroup_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1060:1: ( rule__Knowledge__Group_2__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==11||LA11_0==19||LA11_0==22||(LA11_0>=29 && LA11_0<=32)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1060:2: rule__Knowledge__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Knowledge__Group_2__0_in_rule__Knowledge__Group__2__Impl2233);
            	    rule__Knowledge__Group_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getKnowledgeAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Knowledge__Group__2__Impl


    // $ANTLR start rule__Knowledge__Group__3
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1070:1: rule__Knowledge__Group__3 : rule__Knowledge__Group__3__Impl ;
    public final void rule__Knowledge__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1074:1: ( rule__Knowledge__Group__3__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1075:2: rule__Knowledge__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Knowledge__Group__3__Impl_in_rule__Knowledge__Group__32264);
            rule__Knowledge__Group__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Knowledge__Group__3


    // $ANTLR start rule__Knowledge__Group__3__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1081:1: rule__Knowledge__Group__3__Impl : ( ( rule__Knowledge__VarsAssignment_3 )* ) ;
    public final void rule__Knowledge__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1085:1: ( ( ( rule__Knowledge__VarsAssignment_3 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1086:1: ( ( rule__Knowledge__VarsAssignment_3 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1086:1: ( ( rule__Knowledge__VarsAssignment_3 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1087:1: ( rule__Knowledge__VarsAssignment_3 )*
            {
             before(grammarAccess.getKnowledgeAccess().getVarsAssignment_3()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1088:1: ( rule__Knowledge__VarsAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==26) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1088:2: rule__Knowledge__VarsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Knowledge__VarsAssignment_3_in_rule__Knowledge__Group__3__Impl2291);
            	    rule__Knowledge__VarsAssignment_3();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getKnowledgeAccess().getVarsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Knowledge__Group__3__Impl


    // $ANTLR start rule__Knowledge__Group_2__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1106:1: rule__Knowledge__Group_2__0 : rule__Knowledge__Group_2__0__Impl rule__Knowledge__Group_2__1 ;
    public final void rule__Knowledge__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1110:1: ( rule__Knowledge__Group_2__0__Impl rule__Knowledge__Group_2__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1111:2: rule__Knowledge__Group_2__0__Impl rule__Knowledge__Group_2__1
            {
            pushFollow(FOLLOW_rule__Knowledge__Group_2__0__Impl_in_rule__Knowledge__Group_2__02330);
            rule__Knowledge__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Knowledge__Group_2__1_in_rule__Knowledge__Group_2__02333);
            rule__Knowledge__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Knowledge__Group_2__0


    // $ANTLR start rule__Knowledge__Group_2__0__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1118:1: rule__Knowledge__Group_2__0__Impl : ( ( rule__Knowledge__RulesAssignment_2_0 ) ) ;
    public final void rule__Knowledge__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1122:1: ( ( ( rule__Knowledge__RulesAssignment_2_0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1123:1: ( ( rule__Knowledge__RulesAssignment_2_0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1123:1: ( ( rule__Knowledge__RulesAssignment_2_0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1124:1: ( rule__Knowledge__RulesAssignment_2_0 )
            {
             before(grammarAccess.getKnowledgeAccess().getRulesAssignment_2_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1125:1: ( rule__Knowledge__RulesAssignment_2_0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1125:2: rule__Knowledge__RulesAssignment_2_0
            {
            pushFollow(FOLLOW_rule__Knowledge__RulesAssignment_2_0_in_rule__Knowledge__Group_2__0__Impl2360);
            rule__Knowledge__RulesAssignment_2_0();
            _fsp--;


            }

             after(grammarAccess.getKnowledgeAccess().getRulesAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Knowledge__Group_2__0__Impl


    // $ANTLR start rule__Knowledge__Group_2__1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1135:1: rule__Knowledge__Group_2__1 : rule__Knowledge__Group_2__1__Impl ;
    public final void rule__Knowledge__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1139:1: ( rule__Knowledge__Group_2__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1140:2: rule__Knowledge__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Knowledge__Group_2__1__Impl_in_rule__Knowledge__Group_2__12390);
            rule__Knowledge__Group_2__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Knowledge__Group_2__1


    // $ANTLR start rule__Knowledge__Group_2__1__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1146:1: rule__Knowledge__Group_2__1__Impl : ( '.' ) ;
    public final void rule__Knowledge__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1150:1: ( ( '.' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1151:1: ( '.' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1151:1: ( '.' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1152:1: '.'
            {
             before(grammarAccess.getKnowledgeAccess().getFullStopKeyword_2_1()); 
            match(input,18,FOLLOW_18_in_rule__Knowledge__Group_2__1__Impl2418); 
             after(grammarAccess.getKnowledgeAccess().getFullStopKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Knowledge__Group_2__1__Impl


    // $ANTLR start rule__Rule__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1169:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1173:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1174:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__02453);
            rule__Rule__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__02456);
            rule__Rule__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Rule__Group__0


    // $ANTLR start rule__Rule__Group__0__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1181:1: rule__Rule__Group__0__Impl : ( ( rule__Rule__DeclAssignment_0 )? ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1185:1: ( ( ( rule__Rule__DeclAssignment_0 )? ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1186:1: ( ( rule__Rule__DeclAssignment_0 )? )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1186:1: ( ( rule__Rule__DeclAssignment_0 )? )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1187:1: ( rule__Rule__DeclAssignment_0 )?
            {
             before(grammarAccess.getRuleAccess().getDeclAssignment_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1188:1: ( rule__Rule__DeclAssignment_0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==19) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1188:2: rule__Rule__DeclAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Rule__DeclAssignment_0_in_rule__Rule__Group__0__Impl2483);
                    rule__Rule__DeclAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRuleAccess().getDeclAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Rule__Group__0__Impl


    // $ANTLR start rule__Rule__Group__1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1198:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1202:1: ( rule__Rule__Group__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1203:2: rule__Rule__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__12514);
            rule__Rule__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Rule__Group__1


    // $ANTLR start rule__Rule__Group__1__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1209:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__ExprAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1213:1: ( ( ( rule__Rule__ExprAssignment_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1214:1: ( ( rule__Rule__ExprAssignment_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1214:1: ( ( rule__Rule__ExprAssignment_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1215:1: ( rule__Rule__ExprAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getExprAssignment_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1216:1: ( rule__Rule__ExprAssignment_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1216:2: rule__Rule__ExprAssignment_1
            {
            pushFollow(FOLLOW_rule__Rule__ExprAssignment_1_in_rule__Rule__Group__1__Impl2541);
            rule__Rule__ExprAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getRuleAccess().getExprAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Rule__Group__1__Impl


    // $ANTLR start rule__VarDecl__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1230:1: rule__VarDecl__Group__0 : rule__VarDecl__Group__0__Impl rule__VarDecl__Group__1 ;
    public final void rule__VarDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1234:1: ( rule__VarDecl__Group__0__Impl rule__VarDecl__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1235:2: rule__VarDecl__Group__0__Impl rule__VarDecl__Group__1
            {
            pushFollow(FOLLOW_rule__VarDecl__Group__0__Impl_in_rule__VarDecl__Group__02575);
            rule__VarDecl__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__VarDecl__Group__1_in_rule__VarDecl__Group__02578);
            rule__VarDecl__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VarDecl__Group__0


    // $ANTLR start rule__VarDecl__Group__0__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1242:1: rule__VarDecl__Group__0__Impl : ( '[' ) ;
    public final void rule__VarDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1246:1: ( ( '[' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1247:1: ( '[' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1247:1: ( '[' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1248:1: '['
            {
             before(grammarAccess.getVarDeclAccess().getLeftSquareBracketKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__VarDecl__Group__0__Impl2606); 
             after(grammarAccess.getVarDeclAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VarDecl__Group__0__Impl


    // $ANTLR start rule__VarDecl__Group__1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1261:1: rule__VarDecl__Group__1 : rule__VarDecl__Group__1__Impl rule__VarDecl__Group__2 ;
    public final void rule__VarDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1265:1: ( rule__VarDecl__Group__1__Impl rule__VarDecl__Group__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1266:2: rule__VarDecl__Group__1__Impl rule__VarDecl__Group__2
            {
            pushFollow(FOLLOW_rule__VarDecl__Group__1__Impl_in_rule__VarDecl__Group__12637);
            rule__VarDecl__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__VarDecl__Group__2_in_rule__VarDecl__Group__12640);
            rule__VarDecl__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VarDecl__Group__1


    // $ANTLR start rule__VarDecl__Group__1__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1273:1: rule__VarDecl__Group__1__Impl : ( ( rule__VarDecl__VarsAssignment_1 ) ) ;
    public final void rule__VarDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1277:1: ( ( ( rule__VarDecl__VarsAssignment_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1278:1: ( ( rule__VarDecl__VarsAssignment_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1278:1: ( ( rule__VarDecl__VarsAssignment_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1279:1: ( rule__VarDecl__VarsAssignment_1 )
            {
             before(grammarAccess.getVarDeclAccess().getVarsAssignment_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1280:1: ( rule__VarDecl__VarsAssignment_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1280:2: rule__VarDecl__VarsAssignment_1
            {
            pushFollow(FOLLOW_rule__VarDecl__VarsAssignment_1_in_rule__VarDecl__Group__1__Impl2667);
            rule__VarDecl__VarsAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getVarDeclAccess().getVarsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VarDecl__Group__1__Impl


    // $ANTLR start rule__VarDecl__Group__2
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1290:1: rule__VarDecl__Group__2 : rule__VarDecl__Group__2__Impl rule__VarDecl__Group__3 ;
    public final void rule__VarDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1294:1: ( rule__VarDecl__Group__2__Impl rule__VarDecl__Group__3 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1295:2: rule__VarDecl__Group__2__Impl rule__VarDecl__Group__3
            {
            pushFollow(FOLLOW_rule__VarDecl__Group__2__Impl_in_rule__VarDecl__Group__22697);
            rule__VarDecl__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__VarDecl__Group__3_in_rule__VarDecl__Group__22700);
            rule__VarDecl__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VarDecl__Group__2


    // $ANTLR start rule__VarDecl__Group__2__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1302:1: rule__VarDecl__Group__2__Impl : ( ( rule__VarDecl__Group_2__0 )* ) ;
    public final void rule__VarDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1306:1: ( ( ( rule__VarDecl__Group_2__0 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1307:1: ( ( rule__VarDecl__Group_2__0 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1307:1: ( ( rule__VarDecl__Group_2__0 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1308:1: ( rule__VarDecl__Group_2__0 )*
            {
             before(grammarAccess.getVarDeclAccess().getGroup_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1309:1: ( rule__VarDecl__Group_2__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==21) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1309:2: rule__VarDecl__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__VarDecl__Group_2__0_in_rule__VarDecl__Group__2__Impl2727);
            	    rule__VarDecl__Group_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getVarDeclAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VarDecl__Group__2__Impl


    // $ANTLR start rule__VarDecl__Group__3
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1319:1: rule__VarDecl__Group__3 : rule__VarDecl__Group__3__Impl ;
    public final void rule__VarDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1323:1: ( rule__VarDecl__Group__3__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1324:2: rule__VarDecl__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__VarDecl__Group__3__Impl_in_rule__VarDecl__Group__32758);
            rule__VarDecl__Group__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VarDecl__Group__3


    // $ANTLR start rule__VarDecl__Group__3__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1330:1: rule__VarDecl__Group__3__Impl : ( ']' ) ;
    public final void rule__VarDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1334:1: ( ( ']' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1335:1: ( ']' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1335:1: ( ']' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1336:1: ']'
            {
             before(grammarAccess.getVarDeclAccess().getRightSquareBracketKeyword_3()); 
            match(input,20,FOLLOW_20_in_rule__VarDecl__Group__3__Impl2786); 
             after(grammarAccess.getVarDeclAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VarDecl__Group__3__Impl


    // $ANTLR start rule__VarDecl__Group_2__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1357:1: rule__VarDecl__Group_2__0 : rule__VarDecl__Group_2__0__Impl rule__VarDecl__Group_2__1 ;
    public final void rule__VarDecl__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1361:1: ( rule__VarDecl__Group_2__0__Impl rule__VarDecl__Group_2__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1362:2: rule__VarDecl__Group_2__0__Impl rule__VarDecl__Group_2__1
            {
            pushFollow(FOLLOW_rule__VarDecl__Group_2__0__Impl_in_rule__VarDecl__Group_2__02825);
            rule__VarDecl__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__VarDecl__Group_2__1_in_rule__VarDecl__Group_2__02828);
            rule__VarDecl__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VarDecl__Group_2__0


    // $ANTLR start rule__VarDecl__Group_2__0__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1369:1: rule__VarDecl__Group_2__0__Impl : ( ',' ) ;
    public final void rule__VarDecl__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1373:1: ( ( ',' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1374:1: ( ',' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1374:1: ( ',' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1375:1: ','
            {
             before(grammarAccess.getVarDeclAccess().getCommaKeyword_2_0()); 
            match(input,21,FOLLOW_21_in_rule__VarDecl__Group_2__0__Impl2856); 
             after(grammarAccess.getVarDeclAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VarDecl__Group_2__0__Impl


    // $ANTLR start rule__VarDecl__Group_2__1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1388:1: rule__VarDecl__Group_2__1 : rule__VarDecl__Group_2__1__Impl ;
    public final void rule__VarDecl__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1392:1: ( rule__VarDecl__Group_2__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1393:2: rule__VarDecl__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__VarDecl__Group_2__1__Impl_in_rule__VarDecl__Group_2__12887);
            rule__VarDecl__Group_2__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VarDecl__Group_2__1


    // $ANTLR start rule__VarDecl__Group_2__1__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1399:1: rule__VarDecl__Group_2__1__Impl : ( ( rule__VarDecl__VarsAssignment_2_1 ) ) ;
    public final void rule__VarDecl__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1403:1: ( ( ( rule__VarDecl__VarsAssignment_2_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1404:1: ( ( rule__VarDecl__VarsAssignment_2_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1404:1: ( ( rule__VarDecl__VarsAssignment_2_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1405:1: ( rule__VarDecl__VarsAssignment_2_1 )
            {
             before(grammarAccess.getVarDeclAccess().getVarsAssignment_2_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1406:1: ( rule__VarDecl__VarsAssignment_2_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1406:2: rule__VarDecl__VarsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__VarDecl__VarsAssignment_2_1_in_rule__VarDecl__Group_2__1__Impl2914);
            rule__VarDecl__VarsAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getVarDeclAccess().getVarsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VarDecl__Group_2__1__Impl


    // $ANTLR start rule__BinaryIntExpr__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1420:1: rule__BinaryIntExpr__Group__0 : rule__BinaryIntExpr__Group__0__Impl rule__BinaryIntExpr__Group__1 ;
    public final void rule__BinaryIntExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1424:1: ( rule__BinaryIntExpr__Group__0__Impl rule__BinaryIntExpr__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1425:2: rule__BinaryIntExpr__Group__0__Impl rule__BinaryIntExpr__Group__1
            {
            pushFollow(FOLLOW_rule__BinaryIntExpr__Group__0__Impl_in_rule__BinaryIntExpr__Group__02948);
            rule__BinaryIntExpr__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BinaryIntExpr__Group__1_in_rule__BinaryIntExpr__Group__02951);
            rule__BinaryIntExpr__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BinaryIntExpr__Group__0


    // $ANTLR start rule__BinaryIntExpr__Group__0__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1432:1: rule__BinaryIntExpr__Group__0__Impl : ( ( rule__BinaryIntExpr__OprAssignment_0 ) ) ;
    public final void rule__BinaryIntExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1436:1: ( ( ( rule__BinaryIntExpr__OprAssignment_0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1437:1: ( ( rule__BinaryIntExpr__OprAssignment_0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1437:1: ( ( rule__BinaryIntExpr__OprAssignment_0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1438:1: ( rule__BinaryIntExpr__OprAssignment_0 )
            {
             before(grammarAccess.getBinaryIntExprAccess().getOprAssignment_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1439:1: ( rule__BinaryIntExpr__OprAssignment_0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1439:2: rule__BinaryIntExpr__OprAssignment_0
            {
            pushFollow(FOLLOW_rule__BinaryIntExpr__OprAssignment_0_in_rule__BinaryIntExpr__Group__0__Impl2978);
            rule__BinaryIntExpr__OprAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getBinaryIntExprAccess().getOprAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BinaryIntExpr__Group__0__Impl


    // $ANTLR start rule__BinaryIntExpr__Group__1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1449:1: rule__BinaryIntExpr__Group__1 : rule__BinaryIntExpr__Group__1__Impl rule__BinaryIntExpr__Group__2 ;
    public final void rule__BinaryIntExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1453:1: ( rule__BinaryIntExpr__Group__1__Impl rule__BinaryIntExpr__Group__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1454:2: rule__BinaryIntExpr__Group__1__Impl rule__BinaryIntExpr__Group__2
            {
            pushFollow(FOLLOW_rule__BinaryIntExpr__Group__1__Impl_in_rule__BinaryIntExpr__Group__13008);
            rule__BinaryIntExpr__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BinaryIntExpr__Group__2_in_rule__BinaryIntExpr__Group__13011);
            rule__BinaryIntExpr__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BinaryIntExpr__Group__1


    // $ANTLR start rule__BinaryIntExpr__Group__1__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1461:1: rule__BinaryIntExpr__Group__1__Impl : ( ( rule__BinaryIntExpr__BinaryopAssignment_1 ) ) ;
    public final void rule__BinaryIntExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1465:1: ( ( ( rule__BinaryIntExpr__BinaryopAssignment_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1466:1: ( ( rule__BinaryIntExpr__BinaryopAssignment_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1466:1: ( ( rule__BinaryIntExpr__BinaryopAssignment_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1467:1: ( rule__BinaryIntExpr__BinaryopAssignment_1 )
            {
             before(grammarAccess.getBinaryIntExprAccess().getBinaryopAssignment_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1468:1: ( rule__BinaryIntExpr__BinaryopAssignment_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1468:2: rule__BinaryIntExpr__BinaryopAssignment_1
            {
            pushFollow(FOLLOW_rule__BinaryIntExpr__BinaryopAssignment_1_in_rule__BinaryIntExpr__Group__1__Impl3038);
            rule__BinaryIntExpr__BinaryopAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getBinaryIntExprAccess().getBinaryopAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BinaryIntExpr__Group__1__Impl


    // $ANTLR start rule__BinaryIntExpr__Group__2
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1478:1: rule__BinaryIntExpr__Group__2 : rule__BinaryIntExpr__Group__2__Impl ;
    public final void rule__BinaryIntExpr__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1482:1: ( rule__BinaryIntExpr__Group__2__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1483:2: rule__BinaryIntExpr__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__BinaryIntExpr__Group__2__Impl_in_rule__BinaryIntExpr__Group__23068);
            rule__BinaryIntExpr__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BinaryIntExpr__Group__2


    // $ANTLR start rule__BinaryIntExpr__Group__2__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1489:1: rule__BinaryIntExpr__Group__2__Impl : ( ( rule__BinaryIntExpr__OprAssignment_2 ) ) ;
    public final void rule__BinaryIntExpr__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1493:1: ( ( ( rule__BinaryIntExpr__OprAssignment_2 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1494:1: ( ( rule__BinaryIntExpr__OprAssignment_2 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1494:1: ( ( rule__BinaryIntExpr__OprAssignment_2 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1495:1: ( rule__BinaryIntExpr__OprAssignment_2 )
            {
             before(grammarAccess.getBinaryIntExprAccess().getOprAssignment_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1496:1: ( rule__BinaryIntExpr__OprAssignment_2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1496:2: rule__BinaryIntExpr__OprAssignment_2
            {
            pushFollow(FOLLOW_rule__BinaryIntExpr__OprAssignment_2_in_rule__BinaryIntExpr__Group__2__Impl3095);
            rule__BinaryIntExpr__OprAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getBinaryIntExprAccess().getOprAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BinaryIntExpr__Group__2__Impl


    // $ANTLR start rule__UnaryBoolExpr__Group_0__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1512:1: rule__UnaryBoolExpr__Group_0__0 : rule__UnaryBoolExpr__Group_0__0__Impl rule__UnaryBoolExpr__Group_0__1 ;
    public final void rule__UnaryBoolExpr__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1516:1: ( rule__UnaryBoolExpr__Group_0__0__Impl rule__UnaryBoolExpr__Group_0__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1517:2: rule__UnaryBoolExpr__Group_0__0__Impl rule__UnaryBoolExpr__Group_0__1
            {
            pushFollow(FOLLOW_rule__UnaryBoolExpr__Group_0__0__Impl_in_rule__UnaryBoolExpr__Group_0__03131);
            rule__UnaryBoolExpr__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UnaryBoolExpr__Group_0__1_in_rule__UnaryBoolExpr__Group_0__03134);
            rule__UnaryBoolExpr__Group_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnaryBoolExpr__Group_0__0


    // $ANTLR start rule__UnaryBoolExpr__Group_0__0__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1524:1: rule__UnaryBoolExpr__Group_0__0__Impl : ( ( rule__UnaryBoolExpr__Unaryop_lhsAssignment_0_0 ) ) ;
    public final void rule__UnaryBoolExpr__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1528:1: ( ( ( rule__UnaryBoolExpr__Unaryop_lhsAssignment_0_0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1529:1: ( ( rule__UnaryBoolExpr__Unaryop_lhsAssignment_0_0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1529:1: ( ( rule__UnaryBoolExpr__Unaryop_lhsAssignment_0_0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1530:1: ( rule__UnaryBoolExpr__Unaryop_lhsAssignment_0_0 )
            {
             before(grammarAccess.getUnaryBoolExprAccess().getUnaryop_lhsAssignment_0_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1531:1: ( rule__UnaryBoolExpr__Unaryop_lhsAssignment_0_0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1531:2: rule__UnaryBoolExpr__Unaryop_lhsAssignment_0_0
            {
            pushFollow(FOLLOW_rule__UnaryBoolExpr__Unaryop_lhsAssignment_0_0_in_rule__UnaryBoolExpr__Group_0__0__Impl3161);
            rule__UnaryBoolExpr__Unaryop_lhsAssignment_0_0();
            _fsp--;


            }

             after(grammarAccess.getUnaryBoolExprAccess().getUnaryop_lhsAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnaryBoolExpr__Group_0__0__Impl


    // $ANTLR start rule__UnaryBoolExpr__Group_0__1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1541:1: rule__UnaryBoolExpr__Group_0__1 : rule__UnaryBoolExpr__Group_0__1__Impl ;
    public final void rule__UnaryBoolExpr__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1545:1: ( rule__UnaryBoolExpr__Group_0__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1546:2: rule__UnaryBoolExpr__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__UnaryBoolExpr__Group_0__1__Impl_in_rule__UnaryBoolExpr__Group_0__13191);
            rule__UnaryBoolExpr__Group_0__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnaryBoolExpr__Group_0__1


    // $ANTLR start rule__UnaryBoolExpr__Group_0__1__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1552:1: rule__UnaryBoolExpr__Group_0__1__Impl : ( ( rule__UnaryBoolExpr__OprAssignment_0_1 ) ) ;
    public final void rule__UnaryBoolExpr__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1556:1: ( ( ( rule__UnaryBoolExpr__OprAssignment_0_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1557:1: ( ( rule__UnaryBoolExpr__OprAssignment_0_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1557:1: ( ( rule__UnaryBoolExpr__OprAssignment_0_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1558:1: ( rule__UnaryBoolExpr__OprAssignment_0_1 )
            {
             before(grammarAccess.getUnaryBoolExprAccess().getOprAssignment_0_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1559:1: ( rule__UnaryBoolExpr__OprAssignment_0_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1559:2: rule__UnaryBoolExpr__OprAssignment_0_1
            {
            pushFollow(FOLLOW_rule__UnaryBoolExpr__OprAssignment_0_1_in_rule__UnaryBoolExpr__Group_0__1__Impl3218);
            rule__UnaryBoolExpr__OprAssignment_0_1();
            _fsp--;


            }

             after(grammarAccess.getUnaryBoolExprAccess().getOprAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnaryBoolExpr__Group_0__1__Impl


    // $ANTLR start rule__UnaryBoolExpr__Group_1__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1573:1: rule__UnaryBoolExpr__Group_1__0 : rule__UnaryBoolExpr__Group_1__0__Impl rule__UnaryBoolExpr__Group_1__1 ;
    public final void rule__UnaryBoolExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1577:1: ( rule__UnaryBoolExpr__Group_1__0__Impl rule__UnaryBoolExpr__Group_1__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1578:2: rule__UnaryBoolExpr__Group_1__0__Impl rule__UnaryBoolExpr__Group_1__1
            {
            pushFollow(FOLLOW_rule__UnaryBoolExpr__Group_1__0__Impl_in_rule__UnaryBoolExpr__Group_1__03252);
            rule__UnaryBoolExpr__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UnaryBoolExpr__Group_1__1_in_rule__UnaryBoolExpr__Group_1__03255);
            rule__UnaryBoolExpr__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnaryBoolExpr__Group_1__0


    // $ANTLR start rule__UnaryBoolExpr__Group_1__0__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1585:1: rule__UnaryBoolExpr__Group_1__0__Impl : ( '(' ) ;
    public final void rule__UnaryBoolExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1589:1: ( ( '(' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1590:1: ( '(' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1590:1: ( '(' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1591:1: '('
            {
             before(grammarAccess.getUnaryBoolExprAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,22,FOLLOW_22_in_rule__UnaryBoolExpr__Group_1__0__Impl3283); 
             after(grammarAccess.getUnaryBoolExprAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnaryBoolExpr__Group_1__0__Impl


    // $ANTLR start rule__UnaryBoolExpr__Group_1__1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1604:1: rule__UnaryBoolExpr__Group_1__1 : rule__UnaryBoolExpr__Group_1__1__Impl rule__UnaryBoolExpr__Group_1__2 ;
    public final void rule__UnaryBoolExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1608:1: ( rule__UnaryBoolExpr__Group_1__1__Impl rule__UnaryBoolExpr__Group_1__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1609:2: rule__UnaryBoolExpr__Group_1__1__Impl rule__UnaryBoolExpr__Group_1__2
            {
            pushFollow(FOLLOW_rule__UnaryBoolExpr__Group_1__1__Impl_in_rule__UnaryBoolExpr__Group_1__13314);
            rule__UnaryBoolExpr__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UnaryBoolExpr__Group_1__2_in_rule__UnaryBoolExpr__Group_1__13317);
            rule__UnaryBoolExpr__Group_1__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnaryBoolExpr__Group_1__1


    // $ANTLR start rule__UnaryBoolExpr__Group_1__1__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1616:1: rule__UnaryBoolExpr__Group_1__1__Impl : ( ( rule__UnaryBoolExpr__OpsAssignment_1_1 ) ) ;
    public final void rule__UnaryBoolExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1620:1: ( ( ( rule__UnaryBoolExpr__OpsAssignment_1_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1621:1: ( ( rule__UnaryBoolExpr__OpsAssignment_1_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1621:1: ( ( rule__UnaryBoolExpr__OpsAssignment_1_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1622:1: ( rule__UnaryBoolExpr__OpsAssignment_1_1 )
            {
             before(grammarAccess.getUnaryBoolExprAccess().getOpsAssignment_1_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1623:1: ( rule__UnaryBoolExpr__OpsAssignment_1_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1623:2: rule__UnaryBoolExpr__OpsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__UnaryBoolExpr__OpsAssignment_1_1_in_rule__UnaryBoolExpr__Group_1__1__Impl3344);
            rule__UnaryBoolExpr__OpsAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getUnaryBoolExprAccess().getOpsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnaryBoolExpr__Group_1__1__Impl


    // $ANTLR start rule__UnaryBoolExpr__Group_1__2
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1633:1: rule__UnaryBoolExpr__Group_1__2 : rule__UnaryBoolExpr__Group_1__2__Impl ;
    public final void rule__UnaryBoolExpr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1637:1: ( rule__UnaryBoolExpr__Group_1__2__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1638:2: rule__UnaryBoolExpr__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__UnaryBoolExpr__Group_1__2__Impl_in_rule__UnaryBoolExpr__Group_1__23374);
            rule__UnaryBoolExpr__Group_1__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnaryBoolExpr__Group_1__2


    // $ANTLR start rule__UnaryBoolExpr__Group_1__2__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1644:1: rule__UnaryBoolExpr__Group_1__2__Impl : ( ')' ) ;
    public final void rule__UnaryBoolExpr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1648:1: ( ( ')' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1649:1: ( ')' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1649:1: ( ')' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1650:1: ')'
            {
             before(grammarAccess.getUnaryBoolExprAccess().getRightParenthesisKeyword_1_2()); 
            match(input,23,FOLLOW_23_in_rule__UnaryBoolExpr__Group_1__2__Impl3402); 
             after(grammarAccess.getUnaryBoolExprAccess().getRightParenthesisKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnaryBoolExpr__Group_1__2__Impl


    // $ANTLR start rule__BinaryBoolExpr__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1669:1: rule__BinaryBoolExpr__Group__0 : rule__BinaryBoolExpr__Group__0__Impl rule__BinaryBoolExpr__Group__1 ;
    public final void rule__BinaryBoolExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1673:1: ( rule__BinaryBoolExpr__Group__0__Impl rule__BinaryBoolExpr__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1674:2: rule__BinaryBoolExpr__Group__0__Impl rule__BinaryBoolExpr__Group__1
            {
            pushFollow(FOLLOW_rule__BinaryBoolExpr__Group__0__Impl_in_rule__BinaryBoolExpr__Group__03439);
            rule__BinaryBoolExpr__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BinaryBoolExpr__Group__1_in_rule__BinaryBoolExpr__Group__03442);
            rule__BinaryBoolExpr__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BinaryBoolExpr__Group__0


    // $ANTLR start rule__BinaryBoolExpr__Group__0__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1681:1: rule__BinaryBoolExpr__Group__0__Impl : ( ( rule__BinaryBoolExpr__OprAssignment_0 ) ) ;
    public final void rule__BinaryBoolExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1685:1: ( ( ( rule__BinaryBoolExpr__OprAssignment_0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1686:1: ( ( rule__BinaryBoolExpr__OprAssignment_0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1686:1: ( ( rule__BinaryBoolExpr__OprAssignment_0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1687:1: ( rule__BinaryBoolExpr__OprAssignment_0 )
            {
             before(grammarAccess.getBinaryBoolExprAccess().getOprAssignment_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1688:1: ( rule__BinaryBoolExpr__OprAssignment_0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1688:2: rule__BinaryBoolExpr__OprAssignment_0
            {
            pushFollow(FOLLOW_rule__BinaryBoolExpr__OprAssignment_0_in_rule__BinaryBoolExpr__Group__0__Impl3469);
            rule__BinaryBoolExpr__OprAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getBinaryBoolExprAccess().getOprAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BinaryBoolExpr__Group__0__Impl


    // $ANTLR start rule__BinaryBoolExpr__Group__1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1698:1: rule__BinaryBoolExpr__Group__1 : rule__BinaryBoolExpr__Group__1__Impl rule__BinaryBoolExpr__Group__2 ;
    public final void rule__BinaryBoolExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1702:1: ( rule__BinaryBoolExpr__Group__1__Impl rule__BinaryBoolExpr__Group__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1703:2: rule__BinaryBoolExpr__Group__1__Impl rule__BinaryBoolExpr__Group__2
            {
            pushFollow(FOLLOW_rule__BinaryBoolExpr__Group__1__Impl_in_rule__BinaryBoolExpr__Group__13499);
            rule__BinaryBoolExpr__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BinaryBoolExpr__Group__2_in_rule__BinaryBoolExpr__Group__13502);
            rule__BinaryBoolExpr__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BinaryBoolExpr__Group__1


    // $ANTLR start rule__BinaryBoolExpr__Group__1__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1710:1: rule__BinaryBoolExpr__Group__1__Impl : ( ( rule__BinaryBoolExpr__BinaryopAssignment_1 ) ) ;
    public final void rule__BinaryBoolExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1714:1: ( ( ( rule__BinaryBoolExpr__BinaryopAssignment_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1715:1: ( ( rule__BinaryBoolExpr__BinaryopAssignment_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1715:1: ( ( rule__BinaryBoolExpr__BinaryopAssignment_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1716:1: ( rule__BinaryBoolExpr__BinaryopAssignment_1 )
            {
             before(grammarAccess.getBinaryBoolExprAccess().getBinaryopAssignment_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1717:1: ( rule__BinaryBoolExpr__BinaryopAssignment_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1717:2: rule__BinaryBoolExpr__BinaryopAssignment_1
            {
            pushFollow(FOLLOW_rule__BinaryBoolExpr__BinaryopAssignment_1_in_rule__BinaryBoolExpr__Group__1__Impl3529);
            rule__BinaryBoolExpr__BinaryopAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getBinaryBoolExprAccess().getBinaryopAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BinaryBoolExpr__Group__1__Impl


    // $ANTLR start rule__BinaryBoolExpr__Group__2
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1727:1: rule__BinaryBoolExpr__Group__2 : rule__BinaryBoolExpr__Group__2__Impl ;
    public final void rule__BinaryBoolExpr__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1731:1: ( rule__BinaryBoolExpr__Group__2__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1732:2: rule__BinaryBoolExpr__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__BinaryBoolExpr__Group__2__Impl_in_rule__BinaryBoolExpr__Group__23559);
            rule__BinaryBoolExpr__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BinaryBoolExpr__Group__2


    // $ANTLR start rule__BinaryBoolExpr__Group__2__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1738:1: rule__BinaryBoolExpr__Group__2__Impl : ( ( rule__BinaryBoolExpr__OprAssignment_2 ) ) ;
    public final void rule__BinaryBoolExpr__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1742:1: ( ( ( rule__BinaryBoolExpr__OprAssignment_2 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1743:1: ( ( rule__BinaryBoolExpr__OprAssignment_2 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1743:1: ( ( rule__BinaryBoolExpr__OprAssignment_2 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1744:1: ( rule__BinaryBoolExpr__OprAssignment_2 )
            {
             before(grammarAccess.getBinaryBoolExprAccess().getOprAssignment_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1745:1: ( rule__BinaryBoolExpr__OprAssignment_2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1745:2: rule__BinaryBoolExpr__OprAssignment_2
            {
            pushFollow(FOLLOW_rule__BinaryBoolExpr__OprAssignment_2_in_rule__BinaryBoolExpr__Group__2__Impl3586);
            rule__BinaryBoolExpr__OprAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getBinaryBoolExprAccess().getOprAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BinaryBoolExpr__Group__2__Impl


    // $ANTLR start rule__Sort__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1761:1: rule__Sort__Group__0 : rule__Sort__Group__0__Impl rule__Sort__Group__1 ;
    public final void rule__Sort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1765:1: ( rule__Sort__Group__0__Impl rule__Sort__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1766:2: rule__Sort__Group__0__Impl rule__Sort__Group__1
            {
            pushFollow(FOLLOW_rule__Sort__Group__0__Impl_in_rule__Sort__Group__03622);
            rule__Sort__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Sort__Group__1_in_rule__Sort__Group__03625);
            rule__Sort__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Sort__Group__0


    // $ANTLR start rule__Sort__Group__0__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1773:1: rule__Sort__Group__0__Impl : ( 'sort' ) ;
    public final void rule__Sort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1777:1: ( ( 'sort' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1778:1: ( 'sort' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1778:1: ( 'sort' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1779:1: 'sort'
            {
             before(grammarAccess.getSortAccess().getSortKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__Sort__Group__0__Impl3653); 
             after(grammarAccess.getSortAccess().getSortKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Sort__Group__0__Impl


    // $ANTLR start rule__Sort__Group__1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1792:1: rule__Sort__Group__1 : rule__Sort__Group__1__Impl ;
    public final void rule__Sort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1796:1: ( rule__Sort__Group__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1797:2: rule__Sort__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Sort__Group__1__Impl_in_rule__Sort__Group__13684);
            rule__Sort__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Sort__Group__1


    // $ANTLR start rule__Sort__Group__1__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1803:1: rule__Sort__Group__1__Impl : ( ( rule__Sort__NameAssignment_1 ) ) ;
    public final void rule__Sort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1807:1: ( ( ( rule__Sort__NameAssignment_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1808:1: ( ( rule__Sort__NameAssignment_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1808:1: ( ( rule__Sort__NameAssignment_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1809:1: ( rule__Sort__NameAssignment_1 )
            {
             before(grammarAccess.getSortAccess().getNameAssignment_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1810:1: ( rule__Sort__NameAssignment_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1810:2: rule__Sort__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Sort__NameAssignment_1_in_rule__Sort__Group__1__Impl3711);
            rule__Sort__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getSortAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Sort__Group__1__Impl


    // $ANTLR start rule__Import__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1824:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1828:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1829:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__03745);
            rule__Import__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__03748);
            rule__Import__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Import__Group__0


    // $ANTLR start rule__Import__Group__0__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1836:1: rule__Import__Group__0__Impl : ( 'load' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1840:1: ( ( 'load' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1841:1: ( 'load' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1841:1: ( 'load' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1842:1: 'load'
            {
             before(grammarAccess.getImportAccess().getLoadKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__Import__Group__0__Impl3776); 
             after(grammarAccess.getImportAccess().getLoadKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Import__Group__0__Impl


    // $ANTLR start rule__Import__Group__1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1855:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1859:1: ( rule__Import__Group__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1860:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__13807);
            rule__Import__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Import__Group__1


    // $ANTLR start rule__Import__Group__1__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1866:1: rule__Import__Group__1__Impl : ( ( rule__Import__PathAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1870:1: ( ( ( rule__Import__PathAssignment_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1871:1: ( ( rule__Import__PathAssignment_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1871:1: ( ( rule__Import__PathAssignment_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1872:1: ( rule__Import__PathAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getPathAssignment_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1873:1: ( rule__Import__PathAssignment_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1873:2: rule__Import__PathAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__PathAssignment_1_in_rule__Import__Group__1__Impl3834);
            rule__Import__PathAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getImportAccess().getPathAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Import__Group__1__Impl


    // $ANTLR start rule__Var__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1887:1: rule__Var__Group__0 : rule__Var__Group__0__Impl rule__Var__Group__1 ;
    public final void rule__Var__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1891:1: ( rule__Var__Group__0__Impl rule__Var__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1892:2: rule__Var__Group__0__Impl rule__Var__Group__1
            {
            pushFollow(FOLLOW_rule__Var__Group__0__Impl_in_rule__Var__Group__03868);
            rule__Var__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Var__Group__1_in_rule__Var__Group__03871);
            rule__Var__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Var__Group__0


    // $ANTLR start rule__Var__Group__0__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1899:1: rule__Var__Group__0__Impl : ( 'range' ) ;
    public final void rule__Var__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1903:1: ( ( 'range' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1904:1: ( 'range' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1904:1: ( 'range' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1905:1: 'range'
            {
             before(grammarAccess.getVarAccess().getRangeKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__Var__Group__0__Impl3899); 
             after(grammarAccess.getVarAccess().getRangeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Var__Group__0__Impl


    // $ANTLR start rule__Var__Group__1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1918:1: rule__Var__Group__1 : rule__Var__Group__1__Impl rule__Var__Group__2 ;
    public final void rule__Var__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1922:1: ( rule__Var__Group__1__Impl rule__Var__Group__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1923:2: rule__Var__Group__1__Impl rule__Var__Group__2
            {
            pushFollow(FOLLOW_rule__Var__Group__1__Impl_in_rule__Var__Group__13930);
            rule__Var__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Var__Group__2_in_rule__Var__Group__13933);
            rule__Var__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Var__Group__1


    // $ANTLR start rule__Var__Group__1__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1930:1: rule__Var__Group__1__Impl : ( ( rule__Var__NameAssignment_1 ) ) ;
    public final void rule__Var__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1934:1: ( ( ( rule__Var__NameAssignment_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1935:1: ( ( rule__Var__NameAssignment_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1935:1: ( ( rule__Var__NameAssignment_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1936:1: ( rule__Var__NameAssignment_1 )
            {
             before(grammarAccess.getVarAccess().getNameAssignment_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1937:1: ( rule__Var__NameAssignment_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1937:2: rule__Var__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Var__NameAssignment_1_in_rule__Var__Group__1__Impl3960);
            rule__Var__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getVarAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Var__Group__1__Impl


    // $ANTLR start rule__Var__Group__2
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1947:1: rule__Var__Group__2 : rule__Var__Group__2__Impl rule__Var__Group__3 ;
    public final void rule__Var__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1951:1: ( rule__Var__Group__2__Impl rule__Var__Group__3 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1952:2: rule__Var__Group__2__Impl rule__Var__Group__3
            {
            pushFollow(FOLLOW_rule__Var__Group__2__Impl_in_rule__Var__Group__23990);
            rule__Var__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Var__Group__3_in_rule__Var__Group__23993);
            rule__Var__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Var__Group__2


    // $ANTLR start rule__Var__Group__2__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1959:1: rule__Var__Group__2__Impl : ( ( rule__Var__MinAssignment_2 ) ) ;
    public final void rule__Var__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1963:1: ( ( ( rule__Var__MinAssignment_2 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1964:1: ( ( rule__Var__MinAssignment_2 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1964:1: ( ( rule__Var__MinAssignment_2 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1965:1: ( rule__Var__MinAssignment_2 )
            {
             before(grammarAccess.getVarAccess().getMinAssignment_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1966:1: ( rule__Var__MinAssignment_2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1966:2: rule__Var__MinAssignment_2
            {
            pushFollow(FOLLOW_rule__Var__MinAssignment_2_in_rule__Var__Group__2__Impl4020);
            rule__Var__MinAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getVarAccess().getMinAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Var__Group__2__Impl


    // $ANTLR start rule__Var__Group__3
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1976:1: rule__Var__Group__3 : rule__Var__Group__3__Impl ;
    public final void rule__Var__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1980:1: ( rule__Var__Group__3__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1981:2: rule__Var__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Var__Group__3__Impl_in_rule__Var__Group__34050);
            rule__Var__Group__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Var__Group__3


    // $ANTLR start rule__Var__Group__3__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1987:1: rule__Var__Group__3__Impl : ( ( rule__Var__MaxAssignment_3 ) ) ;
    public final void rule__Var__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1991:1: ( ( ( rule__Var__MaxAssignment_3 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1992:1: ( ( rule__Var__MaxAssignment_3 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1992:1: ( ( rule__Var__MaxAssignment_3 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1993:1: ( rule__Var__MaxAssignment_3 )
            {
             before(grammarAccess.getVarAccess().getMaxAssignment_3()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1994:1: ( rule__Var__MaxAssignment_3 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1994:2: rule__Var__MaxAssignment_3
            {
            pushFollow(FOLLOW_rule__Var__MaxAssignment_3_in_rule__Var__Group__3__Impl4077);
            rule__Var__MaxAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getVarAccess().getMaxAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Var__Group__3__Impl


    // $ANTLR start rule__Fluent__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2012:1: rule__Fluent__Group__0 : rule__Fluent__Group__0__Impl rule__Fluent__Group__1 ;
    public final void rule__Fluent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2016:1: ( rule__Fluent__Group__0__Impl rule__Fluent__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2017:2: rule__Fluent__Group__0__Impl rule__Fluent__Group__1
            {
            pushFollow(FOLLOW_rule__Fluent__Group__0__Impl_in_rule__Fluent__Group__04115);
            rule__Fluent__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Fluent__Group__1_in_rule__Fluent__Group__04118);
            rule__Fluent__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fluent__Group__0


    // $ANTLR start rule__Fluent__Group__0__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2024:1: rule__Fluent__Group__0__Impl : ( 'fluent' ) ;
    public final void rule__Fluent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2028:1: ( ( 'fluent' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2029:1: ( 'fluent' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2029:1: ( 'fluent' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2030:1: 'fluent'
            {
             before(grammarAccess.getFluentAccess().getFluentKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__Fluent__Group__0__Impl4146); 
             after(grammarAccess.getFluentAccess().getFluentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fluent__Group__0__Impl


    // $ANTLR start rule__Fluent__Group__1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2043:1: rule__Fluent__Group__1 : rule__Fluent__Group__1__Impl ;
    public final void rule__Fluent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2047:1: ( rule__Fluent__Group__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2048:2: rule__Fluent__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Fluent__Group__1__Impl_in_rule__Fluent__Group__14177);
            rule__Fluent__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fluent__Group__1


    // $ANTLR start rule__Fluent__Group__1__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2054:1: rule__Fluent__Group__1__Impl : ( ( rule__Fluent__TermAssignment_1 ) ) ;
    public final void rule__Fluent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2058:1: ( ( ( rule__Fluent__TermAssignment_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2059:1: ( ( rule__Fluent__TermAssignment_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2059:1: ( ( rule__Fluent__TermAssignment_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2060:1: ( rule__Fluent__TermAssignment_1 )
            {
             before(grammarAccess.getFluentAccess().getTermAssignment_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2061:1: ( rule__Fluent__TermAssignment_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2061:2: rule__Fluent__TermAssignment_1
            {
            pushFollow(FOLLOW_rule__Fluent__TermAssignment_1_in_rule__Fluent__Group__1__Impl4204);
            rule__Fluent__TermAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getFluentAccess().getTermAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fluent__Group__1__Impl


    // $ANTLR start rule__Event__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2075:1: rule__Event__Group__0 : rule__Event__Group__0__Impl rule__Event__Group__1 ;
    public final void rule__Event__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2079:1: ( rule__Event__Group__0__Impl rule__Event__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2080:2: rule__Event__Group__0__Impl rule__Event__Group__1
            {
            pushFollow(FOLLOW_rule__Event__Group__0__Impl_in_rule__Event__Group__04238);
            rule__Event__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Event__Group__1_in_rule__Event__Group__04241);
            rule__Event__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Event__Group__0


    // $ANTLR start rule__Event__Group__0__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2087:1: rule__Event__Group__0__Impl : ( 'event' ) ;
    public final void rule__Event__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2091:1: ( ( 'event' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2092:1: ( 'event' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2092:1: ( 'event' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2093:1: 'event'
            {
             before(grammarAccess.getEventAccess().getEventKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__Event__Group__0__Impl4269); 
             after(grammarAccess.getEventAccess().getEventKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Event__Group__0__Impl


    // $ANTLR start rule__Event__Group__1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2106:1: rule__Event__Group__1 : rule__Event__Group__1__Impl ;
    public final void rule__Event__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2110:1: ( rule__Event__Group__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2111:2: rule__Event__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Event__Group__1__Impl_in_rule__Event__Group__14300);
            rule__Event__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Event__Group__1


    // $ANTLR start rule__Event__Group__1__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2117:1: rule__Event__Group__1__Impl : ( ( rule__Event__TermAssignment_1 ) ) ;
    public final void rule__Event__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2121:1: ( ( ( rule__Event__TermAssignment_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2122:1: ( ( rule__Event__TermAssignment_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2122:1: ( ( rule__Event__TermAssignment_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2123:1: ( rule__Event__TermAssignment_1 )
            {
             before(grammarAccess.getEventAccess().getTermAssignment_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2124:1: ( rule__Event__TermAssignment_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2124:2: rule__Event__TermAssignment_1
            {
            pushFollow(FOLLOW_rule__Event__TermAssignment_1_in_rule__Event__Group__1__Impl4327);
            rule__Event__TermAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getEventAccess().getTermAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Event__Group__1__Impl


    // $ANTLR start rule__Term__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2138:1: rule__Term__Group__0 : rule__Term__Group__0__Impl rule__Term__Group__1 ;
    public final void rule__Term__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2142:1: ( rule__Term__Group__0__Impl rule__Term__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2143:2: rule__Term__Group__0__Impl rule__Term__Group__1
            {
            pushFollow(FOLLOW_rule__Term__Group__0__Impl_in_rule__Term__Group__04361);
            rule__Term__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Term__Group__1_in_rule__Term__Group__04364);
            rule__Term__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Term__Group__0


    // $ANTLR start rule__Term__Group__0__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2150:1: rule__Term__Group__0__Impl : ( ( rule__Term__NameAssignment_0 ) ) ;
    public final void rule__Term__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2154:1: ( ( ( rule__Term__NameAssignment_0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2155:1: ( ( rule__Term__NameAssignment_0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2155:1: ( ( rule__Term__NameAssignment_0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2156:1: ( rule__Term__NameAssignment_0 )
            {
             before(grammarAccess.getTermAccess().getNameAssignment_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2157:1: ( rule__Term__NameAssignment_0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2157:2: rule__Term__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Term__NameAssignment_0_in_rule__Term__Group__0__Impl4391);
            rule__Term__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getTermAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Term__Group__0__Impl


    // $ANTLR start rule__Term__Group__1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2167:1: rule__Term__Group__1 : rule__Term__Group__1__Impl ;
    public final void rule__Term__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2171:1: ( rule__Term__Group__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2172:2: rule__Term__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Term__Group__1__Impl_in_rule__Term__Group__14421);
            rule__Term__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Term__Group__1


    // $ANTLR start rule__Term__Group__1__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2178:1: rule__Term__Group__1__Impl : ( ( rule__Term__Group_1__0 )? ) ;
    public final void rule__Term__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2182:1: ( ( ( rule__Term__Group_1__0 )? ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2183:1: ( ( rule__Term__Group_1__0 )? )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2183:1: ( ( rule__Term__Group_1__0 )? )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2184:1: ( rule__Term__Group_1__0 )?
            {
             before(grammarAccess.getTermAccess().getGroup_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2185:1: ( rule__Term__Group_1__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==22) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==RULE_ID||LA15_1==21||LA15_1==23) ) {
                    alt15=1;
                }
            }
            switch (alt15) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2185:2: rule__Term__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Term__Group_1__0_in_rule__Term__Group__1__Impl4448);
                    rule__Term__Group_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTermAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Term__Group__1__Impl


    // $ANTLR start rule__Term__Group_1__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2199:1: rule__Term__Group_1__0 : rule__Term__Group_1__0__Impl rule__Term__Group_1__1 ;
    public final void rule__Term__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2203:1: ( rule__Term__Group_1__0__Impl rule__Term__Group_1__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2204:2: rule__Term__Group_1__0__Impl rule__Term__Group_1__1
            {
            pushFollow(FOLLOW_rule__Term__Group_1__0__Impl_in_rule__Term__Group_1__04483);
            rule__Term__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Term__Group_1__1_in_rule__Term__Group_1__04486);
            rule__Term__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Term__Group_1__0


    // $ANTLR start rule__Term__Group_1__0__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2211:1: rule__Term__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Term__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2215:1: ( ( '(' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2216:1: ( '(' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2216:1: ( '(' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2217:1: '('
            {
             before(grammarAccess.getTermAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,22,FOLLOW_22_in_rule__Term__Group_1__0__Impl4514); 
             after(grammarAccess.getTermAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Term__Group_1__0__Impl


    // $ANTLR start rule__Term__Group_1__1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2230:1: rule__Term__Group_1__1 : rule__Term__Group_1__1__Impl rule__Term__Group_1__2 ;
    public final void rule__Term__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2234:1: ( rule__Term__Group_1__1__Impl rule__Term__Group_1__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2235:2: rule__Term__Group_1__1__Impl rule__Term__Group_1__2
            {
            pushFollow(FOLLOW_rule__Term__Group_1__1__Impl_in_rule__Term__Group_1__14545);
            rule__Term__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Term__Group_1__2_in_rule__Term__Group_1__14548);
            rule__Term__Group_1__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Term__Group_1__1


    // $ANTLR start rule__Term__Group_1__1__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2242:1: rule__Term__Group_1__1__Impl : ( ( rule__Term__ArgsAssignment_1_1 )? ) ;
    public final void rule__Term__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2246:1: ( ( ( rule__Term__ArgsAssignment_1_1 )? ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2247:1: ( ( rule__Term__ArgsAssignment_1_1 )? )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2247:1: ( ( rule__Term__ArgsAssignment_1_1 )? )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2248:1: ( rule__Term__ArgsAssignment_1_1 )?
            {
             before(grammarAccess.getTermAccess().getArgsAssignment_1_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2249:1: ( rule__Term__ArgsAssignment_1_1 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2249:2: rule__Term__ArgsAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__Term__ArgsAssignment_1_1_in_rule__Term__Group_1__1__Impl4575);
                    rule__Term__ArgsAssignment_1_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTermAccess().getArgsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Term__Group_1__1__Impl


    // $ANTLR start rule__Term__Group_1__2
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2259:1: rule__Term__Group_1__2 : rule__Term__Group_1__2__Impl rule__Term__Group_1__3 ;
    public final void rule__Term__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2263:1: ( rule__Term__Group_1__2__Impl rule__Term__Group_1__3 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2264:2: rule__Term__Group_1__2__Impl rule__Term__Group_1__3
            {
            pushFollow(FOLLOW_rule__Term__Group_1__2__Impl_in_rule__Term__Group_1__24606);
            rule__Term__Group_1__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Term__Group_1__3_in_rule__Term__Group_1__24609);
            rule__Term__Group_1__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Term__Group_1__2


    // $ANTLR start rule__Term__Group_1__2__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2271:1: rule__Term__Group_1__2__Impl : ( ( rule__Term__Group_1_2__0 )* ) ;
    public final void rule__Term__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2275:1: ( ( ( rule__Term__Group_1_2__0 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2276:1: ( ( rule__Term__Group_1_2__0 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2276:1: ( ( rule__Term__Group_1_2__0 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2277:1: ( rule__Term__Group_1_2__0 )*
            {
             before(grammarAccess.getTermAccess().getGroup_1_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2278:1: ( rule__Term__Group_1_2__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==21) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2278:2: rule__Term__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Term__Group_1_2__0_in_rule__Term__Group_1__2__Impl4636);
            	    rule__Term__Group_1_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getTermAccess().getGroup_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Term__Group_1__2__Impl


    // $ANTLR start rule__Term__Group_1__3
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2288:1: rule__Term__Group_1__3 : rule__Term__Group_1__3__Impl ;
    public final void rule__Term__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2292:1: ( rule__Term__Group_1__3__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2293:2: rule__Term__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__Term__Group_1__3__Impl_in_rule__Term__Group_1__34667);
            rule__Term__Group_1__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Term__Group_1__3


    // $ANTLR start rule__Term__Group_1__3__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2299:1: rule__Term__Group_1__3__Impl : ( ')' ) ;
    public final void rule__Term__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2303:1: ( ( ')' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2304:1: ( ')' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2304:1: ( ')' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2305:1: ')'
            {
             before(grammarAccess.getTermAccess().getRightParenthesisKeyword_1_3()); 
            match(input,23,FOLLOW_23_in_rule__Term__Group_1__3__Impl4695); 
             after(grammarAccess.getTermAccess().getRightParenthesisKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Term__Group_1__3__Impl


    // $ANTLR start rule__Term__Group_1_2__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2326:1: rule__Term__Group_1_2__0 : rule__Term__Group_1_2__0__Impl rule__Term__Group_1_2__1 ;
    public final void rule__Term__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2330:1: ( rule__Term__Group_1_2__0__Impl rule__Term__Group_1_2__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2331:2: rule__Term__Group_1_2__0__Impl rule__Term__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__Term__Group_1_2__0__Impl_in_rule__Term__Group_1_2__04734);
            rule__Term__Group_1_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Term__Group_1_2__1_in_rule__Term__Group_1_2__04737);
            rule__Term__Group_1_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Term__Group_1_2__0


    // $ANTLR start rule__Term__Group_1_2__0__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2338:1: rule__Term__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__Term__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2342:1: ( ( ',' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2343:1: ( ',' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2343:1: ( ',' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2344:1: ','
            {
             before(grammarAccess.getTermAccess().getCommaKeyword_1_2_0()); 
            match(input,21,FOLLOW_21_in_rule__Term__Group_1_2__0__Impl4765); 
             after(grammarAccess.getTermAccess().getCommaKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Term__Group_1_2__0__Impl


    // $ANTLR start rule__Term__Group_1_2__1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2357:1: rule__Term__Group_1_2__1 : rule__Term__Group_1_2__1__Impl ;
    public final void rule__Term__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2361:1: ( rule__Term__Group_1_2__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2362:2: rule__Term__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Term__Group_1_2__1__Impl_in_rule__Term__Group_1_2__14796);
            rule__Term__Group_1_2__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Term__Group_1_2__1


    // $ANTLR start rule__Term__Group_1_2__1__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2368:1: rule__Term__Group_1_2__1__Impl : ( ( rule__Term__ArgsAssignment_1_2_1 ) ) ;
    public final void rule__Term__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2372:1: ( ( ( rule__Term__ArgsAssignment_1_2_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2373:1: ( ( rule__Term__ArgsAssignment_1_2_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2373:1: ( ( rule__Term__ArgsAssignment_1_2_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2374:1: ( rule__Term__ArgsAssignment_1_2_1 )
            {
             before(grammarAccess.getTermAccess().getArgsAssignment_1_2_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2375:1: ( rule__Term__ArgsAssignment_1_2_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2375:2: rule__Term__ArgsAssignment_1_2_1
            {
            pushFollow(FOLLOW_rule__Term__ArgsAssignment_1_2_1_in_rule__Term__Group_1_2__1__Impl4823);
            rule__Term__ArgsAssignment_1_2_1();
            _fsp--;


            }

             after(grammarAccess.getTermAccess().getArgsAssignment_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Term__Group_1_2__1__Impl


    // $ANTLR start rule__HoldsAt__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2389:1: rule__HoldsAt__Group__0 : rule__HoldsAt__Group__0__Impl rule__HoldsAt__Group__1 ;
    public final void rule__HoldsAt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2393:1: ( rule__HoldsAt__Group__0__Impl rule__HoldsAt__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2394:2: rule__HoldsAt__Group__0__Impl rule__HoldsAt__Group__1
            {
            pushFollow(FOLLOW_rule__HoldsAt__Group__0__Impl_in_rule__HoldsAt__Group__04857);
            rule__HoldsAt__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__HoldsAt__Group__1_in_rule__HoldsAt__Group__04860);
            rule__HoldsAt__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__HoldsAt__Group__0


    // $ANTLR start rule__HoldsAt__Group__0__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2401:1: rule__HoldsAt__Group__0__Impl : ( 'HoldsAt' ) ;
    public final void rule__HoldsAt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2405:1: ( ( 'HoldsAt' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2406:1: ( 'HoldsAt' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2406:1: ( 'HoldsAt' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2407:1: 'HoldsAt'
            {
             before(grammarAccess.getHoldsAtAccess().getHoldsAtKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__HoldsAt__Group__0__Impl4888); 
             after(grammarAccess.getHoldsAtAccess().getHoldsAtKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__HoldsAt__Group__0__Impl


    // $ANTLR start rule__HoldsAt__Group__1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2420:1: rule__HoldsAt__Group__1 : rule__HoldsAt__Group__1__Impl rule__HoldsAt__Group__2 ;
    public final void rule__HoldsAt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2424:1: ( rule__HoldsAt__Group__1__Impl rule__HoldsAt__Group__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2425:2: rule__HoldsAt__Group__1__Impl rule__HoldsAt__Group__2
            {
            pushFollow(FOLLOW_rule__HoldsAt__Group__1__Impl_in_rule__HoldsAt__Group__14919);
            rule__HoldsAt__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__HoldsAt__Group__2_in_rule__HoldsAt__Group__14922);
            rule__HoldsAt__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__HoldsAt__Group__1


    // $ANTLR start rule__HoldsAt__Group__1__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2432:1: rule__HoldsAt__Group__1__Impl : ( '(' ) ;
    public final void rule__HoldsAt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2436:1: ( ( '(' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2437:1: ( '(' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2437:1: ( '(' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2438:1: '('
            {
             before(grammarAccess.getHoldsAtAccess().getLeftParenthesisKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__HoldsAt__Group__1__Impl4950); 
             after(grammarAccess.getHoldsAtAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__HoldsAt__Group__1__Impl


    // $ANTLR start rule__HoldsAt__Group__2
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2451:1: rule__HoldsAt__Group__2 : rule__HoldsAt__Group__2__Impl rule__HoldsAt__Group__3 ;
    public final void rule__HoldsAt__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2455:1: ( rule__HoldsAt__Group__2__Impl rule__HoldsAt__Group__3 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2456:2: rule__HoldsAt__Group__2__Impl rule__HoldsAt__Group__3
            {
            pushFollow(FOLLOW_rule__HoldsAt__Group__2__Impl_in_rule__HoldsAt__Group__24981);
            rule__HoldsAt__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__HoldsAt__Group__3_in_rule__HoldsAt__Group__24984);
            rule__HoldsAt__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__HoldsAt__Group__2


    // $ANTLR start rule__HoldsAt__Group__2__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2463:1: rule__HoldsAt__Group__2__Impl : ( ( rule__HoldsAt__FluentAssignment_2 ) ) ;
    public final void rule__HoldsAt__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2467:1: ( ( ( rule__HoldsAt__FluentAssignment_2 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2468:1: ( ( rule__HoldsAt__FluentAssignment_2 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2468:1: ( ( rule__HoldsAt__FluentAssignment_2 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2469:1: ( rule__HoldsAt__FluentAssignment_2 )
            {
             before(grammarAccess.getHoldsAtAccess().getFluentAssignment_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2470:1: ( rule__HoldsAt__FluentAssignment_2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2470:2: rule__HoldsAt__FluentAssignment_2
            {
            pushFollow(FOLLOW_rule__HoldsAt__FluentAssignment_2_in_rule__HoldsAt__Group__2__Impl5011);
            rule__HoldsAt__FluentAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getHoldsAtAccess().getFluentAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__HoldsAt__Group__2__Impl


    // $ANTLR start rule__HoldsAt__Group__3
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2480:1: rule__HoldsAt__Group__3 : rule__HoldsAt__Group__3__Impl rule__HoldsAt__Group__4 ;
    public final void rule__HoldsAt__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2484:1: ( rule__HoldsAt__Group__3__Impl rule__HoldsAt__Group__4 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2485:2: rule__HoldsAt__Group__3__Impl rule__HoldsAt__Group__4
            {
            pushFollow(FOLLOW_rule__HoldsAt__Group__3__Impl_in_rule__HoldsAt__Group__35041);
            rule__HoldsAt__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__HoldsAt__Group__4_in_rule__HoldsAt__Group__35044);
            rule__HoldsAt__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__HoldsAt__Group__3


    // $ANTLR start rule__HoldsAt__Group__3__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2492:1: rule__HoldsAt__Group__3__Impl : ( ( rule__HoldsAt__Group_3__0 )? ) ;
    public final void rule__HoldsAt__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2496:1: ( ( ( rule__HoldsAt__Group_3__0 )? ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2497:1: ( ( rule__HoldsAt__Group_3__0 )? )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2497:1: ( ( rule__HoldsAt__Group_3__0 )? )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2498:1: ( rule__HoldsAt__Group_3__0 )?
            {
             before(grammarAccess.getHoldsAtAccess().getGroup_3()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2499:1: ( rule__HoldsAt__Group_3__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==22) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2499:2: rule__HoldsAt__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__HoldsAt__Group_3__0_in_rule__HoldsAt__Group__3__Impl5071);
                    rule__HoldsAt__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHoldsAtAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__HoldsAt__Group__3__Impl


    // $ANTLR start rule__HoldsAt__Group__4
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2509:1: rule__HoldsAt__Group__4 : rule__HoldsAt__Group__4__Impl rule__HoldsAt__Group__5 ;
    public final void rule__HoldsAt__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2513:1: ( rule__HoldsAt__Group__4__Impl rule__HoldsAt__Group__5 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2514:2: rule__HoldsAt__Group__4__Impl rule__HoldsAt__Group__5
            {
            pushFollow(FOLLOW_rule__HoldsAt__Group__4__Impl_in_rule__HoldsAt__Group__45102);
            rule__HoldsAt__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__HoldsAt__Group__5_in_rule__HoldsAt__Group__45105);
            rule__HoldsAt__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__HoldsAt__Group__4


    // $ANTLR start rule__HoldsAt__Group__4__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2521:1: rule__HoldsAt__Group__4__Impl : ( ',' ) ;
    public final void rule__HoldsAt__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2525:1: ( ( ',' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2526:1: ( ',' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2526:1: ( ',' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2527:1: ','
            {
             before(grammarAccess.getHoldsAtAccess().getCommaKeyword_4()); 
            match(input,21,FOLLOW_21_in_rule__HoldsAt__Group__4__Impl5133); 
             after(grammarAccess.getHoldsAtAccess().getCommaKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__HoldsAt__Group__4__Impl


    // $ANTLR start rule__HoldsAt__Group__5
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2540:1: rule__HoldsAt__Group__5 : rule__HoldsAt__Group__5__Impl rule__HoldsAt__Group__6 ;
    public final void rule__HoldsAt__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2544:1: ( rule__HoldsAt__Group__5__Impl rule__HoldsAt__Group__6 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2545:2: rule__HoldsAt__Group__5__Impl rule__HoldsAt__Group__6
            {
            pushFollow(FOLLOW_rule__HoldsAt__Group__5__Impl_in_rule__HoldsAt__Group__55164);
            rule__HoldsAt__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__HoldsAt__Group__6_in_rule__HoldsAt__Group__55167);
            rule__HoldsAt__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__HoldsAt__Group__5


    // $ANTLR start rule__HoldsAt__Group__5__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2552:1: rule__HoldsAt__Group__5__Impl : ( ( rule__HoldsAt__TimeAssignment_5 ) ) ;
    public final void rule__HoldsAt__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2556:1: ( ( ( rule__HoldsAt__TimeAssignment_5 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2557:1: ( ( rule__HoldsAt__TimeAssignment_5 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2557:1: ( ( rule__HoldsAt__TimeAssignment_5 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2558:1: ( rule__HoldsAt__TimeAssignment_5 )
            {
             before(grammarAccess.getHoldsAtAccess().getTimeAssignment_5()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2559:1: ( rule__HoldsAt__TimeAssignment_5 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2559:2: rule__HoldsAt__TimeAssignment_5
            {
            pushFollow(FOLLOW_rule__HoldsAt__TimeAssignment_5_in_rule__HoldsAt__Group__5__Impl5194);
            rule__HoldsAt__TimeAssignment_5();
            _fsp--;


            }

             after(grammarAccess.getHoldsAtAccess().getTimeAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__HoldsAt__Group__5__Impl


    // $ANTLR start rule__HoldsAt__Group__6
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2569:1: rule__HoldsAt__Group__6 : rule__HoldsAt__Group__6__Impl ;
    public final void rule__HoldsAt__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2573:1: ( rule__HoldsAt__Group__6__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2574:2: rule__HoldsAt__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__HoldsAt__Group__6__Impl_in_rule__HoldsAt__Group__65224);
            rule__HoldsAt__Group__6__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__HoldsAt__Group__6


    // $ANTLR start rule__HoldsAt__Group__6__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2580:1: rule__HoldsAt__Group__6__Impl : ( ')' ) ;
    public final void rule__HoldsAt__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2584:1: ( ( ')' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2585:1: ( ')' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2585:1: ( ')' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2586:1: ')'
            {
             before(grammarAccess.getHoldsAtAccess().getRightParenthesisKeyword_6()); 
            match(input,23,FOLLOW_23_in_rule__HoldsAt__Group__6__Impl5252); 
             after(grammarAccess.getHoldsAtAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__HoldsAt__Group__6__Impl


    // $ANTLR start rule__HoldsAt__Group_3__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2613:1: rule__HoldsAt__Group_3__0 : rule__HoldsAt__Group_3__0__Impl rule__HoldsAt__Group_3__1 ;
    public final void rule__HoldsAt__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2617:1: ( rule__HoldsAt__Group_3__0__Impl rule__HoldsAt__Group_3__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2618:2: rule__HoldsAt__Group_3__0__Impl rule__HoldsAt__Group_3__1
            {
            pushFollow(FOLLOW_rule__HoldsAt__Group_3__0__Impl_in_rule__HoldsAt__Group_3__05297);
            rule__HoldsAt__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__HoldsAt__Group_3__1_in_rule__HoldsAt__Group_3__05300);
            rule__HoldsAt__Group_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__HoldsAt__Group_3__0


    // $ANTLR start rule__HoldsAt__Group_3__0__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2625:1: rule__HoldsAt__Group_3__0__Impl : ( '(' ) ;
    public final void rule__HoldsAt__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2629:1: ( ( '(' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2630:1: ( '(' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2630:1: ( '(' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2631:1: '('
            {
             before(grammarAccess.getHoldsAtAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,22,FOLLOW_22_in_rule__HoldsAt__Group_3__0__Impl5328); 
             after(grammarAccess.getHoldsAtAccess().getLeftParenthesisKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__HoldsAt__Group_3__0__Impl


    // $ANTLR start rule__HoldsAt__Group_3__1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2644:1: rule__HoldsAt__Group_3__1 : rule__HoldsAt__Group_3__1__Impl rule__HoldsAt__Group_3__2 ;
    public final void rule__HoldsAt__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2648:1: ( rule__HoldsAt__Group_3__1__Impl rule__HoldsAt__Group_3__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2649:2: rule__HoldsAt__Group_3__1__Impl rule__HoldsAt__Group_3__2
            {
            pushFollow(FOLLOW_rule__HoldsAt__Group_3__1__Impl_in_rule__HoldsAt__Group_3__15359);
            rule__HoldsAt__Group_3__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__HoldsAt__Group_3__2_in_rule__HoldsAt__Group_3__15362);
            rule__HoldsAt__Group_3__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__HoldsAt__Group_3__1


    // $ANTLR start rule__HoldsAt__Group_3__1__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2656:1: rule__HoldsAt__Group_3__1__Impl : ( ( rule__HoldsAt__ArgsAssignment_3_1 )? ) ;
    public final void rule__HoldsAt__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2660:1: ( ( ( rule__HoldsAt__ArgsAssignment_3_1 )? ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2661:1: ( ( rule__HoldsAt__ArgsAssignment_3_1 )? )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2661:1: ( ( rule__HoldsAt__ArgsAssignment_3_1 )? )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2662:1: ( rule__HoldsAt__ArgsAssignment_3_1 )?
            {
             before(grammarAccess.getHoldsAtAccess().getArgsAssignment_3_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2663:1: ( rule__HoldsAt__ArgsAssignment_3_1 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2663:2: rule__HoldsAt__ArgsAssignment_3_1
                    {
                    pushFollow(FOLLOW_rule__HoldsAt__ArgsAssignment_3_1_in_rule__HoldsAt__Group_3__1__Impl5389);
                    rule__HoldsAt__ArgsAssignment_3_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHoldsAtAccess().getArgsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__HoldsAt__Group_3__1__Impl


    // $ANTLR start rule__HoldsAt__Group_3__2
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2673:1: rule__HoldsAt__Group_3__2 : rule__HoldsAt__Group_3__2__Impl rule__HoldsAt__Group_3__3 ;
    public final void rule__HoldsAt__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2677:1: ( rule__HoldsAt__Group_3__2__Impl rule__HoldsAt__Group_3__3 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2678:2: rule__HoldsAt__Group_3__2__Impl rule__HoldsAt__Group_3__3
            {
            pushFollow(FOLLOW_rule__HoldsAt__Group_3__2__Impl_in_rule__HoldsAt__Group_3__25420);
            rule__HoldsAt__Group_3__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__HoldsAt__Group_3__3_in_rule__HoldsAt__Group_3__25423);
            rule__HoldsAt__Group_3__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__HoldsAt__Group_3__2


    // $ANTLR start rule__HoldsAt__Group_3__2__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2685:1: rule__HoldsAt__Group_3__2__Impl : ( ( rule__HoldsAt__Group_3_2__0 )* ) ;
    public final void rule__HoldsAt__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2689:1: ( ( ( rule__HoldsAt__Group_3_2__0 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2690:1: ( ( rule__HoldsAt__Group_3_2__0 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2690:1: ( ( rule__HoldsAt__Group_3_2__0 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2691:1: ( rule__HoldsAt__Group_3_2__0 )*
            {
             before(grammarAccess.getHoldsAtAccess().getGroup_3_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2692:1: ( rule__HoldsAt__Group_3_2__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==21) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2692:2: rule__HoldsAt__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_rule__HoldsAt__Group_3_2__0_in_rule__HoldsAt__Group_3__2__Impl5450);
            	    rule__HoldsAt__Group_3_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getHoldsAtAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__HoldsAt__Group_3__2__Impl


    // $ANTLR start rule__HoldsAt__Group_3__3
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2702:1: rule__HoldsAt__Group_3__3 : rule__HoldsAt__Group_3__3__Impl ;
    public final void rule__HoldsAt__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2706:1: ( rule__HoldsAt__Group_3__3__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2707:2: rule__HoldsAt__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__HoldsAt__Group_3__3__Impl_in_rule__HoldsAt__Group_3__35481);
            rule__HoldsAt__Group_3__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__HoldsAt__Group_3__3


    // $ANTLR start rule__HoldsAt__Group_3__3__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2713:1: rule__HoldsAt__Group_3__3__Impl : ( ')' ) ;
    public final void rule__HoldsAt__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2717:1: ( ( ')' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2718:1: ( ')' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2718:1: ( ')' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2719:1: ')'
            {
             before(grammarAccess.getHoldsAtAccess().getRightParenthesisKeyword_3_3()); 
            match(input,23,FOLLOW_23_in_rule__HoldsAt__Group_3__3__Impl5509); 
             after(grammarAccess.getHoldsAtAccess().getRightParenthesisKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__HoldsAt__Group_3__3__Impl


    // $ANTLR start rule__HoldsAt__Group_3_2__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2740:1: rule__HoldsAt__Group_3_2__0 : rule__HoldsAt__Group_3_2__0__Impl rule__HoldsAt__Group_3_2__1 ;
    public final void rule__HoldsAt__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2744:1: ( rule__HoldsAt__Group_3_2__0__Impl rule__HoldsAt__Group_3_2__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2745:2: rule__HoldsAt__Group_3_2__0__Impl rule__HoldsAt__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__HoldsAt__Group_3_2__0__Impl_in_rule__HoldsAt__Group_3_2__05548);
            rule__HoldsAt__Group_3_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__HoldsAt__Group_3_2__1_in_rule__HoldsAt__Group_3_2__05551);
            rule__HoldsAt__Group_3_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__HoldsAt__Group_3_2__0


    // $ANTLR start rule__HoldsAt__Group_3_2__0__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2752:1: rule__HoldsAt__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__HoldsAt__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2756:1: ( ( ',' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2757:1: ( ',' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2757:1: ( ',' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2758:1: ','
            {
             before(grammarAccess.getHoldsAtAccess().getCommaKeyword_3_2_0()); 
            match(input,21,FOLLOW_21_in_rule__HoldsAt__Group_3_2__0__Impl5579); 
             after(grammarAccess.getHoldsAtAccess().getCommaKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__HoldsAt__Group_3_2__0__Impl


    // $ANTLR start rule__HoldsAt__Group_3_2__1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2771:1: rule__HoldsAt__Group_3_2__1 : rule__HoldsAt__Group_3_2__1__Impl ;
    public final void rule__HoldsAt__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2775:1: ( rule__HoldsAt__Group_3_2__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2776:2: rule__HoldsAt__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__HoldsAt__Group_3_2__1__Impl_in_rule__HoldsAt__Group_3_2__15610);
            rule__HoldsAt__Group_3_2__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__HoldsAt__Group_3_2__1


    // $ANTLR start rule__HoldsAt__Group_3_2__1__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2782:1: rule__HoldsAt__Group_3_2__1__Impl : ( ( rule__HoldsAt__ArgsAssignment_3_2_1 ) ) ;
    public final void rule__HoldsAt__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2786:1: ( ( ( rule__HoldsAt__ArgsAssignment_3_2_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2787:1: ( ( rule__HoldsAt__ArgsAssignment_3_2_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2787:1: ( ( rule__HoldsAt__ArgsAssignment_3_2_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2788:1: ( rule__HoldsAt__ArgsAssignment_3_2_1 )
            {
             before(grammarAccess.getHoldsAtAccess().getArgsAssignment_3_2_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2789:1: ( rule__HoldsAt__ArgsAssignment_3_2_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2789:2: rule__HoldsAt__ArgsAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__HoldsAt__ArgsAssignment_3_2_1_in_rule__HoldsAt__Group_3_2__1__Impl5637);
            rule__HoldsAt__ArgsAssignment_3_2_1();
            _fsp--;


            }

             after(grammarAccess.getHoldsAtAccess().getArgsAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__HoldsAt__Group_3_2__1__Impl


    // $ANTLR start rule__Happens__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2803:1: rule__Happens__Group__0 : rule__Happens__Group__0__Impl rule__Happens__Group__1 ;
    public final void rule__Happens__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2807:1: ( rule__Happens__Group__0__Impl rule__Happens__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2808:2: rule__Happens__Group__0__Impl rule__Happens__Group__1
            {
            pushFollow(FOLLOW_rule__Happens__Group__0__Impl_in_rule__Happens__Group__05671);
            rule__Happens__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Happens__Group__1_in_rule__Happens__Group__05674);
            rule__Happens__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Happens__Group__0


    // $ANTLR start rule__Happens__Group__0__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2815:1: rule__Happens__Group__0__Impl : ( 'Happens' ) ;
    public final void rule__Happens__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2819:1: ( ( 'Happens' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2820:1: ( 'Happens' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2820:1: ( 'Happens' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2821:1: 'Happens'
            {
             before(grammarAccess.getHappensAccess().getHappensKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__Happens__Group__0__Impl5702); 
             after(grammarAccess.getHappensAccess().getHappensKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Happens__Group__0__Impl


    // $ANTLR start rule__Happens__Group__1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2834:1: rule__Happens__Group__1 : rule__Happens__Group__1__Impl rule__Happens__Group__2 ;
    public final void rule__Happens__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2838:1: ( rule__Happens__Group__1__Impl rule__Happens__Group__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2839:2: rule__Happens__Group__1__Impl rule__Happens__Group__2
            {
            pushFollow(FOLLOW_rule__Happens__Group__1__Impl_in_rule__Happens__Group__15733);
            rule__Happens__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Happens__Group__2_in_rule__Happens__Group__15736);
            rule__Happens__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Happens__Group__1


    // $ANTLR start rule__Happens__Group__1__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2846:1: rule__Happens__Group__1__Impl : ( '(' ) ;
    public final void rule__Happens__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2850:1: ( ( '(' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2851:1: ( '(' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2851:1: ( '(' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2852:1: '('
            {
             before(grammarAccess.getHappensAccess().getLeftParenthesisKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__Happens__Group__1__Impl5764); 
             after(grammarAccess.getHappensAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Happens__Group__1__Impl


    // $ANTLR start rule__Happens__Group__2
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2865:1: rule__Happens__Group__2 : rule__Happens__Group__2__Impl rule__Happens__Group__3 ;
    public final void rule__Happens__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2869:1: ( rule__Happens__Group__2__Impl rule__Happens__Group__3 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2870:2: rule__Happens__Group__2__Impl rule__Happens__Group__3
            {
            pushFollow(FOLLOW_rule__Happens__Group__2__Impl_in_rule__Happens__Group__25795);
            rule__Happens__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Happens__Group__3_in_rule__Happens__Group__25798);
            rule__Happens__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Happens__Group__2


    // $ANTLR start rule__Happens__Group__2__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2877:1: rule__Happens__Group__2__Impl : ( ( rule__Happens__EventAssignment_2 ) ) ;
    public final void rule__Happens__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2881:1: ( ( ( rule__Happens__EventAssignment_2 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2882:1: ( ( rule__Happens__EventAssignment_2 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2882:1: ( ( rule__Happens__EventAssignment_2 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2883:1: ( rule__Happens__EventAssignment_2 )
            {
             before(grammarAccess.getHappensAccess().getEventAssignment_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2884:1: ( rule__Happens__EventAssignment_2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2884:2: rule__Happens__EventAssignment_2
            {
            pushFollow(FOLLOW_rule__Happens__EventAssignment_2_in_rule__Happens__Group__2__Impl5825);
            rule__Happens__EventAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getHappensAccess().getEventAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Happens__Group__2__Impl


    // $ANTLR start rule__Happens__Group__3
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2894:1: rule__Happens__Group__3 : rule__Happens__Group__3__Impl rule__Happens__Group__4 ;
    public final void rule__Happens__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2898:1: ( rule__Happens__Group__3__Impl rule__Happens__Group__4 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2899:2: rule__Happens__Group__3__Impl rule__Happens__Group__4
            {
            pushFollow(FOLLOW_rule__Happens__Group__3__Impl_in_rule__Happens__Group__35855);
            rule__Happens__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Happens__Group__4_in_rule__Happens__Group__35858);
            rule__Happens__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Happens__Group__3


    // $ANTLR start rule__Happens__Group__3__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2906:1: rule__Happens__Group__3__Impl : ( ( rule__Happens__Group_3__0 )? ) ;
    public final void rule__Happens__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2910:1: ( ( ( rule__Happens__Group_3__0 )? ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2911:1: ( ( rule__Happens__Group_3__0 )? )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2911:1: ( ( rule__Happens__Group_3__0 )? )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2912:1: ( rule__Happens__Group_3__0 )?
            {
             before(grammarAccess.getHappensAccess().getGroup_3()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2913:1: ( rule__Happens__Group_3__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==22) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2913:2: rule__Happens__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Happens__Group_3__0_in_rule__Happens__Group__3__Impl5885);
                    rule__Happens__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHappensAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Happens__Group__3__Impl


    // $ANTLR start rule__Happens__Group__4
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2923:1: rule__Happens__Group__4 : rule__Happens__Group__4__Impl rule__Happens__Group__5 ;
    public final void rule__Happens__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2927:1: ( rule__Happens__Group__4__Impl rule__Happens__Group__5 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2928:2: rule__Happens__Group__4__Impl rule__Happens__Group__5
            {
            pushFollow(FOLLOW_rule__Happens__Group__4__Impl_in_rule__Happens__Group__45916);
            rule__Happens__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Happens__Group__5_in_rule__Happens__Group__45919);
            rule__Happens__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Happens__Group__4


    // $ANTLR start rule__Happens__Group__4__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2935:1: rule__Happens__Group__4__Impl : ( ',' ) ;
    public final void rule__Happens__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2939:1: ( ( ',' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2940:1: ( ',' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2940:1: ( ',' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2941:1: ','
            {
             before(grammarAccess.getHappensAccess().getCommaKeyword_4()); 
            match(input,21,FOLLOW_21_in_rule__Happens__Group__4__Impl5947); 
             after(grammarAccess.getHappensAccess().getCommaKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Happens__Group__4__Impl


    // $ANTLR start rule__Happens__Group__5
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2954:1: rule__Happens__Group__5 : rule__Happens__Group__5__Impl rule__Happens__Group__6 ;
    public final void rule__Happens__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2958:1: ( rule__Happens__Group__5__Impl rule__Happens__Group__6 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2959:2: rule__Happens__Group__5__Impl rule__Happens__Group__6
            {
            pushFollow(FOLLOW_rule__Happens__Group__5__Impl_in_rule__Happens__Group__55978);
            rule__Happens__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Happens__Group__6_in_rule__Happens__Group__55981);
            rule__Happens__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Happens__Group__5


    // $ANTLR start rule__Happens__Group__5__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2966:1: rule__Happens__Group__5__Impl : ( ( rule__Happens__TimeAssignment_5 ) ) ;
    public final void rule__Happens__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2970:1: ( ( ( rule__Happens__TimeAssignment_5 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2971:1: ( ( rule__Happens__TimeAssignment_5 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2971:1: ( ( rule__Happens__TimeAssignment_5 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2972:1: ( rule__Happens__TimeAssignment_5 )
            {
             before(grammarAccess.getHappensAccess().getTimeAssignment_5()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2973:1: ( rule__Happens__TimeAssignment_5 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2973:2: rule__Happens__TimeAssignment_5
            {
            pushFollow(FOLLOW_rule__Happens__TimeAssignment_5_in_rule__Happens__Group__5__Impl6008);
            rule__Happens__TimeAssignment_5();
            _fsp--;


            }

             after(grammarAccess.getHappensAccess().getTimeAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Happens__Group__5__Impl


    // $ANTLR start rule__Happens__Group__6
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2983:1: rule__Happens__Group__6 : rule__Happens__Group__6__Impl ;
    public final void rule__Happens__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2987:1: ( rule__Happens__Group__6__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2988:2: rule__Happens__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Happens__Group__6__Impl_in_rule__Happens__Group__66038);
            rule__Happens__Group__6__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Happens__Group__6


    // $ANTLR start rule__Happens__Group__6__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2994:1: rule__Happens__Group__6__Impl : ( ')' ) ;
    public final void rule__Happens__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2998:1: ( ( ')' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2999:1: ( ')' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2999:1: ( ')' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3000:1: ')'
            {
             before(grammarAccess.getHappensAccess().getRightParenthesisKeyword_6()); 
            match(input,23,FOLLOW_23_in_rule__Happens__Group__6__Impl6066); 
             after(grammarAccess.getHappensAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Happens__Group__6__Impl


    // $ANTLR start rule__Happens__Group_3__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3027:1: rule__Happens__Group_3__0 : rule__Happens__Group_3__0__Impl rule__Happens__Group_3__1 ;
    public final void rule__Happens__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3031:1: ( rule__Happens__Group_3__0__Impl rule__Happens__Group_3__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3032:2: rule__Happens__Group_3__0__Impl rule__Happens__Group_3__1
            {
            pushFollow(FOLLOW_rule__Happens__Group_3__0__Impl_in_rule__Happens__Group_3__06111);
            rule__Happens__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Happens__Group_3__1_in_rule__Happens__Group_3__06114);
            rule__Happens__Group_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Happens__Group_3__0


    // $ANTLR start rule__Happens__Group_3__0__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3039:1: rule__Happens__Group_3__0__Impl : ( '(' ) ;
    public final void rule__Happens__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3043:1: ( ( '(' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3044:1: ( '(' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3044:1: ( '(' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3045:1: '('
            {
             before(grammarAccess.getHappensAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,22,FOLLOW_22_in_rule__Happens__Group_3__0__Impl6142); 
             after(grammarAccess.getHappensAccess().getLeftParenthesisKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Happens__Group_3__0__Impl


    // $ANTLR start rule__Happens__Group_3__1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3058:1: rule__Happens__Group_3__1 : rule__Happens__Group_3__1__Impl rule__Happens__Group_3__2 ;
    public final void rule__Happens__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3062:1: ( rule__Happens__Group_3__1__Impl rule__Happens__Group_3__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3063:2: rule__Happens__Group_3__1__Impl rule__Happens__Group_3__2
            {
            pushFollow(FOLLOW_rule__Happens__Group_3__1__Impl_in_rule__Happens__Group_3__16173);
            rule__Happens__Group_3__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Happens__Group_3__2_in_rule__Happens__Group_3__16176);
            rule__Happens__Group_3__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Happens__Group_3__1


    // $ANTLR start rule__Happens__Group_3__1__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3070:1: rule__Happens__Group_3__1__Impl : ( ( rule__Happens__ArgsAssignment_3_1 )? ) ;
    public final void rule__Happens__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3074:1: ( ( ( rule__Happens__ArgsAssignment_3_1 )? ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3075:1: ( ( rule__Happens__ArgsAssignment_3_1 )? )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3075:1: ( ( rule__Happens__ArgsAssignment_3_1 )? )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3076:1: ( rule__Happens__ArgsAssignment_3_1 )?
            {
             before(grammarAccess.getHappensAccess().getArgsAssignment_3_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3077:1: ( rule__Happens__ArgsAssignment_3_1 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3077:2: rule__Happens__ArgsAssignment_3_1
                    {
                    pushFollow(FOLLOW_rule__Happens__ArgsAssignment_3_1_in_rule__Happens__Group_3__1__Impl6203);
                    rule__Happens__ArgsAssignment_3_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHappensAccess().getArgsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Happens__Group_3__1__Impl


    // $ANTLR start rule__Happens__Group_3__2
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3087:1: rule__Happens__Group_3__2 : rule__Happens__Group_3__2__Impl rule__Happens__Group_3__3 ;
    public final void rule__Happens__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3091:1: ( rule__Happens__Group_3__2__Impl rule__Happens__Group_3__3 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3092:2: rule__Happens__Group_3__2__Impl rule__Happens__Group_3__3
            {
            pushFollow(FOLLOW_rule__Happens__Group_3__2__Impl_in_rule__Happens__Group_3__26234);
            rule__Happens__Group_3__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Happens__Group_3__3_in_rule__Happens__Group_3__26237);
            rule__Happens__Group_3__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Happens__Group_3__2


    // $ANTLR start rule__Happens__Group_3__2__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3099:1: rule__Happens__Group_3__2__Impl : ( ( rule__Happens__Group_3_2__0 )* ) ;
    public final void rule__Happens__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3103:1: ( ( ( rule__Happens__Group_3_2__0 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3104:1: ( ( rule__Happens__Group_3_2__0 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3104:1: ( ( rule__Happens__Group_3_2__0 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3105:1: ( rule__Happens__Group_3_2__0 )*
            {
             before(grammarAccess.getHappensAccess().getGroup_3_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3106:1: ( rule__Happens__Group_3_2__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==21) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3106:2: rule__Happens__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Happens__Group_3_2__0_in_rule__Happens__Group_3__2__Impl6264);
            	    rule__Happens__Group_3_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getHappensAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Happens__Group_3__2__Impl


    // $ANTLR start rule__Happens__Group_3__3
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3116:1: rule__Happens__Group_3__3 : rule__Happens__Group_3__3__Impl ;
    public final void rule__Happens__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3120:1: ( rule__Happens__Group_3__3__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3121:2: rule__Happens__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__Happens__Group_3__3__Impl_in_rule__Happens__Group_3__36295);
            rule__Happens__Group_3__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Happens__Group_3__3


    // $ANTLR start rule__Happens__Group_3__3__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3127:1: rule__Happens__Group_3__3__Impl : ( ')' ) ;
    public final void rule__Happens__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3131:1: ( ( ')' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3132:1: ( ')' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3132:1: ( ')' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3133:1: ')'
            {
             before(grammarAccess.getHappensAccess().getRightParenthesisKeyword_3_3()); 
            match(input,23,FOLLOW_23_in_rule__Happens__Group_3__3__Impl6323); 
             after(grammarAccess.getHappensAccess().getRightParenthesisKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Happens__Group_3__3__Impl


    // $ANTLR start rule__Happens__Group_3_2__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3154:1: rule__Happens__Group_3_2__0 : rule__Happens__Group_3_2__0__Impl rule__Happens__Group_3_2__1 ;
    public final void rule__Happens__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3158:1: ( rule__Happens__Group_3_2__0__Impl rule__Happens__Group_3_2__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3159:2: rule__Happens__Group_3_2__0__Impl rule__Happens__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__Happens__Group_3_2__0__Impl_in_rule__Happens__Group_3_2__06362);
            rule__Happens__Group_3_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Happens__Group_3_2__1_in_rule__Happens__Group_3_2__06365);
            rule__Happens__Group_3_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Happens__Group_3_2__0


    // $ANTLR start rule__Happens__Group_3_2__0__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3166:1: rule__Happens__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__Happens__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3170:1: ( ( ',' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3171:1: ( ',' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3171:1: ( ',' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3172:1: ','
            {
             before(grammarAccess.getHappensAccess().getCommaKeyword_3_2_0()); 
            match(input,21,FOLLOW_21_in_rule__Happens__Group_3_2__0__Impl6393); 
             after(grammarAccess.getHappensAccess().getCommaKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Happens__Group_3_2__0__Impl


    // $ANTLR start rule__Happens__Group_3_2__1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3185:1: rule__Happens__Group_3_2__1 : rule__Happens__Group_3_2__1__Impl ;
    public final void rule__Happens__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3189:1: ( rule__Happens__Group_3_2__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3190:2: rule__Happens__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Happens__Group_3_2__1__Impl_in_rule__Happens__Group_3_2__16424);
            rule__Happens__Group_3_2__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Happens__Group_3_2__1


    // $ANTLR start rule__Happens__Group_3_2__1__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3196:1: rule__Happens__Group_3_2__1__Impl : ( ( rule__Happens__ArgsAssignment_3_2_1 ) ) ;
    public final void rule__Happens__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3200:1: ( ( ( rule__Happens__ArgsAssignment_3_2_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3201:1: ( ( rule__Happens__ArgsAssignment_3_2_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3201:1: ( ( rule__Happens__ArgsAssignment_3_2_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3202:1: ( rule__Happens__ArgsAssignment_3_2_1 )
            {
             before(grammarAccess.getHappensAccess().getArgsAssignment_3_2_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3203:1: ( rule__Happens__ArgsAssignment_3_2_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3203:2: rule__Happens__ArgsAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__Happens__ArgsAssignment_3_2_1_in_rule__Happens__Group_3_2__1__Impl6451);
            rule__Happens__ArgsAssignment_3_2_1();
            _fsp--;


            }

             after(grammarAccess.getHappensAccess().getArgsAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Happens__Group_3_2__1__Impl


    // $ANTLR start rule__Initiates__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3217:1: rule__Initiates__Group__0 : rule__Initiates__Group__0__Impl rule__Initiates__Group__1 ;
    public final void rule__Initiates__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3221:1: ( rule__Initiates__Group__0__Impl rule__Initiates__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3222:2: rule__Initiates__Group__0__Impl rule__Initiates__Group__1
            {
            pushFollow(FOLLOW_rule__Initiates__Group__0__Impl_in_rule__Initiates__Group__06485);
            rule__Initiates__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Initiates__Group__1_in_rule__Initiates__Group__06488);
            rule__Initiates__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Initiates__Group__0


    // $ANTLR start rule__Initiates__Group__0__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3229:1: rule__Initiates__Group__0__Impl : ( 'Initiates' ) ;
    public final void rule__Initiates__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3233:1: ( ( 'Initiates' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3234:1: ( 'Initiates' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3234:1: ( 'Initiates' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3235:1: 'Initiates'
            {
             before(grammarAccess.getInitiatesAccess().getInitiatesKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__Initiates__Group__0__Impl6516); 
             after(grammarAccess.getInitiatesAccess().getInitiatesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Initiates__Group__0__Impl


    // $ANTLR start rule__Initiates__Group__1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3248:1: rule__Initiates__Group__1 : rule__Initiates__Group__1__Impl rule__Initiates__Group__2 ;
    public final void rule__Initiates__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3252:1: ( rule__Initiates__Group__1__Impl rule__Initiates__Group__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3253:2: rule__Initiates__Group__1__Impl rule__Initiates__Group__2
            {
            pushFollow(FOLLOW_rule__Initiates__Group__1__Impl_in_rule__Initiates__Group__16547);
            rule__Initiates__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Initiates__Group__2_in_rule__Initiates__Group__16550);
            rule__Initiates__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Initiates__Group__1


    // $ANTLR start rule__Initiates__Group__1__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3260:1: rule__Initiates__Group__1__Impl : ( '(' ) ;
    public final void rule__Initiates__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3264:1: ( ( '(' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3265:1: ( '(' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3265:1: ( '(' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3266:1: '('
            {
             before(grammarAccess.getInitiatesAccess().getLeftParenthesisKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__Initiates__Group__1__Impl6578); 
             after(grammarAccess.getInitiatesAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Initiates__Group__1__Impl


    // $ANTLR start rule__Initiates__Group__2
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3279:1: rule__Initiates__Group__2 : rule__Initiates__Group__2__Impl rule__Initiates__Group__3 ;
    public final void rule__Initiates__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3283:1: ( rule__Initiates__Group__2__Impl rule__Initiates__Group__3 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3284:2: rule__Initiates__Group__2__Impl rule__Initiates__Group__3
            {
            pushFollow(FOLLOW_rule__Initiates__Group__2__Impl_in_rule__Initiates__Group__26609);
            rule__Initiates__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Initiates__Group__3_in_rule__Initiates__Group__26612);
            rule__Initiates__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Initiates__Group__2


    // $ANTLR start rule__Initiates__Group__2__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3291:1: rule__Initiates__Group__2__Impl : ( ( rule__Initiates__EventAssignment_2 ) ) ;
    public final void rule__Initiates__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3295:1: ( ( ( rule__Initiates__EventAssignment_2 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3296:1: ( ( rule__Initiates__EventAssignment_2 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3296:1: ( ( rule__Initiates__EventAssignment_2 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3297:1: ( rule__Initiates__EventAssignment_2 )
            {
             before(grammarAccess.getInitiatesAccess().getEventAssignment_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3298:1: ( rule__Initiates__EventAssignment_2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3298:2: rule__Initiates__EventAssignment_2
            {
            pushFollow(FOLLOW_rule__Initiates__EventAssignment_2_in_rule__Initiates__Group__2__Impl6639);
            rule__Initiates__EventAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getInitiatesAccess().getEventAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Initiates__Group__2__Impl


    // $ANTLR start rule__Initiates__Group__3
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3308:1: rule__Initiates__Group__3 : rule__Initiates__Group__3__Impl rule__Initiates__Group__4 ;
    public final void rule__Initiates__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3312:1: ( rule__Initiates__Group__3__Impl rule__Initiates__Group__4 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3313:2: rule__Initiates__Group__3__Impl rule__Initiates__Group__4
            {
            pushFollow(FOLLOW_rule__Initiates__Group__3__Impl_in_rule__Initiates__Group__36669);
            rule__Initiates__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Initiates__Group__4_in_rule__Initiates__Group__36672);
            rule__Initiates__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Initiates__Group__3


    // $ANTLR start rule__Initiates__Group__3__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3320:1: rule__Initiates__Group__3__Impl : ( ( rule__Initiates__Group_3__0 )? ) ;
    public final void rule__Initiates__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3324:1: ( ( ( rule__Initiates__Group_3__0 )? ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3325:1: ( ( rule__Initiates__Group_3__0 )? )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3325:1: ( ( rule__Initiates__Group_3__0 )? )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3326:1: ( rule__Initiates__Group_3__0 )?
            {
             before(grammarAccess.getInitiatesAccess().getGroup_3()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3327:1: ( rule__Initiates__Group_3__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==22) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3327:2: rule__Initiates__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Initiates__Group_3__0_in_rule__Initiates__Group__3__Impl6699);
                    rule__Initiates__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInitiatesAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Initiates__Group__3__Impl


    // $ANTLR start rule__Initiates__Group__4
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3337:1: rule__Initiates__Group__4 : rule__Initiates__Group__4__Impl rule__Initiates__Group__5 ;
    public final void rule__Initiates__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3341:1: ( rule__Initiates__Group__4__Impl rule__Initiates__Group__5 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3342:2: rule__Initiates__Group__4__Impl rule__Initiates__Group__5
            {
            pushFollow(FOLLOW_rule__Initiates__Group__4__Impl_in_rule__Initiates__Group__46730);
            rule__Initiates__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Initiates__Group__5_in_rule__Initiates__Group__46733);
            rule__Initiates__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Initiates__Group__4


    // $ANTLR start rule__Initiates__Group__4__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3349:1: rule__Initiates__Group__4__Impl : ( ',' ) ;
    public final void rule__Initiates__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3353:1: ( ( ',' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3354:1: ( ',' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3354:1: ( ',' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3355:1: ','
            {
             before(grammarAccess.getInitiatesAccess().getCommaKeyword_4()); 
            match(input,21,FOLLOW_21_in_rule__Initiates__Group__4__Impl6761); 
             after(grammarAccess.getInitiatesAccess().getCommaKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Initiates__Group__4__Impl


    // $ANTLR start rule__Initiates__Group__5
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3368:1: rule__Initiates__Group__5 : rule__Initiates__Group__5__Impl rule__Initiates__Group__6 ;
    public final void rule__Initiates__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3372:1: ( rule__Initiates__Group__5__Impl rule__Initiates__Group__6 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3373:2: rule__Initiates__Group__5__Impl rule__Initiates__Group__6
            {
            pushFollow(FOLLOW_rule__Initiates__Group__5__Impl_in_rule__Initiates__Group__56792);
            rule__Initiates__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Initiates__Group__6_in_rule__Initiates__Group__56795);
            rule__Initiates__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Initiates__Group__5


    // $ANTLR start rule__Initiates__Group__5__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3380:1: rule__Initiates__Group__5__Impl : ( ( rule__Initiates__FluentAssignment_5 ) ) ;
    public final void rule__Initiates__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3384:1: ( ( ( rule__Initiates__FluentAssignment_5 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3385:1: ( ( rule__Initiates__FluentAssignment_5 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3385:1: ( ( rule__Initiates__FluentAssignment_5 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3386:1: ( rule__Initiates__FluentAssignment_5 )
            {
             before(grammarAccess.getInitiatesAccess().getFluentAssignment_5()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3387:1: ( rule__Initiates__FluentAssignment_5 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3387:2: rule__Initiates__FluentAssignment_5
            {
            pushFollow(FOLLOW_rule__Initiates__FluentAssignment_5_in_rule__Initiates__Group__5__Impl6822);
            rule__Initiates__FluentAssignment_5();
            _fsp--;


            }

             after(grammarAccess.getInitiatesAccess().getFluentAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Initiates__Group__5__Impl


    // $ANTLR start rule__Initiates__Group__6
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3397:1: rule__Initiates__Group__6 : rule__Initiates__Group__6__Impl rule__Initiates__Group__7 ;
    public final void rule__Initiates__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3401:1: ( rule__Initiates__Group__6__Impl rule__Initiates__Group__7 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3402:2: rule__Initiates__Group__6__Impl rule__Initiates__Group__7
            {
            pushFollow(FOLLOW_rule__Initiates__Group__6__Impl_in_rule__Initiates__Group__66852);
            rule__Initiates__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Initiates__Group__7_in_rule__Initiates__Group__66855);
            rule__Initiates__Group__7();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Initiates__Group__6


    // $ANTLR start rule__Initiates__Group__6__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3409:1: rule__Initiates__Group__6__Impl : ( ( rule__Initiates__Group_6__0 )? ) ;
    public final void rule__Initiates__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3413:1: ( ( ( rule__Initiates__Group_6__0 )? ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3414:1: ( ( rule__Initiates__Group_6__0 )? )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3414:1: ( ( rule__Initiates__Group_6__0 )? )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3415:1: ( rule__Initiates__Group_6__0 )?
            {
             before(grammarAccess.getInitiatesAccess().getGroup_6()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3416:1: ( rule__Initiates__Group_6__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==22) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3416:2: rule__Initiates__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Initiates__Group_6__0_in_rule__Initiates__Group__6__Impl6882);
                    rule__Initiates__Group_6__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInitiatesAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Initiates__Group__6__Impl


    // $ANTLR start rule__Initiates__Group__7
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3426:1: rule__Initiates__Group__7 : rule__Initiates__Group__7__Impl rule__Initiates__Group__8 ;
    public final void rule__Initiates__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3430:1: ( rule__Initiates__Group__7__Impl rule__Initiates__Group__8 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3431:2: rule__Initiates__Group__7__Impl rule__Initiates__Group__8
            {
            pushFollow(FOLLOW_rule__Initiates__Group__7__Impl_in_rule__Initiates__Group__76913);
            rule__Initiates__Group__7__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Initiates__Group__8_in_rule__Initiates__Group__76916);
            rule__Initiates__Group__8();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Initiates__Group__7


    // $ANTLR start rule__Initiates__Group__7__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3438:1: rule__Initiates__Group__7__Impl : ( ',' ) ;
    public final void rule__Initiates__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3442:1: ( ( ',' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3443:1: ( ',' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3443:1: ( ',' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3444:1: ','
            {
             before(grammarAccess.getInitiatesAccess().getCommaKeyword_7()); 
            match(input,21,FOLLOW_21_in_rule__Initiates__Group__7__Impl6944); 
             after(grammarAccess.getInitiatesAccess().getCommaKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Initiates__Group__7__Impl


    // $ANTLR start rule__Initiates__Group__8
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3457:1: rule__Initiates__Group__8 : rule__Initiates__Group__8__Impl rule__Initiates__Group__9 ;
    public final void rule__Initiates__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3461:1: ( rule__Initiates__Group__8__Impl rule__Initiates__Group__9 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3462:2: rule__Initiates__Group__8__Impl rule__Initiates__Group__9
            {
            pushFollow(FOLLOW_rule__Initiates__Group__8__Impl_in_rule__Initiates__Group__86975);
            rule__Initiates__Group__8__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Initiates__Group__9_in_rule__Initiates__Group__86978);
            rule__Initiates__Group__9();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Initiates__Group__8


    // $ANTLR start rule__Initiates__Group__8__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3469:1: rule__Initiates__Group__8__Impl : ( ( rule__Initiates__TimeAssignment_8 ) ) ;
    public final void rule__Initiates__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3473:1: ( ( ( rule__Initiates__TimeAssignment_8 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3474:1: ( ( rule__Initiates__TimeAssignment_8 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3474:1: ( ( rule__Initiates__TimeAssignment_8 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3475:1: ( rule__Initiates__TimeAssignment_8 )
            {
             before(grammarAccess.getInitiatesAccess().getTimeAssignment_8()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3476:1: ( rule__Initiates__TimeAssignment_8 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3476:2: rule__Initiates__TimeAssignment_8
            {
            pushFollow(FOLLOW_rule__Initiates__TimeAssignment_8_in_rule__Initiates__Group__8__Impl7005);
            rule__Initiates__TimeAssignment_8();
            _fsp--;


            }

             after(grammarAccess.getInitiatesAccess().getTimeAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Initiates__Group__8__Impl


    // $ANTLR start rule__Initiates__Group__9
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3486:1: rule__Initiates__Group__9 : rule__Initiates__Group__9__Impl ;
    public final void rule__Initiates__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3490:1: ( rule__Initiates__Group__9__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3491:2: rule__Initiates__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__Initiates__Group__9__Impl_in_rule__Initiates__Group__97035);
            rule__Initiates__Group__9__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Initiates__Group__9


    // $ANTLR start rule__Initiates__Group__9__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3497:1: rule__Initiates__Group__9__Impl : ( ')' ) ;
    public final void rule__Initiates__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3501:1: ( ( ')' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3502:1: ( ')' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3502:1: ( ')' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3503:1: ')'
            {
             before(grammarAccess.getInitiatesAccess().getRightParenthesisKeyword_9()); 
            match(input,23,FOLLOW_23_in_rule__Initiates__Group__9__Impl7063); 
             after(grammarAccess.getInitiatesAccess().getRightParenthesisKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Initiates__Group__9__Impl


    // $ANTLR start rule__Initiates__Group_3__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3536:1: rule__Initiates__Group_3__0 : rule__Initiates__Group_3__0__Impl rule__Initiates__Group_3__1 ;
    public final void rule__Initiates__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3540:1: ( rule__Initiates__Group_3__0__Impl rule__Initiates__Group_3__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3541:2: rule__Initiates__Group_3__0__Impl rule__Initiates__Group_3__1
            {
            pushFollow(FOLLOW_rule__Initiates__Group_3__0__Impl_in_rule__Initiates__Group_3__07114);
            rule__Initiates__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Initiates__Group_3__1_in_rule__Initiates__Group_3__07117);
            rule__Initiates__Group_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Initiates__Group_3__0


    // $ANTLR start rule__Initiates__Group_3__0__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3548:1: rule__Initiates__Group_3__0__Impl : ( '(' ) ;
    public final void rule__Initiates__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3552:1: ( ( '(' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3553:1: ( '(' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3553:1: ( '(' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3554:1: '('
            {
             before(grammarAccess.getInitiatesAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,22,FOLLOW_22_in_rule__Initiates__Group_3__0__Impl7145); 
             after(grammarAccess.getInitiatesAccess().getLeftParenthesisKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Initiates__Group_3__0__Impl


    // $ANTLR start rule__Initiates__Group_3__1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3567:1: rule__Initiates__Group_3__1 : rule__Initiates__Group_3__1__Impl rule__Initiates__Group_3__2 ;
    public final void rule__Initiates__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3571:1: ( rule__Initiates__Group_3__1__Impl rule__Initiates__Group_3__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3572:2: rule__Initiates__Group_3__1__Impl rule__Initiates__Group_3__2
            {
            pushFollow(FOLLOW_rule__Initiates__Group_3__1__Impl_in_rule__Initiates__Group_3__17176);
            rule__Initiates__Group_3__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Initiates__Group_3__2_in_rule__Initiates__Group_3__17179);
            rule__Initiates__Group_3__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Initiates__Group_3__1


    // $ANTLR start rule__Initiates__Group_3__1__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3579:1: rule__Initiates__Group_3__1__Impl : ( ( rule__Initiates__ArgsAssignment_3_1 )? ) ;
    public final void rule__Initiates__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3583:1: ( ( ( rule__Initiates__ArgsAssignment_3_1 )? ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3584:1: ( ( rule__Initiates__ArgsAssignment_3_1 )? )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3584:1: ( ( rule__Initiates__ArgsAssignment_3_1 )? )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3585:1: ( rule__Initiates__ArgsAssignment_3_1 )?
            {
             before(grammarAccess.getInitiatesAccess().getArgsAssignment_3_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3586:1: ( rule__Initiates__ArgsAssignment_3_1 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3586:2: rule__Initiates__ArgsAssignment_3_1
                    {
                    pushFollow(FOLLOW_rule__Initiates__ArgsAssignment_3_1_in_rule__Initiates__Group_3__1__Impl7206);
                    rule__Initiates__ArgsAssignment_3_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInitiatesAccess().getArgsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Initiates__Group_3__1__Impl


    // $ANTLR start rule__Initiates__Group_3__2
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3596:1: rule__Initiates__Group_3__2 : rule__Initiates__Group_3__2__Impl rule__Initiates__Group_3__3 ;
    public final void rule__Initiates__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3600:1: ( rule__Initiates__Group_3__2__Impl rule__Initiates__Group_3__3 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3601:2: rule__Initiates__Group_3__2__Impl rule__Initiates__Group_3__3
            {
            pushFollow(FOLLOW_rule__Initiates__Group_3__2__Impl_in_rule__Initiates__Group_3__27237);
            rule__Initiates__Group_3__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Initiates__Group_3__3_in_rule__Initiates__Group_3__27240);
            rule__Initiates__Group_3__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Initiates__Group_3__2


    // $ANTLR start rule__Initiates__Group_3__2__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3608:1: rule__Initiates__Group_3__2__Impl : ( ( rule__Initiates__Group_3_2__0 )* ) ;
    public final void rule__Initiates__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3612:1: ( ( ( rule__Initiates__Group_3_2__0 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3613:1: ( ( rule__Initiates__Group_3_2__0 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3613:1: ( ( rule__Initiates__Group_3_2__0 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3614:1: ( rule__Initiates__Group_3_2__0 )*
            {
             before(grammarAccess.getInitiatesAccess().getGroup_3_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3615:1: ( rule__Initiates__Group_3_2__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==21) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3615:2: rule__Initiates__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Initiates__Group_3_2__0_in_rule__Initiates__Group_3__2__Impl7267);
            	    rule__Initiates__Group_3_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getInitiatesAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Initiates__Group_3__2__Impl


    // $ANTLR start rule__Initiates__Group_3__3
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3625:1: rule__Initiates__Group_3__3 : rule__Initiates__Group_3__3__Impl ;
    public final void rule__Initiates__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3629:1: ( rule__Initiates__Group_3__3__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3630:2: rule__Initiates__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__Initiates__Group_3__3__Impl_in_rule__Initiates__Group_3__37298);
            rule__Initiates__Group_3__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Initiates__Group_3__3


    // $ANTLR start rule__Initiates__Group_3__3__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3636:1: rule__Initiates__Group_3__3__Impl : ( ')' ) ;
    public final void rule__Initiates__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3640:1: ( ( ')' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3641:1: ( ')' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3641:1: ( ')' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3642:1: ')'
            {
             before(grammarAccess.getInitiatesAccess().getRightParenthesisKeyword_3_3()); 
            match(input,23,FOLLOW_23_in_rule__Initiates__Group_3__3__Impl7326); 
             after(grammarAccess.getInitiatesAccess().getRightParenthesisKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Initiates__Group_3__3__Impl


    // $ANTLR start rule__Initiates__Group_3_2__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3663:1: rule__Initiates__Group_3_2__0 : rule__Initiates__Group_3_2__0__Impl rule__Initiates__Group_3_2__1 ;
    public final void rule__Initiates__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3667:1: ( rule__Initiates__Group_3_2__0__Impl rule__Initiates__Group_3_2__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3668:2: rule__Initiates__Group_3_2__0__Impl rule__Initiates__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__Initiates__Group_3_2__0__Impl_in_rule__Initiates__Group_3_2__07365);
            rule__Initiates__Group_3_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Initiates__Group_3_2__1_in_rule__Initiates__Group_3_2__07368);
            rule__Initiates__Group_3_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Initiates__Group_3_2__0


    // $ANTLR start rule__Initiates__Group_3_2__0__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3675:1: rule__Initiates__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__Initiates__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3679:1: ( ( ',' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3680:1: ( ',' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3680:1: ( ',' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3681:1: ','
            {
             before(grammarAccess.getInitiatesAccess().getCommaKeyword_3_2_0()); 
            match(input,21,FOLLOW_21_in_rule__Initiates__Group_3_2__0__Impl7396); 
             after(grammarAccess.getInitiatesAccess().getCommaKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Initiates__Group_3_2__0__Impl


    // $ANTLR start rule__Initiates__Group_3_2__1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3694:1: rule__Initiates__Group_3_2__1 : rule__Initiates__Group_3_2__1__Impl ;
    public final void rule__Initiates__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3698:1: ( rule__Initiates__Group_3_2__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3699:2: rule__Initiates__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Initiates__Group_3_2__1__Impl_in_rule__Initiates__Group_3_2__17427);
            rule__Initiates__Group_3_2__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Initiates__Group_3_2__1


    // $ANTLR start rule__Initiates__Group_3_2__1__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3705:1: rule__Initiates__Group_3_2__1__Impl : ( ( rule__Initiates__ArgsAssignment_3_2_1 ) ) ;
    public final void rule__Initiates__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3709:1: ( ( ( rule__Initiates__ArgsAssignment_3_2_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3710:1: ( ( rule__Initiates__ArgsAssignment_3_2_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3710:1: ( ( rule__Initiates__ArgsAssignment_3_2_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3711:1: ( rule__Initiates__ArgsAssignment_3_2_1 )
            {
             before(grammarAccess.getInitiatesAccess().getArgsAssignment_3_2_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3712:1: ( rule__Initiates__ArgsAssignment_3_2_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3712:2: rule__Initiates__ArgsAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__Initiates__ArgsAssignment_3_2_1_in_rule__Initiates__Group_3_2__1__Impl7454);
            rule__Initiates__ArgsAssignment_3_2_1();
            _fsp--;


            }

             after(grammarAccess.getInitiatesAccess().getArgsAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Initiates__Group_3_2__1__Impl


    // $ANTLR start rule__Initiates__Group_6__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3726:1: rule__Initiates__Group_6__0 : rule__Initiates__Group_6__0__Impl rule__Initiates__Group_6__1 ;
    public final void rule__Initiates__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3730:1: ( rule__Initiates__Group_6__0__Impl rule__Initiates__Group_6__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3731:2: rule__Initiates__Group_6__0__Impl rule__Initiates__Group_6__1
            {
            pushFollow(FOLLOW_rule__Initiates__Group_6__0__Impl_in_rule__Initiates__Group_6__07488);
            rule__Initiates__Group_6__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Initiates__Group_6__1_in_rule__Initiates__Group_6__07491);
            rule__Initiates__Group_6__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Initiates__Group_6__0


    // $ANTLR start rule__Initiates__Group_6__0__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3738:1: rule__Initiates__Group_6__0__Impl : ( '(' ) ;
    public final void rule__Initiates__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3742:1: ( ( '(' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3743:1: ( '(' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3743:1: ( '(' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3744:1: '('
            {
             before(grammarAccess.getInitiatesAccess().getLeftParenthesisKeyword_6_0()); 
            match(input,22,FOLLOW_22_in_rule__Initiates__Group_6__0__Impl7519); 
             after(grammarAccess.getInitiatesAccess().getLeftParenthesisKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Initiates__Group_6__0__Impl


    // $ANTLR start rule__Initiates__Group_6__1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3757:1: rule__Initiates__Group_6__1 : rule__Initiates__Group_6__1__Impl rule__Initiates__Group_6__2 ;
    public final void rule__Initiates__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3761:1: ( rule__Initiates__Group_6__1__Impl rule__Initiates__Group_6__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3762:2: rule__Initiates__Group_6__1__Impl rule__Initiates__Group_6__2
            {
            pushFollow(FOLLOW_rule__Initiates__Group_6__1__Impl_in_rule__Initiates__Group_6__17550);
            rule__Initiates__Group_6__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Initiates__Group_6__2_in_rule__Initiates__Group_6__17553);
            rule__Initiates__Group_6__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Initiates__Group_6__1


    // $ANTLR start rule__Initiates__Group_6__1__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3769:1: rule__Initiates__Group_6__1__Impl : ( ( rule__Initiates__Args2Assignment_6_1 )? ) ;
    public final void rule__Initiates__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3773:1: ( ( ( rule__Initiates__Args2Assignment_6_1 )? ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3774:1: ( ( rule__Initiates__Args2Assignment_6_1 )? )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3774:1: ( ( rule__Initiates__Args2Assignment_6_1 )? )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3775:1: ( rule__Initiates__Args2Assignment_6_1 )?
            {
             before(grammarAccess.getInitiatesAccess().getArgs2Assignment_6_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3776:1: ( rule__Initiates__Args2Assignment_6_1 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3776:2: rule__Initiates__Args2Assignment_6_1
                    {
                    pushFollow(FOLLOW_rule__Initiates__Args2Assignment_6_1_in_rule__Initiates__Group_6__1__Impl7580);
                    rule__Initiates__Args2Assignment_6_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInitiatesAccess().getArgs2Assignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Initiates__Group_6__1__Impl


    // $ANTLR start rule__Initiates__Group_6__2
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3786:1: rule__Initiates__Group_6__2 : rule__Initiates__Group_6__2__Impl rule__Initiates__Group_6__3 ;
    public final void rule__Initiates__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3790:1: ( rule__Initiates__Group_6__2__Impl rule__Initiates__Group_6__3 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3791:2: rule__Initiates__Group_6__2__Impl rule__Initiates__Group_6__3
            {
            pushFollow(FOLLOW_rule__Initiates__Group_6__2__Impl_in_rule__Initiates__Group_6__27611);
            rule__Initiates__Group_6__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Initiates__Group_6__3_in_rule__Initiates__Group_6__27614);
            rule__Initiates__Group_6__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Initiates__Group_6__2


    // $ANTLR start rule__Initiates__Group_6__2__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3798:1: rule__Initiates__Group_6__2__Impl : ( ( rule__Initiates__Group_6_2__0 )* ) ;
    public final void rule__Initiates__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3802:1: ( ( ( rule__Initiates__Group_6_2__0 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3803:1: ( ( rule__Initiates__Group_6_2__0 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3803:1: ( ( rule__Initiates__Group_6_2__0 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3804:1: ( rule__Initiates__Group_6_2__0 )*
            {
             before(grammarAccess.getInitiatesAccess().getGroup_6_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3805:1: ( rule__Initiates__Group_6_2__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==21) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3805:2: rule__Initiates__Group_6_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Initiates__Group_6_2__0_in_rule__Initiates__Group_6__2__Impl7641);
            	    rule__Initiates__Group_6_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getInitiatesAccess().getGroup_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Initiates__Group_6__2__Impl


    // $ANTLR start rule__Initiates__Group_6__3
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3815:1: rule__Initiates__Group_6__3 : rule__Initiates__Group_6__3__Impl ;
    public final void rule__Initiates__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3819:1: ( rule__Initiates__Group_6__3__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3820:2: rule__Initiates__Group_6__3__Impl
            {
            pushFollow(FOLLOW_rule__Initiates__Group_6__3__Impl_in_rule__Initiates__Group_6__37672);
            rule__Initiates__Group_6__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Initiates__Group_6__3


    // $ANTLR start rule__Initiates__Group_6__3__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3826:1: rule__Initiates__Group_6__3__Impl : ( ')' ) ;
    public final void rule__Initiates__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3830:1: ( ( ')' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3831:1: ( ')' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3831:1: ( ')' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3832:1: ')'
            {
             before(grammarAccess.getInitiatesAccess().getRightParenthesisKeyword_6_3()); 
            match(input,23,FOLLOW_23_in_rule__Initiates__Group_6__3__Impl7700); 
             after(grammarAccess.getInitiatesAccess().getRightParenthesisKeyword_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Initiates__Group_6__3__Impl


    // $ANTLR start rule__Initiates__Group_6_2__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3853:1: rule__Initiates__Group_6_2__0 : rule__Initiates__Group_6_2__0__Impl rule__Initiates__Group_6_2__1 ;
    public final void rule__Initiates__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3857:1: ( rule__Initiates__Group_6_2__0__Impl rule__Initiates__Group_6_2__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3858:2: rule__Initiates__Group_6_2__0__Impl rule__Initiates__Group_6_2__1
            {
            pushFollow(FOLLOW_rule__Initiates__Group_6_2__0__Impl_in_rule__Initiates__Group_6_2__07739);
            rule__Initiates__Group_6_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Initiates__Group_6_2__1_in_rule__Initiates__Group_6_2__07742);
            rule__Initiates__Group_6_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Initiates__Group_6_2__0


    // $ANTLR start rule__Initiates__Group_6_2__0__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3865:1: rule__Initiates__Group_6_2__0__Impl : ( ',' ) ;
    public final void rule__Initiates__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3869:1: ( ( ',' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3870:1: ( ',' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3870:1: ( ',' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3871:1: ','
            {
             before(grammarAccess.getInitiatesAccess().getCommaKeyword_6_2_0()); 
            match(input,21,FOLLOW_21_in_rule__Initiates__Group_6_2__0__Impl7770); 
             after(grammarAccess.getInitiatesAccess().getCommaKeyword_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Initiates__Group_6_2__0__Impl


    // $ANTLR start rule__Initiates__Group_6_2__1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3884:1: rule__Initiates__Group_6_2__1 : rule__Initiates__Group_6_2__1__Impl ;
    public final void rule__Initiates__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3888:1: ( rule__Initiates__Group_6_2__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3889:2: rule__Initiates__Group_6_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Initiates__Group_6_2__1__Impl_in_rule__Initiates__Group_6_2__17801);
            rule__Initiates__Group_6_2__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Initiates__Group_6_2__1


    // $ANTLR start rule__Initiates__Group_6_2__1__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3895:1: rule__Initiates__Group_6_2__1__Impl : ( ( rule__Initiates__Args2Assignment_6_2_1 ) ) ;
    public final void rule__Initiates__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3899:1: ( ( ( rule__Initiates__Args2Assignment_6_2_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3900:1: ( ( rule__Initiates__Args2Assignment_6_2_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3900:1: ( ( rule__Initiates__Args2Assignment_6_2_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3901:1: ( rule__Initiates__Args2Assignment_6_2_1 )
            {
             before(grammarAccess.getInitiatesAccess().getArgs2Assignment_6_2_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3902:1: ( rule__Initiates__Args2Assignment_6_2_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3902:2: rule__Initiates__Args2Assignment_6_2_1
            {
            pushFollow(FOLLOW_rule__Initiates__Args2Assignment_6_2_1_in_rule__Initiates__Group_6_2__1__Impl7828);
            rule__Initiates__Args2Assignment_6_2_1();
            _fsp--;


            }

             after(grammarAccess.getInitiatesAccess().getArgs2Assignment_6_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Initiates__Group_6_2__1__Impl


    // $ANTLR start rule__Terminates__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3916:1: rule__Terminates__Group__0 : rule__Terminates__Group__0__Impl rule__Terminates__Group__1 ;
    public final void rule__Terminates__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3920:1: ( rule__Terminates__Group__0__Impl rule__Terminates__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3921:2: rule__Terminates__Group__0__Impl rule__Terminates__Group__1
            {
            pushFollow(FOLLOW_rule__Terminates__Group__0__Impl_in_rule__Terminates__Group__07862);
            rule__Terminates__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Terminates__Group__1_in_rule__Terminates__Group__07865);
            rule__Terminates__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Terminates__Group__0


    // $ANTLR start rule__Terminates__Group__0__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3928:1: rule__Terminates__Group__0__Impl : ( 'Terminates' ) ;
    public final void rule__Terminates__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3932:1: ( ( 'Terminates' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3933:1: ( 'Terminates' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3933:1: ( 'Terminates' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3934:1: 'Terminates'
            {
             before(grammarAccess.getTerminatesAccess().getTerminatesKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__Terminates__Group__0__Impl7893); 
             after(grammarAccess.getTerminatesAccess().getTerminatesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Terminates__Group__0__Impl


    // $ANTLR start rule__Terminates__Group__1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3947:1: rule__Terminates__Group__1 : rule__Terminates__Group__1__Impl rule__Terminates__Group__2 ;
    public final void rule__Terminates__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3951:1: ( rule__Terminates__Group__1__Impl rule__Terminates__Group__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3952:2: rule__Terminates__Group__1__Impl rule__Terminates__Group__2
            {
            pushFollow(FOLLOW_rule__Terminates__Group__1__Impl_in_rule__Terminates__Group__17924);
            rule__Terminates__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Terminates__Group__2_in_rule__Terminates__Group__17927);
            rule__Terminates__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Terminates__Group__1


    // $ANTLR start rule__Terminates__Group__1__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3959:1: rule__Terminates__Group__1__Impl : ( '(' ) ;
    public final void rule__Terminates__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3963:1: ( ( '(' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3964:1: ( '(' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3964:1: ( '(' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3965:1: '('
            {
             before(grammarAccess.getTerminatesAccess().getLeftParenthesisKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__Terminates__Group__1__Impl7955); 
             after(grammarAccess.getTerminatesAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Terminates__Group__1__Impl


    // $ANTLR start rule__Terminates__Group__2
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3978:1: rule__Terminates__Group__2 : rule__Terminates__Group__2__Impl rule__Terminates__Group__3 ;
    public final void rule__Terminates__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3982:1: ( rule__Terminates__Group__2__Impl rule__Terminates__Group__3 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3983:2: rule__Terminates__Group__2__Impl rule__Terminates__Group__3
            {
            pushFollow(FOLLOW_rule__Terminates__Group__2__Impl_in_rule__Terminates__Group__27986);
            rule__Terminates__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Terminates__Group__3_in_rule__Terminates__Group__27989);
            rule__Terminates__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Terminates__Group__2


    // $ANTLR start rule__Terminates__Group__2__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3990:1: rule__Terminates__Group__2__Impl : ( ( rule__Terminates__EventAssignment_2 ) ) ;
    public final void rule__Terminates__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3994:1: ( ( ( rule__Terminates__EventAssignment_2 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3995:1: ( ( rule__Terminates__EventAssignment_2 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3995:1: ( ( rule__Terminates__EventAssignment_2 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3996:1: ( rule__Terminates__EventAssignment_2 )
            {
             before(grammarAccess.getTerminatesAccess().getEventAssignment_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3997:1: ( rule__Terminates__EventAssignment_2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3997:2: rule__Terminates__EventAssignment_2
            {
            pushFollow(FOLLOW_rule__Terminates__EventAssignment_2_in_rule__Terminates__Group__2__Impl8016);
            rule__Terminates__EventAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getTerminatesAccess().getEventAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Terminates__Group__2__Impl


    // $ANTLR start rule__Terminates__Group__3
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4007:1: rule__Terminates__Group__3 : rule__Terminates__Group__3__Impl rule__Terminates__Group__4 ;
    public final void rule__Terminates__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4011:1: ( rule__Terminates__Group__3__Impl rule__Terminates__Group__4 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4012:2: rule__Terminates__Group__3__Impl rule__Terminates__Group__4
            {
            pushFollow(FOLLOW_rule__Terminates__Group__3__Impl_in_rule__Terminates__Group__38046);
            rule__Terminates__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Terminates__Group__4_in_rule__Terminates__Group__38049);
            rule__Terminates__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Terminates__Group__3


    // $ANTLR start rule__Terminates__Group__3__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4019:1: rule__Terminates__Group__3__Impl : ( ( rule__Terminates__Group_3__0 )? ) ;
    public final void rule__Terminates__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4023:1: ( ( ( rule__Terminates__Group_3__0 )? ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4024:1: ( ( rule__Terminates__Group_3__0 )? )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4024:1: ( ( rule__Terminates__Group_3__0 )? )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4025:1: ( rule__Terminates__Group_3__0 )?
            {
             before(grammarAccess.getTerminatesAccess().getGroup_3()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4026:1: ( rule__Terminates__Group_3__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==22) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4026:2: rule__Terminates__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Terminates__Group_3__0_in_rule__Terminates__Group__3__Impl8076);
                    rule__Terminates__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTerminatesAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Terminates__Group__3__Impl


    // $ANTLR start rule__Terminates__Group__4
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4036:1: rule__Terminates__Group__4 : rule__Terminates__Group__4__Impl rule__Terminates__Group__5 ;
    public final void rule__Terminates__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4040:1: ( rule__Terminates__Group__4__Impl rule__Terminates__Group__5 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4041:2: rule__Terminates__Group__4__Impl rule__Terminates__Group__5
            {
            pushFollow(FOLLOW_rule__Terminates__Group__4__Impl_in_rule__Terminates__Group__48107);
            rule__Terminates__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Terminates__Group__5_in_rule__Terminates__Group__48110);
            rule__Terminates__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Terminates__Group__4


    // $ANTLR start rule__Terminates__Group__4__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4048:1: rule__Terminates__Group__4__Impl : ( ',' ) ;
    public final void rule__Terminates__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4052:1: ( ( ',' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4053:1: ( ',' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4053:1: ( ',' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4054:1: ','
            {
             before(grammarAccess.getTerminatesAccess().getCommaKeyword_4()); 
            match(input,21,FOLLOW_21_in_rule__Terminates__Group__4__Impl8138); 
             after(grammarAccess.getTerminatesAccess().getCommaKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Terminates__Group__4__Impl


    // $ANTLR start rule__Terminates__Group__5
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4067:1: rule__Terminates__Group__5 : rule__Terminates__Group__5__Impl rule__Terminates__Group__6 ;
    public final void rule__Terminates__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4071:1: ( rule__Terminates__Group__5__Impl rule__Terminates__Group__6 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4072:2: rule__Terminates__Group__5__Impl rule__Terminates__Group__6
            {
            pushFollow(FOLLOW_rule__Terminates__Group__5__Impl_in_rule__Terminates__Group__58169);
            rule__Terminates__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Terminates__Group__6_in_rule__Terminates__Group__58172);
            rule__Terminates__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Terminates__Group__5


    // $ANTLR start rule__Terminates__Group__5__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4079:1: rule__Terminates__Group__5__Impl : ( ( rule__Terminates__FluentAssignment_5 ) ) ;
    public final void rule__Terminates__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4083:1: ( ( ( rule__Terminates__FluentAssignment_5 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4084:1: ( ( rule__Terminates__FluentAssignment_5 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4084:1: ( ( rule__Terminates__FluentAssignment_5 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4085:1: ( rule__Terminates__FluentAssignment_5 )
            {
             before(grammarAccess.getTerminatesAccess().getFluentAssignment_5()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4086:1: ( rule__Terminates__FluentAssignment_5 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4086:2: rule__Terminates__FluentAssignment_5
            {
            pushFollow(FOLLOW_rule__Terminates__FluentAssignment_5_in_rule__Terminates__Group__5__Impl8199);
            rule__Terminates__FluentAssignment_5();
            _fsp--;


            }

             after(grammarAccess.getTerminatesAccess().getFluentAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Terminates__Group__5__Impl


    // $ANTLR start rule__Terminates__Group__6
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4096:1: rule__Terminates__Group__6 : rule__Terminates__Group__6__Impl rule__Terminates__Group__7 ;
    public final void rule__Terminates__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4100:1: ( rule__Terminates__Group__6__Impl rule__Terminates__Group__7 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4101:2: rule__Terminates__Group__6__Impl rule__Terminates__Group__7
            {
            pushFollow(FOLLOW_rule__Terminates__Group__6__Impl_in_rule__Terminates__Group__68229);
            rule__Terminates__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Terminates__Group__7_in_rule__Terminates__Group__68232);
            rule__Terminates__Group__7();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Terminates__Group__6


    // $ANTLR start rule__Terminates__Group__6__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4108:1: rule__Terminates__Group__6__Impl : ( ( rule__Terminates__Group_6__0 )? ) ;
    public final void rule__Terminates__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4112:1: ( ( ( rule__Terminates__Group_6__0 )? ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4113:1: ( ( rule__Terminates__Group_6__0 )? )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4113:1: ( ( rule__Terminates__Group_6__0 )? )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4114:1: ( rule__Terminates__Group_6__0 )?
            {
             before(grammarAccess.getTerminatesAccess().getGroup_6()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4115:1: ( rule__Terminates__Group_6__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==22) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4115:2: rule__Terminates__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Terminates__Group_6__0_in_rule__Terminates__Group__6__Impl8259);
                    rule__Terminates__Group_6__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTerminatesAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Terminates__Group__6__Impl


    // $ANTLR start rule__Terminates__Group__7
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4125:1: rule__Terminates__Group__7 : rule__Terminates__Group__7__Impl rule__Terminates__Group__8 ;
    public final void rule__Terminates__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4129:1: ( rule__Terminates__Group__7__Impl rule__Terminates__Group__8 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4130:2: rule__Terminates__Group__7__Impl rule__Terminates__Group__8
            {
            pushFollow(FOLLOW_rule__Terminates__Group__7__Impl_in_rule__Terminates__Group__78290);
            rule__Terminates__Group__7__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Terminates__Group__8_in_rule__Terminates__Group__78293);
            rule__Terminates__Group__8();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Terminates__Group__7


    // $ANTLR start rule__Terminates__Group__7__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4137:1: rule__Terminates__Group__7__Impl : ( ',' ) ;
    public final void rule__Terminates__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4141:1: ( ( ',' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4142:1: ( ',' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4142:1: ( ',' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4143:1: ','
            {
             before(grammarAccess.getTerminatesAccess().getCommaKeyword_7()); 
            match(input,21,FOLLOW_21_in_rule__Terminates__Group__7__Impl8321); 
             after(grammarAccess.getTerminatesAccess().getCommaKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Terminates__Group__7__Impl


    // $ANTLR start rule__Terminates__Group__8
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4156:1: rule__Terminates__Group__8 : rule__Terminates__Group__8__Impl rule__Terminates__Group__9 ;
    public final void rule__Terminates__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4160:1: ( rule__Terminates__Group__8__Impl rule__Terminates__Group__9 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4161:2: rule__Terminates__Group__8__Impl rule__Terminates__Group__9
            {
            pushFollow(FOLLOW_rule__Terminates__Group__8__Impl_in_rule__Terminates__Group__88352);
            rule__Terminates__Group__8__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Terminates__Group__9_in_rule__Terminates__Group__88355);
            rule__Terminates__Group__9();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Terminates__Group__8


    // $ANTLR start rule__Terminates__Group__8__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4168:1: rule__Terminates__Group__8__Impl : ( ( rule__Terminates__TimeAssignment_8 ) ) ;
    public final void rule__Terminates__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4172:1: ( ( ( rule__Terminates__TimeAssignment_8 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4173:1: ( ( rule__Terminates__TimeAssignment_8 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4173:1: ( ( rule__Terminates__TimeAssignment_8 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4174:1: ( rule__Terminates__TimeAssignment_8 )
            {
             before(grammarAccess.getTerminatesAccess().getTimeAssignment_8()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4175:1: ( rule__Terminates__TimeAssignment_8 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4175:2: rule__Terminates__TimeAssignment_8
            {
            pushFollow(FOLLOW_rule__Terminates__TimeAssignment_8_in_rule__Terminates__Group__8__Impl8382);
            rule__Terminates__TimeAssignment_8();
            _fsp--;


            }

             after(grammarAccess.getTerminatesAccess().getTimeAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Terminates__Group__8__Impl


    // $ANTLR start rule__Terminates__Group__9
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4185:1: rule__Terminates__Group__9 : rule__Terminates__Group__9__Impl ;
    public final void rule__Terminates__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4189:1: ( rule__Terminates__Group__9__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4190:2: rule__Terminates__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__Terminates__Group__9__Impl_in_rule__Terminates__Group__98412);
            rule__Terminates__Group__9__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Terminates__Group__9


    // $ANTLR start rule__Terminates__Group__9__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4196:1: rule__Terminates__Group__9__Impl : ( ')' ) ;
    public final void rule__Terminates__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4200:1: ( ( ')' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4201:1: ( ')' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4201:1: ( ')' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4202:1: ')'
            {
             before(grammarAccess.getTerminatesAccess().getRightParenthesisKeyword_9()); 
            match(input,23,FOLLOW_23_in_rule__Terminates__Group__9__Impl8440); 
             after(grammarAccess.getTerminatesAccess().getRightParenthesisKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Terminates__Group__9__Impl


    // $ANTLR start rule__Terminates__Group_3__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4235:1: rule__Terminates__Group_3__0 : rule__Terminates__Group_3__0__Impl rule__Terminates__Group_3__1 ;
    public final void rule__Terminates__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4239:1: ( rule__Terminates__Group_3__0__Impl rule__Terminates__Group_3__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4240:2: rule__Terminates__Group_3__0__Impl rule__Terminates__Group_3__1
            {
            pushFollow(FOLLOW_rule__Terminates__Group_3__0__Impl_in_rule__Terminates__Group_3__08491);
            rule__Terminates__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Terminates__Group_3__1_in_rule__Terminates__Group_3__08494);
            rule__Terminates__Group_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Terminates__Group_3__0


    // $ANTLR start rule__Terminates__Group_3__0__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4247:1: rule__Terminates__Group_3__0__Impl : ( '(' ) ;
    public final void rule__Terminates__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4251:1: ( ( '(' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4252:1: ( '(' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4252:1: ( '(' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4253:1: '('
            {
             before(grammarAccess.getTerminatesAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,22,FOLLOW_22_in_rule__Terminates__Group_3__0__Impl8522); 
             after(grammarAccess.getTerminatesAccess().getLeftParenthesisKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Terminates__Group_3__0__Impl


    // $ANTLR start rule__Terminates__Group_3__1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4266:1: rule__Terminates__Group_3__1 : rule__Terminates__Group_3__1__Impl rule__Terminates__Group_3__2 ;
    public final void rule__Terminates__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4270:1: ( rule__Terminates__Group_3__1__Impl rule__Terminates__Group_3__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4271:2: rule__Terminates__Group_3__1__Impl rule__Terminates__Group_3__2
            {
            pushFollow(FOLLOW_rule__Terminates__Group_3__1__Impl_in_rule__Terminates__Group_3__18553);
            rule__Terminates__Group_3__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Terminates__Group_3__2_in_rule__Terminates__Group_3__18556);
            rule__Terminates__Group_3__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Terminates__Group_3__1


    // $ANTLR start rule__Terminates__Group_3__1__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4278:1: rule__Terminates__Group_3__1__Impl : ( ( rule__Terminates__ArgsAssignment_3_1 )? ) ;
    public final void rule__Terminates__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4282:1: ( ( ( rule__Terminates__ArgsAssignment_3_1 )? ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4283:1: ( ( rule__Terminates__ArgsAssignment_3_1 )? )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4283:1: ( ( rule__Terminates__ArgsAssignment_3_1 )? )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4284:1: ( rule__Terminates__ArgsAssignment_3_1 )?
            {
             before(grammarAccess.getTerminatesAccess().getArgsAssignment_3_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4285:1: ( rule__Terminates__ArgsAssignment_3_1 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_ID) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4285:2: rule__Terminates__ArgsAssignment_3_1
                    {
                    pushFollow(FOLLOW_rule__Terminates__ArgsAssignment_3_1_in_rule__Terminates__Group_3__1__Impl8583);
                    rule__Terminates__ArgsAssignment_3_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTerminatesAccess().getArgsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Terminates__Group_3__1__Impl


    // $ANTLR start rule__Terminates__Group_3__2
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4295:1: rule__Terminates__Group_3__2 : rule__Terminates__Group_3__2__Impl rule__Terminates__Group_3__3 ;
    public final void rule__Terminates__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4299:1: ( rule__Terminates__Group_3__2__Impl rule__Terminates__Group_3__3 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4300:2: rule__Terminates__Group_3__2__Impl rule__Terminates__Group_3__3
            {
            pushFollow(FOLLOW_rule__Terminates__Group_3__2__Impl_in_rule__Terminates__Group_3__28614);
            rule__Terminates__Group_3__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Terminates__Group_3__3_in_rule__Terminates__Group_3__28617);
            rule__Terminates__Group_3__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Terminates__Group_3__2


    // $ANTLR start rule__Terminates__Group_3__2__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4307:1: rule__Terminates__Group_3__2__Impl : ( ( rule__Terminates__Group_3_2__0 )* ) ;
    public final void rule__Terminates__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4311:1: ( ( ( rule__Terminates__Group_3_2__0 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4312:1: ( ( rule__Terminates__Group_3_2__0 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4312:1: ( ( rule__Terminates__Group_3_2__0 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4313:1: ( rule__Terminates__Group_3_2__0 )*
            {
             before(grammarAccess.getTerminatesAccess().getGroup_3_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4314:1: ( rule__Terminates__Group_3_2__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==21) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4314:2: rule__Terminates__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Terminates__Group_3_2__0_in_rule__Terminates__Group_3__2__Impl8644);
            	    rule__Terminates__Group_3_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getTerminatesAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Terminates__Group_3__2__Impl


    // $ANTLR start rule__Terminates__Group_3__3
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4324:1: rule__Terminates__Group_3__3 : rule__Terminates__Group_3__3__Impl ;
    public final void rule__Terminates__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4328:1: ( rule__Terminates__Group_3__3__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4329:2: rule__Terminates__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__Terminates__Group_3__3__Impl_in_rule__Terminates__Group_3__38675);
            rule__Terminates__Group_3__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Terminates__Group_3__3


    // $ANTLR start rule__Terminates__Group_3__3__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4335:1: rule__Terminates__Group_3__3__Impl : ( ')' ) ;
    public final void rule__Terminates__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4339:1: ( ( ')' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4340:1: ( ')' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4340:1: ( ')' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4341:1: ')'
            {
             before(grammarAccess.getTerminatesAccess().getRightParenthesisKeyword_3_3()); 
            match(input,23,FOLLOW_23_in_rule__Terminates__Group_3__3__Impl8703); 
             after(grammarAccess.getTerminatesAccess().getRightParenthesisKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Terminates__Group_3__3__Impl


    // $ANTLR start rule__Terminates__Group_3_2__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4362:1: rule__Terminates__Group_3_2__0 : rule__Terminates__Group_3_2__0__Impl rule__Terminates__Group_3_2__1 ;
    public final void rule__Terminates__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4366:1: ( rule__Terminates__Group_3_2__0__Impl rule__Terminates__Group_3_2__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4367:2: rule__Terminates__Group_3_2__0__Impl rule__Terminates__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__Terminates__Group_3_2__0__Impl_in_rule__Terminates__Group_3_2__08742);
            rule__Terminates__Group_3_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Terminates__Group_3_2__1_in_rule__Terminates__Group_3_2__08745);
            rule__Terminates__Group_3_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Terminates__Group_3_2__0


    // $ANTLR start rule__Terminates__Group_3_2__0__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4374:1: rule__Terminates__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__Terminates__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4378:1: ( ( ',' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4379:1: ( ',' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4379:1: ( ',' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4380:1: ','
            {
             before(grammarAccess.getTerminatesAccess().getCommaKeyword_3_2_0()); 
            match(input,21,FOLLOW_21_in_rule__Terminates__Group_3_2__0__Impl8773); 
             after(grammarAccess.getTerminatesAccess().getCommaKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Terminates__Group_3_2__0__Impl


    // $ANTLR start rule__Terminates__Group_3_2__1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4393:1: rule__Terminates__Group_3_2__1 : rule__Terminates__Group_3_2__1__Impl ;
    public final void rule__Terminates__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4397:1: ( rule__Terminates__Group_3_2__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4398:2: rule__Terminates__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Terminates__Group_3_2__1__Impl_in_rule__Terminates__Group_3_2__18804);
            rule__Terminates__Group_3_2__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Terminates__Group_3_2__1


    // $ANTLR start rule__Terminates__Group_3_2__1__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4404:1: rule__Terminates__Group_3_2__1__Impl : ( ( rule__Terminates__ArgsAssignment_3_2_1 ) ) ;
    public final void rule__Terminates__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4408:1: ( ( ( rule__Terminates__ArgsAssignment_3_2_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4409:1: ( ( rule__Terminates__ArgsAssignment_3_2_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4409:1: ( ( rule__Terminates__ArgsAssignment_3_2_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4410:1: ( rule__Terminates__ArgsAssignment_3_2_1 )
            {
             before(grammarAccess.getTerminatesAccess().getArgsAssignment_3_2_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4411:1: ( rule__Terminates__ArgsAssignment_3_2_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4411:2: rule__Terminates__ArgsAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__Terminates__ArgsAssignment_3_2_1_in_rule__Terminates__Group_3_2__1__Impl8831);
            rule__Terminates__ArgsAssignment_3_2_1();
            _fsp--;


            }

             after(grammarAccess.getTerminatesAccess().getArgsAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Terminates__Group_3_2__1__Impl


    // $ANTLR start rule__Terminates__Group_6__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4425:1: rule__Terminates__Group_6__0 : rule__Terminates__Group_6__0__Impl rule__Terminates__Group_6__1 ;
    public final void rule__Terminates__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4429:1: ( rule__Terminates__Group_6__0__Impl rule__Terminates__Group_6__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4430:2: rule__Terminates__Group_6__0__Impl rule__Terminates__Group_6__1
            {
            pushFollow(FOLLOW_rule__Terminates__Group_6__0__Impl_in_rule__Terminates__Group_6__08865);
            rule__Terminates__Group_6__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Terminates__Group_6__1_in_rule__Terminates__Group_6__08868);
            rule__Terminates__Group_6__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Terminates__Group_6__0


    // $ANTLR start rule__Terminates__Group_6__0__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4437:1: rule__Terminates__Group_6__0__Impl : ( '(' ) ;
    public final void rule__Terminates__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4441:1: ( ( '(' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4442:1: ( '(' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4442:1: ( '(' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4443:1: '('
            {
             before(grammarAccess.getTerminatesAccess().getLeftParenthesisKeyword_6_0()); 
            match(input,22,FOLLOW_22_in_rule__Terminates__Group_6__0__Impl8896); 
             after(grammarAccess.getTerminatesAccess().getLeftParenthesisKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Terminates__Group_6__0__Impl


    // $ANTLR start rule__Terminates__Group_6__1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4456:1: rule__Terminates__Group_6__1 : rule__Terminates__Group_6__1__Impl rule__Terminates__Group_6__2 ;
    public final void rule__Terminates__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4460:1: ( rule__Terminates__Group_6__1__Impl rule__Terminates__Group_6__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4461:2: rule__Terminates__Group_6__1__Impl rule__Terminates__Group_6__2
            {
            pushFollow(FOLLOW_rule__Terminates__Group_6__1__Impl_in_rule__Terminates__Group_6__18927);
            rule__Terminates__Group_6__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Terminates__Group_6__2_in_rule__Terminates__Group_6__18930);
            rule__Terminates__Group_6__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Terminates__Group_6__1


    // $ANTLR start rule__Terminates__Group_6__1__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4468:1: rule__Terminates__Group_6__1__Impl : ( ( rule__Terminates__Args2Assignment_6_1 )? ) ;
    public final void rule__Terminates__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4472:1: ( ( ( rule__Terminates__Args2Assignment_6_1 )? ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4473:1: ( ( rule__Terminates__Args2Assignment_6_1 )? )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4473:1: ( ( rule__Terminates__Args2Assignment_6_1 )? )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4474:1: ( rule__Terminates__Args2Assignment_6_1 )?
            {
             before(grammarAccess.getTerminatesAccess().getArgs2Assignment_6_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4475:1: ( rule__Terminates__Args2Assignment_6_1 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4475:2: rule__Terminates__Args2Assignment_6_1
                    {
                    pushFollow(FOLLOW_rule__Terminates__Args2Assignment_6_1_in_rule__Terminates__Group_6__1__Impl8957);
                    rule__Terminates__Args2Assignment_6_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTerminatesAccess().getArgs2Assignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Terminates__Group_6__1__Impl


    // $ANTLR start rule__Terminates__Group_6__2
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4485:1: rule__Terminates__Group_6__2 : rule__Terminates__Group_6__2__Impl rule__Terminates__Group_6__3 ;
    public final void rule__Terminates__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4489:1: ( rule__Terminates__Group_6__2__Impl rule__Terminates__Group_6__3 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4490:2: rule__Terminates__Group_6__2__Impl rule__Terminates__Group_6__3
            {
            pushFollow(FOLLOW_rule__Terminates__Group_6__2__Impl_in_rule__Terminates__Group_6__28988);
            rule__Terminates__Group_6__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Terminates__Group_6__3_in_rule__Terminates__Group_6__28991);
            rule__Terminates__Group_6__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Terminates__Group_6__2


    // $ANTLR start rule__Terminates__Group_6__2__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4497:1: rule__Terminates__Group_6__2__Impl : ( ( rule__Terminates__Group_6_2__0 )* ) ;
    public final void rule__Terminates__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4501:1: ( ( ( rule__Terminates__Group_6_2__0 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4502:1: ( ( rule__Terminates__Group_6_2__0 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4502:1: ( ( rule__Terminates__Group_6_2__0 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4503:1: ( rule__Terminates__Group_6_2__0 )*
            {
             before(grammarAccess.getTerminatesAccess().getGroup_6_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4504:1: ( rule__Terminates__Group_6_2__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==21) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4504:2: rule__Terminates__Group_6_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Terminates__Group_6_2__0_in_rule__Terminates__Group_6__2__Impl9018);
            	    rule__Terminates__Group_6_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getTerminatesAccess().getGroup_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Terminates__Group_6__2__Impl


    // $ANTLR start rule__Terminates__Group_6__3
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4514:1: rule__Terminates__Group_6__3 : rule__Terminates__Group_6__3__Impl ;
    public final void rule__Terminates__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4518:1: ( rule__Terminates__Group_6__3__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4519:2: rule__Terminates__Group_6__3__Impl
            {
            pushFollow(FOLLOW_rule__Terminates__Group_6__3__Impl_in_rule__Terminates__Group_6__39049);
            rule__Terminates__Group_6__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Terminates__Group_6__3


    // $ANTLR start rule__Terminates__Group_6__3__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4525:1: rule__Terminates__Group_6__3__Impl : ( ')' ) ;
    public final void rule__Terminates__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4529:1: ( ( ')' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4530:1: ( ')' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4530:1: ( ')' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4531:1: ')'
            {
             before(grammarAccess.getTerminatesAccess().getRightParenthesisKeyword_6_3()); 
            match(input,23,FOLLOW_23_in_rule__Terminates__Group_6__3__Impl9077); 
             after(grammarAccess.getTerminatesAccess().getRightParenthesisKeyword_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Terminates__Group_6__3__Impl


    // $ANTLR start rule__Terminates__Group_6_2__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4552:1: rule__Terminates__Group_6_2__0 : rule__Terminates__Group_6_2__0__Impl rule__Terminates__Group_6_2__1 ;
    public final void rule__Terminates__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4556:1: ( rule__Terminates__Group_6_2__0__Impl rule__Terminates__Group_6_2__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4557:2: rule__Terminates__Group_6_2__0__Impl rule__Terminates__Group_6_2__1
            {
            pushFollow(FOLLOW_rule__Terminates__Group_6_2__0__Impl_in_rule__Terminates__Group_6_2__09116);
            rule__Terminates__Group_6_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Terminates__Group_6_2__1_in_rule__Terminates__Group_6_2__09119);
            rule__Terminates__Group_6_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Terminates__Group_6_2__0


    // $ANTLR start rule__Terminates__Group_6_2__0__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4564:1: rule__Terminates__Group_6_2__0__Impl : ( ',' ) ;
    public final void rule__Terminates__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4568:1: ( ( ',' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4569:1: ( ',' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4569:1: ( ',' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4570:1: ','
            {
             before(grammarAccess.getTerminatesAccess().getCommaKeyword_6_2_0()); 
            match(input,21,FOLLOW_21_in_rule__Terminates__Group_6_2__0__Impl9147); 
             after(grammarAccess.getTerminatesAccess().getCommaKeyword_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Terminates__Group_6_2__0__Impl


    // $ANTLR start rule__Terminates__Group_6_2__1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4583:1: rule__Terminates__Group_6_2__1 : rule__Terminates__Group_6_2__1__Impl ;
    public final void rule__Terminates__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4587:1: ( rule__Terminates__Group_6_2__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4588:2: rule__Terminates__Group_6_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Terminates__Group_6_2__1__Impl_in_rule__Terminates__Group_6_2__19178);
            rule__Terminates__Group_6_2__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Terminates__Group_6_2__1


    // $ANTLR start rule__Terminates__Group_6_2__1__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4594:1: rule__Terminates__Group_6_2__1__Impl : ( ( rule__Terminates__Args2Assignment_6_2_1 ) ) ;
    public final void rule__Terminates__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4598:1: ( ( ( rule__Terminates__Args2Assignment_6_2_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4599:1: ( ( rule__Terminates__Args2Assignment_6_2_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4599:1: ( ( rule__Terminates__Args2Assignment_6_2_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4600:1: ( rule__Terminates__Args2Assignment_6_2_1 )
            {
             before(grammarAccess.getTerminatesAccess().getArgs2Assignment_6_2_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4601:1: ( rule__Terminates__Args2Assignment_6_2_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4601:2: rule__Terminates__Args2Assignment_6_2_1
            {
            pushFollow(FOLLOW_rule__Terminates__Args2Assignment_6_2_1_in_rule__Terminates__Group_6_2__1__Impl9205);
            rule__Terminates__Args2Assignment_6_2_1();
            _fsp--;


            }

             after(grammarAccess.getTerminatesAccess().getArgs2Assignment_6_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Terminates__Group_6_2__1__Impl


    // $ANTLR start rule__Path__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4615:1: rule__Path__Group__0 : rule__Path__Group__0__Impl rule__Path__Group__1 ;
    public final void rule__Path__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4619:1: ( rule__Path__Group__0__Impl rule__Path__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4620:2: rule__Path__Group__0__Impl rule__Path__Group__1
            {
            pushFollow(FOLLOW_rule__Path__Group__0__Impl_in_rule__Path__Group__09239);
            rule__Path__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Path__Group__1_in_rule__Path__Group__09242);
            rule__Path__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Path__Group__0


    // $ANTLR start rule__Path__Group__0__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4627:1: rule__Path__Group__0__Impl : ( ( rule__Path__FilesAssignment_0 ) ) ;
    public final void rule__Path__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4631:1: ( ( ( rule__Path__FilesAssignment_0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4632:1: ( ( rule__Path__FilesAssignment_0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4632:1: ( ( rule__Path__FilesAssignment_0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4633:1: ( rule__Path__FilesAssignment_0 )
            {
             before(grammarAccess.getPathAccess().getFilesAssignment_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4634:1: ( rule__Path__FilesAssignment_0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4634:2: rule__Path__FilesAssignment_0
            {
            pushFollow(FOLLOW_rule__Path__FilesAssignment_0_in_rule__Path__Group__0__Impl9269);
            rule__Path__FilesAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getPathAccess().getFilesAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Path__Group__0__Impl


    // $ANTLR start rule__Path__Group__1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4644:1: rule__Path__Group__1 : rule__Path__Group__1__Impl ;
    public final void rule__Path__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4648:1: ( rule__Path__Group__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4649:2: rule__Path__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Path__Group__1__Impl_in_rule__Path__Group__19299);
            rule__Path__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Path__Group__1


    // $ANTLR start rule__Path__Group__1__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4655:1: rule__Path__Group__1__Impl : ( ( rule__Path__Group_1__0 )* ) ;
    public final void rule__Path__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4659:1: ( ( ( rule__Path__Group_1__0 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4660:1: ( ( rule__Path__Group_1__0 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4660:1: ( ( rule__Path__Group_1__0 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4661:1: ( rule__Path__Group_1__0 )*
            {
             before(grammarAccess.getPathAccess().getGroup_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4662:1: ( rule__Path__Group_1__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==33) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4662:2: rule__Path__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Path__Group_1__0_in_rule__Path__Group__1__Impl9326);
            	    rule__Path__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

             after(grammarAccess.getPathAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Path__Group__1__Impl


    // $ANTLR start rule__Path__Group_1__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4676:1: rule__Path__Group_1__0 : rule__Path__Group_1__0__Impl rule__Path__Group_1__1 ;
    public final void rule__Path__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4680:1: ( rule__Path__Group_1__0__Impl rule__Path__Group_1__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4681:2: rule__Path__Group_1__0__Impl rule__Path__Group_1__1
            {
            pushFollow(FOLLOW_rule__Path__Group_1__0__Impl_in_rule__Path__Group_1__09361);
            rule__Path__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Path__Group_1__1_in_rule__Path__Group_1__09364);
            rule__Path__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Path__Group_1__0


    // $ANTLR start rule__Path__Group_1__0__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4688:1: rule__Path__Group_1__0__Impl : ( '/' ) ;
    public final void rule__Path__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4692:1: ( ( '/' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4693:1: ( '/' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4693:1: ( '/' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4694:1: '/'
            {
             before(grammarAccess.getPathAccess().getSolidusKeyword_1_0()); 
            match(input,33,FOLLOW_33_in_rule__Path__Group_1__0__Impl9392); 
             after(grammarAccess.getPathAccess().getSolidusKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Path__Group_1__0__Impl


    // $ANTLR start rule__Path__Group_1__1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4707:1: rule__Path__Group_1__1 : rule__Path__Group_1__1__Impl ;
    public final void rule__Path__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4711:1: ( rule__Path__Group_1__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4712:2: rule__Path__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Path__Group_1__1__Impl_in_rule__Path__Group_1__19423);
            rule__Path__Group_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Path__Group_1__1


    // $ANTLR start rule__Path__Group_1__1__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4718:1: rule__Path__Group_1__1__Impl : ( ( rule__Path__FilesAssignment_1_1 ) ) ;
    public final void rule__Path__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4722:1: ( ( ( rule__Path__FilesAssignment_1_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4723:1: ( ( rule__Path__FilesAssignment_1_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4723:1: ( ( rule__Path__FilesAssignment_1_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4724:1: ( rule__Path__FilesAssignment_1_1 )
            {
             before(grammarAccess.getPathAccess().getFilesAssignment_1_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4725:1: ( rule__Path__FilesAssignment_1_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4725:2: rule__Path__FilesAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Path__FilesAssignment_1_1_in_rule__Path__Group_1__1__Impl9450);
            rule__Path__FilesAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getPathAccess().getFilesAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Path__Group_1__1__Impl


    // $ANTLR start rule__File__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4739:1: rule__File__Group__0 : rule__File__Group__0__Impl rule__File__Group__1 ;
    public final void rule__File__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4743:1: ( rule__File__Group__0__Impl rule__File__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4744:2: rule__File__Group__0__Impl rule__File__Group__1
            {
            pushFollow(FOLLOW_rule__File__Group__0__Impl_in_rule__File__Group__09484);
            rule__File__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__File__Group__1_in_rule__File__Group__09487);
            rule__File__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__File__Group__0


    // $ANTLR start rule__File__Group__0__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4751:1: rule__File__Group__0__Impl : ( ( rule__File__NamesAssignment_0 ) ) ;
    public final void rule__File__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4755:1: ( ( ( rule__File__NamesAssignment_0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4756:1: ( ( rule__File__NamesAssignment_0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4756:1: ( ( rule__File__NamesAssignment_0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4757:1: ( rule__File__NamesAssignment_0 )
            {
             before(grammarAccess.getFileAccess().getNamesAssignment_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4758:1: ( rule__File__NamesAssignment_0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4758:2: rule__File__NamesAssignment_0
            {
            pushFollow(FOLLOW_rule__File__NamesAssignment_0_in_rule__File__Group__0__Impl9514);
            rule__File__NamesAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getFileAccess().getNamesAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__File__Group__0__Impl


    // $ANTLR start rule__File__Group__1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4768:1: rule__File__Group__1 : rule__File__Group__1__Impl ;
    public final void rule__File__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4772:1: ( rule__File__Group__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4773:2: rule__File__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__File__Group__1__Impl_in_rule__File__Group__19544);
            rule__File__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__File__Group__1


    // $ANTLR start rule__File__Group__1__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4779:1: rule__File__Group__1__Impl : ( ( rule__File__Group_1__0 )* ) ;
    public final void rule__File__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4783:1: ( ( ( rule__File__Group_1__0 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4784:1: ( ( rule__File__Group_1__0 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4784:1: ( ( rule__File__Group_1__0 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4785:1: ( rule__File__Group_1__0 )*
            {
             before(grammarAccess.getFileAccess().getGroup_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4786:1: ( rule__File__Group_1__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==18) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4786:2: rule__File__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__File__Group_1__0_in_rule__File__Group__1__Impl9571);
            	    rule__File__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

             after(grammarAccess.getFileAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__File__Group__1__Impl


    // $ANTLR start rule__File__Group_1__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4800:1: rule__File__Group_1__0 : rule__File__Group_1__0__Impl rule__File__Group_1__1 ;
    public final void rule__File__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4804:1: ( rule__File__Group_1__0__Impl rule__File__Group_1__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4805:2: rule__File__Group_1__0__Impl rule__File__Group_1__1
            {
            pushFollow(FOLLOW_rule__File__Group_1__0__Impl_in_rule__File__Group_1__09606);
            rule__File__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__File__Group_1__1_in_rule__File__Group_1__09609);
            rule__File__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__File__Group_1__0


    // $ANTLR start rule__File__Group_1__0__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4812:1: rule__File__Group_1__0__Impl : ( '.' ) ;
    public final void rule__File__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4816:1: ( ( '.' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4817:1: ( '.' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4817:1: ( '.' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4818:1: '.'
            {
             before(grammarAccess.getFileAccess().getFullStopKeyword_1_0()); 
            match(input,18,FOLLOW_18_in_rule__File__Group_1__0__Impl9637); 
             after(grammarAccess.getFileAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__File__Group_1__0__Impl


    // $ANTLR start rule__File__Group_1__1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4831:1: rule__File__Group_1__1 : rule__File__Group_1__1__Impl ;
    public final void rule__File__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4835:1: ( rule__File__Group_1__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4836:2: rule__File__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__File__Group_1__1__Impl_in_rule__File__Group_1__19668);
            rule__File__Group_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__File__Group_1__1


    // $ANTLR start rule__File__Group_1__1__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4842:1: rule__File__Group_1__1__Impl : ( ( rule__File__NamesAssignment_1_1 ) ) ;
    public final void rule__File__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4846:1: ( ( ( rule__File__NamesAssignment_1_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4847:1: ( ( rule__File__NamesAssignment_1_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4847:1: ( ( rule__File__NamesAssignment_1_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4848:1: ( rule__File__NamesAssignment_1_1 )
            {
             before(grammarAccess.getFileAccess().getNamesAssignment_1_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4849:1: ( rule__File__NamesAssignment_1_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4849:2: rule__File__NamesAssignment_1_1
            {
            pushFollow(FOLLOW_rule__File__NamesAssignment_1_1_in_rule__File__Group_1__1__Impl9695);
            rule__File__NamesAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getFileAccess().getNamesAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__File__Group_1__1__Impl


    // $ANTLR start rule__Knowledge__ImportsAssignment_0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4864:1: rule__Knowledge__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__Knowledge__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4868:1: ( ( ruleImport ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4869:1: ( ruleImport )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4869:1: ( ruleImport )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4870:1: ruleImport
            {
             before(grammarAccess.getKnowledgeAccess().getImportsImportParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__Knowledge__ImportsAssignment_09734);
            ruleImport();
            _fsp--;

             after(grammarAccess.getKnowledgeAccess().getImportsImportParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Knowledge__ImportsAssignment_0


    // $ANTLR start rule__Knowledge__EntitiesAssignment_1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4879:1: rule__Knowledge__EntitiesAssignment_1 : ( ruleEntity ) ;
    public final void rule__Knowledge__EntitiesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4883:1: ( ( ruleEntity ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4884:1: ( ruleEntity )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4884:1: ( ruleEntity )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4885:1: ruleEntity
            {
             before(grammarAccess.getKnowledgeAccess().getEntitiesEntityParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEntity_in_rule__Knowledge__EntitiesAssignment_19765);
            ruleEntity();
            _fsp--;

             after(grammarAccess.getKnowledgeAccess().getEntitiesEntityParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Knowledge__EntitiesAssignment_1


    // $ANTLR start rule__Knowledge__RulesAssignment_2_0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4894:1: rule__Knowledge__RulesAssignment_2_0 : ( ruleRule ) ;
    public final void rule__Knowledge__RulesAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4898:1: ( ( ruleRule ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4899:1: ( ruleRule )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4899:1: ( ruleRule )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4900:1: ruleRule
            {
             before(grammarAccess.getKnowledgeAccess().getRulesRuleParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleRule_in_rule__Knowledge__RulesAssignment_2_09796);
            ruleRule();
            _fsp--;

             after(grammarAccess.getKnowledgeAccess().getRulesRuleParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Knowledge__RulesAssignment_2_0


    // $ANTLR start rule__Knowledge__VarsAssignment_3
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4909:1: rule__Knowledge__VarsAssignment_3 : ( ruleVar ) ;
    public final void rule__Knowledge__VarsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4913:1: ( ( ruleVar ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4914:1: ( ruleVar )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4914:1: ( ruleVar )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4915:1: ruleVar
            {
             before(grammarAccess.getKnowledgeAccess().getVarsVarParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleVar_in_rule__Knowledge__VarsAssignment_39827);
            ruleVar();
            _fsp--;

             after(grammarAccess.getKnowledgeAccess().getVarsVarParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Knowledge__VarsAssignment_3


    // $ANTLR start rule__Rule__DeclAssignment_0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4924:1: rule__Rule__DeclAssignment_0 : ( ruleVarDecl ) ;
    public final void rule__Rule__DeclAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4928:1: ( ( ruleVarDecl ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4929:1: ( ruleVarDecl )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4929:1: ( ruleVarDecl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4930:1: ruleVarDecl
            {
             before(grammarAccess.getRuleAccess().getDeclVarDeclParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleVarDecl_in_rule__Rule__DeclAssignment_09858);
            ruleVarDecl();
            _fsp--;

             after(grammarAccess.getRuleAccess().getDeclVarDeclParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Rule__DeclAssignment_0


    // $ANTLR start rule__Rule__ExprAssignment_1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4939:1: rule__Rule__ExprAssignment_1 : ( ruleBoolExpr ) ;
    public final void rule__Rule__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4943:1: ( ( ruleBoolExpr ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4944:1: ( ruleBoolExpr )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4944:1: ( ruleBoolExpr )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4945:1: ruleBoolExpr
            {
             before(grammarAccess.getRuleAccess().getExprBoolExprParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleBoolExpr_in_rule__Rule__ExprAssignment_19889);
            ruleBoolExpr();
            _fsp--;

             after(grammarAccess.getRuleAccess().getExprBoolExprParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Rule__ExprAssignment_1


    // $ANTLR start rule__VarDecl__VarsAssignment_1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4954:1: rule__VarDecl__VarsAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__VarDecl__VarsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4958:1: ( ( ( RULE_ID ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4959:1: ( ( RULE_ID ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4959:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4960:1: ( RULE_ID )
            {
             before(grammarAccess.getVarDeclAccess().getVarsVarCrossReference_1_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4961:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4962:1: RULE_ID
            {
             before(grammarAccess.getVarDeclAccess().getVarsVarIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VarDecl__VarsAssignment_19924); 
             after(grammarAccess.getVarDeclAccess().getVarsVarIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getVarDeclAccess().getVarsVarCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VarDecl__VarsAssignment_1


    // $ANTLR start rule__VarDecl__VarsAssignment_2_1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4973:1: rule__VarDecl__VarsAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__VarDecl__VarsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4977:1: ( ( ( RULE_ID ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4978:1: ( ( RULE_ID ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4978:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4979:1: ( RULE_ID )
            {
             before(grammarAccess.getVarDeclAccess().getVarsVarCrossReference_2_1_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4980:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4981:1: RULE_ID
            {
             before(grammarAccess.getVarDeclAccess().getVarsVarIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VarDecl__VarsAssignment_2_19963); 
             after(grammarAccess.getVarDeclAccess().getVarsVarIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getVarDeclAccess().getVarsVarCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VarDecl__VarsAssignment_2_1


    // $ANTLR start rule__IntTerm__ConstAssignment_0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4992:1: rule__IntTerm__ConstAssignment_0 : ( RULE_INT ) ;
    public final void rule__IntTerm__ConstAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4996:1: ( ( RULE_INT ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4997:1: ( RULE_INT )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4997:1: ( RULE_INT )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4998:1: RULE_INT
            {
             before(grammarAccess.getIntTermAccess().getConstINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IntTerm__ConstAssignment_09998); 
             after(grammarAccess.getIntTermAccess().getConstINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntTerm__ConstAssignment_0


    // $ANTLR start rule__IntTerm__VarAssignment_1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5007:1: rule__IntTerm__VarAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__IntTerm__VarAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5011:1: ( ( ( RULE_ID ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5012:1: ( ( RULE_ID ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5012:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5013:1: ( RULE_ID )
            {
             before(grammarAccess.getIntTermAccess().getVarVarCrossReference_1_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5014:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5015:1: RULE_ID
            {
             before(grammarAccess.getIntTermAccess().getVarVarIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__IntTerm__VarAssignment_110033); 
             after(grammarAccess.getIntTermAccess().getVarVarIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getIntTermAccess().getVarVarCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntTerm__VarAssignment_1


    // $ANTLR start rule__BinaryIntExpr__OprAssignment_0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5026:1: rule__BinaryIntExpr__OprAssignment_0 : ( ruleIntTerm ) ;
    public final void rule__BinaryIntExpr__OprAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5030:1: ( ( ruleIntTerm ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5031:1: ( ruleIntTerm )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5031:1: ( ruleIntTerm )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5032:1: ruleIntTerm
            {
             before(grammarAccess.getBinaryIntExprAccess().getOprIntTermParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleIntTerm_in_rule__BinaryIntExpr__OprAssignment_010068);
            ruleIntTerm();
            _fsp--;

             after(grammarAccess.getBinaryIntExprAccess().getOprIntTermParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BinaryIntExpr__OprAssignment_0


    // $ANTLR start rule__BinaryIntExpr__BinaryopAssignment_1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5041:1: rule__BinaryIntExpr__BinaryopAssignment_1 : ( ruleBinaryIntOp ) ;
    public final void rule__BinaryIntExpr__BinaryopAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5045:1: ( ( ruleBinaryIntOp ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5046:1: ( ruleBinaryIntOp )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5046:1: ( ruleBinaryIntOp )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5047:1: ruleBinaryIntOp
            {
             before(grammarAccess.getBinaryIntExprAccess().getBinaryopBinaryIntOpEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleBinaryIntOp_in_rule__BinaryIntExpr__BinaryopAssignment_110099);
            ruleBinaryIntOp();
            _fsp--;

             after(grammarAccess.getBinaryIntExprAccess().getBinaryopBinaryIntOpEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BinaryIntExpr__BinaryopAssignment_1


    // $ANTLR start rule__BinaryIntExpr__OprAssignment_2
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5056:1: rule__BinaryIntExpr__OprAssignment_2 : ( ruleIntTerm ) ;
    public final void rule__BinaryIntExpr__OprAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5060:1: ( ( ruleIntTerm ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5061:1: ( ruleIntTerm )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5061:1: ( ruleIntTerm )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5062:1: ruleIntTerm
            {
             before(grammarAccess.getBinaryIntExprAccess().getOprIntTermParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleIntTerm_in_rule__BinaryIntExpr__OprAssignment_210130);
            ruleIntTerm();
            _fsp--;

             after(grammarAccess.getBinaryIntExprAccess().getOprIntTermParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BinaryIntExpr__OprAssignment_2


    // $ANTLR start rule__UnaryBoolExpr__Unaryop_lhsAssignment_0_0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5071:1: rule__UnaryBoolExpr__Unaryop_lhsAssignment_0_0 : ( ruleUnaryBoolOp ) ;
    public final void rule__UnaryBoolExpr__Unaryop_lhsAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5075:1: ( ( ruleUnaryBoolOp ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5076:1: ( ruleUnaryBoolOp )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5076:1: ( ruleUnaryBoolOp )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5077:1: ruleUnaryBoolOp
            {
             before(grammarAccess.getUnaryBoolExprAccess().getUnaryop_lhsUnaryBoolOpEnumRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleUnaryBoolOp_in_rule__UnaryBoolExpr__Unaryop_lhsAssignment_0_010161);
            ruleUnaryBoolOp();
            _fsp--;

             after(grammarAccess.getUnaryBoolExprAccess().getUnaryop_lhsUnaryBoolOpEnumRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnaryBoolExpr__Unaryop_lhsAssignment_0_0


    // $ANTLR start rule__UnaryBoolExpr__OprAssignment_0_1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5086:1: rule__UnaryBoolExpr__OprAssignment_0_1 : ( ruleBoolExpr ) ;
    public final void rule__UnaryBoolExpr__OprAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5090:1: ( ( ruleBoolExpr ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5091:1: ( ruleBoolExpr )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5091:1: ( ruleBoolExpr )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5092:1: ruleBoolExpr
            {
             before(grammarAccess.getUnaryBoolExprAccess().getOprBoolExprParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_ruleBoolExpr_in_rule__UnaryBoolExpr__OprAssignment_0_110192);
            ruleBoolExpr();
            _fsp--;

             after(grammarAccess.getUnaryBoolExprAccess().getOprBoolExprParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnaryBoolExpr__OprAssignment_0_1


    // $ANTLR start rule__UnaryBoolExpr__OpsAssignment_1_1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5101:1: rule__UnaryBoolExpr__OpsAssignment_1_1 : ( ruleBoolExpr ) ;
    public final void rule__UnaryBoolExpr__OpsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5105:1: ( ( ruleBoolExpr ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5106:1: ( ruleBoolExpr )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5106:1: ( ruleBoolExpr )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5107:1: ruleBoolExpr
            {
             before(grammarAccess.getUnaryBoolExprAccess().getOpsBoolExprParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleBoolExpr_in_rule__UnaryBoolExpr__OpsAssignment_1_110223);
            ruleBoolExpr();
            _fsp--;

             after(grammarAccess.getUnaryBoolExprAccess().getOpsBoolExprParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnaryBoolExpr__OpsAssignment_1_1


    // $ANTLR start rule__BinaryBoolExpr__OprAssignment_0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5116:1: rule__BinaryBoolExpr__OprAssignment_0 : ( ruleTemporalPredicate ) ;
    public final void rule__BinaryBoolExpr__OprAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5120:1: ( ( ruleTemporalPredicate ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5121:1: ( ruleTemporalPredicate )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5121:1: ( ruleTemporalPredicate )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5122:1: ruleTemporalPredicate
            {
             before(grammarAccess.getBinaryBoolExprAccess().getOprTemporalPredicateParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleTemporalPredicate_in_rule__BinaryBoolExpr__OprAssignment_010254);
            ruleTemporalPredicate();
            _fsp--;

             after(grammarAccess.getBinaryBoolExprAccess().getOprTemporalPredicateParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BinaryBoolExpr__OprAssignment_0


    // $ANTLR start rule__BinaryBoolExpr__BinaryopAssignment_1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5131:1: rule__BinaryBoolExpr__BinaryopAssignment_1 : ( ruleBinaryBoolOp ) ;
    public final void rule__BinaryBoolExpr__BinaryopAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5135:1: ( ( ruleBinaryBoolOp ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5136:1: ( ruleBinaryBoolOp )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5136:1: ( ruleBinaryBoolOp )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5137:1: ruleBinaryBoolOp
            {
             before(grammarAccess.getBinaryBoolExprAccess().getBinaryopBinaryBoolOpEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleBinaryBoolOp_in_rule__BinaryBoolExpr__BinaryopAssignment_110285);
            ruleBinaryBoolOp();
            _fsp--;

             after(grammarAccess.getBinaryBoolExprAccess().getBinaryopBinaryBoolOpEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BinaryBoolExpr__BinaryopAssignment_1


    // $ANTLR start rule__BinaryBoolExpr__OprAssignment_2
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5146:1: rule__BinaryBoolExpr__OprAssignment_2 : ( ruleBoolExpr ) ;
    public final void rule__BinaryBoolExpr__OprAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5150:1: ( ( ruleBoolExpr ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5151:1: ( ruleBoolExpr )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5151:1: ( ruleBoolExpr )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5152:1: ruleBoolExpr
            {
             before(grammarAccess.getBinaryBoolExprAccess().getOprBoolExprParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleBoolExpr_in_rule__BinaryBoolExpr__OprAssignment_210316);
            ruleBoolExpr();
            _fsp--;

             after(grammarAccess.getBinaryBoolExprAccess().getOprBoolExprParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BinaryBoolExpr__OprAssignment_2


    // $ANTLR start rule__Sort__NameAssignment_1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5161:1: rule__Sort__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Sort__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5165:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5166:1: ( RULE_ID )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5166:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5167:1: RULE_ID
            {
             before(grammarAccess.getSortAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Sort__NameAssignment_110347); 
             after(grammarAccess.getSortAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Sort__NameAssignment_1


    // $ANTLR start rule__Import__PathAssignment_1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5176:1: rule__Import__PathAssignment_1 : ( rulePath ) ;
    public final void rule__Import__PathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5180:1: ( ( rulePath ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5181:1: ( rulePath )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5181:1: ( rulePath )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5182:1: rulePath
            {
             before(grammarAccess.getImportAccess().getPathPathParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePath_in_rule__Import__PathAssignment_110378);
            rulePath();
            _fsp--;

             after(grammarAccess.getImportAccess().getPathPathParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Import__PathAssignment_1


    // $ANTLR start rule__Var__NameAssignment_1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5191:1: rule__Var__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Var__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5195:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5196:1: ( RULE_ID )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5196:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5197:1: RULE_ID
            {
             before(grammarAccess.getVarAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Var__NameAssignment_110409); 
             after(grammarAccess.getVarAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Var__NameAssignment_1


    // $ANTLR start rule__Var__MinAssignment_2
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5206:1: rule__Var__MinAssignment_2 : ( RULE_INT ) ;
    public final void rule__Var__MinAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5210:1: ( ( RULE_INT ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5211:1: ( RULE_INT )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5211:1: ( RULE_INT )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5212:1: RULE_INT
            {
             before(grammarAccess.getVarAccess().getMinINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Var__MinAssignment_210440); 
             after(grammarAccess.getVarAccess().getMinINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Var__MinAssignment_2


    // $ANTLR start rule__Var__MaxAssignment_3
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5221:1: rule__Var__MaxAssignment_3 : ( RULE_INT ) ;
    public final void rule__Var__MaxAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5225:1: ( ( RULE_INT ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5226:1: ( RULE_INT )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5226:1: ( RULE_INT )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5227:1: RULE_INT
            {
             before(grammarAccess.getVarAccess().getMaxINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Var__MaxAssignment_310471); 
             after(grammarAccess.getVarAccess().getMaxINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Var__MaxAssignment_3


    // $ANTLR start rule__Fluent__TermAssignment_1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5236:1: rule__Fluent__TermAssignment_1 : ( ruleTerm ) ;
    public final void rule__Fluent__TermAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5240:1: ( ( ruleTerm ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5241:1: ( ruleTerm )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5241:1: ( ruleTerm )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5242:1: ruleTerm
            {
             before(grammarAccess.getFluentAccess().getTermTermParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTerm_in_rule__Fluent__TermAssignment_110502);
            ruleTerm();
            _fsp--;

             after(grammarAccess.getFluentAccess().getTermTermParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fluent__TermAssignment_1


    // $ANTLR start rule__Event__TermAssignment_1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5251:1: rule__Event__TermAssignment_1 : ( ruleTerm ) ;
    public final void rule__Event__TermAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5255:1: ( ( ruleTerm ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5256:1: ( ruleTerm )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5256:1: ( ruleTerm )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5257:1: ruleTerm
            {
             before(grammarAccess.getEventAccess().getTermTermParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTerm_in_rule__Event__TermAssignment_110533);
            ruleTerm();
            _fsp--;

             after(grammarAccess.getEventAccess().getTermTermParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Event__TermAssignment_1


    // $ANTLR start rule__Term__NameAssignment_0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5266:1: rule__Term__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Term__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5270:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5271:1: ( RULE_ID )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5271:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5272:1: RULE_ID
            {
             before(grammarAccess.getTermAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Term__NameAssignment_010564); 
             after(grammarAccess.getTermAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Term__NameAssignment_0


    // $ANTLR start rule__Term__ArgsAssignment_1_1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5281:1: rule__Term__ArgsAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__Term__ArgsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5285:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5286:1: ( RULE_ID )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5286:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5287:1: RULE_ID
            {
             before(grammarAccess.getTermAccess().getArgsIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Term__ArgsAssignment_1_110595); 
             after(grammarAccess.getTermAccess().getArgsIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Term__ArgsAssignment_1_1


    // $ANTLR start rule__Term__ArgsAssignment_1_2_1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5296:1: rule__Term__ArgsAssignment_1_2_1 : ( RULE_ID ) ;
    public final void rule__Term__ArgsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5300:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5301:1: ( RULE_ID )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5301:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5302:1: RULE_ID
            {
             before(grammarAccess.getTermAccess().getArgsIDTerminalRuleCall_1_2_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Term__ArgsAssignment_1_2_110626); 
             after(grammarAccess.getTermAccess().getArgsIDTerminalRuleCall_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Term__ArgsAssignment_1_2_1


    // $ANTLR start rule__HoldsAt__FluentAssignment_2
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5311:1: rule__HoldsAt__FluentAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__HoldsAt__FluentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5315:1: ( ( ( RULE_ID ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5316:1: ( ( RULE_ID ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5316:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5317:1: ( RULE_ID )
            {
             before(grammarAccess.getHoldsAtAccess().getFluentTermCrossReference_2_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5318:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5319:1: RULE_ID
            {
             before(grammarAccess.getHoldsAtAccess().getFluentTermIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__HoldsAt__FluentAssignment_210661); 
             after(grammarAccess.getHoldsAtAccess().getFluentTermIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getHoldsAtAccess().getFluentTermCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__HoldsAt__FluentAssignment_2


    // $ANTLR start rule__HoldsAt__ArgsAssignment_3_1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5330:1: rule__HoldsAt__ArgsAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__HoldsAt__ArgsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5334:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5335:1: ( RULE_ID )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5335:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5336:1: RULE_ID
            {
             before(grammarAccess.getHoldsAtAccess().getArgsIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__HoldsAt__ArgsAssignment_3_110696); 
             after(grammarAccess.getHoldsAtAccess().getArgsIDTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__HoldsAt__ArgsAssignment_3_1


    // $ANTLR start rule__HoldsAt__ArgsAssignment_3_2_1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5345:1: rule__HoldsAt__ArgsAssignment_3_2_1 : ( RULE_ID ) ;
    public final void rule__HoldsAt__ArgsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5349:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5350:1: ( RULE_ID )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5350:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5351:1: RULE_ID
            {
             before(grammarAccess.getHoldsAtAccess().getArgsIDTerminalRuleCall_3_2_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__HoldsAt__ArgsAssignment_3_2_110727); 
             after(grammarAccess.getHoldsAtAccess().getArgsIDTerminalRuleCall_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__HoldsAt__ArgsAssignment_3_2_1


    // $ANTLR start rule__HoldsAt__TimeAssignment_5
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5360:1: rule__HoldsAt__TimeAssignment_5 : ( ruleIntExpr ) ;
    public final void rule__HoldsAt__TimeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5364:1: ( ( ruleIntExpr ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5365:1: ( ruleIntExpr )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5365:1: ( ruleIntExpr )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5366:1: ruleIntExpr
            {
             before(grammarAccess.getHoldsAtAccess().getTimeIntExprParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleIntExpr_in_rule__HoldsAt__TimeAssignment_510758);
            ruleIntExpr();
            _fsp--;

             after(grammarAccess.getHoldsAtAccess().getTimeIntExprParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__HoldsAt__TimeAssignment_5


    // $ANTLR start rule__Happens__EventAssignment_2
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5375:1: rule__Happens__EventAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Happens__EventAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5379:1: ( ( ( RULE_ID ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5380:1: ( ( RULE_ID ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5380:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5381:1: ( RULE_ID )
            {
             before(grammarAccess.getHappensAccess().getEventTermCrossReference_2_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5382:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5383:1: RULE_ID
            {
             before(grammarAccess.getHappensAccess().getEventTermIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Happens__EventAssignment_210793); 
             after(grammarAccess.getHappensAccess().getEventTermIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getHappensAccess().getEventTermCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Happens__EventAssignment_2


    // $ANTLR start rule__Happens__ArgsAssignment_3_1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5394:1: rule__Happens__ArgsAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__Happens__ArgsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5398:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5399:1: ( RULE_ID )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5399:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5400:1: RULE_ID
            {
             before(grammarAccess.getHappensAccess().getArgsIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Happens__ArgsAssignment_3_110828); 
             after(grammarAccess.getHappensAccess().getArgsIDTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Happens__ArgsAssignment_3_1


    // $ANTLR start rule__Happens__ArgsAssignment_3_2_1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5409:1: rule__Happens__ArgsAssignment_3_2_1 : ( RULE_ID ) ;
    public final void rule__Happens__ArgsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5413:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5414:1: ( RULE_ID )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5414:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5415:1: RULE_ID
            {
             before(grammarAccess.getHappensAccess().getArgsIDTerminalRuleCall_3_2_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Happens__ArgsAssignment_3_2_110859); 
             after(grammarAccess.getHappensAccess().getArgsIDTerminalRuleCall_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Happens__ArgsAssignment_3_2_1


    // $ANTLR start rule__Happens__TimeAssignment_5
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5424:1: rule__Happens__TimeAssignment_5 : ( ruleIntExpr ) ;
    public final void rule__Happens__TimeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5428:1: ( ( ruleIntExpr ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5429:1: ( ruleIntExpr )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5429:1: ( ruleIntExpr )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5430:1: ruleIntExpr
            {
             before(grammarAccess.getHappensAccess().getTimeIntExprParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleIntExpr_in_rule__Happens__TimeAssignment_510890);
            ruleIntExpr();
            _fsp--;

             after(grammarAccess.getHappensAccess().getTimeIntExprParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Happens__TimeAssignment_5


    // $ANTLR start rule__Initiates__EventAssignment_2
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5439:1: rule__Initiates__EventAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Initiates__EventAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5443:1: ( ( ( RULE_ID ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5444:1: ( ( RULE_ID ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5444:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5445:1: ( RULE_ID )
            {
             before(grammarAccess.getInitiatesAccess().getEventTermCrossReference_2_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5446:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5447:1: RULE_ID
            {
             before(grammarAccess.getInitiatesAccess().getEventTermIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Initiates__EventAssignment_210925); 
             after(grammarAccess.getInitiatesAccess().getEventTermIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getInitiatesAccess().getEventTermCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Initiates__EventAssignment_2


    // $ANTLR start rule__Initiates__ArgsAssignment_3_1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5458:1: rule__Initiates__ArgsAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__Initiates__ArgsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5462:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5463:1: ( RULE_ID )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5463:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5464:1: RULE_ID
            {
             before(grammarAccess.getInitiatesAccess().getArgsIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Initiates__ArgsAssignment_3_110960); 
             after(grammarAccess.getInitiatesAccess().getArgsIDTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Initiates__ArgsAssignment_3_1


    // $ANTLR start rule__Initiates__ArgsAssignment_3_2_1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5473:1: rule__Initiates__ArgsAssignment_3_2_1 : ( RULE_ID ) ;
    public final void rule__Initiates__ArgsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5477:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5478:1: ( RULE_ID )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5478:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5479:1: RULE_ID
            {
             before(grammarAccess.getInitiatesAccess().getArgsIDTerminalRuleCall_3_2_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Initiates__ArgsAssignment_3_2_110991); 
             after(grammarAccess.getInitiatesAccess().getArgsIDTerminalRuleCall_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Initiates__ArgsAssignment_3_2_1


    // $ANTLR start rule__Initiates__FluentAssignment_5
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5488:1: rule__Initiates__FluentAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Initiates__FluentAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5492:1: ( ( ( RULE_ID ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5493:1: ( ( RULE_ID ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5493:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5494:1: ( RULE_ID )
            {
             before(grammarAccess.getInitiatesAccess().getFluentTermCrossReference_5_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5495:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5496:1: RULE_ID
            {
             before(grammarAccess.getInitiatesAccess().getFluentTermIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Initiates__FluentAssignment_511026); 
             after(grammarAccess.getInitiatesAccess().getFluentTermIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getInitiatesAccess().getFluentTermCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Initiates__FluentAssignment_5


    // $ANTLR start rule__Initiates__Args2Assignment_6_1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5507:1: rule__Initiates__Args2Assignment_6_1 : ( RULE_ID ) ;
    public final void rule__Initiates__Args2Assignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5511:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5512:1: ( RULE_ID )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5512:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5513:1: RULE_ID
            {
             before(grammarAccess.getInitiatesAccess().getArgs2IDTerminalRuleCall_6_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Initiates__Args2Assignment_6_111061); 
             after(grammarAccess.getInitiatesAccess().getArgs2IDTerminalRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Initiates__Args2Assignment_6_1


    // $ANTLR start rule__Initiates__Args2Assignment_6_2_1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5522:1: rule__Initiates__Args2Assignment_6_2_1 : ( RULE_ID ) ;
    public final void rule__Initiates__Args2Assignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5526:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5527:1: ( RULE_ID )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5527:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5528:1: RULE_ID
            {
             before(grammarAccess.getInitiatesAccess().getArgs2IDTerminalRuleCall_6_2_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Initiates__Args2Assignment_6_2_111092); 
             after(grammarAccess.getInitiatesAccess().getArgs2IDTerminalRuleCall_6_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Initiates__Args2Assignment_6_2_1


    // $ANTLR start rule__Initiates__TimeAssignment_8
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5537:1: rule__Initiates__TimeAssignment_8 : ( ruleIntExpr ) ;
    public final void rule__Initiates__TimeAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5541:1: ( ( ruleIntExpr ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5542:1: ( ruleIntExpr )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5542:1: ( ruleIntExpr )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5543:1: ruleIntExpr
            {
             before(grammarAccess.getInitiatesAccess().getTimeIntExprParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleIntExpr_in_rule__Initiates__TimeAssignment_811123);
            ruleIntExpr();
            _fsp--;

             after(grammarAccess.getInitiatesAccess().getTimeIntExprParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Initiates__TimeAssignment_8


    // $ANTLR start rule__Terminates__EventAssignment_2
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5552:1: rule__Terminates__EventAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Terminates__EventAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5556:1: ( ( ( RULE_ID ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5557:1: ( ( RULE_ID ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5557:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5558:1: ( RULE_ID )
            {
             before(grammarAccess.getTerminatesAccess().getEventTermCrossReference_2_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5559:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5560:1: RULE_ID
            {
             before(grammarAccess.getTerminatesAccess().getEventTermIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Terminates__EventAssignment_211158); 
             after(grammarAccess.getTerminatesAccess().getEventTermIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getTerminatesAccess().getEventTermCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Terminates__EventAssignment_2


    // $ANTLR start rule__Terminates__ArgsAssignment_3_1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5571:1: rule__Terminates__ArgsAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__Terminates__ArgsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5575:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5576:1: ( RULE_ID )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5576:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5577:1: RULE_ID
            {
             before(grammarAccess.getTerminatesAccess().getArgsIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Terminates__ArgsAssignment_3_111193); 
             after(grammarAccess.getTerminatesAccess().getArgsIDTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Terminates__ArgsAssignment_3_1


    // $ANTLR start rule__Terminates__ArgsAssignment_3_2_1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5586:1: rule__Terminates__ArgsAssignment_3_2_1 : ( RULE_ID ) ;
    public final void rule__Terminates__ArgsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5590:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5591:1: ( RULE_ID )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5591:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5592:1: RULE_ID
            {
             before(grammarAccess.getTerminatesAccess().getArgsIDTerminalRuleCall_3_2_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Terminates__ArgsAssignment_3_2_111224); 
             after(grammarAccess.getTerminatesAccess().getArgsIDTerminalRuleCall_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Terminates__ArgsAssignment_3_2_1


    // $ANTLR start rule__Terminates__FluentAssignment_5
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5601:1: rule__Terminates__FluentAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Terminates__FluentAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5605:1: ( ( ( RULE_ID ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5606:1: ( ( RULE_ID ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5606:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5607:1: ( RULE_ID )
            {
             before(grammarAccess.getTerminatesAccess().getFluentTermCrossReference_5_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5608:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5609:1: RULE_ID
            {
             before(grammarAccess.getTerminatesAccess().getFluentTermIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Terminates__FluentAssignment_511259); 
             after(grammarAccess.getTerminatesAccess().getFluentTermIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getTerminatesAccess().getFluentTermCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Terminates__FluentAssignment_5


    // $ANTLR start rule__Terminates__Args2Assignment_6_1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5620:1: rule__Terminates__Args2Assignment_6_1 : ( RULE_ID ) ;
    public final void rule__Terminates__Args2Assignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5624:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5625:1: ( RULE_ID )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5625:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5626:1: RULE_ID
            {
             before(grammarAccess.getTerminatesAccess().getArgs2IDTerminalRuleCall_6_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Terminates__Args2Assignment_6_111294); 
             after(grammarAccess.getTerminatesAccess().getArgs2IDTerminalRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Terminates__Args2Assignment_6_1


    // $ANTLR start rule__Terminates__Args2Assignment_6_2_1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5635:1: rule__Terminates__Args2Assignment_6_2_1 : ( RULE_ID ) ;
    public final void rule__Terminates__Args2Assignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5639:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5640:1: ( RULE_ID )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5640:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5641:1: RULE_ID
            {
             before(grammarAccess.getTerminatesAccess().getArgs2IDTerminalRuleCall_6_2_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Terminates__Args2Assignment_6_2_111325); 
             after(grammarAccess.getTerminatesAccess().getArgs2IDTerminalRuleCall_6_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Terminates__Args2Assignment_6_2_1


    // $ANTLR start rule__Terminates__TimeAssignment_8
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5650:1: rule__Terminates__TimeAssignment_8 : ( ruleIntExpr ) ;
    public final void rule__Terminates__TimeAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5654:1: ( ( ruleIntExpr ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5655:1: ( ruleIntExpr )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5655:1: ( ruleIntExpr )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5656:1: ruleIntExpr
            {
             before(grammarAccess.getTerminatesAccess().getTimeIntExprParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleIntExpr_in_rule__Terminates__TimeAssignment_811356);
            ruleIntExpr();
            _fsp--;

             after(grammarAccess.getTerminatesAccess().getTimeIntExprParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Terminates__TimeAssignment_8


    // $ANTLR start rule__Path__FilesAssignment_0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5665:1: rule__Path__FilesAssignment_0 : ( ruleFile ) ;
    public final void rule__Path__FilesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5669:1: ( ( ruleFile ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5670:1: ( ruleFile )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5670:1: ( ruleFile )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5671:1: ruleFile
            {
             before(grammarAccess.getPathAccess().getFilesFileParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleFile_in_rule__Path__FilesAssignment_011387);
            ruleFile();
            _fsp--;

             after(grammarAccess.getPathAccess().getFilesFileParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Path__FilesAssignment_0


    // $ANTLR start rule__Path__FilesAssignment_1_1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5680:1: rule__Path__FilesAssignment_1_1 : ( ruleFile ) ;
    public final void rule__Path__FilesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5684:1: ( ( ruleFile ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5685:1: ( ruleFile )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5685:1: ( ruleFile )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5686:1: ruleFile
            {
             before(grammarAccess.getPathAccess().getFilesFileParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleFile_in_rule__Path__FilesAssignment_1_111418);
            ruleFile();
            _fsp--;

             after(grammarAccess.getPathAccess().getFilesFileParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Path__FilesAssignment_1_1


    // $ANTLR start rule__File__NamesAssignment_0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5695:1: rule__File__NamesAssignment_0 : ( RULE_ID ) ;
    public final void rule__File__NamesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5699:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5700:1: ( RULE_ID )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5700:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5701:1: RULE_ID
            {
             before(grammarAccess.getFileAccess().getNamesIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__File__NamesAssignment_011449); 
             after(grammarAccess.getFileAccess().getNamesIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__File__NamesAssignment_0


    // $ANTLR start rule__File__NamesAssignment_1_1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5710:1: rule__File__NamesAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__File__NamesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5714:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5715:1: ( RULE_ID )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5715:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5716:1: RULE_ID
            {
             before(grammarAccess.getFileAccess().getNamesIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__File__NamesAssignment_1_111480); 
             after(grammarAccess.getFileAccess().getNamesIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__File__NamesAssignment_1_1


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\122\uffff";
    static final String DFA4_eofS =
        "\53\uffff\1\70\3\uffff\1\70\27\uffff\1\70\3\uffff\1\70\6\uffff";
    static final String DFA4_minS =
        "\1\13\4\26\1\uffff\4\4\4\25\10\4\1\25\1\4\1\25\2\14\1\25\1\4\1\25"+
        "\2\14\1\25\1\4\3\25\1\4\3\25\2\4\1\16\1\25\2\4\1\16\1\25\2\4\1\25"+
        "\2\4\2\27\2\uffff\2\27\1\25\1\4\1\25\2\14\1\25\1\4\1\25\2\14\1\25"+
        "\1\16\2\4\1\25\1\16\2\4\4\27";
    static final String DFA4_maxS =
        "\1\40\4\26\1\uffff\4\4\4\26\1\27\1\5\1\27\1\5\1\27\1\4\1\27\1\4"+
        "\1\27\1\4\1\25\3\27\1\4\1\25\3\27\1\4\1\25\1\26\1\27\1\4\1\25\1"+
        "\26\1\27\2\5\2\27\2\5\3\27\1\5\2\27\1\5\2\27\2\uffff\3\27\1\4\1"+
        "\25\3\27\1\4\1\25\4\27\2\5\2\27\2\5\4\27";
    static final String DFA4_acceptS =
        "\5\uffff\1\2\62\uffff\1\1\1\3\30\uffff";
    static final String DFA4_specialS =
        "\122\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\5\12\uffff\1\5\6\uffff\1\1\1\2\1\3\1\4",
            "\1\6",
            "\1\7",
            "\1\10",
            "\1\11",
            "",
            "\1\12",
            "\1\13",
            "\1\14",
            "\1\15",
            "\1\17\1\16",
            "\1\21\1\20",
            "\1\23\1\22",
            "\1\25\1\24",
            "\1\26\20\uffff\1\27\1\uffff\1\30",
            "\1\32\1\31",
            "\1\33\20\uffff\1\34\1\uffff\1\35",
            "\1\37\1\36",
            "\1\40\20\uffff\1\41\1\uffff\1\42",
            "\1\43",
            "\1\44\20\uffff\1\45\1\uffff\1\46",
            "\1\47",
            "\1\27\1\uffff\1\30",
            "\1\50",
            "\1\17",
            "\1\51\1\52\11\uffff\1\53",
            "\1\51\1\52\11\uffff\1\53",
            "\1\34\1\uffff\1\35",
            "\1\54",
            "\1\21",
            "\1\55\1\56\11\uffff\1\57",
            "\1\55\1\56\11\uffff\1\57",
            "\1\41\1\uffff\1\42",
            "\1\60",
            "\1\23",
            "\1\62\1\61",
            "\1\45\1\uffff\1\46",
            "\1\63",
            "\1\25",
            "\1\65\1\64",
            "\1\27\1\uffff\1\30",
            "\1\67\1\66",
            "\1\67\1\66",
            "\4\71\1\70\4\uffff\1\70",
            "\1\34\1\uffff\1\35",
            "\1\73\1\72",
            "\1\73\1\72",
            "\4\71\1\70\4\uffff\1\70",
            "\1\41\1\uffff\1\42",
            "\1\74\20\uffff\1\75\1\uffff\1\76",
            "\1\100\1\77",
            "\1\45\1\uffff\1\46",
            "\1\101\20\uffff\1\102\1\uffff\1\103",
            "\1\105\1\104",
            "\1\53",
            "\1\53",
            "",
            "",
            "\1\57",
            "\1\57",
            "\1\75\1\uffff\1\76",
            "\1\106",
            "\1\62",
            "\1\110\1\111\11\uffff\1\107",
            "\1\110\1\111\11\uffff\1\107",
            "\1\102\1\uffff\1\103",
            "\1\112",
            "\1\65",
            "\1\114\1\115\11\uffff\1\113",
            "\1\114\1\115\11\uffff\1\113",
            "\1\75\1\uffff\1\76",
            "\4\71\1\70\4\uffff\1\70",
            "\1\117\1\116",
            "\1\117\1\116",
            "\1\102\1\uffff\1\103",
            "\4\71\1\70\4\uffff\1\70",
            "\1\121\1\120",
            "\1\121\1\120",
            "\1\107",
            "\1\107",
            "\1\113",
            "\1\113"
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "841:1: rule__BoolExpr__Alternatives : ( ( ruleTemporalPredicate ) | ( ruleUnaryBoolExpr ) | ( ruleBinaryBoolExpr ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleKnowledge_in_entryRuleKnowledge61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKnowledge68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Knowledge__Group__0_in_ruleKnowledge94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__0_in_ruleRule154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDecl_in_entryRuleVarDecl181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarDecl188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__0_in_ruleVarDecl214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntTerm_in_entryRuleIntTerm241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntTerm248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntTerm__Alternatives_in_ruleIntTerm274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntExpr_in_entryRuleIntExpr301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntExpr308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntExpr__Alternatives_in_ruleIntExpr334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryIntExpr_in_entryRuleBinaryIntExpr361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinaryIntExpr368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryIntExpr__Group__0_in_ruleBinaryIntExpr394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemporalPredicate_in_entryRuleTemporalPredicate421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemporalPredicate428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemporalPredicate__Alternatives_in_ruleTemporalPredicate454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolExpr_in_entryRuleBoolExpr481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolExpr488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolExpr__Alternatives_in_ruleBoolExpr514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryBoolExpr_in_entryRuleUnaryBoolExpr541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryBoolExpr548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryBoolExpr__Alternatives_in_ruleUnaryBoolExpr574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryBoolExpr_in_entryRuleBinaryBoolExpr601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinaryBoolExpr608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryBoolExpr__Group__0_in_ruleBinaryBoolExpr634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Alternatives_in_ruleEntity694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSort_in_entryRuleSort721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSort728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sort__Group__0_in_ruleSort754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_in_entryRuleVar841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVar848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Var__Group__0_in_ruleVar874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFluent_in_entryRuleFluent901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFluent908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group__0_in_ruleFluent934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__0_in_ruleEvent994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_entryRuleTerm1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerm1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group__0_in_ruleTerm1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHoldsAt_in_entryRuleHoldsAt1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHoldsAt1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HoldsAt__Group__0_in_ruleHoldsAt1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHappens_in_entryRuleHappens1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHappens1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Happens__Group__0_in_ruleHappens1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitiates_in_entryRuleInitiates1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInitiates1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Initiates__Group__0_in_ruleInitiates1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminates_in_entryRuleTerminates1261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminates1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminates__Group__0_in_ruleTerminates1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePath_in_entryRulePath1321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePath1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Path__Group__0_in_rulePath1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFile_in_entryRuleFile1381 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFile1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group__0_in_ruleFile1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryIntOp__Alternatives_in_ruleBinaryIntOp1451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleUnaryBoolOp1488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryBoolOp__Alternatives_in_ruleBinaryBoolOp1526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntTerm__ConstAssignment_0_in_rule__IntTerm__Alternatives1561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntTerm__VarAssignment_1_in_rule__IntTerm__Alternatives1579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntTerm_in_rule__IntExpr__Alternatives1612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryIntExpr_in_rule__IntExpr__Alternatives1629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHoldsAt_in_rule__TemporalPredicate__Alternatives1661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHappens_in_rule__TemporalPredicate__Alternatives1678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitiates_in_rule__TemporalPredicate__Alternatives1695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminates_in_rule__TemporalPredicate__Alternatives1712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemporalPredicate_in_rule__BoolExpr__Alternatives1744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryBoolExpr_in_rule__BoolExpr__Alternatives1761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryBoolExpr_in_rule__BoolExpr__Alternatives1778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryBoolExpr__Group_0__0_in_rule__UnaryBoolExpr__Alternatives1810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryBoolExpr__Group_1__0_in_rule__UnaryBoolExpr__Alternatives1828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFluent_in_rule__Entity__Alternatives1861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_rule__Entity__Alternatives1878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSort_in_rule__Entity__Alternatives1895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__BinaryIntOp__Alternatives1928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__BinaryIntOp__Alternatives1949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__BinaryBoolOp__Alternatives1985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__BinaryBoolOp__Alternatives2006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__BinaryBoolOp__Alternatives2027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__BinaryBoolOp__Alternatives2048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Knowledge__Group__0__Impl_in_rule__Knowledge__Group__02081 = new BitSet(new long[]{0x00000001FD480802L});
    public static final BitSet FOLLOW_rule__Knowledge__Group__1_in_rule__Knowledge__Group__02084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Knowledge__ImportsAssignment_0_in_rule__Knowledge__Group__0__Impl2111 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Knowledge__Group__1__Impl_in_rule__Knowledge__Group__12142 = new BitSet(new long[]{0x00000001E4480802L});
    public static final BitSet FOLLOW_rule__Knowledge__Group__2_in_rule__Knowledge__Group__12145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Knowledge__EntitiesAssignment_1_in_rule__Knowledge__Group__1__Impl2172 = new BitSet(new long[]{0x0000000019000002L});
    public static final BitSet FOLLOW_rule__Knowledge__Group__2__Impl_in_rule__Knowledge__Group__22203 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Knowledge__Group__3_in_rule__Knowledge__Group__22206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Knowledge__Group_2__0_in_rule__Knowledge__Group__2__Impl2233 = new BitSet(new long[]{0x00000001E0480802L});
    public static final BitSet FOLLOW_rule__Knowledge__Group__3__Impl_in_rule__Knowledge__Group__32264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Knowledge__VarsAssignment_3_in_rule__Knowledge__Group__3__Impl2291 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Knowledge__Group_2__0__Impl_in_rule__Knowledge__Group_2__02330 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Knowledge__Group_2__1_in_rule__Knowledge__Group_2__02333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Knowledge__RulesAssignment_2_0_in_rule__Knowledge__Group_2__0__Impl2360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Knowledge__Group_2__1__Impl_in_rule__Knowledge__Group_2__12390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Knowledge__Group_2__1__Impl2418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__02453 = new BitSet(new long[]{0x00000001E0400800L});
    public static final BitSet FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__02456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__DeclAssignment_0_in_rule__Rule__Group__0__Impl2483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__12514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__ExprAssignment_1_in_rule__Rule__Group__1__Impl2541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__0__Impl_in_rule__VarDecl__Group__02575 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__1_in_rule__VarDecl__Group__02578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__VarDecl__Group__0__Impl2606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__1__Impl_in_rule__VarDecl__Group__12637 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__2_in_rule__VarDecl__Group__12640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__VarsAssignment_1_in_rule__VarDecl__Group__1__Impl2667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__2__Impl_in_rule__VarDecl__Group__22697 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__3_in_rule__VarDecl__Group__22700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group_2__0_in_rule__VarDecl__Group__2__Impl2727 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__3__Impl_in_rule__VarDecl__Group__32758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__VarDecl__Group__3__Impl2786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group_2__0__Impl_in_rule__VarDecl__Group_2__02825 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VarDecl__Group_2__1_in_rule__VarDecl__Group_2__02828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__VarDecl__Group_2__0__Impl2856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group_2__1__Impl_in_rule__VarDecl__Group_2__12887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__VarsAssignment_2_1_in_rule__VarDecl__Group_2__1__Impl2914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryIntExpr__Group__0__Impl_in_rule__BinaryIntExpr__Group__02948 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__BinaryIntExpr__Group__1_in_rule__BinaryIntExpr__Group__02951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryIntExpr__OprAssignment_0_in_rule__BinaryIntExpr__Group__0__Impl2978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryIntExpr__Group__1__Impl_in_rule__BinaryIntExpr__Group__13008 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__BinaryIntExpr__Group__2_in_rule__BinaryIntExpr__Group__13011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryIntExpr__BinaryopAssignment_1_in_rule__BinaryIntExpr__Group__1__Impl3038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryIntExpr__Group__2__Impl_in_rule__BinaryIntExpr__Group__23068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryIntExpr__OprAssignment_2_in_rule__BinaryIntExpr__Group__2__Impl3095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryBoolExpr__Group_0__0__Impl_in_rule__UnaryBoolExpr__Group_0__03131 = new BitSet(new long[]{0x00000001E0400800L});
    public static final BitSet FOLLOW_rule__UnaryBoolExpr__Group_0__1_in_rule__UnaryBoolExpr__Group_0__03134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryBoolExpr__Unaryop_lhsAssignment_0_0_in_rule__UnaryBoolExpr__Group_0__0__Impl3161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryBoolExpr__Group_0__1__Impl_in_rule__UnaryBoolExpr__Group_0__13191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryBoolExpr__OprAssignment_0_1_in_rule__UnaryBoolExpr__Group_0__1__Impl3218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryBoolExpr__Group_1__0__Impl_in_rule__UnaryBoolExpr__Group_1__03252 = new BitSet(new long[]{0x00000001E0400800L});
    public static final BitSet FOLLOW_rule__UnaryBoolExpr__Group_1__1_in_rule__UnaryBoolExpr__Group_1__03255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__UnaryBoolExpr__Group_1__0__Impl3283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryBoolExpr__Group_1__1__Impl_in_rule__UnaryBoolExpr__Group_1__13314 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__UnaryBoolExpr__Group_1__2_in_rule__UnaryBoolExpr__Group_1__13317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryBoolExpr__OpsAssignment_1_1_in_rule__UnaryBoolExpr__Group_1__1__Impl3344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryBoolExpr__Group_1__2__Impl_in_rule__UnaryBoolExpr__Group_1__23374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__UnaryBoolExpr__Group_1__2__Impl3402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryBoolExpr__Group__0__Impl_in_rule__BinaryBoolExpr__Group__03439 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_rule__BinaryBoolExpr__Group__1_in_rule__BinaryBoolExpr__Group__03442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryBoolExpr__OprAssignment_0_in_rule__BinaryBoolExpr__Group__0__Impl3469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryBoolExpr__Group__1__Impl_in_rule__BinaryBoolExpr__Group__13499 = new BitSet(new long[]{0x00000001E0400800L});
    public static final BitSet FOLLOW_rule__BinaryBoolExpr__Group__2_in_rule__BinaryBoolExpr__Group__13502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryBoolExpr__BinaryopAssignment_1_in_rule__BinaryBoolExpr__Group__1__Impl3529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryBoolExpr__Group__2__Impl_in_rule__BinaryBoolExpr__Group__23559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryBoolExpr__OprAssignment_2_in_rule__BinaryBoolExpr__Group__2__Impl3586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sort__Group__0__Impl_in_rule__Sort__Group__03622 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Sort__Group__1_in_rule__Sort__Group__03625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Sort__Group__0__Impl3653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sort__Group__1__Impl_in_rule__Sort__Group__13684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sort__NameAssignment_1_in_rule__Sort__Group__1__Impl3711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__03745 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__03748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Import__Group__0__Impl3776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__13807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__PathAssignment_1_in_rule__Import__Group__1__Impl3834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Var__Group__0__Impl_in_rule__Var__Group__03868 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Var__Group__1_in_rule__Var__Group__03871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Var__Group__0__Impl3899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Var__Group__1__Impl_in_rule__Var__Group__13930 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Var__Group__2_in_rule__Var__Group__13933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Var__NameAssignment_1_in_rule__Var__Group__1__Impl3960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Var__Group__2__Impl_in_rule__Var__Group__23990 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Var__Group__3_in_rule__Var__Group__23993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Var__MinAssignment_2_in_rule__Var__Group__2__Impl4020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Var__Group__3__Impl_in_rule__Var__Group__34050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Var__MaxAssignment_3_in_rule__Var__Group__3__Impl4077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group__0__Impl_in_rule__Fluent__Group__04115 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Fluent__Group__1_in_rule__Fluent__Group__04118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Fluent__Group__0__Impl4146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group__1__Impl_in_rule__Fluent__Group__14177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__TermAssignment_1_in_rule__Fluent__Group__1__Impl4204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__0__Impl_in_rule__Event__Group__04238 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Event__Group__1_in_rule__Event__Group__04241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Event__Group__0__Impl4269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__1__Impl_in_rule__Event__Group__14300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__TermAssignment_1_in_rule__Event__Group__1__Impl4327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group__0__Impl_in_rule__Term__Group__04361 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__Term__Group__1_in_rule__Term__Group__04364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__NameAssignment_0_in_rule__Term__Group__0__Impl4391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group__1__Impl_in_rule__Term__Group__14421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_1__0_in_rule__Term__Group__1__Impl4448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_1__0__Impl_in_rule__Term__Group_1__04483 = new BitSet(new long[]{0x0000000000A00010L});
    public static final BitSet FOLLOW_rule__Term__Group_1__1_in_rule__Term__Group_1__04486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Term__Group_1__0__Impl4514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_1__1__Impl_in_rule__Term__Group_1__14545 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_rule__Term__Group_1__2_in_rule__Term__Group_1__14548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__ArgsAssignment_1_1_in_rule__Term__Group_1__1__Impl4575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_1__2__Impl_in_rule__Term__Group_1__24606 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Term__Group_1__3_in_rule__Term__Group_1__24609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_1_2__0_in_rule__Term__Group_1__2__Impl4636 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Term__Group_1__3__Impl_in_rule__Term__Group_1__34667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Term__Group_1__3__Impl4695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_1_2__0__Impl_in_rule__Term__Group_1_2__04734 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Term__Group_1_2__1_in_rule__Term__Group_1_2__04737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Term__Group_1_2__0__Impl4765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_1_2__1__Impl_in_rule__Term__Group_1_2__14796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__ArgsAssignment_1_2_1_in_rule__Term__Group_1_2__1__Impl4823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HoldsAt__Group__0__Impl_in_rule__HoldsAt__Group__04857 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__HoldsAt__Group__1_in_rule__HoldsAt__Group__04860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__HoldsAt__Group__0__Impl4888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HoldsAt__Group__1__Impl_in_rule__HoldsAt__Group__14919 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__HoldsAt__Group__2_in_rule__HoldsAt__Group__14922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__HoldsAt__Group__1__Impl4950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HoldsAt__Group__2__Impl_in_rule__HoldsAt__Group__24981 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__HoldsAt__Group__3_in_rule__HoldsAt__Group__24984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HoldsAt__FluentAssignment_2_in_rule__HoldsAt__Group__2__Impl5011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HoldsAt__Group__3__Impl_in_rule__HoldsAt__Group__35041 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__HoldsAt__Group__4_in_rule__HoldsAt__Group__35044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HoldsAt__Group_3__0_in_rule__HoldsAt__Group__3__Impl5071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HoldsAt__Group__4__Impl_in_rule__HoldsAt__Group__45102 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__HoldsAt__Group__5_in_rule__HoldsAt__Group__45105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__HoldsAt__Group__4__Impl5133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HoldsAt__Group__5__Impl_in_rule__HoldsAt__Group__55164 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__HoldsAt__Group__6_in_rule__HoldsAt__Group__55167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HoldsAt__TimeAssignment_5_in_rule__HoldsAt__Group__5__Impl5194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HoldsAt__Group__6__Impl_in_rule__HoldsAt__Group__65224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__HoldsAt__Group__6__Impl5252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HoldsAt__Group_3__0__Impl_in_rule__HoldsAt__Group_3__05297 = new BitSet(new long[]{0x0000000000A00010L});
    public static final BitSet FOLLOW_rule__HoldsAt__Group_3__1_in_rule__HoldsAt__Group_3__05300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__HoldsAt__Group_3__0__Impl5328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HoldsAt__Group_3__1__Impl_in_rule__HoldsAt__Group_3__15359 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_rule__HoldsAt__Group_3__2_in_rule__HoldsAt__Group_3__15362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HoldsAt__ArgsAssignment_3_1_in_rule__HoldsAt__Group_3__1__Impl5389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HoldsAt__Group_3__2__Impl_in_rule__HoldsAt__Group_3__25420 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__HoldsAt__Group_3__3_in_rule__HoldsAt__Group_3__25423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HoldsAt__Group_3_2__0_in_rule__HoldsAt__Group_3__2__Impl5450 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__HoldsAt__Group_3__3__Impl_in_rule__HoldsAt__Group_3__35481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__HoldsAt__Group_3__3__Impl5509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HoldsAt__Group_3_2__0__Impl_in_rule__HoldsAt__Group_3_2__05548 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__HoldsAt__Group_3_2__1_in_rule__HoldsAt__Group_3_2__05551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__HoldsAt__Group_3_2__0__Impl5579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HoldsAt__Group_3_2__1__Impl_in_rule__HoldsAt__Group_3_2__15610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HoldsAt__ArgsAssignment_3_2_1_in_rule__HoldsAt__Group_3_2__1__Impl5637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Happens__Group__0__Impl_in_rule__Happens__Group__05671 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Happens__Group__1_in_rule__Happens__Group__05674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Happens__Group__0__Impl5702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Happens__Group__1__Impl_in_rule__Happens__Group__15733 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Happens__Group__2_in_rule__Happens__Group__15736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Happens__Group__1__Impl5764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Happens__Group__2__Impl_in_rule__Happens__Group__25795 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__Happens__Group__3_in_rule__Happens__Group__25798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Happens__EventAssignment_2_in_rule__Happens__Group__2__Impl5825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Happens__Group__3__Impl_in_rule__Happens__Group__35855 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Happens__Group__4_in_rule__Happens__Group__35858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Happens__Group_3__0_in_rule__Happens__Group__3__Impl5885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Happens__Group__4__Impl_in_rule__Happens__Group__45916 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Happens__Group__5_in_rule__Happens__Group__45919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Happens__Group__4__Impl5947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Happens__Group__5__Impl_in_rule__Happens__Group__55978 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Happens__Group__6_in_rule__Happens__Group__55981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Happens__TimeAssignment_5_in_rule__Happens__Group__5__Impl6008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Happens__Group__6__Impl_in_rule__Happens__Group__66038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Happens__Group__6__Impl6066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Happens__Group_3__0__Impl_in_rule__Happens__Group_3__06111 = new BitSet(new long[]{0x0000000000A00010L});
    public static final BitSet FOLLOW_rule__Happens__Group_3__1_in_rule__Happens__Group_3__06114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Happens__Group_3__0__Impl6142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Happens__Group_3__1__Impl_in_rule__Happens__Group_3__16173 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_rule__Happens__Group_3__2_in_rule__Happens__Group_3__16176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Happens__ArgsAssignment_3_1_in_rule__Happens__Group_3__1__Impl6203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Happens__Group_3__2__Impl_in_rule__Happens__Group_3__26234 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Happens__Group_3__3_in_rule__Happens__Group_3__26237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Happens__Group_3_2__0_in_rule__Happens__Group_3__2__Impl6264 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Happens__Group_3__3__Impl_in_rule__Happens__Group_3__36295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Happens__Group_3__3__Impl6323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Happens__Group_3_2__0__Impl_in_rule__Happens__Group_3_2__06362 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Happens__Group_3_2__1_in_rule__Happens__Group_3_2__06365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Happens__Group_3_2__0__Impl6393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Happens__Group_3_2__1__Impl_in_rule__Happens__Group_3_2__16424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Happens__ArgsAssignment_3_2_1_in_rule__Happens__Group_3_2__1__Impl6451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Initiates__Group__0__Impl_in_rule__Initiates__Group__06485 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Initiates__Group__1_in_rule__Initiates__Group__06488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Initiates__Group__0__Impl6516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Initiates__Group__1__Impl_in_rule__Initiates__Group__16547 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Initiates__Group__2_in_rule__Initiates__Group__16550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Initiates__Group__1__Impl6578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Initiates__Group__2__Impl_in_rule__Initiates__Group__26609 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__Initiates__Group__3_in_rule__Initiates__Group__26612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Initiates__EventAssignment_2_in_rule__Initiates__Group__2__Impl6639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Initiates__Group__3__Impl_in_rule__Initiates__Group__36669 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Initiates__Group__4_in_rule__Initiates__Group__36672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Initiates__Group_3__0_in_rule__Initiates__Group__3__Impl6699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Initiates__Group__4__Impl_in_rule__Initiates__Group__46730 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Initiates__Group__5_in_rule__Initiates__Group__46733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Initiates__Group__4__Impl6761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Initiates__Group__5__Impl_in_rule__Initiates__Group__56792 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__Initiates__Group__6_in_rule__Initiates__Group__56795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Initiates__FluentAssignment_5_in_rule__Initiates__Group__5__Impl6822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Initiates__Group__6__Impl_in_rule__Initiates__Group__66852 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Initiates__Group__7_in_rule__Initiates__Group__66855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Initiates__Group_6__0_in_rule__Initiates__Group__6__Impl6882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Initiates__Group__7__Impl_in_rule__Initiates__Group__76913 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Initiates__Group__8_in_rule__Initiates__Group__76916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Initiates__Group__7__Impl6944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Initiates__Group__8__Impl_in_rule__Initiates__Group__86975 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Initiates__Group__9_in_rule__Initiates__Group__86978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Initiates__TimeAssignment_8_in_rule__Initiates__Group__8__Impl7005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Initiates__Group__9__Impl_in_rule__Initiates__Group__97035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Initiates__Group__9__Impl7063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Initiates__Group_3__0__Impl_in_rule__Initiates__Group_3__07114 = new BitSet(new long[]{0x0000000000A00010L});
    public static final BitSet FOLLOW_rule__Initiates__Group_3__1_in_rule__Initiates__Group_3__07117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Initiates__Group_3__0__Impl7145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Initiates__Group_3__1__Impl_in_rule__Initiates__Group_3__17176 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_rule__Initiates__Group_3__2_in_rule__Initiates__Group_3__17179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Initiates__ArgsAssignment_3_1_in_rule__Initiates__Group_3__1__Impl7206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Initiates__Group_3__2__Impl_in_rule__Initiates__Group_3__27237 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Initiates__Group_3__3_in_rule__Initiates__Group_3__27240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Initiates__Group_3_2__0_in_rule__Initiates__Group_3__2__Impl7267 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Initiates__Group_3__3__Impl_in_rule__Initiates__Group_3__37298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Initiates__Group_3__3__Impl7326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Initiates__Group_3_2__0__Impl_in_rule__Initiates__Group_3_2__07365 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Initiates__Group_3_2__1_in_rule__Initiates__Group_3_2__07368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Initiates__Group_3_2__0__Impl7396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Initiates__Group_3_2__1__Impl_in_rule__Initiates__Group_3_2__17427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Initiates__ArgsAssignment_3_2_1_in_rule__Initiates__Group_3_2__1__Impl7454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Initiates__Group_6__0__Impl_in_rule__Initiates__Group_6__07488 = new BitSet(new long[]{0x0000000000A00010L});
    public static final BitSet FOLLOW_rule__Initiates__Group_6__1_in_rule__Initiates__Group_6__07491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Initiates__Group_6__0__Impl7519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Initiates__Group_6__1__Impl_in_rule__Initiates__Group_6__17550 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_rule__Initiates__Group_6__2_in_rule__Initiates__Group_6__17553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Initiates__Args2Assignment_6_1_in_rule__Initiates__Group_6__1__Impl7580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Initiates__Group_6__2__Impl_in_rule__Initiates__Group_6__27611 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Initiates__Group_6__3_in_rule__Initiates__Group_6__27614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Initiates__Group_6_2__0_in_rule__Initiates__Group_6__2__Impl7641 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Initiates__Group_6__3__Impl_in_rule__Initiates__Group_6__37672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Initiates__Group_6__3__Impl7700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Initiates__Group_6_2__0__Impl_in_rule__Initiates__Group_6_2__07739 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Initiates__Group_6_2__1_in_rule__Initiates__Group_6_2__07742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Initiates__Group_6_2__0__Impl7770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Initiates__Group_6_2__1__Impl_in_rule__Initiates__Group_6_2__17801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Initiates__Args2Assignment_6_2_1_in_rule__Initiates__Group_6_2__1__Impl7828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminates__Group__0__Impl_in_rule__Terminates__Group__07862 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Terminates__Group__1_in_rule__Terminates__Group__07865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Terminates__Group__0__Impl7893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminates__Group__1__Impl_in_rule__Terminates__Group__17924 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Terminates__Group__2_in_rule__Terminates__Group__17927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Terminates__Group__1__Impl7955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminates__Group__2__Impl_in_rule__Terminates__Group__27986 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__Terminates__Group__3_in_rule__Terminates__Group__27989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminates__EventAssignment_2_in_rule__Terminates__Group__2__Impl8016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminates__Group__3__Impl_in_rule__Terminates__Group__38046 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Terminates__Group__4_in_rule__Terminates__Group__38049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminates__Group_3__0_in_rule__Terminates__Group__3__Impl8076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminates__Group__4__Impl_in_rule__Terminates__Group__48107 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Terminates__Group__5_in_rule__Terminates__Group__48110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Terminates__Group__4__Impl8138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminates__Group__5__Impl_in_rule__Terminates__Group__58169 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__Terminates__Group__6_in_rule__Terminates__Group__58172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminates__FluentAssignment_5_in_rule__Terminates__Group__5__Impl8199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminates__Group__6__Impl_in_rule__Terminates__Group__68229 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Terminates__Group__7_in_rule__Terminates__Group__68232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminates__Group_6__0_in_rule__Terminates__Group__6__Impl8259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminates__Group__7__Impl_in_rule__Terminates__Group__78290 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Terminates__Group__8_in_rule__Terminates__Group__78293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Terminates__Group__7__Impl8321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminates__Group__8__Impl_in_rule__Terminates__Group__88352 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Terminates__Group__9_in_rule__Terminates__Group__88355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminates__TimeAssignment_8_in_rule__Terminates__Group__8__Impl8382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminates__Group__9__Impl_in_rule__Terminates__Group__98412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Terminates__Group__9__Impl8440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminates__Group_3__0__Impl_in_rule__Terminates__Group_3__08491 = new BitSet(new long[]{0x0000000000A00010L});
    public static final BitSet FOLLOW_rule__Terminates__Group_3__1_in_rule__Terminates__Group_3__08494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Terminates__Group_3__0__Impl8522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminates__Group_3__1__Impl_in_rule__Terminates__Group_3__18553 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_rule__Terminates__Group_3__2_in_rule__Terminates__Group_3__18556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminates__ArgsAssignment_3_1_in_rule__Terminates__Group_3__1__Impl8583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminates__Group_3__2__Impl_in_rule__Terminates__Group_3__28614 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Terminates__Group_3__3_in_rule__Terminates__Group_3__28617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminates__Group_3_2__0_in_rule__Terminates__Group_3__2__Impl8644 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Terminates__Group_3__3__Impl_in_rule__Terminates__Group_3__38675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Terminates__Group_3__3__Impl8703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminates__Group_3_2__0__Impl_in_rule__Terminates__Group_3_2__08742 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Terminates__Group_3_2__1_in_rule__Terminates__Group_3_2__08745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Terminates__Group_3_2__0__Impl8773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminates__Group_3_2__1__Impl_in_rule__Terminates__Group_3_2__18804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminates__ArgsAssignment_3_2_1_in_rule__Terminates__Group_3_2__1__Impl8831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminates__Group_6__0__Impl_in_rule__Terminates__Group_6__08865 = new BitSet(new long[]{0x0000000000A00010L});
    public static final BitSet FOLLOW_rule__Terminates__Group_6__1_in_rule__Terminates__Group_6__08868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Terminates__Group_6__0__Impl8896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminates__Group_6__1__Impl_in_rule__Terminates__Group_6__18927 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_rule__Terminates__Group_6__2_in_rule__Terminates__Group_6__18930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminates__Args2Assignment_6_1_in_rule__Terminates__Group_6__1__Impl8957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminates__Group_6__2__Impl_in_rule__Terminates__Group_6__28988 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Terminates__Group_6__3_in_rule__Terminates__Group_6__28991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminates__Group_6_2__0_in_rule__Terminates__Group_6__2__Impl9018 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Terminates__Group_6__3__Impl_in_rule__Terminates__Group_6__39049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Terminates__Group_6__3__Impl9077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminates__Group_6_2__0__Impl_in_rule__Terminates__Group_6_2__09116 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Terminates__Group_6_2__1_in_rule__Terminates__Group_6_2__09119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Terminates__Group_6_2__0__Impl9147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminates__Group_6_2__1__Impl_in_rule__Terminates__Group_6_2__19178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminates__Args2Assignment_6_2_1_in_rule__Terminates__Group_6_2__1__Impl9205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Path__Group__0__Impl_in_rule__Path__Group__09239 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__Path__Group__1_in_rule__Path__Group__09242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Path__FilesAssignment_0_in_rule__Path__Group__0__Impl9269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Path__Group__1__Impl_in_rule__Path__Group__19299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Path__Group_1__0_in_rule__Path__Group__1__Impl9326 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__Path__Group_1__0__Impl_in_rule__Path__Group_1__09361 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Path__Group_1__1_in_rule__Path__Group_1__09364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Path__Group_1__0__Impl9392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Path__Group_1__1__Impl_in_rule__Path__Group_1__19423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Path__FilesAssignment_1_1_in_rule__Path__Group_1__1__Impl9450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group__0__Impl_in_rule__File__Group__09484 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__File__Group__1_in_rule__File__Group__09487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__NamesAssignment_0_in_rule__File__Group__0__Impl9514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group__1__Impl_in_rule__File__Group__19544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group_1__0_in_rule__File__Group__1__Impl9571 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__File__Group_1__0__Impl_in_rule__File__Group_1__09606 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__File__Group_1__1_in_rule__File__Group_1__09609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__File__Group_1__0__Impl9637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group_1__1__Impl_in_rule__File__Group_1__19668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__NamesAssignment_1_1_in_rule__File__Group_1__1__Impl9695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Knowledge__ImportsAssignment_09734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__Knowledge__EntitiesAssignment_19765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_rule__Knowledge__RulesAssignment_2_09796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_in_rule__Knowledge__VarsAssignment_39827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDecl_in_rule__Rule__DeclAssignment_09858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolExpr_in_rule__Rule__ExprAssignment_19889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VarDecl__VarsAssignment_19924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VarDecl__VarsAssignment_2_19963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IntTerm__ConstAssignment_09998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__IntTerm__VarAssignment_110033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntTerm_in_rule__BinaryIntExpr__OprAssignment_010068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryIntOp_in_rule__BinaryIntExpr__BinaryopAssignment_110099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntTerm_in_rule__BinaryIntExpr__OprAssignment_210130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryBoolOp_in_rule__UnaryBoolExpr__Unaryop_lhsAssignment_0_010161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolExpr_in_rule__UnaryBoolExpr__OprAssignment_0_110192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolExpr_in_rule__UnaryBoolExpr__OpsAssignment_1_110223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemporalPredicate_in_rule__BinaryBoolExpr__OprAssignment_010254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryBoolOp_in_rule__BinaryBoolExpr__BinaryopAssignment_110285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolExpr_in_rule__BinaryBoolExpr__OprAssignment_210316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Sort__NameAssignment_110347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePath_in_rule__Import__PathAssignment_110378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Var__NameAssignment_110409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Var__MinAssignment_210440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Var__MaxAssignment_310471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_rule__Fluent__TermAssignment_110502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_rule__Event__TermAssignment_110533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Term__NameAssignment_010564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Term__ArgsAssignment_1_110595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Term__ArgsAssignment_1_2_110626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__HoldsAt__FluentAssignment_210661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__HoldsAt__ArgsAssignment_3_110696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__HoldsAt__ArgsAssignment_3_2_110727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntExpr_in_rule__HoldsAt__TimeAssignment_510758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Happens__EventAssignment_210793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Happens__ArgsAssignment_3_110828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Happens__ArgsAssignment_3_2_110859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntExpr_in_rule__Happens__TimeAssignment_510890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Initiates__EventAssignment_210925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Initiates__ArgsAssignment_3_110960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Initiates__ArgsAssignment_3_2_110991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Initiates__FluentAssignment_511026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Initiates__Args2Assignment_6_111061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Initiates__Args2Assignment_6_2_111092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntExpr_in_rule__Initiates__TimeAssignment_811123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Terminates__EventAssignment_211158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Terminates__ArgsAssignment_3_111193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Terminates__ArgsAssignment_3_2_111224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Terminates__FluentAssignment_511259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Terminates__Args2Assignment_6_111294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Terminates__Args2Assignment_6_2_111325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntExpr_in_rule__Terminates__TimeAssignment_811356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFile_in_rule__Path__FilesAssignment_011387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFile_in_rule__Path__FilesAssignment_1_111418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__File__NamesAssignment_011449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__File__NamesAssignment_1_111480 = new BitSet(new long[]{0x0000000000000002L});

}