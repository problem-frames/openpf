package uk.ac.open.event.contentassist.antlr.internal; 

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
import uk.ac.open.event.services.EventCalculusGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

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
    public String getGrammarFileName() { return "../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g"; }


     
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:60:1: entryRuleKnowledge : ruleKnowledge EOF ;
    public final void entryRuleKnowledge() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:60:20: ( ruleKnowledge EOF )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:61:1: ruleKnowledge EOF
            {
             before(grammarAccess.getKnowledgeRule()); 
            pushFollow(FOLLOW_ruleKnowledge_in_entryRuleKnowledge60);
            ruleKnowledge();
            _fsp--;

             after(grammarAccess.getKnowledgeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKnowledge67); 

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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:68:1: ruleKnowledge : ( ( rule__Knowledge__Group__0 ) ) ;
    public final void ruleKnowledge() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:72:2: ( ( ( rule__Knowledge__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:73:1: ( ( rule__Knowledge__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:73:1: ( ( rule__Knowledge__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:74:1: ( rule__Knowledge__Group__0 )
            {
             before(grammarAccess.getKnowledgeAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:75:1: ( rule__Knowledge__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:75:2: rule__Knowledge__Group__0
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:87:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:87:15: ( ruleRule EOF )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:88:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_ruleRule_in_entryRuleRule120);
            ruleRule();
            _fsp--;

             after(grammarAccess.getRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRule127); 

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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:95:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:99:2: ( ( ( rule__Rule__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:100:1: ( ( rule__Rule__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:100:1: ( ( rule__Rule__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:101:1: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:102:1: ( rule__Rule__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:102:2: rule__Rule__Group__0
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:114:1: entryRuleVarDecl : ruleVarDecl EOF ;
    public final void entryRuleVarDecl() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:114:18: ( ruleVarDecl EOF )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:115:1: ruleVarDecl EOF
            {
             before(grammarAccess.getVarDeclRule()); 
            pushFollow(FOLLOW_ruleVarDecl_in_entryRuleVarDecl180);
            ruleVarDecl();
            _fsp--;

             after(grammarAccess.getVarDeclRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarDecl187); 

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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:122:1: ruleVarDecl : ( ( rule__VarDecl__Group__0 ) ) ;
    public final void ruleVarDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:126:2: ( ( ( rule__VarDecl__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:127:1: ( ( rule__VarDecl__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:127:1: ( ( rule__VarDecl__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:128:1: ( rule__VarDecl__Group__0 )
            {
             before(grammarAccess.getVarDeclAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:129:1: ( rule__VarDecl__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:129:2: rule__VarDecl__Group__0
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:141:1: entryRuleIntTerm : ruleIntTerm EOF ;
    public final void entryRuleIntTerm() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:141:18: ( ruleIntTerm EOF )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:142:1: ruleIntTerm EOF
            {
             before(grammarAccess.getIntTermRule()); 
            pushFollow(FOLLOW_ruleIntTerm_in_entryRuleIntTerm240);
            ruleIntTerm();
            _fsp--;

             after(grammarAccess.getIntTermRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntTerm247); 

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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:149:1: ruleIntTerm : ( ( rule__IntTerm__Alternatives ) ) ;
    public final void ruleIntTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:153:2: ( ( ( rule__IntTerm__Alternatives ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:154:1: ( ( rule__IntTerm__Alternatives ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:154:1: ( ( rule__IntTerm__Alternatives ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:155:1: ( rule__IntTerm__Alternatives )
            {
             before(grammarAccess.getIntTermAccess().getAlternatives()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:156:1: ( rule__IntTerm__Alternatives )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:156:2: rule__IntTerm__Alternatives
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:168:1: entryRuleIntExpr : ruleIntExpr EOF ;
    public final void entryRuleIntExpr() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:168:18: ( ruleIntExpr EOF )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:169:1: ruleIntExpr EOF
            {
             before(grammarAccess.getIntExprRule()); 
            pushFollow(FOLLOW_ruleIntExpr_in_entryRuleIntExpr300);
            ruleIntExpr();
            _fsp--;

             after(grammarAccess.getIntExprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntExpr307); 

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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:176:1: ruleIntExpr : ( ( rule__IntExpr__Alternatives ) ) ;
    public final void ruleIntExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:180:2: ( ( ( rule__IntExpr__Alternatives ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:181:1: ( ( rule__IntExpr__Alternatives ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:181:1: ( ( rule__IntExpr__Alternatives ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:182:1: ( rule__IntExpr__Alternatives )
            {
             before(grammarAccess.getIntExprAccess().getAlternatives()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:183:1: ( rule__IntExpr__Alternatives )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:183:2: rule__IntExpr__Alternatives
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:195:1: entryRuleBinaryIntExpr : ruleBinaryIntExpr EOF ;
    public final void entryRuleBinaryIntExpr() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:195:24: ( ruleBinaryIntExpr EOF )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:196:1: ruleBinaryIntExpr EOF
            {
             before(grammarAccess.getBinaryIntExprRule()); 
            pushFollow(FOLLOW_ruleBinaryIntExpr_in_entryRuleBinaryIntExpr360);
            ruleBinaryIntExpr();
            _fsp--;

             after(grammarAccess.getBinaryIntExprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinaryIntExpr367); 

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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:203:1: ruleBinaryIntExpr : ( ( rule__BinaryIntExpr__Group__0 ) ) ;
    public final void ruleBinaryIntExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:207:2: ( ( ( rule__BinaryIntExpr__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:208:1: ( ( rule__BinaryIntExpr__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:208:1: ( ( rule__BinaryIntExpr__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:209:1: ( rule__BinaryIntExpr__Group__0 )
            {
             before(grammarAccess.getBinaryIntExprAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:210:1: ( rule__BinaryIntExpr__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:210:2: rule__BinaryIntExpr__Group__0
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:222:1: entryRuleTemporalPredicate : ruleTemporalPredicate EOF ;
    public final void entryRuleTemporalPredicate() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:222:28: ( ruleTemporalPredicate EOF )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:223:1: ruleTemporalPredicate EOF
            {
             before(grammarAccess.getTemporalPredicateRule()); 
            pushFollow(FOLLOW_ruleTemporalPredicate_in_entryRuleTemporalPredicate420);
            ruleTemporalPredicate();
            _fsp--;

             after(grammarAccess.getTemporalPredicateRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemporalPredicate427); 

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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:230:1: ruleTemporalPredicate : ( ( rule__TemporalPredicate__Alternatives ) ) ;
    public final void ruleTemporalPredicate() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:234:2: ( ( ( rule__TemporalPredicate__Alternatives ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:235:1: ( ( rule__TemporalPredicate__Alternatives ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:235:1: ( ( rule__TemporalPredicate__Alternatives ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:236:1: ( rule__TemporalPredicate__Alternatives )
            {
             before(grammarAccess.getTemporalPredicateAccess().getAlternatives()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:237:1: ( rule__TemporalPredicate__Alternatives )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:237:2: rule__TemporalPredicate__Alternatives
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:249:1: entryRuleBoolExpr : ruleBoolExpr EOF ;
    public final void entryRuleBoolExpr() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:249:19: ( ruleBoolExpr EOF )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:250:1: ruleBoolExpr EOF
            {
             before(grammarAccess.getBoolExprRule()); 
            pushFollow(FOLLOW_ruleBoolExpr_in_entryRuleBoolExpr480);
            ruleBoolExpr();
            _fsp--;

             after(grammarAccess.getBoolExprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolExpr487); 

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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:257:1: ruleBoolExpr : ( ( rule__BoolExpr__Alternatives ) ) ;
    public final void ruleBoolExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:261:2: ( ( ( rule__BoolExpr__Alternatives ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:262:1: ( ( rule__BoolExpr__Alternatives ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:262:1: ( ( rule__BoolExpr__Alternatives ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:263:1: ( rule__BoolExpr__Alternatives )
            {
             before(grammarAccess.getBoolExprAccess().getAlternatives()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:264:1: ( rule__BoolExpr__Alternatives )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:264:2: rule__BoolExpr__Alternatives
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:276:1: entryRuleUnaryBoolExpr : ruleUnaryBoolExpr EOF ;
    public final void entryRuleUnaryBoolExpr() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:276:24: ( ruleUnaryBoolExpr EOF )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:277:1: ruleUnaryBoolExpr EOF
            {
             before(grammarAccess.getUnaryBoolExprRule()); 
            pushFollow(FOLLOW_ruleUnaryBoolExpr_in_entryRuleUnaryBoolExpr540);
            ruleUnaryBoolExpr();
            _fsp--;

             after(grammarAccess.getUnaryBoolExprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryBoolExpr547); 

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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:284:1: ruleUnaryBoolExpr : ( ( rule__UnaryBoolExpr__Alternatives ) ) ;
    public final void ruleUnaryBoolExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:288:2: ( ( ( rule__UnaryBoolExpr__Alternatives ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:289:1: ( ( rule__UnaryBoolExpr__Alternatives ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:289:1: ( ( rule__UnaryBoolExpr__Alternatives ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:290:1: ( rule__UnaryBoolExpr__Alternatives )
            {
             before(grammarAccess.getUnaryBoolExprAccess().getAlternatives()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:291:1: ( rule__UnaryBoolExpr__Alternatives )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:291:2: rule__UnaryBoolExpr__Alternatives
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:303:1: entryRuleBinaryBoolExpr : ruleBinaryBoolExpr EOF ;
    public final void entryRuleBinaryBoolExpr() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:303:25: ( ruleBinaryBoolExpr EOF )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:304:1: ruleBinaryBoolExpr EOF
            {
             before(grammarAccess.getBinaryBoolExprRule()); 
            pushFollow(FOLLOW_ruleBinaryBoolExpr_in_entryRuleBinaryBoolExpr600);
            ruleBinaryBoolExpr();
            _fsp--;

             after(grammarAccess.getBinaryBoolExprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinaryBoolExpr607); 

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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:311:1: ruleBinaryBoolExpr : ( ( rule__BinaryBoolExpr__Group__0 ) ) ;
    public final void ruleBinaryBoolExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:315:2: ( ( ( rule__BinaryBoolExpr__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:316:1: ( ( rule__BinaryBoolExpr__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:316:1: ( ( rule__BinaryBoolExpr__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:317:1: ( rule__BinaryBoolExpr__Group__0 )
            {
             before(grammarAccess.getBinaryBoolExprAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:318:1: ( rule__BinaryBoolExpr__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:318:2: rule__BinaryBoolExpr__Group__0
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:330:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:330:17: ( ruleEntity EOF )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:331:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity660);
            ruleEntity();
            _fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity667); 

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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:338:1: ruleEntity : ( ( rule__Entity__Alternatives ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:342:2: ( ( ( rule__Entity__Alternatives ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:343:1: ( ( rule__Entity__Alternatives ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:343:1: ( ( rule__Entity__Alternatives ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:344:1: ( rule__Entity__Alternatives )
            {
             before(grammarAccess.getEntityAccess().getAlternatives()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:345:1: ( rule__Entity__Alternatives )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:345:2: rule__Entity__Alternatives
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:357:1: entryRuleSort : ruleSort EOF ;
    public final void entryRuleSort() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:357:15: ( ruleSort EOF )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:358:1: ruleSort EOF
            {
             before(grammarAccess.getSortRule()); 
            pushFollow(FOLLOW_ruleSort_in_entryRuleSort720);
            ruleSort();
            _fsp--;

             after(grammarAccess.getSortRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSort727); 

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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:365:1: ruleSort : ( ( rule__Sort__Group__0 ) ) ;
    public final void ruleSort() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:369:2: ( ( ( rule__Sort__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:370:1: ( ( rule__Sort__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:370:1: ( ( rule__Sort__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:371:1: ( rule__Sort__Group__0 )
            {
             before(grammarAccess.getSortAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:372:1: ( rule__Sort__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:372:2: rule__Sort__Group__0
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:384:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:384:17: ( ruleImport EOF )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:385:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport780);
            ruleImport();
            _fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport787); 

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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:392:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:396:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:397:1: ( ( rule__Import__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:397:1: ( ( rule__Import__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:398:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:399:1: ( rule__Import__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:399:2: rule__Import__Group__0
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:411:1: entryRuleVar : ruleVar EOF ;
    public final void entryRuleVar() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:411:14: ( ruleVar EOF )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:412:1: ruleVar EOF
            {
             before(grammarAccess.getVarRule()); 
            pushFollow(FOLLOW_ruleVar_in_entryRuleVar840);
            ruleVar();
            _fsp--;

             after(grammarAccess.getVarRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVar847); 

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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:419:1: ruleVar : ( ( rule__Var__Group__0 ) ) ;
    public final void ruleVar() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:423:2: ( ( ( rule__Var__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:424:1: ( ( rule__Var__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:424:1: ( ( rule__Var__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:425:1: ( rule__Var__Group__0 )
            {
             before(grammarAccess.getVarAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:426:1: ( rule__Var__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:426:2: rule__Var__Group__0
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:438:1: entryRuleFluent : ruleFluent EOF ;
    public final void entryRuleFluent() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:438:17: ( ruleFluent EOF )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:439:1: ruleFluent EOF
            {
             before(grammarAccess.getFluentRule()); 
            pushFollow(FOLLOW_ruleFluent_in_entryRuleFluent900);
            ruleFluent();
            _fsp--;

             after(grammarAccess.getFluentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFluent907); 

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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:446:1: ruleFluent : ( ( rule__Fluent__Group__0 ) ) ;
    public final void ruleFluent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:450:2: ( ( ( rule__Fluent__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:451:1: ( ( rule__Fluent__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:451:1: ( ( rule__Fluent__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:452:1: ( rule__Fluent__Group__0 )
            {
             before(grammarAccess.getFluentAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:453:1: ( rule__Fluent__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:453:2: rule__Fluent__Group__0
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:465:1: entryRuleEvent : ruleEvent EOF ;
    public final void entryRuleEvent() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:465:16: ( ruleEvent EOF )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:466:1: ruleEvent EOF
            {
             before(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent960);
            ruleEvent();
            _fsp--;

             after(grammarAccess.getEventRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent967); 

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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:473:1: ruleEvent : ( ( rule__Event__Group__0 ) ) ;
    public final void ruleEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:477:2: ( ( ( rule__Event__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:478:1: ( ( rule__Event__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:478:1: ( ( rule__Event__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:479:1: ( rule__Event__Group__0 )
            {
             before(grammarAccess.getEventAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:480:1: ( rule__Event__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:480:2: rule__Event__Group__0
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:492:1: entryRuleTerm : ruleTerm EOF ;
    public final void entryRuleTerm() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:492:15: ( ruleTerm EOF )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:493:1: ruleTerm EOF
            {
             before(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_ruleTerm_in_entryRuleTerm1020);
            ruleTerm();
            _fsp--;

             after(grammarAccess.getTermRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerm1027); 

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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:500:1: ruleTerm : ( ( rule__Term__Group__0 ) ) ;
    public final void ruleTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:504:2: ( ( ( rule__Term__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:505:1: ( ( rule__Term__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:505:1: ( ( rule__Term__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:506:1: ( rule__Term__Group__0 )
            {
             before(grammarAccess.getTermAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:507:1: ( rule__Term__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:507:2: rule__Term__Group__0
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:519:1: entryRuleHoldsAt : ruleHoldsAt EOF ;
    public final void entryRuleHoldsAt() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:519:18: ( ruleHoldsAt EOF )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:520:1: ruleHoldsAt EOF
            {
             before(grammarAccess.getHoldsAtRule()); 
            pushFollow(FOLLOW_ruleHoldsAt_in_entryRuleHoldsAt1080);
            ruleHoldsAt();
            _fsp--;

             after(grammarAccess.getHoldsAtRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHoldsAt1087); 

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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:527:1: ruleHoldsAt : ( ( rule__HoldsAt__Group__0 ) ) ;
    public final void ruleHoldsAt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:531:2: ( ( ( rule__HoldsAt__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:532:1: ( ( rule__HoldsAt__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:532:1: ( ( rule__HoldsAt__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:533:1: ( rule__HoldsAt__Group__0 )
            {
             before(grammarAccess.getHoldsAtAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:534:1: ( rule__HoldsAt__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:534:2: rule__HoldsAt__Group__0
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:546:1: entryRuleHappens : ruleHappens EOF ;
    public final void entryRuleHappens() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:546:18: ( ruleHappens EOF )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:547:1: ruleHappens EOF
            {
             before(grammarAccess.getHappensRule()); 
            pushFollow(FOLLOW_ruleHappens_in_entryRuleHappens1140);
            ruleHappens();
            _fsp--;

             after(grammarAccess.getHappensRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHappens1147); 

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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:554:1: ruleHappens : ( ( rule__Happens__Group__0 ) ) ;
    public final void ruleHappens() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:558:2: ( ( ( rule__Happens__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:559:1: ( ( rule__Happens__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:559:1: ( ( rule__Happens__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:560:1: ( rule__Happens__Group__0 )
            {
             before(grammarAccess.getHappensAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:561:1: ( rule__Happens__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:561:2: rule__Happens__Group__0
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:573:1: entryRuleInitiates : ruleInitiates EOF ;
    public final void entryRuleInitiates() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:573:20: ( ruleInitiates EOF )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:574:1: ruleInitiates EOF
            {
             before(grammarAccess.getInitiatesRule()); 
            pushFollow(FOLLOW_ruleInitiates_in_entryRuleInitiates1200);
            ruleInitiates();
            _fsp--;

             after(grammarAccess.getInitiatesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInitiates1207); 

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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:581:1: ruleInitiates : ( ( rule__Initiates__Group__0 ) ) ;
    public final void ruleInitiates() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:585:2: ( ( ( rule__Initiates__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:586:1: ( ( rule__Initiates__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:586:1: ( ( rule__Initiates__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:587:1: ( rule__Initiates__Group__0 )
            {
             before(grammarAccess.getInitiatesAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:588:1: ( rule__Initiates__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:588:2: rule__Initiates__Group__0
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:600:1: entryRuleTerminates : ruleTerminates EOF ;
    public final void entryRuleTerminates() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:600:21: ( ruleTerminates EOF )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:601:1: ruleTerminates EOF
            {
             before(grammarAccess.getTerminatesRule()); 
            pushFollow(FOLLOW_ruleTerminates_in_entryRuleTerminates1260);
            ruleTerminates();
            _fsp--;

             after(grammarAccess.getTerminatesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerminates1267); 

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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:608:1: ruleTerminates : ( ( rule__Terminates__Group__0 ) ) ;
    public final void ruleTerminates() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:612:2: ( ( ( rule__Terminates__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:613:1: ( ( rule__Terminates__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:613:1: ( ( rule__Terminates__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:614:1: ( rule__Terminates__Group__0 )
            {
             before(grammarAccess.getTerminatesAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:615:1: ( rule__Terminates__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:615:2: rule__Terminates__Group__0
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:627:1: entryRulePath : rulePath EOF ;
    public final void entryRulePath() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:627:15: ( rulePath EOF )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:628:1: rulePath EOF
            {
             before(grammarAccess.getPathRule()); 
            pushFollow(FOLLOW_rulePath_in_entryRulePath1320);
            rulePath();
            _fsp--;

             after(grammarAccess.getPathRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePath1327); 

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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:635:1: rulePath : ( ( rule__Path__Group__0 ) ) ;
    public final void rulePath() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:639:2: ( ( ( rule__Path__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:640:1: ( ( rule__Path__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:640:1: ( ( rule__Path__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:641:1: ( rule__Path__Group__0 )
            {
             before(grammarAccess.getPathAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:642:1: ( rule__Path__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:642:2: rule__Path__Group__0
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:654:1: entryRuleFile : ruleFile EOF ;
    public final void entryRuleFile() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:654:15: ( ruleFile EOF )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:655:1: ruleFile EOF
            {
             before(grammarAccess.getFileRule()); 
            pushFollow(FOLLOW_ruleFile_in_entryRuleFile1380);
            ruleFile();
            _fsp--;

             after(grammarAccess.getFileRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFile1387); 

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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:662:1: ruleFile : ( ( rule__File__Group__0 ) ) ;
    public final void ruleFile() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:666:2: ( ( ( rule__File__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:667:1: ( ( rule__File__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:667:1: ( ( rule__File__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:668:1: ( rule__File__Group__0 )
            {
             before(grammarAccess.getFileAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:669:1: ( rule__File__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:669:2: rule__File__Group__0
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:682:1: ruleBinaryIntOp : ( ( rule__BinaryIntOp__Alternatives ) ) ;
    public final void ruleBinaryIntOp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:686:1: ( ( ( rule__BinaryIntOp__Alternatives ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:687:1: ( ( rule__BinaryIntOp__Alternatives ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:687:1: ( ( rule__BinaryIntOp__Alternatives ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:688:1: ( rule__BinaryIntOp__Alternatives )
            {
             before(grammarAccess.getBinaryIntOpAccess().getAlternatives()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:689:1: ( rule__BinaryIntOp__Alternatives )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:689:2: rule__BinaryIntOp__Alternatives
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:701:1: ruleUnaryBoolOp : ( ( '!' ) ) ;
    public final void ruleUnaryBoolOp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:705:1: ( ( ( '!' ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:706:1: ( ( '!' ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:706:1: ( ( '!' ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:707:1: ( '!' )
            {
             before(grammarAccess.getUnaryBoolOpAccess().getNEGATIONEnumLiteralDeclaration()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:708:1: ( '!' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:708:3: '!'
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:721:1: ruleBinaryBoolOp : ( ( rule__BinaryBoolOp__Alternatives ) ) ;
    public final void ruleBinaryBoolOp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:725:1: ( ( ( rule__BinaryBoolOp__Alternatives ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:726:1: ( ( rule__BinaryBoolOp__Alternatives ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:726:1: ( ( rule__BinaryBoolOp__Alternatives ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:727:1: ( rule__BinaryBoolOp__Alternatives )
            {
             before(grammarAccess.getBinaryBoolOpAccess().getAlternatives()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:728:1: ( rule__BinaryBoolOp__Alternatives )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:728:2: rule__BinaryBoolOp__Alternatives
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:739:1: rule__IntTerm__Alternatives : ( ( ( rule__IntTerm__ConstAssignment_0 ) ) | ( ( rule__IntTerm__VarAssignment_1 ) ) );
    public final void rule__IntTerm__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:743:1: ( ( ( rule__IntTerm__ConstAssignment_0 ) ) | ( ( rule__IntTerm__VarAssignment_1 ) ) )
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
                    new NoViableAltException("739:1: rule__IntTerm__Alternatives : ( ( ( rule__IntTerm__ConstAssignment_0 ) ) | ( ( rule__IntTerm__VarAssignment_1 ) ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:744:1: ( ( rule__IntTerm__ConstAssignment_0 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:744:1: ( ( rule__IntTerm__ConstAssignment_0 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:745:1: ( rule__IntTerm__ConstAssignment_0 )
                    {
                     before(grammarAccess.getIntTermAccess().getConstAssignment_0()); 
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:746:1: ( rule__IntTerm__ConstAssignment_0 )
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:746:2: rule__IntTerm__ConstAssignment_0
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
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:750:6: ( ( rule__IntTerm__VarAssignment_1 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:750:6: ( ( rule__IntTerm__VarAssignment_1 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:751:1: ( rule__IntTerm__VarAssignment_1 )
                    {
                     before(grammarAccess.getIntTermAccess().getVarAssignment_1()); 
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:752:1: ( rule__IntTerm__VarAssignment_1 )
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:752:2: rule__IntTerm__VarAssignment_1
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:761:1: rule__IntExpr__Alternatives : ( ( ruleIntTerm ) | ( ruleBinaryIntExpr ) );
    public final void rule__IntExpr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:765:1: ( ( ruleIntTerm ) | ( ruleBinaryIntExpr ) )
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
                        new NoViableAltException("761:1: rule__IntExpr__Alternatives : ( ( ruleIntTerm ) | ( ruleBinaryIntExpr ) );", 2, 1, input);

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
                        new NoViableAltException("761:1: rule__IntExpr__Alternatives : ( ( ruleIntTerm ) | ( ruleBinaryIntExpr ) );", 2, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("761:1: rule__IntExpr__Alternatives : ( ( ruleIntTerm ) | ( ruleBinaryIntExpr ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:766:1: ( ruleIntTerm )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:766:1: ( ruleIntTerm )
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:767:1: ruleIntTerm
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
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:772:6: ( ruleBinaryIntExpr )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:772:6: ( ruleBinaryIntExpr )
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:773:1: ruleBinaryIntExpr
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:783:1: rule__TemporalPredicate__Alternatives : ( ( ruleHoldsAt ) | ( ruleHappens ) | ( ruleInitiates ) | ( ruleTerminates ) );
    public final void rule__TemporalPredicate__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:787:1: ( ( ruleHoldsAt ) | ( ruleHappens ) | ( ruleInitiates ) | ( ruleTerminates ) )
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
                    new NoViableAltException("783:1: rule__TemporalPredicate__Alternatives : ( ( ruleHoldsAt ) | ( ruleHappens ) | ( ruleInitiates ) | ( ruleTerminates ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:788:1: ( ruleHoldsAt )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:788:1: ( ruleHoldsAt )
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:789:1: ruleHoldsAt
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
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:794:6: ( ruleHappens )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:794:6: ( ruleHappens )
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:795:1: ruleHappens
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
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:800:6: ( ruleInitiates )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:800:6: ( ruleInitiates )
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:801:1: ruleInitiates
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
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:806:6: ( ruleTerminates )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:806:6: ( ruleTerminates )
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:807:1: ruleTerminates
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:817:1: rule__BoolExpr__Alternatives : ( ( ruleTemporalPredicate ) | ( ruleUnaryBoolExpr ) | ( ruleBinaryBoolExpr ) );
    public final void rule__BoolExpr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:821:1: ( ( ruleTemporalPredicate ) | ( ruleUnaryBoolExpr ) | ( ruleBinaryBoolExpr ) )
            int alt4=3;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:822:1: ( ruleTemporalPredicate )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:822:1: ( ruleTemporalPredicate )
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:823:1: ruleTemporalPredicate
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
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:828:6: ( ruleUnaryBoolExpr )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:828:6: ( ruleUnaryBoolExpr )
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:829:1: ruleUnaryBoolExpr
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
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:834:6: ( ruleBinaryBoolExpr )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:834:6: ( ruleBinaryBoolExpr )
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:835:1: ruleBinaryBoolExpr
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:845:1: rule__UnaryBoolExpr__Alternatives : ( ( ( rule__UnaryBoolExpr__Group_0__0 ) ) | ( ( rule__UnaryBoolExpr__Group_1__0 ) ) );
    public final void rule__UnaryBoolExpr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:849:1: ( ( ( rule__UnaryBoolExpr__Group_0__0 ) ) | ( ( rule__UnaryBoolExpr__Group_1__0 ) ) )
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
                    new NoViableAltException("845:1: rule__UnaryBoolExpr__Alternatives : ( ( ( rule__UnaryBoolExpr__Group_0__0 ) ) | ( ( rule__UnaryBoolExpr__Group_1__0 ) ) );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:850:1: ( ( rule__UnaryBoolExpr__Group_0__0 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:850:1: ( ( rule__UnaryBoolExpr__Group_0__0 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:851:1: ( rule__UnaryBoolExpr__Group_0__0 )
                    {
                     before(grammarAccess.getUnaryBoolExprAccess().getGroup_0()); 
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:852:1: ( rule__UnaryBoolExpr__Group_0__0 )
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:852:2: rule__UnaryBoolExpr__Group_0__0
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
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:856:6: ( ( rule__UnaryBoolExpr__Group_1__0 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:856:6: ( ( rule__UnaryBoolExpr__Group_1__0 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:857:1: ( rule__UnaryBoolExpr__Group_1__0 )
                    {
                     before(grammarAccess.getUnaryBoolExprAccess().getGroup_1()); 
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:858:1: ( rule__UnaryBoolExpr__Group_1__0 )
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:858:2: rule__UnaryBoolExpr__Group_1__0
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:867:1: rule__Entity__Alternatives : ( ( ruleFluent ) | ( ruleEvent ) | ( ruleSort ) );
    public final void rule__Entity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:871:1: ( ( ruleFluent ) | ( ruleEvent ) | ( ruleSort ) )
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
                    new NoViableAltException("867:1: rule__Entity__Alternatives : ( ( ruleFluent ) | ( ruleEvent ) | ( ruleSort ) );", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:872:1: ( ruleFluent )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:872:1: ( ruleFluent )
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:873:1: ruleFluent
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
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:878:6: ( ruleEvent )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:878:6: ( ruleEvent )
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:879:1: ruleEvent
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
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:884:6: ( ruleSort )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:884:6: ( ruleSort )
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:885:1: ruleSort
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:895:1: rule__BinaryIntOp__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) );
    public final void rule__BinaryIntOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:899:1: ( ( ( '+' ) ) | ( ( '-' ) ) )
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
                    new NoViableAltException("895:1: rule__BinaryIntOp__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) );", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:900:1: ( ( '+' ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:900:1: ( ( '+' ) )
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:901:1: ( '+' )
                    {
                     before(grammarAccess.getBinaryIntOpAccess().getPLUSEnumLiteralDeclaration_0()); 
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:902:1: ( '+' )
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:902:3: '+'
                    {
                    match(input,12,FOLLOW_12_in_rule__BinaryIntOp__Alternatives1928); 

                    }

                     after(grammarAccess.getBinaryIntOpAccess().getPLUSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:907:6: ( ( '-' ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:907:6: ( ( '-' ) )
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:908:1: ( '-' )
                    {
                     before(grammarAccess.getBinaryIntOpAccess().getMINUSEnumLiteralDeclaration_1()); 
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:909:1: ( '-' )
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:909:3: '-'
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:919:1: rule__BinaryBoolOp__Alternatives : ( ( ( '->' ) ) | ( ( '<->' ) ) | ( ( '&' ) ) | ( ( '|' ) ) );
    public final void rule__BinaryBoolOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:923:1: ( ( ( '->' ) ) | ( ( '<->' ) ) | ( ( '&' ) ) | ( ( '|' ) ) )
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
                    new NoViableAltException("919:1: rule__BinaryBoolOp__Alternatives : ( ( ( '->' ) ) | ( ( '<->' ) ) | ( ( '&' ) ) | ( ( '|' ) ) );", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:924:1: ( ( '->' ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:924:1: ( ( '->' ) )
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:925:1: ( '->' )
                    {
                     before(grammarAccess.getBinaryBoolOpAccess().getIMPLICATIONEnumLiteralDeclaration_0()); 
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:926:1: ( '->' )
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:926:3: '->'
                    {
                    match(input,14,FOLLOW_14_in_rule__BinaryBoolOp__Alternatives1985); 

                    }

                     after(grammarAccess.getBinaryBoolOpAccess().getIMPLICATIONEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:931:6: ( ( '<->' ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:931:6: ( ( '<->' ) )
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:932:1: ( '<->' )
                    {
                     before(grammarAccess.getBinaryBoolOpAccess().getEQUIVALENCEEnumLiteralDeclaration_1()); 
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:933:1: ( '<->' )
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:933:3: '<->'
                    {
                    match(input,15,FOLLOW_15_in_rule__BinaryBoolOp__Alternatives2006); 

                    }

                     after(grammarAccess.getBinaryBoolOpAccess().getEQUIVALENCEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:938:6: ( ( '&' ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:938:6: ( ( '&' ) )
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:939:1: ( '&' )
                    {
                     before(grammarAccess.getBinaryBoolOpAccess().getANDEnumLiteralDeclaration_2()); 
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:940:1: ( '&' )
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:940:3: '&'
                    {
                    match(input,16,FOLLOW_16_in_rule__BinaryBoolOp__Alternatives2027); 

                    }

                     after(grammarAccess.getBinaryBoolOpAccess().getANDEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:945:6: ( ( '|' ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:945:6: ( ( '|' ) )
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:946:1: ( '|' )
                    {
                     before(grammarAccess.getBinaryBoolOpAccess().getOREnumLiteralDeclaration_3()); 
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:947:1: ( '|' )
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:947:3: '|'
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:959:1: rule__Knowledge__Group__0 : ( ( rule__Knowledge__ImportsAssignment_0 )* ) rule__Knowledge__Group__1 ;
    public final void rule__Knowledge__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:963:1: ( ( ( rule__Knowledge__ImportsAssignment_0 )* ) rule__Knowledge__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:964:1: ( ( rule__Knowledge__ImportsAssignment_0 )* ) rule__Knowledge__Group__1
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:964:1: ( ( rule__Knowledge__ImportsAssignment_0 )* )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:965:1: ( rule__Knowledge__ImportsAssignment_0 )*
            {
             before(grammarAccess.getKnowledgeAccess().getImportsAssignment_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:966:1: ( rule__Knowledge__ImportsAssignment_0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==25) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:966:2: rule__Knowledge__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Knowledge__ImportsAssignment_0_in_rule__Knowledge__Group__02085);
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

            pushFollow(FOLLOW_rule__Knowledge__Group__1_in_rule__Knowledge__Group__02095);
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


    // $ANTLR start rule__Knowledge__Group__1
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:977:1: rule__Knowledge__Group__1 : ( ( rule__Knowledge__EntitiesAssignment_1 )* ) rule__Knowledge__Group__2 ;
    public final void rule__Knowledge__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:981:1: ( ( ( rule__Knowledge__EntitiesAssignment_1 )* ) rule__Knowledge__Group__2 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:982:1: ( ( rule__Knowledge__EntitiesAssignment_1 )* ) rule__Knowledge__Group__2
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:982:1: ( ( rule__Knowledge__EntitiesAssignment_1 )* )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:983:1: ( rule__Knowledge__EntitiesAssignment_1 )*
            {
             before(grammarAccess.getKnowledgeAccess().getEntitiesAssignment_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:984:1: ( rule__Knowledge__EntitiesAssignment_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==24||(LA10_0>=27 && LA10_0<=28)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:984:2: rule__Knowledge__EntitiesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Knowledge__EntitiesAssignment_1_in_rule__Knowledge__Group__12123);
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

            pushFollow(FOLLOW_rule__Knowledge__Group__2_in_rule__Knowledge__Group__12133);
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


    // $ANTLR start rule__Knowledge__Group__2
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:995:1: rule__Knowledge__Group__2 : ( ( rule__Knowledge__Group_2__0 )* ) rule__Knowledge__Group__3 ;
    public final void rule__Knowledge__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:999:1: ( ( ( rule__Knowledge__Group_2__0 )* ) rule__Knowledge__Group__3 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1000:1: ( ( rule__Knowledge__Group_2__0 )* ) rule__Knowledge__Group__3
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1000:1: ( ( rule__Knowledge__Group_2__0 )* )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1001:1: ( rule__Knowledge__Group_2__0 )*
            {
             before(grammarAccess.getKnowledgeAccess().getGroup_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1002:1: ( rule__Knowledge__Group_2__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==11||LA11_0==19||LA11_0==22||(LA11_0>=29 && LA11_0<=32)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1002:2: rule__Knowledge__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Knowledge__Group_2__0_in_rule__Knowledge__Group__22161);
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

            pushFollow(FOLLOW_rule__Knowledge__Group__3_in_rule__Knowledge__Group__22171);
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


    // $ANTLR start rule__Knowledge__Group__3
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1013:1: rule__Knowledge__Group__3 : ( ( rule__Knowledge__VarsAssignment_3 )* ) ;
    public final void rule__Knowledge__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1017:1: ( ( ( rule__Knowledge__VarsAssignment_3 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1018:1: ( ( rule__Knowledge__VarsAssignment_3 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1018:1: ( ( rule__Knowledge__VarsAssignment_3 )* )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1019:1: ( rule__Knowledge__VarsAssignment_3 )*
            {
             before(grammarAccess.getKnowledgeAccess().getVarsAssignment_3()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1020:1: ( rule__Knowledge__VarsAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==26) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1020:2: rule__Knowledge__VarsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Knowledge__VarsAssignment_3_in_rule__Knowledge__Group__32199);
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
    // $ANTLR end rule__Knowledge__Group__3


    // $ANTLR start rule__Knowledge__Group_2__0
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1038:1: rule__Knowledge__Group_2__0 : ( ( rule__Knowledge__RulesAssignment_2_0 ) ) rule__Knowledge__Group_2__1 ;
    public final void rule__Knowledge__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1042:1: ( ( ( rule__Knowledge__RulesAssignment_2_0 ) ) rule__Knowledge__Group_2__1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1043:1: ( ( rule__Knowledge__RulesAssignment_2_0 ) ) rule__Knowledge__Group_2__1
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1043:1: ( ( rule__Knowledge__RulesAssignment_2_0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1044:1: ( rule__Knowledge__RulesAssignment_2_0 )
            {
             before(grammarAccess.getKnowledgeAccess().getRulesAssignment_2_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1045:1: ( rule__Knowledge__RulesAssignment_2_0 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1045:2: rule__Knowledge__RulesAssignment_2_0
            {
            pushFollow(FOLLOW_rule__Knowledge__RulesAssignment_2_0_in_rule__Knowledge__Group_2__02242);
            rule__Knowledge__RulesAssignment_2_0();
            _fsp--;


            }

             after(grammarAccess.getKnowledgeAccess().getRulesAssignment_2_0()); 

            }

            pushFollow(FOLLOW_rule__Knowledge__Group_2__1_in_rule__Knowledge__Group_2__02251);
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


    // $ANTLR start rule__Knowledge__Group_2__1
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1056:1: rule__Knowledge__Group_2__1 : ( '.' ) ;
    public final void rule__Knowledge__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1060:1: ( ( '.' ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1061:1: ( '.' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1061:1: ( '.' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1062:1: '.'
            {
             before(grammarAccess.getKnowledgeAccess().getFullStopKeyword_2_1()); 
            match(input,18,FOLLOW_18_in_rule__Knowledge__Group_2__12280); 
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
    // $ANTLR end rule__Knowledge__Group_2__1


    // $ANTLR start rule__Rule__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1079:1: rule__Rule__Group__0 : ( ( rule__Rule__DeclAssignment_0 )? ) rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1083:1: ( ( ( rule__Rule__DeclAssignment_0 )? ) rule__Rule__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1084:1: ( ( rule__Rule__DeclAssignment_0 )? ) rule__Rule__Group__1
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1084:1: ( ( rule__Rule__DeclAssignment_0 )? )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1085:1: ( rule__Rule__DeclAssignment_0 )?
            {
             before(grammarAccess.getRuleAccess().getDeclAssignment_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1086:1: ( rule__Rule__DeclAssignment_0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==19) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1086:2: rule__Rule__DeclAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Rule__DeclAssignment_0_in_rule__Rule__Group__02319);
                    rule__Rule__DeclAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRuleAccess().getDeclAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__02329);
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


    // $ANTLR start rule__Rule__Group__1
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1097:1: rule__Rule__Group__1 : ( ( rule__Rule__ExprAssignment_1 ) ) ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1101:1: ( ( ( rule__Rule__ExprAssignment_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1102:1: ( ( rule__Rule__ExprAssignment_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1102:1: ( ( rule__Rule__ExprAssignment_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1103:1: ( rule__Rule__ExprAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getExprAssignment_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1104:1: ( rule__Rule__ExprAssignment_1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1104:2: rule__Rule__ExprAssignment_1
            {
            pushFollow(FOLLOW_rule__Rule__ExprAssignment_1_in_rule__Rule__Group__12357);
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
    // $ANTLR end rule__Rule__Group__1


    // $ANTLR start rule__VarDecl__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1118:1: rule__VarDecl__Group__0 : ( '[' ) rule__VarDecl__Group__1 ;
    public final void rule__VarDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1122:1: ( ( '[' ) rule__VarDecl__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1123:1: ( '[' ) rule__VarDecl__Group__1
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1123:1: ( '[' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1124:1: '['
            {
             before(grammarAccess.getVarDeclAccess().getLeftSquareBracketKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__VarDecl__Group__02396); 
             after(grammarAccess.getVarDeclAccess().getLeftSquareBracketKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__VarDecl__Group__1_in_rule__VarDecl__Group__02406);
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


    // $ANTLR start rule__VarDecl__Group__1
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1138:1: rule__VarDecl__Group__1 : ( ( rule__VarDecl__VarsAssignment_1 ) ) rule__VarDecl__Group__2 ;
    public final void rule__VarDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1142:1: ( ( ( rule__VarDecl__VarsAssignment_1 ) ) rule__VarDecl__Group__2 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1143:1: ( ( rule__VarDecl__VarsAssignment_1 ) ) rule__VarDecl__Group__2
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1143:1: ( ( rule__VarDecl__VarsAssignment_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1144:1: ( rule__VarDecl__VarsAssignment_1 )
            {
             before(grammarAccess.getVarDeclAccess().getVarsAssignment_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1145:1: ( rule__VarDecl__VarsAssignment_1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1145:2: rule__VarDecl__VarsAssignment_1
            {
            pushFollow(FOLLOW_rule__VarDecl__VarsAssignment_1_in_rule__VarDecl__Group__12434);
            rule__VarDecl__VarsAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getVarDeclAccess().getVarsAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__VarDecl__Group__2_in_rule__VarDecl__Group__12443);
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


    // $ANTLR start rule__VarDecl__Group__2
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1156:1: rule__VarDecl__Group__2 : ( ( rule__VarDecl__Group_2__0 )* ) rule__VarDecl__Group__3 ;
    public final void rule__VarDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1160:1: ( ( ( rule__VarDecl__Group_2__0 )* ) rule__VarDecl__Group__3 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1161:1: ( ( rule__VarDecl__Group_2__0 )* ) rule__VarDecl__Group__3
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1161:1: ( ( rule__VarDecl__Group_2__0 )* )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1162:1: ( rule__VarDecl__Group_2__0 )*
            {
             before(grammarAccess.getVarDeclAccess().getGroup_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1163:1: ( rule__VarDecl__Group_2__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==21) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1163:2: rule__VarDecl__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__VarDecl__Group_2__0_in_rule__VarDecl__Group__22471);
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

            pushFollow(FOLLOW_rule__VarDecl__Group__3_in_rule__VarDecl__Group__22481);
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


    // $ANTLR start rule__VarDecl__Group__3
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1174:1: rule__VarDecl__Group__3 : ( ']' ) ;
    public final void rule__VarDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1178:1: ( ( ']' ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1179:1: ( ']' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1179:1: ( ']' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1180:1: ']'
            {
             before(grammarAccess.getVarDeclAccess().getRightSquareBracketKeyword_3()); 
            match(input,20,FOLLOW_20_in_rule__VarDecl__Group__32510); 
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
    // $ANTLR end rule__VarDecl__Group__3


    // $ANTLR start rule__VarDecl__Group_2__0
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1201:1: rule__VarDecl__Group_2__0 : ( ',' ) rule__VarDecl__Group_2__1 ;
    public final void rule__VarDecl__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1205:1: ( ( ',' ) rule__VarDecl__Group_2__1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1206:1: ( ',' ) rule__VarDecl__Group_2__1
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1206:1: ( ',' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1207:1: ','
            {
             before(grammarAccess.getVarDeclAccess().getCommaKeyword_2_0()); 
            match(input,21,FOLLOW_21_in_rule__VarDecl__Group_2__02554); 
             after(grammarAccess.getVarDeclAccess().getCommaKeyword_2_0()); 

            }

            pushFollow(FOLLOW_rule__VarDecl__Group_2__1_in_rule__VarDecl__Group_2__02564);
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


    // $ANTLR start rule__VarDecl__Group_2__1
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1221:1: rule__VarDecl__Group_2__1 : ( ( rule__VarDecl__VarsAssignment_2_1 ) ) ;
    public final void rule__VarDecl__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1225:1: ( ( ( rule__VarDecl__VarsAssignment_2_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1226:1: ( ( rule__VarDecl__VarsAssignment_2_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1226:1: ( ( rule__VarDecl__VarsAssignment_2_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1227:1: ( rule__VarDecl__VarsAssignment_2_1 )
            {
             before(grammarAccess.getVarDeclAccess().getVarsAssignment_2_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1228:1: ( rule__VarDecl__VarsAssignment_2_1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1228:2: rule__VarDecl__VarsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__VarDecl__VarsAssignment_2_1_in_rule__VarDecl__Group_2__12592);
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
    // $ANTLR end rule__VarDecl__Group_2__1


    // $ANTLR start rule__BinaryIntExpr__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1242:1: rule__BinaryIntExpr__Group__0 : ( ( rule__BinaryIntExpr__OprAssignment_0 ) ) rule__BinaryIntExpr__Group__1 ;
    public final void rule__BinaryIntExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1246:1: ( ( ( rule__BinaryIntExpr__OprAssignment_0 ) ) rule__BinaryIntExpr__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1247:1: ( ( rule__BinaryIntExpr__OprAssignment_0 ) ) rule__BinaryIntExpr__Group__1
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1247:1: ( ( rule__BinaryIntExpr__OprAssignment_0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1248:1: ( rule__BinaryIntExpr__OprAssignment_0 )
            {
             before(grammarAccess.getBinaryIntExprAccess().getOprAssignment_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1249:1: ( rule__BinaryIntExpr__OprAssignment_0 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1249:2: rule__BinaryIntExpr__OprAssignment_0
            {
            pushFollow(FOLLOW_rule__BinaryIntExpr__OprAssignment_0_in_rule__BinaryIntExpr__Group__02630);
            rule__BinaryIntExpr__OprAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getBinaryIntExprAccess().getOprAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__BinaryIntExpr__Group__1_in_rule__BinaryIntExpr__Group__02639);
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


    // $ANTLR start rule__BinaryIntExpr__Group__1
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1260:1: rule__BinaryIntExpr__Group__1 : ( ( rule__BinaryIntExpr__BinaryopAssignment_1 ) ) rule__BinaryIntExpr__Group__2 ;
    public final void rule__BinaryIntExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1264:1: ( ( ( rule__BinaryIntExpr__BinaryopAssignment_1 ) ) rule__BinaryIntExpr__Group__2 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1265:1: ( ( rule__BinaryIntExpr__BinaryopAssignment_1 ) ) rule__BinaryIntExpr__Group__2
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1265:1: ( ( rule__BinaryIntExpr__BinaryopAssignment_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1266:1: ( rule__BinaryIntExpr__BinaryopAssignment_1 )
            {
             before(grammarAccess.getBinaryIntExprAccess().getBinaryopAssignment_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1267:1: ( rule__BinaryIntExpr__BinaryopAssignment_1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1267:2: rule__BinaryIntExpr__BinaryopAssignment_1
            {
            pushFollow(FOLLOW_rule__BinaryIntExpr__BinaryopAssignment_1_in_rule__BinaryIntExpr__Group__12667);
            rule__BinaryIntExpr__BinaryopAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getBinaryIntExprAccess().getBinaryopAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__BinaryIntExpr__Group__2_in_rule__BinaryIntExpr__Group__12676);
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


    // $ANTLR start rule__BinaryIntExpr__Group__2
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1278:1: rule__BinaryIntExpr__Group__2 : ( ( rule__BinaryIntExpr__OprAssignment_2 ) ) ;
    public final void rule__BinaryIntExpr__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1282:1: ( ( ( rule__BinaryIntExpr__OprAssignment_2 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1283:1: ( ( rule__BinaryIntExpr__OprAssignment_2 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1283:1: ( ( rule__BinaryIntExpr__OprAssignment_2 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1284:1: ( rule__BinaryIntExpr__OprAssignment_2 )
            {
             before(grammarAccess.getBinaryIntExprAccess().getOprAssignment_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1285:1: ( rule__BinaryIntExpr__OprAssignment_2 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1285:2: rule__BinaryIntExpr__OprAssignment_2
            {
            pushFollow(FOLLOW_rule__BinaryIntExpr__OprAssignment_2_in_rule__BinaryIntExpr__Group__22704);
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
    // $ANTLR end rule__BinaryIntExpr__Group__2


    // $ANTLR start rule__UnaryBoolExpr__Group_0__0
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1301:1: rule__UnaryBoolExpr__Group_0__0 : ( ( rule__UnaryBoolExpr__Unaryop_lhsAssignment_0_0 ) ) rule__UnaryBoolExpr__Group_0__1 ;
    public final void rule__UnaryBoolExpr__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1305:1: ( ( ( rule__UnaryBoolExpr__Unaryop_lhsAssignment_0_0 ) ) rule__UnaryBoolExpr__Group_0__1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1306:1: ( ( rule__UnaryBoolExpr__Unaryop_lhsAssignment_0_0 ) ) rule__UnaryBoolExpr__Group_0__1
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1306:1: ( ( rule__UnaryBoolExpr__Unaryop_lhsAssignment_0_0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1307:1: ( rule__UnaryBoolExpr__Unaryop_lhsAssignment_0_0 )
            {
             before(grammarAccess.getUnaryBoolExprAccess().getUnaryop_lhsAssignment_0_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1308:1: ( rule__UnaryBoolExpr__Unaryop_lhsAssignment_0_0 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1308:2: rule__UnaryBoolExpr__Unaryop_lhsAssignment_0_0
            {
            pushFollow(FOLLOW_rule__UnaryBoolExpr__Unaryop_lhsAssignment_0_0_in_rule__UnaryBoolExpr__Group_0__02744);
            rule__UnaryBoolExpr__Unaryop_lhsAssignment_0_0();
            _fsp--;


            }

             after(grammarAccess.getUnaryBoolExprAccess().getUnaryop_lhsAssignment_0_0()); 

            }

            pushFollow(FOLLOW_rule__UnaryBoolExpr__Group_0__1_in_rule__UnaryBoolExpr__Group_0__02753);
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


    // $ANTLR start rule__UnaryBoolExpr__Group_0__1
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1319:1: rule__UnaryBoolExpr__Group_0__1 : ( ( rule__UnaryBoolExpr__OprAssignment_0_1 ) ) ;
    public final void rule__UnaryBoolExpr__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1323:1: ( ( ( rule__UnaryBoolExpr__OprAssignment_0_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1324:1: ( ( rule__UnaryBoolExpr__OprAssignment_0_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1324:1: ( ( rule__UnaryBoolExpr__OprAssignment_0_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1325:1: ( rule__UnaryBoolExpr__OprAssignment_0_1 )
            {
             before(grammarAccess.getUnaryBoolExprAccess().getOprAssignment_0_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1326:1: ( rule__UnaryBoolExpr__OprAssignment_0_1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1326:2: rule__UnaryBoolExpr__OprAssignment_0_1
            {
            pushFollow(FOLLOW_rule__UnaryBoolExpr__OprAssignment_0_1_in_rule__UnaryBoolExpr__Group_0__12781);
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
    // $ANTLR end rule__UnaryBoolExpr__Group_0__1


    // $ANTLR start rule__UnaryBoolExpr__Group_1__0
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1340:1: rule__UnaryBoolExpr__Group_1__0 : ( '(' ) rule__UnaryBoolExpr__Group_1__1 ;
    public final void rule__UnaryBoolExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1344:1: ( ( '(' ) rule__UnaryBoolExpr__Group_1__1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1345:1: ( '(' ) rule__UnaryBoolExpr__Group_1__1
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1345:1: ( '(' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1346:1: '('
            {
             before(grammarAccess.getUnaryBoolExprAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,22,FOLLOW_22_in_rule__UnaryBoolExpr__Group_1__02820); 
             after(grammarAccess.getUnaryBoolExprAccess().getLeftParenthesisKeyword_1_0()); 

            }

            pushFollow(FOLLOW_rule__UnaryBoolExpr__Group_1__1_in_rule__UnaryBoolExpr__Group_1__02830);
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


    // $ANTLR start rule__UnaryBoolExpr__Group_1__1
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1360:1: rule__UnaryBoolExpr__Group_1__1 : ( ( rule__UnaryBoolExpr__OpsAssignment_1_1 ) ) rule__UnaryBoolExpr__Group_1__2 ;
    public final void rule__UnaryBoolExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1364:1: ( ( ( rule__UnaryBoolExpr__OpsAssignment_1_1 ) ) rule__UnaryBoolExpr__Group_1__2 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1365:1: ( ( rule__UnaryBoolExpr__OpsAssignment_1_1 ) ) rule__UnaryBoolExpr__Group_1__2
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1365:1: ( ( rule__UnaryBoolExpr__OpsAssignment_1_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1366:1: ( rule__UnaryBoolExpr__OpsAssignment_1_1 )
            {
             before(grammarAccess.getUnaryBoolExprAccess().getOpsAssignment_1_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1367:1: ( rule__UnaryBoolExpr__OpsAssignment_1_1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1367:2: rule__UnaryBoolExpr__OpsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__UnaryBoolExpr__OpsAssignment_1_1_in_rule__UnaryBoolExpr__Group_1__12858);
            rule__UnaryBoolExpr__OpsAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getUnaryBoolExprAccess().getOpsAssignment_1_1()); 

            }

            pushFollow(FOLLOW_rule__UnaryBoolExpr__Group_1__2_in_rule__UnaryBoolExpr__Group_1__12867);
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


    // $ANTLR start rule__UnaryBoolExpr__Group_1__2
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1378:1: rule__UnaryBoolExpr__Group_1__2 : ( ')' ) ;
    public final void rule__UnaryBoolExpr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1382:1: ( ( ')' ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1383:1: ( ')' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1383:1: ( ')' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1384:1: ')'
            {
             before(grammarAccess.getUnaryBoolExprAccess().getRightParenthesisKeyword_1_2()); 
            match(input,23,FOLLOW_23_in_rule__UnaryBoolExpr__Group_1__22896); 
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
    // $ANTLR end rule__UnaryBoolExpr__Group_1__2


    // $ANTLR start rule__BinaryBoolExpr__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1403:1: rule__BinaryBoolExpr__Group__0 : ( ( rule__BinaryBoolExpr__OprAssignment_0 ) ) rule__BinaryBoolExpr__Group__1 ;
    public final void rule__BinaryBoolExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1407:1: ( ( ( rule__BinaryBoolExpr__OprAssignment_0 ) ) rule__BinaryBoolExpr__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1408:1: ( ( rule__BinaryBoolExpr__OprAssignment_0 ) ) rule__BinaryBoolExpr__Group__1
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1408:1: ( ( rule__BinaryBoolExpr__OprAssignment_0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1409:1: ( rule__BinaryBoolExpr__OprAssignment_0 )
            {
             before(grammarAccess.getBinaryBoolExprAccess().getOprAssignment_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1410:1: ( rule__BinaryBoolExpr__OprAssignment_0 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1410:2: rule__BinaryBoolExpr__OprAssignment_0
            {
            pushFollow(FOLLOW_rule__BinaryBoolExpr__OprAssignment_0_in_rule__BinaryBoolExpr__Group__02937);
            rule__BinaryBoolExpr__OprAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getBinaryBoolExprAccess().getOprAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__BinaryBoolExpr__Group__1_in_rule__BinaryBoolExpr__Group__02946);
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


    // $ANTLR start rule__BinaryBoolExpr__Group__1
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1421:1: rule__BinaryBoolExpr__Group__1 : ( ( rule__BinaryBoolExpr__BinaryopAssignment_1 ) ) rule__BinaryBoolExpr__Group__2 ;
    public final void rule__BinaryBoolExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1425:1: ( ( ( rule__BinaryBoolExpr__BinaryopAssignment_1 ) ) rule__BinaryBoolExpr__Group__2 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1426:1: ( ( rule__BinaryBoolExpr__BinaryopAssignment_1 ) ) rule__BinaryBoolExpr__Group__2
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1426:1: ( ( rule__BinaryBoolExpr__BinaryopAssignment_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1427:1: ( rule__BinaryBoolExpr__BinaryopAssignment_1 )
            {
             before(grammarAccess.getBinaryBoolExprAccess().getBinaryopAssignment_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1428:1: ( rule__BinaryBoolExpr__BinaryopAssignment_1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1428:2: rule__BinaryBoolExpr__BinaryopAssignment_1
            {
            pushFollow(FOLLOW_rule__BinaryBoolExpr__BinaryopAssignment_1_in_rule__BinaryBoolExpr__Group__12974);
            rule__BinaryBoolExpr__BinaryopAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getBinaryBoolExprAccess().getBinaryopAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__BinaryBoolExpr__Group__2_in_rule__BinaryBoolExpr__Group__12983);
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


    // $ANTLR start rule__BinaryBoolExpr__Group__2
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1439:1: rule__BinaryBoolExpr__Group__2 : ( ( rule__BinaryBoolExpr__OprAssignment_2 ) ) ;
    public final void rule__BinaryBoolExpr__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1443:1: ( ( ( rule__BinaryBoolExpr__OprAssignment_2 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1444:1: ( ( rule__BinaryBoolExpr__OprAssignment_2 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1444:1: ( ( rule__BinaryBoolExpr__OprAssignment_2 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1445:1: ( rule__BinaryBoolExpr__OprAssignment_2 )
            {
             before(grammarAccess.getBinaryBoolExprAccess().getOprAssignment_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1446:1: ( rule__BinaryBoolExpr__OprAssignment_2 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1446:2: rule__BinaryBoolExpr__OprAssignment_2
            {
            pushFollow(FOLLOW_rule__BinaryBoolExpr__OprAssignment_2_in_rule__BinaryBoolExpr__Group__23011);
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
    // $ANTLR end rule__BinaryBoolExpr__Group__2


    // $ANTLR start rule__Sort__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1462:1: rule__Sort__Group__0 : ( 'sort' ) rule__Sort__Group__1 ;
    public final void rule__Sort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1466:1: ( ( 'sort' ) rule__Sort__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1467:1: ( 'sort' ) rule__Sort__Group__1
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1467:1: ( 'sort' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1468:1: 'sort'
            {
             before(grammarAccess.getSortAccess().getSortKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__Sort__Group__03052); 
             after(grammarAccess.getSortAccess().getSortKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Sort__Group__1_in_rule__Sort__Group__03062);
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


    // $ANTLR start rule__Sort__Group__1
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1482:1: rule__Sort__Group__1 : ( ( rule__Sort__NameAssignment_1 ) ) ;
    public final void rule__Sort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1486:1: ( ( ( rule__Sort__NameAssignment_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1487:1: ( ( rule__Sort__NameAssignment_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1487:1: ( ( rule__Sort__NameAssignment_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1488:1: ( rule__Sort__NameAssignment_1 )
            {
             before(grammarAccess.getSortAccess().getNameAssignment_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1489:1: ( rule__Sort__NameAssignment_1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1489:2: rule__Sort__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Sort__NameAssignment_1_in_rule__Sort__Group__13090);
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
    // $ANTLR end rule__Sort__Group__1


    // $ANTLR start rule__Import__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1503:1: rule__Import__Group__0 : ( 'load' ) rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1507:1: ( ( 'load' ) rule__Import__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1508:1: ( 'load' ) rule__Import__Group__1
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1508:1: ( 'load' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1509:1: 'load'
            {
             before(grammarAccess.getImportAccess().getLoadKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__Import__Group__03129); 
             after(grammarAccess.getImportAccess().getLoadKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__03139);
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


    // $ANTLR start rule__Import__Group__1
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1523:1: rule__Import__Group__1 : ( ( rule__Import__PathAssignment_1 ) ) ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1527:1: ( ( ( rule__Import__PathAssignment_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1528:1: ( ( rule__Import__PathAssignment_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1528:1: ( ( rule__Import__PathAssignment_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1529:1: ( rule__Import__PathAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getPathAssignment_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1530:1: ( rule__Import__PathAssignment_1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1530:2: rule__Import__PathAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__PathAssignment_1_in_rule__Import__Group__13167);
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
    // $ANTLR end rule__Import__Group__1


    // $ANTLR start rule__Var__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1544:1: rule__Var__Group__0 : ( 'range' ) rule__Var__Group__1 ;
    public final void rule__Var__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1548:1: ( ( 'range' ) rule__Var__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1549:1: ( 'range' ) rule__Var__Group__1
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1549:1: ( 'range' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1550:1: 'range'
            {
             before(grammarAccess.getVarAccess().getRangeKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__Var__Group__03206); 
             after(grammarAccess.getVarAccess().getRangeKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Var__Group__1_in_rule__Var__Group__03216);
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


    // $ANTLR start rule__Var__Group__1
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1564:1: rule__Var__Group__1 : ( ( rule__Var__NameAssignment_1 ) ) rule__Var__Group__2 ;
    public final void rule__Var__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1568:1: ( ( ( rule__Var__NameAssignment_1 ) ) rule__Var__Group__2 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1569:1: ( ( rule__Var__NameAssignment_1 ) ) rule__Var__Group__2
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1569:1: ( ( rule__Var__NameAssignment_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1570:1: ( rule__Var__NameAssignment_1 )
            {
             before(grammarAccess.getVarAccess().getNameAssignment_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1571:1: ( rule__Var__NameAssignment_1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1571:2: rule__Var__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Var__NameAssignment_1_in_rule__Var__Group__13244);
            rule__Var__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getVarAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Var__Group__2_in_rule__Var__Group__13253);
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


    // $ANTLR start rule__Var__Group__2
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1582:1: rule__Var__Group__2 : ( ( rule__Var__MinAssignment_2 ) ) rule__Var__Group__3 ;
    public final void rule__Var__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1586:1: ( ( ( rule__Var__MinAssignment_2 ) ) rule__Var__Group__3 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1587:1: ( ( rule__Var__MinAssignment_2 ) ) rule__Var__Group__3
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1587:1: ( ( rule__Var__MinAssignment_2 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1588:1: ( rule__Var__MinAssignment_2 )
            {
             before(grammarAccess.getVarAccess().getMinAssignment_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1589:1: ( rule__Var__MinAssignment_2 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1589:2: rule__Var__MinAssignment_2
            {
            pushFollow(FOLLOW_rule__Var__MinAssignment_2_in_rule__Var__Group__23281);
            rule__Var__MinAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getVarAccess().getMinAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__Var__Group__3_in_rule__Var__Group__23290);
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


    // $ANTLR start rule__Var__Group__3
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1600:1: rule__Var__Group__3 : ( ( rule__Var__MaxAssignment_3 ) ) ;
    public final void rule__Var__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1604:1: ( ( ( rule__Var__MaxAssignment_3 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1605:1: ( ( rule__Var__MaxAssignment_3 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1605:1: ( ( rule__Var__MaxAssignment_3 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1606:1: ( rule__Var__MaxAssignment_3 )
            {
             before(grammarAccess.getVarAccess().getMaxAssignment_3()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1607:1: ( rule__Var__MaxAssignment_3 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1607:2: rule__Var__MaxAssignment_3
            {
            pushFollow(FOLLOW_rule__Var__MaxAssignment_3_in_rule__Var__Group__33318);
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
    // $ANTLR end rule__Var__Group__3


    // $ANTLR start rule__Fluent__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1625:1: rule__Fluent__Group__0 : ( 'fluent' ) rule__Fluent__Group__1 ;
    public final void rule__Fluent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1629:1: ( ( 'fluent' ) rule__Fluent__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1630:1: ( 'fluent' ) rule__Fluent__Group__1
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1630:1: ( 'fluent' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1631:1: 'fluent'
            {
             before(grammarAccess.getFluentAccess().getFluentKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__Fluent__Group__03361); 
             after(grammarAccess.getFluentAccess().getFluentKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Fluent__Group__1_in_rule__Fluent__Group__03371);
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


    // $ANTLR start rule__Fluent__Group__1
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1645:1: rule__Fluent__Group__1 : ( ( rule__Fluent__TermAssignment_1 ) ) ;
    public final void rule__Fluent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1649:1: ( ( ( rule__Fluent__TermAssignment_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1650:1: ( ( rule__Fluent__TermAssignment_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1650:1: ( ( rule__Fluent__TermAssignment_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1651:1: ( rule__Fluent__TermAssignment_1 )
            {
             before(grammarAccess.getFluentAccess().getTermAssignment_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1652:1: ( rule__Fluent__TermAssignment_1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1652:2: rule__Fluent__TermAssignment_1
            {
            pushFollow(FOLLOW_rule__Fluent__TermAssignment_1_in_rule__Fluent__Group__13399);
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
    // $ANTLR end rule__Fluent__Group__1


    // $ANTLR start rule__Event__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1666:1: rule__Event__Group__0 : ( 'event' ) rule__Event__Group__1 ;
    public final void rule__Event__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1670:1: ( ( 'event' ) rule__Event__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1671:1: ( 'event' ) rule__Event__Group__1
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1671:1: ( 'event' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1672:1: 'event'
            {
             before(grammarAccess.getEventAccess().getEventKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__Event__Group__03438); 
             after(grammarAccess.getEventAccess().getEventKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Event__Group__1_in_rule__Event__Group__03448);
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


    // $ANTLR start rule__Event__Group__1
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1686:1: rule__Event__Group__1 : ( ( rule__Event__TermAssignment_1 ) ) ;
    public final void rule__Event__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1690:1: ( ( ( rule__Event__TermAssignment_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1691:1: ( ( rule__Event__TermAssignment_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1691:1: ( ( rule__Event__TermAssignment_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1692:1: ( rule__Event__TermAssignment_1 )
            {
             before(grammarAccess.getEventAccess().getTermAssignment_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1693:1: ( rule__Event__TermAssignment_1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1693:2: rule__Event__TermAssignment_1
            {
            pushFollow(FOLLOW_rule__Event__TermAssignment_1_in_rule__Event__Group__13476);
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
    // $ANTLR end rule__Event__Group__1


    // $ANTLR start rule__Term__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1707:1: rule__Term__Group__0 : ( ( rule__Term__NameAssignment_0 ) ) rule__Term__Group__1 ;
    public final void rule__Term__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1711:1: ( ( ( rule__Term__NameAssignment_0 ) ) rule__Term__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1712:1: ( ( rule__Term__NameAssignment_0 ) ) rule__Term__Group__1
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1712:1: ( ( rule__Term__NameAssignment_0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1713:1: ( rule__Term__NameAssignment_0 )
            {
             before(grammarAccess.getTermAccess().getNameAssignment_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1714:1: ( rule__Term__NameAssignment_0 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1714:2: rule__Term__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Term__NameAssignment_0_in_rule__Term__Group__03514);
            rule__Term__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getTermAccess().getNameAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Term__Group__1_in_rule__Term__Group__03523);
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


    // $ANTLR start rule__Term__Group__1
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1725:1: rule__Term__Group__1 : ( ( rule__Term__Group_1__0 )? ) ;
    public final void rule__Term__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1729:1: ( ( ( rule__Term__Group_1__0 )? ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1730:1: ( ( rule__Term__Group_1__0 )? )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1730:1: ( ( rule__Term__Group_1__0 )? )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1731:1: ( rule__Term__Group_1__0 )?
            {
             before(grammarAccess.getTermAccess().getGroup_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1732:1: ( rule__Term__Group_1__0 )?
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
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1732:2: rule__Term__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Term__Group_1__0_in_rule__Term__Group__13551);
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
    // $ANTLR end rule__Term__Group__1


    // $ANTLR start rule__Term__Group_1__0
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1746:1: rule__Term__Group_1__0 : ( '(' ) rule__Term__Group_1__1 ;
    public final void rule__Term__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1750:1: ( ( '(' ) rule__Term__Group_1__1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1751:1: ( '(' ) rule__Term__Group_1__1
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1751:1: ( '(' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1752:1: '('
            {
             before(grammarAccess.getTermAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,22,FOLLOW_22_in_rule__Term__Group_1__03591); 
             after(grammarAccess.getTermAccess().getLeftParenthesisKeyword_1_0()); 

            }

            pushFollow(FOLLOW_rule__Term__Group_1__1_in_rule__Term__Group_1__03601);
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


    // $ANTLR start rule__Term__Group_1__1
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1766:1: rule__Term__Group_1__1 : ( ( rule__Term__ArgsAssignment_1_1 )? ) rule__Term__Group_1__2 ;
    public final void rule__Term__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1770:1: ( ( ( rule__Term__ArgsAssignment_1_1 )? ) rule__Term__Group_1__2 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1771:1: ( ( rule__Term__ArgsAssignment_1_1 )? ) rule__Term__Group_1__2
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1771:1: ( ( rule__Term__ArgsAssignment_1_1 )? )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1772:1: ( rule__Term__ArgsAssignment_1_1 )?
            {
             before(grammarAccess.getTermAccess().getArgsAssignment_1_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1773:1: ( rule__Term__ArgsAssignment_1_1 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1773:2: rule__Term__ArgsAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__Term__ArgsAssignment_1_1_in_rule__Term__Group_1__13629);
                    rule__Term__ArgsAssignment_1_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTermAccess().getArgsAssignment_1_1()); 

            }

            pushFollow(FOLLOW_rule__Term__Group_1__2_in_rule__Term__Group_1__13639);
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


    // $ANTLR start rule__Term__Group_1__2
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1784:1: rule__Term__Group_1__2 : ( ( rule__Term__Group_1_2__0 )* ) rule__Term__Group_1__3 ;
    public final void rule__Term__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1788:1: ( ( ( rule__Term__Group_1_2__0 )* ) rule__Term__Group_1__3 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1789:1: ( ( rule__Term__Group_1_2__0 )* ) rule__Term__Group_1__3
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1789:1: ( ( rule__Term__Group_1_2__0 )* )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1790:1: ( rule__Term__Group_1_2__0 )*
            {
             before(grammarAccess.getTermAccess().getGroup_1_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1791:1: ( rule__Term__Group_1_2__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==21) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1791:2: rule__Term__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Term__Group_1_2__0_in_rule__Term__Group_1__23667);
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

            pushFollow(FOLLOW_rule__Term__Group_1__3_in_rule__Term__Group_1__23677);
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


    // $ANTLR start rule__Term__Group_1__3
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1802:1: rule__Term__Group_1__3 : ( ')' ) ;
    public final void rule__Term__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1806:1: ( ( ')' ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1807:1: ( ')' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1807:1: ( ')' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1808:1: ')'
            {
             before(grammarAccess.getTermAccess().getRightParenthesisKeyword_1_3()); 
            match(input,23,FOLLOW_23_in_rule__Term__Group_1__33706); 
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
    // $ANTLR end rule__Term__Group_1__3


    // $ANTLR start rule__Term__Group_1_2__0
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1829:1: rule__Term__Group_1_2__0 : ( ',' ) rule__Term__Group_1_2__1 ;
    public final void rule__Term__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1833:1: ( ( ',' ) rule__Term__Group_1_2__1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1834:1: ( ',' ) rule__Term__Group_1_2__1
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1834:1: ( ',' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1835:1: ','
            {
             before(grammarAccess.getTermAccess().getCommaKeyword_1_2_0()); 
            match(input,21,FOLLOW_21_in_rule__Term__Group_1_2__03750); 
             after(grammarAccess.getTermAccess().getCommaKeyword_1_2_0()); 

            }

            pushFollow(FOLLOW_rule__Term__Group_1_2__1_in_rule__Term__Group_1_2__03760);
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


    // $ANTLR start rule__Term__Group_1_2__1
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1849:1: rule__Term__Group_1_2__1 : ( ( rule__Term__ArgsAssignment_1_2_1 ) ) ;
    public final void rule__Term__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1853:1: ( ( ( rule__Term__ArgsAssignment_1_2_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1854:1: ( ( rule__Term__ArgsAssignment_1_2_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1854:1: ( ( rule__Term__ArgsAssignment_1_2_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1855:1: ( rule__Term__ArgsAssignment_1_2_1 )
            {
             before(grammarAccess.getTermAccess().getArgsAssignment_1_2_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1856:1: ( rule__Term__ArgsAssignment_1_2_1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1856:2: rule__Term__ArgsAssignment_1_2_1
            {
            pushFollow(FOLLOW_rule__Term__ArgsAssignment_1_2_1_in_rule__Term__Group_1_2__13788);
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
    // $ANTLR end rule__Term__Group_1_2__1


    // $ANTLR start rule__HoldsAt__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1870:1: rule__HoldsAt__Group__0 : ( 'HoldsAt' ) rule__HoldsAt__Group__1 ;
    public final void rule__HoldsAt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1874:1: ( ( 'HoldsAt' ) rule__HoldsAt__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1875:1: ( 'HoldsAt' ) rule__HoldsAt__Group__1
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1875:1: ( 'HoldsAt' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1876:1: 'HoldsAt'
            {
             before(grammarAccess.getHoldsAtAccess().getHoldsAtKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__HoldsAt__Group__03827); 
             after(grammarAccess.getHoldsAtAccess().getHoldsAtKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__HoldsAt__Group__1_in_rule__HoldsAt__Group__03837);
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


    // $ANTLR start rule__HoldsAt__Group__1
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1890:1: rule__HoldsAt__Group__1 : ( '(' ) rule__HoldsAt__Group__2 ;
    public final void rule__HoldsAt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1894:1: ( ( '(' ) rule__HoldsAt__Group__2 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1895:1: ( '(' ) rule__HoldsAt__Group__2
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1895:1: ( '(' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1896:1: '('
            {
             before(grammarAccess.getHoldsAtAccess().getLeftParenthesisKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__HoldsAt__Group__13866); 
             after(grammarAccess.getHoldsAtAccess().getLeftParenthesisKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__HoldsAt__Group__2_in_rule__HoldsAt__Group__13876);
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


    // $ANTLR start rule__HoldsAt__Group__2
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1910:1: rule__HoldsAt__Group__2 : ( ( rule__HoldsAt__FluentAssignment_2 ) ) rule__HoldsAt__Group__3 ;
    public final void rule__HoldsAt__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1914:1: ( ( ( rule__HoldsAt__FluentAssignment_2 ) ) rule__HoldsAt__Group__3 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1915:1: ( ( rule__HoldsAt__FluentAssignment_2 ) ) rule__HoldsAt__Group__3
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1915:1: ( ( rule__HoldsAt__FluentAssignment_2 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1916:1: ( rule__HoldsAt__FluentAssignment_2 )
            {
             before(grammarAccess.getHoldsAtAccess().getFluentAssignment_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1917:1: ( rule__HoldsAt__FluentAssignment_2 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1917:2: rule__HoldsAt__FluentAssignment_2
            {
            pushFollow(FOLLOW_rule__HoldsAt__FluentAssignment_2_in_rule__HoldsAt__Group__23904);
            rule__HoldsAt__FluentAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getHoldsAtAccess().getFluentAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__HoldsAt__Group__3_in_rule__HoldsAt__Group__23913);
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


    // $ANTLR start rule__HoldsAt__Group__3
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1928:1: rule__HoldsAt__Group__3 : ( ',' ) rule__HoldsAt__Group__4 ;
    public final void rule__HoldsAt__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1932:1: ( ( ',' ) rule__HoldsAt__Group__4 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1933:1: ( ',' ) rule__HoldsAt__Group__4
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1933:1: ( ',' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1934:1: ','
            {
             before(grammarAccess.getHoldsAtAccess().getCommaKeyword_3()); 
            match(input,21,FOLLOW_21_in_rule__HoldsAt__Group__33942); 
             after(grammarAccess.getHoldsAtAccess().getCommaKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__HoldsAt__Group__4_in_rule__HoldsAt__Group__33952);
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


    // $ANTLR start rule__HoldsAt__Group__4
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1948:1: rule__HoldsAt__Group__4 : ( ( rule__HoldsAt__TimeAssignment_4 ) ) rule__HoldsAt__Group__5 ;
    public final void rule__HoldsAt__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1952:1: ( ( ( rule__HoldsAt__TimeAssignment_4 ) ) rule__HoldsAt__Group__5 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1953:1: ( ( rule__HoldsAt__TimeAssignment_4 ) ) rule__HoldsAt__Group__5
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1953:1: ( ( rule__HoldsAt__TimeAssignment_4 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1954:1: ( rule__HoldsAt__TimeAssignment_4 )
            {
             before(grammarAccess.getHoldsAtAccess().getTimeAssignment_4()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1955:1: ( rule__HoldsAt__TimeAssignment_4 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1955:2: rule__HoldsAt__TimeAssignment_4
            {
            pushFollow(FOLLOW_rule__HoldsAt__TimeAssignment_4_in_rule__HoldsAt__Group__43980);
            rule__HoldsAt__TimeAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getHoldsAtAccess().getTimeAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__HoldsAt__Group__5_in_rule__HoldsAt__Group__43989);
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


    // $ANTLR start rule__HoldsAt__Group__5
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1966:1: rule__HoldsAt__Group__5 : ( ')' ) ;
    public final void rule__HoldsAt__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1970:1: ( ( ')' ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1971:1: ( ')' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1971:1: ( ')' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1972:1: ')'
            {
             before(grammarAccess.getHoldsAtAccess().getRightParenthesisKeyword_5()); 
            match(input,23,FOLLOW_23_in_rule__HoldsAt__Group__54018); 
             after(grammarAccess.getHoldsAtAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
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


    // $ANTLR start rule__Happens__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1997:1: rule__Happens__Group__0 : ( 'Happens' ) rule__Happens__Group__1 ;
    public final void rule__Happens__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2001:1: ( ( 'Happens' ) rule__Happens__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2002:1: ( 'Happens' ) rule__Happens__Group__1
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2002:1: ( 'Happens' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2003:1: 'Happens'
            {
             before(grammarAccess.getHappensAccess().getHappensKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__Happens__Group__04066); 
             after(grammarAccess.getHappensAccess().getHappensKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Happens__Group__1_in_rule__Happens__Group__04076);
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


    // $ANTLR start rule__Happens__Group__1
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2017:1: rule__Happens__Group__1 : ( '(' ) rule__Happens__Group__2 ;
    public final void rule__Happens__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2021:1: ( ( '(' ) rule__Happens__Group__2 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2022:1: ( '(' ) rule__Happens__Group__2
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2022:1: ( '(' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2023:1: '('
            {
             before(grammarAccess.getHappensAccess().getLeftParenthesisKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__Happens__Group__14105); 
             after(grammarAccess.getHappensAccess().getLeftParenthesisKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__Happens__Group__2_in_rule__Happens__Group__14115);
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


    // $ANTLR start rule__Happens__Group__2
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2037:1: rule__Happens__Group__2 : ( ( rule__Happens__EventAssignment_2 ) ) rule__Happens__Group__3 ;
    public final void rule__Happens__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2041:1: ( ( ( rule__Happens__EventAssignment_2 ) ) rule__Happens__Group__3 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2042:1: ( ( rule__Happens__EventAssignment_2 ) ) rule__Happens__Group__3
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2042:1: ( ( rule__Happens__EventAssignment_2 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2043:1: ( rule__Happens__EventAssignment_2 )
            {
             before(grammarAccess.getHappensAccess().getEventAssignment_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2044:1: ( rule__Happens__EventAssignment_2 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2044:2: rule__Happens__EventAssignment_2
            {
            pushFollow(FOLLOW_rule__Happens__EventAssignment_2_in_rule__Happens__Group__24143);
            rule__Happens__EventAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getHappensAccess().getEventAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__Happens__Group__3_in_rule__Happens__Group__24152);
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


    // $ANTLR start rule__Happens__Group__3
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2055:1: rule__Happens__Group__3 : ( ',' ) rule__Happens__Group__4 ;
    public final void rule__Happens__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2059:1: ( ( ',' ) rule__Happens__Group__4 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2060:1: ( ',' ) rule__Happens__Group__4
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2060:1: ( ',' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2061:1: ','
            {
             before(grammarAccess.getHappensAccess().getCommaKeyword_3()); 
            match(input,21,FOLLOW_21_in_rule__Happens__Group__34181); 
             after(grammarAccess.getHappensAccess().getCommaKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__Happens__Group__4_in_rule__Happens__Group__34191);
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


    // $ANTLR start rule__Happens__Group__4
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2075:1: rule__Happens__Group__4 : ( ( rule__Happens__TimeAssignment_4 ) ) rule__Happens__Group__5 ;
    public final void rule__Happens__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2079:1: ( ( ( rule__Happens__TimeAssignment_4 ) ) rule__Happens__Group__5 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2080:1: ( ( rule__Happens__TimeAssignment_4 ) ) rule__Happens__Group__5
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2080:1: ( ( rule__Happens__TimeAssignment_4 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2081:1: ( rule__Happens__TimeAssignment_4 )
            {
             before(grammarAccess.getHappensAccess().getTimeAssignment_4()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2082:1: ( rule__Happens__TimeAssignment_4 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2082:2: rule__Happens__TimeAssignment_4
            {
            pushFollow(FOLLOW_rule__Happens__TimeAssignment_4_in_rule__Happens__Group__44219);
            rule__Happens__TimeAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getHappensAccess().getTimeAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__Happens__Group__5_in_rule__Happens__Group__44228);
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


    // $ANTLR start rule__Happens__Group__5
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2093:1: rule__Happens__Group__5 : ( ')' ) ;
    public final void rule__Happens__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2097:1: ( ( ')' ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2098:1: ( ')' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2098:1: ( ')' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2099:1: ')'
            {
             before(grammarAccess.getHappensAccess().getRightParenthesisKeyword_5()); 
            match(input,23,FOLLOW_23_in_rule__Happens__Group__54257); 
             after(grammarAccess.getHappensAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
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


    // $ANTLR start rule__Initiates__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2124:1: rule__Initiates__Group__0 : ( 'Initiates' ) rule__Initiates__Group__1 ;
    public final void rule__Initiates__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2128:1: ( ( 'Initiates' ) rule__Initiates__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2129:1: ( 'Initiates' ) rule__Initiates__Group__1
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2129:1: ( 'Initiates' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2130:1: 'Initiates'
            {
             before(grammarAccess.getInitiatesAccess().getInitiatesKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__Initiates__Group__04305); 
             after(grammarAccess.getInitiatesAccess().getInitiatesKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Initiates__Group__1_in_rule__Initiates__Group__04315);
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


    // $ANTLR start rule__Initiates__Group__1
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2144:1: rule__Initiates__Group__1 : ( '(' ) rule__Initiates__Group__2 ;
    public final void rule__Initiates__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2148:1: ( ( '(' ) rule__Initiates__Group__2 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2149:1: ( '(' ) rule__Initiates__Group__2
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2149:1: ( '(' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2150:1: '('
            {
             before(grammarAccess.getInitiatesAccess().getLeftParenthesisKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__Initiates__Group__14344); 
             after(grammarAccess.getInitiatesAccess().getLeftParenthesisKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__Initiates__Group__2_in_rule__Initiates__Group__14354);
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


    // $ANTLR start rule__Initiates__Group__2
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2164:1: rule__Initiates__Group__2 : ( ( rule__Initiates__EventAssignment_2 ) ) rule__Initiates__Group__3 ;
    public final void rule__Initiates__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2168:1: ( ( ( rule__Initiates__EventAssignment_2 ) ) rule__Initiates__Group__3 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2169:1: ( ( rule__Initiates__EventAssignment_2 ) ) rule__Initiates__Group__3
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2169:1: ( ( rule__Initiates__EventAssignment_2 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2170:1: ( rule__Initiates__EventAssignment_2 )
            {
             before(grammarAccess.getInitiatesAccess().getEventAssignment_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2171:1: ( rule__Initiates__EventAssignment_2 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2171:2: rule__Initiates__EventAssignment_2
            {
            pushFollow(FOLLOW_rule__Initiates__EventAssignment_2_in_rule__Initiates__Group__24382);
            rule__Initiates__EventAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getInitiatesAccess().getEventAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__Initiates__Group__3_in_rule__Initiates__Group__24391);
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


    // $ANTLR start rule__Initiates__Group__3
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2182:1: rule__Initiates__Group__3 : ( ',' ) rule__Initiates__Group__4 ;
    public final void rule__Initiates__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2186:1: ( ( ',' ) rule__Initiates__Group__4 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2187:1: ( ',' ) rule__Initiates__Group__4
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2187:1: ( ',' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2188:1: ','
            {
             before(grammarAccess.getInitiatesAccess().getCommaKeyword_3()); 
            match(input,21,FOLLOW_21_in_rule__Initiates__Group__34420); 
             after(grammarAccess.getInitiatesAccess().getCommaKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__Initiates__Group__4_in_rule__Initiates__Group__34430);
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


    // $ANTLR start rule__Initiates__Group__4
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2202:1: rule__Initiates__Group__4 : ( ( rule__Initiates__FluentAssignment_4 ) ) rule__Initiates__Group__5 ;
    public final void rule__Initiates__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2206:1: ( ( ( rule__Initiates__FluentAssignment_4 ) ) rule__Initiates__Group__5 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2207:1: ( ( rule__Initiates__FluentAssignment_4 ) ) rule__Initiates__Group__5
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2207:1: ( ( rule__Initiates__FluentAssignment_4 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2208:1: ( rule__Initiates__FluentAssignment_4 )
            {
             before(grammarAccess.getInitiatesAccess().getFluentAssignment_4()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2209:1: ( rule__Initiates__FluentAssignment_4 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2209:2: rule__Initiates__FluentAssignment_4
            {
            pushFollow(FOLLOW_rule__Initiates__FluentAssignment_4_in_rule__Initiates__Group__44458);
            rule__Initiates__FluentAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getInitiatesAccess().getFluentAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__Initiates__Group__5_in_rule__Initiates__Group__44467);
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


    // $ANTLR start rule__Initiates__Group__5
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2220:1: rule__Initiates__Group__5 : ( ',' ) rule__Initiates__Group__6 ;
    public final void rule__Initiates__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2224:1: ( ( ',' ) rule__Initiates__Group__6 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2225:1: ( ',' ) rule__Initiates__Group__6
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2225:1: ( ',' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2226:1: ','
            {
             before(grammarAccess.getInitiatesAccess().getCommaKeyword_5()); 
            match(input,21,FOLLOW_21_in_rule__Initiates__Group__54496); 
             after(grammarAccess.getInitiatesAccess().getCommaKeyword_5()); 

            }

            pushFollow(FOLLOW_rule__Initiates__Group__6_in_rule__Initiates__Group__54506);
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


    // $ANTLR start rule__Initiates__Group__6
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2240:1: rule__Initiates__Group__6 : ( ( rule__Initiates__TimeAssignment_6 ) ) rule__Initiates__Group__7 ;
    public final void rule__Initiates__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2244:1: ( ( ( rule__Initiates__TimeAssignment_6 ) ) rule__Initiates__Group__7 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2245:1: ( ( rule__Initiates__TimeAssignment_6 ) ) rule__Initiates__Group__7
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2245:1: ( ( rule__Initiates__TimeAssignment_6 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2246:1: ( rule__Initiates__TimeAssignment_6 )
            {
             before(grammarAccess.getInitiatesAccess().getTimeAssignment_6()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2247:1: ( rule__Initiates__TimeAssignment_6 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2247:2: rule__Initiates__TimeAssignment_6
            {
            pushFollow(FOLLOW_rule__Initiates__TimeAssignment_6_in_rule__Initiates__Group__64534);
            rule__Initiates__TimeAssignment_6();
            _fsp--;


            }

             after(grammarAccess.getInitiatesAccess().getTimeAssignment_6()); 

            }

            pushFollow(FOLLOW_rule__Initiates__Group__7_in_rule__Initiates__Group__64543);
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


    // $ANTLR start rule__Initiates__Group__7
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2258:1: rule__Initiates__Group__7 : ( ')' ) ;
    public final void rule__Initiates__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2262:1: ( ( ')' ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2263:1: ( ')' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2263:1: ( ')' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2264:1: ')'
            {
             before(grammarAccess.getInitiatesAccess().getRightParenthesisKeyword_7()); 
            match(input,23,FOLLOW_23_in_rule__Initiates__Group__74572); 
             after(grammarAccess.getInitiatesAccess().getRightParenthesisKeyword_7()); 

            }


            }

        }
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


    // $ANTLR start rule__Terminates__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2293:1: rule__Terminates__Group__0 : ( 'Terminates' ) rule__Terminates__Group__1 ;
    public final void rule__Terminates__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2297:1: ( ( 'Terminates' ) rule__Terminates__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2298:1: ( 'Terminates' ) rule__Terminates__Group__1
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2298:1: ( 'Terminates' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2299:1: 'Terminates'
            {
             before(grammarAccess.getTerminatesAccess().getTerminatesKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__Terminates__Group__04624); 
             after(grammarAccess.getTerminatesAccess().getTerminatesKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Terminates__Group__1_in_rule__Terminates__Group__04634);
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


    // $ANTLR start rule__Terminates__Group__1
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2313:1: rule__Terminates__Group__1 : ( '(' ) rule__Terminates__Group__2 ;
    public final void rule__Terminates__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2317:1: ( ( '(' ) rule__Terminates__Group__2 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2318:1: ( '(' ) rule__Terminates__Group__2
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2318:1: ( '(' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2319:1: '('
            {
             before(grammarAccess.getTerminatesAccess().getLeftParenthesisKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__Terminates__Group__14663); 
             after(grammarAccess.getTerminatesAccess().getLeftParenthesisKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__Terminates__Group__2_in_rule__Terminates__Group__14673);
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


    // $ANTLR start rule__Terminates__Group__2
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2333:1: rule__Terminates__Group__2 : ( ( rule__Terminates__EventAssignment_2 ) ) rule__Terminates__Group__3 ;
    public final void rule__Terminates__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2337:1: ( ( ( rule__Terminates__EventAssignment_2 ) ) rule__Terminates__Group__3 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2338:1: ( ( rule__Terminates__EventAssignment_2 ) ) rule__Terminates__Group__3
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2338:1: ( ( rule__Terminates__EventAssignment_2 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2339:1: ( rule__Terminates__EventAssignment_2 )
            {
             before(grammarAccess.getTerminatesAccess().getEventAssignment_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2340:1: ( rule__Terminates__EventAssignment_2 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2340:2: rule__Terminates__EventAssignment_2
            {
            pushFollow(FOLLOW_rule__Terminates__EventAssignment_2_in_rule__Terminates__Group__24701);
            rule__Terminates__EventAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getTerminatesAccess().getEventAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__Terminates__Group__3_in_rule__Terminates__Group__24710);
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


    // $ANTLR start rule__Terminates__Group__3
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2351:1: rule__Terminates__Group__3 : ( ',' ) rule__Terminates__Group__4 ;
    public final void rule__Terminates__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2355:1: ( ( ',' ) rule__Terminates__Group__4 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2356:1: ( ',' ) rule__Terminates__Group__4
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2356:1: ( ',' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2357:1: ','
            {
             before(grammarAccess.getTerminatesAccess().getCommaKeyword_3()); 
            match(input,21,FOLLOW_21_in_rule__Terminates__Group__34739); 
             after(grammarAccess.getTerminatesAccess().getCommaKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__Terminates__Group__4_in_rule__Terminates__Group__34749);
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


    // $ANTLR start rule__Terminates__Group__4
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2371:1: rule__Terminates__Group__4 : ( ( rule__Terminates__FluentAssignment_4 ) ) rule__Terminates__Group__5 ;
    public final void rule__Terminates__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2375:1: ( ( ( rule__Terminates__FluentAssignment_4 ) ) rule__Terminates__Group__5 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2376:1: ( ( rule__Terminates__FluentAssignment_4 ) ) rule__Terminates__Group__5
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2376:1: ( ( rule__Terminates__FluentAssignment_4 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2377:1: ( rule__Terminates__FluentAssignment_4 )
            {
             before(grammarAccess.getTerminatesAccess().getFluentAssignment_4()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2378:1: ( rule__Terminates__FluentAssignment_4 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2378:2: rule__Terminates__FluentAssignment_4
            {
            pushFollow(FOLLOW_rule__Terminates__FluentAssignment_4_in_rule__Terminates__Group__44777);
            rule__Terminates__FluentAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getTerminatesAccess().getFluentAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__Terminates__Group__5_in_rule__Terminates__Group__44786);
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


    // $ANTLR start rule__Terminates__Group__5
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2389:1: rule__Terminates__Group__5 : ( ',' ) rule__Terminates__Group__6 ;
    public final void rule__Terminates__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2393:1: ( ( ',' ) rule__Terminates__Group__6 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2394:1: ( ',' ) rule__Terminates__Group__6
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2394:1: ( ',' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2395:1: ','
            {
             before(grammarAccess.getTerminatesAccess().getCommaKeyword_5()); 
            match(input,21,FOLLOW_21_in_rule__Terminates__Group__54815); 
             after(grammarAccess.getTerminatesAccess().getCommaKeyword_5()); 

            }

            pushFollow(FOLLOW_rule__Terminates__Group__6_in_rule__Terminates__Group__54825);
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


    // $ANTLR start rule__Terminates__Group__6
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2409:1: rule__Terminates__Group__6 : ( ( rule__Terminates__TimeAssignment_6 ) ) rule__Terminates__Group__7 ;
    public final void rule__Terminates__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2413:1: ( ( ( rule__Terminates__TimeAssignment_6 ) ) rule__Terminates__Group__7 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2414:1: ( ( rule__Terminates__TimeAssignment_6 ) ) rule__Terminates__Group__7
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2414:1: ( ( rule__Terminates__TimeAssignment_6 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2415:1: ( rule__Terminates__TimeAssignment_6 )
            {
             before(grammarAccess.getTerminatesAccess().getTimeAssignment_6()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2416:1: ( rule__Terminates__TimeAssignment_6 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2416:2: rule__Terminates__TimeAssignment_6
            {
            pushFollow(FOLLOW_rule__Terminates__TimeAssignment_6_in_rule__Terminates__Group__64853);
            rule__Terminates__TimeAssignment_6();
            _fsp--;


            }

             after(grammarAccess.getTerminatesAccess().getTimeAssignment_6()); 

            }

            pushFollow(FOLLOW_rule__Terminates__Group__7_in_rule__Terminates__Group__64862);
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


    // $ANTLR start rule__Terminates__Group__7
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2427:1: rule__Terminates__Group__7 : ( ')' ) ;
    public final void rule__Terminates__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2431:1: ( ( ')' ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2432:1: ( ')' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2432:1: ( ')' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2433:1: ')'
            {
             before(grammarAccess.getTerminatesAccess().getRightParenthesisKeyword_7()); 
            match(input,23,FOLLOW_23_in_rule__Terminates__Group__74891); 
             after(grammarAccess.getTerminatesAccess().getRightParenthesisKeyword_7()); 

            }


            }

        }
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


    // $ANTLR start rule__Path__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2462:1: rule__Path__Group__0 : ( ( rule__Path__FileAssignment_0 ) ) rule__Path__Group__1 ;
    public final void rule__Path__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2466:1: ( ( ( rule__Path__FileAssignment_0 ) ) rule__Path__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2467:1: ( ( rule__Path__FileAssignment_0 ) ) rule__Path__Group__1
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2467:1: ( ( rule__Path__FileAssignment_0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2468:1: ( rule__Path__FileAssignment_0 )
            {
             before(grammarAccess.getPathAccess().getFileAssignment_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2469:1: ( rule__Path__FileAssignment_0 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2469:2: rule__Path__FileAssignment_0
            {
            pushFollow(FOLLOW_rule__Path__FileAssignment_0_in_rule__Path__Group__04942);
            rule__Path__FileAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getPathAccess().getFileAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Path__Group__1_in_rule__Path__Group__04951);
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


    // $ANTLR start rule__Path__Group__1
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2480:1: rule__Path__Group__1 : ( ( rule__Path__Group_1__0 )* ) ;
    public final void rule__Path__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2484:1: ( ( ( rule__Path__Group_1__0 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2485:1: ( ( rule__Path__Group_1__0 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2485:1: ( ( rule__Path__Group_1__0 )* )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2486:1: ( rule__Path__Group_1__0 )*
            {
             before(grammarAccess.getPathAccess().getGroup_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2487:1: ( rule__Path__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==33) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2487:2: rule__Path__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Path__Group_1__0_in_rule__Path__Group__14979);
            	    rule__Path__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // $ANTLR end rule__Path__Group__1


    // $ANTLR start rule__Path__Group_1__0
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2501:1: rule__Path__Group_1__0 : ( '/' ) rule__Path__Group_1__1 ;
    public final void rule__Path__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2505:1: ( ( '/' ) rule__Path__Group_1__1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2506:1: ( '/' ) rule__Path__Group_1__1
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2506:1: ( '/' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2507:1: '/'
            {
             before(grammarAccess.getPathAccess().getSolidusKeyword_1_0()); 
            match(input,33,FOLLOW_33_in_rule__Path__Group_1__05019); 
             after(grammarAccess.getPathAccess().getSolidusKeyword_1_0()); 

            }

            pushFollow(FOLLOW_rule__Path__Group_1__1_in_rule__Path__Group_1__05029);
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


    // $ANTLR start rule__Path__Group_1__1
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2521:1: rule__Path__Group_1__1 : ( ( rule__Path__FileAssignment_1_1 ) ) ;
    public final void rule__Path__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2525:1: ( ( ( rule__Path__FileAssignment_1_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2526:1: ( ( rule__Path__FileAssignment_1_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2526:1: ( ( rule__Path__FileAssignment_1_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2527:1: ( rule__Path__FileAssignment_1_1 )
            {
             before(grammarAccess.getPathAccess().getFileAssignment_1_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2528:1: ( rule__Path__FileAssignment_1_1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2528:2: rule__Path__FileAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Path__FileAssignment_1_1_in_rule__Path__Group_1__15057);
            rule__Path__FileAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getPathAccess().getFileAssignment_1_1()); 

            }


            }

        }
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


    // $ANTLR start rule__File__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2542:1: rule__File__Group__0 : ( ( rule__File__NameAssignment_0 ) ) rule__File__Group__1 ;
    public final void rule__File__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2546:1: ( ( ( rule__File__NameAssignment_0 ) ) rule__File__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2547:1: ( ( rule__File__NameAssignment_0 ) ) rule__File__Group__1
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2547:1: ( ( rule__File__NameAssignment_0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2548:1: ( rule__File__NameAssignment_0 )
            {
             before(grammarAccess.getFileAccess().getNameAssignment_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2549:1: ( rule__File__NameAssignment_0 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2549:2: rule__File__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__File__NameAssignment_0_in_rule__File__Group__05095);
            rule__File__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getFileAccess().getNameAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__File__Group__1_in_rule__File__Group__05104);
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


    // $ANTLR start rule__File__Group__1
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2560:1: rule__File__Group__1 : ( ( rule__File__Group_1__0 )* ) ;
    public final void rule__File__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2564:1: ( ( ( rule__File__Group_1__0 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2565:1: ( ( rule__File__Group_1__0 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2565:1: ( ( rule__File__Group_1__0 )* )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2566:1: ( rule__File__Group_1__0 )*
            {
             before(grammarAccess.getFileAccess().getGroup_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2567:1: ( rule__File__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==18) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2567:2: rule__File__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__File__Group_1__0_in_rule__File__Group__15132);
            	    rule__File__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // $ANTLR end rule__File__Group__1


    // $ANTLR start rule__File__Group_1__0
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2581:1: rule__File__Group_1__0 : ( '.' ) rule__File__Group_1__1 ;
    public final void rule__File__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2585:1: ( ( '.' ) rule__File__Group_1__1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2586:1: ( '.' ) rule__File__Group_1__1
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2586:1: ( '.' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2587:1: '.'
            {
             before(grammarAccess.getFileAccess().getFullStopKeyword_1_0()); 
            match(input,18,FOLLOW_18_in_rule__File__Group_1__05172); 
             after(grammarAccess.getFileAccess().getFullStopKeyword_1_0()); 

            }

            pushFollow(FOLLOW_rule__File__Group_1__1_in_rule__File__Group_1__05182);
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


    // $ANTLR start rule__File__Group_1__1
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2601:1: rule__File__Group_1__1 : ( ( rule__File__NameAssignment_1_1 ) ) ;
    public final void rule__File__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2605:1: ( ( ( rule__File__NameAssignment_1_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2606:1: ( ( rule__File__NameAssignment_1_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2606:1: ( ( rule__File__NameAssignment_1_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2607:1: ( rule__File__NameAssignment_1_1 )
            {
             before(grammarAccess.getFileAccess().getNameAssignment_1_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2608:1: ( rule__File__NameAssignment_1_1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2608:2: rule__File__NameAssignment_1_1
            {
            pushFollow(FOLLOW_rule__File__NameAssignment_1_1_in_rule__File__Group_1__15210);
            rule__File__NameAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getFileAccess().getNameAssignment_1_1()); 

            }


            }

        }
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


    // $ANTLR start rule__Knowledge__ImportsAssignment_0
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2622:1: rule__Knowledge__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__Knowledge__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2626:1: ( ( ruleImport ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2627:1: ( ruleImport )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2627:1: ( ruleImport )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2628:1: ruleImport
            {
             before(grammarAccess.getKnowledgeAccess().getImportsImportParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__Knowledge__ImportsAssignment_05248);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2637:1: rule__Knowledge__EntitiesAssignment_1 : ( ruleEntity ) ;
    public final void rule__Knowledge__EntitiesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2641:1: ( ( ruleEntity ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2642:1: ( ruleEntity )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2642:1: ( ruleEntity )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2643:1: ruleEntity
            {
             before(grammarAccess.getKnowledgeAccess().getEntitiesEntityParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEntity_in_rule__Knowledge__EntitiesAssignment_15279);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2652:1: rule__Knowledge__RulesAssignment_2_0 : ( ruleRule ) ;
    public final void rule__Knowledge__RulesAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2656:1: ( ( ruleRule ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2657:1: ( ruleRule )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2657:1: ( ruleRule )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2658:1: ruleRule
            {
             before(grammarAccess.getKnowledgeAccess().getRulesRuleParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleRule_in_rule__Knowledge__RulesAssignment_2_05310);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2667:1: rule__Knowledge__VarsAssignment_3 : ( ruleVar ) ;
    public final void rule__Knowledge__VarsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2671:1: ( ( ruleVar ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2672:1: ( ruleVar )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2672:1: ( ruleVar )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2673:1: ruleVar
            {
             before(grammarAccess.getKnowledgeAccess().getVarsVarParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleVar_in_rule__Knowledge__VarsAssignment_35341);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2682:1: rule__Rule__DeclAssignment_0 : ( ruleVarDecl ) ;
    public final void rule__Rule__DeclAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2686:1: ( ( ruleVarDecl ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2687:1: ( ruleVarDecl )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2687:1: ( ruleVarDecl )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2688:1: ruleVarDecl
            {
             before(grammarAccess.getRuleAccess().getDeclVarDeclParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleVarDecl_in_rule__Rule__DeclAssignment_05372);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2697:1: rule__Rule__ExprAssignment_1 : ( ruleBoolExpr ) ;
    public final void rule__Rule__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2701:1: ( ( ruleBoolExpr ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2702:1: ( ruleBoolExpr )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2702:1: ( ruleBoolExpr )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2703:1: ruleBoolExpr
            {
             before(grammarAccess.getRuleAccess().getExprBoolExprParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleBoolExpr_in_rule__Rule__ExprAssignment_15403);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2712:1: rule__VarDecl__VarsAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__VarDecl__VarsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2716:1: ( ( ( RULE_ID ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2717:1: ( ( RULE_ID ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2717:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2718:1: ( RULE_ID )
            {
             before(grammarAccess.getVarDeclAccess().getVarsVarCrossReference_1_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2719:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2720:1: RULE_ID
            {
             before(grammarAccess.getVarDeclAccess().getVarsVarIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VarDecl__VarsAssignment_15438); 
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2731:1: rule__VarDecl__VarsAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__VarDecl__VarsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2735:1: ( ( ( RULE_ID ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2736:1: ( ( RULE_ID ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2736:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2737:1: ( RULE_ID )
            {
             before(grammarAccess.getVarDeclAccess().getVarsVarCrossReference_2_1_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2738:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2739:1: RULE_ID
            {
             before(grammarAccess.getVarDeclAccess().getVarsVarIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VarDecl__VarsAssignment_2_15477); 
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2750:1: rule__IntTerm__ConstAssignment_0 : ( RULE_INT ) ;
    public final void rule__IntTerm__ConstAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2754:1: ( ( RULE_INT ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2755:1: ( RULE_INT )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2755:1: ( RULE_INT )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2756:1: RULE_INT
            {
             before(grammarAccess.getIntTermAccess().getConstINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IntTerm__ConstAssignment_05512); 
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2765:1: rule__IntTerm__VarAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__IntTerm__VarAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2769:1: ( ( ( RULE_ID ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2770:1: ( ( RULE_ID ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2770:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2771:1: ( RULE_ID )
            {
             before(grammarAccess.getIntTermAccess().getVarVarCrossReference_1_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2772:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2773:1: RULE_ID
            {
             before(grammarAccess.getIntTermAccess().getVarVarIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__IntTerm__VarAssignment_15547); 
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2784:1: rule__BinaryIntExpr__OprAssignment_0 : ( ruleIntTerm ) ;
    public final void rule__BinaryIntExpr__OprAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2788:1: ( ( ruleIntTerm ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2789:1: ( ruleIntTerm )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2789:1: ( ruleIntTerm )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2790:1: ruleIntTerm
            {
             before(grammarAccess.getBinaryIntExprAccess().getOprIntTermParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleIntTerm_in_rule__BinaryIntExpr__OprAssignment_05582);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2799:1: rule__BinaryIntExpr__BinaryopAssignment_1 : ( ruleBinaryIntOp ) ;
    public final void rule__BinaryIntExpr__BinaryopAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2803:1: ( ( ruleBinaryIntOp ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2804:1: ( ruleBinaryIntOp )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2804:1: ( ruleBinaryIntOp )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2805:1: ruleBinaryIntOp
            {
             before(grammarAccess.getBinaryIntExprAccess().getBinaryopBinaryIntOpEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleBinaryIntOp_in_rule__BinaryIntExpr__BinaryopAssignment_15613);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2814:1: rule__BinaryIntExpr__OprAssignment_2 : ( ruleIntTerm ) ;
    public final void rule__BinaryIntExpr__OprAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2818:1: ( ( ruleIntTerm ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2819:1: ( ruleIntTerm )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2819:1: ( ruleIntTerm )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2820:1: ruleIntTerm
            {
             before(grammarAccess.getBinaryIntExprAccess().getOprIntTermParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleIntTerm_in_rule__BinaryIntExpr__OprAssignment_25644);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2829:1: rule__UnaryBoolExpr__Unaryop_lhsAssignment_0_0 : ( ruleUnaryBoolOp ) ;
    public final void rule__UnaryBoolExpr__Unaryop_lhsAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2833:1: ( ( ruleUnaryBoolOp ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2834:1: ( ruleUnaryBoolOp )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2834:1: ( ruleUnaryBoolOp )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2835:1: ruleUnaryBoolOp
            {
             before(grammarAccess.getUnaryBoolExprAccess().getUnaryop_lhsUnaryBoolOpEnumRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleUnaryBoolOp_in_rule__UnaryBoolExpr__Unaryop_lhsAssignment_0_05675);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2844:1: rule__UnaryBoolExpr__OprAssignment_0_1 : ( ruleBoolExpr ) ;
    public final void rule__UnaryBoolExpr__OprAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2848:1: ( ( ruleBoolExpr ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2849:1: ( ruleBoolExpr )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2849:1: ( ruleBoolExpr )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2850:1: ruleBoolExpr
            {
             before(grammarAccess.getUnaryBoolExprAccess().getOprBoolExprParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_ruleBoolExpr_in_rule__UnaryBoolExpr__OprAssignment_0_15706);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2859:1: rule__UnaryBoolExpr__OpsAssignment_1_1 : ( ruleBoolExpr ) ;
    public final void rule__UnaryBoolExpr__OpsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2863:1: ( ( ruleBoolExpr ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2864:1: ( ruleBoolExpr )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2864:1: ( ruleBoolExpr )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2865:1: ruleBoolExpr
            {
             before(grammarAccess.getUnaryBoolExprAccess().getOpsBoolExprParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleBoolExpr_in_rule__UnaryBoolExpr__OpsAssignment_1_15737);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2874:1: rule__BinaryBoolExpr__OprAssignment_0 : ( ruleTemporalPredicate ) ;
    public final void rule__BinaryBoolExpr__OprAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2878:1: ( ( ruleTemporalPredicate ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2879:1: ( ruleTemporalPredicate )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2879:1: ( ruleTemporalPredicate )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2880:1: ruleTemporalPredicate
            {
             before(grammarAccess.getBinaryBoolExprAccess().getOprTemporalPredicateParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleTemporalPredicate_in_rule__BinaryBoolExpr__OprAssignment_05768);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2889:1: rule__BinaryBoolExpr__BinaryopAssignment_1 : ( ruleBinaryBoolOp ) ;
    public final void rule__BinaryBoolExpr__BinaryopAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2893:1: ( ( ruleBinaryBoolOp ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2894:1: ( ruleBinaryBoolOp )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2894:1: ( ruleBinaryBoolOp )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2895:1: ruleBinaryBoolOp
            {
             before(grammarAccess.getBinaryBoolExprAccess().getBinaryopBinaryBoolOpEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleBinaryBoolOp_in_rule__BinaryBoolExpr__BinaryopAssignment_15799);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2904:1: rule__BinaryBoolExpr__OprAssignment_2 : ( ruleBoolExpr ) ;
    public final void rule__BinaryBoolExpr__OprAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2908:1: ( ( ruleBoolExpr ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2909:1: ( ruleBoolExpr )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2909:1: ( ruleBoolExpr )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2910:1: ruleBoolExpr
            {
             before(grammarAccess.getBinaryBoolExprAccess().getOprBoolExprParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleBoolExpr_in_rule__BinaryBoolExpr__OprAssignment_25830);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2919:1: rule__Sort__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Sort__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2923:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2924:1: ( RULE_ID )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2924:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2925:1: RULE_ID
            {
             before(grammarAccess.getSortAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Sort__NameAssignment_15861); 
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2934:1: rule__Import__PathAssignment_1 : ( rulePath ) ;
    public final void rule__Import__PathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2938:1: ( ( rulePath ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2939:1: ( rulePath )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2939:1: ( rulePath )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2940:1: rulePath
            {
             before(grammarAccess.getImportAccess().getPathPathParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePath_in_rule__Import__PathAssignment_15892);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2949:1: rule__Var__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Var__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2953:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2954:1: ( RULE_ID )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2954:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2955:1: RULE_ID
            {
             before(grammarAccess.getVarAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Var__NameAssignment_15923); 
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2964:1: rule__Var__MinAssignment_2 : ( RULE_INT ) ;
    public final void rule__Var__MinAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2968:1: ( ( RULE_INT ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2969:1: ( RULE_INT )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2969:1: ( RULE_INT )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2970:1: RULE_INT
            {
             before(grammarAccess.getVarAccess().getMinINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Var__MinAssignment_25954); 
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2979:1: rule__Var__MaxAssignment_3 : ( RULE_INT ) ;
    public final void rule__Var__MaxAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2983:1: ( ( RULE_INT ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2984:1: ( RULE_INT )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2984:1: ( RULE_INT )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2985:1: RULE_INT
            {
             before(grammarAccess.getVarAccess().getMaxINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Var__MaxAssignment_35985); 
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2994:1: rule__Fluent__TermAssignment_1 : ( ruleTerm ) ;
    public final void rule__Fluent__TermAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2998:1: ( ( ruleTerm ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2999:1: ( ruleTerm )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2999:1: ( ruleTerm )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3000:1: ruleTerm
            {
             before(grammarAccess.getFluentAccess().getTermTermParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTerm_in_rule__Fluent__TermAssignment_16016);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3009:1: rule__Event__TermAssignment_1 : ( ruleTerm ) ;
    public final void rule__Event__TermAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3013:1: ( ( ruleTerm ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3014:1: ( ruleTerm )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3014:1: ( ruleTerm )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3015:1: ruleTerm
            {
             before(grammarAccess.getEventAccess().getTermTermParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTerm_in_rule__Event__TermAssignment_16047);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3024:1: rule__Term__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Term__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3028:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3029:1: ( RULE_ID )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3029:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3030:1: RULE_ID
            {
             before(grammarAccess.getTermAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Term__NameAssignment_06078); 
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3039:1: rule__Term__ArgsAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__Term__ArgsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3043:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3044:1: ( RULE_ID )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3044:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3045:1: RULE_ID
            {
             before(grammarAccess.getTermAccess().getArgsIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Term__ArgsAssignment_1_16109); 
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3054:1: rule__Term__ArgsAssignment_1_2_1 : ( RULE_ID ) ;
    public final void rule__Term__ArgsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3058:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3059:1: ( RULE_ID )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3059:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3060:1: RULE_ID
            {
             before(grammarAccess.getTermAccess().getArgsIDTerminalRuleCall_1_2_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Term__ArgsAssignment_1_2_16140); 
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3069:1: rule__HoldsAt__FluentAssignment_2 : ( ruleTerm ) ;
    public final void rule__HoldsAt__FluentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3073:1: ( ( ruleTerm ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3074:1: ( ruleTerm )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3074:1: ( ruleTerm )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3075:1: ruleTerm
            {
             before(grammarAccess.getHoldsAtAccess().getFluentTermParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTerm_in_rule__HoldsAt__FluentAssignment_26171);
            ruleTerm();
            _fsp--;

             after(grammarAccess.getHoldsAtAccess().getFluentTermParserRuleCall_2_0()); 

            }


            }

        }
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


    // $ANTLR start rule__HoldsAt__TimeAssignment_4
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3084:1: rule__HoldsAt__TimeAssignment_4 : ( ruleIntExpr ) ;
    public final void rule__HoldsAt__TimeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3088:1: ( ( ruleIntExpr ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3089:1: ( ruleIntExpr )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3089:1: ( ruleIntExpr )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3090:1: ruleIntExpr
            {
             before(grammarAccess.getHoldsAtAccess().getTimeIntExprParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleIntExpr_in_rule__HoldsAt__TimeAssignment_46202);
            ruleIntExpr();
            _fsp--;

             after(grammarAccess.getHoldsAtAccess().getTimeIntExprParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__HoldsAt__TimeAssignment_4


    // $ANTLR start rule__Happens__EventAssignment_2
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3099:1: rule__Happens__EventAssignment_2 : ( ruleTerm ) ;
    public final void rule__Happens__EventAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3103:1: ( ( ruleTerm ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3104:1: ( ruleTerm )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3104:1: ( ruleTerm )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3105:1: ruleTerm
            {
             before(grammarAccess.getHappensAccess().getEventTermParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTerm_in_rule__Happens__EventAssignment_26233);
            ruleTerm();
            _fsp--;

             after(grammarAccess.getHappensAccess().getEventTermParserRuleCall_2_0()); 

            }


            }

        }
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


    // $ANTLR start rule__Happens__TimeAssignment_4
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3114:1: rule__Happens__TimeAssignment_4 : ( ruleIntExpr ) ;
    public final void rule__Happens__TimeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3118:1: ( ( ruleIntExpr ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3119:1: ( ruleIntExpr )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3119:1: ( ruleIntExpr )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3120:1: ruleIntExpr
            {
             before(grammarAccess.getHappensAccess().getTimeIntExprParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleIntExpr_in_rule__Happens__TimeAssignment_46264);
            ruleIntExpr();
            _fsp--;

             after(grammarAccess.getHappensAccess().getTimeIntExprParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Happens__TimeAssignment_4


    // $ANTLR start rule__Initiates__EventAssignment_2
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3129:1: rule__Initiates__EventAssignment_2 : ( ruleTerm ) ;
    public final void rule__Initiates__EventAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3133:1: ( ( ruleTerm ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3134:1: ( ruleTerm )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3134:1: ( ruleTerm )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3135:1: ruleTerm
            {
             before(grammarAccess.getInitiatesAccess().getEventTermParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTerm_in_rule__Initiates__EventAssignment_26295);
            ruleTerm();
            _fsp--;

             after(grammarAccess.getInitiatesAccess().getEventTermParserRuleCall_2_0()); 

            }


            }

        }
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


    // $ANTLR start rule__Initiates__FluentAssignment_4
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3144:1: rule__Initiates__FluentAssignment_4 : ( ruleTerm ) ;
    public final void rule__Initiates__FluentAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3148:1: ( ( ruleTerm ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3149:1: ( ruleTerm )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3149:1: ( ruleTerm )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3150:1: ruleTerm
            {
             before(grammarAccess.getInitiatesAccess().getFluentTermParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleTerm_in_rule__Initiates__FluentAssignment_46326);
            ruleTerm();
            _fsp--;

             after(grammarAccess.getInitiatesAccess().getFluentTermParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Initiates__FluentAssignment_4


    // $ANTLR start rule__Initiates__TimeAssignment_6
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3159:1: rule__Initiates__TimeAssignment_6 : ( ruleIntExpr ) ;
    public final void rule__Initiates__TimeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3163:1: ( ( ruleIntExpr ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3164:1: ( ruleIntExpr )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3164:1: ( ruleIntExpr )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3165:1: ruleIntExpr
            {
             before(grammarAccess.getInitiatesAccess().getTimeIntExprParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleIntExpr_in_rule__Initiates__TimeAssignment_66357);
            ruleIntExpr();
            _fsp--;

             after(grammarAccess.getInitiatesAccess().getTimeIntExprParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Initiates__TimeAssignment_6


    // $ANTLR start rule__Terminates__EventAssignment_2
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3174:1: rule__Terminates__EventAssignment_2 : ( ruleTerm ) ;
    public final void rule__Terminates__EventAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3178:1: ( ( ruleTerm ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3179:1: ( ruleTerm )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3179:1: ( ruleTerm )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3180:1: ruleTerm
            {
             before(grammarAccess.getTerminatesAccess().getEventTermParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTerm_in_rule__Terminates__EventAssignment_26388);
            ruleTerm();
            _fsp--;

             after(grammarAccess.getTerminatesAccess().getEventTermParserRuleCall_2_0()); 

            }


            }

        }
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


    // $ANTLR start rule__Terminates__FluentAssignment_4
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3189:1: rule__Terminates__FluentAssignment_4 : ( ruleTerm ) ;
    public final void rule__Terminates__FluentAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3193:1: ( ( ruleTerm ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3194:1: ( ruleTerm )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3194:1: ( ruleTerm )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3195:1: ruleTerm
            {
             before(grammarAccess.getTerminatesAccess().getFluentTermParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleTerm_in_rule__Terminates__FluentAssignment_46419);
            ruleTerm();
            _fsp--;

             after(grammarAccess.getTerminatesAccess().getFluentTermParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Terminates__FluentAssignment_4


    // $ANTLR start rule__Terminates__TimeAssignment_6
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3204:1: rule__Terminates__TimeAssignment_6 : ( ruleIntExpr ) ;
    public final void rule__Terminates__TimeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3208:1: ( ( ruleIntExpr ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3209:1: ( ruleIntExpr )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3209:1: ( ruleIntExpr )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3210:1: ruleIntExpr
            {
             before(grammarAccess.getTerminatesAccess().getTimeIntExprParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleIntExpr_in_rule__Terminates__TimeAssignment_66450);
            ruleIntExpr();
            _fsp--;

             after(grammarAccess.getTerminatesAccess().getTimeIntExprParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Terminates__TimeAssignment_6


    // $ANTLR start rule__Path__FileAssignment_0
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3219:1: rule__Path__FileAssignment_0 : ( ruleFile ) ;
    public final void rule__Path__FileAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3223:1: ( ( ruleFile ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3224:1: ( ruleFile )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3224:1: ( ruleFile )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3225:1: ruleFile
            {
             before(grammarAccess.getPathAccess().getFileFileParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleFile_in_rule__Path__FileAssignment_06481);
            ruleFile();
            _fsp--;

             after(grammarAccess.getPathAccess().getFileFileParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Path__FileAssignment_0


    // $ANTLR start rule__Path__FileAssignment_1_1
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3234:1: rule__Path__FileAssignment_1_1 : ( ruleFile ) ;
    public final void rule__Path__FileAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3238:1: ( ( ruleFile ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3239:1: ( ruleFile )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3239:1: ( ruleFile )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3240:1: ruleFile
            {
             before(grammarAccess.getPathAccess().getFileFileParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleFile_in_rule__Path__FileAssignment_1_16512);
            ruleFile();
            _fsp--;

             after(grammarAccess.getPathAccess().getFileFileParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Path__FileAssignment_1_1


    // $ANTLR start rule__File__NameAssignment_0
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3249:1: rule__File__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__File__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3253:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3254:1: ( RULE_ID )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3254:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3255:1: RULE_ID
            {
             before(grammarAccess.getFileAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__File__NameAssignment_06543); 
             after(grammarAccess.getFileAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__File__NameAssignment_0


    // $ANTLR start rule__File__NameAssignment_1_1
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3264:1: rule__File__NameAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__File__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3268:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3269:1: ( RULE_ID )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3269:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3270:1: RULE_ID
            {
             before(grammarAccess.getFileAccess().getNameIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__File__NameAssignment_1_16574); 
             after(grammarAccess.getFileAccess().getNameIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__File__NameAssignment_1_1


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\122\uffff";
    static final String DFA4_eofS =
        "\51\uffff\1\66\5\uffff\1\66\27\uffff\1\66\3\uffff\1\66\6\uffff";
    static final String DFA4_minS =
        "\1\13\4\26\1\uffff\4\4\4\25\10\4\1\25\1\4\1\25\2\14\1\25\1\4\1\25"+
        "\2\14\1\25\1\4\3\25\1\4\3\25\1\16\2\4\1\25\2\4\1\16\1\25\2\4\1\25"+
        "\2\4\2\uffff\4\27\1\25\1\4\1\25\2\14\1\25\1\4\1\25\2\14\1\25\1\16"+
        "\2\4\1\25\1\16\2\4\4\27";
    static final String DFA4_maxS =
        "\1\40\4\26\1\uffff\4\4\4\26\1\27\1\5\1\27\1\5\1\27\1\4\1\27\1\4"+
        "\1\27\1\4\1\25\3\27\1\4\1\25\3\27\1\4\1\25\1\26\1\27\1\4\1\25\1"+
        "\26\2\27\2\5\1\27\2\5\3\27\1\5\2\27\1\5\2\uffff\5\27\1\4\1\25\3"+
        "\27\1\4\1\25\4\27\2\5\2\27\2\5\4\27";
    static final String DFA4_acceptS =
        "\5\uffff\1\2\60\uffff\1\1\1\3\32\uffff";
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
            "\1\52\1\53\11\uffff\1\51",
            "\1\52\1\53\11\uffff\1\51",
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
            "\4\67\1\66\4\uffff\1\66",
            "\1\71\1\70",
            "\1\71\1\70",
            "\1\34\1\uffff\1\35",
            "\1\73\1\72",
            "\1\73\1\72",
            "\4\67\1\66\4\uffff\1\66",
            "\1\41\1\uffff\1\42",
            "\1\74\20\uffff\1\75\1\uffff\1\76",
            "\1\100\1\77",
            "\1\45\1\uffff\1\46",
            "\1\101\20\uffff\1\102\1\uffff\1\103",
            "\1\105\1\104",
            "",
            "",
            "\1\51",
            "\1\51",
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
            "\4\67\1\66\4\uffff\1\66",
            "\1\117\1\116",
            "\1\117\1\116",
            "\1\102\1\uffff\1\103",
            "\4\67\1\66\4\uffff\1\66",
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
            return "817:1: rule__BoolExpr__Alternatives : ( ( ruleTemporalPredicate ) | ( ruleUnaryBoolExpr ) | ( ruleBinaryBoolExpr ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleKnowledge_in_entryRuleKnowledge60 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKnowledge67 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Knowledge__Group__0_in_ruleKnowledge94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule120 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__0_in_ruleRule154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDecl_in_entryRuleVarDecl180 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarDecl187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__0_in_ruleVarDecl214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntTerm_in_entryRuleIntTerm240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntTerm247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntTerm__Alternatives_in_ruleIntTerm274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntExpr_in_entryRuleIntExpr300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntExpr307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntExpr__Alternatives_in_ruleIntExpr334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryIntExpr_in_entryRuleBinaryIntExpr360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinaryIntExpr367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryIntExpr__Group__0_in_ruleBinaryIntExpr394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemporalPredicate_in_entryRuleTemporalPredicate420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemporalPredicate427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemporalPredicate__Alternatives_in_ruleTemporalPredicate454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolExpr_in_entryRuleBoolExpr480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolExpr487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolExpr__Alternatives_in_ruleBoolExpr514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryBoolExpr_in_entryRuleUnaryBoolExpr540 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryBoolExpr547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryBoolExpr__Alternatives_in_ruleUnaryBoolExpr574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryBoolExpr_in_entryRuleBinaryBoolExpr600 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinaryBoolExpr607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryBoolExpr__Group__0_in_ruleBinaryBoolExpr634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity660 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Alternatives_in_ruleEntity694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSort_in_entryRuleSort720 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSort727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sort__Group__0_in_ruleSort754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport780 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_in_entryRuleVar840 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVar847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Var__Group__0_in_ruleVar874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFluent_in_entryRuleFluent900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFluent907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group__0_in_ruleFluent934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent960 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__0_in_ruleEvent994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_entryRuleTerm1020 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerm1027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group__0_in_ruleTerm1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHoldsAt_in_entryRuleHoldsAt1080 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHoldsAt1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HoldsAt__Group__0_in_ruleHoldsAt1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHappens_in_entryRuleHappens1140 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHappens1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Happens__Group__0_in_ruleHappens1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitiates_in_entryRuleInitiates1200 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInitiates1207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Initiates__Group__0_in_ruleInitiates1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminates_in_entryRuleTerminates1260 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminates1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminates__Group__0_in_ruleTerminates1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePath_in_entryRulePath1320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePath1327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Path__Group__0_in_rulePath1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFile_in_entryRuleFile1380 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFile1387 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_rule__Knowledge__ImportsAssignment_0_in_rule__Knowledge__Group__02085 = new BitSet(new long[]{0x00000001FF480802L});
    public static final BitSet FOLLOW_rule__Knowledge__Group__1_in_rule__Knowledge__Group__02095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Knowledge__EntitiesAssignment_1_in_rule__Knowledge__Group__12123 = new BitSet(new long[]{0x00000001FD480802L});
    public static final BitSet FOLLOW_rule__Knowledge__Group__2_in_rule__Knowledge__Group__12133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Knowledge__Group_2__0_in_rule__Knowledge__Group__22161 = new BitSet(new long[]{0x00000001E4480802L});
    public static final BitSet FOLLOW_rule__Knowledge__Group__3_in_rule__Knowledge__Group__22171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Knowledge__VarsAssignment_3_in_rule__Knowledge__Group__32199 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Knowledge__RulesAssignment_2_0_in_rule__Knowledge__Group_2__02242 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Knowledge__Group_2__1_in_rule__Knowledge__Group_2__02251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Knowledge__Group_2__12280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__DeclAssignment_0_in_rule__Rule__Group__02319 = new BitSet(new long[]{0x00000001E0400800L});
    public static final BitSet FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__02329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__ExprAssignment_1_in_rule__Rule__Group__12357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__VarDecl__Group__02396 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__1_in_rule__VarDecl__Group__02406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__VarsAssignment_1_in_rule__VarDecl__Group__12434 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__2_in_rule__VarDecl__Group__12443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group_2__0_in_rule__VarDecl__Group__22471 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__3_in_rule__VarDecl__Group__22481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__VarDecl__Group__32510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__VarDecl__Group_2__02554 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VarDecl__Group_2__1_in_rule__VarDecl__Group_2__02564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__VarsAssignment_2_1_in_rule__VarDecl__Group_2__12592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryIntExpr__OprAssignment_0_in_rule__BinaryIntExpr__Group__02630 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__BinaryIntExpr__Group__1_in_rule__BinaryIntExpr__Group__02639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryIntExpr__BinaryopAssignment_1_in_rule__BinaryIntExpr__Group__12667 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__BinaryIntExpr__Group__2_in_rule__BinaryIntExpr__Group__12676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryIntExpr__OprAssignment_2_in_rule__BinaryIntExpr__Group__22704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryBoolExpr__Unaryop_lhsAssignment_0_0_in_rule__UnaryBoolExpr__Group_0__02744 = new BitSet(new long[]{0x00000001E0400800L});
    public static final BitSet FOLLOW_rule__UnaryBoolExpr__Group_0__1_in_rule__UnaryBoolExpr__Group_0__02753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryBoolExpr__OprAssignment_0_1_in_rule__UnaryBoolExpr__Group_0__12781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__UnaryBoolExpr__Group_1__02820 = new BitSet(new long[]{0x00000001E0400800L});
    public static final BitSet FOLLOW_rule__UnaryBoolExpr__Group_1__1_in_rule__UnaryBoolExpr__Group_1__02830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryBoolExpr__OpsAssignment_1_1_in_rule__UnaryBoolExpr__Group_1__12858 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__UnaryBoolExpr__Group_1__2_in_rule__UnaryBoolExpr__Group_1__12867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__UnaryBoolExpr__Group_1__22896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryBoolExpr__OprAssignment_0_in_rule__BinaryBoolExpr__Group__02937 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_rule__BinaryBoolExpr__Group__1_in_rule__BinaryBoolExpr__Group__02946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryBoolExpr__BinaryopAssignment_1_in_rule__BinaryBoolExpr__Group__12974 = new BitSet(new long[]{0x00000001E0400800L});
    public static final BitSet FOLLOW_rule__BinaryBoolExpr__Group__2_in_rule__BinaryBoolExpr__Group__12983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryBoolExpr__OprAssignment_2_in_rule__BinaryBoolExpr__Group__23011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Sort__Group__03052 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Sort__Group__1_in_rule__Sort__Group__03062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sort__NameAssignment_1_in_rule__Sort__Group__13090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Import__Group__03129 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__03139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__PathAssignment_1_in_rule__Import__Group__13167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Var__Group__03206 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Var__Group__1_in_rule__Var__Group__03216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Var__NameAssignment_1_in_rule__Var__Group__13244 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Var__Group__2_in_rule__Var__Group__13253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Var__MinAssignment_2_in_rule__Var__Group__23281 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Var__Group__3_in_rule__Var__Group__23290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Var__MaxAssignment_3_in_rule__Var__Group__33318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Fluent__Group__03361 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Fluent__Group__1_in_rule__Fluent__Group__03371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__TermAssignment_1_in_rule__Fluent__Group__13399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Event__Group__03438 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Event__Group__1_in_rule__Event__Group__03448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__TermAssignment_1_in_rule__Event__Group__13476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__NameAssignment_0_in_rule__Term__Group__03514 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__Term__Group__1_in_rule__Term__Group__03523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_1__0_in_rule__Term__Group__13551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Term__Group_1__03591 = new BitSet(new long[]{0x0000000000A00010L});
    public static final BitSet FOLLOW_rule__Term__Group_1__1_in_rule__Term__Group_1__03601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__ArgsAssignment_1_1_in_rule__Term__Group_1__13629 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_rule__Term__Group_1__2_in_rule__Term__Group_1__13639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_1_2__0_in_rule__Term__Group_1__23667 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_rule__Term__Group_1__3_in_rule__Term__Group_1__23677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Term__Group_1__33706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Term__Group_1_2__03750 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Term__Group_1_2__1_in_rule__Term__Group_1_2__03760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__ArgsAssignment_1_2_1_in_rule__Term__Group_1_2__13788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__HoldsAt__Group__03827 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__HoldsAt__Group__1_in_rule__HoldsAt__Group__03837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__HoldsAt__Group__13866 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__HoldsAt__Group__2_in_rule__HoldsAt__Group__13876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HoldsAt__FluentAssignment_2_in_rule__HoldsAt__Group__23904 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__HoldsAt__Group__3_in_rule__HoldsAt__Group__23913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__HoldsAt__Group__33942 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__HoldsAt__Group__4_in_rule__HoldsAt__Group__33952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HoldsAt__TimeAssignment_4_in_rule__HoldsAt__Group__43980 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__HoldsAt__Group__5_in_rule__HoldsAt__Group__43989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__HoldsAt__Group__54018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Happens__Group__04066 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Happens__Group__1_in_rule__Happens__Group__04076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Happens__Group__14105 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Happens__Group__2_in_rule__Happens__Group__14115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Happens__EventAssignment_2_in_rule__Happens__Group__24143 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Happens__Group__3_in_rule__Happens__Group__24152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Happens__Group__34181 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Happens__Group__4_in_rule__Happens__Group__34191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Happens__TimeAssignment_4_in_rule__Happens__Group__44219 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Happens__Group__5_in_rule__Happens__Group__44228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Happens__Group__54257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Initiates__Group__04305 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Initiates__Group__1_in_rule__Initiates__Group__04315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Initiates__Group__14344 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Initiates__Group__2_in_rule__Initiates__Group__14354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Initiates__EventAssignment_2_in_rule__Initiates__Group__24382 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Initiates__Group__3_in_rule__Initiates__Group__24391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Initiates__Group__34420 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Initiates__Group__4_in_rule__Initiates__Group__34430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Initiates__FluentAssignment_4_in_rule__Initiates__Group__44458 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Initiates__Group__5_in_rule__Initiates__Group__44467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Initiates__Group__54496 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Initiates__Group__6_in_rule__Initiates__Group__54506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Initiates__TimeAssignment_6_in_rule__Initiates__Group__64534 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Initiates__Group__7_in_rule__Initiates__Group__64543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Initiates__Group__74572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Terminates__Group__04624 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Terminates__Group__1_in_rule__Terminates__Group__04634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Terminates__Group__14663 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Terminates__Group__2_in_rule__Terminates__Group__14673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminates__EventAssignment_2_in_rule__Terminates__Group__24701 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Terminates__Group__3_in_rule__Terminates__Group__24710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Terminates__Group__34739 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Terminates__Group__4_in_rule__Terminates__Group__34749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminates__FluentAssignment_4_in_rule__Terminates__Group__44777 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Terminates__Group__5_in_rule__Terminates__Group__44786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Terminates__Group__54815 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Terminates__Group__6_in_rule__Terminates__Group__54825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminates__TimeAssignment_6_in_rule__Terminates__Group__64853 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Terminates__Group__7_in_rule__Terminates__Group__64862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Terminates__Group__74891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Path__FileAssignment_0_in_rule__Path__Group__04942 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__Path__Group__1_in_rule__Path__Group__04951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Path__Group_1__0_in_rule__Path__Group__14979 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_rule__Path__Group_1__05019 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Path__Group_1__1_in_rule__Path__Group_1__05029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Path__FileAssignment_1_1_in_rule__Path__Group_1__15057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__NameAssignment_0_in_rule__File__Group__05095 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__File__Group__1_in_rule__File__Group__05104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group_1__0_in_rule__File__Group__15132 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_rule__File__Group_1__05172 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__File__Group_1__1_in_rule__File__Group_1__05182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__NameAssignment_1_1_in_rule__File__Group_1__15210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Knowledge__ImportsAssignment_05248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__Knowledge__EntitiesAssignment_15279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_rule__Knowledge__RulesAssignment_2_05310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_in_rule__Knowledge__VarsAssignment_35341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDecl_in_rule__Rule__DeclAssignment_05372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolExpr_in_rule__Rule__ExprAssignment_15403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VarDecl__VarsAssignment_15438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VarDecl__VarsAssignment_2_15477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IntTerm__ConstAssignment_05512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__IntTerm__VarAssignment_15547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntTerm_in_rule__BinaryIntExpr__OprAssignment_05582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryIntOp_in_rule__BinaryIntExpr__BinaryopAssignment_15613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntTerm_in_rule__BinaryIntExpr__OprAssignment_25644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryBoolOp_in_rule__UnaryBoolExpr__Unaryop_lhsAssignment_0_05675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolExpr_in_rule__UnaryBoolExpr__OprAssignment_0_15706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolExpr_in_rule__UnaryBoolExpr__OpsAssignment_1_15737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemporalPredicate_in_rule__BinaryBoolExpr__OprAssignment_05768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryBoolOp_in_rule__BinaryBoolExpr__BinaryopAssignment_15799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolExpr_in_rule__BinaryBoolExpr__OprAssignment_25830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Sort__NameAssignment_15861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePath_in_rule__Import__PathAssignment_15892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Var__NameAssignment_15923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Var__MinAssignment_25954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Var__MaxAssignment_35985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_rule__Fluent__TermAssignment_16016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_rule__Event__TermAssignment_16047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Term__NameAssignment_06078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Term__ArgsAssignment_1_16109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Term__ArgsAssignment_1_2_16140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_rule__HoldsAt__FluentAssignment_26171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntExpr_in_rule__HoldsAt__TimeAssignment_46202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_rule__Happens__EventAssignment_26233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntExpr_in_rule__Happens__TimeAssignment_46264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_rule__Initiates__EventAssignment_26295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_rule__Initiates__FluentAssignment_46326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntExpr_in_rule__Initiates__TimeAssignment_66357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_rule__Terminates__EventAssignment_26388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_rule__Terminates__FluentAssignment_46419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntExpr_in_rule__Terminates__TimeAssignment_66450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFile_in_rule__Path__FileAssignment_06481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFile_in_rule__Path__FileAssignment_1_16512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__File__NameAssignment_06543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__File__NameAssignment_1_16574 = new BitSet(new long[]{0x0000000000000002L});

}